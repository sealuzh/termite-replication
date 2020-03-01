/*
 * This file was automatically generated by EvoSuite
 * Mon Nov 18 13:09:29 GMT 2019
 */

package weka.core;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.BufferedReader;
import java.io.StringReader;
import java.nio.CharBuffer;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.Random;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.evosuite.runtime.mock.java.io.MockFile;
import org.evosuite.runtime.mock.java.io.MockFileOutputStream;
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
      weka.core.matrix.Matrix matrix0 = new weka.core.matrix.Matrix(1, 6);
      StringReader stringReader0 = new StringReader("Bled 0=Slvnia");
      char[] charArray0 = new char[6];
      charArray0[1] = '>';
      charArray0[2] = '>';
      charArray0[3] = '8';
      charArray0[4] = 'I';
      charArray0[5] = '\\';
      BufferedReader bufferedReader0 = new BufferedReader(stringReader0);
      BufferedReader bufferedReader1 = new BufferedReader(stringReader0, 6);
      bufferedReader1.read();
      bufferedReader0.readLine();
      bufferedReader1.lines();
      bufferedReader1.readLine();
      BufferedReader bufferedReader2 = new BufferedReader(bufferedReader0, '>');
      bufferedReader0.close();
      BufferedReader bufferedReader3 = new BufferedReader(stringReader0, 6);
      BufferedReader bufferedReader4 = new BufferedReader(bufferedReader1, 7);
      BufferedReader bufferedReader5 = new BufferedReader(bufferedReader0, '>');
      double[] doubleArray0 = new double[5];
      doubleArray0[0] = (double) 7;
      doubleArray0[1] = (double) 6;
      boolean[] booleanArray0 = new boolean[8];
      booleanArray0[3] = true;
      booleanArray0[1] = true;
      booleanArray0[2] = true;
      booleanArray0[5] = false;
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
  //Test case number: 1
  /*Coverage entropy=0.3333333333333333
  */
  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Random.setNextRandom((-941));
      Random.setNextRandom((-941));
      double[][] doubleArray0 = new double[9][1];
      double[] doubleArray1 = new double[8];
      doubleArray1[0] = (double) (-941);
      doubleArray1[1] = (double) (-941);
      doubleArray1[2] = (double) (-941);
      doubleArray1[3] = (-864.69107);
      doubleArray1[4] = (double) (-941);
      doubleArray1[5] = (double) (-941);
      doubleArray1[6] = (double) (-941);
      doubleArray1[7] = (double) (-941);
      doubleArray0[0] = doubleArray1;
      double[] doubleArray2 = new double[0];
      doubleArray0[1] = doubleArray2;
      double[] doubleArray3 = new double[3];
      doubleArray3[0] = (double) (-941);
      doubleArray3[1] = (double) (-941);
      doubleArray3[2] = (double) (-941);
      doubleArray0[2] = doubleArray3;
      double[] doubleArray4 = new double[3];
      doubleArray4[0] = (-864.69107);
      doubleArray4[1] = (double) (-941);
      doubleArray4[2] = (double) (-941);
      doubleArray0[3] = doubleArray4;
      double[] doubleArray5 = new double[8];
      doubleArray5[0] = (-864.69107);
      doubleArray5[1] = (double) (-941);
      doubleArray5[2] = (-864.69107);
      doubleArray5[3] = (double) (-941);
      doubleArray5[4] = (double) (-941);
      doubleArray5[5] = (double) (-941);
      doubleArray5[6] = (-864.69107);
      doubleArray5[7] = (-864.69107);
      doubleArray0[4] = doubleArray5;
      double[] doubleArray6 = new double[3];
      doubleArray6[0] = (double) (-941);
      doubleArray6[1] = (double) (-941);
      doubleArray6[2] = (-864.69107);
      doubleArray0[5] = doubleArray6;
      double[] doubleArray7 = new double[3];
      doubleArray7[0] = (-864.69107);
      doubleArray7[1] = (double) (-941);
      doubleArray7[2] = (-864.69107);
      doubleArray0[6] = doubleArray7;
      double[] doubleArray8 = new double[0];
      doubleArray0[7] = doubleArray8;
      double[] doubleArray9 = new double[6];
      doubleArray9[0] = (double) (-941);
      doubleArray9[1] = (double) (-941);
      doubleArray9[2] = (-52.0);
      doubleArray9[3] = (double) (-941);
      doubleArray9[4] = 1987.1587658;
      doubleArray9[5] = (-864.69107);
      doubleArray0[8] = doubleArray9;
      weka.core.matrix.Matrix matrix0 = new weka.core.matrix.Matrix(doubleArray0, 2, (-941));
      boolean[] booleanArray0 = new boolean[3];
      booleanArray0[0] = false;
      booleanArray0[1] = false;
      booleanArray0[2] = false;
      double[] doubleArray10 = Optimization.solveTriangle(matrix0, doubleArray8, false, booleanArray0);
      assertNotSame(doubleArray10, doubleArray7);
  }

  /**
  //Test case number: 2
  /*Coverage entropy=0.3333333333333333
  */
  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      weka.core.matrix.Matrix matrix0 = new weka.core.matrix.Matrix(1, 6);
      StringReader stringReader0 = new StringReader("Bled, Slovenia");
      char[] charArray0 = new char[6];
      charArray0[1] = '>';
      charArray0[2] = '\u0012';
      charArray0[3] = '8';
      charArray0[3] = 'I';
      charArray0[5] = '\\';
      BufferedReader bufferedReader0 = new BufferedReader(stringReader0);
      BufferedReader bufferedReader1 = new BufferedReader(stringReader0, 6);
      bufferedReader1.read();
      bufferedReader0.readLine();
      bufferedReader1.readLine();
      bufferedReader0.skip(66);
      bufferedReader1.readLine();
      BufferedReader bufferedReader2 = new BufferedReader(bufferedReader0, '>');
      BufferedReader bufferedReader3 = new BufferedReader(stringReader0, 6);
      BufferedReader bufferedReader4 = new BufferedReader(bufferedReader1, 7);
      BufferedReader bufferedReader5 = new BufferedReader(bufferedReader0, '\u0012');
      double[] doubleArray0 = new double[2];
      doubleArray0[0] = (double) 7;
      doubleArray0[1] = (double) 6;
      boolean[] booleanArray0 = new boolean[8];
      booleanArray0[0] = true;
      booleanArray0[1] = true;
      booleanArray0[2] = false;
      booleanArray0[5] = false;
      double[] doubleArray1 = Optimization.solveTriangle(matrix0, doubleArray0, false, booleanArray0);
      assertArrayEquals(new double[] {0.0, 0.0}, doubleArray1, 0.01);
  }

  /**
  //Test case number: 3
  /*Coverage entropy=1.5981863871455346
  */
  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      weka.core.matrix.Matrix matrix0 = weka.core.matrix.Matrix.identity(6, 1);
      StringReader stringReader0 = new StringReader("}");
      char[] charArray0 = new char[8];
      charArray0[0] = 'J';
      charArray0[1] = 'J';
      charArray0[2] = '#';
      BufferedReader bufferedReader0 = new BufferedReader(stringReader0);
      BufferedReader bufferedReader1 = new BufferedReader(stringReader0, 6);
      bufferedReader1.mark(32);
      bufferedReader0.read();
      bufferedReader0.readLine();
      bufferedReader1.lines();
      bufferedReader0.readLine();
      bufferedReader0.lines();
      BufferedReader bufferedReader2 = new BufferedReader(stringReader0, 1);
      bufferedReader0.close();
      BufferedReader bufferedReader3 = new BufferedReader(bufferedReader2, 433);
      BufferedReader bufferedReader4 = new BufferedReader(stringReader0, 40);
      matrix0.normF();
      BufferedReader bufferedReader5 = new BufferedReader(bufferedReader0, 125);
      double[] doubleArray0 = new double[0];
      boolean[] booleanArray0 = new boolean[4];
      booleanArray0[0] = false;
      booleanArray0[1] = true;
      Optimization optimization0 = mock(Optimization.class, CALLS_REAL_METHODS);
      Optimization.DynamicIntArray optimization_DynamicIntArray0 = optimization0.new DynamicIntArray(1);
      optimization_DynamicIntArray0.getRevision();
      optimization_DynamicIntArray0.size();
      double[] doubleArray1 = Optimization.solveTriangle(matrix0, doubleArray0, true, booleanArray0);
      assertNotSame(doubleArray1, doubleArray0);
  }

  /**
  //Test case number: 4
  /*Coverage entropy=0.3333333333333333
  */
  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Optimization optimization0 = mock(Optimization.class, CALLS_REAL_METHODS);
      weka.core.matrix.Matrix matrix0 = weka.core.matrix.Matrix.identity(6, 1);
      StringReader stringReader0 = new StringReader("Bled, Slovenia");
      char[] charArray0 = new char[6];
      charArray0[1] = '>';
      charArray0[2] = '#';
      charArray0[3] = '8';
      charArray0[4] = 'I';
      charArray0[5] = '\\';
      stringReader0.read(charArray0);
      BufferedReader bufferedReader0 = new BufferedReader(stringReader0);
      BufferedReader bufferedReader1 = new BufferedReader(stringReader0, 6);
      bufferedReader1.read();
      bufferedReader1.readLine();
      BufferedReader bufferedReader2 = new BufferedReader(bufferedReader0, 2);
      BufferedReader bufferedReader3 = new BufferedReader(stringReader0, 6);
      BufferedReader bufferedReader4 = new BufferedReader(bufferedReader1, 7);
      BufferedReader bufferedReader5 = new BufferedReader(bufferedReader0, 5);
      double[] doubleArray0 = new double[2];
      doubleArray0[0] = (double) 5;
      doubleArray0[1] = (double) 6;
      boolean[] booleanArray0 = new boolean[8];
      booleanArray0[1] = true;
      booleanArray0[2] = false;
      booleanArray0[3] = true;
      booleanArray0[4] = false;
      booleanArray0[5] = true;
      booleanArray0[6] = true;
      booleanArray0[7] = false;
      Optimization.solveTriangle(matrix0, doubleArray0, true, booleanArray0);
      Random.setNextRandom(1);
  }

  /**
  //Test case number: 5
  /*Coverage entropy=0.3333333333333333
  */
  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Random.setNextRandom(0);
      double[][] doubleArray0 = new double[1][5];
      double[] doubleArray1 = new double[1];
      doubleArray1[0] = (double) 5669;
      doubleArray0[0] = doubleArray1;
      weka.core.matrix.Matrix matrix0 = weka.core.matrix.Matrix.constructWithCopy(doubleArray0);
      double[] doubleArray2 = new double[4];
      doubleArray2[0] = (double) 5669;
      doubleArray2[1] = (double) (-1127);
      doubleArray2[2] = (double) 0;
      doubleArray2[3] = (double) 0;
      FileSystemHandling.shouldAllThrowIOExceptions();
      boolean[] booleanArray0 = new boolean[7];
      weka.core.matrix.Matrix matrix1 = matrix0.copy();
      MockFile mockFile0 = new MockFile("!v<|2MP,868~/!7_ml", "#cg:7~N?q]PE]");
      mockFile0.setReadable(true);
      MockFileOutputStream mockFileOutputStream0 = new MockFileOutputStream(mockFile0, true);
      mockFileOutputStream0.release();
      MockPrintWriter mockPrintWriter0 = new MockPrintWriter(mockFileOutputStream0, false);
      matrix0.write(mockPrintWriter0);
      booleanArray0[0] = true;
      booleanArray0[1] = false;
      double[] doubleArray3 = new double[4];
      doubleArray3[0] = (double) 0;
      doubleArray3[1] = (double) 5669;
      doubleArray3[2] = (double) 5669;
      doubleArray3[3] = (double) 5669;
      // Undeclared exception!
      try { 
        Optimization.solveTriangle(matrix1, doubleArray3, false, booleanArray0);
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
      weka.core.matrix.Matrix matrix0 = weka.core.matrix.Matrix.identity(22, 1);
      StringReader stringReader0 = new StringReader("}");
      char[] charArray0 = new char[8];
      charArray0[1] = 'J';
      charArray0[2] = '#';
      BufferedReader bufferedReader0 = new BufferedReader(stringReader0);
      BufferedReader bufferedReader1 = new BufferedReader(stringReader0, 22);
      char[] charArray1 = new char[1];
      charArray1[0] = 'J';
      CharBuffer charBuffer0 = CharBuffer.wrap(charArray1);
      bufferedReader0.read(charBuffer0);
      bufferedReader1.mark(32);
      bufferedReader0.read();
      bufferedReader0.readLine();
      bufferedReader1.lines();
      bufferedReader0.readLine();
      stringReader0.read();
      stringReader0.skip(1);
      bufferedReader0.lines();
      BufferedReader bufferedReader2 = new BufferedReader(bufferedReader1, 23);
      CharBuffer charBuffer1 = CharBuffer.wrap(charArray0);
      bufferedReader2.read(charBuffer1);
      bufferedReader1.close();
      BufferedReader bufferedReader3 = new BufferedReader(bufferedReader1, 22);
      BufferedReader bufferedReader4 = new BufferedReader(bufferedReader2, 23);
      BufferedReader bufferedReader5 = new BufferedReader(bufferedReader2, 7);
      BufferedReader bufferedReader6 = new BufferedReader(bufferedReader5, 1742);
      double[] doubleArray0 = new double[1];
      doubleArray0[0] = (double) 7;
      double[] doubleArray1 = Optimization.solveTriangle(matrix0, doubleArray0, false, (boolean[]) null);
      assertNotSame(doubleArray0, doubleArray1);
  }

  /**
  //Test case number: 7
  /*Coverage entropy=0.4
  */
  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      weka.core.matrix.Matrix.random(35, 26);
      weka.core.matrix.Matrix matrix0 = weka.core.matrix.Matrix.random(18, 26);
      double[] doubleArray0 = new double[9];
      doubleArray0[0] = (double) 35;
      doubleArray0[1] = (double) 0;
      doubleArray0[2] = (double) 26;
      doubleArray0[3] = 0.0;
      doubleArray0[4] = 1.0E-6;
      doubleArray0[5] = 2349.2505488997044;
      doubleArray0[6] = (double) 0;
      doubleArray0[3] = (double) 35;
      doubleArray0[8] = 1.0000000000000036;
      double[] doubleArray1 = Optimization.solveTriangle(matrix0, doubleArray0, true, (boolean[]) null);
      Optimization.solveTriangle(matrix0, doubleArray1, false, (boolean[]) null);
      assertArrayEquals(new double[] {Double.POSITIVE_INFINITY, Double.NEGATIVE_INFINITY, Double.NaN, Double.NaN, Double.NaN, Double.NaN, Double.NaN, Double.NaN, Double.NaN}, doubleArray1, 0.01);
      assertArrayEquals(new double[] {35.0, 0.0, 26.0, 35.0, 1.0E-6, 2349.2505488997044, 0.0, 0.0, 1.0000000000000036}, doubleArray0, 0.01);
  }

  /**
  //Test case number: 8
  /*Coverage entropy=0.3333333333333333
  */
  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Random.setNextRandom(0);
      double[][] doubleArray0 = new double[1][5];
      double[] doubleArray1 = new double[1];
      doubleArray1[0] = (double) 5669;
      doubleArray0[0] = doubleArray1;
      weka.core.matrix.Matrix matrix0 = weka.core.matrix.Matrix.constructWithCopy(doubleArray0);
      double[] doubleArray2 = new double[4];
      doubleArray2[0] = (double) 5669;
      doubleArray2[1] = (double) (-1127);
      doubleArray2[2] = (double) 0;
      doubleArray2[3] = (double) 0;
      FileSystemHandling.shouldAllThrowIOExceptions();
      boolean[] booleanArray0 = new boolean[7];
      weka.core.matrix.Matrix matrix1 = matrix0.copy();
      MockFile mockFile0 = new MockFile("!v<|2MP,868~/!7_ml", "#cg:7~N?q]PE]");
      mockFile0.setReadable(true);
      MockFileOutputStream mockFileOutputStream0 = new MockFileOutputStream(mockFile0, true);
      mockFileOutputStream0.release();
      MockPrintWriter mockPrintWriter0 = new MockPrintWriter(mockFileOutputStream0, false);
      matrix0.write(mockPrintWriter0);
      booleanArray0[0] = true;
      booleanArray0[1] = true;
      double[] doubleArray3 = new double[4];
      doubleArray3[0] = (double) 0;
      doubleArray3[1] = (double) 5669;
      doubleArray3[2] = (double) 5669;
      doubleArray3[3] = (double) 5669;
      // Undeclared exception!
      try { 
        Optimization.solveTriangle(matrix1, doubleArray3, false, booleanArray0);
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
      char[] charArray0 = new char[6];
      charArray0[1] = '>';
      charArray0[2] = '\u0012';
      charArray0[3] = '8';
      charArray0[4] = 'I';
      charArray0[5] = '\\';
      double[] doubleArray0 = new double[2];
      doubleArray0[0] = (double) 7;
      boolean[] booleanArray0 = new boolean[8];
      booleanArray0[0] = true;
      Random.setNextRandom(44);
      double[][] doubleArray1 = new double[6][3];
      doubleArray1[0] = doubleArray0;
      doubleArray1[1] = doubleArray0;
      doubleArray1[2] = doubleArray0;
      doubleArray1[3] = doubleArray0;
      doubleArray1[4] = doubleArray0;
      doubleArray1[5] = doubleArray0;
      weka.core.matrix.Matrix matrix0 = new weka.core.matrix.Matrix(doubleArray1, 44, 40);
      Optimization.solveTriangle(matrix0, doubleArray0, false, booleanArray0);
      Random.setNextRandom(978);
  }

  /**
  //Test case number: 10
  /*Coverage entropy=0.3333333333333333
  */
  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      weka.core.matrix.Matrix matrix0 = new weka.core.matrix.Matrix(6, 6);
      StringReader stringReader0 = new StringReader("annote");
      char[] charArray0 = new char[8];
      stringReader0.ready();
      charArray0[0] = 'J';
      charArray0[1] = 'J';
      charArray0[2] = '#';
      BufferedReader bufferedReader0 = new BufferedReader(stringReader0);
      BufferedReader bufferedReader1 = new BufferedReader(stringReader0, 6);
      bufferedReader1.ready();
      bufferedReader1.mark(32);
      bufferedReader0.read();
      bufferedReader0.ready();
      bufferedReader0.readLine();
      bufferedReader1.lines();
      bufferedReader0.readLine();
      bufferedReader0.lines();
      BufferedReader bufferedReader2 = new BufferedReader(stringReader0, 1);
      bufferedReader2.read();
      bufferedReader2.read(charArray0);
      bufferedReader2.ready();
      BufferedReader bufferedReader3 = new BufferedReader(bufferedReader2, 433);
      BufferedReader bufferedReader4 = new BufferedReader(stringReader0, 365);
      BufferedReader bufferedReader5 = new BufferedReader(bufferedReader0, 97);
      double[] doubleArray0 = new double[0];
      BufferedReader bufferedReader6 = new BufferedReader(stringReader0);
      bufferedReader6.mark(365);
      BufferedReader bufferedReader7 = new BufferedReader(bufferedReader6, 339);
      double[] doubleArray1 = Optimization.solveTriangle(matrix0, doubleArray0, false, (boolean[]) null);
      assertEquals(0, doubleArray1.length);
  }

  /**
  //Test case number: 11
  /*Coverage entropy=0.3333333333333333
  */
  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      weka.core.matrix.Matrix matrix0 = new weka.core.matrix.Matrix(6, 6);
      StringReader stringReader0 = new StringReader("nnot");
      stringReader0.ready();
      BufferedReader bufferedReader0 = new BufferedReader(stringReader0);
      BufferedReader bufferedReader1 = new BufferedReader(stringReader0, 6);
      bufferedReader1.mark(6);
      bufferedReader1.ready();
      bufferedReader1.mark(32);
      bufferedReader0.read();
      bufferedReader0.ready();
      bufferedReader0.readLine();
      bufferedReader1.lines();
      bufferedReader0.readLine();
      bufferedReader0.lines();
      BufferedReader bufferedReader2 = new BufferedReader(stringReader0, 1);
      bufferedReader0.read();
      bufferedReader2.read();
      bufferedReader2.lines();
      bufferedReader2.ready();
      BufferedReader bufferedReader3 = new BufferedReader(bufferedReader2, 433);
      BufferedReader bufferedReader4 = new BufferedReader(stringReader0, 365);
      stringReader0.ready();
      BufferedReader bufferedReader5 = new BufferedReader(bufferedReader0, 110);
      double[] doubleArray0 = new double[1];
      BufferedReader bufferedReader6 = new BufferedReader(stringReader0);
      bufferedReader6.mark(365);
      BufferedReader bufferedReader7 = new BufferedReader(bufferedReader6, 329);
      double[] doubleArray1 = Optimization.solveTriangle(matrix0, doubleArray0, true, (boolean[]) null);
      assertArrayEquals(new double[] {0.0}, doubleArray0, 0.01);
      assertArrayEquals(new double[] {Double.NaN}, doubleArray1, 0.01);
  }

  /**
  //Test case number: 12
  /*Coverage entropy=0.3333333333333333
  */
  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Random.setNextRandom(0);
      double[][] doubleArray0 = new double[1][5];
      double[] doubleArray1 = new double[1];
      doubleArray1[0] = (double) 5669;
      doubleArray0[0] = doubleArray1;
      weka.core.matrix.Matrix matrix0 = weka.core.matrix.Matrix.constructWithCopy(doubleArray0);
      double[] doubleArray2 = new double[13];
      doubleArray2[0] = (double) 5669;
      doubleArray2[1] = (double) (-1127);
      doubleArray2[2] = (double) 5669;
      doubleArray2[3] = (double) 0;
      FileSystemHandling.shouldAllThrowIOExceptions();
      boolean[] booleanArray0 = new boolean[7];
      matrix0.copy();
      MockFile mockFile0 = new MockFile("!v<|2MP,868~/!7_ml", "#cg:7~N?q]PE]");
      MockFileOutputStream mockFileOutputStream0 = new MockFileOutputStream(mockFile0, true);
      mockFileOutputStream0.release();
      MockPrintWriter mockPrintWriter0 = new MockPrintWriter(mockFileOutputStream0, false);
      matrix0.write(mockPrintWriter0);
      booleanArray0[0] = true;
      booleanArray0[1] = true;
      booleanArray0[2] = true;
      booleanArray0[3] = true;
      booleanArray0[5] = true;
      booleanArray0[6] = true;
      // Undeclared exception!
      try { 
        Optimization.solveTriangle(matrix0, doubleArray2, true, booleanArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  /**
  //Test case number: 13
  /*Coverage entropy=0.3333333333333333
  */
  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      byte[] byteArray0 = new byte[5];
      byteArray0[0] = (byte)69;
      byteArray0[1] = (byte)88;
      byteArray0[3] = (byte) (-20);
      FileSystemHandling fileSystemHandling0 = new FileSystemHandling();
      byteArray0[4] = (byte) (-90);
      FileSystemHandling.appendDataToFile((EvoSuiteFile) null, byteArray0);
      double[] doubleArray0 = new double[6];
      doubleArray0[0] = (double) (byte)69;
      doubleArray0[1] = (double) (byte) (-20);
      doubleArray0[2] = (double) (byte) (-90);
      doubleArray0[3] = (double) (byte) (-46);
      doubleArray0[4] = (double) (byte)69;
      doubleArray0[5] = (double) (byte) (-90);
      boolean[] booleanArray0 = new boolean[3];
      booleanArray0[0] = true;
      booleanArray0[1] = false;
      booleanArray0[2] = false;
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
  //Test case number: 14
  /*Coverage entropy=0.3333333333333333
  */
  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Random.setNextRandom(0);
      double[][] doubleArray0 = new double[1][5];
      double[] doubleArray1 = new double[1];
      doubleArray1[0] = (double) 5669;
      doubleArray0[0] = doubleArray1;
      weka.core.matrix.Matrix matrix0 = weka.core.matrix.Matrix.constructWithCopy(doubleArray0);
      double[] doubleArray2 = new double[4];
      doubleArray2[0] = (double) 5669;
      doubleArray2[1] = (double) (-1127);
      doubleArray2[2] = (double) 0;
      doubleArray2[3] = (double) 0;
      boolean[] booleanArray0 = new boolean[7];
      matrix0.copy();
      MockFile mockFile0 = new MockFile("!v<|2MP,868~/!7_ml", "#cg:7~N?q]PE]");
      MockFileOutputStream mockFileOutputStream0 = new MockFileOutputStream(mockFile0, true);
      MockPrintWriter mockPrintWriter0 = new MockPrintWriter(mockFileOutputStream0, false);
      matrix0.write(mockPrintWriter0);
      booleanArray0[0] = true;
      booleanArray0[1] = true;
      booleanArray0[2] = true;
      booleanArray0[3] = true;
      booleanArray0[5] = true;
      booleanArray0[6] = true;
      double[] doubleArray3 = Optimization.solveTriangle(matrix0, doubleArray2, true, booleanArray0);
      assertArrayEquals(new double[] {0.0, 0.0, 0.0, 0.0}, doubleArray3, 0.01);
      assertArrayEquals(new double[] {5669.0, (-1127.0), 0.0, 0.0}, doubleArray2, 0.01);
  }

  /**
  //Test case number: 15
  /*Coverage entropy=2.436476186791162
  */
  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Optimization optimization0 = mock(Optimization.class, CALLS_REAL_METHODS);
      Optimization.DynamicIntArray optimization_DynamicIntArray0 = optimization0.new DynamicIntArray(7);
      optimization_DynamicIntArray0.copy();
      optimization_DynamicIntArray0.removeAllElements();
      optimization_DynamicIntArray0.copy();
      optimization_DynamicIntArray0.removeAllElements();
      optimization_DynamicIntArray0.getRevision();
      optimization_DynamicIntArray0.copy();
      optimization_DynamicIntArray0.getRevision();
      optimization_DynamicIntArray0.getRevision();
      optimization_DynamicIntArray0.addElement(0);
      optimization_DynamicIntArray0.removeElementAt(0);
      optimization_DynamicIntArray0.getRevision();
      optimization_DynamicIntArray0.getRevision();
      optimization_DynamicIntArray0.getRevision();
      optimization_DynamicIntArray0.getRevision();
      optimization_DynamicIntArray0.removeAllElements();
      optimization_DynamicIntArray0.elementAt(0);
      optimization_DynamicIntArray0.copy();
      optimization_DynamicIntArray0.addElement(0);
      optimization_DynamicIntArray0.copy();
      // Undeclared exception!
      try { 
        optimization_DynamicIntArray0.elementAt(7);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 7
         //
         verifyException("weka.core.Optimization$DynamicIntArray", e);
      }
  }

  /**
  //Test case number: 16
  /*Coverage entropy=1.8058632507364383
  */
  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Optimization optimization0 = mock(Optimization.class, CALLS_REAL_METHODS);
      Optimization.DynamicIntArray optimization_DynamicIntArray0 = optimization0.new DynamicIntArray(0);
      optimization_DynamicIntArray0.addElement(0);
      optimization_DynamicIntArray0.addElement(0);
      optimization_DynamicIntArray0.getRevision();
      optimization_DynamicIntArray0.addElement(0);
      optimization_DynamicIntArray0.removeElementAt(0);
      optimization_DynamicIntArray0.addElement(2);
      optimization_DynamicIntArray0.addElement(0);
      optimization_DynamicIntArray0.addElement(1);
      assertEquals(5, optimization_DynamicIntArray0.size());
  }

  /**
  //Test case number: 17
  /*Coverage entropy=2.0434690297310616
  */
  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Optimization optimization0 = mock(Optimization.class, CALLS_REAL_METHODS);
      Optimization.DynamicIntArray optimization_DynamicIntArray0 = optimization0.new DynamicIntArray(0);
      optimization_DynamicIntArray0.addElement(0);
      optimization_DynamicIntArray0.removeElementAt(0);
      optimization_DynamicIntArray0.copy();
      optimization_DynamicIntArray0.addElement(5669);
      optimization_DynamicIntArray0.copy();
      optimization_DynamicIntArray0.removeAllElements();
      optimization_DynamicIntArray0.copy();
      optimization_DynamicIntArray0.copy();
      int int0 = (-1127);
      // Undeclared exception!
      try { 
        optimization_DynamicIntArray0.removeElementAt((-1127));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
      }
  }
}
