/*
 * This file was automatically generated by EvoSuite
 * Thu Dec 05 05:59:20 GMT 2019
 */

package accessories.plugins.time;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import accessories.plugins.time.JDayChooser;
import accessories.plugins.time.JMonthChooser;
import accessories.plugins.time.JYearChooser;
import java.awt.AWTEventMulticaster;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.HeadlessException;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.HierarchyBoundsListener;
import java.awt.event.HierarchyListener;
import java.awt.event.InputMethodListener;
import java.awt.event.KeyEvent;
import java.sql.Timestamp;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import javax.swing.JEditorPane;
import javax.swing.JInternalFrame;
import javax.swing.KeyStroke;
import javax.swing.MenuElement;
import javax.swing.MenuSelectionManager;
import javax.swing.SwingConstants;
import javax.swing.TransferHandler;
import javax.swing.event.MenuKeyEvent;
import javax.swing.plaf.metal.MetalComboBoxEditor;
import javax.swing.tree.DefaultTreeCellRenderer;
import org.apache.fop.image.FopImage;
import org.apache.fop.image.JpegImage;
import org.apache.fop.pdf.PDFDocument;
import org.apache.fop.pdf.PDFInfo;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.System;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.evosuite.runtime.mock.java.net.MockURL;
import org.evosuite.runtime.mock.java.util.MockDate;
import org.evosuite.runtime.mock.java.util.MockGregorianCalendar;
import org.evosuite.runtime.testdata.FileSystemHandling;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class JDayChooser_ESTest extends JDayChooser_ESTest_scaffolding {

  /**
  //Test case number: 0
  /*Coverage entropy=2.800866879935626
  */
  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      JDayChooser jDayChooser0 = new JDayChooser();
      MetalComboBoxEditor metalComboBoxEditor0 = new MetalComboBoxEditor();
      jDayChooser0.addFocusListener(metalComboBoxEditor0);
      KeyEvent keyEvent0 = new KeyEvent(jDayChooser0, (-971), (-850L), 2848, 37, 'J');
      jDayChooser0.keyPressed(keyEvent0);
      jDayChooser0.setEnabled(true);
      JDayChooser.DecoratorButton jDayChooser_DecoratorButton0 = jDayChooser0.new DecoratorButton();
      jDayChooser_DecoratorButton0.paint((Graphics) null);
      assertEquals(13, jDayChooser0.getDay());
  }

  /**
  //Test case number: 1
  /*Coverage entropy=2.8008183085417486
  */
  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      JDayChooser jDayChooser0 = new JDayChooser();
      MenuSelectionManager menuSelectionManager0 = new MenuSelectionManager();
      MenuKeyEvent menuKeyEvent0 = new MenuKeyEvent(jDayChooser0, 1395, (-151L), 2968, 38, 'l', (MenuElement[]) null, menuSelectionManager0);
      jDayChooser0.keyPressed(menuKeyEvent0);
      assertEquals(7, jDayChooser0.getDay());
  }

  /**
  //Test case number: 2
  /*Coverage entropy=3.14246308463095
  */
  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      JDayChooser jDayChooser0 = new JDayChooser();
      Color color0 = Color.YELLOW;
      jDayChooser0.setMaxDayCharacters(1);
      assertEquals(1, jDayChooser0.getMaxDayCharacters());
  }

  /**
  //Test case number: 3
  /*Coverage entropy=3.164789965657869
  */
  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      JDayChooser jDayChooser0 = new JDayChooser();
      jDayChooser0.setAlwaysFireDayProperty(true);
      FileSystemHandling fileSystemHandling0 = new FileSystemHandling();
      jDayChooser0.setDay(2843);
      jDayChooser0.setMonth(2843);
      assertEquals(31, jDayChooser0.getDay());
  }

  /**
  //Test case number: 4
  /*Coverage entropy=3.1460200851686753
  */
  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      JDayChooser jDayChooser0 = new JDayChooser();
      jDayChooser0.maxSelectableDate = null;
      jDayChooser0.setDay((-2821));
      // Undeclared exception!
      try { 
        jDayChooser0.setMonth((-2821));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  /**
  //Test case number: 5
  /*Coverage entropy=2.8961159133677654
  */
  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      JDayChooser jDayChooser0 = new JDayChooser();
      MenuSelectionManager menuSelectionManager0 = new MenuSelectionManager();
      MenuKeyEvent menuKeyEvent0 = new MenuKeyEvent(jDayChooser0, 776, 0L, 1023, 34, 'C', (MenuElement[]) null, menuSelectionManager0);
      // Undeclared exception!
      try { 
        jDayChooser0.keyPressed(menuKeyEvent0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("accessories.plugins.time.JDayChooser", e);
      }
  }

  /**
  //Test case number: 6
  /*Coverage entropy=3.0966040333564617
  */
  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      JDayChooser jDayChooser0 = new JDayChooser();
      jDayChooser0.drawWeeks();
      jDayChooser0.maxSelectableDate = null;
      // Undeclared exception!
      try { 
        jDayChooser0.updateUI();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  /**
  //Test case number: 7
  /*Coverage entropy=2.8961031581030303
  */
  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      JDayChooser jDayChooser0 = new JDayChooser();
      MenuKeyEvent menuKeyEvent0 = new MenuKeyEvent(jDayChooser0, 12, 33, 33, 33, 'J', (MenuElement[]) null, (MenuSelectionManager) null);
      // Undeclared exception!
      try { 
        jDayChooser0.keyPressed(menuKeyEvent0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("accessories.plugins.time.JDayChooser", e);
      }
  }

  /**
  //Test case number: 8
  /*Coverage entropy=3.160883570196041
  */
  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      JDayChooser jDayChooser0 = new JDayChooser();
      int int0 = SwingConstants.EAST;
      jDayChooser0.locale = null;
      ClassLoader.getSystemClassLoader();
      // Undeclared exception!
      try { 
        jDayChooser0.setMaxDayCharacters(3);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  /**
  //Test case number: 9
  /*Coverage entropy=2.695432462640879
  */
  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      JDayChooser jDayChooser0 = new JDayChooser();
      int int0 = SwingConstants.EAST;
      jDayChooser0.setMaxDayCharacters(3);
      assertEquals(3, jDayChooser0.getMaxDayCharacters());
  }

  /**
  //Test case number: 10
  /*Coverage entropy=2.8008183085417486
  */
  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      JDayChooser jDayChooser0 = new JDayChooser();
      KeyStroke.getKeyStroke((-1682), (-1682));
      MenuSelectionManager menuSelectionManager0 = new MenuSelectionManager();
      MenuElement[] menuElementArray0 = new MenuElement[1];
      MenuKeyEvent menuKeyEvent0 = new MenuKeyEvent(jDayChooser0, (-1682), (-1682), 36, 36, 'T', menuElementArray0, menuSelectionManager0);
      jDayChooser0.keyPressed(menuKeyEvent0);
      assertEquals(1, jDayChooser0.getDay());
  }

  /**
  //Test case number: 11
  /*Coverage entropy=3.1509516053141597
  */
  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      JDayChooser jDayChooser0 = new JDayChooser();
      // Undeclared exception!
      try { 
        jDayChooser0.setLocale((Locale) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  /**
  //Test case number: 12
  /*Coverage entropy=3.159844310627845
  */
  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      JDayChooser jDayChooser0 = new JDayChooser();
      jDayChooser0.setDayBordersVisible(false);
      jDayChooser0.setFocus();
      JDayChooser jDayChooser1 = new JDayChooser(true);
      jDayChooser0.isDayBordersVisible();
      jDayChooser1.updateUI();
      int int0 = SwingConstants.BOTTOM;
      assertEquals(3, int0);
  }

  /**
  //Test case number: 13
  /*Coverage entropy=2.801696993526905
  */
  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      JDayChooser jDayChooser0 = new JDayChooser();
      jDayChooser0.repaint((long) 1541);
      KeyStroke.getKeyStroke(14, 1541);
      JEditorPane jEditorPane0 = new JEditorPane();
      Color color0 = jEditorPane0.getCaretColor();
      jDayChooser0.setForeground(color0);
      MockDate mockDate0 = new MockDate(2507, 14, 17);
      JDayChooser jDayChooser1 = new JDayChooser();
      Date date0 = jDayChooser0.defaultMinSelectableDate;
      jDayChooser1.setSelectableDateRange(mockDate0, date0);
      Color color1 = jDayChooser1.getBackground();
      jDayChooser0.setForeground(color1);
      jDayChooser0.getWeekdayForeground();
      int int0 = jDayChooser0.getDaysInMonth();
      assertTrue(jDayChooser0.isDecorationBackgroundVisible());
      assertEquals(28, int0);
      assertTrue(jDayChooser0.isDayBordersVisible());
      assertEquals(14, jDayChooser0.getDay());
  }

  /**
  //Test case number: 14
  /*Coverage entropy=2.577623359861654
  */
  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      JDayChooser jDayChooser0 = new JDayChooser(false);
      jDayChooser0.getCursor();
      jDayChooser0.setMinSelectableDate((Date) null);
      assertEquals(14, jDayChooser0.getDay());
  }

  /**
  //Test case number: 15
  /*Coverage entropy=2.8008183085417486
  */
  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      JDayChooser jDayChooser0 = new JDayChooser();
      KeyEvent keyEvent0 = new KeyEvent(jDayChooser0, 2843, (-850L), 40, 40, '&');
      jDayChooser0.keyPressed(keyEvent0);
      assertEquals(21, jDayChooser0.getDay());
  }

  /**
  //Test case number: 16
  /*Coverage entropy=2.696323676435319
  */
  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      JDayChooser jDayChooser0 = new JDayChooser();
      ClassLoader.getSystemClassLoader();
      jDayChooser0.setDay((-1055));
      jDayChooser0.repaint(1656L);
      MenuSelectionManager menuSelectionManager0 = new MenuSelectionManager();
      PDFDocument pDFDocument0 = new PDFDocument("M#^i|CAaL");
      PDFInfo pDFInfo0 = pDFDocument0.getInfo();
      pDFInfo0.getCreationDate();
      jDayChooser0.setSelectableDateRange((Date) null, (Date) null);
      assertEquals(1, jDayChooser0.getDay());
      
      JDayChooser jDayChooser1 = new JDayChooser(true);
      Color color0 = Color.red;
      jDayChooser1.setForeground(color0);
      assertFalse(jDayChooser1.isDecorationBordersVisible());
  }

  /**
  //Test case number: 17
  /*Coverage entropy=2.6954944735299913
  */
  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      JDayChooser jDayChooser0 = new JDayChooser();
      AWTEventMulticaster.remove((FocusListener) jDayChooser0, (FocusListener) jDayChooser0);
      jDayChooser0.addFocusListener((FocusListener) null);
      SystemColor systemColor0 = SystemColor.textHighlightText;
      jDayChooser0.setForeground(systemColor0);
      MockDate mockDate0 = new MockDate(20, 1, 1);
      jDayChooser0.setSelectableDateRange(mockDate0, mockDate0);
      Color color0 = jDayChooser0.getBackground();
      jDayChooser0.setForeground(color0);
      assertFalse(jDayChooser0.isDecorationBordersVisible());
      assertEquals(14, jDayChooser0.getDay());
      assertTrue(jDayChooser0.isDayBordersVisible());
  }

  /**
  //Test case number: 18
  /*Coverage entropy=2.800792978298705
  */
  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      JDayChooser jDayChooser0 = new JDayChooser();
      Color color0 = Color.ORANGE;
      jDayChooser0.setForeground(color0);
      jDayChooser0.getMinSelectableDate();
      assertFalse(jDayChooser0.isDecorationBordersVisible());
      assertTrue(jDayChooser0.isDecorationBackgroundVisible());
      assertTrue(jDayChooser0.isDayBordersVisible());
  }

  /**
  //Test case number: 19
  /*Coverage entropy=2.801680933862038
  */
  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      JDayChooser jDayChooser0 = new JDayChooser();
      MetalComboBoxEditor metalComboBoxEditor0 = new MetalComboBoxEditor();
      jDayChooser0.addFocusListener(metalComboBoxEditor0);
      JDayChooser.DecoratorButton jDayChooser_DecoratorButton0 = jDayChooser0.new DecoratorButton();
      Color.getColor("Invalid colorspace for interpolation.");
      JDayChooser jDayChooser1 = new JDayChooser();
      jDayChooser1.setForeground((Color) null);
      jDayChooser_DecoratorButton0.isFocusable();
      assertTrue(jDayChooser0.isDecorationBackgroundVisible());
  }

  /**
  //Test case number: 20
  /*Coverage entropy=3.0965652109688846
  */
  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      JDayChooser jDayChooser0 = new JDayChooser();
      jDayChooser0.drawDays();
      assertTrue(jDayChooser0.isDayBordersVisible());
      assertEquals(14, jDayChooser0.getDay());
  }

  /**
  //Test case number: 21
  /*Coverage entropy=2.8008307070291334
  */
  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      JDayChooser jDayChooser0 = new JDayChooser();
      MenuSelectionManager menuSelectionManager0 = new MenuSelectionManager();
      MenuKeyEvent menuKeyEvent0 = new MenuKeyEvent(jDayChooser0, 35, 35, 776, 35, 'C', (MenuElement[]) null, menuSelectionManager0);
      assertEquals(14, jDayChooser0.getDay());
      
      jDayChooser0.keyPressed(menuKeyEvent0);
      assertTrue(jDayChooser0.isDecorationBackgroundVisible());
  }

  /**
  //Test case number: 22
  /*Coverage entropy=2.6954063955180376
  */
  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      JDayChooser jDayChooser0 = new JDayChooser();
      jDayChooser0.getWidth();
      jDayChooser0.setDayBordersVisible(true);
      jDayChooser0.setMaxDayCharacters(0);
      assertFalse(jDayChooser0.isWeekOfYearVisible());
      assertTrue(jDayChooser0.isDecorationBackgroundVisible());
      assertEquals(14, jDayChooser0.getDay());
  }

  /**
  //Test case number: 23
  /*Coverage entropy=2.8007535911625436
  */
  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      JDayChooser jDayChooser0 = new JDayChooser();
      DefaultTreeCellRenderer defaultTreeCellRenderer0 = new DefaultTreeCellRenderer();
      jDayChooser0.getDayPanel();
      assertEquals(14, jDayChooser0.getDay());
      assertFalse(jDayChooser0.isWeekOfYearVisible());
      assertTrue(jDayChooser0.isDayBordersVisible());
  }

  /**
  //Test case number: 24
  /*Coverage entropy=2.8008183085417486
  */
  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      JDayChooser jDayChooser0 = new JDayChooser();
      Locale locale0 = jDayChooser0.getLocale();
      jDayChooser0.setLocale(locale0);
      assertTrue(jDayChooser0.isDayBordersVisible());
      assertFalse(jDayChooser0.isDecorationBordersVisible());
      assertEquals(14, jDayChooser0.getDay());
  }

  /**
  //Test case number: 25
  /*Coverage entropy=2.695419523184595
  */
  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      JDayChooser jDayChooser0 = new JDayChooser();
      MockDate mockDate0 = new MockDate();
      jDayChooser0.setMinSelectableDate(mockDate0);
      assertTrue(jDayChooser0.isDayBordersVisible());
      assertEquals(14, jDayChooser0.getDay());
  }

  /**
  //Test case number: 26
  /*Coverage entropy=3.063182573009241
  */
  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      JDayChooser jDayChooser0 = new JDayChooser();
      jDayChooser0.getTransferHandler();
      jDayChooser0.setTransferHandler((TransferHandler) null);
      jDayChooser0.keyReleased((KeyEvent) null);
      jDayChooser0.isOptimizedDrawingEnabled();
      jDayChooser0.revalidate();
      jDayChooser0.setDay(1196);
      jDayChooser0.getWeekdayForeground();
      jDayChooser0.isDecorationBordersVisible();
      String[] stringArray0 = new String[6];
      stringArray0[0] = "day";
      stringArray0[1] = "day";
      stringArray0[2] = "day";
      stringArray0[3] = "day";
      stringArray0[4] = "day";
      stringArray0[5] = "day";
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
  //Test case number: 27
  /*Coverage entropy=2.695529662081982
  */
  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      JDayChooser jDayChooser0 = new JDayChooser();
      jDayChooser0.setDay(2843);
      jDayChooser0.setMonth(2843);
      PDFInfo pDFInfo0 = new PDFInfo();
      pDFInfo0.getCreationDate();
      jDayChooser0.setMaxSelectableDate((Date) null);
      System.setCurrentTimeMillis((-1588L));
  }

  /**
  //Test case number: 28
  /*Coverage entropy=2.8016776519777116
  */
  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      JDayChooser jDayChooser0 = new JDayChooser();
      JDayChooser jDayChooser1 = new JDayChooser();
      Color color0 = new Color(115);
      jDayChooser1.setDecorationBackgroundColor(color0);
      jDayChooser0.setSundayForeground(color0);
      assertEquals(14, jDayChooser0.getDay());
      assertFalse(jDayChooser0.isDecorationBordersVisible());
      assertTrue(jDayChooser0.isDecorationBackgroundVisible());
  }

  /**
  //Test case number: 29
  /*Coverage entropy=2.801684192093145
  */
  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      JDayChooser jDayChooser0 = new JDayChooser();
      AWTEventMulticaster.remove((FocusListener) jDayChooser0, (FocusListener) jDayChooser0);
      jDayChooser0.addFocusListener((FocusListener) null);
      FopImage.ImageInfo fopImage_ImageInfo0 = new FopImage.ImageInfo();
      JpegImage jpegImage0 = new JpegImage(fopImage_ImageInfo0);
      jpegImage0.getTransparentColor();
      jDayChooser0.getTopLevelAncestor();
      jDayChooser0.setDecorationBackgroundColor((Color) null);
      jDayChooser0.setDay(0);
      ClassLoader.getSystemClassLoader();
      MockURL.getHttpExample();
      JDayChooser jDayChooser1 = new JDayChooser(true);
      jDayChooser1.setMaxDayCharacters(3961);
      jDayChooser0.getDecorationBackgroundColor();
      KeyEvent keyEvent0 = null;
      try {
        keyEvent0 = new KeyEvent(jDayChooser0, 0, 95, 3961, 0, 'A', 1282);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // invalid keyLocation
         //
         verifyException("java.awt.event.KeyEvent", e);
      }
  }

  /**
  //Test case number: 30
  /*Coverage entropy=2.6954944735299913
  */
  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      JDayChooser jDayChooser0 = new JDayChooser();
      jDayChooser0.setDay(228);
      jDayChooser0.setMonth(228);
      assertEquals(31, jDayChooser0.getDay());
  }

  /**
  //Test case number: 31
  /*Coverage entropy=3.0965518909555647
  */
  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      JDayChooser jDayChooser0 = new JDayChooser();
      jDayChooser0.initDecorations();
      assertEquals(14, jDayChooser0.getDay());
      assertTrue(jDayChooser0.isDayBordersVisible());
  }

  /**
  //Test case number: 32
  /*Coverage entropy=2.8008183085417486
  */
  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      JDayChooser jDayChooser0 = new JDayChooser();
      KeyEvent keyEvent0 = new KeyEvent(jDayChooser0, 2375, 2375, 2375, 2375, 'o');
      jDayChooser0.keyPressed(keyEvent0);
      assertEquals(14, jDayChooser0.getDay());
      assertTrue(jDayChooser0.isDecorationBackgroundVisible());
  }

  /**
  //Test case number: 33
  /*Coverage entropy=2.8007669111758635
  */
  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      JDayChooser jDayChooser0 = new JDayChooser();
      jDayChooser0.setWeekOfYearVisible(false);
      // Undeclared exception!
      try { 
        jDayChooser0.getTemporaryCalendar();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("accessories.plugins.time.JDayChooser", e);
      }
  }

  /**
  //Test case number: 34
  /*Coverage entropy=2.8008307070291334
  */
  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      JDayChooser jDayChooser0 = new JDayChooser();
      SystemColor systemColor0 = SystemColor.activeCaption;
      JMonthChooser jMonthChooser0 = new JMonthChooser();
      jDayChooser0.setMonthChooser(jMonthChooser0);
      jDayChooser0.setMonth(335);
      assertFalse(jDayChooser0.isDecorationBordersVisible());
      assertFalse(jDayChooser0.isWeekOfYearVisible());
      assertTrue(jDayChooser0.isDayBordersVisible());
      assertEquals(14, jDayChooser0.getDay());
  }

  /**
  //Test case number: 35
  /*Coverage entropy=3.1867762766523793
  */
  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      JDayChooser jDayChooser0 = new JDayChooser();
      jDayChooser0.init();
      jDayChooser0.setMaxDayCharacters((-930));
      jDayChooser0.getLocale();
      assertEquals(14, jDayChooser0.getDay());
      assertEquals(0, jDayChooser0.getMaxDayCharacters());
      assertTrue(jDayChooser0.isDecorationBackgroundVisible());
  }

  /**
  //Test case number: 36
  /*Coverage entropy=2.69631050055377
  */
  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      JDayChooser jDayChooser0 = new JDayChooser();
      JDayChooser jDayChooser1 = new JDayChooser();
      Font.decode("day");
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar();
      Date date0 = mockGregorianCalendar0.getGregorianChange();
      Date date1 = jDayChooser0.setMaxSelectableDate(date0);
      assertEquals("Fri Oct 15 00:00:00 GMT 1582", date1.toString());
      assertEquals(14, jDayChooser0.getDay());
      assertFalse(jDayChooser0.isWeekOfYearVisible());
      assertTrue(jDayChooser0.isDecorationBackgroundVisible());
      assertTrue(jDayChooser0.isDayBordersVisible());
  }

  /**
  //Test case number: 37
  /*Coverage entropy=2.8972993252417556
  */
  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      JDayChooser jDayChooser0 = new JDayChooser(true);
      Date date0 = jDayChooser0.getMaxSelectableDate();
      FocusEvent focusEvent0 = new FocusEvent(jDayChooser0, 65610);
      focusEvent0.paramString();
      jDayChooser0.focusLost(focusEvent0);
      jDayChooser0.repaint((-1134L));
      jDayChooser0.getInheritsPopupMenu();
      Color color0 = new Color(0);
      Color.getColor((String) null, color0);
      Color.getColor("day", color0);
      jDayChooser0.setForeground(color0);
      jDayChooser0.getHeight();
      JDayChooser jDayChooser1 = new JDayChooser(true);
      jDayChooser1.setFocus();
      Color color1 = jDayChooser1.getWeekdayForeground();
      assertEquals(164, color1.getBlue());
      
      jDayChooser1.setMaxSelectableDate(date0);
      JInternalFrame jInternalFrame0 = new JInternalFrame((String) null);
      FocusEvent focusEvent1 = new FocusEvent(jInternalFrame0, 49, false, jInternalFrame0);
      jDayChooser0.focusLost(focusEvent1);
      jDayChooser1.setWeekOfYearVisible(false);
      JDayChooser jDayChooser2 = new JDayChooser(false);
      jDayChooser2.setDayBordersVisible(true);
      jDayChooser0.init();
      assertEquals(14, jDayChooser0.getDay());
  }

  /**
  //Test case number: 38
  /*Coverage entropy=2.6954063955180376
  */
  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      JDayChooser jDayChooser0 = new JDayChooser();
      jDayChooser0.setWeekOfYearVisible(true);
      jDayChooser0.getFont();
      jDayChooser0.setFont((Font) null);
      assertTrue(jDayChooser0.isWeekOfYearVisible());
  }

  /**
  //Test case number: 39
  /*Coverage entropy=2.9831398653357044
  */
  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      JDayChooser jDayChooser0 = new JDayChooser();
      Color color0 = jDayChooser0.getDecorationBackgroundColor();
      jDayChooser0.setWeekdayForeground(color0);
      // Undeclared exception!
      try { 
        jDayChooser0.getTemporaryCalendar();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("accessories.plugins.time.JDayChooser", e);
      }
  }

  /**
  //Test case number: 40
  /*Coverage entropy=2.8008429327153
  */
  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      System.setCurrentTimeMillis((-1797L));
      JDayChooser jDayChooser0 = new JDayChooser(true);
      InputMethodListener inputMethodListener0 = mock(InputMethodListener.class, new ViolatedAssumptionAnswer());
      AWTEventMulticaster.remove(inputMethodListener0, inputMethodListener0);
      AWTEventMulticaster.add((InputMethodListener) null, (InputMethodListener) null);
      jDayChooser0.addInputMethodListener((InputMethodListener) null);
      jDayChooser0.setMaxDayCharacters(12);
      MockDate mockDate0 = new MockDate(12, 12, 12, 12, 12);
      jDayChooser0.setEnabled(true);
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(8242, 8242, 8242, (-704), 12, 8242);
      jDayChooser0.setCalendar(mockGregorianCalendar0);
      assertEquals("org.evosuite.runtime.mock.java.util.MockGregorianCalendar[time=?,areFieldsSet=false,areAllFieldsSet=false,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=?,YEAR=8242,MONTH=8242,WEEK_OF_YEAR=?,WEEK_OF_MONTH=?,DAY_OF_MONTH=8242,DAY_OF_YEAR=?,DAY_OF_WEEK=?,DAY_OF_WEEK_IN_MONTH=?,AM_PM=0,HOUR=-704,HOUR_OF_DAY=-704,MINUTE=12,SECOND=8242,MILLISECOND=?,ZONE_OFFSET=?,DST_OFFSET=?]", mockGregorianCalendar0.toString());
      
      FocusEvent focusEvent0 = new FocusEvent(jDayChooser0, (-4133));
      jDayChooser0.focusGained(focusEvent0);
      assertEquals(0, jDayChooser0.getMaxDayCharacters());
      assertTrue(jDayChooser0.isWeekOfYearVisible());
      assertFalse(jDayChooser0.isDecorationBordersVisible());
      assertEquals(31, jDayChooser0.getDay());
      assertTrue(jDayChooser0.isDayBordersVisible());
  }

  /**
  //Test case number: 41
  /*Coverage entropy=2.8960770909801887
  */
  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      JDayChooser jDayChooser0 = new JDayChooser();
      jDayChooser0.isDayBordersVisible();
      int int0 = jDayChooser0.getMaxDayCharacters();
      assertEquals(14, jDayChooser0.getDay());
      assertFalse(jDayChooser0.isWeekOfYearVisible());
      assertEquals(0, int0);
  }

  /**
  //Test case number: 42
  /*Coverage entropy=2.8008183085417486
  */
  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      JDayChooser jDayChooser0 = new JDayChooser();
      JYearChooser jYearChooser0 = jDayChooser0.yearChooser;
      jDayChooser0.setYearChooser((JYearChooser) null);
      Locale locale0 = Locale.KOREA;
      jDayChooser0.setLocale(locale0);
      assertTrue(jDayChooser0.isDecorationBackgroundVisible());
      assertFalse(jDayChooser0.isDecorationBordersVisible());
      assertEquals(14, jDayChooser0.getDay());
      assertTrue(jDayChooser0.isDayBordersVisible());
  }

  /**
  //Test case number: 43
  /*Coverage entropy=2.8007535911625436
  */
  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      JDayChooser jDayChooser0 = new JDayChooser();
      jDayChooser0.getSundayForeground();
      assertTrue(jDayChooser0.isDayBordersVisible());
      assertFalse(jDayChooser0.isDecorationBordersVisible());
      assertFalse(jDayChooser0.isWeekOfYearVisible());
      assertEquals(14, jDayChooser0.getDay());
  }

  /**
  //Test case number: 44
  /*Coverage entropy=3.096538374336882
  */
  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      JDayChooser jDayChooser0 = new JDayChooser(false);
      ActionEvent actionEvent0 = new ActionEvent(jDayChooser0, 8925, "onunload", 8925);
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
  //Test case number: 45
  /*Coverage entropy=2.8007535911625436
  */
  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      JDayChooser jDayChooser0 = new JDayChooser();
      // Undeclared exception!
      try { 
        jDayChooser0.actionPerformed((ActionEvent) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("accessories.plugins.time.JDayChooser", e);
      }
  }

  /**
  //Test case number: 46
  /*Coverage entropy=3.0867512227489686
  */
  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      JDayChooser jDayChooser0 = new JDayChooser(false);
      JDayChooser jDayChooser1 = new JDayChooser(true);
      boolean boolean0 = jDayChooser1.isWeekOfYearVisible();
      assertEquals(14, jDayChooser1.getDay());
      assertTrue(boolean0);
      assertTrue(jDayChooser1.isDayBordersVisible());
      assertFalse(jDayChooser1.isDecorationBordersVisible());
  }

  /**
  //Test case number: 47
  /*Coverage entropy=2.695379558886035
  */
  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      JDayChooser jDayChooser0 = new JDayChooser(false);
      jDayChooser0.isWeekOfYearVisible();
      assertFalse(jDayChooser0.isDecorationBordersVisible());
      assertEquals(14, jDayChooser0.getDay());
      assertTrue(jDayChooser0.isDayBordersVisible());
  }

  /**
  //Test case number: 48
  /*Coverage entropy=2.8008057335634406
  */
  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      JDayChooser jDayChooser0 = new JDayChooser();
      KeyEvent keyEvent0 = new KeyEvent(jDayChooser0, (-1059), (-1059), 1558, (-1059), 'A');
      jDayChooser0.keyTyped(keyEvent0);
      HierarchyListener hierarchyListener0 = mock(HierarchyListener.class, new ViolatedAssumptionAnswer());
      HierarchyListener hierarchyListener1 = AWTEventMulticaster.add(hierarchyListener0, hierarchyListener0);
      AWTEventMulticaster.remove(hierarchyListener1, hierarchyListener1);
      jDayChooser0.addHierarchyListener((HierarchyListener) null);
      jDayChooser0.setDecorationBackgroundVisible(false);
      jDayChooser0.addListeners(0);
      jDayChooser0.addListeners(14);
      assertFalse(jDayChooser0.isDecorationBordersVisible());
      assertFalse(jDayChooser0.isWeekOfYearVisible());
      assertEquals(14, jDayChooser0.getDay());
      assertTrue(jDayChooser0.isDayBordersVisible());
  }

  /**
  //Test case number: 49
  /*Coverage entropy=3.0965518909555647
  */
  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      JDayChooser jDayChooser0 = new JDayChooser();
      String[] stringArray0 = new String[1];
      AWTEventMulticaster.remove((HierarchyBoundsListener) null, (HierarchyBoundsListener) null);
      jDayChooser0.removeHierarchyBoundsListener((HierarchyBoundsListener) null);
      // Undeclared exception!
      try { 
        jDayChooser0.addListeners((-657));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  /**
  //Test case number: 50
  /*Coverage entropy=2.800780038842421
  */
  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      JDayChooser jDayChooser0 = new JDayChooser();
      jDayChooser0.setDay(571);
      KeyEvent keyEvent0 = new KeyEvent(jDayChooser0, 702, (-3274L), (-3158), 702, '\"');
      KeyEvent.getExtendedKeyCodeForChar(702);
      jDayChooser0.keyTyped(keyEvent0);
      // Undeclared exception!
      try { 
        Timestamp.valueOf("day");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Timestamp format must be yyyy-mm-dd hh:mm:ss[.fffffffff]
         //
         verifyException("java.sql.Timestamp", e);
      }
  }

  /**
  //Test case number: 51
  /*Coverage entropy=3.204979400221483
  */
  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      JDayChooser jDayChooser0 = new JDayChooser();
      assertEquals(14, jDayChooser0.getDay());
      
      jDayChooser0.setDay(65534);
      jDayChooser0.setDecorationBackgroundVisible(true);
      KeyEvent keyEvent0 = new KeyEvent(jDayChooser0, (-4430), 65534, 65534, (-3560), 'F');
      jDayChooser0.keyPressed(keyEvent0);
      assertTrue(jDayChooser0.isDayBordersVisible());
  }

  /**
  //Test case number: 52
  /*Coverage entropy=3.1337180792574855
  */
  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      JDayChooser jDayChooser0 = new JDayChooser();
      jDayChooser0.setMonth(4778);
      assertTrue(jDayChooser0.isDayBordersVisible());
      assertFalse(jDayChooser0.isDecorationBordersVisible());
      assertTrue(jDayChooser0.isDecorationBackgroundVisible());
      assertEquals(14, jDayChooser0.getDay());
  }

  /**
  //Test case number: 53
  /*Coverage entropy=2.695379558886035
  */
  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      JDayChooser jDayChooser0 = new JDayChooser(true);
      boolean boolean0 = jDayChooser0.isDecorationBackgroundVisible();
      assertTrue(boolean0);
      assertEquals(14, jDayChooser0.getDay());
      assertTrue(jDayChooser0.isDayBordersVisible());
  }

  /**
  //Test case number: 54
  /*Coverage entropy=2.8961408868334586
  */
  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      JDayChooser jDayChooser0 = new JDayChooser();
      FocusEvent focusEvent0 = new FocusEvent(jDayChooser0, 5, false, jDayChooser0);
      focusEvent0.paramString();
      jDayChooser0.focusLost(focusEvent0);
      ClassLoader.getSystemClassLoader();
      MockURL.getHttpExample();
      jDayChooser0.setMaxDayCharacters(5);
      jDayChooser0.getDecorationBackgroundColor();
      jDayChooser0.setEnabled(false);
      assertEquals(14, jDayChooser0.getDay());
      assertEquals(0, jDayChooser0.getMaxDayCharacters());
      assertFalse(jDayChooser0.isDecorationBordersVisible());
  }

  /**
  //Test case number: 55
  /*Coverage entropy=2.8969845259859843
  */
  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      JDayChooser jDayChooser0 = new JDayChooser();
      JDayChooser jDayChooser1 = new JDayChooser();
      jDayChooser1.setYear(807);
      jDayChooser1.getSelectedDay();
      assertFalse(jDayChooser1.isDecorationBordersVisible());
      assertFalse(jDayChooser1.isWeekOfYearVisible());
      assertEquals(14, jDayChooser1.getDay());
  }

  /**
  //Test case number: 56
  /*Coverage entropy=3.169941939028131
  */
  @Test(timeout = 4000)
  public void test56()  throws Throwable  {
      JDayChooser jDayChooser0 = new JDayChooser();
      jDayChooser0.setFocus();
      jDayChooser0.getDecorationBackgroundColor();
      assertEquals(14, jDayChooser0.getDay());
      assertTrue(jDayChooser0.isDecorationBackgroundVisible());
      assertFalse(jDayChooser0.isDecorationBordersVisible());
  }

  /**
  //Test case number: 57
  /*Coverage entropy=2.8007535911625436
  */
  @Test(timeout = 4000)
  public void test57()  throws Throwable  {
      JDayChooser jDayChooser0 = new JDayChooser();
      int int0 = jDayChooser0.getDay();
      assertEquals(14, int0);
  }

  /**
  //Test case number: 58
  /*Coverage entropy=3.096711151984391
  */
  @Test(timeout = 4000)
  public void test58()  throws Throwable  {
      JDayChooser jDayChooser0 = new JDayChooser();
      jDayChooser0.setDecorationBordersVisible(true);
      jDayChooser0.setDayBordersVisible(true);
      jDayChooser0.updateUI();
      assertFalse(jDayChooser0.isWeekOfYearVisible());
      assertEquals(14, jDayChooser0.getDay());
      assertTrue(jDayChooser0.isDayBordersVisible());
  }

  /**
  //Test case number: 59
  /*Coverage entropy=2.6953930755047177
  */
  @Test(timeout = 4000)
  public void test59()  throws Throwable  {
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
  //Test case number: 60
  /*Coverage entropy=2.8961031581030303
  */
  @Test(timeout = 4000)
  public void test60()  throws Throwable  {
      JDayChooser jDayChooser0 = new JDayChooser();
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar();
      jDayChooser0.setCalendar(mockGregorianCalendar0);
      assertEquals("org.evosuite.runtime.mock.java.util.MockGregorianCalendar[time=1392409281320,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2014,MONTH=1,WEEK_OF_YEAR=7,WEEK_OF_MONTH=3,DAY_OF_MONTH=14,DAY_OF_YEAR=45,DAY_OF_WEEK=6,DAY_OF_WEEK_IN_MONTH=2,AM_PM=1,HOUR=8,HOUR_OF_DAY=20,MINUTE=21,SECOND=21,MILLISECOND=320,ZONE_OFFSET=0,DST_OFFSET=0]", mockGregorianCalendar0.toString());
      
      boolean boolean0 = jDayChooser0.isDecorationBordersVisible();
      assertEquals(14, jDayChooser0.getDay());
      assertFalse(boolean0);
      assertTrue(jDayChooser0.isDecorationBackgroundVisible());
  }
}
