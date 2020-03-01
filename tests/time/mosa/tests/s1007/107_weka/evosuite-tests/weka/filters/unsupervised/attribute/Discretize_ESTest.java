/*
 * This file was automatically generated by EvoSuite
 * Wed Dec 04 19:39:48 GMT 2019
 */

package weka.filters.unsupervised.attribute;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.ArrayList;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.testdata.EvoSuiteFile;
import org.evosuite.runtime.testdata.FileSystemHandling;
import org.junit.runner.RunWith;
import weka.core.Attribute;
import weka.core.DenseInstance;
import weka.core.Instance;
import weka.core.Instances;
import weka.core.Range;
import weka.filters.Filter;
import weka.filters.unsupervised.attribute.Discretize;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class Discretize_ESTest extends Discretize_ESTest_scaffolding {

  /**
  //Test case number: 0
  /*Coverage entropy=1.830738805564335
  */
  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Discretize discretize0 = new Discretize();
      discretize0.m_UseBinNumbers = true;
      discretize0.getUseBinNumbers();
      // Undeclared exception!
      try { 
        discretize0.findNumBins(86);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("weka.filters.unsupervised.attribute.Discretize", e);
      }
  }

  /**
  //Test case number: 1
  /*Coverage entropy=1.543056733112554
  */
  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Discretize discretize0 = new Discretize();
      discretize0.setMakeBinary(true);
      discretize0.m_IgnoreClass = true;
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
  //Test case number: 2
  /*Coverage entropy=1.6759877943001849
  */
  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Discretize discretize0 = new Discretize();
      double[][] doubleArray0 = new double[3][8];
      FileSystemHandling.appendLineToFile((EvoSuiteFile) null, "Int");
      discretize0.m_CutPoints = doubleArray0;
      String string0 = discretize0.getBinRangesString(2);
      assertEquals("(-inf-0],(0-0],(0-0],(0-0],(0-0],(0-0],(0-0],(0-0],(0-inf)", string0);
      
      discretize0.getCutPoints(2);
      assertFalse(discretize0.getFindNumBins());
      assertEquals(10, discretize0.getBins());
      assertEquals((-1.0), discretize0.getDesiredWeightOfInstancesPerInterval(), 0.01);
      assertFalse(discretize0.getUseBinNumbers());
      assertFalse(discretize0.getUseEqualFrequency());
  }

  /**
  //Test case number: 3
  /*Coverage entropy=2.3448446247581227
  */
  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Discretize discretize0 = new Discretize();
      discretize0.m_DiscretizeCols = null;
      discretize0.setMakeBinary(true);
      // Undeclared exception!
      try { 
        discretize0.getOptions();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("weka.filters.unsupervised.attribute.Discretize", e);
      }
  }

  /**
  //Test case number: 4
  /*Coverage entropy=2.253297930766516
  */
  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Discretize discretize0 = new Discretize();
      discretize0.setMakeBinary(true);
      discretize0.getMakeBinary();
      discretize0.getRevision();
      // Undeclared exception!
      try { 
        discretize0.findNumBins((-1968526675));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("weka.filters.unsupervised.attribute.Discretize", e);
      }
  }

  /**
  //Test case number: 5
  /*Coverage entropy=2.879376754279852
  */
  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Discretize discretize0 = new Discretize();
      discretize0.setInvertSelection(true);
      String[] stringArray0 = discretize0.getOptions();
      assertEquals(7, stringArray0.length);
      assertEquals((-1.0), discretize0.getDesiredWeightOfInstancesPerInterval(), 0.01);
      assertEquals(10, discretize0.getBins());
  }

  /**
  //Test case number: 6
  /*Coverage entropy=2.68644405381145
  */
  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Discretize discretize0 = new Discretize();
      discretize0.getAttributeIndices();
      String[] stringArray0 = new String[7];
      stringArray0[0] = "first-last";
      stringArray0[1] = "irst optionslit up:";
      stringArray0[2] = "first-last";
      stringArray0[3] = "-B";
      stringArray0[4] = "M";
      stringArray0[5] = "EQ|EfQ_[1IT\"@";
      stringArray0[6] = "Y3?%4g`W-}v8";
      try { 
        discretize0.setOptions(stringArray0);
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // For input string: \"M\"
         //
         verifyException("java.lang.NumberFormatException", e);
      }
  }

  /**
  //Test case number: 7
  /*Coverage entropy=2.253297930766516
  */
  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Discretize discretize0 = new Discretize();
      discretize0.setFindNumBins(true);
      discretize0.getFindNumBins();
      discretize0.findNumBinsTipText();
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
  //Test case number: 8
  /*Coverage entropy=2.41257681572198
  */
  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Discretize discretize0 = new Discretize("j+fL)$y2iCk&Xws=zj");
      discretize0.setBins(263);
      discretize0.setUseEqualFrequency(true);
      discretize0.m_ClassIndex = 1289;
      discretize0.getFindNumBins();
      discretize0.getUseEqualFrequency();
      discretize0.getInvertSelection();
      assertEquals(263, discretize0.getBins());
  }

  /**
  //Test case number: 9
  /*Coverage entropy=1.1217186091313738
  */
  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Discretize discretize0 = new Discretize();
      double[][] doubleArray0 = new double[9][8];
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
  //Test case number: 10
  /*Coverage entropy=2.4605276524283983
  */
  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
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
  //Test case number: 11
  /*Coverage entropy=2.879376754279852
  */
  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Discretize discretize0 = new Discretize();
      assertFalse(discretize0.getFindNumBins());
      
      discretize0.setFindNumBins(true);
      discretize0.getOptions();
      assertTrue(discretize0.getFindNumBins());
  }

  /**
  //Test case number: 12
  /*Coverage entropy=1.5271837172395382
  */
  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Discretize discretize0 = new Discretize();
      double[][] doubleArray0 = new double[8][8];
      discretize0.m_CutPoints = doubleArray0;
      // Undeclared exception!
      try { 
        discretize0.getBinRangesString((-1908874351));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -1908874351
         //
         verifyException("weka.filters.unsupervised.attribute.Discretize", e);
      }
  }

  /**
  //Test case number: 13
  /*Coverage entropy=1.5190725895733266
  */
  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Discretize discretize0 = new Discretize();
      double[][] doubleArray0 = new double[8][8];
      discretize0.m_CutPoints = doubleArray0;
      discretize0.getBinRangesString(2);
      // Undeclared exception!
      try { 
        discretize0.getCutPoints((-1355));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -1355
         //
         verifyException("weka.filters.unsupervised.attribute.Discretize", e);
      }
  }

  /**
  //Test case number: 14
  /*Coverage entropy=2.4164983843494308
  */
  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Discretize discretize0 = new Discretize();
      int[] intArray0 = new int[3];
      intArray0[0] = 69;
      intArray0[1] = 10;
      intArray0[2] = (-413);
      discretize0.setAttributeIndicesArray(intArray0);
      assertEquals((-1.0), discretize0.getDesiredWeightOfInstancesPerInterval(), 0.01);
      
      discretize0.setDesiredWeightOfInstancesPerInterval(0.0);
      discretize0.getRevision();
      discretize0.getDesiredWeightOfInstancesPerInterval();
      discretize0.getInvertSelection();
      assertEquals(0.0, discretize0.getDesiredWeightOfInstancesPerInterval(), 0.01);
  }

  /**
  //Test case number: 15
  /*Coverage entropy=2.5102170934221872
  */
  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Discretize discretize0 = new Discretize();
      Range range0 = new Range();
      discretize0.m_DiscretizeCols = range0;
      String[] stringArray0 = discretize0.getOptions();
      assertEquals((-1.0), discretize0.getDesiredWeightOfInstancesPerInterval(), 0.01);
      assertEquals(10, discretize0.getBins());
      assertEquals(4, stringArray0.length);
  }

  /**
  //Test case number: 16
  /*Coverage entropy=1.830738805564335
  */
  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Discretize discretize0 = new Discretize();
      discretize0.setBins((-906));
      discretize0.getBins();
      DenseInstance denseInstance0 = null;
      try {
        denseInstance0 = new DenseInstance((-906));
        fail("Expecting exception: NegativeArraySizeException");
      
      } catch(NegativeArraySizeException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("weka.core.DenseInstance", e);
      }
  }

  /**
  //Test case number: 17
  /*Coverage entropy=2.51195622385697
  */
  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Discretize discretize0 = new Discretize();
      discretize0.setIgnoreClass(true);
      String[] stringArray0 = discretize0.getOptions();
      assertEquals((-1.0), discretize0.getDesiredWeightOfInstancesPerInterval(), 0.01);
      assertEquals(10, discretize0.getBins());
      assertEquals(7, stringArray0.length);
  }

  /**
  //Test case number: 18
  /*Coverage entropy=1.5271837172395382
  */
  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
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
  //Test case number: 19
  /*Coverage entropy=2.063983366979555
  */
  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Discretize discretize0 = new Discretize();
      ArrayList<Attribute> arrayList0 = new ArrayList<Attribute>();
      Instances instances0 = new Instances("Optimize number of bins using leave-one-out estimate\n\tof estimated entropy (for equal-width discretization).\n\tIf this is set then the -B option will be ignored.", arrayList0, 10);
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
  //Test case number: 20
  /*Coverage entropy=1.5531577432135641
  */
  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Discretize discretize0 = new Discretize();
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
  //Test case number: 21
  /*Coverage entropy=2.218456332760875
  */
  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Discretize discretize0 = new Discretize();
      discretize0.setMakeBinary(true);
      discretize0.getCapabilities();
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
  //Test case number: 22
  /*Coverage entropy=3.1365738102117087
  */
  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Discretize discretize0 = new Discretize();
      assertFalse(discretize0.getUseBinNumbers());
      
      discretize0.setUseBinNumbers(true);
      String[] stringArray0 = discretize0.getOptions();
      discretize0.setOptions(stringArray0);
      assertTrue(discretize0.getUseBinNumbers());
  }

  /**
  //Test case number: 23
  /*Coverage entropy=1.5271837172395382
  */
  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      Discretize discretize0 = new Discretize();
      String string0 = discretize0.useEqualFrequencyTipText();
      assertEquals("If set to true, equal-frequency binning will be used instead of equal-width binning.", string0);
      assertEquals(10, discretize0.getBins());
      assertFalse(discretize0.getMakeBinary());
      assertEquals((-1.0), discretize0.getDesiredWeightOfInstancesPerInterval(), 0.01);
      assertFalse(discretize0.getUseBinNumbers());
      assertFalse(discretize0.getFindNumBins());
      assertFalse(discretize0.getUseEqualFrequency());
  }

  /**
  //Test case number: 24
  /*Coverage entropy=1.5271837172395382
  */
  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      Discretize discretize0 = new Discretize();
      String string0 = discretize0.invertSelectionTipText();
      assertEquals(10, discretize0.getBins());
      assertEquals("Set attribute selection mode. If false, only selected (numeric) attributes in the range will be discretized; if true, only non-selected attributes will be discretized.", string0);
      assertFalse(discretize0.getUseBinNumbers());
      assertFalse(discretize0.getUseEqualFrequency());
      assertFalse(discretize0.getMakeBinary());
      assertFalse(discretize0.getFindNumBins());
      assertEquals((-1.0), discretize0.getDesiredWeightOfInstancesPerInterval(), 0.01);
  }

  /**
  //Test case number: 25
  /*Coverage entropy=2.879376754279852
  */
  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      Discretize discretize0 = new Discretize();
      assertFalse(discretize0.getMakeBinary());
      
      discretize0.setMakeBinary(true);
      discretize0.getOptions();
      assertTrue(discretize0.getMakeBinary());
  }

  /**
  //Test case number: 26
  /*Coverage entropy=1.1217186091313738
  */
  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      Discretize discretize0 = new Discretize();
      // Undeclared exception!
      try { 
        discretize0.calculateCutPointsByEqualWidthBinning((-1361));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("weka.filters.unsupervised.attribute.Discretize", e);
      }
  }

  /**
  //Test case number: 27
  /*Coverage entropy=1.5271837172395382
  */
  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      Discretize discretize0 = new Discretize();
      String string0 = discretize0.makeBinaryTipText();
      assertFalse(discretize0.getMakeBinary());
      assertEquals("Make resulting attributes binary.", string0);
      assertFalse(discretize0.getFindNumBins());
      assertEquals((-1.0), discretize0.getDesiredWeightOfInstancesPerInterval(), 0.01);
      assertEquals(10, discretize0.getBins());
      assertFalse(discretize0.getUseEqualFrequency());
      assertFalse(discretize0.getUseBinNumbers());
  }

  /**
  //Test case number: 28
  /*Coverage entropy=1.830738805564335
  */
  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      Discretize discretize0 = new Discretize();
      discretize0.setUseBinNumbers(false);
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
  //Test case number: 29
  /*Coverage entropy=1.5271837172395382
  */
  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      Discretize discretize0 = new Discretize();
      String string0 = discretize0.attributeIndicesTipText();
      assertEquals("Specify range of attributes to act on. This is a comma separated list of attribute indices, with \"first\" and \"last\" valid values. Specify an inclusive range with \"-\". E.g: \"first-3,5,6-10,last\".", string0);
      assertEquals(10, discretize0.getBins());
      assertEquals((-1.0), discretize0.getDesiredWeightOfInstancesPerInterval(), 0.01);
      assertFalse(discretize0.getMakeBinary());
      assertFalse(discretize0.getFindNumBins());
      assertFalse(discretize0.getUseEqualFrequency());
      assertFalse(discretize0.getUseBinNumbers());
  }

  /**
  //Test case number: 30
  /*Coverage entropy=2.063983366979555
  */
  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      Discretize discretize0 = new Discretize();
      discretize0.m_DesiredWeightOfInstancesPerInterval = 1.7976931348623157E308;
      discretize0.getCapabilities();
      double double0 = discretize0.getDesiredWeightOfInstancesPerInterval();
      assertEquals(1.7976931348623157E308, double0, 0.01);
  }

  /**
  //Test case number: 31
  /*Coverage entropy=2.879376754279852
  */
  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      Discretize discretize0 = new Discretize();
      assertFalse(discretize0.getUseEqualFrequency());
      
      discretize0.setUseEqualFrequency(true);
      discretize0.getOptions();
      assertTrue(discretize0.getUseEqualFrequency());
  }

  /**
  //Test case number: 32
  /*Coverage entropy=1.830738805564335
  */
  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      Discretize discretize0 = new Discretize();
      assertEquals((-1.0), discretize0.getDesiredWeightOfInstancesPerInterval(), 0.01);
      
      discretize0.setDesiredWeightOfInstancesPerInterval(0.0);
      discretize0.setOutputFormat();
      assertEquals(0.0, discretize0.getDesiredWeightOfInstancesPerInterval(), 0.01);
  }

  /**
  //Test case number: 33
  /*Coverage entropy=1.5271837172395382
  */
  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      Discretize discretize0 = new Discretize();
      String string0 = discretize0.globalInfo();
      assertFalse(discretize0.getMakeBinary());
      assertFalse(discretize0.getUseEqualFrequency());
      assertFalse(discretize0.getUseBinNumbers());
      assertEquals(10, discretize0.getBins());
      assertEquals("An instance filter that discretizes a range of numeric attributes in the dataset into nominal attributes. Discretization is by simple binning. Skips the class attribute if set.", string0);
      assertEquals((-1.0), discretize0.getDesiredWeightOfInstancesPerInterval(), 0.01);
      assertFalse(discretize0.getFindNumBins());
  }

  /**
  //Test case number: 34
  /*Coverage entropy=1.5271837172395382
  */
  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      Discretize discretize0 = new Discretize();
      String[] stringArray0 = new String[1];
      stringArray0[0] = null;
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
  //Test case number: 35
  /*Coverage entropy=1.5271837172395382
  */
  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      Discretize discretize0 = new Discretize();
      boolean boolean0 = discretize0.getUseEqualFrequency();
      assertFalse(discretize0.getFindNumBins());
      assertEquals((-1.0), discretize0.getDesiredWeightOfInstancesPerInterval(), 0.01);
      assertFalse(discretize0.getUseBinNumbers());
      assertFalse(boolean0);
      assertEquals(10, discretize0.getBins());
      assertFalse(discretize0.getMakeBinary());
  }

  /**
  //Test case number: 36
  /*Coverage entropy=1.1217186091313738
  */
  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      Discretize discretize0 = new Discretize();
      discretize0.getBinRangesString((-3455));
      assertFalse(discretize0.getMakeBinary());
      assertFalse(discretize0.getFindNumBins());
      assertEquals((-1.0), discretize0.getDesiredWeightOfInstancesPerInterval(), 0.01);
      assertEquals(10, discretize0.getBins());
      assertFalse(discretize0.getUseBinNumbers());
      assertFalse(discretize0.getUseEqualFrequency());
  }

  /**
  //Test case number: 37
  /*Coverage entropy=2.6151104036339126
  */
  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      Discretize discretize0 = new Discretize();
      discretize0.getOptions();
      String[] stringArray0 = new String[6];
      stringArray0[0] = "9TXs";
      stringArray0[1] = "DenseInstance has accesss to a dataset!";
      stringArray0[2] = "0!~E:ro";
      stringArray0[3] = "@end ";
      stringArray0[4] = "-";
      stringArray0[5] = "f[vl>)-2d.|cv*";
      try { 
        discretize0.setOptions(stringArray0);
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
      }
  }

  /**
  //Test case number: 38
  /*Coverage entropy=1.5271837172395382
  */
  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      Discretize discretize0 = new Discretize();
      String string0 = discretize0.desiredWeightOfInstancesPerIntervalTipText();
      assertFalse(discretize0.getFindNumBins());
      assertFalse(discretize0.getUseEqualFrequency());
      assertFalse(discretize0.getMakeBinary());
      assertEquals("Sets the desired weight of instances per interval for equal-frequency binning.", string0);
      assertFalse(discretize0.getUseBinNumbers());
      assertEquals(10, discretize0.getBins());
      assertEquals((-1.0), discretize0.getDesiredWeightOfInstancesPerInterval(), 0.01);
  }

  /**
  //Test case number: 39
  /*Coverage entropy=1.5271837172395382
  */
  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      Discretize discretize0 = new Discretize();
      boolean boolean0 = discretize0.getFindNumBins();
      assertFalse(discretize0.getUseEqualFrequency());
      assertFalse(discretize0.getMakeBinary());
      assertFalse(discretize0.getUseBinNumbers());
      assertEquals(10, discretize0.getBins());
      assertFalse(boolean0);
      assertEquals((-1.0), discretize0.getDesiredWeightOfInstancesPerInterval(), 0.01);
  }

  /**
  //Test case number: 40
  /*Coverage entropy=1.5271837172395382
  */
  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      Discretize discretize0 = new Discretize();
      int int0 = discretize0.getBins();
      assertEquals((-1.0), discretize0.getDesiredWeightOfInstancesPerInterval(), 0.01);
      assertFalse(discretize0.getMakeBinary());
      assertEquals(10, int0);
      assertFalse(discretize0.getFindNumBins());
      assertFalse(discretize0.getUseBinNumbers());
      assertFalse(discretize0.getUseEqualFrequency());
  }

  /**
  //Test case number: 41
  /*Coverage entropy=1.1217186091313738
  */
  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      Discretize discretize0 = new Discretize();
      // Undeclared exception!
      try { 
        discretize0.input((Instance) null);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // No input instance format defined
         //
         verifyException("weka.filters.unsupervised.attribute.Discretize", e);
      }
  }

  /**
  //Test case number: 42
  /*Coverage entropy=1.5531577432135641
  */
  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      Discretize discretize0 = new Discretize();
      int[] intArray0 = new int[1];
      discretize0.setAttributeIndicesArray(intArray0);
      discretize0.listOptions();
      assertEquals(10, discretize0.getBins());
      assertFalse(discretize0.getMakeBinary());
      assertEquals((-1.0), discretize0.getDesiredWeightOfInstancesPerInterval(), 0.01);
      assertFalse(discretize0.getUseBinNumbers());
      assertFalse(discretize0.getUseEqualFrequency());
      assertFalse(discretize0.getFindNumBins());
  }

  /**
  //Test case number: 43
  /*Coverage entropy=1.5271837172395382
  */
  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      Discretize discretize0 = new Discretize();
      String string0 = discretize0.binsTipText();
      assertFalse(discretize0.getFindNumBins());
      assertFalse(discretize0.getUseEqualFrequency());
      assertFalse(discretize0.getMakeBinary());
      assertEquals((-1.0), discretize0.getDesiredWeightOfInstancesPerInterval(), 0.01);
      assertEquals("Number of bins.", string0);
      assertFalse(discretize0.getUseBinNumbers());
      assertEquals(10, discretize0.getBins());
  }

  /**
  //Test case number: 44
  /*Coverage entropy=1.5271837172395382
  */
  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      Discretize discretize0 = new Discretize();
      double double0 = discretize0.getDesiredWeightOfInstancesPerInterval();
      assertEquals(10, discretize0.getBins());
      assertFalse(discretize0.getMakeBinary());
      assertEquals((-1.0), double0, 0.01);
      assertFalse(discretize0.getUseBinNumbers());
      assertFalse(discretize0.getFindNumBins());
      assertFalse(discretize0.getUseEqualFrequency());
  }

  /**
  //Test case number: 45
  /*Coverage entropy=1.5271837172395382
  */
  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      Discretize discretize0 = new Discretize();
      boolean boolean0 = discretize0.getUseBinNumbers();
      assertEquals(10, discretize0.getBins());
      assertFalse(discretize0.getUseEqualFrequency());
      assertFalse(discretize0.getMakeBinary());
      assertFalse(discretize0.getFindNumBins());
      assertEquals((-1.0), discretize0.getDesiredWeightOfInstancesPerInterval(), 0.01);
      assertFalse(boolean0);
  }

  /**
  //Test case number: 46
  /*Coverage entropy=1.5271837172395382
  */
  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      Discretize discretize0 = new Discretize();
      boolean boolean0 = discretize0.getMakeBinary();
      assertEquals((-1.0), discretize0.getDesiredWeightOfInstancesPerInterval(), 0.01);
      assertFalse(discretize0.getUseBinNumbers());
      assertEquals(10, discretize0.getBins());
      assertFalse(discretize0.getFindNumBins());
      assertFalse(discretize0.getUseEqualFrequency());
      assertFalse(boolean0);
  }

  /**
  //Test case number: 47
  /*Coverage entropy=1.1217186091313738
  */
  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      Discretize discretize0 = new Discretize();
      // Undeclared exception!
      try { 
        discretize0.calculateCutPointsByEqualFrequencyBinning((-56));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("weka.core.Instances", e);
      }
  }

  /**
  //Test case number: 48
  /*Coverage entropy=1.5271837172395382
  */
  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      Discretize discretize0 = new Discretize();
      String string0 = discretize0.useBinNumbersTipText();
      assertEquals(10, discretize0.getBins());
      assertFalse(discretize0.getUseEqualFrequency());
      assertFalse(discretize0.getUseBinNumbers());
      assertFalse(discretize0.getMakeBinary());
      assertFalse(discretize0.getFindNumBins());
      assertEquals("Use bin numbers (eg BXofY) rather than ranges for for discretized attributes", string0);
      assertEquals((-1.0), discretize0.getDesiredWeightOfInstancesPerInterval(), 0.01);
  }

  /**
  //Test case number: 49
  /*Coverage entropy=1.0931471805599453
  */
  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
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
  //Test case number: 50
  /*Coverage entropy=1.1217186091313738
  */
  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      Discretize discretize0 = new Discretize();
      discretize0.getCutPoints(1);
      assertFalse(discretize0.getFindNumBins());
      assertFalse(discretize0.getUseEqualFrequency());
      assertFalse(discretize0.getMakeBinary());
      assertFalse(discretize0.getUseBinNumbers());
      assertEquals(10, discretize0.getBins());
      assertEquals((-1.0), discretize0.getDesiredWeightOfInstancesPerInterval(), 0.01);
  }

  /**
  //Test case number: 51
  /*Coverage entropy=2.6772245773362195
  */
  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      Discretize discretize0 = new Discretize();
      try { 
        Filter.filterFile(discretize0, (String[]) null);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // 
         // Unable to determine structure as arff (Reason: org.evosuite.runtime.mock.java.lang.MockThrowable: premature end of file, read Token[EOF], line 1).
         // Filter options:
         // 
         // -unset-class-temporarily
         // \tUnsets the class index temporarily before the filter is
         // \tapplied to the data.
         // \t(default: no)
         // -B <num>
         // \tSpecifies the (maximum) number of bins to divide numeric attributes into.
         // \t(default = 10)
         // -M <num>
         // \tSpecifies the desired weight of instances per bin for
         // \tequal-frequency binning. If this is set to a positive
         // \tnumber then the -B option will be ignored.
         // \t(default = -1)
         // -F
         // \tUse equal-frequency instead of equal-width discretization.
         // -O
         // \tOptimize number of bins using leave-one-out estimate
         // \tof estimated entropy (for equal-width discretization).
         // \tIf this is set then the -B option will be ignored.
         // -R <col1,col2-col4,...>
         // \tSpecifies list of columns to Discretize. First and last are valid indexes.
         // \t(default: first-last)
         // -V
         // \tInvert matching sense of column indexes.
         // -D
         // \tOutput binary attributes for discretized attributes.
         // -Y
         // \tUse bin numbers rather than ranges for discretized attributes.
         // 
         // General options:
         // 
         // -h
         // \tGet help on available options.
         // \t(use -b -h for help on batch mode.)
         // -i <file>
         // \tThe name of the file containing input instances.
         // \tIf not supplied then instances will be read from stdin.
         // -o <file>
         // \tThe name of the file output instances will be written to.
         // \tIf not supplied then instances will be written to stdout.
         // -c <class index>
         // \tThe number of the attribute to use as the class.
         // \t\"first\" and \"last\" are also valid entries.
         // \tIf not supplied then no class is assigned.
         //
         verifyException("weka.filters.Filter", e);
      }
  }

  /**
  //Test case number: 52
  /*Coverage entropy=3.321585437079472
  */
  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      Discretize discretize0 = new Discretize();
      String[] stringArray0 = discretize0.getOptions();
      discretize0.setOptions(stringArray0);
      assertFalse(discretize0.getUseEqualFrequency());
      assertFalse(discretize0.getMakeBinary());
      assertFalse(discretize0.getFindNumBins());
      assertEquals(6, stringArray0.length);
      assertEquals(10, discretize0.getBins());
      assertEquals((-1.0), discretize0.getDesiredWeightOfInstancesPerInterval(), 0.01);
  }

  /**
  //Test case number: 53
  /*Coverage entropy=2.6151104036339126
  */
  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      Discretize discretize0 = new Discretize();
      discretize0.setInvertSelection(false);
      String[] stringArray0 = discretize0.getOptions();
      assertEquals((-1.0), discretize0.getDesiredWeightOfInstancesPerInterval(), 0.01);
      assertEquals(6, stringArray0.length);
      assertEquals(10, discretize0.getBins());
  }

  /**
  //Test case number: 54
  /*Coverage entropy=1.830738805564335
  */
  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      Discretize discretize0 = new Discretize();
      discretize0.setBins((-798));
      discretize0.setOutputFormat();
      assertEquals((-798), discretize0.getBins());
  }

  /**
  //Test case number: 55
  /*Coverage entropy=2.784066574475527
  */
  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      Discretize.main((String[]) null);
  }

  /**
  //Test case number: 56
  /*Coverage entropy=1.1217186091313738
  */
  @Test(timeout = 4000)
  public void test56()  throws Throwable  {
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
  //Test case number: 57
  /*Coverage entropy=1.1217186091313738
  */
  @Test(timeout = 4000)
  public void test57()  throws Throwable  {
      Discretize discretize0 = new Discretize();
      // Undeclared exception!
      try { 
        discretize0.convertInstance((Instance) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("weka.filters.unsupervised.attribute.Discretize", e);
      }
  }

  /**
  //Test case number: 58
  /*Coverage entropy=1.1217186091313738
  */
  @Test(timeout = 4000)
  public void test58()  throws Throwable  {
      Discretize discretize0 = new Discretize();
      discretize0.setAttributeIndices("First option split up:");
      assertFalse(discretize0.getMakeBinary());
      assertFalse(discretize0.getFindNumBins());
      assertEquals((-1.0), discretize0.getDesiredWeightOfInstancesPerInterval(), 0.01);
      assertEquals(10, discretize0.getBins());
      assertFalse(discretize0.getUseBinNumbers());
      assertFalse(discretize0.getUseEqualFrequency());
  }

  /**
  //Test case number: 59
  /*Coverage entropy=1.5271837172395382
  */
  @Test(timeout = 4000)
  public void test59()  throws Throwable  {
      Discretize discretize0 = new Discretize();
      Range range0 = new Range();
      discretize0.m_DiscretizeCols = range0;
      discretize0.getAttributeIndices();
      assertFalse(discretize0.getFindNumBins());
      assertFalse(discretize0.getUseEqualFrequency());
      assertEquals((-1.0), discretize0.getDesiredWeightOfInstancesPerInterval(), 0.01);
      assertFalse(discretize0.getUseBinNumbers());
      assertEquals(10, discretize0.getBins());
      assertFalse(discretize0.getMakeBinary());
  }
}
