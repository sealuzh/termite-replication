/*
 * This file was automatically generated by EvoSuite
 * Fri Nov 06 12:16:46 GMT 2020
 */

package umd.cs.shop;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.BufferedReader;
import java.io.PipedReader;
import java.io.StreamTokenizer;
import javax.swing.JApplet;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.System;
import org.evosuite.runtime.testdata.EvoSuiteFile;
import org.evosuite.runtime.testdata.FileSystemHandling;
import org.junit.runner.RunWith;
import umd.cs.shop.JSJshop;
import umd.cs.shop.JSJshopNode;
import umd.cs.shop.JSJshopVars;
import umd.cs.shop.JSListLogicalAtoms;
import umd.cs.shop.JSPairPlanTSListNodes;
import umd.cs.shop.JSPlan;
import umd.cs.shop.JSPlanningDomain;
import umd.cs.shop.JSPlanningProblem;
import umd.cs.shop.JSTaskAtom;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class JSJshop_ESTest extends JSJshop_ESTest_scaffolding {

  /**
  //Test case number: 0
  /*Coverage entropy=1.0549201679861442
  */
  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile(") ");
      byte[] byteArray0 = new byte[1];
      byteArray0[0] = (byte)50;
      FileSystemHandling.appendDataToFile(evoSuiteFile0, byteArray0);
      JSJshop jSJshop0 = null;
      try {
        jSJshop0 = new JSJshop(") ", ") ");
        fail("Expecting exception: System.SystemExitException");
      
      } catch(System.SystemExitException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.evosuite.runtime.System", e);
      }
  }

  /**
  //Test case number: 1
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      JSJshop jSJshop0 = new JSJshop();
      // Undeclared exception!
      try { 
        jSJshop0.testParser();
        fail("Expecting exception: System.SystemExitException");
      
      } catch(System.SystemExitException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.evosuite.runtime.System", e);
      }
  }

  /**
  //Test case number: 2
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      JSJshop jSJshop0 = new JSJshop();
      JSTaskAtom jSTaskAtom0 = new JSTaskAtom();
      // Undeclared exception!
      try { 
        jSJshop0.setFile(" Expecting 'first'", jSTaskAtom0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("umd.cs.shop.JSJshop", e);
      }
  }

  /**
  //Test case number: 3
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      JSJshop jSJshop0 = new JSJshop();
      // Undeclared exception!
      try { 
        jSJshop0.processToken((StreamTokenizer) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("umd.cs.shop.JSJshop", e);
      }
  }

  /**
  //Test case number: 4
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      JSJshop jSJshop0 = new JSJshop();
      // Undeclared exception!
      try { 
        jSJshop0.parserFile((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.evosuite.runtime.mock.java.io.MockFileInputStream", e);
      }
  }

  /**
  //Test case number: 5
  /*Coverage entropy=1.0114042647073518
  */
  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      String[] stringArray0 = new String[2];
      stringArray0[0] = "";
      // Undeclared exception!
      try { 
        JSJshop.main(stringArray0);
        fail("Expecting exception: System.SystemExitException");
      
      } catch(System.SystemExitException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.evosuite.runtime.System", e);
      }
  }

  /**
  //Test case number: 6
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      JSJshop jSJshop0 = null;
      try {
        jSJshop0 = new JSJshop((String) null, "a*('TvF(US3r2KuRD5");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.evosuite.runtime.mock.java.io.MockFileInputStream", e);
      }
  }

  /**
  //Test case number: 7
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      JSJshop jSJshop0 = new JSJshop();
      PipedReader pipedReader0 = new PipedReader();
      StreamTokenizer streamTokenizer0 = new StreamTokenizer(pipedReader0);
      // Undeclared exception!
      try { 
        jSJshop0.processToken(streamTokenizer0);
        fail("Expecting exception: Error");
      
      } catch(Error e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("umd.cs.shop.JSJshop", e);
      }
  }

  /**
  //Test case number: 8
  /*Coverage entropy=1.0042424730540764
  */
  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile(") ");
      byte[] byteArray0 = new byte[10];
      FileSystemHandling.appendDataToFile(evoSuiteFile0, byteArray0);
      JSJshop jSJshop0 = new JSJshop(") ", ") ");
      JSJshopVars.greaterT = 0;
      boolean boolean0 = jSJshop0.parserFile(") ");
      assertFalse(boolean0);
  }

  /**
  //Test case number: 9
  /*Coverage entropy=0.6730116670092565
  */
  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile(") ");
      byte[] byteArray0 = new byte[10];
      boolean boolean0 = FileSystemHandling.appendDataToFile(evoSuiteFile0, byteArray0);
      JSJshop jSJshop0 = new JSJshop(") ", ") ");
      boolean boolean1 = jSJshop0.parserFile(") ");
      assertTrue(boolean1 == boolean0);
  }

  /**
  //Test case number: 10
  /*Coverage entropy=1.0789922078775833
  */
  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile(") ");
      FileSystemHandling.appendStringToFile(evoSuiteFile0, "(G");
      JSJshop jSJshop0 = null;
      try {
        jSJshop0 = new JSJshop(") ", ") ");
        fail("Expecting exception: System.SystemExitException");
      
      } catch(System.SystemExitException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.evosuite.runtime.System", e);
      }
  }

  /**
  //Test case number: 11
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      JSJshop jSJshop0 = new JSJshop();
      BufferedReader bufferedReader0 = jSJshop0.getBufferedReader((String) null, (String) null, (JApplet) null);
      assertNull(bufferedReader0);
  }

  /**
  //Test case number: 12
  /*Coverage entropy=0.6365141682948128
  */
  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      JSJshop jSJshop0 = new JSJshop();
      BufferedReader bufferedReader0 = jSJshop0.getBufferedReader("H", "KpCN?kYxqx", (JApplet) null);
      assertNull(bufferedReader0);
  }

  /**
  //Test case number: 13
  /*Coverage entropy=1.0549201679861442
  */
  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile(") ");
      FileSystemHandling.appendStringToFile(evoSuiteFile0, ": Error reading control parameters: ");
      JSJshop jSJshop0 = null;
      try {
        jSJshop0 = new JSJshop(") ", ") ");
        fail("Expecting exception: System.SystemExitException");
      
      } catch(System.SystemExitException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.evosuite.runtime.System", e);
      }
  }

  /**
  //Test case number: 14
  /*Coverage entropy=0.15407610367102942
  */
  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("farp.shp");
      FileSystemHandling.appendStringToFile(evoSuiteFile0, "r1K0[uz@MlcE]Ui4|");
      JSJshop jSJshop0 = new JSJshop();
      jSJshop0.testParser();
      assertFalse(JSJshop.corbaToHicap);
  }

  /**
  //Test case number: 15
  /*Coverage entropy=0.16302362949436594
  */
  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("farp.shp");
      FileSystemHandling.appendStringToFile(evoSuiteFile0, "o#K/$eQEBNGT1C");
      JSJshop jSJshop0 = new JSJshop();
      jSJshop0.testParser();
      assertFalse(JSJshop.corbaToHicap);
  }

  /**
  //Test case number: 16
  /*Coverage entropy=0.15841057013179086
  */
  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("farp.shp");
      FileSystemHandling.appendStringToFile(evoSuiteFile0, "line : ");
      JSJshop jSJshop0 = new JSJshop();
      JSJshopVars.backquote = (-3);
      jSJshop0.testParser();
      assertFalse(JSJshop.corbaToHicap);
  }

  /**
  //Test case number: 17
  /*Coverage entropy=0.14999492361041503
  */
  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("farp.shp");
      FileSystemHandling.appendStringToFile(evoSuiteFile0, "\",h\"=>pvRWC59,]Wu");
      JSJshop jSJshop0 = new JSJshop();
      jSJshop0.testParser();
      assertFalse(JSJshop.corbaToHicap);
  }

  /**
  //Test case number: 18
  /*Coverage entropy=0.1461447460085638
  */
  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("farp.shp");
      FileSystemHandling.appendStringToFile(evoSuiteFile0, "a-cr'r$<*iwh&");
      JSJshop jSJshop0 = new JSJshop();
      JSJshopVars.exclamation = (-3);
      jSJshop0.testParser();
      assertFalse(JSJshop.corbaToHicap);
  }

  /**
  //Test case number: 19
  /*Coverage entropy=0.15407610367102942
  */
  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("farp.shp");
      JSJshop jSJshop0 = new JSJshop();
      FileSystemHandling.appendLineToFile(evoSuiteFile0, "L1|M(@,");
      jSJshop0.testParser();
      assertFalse(JSJshop.corbaToHicap);
  }

  /**
  //Test case number: 20
  /*Coverage entropy=0.15841057013179086
  */
  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("farp.shp");
      FileSystemHandling.appendStringToFile(evoSuiteFile0, "fx#fuCe{3= _");
      JSJshop jSJshop0 = new JSJshop();
      jSJshop0.testParser();
      assertFalse(JSJshop.corbaToHicap);
  }

  /**
  //Test case number: 21
  /*Coverage entropy=0.15407610367102942
  */
  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("farp.shp");
      FileSystemHandling.appendStringToFile(evoSuiteFile0, "I~L),ZiNQ?");
      JSJshop jSJshop0 = new JSJshop();
      jSJshop0.testParser();
      assertFalse(JSJshop.corbaToHicap);
  }

  /**
  //Test case number: 22
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      JSJshop jSJshop0 = new JSJshop();
      JSListLogicalAtoms jSListLogicalAtoms0 = jSJshop0.getDeleteList();
      assertNull(jSListLogicalAtoms0);
  }

  /**
  //Test case number: 23
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      JSJshop jSJshop0 = new JSJshop();
      JSListLogicalAtoms jSListLogicalAtoms0 = jSJshop0.getAddList();
      assertNull(jSListLogicalAtoms0);
  }

  /**
  //Test case number: 24
  /*Coverage entropy=0.6730116670092565
  */
  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile(") ");
      byte[] byteArray0 = new byte[10];
      FileSystemHandling.appendDataToFile(evoSuiteFile0, byteArray0);
      JSJshop jSJshop0 = null;
      try {
        jSJshop0 = new JSJshop(") ", "s):ak2lq^ln|7>lv");
        fail("Expecting exception: System.SystemExitException");
      
      } catch(System.SystemExitException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.evosuite.runtime.System", e);
      }
  }

  /**
  //Test case number: 25
  /*Coverage entropy=1.0114042647073518
  */
  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      JSJshopVars.flagExit = false;
      String[] stringArray0 = new String[2];
      stringArray0[0] = "%h>lwrl\"_ur:zj";
      JSJshop.main(stringArray0);
      assertEquals(2, stringArray0.length);
  }

  /**
  //Test case number: 26
  /*Coverage entropy=1.0821955300387671
  */
  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile(") ");
      byte[] byteArray0 = new byte[10];
      FileSystemHandling.appendDataToFile(evoSuiteFile0, byteArray0);
      JSJshop jSJshop0 = new JSJshop(") ", ") ");
      BufferedReader bufferedReader0 = jSJshop0.getBufferedReader(") ", "", (JApplet) null);
      assertNotNull(bufferedReader0);
  }

  /**
  //Test case number: 27
  /*Coverage entropy=0.7356219397587946
  */
  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      String[] stringArray0 = new String[3];
      stringArray0[2] = "all";
      // Undeclared exception!
      try { 
        JSJshop.main(stringArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.evosuite.runtime.mock.java.io.MockFileInputStream", e);
      }
  }

  /**
  //Test case number: 28
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      String[] stringArray0 = new String[4];
      JSJshop.main(stringArray0);
      assertEquals(4, stringArray0.length);
  }

  /**
  //Test case number: 29
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      String[] stringArray0 = new String[6];
      JSJshop.main(stringArray0);
      assertEquals(6, stringArray0.length);
  }

  /**
  //Test case number: 30
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      String[] stringArray0 = new String[1];
      JSJshop.main(stringArray0);
      assertEquals(1, stringArray0.length);
  }

  /**
  //Test case number: 31
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      JSJshop jSJshop0 = new JSJshop();
      JSPlanningDomain jSPlanningDomain0 = jSJshop0.dom();
      assertNull(jSPlanningDomain0);
  }

  /**
  //Test case number: 32
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      JSJshop jSJshop0 = new JSJshop();
      JSPlanningProblem jSPlanningProblem0 = jSJshop0.prob();
      assertNull(jSPlanningProblem0);
  }

  /**
  //Test case number: 33
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      JSJshop jSJshop0 = new JSJshop();
      JSJshopNode jSJshopNode0 = jSJshop0.tree();
      assertNull(jSJshopNode0);
  }

  /**
  //Test case number: 34
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      JSJshop jSJshop0 = new JSJshop();
      JSPlan jSPlan0 = jSJshop0.sol();
      assertNull(jSPlan0);
  }

  /**
  //Test case number: 35
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      JSJshop jSJshop0 = new JSJshop();
      JSPairPlanTSListNodes jSPairPlanTSListNodes0 = jSJshop0.getSolution();
      assertNull(jSPairPlanTSListNodes0);
  }

  /**
  //Test case number: 36
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      JSJshop jSJshop0 = null;
      try {
        jSJshop0 = new JSJshop("mv)pHK3.e&", (JSTaskAtom) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("umd.cs.shop.JSJshop", e);
      }
  }

  /**
  //Test case number: 37
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      JSJshop jSJshop0 = new JSJshop();
      // Undeclared exception!
      try { 
        jSJshop0.getAppletURL("'", (JApplet) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("umd.cs.shop.JSJshop", e);
      }
  }

  /**
  //Test case number: 38
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      JSJshop jSJshop0 = new JSJshop();
      JSJshopNode jSJshopNode0 = jSJshop0.getTree();
      assertNull(jSJshopNode0);
  }
}
