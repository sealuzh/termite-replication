/*
 * This file was automatically generated by EvoSuite
 * Wed Dec 04 04:59:23 GMT 2019
 */

package com.browsersoft.openhre.hl7.impl.regular;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.browsersoft.openhre.hl7.api.parse.HL7Checker;
import com.browsersoft.openhre.hl7.api.regular.ExpressionElementMapper;
import com.browsersoft.openhre.hl7.api.regular.MessageTracerHandler;
import com.browsersoft.openhre.hl7.impl.config.HL7MessageGroupImpl;
import com.browsersoft.openhre.hl7.impl.config.HL7MessageSegmentImpl;
import com.browsersoft.openhre.hl7.impl.parser.HL72XMLImpl;
import com.browsersoft.openhre.hl7.impl.parser.HL7CheckerImpl;
import com.browsersoft.openhre.hl7.impl.regular.ExpressionElementMapperImpl;
import com.browsersoft.openhre.hl7.impl.regular.ExpressionElementMapperItemImpl;
import com.browsersoft.openhre.hl7.impl.regular.ExpressionImpl;
import com.browsersoft.openhre.hl7.impl.regular.ExpressionMatrixImpl;
import com.browsersoft.openhre.hl7.impl.regular.MessageTracerImpl;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class ExpressionMatrixImpl_ESTest extends ExpressionMatrixImpl_ESTest_scaffolding {

  /**
  //Test case number: 0
  /*Coverage entropy=2.1032191624484695
  */
  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      ExpressionMatrixImpl expressionMatrixImpl0 = new ExpressionMatrixImpl();
      ExpressionImpl expressionImpl0 = new ExpressionImpl();
      expressionMatrixImpl0.creatMatrix(232);
      expressionMatrixImpl0.getNumberOfElements();
      expressionMatrixImpl0.addNewNode();
      expressionMatrixImpl0.setValue(0, 0, 0);
      expressionMatrixImpl0.getValue(0, (-1162));
      MessageTracerImpl messageTracerImpl0 = new MessageTracerImpl();
      HL72XMLImpl hL72XMLImpl0 = new HL72XMLImpl();
      HL7Checker hL7Checker0 = hL72XMLImpl0.getChecker();
      expressionMatrixImpl0.creatMatrix(32768);
      messageTracerImpl0.setHandler(hL7Checker0);
      HL7MessageSegmentImpl hL7MessageSegmentImpl0 = new HL7MessageSegmentImpl();
      // Undeclared exception!
      expressionMatrixImpl0.addNewNode();
  }

  /**
  //Test case number: 1
  /*Coverage entropy=1.8603683515883893
  */
  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      ExpressionMatrixImpl expressionMatrixImpl0 = new ExpressionMatrixImpl();
      ExpressionImpl expressionImpl0 = new ExpressionImpl();
      expressionImpl0.removeItem((-1));
      HL7CheckerImpl hL7CheckerImpl0 = new HL7CheckerImpl();
      MessageTracerImpl messageTracerImpl0 = new MessageTracerImpl();
      messageTracerImpl0.setHandler(hL7CheckerImpl0);
      HL7MessageSegmentImpl hL7MessageSegmentImpl0 = new HL7MessageSegmentImpl();
      HL7MessageSegmentImpl hL7MessageSegmentImpl1 = new HL7MessageSegmentImpl();
      hL7MessageSegmentImpl1.toString();
      expressionImpl0.readFromStringForDebug("qe8@YN<~TptceG");
      expressionMatrixImpl0.creatMatrix(238);
      messageTracerImpl0.doBeginItem(expressionImpl0, hL7MessageSegmentImpl1);
      messageTracerImpl0.reset();
      expressionMatrixImpl0.toString();
      expressionMatrixImpl0.getNumberOfElements();
      expressionMatrixImpl0.addNewNode();
      expressionMatrixImpl0.setValue(0, 193, 238);
      expressionMatrixImpl0.toString();
      assertEquals(238, expressionMatrixImpl0.getNumberOfElements());
      
      ExpressionMatrixImpl expressionMatrixImpl1 = new ExpressionMatrixImpl();
      ExpressionMatrixImpl expressionMatrixImpl2 = new ExpressionMatrixImpl();
      expressionMatrixImpl1.toString();
      expressionMatrixImpl1.getValue(238, (-1));
      int int0 = expressionMatrixImpl1.getValue((-1), 176);
      assertEquals((-1), int0);
  }

  /**
  //Test case number: 2
  /*Coverage entropy=2.067780815843336
  */
  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      ExpressionMatrixImpl expressionMatrixImpl0 = new ExpressionMatrixImpl();
      ExpressionImpl expressionImpl0 = new ExpressionImpl();
      expressionImpl0.removeItem((-1));
      HL7CheckerImpl hL7CheckerImpl0 = new HL7CheckerImpl();
      MessageTracerImpl messageTracerImpl0 = new MessageTracerImpl();
      messageTracerImpl0.setHandler(hL7CheckerImpl0);
      HL7MessageSegmentImpl hL7MessageSegmentImpl0 = new HL7MessageSegmentImpl();
      HL7MessageSegmentImpl hL7MessageSegmentImpl1 = new HL7MessageSegmentImpl();
      hL7MessageSegmentImpl1.toString();
      expressionImpl0.readFromStringForDebug("qe8@YN<~TptceG");
      expressionMatrixImpl0.creatMatrix(238);
      messageTracerImpl0.doBeginItem(expressionImpl0, hL7MessageSegmentImpl1);
      messageTracerImpl0.reset();
      messageTracerImpl0.getMapper();
      expressionMatrixImpl0.toString();
      expressionMatrixImpl0.getNumberOfElements();
      expressionMatrixImpl0.addNewNode();
      expressionMatrixImpl0.setValue(0, 193, 238);
      expressionMatrixImpl0.outNoStandardConnections(false, (ExpressionElementMapper) null);
      expressionMatrixImpl0.toString();
      expressionMatrixImpl0.outNoStandardConnections(true, (ExpressionElementMapper) null);
      ExpressionMatrixImpl expressionMatrixImpl1 = new ExpressionMatrixImpl();
      expressionMatrixImpl1.outNoStandardConnections(true, (ExpressionElementMapper) null);
      expressionMatrixImpl0.toString();
      assertEquals(238, expressionMatrixImpl0.getNumberOfElements());
      
      int int0 = expressionMatrixImpl1.getValue((-2104), 228);
      assertEquals((-1), int0);
  }

  /**
  //Test case number: 3
  /*Coverage entropy=2.278652206252129
  */
  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      ExpressionMatrixImpl expressionMatrixImpl0 = new ExpressionMatrixImpl();
      expressionMatrixImpl0.addNewNode();
      ExpressionElementMapperImpl expressionElementMapperImpl0 = new ExpressionElementMapperImpl();
      expressionMatrixImpl0.outNoStandardConnections(false, expressionElementMapperImpl0);
      ExpressionElementMapperImpl expressionElementMapperImpl1 = new ExpressionElementMapperImpl();
      ExpressionElementMapperItemImpl expressionElementMapperItemImpl0 = new ExpressionElementMapperItemImpl();
      expressionElementMapperImpl0.setItem(333, expressionElementMapperItemImpl0);
      expressionElementMapperItemImpl0.setID("");
      expressionElementMapperItemImpl0.setType(2574);
      ExpressionElementMapperItemImpl expressionElementMapperItemImpl1 = new ExpressionElementMapperItemImpl();
      expressionElementMapperItemImpl1.toString();
      expressionElementMapperItemImpl1.setType(65);
      expressionElementMapperImpl0.addItem(expressionElementMapperItemImpl0);
      expressionMatrixImpl0.outNoStandardConnections(true, expressionElementMapperImpl1);
      expressionMatrixImpl0.outNoStandardConnections(false, expressionElementMapperImpl1);
      expressionMatrixImpl0.setValue((-388), 535, 1488);
      expressionMatrixImpl0.getValue(1488, (-1));
      expressionMatrixImpl0.getNumberOfElements();
      expressionMatrixImpl0.creatMatrix((-1));
      expressionMatrixImpl0.getValue(36, 0);
      expressionMatrixImpl0.getValue((-1), 36);
      expressionMatrixImpl0.outNoStandardConnections(false, expressionElementMapperImpl1);
      assertEquals((-1), expressionMatrixImpl0.getNumberOfElements());
  }

  /**
  //Test case number: 4
  /*Coverage entropy=2.252136258832453
  */
  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      ExpressionMatrixImpl expressionMatrixImpl0 = new ExpressionMatrixImpl();
      ExpressionImpl expressionImpl0 = new ExpressionImpl();
      expressionImpl0.removeItem((-1));
      HL7CheckerImpl hL7CheckerImpl0 = new HL7CheckerImpl();
      MessageTracerImpl messageTracerImpl0 = new MessageTracerImpl();
      messageTracerImpl0.setHandler(hL7CheckerImpl0);
      HL7MessageSegmentImpl hL7MessageSegmentImpl0 = new HL7MessageSegmentImpl();
      HL7MessageSegmentImpl hL7MessageSegmentImpl1 = new HL7MessageSegmentImpl();
      hL7MessageSegmentImpl1.toString();
      expressionImpl0.readFromStringForDebug("qe8@YN<~TptceG");
      expressionMatrixImpl0.creatMatrix(238);
      messageTracerImpl0.doBeginItem(expressionImpl0, hL7MessageSegmentImpl1);
      messageTracerImpl0.reset();
      messageTracerImpl0.getMapper();
      expressionMatrixImpl0.toString();
      expressionMatrixImpl0.getNumberOfElements();
      expressionMatrixImpl0.addNewNode();
      expressionMatrixImpl0.setValue(0, 193, 238);
      expressionMatrixImpl0.getValue(193, 238);
      MessageTracerImpl messageTracerImpl1 = new MessageTracerImpl();
      messageTracerImpl0.getMapper();
      expressionMatrixImpl0.outNoStandardConnections(false, (ExpressionElementMapper) null);
      ExpressionElementMapperImpl expressionElementMapperImpl0 = new ExpressionElementMapperImpl();
      messageTracerImpl0.getMapper();
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
  //Test case number: 5
  /*Coverage entropy=1.860372491205247
  */
  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      ExpressionMatrixImpl expressionMatrixImpl0 = new ExpressionMatrixImpl();
      ExpressionImpl expressionImpl0 = new ExpressionImpl();
      HL7CheckerImpl hL7CheckerImpl0 = new HL7CheckerImpl();
      HL7MessageSegmentImpl hL7MessageSegmentImpl0 = new HL7MessageSegmentImpl();
      expressionMatrixImpl0.toString();
      hL7MessageSegmentImpl0.setRepeatable(false);
      expressionMatrixImpl0.creatMatrix(238);
      expressionMatrixImpl0.toString();
      expressionMatrixImpl0.getNumberOfElements();
      expressionMatrixImpl0.addNewNode();
      expressionMatrixImpl0.setValue(0, 0, 0);
      expressionMatrixImpl0.setValue(0, 0, 0);
      expressionMatrixImpl0.getValue(0, 0);
      expressionMatrixImpl0.getNumberOfElements();
      expressionMatrixImpl0.creatMatrix(238);
      expressionMatrixImpl0.getValue(56, (-45));
      expressionMatrixImpl0.toString();
      expressionMatrixImpl0.getValue(0, 3818);
      ExpressionMatrixImpl expressionMatrixImpl1 = new ExpressionMatrixImpl();
      int int0 = expressionMatrixImpl0.addNewNode();
      assertEquals(238, expressionMatrixImpl0.getNumberOfElements());
      assertEquals(1, int0);
  }

  /**
  //Test case number: 6
  /*Coverage entropy=1.8470664818702467
  */
  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      ExpressionMatrixImpl expressionMatrixImpl0 = new ExpressionMatrixImpl();
      ExpressionImpl expressionImpl0 = new ExpressionImpl();
      HL7CheckerImpl hL7CheckerImpl0 = new HL7CheckerImpl();
      HL7MessageSegmentImpl hL7MessageSegmentImpl0 = new HL7MessageSegmentImpl();
      hL7MessageSegmentImpl0.setID("-----------------------\n");
      hL7MessageSegmentImpl0.toString();
      hL7MessageSegmentImpl0.toString();
      expressionMatrixImpl0.creatMatrix(238);
      expressionMatrixImpl0.toString();
      expressionMatrixImpl0.getNumberOfElements();
      expressionMatrixImpl0.addNewNode();
      expressionMatrixImpl0.setValue(0, 0, 0);
      expressionMatrixImpl0.toString();
      expressionMatrixImpl0.getValue((-1162), 238);
      expressionMatrixImpl0.getValue((-2245), (-2245));
      expressionMatrixImpl0.toString();
      assertEquals(238, expressionMatrixImpl0.getNumberOfElements());
  }

  /**
  //Test case number: 7
  /*Coverage entropy=2.153679791716168
  */
  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      ExpressionMatrixImpl expressionMatrixImpl0 = new ExpressionMatrixImpl();
      ExpressionImpl expressionImpl0 = new ExpressionImpl();
      expressionMatrixImpl0.creatMatrix(232);
      expressionMatrixImpl0.getNumberOfElements();
      expressionMatrixImpl0.addNewNode();
      expressionMatrixImpl0.setValue(0, 0, 0);
      expressionMatrixImpl0.getValue(0, (-1162));
      MessageTracerImpl messageTracerImpl0 = new MessageTracerImpl();
      messageTracerImpl0.getMapper();
      expressionMatrixImpl0.outNoStandardConnections(false, (ExpressionElementMapper) null);
      messageTracerImpl0.setMapper((ExpressionElementMapper) null);
      messageTracerImpl0.getMapper();
      expressionMatrixImpl0.outNoStandardConnections(true, (ExpressionElementMapper) null);
      expressionMatrixImpl0.getNumberOfElements();
      expressionMatrixImpl0.outNoStandardConnections(true, (ExpressionElementMapper) null);
      assertEquals(232, expressionMatrixImpl0.getNumberOfElements());
  }

  /**
  //Test case number: 8
  /*Coverage entropy=2.1365318002720963
  */
  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      ExpressionMatrixImpl expressionMatrixImpl0 = new ExpressionMatrixImpl();
      ExpressionImpl expressionImpl0 = new ExpressionImpl();
      MessageTracerImpl messageTracerImpl0 = new MessageTracerImpl();
      HL7MessageSegmentImpl hL7MessageSegmentImpl0 = new HL7MessageSegmentImpl();
      messageTracerImpl0.getHandler();
      messageTracerImpl0.setHandler((MessageTracerHandler) null);
      HL7MessageSegmentImpl hL7MessageSegmentImpl1 = new HL7MessageSegmentImpl();
      expressionMatrixImpl0.addNewNode();
      hL7MessageSegmentImpl1.toString();
      expressionMatrixImpl0.creatMatrix(2605);
      messageTracerImpl0.doBeginItem(expressionImpl0, hL7MessageSegmentImpl0);
      messageTracerImpl0.reset();
      messageTracerImpl0.getMapper();
      expressionMatrixImpl0.toString();
      expressionMatrixImpl0.getNumberOfElements();
      expressionMatrixImpl0.addNewNode();
      int int0 = 65;
      expressionMatrixImpl0.setValue(0, 65, 193);
      boolean boolean0 = false;
      // Undeclared exception!
      expressionMatrixImpl0.outNoStandardConnections(false, (ExpressionElementMapper) null);
  }

  /**
  //Test case number: 9
  /*Coverage entropy=1.6868977693384446
  */
  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      ExpressionMatrixImpl expressionMatrixImpl0 = new ExpressionMatrixImpl();
      expressionMatrixImpl0.addNewNode();
      ExpressionImpl expressionImpl0 = new ExpressionImpl();
      HL7CheckerImpl hL7CheckerImpl0 = new HL7CheckerImpl();
      MessageTracerImpl messageTracerImpl0 = new MessageTracerImpl();
      messageTracerImpl0.setHandler(hL7CheckerImpl0);
      HL7MessageSegmentImpl hL7MessageSegmentImpl0 = new HL7MessageSegmentImpl();
      ExpressionElementMapperImpl expressionElementMapperImpl0 = new ExpressionElementMapperImpl();
      messageTracerImpl0.setMapper(expressionElementMapperImpl0);
      hL7MessageSegmentImpl0.toString();
      expressionMatrixImpl0.creatMatrix(65533);
      messageTracerImpl0.doBeginItem(expressionImpl0, hL7MessageSegmentImpl0);
      messageTracerImpl0.reset();
      messageTracerImpl0.getMapper();
      // Undeclared exception!
      expressionMatrixImpl0.toString();
  }

  /**
  //Test case number: 10
  /*Coverage entropy=2.127398311498949
  */
  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      ExpressionMatrixImpl expressionMatrixImpl0 = new ExpressionMatrixImpl();
      expressionMatrixImpl0.addNewNode();
      ExpressionElementMapperImpl expressionElementMapperImpl0 = new ExpressionElementMapperImpl();
      expressionMatrixImpl0.outNoStandardConnections(false, expressionElementMapperImpl0);
      ExpressionElementMapperImpl expressionElementMapperImpl1 = new ExpressionElementMapperImpl();
      ExpressionElementMapperItemImpl expressionElementMapperItemImpl0 = new ExpressionElementMapperItemImpl();
      expressionElementMapperImpl0.setItem(333, expressionElementMapperItemImpl0);
      expressionElementMapperItemImpl0.setType(0);
      expressionElementMapperItemImpl0.setID("");
      expressionElementMapperItemImpl0.setType(333);
      ExpressionElementMapperItemImpl expressionElementMapperItemImpl1 = new ExpressionElementMapperItemImpl();
      expressionElementMapperImpl1.setItem((-2358), expressionElementMapperItemImpl1);
      expressionElementMapperItemImpl1.setType(969);
      expressionElementMapperImpl0.addItem(expressionElementMapperItemImpl1);
      expressionMatrixImpl0.outNoStandardConnections(false, expressionElementMapperImpl1);
      expressionMatrixImpl0.outNoStandardConnections(true, expressionElementMapperImpl0);
      expressionMatrixImpl0.setValue(936, 23, 65);
      expressionMatrixImpl0.getValue(333, 333);
      expressionMatrixImpl0.getNumberOfElements();
      expressionMatrixImpl0.creatMatrix(23);
      expressionMatrixImpl0.getValue(0, 66);
      expressionMatrixImpl0.getValue(0, 0);
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
  /*Coverage entropy=1.9481399390162086
  */
  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      ExpressionMatrixImpl expressionMatrixImpl0 = new ExpressionMatrixImpl();
      expressionMatrixImpl0.addNewNode();
      ExpressionElementMapperImpl expressionElementMapperImpl0 = new ExpressionElementMapperImpl();
      expressionMatrixImpl0.outNoStandardConnections(false, expressionElementMapperImpl0);
      ExpressionElementMapperImpl expressionElementMapperImpl1 = new ExpressionElementMapperImpl();
      ExpressionElementMapperItemImpl expressionElementMapperItemImpl0 = new ExpressionElementMapperItemImpl();
      expressionElementMapperImpl0.setItem(0, expressionElementMapperItemImpl0);
      expressionElementMapperItemImpl0.setType(2574);
      expressionElementMapperItemImpl0.setType(0);
      expressionElementMapperImpl1.addItem(expressionElementMapperItemImpl0);
      expressionMatrixImpl0.outNoStandardConnections(true, expressionElementMapperImpl0);
      expressionMatrixImpl0.outNoStandardConnections(true, expressionElementMapperImpl1);
      expressionMatrixImpl0.getValue(0, (-2777));
      ExpressionMatrixImpl expressionMatrixImpl1 = new ExpressionMatrixImpl();
      expressionMatrixImpl1.addNewNode();
      expressionMatrixImpl0.setValue(65, 22, 22);
      expressionMatrixImpl1.getValue(0, (-888));
      int int0 = expressionMatrixImpl0.getValue((-5169), 0);
      assertEquals((-1), int0);
      
      int int1 = expressionMatrixImpl0.addNewNode();
      assertEquals(1, int1);
  }

  /**
  //Test case number: 12
  /*Coverage entropy=2.102697166901139
  */
  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      ExpressionMatrixImpl expressionMatrixImpl0 = new ExpressionMatrixImpl();
      expressionMatrixImpl0.addNewNode();
      ExpressionElementMapperImpl expressionElementMapperImpl0 = new ExpressionElementMapperImpl();
      expressionMatrixImpl0.outNoStandardConnections(false, expressionElementMapperImpl0);
      ExpressionElementMapperImpl expressionElementMapperImpl1 = new ExpressionElementMapperImpl();
      ExpressionElementMapperItemImpl expressionElementMapperItemImpl0 = new ExpressionElementMapperItemImpl();
      expressionElementMapperImpl0.setItem(333, expressionElementMapperItemImpl0);
      expressionElementMapperItemImpl0.setType(0);
      expressionElementMapperItemImpl0.setID("");
      expressionElementMapperItemImpl0.setType(333);
      ExpressionElementMapperItemImpl expressionElementMapperItemImpl1 = new ExpressionElementMapperItemImpl();
      expressionElementMapperImpl1.setItem((-2358), expressionElementMapperItemImpl1);
      expressionElementMapperItemImpl1.setType(969);
      expressionElementMapperImpl0.addItem(expressionElementMapperItemImpl1);
      expressionMatrixImpl0.outNoStandardConnections(false, expressionElementMapperImpl1);
      expressionMatrixImpl0.outNoStandardConnections(true, expressionElementMapperImpl0);
      expressionMatrixImpl0.setValue(936, 23, 65);
      expressionMatrixImpl0.getValue(333, 333);
      expressionMatrixImpl0.getNumberOfElements();
      expressionMatrixImpl0.creatMatrix(23);
      expressionMatrixImpl0.getValue(65, (-1));
      expressionMatrixImpl0.getValue(0, 0);
      expressionMatrixImpl0.outNoStandardConnections(false, (ExpressionElementMapper) null);
      // Undeclared exception!
      try { 
        expressionMatrixImpl0.outNoStandardConnections(false, expressionElementMapperImpl1);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.evosuite.runtime.System", e);
      }
  }

  /**
  //Test case number: 13
  /*Coverage entropy=1.9959149597043582
  */
  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      ExpressionMatrixImpl expressionMatrixImpl0 = new ExpressionMatrixImpl();
      ExpressionImpl expressionImpl0 = new ExpressionImpl();
      HL7CheckerImpl hL7CheckerImpl0 = new HL7CheckerImpl();
      MessageTracerImpl messageTracerImpl0 = new MessageTracerImpl();
      messageTracerImpl0.setHandler(hL7CheckerImpl0);
      HL7MessageSegmentImpl hL7MessageSegmentImpl0 = new HL7MessageSegmentImpl();
      hL7MessageSegmentImpl0.toString();
      expressionMatrixImpl0.creatMatrix(193);
      messageTracerImpl0.doBeginItem(expressionImpl0, hL7MessageSegmentImpl0);
      messageTracerImpl0.reset();
      messageTracerImpl0.getMapper();
      expressionMatrixImpl0.toString();
      expressionMatrixImpl0.getNumberOfElements();
      expressionMatrixImpl0.addNewNode();
      expressionMatrixImpl0.setValue(0, 12, 41);
      HL7MessageSegmentImpl hL7MessageSegmentImpl1 = new HL7MessageSegmentImpl();
      int int0 = expressionMatrixImpl0.addNewNode();
      assertEquals(193, expressionMatrixImpl0.getNumberOfElements());
      assertEquals(1, int0);
  }

  /**
  //Test case number: 14
  /*Coverage entropy=2.1496421319145713
  */
  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      ExpressionMatrixImpl expressionMatrixImpl0 = new ExpressionMatrixImpl();
      expressionMatrixImpl0.creatMatrix(111);
      expressionMatrixImpl0.creatMatrix(111);
      expressionMatrixImpl0.addNewNode();
      expressionMatrixImpl0.getNumberOfElements();
      expressionMatrixImpl0.addNewNode();
      expressionMatrixImpl0.setValue(0, (-2405), 0);
      expressionMatrixImpl0.creatMatrix(0);
      expressionMatrixImpl0.getValue((-2405), (-2405));
      expressionMatrixImpl0.setValue(2146, 1848, 0);
      expressionMatrixImpl0.getValue(0, 30);
      expressionMatrixImpl0.toString();
      int int0 = expressionMatrixImpl0.getValue(1848, 0);
      assertEquals(0, expressionMatrixImpl0.getNumberOfElements());
      assertEquals((-1), int0);
  }

  /**
  //Test case number: 15
  /*Coverage entropy=2.151379232208468
  */
  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      ExpressionMatrixImpl expressionMatrixImpl0 = new ExpressionMatrixImpl();
      expressionMatrixImpl0.getNumberOfElements();
      ExpressionElementMapperImpl expressionElementMapperImpl0 = new ExpressionElementMapperImpl();
      expressionMatrixImpl0.outNoStandardConnections(false, expressionElementMapperImpl0);
      ExpressionElementMapperImpl expressionElementMapperImpl1 = new ExpressionElementMapperImpl();
      ExpressionElementMapperItemImpl expressionElementMapperItemImpl0 = new ExpressionElementMapperItemImpl();
      expressionElementMapperItemImpl0.setType(0);
      expressionElementMapperItemImpl0.setID("");
      expressionElementMapperItemImpl0.setType(333);
      expressionElementMapperImpl1.setItem((-2358), expressionElementMapperItemImpl0);
      expressionElementMapperItemImpl0.setType(983);
      expressionElementMapperImpl0.addItem(expressionElementMapperItemImpl0);
      expressionMatrixImpl0.outNoStandardConnections(false, expressionElementMapperImpl1);
      expressionMatrixImpl0.outNoStandardConnections(true, expressionElementMapperImpl0);
      expressionMatrixImpl0.setValue(936, 23, 65);
      expressionMatrixImpl0.getValue(333, 333);
      expressionMatrixImpl0.creatMatrix(23);
      expressionMatrixImpl0.getValue(65, (-1));
      expressionMatrixImpl0.getValue(936, (-1));
      expressionMatrixImpl0.toString();
      assertEquals(23, expressionMatrixImpl0.getNumberOfElements());
  }

  /**
  //Test case number: 16
  /*Coverage entropy=1.94962142049769
  */
  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      ExpressionMatrixImpl expressionMatrixImpl0 = new ExpressionMatrixImpl();
      expressionMatrixImpl0.addNewNode();
      ExpressionElementMapperImpl expressionElementMapperImpl0 = new ExpressionElementMapperImpl();
      expressionMatrixImpl0.outNoStandardConnections(false, expressionElementMapperImpl0);
      ExpressionElementMapperImpl expressionElementMapperImpl1 = new ExpressionElementMapperImpl();
      ExpressionElementMapperItemImpl expressionElementMapperItemImpl0 = new ExpressionElementMapperItemImpl();
      expressionElementMapperImpl0.setItem(333, expressionElementMapperItemImpl0);
      expressionElementMapperItemImpl0.setType(2574);
      expressionElementMapperItemImpl0.setType(0);
      expressionElementMapperImpl1.addItem(expressionElementMapperItemImpl0);
      expressionMatrixImpl0.outNoStandardConnections(true, expressionElementMapperImpl0);
      expressionMatrixImpl0.outNoStandardConnections(true, expressionElementMapperImpl1);
      expressionMatrixImpl0.getValue(0, (-2777));
      ExpressionMatrixImpl expressionMatrixImpl1 = new ExpressionMatrixImpl();
      expressionMatrixImpl1.addNewNode();
      ExpressionMatrixImpl expressionMatrixImpl2 = new ExpressionMatrixImpl();
      expressionMatrixImpl2.setValue(0, 22, 22);
      expressionMatrixImpl2.getValue(0, (-888));
      int int0 = expressionMatrixImpl0.getValue(333, 0);
      assertEquals((-1), int0);
      
      int int1 = expressionMatrixImpl0.addNewNode();
      assertEquals(1, int1);
  }

  /**
  //Test case number: 17
  /*Coverage entropy=1.8408398156653452
  */
  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      ExpressionMatrixImpl expressionMatrixImpl0 = new ExpressionMatrixImpl();
      expressionMatrixImpl0.getNumberOfElements();
      expressionMatrixImpl0.creatMatrix((-920));
      expressionMatrixImpl0.getNumberOfElements();
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
  //Test case number: 18
  /*Coverage entropy=1.830738805564335
  */
  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      ExpressionMatrixImpl expressionMatrixImpl0 = new ExpressionMatrixImpl();
      expressionMatrixImpl0.creatMatrix((-1));
      int int0 = expressionMatrixImpl0.getNumberOfElements();
      assertEquals((-1), int0);
      
      expressionMatrixImpl0.getNumberOfNodes();
      assertEquals((-1), expressionMatrixImpl0.getNumberOfElements());
  }

  /**
  //Test case number: 19
  /*Coverage entropy=1.543056733112554
  */
  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      ExpressionMatrixImpl expressionMatrixImpl0 = new ExpressionMatrixImpl();
      MessageTracerImpl messageTracerImpl0 = new MessageTracerImpl();
      ExpressionImpl expressionImpl0 = new ExpressionImpl();
      HL7MessageGroupImpl hL7MessageGroupImpl0 = new HL7MessageGroupImpl();
      messageTracerImpl0.processGroupContent(expressionImpl0, hL7MessageGroupImpl0);
      HL7CheckerImpl hL7CheckerImpl0 = new HL7CheckerImpl();
      messageTracerImpl0.setHandler((MessageTracerHandler) null);
      HL7MessageSegmentImpl hL7MessageSegmentImpl0 = new HL7MessageSegmentImpl();
      expressionMatrixImpl0.addNewNode();
      int int0 = expressionMatrixImpl0.addNewNode();
      assertEquals(1, int0);
      
      int int1 = expressionMatrixImpl0.getNumberOfNodes();
      assertFalse(int1 == int0);
  }

  /**
  //Test case number: 20
  /*Coverage entropy=2.0012159370965357
  */
  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      ExpressionMatrixImpl expressionMatrixImpl0 = new ExpressionMatrixImpl();
      expressionMatrixImpl0.addNewNode();
      ExpressionElementMapperImpl expressionElementMapperImpl0 = new ExpressionElementMapperImpl();
      expressionMatrixImpl0.outNoStandardConnections(false, expressionElementMapperImpl0);
      ExpressionElementMapperImpl expressionElementMapperImpl1 = new ExpressionElementMapperImpl();
      ExpressionElementMapperItemImpl expressionElementMapperItemImpl0 = new ExpressionElementMapperItemImpl();
      expressionElementMapperImpl0.setItem(333, expressionElementMapperItemImpl0);
      expressionElementMapperItemImpl0.setType(2574);
      expressionElementMapperItemImpl0.setType(0);
      expressionElementMapperImpl1.addItem(expressionElementMapperItemImpl0);
      expressionMatrixImpl0.outNoStandardConnections(true, expressionElementMapperImpl1);
      expressionMatrixImpl0.outNoStandardConnections(true, expressionElementMapperImpl1);
      int int0 = expressionMatrixImpl0.getValue(333, (-1));
      assertEquals((-1), int0);
      
      MessageTracerImpl messageTracerImpl0 = new MessageTracerImpl();
      messageTracerImpl0.getMapper();
      expressionMatrixImpl0.outNoStandardConnections(false, (ExpressionElementMapper) null);
      expressionMatrixImpl0.addNewNode();
      ExpressionMatrixImpl expressionMatrixImpl1 = new ExpressionMatrixImpl();
      expressionMatrixImpl1.setValue(65, 217, 333);
      int int1 = expressionMatrixImpl0.addNewNode();
      assertEquals(2, int1);
  }

  /**
  //Test case number: 21
  /*Coverage entropy=2.1531782505128936
  */
  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      ExpressionMatrixImpl expressionMatrixImpl0 = new ExpressionMatrixImpl();
      ExpressionElementMapperImpl expressionElementMapperImpl0 = new ExpressionElementMapperImpl();
      expressionMatrixImpl0.outNoStandardConnections(false, expressionElementMapperImpl0);
      ExpressionElementMapperImpl expressionElementMapperImpl1 = new ExpressionElementMapperImpl();
      ExpressionElementMapperItemImpl expressionElementMapperItemImpl0 = new ExpressionElementMapperItemImpl();
      expressionElementMapperItemImpl0.setType(3);
      expressionElementMapperItemImpl0.setID("");
      ExpressionElementMapperItemImpl expressionElementMapperItemImpl1 = new ExpressionElementMapperItemImpl();
      expressionElementMapperItemImpl1.setType(333);
      expressionElementMapperImpl0.setItem((-2358), expressionElementMapperItemImpl1);
      ExpressionElementMapperItemImpl expressionElementMapperItemImpl2 = new ExpressionElementMapperItemImpl();
      expressionElementMapperItemImpl2.setType(501);
      expressionElementMapperImpl1.addItem(expressionElementMapperItemImpl0);
      expressionMatrixImpl0.outNoStandardConnections(false, expressionElementMapperImpl1);
      expressionMatrixImpl0.outNoStandardConnections(true, expressionElementMapperImpl0);
      expressionMatrixImpl0.setValue(65, 186, 3236);
      expressionMatrixImpl0.getValue((-1283), 23);
      expressionMatrixImpl0.creatMatrix((-1));
      ExpressionMatrixImpl expressionMatrixImpl1 = new ExpressionMatrixImpl();
      expressionMatrixImpl1.getValue((-1), 177);
      expressionMatrixImpl0.toString();
      assertEquals((-1), expressionMatrixImpl0.getNumberOfElements());
  }

  /**
  //Test case number: 22
  /*Coverage entropy=2.033750937847342
  */
  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      ExpressionMatrixImpl expressionMatrixImpl0 = new ExpressionMatrixImpl();
      int int0 = expressionMatrixImpl0.addNewNode();
      assertEquals(0, int0);
      
      ExpressionElementMapperImpl expressionElementMapperImpl0 = new ExpressionElementMapperImpl();
      expressionMatrixImpl0.outNoStandardConnections(false, expressionElementMapperImpl0);
      ExpressionElementMapperImpl expressionElementMapperImpl1 = new ExpressionElementMapperImpl();
      ExpressionElementMapperItemImpl expressionElementMapperItemImpl0 = new ExpressionElementMapperItemImpl();
      expressionElementMapperImpl0.setItem(333, expressionElementMapperItemImpl0);
      expressionElementMapperItemImpl0.setType(0);
      expressionElementMapperItemImpl0.setID("");
      expressionElementMapperItemImpl0.setType(333);
      ExpressionElementMapperItemImpl expressionElementMapperItemImpl1 = new ExpressionElementMapperItemImpl();
      expressionElementMapperItemImpl1.setID("BUTTON");
      expressionElementMapperImpl1.setItem((-2358), expressionElementMapperItemImpl1);
      expressionElementMapperItemImpl1.setType(969);
      expressionElementMapperImpl0.addItem(expressionElementMapperItemImpl1);
      expressionMatrixImpl0.outNoStandardConnections(false, expressionElementMapperImpl1);
      expressionMatrixImpl0.outNoStandardConnections(true, expressionElementMapperImpl0);
      expressionMatrixImpl0.setValue(936, 23, 969);
      expressionMatrixImpl0.getValue(333, 333);
      int int1 = expressionMatrixImpl0.getValue(0, 0);
      assertEquals((-1), int1);
      
      expressionMatrixImpl0.outNoStandardConnections(false, (ExpressionElementMapper) null);
      String string0 = expressionMatrixImpl0.toString();
      assertEquals("MATRIX\n-----------------------\n | \n0| \n\nCONNECTIONS\n-----------------------\n", string0);
  }

  /**
  //Test case number: 23
  /*Coverage entropy=1.888891919686543
  */
  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      ExpressionMatrixImpl expressionMatrixImpl0 = new ExpressionMatrixImpl();
      MessageTracerImpl messageTracerImpl0 = new MessageTracerImpl();
      ExpressionImpl expressionImpl0 = new ExpressionImpl();
      HL7CheckerImpl hL7CheckerImpl0 = new HL7CheckerImpl();
      messageTracerImpl0.setHandler(hL7CheckerImpl0);
      HL7MessageSegmentImpl hL7MessageSegmentImpl0 = new HL7MessageSegmentImpl();
      messageTracerImpl0.doBeginItem(expressionImpl0, hL7MessageSegmentImpl0);
      messageTracerImpl0.reset();
      messageTracerImpl0.getMapper();
      expressionMatrixImpl0.toString();
      expressionMatrixImpl0.getNumberOfElements();
      expressionMatrixImpl0.addNewNode();
      expressionMatrixImpl0.setValue(0, 0, 0);
      expressionMatrixImpl0.creatMatrix((-2821));
      expressionMatrixImpl0.setValue(1090, (-1), (-1));
      expressionMatrixImpl0.toString();
      assertEquals((-2821), expressionMatrixImpl0.getNumberOfElements());
  }

  /**
  //Test case number: 24
  /*Coverage entropy=1.597229736446844
  */
  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      ExpressionMatrixImpl expressionMatrixImpl0 = new ExpressionMatrixImpl();
      expressionMatrixImpl0.addNewNode();
      expressionMatrixImpl0.addNewNode();
      ExpressionElementMapperImpl expressionElementMapperImpl0 = new ExpressionElementMapperImpl();
      ExpressionElementMapperItemImpl expressionElementMapperItemImpl0 = new ExpressionElementMapperItemImpl();
      expressionElementMapperImpl0.addItem(expressionElementMapperItemImpl0);
      expressionElementMapperImpl0.removeItem((-1631));
      ExpressionElementMapperItemImpl expressionElementMapperItemImpl1 = new ExpressionElementMapperItemImpl();
      expressionElementMapperItemImpl1.setType(1252);
      expressionElementMapperItemImpl1.setID("");
      expressionMatrixImpl0.setValue(1, 1252, 2146);
      expressionMatrixImpl0.getValue(3557, (-3857));
      ExpressionMatrixImpl expressionMatrixImpl1 = new ExpressionMatrixImpl();
      expressionMatrixImpl1.addNewNode();
      expressionMatrixImpl1.setValue((-1), (-1), 96);
      expressionMatrixImpl0.getValue((-1631), 0);
      int int0 = expressionMatrixImpl0.getValue(1, 97);
      assertEquals((-1), int0);
      
      int int1 = expressionMatrixImpl1.addNewNode();
      assertEquals(1, int1);
  }
}
