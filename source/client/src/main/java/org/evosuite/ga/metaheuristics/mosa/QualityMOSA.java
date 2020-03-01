package org.evosuite.ga.metaheuristics.mosa;

import org.evosuite.Properties;
import org.evosuite.ga.Chromosome;
import org.evosuite.ga.ChromosomeFactory;
import org.evosuite.ga.FitnessFunction;
import org.evosuite.ga.metaheuristics.mosa.comparators.OnlyCrowdingComparator;
import nl.tudelft.api.SmellinessDetector;
import nl.tudelft.parser.TermsOccurrences;
import org.evosuite.testcase.TestChromosome;
import org.evosuite.testcase.TestFitnessFunction;
import org.evosuite.utils.LoggingUtils;
import org.slf4j.LoggerFactory;

import java.util.*;

import org.slf4j.Logger;

/**
 * Implements the quality based approach described in the paper
 * Automatic Test Case Generation: What If Code Quality Matters? by Palomba et.al.
 *
 * @author Giovanni Grano
 */
public class QualityMOSA<T extends Chromosome> extends MOSA<T>  {

    private static final Logger logger = LoggerFactory.getLogger(QualityMOSA.class);
    private SmellinessDetector smellinessDetector;
    private int counterMapOccurrences;
    private int counterUpdateArchive;

    public QualityMOSA(ChromosomeFactory<T> factory) {
        super(factory);
        String sourcePath = Properties.SOURCE_PATH;
        LoggingUtils.getEvoLogger().info("Production Code Path: " + sourcePath);
        if (sourcePath == "")
            throw new RuntimeException("To run qMOSA you need to specify a source path via the argument -DsourcePath");
        smellinessDetector = new SmellinessDetector(sourcePath);
        ranking = new QualityBasedPreferenceSorting<>(smellinessDetector);
        LoggingUtils.getEvoLogger().info("Ranking Type: " + ranking.getClass().getName());

    }

    /** {@inheritDoc} */
    @Override
    @SuppressWarnings("Duplicates")
    protected void evolve() {
        List<T> offspringPopulation = breedNextGeneration();

        // Create the union of parents and offSpring
        List<T> union = new ArrayList<>();
        union.addAll(population);
        union.addAll(offspringPopulation);

        // Ranking the union
        logger.debug("Union Size =" + union.size());
        // Ranking the union using the best rank algorithm (modified version of the non dominated sorting algorithm
        long startTime = System.nanoTime();
        ranking.computeRankingAssignment(union, uncoveredGoals);
        long endTime = System.nanoTime();
        long timeElapsed = endTime-startTime;
        logger.debug("Time for compute ranking = " + timeElapsed);

        int remain = population.size();
        int index = 0;
        List<T> front;
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
            } // if
        } // while

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
        logger.debug("Times for map update = " + counterMapOccurrences);
        logger.debug("Times for update archive = " + counterMapOccurrences);
        counterMapOccurrences = 0;
        counterUpdateArchive = 0;
    }

    /**
     * Computes the coupling respect to the archive for the given candidate solution and the cohesion
     * @param candidate the candidate solution
     * @return a array of size == 2 where the first element is the cohesion and the second one is the coupling
     */
    private double[] getCouplingToArchive(TestChromosome candidate) {
        TermsOccurrences occurrences = candidate.getTermsOccurrences();
        List<TermsOccurrences> archiveProcessed = new ArrayList<>();
        for (T archived: archive.values())
            archiveProcessed.add(((TestChromosome)archived).getTermsOccurrences());
        double cohesion = candidate.getCohesion();
        if (Double.isNaN(cohesion)) {
            cohesion = smellinessDetector.evaluateCohesion(candidate.getTestCase().toCode());
            candidate.setCohesion(cohesion);
        }
        return new double[]{cohesion, smellinessDetector.evaluateCoupling(occurrences, archiveProcessed)};
    }

    @Override
    protected void calculateFitness(T c) {
        /** computes the map of the terms occurrences if null */
        TestChromosome chromosome = ((TestChromosome)c);
        if (chromosome.getTermsOccurrences() == null) {
            chromosome.computeOccurrencesMap();
            counterMapOccurrences++;
        }
        super.calculateFitness(c);
        // reset quality to archive equals to NaN
        chromosome.setArchiveCoupling(Double.NaN);
    }

    @Override
    protected void updateArchive(T solution, FitnessFunction<T> covered) {
        TestChromosome chromosome = (TestChromosome) solution;
        chromosome.getTestCase().getCoveredGoals().add((TestFitnessFunction) covered);

        if (archive.containsKey(covered)) {
            this.counterUpdateArchive ++;
            /** we compute the quality respect to the archive only once **/
            if (Double.isNaN(chromosome.getArchiveCoupling())) {
                double[] quality = getCouplingToArchive(chromosome);
                chromosome.setArchiveCoupling(quality[1]);
            }

            /** we compute the quality of the existing solution in respect to the rest of the archive */
            TestChromosome existingSolution = (TestChromosome) this.archive.get(covered);
            TermsOccurrences occurrences = existingSolution.getTermsOccurrences();
            List<TermsOccurrences> archiveOccurrences = new ArrayList<>();
            for (T elem: archive.values())
                if (!existingSolution.equals(elem))
                    archiveOccurrences.add(((TestChromosome)elem).getTermsOccurrences());
            double coupling = smellinessDetector.evaluateCoupling(occurrences, archiveOccurrences);
            double qualityCandidate = 0.5 * solution.getCohesion() + 0.5 * solution.getArchiveCoupling();
            double qualityArchive = 0.5 * existingSolution.getCohesion() + 0.5 * coupling;

            if (qualityCandidate < qualityArchive) {
                this.archive.put(covered, solution);
            }
        } else {
            archive.put(covered, solution);
            this.uncoveredGoals.remove(covered);
        }
    }
}
