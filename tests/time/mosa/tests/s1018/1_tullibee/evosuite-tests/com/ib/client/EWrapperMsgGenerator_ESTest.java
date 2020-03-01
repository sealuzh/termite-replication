/*
 * This file was automatically generated by EvoSuite
 * Thu Dec 05 03:51:32 GMT 2019
 */

package com.ib.client;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.ib.client.Contract;
import com.ib.client.ContractDetails;
import com.ib.client.EWrapperMsgGenerator;
import com.ib.client.Execution;
import com.ib.client.Order;
import com.ib.client.OrderState;
import com.ib.client.UnderComp;
import java.util.Vector;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class EWrapperMsgGenerator_ESTest extends EWrapperMsgGenerator_ESTest_scaffolding {

  /**
  //Test case number: 0
  /*Coverage entropy=0.3333333333333333
  */
  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Contract contract0 = new Contract();
      Order order0 = new Order();
      order0.m_algoParams = contract0.m_comboLegs;
      order0.m_algoStrategy = "BoAG";
      OrderState orderState0 = new OrderState();
      String string0 = EWrapperMsgGenerator.openOrder(Integer.MAX_VALUE, contract0, order0, orderState0);
      assertNotNull(string0);
  }

  /**
  //Test case number: 1
  /*Coverage entropy=0.3333333333333333
  */
  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Contract contract0 = new Contract();
      Order order0 = new Order();
      order0.m_algoStrategy = "BoAG";
      OrderState orderState0 = new OrderState();
      String string0 = EWrapperMsgGenerator.openOrder(3, contract0, order0, orderState0);
      assertNotNull(string0);
  }

  /**
  //Test case number: 2
  /*Coverage entropy=0.3333333333333333
  */
  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Vector<String> vector0 = new Vector<String>();
      Contract contract0 = new Contract((-1), ",O!/T}", "BAG", "BAG", (-1), ",O!/T}", ",O!/T}", "BAG", ",O!/T}", ",O!/T}", vector0, ",O!/T}", true, ",O!/T}", " deltaNeutralAuxPrice=");
      Order order0 = new Order();
      contract0.m_comboLegsDescrip = ">aF:cTz1/-w~DJ6";
      order0.m_auxPrice = 1.7976931348623157E308;
      OrderState orderState0 = new OrderState(",O!/T}", ",O!/T}", (String) null, (String) null, 0.0, Integer.MAX_VALUE, 2, " deltaNeutralAuxPrice=", (String) null);
      String string0 = EWrapperMsgGenerator.openOrder(0, contract0, order0, orderState0);
      assertNotNull(string0);
  }

  /**
  //Test case number: 3
  /*Coverage entropy=0.3333333333333333
  */
  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Order order0 = new Order();
      Contract contract0 = new Contract();
      UnderComp underComp0 = new UnderComp();
      contract0.m_underComp = underComp0;
      order0.m_openClose = null;
      OrderState orderState0 = new OrderState();
      String string0 = EWrapperMsgGenerator.openOrder(0, contract0, order0, orderState0);
      assertNotNull(string0);
  }

  /**
  //Test case number: 4
  /*Coverage entropy=0.3333333333333333
  */
  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Vector<String> vector0 = new Vector<String>();
      Contract contract0 = new Contract((-2021459545), "", "BAG", "BAG", (-2021459545), "", ",O!/T}", "BAG", ",O!/T}", ",O!/T}", vector0, ",O!/T}", true, "", " deltaNeutralAuxPrice=");
      Order order0 = new Order();
      order0.m_basisPoints = 1601.83;
      OrderState orderState0 = new OrderState();
      orderState0.m_warningText = null;
      String string0 = EWrapperMsgGenerator.openOrder(Integer.MAX_VALUE, contract0, order0, orderState0);
      assertNotNull(string0);
  }

  /**
  //Test case number: 5
  /*Coverage entropy=1.0931471805599453
  */
  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      // Undeclared exception!
      try { 
        EWrapperMsgGenerator.updatePortfolio((Contract) null, (-2230), (-2230), (-2230), (-2230), (-2230), 693.0, "PeaHdB+hG>Z%XK=huiL");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.ib.client.EWrapperMsgGenerator", e);
      }
  }

  /**
  //Test case number: 6
  /*Coverage entropy=0.3333333333333333
  */
  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      // Undeclared exception!
      try { 
        EWrapperMsgGenerator.bondContractDetails((-4304), (ContractDetails) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.ib.client.EWrapperMsgGenerator", e);
      }
  }

  /**
  //Test case number: 7
  /*Coverage entropy=0.3333333333333333
  */
  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Vector<String> vector0 = new Vector<String>();
      Contract contract0 = new Contract((-1), ",O!/T}", "BAG", "BAG", (-1), ",O!/T}", ",O!/T}", "BAG", ",O!/T}", ",O!/T}", vector0, ",O!/T}", true, ",O!/T}", " deltaNeutralAuxPrice=");
      Order order0 = new Order();
      OrderState orderState0 = new OrderState(",O!/T}", ",O!/T}", (String) null, (String) null, 0.0, Integer.MAX_VALUE, 2, " deltaNeutralAuxPrice=", (String) null);
      String string0 = EWrapperMsgGenerator.openOrder(0, contract0, order0, orderState0);
      assertNotNull(string0);
  }

  /**
  //Test case number: 8
  /*Coverage entropy=0.3333333333333333
  */
  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Contract contract0 = new Contract();
      String string0 = EWrapperMsgGenerator.tickOptionComputation(13, 13, 0, 13, 0, 0.0);
      assertEquals("id=13  modelOptComp: vol = 0.0 delta = N/A: modelPrice = 0.0: pvDividend = 0.0", string0);
  }

  /**
  //Test case number: 9
  /*Coverage entropy=0.3333333333333333
  */
  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.tickOptionComputation(13, 13, 13, 13, 1.7976931348623157E308, 13);
      assertEquals("id=13  modelOptComp: vol = 13.0 delta = N/A: modelPrice = N/A: pvDividend = 13.0", string0);
  }

  /**
  //Test case number: 10
  /*Coverage entropy=0.3333333333333333
  */
  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.tickOptionComputation(13, 13, (-1.0), 13, (-1.0), (-1.0));
      assertEquals("id=13  modelOptComp: vol = N/A delta = N/A: modelPrice = N/A: pvDividend = N/A", string0);
  }

  /**
  //Test case number: 11
  /*Coverage entropy=0.3333333333333333
  */
  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Contract contract0 = new Contract();
      // Undeclared exception!
      try { 
        EWrapperMsgGenerator.fundamentalData(0, (String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.ib.client.EWrapperMsgGenerator", e);
      }
  }

  /**
  //Test case number: 12
  /*Coverage entropy=0.3333333333333333
  */
  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.tickOptionComputation(13, 13, 0.8879219347888545, 13, 13, 13);
      assertEquals("id=13  modelOptComp: vol = 0.8879219347888545 delta = N/A: modelPrice = 13.0: pvDividend = 13.0", string0);
  }

  /**
  //Test case number: 13
  /*Coverage entropy=0.3333333333333333
  */
  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Order order0 = new Order();
      String string0 = EWrapperMsgGenerator.tickOptionComputation(Integer.MAX_VALUE, 13, 0, 0, 0, 1.7976931348623157E308);
      assertEquals("id=2147483647  modelOptComp: vol = 0.0 delta = 0.0: modelPrice = 0.0: pvDividend = N/A", string0);
  }

  /**
  //Test case number: 14
  /*Coverage entropy=0.3333333333333333
  */
  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.tickOptionComputation(13, 13, 13, 0.8879219347888545, 13, 13);
      assertEquals("id=13  modelOptComp: vol = 13.0 delta = 0.8879219347888545: modelPrice = 13.0: pvDividend = 13.0", string0);
  }

  /**
  //Test case number: 15
  /*Coverage entropy=0.3333333333333333
  */
  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.tickOptionComputation(13, 13, 13, 13, 13, (-19.26));
      assertEquals("id=13  modelOptComp: vol = 13.0 delta = N/A: modelPrice = 13.0: pvDividend = N/A", string0);
  }

  /**
  //Test case number: 16
  /*Coverage entropy=0.3333333333333333
  */
  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      // Undeclared exception!
      try { 
        EWrapperMsgGenerator.scannerData(658, 2146895172, (ContractDetails) null, "$LK;v[V+ su3|drAR", "$LK;v[V+ su3|drAR", "$LK;v[V+ su3|drAR", "$LK;v[V+ su3|drAR");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.ib.client.EWrapperMsgGenerator", e);
      }
  }

  /**
  //Test case number: 17
  /*Coverage entropy=0.3333333333333333
  */
  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Order order0 = new Order();
      String string0 = EWrapperMsgGenerator.updateNewsBulletin(Integer.MAX_VALUE, 3, (String) null, "");
      assertEquals("MsgId=2147483647 :: MsgType=3 :: Origin= :: Message=null", string0);
  }

  /**
  //Test case number: 18
  /*Coverage entropy=0.3333333333333333
  */
  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Order order0 = new Order();
      String string0 = EWrapperMsgGenerator.tickOptionComputation(Integer.MAX_VALUE, 0, 0, 0, 1.7976931348623157E308, 1.7976931348623157E308);
      assertEquals("id=2147483647  bidSize: vol = 0.0 delta = 0.0", string0);
  }

  /**
  //Test case number: 19
  /*Coverage entropy=0.3333333333333333
  */
  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Order order0 = new Order();
      String string0 = EWrapperMsgGenerator.tickOptionComputation(0, '?', Integer.MAX_VALUE, 1, 0.0, Integer.MAX_VALUE);
      assertEquals("id=0  unknown: vol = 2.147483647E9 delta = 1.0", string0);
  }

  /**
  //Test case number: 20
  /*Coverage entropy=0.3333333333333333
  */
  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.tickPrice((-176), (-176), (-176), (-176));
      assertEquals("id=-176  unknown=-176.0  canAutoExecute", string0);
  }

  /**
  //Test case number: 21
  /*Coverage entropy=0.3333333333333333
  */
  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Order order0 = new Order();
      String string0 = EWrapperMsgGenerator.updateMktDepth(2, Integer.MAX_VALUE, '?', Integer.MAX_VALUE, 0, 0);
      assertEquals("updateMktDepth: 2 2147483647 63 2147483647 0.0 0", string0);
  }

  /**
  //Test case number: 22
  /*Coverage entropy=0.3333333333333333
  */
  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Order order0 = new Order();
      String string0 = EWrapperMsgGenerator.updateMktDepth('m', 0, 0, 1, 0, 0);
      assertEquals("updateMktDepth: 109 0 0 1 0.0 0", string0);
  }

  /**
  //Test case number: 23
  /*Coverage entropy=0.3333333333333333
  */
  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      // Undeclared exception!
      try { 
        EWrapperMsgGenerator.contractMsg((Contract) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.ib.client.EWrapperMsgGenerator", e);
      }
  }

  /**
  //Test case number: 24
  /*Coverage entropy=1.0931471805599453
  */
  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      Order order0 = new Order();
      Contract contract0 = new Contract();
      OrderState orderState0 = new OrderState();
      String string0 = EWrapperMsgGenerator.updatePortfolio(contract0, 0, 1.7976931348623157E308, 3, Integer.MAX_VALUE, 0, '?', (String) null);
      assertNotNull(string0);
      assertEquals("updatePortfolio: conid = 0\nsymbol = null\nsecType = null\nexpiry = null\nstrike = 0.0\nright = null\nmultiplier = null\nexchange = null\nprimaryExch = null\ncurrency = null\nlocalSymbol = null\n0 1.7976931348623157E308 3.0 2.147483647E9 0.0 63.0 null", string0);
  }

  /**
  //Test case number: 25
  /*Coverage entropy=0.3333333333333333
  */
  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.openOrderEnd();
      assertEquals(" =============== end ===============", string0);
  }

  /**
  //Test case number: 26
  /*Coverage entropy=0.3333333333333333
  */
  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      Order order0 = new Order();
      String string0 = EWrapperMsgGenerator.updateMktDepthL2(Integer.MAX_VALUE, 0, (String) null, Integer.MAX_VALUE, 0, 'y', 0);
      assertEquals("updateMktDepth: 2147483647 0 null 2147483647 0 121.0 0", string0);
  }

  /**
  //Test case number: 27
  /*Coverage entropy=0.3333333333333333
  */
  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      Order order0 = new Order();
      String string0 = EWrapperMsgGenerator.updateMktDepthL2(Integer.MAX_VALUE, 0, "O", '?', 3, 0, Integer.MAX_VALUE);
      assertEquals("updateMktDepth: 2147483647 0 O 63 3 0.0 2147483647", string0);
  }

  /**
  //Test case number: 28
  /*Coverage entropy=0.3333333333333333
  */
  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.realtimeBar(1102, 1102, 1102, 1102, 1102, 1102, 0L, 1102, 1102);
      assertEquals("id=1102 time = 1102 open=1102.0 high=1102.0 low=1102.0 close=1102.0 volume=0 count=1102 WAP=1102.0", string0);
  }

  /**
  //Test case number: 29
  /*Coverage entropy=0.3333333333333333
  */
  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      Order order0 = new Order();
      String string0 = EWrapperMsgGenerator.tickGeneric('?', 'f', 1.7976931348623157E308);
      assertEquals("id=63  unknown=1.7976931348623157E308", string0);
  }

  /**
  //Test case number: 30
  /*Coverage entropy=0.3333333333333333
  */
  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      Order order0 = new Order();
      String string0 = EWrapperMsgGenerator.tickEFP(0, '?', 0, (String) null, 'b', 0, (String) null, 1.7976931348623157E308, Integer.MAX_VALUE);
      assertEquals("id=0  unknown: basisPoints = 0.0/null impliedFuture = 98.0 holdDays = 0 futureExpiry = null dividendImpact = 1.7976931348623157E308 dividends to expiry = 2.147483647E9", string0);
  }

  /**
  //Test case number: 31
  /*Coverage entropy=0.3333333333333333
  */
  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      Order order0 = new Order();
      String string0 = EWrapperMsgGenerator.tickEFP('?', Integer.MAX_VALUE, 'f', (String) null, 0, 3, (String) null, 0, 0);
      assertEquals("id=63  unknown: basisPoints = 102.0/null impliedFuture = 0.0 holdDays = 3 futureExpiry = null dividendImpact = 0.0 dividends to expiry = 0.0", string0);
  }

  /**
  //Test case number: 32
  /*Coverage entropy=0.3333333333333333
  */
  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      Order order0 = new Order();
      String string0 = EWrapperMsgGenerator.tickEFP(2, 1, 1.7976931348623157E308, "", 1.7976931348623157E308, 1, (String) null, 1.7976931348623157E308, Integer.MAX_VALUE);
      assertEquals("id=2  bidPrice: basisPoints = 1.7976931348623157E308/ impliedFuture = 1.7976931348623157E308 holdDays = 1 futureExpiry = null dividendImpact = 1.7976931348623157E308 dividends to expiry = 2.147483647E9", string0);
  }

  /**
  //Test case number: 33
  /*Coverage entropy=0.3333333333333333
  */
  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      Order order0 = new Order();
      Contract contract0 = new Contract();
      // Undeclared exception!
      try { 
        EWrapperMsgGenerator.openOrder(0, contract0, order0, (OrderState) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.ib.client.EWrapperMsgGenerator", e);
      }
  }

  /**
  //Test case number: 34
  /*Coverage entropy=0.3333333333333333
  */
  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      Order order0 = new Order();
      Contract contract0 = new Contract();
      OrderState orderState0 = new OrderState();
      String string0 = EWrapperMsgGenerator.openOrder(0, contract0, order0, orderState0);
      assertNotNull(string0);
  }

  /**
  //Test case number: 35
  /*Coverage entropy=0.3333333333333333
  */
  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      Order order0 = new Order();
      String string0 = EWrapperMsgGenerator.realtimeBar(0, Integer.MAX_VALUE, 0, 0.0, Integer.MAX_VALUE, (-1688.71507357424), Integer.MAX_VALUE, 1.7976931348623157E308, 33);
      assertEquals("id=0 time = 2147483647 open=0.0 high=0.0 low=2.147483647E9 close=-1688.71507357424 volume=2147483647 count=33 WAP=1.7976931348623157E308", string0);
  }

  /**
  //Test case number: 36
  /*Coverage entropy=0.3333333333333333
  */
  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.realtimeBar(22, 22, 22, 4995.058, 1.7976931348623157E308, 4995.058, 22, 4995.058, 22);
      assertEquals("id=22 time = 22 open=22.0 high=4995.058 low=1.7976931348623157E308 close=4995.058 volume=22 count=22 WAP=4995.058", string0);
  }

  /**
  //Test case number: 37
  /*Coverage entropy=0.3333333333333333
  */
  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      Order order0 = new Order();
      String string0 = EWrapperMsgGenerator.tickPrice('c', 0, Integer.MAX_VALUE, 'y');
      assertEquals("id=99  bidSize=2.147483647E9  canAutoExecute", string0);
  }

  /**
  //Test case number: 38
  /*Coverage entropy=0.3333333333333333
  */
  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      Order order0 = new Order();
      String string0 = EWrapperMsgGenerator.tickPrice('m', 0, 0, 0);
      assertEquals("id=109  bidSize=0.0  noAutoExecute", string0);
  }

  /**
  //Test case number: 39
  /*Coverage entropy=0.3333333333333333
  */
  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      Order order0 = new Order();
      String string0 = EWrapperMsgGenerator.updateAccountTime((String) null);
      assertEquals("updateAccountTime: null", string0);
  }

  /**
  //Test case number: 40
  /*Coverage entropy=0.3333333333333333
  */
  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      Order order0 = new Order();
      String string0 = EWrapperMsgGenerator.tickString('f', 0, (String) null);
      assertEquals("id=102  bidSize=null", string0);
  }

  /**
  //Test case number: 41
  /*Coverage entropy=0.3333333333333333
  */
  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      Order order0 = new Order();
      String string0 = EWrapperMsgGenerator.receiveFA(0, (String) null);
      assertEquals("FA: null null", string0);
  }

  /**
  //Test case number: 42
  /*Coverage entropy=0.3333333333333333
  */
  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      Contract contract0 = new Contract();
      Execution execution0 = new Execution();
      String string0 = EWrapperMsgGenerator.execDetails(355, contract0, execution0);
      assertEquals(" ---- Execution Details begin ----\nreqId = 355\norderId = 0\nclientId = 0\nsymbol = null\nsecType = null\nexpiry = null\nstrike = 0.0\nright = null\ncontractExchange = null\ncurrency = null\nlocalSymbol = null\nexecId = null\ntime = null\nacctNumber = null\nexecutionExchange = null\nside = null\nshares = 0\nprice = 0.0\npermId = 0\nliquidation = 0\ncumQty = 0\navgPrice = 0.0\n ---- Execution Details end ----\n", string0);
  }

  /**
  //Test case number: 43
  /*Coverage entropy=0.3333333333333333
  */
  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      Execution execution0 = new Execution();
      // Undeclared exception!
      try { 
        EWrapperMsgGenerator.execDetails(10, (Contract) null, execution0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.ib.client.EWrapperMsgGenerator", e);
      }
  }

  /**
  //Test case number: 44
  /*Coverage entropy=0.3333333333333333
  */
  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.tickOptionComputation(24, 24, 24, 24, 24, 24);
      assertEquals("id=24  OptionImpliedVolatility: vol = 24.0 delta = N/A", string0);
  }

  /**
  //Test case number: 45
  /*Coverage entropy=0.3333333333333333
  */
  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      Order order0 = new Order();
      String string0 = EWrapperMsgGenerator.tickOptionComputation(0, Integer.MAX_VALUE, 3, 1.7976931348623157E308, 1.7976931348623157E308, Integer.MAX_VALUE);
      assertEquals("id=0  unknown: vol = 3.0 delta = N/A", string0);
  }

  /**
  //Test case number: 46
  /*Coverage entropy=0.3333333333333333
  */
  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      Order order0 = new Order();
      String string0 = EWrapperMsgGenerator.tickSize(0, 0, 2);
      assertEquals("id=0  bidSize=2", string0);
  }

  /**
  //Test case number: 47
  /*Coverage entropy=0.3333333333333333
  */
  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      Order order0 = new Order();
      String string0 = EWrapperMsgGenerator.tickSize(0, 2, 0);
      assertEquals("id=0  askPrice=0", string0);
  }

  /**
  //Test case number: 48
  /*Coverage entropy=0.3333333333333333
  */
  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.tickOptionComputation((-268), (-268), (-268), (-268), (-268), (-268));
      assertEquals("id=-268  unknown: vol = N/A delta = N/A", string0);
  }

  /**
  //Test case number: 49
  /*Coverage entropy=0.3333333333333333
  */
  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.currentTime((-346L));
      assertEquals("current time = -346 (Dec 31, 1969 11:54:14 PM)", string0);
  }

  /**
  //Test case number: 50
  /*Coverage entropy=0.3333333333333333
  */
  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      Contract contract0 = new Contract();
      String string0 = EWrapperMsgGenerator.contractMsg(contract0);
      assertEquals("conid = 0\nsymbol = null\nsecType = null\nexpiry = null\nstrike = 0.0\nright = null\nmultiplier = null\nexchange = null\nprimaryExch = null\ncurrency = null\nlocalSymbol = null\n", string0);
  }

  /**
  //Test case number: 51
  /*Coverage entropy=1.5271837172395382
  */
  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      ContractDetails contractDetails0 = new ContractDetails();
      String string0 = EWrapperMsgGenerator.contractDetails(2763, contractDetails0);
      assertEquals("reqId = 2763 ===================================\n ---- Contract Details begin ----\nconid = 0\nsymbol = null\nsecType = null\nexpiry = null\nstrike = 0.0\nright = null\nmultiplier = null\nexchange = null\nprimaryExch = null\ncurrency = null\nlocalSymbol = null\nmarketName = null\ntradingClass = null\nminTick = 0.0\nprice magnifier = 0\norderTypes = null\nvalidExchanges = null\nunderConId = 0\nlongName = null\ncontractMonth = null\nindustry = null\ncategory = null\nsubcategory = null\ntimeZoneId = null\ntradingHours = null\nliquidHours = null\n ---- Contract Details End ----\n", string0);
  }

  /**
  //Test case number: 52
  /*Coverage entropy=0.3333333333333333
  */
  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      // Undeclared exception!
      try { 
        EWrapperMsgGenerator.contractDetails(5, (ContractDetails) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.ib.client.EWrapperMsgGenerator", e);
      }
  }

  /**
  //Test case number: 53
  /*Coverage entropy=0.3333333333333333
  */
  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      Order order0 = new Order();
      String string0 = EWrapperMsgGenerator.tickOptionComputation(0, 1, 1.7976931348623157E308, 0, 1.7976931348623157E308, 1.7976931348623157E308);
      assertEquals("id=0  bidPrice: vol = N/A delta = 0.0", string0);
  }

  /**
  //Test case number: 54
  /*Coverage entropy=0.3333333333333333
  */
  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      ContractDetails contractDetails0 = new ContractDetails();
      String string0 = EWrapperMsgGenerator.scannerData(555, (-84), contractDetails0, " goodTillDate=", (String) null, (String) null, (String) null);
      assertEquals("id = 555 rank=-84 symbol=null secType=null expiry=null strike=0.0 right=null exchange=null currency=null localSymbol=null marketName=null tradingClass=null distance= goodTillDate= benchmark=null projection=null legsStr=null", string0);
  }

  /**
  //Test case number: 55
  /*Coverage entropy=0.3333333333333333
  */
  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      ContractDetails contractDetails0 = new ContractDetails();
      String string0 = EWrapperMsgGenerator.scannerData(25, 2, contractDetails0, (String) null, (String) null, "xFpN4hfM", (String) null);
      assertEquals("id = 25 rank=2 symbol=null secType=null expiry=null strike=0.0 right=null exchange=null currency=null localSymbol=null marketName=null tradingClass=null distance=null benchmark=null projection=xFpN4hfM legsStr=null", string0);
  }

  /**
  //Test case number: 56
  /*Coverage entropy=0.3333333333333333
  */
  @Test(timeout = 4000)
  public void test56()  throws Throwable  {
      ContractDetails contractDetails0 = new ContractDetails();
      String string0 = EWrapperMsgGenerator.scannerData((-1806), (-1806), contractDetails0, (String) null, "<o", (String) null, (String) null);
      assertEquals("id = -1806 rank=-1806 symbol=null secType=null expiry=null strike=0.0 right=null exchange=null currency=null localSymbol=null marketName=null tradingClass=null distance=null benchmark=<o projection=null legsStr=null", string0);
  }

  /**
  //Test case number: 57
  /*Coverage entropy=0.3333333333333333
  */
  @Test(timeout = 4000)
  public void test57()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.accountDownloadEnd("]");
      assertEquals("accountDownloadEnd: ]", string0);
  }

  /**
  //Test case number: 58
  /*Coverage entropy=0.3333333333333333
  */
  @Test(timeout = 4000)
  public void test58()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.scannerDataEnd(7);
      assertEquals("id = 7 =============== end ===============", string0);
  }

  /**
  //Test case number: 59
  /*Coverage entropy=0.3333333333333333
  */
  @Test(timeout = 4000)
  public void test59()  throws Throwable  {
      Order order0 = new Order();
      String string0 = EWrapperMsgGenerator.historicalData(0, (String) null, 0, 1.7976931348623157E308, 0, 0, 'b', 0, Integer.MAX_VALUE, false);
      assertEquals("id=0 date = null open=0.0 high=1.7976931348623157E308 low=0.0 close=0.0 volume=98 count=0 WAP=2.147483647E9 hasGaps=false", string0);
  }

  /**
  //Test case number: 60
  /*Coverage entropy=0.3333333333333333
  */
  @Test(timeout = 4000)
  public void test60()  throws Throwable  {
      Order order0 = new Order();
      String string0 = EWrapperMsgGenerator.orderStatus(0, (String) null, 'n', 0, 1, 0, 'f', 1.7976931348623157E308, Integer.MAX_VALUE, (String) null);
      assertEquals("order status: orderId=0 clientId=2147483647 permId=0 status=null filled=110 remaining=0 avgFillPrice=1.0 lastFillPrice=1.7976931348623157E308 parent Id=102 whyHeld=null", string0);
  }

  /**
  //Test case number: 61
  /*Coverage entropy=0.3333333333333333
  */
  @Test(timeout = 4000)
  public void test61()  throws Throwable  {
      Order order0 = new Order();
      String string0 = EWrapperMsgGenerator.orderStatus('c', "", 0, 'b', 0, 0, 'f', 1, 1, (String) null);
      assertEquals("order status: orderId=99 clientId=1 permId=0 status= filled=0 remaining=98 avgFillPrice=0.0 lastFillPrice=1.0 parent Id=102 whyHeld=null", string0);
  }

  /**
  //Test case number: 62
  /*Coverage entropy=0.3333333333333333
  */
  @Test(timeout = 4000)
  public void test62()  throws Throwable  {
      Order order0 = new Order();
      String string0 = EWrapperMsgGenerator.orderStatus(2, (String) null, '?', '?', 1.7976931348623157E308, 'n', 0, 1.7976931348623157E308, Integer.MAX_VALUE, (String) null);
      assertEquals("order status: orderId=2 clientId=2147483647 permId=110 status=null filled=63 remaining=63 avgFillPrice=1.7976931348623157E308 lastFillPrice=1.7976931348623157E308 parent Id=0 whyHeld=null", string0);
  }

  /**
  //Test case number: 63
  /*Coverage entropy=0.3333333333333333
  */
  @Test(timeout = 4000)
  public void test63()  throws Throwable  {
      Order order0 = new Order();
      String string0 = EWrapperMsgGenerator.fundamentalData(0, "");
      assertEquals("id  = 0 len = 0\n", string0);
  }

  /**
  //Test case number: 64
  /*Coverage entropy=0.3333333333333333
  */
  @Test(timeout = 4000)
  public void test64()  throws Throwable  {
      Order order0 = new Order();
      String string0 = EWrapperMsgGenerator.historicalData(1, (String) null, Integer.MAX_VALUE, 0, 2, 0, 'n', 0, 0.0, false);
      assertEquals("id=1 date = null open=2.147483647E9 high=0.0 low=2.0 close=0.0 volume=110 count=0 WAP=0.0 hasGaps=false", string0);
  }

  /**
  //Test case number: 65
  /*Coverage entropy=0.3333333333333333
  */
  @Test(timeout = 4000)
  public void test65()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.execDetailsEnd(10);
      assertEquals("reqId = 10 =============== end ===============", string0);
  }

  /**
  //Test case number: 66
  /*Coverage entropy=0.3333333333333333
  */
  @Test(timeout = 4000)
  public void test66()  throws Throwable  {
      ContractDetails contractDetails0 = new ContractDetails();
      String string0 = EWrapperMsgGenerator.bondContractDetails(0, contractDetails0);
      assertEquals("reqId = 0 ===================================\n ---- Bond Contract Details begin ----\nsymbol = null\nsecType = null\ncusip = null\ncoupon = 0.0\nmaturity = null\nissueDate = null\nratings = null\nbondType = null\ncouponType = null\nconvertible = false\ncallable = false\nputable = false\ndescAppend = null\nexchange = null\ncurrency = null\nmarketName = null\ntradingClass = null\nconid = 0\nminTick = 0.0\norderTypes = null\nvalidExchanges = null\nnextOptionDate = null\nnextOptionType = null\nnextOptionPartial = false\nnotes = null\nlongName = null\n ---- Bond Contract Details End ----\n", string0);
  }

  /**
  //Test case number: 67
  /*Coverage entropy=0.3333333333333333
  */
  @Test(timeout = 4000)
  public void test67()  throws Throwable  {
      OrderState orderState0 = new OrderState();
      Contract contract0 = new Contract();
      // Undeclared exception!
      try { 
        EWrapperMsgGenerator.deltaNeutralValidation(0, (UnderComp) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.ib.client.EWrapperMsgGenerator", e);
      }
  }

  /**
  //Test case number: 68
  /*Coverage entropy=0.3333333333333333
  */
  @Test(timeout = 4000)
  public void test68()  throws Throwable  {
      Order order0 = new Order();
      String string0 = EWrapperMsgGenerator.updateAccountValue((String) null, "", (String) null, (String) null);
      assertEquals("updateAccountValue: null  null null", string0);
  }

  /**
  //Test case number: 69
  /*Coverage entropy=0.3333333333333333
  */
  @Test(timeout = 4000)
  public void test69()  throws Throwable  {
      Order order0 = new Order();
      String string0 = EWrapperMsgGenerator.updateAccountValue((String) null, (String) null, (String) null, "");
      assertEquals("updateAccountValue: null null null ", string0);
  }

  /**
  //Test case number: 70
  /*Coverage entropy=0.3333333333333333
  */
  @Test(timeout = 4000)
  public void test70()  throws Throwable  {
      Order order0 = new Order();
      String string0 = EWrapperMsgGenerator.updateAccountValue((String) null, (String) null, "O", (String) null);
      assertEquals("updateAccountValue: null null O null", string0);
  }

  /**
  //Test case number: 71
  /*Coverage entropy=0.3333333333333333
  */
  @Test(timeout = 4000)
  public void test71()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.tickSnapshotEnd((-7));
      assertEquals("id=-7 =============== end ===============", string0);
  }

  /**
  //Test case number: 72
  /*Coverage entropy=0.3333333333333333
  */
  @Test(timeout = 4000)
  public void test72()  throws Throwable  {
      UnderComp underComp0 = new UnderComp();
      String string0 = EWrapperMsgGenerator.deltaNeutralValidation(1798, underComp0);
      assertEquals("id = 1798 underComp.conId =0 underComp.delta =0.0 underComp.price =0.0", string0);
  }

  /**
  //Test case number: 73
  /*Coverage entropy=0.3333333333333333
  */
  @Test(timeout = 4000)
  public void test73()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.scannerParameters("X*5dooF.kRN/");
      assertEquals("SCANNER PARAMETERS:\nX*5dooF.kRN/", string0);
  }

  /**
  //Test case number: 74
  /*Coverage entropy=0.3333333333333333
  */
  @Test(timeout = 4000)
  public void test74()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.managedAccounts(" secType=");
      assertEquals("Connected : The list of managed accounts are : [ secType=]", string0);
  }

  /**
  //Test case number: 75
  /*Coverage entropy=0.3333333333333333
  */
  @Test(timeout = 4000)
  public void test75()  throws Throwable  {
      Order order0 = new Order();
      String string0 = EWrapperMsgGenerator.contractDetailsEnd(0);
      assertEquals("reqId = 0 =============== end ===============", string0);
  }

  /**
  //Test case number: 76
  /*Coverage entropy=0.3333333333333333
  */
  @Test(timeout = 4000)
  public void test76()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.nextValidId((-137));
      assertEquals("Next Valid Order ID: -137", string0);
  }
}
