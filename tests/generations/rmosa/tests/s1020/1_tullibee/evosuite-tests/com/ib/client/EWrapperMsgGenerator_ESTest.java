/*
 * This file was automatically generated by EvoSuite
 * Mon Nov 09 06:42:03 GMT 2020
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
      String string0 = EWrapperMsgGenerator.scannerData(2929, 2929, contractDetails0, "ew=|6Np", (String) null, "=/>wbXg[", (String) null);
      assertEquals("id = 2929 rank=2929 symbol=null secType=null expiry=null strike=0.0 right=null exchange=null currency=null localSymbol=null marketName=null tradingClass=null distance=ew=|6Np benchmark=null projection==/>wbXg[ legsStr=null", string0);
  }

  /**
  //Test case number: 1
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      ContractDetails contractDetails0 = new ContractDetails();
      String string0 = EWrapperMsgGenerator.scannerData(1968526677, 150, contractDetails0, (String) null, (String) null, (String) null, (String) null);
      assertEquals("id = 1968526677 rank=150 symbol=null secType=null expiry=null strike=0.0 right=null exchange=null currency=null localSymbol=null marketName=null tradingClass=null distance=null benchmark=null projection=null legsStr=null", string0);
  }

  /**
  //Test case number: 2
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.realtimeBar((-1795132890), (-1795132890), 1.0, 1.0, 1.0, (-1.0), 0L, (-1795132890), (-1795132890));
      assertEquals("id=-1795132890 time = -1795132890 open=1.0 high=1.0 low=1.0 close=-1.0 volume=0 count=-1795132890 WAP=-1.79513289E9", string0);
  }

  /**
  //Test case number: 3
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.realtimeBar((-69), (-69), (-69), (-69), (-69), (-69), (-69), (-69), 641);
      assertEquals("id=-69 time = -69 open=-69.0 high=-69.0 low=-69.0 close=-69.0 volume=-69 count=641 WAP=-69.0", string0);
  }

  /**
  //Test case number: 4
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.historicalData(Integer.MAX_VALUE, "", 0, Integer.MAX_VALUE, 0.0, 1.7976931348623157E308, 0, 0, Integer.MAX_VALUE, false);
      assertEquals("id=2147483647 date =  open=0.0 high=2.147483647E9 low=0.0 close=1.7976931348623157E308 volume=0 count=0 WAP=2.147483647E9 hasGaps=false", string0);
  }

  /**
  //Test case number: 5
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.updateMktDepthL2(Integer.MAX_VALUE, 0, (String) null, 0, 0, 1.7976931348623157E308, 0);
      assertEquals("updateMktDepth: 2147483647 0 null 0 0 1.7976931348623157E308 0", string0);
  }

  /**
  //Test case number: 6
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.updateMktDepth(Integer.MAX_VALUE, 0, 0, 0, 1.7976931348623157E308, Integer.MAX_VALUE);
      assertEquals("updateMktDepth: 2147483647 0 0 0 1.7976931348623157E308 2147483647", string0);
  }

  /**
  //Test case number: 7
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Contract contract0 = new Contract();
      String string0 = EWrapperMsgGenerator.updatePortfolio(contract0, 2144556087, 1.7976931348623157E308, 13, 0.0, 1.7976931348623157E308, 1.0, (String) null);
      assertEquals("updatePortfolio: conid = 0\nsymbol = null\nsecType = null\nexpiry = null\nstrike = 0.0\nright = null\nmultiplier = null\nexchange = null\nprimaryExch = null\ncurrency = null\nlocalSymbol = null\n2144556087 1.7976931348623157E308 13.0 0.0 1.7976931348623157E308 1.0 null", string0);
      assertNotNull(string0);
  }

  /**
  //Test case number: 8
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.updateAccountValue("w[6<~/&r1d", "w[6<~/&r1d", "w[6<~/&r1d", (String) null);
      assertEquals("updateAccountValue: w[6<~/&r1d w[6<~/&r1d w[6<~/&r1d null", string0);
  }

  /**
  //Test case number: 9
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.updateAccountValue("O", (String) null, (String) null, (String) null);
      assertEquals("updateAccountValue: O null null null", string0);
  }

  /**
  //Test case number: 10
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.orderStatus(2, (String) null, 0, 1, 0, 1, 0, 0.0, Integer.MAX_VALUE, "O");
      assertEquals("order status: orderId=2 clientId=2147483647 permId=1 status=null filled=0 remaining=1 avgFillPrice=0.0 lastFillPrice=0.0 parent Id=0 whyHeld=O", string0);
  }

  /**
  //Test case number: 11
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.orderStatus(1, (String) null, 0, 0, 0, 0, 'n', 1.7976931348623157E308, 0, (String) null);
      assertEquals("order status: orderId=1 clientId=0 permId=0 status=null filled=0 remaining=0 avgFillPrice=0.0 lastFillPrice=1.7976931348623157E308 parent Id=110 whyHeld=null", string0);
  }

  /**
  //Test case number: 12
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.tickEFP(0, Integer.MAX_VALUE, 0, (String) null, 'm', '?', (String) null, 1.7976931348623157E308, Integer.MAX_VALUE);
      assertEquals("id=0  unknown: basisPoints = 0.0/null impliedFuture = 109.0 holdDays = 63 futureExpiry = null dividendImpact = 1.7976931348623157E308 dividends to expiry = 2.147483647E9", string0);
  }

  /**
  //Test case number: 13
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.tickOptionComputation(2146393001, 13, 13, 13, 2146393001, 0.0);
      assertEquals("id=2146393001  modelOptComp: vol = 13.0 delta = N/A: modelPrice = 2.146393001E9: pvDividend = 0.0", string0);
  }

  /**
  //Test case number: 14
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.tickOptionComputation(13, 13, 1.7976931348623157E308, 13, 0.0, 13);
      assertEquals("id=13  modelOptComp: vol = N/A delta = N/A: modelPrice = 0.0: pvDividend = 13.0", string0);
  }

  /**
  //Test case number: 15
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.tickOptionComputation(0, Integer.MAX_VALUE, 1.7976931348623157E308, 0, 0.0, 0);
      assertEquals("id=0  unknown: vol = N/A delta = 0.0", string0);
  }

  /**
  //Test case number: 16
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.tickOptionComputation('m', 0, 0, 0.0, Integer.MAX_VALUE, Integer.MAX_VALUE);
      assertEquals("id=109  bidSize: vol = 0.0 delta = 0.0", string0);
  }

  /**
  //Test case number: 17
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.tickOptionComputation(2142406854, 13, 2142406854, 13, 13, 2142406854);
      assertEquals("id=2142406854  modelOptComp: vol = 2.142406854E9 delta = N/A: modelPrice = 13.0: pvDividend = 2.142406854E9", string0);
  }

  /**
  //Test case number: 18
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.tickPrice(Integer.MAX_VALUE, 0, 'c', 2);
      assertEquals("id=2147483647  bidSize=99.0  canAutoExecute", string0);
  }

  /**
  //Test case number: 19
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Contract contract0 = new Contract();
      String string0 = EWrapperMsgGenerator.updatePortfolio(contract0, (-152), 13, (-1935.59975605911), (-1935.59975605911), (-1731.0), (-2185.01976), "localSymbol = ");
      assertEquals("updatePortfolio: conid = 0\nsymbol = null\nsecType = null\nexpiry = null\nstrike = 0.0\nright = null\nmultiplier = null\nexchange = null\nprimaryExch = null\ncurrency = null\nlocalSymbol = null\n-152 13.0 -1935.59975605911 -1935.59975605911 -1731.0 -2185.01976 localSymbol = ", string0);
  }

  /**
  //Test case number: 20
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      ContractDetails contractDetails0 = new ContractDetails();
      String string0 = EWrapperMsgGenerator.scannerData(0, 0, contractDetails0, (String) null, "WC'!{D^mwZ%-'r+", (String) null, (String) null);
      assertEquals("id = 0 rank=0 symbol=null secType=null expiry=null strike=0.0 right=null exchange=null currency=null localSymbol=null marketName=null tradingClass=null distance=null benchmark=WC'!{D^mwZ%-'r+ projection=null legsStr=null", string0);
  }

  /**
  //Test case number: 21
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.fundamentalData(Integer.MAX_VALUE, "");
      assertEquals("id  = 2147483647 len = 0\n", string0);
  }

  /**
  //Test case number: 22
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Contract contract0 = new Contract();
      Execution execution0 = new Execution();
      String string0 = EWrapperMsgGenerator.execDetails((-1986), contract0, execution0);
      assertEquals(" ---- Execution Details begin ----\nreqId = -1986\norderId = 0\nclientId = 0\nsymbol = null\nsecType = null\nexpiry = null\nstrike = 0.0\nright = null\ncontractExchange = null\ncurrency = null\nlocalSymbol = null\nexecId = null\ntime = null\nacctNumber = null\nexecutionExchange = null\nside = null\nshares = 0\nprice = 0.0\npermId = 0\nliquidation = 0\ncumQty = 0\navgPrice = 0.0\n ---- Execution Details end ----\n", string0);
  }

  /**
  //Test case number: 23
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      UnderComp underComp0 = new UnderComp();
      String string0 = EWrapperMsgGenerator.deltaNeutralValidation(32, underComp0);
      assertEquals("id = 32 underComp.conId =0 underComp.delta =0.0 underComp.price =0.0", string0);
  }

  /**
  //Test case number: 24
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      Contract contract0 = new Contract();
      String string0 = EWrapperMsgGenerator.contractMsg(contract0);
      assertEquals("conid = 0\nsymbol = null\nsecType = null\nexpiry = null\nstrike = 0.0\nright = null\nmultiplier = null\nexchange = null\nprimaryExch = null\ncurrency = null\nlocalSymbol = null\n", string0);
  }

  /**
  //Test case number: 25
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      // Undeclared exception!
      try { 
        EWrapperMsgGenerator.bondContractDetails(0, (ContractDetails) null);
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
  //Test case number: 27
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      Contract contract0 = new Contract();
      Order order0 = new Order();
      order0.m_algoParams = contract0.m_comboLegs;
      order0.m_algoStrategy = "#!*=w_4Yt)8HCf!^|";
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
  //Test case number: 28
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      Contract contract0 = new Contract();
      Order order0 = new Order();
      order0.m_algoStrategy = "#!*=w_4Yt)8HCf!^|";
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
  //Test case number: 29
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      Contract contract0 = new Contract();
      Order order0 = new Order();
      UnderComp underComp0 = new UnderComp();
      contract0.m_underComp = underComp0;
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
  //Test case number: 30
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      Vector<String> vector0 = new Vector<String>();
      Contract contract0 = new Contract((-524), "Connection Closed", "BAG", "Connection Closed", (-524), "BAG", "Connection Closed", "Connection Closed", "Connection Closed", "Connection Closed", vector0, "BAG", false, "Connection Closed", "Connection Closed");
      Order order0 = new Order();
      order0.m_basisPoints = (double) (-524);
      OrderState orderState0 = new OrderState();
      String string0 = EWrapperMsgGenerator.openOrder((-524), contract0, order0, orderState0);
      assertNotNull(string0);
  }

  /**
  //Test case number: 31
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      Vector<String> vector0 = new Vector<String>();
      Contract contract0 = new Contract((-474), "Connection Closed", "BAG", "Connection Closed", (-474), "BAG", "Connection Closed", "Connection Closed", "Connection Closed", "Connection Closed", vector0, "BAG", false, "Connection Closed", "Connection Closed");
      Order order0 = new Order();
      contract0.m_comboLegsDescrip = "Connection Closed";
      OrderState orderState0 = new OrderState();
      String string0 = EWrapperMsgGenerator.openOrder((-474), contract0, order0, orderState0);
      assertFalse(vector0.contains(string0));
  }

  /**
  //Test case number: 32
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.tickOptionComputation(13, 13, (-1808.0), (-1808.0), (-1808.0), (-1808.0));
      assertEquals("id=13  modelOptComp: vol = N/A delta = N/A: modelPrice = N/A: pvDividend = N/A", string0);
  }

  /**
  //Test case number: 33
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.tickOptionComputation(13, 13, 1.7976931348623157E308, 1.7976931348623157E308, 1.7976931348623157E308, 1.7976931348623157E308);
      assertEquals("id=13  modelOptComp: vol = N/A delta = N/A: modelPrice = N/A: pvDividend = N/A", string0);
  }

  /**
  //Test case number: 34
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.tickOptionComputation(1, 1, 1, 1, 1, 1);
      assertEquals("id=1  bidPrice: vol = 1.0 delta = 1.0", string0);
  }

  /**
  //Test case number: 35
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.tickPrice((-1166), 2137377842, 2137377842, (-1166));
      assertEquals("id=-1166  unknown=2.137377842E9  canAutoExecute", string0);
  }

  /**
  //Test case number: 36
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.tickPrice(Integer.MAX_VALUE, 0, Integer.MAX_VALUE, 0);
      assertEquals("id=2147483647  bidSize=2.147483647E9  noAutoExecute", string0);
  }

  /**
  //Test case number: 37
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.updateMktDepth(0, 0, 'b', Integer.MAX_VALUE, Integer.MAX_VALUE, 1);
      assertEquals("updateMktDepth: 0 0 98 2147483647 2.147483647E9 1", string0);
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
        EWrapperMsgGenerator.deltaNeutralValidation(31, (UnderComp) null);
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
      String string0 = EWrapperMsgGenerator.updateNewsBulletin(0, Integer.MAX_VALUE, "", (String) null);
      assertEquals("MsgId=0 :: MsgType=2147483647 :: Origin=null :: Message=", string0);
  }

  /**
  //Test case number: 41
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      // Undeclared exception!
      try { 
        EWrapperMsgGenerator.fundamentalData(1, (String) null);
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
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      Contract contract0 = new Contract();
      ContractDetails contractDetails0 = new ContractDetails(contract0, "jB6x%+d_6`av/", "URkA`2k!8k*)", 439.1184788007, "A$R", "g^vWW", 0, "`d:VKBGV>x", "SCANNER PARAMETERS:\n", "`d:VKBGV>x", (String) null, "x?|9\"w", "&hemn", "J? S4T`D+t", "v]l_>QYL=m%Y");
      String string0 = EWrapperMsgGenerator.contractDetails(1, contractDetails0);
      assertEquals("reqId = 1 ===================================\n ---- Contract Details begin ----\nconid = 0\nsymbol = null\nsecType = null\nexpiry = null\nstrike = 0.0\nright = null\nmultiplier = null\nexchange = null\nprimaryExch = null\ncurrency = null\nlocalSymbol = null\nmarketName = jB6x%+d_6`av/\ntradingClass = URkA`2k!8k*)\nminTick = 439.1184788007\nprice magnifier = 0\norderTypes = A$R\nvalidExchanges = g^vWW\nunderConId = 0\nlongName = `d:VKBGV>x\ncontractMonth = SCANNER PARAMETERS:\n\nindustry = `d:VKBGV>x\ncategory = null\nsubcategory = x?|9\"w\ntimeZoneId = &hemn\ntradingHours = J? S4T`D+t\nliquidHours = v]l_>QYL=m%Y\n ---- Contract Details End ----\n", string0);
  }

  /**
  //Test case number: 43
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      // Undeclared exception!
      try { 
        EWrapperMsgGenerator.updatePortfolio((Contract) null, 46, 46, (-3078.5531882430023), 13, 1.7976931348623157E308, 1.7976931348623157E308, "id=13  modelOptComp: vol = 13.0 delta = N/A: modelPrice = N/A: pvDividend = N/A");
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
      String string0 = EWrapperMsgGenerator.updateAccountValue("oW7[e#`ANsB~D", "oW7[e#`ANsB~D", "j`aHXjmMkC7y%8Z??r", "j`aHXjmMkC7y%8Z??r");
      assertEquals("updateAccountValue: oW7[e#`ANsB~D oW7[e#`ANsB~D j`aHXjmMkC7y%8Z??r j`aHXjmMkC7y%8Z??r", string0);
  }

  /**
  //Test case number: 45
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.receiveFA(Integer.MAX_VALUE, "O");
      assertEquals("FA: null O", string0);
  }

  /**
  //Test case number: 46
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.contractDetailsEnd(39);
      assertEquals("reqId = 39 =============== end ===============", string0);
  }

  /**
  //Test case number: 47
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.tickSnapshotEnd(2147483645);
      assertEquals("id=2147483645 =============== end ===============", string0);
  }

  /**
  //Test case number: 48
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.orderStatus(0, (String) null, Integer.MAX_VALUE, 3, 1.7976931348623157E308, 0, 3, Integer.MAX_VALUE, 0, "");
      assertEquals("order status: orderId=0 clientId=0 permId=0 status=null filled=2147483647 remaining=3 avgFillPrice=1.7976931348623157E308 lastFillPrice=2.147483647E9 parent Id=3 whyHeld=", string0);
  }

  /**
  //Test case number: 49
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.scannerDataEnd((-168));
      assertEquals("id = -168 =============== end ===============", string0);
  }

  /**
  //Test case number: 50
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.tickGeneric(0, Integer.MAX_VALUE, 1.7976931348623157E308);
      assertEquals("id=0  unknown=1.7976931348623157E308", string0);
  }

  /**
  //Test case number: 51
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.managedAccounts("C-b(#`&'YDr");
      assertEquals("Connected : The list of managed accounts are : [C-b(#`&'YDr]", string0);
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
      ContractDetails contractDetails0 = new ContractDetails((Contract) null, "&X;", ":9,v4 :up3ORt,", 28.915145912522743, "BAG", "BAG", 309, "BAG", ":9,v4 :up3ORt,", "QQdz", ":9,v4 :up3ORt,", "BAG", "&X;", ":9,v4 :up3ORt,", "QQdz");
      // Undeclared exception!
      try { 
        EWrapperMsgGenerator.contractDetails(474, contractDetails0);
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
      String string0 = EWrapperMsgGenerator.accountDownloadEnd("BOND");
      assertEquals("accountDownloadEnd: BOND", string0);
  }

  /**
  //Test case number: 55
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.updateMktDepthL2(Integer.MAX_VALUE, '?', (String) null, 'c', 2, 'y', Integer.MAX_VALUE);
      assertEquals("updateMktDepth: 2147483647 63 null 99 2 121.0 2147483647", string0);
  }

  /**
  //Test case number: 56
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test56()  throws Throwable  {
      ContractDetails contractDetails0 = new ContractDetails();
      String string0 = EWrapperMsgGenerator.bondContractDetails((-2580), contractDetails0);
      assertEquals("reqId = -2580 ===================================\n ---- Bond Contract Details begin ----\nsymbol = null\nsecType = null\ncusip = null\ncoupon = 0.0\nmaturity = null\nissueDate = null\nratings = null\nbondType = null\ncouponType = null\nconvertible = false\ncallable = false\nputable = false\ndescAppend = null\nexchange = null\ncurrency = null\nmarketName = null\ntradingClass = null\nconid = 0\nminTick = 0.0\norderTypes = null\nvalidExchanges = null\nnextOptionDate = null\nnextOptionType = null\nnextOptionPartial = false\nnotes = null\nlongName = null\n ---- Bond Contract Details End ----\n", string0);
  }

  /**
  //Test case number: 57
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test57()  throws Throwable  {
      // Undeclared exception!
      try { 
        EWrapperMsgGenerator.scannerData(3, 12, (ContractDetails) null, "26WeekHigh", "26WeekHigh", "26WeekHigh", "26WeekHigh");
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
      String string0 = EWrapperMsgGenerator.realtimeBar((-1), (-1), (-1), 2175.343, 1.7976931348623157E308, 1.7976931348623157E308, (-1), 2175.343, (-1));
      assertEquals("id=-1 time = -1 open=-1.0 high=2175.343 low=1.7976931348623157E308 close=1.7976931348623157E308 volume=-1 count=-1 WAP=2175.343", string0);
  }

  /**
  //Test case number: 59
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test59()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.nextValidId(52);
      assertEquals("Next Valid Order ID: 52", string0);
  }

  /**
  //Test case number: 60
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test60()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.execDetailsEnd((-2339));
      assertEquals("reqId = -2339 =============== end ===============", string0);
  }

  /**
  //Test case number: 61
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test61()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.currentTime(91);
      assertEquals("current time = 91 (Jan 1, 1970 12:01:31 AM)", string0);
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
      String string0 = EWrapperMsgGenerator.tickEFP(2707, 2707, 2707, "ee@7`WMz!+P|%", 2707, 2707, ",5", 2707, 2707);
      assertNotNull(string0);
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
        EWrapperMsgGenerator.execDetails(1327, (Contract) null, execution0);
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
      String string0 = EWrapperMsgGenerator.tickSize(0, 'y', 'c');
      assertEquals("id=0  unknown=99", string0);
  }

  /**
  //Test case number: 66
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test66()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.scannerParameters("WN sVA");
      assertEquals("SCANNER PARAMETERS:\nWN sVA", string0);
  }

  /**
  //Test case number: 67
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test67()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.historicalData('m', (String) null, Integer.MAX_VALUE, 1, 0, 1.7976931348623157E308, 'c', 0, 0, false);
      assertEquals("id=109 date = null open=2.147483647E9 high=1.0 low=0.0 close=1.7976931348623157E308 volume=99 count=0 WAP=0.0 hasGaps=false", string0);
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
