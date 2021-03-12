/*
 * This file was automatically generated by EvoSuite
 * Tue Nov 10 06:43:38 GMT 2020
 */

package com.browsersoft.openhre.hl7.impl.regular;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.browsersoft.openhre.hl7.api.parse.HL7Checker;
import com.browsersoft.openhre.hl7.api.parse.HL7SAXEventGeneratorHandler;
import com.browsersoft.openhre.hl7.api.regular.ExpressionElementMapper;
import com.browsersoft.openhre.hl7.api.regular.ExpressionElementMapperItem;
import com.browsersoft.openhre.hl7.api.regular.MessageTracerHandler;
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
  /*Coverage entropy=1.5763430714639628
  */
  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      ExpressionMatrixImpl expressionMatrixImpl0 = new ExpressionMatrixImpl();
      expressionMatrixImpl0.creatMatrix(202);
      expressionMatrixImpl0.toString();
      expressionMatrixImpl0.outNoStandardConnections(false, (ExpressionElementMapper) null);
      expressionMatrixImpl0.addNewNode();
      expressionMatrixImpl0.toString();
      expressionMatrixImpl0.addNewNode();
      expressionMatrixImpl0.addNewNode();
      expressionMatrixImpl0.addNewNode();
      expressionMatrixImpl0.toString();
      expressionMatrixImpl0.outNoStandardConnections(false, (ExpressionElementMapper) null);
      expressionMatrixImpl0.getValue(0, 0);
      expressionMatrixImpl0.setValue(3, 169, (-853));
      expressionMatrixImpl0.getNumberOfElements();
      expressionMatrixImpl0.getValue((-1), 2422);
      expressionMatrixImpl0.toString();
      expressionMatrixImpl0.toString();
      expressionMatrixImpl0.outNoStandardConnections(false, (ExpressionElementMapper) null);
      expressionMatrixImpl0.outNoStandardConnections(false, (ExpressionElementMapper) null);
  }

  /**
  //Test case number: 1
  /*Coverage entropy=1.5763430714639628
  */
  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      ExpressionMatrixImpl expressionMatrixImpl0 = new ExpressionMatrixImpl();
      expressionMatrixImpl0.creatMatrix(202);
      expressionMatrixImpl0.toString();
      expressionMatrixImpl0.outNoStandardConnections(false, (ExpressionElementMapper) null);
      expressionMatrixImpl0.addNewNode();
      expressionMatrixImpl0.toString();
      expressionMatrixImpl0.toString();
      expressionMatrixImpl0.outNoStandardConnections(false, (ExpressionElementMapper) null);
      expressionMatrixImpl0.addNewNode();
      expressionMatrixImpl0.setValue(0, 178, 0);
      expressionMatrixImpl0.getNumberOfElements();
      expressionMatrixImpl0.getValue((-1724), 0);
      expressionMatrixImpl0.toString();
      expressionMatrixImpl0.getNumberOfElements();
      expressionMatrixImpl0.addNewNode();
      expressionMatrixImpl0.outNoStandardConnections(true, (ExpressionElementMapper) null);
  }

  /**
  //Test case number: 2
  /*Coverage entropy=1.5514653236524114
  */
  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      ExpressionMatrixImpl expressionMatrixImpl0 = new ExpressionMatrixImpl();
      expressionMatrixImpl0.creatMatrix(202);
      expressionMatrixImpl0.toString();
      expressionMatrixImpl0.outNoStandardConnections(false, (ExpressionElementMapper) null);
      expressionMatrixImpl0.addNewNode();
      expressionMatrixImpl0.toString();
      expressionMatrixImpl0.addNewNode();
      expressionMatrixImpl0.toString();
      expressionMatrixImpl0.outNoStandardConnections(false, (ExpressionElementMapper) null);
      expressionMatrixImpl0.creatMatrix(202);
      expressionMatrixImpl0.addNewNode();
      expressionMatrixImpl0.setValue(0, 178, 0);
      expressionMatrixImpl0.getNumberOfElements();
      expressionMatrixImpl0.getValue(2, 0);
      expressionMatrixImpl0.toString();
      expressionMatrixImpl0.getNumberOfElements();
      expressionMatrixImpl0.addNewNode();
      expressionMatrixImpl0.outNoStandardConnections(true, (ExpressionElementMapper) null);
      expressionMatrixImpl0.outNoStandardConnections(false, (ExpressionElementMapper) null);
      MessageTracerImpl messageTracerImpl0 = new MessageTracerImpl();
      FileSystemHandling.setPermissions((EvoSuiteFile) null, false, true, true);
      messageTracerImpl0.getMapper();
      expressionMatrixImpl0.outNoStandardConnections(true, (ExpressionElementMapper) null);
      expressionMatrixImpl0.getValue(0, 2);
  }

  /**
  //Test case number: 3
  /*Coverage entropy=1.5779980592562344
  */
  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      ExpressionMatrixImpl expressionMatrixImpl0 = new ExpressionMatrixImpl();
      expressionMatrixImpl0.creatMatrix(202);
      expressionMatrixImpl0.outNoStandardConnections(false, (ExpressionElementMapper) null);
      expressionMatrixImpl0.addNewNode();
      expressionMatrixImpl0.toString();
      expressionMatrixImpl0.addNewNode();
      expressionMatrixImpl0.addNewNode();
      expressionMatrixImpl0.toString();
      expressionMatrixImpl0.outNoStandardConnections(true, (ExpressionElementMapper) null);
      expressionMatrixImpl0.getValue(202, 0);
      expressionMatrixImpl0.setValue(0, 0, 4089);
      expressionMatrixImpl0.getNumberOfElements();
      expressionMatrixImpl0.getNumberOfElements();
      expressionMatrixImpl0.toString();
      expressionMatrixImpl0.outNoStandardConnections(true, (ExpressionElementMapper) null);
      expressionMatrixImpl0.getValue(1184, 1323);
  }

  /**
  //Test case number: 4
  /*Coverage entropy=1.5875482667575653
  */
  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      ExpressionMatrixImpl expressionMatrixImpl0 = new ExpressionMatrixImpl();
      expressionMatrixImpl0.creatMatrix(202);
      expressionMatrixImpl0.outNoStandardConnections(false, (ExpressionElementMapper) null);
      expressionMatrixImpl0.addNewNode();
      expressionMatrixImpl0.toString();
      expressionMatrixImpl0.addNewNode();
      expressionMatrixImpl0.toString();
      expressionMatrixImpl0.outNoStandardConnections(false, (ExpressionElementMapper) null);
      expressionMatrixImpl0.getValue(0, 202);
      expressionMatrixImpl0.setValue(1, 0, 0);
      expressionMatrixImpl0.getNumberOfElements();
      expressionMatrixImpl0.getValue(215, 227);
      expressionMatrixImpl0.toString();
      expressionMatrixImpl0.outNoStandardConnections(false, (ExpressionElementMapper) null);
      MessageTracerImpl messageTracerImpl0 = new MessageTracerImpl();
      messageTracerImpl0.getMapper();
      expressionMatrixImpl0.outNoStandardConnections(false, (ExpressionElementMapper) null);
      expressionMatrixImpl0.getValue(0, 95);
  }

  /**
  //Test case number: 5
  /*Coverage entropy=1.5679540060061348
  */
  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      ExpressionMatrixImpl expressionMatrixImpl0 = new ExpressionMatrixImpl();
      expressionMatrixImpl0.creatMatrix(202);
      expressionMatrixImpl0.outNoStandardConnections(false, (ExpressionElementMapper) null);
      expressionMatrixImpl0.addNewNode();
      expressionMatrixImpl0.toString();
      expressionMatrixImpl0.addNewNode();
      expressionMatrixImpl0.addNewNode();
      expressionMatrixImpl0.addNewNode();
      expressionMatrixImpl0.toString();
      expressionMatrixImpl0.outNoStandardConnections(false, (ExpressionElementMapper) null);
      expressionMatrixImpl0.getValue(0, 0);
      expressionMatrixImpl0.setValue(2, 178, 3);
      expressionMatrixImpl0.getNumberOfElements();
      expressionMatrixImpl0.getValue((-1724), 0);
      expressionMatrixImpl0.toString();
      expressionMatrixImpl0.toString();
      expressionMatrixImpl0.outNoStandardConnections(false, (ExpressionElementMapper) null);
      expressionMatrixImpl0.outNoStandardConnections(true, (ExpressionElementMapper) null);
  }

  /**
  //Test case number: 6
  /*Coverage entropy=1.5679540060061348
  */
  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      ExpressionMatrixImpl expressionMatrixImpl0 = new ExpressionMatrixImpl();
      expressionMatrixImpl0.creatMatrix(202);
      ExpressionElementMapper expressionElementMapper0 = null;
      expressionMatrixImpl0.outNoStandardConnections(false, (ExpressionElementMapper) null);
      expressionMatrixImpl0.addNewNode();
      expressionMatrixImpl0.addNewNode();
      expressionMatrixImpl0.toString();
      expressionMatrixImpl0.addNewNode();
      expressionMatrixImpl0.addNewNode();
      expressionMatrixImpl0.addNewNode();
      expressionMatrixImpl0.toString();
      expressionMatrixImpl0.outNoStandardConnections(false, (ExpressionElementMapper) null);
      expressionMatrixImpl0.getValue(0, 0);
      expressionMatrixImpl0.setValue(3, 178, 4);
      expressionMatrixImpl0.getNumberOfElements();
      expressionMatrixImpl0.getValue((-1724), 0);
      expressionMatrixImpl0.toString();
      expressionMatrixImpl0.toString();
      expressionMatrixImpl0.outNoStandardConnections(false, (ExpressionElementMapper) null);
      expressionMatrixImpl0.outNoStandardConnections(true, (ExpressionElementMapper) null);
      // Undeclared exception!
      expressionMatrixImpl0.outNoStandardConnections(true, (ExpressionElementMapper) null);
  }

  /**
  //Test case number: 7
  /*Coverage entropy=1.5741750299626092
  */
  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      ExpressionMatrixImpl expressionMatrixImpl0 = new ExpressionMatrixImpl();
      expressionMatrixImpl0.creatMatrix(202);
      expressionMatrixImpl0.outNoStandardConnections(false, (ExpressionElementMapper) null);
      expressionMatrixImpl0.getValue(202, 202);
      expressionMatrixImpl0.toString();
      expressionMatrixImpl0.addNewNode();
      expressionMatrixImpl0.addNewNode();
      expressionMatrixImpl0.toString();
      expressionMatrixImpl0.outNoStandardConnections(false, (ExpressionElementMapper) null);
      expressionMatrixImpl0.getValue((-1), 0);
      expressionMatrixImpl0.setValue(1, 178, 0);
      expressionMatrixImpl0.getNumberOfElements();
      expressionMatrixImpl0.getValue((-1), (-1560));
      expressionMatrixImpl0.toString();
      expressionMatrixImpl0.toString();
      expressionMatrixImpl0.outNoStandardConnections(false, (ExpressionElementMapper) null);
      expressionMatrixImpl0.outNoStandardConnections(true, (ExpressionElementMapper) null);
      expressionMatrixImpl0.outNoStandardConnections(false, (ExpressionElementMapper) null);
      ExpressionMatrixImpl expressionMatrixImpl1 = new ExpressionMatrixImpl();
      expressionMatrixImpl0.outNoStandardConnections(false, (ExpressionElementMapper) null);
      expressionMatrixImpl1.outNoStandardConnections(true, (ExpressionElementMapper) null);
      expressionMatrixImpl1.outNoStandardConnections(false, (ExpressionElementMapper) null);
      ExpressionElementMapperImpl expressionElementMapperImpl0 = new ExpressionElementMapperImpl();
      expressionElementMapperImpl0.clearAll();
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
  /*Coverage entropy=1.1671601704107626
  */
  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      ExpressionMatrixImpl expressionMatrixImpl0 = new ExpressionMatrixImpl();
      expressionMatrixImpl0.creatMatrix(3457);
      boolean boolean0 = false;
      ExpressionElementMapper expressionElementMapper0 = null;
      expressionMatrixImpl0.outNoStandardConnections(false, (ExpressionElementMapper) null);
      expressionMatrixImpl0.addNewNode();
      ExpressionElementMapper expressionElementMapper1 = null;
      expressionMatrixImpl0.toString();
      expressionMatrixImpl0.addNewNode();
      // Undeclared exception!
      expressionMatrixImpl0.addNewNode();
  }

  /**
  //Test case number: 9
  /*Coverage entropy=1.8343719702816237
  */
  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      ExpressionMatrixImpl expressionMatrixImpl0 = new ExpressionMatrixImpl();
      MessageTracerImpl messageTracerImpl0 = new MessageTracerImpl();
      messageTracerImpl0.getHandler();
      messageTracerImpl0.setHandler((MessageTracerHandler) null);
      HL7SAXEventGeneratorImpl hL7SAXEventGeneratorImpl0 = new HL7SAXEventGeneratorImpl();
      HL7SAXEventGeneratorImpl hL7SAXEventGeneratorImpl1 = new HL7SAXEventGeneratorImpl();
      hL7SAXEventGeneratorImpl0.beginField("<A", (-2568), true);
      HL7Checker hL7Checker0 = hL7SAXEventGeneratorImpl1.getChecker();
      MessageTracerImpl messageTracerImpl1 = new MessageTracerImpl();
      messageTracerImpl0.setHandler(hL7Checker0);
      messageTracerImpl0.getMapper();
      expressionMatrixImpl0.outNoStandardConnections(true, (ExpressionElementMapper) null);
      expressionMatrixImpl0.creatMatrix((-2249));
      expressionMatrixImpl0.toString();
      expressionMatrixImpl0.getValue(825, 7);
      expressionMatrixImpl0.getValue(209, 825);
      expressionMatrixImpl0.outNoStandardConnections(true, (ExpressionElementMapper) null);
      expressionMatrixImpl0.setValue((-764), (-1), 2628);
      expressionMatrixImpl0.getNumberOfElements();
      int int0 = expressionMatrixImpl0.getValue(91, (-2249));
      assertEquals((-2249), expressionMatrixImpl0.getNumberOfElements());
      assertEquals((-1), int0);
  }

  /**
  //Test case number: 10
  /*Coverage entropy=1.8200759753606213
  */
  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      ExpressionMatrixImpl expressionMatrixImpl0 = new ExpressionMatrixImpl();
      ExpressionElementMapperImpl expressionElementMapperImpl0 = new ExpressionElementMapperImpl();
      expressionElementMapperImpl0.getItem((-999));
      expressionElementMapperImpl0.addItem((ExpressionElementMapperItem) null);
      ExpressionElementMapperItemImpl expressionElementMapperItemImpl0 = new ExpressionElementMapperItemImpl();
      expressionElementMapperItemImpl0.setType(1);
      expressionElementMapperImpl0.setItem((-999), expressionElementMapperItemImpl0);
      expressionElementMapperImpl0.removeItem(65);
      expressionMatrixImpl0.outNoStandardConnections(false, expressionElementMapperImpl0);
      expressionMatrixImpl0.setValue(1, 1, 1);
      expressionMatrixImpl0.toString();
      expressionMatrixImpl0.toString();
      expressionMatrixImpl0.toString();
      expressionMatrixImpl0.addNewNode();
      expressionMatrixImpl0.getValue((-999), 1088);
      expressionMatrixImpl0.creatMatrix((-3797));
      expressionMatrixImpl0.outNoStandardConnections(true, expressionElementMapperImpl0);
      int int0 = expressionMatrixImpl0.getValue((-999), (-1));
      assertEquals((-3797), expressionMatrixImpl0.getNumberOfElements());
      assertEquals((-1), int0);
  }

  /**
  //Test case number: 11
  /*Coverage entropy=1.5972429346552264
  */
  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      ExpressionMatrixImpl expressionMatrixImpl0 = new ExpressionMatrixImpl();
      expressionMatrixImpl0.creatMatrix(202);
      expressionMatrixImpl0.outNoStandardConnections(false, (ExpressionElementMapper) null);
      expressionMatrixImpl0.addNewNode();
      expressionMatrixImpl0.toString();
      expressionMatrixImpl0.addNewNode();
      expressionMatrixImpl0.addNewNode();
      expressionMatrixImpl0.addNewNode();
      expressionMatrixImpl0.toString();
      expressionMatrixImpl0.outNoStandardConnections(false, (ExpressionElementMapper) null);
      expressionMatrixImpl0.getValue((-1268), (-1268));
      expressionMatrixImpl0.setValue(170, (-1268), 1);
      expressionMatrixImpl0.getNumberOfElements();
      expressionMatrixImpl0.getValue(202, 1079);
      expressionMatrixImpl0.toString();
      expressionMatrixImpl0.toString();
      expressionMatrixImpl0.outNoStandardConnections(false, (ExpressionElementMapper) null);
      MessageTracerImpl messageTracerImpl0 = new MessageTracerImpl();
      messageTracerImpl0.getMapper();
      expressionMatrixImpl0.outNoStandardConnections(true, (ExpressionElementMapper) null);
      expressionMatrixImpl0.getValue(2, 855);
      messageTracerImpl0.getMapper();
      expressionMatrixImpl0.outNoStandardConnections(false, (ExpressionElementMapper) null);
      // Undeclared exception!
      expressionMatrixImpl0.toString();
  }

  /**
  //Test case number: 12
  /*Coverage entropy=0.9502705392332347
  */
  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      FileSystemHandling.shouldThrowIOException((EvoSuiteFile) null);
      byte[] byteArray0 = new byte[5];
      byteArray0[0] = (byte)47;
      byteArray0[1] = (byte)29;
      byteArray0[2] = (byte)92;
      FileSystemHandling.appendStringToFile((EvoSuiteFile) null, "krD[7ph,>lu]iJ2C/u");
      byteArray0[0] = (byte) (-1);
      byteArray0[4] = (byte) (-90);
      FileSystemHandling.shouldAllThrowIOExceptions();
      FileSystemHandling fileSystemHandling0 = new FileSystemHandling();
      ExpressionMatrixImpl expressionMatrixImpl0 = new ExpressionMatrixImpl();
      expressionMatrixImpl0.creatMatrix((byte) (-1));
      expressionMatrixImpl0.toString();
      expressionMatrixImpl0.toString();
      assertEquals((-1), expressionMatrixImpl0.getNumberOfElements());
  }

  /**
  //Test case number: 13
  /*Coverage entropy=0.8675632284814612
  */
  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      MessageTracerImpl messageTracerImpl0 = new MessageTracerImpl();
      HL7SAXEventGeneratorImpl hL7SAXEventGeneratorImpl0 = new HL7SAXEventGeneratorImpl();
      HL7SAXEventGeneratorImpl hL7SAXEventGeneratorImpl1 = new HL7SAXEventGeneratorImpl();
      hL7SAXEventGeneratorImpl0.getHandler();
      HL7SAXEventGeneratorImpl hL7SAXEventGeneratorImpl2 = new HL7SAXEventGeneratorImpl();
      HL7SAXEventGeneratorImpl hL7SAXEventGeneratorImpl3 = new HL7SAXEventGeneratorImpl();
      hL7SAXEventGeneratorImpl0.getHandler();
      HL7SAXEventGeneratorImpl hL7SAXEventGeneratorImpl4 = new HL7SAXEventGeneratorImpl();
      HL7SAXEventGeneratorImpl hL7SAXEventGeneratorImpl5 = new HL7SAXEventGeneratorImpl();
      FileSystemHandling.shouldAllThrowIOExceptions();
      hL7SAXEventGeneratorImpl5.getHandler();
      hL7SAXEventGeneratorImpl1.getHandler();
      HL7SAXEventGeneratorImpl hL7SAXEventGeneratorImpl6 = new HL7SAXEventGeneratorImpl();
      HL7SAXEventGeneratorImpl hL7SAXEventGeneratorImpl7 = new HL7SAXEventGeneratorImpl();
      HL7SAXEventGeneratorImpl hL7SAXEventGeneratorImpl8 = new HL7SAXEventGeneratorImpl();
      hL7SAXEventGeneratorImpl2.getHandler();
      hL7SAXEventGeneratorImpl6.getHandler();
      HL7SAXEventGeneratorImpl hL7SAXEventGeneratorImpl9 = new HL7SAXEventGeneratorImpl();
      hL7SAXEventGeneratorImpl0.setHandler((HL7SAXEventGeneratorHandler) null);
      HL7SAXEventGeneratorImpl hL7SAXEventGeneratorImpl10 = new HL7SAXEventGeneratorImpl();
      hL7SAXEventGeneratorImpl8.getHandler();
      HL7SAXEventGeneratorImpl hL7SAXEventGeneratorImpl11 = new HL7SAXEventGeneratorImpl();
      hL7SAXEventGeneratorImpl11.setIDFile("vx");
      hL7SAXEventGeneratorImpl10.getHandler();
      hL7SAXEventGeneratorImpl1.setHandler((HL7SAXEventGeneratorHandler) null);
      HL7SAXEventGeneratorImpl hL7SAXEventGeneratorImpl12 = new HL7SAXEventGeneratorImpl();
      HL72XMLImpl hL72XMLImpl0 = new HL72XMLImpl();
      HL72XMLImpl hL72XMLImpl1 = new HL72XMLImpl();
      HL7SAXEventGeneratorImpl hL7SAXEventGeneratorImpl13 = new HL7SAXEventGeneratorImpl();
      hL7SAXEventGeneratorImpl2.getHandler();
      hL7SAXEventGeneratorImpl6.setHandler((HL7SAXEventGeneratorHandler) null);
      ExpressionMatrixImpl expressionMatrixImpl0 = new ExpressionMatrixImpl();
      int int0 = expressionMatrixImpl0.addNewNode();
      assertEquals(0, int0);
      
      int int1 = expressionMatrixImpl0.getValue(0, 0);
      assertEquals((-1), int1);
  }

  /**
  //Test case number: 14
  /*Coverage entropy=1.4708084763221112
  */
  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      ExpressionMatrixImpl expressionMatrixImpl0 = new ExpressionMatrixImpl();
      expressionMatrixImpl0.creatMatrix(202);
      MessageTracerImpl messageTracerImpl0 = new MessageTracerImpl();
      messageTracerImpl0.getHandler();
      messageTracerImpl0.setHandler((MessageTracerHandler) null);
      HL7SAXEventGeneratorImpl hL7SAXEventGeneratorImpl0 = new HL7SAXEventGeneratorImpl();
      hL7SAXEventGeneratorImpl0.beginField(" , ", 202, true);
      HL7CheckerImpl hL7CheckerImpl0 = new HL7CheckerImpl();
      expressionMatrixImpl0.getValue(202, 3306);
      expressionMatrixImpl0.addNewNode();
      expressionMatrixImpl0.setValue(0, 4304, 4304);
      assertEquals(202, expressionMatrixImpl0.getNumberOfElements());
  }

  /**
  //Test case number: 15
  /*Coverage entropy=0.6365141682948128
  */
  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      ExpressionMatrixImpl expressionMatrixImpl0 = new ExpressionMatrixImpl();
      expressionMatrixImpl0.setValue(0, 0, 0);
      assertEquals(0, expressionMatrixImpl0.getNumberOfNodes());
  }

  /**
  //Test case number: 16
  /*Coverage entropy=1.0027182645175161
  */
  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      ExpressionMatrixImpl expressionMatrixImpl0 = new ExpressionMatrixImpl();
      expressionMatrixImpl0.addNewNode();
      int int0 = expressionMatrixImpl0.addNewNode();
      assertEquals(1, int0);
      
      FileSystemHandling.setPermissions((EvoSuiteFile) null, false, false, false);
      expressionMatrixImpl0.getValue((-866), 21);
      ExpressionMatrixImpl expressionMatrixImpl1 = new ExpressionMatrixImpl();
      expressionMatrixImpl1.addNewNode();
      expressionMatrixImpl0.setValue((-866), 9994, 9994);
      expressionMatrixImpl1.getValue(0, (-866));
      int int1 = expressionMatrixImpl1.getValue(0, 1645);
      assertEquals((-1), int1);
  }

  /**
  //Test case number: 17
  /*Coverage entropy=1.3862943611198906
  */
  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      MessageTracerImpl messageTracerImpl0 = new MessageTracerImpl();
      messageTracerImpl0.getHandler();
      messageTracerImpl0.setHandler((MessageTracerHandler) null);
      HL7SAXEventGeneratorImpl hL7SAXEventGeneratorImpl0 = new HL7SAXEventGeneratorImpl();
      MessageTracerImpl messageTracerImpl1 = new MessageTracerImpl();
      ExpressionMatrixImpl expressionMatrixImpl0 = new ExpressionMatrixImpl();
      int int0 = expressionMatrixImpl0.getNumberOfElements();
      int int1 = expressionMatrixImpl0.addNewNode();
      assertTrue(int1 == int0);
      
      int int2 = expressionMatrixImpl0.getValue((-451), 0);
      assertEquals((-1), int2);
      
      expressionMatrixImpl0.setValue(0, 0, 457);
      assertEquals(0, expressionMatrixImpl0.getNumberOfElements());
  }

  /**
  //Test case number: 18
  /*Coverage entropy=1.1671601704107626
  */
  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      MessageTracerImpl messageTracerImpl0 = new MessageTracerImpl();
      HL7SAXEventGeneratorImpl hL7SAXEventGeneratorImpl0 = new HL7SAXEventGeneratorImpl();
      HL7SAXEventGeneratorImpl hL7SAXEventGeneratorImpl1 = new HL7SAXEventGeneratorImpl();
      hL7SAXEventGeneratorImpl1.getHandler();
      HL7SAXEventGeneratorImpl hL7SAXEventGeneratorImpl2 = new HL7SAXEventGeneratorImpl();
      hL7SAXEventGeneratorImpl2.getHandler();
      HL7SAXEventGeneratorImpl hL7SAXEventGeneratorImpl3 = new HL7SAXEventGeneratorImpl();
      HL7SAXEventGeneratorImpl hL7SAXEventGeneratorImpl4 = new HL7SAXEventGeneratorImpl();
      hL7SAXEventGeneratorImpl4.getHandler();
      hL7SAXEventGeneratorImpl4.getHandler();
      HL7SAXEventGeneratorImpl hL7SAXEventGeneratorImpl5 = new HL7SAXEventGeneratorImpl();
      HL7SAXEventGeneratorImpl hL7SAXEventGeneratorImpl6 = new HL7SAXEventGeneratorImpl();
      HL7SAXEventGeneratorImpl hL7SAXEventGeneratorImpl7 = new HL7SAXEventGeneratorImpl();
      hL7SAXEventGeneratorImpl7.getHandler();
      hL7SAXEventGeneratorImpl4.getHandler();
      HL7SAXEventGeneratorImpl hL7SAXEventGeneratorImpl8 = new HL7SAXEventGeneratorImpl();
      hL7SAXEventGeneratorImpl8.setHandler((HL7SAXEventGeneratorHandler) null);
      HL7SAXEventGeneratorImpl hL7SAXEventGeneratorImpl9 = new HL7SAXEventGeneratorImpl();
      hL7SAXEventGeneratorImpl4.getHandler();
      hL7SAXEventGeneratorImpl0.setHandler((HL7SAXEventGeneratorHandler) null);
      HL72XMLImpl hL72XMLImpl0 = new HL72XMLImpl();
      hL72XMLImpl0.getChecker();
      HL7SAXEventGeneratorImpl hL7SAXEventGeneratorImpl10 = new HL7SAXEventGeneratorImpl();
      HL7SAXEventGeneratorImpl hL7SAXEventGeneratorImpl11 = new HL7SAXEventGeneratorImpl();
      hL72XMLImpl0.getChecker();
      HL7SAXEventGeneratorImpl hL7SAXEventGeneratorImpl12 = new HL7SAXEventGeneratorImpl();
      hL7SAXEventGeneratorImpl3.getHandler();
      hL7SAXEventGeneratorImpl7.getHandler();
      hL7SAXEventGeneratorImpl8.setHandler((HL7SAXEventGeneratorHandler) null);
      FileSystemHandling fileSystemHandling0 = new FileSystemHandling();
      ExpressionMatrixImpl expressionMatrixImpl0 = new ExpressionMatrixImpl();
      expressionMatrixImpl0.creatMatrix(1672);
      expressionMatrixImpl0.toString();
      expressionMatrixImpl0.addNewNode();
      expressionMatrixImpl0.toString();
      expressionMatrixImpl0.getNumberOfNodes();
      assertEquals(1672, expressionMatrixImpl0.getNumberOfElements());
  }

  /**
  //Test case number: 19
  /*Coverage entropy=1.6464067065634522
  */
  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      ExpressionMatrixImpl expressionMatrixImpl0 = new ExpressionMatrixImpl();
      expressionMatrixImpl0.creatMatrix(202);
      expressionMatrixImpl0.outNoStandardConnections(false, (ExpressionElementMapper) null);
      expressionMatrixImpl0.getValue(202, 202);
      expressionMatrixImpl0.toString();
      expressionMatrixImpl0.addNewNode();
      expressionMatrixImpl0.toString();
      expressionMatrixImpl0.outNoStandardConnections(false, (ExpressionElementMapper) null);
      expressionMatrixImpl0.getValue((-1), 0);
      expressionMatrixImpl0.setValue(0, 178, (-1));
      expressionMatrixImpl0.getNumberOfElements();
      expressionMatrixImpl0.getValue((-1724), 0);
      expressionMatrixImpl0.toString();
      ExpressionElementMapperImpl expressionElementMapperImpl0 = new ExpressionElementMapperImpl();
      ExpressionElementMapperImpl expressionElementMapperImpl1 = new ExpressionElementMapperImpl();
      ExpressionElementMapperItemImpl expressionElementMapperItemImpl0 = new ExpressionElementMapperItemImpl();
      expressionElementMapperImpl1.addItem(expressionElementMapperItemImpl0);
      expressionElementMapperImpl1.toString();
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
  //Test case number: 20
  /*Coverage entropy=1.5679540060061348
  */
  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      ExpressionMatrixImpl expressionMatrixImpl0 = new ExpressionMatrixImpl();
      expressionMatrixImpl0.creatMatrix(202);
      expressionMatrixImpl0.outNoStandardConnections(false, (ExpressionElementMapper) null);
      expressionMatrixImpl0.addNewNode();
      expressionMatrixImpl0.toString();
      expressionMatrixImpl0.addNewNode();
      expressionMatrixImpl0.addNewNode();
      expressionMatrixImpl0.toString();
      expressionMatrixImpl0.outNoStandardConnections(false, (ExpressionElementMapper) null);
      expressionMatrixImpl0.getValue(0, 0);
      expressionMatrixImpl0.setValue(2, 178, 1);
      expressionMatrixImpl0.getNumberOfElements();
      expressionMatrixImpl0.getValue((-1724), 0);
      expressionMatrixImpl0.toString();
      expressionMatrixImpl0.toString();
      expressionMatrixImpl0.outNoStandardConnections(false, (ExpressionElementMapper) null);
      expressionMatrixImpl0.outNoStandardConnections(true, (ExpressionElementMapper) null);
      assertEquals(202, expressionMatrixImpl0.getNumberOfElements());
  }

  /**
  //Test case number: 21
  /*Coverage entropy=1.4750763110546947
  */
  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      MessageTracerImpl messageTracerImpl0 = new MessageTracerImpl();
      messageTracerImpl0.getHandler();
      messageTracerImpl0.setHandler((MessageTracerHandler) null);
      HL7SAXEventGeneratorImpl hL7SAXEventGeneratorImpl0 = new HL7SAXEventGeneratorImpl();
      MessageTracerImpl messageTracerImpl1 = new MessageTracerImpl();
      ExpressionMatrixImpl expressionMatrixImpl0 = new ExpressionMatrixImpl();
      int int0 = expressionMatrixImpl0.getNumberOfElements();
      int int1 = expressionMatrixImpl0.addNewNode();
      assertTrue(int1 == int0);
      
      int int2 = expressionMatrixImpl0.getValue((-451), (-186));
      assertEquals((-1), int2);
      
      expressionMatrixImpl0.setValue(0, (-186), 457);
      assertEquals(0, expressionMatrixImpl0.getNumberOfElements());
  }

  /**
  //Test case number: 22
  /*Coverage entropy=1.3321790402101223
  */
  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      ExpressionMatrixImpl expressionMatrixImpl0 = new ExpressionMatrixImpl();
      expressionMatrixImpl0.creatMatrix((-2701));
      MessageTracerImpl messageTracerImpl0 = new MessageTracerImpl();
      messageTracerImpl0.getHandler();
      MessageTracerImpl messageTracerImpl1 = new MessageTracerImpl();
      messageTracerImpl1.setHandler((MessageTracerHandler) null);
      HL7SAXEventGeneratorImpl hL7SAXEventGeneratorImpl0 = new HL7SAXEventGeneratorImpl();
      hL7SAXEventGeneratorImpl0.beginField(" , ", (-2115), true);
      HL7CheckerImpl hL7CheckerImpl0 = new HL7CheckerImpl();
      expressionMatrixImpl0.getValue(202, 74);
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
  /*Coverage entropy=0.6365141682948128
  */
  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      MessageTracerImpl messageTracerImpl0 = new MessageTracerImpl();
      HL7SAXEventGeneratorImpl hL7SAXEventGeneratorImpl0 = new HL7SAXEventGeneratorImpl();
      hL7SAXEventGeneratorImpl0.getHandler();
      HL7SAXEventGeneratorImpl hL7SAXEventGeneratorImpl1 = new HL7SAXEventGeneratorImpl();
      hL7SAXEventGeneratorImpl1.setHandler((HL7SAXEventGeneratorHandler) null);
      ExpressionMatrixImpl expressionMatrixImpl0 = new ExpressionMatrixImpl();
      expressionMatrixImpl0.setValue(93, 189, 118);
      assertEquals(0, expressionMatrixImpl0.getNumberOfElements());
  }

  /**
  //Test case number: 24
  /*Coverage entropy=1.0397207708399179
  */
  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      MessageTracerImpl messageTracerImpl0 = new MessageTracerImpl();
      HL7SAXEventGeneratorImpl hL7SAXEventGeneratorImpl0 = new HL7SAXEventGeneratorImpl();
      HL7SAXEventGeneratorImpl hL7SAXEventGeneratorImpl1 = new HL7SAXEventGeneratorImpl();
      hL7SAXEventGeneratorImpl1.getHandler();
      hL7SAXEventGeneratorImpl1.getHandler();
      hL7SAXEventGeneratorImpl1.getHandler();
      HL7SAXEventGeneratorImpl hL7SAXEventGeneratorImpl2 = new HL7SAXEventGeneratorImpl();
      hL7SAXEventGeneratorImpl2.setHandler((HL7SAXEventGeneratorHandler) null);
      HL72XMLImpl hL72XMLImpl0 = new HL72XMLImpl();
      HL7Checker hL7Checker0 = hL72XMLImpl0.getChecker();
      HL7SAXEventGeneratorImpl hL7SAXEventGeneratorImpl3 = new HL7SAXEventGeneratorImpl();
      hL7SAXEventGeneratorImpl3.setChecker(hL7Checker0);
      HL7SAXEventGeneratorImpl hL7SAXEventGeneratorImpl4 = new HL7SAXEventGeneratorImpl();
      hL7SAXEventGeneratorImpl0.beginField("kX%GIpH*ng", 3202, true);
      HL7SAXEventGeneratorImpl hL7SAXEventGeneratorImpl5 = new HL7SAXEventGeneratorImpl();
      hL7SAXEventGeneratorImpl5.getChecker();
      MessageTracerImpl messageTracerImpl1 = new MessageTracerImpl();
      messageTracerImpl0.setHandler(hL7Checker0);
      messageTracerImpl0.getMapper();
      ExpressionMatrixImpl expressionMatrixImpl0 = new ExpressionMatrixImpl();
      expressionMatrixImpl0.getValue(3202, (-275));
      expressionMatrixImpl0.getValue(3076, (-955));
      expressionMatrixImpl0.setValue((-1), 3071, 3210);
      assertEquals(0, expressionMatrixImpl0.getNumberOfElements());
  }

  /**
  //Test case number: 25
  /*Coverage entropy=0.6365141682948128
  */
  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      ExpressionMatrixImpl expressionMatrixImpl0 = new ExpressionMatrixImpl();
      FileSystemHandling.createFolder((EvoSuiteFile) null);
      int int0 = expressionMatrixImpl0.getValue(0, 196);
      assertEquals((-1), int0);
  }

  /**
  //Test case number: 26
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      byte[] byteArray0 = new byte[5];
      byteArray0[0] = (byte)35;
      byteArray0[1] = (byte)29;
      byteArray0[2] = (byte)92;
      byteArray0[3] = (byte) (-1);
      byteArray0[4] = (byte) (-79);
      FileSystemHandling.shouldAllThrowIOExceptions();
      FileSystemHandling.createFolder((EvoSuiteFile) null);
      ExpressionMatrixImpl expressionMatrixImpl0 = new ExpressionMatrixImpl();
      int int0 = expressionMatrixImpl0.getNumberOfNodes();
      assertEquals(0, int0);
  }
}
