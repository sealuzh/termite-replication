/*
 * This file was automatically generated by EvoSuite
 * Fri Dec 06 03:53:53 GMT 2019
 */

package com.browsersoft.openhre.hl7.impl.regular;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.browsersoft.openhre.hl7.api.config.HL7MessageGroup;
import com.browsersoft.openhre.hl7.api.config.HL7MessageGroupItem;
import com.browsersoft.openhre.hl7.api.regular.ExpressionElementMapper;
import com.browsersoft.openhre.hl7.impl.config.HL7MessageGroupImpl;
import com.browsersoft.openhre.hl7.impl.config.HL7MessageImpl;
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
  /*Coverage entropy=1.597377720766875
  */
  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      ExpressionMatrixImpl expressionMatrixImpl0 = new ExpressionMatrixImpl();
      expressionMatrixImpl0.creatMatrix(65);
      expressionMatrixImpl0.addNewNode();
      expressionMatrixImpl0.toString();
      expressionMatrixImpl0.setValue(0, 27, (-617));
      HL7MessageGroupImpl hL7MessageGroupImpl0 = new HL7MessageGroupImpl();
      MessageTracerImpl messageTracerImpl0 = new MessageTracerImpl();
      MessageTracerImpl messageTracerImpl1 = new MessageTracerImpl();
      messageTracerImpl1.getMapper();
      expressionMatrixImpl0.outNoStandardConnections(false, (ExpressionElementMapper) null);
      expressionMatrixImpl0.getNumberOfNodes();
      assertEquals(65, expressionMatrixImpl0.getNumberOfElements());
  }

  /**
  //Test case number: 1
  /*Coverage entropy=1.189601081269165
  */
  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      ExpressionMatrixImpl expressionMatrixImpl0 = new ExpressionMatrixImpl();
      expressionMatrixImpl0.creatMatrix(65);
      expressionMatrixImpl0.addNewNode();
      expressionMatrixImpl0.setValue(0, 27, 0);
      HL7MessageGroupImpl hL7MessageGroupImpl0 = new HL7MessageGroupImpl();
      MessageTracerImpl messageTracerImpl0 = new MessageTracerImpl();
      messageTracerImpl0.getMapper();
      expressionMatrixImpl0.outNoStandardConnections(true, (ExpressionElementMapper) null);
      assertEquals(65, expressionMatrixImpl0.getNumberOfElements());
  }

  /**
  //Test case number: 2
  /*Coverage entropy=1.1919126126587107
  */
  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      ExpressionMatrixImpl expressionMatrixImpl0 = new ExpressionMatrixImpl();
      expressionMatrixImpl0.creatMatrix(65);
      int int0 = expressionMatrixImpl0.addNewNode();
      assertEquals(0, int0);
      
      String string0 = expressionMatrixImpl0.toString();
      assertEquals("MATRIX\n-----------------------\n | A , B , C , D , E , F , G , H , I , J , K , L , M , N , O , P , Q , R , S , T , U , V , W , X , Y , Z , [ , \\ , ] , ^ , _ , ` , a , b , c , d , e , f , g , h , i , j , k , l , m , n , o , p , q , r , s , t , u , v , w , x , y , z , { , | , } , ~ ,  , \u0080 , \u0081\n0| E , E , E , E , E , E , E , E , E , E , E , E , E , E , E , E , E , E , E , E , E , E , E , E , E , E , E , E , E , E , E , E , E , E , E , E , E , E , E , E , E , E , E , E , E , E , E , E , E , E , E , E , E , E , E , E , E , E , E , E , E , E , E , E , E\n\nCONNECTIONS\n-----------------------\n", string0);
      
      expressionMatrixImpl0.setValue(0, 27, 65);
      ExpressionImpl expressionImpl0 = new ExpressionImpl();
      HL7MessageGroupImpl hL7MessageGroupImpl0 = new HL7MessageGroupImpl();
      MessageTracerImpl messageTracerImpl0 = new MessageTracerImpl();
      MessageTracerImpl messageTracerImpl1 = new MessageTracerImpl();
      messageTracerImpl0.doBeginItem(expressionImpl0, hL7MessageGroupImpl0);
      messageTracerImpl0.getMapper();
      String string1 = expressionMatrixImpl0.outNoStandardConnections(true, (ExpressionElementMapper) null);
      assertEquals("0 --- \\ ---> 65\n", string1);
      
      int int1 = expressionMatrixImpl0.getValue(0, 27);
      assertEquals(65, int1);
  }

  /**
  //Test case number: 3
  /*Coverage entropy=1.1923719867614957
  */
  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      ExpressionMatrixImpl expressionMatrixImpl0 = new ExpressionMatrixImpl();
      expressionMatrixImpl0.creatMatrix(105);
      expressionMatrixImpl0.addNewNode();
      expressionMatrixImpl0.creatMatrix(105);
      expressionMatrixImpl0.toString();
      expressionMatrixImpl0.setValue(0, 0, (-13));
      MessageTracerImpl messageTracerImpl0 = new MessageTracerImpl();
      messageTracerImpl0.getMapper();
      expressionMatrixImpl0.outNoStandardConnections(true, (ExpressionElementMapper) null);
      ExpressionImpl expressionImpl0 = new ExpressionImpl();
      HL7MessageImpl hL7MessageImpl0 = new HL7MessageImpl();
      HL7MessageImpl hL7MessageImpl1 = new HL7MessageImpl();
      hL7MessageImpl1.getGroup();
      // Undeclared exception!
      try { 
        messageTracerImpl0.doBeginItem(expressionImpl0, (HL7MessageGroupItem) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.browsersoft.openhre.hl7.impl.regular.MessageTracerImpl", e);
      }
  }

  /**
  //Test case number: 4
  /*Coverage entropy=1.1908215991645965
  */
  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      ExpressionMatrixImpl expressionMatrixImpl0 = new ExpressionMatrixImpl();
      expressionMatrixImpl0.creatMatrix(33);
      expressionMatrixImpl0.addNewNode();
      expressionMatrixImpl0.setValue(0, 21, 63);
      HL7MessageGroupImpl hL7MessageGroupImpl0 = new HL7MessageGroupImpl();
      MessageTracerImpl messageTracerImpl0 = new MessageTracerImpl();
      messageTracerImpl0.getMapper();
      expressionMatrixImpl0.outNoStandardConnections(false, (ExpressionElementMapper) null);
      MessageTracerImpl messageTracerImpl1 = new MessageTracerImpl();
      messageTracerImpl1.getMapper();
      expressionMatrixImpl0.outNoStandardConnections(true, (ExpressionElementMapper) null);
      expressionMatrixImpl0.getValue(2229, 55);
      expressionMatrixImpl0.outNoStandardConnections(false, (ExpressionElementMapper) null);
      assertEquals(33, expressionMatrixImpl0.getNumberOfElements());
  }

  /**
  //Test case number: 5
  /*Coverage entropy=1.189601081269165
  */
  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      ExpressionMatrixImpl expressionMatrixImpl0 = new ExpressionMatrixImpl();
      expressionMatrixImpl0.creatMatrix(65);
      expressionMatrixImpl0.addNewNode();
      expressionMatrixImpl0.setValue(0, 21, 0);
      HL7MessageGroupImpl hL7MessageGroupImpl0 = new HL7MessageGroupImpl();
      MessageTracerImpl messageTracerImpl0 = new MessageTracerImpl();
      messageTracerImpl0.getMapper();
      expressionMatrixImpl0.outNoStandardConnections(false, (ExpressionElementMapper) null);
      assertEquals(65, expressionMatrixImpl0.getNumberOfElements());
  }

  /**
  //Test case number: 6
  /*Coverage entropy=1.1878840226652085
  */
  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      ExpressionMatrixImpl expressionMatrixImpl0 = new ExpressionMatrixImpl();
      expressionMatrixImpl0.creatMatrix(40);
      expressionMatrixImpl0.addNewNode();
      ExpressionMatrixImpl expressionMatrixImpl1 = new ExpressionMatrixImpl();
      expressionMatrixImpl1.toString();
      expressionMatrixImpl0.setValue(0, 24, 2);
      MessageTracerImpl messageTracerImpl0 = new MessageTracerImpl();
      messageTracerImpl0.getMapper();
      expressionMatrixImpl0.outNoStandardConnections(true, (ExpressionElementMapper) null);
      assertEquals(40, expressionMatrixImpl0.getNumberOfElements());
  }

  /**
  //Test case number: 7
  /*Coverage entropy=1.1913289987417635
  */
  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      ExpressionMatrixImpl expressionMatrixImpl0 = new ExpressionMatrixImpl();
      expressionMatrixImpl0.creatMatrix(65);
      expressionMatrixImpl0.addNewNode();
      expressionMatrixImpl0.setValue(0, 27, 0);
      HL7MessageGroupImpl hL7MessageGroupImpl0 = new HL7MessageGroupImpl();
      MessageTracerImpl messageTracerImpl0 = new MessageTracerImpl();
      messageTracerImpl0.getMapper();
      expressionMatrixImpl0.toString();
      int int0 = expressionMatrixImpl0.getValue(65, 27);
      assertEquals(65, expressionMatrixImpl0.getNumberOfElements());
      assertEquals((-1), int0);
  }

  /**
  //Test case number: 8
  /*Coverage entropy=1.1862978654914522
  */
  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      ExpressionMatrixImpl expressionMatrixImpl0 = new ExpressionMatrixImpl();
      expressionMatrixImpl0.creatMatrix(29);
      expressionMatrixImpl0.addNewNode();
      ExpressionMatrixImpl expressionMatrixImpl1 = new ExpressionMatrixImpl();
      expressionMatrixImpl1.toString();
      expressionMatrixImpl0.setValue(0, 0, 58);
      MessageTracerImpl messageTracerImpl0 = new MessageTracerImpl();
      messageTracerImpl0.getMapper();
      expressionMatrixImpl0.outNoStandardConnections(true, (ExpressionElementMapper) null);
      assertEquals(29, expressionMatrixImpl0.getNumberOfElements());
  }

  /**
  //Test case number: 9
  /*Coverage entropy=1.1893877820637047
  */
  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      ExpressionMatrixImpl expressionMatrixImpl0 = new ExpressionMatrixImpl();
      expressionMatrixImpl0.creatMatrix(29);
      expressionMatrixImpl0.addNewNode();
      ExpressionMatrixImpl expressionMatrixImpl1 = new ExpressionMatrixImpl();
      expressionMatrixImpl1.toString();
      expressionMatrixImpl0.setValue(0, 0, 69);
      expressionMatrixImpl0.toString();
      assertEquals(29, expressionMatrixImpl0.getNumberOfElements());
  }

  /**
  //Test case number: 10
  /*Coverage entropy=1.1375916250043898
  */
  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      ExpressionMatrixImpl expressionMatrixImpl0 = new ExpressionMatrixImpl();
      ExpressionElementMapperImpl expressionElementMapperImpl0 = new ExpressionElementMapperImpl();
      expressionMatrixImpl0.addNewNode();
      expressionElementMapperImpl0.toString();
      expressionMatrixImpl0.creatMatrix((-2993));
      expressionMatrixImpl0.outNoStandardConnections(true, expressionElementMapperImpl0);
      assertEquals((-2993), expressionMatrixImpl0.getNumberOfElements());
  }

  /**
  //Test case number: 11
  /*Coverage entropy=1.1217186091313738
  */
  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      ExpressionMatrixImpl expressionMatrixImpl0 = new ExpressionMatrixImpl();
      expressionMatrixImpl0.creatMatrix(22777);
      // Undeclared exception!
      expressionMatrixImpl0.addNewNode();
  }

  /**
  //Test case number: 12
  /*Coverage entropy=1.1217186091313738
  */
  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      ExpressionMatrixImpl expressionMatrixImpl0 = new ExpressionMatrixImpl();
      expressionMatrixImpl0.creatMatrix(12354);
      // Undeclared exception!
      expressionMatrixImpl0.toString();
  }

  /**
  //Test case number: 13
  /*Coverage entropy=0.42857142857142855
  */
  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      ExpressionMatrixImpl expressionMatrixImpl0 = new ExpressionMatrixImpl();
      MessageTracerImpl messageTracerImpl0 = new MessageTracerImpl();
      messageTracerImpl0.getMapper();
      expressionMatrixImpl0.outNoStandardConnections(false, (ExpressionElementMapper) null);
      expressionMatrixImpl0.setValue(0, 0, 0);
      assertEquals(0, expressionMatrixImpl0.getNumberOfElements());
  }

  /**
  //Test case number: 14
  /*Coverage entropy=1.5531577432135641
  */
  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      ExpressionMatrixImpl expressionMatrixImpl0 = new ExpressionMatrixImpl();
      int int0 = 0;
      expressionMatrixImpl0.creatMatrix(0);
      expressionMatrixImpl0.creatMatrix((-164));
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
  //Test case number: 15
  /*Coverage entropy=1.1931221992958934
  */
  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      ExpressionMatrixImpl expressionMatrixImpl0 = new ExpressionMatrixImpl();
      expressionMatrixImpl0.creatMatrix(43);
      expressionMatrixImpl0.addNewNode();
      expressionMatrixImpl0.creatMatrix(4572);
      expressionMatrixImpl0.toString();
      expressionMatrixImpl0.setValue((-3524), (-375), 74);
      ExpressionImpl expressionImpl0 = new ExpressionImpl();
      HL7MessageGroupImpl hL7MessageGroupImpl0 = new HL7MessageGroupImpl();
      MessageTracerImpl messageTracerImpl0 = new MessageTracerImpl();
      messageTracerImpl0.doBeginItem(expressionImpl0, hL7MessageGroupImpl0);
      messageTracerImpl0.getMapper();
      // Undeclared exception!
      expressionMatrixImpl0.outNoStandardConnections(false, (ExpressionElementMapper) null);
  }

  /**
  //Test case number: 16
  /*Coverage entropy=1.1546856420984069
  */
  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      ExpressionMatrixImpl expressionMatrixImpl0 = new ExpressionMatrixImpl();
      expressionMatrixImpl0.creatMatrix(65);
      expressionMatrixImpl0.addNewNode();
      expressionMatrixImpl0.setValue(0, 27, 0);
      expressionMatrixImpl0.addNewNode();
      int int0 = expressionMatrixImpl0.getValue(0, 21);
      assertEquals(65, expressionMatrixImpl0.getNumberOfElements());
      assertEquals((-1), int0);
  }

  /**
  //Test case number: 17
  /*Coverage entropy=1.1546856420984069
  */
  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      ExpressionMatrixImpl expressionMatrixImpl0 = new ExpressionMatrixImpl();
      expressionMatrixImpl0.creatMatrix(36);
      expressionMatrixImpl0.toString();
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
  //Test case number: 18
  /*Coverage entropy=1.1217186091313738
  */
  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      ExpressionMatrixImpl expressionMatrixImpl0 = new ExpressionMatrixImpl();
      expressionMatrixImpl0.creatMatrix((-11));
      expressionMatrixImpl0.toString();
      assertEquals((-11), expressionMatrixImpl0.getNumberOfElements());
  }

  /**
  //Test case number: 19
  /*Coverage entropy=0.42857142857142855
  */
  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      ExpressionMatrixImpl expressionMatrixImpl0 = new ExpressionMatrixImpl();
      expressionMatrixImpl0.addNewNode();
      expressionMatrixImpl0.setValue(0, 1212, 93);
      assertEquals(0, expressionMatrixImpl0.getNumberOfElements());
  }

  /**
  //Test case number: 20
  /*Coverage entropy=0.42857142857142855
  */
  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      ExpressionMatrixImpl expressionMatrixImpl0 = new ExpressionMatrixImpl();
      expressionMatrixImpl0.addNewNode();
      expressionMatrixImpl0.setValue(0, (-4210), (-1));
      assertEquals(1, expressionMatrixImpl0.getNumberOfNodes());
  }

  /**
  //Test case number: 21
  /*Coverage entropy=0.4
  */
  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      ExpressionMatrixImpl expressionMatrixImpl0 = new ExpressionMatrixImpl();
      int int0 = expressionMatrixImpl0.getValue((-1080), (-1080));
      assertEquals((-1), int0);
  }

  /**
  //Test case number: 22
  /*Coverage entropy=1.1815192735832012
  */
  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      ExpressionMatrixImpl expressionMatrixImpl0 = new ExpressionMatrixImpl();
      expressionMatrixImpl0.creatMatrix(16);
      expressionMatrixImpl0.addNewNode();
      expressionMatrixImpl0.setValue(1, (-599), 65);
      MessageTracerImpl messageTracerImpl0 = new MessageTracerImpl();
      messageTracerImpl0.getMapper();
      expressionMatrixImpl0.outNoStandardConnections(true, (ExpressionElementMapper) null);
      assertEquals(16, expressionMatrixImpl0.getNumberOfElements());
  }

  /**
  //Test case number: 23
  /*Coverage entropy=1.163735415854063
  */
  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      ExpressionMatrixImpl expressionMatrixImpl0 = new ExpressionMatrixImpl();
      expressionMatrixImpl0.addNewNode();
      expressionMatrixImpl0.addNewNode();
      expressionMatrixImpl0.toString();
      expressionMatrixImpl0.creatMatrix(1);
      MessageTracerImpl messageTracerImpl0 = new MessageTracerImpl();
      messageTracerImpl0.getMapper();
      expressionMatrixImpl0.outNoStandardConnections(false, (ExpressionElementMapper) null);
      assertEquals(1, expressionMatrixImpl0.getNumberOfElements());
  }

  /**
  //Test case number: 24
  /*Coverage entropy=0.4
  */
  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      ExpressionMatrixImpl expressionMatrixImpl0 = new ExpressionMatrixImpl();
      expressionMatrixImpl0.setValue(2826, 397, 65);
      MessageTracerImpl messageTracerImpl0 = new MessageTracerImpl();
      messageTracerImpl0.getMapper();
      ExpressionImpl expressionImpl0 = new ExpressionImpl();
      HL7MessageImpl hL7MessageImpl0 = new HL7MessageImpl();
      hL7MessageImpl0.getGroup();
      // Undeclared exception!
      try { 
        messageTracerImpl0.processGroupContent(expressionImpl0, (HL7MessageGroup) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.browsersoft.openhre.hl7.impl.regular.MessageTracerImpl", e);
      }
  }

  /**
  //Test case number: 25
  /*Coverage entropy=0.4
  */
  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      ExpressionMatrixImpl expressionMatrixImpl0 = new ExpressionMatrixImpl();
      expressionMatrixImpl0.setValue((-642), 0, (-642));
      assertEquals(0, expressionMatrixImpl0.getNumberOfElements());
  }

  /**
  //Test case number: 26
  /*Coverage entropy=0.42857142857142855
  */
  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      ExpressionMatrixImpl expressionMatrixImpl0 = new ExpressionMatrixImpl();
      ExpressionElementMapperImpl expressionElementMapperImpl0 = new ExpressionElementMapperImpl();
      expressionMatrixImpl0.addNewNode();
      expressionMatrixImpl0.setValue(0, 204, 204);
      assertEquals(0, expressionMatrixImpl0.getNumberOfElements());
  }

  /**
  //Test case number: 27
  /*Coverage entropy=1.0931471805599453
  */
  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      ExpressionMatrixImpl expressionMatrixImpl0 = new ExpressionMatrixImpl();
      int int0 = expressionMatrixImpl0.getNumberOfNodes();
      assertEquals(0, int0);
  }

  /**
  //Test case number: 28
  /*Coverage entropy=0.45454545454545453
  */
  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      ExpressionMatrixImpl expressionMatrixImpl0 = new ExpressionMatrixImpl();
      int int0 = expressionMatrixImpl0.addNewNode();
      assertEquals(0, int0);
      
      expressionMatrixImpl0.setValue(0, 0, (-2));
      String string0 = expressionMatrixImpl0.toString();
      assertEquals("MATRIX\n-----------------------\n | \n0| \n\nCONNECTIONS\n-----------------------\n", string0);
      
      int int1 = expressionMatrixImpl0.getValue(0, 107);
      assertEquals((-1), int1);
  }

  /**
  //Test case number: 29
  /*Coverage entropy=0.45454545454545453
  */
  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      ExpressionMatrixImpl expressionMatrixImpl0 = new ExpressionMatrixImpl();
      expressionMatrixImpl0.addNewNode();
      int int0 = expressionMatrixImpl0.addNewNode();
      assertEquals(1, int0);
      
      ExpressionElementMapperImpl expressionElementMapperImpl0 = new ExpressionElementMapperImpl();
      expressionMatrixImpl0.outNoStandardConnections(false, expressionElementMapperImpl0);
      int int1 = expressionMatrixImpl0.getValue(1, (-1328));
      assertEquals((-1), int1);
  }

  /**
  //Test case number: 30
  /*Coverage entropy=0.42857142857142855
  */
  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      ExpressionMatrixImpl expressionMatrixImpl0 = new ExpressionMatrixImpl();
      MessageTracerImpl messageTracerImpl0 = new MessageTracerImpl();
      messageTracerImpl0.getMapper();
      expressionMatrixImpl0.setValue(0, 0, 0);
      int int0 = expressionMatrixImpl0.getValue(0, 0);
      assertEquals((-1), int0);
  }

  /**
  //Test case number: 31
  /*Coverage entropy=0.4444444444444445
  */
  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      ExpressionMatrixImpl expressionMatrixImpl0 = new ExpressionMatrixImpl();
      ExpressionElementMapperImpl expressionElementMapperImpl0 = new ExpressionElementMapperImpl();
      int int0 = expressionMatrixImpl0.addNewNode();
      assertEquals(0, int0);
      
      String string0 = expressionMatrixImpl0.toString();
      assertEquals("MATRIX\n-----------------------\n | \n0| \n\nCONNECTIONS\n-----------------------\n", string0);
      
      int int1 = expressionMatrixImpl0.getValue(0, 0);
      assertEquals((-1), int1);
  }

  /**
  //Test case number: 32
  /*Coverage entropy=1.543056733112554
  */
  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      ExpressionMatrixImpl expressionMatrixImpl0 = new ExpressionMatrixImpl();
      expressionMatrixImpl0.creatMatrix(65);
      expressionMatrixImpl0.getNumberOfElements();
      expressionMatrixImpl0.setValue(65, 65, 65);
      HL7MessageGroupImpl hL7MessageGroupImpl0 = new HL7MessageGroupImpl();
      MessageTracerImpl messageTracerImpl0 = new MessageTracerImpl();
  }

  /**
  //Test case number: 33
  /*Coverage entropy=1.0931471805599453
  */
  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      ExpressionMatrixImpl expressionMatrixImpl0 = new ExpressionMatrixImpl();
      int int0 = expressionMatrixImpl0.getNumberOfElements();
      assertEquals(0, int0);
  }
}
