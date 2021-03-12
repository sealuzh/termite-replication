/*
 * This file was automatically generated by EvoSuite
 * Mon Nov 09 10:52:44 GMT 2020
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
      String string0 = EWrapperMsgGenerator.scannerData(2145495237, 2145495237, contractDetails0, (String) null, "coupon = ", "coupon = ", (String) null);
      assertEquals("id = 2145495237 rank=2145495237 symbol=null secType=null expiry=null strike=0.0 right=null exchange=null currency=null localSymbol=null marketName=null tradingClass=null distance=null benchmark=coupon =  projection=coupon =  legsStr=null", string0);
  }

  /**
  //Test case number: 1
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      ContractDetails contractDetails0 = new ContractDetails();
      String string0 = EWrapperMsgGenerator.scannerData(333, (-3047), contractDetails0, (String) null, (String) null, (String) null, (String) null);
      assertEquals("id = 333 rank=-3047 symbol=null secType=null expiry=null strike=0.0 right=null exchange=null currency=null localSymbol=null marketName=null tradingClass=null distance=null benchmark=null projection=null legsStr=null", string0);
  }

  /**
  //Test case number: 2
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.realtimeBar(2145307328, 1000L, 1000L, 2145307328, 0.0, 16.8255297301, 1000L, 1000L, 2145307328);
      assertEquals("id=2145307328 time = 1000 open=1000.0 high=2.145307328E9 low=0.0 close=16.8255297301 volume=1000 count=2145307328 WAP=1000.0", string0);
  }

  /**
  //Test case number: 3
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.realtimeBar(53, 53, 53, 53, 53, 53, (-1L), (-1L), (-1489));
      assertEquals("id=53 time = 53 open=53.0 high=53.0 low=53.0 close=53.0 volume=-1 count=-1489 WAP=-1.0", string0);
  }

  /**
  //Test case number: 4
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.historicalData(2, (String) null, 'n', 1, 'n', 1.7976931348623157E308, Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, false);
      assertEquals("id=2 date = null open=110.0 high=1.0 low=110.0 close=1.7976931348623157E308 volume=2147483647 count=2147483647 WAP=2.147483647E9 hasGaps=false", string0);
  }

  /**
  //Test case number: 5
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.updateMktDepthL2(2, 1, (String) null, 0, 2, 'n', Integer.MAX_VALUE);
      assertEquals("updateMktDepth: 2 1 null 0 2 110.0 2147483647", string0);
  }

  /**
  //Test case number: 6
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.updateMktDepth(Integer.MAX_VALUE, 'b', 'y', Integer.MAX_VALUE, 1.7976931348623157E308, 0);
      assertEquals("updateMktDepth: 2147483647 98 121 2147483647 1.7976931348623157E308 0", string0);
  }

  /**
  //Test case number: 7
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.updateAccountValue("x]?!@}SH", "", "", "@]bqFP]KLehT;Fa");
      assertEquals("updateAccountValue: x]?!@}SH   @]bqFP]KLehT;Fa", string0);
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
      String string0 = EWrapperMsgGenerator.orderStatus(Integer.MAX_VALUE, (String) null, 1, 'f', 0, 0, 0, 1.7976931348623157E308, 'b', (String) null);
      assertEquals("order status: orderId=2147483647 clientId=98 permId=0 status=null filled=1 remaining=102 avgFillPrice=0.0 lastFillPrice=1.7976931348623157E308 parent Id=0 whyHeld=null", string0);
  }

  /**
  //Test case number: 10
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.orderStatus((-2229), "hC:sldBl[H:Un", (-342), (-2229), (-2229), 2953, (-342), (-342), 2953, "hC:sldBl[H:Un");
      assertEquals("order status: orderId=-2229 clientId=2953 permId=2953 status=hC:sldBl[H:Un filled=-342 remaining=-2229 avgFillPrice=-2229.0 lastFillPrice=-342.0 parent Id=-342 whyHeld=hC:sldBl[H:Un", string0);
  }

  /**
  //Test case number: 11
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.tickEFP(0, 'm', 1.7976931348623157E308, (String) null, 'n', Integer.MAX_VALUE, (String) null, Integer.MAX_VALUE, 'm');
      assertEquals("id=0  unknown: basisPoints = 1.7976931348623157E308/null impliedFuture = 110.0 holdDays = 2147483647 futureExpiry = null dividendImpact = 2.147483647E9 dividends to expiry = 109.0", string0);
  }

  /**
  //Test case number: 12
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.tickOptionComputation(13, 13, 13, 753.0967, 753.0967, 13);
      assertEquals("id=13  modelOptComp: vol = 13.0 delta = N/A: modelPrice = 753.0967: pvDividend = 13.0", string0);
  }

  /**
  //Test case number: 13
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.tickOptionComputation(2, Integer.MAX_VALUE, Integer.MAX_VALUE, 0, 2, 1.7976931348623157E308);
      assertEquals("id=2  unknown: vol = 2.147483647E9 delta = 0.0", string0);
  }

  /**
  //Test case number: 14
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.tickOptionComputation(0, Integer.MAX_VALUE, 0, 1.7976931348623157E308, 0, 3);
      assertEquals("id=0  unknown: vol = 0.0 delta = N/A", string0);
  }

  /**
  //Test case number: 15
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.tickSize(0, 0, 2);
      assertEquals("id=0  bidSize=2", string0);
  }

  /**
  //Test case number: 16
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.tickPrice(1, Integer.MAX_VALUE, 'm', 1);
      assertEquals("id=1  unknown=109.0  canAutoExecute", string0);
  }

  /**
  //Test case number: 17
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      ContractDetails contractDetails0 = new ContractDetails();
      String string0 = EWrapperMsgGenerator.scannerData(1, 1, contractDetails0, (String) null, (String) null, " (", "!PTG1y_}_#S2_f0)^#");
      assertEquals("id = 1 rank=1 symbol=null secType=null expiry=null strike=0.0 right=null exchange=null currency=null localSymbol=null marketName=null tradingClass=null distance=null benchmark=null projection= ( legsStr=!PTG1y_}_#S2_f0)^#", string0);
  }

  /**
  //Test case number: 18
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.fundamentalData(867, "wbK%7yG>f5a:Aq");
      assertEquals("id  = 867 len = 14\nwbK%7yG>f5a:Aq", string0);
  }

  /**
  //Test case number: 19
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Contract contract0 = new Contract();
      Execution execution0 = new Execution();
      String string0 = EWrapperMsgGenerator.execDetails((-1390), contract0, execution0);
      assertEquals(" ---- Execution Details begin ----\nreqId = -1390\norderId = 0\nclientId = 0\nsymbol = null\nsecType = null\nexpiry = null\nstrike = 0.0\nright = null\ncontractExchange = null\ncurrency = null\nlocalSymbol = null\nexecId = null\ntime = null\nacctNumber = null\nexecutionExchange = null\nside = null\nshares = 0\nprice = 0.0\npermId = 0\nliquidation = 0\ncumQty = 0\navgPrice = 0.0\n ---- Execution Details end ----\n", string0);
  }

  /**
  //Test case number: 20
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      UnderComp underComp0 = new UnderComp();
      String string0 = EWrapperMsgGenerator.deltaNeutralValidation((-2864), underComp0);
      assertEquals("id = -2864 underComp.conId =0 underComp.delta =0.0 underComp.price =0.0", string0);
  }

  /**
  //Test case number: 21
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Contract contract0 = new Contract();
      String string0 = EWrapperMsgGenerator.contractMsg(contract0);
      assertEquals("conid = 0\nsymbol = null\nsecType = null\nexpiry = null\nstrike = 0.0\nright = null\nmultiplier = null\nexchange = null\nprimaryExch = null\ncurrency = null\nlocalSymbol = null\n", string0);
  }

  /**
  //Test case number: 22
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      ContractDetails contractDetails0 = new ContractDetails();
      String string0 = EWrapperMsgGenerator.bondContractDetails(1073741824, contractDetails0);
      assertEquals("reqId = 1073741824 ===================================\n ---- Bond Contract Details begin ----\nsymbol = null\nsecType = null\ncusip = null\ncoupon = 0.0\nmaturity = null\nissueDate = null\nratings = null\nbondType = null\ncouponType = null\nconvertible = false\ncallable = false\nputable = false\ndescAppend = null\nexchange = null\ncurrency = null\nmarketName = null\ntradingClass = null\nconid = 0\nminTick = 0.0\norderTypes = null\nvalidExchanges = null\nnextOptionDate = null\nnextOptionType = null\nnextOptionPartial = false\nnotes = null\nlongName = null\n ---- Bond Contract Details End ----\n", string0);
  }

  /**
  //Test case number: 23
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      // Undeclared exception!
      try { 
        EWrapperMsgGenerator.updatePortfolio((Contract) null, 13, 13, 13, 1.7976931348623157E308, 1.7976931348623157E308, 1.7976931348623157E308, "id=13  modelOptComp: vol = 13.0 delta = N/A: modelPrice = N/A: pvDividend = N/A");
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
      Order order0 = new Order();
      Vector<String> vector0 = new Vector<String>();
      vector0.add("<#Drd)7^*D}b>N&tz7Y");
      order0.m_algoParams = vector0;
      OrderState orderState0 = new OrderState();
      ContractDetails contractDetails0 = new ContractDetails();
      order0.m_algoStrategy = " projection=";
      // Undeclared exception!
      try { 
        EWrapperMsgGenerator.openOrder(0, contractDetails0.m_summary, order0, orderState0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // java.lang.String cannot be cast to com.ib.client.TagValue
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
      Order order0 = new Order();
      Vector<String> vector0 = new Vector<String>();
      vector0.add((String) null);
      order0.m_algoParams = vector0;
      OrderState orderState0 = new OrderState();
      ContractDetails contractDetails0 = new ContractDetails();
      order0.m_algoStrategy = "OptionImpliedVolatility";
      // Undeclared exception!
      try { 
        EWrapperMsgGenerator.openOrder(0, contractDetails0.m_summary, order0, orderState0);
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
      Order order0 = new Order();
      Vector<String> vector0 = new Vector<String>();
      order0.m_algoParams = vector0;
      OrderState orderState0 = new OrderState();
      ContractDetails contractDetails0 = new ContractDetails();
      order0.m_algoStrategy = "OptionImpliedVolatility";
      String string0 = EWrapperMsgGenerator.openOrder(0, contractDetails0.m_summary, order0, orderState0);
      assertNotNull(string0);
  }

  /**
  //Test case number: 28
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      Order order0 = new Order();
      OrderState orderState0 = new OrderState();
      ContractDetails contractDetails0 = new ContractDetails();
      order0.m_algoStrategy = "OptionImpliedVolatility";
      String string0 = EWrapperMsgGenerator.openOrder(0, contractDetails0.m_summary, order0, orderState0);
      assertNotNull(string0);
  }

  /**
  //Test case number: 29
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
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
  //Test case number: 30
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      Vector<Integer> vector0 = new Vector<Integer>();
      Contract contract0 = new Contract((-2147483638), "BAG", "BAG", "BAG", (-2147483638), "BAG", (String) null, (String) null, (String) null, "BAG", vector0, (String) null, true, "BAG", "bat4/yV#IK8AC+p");
      Order order0 = new Order();
      OrderState orderState0 = new OrderState();
      order0.m_basisPoints = (-64.177649021);
      String string0 = EWrapperMsgGenerator.openOrder((-2147483647), contract0, order0, orderState0);
      assertNotNull(string0);
  }

  /**
  //Test case number: 31
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      Vector<Integer> vector0 = new Vector<Integer>();
      Contract contract0 = new Contract((-2147483638), "BAG", "BAG", "BAG", (-2147483638), "BAG", (String) null, (String) null, (String) null, "BAG", vector0, (String) null, true, "BAG", "bat4/yV#IK8AC+p");
      contract0.m_comboLegsDescrip = "BAG";
      Order order0 = new Order();
      OrderState orderState0 = new OrderState();
      String string0 = EWrapperMsgGenerator.openOrder(Integer.MAX_VALUE, contract0, order0, orderState0);
      assertNotNull(string0);
  }

  /**
  //Test case number: 32
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.tickOptionComputation(13, 13, 13, 13, 13, 1.7976931348623157E308);
      assertEquals("id=13  modelOptComp: vol = 13.0 delta = N/A: modelPrice = 13.0: pvDividend = N/A", string0);
  }

  /**
  //Test case number: 33
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.tickOptionComputation(13, 13, (-449.614), 13, (-449.614), (-449.614));
      assertEquals("id=13  modelOptComp: vol = N/A delta = N/A: modelPrice = N/A: pvDividend = N/A", string0);
  }

  /**
  //Test case number: 34
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.tickOptionComputation(13, 13, 13, 13, 0.0, 13);
      assertEquals("id=13  modelOptComp: vol = 13.0 delta = N/A: modelPrice = 0.0: pvDividend = 13.0", string0);
  }

  /**
  //Test case number: 35
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.tickOptionComputation(13, 13, 1.7976931348623157E308, 0.0, 1.7976931348623157E308, 0.0);
      assertEquals("id=13  modelOptComp: vol = N/A delta = 0.0: modelPrice = N/A: pvDividend = 0.0", string0);
  }

  /**
  //Test case number: 36
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.tickOptionComputation((-1), (-1), (-1), (-1), (-1), (-1));
      assertEquals("id=-1  unknown: vol = N/A delta = -1.0", string0);
  }

  /**
  //Test case number: 37
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.tickPrice((-6), (-6), (-6), (-6));
      assertEquals("id=-6  unknown=-6.0  canAutoExecute", string0);
  }

  /**
  //Test case number: 38
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.tickPrice(Integer.MAX_VALUE, 0, 'm', 0);
      assertEquals("id=2147483647  bidSize=109.0  noAutoExecute", string0);
  }

  /**
  //Test case number: 39
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.updateMktDepth(1, 0, 0, 'y', 0.0, 0);
      assertEquals("updateMktDepth: 1 0 0 121 0.0 0", string0);
  }

  /**
  //Test case number: 40
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.tickString(2, Integer.MAX_VALUE, "O");
      assertEquals("id=2  unknown=O", string0);
  }

  /**
  //Test case number: 41
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      // Undeclared exception!
      try { 
        EWrapperMsgGenerator.deltaNeutralValidation((-58), (UnderComp) null);
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
      String string0 = EWrapperMsgGenerator.updateNewsBulletin(0, (-1935), "vJX4Mp", "<y");
      assertEquals("MsgId=0 :: MsgType=-1935 :: Origin=<y :: Message=vJX4Mp", string0);
  }

  /**
  //Test case number: 43
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      // Undeclared exception!
      try { 
        EWrapperMsgGenerator.fundamentalData((-1198), (String) null);
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
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      ContractDetails contractDetails0 = new ContractDetails();
      String string0 = EWrapperMsgGenerator.contractDetails(848, contractDetails0);
      assertEquals("reqId = 848 ===================================\n ---- Contract Details begin ----\nconid = 0\nsymbol = null\nsecType = null\nexpiry = null\nstrike = 0.0\nright = null\nmultiplier = null\nexchange = null\nprimaryExch = null\ncurrency = null\nlocalSymbol = null\nmarketName = null\ntradingClass = null\nminTick = 0.0\nprice magnifier = 0\norderTypes = null\nvalidExchanges = null\nunderConId = 0\nlongName = null\ncontractMonth = null\nindustry = null\ncategory = null\nsubcategory = null\ntimeZoneId = null\ntradingHours = null\nliquidHours = null\n ---- Contract Details End ----\n", string0);
  }

  /**
  //Test case number: 45
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      Contract contract0 = new Contract();
      String string0 = EWrapperMsgGenerator.updatePortfolio(contract0, 0, 2496.42, (-1.0), 0, 1.7976931348623157E308, 13, (String) null);
      assertNotNull(string0);
      assertEquals("updatePortfolio: conid = 0\nsymbol = null\nsecType = null\nexpiry = null\nstrike = 0.0\nright = null\nmultiplier = null\nexchange = null\nprimaryExch = null\ncurrency = null\nlocalSymbol = null\n0 2496.42 -1.0 0.0 1.7976931348623157E308 13.0 null", string0);
  }

  /**
  //Test case number: 46
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.receiveFA(0, (String) null);
      assertEquals("FA: null null", string0);
  }

  /**
  //Test case number: 47
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.contractDetailsEnd((-3));
      assertEquals("reqId = -3 =============== end ===============", string0);
  }

  /**
  //Test case number: 48
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.tickSnapshotEnd((-2478));
      assertEquals("id=-2478 =============== end ===============", string0);
  }

  /**
  //Test case number: 49
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.orderStatus((-1795695700), "coS.ib.client.Order", (-1795695700), (-1795695700), (-1795695700), (-1795695700), (-1795695700), (-1795695700), (-1795695700), ",]Fyma=t$H<VeJ\"$");
      assertEquals("order status: orderId=-1795695700 clientId=-1795695700 permId=-1795695700 status=coS.ib.client.Order filled=-1795695700 remaining=-1795695700 avgFillPrice=-1.7956957E9 lastFillPrice=-1.7956957E9 parent Id=-1795695700 whyHeld=,]Fyma=t$H<VeJ\"$", string0);
  }

  /**
  //Test case number: 50
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.scannerDataEnd((-3));
      assertEquals("id = -3 =============== end ===============", string0);
  }

  /**
  //Test case number: 51
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.tickGeneric(0, Integer.MAX_VALUE, 'm');
      assertEquals("id=0  unknown=109.0", string0);
  }

  /**
  //Test case number: 52
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.managedAccounts("gAG");
      assertEquals("Connected : The list of managed accounts are : [gAG]", string0);
  }

  /**
  //Test case number: 53
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      EWrapperMsgGenerator eWrapperMsgGenerator0 = new EWrapperMsgGenerator();
      assertEquals("Connection Closed", eWrapperMsgGenerator0.connectionClosed());
  }

  /**
  //Test case number: 54
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      ContractDetails contractDetails0 = new ContractDetails((Contract) null, "OptionPutOpenInterest", "u", (-1.0), "u", "OptionPutOpenInterest", (-1848), "OptionPutOpenInterest", "~`PB1pq-O3n8piPO", "OptionPutOpenInterest", "~`PB1pq-O3n8piPO", "~`PB1pq-O3n8piPO", ">T$j%I$>@%3\\MIenN", "timeZoneId = ", "SCANNER PARAMETERS:\n");
      // Undeclared exception!
      try { 
        EWrapperMsgGenerator.contractDetails(63, contractDetails0);
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
      String string0 = EWrapperMsgGenerator.accountDownloadEnd(" marfetNme=");
      assertEquals("accountDownloadEnd:  marfetNme=", string0);
  }

  /**
  //Test case number: 56
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test56()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.updateMktDepthL2('b', Integer.MAX_VALUE, (String) null, 0, 0, 'f', 0);
      assertEquals("updateMktDepth: 98 2147483647 null 0 0 102.0 0", string0);
  }

  /**
  //Test case number: 57
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test57()  throws Throwable  {
      // Undeclared exception!
      try { 
        EWrapperMsgGenerator.bondContractDetails((-1293), (ContractDetails) null);
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
      // Undeclared exception!
      try { 
        EWrapperMsgGenerator.scannerData((-1209), (-1209), (ContractDetails) null, "MsgId=", "C:e?mAB;7:}8kp~>Mf", "jd5:p0", "C:e?mAB;7:}8kp~>Mf");
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
      String string0 = EWrapperMsgGenerator.nextValidId((-2167));
      assertEquals("Next Valid Order ID: -2167", string0);
  }

  /**
  //Test case number: 60
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test60()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.execDetailsEnd(13);
      assertEquals("reqId = 13 =============== end ===============", string0);
  }

  /**
  //Test case number: 61
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test61()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.currentTime((-1L));
      assertEquals("current time = -1 (Dec 31, 1969 11:59:59 PM)", string0);
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
      String string0 = EWrapperMsgGenerator.tickEFP(514, 514, 514, "<>t", 514, 514, "=", 514, 514);
      assertEquals("id=514  unknown: basisPoints = 514.0/<>t impliedFuture = 514.0 holdDays = 514 futureExpiry = = dividendImpact = 514.0 dividends to expiry = 514.0", string0);
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
        EWrapperMsgGenerator.execDetails(397, (Contract) null, execution0);
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
      String string0 = EWrapperMsgGenerator.tickSize(13, 1661, 13);
      assertEquals("id=13  unknown=13", string0);
  }

  /**
  //Test case number: 66
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test66()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.scannerParameters("&(NB~2\"*M.");
      assertEquals("SCANNER PARAMETERS:\n&(NB~2\"*M.", string0);
  }

  /**
  //Test case number: 67
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test67()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.historicalData('n', (String) null, 'y', Integer.MAX_VALUE, 1, 0, 'c', 0, 0, false);
      assertEquals("id=110 date = null open=121.0 high=2.147483647E9 low=1.0 close=0.0 volume=99 count=0 WAP=0.0 hasGaps=false", string0);
  }

  /**
  //Test case number: 68
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test68()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.updateAccountTime("");
      assertEquals("updateAccountTime: ", string0);
  }
}
