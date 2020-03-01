/*
 * This file was automatically generated by EvoSuite
 * Mon Nov 18 09:09:30 GMT 2019
 */

package weka.core;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.FilterOutputStream;
import java.io.PrintWriter;
import java.text.NumberFormat;
import java.util.Locale;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.Random;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.evosuite.runtime.mock.java.io.MockPrintStream;
import org.evosuite.runtime.mock.java.io.MockPrintWriter;
import org.evosuite.runtime.testdata.EvoSuiteFile;
import org.evosuite.runtime.testdata.FileSystemHandling;
import org.junit.runner.RunWith;
import weka.core.Optimization;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class Optimization_ESTest extends Optimization_ESTest_scaffolding {

  /**
  //Test case number: 0
  /*Coverage entropy=1.0809586127392572
  */
  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Optimization optimization0 = mock(Optimization.class, CALLS_REAL_METHODS);
      Optimization.DynamicIntArray optimization_DynamicIntArray0 = optimization0.new DynamicIntArray(0);
      weka.core.matrix.Matrix matrix0 = new weka.core.matrix.Matrix(0, 0);
      MockPrintStream mockPrintStream0 = new MockPrintStream("pwsZm^W)DsT/1%");
      FilterOutputStream filterOutputStream0 = new FilterOutputStream(mockPrintStream0);
      MockPrintWriter mockPrintWriter0 = new MockPrintWriter(filterOutputStream0);
      Object[] objectArray0 = new Object[4];
      Object object0 = new Object();
      objectArray0[0] = object0;
      PrintWriter printWriter0 = mockPrintWriter0.append((CharSequence) "pwsZm^W)DsT/1%");
      mockPrintWriter0.checkError();
      printWriter0.print(object0);
      objectArray0[1] = (Object) matrix0;
      objectArray0[2] = (Object) printWriter0;
      objectArray0[3] = (Object) mockPrintWriter0;
      mockPrintStream0.println(0L);
      MockPrintStream mockPrintStream1 = new MockPrintStream("pwsZm^W)DsT/1%");
      mockPrintWriter0.print((-1232.2057));
      double[] doubleArray0 = new double[0];
      optimization_DynamicIntArray0.addElement((-2667));
      optimization_DynamicIntArray0.addElement(0);
      optimization_DynamicIntArray0.addElement((-2820));
      assertEquals(3, optimization_DynamicIntArray0.size());
  }

  /**
  //Test case number: 1
  /*Coverage entropy=0.3333333333333333
  */
  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      double[] doubleArray0 = new double[4];
      doubleArray0[0] = (double) 36;
      doubleArray0[1] = (double) 36;
      weka.core.matrix.Matrix matrix0 = new weka.core.matrix.Matrix(36, 36);
      FileSystemHandling fileSystemHandling0 = new FileSystemHandling();
      Object object0 = new Object();
      Object[] objectArray0 = new Object[2];
      objectArray0[0] = (Object) matrix0;
      objectArray0[1] = (Object) matrix0;
      char[] charArray0 = new char[5];
      charArray0[0] = 'd';
      boolean[] booleanArray0 = new boolean[5];
      booleanArray0[0] = true;
      booleanArray0[1] = false;
      booleanArray0[2] = true;
      booleanArray0[3] = true;
      booleanArray0[4] = false;
      double[] doubleArray1 = Optimization.solveTriangle(matrix0, doubleArray0, false, booleanArray0);
      assertArrayEquals(new double[] {0.0, Double.POSITIVE_INFINITY, 0.0, 0.0}, doubleArray1, 0.01);
  }

  /**
  //Test case number: 2
  /*Coverage entropy=0.3333333333333333
  */
  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      byte[] byteArray0 = new byte[0];
      FileSystemHandling.appendDataToFile((EvoSuiteFile) null, byteArray0);
      FileSystemHandling.appendStringToFile((EvoSuiteFile) null, "");
      FileSystemHandling.shouldThrowIOException((EvoSuiteFile) null);
      FileSystemHandling.setPermissions((EvoSuiteFile) null, false, false, false);
      double[] doubleArray0 = new double[7];
      doubleArray0[0] = 3444.0;
      doubleArray0[1] = (-3079.6408596838432);
      doubleArray0[2] = 224.738970548;
      doubleArray0[3] = 1.0000000018626451;
      doubleArray0[4] = 1.0000004768371582;
      doubleArray0[5] = (-347.47374515);
      doubleArray0[6] = 2.0;
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
  //Test case number: 3
  /*Coverage entropy=0.3333333333333333
  */
  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      double[][] doubleArray0 = new double[7][5];
      Locale locale0 = Locale.KOREAN;
      Locale locale1 = locale0.stripExtensions();
      NumberFormat.getNumberInstance(locale0);
      Locale.Category locale_Category0 = Locale.Category.DISPLAY;
      Locale.setDefault(locale_Category0, locale1);
      weka.core.matrix.Matrix.identity(34, 65);
      boolean[] booleanArray0 = new boolean[6];
      weka.core.matrix.Matrix matrix0 = new weka.core.matrix.Matrix(65, 34, (-788.09476));
      double[] doubleArray1 = new double[3];
      doubleArray1[0] = (-1515.6770310310014);
      doubleArray1[1] = (double) (-2187);
      doubleArray1[2] = 875.350026;
      double[] doubleArray2 = Optimization.solveTriangle(matrix0, doubleArray1, true, booleanArray0);
      assertArrayEquals(new double[] {1.9232167347883413, 0.8518302659048242, (-3.8857637195811328)}, doubleArray2, 0.01);
  }

  /**
  //Test case number: 4
  /*Coverage entropy=0.3333333333333333
  */
  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      FileSystemHandling.createFolder((EvoSuiteFile) null);
      FileSystemHandling.createFolder((EvoSuiteFile) null);
      byte[] byteArray0 = new byte[0];
      boolean boolean0 = FileSystemHandling.appendDataToFile((EvoSuiteFile) null, byteArray0);
      FileSystemHandling.shouldThrowIOException((EvoSuiteFile) null);
      double[] doubleArray0 = new double[0];
      FileSystemHandling.setPermissions((EvoSuiteFile) null, false, false, false);
      boolean[] booleanArray0 = new boolean[1];
      booleanArray0[0] = false;
      Optimization.solveTriangle((weka.core.matrix.Matrix) null, doubleArray0, false, booleanArray0);
      boolean boolean1 = FileSystemHandling.appendDataToFile((EvoSuiteFile) null, byteArray0);
      assertTrue(boolean1 == boolean0);
  }

  /**
  //Test case number: 5
  /*Coverage entropy=0.3333333333333333
  */
  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      byte[] byteArray0 = new byte[5];
      FileSystemHandling.appendDataToFile((EvoSuiteFile) null, byteArray0);
      EvoSuiteFile evoSuiteFile0 = null;
      FileSystemHandling.shouldThrowIOException((EvoSuiteFile) null);
      FileSystemHandling.setPermissions((EvoSuiteFile) null, true, false, true);
      double[] doubleArray0 = new double[7];
      doubleArray0[0] = 1.0000000000000568;
      doubleArray0[1] = 0.1;
      doubleArray0[2] = 1.0000000000001137;
      doubleArray0[3] = 570.20911215814;
      doubleArray0[4] = (-2309.1);
      doubleArray0[5] = 0.2;
      doubleArray0[6] = 0.1;
      FileSystemHandling.shouldThrowIOException((EvoSuiteFile) null);
      boolean[] booleanArray0 = new boolean[1];
      booleanArray0[0] = false;
      // Undeclared exception!
      try { 
        Optimization.solveTriangle((weka.core.matrix.Matrix) null, doubleArray0, false, booleanArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 6
         //
         verifyException("weka.core.Optimization", e);
      }
  }

  /**
  //Test case number: 6
  /*Coverage entropy=2.4330896362348002
  */
  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Optimization optimization0 = mock(Optimization.class, CALLS_REAL_METHODS);
      Optimization.DynamicIntArray optimization_DynamicIntArray0 = optimization0.new DynamicIntArray(3);
      optimization_DynamicIntArray0.getRevision();
      optimization_DynamicIntArray0.copy();
      optimization_DynamicIntArray0.copy();
      optimization_DynamicIntArray0.addElement(13);
      optimization_DynamicIntArray0.removeAllElements();
      optimization_DynamicIntArray0.addElement(13);
      optimization_DynamicIntArray0.copy();
      optimization_DynamicIntArray0.removeAllElements();
      optimization_DynamicIntArray0.addElement(769);
      optimization_DynamicIntArray0.copy();
      optimization_DynamicIntArray0.copy();
      optimization_DynamicIntArray0.elementAt(0);
      // Undeclared exception!
      try { 
        optimization_DynamicIntArray0.removeElementAt((-3457));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
      }
  }

  /**
  //Test case number: 7
  /*Coverage entropy=2.0831221229604164
  */
  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Optimization optimization0 = mock(Optimization.class, CALLS_REAL_METHODS);
      Optimization.DynamicIntArray optimization_DynamicIntArray0 = optimization0.new DynamicIntArray(1939);
      optimization_DynamicIntArray0.removeAllElements();
      optimization_DynamicIntArray0.addElement(1939);
      optimization_DynamicIntArray0.addElement(4321);
      optimization_DynamicIntArray0.removeAllElements();
      optimization_DynamicIntArray0.removeAllElements();
      optimization_DynamicIntArray0.removeAllElements();
      optimization_DynamicIntArray0.size();
      // Undeclared exception!
      try { 
        optimization_DynamicIntArray0.removeElementAt(1939);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
      }
  }

  /**
  //Test case number: 8
  /*Coverage entropy=2.231739065208693
  */
  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Optimization optimization0 = mock(Optimization.class, CALLS_REAL_METHODS);
      Optimization.DynamicIntArray optimization_DynamicIntArray0 = optimization0.new DynamicIntArray(0);
      optimization_DynamicIntArray0.getRevision();
      optimization_DynamicIntArray0.removeAllElements();
      optimization_DynamicIntArray0.addElement(0);
      optimization_DynamicIntArray0.addElement(0);
      optimization_DynamicIntArray0.removeElementAt(0);
      optimization_DynamicIntArray0.copy();
      optimization_DynamicIntArray0.getRevision();
      optimization_DynamicIntArray0.getRevision();
      optimization_DynamicIntArray0.copy();
      optimization_DynamicIntArray0.removeAllElements();
      optimization_DynamicIntArray0.addElement(200);
      optimization_DynamicIntArray0.removeElementAt(0);
      double[] doubleArray0 = new double[4];
      doubleArray0[0] = (double) 0;
      doubleArray0[2] = (double) 0;
      doubleArray0[3] = 1724.98519114;
  }

  /**
  //Test case number: 9
  /*Coverage entropy=0.3333333333333333
  */
  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Random.setNextRandom(36);
      double[] doubleArray0 = new double[4];
      doubleArray0[0] = (double) 36;
      doubleArray0[1] = (double) 36;
      weka.core.matrix.Matrix matrix0 = new weka.core.matrix.Matrix(36, 36);
      FileSystemHandling fileSystemHandling0 = new FileSystemHandling();
      Object object0 = new Object();
      Object[] objectArray0 = new Object[2];
      objectArray0[0] = (Object) matrix0;
      objectArray0[1] = (Object) matrix0;
      char[] charArray0 = new char[5];
      charArray0[0] = 'd';
      charArray0[2] = '\u0000';
      objectArray0[1] = (Object) '@';
      boolean[] booleanArray0 = new boolean[6];
      booleanArray0[0] = true;
      booleanArray0[2] = true;
      booleanArray0[3] = true;
      booleanArray0[4] = true;
      booleanArray0[5] = true;
      double[] doubleArray1 = Optimization.solveTriangle(matrix0, doubleArray0, true, booleanArray0);
      assertArrayEquals(new double[] {36.0, 36.0, 0.0, 0.0}, doubleArray0, 0.01);
      assertArrayEquals(new double[] {0.0, Double.POSITIVE_INFINITY, 0.0, 0.0}, doubleArray1, 0.01);
  }

  /**
  //Test case number: 10
  /*Coverage entropy=0.3333333333333333
  */
  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      FileSystemHandling.createFolder((EvoSuiteFile) null);
      byte[] byteArray0 = new byte[0];
      FileSystemHandling.appendDataToFile((EvoSuiteFile) null, byteArray0);
      FileSystemHandling.shouldThrowIOException((EvoSuiteFile) null);
      FileSystemHandling.setPermissions((EvoSuiteFile) null, false, false, true);
      double[] doubleArray0 = new double[4];
      doubleArray0[0] = 1.0000000037252903;
      doubleArray0[1] = (-1106.2513);
      doubleArray0[2] = 583.495;
      doubleArray0[3] = 4315.2558;
      boolean[] booleanArray0 = new boolean[9];
      booleanArray0[0] = false;
      booleanArray0[1] = true;
      booleanArray0[2] = false;
      booleanArray0[3] = true;
      booleanArray0[4] = true;
      booleanArray0[5] = false;
      booleanArray0[6] = false;
      booleanArray0[7] = false;
      booleanArray0[8] = false;
      // Undeclared exception!
      try { 
        Optimization.solveTriangle((weka.core.matrix.Matrix) null, doubleArray0, true, booleanArray0);
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
  /*Coverage entropy=1.5981863871455346
  */
  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Optimization optimization0 = mock(Optimization.class, CALLS_REAL_METHODS);
      Optimization.DynamicIntArray optimization_DynamicIntArray0 = optimization0.new DynamicIntArray(0);
      weka.core.matrix.Matrix matrix0 = new weka.core.matrix.Matrix(0, 0);
      MockPrintStream mockPrintStream0 = new MockPrintStream("pwsZm^W)DsT/1%");
      FilterOutputStream filterOutputStream0 = new FilterOutputStream(mockPrintStream0);
      MockPrintWriter mockPrintWriter0 = new MockPrintWriter(filterOutputStream0);
      Object[] objectArray0 = new Object[4];
      MockPrintWriter mockPrintWriter1 = new MockPrintWriter("pwsZm^W)DsT/1%");
      Object object0 = new Object();
      objectArray0[0] = object0;
      PrintWriter printWriter0 = mockPrintWriter0.append((CharSequence) "pwsZm^W)DsT/1%");
      mockPrintWriter0.checkError();
      mockPrintStream0.print((double) 0);
      optimization_DynamicIntArray0.removeAllElements();
      mockPrintWriter0.write((-5832));
      printWriter0.print(object0);
      objectArray0[1] = (Object) matrix0;
      objectArray0[3] = (Object) mockPrintWriter0;
      mockPrintWriter0.write("");
      mockPrintStream0.println(0L);
      MockPrintStream mockPrintStream1 = new MockPrintStream("pwsZm^W)DsT/1%");
      matrix0.print((PrintWriter) mockPrintWriter0, (-2820), (-2820));
      double[] doubleArray0 = new double[0];
      boolean[] booleanArray0 = new boolean[2];
      MockPrintWriter mockPrintWriter2 = new MockPrintWriter(printWriter0);
      mockPrintWriter2.print((double) 0);
      matrix0.print(printWriter0, (-599), 23);
      Optimization.solveTriangle(matrix0, doubleArray0, true, booleanArray0);
      optimization_DynamicIntArray0.addElement(23);
      assertEquals(1, optimization_DynamicIntArray0.size());
  }

  /**
  //Test case number: 12
  /*Coverage entropy=1.2961346570528898
  */
  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Optimization optimization0 = mock(Optimization.class, CALLS_REAL_METHODS);
      Optimization.DynamicIntArray optimization_DynamicIntArray0 = optimization0.new DynamicIntArray(14);
      weka.core.matrix.Matrix matrix0 = new weka.core.matrix.Matrix(14, 14);
      MockPrintStream mockPrintStream0 = new MockPrintStream("pwsZm^W)DsT/1%");
      FilterOutputStream filterOutputStream0 = new FilterOutputStream(mockPrintStream0);
      MockPrintWriter mockPrintWriter0 = new MockPrintWriter(filterOutputStream0);
      Object[] objectArray0 = new Object[4];
      MockPrintWriter mockPrintWriter1 = new MockPrintWriter("pwsZm^W)DsT/1%");
      Object object0 = new Object();
      objectArray0[0] = object0;
      PrintWriter printWriter0 = mockPrintWriter0.append((CharSequence) "pwsZm^W)DsT/1%");
      mockPrintWriter0.checkError();
      mockPrintStream0.print((double) 14);
      mockPrintWriter0.write((-5832));
      printWriter0.print(object0);
      objectArray0[1] = (Object) matrix0;
      objectArray0[2] = (Object) printWriter0;
      objectArray0[3] = (Object) mockPrintWriter0;
      mockPrintWriter0.write("");
      mockPrintStream0.println(0L);
      MockPrintStream mockPrintStream1 = new MockPrintStream("pwsZm^W)DsT/1%");
      mockPrintWriter0.print((-1232.2057));
      matrix0.print((PrintWriter) mockPrintWriter0, (-2820), (-2820));
      double[] doubleArray0 = new double[0];
      boolean[] booleanArray0 = new boolean[2];
      MockPrintWriter mockPrintWriter2 = new MockPrintWriter(printWriter0);
      mockPrintWriter2.print((double) 14);
      matrix0.print(printWriter0, (-599), 23);
      Optimization.solveTriangle(matrix0, doubleArray0, true, booleanArray0);
      optimization_DynamicIntArray0.addElement(23);
      assertEquals(1, optimization_DynamicIntArray0.size());
  }
}
