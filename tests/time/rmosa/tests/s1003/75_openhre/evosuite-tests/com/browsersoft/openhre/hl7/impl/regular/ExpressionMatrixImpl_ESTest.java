/*
 * This file was automatically generated by EvoSuite
 * Thu Dec 05 18:20:33 GMT 2019
 */

package com.browsersoft.openhre.hl7.impl.regular;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.browsersoft.openhre.hl7.api.parse.HL7Checker;
import com.browsersoft.openhre.hl7.api.regular.ExpressionElementMapper;
import com.browsersoft.openhre.hl7.api.regular.MessageTracerHandler;
import com.browsersoft.openhre.hl7.impl.parser.HL7SAXEventGeneratorImpl;
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
  /*Coverage entropy=1.1714080501251627
  */
  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      ExpressionMatrixImpl expressionMatrixImpl0 = new ExpressionMatrixImpl();
      expressionMatrixImpl0.creatMatrix(6);
      int int0 = expressionMatrixImpl0.addNewNode();
      assertEquals(0, int0);
      
      expressionMatrixImpl0.setValue(0, 1, (-2697));
      MessageTracerImpl messageTracerImpl0 = new MessageTracerImpl();
      messageTracerImpl0.getMapper();
      String string0 = expressionMatrixImpl0.outNoStandardConnections(true, (ExpressionElementMapper) null);
      assertEquals("", string0);
  }

  /**
  //Test case number: 1
  /*Coverage entropy=1.1886426760554407
  */
  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      ExpressionMatrixImpl expressionMatrixImpl0 = new ExpressionMatrixImpl();
      expressionMatrixImpl0.creatMatrix(6);
      expressionMatrixImpl0.addNewNode();
      expressionMatrixImpl0.setValue(0, 1, 65);
      MessageTracerImpl messageTracerImpl0 = new MessageTracerImpl();
      expressionMatrixImpl0.outNoStandardConnections(true, (ExpressionElementMapper) null);
      expressionMatrixImpl0.outNoStandardConnections(false, (ExpressionElementMapper) null);
      expressionMatrixImpl0.toString();
      expressionMatrixImpl0.toString();
      ExpressionMatrixImpl expressionMatrixImpl1 = new ExpressionMatrixImpl();
      expressionMatrixImpl1.outNoStandardConnections(true, (ExpressionElementMapper) null);
      expressionMatrixImpl0.outNoStandardConnections(true, (ExpressionElementMapper) null);
      assertEquals(6, expressionMatrixImpl0.getNumberOfElements());
  }

  /**
  //Test case number: 2
  /*Coverage entropy=1.1803266677394324
  */
  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      ExpressionMatrixImpl expressionMatrixImpl0 = new ExpressionMatrixImpl();
      expressionMatrixImpl0.creatMatrix(11);
      expressionMatrixImpl0.addNewNode();
      expressionMatrixImpl0.setValue(0, 1, 10);
      expressionMatrixImpl0.setValue(11, 53, 0);
      String string0 = expressionMatrixImpl0.outNoStandardConnections(true, (ExpressionElementMapper) null);
      ExpressionMatrixImpl expressionMatrixImpl1 = new ExpressionMatrixImpl();
      ExpressionElementMapperImpl expressionElementMapperImpl0 = new ExpressionElementMapperImpl();
      String string1 = expressionMatrixImpl1.outNoStandardConnections(true, expressionElementMapperImpl0);
      assertFalse(string1.equals((Object)string0));
  }

  /**
  //Test case number: 3
  /*Coverage entropy=1.1714080501251627
  */
  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      ExpressionMatrixImpl expressionMatrixImpl0 = new ExpressionMatrixImpl();
      expressionMatrixImpl0.creatMatrix(6);
      expressionMatrixImpl0.addNewNode();
      expressionMatrixImpl0.setValue(0, 1, 0);
      MessageTracerImpl messageTracerImpl0 = new MessageTracerImpl();
      messageTracerImpl0.getMapper();
      expressionMatrixImpl0.outNoStandardConnections(false, (ExpressionElementMapper) null);
      assertEquals(6, expressionMatrixImpl0.getNumberOfElements());
  }

  /**
  //Test case number: 4
  /*Coverage entropy=1.1714080501251627
  */
  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      ExpressionMatrixImpl expressionMatrixImpl0 = new ExpressionMatrixImpl();
      expressionMatrixImpl0.creatMatrix(6);
      expressionMatrixImpl0.addNewNode();
      expressionMatrixImpl0.setValue(0, 1, 0);
      MessageTracerImpl messageTracerImpl0 = new MessageTracerImpl();
      messageTracerImpl0.getMapper();
      expressionMatrixImpl0.outNoStandardConnections(true, (ExpressionElementMapper) null);
      assertEquals(6, expressionMatrixImpl0.getNumberOfElements());
  }

  /**
  //Test case number: 5
  /*Coverage entropy=1.1897458200157276
  */
  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      ExpressionMatrixImpl expressionMatrixImpl0 = new ExpressionMatrixImpl();
      expressionMatrixImpl0.creatMatrix(21);
      expressionMatrixImpl0.addNewNode();
      expressionMatrixImpl0.setValue(0, 0, 21);
      MessageTracerImpl messageTracerImpl0 = new MessageTracerImpl();
      messageTracerImpl0.getMapper();
      ExpressionMatrixImpl expressionMatrixImpl1 = new ExpressionMatrixImpl();
      messageTracerImpl0.setMatrix(expressionMatrixImpl1);
      expressionMatrixImpl0.outNoStandardConnections(true, (ExpressionElementMapper) null);
      expressionMatrixImpl0.toString();
      expressionMatrixImpl0.addNewNode();
      int int0 = expressionMatrixImpl0.getValue(0, 0);
      assertEquals(21, expressionMatrixImpl0.getNumberOfElements());
      assertEquals(21, int0);
  }

  /**
  //Test case number: 6
  /*Coverage entropy=1.1217186091313738
  */
  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      ExpressionMatrixImpl expressionMatrixImpl0 = new ExpressionMatrixImpl();
      int int0 = 16384;
      expressionMatrixImpl0.creatMatrix(16384);
      // Undeclared exception!
      expressionMatrixImpl0.addNewNode();
  }

  /**
  //Test case number: 7
  /*Coverage entropy=1.1931221893068837
  */
  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      ExpressionMatrixImpl expressionMatrixImpl0 = new ExpressionMatrixImpl();
      expressionMatrixImpl0.creatMatrix(2835);
      expressionMatrixImpl0.addNewNode();
      expressionMatrixImpl0.setValue(3361, 739, 817);
      expressionMatrixImpl0.addNewNode();
      MessageTracerImpl messageTracerImpl0 = new MessageTracerImpl();
      MessageTracerImpl messageTracerImpl1 = new MessageTracerImpl();
      messageTracerImpl1.getMapper();
      expressionMatrixImpl0.outNoStandardConnections(false, (ExpressionElementMapper) null);
      // Undeclared exception!
      expressionMatrixImpl0.outNoStandardConnections(false, (ExpressionElementMapper) null);
  }

  /**
  //Test case number: 8
  /*Coverage entropy=1.5271837172395382
  */
  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      ExpressionMatrixImpl expressionMatrixImpl0 = new ExpressionMatrixImpl();
      expressionMatrixImpl0.creatMatrix((-27));
      expressionMatrixImpl0.getNumberOfElements();
      MessageTracerImpl messageTracerImpl0 = new MessageTracerImpl();
      messageTracerImpl0.reset();
      ExpressionElementMapper expressionElementMapper0 = messageTracerImpl0.getMapper();
      assertNull(expressionElementMapper0);
  }

  /**
  //Test case number: 9
  /*Coverage entropy=1.1476926351053998
  */
  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      ExpressionMatrixImpl expressionMatrixImpl0 = new ExpressionMatrixImpl();
      expressionMatrixImpl0.addNewNode();
      expressionMatrixImpl0.creatMatrix((-376));
      MessageTracerImpl messageTracerImpl0 = new MessageTracerImpl();
      ExpressionElementMapperImpl expressionElementMapperImpl0 = new ExpressionElementMapperImpl();
      expressionMatrixImpl0.outNoStandardConnections(false, expressionElementMapperImpl0);
      messageTracerImpl0.getMapper();
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
  //Test case number: 10
  /*Coverage entropy=1.1546856420984069
  */
  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      ExpressionMatrixImpl expressionMatrixImpl0 = new ExpressionMatrixImpl();
      expressionMatrixImpl0.creatMatrix(21);
      expressionMatrixImpl0.addNewNode();
      expressionMatrixImpl0.addNewNode();
      MessageTracerImpl messageTracerImpl0 = new MessageTracerImpl();
      messageTracerImpl0.getMapper();
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
  //Test case number: 11
  /*Coverage entropy=1.1476926351053998
  */
  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      ExpressionMatrixImpl expressionMatrixImpl0 = new ExpressionMatrixImpl();
      boolean boolean0 = true;
      MessageTracerImpl messageTracerImpl0 = new MessageTracerImpl();
      messageTracerImpl0.getHandler();
      messageTracerImpl0.setHandler((MessageTracerHandler) null);
      HL7SAXEventGeneratorImpl hL7SAXEventGeneratorImpl0 = new HL7SAXEventGeneratorImpl();
      hL7SAXEventGeneratorImpl0.beginField(" , ", 91, true);
      HL7Checker hL7Checker0 = hL7SAXEventGeneratorImpl0.getChecker();
      messageTracerImpl0.setHandler(hL7Checker0);
      messageTracerImpl0.getMapper();
      expressionMatrixImpl0.outNoStandardConnections(true, (ExpressionElementMapper) null);
      expressionMatrixImpl0.getValue(91, 91);
      int int0 = 98066432;
      expressionMatrixImpl0.creatMatrix(98066432);
      // Undeclared exception!
      expressionMatrixImpl0.toString();
  }

  /**
  //Test case number: 12
  /*Coverage entropy=1.1217186091313738
  */
  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      ExpressionMatrixImpl expressionMatrixImpl0 = new ExpressionMatrixImpl();
      expressionMatrixImpl0.creatMatrix((-453));
      expressionMatrixImpl0.toString();
      assertEquals((-453), expressionMatrixImpl0.getNumberOfElements());
  }

  /**
  //Test case number: 13
  /*Coverage entropy=0.4
  */
  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      ExpressionMatrixImpl expressionMatrixImpl0 = new ExpressionMatrixImpl();
      expressionMatrixImpl0.setValue((-2111), 1050, (-985));
      MessageTracerImpl messageTracerImpl0 = new MessageTracerImpl();
      ExpressionElementMapper expressionElementMapper0 = messageTracerImpl0.getMapper();
      assertNull(expressionElementMapper0);
  }

  /**
  //Test case number: 14
  /*Coverage entropy=1.5271837172395382
  */
  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      ExpressionMatrixImpl expressionMatrixImpl0 = new ExpressionMatrixImpl();
      expressionMatrixImpl0.creatMatrix(739);
      int int0 = expressionMatrixImpl0.getNumberOfElements();
      assertEquals(739, int0);
  }

  /**
  //Test case number: 15
  /*Coverage entropy=1.1217186091313738
  */
  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      ExpressionMatrixImpl expressionMatrixImpl0 = new ExpressionMatrixImpl();
      int int0 = expressionMatrixImpl0.addNewNode();
      assertEquals(0, int0);
      
      int int1 = expressionMatrixImpl0.getNumberOfNodes();
      assertFalse(int1 == int0);
  }

  /**
  //Test case number: 16
  /*Coverage entropy=1.1476926351053998
  */
  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      ExpressionMatrixImpl expressionMatrixImpl0 = new ExpressionMatrixImpl();
      expressionMatrixImpl0.creatMatrix(6);
      expressionMatrixImpl0.addNewNode();
      expressionMatrixImpl0.setValue(0, 1, 0);
      MessageTracerImpl messageTracerImpl0 = new MessageTracerImpl();
      messageTracerImpl0.setMatrix(expressionMatrixImpl0);
      messageTracerImpl0.getMapper();
      int int0 = expressionMatrixImpl0.getValue(0, 1);
      assertEquals(6, expressionMatrixImpl0.getNumberOfElements());
      assertEquals(0, int0);
  }

  /**
  //Test case number: 17
  /*Coverage entropy=0.45454545454545453
  */
  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      ExpressionMatrixImpl expressionMatrixImpl0 = new ExpressionMatrixImpl();
      expressionMatrixImpl0.addNewNode();
      expressionMatrixImpl0.setValue(0, 0, 0);
      int int0 = expressionMatrixImpl0.addNewNode();
      assertEquals(1, int0);
      
      int int1 = expressionMatrixImpl0.getValue(0, (-1));
      assertEquals((-1), int1);
  }

  /**
  //Test case number: 18
  /*Coverage entropy=0.4
  */
  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      ExpressionMatrixImpl expressionMatrixImpl0 = new ExpressionMatrixImpl();
      int int0 = expressionMatrixImpl0.getValue((-217), (-217));
      assertEquals((-1), int0);
  }

  /**
  //Test case number: 19
  /*Coverage entropy=1.0931471805599453
  */
  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      ExpressionMatrixImpl expressionMatrixImpl0 = new ExpressionMatrixImpl();
      int int0 = expressionMatrixImpl0.getNumberOfElements();
      assertEquals(0, int0);
  }

  /**
  //Test case number: 20
  /*Coverage entropy=1.1217186091313738
  */
  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      ExpressionMatrixImpl expressionMatrixImpl0 = new ExpressionMatrixImpl();
      int int0 = expressionMatrixImpl0.addNewNode();
      assertEquals(0, int0);
      
      int int1 = expressionMatrixImpl0.getValue(0, 0);
      assertEquals((-1), int1);
  }

  /**
  //Test case number: 21
  /*Coverage entropy=0.4
  */
  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      ExpressionMatrixImpl expressionMatrixImpl0 = new ExpressionMatrixImpl();
      int int0 = expressionMatrixImpl0.getValue(0, 0);
      assertEquals((-1), int0);
  }

  /**
  //Test case number: 22
  /*Coverage entropy=0.4444444444444445
  */
  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      ExpressionMatrixImpl expressionMatrixImpl0 = new ExpressionMatrixImpl();
      expressionMatrixImpl0.addNewNode();
      expressionMatrixImpl0.setValue(0, 1, 0);
      MessageTracerImpl messageTracerImpl0 = new MessageTracerImpl();
      messageTracerImpl0.getMapper();
      String string0 = expressionMatrixImpl0.outNoStandardConnections(false, (ExpressionElementMapper) null);
      assertEquals("", string0);
  }

  /**
  //Test case number: 23
  /*Coverage entropy=0.4444444444444445
  */
  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      ExpressionMatrixImpl expressionMatrixImpl0 = new ExpressionMatrixImpl();
      expressionMatrixImpl0.addNewNode();
      expressionMatrixImpl0.setValue(0, (-1291), 1660);
      ExpressionMatrixImpl expressionMatrixImpl1 = new ExpressionMatrixImpl();
      assertEquals(0, expressionMatrixImpl1.getNumberOfNodes());
  }

  /**
  //Test case number: 24
  /*Coverage entropy=1.1759058012496004
  */
  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      ExpressionMatrixImpl expressionMatrixImpl0 = new ExpressionMatrixImpl();
      expressionMatrixImpl0.addNewNode();
      expressionMatrixImpl0.creatMatrix(5);
      expressionMatrixImpl0.toString();
      assertEquals(5, expressionMatrixImpl0.getNumberOfElements());
  }

  /**
  //Test case number: 25
  /*Coverage entropy=1.1375916250043898
  */
  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      ExpressionMatrixImpl expressionMatrixImpl0 = new ExpressionMatrixImpl();
      expressionMatrixImpl0.creatMatrix(21);
      expressionMatrixImpl0.addNewNode();
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
  //Test case number: 26
  /*Coverage entropy=0.4444444444444445
  */
  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      ExpressionMatrixImpl expressionMatrixImpl0 = new ExpressionMatrixImpl();
      expressionMatrixImpl0.addNewNode();
      int int0 = expressionMatrixImpl0.addNewNode();
      assertEquals(1, int0);
      
      int int1 = expressionMatrixImpl0.getValue(1, 4387);
      assertEquals((-1), int1);
  }

  /**
  //Test case number: 27
  /*Coverage entropy=0.42857142857142855
  */
  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      ExpressionMatrixImpl expressionMatrixImpl0 = new ExpressionMatrixImpl();
      expressionMatrixImpl0.addNewNode();
      expressionMatrixImpl0.setValue(0, 0, 739);
      assertEquals(1, expressionMatrixImpl0.getNumberOfNodes());
  }

  /**
  //Test case number: 28
  /*Coverage entropy=0.4
  */
  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      ExpressionMatrixImpl expressionMatrixImpl0 = new ExpressionMatrixImpl();
      expressionMatrixImpl0.setValue(0, 0, 0);
      assertEquals(0, expressionMatrixImpl0.getNumberOfNodes());
  }

  /**
  //Test case number: 29
  /*Coverage entropy=0.4
  */
  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      ExpressionMatrixImpl expressionMatrixImpl0 = new ExpressionMatrixImpl();
      int int0 = expressionMatrixImpl0.getValue(2800, 327);
      assertEquals((-1), int0);
  }

  /**
  //Test case number: 30
  /*Coverage entropy=1.0931471805599453
  */
  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      ExpressionMatrixImpl expressionMatrixImpl0 = new ExpressionMatrixImpl();
      int int0 = expressionMatrixImpl0.getNumberOfNodes();
      assertEquals(0, int0);
  }
}
