/*
 * This file was automatically generated by EvoSuite
 * Tue Nov 10 11:59:27 GMT 2020
 */

package com.browsersoft.openhre.hl7.impl.regular;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.browsersoft.openhre.hl7.api.regular.ExpressionElementMapper;
import com.browsersoft.openhre.hl7.api.regular.ExpressionElementMapperItem;
import com.browsersoft.openhre.hl7.api.regular.MessageTracerHandler;
import com.browsersoft.openhre.hl7.impl.config.HL7MessageGroupImpl;
import com.browsersoft.openhre.hl7.impl.config.HL7MessageImpl;
import com.browsersoft.openhre.hl7.impl.config.HL7MessageMapImpl;
import com.browsersoft.openhre.hl7.impl.parser.HL7CheckerImpl;
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
  /*Coverage entropy=1.6362113129597287
  */
  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      ExpressionMatrixImpl expressionMatrixImpl0 = new ExpressionMatrixImpl();
      expressionMatrixImpl0.getNumberOfElements();
      expressionMatrixImpl0.creatMatrix(90);
      expressionMatrixImpl0.addNewNode();
      expressionMatrixImpl0.addNewNode();
      expressionMatrixImpl0.setValue(1, 0, 0);
      HL7SAXEventGeneratorImpl hL7SAXEventGeneratorImpl0 = new HL7SAXEventGeneratorImpl();
      MessageTracerImpl messageTracerImpl0 = new MessageTracerImpl();
      messageTracerImpl0.getMapper();
      expressionMatrixImpl0.creatMatrix(229);
      expressionMatrixImpl0.outNoStandardConnections(false, (ExpressionElementMapper) null);
      expressionMatrixImpl0.creatMatrix(1);
      expressionMatrixImpl0.outNoStandardConnections(false, (ExpressionElementMapper) null);
      expressionMatrixImpl0.toString();
      expressionMatrixImpl0.addNewNode();
      expressionMatrixImpl0.addNewNode();
      expressionMatrixImpl0.creatMatrix((-3297));
      ExpressionMatrixImpl expressionMatrixImpl1 = new ExpressionMatrixImpl();
      expressionMatrixImpl1.toString();
      expressionMatrixImpl0.setValue(1, 229, (-4117));
      ExpressionMatrixImpl expressionMatrixImpl2 = new ExpressionMatrixImpl();
      expressionMatrixImpl2.getValue(229, (-932));
      expressionMatrixImpl1.getValue(1, (-1));
      ExpressionMatrixImpl expressionMatrixImpl3 = new ExpressionMatrixImpl();
      expressionMatrixImpl2.toString();
      expressionMatrixImpl0.toString();
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
  //Test case number: 1
  /*Coverage entropy=1.5365439616182628
  */
  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      ExpressionMatrixImpl expressionMatrixImpl0 = new ExpressionMatrixImpl();
      expressionMatrixImpl0.getNumberOfElements();
      expressionMatrixImpl0.creatMatrix(90);
      expressionMatrixImpl0.addNewNode();
      expressionMatrixImpl0.addNewNode();
      expressionMatrixImpl0.setValue(1, 0, 0);
      HL7SAXEventGeneratorImpl hL7SAXEventGeneratorImpl0 = new HL7SAXEventGeneratorImpl();
      MessageTracerImpl messageTracerImpl0 = new MessageTracerImpl();
      messageTracerImpl0.getMapper();
      expressionMatrixImpl0.creatMatrix(229);
      expressionMatrixImpl0.outNoStandardConnections(false, (ExpressionElementMapper) null);
      ExpressionElementMapperImpl expressionElementMapperImpl0 = new ExpressionElementMapperImpl();
      expressionElementMapperImpl0.addItem((ExpressionElementMapperItem) null);
      expressionElementMapperImpl0.addItem((ExpressionElementMapperItem) null);
      expressionElementMapperImpl0.setItem(1, (ExpressionElementMapperItem) null);
      expressionElementMapperImpl0.setItem(1238, (ExpressionElementMapperItem) null);
      expressionElementMapperImpl0.getItem(1);
      expressionMatrixImpl0.getValue(414, 1);
      ExpressionElementMapperImpl expressionElementMapperImpl1 = new ExpressionElementMapperImpl();
      ExpressionElementMapperImpl expressionElementMapperImpl2 = new ExpressionElementMapperImpl();
      ExpressionElementMapperImpl expressionElementMapperImpl3 = new ExpressionElementMapperImpl();
      expressionMatrixImpl0.getValue(13, 229);
      messageTracerImpl0.getMapper();
      expressionMatrixImpl0.outNoStandardConnections(true, (ExpressionElementMapper) null);
      expressionMatrixImpl0.addNewNode();
      int int0 = expressionMatrixImpl0.addNewNode();
      assertEquals(229, expressionMatrixImpl0.getNumberOfElements());
      assertEquals(3, int0);
  }

  /**
  //Test case number: 2
  /*Coverage entropy=1.3608790768182157
  */
  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      ExpressionMatrixImpl expressionMatrixImpl0 = new ExpressionMatrixImpl();
      expressionMatrixImpl0.getNumberOfElements();
      expressionMatrixImpl0.creatMatrix(90);
      expressionMatrixImpl0.addNewNode();
      expressionMatrixImpl0.setValue(0, 0, 0);
      HL7SAXEventGeneratorImpl hL7SAXEventGeneratorImpl0 = new HL7SAXEventGeneratorImpl();
      MessageTracerImpl messageTracerImpl0 = new MessageTracerImpl();
      messageTracerImpl0.getMapper();
      expressionMatrixImpl0.creatMatrix(229);
      ExpressionElementMapperImpl expressionElementMapperImpl0 = new ExpressionElementMapperImpl();
      expressionElementMapperImpl0.addItem((ExpressionElementMapperItem) null);
      expressionElementMapperImpl0.addItem((ExpressionElementMapperItem) null);
      expressionElementMapperImpl0.setItem(0, (ExpressionElementMapperItem) null);
      expressionElementMapperImpl0.setItem(1238, (ExpressionElementMapperItem) null);
      expressionElementMapperImpl0.getItem(0);
      expressionElementMapperImpl0.setItem(0, (ExpressionElementMapperItem) null);
      ExpressionElementMapperItemImpl expressionElementMapperItemImpl0 = new ExpressionElementMapperItemImpl();
      ExpressionElementMapperImpl expressionElementMapperImpl1 = new ExpressionElementMapperImpl();
      ExpressionElementMapperImpl expressionElementMapperImpl2 = new ExpressionElementMapperImpl();
      expressionElementMapperImpl0.setItem(0, expressionElementMapperItemImpl0);
      expressionMatrixImpl0.getValue(0, (-782));
      ExpressionElementMapperImpl expressionElementMapperImpl3 = new ExpressionElementMapperImpl();
      ExpressionElementMapperImpl expressionElementMapperImpl4 = new ExpressionElementMapperImpl();
      ExpressionElementMapperImpl expressionElementMapperImpl5 = new ExpressionElementMapperImpl();
      expressionMatrixImpl0.getValue(0, 0);
      messageTracerImpl0.getMapper();
      expressionMatrixImpl0.toString();
      assertEquals(229, expressionMatrixImpl0.getNumberOfElements());
  }

  /**
  //Test case number: 3
  /*Coverage entropy=1.6434263483462597
  */
  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      ExpressionMatrixImpl expressionMatrixImpl0 = new ExpressionMatrixImpl();
      expressionMatrixImpl0.getNumberOfElements();
      expressionMatrixImpl0.creatMatrix(90);
      expressionMatrixImpl0.addNewNode();
      expressionMatrixImpl0.setValue(0, 0, 0);
      HL7SAXEventGeneratorImpl hL7SAXEventGeneratorImpl0 = new HL7SAXEventGeneratorImpl();
      MessageTracerImpl messageTracerImpl0 = new MessageTracerImpl();
      messageTracerImpl0.getMapper();
      expressionMatrixImpl0.creatMatrix(229);
      expressionMatrixImpl0.outNoStandardConnections(false, (ExpressionElementMapper) null);
      ExpressionElementMapperImpl expressionElementMapperImpl0 = new ExpressionElementMapperImpl();
      expressionElementMapperImpl0.addItem((ExpressionElementMapperItem) null);
      expressionElementMapperImpl0.addItem((ExpressionElementMapperItem) null);
      expressionElementMapperImpl0.setItem(0, (ExpressionElementMapperItem) null);
      expressionElementMapperImpl0.setItem(1238, (ExpressionElementMapperItem) null);
      expressionElementMapperImpl0.getItem(0);
      expressionElementMapperImpl0.setItem(0, (ExpressionElementMapperItem) null);
      ExpressionElementMapperItemImpl expressionElementMapperItemImpl0 = new ExpressionElementMapperItemImpl();
      expressionElementMapperImpl0.getItem(202);
      expressionElementMapperImpl0.setItem(200, (ExpressionElementMapperItem) null);
      expressionMatrixImpl0.getValue(229, 0);
      ExpressionElementMapperImpl expressionElementMapperImpl1 = new ExpressionElementMapperImpl();
      ExpressionElementMapperImpl expressionElementMapperImpl2 = new ExpressionElementMapperImpl();
      ExpressionElementMapperImpl expressionElementMapperImpl3 = new ExpressionElementMapperImpl();
      expressionMatrixImpl0.getValue(0, 215);
      expressionMatrixImpl0.outNoStandardConnections(false, (ExpressionElementMapper) null);
      assertEquals(229, expressionMatrixImpl0.getNumberOfElements());
  }

  /**
  //Test case number: 4
  /*Coverage entropy=1.5752701287309485
  */
  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      ExpressionMatrixImpl expressionMatrixImpl0 = new ExpressionMatrixImpl();
      expressionMatrixImpl0.getNumberOfElements();
      int int0 = 90;
      expressionMatrixImpl0.creatMatrix(90);
      expressionMatrixImpl0.addNewNode();
      expressionMatrixImpl0.setValue(0, 0, 0);
      HL7SAXEventGeneratorImpl hL7SAXEventGeneratorImpl0 = new HL7SAXEventGeneratorImpl();
      MessageTracerImpl messageTracerImpl0 = new MessageTracerImpl();
      messageTracerImpl0.getMapper();
      int int1 = 76;
      expressionMatrixImpl0.creatMatrix(76);
      expressionMatrixImpl0.toString();
      expressionMatrixImpl0.creatMatrix(8388607);
      // Undeclared exception!
      expressionMatrixImpl0.outNoStandardConnections(false, (ExpressionElementMapper) null);
  }

  /**
  //Test case number: 5
  /*Coverage entropy=1.6434263483462597
  */
  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      ExpressionMatrixImpl expressionMatrixImpl0 = new ExpressionMatrixImpl();
      expressionMatrixImpl0.getNumberOfElements();
      expressionMatrixImpl0.creatMatrix(90);
      expressionMatrixImpl0.addNewNode();
      expressionMatrixImpl0.setValue(0, 0, 0);
      HL7SAXEventGeneratorImpl hL7SAXEventGeneratorImpl0 = new HL7SAXEventGeneratorImpl();
      MessageTracerImpl messageTracerImpl0 = new MessageTracerImpl();
      messageTracerImpl0.getMapper();
      expressionMatrixImpl0.creatMatrix(229);
      ExpressionElementMapperImpl expressionElementMapperImpl0 = new ExpressionElementMapperImpl();
      expressionElementMapperImpl0.addItem((ExpressionElementMapperItem) null);
      expressionElementMapperImpl0.addItem((ExpressionElementMapperItem) null);
      expressionElementMapperImpl0.setItem(0, (ExpressionElementMapperItem) null);
      expressionElementMapperImpl0.setItem(1238, (ExpressionElementMapperItem) null);
      expressionElementMapperImpl0.getItem(0);
      expressionElementMapperImpl0.setItem(0, (ExpressionElementMapperItem) null);
      ExpressionElementMapperItemImpl expressionElementMapperItemImpl0 = new ExpressionElementMapperItemImpl();
      ExpressionElementMapperImpl expressionElementMapperImpl1 = new ExpressionElementMapperImpl();
      expressionElementMapperImpl0.setItem(0, (ExpressionElementMapperItem) null);
      expressionMatrixImpl0.getValue(0, 13);
      ExpressionElementMapperImpl expressionElementMapperImpl2 = new ExpressionElementMapperImpl();
      ExpressionElementMapperImpl expressionElementMapperImpl3 = new ExpressionElementMapperImpl();
      ExpressionElementMapperImpl expressionElementMapperImpl4 = new ExpressionElementMapperImpl();
      expressionMatrixImpl0.getValue(1, 1238);
      messageTracerImpl0.getMapper();
      expressionMatrixImpl0.outNoStandardConnections(true, (ExpressionElementMapper) null);
      assertEquals(229, expressionMatrixImpl0.getNumberOfElements());
  }

  /**
  //Test case number: 6
  /*Coverage entropy=1.3608790768182157
  */
  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      ExpressionMatrixImpl expressionMatrixImpl0 = new ExpressionMatrixImpl();
      expressionMatrixImpl0.getNumberOfElements();
      expressionMatrixImpl0.creatMatrix(90);
      expressionMatrixImpl0.addNewNode();
      expressionMatrixImpl0.setValue(0, 0, 0);
      HL7SAXEventGeneratorImpl hL7SAXEventGeneratorImpl0 = new HL7SAXEventGeneratorImpl();
      expressionMatrixImpl0.toString();
      expressionMatrixImpl0.creatMatrix(2035);
      expressionMatrixImpl0.toString();
      expressionMatrixImpl0.toString();
      expressionMatrixImpl0.addNewNode();
      expressionMatrixImpl0.creatMatrix(1);
      expressionMatrixImpl0.setValue(0, 1, (-2536));
      expressionMatrixImpl0.getValue(85, 2035);
      expressionMatrixImpl0.getValue(225, (-1));
      assertEquals(1, expressionMatrixImpl0.getNumberOfElements());
      
      ExpressionMatrixImpl expressionMatrixImpl1 = new ExpressionMatrixImpl();
      expressionMatrixImpl1.toString();
      String string0 = expressionMatrixImpl1.toString();
      assertEquals("MATRIX\n-----------------------\n | \n\nCONNECTIONS\n-----------------------\n", string0);
  }

  /**
  //Test case number: 7
  /*Coverage entropy=1.321086142965562
  */
  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      ExpressionMatrixImpl expressionMatrixImpl0 = new ExpressionMatrixImpl();
      expressionMatrixImpl0.creatMatrix(891);
      expressionMatrixImpl0.addNewNode();
      expressionMatrixImpl0.toString();
      ExpressionElementMapperImpl expressionElementMapperImpl0 = new ExpressionElementMapperImpl();
      ExpressionElementMapperItemImpl expressionElementMapperItemImpl0 = new ExpressionElementMapperItemImpl();
      expressionElementMapperImpl0.removeItem(1091);
      expressionElementMapperImpl0.addItem(expressionElementMapperItemImpl0);
      ExpressionElementMapperItemImpl expressionElementMapperItemImpl1 = new ExpressionElementMapperItemImpl();
      expressionElementMapperImpl0.setItem(91, expressionElementMapperItemImpl1);
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
  //Test case number: 8
  /*Coverage entropy=1.715263227902811
  */
  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      ExpressionMatrixImpl expressionMatrixImpl0 = new ExpressionMatrixImpl();
      expressionMatrixImpl0.getNumberOfElements();
      expressionMatrixImpl0.addNewNode();
      expressionMatrixImpl0.setValue((-255), 0, 1028);
      HL7SAXEventGeneratorImpl hL7SAXEventGeneratorImpl0 = new HL7SAXEventGeneratorImpl();
      MessageTracerImpl messageTracerImpl0 = new MessageTracerImpl();
      messageTracerImpl0.getMapper();
      expressionMatrixImpl0.creatMatrix((-255));
      expressionMatrixImpl0.outNoStandardConnections(false, (ExpressionElementMapper) null);
      ExpressionElementMapperImpl expressionElementMapperImpl0 = new ExpressionElementMapperImpl();
      expressionElementMapperImpl0.addItem((ExpressionElementMapperItem) null);
      expressionElementMapperImpl0.setItem(1028, (ExpressionElementMapperItem) null);
      expressionElementMapperImpl0.setItem(976, (ExpressionElementMapperItem) null);
      expressionElementMapperImpl0.getItem(229);
      expressionElementMapperImpl0.setItem(1028, (ExpressionElementMapperItem) null);
      ExpressionElementMapperItemImpl expressionElementMapperItemImpl0 = new ExpressionElementMapperItemImpl();
      ExpressionElementMapperImpl expressionElementMapperImpl1 = new ExpressionElementMapperImpl();
      expressionElementMapperImpl1.setItem(871, expressionElementMapperItemImpl0);
      expressionMatrixImpl0.getValue((-1131), 0);
      ExpressionElementMapperImpl expressionElementMapperImpl2 = new ExpressionElementMapperImpl();
      ExpressionElementMapperImpl expressionElementMapperImpl3 = new ExpressionElementMapperImpl();
      ExpressionElementMapperImpl expressionElementMapperImpl4 = new ExpressionElementMapperImpl();
      expressionMatrixImpl0.getValue((-1060), 229);
      expressionMatrixImpl0.toString();
      assertEquals((-255), expressionMatrixImpl0.getNumberOfElements());
  }

  /**
  //Test case number: 9
  /*Coverage entropy=1.3860040923229053
  */
  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      ExpressionMatrixImpl expressionMatrixImpl0 = new ExpressionMatrixImpl();
      expressionMatrixImpl0.addNewNode();
      expressionMatrixImpl0.addNewNode();
      expressionMatrixImpl0.getNumberOfElements();
      expressionMatrixImpl0.setValue(0, 0, 1);
      HL7SAXEventGeneratorImpl hL7SAXEventGeneratorImpl0 = new HL7SAXEventGeneratorImpl();
      expressionMatrixImpl0.creatMatrix(2625);
      ExpressionElementMapperImpl expressionElementMapperImpl0 = new ExpressionElementMapperImpl();
      ExpressionElementMapperImpl expressionElementMapperImpl1 = new ExpressionElementMapperImpl();
      expressionElementMapperImpl1.addItem((ExpressionElementMapperItem) null);
      expressionElementMapperImpl1.setItem((-1), (ExpressionElementMapperItem) null);
      ExpressionElementMapperImpl expressionElementMapperImpl2 = new ExpressionElementMapperImpl();
      ExpressionElementMapperImpl expressionElementMapperImpl3 = new ExpressionElementMapperImpl();
      expressionElementMapperImpl3.toString();
      expressionElementMapperImpl3.setItem((-1), (ExpressionElementMapperItem) null);
      expressionElementMapperImpl0.getItem((-1220));
      expressionElementMapperImpl0.setItem((-1), (ExpressionElementMapperItem) null);
      ExpressionElementMapperItemImpl expressionElementMapperItemImpl0 = new ExpressionElementMapperItemImpl();
      ExpressionElementMapperImpl expressionElementMapperImpl4 = new ExpressionElementMapperImpl();
      expressionElementMapperItemImpl0.toString();
      ExpressionElementMapperItemImpl expressionElementMapperItemImpl1 = new ExpressionElementMapperItemImpl();
      expressionElementMapperImpl2.setItem(0, expressionElementMapperItemImpl1);
      expressionMatrixImpl0.getValue((-743), 65);
      expressionMatrixImpl0.setValue(2625, (-8388608), 2625);
      // Undeclared exception!
      expressionMatrixImpl0.toString();
  }

  /**
  //Test case number: 10
  /*Coverage entropy=1.0397207708399179
  */
  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      MessageTracerImpl messageTracerImpl0 = new MessageTracerImpl();
      HL7MessageImpl hL7MessageImpl0 = new HL7MessageImpl();
      HL7MessageGroupImpl hL7MessageGroupImpl0 = new HL7MessageGroupImpl();
      messageTracerImpl0.setHandler((MessageTracerHandler) null);
      ExpressionMatrixImpl expressionMatrixImpl0 = new ExpressionMatrixImpl();
      expressionMatrixImpl0.setValue((-3237), (-3237), 373);
      ExpressionElementMapperImpl expressionElementMapperImpl0 = new ExpressionElementMapperImpl();
      expressionElementMapperImpl0.addItem((ExpressionElementMapperItem) null);
      expressionElementMapperImpl0.setItem(373, (ExpressionElementMapperItem) null);
      expressionMatrixImpl0.getValue(373, 373);
      ExpressionElementMapperImpl expressionElementMapperImpl1 = new ExpressionElementMapperImpl();
      int int0 = expressionMatrixImpl0.getValue(1987, 373);
      assertEquals((-1), int0);
  }

  /**
  //Test case number: 11
  /*Coverage entropy=1.4327570529970877
  */
  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      ExpressionMatrixImpl expressionMatrixImpl0 = new ExpressionMatrixImpl();
      expressionMatrixImpl0.addNewNode();
      expressionMatrixImpl0.addNewNode();
      expressionMatrixImpl0.setValue(0, 0, 1);
      HL7SAXEventGeneratorImpl hL7SAXEventGeneratorImpl0 = new HL7SAXEventGeneratorImpl();
      HL7CheckerImpl hL7CheckerImpl0 = new HL7CheckerImpl();
      MessageTracerImpl messageTracerImpl0 = new MessageTracerImpl();
      messageTracerImpl0.getMapper();
      expressionMatrixImpl0.outNoStandardConnections(false, (ExpressionElementMapper) null);
      ExpressionElementMapperImpl expressionElementMapperImpl0 = new ExpressionElementMapperImpl();
      expressionElementMapperImpl0.getItem(390);
      expressionElementMapperImpl0.addItem((ExpressionElementMapperItem) null);
      expressionElementMapperImpl0.setItem(9, (ExpressionElementMapperItem) null);
      expressionElementMapperImpl0.setItem(0, (ExpressionElementMapperItem) null);
      ExpressionElementMapperImpl expressionElementMapperImpl1 = new ExpressionElementMapperImpl();
      expressionElementMapperImpl1.getItem(1);
      ExpressionElementMapperImpl expressionElementMapperImpl2 = new ExpressionElementMapperImpl();
      expressionElementMapperImpl2.setItem((-867), (ExpressionElementMapperItem) null);
      ExpressionElementMapperItemImpl expressionElementMapperItemImpl0 = new ExpressionElementMapperItemImpl();
      ExpressionElementMapperImpl expressionElementMapperImpl3 = new ExpressionElementMapperImpl();
      expressionElementMapperImpl0.setItem(408, (ExpressionElementMapperItem) null);
      expressionMatrixImpl0.getValue((-3409), 65);
      ExpressionElementMapperImpl expressionElementMapperImpl4 = new ExpressionElementMapperImpl();
      ExpressionElementMapperImpl expressionElementMapperImpl5 = new ExpressionElementMapperImpl();
      ExpressionElementMapperImpl expressionElementMapperImpl6 = new ExpressionElementMapperImpl();
      expressionMatrixImpl0.getValue(1, 0);
      expressionMatrixImpl0.addNewNode();
      String string0 = expressionMatrixImpl0.outNoStandardConnections(true, expressionElementMapperImpl1);
      assertEquals("", string0);
  }

  /**
  //Test case number: 12
  /*Coverage entropy=1.0027182645175161
  */
  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      ExpressionMatrixImpl expressionMatrixImpl0 = new ExpressionMatrixImpl();
      expressionMatrixImpl0.addNewNode();
      expressionMatrixImpl0.getValue(0, 0);
      ExpressionElementMapperImpl expressionElementMapperImpl0 = new ExpressionElementMapperImpl();
      expressionMatrixImpl0.getValue(0, (-1));
      expressionMatrixImpl0.setValue((-1), (-3911), (-2824));
      expressionElementMapperImpl0.setItem((-1), (ExpressionElementMapperItem) null);
      expressionMatrixImpl0.getValue((-2824), (-2824));
      ExpressionElementMapperImpl expressionElementMapperImpl1 = new ExpressionElementMapperImpl();
      assertEquals(0, expressionElementMapperImpl1.size());
  }

  /**
  //Test case number: 13
  /*Coverage entropy=1.0027182645175161
  */
  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      ExpressionMatrixImpl expressionMatrixImpl0 = new ExpressionMatrixImpl();
      expressionMatrixImpl0.toString();
      expressionMatrixImpl0.creatMatrix(65);
      ExpressionMatrixImpl expressionMatrixImpl1 = new ExpressionMatrixImpl();
      expressionMatrixImpl1.creatMatrix((-1627));
      ExpressionMatrixImpl expressionMatrixImpl2 = new ExpressionMatrixImpl();
      expressionMatrixImpl2.getNumberOfElements();
      expressionMatrixImpl0.toString();
      expressionMatrixImpl2.creatMatrix((-1422));
      expressionMatrixImpl2.getNumberOfElements();
      expressionMatrixImpl2.getNumberOfElements();
      expressionMatrixImpl2.toString();
      assertEquals((-1422), expressionMatrixImpl2.getNumberOfElements());
  }

  /**
  //Test case number: 14
  /*Coverage entropy=1.6769877743224173
  */
  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      ExpressionMatrixImpl expressionMatrixImpl0 = new ExpressionMatrixImpl();
      expressionMatrixImpl0.getNumberOfElements();
      expressionMatrixImpl0.setValue(0, (-1), (-1));
      expressionMatrixImpl0.creatMatrix((-1309));
      expressionMatrixImpl0.getValue((-1309), 2250);
      expressionMatrixImpl0.toString();
      assertEquals((-1309), expressionMatrixImpl0.getNumberOfElements());
  }

  /**
  //Test case number: 15
  /*Coverage entropy=1.277034259466139
  */
  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      HL7CheckerImpl hL7CheckerImpl0 = new HL7CheckerImpl();
      MessageTracerImpl messageTracerImpl0 = new MessageTracerImpl();
      ExpressionMatrixImpl expressionMatrixImpl0 = new ExpressionMatrixImpl();
      expressionMatrixImpl0.addNewNode();
      ExpressionElementMapperImpl expressionElementMapperImpl0 = new ExpressionElementMapperImpl();
      expressionMatrixImpl0.addNewNode();
      expressionMatrixImpl0.setValue(1, (-691), (-691));
      expressionElementMapperImpl0.setItem(1, (ExpressionElementMapperItem) null);
      ExpressionMatrixImpl expressionMatrixImpl1 = new ExpressionMatrixImpl();
      expressionMatrixImpl1.getValue(65, 1221);
      ExpressionElementMapperImpl expressionElementMapperImpl1 = new ExpressionElementMapperImpl();
      ExpressionElementMapperImpl expressionElementMapperImpl2 = new ExpressionElementMapperImpl();
      assertFalse(expressionElementMapperImpl2.equals((Object)expressionElementMapperImpl0));
  }

  /**
  //Test case number: 16
  /*Coverage entropy=1.4750763110546947
  */
  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      ExpressionMatrixImpl expressionMatrixImpl0 = new ExpressionMatrixImpl();
      ExpressionElementMapperImpl expressionElementMapperImpl0 = new ExpressionElementMapperImpl();
      expressionElementMapperImpl0.clearAll();
      ExpressionElementMapperImpl expressionElementMapperImpl1 = new ExpressionElementMapperImpl();
      expressionElementMapperImpl0.clearAll();
      ExpressionElementMapperImpl expressionElementMapperImpl2 = new ExpressionElementMapperImpl();
      expressionElementMapperImpl2.getItem(400);
      expressionElementMapperImpl1.setItem(400, (ExpressionElementMapperItem) null);
      expressionElementMapperImpl1.getItem((-111));
      expressionElementMapperImpl0.addItem((ExpressionElementMapperItem) null);
      expressionMatrixImpl0.toString();
      expressionMatrixImpl0.creatMatrix((-111));
      expressionMatrixImpl0.toString();
      expressionMatrixImpl0.getNumberOfElements();
      ExpressionElementMapperImpl expressionElementMapperImpl3 = new ExpressionElementMapperImpl();
      expressionMatrixImpl0.toString();
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
  //Test case number: 17
  /*Coverage entropy=1.1490596969706202
  */
  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      ExpressionMatrixImpl expressionMatrixImpl0 = new ExpressionMatrixImpl();
      expressionMatrixImpl0.addNewNode();
      expressionMatrixImpl0.getValue(0, 2080);
      ExpressionElementMapperImpl expressionElementMapperImpl0 = new ExpressionElementMapperImpl();
      ExpressionElementMapperItemImpl expressionElementMapperItemImpl0 = new ExpressionElementMapperItemImpl();
      ExpressionElementMapperItemImpl expressionElementMapperItemImpl1 = new ExpressionElementMapperItemImpl();
      expressionElementMapperItemImpl1.setType(0);
      expressionElementMapperImpl0.setItem(230, expressionElementMapperItemImpl1);
      expressionMatrixImpl0.addNewNode();
      expressionMatrixImpl0.setValue(2695, 539, (-1));
      expressionElementMapperImpl0.setItem(230, (ExpressionElementMapperItem) null);
      expressionMatrixImpl0.getValue(3619, 1);
      ExpressionElementMapperImpl expressionElementMapperImpl1 = new ExpressionElementMapperImpl();
      ExpressionElementMapperImpl expressionElementMapperImpl2 = new ExpressionElementMapperImpl();
      assertFalse(expressionElementMapperImpl2.equals((Object)expressionElementMapperImpl1));
  }

  /**
  //Test case number: 18
  /*Coverage entropy=1.407362422885939
  */
  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      ExpressionMatrixImpl expressionMatrixImpl0 = new ExpressionMatrixImpl();
      expressionMatrixImpl0.getNumberOfElements();
      expressionMatrixImpl0.creatMatrix(90);
      expressionMatrixImpl0.creatMatrix(192);
      ExpressionElementMapperImpl expressionElementMapperImpl0 = new ExpressionElementMapperImpl();
      expressionMatrixImpl0.addNewNode();
      expressionMatrixImpl0.toString();
      expressionMatrixImpl0.creatMatrix(175);
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
  /*Coverage entropy=1.663232462218104
  */
  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      ExpressionMatrixImpl expressionMatrixImpl0 = new ExpressionMatrixImpl();
      expressionMatrixImpl0.getNumberOfElements();
      expressionMatrixImpl0.addNewNode();
      expressionMatrixImpl0.setValue(0, 0, 0);
      HL7SAXEventGeneratorImpl hL7SAXEventGeneratorImpl0 = new HL7SAXEventGeneratorImpl();
      MessageTracerImpl messageTracerImpl0 = new MessageTracerImpl();
      messageTracerImpl0.getMapper();
      expressionMatrixImpl0.creatMatrix(229);
      expressionMatrixImpl0.outNoStandardConnections(false, (ExpressionElementMapper) null);
      ExpressionElementMapperImpl expressionElementMapperImpl0 = new ExpressionElementMapperImpl();
      expressionElementMapperImpl0.addItem((ExpressionElementMapperItem) null);
      expressionElementMapperImpl0.addItem((ExpressionElementMapperItem) null);
      expressionElementMapperImpl0.setItem(0, (ExpressionElementMapperItem) null);
      expressionElementMapperImpl0.setItem(1243, (ExpressionElementMapperItem) null);
      expressionElementMapperImpl0.getItem(0);
      expressionElementMapperImpl0.setItem(0, (ExpressionElementMapperItem) null);
      ExpressionElementMapperItemImpl expressionElementMapperItemImpl0 = new ExpressionElementMapperItemImpl();
      ExpressionElementMapperImpl expressionElementMapperImpl1 = new ExpressionElementMapperImpl();
      expressionElementMapperImpl0.setItem(0, (ExpressionElementMapperItem) null);
      expressionMatrixImpl0.getValue(0, 13);
      ExpressionElementMapperImpl expressionElementMapperImpl2 = new ExpressionElementMapperImpl();
      ExpressionElementMapperImpl expressionElementMapperImpl3 = new ExpressionElementMapperImpl();
      ExpressionElementMapperImpl expressionElementMapperImpl4 = new ExpressionElementMapperImpl();
      expressionMatrixImpl0.getValue(1, 1243);
      messageTracerImpl0.getMapper();
      expressionMatrixImpl0.outNoStandardConnections(false, (ExpressionElementMapper) null);
      assertEquals(229, expressionMatrixImpl0.getNumberOfElements());
  }

  /**
  //Test case number: 20
  /*Coverage entropy=1.1490596969706202
  */
  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      ExpressionMatrixImpl expressionMatrixImpl0 = new ExpressionMatrixImpl();
      expressionMatrixImpl0.addNewNode();
      expressionMatrixImpl0.getValue(0, 0);
      ExpressionElementMapperImpl expressionElementMapperImpl0 = new ExpressionElementMapperImpl();
      ExpressionElementMapperItemImpl expressionElementMapperItemImpl0 = new ExpressionElementMapperItemImpl();
      ExpressionElementMapperItemImpl expressionElementMapperItemImpl1 = new ExpressionElementMapperItemImpl();
      expressionElementMapperItemImpl1.setType(2070);
      expressionElementMapperImpl0.setItem(3619, expressionElementMapperItemImpl1);
      expressionMatrixImpl0.addNewNode();
      expressionMatrixImpl0.setValue(1064, 2695, 0);
      expressionElementMapperImpl0.setItem(4, (ExpressionElementMapperItem) null);
      expressionMatrixImpl0.getValue((-3911), 0);
      ExpressionElementMapperImpl expressionElementMapperImpl1 = new ExpressionElementMapperImpl();
      ExpressionElementMapperImpl expressionElementMapperImpl2 = new ExpressionElementMapperImpl();
      assertEquals(0, expressionElementMapperImpl2.size());
  }

  /**
  //Test case number: 21
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      HL7CheckerImpl hL7CheckerImpl0 = new HL7CheckerImpl();
      MessageTracerImpl messageTracerImpl0 = new MessageTracerImpl();
      HL7CheckerImpl hL7CheckerImpl1 = new HL7CheckerImpl();
      hL7CheckerImpl1.getState();
      HL7CheckerImpl hL7CheckerImpl2 = new HL7CheckerImpl();
      HL7CheckerImpl hL7CheckerImpl3 = new HL7CheckerImpl();
      HL7MessageMapImpl hL7MessageMapImpl0 = new HL7MessageMapImpl();
      HL7MessageMapImpl hL7MessageMapImpl1 = new HL7MessageMapImpl();
      HL7MessageMapImpl hL7MessageMapImpl2 = new HL7MessageMapImpl();
      HL7MessageMapImpl hL7MessageMapImpl3 = new HL7MessageMapImpl();
      HL7MessageMapImpl hL7MessageMapImpl4 = new HL7MessageMapImpl();
      HL7MessageMapImpl hL7MessageMapImpl5 = new HL7MessageMapImpl();
      HL7MessageMapImpl hL7MessageMapImpl6 = new HL7MessageMapImpl();
      MessageTracerImpl messageTracerImpl1 = new MessageTracerImpl();
      messageTracerImpl1.setHandler(hL7CheckerImpl1);
      HL7MessageMapImpl hL7MessageMapImpl7 = new HL7MessageMapImpl();
      HL7MessageMapImpl hL7MessageMapImpl8 = new HL7MessageMapImpl();
      HL7MessageMapImpl hL7MessageMapImpl9 = new HL7MessageMapImpl();
      hL7MessageMapImpl6.getItem("X5Ed-;#K");
      MessageTracerImpl messageTracerImpl2 = new MessageTracerImpl();
      MessageTracerImpl messageTracerImpl3 = new MessageTracerImpl();
      HL7CheckerImpl hL7CheckerImpl4 = new HL7CheckerImpl();
      ExpressionMatrixImpl expressionMatrixImpl0 = new ExpressionMatrixImpl();
      expressionMatrixImpl0.addNewNode();
      int int0 = expressionMatrixImpl0.addNewNode();
      assertEquals(1, int0);
      
      int int1 = expressionMatrixImpl0.getNumberOfNodes();
      assertFalse(int1 == int0);
  }

  /**
  //Test case number: 22
  /*Coverage entropy=1.1935496040981333
  */
  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      ExpressionMatrixImpl expressionMatrixImpl0 = new ExpressionMatrixImpl();
      expressionMatrixImpl0.addNewNode();
      expressionMatrixImpl0.addNewNode();
      expressionMatrixImpl0.getValue(0, 0);
      expressionMatrixImpl0.setValue(0, 0, 1);
      HL7SAXEventGeneratorImpl hL7SAXEventGeneratorImpl0 = new HL7SAXEventGeneratorImpl();
      MessageTracerImpl messageTracerImpl0 = new MessageTracerImpl();
      messageTracerImpl0.getMapper();
      HL7MessageMapImpl hL7MessageMapImpl0 = new HL7MessageMapImpl();
      HL7MessageMapImpl hL7MessageMapImpl1 = new HL7MessageMapImpl();
      MessageTracerImpl messageTracerImpl1 = new MessageTracerImpl();
      messageTracerImpl1.setHandler((MessageTracerHandler) null);
      assertNotSame(messageTracerImpl1, messageTracerImpl0);
  }

  /**
  //Test case number: 23
  /*Coverage entropy=1.4941751382893083
  */
  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      ExpressionMatrixImpl expressionMatrixImpl0 = new ExpressionMatrixImpl();
      ExpressionMatrixImpl expressionMatrixImpl1 = new ExpressionMatrixImpl();
      expressionMatrixImpl1.getValue(3436, 3436);
      ExpressionElementMapperImpl expressionElementMapperImpl0 = new ExpressionElementMapperImpl();
      ExpressionElementMapperItemImpl expressionElementMapperItemImpl0 = new ExpressionElementMapperItemImpl();
      expressionElementMapperImpl0.setItem((-51), (ExpressionElementMapperItem) null);
      expressionMatrixImpl0.addNewNode();
      expressionMatrixImpl0.setValue((-2824), (-5013), 3438);
      expressionElementMapperImpl0.getItem(90);
      expressionElementMapperImpl0.setItem((-585), (ExpressionElementMapperItem) null);
      expressionMatrixImpl1.getValue(3438, (-1));
      ExpressionElementMapperImpl expressionElementMapperImpl1 = new ExpressionElementMapperImpl();
      expressionElementMapperImpl1.removeItem((-4721));
      ExpressionElementMapperImpl expressionElementMapperImpl2 = new ExpressionElementMapperImpl();
      String string0 = expressionMatrixImpl0.outNoStandardConnections(false, expressionElementMapperImpl1);
      assertEquals("", string0);
  }

  /**
  //Test case number: 24
  /*Coverage entropy=1.294545165844896
  */
  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      ExpressionMatrixImpl expressionMatrixImpl0 = new ExpressionMatrixImpl();
      expressionMatrixImpl0.creatMatrix(2917);
      expressionMatrixImpl0.getNumberOfElements();
      expressionMatrixImpl0.toString();
      expressionMatrixImpl0.addNewNode();
      ExpressionMatrixImpl expressionMatrixImpl1 = new ExpressionMatrixImpl();
      expressionMatrixImpl1.getNumberOfElements();
      expressionMatrixImpl0.getNumberOfElements();
      assertEquals(2917, expressionMatrixImpl0.getNumberOfElements());
      
      expressionMatrixImpl1.toString();
      expressionMatrixImpl1.toString();
      int int0 = expressionMatrixImpl1.addNewNode();
      assertEquals(0, int0);
  }

  /**
  //Test case number: 25
  /*Coverage entropy=1.15374194270109
  */
  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      ExpressionMatrixImpl expressionMatrixImpl0 = new ExpressionMatrixImpl();
      expressionMatrixImpl0.addNewNode();
      expressionMatrixImpl0.getValue((-4636), 0);
      ExpressionElementMapperImpl expressionElementMapperImpl0 = new ExpressionElementMapperImpl();
      ExpressionElementMapperItemImpl expressionElementMapperItemImpl0 = new ExpressionElementMapperItemImpl();
      expressionElementMapperImpl0.setItem(0, expressionElementMapperItemImpl0);
      expressionMatrixImpl0.addNewNode();
      expressionMatrixImpl0.setValue(0, 3453, 0);
      expressionElementMapperImpl0.setItem(1, (ExpressionElementMapperItem) null);
      expressionMatrixImpl0.getValue((-2824), 3437);
      ExpressionElementMapperImpl expressionElementMapperImpl1 = new ExpressionElementMapperImpl();
      ExpressionElementMapperImpl expressionElementMapperImpl2 = new ExpressionElementMapperImpl();
      assertFalse(expressionElementMapperImpl2.equals((Object)expressionElementMapperImpl0));
  }

  /**
  //Test case number: 26
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      ExpressionMatrixImpl expressionMatrixImpl0 = new ExpressionMatrixImpl();
      int int0 = expressionMatrixImpl0.getNumberOfNodes();
      assertEquals(0, int0);
  }
}
