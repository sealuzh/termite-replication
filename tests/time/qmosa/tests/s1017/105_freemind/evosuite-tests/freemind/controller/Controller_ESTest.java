/*
 * This file was automatically generated by EvoSuite
 * Mon Nov 30 04:45:57 GMT 2020
 */

package freemind.controller;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import freemind.controller.Controller;
import freemind.main.FreeMindMain;
import freemind.preferences.FreemindPropertyListener;
import java.awt.Color;
import java.awt.Component;
import java.awt.HeadlessException;
import java.awt.SystemColor;
import java.awt.event.ComponentEvent;
import java.awt.event.WindowEvent;
import java.util.Collection;
import java.util.Stack;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JPasswordField;
import javax.swing.table.DefaultTableColumnModel;
import javax.swing.table.JTableHeader;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class Controller_ESTest extends Controller_ESTest_scaffolding {

  /**
  //Test case number: 0
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Stack<JPasswordField> stack0 = new Stack<JPasswordField>();
      DefaultComboBoxModel<JPasswordField> defaultComboBoxModel0 = new DefaultComboBoxModel<JPasswordField>(stack0);
      JComboBox<JPasswordField> jComboBox0 = new JComboBox<JPasswordField>(defaultComboBoxModel0);
      SystemColor systemColor0 = SystemColor.windowBorder;
      try { 
        Controller.showCommonJColorChooserDialog(jComboBox0, (String) null, systemColor0);
        fail("Expecting exception: HeadlessException");
      
      } catch(HeadlessException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.awt.GraphicsEnvironment", e);
      }
  }

  /**
  //Test case number: 1
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      SystemColor systemColor0 = SystemColor.windowBorder;
      DefaultTableColumnModel defaultTableColumnModel0 = new DefaultTableColumnModel();
      JTableHeader jTableHeader0 = new JTableHeader(defaultTableColumnModel0);
      try { 
        Controller.showCommonJColorChooserDialog(jTableHeader0, "", systemColor0);
        fail("Expecting exception: HeadlessException");
      
      } catch(HeadlessException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.awt.GraphicsEnvironment", e);
      }
  }

  /**
  //Test case number: 2
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      SystemColor systemColor0 = SystemColor.desktop;
      try { 
        Controller.showCommonJColorChooserDialog((Component) null, "N<30mSKwW", systemColor0);
        fail("Expecting exception: HeadlessException");
      
      } catch(HeadlessException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.awt.GraphicsEnvironment", e);
      }
  }

  /**
  //Test case number: 3
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Controller.addPropertyChangeListener((FreemindPropertyListener) null);
  }

  /**
  //Test case number: 4
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Controller.Closer controller_Closer0 = new Controller.Closer();
      // Undeclared exception!
      try { 
        controller_Closer0.windowClosing((WindowEvent) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("freemind.controller.Controller$Closer", e);
      }
  }

  /**
  //Test case number: 5
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Controller.CloseAction controller_CloseAction0 = null;
      try {
        controller_CloseAction0 = new Controller.CloseAction((Controller) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("freemind.controller.Controller$CloseAction", e);
      }
  }

  /**
  //Test case number: 6
  /*Coverage entropy=1.5607104090414063
  */
  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Controller controller0 = null;
      try {
        controller0 = new Controller((FreeMindMain) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("freemind.controller.Controller", e);
      }
  }

  /**
  //Test case number: 7
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Controller.DisposeOnClose controller_DisposeOnClose0 = new Controller.DisposeOnClose();
      // Undeclared exception!
      try { 
        controller_DisposeOnClose0.componentHidden((ComponentEvent) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("freemind.controller.Controller$DisposeOnClose", e);
      }
  }

  /**
  //Test case number: 8
  /*Coverage entropy=0.6365141682948128
  */
  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      // Undeclared exception!
      try { 
        Controller.addPropertyChangeListenerAndPropagate((FreemindPropertyListener) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("freemind.controller.Controller", e);
      }
  }

  /**
  //Test case number: 9
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Collection collection0 = Controller.getPropertyChangeListeners();
      assertNotNull(collection0);
  }

  /**
  //Test case number: 10
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      DefaultTableColumnModel defaultTableColumnModel0 = new DefaultTableColumnModel();
      JTableHeader jTableHeader0 = new JTableHeader(defaultTableColumnModel0);
      try { 
        Controller.showCommonJColorChooserDialog(jTableHeader0, "accessories.plugins.AutomaticLayout", (Color) null);
        fail("Expecting exception: HeadlessException");
      
      } catch(HeadlessException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.awt.GraphicsEnvironment", e);
      }
  }
}
