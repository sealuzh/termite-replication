/*
 * This file was automatically generated by EvoSuite
 * Mon Nov 18 16:13:34 GMT 2019
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
  /*Coverage entropy=1.4942662253853725
  */
  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      EvoSuiteURL evoSuiteURL0 = new EvoSuiteURL("http://7AXd=n'L#A\"2CUm:0");
      NetworkHandling.createRemoteTextFile(evoSuiteURL0, "bEAG*");
      Services.HTTP_Result services_HTTP_Result0 = Services.testHTTP("7AXd=n'L#A\"2CUm", 0);
      assertTrue(services_HTTP_Result0.works);
      assertEquals(6, services_HTTP_Result0.page_weight);
      
      Services.HTTP_Result services_HTTP_Result1 = Services.testHTTP((String) null, 0);
      assertFalse(services_HTTP_Result1.works);
      assertEquals(0, services_HTTP_Result1.page_weight);
      assertEquals(0, services_HTTP_Result1.code);
      assertEquals(0L, services_HTTP_Result1.time);
  }

  /**
  //Test case number: 1
  /*Coverage entropy=1.166831391086261
  */
  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      byte[] byteArray0 = new byte[7];
      byteArray0[0] = (byte) (-1);
      EvoSuiteRemoteAddress evoSuiteRemoteAddress0 = new EvoSuiteRemoteAddress("200.42.42.0", 1773);
      NetworkHandling.openRemoteTcpServer(evoSuiteRemoteAddress0);
      EvoSuiteRemoteAddress evoSuiteRemoteAddress1 = new EvoSuiteRemoteAddress("", 12345);
      NetworkHandling.openRemoteTcpServer(evoSuiteRemoteAddress1);
      byte[] byteArray1 = new byte[7];
      byteArray1[0] = (byte) (-1);
      byteArray1[1] = (byte) (-1);
      EvoSuiteRemoteAddress evoSuiteRemoteAddress2 = new EvoSuiteRemoteAddress("", 12345);
      NetworkHandling.openRemoteTcpServer(evoSuiteRemoteAddress2);
      EvoSuiteRemoteAddress evoSuiteRemoteAddress3 = new EvoSuiteRemoteAddress("", 12345);
      NetworkHandling.openRemoteTcpServer(evoSuiteRemoteAddress3);
      NetworkHandling.sendDataOnTcp((EvoSuiteLocalAddress) null, (byte[]) null);
      NetworkHandling.createRemoteTextFile((EvoSuiteURL) null, "oB(='qU~O/");
      Services.testSMTP("CF5BNcE%D_", 1773);
      Services.testSMTP("CF5BNcE%D_", (byte) (-1));
      Services.SIMPLE_Result services_SIMPLE_Result0 = Services.testSMTP("oB(='qU~O/", 0);
      assertFalse(services_SIMPLE_Result0.works);
      assertEquals(0L, services_SIMPLE_Result0.time);
  }

  /**
  //Test case number: 2
  /*Coverage entropy=1.1217186091313738
  */
  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      EvoSuiteRemoteAddress evoSuiteRemoteAddress0 = new EvoSuiteRemoteAddress("200.42.42.0", 1);
      NetworkHandling.openRemoteTcpServer(evoSuiteRemoteAddress0);
      byte[] byteArray0 = new byte[7];
      byteArray0[0] = (byte) (-1);
      byte[] byteArray1 = new byte[7];
      byteArray1[0] = (byte) (-1);
      byteArray1[1] = (byte) (-1);
      NetworkHandling.sendDataOnTcp((EvoSuiteLocalAddress) null, byteArray1);
      NetworkHandling.sendDataOnTcp((EvoSuiteLocalAddress) null, byteArray1);
      NetworkHandling.createRemoteTextFile((EvoSuiteURL) null, "?|Biv");
      NetworkHandling.sendDataOnTcp((EvoSuiteLocalAddress) null, (byte[]) null);
      NetworkHandling.createRemoteTextFile((EvoSuiteURL) null, (String) null);
      Services.SIMPLE_Result services_SIMPLE_Result0 = Services.testPOP3("1'kM#P`vc", 1);
      assertFalse(services_SIMPLE_Result0.works);
      assertEquals(0L, services_SIMPLE_Result0.time);
  }

  /**
  //Test case number: 3
  /*Coverage entropy=2.86271545302801
  */
  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      Services.HTTP_Result services_HTTP_Result0 = Services.testHTTPS("kswW3*UEi", 0);
      services_HTTP_Result0.page_weight = 0;
      services_HTTP_Result0.Error = "kswW3*UEi";
      EvoSuiteURL evoSuiteURL0 = new EvoSuiteURL("https://\\)5]tT0+:0");
      NetworkHandling.createRemoteTextFile(evoSuiteURL0, "QUIT\r\n");
      Services.SIMPLE_Result services_SIMPLE_Result0 = Services.testSMTP("kswW3*UEi", (-982));
      Services services0 = new Services();
      Services.testSMTP("kswW3*UEi", 695);
      Services.testHTTP("kswW3*UEi", 0);
      Services.testHTTPS("q/63", (-506));
      services_SIMPLE_Result0.toString();
      Services.testHTTPS(")5]tT0+", 0);
      services_HTTP_Result0.toString();
      services_SIMPLE_Result0.reset();
      Services.testHTTP("", (-2541));
      Services.HTTP_Result services_HTTP_Result1 = Services.testHTTPS("", 0);
      services_HTTP_Result1.toString();
      Services.testPOP3("", 0);
      services_HTTP_Result1.time = (long) 0;
      Services.testPOP3("**Erreur d'E/S** (org.evosuite.runtime.mock.java.lang.MockThrowable: Could not find: ) **", (-1657));
      Services.testSMTP("**URL Mal Form\u00E9** (java.net.MalformedURLException: Invalid port number :-2541) **", (-982));
      System.setCurrentTimeMillis(0);
  }

  /**
  //Test case number: 4
  /*Coverage entropy=1.5271837172395382
  */
  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      Services.HTTP_Result services_HTTP_Result0 = Services.testHTTPS((String) null, (-3511));
      assertEquals(0, services_HTTP_Result0.page_weight);
      assertEquals(0, services_HTTP_Result0.code);
      assertFalse(services_HTTP_Result0.works);
      assertEquals(0L, services_HTTP_Result0.time);
  }

  /**
  //Test case number: 5
  /*Coverage entropy=1.5271837172395382
  */
  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      Services.HTTP_Result services_HTTP_Result0 = new Services.HTTP_Result();
      services_HTTP_Result0.page_weight = (-1);
      services_HTTP_Result0.page_weight = (-1);
      services_HTTP_Result0.page_weight = (-1);
      services_HTTP_Result0.page_weight = (-45);
      services_HTTP_Result0.time = (long) (-1);
      services_HTTP_Result0.works = false;
      services_HTTP_Result0.page_weight = 1;
      services_HTTP_Result0.toString();
      services_HTTP_Result0.reset();
      assertEquals(0L, services_HTTP_Result0.time);
  }

  /**
  //Test case number: 6
  /*Coverage entropy=2.253297930766516
  */
  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      EvoSuiteRemoteAddress evoSuiteRemoteAddress0 = new EvoSuiteRemoteAddress("", 12345);
      NetworkHandling.openRemoteTcpServer(evoSuiteRemoteAddress0);
      Services.SIMPLE_Result services_SIMPLE_Result0 = Services.testPOP3("zI,#3$y~x['*TgpfKj", 1984);
      assertEquals(0L, services_SIMPLE_Result0.time);
      assertFalse(services_SIMPLE_Result0.works);
      
      EvoSuiteLocalAddress evoSuiteLocalAddress0 = new EvoSuiteLocalAddress("192.168.1.42", 40001);
      byte[] byteArray0 = new byte[3];
      byteArray0[0] = (byte)65;
      byteArray0[1] = (byte)0;
      byteArray0[2] = (byte) (-72);
      NetworkHandling.sendDataOnTcp(evoSuiteLocalAddress0, byteArray0);
      EvoSuiteRemoteAddress evoSuiteRemoteAddress1 = new EvoSuiteRemoteAddress(" ms\n", 12345);
      NetworkHandling.openRemoteTcpServer(evoSuiteRemoteAddress0);
      NetworkHandling.openRemoteTcpServer(evoSuiteRemoteAddress1);
      EvoSuiteRemoteAddress evoSuiteRemoteAddress2 = new EvoSuiteRemoteAddress("", 12345);
      NetworkHandling.openRemoteTcpServer(evoSuiteRemoteAddress1);
      NetworkHandling.createRemoteTextFile((EvoSuiteURL) null, (String) null);
      NetworkHandling.openRemoteTcpServer(evoSuiteRemoteAddress2);
      NetworkHandling.openRemoteTcpServer(evoSuiteRemoteAddress0);
      NetworkHandling.createRemoteTextFile((EvoSuiteURL) null, "f-1e10L2p~qK7X=1?");
      EvoSuiteRemoteAddress evoSuiteRemoteAddress3 = new EvoSuiteRemoteAddress("**** Resultat : \n** Fonctionnement : ", 12345);
      NetworkHandling.openRemoteTcpServer(evoSuiteRemoteAddress3);
      Services.HTTP_Result services_HTTP_Result0 = new Services.HTTP_Result();
      String string0 = services_HTTP_Result0.toString();
      assertEquals("**** Resultat : \n** Fonctionnement : false\n** Temps : 0 ms\n** Poid de la page : 0 octets\n** Code de page : 0\n** Erreur g\u00E9n\u00E9r\u00E9e : .\n****", string0);
      
      services_HTTP_Result0.reset();
      assertFalse(services_HTTP_Result0.works);
      assertEquals(0, services_HTTP_Result0.code);
      assertEquals(0L, services_HTTP_Result0.time);
      assertEquals(0, services_HTTP_Result0.page_weight);
  }

  /**
  //Test case number: 7
  /*Coverage entropy=1.543056733112554
  */
  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      Services.SIMPLE_Result services_SIMPLE_Result0 = new Services.SIMPLE_Result();
      String string0 = services_SIMPLE_Result0.toString();
      assertEquals("**** Resultat : \n** Fonctionnement : false\n** Temps : 0 ms\n** Erreur g\u00E9n\u00E9r\u00E9e : .\n****", string0);
      
      services_SIMPLE_Result0.reset();
      services_SIMPLE_Result0.reset();
      assertEquals(0L, services_SIMPLE_Result0.time);
      assertFalse(services_SIMPLE_Result0.works);
  }
}
