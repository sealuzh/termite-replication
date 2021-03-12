/*
 * This file was automatically generated by EvoSuite
 * Sun Nov 08 15:17:48 GMT 2020
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
      String string0 = EWrapperMsgGenerator.scannerData((-1911474256), (-1911474256), contractDetails0, (String) null, " WAP=", "reqId = -2084 =============== end ===============", (String) null);
      assertEquals("id = -1911474256 rank=-1911474256 symbol=null secType=null expiry=null strike=0.0 right=null exchange=null currency=null localSymbol=null marketName=null tradingClass=null distance=null benchmark= WAP= projection=reqId = -2084 =============== end =============== legsStr=null", string0);
  }

  /**
  //Test case number: 1
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      ContractDetails contractDetails0 = new ContractDetails();
      String string0 = EWrapperMsgGenerator.scannerData(2146474508, (-1420), contractDetails0, (String) null, (String) null, (String) null, (String) null);
      assertEquals("id = 2146474508 rank=-1420 symbol=null secType=null expiry=null strike=0.0 right=null exchange=null currency=null localSymbol=null marketName=null tradingClass=null distance=null benchmark=null projection=null legsStr=null", string0);
  }

  /**
  //Test case number: 2
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.realtimeBar(2704, 2704, 2704, 2704, 0.0, 0.0, 2704, 2704, 2704);
      assertEquals("id=2704 time = 2704 open=2704.0 high=2704.0 low=0.0 close=0.0 volume=2704 count=2704 WAP=2704.0", string0);
  }

  /**
  //Test case number: 3
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.realtimeBar(1994091958, 1994091958, 1994091958, 333.592, 1994091958, 1994091958, 1L, 333.592, 1994091958);
      assertEquals("id=1994091958 time = 1994091958 open=1.994091958E9 high=333.592 low=1.994091958E9 close=1.994091958E9 volume=1 count=1994091958 WAP=333.592", string0);
  }

  /**
  //Test case number: 4
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.realtimeBar(13, 13, 13, 13, 13, 13, 13, 13, 1);
      assertEquals("id=13 time = 13 open=13.0 high=13.0 low=13.0 close=13.0 volume=13 count=1 WAP=13.0", string0);
  }

  /**
  //Test case number: 5
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.historicalData(0, (String) null, 0, 1.7976931348623157E308, 1.7976931348623157E308, 'c', 0, 'b', 'f', false);
      assertEquals("id=0 date = null open=0.0 high=1.7976931348623157E308 low=1.7976931348623157E308 close=99.0 volume=0 count=98 WAP=102.0 hasGaps=false", string0);
  }

  /**
  //Test case number: 6
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.updateMktDepthL2('n', Integer.MAX_VALUE, (String) null, 0, 0, 3, Integer.MAX_VALUE);
      assertEquals("updateMktDepth: 110 2147483647 null 0 0 3.0 2147483647", string0);
  }

  /**
  //Test case number: 7
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.updateMktDepthL2(0, 0, (String) null, Integer.MAX_VALUE, 0, 1.7976931348623157E308, Integer.MAX_VALUE);
      assertEquals("updateMktDepth: 0 0 null 2147483647 0 1.7976931348623157E308 2147483647", string0);
  }

  /**
  //Test case number: 8
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Contract contract0 = new Contract();
      String string0 = EWrapperMsgGenerator.updatePortfolio(contract0, 2, 0, 1.7976931348623157E308, 178.98014714888745, 5229.90098, 1.7976931348623157E308, (String) null);
      assertNotNull(string0);
      assertEquals("updatePortfolio: conid = 0\nsymbol = null\nsecType = null\nexpiry = null\nstrike = 0.0\nright = null\nmultiplier = null\nexchange = null\nprimaryExch = null\ncurrency = null\nlocalSymbol = null\n2 0.0 1.7976931348623157E308 178.98014714888745 5229.90098 1.7976931348623157E308 null", string0);
  }

  /**
  //Test case number: 9
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.updateAccountValue((String) null, "", "O", (String) null);
      assertEquals("updateAccountValue: null  O null", string0);
  }

  /**
  //Test case number: 10
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.orderStatus(Integer.MAX_VALUE, (String) null, 0, Integer.MAX_VALUE, 0.0, 0, 'c', 0, '?', "O");
      assertEquals("order status: orderId=2147483647 clientId=63 permId=0 status=null filled=0 remaining=2147483647 avgFillPrice=0.0 lastFillPrice=0.0 parent Id=99 whyHeld=O", string0);
  }

  /**
  //Test case number: 11
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.orderStatus(3, (String) null, 0, 0, 0, 'b', Integer.MAX_VALUE, 0, 'y', (String) null);
      assertEquals("order status: orderId=3 clientId=121 permId=98 status=null filled=0 remaining=0 avgFillPrice=0.0 lastFillPrice=0.0 parent Id=2147483647 whyHeld=null", string0);
  }

  /**
  //Test case number: 12
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.tickOptionComputation(13, 13, 13, 13, 1553.755426, 1553.755426);
      assertEquals("id=13  modelOptComp: vol = 13.0 delta = N/A: modelPrice = 1553.755426: pvDividend = 1553.755426", string0);
  }

  /**
  //Test case number: 13
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.tickOptionComputation(13, 13, 0.0, 13, 0.0, 0.0);
      assertEquals("id=13  modelOptComp: vol = 0.0 delta = N/A: modelPrice = 0.0: pvDividend = 0.0", string0);
  }

  /**
  //Test case number: 14
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.tickOptionComputation(Integer.MAX_VALUE, Integer.MAX_VALUE, 0, 1, 0, 0);
      assertEquals("id=2147483647  unknown: vol = 0.0 delta = 1.0", string0);
  }

  /**
  //Test case number: 15
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.tickOptionComputation(0, 13, 0, 13, 13, 0);
      assertEquals("id=0  modelOptComp: vol = 0.0 delta = N/A: modelPrice = 13.0: pvDividend = 0.0", string0);
  }

  /**
  //Test case number: 16
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.tickPrice(0, 0, 'y', 'c');
      assertEquals("id=0  bidSize=121.0  canAutoExecute", string0);
  }

  /**
  //Test case number: 17
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Contract contract0 = new Contract();
      String string0 = EWrapperMsgGenerator.updatePortfolio(contract0, 3, 3, 13, 3, 2.146526232E9, 0, " :: MsgType=");
      assertEquals("updatePortfolio: conid = 0\nsymbol = null\nsecType = null\nexpiry = null\nstrike = 0.0\nright = null\nmultiplier = null\nexchange = null\nprimaryExch = null\ncurrency = null\nlocalSymbol = null\n3 3.0 13.0 3.0 2.146526232E9 0.0  :: MsgType=", string0);
  }

  /**
  //Test case number: 18
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      ContractDetails contractDetails0 = new ContractDetails();
      String string0 = EWrapperMsgGenerator.scannerData((-1371), (-1371), contractDetails0, "HRNHC%f%w", (String) null, "kp%3dPJ)vdz7Fyf", (String) null);
      assertEquals("id = -1371 rank=-1371 symbol=null secType=null expiry=null strike=0.0 right=null exchange=null currency=null localSymbol=null marketName=null tradingClass=null distance=HRNHC%f%w benchmark=null projection=kp%3dPJ)vdz7Fyf legsStr=null", string0);
  }

  /**
  //Test case number: 19
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.fundamentalData(Integer.MAX_VALUE, "O");
      assertEquals("id  = 2147483647 len = 1\nO", string0);
  }

  /**
  //Test case number: 20
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Contract contract0 = new Contract();
      Execution execution0 = new Execution();
      String string0 = EWrapperMsgGenerator.execDetails(2077, contract0, execution0);
      assertEquals(" ---- Execution Details begin ----\nreqId = 2077\norderId = 0\nclientId = 0\nsymbol = null\nsecType = null\nexpiry = null\nstrike = 0.0\nright = null\ncontractExchange = null\ncurrency = null\nlocalSymbol = null\nexecId = null\ntime = null\nacctNumber = null\nexecutionExchange = null\nside = null\nshares = 0\nprice = 0.0\npermId = 0\nliquidation = 0\ncumQty = 0\navgPrice = 0.0\n ---- Execution Details end ----\n", string0);
  }

  /**
  //Test case number: 21
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      UnderComp underComp0 = new UnderComp();
      String string0 = EWrapperMsgGenerator.deltaNeutralValidation(2144802644, underComp0);
      assertEquals("id = 2144802644 underComp.conId =0 underComp.delta =0.0 underComp.price =0.0", string0);
  }

  /**
  //Test case number: 22
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Contract contract0 = new Contract();
      String string0 = EWrapperMsgGenerator.contractMsg(contract0);
      assertEquals("conid = 0\nsymbol = null\nsecType = null\nexpiry = null\nstrike = 0.0\nright = null\nmultiplier = null\nexchange = null\nprimaryExch = null\ncurrency = null\nlocalSymbol = null\n", string0);
  }

  /**
  //Test case number: 23
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      ContractDetails contractDetails0 = new ContractDetails();
      String string0 = EWrapperMsgGenerator.bondContractDetails(13, contractDetails0);
      assertEquals("reqId = 13 ===================================\n ---- Bond Contract Details begin ----\nsymbol = null\nsecType = null\ncusip = null\ncoupon = 0.0\nmaturity = null\nissueDate = null\nratings = null\nbondType = null\ncouponType = null\nconvertible = false\ncallable = false\nputable = false\ndescAppend = null\nexchange = null\ncurrency = null\nmarketName = null\ntradingClass = null\nconid = 0\nminTick = 0.0\norderTypes = null\nvalidExchanges = null\nnextOptionDate = null\nnextOptionType = null\nnextOptionPartial = false\nnotes = null\nlongName = null\n ---- Bond Contract Details End ----\n", string0);
  }

  /**
  //Test case number: 24
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      Vector<String> vector0 = new Vector<String>();
      Contract contract0 = new Contract(2146526235, "FA:", ";", "FA:", 2146526235, "FA:", ";", ";", ";", ";", vector0, ";", true, "FA:", ";");
      Order order0 = new Order();
      vector0.insertElementAt("BA", 0);
      OrderState orderState0 = new OrderState();
      order0.m_algoParams = contract0.m_comboLegs;
      order0.m_algoStrategy = ";";
      // Undeclared exception!
      try { 
        EWrapperMsgGenerator.openOrder(0, contract0, order0, orderState0);
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
      Vector<String> vector0 = new Vector<String>();
      Contract contract0 = new Contract(2146526235, "FA:", ";", "FA:", 2146526235, "FA:", ";", ";", ";", ";", vector0, ";", true, "FA:", ";");
      Order order0 = new Order();
      vector0.insertElementAt((String) null, 0);
      OrderState orderState0 = new OrderState();
      order0.m_algoParams = contract0.m_comboLegs;
      order0.m_algoStrategy = ";";
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
      Vector<String> vector0 = new Vector<String>();
      Contract contract0 = new Contract(2146526235, "FA:", ";", "FA:", 2146526235, "FA:", ";", ";", ";", ";", vector0, ";", false, "FA:", ";");
      Order order0 = new Order();
      OrderState orderState0 = new OrderState();
      order0.m_algoParams = contract0.m_comboLegs;
      order0.m_algoStrategy = ";";
      String string0 = EWrapperMsgGenerator.openOrder(0, contract0, order0, orderState0);
      assertNotNull(string0);
  }

  /**
  //Test case number: 28
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      Vector<String> vector0 = new Vector<String>();
      Contract contract0 = new Contract(508, "Error - ", "FA:", "FA:", 508, "Error - ", "FA:", "FA:", "FA:", "FA:", vector0, "Error - ", false, "FA:", "FA:");
      Order order0 = new Order();
      order0.m_algoStrategy = "FA:";
      // Undeclared exception!
      try { 
        EWrapperMsgGenerator.openOrder(508, contract0, order0, (OrderState) null);
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
      Vector<String> vector0 = new Vector<String>();
      Contract contract0 = new Contract(525, "  It does not support what-if orders.", "FA:", "FA:", 525, "  It does not support what-if orders.", "FA:", "FA:", "FA:", "FA:", vector0, "  It does not support what-if orders.", false, "FA:", "FA:");
      UnderComp underComp0 = new UnderComp();
      contract0.m_underComp = underComp0;
      Order order0 = new Order();
      // Undeclared exception!
      try { 
        EWrapperMsgGenerator.openOrder(525, contract0, order0, (OrderState) null);
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
      Vector<Object> vector0 = new Vector<Object>();
      Contract contract0 = new Contract((-2154), "BAG", "BAG", "BAG", (-2154), "BAG", "BAG", "BAG", "BAG", "BAG", vector0, "BAG", true, "BAG", "BAG");
      OrderState orderState0 = new OrderState();
      Order order0 = new Order();
      order0.m_basisPoints = 1.0;
      String string0 = EWrapperMsgGenerator.openOrder((-2154), contract0, order0, orderState0);
      assertNotNull(string0);
  }

  /**
  //Test case number: 31
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      Vector<Object> vector0 = new Vector<Object>();
      Contract contract0 = new Contract((-2172), "BAG", "BAG", "BAG", (-2172), "BAG", "BAG", "BAG", "BAG", "BAG", vector0, "BAG", true, "BAG", "BAG");
      contract0.m_comboLegsDescrip = "BAG";
      OrderState orderState0 = new OrderState();
      Order order0 = new Order();
      String string0 = EWrapperMsgGenerator.openOrder((-2172), contract0, order0, orderState0);
      assertNotNull(string0);
  }

  /**
  //Test case number: 32
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.tickOptionComputation(13, 13, 13, 13, 13, (-2950.1));
      assertEquals("id=13  modelOptComp: vol = 13.0 delta = N/A: modelPrice = 13.0: pvDividend = N/A", string0);
  }

  /**
  //Test case number: 33
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.tickOptionComputation(13, 13, 13, 13, 1.7976931348623157E308, 1.7976931348623157E308);
      assertEquals("id=13  modelOptComp: vol = 13.0 delta = N/A: modelPrice = N/A: pvDividend = N/A", string0);
  }

  /**
  //Test case number: 34
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.tickOptionComputation(13, 13, 13, 13, (-1.95911143E8), 13);
      assertEquals("id=13  modelOptComp: vol = 13.0 delta = N/A: modelPrice = N/A: pvDividend = 13.0", string0);
  }

  /**
  //Test case number: 35
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.tickOptionComputation(1, Integer.MAX_VALUE, 1.7976931348623157E308, Integer.MAX_VALUE, 1.7976931348623157E308, 0);
      assertEquals("id=1  unknown: vol = N/A delta = N/A", string0);
  }

  /**
  //Test case number: 36
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.tickOptionComputation(0, 13, 0, 0, 13, 0);
      assertEquals("id=0  modelOptComp: vol = 0.0 delta = 0.0: modelPrice = 13.0: pvDividend = 0.0", string0);
  }

  /**
  //Test case number: 37
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.tickOptionComputation((-2083), (-2083), (-2083), (-2083), (-2083), (-2083));
      assertEquals("id=-2083  unknown: vol = N/A delta = N/A", string0);
  }

  /**
  //Test case number: 38
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.tickPrice(2146336228, 2146336228, 2146336228, (-1));
      assertEquals("id=2146336228  unknown=2.146336228E9  canAutoExecute", string0);
  }

  /**
  //Test case number: 39
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.tickPrice(0, Integer.MAX_VALUE, 3, 0);
      assertEquals("id=0  unknown=3.0  noAutoExecute", string0);
  }

  /**
  //Test case number: 40
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.updateMktDepth('?', 3, 'y', 0, 0, 1);
      assertEquals("updateMktDepth: 63 3 121 0 0.0 1", string0);
  }

  /**
  //Test case number: 41
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.tickString(Integer.MAX_VALUE, 0, (String) null);
      assertEquals("id=2147483647  bidSize=null", string0);
  }

  /**
  //Test case number: 42
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      // Undeclared exception!
      try { 
        EWrapperMsgGenerator.deltaNeutralValidation(1391, (UnderComp) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.ib.client.EWrapperMsgGenerator", e);
      }
  }

  /**
  //Test case number: 43
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.updateNewsBulletin(9, Integer.MAX_VALUE, "", "O");
      assertEquals("MsgId=9 :: MsgType=2147483647 :: Origin=O :: Message=", string0);
  }

  /**
  //Test case number: 44
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
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
  //Test case number: 45
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      ContractDetails contractDetails0 = new ContractDetails();
      String string0 = EWrapperMsgGenerator.contractDetails(0, contractDetails0);
      assertEquals("reqId = 0 ===================================\n ---- Contract Details begin ----\nconid = 0\nsymbol = null\nsecType = null\nexpiry = null\nstrike = 0.0\nright = null\nmultiplier = null\nexchange = null\nprimaryExch = null\ncurrency = null\nlocalSymbol = null\nmarketName = null\ntradingClass = null\nminTick = 0.0\nprice magnifier = 0\norderTypes = null\nvalidExchanges = null\nunderConId = 0\nlongName = null\ncontractMonth = null\nindustry = null\ncategory = null\nsubcategory = null\ntimeZoneId = null\ntradingHours = null\nliquidHours = null\n ---- Contract Details End ----\n", string0);
  }

  /**
  //Test case number: 46
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      // Undeclared exception!
      try { 
        EWrapperMsgGenerator.updatePortfolio((Contract) null, 1, 610.258397, 610.258397, 1, 1, (-4020.722), "COrkKvTH");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.ib.client.EWrapperMsgGenerator", e);
      }
  }

  /**
  //Test case number: 47
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.updateAccountValue(" type=", (String) null, (String) null, (String) null);
      assertEquals("updateAccountValue:  type= null null null", string0);
  }

  /**
  //Test case number: 48
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.receiveFA(Integer.MAX_VALUE, (String) null);
      assertEquals("FA: null null", string0);
  }

  /**
  //Test case number: 49
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.contractDetailsEnd((-2130615111));
      assertEquals("reqId = -2130615111 =============== end ===============", string0);
  }

  /**
  //Test case number: 50
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.tickSnapshotEnd(13);
      assertEquals("id=13 =============== end ===============", string0);
  }

  /**
  //Test case number: 51
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.orderStatus(1, (String) null, 3, Integer.MAX_VALUE, 0.0, 0, 'c', 3, 0, (String) null);
      assertEquals("order status: orderId=1 clientId=0 permId=0 status=null filled=3 remaining=2147483647 avgFillPrice=0.0 lastFillPrice=3.0 parent Id=99 whyHeld=null", string0);
  }

  /**
  //Test case number: 52
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.scannerDataEnd((-1910));
      assertEquals("id = -1910 =============== end ===============", string0);
  }

  /**
  //Test case number: 53
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.tickGeneric(Integer.MAX_VALUE, 0, Integer.MAX_VALUE);
      assertEquals("id=2147483647  bidSize=2.147483647E9", string0);
  }

  /**
  //Test case number: 54
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.managedAccounts("W)OxL]w{7kQr8");
      assertEquals("Connected : The list of managed accounts are : [W)OxL]w{7kQr8]", string0);
  }

  /**
  //Test case number: 55
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      EWrapperMsgGenerator eWrapperMsgGenerator0 = new EWrapperMsgGenerator();
      assertEquals("Connection Closed", eWrapperMsgGenerator0.connectionClosed());
  }

  /**
  //Test case number: 56
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test56()  throws Throwable  {
      ContractDetails contractDetails0 = new ContractDetails((Contract) null, "RI", (String) null, 1700, "HV[=t+kx2g^Z3bot<.", "HV[=t+kx2g^Z3bot<.", 1700, "HV[=t+kx2g^Z3bot<.", "RI", "RI", "RI", "RI", (String) null, (String) null, "RI");
      // Undeclared exception!
      try { 
        EWrapperMsgGenerator.contractDetails(1700, contractDetails0);
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
      String string0 = EWrapperMsgGenerator.accountDownloadEnd("b>2p<R-\".-9/zf");
      assertEquals("accountDownloadEnd: b>2p<R-\".-9/zf", string0);
  }

  /**
  //Test case number: 58
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test58()  throws Throwable  {
      // Undeclared exception!
      try { 
        EWrapperMsgGenerator.bondContractDetails(1327, (ContractDetails) null);
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
      // Undeclared exception!
      try { 
        EWrapperMsgGenerator.scannerData((-1965), 19, (ContractDetails) null, " whyHeld=", " whyHeld=", " whyHeld=", "yt8ofe");
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
      String string0 = EWrapperMsgGenerator.realtimeBar((-2146609976), (-2146609976), 92.334482, 92.334482, (-2146609976), 92.334482, (-2146609976), (-1.0), (-2146609976));
      assertEquals("id=-2146609976 time = -2146609976 open=92.334482 high=92.334482 low=-2.146609976E9 close=92.334482 volume=-2146609976 count=-2146609976 WAP=-1.0", string0);
  }

  /**
  //Test case number: 61
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test61()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.nextValidId((-2101855903));
      assertEquals("Next Valid Order ID: -2101855903", string0);
  }

  /**
  //Test case number: 62
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test62()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.execDetailsEnd(13);
      assertEquals("reqId = 13 =============== end ===============", string0);
  }

  /**
  //Test case number: 63
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test63()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.currentTime(13);
      assertEquals("current time = 13 (Jan 1, 1970 12:00:13 AM)", string0);
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
      String string0 = EWrapperMsgGenerator.tickEFP('f', 13, 'n', "O", 2, 0, (String) null, 1.7976931348623157E308, 0);
      assertEquals("id=102  modelOptComp: basisPoints = 110.0/O impliedFuture = 2.0 holdDays = 0 futureExpiry = null dividendImpact = 1.7976931348623157E308 dividends to expiry = 0.0", string0);
  }

  /**
  //Test case number: 66
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test66()  throws Throwable  {
      Execution execution0 = new Execution();
      // Undeclared exception!
      try { 
        EWrapperMsgGenerator.execDetails((-948), (Contract) null, execution0);
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
      String string0 = EWrapperMsgGenerator.tickSize('y', 'f', 0);
      assertEquals("id=121  unknown=0", string0);
  }

  /**
  //Test case number: 68
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test68()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.scannerParameters("BAG");
      assertEquals("SCANNER PARAMETERS:\nBAG", string0);
  }

  /**
  //Test case number: 69
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test69()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.historicalData('?', "", Integer.MAX_VALUE, 0, 1.7976931348623157E308, Integer.MAX_VALUE, 'n', 0, 0, false);
      assertEquals("id=63 date =  open=2.147483647E9 high=0.0 low=1.7976931348623157E308 close=2.147483647E9 volume=110 count=0 WAP=0.0 hasGaps=false", string0);
  }

  /**
  //Test case number: 70
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test70()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.updateAccountTime("_9dwYr 4}:](U\\O}");
      assertEquals("updateAccountTime: _9dwYr 4}:](U\\O}", string0);
  }
}
