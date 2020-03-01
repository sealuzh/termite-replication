/*
 * This file was automatically generated by EvoSuite
 * Thu Dec 05 17:17:15 GMT 2019
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
import java.awt.Window;
import java.awt.event.WindowEvent;
import java.util.Collection;
import javax.swing.JColorChooser;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.testdata.EvoSuiteFile;
import org.evosuite.runtime.testdata.FileSystemHandling;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class Controller_ESTest extends Controller_ESTest_scaffolding {

  /**
  //Test case number: 0
  /*Coverage entropy=0.3333333333333333
  */
  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Controller.removePropertyChangeListener((FreemindPropertyListener) null);
      boolean boolean0 = FileSystemHandling.appendStringToFile((EvoSuiteFile) null, "");
      assertFalse(boolean0);
  }

  /**
  //Test case number: 1
  /*Coverage entropy=0.4
  */
  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
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
  //Test case number: 2
  /*Coverage entropy=0.3333333333333333
  */
  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Controller.addPropertyChangeListener((FreemindPropertyListener) null);
  }

  /**
  //Test case number: 3
  /*Coverage entropy=0.3333333333333333
  */
  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      Color color0 = Color.green;
      Collection collection0 = Controller.getPropertyChangeListeners();
      assertNotNull(collection0);
  }

  /**
  //Test case number: 4
  /*Coverage entropy=0.3333333333333333
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
  /*Coverage entropy=1.5271837172395382
  */
  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      Color color0 = Color.CYAN;
      try { 
        Controller.showCommonJColorChooserDialog((Component) null, "selection_method", color0);
        fail("Expecting exception: HeadlessException");
      
      } catch(HeadlessException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.awt.GraphicsEnvironment", e);
      }
  }

  /**
  //Test case number: 6
  /*Coverage entropy=0.3333333333333333
  */
  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      JColorChooser jColorChooser0 = Controller.getCommonJColorChooser();
      assertFalse(jColorChooser0.isFocusTraversalPolicySet());
  }

  /**
  //Test case number: 7
  /*Coverage entropy=0.3333333333333333
  */
  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      Controller.Closer controller_Closer0 = new Controller.Closer();
      WindowEvent windowEvent0 = null;
      try {
        windowEvent0 = new WindowEvent((Window) null, 0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // null source
         //
         verifyException("java.util.EventObject", e);
      }
  }

  /**
  //Test case number: 8
  /*Coverage entropy=0.3333333333333333
  */
  @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      Controller.DisposeOnClose controller_DisposeOnClose0 = new Controller.DisposeOnClose();
  }

  /**
  //Test case number: 9
  /*Coverage entropy=1.5531577432135641
  */
  @Test(timeout = 4000)
  public void test9()  throws Throwable  {
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
}
