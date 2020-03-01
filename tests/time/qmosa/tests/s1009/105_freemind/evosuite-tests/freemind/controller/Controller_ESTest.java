/*
 * This file was automatically generated by EvoSuite
 * Tue Dec 03 20:52:13 GMT 2019
 */

package freemind.controller;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import freemind.controller.Controller;
import freemind.main.FreeMindMain;
import freemind.modes.browsemode.BrowseMode;
import freemind.modes.filemode.FileMode;
import freemind.view.mindmapview.MultipleImage;
import java.awt.Dimension;
import java.awt.HeadlessException;
import java.awt.SystemColor;
import java.awt.geom.AffineTransform;
import java.util.Vector;
import javax.swing.Box;
import javax.swing.JList;
import javax.swing.JMenuBar;
import javax.swing.JRadioButtonMenuItem;
import javax.swing.JTabbedPane;
import org.apache.batik.gvt.CanvasGraphicsNode;
import org.apache.html.dom.HTMLDocumentImpl;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class Controller_ESTest extends Controller_ESTest_scaffolding {

  /**
  //Test case number: 0
  /*Coverage entropy=0.3333333333333333
  */
  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
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
  //Test case number: 1
  /*Coverage entropy=0.3333333333333333
  */
  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      JMenuBar jMenuBar0 = new JMenuBar();
      FileMode fileMode0 = new FileMode();
      Controller.getCommonJColorChooser();
      Dimension dimension0 = new Dimension();
      Box.Filler box_Filler0 = new Box.Filler(dimension0, dimension0, dimension0);
      CanvasGraphicsNode canvasGraphicsNode0 = new CanvasGraphicsNode();
      canvasGraphicsNode0.getFilter();
      HTMLDocumentImpl hTMLDocumentImpl0 = new HTMLDocumentImpl();
      CanvasGraphicsNode canvasGraphicsNode1 = new CanvasGraphicsNode();
      AffineTransform affineTransform0 = canvasGraphicsNode1.getPositionTransform();
      assertNull(affineTransform0);
  }

  /**
  //Test case number: 2
  /*Coverage entropy=1.786724494755577
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
  /*Coverage entropy=1.5271837172395382
  */
  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      SystemColor systemColor0 = SystemColor.menu;
      MultipleImage multipleImage0 = new MultipleImage(-0.0);
      SystemColor systemColor1 = SystemColor.scrollbar;
      JRadioButtonMenuItem jRadioButtonMenuItem0 = new JRadioButtonMenuItem("^t&W%/-B})_^7i9/3sE");
      jRadioButtonMenuItem0.isOptimizedDrawingEnabled();
      Vector<JTabbedPane> vector0 = new Vector<JTabbedPane>();
      JList<JTabbedPane> jList0 = new JList<JTabbedPane>(vector0);
      try { 
        Controller.showCommonJColorChooserDialog(jList0, "org.apache.batik.util.gui.resource.MenuFactory", systemColor0);
        fail("Expecting exception: HeadlessException");
      
      } catch(HeadlessException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.awt.GraphicsEnvironment", e);
      }
  }
}
