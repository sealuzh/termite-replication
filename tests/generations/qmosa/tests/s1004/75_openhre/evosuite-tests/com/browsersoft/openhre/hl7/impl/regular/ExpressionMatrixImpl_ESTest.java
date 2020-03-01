/*
 * This file was automatically generated by EvoSuite
 * Fri Nov 15 15:11:58 GMT 2019
 */

package com.browsersoft.openhre.hl7.impl.regular;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.browsersoft.openhre.hl7.api.config.HL7MessageGroup;
import com.browsersoft.openhre.hl7.api.config.HL7MessageGroupItem;
import com.browsersoft.openhre.hl7.api.config.HL7Segment;
import com.browsersoft.openhre.hl7.api.regular.ExpressionElementMapper;
import com.browsersoft.openhre.hl7.api.regular.ExpressionElementMapperItem;
import com.browsersoft.openhre.hl7.impl.config.HL7MessageGroupImpl;
import com.browsersoft.openhre.hl7.impl.config.HL7MessageImpl;
import com.browsersoft.openhre.hl7.impl.config.HL7SegmentMapImpl;
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
  /*Coverage entropy=2.0603304516924217
  */
  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      ExpressionMatrixImpl expressionMatrixImpl0 = new ExpressionMatrixImpl();
      expressionMatrixImpl0.creatMatrix(622);
      ExpressionElementMapperImpl expressionElementMapperImpl0 = new ExpressionElementMapperImpl();
      expressionElementMapperImpl0.toString();
      String string0 = expressionMatrixImpl0.toString();
      expressionMatrixImpl0.addNewNode();
      expressionMatrixImpl0.addNewNode();
      expressionMatrixImpl0.addNewNode();
      expressionMatrixImpl0.addNewNode();
      expressionElementMapperImpl0.removeItem(602);
      expressionMatrixImpl0.setValue(1, 36, 4);
      MessageTracerImpl messageTracerImpl0 = new MessageTracerImpl();
      messageTracerImpl0.getMapper();
      boolean boolean0 = false;
      expressionMatrixImpl0.outNoStandardConnections(false, (ExpressionElementMapper) null);
      expressionMatrixImpl0.toString();
      expressionMatrixImpl0.getNumberOfElements();
      expressionMatrixImpl0.addNewNode();
      int int0 = 4165;
      ExpressionElementMapperImpl expressionElementMapperImpl1 = new ExpressionElementMapperImpl();
      // Undeclared exception!
      try { 
        messageTracerImpl0.processNextSegment(string0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.browsersoft.openhre.hl7.impl.regular.MessageTracerImpl", e);
      }
  }

  /**
  //Test case number: 1
  /*Coverage entropy=2.0679290422036485
  */
  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      ExpressionMatrixImpl expressionMatrixImpl0 = new ExpressionMatrixImpl();
      expressionMatrixImpl0.creatMatrix(655);
      expressionMatrixImpl0.toString();
      expressionMatrixImpl0.addNewNode();
      expressionMatrixImpl0.creatMatrix(655);
      expressionMatrixImpl0.addNewNode();
      expressionMatrixImpl0.addNewNode();
      expressionMatrixImpl0.setValue(0, 1, 0);
      expressionMatrixImpl0.getNumberOfElements();
      MessageTracerImpl messageTracerImpl0 = new MessageTracerImpl();
      messageTracerImpl0.getMapper();
      expressionMatrixImpl0.outNoStandardConnections(false, (ExpressionElementMapper) null);
      expressionMatrixImpl0.addNewNode();
      expressionMatrixImpl0.addNewNode();
      expressionMatrixImpl0.getValue(1850, 0);
      expressionMatrixImpl0.outNoStandardConnections(true, (ExpressionElementMapper) null);
      // Undeclared exception!
      expressionMatrixImpl0.toString();
  }

  /**
  //Test case number: 2
  /*Coverage entropy=2.148963475276542
  */
  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      ExpressionMatrixImpl expressionMatrixImpl0 = new ExpressionMatrixImpl();
      expressionMatrixImpl0.creatMatrix(655);
      expressionMatrixImpl0.toString();
      expressionMatrixImpl0.addNewNode();
      expressionMatrixImpl0.creatMatrix(655);
      expressionMatrixImpl0.getNumberOfNodes();
      expressionMatrixImpl0.addNewNode();
      expressionMatrixImpl0.setValue(1, 0, 0);
      expressionMatrixImpl0.getNumberOfElements();
      MessageTracerImpl messageTracerImpl0 = new MessageTracerImpl();
      messageTracerImpl0.getMapper();
      expressionMatrixImpl0.toString();
      expressionMatrixImpl0.getNumberOfElements();
      expressionMatrixImpl0.addNewNode();
      expressionMatrixImpl0.getValue(1, 0);
      expressionMatrixImpl0.outNoStandardConnections(false, (ExpressionElementMapper) null);
      expressionMatrixImpl0.getValue(2011, 0);
      expressionMatrixImpl0.addNewNode();
      expressionMatrixImpl0.toString();
      expressionMatrixImpl0.getNumberOfNodes();
      // Undeclared exception!
      expressionMatrixImpl0.toString();
  }

  /**
  //Test case number: 3
  /*Coverage entropy=2.2342582936365796
  */
  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      ExpressionMatrixImpl expressionMatrixImpl0 = new ExpressionMatrixImpl();
      expressionMatrixImpl0.creatMatrix(655);
      expressionMatrixImpl0.toString();
      expressionMatrixImpl0.toString();
      expressionMatrixImpl0.creatMatrix(655);
      expressionMatrixImpl0.addNewNode();
      expressionMatrixImpl0.addNewNode();
      expressionMatrixImpl0.addNewNode();
      expressionMatrixImpl0.setValue(0, 2, (-95));
      ExpressionMatrixImpl expressionMatrixImpl1 = new ExpressionMatrixImpl();
      expressionMatrixImpl1.getNumberOfElements();
      MessageTracerImpl messageTracerImpl0 = new MessageTracerImpl();
      messageTracerImpl0.getMapper();
      expressionMatrixImpl0.outNoStandardConnections(true, (ExpressionElementMapper) null);
      expressionMatrixImpl0.getNumberOfElements();
      expressionMatrixImpl0.addNewNode();
      assertEquals(655, expressionMatrixImpl0.getNumberOfElements());
      
      expressionMatrixImpl1.getValue(2, (-1968));
      expressionMatrixImpl1.getValue((-2729), (-1694));
      expressionMatrixImpl1.addNewNode();
      String string0 = expressionMatrixImpl1.toString();
      assertEquals("MATRIX\n-----------------------\n | \n0| \n\nCONNECTIONS\n-----------------------\n", string0);
  }

  /**
  //Test case number: 4
  /*Coverage entropy=2.1620438426613062
  */
  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      ExpressionMatrixImpl expressionMatrixImpl0 = new ExpressionMatrixImpl();
      expressionMatrixImpl0.creatMatrix(655);
      expressionMatrixImpl0.toString();
      expressionMatrixImpl0.addNewNode();
      expressionMatrixImpl0.creatMatrix(655);
      expressionMatrixImpl0.getNumberOfNodes();
      expressionMatrixImpl0.addNewNode();
      ExpressionElementMapperImpl expressionElementMapperImpl0 = new ExpressionElementMapperImpl();
      expressionElementMapperImpl0.removeItem(79);
      expressionMatrixImpl0.setValue(0, 0, 655);
      MessageTracerImpl messageTracerImpl0 = new MessageTracerImpl();
      messageTracerImpl0.getMapper();
      expressionMatrixImpl0.outNoStandardConnections(true, (ExpressionElementMapper) null);
      expressionMatrixImpl0.toString();
      expressionMatrixImpl0.getNumberOfElements();
      expressionMatrixImpl0.addNewNode();
      ExpressionElementMapperImpl expressionElementMapperImpl1 = new ExpressionElementMapperImpl();
      ExpressionElementMapperItemImpl expressionElementMapperItemImpl0 = new ExpressionElementMapperItemImpl();
      expressionElementMapperImpl0.getItem(655);
      expressionElementMapperImpl0.setItem(655, (ExpressionElementMapperItem) null);
      ExpressionElementMapperImpl expressionElementMapperImpl2 = new ExpressionElementMapperImpl();
      expressionElementMapperImpl2.clearAll();
      expressionElementMapperImpl0.getItem(655);
      expressionElementMapperImpl0.setItem(650, (ExpressionElementMapperItem) null);
      expressionMatrixImpl0.getValue(611, 1);
      expressionMatrixImpl0.outNoStandardConnections(true, (ExpressionElementMapper) null);
      expressionMatrixImpl0.getValue(1, (-17));
      expressionMatrixImpl0.getNumberOfNodes();
      assertEquals(655, expressionMatrixImpl0.getNumberOfElements());
  }

  /**
  //Test case number: 5
  /*Coverage entropy=2.076318110153993
  */
  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      ExpressionMatrixImpl expressionMatrixImpl0 = new ExpressionMatrixImpl();
      expressionMatrixImpl0.creatMatrix(622);
      ExpressionElementMapperImpl expressionElementMapperImpl0 = new ExpressionElementMapperImpl();
      expressionElementMapperImpl0.toString();
      expressionMatrixImpl0.outNoStandardConnections(false, expressionElementMapperImpl0);
      expressionMatrixImpl0.toString();
      expressionMatrixImpl0.addNewNode();
      expressionMatrixImpl0.creatMatrix(622);
      expressionMatrixImpl0.addNewNode();
      expressionMatrixImpl0.addNewNode();
      expressionMatrixImpl0.addNewNode();
      expressionElementMapperImpl0.removeItem(602);
      expressionMatrixImpl0.setValue(1, 36, 14);
      MessageTracerImpl messageTracerImpl0 = new MessageTracerImpl();
      messageTracerImpl0.getMapper();
      expressionMatrixImpl0.outNoStandardConnections(true, (ExpressionElementMapper) null);
      expressionMatrixImpl0.toString();
      expressionMatrixImpl0.getNumberOfElements();
      expressionMatrixImpl0.addNewNode();
      ExpressionElementMapperImpl expressionElementMapperImpl1 = new ExpressionElementMapperImpl();
      ExpressionElementMapperItemImpl expressionElementMapperItemImpl0 = new ExpressionElementMapperItemImpl();
      HL7SegmentMapImpl hL7SegmentMapImpl0 = new HL7SegmentMapImpl();
      hL7SegmentMapImpl0.getItem("_U5ws");
      expressionElementMapperItemImpl0.setSegment((HL7Segment) null);
      expressionElementMapperImpl1.setItem(1, expressionElementMapperItemImpl0);
      expressionElementMapperImpl1.clearAll();
      expressionElementMapperImpl1.getItem(3);
      expressionElementMapperImpl0.setItem(622, (ExpressionElementMapperItem) null);
      expressionMatrixImpl0.getValue(4165, 611);
      // Undeclared exception!
      expressionMatrixImpl0.outNoStandardConnections(true, (ExpressionElementMapper) null);
  }

  /**
  //Test case number: 6
  /*Coverage entropy=2.2063573973751107
  */
  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      ExpressionMatrixImpl expressionMatrixImpl0 = new ExpressionMatrixImpl();
      expressionMatrixImpl0.creatMatrix(655);
      expressionMatrixImpl0.toString();
      expressionMatrixImpl0.addNewNode();
      expressionMatrixImpl0.creatMatrix(655);
      expressionMatrixImpl0.addNewNode();
      expressionMatrixImpl0.addNewNode();
      expressionMatrixImpl0.addNewNode();
      expressionMatrixImpl0.setValue(1, 0, 0);
      expressionMatrixImpl0.getNumberOfElements();
      MessageTracerImpl messageTracerImpl0 = new MessageTracerImpl();
      messageTracerImpl0.getMapper();
      expressionMatrixImpl0.outNoStandardConnections(false, (ExpressionElementMapper) null);
      expressionMatrixImpl0.getNumberOfElements();
      expressionMatrixImpl0.addNewNode();
      int int0 = 1850;
      expressionMatrixImpl0.getValue(1850, 0);
      boolean boolean0 = true;
      expressionMatrixImpl0.outNoStandardConnections(true, (ExpressionElementMapper) null);
      boolean boolean1 = true;
      ExpressionElementMapperImpl expressionElementMapperImpl0 = new ExpressionElementMapperImpl();
      boolean boolean2 = false;
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
  //Test case number: 7
  /*Coverage entropy=2.2298269862316715
  */
  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      ExpressionMatrixImpl expressionMatrixImpl0 = new ExpressionMatrixImpl();
      expressionMatrixImpl0.creatMatrix(622);
      ExpressionElementMapperImpl expressionElementMapperImpl0 = new ExpressionElementMapperImpl();
      expressionElementMapperImpl0.toString();
      expressionMatrixImpl0.outNoStandardConnections(false, expressionElementMapperImpl0);
      expressionMatrixImpl0.toString();
      expressionMatrixImpl0.addNewNode();
      expressionMatrixImpl0.creatMatrix(622);
      expressionMatrixImpl0.addNewNode();
      expressionMatrixImpl0.addNewNode();
      expressionMatrixImpl0.addNewNode();
      expressionElementMapperImpl0.removeItem(601);
      expressionMatrixImpl0.setValue(1, 36, 0);
      MessageTracerImpl messageTracerImpl0 = new MessageTracerImpl();
      messageTracerImpl0.getMapper();
      expressionMatrixImpl0.outNoStandardConnections(true, (ExpressionElementMapper) null);
      expressionMatrixImpl0.outNoStandardConnections(false, (ExpressionElementMapper) null);
      expressionMatrixImpl0.getNumberOfElements();
      expressionMatrixImpl0.addNewNode();
      ExpressionElementMapperImpl expressionElementMapperImpl1 = new ExpressionElementMapperImpl();
      expressionElementMapperImpl1.clearAll();
      expressionElementMapperImpl1.toString();
      expressionElementMapperImpl1.getItem(3);
      expressionElementMapperImpl0.setItem(622, (ExpressionElementMapperItem) null);
      expressionMatrixImpl0.getValue(4163, 611);
      expressionMatrixImpl0.outNoStandardConnections(true, (ExpressionElementMapper) null);
      assertEquals(622, expressionMatrixImpl0.getNumberOfElements());
  }

  /**
  //Test case number: 8
  /*Coverage entropy=1.8591570955065924
  */
  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      ExpressionMatrixImpl expressionMatrixImpl0 = new ExpressionMatrixImpl();
      expressionMatrixImpl0.creatMatrix(203);
      int int0 = 1896;
      expressionMatrixImpl0.addNewNode();
      expressionMatrixImpl0.creatMatrix(1896);
      expressionMatrixImpl0.getValue(0, 2950);
      expressionMatrixImpl0.addNewNode();
      int int1 = 1566;
      expressionMatrixImpl0.creatMatrix(1566);
      boolean boolean0 = true;
      MessageTracerImpl messageTracerImpl0 = new MessageTracerImpl();
      messageTracerImpl0.setMatrix(expressionMatrixImpl0);
      // Undeclared exception!
      try { 
        messageTracerImpl0.processNextSegment("p`8>Z|80");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.browsersoft.openhre.hl7.impl.regular.MessageTracerImpl", e);
      }
  }

  /**
  //Test case number: 9
  /*Coverage entropy=1.946400808581426
  */
  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      ExpressionMatrixImpl expressionMatrixImpl0 = new ExpressionMatrixImpl();
      expressionMatrixImpl0.addNewNode();
      expressionMatrixImpl0.creatMatrix(1896);
      expressionMatrixImpl0.getValue(0, (-2807));
      expressionMatrixImpl0.addNewNode();
      expressionMatrixImpl0.creatMatrix(1566);
      expressionMatrixImpl0.setValue(1, 1896, 3152);
      expressionMatrixImpl0.addNewNode();
      expressionMatrixImpl0.creatMatrix(1566);
      expressionMatrixImpl0.creatMatrix(32768);
      // Undeclared exception!
      expressionMatrixImpl0.addNewNode();
  }

  /**
  //Test case number: 10
  /*Coverage entropy=2.185461840587553
  */
  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      ExpressionMatrixImpl expressionMatrixImpl0 = new ExpressionMatrixImpl();
      expressionMatrixImpl0.creatMatrix(800);
      expressionMatrixImpl0.toString();
      expressionMatrixImpl0.creatMatrix(10);
      ExpressionElementMapperImpl expressionElementMapperImpl0 = new ExpressionElementMapperImpl();
      expressionMatrixImpl0.outNoStandardConnections(false, expressionElementMapperImpl0);
      ExpressionElementMapperItemImpl expressionElementMapperItemImpl0 = new ExpressionElementMapperItemImpl();
      expressionElementMapperItemImpl0.setType(0);
      expressionElementMapperImpl0.removeItem((-200));
      expressionElementMapperItemImpl0.toString();
      expressionElementMapperItemImpl0.getSegment();
      expressionElementMapperItemImpl0.setSegment((HL7Segment) null);
      expressionElementMapperItemImpl0.toString();
      expressionElementMapperImpl0.addItem(expressionElementMapperItemImpl0);
      boolean boolean0 = true;
      expressionMatrixImpl0.outNoStandardConnections(true, expressionElementMapperImpl0);
      expressionMatrixImpl0.addNewNode();
      expressionMatrixImpl0.getNumberOfElements();
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
  /*Coverage entropy=2.1063151376806677
  */
  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      ExpressionMatrixImpl expressionMatrixImpl0 = new ExpressionMatrixImpl();
      expressionMatrixImpl0.creatMatrix((-1103));
      expressionMatrixImpl0.toString();
      expressionMatrixImpl0.creatMatrix(1370);
      ExpressionElementMapperImpl expressionElementMapperImpl0 = new ExpressionElementMapperImpl();
      ExpressionElementMapperImpl expressionElementMapperImpl1 = new ExpressionElementMapperImpl();
      expressionMatrixImpl0.outNoStandardConnections(false, expressionElementMapperImpl1);
      ExpressionElementMapperItemImpl expressionElementMapperItemImpl0 = new ExpressionElementMapperItemImpl();
      ExpressionElementMapperItemImpl expressionElementMapperItemImpl1 = new ExpressionElementMapperItemImpl();
      expressionElementMapperItemImpl1.setType(622);
      expressionElementMapperImpl0.removeItem(0);
      expressionElementMapperItemImpl1.getSegment();
      expressionElementMapperItemImpl0.setSegment((HL7Segment) null);
      expressionElementMapperItemImpl1.toString();
      expressionElementMapperImpl1.addItem(expressionElementMapperItemImpl1);
      boolean boolean0 = true;
      expressionMatrixImpl0.outNoStandardConnections(false, expressionElementMapperImpl1);
      expressionMatrixImpl0.addNewNode();
      expressionMatrixImpl0.getNumberOfElements();
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
  //Test case number: 12
  /*Coverage entropy=2.093308880176036
  */
  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      ExpressionMatrixImpl expressionMatrixImpl0 = new ExpressionMatrixImpl();
      expressionMatrixImpl0.addNewNode();
      expressionMatrixImpl0.creatMatrix(1);
      expressionMatrixImpl0.getValue((-1232), (-1959));
      ExpressionMatrixImpl expressionMatrixImpl1 = new ExpressionMatrixImpl();
      expressionMatrixImpl0.addNewNode();
      expressionMatrixImpl0.creatMatrix(1);
      expressionMatrixImpl1.addNewNode();
      ExpressionMatrixImpl expressionMatrixImpl2 = new ExpressionMatrixImpl();
      expressionMatrixImpl2.addNewNode();
      expressionMatrixImpl0.creatMatrix(580);
      expressionMatrixImpl0.setValue((-1959), 580, 600);
      assertEquals(580, expressionMatrixImpl0.getNumberOfElements());
      
      expressionMatrixImpl2.getNumberOfElements();
      expressionMatrixImpl1.setValue(0, (-1881), 417);
      int int0 = expressionMatrixImpl1.getNumberOfElements();
      assertEquals(0, int0);
  }

  /**
  //Test case number: 13
  /*Coverage entropy=1.9557135998277697
  */
  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      ExpressionMatrixImpl expressionMatrixImpl0 = new ExpressionMatrixImpl();
      expressionMatrixImpl0.addNewNode();
      expressionMatrixImpl0.creatMatrix((-1960));
      expressionMatrixImpl0.setValue(340, 0, 340);
      MessageTracerImpl messageTracerImpl0 = new MessageTracerImpl();
      ExpressionElementMapperImpl expressionElementMapperImpl0 = new ExpressionElementMapperImpl();
      expressionElementMapperImpl0.removeItem(377);
      ExpressionElementMapperItemImpl expressionElementMapperItemImpl0 = new ExpressionElementMapperItemImpl();
      expressionElementMapperItemImpl0.toString();
      expressionElementMapperImpl0.addItem(expressionElementMapperItemImpl0);
      messageTracerImpl0.getMapper();
      boolean boolean0 = false;
      expressionMatrixImpl0.outNoStandardConnections(false, (ExpressionElementMapper) null);
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
  //Test case number: 14
  /*Coverage entropy=1.0365141682948127
  */
  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      HL7MessageGroupImpl hL7MessageGroupImpl0 = new HL7MessageGroupImpl();
      HL7MessageGroupImpl hL7MessageGroupImpl1 = new HL7MessageGroupImpl();
      hL7MessageGroupImpl0.setItem(0, hL7MessageGroupImpl1);
      MessageTracerImpl messageTracerImpl0 = new MessageTracerImpl();
      HL7MessageGroupImpl hL7MessageGroupImpl2 = new HL7MessageGroupImpl();
      HL7MessageGroupImpl hL7MessageGroupImpl3 = new HL7MessageGroupImpl();
      HL7MessageGroupImpl hL7MessageGroupImpl4 = new HL7MessageGroupImpl();
      HL7MessageImpl hL7MessageImpl0 = new HL7MessageImpl();
      HL7MessageImpl hL7MessageImpl1 = new HL7MessageImpl();
      hL7MessageImpl1.getGroup();
      hL7MessageImpl0.setGroup((HL7MessageGroup) null);
      hL7MessageImpl0.getGroup();
      hL7MessageGroupImpl3.addItem((HL7MessageGroupItem) null);
      HL7MessageGroupImpl hL7MessageGroupImpl5 = new HL7MessageGroupImpl();
      HL7MessageGroupImpl hL7MessageGroupImpl6 = new HL7MessageGroupImpl();
      HL7MessageGroupImpl hL7MessageGroupImpl7 = new HL7MessageGroupImpl();
      HL7MessageGroupImpl hL7MessageGroupImpl8 = new HL7MessageGroupImpl();
      hL7MessageGroupImpl2.clearAll();
      MessageTracerImpl messageTracerImpl1 = new MessageTracerImpl();
      MessageTracerImpl messageTracerImpl2 = new MessageTracerImpl();
      ExpressionMatrixImpl expressionMatrixImpl0 = new ExpressionMatrixImpl();
      int int0 = expressionMatrixImpl0.getValue(0, 0);
      assertEquals((-1), int0);
  }

  /**
  //Test case number: 15
  /*Coverage entropy=1.9325606816056717
  */
  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      ExpressionMatrixImpl expressionMatrixImpl0 = new ExpressionMatrixImpl();
      int int0 = 1896;
      expressionMatrixImpl0.addNewNode();
      expressionMatrixImpl0.creatMatrix(1896);
      expressionMatrixImpl0.getValue(0, (-2807));
      expressionMatrixImpl0.addNewNode();
      int int1 = 1566;
      expressionMatrixImpl0.creatMatrix(1566);
      expressionMatrixImpl0.setValue(1, 1896, (-2807));
      expressionMatrixImpl0.addNewNode();
      expressionMatrixImpl0.creatMatrix(1566);
      expressionMatrixImpl0.creatMatrix(32768);
      expressionMatrixImpl0.creatMatrix(1771);
      expressionMatrixImpl0.getNumberOfElements();
      int int2 = 969;
      // Undeclared exception!
      expressionMatrixImpl0.toString();
  }

  /**
  //Test case number: 16
  /*Coverage entropy=1.940295019722262
  */
  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      ExpressionMatrixImpl expressionMatrixImpl0 = new ExpressionMatrixImpl();
      expressionMatrixImpl0.creatMatrix(655);
      expressionMatrixImpl0.toString();
      expressionMatrixImpl0.addNewNode();
      expressionMatrixImpl0.getNumberOfNodes();
      expressionMatrixImpl0.addNewNode();
      expressionMatrixImpl0.setValue(1, 0, 0);
      expressionMatrixImpl0.getNumberOfElements();
      expressionMatrixImpl0.toString();
      expressionMatrixImpl0.getNumberOfElements();
      expressionMatrixImpl0.addNewNode();
      expressionMatrixImpl0.getValue((-1968), 0);
      expressionMatrixImpl0.addNewNode();
      expressionMatrixImpl0.getValue((-2957), 282);
      assertEquals(655, expressionMatrixImpl0.getNumberOfElements());
  }

  /**
  //Test case number: 17
  /*Coverage entropy=2.1244933328771762
  */
  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      ExpressionMatrixImpl expressionMatrixImpl0 = new ExpressionMatrixImpl();
      expressionMatrixImpl0.addNewNode();
      expressionMatrixImpl0.creatMatrix(80);
      expressionMatrixImpl0.getValue(0, 80);
      ExpressionMatrixImpl expressionMatrixImpl1 = new ExpressionMatrixImpl();
      expressionMatrixImpl1.addNewNode();
      expressionMatrixImpl1.creatMatrix(80);
      expressionMatrixImpl1.addNewNode();
      ExpressionMatrixImpl expressionMatrixImpl2 = new ExpressionMatrixImpl();
      expressionMatrixImpl2.addNewNode();
      expressionMatrixImpl1.setValue(913, 2398, 65);
      expressionMatrixImpl0.getNumberOfElements();
      expressionMatrixImpl0.setValue(65, 1, 0);
      int int0 = expressionMatrixImpl0.getNumberOfElements();
      assertEquals(80, int0);
  }

  /**
  //Test case number: 18
  /*Coverage entropy=2.076318102674949
  */
  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      ExpressionMatrixImpl expressionMatrixImpl0 = new ExpressionMatrixImpl();
      expressionMatrixImpl0.creatMatrix(622);
      ExpressionElementMapperImpl expressionElementMapperImpl0 = new ExpressionElementMapperImpl();
      expressionElementMapperImpl0.toString();
      expressionMatrixImpl0.addNewNode();
      expressionMatrixImpl0.addNewNode();
      expressionMatrixImpl0.addNewNode();
      expressionMatrixImpl0.addNewNode();
      expressionElementMapperImpl0.removeItem(602);
      expressionMatrixImpl0.setValue(1, 36, 0);
      MessageTracerImpl messageTracerImpl0 = new MessageTracerImpl();
      ExpressionElementMapperItemImpl expressionElementMapperItemImpl0 = new ExpressionElementMapperItemImpl();
      expressionElementMapperImpl0.addItem(expressionElementMapperItemImpl0);
      messageTracerImpl0.getMapper();
      expressionMatrixImpl0.outNoStandardConnections(true, (ExpressionElementMapper) null);
      expressionMatrixImpl0.toString();
      expressionMatrixImpl0.getNumberOfElements();
      expressionMatrixImpl0.addNewNode();
      ExpressionElementMapperImpl expressionElementMapperImpl1 = new ExpressionElementMapperImpl();
      ExpressionElementMapperItemImpl expressionElementMapperItemImpl1 = new ExpressionElementMapperItemImpl();
      HL7SegmentMapImpl hL7SegmentMapImpl0 = new HL7SegmentMapImpl();
      hL7SegmentMapImpl0.getItem("_U5ws");
      expressionElementMapperItemImpl1.setSegment((HL7Segment) null);
      expressionElementMapperImpl1.setItem(4, expressionElementMapperItemImpl1);
      expressionElementMapperImpl1.clearAll();
      expressionElementMapperImpl1.getItem(3);
      expressionElementMapperImpl0.setItem(622, (ExpressionElementMapperItem) null);
      expressionMatrixImpl0.getValue(4165, 611);
      expressionMatrixImpl0.getValue(2376, 602);
      // Undeclared exception!
      expressionMatrixImpl0.outNoStandardConnections(true, (ExpressionElementMapper) null);
  }

  /**
  //Test case number: 19
  /*Coverage entropy=1.5985513502159465
  */
  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      HL7MessageGroupImpl hL7MessageGroupImpl0 = new HL7MessageGroupImpl();
      HL7MessageGroupImpl hL7MessageGroupImpl1 = new HL7MessageGroupImpl();
      hL7MessageGroupImpl1.clearAll();
      HL7MessageGroupImpl hL7MessageGroupImpl2 = new HL7MessageGroupImpl();
      hL7MessageGroupImpl1.setItem(18, hL7MessageGroupImpl2);
      HL7MessageGroupImpl hL7MessageGroupImpl3 = new HL7MessageGroupImpl();
      HL7MessageGroupImpl hL7MessageGroupImpl4 = new HL7MessageGroupImpl();
      HL7MessageGroupImpl hL7MessageGroupImpl5 = new HL7MessageGroupImpl();
      HL7MessageGroupImpl hL7MessageGroupImpl6 = new HL7MessageGroupImpl();
      HL7MessageGroupImpl hL7MessageGroupImpl7 = new HL7MessageGroupImpl();
      HL7MessageGroupImpl hL7MessageGroupImpl8 = new HL7MessageGroupImpl();
      HL7MessageGroupImpl hL7MessageGroupImpl9 = new HL7MessageGroupImpl();
      HL7MessageGroupImpl hL7MessageGroupImpl10 = new HL7MessageGroupImpl();
      HL7MessageGroupImpl hL7MessageGroupImpl11 = new HL7MessageGroupImpl();
      HL7MessageGroupImpl hL7MessageGroupImpl12 = new HL7MessageGroupImpl();
      HL7MessageGroupImpl hL7MessageGroupImpl13 = new HL7MessageGroupImpl();
      hL7MessageGroupImpl10.addItem(hL7MessageGroupImpl7);
      ExpressionMatrixImpl expressionMatrixImpl0 = new ExpressionMatrixImpl();
      expressionMatrixImpl0.addNewNode();
      expressionMatrixImpl0.creatMatrix(1024);
      expressionMatrixImpl0.toString();
      expressionMatrixImpl0.getNumberOfElements();
      expressionMatrixImpl0.toString();
      assertEquals(1024, expressionMatrixImpl0.getNumberOfElements());
  }

  /**
  //Test case number: 20
  /*Coverage entropy=2.0763181051684616
  */
  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      ExpressionMatrixImpl expressionMatrixImpl0 = new ExpressionMatrixImpl();
      expressionMatrixImpl0.creatMatrix(622);
      ExpressionElementMapperImpl expressionElementMapperImpl0 = new ExpressionElementMapperImpl();
      expressionElementMapperImpl0.toString();
      expressionMatrixImpl0.toString();
      expressionMatrixImpl0.addNewNode();
      expressionMatrixImpl0.addNewNode();
      expressionMatrixImpl0.addNewNode();
      expressionMatrixImpl0.addNewNode();
      expressionElementMapperImpl0.removeItem(602);
      expressionMatrixImpl0.setValue(1, 36, 0);
      MessageTracerImpl messageTracerImpl0 = new MessageTracerImpl();
      ExpressionElementMapperItemImpl expressionElementMapperItemImpl0 = new ExpressionElementMapperItemImpl();
      expressionElementMapperImpl0.addItem(expressionElementMapperItemImpl0);
      messageTracerImpl0.getMapper();
      expressionMatrixImpl0.outNoStandardConnections(true, (ExpressionElementMapper) null);
      expressionMatrixImpl0.toString();
      expressionMatrixImpl0.getNumberOfElements();
      expressionMatrixImpl0.addNewNode();
      ExpressionElementMapperImpl expressionElementMapperImpl1 = new ExpressionElementMapperImpl();
      ExpressionElementMapperItemImpl expressionElementMapperItemImpl1 = new ExpressionElementMapperItemImpl();
      HL7SegmentMapImpl hL7SegmentMapImpl0 = new HL7SegmentMapImpl();
      hL7SegmentMapImpl0.getItem("_U5ws");
      expressionElementMapperItemImpl1.setSegment((HL7Segment) null);
      expressionElementMapperImpl1.setItem(4, expressionElementMapperItemImpl1);
      expressionElementMapperImpl1.clearAll();
      expressionElementMapperImpl1.getItem(3);
      expressionElementMapperImpl0.setItem(622, (ExpressionElementMapperItem) null);
      expressionMatrixImpl0.getValue(4165, 611);
      expressionMatrixImpl0.getValue(2376, 602);
      // Undeclared exception!
      expressionMatrixImpl0.outNoStandardConnections(true, (ExpressionElementMapper) null);
  }

  /**
  //Test case number: 21
  /*Coverage entropy=2.114112408635833
  */
  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      ExpressionMatrixImpl expressionMatrixImpl0 = new ExpressionMatrixImpl();
      expressionMatrixImpl0.addNewNode();
      expressionMatrixImpl0.creatMatrix(1896);
      expressionMatrixImpl0.getValue(0, (-2807));
      expressionMatrixImpl0.addNewNode();
      expressionMatrixImpl0.creatMatrix(1566);
      MessageTracerImpl messageTracerImpl0 = new MessageTracerImpl();
      expressionMatrixImpl0.addNewNode();
      ExpressionMatrixImpl expressionMatrixImpl1 = new ExpressionMatrixImpl();
      expressionMatrixImpl1.addNewNode();
      expressionMatrixImpl0.setValue(0, 1047, 359);
      assertEquals(1566, expressionMatrixImpl0.getNumberOfElements());
      
      expressionMatrixImpl1.getNumberOfElements();
      expressionMatrixImpl1.setValue(0, 1987, 1);
      int int0 = expressionMatrixImpl1.getNumberOfElements();
      assertEquals(0, int0);
  }

  /**
  //Test case number: 22
  /*Coverage entropy=1.786724494755577
  */
  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      int int0 = 0;
      int int1 = 0;
      ExpressionMatrixImpl expressionMatrixImpl0 = new ExpressionMatrixImpl();
      int int2 = 2862;
      expressionMatrixImpl0.getValue(2862, 0);
      ExpressionMatrixImpl expressionMatrixImpl1 = new ExpressionMatrixImpl();
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
  //Test case number: 23
  /*Coverage entropy=1.6969987794394548
  */
  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      HL7MessageGroupImpl hL7MessageGroupImpl0 = new HL7MessageGroupImpl();
      HL7MessageGroupImpl hL7MessageGroupImpl1 = new HL7MessageGroupImpl();
      HL7MessageGroupImpl hL7MessageGroupImpl2 = new HL7MessageGroupImpl();
      hL7MessageGroupImpl2.clearAll();
      HL7MessageGroupImpl hL7MessageGroupImpl3 = new HL7MessageGroupImpl();
      hL7MessageGroupImpl0.setItem(610, hL7MessageGroupImpl1);
      HL7MessageGroupImpl hL7MessageGroupImpl4 = new HL7MessageGroupImpl();
      HL7MessageGroupImpl hL7MessageGroupImpl5 = new HL7MessageGroupImpl();
      HL7MessageGroupImpl hL7MessageGroupImpl6 = new HL7MessageGroupImpl();
      HL7MessageGroupImpl hL7MessageGroupImpl7 = new HL7MessageGroupImpl();
      HL7MessageGroupImpl hL7MessageGroupImpl8 = new HL7MessageGroupImpl();
      HL7MessageGroupImpl hL7MessageGroupImpl9 = new HL7MessageGroupImpl();
      HL7MessageGroupImpl hL7MessageGroupImpl10 = new HL7MessageGroupImpl();
      HL7MessageGroupImpl hL7MessageGroupImpl11 = new HL7MessageGroupImpl();
      HL7MessageGroupImpl hL7MessageGroupImpl12 = new HL7MessageGroupImpl();
      HL7MessageGroupImpl hL7MessageGroupImpl13 = new HL7MessageGroupImpl();
      HL7MessageGroupImpl hL7MessageGroupImpl14 = new HL7MessageGroupImpl();
      HL7MessageGroupImpl hL7MessageGroupImpl15 = new HL7MessageGroupImpl();
      hL7MessageGroupImpl15.setItem(0, hL7MessageGroupImpl10);
      hL7MessageGroupImpl15.getItem(67);
      hL7MessageGroupImpl14.addItem(hL7MessageGroupImpl1);
      ExpressionMatrixImpl expressionMatrixImpl0 = new ExpressionMatrixImpl();
      expressionMatrixImpl0.creatMatrix((-601));
      expressionMatrixImpl0.toString();
      expressionMatrixImpl0.getNumberOfElements();
      expressionMatrixImpl0.toString();
      assertEquals((-601), expressionMatrixImpl0.getNumberOfElements());
  }

  /**
  //Test case number: 24
  /*Coverage entropy=1.0650855968662414
  */
  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      HL7MessageGroupImpl hL7MessageGroupImpl0 = new HL7MessageGroupImpl();
      HL7MessageGroupImpl hL7MessageGroupImpl1 = new HL7MessageGroupImpl();
      hL7MessageGroupImpl1.clearAll();
      HL7MessageGroupImpl hL7MessageGroupImpl2 = new HL7MessageGroupImpl();
      hL7MessageGroupImpl1.setItem(18, hL7MessageGroupImpl2);
      HL7MessageGroupImpl hL7MessageGroupImpl3 = new HL7MessageGroupImpl();
      HL7MessageGroupImpl hL7MessageGroupImpl4 = new HL7MessageGroupImpl();
      HL7MessageGroupImpl hL7MessageGroupImpl5 = new HL7MessageGroupImpl();
      HL7MessageGroupImpl hL7MessageGroupImpl6 = new HL7MessageGroupImpl();
      HL7MessageGroupImpl hL7MessageGroupImpl7 = new HL7MessageGroupImpl();
      HL7MessageGroupImpl hL7MessageGroupImpl8 = new HL7MessageGroupImpl();
      HL7MessageGroupImpl hL7MessageGroupImpl9 = new HL7MessageGroupImpl();
      HL7MessageImpl hL7MessageImpl0 = new HL7MessageImpl();
      hL7MessageImpl0.getGroup();
      hL7MessageGroupImpl3.addItem(hL7MessageGroupImpl0);
      ExpressionMatrixImpl expressionMatrixImpl0 = new ExpressionMatrixImpl();
      expressionMatrixImpl0.setValue(7281, 279, 624);
      expressionMatrixImpl0.setValue(0, 32, 18);
      assertEquals(0, expressionMatrixImpl0.getNumberOfElements());
  }

  /**
  //Test case number: 25
  /*Coverage entropy=1.0931471805599453
  */
  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      HL7MessageGroupImpl hL7MessageGroupImpl0 = new HL7MessageGroupImpl();
      HL7MessageGroupImpl hL7MessageGroupImpl1 = new HL7MessageGroupImpl();
      HL7MessageGroupImpl hL7MessageGroupImpl2 = new HL7MessageGroupImpl();
      hL7MessageGroupImpl2.clearAll();
      HL7MessageGroupImpl hL7MessageGroupImpl3 = new HL7MessageGroupImpl();
      HL7MessageGroupImpl hL7MessageGroupImpl4 = new HL7MessageGroupImpl();
      hL7MessageGroupImpl1.setItem(92, hL7MessageGroupImpl4);
      HL7MessageGroupImpl hL7MessageGroupImpl5 = new HL7MessageGroupImpl();
      HL7MessageGroupImpl hL7MessageGroupImpl6 = new HL7MessageGroupImpl();
      HL7MessageGroupImpl hL7MessageGroupImpl7 = new HL7MessageGroupImpl();
      HL7MessageGroupImpl hL7MessageGroupImpl8 = new HL7MessageGroupImpl();
      HL7MessageGroupImpl hL7MessageGroupImpl9 = new HL7MessageGroupImpl();
      HL7MessageGroupImpl hL7MessageGroupImpl10 = new HL7MessageGroupImpl();
      HL7MessageImpl hL7MessageImpl0 = new HL7MessageImpl();
      hL7MessageImpl0.getGroup();
      HL7MessageGroupImpl hL7MessageGroupImpl11 = new HL7MessageGroupImpl();
      HL7MessageGroupImpl hL7MessageGroupImpl12 = new HL7MessageGroupImpl();
      hL7MessageGroupImpl12.addItem(hL7MessageGroupImpl11);
      HL7MessageGroupImpl hL7MessageGroupImpl13 = new HL7MessageGroupImpl();
      hL7MessageGroupImpl12.clearAll();
      HL7MessageGroupImpl hL7MessageGroupImpl14 = new HL7MessageGroupImpl();
      HL7MessageGroupImpl hL7MessageGroupImpl15 = new HL7MessageGroupImpl();
      HL7MessageGroupImpl hL7MessageGroupImpl16 = new HL7MessageGroupImpl();
      hL7MessageGroupImpl4.setAdditional("p!l(_Q1j|;S~o91");
      ExpressionMatrixImpl expressionMatrixImpl0 = new ExpressionMatrixImpl();
      int int0 = expressionMatrixImpl0.getNumberOfNodes();
      assertEquals(0, int0);
  }
}
