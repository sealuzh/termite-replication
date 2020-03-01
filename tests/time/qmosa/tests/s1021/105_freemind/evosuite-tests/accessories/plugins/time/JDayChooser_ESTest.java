/*
 * This file was automatically generated by EvoSuite
 * Wed Dec 04 05:52:50 GMT 2019
 */

package accessories.plugins.time;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import accessories.plugins.time.JDayChooser;
import accessories.plugins.time.JMonthChooser;
import accessories.plugins.time.JYearChooser;
import freemind.modes.browsemode.BrowseController;
import freemind.modes.browsemode.BrowseMode;
import java.awt.AWTEventMulticaster;
import java.awt.Color;
import java.awt.ComponentOrientation;
import java.awt.HeadlessException;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.FocusEvent;
import java.awt.event.HierarchyListener;
import java.awt.event.KeyEvent;
import java.awt.event.MouseWheelListener;
import java.awt.image.ImageObserver;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeListenerProxy;
import java.io.DataOutputStream;
import java.sql.Timestamp;
import java.text.ParsePosition;
import java.time.LocalDateTime;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import javax.swing.AbstractButton;
import javax.swing.ImageIcon;
import javax.swing.InputVerifier;
import javax.swing.JButton;
import javax.swing.JCheckBoxMenuItem;
import javax.swing.JEditorPane;
import javax.swing.JFrame;
import javax.swing.JInternalFrame;
import javax.swing.JMenuItem;
import javax.swing.JPopupMenu;
import javax.swing.JRadioButtonMenuItem;
import javax.swing.JScrollBar;
import javax.swing.MenuElement;
import javax.swing.MenuSelectionManager;
import javax.swing.plaf.metal.MetalComboBoxUI;
import org.apache.fop.svg.PDFDocumentGraphics2D;
import org.apache.xalan.processor.StylesheetHandler;
import org.apache.xalan.processor.TransformerFactoryImpl;
import org.apache.xerces.util.SymbolTable;
import org.apache.xerces.util.XMLGrammarPoolImpl;
import org.apache.xml.serializer.ToUnknownStream;
import org.apache.xpath.XPathContext;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.System;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.evosuite.runtime.mock.java.text.MockSimpleDateFormat;
import org.evosuite.runtime.mock.java.util.MockGregorianCalendar;
import org.evosuite.runtime.testdata.EvoSuiteFile;
import org.evosuite.runtime.testdata.FileSystemHandling;
import org.hsqldb.rowio.RowOutputBinary;
import org.junit.runner.RunWith;
import plugins.map.MapDialog;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class JDayChooser_ESTest extends JDayChooser_ESTest_scaffolding {

  /**
  //Test case number: 0
  /*Coverage entropy=3.1336533618782805
  */
  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      String[] stringArray0 = new String[7];
      stringArray0[6] = "]jFmT:$i2exH>c";
      JDayChooser jDayChooser0 = new JDayChooser();
      jDayChooser0.getLocale();
      assertTrue(jDayChooser0.isDayBordersVisible());
      assertEquals(14, jDayChooser0.getDay());
      assertTrue(jDayChooser0.isDecorationBackgroundVisible());
  }

  /**
  //Test case number: 1
  /*Coverage entropy=3.096538374336882
  */
  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      JDayChooser jDayChooser0 = new JDayChooser(false);
      JMonthChooser jMonthChooser0 = jDayChooser0.monthChooser;
      jDayChooser0.setMonthChooser((JMonthChooser) null);
      int int0 = 33;
      char char0 = '7';
      MenuElement[] menuElementArray0 = new MenuElement[7];
      JMenuItem jMenuItem0 = new JMenuItem();
      menuElementArray0[0] = (MenuElement) jMenuItem0;
      JPopupMenu jPopupMenu0 = new JPopupMenu();
      menuElementArray0[1] = (MenuElement) jPopupMenu0;
      String string0 = null;
      ImageIcon imageIcon0 = new ImageIcon("[op\"", ">j@XJEJEeyFJ\"wR-");
      JCheckBoxMenuItem jCheckBoxMenuItem0 = new JCheckBoxMenuItem((String) null, imageIcon0, false);
      menuElementArray0[2] = (MenuElement) jCheckBoxMenuItem0;
      JRadioButtonMenuItem jRadioButtonMenuItem0 = new JRadioButtonMenuItem(imageIcon0, false);
      menuElementArray0[3] = (MenuElement) jRadioButtonMenuItem0;
      ToUnknownStream toUnknownStream0 = new ToUnknownStream();
      // Undeclared exception!
      try { 
        toUnknownStream0.getOutputFormat();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.xml.serializer.SerializerBase", e);
      }
  }

  /**
  //Test case number: 2
  /*Coverage entropy=3.1337055042791775
  */
  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      JDayChooser jDayChooser0 = new JDayChooser();
      JDayChooser.DecoratorButton jDayChooser_DecoratorButton0 = jDayChooser0.new DecoratorButton();
      jDayChooser_DecoratorButton0.firePropertyChange("day", true, true);
      jDayChooser_DecoratorButton0.removeActionListener(jDayChooser0);
      jDayChooser_DecoratorButton0.isFocusPainted();
      jDayChooser_DecoratorButton0.isFocusable();
      jDayChooser0.drawDays();
      JFrame jFrame0 = null;
      try {
        jFrame0 = new JFrame("day");
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
  /*Coverage entropy=3.1336666818916004
  */
  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      JYearChooser jYearChooser0 = new JYearChooser();
      JDayChooser jDayChooser0 = new JDayChooser();
      jDayChooser0.setYearChooser(jYearChooser0);
      jDayChooser0.setDayBordersVisible(true);
      assertTrue(jDayChooser0.isDecorationBackgroundVisible());
      assertEquals(14, jDayChooser0.getDay());
      assertTrue(jDayChooser0.isDayBordersVisible());
  }

  /**
  //Test case number: 4
  /*Coverage entropy=3.255971117449338
  */
  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      JDayChooser jDayChooser0 = new JDayChooser(true);
      jDayChooser0.getMaxSelectableDate();
      FocusEvent focusEvent0 = new FocusEvent(jDayChooser0, 65610);
      focusEvent0.paramString();
      jDayChooser0.focusLost(focusEvent0);
      jDayChooser0.repaint((-1134L));
      jDayChooser0.firePropertyChange("unknown type,permanent,opposite=null", (-1735.1575F), 0.0F);
      jDayChooser0.setDayBordersVisible(true);
      FileSystemHandling.createFolder((EvoSuiteFile) null);
      jDayChooser0.setYear((-1065));
      jDayChooser0.setMaxDayCharacters((-1166));
      int int0 = jDayChooser0.getDay();
      assertEquals(14, int0);
      assertEquals(0, jDayChooser0.getMaxDayCharacters());
      assertTrue(jDayChooser0.isDayBordersVisible());
  }

  /**
  //Test case number: 5
  /*Coverage entropy=3.3377421602909365
  */
  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      JDayChooser jDayChooser0 = new JDayChooser();
      JEditorPane jEditorPane0 = new JEditorPane();
      Color color0 = jEditorPane0.getSelectedTextColor();
      FileSystemHandling.shouldAllThrowIOExceptions();
      Color color1 = new Color(0);
      Color.getColor("V_D_'];/");
      Color.getColor("V_D_'];/", color1);
      Color.getColor("", color0);
      jDayChooser0.setForeground(color1);
      jDayChooser0.getHeight();
      jDayChooser0.setDayBordersVisible(false);
      jDayChooser0.setFocus();
      jDayChooser0.getWeekdayForeground();
      Timestamp timestamp0 = new Timestamp(0L);
      jDayChooser0.setMaxSelectableDate(timestamp0);
      JInternalFrame jInternalFrame0 = new JInternalFrame("4");
      FocusEvent focusEvent0 = new FocusEvent(jDayChooser0, 0, true, jEditorPane0);
      jDayChooser0.focusLost(focusEvent0);
      jDayChooser0.setWeekOfYearVisible(true);
      assertFalse(jDayChooser0.isDayBordersVisible());
      
      JDayChooser jDayChooser1 = new JDayChooser(true);
      assertTrue(jDayChooser1.isDayBordersVisible());
      
      jDayChooser1.setDayBordersVisible(false);
      jDayChooser1.setEnabled(false);
      assertTrue(jDayChooser1.isWeekOfYearVisible());
  }

  /**
  //Test case number: 6
  /*Coverage entropy=3.169980761415708
  */
  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      FileSystemHandling.createFolder((EvoSuiteFile) null);
      JDayChooser jDayChooser0 = new JDayChooser();
      MenuSelectionManager menuSelectionManager0 = new MenuSelectionManager();
      jDayChooser0.setFocus();
      MockSimpleDateFormat mockSimpleDateFormat0 = new MockSimpleDateFormat("day");
      ParsePosition parsePosition0 = new ParsePosition(28);
      mockSimpleDateFormat0.parse("day", parsePosition0);
      jDayChooser0.setMaxSelectableDate((Date) null);
      jDayChooser0.drawWeeks();
      assertTrue(jDayChooser0.isDayBordersVisible());
      assertEquals(14, jDayChooser0.getDay());
  }

  /**
  //Test case number: 7
  /*Coverage entropy=3.1286781254653357
  */
  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      FileSystemHandling fileSystemHandling0 = new FileSystemHandling();
      JDayChooser jDayChooser0 = new JDayChooser(true);
      jDayChooser0.setDayBordersVisible(false);
      jDayChooser0.setFocus();
      assertEquals(14, jDayChooser0.getDay());
      
      jDayChooser0.setDay(1508);
      KeyEvent.getExtendedKeyCodeForChar(4);
      jDayChooser0.getMaxDayCharacters();
      assertEquals(28, jDayChooser0.getDay());
  }

  /**
  //Test case number: 8
  /*Coverage entropy=3.096538374336882
  */
  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      JDayChooser jDayChooser0 = new JDayChooser(false);
      jDayChooser0.getMinSelectableDate();
      int int0 = 28;
      MouseWheelListener mouseWheelListener0 = null;
      JScrollBar jScrollBar0 = null;
      try {
        jScrollBar0 = new JScrollBar(28, 2065, 2065, 31, 919);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // orientation must be one of: VERTICAL, HORIZONTAL
         //
         verifyException("javax.swing.JScrollBar", e);
      }
  }

  /**
  //Test case number: 9
  /*Coverage entropy=3.096591278091726
  */
  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      String[] stringArray0 = new String[7];
      stringArray0[6] = "]jFmT:$ixH>c";
      JDayChooser jDayChooser0 = new JDayChooser(false);
      jDayChooser0.setDayBordersVisible(false);
      Color color0 = Color.orange;
      jDayChooser0.setSundayForeground(color0);
      assertFalse(jDayChooser0.isDayBordersVisible());
  }

  /**
  //Test case number: 10
  /*Coverage entropy=3.1337055042791775
  */
  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      JDayChooser jDayChooser0 = new JDayChooser();
      JEditorPane jEditorPane0 = new JEditorPane();
      jEditorPane0.getSelectedTextColor();
      float[] floatArray0 = new float[4];
      floatArray0[0] = (-1.0F);
      Locale locale0 = Locale.FRANCE;
      locale0.getExtensionKeys();
      Locale.forLanguageTag("?P(q.bD~33B=%5<}[P");
      jDayChooser0.setLocale(locale0);
      assertFalse(jDayChooser0.isDecorationBordersVisible());
      assertTrue(jDayChooser0.isDayBordersVisible());
      assertEquals(14, jDayChooser0.getDay());
  }

  /**
  //Test case number: 11
  /*Coverage entropy=3.268839384427386
  */
  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      FileSystemHandling.appendLineToFile((EvoSuiteFile) null, "Windows");
      JDayChooser jDayChooser0 = new JDayChooser(true);
      JInternalFrame jInternalFrame0 = new JInternalFrame("day", true, true);
      jInternalFrame0.setClosable(true);
      Rectangle rectangle0 = jInternalFrame0.getNormalBounds();
      rectangle0.setSize(10, 10);
      jDayChooser0.setBounds(rectangle0);
      jDayChooser0.getDayPanel();
      jDayChooser0.getAutoscrolls();
      jDayChooser0.firePropertyChange("Windows", 't', 't');
      jDayChooser0.setMaxSelectableDate((Date) null);
      Color color0 = jDayChooser0.getSundayForeground();
      assertEquals(0, color0.getGreen());
      
      Color color1 = jDayChooser0.getWeekdayForeground();
      assertTrue(jDayChooser0.isDayBordersVisible());
      
      jDayChooser0.setDayBordersVisible(true);
      jDayChooser0.setDecorationBackgroundColor(color1);
      jDayChooser0.drawWeeks();
      assertEquals(14, jDayChooser0.getDay());
  }

  /**
  //Test case number: 12
  /*Coverage entropy=3.3472659385777783
  */
  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      JDayChooser jDayChooser0 = new JDayChooser(true);
      Date date0 = jDayChooser0.getMaxSelectableDate();
      FocusEvent focusEvent0 = new FocusEvent(jDayChooser0, 65610);
      focusEvent0.paramString();
      jDayChooser0.focusLost(focusEvent0);
      jDayChooser0.repaint((-1134L));
      jDayChooser0.getInheritsPopupMenu();
      Color color0 = new Color(0);
      Color.getColor("freemind.view.mindmapview.MapView$CheckLaterForCenterNodeTask");
      Color.getColor((String) null, color0);
      Color.getColor("day", color0);
      jDayChooser0.setForeground(color0);
      jDayChooser0.getHeight();
      assertTrue(jDayChooser0.isDayBordersVisible());
      
      jDayChooser0.setDayBordersVisible(false);
      jDayChooser0.setFocus();
      jDayChooser0.getWeekdayForeground();
      jDayChooser0.setMaxSelectableDate(date0);
      JInternalFrame jInternalFrame0 = new JInternalFrame((String) null);
      FocusEvent focusEvent1 = new FocusEvent(jInternalFrame0, 7, false, jInternalFrame0);
      jDayChooser0.focusLost(focusEvent0);
      jDayChooser0.setWeekOfYearVisible(false);
      jDayChooser0.setDayBordersVisible(false);
      jDayChooser0.setEnabled(true);
      assertTrue(jDayChooser0.isDecorationBackgroundVisible());
  }

  /**
  //Test case number: 13
  /*Coverage entropy=3.3692629923615307
  */
  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      JDayChooser jDayChooser0 = new JDayChooser(true);
      Date date0 = jDayChooser0.getMaxSelectableDate();
      jDayChooser0.repaint((-1134L));
      jDayChooser0.getInheritsPopupMenu();
      Color color0 = new Color(0);
      Color.getColor("freemind.view.mindmapview.MapView$CheckLaterForCenterNodeTask");
      Color.getColor((String) null, color0);
      Color.getColor("day", color0);
      jDayChooser0.setForeground(color0);
      jDayChooser0.getHeight();
      jDayChooser0.setDayBordersVisible(false);
      jDayChooser0.setFocus();
      jDayChooser0.getWeekdayForeground();
      jDayChooser0.setMaxSelectableDate(date0);
      assertTrue(jDayChooser0.isWeekOfYearVisible());
      
      jDayChooser0.setWeekOfYearVisible(false);
      jDayChooser0.setDayBordersVisible(false);
      jDayChooser0.setEnabled(true);
      jDayChooser0.setSelectableDateRange(date0, date0);
      jDayChooser0.setEnabled(true);
      assertEquals(14, jDayChooser0.getDay());
  }

  /**
  //Test case number: 14
  /*Coverage entropy=3.205447973345968
  */
  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      JDayChooser jDayChooser0 = new JDayChooser();
      JEditorPane jEditorPane0 = new JEditorPane();
      jEditorPane0.getSelectedTextColor();
      float[] floatArray0 = new float[4];
      floatArray0[0] = (-1.0F);
      floatArray0[1] = 0.0F;
      floatArray0[2] = (-1735.1575F);
      JInternalFrame jInternalFrame0 = new JInternalFrame("West");
      jInternalFrame0.getComponentPopupMenu();
      FocusEvent focusEvent0 = new FocusEvent(jDayChooser0, 89, true, jDayChooser0);
      focusEvent0.getOppositeComponent();
      focusEvent0.getOppositeComponent();
      jDayChooser0.focusLost(focusEvent0);
      jDayChooser0.setWeekOfYearVisible(false);
      assertTrue(jDayChooser0.isDayBordersVisible());
      
      jDayChooser0.setDayBordersVisible(true);
      jDayChooser0.setFocus();
      assertEquals(14, jDayChooser0.getDay());
  }

  /**
  //Test case number: 15
  /*Coverage entropy=3.1609096373188827
  */
  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      JDayChooser jDayChooser0 = new JDayChooser();
      FileSystemHandling.createFolder((EvoSuiteFile) null);
      jDayChooser0.setMaxDayCharacters(11);
      assertFalse(jDayChooser0.isDecorationBordersVisible());
      assertTrue(jDayChooser0.isDayBordersVisible());
      assertEquals(14, jDayChooser0.getDay());
      assertEquals(0, jDayChooser0.getMaxDayCharacters());
  }

  /**
  //Test case number: 16
  /*Coverage entropy=3.0965652109688846
  */
  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      JDayChooser jDayChooser0 = new JDayChooser(false);
      jDayChooser0.getSundayForeground();
      JDayChooser.DecoratorButton jDayChooser_DecoratorButton0 = jDayChooser0.new DecoratorButton();
      MapDialog mapDialog0 = new MapDialog();
      // Undeclared exception!
      try { 
        mapDialog0.getRegistration();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("freemind.extensions.HookAdapter", e);
      }
  }

  /**
  //Test case number: 17
  /*Coverage entropy=3.1336533618782805
  */
  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      JDayChooser jDayChooser0 = new JDayChooser();
      ActionEvent actionEvent0 = new ActionEvent(jDayChooser0, 0, "day", 388);
      actionEvent0.setSource(jDayChooser0);
      actionEvent0.setSource(jDayChooser0);
      // Undeclared exception!
      try { 
        jDayChooser0.actionPerformed(actionEvent0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // accessories.plugins.time.JDayChooser cannot be cast to javax.swing.JButton
         //
         verifyException("accessories.plugins.time.JDayChooser", e);
      }
  }

  /**
  //Test case number: 18
  /*Coverage entropy=3.096538374336882
  */
  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      JDayChooser jDayChooser0 = new JDayChooser(true);
      jDayChooser0.selectedDay = null;
      jDayChooser0.isWeekOfYearVisible();
      Color color0 = Color.white;
      String string0 = "";
      MetalComboBoxUI metalComboBoxUI0 = new MetalComboBoxUI();
      PropertyChangeListener propertyChangeListener0 = metalComboBoxUI0.createPropertyChangeListener();
      PropertyChangeListenerProxy propertyChangeListenerProxy0 = new PropertyChangeListenerProxy("", propertyChangeListener0);
      Timestamp timestamp0 = new Timestamp(3999L);
      LocalDateTime localDateTime0 = timestamp0.toLocalDateTime();
      PropertyChangeEvent propertyChangeEvent0 = new PropertyChangeEvent(localDateTime0, "", propertyChangeListener0, metalComboBoxUI0);
      // Undeclared exception!
      try { 
        propertyChangeListenerProxy0.propertyChange(propertyChangeEvent0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // java.time.LocalDateTime cannot be cast to javax.swing.JComboBox
         //
         verifyException("javax.swing.plaf.basic.BasicComboBoxUI$Handler", e);
      }
  }

  /**
  //Test case number: 19
  /*Coverage entropy=3.1867270210280028
  */
  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      int int0 = ImageObserver.ABORT;
      JDayChooser jDayChooser0 = new JDayChooser();
      Locale locale0 = Locale.FRANCE;
      FileSystemHandling.shouldThrowIOException((EvoSuiteFile) null);
      locale0.clone();
      Locale.getISOLanguages();
      locale0.getExtensionKeys();
      Locale.forLanguageTag("day");
      FileSystemHandling.createFolder((EvoSuiteFile) null);
      KeyEvent.getExtendedKeyCodeForChar(14);
      JButton jButton0 = jDayChooser0.getSelectedDay();
      assertNull(jButton0);
      
      jDayChooser0.setMaxDayCharacters((-1211));
      assertEquals(14, jDayChooser0.getDay());
      assertTrue(jDayChooser0.isDecorationBackgroundVisible());
      assertFalse(jDayChooser0.isDecorationBordersVisible());
      assertTrue(jDayChooser0.isDayBordersVisible());
  }

  /**
  //Test case number: 20
  /*Coverage entropy=3.096538374336882
  */
  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      JDayChooser jDayChooser0 = new JDayChooser(false);
      jDayChooser0.isWeekOfYearVisible();
      assertEquals(14, jDayChooser0.getDay());
  }

  /**
  //Test case number: 21
  /*Coverage entropy=3.0540989150393463
  */
  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      FileSystemHandling.shouldAllThrowIOExceptions();
      JDayChooser jDayChooser0 = new JDayChooser(false);
      jDayChooser0.setDay(788);
      FileSystemHandling.appendLineToFile((EvoSuiteFile) null, "freemind.controller.actions.generated.instance.JiBX_bindingMenuCheckedAction_access");
      KeyEvent.getExtendedKeyCodeForChar(8860);
      System.setCurrentTimeMillis((-1L));
  }

  /**
  //Test case number: 22
  /*Coverage entropy=3.1337055042791775
  */
  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      JDayChooser jDayChooser0 = new JDayChooser();
      KeyEvent keyEvent0 = new KeyEvent(jDayChooser0, (-1059), 1558, 1558, (-1059), 'A');
      jDayChooser0.keyTyped(keyEvent0);
      HierarchyListener hierarchyListener0 = mock(HierarchyListener.class, new ViolatedAssumptionAnswer());
      HierarchyListener hierarchyListener1 = AWTEventMulticaster.add(hierarchyListener0, hierarchyListener0);
      AWTEventMulticaster.remove(hierarchyListener1, hierarchyListener1);
      jDayChooser0.addHierarchyListener((HierarchyListener) null);
      jDayChooser0.setDecorationBackgroundVisible(false);
      jDayChooser0.addListeners(0);
      // Undeclared exception!
      try { 
        jDayChooser0.addListeners((-1));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  /**
  //Test case number: 23
  /*Coverage entropy=3.1598380453758717
  */
  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      JDayChooser jDayChooser0 = new JDayChooser(true);
      Color color0 = jDayChooser0.selectedColor;
      jDayChooser0.getHeight();
      JDayChooser jDayChooser1 = new JDayChooser();
      float[] floatArray0 = new float[5];
      floatArray0[0] = (float) 0;
      floatArray0[1] = 16.184046F;
      floatArray0[2] = 0.0F;
      floatArray0[3] = (-1734.6584F);
      floatArray0[4] = 0.0F;
      color0.getRGBComponents(floatArray0);
      Color.getColor("day");
      jDayChooser0.setForeground(color0);
      jDayChooser1.isDayBordersVisible();
      jDayChooser1.setMonth(0);
      jDayChooser1.setDayBordersVisible(false);
      jDayChooser1.isDayBordersVisible();
      System.setCurrentTimeMillis(0);
  }

  /**
  //Test case number: 24
  /*Coverage entropy=3.199985931810996
  */
  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      int int0 = ImageObserver.ABORT;
      JDayChooser jDayChooser0 = new JDayChooser(true);
      jDayChooser0.getMaxSelectableDate();
      FocusEvent focusEvent0 = new FocusEvent(jDayChooser0, 128);
      FocusEvent focusEvent1 = new FocusEvent(jDayChooser0, (-1768));
      focusEvent1.paramString();
      String string0 = AbstractButton.DISABLED_SELECTED_ICON_CHANGED_PROPERTY;
      jDayChooser0.focusLost(focusEvent1);
      jDayChooser0.repaint((long) (-1768));
      FileSystemHandling.shouldAllThrowIOExceptions();
      jDayChooser0.setDay((-73));
      KeyEvent.getExtendedKeyCodeForChar((-73));
      jDayChooser0.getMaxDayCharacters();
      String[] stringArray0 = new String[8];
      stringArray0[0] = "disabledSelectedIcon";
      stringArray0[1] = "disabledSelectedIcon";
      stringArray0[2] = "day";
      stringArray0[3] = "unknown type,permanent,opposite=null";
      stringArray0[4] = "unknown type,permanent,opposite=null";
      stringArray0[5] = "disabledSelectedIcon";
      stringArray0[6] = "disabledSelectedIcon";
      stringArray0[7] = "Center";
      // Undeclared exception!
      try { 
        JDayChooser.main(stringArray0);
        fail("Expecting exception: HeadlessException");
      
      } catch(HeadlessException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.awt.GraphicsEnvironment", e);
      }
  }

  /**
  //Test case number: 25
  /*Coverage entropy=3.1336533618782805
  */
  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      JDayChooser jDayChooser0 = new JDayChooser();
      jDayChooser0.setAlwaysFireDayProperty(true);
      assertEquals(14, jDayChooser0.getDay());
  }

  /**
  //Test case number: 26
  /*Coverage entropy=3.1286781254653357
  */
  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      SymbolTable symbolTable0 = new SymbolTable(3574);
      XMLGrammarPoolImpl xMLGrammarPoolImpl0 = new XMLGrammarPoolImpl();
      JDayChooser jDayChooser0 = new JDayChooser(true);
      jDayChooser0.setDay(3574);
      jDayChooser0.isDayBordersVisible();
      ComponentOrientation componentOrientation0 = jDayChooser0.getComponentOrientation();
      jDayChooser0.setComponentOrientation(componentOrientation0);
      jDayChooser0.setDayBordersVisible(false);
      jDayChooser0.getDecorationBackgroundColor();
      assertEquals(28, jDayChooser0.getDay());
  }

  /**
  //Test case number: 27
  /*Coverage entropy=3.096538374336882
  */
  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      JDayChooser jDayChooser0 = new JDayChooser(true);
      jDayChooser0.isDecorationBordersVisible();
      assertEquals(14, jDayChooser0.getDay());
  }

  /**
  //Test case number: 28
  /*Coverage entropy=3.134580704577775
  */
  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      JDayChooser jDayChooser0 = new JDayChooser(false);
      Color color0 = new Color(788);
      Color color1 = Color.getColor("", color0);
      Color.getColor((String) null);
      color1.getComponents((float[]) null);
      Color.getColor("@%\"_Bve", color1);
      jDayChooser0.getHeight();
      JDayChooser jDayChooser1 = new JDayChooser(false);
      jDayChooser1.setDayBordersVisible(false);
      jDayChooser1.setYear(788);
      jDayChooser1.isDecorationBackgroundVisible();
      jDayChooser1.setDayBordersVisible(false);
      jDayChooser1.setDecorationBordersVisible(true);
      BrowseMode browseMode0 = new BrowseMode();
      BrowseController browseController0 = null;
      try {
        browseController0 = new BrowseController(browseMode0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("freemind.modes.ControllerAdapter", e);
      }
  }

  /**
  //Test case number: 29
  /*Coverage entropy=3.0965518909555647
  */
  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      JDayChooser jDayChooser0 = new JDayChooser(true);
      int int0 = 777;
      // Undeclared exception!
      try { 
        jDayChooser0.setCalendar((Calendar) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("accessories.plugins.time.JDayChooser", e);
      }
  }

  /**
  //Test case number: 30
  /*Coverage entropy=3.1337055042791775
  */
  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      JDayChooser jDayChooser0 = new JDayChooser(false);
      jDayChooser0.getUIClassID();
      jDayChooser0.getDecorationBackgroundColor();
      jDayChooser0.getInputVerifier();
      jDayChooser0.setInputVerifier((InputVerifier) null);
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(6, 6, 164, 90, (-90));
      mockGregorianCalendar0.getCalendarType();
      jDayChooser0.setCalendar(mockGregorianCalendar0);
      JDayChooser.DecoratorButton jDayChooser_DecoratorButton0 = jDayChooser0.new DecoratorButton();
      TransformerFactoryImpl transformerFactoryImpl0 = new TransformerFactoryImpl();
      StylesheetHandler stylesheetHandler0 = new StylesheetHandler(transformerFactoryImpl0);
      stylesheetHandler0.getStylesheetRoot();
      XPathContext xPathContext0 = new XPathContext("gregory", false);
      byte[] byteArray0 = new byte[1];
      byteArray0[0] = (byte)47;
      RowOutputBinary rowOutputBinary0 = new RowOutputBinary(byteArray0);
      DataOutputStream dataOutputStream0 = new DataOutputStream(rowOutputBinary0);
      PDFDocumentGraphics2D pDFDocumentGraphics2D0 = new PDFDocumentGraphics2D(false, rowOutputBinary0, (byte)47, 0);
      PDFDocumentGraphics2D pDFDocumentGraphics2D1 = null;
      try {
        pDFDocumentGraphics2D1 = new PDFDocumentGraphics2D(pDFDocumentGraphics2D0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.batik.ext.awt.g2d.AbstractGraphics2D", e);
      }
  }
}
