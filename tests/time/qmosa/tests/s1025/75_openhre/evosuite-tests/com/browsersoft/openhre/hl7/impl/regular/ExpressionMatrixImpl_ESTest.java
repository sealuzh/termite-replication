/*
 * This file was automatically generated by EvoSuite
 * Wed Dec 04 08:27:44 GMT 2019
 */

package com.browsersoft.openhre.hl7.impl.regular;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.browsersoft.openhre.hl7.api.config.HL7Configuration;
import com.browsersoft.openhre.hl7.api.config.HL7Segment;
import com.browsersoft.openhre.hl7.api.parse.HL7Checker;
import com.browsersoft.openhre.hl7.api.parse.HL7Parser;
import com.browsersoft.openhre.hl7.api.regular.ExpressionElementMapper;
import com.browsersoft.openhre.hl7.api.regular.ExpressionElementMapperItem;
import com.browsersoft.openhre.hl7.impl.config.HL7SegmentMapImpl;
import com.browsersoft.openhre.hl7.impl.parser.HL72XMLImpl;
import com.browsersoft.openhre.hl7.impl.parser.HL7CheckerImpl;
import com.browsersoft.openhre.hl7.impl.parser.HL7SAXEventGeneratorImpl;
import com.browsersoft.openhre.hl7.impl.regular.ExpressionElementMapperImpl;
import com.browsersoft.openhre.hl7.impl.regular.ExpressionElementMapperItemImpl;
import com.browsersoft.openhre.hl7.impl.regular.ExpressionMatrixImpl;
import com.browsersoft.openhre.hl7.impl.regular.MessageTracerImpl;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.testdata.EvoSuiteFile;
import org.evosuite.runtime.testdata.FileSystemHandling;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class ExpressionMatrixImpl_ESTest extends ExpressionMatrixImpl_ESTest_scaffolding {

  /**
  //Test case number: 0
  /*Coverage entropy=2.169160336350721
  */
  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      ExpressionMatrixImpl expressionMatrixImpl0 = new ExpressionMatrixImpl();
      expressionMatrixImpl0.creatMatrix(17);
      expressionMatrixImpl0.addNewNode();
      expressionMatrixImpl0.toString();
      expressionMatrixImpl0.addNewNode();
      expressionMatrixImpl0.getNumberOfNodes();
      expressionMatrixImpl0.addNewNode();
      expressionMatrixImpl0.getNumberOfNodes();
      expressionMatrixImpl0.setValue(2, 3, 0);
      expressionMatrixImpl0.setValue(3, 61, 2852);
      expressionMatrixImpl0.creatMatrix(27);
      expressionMatrixImpl0.addNewNode();
      expressionMatrixImpl0.toString();
      expressionMatrixImpl0.outNoStandardConnections(true, (ExpressionElementMapper) null);
      expressionMatrixImpl0.outNoStandardConnections(true, (ExpressionElementMapper) null);
      expressionMatrixImpl0.toString();
      expressionMatrixImpl0.getValue((-2398), 0);
      expressionMatrixImpl0.getNumberOfElements();
      expressionMatrixImpl0.outNoStandardConnections(true, (ExpressionElementMapper) null);
      expressionMatrixImpl0.setValue(0, 1, 2);
      expressionMatrixImpl0.creatMatrix(1839);
      expressionMatrixImpl0.addNewNode();
      expressionMatrixImpl0.getNumberOfElements();
      expressionMatrixImpl0.outNoStandardConnections(true, (ExpressionElementMapper) null);
      // Undeclared exception!
      expressionMatrixImpl0.toString();
  }

  /**
  //Test case number: 1
  /*Coverage entropy=2.128376144225128
  */
  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      ExpressionMatrixImpl expressionMatrixImpl0 = new ExpressionMatrixImpl();
      expressionMatrixImpl0.creatMatrix(17);
      expressionMatrixImpl0.addNewNode();
      expressionMatrixImpl0.toString();
      expressionMatrixImpl0.addNewNode();
      expressionMatrixImpl0.toString();
      expressionMatrixImpl0.getNumberOfNodes();
      expressionMatrixImpl0.addNewNode();
      expressionMatrixImpl0.getNumberOfNodes();
      expressionMatrixImpl0.setValue(2, 3, 0);
      ExpressionMatrixImpl expressionMatrixImpl1 = new ExpressionMatrixImpl();
      MessageTracerImpl messageTracerImpl0 = new MessageTracerImpl();
      MessageTracerImpl messageTracerImpl1 = new MessageTracerImpl();
      HL7SAXEventGeneratorImpl hL7SAXEventGeneratorImpl0 = new HL7SAXEventGeneratorImpl();
      hL7SAXEventGeneratorImpl0.getChecker();
      HL7CheckerImpl hL7CheckerImpl0 = new HL7CheckerImpl();
      hL7CheckerImpl0.endSegment();
      hL7CheckerImpl0.getConfiguration();
      hL7CheckerImpl0.setConfiguration((HL7Configuration) null);
      messageTracerImpl1.setHandler(hL7CheckerImpl0);
      HL7CheckerImpl hL7CheckerImpl1 = new HL7CheckerImpl();
      HL7CheckerImpl hL7CheckerImpl2 = new HL7CheckerImpl();
      hL7CheckerImpl2.endSegment();
      HL72XMLImpl hL72XMLImpl0 = new HL72XMLImpl();
      hL72XMLImpl0.endComponent("MATRIX\n-----------------------\n | A , B , C , D , E , F , G , H , I , J , K , L , M , N , O , P , Q\n0| E , E , E , E , E , E , E , E , E , E , E , E , E , E , E , E , E\n\nCONNECTIONS\n-----------------------\n", 2, true);
      HL7Checker hL7Checker0 = hL72XMLImpl0.getChecker();
      MessageTracerImpl messageTracerImpl2 = new MessageTracerImpl();
      messageTracerImpl2.setHandler(hL7Checker0);
      expressionMatrixImpl0.addNewNode();
      messageTracerImpl0.getMapper();
      expressionMatrixImpl0.outNoStandardConnections(false, (ExpressionElementMapper) null);
      assertEquals(17, expressionMatrixImpl0.getNumberOfElements());
      
      int int0 = expressionMatrixImpl1.getValue(0, 17);
      assertEquals((-1), int0);
  }

  /**
  //Test case number: 2
  /*Coverage entropy=2.2232253294386113
  */
  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      ExpressionMatrixImpl expressionMatrixImpl0 = new ExpressionMatrixImpl();
      expressionMatrixImpl0.creatMatrix(17);
      expressionMatrixImpl0.addNewNode();
      expressionMatrixImpl0.toString();
      expressionMatrixImpl0.addNewNode();
      expressionMatrixImpl0.toString();
      expressionMatrixImpl0.getNumberOfNodes();
      expressionMatrixImpl0.addNewNode();
      expressionMatrixImpl0.getNumberOfNodes();
      expressionMatrixImpl0.setValue(5651, (-388), 17);
      expressionMatrixImpl0.getValue(1, (-1));
      expressionMatrixImpl0.setValue(0, 2, 34);
      ExpressionMatrixImpl expressionMatrixImpl1 = new ExpressionMatrixImpl();
      expressionMatrixImpl0.getValue(1622, 3);
      expressionMatrixImpl1.toString();
      expressionMatrixImpl0.getNumberOfElements();
      expressionMatrixImpl0.outNoStandardConnections(false, (ExpressionElementMapper) null);
      ExpressionMatrixImpl expressionMatrixImpl2 = new ExpressionMatrixImpl();
      expressionMatrixImpl0.creatMatrix((-1));
      expressionMatrixImpl2.outNoStandardConnections(false, (ExpressionElementMapper) null);
      int int0 = expressionMatrixImpl0.getValue(4834, 5651);
      assertEquals((-1), expressionMatrixImpl0.getNumberOfElements());
      assertEquals((-1), int0);
  }

  /**
  //Test case number: 3
  /*Coverage entropy=1.8472345258263114
  */
  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      ExpressionMatrixImpl expressionMatrixImpl0 = new ExpressionMatrixImpl();
      expressionMatrixImpl0.creatMatrix(866);
      expressionMatrixImpl0.addNewNode();
      expressionMatrixImpl0.creatMatrix(1366);
      expressionMatrixImpl0.setValue(0, 0, 0);
      expressionMatrixImpl0.getValue(0, 0);
      MessageTracerImpl messageTracerImpl0 = new MessageTracerImpl();
      messageTracerImpl0.getMapper();
      expressionMatrixImpl0.getNumberOfElements();
      expressionMatrixImpl0.creatMatrix(1366);
      expressionMatrixImpl0.toString();
      assertEquals(1366, expressionMatrixImpl0.getNumberOfElements());
  }

  /**
  //Test case number: 4
  /*Coverage entropy=2.309899979649252
  */
  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      ExpressionMatrixImpl expressionMatrixImpl0 = new ExpressionMatrixImpl();
      expressionMatrixImpl0.creatMatrix(866);
      expressionMatrixImpl0.addNewNode();
      expressionMatrixImpl0.creatMatrix(1366);
      expressionMatrixImpl0.setValue(0, 0, 0);
      expressionMatrixImpl0.getValue(0, 0);
      expressionMatrixImpl0.setValue(25, 866, 25);
      ExpressionMatrixImpl expressionMatrixImpl1 = new ExpressionMatrixImpl();
      expressionMatrixImpl1.getValue(25, 0);
      expressionMatrixImpl1.toString();
      expressionMatrixImpl1.getNumberOfElements();
      expressionMatrixImpl1.outNoStandardConnections(true, (ExpressionElementMapper) null);
      ExpressionMatrixImpl expressionMatrixImpl2 = new ExpressionMatrixImpl();
      expressionMatrixImpl2.creatMatrix(25);
      expressionMatrixImpl0.outNoStandardConnections(true, (ExpressionElementMapper) null);
      assertEquals(1366, expressionMatrixImpl0.getNumberOfElements());
  }

  /**
  //Test case number: 5
  /*Coverage entropy=1.880022123484118
  */
  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      ExpressionMatrixImpl expressionMatrixImpl0 = new ExpressionMatrixImpl();
      expressionMatrixImpl0.addNewNode();
      expressionMatrixImpl0.creatMatrix((-619));
      expressionMatrixImpl0.creatMatrix(0);
      expressionMatrixImpl0.setValue(0, 0, 0);
      int int0 = expressionMatrixImpl0.getValue(0, (-619));
      assertEquals(0, expressionMatrixImpl0.getNumberOfElements());
      assertEquals((-1), int0);
  }

  /**
  //Test case number: 6
  /*Coverage entropy=2.224891604775812
  */
  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      ExpressionMatrixImpl expressionMatrixImpl0 = new ExpressionMatrixImpl();
      expressionMatrixImpl0.toString();
      expressionMatrixImpl0.creatMatrix(2887);
      expressionMatrixImpl0.getNumberOfElements();
      MessageTracerImpl messageTracerImpl0 = new MessageTracerImpl();
      messageTracerImpl0.getMapper();
      messageTracerImpl0.setMapper((ExpressionElementMapper) null);
      messageTracerImpl0.getMapper();
      expressionMatrixImpl0.outNoStandardConnections(false, (ExpressionElementMapper) null);
      expressionMatrixImpl0.getNumberOfElements();
      expressionMatrixImpl0.creatMatrix(2887);
      expressionMatrixImpl0.addNewNode();
      expressionMatrixImpl0.creatMatrix(2887);
      expressionMatrixImpl0.addNewNode();
      messageTracerImpl0.reset();
      expressionMatrixImpl0.outNoStandardConnections(false, (ExpressionElementMapper) null);
      expressionMatrixImpl0.getNumberOfElements();
      expressionMatrixImpl0.creatMatrix(3083);
      expressionMatrixImpl0.addNewNode();
      // Undeclared exception!
      expressionMatrixImpl0.addNewNode();
  }

  /**
  //Test case number: 7
  /*Coverage entropy=2.287804712411533
  */
  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      ExpressionMatrixImpl expressionMatrixImpl0 = new ExpressionMatrixImpl();
      expressionMatrixImpl0.creatMatrix(89);
      ExpressionElementMapperImpl expressionElementMapperImpl0 = new ExpressionElementMapperImpl();
      expressionElementMapperImpl0.removeItem((-51));
      expressionMatrixImpl0.outNoStandardConnections(true, expressionElementMapperImpl0);
      ExpressionElementMapperItemImpl expressionElementMapperItemImpl0 = new ExpressionElementMapperItemImpl();
      FileSystemHandling.setPermissions((EvoSuiteFile) null, true, true, true);
      expressionElementMapperImpl0.addItem(expressionElementMapperItemImpl0);
      expressionElementMapperImpl0.toString();
      expressionElementMapperImpl0.removeItem((-3358));
      FileSystemHandling.shouldThrowIOException((EvoSuiteFile) null);
      expressionElementMapperImpl0.toString();
      ExpressionElementMapperItemImpl expressionElementMapperItemImpl1 = new ExpressionElementMapperItemImpl();
      HL7SegmentMapImpl hL7SegmentMapImpl0 = new HL7SegmentMapImpl();
      expressionElementMapperItemImpl1.getSegment();
      expressionElementMapperItemImpl1.setSegment((HL7Segment) null);
      expressionElementMapperItemImpl0.toString();
      expressionElementMapperItemImpl1.toString();
      expressionElementMapperImpl0.addItem(expressionElementMapperItemImpl0);
      expressionElementMapperItemImpl0.setID("com.browsersoft.openhre.hl7.impl.regular.ExpressionElementMapperItemImpl@0000000003\n");
      expressionMatrixImpl0.setValue((-51), 0, 449);
      expressionMatrixImpl0.toString();
      expressionMatrixImpl0.outNoStandardConnections(true, expressionElementMapperImpl0);
      expressionMatrixImpl0.addNewNode();
      expressionMatrixImpl0.getValue((-1037), 0);
      expressionMatrixImpl0.getNumberOfElements();
      ExpressionElementMapperImpl expressionElementMapperImpl1 = new ExpressionElementMapperImpl();
      expressionElementMapperImpl1.removeItem((-433));
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
  /*Coverage entropy=1.9456645463488123
  */
  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      ExpressionMatrixImpl expressionMatrixImpl0 = new ExpressionMatrixImpl();
      MessageTracerImpl messageTracerImpl0 = new MessageTracerImpl();
      messageTracerImpl0.getMapper();
      expressionMatrixImpl0.outNoStandardConnections(true, (ExpressionElementMapper) null);
      ExpressionElementMapperImpl expressionElementMapperImpl0 = new ExpressionElementMapperImpl();
      expressionElementMapperImpl0.getItem(145);
      expressionElementMapperImpl0.addItem((ExpressionElementMapperItem) null);
      expressionMatrixImpl0.outNoStandardConnections(true, expressionElementMapperImpl0);
      expressionMatrixImpl0.outNoStandardConnections(true, (ExpressionElementMapper) null);
      expressionMatrixImpl0.creatMatrix(1581);
      expressionMatrixImpl0.getValue(1033, 1033);
      expressionMatrixImpl0.setValue((-1795), (-1875), (-2151));
      int int0 = expressionMatrixImpl0.getValue((-1875), 1928);
      assertEquals(1581, expressionMatrixImpl0.getNumberOfElements());
      assertEquals((-1), int0);
  }

  /**
  //Test case number: 9
  /*Coverage entropy=2.115790717573906
  */
  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      ExpressionMatrixImpl expressionMatrixImpl0 = new ExpressionMatrixImpl();
      expressionMatrixImpl0.creatMatrix(89);
      expressionMatrixImpl0.setValue(4137, 2395, 1131);
      expressionMatrixImpl0.setValue((-2434), 634, 0);
      expressionMatrixImpl0.creatMatrix(61);
      expressionMatrixImpl0.addNewNode();
      expressionMatrixImpl0.outNoStandardConnections(true, (ExpressionElementMapper) null);
      expressionMatrixImpl0.toString();
      expressionMatrixImpl0.creatMatrix((-2434));
      expressionMatrixImpl0.outNoStandardConnections(false, (ExpressionElementMapper) null);
      expressionMatrixImpl0.getValue(23, (-707));
      expressionMatrixImpl0.creatMatrix(0);
      ExpressionMatrixImpl expressionMatrixImpl1 = new ExpressionMatrixImpl();
      expressionMatrixImpl1.creatMatrix((-2434));
      expressionMatrixImpl1.toString();
      expressionMatrixImpl0.getNumberOfElements();
      expressionMatrixImpl0.getNumberOfElements();
      expressionMatrixImpl0.setValue(65, 4137, 0);
      expressionMatrixImpl0.toString();
      assertEquals(0, expressionMatrixImpl0.getNumberOfElements());
  }

  /**
  //Test case number: 10
  /*Coverage entropy=1.803345559381074
  */
  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      ExpressionMatrixImpl expressionMatrixImpl0 = new ExpressionMatrixImpl();
      expressionMatrixImpl0.creatMatrix(89);
      ExpressionElementMapperImpl expressionElementMapperImpl0 = new ExpressionElementMapperImpl();
      expressionMatrixImpl0.creatMatrix(89);
      ExpressionMatrixImpl expressionMatrixImpl1 = new ExpressionMatrixImpl();
      expressionMatrixImpl0.creatMatrix(1366);
      assertEquals(1366, expressionMatrixImpl0.getNumberOfElements());
      
      ExpressionMatrixImpl expressionMatrixImpl2 = new ExpressionMatrixImpl();
      expressionMatrixImpl1.setValue(0, 0, 89);
      ExpressionMatrixImpl expressionMatrixImpl3 = new ExpressionMatrixImpl();
      int int0 = expressionMatrixImpl3.getValue(220, 0);
      assertEquals((-1), int0);
  }

  /**
  //Test case number: 11
  /*Coverage entropy=1.7075294114572126
  */
  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      ExpressionMatrixImpl expressionMatrixImpl0 = new ExpressionMatrixImpl();
      expressionMatrixImpl0.addNewNode();
      expressionMatrixImpl0.creatMatrix(0);
      expressionMatrixImpl0.creatMatrix((-721));
      ExpressionMatrixImpl expressionMatrixImpl1 = new ExpressionMatrixImpl();
      expressionMatrixImpl1.creatMatrix(2192);
      expressionMatrixImpl1.toString();
      expressionMatrixImpl0.getNumberOfElements();
      assertEquals((-721), expressionMatrixImpl0.getNumberOfElements());
      
      ExpressionMatrixImpl expressionMatrixImpl2 = new ExpressionMatrixImpl();
      expressionMatrixImpl2.getNumberOfElements();
      ExpressionMatrixImpl expressionMatrixImpl3 = new ExpressionMatrixImpl();
      String string0 = expressionMatrixImpl2.toString();
      assertEquals("MATRIX\n-----------------------\n | \n\nCONNECTIONS\n-----------------------\n", string0);
  }

  /**
  //Test case number: 12
  /*Coverage entropy=1.8280532657376183
  */
  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      ExpressionMatrixImpl expressionMatrixImpl0 = new ExpressionMatrixImpl();
      expressionMatrixImpl0.addNewNode();
      expressionMatrixImpl0.creatMatrix(0);
      expressionMatrixImpl0.creatMatrix(0);
      expressionMatrixImpl0.creatMatrix(0);
      expressionMatrixImpl0.toString();
      expressionMatrixImpl0.getNumberOfElements();
      expressionMatrixImpl0.getNumberOfElements();
      expressionMatrixImpl0.creatMatrix((-1525));
      expressionMatrixImpl0.toString();
      expressionMatrixImpl0.getNumberOfNodes();
      assertEquals((-1525), expressionMatrixImpl0.getNumberOfElements());
  }

  /**
  //Test case number: 13
  /*Coverage entropy=1.8659654201890952
  */
  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      ExpressionMatrixImpl expressionMatrixImpl0 = new ExpressionMatrixImpl();
      expressionMatrixImpl0.addNewNode();
      expressionMatrixImpl0.creatMatrix(1366);
      expressionMatrixImpl0.creatMatrix(0);
      expressionMatrixImpl0.creatMatrix(37);
      expressionMatrixImpl0.toString();
      expressionMatrixImpl0.getNumberOfElements();
      expressionMatrixImpl0.getNumberOfElements();
      expressionMatrixImpl0.setValue(0, 423, 409);
      ExpressionMatrixImpl expressionMatrixImpl1 = new ExpressionMatrixImpl();
      int int0 = expressionMatrixImpl0.getValue((-104), 4);
      assertEquals(37, expressionMatrixImpl0.getNumberOfElements());
      assertEquals((-1), int0);
  }

  /**
  //Test case number: 14
  /*Coverage entropy=2.1004130644239485
  */
  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      ExpressionMatrixImpl expressionMatrixImpl0 = new ExpressionMatrixImpl();
      expressionMatrixImpl0.toString();
      expressionMatrixImpl0.addNewNode();
      expressionMatrixImpl0.setValue(0, (-3377), 0);
      expressionMatrixImpl0.getNumberOfElements();
      expressionMatrixImpl0.creatMatrix((-3377));
      assertEquals((-3377), expressionMatrixImpl0.getNumberOfElements());
      
      expressionMatrixImpl0.creatMatrix(0);
      expressionMatrixImpl0.toString();
      expressionMatrixImpl0.setValue((-3377), 1, 0);
      int int0 = expressionMatrixImpl0.getValue(1366, 2483);
      assertEquals((-1), int0);
  }

  /**
  //Test case number: 15
  /*Coverage entropy=1.8512196535223662
  */
  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      ExpressionMatrixImpl expressionMatrixImpl0 = new ExpressionMatrixImpl();
      expressionMatrixImpl0.addNewNode();
      expressionMatrixImpl0.creatMatrix(1366);
      expressionMatrixImpl0.creatMatrix(0);
      expressionMatrixImpl0.setValue(0, 0, 0);
      int int0 = expressionMatrixImpl0.getValue(0, 0);
      assertEquals(0, expressionMatrixImpl0.getNumberOfElements());
      assertEquals((-1), int0);
  }

  /**
  //Test case number: 16
  /*Coverage entropy=2.0164927125448684
  */
  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      ExpressionMatrixImpl expressionMatrixImpl0 = new ExpressionMatrixImpl();
      expressionMatrixImpl0.creatMatrix(2058);
      ExpressionMatrixImpl expressionMatrixImpl1 = new ExpressionMatrixImpl();
      MessageTracerImpl messageTracerImpl0 = new MessageTracerImpl();
      MessageTracerImpl messageTracerImpl1 = new MessageTracerImpl();
      HL7SAXEventGeneratorImpl hL7SAXEventGeneratorImpl0 = new HL7SAXEventGeneratorImpl();
      HL7SAXEventGeneratorImpl hL7SAXEventGeneratorImpl1 = new HL7SAXEventGeneratorImpl();
      MessageTracerImpl messageTracerImpl2 = new MessageTracerImpl();
      HL7CheckerImpl hL7CheckerImpl0 = new HL7CheckerImpl();
      HL7Parser hL7Parser0 = hL7CheckerImpl0.getParser();
      hL7CheckerImpl0.setParser(hL7Parser0);
      HL7CheckerImpl hL7CheckerImpl1 = new HL7CheckerImpl();
      hL7CheckerImpl1.emptyRepeateField();
      hL7CheckerImpl1.endSegment();
      expressionMatrixImpl0.setValue(2058, 2058, (-3498));
      expressionMatrixImpl1.getValue(0, 48);
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
  //Test case number: 17
  /*Coverage entropy=2.1654357861468654
  */
  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      ExpressionElementMapperImpl expressionElementMapperImpl0 = new ExpressionElementMapperImpl();
      ExpressionElementMapperImpl expressionElementMapperImpl1 = new ExpressionElementMapperImpl();
      expressionElementMapperImpl1.removeItem(1581);
      ExpressionMatrixImpl expressionMatrixImpl0 = new ExpressionMatrixImpl();
      expressionMatrixImpl0.outNoStandardConnections(false, expressionElementMapperImpl0);
      ExpressionElementMapperItemImpl expressionElementMapperItemImpl0 = new ExpressionElementMapperItemImpl();
      ExpressionElementMapperImpl expressionElementMapperImpl2 = new ExpressionElementMapperImpl();
      expressionElementMapperImpl2.addItem(expressionElementMapperItemImpl0);
      expressionElementMapperImpl0.toString();
      expressionElementMapperImpl0.clearAll();
      expressionElementMapperImpl2.removeItem((-1957));
      expressionElementMapperImpl1.toString();
      ExpressionElementMapperItemImpl expressionElementMapperItemImpl1 = new ExpressionElementMapperItemImpl();
      expressionElementMapperItemImpl0.toString();
      expressionElementMapperItemImpl1.toString();
      expressionElementMapperImpl1.addItem(expressionElementMapperItemImpl1);
      expressionElementMapperItemImpl0.setID("E");
      expressionMatrixImpl0.setValue(2758, 2758, (-1957));
      expressionMatrixImpl0.toString();
      expressionMatrixImpl0.outNoStandardConnections(true, expressionElementMapperImpl0);
      int int0 = expressionMatrixImpl0.addNewNode();
      int int1 = expressionMatrixImpl0.getValue(0, 40);
      assertEquals((-1), int1);
      
      String string0 = expressionMatrixImpl0.toString();
      assertEquals("MATRIX\n-----------------------\n | \n0| \n\nCONNECTIONS\n-----------------------\n", string0);
      
      int int2 = expressionMatrixImpl0.getNumberOfElements();
      assertTrue(int2 == int0);
      
      expressionElementMapperImpl1.removeItem(556);
      expressionMatrixImpl0.outNoStandardConnections(true, expressionElementMapperImpl0);
      assertEquals(0, expressionMatrixImpl0.getNumberOfElements());
  }

  /**
  //Test case number: 18
  /*Coverage entropy=2.0791834860412846
  */
  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      ExpressionMatrixImpl expressionMatrixImpl0 = new ExpressionMatrixImpl();
      expressionMatrixImpl0.creatMatrix(89);
      ExpressionElementMapperImpl expressionElementMapperImpl0 = new ExpressionElementMapperImpl();
      expressionElementMapperImpl0.removeItem((-51));
      expressionMatrixImpl0.outNoStandardConnections(true, expressionElementMapperImpl0);
      ExpressionElementMapperItemImpl expressionElementMapperItemImpl0 = new ExpressionElementMapperItemImpl();
      expressionElementMapperImpl0.addItem(expressionElementMapperItemImpl0);
      expressionElementMapperImpl0.toString();
      expressionElementMapperImpl0.clearAll();
      expressionElementMapperImpl0.removeItem(449);
      expressionElementMapperImpl0.toString();
      ExpressionElementMapperItemImpl expressionElementMapperItemImpl1 = new ExpressionElementMapperItemImpl();
      expressionElementMapperItemImpl1.setID((String) null);
      expressionElementMapperItemImpl1.toString();
      expressionElementMapperItemImpl1.toString();
      expressionElementMapperImpl0.addItem(expressionElementMapperItemImpl1);
      expressionElementMapperItemImpl1.setID("");
      expressionMatrixImpl0.setValue(0, 0, (-51));
      expressionMatrixImpl0.toString();
      expressionMatrixImpl0.outNoStandardConnections(true, expressionElementMapperImpl0);
      expressionMatrixImpl0.addNewNode();
      expressionMatrixImpl0.getValue(0, 89);
      expressionMatrixImpl0.toString();
      expressionMatrixImpl0.getNumberOfElements();
      expressionElementMapperImpl0.removeItem(89);
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
  //Test case number: 19
  /*Coverage entropy=1.1217186091313738
  */
  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      FileSystemHandling.shouldThrowIOException((EvoSuiteFile) null);
      ExpressionMatrixImpl expressionMatrixImpl0 = new ExpressionMatrixImpl();
      int int0 = expressionMatrixImpl0.getNumberOfNodes();
      int int1 = expressionMatrixImpl0.getNumberOfNodes();
      assertTrue(int1 == int0);
  }
}
