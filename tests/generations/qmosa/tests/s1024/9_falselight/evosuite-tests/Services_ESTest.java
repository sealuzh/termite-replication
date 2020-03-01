/*
 * This file was automatically generated by EvoSuite
 * Tue Nov 19 10:32:01 GMT 2019
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
  /*Coverage entropy=1.1217186091313738
  */
  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      EvoSuiteRemoteAddress evoSuiteRemoteAddress0 = new EvoSuiteRemoteAddress("", 12345);
      NetworkHandling.openRemoteTcpServer(evoSuiteRemoteAddress0);
      EvoSuiteRemoteAddress evoSuiteRemoteAddress1 = new EvoSuiteRemoteAddress("127.0.0.1", 2323);
      NetworkHandling.openRemoteTcpServer(evoSuiteRemoteAddress1);
      NetworkHandling.openRemoteTcpServer(evoSuiteRemoteAddress1);
      NetworkHandling.sendMessageOnTcp((EvoSuiteLocalAddress) null, "**R\u00E9ponse du serveur incorrect**");
      NetworkHandling.sendMessageOnTcp((EvoSuiteLocalAddress) null, "");
      Services.SIMPLE_Result services_SIMPLE_Result0 = Services.testSMTP("", 2323);
      assertEquals(0L, services_SIMPLE_Result0.time);
      assertFalse(services_SIMPLE_Result0.works);
  }

  /**
  //Test case number: 1
  /*Coverage entropy=1.0365141682948127
  */
  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      EvoSuiteURL evoSuiteURL0 = new EvoSuiteURL("https://XEK4$m}aQoB*5(hSX:0");
      NetworkHandling.createRemoteTextFile(evoSuiteURL0, "H*>KWrs?vo$p4G");
      Services.HTTP_Result services_HTTP_Result0 = Services.testHTTPS("XEK4$m}aQoB*5(hSX", 0);
      assertTrue(services_HTTP_Result0.works);
      assertEquals(16, services_HTTP_Result0.page_weight);
  }

  /**
  //Test case number: 2
  /*Coverage entropy=1.0365141682948127
  */
  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      EvoSuiteURL evoSuiteURL0 = new EvoSuiteURL("http://pU");
      NetworkHandling.createRemoteTextFile(evoSuiteURL0, "pU");
      Services.HTTP_Result services_HTTP_Result0 = Services.testHTTP("pU", (-1));
      assertTrue(services_HTTP_Result0.works);
      assertEquals(3, services_HTTP_Result0.page_weight);
  }

  /**
  //Test case number: 3
  /*Coverage entropy=1.1217186091313738
  */
  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      EvoSuiteRemoteAddress evoSuiteRemoteAddress0 = new EvoSuiteRemoteAddress("", 12345);
      NetworkHandling.openRemoteTcpServer(evoSuiteRemoteAddress0);
      EvoSuiteRemoteAddress evoSuiteRemoteAddress1 = new EvoSuiteRemoteAddress("127.0.0.1", 2323);
      NetworkHandling.openRemoteTcpServer(evoSuiteRemoteAddress1);
      NetworkHandling.sendMessageOnTcp((EvoSuiteLocalAddress) null, "**R\u00E9ponse du serveur incorrect**");
      NetworkHandling.openRemoteTcpServer(evoSuiteRemoteAddress1);
      NetworkHandling.sendMessageOnTcp((EvoSuiteLocalAddress) null, "**R\u00E9ponse du serveur incorrect**");
      NetworkHandling.sendMessageOnTcp((EvoSuiteLocalAddress) null, "");
      Services.SIMPLE_Result services_SIMPLE_Result0 = Services.testPOP3("", 2323);
      assertEquals(0L, services_SIMPLE_Result0.time);
      assertFalse(services_SIMPLE_Result0.works);
  }

  /**
  //Test case number: 4
  /*Coverage entropy=1.5271837172395382
  */
  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Services.HTTP_Result services_HTTP_Result0 = Services.testHTTP((String) null, (-123));
      assertFalse(services_HTTP_Result0.works);
      assertEquals(0L, services_HTTP_Result0.time);
      assertEquals(0, services_HTTP_Result0.page_weight);
      assertEquals(0, services_HTTP_Result0.code);
  }

  /**
  //Test case number: 5
  /*Coverage entropy=1.5271837172395382
  */
  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Services.SIMPLE_Result services_SIMPLE_Result0 = Services.testPOP3("Cp.8'%TmRPLs(<~\"j$", (-123));
      assertEquals(0L, services_SIMPLE_Result0.time);
      assertFalse(services_SIMPLE_Result0.works);
  }

  /**
  //Test case number: 6
  /*Coverage entropy=1.5271837172395382
  */
  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Services.HTTP_Result services_HTTP_Result0 = Services.testHTTP("**Poid dela page : ", (-231));
      assertEquals(0, services_HTTP_Result0.code);
      assertFalse(services_HTTP_Result0.works);
      assertEquals(0L, services_HTTP_Result0.time);
      assertEquals(0, services_HTTP_Result0.page_weight);
  }

  /**
  //Test case number: 7
  /*Coverage entropy=0.3333333333333333
  */
  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      System.setCurrentTimeMillis(0);
      System.setCurrentTimeMillis(0);
      Services services0 = new Services();
      System.setCurrentTimeMillis(0L);
      System.setCurrentTimeMillis(0L);
      System.setCurrentTimeMillis(0L);
      System.setCurrentTimeMillis((-1L));
      System.setCurrentTimeMillis((-831L));
      System.setCurrentTimeMillis((-309L));
  }

  /**
  //Test case number: 8
  /*Coverage entropy=1.5271837172395382
  */
  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      System.setCurrentTimeMillis((-14));
      Services.testSMTP("", (-14));
      System.setCurrentTimeMillis((-14));
      System.setCurrentTimeMillis(0L);
      System.setCurrentTimeMillis((-3082L));
      System.setCurrentTimeMillis((-14));
      System.setCurrentTimeMillis((-1898L));
      System.setCurrentTimeMillis(0L);
      System.setCurrentTimeMillis((-3082L));
  }

  /**
  //Test case number: 9
  /*Coverage entropy=1.5271837172395382
  */
  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Services.HTTP_Result services_HTTP_Result0 = Services.testHTTP("Xy}UD'SCiN|nw/von", 26);
      assertEquals(0L, services_HTTP_Result0.time);
      assertEquals(0, services_HTTP_Result0.code);
      assertEquals(0, services_HTTP_Result0.page_weight);
      assertFalse(services_HTTP_Result0.works);
  }

  /**
  //Test case number: 10
  /*Coverage entropy=1.543056733112554
  */
  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Services.HTTP_Result services_HTTP_Result0 = new Services.HTTP_Result();
      services_HTTP_Result0.reset();
      assertFalse(services_HTTP_Result0.works);
      
      services_HTTP_Result0.time = 1456L;
      services_HTTP_Result0.works = true;
      services_HTTP_Result0.code = (-3019);
      services_HTTP_Result0.toString();
      Services.HTTP_Result services_HTTP_Result1 = new Services.HTTP_Result();
      assertEquals(0, services_HTTP_Result1.code);
  }

  /**
  //Test case number: 11
  /*Coverage entropy=2.267949945418531
  */
  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Services.HTTP_Result services_HTTP_Result0 = new Services.HTTP_Result();
      String string0 = services_HTTP_Result0.toString();
      assertEquals("**** Resultat : \n** Fonctionnement : false\n** Temps : 0 ms\n** Poid de la page : 0 octets\n** Code de page : 0\n** Erreur g\u00E9n\u00E9r\u00E9e : .\n****", string0);
      
      Services.SIMPLE_Result services_SIMPLE_Result0 = Services.testSMTP("**** Resultat : \n** Fonctionnement : false\n** Temps : 0 ms\n** Poid de la page : 0 octets\n** Code de page : 0\n** Erreur g\u00E9n\u00E9r\u00E9e : .\n****", 0);
      services_SIMPLE_Result0.reset();
      String string1 = services_SIMPLE_Result0.toString();
      assertEquals("**** Resultat : \n** Fonctionnement : false\n** Temps : 0 ms\n** Erreur g\u00E9n\u00E9r\u00E9e : .\n****", string1);
      
      services_SIMPLE_Result0.reset();
      Services.HTTP_Result services_HTTP_Result1 = new Services.HTTP_Result();
      Services.SIMPLE_Result services_SIMPLE_Result1 = new Services.SIMPLE_Result();
      assertEquals(0L, services_SIMPLE_Result1.time);
      assertFalse(services_SIMPLE_Result1.works);
  }

  /**
  //Test case number: 12
  /*Coverage entropy=1.5271837172395382
  */
  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Services.SIMPLE_Result services_SIMPLE_Result0 = Services.testPOP3(" su5mnW/oJBcc", 0);
      assertEquals(0L, services_SIMPLE_Result0.time);
      assertFalse(services_SIMPLE_Result0.works);
  }

  /**
  //Test case number: 13
  /*Coverage entropy=1.5271837172395382
  */
  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Services.SIMPLE_Result services_SIMPLE_Result0 = Services.testPOP3("QaDm3SrYFDwv7jAR4.)", 0);
      assertFalse(services_SIMPLE_Result0.works);
      assertEquals(0L, services_SIMPLE_Result0.time);
  }

  /**
  //Test case number: 14
  /*Coverage entropy=1.5271837172395382
  */
  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      System.setCurrentTimeMillis(0);
      System.setCurrentTimeMillis(0);
      System.setCurrentTimeMillis(0);
      System.setCurrentTimeMillis(0L);
      System.setCurrentTimeMillis(0L);
      System.setCurrentTimeMillis((-3519));
      System.setCurrentTimeMillis((-3104L));
      System.setCurrentTimeMillis((-3519));
      Services.HTTP_Result services_HTTP_Result0 = Services.testHTTPS("*:xwiTq%;Bi_rn", (-3519));
      assertEquals(0L, services_HTTP_Result0.time);
      assertEquals(0, services_HTTP_Result0.page_weight);
      assertFalse(services_HTTP_Result0.works);
      assertEquals(0, services_HTTP_Result0.code);
  }

  /**
  //Test case number: 15
  /*Coverage entropy=1.5271837172395382
  */
  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      System.setCurrentTimeMillis(1L);
      System.setCurrentTimeMillis(0L);
      System.setCurrentTimeMillis(0L);
      System.setCurrentTimeMillis(1);
      System.setCurrentTimeMillis((-15L));
      System.setCurrentTimeMillis(0L);
      System.setCurrentTimeMillis((-15L));
      System.setCurrentTimeMillis(0L);
      System.setCurrentTimeMillis((-265L));
      Services.HTTP_Result services_HTTP_Result0 = Services.testHTTPS((String) null, 1);
      assertEquals(0L, services_HTTP_Result0.time);
      assertFalse(services_HTTP_Result0.works);
      assertEquals(0, services_HTTP_Result0.code);
      assertEquals(0, services_HTTP_Result0.page_weight);
  }

  /**
  //Test case number: 16
  /*Coverage entropy=1.5271837172395382
  */
  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Services.HTTP_Result services_HTTP_Result0 = Services.testHTTPS("Lcf-[@uGilxG^!m", 1);
      assertEquals(0, services_HTTP_Result0.page_weight);
      assertEquals(0, services_HTTP_Result0.code);
      assertFalse(services_HTTP_Result0.works);
      assertEquals(0L, services_HTTP_Result0.time);
  }

  /**
  //Test case number: 17
  /*Coverage entropy=1.5271837172395382
  */
  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Services.HTTP_Result services_HTTP_Result0 = Services.testHTTPS("4jlW&aEnIlUJAIoT~u", (-123));
      assertEquals(0, services_HTTP_Result0.page_weight);
      assertFalse(services_HTTP_Result0.works);
      assertEquals(0, services_HTTP_Result0.code);
      assertEquals(0L, services_HTTP_Result0.time);
  }
}
