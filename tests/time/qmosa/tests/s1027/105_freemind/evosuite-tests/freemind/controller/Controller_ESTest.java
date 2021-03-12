/*
 * This file was automatically generated by EvoSuite
 * Mon Nov 30 12:20:16 GMT 2020
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
import java.awt.event.WindowEvent;
import javax.swing.ImageIcon;
import javax.swing.JColorChooser;
import javax.swing.JPasswordField;
import javax.swing.JToggleButton;
import javax.swing.JTree;
import javax.swing.MenuElement;
import javax.swing.MenuSelectionManager;
import javax.swing.event.MenuDragMouseEvent;
import javax.swing.tree.TreeNode;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class Controller_ESTest extends Controller_ESTest_scaffolding {

  /**
  //Test case number: 0
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      JColorChooser jColorChooser0 = Controller.getCommonJColorChooser();
      assertTrue(jColorChooser0.getFocusTraversalKeysEnabled());
  }

  /**
  //Test case number: 1
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      JTree jTree0 = new JTree((TreeNode) null);
      try { 
        Controller.showCommonJColorChooserDialog(jTree0, "", (Color) null);
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
  public void test2()  throws Throwable  {
      Color color0 = Color.green;
      try { 
        Controller.showCommonJColorChooserDialog((Component) null, (String) null, color0);
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
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
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
  //Test case number: 4
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
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
  //Test case number: 5
  /*Coverage entropy=1.5607104090414063
  */
  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
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
  //Test case number: 6
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      Controller.DisposeOnClose controller_DisposeOnClose0 = new Controller.DisposeOnClose();
      ImageIcon imageIcon0 = new ImageIcon("T8h-)s6!v``7C.");
      JToggleButton jToggleButton0 = new JToggleButton("T8h-)s6!v``7C.", imageIcon0, true);
      MenuSelectionManager menuSelectionManager0 = new MenuSelectionManager();
      MenuDragMouseEvent menuDragMouseEvent0 = new MenuDragMouseEvent(jToggleButton0, 4145, 4145, 45, 45, 4145, 45, 45, 45, true, (MenuElement[]) null, menuSelectionManager0);
      // Undeclared exception!
      try { 
        controller_DisposeOnClose0.componentHidden(menuDragMouseEvent0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // javax.swing.JToggleButton cannot be cast to java.awt.Window
         //
         verifyException("freemind.controller.Controller$DisposeOnClose", e);
      }
  }

  /**
  //Test case number: 7
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      JPasswordField jPasswordField0 = new JPasswordField(0);
      Color color0 = Color.green;
      try { 
        Controller.showCommonJColorChooserDialog(jPasswordField0, "TF[+etIsdw?Y", color0);
        fail("Expecting exception: HeadlessException");
      
      } catch(HeadlessException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.awt.GraphicsEnvironment", e);
      }
  }

  /**
  //Test case number: 8
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      Controller.removePropertyChangeListener((FreemindPropertyListener) null);
  }
}
