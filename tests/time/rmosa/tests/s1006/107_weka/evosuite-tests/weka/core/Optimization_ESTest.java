/*
 * This file was automatically generated by EvoSuite
 * Thu Dec 05 20:37:28 GMT 2019
 */

package weka.core;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
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
      weka.core.matrix.Matrix matrix0 = new weka.core.matrix.Matrix(285, 285);
      double[] doubleArray0 = new double[3];
      doubleArray0[0] = (double) 285;
      boolean[] booleanArray0 = new boolean[8];
      booleanArray0[1] = true;
      booleanArray0[2] = true;
      booleanArray0[3] = true;
      double[] doubleArray1 = Optimization.solveTriangle(matrix0, doubleArray0, true, booleanArray0);
      assertArrayEquals(new double[] {285.0, 0.0, 0.0}, doubleArray0, 0.01);
      assertArrayEquals(new double[] {Double.POSITIVE_INFINITY, 0.0, 0.0}, doubleArray1, 0.01);
  }

  /**
  //Test case number: 1
  /*Coverage entropy=1.1546856420984069
  */
  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Optimization optimization0 = mock(Optimization.class, CALLS_REAL_METHODS);
      Optimization.DynamicIntArray optimization_DynamicIntArray0 = optimization0.new DynamicIntArray(0);
      FileSystemHandling.appendStringToFile((EvoSuiteFile) null, "");
      optimization_DynamicIntArray0.addElement(839);
      optimization_DynamicIntArray0.addElement(1);
      optimization_DynamicIntArray0.removeElementAt(0);
      optimization_DynamicIntArray0.addElement(1430);
      assertEquals(2, optimization_DynamicIntArray0.size());
      
      optimization_DynamicIntArray0.removeElementAt(0);
      assertEquals(1, optimization_DynamicIntArray0.size());
  }

  /**
  //Test case number: 2
  /*Coverage entropy=0.3333333333333333
  */
  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      weka.core.matrix.Matrix matrix0 = new weka.core.matrix.Matrix(710, 0, 0);
      double[] doubleArray0 = new double[2];
      boolean[] booleanArray0 = new boolean[5];
      booleanArray0[0] = true;
      booleanArray0[1] = true;
      double[] doubleArray1 = Optimization.solveTriangle(matrix0, doubleArray0, false, booleanArray0);
      assertNotSame(doubleArray0, doubleArray1);
  }

  /**
  //Test case number: 3
  /*Coverage entropy=0.3333333333333333
  */
  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      weka.core.matrix.Matrix matrix0 = new weka.core.matrix.Matrix(265, 265);
      double[] doubleArray0 = new double[4];
      doubleArray0[0] = (double) 265;
      boolean[] booleanArray0 = new boolean[9];
      booleanArray0[0] = true;
      booleanArray0[1] = true;
      booleanArray0[2] = true;
      booleanArray0[4] = false;
      booleanArray0[5] = false;
      Optimization.solveTriangle(matrix0, doubleArray0, false, booleanArray0);
      // Undeclared exception!
      matrix0.sqrt();
  }

  /**
  //Test case number: 4
  /*Coverage entropy=0.3333333333333333
  */
  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      weka.core.matrix.Matrix matrix0 = new weka.core.matrix.Matrix(400, 400);
      double[] doubleArray0 = new double[0];
      boolean[] booleanArray0 = new boolean[0];
      double[] doubleArray1 = Optimization.solveTriangle(matrix0, doubleArray0, false, booleanArray0);
      assertFalse(doubleArray1.equals((Object)doubleArray0));
  }

  /**
  //Test case number: 5
  /*Coverage entropy=0.3333333333333333
  */
  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Optimization optimization0 = mock(Optimization.class, CALLS_REAL_METHODS);
      double[] doubleArray0 = new double[10];
      weka.core.matrix.Matrix matrix0 = weka.core.matrix.Matrix.random(2, 2);
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
  //Test case number: 6
  /*Coverage entropy=0.3333333333333333
  */
  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Optimization optimization0 = mock(Optimization.class, CALLS_REAL_METHODS);
      double[] doubleArray0 = new double[10];
      doubleArray0[0] = 1.0000000000000004;
      doubleArray0[2] = 1.0000000000000004;
      doubleArray0[3] = 1.0000000000000004;
      doubleArray0[4] = 1.0000000000000004;
      weka.core.matrix.Matrix matrix0 = new weka.core.matrix.Matrix(doubleArray0, 2);
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
  //Test case number: 7
  /*Coverage entropy=0.3333333333333333
  */
  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      weka.core.matrix.Matrix matrix0 = new weka.core.matrix.Matrix(1475, 1475);
      double[] doubleArray0 = new double[11];
      double[] doubleArray1 = Optimization.solveTriangle(matrix0, doubleArray0, true, (boolean[]) null);
      assertNotSame(doubleArray0, doubleArray1);
  }

  /**
  //Test case number: 8
  /*Coverage entropy=0.3333333333333333
  */
  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      weka.core.matrix.Matrix matrix0 = new weka.core.matrix.Matrix(1460, 1460);
      double[] doubleArray0 = new double[1];
      doubleArray0[0] = (double) 1460;
      boolean[] booleanArray0 = new boolean[1];
      booleanArray0[0] = true;
      double[] doubleArray1 = Optimization.solveTriangle(matrix0, doubleArray0, true, booleanArray0);
      assertArrayEquals(new double[] {0.0}, doubleArray1, 0.01);
      assertArrayEquals(new double[] {1460.0}, doubleArray0, 0.01);
  }

  /**
  //Test case number: 9
  /*Coverage entropy=0.3333333333333333
  */
  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      weka.core.matrix.Matrix matrix0 = new weka.core.matrix.Matrix(1475, 1475);
      // Undeclared exception!
      try { 
        Optimization.solveTriangle(matrix0, (double[]) null, false, (boolean[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("weka.core.Optimization", e);
      }
  }

  /**
  //Test case number: 10
  /*Coverage entropy=0.3333333333333333
  */
  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      weka.core.matrix.Matrix matrix0 = new weka.core.matrix.Matrix(1475, 1475);
      double[] doubleArray0 = new double[1];
      double[] doubleArray1 = Optimization.solveTriangle(matrix0, doubleArray0, true, (boolean[]) null);
      assertArrayEquals(new double[] {Double.NaN}, doubleArray1, 0.01);
  }

  /**
  //Test case number: 11
  /*Coverage entropy=0.4444444444444445
  */
  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Optimization optimization0 = mock(Optimization.class, CALLS_REAL_METHODS);
      Optimization.DynamicIntArray optimization_DynamicIntArray0 = optimization0.new DynamicIntArray(0);
      optimization_DynamicIntArray0.addElement((-5033));
      optimization_DynamicIntArray0.addElement(31);
      optimization_DynamicIntArray0.addElement(3677);
      boolean[] booleanArray0 = null;
      double[] doubleArray0 = null;
      weka.core.matrix.Matrix matrix0 = null;
      try {
        matrix0 = new weka.core.matrix.Matrix(710, (-2002));
        fail("Expecting exception: NegativeArraySizeException");
      
      } catch(NegativeArraySizeException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("weka.core.matrix.Matrix", e);
      }
  }

  /**
  //Test case number: 12
  /*Coverage entropy=1.0931471805599453
  */
  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Optimization optimization0 = mock(Optimization.class, CALLS_REAL_METHODS);
      Optimization.DynamicIntArray optimization_DynamicIntArray0 = optimization0.new DynamicIntArray(200);
      FileSystemHandling.appendLineToFile((EvoSuiteFile) null, "v8mE-?t_&GcBM");
      int int0 = optimization_DynamicIntArray0.size();
      assertEquals(0, int0);
  }

  /**
  //Test case number: 13
  /*Coverage entropy=1.856882596414008
  */
  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Optimization optimization0 = mock(Optimization.class, CALLS_REAL_METHODS);
      Optimization.DynamicIntArray optimization_DynamicIntArray0 = optimization0.new DynamicIntArray(771);
      optimization_DynamicIntArray0.removeAllElements();
      optimization_DynamicIntArray0.getRevision();
      optimization_DynamicIntArray0.addElement((-293));
      optimization_DynamicIntArray0.getRevision();
      optimization_DynamicIntArray0.addElement((-293));
      optimization_DynamicIntArray0.elementAt(17);
      assertEquals(2, optimization_DynamicIntArray0.size());
      
      optimization_DynamicIntArray0.removeAllElements();
      assertEquals(0, optimization_DynamicIntArray0.size());
  }

  /**
  //Test case number: 14
  /*Coverage entropy=1.543056733112554
  */
  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Optimization optimization0 = mock(Optimization.class, CALLS_REAL_METHODS);
      Optimization.DynamicIntArray optimization_DynamicIntArray0 = optimization0.new DynamicIntArray(0);
      optimization_DynamicIntArray0.copy();
      // Undeclared exception!
      try { 
        optimization_DynamicIntArray0.elementAt((-1774));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -1774
         //
         verifyException("weka.core.Optimization$DynamicIntArray", e);
      }
  }

  /**
  //Test case number: 15
  /*Coverage entropy=0.3333333333333333
  */
  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Optimization optimization0 = mock(Optimization.class, CALLS_REAL_METHODS);
      double[] doubleArray0 = new double[10];
      weka.core.matrix.Matrix matrix0 = new weka.core.matrix.Matrix(doubleArray0, 2);
      // Undeclared exception!
      try { 
        Optimization.solveTriangle(matrix0, doubleArray0, false, (boolean[]) null);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  /**
  //Test case number: 16
  /*Coverage entropy=0.3333333333333333
  */
  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      weka.core.matrix.Matrix matrix0 = new weka.core.matrix.Matrix(1460, 1460);
      double[] doubleArray0 = new double[2];
      boolean[] booleanArray0 = new boolean[3];
      double[] doubleArray1 = Optimization.solveTriangle(matrix0, doubleArray0, false, booleanArray0);
      assertArrayEquals(new double[] {Double.NaN, Double.NaN}, doubleArray1, 0.01);
  }

  /**
  //Test case number: 17
  /*Coverage entropy=0.3333333333333333
  */
  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      weka.core.matrix.Matrix matrix0 = new weka.core.matrix.Matrix(427, 427);
      double[] doubleArray0 = new double[0];
      boolean[] booleanArray0 = new boolean[0];
      double[] doubleArray1 = Optimization.solveTriangle(matrix0, doubleArray0, true, booleanArray0);
      assertNotSame(doubleArray0, doubleArray1);
  }

  /**
  //Test case number: 18
  /*Coverage entropy=1.0931471805599453
  */
  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Optimization optimization0 = mock(Optimization.class, CALLS_REAL_METHODS);
      Optimization.DynamicIntArray optimization_DynamicIntArray0 = optimization0.new DynamicIntArray(252);
      // Undeclared exception!
      try { 
        optimization_DynamicIntArray0.removeElementAt(252);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
      }
  }

  /**
  //Test case number: 19
  /*Coverage entropy=0.8350516730230504
  */
  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      weka.core.matrix.Matrix matrix0 = new weka.core.matrix.Matrix(285, 285);
      double[] doubleArray0 = new double[4];
      doubleArray0[0] = (double) 285;
      doubleArray0[1] = (double) 285;
      doubleArray0[2] = 1370.081785650308;
      doubleArray0[3] = 1370.081785650308;
      boolean[] booleanArray0 = new boolean[5];
      booleanArray0[0] = false;
      booleanArray0[1] = false;
      booleanArray0[2] = false;
      booleanArray0[3] = false;
      booleanArray0[0] = false;
      double[] doubleArray1 = Optimization.solveTriangle(matrix0, doubleArray0, false, booleanArray0);
      Optimization optimization0 = mock(Optimization.class, CALLS_REAL_METHODS);
      Optimization.DynamicIntArray optimization_DynamicIntArray0 = optimization0.new DynamicIntArray(285);
      optimization_DynamicIntArray0.addElement(9);
      assertEquals(1, optimization_DynamicIntArray0.size());
      
      optimization_DynamicIntArray0.removeAllElements();
      double[] doubleArray2 = Optimization.solveTriangle(matrix0, doubleArray1, true, booleanArray0);
      assertArrayEquals(new double[] {Double.NaN, Double.NaN, Double.NaN, Double.NaN}, doubleArray2, 0.01);
  }
}
