/*
 * This file was automatically generated by EvoSuite
 * Fri Nov 06 22:35:31 GMT 2020
 */

package accessories.plugins.time;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import accessories.plugins.time.JDayChooser;
import accessories.plugins.time.JMonthChooser;
import accessories.plugins.time.JYearChooser;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.FocusEvent;
import java.awt.event.KeyEvent;
import java.util.Date;
import java.util.Locale;
import javax.help.BackAction;
import javax.swing.JButton;
import javax.swing.JEditorPane;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.util.MockGregorianCalendar;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class JDayChooser_ESTest extends JDayChooser_ESTest_scaffolding {

  /**
  //Test case number: 0
  /*Coverage entropy=2.630470240160676
  */
  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      JDayChooser jDayChooser0 = new JDayChooser();
      jDayChooser0.day = 519;
      jDayChooser0.setMonth(21);
      assertEquals(31, jDayChooser0.getDay());
  }

  /**
  //Test case number: 1
  /*Coverage entropy=2.6354848637097823
  */
  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      JDayChooser jDayChooser0 = new JDayChooser();
      jDayChooser0.maxDayCharacters = (-2221);
      Locale locale0 = Locale.CANADA;
      jDayChooser0.setLocale(locale0);
      assertTrue(jDayChooser0.isDecorationBackgroundVisible());
      assertEquals(14, jDayChooser0.getDay());
  }

  /**
  //Test case number: 2
  /*Coverage entropy=2.5983833927870665
  */
  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      JDayChooser jDayChooser0 = new JDayChooser();
      jDayChooser0.addListeners(14);
      assertTrue(jDayChooser0.isDayBordersVisible());
      assertEquals(14, jDayChooser0.getDay());
  }

  /**
  //Test case number: 3
  /*Coverage entropy=2.6354848637097823
  */
  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      JDayChooser jDayChooser0 = new JDayChooser();
      JDayChooser.DecoratorButton jDayChooser_DecoratorButton0 = jDayChooser0.new DecoratorButton();
      jDayChooser_DecoratorButton0.isFocusable();
      assertFalse(jDayChooser0.isDecorationBordersVisible());
      assertTrue(jDayChooser0.isDecorationBackgroundVisible());
  }

  /**
  //Test case number: 4
  /*Coverage entropy=2.5983833927870665
  */
  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      JDayChooser jDayChooser0 = new JDayChooser();
      Dimension dimension0 = jDayChooser0.getPreferredSize();
      JDayChooser.DecoratorButton jDayChooser_DecoratorButton0 = jDayChooser0.new DecoratorButton();
      BackAction backAction0 = new BackAction(dimension0);
      jDayChooser_DecoratorButton0.addMouseListener(backAction0);
      assertEquals(203, dimension0.width);
      assertEquals(14, jDayChooser0.getDay());
      assertEquals(203.0, dimension0.getWidth(), 0.01);
  }

  /**
  //Test case number: 5
  /*Coverage entropy=2.5983833927870665
  */
  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      JDayChooser jDayChooser0 = new JDayChooser();
      jDayChooser0.initDecorations();
      assertEquals(14, jDayChooser0.getDay());
      assertTrue(jDayChooser0.isDayBordersVisible());
  }

  /**
  //Test case number: 6
  /*Coverage entropy=2.5604230937343346
  */
  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      JDayChooser jDayChooser0 = new JDayChooser(false);
      jDayChooser0.init();
      assertEquals(14, jDayChooser0.getDay());
  }

  /**
  //Test case number: 7
  /*Coverage entropy=2.5983833927870665
  */
  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      JDayChooser jDayChooser0 = new JDayChooser();
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
      assertTrue(jDayChooser0.isDayBordersVisible());
      assertEquals(14, jDayChooser0.getDay());
  }

  /**
  //Test case number: 9
  /*Coverage entropy=2.5983833927870665
  */
  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      JDayChooser jDayChooser0 = new JDayChooser(true);
      ActionEvent actionEvent0 = new ActionEvent(jDayChooser0, 10, (String) null);
      actionEvent0.setSource((Object) null);
      // Undeclared exception!
      try { 
        jDayChooser0.actionPerformed(actionEvent0);
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
  /*Coverage entropy=2.6789477095792162
  */
  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      JDayChooser jDayChooser0 = new JDayChooser();
      jDayChooser0.setMaxDayCharacters(4);
      int int0 = jDayChooser0.getMaxDayCharacters();
      assertEquals(4, int0);
  }

  /**
  //Test case number: 11
  /*Coverage entropy=2.5983833927870665
  */
  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      JDayChooser jDayChooser0 = new JDayChooser();
      jDayChooser0.updateUI();
      assertEquals(14, jDayChooser0.getDay());
  }

  /**
  //Test case number: 12
  /*Coverage entropy=2.5983833927870665
  */
  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      JDayChooser jDayChooser0 = new JDayChooser();
      jDayChooser0.setDayBordersVisible(false);
      assertFalse(jDayChooser0.isWeekOfYearVisible());
      assertTrue(jDayChooser0.isDecorationBackgroundVisible());
      assertEquals(14, jDayChooser0.getDay());
  }

  /**
  //Test case number: 13
  /*Coverage entropy=2.6354848637097823
  */
  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      JDayChooser jDayChooser0 = new JDayChooser();
      jDayChooser0.setFocus();
      assertEquals(14, jDayChooser0.getDay());
      assertTrue(jDayChooser0.isDecorationBackgroundVisible());
  }

  /**
  //Test case number: 14
  /*Coverage entropy=2.5983833927870665
  */
  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Color color0 = Color.lightGray;
      JDayChooser jDayChooser0 = new JDayChooser();
      jDayChooser0.setForeground(color0);
      assertTrue(jDayChooser0.isDayBordersVisible());
      assertEquals(14, jDayChooser0.getDay());
      assertFalse(jDayChooser0.isDecorationBordersVisible());
  }

  /**
  //Test case number: 15
  /*Coverage entropy=2.5983833927870665
  */
  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      JDayChooser jDayChooser0 = new JDayChooser();
      jDayChooser0.setFont((Font) null);
      assertTrue(jDayChooser0.isDecorationBackgroundVisible());
      assertEquals(14, jDayChooser0.getDay());
  }

  /**
  //Test case number: 16
  /*Coverage entropy=2.5983833927870665
  */
  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      JDayChooser jDayChooser0 = new JDayChooser();
      jDayChooser0.setDecorationBackgroundVisible(true);
      assertTrue(jDayChooser0.isDayBordersVisible());
      assertFalse(jDayChooser0.isDecorationBordersVisible());
      assertEquals(14, jDayChooser0.getDay());
  }

  /**
  //Test case number: 17
  /*Coverage entropy=2.6354848637097823
  */
  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      JDayChooser jDayChooser0 = new JDayChooser();
      int int0 = jDayChooser0.getDay();
      assertTrue(jDayChooser0.isDayBordersVisible());
      assertTrue(jDayChooser0.isDecorationBackgroundVisible());
      assertEquals(14, int0);
  }

  /**
  //Test case number: 18
  /*Coverage entropy=2.5604230937343346
  */
  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      JDayChooser jDayChooser0 = new JDayChooser(false);
      jDayChooser0.setDecorationBordersVisible(false);
      assertTrue(jDayChooser0.isDayBordersVisible());
      assertEquals(14, jDayChooser0.getDay());
      assertFalse(jDayChooser0.isDecorationBordersVisible());
      assertTrue(jDayChooser0.isDecorationBackgroundVisible());
      assertFalse(jDayChooser0.isWeekOfYearVisible());
  }

  /**
  //Test case number: 19
  /*Coverage entropy=2.6354848637097823
  */
  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
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
  //Test case number: 20
  /*Coverage entropy=2.5604230937343346
  */
  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      JDayChooser jDayChooser0 = new JDayChooser(true);
      // Undeclared exception!
      try { 
        jDayChooser0.addListeners((-4123));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  /**
  //Test case number: 21
  /*Coverage entropy=2.5983833927870665
  */
  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      JDayChooser jDayChooser0 = new JDayChooser();
      jDayChooser0.getDaysInMonth();
      assertFalse(jDayChooser0.isDecorationBordersVisible());
      assertEquals(14, jDayChooser0.getDay());
  }

  /**
  //Test case number: 22
  /*Coverage entropy=2.6354848637097823
  */
  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      JDayChooser jDayChooser0 = new JDayChooser();
      JDayChooser.DecoratorButton jDayChooser_DecoratorButton0 = jDayChooser0.new DecoratorButton();
      jDayChooser_DecoratorButton0.paint((Graphics) null);
      assertEquals(14, jDayChooser0.getDay());
      assertFalse(jDayChooser0.isWeekOfYearVisible());
  }

  /**
  //Test case number: 23
  /*Coverage entropy=2.662701752014223
  */
  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      JDayChooser jDayChooser0 = new JDayChooser();
      jDayChooser0.setMaxDayCharacters(27);
      assertTrue(jDayChooser0.isDayBordersVisible());
      assertEquals(14, jDayChooser0.getDay());
      assertFalse(jDayChooser0.isWeekOfYearVisible());
  }

  /**
  //Test case number: 24
  /*Coverage entropy=2.616230775360895
  */
  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      JDayChooser jDayChooser0 = new JDayChooser(true);
      jDayChooser0.setMaxDayCharacters((-1665));
      assertFalse(jDayChooser0.isDecorationBordersVisible());
      assertEquals(14, jDayChooser0.getDay());
  }

  /**
  //Test case number: 25
  /*Coverage entropy=2.650110009855175
  */
  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      JDayChooser jDayChooser0 = new JDayChooser();
      jDayChooser0.setMaxDayCharacters(3);
      jDayChooser0.setMaxDayCharacters(3);
      assertEquals(3, jDayChooser0.getMaxDayCharacters());
  }

  /**
  //Test case number: 26
  /*Coverage entropy=2.6354848637097823
  */
  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      JDayChooser jDayChooser0 = new JDayChooser();
      jDayChooser0.setMinSelectableDate((Date) null);
      assertFalse(jDayChooser0.isDecorationBordersVisible());
      assertTrue(jDayChooser0.isDayBordersVisible());
      assertEquals(14, jDayChooser0.getDay());
  }

  /**
  //Test case number: 27
  /*Coverage entropy=2.5983833927870665
  */
  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      JDayChooser jDayChooser0 = new JDayChooser(true);
      Date date0 = jDayChooser0.minSelectableDate;
      jDayChooser0.setMinSelectableDate(date0);
      assertEquals(14, jDayChooser0.getDay());
      assertTrue(jDayChooser0.isDayBordersVisible());
  }

  /**
  //Test case number: 28
  /*Coverage entropy=2.6354848637097823
  */
  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      JDayChooser jDayChooser0 = new JDayChooser();
      jDayChooser0.setMaxSelectableDate((Date) null);
      assertFalse(jDayChooser0.isDecorationBordersVisible());
      assertEquals(14, jDayChooser0.getDay());
      assertTrue(jDayChooser0.isDayBordersVisible());
  }

  /**
  //Test case number: 29
  /*Coverage entropy=2.5983833927870665
  */
  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      JDayChooser jDayChooser0 = new JDayChooser(true);
      Date date0 = jDayChooser0.minSelectableDate;
      jDayChooser0.setMaxSelectableDate(date0);
      assertFalse(jDayChooser0.isDecorationBordersVisible());
      assertTrue(jDayChooser0.isWeekOfYearVisible());
  }

  /**
  //Test case number: 30
  /*Coverage entropy=2.6266116706270752
  */
  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar();
      Date date0 = mockGregorianCalendar0.getGregorianChange();
      JDayChooser jDayChooser0 = new JDayChooser(false);
      jDayChooser0.setSelectableDateRange((Date) null, date0);
      assertFalse(jDayChooser0.isDecorationBordersVisible());
      assertTrue(jDayChooser0.isDecorationBackgroundVisible());
      assertTrue(jDayChooser0.isDayBordersVisible());
      assertEquals(14, jDayChooser0.getDay());
  }

  /**
  //Test case number: 31
  /*Coverage entropy=2.662701752014223
  */
  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      JDayChooser jDayChooser0 = new JDayChooser();
      jDayChooser0.setSelectableDateRange((Date) null, (Date) null);
      assertEquals(14, jDayChooser0.getDay());
      assertTrue(jDayChooser0.isDayBordersVisible());
  }

  /**
  //Test case number: 32
  /*Coverage entropy=2.662701752014223
  */
  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      JDayChooser jDayChooser0 = new JDayChooser();
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar();
      Date date0 = mockGregorianCalendar0.getGregorianChange();
      jDayChooser0.setSelectableDateRange(date0, date0);
      assertTrue(jDayChooser0.isDecorationBackgroundVisible());
      assertFalse(jDayChooser0.isDecorationBordersVisible());
  }

  /**
  //Test case number: 33
  /*Coverage entropy=2.669576756952125
  */
  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      JDayChooser jDayChooser0 = new JDayChooser();
      Color color0 = Color.LIGHT_GRAY;
      jDayChooser0.setDecorationBackgroundColor(color0);
      assertFalse(jDayChooser0.isWeekOfYearVisible());
      assertTrue(jDayChooser0.isDecorationBackgroundVisible());
      assertEquals(14, jDayChooser0.getDay());
      assertTrue(jDayChooser0.isDayBordersVisible());
      assertFalse(jDayChooser0.isDecorationBordersVisible());
  }

  /**
  //Test case number: 34
  /*Coverage entropy=2.616230775360895
  */
  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      JDayChooser jDayChooser0 = new JDayChooser(true);
      jDayChooser0.setWeekOfYearVisible(false);
      assertFalse(jDayChooser0.isWeekOfYearVisible());
  }

  /**
  //Test case number: 35
  /*Coverage entropy=2.5983833927870665
  */
  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      JDayChooser jDayChooser0 = new JDayChooser(false);
      jDayChooser0.setWeekOfYearVisible(false);
      assertEquals(14, jDayChooser0.getDay());
      assertTrue(jDayChooser0.isDayBordersVisible());
      assertFalse(jDayChooser0.isDecorationBordersVisible());
  }

  /**
  //Test case number: 36
  /*Coverage entropy=2.6527697871323417
  */
  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      JDayChooser jDayChooser0 = new JDayChooser();
      jDayChooser0.setWeekOfYearVisible(true);
      assertTrue(jDayChooser0.isDayBordersVisible());
      assertEquals(14, jDayChooser0.getDay());
  }

  /**
  //Test case number: 37
  /*Coverage entropy=2.7100799133333875
  */
  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      JDayChooser jDayChooser0 = new JDayChooser();
      assertEquals(14, jDayChooser0.getDay());
      
      jDayChooser0.setDay(1);
      KeyEvent keyEvent0 = new KeyEvent(jDayChooser0, 555, 1, 555, 38, '?');
      jDayChooser0.keyPressed(keyEvent0);
      assertEquals(1, jDayChooser0.getDay());
  }

  /**
  //Test case number: 38
  /*Coverage entropy=2.677371952581733
  */
  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      JDayChooser jDayChooser0 = new JDayChooser(false);
      KeyEvent keyEvent0 = new KeyEvent(jDayChooser0, 34, 4756L, 2688, 2688, '+');
      jDayChooser0.keyPressed(keyEvent0);
      assertTrue(jDayChooser0.isDayBordersVisible());
      assertEquals(14, jDayChooser0.getDay());
  }

  /**
  //Test case number: 39
  /*Coverage entropy=2.7100799133333875
  */
  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      JDayChooser jDayChooser0 = new JDayChooser();
      KeyEvent keyEvent0 = new KeyEvent(jDayChooser0, 40, 40, 40, 40, 'l');
      jDayChooser0.keyPressed(keyEvent0);
      assertEquals(21, jDayChooser0.getDay());
  }

  /**
  //Test case number: 40
  /*Coverage entropy=2.7100799133333875
  */
  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      JDayChooser jDayChooser0 = new JDayChooser();
      KeyEvent keyEvent0 = new KeyEvent(jDayChooser0, 39, 50L, 39, 39, 'a');
      jDayChooser0.keyPressed(keyEvent0);
      assertEquals(15, jDayChooser0.getDay());
  }

  /**
  //Test case number: 41
  /*Coverage entropy=2.7100799133333875
  */
  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      JDayChooser jDayChooser0 = new JDayChooser();
      KeyEvent keyEvent0 = new KeyEvent(jDayChooser0, 39, (-1623L), 37, 37, 'Y');
      jDayChooser0.keyPressed(keyEvent0);
      assertEquals(13, jDayChooser0.getDay());
  }

  /**
  //Test case number: 42
  /*Coverage entropy=2.7100799133333875
  */
  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      JDayChooser jDayChooser0 = new JDayChooser();
      KeyEvent keyEvent0 = new KeyEvent(jDayChooser0, 36, 36, 36, 36, '8');
      jDayChooser0.keyPressed(keyEvent0);
      assertEquals(1, jDayChooser0.getDay());
  }

  /**
  //Test case number: 43
  /*Coverage entropy=2.7177454112665718
  */
  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      JDayChooser jDayChooser0 = new JDayChooser(false);
      KeyEvent keyEvent0 = new KeyEvent(jDayChooser0, 34, 34, 34, 34, 'X');
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
      KeyEvent keyEvent0 = new KeyEvent(jDayChooser0, 35, 35, 35, 35, '(');
      jDayChooser0.keyPressed(keyEvent0);
      assertEquals(28, jDayChooser0.getDay());
  }

  /**
  //Test case number: 45
  /*Coverage entropy=2.630470240160676
  */
  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      JDayChooser jDayChooser0 = new JDayChooser();
      JButton jButton0 = new JButton("day");
      jDayChooser0.selectedDay = jButton0;
      jDayChooser0.setMonth(14);
      assertEquals(14, jDayChooser0.getDay());
  }

  /**
  //Test case number: 46
  /*Coverage entropy=2.630470240160676
  */
  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      JDayChooser jDayChooser0 = new JDayChooser();
      jDayChooser0.setDay(31);
      jDayChooser0.setMonth(10152);
      assertEquals(31, jDayChooser0.getDay());
  }

  /**
  //Test case number: 47
  /*Coverage entropy=2.593621512459067
  */
  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      JDayChooser jDayChooser0 = new JDayChooser();
      jDayChooser0.setDay((-2285));
      assertEquals(1, jDayChooser0.getDay());
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
      JDayChooser jDayChooser0 = new JDayChooser();
      jDayChooser0.setMaxDayCharacters(4);
      Locale locale0 = Locale.JAPANESE;
      jDayChooser0.setLocale(locale0);
      assertEquals(4, jDayChooser0.getMaxDayCharacters());
  }

  /**
  //Test case number: 50
  /*Coverage entropy=2.6442551993262904
  */
  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      JDayChooser jDayChooser0 = new JDayChooser();
      jDayChooser0.setMaxDayCharacters(2);
      assertEquals(2, jDayChooser0.getMaxDayCharacters());
  }

  /**
  //Test case number: 51
  /*Coverage entropy=2.6354848637097823
  */
  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      JDayChooser jDayChooser0 = new JDayChooser();
      KeyEvent keyEvent0 = new KeyEvent(jDayChooser0, 3, 833L, 3, 3, 'V');
      jDayChooser0.keyTyped(keyEvent0);
      assertTrue(jDayChooser0.isDecorationBackgroundVisible());
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
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar();
      jDayChooser0.setCalendar(mockGregorianCalendar0);
      assertEquals(14, jDayChooser0.getDay());
  }

  /**
  //Test case number: 53
  /*Coverage entropy=2.5983833927870665
  */
  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      JDayChooser jDayChooser0 = new JDayChooser(false);
      FocusEvent focusEvent0 = new FocusEvent(jDayChooser0, 0);
      jDayChooser0.focusGained(focusEvent0);
      assertEquals(14, jDayChooser0.getDay());
      assertFalse(jDayChooser0.isDecorationBordersVisible());
  }

  /**
  //Test case number: 54
  /*Coverage entropy=2.6354848637097823
  */
  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      JDayChooser jDayChooser0 = new JDayChooser();
      jDayChooser0.getMinSelectableDate();
      assertEquals(14, jDayChooser0.getDay());
      assertFalse(jDayChooser0.isDecorationBordersVisible());
      assertTrue(jDayChooser0.isDayBordersVisible());
  }

  /**
  //Test case number: 55
  /*Coverage entropy=2.6354848637097823
  */
  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      JDayChooser jDayChooser0 = new JDayChooser();
      JMonthChooser jMonthChooser0 = new JMonthChooser(true);
      jDayChooser0.setMonthChooser(jMonthChooser0);
      assertEquals(14, jDayChooser0.getDay());
  }

  /**
  //Test case number: 56
  /*Coverage entropy=2.6354848637097823
  */
  @Test(timeout = 4000)
  public void test56()  throws Throwable  {
      JDayChooser jDayChooser0 = new JDayChooser();
      jDayChooser0.getWeekdayForeground();
      assertEquals(14, jDayChooser0.getDay());
      assertTrue(jDayChooser0.isDayBordersVisible());
  }

  /**
  //Test case number: 57
  /*Coverage entropy=2.6354848637097823
  */
  @Test(timeout = 4000)
  public void test57()  throws Throwable  {
      JDayChooser jDayChooser0 = new JDayChooser();
      jDayChooser0.getDayPanel();
      assertFalse(jDayChooser0.isDecorationBordersVisible());
      assertEquals(14, jDayChooser0.getDay());
      assertTrue(jDayChooser0.isDecorationBackgroundVisible());
      assertTrue(jDayChooser0.isDayBordersVisible());
  }

  /**
  //Test case number: 58
  /*Coverage entropy=2.5983833927870665
  */
  @Test(timeout = 4000)
  public void test58()  throws Throwable  {
      JDayChooser jDayChooser0 = new JDayChooser(false);
      JButton jButton0 = jDayChooser0.getSelectedDay();
      assertNull(jButton0);
      assertTrue(jDayChooser0.isDecorationBackgroundVisible());
      assertFalse(jDayChooser0.isDecorationBordersVisible());
      assertEquals(14, jDayChooser0.getDay());
  }

  /**
  //Test case number: 59
  /*Coverage entropy=2.5983833927870665
  */
  @Test(timeout = 4000)
  public void test59()  throws Throwable  {
      JDayChooser jDayChooser0 = new JDayChooser(false);
      KeyEvent keyEvent0 = new KeyEvent(jDayChooser0, 0, 0, 8192, 0, '!');
      jDayChooser0.keyReleased(keyEvent0);
      assertEquals(14, jDayChooser0.getDay());
  }

  /**
  //Test case number: 60
  /*Coverage entropy=2.6354848637097823
  */
  @Test(timeout = 4000)
  public void test60()  throws Throwable  {
      JDayChooser jDayChooser0 = new JDayChooser();
      jDayChooser0.setYearChooser((JYearChooser) null);
      assertTrue(jDayChooser0.isDecorationBackgroundVisible());
      assertEquals(14, jDayChooser0.getDay());
      assertTrue(jDayChooser0.isDayBordersVisible());
  }

  /**
  //Test case number: 61
  /*Coverage entropy=2.5983833927870665
  */
  @Test(timeout = 4000)
  public void test61()  throws Throwable  {
      JDayChooser jDayChooser0 = new JDayChooser(true);
      FocusEvent focusEvent0 = new FocusEvent(jDayChooser0, 0, false, jDayChooser0);
      jDayChooser0.focusLost(focusEvent0);
      assertFalse(jDayChooser0.isDecorationBordersVisible());
      assertTrue(jDayChooser0.isDecorationBackgroundVisible());
  }

  /**
  //Test case number: 62
  /*Coverage entropy=2.5983833927870665
  */
  @Test(timeout = 4000)
  public void test62()  throws Throwable  {
      JDayChooser jDayChooser0 = new JDayChooser(false);
      Color color0 = Color.LIGHT_GRAY;
      jDayChooser0.setSundayForeground(color0);
      assertFalse(jDayChooser0.isDecorationBordersVisible());
      assertTrue(jDayChooser0.isDecorationBackgroundVisible());
      assertEquals(14, jDayChooser0.getDay());
  }

  /**
  //Test case number: 63
  /*Coverage entropy=2.6354848637097823
  */
  @Test(timeout = 4000)
  public void test63()  throws Throwable  {
      JDayChooser jDayChooser0 = new JDayChooser();
      jDayChooser0.getDecorationBackgroundColor();
      assertEquals(14, jDayChooser0.getDay());
      assertTrue(jDayChooser0.isDayBordersVisible());
  }

  /**
  //Test case number: 64
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test64()  throws Throwable  {
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
  //Test case number: 65
  /*Coverage entropy=2.6354848637097823
  */
  @Test(timeout = 4000)
  public void test65()  throws Throwable  {
      JDayChooser jDayChooser0 = new JDayChooser();
      int int0 = jDayChooser0.getMaxDayCharacters();
      assertEquals(14, jDayChooser0.getDay());
      assertEquals(0, int0);
      assertFalse(jDayChooser0.isDecorationBordersVisible());
  }

  /**
  //Test case number: 66
  /*Coverage entropy=2.5983833927870665
  */
  @Test(timeout = 4000)
  public void test66()  throws Throwable  {
      JDayChooser jDayChooser0 = new JDayChooser(false);
      JEditorPane jEditorPane0 = new JEditorPane("day", "");
      Color color0 = jEditorPane0.getCaretColor();
      jDayChooser0.setWeekdayForeground(color0);
      assertTrue(jDayChooser0.isDecorationBackgroundVisible());
      assertEquals(14, jDayChooser0.getDay());
      assertFalse(jDayChooser0.isWeekOfYearVisible());
      assertTrue(jDayChooser0.isDayBordersVisible());
      assertFalse(jDayChooser0.isDecorationBordersVisible());
  }

  /**
  //Test case number: 67
  /*Coverage entropy=2.6354848637097823
  */
  @Test(timeout = 4000)
  public void test67()  throws Throwable  {
      JDayChooser jDayChooser0 = new JDayChooser();
      jDayChooser0.setYear(21);
      assertEquals(14, jDayChooser0.getDay());
      assertFalse(jDayChooser0.isWeekOfYearVisible());
      assertTrue(jDayChooser0.isDecorationBackgroundVisible());
  }

  /**
  //Test case number: 68
  /*Coverage entropy=2.6354848637097823
  */
  @Test(timeout = 4000)
  public void test68()  throws Throwable  {
      JDayChooser jDayChooser0 = new JDayChooser();
      jDayChooser0.getLocale();
      assertEquals(14, jDayChooser0.getDay());
      assertFalse(jDayChooser0.isDecorationBordersVisible());
  }

  /**
  //Test case number: 69
  /*Coverage entropy=2.6354848637097823
  */
  @Test(timeout = 4000)
  public void test69()  throws Throwable  {
      JDayChooser jDayChooser0 = new JDayChooser();
      boolean boolean0 = jDayChooser0.isDecorationBordersVisible();
      assertFalse(boolean0);
      assertTrue(jDayChooser0.isDayBordersVisible());
      assertEquals(14, jDayChooser0.getDay());
  }

  /**
  //Test case number: 70
  /*Coverage entropy=2.6354848637097823
  */
  @Test(timeout = 4000)
  public void test70()  throws Throwable  {
      JDayChooser jDayChooser0 = new JDayChooser();
      ActionEvent actionEvent0 = new ActionEvent("day", 47, "day", 47);
      // Undeclared exception!
      try { 
        jDayChooser0.actionPerformed(actionEvent0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // java.lang.String cannot be cast to javax.swing.JButton
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
      assertEquals(14, jDayChooser0.getDay());
      assertTrue(boolean0);
      assertTrue(jDayChooser0.isDayBordersVisible());
  }

  /**
  //Test case number: 72
  /*Coverage entropy=2.6354848637097823
  */
  @Test(timeout = 4000)
  public void test72()  throws Throwable  {
      JDayChooser jDayChooser0 = new JDayChooser();
      jDayChooser0.getSundayForeground();
      assertTrue(jDayChooser0.isDayBordersVisible());
      assertFalse(jDayChooser0.isWeekOfYearVisible());
      assertEquals(14, jDayChooser0.getDay());
      assertTrue(jDayChooser0.isDecorationBackgroundVisible());
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
      assertEquals(14, jDayChooser0.getDay());
  }

  /**
  //Test case number: 74
  /*Coverage entropy=2.6354848637097823
  */
  @Test(timeout = 4000)
  public void test74()  throws Throwable  {
      JDayChooser jDayChooser0 = new JDayChooser();
      boolean boolean0 = jDayChooser0.isDayBordersVisible();
      assertTrue(jDayChooser0.isDecorationBackgroundVisible());
      assertEquals(14, jDayChooser0.getDay());
      assertTrue(boolean0);
  }

  /**
  //Test case number: 75
  /*Coverage entropy=2.749972735605312
  */
  @Test(timeout = 4000)
  public void test75()  throws Throwable  {
      JDayChooser jDayChooser0 = new JDayChooser();
      KeyEvent keyEvent0 = new KeyEvent(jDayChooser0, 33, 92L, 33, 33, '!');
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
  /*Coverage entropy=2.6354848637097823
  */
  @Test(timeout = 4000)
  public void test76()  throws Throwable  {
      JDayChooser jDayChooser0 = new JDayChooser();
      jDayChooser0.setAlwaysFireDayProperty(false);
      assertFalse(jDayChooser0.isDecorationBordersVisible());
      assertEquals(14, jDayChooser0.getDay());
  }

  /**
  //Test case number: 77
  /*Coverage entropy=2.5983833927870665
  */
  @Test(timeout = 4000)
  public void test77()  throws Throwable  {
      JDayChooser jDayChooser0 = new JDayChooser(false);
      boolean boolean0 = jDayChooser0.isWeekOfYearVisible();
      assertFalse(jDayChooser0.isDecorationBordersVisible());
      assertEquals(14, jDayChooser0.getDay());
      assertFalse(boolean0);
      assertTrue(jDayChooser0.isDecorationBackgroundVisible());
  }
}
