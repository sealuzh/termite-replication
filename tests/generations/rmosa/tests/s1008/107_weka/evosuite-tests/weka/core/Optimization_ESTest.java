/*
 * This file was automatically generated by EvoSuite
 * Sun Nov 08 12:41:13 GMT 2020
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
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Optimization optimization0 = mock(Optimization.class, CALLS_REAL_METHODS);
      Optimization.DynamicIntArray optimization_DynamicIntArray0 = optimization0.new DynamicIntArray(14);
      optimization_DynamicIntArray0.addElement(821);
      optimization_DynamicIntArray0.addElement(14);
      optimization_DynamicIntArray0.removeElementAt(0);
      assertEquals(1, optimization_DynamicIntArray0.size());
  }

  /**
  //Test case number: 1
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Optimization optimization0 = mock(Optimization.class, CALLS_REAL_METHODS);
      Optimization.DynamicIntArray optimization_DynamicIntArray0 = optimization0.new DynamicIntArray(14);
      // Undeclared exception!
      try { 
        optimization_DynamicIntArray0.removeElementAt(14);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
      }
  }

  /**
  //Test case number: 2
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      weka.core.matrix.Matrix matrix0 = weka.core.matrix.Matrix.identity(27, 27);
      double[] doubleArray0 = new double[1];
      doubleArray0[0] = (double) 27;
      double[] doubleArray1 = Optimization.solveTriangle(matrix0, doubleArray0, true, (boolean[]) null);
      assertArrayEquals(new double[] {27.0}, doubleArray1, 0.01);
  }

  /**
  //Test case number: 3
  /*Coverage entropy=0.6365141682948128
  */
  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Optimization optimization0 = mock(Optimization.class, CALLS_REAL_METHODS);
      Optimization.DynamicIntArray optimization_DynamicIntArray0 = optimization0.new DynamicIntArray(0);
      optimization_DynamicIntArray0.addElement(200);
      optimization_DynamicIntArray0.addElement(0);
      optimization_DynamicIntArray0.addElement(0);
      assertEquals(3, optimization_DynamicIntArray0.size());
  }

  /**
  //Test case number: 4
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      double[] doubleArray0 = new double[2];
      weka.core.matrix.Matrix matrix0 = new weka.core.matrix.Matrix(3, 3);
      double[] doubleArray1 = Optimization.solveTriangle(matrix0, doubleArray0, false, (boolean[]) null);
      assertFalse(doubleArray1.equals((Object)doubleArray0));
  }

  /**
  //Test case number: 5
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      weka.core.matrix.Matrix matrix0 = new weka.core.matrix.Matrix(24, 5);
      double[] doubleArray0 = new double[2];
      boolean[] booleanArray0 = new boolean[5];
      booleanArray0[0] = true;
      double[] doubleArray1 = Optimization.solveTriangle(matrix0, doubleArray0, false, booleanArray0);
      assertNotSame(doubleArray0, doubleArray1);
  }

  /**
  //Test case number: 6
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      double[] doubleArray0 = new double[1];
      boolean[] booleanArray0 = new boolean[5];
      booleanArray0[0] = true;
      double[] doubleArray1 = Optimization.solveTriangle((weka.core.matrix.Matrix) null, doubleArray0, false, booleanArray0);
      assertEquals(1, doubleArray1.length);
  }

  /**
  //Test case number: 7
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      double[] doubleArray0 = new double[15];
      weka.core.matrix.Matrix matrix0 = new weka.core.matrix.Matrix(27, 27, 27);
      boolean[] booleanArray0 = new boolean[5];
      booleanArray0[3] = true;
      // Undeclared exception!
      try { 
        Optimization.solveTriangle(matrix0, doubleArray0, true, booleanArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 5
         //
         verifyException("weka.core.Optimization", e);
      }
  }

  /**
  //Test case number: 8
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      double[] doubleArray0 = new double[10];
      weka.core.matrix.Matrix matrix0 = new weka.core.matrix.Matrix(2620, 2620);
      double[] doubleArray1 = Optimization.solveTriangle(matrix0, doubleArray0, true, (boolean[]) null);
      assertArrayEquals(new double[] {Double.NaN, Double.NaN, Double.NaN, Double.NaN, Double.NaN, Double.NaN, Double.NaN, Double.NaN, Double.NaN, Double.NaN}, doubleArray1, 0.01);
      assertArrayEquals(new double[] {0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0}, doubleArray0, 0.01);
  }

  /**
  //Test case number: 9
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      double[] doubleArray0 = new double[1];
      boolean[] booleanArray0 = new boolean[5];
      booleanArray0[0] = true;
      double[] doubleArray1 = Optimization.solveTriangle((weka.core.matrix.Matrix) null, doubleArray0, true, booleanArray0);
      assertArrayEquals(new double[] {0.0}, doubleArray1, 0.01);
  }

  /**
  //Test case number: 10
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
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
  //Test case number: 11
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      double[] doubleArray0 = new double[0];
      double[] doubleArray1 = Optimization.solveTriangle((weka.core.matrix.Matrix) null, doubleArray0, true, (boolean[]) null);
      assertEquals(0, doubleArray1.length);
  }

  /**
  //Test case number: 12
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Optimization optimization0 = mock(Optimization.class, CALLS_REAL_METHODS);
      Optimization.DynamicIntArray optimization_DynamicIntArray0 = optimization0.new DynamicIntArray(503);
      Optimization.DynamicIntArray optimization_DynamicIntArray1 = (Optimization.DynamicIntArray)optimization_DynamicIntArray0.copy();
      assertNotSame(optimization_DynamicIntArray1, optimization_DynamicIntArray0);
      assertEquals(0, optimization_DynamicIntArray1.size());
  }

  /**
  //Test case number: 13
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Optimization optimization0 = mock(Optimization.class, CALLS_REAL_METHODS);
      Optimization.DynamicIntArray optimization_DynamicIntArray0 = optimization0.new DynamicIntArray(503);
      String string0 = optimization_DynamicIntArray0.getRevision();
      assertEquals("8076", string0);
      assertEquals(0, optimization_DynamicIntArray0.size());
  }

  /**
  //Test case number: 14
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Optimization optimization0 = mock(Optimization.class, CALLS_REAL_METHODS);
      Optimization.DynamicIntArray optimization_DynamicIntArray0 = optimization0.new DynamicIntArray(0);
      int int0 = optimization_DynamicIntArray0.size();
      assertEquals(0, int0);
  }

  /**
  //Test case number: 15
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Optimization optimization0 = mock(Optimization.class, CALLS_REAL_METHODS);
      Optimization.DynamicIntArray optimization_DynamicIntArray0 = optimization0.new DynamicIntArray(503);
      optimization_DynamicIntArray0.elementAt(0);
      assertEquals(0, optimization_DynamicIntArray0.size());
  }

  /**
  //Test case number: 16
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Optimization optimization0 = mock(Optimization.class, CALLS_REAL_METHODS);
      Optimization.DynamicIntArray optimization_DynamicIntArray0 = optimization0.new DynamicIntArray(503);
      optimization_DynamicIntArray0.removeAllElements();
      assertEquals(0, optimization_DynamicIntArray0.size());
  }
}
