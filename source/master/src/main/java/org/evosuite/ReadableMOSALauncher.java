package org.evosuite;

/**
 * @author Giovanni Grano
 * Utility class to launch and test the implemented version of ReadableMOSA
 */
public class ReadableMOSALauncher {
    public static void main(String[] args) {

        String[] command = {
                "-generateMOSuite",
                "-Dcriterion=BRANCH:LINE:WEAKMUTATION:INPUT:OUTPUT:EXCEPTION:METHOD",
                "-Dconfiguration_id=test",
                "-Dminimize=false",
                "-Dpopulation=50",
//                RMOSA is the temporary name for the modified version of MOSA we implement optimized for readability
                "-Dalgorithm=RMOSA",
                "-Dcoverage=TRUE",
                "-Dsandbox=TRUE",
                "-Djunit_check=false",
                "-Dassertions=FALSE",
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
                "-Doutput_variables=TARGET_CLASS,criterion,configuration_id,algorithm,Total_Goals,Covered_Goals," +
                        "Generations,Statements_Executed,Fitness_Evaluations,Tests_Executed,Generations,Total_Time," +
                        "Size,Result_Size,Length,Result_Length,BranchCoverage,CoverageEntropy,LackOfCohesion,Coupling,EagerTestExceedingAmounts",
                "-projectCP",
                "/Users/grano/Documents/SF110/92_jcvi-javacommon/jcvi-javacommon.jar",
                "-class",
                "org.jcvi.jillion.core.Range",
                "-DsourcePath",
                "/Users/grano/Documents/SF110-src/92_jcvi-javacommon/src/main/java/org/jcvi/jillion/core/Range.java"

        };

        EvoSuite.main(command);
        // test: we love simone scalabrino
    }
}