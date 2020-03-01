/*
 * This file was automatically generated by EvoSuite
 * Mon Dec 02 04:47:11 GMT 2019
 */


import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.testdata.EvoSuiteLocalAddress;
import org.evosuite.runtime.testdata.EvoSuiteRemoteAddress;
import org.evosuite.runtime.testdata.EvoSuiteURL;
import org.evosuite.runtime.testdata.NetworkHandling;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class Services_ESTest extends Services_ESTest_scaffolding {

  /**
  //Test case number: 0
  /*Coverage entropy=0.4
  */
  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      EvoSuiteURL evoSuiteURL0 = new EvoSuiteURL("https://:3000");
      NetworkHandling.createRemoteTextFile(evoSuiteURL0, ".\n****");
      Services.HTTP_Result services_HTTP_Result0 = Services.testHTTPS("", 3000);
      services_HTTP_Result0.time = (long) (byte)34;
  }

  /**
  //Test case number: 1
  /*Coverage entropy=0.4
  */
  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      EvoSuiteURL evoSuiteURL0 = new EvoSuiteURL("http://(D$?4>T6\\N[SLb:0");
      String string0 = "*HeD`98vFu$t";
      NetworkHandling.createRemoteTextFile(evoSuiteURL0, "*HeD`98vFu$t");
      String string1 = "(D$?4>T6\\N[SLb";
      Services.testHTTP("(D$?4>T6N[SLb", 0);
      EvoSuiteLocalAddress evoSuiteLocalAddress0 = new EvoSuiteLocalAddress("192.168.1.42", 40001);
      // Undeclared exception!
      try { 
        NetworkHandling.sendMessageOnTcp(evoSuiteLocalAddress0, (String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.evosuite.runtime.testdata.NetworkHandling", e);
      }
  }

  /**
  //Test case number: 2
  /*Coverage entropy=1.1217186091313738
  */
  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      EvoSuiteRemoteAddress evoSuiteRemoteAddress0 = new EvoSuiteRemoteAddress("200.42.42.0", 3000);
      NetworkHandling.openRemoteTcpServer(evoSuiteRemoteAddress0);
      Services.SIMPLE_Result services_SIMPLE_Result0 = Services.testPOP3("XX*#<", 3000);
      assertEquals(0L, services_SIMPLE_Result0.time);
      assertFalse(services_SIMPLE_Result0.works);
  }

  /**
  //Test case number: 3
  /*Coverage entropy=1.1217186091313738
  */
  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      EvoSuiteRemoteAddress evoSuiteRemoteAddress0 = new EvoSuiteRemoteAddress("127.0.0.1", 3000);
      NetworkHandling.openRemoteTcpServer(evoSuiteRemoteAddress0);
      Services.SIMPLE_Result services_SIMPLE_Result0 = Services.testSMTP("", 3000);
      assertEquals(0L, services_SIMPLE_Result0.time);
      assertFalse(services_SIMPLE_Result0.works);
  }

  /**
  //Test case number: 4
  /*Coverage entropy=1.1217186091313738
  */
  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Services.SIMPLE_Result services_SIMPLE_Result0 = Services.testSMTP("", (-1998));
      assertFalse(services_SIMPLE_Result0.works);
      assertEquals(0L, services_SIMPLE_Result0.time);
  }

  /**
  //Test case number: 5
  /*Coverage entropy=1.1217186091313738
  */
  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Services.HTTP_Result services_HTTP_Result0 = Services.testHTTPS((String) null, 3000);
      assertFalse(services_HTTP_Result0.works);
      assertEquals(0L, services_HTTP_Result0.time);
      assertEquals(0, services_HTTP_Result0.page_weight);
      assertEquals(0, services_HTTP_Result0.code);
  }

  /**
  //Test case number: 6
  /*Coverage entropy=1.1217186091313738
  */
  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Services.SIMPLE_Result services_SIMPLE_Result0 = Services.testSMTP("i_%", 0);
      assertFalse(services_SIMPLE_Result0.works);
      assertEquals(0L, services_SIMPLE_Result0.time);
  }

  /**
  //Test case number: 7
  /*Coverage entropy=1.0931471805599453
  */
  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Services.HTTP_Result services_HTTP_Result0 = new Services.HTTP_Result();
      assertEquals(0, services_HTTP_Result0.code);
      
      services_HTTP_Result0.code = 2236;
      String string0 = services_HTTP_Result0.toString();
      assertEquals("**** Resultat : \n** Fonctionnement : false\n** Temps : 0 ms\n** Poid de la page : 0 octets\n** Code de page : 2236\n** Erreur g\u00E9n\u00E9r\u00E9e : .\n****", string0);
  }

  /**
  //Test case number: 8
  /*Coverage entropy=1.1217186091313738
  */
  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Services.HTTP_Result services_HTTP_Result0 = Services.testHTTP("", (-1));
      assertEquals(0L, services_HTTP_Result0.time);
      assertFalse(services_HTTP_Result0.works);
      assertEquals(0, services_HTTP_Result0.page_weight);
      assertEquals(0, services_HTTP_Result0.code);
  }

  /**
  //Test case number: 9
  /*Coverage entropy=1.0931471805599453
  */
  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Services.SIMPLE_Result services_SIMPLE_Result0 = new Services.SIMPLE_Result();
      String string0 = services_SIMPLE_Result0.toString();
      assertEquals("**** Resultat : \n** Fonctionnement : false\n** Temps : 0 ms\n** Erreur g\u00E9n\u00E9r\u00E9e : .\n****", string0);
  }

  /**
  //Test case number: 10
  /*Coverage entropy=1.1217186091313738
  */
  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Services.HTTP_Result services_HTTP_Result0 = Services.testHTTPS("", 3000);
      assertFalse(services_HTTP_Result0.works);
      assertEquals(0, services_HTTP_Result0.code);
      assertEquals(0L, services_HTTP_Result0.time);
      assertEquals(0, services_HTTP_Result0.page_weight);
  }

  /**
  //Test case number: 11
  /*Coverage entropy=1.1217186091313738
  */
  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Services.HTTP_Result services_HTTP_Result0 = Services.testHTTPS("i_%", (-1590));
      assertEquals(0L, services_HTTP_Result0.time);
      assertEquals(0, services_HTTP_Result0.page_weight);
      assertFalse(services_HTTP_Result0.works);
      assertEquals(0, services_HTTP_Result0.code);
  }

  /**
  //Test case number: 12
  /*Coverage entropy=0.3333333333333333
  */
  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Services services0 = new Services();
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
      assertEquals(0L, services_HTTP_Result0.time);
      assertFalse(services_HTTP_Result0.works);
      assertEquals(0, services_HTTP_Result0.page_weight);
      assertEquals(0, services_HTTP_Result0.code);
  }

  /**
  //Test case number: 15
  /*Coverage entropy=1.1217186091313738
  */
  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Services.SIMPLE_Result services_SIMPLE_Result0 = Services.testPOP3("i_%", 0);
      assertEquals(0L, services_SIMPLE_Result0.time);
      assertFalse(services_SIMPLE_Result0.works);
  }

  /**
  //Test case number: 16
  /*Coverage entropy=1.1217186091313738
  */
  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Services.SIMPLE_Result services_SIMPLE_Result0 = Services.testPOP3((String) null, (-2003));
      assertEquals(0L, services_SIMPLE_Result0.time);
      assertFalse(services_SIMPLE_Result0.works);
  }

  /**
  //Test case number: 17
  /*Coverage entropy=1.1217186091313738
  */
  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Services.HTTP_Result services_HTTP_Result0 = Services.testHTTP((String) null, (-1985));
      assertFalse(services_HTTP_Result0.works);
      assertEquals(0, services_HTTP_Result0.code);
      assertEquals(0L, services_HTTP_Result0.time);
      assertEquals(0, services_HTTP_Result0.page_weight);
  }

  /**
  //Test case number: 18
  /*Coverage entropy=1.1217186091313738
  */
  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Services.HTTP_Result services_HTTP_Result0 = Services.testHTTP("", (-679));
      assertEquals(0L, services_HTTP_Result0.time);
      assertEquals(0, services_HTTP_Result0.page_weight);
      assertFalse(services_HTTP_Result0.works);
      assertEquals(0, services_HTTP_Result0.code);
  }
}
