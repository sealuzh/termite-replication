/*
 * This file was automatically generated by EvoSuite
 * Mon Nov 09 04:14:40 GMT 2020
 */

package com.browsersoft.openhre.hl7.impl.regular;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.browsersoft.openhre.hl7.api.regular.ExpressionElementMapper;
import com.browsersoft.openhre.hl7.impl.regular.ExpressionElementMapperImpl;
import com.browsersoft.openhre.hl7.impl.regular.ExpressionElementMapperItemImpl;
import com.browsersoft.openhre.hl7.impl.regular.ExpressionMatrixImpl;
import com.browsersoft.openhre.hl7.impl.regular.MessageTracerImpl;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class ExpressionMatrixImpl_ESTest extends ExpressionMatrixImpl_ESTest_scaffolding {

  /**
  //Test case number: 0
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      ExpressionMatrixImpl expressionMatrixImpl0 = new ExpressionMatrixImpl();
      expressionMatrixImpl0.creatMatrix(1868);
      expressionMatrixImpl0.creatMatrix(65535);
      // Undeclared exception!
      expressionMatrixImpl0.addNewNode();
  }

  /**
  //Test case number: 1
  /*Coverage entropy=1.4586643024454788
  */
  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      ExpressionMatrixImpl expressionMatrixImpl0 = new ExpressionMatrixImpl();
      expressionMatrixImpl0.creatMatrix(694);
      expressionMatrixImpl0.addNewNode();
      expressionMatrixImpl0.getNumberOfNodes();
      expressionMatrixImpl0.getValue(1, 524);
      expressionMatrixImpl0.creatMatrix(524);
      expressionMatrixImpl0.getNumberOfNodes();
      expressionMatrixImpl0.outNoStandardConnections(true, (ExpressionElementMapper) null);
      expressionMatrixImpl0.outNoStandardConnections(true, (ExpressionElementMapper) null);
      expressionMatrixImpl0.addNewNode();
      expressionMatrixImpl0.toString();
      expressionMatrixImpl0.addNewNode();
      expressionMatrixImpl0.toString();
      expressionMatrixImpl0.getValue(0, 503);
      expressionMatrixImpl0.toString();
      // Undeclared exception!
      expressionMatrixImpl0.outNoStandardConnections(false, (ExpressionElementMapper) null);
  }

  /**
  //Test case number: 2
  /*Coverage entropy=1.3862943611198906
  */
  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      ExpressionMatrixImpl expressionMatrixImpl0 = new ExpressionMatrixImpl();
      expressionMatrixImpl0.addNewNode();
      ExpressionElementMapperImpl expressionElementMapperImpl0 = new ExpressionElementMapperImpl();
      expressionMatrixImpl0.creatMatrix((-1));
      expressionMatrixImpl0.outNoStandardConnections(true, expressionElementMapperImpl0);
      assertEquals((-1), expressionMatrixImpl0.getNumberOfElements());
  }

  /**
  //Test case number: 3
  /*Coverage entropy=1.6094379124341005
  */
  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      ExpressionMatrixImpl expressionMatrixImpl0 = new ExpressionMatrixImpl();
      expressionMatrixImpl0.addNewNode();
      expressionMatrixImpl0.toString();
      expressionMatrixImpl0.creatMatrix((-611));
      expressionMatrixImpl0.getNumberOfElements();
      expressionMatrixImpl0.toString();
      assertEquals((-611), expressionMatrixImpl0.getNumberOfElements());
  }

  /**
  //Test case number: 4
  /*Coverage entropy=1.7917594692280547
  */
  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      ExpressionMatrixImpl expressionMatrixImpl0 = new ExpressionMatrixImpl();
      ExpressionElementMapperImpl expressionElementMapperImpl0 = new ExpressionElementMapperImpl();
      ExpressionElementMapperItemImpl expressionElementMapperItemImpl0 = new ExpressionElementMapperItemImpl();
      expressionElementMapperItemImpl0.toString();
      expressionElementMapperItemImpl0.setType(571);
      expressionElementMapperItemImpl0.setType(65);
      expressionElementMapperImpl0.setItem(65, expressionElementMapperItemImpl0);
      expressionElementMapperImpl0.setItem(65, expressionElementMapperItemImpl0);
      expressionElementMapperImpl0.toString();
      expressionMatrixImpl0.outNoStandardConnections(false, expressionElementMapperImpl0);
      expressionMatrixImpl0.addNewNode();
      expressionMatrixImpl0.getValue(601, 601);
      expressionMatrixImpl0.addNewNode();
      expressionElementMapperImpl0.removeItem((-664));
      expressionMatrixImpl0.outNoStandardConnections(true, expressionElementMapperImpl0);
      expressionMatrixImpl0.setValue(0, (-1056), 97);
      expressionElementMapperImpl0.setItem(571, expressionElementMapperItemImpl0);
      int int0 = expressionMatrixImpl0.addNewNode();
      assertEquals(2, int0);
      
      expressionMatrixImpl0.outNoStandardConnections(false, expressionElementMapperImpl0);
      int int1 = expressionMatrixImpl0.getValue(0, 0);
      assertEquals((-1), int1);
      
      String string0 = expressionMatrixImpl0.toString();
      assertEquals("MATRIX\n-----------------------\n | \n0| \n1| \n2| \n\nCONNECTIONS\n-----------------------\n", string0);
  }

  /**
  //Test case number: 5
  /*Coverage entropy=1.945910149055313
  */
  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      ExpressionMatrixImpl expressionMatrixImpl0 = new ExpressionMatrixImpl();
      MessageTracerImpl messageTracerImpl0 = new MessageTracerImpl();
      expressionMatrixImpl0.creatMatrix(626);
      messageTracerImpl0.getMapper();
      expressionMatrixImpl0.outNoStandardConnections(false, (ExpressionElementMapper) null);
      expressionMatrixImpl0.addNewNode();
      expressionMatrixImpl0.addNewNode();
      expressionMatrixImpl0.getNumberOfElements();
      expressionMatrixImpl0.getNumberOfNodes();
      expressionMatrixImpl0.setValue(0, 65, 28);
      assertEquals(626, expressionMatrixImpl0.getNumberOfElements());
  }

  /**
  //Test case number: 6
  /*Coverage entropy=1.3862943611198906
  */
  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      ExpressionMatrixImpl expressionMatrixImpl0 = new ExpressionMatrixImpl();
      expressionMatrixImpl0.creatMatrix(3519);
      expressionMatrixImpl0.getNumberOfElements();
      expressionMatrixImpl0.toString();
      assertEquals(3519, expressionMatrixImpl0.getNumberOfElements());
  }

  /**
  //Test case number: 7
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
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
  //Test case number: 8
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      ExpressionMatrixImpl expressionMatrixImpl0 = new ExpressionMatrixImpl();
      int int0 = expressionMatrixImpl0.getValue((-1044), (-1044));
      assertEquals((-1), int0);
  }

  /**
  //Test case number: 9
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      ExpressionMatrixImpl expressionMatrixImpl0 = new ExpressionMatrixImpl();
      expressionMatrixImpl0.addNewNode();
      int int0 = expressionMatrixImpl0.getValue(0, (-1));
      assertEquals((-1), int0);
      
      int int1 = expressionMatrixImpl0.addNewNode();
      assertEquals(1, int1);
  }

  /**
  //Test case number: 10
  /*Coverage entropy=1.6094379124341005
  */
  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      ExpressionMatrixImpl expressionMatrixImpl0 = new ExpressionMatrixImpl();
      int int0 = 1646;
      expressionMatrixImpl0.creatMatrix(1646);
      int int1 = (-1);
      boolean boolean0 = true;
      ExpressionElementMapperImpl expressionElementMapperImpl0 = new ExpressionElementMapperImpl();
      expressionElementMapperImpl0.clearAll();
      ExpressionElementMapperItemImpl expressionElementMapperItemImpl0 = new ExpressionElementMapperItemImpl();
      expressionElementMapperItemImpl0.toString();
      expressionElementMapperItemImpl0.toString();
      expressionElementMapperItemImpl0.setType(0);
      expressionElementMapperItemImpl0.setType(0);
      expressionElementMapperImpl0.addItem(expressionElementMapperItemImpl0);
      expressionElementMapperImpl0.setItem((-1), expressionElementMapperItemImpl0);
      expressionMatrixImpl0.addNewNode();
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
  //Test case number: 11
  /*Coverage entropy=1.4586643024454788
  */
  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      ExpressionMatrixImpl expressionMatrixImpl0 = new ExpressionMatrixImpl();
      expressionMatrixImpl0.addNewNode();
      expressionMatrixImpl0.getNumberOfNodes();
      expressionMatrixImpl0.getValue(1, 524);
      expressionMatrixImpl0.creatMatrix(524);
      expressionMatrixImpl0.getNumberOfNodes();
      MessageTracerImpl messageTracerImpl0 = new MessageTracerImpl();
      messageTracerImpl0.getMapper();
      messageTracerImpl0.setMapper((ExpressionElementMapper) null);
      messageTracerImpl0.getMapper();
      expressionMatrixImpl0.outNoStandardConnections(true, (ExpressionElementMapper) null);
      expressionMatrixImpl0.toString();
      expressionMatrixImpl0.outNoStandardConnections(true, (ExpressionElementMapper) null);
      expressionMatrixImpl0.outNoStandardConnections(true, (ExpressionElementMapper) null);
      expressionMatrixImpl0.addNewNode();
      expressionMatrixImpl0.toString();
      expressionMatrixImpl0.getValue(0, 503);
      int int0 = expressionMatrixImpl0.getValue(65, 0);
      assertEquals(524, expressionMatrixImpl0.getNumberOfElements());
      assertEquals((-1), int0);
  }

  /**
  //Test case number: 12
  /*Coverage entropy=1.3862943611198906
  */
  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      ExpressionMatrixImpl expressionMatrixImpl0 = new ExpressionMatrixImpl();
      String string0 = expressionMatrixImpl0.toString();
      assertEquals("MATRIX\n-----------------------\n | \n\nCONNECTIONS\n-----------------------\n", string0);
      
      int int0 = expressionMatrixImpl0.addNewNode();
      assertEquals(0, int0);
      
      int int1 = expressionMatrixImpl0.getValue(0, 0);
      assertEquals((-1), int1);
  }

  /**
  //Test case number: 13
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      ExpressionMatrixImpl expressionMatrixImpl0 = new ExpressionMatrixImpl();
      int int0 = expressionMatrixImpl0.getValue((-2163), 674);
      assertEquals((-1), int0);
  }

  /**
  //Test case number: 14
  /*Coverage entropy=1.3862943611198906
  */
  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      ExpressionMatrixImpl expressionMatrixImpl0 = new ExpressionMatrixImpl();
      MessageTracerImpl messageTracerImpl0 = new MessageTracerImpl();
      messageTracerImpl0.getMapper();
      expressionMatrixImpl0.outNoStandardConnections(true, (ExpressionElementMapper) null);
      expressionMatrixImpl0.addNewNode();
      expressionMatrixImpl0.setValue(0, 1810, 0);
      assertEquals(0, expressionMatrixImpl0.getNumberOfElements());
  }

  /**
  //Test case number: 15
  /*Coverage entropy=1.3862943611198906
  */
  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      ExpressionMatrixImpl expressionMatrixImpl0 = new ExpressionMatrixImpl();
      expressionMatrixImpl0.creatMatrix(1646);
      expressionMatrixImpl0.toString();
      expressionMatrixImpl0.setValue((-611), 1646, 1646);
      assertEquals(1646, expressionMatrixImpl0.getNumberOfElements());
  }

  /**
  //Test case number: 16
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      ExpressionMatrixImpl expressionMatrixImpl0 = new ExpressionMatrixImpl();
      expressionMatrixImpl0.setValue(0, 53, 0);
      assertEquals(0, expressionMatrixImpl0.getNumberOfElements());
  }

  /**
  //Test case number: 17
  /*Coverage entropy=1.2275294114572126
  */
  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      ExpressionMatrixImpl expressionMatrixImpl0 = new ExpressionMatrixImpl();
      expressionMatrixImpl0.toString();
      expressionMatrixImpl0.addNewNode();
      expressionMatrixImpl0.creatMatrix(1868);
      expressionMatrixImpl0.creatMatrix(1868);
      ExpressionElementMapperImpl expressionElementMapperImpl0 = new ExpressionElementMapperImpl();
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
  //Test case number: 18
  /*Coverage entropy=1.0408500236214475
  */
  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      ExpressionMatrixImpl expressionMatrixImpl0 = new ExpressionMatrixImpl();
      expressionMatrixImpl0.creatMatrix(1868);
      expressionMatrixImpl0.creatMatrix(1868);
      expressionMatrixImpl0.toString();
      expressionMatrixImpl0.creatMatrix(3196);
      expressionMatrixImpl0.addNewNode();
      expressionMatrixImpl0.toString();
      // Undeclared exception!
      expressionMatrixImpl0.toString();
  }

  /**
  //Test case number: 19
  /*Coverage entropy=1.3862943611198906
  */
  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      ExpressionMatrixImpl expressionMatrixImpl0 = new ExpressionMatrixImpl();
      expressionMatrixImpl0.addNewNode();
      expressionMatrixImpl0.creatMatrix(1391);
      expressionMatrixImpl0.addNewNode();
      expressionMatrixImpl0.setValue(0, 0, 1586);
      assertEquals(1391, expressionMatrixImpl0.getNumberOfElements());
  }

  /**
  //Test case number: 20
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      ExpressionMatrixImpl expressionMatrixImpl0 = new ExpressionMatrixImpl();
      expressionMatrixImpl0.setValue(2337, 2337, 2337);
      assertEquals(0, expressionMatrixImpl0.getNumberOfElements());
  }

  /**
  //Test case number: 21
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      ExpressionMatrixImpl expressionMatrixImpl0 = new ExpressionMatrixImpl();
      int int0 = expressionMatrixImpl0.getNumberOfNodes();
      assertEquals(0, int0);
  }

  /**
  //Test case number: 22
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      ExpressionMatrixImpl expressionMatrixImpl0 = new ExpressionMatrixImpl();
      int int0 = expressionMatrixImpl0.getNumberOfElements();
      assertEquals(0, int0);
  }
}
