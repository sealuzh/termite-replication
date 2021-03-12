/*
 * This file was automatically generated by EvoSuite
 * Sun Nov 29 07:58:16 GMT 2020
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
  /*Coverage entropy=0.9502705392332347
  */
  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      ExpressionMatrixImpl expressionMatrixImpl0 = new ExpressionMatrixImpl();
      expressionMatrixImpl0.creatMatrix((-716));
      expressionMatrixImpl0.toString();
      assertEquals((-716), expressionMatrixImpl0.getNumberOfElements());
  }

  /**
  //Test case number: 1
  /*Coverage entropy=1.483124116028697
  */
  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      ExpressionMatrixImpl expressionMatrixImpl0 = new ExpressionMatrixImpl();
      expressionMatrixImpl0.addNewNode();
      expressionMatrixImpl0.creatMatrix(125);
      expressionMatrixImpl0.addNewNode();
      int int0 = expressionMatrixImpl0.addNewNode();
      assertEquals(2, int0);
      
      expressionMatrixImpl0.setValue(2, 23, (-473));
      String string0 = expressionMatrixImpl0.outNoStandardConnections(false, (ExpressionElementMapper) null);
      assertEquals("2 --- X ---> -473\n", string0);
  }

  /**
  //Test case number: 2
  /*Coverage entropy=1.483124116028697
  */
  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      ExpressionMatrixImpl expressionMatrixImpl0 = new ExpressionMatrixImpl();
      expressionMatrixImpl0.addNewNode();
      expressionMatrixImpl0.creatMatrix(65);
      expressionMatrixImpl0.addNewNode();
      expressionMatrixImpl0.setValue(1, 24, 0);
      expressionMatrixImpl0.outNoStandardConnections(true, (ExpressionElementMapper) null);
      assertEquals(65, expressionMatrixImpl0.getNumberOfElements());
  }

  /**
  //Test case number: 3
  /*Coverage entropy=1.4127446368638479
  */
  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      ExpressionMatrixImpl expressionMatrixImpl0 = new ExpressionMatrixImpl();
      expressionMatrixImpl0.creatMatrix(37);
      expressionMatrixImpl0.addNewNode();
      ExpressionElementMapperImpl expressionElementMapperImpl0 = new ExpressionElementMapperImpl();
      ExpressionElementMapperItemImpl expressionElementMapperItemImpl0 = new ExpressionElementMapperItemImpl();
      expressionElementMapperImpl0.addItem(expressionElementMapperItemImpl0);
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
  //Test case number: 4
  /*Coverage entropy=1.2424533248940002
  */
  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      ExpressionMatrixImpl expressionMatrixImpl0 = new ExpressionMatrixImpl();
      ExpressionElementMapperImpl expressionElementMapperImpl0 = new ExpressionElementMapperImpl();
      expressionMatrixImpl0.addNewNode();
      expressionMatrixImpl0.creatMatrix((-1));
      expressionMatrixImpl0.outNoStandardConnections(true, expressionElementMapperImpl0);
      assertEquals((-1), expressionMatrixImpl0.getNumberOfElements());
  }

  /**
  //Test case number: 5
  /*Coverage entropy=0.8675632284814612
  */
  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      ExpressionMatrixImpl expressionMatrixImpl0 = new ExpressionMatrixImpl();
      expressionMatrixImpl0.addNewNode();
      expressionMatrixImpl0.addNewNode();
      expressionMatrixImpl0.setValue(1, 19, 0);
      assertEquals(2, expressionMatrixImpl0.getNumberOfNodes());
  }

  /**
  //Test case number: 6
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      ExpressionMatrixImpl expressionMatrixImpl0 = new ExpressionMatrixImpl();
      int int0 = expressionMatrixImpl0.addNewNode();
      assertEquals(0, int0);
      
      int int1 = expressionMatrixImpl0.getNumberOfNodes();
      assertFalse(int1 == int0);
  }

  /**
  //Test case number: 7
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      ExpressionMatrixImpl expressionMatrixImpl0 = new ExpressionMatrixImpl();
      expressionMatrixImpl0.creatMatrix(37);
      int int0 = expressionMatrixImpl0.getNumberOfElements();
      assertEquals(37, int0);
  }

  /**
  //Test case number: 8
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      ExpressionMatrixImpl expressionMatrixImpl0 = new ExpressionMatrixImpl();
      expressionMatrixImpl0.creatMatrix((-1));
      int int0 = expressionMatrixImpl0.getNumberOfElements();
      assertEquals((-1), int0);
  }

  /**
  //Test case number: 9
  /*Coverage entropy=0.6365141682948128
  */
  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      ExpressionMatrixImpl expressionMatrixImpl0 = new ExpressionMatrixImpl();
      expressionMatrixImpl0.setValue(0, 0, 0);
      assertEquals(0, expressionMatrixImpl0.getNumberOfNodes());
  }

  /**
  //Test case number: 10
  /*Coverage entropy=0.6365141682948128
  */
  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      ExpressionMatrixImpl expressionMatrixImpl0 = new ExpressionMatrixImpl();
      int int0 = expressionMatrixImpl0.getValue(0, 0);
      assertEquals((-1), int0);
  }

  /**
  //Test case number: 11
  /*Coverage entropy=0.7356219397587946
  */
  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      ExpressionMatrixImpl expressionMatrixImpl0 = new ExpressionMatrixImpl();
      expressionMatrixImpl0.creatMatrix(5647);
      expressionMatrixImpl0.toString();
      // Undeclared exception!
      expressionMatrixImpl0.toString();
  }

  /**
  //Test case number: 12
  /*Coverage entropy=1.333082442435346
  */
  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      ExpressionMatrixImpl expressionMatrixImpl0 = new ExpressionMatrixImpl();
      expressionMatrixImpl0.creatMatrix(1021);
      expressionMatrixImpl0.addNewNode();
      expressionMatrixImpl0.addNewNode();
      expressionMatrixImpl0.toString();
      expressionMatrixImpl0.toString();
      // Undeclared exception!
      expressionMatrixImpl0.outNoStandardConnections(false, (ExpressionElementMapper) null);
  }

  /**
  //Test case number: 13
  /*Coverage entropy=1.0397207708399179
  */
  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      ExpressionMatrixImpl expressionMatrixImpl0 = new ExpressionMatrixImpl();
      expressionMatrixImpl0.creatMatrix(458752);
      // Undeclared exception!
      expressionMatrixImpl0.addNewNode();
  }

  /**
  //Test case number: 14
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      ExpressionMatrixImpl expressionMatrixImpl0 = new ExpressionMatrixImpl();
      expressionMatrixImpl0.creatMatrix((-3453));
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
  //Test case number: 15
  /*Coverage entropy=1.2493920911768415
  */
  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      ExpressionMatrixImpl expressionMatrixImpl0 = new ExpressionMatrixImpl();
      expressionMatrixImpl0.addNewNode();
      expressionMatrixImpl0.creatMatrix(125);
      expressionMatrixImpl0.addNewNode();
      expressionMatrixImpl0.setValue(1, 1, (-473));
      expressionMatrixImpl0.toString();
      assertEquals(125, expressionMatrixImpl0.getNumberOfElements());
  }

  /**
  //Test case number: 16
  /*Coverage entropy=1.2493920911768415
  */
  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      ExpressionMatrixImpl expressionMatrixImpl0 = new ExpressionMatrixImpl();
      expressionMatrixImpl0.addNewNode();
      expressionMatrixImpl0.creatMatrix(125);
      expressionMatrixImpl0.addNewNode();
      expressionMatrixImpl0.setValue(1, 0, 1);
      expressionMatrixImpl0.toString();
      assertEquals(125, expressionMatrixImpl0.getNumberOfElements());
  }

  /**
  //Test case number: 17
  /*Coverage entropy=1.483124116028697
  */
  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      ExpressionMatrixImpl expressionMatrixImpl0 = new ExpressionMatrixImpl();
      expressionMatrixImpl0.addNewNode();
      expressionMatrixImpl0.creatMatrix(132);
      int int0 = expressionMatrixImpl0.addNewNode();
      assertEquals(1, int0);
      
      expressionMatrixImpl0.setValue(1, 108, 132);
      String string0 = expressionMatrixImpl0.outNoStandardConnections(false, (ExpressionElementMapper) null);
      assertEquals("", string0);
  }

  /**
  //Test case number: 18
  /*Coverage entropy=1.4772924451756126
  */
  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      ExpressionMatrixImpl expressionMatrixImpl0 = new ExpressionMatrixImpl();
      expressionMatrixImpl0.creatMatrix(255);
      expressionMatrixImpl0.addNewNode();
      expressionMatrixImpl0.addNewNode();
      expressionMatrixImpl0.setValue(1, 92, 255);
      expressionMatrixImpl0.outNoStandardConnections(true, (ExpressionElementMapper) null);
      assertEquals(255, expressionMatrixImpl0.getNumberOfElements());
  }

  /**
  //Test case number: 19
  /*Coverage entropy=1.483124116028697
  */
  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      ExpressionMatrixImpl expressionMatrixImpl0 = new ExpressionMatrixImpl();
      expressionMatrixImpl0.addNewNode();
      expressionMatrixImpl0.creatMatrix(125);
      expressionMatrixImpl0.addNewNode();
      expressionMatrixImpl0.setValue(1, 0, 1);
      expressionMatrixImpl0.outNoStandardConnections(true, (ExpressionElementMapper) null);
      assertEquals(125, expressionMatrixImpl0.getNumberOfElements());
  }

  /**
  //Test case number: 20
  /*Coverage entropy=1.5390846424277733
  */
  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      ExpressionMatrixImpl expressionMatrixImpl0 = new ExpressionMatrixImpl();
      expressionMatrixImpl0.addNewNode();
      expressionMatrixImpl0.creatMatrix(125);
      expressionMatrixImpl0.addNewNode();
      expressionMatrixImpl0.setValue(1, 1, (-473));
      expressionMatrixImpl0.outNoStandardConnections(false, (ExpressionElementMapper) null);
      assertEquals(125, expressionMatrixImpl0.getNumberOfElements());
  }

  /**
  //Test case number: 21
  /*Coverage entropy=0.9502705392332347
  */
  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      ExpressionMatrixImpl expressionMatrixImpl0 = new ExpressionMatrixImpl();
      int int0 = expressionMatrixImpl0.addNewNode();
      assertEquals(0, int0);
      
      int int1 = expressionMatrixImpl0.getValue(0, (-226));
      assertEquals((-1), int1);
  }

  /**
  //Test case number: 22
  /*Coverage entropy=0.6365141682948128
  */
  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      ExpressionMatrixImpl expressionMatrixImpl0 = new ExpressionMatrixImpl();
      int int0 = expressionMatrixImpl0.getValue(1021, 745);
      assertEquals((-1), int0);
  }

  /**
  //Test case number: 23
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      ExpressionMatrixImpl expressionMatrixImpl0 = new ExpressionMatrixImpl();
      int int0 = expressionMatrixImpl0.getValue((-1327), (-1327));
      assertEquals((-1), int0);
  }

  /**
  //Test case number: 24
  /*Coverage entropy=1.483124116028697
  */
  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      ExpressionMatrixImpl expressionMatrixImpl0 = new ExpressionMatrixImpl();
      expressionMatrixImpl0.addNewNode();
      expressionMatrixImpl0.creatMatrix(125);
      expressionMatrixImpl0.addNewNode();
      expressionMatrixImpl0.setValue(1, 0, 1);
      expressionMatrixImpl0.outNoStandardConnections(false, (ExpressionElementMapper) null);
      assertEquals(125, expressionMatrixImpl0.getNumberOfElements());
  }

  /**
  //Test case number: 25
  /*Coverage entropy=0.9502705392332347
  */
  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      ExpressionMatrixImpl expressionMatrixImpl0 = new ExpressionMatrixImpl();
      expressionMatrixImpl0.addNewNode();
      expressionMatrixImpl0.setValue(0, (-3002), 4304);
      assertEquals(0, expressionMatrixImpl0.getNumberOfElements());
  }

  /**
  //Test case number: 26
  /*Coverage entropy=0.8675632284814612
  */
  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      ExpressionMatrixImpl expressionMatrixImpl0 = new ExpressionMatrixImpl();
      expressionMatrixImpl0.addNewNode();
      expressionMatrixImpl0.addNewNode();
      expressionMatrixImpl0.setValue(1, 0, 1);
      assertEquals(2, expressionMatrixImpl0.getNumberOfNodes());
  }

  /**
  //Test case number: 27
  /*Coverage entropy=0.6365141682948128
  */
  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      ExpressionMatrixImpl expressionMatrixImpl0 = new ExpressionMatrixImpl();
      expressionMatrixImpl0.setValue(1, 0, 1);
      assertEquals(0, expressionMatrixImpl0.getNumberOfNodes());
  }

  /**
  //Test case number: 28
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      ExpressionMatrixImpl expressionMatrixImpl0 = new ExpressionMatrixImpl();
      expressionMatrixImpl0.setValue((-492), (-785), (-1868));
      assertEquals(0, expressionMatrixImpl0.getNumberOfNodes());
  }

  /**
  //Test case number: 29
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      ExpressionMatrixImpl expressionMatrixImpl0 = new ExpressionMatrixImpl();
      expressionMatrixImpl0.creatMatrix(0);
      assertEquals(0, expressionMatrixImpl0.getNumberOfElements());
  }

  /**
  //Test case number: 30
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      ExpressionMatrixImpl expressionMatrixImpl0 = new ExpressionMatrixImpl();
      int int0 = expressionMatrixImpl0.getNumberOfNodes();
      assertEquals(0, int0);
  }

  /**
  //Test case number: 31
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      ExpressionMatrixImpl expressionMatrixImpl0 = new ExpressionMatrixImpl();
      int int0 = expressionMatrixImpl0.getNumberOfElements();
      assertEquals(0, int0);
  }
}
