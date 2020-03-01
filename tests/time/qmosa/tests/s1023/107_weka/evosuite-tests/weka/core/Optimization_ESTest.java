/*
 * This file was automatically generated by EvoSuite
 * Wed Dec 04 07:16:14 GMT 2019
 */

package weka.core;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.ByteArrayOutputStream;
import java.io.PrintWriter;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.Random;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.evosuite.runtime.mock.java.io.MockFile;
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
  /*Coverage entropy=0.4
  */
  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      double[][] doubleArray0 = new double[9][5];
      weka.core.matrix.Matrix matrix0 = new weka.core.matrix.Matrix(doubleArray0, 1, 1);
      MockFile mockFile0 = new MockFile("C&hh/L2D;N");
      MockFile mockFile1 = new MockFile(mockFile0, "o8");
      MockPrintStream mockPrintStream0 = new MockPrintStream(mockFile1);
      mockPrintStream0.close();
      MockPrintWriter mockPrintWriter0 = new MockPrintWriter(mockPrintStream0, true);
      double[] doubleArray1 = new double[6];
      doubleArray1[0] = 4409.7864351383605;
      boolean[] booleanArray0 = new boolean[6];
      booleanArray0[0] = false;
      booleanArray0[1] = true;
      booleanArray0[2] = false;
      booleanArray0[3] = true;
      booleanArray0[4] = false;
      booleanArray0[5] = true;
      double[] doubleArray2 = Optimization.solveTriangle(matrix0, doubleArray1, false, booleanArray0);
      double[] doubleArray3 = Optimization.solveTriangle(matrix0, doubleArray2, true, booleanArray0);
      assertArrayEquals(new double[] {Double.NaN, 0.0, Double.NaN, 0.0, Double.NaN, 0.0}, doubleArray2, 0.01);
      assertArrayEquals(new double[] {Double.NaN, 0.0, Double.NaN, 0.0, Double.NaN, 0.0}, doubleArray3, 0.01);
  }

  /**
  //Test case number: 1
  /*Coverage entropy=0.3333333333333333
  */
  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      double[][] doubleArray0 = new double[9][5];
      weka.core.matrix.Matrix matrix0 = new weka.core.matrix.Matrix(doubleArray0, 1, 1);
      MockFile mockFile0 = new MockFile("C&hh/L2D;N");
      MockFile mockFile1 = new MockFile(mockFile0, "o8");
      MockPrintStream mockPrintStream0 = new MockPrintStream(mockFile1);
      mockPrintStream0.print(0L);
      byte[] byteArray0 = new byte[0];
      mockPrintStream0.write(byteArray0);
      mockPrintStream0.print(0L);
      mockPrintStream0.close();
      mockPrintStream0.println(1);
      MockPrintWriter mockPrintWriter0 = new MockPrintWriter(mockPrintStream0, true);
      double[] doubleArray1 = new double[6];
      doubleArray1[0] = 4409.7864351383605;
      doubleArray1[1] = 0.3;
      doubleArray1[2] = 1.00390625;
      doubleArray1[3] = 4409.7864351383605;
      doubleArray1[4] = 0.3;
      doubleArray1[5] = (-1461.0717);
      boolean[] booleanArray0 = new boolean[20];
      booleanArray0[0] = true;
      booleanArray0[2] = true;
      booleanArray0[3] = true;
      booleanArray0[4] = true;
      booleanArray0[6] = true;
      // Undeclared exception!
      try { 
        Optimization.solveTriangle(matrix0, doubleArray1, true, booleanArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  /**
  //Test case number: 2
  /*Coverage entropy=0.3333333333333333
  */
  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      double[][] doubleArray0 = new double[9][5];
      weka.core.matrix.Matrix matrix0 = new weka.core.matrix.Matrix(doubleArray0, 1, 1);
      ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream(1);
      MockPrintWriter mockPrintWriter0 = new MockPrintWriter(byteArrayOutputStream0, false);
      PrintWriter printWriter0 = mockPrintWriter0.append('9');
      char[] charArray0 = new char[6];
      charArray0[0] = '^';
      charArray0[1] = '^';
      charArray0[3] = '^';
      charArray0[4] = '^';
      mockPrintWriter0.print((long) 1);
      charArray0[5] = 'A';
      mockPrintWriter0.print(charArray0);
      mockPrintWriter0.println('9');
      ByteArrayOutputStream byteArrayOutputStream1 = new ByteArrayOutputStream();
      byteArrayOutputStream1.reset();
      byteArrayOutputStream1.close();
      byteArrayOutputStream0.writeTo(byteArrayOutputStream1);
      byteArrayOutputStream0.close();
      printWriter0.println((double) '9');
      mockPrintWriter0.print('f');
      mockPrintWriter0.println((Object) "");
      matrix0.write(mockPrintWriter0);
      double[] doubleArray1 = new double[2];
      doubleArray1[1] = (double) 1;
      double[] doubleArray2 = new double[0];
      double[] doubleArray3 = Optimization.solveTriangle(matrix0, doubleArray2, false, (boolean[]) null);
      assertFalse(doubleArray3.equals((Object)doubleArray1));
  }

  /**
  //Test case number: 3
  /*Coverage entropy=1.5103090061340354
  */
  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      FileSystemHandling.createFolder((EvoSuiteFile) null);
      FileSystemHandling.shouldAllThrowIOExceptions();
      Random.setNextRandom(15);
      byte[] byteArray0 = new byte[8];
      byteArray0[0] = (byte) (-127);
      byteArray0[1] = (byte)76;
      FileSystemHandling.setPermissions((EvoSuiteFile) null, false, true, false);
      FileSystemHandling.setPermissions((EvoSuiteFile) null, false, true, false);
      byteArray0[2] = (byte)0;
      byteArray0[3] = (byte)18;
      byteArray0[4] = (byte)10;
      byteArray0[5] = (byte)31;
      byteArray0[6] = (byte)126;
      byteArray0[7] = (byte) (-34);
      FileSystemHandling.appendDataToFile((EvoSuiteFile) null, byteArray0);
      Optimization optimization0 = mock(Optimization.class, CALLS_REAL_METHODS);
      Optimization.DynamicIntArray optimization_DynamicIntArray0 = optimization0.new DynamicIntArray((byte)0);
      optimization_DynamicIntArray0.addElement(19);
      optimization_DynamicIntArray0.copy();
      optimization_DynamicIntArray0.copy();
      optimization_DynamicIntArray0.addElement((byte)31);
      Random.setNextRandom((byte)10);
      optimization_DynamicIntArray0.addElement((byte)126);
      assertEquals(3, optimization_DynamicIntArray0.size());
  }

  /**
  //Test case number: 4
  /*Coverage entropy=0.3333333333333333
  */
  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      double[][] doubleArray0 = new double[9][5];
      weka.core.matrix.Matrix matrix0 = new weka.core.matrix.Matrix(doubleArray0, 1, 1);
      ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream(1);
      MockPrintWriter mockPrintWriter0 = new MockPrintWriter(byteArrayOutputStream0, false);
      char[] charArray0 = new char[5];
      charArray0[0] = 'A';
      charArray0[1] = 'A';
      charArray0[2] = 'O';
      mockPrintWriter0.println('A');
      charArray0[3] = '^';
      byteArrayOutputStream0.close();
      mockPrintWriter0.write(charArray0);
      mockPrintWriter0.println((double) 'A');
      charArray0[4] = 'H';
      byteArrayOutputStream0.close();
      mockPrintWriter0.print(charArray0);
      mockPrintWriter0.print('&');
      mockPrintWriter0.flush();
      mockPrintWriter0.println((Object) byteArrayOutputStream0);
      matrix0.write(mockPrintWriter0);
      MockPrintWriter mockPrintWriter1 = new MockPrintWriter(mockPrintWriter0, true);
      mockPrintWriter1.print('O');
      mockPrintWriter1.println((Object) "");
      matrix0.write(mockPrintWriter0);
      double[] doubleArray1 = new double[1];
      doubleArray1[0] = (double) 'H';
      double[] doubleArray2 = Optimization.solveTriangle(matrix0, doubleArray1, false, (boolean[]) null);
      assertEquals(1, doubleArray2.length);
  }

  /**
  //Test case number: 5
  /*Coverage entropy=0.3333333333333333
  */
  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      double[][] doubleArray0 = new double[9][5];
      weka.core.matrix.Matrix matrix0 = new weka.core.matrix.Matrix(doubleArray0, 1, 1);
      ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream(1);
      MockPrintWriter mockPrintWriter0 = new MockPrintWriter(byteArrayOutputStream0, false);
      ByteArrayOutputStream byteArrayOutputStream1 = new ByteArrayOutputStream();
      ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream(8);
      ByteArrayOutputStream byteArrayOutputStream3 = new ByteArrayOutputStream();
      byteArrayOutputStream3.reset();
      ByteArrayOutputStream byteArrayOutputStream4 = new ByteArrayOutputStream(1178);
      byteArrayOutputStream3.close();
      ByteArrayOutputStream byteArrayOutputStream5 = new ByteArrayOutputStream();
      byteArrayOutputStream5.writeTo(byteArrayOutputStream2);
      byteArrayOutputStream3.close();
      // Undeclared exception!
      try { 
        Optimization.solveTriangle(matrix0, (double[]) null, true, (boolean[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
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
      double[][] doubleArray0 = new double[9][5];
      weka.core.matrix.Matrix matrix0 = new weka.core.matrix.Matrix(doubleArray0, 1, 1);
      ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream(1);
      MockPrintWriter mockPrintWriter0 = new MockPrintWriter(byteArrayOutputStream0, false);
      PrintWriter printWriter0 = mockPrintWriter0.append('9');
      char[] charArray0 = new char[6];
      charArray0[0] = '^';
      charArray0[1] = '^';
      charArray0[3] = '^';
      charArray0[4] = '^';
      mockPrintWriter0.print((long) 1);
      charArray0[5] = 'A';
      mockPrintWriter0.print(charArray0);
      mockPrintWriter0.println('9');
      ByteArrayOutputStream byteArrayOutputStream1 = new ByteArrayOutputStream();
      byteArrayOutputStream1.reset();
      byteArrayOutputStream1.close();
      byteArrayOutputStream0.writeTo(byteArrayOutputStream1);
      byteArrayOutputStream0.close();
      printWriter0.println((double) '9');
      mockPrintWriter0.print('f');
      mockPrintWriter0.println((Object) "");
      matrix0.write(mockPrintWriter0);
      double[] doubleArray1 = new double[2];
      doubleArray1[1] = (double) 1;
      double[] doubleArray2 = new double[0];
      double[] doubleArray3 = Optimization.solveTriangle(matrix0, doubleArray2, true, (boolean[]) null);
      assertFalse(doubleArray3.equals((Object)doubleArray2));
  }

  /**
  //Test case number: 7
  /*Coverage entropy=0.3333333333333333
  */
  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      double[][] doubleArray0 = new double[9][5];
      weka.core.matrix.Matrix matrix0 = new weka.core.matrix.Matrix(doubleArray0, 1, 1);
      ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream(1);
      char[] charArray0 = new char[2];
      charArray0[0] = '7';
      charArray0[1] = '^';
      ByteArrayOutputStream byteArrayOutputStream1 = new ByteArrayOutputStream();
      ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream(8);
      byteArrayOutputStream2.reset();
      ByteArrayOutputStream byteArrayOutputStream3 = new ByteArrayOutputStream(1178);
      byteArrayOutputStream3.close();
      byteArrayOutputStream1.writeTo(byteArrayOutputStream3);
      byteArrayOutputStream2.close();
      double[] doubleArray1 = new double[1];
      doubleArray1[0] = (double) 'f';
      double[] doubleArray2 = Optimization.solveTriangle(matrix0, doubleArray1, true, (boolean[]) null);
      assertArrayEquals(new double[] {102.0}, doubleArray1, 0.01);
      assertArrayEquals(new double[] {Double.POSITIVE_INFINITY}, doubleArray2, 0.01);
  }

  /**
  //Test case number: 8
  /*Coverage entropy=0.3333333333333333
  */
  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      double[][] doubleArray0 = new double[9][5];
      weka.core.matrix.Matrix matrix0 = new weka.core.matrix.Matrix(doubleArray0, 1, 1);
      MockFile mockFile0 = new MockFile("C&_h/L2D;N");
      MockPrintStream mockPrintStream0 = new MockPrintStream(mockFile0);
      ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream(1);
      MockPrintWriter mockPrintWriter0 = new MockPrintWriter(byteArrayOutputStream0, false);
      char[] charArray0 = new char[5];
      charArray0[0] = 'j';
      charArray0[1] = 'j';
      charArray0[2] = 'O';
      mockPrintWriter0.println('j');
      byteArrayOutputStream0.close();
      mockPrintWriter0.write(charArray0);
      mockPrintWriter0.println(1.000000000001819);
      mockPrintWriter0.print(charArray0);
      mockPrintWriter0.print('U');
      MockPrintWriter mockPrintWriter1 = new MockPrintWriter(mockPrintStream0, true);
      mockPrintWriter1.println((Object) byteArrayOutputStream0);
      matrix0.write(mockPrintWriter1);
      double[] doubleArray1 = new double[3];
      doubleArray1[0] = (double) 'j';
      doubleArray1[1] = (double) 'f';
      doubleArray1[2] = (double) 'O';
      double[] doubleArray2 = Optimization.solveTriangle(matrix0, doubleArray1, false, (boolean[]) null);
      assertArrayEquals(new double[] {Double.NaN, Double.NaN, Double.POSITIVE_INFINITY}, doubleArray2, 0.01);
  }

  /**
  //Test case number: 9
  /*Coverage entropy=2.2278680974667573
  */
  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Optimization optimization0 = mock(Optimization.class, CALLS_REAL_METHODS);
      int int0 = 0;
      Optimization.DynamicIntArray optimization_DynamicIntArray0 = optimization0.new DynamicIntArray(0);
      optimization_DynamicIntArray0.removeAllElements();
      optimization_DynamicIntArray0.getRevision();
      optimization_DynamicIntArray0.addElement(2960);
      int int1 = 25;
      optimization_DynamicIntArray0.copy();
      int int2 = 0;
      optimization_DynamicIntArray0.getRevision();
      optimization_DynamicIntArray0.addElement(0);
      int int3 = 2822;
      optimization_DynamicIntArray0.removeElementAt(0);
      optimization_DynamicIntArray0.removeElementAt(0);
      optimization_DynamicIntArray0.getRevision();
      // Undeclared exception!
      try { 
        optimization_DynamicIntArray0.removeElementAt(0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
      }
  }

  /**
  //Test case number: 10
  /*Coverage entropy=0.3333333333333333
  */
  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      double[][] doubleArray0 = new double[9][5];
      weka.core.matrix.Matrix matrix0 = new weka.core.matrix.Matrix(doubleArray0, 1, 1);
      MockFile mockFile0 = new MockFile("C&hh/L2D;N");
      MockFile mockFile1 = new MockFile(mockFile0, "o8");
      MockPrintStream mockPrintStream0 = new MockPrintStream(mockFile1);
      byte[] byteArray0 = new byte[0];
      mockPrintStream0.write(byteArray0);
      mockPrintStream0.print(0L);
      mockPrintStream0.close();
      MockPrintWriter mockPrintWriter0 = new MockPrintWriter(mockPrintStream0, true);
      double[] doubleArray1 = new double[6];
      doubleArray1[0] = 4409.7864351383605;
      doubleArray1[1] = 0.3;
      doubleArray1[2] = 1.00390625;
      doubleArray1[3] = 4409.7864351383605;
      doubleArray1[4] = 0.3;
      doubleArray1[5] = (-1461.0717);
      boolean[] booleanArray0 = new boolean[20];
      booleanArray0[0] = true;
      booleanArray0[1] = true;
      booleanArray0[2] = true;
      booleanArray0[3] = true;
      booleanArray0[4] = true;
      booleanArray0[5] = true;
      booleanArray0[6] = true;
      booleanArray0[7] = true;
      booleanArray0[8] = true;
      double[] doubleArray2 = Optimization.solveTriangle(matrix0, doubleArray1, true, booleanArray0);
      assertArrayEquals(new double[] {4409.7864351383605, 0.3, 1.00390625, 4409.7864351383605, 0.3, (-1461.0717)}, doubleArray1, 0.01);
      assertArrayEquals(new double[] {0.0, 0.0, 0.0, 0.0, 0.0, 0.0}, doubleArray2, 0.01);
  }

  /**
  //Test case number: 11
  /*Coverage entropy=0.3333333333333333
  */
  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      double[][] doubleArray0 = new double[9][5];
      weka.core.matrix.Matrix matrix0 = new weka.core.matrix.Matrix(doubleArray0, 1, 1);
      ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream(1);
      MockPrintWriter mockPrintWriter0 = new MockPrintWriter(byteArrayOutputStream0, false);
      PrintWriter printWriter0 = mockPrintWriter0.append('9');
      char[] charArray0 = new char[6];
      charArray0[0] = '^';
      charArray0[3] = '^';
      printWriter0.print((long) 1);
      mockPrintWriter0.print(charArray0);
      printWriter0.println('B');
      ByteArrayOutputStream byteArrayOutputStream1 = new ByteArrayOutputStream();
      byteArrayOutputStream0.close();
      byteArrayOutputStream0.writeTo(byteArrayOutputStream1);
      byteArrayOutputStream0.close();
      printWriter0.println((double) 1);
      mockPrintWriter0.print('9');
      mockPrintWriter0.println((Object) byteArrayOutputStream1);
      matrix0.write(printWriter0);
      double[] doubleArray1 = new double[4];
      doubleArray1[0] = (double) '\u0000';
      doubleArray1[1] = (double) '9';
      doubleArray1[2] = (double) '^';
      doubleArray1[3] = (double) '^';
      boolean[] booleanArray0 = new boolean[2];
      booleanArray0[0] = true;
      booleanArray0[1] = true;
      // Undeclared exception!
      try { 
        Optimization.solveTriangle(matrix0, doubleArray1, false, booleanArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 3
         //
         verifyException("weka.core.Optimization", e);
      }
  }

  /**
  //Test case number: 12
  /*Coverage entropy=0.3333333333333333
  */
  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      double[][] doubleArray0 = new double[9][5];
      double[] doubleArray1 = new double[3];
      doubleArray1[0] = 1.0;
      doubleArray1[1] = (-1461.0717);
      doubleArray1[2] = (-388.0563504356153);
      doubleArray0[0] = doubleArray1;
      double[] doubleArray2 = new double[3];
      doubleArray2[0] = (-1461.0717);
      doubleArray2[1] = 1.0;
      doubleArray2[2] = 1.0;
      doubleArray0[1] = doubleArray2;
      double[] doubleArray3 = new double[0];
      doubleArray0[2] = doubleArray3;
      double[] doubleArray4 = new double[7];
      doubleArray4[0] = 1.0;
      doubleArray4[1] = (-388.0563504356153);
      doubleArray4[2] = (-1461.0717);
      doubleArray4[3] = (-1461.0717);
      doubleArray4[4] = (-388.0563504356153);
      doubleArray4[5] = (-388.0563504356153);
      doubleArray4[6] = (-1461.0717);
      doubleArray0[3] = doubleArray4;
      double[] doubleArray5 = new double[3];
      doubleArray5[0] = (-1461.0717);
      doubleArray5[1] = (-388.0563504356153);
      doubleArray5[2] = (-388.0563504356153);
      doubleArray0[4] = doubleArray5;
      double[] doubleArray6 = new double[5];
      doubleArray6[0] = (-1461.0717);
      doubleArray6[1] = (-388.0563504356153);
      doubleArray6[2] = 1.0;
      doubleArray6[3] = 1.0;
      doubleArray6[4] = (-388.0563504356153);
      doubleArray0[5] = doubleArray6;
      double[] doubleArray7 = new double[6];
      doubleArray7[0] = (-1461.0717);
      doubleArray7[1] = 4409.7864351383605;
      doubleArray7[2] = 1.0E-6;
      doubleArray7[3] = 1.0;
      doubleArray7[4] = 0.3;
      doubleArray7[5] = (-388.0563504356153);
      doubleArray0[6] = doubleArray7;
      double[] doubleArray8 = new double[1];
      doubleArray8[0] = (-1461.0717);
      doubleArray0[7] = doubleArray8;
      double[] doubleArray9 = new double[3];
      doubleArray9[0] = (-1461.0717);
      doubleArray9[1] = (-1461.0717);
      doubleArray9[2] = 4409.7864351383605;
      doubleArray0[8] = doubleArray9;
      weka.core.matrix.Matrix matrix0 = new weka.core.matrix.Matrix(doubleArray0, 1, 1);
      // Undeclared exception!
      try { 
        Optimization.solveTriangle(matrix0, doubleArray9, true, (boolean[]) null);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  /**
  //Test case number: 13
  /*Coverage entropy=1.830738805564335
  */
  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Optimization optimization0 = mock(Optimization.class, CALLS_REAL_METHODS);
      Optimization.DynamicIntArray optimization_DynamicIntArray0 = optimization0.new DynamicIntArray(3553);
      optimization_DynamicIntArray0.getRevision();
      optimization_DynamicIntArray0.elementAt(0);
      optimization_DynamicIntArray0.removeAllElements();
      weka.core.matrix.Matrix matrix0 = weka.core.matrix.Matrix.identity(0, 0);
      double[] doubleArray0 = null;
      boolean boolean0 = false;
      // Undeclared exception!
      try { 
        matrix0.eig();
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -1
         //
         verifyException("weka.core.matrix.EigenvalueDecomposition", e);
      }
  }

  /**
  //Test case number: 14
  /*Coverage entropy=2.2700203387932723
  */
  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Optimization optimization0 = mock(Optimization.class, CALLS_REAL_METHODS);
      int int0 = 0;
      Optimization.DynamicIntArray optimization_DynamicIntArray0 = optimization0.new DynamicIntArray(0);
      optimization_DynamicIntArray0.removeAllElements();
      optimization_DynamicIntArray0.getRevision();
      int int1 = 25;
      optimization_DynamicIntArray0.copy();
      int int2 = 0;
      optimization_DynamicIntArray0.getRevision();
      optimization_DynamicIntArray0.addElement(0);
      optimization_DynamicIntArray0.removeElementAt(0);
      optimization_DynamicIntArray0.getRevision();
      optimization_DynamicIntArray0.getRevision();
      // Undeclared exception!
      try { 
        optimization_DynamicIntArray0.removeElementAt(2822);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
      }
  }

  /**
  //Test case number: 15
  /*Coverage entropy=2.2654436797543704
  */
  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Optimization optimization0 = mock(Optimization.class, CALLS_REAL_METHODS);
      Optimization.DynamicIntArray optimization_DynamicIntArray0 = optimization0.new DynamicIntArray(3649);
      optimization_DynamicIntArray0.addElement(0);
      optimization_DynamicIntArray0.removeAllElements();
      optimization_DynamicIntArray0.addElement(0);
      optimization_DynamicIntArray0.copy();
      optimization_DynamicIntArray0.removeElementAt(0);
      optimization_DynamicIntArray0.size();
      int int0 = (-429);
      // Undeclared exception!
      try { 
        optimization_DynamicIntArray0.removeElementAt((-1048));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
      }
  }
}
