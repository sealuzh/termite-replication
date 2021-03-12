/*
 * This file was automatically generated by EvoSuite
 * Tue Nov 10 00:19:58 GMT 2020
 */

package weka.filters.unsupervised.attribute;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.ArrayList;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import weka.core.Attribute;
import weka.core.BinarySparseInstance;
import weka.core.DenseInstance;
import weka.core.Instances;
import weka.filters.Filter;
import weka.filters.unsupervised.attribute.Discretize;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class Discretize_ESTest extends Discretize_ESTest_scaffolding {

  /**
  //Test case number: 0
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Discretize discretize0 = new Discretize("fe");
      discretize0.setAttributeIndices("fe");
      assertFalse(discretize0.getUseEqualFrequency());
      assertFalse(discretize0.getFindNumBins());
      assertEquals(10, discretize0.getBins());
      assertFalse(discretize0.getMakeBinary());
      assertEquals((-1.0), discretize0.getDesiredWeightOfInstancesPerInterval(), 0.01);
      assertFalse(discretize0.getUseBinNumbers());
  }

  /**
  //Test case number: 1
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Discretize discretize0 = new Discretize("");
      int[] intArray0 = new int[9];
      discretize0.setAttributeIndicesArray(intArray0);
      assertFalse(discretize0.getUseEqualFrequency());
      assertFalse(discretize0.getFindNumBins());
      assertEquals((-1.0), discretize0.getDesiredWeightOfInstancesPerInterval(), 0.01);
      assertFalse(discretize0.getUseBinNumbers());
      assertEquals(10, discretize0.getBins());
      assertFalse(discretize0.getMakeBinary());
  }

  /**
  //Test case number: 2
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Discretize discretize0 = new Discretize();
      assertFalse(discretize0.getUseEqualFrequency());
      
      discretize0.m_UseEqualFrequency = true;
      boolean boolean0 = discretize0.getUseEqualFrequency();
      assertTrue(boolean0);
  }

  /**
  //Test case number: 3
  /*Coverage entropy=1.3862943611198906
  */
  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Discretize discretize0 = new Discretize();
      assertFalse(discretize0.getMakeBinary());
      
      discretize0.setMakeBinary(true);
      boolean boolean0 = discretize0.getMakeBinary();
      assertTrue(boolean0);
  }

  /**
  //Test case number: 4
  /*Coverage entropy=1.3862943611198906
  */
  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Discretize discretize0 = new Discretize();
      discretize0.setInvertSelection(true);
      boolean boolean0 = discretize0.getInvertSelection();
      assertEquals(10, discretize0.getBins());
      assertTrue(boolean0);
      assertFalse(discretize0.getUseEqualFrequency());
      assertFalse(discretize0.getUseBinNumbers());
      assertFalse(discretize0.getMakeBinary());
      assertFalse(discretize0.getFindNumBins());
      assertEquals((-1.0), discretize0.getDesiredWeightOfInstancesPerInterval(), 0.01);
  }

  /**
  //Test case number: 5
  /*Coverage entropy=1.3862943611198906
  */
  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Discretize discretize0 = new Discretize();
      assertFalse(discretize0.getFindNumBins());
      
      discretize0.setFindNumBins(true);
      boolean boolean0 = discretize0.getFindNumBins();
      assertTrue(boolean0);
  }

  /**
  //Test case number: 6
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Discretize discretize0 = new Discretize("14!CMgJrH");
      assertEquals((-1.0), discretize0.getDesiredWeightOfInstancesPerInterval(), 0.01);
      
      discretize0.m_DesiredWeightOfInstancesPerInterval = 0.0;
      double double0 = discretize0.getDesiredWeightOfInstancesPerInterval();
      assertEquals(0.0, double0, 0.01);
  }

  /**
  //Test case number: 7
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Discretize discretize0 = new Discretize("");
      discretize0.getAttributeIndices();
      assertEquals((-1.0), discretize0.getDesiredWeightOfInstancesPerInterval(), 0.01);
      assertFalse(discretize0.getUseBinNumbers());
      assertEquals(10, discretize0.getBins());
      assertFalse(discretize0.getMakeBinary());
      assertFalse(discretize0.getUseEqualFrequency());
      assertFalse(discretize0.getFindNumBins());
  }

  /**
  //Test case number: 8
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Discretize discretize0 = new Discretize("-");
      String[] stringArray0 = new String[4];
      stringArray0[0] = "-";
      try { 
        discretize0.setOptions(stringArray0);
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
      }
  }

  /**
  //Test case number: 9
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Discretize discretize0 = new Discretize();
      String[] stringArray0 = new String[5];
      try { 
        discretize0.setOptions(stringArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("weka.core.Utils", e);
      }
  }

  /**
  //Test case number: 10
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Discretize discretize0 = new Discretize();
      // Undeclared exception!
      try { 
        discretize0.findNumBins(42);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("weka.filters.unsupervised.attribute.Discretize", e);
      }
  }

  /**
  //Test case number: 11
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Discretize discretize0 = new Discretize();
      int[] intArray0 = new int[4];
      BinarySparseInstance binarySparseInstance0 = new BinarySparseInstance(11, intArray0, 469);
      // Undeclared exception!
      try { 
        discretize0.convertInstance(binarySparseInstance0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("weka.filters.unsupervised.attribute.Discretize", e);
      }
  }

  /**
  //Test case number: 12
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Discretize discretize0 = new Discretize("(|QlSRS?IwqU4P51h3");
      // Undeclared exception!
      try { 
        discretize0.calculateCutPointsByEqualWidthBinning((-1555));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("weka.filters.unsupervised.attribute.Discretize", e);
      }
  }

  /**
  //Test case number: 13
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Discretize discretize0 = new Discretize();
      // Undeclared exception!
      try { 
        discretize0.calculateCutPointsByEqualFrequencyBinning(4491);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("weka.core.Instances", e);
      }
  }

  /**
  //Test case number: 14
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Discretize discretize0 = new Discretize();
      // Undeclared exception!
      try { 
        discretize0.calculateCutPoints();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("weka.filters.unsupervised.attribute.Discretize", e);
      }
  }

  /**
  //Test case number: 15
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Discretize discretize0 = null;
      try {
        discretize0 = new Discretize((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("weka.core.Range", e);
      }
  }

  /**
  //Test case number: 16
  /*Coverage entropy=1.3862943611198906
  */
  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Discretize discretize0 = new Discretize();
      discretize0.getCapabilities();
      assertFalse(discretize0.getUseBinNumbers());
      assertFalse(discretize0.getUseEqualFrequency());
      assertFalse(discretize0.getFindNumBins());
      assertEquals((-1.0), discretize0.getDesiredWeightOfInstancesPerInterval(), 0.01);
      assertEquals(10, discretize0.getBins());
      assertFalse(discretize0.getMakeBinary());
  }

  /**
  //Test case number: 17
  /*Coverage entropy=2.1383972463477248
  */
  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Discretize discretize0 = new Discretize("");
      discretize0.setOptions((String[]) null);
      assertEquals(10, discretize0.getBins());
      assertFalse(discretize0.getMakeBinary());
      assertEquals((-1.0), discretize0.getDesiredWeightOfInstancesPerInterval(), 0.01);
      assertFalse(discretize0.getUseBinNumbers());
      assertFalse(discretize0.getUseEqualFrequency());
      assertFalse(discretize0.getFindNumBins());
  }

  /**
  //Test case number: 18
  /*Coverage entropy=1.0397207708399179
  */
  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Discretize discretize0 = new Discretize("");
      discretize0.listOptions();
      assertFalse(discretize0.getUseEqualFrequency());
      assertFalse(discretize0.getFindNumBins());
      assertEquals((-1.0), discretize0.getDesiredWeightOfInstancesPerInterval(), 0.01);
      assertEquals(10, discretize0.getBins());
      assertFalse(discretize0.getMakeBinary());
      assertFalse(discretize0.getUseBinNumbers());
  }

  /**
  //Test case number: 19
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Discretize discretize0 = new Discretize();
      boolean boolean0 = discretize0.getUseEqualFrequency();
      assertEquals((-1.0), discretize0.getDesiredWeightOfInstancesPerInterval(), 0.01);
      assertFalse(discretize0.getUseBinNumbers());
      assertFalse(discretize0.getMakeBinary());
      assertFalse(discretize0.getFindNumBins());
      assertEquals(10, discretize0.getBins());
      assertFalse(boolean0);
  }

  /**
  //Test case number: 20
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Discretize discretize0 = new Discretize();
      boolean boolean0 = discretize0.getMakeBinary();
      assertFalse(discretize0.getUseEqualFrequency());
      assertEquals(10, discretize0.getBins());
      assertEquals((-1.0), discretize0.getDesiredWeightOfInstancesPerInterval(), 0.01);
      assertFalse(discretize0.getUseBinNumbers());
      assertFalse(boolean0);
      assertFalse(discretize0.getFindNumBins());
  }

  /**
  //Test case number: 21
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Discretize discretize0 = new Discretize("Rp)~P{*");
      discretize0.getAttributeIndices();
      assertEquals(10, discretize0.getBins());
      assertFalse(discretize0.getUseBinNumbers());
      assertFalse(discretize0.getUseEqualFrequency());
      assertFalse(discretize0.getMakeBinary());
      assertFalse(discretize0.getFindNumBins());
      assertEquals((-1.0), discretize0.getDesiredWeightOfInstancesPerInterval(), 0.01);
  }

  /**
  //Test case number: 22
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Discretize discretize0 = new Discretize("f");
      double double0 = discretize0.getDesiredWeightOfInstancesPerInterval();
      assertEquals(10, discretize0.getBins());
      assertFalse(discretize0.getFindNumBins());
      assertFalse(discretize0.getUseBinNumbers());
      assertEquals((-1.0), double0, 0.01);
      assertFalse(discretize0.getMakeBinary());
      assertFalse(discretize0.getUseEqualFrequency());
  }

  /**
  //Test case number: 23
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      Discretize discretize0 = new Discretize("Optimize number of equal-width bins using leave-one-out. Doesn't work for equal-frequency binning");
      int int0 = discretize0.getBins();
      assertEquals((-1.0), discretize0.getDesiredWeightOfInstancesPerInterval(), 0.01);
      assertFalse(discretize0.getMakeBinary());
      assertFalse(discretize0.getFindNumBins());
      assertEquals(10, int0);
      assertFalse(discretize0.getUseBinNumbers());
      assertFalse(discretize0.getUseEqualFrequency());
  }

  /**
  //Test case number: 24
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      Discretize discretize0 = new Discretize();
      // Undeclared exception!
      try { 
        discretize0.setAttributeIndices((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("weka.core.Range", e);
      }
  }

  /**
  //Test case number: 25
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      Discretize discretize0 = new Discretize();
      boolean boolean0 = discretize0.getFindNumBins();
      assertEquals((-1.0), discretize0.getDesiredWeightOfInstancesPerInterval(), 0.01);
      assertFalse(discretize0.getUseBinNumbers());
      assertFalse(discretize0.getUseEqualFrequency());
      assertEquals(10, discretize0.getBins());
      assertFalse(discretize0.getMakeBinary());
      assertFalse(boolean0);
  }

  /**
  //Test case number: 26
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      Discretize discretize0 = new Discretize();
      discretize0.setDesiredWeightOfInstancesPerInterval((-1127.31017652));
      assertEquals((-1127.31017652), discretize0.getDesiredWeightOfInstancesPerInterval(), 0.01);
  }

  /**
  //Test case number: 27
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      Discretize discretize0 = new Discretize();
      discretize0.setBins(9997);
      assertEquals(9997, discretize0.getBins());
  }

  /**
  //Test case number: 28
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      Discretize discretize0 = new Discretize();
      discretize0.getInvertSelection();
      assertFalse(discretize0.getUseEqualFrequency());
      assertFalse(discretize0.getMakeBinary());
      assertFalse(discretize0.getUseBinNumbers());
      assertEquals(10, discretize0.getBins());
      assertFalse(discretize0.getFindNumBins());
      assertEquals((-1.0), discretize0.getDesiredWeightOfInstancesPerInterval(), 0.01);
  }

  /**
  //Test case number: 29
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      Discretize discretize0 = new Discretize("-Y");
      discretize0.setUseEqualFrequency(false);
      assertFalse(discretize0.getMakeBinary());
      assertFalse(discretize0.getFindNumBins());
      assertFalse(discretize0.getUseBinNumbers());
      assertFalse(discretize0.getUseEqualFrequency());
      assertEquals(10, discretize0.getBins());
      assertEquals((-1.0), discretize0.getDesiredWeightOfInstancesPerInterval(), 0.01);
  }

  /**
  //Test case number: 30
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      Discretize discretize0 = new Discretize("Rp)~P{*");
      discretize0.setOutputFormat();
      assertFalse(discretize0.getMakeBinary());
      assertFalse(discretize0.getFindNumBins());
      assertEquals((-1.0), discretize0.getDesiredWeightOfInstancesPerInterval(), 0.01);
      assertEquals(10, discretize0.getBins());
      assertFalse(discretize0.getUseBinNumbers());
      assertFalse(discretize0.getUseEqualFrequency());
  }

  /**
  //Test case number: 31
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      Discretize discretize0 = new Discretize();
      double[][] doubleArray0 = new double[1][2];
      discretize0.m_CutPoints = doubleArray0;
      // Undeclared exception!
      try { 
        discretize0.setOutputFormat();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("weka.filters.unsupervised.attribute.Discretize", e);
      }
  }

  /**
  //Test case number: 32
  /*Coverage entropy=1.0375911080918452
  */
  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      Discretize discretize0 = new Discretize();
      double[][] doubleArray0 = new double[6][8];
      discretize0.m_CutPoints = doubleArray0;
      String string0 = discretize0.getBinRangesString(5);
      assertEquals(10, discretize0.getBins());
      assertFalse(discretize0.getUseBinNumbers());
      assertFalse(discretize0.getUseEqualFrequency());
      assertEquals("(-inf-0],(0-0],(0-0],(0-0],(0-0],(0-0],(0-0],(0-0],(0-inf)", string0);
      assertEquals((-1.0), discretize0.getDesiredWeightOfInstancesPerInterval(), 0.01);
  }

  /**
  //Test case number: 33
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      Discretize discretize0 = new Discretize("Can't ignore class when changing the number of attributes!");
      discretize0.getBinRangesString((-2111085617));
      assertEquals(10, discretize0.getBins());
      assertFalse(discretize0.getUseBinNumbers());
      assertFalse(discretize0.getUseEqualFrequency());
      assertFalse(discretize0.getMakeBinary());
      assertEquals((-1.0), discretize0.getDesiredWeightOfInstancesPerInterval(), 0.01);
      assertFalse(discretize0.getFindNumBins());
  }

  /**
  //Test case number: 34
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      Discretize discretize0 = new Discretize();
      double[][] doubleArray0 = new double[6][8];
      discretize0.m_CutPoints = doubleArray0;
      // Undeclared exception!
      try { 
        discretize0.getBinRangesString(172);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 172
         //
         verifyException("weka.filters.unsupervised.attribute.Discretize", e);
      }
  }

  /**
  //Test case number: 35
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      Discretize discretize0 = new Discretize();
      discretize0.getCutPoints(0);
      assertFalse(discretize0.getFindNumBins());
      assertEquals(10, discretize0.getBins());
      assertFalse(discretize0.getMakeBinary());
      assertEquals((-1.0), discretize0.getDesiredWeightOfInstancesPerInterval(), 0.01);
      assertFalse(discretize0.getUseBinNumbers());
      assertFalse(discretize0.getUseEqualFrequency());
  }

  /**
  //Test case number: 36
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      Discretize discretize0 = new Discretize();
      double[][] doubleArray0 = new double[1][2];
      discretize0.m_CutPoints = doubleArray0;
      // Undeclared exception!
      try { 
        discretize0.getCutPoints(2258);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 2258
         //
         verifyException("weka.filters.unsupervised.attribute.Discretize", e);
      }
  }

  /**
  //Test case number: 37
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      Discretize discretize0 = new Discretize();
      // Undeclared exception!
      try { 
        discretize0.batchFinished();
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // No input instance format defined
         //
         verifyException("weka.filters.unsupervised.attribute.Discretize", e);
      }
  }

  /**
  //Test case number: 38
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      Discretize discretize0 = new Discretize();
      double[] doubleArray0 = new double[7];
      DenseInstance denseInstance0 = new DenseInstance(79, doubleArray0);
      // Undeclared exception!
      try { 
        discretize0.input(denseInstance0);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // No input instance format defined
         //
         verifyException("weka.filters.unsupervised.attribute.Discretize", e);
      }
  }

  /**
  //Test case number: 39
  /*Coverage entropy=1.3321790402101223
  */
  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      Discretize discretize0 = new Discretize();
      discretize0.m_IgnoreClass = true;
      discretize0.setMakeBinary(true);
      try { 
        discretize0.setInputFormat((Instances) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Can't ignore class when changing the number of attributes!
         //
         verifyException("weka.filters.unsupervised.attribute.Discretize", e);
      }
  }

  /**
  //Test case number: 40
  /*Coverage entropy=1.7478680974667573
  */
  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      Discretize discretize0 = new Discretize();
      discretize0.setMakeBinary(true);
      try { 
        discretize0.setInputFormat((Instances) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("weka.filters.Filter", e);
      }
  }

  /**
  //Test case number: 41
  /*Coverage entropy=1.6094379124341005
  */
  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      Discretize discretize0 = new Discretize();
      ArrayList<Attribute> arrayList0 = new ArrayList<Attribute>();
      Instances instances0 = new Instances("unknown(", arrayList0, 6);
      try { 
        discretize0.setInputFormat(instances0);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // weka.filters.unsupervised.attribute.Discretize: No attributes!
         //
         verifyException("weka.core.Capabilities", e);
      }
  }

  /**
  //Test case number: 42
  /*Coverage entropy=1.3862943611198906
  */
  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      Discretize discretize0 = new Discretize();
      assertFalse(discretize0.getMakeBinary());
      
      discretize0.m_MakeBinary = true;
      discretize0.getCapabilities();
      assertTrue(discretize0.getMakeBinary());
  }

  /**
  //Test case number: 43
  /*Coverage entropy=2.03195622385697
  */
  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      Discretize discretize0 = new Discretize("");
      String[] stringArray0 = discretize0.getOptions();
      assertEquals((-1.0), discretize0.getDesiredWeightOfInstancesPerInterval(), 0.01);
      assertEquals(4, stringArray0.length);
      assertEquals(10, discretize0.getBins());
  }

  /**
  //Test case number: 44
  /*Coverage entropy=2.133628922152431
  */
  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      Discretize discretize0 = new Discretize("Rp)~P{*");
      discretize0.setInvertSelection(true);
      String[] stringArray0 = discretize0.getOptions();
      assertEquals((-1.0), discretize0.getDesiredWeightOfInstancesPerInterval(), 0.01);
      assertEquals(7, stringArray0.length);
      assertEquals(10, discretize0.getBins());
  }

  /**
  //Test case number: 45
  /*Coverage entropy=2.133628922152431
  */
  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      Discretize discretize0 = new Discretize("(|QlSRS?IwqU4P51h3");
      assertFalse(discretize0.getFindNumBins());
      
      discretize0.setFindNumBins(true);
      discretize0.getOptions();
      assertTrue(discretize0.getFindNumBins());
  }

  /**
  //Test case number: 46
  /*Coverage entropy=2.133628922152431
  */
  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      Discretize discretize0 = new Discretize();
      assertFalse(discretize0.getUseBinNumbers());
      
      discretize0.setUseBinNumbers(true);
      discretize0.getOptions();
      assertTrue(discretize0.getUseBinNumbers());
  }

  /**
  //Test case number: 47
  /*Coverage entropy=2.03195622385697
  */
  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      Discretize discretize0 = new Discretize();
      assertFalse(discretize0.getMakeBinary());
      
      discretize0.m_MakeBinary = true;
      discretize0.getOptions();
      assertTrue(discretize0.getMakeBinary());
  }

  /**
  //Test case number: 48
  /*Coverage entropy=1.9661755171495705
  */
  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      Discretize discretize0 = new Discretize();
      discretize0.setIgnoreClass(true);
      String[] stringArray0 = discretize0.getOptions();
      assertEquals((-1.0), discretize0.getDesiredWeightOfInstancesPerInterval(), 0.01);
      assertEquals(7, stringArray0.length);
      assertEquals(10, discretize0.getBins());
  }

  /**
  //Test case number: 49
  /*Coverage entropy=2.6476849213228197
  */
  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      Discretize discretize0 = new Discretize();
      String[] stringArray0 = discretize0.getOptions();
      discretize0.setOptions(stringArray0);
      assertEquals(10, discretize0.getBins());
      assertEquals(6, stringArray0.length);
      assertEquals((-1.0), discretize0.getDesiredWeightOfInstancesPerInterval(), 0.01);
      assertFalse(discretize0.getUseBinNumbers());
      assertFalse(discretize0.getMakeBinary());
      assertFalse(discretize0.getUseEqualFrequency());
      assertFalse(discretize0.getFindNumBins());
  }

  /**
  //Test case number: 50
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      Discretize discretize0 = new Discretize("Rp)~P{*");
      String string0 = discretize0.invertSelectionTipText();
      assertEquals((-1.0), discretize0.getDesiredWeightOfInstancesPerInterval(), 0.01);
      assertFalse(discretize0.getUseBinNumbers());
      assertEquals(10, discretize0.getBins());
      assertFalse(discretize0.getMakeBinary());
      assertEquals("Set attribute selection mode. If false, only selected (numeric) attributes in the range will be discretized; if true, only non-selected attributes will be discretized.", string0);
      assertFalse(discretize0.getFindNumBins());
      assertFalse(discretize0.getUseEqualFrequency());
  }

  /**
  //Test case number: 51
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      Discretize discretize0 = new Discretize("(|QlSRS?IwqU4P51h3");
      String string0 = discretize0.useEqualFrequencyTipText();
      assertFalse(discretize0.getMakeBinary());
      assertFalse(discretize0.getFindNumBins());
      assertFalse(discretize0.getUseEqualFrequency());
      assertEquals("If set to true, equal-frequency binning will be used instead of equal-width binning.", string0);
      assertFalse(discretize0.getUseBinNumbers());
      assertEquals(10, discretize0.getBins());
      assertEquals((-1.0), discretize0.getDesiredWeightOfInstancesPerInterval(), 0.01);
  }

  /**
  //Test case number: 52
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      Discretize discretize0 = new Discretize("(|QlSRS?IwqU4P51h3");
      String string0 = discretize0.useBinNumbersTipText();
      assertEquals((-1.0), discretize0.getDesiredWeightOfInstancesPerInterval(), 0.01);
      assertFalse(discretize0.getUseBinNumbers());
      assertFalse(discretize0.getFindNumBins());
      assertFalse(discretize0.getUseEqualFrequency());
      assertEquals("Use bin numbers (eg BXofY) rather than ranges for for discretized attributes", string0);
      assertEquals(10, discretize0.getBins());
      assertFalse(discretize0.getMakeBinary());
  }

  /**
  //Test case number: 53
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      Discretize discretize0 = new Discretize("Refreshing GOE props...");
      String string0 = discretize0.globalInfo();
      assertEquals((-1.0), discretize0.getDesiredWeightOfInstancesPerInterval(), 0.01);
      assertFalse(discretize0.getUseBinNumbers());
      assertEquals("An instance filter that discretizes a range of numeric attributes in the dataset into nominal attributes. Discretization is by simple binning. Skips the class attribute if set.", string0);
      assertFalse(discretize0.getUseEqualFrequency());
      assertFalse(discretize0.getFindNumBins());
      assertEquals(10, discretize0.getBins());
      assertFalse(discretize0.getMakeBinary());
  }

  /**
  //Test case number: 54
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      Discretize discretize0 = new Discretize("Rp)~P{*");
      String string0 = discretize0.binsTipText();
      assertFalse(discretize0.getMakeBinary());
      assertFalse(discretize0.getFindNumBins());
      assertEquals("Number of bins.", string0);
      assertFalse(discretize0.getUseEqualFrequency());
      assertFalse(discretize0.getUseBinNumbers());
      assertEquals(10, discretize0.getBins());
      assertEquals((-1.0), discretize0.getDesiredWeightOfInstancesPerInterval(), 0.01);
  }

  /**
  //Test case number: 55
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      Discretize discretize0 = new Discretize("14!CMgJrH");
      String string0 = discretize0.makeBinaryTipText();
      assertEquals("Make resulting attributes binary.", string0);
      assertFalse(discretize0.getFindNumBins());
      assertFalse(discretize0.getUseEqualFrequency());
      assertEquals((-1.0), discretize0.getDesiredWeightOfInstancesPerInterval(), 0.01);
      assertFalse(discretize0.getUseBinNumbers());
      assertEquals(10, discretize0.getBins());
      assertFalse(discretize0.getMakeBinary());
  }

  /**
  //Test case number: 56
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test56()  throws Throwable  {
      String[] stringArray0 = new String[7];
      Discretize.main(stringArray0);
      assertEquals(7, stringArray0.length);
  }

  /**
  //Test case number: 57
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test57()  throws Throwable  {
      Discretize discretize0 = new Discretize();
      String string0 = discretize0.getRevision();
      assertEquals((-1.0), discretize0.getDesiredWeightOfInstancesPerInterval(), 0.01);
      assertFalse(discretize0.getUseBinNumbers());
      assertFalse(discretize0.getFindNumBins());
      assertEquals("8964", string0);
      assertFalse(discretize0.getUseEqualFrequency());
      assertEquals(10, discretize0.getBins());
      assertFalse(discretize0.getMakeBinary());
  }

  /**
  //Test case number: 58
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test58()  throws Throwable  {
      Discretize discretize0 = new Discretize("-Y");
      String string0 = discretize0.desiredWeightOfInstancesPerIntervalTipText();
      assertFalse(discretize0.getFindNumBins());
      assertFalse(discretize0.getUseEqualFrequency());
      assertEquals("Sets the desired weight of instances per interval for equal-frequency binning.", string0);
      assertEquals((-1.0), discretize0.getDesiredWeightOfInstancesPerInterval(), 0.01);
      assertFalse(discretize0.getUseBinNumbers());
      assertEquals(10, discretize0.getBins());
      assertFalse(discretize0.getMakeBinary());
  }

  /**
  //Test case number: 59
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test59()  throws Throwable  {
      Discretize discretize0 = new Discretize("Rp)~P{*");
      String string0 = discretize0.attributeIndicesTipText();
      assertFalse(discretize0.getMakeBinary());
      assertEquals("Specify range of attributes to act on. This is a comma separated list of attribute indices, with \"first\" and \"last\" valid values. Specify an inclusive range with \"-\". E.g: \"first-3,5,6-10,last\".", string0);
      assertFalse(discretize0.getUseEqualFrequency());
      assertFalse(discretize0.getUseBinNumbers());
      assertEquals(10, discretize0.getBins());
      assertEquals((-1.0), discretize0.getDesiredWeightOfInstancesPerInterval(), 0.01);
      assertFalse(discretize0.getFindNumBins());
  }

  /**
  //Test case number: 60
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test60()  throws Throwable  {
      Discretize discretize0 = new Discretize("(|QlSRS?IwqU4P51h3");
      String string0 = discretize0.findNumBinsTipText();
      assertEquals((-1.0), discretize0.getDesiredWeightOfInstancesPerInterval(), 0.01);
      assertFalse(discretize0.getUseBinNumbers());
      assertEquals(10, discretize0.getBins());
      assertFalse(discretize0.getMakeBinary());
      assertEquals("Optimize number of equal-width bins using leave-one-out. Doesn't work for equal-frequency binning", string0);
      assertFalse(discretize0.getUseEqualFrequency());
      assertFalse(discretize0.getFindNumBins());
  }

  /**
  //Test case number: 61
  /*Coverage entropy=2.3393717343898155
  */
  @Test(timeout = 4000)
  public void test61()  throws Throwable  {
      Discretize discretize0 = new Discretize("-Y");
      assertFalse(discretize0.getUseBinNumbers());
      
      String[] stringArray0 = new String[3];
      stringArray0[0] = "D";
      stringArray0[1] = "-Y";
      stringArray0[2] = "-Y";
      Filter.runFilter(discretize0, stringArray0);
      boolean boolean0 = discretize0.getUseBinNumbers();
      assertTrue(boolean0);
  }

  /**
  //Test case number: 62
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test62()  throws Throwable  {
      Discretize discretize0 = new Discretize();
      // Undeclared exception!
      try { 
        discretize0.setAttributeIndicesArray((int[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("weka.core.Range", e);
      }
  }

  /**
  //Test case number: 63
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test63()  throws Throwable  {
      Discretize discretize0 = new Discretize("Kj_71|h^'5~Vm4y.-");
      boolean boolean0 = discretize0.getUseBinNumbers();
      assertFalse(discretize0.getMakeBinary());
      assertFalse(discretize0.getUseEqualFrequency());
      assertEquals(10, discretize0.getBins());
      assertEquals((-1.0), discretize0.getDesiredWeightOfInstancesPerInterval(), 0.01);
      assertFalse(boolean0);
      assertFalse(discretize0.getFindNumBins());
  }
}
