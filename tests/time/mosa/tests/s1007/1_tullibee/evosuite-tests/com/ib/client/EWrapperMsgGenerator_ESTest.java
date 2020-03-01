/*
 * This file was automatically generated by EvoSuite
 * Wed Dec 04 20:01:45 GMT 2019
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
  /*Coverage entropy=0.4
  */
  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.execDetailsEnd(46);
      Vector<Object> vector0 = new Vector<Object>();
      Contract contract0 = new Contract(46, "reqId = 46 =============== end ===============", "BAG", "BAG", 46, "BAG", "reqId = 46 =============== end ===============", "reqId = 46 =============== end ===============", "BAG", "reqId = 46 =============== end ===============", vector0, "reqId = 46 =============== end ===============", false, "reqId = 46 =============== end ===============", "reqId = 46 =============== end ===============");
      Order order0 = new Order();
      order0.m_basisPoints = 46.0;
      order0.m_notHeld = false;
      OrderState orderState0 = new OrderState();
      String string1 = EWrapperMsgGenerator.openOrder(0, contract0, order0, orderState0);
      assertFalse(string1.equals((Object)string0));
  }

  /**
  //Test case number: 1
  /*Coverage entropy=1.1217186091313738
  */
  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.contractDetailsEnd(22);
      assertEquals("reqId = 22 =============== end ===============", string0);
      
      Vector<Object> vector0 = new Vector<Object>();
      Contract contract0 = new Contract(22, "reqId = 22 =============== end ===============", "BAG", "BAG", 22, "BAG", "reqId = 22 =============== end ===============", "reqId = 22 =============== end ===============", "BAG", "reqId = 22 =============== end ===============", vector0, "reqId = 22 =============== end ===============", true, "reqId = 22 =============== end ===============", "reqId = 22 =============== end ===============");
      contract0.m_comboLegsDescrip = ".>N7Tosy";
      Order order0 = new Order();
      OrderState orderState0 = new OrderState();
      EWrapperMsgGenerator.openOrder(0, contract0, order0, orderState0);
      String string1 = EWrapperMsgGenerator.tickGeneric(0, 22, (-1.0));
      assertEquals("id=0  OpenInterest=-1.0", string1);
  }

  /**
  //Test case number: 2
  /*Coverage entropy=0.3333333333333333
  */
  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Contract contract0 = new Contract();
      Order order0 = new Order();
      OrderState orderState0 = new OrderState("", (String) null, (String) null, (String) null, 1, Integer.MAX_VALUE, 'f', "", (String) null);
      order0.m_algoParams = contract0.m_comboLegs;
      order0.m_algoStrategy = "O";
      String string0 = EWrapperMsgGenerator.openOrder(3, contract0, order0, orderState0);
      assertNotNull(string0);
  }

  /**
  //Test case number: 3
  /*Coverage entropy=0.3333333333333333
  */
  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Contract contract0 = new Contract();
      Order order0 = new Order();
      OrderState orderState0 = new OrderState();
      order0.m_algoStrategy = "O";
      String string0 = EWrapperMsgGenerator.openOrder(3, contract0, order0, orderState0);
      assertNotNull(string0);
  }

  /**
  //Test case number: 4
  /*Coverage entropy=0.4
  */
  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.contractDetailsEnd(111);
      Vector<Object> vector0 = new Vector<Object>();
      Contract contract0 = new Contract(111, "reqId = 111 =============== end ===============", "BAG", "BAG", 111, "BAG", "reqId = 111 =============== end ===============", "reqId = 111 =============== end ===============", "BAG", "reqId = 111 =============== end ===============", vector0, "reqId = 111 =============== end ===============", false, "reqId = 111 =============== end ===============", "reqId = 111 =============== end ===============");
      Order order0 = new Order();
      OrderState orderState0 = new OrderState();
      String string1 = EWrapperMsgGenerator.openOrder(Integer.MAX_VALUE, contract0, order0, orderState0);
      assertFalse(string1.equals((Object)string0));
  }

  /**
  //Test case number: 5
  /*Coverage entropy=0.3333333333333333
  */
  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Contract contract0 = new Contract();
      Order order0 = new Order();
      UnderComp underComp0 = new UnderComp();
      contract0.m_underComp = underComp0;
      OrderState orderState0 = new OrderState();
      String string0 = EWrapperMsgGenerator.openOrder(1, contract0, order0, orderState0);
      assertNotNull(string0);
  }

  /**
  //Test case number: 6
  /*Coverage entropy=0.3333333333333333
  */
  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      // Undeclared exception!
      try { 
        EWrapperMsgGenerator.bondContractDetails((-2806), (ContractDetails) null);
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
      Contract contract0 = new Contract();
      String string0 = EWrapperMsgGenerator.tickOptionComputation(13, 13, 0.0, 1.7976931348623157E308, 0, 13);
      assertEquals("id=13  modelOptComp: vol = 0.0 delta = N/A: modelPrice = 0.0: pvDividend = 13.0", string0);
  }

  /**
  //Test case number: 8
  /*Coverage entropy=0.3333333333333333
  */
  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.tickOptionComputation(13, 13, 13, 102, 13, 1.7976931348623157E308);
      assertEquals("id=13  modelOptComp: vol = 13.0 delta = N/A: modelPrice = 13.0: pvDividend = N/A", string0);
  }

  /**
  //Test case number: 9
  /*Coverage entropy=0.3333333333333333
  */
  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.tickOptionComputation(13, 13, 1516, 1516, 0.0, 0.0);
      assertEquals("id=13  modelOptComp: vol = 1516.0 delta = N/A: modelPrice = 0.0: pvDividend = 0.0", string0);
  }

  /**
  //Test case number: 10
  /*Coverage entropy=0.3333333333333333
  */
  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.tickOptionComputation(102, 13, 102, 102, 1.7976931348623157E308, 1.7976931348623157E308);
      assertEquals("id=102  modelOptComp: vol = 102.0 delta = N/A: modelPrice = N/A: pvDividend = N/A", string0);
  }

  /**
  //Test case number: 11
  /*Coverage entropy=0.3333333333333333
  */
  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.tickOptionComputation(13, 13, 13, 13, (-1197.0), (-1197.0));
      assertEquals("id=13  modelOptComp: vol = 13.0 delta = N/A: modelPrice = N/A: pvDividend = N/A", string0);
  }

  /**
  //Test case number: 12
  /*Coverage entropy=0.3333333333333333
  */
  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      // Undeclared exception!
      try { 
        EWrapperMsgGenerator.contractDetails((-1276), (ContractDetails) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.ib.client.EWrapperMsgGenerator", e);
      }
  }

  /**
  //Test case number: 13
  /*Coverage entropy=0.3333333333333333
  */
  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
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
  //Test case number: 14
  /*Coverage entropy=0.3333333333333333
  */
  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Order order0 = new Order();
      String string0 = EWrapperMsgGenerator.tickOptionComputation(0, 2, (-2112.8131279305144), 1, 1.7976931348623157E308, 1);
      assertEquals("id=0  askPrice: vol = N/A delta = 1.0", string0);
  }

  /**
  //Test case number: 15
  /*Coverage entropy=0.3333333333333333
  */
  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      // Undeclared exception!
      try { 
        EWrapperMsgGenerator.scannerData((-1906), (-1906), (ContractDetails) null, "X", "X", "!(^\"SueOZ/", "!(^\"SueOZ/");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.ib.client.EWrapperMsgGenerator", e);
      }
  }

  /**
  //Test case number: 16
  /*Coverage entropy=0.3333333333333333
  */
  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Order order0 = new Order();
      String string0 = EWrapperMsgGenerator.tickEFP(0, 'y', 1, (String) null, 3, 0, (String) null, 0, 1.7976931348623157E308);
      assertEquals("id=0  unknown: basisPoints = 1.0/null impliedFuture = 3.0 holdDays = 0 futureExpiry = null dividendImpact = 0.0 dividends to expiry = 1.7976931348623157E308", string0);
  }

  /**
  //Test case number: 17
  /*Coverage entropy=1.0931471805599453
  */
  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Order order0 = new Order();
      Order order1 = new Order();
      OrderState orderState0 = new OrderState((String) null, (String) null, (String) null, (String) null, 1.7976931348623157E308, 1.7976931348623157E308, 0, (String) null, (String) null);
      // Undeclared exception!
      try { 
        EWrapperMsgGenerator.updatePortfolio((Contract) null, 'n', 'c', 1.7976931348623157E308, 'f', 1.7976931348623157E308, '?', (String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.ib.client.EWrapperMsgGenerator", e);
      }
  }

  /**
  //Test case number: 18
  /*Coverage entropy=0.3333333333333333
  */
  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.tickPrice((-4683), (-4683), (-4683), (-4683));
      assertEquals("id=-4683  unknown=-4683.0  canAutoExecute", string0);
  }

  /**
  //Test case number: 19
  /*Coverage entropy=1.5271837172395382
  */
  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      EWrapperMsgGenerator.fundamentalData((-1461), " designatedLocation=");
      Vector<String> vector0 = new Vector<String>();
      Contract contract0 = new Contract();
      EWrapperMsgGenerator.updateAccountValue("", "_^s", "", (String) null);
      EWrapperMsgGenerator eWrapperMsgGenerator0 = new EWrapperMsgGenerator();
      assertEquals(" =============== end ===============", eWrapperMsgGenerator0.openOrderEnd());
  }

  /**
  //Test case number: 20
  /*Coverage entropy=0.3333333333333333
  */
  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Order order0 = new Order();
      String string0 = EWrapperMsgGenerator.tickOptionComputation(0, 0, 1.7976931348623157E308, 0.0, 2, 1.7976931348623157E308);
      assertEquals("id=0  bidSize: vol = N/A delta = 0.0", string0);
  }

  /**
  //Test case number: 21
  /*Coverage entropy=0.3333333333333333
  */
  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Order order0 = new Order();
      String string0 = EWrapperMsgGenerator.tickOptionComputation(0, 0, 1.7976931348623157E308, 1.7976931348623157E308, 1, 0);
      assertEquals("id=0  bidSize: vol = N/A delta = N/A", string0);
  }

  /**
  //Test case number: 22
  /*Coverage entropy=0.3333333333333333
  */
  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Order order0 = new Order();
      String string0 = EWrapperMsgGenerator.tickOptionComputation(0, 0, 0, 1.7976931348623157E308, 1.7976931348623157E308, Integer.MAX_VALUE);
      assertEquals("id=0  bidSize: vol = 0.0 delta = N/A", string0);
  }

  /**
  //Test case number: 23
  /*Coverage entropy=1.0931471805599453
  */
  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      Order order0 = new Order();
      String string0 = EWrapperMsgGenerator.tickEFP(0, Integer.MAX_VALUE, 0, "", 'm', Integer.MAX_VALUE, (String) null, 1.7976931348623157E308, 1.7976931348623157E308);
      assertEquals("id=0  unknown: basisPoints = 0.0/ impliedFuture = 109.0 holdDays = 2147483647 futureExpiry = null dividendImpact = 1.7976931348623157E308 dividends to expiry = 1.7976931348623157E308", string0);
      
      String string1 = EWrapperMsgGenerator.scannerParameters((String) null);
      assertEquals("SCANNER PARAMETERS:\nnull", string1);
  }

  /**
  //Test case number: 24
  /*Coverage entropy=0.3333333333333333
  */
  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      Order order0 = new Order();
      String string0 = EWrapperMsgGenerator.tickEFP(Integer.MAX_VALUE, Integer.MAX_VALUE, 1.7976931348623157E308, (String) null, '?', 2, (String) null, 0, 'b');
      assertEquals("id=2147483647  unknown: basisPoints = 1.7976931348623157E308/null impliedFuture = 63.0 holdDays = 2 futureExpiry = null dividendImpact = 0.0 dividends to expiry = 98.0", string0);
  }

  /**
  //Test case number: 25
  /*Coverage entropy=0.3333333333333333
  */
  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      Order order0 = new Order();
      String string0 = EWrapperMsgGenerator.updateAccountTime((String) null);
      assertEquals("updateAccountTime: null", string0);
  }

  /**
  //Test case number: 26
  /*Coverage entropy=0.3333333333333333
  */
  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.openOrderEnd();
      assertEquals(" =============== end ===============", string0);
  }

  /**
  //Test case number: 27
  /*Coverage entropy=0.3333333333333333
  */
  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      Order order0 = new Order();
      String string0 = EWrapperMsgGenerator.orderStatus(0, (String) null, 0, 'y', Integer.MAX_VALUE, 3, 1, 1.7976931348623157E308, Integer.MAX_VALUE, "");
      assertEquals("order status: orderId=0 clientId=2147483647 permId=3 status=null filled=0 remaining=121 avgFillPrice=2.147483647E9 lastFillPrice=1.7976931348623157E308 parent Id=1 whyHeld=", string0);
  }

  /**
  //Test case number: 28
  /*Coverage entropy=0.3333333333333333
  */
  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      Order order0 = new Order();
      String string0 = EWrapperMsgGenerator.orderStatus(1, (String) null, 0, 2, 'm', Integer.MAX_VALUE, 0, Integer.MAX_VALUE, '?', (String) null);
      assertEquals("order status: orderId=1 clientId=63 permId=2147483647 status=null filled=0 remaining=2 avgFillPrice=109.0 lastFillPrice=2.147483647E9 parent Id=0 whyHeld=null", string0);
  }

  /**
  //Test case number: 29
  /*Coverage entropy=0.3333333333333333
  */
  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      Order order0 = new Order();
      String string0 = EWrapperMsgGenerator.orderStatus('m', "", 0, 'y', 1, 'y', Integer.MAX_VALUE, 1.7976931348623157E308, 2, "");
      assertEquals("order status: orderId=109 clientId=2 permId=121 status= filled=0 remaining=121 avgFillPrice=1.0 lastFillPrice=1.7976931348623157E308 parent Id=2147483647 whyHeld=", string0);
  }

  /**
  //Test case number: 30
  /*Coverage entropy=0.3333333333333333
  */
  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      Order order0 = new Order();
      String string0 = EWrapperMsgGenerator.tickPrice(Integer.MAX_VALUE, 0, 1.7976931348623157E308, 1);
      assertEquals("id=2147483647  bidSize=1.7976931348623157E308  canAutoExecute", string0);
  }

  /**
  //Test case number: 31
  /*Coverage entropy=0.3333333333333333
  */
  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      Order order0 = new Order();
      String string0 = EWrapperMsgGenerator.tickString(1, 0, (String) null);
      assertEquals("id=1  bidSize=null", string0);
  }

  /**
  //Test case number: 32
  /*Coverage entropy=0.3333333333333333
  */
  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
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
  //Test case number: 33
  /*Coverage entropy=0.3333333333333333
  */
  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.tickOptionComputation((-3383), (-3383), (-3383), (-3383), (-3383), 1594.93881185415);
      assertEquals("id=-3383  unknown: vol = N/A delta = N/A", string0);
  }

  /**
  //Test case number: 34
  /*Coverage entropy=0.3333333333333333
  */
  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      Contract contract0 = new Contract();
      Order order0 = new Order();
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
      Execution execution0 = new Execution();
      execution0.m_acctNumber = null;
      // Undeclared exception!
      try { 
        EWrapperMsgGenerator.execDetails(13, (Contract) null, execution0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.ib.client.EWrapperMsgGenerator", e);
      }
  }

  /**
  //Test case number: 36
  /*Coverage entropy=0.3333333333333333
  */
  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.managedAccounts("}6x9W(_rts0?V'4z_J");
      assertEquals("Connected : The list of managed accounts are : [}6x9W(_rts0?V'4z_J]", string0);
  }

  /**
  //Test case number: 37
  /*Coverage entropy=0.3333333333333333
  */
  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.accountDownloadEnd((String) null);
      assertEquals("accountDownloadEnd: null", string0);
  }

  /**
  //Test case number: 38
  /*Coverage entropy=0.3333333333333333
  */
  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      Contract contract0 = new Contract();
      Execution execution0 = new Execution();
      String string0 = EWrapperMsgGenerator.execDetails(2146041172, contract0, execution0);
      assertEquals(" ---- Execution Details begin ----\nreqId = 2146041172\norderId = 0\nclientId = 0\nsymbol = null\nsecType = null\nexpiry = null\nstrike = 0.0\nright = null\ncontractExchange = null\ncurrency = null\nlocalSymbol = null\nexecId = null\ntime = null\nacctNumber = null\nexecutionExchange = null\nside = null\nshares = 0\nprice = 0.0\npermId = 0\nliquidation = 0\ncumQty = 0\navgPrice = 0.0\n ---- Execution Details end ----\n", string0);
  }

  /**
  //Test case number: 39
  /*Coverage entropy=0.3333333333333333
  */
  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.currentTime(1L);
      assertEquals("current time = 1 (Jan 1, 1970 12:00:01 AM)", string0);
  }

  /**
  //Test case number: 40
  /*Coverage entropy=0.3333333333333333
  */
  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      Order order0 = new Order();
      String string0 = EWrapperMsgGenerator.updateNewsBulletin('y', 0, "", (String) null);
      assertEquals("MsgId=121 :: MsgType=0 :: Origin=null :: Message=", string0);
  }

  /**
  //Test case number: 41
  /*Coverage entropy=0.3333333333333333
  */
  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      Order order0 = new Order();
      String string0 = EWrapperMsgGenerator.tickPrice(Integer.MAX_VALUE, 0, 'c', 0);
      assertEquals("id=2147483647  bidSize=99.0  noAutoExecute", string0);
  }

  /**
  //Test case number: 42
  /*Coverage entropy=0.3333333333333333
  */
  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      ContractDetails contractDetails0 = new ContractDetails();
      String string0 = EWrapperMsgGenerator.bondContractDetails(0, contractDetails0);
      assertEquals("reqId = 0 ===================================\n ---- Bond Contract Details begin ----\nsymbol = null\nsecType = null\ncusip = null\ncoupon = 0.0\nmaturity = null\nissueDate = null\nratings = null\nbondType = null\ncouponType = null\nconvertible = false\ncallable = false\nputable = false\ndescAppend = null\nexchange = null\ncurrency = null\nmarketName = null\ntradingClass = null\nconid = 0\nminTick = 0.0\norderTypes = null\nvalidExchanges = null\nnextOptionDate = null\nnextOptionType = null\nnextOptionPartial = false\nnotes = null\nlongName = null\n ---- Bond Contract Details End ----\n", string0);
  }

  /**
  //Test case number: 43
  /*Coverage entropy=0.3333333333333333
  */
  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      Order order0 = new Order();
      String string0 = EWrapperMsgGenerator.updateAccountValue((String) null, "com.ib.client.AnyWrapperMsgGenerator", "", "");
      assertEquals("updateAccountValue: null com.ib.client.AnyWrapperMsgGenerator  ", string0);
  }

  /**
  //Test case number: 44
  /*Coverage entropy=0.3333333333333333
  */
  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      Order order0 = new Order();
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
  //Test case number: 45
  /*Coverage entropy=0.3333333333333333
  */
  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      Order order0 = new Order();
      String string0 = EWrapperMsgGenerator.nextValidId('n');
      assertEquals("Next Valid Order ID: 110", string0);
  }

  /**
  //Test case number: 46
  /*Coverage entropy=0.3333333333333333
  */
  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      ContractDetails contractDetails0 = new ContractDetails();
      String string0 = EWrapperMsgGenerator.scannerData(10, 10, contractDetails0, (String) null, "com.ib.client.Contract", (String) null, (String) null);
      assertEquals("id = 10 rank=10 symbol=null secType=null expiry=null strike=0.0 right=null exchange=null currency=null localSymbol=null marketName=null tradingClass=null distance=null benchmark=com.ib.client.Contract projection=null legsStr=null", string0);
  }

  /**
  //Test case number: 47
  /*Coverage entropy=0.3333333333333333
  */
  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      ContractDetails contractDetails0 = new ContractDetails();
      String string0 = EWrapperMsgGenerator.scannerData((-651), (-651), contractDetails0, "7*SMGdK/;]K", (String) null, (String) null, "S");
      assertEquals("id = -651 rank=-651 symbol=null secType=null expiry=null strike=0.0 right=null exchange=null currency=null localSymbol=null marketName=null tradingClass=null distance=7*SMGdK/;]K benchmark=null projection=null legsStr=S", string0);
  }

  /**
  //Test case number: 48
  /*Coverage entropy=0.3333333333333333
  */
  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      Order order0 = new Order();
      ContractDetails contractDetails0 = new ContractDetails();
      String string0 = EWrapperMsgGenerator.scannerData(0, 16, contractDetails0, (String) null, (String) null, (String) null, (String) null);
      assertEquals("id = 0 rank=16 symbol=null secType=null expiry=null strike=0.0 right=null exchange=null currency=null localSymbol=null marketName=null tradingClass=null distance=null benchmark=null projection=null legsStr=null", string0);
  }

  /**
  //Test case number: 49
  /*Coverage entropy=0.3333333333333333
  */
  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      Order order0 = new Order();
      String string0 = EWrapperMsgGenerator.updateMktDepthL2(0, 0, (String) null, 'y', 'c', Integer.MAX_VALUE, 'm');
      assertEquals("updateMktDepth: 0 0 null 121 99 2.147483647E9 109", string0);
  }

  /**
  //Test case number: 50
  /*Coverage entropy=0.3333333333333333
  */
  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      Order order0 = new Order();
      String string0 = EWrapperMsgGenerator.updateMktDepthL2('n', Integer.MAX_VALUE, (String) null, 3, Integer.MAX_VALUE, 0, 0);
      assertEquals("updateMktDepth: 110 2147483647 null 3 2147483647 0.0 0", string0);
  }

  /**
  //Test case number: 51
  /*Coverage entropy=0.3333333333333333
  */
  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      Order order0 = new Order();
      String string0 = EWrapperMsgGenerator.updateMktDepth(0, 0, Integer.MAX_VALUE, 0, 1.7976931348623157E308, 'n');
      assertEquals("updateMktDepth: 0 0 2147483647 0 1.7976931348623157E308 110", string0);
  }

  /**
  //Test case number: 52
  /*Coverage entropy=0.3333333333333333
  */
  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      Order order0 = new Order();
      String string0 = EWrapperMsgGenerator.receiveFA(0, (String) null);
      assertEquals("FA: null null", string0);
  }

  /**
  //Test case number: 53
  /*Coverage entropy=0.3333333333333333
  */
  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      Order order0 = new Order();
      String string0 = EWrapperMsgGenerator.updateMktDepth(0, Integer.MAX_VALUE, 'b', 'b', 0.0, 0);
      assertEquals("updateMktDepth: 0 2147483647 98 98 0.0 0", string0);
  }

  /**
  //Test case number: 54
  /*Coverage entropy=0.3333333333333333
  */
  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.scannerDataEnd(1742);
      assertEquals("id = 1742 =============== end ===============", string0);
  }

  /**
  //Test case number: 55
  /*Coverage entropy=1.0931471805599453
  */
  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      Contract contract0 = new Contract();
      Order order0 = new Order();
      OrderState orderState0 = new OrderState();
      String string0 = EWrapperMsgGenerator.updatePortfolio(contract0, 0, Integer.MAX_VALUE, '?', 0, 1.7976931348623157E308, 0.0, (String) null);
      assertEquals("updatePortfolio: conid = 0\nsymbol = null\nsecType = null\nexpiry = null\nstrike = 0.0\nright = null\nmultiplier = null\nexchange = null\nprimaryExch = null\ncurrency = null\nlocalSymbol = null\n0 2.147483647E9 63.0 0.0 1.7976931348623157E308 0.0 null", string0);
      assertNotNull(string0);
  }

  /**
  //Test case number: 56
  /*Coverage entropy=0.3333333333333333
  */
  @Test(timeout = 4000)
  public void test56()  throws Throwable  {
      Contract contract0 = new Contract();
      String string0 = EWrapperMsgGenerator.contractMsg(contract0);
      assertEquals("conid = 0\nsymbol = null\nsecType = null\nexpiry = null\nstrike = 0.0\nright = null\nmultiplier = null\nexchange = null\nprimaryExch = null\ncurrency = null\nlocalSymbol = null\n", string0);
  }

  /**
  //Test case number: 57
  /*Coverage entropy=1.5271837172395382
  */
  @Test(timeout = 4000)
  public void test57()  throws Throwable  {
      ContractDetails contractDetails0 = new ContractDetails();
      String string0 = EWrapperMsgGenerator.contractDetails((-5242), contractDetails0);
      assertEquals("reqId = -5242 ===================================\n ---- Contract Details begin ----\nconid = 0\nsymbol = null\nsecType = null\nexpiry = null\nstrike = 0.0\nright = null\nmultiplier = null\nexchange = null\nprimaryExch = null\ncurrency = null\nlocalSymbol = null\nmarketName = null\ntradingClass = null\nminTick = 0.0\nprice magnifier = 0\norderTypes = null\nvalidExchanges = null\nunderConId = 0\nlongName = null\ncontractMonth = null\nindustry = null\ncategory = null\nsubcategory = null\ntimeZoneId = null\ntradingHours = null\nliquidHours = null\n ---- Contract Details End ----\n", string0);
  }

  /**
  //Test case number: 58
  /*Coverage entropy=1.0931471805599453
  */
  @Test(timeout = 4000)
  public void test58()  throws Throwable  {
      Contract contract0 = new Contract();
      String string0 = EWrapperMsgGenerator.updatePortfolio(contract0, 0, 0.0, 0, 0, 13.0, 13.0, (String) null);
      assertEquals("updatePortfolio: conid = 0\nsymbol = null\nsecType = null\nexpiry = null\nstrike = 0.0\nright = null\nmultiplier = null\nexchange = null\nprimaryExch = null\ncurrency = null\nlocalSymbol = null\n0 0.0 0.0 0.0 13.0 13.0 null", string0);
      assertNotNull(string0);
  }

  /**
  //Test case number: 59
  /*Coverage entropy=0.3333333333333333
  */
  @Test(timeout = 4000)
  public void test59()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.realtimeBar(1, 0L, 1.0, 1.0, 1, 0L, 1, 1.0, 1);
      assertEquals("id=1 time = 0 open=1.0 high=1.0 low=1.0 close=0.0 volume=1 count=1 WAP=1.0", string0);
  }

  /**
  //Test case number: 60
  /*Coverage entropy=0.3333333333333333
  */
  @Test(timeout = 4000)
  public void test60()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.realtimeBar((-1483), (-1483), 1.0, 1.0, (-1483), 1.0, (-1483), 1.0, 2146771381);
      assertEquals("id=-1483 time = -1483 open=1.0 high=1.0 low=-1483.0 close=1.0 volume=-1483 count=2146771381 WAP=1.0", string0);
  }

  /**
  //Test case number: 61
  /*Coverage entropy=0.3333333333333333
  */
  @Test(timeout = 4000)
  public void test61()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.realtimeBar((-2382), (-2382), 4266.14, (-2382), 4266.14, 4266.14, 354L, 4266.14, (-2382));
      assertEquals("id=-2382 time = -2382 open=4266.14 high=-2382.0 low=4266.14 close=4266.14 volume=354 count=-2382 WAP=4266.14", string0);
  }

  /**
  //Test case number: 62
  /*Coverage entropy=0.3333333333333333
  */
  @Test(timeout = 4000)
  public void test62()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.tickOptionComputation(233, 13, 233, 13, 13, 233);
      assertEquals("id=233  modelOptComp: vol = 233.0 delta = N/A: modelPrice = 13.0: pvDividend = 233.0", string0);
  }

  /**
  //Test case number: 63
  /*Coverage entropy=0.3333333333333333
  */
  @Test(timeout = 4000)
  public void test63()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.tickOptionComputation(1494, 13, 1494, 1494, 13, 13);
      assertEquals("id=1494  modelOptComp: vol = 1494.0 delta = N/A: modelPrice = 13.0: pvDividend = 13.0", string0);
  }

  /**
  //Test case number: 64
  /*Coverage entropy=0.3333333333333333
  */
  @Test(timeout = 4000)
  public void test64()  throws Throwable  {
      Order order0 = new Order();
      String string0 = EWrapperMsgGenerator.tickOptionComputation(0, Integer.MAX_VALUE, 1.7976931348623157E308, 0, 0.0, 0);
      assertEquals("id=0  unknown: vol = N/A delta = 0.0", string0);
  }

  /**
  //Test case number: 65
  /*Coverage entropy=0.3333333333333333
  */
  @Test(timeout = 4000)
  public void test65()  throws Throwable  {
      Order order0 = new Order();
      String string0 = EWrapperMsgGenerator.tickSize(Integer.MAX_VALUE, 2, 0);
      assertEquals("id=2147483647  askPrice=0", string0);
  }

  /**
  //Test case number: 66
  /*Coverage entropy=0.3333333333333333
  */
  @Test(timeout = 4000)
  public void test66()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.tickSnapshotEnd(102);
      assertEquals("id=102 =============== end ===============", string0);
  }

  /**
  //Test case number: 67
  /*Coverage entropy=0.3333333333333333
  */
  @Test(timeout = 4000)
  public void test67()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.realtimeBar(549, 549, 549, 549, 549, 549, 1L, 1L, 549);
      assertEquals("id=549 time = 549 open=549.0 high=549.0 low=549.0 close=549.0 volume=1 count=549 WAP=1.0", string0);
  }

  /**
  //Test case number: 68
  /*Coverage entropy=0.3333333333333333
  */
  @Test(timeout = 4000)
  public void test68()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.tickOptionComputation(102, 13, 102, 102, 102, 102);
      assertEquals("id=102  modelOptComp: vol = 102.0 delta = N/A: modelPrice = 102.0: pvDividend = 102.0", string0);
  }

  /**
  //Test case number: 69
  /*Coverage entropy=0.3333333333333333
  */
  @Test(timeout = 4000)
  public void test69()  throws Throwable  {
      Order order0 = new Order();
      String string0 = EWrapperMsgGenerator.tickOptionComputation(0, 0, 0.0, Integer.MAX_VALUE, 0, Integer.MAX_VALUE);
      assertEquals("id=0  bidSize: vol = 0.0 delta = N/A", string0);
  }

  /**
  //Test case number: 70
  /*Coverage entropy=0.3333333333333333
  */
  @Test(timeout = 4000)
  public void test70()  throws Throwable  {
      Contract contract0 = new Contract();
      Order order0 = new Order();
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
  //Test case number: 71
  /*Coverage entropy=0.3333333333333333
  */
  @Test(timeout = 4000)
  public void test71()  throws Throwable  {
      Order order0 = new Order();
      String string0 = EWrapperMsgGenerator.historicalData(Integer.MAX_VALUE, (String) null, 'f', 1.7976931348623157E308, '?', 1.7976931348623157E308, Integer.MAX_VALUE, 'c', 'n', false);
      assertEquals("id=2147483647 date = null open=102.0 high=1.7976931348623157E308 low=63.0 close=1.7976931348623157E308 volume=2147483647 count=99 WAP=110.0 hasGaps=false", string0);
  }

  /**
  //Test case number: 72
  /*Coverage entropy=0.3333333333333333
  */
  @Test(timeout = 4000)
  public void test72()  throws Throwable  {
      Order order0 = new Order();
      String string0 = EWrapperMsgGenerator.historicalData(Integer.MAX_VALUE, (String) null, 1.7976931348623157E308, 1, 3, 1.7976931348623157E308, 0, Integer.MAX_VALUE, 0, false);
      assertEquals("id=2147483647 date = null open=1.7976931348623157E308 high=1.0 low=3.0 close=1.7976931348623157E308 volume=0 count=2147483647 WAP=0.0 hasGaps=false", string0);
  }

  /**
  //Test case number: 73
  /*Coverage entropy=0.3333333333333333
  */
  @Test(timeout = 4000)
  public void test73()  throws Throwable  {
      UnderComp underComp0 = new UnderComp();
      String string0 = EWrapperMsgGenerator.deltaNeutralValidation((-2146631944), underComp0);
      assertEquals("id = -2146631944 underComp.conId =0 underComp.delta =0.0 underComp.price =0.0", string0);
  }

  /**
  //Test case number: 74
  /*Coverage entropy=0.3333333333333333
  */
  @Test(timeout = 4000)
  public void test74()  throws Throwable  {
      Order order0 = new Order();
      String string0 = EWrapperMsgGenerator.historicalData(1, (String) null, 1.7976931348623157E308, 1.7976931348623157E308, 0, 1.7976931348623157E308, 0, 'n', Integer.MAX_VALUE, false);
      assertEquals("id=1 date = null open=1.7976931348623157E308 high=1.7976931348623157E308 low=0.0 close=1.7976931348623157E308 volume=0 count=110 WAP=2.147483647E9 hasGaps=false", string0);
  }
}
