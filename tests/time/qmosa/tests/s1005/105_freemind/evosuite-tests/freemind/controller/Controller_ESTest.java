/*
 * This file was automatically generated by EvoSuite
 * Tue Dec 03 17:35:33 GMT 2019
 */

package freemind.controller;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import freemind.controller.Controller;
import freemind.main.FreeMindMain;
import freemind.modes.MindMap;
import freemind.modes.browsemode.BrowseMode;
import freemind.modes.mindmapmode.MindMapNodeModel;
import java.awt.Color;
import java.awt.HeadlessException;
import java.awt.event.MouseEvent;
import java.awt.event.WindowEvent;
import java.beans.VetoableChangeListener;
import java.beans.VetoableChangeListenerProxy;
import javax.swing.JEditorPane;
import javax.swing.JLayeredPane;
import javax.swing.JMenu;
import javax.swing.MenuElement;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.evosuite.runtime.testdata.FileSystemHandling;
import org.junit.runner.RunWith;
import plugins.map.MapDialog;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class Controller_ESTest extends Controller_ESTest_scaffolding {

  /**
  //Test case number: 0
  /*Coverage entropy=1.0931471805599453
  */
  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      FileSystemHandling.shouldAllThrowIOExceptions();
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
  //Test case number: 1
  /*Coverage entropy=1.0931471805599453
  */
  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Controller.DisposeOnClose controller_DisposeOnClose0 = new Controller.DisposeOnClose();
      JLayeredPane jLayeredPane0 = new JLayeredPane();
      int int0 = 0;
      jLayeredPane0.setName("antialiasEdges");
      int int1 = 0;
      int int2 = 0;
      MouseEvent mouseEvent0 = new MouseEvent(jLayeredPane0, 0, 0, 0, 0, 0, 4321, true);
      mouseEvent0.setSource((Object) null);
      // Undeclared exception!
      try { 
        controller_DisposeOnClose0.componentHidden(mouseEvent0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("freemind.controller.Controller$DisposeOnClose", e);
      }
  }

  /**
  //Test case number: 2
  /*Coverage entropy=0.3333333333333333
  */
  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      JMenu jMenu0 = new JMenu();
      MenuElement[] menuElementArray0 = new MenuElement[19];
      menuElementArray0[0] = (MenuElement) jMenu0;
      menuElementArray0[13] = (MenuElement) jMenu0;
      BrowseMode browseMode0 = new BrowseMode();
      browseMode0.getController();
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
  //Test case number: 3
  /*Coverage entropy=1.786724494755577
  */
  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      int int0 = (-88);
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
  //Test case number: 4
  /*Coverage entropy=0.3333333333333333
  */
  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      Controller.getCommonJColorChooser();
      MapDialog mapDialog0 = new MapDialog();
      MindMapNodeModel mindMapNodeModel0 = null;
      try {
        mindMapNodeModel0 = new MindMapNodeModel((FreeMindMain) null, (MindMap) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("freemind.modes.NodeAdapter", e);
      }
  }

  /**
  //Test case number: 5
  /*Coverage entropy=1.5271837172395382
  */
  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      VetoableChangeListener vetoableChangeListener0 = mock(VetoableChangeListener.class, new ViolatedAssumptionAnswer());
      VetoableChangeListenerProxy vetoableChangeListenerProxy0 = new VetoableChangeListenerProxy("Remove tab:", vetoableChangeListener0);
      VetoableChangeListenerProxy vetoableChangeListenerProxy1 = new VetoableChangeListenerProxy("*cl,=3R", vetoableChangeListenerProxy0);
      JEditorPane jEditorPane0 = new JEditorPane();
      VetoableChangeListenerProxy vetoableChangeListenerProxy2 = new VetoableChangeListenerProxy((String) null, vetoableChangeListenerProxy1);
      jEditorPane0.removeVetoableChangeListener(vetoableChangeListenerProxy0);
      JEditorPane jEditorPane1 = new JEditorPane("r<Z+F", "");
      Color color0 = jEditorPane0.getDisabledTextColor();
      color0.getColorSpace();
      try { 
        Controller.showCommonJColorChooserDialog(jEditorPane0, "4Do", color0);
        fail("Expecting exception: HeadlessException");
      
      } catch(HeadlessException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.awt.GraphicsEnvironment", e);
      }
  }
}
