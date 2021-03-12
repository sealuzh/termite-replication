/*
 * This file was automatically generated by EvoSuite
 * Fri Nov 06 20:29:27 GMT 2020
 */

package accessories.plugins.time;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import accessories.plugins.time.JDayChooser;
import accessories.plugins.time.JMonthChooser;
import accessories.plugins.time.JYearChooser;
import java.awt.Color;
import java.awt.Font;
import java.awt.HeadlessException;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.FocusEvent;
import java.awt.event.KeyEvent;
import java.sql.Time;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import org.apache.batik.gvt.text.GVTAttributedCharacterIterator;
import org.apache.fop.svg.PDFDocumentGraphics2D;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.util.MockCalendar;
import org.evosuite.runtime.mock.java.util.MockDate;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class JDayChooser_ESTest extends JDayChooser_ESTest_scaffolding {

  /**
  //Test case number: 0
  /*Coverage entropy=2.7066976132799025
  */
  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      JDayChooser jDayChooser0 = new JDayChooser();
      assertEquals(14, jDayChooser0.getDay());
      
      jDayChooser0.setDay(59);
      KeyEvent keyEvent0 = new KeyEvent(jDayChooser0, 39, 59, 59, 59, '5');
      jDayChooser0.keyPressed(keyEvent0);
      assertTrue(jDayChooser0.isDecorationBackgroundVisible());
  }

  /**
  //Test case number: 1
  /*Coverage entropy=2.630470240160676
  */
  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      JDayChooser jDayChooser0 = new JDayChooser();
      jDayChooser0.day = 860;
      jDayChooser0.setMonth((-291));
      assertEquals(31, jDayChooser0.getDay());
  }

  /**
  //Test case number: 2
  /*Coverage entropy=2.6442551993262904
  */
  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      JDayChooser jDayChooser0 = new JDayChooser();
      GVTAttributedCharacterIterator.TextAttribute gVTAttributedCharacterIterator_TextAttribute0 = GVTAttributedCharacterIterator.TextAttribute.CHAR_INDEX;
      jDayChooser0.setMaxDayCharacters((int) gVTAttributedCharacterIterator_TextAttribute0.ARABIC_INITIAL);
      assertEquals(3, jDayChooser0.getMaxDayCharacters());
  }

  /**
  //Test case number: 3
  /*Coverage entropy=2.5983833927870665
  */
  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      JDayChooser jDayChooser0 = new JDayChooser();
      jDayChooser0.setForeground((Color) null);
      assertTrue(jDayChooser0.isDecorationBackgroundVisible());
      assertFalse(jDayChooser0.isWeekOfYearVisible());
      assertEquals(14, jDayChooser0.getDay());
  }

  /**
  //Test case number: 4
  /*Coverage entropy=2.5983833927870665
  */
  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      JDayChooser jDayChooser0 = new JDayChooser();
      jDayChooser0.setFont((Font) null);
      assertEquals(14, jDayChooser0.getDay());
      assertTrue(jDayChooser0.isDayBordersVisible());
      assertFalse(jDayChooser0.isWeekOfYearVisible());
  }

  /**
  //Test case number: 5
  /*Coverage entropy=2.5983833927870665
  */
  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      JDayChooser jDayChooser0 = new JDayChooser();
      jDayChooser0.initDecorations();
      assertFalse(jDayChooser0.isDecorationBordersVisible());
      assertTrue(jDayChooser0.isDecorationBackgroundVisible());
      assertEquals(14, jDayChooser0.getDay());
      assertTrue(jDayChooser0.isDayBordersVisible());
      assertFalse(jDayChooser0.isWeekOfYearVisible());
  }

  /**
  //Test case number: 6
  /*Coverage entropy=2.5983833927870665
  */
  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      JDayChooser jDayChooser0 = new JDayChooser();
      jDayChooser0.init();
      assertEquals(14, jDayChooser0.getDay());
      assertTrue(jDayChooser0.isDecorationBackgroundVisible());
  }

  /**
  //Test case number: 7
  /*Coverage entropy=2.5604230937343346
  */
  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      JDayChooser jDayChooser0 = new JDayChooser(true);
      jDayChooser0.drawWeeks();
      assertEquals(14, jDayChooser0.getDay());
  }

  /**
  //Test case number: 8
  /*Coverage entropy=2.5983833927870665
  */
  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      JDayChooser jDayChooser0 = new JDayChooser();
      jDayChooser0.drawDays();
      assertEquals(14, jDayChooser0.getDay());
  }

  /**
  //Test case number: 9
  /*Coverage entropy=2.5983833927870665
  */
  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      JDayChooser jDayChooser0 = new JDayChooser(true);
      boolean boolean0 = jDayChooser0.isWeekOfYearVisible();
      assertTrue(jDayChooser0.isDayBordersVisible());
      assertEquals(14, jDayChooser0.getDay());
      assertTrue(boolean0);
      assertTrue(jDayChooser0.isDecorationBackgroundVisible());
      assertFalse(jDayChooser0.isDecorationBordersVisible());
  }

  /**
  //Test case number: 10
  /*Coverage entropy=2.669576756952125
  */
  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      JDayChooser jDayChooser0 = new JDayChooser(true);
      jDayChooser0.setDecorationBackgroundColor((Color) null);
      Color color0 = jDayChooser0.getDecorationBackgroundColor();
      assertNull(color0);
      assertEquals(14, jDayChooser0.getDay());
      assertTrue(jDayChooser0.isWeekOfYearVisible());
      assertFalse(jDayChooser0.isDecorationBordersVisible());
  }

  /**
  //Test case number: 11
  /*Coverage entropy=2.7039446318508733
  */
  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      JDayChooser jDayChooser0 = new JDayChooser();
      SystemColor systemColor0 = SystemColor.menuText;
      jDayChooser0.setDecorationBackgroundColor(systemColor0);
      jDayChooser0.getDecorationBackgroundColor();
      assertFalse(jDayChooser0.isDecorationBordersVisible());
      assertEquals(14, jDayChooser0.getDay());
  }

  /**
  //Test case number: 12
  /*Coverage entropy=2.5983833927870665
  */
  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      JDayChooser jDayChooser0 = new JDayChooser();
      jDayChooser0.calendar = null;
      // Undeclared exception!
      try { 
        jDayChooser0.setDay(43);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  /**
  //Test case number: 13
  /*Coverage entropy=2.5983833927870665
  */
  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      JDayChooser jDayChooser0 = new JDayChooser();
      // Undeclared exception!
      try { 
        jDayChooser0.addListeners((-259));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  /**
  //Test case number: 14
  /*Coverage entropy=2.6354848637097823
  */
  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      JDayChooser jDayChooser0 = new JDayChooser();
      JDayChooser.DecoratorButton jDayChooser_DecoratorButton0 = jDayChooser0.new DecoratorButton();
      ActionEvent actionEvent0 = new ActionEvent(jDayChooser_DecoratorButton0, (-1218), "day");
      // Undeclared exception!
      try { 
        jDayChooser0.actionPerformed(actionEvent0);
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // For input string: \"\"
         //
         verifyException("java.lang.NumberFormatException", e);
      }
  }

  /**
  //Test case number: 15
  /*Coverage entropy=2.6354848637097823
  */
  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      JDayChooser jDayChooser0 = new JDayChooser();
      GVTAttributedCharacterIterator.TextAttribute gVTAttributedCharacterIterator_TextAttribute0 = GVTAttributedCharacterIterator.TextAttribute.X;
      ActionEvent actionEvent0 = new ActionEvent(gVTAttributedCharacterIterator_TextAttribute0, (-4261), "day");
      // Undeclared exception!
      try { 
        jDayChooser0.actionPerformed(actionEvent0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // org.apache.batik.gvt.text.GVTAttributedCharacterIterator$TextAttribute cannot be cast to javax.swing.JButton
         //
         verifyException("accessories.plugins.time.JDayChooser", e);
      }
  }

  /**
  //Test case number: 16
  /*Coverage entropy=2.5983833927870665
  */
  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      JDayChooser jDayChooser0 = new JDayChooser();
      jDayChooser0.updateUI();
      assertEquals(14, jDayChooser0.getDay());
      assertFalse(jDayChooser0.isDecorationBordersVisible());
  }

  /**
  //Test case number: 17
  /*Coverage entropy=2.5983833927870665
  */
  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      JDayChooser jDayChooser0 = new JDayChooser();
      assertTrue(jDayChooser0.isDayBordersVisible());
      
      jDayChooser0.setDayBordersVisible(true);
      assertFalse(jDayChooser0.isWeekOfYearVisible());
      assertEquals(14, jDayChooser0.getDay());
  }

  /**
  //Test case number: 18
  /*Coverage entropy=2.6354848637097823
  */
  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      JDayChooser jDayChooser0 = new JDayChooser();
      jDayChooser0.setFocus();
      assertTrue(jDayChooser0.isDayBordersVisible());
      assertEquals(14, jDayChooser0.getDay());
  }

  /**
  //Test case number: 19
  /*Coverage entropy=2.7129242178517146
  */
  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      JDayChooser jDayChooser0 = new JDayChooser();
      GVTAttributedCharacterIterator.TextAttribute gVTAttributedCharacterIterator_TextAttribute0 = GVTAttributedCharacterIterator.TextAttribute.TEXTPATH;
      jDayChooser0.setMaxDayCharacters((int) gVTAttributedCharacterIterator_TextAttribute0.WRITING_MODE_LTR);
      Locale locale0 = jDayChooser0.getLocale();
      jDayChooser0.setLocale(locale0);
      assertEquals(1, jDayChooser0.getMaxDayCharacters());
  }

  /**
  //Test case number: 20
  /*Coverage entropy=2.5983833927870665
  */
  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      JDayChooser jDayChooser0 = new JDayChooser();
      jDayChooser0.setDecorationBackgroundVisible(true);
      assertFalse(jDayChooser0.isDecorationBordersVisible());
      assertTrue(jDayChooser0.isDayBordersVisible());
      assertEquals(14, jDayChooser0.getDay());
  }

  /**
  //Test case number: 21
  /*Coverage entropy=2.5983833927870665
  */
  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      JDayChooser jDayChooser0 = new JDayChooser();
      assertFalse(jDayChooser0.isDecorationBordersVisible());
      
      jDayChooser0.setDecorationBordersVisible(true);
      assertEquals(14, jDayChooser0.getDay());
  }

  /**
  //Test case number: 22
  /*Coverage entropy=2.5983833927870665
  */
  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      JDayChooser jDayChooser0 = new JDayChooser();
      jDayChooser0.addListeners(29);
      assertTrue(jDayChooser0.isDayBordersVisible());
  }

  /**
  //Test case number: 23
  /*Coverage entropy=2.5983833927870665
  */
  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      JDayChooser jDayChooser0 = new JDayChooser();
      int int0 = jDayChooser0.getDaysInMonth();
      assertFalse(jDayChooser0.isWeekOfYearVisible());
      assertFalse(jDayChooser0.isDecorationBordersVisible());
      assertTrue(jDayChooser0.isDayBordersVisible());
      assertEquals(28, int0);
  }

  /**
  //Test case number: 24
  /*Coverage entropy=2.6354848637097823
  */
  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      JDayChooser jDayChooser0 = new JDayChooser();
      JDayChooser.DecoratorButton jDayChooser_DecoratorButton0 = jDayChooser0.new DecoratorButton();
      PDFDocumentGraphics2D pDFDocumentGraphics2D0 = new PDFDocumentGraphics2D();
      jDayChooser_DecoratorButton0.paint(pDFDocumentGraphics2D0);
      assertFalse(jDayChooser0.isDecorationBordersVisible());
      assertTrue(jDayChooser0.isDayBordersVisible());
      assertEquals(14, jDayChooser0.getDay());
      assertFalse(jDayChooser0.isWeekOfYearVisible());
      assertTrue(jDayChooser0.isDecorationBackgroundVisible());
  }

  /**
  //Test case number: 25
  /*Coverage entropy=2.662701752014223
  */
  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      JDayChooser jDayChooser0 = new JDayChooser();
      jDayChooser0.setMaxDayCharacters(37);
      assertTrue(jDayChooser0.isDayBordersVisible());
      assertFalse(jDayChooser0.isDecorationBordersVisible());
      assertEquals(0, jDayChooser0.getMaxDayCharacters());
      assertEquals(14, jDayChooser0.getDay());
  }

  /**
  //Test case number: 26
  /*Coverage entropy=2.6527697871323417
  */
  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      JDayChooser jDayChooser0 = new JDayChooser();
      jDayChooser0.setMaxDayCharacters((-654));
      assertEquals(14, jDayChooser0.getDay());
      assertEquals(0, jDayChooser0.getMaxDayCharacters());
      assertTrue(jDayChooser0.isDayBordersVisible());
  }

  /**
  //Test case number: 27
  /*Coverage entropy=2.6354848637097823
  */
  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      GVTAttributedCharacterIterator.TextAttribute gVTAttributedCharacterIterator_TextAttribute0 = GVTAttributedCharacterIterator.TextAttribute.TEXTPATH;
      JDayChooser jDayChooser0 = new JDayChooser();
      jDayChooser0.setMaxDayCharacters((int) gVTAttributedCharacterIterator_TextAttribute0.UNDERLINE_ON);
      assertEquals(14, jDayChooser0.getDay());
  }

  /**
  //Test case number: 28
  /*Coverage entropy=2.6354848637097823
  */
  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      JDayChooser jDayChooser0 = new JDayChooser();
      jDayChooser0.setMinSelectableDate((Date) null);
      assertTrue(jDayChooser0.isDayBordersVisible());
      assertEquals(14, jDayChooser0.getDay());
  }

  /**
  //Test case number: 29
  /*Coverage entropy=2.6354848637097823
  */
  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      JDayChooser jDayChooser0 = new JDayChooser();
      Time time0 = new Time(59L);
      jDayChooser0.setMinSelectableDate(time0);
      assertFalse(jDayChooser0.isDecorationBordersVisible());
      assertTrue(jDayChooser0.isDecorationBackgroundVisible());
      assertEquals(14, jDayChooser0.getDay());
  }

  /**
  //Test case number: 30
  /*Coverage entropy=2.5983833927870665
  */
  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      JDayChooser jDayChooser0 = new JDayChooser(true);
      jDayChooser0.setMaxSelectableDate((Date) null);
      assertEquals(14, jDayChooser0.getDay());
      assertTrue(jDayChooser0.isDayBordersVisible());
      assertFalse(jDayChooser0.isDecorationBordersVisible());
  }

  /**
  //Test case number: 31
  /*Coverage entropy=2.6354848637097823
  */
  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      JDayChooser jDayChooser0 = new JDayChooser();
      java.sql.Date date0 = new java.sql.Date((-2229L));
      jDayChooser0.setMaxSelectableDate(date0);
      assertTrue(jDayChooser0.isDecorationBackgroundVisible());
      assertEquals(14, jDayChooser0.getDay());
  }

  /**
  //Test case number: 32
  /*Coverage entropy=2.662701752014223
  */
  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      JDayChooser jDayChooser0 = new JDayChooser();
      MockDate mockDate0 = new MockDate((-9));
      jDayChooser0.setSelectableDateRange((Date) null, mockDate0);
      assertEquals(14, jDayChooser0.getDay());
      assertTrue(jDayChooser0.isDecorationBackgroundVisible());
  }

  /**
  //Test case number: 33
  /*Coverage entropy=2.662701752014223
  */
  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      JDayChooser jDayChooser0 = new JDayChooser();
      MockDate mockDate0 = new MockDate();
      jDayChooser0.setSelectableDateRange((Date) null, mockDate0);
      assertEquals(14, jDayChooser0.getDay());
      assertTrue(jDayChooser0.isDayBordersVisible());
  }

  /**
  //Test case number: 34
  /*Coverage entropy=2.662701752014223
  */
  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      JDayChooser jDayChooser0 = new JDayChooser();
      MockDate mockDate0 = new MockDate();
      jDayChooser0.setSelectableDateRange(mockDate0, (Date) null);
      assertTrue(jDayChooser0.isDayBordersVisible());
      assertEquals(14, jDayChooser0.getDay());
      assertTrue(jDayChooser0.isDecorationBackgroundVisible());
  }

  /**
  //Test case number: 35
  /*Coverage entropy=2.616230775360895
  */
  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      GVTAttributedCharacterIterator.TextAttribute gVTAttributedCharacterIterator_TextAttribute0 = GVTAttributedCharacterIterator.TextAttribute.FONT_VARIANT;
      JDayChooser jDayChooser0 = new JDayChooser((boolean) gVTAttributedCharacterIterator_TextAttribute0.STRIKETHROUGH_ON);
      jDayChooser0.setWeekOfYearVisible(false);
      assertEquals(14, jDayChooser0.getDay());
      assertFalse(jDayChooser0.isDecorationBordersVisible());
  }

  /**
  //Test case number: 36
  /*Coverage entropy=2.5983833927870665
  */
  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      JDayChooser jDayChooser0 = new JDayChooser(true);
      assertTrue(jDayChooser0.isWeekOfYearVisible());
      
      jDayChooser0.setWeekOfYearVisible(true);
      assertTrue(jDayChooser0.isDecorationBackgroundVisible());
      assertEquals(14, jDayChooser0.getDay());
  }

  /**
  //Test case number: 37
  /*Coverage entropy=2.6527697871323417
  */
  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      JDayChooser jDayChooser0 = new JDayChooser();
      assertFalse(jDayChooser0.isWeekOfYearVisible());
      
      jDayChooser0.setWeekOfYearVisible(true);
      assertEquals(14, jDayChooser0.getDay());
  }

  /**
  //Test case number: 38
  /*Coverage entropy=2.669576756952125
  */
  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      JDayChooser jDayChooser0 = new JDayChooser();
      jDayChooser0.setEnabled(true);
      assertFalse(jDayChooser0.isDecorationBordersVisible());
      assertEquals(14, jDayChooser0.getDay());
      assertTrue(jDayChooser0.isDecorationBackgroundVisible());
  }

  /**
  //Test case number: 39
  /*Coverage entropy=2.7066976132799025
  */
  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      JDayChooser jDayChooser0 = new JDayChooser();
      assertEquals(14, jDayChooser0.getDay());
      
      jDayChooser0.setDay((-2185));
      KeyEvent keyEvent0 = new KeyEvent(jDayChooser0, 37, 0L, 1391, 37, 'X');
      jDayChooser0.keyPressed(keyEvent0);
      assertTrue(jDayChooser0.isDecorationBackgroundVisible());
  }

  /**
  //Test case number: 40
  /*Coverage entropy=2.7100799133333875
  */
  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      JDayChooser jDayChooser0 = new JDayChooser();
      KeyEvent keyEvent0 = new KeyEvent(jDayChooser0, 9, 9, 9, 9, 'H');
      jDayChooser0.keyPressed(keyEvent0);
      assertFalse(jDayChooser0.isWeekOfYearVisible());
      assertFalse(jDayChooser0.isDecorationBordersVisible());
      assertEquals(14, jDayChooser0.getDay());
  }

  /**
  //Test case number: 41
  /*Coverage entropy=2.7100799133333875
  */
  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      JDayChooser jDayChooser0 = new JDayChooser();
      KeyEvent keyEvent0 = new KeyEvent(jDayChooser0, 34, 34, 34, 39, 'd');
      jDayChooser0.keyPressed(keyEvent0);
      assertEquals(15, jDayChooser0.getDay());
  }

  /**
  //Test case number: 42
  /*Coverage entropy=2.7100799133333875
  */
  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      JDayChooser jDayChooser0 = new JDayChooser();
      KeyEvent keyEvent0 = new KeyEvent(jDayChooser0, 36, 15897600003L, 36, 36, '4');
      assertEquals(14, jDayChooser0.getDay());
      
      jDayChooser0.keyPressed(keyEvent0);
      assertEquals(1, jDayChooser0.getDay());
  }

  /**
  //Test case number: 43
  /*Coverage entropy=2.749972735605312
  */
  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      JDayChooser jDayChooser0 = new JDayChooser();
      KeyEvent keyEvent0 = new KeyEvent(jDayChooser0, 34, '4', 34, 34, '4');
      // Undeclared exception!
      try { 
        jDayChooser0.keyPressed(keyEvent0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("accessories.plugins.time.JDayChooser", e);
      }
  }

  /**
  //Test case number: 44
  /*Coverage entropy=2.7100799133333875
  */
  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      JDayChooser jDayChooser0 = new JDayChooser();
      KeyEvent keyEvent0 = new KeyEvent(jDayChooser0, 40, 13219200000L, 40, 40, ')');
      jDayChooser0.keyPressed(keyEvent0);
      assertEquals(21, jDayChooser0.getDay());
  }

  /**
  //Test case number: 45
  /*Coverage entropy=2.749972735605312
  */
  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      JDayChooser jDayChooser0 = new JDayChooser();
      KeyEvent keyEvent0 = new KeyEvent(jDayChooser0, 40, 40, 40, 33, '5');
      // Undeclared exception!
      try { 
        jDayChooser0.keyPressed(keyEvent0);
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
  /*Coverage entropy=2.630470240160676
  */
  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      JDayChooser jDayChooser0 = new JDayChooser();
      jDayChooser0.setDay(36);
      jDayChooser0.setMonth(36);
      assertEquals(31, jDayChooser0.getDay());
  }

  /**
  //Test case number: 47
  /*Coverage entropy=2.6354848637097823
  */
  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      JDayChooser jDayChooser0 = new JDayChooser();
      jDayChooser0.setMonth(2);
      assertEquals(14, jDayChooser0.getDay());
      assertTrue(jDayChooser0.isDecorationBackgroundVisible());
  }

  /**
  //Test case number: 48
  /*Coverage entropy=2.6527697871323417
  */
  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
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
  //Test case number: 49
  /*Coverage entropy=2.6789477095792162
  */
  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      GVTAttributedCharacterIterator.TextAttribute gVTAttributedCharacterIterator_TextAttribute0 = GVTAttributedCharacterIterator.TextAttribute.FLOW_REGIONS;
      JDayChooser jDayChooser0 = new JDayChooser();
      jDayChooser0.setMaxDayCharacters((int) gVTAttributedCharacterIterator_TextAttribute0.ARABIC_MEDIAL);
      int int0 = jDayChooser0.getMaxDayCharacters();
      assertEquals(4, int0);
  }

  /**
  //Test case number: 50
  /*Coverage entropy=2.6442551993262904
  */
  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      GVTAttributedCharacterIterator.TextAttribute gVTAttributedCharacterIterator_TextAttribute0 = GVTAttributedCharacterIterator.TextAttribute.ALT_GLYPH_HANDLER;
      JDayChooser jDayChooser0 = new JDayChooser();
      jDayChooser0.setMaxDayCharacters((int) gVTAttributedCharacterIterator_TextAttribute0.ORIENTATION_AUTO);
      assertEquals(2, jDayChooser0.getMaxDayCharacters());
      
      jDayChooser0.setMaxDayCharacters((int) gVTAttributedCharacterIterator_TextAttribute0.UNDERLINE_ON);
      assertEquals(14, jDayChooser0.getDay());
  }

  /**
  //Test case number: 51
  /*Coverage entropy=2.5983833927870665
  */
  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      JDayChooser jDayChooser0 = new JDayChooser(true);
      KeyEvent keyEvent0 = new KeyEvent(jDayChooser0, 1920, 1920, 10, (-826), 'N');
      jDayChooser0.keyTyped(keyEvent0);
      assertEquals(14, jDayChooser0.getDay());
      assertTrue(jDayChooser0.isDayBordersVisible());
  }

  /**
  //Test case number: 52
  /*Coverage entropy=2.6354848637097823
  */
  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      JDayChooser jDayChooser0 = new JDayChooser();
      Calendar calendar0 = MockCalendar.getInstance();
      jDayChooser0.setCalendar(calendar0);
      assertTrue(jDayChooser0.isDecorationBackgroundVisible());
      assertEquals(14, jDayChooser0.getDay());
      assertFalse(jDayChooser0.isDecorationBordersVisible());
  }

  /**
  //Test case number: 53
  /*Coverage entropy=2.6354848637097823
  */
  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      JDayChooser jDayChooser0 = new JDayChooser();
      int int0 = jDayChooser0.getDay();
      assertFalse(jDayChooser0.isDecorationBordersVisible());
      assertTrue(jDayChooser0.isDayBordersVisible());
      assertEquals(14, int0);
  }

  /**
  //Test case number: 54
  /*Coverage entropy=2.6354848637097823
  */
  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      JDayChooser jDayChooser0 = new JDayChooser();
      FocusEvent focusEvent0 = new FocusEvent(jDayChooser0, 4458, false);
      jDayChooser0.focusGained(focusEvent0);
      assertTrue(jDayChooser0.isDecorationBackgroundVisible());
      assertEquals(14, jDayChooser0.getDay());
      assertFalse(jDayChooser0.isDecorationBordersVisible());
  }

  /**
  //Test case number: 55
  /*Coverage entropy=2.6354848637097823
  */
  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      JDayChooser jDayChooser0 = new JDayChooser();
      jDayChooser0.getMinSelectableDate();
      assertEquals(14, jDayChooser0.getDay());
      assertFalse(jDayChooser0.isDecorationBordersVisible());
      assertTrue(jDayChooser0.isDecorationBackgroundVisible());
  }

  /**
  //Test case number: 56
  /*Coverage entropy=2.6354848637097823
  */
  @Test(timeout = 4000)
  public void test56()  throws Throwable  {
      JDayChooser jDayChooser0 = new JDayChooser();
      JMonthChooser jMonthChooser0 = new JMonthChooser();
      jDayChooser0.setMonthChooser(jMonthChooser0);
      assertTrue(jDayChooser0.isDayBordersVisible());
      assertTrue(jDayChooser0.isDecorationBackgroundVisible());
      assertEquals(14, jDayChooser0.getDay());
  }

  /**
  //Test case number: 57
  /*Coverage entropy=2.6354848637097823
  */
  @Test(timeout = 4000)
  public void test57()  throws Throwable  {
      JDayChooser jDayChooser0 = new JDayChooser();
      jDayChooser0.getWeekdayForeground();
      assertEquals(14, jDayChooser0.getDay());
      assertTrue(jDayChooser0.isDayBordersVisible());
  }

  /**
  //Test case number: 58
  /*Coverage entropy=2.6354848637097823
  */
  @Test(timeout = 4000)
  public void test58()  throws Throwable  {
      JDayChooser jDayChooser0 = new JDayChooser();
      jDayChooser0.getDayPanel();
      assertFalse(jDayChooser0.isWeekOfYearVisible());
      assertEquals(14, jDayChooser0.getDay());
  }

  /**
  //Test case number: 59
  /*Coverage entropy=2.6354848637097823
  */
  @Test(timeout = 4000)
  public void test59()  throws Throwable  {
      JDayChooser jDayChooser0 = new JDayChooser();
      jDayChooser0.getSelectedDay();
      assertTrue(jDayChooser0.isDayBordersVisible());
      assertEquals(14, jDayChooser0.getDay());
      assertFalse(jDayChooser0.isWeekOfYearVisible());
  }

  /**
  //Test case number: 60
  /*Coverage entropy=2.5983833927870665
  */
  @Test(timeout = 4000)
  public void test60()  throws Throwable  {
      JDayChooser jDayChooser0 = new JDayChooser(true);
      KeyEvent keyEvent0 = new KeyEvent(jDayChooser0, 0, (-3992L), 916, 10161, '\"');
      jDayChooser0.keyReleased(keyEvent0);
      assertEquals(14, jDayChooser0.getDay());
  }

  /**
  //Test case number: 61
  /*Coverage entropy=2.6354848637097823
  */
  @Test(timeout = 4000)
  public void test61()  throws Throwable  {
      JDayChooser jDayChooser0 = new JDayChooser();
      JYearChooser jYearChooser0 = new JYearChooser();
      jDayChooser0.setYearChooser(jYearChooser0);
      assertEquals(14, jDayChooser0.getDay());
      assertFalse(jDayChooser0.isDecorationBordersVisible());
  }

  /**
  //Test case number: 62
  /*Coverage entropy=2.6354848637097823
  */
  @Test(timeout = 4000)
  public void test62()  throws Throwable  {
      JDayChooser jDayChooser0 = new JDayChooser();
      FocusEvent focusEvent0 = new FocusEvent(jDayChooser0, (-2539), false, jDayChooser0);
      jDayChooser0.focusLost(focusEvent0);
      assertEquals(14, jDayChooser0.getDay());
      assertTrue(jDayChooser0.isDayBordersVisible());
      assertFalse(jDayChooser0.isDecorationBordersVisible());
      assertFalse(jDayChooser0.isWeekOfYearVisible());
  }

  /**
  //Test case number: 63
  /*Coverage entropy=2.5983833927870665
  */
  @Test(timeout = 4000)
  public void test63()  throws Throwable  {
      JDayChooser jDayChooser0 = new JDayChooser(true);
      Color color0 = Color.BLACK;
      jDayChooser0.setSundayForeground(color0);
      assertEquals(14, jDayChooser0.getDay());
      assertTrue(jDayChooser0.isDecorationBackgroundVisible());
  }

  /**
  //Test case number: 64
  /*Coverage entropy=2.6354848637097823
  */
  @Test(timeout = 4000)
  public void test64()  throws Throwable  {
      JDayChooser jDayChooser0 = new JDayChooser();
      jDayChooser0.getDecorationBackgroundColor();
      assertEquals(14, jDayChooser0.getDay());
      assertFalse(jDayChooser0.isDecorationBordersVisible());
  }

  /**
  //Test case number: 65
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test65()  throws Throwable  {
      // Undeclared exception!
      try { 
        JDayChooser.main((String[]) null);
        fail("Expecting exception: HeadlessException");
      
      } catch(HeadlessException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.awt.GraphicsEnvironment", e);
      }
  }

  /**
  //Test case number: 66
  /*Coverage entropy=2.5983833927870665
  */
  @Test(timeout = 4000)
  public void test66()  throws Throwable  {
      JDayChooser jDayChooser0 = new JDayChooser(true);
      int int0 = jDayChooser0.getMaxDayCharacters();
      assertEquals(14, jDayChooser0.getDay());
      assertEquals(0, int0);
      assertTrue(jDayChooser0.isWeekOfYearVisible());
      assertFalse(jDayChooser0.isDecorationBordersVisible());
  }

  /**
  //Test case number: 67
  /*Coverage entropy=2.6354848637097823
  */
  @Test(timeout = 4000)
  public void test67()  throws Throwable  {
      JDayChooser jDayChooser0 = new JDayChooser();
      SystemColor systemColor0 = SystemColor.info;
      jDayChooser0.setWeekdayForeground(systemColor0);
      assertTrue(jDayChooser0.isDayBordersVisible());
      assertEquals(14, jDayChooser0.getDay());
      assertTrue(jDayChooser0.isDecorationBackgroundVisible());
      assertFalse(jDayChooser0.isWeekOfYearVisible());
  }

  /**
  //Test case number: 68
  /*Coverage entropy=2.6354848637097823
  */
  @Test(timeout = 4000)
  public void test68()  throws Throwable  {
      JDayChooser jDayChooser0 = new JDayChooser();
      GVTAttributedCharacterIterator.TextAttribute gVTAttributedCharacterIterator_TextAttribute0 = GVTAttributedCharacterIterator.TextAttribute.X;
      jDayChooser0.setYear((int) gVTAttributedCharacterIterator_TextAttribute0.WRITING_MODE_LTR);
      assertTrue(jDayChooser0.isDayBordersVisible());
      assertEquals(14, jDayChooser0.getDay());
      assertTrue(jDayChooser0.isDecorationBackgroundVisible());
  }

  /**
  //Test case number: 69
  /*Coverage entropy=2.6354848637097823
  */
  @Test(timeout = 4000)
  public void test69()  throws Throwable  {
      JDayChooser jDayChooser0 = new JDayChooser();
      jDayChooser0.isDecorationBordersVisible();
      assertEquals(14, jDayChooser0.getDay());
  }

  /**
  //Test case number: 70
  /*Coverage entropy=2.6354848637097823
  */
  @Test(timeout = 4000)
  public void test70()  throws Throwable  {
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
  //Test case number: 71
  /*Coverage entropy=2.6354848637097823
  */
  @Test(timeout = 4000)
  public void test71()  throws Throwable  {
      JDayChooser jDayChooser0 = new JDayChooser();
      boolean boolean0 = jDayChooser0.isDecorationBackgroundVisible();
      assertTrue(boolean0);
      assertEquals(14, jDayChooser0.getDay());
  }

  /**
  //Test case number: 72
  /*Coverage entropy=2.6354848637097823
  */
  @Test(timeout = 4000)
  public void test72()  throws Throwable  {
      JDayChooser jDayChooser0 = new JDayChooser();
      jDayChooser0.getSundayForeground();
      assertFalse(jDayChooser0.isWeekOfYearVisible());
      assertTrue(jDayChooser0.isDecorationBackgroundVisible());
      assertEquals(14, jDayChooser0.getDay());
      assertFalse(jDayChooser0.isDecorationBordersVisible());
  }

  /**
  //Test case number: 73
  /*Coverage entropy=2.6354848637097823
  */
  @Test(timeout = 4000)
  public void test73()  throws Throwable  {
      JDayChooser jDayChooser0 = new JDayChooser();
      jDayChooser0.getMaxSelectableDate();
      assertEquals(14, jDayChooser0.getDay());
  }

  /**
  //Test case number: 74
  /*Coverage entropy=2.6354848637097823
  */
  @Test(timeout = 4000)
  public void test74()  throws Throwable  {
      JDayChooser jDayChooser0 = new JDayChooser();
      jDayChooser0.isDayBordersVisible();
      assertEquals(14, jDayChooser0.getDay());
      assertFalse(jDayChooser0.isDecorationBordersVisible());
  }

  /**
  //Test case number: 75
  /*Coverage entropy=2.5983833927870665
  */
  @Test(timeout = 4000)
  public void test75()  throws Throwable  {
      JDayChooser jDayChooser0 = new JDayChooser(false);
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
  //Test case number: 76
  /*Coverage entropy=2.6354848637097823
  */
  @Test(timeout = 4000)
  public void test76()  throws Throwable  {
      JDayChooser jDayChooser0 = new JDayChooser();
      jDayChooser0.setAlwaysFireDayProperty(false);
      assertEquals(14, jDayChooser0.getDay());
      assertFalse(jDayChooser0.isDecorationBordersVisible());
  }

  /**
  //Test case number: 77
  /*Coverage entropy=2.6354848637097823
  */
  @Test(timeout = 4000)
  public void test77()  throws Throwable  {
      JDayChooser jDayChooser0 = new JDayChooser();
      jDayChooser0.isWeekOfYearVisible();
      assertTrue(jDayChooser0.isDayBordersVisible());
      assertEquals(14, jDayChooser0.getDay());
  }
}
