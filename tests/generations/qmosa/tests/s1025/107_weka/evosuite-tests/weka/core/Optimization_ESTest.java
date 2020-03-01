/*
 * This file was automatically generated by EvoSuite
 * Tue Nov 19 14:22:07 GMT 2019
 */

package weka.core;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.PrintWriter;
import java.util.LinkedList;
import java.util.Locale;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.evosuite.runtime.mock.java.io.MockPrintWriter;
import org.evosuite.runtime.testdata.EvoSuiteFile;
import org.evosuite.runtime.testdata.FileSystemHandling;
import org.junit.runner.RunWith;
import weka.core.Optimization;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class Optimization_ESTest extends Optimization_ESTest_scaffolding {

  /**
  //Test case number: 0
  /*Coverage entropy=0.3333333333333333
  */
  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      FileSystemHandling fileSystemHandling0 = new FileSystemHandling();
      weka.core.matrix.Matrix matrix0 = weka.core.matrix.Matrix.random(43, 43);
      FileSystemHandling.shouldAllThrowIOExceptions();
      FileSystemHandling.shouldThrowIOException((EvoSuiteFile) null);
      FileSystemHandling.appendDataToFile((EvoSuiteFile) null, (byte[]) null);
      FileSystemHandling.appendStringToFile((EvoSuiteFile) null, "l/GF=GTW");
      FileSystemHandling fileSystemHandling1 = new FileSystemHandling();
      FileSystemHandling.appendDataToFile((EvoSuiteFile) null, (byte[]) null);
      FileSystemHandling.appendStringToFile((EvoSuiteFile) null, "l/GF=GTW");
      FileSystemHandling fileSystemHandling2 = new FileSystemHandling();
      double[] doubleArray0 = new double[5];
      doubleArray0[3] = (-1429.120195331246);
      doubleArray0[1] = (-1429.120195331246);
      doubleArray0[2] = (double) 43;
      doubleArray0[3] = (-1429.120195331246);
      FileSystemHandling.appendLineToFile((EvoSuiteFile) null, "l/GF=GTW");
      doubleArray0[4] = (double) 3185;
      boolean[] booleanArray0 = new boolean[9];
      booleanArray0[0] = false;
      booleanArray0[1] = false;
      booleanArray0[2] = true;
      booleanArray0[3] = true;
      booleanArray0[4] = false;
      booleanArray0[5] = false;
      FileSystemHandling.shouldThrowIOException((EvoSuiteFile) null);
      booleanArray0[2] = false;
      double[] doubleArray1 = Optimization.solveTriangle(matrix0, doubleArray0, true, booleanArray0);
      assertArrayEquals(new double[] {0.0, (-1429.120195331246), 43.0, (-1429.120195331246), 3185.0}, doubleArray0, 0.01);
      assertArrayEquals(new double[] {Double.NaN, Double.NaN, Double.NaN, 0.0, Double.NaN}, doubleArray1, 0.01);
  }

  /**
  //Test case number: 1
  /*Coverage entropy=0.3333333333333333
  */
  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      FileSystemHandling fileSystemHandling0 = new FileSystemHandling();
      weka.core.matrix.Matrix.random(19, 19);
      FileSystemHandling.shouldAllThrowIOExceptions();
      FileSystemHandling.shouldThrowIOException((EvoSuiteFile) null);
      FileSystemHandling.appendDataToFile((EvoSuiteFile) null, (byte[]) null);
      FileSystemHandling.appendStringToFile((EvoSuiteFile) null, "l/GF=GTW");
      FileSystemHandling fileSystemHandling1 = new FileSystemHandling();
      FileSystemHandling.appendDataToFile((EvoSuiteFile) null, (byte[]) null);
      FileSystemHandling.shouldAllThrowIOExceptions();
      FileSystemHandling.appendStringToFile((EvoSuiteFile) null, "l/GF=GTW");
      FileSystemHandling fileSystemHandling2 = new FileSystemHandling();
      double[] doubleArray0 = new double[5];
      doubleArray0[0] = (-1429.120195331246);
      doubleArray0[2] = (double) 3185;
      doubleArray0[3] = (-1429.120195331246);
      double[][] doubleArray1 = new double[2][8];
      doubleArray1[0] = doubleArray0;
      doubleArray1[1] = doubleArray0;
      weka.core.matrix.Matrix matrix0 = weka.core.matrix.Matrix.constructWithCopy(doubleArray1);
      boolean[] booleanArray0 = new boolean[8];
      booleanArray0[0] = false;
      booleanArray0[1] = true;
      booleanArray0[2] = true;
      booleanArray0[3] = false;
      booleanArray0[4] = false;
      booleanArray0[5] = false;
      booleanArray0[6] = true;
      booleanArray0[7] = false;
      // Undeclared exception!
      try { 
        Optimization.solveTriangle(matrix0, doubleArray0, true, booleanArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  /**
  //Test case number: 2
  /*Coverage entropy=1.4942662253853725
  */
  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Optimization optimization0 = mock(Optimization.class, CALLS_REAL_METHODS);
      int int0 = 1;
      Optimization.DynamicIntArray optimization_DynamicIntArray0 = optimization0.new DynamicIntArray(1);
      int int1 = (-3196);
      optimization_DynamicIntArray0.addElement((-3196));
      optimization_DynamicIntArray0.addElement(822);
      optimization_DynamicIntArray0.addElement(822);
      // Undeclared exception!
      try { 
        optimization_DynamicIntArray0.removeElementAt((-3196));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
      }
  }

  /**
  //Test case number: 3
  /*Coverage entropy=0.3333333333333333
  */
  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      FileSystemHandling fileSystemHandling0 = new FileSystemHandling();
      FileSystemHandling.appendStringToFile((EvoSuiteFile) null, "");
      FileSystemHandling.createFolder((EvoSuiteFile) null);
      FileSystemHandling.appendStringToFile((EvoSuiteFile) null, (String) null);
      FileSystemHandling.createFolder((EvoSuiteFile) null);
      FileSystemHandling.appendStringToFile((EvoSuiteFile) null, "d:");
      FileSystemHandling.createFolder((EvoSuiteFile) null);
      weka.core.matrix.Matrix matrix0 = new weka.core.matrix.Matrix(1669, 965);
      double[] doubleArray0 = new double[0];
      boolean[] booleanArray0 = new boolean[5];
      booleanArray0[0] = false;
      booleanArray0[1] = false;
      booleanArray0[2] = false;
      booleanArray0[3] = false;
      booleanArray0[4] = false;
      double[] doubleArray1 = Optimization.solveTriangle(matrix0, doubleArray0, false, booleanArray0);
      assertFalse(doubleArray1.equals((Object)doubleArray0));
  }

  /**
  //Test case number: 4
  /*Coverage entropy=0.3333333333333333
  */
  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      weka.core.matrix.Matrix matrix0 = new weka.core.matrix.Matrix(947, 3185);
      double[] doubleArray0 = new double[2];
      FileSystemHandling.shouldAllThrowIOExceptions();
      Optimization.solveTriangle(matrix0, doubleArray0, true, (boolean[]) null);
      String string0 = null;
      LinkedList<Locale.LanguageRange> linkedList0 = new LinkedList<Locale.LanguageRange>();
      Locale.LanguageRange locale_LanguageRange0 = null;
      try {
        locale_LanguageRange0 = new Locale.LanguageRange((String) null, 406.5915437519333);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.Locale$LanguageRange", e);
      }
  }

  /**
  //Test case number: 5
  /*Coverage entropy=0.4
  */
  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      FileSystemHandling fileSystemHandling0 = new FileSystemHandling();
      weka.core.matrix.Matrix matrix0 = weka.core.matrix.Matrix.random(19, 19);
      double double0 = Optimization.m_Zero;
      FileSystemHandling.shouldAllThrowIOExceptions();
      FileSystemHandling.shouldThrowIOException((EvoSuiteFile) null);
      FileSystemHandling.appendDataToFile((EvoSuiteFile) null, (byte[]) null);
      FileSystemHandling.appendStringToFile((EvoSuiteFile) null, "l/GF=GTW");
      FileSystemHandling fileSystemHandling1 = new FileSystemHandling();
      FileSystemHandling.appendDataToFile((EvoSuiteFile) null, (byte[]) null);
      FileSystemHandling.shouldAllThrowIOExceptions();
      FileSystemHandling.appendStringToFile((EvoSuiteFile) null, (String) null);
      FileSystemHandling fileSystemHandling2 = new FileSystemHandling();
      double[] doubleArray0 = new double[1];
      doubleArray0[0] = (double) 19;
      boolean[] booleanArray0 = new boolean[5];
      booleanArray0[0] = true;
      booleanArray0[1] = false;
      booleanArray0[2] = false;
      booleanArray0[3] = true;
      double[] doubleArray1 = Optimization.solveTriangle(matrix0, doubleArray0, false, booleanArray0);
      double[] doubleArray2 = Optimization.solveTriangle(matrix0, doubleArray1, true, booleanArray0);
      assertArrayEquals(new double[] {0.0}, doubleArray2, 0.01);
      assertArrayEquals(new double[] {0.0}, doubleArray1, 0.01);
  }

  /**
  //Test case number: 6
  /*Coverage entropy=0.3333333333333333
  */
  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      weka.core.matrix.Matrix matrix0 = new weka.core.matrix.Matrix(987, 3185);
      boolean[] booleanArray0 = new boolean[1];
      booleanArray0[0] = true;
      // Undeclared exception!
      try { 
        Optimization.solveTriangle(matrix0, (double[]) null, true, booleanArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("weka.core.Optimization", e);
      }
  }

  /**
  //Test case number: 7
  /*Coverage entropy=0.3333333333333333
  */
  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      FileSystemHandling fileSystemHandling0 = new FileSystemHandling();
      weka.core.matrix.Matrix matrix0 = weka.core.matrix.Matrix.random(19, 19);
      FileSystemHandling.shouldAllThrowIOExceptions();
      FileSystemHandling.shouldThrowIOException((EvoSuiteFile) null);
      FileSystemHandling.appendDataToFile((EvoSuiteFile) null, (byte[]) null);
      FileSystemHandling.appendStringToFile((EvoSuiteFile) null, "l/GF=GTW");
      FileSystemHandling fileSystemHandling1 = new FileSystemHandling();
      FileSystemHandling.appendDataToFile((EvoSuiteFile) null, (byte[]) null);
      FileSystemHandling.shouldAllThrowIOExceptions();
      FileSystemHandling.appendStringToFile((EvoSuiteFile) null, "l/GF=GTW");
      FileSystemHandling fileSystemHandling2 = new FileSystemHandling();
      double[] doubleArray0 = new double[5];
      doubleArray0[0] = (-1429.120195331246);
      doubleArray0[1] = (-1429.120195331246);
      doubleArray0[2] = (double) 3185;
      doubleArray0[3] = (-1429.120195331246);
      doubleArray0[4] = (double) 3185;
      boolean[] booleanArray0 = new boolean[9];
      booleanArray0[0] = false;
      booleanArray0[1] = false;
      booleanArray0[2] = true;
      booleanArray0[3] = true;
      booleanArray0[4] = false;
      booleanArray0[5] = false;
      booleanArray0[6] = false;
      booleanArray0[7] = false;
      double[] doubleArray1 = Optimization.solveTriangle(matrix0, doubleArray0, false, booleanArray0);
      assertArrayEquals(new double[] {Double.NaN, Double.NEGATIVE_INFINITY, 0.0, 0.0, Double.POSITIVE_INFINITY}, doubleArray1, 0.01);
  }

  /**
  //Test case number: 8
  /*Coverage entropy=0.3333333333333333
  */
  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      FileSystemHandling fileSystemHandling0 = new FileSystemHandling();
      weka.core.matrix.Matrix matrix0 = new weka.core.matrix.Matrix(3185, 3185);
      FileSystemHandling.shouldAllThrowIOExceptions();
      FileSystemHandling.shouldAllThrowIOExceptions();
      FileSystemHandling.appendDataToFile((EvoSuiteFile) null, (byte[]) null);
      FileSystemHandling.appendLineToFile((EvoSuiteFile) null, "{YG!aH/'h84");
      FileSystemHandling.appendStringToFile((EvoSuiteFile) null, "l/GF=GTW");
      FileSystemHandling fileSystemHandling1 = new FileSystemHandling();
      FileSystemHandling.appendDataToFile((EvoSuiteFile) null, (byte[]) null);
      FileSystemHandling.shouldAllThrowIOExceptions();
      FileSystemHandling.appendStringToFile((EvoSuiteFile) null, "l/GF=GTW");
      FileSystemHandling.createFolder((EvoSuiteFile) null);
      FileSystemHandling fileSystemHandling2 = new FileSystemHandling();
      double[] doubleArray0 = new double[10];
      doubleArray0[0] = (-1429.120195331246);
      doubleArray0[1] = (-1429.120195331246);
      doubleArray0[2] = (double) 3185;
      doubleArray0[3] = (-1429.120195331246);
      doubleArray0[4] = (double) 3185;
      boolean[] booleanArray0 = new boolean[9];
      booleanArray0[0] = false;
      booleanArray0[1] = false;
      booleanArray0[2] = true;
      booleanArray0[3] = true;
      booleanArray0[4] = false;
      booleanArray0[5] = false;
      booleanArray0[6] = false;
      booleanArray0[7] = false;
      booleanArray0[8] = true;
      // Undeclared exception!
      try { 
        Optimization.solveTriangle(matrix0, doubleArray0, true, booleanArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 9
         //
         verifyException("weka.core.Optimization", e);
      }
  }

  /**
  //Test case number: 9
  /*Coverage entropy=0.3333333333333333
  */
  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      FileSystemHandling fileSystemHandling0 = new FileSystemHandling();
      weka.core.matrix.Matrix matrix0 = weka.core.matrix.Matrix.random(19, 19);
      FileSystemHandling.shouldAllThrowIOExceptions();
      FileSystemHandling.shouldThrowIOException((EvoSuiteFile) null);
      FileSystemHandling.appendDataToFile((EvoSuiteFile) null, (byte[]) null);
      FileSystemHandling.appendStringToFile((EvoSuiteFile) null, "l/GF=GTW");
      FileSystemHandling fileSystemHandling1 = new FileSystemHandling();
      FileSystemHandling.appendDataToFile((EvoSuiteFile) null, (byte[]) null);
      FileSystemHandling.shouldAllThrowIOExceptions();
      FileSystemHandling.appendStringToFile((EvoSuiteFile) null, "l/GF=GTW");
      FileSystemHandling fileSystemHandling2 = new FileSystemHandling();
      double[] doubleArray0 = new double[5];
      doubleArray0[0] = (-1429.120195331246);
      doubleArray0[1] = (-1429.120195331246);
      doubleArray0[2] = (double) 3185;
      doubleArray0[3] = (-1429.120195331246);
      doubleArray0[4] = (double) 3185;
      boolean[] booleanArray0 = new boolean[8];
      booleanArray0[0] = false;
      booleanArray0[1] = false;
      booleanArray0[2] = true;
      booleanArray0[3] = true;
      booleanArray0[4] = false;
      booleanArray0[5] = false;
      booleanArray0[6] = false;
      booleanArray0[7] = false;
      double[] doubleArray1 = Optimization.solveTriangle(matrix0, doubleArray0, false, booleanArray0);
      assertArrayEquals(new double[] {Double.NaN, Double.NEGATIVE_INFINITY, 0.0, 0.0, Double.POSITIVE_INFINITY}, doubleArray1, 0.01);
  }

  /**
  //Test case number: 10
  /*Coverage entropy=0.3333333333333333
  */
  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      weka.core.matrix.Matrix matrix0 = new weka.core.matrix.Matrix(987, 3185);
      double[] doubleArray0 = new double[2];
      int[] intArray0 = new int[4];
      FileSystemHandling.shouldAllThrowIOExceptions();
      intArray0[1] = 987;
      boolean[] booleanArray0 = new boolean[7];
      booleanArray0[0] = true;
      booleanArray0[3] = false;
      booleanArray0[5] = true;
      Optimization.solveTriangle(matrix0, doubleArray0, true, booleanArray0);
      String string0 = "I*,\"0K6\"L";
      Locale locale0 = new Locale("Used for alphabetizing, cross referencing, and creating a label when the ``author'' information is missing. This field should not be confused with the key that appears in the cite command and at the beginning of the database entry.", "5i,+CART]", "I*,\"0K6\"L");
      locale0.getDisplayCountry();
      LinkedList<Locale.LanguageRange> linkedList0 = new LinkedList<Locale.LanguageRange>();
      Locale.LanguageRange locale_LanguageRange0 = null;
      try {
        locale_LanguageRange0 = new Locale.LanguageRange("", 3185);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // weight=3185.0
         //
         verifyException("java.util.Locale$LanguageRange", e);
      }
  }

  /**
  //Test case number: 11
  /*Coverage entropy=2.4297811167972485
  */
  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Optimization optimization0 = mock(Optimization.class, CALLS_REAL_METHODS);
      Optimization.DynamicIntArray optimization_DynamicIntArray0 = optimization0.new DynamicIntArray(710);
      optimization_DynamicIntArray0.getRevision();
      optimization_DynamicIntArray0.removeAllElements();
      optimization_DynamicIntArray0.addElement(0);
      optimization_DynamicIntArray0.copy();
      optimization_DynamicIntArray0.addElement(710);
      optimization_DynamicIntArray0.addElement(710);
      optimization_DynamicIntArray0.removeElementAt(0);
      optimization_DynamicIntArray0.copy();
      optimization_DynamicIntArray0.copy();
      optimization_DynamicIntArray0.size();
      // Undeclared exception!
      try { 
        optimization_DynamicIntArray0.removeElementAt(2);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
      }
  }

  /**
  //Test case number: 12
  /*Coverage entropy=2.282325506963904
  */
  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Optimization optimization0 = mock(Optimization.class, CALLS_REAL_METHODS);
      int int0 = 395;
      Optimization.DynamicIntArray optimization_DynamicIntArray0 = optimization0.new DynamicIntArray(395);
      optimization_DynamicIntArray0.copy();
      optimization_DynamicIntArray0.addElement(395);
      optimization_DynamicIntArray0.copy();
      optimization_DynamicIntArray0.addElement(395);
      optimization_DynamicIntArray0.removeAllElements();
      optimization_DynamicIntArray0.addElement((-1632));
      optimization_DynamicIntArray0.copy();
      optimization_DynamicIntArray0.addElement(395);
      optimization_DynamicIntArray0.copy();
      optimization_DynamicIntArray0.removeAllElements();
      optimization_DynamicIntArray0.addElement(395);
      optimization_DynamicIntArray0.copy();
      optimization_DynamicIntArray0.getRevision();
      optimization_DynamicIntArray0.getRevision();
      optimization_DynamicIntArray0.copy();
      optimization_DynamicIntArray0.getRevision();
      optimization_DynamicIntArray0.copy();
      // Undeclared exception!
      try { 
        optimization_DynamicIntArray0.elementAt(395);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 395
         //
         verifyException("weka.core.Optimization$DynamicIntArray", e);
      }
  }

  /**
  //Test case number: 13
  /*Coverage entropy=1.197160401297256
  */
  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      weka.core.matrix.Matrix matrix0 = new weka.core.matrix.Matrix(987, 3185);
      double[] doubleArray0 = new double[2];
      int[] intArray0 = new int[4];
      FileSystemHandling.shouldAllThrowIOExceptions();
      intArray0[1] = 987;
      boolean[] booleanArray0 = new boolean[7];
      booleanArray0[0] = true;
      booleanArray0[1] = true;
      booleanArray0[3] = false;
      booleanArray0[5] = true;
      Optimization.solveTriangle(matrix0, doubleArray0, true, booleanArray0);
      Locale locale0 = new Locale("eQNH1n:", "5i,+CART]", "I*,\"0K6\"L");
      locale0.getDisplayCountry();
      Locale.Category locale_Category0 = Locale.Category.FORMAT;
      Locale.setDefault(locale_Category0, locale0);
      MockPrintWriter mockPrintWriter0 = new MockPrintWriter("I*,\"0K6\"L");
      PrintWriter printWriter0 = mockPrintWriter0.append((CharSequence) "5I,+CART]");
      printWriter0.print("INCOLLECTION");
      MockPrintWriter mockPrintWriter1 = new MockPrintWriter(printWriter0);
      mockPrintWriter1.close();
      MockPrintWriter mockPrintWriter2 = new MockPrintWriter(printWriter0, false);
      char[] charArray0 = new char[1];
      Object[] objectArray0 = new Object[7];
      Optimization optimization0 = mock(Optimization.class, CALLS_REAL_METHODS);
      Optimization.DynamicIntArray optimization_DynamicIntArray0 = optimization0.new DynamicIntArray(741);
      Object object0 = optimization_DynamicIntArray0.copy();
      objectArray0[0] = object0;
      objectArray0[1] = (Object) mockPrintWriter1;
      objectArray0[2] = (Object) mockPrintWriter0;
      objectArray0[3] = (Object) false;
      objectArray0[4] = (Object) "eQNH1n:";
      Object object1 = optimization_DynamicIntArray0.copy();
      objectArray0[5] = object1;
      objectArray0[6] = (Object) mockPrintWriter1;
      mockPrintWriter0.format(locale0, "5i,+CART]", objectArray0);
      charArray0[0] = '/';
      mockPrintWriter0.println(charArray0);
      PrintWriter printWriter1 = mockPrintWriter1.format(locale0, (String) null, (Object[]) null);
      assertSame(mockPrintWriter1, printWriter1);
  }

  /**
  //Test case number: 14
  /*Coverage entropy=1.4572637190629707
  */
  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      weka.core.matrix.Matrix matrix0 = new weka.core.matrix.Matrix(987, 3148);
      double[] doubleArray0 = new double[1];
      int[] intArray0 = new int[4];
      boolean boolean0 = Optimization.m_Debug;
      FileSystemHandling.shouldThrowIOException((EvoSuiteFile) null);
      intArray0[1] = 3148;
      intArray0[2] = 3148;
      boolean[] booleanArray0 = new boolean[7];
      booleanArray0[0] = true;
      booleanArray0[1] = true;
      booleanArray0[3] = false;
      booleanArray0[4] = true;
      booleanArray0[5] = true;
      Optimization.solveTriangle(matrix0, doubleArray0, true, booleanArray0);
      Optimization optimization0 = mock(Optimization.class, CALLS_REAL_METHODS);
      Optimization.DynamicIntArray optimization_DynamicIntArray0 = optimization0.new DynamicIntArray(0);
      optimization_DynamicIntArray0.getRevision();
      double[] doubleArray1 = new double[9];
      doubleArray1[0] = (double) 3148;
      optimization_DynamicIntArray0.getRevision();
      optimization_DynamicIntArray0.addElement(3148);
      MockPrintWriter mockPrintWriter0 = new MockPrintWriter("8076");
      mockPrintWriter0.print(1248.4873514939);
      char[] charArray0 = new char[7];
      charArray0[0] = 'I';
      charArray0[1] = ']';
      charArray0[2] = '^';
      charArray0[3] = 'B';
      charArray0[4] = '\\';
      charArray0[5] = '_';
      charArray0[6] = '3';
      mockPrintWriter0.print(charArray0);
      Object[] objectArray0 = new Object[0];
      PrintWriter printWriter0 = mockPrintWriter0.printf("Prentice-Hall", objectArray0);
      MockPrintWriter mockPrintWriter1 = new MockPrintWriter(printWriter0, true);
      // Undeclared exception!
      try { 
        printWriter0.println((char[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.io.PrintWriter", e);
      }
  }

  /**
  //Test case number: 15
  /*Coverage entropy=2.0894379124341005
  */
  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Optimization optimization0 = mock(Optimization.class, CALLS_REAL_METHODS);
      int int0 = 19;
      Optimization.DynamicIntArray optimization_DynamicIntArray0 = optimization0.new DynamicIntArray(19);
      optimization_DynamicIntArray0.removeAllElements();
      optimization_DynamicIntArray0.copy();
      optimization_DynamicIntArray0.copy();
      int int1 = 1184;
      optimization_DynamicIntArray0.addElement(1184);
      optimization_DynamicIntArray0.copy();
      optimization_DynamicIntArray0.copy();
      // Undeclared exception!
      try { 
        optimization_DynamicIntArray0.removeElementAt(19);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
      }
  }
}
