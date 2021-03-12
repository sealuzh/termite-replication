/*
 * This file was automatically generated by EvoSuite
 * Sun Nov 08 08:22:51 GMT 2020
 */

package com.browsersoft.openhre.hl7.impl.regular;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.browsersoft.openhre.hl7.api.regular.ExpressionElementMapper;
import com.browsersoft.openhre.hl7.impl.config.HL7MessageGroupImpl;
import com.browsersoft.openhre.hl7.impl.regular.ExpressionElementMapperImpl;
import com.browsersoft.openhre.hl7.impl.regular.ExpressionElementMapperItemImpl;
import com.browsersoft.openhre.hl7.impl.regular.ExpressionImpl;
import com.browsersoft.openhre.hl7.impl.regular.ExpressionMatrixImpl;
import com.browsersoft.openhre.hl7.impl.regular.ExpressionPartImpl;
import com.browsersoft.openhre.hl7.impl.regular.MessageTracerImpl;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class ExpressionMatrixImpl_ESTest extends ExpressionMatrixImpl_ESTest_scaffolding {

  /**
  //Test case number: 0
  /*Coverage entropy=1.945910149055313
  */
  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      ExpressionMatrixImpl expressionMatrixImpl0 = new ExpressionMatrixImpl();
      expressionMatrixImpl0.creatMatrix(1);
      MessageTracerImpl messageTracerImpl0 = new MessageTracerImpl();
      messageTracerImpl0.setMapper((ExpressionElementMapper) null);
      MessageTracerImpl messageTracerImpl1 = new MessageTracerImpl();
      messageTracerImpl1.getMapper();
      expressionMatrixImpl0.creatMatrix(1);
      messageTracerImpl0.getMapper();
      expressionMatrixImpl0.outNoStandardConnections(false, (ExpressionElementMapper) null);
      expressionMatrixImpl0.addNewNode();
      expressionMatrixImpl0.setValue(2343, 2318, 2269);
      expressionMatrixImpl0.toString();
      expressionMatrixImpl0.addNewNode();
      expressionMatrixImpl0.getValue(1, 0);
      expressionMatrixImpl0.outNoStandardConnections(true, (ExpressionElementMapper) null);
      expressionMatrixImpl0.setValue(1, 0, 2318);
      ExpressionMatrixImpl expressionMatrixImpl1 = new ExpressionMatrixImpl();
      ExpressionMatrixImpl expressionMatrixImpl2 = new ExpressionMatrixImpl();
      expressionMatrixImpl2.outNoStandardConnections(true, (ExpressionElementMapper) null);
      expressionMatrixImpl1.outNoStandardConnections(true, (ExpressionElementMapper) null);
      messageTracerImpl0.getMapper();
      expressionMatrixImpl0.outNoStandardConnections(true, (ExpressionElementMapper) null);
  }

  /**
  //Test case number: 1
  /*Coverage entropy=1.945910149055313
  */
  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      ExpressionMatrixImpl expressionMatrixImpl0 = new ExpressionMatrixImpl();
      expressionMatrixImpl0.creatMatrix(2318);
      MessageTracerImpl messageTracerImpl0 = new MessageTracerImpl();
      messageTracerImpl0.setMapper((ExpressionElementMapper) null);
      MessageTracerImpl messageTracerImpl1 = new MessageTracerImpl();
      messageTracerImpl1.getMapper();
      expressionMatrixImpl0.creatMatrix(2343);
      expressionMatrixImpl0.outNoStandardConnections(false, (ExpressionElementMapper) null);
      expressionMatrixImpl0.addNewNode();
      expressionMatrixImpl0.setValue(0, 2318, 0);
      expressionMatrixImpl0.getValue(0, 2318);
      expressionMatrixImpl0.outNoStandardConnections(false, (ExpressionElementMapper) null);
      ExpressionMatrixImpl expressionMatrixImpl1 = new ExpressionMatrixImpl();
      expressionMatrixImpl1.setValue(14, (-405), 0);
      expressionMatrixImpl0.setValue(14, 0, 14);
      expressionMatrixImpl0.addNewNode();
      expressionMatrixImpl0.outNoStandardConnections(false, (ExpressionElementMapper) null);
      // Undeclared exception!
      expressionMatrixImpl0.toString();
  }

  /**
  //Test case number: 2
  /*Coverage entropy=1.945910149055313
  */
  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      ExpressionMatrixImpl expressionMatrixImpl0 = new ExpressionMatrixImpl();
      expressionMatrixImpl0.creatMatrix(28);
      MessageTracerImpl messageTracerImpl0 = new MessageTracerImpl();
      MessageTracerImpl messageTracerImpl1 = new MessageTracerImpl();
      messageTracerImpl1.setMapper((ExpressionElementMapper) null);
      messageTracerImpl1.getMapper();
      expressionMatrixImpl0.creatMatrix(35);
      expressionMatrixImpl0.outNoStandardConnections(true, (ExpressionElementMapper) null);
      expressionMatrixImpl0.addNewNode();
      expressionMatrixImpl0.setValue(0, 28, (-979));
      expressionMatrixImpl0.toString();
      expressionMatrixImpl0.getValue((-979), 0);
      expressionMatrixImpl0.outNoStandardConnections(false, (ExpressionElementMapper) null);
  }

  /**
  //Test case number: 3
  /*Coverage entropy=1.945910149055313
  */
  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      ExpressionMatrixImpl expressionMatrixImpl0 = new ExpressionMatrixImpl();
      expressionMatrixImpl0.creatMatrix(2343);
      MessageTracerImpl messageTracerImpl0 = new MessageTracerImpl();
      messageTracerImpl0.setMapper((ExpressionElementMapper) null);
      MessageTracerImpl messageTracerImpl1 = new MessageTracerImpl();
      messageTracerImpl1.getMapper();
      expressionMatrixImpl0.creatMatrix(2343);
      expressionMatrixImpl0.addNewNode();
      expressionMatrixImpl0.toString();
      expressionMatrixImpl0.setValue(0, 81, 14);
      ExpressionMatrixImpl expressionMatrixImpl1 = new ExpressionMatrixImpl();
      expressionMatrixImpl0.outNoStandardConnections(true, (ExpressionElementMapper) null);
      expressionMatrixImpl1.outNoStandardConnections(true, (ExpressionElementMapper) null);
      // Undeclared exception!
      expressionMatrixImpl0.toString();
  }

  /**
  //Test case number: 4
  /*Coverage entropy=1.7917594692280547
  */
  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      ExpressionMatrixImpl expressionMatrixImpl0 = new ExpressionMatrixImpl();
      expressionMatrixImpl0.creatMatrix(2318);
      MessageTracerImpl messageTracerImpl0 = new MessageTracerImpl();
      messageTracerImpl0.setMapper((ExpressionElementMapper) null);
      MessageTracerImpl messageTracerImpl1 = new MessageTracerImpl();
      messageTracerImpl1.getMapper();
      expressionMatrixImpl0.outNoStandardConnections(false, (ExpressionElementMapper) null);
      expressionMatrixImpl0.addNewNode();
      expressionMatrixImpl0.setValue(0, 2318, 0);
      int int0 = expressionMatrixImpl0.getValue((-1242), 121);
      assertEquals((-1), int0);
      
      expressionMatrixImpl0.outNoStandardConnections(true, (ExpressionElementMapper) null);
      expressionMatrixImpl0.setValue(0, 14, 14);
      ExpressionMatrixImpl expressionMatrixImpl1 = new ExpressionMatrixImpl();
      String string0 = expressionMatrixImpl0.outNoStandardConnections(false, (ExpressionElementMapper) null);
      assertEquals("", string0);
      
      expressionMatrixImpl1.outNoStandardConnections(true, (ExpressionElementMapper) null);
      messageTracerImpl0.getMapper();
      String string1 = expressionMatrixImpl0.outNoStandardConnections(true, (ExpressionElementMapper) null);
      assertEquals("0 --- O ---> 14\n", string1);
      
      ExpressionMatrixImpl expressionMatrixImpl2 = new ExpressionMatrixImpl();
      int int1 = expressionMatrixImpl2.addNewNode();
      assertEquals(0, int1);
  }

  /**
  //Test case number: 5
  /*Coverage entropy=1.5254400673526365
  */
  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      ExpressionMatrixImpl expressionMatrixImpl0 = new ExpressionMatrixImpl();
      expressionMatrixImpl0.creatMatrix(2318);
      MessageTracerImpl messageTracerImpl0 = new MessageTracerImpl();
      messageTracerImpl0.setMapper((ExpressionElementMapper) null);
      MessageTracerImpl messageTracerImpl1 = new MessageTracerImpl();
      messageTracerImpl1.getMapper();
      expressionMatrixImpl0.creatMatrix(2343);
      expressionMatrixImpl0.outNoStandardConnections(false, (ExpressionElementMapper) null);
      expressionMatrixImpl0.addNewNode();
      expressionMatrixImpl0.setValue(0, 2318, 0);
      expressionMatrixImpl0.toString();
      expressionMatrixImpl0.getValue((-1242), 100);
      String string0 = expressionMatrixImpl0.outNoStandardConnections(true, (ExpressionElementMapper) null);
      assertEquals("", string0);
      
      expressionMatrixImpl0.setValue(14, 1790, 0);
      int int0 = expressionMatrixImpl0.getValue(451, 100);
      assertEquals((-1), int0);
      
      String string1 = expressionMatrixImpl0.outNoStandardConnections(false, (ExpressionElementMapper) null);
      assertEquals("0 --- \u094F ---> 0\n", string1);
      
      int int1 = expressionMatrixImpl0.addNewNode();
      assertEquals(1, int1);
  }

  /**
  //Test case number: 6
  /*Coverage entropy=1.7917594692280547
  */
  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      ExpressionMatrixImpl expressionMatrixImpl0 = new ExpressionMatrixImpl();
      MessageTracerImpl messageTracerImpl0 = new MessageTracerImpl();
      messageTracerImpl0.setMapper((ExpressionElementMapper) null);
      messageTracerImpl0.getMapper();
      expressionMatrixImpl0.creatMatrix(14);
      expressionMatrixImpl0.creatMatrix(7);
      expressionMatrixImpl0.outNoStandardConnections(false, (ExpressionElementMapper) null);
      expressionMatrixImpl0.addNewNode();
      expressionMatrixImpl0.setValue(0, 0, (-4403));
      ExpressionMatrixImpl expressionMatrixImpl1 = new ExpressionMatrixImpl();
      expressionMatrixImpl1.getValue((-1162), (-1162));
      expressionMatrixImpl0.outNoStandardConnections(false, (ExpressionElementMapper) null);
      assertEquals(7, expressionMatrixImpl0.getNumberOfElements());
  }

  /**
  //Test case number: 7
  /*Coverage entropy=1.6094379124341005
  */
  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      ExpressionMatrixImpl expressionMatrixImpl0 = new ExpressionMatrixImpl();
      MessageTracerImpl messageTracerImpl0 = new MessageTracerImpl();
      messageTracerImpl0.setMatrix(expressionMatrixImpl0);
      expressionMatrixImpl0.addNewNode();
      ExpressionElementMapper expressionElementMapper0 = null;
      messageTracerImpl0.setMapper((ExpressionElementMapper) null);
      messageTracerImpl0.getMapper();
      int int0 = 65533;
      expressionMatrixImpl0.creatMatrix(65533);
      // Undeclared exception!
      expressionMatrixImpl0.outNoStandardConnections(true, (ExpressionElementMapper) null);
  }

  /**
  //Test case number: 8
  /*Coverage entropy=1.3862943611198906
  */
  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      ExpressionMatrixImpl expressionMatrixImpl0 = new ExpressionMatrixImpl();
      expressionMatrixImpl0.addNewNode();
      expressionMatrixImpl0.addNewNode();
      expressionMatrixImpl0.creatMatrix((-355));
      MessageTracerImpl messageTracerImpl0 = new MessageTracerImpl();
      messageTracerImpl0.getMapper();
      expressionMatrixImpl0.outNoStandardConnections(false, (ExpressionElementMapper) null);
      assertEquals((-355), expressionMatrixImpl0.getNumberOfElements());
  }

  /**
  //Test case number: 9
  /*Coverage entropy=1.3862943611198906
  */
  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      ExpressionMatrixImpl expressionMatrixImpl0 = new ExpressionMatrixImpl();
      MessageTracerImpl messageTracerImpl0 = new MessageTracerImpl();
      messageTracerImpl0.setMapper((ExpressionElementMapper) null);
      messageTracerImpl0.getMapper();
      expressionMatrixImpl0.creatMatrix(65533);
      expressionMatrixImpl0.outNoStandardConnections(false, (ExpressionElementMapper) null);
      // Undeclared exception!
      expressionMatrixImpl0.addNewNode();
  }

  /**
  //Test case number: 10
  /*Coverage entropy=1.5933708939247504
  */
  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      ExpressionMatrixImpl expressionMatrixImpl0 = new ExpressionMatrixImpl();
      expressionMatrixImpl0.creatMatrix(2343);
      MessageTracerImpl messageTracerImpl0 = new MessageTracerImpl();
      messageTracerImpl0.setMapper((ExpressionElementMapper) null);
      messageTracerImpl0.getMapper();
      expressionMatrixImpl0.creatMatrix(14);
      expressionMatrixImpl0.outNoStandardConnections(false, (ExpressionElementMapper) null);
      expressionMatrixImpl0.addNewNode();
      expressionMatrixImpl0.setValue(0, 0, 0);
      String string0 = expressionMatrixImpl0.toString();
      assertEquals("MATRIX\n-----------------------\n | A , B , C , D , E , F , G , H , I , J , K , L , M , N\n0| 0 , E , E , E , E , E , E , E , E , E , E , E , E , E\n\nCONNECTIONS\n-----------------------\n", string0);
      
      expressionMatrixImpl0.getValue(1133, 2249);
      String string1 = expressionMatrixImpl0.outNoStandardConnections(false, (ExpressionElementMapper) null);
      assertEquals("", string1);
      
      expressionMatrixImpl0.setValue(2903, 4, 4);
      expressionMatrixImpl0.setValue(1133, 451, (-1));
      int int0 = expressionMatrixImpl0.addNewNode();
      assertEquals(1, int0);
      
      expressionMatrixImpl0.outNoStandardConnections(true, (ExpressionElementMapper) null);
      expressionMatrixImpl0.getNumberOfNodes();
      int int1 = expressionMatrixImpl0.getValue(1, (-1462));
      assertEquals((-1), int1);
  }

  /**
  //Test case number: 11
  /*Coverage entropy=1.7917594692280547
  */
  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      ExpressionMatrixImpl expressionMatrixImpl0 = new ExpressionMatrixImpl();
      MessageTracerImpl messageTracerImpl0 = new MessageTracerImpl();
      expressionMatrixImpl0.addNewNode();
      messageTracerImpl0.setMapper((ExpressionElementMapper) null);
      messageTracerImpl0.getMapper();
      expressionMatrixImpl0.creatMatrix(14);
      expressionMatrixImpl0.outNoStandardConnections(false, (ExpressionElementMapper) null);
      expressionMatrixImpl0.addNewNode();
      expressionMatrixImpl0.setValue(1, 1, 1);
      expressionMatrixImpl0.getValue(1, 1);
      ExpressionElementMapper expressionElementMapper0 = messageTracerImpl0.getMapper();
      assertNull(expressionElementMapper0);
  }

  /**
  //Test case number: 12
  /*Coverage entropy=1.7917594692280547
  */
  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      ExpressionMatrixImpl expressionMatrixImpl0 = new ExpressionMatrixImpl();
      expressionMatrixImpl0.creatMatrix((-2600));
      int int0 = (-3);
      expressionMatrixImpl0.creatMatrix((-3));
      ExpressionElementMapperImpl expressionElementMapperImpl0 = new ExpressionElementMapperImpl();
      expressionMatrixImpl0.outNoStandardConnections(true, expressionElementMapperImpl0);
      expressionMatrixImpl0.getNumberOfElements();
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
  //Test case number: 13
  /*Coverage entropy=1.945910149055313
  */
  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      ExpressionMatrixImpl expressionMatrixImpl0 = new ExpressionMatrixImpl();
      expressionMatrixImpl0.toString();
      ExpressionElementMapperImpl expressionElementMapperImpl0 = new ExpressionElementMapperImpl();
      expressionMatrixImpl0.outNoStandardConnections(false, expressionElementMapperImpl0);
      expressionMatrixImpl0.toString();
      expressionElementMapperImpl0.clearAll();
      expressionMatrixImpl0.outNoStandardConnections(false, expressionElementMapperImpl0);
      expressionMatrixImpl0.addNewNode();
      expressionMatrixImpl0.getNumberOfNodes();
      expressionMatrixImpl0.toString();
      ExpressionElementMapperItemImpl expressionElementMapperItemImpl0 = new ExpressionElementMapperItemImpl();
      expressionElementMapperImpl0.addItem(expressionElementMapperItemImpl0);
      expressionElementMapperItemImpl0.toString();
      expressionElementMapperItemImpl0.toString();
      expressionMatrixImpl0.creatMatrix(1232);
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
  //Test case number: 14
  /*Coverage entropy=1.3862943611198906
  */
  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      ExpressionMatrixImpl expressionMatrixImpl0 = new ExpressionMatrixImpl();
      expressionMatrixImpl0.creatMatrix(14);
      expressionMatrixImpl0.addNewNode();
      expressionMatrixImpl0.setValue(0, (-1244), 14);
      assertEquals(14, expressionMatrixImpl0.getNumberOfElements());
  }

  /**
  //Test case number: 15
  /*Coverage entropy=1.4750763110546947
  */
  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      ExpressionMatrixImpl expressionMatrixImpl0 = new ExpressionMatrixImpl();
      expressionMatrixImpl0.addNewNode();
      expressionMatrixImpl0.creatMatrix(1331);
      MessageTracerImpl messageTracerImpl0 = new MessageTracerImpl();
      ExpressionImpl expressionImpl0 = new ExpressionImpl();
      ExpressionPartImpl expressionPartImpl0 = new ExpressionPartImpl();
      expressionImpl0.addItem(expressionPartImpl0);
      HL7MessageGroupImpl hL7MessageGroupImpl0 = new HL7MessageGroupImpl();
      messageTracerImpl0.processGroupContent(expressionImpl0, hL7MessageGroupImpl0);
      messageTracerImpl0.getMapper();
      expressionMatrixImpl0.outNoStandardConnections(false, (ExpressionElementMapper) null);
      expressionMatrixImpl0.getValue(0, 1331);
      expressionMatrixImpl0.setValue(1331, 1302, 1329);
      assertEquals(1331, expressionMatrixImpl0.getNumberOfElements());
  }

  /**
  //Test case number: 16
  /*Coverage entropy=1.1890617888242938
  */
  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      ExpressionMatrixImpl expressionMatrixImpl0 = new ExpressionMatrixImpl();
      expressionMatrixImpl0.toString();
      expressionMatrixImpl0.toString();
      expressionMatrixImpl0.addNewNode();
      int int0 = 1907;
      expressionMatrixImpl0.creatMatrix(1907);
      expressionMatrixImpl0.toString();
      expressionMatrixImpl0.addNewNode();
      expressionMatrixImpl0.addNewNode();
      ExpressionElementMapperImpl expressionElementMapperImpl0 = new ExpressionElementMapperImpl();
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
  //Test case number: 17
  /*Coverage entropy=1.3862943611198906
  */
  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      ExpressionMatrixImpl expressionMatrixImpl0 = new ExpressionMatrixImpl();
      expressionMatrixImpl0.creatMatrix(1);
      ExpressionElementMapperImpl expressionElementMapperImpl0 = new ExpressionElementMapperImpl();
      expressionMatrixImpl0.outNoStandardConnections(false, expressionElementMapperImpl0);
      expressionMatrixImpl0.getNumberOfElements();
      expressionMatrixImpl0.outNoStandardConnections(false, expressionElementMapperImpl0);
      assertEquals(1, expressionMatrixImpl0.getNumberOfElements());
  }

  /**
  //Test case number: 18
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      ExpressionMatrixImpl expressionMatrixImpl0 = new ExpressionMatrixImpl();
      expressionMatrixImpl0.setValue((-567), (-567), 3);
      assertEquals(0, expressionMatrixImpl0.getNumberOfElements());
  }

  /**
  //Test case number: 19
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      ExpressionMatrixImpl expressionMatrixImpl0 = new ExpressionMatrixImpl();
      int int0 = expressionMatrixImpl0.addNewNode();
      assertEquals(0, int0);
      
      int int1 = expressionMatrixImpl0.getValue(0, 1318);
      assertEquals((-1), int1);
  }

  /**
  //Test case number: 20
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      ExpressionMatrixImpl expressionMatrixImpl0 = new ExpressionMatrixImpl();
      int int0 = expressionMatrixImpl0.getValue(0, 2229);
      assertEquals((-1), int0);
  }

  /**
  //Test case number: 21
  /*Coverage entropy=1.3862943611198906
  */
  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      ExpressionMatrixImpl expressionMatrixImpl0 = new ExpressionMatrixImpl();
      String string0 = expressionMatrixImpl0.toString();
      assertEquals("MATRIX\n-----------------------\n | \n\nCONNECTIONS\n-----------------------\n", string0);
      
      expressionMatrixImpl0.addNewNode();
      expressionMatrixImpl0.setValue(0, 0, (-412));
      int int0 = expressionMatrixImpl0.addNewNode();
      assertEquals(1, int0);
  }

  /**
  //Test case number: 22
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      ExpressionMatrixImpl expressionMatrixImpl0 = new ExpressionMatrixImpl();
      expressionMatrixImpl0.setValue(0, (-465), (-4));
      MessageTracerImpl messageTracerImpl0 = new MessageTracerImpl();
      // Undeclared exception!
      try { 
        messageTracerImpl0.processEnd();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.browsersoft.openhre.hl7.impl.regular.MessageTracerImpl", e);
      }
  }

  /**
  //Test case number: 23
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      ExpressionMatrixImpl expressionMatrixImpl0 = new ExpressionMatrixImpl();
      int int0 = expressionMatrixImpl0.addNewNode();
      assertEquals(0, int0);
      
      int int1 = expressionMatrixImpl0.getValue(0, 0);
      assertEquals((-1), int1);
  }

  /**
  //Test case number: 24
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      ExpressionMatrixImpl expressionMatrixImpl0 = new ExpressionMatrixImpl();
      MessageTracerImpl messageTracerImpl0 = new MessageTracerImpl();
      messageTracerImpl0.getMapper();
      expressionMatrixImpl0.setValue(1032, 503, 1303);
      expressionMatrixImpl0.addNewNode();
      expressionMatrixImpl0.setValue(0, 1394, 991);
      int int0 = expressionMatrixImpl0.addNewNode();
      assertEquals(1, int0);
  }

  /**
  //Test case number: 25
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      ExpressionMatrixImpl expressionMatrixImpl0 = new ExpressionMatrixImpl();
      int int0 = expressionMatrixImpl0.getNumberOfNodes();
      assertEquals(0, int0);
  }

  /**
  //Test case number: 26
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      ExpressionMatrixImpl expressionMatrixImpl0 = new ExpressionMatrixImpl();
      int int0 = expressionMatrixImpl0.getNumberOfElements();
      assertEquals(0, int0);
  }
}
