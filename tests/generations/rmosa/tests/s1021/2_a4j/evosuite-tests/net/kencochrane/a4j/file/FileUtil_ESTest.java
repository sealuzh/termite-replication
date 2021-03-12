/*
 * This file was automatically generated by EvoSuite
 * Mon Nov 09 09:28:44 GMT 2020
 */

package net.kencochrane.a4j.file;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.File;
import java.io.FileInputStream;
import java.util.ArrayList;
import net.kencochrane.a4j.file.FileUtil;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.io.MockFile;
import org.evosuite.runtime.testdata.EvoSuiteFile;
import org.evosuite.runtime.testdata.EvoSuiteURL;
import org.evosuite.runtime.testdata.FileSystemHandling;
import org.evosuite.runtime.testdata.NetworkHandling;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class FileUtil_ESTest extends FileUtil_ESTest_scaffolding {

  /**
  //Test case number: 0
  /*Coverage entropy=1.0397207708399179
  */
  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      FileInputStream fileInputStream0 = fileUtil0.fetchThirdPartySearchFile("net.kencochrane.a4j.util.a4jUtil", "Ypq\"k_uT]e", "net.kencochrane.a4j.util.a4jUtil", (String) null);
      assertNull(fileInputStream0);
  }

  /**
  //Test case number: 1
  /*Coverage entropy=1.0397207708399179
  */
  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      FileInputStream fileInputStream0 = fileUtil0.fetchGenericSearchFile("{*PNbUjVf'|&", "", "AsinSearch", ":#.:FM^RLt", "", "{*PNbUjVf'|&");
      assertNull(fileInputStream0);
  }

  /**
  //Test case number: 2
  /*Coverage entropy=1.0397207708399179
  */
  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      FileInputStream fileInputStream0 = fileUtil0.fetchGenericSearchFile("AsinSearch", "AsinSearch", ":#.:FM^RLt", "AsinSearch", "{*PNbUjVf'|&", "AsinSearch");
      assertNull(fileInputStream0);
  }

  /**
  //Test case number: 3
  /*Coverage entropy=1.0397207708399179
  */
  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      FileInputStream fileInputStream0 = fileUtil0.fetchKeywordSearchFile("JrU`F_majFKK&", "JrU`F_majFKK&", "", ".xml");
      assertNull(fileInputStream0);
  }

  /**
  //Test case number: 4
  /*Coverage entropy=1.0397207708399179
  */
  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      FileInputStream fileInputStream0 = fileUtil0.fetchBlendedSearchFile("cceir", "t_");
      assertNull(fileInputStream0);
  }

  /**
  //Test case number: 5
  /*Coverage entropy=0.6365141682948128
  */
  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      File file0 = fileUtil0.downloadKeywordSearchFile("SisilaritySearch", "SisilaritySearch", "I64FP\"s=|#K", "I64FP\"s=|#K");
      assertNull(file0);
  }

  /**
  //Test case number: 6
  /*Coverage entropy=1.2424533248940002
  */
  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      FileInputStream fileInputStream0 = fileUtil0.fetchBNFile("offer=", "5AQK`d8p`?fqJY>T@", "5AQK`d8p`?fqJY>T@");
      assertNull(fileInputStream0);
  }

  /**
  //Test case number: 7
  /*Coverage entropy=1.242453324894
  */
  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      FileInputStream fileInputStream0 = fileUtil0.fetchASINFile("8)hJxTF<,;", "", "a_", "");
      assertNull(fileInputStream0);
  }

  /**
  //Test case number: 8
  /*Coverage entropy=1.242453324894
  */
  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      FileInputStream fileInputStream0 = fileUtil0.fetchASINFile("a4j-config.txt", "a4j-config.txt", "", "");
      assertNull(fileInputStream0);
  }

  /**
  //Test case number: 9
  /*Coverage entropy=0.6365141682948128
  */
  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      fileUtil0.renameFile("/", "/");
  }

  /**
  //Test case number: 10
  /*Coverage entropy=1.6417347121875212
  */
  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("/___A4J-CONFIG.TXT.XML");
      FileSystemHandling.createFolder(evoSuiteFile0);
      FileInputStream fileInputStream0 = fileUtil0.fetchASINFile("", "", "", "a4j-config.txt");
      assertNull(fileInputStream0);
  }

  /**
  //Test case number: 11
  /*Coverage entropy=1.0114042647073518
  */
  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      EvoSuiteURL evoSuiteURL0 = new EvoSuiteURL("http://xml.amazon.net/onca/xml3?t=popcornmonste2-20&dev-t=DSB0XDDW1GQ3S&BrowseNodeSearch=c_&mode=&type=lite&page=c_&offer=new&f=xml");
      NetworkHandling.createRemoteTextFile(evoSuiteURL0, "x~ U[q7O;@thrMv31'");
      File file0 = fileUtil0.getBrowseNodeFile("", "c_", "c_");
      assertNull(file0);
  }

  /**
  //Test case number: 12
  /*Coverage entropy=1.4708084763221112
  */
  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("/S_.XML");
      byte[] byteArray0 = new byte[3];
      FileSystemHandling.appendDataToFile(evoSuiteFile0, byteArray0);
      File file0 = fileUtil0.getSimilarItems("", "");
      assertNotNull(file0);
      assertEquals(3L, file0.length());
  }

  /**
  //Test case number: 13
  /*Coverage entropy=1.4708084763221114
  */
  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("/_C__C_.XML");
      FileSystemHandling.createFolder(evoSuiteFile0);
      File file0 = fileUtil0.getBrowseNodeFile("", "c_", "c_");
      assertNotNull(file0);
      assertEquals("_C__C_.XML", file0.getName());
      assertTrue(file0.isDirectory());
  }

  /**
  //Test case number: 14
  /*Coverage entropy=1.4708084763221112
  */
  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("/A_<&LH.XML");
      byte[] byteArray0 = new byte[3];
      FileSystemHandling.appendDataToFile(evoSuiteFile0, byteArray0);
      ArrayList<String> arrayList0 = new ArrayList<String>();
      File file0 = fileUtil0.getAccessories("<&lH", arrayList0);
      assertNotNull(file0);
      assertEquals(3L, file0.length());
  }

  /**
  //Test case number: 15
  /*Coverage entropy=1.4708084763221112
  */
  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("/A_<&LH.XML");
      FileSystemHandling.appendStringToFile(evoSuiteFile0, "");
      ArrayList<String> arrayList0 = new ArrayList<String>();
      File file0 = fileUtil0.getAccessories("<&lH", arrayList0);
      assertFalse(file0.isDirectory());
      assertNotNull(file0);
      assertTrue(file0.canExecute());
  }

  /**
  //Test case number: 16
  /*Coverage entropy=1.4708084763221112
  */
  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("/&=OUDJ!3P#VQ~~}T;_&=OUDJ!3P#VQ~~}T;_&=OUDJ!3P#VQ~~}T;_&=OUDJ!3P#VQ~~}T;.XML");
      FileSystemHandling.createFolder(evoSuiteFile0);
      File file0 = fileUtil0.getASINFile("&=ouDj!3p#VQ~~}T;", "&=ouDj!3p#VQ~~}T;", "&=ouDj!3p#VQ~~}T;", "&=ouDj!3p#VQ~~}T;");
      assertNotNull(file0);
      assertEquals("&=OUDJ!3P#VQ~~}T;_&=OUDJ!3P#VQ~~}T;_&=OUDJ!3P#VQ~~}T;_&=OUDJ!3P#VQ~~}T;.XML", file0.getName());
      assertTrue(file0.canWrite());
  }

  /**
  //Test case number: 17
  /*Coverage entropy=1.6417347121875212
  */
  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("/S_NET.KENCOCHRANE.A4J.DATA.QUERY.XML");
      byte[] byteArray0 = new byte[2];
      FileSystemHandling.appendDataToFile(evoSuiteFile0, byteArray0);
      FileUtil fileUtil0 = new FileUtil();
      FileInputStream fileInputStream0 = fileUtil0.fetchSimilarItems("net.kencochrane.a4j.data.Query", "net.kencochrane.a4j.data.Query");
      assertEquals(2, fileInputStream0.available());
  }

  /**
  //Test case number: 18
  /*Coverage entropy=1.6417347121875212
  */
  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("/A_EOZ!KD|I*$_.XML");
      byte[] byteArray0 = new byte[0];
      FileSystemHandling.appendDataToFile(evoSuiteFile0, byteArray0);
      FileUtil fileUtil0 = new FileUtil();
      ArrayList<Object> arrayList0 = new ArrayList<Object>();
      FileInputStream fileInputStream0 = fileUtil0.fetchAccessories("eOz!KD|I*$_", arrayList0);
      assertEquals(0, fileInputStream0.available());
  }

  /**
  //Test case number: 19
  /*Coverage entropy=1.6417347121875212
  */
  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("/A_<&LH.XML");
      byte[] byteArray0 = new byte[3];
      FileSystemHandling.appendDataToFile(evoSuiteFile0, byteArray0);
      ArrayList<String> arrayList0 = new ArrayList<String>();
      FileInputStream fileInputStream0 = fileUtil0.fetchAccessories("<&lH", arrayList0);
      assertEquals(3, fileInputStream0.available());
  }

  /**
  //Test case number: 20
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      boolean boolean0 = fileUtil0.downloadOneASINFile("t_", "N;~<=N", "}}q4C:I", "G'U fWCc", "");
      assertFalse(boolean0);
  }

  /**
  //Test case number: 21
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      boolean boolean0 = fileUtil0.downloadBrowseNodeFile("net.kencochrane.a4j.data.Query", "a4j-config.txt", (String) null, "a4j-config.txt");
      assertFalse(boolean0);
  }

  /**
  //Test case number: 22
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      ArrayList<Object> arrayList0 = new ArrayList<Object>();
      boolean boolean0 = fileUtil0.downloadAccessoriesFile("-", arrayList0, "-");
      assertFalse(boolean0);
  }

  /**
  //Test case number: 23
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      // Undeclared exception!
      try { 
        fileUtil0.renameFile((String) null, (String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.io.File", e);
      }
  }

  /**
  //Test case number: 24
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      // Undeclared exception!
      try { 
        fileUtil0.deleteFile((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.io.File", e);
      }
  }

  /**
  //Test case number: 25
  /*Coverage entropy=1.4708084763221112
  */
  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("/S_NET.KENCOCHRANE.A4J.DATA.QUERY.XML");
      FileSystemHandling.createFolder(evoSuiteFile0);
      FileUtil fileUtil0 = new FileUtil();
      File file0 = fileUtil0.getSimilarItems("net.kencochrane.a4j.data.Query", "v4H:4");
      assertEquals("/S_NET.KENCOCHRANE.A4J.DATA.QUERY.XML", file0.toString());
      assertNotNull(file0);
      assertFalse(file0.isFile());
  }

  /**
  //Test case number: 26
  /*Coverage entropy=0.6365141682948128
  */
  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      File file0 = fileUtil0.downloadBlendedSearchFile("all", "_");
      assertNull(file0);
  }

  /**
  //Test case number: 27
  /*Coverage entropy=0.6365141682948128
  */
  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      MockFile mockFile0 = new MockFile("My;J&0j{#");
      boolean boolean0 = fileUtil0.isAgeGood(mockFile0);
      assertFalse(boolean0);
  }

  /**
  //Test case number: 28
  /*Coverage entropy=0.6365141682948128
  */
  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile(".xml");
      byte[] byteArray0 = new byte[2];
      FileSystemHandling.appendDataToFile(evoSuiteFile0, byteArray0);
      fileUtil0.deleteFile(".xml");
  }

  /**
  //Test case number: 29
  /*Coverage entropy=0.6365141682948128
  */
  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      File file0 = fileUtil0.downloadCart("WC! )Cv9+mB%/4Y");
      assertNull(file0);
  }

  /**
  //Test case number: 30
  /*Coverage entropy=1.242453324894
  */
  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      FileInputStream fileInputStream0 = fileUtil0.fetchSimilarItems("", "");
      assertNull(fileInputStream0);
  }

  /**
  //Test case number: 31
  /*Coverage entropy=0.6365141682948128
  */
  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      EvoSuiteURL evoSuiteURL0 = new EvoSuiteURL("http://xml.amazon.net/onca/xml3?t=popcornmonste2-20&dev-t=DSB0XDDW1GQ3S&SimilaritySearch=z!?dUU&type=lite&offerpage=null&offer=all&f=xml");
      NetworkHandling.createRemoteTextFile(evoSuiteURL0, "z!?dUU");
      boolean boolean0 = fileUtil0.downloadSimilaritesFile("z!?dUU", (String) null, "C$");
      assertFalse(boolean0);
  }

  /**
  //Test case number: 32
  /*Coverage entropy=1.6417347121875212
  */
  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("/S_NET.KENCOCHRANE.A4J.DATA.QUERY.XML");
      FileSystemHandling.createFolder(evoSuiteFile0);
      FileUtil fileUtil0 = new FileUtil();
      FileInputStream fileInputStream0 = fileUtil0.fetchSimilarItems("net.kencochrane.a4j.data.Query", "");
      assertNull(fileInputStream0);
  }

  /**
  //Test case number: 33
  /*Coverage entropy=0.9502705392332347
  */
  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      File file0 = fileUtil0.getSimilarItems("SimilaritySearch", "?");
      assertNull(file0);
  }

  /**
  //Test case number: 34
  /*Coverage entropy=1.6417347121875212
  */
  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("/A_EOZ!KD|I*$_.XML");
      FileSystemHandling.createFolder(evoSuiteFile0);
      FileUtil fileUtil0 = new FileUtil();
      ArrayList<String> arrayList0 = new ArrayList<String>();
      FileInputStream fileInputStream0 = fileUtil0.fetchAccessories("eOz!KD|I*$_", arrayList0);
      assertNull(fileInputStream0);
  }

  /**
  //Test case number: 35
  /*Coverage entropy=1.242453324894
  */
  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      ArrayList<String> arrayList0 = new ArrayList<String>();
      FileInputStream fileInputStream0 = fileUtil0.fetchAccessories("*c:o4@_Dh=VDyf", arrayList0);
      assertNull(fileInputStream0);
  }

  /**
  //Test case number: 36
  /*Coverage entropy=1.4708084763221112
  */
  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("/A_EOZ!KD|I*$_.XML");
      FileSystemHandling.createFolder(evoSuiteFile0);
      FileUtil fileUtil0 = new FileUtil();
      ArrayList<String> arrayList0 = new ArrayList<String>();
      File file0 = fileUtil0.getAccessories("eOz!KD|I*$_", arrayList0);
      assertNotNull(file0);
      assertEquals("/A_EOZ!KD|I*$_.XML", file0.toString());
      assertTrue(file0.canExecute());
  }

  /**
  //Test case number: 37
  /*Coverage entropy=0.9502705392332347
  */
  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      ArrayList<String> arrayList0 = new ArrayList<String>();
      File file0 = fileUtil0.getAccessories("eOz!KD|I*$_", arrayList0);
      assertNull(file0);
  }

  /**
  //Test case number: 38
  /*Coverage entropy=1.0397207708399179
  */
  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      FileInputStream fileInputStream0 = fileUtil0.fetchThirdPartySearchFile("r", "net.kencochrane.a4j.util.a4jUtil", "Ypq\"k_uT]e", "r");
      assertNull(fileInputStream0);
  }

  /**
  //Test case number: 39
  /*Coverage entropy=0.5623351446188083
  */
  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      EvoSuiteURL evoSuiteURL0 = new EvoSuiteURL("http://xml.amazon.net/onca/xml3?t=popcornmonste2-20&dev-t=DSB0XDDW1GQ3S&SellerSearch=eOz!KD|I*$_&type=eOz!KD|I*$_&page=eOz!KD|I*$_&offerstatus=eOz!KD|I*$_&f=xml");
      NetworkHandling.createRemoteTextFile(evoSuiteURL0, "XwF=");
      FileUtil fileUtil0 = new FileUtil();
      File file0 = fileUtil0.downloadThirdPartySearchFile("eOz!KD|I*$_", "eOz!KD|I*$_", "eOz!KD|I*$_", "eOz!KD|I*$_");
      assertNull(file0);
  }

  /**
  //Test case number: 40
  /*Coverage entropy=1.0397207708399179
  */
  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      FileInputStream fileInputStream0 = fileUtil0.fetchGenericSearchFile("", "8A%D", ":#.:FM^RLt", "", "", "8A%D");
      assertNull(fileInputStream0);
  }

  /**
  //Test case number: 41
  /*Coverage entropy=0.5623351446188083
  */
  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      EvoSuiteURL evoSuiteURL0 = new EvoSuiteURL("http://xml.amazon.net/onca/xml3?t=popcornmonste2-20&dev-t=DSB0XDDW1GQ3S&&Item.=%26Item.&mode=&Item.&type=&Item.&page=&Item.&offer=&Item.&f=xml");
      NetworkHandling.createRemoteTextFile(evoSuiteURL0, "T1Z?z-h.)%Gs'T");
      FileUtil fileUtil0 = new FileUtil();
      File file0 = fileUtil0.downloadGenericSearchFile("&Item.", "&Item.", "&Item.", "&Item.", "&Item.", "&Item.");
      assertNull(file0);
  }

  /**
  //Test case number: 42
  /*Coverage entropy=1.0397207708399179
  */
  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      FileInputStream fileInputStream0 = fileUtil0.fetchKeywordSearchFile("There is no Properties File Setting to default", (String) null, "There is no Properties File Setting to default", (String) null);
      assertNull(fileInputStream0);
  }

  /**
  //Test case number: 43
  /*Coverage entropy=0.5623351446188083
  */
  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      EvoSuiteURL evoSuiteURL0 = new EvoSuiteURL("http://xml.amazon.net/onca/xml3?t=popcornmonste2-20&dev-t=DSB0XDDW1GQ3S&KeywordSearch=There+is+no+Properties+File+Setting+to+default&mode=There is no Properties File Setting to default&type=There is no Properties File Setting to default&page=There is no Properties File Setting to default&f=xml");
      NetworkHandling.createRemoteTextFile(evoSuiteURL0, "There is no Properties File Setting to default");
      File file0 = fileUtil0.downloadKeywordSearchFile("There is no Properties File Setting to default", "There is no Properties File Setting to default", "There is no Properties File Setting to default", "There is no Properties File Setting to default");
      assertNull(file0);
  }

  /**
  //Test case number: 44
  /*Coverage entropy=0.9502705392332347
  */
  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      EvoSuiteURL evoSuiteURL0 = new EvoSuiteURL("http://xml.amazon.net/onca/xml3?t=popcornmonste2-20&dev-t=DSB0XDDW1GQ3S&BlendedSearch=cceir&type=cceir&f=xml");
      NetworkHandling.createRemoteTextFile(evoSuiteURL0, "cceir");
      FileInputStream fileInputStream0 = fileUtil0.fetchBlendedSearchFile("cceir", "cceir");
      assertNull(fileInputStream0);
  }

  /**
  //Test case number: 45
  /*Coverage entropy=1.6417347121875212
  */
  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("/OFFER=_OFFER=_OFFER=.XML");
      FileSystemHandling.appendLineToFile(evoSuiteFile0, "M|");
      FileInputStream fileInputStream0 = fileUtil0.fetchBNFile("offer=", "offer=", "offer=");
      assertEquals(3, fileInputStream0.available());
  }

  /**
  //Test case number: 46
  /*Coverage entropy=1.2424533248940002
  */
  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      FileInputStream fileInputStream0 = fileUtil0.fetchBNFile("(@Bj\"c@", "(@Bj\"c@", "offer=");
      assertNull(fileInputStream0);
  }

  /**
  //Test case number: 47
  /*Coverage entropy=1.4708084763221114
  */
  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("/_C__.XML");
      FileSystemHandling.appendStringToFile(evoSuiteFile0, "c_");
      File file0 = fileUtil0.getBrowseNodeFile("", "c_", "");
      assertEquals(2L, file0.length());
      assertNotNull(file0);
  }

  /**
  //Test case number: 48
  /*Coverage entropy=1.6417347121875212
  */
  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("/___A4J-CONFIG.TXT.XML");
      FileSystemHandling.appendStringToFile(evoSuiteFile0, "&Asin.");
      FileUtil fileUtil0 = new FileUtil();
      FileInputStream fileInputStream0 = fileUtil0.fetchASINFile("", "", "", "a4j-config.txt");
      assertEquals(6, fileInputStream0.available());
  }

  /**
  //Test case number: 49
  /*Coverage entropy=0.6365141682948128
  */
  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      fileUtil0.renameFile("a4j-config.txt", "dev-t=");
  }

  /**
  //Test case number: 50
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      boolean boolean0 = fileUtil0.isAgeGood((File) null);
      assertFalse(boolean0);
  }

  /**
  //Test case number: 51
  /*Coverage entropy=1.515707952085713
  */
  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("/&=OUDJ!3P#VQ~~}T;_&=OUDJ!3P#VQ~~}T;_&=OUDJ!3P#VQ~~}T;_&=OUDJ!3P#VQ~~}T;.XML");
      FileSystemHandling.appendLineToFile(evoSuiteFile0, "0@BG&gX*0#CL:Huko-)");
      EvoSuiteURL evoSuiteURL0 = new EvoSuiteURL("http://xml.amazon.net/onca/xml3?t=popcornmonste2-20&dev-t=DSB0XDDW1GQ3S&AsinSearch=&=ouDj!3p#VQ~~}T;&type=&=ouDj!3p#VQ~~}T;&offerpage=&=ouDj!3p#VQ~~}T;&offer=&=ouDj!3p#VQ~~}T;&f=xml");
      NetworkHandling.createRemoteTextFile(evoSuiteURL0, " $L(!v8");
      File file0 = fileUtil0.getASINFile("&=ouDj!3p#VQ~~}T;", "&=ouDj!3p#VQ~~}T;", "&=ouDj!3p#VQ~~}T;", "&=ouDj!3p#VQ~~}T;");
      assertNotNull(file0);
      assertEquals(20L, file0.length());
  }

  /**
  //Test case number: 52
  /*Coverage entropy=0.6365141682948128
  */
  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      fileUtil0.deleteFile("b_");
  }

  /**
  //Test case number: 53
  /*Coverage entropy=1.0114042647073516
  */
  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      EvoSuiteURL evoSuiteURL0 = new EvoSuiteURL("http://xml.amazon.net/onca/xml3?t=popcornmonste2-20&dev-t=DSB0XDDW1GQ3S&AsinSearch=&=ouDj!3p#VQ~~}T;&type=&=ouDj!3p#VQ~~}T;&offerpage=&=ouDj!3p#VQ~~}T;&offer=&=ouDj!3p#VQ~~}T;&f=xml");
      NetworkHandling.createRemoteTextFile(evoSuiteURL0, " $L(v8");
      File file0 = fileUtil0.getASINFile("&=ouDj!3p#VQ~~}T;", "&=ouDj!3p#VQ~~}T;", "&=ouDj!3p#VQ~~}T;", "&=ouDj!3p#VQ~~}T;");
      assertNull(file0);
  }
}
