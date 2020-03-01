/*
 * This file was automatically generated by EvoSuite
 * Mon Dec 02 06:31:37 GMT 2019
 */

package freemind.controller;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import freemind.controller.Controller;
import freemind.main.FreeMind;
import freemind.main.FreeMindMain;
import freemind.modes.mindmapmode.MindMapMode;
import freemind.modes.schememode.SchemeMode;
import freemind.preferences.FreemindPropertyListener;
import java.awt.HeadlessException;
import java.awt.SystemColor;
import java.awt.event.MouseWheelEvent;
import java.io.File;
import java.util.Collection;
import java.util.Properties;
import javax.swing.Action;
import javax.swing.JColorChooser;
import javax.swing.JPasswordField;
import javax.swing.JTabbedPane;
import org.apache.xalan.transformer.TransformerIdentityImpl;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.testdata.EvoSuiteFile;
import org.evosuite.runtime.testdata.FileSystemHandling;
import org.junit.runner.RunWith;
import org.openstreetmap.gui.jmapviewer.OsmFileCacheTileLoader;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class Controller_ESTest extends Controller_ESTest_scaffolding {

  /**
  //Test case number: 0
  /*Coverage entropy=1.0931471805599453
  */
  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      JPasswordField jPasswordField0 = new JPasswordField();
      MouseWheelEvent mouseWheelEvent0 = new MouseWheelEvent(jPasswordField0, (-2216), (-2216), (-2216), (-2216), (-2216), (-2216), (-2216), (-2216), true, (-2216), (-2216), (-2216), (-2216));
      String string0 = Action.NAME;
      mouseWheelEvent0.setSource("Name");
      Controller.DisposeOnClose controller_DisposeOnClose0 = new Controller.DisposeOnClose();
      // Undeclared exception!
      try { 
        controller_DisposeOnClose0.componentHidden(mouseWheelEvent0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("freemind.controller.Controller$DisposeOnClose", e);
      }
  }

  /**
  //Test case number: 1
  /*Coverage entropy=0.3333333333333333
  */
  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      SchemeMode schemeMode0 = new SchemeMode();
      schemeMode0.getController();
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
  /*Coverage entropy=0.4
  */
  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
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
  //Test case number: 3
  /*Coverage entropy=0.3333333333333333
  */
  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      JPasswordField jPasswordField0 = new JPasswordField();
      MouseWheelEvent mouseWheelEvent0 = new MouseWheelEvent(jPasswordField0, (-1588), (-1588), (-1588), (-1588), (-2222), (-2222), (-1588), (-2222), false, (-2222), (-1588), (-1588), (-2222));
      Controller.addPropertyChangeListener((FreemindPropertyListener) null);
  }

  /**
  //Test case number: 4
  /*Coverage entropy=0.3333333333333333
  */
  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      SchemeMode schemeMode0 = new SchemeMode();
      schemeMode0.getController();
      Collection collection0 = Controller.getPropertyChangeListeners();
      assertNotNull(collection0);
  }

  /**
  //Test case number: 5
  /*Coverage entropy=1.5271837172395382
  */
  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      SystemColor systemColor0 = SystemColor.scrollbar;
      JPasswordField jPasswordField0 = new JPasswordField();
      try { 
        Controller.showCommonJColorChooserDialog(jPasswordField0, "", systemColor0);
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
      SystemColor systemColor0 = SystemColor.controlHighlight;
      SchemeMode schemeMode0 = new SchemeMode();
      JColorChooser jColorChooser0 = Controller.getCommonJColorChooser();
      assertTrue(jColorChooser0.getFocusTraversalKeysEnabled());
  }

  /**
  //Test case number: 7
  /*Coverage entropy=0.3333333333333333
  */
  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      FileSystemHandling fileSystemHandling0 = new FileSystemHandling();
      Controller.removePropertyChangeListener((FreemindPropertyListener) null);
      TransformerIdentityImpl transformerIdentityImpl0 = new TransformerIdentityImpl();
      Properties properties0 = transformerIdentityImpl0.getOutputProperties();
      transformerIdentityImpl0.unparsedEntityDecl("attributes_hide_all", "attributes_hide_all", "attributes_hide_all", "attributes_hide_all");
      FileSystemHandling.setPermissions((EvoSuiteFile) null, true, true, false);
      File file0 = OsmFileCacheTileLoader.getDefaultCacheDir();
      FreeMind freeMind0 = null;
      try {
        freeMind0 = new FreeMind(properties0, properties0, file0);
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
  /*Coverage entropy=1.5531577432135641
  */
  @Test(timeout = 4000)
  public void test8()  throws Throwable  {
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
  //Test case number: 9
  /*Coverage entropy=0.3333333333333333
  */
  @Test(timeout = 4000)
  public void test9()  throws Throwable  {
      MindMapMode mindMapMode0 = new MindMapMode();
      mindMapMode0.getController();
      JTabbedPane jTabbedPane0 = new JTabbedPane();
      Controller.Closer controller_Closer0 = new Controller.Closer();
  }
}
