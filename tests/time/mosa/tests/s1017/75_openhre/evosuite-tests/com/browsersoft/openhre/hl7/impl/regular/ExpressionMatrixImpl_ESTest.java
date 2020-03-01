/*
 * This file was automatically generated by EvoSuite
 * Thu Dec 05 03:07:40 GMT 2019
 */

package com.browsersoft.openhre.hl7.impl.regular;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.browsersoft.openhre.hl7.api.regular.ExpressionElementMapper;
import com.browsersoft.openhre.hl7.impl.regular.ExpressionElementMapperImpl;
import com.browsersoft.openhre.hl7.impl.regular.ExpressionElementMapperItemImpl;
import com.browsersoft.openhre.hl7.impl.regular.ExpressionMatrixImpl;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class ExpressionMatrixImpl_ESTest extends ExpressionMatrixImpl_ESTest_scaffolding {

  /**
  //Test case number: 0
  /*Coverage entropy=2.059725315722571
  */
  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      ExpressionMatrixImpl expressionMatrixImpl0 = new ExpressionMatrixImpl();
      expressionMatrixImpl0.creatMatrix(12);
      expressionMatrixImpl0.creatMatrix(42);
      expressionMatrixImpl0.addNewNode();
      expressionMatrixImpl0.getNumberOfNodes();
      expressionMatrixImpl0.setValue(0, 1, 0);
      expressionMatrixImpl0.addNewNode();
      expressionMatrixImpl0.addNewNode();
      expressionMatrixImpl0.setValue(1, 0, 0);
      expressionMatrixImpl0.toString();
      expressionMatrixImpl0.outNoStandardConnections(false, (ExpressionElementMapper) null);
      assertEquals(42, expressionMatrixImpl0.getNumberOfElements());
  }

  /**
  //Test case number: 1
  /*Coverage entropy=1.0660236194416763
  */
  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      ExpressionMatrixImpl expressionMatrixImpl0 = new ExpressionMatrixImpl();
      expressionMatrixImpl0.creatMatrix(57);
      expressionMatrixImpl0.addNewNode();
      expressionMatrixImpl0.addNewNode();
      expressionMatrixImpl0.addNewNode();
      expressionMatrixImpl0.creatMatrix(446);
      expressionMatrixImpl0.setValue(0, 1, 57);
      expressionMatrixImpl0.toString();
      expressionMatrixImpl0.outNoStandardConnections(false, (ExpressionElementMapper) null);
      assertEquals(446, expressionMatrixImpl0.getNumberOfElements());
  }

  /**
  //Test case number: 2
  /*Coverage entropy=1.9824500783172616
  */
  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      ExpressionMatrixImpl expressionMatrixImpl0 = new ExpressionMatrixImpl();
      expressionMatrixImpl0.creatMatrix(57);
      expressionMatrixImpl0.addNewNode();
      expressionMatrixImpl0.addNewNode();
      expressionMatrixImpl0.setValue(1, 0, (-46));
      expressionMatrixImpl0.toString();
      expressionMatrixImpl0.outNoStandardConnections(true, (ExpressionElementMapper) null);
      int int0 = expressionMatrixImpl0.addNewNode();
      assertEquals(57, expressionMatrixImpl0.getNumberOfElements());
      assertEquals(2, int0);
  }

  /**
  //Test case number: 3
  /*Coverage entropy=1.9824480491088354
  */
  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      ExpressionMatrixImpl expressionMatrixImpl0 = new ExpressionMatrixImpl();
      expressionMatrixImpl0.creatMatrix(57);
      expressionMatrixImpl0.addNewNode();
      int int0 = expressionMatrixImpl0.addNewNode();
      assertEquals(1, int0);
      
      expressionMatrixImpl0.setValue(1, 0, 1);
      String string0 = expressionMatrixImpl0.toString();
      assertEquals("MATRIX\n-----------------------\n | A , B , C , D , E , F , G , H , I , J , K , L , M , N , O , P , Q , R , S , T , U , V , W , X , Y , Z , [ , \\ , ] , ^ , _ , ` , a , b , c , d , e , f , g , h , i , j , k , l , m , n , o , p , q , r , s , t , u , v , w , x , y\n0| E , E , E , E , E , E , E , E , E , E , E , E , E , E , E , E , E , E , E , E , E , E , E , E , E , E , E , E , E , E , E , E , E , E , E , E , E , E , E , E , E , E , E , E , E , E , E , E , E , E , E , E , E , E , E , E , E\n1| 1 , E , E , E , E , E , E , E , E , E , E , E , E , E , E , E , E , E , E , E , E , E , E , E , E , E , E , E , E , E , E , E , E , E , E , E , E , E , E , E , E , E , E , E , E , E , E , E , E , E , E , E , E , E , E , E , E\n\nCONNECTIONS\n-----------------------\n1 --- A ---> 1\n", string0);
      
      String string1 = expressionMatrixImpl0.outNoStandardConnections(true, (ExpressionElementMapper) null);
      assertEquals("", string1);
  }

  /**
  //Test case number: 4
  /*Coverage entropy=2.3791042536364526
  */
  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      ExpressionMatrixImpl expressionMatrixImpl0 = new ExpressionMatrixImpl();
      expressionMatrixImpl0.toString();
      expressionMatrixImpl0.outNoStandardConnections(true, (ExpressionElementMapper) null);
      expressionMatrixImpl0.creatMatrix(57);
      expressionMatrixImpl0.addNewNode();
      expressionMatrixImpl0.setValue(0, 0, 0);
      expressionMatrixImpl0.getNumberOfNodes();
      expressionMatrixImpl0.getValue(0, 0);
      int int0 = expressionMatrixImpl0.addNewNode();
      assertEquals(57, expressionMatrixImpl0.getNumberOfElements());
      assertEquals(1, int0);
  }

  /**
  //Test case number: 5
  /*Coverage entropy=1.191089567391221
  */
  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      ExpressionMatrixImpl expressionMatrixImpl0 = new ExpressionMatrixImpl();
      expressionMatrixImpl0.creatMatrix((-1));
      expressionMatrixImpl0.creatMatrix(57);
      expressionMatrixImpl0.addNewNode();
      expressionMatrixImpl0.addNewNode();
      expressionMatrixImpl0.setValue(0, 51, 405);
      expressionMatrixImpl0.outNoStandardConnections(true, (ExpressionElementMapper) null);
      assertEquals(57, expressionMatrixImpl0.getNumberOfElements());
  }

  /**
  //Test case number: 6
  /*Coverage entropy=1.9819119130171066
  */
  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      ExpressionMatrixImpl expressionMatrixImpl0 = new ExpressionMatrixImpl();
      expressionMatrixImpl0.creatMatrix(57);
      expressionMatrixImpl0.addNewNode();
      expressionMatrixImpl0.addNewNode();
      expressionMatrixImpl0.setValue(1, 1, (-1231));
      expressionMatrixImpl0.toString();
      expressionMatrixImpl0.outNoStandardConnections(true, (ExpressionElementMapper) null);
      assertEquals(57, expressionMatrixImpl0.getNumberOfElements());
  }

  /**
  //Test case number: 7
  /*Coverage entropy=1.5965546754993851
  */
  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      ExpressionMatrixImpl expressionMatrixImpl0 = new ExpressionMatrixImpl();
      expressionMatrixImpl0.creatMatrix(57);
      expressionMatrixImpl0.addNewNode();
      expressionMatrixImpl0.addNewNode();
      expressionMatrixImpl0.setValue(0, 1, 1);
      expressionMatrixImpl0.getNumberOfNodes();
      expressionMatrixImpl0.outNoStandardConnections(true, (ExpressionElementMapper) null);
      assertEquals(57, expressionMatrixImpl0.getNumberOfElements());
  }

  /**
  //Test case number: 8
  /*Coverage entropy=1.4682921994113465
  */
  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      ExpressionMatrixImpl expressionMatrixImpl0 = new ExpressionMatrixImpl();
      expressionMatrixImpl0.creatMatrix(16384);
      // Undeclared exception!
      expressionMatrixImpl0.addNewNode();
  }

  /**
  //Test case number: 9
  /*Coverage entropy=1.1797389058487535
  */
  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      ExpressionMatrixImpl expressionMatrixImpl0 = new ExpressionMatrixImpl();
      expressionMatrixImpl0.creatMatrix(57);
      expressionMatrixImpl0.addNewNode();
      expressionMatrixImpl0.setValue(0, 0, 0);
      expressionMatrixImpl0.outNoStandardConnections(false, (ExpressionElementMapper) null);
      assertEquals(57, expressionMatrixImpl0.getNumberOfElements());
  }

  /**
  //Test case number: 10
  /*Coverage entropy=1.191440695918307
  */
  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      ExpressionMatrixImpl expressionMatrixImpl0 = new ExpressionMatrixImpl();
      expressionMatrixImpl0.creatMatrix(70);
      expressionMatrixImpl0.addNewNode();
      int int0 = expressionMatrixImpl0.addNewNode();
      assertEquals(1, int0);
      
      expressionMatrixImpl0.setValue(0, 1, 0);
      String string0 = expressionMatrixImpl0.outNoStandardConnections(true, (ExpressionElementMapper) null);
      assertEquals("", string0);
  }

  /**
  //Test case number: 11
  /*Coverage entropy=0.8794491360251646
  */
  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      ExpressionMatrixImpl expressionMatrixImpl0 = new ExpressionMatrixImpl();
      expressionMatrixImpl0.toString();
      expressionMatrixImpl0.creatMatrix(57);
      expressionMatrixImpl0.addNewNode();
      expressionMatrixImpl0.addNewNode();
      expressionMatrixImpl0.setValue(0, 0, 57);
      expressionMatrixImpl0.toString();
      assertEquals(57, expressionMatrixImpl0.getNumberOfElements());
  }

  /**
  //Test case number: 12
  /*Coverage entropy=1.8742830984023093
  */
  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      ExpressionMatrixImpl expressionMatrixImpl0 = new ExpressionMatrixImpl();
      expressionMatrixImpl0.toString();
      expressionMatrixImpl0.creatMatrix(1);
      expressionMatrixImpl0.toString();
      expressionMatrixImpl0.addNewNode();
      int int0 = expressionMatrixImpl0.getValue(0, 0);
      assertEquals(1, expressionMatrixImpl0.getNumberOfElements());
      assertEquals((-1), int0);
  }

  /**
  //Test case number: 13
  /*Coverage entropy=1.9750468914557282
  */
  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      ExpressionMatrixImpl expressionMatrixImpl0 = new ExpressionMatrixImpl();
      expressionMatrixImpl0.creatMatrix(2253);
      expressionMatrixImpl0.addNewNode();
      expressionMatrixImpl0.addNewNode();
      expressionMatrixImpl0.setValue(2253, 0, 0);
      expressionMatrixImpl0.toString();
      // Undeclared exception!
      expressionMatrixImpl0.outNoStandardConnections(true, (ExpressionElementMapper) null);
  }

  /**
  //Test case number: 14
  /*Coverage entropy=1.3788419678046633
  */
  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      ExpressionMatrixImpl expressionMatrixImpl0 = new ExpressionMatrixImpl();
      expressionMatrixImpl0.creatMatrix(12356);
      // Undeclared exception!
      expressionMatrixImpl0.toString();
  }

  /**
  //Test case number: 15
  /*Coverage entropy=1.191440695918307
  */
  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      ExpressionMatrixImpl expressionMatrixImpl0 = new ExpressionMatrixImpl();
      expressionMatrixImpl0.creatMatrix(70);
      expressionMatrixImpl0.addNewNode();
      expressionMatrixImpl0.setValue(0, 0, 0);
      expressionMatrixImpl0.toString();
      assertEquals(70, expressionMatrixImpl0.getNumberOfElements());
  }

  /**
  //Test case number: 16
  /*Coverage entropy=1.7245636064559449
  */
  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      ExpressionMatrixImpl expressionMatrixImpl0 = new ExpressionMatrixImpl();
      expressionMatrixImpl0.getNumberOfNodes();
      int int0 = expressionMatrixImpl0.addNewNode();
      assertEquals(0, int0);
      
      expressionMatrixImpl0.setValue(0, 0, 0);
      String string0 = expressionMatrixImpl0.toString();
      assertEquals("MATRIX\n-----------------------\n | \n0| \n\nCONNECTIONS\n-----------------------\n", string0);
  }

  /**
  //Test case number: 17
  /*Coverage entropy=2.018406004107885
  */
  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      ExpressionMatrixImpl expressionMatrixImpl0 = new ExpressionMatrixImpl();
      expressionMatrixImpl0.creatMatrix(12);
      expressionMatrixImpl0.creatMatrix(42);
      expressionMatrixImpl0.addNewNode();
      expressionMatrixImpl0.addNewNode();
      expressionMatrixImpl0.setValue((-18), (-1528), 42);
      expressionMatrixImpl0.toString();
      ExpressionMatrixImpl expressionMatrixImpl1 = new ExpressionMatrixImpl();
      expressionMatrixImpl1.getNumberOfNodes();
      ExpressionMatrixImpl expressionMatrixImpl2 = new ExpressionMatrixImpl();
      ExpressionElementMapper expressionElementMapper0 = null;
      boolean boolean0 = false;
      ExpressionElementMapperImpl expressionElementMapperImpl0 = new ExpressionElementMapperImpl();
      ExpressionElementMapperItemImpl expressionElementMapperItemImpl0 = new ExpressionElementMapperItemImpl();
      expressionElementMapperImpl0.setItem(0, expressionElementMapperItemImpl0);
      ExpressionElementMapperItemImpl expressionElementMapperItemImpl1 = new ExpressionElementMapperItemImpl();
      expressionElementMapperImpl0.addItem(expressionElementMapperItemImpl1);
      // Undeclared exception!
      try { 
        expressionMatrixImpl0.outNoStandardConnections(false, expressionElementMapperImpl0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.evosuite.runtime.System", e);
      }
  }

  /**
  //Test case number: 18
  /*Coverage entropy=1.1375916250043898
  */
  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      ExpressionMatrixImpl expressionMatrixImpl0 = new ExpressionMatrixImpl();
      expressionMatrixImpl0.creatMatrix(70);
      expressionMatrixImpl0.addNewNode();
      ExpressionElementMapperImpl expressionElementMapperImpl0 = new ExpressionElementMapperImpl();
      // Undeclared exception!
      try { 
        expressionMatrixImpl0.outNoStandardConnections(false, expressionElementMapperImpl0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.evosuite.runtime.System", e);
      }
  }

  /**
  //Test case number: 19
  /*Coverage entropy=1.519583768449818
  */
  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      ExpressionMatrixImpl expressionMatrixImpl0 = new ExpressionMatrixImpl();
      int int0 = expressionMatrixImpl0.addNewNode();
      assertEquals(0, int0);
      
      expressionMatrixImpl0.setValue(0, (-5069), 0);
      String string0 = expressionMatrixImpl0.toString();
      assertEquals("MATRIX\n-----------------------\n | \n0| \n\nCONNECTIONS\n-----------------------\n", string0);
  }

  /**
  //Test case number: 20
  /*Coverage entropy=1.5271837172395382
  */
  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      ExpressionMatrixImpl expressionMatrixImpl0 = new ExpressionMatrixImpl();
      expressionMatrixImpl0.creatMatrix((-1));
      // Undeclared exception!
      try { 
        expressionMatrixImpl0.addNewNode();
        fail("Expecting exception: NegativeArraySizeException");
      
      } catch(NegativeArraySizeException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.browsersoft.openhre.hl7.impl.regular.ExpressionMatrixImpl", e);
      }
  }

  /**
  //Test case number: 21
  /*Coverage entropy=1.0931471805599453
  */
  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      ExpressionMatrixImpl expressionMatrixImpl0 = new ExpressionMatrixImpl();
      int int0 = expressionMatrixImpl0.getValue((-1856), (-1856));
      assertEquals((-1), int0);
  }

  /**
  //Test case number: 22
  /*Coverage entropy=1.3788419678046633
  */
  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      ExpressionMatrixImpl expressionMatrixImpl0 = new ExpressionMatrixImpl();
      expressionMatrixImpl0.creatMatrix((-946));
      expressionMatrixImpl0.toString();
      assertEquals((-946), expressionMatrixImpl0.getNumberOfElements());
  }

  /**
  //Test case number: 23
  /*Coverage entropy=1.5271837172395382
  */
  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      ExpressionMatrixImpl expressionMatrixImpl0 = new ExpressionMatrixImpl();
      expressionMatrixImpl0.creatMatrix(1023);
      int int0 = expressionMatrixImpl0.getNumberOfElements();
      assertEquals(1023, int0);
  }

  /**
  //Test case number: 24
  /*Coverage entropy=1.830738805564335
  */
  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      ExpressionMatrixImpl expressionMatrixImpl0 = new ExpressionMatrixImpl();
      expressionMatrixImpl0.creatMatrix((-2951));
      expressionMatrixImpl0.getNumberOfElements();
      expressionMatrixImpl0.outNoStandardConnections(false, (ExpressionElementMapper) null);
      assertEquals((-2951), expressionMatrixImpl0.getNumberOfElements());
  }

  /**
  //Test case number: 25
  /*Coverage entropy=2.1341639076887824
  */
  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      ExpressionMatrixImpl expressionMatrixImpl0 = new ExpressionMatrixImpl();
      expressionMatrixImpl0.setValue(2335, 2335, 2335);
      expressionMatrixImpl0.toString();
      expressionMatrixImpl0.addNewNode();
      expressionMatrixImpl0.creatMatrix((-2357));
      ExpressionElementMapperImpl expressionElementMapperImpl0 = new ExpressionElementMapperImpl();
      expressionMatrixImpl0.outNoStandardConnections(false, expressionElementMapperImpl0);
      assertEquals((-2357), expressionMatrixImpl0.getNumberOfElements());
  }

  /**
  //Test case number: 26
  /*Coverage entropy=1.2961346570528898
  */
  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      ExpressionMatrixImpl expressionMatrixImpl0 = new ExpressionMatrixImpl();
      int int0 = expressionMatrixImpl0.addNewNode();
      assertEquals(0, int0);
      
      int int1 = expressionMatrixImpl0.getValue(0, 42);
      assertEquals((-1), int1);
  }

  /**
  //Test case number: 27
  /*Coverage entropy=1.0365141682948127
  */
  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      ExpressionMatrixImpl expressionMatrixImpl0 = new ExpressionMatrixImpl();
      int int0 = expressionMatrixImpl0.getValue(0, 0);
      assertEquals((-1), int0);
  }

  /**
  //Test case number: 28
  /*Coverage entropy=1.4682921994113465
  */
  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      ExpressionMatrixImpl expressionMatrixImpl0 = new ExpressionMatrixImpl();
      int int0 = expressionMatrixImpl0.addNewNode();
      assertEquals(0, int0);
      
      int int1 = expressionMatrixImpl0.getValue(80, 0);
      assertEquals((-1), int1);
  }

  /**
  //Test case number: 29
  /*Coverage entropy=1.6999267696231979
  */
  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      ExpressionMatrixImpl expressionMatrixImpl0 = new ExpressionMatrixImpl();
      String string0 = expressionMatrixImpl0.toString();
      assertEquals("MATRIX\n-----------------------\n | \n\nCONNECTIONS\n-----------------------\n", string0);
      
      int int0 = expressionMatrixImpl0.addNewNode();
      assertEquals(0, int0);
      
      int int1 = expressionMatrixImpl0.getValue(0, (-2582));
      assertEquals((-1), int1);
  }

  /**
  //Test case number: 30
  /*Coverage entropy=0.42857142857142855
  */
  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      ExpressionMatrixImpl expressionMatrixImpl0 = new ExpressionMatrixImpl();
      int int0 = expressionMatrixImpl0.addNewNode();
      assertEquals(0, int0);
      
      int int1 = expressionMatrixImpl0.getValue(0, 0);
      assertEquals((-1), int1);
  }

  /**
  //Test case number: 31
  /*Coverage entropy=0.4
  */
  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      ExpressionMatrixImpl expressionMatrixImpl0 = new ExpressionMatrixImpl();
      int int0 = expressionMatrixImpl0.getValue(72, 72);
      assertEquals((-1), int0);
  }

  /**
  //Test case number: 32
  /*Coverage entropy=1.533344419789668
  */
  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      ExpressionMatrixImpl expressionMatrixImpl0 = new ExpressionMatrixImpl();
      expressionMatrixImpl0.creatMatrix(1034);
      expressionMatrixImpl0.setValue(1034, 1034, 1034);
      expressionMatrixImpl0.toString();
      assertEquals(1034, expressionMatrixImpl0.getNumberOfElements());
  }

  /**
  //Test case number: 33
  /*Coverage entropy=1.4682921994113465
  */
  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      ExpressionMatrixImpl expressionMatrixImpl0 = new ExpressionMatrixImpl();
      int int0 = expressionMatrixImpl0.getNumberOfElements();
      assertEquals(0, int0);
      
      expressionMatrixImpl0.setValue(0, 72, (-2225));
      assertEquals(0, expressionMatrixImpl0.getNumberOfElements());
  }

  /**
  //Test case number: 34
  /*Coverage entropy=0.42857142857142855
  */
  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      ExpressionMatrixImpl expressionMatrixImpl0 = new ExpressionMatrixImpl();
      expressionMatrixImpl0.addNewNode();
      expressionMatrixImpl0.setValue(0, 2128, 1238);
      assertEquals(1, expressionMatrixImpl0.getNumberOfNodes());
  }
}
