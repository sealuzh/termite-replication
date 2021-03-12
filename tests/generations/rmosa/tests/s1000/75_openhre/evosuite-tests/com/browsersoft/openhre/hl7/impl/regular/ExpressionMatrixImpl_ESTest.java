/*
 * This file was automatically generated by EvoSuite
 * Sun Nov 08 00:33:40 GMT 2020
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
  /*Coverage entropy=1.4772924451756126
  */
  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      ExpressionMatrixImpl expressionMatrixImpl0 = new ExpressionMatrixImpl();
      expressionMatrixImpl0.creatMatrix(2283);
      expressionMatrixImpl0.addNewNode();
      expressionMatrixImpl0.setValue(0, 1185, (-186));
      expressionMatrixImpl0.outNoStandardConnections(true, (ExpressionElementMapper) null);
      assertEquals(2283, expressionMatrixImpl0.getNumberOfElements());
  }

  /**
  //Test case number: 1
  /*Coverage entropy=1.3522093992338282
  */
  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      ExpressionMatrixImpl expressionMatrixImpl0 = new ExpressionMatrixImpl();
      expressionMatrixImpl0.addNewNode();
      expressionMatrixImpl0.creatMatrix(2599);
      ExpressionElementMapperImpl expressionElementMapperImpl0 = new ExpressionElementMapperImpl();
      ExpressionElementMapperItemImpl expressionElementMapperItemImpl0 = new ExpressionElementMapperItemImpl();
      expressionElementMapperImpl0.addItem(expressionElementMapperItemImpl0);
      // Undeclared exception!
      try { 
        expressionMatrixImpl0.outNoStandardConnections(true, expressionElementMapperImpl0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.evosuite.runtime.System", e);
      }
  }

  /**
  //Test case number: 2
  /*Coverage entropy=1.2424533248940002
  */
  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      ExpressionMatrixImpl expressionMatrixImpl0 = new ExpressionMatrixImpl();
      expressionMatrixImpl0.addNewNode();
      expressionMatrixImpl0.creatMatrix((-1));
      ExpressionElementMapperImpl expressionElementMapperImpl0 = new ExpressionElementMapperImpl();
      expressionMatrixImpl0.outNoStandardConnections(true, expressionElementMapperImpl0);
      assertEquals((-1), expressionMatrixImpl0.getNumberOfElements());
  }

  /**
  //Test case number: 3
  /*Coverage entropy=0.6365141682948128
  */
  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      ExpressionMatrixImpl expressionMatrixImpl0 = new ExpressionMatrixImpl();
      int int0 = expressionMatrixImpl0.getValue(94, 2283);
      assertEquals((-1), int0);
  }

  /**
  //Test case number: 4
  /*Coverage entropy=0.8675632284814612
  */
  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      ExpressionMatrixImpl expressionMatrixImpl0 = new ExpressionMatrixImpl();
      expressionMatrixImpl0.addNewNode();
      expressionMatrixImpl0.setValue(0, 0, 0);
      assertEquals(1, expressionMatrixImpl0.getNumberOfNodes());
  }

  /**
  //Test case number: 5
  /*Coverage entropy=0.6365141682948128
  */
  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      ExpressionMatrixImpl expressionMatrixImpl0 = new ExpressionMatrixImpl();
      expressionMatrixImpl0.setValue(20, (-1), 2380);
      assertEquals(0, expressionMatrixImpl0.getNumberOfElements());
  }

  /**
  //Test case number: 6
  /*Coverage entropy=1.4451858789480823
  */
  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      ExpressionMatrixImpl expressionMatrixImpl0 = new ExpressionMatrixImpl();
      expressionMatrixImpl0.creatMatrix(1024);
      expressionMatrixImpl0.addNewNode();
      expressionMatrixImpl0.setValue(0, 0, 94);
      int int0 = expressionMatrixImpl0.getValue(0, 0);
      assertEquals(1024, expressionMatrixImpl0.getNumberOfElements());
      assertEquals(94, int0);
  }

  /**
  //Test case number: 7
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      ExpressionMatrixImpl expressionMatrixImpl0 = new ExpressionMatrixImpl();
      int int0 = expressionMatrixImpl0.addNewNode();
      assertEquals(0, int0);
      
      int int1 = expressionMatrixImpl0.getNumberOfNodes();
      assertFalse(int1 == int0);
  }

  /**
  //Test case number: 8
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      ExpressionMatrixImpl expressionMatrixImpl0 = new ExpressionMatrixImpl();
      expressionMatrixImpl0.creatMatrix(30);
      int int0 = expressionMatrixImpl0.getNumberOfElements();
      assertEquals(30, int0);
  }

  /**
  //Test case number: 9
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      ExpressionMatrixImpl expressionMatrixImpl0 = new ExpressionMatrixImpl();
      expressionMatrixImpl0.creatMatrix((-1));
      int int0 = expressionMatrixImpl0.getNumberOfElements();
      assertEquals((-1), int0);
  }

  /**
  //Test case number: 10
  /*Coverage entropy=1.0397207708399179
  */
  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      ExpressionMatrixImpl expressionMatrixImpl0 = new ExpressionMatrixImpl();
      expressionMatrixImpl0.creatMatrix(22777);
      // Undeclared exception!
      expressionMatrixImpl0.addNewNode();
  }

  /**
  //Test case number: 11
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      ExpressionMatrixImpl expressionMatrixImpl0 = new ExpressionMatrixImpl();
      expressionMatrixImpl0.creatMatrix((-835));
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
  //Test case number: 12
  /*Coverage entropy=1.2268584995096177
  */
  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      ExpressionMatrixImpl expressionMatrixImpl0 = new ExpressionMatrixImpl();
      expressionMatrixImpl0.creatMatrix(94);
      expressionMatrixImpl0.addNewNode();
      expressionMatrixImpl0.setValue(0, 0, (-13));
      expressionMatrixImpl0.toString();
      assertEquals(94, expressionMatrixImpl0.getNumberOfElements());
  }

  /**
  //Test case number: 13
  /*Coverage entropy=1.2268584995096177
  */
  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      ExpressionMatrixImpl expressionMatrixImpl0 = new ExpressionMatrixImpl();
      expressionMatrixImpl0.creatMatrix(55);
      int int0 = expressionMatrixImpl0.addNewNode();
      assertEquals(0, int0);
      
      expressionMatrixImpl0.setValue(0, 1, 5);
      String string0 = expressionMatrixImpl0.toString();
      assertEquals("MATRIX\n-----------------------\n | A , B , C , D , E , F , G , H , I , J , K , L , M , N , O , P , Q , R , S , T , U , V , W , X , Y , Z , [ , \\ , ] , ^ , _ , ` , a , b , c , d , e , f , g , h , i , j , k , l , m , n , o , p , q , r , s , t , u , v , w\n0| E , 5 , E , E , E , E , E , E , E , E , E , E , E , E , E , E , E , E , E , E , E , E , E , E , E , E , E , E , E , E , E , E , E , E , E , E , E , E , E , E , E , E , E , E , E , E , E , E , E , E , E , E , E , E , E\n\nCONNECTIONS\n-----------------------\n0 --- B ---> 5\n", string0);
  }

  /**
  //Test case number: 14
  /*Coverage entropy=0.965642172437147
  */
  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      ExpressionMatrixImpl expressionMatrixImpl0 = new ExpressionMatrixImpl();
      expressionMatrixImpl0.addNewNode();
      expressionMatrixImpl0.creatMatrix(30);
      expressionMatrixImpl0.toString();
      assertEquals(30, expressionMatrixImpl0.getNumberOfElements());
  }

  /**
  //Test case number: 15
  /*Coverage entropy=0.9502705392332347
  */
  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      ExpressionMatrixImpl expressionMatrixImpl0 = new ExpressionMatrixImpl();
      expressionMatrixImpl0.creatMatrix(12354);
      // Undeclared exception!
      expressionMatrixImpl0.toString();
  }

  /**
  //Test case number: 16
  /*Coverage entropy=1.4772924451756126
  */
  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      ExpressionMatrixImpl expressionMatrixImpl0 = new ExpressionMatrixImpl();
      expressionMatrixImpl0.creatMatrix(55);
      int int0 = expressionMatrixImpl0.addNewNode();
      assertEquals(0, int0);
      
      expressionMatrixImpl0.setValue(0, 21, 0);
      String string0 = expressionMatrixImpl0.outNoStandardConnections(false, (ExpressionElementMapper) null);
      assertEquals("0 --- V ---> 0\n", string0);
  }

  /**
  //Test case number: 17
  /*Coverage entropy=1.4772924451756126
  */
  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      ExpressionMatrixImpl expressionMatrixImpl0 = new ExpressionMatrixImpl();
      expressionMatrixImpl0.creatMatrix(55);
      expressionMatrixImpl0.addNewNode();
      expressionMatrixImpl0.setValue(0, 1, 5);
      expressionMatrixImpl0.outNoStandardConnections(true, (ExpressionElementMapper) null);
      assertEquals(55, expressionMatrixImpl0.getNumberOfElements());
  }

  /**
  //Test case number: 18
  /*Coverage entropy=1.4772924451756126
  */
  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      ExpressionMatrixImpl expressionMatrixImpl0 = new ExpressionMatrixImpl();
      expressionMatrixImpl0.creatMatrix(55);
      expressionMatrixImpl0.addNewNode();
      expressionMatrixImpl0.setValue(0, 1, 5);
      expressionMatrixImpl0.outNoStandardConnections(false, (ExpressionElementMapper) null);
      assertEquals(55, expressionMatrixImpl0.getNumberOfElements());
  }

  /**
  //Test case number: 19
  /*Coverage entropy=1.540123194378106
  */
  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      ExpressionMatrixImpl expressionMatrixImpl0 = new ExpressionMatrixImpl();
      expressionMatrixImpl0.creatMatrix(1024);
      expressionMatrixImpl0.addNewNode();
      expressionMatrixImpl0.setValue(0, 0, 94);
      expressionMatrixImpl0.outNoStandardConnections(true, (ExpressionElementMapper) null);
      assertEquals(1024, expressionMatrixImpl0.getNumberOfElements());
  }

  /**
  //Test case number: 20
  /*Coverage entropy=1.3522093992338282
  */
  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      ExpressionMatrixImpl expressionMatrixImpl0 = new ExpressionMatrixImpl();
      expressionMatrixImpl0.addNewNode();
      expressionMatrixImpl0.creatMatrix(12311);
      // Undeclared exception!
      expressionMatrixImpl0.outNoStandardConnections(false, (ExpressionElementMapper) null);
  }

  /**
  //Test case number: 21
  /*Coverage entropy=1.2130075659799042
  */
  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      ExpressionMatrixImpl expressionMatrixImpl0 = new ExpressionMatrixImpl();
      expressionMatrixImpl0.creatMatrix(51);
      expressionMatrixImpl0.addNewNode();
      expressionMatrixImpl0.addNewNode();
      int int0 = expressionMatrixImpl0.getValue(1, 0);
      assertEquals(51, expressionMatrixImpl0.getNumberOfElements());
      assertEquals((-1), int0);
  }

  /**
  //Test case number: 22
  /*Coverage entropy=0.8675632284814612
  */
  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      ExpressionMatrixImpl expressionMatrixImpl0 = new ExpressionMatrixImpl();
      int int0 = expressionMatrixImpl0.addNewNode();
      assertEquals(0, int0);
      
      int int1 = expressionMatrixImpl0.getValue(0, 0);
      assertEquals((-1), int1);
  }

  /**
  //Test case number: 23
  /*Coverage entropy=0.9502705392332347
  */
  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      ExpressionMatrixImpl expressionMatrixImpl0 = new ExpressionMatrixImpl();
      int int0 = expressionMatrixImpl0.addNewNode();
      assertEquals(0, int0);
      
      int int1 = expressionMatrixImpl0.getValue(0, (-133));
      assertEquals((-1), int1);
  }

  /**
  //Test case number: 24
  /*Coverage entropy=0.6365141682948128
  */
  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      ExpressionMatrixImpl expressionMatrixImpl0 = new ExpressionMatrixImpl();
      int int0 = expressionMatrixImpl0.getValue(0, 1488);
      assertEquals((-1), int0);
  }

  /**
  //Test case number: 25
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      ExpressionMatrixImpl expressionMatrixImpl0 = new ExpressionMatrixImpl();
      int int0 = expressionMatrixImpl0.getValue((-1807), 94);
      assertEquals((-1), int0);
  }

  /**
  //Test case number: 26
  /*Coverage entropy=1.4772924451756126
  */
  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      ExpressionMatrixImpl expressionMatrixImpl0 = new ExpressionMatrixImpl();
      expressionMatrixImpl0.creatMatrix(55);
      expressionMatrixImpl0.addNewNode();
      expressionMatrixImpl0.setValue(0, 21, 0);
      expressionMatrixImpl0.outNoStandardConnections(true, (ExpressionElementMapper) null);
      assertEquals(55, expressionMatrixImpl0.getNumberOfElements());
  }

  /**
  //Test case number: 27
  /*Coverage entropy=0.9502705392332347
  */
  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      ExpressionMatrixImpl expressionMatrixImpl0 = new ExpressionMatrixImpl();
      expressionMatrixImpl0.addNewNode();
      expressionMatrixImpl0.setValue(0, (-3015), 0);
      assertEquals(0, expressionMatrixImpl0.getNumberOfElements());
  }

  /**
  //Test case number: 28
  /*Coverage entropy=0.8675632284814612
  */
  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      ExpressionMatrixImpl expressionMatrixImpl0 = new ExpressionMatrixImpl();
      expressionMatrixImpl0.addNewNode();
      expressionMatrixImpl0.setValue(0, 1, 0);
      assertEquals(1, expressionMatrixImpl0.getNumberOfNodes());
  }

  /**
  //Test case number: 29
  /*Coverage entropy=0.6365141682948128
  */
  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      ExpressionMatrixImpl expressionMatrixImpl0 = new ExpressionMatrixImpl();
      expressionMatrixImpl0.setValue(0, 0, 0);
      assertEquals(0, expressionMatrixImpl0.getNumberOfElements());
  }

  /**
  //Test case number: 30
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      ExpressionMatrixImpl expressionMatrixImpl0 = new ExpressionMatrixImpl();
      expressionMatrixImpl0.setValue((-1), (-1), (-1));
      assertEquals(0, expressionMatrixImpl0.getNumberOfElements());
  }

  /**
  //Test case number: 31
  /*Coverage entropy=0.9502705392332347
  */
  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      ExpressionMatrixImpl expressionMatrixImpl0 = new ExpressionMatrixImpl();
      expressionMatrixImpl0.creatMatrix((-1629));
      expressionMatrixImpl0.toString();
      assertEquals((-1629), expressionMatrixImpl0.getNumberOfElements());
  }

  /**
  //Test case number: 32
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      ExpressionMatrixImpl expressionMatrixImpl0 = new ExpressionMatrixImpl();
      int int0 = expressionMatrixImpl0.getNumberOfNodes();
      assertEquals(0, int0);
  }

  /**
  //Test case number: 33
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      ExpressionMatrixImpl expressionMatrixImpl0 = new ExpressionMatrixImpl();
      int int0 = expressionMatrixImpl0.getNumberOfElements();
      assertEquals(0, int0);
  }
}
