/*
 * This file was automatically generated by EvoSuite
 * Thu Dec 05 23:54:40 GMT 2019
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
import org.evosuite.runtime.System;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class EWrapperMsgGenerator_ESTest extends EWrapperMsgGenerator_ESTest_scaffolding {

  /**
  //Test case number: 0
  /*Coverage entropy=1.5652789553347763
  */
  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.tickOptionComputation((-1826), 13, 13, 1.7976931348623157E308, 1.7976931348623157E308, (-1826));
      assertEquals("id=-1826  modelOptComp: vol = 13.0 delta = N/A: modelPrice = N/A: pvDividend = N/A", string0);
      
      String string1 = EWrapperMsgGenerator.tickOptionComputation((-1826), 13, (-3876.956353412069), 13, 13, 1.7976931348623157E308);
      assertEquals("id=-1826  modelOptComp: vol = N/A delta = N/A: modelPrice = 13.0: pvDividend = N/A", string1);
      
      String string2 = EWrapperMsgGenerator.tickOptionComputation(13, 4107, 1.7976931348623157E308, (-1826), (-3876.956353412069), 1307.520786905);
      assertEquals("id=13  unknown: vol = N/A delta = N/A", string2);
      
      Vector<String> vector0 = new Vector<String>();
      Contract contract0 = new Contract((-1826), "marketName = ", "BAG", ":/>|T#?Feb_\"<-hA0q", 1859.0, "marketName = ", "B==b5[", "Zlu`j-zP", (String) null, (String) null, vector0, ":/>|T#?Feb_\"<-hA0q", false, "id=-1826  modelOptComp: vol = N/A delta = N/A: modelPrice = 13.0: pvDividend = N/A", (String) null);
      contract0.m_comboLegsDescrip = ")Q^ PYiuBUg=V";
      Order order0 = new Order();
      OrderState orderState0 = new OrderState();
      EWrapperMsgGenerator.openOrder(2451, contract0, order0, orderState0);
      String string3 = EWrapperMsgGenerator.tickSize(2451, 0, 0);
      assertEquals("id=2451  bidSize=0", string3);
      
      order0.m_origin = 950;
      String string4 = EWrapperMsgGenerator.tickEFP((-164), 4107, 1398.568, "0", 1.7976931348623157E308, 0, " continuousUpdate=", 3495.56697668, 0);
      assertEquals("id=-164  unknown: basisPoints = 1398.568/0 impliedFuture = 1.7976931348623157E308 holdDays = 0 futureExpiry =  continuousUpdate= dividendImpact = 3495.56697668 dividends to expiry = 0.0", string4);
      
      String string5 = EWrapperMsgGenerator.nextValidId(Integer.MAX_VALUE);
      assertEquals("Next Valid Order ID: 2147483647", string5);
  }

  /**
  //Test case number: 1
  /*Coverage entropy=0.3333333333333333
  */
  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Order order0 = new Order();
      order0.m_algoStrategy = "Z~hs";
      Vector<Integer> vector0 = new Vector<Integer>();
      order0.m_algoParams = vector0;
      vector0.add((Integer) null);
      Contract contract0 = new Contract();
      OrderState orderState0 = new OrderState();
      // Undeclared exception!
      try { 
        EWrapperMsgGenerator.openOrder(Integer.MAX_VALUE, contract0, order0, orderState0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.ib.client.EWrapperMsgGenerator", e);
      }
  }

  /**
  //Test case number: 2
  /*Coverage entropy=0.3333333333333333
  */
  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Order order0 = new Order();
      order0.m_algoStrategy = "Z~hs";
      Vector<Integer> vector0 = new Vector<Integer>();
      order0.m_algoParams = vector0;
      vector0.add((Integer) 0);
      Contract contract0 = new Contract();
      OrderState orderState0 = new OrderState();
      // Undeclared exception!
      try { 
        EWrapperMsgGenerator.openOrder(44, contract0, order0, orderState0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // java.lang.Integer cannot be cast to com.ib.client.TagValue
         //
         verifyException("com.ib.client.EWrapperMsgGenerator", e);
      }
  }

  /**
  //Test case number: 3
  /*Coverage entropy=0.3333333333333333
  */
  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Order order0 = new Order();
      order0.m_algoStrategy = "Z~hs";
      Vector<Integer> vector0 = new Vector<Integer>();
      order0.m_algoParams = vector0;
      Contract contract0 = new Contract();
      OrderState orderState0 = new OrderState();
      String string0 = EWrapperMsgGenerator.openOrder('f', contract0, order0, orderState0);
      assertNotNull(string0);
  }

  /**
  //Test case number: 4
  /*Coverage entropy=0.3333333333333333
  */
  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Order order0 = new Order();
      order0.m_algoStrategy = "Z~hs";
      Contract contract0 = new Contract();
      OrderState orderState0 = new OrderState();
      String string0 = EWrapperMsgGenerator.openOrder(Integer.MAX_VALUE, contract0, order0, orderState0);
      assertNotNull(string0);
  }

  /**
  //Test case number: 5
  /*Coverage entropy=0.3333333333333333
  */
  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Order order0 = new Order();
      OrderState orderState0 = new OrderState();
      Contract contract0 = new Contract(Integer.MAX_VALUE, (String) null, "BAG", (String) null, 0.0, "", (String) null, "", (String) null, (String) null, (Vector) null, (String) null, false, (String) null, (String) null);
      String string0 = EWrapperMsgGenerator.openOrder(0, contract0, order0, orderState0);
      assertNotNull(string0);
  }

  /**
  //Test case number: 6
  /*Coverage entropy=0.3333333333333333
  */
  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Order order0 = new Order();
      Contract contract0 = new Contract();
      UnderComp underComp0 = new UnderComp();
      contract0.m_underComp = underComp0;
      OrderState orderState0 = new OrderState();
      String string0 = EWrapperMsgGenerator.openOrder(1017, contract0, order0, orderState0);
      assertNotNull(string0);
  }

  /**
  //Test case number: 7
  /*Coverage entropy=1.0931471805599453
  */
  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      // Undeclared exception!
      try { 
        EWrapperMsgGenerator.updatePortfolio((Contract) null, 2144620489, 1.0, 1.0, 1.0, 2144620489, 2144620489, "A+1^Ie%28C");
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
      String string0 = EWrapperMsgGenerator.tickOptionComputation(45, 13, 45, 13, 13, 13);
      assertEquals("id=45  modelOptComp: vol = 45.0 delta = N/A: modelPrice = 13.0: pvDividend = 13.0", string0);
  }

  /**
  //Test case number: 9
  /*Coverage entropy=0.3333333333333333
  */
  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.tickOptionComputation((-1251), 13, 13, 1.7976931348623157E308, 1.7976931348623157E308, (-1251));
      assertEquals("id=-1251  modelOptComp: vol = 13.0 delta = N/A: modelPrice = N/A: pvDividend = N/A", string0);
  }

  /**
  //Test case number: 10
  /*Coverage entropy=0.3333333333333333
  */
  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.tickOptionComputation(13, 13, (-1292), (-1292), 1156.403, 0.0);
      assertEquals("id=13  modelOptComp: vol = N/A delta = N/A: modelPrice = 1156.403: pvDividend = 0.0", string0);
  }

  /**
  //Test case number: 11
  /*Coverage entropy=0.3333333333333333
  */
  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Order order0 = new Order();
      String string0 = EWrapperMsgGenerator.tickOptionComputation(0, 0, 1.7976931348623157E308, 1.7976931348623157E308, Integer.MAX_VALUE, Integer.MAX_VALUE);
      assertEquals("id=0  bidSize: vol = N/A delta = N/A", string0);
  }

  /**
  //Test case number: 12
  /*Coverage entropy=0.3333333333333333
  */
  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.tickOptionComputation(0, 13, 0, 0, 0, 13);
      assertEquals("id=0  modelOptComp: vol = 0.0 delta = 0.0: modelPrice = 0.0: pvDividend = 13.0", string0);
  }

  /**
  //Test case number: 13
  /*Coverage entropy=0.3333333333333333
  */
  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.tickOptionComputation(13, 13, 13, 13, (-1251), 13);
      assertEquals("id=13  modelOptComp: vol = 13.0 delta = N/A: modelPrice = N/A: pvDividend = 13.0", string0);
  }

  /**
  //Test case number: 14
  /*Coverage entropy=0.3333333333333333
  */
  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.tickOptionComputation(13, 13, 13, 13, 13, (-1.0));
      assertEquals("id=13  modelOptComp: vol = 13.0 delta = N/A: modelPrice = 13.0: pvDividend = N/A", string0);
  }

  /**
  //Test case number: 15
  /*Coverage entropy=0.3333333333333333
  */
  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.tickOptionComputation((-1251), 13, 13, (-1251), (-1251), (-1251));
      assertEquals("id=-1251  modelOptComp: vol = 13.0 delta = N/A: modelPrice = N/A: pvDividend = N/A", string0);
  }

  /**
  //Test case number: 16
  /*Coverage entropy=0.3333333333333333
  */
  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Order order0 = new Order();
      Contract contract0 = new Contract();
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
  //Test case number: 17
  /*Coverage entropy=0.3333333333333333
  */
  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      // Undeclared exception!
      try { 
        EWrapperMsgGenerator.scannerData(2226, 456, (ContractDetails) null, (String) null, (String) null, "~y.c-+O6VU3\u0000%uQ", (String) null);
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
  //Test case number: 19
  /*Coverage entropy=0.3333333333333333
  */
  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Order order0 = new Order();
      String string0 = EWrapperMsgGenerator.tickString(2, 1, "");
      assertEquals("id=2  bidPrice=", string0);
  }

  /**
  //Test case number: 20
  /*Coverage entropy=0.3333333333333333
  */
  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      int int0 = 2147483646;
      // Undeclared exception!
      try { 
        EWrapperMsgGenerator.bondContractDetails(2147483646, (ContractDetails) null);
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
      Order order0 = new Order();
      String string0 = EWrapperMsgGenerator.tickGeneric('y', 'n', Integer.MAX_VALUE);
      assertEquals("id=121  unknown=2.147483647E9", string0);
  }

  /**
  //Test case number: 22
  /*Coverage entropy=0.3333333333333333
  */
  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Order order0 = new Order();
      String string0 = EWrapperMsgGenerator.tickSize(2, 'b', '?');
      assertEquals("id=2  unknown=63", string0);
  }

  /**
  //Test case number: 23
  /*Coverage entropy=0.3333333333333333
  */
  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.tickPrice(10, 10, 10, (-179));
      assertEquals("id=10  bidOptComp=10.0  canAutoExecute", string0);
  }

  /**
  //Test case number: 24
  /*Coverage entropy=0.3333333333333333
  */
  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      Order order0 = new Order();
      String string0 = EWrapperMsgGenerator.tickPrice(Integer.MAX_VALUE, 0, 0, 13);
      assertEquals("id=2147483647  bidSize=0.0  canAutoExecute", string0);
  }

  /**
  //Test case number: 25
  /*Coverage entropy=0.3333333333333333
  */
  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.tickSnapshotEnd(13);
      assertEquals("id=13 =============== end ===============", string0);
  }

  /**
  //Test case number: 26
  /*Coverage entropy=0.3333333333333333
  */
  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.scannerDataEnd(846);
      assertEquals("id = 846 =============== end ===============", string0);
  }

  /**
  //Test case number: 27
  /*Coverage entropy=0.3333333333333333
  */
  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      Contract contract0 = new Contract();
      UnderComp underComp0 = contract0.m_underComp;
      // Undeclared exception!
      try { 
        EWrapperMsgGenerator.deltaNeutralValidation(13, (UnderComp) null);
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
  /*Coverage entropy=0.3333333333333333
  */
  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      Contract contract0 = new Contract();
      Execution execution0 = new Execution();
      String string0 = EWrapperMsgGenerator.execDetails((-1431655765), contract0, execution0);
      assertEquals(" ---- Execution Details begin ----\nreqId = -1431655765\norderId = 0\nclientId = 0\nsymbol = null\nsecType = null\nexpiry = null\nstrike = 0.0\nright = null\ncontractExchange = null\ncurrency = null\nlocalSymbol = null\nexecId = null\ntime = null\nacctNumber = null\nexecutionExchange = null\nside = null\nshares = 0\nprice = 0.0\npermId = 0\nliquidation = 0\ncumQty = 0\navgPrice = 0.0\n ---- Execution Details end ----\n", string0);
  }

  /**
  //Test case number: 29
  /*Coverage entropy=0.3333333333333333
  */
  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      Execution execution0 = new Execution();
      // Undeclared exception!
      try { 
        EWrapperMsgGenerator.execDetails((-1), (Contract) null, execution0);
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
  /*Coverage entropy=0.3333333333333333
  */
  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.fundamentalData(843, "");
      assertEquals("id  = 843 len = 0\n", string0);
  }

  /**
  //Test case number: 31
  /*Coverage entropy=0.3333333333333333
  */
  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      Order order0 = new Order();
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
  //Test case number: 32
  /*Coverage entropy=0.3333333333333333
  */
  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      Contract contract0 = new Contract();
      Order order0 = new Order();
      OrderState orderState0 = new OrderState();
      String string0 = EWrapperMsgGenerator.openOrder(0, contract0, order0, orderState0);
      assertNotNull(string0);
  }

  /**
  //Test case number: 33
  /*Coverage entropy=0.3333333333333333
  */
  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.accountDownloadEnd("73dU");
      assertEquals("accountDownloadEnd: 73dU", string0);
  }

  /**
  //Test case number: 34
  /*Coverage entropy=0.3333333333333333
  */
  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.contractDetailsEnd(224);
      assertEquals("reqId = 224 =============== end ===============", string0);
  }

  /**
  //Test case number: 35
  /*Coverage entropy=1.3300185960211162
  */
  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      Order order0 = new Order();
      order0.m_whatIf = true;
      String string0 = EWrapperMsgGenerator.tickOptionComputation(2, 13, 1.7976931348623157E308, 0, Integer.MAX_VALUE, 1.7976931348623157E308);
      assertEquals("id=2  modelOptComp: vol = N/A delta = 0.0: modelPrice = 2.147483647E9: pvDividend = N/A", string0);
      
      ContractDetails contractDetails0 = new ContractDetails();
      String string1 = EWrapperMsgGenerator.contractDetails((-1418), contractDetails0);
      assertEquals("reqId = -1418 ===================================\n ---- Contract Details begin ----\nconid = 0\nsymbol = null\nsecType = null\nexpiry = null\nstrike = 0.0\nright = null\nmultiplier = null\nexchange = null\nprimaryExch = null\ncurrency = null\nlocalSymbol = null\nmarketName = null\ntradingClass = null\nminTick = 0.0\nprice magnifier = 0\norderTypes = null\nvalidExchanges = null\nunderConId = 0\nlongName = null\ncontractMonth = null\nindustry = null\ncategory = null\nsubcategory = null\ntimeZoneId = null\ntradingHours = null\nliquidHours = null\n ---- Contract Details End ----\n", string1);
  }

  /**
  //Test case number: 36
  /*Coverage entropy=1.0931471805599453
  */
  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      ContractDetails contractDetails0 = new ContractDetails((Contract) null, "=BB'n<\"S3Xh", "=BB'n<\"S3Xh", 3152, "eD)[MV}", "%Rr=@-rTms!%8>cU;", (-1995163807), (String) null, "eD)[MV}", "=BB'n<\"S3Xh", "", "eD)[MV}", "@@~67!\"wTwYHT", (String) null, "");
      // Undeclared exception!
      try { 
        EWrapperMsgGenerator.contractDetails(3152, contractDetails0);
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
  /*Coverage entropy=0.3333333333333333
  */
  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.tickOptionComputation(13, 13, 13, 13, 13, 13);
      assertEquals("id=13  modelOptComp: vol = 13.0 delta = N/A: modelPrice = 13.0: pvDividend = 13.0", string0);
  }

  /**
  //Test case number: 38
  /*Coverage entropy=0.3333333333333333
  */
  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.updateNewsBulletin(899, 899, ">1-A&&", "O");
      assertEquals("MsgId=899 :: MsgType=899 :: Origin=O :: Message=>1-A&&", string0);
  }

  /**
  //Test case number: 39
  /*Coverage entropy=0.3333333333333333
  */
  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      Order order0 = new Order();
      String string0 = EWrapperMsgGenerator.updateNewsBulletin(0, 10, (String) null, (String) null);
      assertEquals("MsgId=0 :: MsgType=10 :: Origin=null :: Message=null", string0);
  }

  /**
  //Test case number: 40
  /*Coverage entropy=0.3333333333333333
  */
  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      Order order0 = new Order();
      String string0 = EWrapperMsgGenerator.receiveFA(0, (String) null);
      assertEquals("FA: null null", string0);
  }

  /**
  //Test case number: 41
  /*Coverage entropy=0.3333333333333333
  */
  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      Contract contract0 = new Contract();
      String string0 = EWrapperMsgGenerator.contractMsg(contract0);
      assertEquals("conid = 0\nsymbol = null\nsecType = null\nexpiry = null\nstrike = 0.0\nright = null\nmultiplier = null\nexchange = null\nprimaryExch = null\ncurrency = null\nlocalSymbol = null\n", string0);
  }

  /**
  //Test case number: 42
  /*Coverage entropy=1.0676032882216056
  */
  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      Order order0 = new Order();
      String string0 = EWrapperMsgGenerator.tickOptionComputation(2, 13, 1.7976931348623157E308, 0, Integer.MAX_VALUE, 1.7976931348623157E308);
      assertEquals("id=2  modelOptComp: vol = N/A delta = 0.0: modelPrice = 2.147483647E9: pvDividend = N/A", string0);
      
      Contract contract0 = new Contract(0, (String) null, (String) null, " ---- Contract Details End ----\n", (-4375.1112241), (String) null, (String) null, "`", "KAx-D}OwaN`#^P@Z3DT", (String) null, (Vector) null, (String) null, false, (String) null, (String) null);
      String string1 = EWrapperMsgGenerator.updatePortfolio(contract0, 0, (-3303.58093), 0.0, 1331.658832101, 1.0, 3568.7962, (String) null);
      assertEquals("updatePortfolio: conid = 0\nsymbol = null\nsecType = null\nexpiry =  ---- Contract Details End ----\n\nstrike = -4375.1112241\nright = null\nmultiplier = null\nexchange = `\nprimaryExch = null\ncurrency = KAx-D}OwaN`#^P@Z3DT\nlocalSymbol = null\n0 -3303.58093 0.0 1331.658832101 1.0 3568.7962 null", string1);
  }

  /**
  //Test case number: 43
  /*Coverage entropy=0.3333333333333333
  */
  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.updateAccountTime("U");
      assertEquals("updateAccountTime: U", string0);
  }

  /**
  //Test case number: 44
  /*Coverage entropy=0.3333333333333333
  */
  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.updateAccountValue((String) null, (String) null, "uy6:", "uy6:");
      assertEquals("updateAccountValue: null null uy6: uy6:", string0);
  }

  /**
  //Test case number: 45
  /*Coverage entropy=0.3333333333333333
  */
  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.updateAccountValue("oj7tGX28;/-d", "id=13  modelOptComp: vol = 13.0 delta = N/A: modelPrice = N/A: pvDividend = 3238.0", "oj7tGX28;/-d", "id=13  modelOptComp: vol = 13.0 delta = N/A: modelPrice = N/A: pvDividend = 3238.0");
      assertEquals("updateAccountValue: oj7tGX28;/-d id=13  modelOptComp: vol = 13.0 delta = N/A: modelPrice = N/A: pvDividend = 3238.0 oj7tGX28;/-d id=13  modelOptComp: vol = 13.0 delta = N/A: modelPrice = N/A: pvDividend = 3238.0", string0);
  }

  /**
  //Test case number: 46
  /*Coverage entropy=0.3333333333333333
  */
  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      Order order0 = new Order();
      String string0 = EWrapperMsgGenerator.updateAccountValue("", (String) null, (String) null, (String) null);
      assertEquals("updateAccountValue:  null null null", string0);
  }

  /**
  //Test case number: 47
  /*Coverage entropy=0.3333333333333333
  */
  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      Order order0 = new Order();
      Contract contract0 = new Contract();
      OrderState orderState0 = new OrderState();
      String string0 = EWrapperMsgGenerator.orderStatus(0, (String) null, 0, 0, 0.0, 'c', 0, 3, Integer.MAX_VALUE, (String) null);
      assertEquals("order status: orderId=0 clientId=2147483647 permId=99 status=null filled=0 remaining=0 avgFillPrice=0.0 lastFillPrice=3.0 parent Id=0 whyHeld=null", string0);
  }

  /**
  //Test case number: 48
  /*Coverage entropy=0.3333333333333333
  */
  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      Order order0 = new Order();
      String string0 = EWrapperMsgGenerator.orderStatus(0, (String) null, 0, 13, 0, 0, 'f', 0, 0, "}oP.N6/U1eMrs6f*");
      assertEquals("order status: orderId=0 clientId=0 permId=0 status=null filled=0 remaining=13 avgFillPrice=0.0 lastFillPrice=0.0 parent Id=102 whyHeld=}oP.N6/U1eMrs6f*", string0);
  }

  /**
  //Test case number: 49
  /*Coverage entropy=0.3333333333333333
  */
  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.currentTime(2545L);
      assertEquals("current time = 2545 (Jan 1, 1970 12:42:25 AM)", string0);
  }

  /**
  //Test case number: 50
  /*Coverage entropy=0.3333333333333333
  */
  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.scannerParameters("}~BGnM>Z:R|");
      assertEquals("SCANNER PARAMETERS:\n}~BGnM>Z:R|", string0);
  }

  /**
  //Test case number: 51
  /*Coverage entropy=0.3333333333333333
  */
  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      Order order0 = new Order();
      String string0 = EWrapperMsgGenerator.orderStatus(2, (String) null, 'm', 2, 0, 0, 0, 0, 3, (String) null);
      assertEquals("order status: orderId=2 clientId=3 permId=0 status=null filled=109 remaining=2 avgFillPrice=0.0 lastFillPrice=0.0 parent Id=0 whyHeld=null", string0);
  }

  /**
  //Test case number: 52
  /*Coverage entropy=0.3333333333333333
  */
  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.realtimeBar(1994091958, (-717L), (-717L), 1.7976931348623157E308, (-717L), 1.994091958E9, 1994091958, 1.994091958E9, 1994091958);
      assertEquals("id=1994091958 time = -717 open=-717.0 high=1.7976931348623157E308 low=-717.0 close=1.994091958E9 volume=1994091958 count=1994091958 WAP=1.994091958E9", string0);
  }

  /**
  //Test case number: 53
  /*Coverage entropy=0.3333333333333333
  */
  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.realtimeBar((-2014042372), (-2014042372), 4167.7179055, (-2014042372), (-2014042372), 1094.51, (-2014042372), (-2014042372), (-2014042372));
      assertEquals("id=-2014042372 time = -2014042372 open=4167.7179055 high=-2.014042372E9 low=-2.014042372E9 close=1094.51 volume=-2014042372 count=-2014042372 WAP=-2.014042372E9", string0);
  }

  /**
  //Test case number: 54
  /*Coverage entropy=0.3333333333333333
  */
  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.realtimeBar(19, 19, 19, 145.410705, 145.410705, 145.410705, 0L, 19, (-1087));
      assertEquals("id=19 time = 19 open=19.0 high=145.410705 low=145.410705 close=145.410705 volume=0 count=-1087 WAP=19.0", string0);
  }

  /**
  //Test case number: 55
  /*Coverage entropy=0.3333333333333333
  */
  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      Order order0 = new Order();
      String string0 = EWrapperMsgGenerator.historicalData(0, (String) null, 1, 'f', Integer.MAX_VALUE, 1, Integer.MAX_VALUE, 0, 0, false);
      assertEquals("id=0 date = null open=1.0 high=102.0 low=2.147483647E9 close=1.0 volume=2147483647 count=0 WAP=0.0 hasGaps=false", string0);
  }

  /**
  //Test case number: 56
  /*Coverage entropy=0.3333333333333333
  */
  @Test(timeout = 4000)
  public void test56()  throws Throwable  {
      Order order0 = new Order();
      String string0 = EWrapperMsgGenerator.updateMktDepth(Integer.MAX_VALUE, Integer.MAX_VALUE, 0, 'f', Integer.MAX_VALUE, 0);
      assertEquals("updateMktDepth: 2147483647 2147483647 0 102 2.147483647E9 0", string0);
  }

  /**
  //Test case number: 57
  /*Coverage entropy=0.3333333333333333
  */
  @Test(timeout = 4000)
  public void test57()  throws Throwable  {
      Order order0 = new Order();
      String string0 = EWrapperMsgGenerator.updateMktDepth(0, Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, 0, 0);
      assertEquals("updateMktDepth: 0 2147483647 2147483647 2147483647 0.0 0", string0);
  }

  /**
  //Test case number: 58
  /*Coverage entropy=0.3333333333333333
  */
  @Test(timeout = 4000)
  public void test58()  throws Throwable  {
      ContractDetails contractDetails0 = new ContractDetails();
      String string0 = EWrapperMsgGenerator.bondContractDetails(29, contractDetails0);
      assertEquals("reqId = 29 ===================================\n ---- Bond Contract Details begin ----\nsymbol = null\nsecType = null\ncusip = null\ncoupon = 0.0\nmaturity = null\nissueDate = null\nratings = null\nbondType = null\ncouponType = null\nconvertible = false\ncallable = false\nputable = false\ndescAppend = null\nexchange = null\ncurrency = null\nmarketName = null\ntradingClass = null\nconid = 0\nminTick = 0.0\norderTypes = null\nvalidExchanges = null\nnextOptionDate = null\nnextOptionType = null\nnextOptionPartial = false\nnotes = null\nlongName = null\n ---- Bond Contract Details End ----\n", string0);
  }

  /**
  //Test case number: 59
  /*Coverage entropy=0.3333333333333333
  */
  @Test(timeout = 4000)
  public void test59()  throws Throwable  {
      ContractDetails contractDetails0 = new ContractDetails();
      String string0 = EWrapperMsgGenerator.scannerData(889, 889, contractDetails0, "coupon = ", "SCANNER PARAMETERS:", "13WeekHigh", (String) null);
      assertEquals("id = 889 rank=889 symbol=null secType=null expiry=null strike=0.0 right=null exchange=null currency=null localSymbol=null marketName=null tradingClass=null distance=coupon =  benchmark=SCANNER PARAMETERS: projection=13WeekHigh legsStr=null", string0);
  }

  /**
  //Test case number: 60
  /*Coverage entropy=0.3333333333333333
  */
  @Test(timeout = 4000)
  public void test60()  throws Throwable  {
      UnderComp underComp0 = new UnderComp();
      String string0 = EWrapperMsgGenerator.deltaNeutralValidation((-642), underComp0);
      assertEquals("id = -642 underComp.conId =0 underComp.delta =0.0 underComp.price =0.0", string0);
  }

  /**
  //Test case number: 61
  /*Coverage entropy=0.3333333333333333
  */
  @Test(timeout = 4000)
  public void test61()  throws Throwable  {
      ContractDetails contractDetails0 = new ContractDetails();
      String string0 = EWrapperMsgGenerator.scannerData(9, 1221, contractDetails0, (String) null, (String) null, (String) null, (String) null);
      assertEquals("id = 9 rank=1221 symbol=null secType=null expiry=null strike=0.0 right=null exchange=null currency=null localSymbol=null marketName=null tradingClass=null distance=null benchmark=null projection=null legsStr=null", string0);
  }

  /**
  //Test case number: 62
  /*Coverage entropy=0.3333333333333333
  */
  @Test(timeout = 4000)
  public void test62()  throws Throwable  {
      Order order0 = new Order();
      String string0 = EWrapperMsgGenerator.historicalData(1, "", 1.7976931348623157E308, 2, 1.7976931348623157E308, 'y', 0, 'n', 1, false);
      assertEquals("id=1 date =  open=1.7976931348623157E308 high=2.0 low=1.7976931348623157E308 close=121.0 volume=0 count=110 WAP=1.0 hasGaps=false", string0);
  }

  /**
  //Test case number: 63
  /*Coverage entropy=0.3333333333333333
  */
  @Test(timeout = 4000)
  public void test63()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.managedAccounts("Next Valid Order ID: ");
      assertEquals("Connected : The list of managed accounts are : [Next Valid Order ID: ]", string0);
  }

  /**
  //Test case number: 64
  /*Coverage entropy=0.3333333333333333
  */
  @Test(timeout = 4000)
  public void test64()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.execDetailsEnd((-1));
      assertEquals("reqId = -1 =============== end ===============", string0);
  }

  /**
  //Test case number: 65
  /*Coverage entropy=0.3333333333333333
  */
  @Test(timeout = 4000)
  public void test65()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.openOrderEnd();
      assertEquals(" =============== end ===============", string0);
  }

  /**
  //Test case number: 66
  /*Coverage entropy=0.3333333333333333
  */
  @Test(timeout = 4000)
  public void test66()  throws Throwable  {
      Order order0 = new Order();
      EWrapperMsgGenerator.updateMktDepthL2('c', 0, (String) null, Integer.MAX_VALUE, 1, 0, 0);
      System.setCurrentTimeMillis(Integer.MAX_VALUE);
  }

  /**
  //Test case number: 67
  /*Coverage entropy=0.3333333333333333
  */
  @Test(timeout = 4000)
  public void test67()  throws Throwable  {
      Order order0 = new Order();
      String string0 = EWrapperMsgGenerator.tickOptionComputation(0, 0, 1.7976931348623157E308, 0, Integer.MAX_VALUE, Integer.MAX_VALUE);
      assertEquals("id=0  bidSize: vol = N/A delta = 0.0", string0);
  }

  /**
  //Test case number: 68
  /*Coverage entropy=0.3333333333333333
  */
  @Test(timeout = 4000)
  public void test68()  throws Throwable  {
      Order order0 = new Order();
      String string0 = EWrapperMsgGenerator.tickOptionComputation(Integer.MAX_VALUE, 2, 0, 1, Integer.MAX_VALUE, 1.7976931348623157E308);
      assertEquals("id=2147483647  askPrice: vol = 0.0 delta = 1.0", string0);
  }

  /**
  //Test case number: 69
  /*Coverage entropy=0.3333333333333333
  */
  @Test(timeout = 4000)
  public void test69()  throws Throwable  {
      Order order0 = new Order();
      String string0 = EWrapperMsgGenerator.tickOptionComputation(Integer.MAX_VALUE, 0, 0, Integer.MAX_VALUE, 1, 1);
      assertEquals("id=2147483647  bidSize: vol = 0.0 delta = N/A", string0);
  }

  /**
  //Test case number: 70
  /*Coverage entropy=0.3333333333333333
  */
  @Test(timeout = 4000)
  public void test70()  throws Throwable  {
      Order order0 = new Order();
      String string0 = EWrapperMsgGenerator.tickOptionComputation(0, Integer.MAX_VALUE, 0, 0, Integer.MAX_VALUE, 1.7976931348623157E308);
      assertEquals("id=0  unknown: vol = 0.0 delta = 0.0", string0);
  }

  /**
  //Test case number: 71
  /*Coverage entropy=0.3333333333333333
  */
  @Test(timeout = 4000)
  public void test71()  throws Throwable  {
      Order order0 = new Order();
      String string0 = EWrapperMsgGenerator.updateMktDepthL2(1, 0, (String) null, 0, 0, 0, 'c');
      assertEquals("updateMktDepth: 1 0 null 0 0 0.0 99", string0);
  }

  /**
  //Test case number: 72
  /*Coverage entropy=0.3333333333333333
  */
  @Test(timeout = 4000)
  public void test72()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.tickOptionComputation((-1251), (-1251), (-1251), (-1251), (-1251), (-1251));
      assertEquals("id=-1251  unknown: vol = N/A delta = N/A", string0);
  }

  /**
  //Test case number: 73
  /*Coverage entropy=0.3333333333333333
  */
  @Test(timeout = 4000)
  public void test73()  throws Throwable  {
      EWrapperMsgGenerator eWrapperMsgGenerator0 = new EWrapperMsgGenerator();
      assertEquals(" =============== end ===============", eWrapperMsgGenerator0.openOrderEnd());
  }
}
