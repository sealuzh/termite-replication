/*
 * This file was automatically generated by EvoSuite
 * Mon Nov 18 21:37:24 GMT 2019
 */

package com.browsersoft.openhre.hl7.impl.regular;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.browsersoft.openhre.hl7.api.config.HL7Segment;
import com.browsersoft.openhre.hl7.api.regular.ExpressionElementMapper;
import com.browsersoft.openhre.hl7.api.regular.ExpressionElementMapperItem;
import com.browsersoft.openhre.hl7.impl.config.HL7MessageSegmentImpl;
import com.browsersoft.openhre.hl7.impl.config.HL7SegmentMapImpl;
import com.browsersoft.openhre.hl7.impl.parser.HL7CheckerStateImpl;
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
  /*Coverage entropy=2.0763027651358694
  */
  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      ExpressionMatrixImpl expressionMatrixImpl0 = new ExpressionMatrixImpl();
      expressionMatrixImpl0.creatMatrix(243);
      expressionMatrixImpl0.addNewNode();
      expressionMatrixImpl0.creatMatrix(243);
      expressionMatrixImpl0.addNewNode();
      expressionMatrixImpl0.addNewNode();
      expressionMatrixImpl0.toString();
      expressionMatrixImpl0.getValue(806, 243);
      MessageTracerImpl messageTracerImpl0 = new MessageTracerImpl();
      messageTracerImpl0.reset();
      messageTracerImpl0.setMatrix(expressionMatrixImpl0);
      messageTracerImpl0.getMapper();
      expressionMatrixImpl0.toString();
      expressionMatrixImpl0.getNumberOfElements();
      expressionMatrixImpl0.addNewNode();
      expressionMatrixImpl0.creatMatrix(243);
      expressionMatrixImpl0.addNewNode();
      expressionMatrixImpl0.addNewNode();
      expressionMatrixImpl0.addNewNode();
      expressionMatrixImpl0.outNoStandardConnections(true, (ExpressionElementMapper) null);
      expressionMatrixImpl0.setValue(2, 0, 2);
      expressionMatrixImpl0.creatMatrix((-1));
      expressionMatrixImpl0.getValue(65, 1);
      expressionMatrixImpl0.creatMatrix(65);
      expressionMatrixImpl0.addNewNode();
      expressionMatrixImpl0.outNoStandardConnections(false, (ExpressionElementMapper) null);
      expressionMatrixImpl0.toString();
      int int0 = expressionMatrixImpl0.addNewNode();
      assertEquals(65, expressionMatrixImpl0.getNumberOfElements());
      assertEquals(8, int0);
  }

  /**
  //Test case number: 1
  /*Coverage entropy=2.0763027781284804
  */
  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      ExpressionMatrixImpl expressionMatrixImpl0 = new ExpressionMatrixImpl();
      expressionMatrixImpl0.creatMatrix(243);
      expressionMatrixImpl0.addNewNode();
      expressionMatrixImpl0.creatMatrix(243);
      expressionMatrixImpl0.addNewNode();
      expressionMatrixImpl0.addNewNode();
      expressionMatrixImpl0.toString();
      expressionMatrixImpl0.getValue(806, 243);
      MessageTracerImpl messageTracerImpl0 = new MessageTracerImpl();
      messageTracerImpl0.reset();
      messageTracerImpl0.reset();
      messageTracerImpl0.setMatrix(expressionMatrixImpl0);
      messageTracerImpl0.getMapper();
      expressionMatrixImpl0.toString();
      expressionMatrixImpl0.getNumberOfElements();
      expressionMatrixImpl0.addNewNode();
      expressionMatrixImpl0.creatMatrix(243);
      expressionMatrixImpl0.addNewNode();
      expressionMatrixImpl0.addNewNode();
      expressionMatrixImpl0.addNewNode();
      expressionMatrixImpl0.outNoStandardConnections(true, (ExpressionElementMapper) null);
      expressionMatrixImpl0.setValue(2, 0, 2);
      expressionMatrixImpl0.creatMatrix((-1));
      expressionMatrixImpl0.getValue(65, 1);
      expressionMatrixImpl0.creatMatrix(65);
      expressionMatrixImpl0.addNewNode();
      expressionMatrixImpl0.outNoStandardConnections(true, (ExpressionElementMapper) null);
      expressionMatrixImpl0.toString();
      expressionMatrixImpl0.addNewNode();
      expressionMatrixImpl0.addNewNode();
      int int0 = expressionMatrixImpl0.addNewNode();
      assertEquals(65, expressionMatrixImpl0.getNumberOfElements());
      assertEquals(10, int0);
  }

  /**
  //Test case number: 2
  /*Coverage entropy=2.0920839189440477
  */
  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      ExpressionMatrixImpl expressionMatrixImpl0 = new ExpressionMatrixImpl();
      expressionMatrixImpl0.creatMatrix(243);
      expressionMatrixImpl0.addNewNode();
      expressionMatrixImpl0.addNewNode();
      expressionMatrixImpl0.creatMatrix(243);
      expressionMatrixImpl0.addNewNode();
      expressionMatrixImpl0.addNewNode();
      expressionMatrixImpl0.toString();
      expressionMatrixImpl0.getValue(806, 243);
      expressionMatrixImpl0.getNumberOfElements();
      expressionMatrixImpl0.getValue(243, (-1));
      expressionMatrixImpl0.creatMatrix(243);
      expressionMatrixImpl0.setValue(157, 83, 17);
      expressionMatrixImpl0.getNumberOfElements();
      expressionMatrixImpl0.addNewNode();
      expressionMatrixImpl0.toString();
      expressionMatrixImpl0.setValue(3, 0, 1);
      expressionMatrixImpl0.creatMatrix((-1));
      expressionMatrixImpl0.getNumberOfElements();
      expressionMatrixImpl0.creatMatrix(65);
      expressionMatrixImpl0.outNoStandardConnections(true, (ExpressionElementMapper) null);
      expressionMatrixImpl0.toString();
      expressionMatrixImpl0.addNewNode();
      expressionMatrixImpl0.toString();
      expressionMatrixImpl0.getValue(1655, 0);
      expressionMatrixImpl0.addNewNode();
      assertEquals(65, expressionMatrixImpl0.getNumberOfElements());
  }

  /**
  //Test case number: 3
  /*Coverage entropy=2.1105797535098514
  */
  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      ExpressionMatrixImpl expressionMatrixImpl0 = new ExpressionMatrixImpl();
      expressionMatrixImpl0.creatMatrix(243);
      expressionMatrixImpl0.getValue(243, 243);
      expressionMatrixImpl0.creatMatrix(243);
      expressionMatrixImpl0.toString();
      expressionMatrixImpl0.addNewNode();
      expressionMatrixImpl0.addNewNode();
      expressionMatrixImpl0.getValue((-1), 243);
      expressionMatrixImpl0.getValue(243, (-1));
      expressionMatrixImpl0.creatMatrix(0);
      expressionMatrixImpl0.setValue(157, (-1), 17);
      expressionMatrixImpl0.getValue(0, 0);
      expressionMatrixImpl0.addNewNode();
      expressionMatrixImpl0.creatMatrix(17);
      expressionMatrixImpl0.addNewNode();
      expressionMatrixImpl0.toString();
      expressionMatrixImpl0.setValue(1, 0, 2);
      expressionMatrixImpl0.creatMatrix((-1));
      expressionMatrixImpl0.getNumberOfElements();
      expressionMatrixImpl0.creatMatrix(65);
      expressionMatrixImpl0.outNoStandardConnections(true, (ExpressionElementMapper) null);
      expressionMatrixImpl0.toString();
      expressionMatrixImpl0.getValue(164, (-1));
      expressionMatrixImpl0.getValue((-1), 2);
      expressionMatrixImpl0.toString();
      expressionMatrixImpl0.toString();
      int int0 = expressionMatrixImpl0.getValue(157, 240);
      assertEquals(65, expressionMatrixImpl0.getNumberOfElements());
      assertEquals((-1), int0);
  }

  /**
  //Test case number: 4
  /*Coverage entropy=2.1032029701898027
  */
  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      ExpressionMatrixImpl expressionMatrixImpl0 = new ExpressionMatrixImpl();
      expressionMatrixImpl0.addNewNode();
      expressionMatrixImpl0.creatMatrix(253);
      expressionMatrixImpl0.addNewNode();
      expressionMatrixImpl0.toString();
      expressionMatrixImpl0.addNewNode();
      expressionMatrixImpl0.creatMatrix(253);
      expressionMatrixImpl0.addNewNode();
      expressionMatrixImpl0.addNewNode();
      expressionMatrixImpl0.toString();
      expressionMatrixImpl0.getValue(0, 253);
      expressionMatrixImpl0.getNumberOfElements();
      expressionMatrixImpl0.getValue(253, (-1));
      expressionMatrixImpl0.creatMatrix(1628);
      expressionMatrixImpl0.creatMatrix(215);
      expressionMatrixImpl0.creatMatrix(253);
      expressionMatrixImpl0.setValue(157, 101, (-5));
      expressionMatrixImpl0.addNewNode();
      expressionMatrixImpl0.getNumberOfElements();
      expressionMatrixImpl0.toString();
      expressionMatrixImpl0.setValue(4, 8, 253);
      expressionMatrixImpl0.creatMatrix((-1));
      expressionMatrixImpl0.getNumberOfElements();
      expressionMatrixImpl0.creatMatrix(65);
      expressionMatrixImpl0.toString();
      expressionMatrixImpl0.outNoStandardConnections(true, (ExpressionElementMapper) null);
      expressionMatrixImpl0.getNumberOfElements();
      expressionMatrixImpl0.getNumberOfElements();
      expressionMatrixImpl0.getNumberOfElements();
      int int0 = expressionMatrixImpl0.addNewNode();
      assertEquals(65, expressionMatrixImpl0.getNumberOfElements());
      assertEquals(6, int0);
  }

  /**
  //Test case number: 5
  /*Coverage entropy=2.076312212980966
  */
  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      ExpressionMatrixImpl expressionMatrixImpl0 = new ExpressionMatrixImpl();
      expressionMatrixImpl0.creatMatrix(243);
      expressionMatrixImpl0.addNewNode();
      expressionMatrixImpl0.toString();
      expressionMatrixImpl0.addNewNode();
      expressionMatrixImpl0.creatMatrix(243);
      expressionMatrixImpl0.addNewNode();
      expressionMatrixImpl0.addNewNode();
      expressionMatrixImpl0.toString();
      expressionMatrixImpl0.getValue(806, 243);
      MessageTracerImpl messageTracerImpl0 = new MessageTracerImpl();
      messageTracerImpl0.setMatrix(expressionMatrixImpl0);
      messageTracerImpl0.getMapper();
      expressionMatrixImpl0.toString();
      expressionMatrixImpl0.getNumberOfElements();
      expressionMatrixImpl0.addNewNode();
      expressionMatrixImpl0.creatMatrix(243);
      expressionMatrixImpl0.addNewNode();
      expressionMatrixImpl0.addNewNode();
      expressionMatrixImpl0.addNewNode();
      expressionMatrixImpl0.outNoStandardConnections(true, (ExpressionElementMapper) null);
      expressionMatrixImpl0.setValue(2, 0, 3);
      expressionMatrixImpl0.creatMatrix((-1));
      expressionMatrixImpl0.getValue(65, 1);
      expressionMatrixImpl0.creatMatrix(65);
      expressionMatrixImpl0.addNewNode();
      expressionMatrixImpl0.outNoStandardConnections(false, (ExpressionElementMapper) null);
      expressionMatrixImpl0.getValue(2, 0);
      expressionMatrixImpl0.toString();
      int int0 = expressionMatrixImpl0.addNewNode();
      assertEquals(65, expressionMatrixImpl0.getNumberOfElements());
      assertEquals(9, int0);
  }

  /**
  //Test case number: 6
  /*Coverage entropy=2.0819509029590875
  */
  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      ExpressionMatrixImpl expressionMatrixImpl0 = new ExpressionMatrixImpl();
      expressionMatrixImpl0.creatMatrix(243);
      expressionMatrixImpl0.addNewNode();
      String string0 = expressionMatrixImpl0.toString();
      ExpressionElementMapperImpl expressionElementMapperImpl0 = new ExpressionElementMapperImpl();
      expressionElementMapperImpl0.getItem((-1918));
      expressionElementMapperImpl0.addItem((ExpressionElementMapperItem) null);
      ExpressionElementMapperItemImpl expressionElementMapperItemImpl0 = new ExpressionElementMapperItemImpl();
      expressionElementMapperItemImpl0.setID(string0);
      expressionElementMapperImpl0.setItem((-1918), expressionElementMapperItemImpl0);
      expressionElementMapperImpl0.clearAll();
      expressionMatrixImpl0.setValue(0, 0, (-1918));
      expressionMatrixImpl0.addNewNode();
      expressionMatrixImpl0.addNewNode();
      expressionMatrixImpl0.addNewNode();
      expressionMatrixImpl0.creatMatrix(1209);
      expressionMatrixImpl0.outNoStandardConnections(false, (ExpressionElementMapper) null);
      expressionMatrixImpl0.setValue((-1552), 2, 231);
      expressionMatrixImpl0.getValue(200, 200);
      expressionMatrixImpl0.creatMatrix((-8));
      ExpressionElementMapperImpl expressionElementMapperImpl1 = new ExpressionElementMapperImpl();
      expressionMatrixImpl0.outNoStandardConnections(false, (ExpressionElementMapper) null);
      expressionMatrixImpl0.outNoStandardConnections(false, (ExpressionElementMapper) null);
      expressionMatrixImpl0.outNoStandardConnections(false, (ExpressionElementMapper) null);
      assertEquals((-8), expressionMatrixImpl0.getNumberOfElements());
  }

  /**
  //Test case number: 7
  /*Coverage entropy=2.164472513633089
  */
  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      ExpressionMatrixImpl expressionMatrixImpl0 = new ExpressionMatrixImpl();
      expressionMatrixImpl0.addNewNode();
      expressionMatrixImpl0.creatMatrix(243);
      expressionMatrixImpl0.creatMatrix(243);
      expressionMatrixImpl0.addNewNode();
      expressionMatrixImpl0.toString();
      expressionMatrixImpl0.getValue(243, 1);
      expressionMatrixImpl0.creatMatrix(243);
      expressionMatrixImpl0.getValue(1, (-1));
      expressionMatrixImpl0.addNewNode();
      expressionMatrixImpl0.creatMatrix(2);
      expressionMatrixImpl0.getValue((-1), 243);
      expressionMatrixImpl0.getValue(243, (-1));
      expressionMatrixImpl0.creatMatrix((-1));
      expressionMatrixImpl0.creatMatrix(1660);
      expressionMatrixImpl0.creatMatrix((-1));
      expressionMatrixImpl0.creatMatrix(0);
      expressionMatrixImpl0.setValue(123, 83, 3);
      expressionMatrixImpl0.getValue((-1), (-1));
      expressionMatrixImpl0.addNewNode();
      expressionMatrixImpl0.toString();
      expressionMatrixImpl0.setValue(2, 2, 3);
      expressionMatrixImpl0.creatMatrix((-1));
      expressionMatrixImpl0.getNumberOfElements();
      expressionMatrixImpl0.creatMatrix(65);
      expressionMatrixImpl0.outNoStandardConnections(false, (ExpressionElementMapper) null);
      expressionMatrixImpl0.getValue((-1), 83);
      expressionMatrixImpl0.getNumberOfElements();
      expressionMatrixImpl0.getNumberOfElements();
      expressionMatrixImpl0.addNewNode();
      int int0 = expressionMatrixImpl0.addNewNode();
      assertEquals(65, expressionMatrixImpl0.getNumberOfElements());
      assertEquals(5, int0);
  }

  /**
  //Test case number: 8
  /*Coverage entropy=2.1106806616061298
  */
  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      ExpressionMatrixImpl expressionMatrixImpl0 = new ExpressionMatrixImpl();
      expressionMatrixImpl0.addNewNode();
      expressionMatrixImpl0.creatMatrix(243);
      expressionMatrixImpl0.addNewNode();
      expressionMatrixImpl0.toString();
      expressionMatrixImpl0.getValue(243, 1);
      expressionMatrixImpl0.creatMatrix(243);
      expressionMatrixImpl0.addNewNode();
      expressionMatrixImpl0.addNewNode();
      expressionMatrixImpl0.toString();
      expressionMatrixImpl0.getValue((-1), 243);
      expressionMatrixImpl0.getNumberOfElements();
      expressionMatrixImpl0.getValue(243, (-1));
      expressionMatrixImpl0.creatMatrix(1628);
      expressionMatrixImpl0.creatMatrix(215);
      expressionMatrixImpl0.creatMatrix(243);
      int int0 = 83;
      expressionMatrixImpl0.setValue(157, 83, 3);
      expressionMatrixImpl0.getValue(2, 2);
      expressionMatrixImpl0.addNewNode();
      expressionMatrixImpl0.toString();
      expressionMatrixImpl0.toString();
      expressionMatrixImpl0.setValue(3, 0, 4);
      expressionMatrixImpl0.creatMatrix((-1));
      expressionMatrixImpl0.getNumberOfElements();
      expressionMatrixImpl0.creatMatrix(157);
      expressionMatrixImpl0.toString();
      // Undeclared exception!
      expressionMatrixImpl0.outNoStandardConnections(true, (ExpressionElementMapper) null);
  }

  /**
  //Test case number: 9
  /*Coverage entropy=2.1180665717999476
  */
  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      ExpressionMatrixImpl expressionMatrixImpl0 = new ExpressionMatrixImpl();
      expressionMatrixImpl0.addNewNode();
      expressionMatrixImpl0.creatMatrix(243);
      expressionMatrixImpl0.creatMatrix(243);
      expressionMatrixImpl0.addNewNode();
      expressionMatrixImpl0.toString();
      expressionMatrixImpl0.getValue(243, 1);
      expressionMatrixImpl0.creatMatrix(243);
      expressionMatrixImpl0.getValue(1, (-1));
      expressionMatrixImpl0.addNewNode();
      expressionMatrixImpl0.creatMatrix(2);
      expressionMatrixImpl0.getValue((-1), 243);
      expressionMatrixImpl0.getValue(243, (-1));
      expressionMatrixImpl0.creatMatrix((-1));
      expressionMatrixImpl0.creatMatrix(1660);
      expressionMatrixImpl0.creatMatrix((-1));
      expressionMatrixImpl0.creatMatrix(0);
      expressionMatrixImpl0.setValue(123, 83, 3);
      expressionMatrixImpl0.getValue((-1), (-1));
      expressionMatrixImpl0.addNewNode();
      expressionMatrixImpl0.toString();
      expressionMatrixImpl0.setValue(2, 0, 3);
      expressionMatrixImpl0.creatMatrix((-1));
      expressionMatrixImpl0.getNumberOfElements();
      expressionMatrixImpl0.outNoStandardConnections(false, (ExpressionElementMapper) null);
      expressionMatrixImpl0.getValue((-1), 83);
      expressionMatrixImpl0.getValue(65, 123);
      expressionMatrixImpl0.toString();
      expressionMatrixImpl0.getValue((-1), 243);
      expressionMatrixImpl0.toString();
      assertEquals((-1), expressionMatrixImpl0.getNumberOfElements());
  }

  /**
  //Test case number: 10
  /*Coverage entropy=1.9228012931779224
  */
  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      ExpressionMatrixImpl expressionMatrixImpl0 = new ExpressionMatrixImpl();
      expressionMatrixImpl0.creatMatrix(314);
      expressionMatrixImpl0.addNewNode();
      String string0 = expressionMatrixImpl0.toString();
      expressionMatrixImpl0.getNumberOfElements();
      ExpressionElementMapperItemImpl expressionElementMapperItemImpl0 = new ExpressionElementMapperItemImpl();
      ExpressionElementMapperImpl expressionElementMapperImpl0 = new ExpressionElementMapperImpl();
      expressionElementMapperImpl0.addItem(expressionElementMapperItemImpl0);
      ExpressionElementMapperImpl expressionElementMapperImpl1 = new ExpressionElementMapperImpl();
      expressionElementMapperImpl1.clearAll();
      expressionElementMapperImpl0.getItem(314);
      expressionElementMapperItemImpl0.toString();
      ExpressionElementMapperItemImpl expressionElementMapperItemImpl1 = new ExpressionElementMapperItemImpl();
      expressionElementMapperImpl1.setItem(314, expressionElementMapperItemImpl1);
      ExpressionElementMapperItemImpl expressionElementMapperItemImpl2 = new ExpressionElementMapperItemImpl();
      expressionElementMapperItemImpl1.setID(string0);
      expressionElementMapperItemImpl0.getSegment();
      expressionElementMapperItemImpl2.setSegment((HL7Segment) null);
      expressionElementMapperItemImpl2.setID("");
      ExpressionElementMapperImpl expressionElementMapperImpl2 = new ExpressionElementMapperImpl();
      HL7CheckerStateImpl hL7CheckerStateImpl0 = new HL7CheckerStateImpl();
      expressionElementMapperItemImpl0.getSegment();
      ExpressionElementMapperItemImpl expressionElementMapperItemImpl3 = new ExpressionElementMapperItemImpl();
      ExpressionElementMapperItemImpl expressionElementMapperItemImpl4 = new ExpressionElementMapperItemImpl();
      ExpressionElementMapperItemImpl expressionElementMapperItemImpl5 = new ExpressionElementMapperItemImpl();
      expressionElementMapperItemImpl5.setSegment((HL7Segment) null);
      ExpressionElementMapperItemImpl expressionElementMapperItemImpl6 = new ExpressionElementMapperItemImpl();
      expressionElementMapperItemImpl6.toString();
      ExpressionElementMapperImpl expressionElementMapperImpl3 = new ExpressionElementMapperImpl();
      expressionElementMapperImpl0.addItem(expressionElementMapperItemImpl1);
      expressionElementMapperImpl2.addItem(expressionElementMapperItemImpl5);
      expressionElementMapperImpl3.removeItem(49);
      ExpressionElementMapperItemImpl expressionElementMapperItemImpl7 = new ExpressionElementMapperItemImpl();
      // Undeclared exception!
      try { 
        expressionMatrixImpl0.outNoStandardConnections(false, expressionElementMapperImpl2);
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
  /*Coverage entropy=2.1626161324302253
  */
  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
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
      assertEquals(0, expressionMatrixImpl0.getNumberOfElements());
  }

  /**
  //Test case number: 12
  /*Coverage entropy=1.906854808672741
  */
  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      ExpressionMatrixImpl expressionMatrixImpl0 = new ExpressionMatrixImpl();
      expressionMatrixImpl0.creatMatrix(243);
      expressionMatrixImpl0.addNewNode();
      String string0 = expressionMatrixImpl0.toString();
      expressionMatrixImpl0.getNumberOfElements();
      ExpressionElementMapperItemImpl expressionElementMapperItemImpl0 = new ExpressionElementMapperItemImpl();
      ExpressionElementMapperImpl expressionElementMapperImpl0 = new ExpressionElementMapperImpl();
      expressionElementMapperImpl0.addItem(expressionElementMapperItemImpl0);
      ExpressionElementMapperImpl expressionElementMapperImpl1 = new ExpressionElementMapperImpl();
      expressionElementMapperImpl0.clearAll();
      expressionElementMapperImpl0.getItem(231);
      expressionElementMapperItemImpl0.toString();
      ExpressionElementMapperItemImpl expressionElementMapperItemImpl1 = new ExpressionElementMapperItemImpl();
      expressionElementMapperImpl1.setItem(65, expressionElementMapperItemImpl0);
      ExpressionElementMapperItemImpl expressionElementMapperItemImpl2 = new ExpressionElementMapperItemImpl();
      HL7SegmentMapImpl hL7SegmentMapImpl0 = new HL7SegmentMapImpl();
      hL7SegmentMapImpl0.getItem("{R>Hxohq:");
      expressionElementMapperItemImpl0.setSegment((HL7Segment) null);
      expressionElementMapperItemImpl2.setID(string0);
      expressionElementMapperItemImpl0.getSegment();
      expressionElementMapperItemImpl2.setSegment((HL7Segment) null);
      ExpressionElementMapperImpl expressionElementMapperImpl2 = new ExpressionElementMapperImpl();
      expressionElementMapperItemImpl1.getSegment();
      ExpressionElementMapperItemImpl expressionElementMapperItemImpl3 = new ExpressionElementMapperItemImpl();
      ExpressionElementMapperItemImpl expressionElementMapperItemImpl4 = new ExpressionElementMapperItemImpl();
      expressionElementMapperItemImpl3.setSegment((HL7Segment) null);
      ExpressionElementMapperItemImpl expressionElementMapperItemImpl5 = new ExpressionElementMapperItemImpl();
      expressionElementMapperItemImpl5.toString();
      ExpressionElementMapperImpl expressionElementMapperImpl3 = new ExpressionElementMapperImpl();
      expressionElementMapperImpl1.getItem(241);
      expressionElementMapperImpl1.addItem((ExpressionElementMapperItem) null);
      expressionElementMapperImpl1.addItem((ExpressionElementMapperItem) null);
      expressionElementMapperImpl3.removeItem(65);
      ExpressionElementMapperItemImpl expressionElementMapperItemImpl6 = new ExpressionElementMapperItemImpl();
      // Undeclared exception!
      try { 
        expressionMatrixImpl0.outNoStandardConnections(false, expressionElementMapperImpl2);
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
  /*Coverage entropy=1.8942076860882042
  */
  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      ExpressionMatrixImpl expressionMatrixImpl0 = new ExpressionMatrixImpl();
      expressionMatrixImpl0.addNewNode();
      expressionMatrixImpl0.creatMatrix(243);
      expressionMatrixImpl0.addNewNode();
      expressionMatrixImpl0.toString();
      expressionMatrixImpl0.getValue(243, 1);
      expressionMatrixImpl0.creatMatrix(243);
      expressionMatrixImpl0.getValue(1, (-1));
      expressionMatrixImpl0.addNewNode();
      expressionMatrixImpl0.creatMatrix(60);
      expressionMatrixImpl0.toString();
      expressionMatrixImpl0.getValue((-1), 243);
      expressionMatrixImpl0.getValue(243, (-1));
      expressionMatrixImpl0.creatMatrix(1628);
      expressionMatrixImpl0.creatMatrix(215);
      expressionMatrixImpl0.creatMatrix(0);
      expressionMatrixImpl0.setValue(123, 83, 3);
      expressionMatrixImpl0.addNewNode();
      expressionMatrixImpl0.toString();
      expressionMatrixImpl0.setValue(2, 0, 3);
      expressionMatrixImpl0.creatMatrix((-1));
      expressionMatrixImpl0.getNumberOfElements();
      expressionMatrixImpl0.creatMatrix(65);
      expressionMatrixImpl0.getValue(1, 83);
      expressionMatrixImpl0.getValue(3, (-213));
      expressionMatrixImpl0.toString();
      assertEquals(65, expressionMatrixImpl0.getNumberOfElements());
  }

  /**
  //Test case number: 14
  /*Coverage entropy=2.1151306663874654
  */
  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      ExpressionMatrixImpl expressionMatrixImpl0 = new ExpressionMatrixImpl();
      expressionMatrixImpl0.addNewNode();
      expressionMatrixImpl0.creatMatrix(243);
      expressionMatrixImpl0.creatMatrix(243);
      expressionMatrixImpl0.addNewNode();
      expressionMatrixImpl0.toString();
      expressionMatrixImpl0.getValue(243, 1);
      expressionMatrixImpl0.creatMatrix(243);
      expressionMatrixImpl0.getValue(1, (-1));
      expressionMatrixImpl0.addNewNode();
      expressionMatrixImpl0.creatMatrix(2);
      expressionMatrixImpl0.getValue((-1), 243);
      expressionMatrixImpl0.getValue(243, (-1));
      expressionMatrixImpl0.creatMatrix((-1));
      expressionMatrixImpl0.creatMatrix(1660);
      expressionMatrixImpl0.creatMatrix((-1));
      expressionMatrixImpl0.creatMatrix(0);
      expressionMatrixImpl0.setValue(123, 83, 3);
      expressionMatrixImpl0.getValue((-1), (-1));
      expressionMatrixImpl0.addNewNode();
      expressionMatrixImpl0.toString();
      expressionMatrixImpl0.setValue(2, 0, 3);
      expressionMatrixImpl0.creatMatrix((-1));
      expressionMatrixImpl0.getNumberOfElements();
      expressionMatrixImpl0.creatMatrix(65);
      expressionMatrixImpl0.outNoStandardConnections(false, (ExpressionElementMapper) null);
      expressionMatrixImpl0.getValue((-1), 83);
      expressionMatrixImpl0.getValue(65, 123);
      expressionMatrixImpl0.toString();
      int int0 = expressionMatrixImpl0.getValue((-1), 243);
      assertEquals(65, expressionMatrixImpl0.getNumberOfElements());
      assertEquals((-1), int0);
  }

  /**
  //Test case number: 15
  /*Coverage entropy=2.115142404549259
  */
  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      ExpressionMatrixImpl expressionMatrixImpl0 = new ExpressionMatrixImpl();
      expressionMatrixImpl0.addNewNode();
      expressionMatrixImpl0.creatMatrix(243);
      expressionMatrixImpl0.addNewNode();
      expressionMatrixImpl0.toString();
      expressionMatrixImpl0.getValue(243, 1);
      expressionMatrixImpl0.creatMatrix(243);
      expressionMatrixImpl0.getValue(1, (-1));
      expressionMatrixImpl0.addNewNode();
      expressionMatrixImpl0.creatMatrix(60);
      expressionMatrixImpl0.toString();
      expressionMatrixImpl0.getValue((-1), 243);
      expressionMatrixImpl0.getValue(243, (-1));
      expressionMatrixImpl0.creatMatrix(1628);
      expressionMatrixImpl0.creatMatrix(205);
      expressionMatrixImpl0.creatMatrix(0);
      expressionMatrixImpl0.setValue(123, 83, 3);
      expressionMatrixImpl0.getValue((-1), (-1));
      expressionMatrixImpl0.getNumberOfElements();
      expressionMatrixImpl0.toString();
      expressionMatrixImpl0.setValue(2, 0, 0);
      expressionMatrixImpl0.creatMatrix((-1));
      expressionMatrixImpl0.getNumberOfElements();
      expressionMatrixImpl0.creatMatrix(65);
      expressionMatrixImpl0.outNoStandardConnections(false, (ExpressionElementMapper) null);
      expressionMatrixImpl0.getValue((-1), 83);
      expressionMatrixImpl0.getValue(0, (-213));
      expressionMatrixImpl0.toString();
      assertEquals(65, expressionMatrixImpl0.getNumberOfElements());
  }

  /**
  //Test case number: 16
  /*Coverage entropy=1.6671351891467105
  */
  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      ExpressionMatrixImpl expressionMatrixImpl0 = new ExpressionMatrixImpl();
      expressionMatrixImpl0.creatMatrix(2743);
      expressionMatrixImpl0.addNewNode();
      String string0 = expressionMatrixImpl0.toString();
      expressionMatrixImpl0.getNumberOfElements();
      expressionMatrixImpl0.addNewNode();
      ExpressionElementMapperItemImpl expressionElementMapperItemImpl0 = new ExpressionElementMapperItemImpl();
      ExpressionElementMapperImpl expressionElementMapperImpl0 = new ExpressionElementMapperImpl();
      expressionElementMapperImpl0.addItem(expressionElementMapperItemImpl0);
      ExpressionElementMapperImpl expressionElementMapperImpl1 = new ExpressionElementMapperImpl();
      expressionElementMapperImpl0.clearAll();
      expressionElementMapperImpl1.getItem(7);
      ExpressionElementMapperItemImpl expressionElementMapperItemImpl1 = new ExpressionElementMapperItemImpl();
      ExpressionElementMapperItemImpl expressionElementMapperItemImpl2 = new ExpressionElementMapperItemImpl();
      expressionElementMapperItemImpl2.getSegment();
      expressionElementMapperItemImpl1.setSegment((HL7Segment) null);
      ExpressionElementMapperItemImpl expressionElementMapperItemImpl3 = new ExpressionElementMapperItemImpl();
      expressionElementMapperItemImpl3.setID(string0);
      ExpressionElementMapperImpl expressionElementMapperImpl2 = new ExpressionElementMapperImpl();
      HL7CheckerStateImpl hL7CheckerStateImpl0 = new HL7CheckerStateImpl();
      hL7CheckerStateImpl0.getActualSegment();
      expressionElementMapperItemImpl0.setSegment((HL7Segment) null);
      ExpressionElementMapperItemImpl expressionElementMapperItemImpl4 = new ExpressionElementMapperItemImpl();
      expressionElementMapperImpl2.addItem((ExpressionElementMapperItem) null);
      expressionElementMapperImpl1.addItem(expressionElementMapperItemImpl3);
      expressionElementMapperImpl2.removeItem(3);
      ExpressionElementMapperItemImpl expressionElementMapperItemImpl5 = new ExpressionElementMapperItemImpl();
      // Undeclared exception!
      expressionMatrixImpl0.toString();
  }

  /**
  //Test case number: 17
  /*Coverage entropy=1.895369135079188
  */
  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      ExpressionMatrixImpl expressionMatrixImpl0 = new ExpressionMatrixImpl();
      expressionMatrixImpl0.addNewNode();
      expressionMatrixImpl0.addNewNode();
      ExpressionElementMapperImpl expressionElementMapperImpl0 = new ExpressionElementMapperImpl();
      ExpressionElementMapperItemImpl expressionElementMapperItemImpl0 = new ExpressionElementMapperItemImpl();
      HL7MessageSegmentImpl hL7MessageSegmentImpl0 = new HL7MessageSegmentImpl();
      hL7MessageSegmentImpl0.getSegment();
      expressionElementMapperItemImpl0.setSegment((HL7Segment) null);
      expressionElementMapperImpl0.addItem(expressionElementMapperItemImpl0);
      expressionElementMapperImpl0.removeItem(2391);
      ExpressionElementMapperItemImpl expressionElementMapperItemImpl1 = new ExpressionElementMapperItemImpl();
      expressionElementMapperItemImpl1.setType(1252);
      expressionElementMapperItemImpl1.setID("");
      expressionMatrixImpl0.setValue(1, 1252, 2146);
      expressionMatrixImpl0.getValue(3557, (-3878));
      ExpressionMatrixImpl expressionMatrixImpl1 = new ExpressionMatrixImpl();
      expressionMatrixImpl1.addNewNode();
      expressionMatrixImpl1.setValue((-1), (-1), 96);
      expressionMatrixImpl0.getValue(2391, 0);
      expressionMatrixImpl0.getValue(1, 106);
      expressionMatrixImpl1.addNewNode();
      String string0 = expressionMatrixImpl1.outNoStandardConnections(false, expressionElementMapperImpl0);
      assertEquals("", string0);
  }

  /**
  //Test case number: 18
  /*Coverage entropy=1.7766234846545668
  */
  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      ExpressionMatrixImpl expressionMatrixImpl0 = new ExpressionMatrixImpl();
      ExpressionElementMapperImpl expressionElementMapperImpl0 = new ExpressionElementMapperImpl();
      MessageTracerImpl messageTracerImpl0 = new MessageTracerImpl();
      messageTracerImpl0.getMapper();
      expressionMatrixImpl0.outNoStandardConnections(true, expressionElementMapperImpl0);
      expressionMatrixImpl0.setValue((-399), 65, (-609));
      int int0 = expressionMatrixImpl0.getValue(0, (-399));
      assertEquals((-1), int0);
  }

  /**
  //Test case number: 19
  /*Coverage entropy=2.1341286000959614
  */
  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      ExpressionMatrixImpl expressionMatrixImpl0 = new ExpressionMatrixImpl();
      expressionMatrixImpl0.creatMatrix((-1));
      expressionMatrixImpl0.getNumberOfElements();
      expressionMatrixImpl0.getNumberOfNodes();
      expressionMatrixImpl0.toString();
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
  //Test case number: 20
  /*Coverage entropy=2.0192445975716997
  */
  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      ExpressionMatrixImpl expressionMatrixImpl0 = new ExpressionMatrixImpl();
      expressionMatrixImpl0.creatMatrix(111);
      expressionMatrixImpl0.creatMatrix(111);
      expressionMatrixImpl0.addNewNode();
      expressionMatrixImpl0.getNumberOfElements();
      expressionMatrixImpl0.addNewNode();
      expressionMatrixImpl0.setValue(0, 111, 0);
      expressionMatrixImpl0.creatMatrix(111);
      expressionMatrixImpl0.setValue(2146, 1848, 0);
      expressionMatrixImpl0.getValue(0, 30);
      expressionMatrixImpl0.toString();
      expressionMatrixImpl0.addNewNode();
      expressionMatrixImpl0.getNumberOfNodes();
      assertEquals(111, expressionMatrixImpl0.getNumberOfElements());
  }

  /**
  //Test case number: 21
  /*Coverage entropy=1.8667239710837769
  */
  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      ExpressionMatrixImpl expressionMatrixImpl0 = new ExpressionMatrixImpl();
      expressionMatrixImpl0.creatMatrix(243);
      expressionMatrixImpl0.addNewNode();
      expressionMatrixImpl0.toString();
      expressionMatrixImpl0.addNewNode();
      expressionMatrixImpl0.creatMatrix(243);
      expressionMatrixImpl0.addNewNode();
      expressionMatrixImpl0.addNewNode();
      expressionMatrixImpl0.toString();
      expressionMatrixImpl0.getValue(806, 243);
      expressionMatrixImpl0.getNumberOfElements();
      expressionMatrixImpl0.creatMatrix(243);
      expressionMatrixImpl0.setValue(157, 83, 17);
      expressionMatrixImpl0.addNewNode();
      expressionMatrixImpl0.addNewNode();
      expressionMatrixImpl0.setValue(0, 0, 204);
      expressionMatrixImpl0.creatMatrix((-1));
      expressionMatrixImpl0.getValue(65, 1);
      expressionMatrixImpl0.creatMatrix(65);
      expressionMatrixImpl0.toString();
      expressionMatrixImpl0.addNewNode();
      expressionMatrixImpl0.getValue(1655, 0);
      assertEquals(65, expressionMatrixImpl0.getNumberOfElements());
  }

  /**
  //Test case number: 22
  /*Coverage entropy=1.991967770860678
  */
  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      ExpressionMatrixImpl expressionMatrixImpl0 = new ExpressionMatrixImpl();
      expressionMatrixImpl0.addNewNode();
      expressionMatrixImpl0.addNewNode();
      expressionMatrixImpl0.addNewNode();
      expressionMatrixImpl0.addNewNode();
      ExpressionMatrixImpl expressionMatrixImpl1 = new ExpressionMatrixImpl();
      expressionMatrixImpl0.getValue(751, 240);
      expressionMatrixImpl1.getValue(1, 2);
      int int0 = expressionMatrixImpl0.addNewNode();
      assertEquals(4, int0);
      
      expressionMatrixImpl1.addNewNode();
      expressionMatrixImpl1.outNoStandardConnections(false, (ExpressionElementMapper) null);
      ExpressionMatrixImpl expressionMatrixImpl2 = new ExpressionMatrixImpl();
      ExpressionMatrixImpl expressionMatrixImpl3 = new ExpressionMatrixImpl();
      expressionMatrixImpl3.setValue(1, 4021, (-1));
      ExpressionMatrixImpl expressionMatrixImpl4 = new ExpressionMatrixImpl();
      expressionMatrixImpl3.getValue(236, (-1));
      expressionMatrixImpl3.setValue(0, 233, 2);
      ExpressionMatrixImpl expressionMatrixImpl5 = new ExpressionMatrixImpl();
      int int1 = expressionMatrixImpl5.getValue((-2461), 140);
      assertEquals((-1), int1);
  }

  /**
  //Test case number: 23
  /*Coverage entropy=1.597229736446844
  */
  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
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
