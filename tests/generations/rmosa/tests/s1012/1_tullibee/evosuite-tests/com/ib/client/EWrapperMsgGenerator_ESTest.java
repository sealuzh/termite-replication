/*
 * This file was automatically generated by EvoSuite
 * Sun Nov 08 19:22:34 GMT 2020
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
      String string0 = EWrapperMsgGenerator.scannerData(43, 2136313578, contractDetails0, (String) null, "Fj9&mb7Q%U}B;84", "putable = ", "putable = ");
      assertEquals("id = 43 rank=2136313578 symbol=null secType=null expiry=null strike=0.0 right=null exchange=null currency=null localSymbol=null marketName=null tradingClass=null distance=null benchmark=Fj9&mb7Q%U}B;84 projection=putable =  legsStr=putable = ", string0);
  }

  /**
  //Test case number: 1
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.realtimeBar(2146676883, 2146676883, 0.0, 0.0, 2146676883, 2146676883, 2146676883, 2146676883, 2146676883);
      assertEquals("id=2146676883 time = 2146676883 open=0.0 high=0.0 low=2.146676883E9 close=2.146676883E9 volume=2146676883 count=2146676883 WAP=2.146676883E9", string0);
  }

  /**
  //Test case number: 2
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.realtimeBar((-870), (-870), (-870), (-870), 1.0, (-870), (-870), (-1.0), (-870));
      assertEquals("id=-870 time = -870 open=-870.0 high=-870.0 low=1.0 close=-870.0 volume=-870 count=-870 WAP=-1.0", string0);
  }

  /**
  //Test case number: 3
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.historicalData(1, (String) null, 1.7976931348623157E308, 0, Integer.MAX_VALUE, 1.7976931348623157E308, 'c', 0, 1, false);
      assertEquals("id=1 date = null open=1.7976931348623157E308 high=0.0 low=2.147483647E9 close=1.7976931348623157E308 volume=99 count=0 WAP=1.0 hasGaps=false", string0);
  }

  /**
  //Test case number: 4
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.updateMktDepthL2(0, 0, (String) null, 0, 'y', 0, 'c');
      assertEquals("updateMktDepth: 0 0 null 0 121 0.0 99", string0);
  }

  /**
  //Test case number: 5
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.updateMktDepthL2('m', 0, "", Integer.MAX_VALUE, 0, 0, Integer.MAX_VALUE);
      assertEquals("updateMktDepth: 109 0  2147483647 0 0.0 2147483647", string0);
  }

  /**
  //Test case number: 6
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.updateMktDepth('?', Integer.MAX_VALUE, Integer.MAX_VALUE, 0, 1.7976931348623157E308, 1);
      assertEquals("updateMktDepth: 63 2147483647 2147483647 0 1.7976931348623157E308 1", string0);
  }

  /**
  //Test case number: 7
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Contract contract0 = new Contract();
      String string0 = EWrapperMsgGenerator.updatePortfolio(contract0, (-2093), (-2528.350273886241), 0.0, 0.0, 0.0, 1.0, (String) null);
      assertEquals("updatePortfolio: conid = 0\nsymbol = null\nsecType = null\nexpiry = null\nstrike = 0.0\nright = null\nmultiplier = null\nexchange = null\nprimaryExch = null\ncurrency = null\nlocalSymbol = null\n-2093 -2528.350273886241 0.0 0.0 0.0 1.0 null", string0);
      assertNotNull(string0);
  }

  /**
  //Test case number: 8
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.updateAccountValue("", "", (String) null, (String) null);
      assertEquals("updateAccountValue:   null null", string0);
  }

  /**
  //Test case number: 9
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.tickEFP(3, 0, 1.7976931348623157E308, (String) null, 'm', 'm', (String) null, 1, Integer.MAX_VALUE);
      assertEquals("id=3  bidSize: basisPoints = 1.7976931348623157E308/null impliedFuture = 109.0 holdDays = 109 futureExpiry = null dividendImpact = 1.0 dividends to expiry = 2.147483647E9", string0);
  }

  /**
  //Test case number: 10
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.tickOptionComputation((-781), 13, 13, 13, 1.0, 13);
      assertEquals("id=-781  modelOptComp: vol = 13.0 delta = N/A: modelPrice = 1.0: pvDividend = 13.0", string0);
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
      String string0 = EWrapperMsgGenerator.tickOptionComputation(13, 13, 13, 3086.9770339567863, 1.7976931348623157E308, 13);
      assertEquals("id=13  modelOptComp: vol = 13.0 delta = N/A: modelPrice = N/A: pvDividend = 13.0", string0);
  }

  /**
  //Test case number: 13
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.tickOptionComputation(19, 19, 19, 19, 19, 19);
      assertEquals("id=19  52WeekLow: vol = 19.0 delta = N/A", string0);
  }

  /**
  //Test case number: 14
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.tickOptionComputation(Integer.MAX_VALUE, 0, 0, 0, Integer.MAX_VALUE, 1.7976931348623157E308);
      assertEquals("id=2147483647  bidSize: vol = 0.0 delta = 0.0", string0);
  }

  /**
  //Test case number: 15
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.tickSize(0, Integer.MAX_VALUE, 0);
      assertEquals("id=0  unknown=0", string0);
  }

  /**
  //Test case number: 16
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.tickPrice(0, 2, 0, Integer.MAX_VALUE);
      assertEquals("id=0  askPrice=0.0  canAutoExecute", string0);
  }

  /**
  //Test case number: 17
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Contract contract0 = new Contract();
      String string0 = EWrapperMsgGenerator.updatePortfolio(contract0, 13, 0, 2869.9427, 1.7976931348623157E308, 0.0, 1.7976931348623157E308, " volatility=");
      assertEquals("updatePortfolio: conid = 0\nsymbol = null\nsecType = null\nexpiry = null\nstrike = 0.0\nright = null\nmultiplier = null\nexchange = null\nprimaryExch = null\ncurrency = null\nlocalSymbol = null\n13 0.0 2869.9427 1.7976931348623157E308 0.0 1.7976931348623157E308  volatility=", string0);
  }

  /**
  //Test case number: 18
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Contract contract0 = new Contract();
      Execution execution0 = new Execution();
      String string0 = EWrapperMsgGenerator.execDetails(2146957896, contract0, execution0);
      assertEquals(" ---- Execution Details begin ----\nreqId = 2146957896\norderId = 0\nclientId = 0\nsymbol = null\nsecType = null\nexpiry = null\nstrike = 0.0\nright = null\ncontractExchange = null\ncurrency = null\nlocalSymbol = null\nexecId = null\ntime = null\nacctNumber = null\nexecutionExchange = null\nside = null\nshares = 0\nprice = 0.0\npermId = 0\nliquidation = 0\ncumQty = 0\navgPrice = 0.0\n ---- Execution Details end ----\n", string0);
  }

  /**
  //Test case number: 19
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      UnderComp underComp0 = new UnderComp();
      String string0 = EWrapperMsgGenerator.deltaNeutralValidation(28, underComp0);
      assertEquals("id = 28 underComp.conId =0 underComp.delta =0.0 underComp.price =0.0", string0);
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
      String string0 = EWrapperMsgGenerator.bondContractDetails((-1128398581), contractDetails0);
      assertEquals("reqId = -1128398581 ===================================\n ---- Bond Contract Details begin ----\nsymbol = null\nsecType = null\ncusip = null\ncoupon = 0.0\nmaturity = null\nissueDate = null\nratings = null\nbondType = null\ncouponType = null\nconvertible = false\ncallable = false\nputable = false\ndescAppend = null\nexchange = null\ncurrency = null\nmarketName = null\ntradingClass = null\nconid = 0\nminTick = 0.0\norderTypes = null\nvalidExchanges = null\nnextOptionDate = null\nnextOptionType = null\nnextOptionPartial = false\nnotes = null\nlongName = null\n ---- Bond Contract Details End ----\n", string0);
  }

  /**
  //Test case number: 22
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      // Undeclared exception!
      try { 
        EWrapperMsgGenerator.scannerData(2061584302, (-1), (ContractDetails) null, "%(I&l Q9Ka%,Dl ", "%(I&l Q9Ka%,Dl ", "%(I&l Q9Ka%,Dl ", "%(I&l Q9Ka%,Dl ");
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
      Order order0 = new Order();
      Contract contract0 = new Contract();
      order0.m_algoStrategy = "O";
      order0.m_algoParams = contract0.m_comboLegs;
      OrderState orderState0 = new OrderState();
      String string0 = EWrapperMsgGenerator.openOrder(Integer.MAX_VALUE, contract0, order0, orderState0);
      assertNotNull(string0);
  }

  /**
  //Test case number: 26
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      Order order0 = new Order();
      Contract contract0 = new Contract();
      order0.m_algoStrategy = "O";
      OrderState orderState0 = new OrderState();
      String string0 = EWrapperMsgGenerator.openOrder(Integer.MAX_VALUE, contract0, order0, orderState0);
      assertNotNull(string0);
  }

  /**
  //Test case number: 27
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      Order order0 = new Order();
      Contract contract0 = new Contract();
      UnderComp underComp0 = new UnderComp();
      contract0.m_underComp = underComp0;
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
  //Test case number: 28
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      Vector<Object> vector0 = new Vector<Object>();
      Contract contract0 = new Contract(13, "\"b1gT+t#f", "BAG", "", 13, "\"b1gT+t#f", "", "5/%(3(`", "BAG", "BAG", vector0, "^", false, "5/%(3(`", "price magnifier = ");
      Order order0 = new Order();
      order0.m_basisPoints = (double) 13;
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
  //Test case number: 29
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      Vector<Object> vector0 = new Vector<Object>();
      Contract contract0 = new Contract(1, "BAG", "BAG", "BAG", 1, "BAG", "BAG", "BAG", "BAG", "BAG", vector0, "BAG", true, "BAG", "BAG");
      contract0.m_comboLegsDescrip = "BAG";
      Order order0 = new Order();
      // Undeclared exception!
      try { 
        EWrapperMsgGenerator.openOrder(Integer.MAX_VALUE, contract0, order0, (OrderState) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.ib.client.EWrapperMsgGenerator", e);
      }
  }

  /**
  //Test case number: 30
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.tickOptionComputation(13, 13, 1.7976931348623157E308, 13, 1.7976931348623157E308, 1.7976931348623157E308);
      assertEquals("id=13  modelOptComp: vol = N/A delta = N/A: modelPrice = N/A: pvDividend = N/A", string0);
  }

  /**
  //Test case number: 31
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.tickOptionComputation(13, 13, 13, (-681.819955), (-681.819955), (-681.819955));
      assertEquals("id=13  modelOptComp: vol = 13.0 delta = N/A: modelPrice = N/A: pvDividend = N/A", string0);
  }

  /**
  //Test case number: 32
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.tickOptionComputation(1, 1, 1.7976931348623157E308, 1, 1.7976931348623157E308, 1.7976931348623157E308);
      assertEquals("id=1  bidPrice: vol = N/A delta = 1.0", string0);
  }

  /**
  //Test case number: 33
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.tickOptionComputation(13, 13, 1.7976931348623157E308, 13, 13, 13);
      assertEquals("id=13  modelOptComp: vol = N/A delta = N/A: modelPrice = 13.0: pvDividend = 13.0", string0);
  }

  /**
  //Test case number: 34
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.tickOptionComputation((-10), (-10), (-10), (-10), (-10), (-10));
      assertEquals("id=-10  unknown: vol = N/A delta = N/A", string0);
  }

  /**
  //Test case number: 35
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.tickPrice((-2), (-2), (-2), (-2));
      assertEquals("id=-2  unknown=-2.0  canAutoExecute", string0);
  }

  /**
  //Test case number: 36
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.tickPrice(Integer.MAX_VALUE, Integer.MAX_VALUE, 0, 0);
      assertEquals("id=2147483647  unknown=0.0  noAutoExecute", string0);
  }

  /**
  //Test case number: 37
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.updateMktDepth(2147483646, (-1726423898), 2147483646, 2147483646, 2147483646, 2147483646);
      assertEquals("updateMktDepth: 2147483646 -1726423898 2147483646 2147483646 2.147483646E9 2147483646", string0);
  }

  /**
  //Test case number: 38
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.tickString(0, Integer.MAX_VALUE, (String) null);
      assertEquals("id=0  unknown=null", string0);
  }

  /**
  //Test case number: 39
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
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
  //Test case number: 40
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.updateNewsBulletin(0, 2, (String) null, "");
      assertEquals("MsgId=0 :: MsgType=2 :: Origin= :: Message=null", string0);
  }

  /**
  //Test case number: 41
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.fundamentalData((-2147483647), "A&_|Ol6e,>foWI");
      assertEquals("id  = -2147483647 len = 16\nA&_|Ol6e,>foWI", string0);
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
        EWrapperMsgGenerator.updatePortfolio((Contract) null, 13, 1.0, (-2291.890474849757), 1.0, 1.0, 1.0, "'");
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
      String string0 = EWrapperMsgGenerator.updateAccountValue("4Z?pUxYV.va*Y^%'V%", "h57)YG.!tp@cZ", "h57)YG.!tp@cZ", "4Z?pUxYV.va*Y^%'V%");
      assertNotNull(string0);
  }

  /**
  //Test case number: 45
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.receiveFA(0, (String) null);
      assertEquals("FA: null null", string0);
  }

  /**
  //Test case number: 46
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.contractDetailsEnd((-1926));
      assertEquals("reqId = -1926 =============== end ===============", string0);
  }

  /**
  //Test case number: 47
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.tickSnapshotEnd((-1706));
      assertEquals("id=-1706 =============== end ===============", string0);
  }

  /**
  //Test case number: 48
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.orderStatus('y', (String) null, 'c', Integer.MAX_VALUE, 'b', 0, 'b', 1.7976931348623157E308, 2, "");
      assertEquals("order status: orderId=121 clientId=2 permId=0 status=null filled=99 remaining=2147483647 avgFillPrice=98.0 lastFillPrice=1.7976931348623157E308 parent Id=98 whyHeld=", string0);
  }

  /**
  //Test case number: 49
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.scannerDataEnd(102);
      assertEquals("id = 102 =============== end ===============", string0);
  }

  /**
  //Test case number: 50
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.tickGeneric(3, 'm', 1.7976931348623157E308);
      assertEquals("id=3  unknown=1.7976931348623157E308", string0);
  }

  /**
  //Test case number: 51
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.managedAccounts(" ---- Contract Details End ----\n");
      assertEquals("Connected : The list of managed accounts are : [ ---- Contract Details End ----\n]", string0);
  }

  /**
  //Test case number: 52
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      EWrapperMsgGenerator eWrapperMsgGenerator0 = new EWrapperMsgGenerator();
      assertEquals(" =============== end ===============", eWrapperMsgGenerator0.openOrderEnd());
  }

  /**
  //Test case number: 53
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      ContractDetails contractDetails0 = new ContractDetails((Contract) null, "id=13  modelOptComp: vol = N/A delta = N/A: modelPrice = N/A: pvDividend = N/A", "id=13  modelOptComp: vol = N/A delta = N/A: modelPrice = N/A: pvDividend = N/A", 13, "id=13  modelOptComp: vol = N/A delta = N/A: modelPrice = N/A: pvDividend = N/A", "id=13  modelOptComp: vol = N/A delta = N/A: modelPrice = N/A: pvDividend = N/A", (-1172), "id=13  modelOptComp: vol = N/A delta = N/A: modelPrice = N/A: pvDividend = N/A", "id=789  unknown: basisPoints = 789.0/ faGroup= impliedFuture = 96.0784883782128 holdDays = -2256 futureExpiry = <lsgq$EA$?o,NETzR, dividendImpact = 96.0784883782128 dividends to expiry = -3564.932", "rms,UBh`krNVLP4'G", "id=13  modelOptComp: vol = N/A delta = N/A: modelPrice = N/A: pvDividend = N/A", "high", " benchmark=", "high", "rms,UBh`krNVLP4'G");
      // Undeclared exception!
      try { 
        EWrapperMsgGenerator.contractDetails(2179, contractDetails0);
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
      // Undeclared exception!
      try { 
        EWrapperMsgGenerator.bondContractDetails((-12), (ContractDetails) null);
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
      ContractDetails contractDetails0 = new ContractDetails();
      String string0 = EWrapperMsgGenerator.scannerData((-2146468769), (-2146468769), contractDetails0, "HO8hQ/&~M@K_vAErIT)", (String) null, "lastTimestamp", (String) null);
      assertEquals("id = -2146468769 rank=-2146468769 symbol=null secType=null expiry=null strike=0.0 right=null exchange=null currency=null localSymbol=null marketName=null tradingClass=null distance=HO8hQ/&~M@K_vAErIT) benchmark=null projection=lastTimestamp legsStr=null", string0);
  }

  /**
  //Test case number: 57
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test57()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.realtimeBar((-156), 1369L, (-156), 1369L, 1369L, 1369L, (-1717L), (-156), 2767);
      assertEquals("id=-156 time = 1369 open=-156.0 high=1369.0 low=1369.0 close=1369.0 volume=-1717 count=2767 WAP=-156.0", string0);
  }

  /**
  //Test case number: 58
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test58()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.nextValidId(0);
      assertEquals("Next Valid Order ID: 0", string0);
  }

  /**
  //Test case number: 59
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test59()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.execDetailsEnd(0);
      assertEquals("reqId = 0 =============== end ===============", string0);
  }

  /**
  //Test case number: 60
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test60()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.currentTime(763L);
      assertEquals("current time = 763 (Jan 1, 1970 12:12:43 AM)", string0);
  }

  /**
  //Test case number: 61
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test61()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.openOrderEnd();
      assertEquals(" =============== end ===============", string0);
  }

  /**
  //Test case number: 62
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test62()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.tickEFP(1, 3, Integer.MAX_VALUE, (String) null, 1.7976931348623157E308, 0, "", 0, 0.0);
      assertEquals("id=1  askSize: basisPoints = 2.147483647E9/null impliedFuture = 1.7976931348623157E308 holdDays = 0 futureExpiry =  dividendImpact = 0.0 dividends to expiry = 0.0", string0);
  }

  /**
  //Test case number: 63
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test63()  throws Throwable  {
      Execution execution0 = new Execution();
      // Undeclared exception!
      try { 
        EWrapperMsgGenerator.execDetails(3797, (Contract) null, execution0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.ib.client.EWrapperMsgGenerator", e);
      }
  }

  /**
  //Test case number: 64
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test64()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.tickSize(2096353084, 2096353084, 25);
      assertEquals("id=2096353084  unknown=25", string0);
  }

  /**
  //Test case number: 65
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test65()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.scannerParameters("OptionPutVolume");
      assertEquals("SCANNER PARAMETERS:\nOptionPutVolume", string0);
  }

  /**
  //Test case number: 66
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test66()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.historicalData(0, (String) null, 1.7976931348623157E308, 0, 1, 0, 'n', Integer.MAX_VALUE, 1.7976931348623157E308, false);
      assertEquals("id=0 date = null open=1.7976931348623157E308 high=0.0 low=1.0 close=0.0 volume=110 count=2147483647 WAP=1.7976931348623157E308 hasGaps=false", string0);
  }

  /**
  //Test case number: 67
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test67()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.updateAccountTime("L&=~sv5?Lr1jENv");
      assertEquals("updateAccountTime: L&=~sv5?Lr1jENv", string0);
  }
}
