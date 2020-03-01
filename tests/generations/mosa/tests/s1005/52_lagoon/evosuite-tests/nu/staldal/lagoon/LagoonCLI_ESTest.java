/*
 * This file was automatically generated by EvoSuite
 * Wed Nov 13 23:58:14 GMT 2019
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
  /*Coverage entropy=0.3333333333333333
  */
  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      String[] stringArray0 = new String[2];
      stringArray0[1] = "0";
      LagoonCLI.main(stringArray0);
      assertEquals(2, stringArray0.length);
  }

  /**
  //Test case number: 1
  /*Coverage entropy=0.3333333333333333
  */
  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      String[] stringArray0 = new String[7];
      stringArray0[1] = "9";
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
  //Test case number: 2
  /*Coverage entropy=0.3333333333333333
  */
  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      FileSystemHandling.shouldAllThrowIOExceptions();
      String[] stringArray0 = new String[1];
      stringArray0[0] = "forcf.sitemap";
      LagoonCLI.main(stringArray0);
      assertEquals(1, stringArray0.length);
  }

  /**
  //Test case number: 3
  /*Coverage entropy=0.3333333333333333
  */
  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      String[] stringArray0 = new String[1];
      stringArray0[0] = "Kf,oRM9}%Q.sitemap";
      byte[] byteArray0 = new byte[9];
      FileSystemHandling.setPermissions((EvoSuiteFile) null, false, true, true);
      byteArray0[1] = (byte)1;
      byteArray0[2] = (byte)113;
      byteArray0[3] = (byte)1;
      byteArray0[4] = (byte)1;
      byteArray0[5] = (byte)109;
      byteArray0[6] = (byte)26;
      byteArray0[7] = (byte)94;
      FileSystemHandling.appendDataToFile((EvoSuiteFile) null, byteArray0);
      // Undeclared exception!
      try { 
        LagoonCLI.main(stringArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
      }
  }

  /**
  //Test case number: 4
  /*Coverage entropy=0.3333333333333333
  */
  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      String[] stringArray0 = new String[1];
      stringArray0[0] = ".sitemap";
      LagoonCLI.main(stringArray0);
      assertEquals(1, stringArray0.length);
  }

  /**
  //Test case number: 5
  /*Coverage entropy=0.3333333333333333
  */
  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      String[] stringArray0 = new String[8];
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
  /*Coverage entropy=0.4
  */
  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      String[] stringArray0 = new String[1];
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("'|+u yn4[YJ.Xnvj");
      FileSystemHandling.appendStringToFile(evoSuiteFile0, "'|+u yn4[YJ.Xnvj");
      stringArray0[0] = "'|+u yn4[YJ.Xnvj";
      LagoonCLI.main(stringArray0);
      assertEquals(1, stringArray0.length);
  }

  /**
  //Test case number: 7
  /*Coverage entropy=0.3333333333333333
  */
  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      String[] stringArray0 = new String[1];
      stringArray0[0] = ".xml";
      LagoonCLI.main(stringArray0);
      assertEquals(1, stringArray0.length);
  }

  /**
  //Test case number: 8
  /*Coverage entropy=0.3333333333333333
  */
  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      String[] stringArray0 = new String[1];
      stringArray0[0] = "_JSJjIL>CgQp.K.t";
      LagoonCLI.main(stringArray0);
      assertEquals(1, stringArray0.length);
  }

  /**
  //Test case number: 9
  /*Coverage entropy=0.3333333333333333
  */
  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      String[] stringArray0 = new String[5];
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
  //Test case number: 10
  /*Coverage entropy=0.3333333333333333
  */
  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      String[] stringArray0 = new String[0];
      LagoonCLI.main(stringArray0);
      assertEquals(0, stringArray0.length);
  }

  /**
  //Test case number: 11
  /*Coverage entropy=0.3333333333333333
  */
  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      String[] stringArray0 = new String[3];
      // Undeclared exception!
      try { 
        LagoonCLI.main(stringArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
      }
  }

  /**
  //Test case number: 12
  /*Coverage entropy=0.3333333333333333
  */
  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      String[] stringArray0 = new String[3];
      stringArray0[1] = "user.dir";
      LagoonCLI.main(stringArray0);
      assertEquals(3, stringArray0.length);
  }

  /**
  //Test case number: 13
  /*Coverage entropy=0.3333333333333333
  */
  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      String[] stringArray0 = new String[1];
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
  //Test case number: 14
  /*Coverage entropy=0.3333333333333333
  */
  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      LagoonCLI lagoonCLI0 = new LagoonCLI();
  }
}
