package nl.tudelft.parser;

import nl.tudelft.processing.CosineSimilarity;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

/**
 * @author Giovanni Grano
 * This class stores the information needed to compute the cosine similarity. We do this instead of having every
 * time the computation of the occurrences from the raw string.
 */
public class TermsOccurrences implements Serializable {

    private static final long serialVersionUID = -5702248493222158840L;

    private String name;
    private String textContent;
    private Map<String, Integer> occurrences;
    private CosineSimilarity cosineSimilarity;
    private int numberParameters;

    public TermsOccurrences(String name, String textContent) {
        this.name = name;
        this.textContent = textContent;
        this.cosineSimilarity = new CosineSimilarity();
        computeOccurrences();
    }

    public TermsOccurrences(MethodBean methodBean) {
        this.name = methodBean.getName();
        this.textContent = methodBean.getTextContent();
        this.cosineSimilarity = new CosineSimilarity();
        this.numberParameters = methodBean.getParameters().size();
        computeOccurrences();
    }

    public int getNumberParameters() {
        return numberParameters;
    }

    public String getName() { return this.name; }

    public String getTextContent() { return this.textContent; }

    private void computeOccurrences() {
        occurrences = new HashMap<>();
        String[] splits = cosineSimilarity.normalize(textContent);
        for (String word: splits)
            if (occurrences.containsKey(word))
                occurrences.put(word, occurrences.get(word)+1);
            else
                occurrences.put(word, 1);
    }

    public Map<String, Integer> getOccurrences() {
        if (occurrences == null)
            computeOccurrences();
        return occurrences;
    }

    @Override
    public boolean equals(Object obj) {

        if (this==obj)
            return true;

        if (obj == null || obj.getClass() != this.getClass())
            return false;

        TermsOccurrences compared = ((TermsOccurrences)obj);

        if (name.equals(compared.getName())) {
            return true;
        }
        return false;
    }

    @Override
    public int hashCode() {
        return this.textContent.hashCode();
    }
}
