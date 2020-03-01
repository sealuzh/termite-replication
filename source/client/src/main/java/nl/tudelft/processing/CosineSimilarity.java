package nl.tudelft.processing;

import java.io.Serializable;
import java.util.*;

import nl.tudelft.parser.TermsOccurrences;
import nl.tudelft.parser.ClassBean;
import nl.tudelft.parser.MethodBean;

public class CosineSimilarity implements Serializable {

	private static final long serialVersionUID = -1003522369177593501L;

	private String[] stopWordList;

	public CosineSimilarity() {
		this.stopWordList = StopWords.stopwords;
	}

	public ClassBean preprocess(ClassBean pClassBean) {
		ArrayList<MethodBean> normalizedMethodBeans = new ArrayList<>();
		
		for(MethodBean methodBean : pClassBean.getMethods()) {
			TermsOccurrences method = new TermsOccurrences(methodBean);
			pClassBean.addProcessedMethod(method);
		}

//		pClassBean.setMethods(normalizedMethodBeans);
		return pClassBean;
		
	}

	/**
	 * Computes the cosine similarity given two maps of †erms occurrences
	 * @param mapOne the occurrences for the first document
	 * @param mapTwo the occurrences for the second document.
	 * @return
	 */
	public double computeSimilarity(Map<String, Integer> mapOne, Map<String, Integer> mapTwo) {
		return computeCosineSimilarity(mapOne, mapTwo);
	}

	public double computeSimilarity(String[] pDocumentOne, String[] pDocumentTwo)  {
		Map<String, Integer> featureOne = countOccurrences(pDocumentOne);
		Map<String, Integer> featureTwo = countOccurrences(pDocumentTwo);
		return computeCosineSimilarity(featureOne, featureTwo);

	}

	private Map<String, Integer> countOccurrences(String[] pDocument) {
		Map<String, Integer> terms = new HashMap<>();
		String[] initialWords = pDocument[1].split(" ");

		for(String word: initialWords) {

			if(! terms.containsKey(word)) {
				terms.put(word, 1);
			} else {
				terms.put(word, terms.get(word) + 1);
			}
		}
		return terms;
	}

	public String[] normalize(String methodContent) {
		Vector<String> finalWords=new Vector<>();

		methodContent = splitCamelCase(methodContent);
		methodContent = methodContent.toLowerCase();

		methodContent = deleteAllSymbols(methodContent);
		methodContent = methodContent.replaceAll("[0-9]+", "");
		
		String[] newDoc = methodContent.split(" ");

		for(String s: newDoc) 
			s.replaceAll(" ", "");

		newDoc = deleteAllWhiteSpaces(newDoc);

		for(String word: newDoc) {
			if(word.length() > 1)
				finalWords.add(word);
		}

		for(String stopWord: this.stopWordList)
			for(String word: newDoc)
				if(stopWord.equals(word))
					finalWords.remove(word);

		return finalWords.toArray(new String[finalWords.size()]);
	}

	private String splitCamelCase(String s) {
		return s.replaceAll(String.format("%s|%s|%s",
				"(?<=[A-Z])(?=[A-Z][a-z])", "(?<=[^A-Z])(?=[A-Z])",
				"(?<=[A-Za-z])(?=[^A-Za-z])"), " ");
	}

	private String[] deleteAllWhiteSpaces(String[] pArray) {
		Vector<String> newVector=new Vector<>();

		for(String s: pArray) {
			if(! s.isEmpty()) 
				newVector.add(s);
		}

		String[] words = new String[newVector.size()];
		for(int k=0; k<newVector.size(); k++)
			words[k] = newVector.get(k);

		return words;
	}

	private String deleteAllSymbols(String s) {
		s = s.replaceAll("\\(", " ");
		s = s.replaceAll("\\)", " ");
		s = s.replaceAll("\\[", " ");
		s = s.replaceAll("\\]", " ");
		s = s.replaceAll("\\{", " ");
		s = s.replaceAll("\\}", " ");
		s = s.replaceAll("\\=", " ");
		s = s.replaceAll("\\/", " ");
		s = s.replaceAll("\\+", " ");
		s = s.replaceAll("\\-", " ");
		s = s.replaceAll("\\*", " ");
		s = s.replaceAll("\\_", " ");
		s = s.replaceAll("\\%", " ");
		s = s.replaceAll("\\!", " ");
		s = s.replaceAll("\\;", " ");
		s = s.replaceAll("\\,", " ");
		s = s.replaceAll("\\.", " ");
		s = s.replaceAll("\"", " ");
		s = s.replaceAll("\\:", " ");
		s = s.replaceAll("\\<", " ");
		s = s.replaceAll("\\>", " ");
		s = s.replaceAll("\\'", " ");
		s = s.replaceAll("\\@", " ");
		s = s.replaceAll("\\n", " ");

		return s;
	}

	private Double computeCosineSimilarity(Map<String, Integer> firstFeatures, Map<String, Integer> secondFeatures) {
		Double similarity;
		Double sum = 0.0;    // the numerator of the cosine similarity
		Double fNorm;        // the first part of the denominator of the cosine similarity
		Double sNorm;        // the second part of the denominator of the cosine similarity
		Set<String> fKeys = firstFeatures.keySet();
		Iterator<String> fit = fKeys.iterator();
		while (fit.hasNext()) {
			String featureName = fit.next();
			boolean containKey = secondFeatures.containsKey(featureName);
			if (containKey) {
				sum = sum + firstFeatures.get(featureName) * secondFeatures.get(featureName);
			}
		}

		fNorm = calculateNorm(firstFeatures);
		sNorm = calculateNorm(secondFeatures);
		similarity = sum / (fNorm * sNorm);

		return similarity;
	}

	private static Double calculateNorm(Map<String, Integer> feature) {
		Double norm = 0.0;
		Set<String> keys = feature.keySet();
		Iterator<String> it = keys.iterator();
		while (it.hasNext()) {
			String featureName = it.next();
			norm = norm + Math.pow(feature.get(featureName), 2);
		}
		return Math.sqrt(norm);
	}
}
