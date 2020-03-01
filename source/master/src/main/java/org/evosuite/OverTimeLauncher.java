package org.evosuite;

/**
 * @author Giovanni Grano
 * Utility class to launch and test the profiling over time of some variables
 */
public class OverTimeLauncher {
    public static void main(String[] args) {

        String[] command = {
                "-generateMOSuite",
                "-Dcriterion=BRANCH",
                "-Dconfiguration_id=test",
                "-Dminimize=false",
                "-Dpopulation=50",
                "-Dalgorithm=RMOSA",
                "-Dsearch_budget=30",
                /** ranking type set to ENTROPY_SORTING uses the coverage entropy in the preference criterion*/
                "-Dranking_type=ENTROPY_SORTING",
                /** this flag printes the entropy coverage in test comments; at the moment is not compatible with the
                 * normal flag used for the comments*/
                "-Dentropy_comments=true",
                /** this flag handles the usage of test cases from slicing*/
                "-Dslicing=true",
                "-Dslicing_delta=true",
                "-Dslicing_approach=TOP",
                "-Dslicing_cutoff=5",
//                if true, allows you to debug the client part (executed on the same JVM)
                "-Dclient_on_thread=false",
                "-Doutput_variables=TARGET_CLASS,criterion," +
//                        "BranchCoverageTimeline," +
//                        "CoverageEntropyTimeline," +
//                        "CouplingTimeline",
                        "LackOfCohesionTimeline",
                "-Dtimeline_interval=1000",
                "-projectCP",
                "/Users/grano/Documents/SF110/62_dom4j/dom4j.jar:" +
                        "/Users/grano/Documents/SF110/62_dom4j/lib/jaxen-1.1.1.jar:" +
                        "/Users/grano/Documents/SF110/62_dom4j/lib/pull-parser-2.1.10.jar:" +
                        "/Users/grano/Documents/SF110/62_dom4j/lib/relaxngDatatype-20030807.jar:" +
                        "/Users/grano/Documents/SF110/62_dom4j/lib/testng-5.11-jdk15.jar:" +
                        "/Users/grano/Documents/SF110/62_dom4j/lib/xalan-2.7.0.jar:" +
                        "/Users/grano/Documents/SF110/62_dom4j/lib/xercesImpl-2.8.1.jar:" +
                        "/Users/grano/Documents/SF110/62_dom4j/lib/xml-apis-1.0.b2.jar:" +
                        "/Users/grano/Documents/SF110/62_dom4j/lib/xpp3-1.1.4c.jar:" +
                        "/Users/grano/Documents/SF110/62_dom4j/lib/xsdlib-20030807.jar",
                "-class",
                "org.dom4j.io.SAXReader",
                "-DsourcePath",
                "/Users/grano/Documents/SF110-src/62_dom4j/src/main/java/org/dom4j/io/SAXReader.java"

        };

        EvoSuite.main(command);
        // test: we love simone scalabrino
    }
}