/*
 * This file was automatically generated by EvoSuite
 * Tue Nov 19 07:37:43 GMT 2019
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
      String[] stringArray0 = new String[1];
      stringArray0[0] = "kQ%S7Fbao)Ib.xml";
      // Undeclared exception!
      try { 
        LagoonCLI.main(stringArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
      }
  }

  /**
  //Test case number: 1
  /*Coverage entropy=0.3333333333333333
  */
  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("Ready");
      FileSystemHandling.setPermissions((EvoSuiteFile) null, false, false, false);
      FileSystemHandling.shouldThrowIOException(evoSuiteFile0);
      FileSystemHandling.appendStringToFile(evoSuiteFile0, ".xml");
      FileSystemHandling.shouldThrowIOException((EvoSuiteFile) null);
      FileSystemHandling.createFolder((EvoSuiteFile) null);
      String[] stringArray0 = new String[1];
      stringArray0[0] = ".xml";
      LagoonCLI.main(stringArray0);
      assertEquals(1, stringArray0.length);
  }

  /**
  //Test case number: 2
  /*Coverage entropy=0.3333333333333333
  */
  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      String[] stringArray0 = new String[7];
      stringArray0[1] = "force";
      stringArray0[2] = "v'yF/QO_";
      stringArray0[3] = ";$Ri2NG.Ovx&[y";
      stringArray0[4] = "f?|ce";
      stringArray0[6] = "Element expected";
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
  //Test case number: 3
  /*Coverage entropy=0.7932765402874764
  */
  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("Ready");
      FileSystemHandling.setPermissions(evoSuiteFile0, false, false, false);
      String[] stringArray0 = new String[4];
      FileSystemHandling.appendStringToFile(evoSuiteFile0, "Ready");
      stringArray0[0] = "Ready";
      stringArray0[1] = "force";
      stringArray0[2] = "sitemapFile";
      LagoonCLI.main(stringArray0);
      LagoonCLI.main(stringArray0);
      assertEquals(4, stringArray0.length);
  }

  /**
  //Test case number: 4
  /*Coverage entropy=0.3333333333333333
  */
  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("Ready");
      FileSystemHandling.setPermissions(evoSuiteFile0, false, false, false);
      FileSystemHandling.shouldThrowIOException(evoSuiteFile0);
      String[] stringArray0 = new String[4];
      FileSystemHandling.appendStringToFile(evoSuiteFile0, "ZjuMmomZh/_l'#ta");
      stringArray0[0] = "Ready";
      stringArray0[1] = "force";
      LagoonCLI.main(stringArray0);
      assertEquals(4, stringArray0.length);
  }

  /**
  //Test case number: 5
  /*Coverage entropy=0.3333333333333333
  */
  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      FileSystemHandling fileSystemHandling0 = new FileSystemHandling();
      FileSystemHandling fileSystemHandling1 = new FileSystemHandling();
      String[] stringArray0 = new String[1];
      stringArray0[0] = "se.dir.sitemap";
      LagoonCLI.main(stringArray0);
      assertEquals(1, stringArray0.length);
  }

  /**
  //Test case number: 6
  /*Coverage entropy=0.3333333333333333
  */
  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      String[] stringArray0 = new String[4];
      stringArray0[0] = "6";
      stringArray0[1] = "6";
      stringArray0[2] = "5&4/GBY:'j3+YCNT4=Q";
      stringArray0[3] = "6";
      LagoonCLI.main(stringArray0);
      assertEquals(4, stringArray0.length);
  }

  /**
  //Test case number: 7
  /*Coverage entropy=0.3333333333333333
  */
  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      String[] stringArray0 = new String[7];
      stringArray0[1] = "0";
      stringArray0[2] = "0";
      stringArray0[4] = "Budins we+vbsites..";
      stringArray0[5] = "jluO3ud}EBHaks7&_,";
      String[] stringArray1 = new String[9];
      stringArray1[0] = "Budins we+vbsites..";
      stringArray1[1] = "0";
      stringArray1[2] = "nu.staldal.xtree.Text";
      stringArray1[3] = "Budins we+vbsites..";
      stringArray1[4] = "Budins we+vbsites..";
      stringArray1[5] = "0";
      stringArray1[6] = "0";
      stringArray1[7] = "http://www.w3.org/XML/1998/namespace";
      stringArray1[8] = "Budins we+vbsites..";
      LagoonCLI.main(stringArray1);
      assertEquals(9, stringArray1.length);
  }

  /**
  //Test case number: 8
  /*Coverage entropy=0.3333333333333333
  */
  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      String[] stringArray0 = new String[4];
      stringArray0[0] = "build";
      stringArray0[1] = "build";
      stringArray0[2] = "juEO3ud}EBHaks7&_,";
      stringArray0[3] = "<\u0002$]g0wKesDFxNWP.sitma";
      LagoonCLI.main(stringArray0);
      assertEquals(4, stringArray0.length);
  }

  /**
  //Test case number: 9
  /*Coverage entropy=0.3333333333333333
  */
  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      String[] stringArray0 = new String[9];
      stringArray0[7] = "r<\u0002$]g0wKesDFxNWP";
      stringArray0[2] = "cY\"lHNno&u-;M!`t";
      stringArray0[3] = "kQ%S7Fbao)Ib";
      stringArray0[4] = "Property ";
      String[] stringArray1 = new String[1];
      stringArray1[0] = "cY\"lHNno&u-;M!`t";
      LagoonCLI.main(stringArray1);
      assertFalse(stringArray1.equals((Object)stringArray0));
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
      LagoonCLI lagoonCLI0 = new LagoonCLI();
      String[] stringArray0 = new String[6];
      stringArray0[1] = stringArray0[0];
      stringArray0[2] = ";";
      stringArray0[4] = " -49$@3;7}gZ]9{VE.xml";
      String[] stringArray1 = new String[2];
      assertFalse(stringArray1.equals((Object)stringArray0));
  }

  /**
  //Test case number: 12
  /*Coverage entropy=0.3333333333333333
  */
  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      String[] stringArray0 = new String[8];
      stringArray0[0] = "*6Fg2P0:7!MfcvmO";
      stringArray0[1] = ".dir";
      stringArray0[2] = "Z|#RXHG";
      stringArray0[3] = "user.dir";
      stringArray0[4] = "user.dir.sitemap";
      stringArray0[5] = "bNW0w tK|1mAnge%/";
      stringArray0[6] = "o5Q(}H4=";
      stringArray0[7] = "";
      LagoonCLI.main(stringArray0);
      assertEquals(8, stringArray0.length);
  }
}
