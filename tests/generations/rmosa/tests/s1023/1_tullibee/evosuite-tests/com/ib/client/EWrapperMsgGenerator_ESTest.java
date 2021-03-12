/*
 * This file was automatically generated by EvoSuite
 * Mon Nov 09 12:42:14 GMT 2020
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
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      ContractDetails contractDetails0 = new ContractDetails();
      String string0 = EWrapperMsgGenerator.scannerData((-1881116999), 180, contractDetails0, (String) null, (String) null, (String) null, (String) null);
      assertEquals("id = -1881116999 rank=180 symbol=null secType=null expiry=null strike=0.0 right=null exchange=null currency=null localSymbol=null marketName=null tradingClass=null distance=null benchmark=null projection=null legsStr=null", string0);
  }

  /**
  //Test case number: 1
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.realtimeBar(37, 0, Integer.MAX_VALUE, 0, 37, 1.7976931348623157E308, Integer.MAX_VALUE, Integer.MAX_VALUE, 0);
      assertEquals("id=37 time = 0 open=2.147483647E9 high=0.0 low=37.0 close=1.7976931348623157E308 volume=2147483647 count=0 WAP=2.147483647E9", string0);
  }

  /**
  //Test case number: 2
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.historicalData(0, (String) null, 1.7976931348623157E308, Integer.MAX_VALUE, 0, 1.7976931348623157E308, 'y', 'f', Integer.MAX_VALUE, false);
      assertEquals("id=0 date = null open=1.7976931348623157E308 high=2.147483647E9 low=0.0 close=1.7976931348623157E308 volume=121 count=102 WAP=2.147483647E9 hasGaps=false", string0);
  }

  /**
  //Test case number: 3
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.updateMktDepth(0, 0, Integer.MAX_VALUE, 0, 1.7976931348623157E308, '?');
      assertEquals("updateMktDepth: 0 0 2147483647 0 1.7976931348623157E308 63", string0);
  }

  /**
  //Test case number: 4
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.updateAccountValue((String) null, "", (String) null, (String) null);
      assertEquals("updateAccountValue: null  null null", string0);
  }

  /**
  //Test case number: 5
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.updateAccountValue((String) null, (String) null, "", (String) null);
      assertEquals("updateAccountValue: null null  null", string0);
  }

  /**
  //Test case number: 6
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.orderStatus(Integer.MAX_VALUE, (String) null, 0, 0, 1.7976931348623157E308, 0, 1, 0, 0, (String) null);
      assertEquals("order status: orderId=2147483647 clientId=0 permId=0 status=null filled=0 remaining=0 avgFillPrice=1.7976931348623157E308 lastFillPrice=0.0 parent Id=1 whyHeld=null", string0);
  }

  /**
  //Test case number: 7
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.tickOptionComputation(Integer.MAX_VALUE, 13, (-220.65640976328), 1.7976931348623157E308, 1.7976931348623157E308, 0);
      assertEquals("id=2147483647  modelOptComp: vol = N/A delta = N/A: modelPrice = N/A: pvDividend = 0.0", string0);
  }

  /**
  //Test case number: 8
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.tickOptionComputation(0, Integer.MAX_VALUE, 0.0, 0, 1.7976931348623157E308, 1.7976931348623157E308);
      assertEquals("id=0  unknown: vol = 0.0 delta = 0.0", string0);
  }

  /**
  //Test case number: 9
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.tickOptionComputation(Integer.MAX_VALUE, 0, 0, 1, 1.7976931348623157E308, 1.7976931348623157E308);
      assertEquals("id=2147483647  bidSize: vol = 0.0 delta = 1.0", string0);
  }

  /**
  //Test case number: 10
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.tickOptionComputation(13, 13, 0, 13, 0, 13);
      assertEquals("id=13  modelOptComp: vol = 0.0 delta = N/A: modelPrice = 0.0: pvDividend = 13.0", string0);
  }

  /**
  //Test case number: 11
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.tickPrice(0, 0, 0, 'm');
      assertEquals("id=0  bidSize=0.0  canAutoExecute", string0);
  }

  /**
  //Test case number: 12
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Contract contract0 = new Contract();
      String string0 = EWrapperMsgGenerator.updatePortfolio(contract0, Integer.MAX_VALUE, 1.7976931348623157E308, Integer.MAX_VALUE, (-751.215598838), 0.0, 760.5048103752993, "J}lW}-iTS5@IxEwb?J");
      assertEquals("updatePortfolio: conid = 0\nsymbol = null\nsecType = null\nexpiry = null\nstrike = 0.0\nright = null\nmultiplier = null\nexchange = null\nprimaryExch = null\ncurrency = null\nlocalSymbol = null\n2147483647 1.7976931348623157E308 2.147483647E9 -751.215598838 0.0 760.5048103752993 J}lW}-iTS5@IxEwb?J", string0);
  }

  /**
  //Test case number: 13
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      ContractDetails contractDetails0 = new ContractDetails();
      String string0 = EWrapperMsgGenerator.scannerData((-1008), (-1008), contractDetails0, (String) null, "m: f#J>\"q+;6", "H>]Jfq9  Ig7~/kQ;p-", "low");
      assertEquals("id = -1008 rank=-1008 symbol=null secType=null expiry=null strike=0.0 right=null exchange=null currency=null localSymbol=null marketName=null tradingClass=null distance=null benchmark=m: f#J>\"q+;6 projection=H>]Jfq9  Ig7~/kQ;p- legsStr=low", string0);
  }

  /**
  //Test case number: 14
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.fundamentalData(Integer.MAX_VALUE, "");
      assertEquals("id  = 2147483647 len = 0\n", string0);
  }

  /**
  //Test case number: 15
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Contract contract0 = new Contract();
      Execution execution0 = new Execution();
      String string0 = EWrapperMsgGenerator.execDetails((-1), contract0, execution0);
      assertEquals(" ---- Execution Details begin ----\nreqId = -1\norderId = 0\nclientId = 0\nsymbol = null\nsecType = null\nexpiry = null\nstrike = 0.0\nright = null\ncontractExchange = null\ncurrency = null\nlocalSymbol = null\nexecId = null\ntime = null\nacctNumber = null\nexecutionExchange = null\nside = null\nshares = 0\nprice = 0.0\npermId = 0\nliquidation = 0\ncumQty = 0\navgPrice = 0.0\n ---- Execution Details end ----\n", string0);
  }

  /**
  //Test case number: 16
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      UnderComp underComp0 = new UnderComp();
      String string0 = EWrapperMsgGenerator.deltaNeutralValidation(3999, underComp0);
      assertEquals("id = 3999 underComp.conId =0 underComp.delta =0.0 underComp.price =0.0", string0);
  }

  /**
  //Test case number: 17
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Contract contract0 = new Contract();
      String string0 = EWrapperMsgGenerator.contractMsg(contract0);
      assertEquals("conid = 0\nsymbol = null\nsecType = null\nexpiry = null\nstrike = 0.0\nright = null\nmultiplier = null\nexchange = null\nprimaryExch = null\ncurrency = null\nlocalSymbol = null\n", string0);
  }

  /**
  //Test case number: 18
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      ContractDetails contractDetails0 = new ContractDetails();
      String string0 = EWrapperMsgGenerator.bondContractDetails(Integer.MAX_VALUE, contractDetails0);
      assertEquals("reqId = 2147483647 ===================================\n ---- Bond Contract Details begin ----\nsymbol = null\nsecType = null\ncusip = null\ncoupon = 0.0\nmaturity = null\nissueDate = null\nratings = null\nbondType = null\ncouponType = null\nconvertible = false\ncallable = false\nputable = false\ndescAppend = null\nexchange = null\ncurrency = null\nmarketName = null\ntradingClass = null\nconid = 0\nminTick = 0.0\norderTypes = null\nvalidExchanges = null\nnextOptionDate = null\nnextOptionType = null\nnextOptionPartial = false\nnotes = null\nlongName = null\n ---- Bond Contract Details End ----\n", string0);
  }

  /**
  //Test case number: 19
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
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
  //Test case number: 20
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
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
  //Test case number: 21
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Contract contract0 = new Contract();
      Order order0 = new Order();
      order0.m_algoStrategy = "O";
      order0.m_algoParams = contract0.m_comboLegs;
      OrderState orderState0 = new OrderState();
      String string0 = EWrapperMsgGenerator.openOrder(0, contract0, order0, orderState0);
      assertNotNull(string0);
  }

  /**
  //Test case number: 22
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Contract contract0 = new Contract();
      Order order0 = new Order();
      order0.m_algoStrategy = "O";
      OrderState orderState0 = new OrderState();
      String string0 = EWrapperMsgGenerator.openOrder(0, contract0, order0, orderState0);
      assertNotNull(string0);
  }

  /**
  //Test case number: 23
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      Order order0 = new Order();
      OrderState orderState0 = new OrderState();
      Contract contract0 = new Contract();
      UnderComp underComp0 = new UnderComp();
      contract0.m_underComp = underComp0;
      String string0 = EWrapperMsgGenerator.openOrder(860, contract0, order0, orderState0);
      assertNotNull(string0);
  }

  /**
  //Test case number: 24
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      Order order0 = new Order();
      order0.m_basisPoints = 3503.0;
      Contract contract0 = new Contract(0, (String) null, "BAG", (String) null, 2, (String) null, (String) null, (String) null, (String) null, (String) null, (Vector) null, "BAG", false, "O", (String) null);
      OrderState orderState0 = new OrderState();
      String string0 = EWrapperMsgGenerator.openOrder(2, contract0, order0, orderState0);
      assertNotNull(string0);
  }

  /**
  //Test case number: 25
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      Order order0 = new Order();
      Contract contract0 = new Contract(0, (String) null, "BAG", (String) null, 2, (String) null, (String) null, (String) null, (String) null, (String) null, (Vector) null, "BAG", false, "O", (String) null);
      OrderState orderState0 = new OrderState();
      String string0 = EWrapperMsgGenerator.openOrder(2, contract0, order0, orderState0);
      assertNotNull(string0);
  }

  /**
  //Test case number: 26
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.tickOptionComputation(0, 13, 0.0, 0, 1.7976931348623157E308, 1.7976931348623157E308);
      assertEquals("id=0  modelOptComp: vol = 0.0 delta = 0.0: modelPrice = N/A: pvDividend = N/A", string0);
  }

  /**
  //Test case number: 27
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.tickOptionComputation(13, 13, 13, 13, (-1.0), (-1.0));
      assertEquals("id=13  modelOptComp: vol = 13.0 delta = N/A: modelPrice = N/A: pvDividend = N/A", string0);
  }

  /**
  //Test case number: 28
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.tickOptionComputation(0, 1, 1.7976931348623157E308, 0, 0, '?');
      assertEquals("id=0  bidPrice: vol = N/A delta = 0.0", string0);
  }

  /**
  //Test case number: 29
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.tickOptionComputation((-2437), 13, 13, 13, 935.0, 13);
      assertEquals("id=-2437  modelOptComp: vol = 13.0 delta = N/A: modelPrice = 935.0: pvDividend = 13.0", string0);
  }

  /**
  //Test case number: 30
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.tickPrice((-3583), 592, (-3583), (-3583));
      assertEquals("id=-3583  unknown=-3583.0  canAutoExecute", string0);
  }

  /**
  //Test case number: 31
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.tickPrice(0, Integer.MAX_VALUE, 1.7976931348623157E308, 0);
      assertEquals("id=0  unknown=1.7976931348623157E308  noAutoExecute", string0);
  }

  /**
  //Test case number: 32
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.updateMktDepth('m', 'f', 0, 0, 1.7976931348623157E308, 2);
      assertEquals("updateMktDepth: 109 102 0 0 1.7976931348623157E308 2", string0);
  }

  /**
  //Test case number: 33
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.tickString(0, Integer.MAX_VALUE, "O");
      assertEquals("id=0  unknown=O", string0);
  }

  /**
  //Test case number: 34
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      // Undeclared exception!
      try { 
        EWrapperMsgGenerator.deltaNeutralValidation((-425), (UnderComp) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.ib.client.EWrapperMsgGenerator", e);
      }
  }

  /**
  //Test case number: 35
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.updateNewsBulletin(13, Integer.MAX_VALUE, "", (String) null);
      assertEquals("MsgId=13 :: MsgType=2147483647 :: Origin=null :: Message=", string0);
  }

  /**
  //Test case number: 36
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      // Undeclared exception!
      try { 
        EWrapperMsgGenerator.fundamentalData(3, (String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.ib.client.EWrapperMsgGenerator", e);
      }
  }

  /**
  //Test case number: 37
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      ContractDetails contractDetails0 = new ContractDetails();
      String string0 = EWrapperMsgGenerator.contractDetails(1, contractDetails0);
      assertEquals("reqId = 1 ===================================\n ---- Contract Details begin ----\nconid = 0\nsymbol = null\nsecType = null\nexpiry = null\nstrike = 0.0\nright = null\nmultiplier = null\nexchange = null\nprimaryExch = null\ncurrency = null\nlocalSymbol = null\nmarketName = null\ntradingClass = null\nminTick = 0.0\nprice magnifier = 0\norderTypes = null\nvalidExchanges = null\nunderConId = 0\nlongName = null\ncontractMonth = null\nindustry = null\ncategory = null\nsubcategory = null\ntimeZoneId = null\ntradingHours = null\nliquidHours = null\n ---- Contract Details End ----\n", string0);
  }

  /**
  //Test case number: 38
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      // Undeclared exception!
      try { 
        EWrapperMsgGenerator.updatePortfolio((Contract) null, 0, (-3035.2652987141314), 1.7976931348623157E308, 1.7976931348623157E308, 1.7976931348623157E308, 0, (String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.ib.client.EWrapperMsgGenerator", e);
      }
  }

  /**
  //Test case number: 39
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.updateAccountValue(",*onEG7~IU", ",*onEG7~IU", ",*onEG7~IU", "com.ib.client.AnyWrapperMsgGenerator");
      assertEquals("updateAccountValue: ,*onEG7~IU ,*onEG7~IU ,*onEG7~IU com.ib.client.AnyWrapperMsgGenerator", string0);
  }

  /**
  //Test case number: 40
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.receiveFA(0, (String) null);
      assertEquals("FA: null null", string0);
  }

  /**
  //Test case number: 41
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.contractDetailsEnd((-2725));
      assertEquals("reqId = -2725 =============== end ===============", string0);
  }

  /**
  //Test case number: 42
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.tickSnapshotEnd(16);
      assertEquals("id=16 =============== end ===============", string0);
  }

  /**
  //Test case number: 43
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.orderStatus(0, "", 0, '?', 0, 'b', 0, 0, Integer.MAX_VALUE, (String) null);
      assertEquals("order status: orderId=0 clientId=2147483647 permId=98 status= filled=0 remaining=63 avgFillPrice=0.0 lastFillPrice=0.0 parent Id=0 whyHeld=null", string0);
  }

  /**
  //Test case number: 44
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.scannerDataEnd(1814);
      assertEquals("id = 1814 =============== end ===============", string0);
  }

  /**
  //Test case number: 45
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.tickGeneric(0, Integer.MAX_VALUE, 0);
      assertEquals("id=0  unknown=0.0", string0);
  }

  /**
  //Test case number: 46
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.managedAccounts("\"[}E{x4}_.");
      assertEquals("Connected : The list of managed accounts are : [\"[}E{x4}_.]", string0);
  }

  /**
  //Test case number: 47
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      EWrapperMsgGenerator eWrapperMsgGenerator0 = new EWrapperMsgGenerator();
      assertEquals(" =============== end ===============", eWrapperMsgGenerator0.openOrderEnd());
  }

  /**
  //Test case number: 48
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      ContractDetails contractDetails0 = new ContractDetails((Contract) null, " whatIf=", " ---- Execution Details end ----\n", (-1336), "-l>sa'V_", "-l>sa'V_", 183, " :: Origin=", " :: Origin=", " ---- Execution Details end ----\n", "V", " ---- Execution Details end ----\n", "M]${*;", " :: Origin=", " scalePriceIncrement=");
      // Undeclared exception!
      try { 
        EWrapperMsgGenerator.contractDetails((-1336), contractDetails0);
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
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.accountDownloadEnd("hng?");
      assertEquals("accountDownloadEnd: hng?", string0);
  }

  /**
  //Test case number: 50
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.updateMktDepthL2('f', 'c', "", 0, Integer.MAX_VALUE, 0, 1);
      assertEquals("updateMktDepth: 102 99  0 2147483647 0.0 1", string0);
  }

  /**
  //Test case number: 51
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      // Undeclared exception!
      try { 
        EWrapperMsgGenerator.bondContractDetails(10, (ContractDetails) null);
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
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      // Undeclared exception!
      try { 
        EWrapperMsgGenerator.scannerData((-1), (-1), (ContractDetails) null, "km4]}I#(ONx;TDM@", "km4]}I#(ONx;TDM@", "km4]}I#(ONx;TDM@", "km4]}I#(ONx;TDM@");
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
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.realtimeBar(2147483646, 2147483646, (-2337.0), 2147483646, 2147483646, 3.0, 2147483646, 2147483646, 2147483646);
      assertEquals("id=2147483646 time = 2147483646 open=-2337.0 high=2.147483646E9 low=2.147483646E9 close=3.0 volume=2147483646 count=2147483646 WAP=2.147483646E9", string0);
  }

  /**
  //Test case number: 54
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.nextValidId(0);
      assertEquals("Next Valid Order ID: 0", string0);
  }

  /**
  //Test case number: 55
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.execDetailsEnd((-5119));
      assertEquals("reqId = -5119 =============== end ===============", string0);
  }

  /**
  //Test case number: 56
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test56()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.currentTime(1781L);
      assertEquals("current time = 1781 (Jan 1, 1970 12:29:41 AM)", string0);
  }

  /**
  //Test case number: 57
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test57()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.openOrderEnd();
      assertEquals(" =============== end ===============", string0);
  }

  /**
  //Test case number: 58
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test58()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.tickEFP(0, '?', 'f', "", 'n', Integer.MAX_VALUE, (String) null, 0, 1.7976931348623157E308);
      assertEquals("id=0  unknown: basisPoints = 102.0/ impliedFuture = 110.0 holdDays = 2147483647 futureExpiry = null dividendImpact = 0.0 dividends to expiry = 1.7976931348623157E308", string0);
  }

  /**
  //Test case number: 59
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test59()  throws Throwable  {
      Contract contract0 = new Contract();
      // Undeclared exception!
      try { 
        EWrapperMsgGenerator.execDetails(529, contract0, (Execution) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.ib.client.EWrapperMsgGenerator", e);
      }
  }

  /**
  //Test case number: 60
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test60()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.tickSize(Integer.MAX_VALUE, 0, 'y');
      assertEquals("id=2147483647  bidSize=121", string0);
  }

  /**
  //Test case number: 61
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test61()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.scannerParameters("Gyx/?WW");
      assertEquals("SCANNER PARAMETERS:\nGyx/?WW", string0);
  }

  /**
  //Test case number: 62
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test62()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.historicalData(0, (String) null, 1.7976931348623157E308, 1.7976931348623157E308, 0, 0, 0, 0, '?', false);
      assertEquals("id=0 date = null open=1.7976931348623157E308 high=1.7976931348623157E308 low=0.0 close=0.0 volume=0 count=0 WAP=63.0 hasGaps=false", string0);
  }

  /**
  //Test case number: 63
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test63()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.updateAccountTime(" QpwhyHeld=");
      assertEquals("updateAccountTime:  QpwhyHeld=", string0);
  }
}
