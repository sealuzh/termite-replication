/*
 * This file was automatically generated by EvoSuite
 * Thu Dec 05 01:42:22 GMT 2019
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
  /*Coverage entropy=0.3333333333333333
  */
  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      double[] doubleArray0 = new double[2];
      weka.core.matrix.Matrix matrix0 = new weka.core.matrix.Matrix(32, 32);
      boolean[] booleanArray0 = new boolean[2];
      booleanArray0[0] = false;
      booleanArray0[1] = true;
      double[] doubleArray1 = Optimization.solveTriangle(matrix0, doubleArray0, false, booleanArray0);
      assertArrayEquals(new double[] {Double.NaN, 0.0}, doubleArray1, 0.01);
  }

  /**
  //Test case number: 1
  /*Coverage entropy=0.3333333333333333
  */
  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      double[][] doubleArray0 = new double[8][2];
      weka.core.matrix.Matrix matrix0 = new weka.core.matrix.Matrix(doubleArray0, (-107), 2);
      double[] doubleArray1 = new double[2];
      doubleArray1[0] = (double) (-107);
      doubleArray1[1] = 2766.71223;
      boolean[] booleanArray0 = new boolean[5];
      booleanArray0[0] = true;
      booleanArray0[1] = false;
      double[] doubleArray2 = Optimization.solveTriangle(matrix0, doubleArray1, false, booleanArray0);
      assertArrayEquals(new double[] {0.0, Double.POSITIVE_INFINITY}, doubleArray2, 0.01);
  }

  /**
  //Test case number: 2
  /*Coverage entropy=0.3333333333333333
  */
  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      double[] doubleArray0 = new double[1];
      boolean[] booleanArray0 = new boolean[1];
      // Undeclared exception!
      try { 
        Optimization.solveTriangle((weka.core.matrix.Matrix) null, doubleArray0, false, booleanArray0);
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
      double[] doubleArray0 = new double[0];
      double[] doubleArray1 = Optimization.solveTriangle((weka.core.matrix.Matrix) null, doubleArray0, false, (boolean[]) null);
      assertNotSame(doubleArray1, doubleArray0);
  }

  /**
  //Test case number: 4
  /*Coverage entropy=2.2306267181564126
  */
  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Optimization optimization0 = mock(Optimization.class, CALLS_REAL_METHODS);
      Optimization.DynamicIntArray optimization_DynamicIntArray0 = optimization0.new DynamicIntArray(0);
      optimization_DynamicIntArray0.addElement(0);
      optimization_DynamicIntArray0.addElement(0);
      optimization_DynamicIntArray0.addElement(0);
      optimization_DynamicIntArray0.removeElementAt(0);
      optimization_DynamicIntArray0.copy();
      optimization_DynamicIntArray0.getRevision();
      optimization_DynamicIntArray0.getRevision();
      optimization_DynamicIntArray0.copy();
      optimization_DynamicIntArray0.removeAllElements();
      optimization_DynamicIntArray0.addElement(2);
      optimization_DynamicIntArray0.removeAllElements();
      double[][] doubleArray0 = new double[1][8];
      weka.core.matrix.Matrix matrix0 = new weka.core.matrix.Matrix(doubleArray0, 2, 5);
      double[] doubleArray1 = new double[0];
      boolean[] booleanArray0 = new boolean[0];
  }

  /**
  //Test case number: 5
  /*Coverage entropy=0.3333333333333333
  */
  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      double[] doubleArray0 = new double[1];
      boolean[] booleanArray0 = new boolean[0];
      // Undeclared exception!
      try { 
        Optimization.solveTriangle((weka.core.matrix.Matrix) null, doubleArray0, false, booleanArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 0
         //
         verifyException("weka.core.Optimization", e);
      }
  }

  /**
  //Test case number: 6
  /*Coverage entropy=0.3333333333333333
  */
  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      weka.core.matrix.Matrix matrix0 = new weka.core.matrix.Matrix(186, 186);
      double[] doubleArray0 = new double[6];
      doubleArray0[0] = 1.0000001192092896;
      doubleArray0[1] = (double) 186;
      doubleArray0[4] = (double) 21;
      doubleArray0[3] = (double) 186;
      doubleArray0[4] = 2363.3193112013;
      doubleArray0[5] = (double) 21;
      boolean[] booleanArray0 = new boolean[3];
      booleanArray0[0] = false;
      booleanArray0[1] = true;
      booleanArray0[2] = true;
      // Undeclared exception!
      try { 
        Optimization.solveTriangle(matrix0, doubleArray0, true, booleanArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 3
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
      double[] doubleArray0 = new double[2];
      weka.core.matrix.Matrix matrix0 = weka.core.matrix.Matrix.random(62, 62);
      double[] doubleArray1 = Optimization.solveTriangle(matrix0, doubleArray0, true, (boolean[]) null);
      assertArrayEquals(new double[] {Double.NaN, Double.NaN}, doubleArray1, 0.01);
      assertArrayEquals(new double[] {0.0, 0.0}, doubleArray0, 0.01);
  }

  /**
  //Test case number: 8
  /*Coverage entropy=0.3333333333333333
  */
  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      weka.core.matrix.Matrix matrix0 = new weka.core.matrix.Matrix(31, 31, 31);
      double[] doubleArray0 = new double[1];
      doubleArray0[0] = (double) 31;
      double[] doubleArray1 = Optimization.solveTriangle(matrix0, doubleArray0, true, (boolean[]) null);
      assertArrayEquals(new double[] {1.0}, doubleArray1, 0.01);
      assertArrayEquals(new double[] {31.0}, doubleArray0, 0.01);
  }

  /**
  //Test case number: 9
  /*Coverage entropy=2.2774737549423403
  */
  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Optimization optimization0 = mock(Optimization.class, CALLS_REAL_METHODS);
      Optimization.DynamicIntArray optimization_DynamicIntArray0 = optimization0.new DynamicIntArray(3);
      optimization_DynamicIntArray0.getRevision();
      optimization_DynamicIntArray0.copy();
      optimization_DynamicIntArray0.addElement((-1642));
      optimization_DynamicIntArray0.removeAllElements();
      optimization_DynamicIntArray0.addElement((-1642));
      optimization_DynamicIntArray0.getRevision();
      optimization_DynamicIntArray0.copy();
      optimization_DynamicIntArray0.removeAllElements();
      optimization_DynamicIntArray0.addElement((-1642));
      optimization_DynamicIntArray0.copy();
      optimization_DynamicIntArray0.copy();
      optimization_DynamicIntArray0.elementAt(0);
      boolean[] booleanArray0 = new boolean[5];
      booleanArray0[0] = true;
      booleanArray0[1] = true;
      booleanArray0[2] = true;
      booleanArray0[3] = true;
      booleanArray0[4] = true;
  }

  /**
  //Test case number: 10
  /*Coverage entropy=1.5652789553347763
  */
  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Optimization optimization0 = mock(Optimization.class, CALLS_REAL_METHODS);
      Optimization.DynamicIntArray optimization_DynamicIntArray0 = optimization0.new DynamicIntArray(1939);
      optimization_DynamicIntArray0.removeAllElements();
      optimization_DynamicIntArray0.addElement(1939);
      optimization_DynamicIntArray0.addElement(4321);
      assertEquals(2, optimization_DynamicIntArray0.size());
      
      optimization_DynamicIntArray0.removeAllElements();
      optimization_DynamicIntArray0.removeAllElements();
      int int0 = optimization_DynamicIntArray0.size();
      assertEquals(0, int0);
  }

  /**
  //Test case number: 11
  /*Coverage entropy=0.3333333333333333
  */
  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      double[] doubleArray0 = new double[2];
      weka.core.matrix.Matrix matrix0 = new weka.core.matrix.Matrix(58, 58);
      double[] doubleArray1 = Optimization.solveTriangle(matrix0, doubleArray0, false, (boolean[]) null);
      assertArrayEquals(new double[] {Double.NaN, Double.NaN}, doubleArray1, 0.01);
  }

  /**
  //Test case number: 12
  /*Coverage entropy=0.3333333333333333
  */
  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      double[] doubleArray0 = new double[1];
      boolean[] booleanArray0 = new boolean[1];
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
  //Test case number: 13
  /*Coverage entropy=0.3333333333333333
  */
  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      double[] doubleArray0 = new double[1];
      boolean[] booleanArray0 = new boolean[1];
      booleanArray0[0] = true;
      double[] doubleArray1 = Optimization.solveTriangle((weka.core.matrix.Matrix) null, doubleArray0, true, booleanArray0);
      assertArrayEquals(new double[] {0.0}, doubleArray1, 0.01);
  }

  /**
  //Test case number: 14
  /*Coverage entropy=0.3333333333333333
  */
  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      double[] doubleArray0 = new double[5];
      boolean[] booleanArray0 = new boolean[0];
      // Undeclared exception!
      try { 
        Optimization.solveTriangle((weka.core.matrix.Matrix) null, doubleArray0, true, booleanArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 0
         //
         verifyException("weka.core.Optimization", e);
      }
  }

  /**
  //Test case number: 15
  /*Coverage entropy=0.3333333333333333
  */
  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      double[] doubleArray0 = new double[0];
      boolean[] booleanArray0 = new boolean[4];
      double[] doubleArray1 = Optimization.solveTriangle((weka.core.matrix.Matrix) null, doubleArray0, true, booleanArray0);
      assertNotSame(doubleArray1, doubleArray0);
  }

  /**
  //Test case number: 16
  /*Coverage entropy=0.3333333333333333
  */
  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      double[] doubleArray0 = new double[0];
      boolean[] booleanArray0 = new boolean[3];
      double[] doubleArray1 = Optimization.solveTriangle((weka.core.matrix.Matrix) null, doubleArray0, false, booleanArray0);
      assertNotSame(doubleArray0, doubleArray1);
  }

  /**
  //Test case number: 17
  /*Coverage entropy=1.0931471805599453
  */
  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Optimization optimization0 = mock(Optimization.class, CALLS_REAL_METHODS);
      Optimization.DynamicIntArray optimization_DynamicIntArray0 = optimization0.new DynamicIntArray(1181);
      // Undeclared exception!
      try { 
        optimization_DynamicIntArray0.removeElementAt(1181);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
      }
  }
}
