/*
 * This file was automatically generated by EvoSuite
 * Fri Dec 06 03:37:23 GMT 2019
 */

package weka.core;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;
import weka.core.Optimization;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class Optimization_ESTest extends Optimization_ESTest_scaffolding {

  /**
  //Test case number: 0
  /*Coverage entropy=0.42857142857142855
  */
  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Optimization optimization0 = mock(Optimization.class, CALLS_REAL_METHODS);
      Optimization.DynamicIntArray optimization_DynamicIntArray0 = optimization0.new DynamicIntArray(1);
      optimization_DynamicIntArray0.addElement((-634));
      optimization_DynamicIntArray0.addElement((-634));
      assertEquals(2, optimization_DynamicIntArray0.size());
  }

  /**
  //Test case number: 1
  /*Coverage entropy=0.3333333333333333
  */
  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      weka.core.matrix.Matrix matrix0 = weka.core.matrix.Matrix.random(10, 40);
      matrix0.rank();
      double[] doubleArray0 = new double[2];
      doubleArray0[1] = (double) 40;
      boolean[] booleanArray0 = new boolean[7];
      booleanArray0[0] = true;
      booleanArray0[1] = false;
      booleanArray0[3] = true;
      booleanArray0[6] = false;
      double[] doubleArray1 = Optimization.solveTriangle(matrix0, doubleArray0, false, booleanArray0);
      assertArrayEquals(new double[] {0.0, 400.0}, doubleArray1, 0.01);
  }

  /**
  //Test case number: 2
  /*Coverage entropy=0.3333333333333333
  */
  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      weka.core.matrix.Matrix matrix0 = weka.core.matrix.Matrix.random(11, 11);
      double[] doubleArray0 = new double[10];
      double[] doubleArray1 = Optimization.solveTriangle(matrix0, doubleArray0, true, (boolean[]) null);
      assertArrayEquals(new double[] {Double.NaN, Double.NaN, Double.NaN, Double.NaN, Double.NaN, Double.NaN, Double.NaN, Double.NaN, Double.NaN, Double.NaN}, doubleArray1, 0.01);
  }

  /**
  //Test case number: 3
  /*Coverage entropy=0.3333333333333333
  */
  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      weka.core.matrix.Matrix matrix0 = weka.core.matrix.Matrix.identity(11, 11);
      double[] doubleArray0 = new double[1];
      doubleArray0[0] = (double) 11;
      double[] doubleArray1 = Optimization.solveTriangle(matrix0, doubleArray0, true, (boolean[]) null);
      assertArrayEquals(new double[] {11.0}, doubleArray1, 0.01);
  }

  /**
  //Test case number: 4
  /*Coverage entropy=0.3333333333333333
  */
  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      weka.core.matrix.Matrix matrix0 = new weka.core.matrix.Matrix(11, 11);
      double[] doubleArray0 = new double[5];
      double[] doubleArray1 = Optimization.solveTriangle(matrix0, doubleArray0, false, (boolean[]) null);
      assertEquals(5, doubleArray1.length);
  }

  /**
  //Test case number: 5
  /*Coverage entropy=0.3333333333333333
  */
  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      weka.core.matrix.Matrix matrix0 = weka.core.matrix.Matrix.random(11, 11);
      double[] doubleArray0 = new double[4];
      boolean[] booleanArray0 = new boolean[4];
      booleanArray0[0] = false;
      booleanArray0[2] = true;
      booleanArray0[3] = true;
      double[] doubleArray1 = Optimization.solveTriangle(matrix0, doubleArray0, true, booleanArray0);
      assertArrayEquals(new double[] {Double.NaN, Double.NaN, 0.0, 0.0}, doubleArray1, 0.01);
  }

  /**
  //Test case number: 6
  /*Coverage entropy=0.3333333333333333
  */
  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      weka.core.matrix.Matrix matrix0 = weka.core.matrix.Matrix.random(11, 11);
      double[] doubleArray0 = new double[2];
      doubleArray0[0] = (double) 11;
      doubleArray0[1] = 1.0000000000000036;
      boolean[] booleanArray0 = new boolean[2];
      booleanArray0[1] = true;
      double[] doubleArray1 = Optimization.solveTriangle(matrix0, doubleArray0, false, booleanArray0);
      assertNotSame(doubleArray0, doubleArray1);
  }

  /**
  //Test case number: 7
  /*Coverage entropy=0.3333333333333333
  */
  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      double[] doubleArray0 = new double[0];
      double[] doubleArray1 = Optimization.solveTriangle((weka.core.matrix.Matrix) null, doubleArray0, false, (boolean[]) null);
      assertNotSame(doubleArray0, doubleArray1);
  }

  /**
  //Test case number: 8
  /*Coverage entropy=0.3333333333333333
  */
  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      weka.core.matrix.Matrix matrix0 = new weka.core.matrix.Matrix(11, 11);
      double[] doubleArray0 = new double[2];
      double[] doubleArray1 = Optimization.solveTriangle(matrix0, doubleArray0, true, (boolean[]) null);
      assertArrayEquals(new double[] {Double.NaN, Double.NaN}, doubleArray1, 0.01);
      assertArrayEquals(new double[] {0.0, 0.0}, doubleArray0, 0.01);
  }

  /**
  //Test case number: 9
  /*Coverage entropy=0.3333333333333333
  */
  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      weka.core.matrix.Matrix matrix0 = new weka.core.matrix.Matrix(13, 13);
      double[] doubleArray0 = new double[1];
      double[] doubleArray1 = Optimization.solveTriangle(matrix0, doubleArray0, true, (boolean[]) null);
      assertArrayEquals(new double[] {Double.NaN}, doubleArray1, 0.01);
      assertArrayEquals(new double[] {0.0}, doubleArray0, 0.01);
  }

  /**
  //Test case number: 10
  /*Coverage entropy=0.3333333333333333
  */
  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      weka.core.matrix.Matrix matrix0 = weka.core.matrix.Matrix.random(3, 3);
      double[] doubleArray0 = new double[11];
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
  //Test case number: 11
  /*Coverage entropy=1.847832822658352
  */
  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Optimization optimization0 = mock(Optimization.class, CALLS_REAL_METHODS);
      int int0 = 1049;
      Optimization.DynamicIntArray optimization_DynamicIntArray0 = optimization0.new DynamicIntArray(1049);
      optimization_DynamicIntArray0.addElement((-129));
      optimization_DynamicIntArray0.removeAllElements();
      optimization_DynamicIntArray0.getRevision();
      optimization_DynamicIntArray0.addElement((-129));
      int int1 = 0;
      optimization_DynamicIntArray0.elementAt(0);
      try { 
        weka.core.matrix.Matrix.parseMatlab("3;wyN;1t");
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
      }
  }

  /**
  //Test case number: 12
  /*Coverage entropy=1.8529610277865571
  */
  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Optimization optimization0 = mock(Optimization.class, CALLS_REAL_METHODS);
      Optimization.DynamicIntArray optimization_DynamicIntArray0 = optimization0.new DynamicIntArray(1939);
      optimization_DynamicIntArray0.removeAllElements();
      optimization_DynamicIntArray0.addElement(1939);
      optimization_DynamicIntArray0.addElement(4321);
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
  //Test case number: 13
  /*Coverage entropy=1.1375916250043898
  */
  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Optimization optimization0 = mock(Optimization.class, CALLS_REAL_METHODS);
      Optimization.DynamicIntArray optimization_DynamicIntArray0 = optimization0.new DynamicIntArray(0);
      optimization_DynamicIntArray0.addElement((-697));
      optimization_DynamicIntArray0.addElement(0);
      optimization_DynamicIntArray0.removeElementAt(0);
      // Undeclared exception!
      try { 
        weka.core.matrix.Matrix.random(0, (-1));
        fail("Expecting exception: NegativeArraySizeException");
      
      } catch(NegativeArraySizeException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("weka.core.matrix.Matrix", e);
      }
  }

  /**
  //Test case number: 14
  /*Coverage entropy=0.3333333333333333
  */
  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      weka.core.matrix.Matrix matrix0 = new weka.core.matrix.Matrix(11, 11);
      double[] doubleArray0 = new double[1];
      double[] doubleArray1 = Optimization.solveTriangle(matrix0, doubleArray0, false, (boolean[]) null);
      assertNotSame(doubleArray0, doubleArray1);
  }

  /**
  //Test case number: 15
  /*Coverage entropy=0.3333333333333333
  */
  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      double[] doubleArray0 = new double[1];
      // Undeclared exception!
      try { 
        Optimization.solveTriangle((weka.core.matrix.Matrix) null, doubleArray0, true, (boolean[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("weka.core.Optimization", e);
      }
  }

  /**
  //Test case number: 16
  /*Coverage entropy=0.3333333333333333
  */
  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      weka.core.matrix.Matrix matrix0 = new weka.core.matrix.Matrix(16, 16);
      double[] doubleArray0 = new double[6];
      doubleArray0[0] = (double) 16;
      boolean[] booleanArray0 = new boolean[1];
      booleanArray0[0] = true;
      // Undeclared exception!
      try { 
        Optimization.solveTriangle(matrix0, doubleArray0, true, booleanArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 1
         //
         verifyException("weka.core.Optimization", e);
      }
  }

  /**
  //Test case number: 17
  /*Coverage entropy=0.3333333333333333
  */
  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      double[] doubleArray0 = new double[0];
      double[] doubleArray1 = Optimization.solveTriangle((weka.core.matrix.Matrix) null, doubleArray0, true, (boolean[]) null);
      assertNotSame(doubleArray0, doubleArray1);
  }

  /**
  //Test case number: 18
  /*Coverage entropy=0.9273298944843114
  */
  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Optimization optimization0 = mock(Optimization.class, CALLS_REAL_METHODS);
      Optimization.DynamicIntArray optimization_DynamicIntArray0 = optimization0.new DynamicIntArray(0);
      optimization_DynamicIntArray0.removeAllElements();
      optimization_DynamicIntArray0.addElement(0);
      boolean boolean0 = Optimization.m_Debug;
      int int0 = 10;
      int int1 = 40;
      weka.core.matrix.Matrix matrix0 = weka.core.matrix.Matrix.random(10, 40);
      matrix0.rank();
      int int2 = (-2714);
      int int3 = (-1);
      int int4 = (-2605);
      double[][] doubleArray0 = new double[6][0];
      double[] doubleArray1 = new double[0];
      doubleArray0[0] = doubleArray1;
      double[] doubleArray2 = new double[9];
      doubleArray2[0] = (double) 0;
      doubleArray2[1] = (double) (-1);
      doubleArray2[2] = (double) 10;
      doubleArray2[3] = (double) 10;
      doubleArray2[4] = (double) (-1);
      doubleArray2[5] = (double) (-2605);
      doubleArray2[6] = 2080.11;
      doubleArray2[7] = (double) 0;
      doubleArray2[8] = (double) 1;
      doubleArray0[1] = doubleArray2;
      double[] doubleArray3 = new double[4];
      doubleArray3[0] = (double) (-1);
      doubleArray3[1] = (double) (-1);
      doubleArray3[2] = (double) 1;
      doubleArray3[3] = (double) (-1);
      doubleArray0[2] = doubleArray3;
      double[] doubleArray4 = new double[6];
      doubleArray4[0] = (double) (-2714);
      doubleArray4[1] = (double) 0;
      doubleArray4[2] = (double) (-2605);
      doubleArray4[3] = (double) (-2714);
      doubleArray4[4] = (double) (-2714);
      doubleArray4[5] = (double) (-2605);
      doubleArray0[3] = doubleArray4;
      double[] doubleArray5 = new double[5];
      doubleArray5[0] = (double) (-1);
      doubleArray5[1] = (double) 1;
      doubleArray5[2] = (double) (-2714);
      doubleArray5[3] = Double.POSITIVE_INFINITY;
      doubleArray5[4] = (double) 1;
      doubleArray0[4] = doubleArray5;
      double[] doubleArray6 = new double[8];
      doubleArray6[0] = (double) (-1);
      doubleArray6[1] = (double) (-2714);
      doubleArray6[2] = 2080.11;
      doubleArray6[3] = (double) (-2714);
      doubleArray6[4] = (double) (-1);
      doubleArray6[5] = 1.0000000149011612;
      doubleArray6[6] = 2080.11;
      doubleArray6[7] = (double) 0;
      doubleArray0[5] = doubleArray6;
      weka.core.matrix.Matrix matrix1 = null;
      try {
        matrix1 = new weka.core.matrix.Matrix(doubleArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // All rows must have the same length.
         //
         verifyException("weka.core.matrix.Matrix", e);
      }
  }

  /**
  //Test case number: 19
  /*Coverage entropy=1.1217186091313738
  */
  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Optimization optimization0 = mock(Optimization.class, CALLS_REAL_METHODS);
      Optimization.DynamicIntArray optimization_DynamicIntArray0 = optimization0.new DynamicIntArray(0);
      assertEquals(0, optimization_DynamicIntArray0.size());
      
      Optimization.DynamicIntArray optimization_DynamicIntArray1 = (Optimization.DynamicIntArray)optimization_DynamicIntArray0.copy();
      assertEquals(0, optimization_DynamicIntArray1.size());
      assertNotSame(optimization_DynamicIntArray1, optimization_DynamicIntArray0);
  }
}
