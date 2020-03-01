/*
 * This file was automatically generated by EvoSuite
 * Fri Nov 15 04:40:40 GMT 2019
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
  /*Coverage entropy=0.4
  */
  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      String[] stringArray0 = new String[9];
      stringArray0[0] = "IZXs5LC'%v!uU;h{.xml";
      stringArray0[1] = "^|1*{#A;8g[1w7#^";
      stringArray0[2] = "IZXs5LC'%v!uU;h{.xml";
      stringArray0[3] = "E;nf(*n5*";
      stringArray0[4] = "sQ&c{arEdABE";
      stringArray0[5] = "n&~d$!6";
      LagoonCLI.main(stringArray0);
      String[] stringArray1 = new String[8];
      stringArray1[0] = "IZXs5LC'%v!uU;h{.xml";
      stringArray1[1] = "build";
      stringArray1[2] = "build";
      stringArray1[3] = "sQ&c{arEdABE";
      stringArray1[4] = "E;nf(*n5*";
      stringArray1[5] = "E;nf(*n5*";
      stringArray1[6] = "IZXs5LC'%v!uU;h{.xml";
      stringArray1[7] = "sQ&c{arEdABE";
      // Undeclared exception!
      try { 
        LagoonCLI.main(stringArray1);
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
      String[] stringArray0 = new String[7];
      stringArray0[0] = "in ";
      stringArray0[1] = "0";
      stringArray0[2] = ".sitemap";
      stringArray0[3] = "|w-VmTGUz4#j&aA{&";
      stringArray0[4] = "tj&n*MsM<pZ";
      stringArray0[5] = "7bb1R";
      stringArray0[6] = "[W9ky8}Wp)^&IHVdQd$";
      LagoonCLI.main(stringArray0);
      assertEquals(7, stringArray0.length);
  }

  /**
  //Test case number: 2
  /*Coverage entropy=0.6821654291763652
  */
  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      String[] stringArray0 = new String[1];
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("user.dir");
      byte[] byteArray0 = new byte[3];
      FileSystemHandling.shouldAllThrowIOExceptions();
      byteArray0[0] = (byte)73;
      byteArray0[1] = (byte) (-63);
      byteArray0[2] = (byte) (-22);
      FileSystemHandling.appendDataToFile(evoSuiteFile0, byteArray0);
      stringArray0[0] = "user.dir";
      EvoSuiteFile evoSuiteFile1 = new EvoSuiteFile("user.dir");
      FileSystemHandling.appendStringToFile(evoSuiteFile1, "user.dir");
      LagoonCLI.main(stringArray0);
      assertEquals(1, stringArray0.length);
  }

  /**
  //Test case number: 3
  /*Coverage entropy=0.3333333333333333
  */
  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      String[] stringArray0 = new String[7];
      stringArray0[0] = ".sitemap";
      stringArray0[1] = "7";
      stringArray0[2] = "nrc_!wg0edZ,o";
      stringArray0[3] = "' K*Ik?ZG'Z";
      stringArray0[4] = "";
      stringArray0[5] = "tion";
      stringArray0[6] = "XP''XuaD 6$/*QJ7H";
      LagoonCLI.main(stringArray0);
      assertEquals(7, stringArray0.length);
  }

  /**
  //Test case number: 4
  /*Coverage entropy=0.7767701612564368
  */
  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      String[] stringArray0 = new String[16];
      stringArray0[0] = "fbL";
      stringArray0[1] = "fbL";
      stringArray0[2] = "fbL";
      stringArray0[3] = "http://xml.org/sax/features/namespace-prefixes";
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("@`*Y|Lf");
      byte[] byteArray0 = new byte[1];
      FileSystemHandling.appendDataToFile(evoSuiteFile0, byteArray0);
      stringArray0[5] = "f@orce";
      stringArray0[7] = "";
      String[] stringArray1 = new String[1];
      FileSystemHandling.appendLineToFile(evoSuiteFile0, "http://xml.org/sax/features/namespace-prefixes");
      FileSystemHandling.setPermissions(evoSuiteFile0, false, true, false);
      stringArray1[0] = "@`*Y|Lf";
      LagoonCLI.main(stringArray1);
      assertFalse(stringArray1.equals((Object)stringArray0));
  }

  /**
  //Test case number: 5
  /*Coverage entropy=0.3333333333333333
  */
  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      String[] stringArray0 = new String[1];
      stringArray0[0] = "nu.staldal.xtree.ProcesdingInstruction";
      LagoonCLI.main(stringArray0);
      assertEquals(1, stringArray0.length);
  }

  /**
  //Test case number: 6
  /*Coverage entropy=0.3333333333333333
  */
  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      String[] stringArray0 = new String[3];
      stringArray0[0] = "qc@scu)NBBdf5'b}3E";
      stringArray0[1] = "force";
      stringArray0[2] = "gAB0xbVk2LJyt>S\t";
      LagoonCLI.main(stringArray0);
      assertEquals(3, stringArray0.length);
  }

  /**
  //Test case number: 7
  /*Coverage entropy=0.3333333333333333
  */
  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      String[] stringArray0 = new String[14];
      stringArray0[0] = "N[}S*t";
      stringArray0[1] = "build";
      stringArray0[2] = "Building website...";
      stringArray0[4] = "N[}S*t";
      stringArray0[5] = "Attribute {";
      stringArray0[6] = "jdb{V$b:i^~LWH";
      stringArray0[7] = "1c9:dysD3Uo4w7";
      LagoonCLI.main(stringArray0);
      assertEquals(14, stringArray0.length);
  }

  /**
  //Test case number: 8
  /*Coverage entropy=0.3333333333333333
  */
  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      String[] stringArray0 = new String[4];
      stringArray0[0] = "v|rH`{}$&;1[8zpo.xml";
      stringArray0[1] = "build";
      stringArray0[2] = "NcCQ@o#xliqobo(_K 5";
      stringArray0[3] = "Password is required but not specified";
      LagoonCLI.main(stringArray0);
      assertEquals(4, stringArray0.length);
  }

  /**
  //Test case number: 9
  /*Coverage entropy=0.3333333333333333
  */
  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      String[] stringArray0 = new String[0];
      LagoonCLI.main(stringArray0);
      assertEquals(0, stringArray0.length);
  }

  /**
  //Test case number: 10
  /*Coverage entropy=0.3333333333333333
  */
  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      String[] stringArray0 = new String[17];
      stringArray0[1] = "build";
      stringArray0[2] = "Building website...";
      stringArray0[9] = "Attribute {";
      stringArray0[6] = "jdb{V$b:i^~LWH";
      stringArray0[7] = "1c9:dysD3Uo4w7";
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
  //Test case number: 11
  /*Coverage entropy=0.3333333333333333
  */
  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      String[] stringArray0 = new String[8];
      stringArray0[0] = "{Lc?u~OW=!GXep<";
      stringArray0[1] = "|:6uk=";
      stringArray0[2] = "|:6uk=";
      stringArray0[3] = "X>T-u4bVL.2OP";
      stringArray0[4] = "{Lc?u~OW=!GXep<";
      stringArray0[5] = "{Lc?u~OW=!GXep<";
      stringArray0[6] = ",@vYCCjv`k";
      stringArray0[7] = "{Lc?u~OW=!GXep<";
      LagoonCLI.main(stringArray0);
      assertEquals(8, stringArray0.length);
  }

  /**
  //Test case number: 12
  /*Coverage entropy=0.6997608016132726
  */
  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      LagoonCLI lagoonCLI0 = new LagoonCLI();
      String[] stringArray0 = new String[1];
      stringArray0[0] = "p8TJv_eMx";
      LagoonCLI.main(stringArray0);
      FileSystemHandling.shouldAllThrowIOExceptions();
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("@`*Y|Lf");
      FileSystemHandling fileSystemHandling0 = new FileSystemHandling();
      byte[] byteArray0 = new byte[2];
      byteArray0[0] = (byte)79;
      byteArray0[1] = (byte)113;
      FileSystemHandling.appendDataToFile(evoSuiteFile0, byteArray0);
      FileSystemHandling.appendStringToFile(evoSuiteFile0, "org.apache.log.output.io.rotate.BaseFileNam@Filter");
      FileSystemHandling.shouldThrowIOException((EvoSuiteFile) null);
      FileSystemHandling.setPermissions(evoSuiteFile0, true, false, false);
      String[] stringArray1 = new String[6];
      stringArray1[0] = "";
      stringArray1[1] = "@`*Y|Lf";
      stringArray1[2] = "";
      stringArray1[3] = "org.apache.log.output.io.rotate.BaseFileNam@Filter";
      stringArray1[4] = "http://xml.org/sax/features/namespace-prefixes";
      stringArray1[5] = "org.apache.log.output.io.rotate.BaseFileNam@Filter";
      LagoonCLI.main(stringArray1);
      assertEquals(6, stringArray1.length);
  }
}
