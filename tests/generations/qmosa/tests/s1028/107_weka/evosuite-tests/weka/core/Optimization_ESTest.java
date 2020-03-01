/*
 * This file was automatically generated by EvoSuite
 * Tue Nov 19 22:28:13 GMT 2019
 */

package weka.core;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.BufferedReader;
import java.io.StringReader;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.Random;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.evosuite.runtime.testdata.EvoSuiteFile;
import org.evosuite.runtime.testdata.FileSystemHandling;
import org.junit.runner.RunWith;
import weka.core.Optimization;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class Optimization_ESTest extends Optimization_ESTest_scaffolding {

  /**
  //Test case number: 0
  /*Coverage entropy=1.5271837172395382
  */
  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Optimization optimization0 = mock(Optimization.class, CALLS_REAL_METHODS);
      Optimization.DynamicIntArray optimization_DynamicIntArray0 = optimization0.new DynamicIntArray(0);
      assertEquals(0, optimization_DynamicIntArray0.size());
      
      optimization_DynamicIntArray0.addElement(1697);
      int int0 = optimization_DynamicIntArray0.elementAt(0);
      assertEquals(1697, int0);
  }

  /**
  //Test case number: 1
  /*Coverage entropy=1.2931300021708616
  */
  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      FileSystemHandling fileSystemHandling0 = new FileSystemHandling();
      FileSystemHandling.setPermissions((EvoSuiteFile) null, true, false, true);
      FileSystemHandling.appendLineToFile((EvoSuiteFile) null, "%");
      FileSystemHandling.setPermissions((EvoSuiteFile) null, false, false, true);
      double[] doubleArray0 = new double[1];
      boolean[] booleanArray0 = new boolean[9];
      booleanArray0[0] = true;
      StringReader stringReader0 = new StringReader("QlUpV0dQ-fp\"mY3%+G^");
      BufferedReader bufferedReader0 = new BufferedReader(stringReader0, 2);
      bufferedReader0.read();
      FileSystemHandling.appendDataToFile((EvoSuiteFile) null, (byte[]) null);
      bufferedReader0.mark(459);
      Optimization optimization0 = mock(Optimization.class, CALLS_REAL_METHODS);
      Optimization.DynamicIntArray optimization_DynamicIntArray0 = optimization0.new DynamicIntArray(1);
      optimization_DynamicIntArray0.addElement(2);
      stringReader0.read();
      stringReader0.reset();
      Optimization.solveTriangle((weka.core.matrix.Matrix) null, doubleArray0, true, booleanArray0);
      optimization_DynamicIntArray0.addElement(81);
      assertEquals(2, optimization_DynamicIntArray0.size());
  }

  /**
  //Test case number: 2
  /*Coverage entropy=0.3333333333333333
  */
  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      LinkedList<Locale.LanguageRange> linkedList0 = new LinkedList<Locale.LanguageRange>();
      LinkedList<String> linkedList1 = new LinkedList<String>();
      linkedList0.parallelStream();
      linkedList1.add(" and zero set to ");
      linkedList1.add("");
      linkedList1.containsAll(linkedList0);
      Locale.FilteringMode locale_FilteringMode0 = Locale.FilteringMode.EXTENDED_FILTERING;
      Locale.filterTags((List<Locale.LanguageRange>) linkedList0, (Collection<String>) linkedList1, locale_FilteringMode0);
      Locale locale0 = Locale.FRENCH;
      locale0.toLanguageTag();
      LinkedList<Locale> linkedList2 = new LinkedList<Locale>();
      List<Locale> list0 = Locale.filter((List<Locale.LanguageRange>) linkedList0, (Collection<Locale>) linkedList2);
      List<Locale> list1 = Locale.filter((List<Locale.LanguageRange>) linkedList0, (Collection<Locale>) list0);
      FileSystemHandling.shouldAllThrowIOExceptions();
      Locale.filter((List<Locale.LanguageRange>) linkedList0, (Collection<Locale>) list1);
      boolean boolean0 = Optimization.m_Debug;
      locale0.getScript();
      locale0.getExtensionKeys();
      DecimalFormat decimalFormat0 = new DecimalFormat();
      weka.core.matrix.Matrix matrix0 = new weka.core.matrix.Matrix(34, 34);
      double[] doubleArray0 = new double[4];
      boolean[] booleanArray0 = new boolean[9];
      booleanArray0[0] = true;
      booleanArray0[1] = true;
      booleanArray0[2] = false;
      booleanArray0[3] = true;
      booleanArray0[4] = true;
      booleanArray0[5] = false;
      booleanArray0[6] = false;
      booleanArray0[7] = false;
      booleanArray0[8] = true;
      double[] doubleArray1 = Optimization.solveTriangle(matrix0, doubleArray0, false, booleanArray0);
      assertArrayEquals(new double[] {0.0, 0.0, Double.NaN, 0.0}, doubleArray1, 0.01);
  }

  /**
  //Test case number: 3
  /*Coverage entropy=0.4
  */
  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      LinkedList<Locale.LanguageRange> linkedList0 = new LinkedList<Locale.LanguageRange>();
      LinkedList<String> linkedList1 = new LinkedList<String>();
      linkedList0.parallelStream();
      linkedList0.stream();
      linkedList1.add("");
      linkedList1.add("");
      linkedList1.containsAll(linkedList0);
      Locale.FilteringMode locale_FilteringMode0 = Locale.FilteringMode.REJECT_EXTENDED_RANGES;
      List<String> list0 = Locale.filterTags((List<Locale.LanguageRange>) linkedList0, (Collection<String>) linkedList1, locale_FilteringMode0);
      Locale locale0 = Locale.FRENCH;
      locale0.toLanguageTag();
      LinkedList<Locale> linkedList2 = new LinkedList<Locale>();
      List<Locale> list1 = Locale.filter((List<Locale.LanguageRange>) linkedList0, (Collection<Locale>) null);
      List<Locale> list2 = Locale.filter((List<Locale.LanguageRange>) linkedList0, (Collection<Locale>) list1);
      Locale.filterTags((List<Locale.LanguageRange>) linkedList0, (Collection<String>) list0, locale_FilteringMode0);
      Locale.filter((List<Locale.LanguageRange>) linkedList0, (Collection<Locale>) list2);
      linkedList1.listIterator();
      Locale.Category locale_Category0 = Locale.Category.FORMAT;
      Locale.setDefault(locale_Category0, locale0);
      locale0.hasExtensions();
      Locale.filterTags((List<Locale.LanguageRange>) linkedList0, (Collection<String>) list0);
      locale0.getScript();
      locale0.getExtensionKeys();
      DecimalFormat decimalFormat0 = new DecimalFormat();
      weka.core.matrix.Matrix matrix0 = new weka.core.matrix.Matrix(34, 34);
      double[] doubleArray0 = new double[4];
      doubleArray0[0] = (double) 'a';
      doubleArray0[1] = (double) 'v';
      doubleArray0[2] = (double) 3659;
      doubleArray0[3] = (double) 34;
      double[] doubleArray1 = Optimization.solveTriangle(matrix0, doubleArray0, true, (boolean[]) null);
      double[] doubleArray2 = Optimization.solveTriangle(matrix0, doubleArray1, false, (boolean[]) null);
      assertArrayEquals(new double[] {Double.POSITIVE_INFINITY, Double.NaN, Double.NaN, Double.NaN}, doubleArray1, 0.01);
      assertArrayEquals(new double[] {97.0, 118.0, 3659.0, 34.0}, doubleArray0, 0.01);
      assertArrayEquals(new double[] {Double.NaN, Double.NaN, Double.NaN, Double.NaN}, doubleArray2, 0.01);
  }

  /**
  //Test case number: 4
  /*Coverage entropy=0.3333333333333333
  */
  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      LinkedList<Locale.LanguageRange> linkedList0 = new LinkedList<Locale.LanguageRange>();
      LinkedList<String> linkedList1 = new LinkedList<String>();
      linkedList0.listIterator();
      linkedList1.add("0657.594");
      linkedList1.add("");
      linkedList1.add("");
      Locale.FilteringMode locale_FilteringMode0 = Locale.FilteringMode.IGNORE_EXTENDED_RANGES;
      Locale.filterTags((List<Locale.LanguageRange>) linkedList0, (Collection<String>) linkedList1, locale_FilteringMode0);
      Locale locale0 = Locale.CHINESE;
      LinkedList<Locale.LanguageRange> linkedList2 = new LinkedList<Locale.LanguageRange>();
      Locale.lookup(linkedList2, (Collection<Locale>) null);
      LinkedList<Locale> linkedList3 = new LinkedList<Locale>();
      Locale.filter((List<Locale.LanguageRange>) linkedList0, (Collection<Locale>) linkedList3);
      NumberFormat.getIntegerInstance(locale0);
      weka.core.matrix.Matrix matrix0 = new weka.core.matrix.Matrix(1438, 1777);
      double[] doubleArray0 = new double[1];
      doubleArray0[0] = (double) 1777;
      boolean[] booleanArray0 = new boolean[2];
      booleanArray0[0] = false;
      booleanArray0[1] = true;
      double[] doubleArray1 = Optimization.solveTriangle(matrix0, doubleArray0, false, booleanArray0);
      assertEquals(1, doubleArray1.length);
  }

  /**
  //Test case number: 5
  /*Coverage entropy=0.3333333333333333
  */
  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      LinkedList<Locale.LanguageRange> linkedList0 = new LinkedList<Locale.LanguageRange>();
      LinkedList<String> linkedList1 = new LinkedList<String>();
      linkedList0.listIterator();
      linkedList1.add("0657.594");
      linkedList1.add("0657.594");
      linkedList1.add("}B1*l@");
      linkedList1.add("");
      Locale.FilteringMode locale_FilteringMode0 = Locale.FilteringMode.IGNORE_EXTENDED_RANGES;
      Locale.filterTags((List<Locale.LanguageRange>) linkedList0, (Collection<String>) linkedList1, locale_FilteringMode0);
      Locale locale0 = Locale.CHINESE;
      LinkedList<Locale.LanguageRange> linkedList2 = new LinkedList<Locale.LanguageRange>();
      locale0.hasExtensions();
      linkedList1.add("");
      linkedList0.push((Locale.LanguageRange) null);
      Locale locale1 = Locale.TRADITIONAL_CHINESE;
      locale0.getUnicodeLocaleAttributes();
      LinkedList<Locale> linkedList3 = new LinkedList<Locale>();
      linkedList3.pollFirst();
      Locale.filter((List<Locale.LanguageRange>) linkedList0, (Collection<Locale>) linkedList3);
      locale0.getExtensionKeys();
      NumberFormat.getIntegerInstance(locale0);
      weka.core.matrix.Matrix matrix0 = new weka.core.matrix.Matrix(1777, 1438);
      double[] doubleArray0 = new double[6];
      boolean[] booleanArray0 = new boolean[8];
      booleanArray0[0] = true;
      booleanArray0[1] = true;
      booleanArray0[2] = false;
      booleanArray0[3] = false;
      booleanArray0[4] = true;
      double[] doubleArray1 = Optimization.solveTriangle(matrix0, doubleArray0, true, booleanArray0);
      assertArrayEquals(new double[] {0.0, 0.0, Double.NaN, Double.NaN, 0.0, Double.NaN}, doubleArray1, 0.01);
  }

  /**
  //Test case number: 6
  /*Coverage entropy=0.3333333333333333
  */
  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      LinkedList<Locale.LanguageRange> linkedList0 = new LinkedList<Locale.LanguageRange>();
      linkedList0.listIterator();
      Locale locale0 = Locale.CHINESE;
      LinkedList<Locale.LanguageRange> linkedList1 = new LinkedList<Locale.LanguageRange>();
      locale0.hasExtensions();
      linkedList0.push((Locale.LanguageRange) null);
      Locale locale1 = Locale.TRADITIONAL_CHINESE;
      Set<String> set0 = locale0.getUnicodeLocaleAttributes();
      LinkedList<Locale> linkedList2 = new LinkedList<Locale>();
      linkedList2.pollFirst();
      Locale.filter((List<Locale.LanguageRange>) linkedList0, (Collection<Locale>) linkedList2);
      Locale.filterTags((List<Locale.LanguageRange>) linkedList0, (Collection<String>) set0);
      locale0.getExtensionKeys();
      NumberFormat.getIntegerInstance(locale0);
      weka.core.matrix.Matrix matrix0 = new weka.core.matrix.Matrix(1777, 1438);
      double[] doubleArray0 = new double[0];
      double[] doubleArray1 = Optimization.solveTriangle(matrix0, doubleArray0, false, (boolean[]) null);
      assertNotSame(doubleArray1, doubleArray0);
  }

  /**
  //Test case number: 7
  /*Coverage entropy=0.3333333333333333
  */
  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      LinkedList<Locale.LanguageRange> linkedList0 = new LinkedList<Locale.LanguageRange>();
      LinkedList<String> linkedList1 = new LinkedList<String>();
      linkedList0.listIterator();
      linkedList1.add("0657.59l4");
      linkedList1.add((String) null);
      linkedList1.add("}B1*l@");
      linkedList1.add("");
      Locale.FilteringMode locale_FilteringMode0 = Locale.FilteringMode.IGNORE_EXTENDED_RANGES;
      Locale.filterTags((List<Locale.LanguageRange>) linkedList0, (Collection<String>) linkedList1, locale_FilteringMode0);
      Locale locale0 = Locale.CHINESE;
      LinkedList<Locale.LanguageRange> linkedList2 = new LinkedList<Locale.LanguageRange>();
      locale0.hasExtensions();
      linkedList0.containsAll(linkedList1);
      linkedList1.add("");
      linkedList0.push((Locale.LanguageRange) null);
      Locale locale1 = Locale.TRADITIONAL_CHINESE;
      locale0.getUnicodeLocaleAttributes();
      LinkedList<Locale> linkedList3 = new LinkedList<Locale>();
      Locale locale2 = Locale.TAIWAN;
      Locale.filter((List<Locale.LanguageRange>) linkedList0, (Collection<Locale>) linkedList3);
      locale0.getExtensionKeys();
      NumberFormat.getIntegerInstance(locale0);
      weka.core.matrix.Matrix matrix0 = new weka.core.matrix.Matrix(1777, 1438);
      double[] doubleArray0 = new double[1];
      boolean[] booleanArray0 = new boolean[8];
      booleanArray0[0] = true;
      booleanArray0[1] = true;
      booleanArray0[2] = false;
      double[] doubleArray1 = Optimization.solveTriangle(matrix0, doubleArray0, false, booleanArray0);
      assertArrayEquals(new double[] {0.0}, doubleArray1, 0.01);
  }

  /**
  //Test case number: 8
  /*Coverage entropy=2.090919393915582
  */
  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      FileSystemHandling.appendStringToFile((EvoSuiteFile) null, (String) null);
      byte[] byteArray0 = new byte[4];
      byteArray0[0] = (byte)1;
      byteArray0[1] = (byte)2;
      byteArray0[2] = (byte)17;
      byteArray0[3] = (byte) (-116);
      FileSystemHandling.appendDataToFile((EvoSuiteFile) null, byteArray0);
      Optimization optimization0 = mock(Optimization.class, CALLS_REAL_METHODS);
      Optimization.DynamicIntArray optimization_DynamicIntArray0 = optimization0.new DynamicIntArray(221);
      FileSystemHandling.createFolder((EvoSuiteFile) null);
      optimization_DynamicIntArray0.removeAllElements();
      optimization_DynamicIntArray0.addElement(221);
      optimization_DynamicIntArray0.copy();
      optimization_DynamicIntArray0.addElement((-1633));
      optimization_DynamicIntArray0.addElement(10);
      optimization_DynamicIntArray0.copy();
      optimization_DynamicIntArray0.removeElementAt((byte)2);
      FileSystemHandling.setPermissions((EvoSuiteFile) null, false, true, true);
      optimization_DynamicIntArray0.addElement(45);
      optimization_DynamicIntArray0.addElement(3612);
      optimization_DynamicIntArray0.addElement(7);
      Random.setNextRandom(10);
  }

  /**
  //Test case number: 9
  /*Coverage entropy=0.3333333333333333
  */
  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      weka.core.matrix.Matrix matrix0 = new weka.core.matrix.Matrix(25, 6, 1.000000000003638);
      double[] doubleArray0 = new double[7];
      doubleArray0[0] = (double) 25;
      doubleArray0[1] = 1.000000000003638;
      doubleArray0[2] = 1.0;
      doubleArray0[3] = 1.000000000003638;
      doubleArray0[4] = (-0.5);
      doubleArray0[5] = (double) 25;
      doubleArray0[6] = (-0.5);
      // Undeclared exception!
      try { 
        Optimization.solveTriangle(matrix0, doubleArray0, true, (boolean[]) null);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  /**
  //Test case number: 10
  /*Coverage entropy=0.3333333333333333
  */
  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      FileSystemHandling fileSystemHandling0 = new FileSystemHandling();
      boolean boolean0 = true;
      FileSystemHandling.setPermissions((EvoSuiteFile) null, true, true, true);
      double[] doubleArray0 = new double[1];
      doubleArray0[0] = 1.0000000000000036;
      String string0 = "gNn<";
      FileSystemHandling.appendLineToFile((EvoSuiteFile) null, "gNn<");
      boolean[] booleanArray0 = new boolean[9];
      booleanArray0[0] = true;
      booleanArray0[1] = true;
      // Undeclared exception!
      try { 
        Optimization.solveTriangle((weka.core.matrix.Matrix) null, doubleArray0, false, (boolean[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("weka.core.Optimization", e);
      }
  }

  /**
  //Test case number: 11
  /*Coverage entropy=0.3333333333333333
  */
  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      FileSystemHandling fileSystemHandling0 = new FileSystemHandling();
      boolean boolean0 = true;
      FileSystemHandling.setPermissions((EvoSuiteFile) null, true, true, true);
      double[] doubleArray0 = new double[1];
      doubleArray0[0] = 1.0000000000000036;
      String string0 = "gNn<";
      FileSystemHandling.appendLineToFile((EvoSuiteFile) null, "gNn<");
      boolean[] booleanArray0 = new boolean[11];
      booleanArray0[0] = true;
      booleanArray0[1] = true;
      // Undeclared exception!
      try { 
        Optimization.solveTriangle((weka.core.matrix.Matrix) null, doubleArray0, false, (boolean[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("weka.core.Optimization", e);
      }
  }

  /**
  //Test case number: 12
  /*Coverage entropy=1.0931471805599453
  */
  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Optimization optimization0 = mock(Optimization.class, CALLS_REAL_METHODS);
      Optimization.DynamicIntArray optimization_DynamicIntArray0 = optimization0.new DynamicIntArray(1);
      int int0 = optimization_DynamicIntArray0.size();
      assertEquals(0, int0);
  }

  /**
  //Test case number: 13
  /*Coverage entropy=2.031298644335524
  */
  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Optimization optimization0 = mock(Optimization.class, CALLS_REAL_METHODS);
      Optimization.DynamicIntArray optimization_DynamicIntArray0 = optimization0.new DynamicIntArray(0);
      int int0 = (-840);
      optimization_DynamicIntArray0.addElement((-840));
      optimization_DynamicIntArray0.removeElementAt(0);
      optimization_DynamicIntArray0.addElement((-840));
      optimization_DynamicIntArray0.getRevision();
      optimization_DynamicIntArray0.removeAllElements();
      optimization_DynamicIntArray0.removeAllElements();
      // Undeclared exception!
      try { 
        optimization_DynamicIntArray0.removeElementAt(0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
      }
  }

  /**
  //Test case number: 14
  /*Coverage entropy=1.0931471805599453
  */
  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Optimization optimization0 = mock(Optimization.class, CALLS_REAL_METHODS);
      int int0 = 0;
      Optimization.DynamicIntArray optimization_DynamicIntArray0 = optimization0.new DynamicIntArray(0);
      // Undeclared exception!
      try { 
        optimization_DynamicIntArray0.removeElementAt(3303);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
      }
  }
}
