/*
 * This file was automatically generated by EvoSuite
 * Sun Nov 08 15:06:34 GMT 2020
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
      String[] stringArray0 = new String[3];
      stringArray0[1] = "";
      LagoonCLI.main(stringArray0);
      assertEquals(3, stringArray0.length);
  }

  /**
  //Test case number: 1
  /*Coverage entropy=0.37677016125643675
  */
  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("user.dir");
      FileSystemHandling.appendStringToFile(evoSuiteFile0, "{F-}ixPef*$;8r");
      String[] stringArray0 = new String[1];
      stringArray0[0] = "user.dir";
      LagoonCLI.main(stringArray0);
      assertEquals(1, stringArray0.length);
  }

  /**
  //Test case number: 2
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      String[] stringArray0 = new String[1];
      stringArray0[0] = "force.xml";
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
      stringArray0[0] = "\"Mm5.sitemap";
      LagoonCLI.main(stringArray0);
      assertEquals(1, stringArray0.length);
  }

  /**
  //Test case number: 4
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      String[] stringArray0 = new String[1];
      stringArray0[0] = "o7q;Nf%.xml.xml";
      // Undeclared exception!
      try { 
        LagoonCLI.main(stringArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
      }
  }

  /**
  //Test case number: 5
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      String[] stringArray0 = new String[2];
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
  //Test case number: 6
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      String[] stringArray0 = new String[7];
      stringArray0[1] = "build";
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
  //Test case number: 7
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      String[] stringArray0 = new String[15];
      stringArray0[1] = "4";
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
