package nl.tudelft.processing;

import nl.tudelft.parser.TermsOccurrences;

import java.util.ArrayList;
import java.util.List;

public class SmellinessMetricAtTestCaseLevel {

	/**
	 * Computes the LCTM (Lack of Cohesion of a Test Method) as the average similarity between its
	 * constituent methods
	 * @param methods the list of {@link TermsOccurrences} that stores the map of terms occurrences
	 * @return the value of the metric
	 */
	public double computeSmelliness(List<TermsOccurrences> methods) {
		if (methods.isEmpty())
			return 0.0;

		int comparisons = 0;
		Double smelliness = 0.0;

		CosineSimilarity cosineSimilarity = new CosineSimilarity();
		for (int i = 0; i < methods.size(); i ++)
			for (int j = 0; j < methods.size(); j++)
				if (j!=i) {
					smelliness += cosineSimilarity.computeSimilarity(methods.get(i).getOccurrences(),
							methods.get(j).getOccurrences());
					comparisons++;
				}

		smelliness = 1 - (smelliness/comparisons);

		if (smelliness.isNaN()) {
			return 0.0;
		} else if(smelliness.isInfinite()) {
			return 0.0;
		} else return smelliness;
	}

	public double computeSmelliness(String pTestCase) {
		CosineSimilarity cosineSimilarity = new CosineSimilarity();
		String[] blocks = pTestCase.split("_____");
		ArrayList<String> filteredBlocks = new ArrayList<>();
		Double smelliness=0.0;

		for(int k=0; k<blocks.length;k++) {
			if(! blocks[k].isEmpty()) {
				filteredBlocks.add(blocks[k]);
			}
		}

		if(filteredBlocks.size() == 1) {
			return 0.0;
		}

		int comparison = 0;

		for(int k=0; k<filteredBlocks.size(); k++) {
			for(int i=1; i<filteredBlocks.size(); i++) {

				String[] document1 = new String[2];
				document1[0] = "block_"+k;

				String[] document2 = new String[2];
				document2[0] = "block_"+i;

				document1[1] = filteredBlocks.get(k);
				document2[1] = filteredBlocks.get(i);

				smelliness+=cosineSimilarity.computeSimilarity(document1, document2);
				comparison++;
			}
		}

		smelliness = 1 - (smelliness/comparison);

		if (smelliness.isNaN()) {
			return 0.0;
		} else if(smelliness.isInfinite()) {
			return 0.0;
		} else return smelliness;

	}
}
