/*
 * This file was automatically generated by EvoSuite
 * Tue Dec 03 14:14:03 GMT 2019
 */

package umd.cs.shop;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.StringSelection;
import java.io.File;
import java.io.Reader;
import java.io.StreamTokenizer;
import javax.swing.JApplet;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.System;
import org.evosuite.runtime.mock.java.io.MockPrintStream;
import org.evosuite.runtime.testdata.EvoSuiteFile;
import org.evosuite.runtime.testdata.FileSystemHandling;
import org.junit.runner.RunWith;
import umd.cs.shop.JSJshop;
import umd.cs.shop.JSJshopVars;
import umd.cs.shop.JSMethod;
import umd.cs.shop.JSPlan;
import umd.cs.shop.JSPlanningProblem;
import umd.cs.shop.JSTaskAtom;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class JSJshop_ESTest extends JSJshop_ESTest_scaffolding {

  /**
  //Test case number: 0
  /*Coverage entropy=1.830738805564335
  */
  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      JSJshop jSJshop0 = new JSJshop();
      JSJshopVars.semicolon = 746;
      FileSystemHandling.createFolder((EvoSuiteFile) null);
      FileSystemHandling fileSystemHandling0 = new FileSystemHandling();
      JSJshopVars.verticalL = 746;
      jSJshop0.getBufferedReader((String) null, (String) null, (JApplet) null);
      jSJshop0.dom();
      jSJshop0.getSolution();
      StreamTokenizer streamTokenizer0 = null;
      try {
        streamTokenizer0 = new StreamTokenizer((Reader) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.io.StreamTokenizer", e);
      }
  }

  /**
  //Test case number: 1
  /*Coverage entropy=1.0931471805599453
  */
  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      JSJshop jSJshop0 = new JSJshop();
      int int0 = (-1735);
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
  //Test case number: 2
  /*Coverage entropy=1.830738805564335
  */
  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("SiZDws");
      FileSystemHandling.shouldThrowIOException(evoSuiteFile0);
      FileSystemHandling.appendLineToFile(evoSuiteFile0, "X1vNsuG");
      FileSystemHandling.appendLineToFile(evoSuiteFile0, "X1vNsuG");
      FileSystemHandling.appendStringToFile(evoSuiteFile0, "X1vNsuG");
      JSJshop jSJshop0 = new JSJshop();
      jSJshop0.getDeleteList();
      JSTaskAtom jSTaskAtom0 = new JSTaskAtom();
      // Undeclared exception!
      try { 
        jSJshop0.setFile("", jSTaskAtom0);
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
  /*Coverage entropy=0.4
  */
  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("SiZDws");
      FileSystemHandling.shouldThrowIOException(evoSuiteFile0);
      String[] stringArray0 = new String[0];
      JSJshop.main(stringArray0);
      JSJshop.main(stringArray0);
      assertEquals(0, stringArray0.length);
  }

  /**
  //Test case number: 4
  /*Coverage entropy=0.3333333333333333
  */
  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("yoNYTF,z*~8#)");
      FileSystemHandling.appendStringToFile(evoSuiteFile0, "2vj4|-6;wrP");
      JSMethod jSMethod0 = new JSMethod();
      jSMethod0.head();
      // Undeclared exception!
      try { 
        JSJshop.main((String[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("umd.cs.shop.JSJshop", e);
      }
  }

  /**
  //Test case number: 5
  /*Coverage entropy=1.1217186091313738
  */
  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      JSJshop jSJshop0 = new JSJshop();
      JApplet jApplet0 = JSJshop.applet;
      JSJshop jSJshop1 = new JSJshop();
      JSJshopVars.leftPar = 0;
      DataFlavor dataFlavor0 = DataFlavor.stringFlavor;
      StringSelection stringSelection0 = new StringSelection("h");
      Reader reader0 = dataFlavor0.getReaderForText(stringSelection0);
      stringSelection0.isDataFlavorSupported(dataFlavor0);
      StreamTokenizer streamTokenizer0 = new StreamTokenizer(reader0);
      reader0.mark(1);
      streamTokenizer0.pushBack();
      StreamTokenizer streamTokenizer1 = new StreamTokenizer(reader0);
      // Undeclared exception!
      try { 
        jSJshop0.processToken(streamTokenizer1);
        fail("Expecting exception: Error");
      
      } catch(Error e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("umd.cs.shop.JSJshop", e);
      }
  }

  /**
  //Test case number: 6
  /*Coverage entropy=1.7766234846545668
  */
  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("yoNYTF,z*~8#)");
      FileSystemHandling.appendStringToFile(evoSuiteFile0, "2vj4|-6;wrP");
      JSMethod jSMethod0 = new JSMethod();
      jSMethod0.head();
      JSJshop jSJshop0 = null;
      try {
        jSJshop0 = new JSJshop("yoNYTF,z*~8#)", (JSTaskAtom) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("umd.cs.shop.JSJshop", e);
      }
  }

  /**
  //Test case number: 7
  /*Coverage entropy=0.3333333333333333
  */
  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      String[] stringArray0 = new String[4];
      stringArray0[0] = "? ";
      stringArray0[2] = "";
      JSJshop.main(stringArray0);
      assertEquals(4, stringArray0.length);
  }

  /**
  //Test case number: 8
  /*Coverage entropy=0.3333333333333333
  */
  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      String[] stringArray0 = new String[3];
      stringArray0[0] = "? ";
      stringArray0[1] = "yvYz$mr";
      stringArray0[2] = "yvYz$mr";
      JSJshop.main(stringArray0);
      System.setCurrentTimeMillis(1L);
  }

  /**
  //Test case number: 9
  /*Coverage entropy=1.0931471805599453
  */
  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      JSJshop jSJshop0 = new JSJshop();
      JSPlan jSPlan0 = jSJshop0.sol();
      assertNull(jSPlan0);
  }

  /**
  //Test case number: 10
  /*Coverage entropy=1.0931471805599453
  */
  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      byte[] byteArray0 = new byte[6];
      byteArray0[0] = (byte)9;
      byteArray0[1] = (byte)9;
      byteArray0[2] = (byte)0;
      byteArray0[3] = (byte) (-68);
      byteArray0[4] = (byte)5;
      byteArray0[5] = (byte)121;
      FileSystemHandling.appendDataToFile((EvoSuiteFile) null, byteArray0);
      JSJshop jSJshop0 = new JSJshop();
      jSJshop0.parserFile("jvK'B \"p4R,PIo;mH");
      JSJshopVars.leftBrac = (-1791738575);
      FileSystemHandling.appendStringToFile((EvoSuiteFile) null, "jvK'B \"p4R,PIo;mH");
      JApplet jApplet0 = JSJshop.applet;
      MockPrintStream mockPrintStream0 = null;
      try {
        mockPrintStream0 = new MockPrintStream((File) null, "l060LDgQaZnn&(ZSyv");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.io.File", e);
      }
  }

  /**
  //Test case number: 11
  /*Coverage entropy=0.4
  */
  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      JSJshop jSJshop0 = null;
      try {
        jSJshop0 = new JSJshop((String) null, " O((+zeIk&");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.evosuite.runtime.mock.java.io.MockFileInputStream", e);
      }
  }

  /**
  //Test case number: 12
  /*Coverage entropy=2.063983366979555
  */
  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      JSJshop jSJshop0 = new JSJshop();
      JSJshopVars.leftPar = (-1);
      jSJshop0.tree();
      jSJshop0.getAddList();
      JSJshopVars.rightPar = (-1126);
      jSJshop0.getTree();
      String string0 = "&OVV#i@2.wj(K";
      // Undeclared exception!
      try { 
        jSJshop0.getAppletURL("&OVV#i@2.wj(K", (JApplet) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("umd.cs.shop.JSJshop", e);
      }
  }

  /**
  //Test case number: 13
  /*Coverage entropy=0.3333333333333333
  */
  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      String[] stringArray0 = new String[3];
      stringArray0[0] = ")  ";
      stringArray0[1] = "Kmyii[";
      stringArray0[2] = "^_%,]lFfJ=|Y/Cm9";
      JSJshop.main(stringArray0);
      assertEquals(3, stringArray0.length);
  }

  /**
  //Test case number: 14
  /*Coverage entropy=0.3333333333333333
  */
  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      String[] stringArray0 = new String[9];
      stringArray0[0] = "z}0W@P<,c";
      stringArray0[1] = "@@< 7F)JI";
      stringArray0[2] = "? ";
      stringArray0[3] = "";
      stringArray0[4] = "Gmsf7M[IdMi+QF";
      stringArray0[5] = "yvYz$mr";
      stringArray0[6] = "ahMJC";
      stringArray0[7] = "GNzfdP";
      stringArray0[8] = "! ";
      JSJshop.main(stringArray0);
      assertEquals(9, stringArray0.length);
  }

  /**
  //Test case number: 15
  /*Coverage entropy=1.0931471805599453
  */
  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
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
  //Test case number: 16
  /*Coverage entropy=1.5271837172395382
  */
  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      String string0 = "yoNYTF,z*~8#)";
      JSMethod jSMethod0 = new JSMethod();
      jSMethod0.head();
      JSJshop jSJshop0 = null;
      try {
        jSJshop0 = new JSJshop("yoNYTF,z*~8#)", (JSTaskAtom) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("umd.cs.shop.JSJshop", e);
      }
  }

  /**
  //Test case number: 17
  /*Coverage entropy=1.830738805564335
  */
  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("SiZDws");
      FileSystemHandling.appendLineToFile(evoSuiteFile0, "NP?)L}f+*;1(|AI:5?");
      EvoSuiteFile evoSuiteFile1 = new EvoSuiteFile("SiZDws");
      FileSystemHandling.shouldThrowIOException(evoSuiteFile1);
      FileSystemHandling.appendLineToFile(evoSuiteFile1, "");
      FileSystemHandling.appendStringToFile(evoSuiteFile1, "");
      JSJshop jSJshop0 = new JSJshop();
      jSJshop0.getDeleteList();
      jSJshop0.getAddList();
      JSPlanningProblem jSPlanningProblem0 = jSJshop0.prob();
      assertNull(jSPlanningProblem0);
  }

  /**
  //Test case number: 18
  /*Coverage entropy=1.7766234846545668
  */
  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      JSJshop jSJshop0 = new JSJshop();
      JSJshopVars.colon = (-1735);
      JSJshop.corbaToHicap = false;
      jSJshop0.getTree();
      JApplet jApplet0 = null;
      jSJshop0.getBufferedReader("all", "g$=,^Lq<t]1-IS", (JApplet) null);
      jSJshop0.tree();
      StreamTokenizer streamTokenizer0 = null;
      try {
        streamTokenizer0 = new StreamTokenizer((Reader) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.io.StreamTokenizer", e);
      }
  }

  /**
  //Test case number: 19
  /*Coverage entropy=1.4399756932787804
  */
  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      String[] stringArray0 = new String[2];
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("SiZDws");
      FileSystemHandling.shouldThrowIOException(evoSuiteFile0);
      stringArray0[0] = "SiZDws";
      stringArray0[1] = "HoI>Uzn:d?";
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
  //Test case number: 20
  /*Coverage entropy=1.0365141682948127
  */
  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      JSJshop jSJshop0 = null;
      try {
        jSJshop0 = new JSJshop(" O((/zeIk&", " O((/zeIk&");
        fail("Expecting exception: System.SystemExitException");
      
      } catch(System.SystemExitException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.evosuite.runtime.System", e);
      }
  }
}
