/*
 * This file was automatically generated by EvoSuite
 * Thu Dec 05 09:58:51 GMT 2019
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
  /*Coverage entropy=0.8505612088663046
  */
  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Order order0 = new Order();
      order0.m_basisPoints = 0.0;
      Contract contract0 = new Contract('b', (String) null, "BAG", (String) null, 1, (String) null, (String) null, (String) null, (String) null, (String) null, (Vector) null, "", false, "", (String) null);
      OrderState orderState0 = new OrderState((String) null, (String) null, (String) null, (String) null, 0.0, '?', 0, (String) null, (String) null);
      EWrapperMsgGenerator.openOrder(0, contract0, order0, orderState0);
      String string0 = EWrapperMsgGenerator.receiveFA(2240, "Uy2)Ss-0y9S&YQ");
      assertEquals("FA: null Uy2)Ss-0y9S&YQ", string0);
  }

  /**
  //Test case number: 1
  /*Coverage entropy=0.3333333333333333
  */
  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Order order0 = new Order();
      order0.m_stockRangeLower = (-1438.8649743091505);
      Contract contract0 = new Contract('b', (String) null, "BAG", (String) null, 1, (String) null, (String) null, (String) null, (String) null, (String) null, (Vector) null, "", false, "", (String) null);
      contract0.m_comboLegsDescrip = "W|H_?q_";
      OrderState orderState0 = new OrderState();
      String string0 = EWrapperMsgGenerator.openOrder(0, contract0, order0, orderState0);
      assertNotNull(string0);
  }

  /**
  //Test case number: 2
  /*Coverage entropy=0.42857142857142855
  */
  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Order order0 = new Order();
      String string0 = EWrapperMsgGenerator.tickOptionComputation(Integer.MAX_VALUE, 0, 0, 1165.6536312945084, 1897.992153341, 0);
      assertEquals("id=2147483647  bidSize: vol = 0.0 delta = N/A", string0);
      
      OrderState orderState0 = new OrderState();
      order0.m_algoStrategy = "id=2147483647  bidSize: vol = 0.0 delta = N/A";
      Vector<Object> vector0 = new Vector<Object>();
      order0.m_algoParams = vector0;
      TagValue tagValue0 = new TagValue();
      vector0.add((Object) tagValue0);
      Vector<Object> vector1 = new Vector<Object>();
      TagValue tagValue1 = new TagValue();
      TagValue tagValue2 = new TagValue("com.ib.client.TagValue", "O");
      vector0.add((Object) tagValue2);
      Contract contract0 = new Contract((-263), "Vq", "notes = ", (String) null, 0, "@F+K@mf>K ", "O$,B3~r.%+M+/W", "O", "AA2$ UU^0j", "markPrice", order0.m_algoParams, "id=2147483647  bidSize: vol = 0.0 delta = N/A", true, "c2z{u&$R[d{lR", (String) null);
      Contract contract1 = new Contract();
      EWrapperMsgGenerator.openOrder((-1478), contract1, order0, orderState0);
      String string1 = EWrapperMsgGenerator.accountDownloadEnd("r'I(9S6b");
      assertEquals("accountDownloadEnd: r'I(9S6b", string1);
  }

  /**
  //Test case number: 3
  /*Coverage entropy=1.0730116670092564
  */
  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Order order0 = new Order();
      EWrapperMsgGenerator.tickOptionComputation(Integer.MAX_VALUE, Integer.MAX_VALUE, 0, 1.7976931348623157E308, 1897.992153341, 0);
      OrderState orderState0 = new OrderState();
      order0.m_algoStrategy = "id=2147483647  unknown: vol = 0.0 delta = N/A";
      Vector<Object> vector0 = new Vector<Object>();
      order0.m_algoParams = vector0;
      TagValue tagValue0 = new TagValue();
      Integer integer0 = new Integer(Integer.MAX_VALUE);
      vector0.add((Object) integer0);
      vector0.add((Object) tagValue0);
      Contract contract0 = new Contract(2145877091, "p\"UuowUP_).J", "n\"NSc)JKg*@D`S-2Ds", "_UH\"", 0, "", (String) null, (String) null, "OptionPutOpenIntrest", "OptionPutOpenIntrest", order0.m_algoParams, "", false, (String) null, (String) null);
      // Undeclared exception!
      try { 
        EWrapperMsgGenerator.openOrder(1431655765, contract0, order0, orderState0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // java.lang.Integer cannot be cast to com.ib.client.TagValue
         //
         verifyException("com.ib.client.EWrapperMsgGenerator", e);
      }
  }

  /**
  //Test case number: 4
  /*Coverage entropy=0.3333333333333333
  */
  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Order order0 = new Order();
      Contract contract0 = new Contract('b', (String) null, "BAG", (String) null, 1, (String) null, (String) null, (String) null, (String) null, (String) null, (Vector) null, "", false, "", (String) null);
      OrderState orderState0 = new OrderState();
      String string0 = EWrapperMsgGenerator.openOrder(0, contract0, order0, orderState0);
      assertNotNull(string0);
  }

  /**
  //Test case number: 5
  /*Coverage entropy=1.1375916250043898
  */
  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Order order0 = new Order();
      String string0 = EWrapperMsgGenerator.tickOptionComputation(Integer.MAX_VALUE, Integer.MAX_VALUE, 0, 1.7976931348623157E308, 1897.992153341, 0);
      assertEquals("id=2147483647  unknown: vol = 0.0 delta = N/A", string0);
      
      OrderState orderState0 = new OrderState();
      order0.m_algoStrategy = "id=2147483647  unknown: vol = 0.0 delta = N/A";
      Vector<Object> vector0 = new Vector<Object>();
      order0.m_algoParams = vector0;
      TagValue tagValue0 = new TagValue();
      vector0.add((Object) tagValue0);
      Contract contract0 = new Contract('f', "p\"UuowUP_).J", "n\"NSc)JKg*@D`S-2Ds", "_UH\"", 0, (String) null, (String) null, (String) null, (String) null, (String) null, order0.m_algoParams, (String) null, false, (String) null, (String) null);
      EWrapperMsgGenerator.openOrder(1431655765, contract0, order0, orderState0);
      String string1 = EWrapperMsgGenerator.execDetailsEnd(Integer.MAX_VALUE);
      assertEquals("reqId = 2147483647 =============== end ===============", string1);
      
      String string2 = EWrapperMsgGenerator.openOrderEnd();
      assertEquals(" =============== end ===============", string2);
  }

  /**
  //Test case number: 6
  /*Coverage entropy=1.1375916250043898
  */
  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Order order0 = new Order();
      String string0 = EWrapperMsgGenerator.tickOptionComputation(Integer.MAX_VALUE, 0, 0, 1165.6536312945084, 1897.992153341, 0);
      assertEquals("id=2147483647  bidSize: vol = 0.0 delta = N/A", string0);
      
      OrderState orderState0 = new OrderState();
      order0.m_algoStrategy = "id=2147483647  bidSize: vol = 0.0 delta = N/A";
      Vector<Object> vector0 = new Vector<Object>();
      order0.m_algoParams = vector0;
      Contract contract0 = new Contract();
      EWrapperMsgGenerator.openOrder(2, contract0, order0, orderState0);
      String string1 = EWrapperMsgGenerator.scannerParameters("");
      assertEquals("SCANNER PARAMETERS:\n", string1);
      
      String string2 = EWrapperMsgGenerator.tickGeneric(Integer.MAX_VALUE, 1, 1);
      assertEquals("id=2147483647  bidPrice=1.0", string2);
  }

  /**
  //Test case number: 7
  /*Coverage entropy=0.3333333333333333
  */
  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Order order0 = new Order();
      Contract contract0 = new Contract();
      order0.m_algoStrategy = "Error - ";
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
  //Test case number: 8
  /*Coverage entropy=0.3333333333333333
  */
  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
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
  //Test case number: 9
  /*Coverage entropy=0.3333333333333333
  */
  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Order order0 = new Order();
      order0.m_firmQuoteOnly = false;
      Contract contract0 = new Contract('b', (String) null, "BAG", (String) null, 1, (String) null, (String) null, (String) null, (String) null, (String) null, (Vector) null, "", false, "", (String) null);
      UnderComp underComp0 = new UnderComp();
      contract0.m_underComp = underComp0;
      OrderState orderState0 = new OrderState();
      String string0 = EWrapperMsgGenerator.openOrder(2, contract0, order0, orderState0);
      assertNotNull(string0);
  }

  /**
  //Test case number: 10
  /*Coverage entropy=0.3333333333333333
  */
  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Order order0 = new Order();
      String string0 = EWrapperMsgGenerator.tickOptionComputation(0, 13, 1.7976931348623157E308, Integer.MAX_VALUE, 1.7976931348623157E308, 1.7976931348623157E308);
      assertEquals("id=0  modelOptComp: vol = N/A delta = N/A: modelPrice = N/A: pvDividend = N/A", string0);
  }

  /**
  //Test case number: 11
  /*Coverage entropy=0.3333333333333333
  */
  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Order order0 = new Order();
      String string0 = EWrapperMsgGenerator.tickOptionComputation(0, 13, 0, 0, (-363.437188462), (-2103.9));
      assertEquals("id=0  modelOptComp: vol = 0.0 delta = 0.0: modelPrice = N/A: pvDividend = N/A", string0);
  }

  /**
  //Test case number: 12
  /*Coverage entropy=0.3333333333333333
  */
  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.SCANNER_PARAMETERS;
      String string1 = EWrapperMsgGenerator.tickOptionComputation((-1380), 13, 13, 543.823394782, 13, (-1380));
      assertEquals("id=-1380  modelOptComp: vol = 13.0 delta = N/A: modelPrice = 13.0: pvDividend = N/A", string1);
  }

  /**
  //Test case number: 13
  /*Coverage entropy=0.3333333333333333
  */
  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      // Undeclared exception!
      try { 
        EWrapperMsgGenerator.bondContractDetails(1158, (ContractDetails) null);
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
      String string0 = EWrapperMsgGenerator.tickOptionComputation(Integer.MAX_VALUE, 13, 1.7976931348623157E308, Integer.MAX_VALUE, 0, 1.7976931348623157E308);
      assertEquals("id=2147483647  modelOptComp: vol = N/A delta = N/A: modelPrice = 0.0: pvDividend = N/A", string0);
  }

  /**
  //Test case number: 15
  /*Coverage entropy=0.3333333333333333
  */
  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Order order0 = new Order();
      String string0 = EWrapperMsgGenerator.tickOptionComputation(0, 13, 13, Integer.MAX_VALUE, 1.7976931348623157E308, 0);
      assertEquals("id=0  modelOptComp: vol = 13.0 delta = N/A: modelPrice = N/A: pvDividend = 0.0", string0);
  }

  /**
  //Test case number: 16
  /*Coverage entropy=0.3333333333333333
  */
  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Order order0 = new Order();
      String string0 = EWrapperMsgGenerator.tickOptionComputation(0, 13, Integer.MAX_VALUE, 'n', 2, 1.7976931348623157E308);
      assertEquals("id=0  modelOptComp: vol = 2.147483647E9 delta = N/A: modelPrice = 2.0: pvDividend = N/A", string0);
  }

  /**
  //Test case number: 17
  /*Coverage entropy=0.3333333333333333
  */
  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      // Undeclared exception!
      try { 
        EWrapperMsgGenerator.contractDetails((-70), (ContractDetails) null);
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
      Order order0 = new Order();
      String string0 = EWrapperMsgGenerator.tickOptionComputation(0, 0, 0, 0, 0, 0);
      assertEquals("id=0  bidSize: vol = 0.0 delta = 0.0", string0);
  }

  /**
  //Test case number: 19
  /*Coverage entropy=1.0931471805599453
  */
  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Order order0 = new Order();
      // Undeclared exception!
      try { 
        EWrapperMsgGenerator.updatePortfolio((Contract) null, 13, 5.3872, 0, (-556.62523), 5.3872, 0, (String) null);
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
  /*Coverage entropy=0.3333333333333333
  */
  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      // Undeclared exception!
      try { 
        EWrapperMsgGenerator.scannerData(1, 3169, (ContractDetails) null, "-#qQ", "-#qQ", "y-g7>/i7k<U", "y-g7>/i7k<U");
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
  /*Coverage entropy=0.3333333333333333
  */
  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Contract contract0 = new Contract();
      Order order0 = new Order();
      OrderState orderState0 = new OrderState();
      String string0 = EWrapperMsgGenerator.openOrder(2, contract0, order0, orderState0);
      assertNotNull(string0);
  }

  /**
  //Test case number: 22
  /*Coverage entropy=0.3333333333333333
  */
  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Order order0 = new Order();
      String string0 = EWrapperMsgGenerator.tickOptionComputation(Integer.MAX_VALUE, Integer.MAX_VALUE, 1.7976931348623157E308, 1, 0, Integer.MAX_VALUE);
      assertEquals("id=2147483647  unknown: vol = N/A delta = 1.0", string0);
  }

  /**
  //Test case number: 23
  /*Coverage entropy=0.3333333333333333
  */
  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      Execution execution0 = new Execution();
      // Undeclared exception!
      try { 
        EWrapperMsgGenerator.execDetails(2146776696, (Contract) null, execution0);
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
  /*Coverage entropy=0.3333333333333333
  */
  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      Order order0 = new Order();
      String string0 = EWrapperMsgGenerator.tickSize(0, 'n', 'm');
      assertEquals("id=0  unknown=109", string0);
  }

  /**
  //Test case number: 25
  /*Coverage entropy=0.3333333333333333
  */
  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      Contract contract0 = new Contract();
      Execution execution0 = new Execution();
      String string0 = EWrapperMsgGenerator.execDetails((-3226), contract0, execution0);
      assertEquals(" ---- Execution Details begin ----\nreqId = -3226\norderId = 0\nclientId = 0\nsymbol = null\nsecType = null\nexpiry = null\nstrike = 0.0\nright = null\ncontractExchange = null\ncurrency = null\nlocalSymbol = null\nexecId = null\ntime = null\nacctNumber = null\nexecutionExchange = null\nside = null\nshares = 0\nprice = 0.0\npermId = 0\nliquidation = 0\ncumQty = 0\navgPrice = 0.0\n ---- Execution Details end ----\n", string0);
  }

  /**
  //Test case number: 26
  /*Coverage entropy=0.3333333333333333
  */
  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      Order order0 = new Order();
      String string0 = EWrapperMsgGenerator.tickEFP(0, 'm', 0, (String) null, 0, 0, (String) null, 0, 1.7976931348623157E308);
      assertEquals("id=0  unknown: basisPoints = 0.0/null impliedFuture = 0.0 holdDays = 0 futureExpiry = null dividendImpact = 0.0 dividends to expiry = 1.7976931348623157E308", string0);
  }

  /**
  //Test case number: 27
  /*Coverage entropy=0.3333333333333333
  */
  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      ContractDetails contractDetails0 = new ContractDetails();
      String string0 = EWrapperMsgGenerator.scannerData(13, 13, contractDetails0, "!P7eGn(hh%#3", (String) null, (String) null, "OptionAskExchStr");
      assertEquals("id = 13 rank=13 symbol=null secType=null expiry=null strike=0.0 right=null exchange=null currency=null localSymbol=null marketName=null tradingClass=null distance=!P7eGn(hh%#3 benchmark=null projection=null legsStr=OptionAskExchStr", string0);
  }

  /**
  //Test case number: 28
  /*Coverage entropy=0.3333333333333333
  */
  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      ContractDetails contractDetails0 = new ContractDetails();
      String string0 = EWrapperMsgGenerator.scannerData(0, 0, contractDetails0, (String) null, "`-UDC@9\"sUy1", (String) null, (String) null);
      assertNotNull(string0);
  }

  /**
  //Test case number: 29
  /*Coverage entropy=0.3333333333333333
  */
  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      ContractDetails contractDetails0 = new ContractDetails();
      String string0 = EWrapperMsgGenerator.scannerData(924, 924, contractDetails0, (String) null, (String) null, "#c^7SCo3<>Ex,n", (String) null);
      assertEquals("id = 924 rank=924 symbol=null secType=null expiry=null strike=0.0 right=null exchange=null currency=null localSymbol=null marketName=null tradingClass=null distance=null benchmark=null projection=#c^7SCo3<>Ex,n legsStr=null", string0);
  }

  /**
  //Test case number: 30
  /*Coverage entropy=0.3333333333333333
  */
  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      ContractDetails contractDetails0 = new ContractDetails();
      String string0 = EWrapperMsgGenerator.scannerData(30, (-1773), contractDetails0, (String) null, (String) null, (String) null, (String) null);
      assertEquals("id = 30 rank=-1773 symbol=null secType=null expiry=null strike=0.0 right=null exchange=null currency=null localSymbol=null marketName=null tradingClass=null distance=null benchmark=null projection=null legsStr=null", string0);
  }

  /**
  //Test case number: 31
  /*Coverage entropy=0.3333333333333333
  */
  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.currentTime(1L);
      assertEquals("current time = 1 (Jan 1, 1970 12:00:01 AM)", string0);
  }

  /**
  //Test case number: 32
  /*Coverage entropy=0.3333333333333333
  */
  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      Order order0 = new Order();
      String string0 = EWrapperMsgGenerator.updateMktDepthL2('f', 0, (String) null, 'm', 0, 0.0, Integer.MAX_VALUE);
      assertEquals("updateMktDepth: 102 0 null 109 0 0.0 2147483647", string0);
  }

  /**
  //Test case number: 33
  /*Coverage entropy=0.3333333333333333
  */
  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      Order order0 = new Order();
      String string0 = EWrapperMsgGenerator.updateNewsBulletin(Integer.MAX_VALUE, 0, (String) null, "O");
      assertEquals("MsgId=2147483647 :: MsgType=0 :: Origin=O :: Message=null", string0);
  }

  /**
  //Test case number: 34
  /*Coverage entropy=0.3333333333333333
  */
  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.contractDetailsEnd(0);
      assertEquals("reqId = 0 =============== end ===============", string0);
  }

  /**
  //Test case number: 35
  /*Coverage entropy=1.0931471805599453
  */
  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      Contract contract0 = new Contract();
      Contract contract1 = new Contract();
      Order order0 = new Order();
      OrderState orderState0 = new OrderState();
      String string0 = EWrapperMsgGenerator.updatePortfolio(contract0, 0, 'c', 1.7976931348623157E308, 2, 'b', 0.0, (String) null);
      assertEquals("updatePortfolio: conid = 0\nsymbol = null\nsecType = null\nexpiry = null\nstrike = 0.0\nright = null\nmultiplier = null\nexchange = null\nprimaryExch = null\ncurrency = null\nlocalSymbol = null\n0 99.0 1.7976931348623157E308 2.0 98.0 0.0 null", string0);
      assertNotNull(string0);
  }

  /**
  //Test case number: 36
  /*Coverage entropy=0.3333333333333333
  */
  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      Order order0 = new Order();
      String string0 = EWrapperMsgGenerator.tickString(Integer.MAX_VALUE, 0, (String) null);
      assertEquals("id=2147483647  bidSize=null", string0);
  }

  /**
  //Test case number: 37
  /*Coverage entropy=0.3333333333333333
  */
  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      Order order0 = new Order();
      String string0 = EWrapperMsgGenerator.managedAccounts((String) null);
      assertEquals("Connected : The list of managed accounts are : [null]", string0);
  }

  /**
  //Test case number: 38
  /*Coverage entropy=1.0931471805599453
  */
  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      EWrapperMsgGenerator eWrapperMsgGenerator0 = new EWrapperMsgGenerator();
      String string0 = EWrapperMsgGenerator.tickSnapshotEnd((-3126));
      assertEquals("id=-3126 =============== end ===============", string0);
  }

  /**
  //Test case number: 39
  /*Coverage entropy=0.3333333333333333
  */
  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      // Undeclared exception!
      try { 
        EWrapperMsgGenerator.deltaNeutralValidation(43, (UnderComp) null);
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
  /*Coverage entropy=0.3333333333333333
  */
  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.realtimeBar((-173), 2316L, (-173), 1.7976931348623157E308, (-173), 1.7976931348623157E308, (-173), 2316L, 2952);
      assertEquals("id=-173 time = 2316 open=-173.0 high=1.7976931348623157E308 low=-173.0 close=1.7976931348623157E308 volume=-173 count=2952 WAP=2316.0", string0);
  }

  /**
  //Test case number: 41
  /*Coverage entropy=0.3333333333333333
  */
  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      Order order0 = new Order();
      String string0 = EWrapperMsgGenerator.tickOptionComputation(0, 1, 2, 0, 0.0, 0);
      assertEquals("id=0  bidPrice: vol = 2.0 delta = 0.0", string0);
  }

  /**
  //Test case number: 42
  /*Coverage entropy=0.3333333333333333
  */
  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      Order order0 = new Order();
      String string0 = EWrapperMsgGenerator.tickOptionComputation(0, Integer.MAX_VALUE, (-991.261), 0, Integer.MAX_VALUE, Integer.MAX_VALUE);
      assertEquals("id=0  unknown: vol = N/A delta = 0.0", string0);
  }

  /**
  //Test case number: 43
  /*Coverage entropy=0.3333333333333333
  */
  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.realtimeBar(41, 41, 41, 41, 0.0, 0.0, 41, 41, 41);
      assertEquals("id=41 time = 41 open=41.0 high=41.0 low=0.0 close=0.0 volume=41 count=41 WAP=41.0", string0);
  }

  /**
  //Test case number: 44
  /*Coverage entropy=0.3333333333333333
  */
  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      Order order0 = new Order();
      String string0 = EWrapperMsgGenerator.tickOptionComputation(0, 0, 1.7976931348623157E308, Integer.MAX_VALUE, 0, 0.0);
      assertEquals("id=0  bidSize: vol = N/A delta = N/A", string0);
  }

  /**
  //Test case number: 45
  /*Coverage entropy=0.3333333333333333
  */
  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      Order order0 = new Order();
      String string0 = EWrapperMsgGenerator.fundamentalData(Integer.MAX_VALUE, "O");
      assertEquals("id  = 2147483647 len = 1\nO", string0);
  }

  /**
  //Test case number: 46
  /*Coverage entropy=0.3333333333333333
  */
  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      Order order0 = new Order();
      String string0 = EWrapperMsgGenerator.updateAccountValue((String) null, (String) null, "O", (String) null);
      assertEquals("updateAccountValue: null null O null", string0);
  }

  /**
  //Test case number: 47
  /*Coverage entropy=0.3333333333333333
  */
  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      Order order0 = new Order();
      String string0 = EWrapperMsgGenerator.updateAccountValue("", (String) null, (String) null, (String) null);
      assertEquals("updateAccountValue:  null null null", string0);
  }

  /**
  //Test case number: 48
  /*Coverage entropy=0.3333333333333333
  */
  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      Order order0 = new Order();
      String string0 = EWrapperMsgGenerator.tickPrice(0, Integer.MAX_VALUE, 0, 0);
      assertEquals("id=0  unknown=0.0  noAutoExecute", string0);
  }

  /**
  //Test case number: 49
  /*Coverage entropy=0.3333333333333333
  */
  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      UnderComp underComp0 = new UnderComp();
      String string0 = EWrapperMsgGenerator.deltaNeutralValidation((-1614), underComp0);
      assertEquals("id = -1614 underComp.conId =0 underComp.delta =0.0 underComp.price =0.0", string0);
  }

  /**
  //Test case number: 50
  /*Coverage entropy=0.3333333333333333
  */
  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      Order order0 = new Order();
      // Undeclared exception!
      try { 
        EWrapperMsgGenerator.fundamentalData('b', (String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.ib.client.EWrapperMsgGenerator", e);
      }
  }

  /**
  //Test case number: 51
  /*Coverage entropy=0.3333333333333333
  */
  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      Order order0 = new Order();
      String string0 = EWrapperMsgGenerator.updateMktDepthL2(0, Integer.MAX_VALUE, (String) null, 'y', '?', 1, 0);
      assertEquals("updateMktDepth: 0 2147483647 null 121 63 1.0 0", string0);
  }

  /**
  //Test case number: 52
  /*Coverage entropy=0.3333333333333333
  */
  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      Contract contract0 = new Contract();
      String string0 = EWrapperMsgGenerator.contractMsg(contract0);
      assertEquals("conid = 0\nsymbol = null\nsecType = null\nexpiry = null\nstrike = 0.0\nright = null\nmultiplier = null\nexchange = null\nprimaryExch = null\ncurrency = null\nlocalSymbol = null\n", string0);
  }

  /**
  //Test case number: 53
  /*Coverage entropy=1.5271837172395382
  */
  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      ContractDetails contractDetails0 = new ContractDetails();
      String string0 = EWrapperMsgGenerator.contractDetails(1807, contractDetails0);
      assertEquals("reqId = 1807 ===================================\n ---- Contract Details begin ----\nconid = 0\nsymbol = null\nsecType = null\nexpiry = null\nstrike = 0.0\nright = null\nmultiplier = null\nexchange = null\nprimaryExch = null\ncurrency = null\nlocalSymbol = null\nmarketName = null\ntradingClass = null\nminTick = 0.0\nprice magnifier = 0\norderTypes = null\nvalidExchanges = null\nunderConId = 0\nlongName = null\ncontractMonth = null\nindustry = null\ncategory = null\nsubcategory = null\ntimeZoneId = null\ntradingHours = null\nliquidHours = null\n ---- Contract Details End ----\n", string0);
  }

  /**
  //Test case number: 54
  /*Coverage entropy=0.3333333333333333
  */
  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      Order order0 = new Order();
      String string0 = EWrapperMsgGenerator.updateAccountValue("", "", (String) null, (String) null);
      assertEquals("updateAccountValue:   null null", string0);
  }

  /**
  //Test case number: 55
  /*Coverage entropy=0.3333333333333333
  */
  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      Order order0 = new Order();
      String string0 = EWrapperMsgGenerator.historicalData('f', "O", 0, 'm', 1.7976931348623157E308, 0, 0, 'c', 0, false);
      assertEquals("id=102 date = O open=0.0 high=109.0 low=1.7976931348623157E308 close=0.0 volume=0 count=99 WAP=0.0 hasGaps=false", string0);
  }

  /**
  //Test case number: 56
  /*Coverage entropy=0.3333333333333333
  */
  @Test(timeout = 4000)
  public void test56()  throws Throwable  {
      Order order0 = new Order();
      String string0 = EWrapperMsgGenerator.tickPrice('c', 0, 2, Integer.MAX_VALUE);
      assertEquals("id=99  bidSize=2.0  canAutoExecute", string0);
  }

  /**
  //Test case number: 57
  /*Coverage entropy=0.3333333333333333
  */
  @Test(timeout = 4000)
  public void test57()  throws Throwable  {
      Order order0 = new Order();
      String string0 = EWrapperMsgGenerator.historicalData(0, (String) null, 3, 1.7976931348623157E308, 0.0, 'y', 0, 'y', Integer.MAX_VALUE, true);
      assertEquals("id=0 date = null open=3.0 high=1.7976931348623157E308 low=0.0 close=121.0 volume=0 count=121 WAP=2.147483647E9 hasGaps=true", string0);
  }

  /**
  //Test case number: 58
  /*Coverage entropy=0.3333333333333333
  */
  @Test(timeout = 4000)
  public void test58()  throws Throwable  {
      Order order0 = new Order();
      String string0 = EWrapperMsgGenerator.tickEFP(1, 'c', 1.7976931348623157E308, (String) null, 0, 0, "", 3, 0);
      assertEquals("id=1  unknown: basisPoints = 1.7976931348623157E308/null impliedFuture = 0.0 holdDays = 0 futureExpiry =  dividendImpact = 3.0 dividends to expiry = 0.0", string0);
  }

  /**
  //Test case number: 59
  /*Coverage entropy=0.3333333333333333
  */
  @Test(timeout = 4000)
  public void test59()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.tickPrice((-3279), (-3279), (-3279), (-3279));
      assertEquals("id=-3279  unknown=-3279.0  canAutoExecute", string0);
  }

  /**
  //Test case number: 60
  /*Coverage entropy=0.3333333333333333
  */
  @Test(timeout = 4000)
  public void test60()  throws Throwable  {
      Order order0 = new Order();
      String string0 = EWrapperMsgGenerator.updateMktDepth(0, 'c', 3, 'c', Integer.MAX_VALUE, 'b');
      assertEquals("updateMktDepth: 0 99 3 99 2.147483647E9 98", string0);
  }

  /**
  //Test case number: 61
  /*Coverage entropy=0.3333333333333333
  */
  @Test(timeout = 4000)
  public void test61()  throws Throwable  {
      Order order0 = new Order();
      String string0 = EWrapperMsgGenerator.orderStatus(0, (String) null, '?', 0, 1.7976931348623157E308, 0, 3, Integer.MAX_VALUE, 'y', (String) null);
      assertEquals("order status: orderId=0 clientId=121 permId=0 status=null filled=63 remaining=0 avgFillPrice=1.7976931348623157E308 lastFillPrice=2.147483647E9 parent Id=3 whyHeld=null", string0);
  }

  /**
  //Test case number: 62
  /*Coverage entropy=0.3333333333333333
  */
  @Test(timeout = 4000)
  public void test62()  throws Throwable  {
      Order order0 = new Order();
      String string0 = EWrapperMsgGenerator.orderStatus('m', "", 0, 0, 1.7976931348623157E308, 0, 0, 2, 1, (String) null);
      assertEquals("order status: orderId=109 clientId=1 permId=0 status= filled=0 remaining=0 avgFillPrice=1.7976931348623157E308 lastFillPrice=2.0 parent Id=0 whyHeld=null", string0);
  }

  /**
  //Test case number: 63
  /*Coverage entropy=0.3333333333333333
  */
  @Test(timeout = 4000)
  public void test63()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.scannerDataEnd((-1209));
      assertEquals("id = -1209 =============== end ===============", string0);
  }

  /**
  //Test case number: 64
  /*Coverage entropy=0.3333333333333333
  */
  @Test(timeout = 4000)
  public void test64()  throws Throwable  {
      Order order0 = new Order();
      String string0 = EWrapperMsgGenerator.updateMktDepth(0, 0, 3, 1, 0, 1);
      assertEquals("updateMktDepth: 0 0 3 1 0.0 1", string0);
  }

  /**
  //Test case number: 65
  /*Coverage entropy=0.3333333333333333
  */
  @Test(timeout = 4000)
  public void test65()  throws Throwable  {
      ContractDetails contractDetails0 = new ContractDetails();
      String string0 = EWrapperMsgGenerator.bondContractDetails((-699), contractDetails0);
      assertEquals("reqId = -699 ===================================\n ---- Bond Contract Details begin ----\nsymbol = null\nsecType = null\ncusip = null\ncoupon = 0.0\nmaturity = null\nissueDate = null\nratings = null\nbondType = null\ncouponType = null\nconvertible = false\ncallable = false\nputable = false\ndescAppend = null\nexchange = null\ncurrency = null\nmarketName = null\ntradingClass = null\nconid = 0\nminTick = 0.0\norderTypes = null\nvalidExchanges = null\nnextOptionDate = null\nnextOptionType = null\nnextOptionPartial = false\nnotes = null\nlongName = null\n ---- Bond Contract Details End ----\n", string0);
  }

  /**
  //Test case number: 66
  /*Coverage entropy=0.3333333333333333
  */
  @Test(timeout = 4000)
  public void test66()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.nextValidId(0);
      assertEquals("Next Valid Order ID: 0", string0);
  }

  /**
  //Test case number: 67
  /*Coverage entropy=0.3333333333333333
  */
  @Test(timeout = 4000)
  public void test67()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.updateAccountTime("bidExch");
      assertEquals("updateAccountTime: bidExch", string0);
  }

  /**
  //Test case number: 68
  /*Coverage entropy=0.3333333333333333
  */
  @Test(timeout = 4000)
  public void test68()  throws Throwable  {
      Order order0 = new Order();
      String string0 = EWrapperMsgGenerator.orderStatus(0, "", 0, 0, 'y', 3, 0, 'f', 0, (String) null);
      assertEquals("order status: orderId=0 clientId=0 permId=3 status= filled=0 remaining=0 avgFillPrice=121.0 lastFillPrice=102.0 parent Id=0 whyHeld=null", string0);
  }
}
