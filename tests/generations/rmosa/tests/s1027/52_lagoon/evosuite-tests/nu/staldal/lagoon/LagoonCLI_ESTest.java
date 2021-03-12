/*
 * This file was automatically generated by EvoSuite
 * Mon Nov 09 18:23:57 GMT 2020
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
      String[] stringArray0 = new String[2];
      stringArray0[0] = "H~8fJd'8&doNA60%.xml";
      stringArray0[1] = "build";
      // Undeclared exception!
      try { 
        LagoonCLI.main(stringArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
      }
  }

  /**
  //Test case number: 1
  /*Coverage entropy=0.34883209584303193
  */
  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      String[] stringArray0 = new String[3];
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("Lagoon initiaied successfull>");
      FileSystemHandling.appendLineToFile(evoSuiteFile0, "N<kdB12P");
      stringArray0[0] = "Lagoon initiaied successfull>";
      stringArray0[1] = "force";
      LagoonCLI.main(stringArray0);
      assertEquals(3, stringArray0.length);
  }

  /**
  //Test case number: 2
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      String[] stringArray0 = new String[1];
      stringArray0[0] = "C0?VVyJZ.xml";
      FileSystemHandling.shouldAllThrowIOExceptions();
      LagoonCLI.main(stringArray0);
      assertEquals(1, stringArray0.length);
  }

  /**
  //Test case number: 3
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      String[] stringArray0 = new String[1];
      stringArray0[0] = "}ghQ.sitemap";
      LagoonCLI.main(stringArray0);
      assertEquals(1, stringArray0.length);
  }

  /**
  //Test case number: 4
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      String[] stringArray0 = new String[4];
      stringArray0[1] = "0";
      LagoonCLI.main(stringArray0);
      assertEquals(4, stringArray0.length);
  }

  /**
  //Test case number: 5
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      String[] stringArray0 = new String[6];
      stringArray0[1] = "+8";
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
  //Test case number: 6
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      String[] stringArray0 = new String[19];
      stringArray0[1] = "dhI-GJ#9";
      LagoonCLI.main(stringArray0);
      assertEquals(19, stringArray0.length);
  }

  /**
  //Test case number: 7
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      String[] stringArray0 = new String[0];
      LagoonCLI.main(stringArray0);
      assertEquals(0, stringArray0.length);
  }

  /**
  //Test case number: 8
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      LagoonCLI lagoonCLI0 = new LagoonCLI();
  }
}
