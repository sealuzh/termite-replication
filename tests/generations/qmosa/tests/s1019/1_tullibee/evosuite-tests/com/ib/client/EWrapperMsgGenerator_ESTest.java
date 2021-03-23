/*
 * This file was automatically generated by EvoSuite
 * Wed Nov 11 14:52:23 GMT 2020
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
      String string0 = EWrapperMsgGenerator.realtimeBar(393, 25, 227.5, 3581, 227.5, (-6620.0373), 3581, 4419.0, (-2892));
      assertEquals("id=393 time = 25 open=227.5 high=3581.0 low=227.5 close=-6620.0373 volume=3581 count=-2892 WAP=4419.0", string0);
  }

  /**
  //Test case number: 1
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.updateMktDepthL2(10, 1, (String) null, 10, (-1338), (-251.90828346129), 1);
      assertEquals("updateMktDepth: 10 1 null 10 -1338 -251.90828346129 1", string0);
  }

  /**
  //Test case number: 2
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.updateMktDepth(222, 2244, 0, 0, 222, 222);
      assertEquals("updateMktDepth: 222 2244 0 0 222.0 222", string0);
  }

  /**
  //Test case number: 3
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Vector<String> vector0 = new Vector<String>();
      Contract contract0 = new Contract(1, "F?LYLzh7wm`AC|0Ay", "F?LYLzh7wm`AC|0Ay", "A", 1, "", "", (String) null, (String) null, "coupon = ", vector0, "F?LYLzh7wm`AC|0Ay", false, "q", "");
      String string0 = EWrapperMsgGenerator.updatePortfolio(contract0, 1, (-160.6536024005), 3432.2, 1, 3432.2, (-160.6536024005), "-s6t6zRSxX9[F2");
      assertEquals("updatePortfolio: conid = 1\nsymbol = F?LYLzh7wm`AC|0Ay\nsecType = F?LYLzh7wm`AC|0Ay\nexpiry = A\nstrike = 1.0\nright = \nmultiplier = \nexchange = null\nprimaryExch = F?LYLzh7wm`AC|0Ay\ncurrency = null\nlocalSymbol = coupon = \n1 -160.6536024005 3432.2 1.0 3432.2 -160.6536024005 -s6t6zRSxX9[F2", string0);
  }

  /**
  //Test case number: 4
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.updateAccountValue((String) null, (String) null, (String) null, "updateAccountTime: null");
      assertEquals("updateAccountValue: null null null updateAccountTime: null", string0);
  }

  /**
  //Test case number: 5
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.orderStatus(1, (String) null, Integer.MAX_VALUE, 402, Integer.MAX_VALUE, 2146542513, Integer.MAX_VALUE, 1.7976931348623157E308, Integer.MAX_VALUE, (String) null);
      assertEquals("order status: orderId=1 clientId=2147483647 permId=2146542513 status=null filled=2147483647 remaining=402 avgFillPrice=2.147483647E9 lastFillPrice=1.7976931348623157E308 parent Id=2147483647 whyHeld=null", string0);
  }

  /**
  //Test case number: 6
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.tickEFP(20, 0, 2293.908557833, (String) null, 0.0, 1511, (String) null, (-4294.8), 919.6671145850454);
      assertEquals("id=20  bidSize: basisPoints = 2293.908557833/null impliedFuture = 0.0 holdDays = 1511 futureExpiry = null dividendImpact = -4294.8 dividends to expiry = 919.6671145850454", string0);
  }

  /**
  //Test case number: 7
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.tickOptionComputation(1, 396, 1.0, 61.7298, 1.7976931348623157E308, 1.7976931348623157E308);
      assertEquals("id=1  unknown: vol = 1.0 delta = N/A", string0);
  }

  /**
  //Test case number: 8
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.tickOptionComputation(13, 13, 13, (-1.0), 1148.436, 13);
      assertEquals("id=13  modelOptComp: vol = 13.0 delta = -1.0: modelPrice = 1148.436: pvDividend = 13.0", string0);
  }

  /**
  //Test case number: 9
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.tickPrice(13, 13, 13, 13);
      assertEquals("id=13  modelOptComp=13.0  canAutoExecute", string0);
  }

  /**
  //Test case number: 10
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Vector<Integer> vector0 = new Vector<Integer>();
      Contract contract0 = new Contract((-1330), "OptionCallVolume", "Zp;Wv", "],{Uiw>kd[^e7bB", 0.0, "Zp;Wv", "],{Uiw>kd[^e7bB", "mq+ (", "],{Uiw>kd[^e7bB", (String) null, vector0, "s8?OsIgZj1;Aw,R8&S$", true, "[Lvz\"PxG|^SxO]D)", (String) null);
      String string0 = EWrapperMsgGenerator.updatePortfolio(contract0, 32, (-1330), (-1330), (-1.0), 0.0, 847.0, " currency=");
      assertEquals("updatePortfolio: conid = -1330\nsymbol = OptionCallVolume\nsecType = Zp;Wv\nexpiry = ],{Uiw>kd[^e7bB\nstrike = 0.0\nright = Zp;Wv\nmultiplier = ],{Uiw>kd[^e7bB\nexchange = mq+ (\nprimaryExch = s8?OsIgZj1;Aw,R8&S$\ncurrency = ],{Uiw>kd[^e7bB\nlocalSymbol = null\n32 -1330.0 -1330.0 -1.0 0.0 847.0  currency=", string0);
  }

  /**
  //Test case number: 11
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.fundamentalData(584, "1,nvwJsoYGv*w@");
      assertEquals("id  = 584 len = 15\n1,nvwJsoYGv*w@", string0);
  }

  /**
  //Test case number: 12
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      // Undeclared exception!
      try { 
        EWrapperMsgGenerator.scannerData(2, (-2868), (ContractDetails) null, "O", (String) null, "M':HMR<", (String) null);
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
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      OrderState orderState0 = new OrderState((String) null, (String) null, "ot9H", (String) null, 0, Integer.MAX_VALUE, Integer.MAX_VALUE, (String) null, (String) null);
      Contract contract0 = new Contract();
      // Undeclared exception!
      try { 
        EWrapperMsgGenerator.openOrder(0, contract0, (Order) null, orderState0);
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
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Contract contract0 = new Contract();
      // Undeclared exception!
      try { 
        EWrapperMsgGenerator.execDetails(0, contract0, (Execution) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.ib.client.EWrapperMsgGenerator", e);
      }
  }

  /**
  //Test case number: 15
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      // Undeclared exception!
      try { 
        EWrapperMsgGenerator.deltaNeutralValidation((-3701), (UnderComp) null);
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
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
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
  //Test case number: 17
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      // Undeclared exception!
      try { 
        EWrapperMsgGenerator.bondContractDetails(2147483645, (ContractDetails) null);
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
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Vector<Integer> vector0 = new Vector<Integer>();
      Contract contract0 = new Contract(15, "26WeekLow", "26WeekLow", "26WeekLow", 15, (String) null, "26WeekLow", "52WeekHigh", (String) null, "Y;!=a/sZdH2", vector0, "  It does not support notHeld parameter.", false, "26WeekLow", " holdDays = ");
      String string0 = EWrapperMsgGenerator.contractMsg(contract0);
      assertEquals("conid = 15\nsymbol = 26WeekLow\nsecType = 26WeekLow\nexpiry = 26WeekLow\nstrike = 15.0\nright = null\nmultiplier = 26WeekLow\nexchange = 52WeekHigh\nprimaryExch =   It does not support notHeld parameter.\ncurrency = null\nlocalSymbol = Y;!=a/sZdH2\n", string0);
  }

  /**
  //Test case number: 19
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Contract contract0 = new Contract();
      Order order0 = new Order();
      order0.m_algoStrategy = "BOND";
      OrderState orderState0 = new OrderState("tfBf*V~8#fHH|P", (String) null, "updateMktDepth: ", "tfBf*V~8#fHH|P", 2, 1535.8734, (-1377.228), "cw", "MP8pzEJ' /pM(xeE#");
      String string0 = EWrapperMsgGenerator.openOrder(1897, contract0, order0, orderState0);
      assertNotNull(string0);
  }

  /**
  //Test case number: 20
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Vector<Object> vector0 = new Vector<Object>();
      Contract contract0 = new Contract((-1478), ">c(|", "BAG", ">c(|", 0L, "FA: null >c(|", (String) null, (String) null, "FA: null >c(|", ">c(|", vector0, "FA: null >c(|", false, "id=13  modelOptComp: vol = N/A delta = N/A: modelPrice = N/A: pvDividend = 427.24772474", "g<]<<@)g/");
      Order order0 = new Order();
      UnderComp underComp0 = new UnderComp();
      contract0.m_underComp = underComp0;
      OrderState orderState0 = new OrderState((String) null, "nextOptionPartial = ", "BAG", "  It does not support realtime bar data query cancellation.", 702.897, 1.7976931348623157E308, 0, "  It does not support snapshot market data requests.", "cTb}");
      String string0 = EWrapperMsgGenerator.openOrder(0, contract0, order0, orderState0);
      assertNotNull(string0);
  }

  /**
  //Test case number: 21
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Vector<Object> vector0 = new Vector<Object>();
      Contract contract0 = new Contract((-1478), ">c(|", "BAG", ">c(|", 0L, "FA: null >c(|", (String) null, (String) null, "FA: null >c(|", ">c(|", vector0, "FA: null >c(|", true, "O1", "g<]<<@)g/");
      Order order0 = new Order();
      order0.m_basisPoints = (double) (-1478);
      OrderState orderState0 = new OrderState((String) null, ">c(|", "BAG", "  It does not support realtime bar data query cancellation.", 679.672068597088, 1.7976931348623157E308, 0, "  It does not support snapshot market data requests.", "cTb}");
      String string0 = EWrapperMsgGenerator.openOrder((-1478), contract0, order0, orderState0);
      assertNotNull(string0);
  }

  /**
  //Test case number: 22
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.tickOptionComputation(13, 13, 0.0, 1564.6255901385784, 0.0, 0.0);
      assertEquals("id=13  modelOptComp: vol = 0.0 delta = N/A: modelPrice = 0.0: pvDividend = 0.0", string0);
  }

  /**
  //Test case number: 23
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.tickOptionComputation(13, 13, (-1835.0), 1508.7550323738678, (-769.65364057), (-769.65364057));
      assertEquals("id=13  modelOptComp: vol = N/A delta = N/A: modelPrice = N/A: pvDividend = N/A", string0);
  }

  /**
  //Test case number: 24
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.tickOptionComputation(8, 0, 1.7976931348623157E308, 0, Integer.MAX_VALUE, 2679.32);
      assertEquals("id=8  bidSize: vol = N/A delta = 0.0", string0);
  }

  /**
  //Test case number: 25
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.tickOptionComputation(13, 13, 1.7976931348623157E308, 1567.284, 1.7976931348623157E308, 1.7976931348623157E308);
      assertEquals("id=13  modelOptComp: vol = N/A delta = N/A: modelPrice = N/A: pvDividend = N/A", string0);
  }

  /**
  //Test case number: 26
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.tickOptionComputation(0, 13, 145.8, 1655.092, 1.7976931348623157E308, 0);
      assertEquals("id=0  modelOptComp: vol = 145.8 delta = N/A: modelPrice = N/A: pvDividend = 0.0", string0);
  }

  /**
  //Test case number: 27
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.tickPrice(47, 47, 47, (-979));
      assertEquals("id=47  fundamentals=47.0  canAutoExecute", string0);
  }

  /**
  //Test case number: 28
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.tickPrice(1372, 2258, (-613.57505104), 0);
      assertEquals("id=1372  unknown=-613.57505104  noAutoExecute", string0);
  }

  /**
  //Test case number: 29
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.updateMktDepth((-2141652777), 53, (-628), 53, (-1615.123497), 53);
      assertEquals("updateMktDepth: -2141652777 53 -628 53 -1615.123497 53", string0);
  }

  /**
  //Test case number: 30
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.tickString(2147483645, (-4167), "FA: null %c|");
      assertEquals("id=2147483645  unknown=FA: null %c|", string0);
  }

  /**
  //Test case number: 31
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      UnderComp underComp0 = new UnderComp();
      String string0 = EWrapperMsgGenerator.deltaNeutralValidation(51, underComp0);
      assertEquals("id = 51 underComp.conId =0 underComp.delta =0.0 underComp.price =0.0", string0);
  }

  /**
  //Test case number: 32
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.updateNewsBulletin((-1), 8, "uqmDwPM;38gk", (String) null);
      assertEquals("MsgId=-1 :: MsgType=8 :: Origin=null :: Message=uqmDwPM;38gk", string0);
  }

  /**
  //Test case number: 33
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
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
  //Test case number: 34
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      Vector<TagValue> vector0 = new Vector<TagValue>();
      Contract contract0 = new Contract(99, "ie$6,T $3TxR+`N@", (String) null, "ie$6,T $3TxR+`N@", 1, (String) null, "g0xzNn@C", (String) null, (String) null, "SW%M3+/ (:F+T:vd$", vector0, "ie$6,T $3TxR+`N@", false, "&Km[IRsRP", (String) null);
      ContractDetails contractDetails0 = new ContractDetails(contract0, "l4ssRw", "?>Hdc=AXk5C'.+zR[", 0.0, "ie$6,T $3TxR+`N@", (String) null, 1, "g0xzNn@C", (String) null, (String) null, "&Km[IRsRP", "", "\n", "ie$6,T $3TxR+`N@", "");
      String string0 = EWrapperMsgGenerator.contractDetails(1, contractDetails0);
      assertEquals("reqId = 1 ===================================\n ---- Contract Details begin ----\nconid = 99\nsymbol = ie$6,T $3TxR+`N@\nsecType = null\nexpiry = ie$6,T $3TxR+`N@\nstrike = 1.0\nright = null\nmultiplier = g0xzNn@C\nexchange = null\nprimaryExch = ie$6,T $3TxR+`N@\ncurrency = null\nlocalSymbol = SW%M3+/ (:F+T:vd$\nmarketName = l4ssRw\ntradingClass = ?>Hdc=AXk5C'.+zR[\nminTick = 0.0\nprice magnifier = 0\norderTypes = ie$6,T $3TxR+`N@\nvalidExchanges = null\nunderConId = 1\nlongName = g0xzNn@C\ncontractMonth = null\nindustry = null\ncategory = &Km[IRsRP\nsubcategory = \ntimeZoneId = \n\ntradingHours = ie$6,T $3TxR+`N@\nliquidHours = \n ---- Contract Details End ----\n", string0);
  }

  /**
  //Test case number: 35
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      // Undeclared exception!
      try { 
        EWrapperMsgGenerator.updatePortfolio((Contract) null, 0, 0, 0, 1.7976931348623157E308, 0, 0, ",");
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
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.updateAccountValue("njTJY/qn`", "n>", "Ox`d(&Yb", "Ox`d(&Yb");
      assertEquals("updateAccountValue: njTJY/qn` n> Ox`d(&Yb Ox`d(&Yb", string0);
  }

  /**
  //Test case number: 37
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.receiveFA((-1478), ">c(|");
      assertEquals("FA: null >c(|", string0);
  }

  /**
  //Test case number: 38
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.contractDetailsEnd(98);
      assertEquals("reqId = 98 =============== end ===============", string0);
  }

  /**
  //Test case number: 39
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.tickSnapshotEnd(4512);
      assertEquals("id=4512 =============== end ===============", string0);
  }

  /**
  //Test case number: 40
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.orderStatus((-3170), "I{J@$u(vv]x^.8F", (-3170), 3831, (-524.30195924678), 40, 40, 1246.8, 1523, "RwmKS<AD");
      assertEquals("order status: orderId=-3170 clientId=1523 permId=40 status=I{J@$u(vv]x^.8F filled=-3170 remaining=3831 avgFillPrice=-524.30195924678 lastFillPrice=1246.8 parent Id=40 whyHeld=RwmKS<AD", string0);
  }

  /**
  //Test case number: 41
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.scannerDataEnd(18);
      assertEquals("id = 18 =============== end ===============", string0);
  }

  /**
  //Test case number: 42
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.tickGeneric(1520, 5, 1921.13035607);
      assertEquals("id=1520  lastSize=1921.13035607", string0);
  }

  /**
  //Test case number: 43
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.managedAccounts("  It does not support historical data query cancellation.");
      assertEquals("Connected : The list of managed accounts are : [  It does not support historical data query cancellation.]", string0);
  }

  /**
  //Test case number: 44
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      EWrapperMsgGenerator eWrapperMsgGenerator0 = new EWrapperMsgGenerator();
      assertEquals(" =============== end ===============", eWrapperMsgGenerator0.openOrderEnd());
  }

  /**
  //Test case number: 45
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      // Undeclared exception!
      try { 
        EWrapperMsgGenerator.contractDetails((-2146915157), (ContractDetails) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.ib.client.EWrapperMsgGenerator", e);
      }
  }

  /**
  //Test case number: 46
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.accountDownloadEnd("Q ]$f-58*gAN$&t");
      assertEquals("accountDownloadEnd: Q ]$f-58*gAN$&t", string0);
  }

  /**
  //Test case number: 47
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.updateMktDepthL2(1994091958, (-54), "1Hb\"E", (-54), (-4462), (-4462), (-1946));
      assertEquals("updateMktDepth: 1994091958 -54 1Hb\"E -54 -4462 -4462.0 -1946", string0);
  }

  /**
  //Test case number: 48
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      ContractDetails contractDetails0 = new ContractDetails();
      String string0 = EWrapperMsgGenerator.bondContractDetails((-1839), contractDetails0);
      assertEquals("reqId = -1839 ===================================\n ---- Bond Contract Details begin ----\nsymbol = null\nsecType = null\ncusip = null\ncoupon = 0.0\nmaturity = null\nissueDate = null\nratings = null\nbondType = null\ncouponType = null\nconvertible = false\ncallable = false\nputable = false\ndescAppend = null\nexchange = null\ncurrency = null\nmarketName = null\ntradingClass = null\nconid = 0\nminTick = 0.0\norderTypes = null\nvalidExchanges = null\nnextOptionDate = null\nnextOptionType = null\nnextOptionPartial = false\nnotes = null\nlongName = null\n ---- Bond Contract Details End ----\n", string0);
  }

  /**
  //Test case number: 49
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      Vector<Object> vector0 = new Vector<Object>();
      Contract contract0 = new Contract(662, (String) null, ",y};jXl[UO^K2;RVg", (String) null, 705.706133, ",y};jXl[UO^K2;RVg", (String) null, "Brl4)O+u)g#s-BR", " expiry=", (String) null, vector0, "(F", false, "uoA~/Bbk{^=cq(C7*i3", (String) null);
      ContractDetails contractDetails0 = new ContractDetails(contract0, "kG.p!e]}", "W", 1994091958, "tMv[9c~I2(-*w<%", ",y};jXl[UO^K2;RVg", 2713, (String) null, "-", ")|JIat#V>@;Z @^3S5:", "(F", " expiry=", (String) null, (String) null, (String) null);
      String string0 = EWrapperMsgGenerator.scannerData(2713, 1994091958, contractDetails0, "CX\b^UhYmA", " expiry=", "OpenInterest", "tMv[9c~I2(-*w<%");
      assertEquals("id = 2713 rank=1994091958 symbol=null secType=,y};jXl[UO^K2;RVg expiry=null strike=705.706133 right=,y};jXl[UO^K2;RVg exchange=Brl4)O+u)g#s-BR currency= expiry= localSymbol=null marketName=kG.p!e]} tradingClass=W distance=CX\b^UhYmA benchmark= expiry= projection=OpenInterest legsStr=tMv[9c~I2(-*w<%", string0);
  }

  /**
  //Test case number: 50
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.realtimeBar(3581, 3581, 3581, (-6620.0373), (-6620.0373), (-1340.0), 3581, 2.145327252E9, 25);
      assertEquals("id=3581 time = 3581 open=3581.0 high=-6620.0373 low=-6620.0373 close=-1340.0 volume=3581 count=25 WAP=2.145327252E9", string0);
  }

  /**
  //Test case number: 51
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.nextValidId((-1000));
      assertEquals("Next Valid Order ID: -1000", string0);
  }

  /**
  //Test case number: 52
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.execDetailsEnd(4512);
      assertEquals("reqId = 4512 =============== end ===============", string0);
  }

  /**
  //Test case number: 53
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.currentTime(1000L);
      assertEquals("current time = 1000 (Jan 1, 1970 12:16:40 AM)", string0);
  }

  /**
  //Test case number: 54
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.openOrderEnd();
      assertEquals(" =============== end ===============", string0);
  }

  /**
  //Test case number: 55
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.tickEFP(50, 3037, 13.0, "1Hb\"E", 959.6366, 3037, " ocaGroup=", 3037, 4741.038);
      assertEquals("id=50  unknown: basisPoints = 13.0/1Hb\"E impliedFuture = 959.6366 holdDays = 3037 futureExpiry =  ocaGroup= dividendImpact = 3037.0 dividends to expiry = 4741.038", string0);
  }

  /**
  //Test case number: 56
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test56()  throws Throwable  {
      Contract contract0 = new Contract();
      Execution execution0 = new Execution();
      String string0 = EWrapperMsgGenerator.execDetails(2146243546, contract0, execution0);
      assertEquals(" ---- Execution Details begin ----\nreqId = 2146243546\norderId = 0\nclientId = 0\nsymbol = null\nsecType = null\nexpiry = null\nstrike = 0.0\nright = null\ncontractExchange = null\ncurrency = null\nlocalSymbol = null\nexecId = null\ntime = null\nacctNumber = null\nexecutionExchange = null\nside = null\nshares = 0\nprice = 0.0\npermId = 0\nliquidation = 0\ncumQty = 0\navgPrice = 0.0\n ---- Execution Details end ----\n", string0);
  }

  /**
  //Test case number: 57
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test57()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.tickSize((-153), Integer.MAX_VALUE, 961);
      assertEquals("id=-153  unknown=961", string0);
  }

  /**
  //Test case number: 58
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test58()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.scannerParameters("uKU{y!");
      assertEquals("SCANNER PARAMETERS:\nuKU{y!", string0);
  }

  /**
  //Test case number: 59
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test59()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.historicalData(2244, "com.ib.client.UnderComp", (-3055.0), 967.2231, 1.7976931348623157E308, 0.0, 0, 222, 2305.7231547973, false);
      assertEquals("id=2244 date = com.ib.client.UnderComp open=-3055.0 high=967.2231 low=1.7976931348623157E308 close=0.0 volume=0 count=222 WAP=2305.7231547973 hasGaps=false", string0);
  }

  /**
  //Test case number: 60
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test60()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.updateAccountTime((String) null);
      assertEquals("updateAccountTime: null", string0);
  }
}