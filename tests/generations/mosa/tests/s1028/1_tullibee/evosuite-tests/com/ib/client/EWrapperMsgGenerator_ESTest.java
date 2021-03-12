/*
 * This file was automatically generated by EvoSuite
 * Sat Nov 07 22:07:02 GMT 2020
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
import com.ib.client.TagValue;
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
      String string0 = EWrapperMsgGenerator.scannerData((-1729), 23, contractDetails0, (String) null, "Pb~)3$su9N", "?w:", (String) null);
      assertEquals("id = -1729 rank=23 symbol=null secType=null expiry=null strike=0.0 right=null exchange=null currency=null localSymbol=null marketName=null tradingClass=null distance=null benchmark=Pb~)3$su9N projection=?w: legsStr=null", string0);
  }

  /**
  //Test case number: 1
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.realtimeBar(Integer.MAX_VALUE, 0, 0, 0, 2, Integer.MAX_VALUE, 0, 1.7976931348623157E308, 1);
      assertEquals("id=2147483647 time = 0 open=0.0 high=0.0 low=2.0 close=2.147483647E9 volume=0 count=1 WAP=1.7976931348623157E308", string0);
  }

  /**
  //Test case number: 2
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.historicalData(0, "", 0, 1.7976931348623157E308, 0, 0, 0, '?', Integer.MAX_VALUE, true);
      assertEquals("id=0 date =  open=0.0 high=1.7976931348623157E308 low=0.0 close=0.0 volume=0 count=63 WAP=2.147483647E9 hasGaps=true", string0);
  }

  /**
  //Test case number: 3
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.updateMktDepthL2(1, 0, (String) null, 'y', 0, Integer.MAX_VALUE, 0);
      assertEquals("updateMktDepth: 1 0 null 121 0 2.147483647E9 0", string0);
  }

  /**
  //Test case number: 4
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.updateMktDepthL2(1, 0, "", 0, 0, 0, Integer.MAX_VALUE);
      assertEquals("updateMktDepth: 1 0  0 0 0.0 2147483647", string0);
  }

  /**
  //Test case number: 5
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.updateMktDepth(Integer.MAX_VALUE, 0, 2, Integer.MAX_VALUE, 0, 'b');
      assertEquals("updateMktDepth: 2147483647 0 2 2147483647 0.0 98", string0);
  }

  /**
  //Test case number: 6
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Contract contract0 = new Contract();
      String string0 = EWrapperMsgGenerator.updatePortfolio(contract0, 0, 0.0, 1632.508, 1632.508, (-6043.72123569), 0.0, (String) null);
      assertNotNull(string0);
      assertEquals("updatePortfolio: conid = 0\nsymbol = null\nsecType = null\nexpiry = null\nstrike = 0.0\nright = null\nmultiplier = null\nexchange = null\nprimaryExch = null\ncurrency = null\nlocalSymbol = null\n0 0.0 1632.508 1632.508 -6043.72123569 0.0 null", string0);
  }

  /**
  //Test case number: 7
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.updateAccountValue((String) null, (String) null, "", (String) null);
      assertEquals("updateAccountValue: null null  null", string0);
  }

  /**
  //Test case number: 8
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.orderStatus(1, (String) null, Integer.MAX_VALUE, 0, 1.7976931348623157E308, Integer.MAX_VALUE, 0, 0, 1, (String) null);
      assertEquals("order status: orderId=1 clientId=1 permId=2147483647 status=null filled=2147483647 remaining=0 avgFillPrice=1.7976931348623157E308 lastFillPrice=0.0 parent Id=0 whyHeld=null", string0);
  }

  /**
  //Test case number: 9
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.tickEFP(Integer.MAX_VALUE, 3, 1.7976931348623157E308, (String) null, Integer.MAX_VALUE, 0, (String) null, 'b', 2);
      assertEquals("id=2147483647  askSize: basisPoints = 1.7976931348623157E308/null impliedFuture = 2.147483647E9 holdDays = 0 futureExpiry = null dividendImpact = 98.0 dividends to expiry = 2.0", string0);
  }

  /**
  //Test case number: 10
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.tickString(457, 3, (String) null);
      assertEquals("id=457  askSize=null", string0);
  }

  /**
  //Test case number: 11
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.tickOptionComputation(13, 13, 0.0, 13, 0.0, 0.0);
      assertEquals("id=13  modelOptComp: vol = 0.0 delta = N/A: modelPrice = 0.0: pvDividend = 0.0", string0);
  }

  /**
  //Test case number: 12
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.tickOptionComputation(1266, 13, 1.7976931348623157E308, 2, 0, 1);
      assertEquals("id=1266  modelOptComp: vol = N/A delta = N/A: modelPrice = 0.0: pvDividend = 1.0", string0);
  }

  /**
  //Test case number: 13
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.tickOptionComputation(0, 0, 0, 0, 1.7976931348623157E308, 1.7976931348623157E308);
      assertEquals("id=0  bidSize: vol = 0.0 delta = 0.0", string0);
  }

  /**
  //Test case number: 14
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.tickOptionComputation(3, 'y', Integer.MAX_VALUE, 1, 1, 0);
      assertEquals("id=3  unknown: vol = 2.147483647E9 delta = 1.0", string0);
  }

  /**
  //Test case number: 15
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.tickPrice(0, 'y', 1.7976931348623157E308, 'f');
      assertEquals("id=0  unknown=1.7976931348623157E308  canAutoExecute", string0);
  }

  /**
  //Test case number: 16
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      ContractDetails contractDetails0 = new ContractDetails();
      String string0 = EWrapperMsgGenerator.scannerData((-1), (-1), contractDetails0, "ratings = ", (String) null, (String) null, (String) null);
      assertEquals("id = -1 rank=-1 symbol=null secType=null expiry=null strike=0.0 right=null exchange=null currency=null localSymbol=null marketName=null tradingClass=null distance=ratings =  benchmark=null projection=null legsStr=null", string0);
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
      String string0 = EWrapperMsgGenerator.deltaNeutralValidation(2438, underComp0);
      assertEquals("id = 2438 underComp.conId =0 underComp.delta =0.0 underComp.price =0.0", string0);
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
      String string0 = EWrapperMsgGenerator.bondContractDetails(42, contractDetails0);
      assertEquals("reqId = 42 ===================================\n ---- Bond Contract Details begin ----\nsymbol = null\nsecType = null\ncusip = null\ncoupon = 0.0\nmaturity = null\nissueDate = null\nratings = null\nbondType = null\ncouponType = null\nconvertible = false\ncallable = false\nputable = false\ndescAppend = null\nexchange = null\ncurrency = null\nmarketName = null\ntradingClass = null\nconid = 0\nminTick = 0.0\norderTypes = null\nvalidExchanges = null\nnextOptionDate = null\nnextOptionType = null\nnextOptionPartial = false\nnotes = null\nlongName = null\n ---- Bond Contract Details End ----\n", string0);
  }

  /**
  //Test case number: 21
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      // Undeclared exception!
      try { 
        EWrapperMsgGenerator.updatePortfolio((Contract) null, 0, 1.7976931348623157E308, 1.7976931348623157E308, 1.7976931348623157E308, (-278.76619), 0, (String) null);
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
      OrderState orderState0 = new OrderState();
      Order order0 = new Order();
      order0.m_algoStrategy = "O";
      Vector<Object> vector0 = new Vector<Object>();
      order0.m_algoParams = vector0;
      vector0.add((Object) order0);
      Contract contract0 = new Contract();
      // Undeclared exception!
      try { 
        EWrapperMsgGenerator.openOrder(0, contract0, order0, orderState0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // com.ib.client.Order cannot be cast to com.ib.client.TagValue
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
  //Test case number: 24
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
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
  //Test case number: 25
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      OrderState orderState0 = new OrderState();
      Order order0 = new Order();
      order0.m_algoStrategy = "O";
      Vector<Object> vector0 = new Vector<Object>();
      order0.m_algoParams = vector0;
      TagValue tagValue0 = new TagValue((String) null, "");
      vector0.add((Object) tagValue0);
      vector0.add((Object) tagValue0);
      Contract contract0 = new Contract();
      String string0 = EWrapperMsgGenerator.openOrder((-2436), contract0, order0, orderState0);
      assertNotNull(string0);
  }

  /**
  //Test case number: 26
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      OrderState orderState0 = new OrderState();
      Order order0 = new Order();
      order0.m_algoStrategy = "O";
      Vector<Object> vector0 = new Vector<Object>();
      order0.m_algoParams = vector0;
      vector0.add((Object) null);
      Contract contract0 = new Contract();
      // Undeclared exception!
      try { 
        EWrapperMsgGenerator.openOrder(0, contract0, order0, orderState0);
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
      OrderState orderState0 = new OrderState();
      Order order0 = new Order();
      order0.m_algoStrategy = "O";
      Contract contract0 = new Contract();
      String string0 = EWrapperMsgGenerator.openOrder(Integer.MAX_VALUE, contract0, order0, orderState0);
      assertNotNull(string0);
  }

  /**
  //Test case number: 28
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      OrderState orderState0 = new OrderState();
      Order order0 = new Order();
      Contract contract0 = new Contract();
      UnderComp underComp0 = new UnderComp();
      contract0.m_underComp = underComp0;
      String string0 = EWrapperMsgGenerator.openOrder(0, contract0, order0, orderState0);
      assertNotNull(string0);
  }

  /**
  //Test case number: 29
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      Vector<Object> vector0 = new Vector<Object>();
      Contract contract0 = new Contract(796, "id=796  unknown=-200", "BAG", "|{q", (-200), "|{q", "BAG", "Yk Wi7S1,Ig;5$qPY", "|{q", "id=796  unknown=-200", vector0, "Yk Wi7S1,Ig;5$qPY", true, "id=796  unknown=-200", "Yk Wi7S1,Ig;5$qPY");
      Order order0 = new Order();
      order0.m_basisPoints = (double) (-200);
      OrderState orderState0 = new OrderState();
      String string0 = EWrapperMsgGenerator.openOrder(0, contract0, order0, orderState0);
      assertNotNull(string0);
  }

  /**
  //Test case number: 30
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      Vector<Object> vector0 = new Vector<Object>();
      Contract contract0 = new Contract(796, "id=796  unknown=-200", "BAG", "|{q", (-200), "|{q", "id=796  unknown=-200", "Yk Wi7S1,Ig;5$qPY", "|{q", "id=796  unknown=-200", vector0, "Yk Wi7S1,Ig;5$qPY", true, "id=796  unknown=-200", "Yk Wi7S1,Ig;5$qPY");
      Order order0 = new Order();
      contract0.m_comboLegsDescrip = "gvIpNV3/F*";
      OrderState orderState0 = new OrderState();
      String string0 = EWrapperMsgGenerator.openOrder((-200), contract0, order0, orderState0);
      assertNotNull(string0);
  }

  /**
  //Test case number: 31
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.tickOptionComputation(13, 13, 13, 0.0, (-910.620009042873), (-910.620009042873));
      assertEquals("id=13  modelOptComp: vol = 13.0 delta = 0.0: modelPrice = N/A: pvDividend = N/A", string0);
  }

  /**
  //Test case number: 32
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.tickOptionComputation(0, 13, 0.0, 13, 1.7976931348623157E308, 1.7976931348623157E308);
      assertEquals("id=0  modelOptComp: vol = 0.0 delta = N/A: modelPrice = N/A: pvDividend = N/A", string0);
  }

  /**
  //Test case number: 33
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.tickOptionComputation(Integer.MAX_VALUE, Integer.MAX_VALUE, (-1346.6130326571433), Integer.MAX_VALUE, 0, Integer.MAX_VALUE);
      assertEquals("id=2147483647  unknown: vol = N/A delta = N/A", string0);
  }

  /**
  //Test case number: 34
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.tickPrice((-1), (-1), (-1), (-1));
      assertEquals("id=-1  unknown=-1.0  canAutoExecute", string0);
  }

  /**
  //Test case number: 35
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.tickPrice(0, Integer.MAX_VALUE, 'n', 0);
      assertEquals("id=0  unknown=110.0  noAutoExecute", string0);
  }

  /**
  //Test case number: 36
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.updateMktDepth('b', Integer.MAX_VALUE, 0, 0, 0, 'f');
      assertEquals("updateMktDepth: 98 2147483647 0 0 0.0 102", string0);
  }

  /**
  //Test case number: 37
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      // Undeclared exception!
      try { 
        EWrapperMsgGenerator.deltaNeutralValidation(3860, (UnderComp) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.ib.client.EWrapperMsgGenerator", e);
      }
  }

  /**
  //Test case number: 38
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.updateNewsBulletin(0, Integer.MAX_VALUE, (String) null, "O");
      assertEquals("MsgId=0 :: MsgType=2147483647 :: Origin=O :: Message=null", string0);
  }

  /**
  //Test case number: 39
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.fundamentalData(0, "O");
      assertEquals("id  = 0 len = 1\nO", string0);
  }

  /**
  //Test case number: 40
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      ContractDetails contractDetails0 = new ContractDetails();
      String string0 = EWrapperMsgGenerator.contractDetails(0, contractDetails0);
      assertEquals("reqId = 0 ===================================\n ---- Contract Details begin ----\nconid = 0\nsymbol = null\nsecType = null\nexpiry = null\nstrike = 0.0\nright = null\nmultiplier = null\nexchange = null\nprimaryExch = null\ncurrency = null\nlocalSymbol = null\nmarketName = null\ntradingClass = null\nminTick = 0.0\nprice magnifier = 0\norderTypes = null\nvalidExchanges = null\nunderConId = 0\nlongName = null\ncontractMonth = null\nindustry = null\ncategory = null\nsubcategory = null\ntimeZoneId = null\ntradingHours = null\nliquidHours = null\n ---- Contract Details End ----\n", string0);
  }

  /**
  //Test case number: 41
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      Contract contract0 = new Contract();
      String string0 = EWrapperMsgGenerator.updatePortfolio(contract0, 0, (-528.3609), 0, (-528.3609), 3.0, 3.0, (String) null);
      assertNotNull(string0);
      assertEquals("updatePortfolio: conid = 0\nsymbol = null\nsecType = null\nexpiry = null\nstrike = 0.0\nright = null\nmultiplier = null\nexchange = null\nprimaryExch = null\ncurrency = null\nlocalSymbol = null\n0 -528.3609 0.0 -528.3609 3.0 3.0 null", string0);
  }

  /**
  //Test case number: 42
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.updateAccountValue("", (String) null, "", "");
      assertEquals("updateAccountValue:  null  ", string0);
  }

  /**
  //Test case number: 43
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.receiveFA(0, "multiplier = ");
      assertEquals("FA: null multiplier = ", string0);
  }

  /**
  //Test case number: 44
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.contractDetailsEnd(8);
      assertEquals("reqId = 8 =============== end ===============", string0);
  }

  /**
  //Test case number: 45
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.tickSnapshotEnd((-3));
      assertEquals("id=-3 =============== end ===============", string0);
  }

  /**
  //Test case number: 46
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.orderStatus(0, "", 0, Integer.MAX_VALUE, 1.7976931348623157E308, '?', 0, 0, 'b', (String) null);
      assertEquals("order status: orderId=0 clientId=98 permId=63 status= filled=0 remaining=2147483647 avgFillPrice=1.7976931348623157E308 lastFillPrice=0.0 parent Id=0 whyHeld=null", string0);
  }

  /**
  //Test case number: 47
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.scannerDataEnd('?');
      assertEquals("id = 63 =============== end ===============", string0);
  }

  /**
  //Test case number: 48
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.tickGeneric(Integer.MAX_VALUE, 'y', '?');
      assertEquals("id=2147483647  unknown=63.0", string0);
  }

  /**
  //Test case number: 49
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.managedAccounts("com.ib.client.Execution");
      assertEquals("Connected : The list of managed accounts are : [com.ib.client.Execution]", string0);
  }

  /**
  //Test case number: 50
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      EWrapperMsgGenerator eWrapperMsgGenerator0 = new EWrapperMsgGenerator();
      assertEquals("Connection Closed", eWrapperMsgGenerator0.connectionClosed());
  }

  /**
  //Test case number: 51
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      // Undeclared exception!
      try { 
        EWrapperMsgGenerator.contractDetails(2146917933, (ContractDetails) null);
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
      String string0 = EWrapperMsgGenerator.accountDownloadEnd("h}8-U{dy~(*=4<`a");
      assertEquals("accountDownloadEnd: h}8-U{dy~(*=4<`a", string0);
  }

  /**
  //Test case number: 53
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.updateMktDepthL2(0, 0, (String) null, 0, Integer.MAX_VALUE, 'f', 'y');
      assertEquals("updateMktDepth: 0 0 null 0 2147483647 102.0 121", string0);
  }

  /**
  //Test case number: 54
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      // Undeclared exception!
      try { 
        EWrapperMsgGenerator.bondContractDetails(8, (ContractDetails) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.ib.client.EWrapperMsgGenerator", e);
      }
  }

  /**
  //Test case number: 55
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      // Undeclared exception!
      try { 
        EWrapperMsgGenerator.scannerData((-3120), (-3120), (ContractDetails) null, "Pi0AU?I", "Pi0AU?I", "26WeekLow", "26WeekLow");
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
      String string0 = EWrapperMsgGenerator.realtimeBar(13, 13, 13, 2009.2365287, 13, 13, 1725L, 13, 13);
      assertEquals("id=13 time = 13 open=13.0 high=2009.2365287 low=13.0 close=13.0 volume=1725 count=13 WAP=13.0", string0);
  }

  /**
  //Test case number: 57
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test57()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.nextValidId(5);
      assertEquals("Next Valid Order ID: 5", string0);
  }

  /**
  //Test case number: 58
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test58()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.execDetailsEnd(2146109817);
      assertEquals("reqId = 2146109817 =============== end ===============", string0);
  }

  /**
  //Test case number: 59
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test59()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.currentTime((-1036L));
      assertEquals("current time = -1036 (Dec 31, 1969 11:42:44 PM)", string0);
  }

  /**
  //Test case number: 60
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test60()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.openOrderEnd();
      assertEquals(" =============== end ===============", string0);
  }

  /**
  //Test case number: 61
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test61()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.tickEFP(Integer.MAX_VALUE, 3, 0, (String) null, 'n', 0, "O", 0.0, 1.7976931348623157E308);
      assertEquals("id=2147483647  askSize: basisPoints = 0.0/null impliedFuture = 110.0 holdDays = 0 futureExpiry = O dividendImpact = 0.0 dividends to expiry = 1.7976931348623157E308", string0);
  }

  /**
  //Test case number: 62
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test62()  throws Throwable  {
      Execution execution0 = new Execution();
      // Undeclared exception!
      try { 
        EWrapperMsgGenerator.execDetails(32, (Contract) null, execution0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.ib.client.EWrapperMsgGenerator", e);
      }
  }

  /**
  //Test case number: 63
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test63()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.tickSize(3, 'b', 0);
      assertEquals("id=3  unknown=0", string0);
  }

  /**
  //Test case number: 64
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test64()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.scannerParameters("&TBnBySM5!510}Yjo<");
      assertEquals("SCANNER PARAMETERS:\n&TBnBySM5!510}Yjo<", string0);
  }

  /**
  //Test case number: 65
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test65()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.historicalData('f', (String) null, Integer.MAX_VALUE, 0.0, 0, 1.7976931348623157E308, 0, 0, 'm', false);
      assertEquals("id=102 date = null open=2.147483647E9 high=0.0 low=0.0 close=1.7976931348623157E308 volume=0 count=0 WAP=109.0 hasGaps=false", string0);
  }

  /**
  //Test case number: 66
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test66()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.updateAccountTime("com.ib.client.Eecution");
      assertEquals("updateAccountTime: com.ib.client.Eecution", string0);
  }
}
