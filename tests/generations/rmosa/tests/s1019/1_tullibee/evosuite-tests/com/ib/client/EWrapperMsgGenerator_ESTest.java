/*
 * This file was automatically generated by EvoSuite
 * Mon Nov 09 05:55:33 GMT 2020
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
      String string0 = EWrapperMsgGenerator.scannerData(1, 1, contractDetails0, "id=3450  modelOptComp: vol = N/A delta = N/A: modelPrice = N/A: pvDividend = N/A", " secType=", (String) null, (String) null);
      assertEquals("id = 1 rank=1 symbol=null secType=null expiry=null strike=0.0 right=null exchange=null currency=null localSymbol=null marketName=null tradingClass=null distance=id=3450  modelOptComp: vol = N/A delta = N/A: modelPrice = N/A: pvDividend = N/A benchmark= secType= projection=null legsStr=null", string0);
  }

  /**
  //Test case number: 1
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      ContractDetails contractDetails0 = new ContractDetails();
      String string0 = EWrapperMsgGenerator.scannerData(1018, 2, contractDetails0, (String) null, (String) null, "m?v0}P7[sL Af],", (String) null);
      assertEquals("id = 1018 rank=2 symbol=null secType=null expiry=null strike=0.0 right=null exchange=null currency=null localSymbol=null marketName=null tradingClass=null distance=null benchmark=null projection=m?v0}P7[sL Af], legsStr=null", string0);
  }

  /**
  //Test case number: 2
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.realtimeBar(4349, 2701L, 2701L, 4349, 4349, 4349, 2701L, 36.358988848, 4349);
      assertEquals("id=4349 time = 2701 open=2701.0 high=4349.0 low=4349.0 close=4349.0 volume=2701 count=4349 WAP=36.358988848", string0);
  }

  /**
  //Test case number: 3
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.realtimeBar((-2367), (-2367), (-2367), (-2367), (-2367), 2.0321509563027904, (-2417L), (-2367), (-2367));
      assertEquals("id=-2367 time = -2367 open=-2367.0 high=-2367.0 low=-2367.0 close=2.0321509563027904 volume=-2417 count=-2367 WAP=-2367.0", string0);
  }

  /**
  //Test case number: 4
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.historicalData(1, (String) null, 1.7976931348623157E308, 'y', 0, 0, 'm', 0, 0, false);
      assertEquals("id=1 date = null open=1.7976931348623157E308 high=121.0 low=0.0 close=0.0 volume=109 count=0 WAP=0.0 hasGaps=false", string0);
  }

  /**
  //Test case number: 5
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.updateMktDepthL2(0, 0, (String) null, 3, 0, 1.7976931348623157E308, Integer.MAX_VALUE);
      assertEquals("updateMktDepth: 0 0 null 3 0 1.7976931348623157E308 2147483647", string0);
  }

  /**
  //Test case number: 6
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.updateMktDepth(Integer.MAX_VALUE, Integer.MAX_VALUE, 0, 0, 1.7976931348623157E308, 0);
      assertEquals("updateMktDepth: 2147483647 2147483647 0 0 1.7976931348623157E308 0", string0);
  }

  /**
  //Test case number: 7
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Contract contract0 = new Contract();
      String string0 = EWrapperMsgGenerator.updatePortfolio(contract0, 872, 0.0, 13, 0, 1214.46196512611, 13, (String) null);
      assertEquals("updatePortfolio: conid = 0\nsymbol = null\nsecType = null\nexpiry = null\nstrike = 0.0\nright = null\nmultiplier = null\nexchange = null\nprimaryExch = null\ncurrency = null\nlocalSymbol = null\n872 0.0 13.0 0.0 1214.46196512611 13.0 null", string0);
      assertNotNull(string0);
  }

  /**
  //Test case number: 8
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.updateAccountValue("", (String) null, (String) null, (String) null);
      assertEquals("updateAccountValue:  null null null", string0);
  }

  /**
  //Test case number: 9
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.updateAccountValue("J)", "J)", ">k{+B0E>nq.", ">k{+B0E>nq.");
      assertEquals("updateAccountValue: J) J) >k{+B0E>nq. >k{+B0E>nq.", string0);
  }

  /**
  //Test case number: 10
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.orderStatus(Integer.MAX_VALUE, "O", Integer.MAX_VALUE, 'm', 0, Integer.MAX_VALUE, 0, 1.7976931348623157E308, Integer.MAX_VALUE, "");
      assertEquals("order status: orderId=2147483647 clientId=2147483647 permId=2147483647 status=O filled=2147483647 remaining=109 avgFillPrice=0.0 lastFillPrice=1.7976931348623157E308 parent Id=0 whyHeld=", string0);
  }

  /**
  //Test case number: 11
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.orderStatus(0, (String) null, 0, 0, 1.7976931348623157E308, 1, 'b', 0.0, Integer.MAX_VALUE, (String) null);
      assertEquals("order status: orderId=0 clientId=2147483647 permId=1 status=null filled=0 remaining=0 avgFillPrice=1.7976931348623157E308 lastFillPrice=0.0 parent Id=98 whyHeld=null", string0);
  }

  /**
  //Test case number: 12
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.tickEFP(0, 0, 2, "O", 1.7976931348623157E308, 'b', (String) null, 0, Integer.MAX_VALUE);
      assertEquals("id=0  bidSize: basisPoints = 2.0/O impliedFuture = 1.7976931348623157E308 holdDays = 98 futureExpiry = null dividendImpact = 0.0 dividends to expiry = 2.147483647E9", string0);
  }

  /**
  //Test case number: 13
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.tickOptionComputation(0, Integer.MAX_VALUE, 1.7976931348623157E308, 1, 0, Integer.MAX_VALUE);
      assertEquals("id=0  unknown: vol = N/A delta = 1.0", string0);
  }

  /**
  //Test case number: 14
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.tickOptionComputation(0, Integer.MAX_VALUE, 0, 'c', Integer.MAX_VALUE, 0);
      assertEquals("id=0  unknown: vol = 0.0 delta = N/A", string0);
  }

  /**
  //Test case number: 15
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.tickPrice('f', 0, 0, Integer.MAX_VALUE);
      assertEquals("id=102  bidSize=0.0  canAutoExecute", string0);
  }

  /**
  //Test case number: 16
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Contract contract0 = new Contract();
      String string0 = EWrapperMsgGenerator.updatePortfolio(contract0, 42, 1.7976931348623157E308, 42, 1391.3, 1.7976931348623157E308, 1391.3, (String) null);
      assertEquals("updatePortfolio: conid = 0\nsymbol = null\nsecType = null\nexpiry = null\nstrike = 0.0\nright = null\nmultiplier = null\nexchange = null\nprimaryExch = null\ncurrency = null\nlocalSymbol = null\n42 1.7976931348623157E308 42.0 1391.3 1.7976931348623157E308 1391.3 null", string0);
      assertNotNull(string0);
  }

  /**
  //Test case number: 17
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Contract contract0 = new Contract();
      Order order0 = new Order();
      OrderState orderState0 = new OrderState();
      String string0 = EWrapperMsgGenerator.openOrder(0, contract0, order0, orderState0);
      assertNotNull(string0);
  }

  /**
  //Test case number: 18
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Contract contract0 = new Contract();
      Execution execution0 = new Execution();
      String string0 = EWrapperMsgGenerator.execDetails((-1), contract0, execution0);
      assertEquals(" ---- Execution Details begin ----\nreqId = -1\norderId = 0\nclientId = 0\nsymbol = null\nsecType = null\nexpiry = null\nstrike = 0.0\nright = null\ncontractExchange = null\ncurrency = null\nlocalSymbol = null\nexecId = null\ntime = null\nacctNumber = null\nexecutionExchange = null\nside = null\nshares = 0\nprice = 0.0\npermId = 0\nliquidation = 0\ncumQty = 0\navgPrice = 0.0\n ---- Execution Details end ----\n", string0);
  }

  /**
  //Test case number: 19
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      UnderComp underComp0 = new UnderComp();
      String string0 = EWrapperMsgGenerator.deltaNeutralValidation(37, underComp0);
      assertEquals("id = 37 underComp.conId =0 underComp.delta =0.0 underComp.price =0.0", string0);
  }

  /**
  //Test case number: 20
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Contract contract0 = new Contract();
      String string0 = EWrapperMsgGenerator.contractMsg(contract0);
      assertEquals("conid = 0\nsymbol = null\nsecType = null\nexpiry = null\nstrike = 0.0\nright = null\nmultiplier = null\nexchange = null\nprimaryExch = null\ncurrency = null\nlocalSymbol = null\n", string0);
  }

  /**
  //Test case number: 21
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      ContractDetails contractDetails0 = new ContractDetails();
      String string0 = EWrapperMsgGenerator.bondContractDetails(0, contractDetails0);
      assertEquals("reqId = 0 ===================================\n ---- Bond Contract Details begin ----\nsymbol = null\nsecType = null\ncusip = null\ncoupon = 0.0\nmaturity = null\nissueDate = null\nratings = null\nbondType = null\ncouponType = null\nconvertible = false\ncallable = false\nputable = false\ndescAppend = null\nexchange = null\ncurrency = null\nmarketName = null\ntradingClass = null\nconid = 0\nminTick = 0.0\norderTypes = null\nvalidExchanges = null\nnextOptionDate = null\nnextOptionType = null\nnextOptionPartial = false\nnotes = null\nlongName = null\n ---- Bond Contract Details End ----\n", string0);
  }

  /**
  //Test case number: 22
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      // Undeclared exception!
      try { 
        EWrapperMsgGenerator.fundamentalData(Integer.MAX_VALUE, (String) null);
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
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      Contract contract0 = new Contract();
      Order order0 = new Order();
      order0.m_algoParams = contract0.m_comboLegs;
      order0.m_algoStrategy = "O";
      // Undeclared exception!
      try { 
        EWrapperMsgGenerator.openOrder(1, contract0, order0, (OrderState) null);
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
      Contract contract0 = new Contract();
      Order order0 = new Order();
      order0.m_algoStrategy = "O";
      // Undeclared exception!
      try { 
        EWrapperMsgGenerator.openOrder(1, contract0, order0, (OrderState) null);
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
      UnderComp underComp0 = new UnderComp();
      contract0.m_underComp = underComp0;
      // Undeclared exception!
      try { 
        EWrapperMsgGenerator.openOrder(150, contract0, order0, (OrderState) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.ib.client.EWrapperMsgGenerator", e);
      }
  }

  /**
  //Test case number: 27
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      Contract contract0 = new Contract(767, "BAG", "BAG", "BAG", 767, "(VQV.]a`O;8JhaU", "(VQV.]a`O;8JhaU", "(VQV.]a`O;8JhaU", "BAG", "(VQV.]a`O;8JhaU", (Vector) null, "(VQV.]a`O;8JhaU", false, "BAG", "(VQV.]a`O;8JhaU");
      Order order0 = new Order();
      order0.m_basisPoints = (-1.0);
      // Undeclared exception!
      try { 
        EWrapperMsgGenerator.openOrder(767, contract0, order0, (OrderState) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.ib.client.EWrapperMsgGenerator", e);
      }
  }

  /**
  //Test case number: 28
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      Contract contract0 = new Contract((-2004851050), "BAG", "BAG", "BAG", (-2004851050), "(VQV.]a`O;8JhaU", "(VQV.]a`O;8JhaU", "(VQV.]a`O;8JhaU", "BAG", "(VQV.]a`O;8JhaU", (Vector) null, "(VQV.]a`O;8JhaU", false, "BAG", "(VQV.]a`O;8JhaU");
      contract0.m_comboLegsDescrip = "(VQV.]a`O;8JhaU";
      Order order0 = new Order();
      // Undeclared exception!
      try { 
        EWrapperMsgGenerator.openOrder((-2004851050), contract0, order0, (OrderState) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.ib.client.EWrapperMsgGenerator", e);
      }
  }

  /**
  //Test case number: 29
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.tickOptionComputation(13, 13, 13, 1.7976931348623157E308, 13, 1.7976931348623157E308);
      assertEquals("id=13  modelOptComp: vol = 13.0 delta = N/A: modelPrice = 13.0: pvDividend = N/A", string0);
  }

  /**
  //Test case number: 30
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.tickOptionComputation(13, 13, 13, 1.7976931348623157E308, 1.7976931348623157E308, 13);
      assertEquals("id=13  modelOptComp: vol = 13.0 delta = N/A: modelPrice = N/A: pvDividend = 13.0", string0);
  }

  /**
  //Test case number: 31
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.tickOptionComputation(13, 13, 13, 0.0, 0.0, 0.0);
      assertEquals("id=13  modelOptComp: vol = 13.0 delta = 0.0: modelPrice = 0.0: pvDividend = 0.0", string0);
  }

  /**
  //Test case number: 32
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.tickOptionComputation(0, 0, 1.7976931348623157E308, 0, 0, 1.7976931348623157E308);
      assertEquals("id=0  bidSize: vol = N/A delta = 0.0", string0);
  }

  /**
  //Test case number: 33
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.tickOptionComputation(13, 13, 13, (-1475.776), (-1475.776), (-1475.776));
      assertEquals("id=13  modelOptComp: vol = 13.0 delta = N/A: modelPrice = N/A: pvDividend = N/A", string0);
  }

  /**
  //Test case number: 34
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.tickOptionComputation((-2147483647), (-2147483647), (-2147483647), (-2147483647), (-2147483647), (-2147483647));
      assertEquals("id=-2147483647  unknown: vol = N/A delta = N/A", string0);
  }

  /**
  //Test case number: 35
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.tickPrice((-627), (-627), (-627), (-627));
      assertEquals("id=-627  unknown=-627.0  canAutoExecute", string0);
  }

  /**
  //Test case number: 36
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.tickPrice(Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, 0);
      assertEquals("id=2147483647  unknown=2.147483647E9  noAutoExecute", string0);
  }

  /**
  //Test case number: 37
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.updateMktDepth('?', Integer.MAX_VALUE, Integer.MAX_VALUE, 2, 1.7976931348623157E308, 'c');
      assertEquals("updateMktDepth: 63 2147483647 2147483647 2 1.7976931348623157E308 99", string0);
  }

  /**
  //Test case number: 38
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.tickString(Integer.MAX_VALUE, 'b', (String) null);
      assertEquals("id=2147483647  unknown=null", string0);
  }

  /**
  //Test case number: 39
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      // Undeclared exception!
      try { 
        EWrapperMsgGenerator.deltaNeutralValidation(2142131560, (UnderComp) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.ib.client.EWrapperMsgGenerator", e);
      }
  }

  /**
  //Test case number: 40
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.updateNewsBulletin(Integer.MAX_VALUE, 'y', (String) null, "O");
      assertEquals("MsgId=2147483647 :: MsgType=121 :: Origin=O :: Message=null", string0);
  }

  /**
  //Test case number: 41
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.fundamentalData(Integer.MAX_VALUE, "");
      assertEquals("id  = 2147483647 len = 0\n", string0);
  }

  /**
  //Test case number: 42
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      ContractDetails contractDetails0 = new ContractDetails();
      String string0 = EWrapperMsgGenerator.contractDetails(13, contractDetails0);
      assertEquals("reqId = 13 ===================================\n ---- Contract Details begin ----\nconid = 0\nsymbol = null\nsecType = null\nexpiry = null\nstrike = 0.0\nright = null\nmultiplier = null\nexchange = null\nprimaryExch = null\ncurrency = null\nlocalSymbol = null\nmarketName = null\ntradingClass = null\nminTick = 0.0\nprice magnifier = 0\norderTypes = null\nvalidExchanges = null\nunderConId = 0\nlongName = null\ncontractMonth = null\nindustry = null\ncategory = null\nsubcategory = null\ntimeZoneId = null\ntradingHours = null\nliquidHours = null\n ---- Contract Details End ----\n", string0);
  }

  /**
  //Test case number: 43
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      // Undeclared exception!
      try { 
        EWrapperMsgGenerator.updatePortfolio((Contract) null, 2045222521, (-1275.78), 2045222521, 4313.0, (-757.015314488096), 4313.0, "%iqB>5#_ctoy2,0O5gr");
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
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.updateAccountValue("", "", "", (String) null);
      assertEquals("updateAccountValue:    null", string0);
  }

  /**
  //Test case number: 45
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.receiveFA(1, "");
      assertEquals("FA: GROUPS ", string0);
  }

  /**
  //Test case number: 46
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.contractDetailsEnd(46);
      assertEquals("reqId = 46 =============== end ===============", string0);
  }

  /**
  //Test case number: 47
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.tickSnapshotEnd((-2684));
      assertEquals("id=-2684 =============== end ===============", string0);
  }

  /**
  //Test case number: 48
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.orderStatus('?', (String) null, 0, 1, 0, 0, 0, 0, 0, (String) null);
      assertEquals("order status: orderId=63 clientId=0 permId=0 status=null filled=0 remaining=1 avgFillPrice=0.0 lastFillPrice=0.0 parent Id=0 whyHeld=null", string0);
  }

  /**
  //Test case number: 49
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.scannerDataEnd(773);
      assertEquals("id = 773 =============== end ===============", string0);
  }

  /**
  //Test case number: 50
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.tickGeneric(0, 'm', 1.7976931348623157E308);
      assertEquals("id=0  unknown=1.7976931348623157E308", string0);
  }

  /**
  //Test case number: 51
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.managedAccounts(" localSymbol=");
      assertEquals("Connected : The list of managed accounts are : [ localSymbol=]", string0);
  }

  /**
  //Test case number: 52
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      EWrapperMsgGenerator eWrapperMsgGenerator0 = new EWrapperMsgGenerator();
      assertEquals("Connection Closed", eWrapperMsgGenerator0.connectionClosed());
  }

  /**
  //Test case number: 53
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      ContractDetails contractDetails0 = new ContractDetails((Contract) null, "ELm\"{.y-feoHuM", "ELm\"{.y-feoHuM", 14, "dfaGNTk", "ELm\"{.y-feoHuM", (-2475), "ELm\"{.y-feoHuM", "@9RtX^", "dfaGNTk", "@9RtX^", "b Q|>azQ", "ELm\"{.y-feoHuM", "ELm\"{.y-feoHuM", "dfaGNTk");
      // Undeclared exception!
      try { 
        EWrapperMsgGenerator.contractDetails(14, contractDetails0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.ib.client.EWrapperMsgGenerator", e);
      }
  }

  /**
  //Test case number: 54
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.accountDownloadEnd((String) null);
      assertEquals("accountDownloadEnd: null", string0);
  }

  /**
  //Test case number: 55
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.updateMktDepthL2('y', 1, (String) null, 0, 0, 0, 0);
      assertEquals("updateMktDepth: 121 1 null 0 0 0.0 0", string0);
  }

  /**
  //Test case number: 56
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test56()  throws Throwable  {
      // Undeclared exception!
      try { 
        EWrapperMsgGenerator.bondContractDetails(1, (ContractDetails) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.ib.client.EWrapperMsgGenerator", e);
      }
  }

  /**
  //Test case number: 57
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test57()  throws Throwable  {
      // Undeclared exception!
      try { 
        EWrapperMsgGenerator.scannerData(13, (-896), (ContractDetails) null, "kTLB(HR8vSV-U", "marketName = ", "marketName = ", "marketName = ");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.ib.client.EWrapperMsgGenerator", e);
      }
  }

  /**
  //Test case number: 58
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test58()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.realtimeBar((-1336), (-1336), (-1336), 1.0, (-1336), (-1336), (-1336), (-1336), 0);
      assertEquals("id=-1336 time = -1336 open=-1336.0 high=1.0 low=-1336.0 close=-1336.0 volume=-1336 count=0 WAP=-1336.0", string0);
  }

  /**
  //Test case number: 59
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test59()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.nextValidId((-1857));
      assertEquals("Next Valid Order ID: -1857", string0);
  }

  /**
  //Test case number: 60
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test60()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.execDetailsEnd((-3316));
      assertEquals("reqId = -3316 =============== end ===============", string0);
  }

  /**
  //Test case number: 61
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test61()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.currentTime((-1572L));
      assertEquals("current time = -1572 (Dec 31, 1969 11:33:48 PM)", string0);
  }

  /**
  //Test case number: 62
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test62()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.openOrderEnd();
      assertEquals(" =============== end ===============", string0);
  }

  /**
  //Test case number: 63
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test63()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.tickEFP(0, '?', 1, (String) null, 1.7976931348623157E308, '?', (String) null, 0, 1.7976931348623157E308);
      assertEquals("id=0  unknown: basisPoints = 1.0/null impliedFuture = 1.7976931348623157E308 holdDays = 63 futureExpiry = null dividendImpact = 0.0 dividends to expiry = 1.7976931348623157E308", string0);
  }

  /**
  //Test case number: 64
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test64()  throws Throwable  {
      Execution execution0 = new Execution();
      // Undeclared exception!
      try { 
        EWrapperMsgGenerator.execDetails(47, (Contract) null, execution0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.ib.client.EWrapperMsgGenerator", e);
      }
  }

  /**
  //Test case number: 65
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test65()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.tickSize(Integer.MAX_VALUE, 'b', 0);
      assertEquals("id=2147483647  unknown=0", string0);
  }

  /**
  //Test case number: 66
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test66()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.scannerParameters("Qb1:ni.");
      assertEquals("SCANNER PARAMETERS:\nQb1:ni.", string0);
  }

  /**
  //Test case number: 67
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test67()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.historicalData('b', (String) null, 1.7976931348623157E308, 2, 3, 'm', 0, 0, 1, false);
      assertEquals("id=98 date = null open=1.7976931348623157E308 high=2.0 low=3.0 close=109.0 volume=0 count=0 WAP=1.0 hasGaps=false", string0);
  }

  /**
  //Test case number: 68
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test68()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.updateAccountTime("markPrice");
      assertEquals("updateAccountTime: markPrice", string0);
  }
}
