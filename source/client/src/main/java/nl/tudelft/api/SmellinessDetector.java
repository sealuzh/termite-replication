package nl.tudelft.api;

import java.io.IOException;
import java.util.*;

import nl.tudelft.parser.*;
import nl.tudelft.processing.CosineSimilarity;
import nl.tudelft.processing.FileUtility;
import nl.tudelft.processing.SmellinessMetricAtTestCaseLevel;
import nl.tudelft.processing.SmellinessMetricAtTestSuiteLevel;
import org.eclipse.jdt.core.dom.CompilationUnit;
import org.eclipse.jdt.core.dom.TypeDeclaration;

import org.evosuite.ga.metaheuristics.mosa.QualityMOSA;
import org.evosuite.testcase.TestChromosome;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Entry point the smelliness analysis;
 * Originally implemented by Fabio Palomba for the paper 'Automatic Test Case Generation: What is Test Code Quality
 * Matters?'
 */
public class SmellinessDetector {

    private static final Logger logger = LoggerFactory.getLogger(QualityMOSA.class);
    private ClassBean productionClass;
    private Map<String, TermsOccurrences> occurrencesMap = new HashMap<>();

    public SmellinessDetector(String pProductionClassPath) {
        CodeParser parser = new CodeParser();
        CosineSimilarity preProcessing = new CosineSimilarity();
        CompilationUnit compilationUnit;
        try {
            compilationUnit = parser.createParser(FileUtility.readFile(pProductionClassPath));

            if(compilationUnit.types().size() > 0) {
                TypeDeclaration typeDeclaration = (TypeDeclaration)compilationUnit.types().get(0);
                Vector<String> imports = new Vector<>();

                productionClass = ClassParser.parse(typeDeclaration, "src", imports);
                productionClass = preProcessing.preprocess(productionClass);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     *
     * Method that allows to evaluate the textual cohesion of a given test method.
     *
     * @param pTestMethod: A String representation of a single test method.
     *
     * @return: a double value ranging between 0 and 1, representing the lack of
     * 			cohesion of the method passed as parameter.
     *
     * @description: if the returned value is 0.0, this means that the test method is
     * 				 highly cohesive, while if the value returned is 1.0 the test method
     * 			 	 is poorly cohesive.
     *
     */
    public double evaluateCohesion(String pTestMethod) {
        SmellinessMetricAtTestCaseLevel smelliness= new SmellinessMetricAtTestCaseLevel();
        List<TermsOccurrences> updatedTestMethod = getCoveredOccurrences(pTestMethod);
        return smelliness.computeSmelliness(updatedTestMethod);
    }

    /**
     * Replaces the method calls with the body of the called production methods
     * @param pTestCase the original test case
     * @return the modified test case
     */
    public List<TermsOccurrences> getCoveredOccurrences(String pTestCase) {
        MethodBean methodBean = getMethodBeanBy(pTestCase);
        List<TermsOccurrences> occurrences = new ArrayList<>();
        for(MethodBean calledMethodBean: methodBean.getMethodCalls()) {
            TermsOccurrences method = getTermOccurrences(calledMethodBean.getName());
            // can be null since the method can call an external method.
            if(method != null)
                occurrences.add(method);
        }
        return occurrences;
    }

    /**
     * Creates a {@link MethodBean} object from a string representation of a test case
     * @param pTestCase a test case
     * @return the corresponding {@link MethodBean} object
     */
    private MethodBean getMethodBeanBy(String pTestCase) {
        pTestCase = "public class Class { public void test0 () {" + pTestCase + " } }";
        CodeParser parser = new CodeParser();
        CompilationUnit compilationUnit = parser.createParser(pTestCase);
        TypeDeclaration typeDeclaration = (TypeDeclaration)compilationUnit.types().get(0);
        Vector<String> imports = new Vector<>();
        ClassBean classBean = ClassParser.parse(typeDeclaration, "src", imports);
        return classBean.getMethods().iterator().next();
    }

    /**
     * Matches the method call of the test with the production method and return the map of the occurrences
     * Contains an optimization over Palomba's code using a map for already found matches
     * @param pTestMethodCall the name of the method
     * @return a {@link TermsOccurrences} or null if not found
     */
    private TermsOccurrences getTermOccurrences(String pTestMethodCall) {
        if (occurrencesMap.containsKey(pTestMethodCall)) {
            return occurrencesMap.get(pTestMethodCall);
        }
        for (TermsOccurrences termsOccurrences : productionClass.getTermsOccurrences()) {
            String processedName = termsOccurrences.getName();
            if (processedName.equals(pTestMethodCall)) {
                occurrencesMap.put(pTestMethodCall, termsOccurrences);
                return termsOccurrences;
            }
        }
        return null;
    }

    /**
     * Method that allows to evaluate to what extend a test method is well located in the test suite it
     * actually is in.
     *
     * @param method the chromosome that represent the test method
     * @param entireSuite the entire population that contains a test method
     * @return a double value between [0,1] that represents how good is the test method places in the current
     * class; if 0.0 it indicates that the test method is strongly misplaced; if the value is 1.0, it indicates
     * that the test is correctly placed.
     */
    public double evaluateCoupling(TermsOccurrences method, List<TermsOccurrences> entireSuite) {
        SmellinessMetricAtTestSuiteLevel smelliness = new SmellinessMetricAtTestSuiteLevel();
        return smelliness.computeSmelliness(method, entireSuite);
    }
}