/*
 * This file was automatically generated by EvoSuite
 * Sun Nov 29 16:49:48 GMT 2020
 */

package nu.staldal.lagoon;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import nu.staldal.lagoon.LagoonCLI;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.testdata.EvoSuiteFile;
import org.evosuite.runtime.testdata.FileSystemHandling;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class LagoonCLI_ESTest extends LagoonCLI_ESTest_scaffolding {

  /**
  //Test case number: 0
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      String[] stringArray0 = new String[5];
      stringArray0[1] = ";.8IH&g";
      LagoonCLI.main(stringArray0);
      assertEquals(5, stringArray0.length);
  }

  /**
  //Test case number: 1
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      // Undeclared exception!
      try { 
        LagoonCLI.main((String[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("nu.staldal.lagoon.LagoonCLI", e);
      }
  }

  /**
  //Test case number: 2
  /*Coverage entropy=0.30463609734923813
  */
  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("DPw,>iOrG2kj*)");
      FileSystemHandling.appendStringToFile(evoSuiteFile0, "&!L;3v2MNS5I@rA/");
      String[] stringArray0 = new String[7];
      stringArray0[0] = "DPw,>iOrG2kj*)";
      stringArray0[1] = "2";
      LagoonCLI.main(stringArray0);
      assertEquals(7, stringArray0.length);
  }

  /**
  //Test case number: 3
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("DPw,>iOrG2kj*)");
      FileSystemHandling.appendStringToFile(evoSuiteFile0, "DPw,>iOrG2kj*)");
      FileSystemHandling.shouldAllThrowIOExceptions();
      String[] stringArray0 = new String[3];
      stringArray0[0] = "DPw,>iOrG2kj*)";
      stringArray0[1] = "2";
      LagoonCLI.main(stringArray0);
      assertEquals(3, stringArray0.length);
  }

  /**
  //Test case number: 4
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      String[] stringArray0 = new String[1];
      stringArray0[0] = "e7j06,spJ|H.sitemap";
      LagoonCLI.main(stringArray0);
      assertEquals(1, stringArray0.length);
  }

  /**
  //Test case number: 5
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      String[] stringArray0 = new String[22];
      stringArray0[0] = "build.xml";
      stringArray0[1] = "build";
      LagoonCLI.main(stringArray0);
      assertEquals(22, stringArray0.length);
  }

  /**
  //Test case number: 6
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      String[] stringArray0 = new String[7];
      stringArray0[1] = "-2";
      LagoonCLI.main(stringArray0);
      assertEquals(7, stringArray0.length);
  }

  /**
  //Test case number: 7
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      String[] stringArray0 = new String[3];
      stringArray0[1] = "force";
      // Undeclared exception!
      try { 
        LagoonCLI.main(stringArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  /**
  //Test case number: 8
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      String[] stringArray0 = new String[0];
      LagoonCLI.main(stringArray0);
      assertEquals(0, stringArray0.length);
  }

  /**
  //Test case number: 9
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test9()  throws Throwable  {
      LagoonCLI lagoonCLI0 = new LagoonCLI();
  }
}
