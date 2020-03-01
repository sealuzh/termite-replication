package org.evosuite.ga.metaheuristics.mosa;

import org.evosuite.ga.Chromosome;
import org.evosuite.ga.FitnessFunction;
import nl.tudelft.api.SmellinessDetector;
import nl.tudelft.parser.TermsOccurrences;
import org.evosuite.testcase.TestChromosome;
import org.evosuite.utils.Randomness;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

/**
 * Version of the ranking using the quality based preference sorting defined in the paper:
 * Automatic Test Case Generation: What If Code Quality Matters? by Palomba et.al.
 *
 * @author Giovanni Grano
 */
public class QualityBasedPreferenceSorting<T extends Chromosome> extends RankBasedPreferenceSorting<T> {

    private SmellinessDetector smellinessDetector;

    private static final Logger logger = LoggerFactory.getLogger(QualityBasedPreferenceSorting.class);

    public QualityBasedPreferenceSorting(SmellinessDetector detector) {
        this.smellinessDetector = detector;
    }

    @Override
    public void computeRankingAssignment(List<T> solutions, Set<FitnessFunction<T>> uncovered_goals) {

        int couplingCalls = 0;
        for (int i = 0; i < solutions.size(); i++) {
            TestChromosome testChromosome = (TestChromosome) solutions.get(i);

            /** if the process map is null or the chromosome is changed, recompute the occurrence map */
            checkAndCompute(testChromosome);
            TermsOccurrences termsOccurrences = testChromosome.getTermsOccurrences();

            List<TermsOccurrences> testSuiteCode = new ArrayList<>();
            for (int j=0; j < solutions.size(); j++) {
                if (j != i) {
                    TestChromosome aux = (TestChromosome) solutions.get(j);
                    couplingCalls += checkAndCompute(aux); // it should be always computed (by computeFitness)
                    testSuiteCode.add(aux.getTermsOccurrences());
                }
            }

            /** avoid to recalculate the cohesion (if already calculated). Does it if the chromosome is changed */
            double cohesion = testChromosome.getCohesion();
            if (Double.isNaN(cohesion) || testChromosome.isChanged())
                cohesion = smellinessDetector.evaluateCohesion(testChromosome.getTestCase().toCode());

            double coupling = smellinessDetector.evaluateCoupling(termsOccurrences, testSuiteCode);
            testChromosome.setQuality(cohesion, coupling);
        }
        logger.debug("Coupling computed " + couplingCalls + " for population of size " + solutions.size());
        super.computeRankingAssignment(solutions, uncovered_goals);
    }

    /**
     * Checks whether the map for the term occurrences should be computed again for this chromosome.
     * In case the {@link TermsOccurrences} is null of the test is changed, it re-compute the occurrences
     */
    private int checkAndCompute(TestChromosome method) {
        if (method.getTermsOccurrences() == null || method.isChanged()) {
            method.computeOccurrencesMap();
            return 1;
        }
        return 0;
    }

    @Override
    @SuppressWarnings("Duplicates")
    protected List<T> getZeroFront(List<T> solutionSet, Set<FitnessFunction<T>> uncovered_goals) {
        Set<T> zero_front = new LinkedHashSet<>(solutionSet.size());
        for (FitnessFunction<T> f : uncovered_goals){
            QualityPreferenceSortingComparator<T> comparator
                    = new QualityPreferenceSortingComparator<>(f);

            T best = null;
            for (T test : solutionSet){
                int flag = comparator.compare(test, best);
                if (flag == -1 || (flag == 0  && Randomness.nextBoolean())){
                    best = test;
                }
            }
            zero_front.add(best);
        }
        List<T> list = new ArrayList<>(zero_front.size());
        list.addAll(zero_front);
        return list;
    }
}
