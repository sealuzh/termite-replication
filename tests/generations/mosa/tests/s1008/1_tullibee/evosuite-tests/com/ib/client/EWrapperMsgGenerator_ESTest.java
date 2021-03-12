/*
 * This file was automatically generated by EvoSuite
 * Fri Nov 06 20:05:46 GMT 2020
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
      String string0 = EWrapperMsgGenerator.scannerData(42, 42, contractDetails0, (String) null, (String) null, "y80e+bze,C(Ld|}VL]5", (String) null);
      assertEquals("id = 42 rank=42 symbol=null secType=null expiry=null strike=0.0 right=null exchange=null currency=null localSymbol=null marketName=null tradingClass=null distance=null benchmark=null projection=y80e+bze,C(Ld|}VL]5 legsStr=null", string0);
  }

  /**
  //Test case number: 1
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      ContractDetails contractDetails0 = new ContractDetails();
      String string0 = EWrapperMsgGenerator.scannerData(0, (-554), contractDetails0, "", (String) null, (String) null, (String) null);
      assertEquals("id = 0 rank=-554 symbol=null secType=null expiry=null strike=0.0 right=null exchange=null currency=null localSymbol=null marketName=null tradingClass=null distance= benchmark=null projection=null legsStr=null", string0);
  }

  /**
  //Test case number: 2
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.realtimeBar((-1610612734), (-1610612734), 13, (-1.0), (-1610612734), (-1610612734), 13, 13, 13);
      assertEquals("id=-1610612734 time = -1610612734 open=13.0 high=-1.0 low=-1.610612734E9 close=-1.610612734E9 volume=13 count=13 WAP=13.0", string0);
  }

  /**
  //Test case number: 3
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.historicalData(Integer.MAX_VALUE, (String) null, 0, 'm', 1, Integer.MAX_VALUE, 'b', 0, 0.0, false);
      assertEquals("id=2147483647 date = null open=0.0 high=109.0 low=1.0 close=2.147483647E9 volume=98 count=0 WAP=0.0 hasGaps=false", string0);
  }

  /**
  //Test case number: 4
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.updateMktDepthL2(3, 'b', (String) null, 0, 'n', 1.7976931348623157E308, 0);
      assertEquals("updateMktDepth: 3 98 null 0 110 1.7976931348623157E308 0", string0);
  }

  /**
  //Test case number: 5
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.updateMktDepth(0, Integer.MAX_VALUE, 'b', 'b', 1.7976931348623157E308, 1);
      assertEquals("updateMktDepth: 0 2147483647 98 98 1.7976931348623157E308 1", string0);
  }

  /**
  //Test case number: 6
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Contract contract0 = new Contract();
      String string0 = EWrapperMsgGenerator.updatePortfolio(contract0, (-2147483645), 0.0, (-2147483645), (-2147483645), 0, 0.0, (String) null);
      assertEquals("updatePortfolio: conid = 0\nsymbol = null\nsecType = null\nexpiry = null\nstrike = 0.0\nright = null\nmultiplier = null\nexchange = null\nprimaryExch = null\ncurrency = null\nlocalSymbol = null\n-2147483645 0.0 -2.147483645E9 -2.147483645E9 0.0 0.0 null", string0);
      assertNotNull(string0);
  }

  /**
  //Test case number: 7
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.updateAccountValue((String) null, (String) null, (String) null, ")=t_GU?cI9>W{</o]");
      assertEquals("updateAccountValue: null null null )=t_GU?cI9>W{</o]", string0);
  }

  /**
  //Test case number: 8
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.updateAccountValue((String) null, (String) null, "", (String) null);
      assertEquals("updateAccountValue: null null  null", string0);
  }

  /**
  //Test case number: 9
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.orderStatus(0, "", 0, Integer.MAX_VALUE, 1.7976931348623157E308, 0, 0, 0, 0, "O");
      assertEquals("order status: orderId=0 clientId=0 permId=0 status= filled=0 remaining=2147483647 avgFillPrice=1.7976931348623157E308 lastFillPrice=0.0 parent Id=0 whyHeld=O", string0);
  }

  /**
  //Test case number: 10
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.orderStatus(0, (String) null, Integer.MAX_VALUE, Integer.MAX_VALUE, 0, 'y', Integer.MAX_VALUE, 1.7976931348623157E308, '?', (String) null);
      assertEquals("order status: orderId=0 clientId=63 permId=121 status=null filled=2147483647 remaining=2147483647 avgFillPrice=0.0 lastFillPrice=1.7976931348623157E308 parent Id=2147483647 whyHeld=null", string0);
  }

  /**
  //Test case number: 11
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.tickEFP(1, 0, 0.0, (String) null, 1, 0, (String) null, 0, 1.7976931348623157E308);
      assertEquals("id=1  bidSize: basisPoints = 0.0/null impliedFuture = 1.0 holdDays = 0 futureExpiry = null dividendImpact = 0.0 dividends to expiry = 1.7976931348623157E308", string0);
  }

  /**
  //Test case number: 12
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.tickOptionComputation(0, 13, 0, 0, 13, 13);
      assertEquals("id=0  modelOptComp: vol = 0.0 delta = 0.0: modelPrice = 13.0: pvDividend = 13.0", string0);
  }

  /**
  //Test case number: 13
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.tickOptionComputation(13, 13, 13, 0, 0, 0);
      assertEquals("id=13  modelOptComp: vol = 13.0 delta = 0.0: modelPrice = 0.0: pvDividend = 0.0", string0);
  }

  /**
  //Test case number: 14
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.tickSize(0, Integer.MAX_VALUE, 0);
      assertEquals("id=0  unknown=0", string0);
  }

  /**
  //Test case number: 15
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.tickPrice(2287, 2287, 2287, 2287);
      assertEquals("id=2287  unknown=2287.0  canAutoExecute", string0);
  }

  /**
  //Test case number: 16
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.tickPrice(Integer.MAX_VALUE, 0, Integer.MAX_VALUE, 0);
      assertEquals("id=2147483647  bidSize=2.147483647E9  noAutoExecute", string0);
  }

  /**
  //Test case number: 17
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Contract contract0 = new Contract();
      Execution execution0 = new Execution();
      String string0 = EWrapperMsgGenerator.execDetails(0, contract0, execution0);
      assertEquals(" ---- Execution Details begin ----\nreqId = 0\norderId = 0\nclientId = 0\nsymbol = null\nsecType = null\nexpiry = null\nstrike = 0.0\nright = null\ncontractExchange = null\ncurrency = null\nlocalSymbol = null\nexecId = null\ntime = null\nacctNumber = null\nexecutionExchange = null\nside = null\nshares = 0\nprice = 0.0\npermId = 0\nliquidation = 0\ncumQty = 0\navgPrice = 0.0\n ---- Execution Details end ----\n", string0);
  }

  /**
  //Test case number: 18
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      UnderComp underComp0 = new UnderComp();
      String string0 = EWrapperMsgGenerator.deltaNeutralValidation(4239, underComp0);
      assertEquals("id = 4239 underComp.conId =0 underComp.delta =0.0 underComp.price =0.0", string0);
  }

  /**
  //Test case number: 19
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Contract contract0 = new Contract();
      String string0 = EWrapperMsgGenerator.contractMsg(contract0);
      assertEquals("conid = 0\nsymbol = null\nsecType = null\nexpiry = null\nstrike = 0.0\nright = null\nmultiplier = null\nexchange = null\nprimaryExch = null\ncurrency = null\nlocalSymbol = null\n", string0);
  }

  /**
  //Test case number: 20
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      ContractDetails contractDetails0 = new ContractDetails();
      String string0 = EWrapperMsgGenerator.bondContractDetails((-1716), contractDetails0);
      assertEquals("reqId = -1716 ===================================\n ---- Bond Contract Details begin ----\nsymbol = null\nsecType = null\ncusip = null\ncoupon = 0.0\nmaturity = null\nissueDate = null\nratings = null\nbondType = null\ncouponType = null\nconvertible = false\ncallable = false\nputable = false\ndescAppend = null\nexchange = null\ncurrency = null\nmarketName = null\ntradingClass = null\nconid = 0\nminTick = 0.0\norderTypes = null\nvalidExchanges = null\nnextOptionDate = null\nnextOptionType = null\nnextOptionPartial = false\nnotes = null\nlongName = null\n ---- Bond Contract Details End ----\n", string0);
  }

  /**
  //Test case number: 21
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      // Undeclared exception!
      try { 
        EWrapperMsgGenerator.updatePortfolio((Contract) null, 0, 0, 0, 0, 0, 1.0, "id=0 =============== end ===============");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.ib.client.EWrapperMsgGenerator", e);
      }
  }

  /**
  //Test case number: 22
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      // Undeclared exception!
      try { 
        EWrapperMsgGenerator.scannerData(13, 13, (ContractDetails) null, " clientId=", "auctionPrice", " clientId=", " clientId=");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.ib.client.EWrapperMsgGenerator", e);
      }
  }

  /**
  //Test case number: 23
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      Order order0 = new Order();
      OrderState orderState0 = new OrderState((String) null, "O", (String) null, (String) null, 0.0, Integer.MAX_VALUE, 0, (String) null, "");
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
  //Test case number: 24
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
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
  //Test case number: 25
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
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
  //Test case number: 26
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      Contract contract0 = new Contract();
      Order order0 = new Order();
      order0.m_algoStrategy = "O";
      order0.m_algoParams = contract0.m_comboLegs;
      OrderState orderState0 = new OrderState();
      String string0 = EWrapperMsgGenerator.openOrder(0, contract0, order0, orderState0);
      assertNotNull(string0);
  }

  /**
  //Test case number: 27
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      Contract contract0 = new Contract();
      Order order0 = new Order();
      order0.m_algoStrategy = "O";
      OrderState orderState0 = new OrderState();
      String string0 = EWrapperMsgGenerator.openOrder(0, contract0, order0, orderState0);
      assertNotNull(string0);
  }

  /**
  //Test case number: 28
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      Contract contract0 = new Contract();
      Order order0 = new Order();
      UnderComp underComp0 = new UnderComp();
      contract0.m_underComp = underComp0;
      OrderState orderState0 = new OrderState();
      String string0 = EWrapperMsgGenerator.openOrder(0, contract0, order0, orderState0);
      assertNotNull(string0);
  }

  /**
  //Test case number: 29
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      Order order0 = new Order();
      Vector<Object> vector0 = new Vector<Object>();
      Contract contract0 = new Contract(2, (String) null, "BAG", (String) null, 0, (String) null, "BAG", "", (String) null, (String) null, vector0, (String) null, false, (String) null, (String) null);
      contract0.m_comboLegsDescrip = "|m*yy9>";
      OrderState orderState0 = new OrderState();
      String string0 = EWrapperMsgGenerator.openOrder(2, contract0, order0, orderState0);
      assertNotNull(string0);
  }

  /**
  //Test case number: 30
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      Order order0 = new Order();
      Vector<Object> vector0 = new Vector<Object>();
      Contract contract0 = new Contract(2, (String) null, "BAG", (String) null, 0, (String) null, "BAG", "", (String) null, (String) null, vector0, (String) null, false, (String) null, (String) null);
      OrderState orderState0 = new OrderState();
      String string0 = EWrapperMsgGenerator.openOrder(0, contract0, order0, orderState0);
      assertNotNull(string0);
  }

  /**
  //Test case number: 31
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.tickOptionComputation(0, 13, 0, 0, 13, 1.7976931348623157E308);
      assertEquals("id=0  modelOptComp: vol = 0.0 delta = 0.0: modelPrice = 13.0: pvDividend = N/A", string0);
  }

  /**
  //Test case number: 32
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.tickOptionComputation(13, 13, (-194.0209551), 35.0, 13, (-194.0209551));
      assertEquals("id=13  modelOptComp: vol = N/A delta = N/A: modelPrice = 13.0: pvDividend = N/A", string0);
  }

  /**
  //Test case number: 33
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.tickOptionComputation(1759, 13, 1759, 13, 1.7976931348623157E308, 13);
      assertEquals("id=1759  modelOptComp: vol = 1759.0 delta = N/A: modelPrice = N/A: pvDividend = 13.0", string0);
  }

  /**
  //Test case number: 34
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.tickOptionComputation(1759, 1759, 1759, 1.0, 1.0, 1.0);
      assertEquals("id=1759  unknown: vol = 1759.0 delta = 1.0", string0);
  }

  /**
  //Test case number: 35
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.tickOptionComputation(2, 0, 1.7976931348623157E308, 1.7976931348623157E308, 1.7976931348623157E308, 1.7976931348623157E308);
      assertEquals("id=2  bidSize: vol = N/A delta = N/A", string0);
  }

  /**
  //Test case number: 36
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.tickOptionComputation((-128820583), 13, (-128820583), 13, (-128820583), 13);
      assertEquals("id=-128820583  modelOptComp: vol = N/A delta = N/A: modelPrice = N/A: pvDividend = 13.0", string0);
  }

  /**
  //Test case number: 37
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.tickPrice((-2919), (-2919), (-2919), (-2919));
      assertEquals("id=-2919  unknown=-2919.0  canAutoExecute", string0);
  }

  /**
  //Test case number: 38
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.tickPrice(0, 3, 'n', 0);
      assertEquals("id=0  askSize=110.0  noAutoExecute", string0);
  }

  /**
  //Test case number: 39
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.updateMktDepth(0, 0, Integer.MAX_VALUE, 0, 1.7976931348623157E308, 0);
      assertEquals("updateMktDepth: 0 0 2147483647 0 1.7976931348623157E308 0", string0);
  }

  /**
  //Test case number: 40
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.tickString(Integer.MAX_VALUE, 'm', (String) null);
      assertEquals("id=2147483647  unknown=null", string0);
  }

  /**
  //Test case number: 41
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
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
  //Test case number: 42
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.updateNewsBulletin(Integer.MAX_VALUE, 0, (String) null, "");
      assertEquals("MsgId=2147483647 :: MsgType=0 :: Origin= :: Message=null", string0);
  }

  /**
  //Test case number: 43
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.fundamentalData(0, "O");
      assertEquals("id  = 0 len = 1\nO", string0);
  }

  /**
  //Test case number: 44
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      Contract contract0 = new Contract();
      ContractDetails contractDetails0 = new ContractDetails(contract0, (String) null, (String) null, 0, "57T?z%{[KC'-(W+9pag", "85\"ZR,'0H=JtK", 0, "nt9,X", (String) null, " strike=", (String) null, (String) null, "po,#}_|R]", (String) null, (String) null);
      String string0 = EWrapperMsgGenerator.contractDetails((-1448), contractDetails0);
      assertEquals("reqId = -1448 ===================================\n ---- Contract Details begin ----\nconid = 0\nsymbol = null\nsecType = null\nexpiry = null\nstrike = 0.0\nright = null\nmultiplier = null\nexchange = null\nprimaryExch = null\ncurrency = null\nlocalSymbol = null\nmarketName = null\ntradingClass = null\nminTick = 0.0\nprice magnifier = 0\norderTypes = 57T?z%{[KC'-(W+9pag\nvalidExchanges = 85\"ZR,'0H=JtK\nunderConId = 0\nlongName = nt9,X\ncontractMonth = null\nindustry =  strike=\ncategory = null\nsubcategory = null\ntimeZoneId = po,#}_|R]\ntradingHours = null\nliquidHours = null\n ---- Contract Details End ----\n", string0);
  }

  /**
  //Test case number: 45
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      Contract contract0 = new Contract();
      String string0 = EWrapperMsgGenerator.updatePortfolio(contract0, (-160), (-160), 1.7976931348623157E308, 0.0, 1.7976931348623157E308, 0.0, (String) null);
      assertEquals("updatePortfolio: conid = 0\nsymbol = null\nsecType = null\nexpiry = null\nstrike = 0.0\nright = null\nmultiplier = null\nexchange = null\nprimaryExch = null\ncurrency = null\nlocalSymbol = null\n-160 -160.0 1.7976931348623157E308 0.0 1.7976931348623157E308 0.0 null", string0);
      assertNotNull(string0);
  }

  /**
  //Test case number: 46
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.updateAccountValue("YityWs_[GER=4#J=FS", "PxU@h", "PxU@h", "PxU@h");
      assertEquals("updateAccountValue: YityWs_[GER=4#J=FS PxU@h PxU@h PxU@h", string0);
  }

  /**
  //Test case number: 47
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.receiveFA(Integer.MAX_VALUE, (String) null);
      assertEquals("FA: null null", string0);
  }

  /**
  //Test case number: 48
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.contractDetailsEnd(13);
      assertEquals("reqId = 13 =============== end ===============", string0);
  }

  /**
  //Test case number: 49
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.tickSnapshotEnd(0);
      assertEquals("id=0 =============== end ===============", string0);
  }

  /**
  //Test case number: 50
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.orderStatus('m', (String) null, 0, '?', 1.7976931348623157E308, 0, Integer.MAX_VALUE, 1.7976931348623157E308, 0, (String) null);
      assertEquals("order status: orderId=109 clientId=0 permId=0 status=null filled=0 remaining=63 avgFillPrice=1.7976931348623157E308 lastFillPrice=1.7976931348623157E308 parent Id=2147483647 whyHeld=null", string0);
  }

  /**
  //Test case number: 51
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.scannerDataEnd(0);
      assertEquals("id = 0 =============== end ===============", string0);
  }

  /**
  //Test case number: 52
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.tickGeneric('y', 0, 1.7976931348623157E308);
      assertEquals("id=121  bidSize=1.7976931348623157E308", string0);
  }

  /**
  //Test case number: 53
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.managedAccounts("c7oXYw='\"");
      assertEquals("Connected : The list of managed accounts are : [c7oXYw='\"]", string0);
  }

  /**
  //Test case number: 54
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      EWrapperMsgGenerator eWrapperMsgGenerator0 = new EWrapperMsgGenerator();
      assertEquals("Connection Closed", eWrapperMsgGenerator0.connectionClosed());
  }

  /**
  //Test case number: 55
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      // Undeclared exception!
      try { 
        EWrapperMsgGenerator.contractDetails(0, (ContractDetails) null);
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
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test56()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.accountDownloadEnd("WeB:ugWP3}sqV");
      assertEquals("accountDownloadEnd: WeB:ugWP3}sqV", string0);
  }

  /**
  //Test case number: 57
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test57()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.updateMktDepthL2(0, 0, (String) null, 0, 'f', 'm', 'f');
      assertEquals("updateMktDepth: 0 0 null 0 102 109.0 102", string0);
  }

  /**
  //Test case number: 58
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test58()  throws Throwable  {
      // Undeclared exception!
      try { 
        EWrapperMsgGenerator.bondContractDetails((-555), (ContractDetails) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.ib.client.EWrapperMsgGenerator", e);
      }
  }

  /**
  //Test case number: 59
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test59()  throws Throwable  {
      ContractDetails contractDetails0 = new ContractDetails();
      String string0 = EWrapperMsgGenerator.scannerData(24, 24, contractDetails0, ",l", (String) null, (String) null, "bidExch");
      assertEquals("id = 24 rank=24 symbol=null secType=null expiry=null strike=0.0 right=null exchange=null currency=null localSymbol=null marketName=null tradingClass=null distance=,l benchmark=null projection=null legsStr=bidExch", string0);
  }

  /**
  //Test case number: 60
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test60()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.realtimeBar(358, 358, 358, 3215.008201, 3215.008201, 787.3905, 358, 787.3905, 358);
      assertEquals("id=358 time = 358 open=358.0 high=3215.008201 low=3215.008201 close=787.3905 volume=358 count=358 WAP=787.3905", string0);
  }

  /**
  //Test case number: 61
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test61()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.nextValidId(0);
      assertEquals("Next Valid Order ID: 0", string0);
  }

  /**
  //Test case number: 62
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test62()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.execDetailsEnd(0);
      assertEquals("reqId = 0 =============== end ===============", string0);
  }

  /**
  //Test case number: 63
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test63()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.currentTime(4236L);
      assertEquals("current time = 4236 (Jan 1, 1970 1:10:36 AM)", string0);
  }

  /**
  //Test case number: 64
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test64()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.openOrderEnd();
      assertEquals(" =============== end ===============", string0);
  }

  /**
  //Test case number: 65
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test65()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.tickEFP(0, '?', 2, "", 1.7976931348623157E308, 0, (String) null, 0.0, 0);
      assertEquals("id=0  unknown: basisPoints = 2.0/ impliedFuture = 1.7976931348623157E308 holdDays = 0 futureExpiry = null dividendImpact = 0.0 dividends to expiry = 0.0", string0);
  }

  /**
  //Test case number: 66
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test66()  throws Throwable  {
      Contract contract0 = new Contract();
      // Undeclared exception!
      try { 
        EWrapperMsgGenerator.execDetails(174, contract0, (Execution) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.ib.client.EWrapperMsgGenerator", e);
      }
  }

  /**
  //Test case number: 67
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test67()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.tickSize(0, 0, 20);
      assertEquals("id=0  bidSize=20", string0);
  }

  /**
  //Test case number: 68
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test68()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.scannerParameters(".MS");
      assertEquals("SCANNER PARAMETERS:\n.MS", string0);
  }

  /**
  //Test case number: 69
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test69()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.historicalData(2, "", '?', 0, 0, 0.0, Integer.MAX_VALUE, '?', 1.7976931348623157E308, false);
      assertEquals("id=2 date =  open=63.0 high=0.0 low=0.0 close=0.0 volume=2147483647 count=63 WAP=1.7976931348623157E308 hasGaps=false", string0);
  }

  /**
  //Test case number: 70
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test70()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.updateAccountTime("9kp>\"wnNxYpc");
      assertEquals("updateAccountTime: 9kp>\"wnNxYpc", string0);
  }
}
