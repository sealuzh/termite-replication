/*
 * This file was automatically generated by EvoSuite
 * Thu Nov 14 21:12:25 GMT 2019
 */


import org.junit.Test;
import static org.junit.Assert.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.testdata.EvoSuiteRemoteAddress;
import org.evosuite.runtime.testdata.EvoSuiteURL;
import org.evosuite.runtime.testdata.NetworkHandling;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class Services_ESTest extends Services_ESTest_scaffolding {

  /**
  //Test case number: 0
  /*Coverage entropy=1.0365141682948127
  */
  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      EvoSuiteURL evoSuiteURL0 = new EvoSuiteURL("https://K&pCv<v{:0");
      NetworkHandling.createRemoteTextFile(evoSuiteURL0, "vNE");
      Services.HTTP_Result services_HTTP_Result0 = Services.testHTTPS("K&pCv<v{", 0);
      assertEquals(4, services_HTTP_Result0.page_weight);
      assertTrue(services_HTTP_Result0.works);
  }

  /**
  //Test case number: 1
  /*Coverage entropy=1.5531577432135641
  */
  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      EvoSuiteURL evoSuiteURL0 = new EvoSuiteURL("http://?,8:2917");
      NetworkHandling.createRemoteTextFile(evoSuiteURL0, "3M:saOH`CXNB");
      Services.HTTP_Result services_HTTP_Result0 = Services.testHTTP("?,8", 2917);
      assertEquals(13, services_HTTP_Result0.page_weight);
      assertTrue(services_HTTP_Result0.works);
      
      Services.HTTP_Result services_HTTP_Result1 = Services.testHTTPS("3M:saOH`CXNB", (-1));
      assertEquals(0L, services_HTTP_Result1.time);
      assertEquals(0, services_HTTP_Result1.page_weight);
      assertFalse(services_HTTP_Result1.works);
      assertEquals(0, services_HTTP_Result1.code);
  }

  /**
  //Test case number: 2
  /*Coverage entropy=0.42857142857142855
  */
  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      EvoSuiteURL evoSuiteURL0 = new EvoSuiteURL("http://:0");
      NetworkHandling.createRemoteTextFile(evoSuiteURL0, "5");
      Services.HTTP_Result services_HTTP_Result0 = new Services.HTTP_Result();
      assertEquals(0, services_HTTP_Result0.page_weight);
      assertFalse(services_HTTP_Result0.works);
      assertEquals(0L, services_HTTP_Result0.time);
      assertEquals(0, services_HTTP_Result0.code);
      
      Services.HTTP_Result services_HTTP_Result1 = Services.testHTTP("", 0);
      assertTrue(services_HTTP_Result1.works);
      assertEquals(2, services_HTTP_Result1.page_weight);
  }

  /**
  //Test case number: 3
  /*Coverage entropy=1.5271837172395382
  */
  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      EvoSuiteRemoteAddress evoSuiteRemoteAddress0 = new EvoSuiteRemoteAddress("200.42.42.0", 20);
      NetworkHandling.openRemoteTcpServer(evoSuiteRemoteAddress0);
      Services.SIMPLE_Result services_SIMPLE_Result0 = Services.testSMTP("**", 20);
      assertFalse(services_SIMPLE_Result0.works);
      assertEquals(0L, services_SIMPLE_Result0.time);
  }

  /**
  //Test case number: 4
  /*Coverage entropy=0.42857142857142855
  */
  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      EvoSuiteURL evoSuiteURL0 = new EvoSuiteURL("https://:0");
      NetworkHandling.createRemoteTextFile(evoSuiteURL0, "f||");
      Services.HTTP_Result services_HTTP_Result0 = new Services.HTTP_Result();
      assertEquals(0L, services_HTTP_Result0.time);
      assertEquals(0, services_HTTP_Result0.code);
      assertEquals(0, services_HTTP_Result0.page_weight);
      assertFalse(services_HTTP_Result0.works);
      
      Services.HTTP_Result services_HTTP_Result1 = Services.testHTTPS("", 0);
      assertEquals(4, services_HTTP_Result1.page_weight);
      assertTrue(services_HTTP_Result1.works);
  }

  /**
  //Test case number: 5
  /*Coverage entropy=1.1217186091313738
  */
  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      EvoSuiteRemoteAddress evoSuiteRemoteAddress0 = new EvoSuiteRemoteAddress("127.0.0.1", 18);
      NetworkHandling.openRemoteTcpServer(evoSuiteRemoteAddress0);
      Services.SIMPLE_Result services_SIMPLE_Result0 = Services.testPOP3("", 18);
      assertFalse(services_SIMPLE_Result0.works);
      assertEquals(0L, services_SIMPLE_Result0.time);
  }

  /**
  //Test case number: 6
  /*Coverage entropy=1.1217186091313738
  */
  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Services.HTTP_Result services_HTTP_Result0 = Services.testHTTPS((String) null, (-1651));
      assertEquals(0, services_HTTP_Result0.code);
      assertEquals(0, services_HTTP_Result0.page_weight);
      assertFalse(services_HTTP_Result0.works);
      assertEquals(0L, services_HTTP_Result0.time);
  }

  /**
  //Test case number: 7
  /*Coverage entropy=1.1217186091313738
  */
  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Services.HTTP_Result services_HTTP_Result0 = Services.testHTTPS("", (-1931));
      assertEquals(0, services_HTTP_Result0.code);
      assertEquals(0, services_HTTP_Result0.page_weight);
      assertEquals(0L, services_HTTP_Result0.time);
      assertFalse(services_HTTP_Result0.works);
  }

  /**
  //Test case number: 8
  /*Coverage entropy=1.1217186091313738
  */
  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Services.HTTP_Result services_HTTP_Result0 = Services.testHTTP("", (-1651));
      assertEquals(0, services_HTTP_Result0.page_weight);
      assertFalse(services_HTTP_Result0.works);
      assertEquals(0, services_HTTP_Result0.code);
      assertEquals(0L, services_HTTP_Result0.time);
  }

  /**
  //Test case number: 9
  /*Coverage entropy=1.5271837172395382
  */
  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Services.HTTP_Result services_HTTP_Result0 = Services.testHTTP((String) null, 409);
      assertEquals(0, services_HTTP_Result0.code);
      assertEquals(0, services_HTTP_Result0.page_weight);
      assertFalse(services_HTTP_Result0.works);
      assertEquals(0L, services_HTTP_Result0.time);
  }

  /**
  //Test case number: 10
  /*Coverage entropy=1.1375916250043898
  */
  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Services.HTTP_Result services_HTTP_Result0 = new Services.HTTP_Result();
      assertEquals(0L, services_HTTP_Result0.time);
      assertFalse(services_HTTP_Result0.works);
      assertEquals(0, services_HTTP_Result0.page_weight);
      assertEquals(0, services_HTTP_Result0.code);
      
      Services.HTTP_Result services_HTTP_Result1 = Services.testHTTP("", 0);
      assertEquals(0, services_HTTP_Result1.code);
      assertEquals(0, services_HTTP_Result1.page_weight);
      assertEquals(0L, services_HTTP_Result1.time);
      assertFalse(services_HTTP_Result1.works);
  }

  /**
  //Test case number: 11
  /*Coverage entropy=1.0931471805599453
  */
  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Services.HTTP_Result services_HTTP_Result0 = new Services.HTTP_Result();
      services_HTTP_Result0.reset();
      assertEquals(0L, services_HTTP_Result0.time);
      assertFalse(services_HTTP_Result0.works);
      assertEquals(0, services_HTTP_Result0.code);
      assertEquals(0, services_HTTP_Result0.page_weight);
  }

  /**
  //Test case number: 12
  /*Coverage entropy=1.5271837172395382
  */
  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Services.SIMPLE_Result services_SIMPLE_Result0 = new Services.SIMPLE_Result();
      services_SIMPLE_Result0.reset();
      String string0 = services_SIMPLE_Result0.toString();
      assertEquals(0L, services_SIMPLE_Result0.time);
      assertEquals("**** Resultat : \n** Fonctionnement : false\n** Temps : 0 ms\n** Erreur g\u00E9n\u00E9r\u00E9e : .\n****", string0);
      assertFalse(services_SIMPLE_Result0.works);
  }

  /**
  //Test case number: 13
  /*Coverage entropy=1.0931471805599453
  */
  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Services.HTTP_Result services_HTTP_Result0 = new Services.HTTP_Result();
      assertEquals(0, services_HTTP_Result0.code);
      
      services_HTTP_Result0.code = 1;
      String string0 = services_HTTP_Result0.toString();
      assertEquals("**** Resultat : \n** Fonctionnement : false\n** Temps : 0 ms\n** Poid de la page : 0 octets\n** Code de page : 1\n** Erreur g\u00E9n\u00E9r\u00E9e : .\n****", string0);
  }

  /**
  //Test case number: 14
  /*Coverage entropy=1.1375916250043898
  */
  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Services.HTTP_Result services_HTTP_Result0 = new Services.HTTP_Result();
      assertEquals(0L, services_HTTP_Result0.time);
      assertEquals(0, services_HTTP_Result0.page_weight);
      assertEquals(0, services_HTTP_Result0.code);
      assertFalse(services_HTTP_Result0.works);
      
      Services.HTTP_Result services_HTTP_Result1 = Services.testHTTPS("", 0);
      assertEquals(0, services_HTTP_Result1.code);
      assertFalse(services_HTTP_Result1.works);
      assertEquals(0L, services_HTTP_Result1.time);
      assertEquals(0, services_HTTP_Result1.page_weight);
  }

  /**
  //Test case number: 15
  /*Coverage entropy=1.5271837172395382
  */
  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Services.SIMPLE_Result services_SIMPLE_Result0 = Services.testSMTP("", (-1312));
      assertFalse(services_SIMPLE_Result0.works);
      assertEquals(0L, services_SIMPLE_Result0.time);
  }

  /**
  //Test case number: 16
  /*Coverage entropy=1.543056733112554
  */
  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Services.HTTP_Result services_HTTP_Result0 = new Services.HTTP_Result();
      assertEquals(0, services_HTTP_Result0.page_weight);
      assertEquals(0, services_HTTP_Result0.code);
      assertFalse(services_HTTP_Result0.works);
      assertEquals(0L, services_HTTP_Result0.time);
      
      Services.SIMPLE_Result services_SIMPLE_Result0 = Services.testSMTP("", 0);
      assertFalse(services_SIMPLE_Result0.works);
      assertEquals(0L, services_SIMPLE_Result0.time);
  }

  /**
  //Test case number: 17
  /*Coverage entropy=1.5271837172395382
  */
  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Services.SIMPLE_Result services_SIMPLE_Result0 = Services.testPOP3("M}0QdDYu]~", (-1));
      assertEquals(0L, services_SIMPLE_Result0.time);
      assertFalse(services_SIMPLE_Result0.works);
  }

  /**
  //Test case number: 18
  /*Coverage entropy=1.543056733112554
  */
  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Services.HTTP_Result services_HTTP_Result0 = new Services.HTTP_Result();
      assertFalse(services_HTTP_Result0.works);
      assertEquals(0, services_HTTP_Result0.page_weight);
      assertEquals(0, services_HTTP_Result0.code);
      assertEquals(0L, services_HTTP_Result0.time);
      
      Services.SIMPLE_Result services_SIMPLE_Result0 = Services.testPOP3("", 0);
      assertEquals(0L, services_SIMPLE_Result0.time);
      assertFalse(services_SIMPLE_Result0.works);
  }

  /**
  //Test case number: 19
  /*Coverage entropy=0.3333333333333333
  */
  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Services services0 = new Services();
  }
}
