/*
 * This file was automatically generated by EvoSuite
 * Mon Nov 18 11:34:22 GMT 2019
 */


import org.junit.Test;
import static org.junit.Assert.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.System;
import org.evosuite.runtime.testdata.EvoSuiteLocalAddress;
import org.evosuite.runtime.testdata.EvoSuiteRemoteAddress;
import org.evosuite.runtime.testdata.EvoSuiteURL;
import org.evosuite.runtime.testdata.NetworkHandling;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class Services_ESTest extends Services_ESTest_scaffolding {

  /**
  //Test case number: 0
  /*Coverage entropy=2.2261289670319746
  */
  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      EvoSuiteURL evoSuiteURL0 = new EvoSuiteURL("https://74*:3570");
      NetworkHandling.createRemoteTextFile(evoSuiteURL0, "mLlF:nO0{-");
      Services.testPOP3("<ehmaIWlS+,'>>(h~s", 3570);
      Services.testSMTP("4%&", 0);
      EvoSuiteURL evoSuiteURL1 = new EvoSuiteURL("https://:0");
      NetworkHandling.createRemoteTextFile(evoSuiteURL1, "Y,");
      Services.SIMPLE_Result services_SIMPLE_Result0 = Services.testPOP3(" fe`NP|x=Id=k,k|", 3570);
      assertFalse(services_SIMPLE_Result0.works);
      assertEquals(0L, services_SIMPLE_Result0.time);
      
      EvoSuiteLocalAddress evoSuiteLocalAddress0 = new EvoSuiteLocalAddress("192.168.1.42", 40000);
      byte[] byteArray0 = new byte[6];
      byteArray0[0] = (byte)0;
      byteArray0[1] = (byte)0;
      byteArray0[2] = (byte)1;
      byteArray0[3] = (byte)0;
      byteArray0[4] = (byte)64;
      byteArray0[5] = (byte) (-106);
      NetworkHandling.sendDataOnTcp(evoSuiteLocalAddress0, byteArray0);
      EvoSuiteLocalAddress evoSuiteLocalAddress1 = new EvoSuiteLocalAddress("192.168.1.42", 40002);
      byte[] byteArray1 = new byte[0];
      NetworkHandling.sendDataOnTcp(evoSuiteLocalAddress1, byteArray1);
      Services.HTTP_Result services_HTTP_Result0 = Services.testHTTPS("74*", 3570);
      assertTrue(services_HTTP_Result0.works);
      assertEquals(11, services_HTTP_Result0.page_weight);
  }

  /**
  //Test case number: 1
  /*Coverage entropy=1.1217186091313738
  */
  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      EvoSuiteRemoteAddress evoSuiteRemoteAddress0 = new EvoSuiteRemoteAddress("200.42.42.0", 103);
      NetworkHandling.openRemoteTcpServer(evoSuiteRemoteAddress0);
      Services.SIMPLE_Result services_SIMPLE_Result0 = Services.testSMTP(":mUuKXZl_oQN4d38}", 103);
      assertFalse(services_SIMPLE_Result0.works);
      assertEquals(0L, services_SIMPLE_Result0.time);
  }

  /**
  //Test case number: 2
  /*Coverage entropy=1.5271837172395382
  */
  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      EvoSuiteRemoteAddress evoSuiteRemoteAddress0 = new EvoSuiteRemoteAddress("200.42.42.0", 762);
      NetworkHandling.openRemoteTcpServer(evoSuiteRemoteAddress0);
      Services.SIMPLE_Result services_SIMPLE_Result0 = Services.testPOP3("e- ", 762);
      assertFalse(services_SIMPLE_Result0.works);
      assertEquals(0L, services_SIMPLE_Result0.time);
  }

  /**
  //Test case number: 3
  /*Coverage entropy=1.0365141682948127
  */
  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      EvoSuiteURL evoSuiteURL0 = new EvoSuiteURL("http://**R\u00E9ponse du serveur incorrect**:2377");
      NetworkHandling.createRemoteTextFile(evoSuiteURL0, "G");
      Services.HTTP_Result services_HTTP_Result0 = Services.testHTTP("**R\u00E9ponse du serveur incorrect**", 2377);
      assertEquals(2, services_HTTP_Result0.page_weight);
      assertTrue(services_HTTP_Result0.works);
  }

  /**
  //Test case number: 4
  /*Coverage entropy=1.5271837172395382
  */
  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Services.HTTP_Result services_HTTP_Result0 = Services.testHTTPS((String) null, (-2396));
      assertEquals(0L, services_HTTP_Result0.time);
      assertEquals(0, services_HTTP_Result0.page_weight);
      assertEquals(0, services_HTTP_Result0.code);
      assertFalse(services_HTTP_Result0.works);
  }

  /**
  //Test case number: 5
  /*Coverage entropy=1.5271837172395382
  */
  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Services.HTTP_Result services_HTTP_Result0 = Services.testHTTP("**R\u00E9ponse du serveur incor^ect**", 2377);
      assertEquals(0L, services_HTTP_Result0.time);
      assertEquals(0, services_HTTP_Result0.page_weight);
      assertEquals(0, services_HTTP_Result0.code);
      assertFalse(services_HTTP_Result0.works);
  }

  /**
  //Test case number: 6
  /*Coverage entropy=1.543056733112554
  */
  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      System.setCurrentTimeMillis((byte) (-2));
      System.setCurrentTimeMillis((byte) (-2));
      System.setCurrentTimeMillis((byte) (-2));
      System.setCurrentTimeMillis((byte) (-2));
      System.setCurrentTimeMillis((byte) (-2));
      System.setCurrentTimeMillis((byte) (-2));
      System.setCurrentTimeMillis((byte) (-2));
      System.setCurrentTimeMillis((byte) (-2));
      System.setCurrentTimeMillis((byte) (-2));
      System.setCurrentTimeMillis(819L);
      Services.SIMPLE_Result services_SIMPLE_Result0 = Services.testSMTP("z$g:m4)1>zHFxSa", (byte) (-2));
      services_SIMPLE_Result0.reset();
      System.setCurrentTimeMillis((byte) (-2));
      System.setCurrentTimeMillis((-2870L));
      System.setCurrentTimeMillis((-2870L));
      System.setCurrentTimeMillis((byte) (-2));
      System.setCurrentTimeMillis((-360L));
      System.setCurrentTimeMillis((-360L));
      System.setCurrentTimeMillis((byte) (-2));
      System.setCurrentTimeMillis((byte) (-2));
      System.setCurrentTimeMillis((-1026L));
      System.setCurrentTimeMillis((byte) (-2));
      System.setCurrentTimeMillis((byte) (-2));
      System.setCurrentTimeMillis(0L);
      System.setCurrentTimeMillis(0L);
      System.setCurrentTimeMillis((byte) (-2));
      System.setCurrentTimeMillis(819L);
      System.setCurrentTimeMillis((byte) (-2));
      System.setCurrentTimeMillis((-2122L));
  }

  /**
  //Test case number: 7
  /*Coverage entropy=0.3333333333333333
  */
  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Services.SIMPLE_Result services_SIMPLE_Result0 = new Services.SIMPLE_Result();
      assertEquals(0L, services_SIMPLE_Result0.time);
      assertFalse(services_SIMPLE_Result0.works);
  }

  /**
  //Test case number: 8
  /*Coverage entropy=1.5271837172395382
  */
  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Services.HTTP_Result services_HTTP_Result0 = Services.testHTTP("]P8LV;$~X:X$=Wr#F!", (-3346));
      assertEquals(0L, services_HTTP_Result0.time);
      assertEquals(0, services_HTTP_Result0.page_weight);
      assertEquals(0, services_HTTP_Result0.code);
      assertFalse(services_HTTP_Result0.works);
  }

  /**
  //Test case number: 9
  /*Coverage entropy=1.5271837172395382
  */
  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      System.setCurrentTimeMillis(3046L);
      System.setCurrentTimeMillis(3046L);
      System.setCurrentTimeMillis(3046L);
      System.setCurrentTimeMillis((-4593L));
      System.setCurrentTimeMillis(1L);
      System.setCurrentTimeMillis((-1L));
      System.setCurrentTimeMillis((-1558L));
      System.setCurrentTimeMillis(1L);
      System.setCurrentTimeMillis(0L);
      System.setCurrentTimeMillis(3046L);
      System.setCurrentTimeMillis((-53L));
      System.setCurrentTimeMillis(1939L);
      System.setCurrentTimeMillis(1L);
      System.setCurrentTimeMillis((-659L));
      System.setCurrentTimeMillis(0L);
      Services.testHTTP((String) null, 1);
      System.setCurrentTimeMillis(1237L);
      System.setCurrentTimeMillis((-4593L));
      System.setCurrentTimeMillis(0L);
  }

  /**
  //Test case number: 10
  /*Coverage entropy=1.5271837172395382
  */
  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Services.HTTP_Result services_HTTP_Result0 = Services.testHTTPS("", 0);
      assertEquals(0, services_HTTP_Result0.code);
      assertEquals(0, services_HTTP_Result0.page_weight);
      assertFalse(services_HTTP_Result0.works);
      assertEquals(0L, services_HTTP_Result0.time);
  }

  /**
  //Test case number: 11
  /*Coverage entropy=1.8529610277865571
  */
  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      System.setCurrentTimeMillis(0L);
      System.setCurrentTimeMillis((byte)0);
      System.setCurrentTimeMillis((-211L));
      System.setCurrentTimeMillis((byte)0);
      System.setCurrentTimeMillis(0L);
      System.setCurrentTimeMillis((byte)0);
      System.setCurrentTimeMillis(0L);
      System.setCurrentTimeMillis((-2312L));
      System.setCurrentTimeMillis(848L);
      System.setCurrentTimeMillis(5364L);
      System.setCurrentTimeMillis((byte)0);
      System.setCurrentTimeMillis(848L);
      Services.SIMPLE_Result services_SIMPLE_Result0 = Services.testSMTP("", (byte)0);
      System.setCurrentTimeMillis((-1L));
      System.setCurrentTimeMillis((-1L));
      System.setCurrentTimeMillis((-800L));
      services_SIMPLE_Result0.toString();
      System.setCurrentTimeMillis(3110L);
      System.setCurrentTimeMillis(1597L);
      System.setCurrentTimeMillis((-2312L));
      System.setCurrentTimeMillis((-800L));
      System.setCurrentTimeMillis(0L);
      System.setCurrentTimeMillis(587L);
      System.setCurrentTimeMillis(0L);
      System.setCurrentTimeMillis(0L);
      Services.SIMPLE_Result services_SIMPLE_Result1 = Services.testSMTP("+IY|IME./", 0);
      assertEquals(0L, services_SIMPLE_Result1.time);
      assertFalse(services_SIMPLE_Result1.works);
  }

  /**
  //Test case number: 12
  /*Coverage entropy=1.5271837172395382
  */
  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Services.SIMPLE_Result services_SIMPLE_Result0 = Services.testPOP3("9g0Dxui^_))K+IXPc T", (-2575));
      assertFalse(services_SIMPLE_Result0.works);
      assertEquals(0L, services_SIMPLE_Result0.time);
  }

  /**
  //Test case number: 13
  /*Coverage entropy=1.5271837172395382
  */
  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Services.HTTP_Result services_HTTP_Result0 = Services.testHTTPS("J6PKJ!=R\"lL({QdB!@", (-3333));
      assertEquals(0L, services_HTTP_Result0.time);
      assertEquals(0, services_HTTP_Result0.code);
      assertEquals(0, services_HTTP_Result0.page_weight);
      assertFalse(services_HTTP_Result0.works);
  }

  /**
  //Test case number: 14
  /*Coverage entropy=1.5271837172395382
  */
  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Services.HTTP_Result services_HTTP_Result0 = Services.testHTTPS("}%TzgulXFL\"<L5WZ", 0);
      assertEquals(0, services_HTTP_Result0.code);
      assertEquals(0, services_HTTP_Result0.page_weight);
      assertFalse(services_HTTP_Result0.works);
      assertEquals(0L, services_HTTP_Result0.time);
  }

  /**
  //Test case number: 15
  /*Coverage entropy=2.4241710186205303
  */
  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Services.HTTP_Result services_HTTP_Result0 = new Services.HTTP_Result();
      services_HTTP_Result0.reset();
      services_HTTP_Result0.Error = "ef$(*C";
      services_HTTP_Result0.code = 0;
      Services.HTTP_Result services_HTTP_Result1 = new Services.HTTP_Result();
      services_HTTP_Result1.page_weight = 0;
      services_HTTP_Result1.reset();
      services_HTTP_Result1.code = 1146;
      services_HTTP_Result1.time = 0L;
      services_HTTP_Result1.toString();
      services_HTTP_Result1.reset();
      assertEquals(0, services_HTTP_Result1.code);
      
      services_HTTP_Result0.reset();
      Services services0 = new Services();
      Services.SIMPLE_Result services_SIMPLE_Result0 = Services.testSMTP("", 1);
      assertFalse(services_SIMPLE_Result0.works);
  }
}
