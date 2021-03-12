/*
 * This file was automatically generated by EvoSuite
 * Tue Nov 10 19:01:03 GMT 2020
 */

package freemind.controller;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import freemind.controller.Controller;
import freemind.main.FreeMindMain;
import java.awt.Color;
import java.awt.HeadlessException;
import java.awt.event.MouseWheelEvent;
import javax.swing.JColorChooser;
import javax.swing.JTextArea;
import javax.swing.text.DefaultStyledDocument;
import javax.swing.text.StyleContext;
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
      Controller.Closer controller_Closer0 = new Controller.Closer();
  }

  /**
  //Test case number: 1
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
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
  //Test case number: 2
  /*Coverage entropy=1.5607104090414063
  */
  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
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
  //Test case number: 3
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      StyleContext styleContext0 = StyleContext.getDefaultStyleContext();
      DefaultStyledDocument defaultStyledDocument0 = new DefaultStyledDocument(styleContext0);
      JTextArea jTextArea0 = new JTextArea(defaultStyledDocument0);
      Color color0 = Color.ORANGE;
      try { 
        Controller.showCommonJColorChooserDialog(jTextArea0, "UI)8wL^}=f|hfAS^", color0);
        fail("Expecting exception: HeadlessException");
      
      } catch(HeadlessException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.awt.GraphicsEnvironment", e);
      }
  }

  /**
  //Test case number: 4
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      JColorChooser jColorChooser0 = Controller.getCommonJColorChooser();
      Controller.DisposeOnClose controller_DisposeOnClose0 = new Controller.DisposeOnClose();
      MouseWheelEvent mouseWheelEvent0 = new MouseWheelEvent(jColorChooser0, (-130), (-130), 63194, (-130), (-130), (-175), false, 63194, 320, 1667);
      // Undeclared exception!
      try { 
        controller_DisposeOnClose0.componentHidden(mouseWheelEvent0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // javax.swing.JColorChooser cannot be cast to java.awt.Window
         //
         verifyException("freemind.controller.Controller$DisposeOnClose", e);
      }
  }
}
