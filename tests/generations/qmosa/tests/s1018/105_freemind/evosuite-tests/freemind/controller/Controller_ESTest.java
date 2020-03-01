/*
 * This file was automatically generated by EvoSuite
 * Mon Nov 18 16:03:08 GMT 2019
 */

package freemind.controller;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import freemind.controller.Controller;
import freemind.main.FreeMindApplet;
import freemind.main.FreeMindMain;
import freemind.modes.schememode.SchemeMode;
import freemind.preferences.FreemindPropertyListener;
import java.awt.AWTEventMulticaster;
import java.awt.Color;
import java.awt.HeadlessException;
import java.awt.event.FocusEvent;
import java.awt.event.InputMethodListener;
import javax.help.DefaultHelpModel;
import javax.help.HelpSet;
import javax.help.JHelpNavigator;
import javax.help.JHelpTOCNavigator;
import javax.help.Map;
import javax.help.NavigatorView;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.text.DefaultStyledDocument;
import javax.swing.text.StyleContext;
import javax.swing.tree.DefaultTreeCellRenderer;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;
import plugins.collaboration.socket.SocketConnectionHook;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class Controller_ESTest extends Controller_ESTest_scaffolding {

  /**
  //Test case number: 0
  /*Coverage entropy=1.0365141682948127
  */
  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
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
  //Test case number: 1
  /*Coverage entropy=0.3333333333333333
  */
  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      SchemeMode schemeMode0 = new SchemeMode();
      SchemeMode schemeMode1 = new SchemeMode();
      SchemeMode schemeMode2 = new SchemeMode();
      schemeMode2.getController();
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
  /*Coverage entropy=1.0931471805599453
  */
  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Controller.DisposeOnClose controller_DisposeOnClose0 = new Controller.DisposeOnClose();
      HelpSet helpSet0 = new HelpSet();
      DefaultHelpModel defaultHelpModel0 = new DefaultHelpModel(helpSet0);
      JHelpTOCNavigator jHelpTOCNavigator0 = new JHelpTOCNavigator((NavigatorView) null, defaultHelpModel0);
      StyleContext styleContext0 = new StyleContext();
      DefaultStyledDocument defaultStyledDocument0 = new DefaultStyledDocument(styleContext0);
      int int0 = 1053;
      defaultHelpModel0.setCurrentID((Map.ID) null, "", (JHelpNavigator) jHelpTOCNavigator0);
      FocusEvent focusEvent0 = new FocusEvent(jHelpTOCNavigator0, 1053, true);
      // Undeclared exception!
      try { 
        controller_DisposeOnClose0.componentHidden(focusEvent0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // javax.help.JHelpTOCNavigator cannot be cast to java.awt.Window
         //
         verifyException("freemind.controller.Controller$DisposeOnClose", e);
      }
  }

  /**
  //Test case number: 3
  /*Coverage entropy=1.5271837172395382
  */
  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      DefaultTableCellRenderer defaultTableCellRenderer0 = new DefaultTableCellRenderer();
      DefaultTableCellRenderer defaultTableCellRenderer1 = new DefaultTableCellRenderer();
      DefaultTreeCellRenderer defaultTreeCellRenderer0 = new DefaultTreeCellRenderer();
      DefaultTreeCellRenderer defaultTreeCellRenderer1 = new DefaultTreeCellRenderer();
      Color color0 = defaultTreeCellRenderer1.getBorderSelectionColor();
      try { 
        Controller.showCommonJColorChooserDialog(defaultTreeCellRenderer0, "Mc%bex+teWuQ$1@xK", color0);
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
  /*Coverage entropy=1.786724494755577
  */
  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      InputMethodListener inputMethodListener0 = mock(InputMethodListener.class, new ViolatedAssumptionAnswer());
      AWTEventMulticaster.remove(inputMethodListener0, inputMethodListener0);
      AWTEventMulticaster.add((InputMethodListener) null, (InputMethodListener) null);
      AWTEventMulticaster.add((InputMethodListener) null, (InputMethodListener) null);
      AWTEventMulticaster.remove((InputMethodListener) null, (InputMethodListener) null);
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
  //Test case number: 5
  /*Coverage entropy=1.786724494755577
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
  /*Coverage entropy=0.3333333333333333
  */
  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      Controller.getPropertyChangeListeners();
      SocketConnectionHook socketConnectionHook0 = new SocketConnectionHook();
      FreeMindApplet freeMindApplet0 = null;
      try {
        freeMindApplet0 = new FreeMindApplet();
        fail("Expecting exception: HeadlessException");
      
      } catch(HeadlessException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.applet.Applet", e);
      }
  }
}
