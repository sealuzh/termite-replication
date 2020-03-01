package org.evosuite.ga.metaheuristics.mosa;

import org.evosuite.Properties;
import org.evosuite.ga.Chromosome;
import org.evosuite.ga.ChromosomeFactory;
import org.evosuite.ga.ConstructionFailedException;
import org.evosuite.ga.FitnessFunction;
import org.evosuite.ga.metaheuristics.mosa.comparators.OnlyCrowdingComparator;
import org.evosuite.ga.metaheuristics.mosa.comparators.TestQualityComparator;
import org.evosuite.testcase.TestCase;
import org.evosuite.testcase.TestChromosome;
import org.evosuite.testcase.TestFitnessFunction;
import org.evosuite.testcase.statements.Statement;
import org.evosuite.testcase.variable.VariableReference;
import org.evosuite.utils.LoggingUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.*;
import java.util.stream.Collectors;

public class ReadabilityMOSA<T extends Chromosome> extends MOSA<T> {

    private static final Logger logger = LoggerFactory.getLogger(ReadabilityMOSA.class);

    private Comparator<TestChromosome> comparator;
    private double lastEntropy;

    public ReadabilityMOSA(ChromosomeFactory<T> factory) {
        super(factory);
        if (Properties.RANKING_TYPE == Properties.RankingType.ENTROPY_SORTING) {
            ranking = new EntropyBasedPreferenceSorting<>();
            comparator = new TestQualityComparator();
        } else {
            comparator = new Comparator<TestChromosome>() {
                @Override
                public int compare(TestChromosome chromosome, TestChromosome t1) {
                    return Integer.compare(chromosome.size(), t1.size());
                }
            };
        }
        lastEntropy = 0.0;
        LoggingUtils.getEvoLogger().info("Ranking Type: " + ranking.getClass().getName());
    }

    /**
     * {@inheritDoc}
     */
    @Override
    @SuppressWarnings("Duplicates")
    protected void evolve() {
        List<T> offspringPopulation = this.breedNextGeneration();
        // Create the union of parents and offSpring
        List<T> union = new ArrayList<>();
        union.addAll(population);
        union.addAll(offspringPopulation);

        // reverse by entropy
        Comparator<TestChromosome> chromosomeByEntropy = Comparator.comparing(TestChromosome::getEntropy).reversed();
        offspringPopulation.sort((Comparator<? super T>) chromosomeByEntropy);

        int cutOff = SliceManager.getCutOff(union.size());

        if (Properties.SLICING) {
            double currentEntropy = population.stream().mapToDouble(t -> ((TestChromosome)t).getEntropy()).average().getAsDouble();
            double deltaEntropy = currentEntropy - lastEntropy;
            lastEntropy = currentEntropy;
            logger.debug("Delta Entropy = " + deltaEntropy);
            if ((!Properties.SLICING_DELTA) || (Properties.SLICING_DELTA && deltaEntropy > 0)) {
                logger.debug("Executing slicing");
                List<T> slicePopulation = new ArrayList<>();
                for (int i = 0; i < cutOff; i++) {
                    TestChromosome testChromosome = (TestChromosome) union.get(i);
                    if (testChromosome.isFromSlicing() == 1) {
                        continue;
                    }

                    Collection<Slice> slices = getAllMasterSlices(testChromosome.getTestCase());

                    slices.forEach(slice -> slice.getStatementsOfSlice().sort(Comparator.comparingInt(Statement::getPosition)));
                    for (Slice s : slices) {
                        TestChromosome toAdd;
                        try {
                            toAdd = testChromosome.getTestChromosomeFromSlice(s);
                            toAdd.setFromSlicing(true);
                            T sliceChromosome = (T) toAdd;
                            calculateFitness(sliceChromosome);
                            slicePopulation.add(sliceChromosome);
                        } catch (ConstructionFailedException e) {
                        }
                    }
                }
                union.addAll(slicePopulation);
            }
        }

        // Ranking the union
        logger.debug("Union Size =" + union.size());
        // Ranking the union using the best rank algorithm (modified version of the non dominated sorting algorithm
        ranking.computeRankingAssignment(union, uncoveredGoals);

        // add to the archive the new covered goals (and the corresponding test cases)
        //this.archive.putAll(ranking.getNewCoveredGoals());

        int remain = population.size();
        int index = 0;
        List<T> front = null;
        population.clear();

        // Obtain the next front
        front = ranking.getSubfront(index);

        while ((remain > 0) && (remain >= front.size()) && !front.isEmpty()) {
            // Assign crowding distance to individuals
            distance.fastEpsilonDominanceAssignment(front, uncoveredGoals);

            // Add the individuals of this front
            population.addAll(front);

            // Decrement remain
            remain = remain - front.size();

            // Obtain the next front
            index++;
            if (remain > 0) {
                front = ranking.getSubfront(index);
            }
        }

        // Remain is less than front(index).size, insert only the best one
        if (remain > 0 && !front.isEmpty()) { // front contains individuals to insert
            distance.fastEpsilonDominanceAssignment(front, uncoveredGoals);
            Collections.sort(front, new OnlyCrowdingComparator());
            for (int k = 0; k < remain; k++) {
                population.add(front.get(k));
            } // for

            remain = 0;
        } // if
        currentIteration++;
    }

    /**
     * This method update the archive by adding test cases that cover new test goals, or replacing the old
     * tests if the new ones are lower in term of coverage entropy (defined in the actual work), at the same
     * level of coverage
     * Looking at Hassan 2009, we can take the simpler definition of entropy of a change, adapting it to the
     * coverage! More formally:
     * C = {m1, m2, ..., mn} is a class with n methods.
     * Tc is a test case that target such a class
     * We define the entropy of a Tc, i.e., H(Tc) = - sum_i=i to n (cov(mi)/cov(c) * log2 (cov(mi)/cov(c))
     *
     * @param newSolution a candidate solution
     * @param covered     the already covered fitness values
     */
    protected void updateArchive(T newSolution, FitnessFunction<T> covered) {
        TestChromosome newSolutionTestChromosome = (TestChromosome) newSolution;
        newSolutionTestChromosome.getTestCase().getCoveredGoals().add((TestFitnessFunction) covered);
        // store the test cases that are optimal for the test goal in the
        // archive
        if (archive.containsKey(covered)) {
            TestChromosome existingSolutionTestChromosome = (TestChromosome) this.archive.get(covered);
            // if the new solution is better (based on secondary criterion), then the archive must be updated

            if (comparator.compare(newSolutionTestChromosome, existingSolutionTestChromosome) < 0)
                archive.put(covered, newSolution);
        } else {
            ((TestChromosome) newSolution).getEntropy();
            archive.put(covered, newSolution);
            this.uncoveredGoals.remove(covered);
        }
    }

    public Collection<Slice> getAllMasterSlices(TestCase testCase) {
        Set<Slice> masterSlices = new HashSet<>();
        Set<Slice> breadcrumbSlices = new HashSet<>();

        Set<VariableReference> masterVariables = new HashSet<>();
        Map<VariableReference, Slice> definerSlices = new HashMap<>();

        for (Statement statement : testCase) {
            VariableReference defined = statement.getReturnValue();

            Set<Slice> dependencies = new HashSet<>();

            for (VariableReference variableReference : statement.getUniqueVariableReferences()) {
                if (variableReference.equals(defined))
                    continue;

                if (!definerSlices.containsKey(variableReference))
                    return masterSlices;
                dependencies.add(definerSlices.get(variableReference));
            }

            if (defined.getClassName().equals(Properties.TARGET_CLASS)) {
                // Add master slice

                Slice masterSlice = new Slice();
                masterSlice.merge(dependencies);
                masterSlice.addStatementToSlice(statement);
                // Injects all the dependencies in a new master slice

                // Adds the statement and adds it to the set of master slices
                definerSlices.put(defined, masterSlice);

                masterSlices.add(masterSlice);
                masterVariables.add(defined);
            } else {
                Slice newSlice = new Slice();
                newSlice.merge(dependencies);
                newSlice.addStatementToSlice(statement);

                for (Statement sliceStatement : newSlice.getStatementsOfSlice()) {
                    definerSlices.put(sliceStatement.getReturnValue(), newSlice);
                }

                if (statement.getUniqueVariableReferences().stream().anyMatch(masterVariables::contains)) {
                    breadcrumbSlices.addAll(dependencies.stream().filter(masterSlices::contains).collect(Collectors.toSet()));

                    masterSlices.removeAll(dependencies);
                    masterSlices.add(newSlice);
                }
            }
        }

        masterSlices.addAll(breadcrumbSlices);
        return processSlices(masterSlices, testCase);
    }

    /**
     * Removes slices of size 1 and the slices with the same size as the original TC
     * @param slices
     * @param testCase
     * @return
     */
    private List<Slice> processSlices(Set<Slice> slices, TestCase testCase) {
        List<Slice> filter = slices.stream()
                .filter(slice -> slice.getStatementsOfSlice().size() != testCase.size())
                .filter(slice -> slice.getStatementsOfSlice().size() > 1)
                .collect(Collectors.toList());
        return filter;
    }

    /**
     * todo: add javadoc
     *
     * @param s1
     * @param s2
     * @return
     */
    public boolean isVRContained(Statement s1, Statement s2) {

        boolean isVRContained = false;
        VariableReference v = s1.getUniqueVariableReferences().get(0);

        if (s2.getUniqueVariableReferences().contains(v)) {
            isVRContained = true;
        }
        return isVRContained;
    }
}
