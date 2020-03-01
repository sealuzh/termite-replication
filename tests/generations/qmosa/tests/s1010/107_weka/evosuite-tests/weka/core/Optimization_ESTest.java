/*
 * This file was automatically generated by EvoSuite
 * Sat Nov 16 09:32:46 GMT 2019
 */

package weka.core;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.StringReader;
import java.nio.CharBuffer;
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
  /*Coverage entropy=1.1552944795792688
  */
  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      FileSystemHandling fileSystemHandling0 = new FileSystemHandling();
      int int0 = 2;
      double[][] doubleArray0 = new double[6][5];
      Optimization optimization0 = mock(Optimization.class, CALLS_REAL_METHODS);
      Optimization.DynamicIntArray optimization_DynamicIntArray0 = optimization0.new DynamicIntArray(14);
      optimization_DynamicIntArray0.addElement((-2938));
      weka.core.matrix.Matrix matrix0 = new weka.core.matrix.Matrix(doubleArray0, 14, (-1476));
      optimization_DynamicIntArray0.getRevision();
      double[] doubleArray1 = new double[2];
      doubleArray1[0] = (double) 14;
      doubleArray1[1] = (double) 2;
      boolean[] booleanArray0 = new boolean[9];
      booleanArray0[0] = true;
      booleanArray0[2] = true;
      booleanArray0[3] = false;
      booleanArray0[4] = true;
      booleanArray0[6] = true;
      booleanArray0[7] = false;
      booleanArray0[8] = true;
      Optimization.solveTriangle(matrix0, doubleArray1, false, booleanArray0);
      optimization_DynamicIntArray0.getRevision();
      Optimization.solveTriangle(matrix0, doubleArray1, true, booleanArray0);
      Optimization optimization1 = mock(Optimization.class, CALLS_REAL_METHODS);
      Optimization.DynamicIntArray optimization_DynamicIntArray1 = optimization1.new DynamicIntArray(14);
      optimization_DynamicIntArray1.addElement(0);
      // Undeclared exception!
      try { 
        optimization_DynamicIntArray1.removeElementAt((-2938));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
      }
  }

  /**
  //Test case number: 1
  /*Coverage entropy=1.7988457068767891
  */
  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      byte[] byteArray0 = new byte[3];
      FileSystemHandling.appendDataToFile((EvoSuiteFile) null, byteArray0);
      byteArray0[0] = (byte)0;
      FileSystemHandling.appendDataToFile((EvoSuiteFile) null, byteArray0);
      byteArray0[1] = (byte)65;
      byteArray0[2] = (byte) (-11);
      FileSystemHandling.appendDataToFile((EvoSuiteFile) null, byteArray0);
      FileSystemHandling.shouldThrowIOException((EvoSuiteFile) null);
      FileSystemHandling fileSystemHandling0 = new FileSystemHandling();
      Random.setNextRandom(2);
      Optimization optimization0 = mock(Optimization.class, CALLS_REAL_METHODS);
      Optimization.DynamicIntArray optimization_DynamicIntArray0 = optimization0.new DynamicIntArray(2);
      optimization_DynamicIntArray0.removeAllElements();
      optimization_DynamicIntArray0.removeAllElements();
      optimization_DynamicIntArray0.addElement(0);
      optimization_DynamicIntArray0.getRevision();
      optimization_DynamicIntArray0.addElement(2);
      optimization_DynamicIntArray0.addElement((-2593));
      assertEquals(3, optimization_DynamicIntArray0.size());
  }

  /**
  //Test case number: 2
  /*Coverage entropy=0.3333333333333333
  */
  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Random.setNextRandom(2);
      double[][] doubleArray0 = new double[6][5];
      double[] doubleArray1 = new double[8];
      doubleArray1[0] = (double) 2;
      doubleArray1[1] = (double) 2;
      doubleArray1[2] = (double) 2;
      doubleArray1[3] = (double) 2;
      doubleArray1[4] = (double) 2;
      doubleArray1[5] = (double) 2;
      doubleArray1[6] = (double) 2;
      doubleArray1[7] = (double) 2;
      doubleArray0[0] = doubleArray1;
      double[] doubleArray2 = new double[3];
      doubleArray2[0] = (double) 2;
      doubleArray2[2] = (double) 2;
      doubleArray0[1] = doubleArray2;
      double[] doubleArray3 = new double[5];
      doubleArray3[0] = 6.0;
      doubleArray3[1] = (double) 2;
      doubleArray3[1] = (double) 2;
      doubleArray3[4] = (double) 2;
      doubleArray0[2] = doubleArray3;
      double[] doubleArray4 = new double[9];
      doubleArray4[0] = 6.0;
      doubleArray4[1] = 1.0;
      doubleArray4[2] = 6.0;
      doubleArray4[3] = (double) 2;
      doubleArray4[4] = 6.0;
      doubleArray4[5] = (double) 2;
      doubleArray4[6] = 0.0;
      doubleArray4[7] = (double) 2;
      doubleArray4[8] = (double) 2;
      doubleArray0[3] = doubleArray4;
      double[] doubleArray5 = new double[7];
      doubleArray5[0] = (double) 2;
      doubleArray5[1] = (double) 2;
      doubleArray5[2] = 1.0000000298023224;
      doubleArray5[3] = (double) 2;
      doubleArray5[4] = (double) 2;
      doubleArray5[5] = 0.0;
      doubleArray5[6] = 0.0;
      doubleArray0[4] = doubleArray5;
      double[] doubleArray6 = new double[9];
      doubleArray6[0] = 1.0000000298023224;
      doubleArray6[1] = (double) 2;
      doubleArray6[2] = 0.0;
      doubleArray6[3] = (double) 2;
      doubleArray6[4] = (double) 2;
      doubleArray6[5] = 6.0;
      doubleArray6[6] = 0.0;
      doubleArray6[7] = 0.0;
      doubleArray6[8] = (double) 2;
      doubleArray0[4] = doubleArray6;
      weka.core.matrix.Matrix matrix0 = new weka.core.matrix.Matrix(doubleArray0, (-2226), (-1));
      boolean[] booleanArray0 = new boolean[5];
      booleanArray0[1] = true;
      booleanArray0[2] = true;
      booleanArray0[3] = true;
      double[] doubleArray7 = Optimization.solveTriangle(matrix0, doubleArray3, true, booleanArray0);
      assertArrayEquals(new double[] {3.0, 0.0, 0.0, 0.0, (-0.5000000447034836)}, doubleArray7, 0.01);
  }

  /**
  //Test case number: 3
  /*Coverage entropy=0.3333333333333333
  */
  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      double[] doubleArray0 = new double[1];
      doubleArray0[0] = 1772.6704276823907;
      double[][] doubleArray1 = new double[3][5];
      doubleArray1[0] = doubleArray0;
      int int0 = 2222;
      weka.core.matrix.Matrix matrix0 = new weka.core.matrix.Matrix(doubleArray1, 0, 2222);
      Optimization.solveTriangle(matrix0, doubleArray0, true, (boolean[]) null);
      StringReader stringReader0 = new StringReader(">Hq3>G");
      char[] charArray0 = new char[1];
      CharBuffer charBuffer0 = CharBuffer.allocate(102);
      stringReader0.read(charBuffer0);
      charArray0[0] = '_';
      // Undeclared exception!
      try { 
        CharBuffer.wrap(charArray0, 1678, 77);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.nio.CharBuffer", e);
      }
  }

  /**
  //Test case number: 4
  /*Coverage entropy=0.3333333333333333
  */
  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Random.setNextRandom(2);
      Random.setNextRandom(2);
      double[][] doubleArray0 = new double[6][5];
      double[] doubleArray1 = new double[8];
      doubleArray1[0] = (double) 2;
      doubleArray1[1] = (double) 2;
      doubleArray1[2] = (double) 2;
      doubleArray1[3] = (double) 2;
      doubleArray1[4] = (double) 2;
      doubleArray1[5] = (double) 2;
      doubleArray1[6] = (double) 2;
      doubleArray1[7] = (double) 2;
      doubleArray0[0] = doubleArray1;
      double[] doubleArray2 = new double[3];
      doubleArray2[0] = (double) 2;
      doubleArray2[1] = (double) 2;
      doubleArray2[2] = (double) 2;
      doubleArray0[1] = doubleArray2;
      double[] doubleArray3 = new double[5];
      doubleArray3[0] = 6.0;
      doubleArray3[1] = (double) 2;
      doubleArray3[2] = (double) 2;
      doubleArray3[3] = (double) 2;
      doubleArray3[4] = (double) 2;
      doubleArray0[2] = doubleArray3;
      double[] doubleArray4 = new double[9];
      doubleArray4[0] = 6.0;
      doubleArray4[1] = 1.0;
      doubleArray4[2] = 6.0;
      doubleArray4[3] = (double) 2;
      doubleArray4[4] = 6.0;
      doubleArray4[5] = (double) 2;
      doubleArray4[6] = 0.0;
      doubleArray4[7] = (double) 2;
      doubleArray4[8] = (double) 2;
      doubleArray0[3] = doubleArray4;
      double[] doubleArray5 = new double[7];
      doubleArray5[0] = (double) 2;
      doubleArray5[1] = (double) 2;
      doubleArray5[2] = 1.0000000298023224;
      doubleArray5[3] = (double) 2;
      doubleArray5[4] = (double) 2;
      doubleArray5[5] = 0.0;
      doubleArray5[6] = 0.0;
      doubleArray0[4] = doubleArray5;
      double[] doubleArray6 = new double[9];
      doubleArray6[0] = 1.0000000298023224;
      doubleArray6[1] = (double) 2;
      doubleArray6[2] = 0.0;
      doubleArray6[3] = (double) 2;
      doubleArray6[4] = (double) 2;
      doubleArray6[5] = 6.0;
      doubleArray6[6] = 0.0;
      doubleArray6[7] = 0.0;
      doubleArray6[8] = (double) 2;
      doubleArray0[5] = doubleArray6;
      weka.core.matrix.Matrix matrix0 = new weka.core.matrix.Matrix(doubleArray0, (-2226), (-1));
      boolean[] booleanArray0 = new boolean[5];
      booleanArray0[0] = false;
      booleanArray0[1] = false;
      booleanArray0[2] = false;
      booleanArray0[3] = false;
      booleanArray0[4] = false;
      double[] doubleArray7 = Optimization.solveTriangle(matrix0, doubleArray3, false, booleanArray0);
      assertArrayEquals(new double[] {1.0000000298023224, (-0.4999999850988388), 0.4999999850988388, 0.0, 1.0}, doubleArray7, 0.01);
  }

  /**
  //Test case number: 5
  /*Coverage entropy=0.3333333333333333
  */
  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      double[] doubleArray0 = new double[1];
      doubleArray0[0] = 1772.6704276823907;
      boolean[] booleanArray0 = new boolean[3];
      booleanArray0[0] = true;
      booleanArray0[1] = false;
      booleanArray0[2] = true;
      Optimization.solveTriangle((weka.core.matrix.Matrix) null, doubleArray0, false, booleanArray0);
      String string0 = "PRICE";
      String string1 = "V)ppXxG";
      StringReader stringReader0 = new StringReader("V)ppXxG");
      stringReader0.read();
      int int0 = 0;
      String string2 = "XM/w_,Q#z`q8";
      StringReader stringReader1 = new StringReader("XM/w_,Q#z`q8");
      char[] charArray0 = null;
      // Undeclared exception!
      try { 
        CharBuffer.wrap((char[]) null, 5, 1692);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.nio.HeapCharBuffer", e);
      }
  }

  /**
  //Test case number: 6
  /*Coverage entropy=0.3333333333333333
  */
  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      byte[] byteArray0 = new byte[3];
      byteArray0[0] = (byte) (-1);
      FileSystemHandling.appendStringToFile((EvoSuiteFile) null, "");
      byteArray0[1] = (byte) (-33);
      byteArray0[2] = (byte)39;
      FileSystemHandling.appendDataToFile((EvoSuiteFile) null, byteArray0);
      Random.setNextRandom(12);
      FileSystemHandling.appendDataToFile((EvoSuiteFile) null, byteArray0);
      Random.setNextRandom(12);
      double[] doubleArray0 = new double[7];
      doubleArray0[0] = (double) 12;
      doubleArray0[1] = (double) (byte) (-1);
      doubleArray0[2] = (double) (byte) (-33);
      doubleArray0[3] = (double) (byte) (-1);
      doubleArray0[4] = (double) (byte) (-33);
      doubleArray0[5] = (double) (byte) (-1);
      doubleArray0[6] = (double) (byte) (-33);
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
  //Test case number: 7
  /*Coverage entropy=2.2240585736572336
  */
  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Optimization optimization0 = mock(Optimization.class, CALLS_REAL_METHODS);
      int int0 = 0;
      Optimization.DynamicIntArray optimization_DynamicIntArray0 = optimization0.new DynamicIntArray(0);
      int int1 = 0;
      optimization_DynamicIntArray0.addElement((-2459));
      optimization_DynamicIntArray0.addElement(0);
      optimization_DynamicIntArray0.getRevision();
      optimization_DynamicIntArray0.copy();
      optimization_DynamicIntArray0.removeElementAt(0);
      optimization_DynamicIntArray0.getRevision();
      optimization_DynamicIntArray0.removeAllElements();
      // Undeclared exception!
      try { 
        optimization_DynamicIntArray0.removeElementAt(0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
      }
  }

  /**
  //Test case number: 8
  /*Coverage entropy=0.3333333333333333
  */
  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      int int0 = 0;
      double[][] doubleArray0 = new double[3][5];
      weka.core.matrix.Matrix matrix0 = new weka.core.matrix.Matrix(doubleArray0, 0, 0);
      // Undeclared exception!
      try { 
        Optimization.solveTriangle(matrix0, doubleArray0[0], true, (boolean[]) null);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  /**
  //Test case number: 9
  /*Coverage entropy=0.3333333333333333
  */
  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      double[] doubleArray0 = new double[1];
      doubleArray0[0] = 1772.6704276823907;
      double[][] doubleArray1 = new double[3][5];
      doubleArray1[0] = doubleArray0;
      weka.core.matrix.Matrix matrix0 = new weka.core.matrix.Matrix(doubleArray1, 0, 2222);
      Optimization.solveTriangle(matrix0, doubleArray0, false, (boolean[]) null);
      StringReader stringReader0 = new StringReader(">Hq3>G");
      char[] charArray0 = new char[1];
      char char0 = '_';
      int int0 = 102;
      // Undeclared exception!
      try { 
        CharBuffer.wrap(charArray0, 811, 102);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.nio.CharBuffer", e);
      }
  }

  /**
  //Test case number: 10
  /*Coverage entropy=0.3333333333333333
  */
  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      double[] doubleArray0 = new double[1];
      doubleArray0[0] = 1772.6704276823907;
      boolean[] booleanArray0 = new boolean[3];
      booleanArray0[0] = true;
      booleanArray0[1] = true;
      booleanArray0[2] = true;
      Optimization.solveTriangle((weka.core.matrix.Matrix) null, doubleArray0, true, booleanArray0);
      String string0 = "PRICE";
      StringReader stringReader0 = new StringReader("PRICE");
      stringReader0.read();
      StringReader stringReader1 = new StringReader("PRICE");
      // Undeclared exception!
      try { 
        CharBuffer.wrap((char[]) null, 80, 0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.nio.HeapCharBuffer", e);
      }
  }

  /**
  //Test case number: 11
  /*Coverage entropy=2.2654436797543704
  */
  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Optimization optimization0 = mock(Optimization.class, CALLS_REAL_METHODS);
      Optimization.DynamicIntArray optimization_DynamicIntArray0 = optimization0.new DynamicIntArray(0);
      optimization_DynamicIntArray0.getRevision();
      optimization_DynamicIntArray0.addElement(0);
      optimization_DynamicIntArray0.copy();
      optimization_DynamicIntArray0.removeElementAt(0);
      optimization_DynamicIntArray0.getRevision();
      optimization_DynamicIntArray0.getRevision();
      int int0 = optimization_DynamicIntArray0.size();
      assertEquals(0, int0);
  }

  /**
  //Test case number: 12
  /*Coverage entropy=2.2623477045221723
  */
  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Optimization optimization0 = mock(Optimization.class, CALLS_REAL_METHODS);
      Optimization.DynamicIntArray optimization_DynamicIntArray0 = optimization0.new DynamicIntArray(0);
      optimization_DynamicIntArray0.getRevision();
      optimization_DynamicIntArray0.addElement(0);
      optimization_DynamicIntArray0.copy();
      assertEquals(1, optimization_DynamicIntArray0.size());
      
      optimization_DynamicIntArray0.removeElementAt(0);
      optimization_DynamicIntArray0.getRevision();
      int int0 = optimization_DynamicIntArray0.size();
      assertEquals(0, int0);
  }

  /**
  //Test case number: 13
  /*Coverage entropy=2.425910149055313
  */
  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Optimization optimization0 = mock(Optimization.class, CALLS_REAL_METHODS);
      int int0 = 0;
      Optimization.DynamicIntArray optimization_DynamicIntArray0 = optimization0.new DynamicIntArray(0);
      optimization_DynamicIntArray0.removeAllElements();
      optimization_DynamicIntArray0.addElement(0);
      optimization_DynamicIntArray0.getRevision();
      optimization_DynamicIntArray0.copy();
      optimization_DynamicIntArray0.removeAllElements();
      optimization_DynamicIntArray0.getRevision();
      optimization_DynamicIntArray0.removeAllElements();
      optimization_DynamicIntArray0.size();
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
  /*Coverage entropy=1.543056733112554
  */
  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Optimization optimization0 = mock(Optimization.class, CALLS_REAL_METHODS);
      Optimization.DynamicIntArray optimization_DynamicIntArray0 = optimization0.new DynamicIntArray(183);
      optimization_DynamicIntArray0.copy();
      // Undeclared exception!
      try { 
        optimization_DynamicIntArray0.elementAt((-872));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -872
         //
         verifyException("weka.core.Optimization$DynamicIntArray", e);
      }
  }
}
