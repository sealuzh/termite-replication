/*
 * This file was automatically generated by EvoSuite
 * Thu Dec 05 17:16:23 GMT 2019
 */

package com.ib.client;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.ib.client.AnyWrapperMsgGenerator;
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
import org.evosuite.runtime.System;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class EWrapperMsgGenerator_ESTest extends EWrapperMsgGenerator_ESTest_scaffolding {

  /**
  //Test case number: 0
  /*Coverage entropy=1.1375916250043898
  */
  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Order order0 = new Order();
      OrderState orderState0 = new OrderState();
      orderState0.m_commissionCurrency = null;
      orderState0.m_maintMargin = null;
      Contract contract0 = new Contract((-1), (String) null, "BAG", "26WeekHigh", Integer.MAX_VALUE, (String) null, (String) null, (String) null, "", "RTVolume", (Vector) null, ": vol = ", true, "o ,Al<7l3KQzal", (String) null);
      contract0.m_currency = null;
      contract0.m_comboLegs = null;
      contract0.m_includeExpired = false;
      contract0.m_comboLegsDescrip = "com.ib.client.AnyWrapperMsgGenerator";
      orderState0.m_status = null;
      order0.m_stockRefPrice = (-1731.53);
      String string0 = EWrapperMsgGenerator.tickGeneric('y', Integer.MAX_VALUE, Integer.MAX_VALUE);
      assertEquals("id=121  unknown=2.147483647E9", string0);
      
      String string1 = EWrapperMsgGenerator.tickOptionComputation(Integer.MAX_VALUE, 1, 1.7976931348623157E308, 691.8129905835, 0, 546.1196);
      assertEquals("id=2147483647  bidPrice: vol = N/A delta = N/A", string1);
      
      EWrapperMsgGenerator.openOrder(Integer.MAX_VALUE, contract0, order0, orderState0);
      String string2 = EWrapperMsgGenerator.updateNewsBulletin(0, 0, "", "%?~N/&vR}!U");
      assertEquals("MsgId=0 :: MsgType=0 :: Origin=%?~N/&vR}!U :: Message=", string2);
  }

  /**
  //Test case number: 1
  /*Coverage entropy=0.4
  */
  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Order order0 = new Order();
      OrderState orderState0 = new OrderState();
      order0.m_basisPoints = 0.0;
      orderState0.m_commissionCurrency = "";
      orderState0.m_maintMargin = "category = ";
      Contract contract0 = new Contract('n', "category = ", "BAG", "26WeekHigh", Integer.MAX_VALUE, (String) null, (String) null, (String) null, "", (String) null, (Vector) null, ": vol = ", true, (String) null, "26WeekHigh");
      contract0.m_exchange = "id=-2134  bidPrice: vol = 1.0 delta = N/A";
      EWrapperMsgGenerator.openOrder(Integer.MAX_VALUE, contract0, order0, orderState0);
      String string0 = EWrapperMsgGenerator.currentTime((-1072L));
      assertEquals("current time = -1072 (Dec 31, 1969 11:42:08 PM)", string0);
  }

  /**
  //Test case number: 2
  /*Coverage entropy=0.3333333333333333
  */
  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Order order0 = new Order();
      OrderState orderState0 = new OrderState();
      Contract contract0 = new Contract('n', (String) null, "BAG", (String) null, Integer.MAX_VALUE, (String) null, (String) null, (String) null, "", (String) null, (Vector) null, (String) null, false, (String) null, (String) null);
      String string0 = EWrapperMsgGenerator.openOrder(0, contract0, order0, orderState0);
      assertNotNull(string0);
  }

  /**
  //Test case number: 3
  /*Coverage entropy=0.3333333333333333
  */
  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      EWrapperMsgGenerator.tickOptionComputation(13, 13, (-224.63), (-224.63), (-224.63), (-224.63));
      System.setCurrentTimeMillis(0L);
  }

  /**
  //Test case number: 4
  /*Coverage entropy=0.3333333333333333
  */
  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Contract contract0 = new Contract();
      String string0 = EWrapperMsgGenerator.tickOptionComputation(0, 13, 0, (-4704.18369915813), (-4704.18369915813), 0);
      assertEquals("id=0  modelOptComp: vol = 0.0 delta = N/A: modelPrice = N/A: pvDividend = 0.0", string0);
  }

  /**
  //Test case number: 5
  /*Coverage entropy=0.3333333333333333
  */
  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Contract contract0 = new Contract();
      UnderComp underComp0 = new UnderComp();
      contract0.m_underComp = underComp0;
      String string0 = AnyWrapperMsgGenerator.error(0, 0, (String) null);
      Order order0 = new Order();
      OrderState orderState0 = new OrderState();
      String string1 = EWrapperMsgGenerator.openOrder(0, contract0, order0, orderState0);
      assertFalse(string1.equals((Object)string0));
  }

  /**
  //Test case number: 6
  /*Coverage entropy=0.3333333333333333
  */
  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Contract contract0 = new Contract();
      String string0 = EWrapperMsgGenerator.tickOptionComputation(13, 13, 13, 0.0, 1851.64254, 13);
      assertEquals("id=13  modelOptComp: vol = 13.0 delta = 0.0: modelPrice = 1851.64254: pvDividend = 13.0", string0);
  }

  /**
  //Test case number: 7
  /*Coverage entropy=0.3333333333333333
  */
  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Order order0 = new Order();
      String string0 = EWrapperMsgGenerator.tickOptionComputation(0, 13, 1.7976931348623157E308, Integer.MAX_VALUE, 0, 0);
      assertEquals("id=0  modelOptComp: vol = N/A delta = N/A: modelPrice = 0.0: pvDividend = 0.0", string0);
  }

  /**
  //Test case number: 8
  /*Coverage entropy=0.3333333333333333
  */
  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Contract contract0 = new Contract();
      String string0 = EWrapperMsgGenerator.tickOptionComputation(0, 13, 0, 13, 0.0, 0);
      assertEquals("id=0  modelOptComp: vol = 0.0 delta = N/A: modelPrice = 0.0: pvDividend = 0.0", string0);
  }

  /**
  //Test case number: 9
  /*Coverage entropy=0.3333333333333333
  */
  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Contract contract0 = new Contract();
      String string0 = EWrapperMsgGenerator.SCANNER_PARAMETERS;
      Order order0 = new Order();
      order0.m_algoStrategy = "SCANNER PARAMETERS:";
      OrderState orderState0 = new OrderState();
      String string1 = EWrapperMsgGenerator.openOrder(0, contract0, order0, orderState0);
      assertFalse(string1.equals((Object)string0));
  }

  /**
  //Test case number: 10
  /*Coverage entropy=0.3333333333333333
  */
  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Order order0 = new Order();
      String string0 = EWrapperMsgGenerator.tickOptionComputation(1431655765, 0, 0.0, 1, 0, 0);
      assertEquals("id=1431655765  bidSize: vol = 0.0 delta = 1.0", string0);
  }

  /**
  //Test case number: 11
  /*Coverage entropy=1.0676032882216056
  */
  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Order order0 = new Order();
      order0.m_parentId = 13;
      EWrapperMsgGenerator.tickOptionComputation(3, 13, 0, 1.7976931348623157E308, 0, 1.7976931348623157E308);
      // Undeclared exception!
      try { 
        EWrapperMsgGenerator.updatePortfolio((Contract) null, 0, 0.0, 1989.59, (-3569.683), Integer.MAX_VALUE, 1985.81965948824, (String) null);
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
      String string0 = EWrapperMsgGenerator.accountDownloadEnd("s0t");
      assertEquals("accountDownloadEnd: s0t", string0);
  }

  /**
  //Test case number: 13
  /*Coverage entropy=0.3333333333333333
  */
  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      // Undeclared exception!
      try { 
        EWrapperMsgGenerator.scannerData((-1614469289), (-2790), (ContractDetails) null, "H9)", "H9)", "H9)", "H9)");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.ib.client.EWrapperMsgGenerator", e);
      }
  }

  /**
  //Test case number: 14
  /*Coverage entropy=0.3333333333333333
  */
  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Order order0 = new Order();
      String string0 = EWrapperMsgGenerator.tickOptionComputation(Integer.MAX_VALUE, 0, 1.7976931348623157E308, 0, 0, Integer.MAX_VALUE);
      assertEquals("id=2147483647  bidSize: vol = N/A delta = 0.0", string0);
  }

  /**
  //Test case number: 15
  /*Coverage entropy=0.3333333333333333
  */
  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Order order0 = new Order();
      String string0 = EWrapperMsgGenerator.tickOptionComputation(3, Integer.MAX_VALUE, 0, 1.7976931348623157E308, 'c', 1.7976931348623157E308);
      assertEquals("id=3  unknown: vol = 0.0 delta = N/A", string0);
  }

  /**
  //Test case number: 16
  /*Coverage entropy=0.3333333333333333
  */
  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Order order0 = new Order();
      String string0 = EWrapperMsgGenerator.tickOptionComputation(0, Integer.MAX_VALUE, 1.7976931348623157E308, 0, 2, 0.0);
      assertEquals("id=0  unknown: vol = N/A delta = 0.0", string0);
  }

  /**
  //Test case number: 17
  /*Coverage entropy=0.3333333333333333
  */
  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Order order0 = new Order();
      String string0 = EWrapperMsgGenerator.tickEFP(Integer.MAX_VALUE, 'c', 0, "", 1.7976931348623157E308, Integer.MAX_VALUE, (String) null, 'c', 0);
      assertEquals("id=2147483647  unknown: basisPoints = 0.0/ impliedFuture = 1.7976931348623157E308 holdDays = 2147483647 futureExpiry = null dividendImpact = 99.0 dividends to expiry = 0.0", string0);
  }

  /**
  //Test case number: 18
  /*Coverage entropy=0.3333333333333333
  */
  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Order order0 = new Order();
      String string0 = EWrapperMsgGenerator.tickEFP('?', 0, 'b', (String) null, Integer.MAX_VALUE, 0, (String) null, 'c', 1.7976931348623157E308);
      assertEquals("id=63  bidSize: basisPoints = 98.0/null impliedFuture = 2.147483647E9 holdDays = 0 futureExpiry = null dividendImpact = 99.0 dividends to expiry = 1.7976931348623157E308", string0);
  }

  /**
  //Test case number: 19
  /*Coverage entropy=0.3333333333333333
  */
  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Order order0 = new Order();
      String string0 = EWrapperMsgGenerator.tickEFP('m', Integer.MAX_VALUE, 1.7976931348623157E308, (String) null, 1, 0, (String) null, 0, 1.7976931348623157E308);
      assertEquals("id=109  unknown: basisPoints = 1.7976931348623157E308/null impliedFuture = 1.0 holdDays = 0 futureExpiry = null dividendImpact = 0.0 dividends to expiry = 1.7976931348623157E308", string0);
  }

  /**
  //Test case number: 20
  /*Coverage entropy=0.3333333333333333
  */
  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Order order0 = new Order();
      String string0 = EWrapperMsgGenerator.tickOptionComputation(Integer.MAX_VALUE, 0, (-1800.10530126), 0, 0, 0);
      assertEquals("id=2147483647  bidSize: vol = N/A delta = 0.0", string0);
  }

  /**
  //Test case number: 21
  /*Coverage entropy=0.3333333333333333
  */
  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.tickSnapshotEnd((-1134846518));
      assertEquals("id=-1134846518 =============== end ===============", string0);
  }

  /**
  //Test case number: 22
  /*Coverage entropy=0.3333333333333333
  */
  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Order order0 = new Order();
      ContractDetails contractDetails0 = new ContractDetails();
      String string0 = EWrapperMsgGenerator.scannerData(0, 0, contractDetails0, "5t+yG)w[", (String) null, "5t+yG)w[", "HB?4@E");
      assertEquals("id = 0 rank=0 symbol=null secType=null expiry=null strike=0.0 right=null exchange=null currency=null localSymbol=null marketName=null tradingClass=null distance=5t+yG)w[ benchmark=null projection=5t+yG)w[ legsStr=HB?4@E", string0);
  }

  /**
  //Test case number: 23
  /*Coverage entropy=0.3333333333333333
  */
  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      ContractDetails contractDetails0 = new ContractDetails();
      contractDetails0.m_liquidHours = "PROFILES";
      String string0 = EWrapperMsgGenerator.scannerData((-1), 2793, contractDetails0, (String) null, (String) null, (String) null, (String) null);
      assertEquals("id = -1 rank=2793 symbol=null secType=null expiry=null strike=0.0 right=null exchange=null currency=null localSymbol=null marketName=null tradingClass=null distance=null benchmark=null projection=null legsStr=null", string0);
  }

  /**
  //Test case number: 24
  /*Coverage entropy=0.3333333333333333
  */
  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      Order order0 = new Order();
      String string0 = EWrapperMsgGenerator.receiveFA(3, (String) null);
      assertEquals("FA: ALIASES null", string0);
  }

  /**
  //Test case number: 25
  /*Coverage entropy=0.3333333333333333
  */
  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      Order order0 = new Order();
      String string0 = EWrapperMsgGenerator.tickOptionComputation(3, 1, 0, 1.7976931348623157E308, 0, 1.7976931348623157E308);
      assertEquals("id=3  bidPrice: vol = 0.0 delta = N/A", string0);
  }

  /**
  //Test case number: 26
  /*Coverage entropy=0.3333333333333333
  */
  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      ContractDetails contractDetails0 = new ContractDetails();
      String string0 = EWrapperMsgGenerator.scannerData((-1083), (-1083), contractDetails0, "26WeekLow", (String) null, (String) null, (String) null);
      assertEquals("id = -1083 rank=-1083 symbol=null secType=null expiry=null strike=0.0 right=null exchange=null currency=null localSymbol=null marketName=null tradingClass=null distance=26WeekLow benchmark=null projection=null legsStr=null", string0);
  }

  /**
  //Test case number: 27
  /*Coverage entropy=0.3333333333333333
  */
  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.nextValidId((-1623829864));
      assertEquals("Next Valid Order ID: -1623829864", string0);
  }

  /**
  //Test case number: 28
  /*Coverage entropy=0.3333333333333333
  */
  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      Order order0 = new Order();
      OrderState orderState0 = new OrderState();
      Contract contract0 = new Contract();
      String string0 = EWrapperMsgGenerator.openOrder(Integer.MAX_VALUE, contract0, order0, orderState0);
      assertNotNull(string0);
  }

  /**
  //Test case number: 29
  /*Coverage entropy=0.3333333333333333
  */
  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      Order order0 = new Order();
      String string0 = EWrapperMsgGenerator.tickOptionComputation(0, Integer.MAX_VALUE, 1.7976931348623157E308, Integer.MAX_VALUE, Integer.MAX_VALUE, 0);
      assertEquals("id=0  unknown: vol = N/A delta = N/A", string0);
  }

  /**
  //Test case number: 30
  /*Coverage entropy=0.3333333333333333
  */
  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      Order order0 = new Order();
      OrderState orderState0 = new OrderState();
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
  //Test case number: 31
  /*Coverage entropy=0.3333333333333333
  */
  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.execDetailsEnd(2145752955);
      assertEquals("reqId = 2145752955 =============== end ===============", string0);
  }

  /**
  //Test case number: 32
  /*Coverage entropy=0.3333333333333333
  */
  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.updateAccountValue("zaLAW", "Z4OT:!)N.Z", "E?5z9", "E?5z9");
      assertEquals("updateAccountValue: zaLAW Z4OT:!)N.Z E?5z9 E?5z9", string0);
  }

  /**
  //Test case number: 33
  /*Coverage entropy=0.3333333333333333
  */
  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      Contract contract0 = new Contract();
      UnderComp underComp0 = contract0.m_underComp;
      // Undeclared exception!
      try { 
        EWrapperMsgGenerator.deltaNeutralValidation((-1111989800), (UnderComp) null);
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
      String string0 = EWrapperMsgGenerator.updateMktDepthL2(1, 0, (String) null, Integer.MAX_VALUE, 0, 1.7976931348623157E308, 'm');
      assertEquals("updateMktDepth: 1 0 null 2147483647 0 1.7976931348623157E308 109", string0);
  }

  /**
  //Test case number: 35
  /*Coverage entropy=0.3333333333333333
  */
  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      Order order0 = new Order();
      String string0 = EWrapperMsgGenerator.updateMktDepthL2(0, Integer.MAX_VALUE, (String) null, 0, 0, 0.0, 'y');
      assertEquals("updateMktDepth: 0 2147483647 null 0 0 0.0 121", string0);
  }

  /**
  //Test case number: 36
  /*Coverage entropy=0.3333333333333333
  */
  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.realtimeBar(553, 553, 553, 553, 793.252975, 793.252975, 0L, 0L, 553);
      assertEquals("id=553 time = 553 open=553.0 high=553.0 low=793.252975 close=793.252975 volume=0 count=553 WAP=0.0", string0);
  }

  /**
  //Test case number: 37
  /*Coverage entropy=0.3333333333333333
  */
  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.realtimeBar((-1061), 0L, (-1479.30566580714), (-1061), (-1061), 0L, 0L, (-1061), 1);
      assertEquals("id=-1061 time = 0 open=-1479.30566580714 high=-1061.0 low=-1061.0 close=0.0 volume=0 count=1 WAP=-1061.0", string0);
  }

  /**
  //Test case number: 38
  /*Coverage entropy=0.3333333333333333
  */
  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      Order order0 = new Order();
      String string0 = EWrapperMsgGenerator.tickPrice(0, 0, 0, Integer.MAX_VALUE);
      assertEquals("id=0  bidSize=0.0  canAutoExecute", string0);
  }

  /**
  //Test case number: 39
  /*Coverage entropy=0.3333333333333333
  */
  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      Order order0 = new Order();
      String string0 = EWrapperMsgGenerator.tickPrice(3, Integer.MAX_VALUE, 3, 0);
      assertEquals("id=3  unknown=3.0  noAutoExecute", string0);
  }

  /**
  //Test case number: 40
  /*Coverage entropy=0.3333333333333333
  */
  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.realtimeBar(3921, 3921, 3921, 2633.2692706146713, 3921, 2633.2692706146713, 3921, 2633.2692706146713, 3921);
      assertEquals("id=3921 time = 3921 open=3921.0 high=2633.2692706146713 low=3921.0 close=2633.2692706146713 volume=3921 count=3921 WAP=2633.2692706146713", string0);
  }

  /**
  //Test case number: 41
  /*Coverage entropy=0.3333333333333333
  */
  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      Execution execution0 = new Execution();
      // Undeclared exception!
      try { 
        EWrapperMsgGenerator.execDetails(1, (Contract) null, execution0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.ib.client.EWrapperMsgGenerator", e);
      }
  }

  /**
  //Test case number: 42
  /*Coverage entropy=0.3333333333333333
  */
  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      Contract contract0 = new Contract();
      Execution execution0 = new Execution();
      String string0 = EWrapperMsgGenerator.execDetails(198, contract0, execution0);
      assertEquals(" ---- Execution Details begin ----\nreqId = 198\norderId = 0\nclientId = 0\nsymbol = null\nsecType = null\nexpiry = null\nstrike = 0.0\nright = null\ncontractExchange = null\ncurrency = null\nlocalSymbol = null\nexecId = null\ntime = null\nacctNumber = null\nexecutionExchange = null\nside = null\nshares = 0\nprice = 0.0\npermId = 0\nliquidation = 0\ncumQty = 0\navgPrice = 0.0\n ---- Execution Details end ----\n", string0);
  }

  /**
  //Test case number: 43
  /*Coverage entropy=0.3333333333333333
  */
  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.contractDetailsEnd(0);
      assertEquals("reqId = 0 =============== end ===============", string0);
  }

  /**
  //Test case number: 44
  /*Coverage entropy=0.3333333333333333
  */
  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      EWrapperMsgGenerator eWrapperMsgGenerator0 = new EWrapperMsgGenerator();
      assertEquals(" =============== end ===============", eWrapperMsgGenerator0.openOrderEnd());
  }

  /**
  //Test case number: 45
  /*Coverage entropy=0.3333333333333333
  */
  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      Order order0 = new Order();
      String string0 = EWrapperMsgGenerator.updateMktDepth((-4908), 'c', 1, 0, 0, 'c');
      assertEquals("updateMktDepth: -4908 99 1 0 0.0 99", string0);
  }

  /**
  //Test case number: 46
  /*Coverage entropy=0.3333333333333333
  */
  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      Order order0 = new Order();
      String string0 = EWrapperMsgGenerator.updateAccountValue("", "", (String) null, "");
      assertEquals("updateAccountValue:   null ", string0);
  }

  /**
  //Test case number: 47
  /*Coverage entropy=0.3333333333333333
  */
  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.updateAccountValue("Y", "Y", "Y", (String) null);
      assertEquals("updateAccountValue: Y Y Y null", string0);
  }

  /**
  //Test case number: 48
  /*Coverage entropy=0.3333333333333333
  */
  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      Order order0 = new Order();
      OrderState orderState0 = new OrderState();
      // Undeclared exception!
      try { 
        EWrapperMsgGenerator.openOrder(0, (Contract) null, order0, orderState0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.ib.client.EWrapperMsgGenerator", e);
      }
  }

  /**
  //Test case number: 49
  /*Coverage entropy=0.3333333333333333
  */
  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.fundamentalData(2389, "?(^'`c56o^");
      assertEquals("id  = 2389 len = 10\n?(^'`c56o^", string0);
  }

  /**
  //Test case number: 50
  /*Coverage entropy=0.3333333333333333
  */
  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      Order order0 = new Order();
      String string0 = EWrapperMsgGenerator.historicalData((-96), "zAIJH", (-14.91598872539), 0, 1.7976931348623157E308, 0.0, Integer.MAX_VALUE, Integer.MAX_VALUE, 1.7976931348623157E308, false);
      assertEquals("id=-96 date = zAIJH open=-14.91598872539 high=0.0 low=1.7976931348623157E308 close=0.0 volume=2147483647 count=2147483647 WAP=1.7976931348623157E308 hasGaps=false", string0);
  }

  /**
  //Test case number: 51
  /*Coverage entropy=0.3333333333333333
  */
  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      Order order0 = new Order();
      // Undeclared exception!
      try { 
        EWrapperMsgGenerator.fundamentalData('m', (String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.ib.client.EWrapperMsgGenerator", e);
      }
  }

  /**
  //Test case number: 52
  /*Coverage entropy=0.3333333333333333
  */
  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      Order order0 = new Order();
      String string0 = EWrapperMsgGenerator.historicalData(Integer.MAX_VALUE, "", 0.0, 1.7976931348623157E308, Integer.MAX_VALUE, 0, '?', 0, 'f', false);
      assertEquals("id=2147483647 date =  open=0.0 high=1.7976931348623157E308 low=2.147483647E9 close=0.0 volume=63 count=0 WAP=102.0 hasGaps=false", string0);
  }

  /**
  //Test case number: 53
  /*Coverage entropy=0.3333333333333333
  */
  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.managedAccounts(" startingPrice=");
      assertEquals("Connected : The list of managed accounts are : [ startingPrice=]", string0);
  }

  /**
  //Test case number: 54
  /*Coverage entropy=0.3333333333333333
  */
  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.tickPrice((-2091088768), (-2091088768), (-2091088768), (-2091088768));
      assertEquals("id=-2091088768  unknown=-2.091088768E9  canAutoExecute", string0);
  }

  /**
  //Test case number: 55
  /*Coverage entropy=0.3333333333333333
  */
  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      int int0 = (-590);
      // Undeclared exception!
      try { 
        EWrapperMsgGenerator.bondContractDetails((-590), (ContractDetails) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.ib.client.EWrapperMsgGenerator", e);
      }
  }

  /**
  //Test case number: 56
  /*Coverage entropy=0.3333333333333333
  */
  @Test(timeout = 4000)
  public void test56()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.updateMktDepth((-846), 2146007714, (-846), (-846), 2146007714, (-846));
      assertEquals("updateMktDepth: -846 2146007714 -846 -846 2.146007714E9 -846", string0);
  }

  /**
  //Test case number: 57
  /*Coverage entropy=0.3333333333333333
  */
  @Test(timeout = 4000)
  public void test57()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.scannerDataEnd(2145073453);
      assertEquals("id = 2145073453 =============== end ===============", string0);
  }

  /**
  //Test case number: 58
  /*Coverage entropy=0.3333333333333333
  */
  @Test(timeout = 4000)
  public void test58()  throws Throwable  {
      Order order0 = new Order();
      String string0 = EWrapperMsgGenerator.updateNewsBulletin(1, 'y', (String) null, (String) null);
      assertEquals("MsgId=1 :: MsgType=121 :: Origin=null :: Message=null", string0);
  }

  /**
  //Test case number: 59
  /*Coverage entropy=1.0676032882216056
  */
  @Test(timeout = 4000)
  public void test59()  throws Throwable  {
      Order order0 = new Order();
      OrderState orderState0 = new OrderState();
      String string0 = EWrapperMsgGenerator.tickOptionComputation(0, 13, 1.7976931348623157E308, Integer.MAX_VALUE, 1.7976931348623157E308, 0.0);
      assertEquals("id=0  modelOptComp: vol = N/A delta = N/A: modelPrice = N/A: pvDividend = 0.0", string0);
      
      Contract contract0 = new Contract();
      String string1 = EWrapperMsgGenerator.updatePortfolio(contract0, 2144112402, 1515.6, 0.0, 0.0, 1210.23622343032, 1.7976931348623157E308, (String) null);
      assertEquals("updatePortfolio: conid = 0\nsymbol = null\nsecType = null\nexpiry = null\nstrike = 0.0\nright = null\nmultiplier = null\nexchange = null\nprimaryExch = null\ncurrency = null\nlocalSymbol = null\n2144112402 1515.6 0.0 0.0 1210.23622343032 1.7976931348623157E308 null", string1);
      assertNotNull(string1);
  }

  /**
  //Test case number: 60
  /*Coverage entropy=1.0676032882216056
  */
  @Test(timeout = 4000)
  public void test60()  throws Throwable  {
      Order order0 = new Order();
      String string0 = EWrapperMsgGenerator.tickOptionComputation(3, 13, 0, 1.7976931348623157E308, 'c', 1.7976931348623157E308);
      assertEquals("id=3  modelOptComp: vol = 0.0 delta = N/A: modelPrice = 99.0: pvDividend = N/A", string0);
      
      Contract contract0 = new Contract();
      String string1 = EWrapperMsgGenerator.updatePortfolio(contract0, 0, 1.7976931348623157E308, 1, 1.7976931348623157E308, (-337.7384028913), Integer.MAX_VALUE, (String) null);
      assertEquals("updatePortfolio: conid = 0\nsymbol = null\nsecType = null\nexpiry = null\nstrike = 0.0\nright = null\nmultiplier = null\nexchange = null\nprimaryExch = null\ncurrency = null\nlocalSymbol = null\n0 1.7976931348623157E308 1.0 1.7976931348623157E308 -337.7384028913 2.147483647E9 null", string1);
      assertNotNull(string1);
  }

  /**
  //Test case number: 61
  /*Coverage entropy=0.3333333333333333
  */
  @Test(timeout = 4000)
  public void test61()  throws Throwable  {
      Order order0 = new Order();
      String string0 = EWrapperMsgGenerator.orderStatus(0, (String) null, '?', '?', 1.7976931348623157E308, 0, 0, Integer.MAX_VALUE, Integer.MAX_VALUE, "O");
      assertEquals("order status: orderId=0 clientId=2147483647 permId=0 status=null filled=63 remaining=63 avgFillPrice=1.7976931348623157E308 lastFillPrice=2.147483647E9 parent Id=0 whyHeld=O", string0);
  }

  /**
  //Test case number: 62
  /*Coverage entropy=0.3333333333333333
  */
  @Test(timeout = 4000)
  public void test62()  throws Throwable  {
      Order order0 = new Order();
      String string0 = EWrapperMsgGenerator.orderStatus(3, (String) null, Integer.MAX_VALUE, Integer.MAX_VALUE, 1.7976931348623157E308, Integer.MAX_VALUE, 'n', 0.0, Integer.MAX_VALUE, "O");
      assertEquals("order status: orderId=3 clientId=2147483647 permId=2147483647 status=null filled=2147483647 remaining=2147483647 avgFillPrice=1.7976931348623157E308 lastFillPrice=0.0 parent Id=110 whyHeld=O", string0);
  }

  /**
  //Test case number: 63
  /*Coverage entropy=0.3333333333333333
  */
  @Test(timeout = 4000)
  public void test63()  throws Throwable  {
      Order order0 = new Order();
      String string0 = EWrapperMsgGenerator.tickSize('f', Integer.MAX_VALUE, 0);
      assertEquals("id=102  unknown=0", string0);
  }

  /**
  //Test case number: 64
  /*Coverage entropy=0.3333333333333333
  */
  @Test(timeout = 4000)
  public void test64()  throws Throwable  {
      UnderComp underComp0 = new UnderComp();
      String string0 = EWrapperMsgGenerator.deltaNeutralValidation(2145740560, underComp0);
      assertEquals("id = 2145740560 underComp.conId =0 underComp.delta =0.0 underComp.price =0.0", string0);
  }

  /**
  //Test case number: 65
  /*Coverage entropy=0.3333333333333333
  */
  @Test(timeout = 4000)
  public void test65()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.updateAccountTime((String) null);
      assertEquals("updateAccountTime: null", string0);
  }

  /**
  //Test case number: 66
  /*Coverage entropy=0.3333333333333333
  */
  @Test(timeout = 4000)
  public void test66()  throws Throwable  {
      Order order0 = new Order();
      String string0 = EWrapperMsgGenerator.orderStatus(Integer.MAX_VALUE, (String) null, Integer.MAX_VALUE, 0, 1.7976931348623157E308, 0, 0, 'm', 0, (String) null);
      assertEquals("order status: orderId=2147483647 clientId=0 permId=0 status=null filled=2147483647 remaining=0 avgFillPrice=1.7976931348623157E308 lastFillPrice=109.0 parent Id=0 whyHeld=null", string0);
  }

  /**
  //Test case number: 67
  /*Coverage entropy=0.3333333333333333
  */
  @Test(timeout = 4000)
  public void test67()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.scannerParameters("~J@G2nrj,[*,91TnD?&");
      assertEquals("SCANNER PARAMETERS:\n~J@G2nrj,[*,91TnD?&", string0);
  }

  /**
  //Test case number: 68
  /*Coverage entropy=0.3333333333333333
  */
  @Test(timeout = 4000)
  public void test68()  throws Throwable  {
      ContractDetails contractDetails0 = new ContractDetails();
      String string0 = EWrapperMsgGenerator.bondContractDetails(2147, contractDetails0);
      assertEquals("reqId = 2147 ===================================\n ---- Bond Contract Details begin ----\nsymbol = null\nsecType = null\ncusip = null\ncoupon = 0.0\nmaturity = null\nissueDate = null\nratings = null\nbondType = null\ncouponType = null\nconvertible = false\ncallable = false\nputable = false\ndescAppend = null\nexchange = null\ncurrency = null\nmarketName = null\ntradingClass = null\nconid = 0\nminTick = 0.0\norderTypes = null\nvalidExchanges = null\nnextOptionDate = null\nnextOptionType = null\nnextOptionPartial = false\nnotes = null\nlongName = null\n ---- Bond Contract Details End ----\n", string0);
  }

  /**
  //Test case number: 69
  /*Coverage entropy=0.3333333333333333
  */
  @Test(timeout = 4000)
  public void test69()  throws Throwable  {
      Contract contract0 = new Contract();
      String string0 = EWrapperMsgGenerator.contractMsg(contract0);
      assertEquals("conid = 0\nsymbol = null\nsecType = null\nexpiry = null\nstrike = 0.0\nright = null\nmultiplier = null\nexchange = null\nprimaryExch = null\ncurrency = null\nlocalSymbol = null\n", string0);
  }

  /**
  //Test case number: 70
  /*Coverage entropy=1.3300185960211162
  */
  @Test(timeout = 4000)
  public void test70()  throws Throwable  {
      Order order0 = new Order();
      String string0 = EWrapperMsgGenerator.tickOptionComputation(3, 13, 0, 1.7976931348623157E308, 'c', 1.7976931348623157E308);
      assertEquals("id=3  modelOptComp: vol = 0.0 delta = N/A: modelPrice = 99.0: pvDividend = N/A", string0);
      
      ContractDetails contractDetails0 = new ContractDetails();
      String string1 = EWrapperMsgGenerator.contractDetails(3, contractDetails0);
      assertEquals("reqId = 3 ===================================\n ---- Contract Details begin ----\nconid = 0\nsymbol = null\nsecType = null\nexpiry = null\nstrike = 0.0\nright = null\nmultiplier = null\nexchange = null\nprimaryExch = null\ncurrency = null\nlocalSymbol = null\nmarketName = null\ntradingClass = null\nminTick = 0.0\nprice magnifier = 0\norderTypes = null\nvalidExchanges = null\nunderConId = 0\nlongName = null\ncontractMonth = null\nindustry = null\ncategory = null\nsubcategory = null\ntimeZoneId = null\ntradingHours = null\nliquidHours = null\n ---- Contract Details End ----\n", string1);
  }

  /**
  //Test case number: 71
  /*Coverage entropy=1.0676032882216056
  */
  @Test(timeout = 4000)
  public void test71()  throws Throwable  {
      Order order0 = new Order();
      OrderState orderState0 = new OrderState();
      EWrapperMsgGenerator.tickOptionComputation(0, 13, 1.7976931348623157E308, Integer.MAX_VALUE, 1.7976931348623157E308, 0.0);
      ContractDetails contractDetails0 = new ContractDetails((Contract) null, (String) null, (String) null, 13, "cCgo:Fms@g$v5.*hI*z", "reqId = ", 32, "[1v\"+'#~0p3yD'_$5d5", "q:XCWVlr}u6\" F", "q:XCWVlr}u6\" F", "vnU?dqO*k", ".{S", "cunvH@7+K UJ%:F(d&", "id=0  modelOptComp: vol = N/A delta = N/A: modelPrice = N/A: pvDividend = 0.0", (String) null);
      // Undeclared exception!
      try { 
        EWrapperMsgGenerator.contractDetails(48, contractDetails0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.ib.client.EWrapperMsgGenerator", e);
      }
  }

  /**
  //Test case number: 72
  /*Coverage entropy=0.3333333333333333
  */
  @Test(timeout = 4000)
  public void test72()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.openOrderEnd();
      assertEquals(" =============== end ===============", string0);
  }

  /**
  //Test case number: 73
  /*Coverage entropy=0.3333333333333333
  */
  @Test(timeout = 4000)
  public void test73()  throws Throwable  {
      Order order0 = new Order();
      String string0 = EWrapperMsgGenerator.tickString(Integer.MAX_VALUE, 0, (String) null);
      assertEquals("id=2147483647  bidSize=null", string0);
  }
}
