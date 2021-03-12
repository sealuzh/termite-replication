/*
 * This file was automatically generated by EvoSuite
 * Thu Nov 12 06:13:45 GMT 2020
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
      String string0 = EWrapperMsgGenerator.historicalData('m', "O", Integer.MAX_VALUE, 1.7976931348623157E308, 13, 0, Integer.MAX_VALUE, (-2146572438), 0, false);
      assertEquals("id=109 date = O open=2.147483647E9 high=1.7976931348623157E308 low=13.0 close=0.0 volume=2147483647 count=-2146572438 WAP=0.0 hasGaps=false", string0);
  }

  /**
  //Test case number: 1
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.updateMktDepthL2(0, (-1551), (String) null, Integer.MAX_VALUE, 0, 0.0, (-791));
      assertEquals("updateMktDepth: 0 -1551 null 2147483647 0 0.0 -791", string0);
  }

  /**
  //Test case number: 2
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.tickEFP(1177, (-1546), 0.0, "B{{8Q0{`", (-1036.1615962), (-8), "B{{8Q0{`", (-1036.1615962), 2260);
      assertEquals("id=1177  unknown: basisPoints = 0.0/B{{8Q0{` impliedFuture = -1036.1615962 holdDays = -8 futureExpiry = B{{8Q0{` dividendImpact = -1036.1615962 dividends to expiry = 2260.0", string0);
  }

  /**
  //Test case number: 3
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.tickOptionComputation(1, 13, 2.146806852E9, 0, 0, 965.1929485946778);
      assertEquals("id=1  modelOptComp: vol = 2.146806852E9 delta = 0.0: modelPrice = 0.0: pvDividend = 965.1929485946778", string0);
  }

  /**
  //Test case number: 4
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.tickOptionComputation(2318, 159, 0, 0.0, 0, (-2825.271732890295));
      assertEquals("id=2318  unknown: vol = 0.0 delta = 0.0", string0);
  }

  /**
  //Test case number: 5
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.tickPrice((-8), 2956, 1157.862220293939, (-2231));
      assertEquals("id=-8  unknown=1157.862220293939  canAutoExecute", string0);
  }

  /**
  //Test case number: 6
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Vector<String> vector0 = new Vector<String>();
      Execution execution0 = new Execution((-8), (-4319), " holdDays = ", "s|zs\"U_--`+3'Ur", "7Y^Cq[D-^.B", (String) null, "7Y^Cq[D-^.B", (-8), 644.0422160851, 2129881323, (-4319), 2129881323, (-1753.0));
      Contract contract0 = new Contract(3526, "s|zs\"U_--`+3'Ur", "nextOptionPartial = ", "8M", 1511.85406009, "s|zs\"U_--`+3'Ur", (String) null, "nextOptionPartial = ", "7Y^Cq[D-^.B", " holdDays = ", vector0, "PT^{@](R]&NK", false, "s|zs\"U_--`+3'Ur", "nextOptionPartial = ");
      String string0 = EWrapperMsgGenerator.execDetails(30, contract0, execution0);
      assertEquals(" ---- Execution Details begin ----\nreqId = 30\norderId = -8\nclientId = -4319\nsymbol = s|zs\"U_--`+3'Ur\nsecType = nextOptionPartial = \nexpiry = 8M\nstrike = 1511.85406009\nright = s|zs\"U_--`+3'Ur\ncontractExchange = nextOptionPartial = \ncurrency = 7Y^Cq[D-^.B\nlocalSymbol =  holdDays = \nexecId =  holdDays = \ntime = s|zs\"U_--`+3'Ur\nacctNumber = 7Y^Cq[D-^.B\nexecutionExchange = null\nside = 7Y^Cq[D-^.B\nshares = -8\nprice = 644.0422160851\npermId = 2129881323\nliquidation = -4319\ncumQty = 2129881323\navgPrice = -1753.0\n ---- Execution Details end ----\n", string0);
  }

  /**
  //Test case number: 7
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      UnderComp underComp0 = new UnderComp();
      String string0 = EWrapperMsgGenerator.deltaNeutralValidation(5307, underComp0);
      assertEquals("id = 5307 underComp.conId =0 underComp.delta =0.0 underComp.price =0.0", string0);
  }

  /**
  //Test case number: 8
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Contract contract0 = new Contract();
      String string0 = EWrapperMsgGenerator.contractMsg(contract0);
      assertEquals("conid = 0\nsymbol = null\nsecType = null\nexpiry = null\nstrike = 0.0\nright = null\nmultiplier = null\nexchange = null\nprimaryExch = null\ncurrency = null\nlocalSymbol = null\n", string0);
  }

  /**
  //Test case number: 9
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      // Undeclared exception!
      try { 
        EWrapperMsgGenerator.updatePortfolio((Contract) null, 10, 4614, 1.0, 2211, 1.0, 2012.49223, (String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.ib.client.EWrapperMsgGenerator", e);
      }
  }

  /**
  //Test case number: 10
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      ContractDetails contractDetails0 = new ContractDetails((Contract) null, "(-T ,x!ns", "1", 742.8979877381221, "(-T ,x!ns", "", (-8), "", "", "A`N8/r&RFndl<.uh", "BAG", "closeEFP", "-", "", "BAG");
      // Undeclared exception!
      try { 
        EWrapperMsgGenerator.scannerData((-8), (-8), contractDetails0, (String) null, (String) null, "(-T ,x!ns", "BAG");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.ib.client.EWrapperMsgGenerator", e);
      }
  }

  /**
  //Test case number: 11
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Vector<String> vector0 = new Vector<String>();
      Contract contract0 = new Contract(2147483645, "s@~gwlj;H", ",f)a", "8?V=P?']sR|2UDq", (-4412.816), "  It does not support realtime bar data query cancellation.", "w1GV", (String) null, "5U:", "la#W2{P[N)f`)qJO,,", vector0, (String) null, false, "rB1alcK)", "Y`");
      Order order0 = new Order();
      // Undeclared exception!
      try { 
        EWrapperMsgGenerator.openOrder(757, contract0, order0, (OrderState) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.ib.client.EWrapperMsgGenerator", e);
      }
  }

  /**
  //Test case number: 12
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      // Undeclared exception!
      try { 
        EWrapperMsgGenerator.fundamentalData((-47), (String) null);
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
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      ContractDetails contractDetails0 = new ContractDetails((Contract) null, " expiry=", "7_t4|O6E", 0.0, "=NDQT\"", "com.ib.client.Execution", (-1376), "0+#VJrbi?x?{", "-P0AYo94?61./BuE", " expiry=", "={JdH/=", "current time = -3288 (Dec 31, 1969 11:05:12 PM)", "**(&-S-f8x_C!E/i", "0+#VJrbi?x?{", "current time = -3288 (Dec 31, 1969 11:05:12 PM)");
      // Undeclared exception!
      try { 
        EWrapperMsgGenerator.contractDetails(1994091958, contractDetails0);
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
      ContractDetails contractDetails0 = new ContractDetails((Contract) null, "id=-8  unknown: vol = N/A delta = N/A", "id=-8  unknown: vol = N/A delta = N/A", 0.0, "", "com.ib.client.Execution", (-8), "/B4Ho|6UiP#l", "/B4Ho|6UiP#l", "1EqO[!-,N54Pel", " localSymbol=", "UM(Kk9", "UM(Kk9", "id=-8  unknown: vol = N/A delta = N/A", (String) null);
      // Undeclared exception!
      try { 
        EWrapperMsgGenerator.bondContractDetails(0, contractDetails0);
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
  //Test case number: 16
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Order order0 = new Order();
      OrderState orderState0 = new OrderState();
      order0.m_algoStrategy = "s|3\"z^/)~x";
      Contract contract0 = new Contract();
      String string0 = EWrapperMsgGenerator.openOrder(13, contract0, order0, orderState0);
      assertNotNull(string0);
  }

  /**
  //Test case number: 17
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Vector<String> vector0 = new Vector<String>();
      Contract contract0 = new Contract((-8), "s'_c/zjb~Tcp5=`&-FC", "BAG", "BAG", (-8), (String) null, "s'_c/zjb~Tcp5=`&-FC", "BAG", (String) null, "BAG", vector0, "DKo8Xw}=S:P", false, "~qDJh(je@", "e!H{gUd");
      UnderComp underComp0 = new UnderComp();
      contract0.m_underComp = underComp0;
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
      Vector<String> vector0 = new Vector<String>();
      Contract contract0 = new Contract((-8), "s'_c/zjb~Tcp5=`&-FC", "BAG", "BAG", (-8), (String) null, "s'_c/zjb~Tcp5=`&-FC", "BAG", (String) null, "BAG", vector0, "DKo8Xw}=S:P", false, "~qDJh(je@", "e!H{gUd");
      Order order0 = new Order();
      contract0.m_comboLegsDescrip = "  It does not support fundamental data requests.";
      OrderState orderState0 = new OrderState();
      String string0 = EWrapperMsgGenerator.openOrder((-4087), contract0, order0, orderState0);
      assertNotNull(string0);
  }

  /**
  //Test case number: 19
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.tickOptionComputation(0, 13, 2045.538822185749, 1.7976931348623157E308, 1.7976931348623157E308, 1.7976931348623157E308);
      assertEquals("id=0  modelOptComp: vol = 2045.538822185749 delta = N/A: modelPrice = N/A: pvDividend = N/A", string0);
  }

  /**
  //Test case number: 20
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.tickOptionComputation(956, 13, 2045.538822185749, 1.7976931348623157E308, 1.7976931348623157E308, 0.0);
      assertEquals("id=956  modelOptComp: vol = 2045.538822185749 delta = N/A: modelPrice = N/A: pvDividend = 0.0", string0);
  }

  /**
  //Test case number: 21
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.tickOptionComputation((-291), 13, (-1794.0), 43, (-1794.0), (-291));
      assertEquals("id=-291  modelOptComp: vol = N/A delta = N/A: modelPrice = N/A: pvDividend = N/A", string0);
  }

  /**
  //Test case number: 22
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.tickOptionComputation(0, 13, 1829.0, 13.0, 'y', 1715.0);
      assertEquals("id=0  modelOptComp: vol = 1829.0 delta = N/A: modelPrice = 121.0: pvDividend = 1715.0", string0);
  }

  /**
  //Test case number: 23
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.tickOptionComputation((-8), (-8), 1.7976931348623157E308, 742.8979877381221, 742.8979877381221, (-8));
      assertEquals("id=-8  unknown: vol = N/A delta = N/A", string0);
  }

  /**
  //Test case number: 24
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.tickOptionComputation(1, 0, 1.0, 1.0, 1.0, 1.0);
      assertEquals("id=1  bidSize: vol = 1.0 delta = 1.0", string0);
  }

  /**
  //Test case number: 25
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.tickOptionComputation(3932, 21, (-8), (-1.0), 2169.6315803, 1655.81);
      assertEquals("id=3932  AvgVolume: vol = N/A delta = -1.0", string0);
  }

  /**
  //Test case number: 26
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.tickPrice(448, 13, (-3680.464136617339), 1);
      assertEquals("id=448  modelOptComp=-3680.464136617339  canAutoExecute", string0);
  }

  /**
  //Test case number: 27
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.tickPrice(121, 3, 598.9290642005, 0);
      assertEquals("id=121  askSize=598.9290642005  noAutoExecute", string0);
  }

  /**
  //Test case number: 28
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.updateMktDepth(10, Integer.MAX_VALUE, 0, (-1), (-1438.97029557), (-2936));
      assertEquals("updateMktDepth: 10 2147483647 0 -1 -1438.97029557 -2936", string0);
  }

  /**
  //Test case number: 29
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.tickString(0, 1, "");
      assertEquals("id=0  bidPrice=", string0);
  }

  /**
  //Test case number: 30
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      // Undeclared exception!
      try { 
        EWrapperMsgGenerator.deltaNeutralValidation(30, (UnderComp) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.ib.client.EWrapperMsgGenerator", e);
      }
  }

  /**
  //Test case number: 31
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.updateNewsBulletin(2145765386, 30, ".(>/y?ShUutuO# ", "~r:f_V8nd6DN-m");
      assertEquals("MsgId=2145765386 :: MsgType=30 :: Origin=~r:f_V8nd6DN-m :: Message=.(>/y?ShUutuO# ", string0);
  }

  /**
  //Test case number: 32
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.fundamentalData((-47), "}Zb)<OC3!&Kx*o");
      assertEquals("id  = -47 len = 14\n}Zb)<OC3!&Kx*o", string0);
  }

  /**
  //Test case number: 33
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      Contract contract0 = new Contract();
      String string0 = EWrapperMsgGenerator.updatePortfolio(contract0, 1, 542.85518, 1.7976931348623157E308, (-735.8698584445247), (-3284.0), 0.0, (String) null);
      assertEquals("updatePortfolio: conid = 0\nsymbol = null\nsecType = null\nexpiry = null\nstrike = 0.0\nright = null\nmultiplier = null\nexchange = null\nprimaryExch = null\ncurrency = null\nlocalSymbol = null\n1 542.85518 1.7976931348623157E308 -735.8698584445247 -3284.0 0.0 null", string0);
      assertNotNull(string0);
  }

  /**
  //Test case number: 34
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.updateAccountValue("com.ib.client.ContractDetails", "w%$w)HA", (String) null, "V|I(,)I#fD%jxw#P");
      assertEquals("updateAccountValue: com.ib.client.ContractDetails w%$w)HA null V|I(,)I#fD%jxw#P", string0);
  }

  /**
  //Test case number: 35
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.receiveFA(366, "5U:");
      assertEquals("FA: null 5U:", string0);
  }

  /**
  //Test case number: 36
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.contractDetailsEnd((-3288));
      assertEquals("reqId = -3288 =============== end ===============", string0);
  }

  /**
  //Test case number: 37
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.tickSnapshotEnd((-3126));
      assertEquals("id=-3126 =============== end ===============", string0);
  }

  /**
  //Test case number: 38
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.orderStatus(1774, "  It does not support notHeld parameter.", 1472, 1496, (-776.061122), (-923), (-4319), 19.0, 2085, (String) null);
      assertEquals("order status: orderId=1774 clientId=2085 permId=-923 status=  It does not support notHeld parameter. filled=1472 remaining=1496 avgFillPrice=-776.061122 lastFillPrice=19.0 parent Id=-4319 whyHeld=null", string0);
  }

  /**
  //Test case number: 39
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.scannerDataEnd(7069);
      assertEquals("id = 7069 =============== end ===============", string0);
  }

  /**
  //Test case number: 40
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.tickGeneric((-2702), Integer.MAX_VALUE, (-1150.0));
      assertEquals("id=-2702  unknown=-1150.0", string0);
  }

  /**
  //Test case number: 41
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.managedAccounts((String) null);
      assertEquals("Connected : The list of managed accounts are : [null]", string0);
  }

  /**
  //Test case number: 42
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      EWrapperMsgGenerator eWrapperMsgGenerator0 = new EWrapperMsgGenerator();
      assertEquals(" =============== end ===============", eWrapperMsgGenerator0.openOrderEnd());
  }

  /**
  //Test case number: 43
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      ContractDetails contractDetails0 = new ContractDetails();
      String string0 = EWrapperMsgGenerator.contractDetails(2794, contractDetails0);
      assertEquals("reqId = 2794 ===================================\n ---- Contract Details begin ----\nconid = 0\nsymbol = null\nsecType = null\nexpiry = null\nstrike = 0.0\nright = null\nmultiplier = null\nexchange = null\nprimaryExch = null\ncurrency = null\nlocalSymbol = null\nmarketName = null\ntradingClass = null\nminTick = 0.0\nprice magnifier = 0\norderTypes = null\nvalidExchanges = null\nunderConId = 0\nlongName = null\ncontractMonth = null\nindustry = null\ncategory = null\nsubcategory = null\ntimeZoneId = null\ntradingHours = null\nliquidHours = null\n ---- Contract Details End ----\n", string0);
  }

  /**
  //Test case number: 44
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.accountDownloadEnd("MsgId=10 :: MsgType=4614 :: Origin=gg l :: Message=gg l");
      assertEquals("accountDownloadEnd: MsgId=10 :: MsgType=4614 :: Origin=gg l :: Message=gg l", string0);
  }

  /**
  //Test case number: 45
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.updateMktDepthL2(2260, 1865, "low", (-2146226886), (-2146226886), 1.0, (-2146226886));
      assertEquals("updateMktDepth: 2260 1865 low -2146226886 -2146226886 1.0 -2146226886", string0);
  }

  /**
  //Test case number: 46
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      ContractDetails contractDetails0 = new ContractDetails();
      String string0 = EWrapperMsgGenerator.bondContractDetails(1673, contractDetails0);
      assertEquals("reqId = 1673 ===================================\n ---- Bond Contract Details begin ----\nsymbol = null\nsecType = null\ncusip = null\ncoupon = 0.0\nmaturity = null\nissueDate = null\nratings = null\nbondType = null\ncouponType = null\nconvertible = false\ncallable = false\nputable = false\ndescAppend = null\nexchange = null\ncurrency = null\nmarketName = null\ntradingClass = null\nconid = 0\nminTick = 0.0\norderTypes = null\nvalidExchanges = null\nnextOptionDate = null\nnextOptionType = null\nnextOptionPartial = false\nnotes = null\nlongName = null\n ---- Bond Contract Details End ----\n", string0);
  }

  /**
  //Test case number: 47
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      Vector<String> vector0 = new Vector<String>();
      Contract contract0 = new Contract(108, "BAG", "FKo", "BAG", 1.7976931348623157E308, (String) null, "N!Vm0FB/l)nahkb}V~", "Connection Closed", (String) null, "FKo", vector0, "Connection Closed", true, "]+,ltN,}", "p{ QoQYeOvej4g*;dz");
      ContractDetails contractDetails0 = new ContractDetails(contract0, "Connection Closed", "Connection Closed", (-1071.900682), "]+,ltN,}", "N!Vm0FB/l)nahkb}V~", 1073741824, "Connection Closed", "B@l5o9?!TUd", "Ktaa$/%c0|.}", "d6/7yMl", "0'.*=sF:*`}6\"#Bf==0", "BAG", "OptionPutVolume", "OptionPutVolume");
      String string0 = EWrapperMsgGenerator.scannerData(Integer.MAX_VALUE, 108, contractDetails0, "", "Connection Closed", "longName = ", " dividends to expiry = ");
      assertEquals("id = 2147483647 rank=108 symbol=BAG secType=FKo expiry=BAG strike=1.7976931348623157E308 right=null exchange=Connection Closed currency=null localSymbol=FKo marketName=Connection Closed tradingClass=Connection Closed distance= benchmark=Connection Closed projection=longName =  legsStr= dividends to expiry = ", string0);
  }

  /**
  //Test case number: 48
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.realtimeBar((-1259), (-1259), (-1259), (-754.4634441546452), 1.7976931348623157E308, 8.0, (-1620351321), 1290.313441, 531);
      assertEquals("id=-1259 time = -1259 open=-1259.0 high=-754.4634441546452 low=1.7976931348623157E308 close=8.0 volume=-1620351321 count=531 WAP=1290.313441", string0);
  }

  /**
  //Test case number: 49
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.nextValidId(2260);
      assertEquals("Next Valid Order ID: 2260", string0);
  }

  /**
  //Test case number: 50
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.execDetailsEnd(13);
      assertEquals("reqId = 13 =============== end ===============", string0);
  }

  /**
  //Test case number: 51
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.currentTime((-3288));
      assertEquals("current time = -3288 (Dec 31, 1969 11:05:12 PM)", string0);
  }

  /**
  //Test case number: 52
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.openOrderEnd();
      assertEquals(" =============== end ===============", string0);
  }

  /**
  //Test case number: 53
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.tickEFP(0, 63, 63, (String) null, 0, 0, "com.ib.client.Execution", 63, (-1.0));
      assertEquals("id=0  unknown: basisPoints = 63.0/null impliedFuture = 0.0 holdDays = 0 futureExpiry = com.ib.client.Execution dividendImpact = 63.0 dividends to expiry = -1.0", string0);
  }

  /**
  //Test case number: 54
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      Execution execution0 = new Execution(10, 13, "O_~{KmMBrZpQ~z\". Jw", "O_~{KmMBrZpQ~z\". Jw", "O_~{KmMBrZpQ~z\". Jw", "O_~{KmMBrZpQ~z\". Jw", "O_~{KmMBrZpQ~z\". Jw", 13, 13, 13, 13, 13, 1.0);
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
  //Test case number: 55
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.tickSize((-8), 13, (-1));
      assertEquals("id=-8  modelOptComp=-1", string0);
  }

  /**
  //Test case number: 56
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test56()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.scannerParameters("zHnen!WVlJ");
      assertEquals("SCANNER PARAMETERS:\nzHnen!WVlJ", string0);
  }

  /**
  //Test case number: 57
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test57()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.historicalData(3, "Lze)JJBHaD;,(tX[", 3, 59.0, 3, 3, 3, 3219, 3219, false);
      assertEquals("id=3 date = Lze)JJBHaD;,(tX[ open=3.0 high=59.0 low=3.0 close=3.0 volume=3 count=3219 WAP=3219.0 hasGaps=false", string0);
  }

  /**
  //Test case number: 58
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test58()  throws Throwable  {
      String string0 = EWrapperMsgGenerator.updateAccountTime((String) null);
      assertEquals("updateAccountTime: null", string0);
  }
}
