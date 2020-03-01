/*
 * This file was automatically generated by EvoSuite
 * Tue Dec 03 07:59:07 GMT 2019
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
  /*Coverage entropy=1.5531577432135641
  */
  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      EvoSuiteURL evoSuiteURL0 = new EvoSuiteURL("https:");
      NetworkHandling.createRemoteTextFile(evoSuiteURL0, "**** Resultat : \n** Fonctionnemet : ");
      Services.HTTP_Result services_HTTP_Result0 = Services.testHTTPS("", (-1));
      assertTrue(services_HTTP_Result0.works);
      assertEquals(37, services_HTTP_Result0.page_weight);
      
      Services.SIMPLE_Result services_SIMPLE_Result0 = Services.testPOP3("", 2878);
      assertFalse(services_SIMPLE_Result0.works);
      assertEquals(0L, services_SIMPLE_Result0.time);
  }

  /**
  //Test case number: 1
  /*Coverage entropy=0.42857142857142855
  */
  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      EvoSuiteURL evoSuiteURL0 = new EvoSuiteURL("http://:0");
      NetworkHandling.createRemoteTextFile(evoSuiteURL0, "**** Rsultat: \n** Fonctionnement : ");
      Services.HTTP_Result services_HTTP_Result0 = new Services.HTTP_Result();
      assertFalse(services_HTTP_Result0.works);
      assertEquals(0, services_HTTP_Result0.page_weight);
      assertEquals(0, services_HTTP_Result0.code);
      assertEquals(0L, services_HTTP_Result0.time);
      
      Services.HTTP_Result services_HTTP_Result1 = Services.testHTTP("", 0);
      assertTrue(services_HTTP_Result1.works);
      assertEquals(36, services_HTTP_Result1.page_weight);
  }

  /**
  //Test case number: 2
  /*Coverage entropy=1.1217186091313738
  */
  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      EvoSuiteRemoteAddress evoSuiteRemoteAddress0 = new EvoSuiteRemoteAddress("200.42.42.0", 2019);
      NetworkHandling.openRemoteTcpServer(evoSuiteRemoteAddress0);
      Services.SIMPLE_Result services_SIMPLE_Result0 = Services.testPOP3("b2c>IFljg^F3>fQ", 2019);
      assertEquals(0L, services_SIMPLE_Result0.time);
      assertFalse(services_SIMPLE_Result0.works);
  }

  /**
  //Test case number: 3
  /*Coverage entropy=1.1217186091313738
  */
  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      EvoSuiteRemoteAddress evoSuiteRemoteAddress0 = new EvoSuiteRemoteAddress("200.42.42.0", 5493);
      NetworkHandling.openRemoteTcpServer(evoSuiteRemoteAddress0);
      Services.SIMPLE_Result services_SIMPLE_Result0 = Services.testSMTP(";UFai", 5493);
      assertFalse(services_SIMPLE_Result0.works);
      assertEquals(0L, services_SIMPLE_Result0.time);
  }

  /**
  //Test case number: 4
  /*Coverage entropy=1.1217186091313738
  */
  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Services.HTTP_Result services_HTTP_Result0 = Services.testHTTPS((String) null, 1942);
      assertEquals(0, services_HTTP_Result0.page_weight);
      assertEquals(0, services_HTTP_Result0.code);
      assertFalse(services_HTTP_Result0.works);
      assertEquals(0L, services_HTTP_Result0.time);
  }

  /**
  //Test case number: 5
  /*Coverage entropy=1.1217186091313738
  */
  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Services.SIMPLE_Result services_SIMPLE_Result0 = Services.testSMTP((String) null, (-5162));
      assertFalse(services_SIMPLE_Result0.works);
      assertEquals(0L, services_SIMPLE_Result0.time);
  }

  /**
  //Test case number: 6
  /*Coverage entropy=1.1217186091313738
  */
  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Services.HTTP_Result services_HTTP_Result0 = Services.testHTTPS("", 5006);
      assertEquals(0L, services_HTTP_Result0.time);
      assertFalse(services_HTTP_Result0.works);
      assertEquals(0, services_HTTP_Result0.page_weight);
      assertEquals(0, services_HTTP_Result0.code);
  }

  /**
  //Test case number: 7
  /*Coverage entropy=1.1217186091313738
  */
  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Services.HTTP_Result services_HTTP_Result0 = Services.testHTTP((String) null, 1556);
      assertEquals(0L, services_HTTP_Result0.time);
      assertFalse(services_HTTP_Result0.works);
      assertEquals(0, services_HTTP_Result0.code);
      assertEquals(0, services_HTTP_Result0.page_weight);
  }

  /**
  //Test case number: 8
  /*Coverage entropy=1.1217186091313738
  */
  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Services.HTTP_Result services_HTTP_Result0 = Services.testHTTP("", (-1884));
      assertEquals(0, services_HTTP_Result0.code);
      assertEquals(0, services_HTTP_Result0.page_weight);
      assertEquals(0L, services_HTTP_Result0.time);
      assertFalse(services_HTTP_Result0.works);
  }

  /**
  //Test case number: 9
  /*Coverage entropy=1.1217186091313738
  */
  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Services.HTTP_Result services_HTTP_Result0 = Services.testHTTP("", 0);
      assertEquals(0L, services_HTTP_Result0.time);
      assertEquals(0, services_HTTP_Result0.page_weight);
      assertEquals(0, services_HTTP_Result0.code);
      assertFalse(services_HTTP_Result0.works);
  }

  /**
  //Test case number: 10
  /*Coverage entropy=0.3333333333333333
  */
  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Services services0 = new Services();
  }

  /**
  //Test case number: 11
  /*Coverage entropy=1.0931471805599453
  */
  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Services.HTTP_Result services_HTTP_Result0 = new Services.HTTP_Result();
      assertEquals(0, services_HTTP_Result0.page_weight);
      
      services_HTTP_Result0.page_weight = (-53);
      String string0 = services_HTTP_Result0.toString();
      assertEquals("**** Resultat : \n** Fonctionnement : false\n** Temps : 0 ms\n** Poid de la page : -53 octets\n** Code de page : 0\n** Erreur g\u00E9n\u00E9r\u00E9e : .\n****", string0);
  }

  /**
  //Test case number: 12
  /*Coverage entropy=1.0931471805599453
  */
  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Services.SIMPLE_Result services_SIMPLE_Result0 = new Services.SIMPLE_Result();
      String string0 = services_SIMPLE_Result0.toString();
      assertEquals("**** Resultat : \n** Fonctionnement : false\n** Temps : 0 ms\n** Erreur g\u00E9n\u00E9r\u00E9e : .\n****", string0);
  }

  /**
  //Test case number: 13
  /*Coverage entropy=1.0931471805599453
  */
  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Services.SIMPLE_Result services_SIMPLE_Result0 = new Services.SIMPLE_Result();
      services_SIMPLE_Result0.reset();
      assertFalse(services_SIMPLE_Result0.works);
      assertEquals(0L, services_SIMPLE_Result0.time);
  }

  /**
  //Test case number: 14
  /*Coverage entropy=1.0931471805599453
  */
  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Services.HTTP_Result services_HTTP_Result0 = new Services.HTTP_Result();
      services_HTTP_Result0.reset();
      assertFalse(services_HTTP_Result0.works);
      assertEquals(0, services_HTTP_Result0.page_weight);
      assertEquals(0, services_HTTP_Result0.code);
      assertEquals(0L, services_HTTP_Result0.time);
  }

  /**
  //Test case number: 15
  /*Coverage entropy=1.1217186091313738
  */
  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Services.SIMPLE_Result services_SIMPLE_Result0 = Services.testSMTP("{qyG@Q{*q)IGc3hnZ", 3447);
      assertFalse(services_SIMPLE_Result0.works);
      assertEquals(0L, services_SIMPLE_Result0.time);
  }

  /**
  //Test case number: 16
  /*Coverage entropy=1.1217186091313738
  */
  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Services.SIMPLE_Result services_SIMPLE_Result0 = Services.testPOP3("", (-2535));
      assertFalse(services_SIMPLE_Result0.works);
      assertEquals(0L, services_SIMPLE_Result0.time);
  }

  /**
  //Test case number: 17
  /*Coverage entropy=1.1217186091313738
  */
  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Services.HTTP_Result services_HTTP_Result0 = Services.testHTTPS("Dl9'v_Z0>Z?", (-1672));
      assertEquals(0L, services_HTTP_Result0.time);
      assertFalse(services_HTTP_Result0.works);
      assertEquals(0, services_HTTP_Result0.code);
      assertEquals(0, services_HTTP_Result0.page_weight);
  }
}
