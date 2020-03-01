/*
 * This file was automatically generated by EvoSuite
 * Tue Dec 03 14:52:07 GMT 2019
 */

package umd.cs.shop;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.awt.Frame;
import java.awt.GridBagLayout;
import java.awt.HeadlessException;
import java.awt.datatransfer.SystemFlavorMap;
import java.awt.dnd.DropTarget;
import java.awt.dnd.DropTargetListener;
import java.io.BufferedReader;
import java.io.PipedReader;
import java.io.PipedWriter;
import java.io.StreamTokenizer;
import java.io.StringReader;
import javax.swing.Icon;
import javax.swing.JApplet;
import javax.swing.JCheckBox;
import javax.swing.JRadioButton;
import javax.swing.tree.DefaultTreeCellRenderer;
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
import umd.cs.shop.JSState;
import umd.cs.shop.JSTaskAtom;
import umd.cs.shop.JSTasks;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class JSJshop_ESTest extends JSJshop_ESTest_scaffolding {

  /**
  //Test case number: 0
  /*Coverage entropy=1.0365141682948127
  */
  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      JSJshop jSJshop0 = new JSJshop();
      FileSystemHandling.createFolder((EvoSuiteFile) null);
      String[] stringArray0 = new String[5];
      stringArray0[0] = "Q{";
      stringArray0[1] = "Q{";
      stringArray0[2] = "Q{";
      stringArray0[3] = "Q{";
      stringArray0[4] = "Q{";
      JSJshop.main(stringArray0);
      assertEquals(5, stringArray0.length);
  }

  /**
  //Test case number: 1
  /*Coverage entropy=1.0931471805599453
  */
  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      JSJshop jSJshop0 = new JSJshop();
      EvoSuiteFile evoSuiteFile0 = null;
      byte[] byteArray0 = new byte[0];
      FileSystemHandling.appendDataToFile((EvoSuiteFile) null, byteArray0);
      JSJshop.corbaToHicap = false;
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
  /*Coverage entropy=1.1112163896861356
  */
  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("farp.shp");
      FileSystemHandling.appendLineToFile(evoSuiteFile0, "K*D");
      JSJshop jSJshop0 = new JSJshop();
      JSJshopVars.whiteSpace = 10;
      JSJshopVars.exclamation = 10;
      JSListLogicalAtoms jSListLogicalAtoms0 = new JSListLogicalAtoms();
      JSJshopVars.rightPar = 1456;
      jSJshop0.testParser();
      jSJshop0.dom();
      JSJshop jSJshop1 = null;
      try {
        jSJshop1 = new JSJshop("#%;XUnjA", "[number-of-plans] can be 'one' or 'all'. The default value is 'one'");
        fail("Expecting exception: System.SystemExitException");
      
      } catch(System.SystemExitException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.evosuite.runtime.System", e);
      }
  }

  /**
  //Test case number: 3
  /*Coverage entropy=1.5271837172395382
  */
  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      JSJshop jSJshop0 = new JSJshop();
      JSJshopVars.minus = (-769);
      jSJshop0.getSolution();
      JApplet jApplet0 = JSJshop.applet;
      BufferedReader bufferedReader0 = jSJshop0.getBufferedReader((String) null, (String) null, (JApplet) null);
      assertNull(bufferedReader0);
  }

  /**
  //Test case number: 4
  /*Coverage entropy=1.0931471805599453
  */
  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      JSJshop jSJshop0 = new JSJshop();
      StringReader stringReader0 = new StringReader("! ");
      StreamTokenizer streamTokenizer0 = new StreamTokenizer(stringReader0);
      int int0 = 1;
      streamTokenizer0.pushBack();
      streamTokenizer0.whitespaceChars(1, 1566);
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
  //Test case number: 5
  /*Coverage entropy=1.5271837172395382
  */
  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      JSJshop jSJshop0 = new JSJshop();
      jSJshop0.getAddList();
      jSJshop0.getSolution();
      DropTargetListener dropTargetListener0 = null;
      boolean boolean0 = true;
      DropTarget dropTarget0 = null;
      try {
        dropTarget0 = new DropTarget();
        fail("Expecting exception: HeadlessException");
      
      } catch(HeadlessException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.awt.dnd.DropTarget", e);
      }
  }

  /**
  //Test case number: 6
  /*Coverage entropy=1.0365141682948127
  */
  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      JSJshop jSJshop0 = new JSJshop();
      String string0 = "";
      JApplet jApplet0 = JSJshop.applet;
      jSJshop0.getBufferedReader("", "Rbi%]c", (JApplet) null);
      StringReader stringReader0 = new StringReader("");
      StreamTokenizer streamTokenizer0 = new StreamTokenizer(stringReader0);
      SystemFlavorMap.getDefaultFlavorMap();
      String string1 = "g xluW";
      DefaultTreeCellRenderer defaultTreeCellRenderer0 = new DefaultTreeCellRenderer();
      Frame frame0 = null;
      try {
        frame0 = new Frame("");
        fail("Expecting exception: HeadlessException");
      
      } catch(HeadlessException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.awt.GraphicsEnvironment", e);
      }
  }

  /**
  //Test case number: 7
  /*Coverage entropy=1.0931471805599453
  */
  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      JApplet jApplet0 = JSJshop.applet;
      StringReader stringReader0 = new StringReader("");
      StreamTokenizer streamTokenizer0 = new StreamTokenizer(stringReader0);
      SystemFlavorMap.getDefaultFlavorMap();
      DefaultTreeCellRenderer defaultTreeCellRenderer0 = new DefaultTreeCellRenderer();
      Icon icon0 = defaultTreeCellRenderer0.getClosedIcon();
      JRadioButton jRadioButton0 = new JRadioButton("g xluW", icon0);
      StringReader stringReader1 = new StringReader("");
      char[] charArray0 = new char[1];
      charArray0[0] = '~';
      stringReader0.read(charArray0);
      ClassLoader.getSystemClassLoader();
      PipedWriter pipedWriter0 = new PipedWriter();
      System.setCurrentTimeMillis((-1));
      JSJshop jSJshop0 = new JSJshop();
      boolean boolean0 = jSJshop0.parserFile("D+~::Jf4<DcAW23H4j");
      assertFalse(boolean0);
  }

  /**
  //Test case number: 8
  /*Coverage entropy=1.830738805564335
  */
  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      JSJshop jSJshop0 = new JSJshop();
      jSJshop0.getDeleteList();
      JSPlanningDomain jSPlanningDomain0 = new JSPlanningDomain();
      jSJshop0.getAddList();
      JSJshopNode jSJshopNode0 = jSJshop0.getTree();
      assertNull(jSJshopNode0);
  }

  /**
  //Test case number: 9
  /*Coverage entropy=0.9890440681266113
  */
  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("farp.shp");
      FileSystemHandling.appendLineToFile(evoSuiteFile0, "K*D");
      JSJshop jSJshop0 = new JSJshop();
      JSJshopVars.whiteSpace = 6;
      JSJshopVars.exclamation = 6;
      JSListLogicalAtoms jSListLogicalAtoms0 = new JSListLogicalAtoms();
      jSJshop0.testParser();
      StringReader stringReader0 = new StringReader("K*D");
      char[] charArray0 = new char[5];
      charArray0[0] = 'e';
      charArray0[1] = '.';
      charArray0[2] = '/';
      charArray0[3] = 'x';
      charArray0[4] = 'x';
      stringReader0.read(charArray0);
      ClassLoader.getSystemClassLoader();
      PipedWriter pipedWriter0 = new PipedWriter();
      JSJshop jSJshop1 = null;
      try {
        jSJshop1 = new JSJshop("K*D", "*");
        fail("Expecting exception: System.SystemExitException");
      
      } catch(System.SystemExitException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.evosuite.runtime.System", e);
      }
  }

  /**
  //Test case number: 10
  /*Coverage entropy=0.3333333333333333
  */
  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      String[] stringArray0 = new String[1];
      JSJshop.main(stringArray0);
      StringReader stringReader0 = new StringReader("zIg>4rp80}aB");
      StreamTokenizer streamTokenizer0 = new StreamTokenizer(stringReader0);
      JCheckBox jCheckBox0 = new JCheckBox("Mnl4u&jJeQFpI&e%W(");
      DropTarget dropTarget0 = null;
      try {
        dropTarget0 = new DropTarget();
        fail("Expecting exception: HeadlessException");
      
      } catch(HeadlessException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.awt.dnd.DropTarget", e);
      }
  }

  /**
  //Test case number: 11
  /*Coverage entropy=0.4
  */
  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      GridBagLayout gridBagLayout0 = new GridBagLayout();
      gridBagLayout0.getLayoutOrigin();
      JSJshop jSJshop0 = null;
      try {
        jSJshop0 = new JSJshop((String) null, "");
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
  /*Coverage entropy=1.5271837172395382
  */
  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      JSTaskAtom jSTaskAtom0 = new JSTaskAtom();
      JSJshop jSJshop0 = null;
      try {
        jSJshop0 = new JSJshop("bS", jSTaskAtom0);
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
      String[] stringArray0 = new String[4];
      stringArray0[0] = "k GdaxZ'~0#e\",b";
      stringArray0[1] = "all";
      stringArray0[2] = "Q{";
      stringArray0[3] = "farp.shp";
      JSJshop.main(stringArray0);
      assertEquals(4, stringArray0.length);
  }

  /**
  //Test case number: 14
  /*Coverage entropy=1.0931471805599453
  */
  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      JSJshop jSJshop0 = new JSJshop();
      JSState jSState0 = new JSState();
      JSPairPlanTSListNodes jSPairPlanTSListNodes0 = new JSPairPlanTSListNodes();
      JApplet jApplet0 = JSJshop.applet;
      JApplet jApplet1 = JSJshop.applet;
      // Undeclared exception!
      try { 
        jSJshop0.getAppletURL("*", (JApplet) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("umd.cs.shop.JSJshop", e);
      }
  }

  /**
  //Test case number: 15
  /*Coverage entropy=1.5271837172395382
  */
  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      JSJshop jSJshop0 = new JSJshop();
      JApplet jApplet0 = JSJshop.applet;
      // Undeclared exception!
      try { 
        jSJshop0.setFile("~V9.*8v=kO", (JSTaskAtom) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("umd.cs.shop.JSJshop", e);
      }
  }

  /**
  //Test case number: 16
  /*Coverage entropy=1.830738805564335
  */
  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      JSJshop jSJshop0 = new JSJshop();
      jSJshop0.getDeleteList();
      JSJshopVars.equalT = (-4275);
      jSJshop0.dom();
      jSJshop0.getAddList();
      PipedReader pipedReader0 = new PipedReader();
      DropTarget dropTarget0 = null;
      try {
        dropTarget0 = new DropTarget();
        fail("Expecting exception: HeadlessException");
      
      } catch(HeadlessException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.awt.dnd.DropTarget", e);
      }
  }

  /**
  //Test case number: 17
  /*Coverage entropy=1.0931471805599453
  */
  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      JSJshop jSJshop0 = new JSJshop();
      JSTasks jSTasks0 = new JSTasks();
      JSPlanningDomain jSPlanningDomain0 = new JSPlanningDomain();
      String string0 = null;
      String string1 = "umd.cs.shop.JSListIfThenElse";
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
  //Test case number: 18
  /*Coverage entropy=1.4399756932787804
  */
  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      String[] stringArray0 = new String[2];
      String string0 = "";
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
  //Test case number: 19
  /*Coverage entropy=0.9909065731902369
  */
  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      String[] stringArray0 = new String[2];
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
  //Test case number: 20
  /*Coverage entropy=1.0931471805599453
  */
  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      JSPairPlanTSListNodes jSPairPlanTSListNodes0 = new JSPairPlanTSListNodes();
      ClassLoader.getSystemClassLoader();
      JSJshop jSJshop0 = new JSJshop();
      JSPlan jSPlan0 = jSJshop0.sol();
      assertNull(jSPlan0);
  }

  /**
  //Test case number: 21
  /*Coverage entropy=1.0931471805599453
  */
  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      JSJshop jSJshop0 = new JSJshop();
      JApplet jApplet0 = JSJshop.applet;
      JApplet jApplet1 = JSJshop.applet;
      JSJshopNode jSJshopNode0 = jSJshop0.tree();
      assertNull(jSJshopNode0);
  }

  /**
  //Test case number: 22
  /*Coverage entropy=1.0931471805599453
  */
  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      JSJshop jSJshop0 = new JSJshop();
      JApplet jApplet0 = JSJshop.applet;
      JApplet jApplet1 = JSJshop.applet;
      JSPlanningProblem jSPlanningProblem0 = jSJshop0.prob();
      assertNull(jSPlanningProblem0);
  }

  /**
  //Test case number: 23
  /*Coverage entropy=1.0931471805599453
  */
  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      JSJshop jSJshop0 = new JSJshop();
      String string0 = ":4RfxH+_1qWI{<M&-";
      StringReader stringReader0 = new StringReader(":4RfxH+_1qWI{<M&-");
      stringReader0.mark(1876);
      StreamTokenizer streamTokenizer0 = new StreamTokenizer(stringReader0);
      streamTokenizer0.pushBack();
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
}
