/*
 * This file was automatically generated by EvoSuite
 * Sat Nov 07 08:25:07 GMT 2020
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
import java.awt.Graphics;
import java.awt.HeadlessException;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.FocusEvent;
import java.awt.event.KeyEvent;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.tree.DefaultTreeCellRenderer;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.util.MockDate;
import org.evosuite.runtime.mock.java.util.MockGregorianCalendar;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class JDayChooser_ESTest extends JDayChooser_ESTest_scaffolding {

  /**
  //Test case number: 0
  /*Coverage entropy=2.6442551993262904
  */
  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      JDayChooser jDayChooser0 = new JDayChooser();
      jDayChooser0.setMaxDayCharacters(3);
      assertEquals(14, jDayChooser0.getDay());
      assertTrue(jDayChooser0.isDayBordersVisible());
      assertFalse(jDayChooser0.isDecorationBordersVisible());
      assertTrue(jDayChooser0.isDecorationBackgroundVisible());
  }

  /**
  //Test case number: 1
  /*Coverage entropy=2.5983833927870665
  */
  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      JDayChooser jDayChooser0 = new JDayChooser();
      jDayChooser0.drawDays();
      assertEquals(14, jDayChooser0.getDay());
      assertFalse(jDayChooser0.isDecorationBordersVisible());
      assertTrue(jDayChooser0.isDecorationBackgroundVisible());
      assertFalse(jDayChooser0.isWeekOfYearVisible());
  }

  /**
  //Test case number: 2
  /*Coverage entropy=2.5983833927870665
  */
  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      JDayChooser jDayChooser0 = new JDayChooser();
      jDayChooser0.initDecorations();
      assertEquals(14, jDayChooser0.getDay());
      assertTrue(jDayChooser0.isDayBordersVisible());
      assertFalse(jDayChooser0.isDecorationBordersVisible());
      assertFalse(jDayChooser0.isWeekOfYearVisible());
  }

  /**
  //Test case number: 3
  /*Coverage entropy=2.5983833927870665
  */
  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      JDayChooser jDayChooser0 = new JDayChooser();
      jDayChooser0.init();
      assertEquals(14, jDayChooser0.getDay());
      assertTrue(jDayChooser0.isDecorationBackgroundVisible());
  }

  /**
  //Test case number: 4
  /*Coverage entropy=2.5983833927870665
  */
  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      JDayChooser jDayChooser0 = new JDayChooser();
      jDayChooser0.drawWeeks();
      assertTrue(jDayChooser0.isDayBordersVisible());
      assertEquals(14, jDayChooser0.getDay());
      assertFalse(jDayChooser0.isWeekOfYearVisible());
  }

  /**
  //Test case number: 5
  /*Coverage entropy=2.6354848637097823
  */
  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      JDayChooser jDayChooser0 = new JDayChooser();
      boolean boolean0 = jDayChooser0.isWeekOfYearVisible();
      assertFalse(boolean0);
      assertEquals(14, jDayChooser0.getDay());
      assertTrue(jDayChooser0.isDayBordersVisible());
      assertFalse(jDayChooser0.isDecorationBordersVisible());
  }

  /**
  //Test case number: 6
  /*Coverage entropy=2.6527697871323417
  */
  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      JDayChooser jDayChooser0 = new JDayChooser();
      jDayChooser0.minSelectableDate = null;
      // Undeclared exception!
      try { 
        jDayChooser0.setMaxDayCharacters((-1));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  /**
  //Test case number: 7
  /*Coverage entropy=2.6527697871323417
  */
  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      JDayChooser jDayChooser0 = new JDayChooser();
      JButton[] jButtonArray0 = new JButton[3];
      JButton jButton0 = new JButton();
      jButtonArray0[0] = jButton0;
      jButtonArray0[1] = jButtonArray0[0];
      jButtonArray0[2] = jButtonArray0[1];
      jDayChooser0.weeks = jButtonArray0;
      // Undeclared exception!
      try { 
        jDayChooser0.setMaxDayCharacters((-2169));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 3
         //
         verifyException("accessories.plugins.time.JDayChooser", e);
      }
  }

  /**
  //Test case number: 8
  /*Coverage entropy=2.6527697871323417
  */
  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
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
  //Test case number: 9
  /*Coverage entropy=2.5983833927870665
  */
  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      JDayChooser jDayChooser0 = new JDayChooser(false);
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
  //Test case number: 10
  /*Coverage entropy=2.6354848637097823
  */
  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      JDayChooser jDayChooser0 = new JDayChooser();
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar((-560), 1928, (-560), (-2251), 1928);
      mockGregorianCalendar0.setLenient(false);
      // Undeclared exception!
      try { 
        jDayChooser0.setCalendar(mockGregorianCalendar0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // YEAR
         //
         verifyException("java.util.GregorianCalendar", e);
      }
  }

  /**
  //Test case number: 11
  /*Coverage entropy=2.5983833927870665
  */
  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      JDayChooser jDayChooser0 = new JDayChooser();
      jDayChooser0.calendar = null;
      // Undeclared exception!
      try { 
        jDayChooser0.drawDays();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("accessories.plugins.time.JDayChooser", e);
      }
  }

  /**
  //Test case number: 12
  /*Coverage entropy=2.5983833927870665
  */
  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      JDayChooser jDayChooser0 = new JDayChooser();
      // Undeclared exception!
      try { 
        jDayChooser0.addListeners((-145));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  /**
  //Test case number: 13
  /*Coverage entropy=2.6354848637097823
  */
  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      JDayChooser jDayChooser0 = new JDayChooser();
      JButton jButton0 = new JButton();
      ActionEvent actionEvent0 = new ActionEvent(jButton0, 27, "day", (-504));
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
  //Test case number: 14
  /*Coverage entropy=2.6354848637097823
  */
  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      JDayChooser jDayChooser0 = new JDayChooser();
      ActionEvent actionEvent0 = new ActionEvent(jDayChooser0, 19, "day");
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
  //Test case number: 15
  /*Coverage entropy=2.5983833927870665
  */
  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      JDayChooser jDayChooser0 = new JDayChooser();
      jDayChooser0.updateUI();
      assertTrue(jDayChooser0.isDayBordersVisible());
      assertEquals(14, jDayChooser0.getDay());
  }

  /**
  //Test case number: 16
  /*Coverage entropy=2.5983833927870665
  */
  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      JDayChooser jDayChooser0 = new JDayChooser();
      jDayChooser0.setDayBordersVisible(true);
      assertTrue(jDayChooser0.isDayBordersVisible());
      assertEquals(14, jDayChooser0.getDay());
      assertTrue(jDayChooser0.isDecorationBackgroundVisible());
  }

  /**
  //Test case number: 17
  /*Coverage entropy=2.6354848637097823
  */
  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      JDayChooser jDayChooser0 = new JDayChooser();
      jDayChooser0.setFocus();
      assertEquals(14, jDayChooser0.getDay());
  }

  /**
  //Test case number: 18
  /*Coverage entropy=2.5983833927870665
  */
  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      JDayChooser jDayChooser0 = new JDayChooser();
      Color color0 = Color.pink;
      jDayChooser0.setForeground(color0);
      assertFalse(jDayChooser0.isDecorationBordersVisible());
  }

  /**
  //Test case number: 19
  /*Coverage entropy=2.5983833927870665
  */
  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      JDayChooser jDayChooser0 = new JDayChooser();
      jDayChooser0.setFont((Font) null);
      assertEquals(14, jDayChooser0.getDay());
      assertFalse(jDayChooser0.isDecorationBordersVisible());
  }

  /**
  //Test case number: 20
  /*Coverage entropy=2.5983833927870665
  */
  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      JDayChooser jDayChooser0 = new JDayChooser();
      jDayChooser0.setDecorationBackgroundVisible(true);
      assertTrue(jDayChooser0.isDayBordersVisible());
      assertEquals(14, jDayChooser0.getDay());
      assertTrue(jDayChooser0.isDecorationBackgroundVisible());
  }

  /**
  //Test case number: 21
  /*Coverage entropy=2.6354848637097823
  */
  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      JDayChooser jDayChooser0 = new JDayChooser();
      int int0 = jDayChooser0.getDay();
      assertEquals(14, int0);
      assertFalse(jDayChooser0.isDecorationBordersVisible());
  }

  /**
  //Test case number: 22
  /*Coverage entropy=2.5604230937343346
  */
  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      JDayChooser jDayChooser0 = new JDayChooser(false);
      jDayChooser0.setDecorationBordersVisible(false);
      assertFalse(jDayChooser0.isWeekOfYearVisible());
      assertEquals(14, jDayChooser0.getDay());
  }

  /**
  //Test case number: 23
  /*Coverage entropy=2.6354848637097823
  */
  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      JDayChooser jDayChooser0 = new JDayChooser();
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
  //Test case number: 24
  /*Coverage entropy=2.5983833927870665
  */
  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      JDayChooser jDayChooser0 = new JDayChooser();
      jDayChooser0.addListeners(18);
      assertEquals(14, jDayChooser0.getDay());
      assertFalse(jDayChooser0.isDecorationBordersVisible());
  }

  /**
  //Test case number: 25
  /*Coverage entropy=2.5983833927870665
  */
  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      JDayChooser jDayChooser0 = new JDayChooser();
      jDayChooser0.getDaysInMonth();
      assertEquals(14, jDayChooser0.getDay());
      assertTrue(jDayChooser0.isDecorationBackgroundVisible());
      assertTrue(jDayChooser0.isDayBordersVisible());
  }

  /**
  //Test case number: 26
  /*Coverage entropy=2.6354848637097823
  */
  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      JDayChooser jDayChooser0 = new JDayChooser();
      JDayChooser.DecoratorButton jDayChooser_DecoratorButton0 = jDayChooser0.new DecoratorButton();
      jDayChooser_DecoratorButton0.paint((Graphics) null);
      assertFalse(jDayChooser0.isDecorationBordersVisible());
      assertFalse(jDayChooser0.isWeekOfYearVisible());
  }

  /**
  //Test case number: 27
  /*Coverage entropy=2.662701752014223
  */
  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      JDayChooser jDayChooser0 = new JDayChooser();
      jDayChooser0.setMaxDayCharacters(173);
      assertEquals(14, jDayChooser0.getDay());
      assertEquals(0, jDayChooser0.getMaxDayCharacters());
      assertTrue(jDayChooser0.isDayBordersVisible());
  }

  /**
  //Test case number: 28
  /*Coverage entropy=2.6354848637097823
  */
  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      JDayChooser jDayChooser0 = new JDayChooser();
      jDayChooser0.setMaxDayCharacters(0);
      assertEquals(14, jDayChooser0.getDay());
      assertTrue(jDayChooser0.isDayBordersVisible());
  }

  /**
  //Test case number: 29
  /*Coverage entropy=2.6354848637097823
  */
  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      JDayChooser jDayChooser0 = new JDayChooser();
      jDayChooser0.setMinSelectableDate((Date) null);
      assertTrue(jDayChooser0.isDayBordersVisible());
      assertEquals(14, jDayChooser0.getDay());
  }

  /**
  //Test case number: 30
  /*Coverage entropy=2.6354848637097823
  */
  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      JDayChooser jDayChooser0 = new JDayChooser();
      java.sql.Date date0 = new java.sql.Date(1L);
      jDayChooser0.setMinSelectableDate(date0);
      assertFalse(jDayChooser0.isWeekOfYearVisible());
      assertEquals(14, jDayChooser0.getDay());
      assertFalse(jDayChooser0.isDecorationBordersVisible());
  }

  /**
  //Test case number: 31
  /*Coverage entropy=2.6354848637097823
  */
  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      JDayChooser jDayChooser0 = new JDayChooser();
      jDayChooser0.setMaxSelectableDate((Date) null);
      assertEquals(14, jDayChooser0.getDay());
      assertFalse(jDayChooser0.isDecorationBordersVisible());
      assertTrue(jDayChooser0.isDecorationBackgroundVisible());
  }

  /**
  //Test case number: 32
  /*Coverage entropy=2.6354848637097823
  */
  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      JDayChooser jDayChooser0 = new JDayChooser();
      Date date0 = jDayChooser0.defaultMinSelectableDate;
      jDayChooser0.setMaxSelectableDate(date0);
      assertFalse(jDayChooser0.isDecorationBordersVisible());
      assertFalse(jDayChooser0.isWeekOfYearVisible());
      assertEquals(14, jDayChooser0.getDay());
  }

  /**
  //Test case number: 33
  /*Coverage entropy=2.662701752014223
  */
  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      MockDate mockDate0 = new MockDate();
      JDayChooser jDayChooser0 = new JDayChooser();
      MockDate mockDate1 = new MockDate(1247, 1247, (-2182));
      jDayChooser0.setSelectableDateRange(mockDate1, mockDate0);
      assertFalse(jDayChooser0.isDecorationBordersVisible());
  }

  /**
  //Test case number: 34
  /*Coverage entropy=2.662701752014223
  */
  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      JDayChooser jDayChooser0 = new JDayChooser();
      jDayChooser0.setSelectableDateRange((Date) null, (Date) null);
      assertFalse(jDayChooser0.isWeekOfYearVisible());
      assertEquals(14, jDayChooser0.getDay());
      assertTrue(jDayChooser0.isDayBordersVisible());
      assertFalse(jDayChooser0.isDecorationBordersVisible());
  }

  /**
  //Test case number: 35
  /*Coverage entropy=2.669576756952125
  */
  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      JDayChooser jDayChooser0 = new JDayChooser();
      SystemColor systemColor0 = SystemColor.menuText;
      jDayChooser0.setDecorationBackgroundColor(systemColor0);
      assertTrue(jDayChooser0.isDecorationBackgroundVisible());
      assertFalse(jDayChooser0.isDecorationBordersVisible());
      assertTrue(jDayChooser0.isDayBordersVisible());
      assertEquals(14, jDayChooser0.getDay());
  }

  /**
  //Test case number: 36
  /*Coverage entropy=2.616230775360895
  */
  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      JDayChooser jDayChooser0 = new JDayChooser(true);
      assertTrue(jDayChooser0.isWeekOfYearVisible());
      
      jDayChooser0.setWeekOfYearVisible(false);
      assertEquals(14, jDayChooser0.getDay());
  }

  /**
  //Test case number: 37
  /*Coverage entropy=2.6354848637097823
  */
  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      JDayChooser jDayChooser0 = new JDayChooser();
      jDayChooser0.setWeekOfYearVisible(false);
      assertEquals(14, jDayChooser0.getDay());
  }

  /**
  //Test case number: 38
  /*Coverage entropy=2.6527697871323417
  */
  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      JDayChooser jDayChooser0 = new JDayChooser();
      jDayChooser0.setWeekOfYearVisible(true);
      assertFalse(jDayChooser0.isDecorationBordersVisible());
      assertEquals(14, jDayChooser0.getDay());
  }

  /**
  //Test case number: 39
  /*Coverage entropy=2.6344753508465937
  */
  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      JDayChooser jDayChooser0 = new JDayChooser(false);
      jDayChooser0.setEnabled(true);
      assertTrue(jDayChooser0.isDecorationBackgroundVisible());
      assertEquals(14, jDayChooser0.getDay());
      assertTrue(jDayChooser0.isDayBordersVisible());
  }

  /**
  //Test case number: 40
  /*Coverage entropy=2.7100799133333875
  */
  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      JDayChooser jDayChooser0 = new JDayChooser();
      KeyEvent keyEvent0 = new KeyEvent(jDayChooser0, 38, (-2293L), 4, 40, '_');
      jDayChooser0.keyPressed(keyEvent0);
      assertEquals(21, jDayChooser0.getDay());
  }

  /**
  //Test case number: 41
  /*Coverage entropy=2.7100799133333875
  */
  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      JDayChooser jDayChooser0 = new JDayChooser();
      KeyEvent keyEvent0 = new KeyEvent(jDayChooser0, 37, 0L, 795, 39, 'i');
      jDayChooser0.keyPressed(keyEvent0);
      assertEquals(15, jDayChooser0.getDay());
  }

  /**
  //Test case number: 42
  /*Coverage entropy=2.6926101796366284
  */
  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      JDayChooser jDayChooser0 = new JDayChooser();
      KeyEvent keyEvent0 = new KeyEvent(jDayChooser0, 38, (-552L), 795, 38, '-');
      jDayChooser0.keyPressed(keyEvent0);
      jDayChooser0.keyPressed(keyEvent0);
      assertEquals(7, jDayChooser0.getDay());
  }

  /**
  //Test case number: 43
  /*Coverage entropy=2.7100799133333875
  */
  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      JDayChooser jDayChooser0 = new JDayChooser();
      KeyEvent keyEvent0 = new KeyEvent(jDayChooser0, 35, 35, 35, 35, 'f');
      assertEquals(14, jDayChooser0.getDay());
      
      jDayChooser0.keyPressed(keyEvent0);
      assertEquals(28, jDayChooser0.getDay());
  }

  /**
  //Test case number: 44
  /*Coverage entropy=2.749972735605312
  */
  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      JDayChooser jDayChooser0 = new JDayChooser();
      KeyEvent keyEvent0 = new KeyEvent(jDayChooser0, 34, 34, 34, 34, 'c');
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
  //Test case number: 45
  /*Coverage entropy=2.7100799133333875
  */
  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      JDayChooser jDayChooser0 = new JDayChooser();
      KeyEvent keyEvent0 = new KeyEvent(jDayChooser0, 1465, 1465, 1465, 1465, '|');
      jDayChooser0.keyPressed(keyEvent0);
      assertEquals(14, jDayChooser0.getDay());
      assertTrue(jDayChooser0.isDecorationBackgroundVisible());
  }

  /**
  //Test case number: 46
  /*Coverage entropy=2.6354848637097823
  */
  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      JDayChooser jDayChooser0 = new JDayChooser();
      jDayChooser0.setMonth(122);
      assertEquals(14, jDayChooser0.getDay());
  }

  /**
  //Test case number: 47
  /*Coverage entropy=2.593621512459067
  */
  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      JDayChooser jDayChooser0 = new JDayChooser();
      assertEquals(14, jDayChooser0.getDay());
      
      jDayChooser0.setDay(44);
      assertEquals(28, jDayChooser0.getDay());
  }

  /**
  //Test case number: 48
  /*Coverage entropy=2.593621512459067
  */
  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      JDayChooser jDayChooser0 = new JDayChooser();
      assertEquals(14, jDayChooser0.getDay());
      
      jDayChooser0.setDay((-522));
      assertTrue(jDayChooser0.isDayBordersVisible());
  }

  /**
  //Test case number: 49
  /*Coverage entropy=2.6442551993262904
  */
  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      JDayChooser jDayChooser0 = new JDayChooser();
      jDayChooser0.setMaxDayCharacters(4);
      assertEquals(4, jDayChooser0.getMaxDayCharacters());
  }

  /**
  //Test case number: 50
  /*Coverage entropy=2.62408265354619
  */
  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      JDayChooser jDayChooser0 = new JDayChooser();
      jDayChooser0.maxDayCharacters = 16;
      Locale locale0 = JComponent.getDefaultLocale();
      jDayChooser0.setLocale(locale0);
      assertEquals(14, jDayChooser0.getDay());
      assertFalse(jDayChooser0.isWeekOfYearVisible());
      assertTrue(jDayChooser0.isDecorationBackgroundVisible());
      assertFalse(jDayChooser0.isDecorationBordersVisible());
      assertTrue(jDayChooser0.isDayBordersVisible());
  }

  /**
  //Test case number: 51
  /*Coverage entropy=2.6442551993262904
  */
  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      JDayChooser jDayChooser0 = new JDayChooser();
      jDayChooser0.setMaxDayCharacters(2);
      assertEquals(2, jDayChooser0.getMaxDayCharacters());
  }

  /**
  //Test case number: 52
  /*Coverage entropy=2.5983833927870665
  */
  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      JDayChooser jDayChooser0 = new JDayChooser(false);
      KeyEvent keyEvent0 = new KeyEvent(jDayChooser0, 10, 10, 1748, 35, '2');
      jDayChooser0.keyTyped(keyEvent0);
      assertTrue(jDayChooser0.isDayBordersVisible());
      assertEquals(14, jDayChooser0.getDay());
      assertFalse(jDayChooser0.isWeekOfYearVisible());
  }

  /**
  //Test case number: 53
  /*Coverage entropy=2.6354848637097823
  */
  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      JDayChooser jDayChooser0 = new JDayChooser();
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(3353, 275, 275);
      jDayChooser0.setCalendar(mockGregorianCalendar0);
      assertTrue(jDayChooser0.isDecorationBackgroundVisible());
      assertTrue(jDayChooser0.isDayBordersVisible());
      assertEquals(14, jDayChooser0.getDay());
  }

  /**
  //Test case number: 54
  /*Coverage entropy=2.6354848637097823
  */
  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      JDayChooser jDayChooser0 = new JDayChooser();
      FocusEvent focusEvent0 = new FocusEvent(jDayChooser0, 12, true, jDayChooser0);
      jDayChooser0.focusGained(focusEvent0);
      assertFalse(jDayChooser0.isDecorationBordersVisible());
      assertEquals(14, jDayChooser0.getDay());
  }

  /**
  //Test case number: 55
  /*Coverage entropy=2.698009616895563
  */
  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      JDayChooser jDayChooser0 = new JDayChooser();
      Date date0 = jDayChooser0.getMinSelectableDate();
      jDayChooser0.setSelectableDateRange(date0, date0);
      assertFalse(jDayChooser0.isDecorationBordersVisible());
      assertEquals(14, jDayChooser0.getDay());
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
      assertFalse(jDayChooser0.isDecorationBordersVisible());
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
  }

  /**
  //Test case number: 58
  /*Coverage entropy=2.6354848637097823
  */
  @Test(timeout = 4000)
  public void test58()  throws Throwable  {
      JDayChooser jDayChooser0 = new JDayChooser();
      jDayChooser0.getDayPanel();
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
      assertFalse(jDayChooser0.isDecorationBordersVisible());
      assertEquals(14, jDayChooser0.getDay());
  }

  /**
  //Test case number: 60
  /*Coverage entropy=2.6354848637097823
  */
  @Test(timeout = 4000)
  public void test60()  throws Throwable  {
      JDayChooser jDayChooser0 = new JDayChooser();
      KeyEvent keyEvent0 = new KeyEvent(jDayChooser0, 4, 0L, 4, 4, '4', 4);
      jDayChooser0.keyReleased(keyEvent0);
      assertEquals(14, jDayChooser0.getDay());
      assertFalse(jDayChooser0.isDecorationBordersVisible());
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
      assertTrue(jDayChooser0.isDayBordersVisible());
      assertTrue(jDayChooser0.isDecorationBackgroundVisible());
      assertFalse(jDayChooser0.isWeekOfYearVisible());
  }

  /**
  //Test case number: 62
  /*Coverage entropy=2.5983833927870665
  */
  @Test(timeout = 4000)
  public void test62()  throws Throwable  {
      JDayChooser jDayChooser0 = new JDayChooser(true);
      FocusEvent focusEvent0 = new FocusEvent(jDayChooser0, 0);
      jDayChooser0.focusLost(focusEvent0);
      assertEquals(14, jDayChooser0.getDay());
      assertTrue(jDayChooser0.isWeekOfYearVisible());
  }

  /**
  //Test case number: 63
  /*Coverage entropy=2.671760120846313
  */
  @Test(timeout = 4000)
  public void test63()  throws Throwable  {
      JDayChooser jDayChooser0 = new JDayChooser();
      Color color0 = jDayChooser0.getDecorationBackgroundColor();
      jDayChooser0.setSundayForeground(color0);
      assertEquals(14, jDayChooser0.getDay());
      assertTrue(jDayChooser0.isDayBordersVisible());
      assertFalse(jDayChooser0.isDecorationBordersVisible());
      assertTrue(jDayChooser0.isDecorationBackgroundVisible());
  }

  /**
  //Test case number: 64
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test64()  throws Throwable  {
      String[] stringArray0 = new String[0];
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
  //Test case number: 65
  /*Coverage entropy=2.6354848637097823
  */
  @Test(timeout = 4000)
  public void test65()  throws Throwable  {
      JDayChooser jDayChooser0 = new JDayChooser();
      int int0 = jDayChooser0.getMaxDayCharacters();
      assertFalse(jDayChooser0.isDecorationBordersVisible());
      assertEquals(0, int0);
      assertEquals(14, jDayChooser0.getDay());
  }

  /**
  //Test case number: 66
  /*Coverage entropy=2.6354848637097823
  */
  @Test(timeout = 4000)
  public void test66()  throws Throwable  {
      JDayChooser jDayChooser0 = new JDayChooser();
      DefaultTreeCellRenderer defaultTreeCellRenderer0 = new DefaultTreeCellRenderer();
      Color color0 = defaultTreeCellRenderer0.getBackgroundNonSelectionColor();
      jDayChooser0.setWeekdayForeground(color0);
      assertTrue(jDayChooser0.isDecorationBackgroundVisible());
      assertTrue(jDayChooser0.isDayBordersVisible());
      assertEquals(14, jDayChooser0.getDay());
  }

  /**
  //Test case number: 67
  /*Coverage entropy=2.6354848637097823
  */
  @Test(timeout = 4000)
  public void test67()  throws Throwable  {
      JDayChooser jDayChooser0 = new JDayChooser();
      jDayChooser0.setYear(10);
      assertFalse(jDayChooser0.isDecorationBordersVisible());
      assertEquals(14, jDayChooser0.getDay());
      assertTrue(jDayChooser0.isDayBordersVisible());
  }

  /**
  //Test case number: 68
  /*Coverage entropy=2.6354848637097823
  */
  @Test(timeout = 4000)
  public void test68()  throws Throwable  {
      JDayChooser jDayChooser0 = new JDayChooser();
      jDayChooser0.getLocale();
      assertTrue(jDayChooser0.isDecorationBackgroundVisible());
      assertEquals(14, jDayChooser0.getDay());
  }

  /**
  //Test case number: 69
  /*Coverage entropy=2.6354848637097823
  */
  @Test(timeout = 4000)
  public void test69()  throws Throwable  {
      JDayChooser jDayChooser0 = new JDayChooser();
      boolean boolean0 = jDayChooser0.isDecorationBordersVisible();
      assertTrue(jDayChooser0.isDecorationBackgroundVisible());
      assertFalse(boolean0);
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
      assertFalse(jDayChooser0.isWeekOfYearVisible());
  }

  /**
  //Test case number: 72
  /*Coverage entropy=2.6354848637097823
  */
  @Test(timeout = 4000)
  public void test72()  throws Throwable  {
      JDayChooser jDayChooser0 = new JDayChooser();
      Color color0 = jDayChooser0.getSundayForeground();
      assertTrue(jDayChooser0.isDayBordersVisible());
      assertEquals(14, jDayChooser0.getDay());
      assertFalse(jDayChooser0.isWeekOfYearVisible());
      assertTrue(jDayChooser0.isDecorationBackgroundVisible());
      assertEquals((-6029312), color0.getRGB());
  }

  /**
  //Test case number: 73
  /*Coverage entropy=2.6354848637097823
  */
  @Test(timeout = 4000)
  public void test73()  throws Throwable  {
      JDayChooser jDayChooser0 = new JDayChooser();
      jDayChooser0.getMaxSelectableDate();
      assertTrue(jDayChooser0.isDecorationBackgroundVisible());
      assertTrue(jDayChooser0.isDayBordersVisible());
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
      assertFalse(jDayChooser0.isWeekOfYearVisible());
  }

  /**
  //Test case number: 75
  /*Coverage entropy=2.749972735605312
  */
  @Test(timeout = 4000)
  public void test75()  throws Throwable  {
      JDayChooser jDayChooser0 = new JDayChooser();
      KeyEvent keyEvent0 = new KeyEvent(jDayChooser0, 33, 33, 33, 33, ')');
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
  //Test case number: 76
  /*Coverage entropy=2.62408265354619
  */
  @Test(timeout = 4000)
  public void test76()  throws Throwable  {
      JDayChooser jDayChooser0 = new JDayChooser();
      jDayChooser0.setAlwaysFireDayProperty(true);
      jDayChooser0.setDay(100);
      assertEquals(28, jDayChooser0.getDay());
  }

  /**
  //Test case number: 77
  /*Coverage entropy=2.5983833927870665
  */
  @Test(timeout = 4000)
  public void test77()  throws Throwable  {
      JDayChooser jDayChooser0 = new JDayChooser(true);
      jDayChooser0.isWeekOfYearVisible();
      assertEquals(14, jDayChooser0.getDay());
  }

  /**
  //Test case number: 78
  /*Coverage entropy=2.6354848637097823
  */
  @Test(timeout = 4000)
  public void test78()  throws Throwable  {
      JDayChooser jDayChooser0 = new JDayChooser();
      JDayChooser.DecoratorButton jDayChooser_DecoratorButton0 = jDayChooser0.new DecoratorButton();
      jDayChooser_DecoratorButton0.isFocusable();
      assertTrue(jDayChooser0.isDecorationBackgroundVisible());
      assertEquals(14, jDayChooser0.getDay());
      assertFalse(jDayChooser0.isDecorationBordersVisible());
  }
}
