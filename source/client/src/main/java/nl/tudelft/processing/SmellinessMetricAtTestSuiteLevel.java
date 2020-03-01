package nl.tudelft.processing;

import nl.tudelft.parser.TermsOccurrences;

import java.util.List;

public class SmellinessMetricAtTestSuiteLevel {

	/**
	 * Coupling between test method (CBTM) computing the cosine similarity between a test and all the other
	 * tests in the population
	 * @param method
	 * @param testSuite
	 * @return
	 */
	public double computeSmelliness(TermsOccurrences method, List<TermsOccurrences> testSuite) {
		CosineSimilarity cosineSimilarity = new CosineSimilarity();

		int comparisons = 0;
		Double smelliness = 0.0;

		for (TermsOccurrences individual: testSuite) {
			smelliness += cosineSimilarity.computeSimilarity(method.getOccurrences(),
					individual.getOccurrences());
			comparisons++;
		}

		smelliness = (smelliness/comparisons);

		if (smelliness.isNaN()) {
			return 0.0;
		} else if(smelliness.isInfinite()) {
			return 0.0;
		} else return smelliness;
	}
}

