/*
 * This file was automatically generated by EvoSuite
 * Sat Nov 28 07:28:44 GMT 2020
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
      FileInputStream fileInputStream0 = fileUtil0.fetchThirdPartySearchFile("c_", "g#/KWu##09:%@!u@", "c_", "c_");
      assertNull(fileInputStream0);
  }

  /**
  //Test case number: 1
  /*Coverage entropy=1.0397207708399179
  */
  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      FileInputStream fileInputStream0 = fileUtil0.fetchThirdPartySearchFile("g#/KWu##09:%@!u@", "g#/KWu##09:%@!u@", "g#/KWu##09:%@!u@", "ShoppingCart=clear&f=xml&dev-t=");
      assertNull(fileInputStream0);
  }

  /**
  //Test case number: 2
  /*Coverage entropy=1.0397207708399179
  */
  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      FileInputStream fileInputStream0 = fileUtil0.fetchThirdPartySearchFile("", "eTM3 YW/O'.J~", "eTM3 YW/O'.J~", "");
      assertNull(fileInputStream0);
  }

  /**
  //Test case number: 3
  /*Coverage entropy=1.0397207708399179
  */
  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      FileInputStream fileInputStream0 = fileUtil0.fetchGenericSearchFile("ta_", "", "", "", "", "ta_");
      assertNull(fileInputStream0);
  }

  /**
  //Test case number: 4
  /*Coverage entropy=1.2424533248940002
  */
  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      FileInputStream fileInputStream0 = fileUtil0.fetchBNFile("ShppingCart=clear&f=xml&dev-t=", "UdT_SeHfj(44F~&s", "ShppingCart=clear&f=xml&dev-t=");
      assertNull(fileInputStream0);
  }

  /**
  //Test case number: 5
  /*Coverage entropy=1.242453324894
  */
  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      FileInputStream fileInputStream0 = fileUtil0.fetchASINFile("", "", "cacheLife", "");
      assertNull(fileInputStream0);
  }

  /**
  //Test case number: 6
  /*Coverage entropy=1.6417347121875212
  */
  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("/G0/KWT##09`%BM!U@_G0/KWT##09`%BM!U@_G0/KWT##09`%BM!U@.XML");
      FileSystemHandling.createFolder(evoSuiteFile0);
      FileUtil fileUtil0 = new FileUtil();
      FileInputStream fileInputStream0 = fileUtil0.fetchBNFile("g0/KWt##09`%BM!u@", "g0/KWt##09`%BM!u@", "g0/KWt##09`%BM!u@");
      assertNull(fileInputStream0);
  }

  /**
  //Test case number: 7
  /*Coverage entropy=1.6417347121875212
  */
  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("/___.XML");
      FileSystemHandling.createFolder(evoSuiteFile0);
      FileInputStream fileInputStream0 = fileUtil0.fetchASINFile("", "", "", "");
      assertNull(fileInputStream0);
  }

  /**
  //Test case number: 8
  /*Coverage entropy=1.4708084763221112
  */
  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("/S_SHOPPINGCART=CLEAR&F=XML&DEV-T=.XML");
      FileSystemHandling.appendStringToFile(evoSuiteFile0, "=L");
      FileUtil fileUtil0 = new FileUtil();
      File file0 = fileUtil0.getSimilarItems("ShoppingCart=clear&f=xml&dev-t=", "ShoppingCart=clear&f=xml&dev-t=");
      assertEquals(2L, file0.length());
      assertNotNull(file0);
  }

  /**
  //Test case number: 9
  /*Coverage entropy=1.4708084763221112
  */
  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("/A_NULL.XML");
      byte[] byteArray0 = new byte[1];
      FileSystemHandling.appendDataToFile(evoSuiteFile0, byteArray0);
      ArrayList<Object> arrayList0 = new ArrayList<Object>();
      File file0 = fileUtil0.getAccessories((String) null, arrayList0);
      assertNotNull(file0);
      assertEquals(1L, file0.length());
  }

  /**
  //Test case number: 10
  /*Coverage entropy=1.4708084763221112
  */
  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("/A_.XML");
      FileSystemHandling.appendStringToFile(evoSuiteFile0, "");
      ArrayList<Object> arrayList0 = new ArrayList<Object>();
      File file0 = fileUtil0.getAccessories("", arrayList0);
      assertNotNull(file0);
      assertTrue(file0.isFile());
      assertEquals(1392409281320L, file0.lastModified());
  }

  /**
  //Test case number: 11
  /*Coverage entropy=1.4708084763221112
  */
  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("/___.XML");
      byte[] byteArray0 = new byte[0];
      FileSystemHandling.appendDataToFile(evoSuiteFile0, byteArray0);
      FileUtil fileUtil0 = new FileUtil();
      File file0 = fileUtil0.getASINFile("", "", "", "");
      assertNotNull(file0);
      assertTrue(file0.isFile());
      assertTrue(file0.canExecute());
  }

  /**
  //Test case number: 12
  /*Coverage entropy=1.6417347121875212
  */
  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("/S_.XML");
      byte[] byteArray0 = new byte[1];
      FileSystemHandling.appendDataToFile(evoSuiteFile0, byteArray0);
      FileUtil fileUtil0 = new FileUtil();
      FileInputStream fileInputStream0 = fileUtil0.fetchSimilarItems("", "");
      assertEquals(1, fileInputStream0.available());
  }

  /**
  //Test case number: 13
  /*Coverage entropy=1.6417347121875212
  */
  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("/NULL_ADVN+6P1UD8U_NULL_ADVN+6P1UD8U.XML");
      FileSystemHandling.appendLineToFile(evoSuiteFile0, "s_");
      FileUtil fileUtil0 = new FileUtil();
      FileInputStream fileInputStream0 = fileUtil0.fetchASINFile((String) null, (String) null, "Advn+6P1uD8u", "Advn+6P1uD8u");
      assertEquals(3, fileInputStream0.available());
  }

  /**
  //Test case number: 14
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
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
  //Test case number: 15
  /*Coverage entropy=0.6365141682948128
  */
  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      MockFile mockFile0 = new MockFile(":yr#TfdrQ", ":yr#TfdrQ");
      boolean boolean0 = fileUtil0.isAgeGood(mockFile0);
      assertFalse(boolean0);
  }

  /**
  //Test case number: 16
  /*Coverage entropy=0.9502705392332347
  */
  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      File file0 = fileUtil0.getSimilarItems((String) null, (String) null);
      assertNull(file0);
  }

  /**
  //Test case number: 17
  /*Coverage entropy=0.9502705392332347
  */
  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      File file0 = fileUtil0.getBrowseNodeFile((String) null, (String) null, (String) null);
      assertNull(file0);
  }

  /**
  //Test case number: 18
  /*Coverage entropy=0.9502705392332347
  */
  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      File file0 = fileUtil0.getBrowseNodeFile("", "", "");
      assertNull(file0);
  }

  /**
  //Test case number: 19
  /*Coverage entropy=1.242453324894
  */
  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      ArrayList<Object> arrayList0 = new ArrayList<Object>();
      arrayList0.add((Object) fileUtil0);
      File file0 = fileUtil0.getAccessories("", arrayList0);
      assertNull(file0);
  }

  /**
  //Test case number: 20
  /*Coverage entropy=0.9502705392332347
  */
  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      File file0 = fileUtil0.getAccessories("%I&=9l~ g", (ArrayList) null);
      assertNull(file0);
  }

  /**
  //Test case number: 21
  /*Coverage entropy=0.9502705392332347
  */
  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      File file0 = fileUtil0.getASINFile("", (String) null, (String) null, "");
      assertNull(file0);
  }

  /**
  //Test case number: 22
  /*Coverage entropy=0.9502705392332347
  */
  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      File file0 = fileUtil0.getASINFile((String) null, "", "", (String) null);
      assertNull(file0);
  }

  /**
  //Test case number: 23
  /*Coverage entropy=0.9502705392332347
  */
  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      File file0 = fileUtil0.getASINFile("kFJA=m>bne?=", "kFJA=m>bne?=", "kFJA=m>bne?=", "kFJA=m>bne?=");
      assertNull(file0);
  }

  /**
  //Test case number: 24
  /*Coverage entropy=1.0397207708399179
  */
  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      FileInputStream fileInputStream0 = fileUtil0.fetchThirdPartySearchFile((String) null, (String) null, (String) null, (String) null);
      assertNull(fileInputStream0);
  }

  /**
  //Test case number: 25
  /*Coverage entropy=1.242453324894
  */
  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      FileInputStream fileInputStream0 = fileUtil0.fetchSimilarItems("", "");
      assertNull(fileInputStream0);
  }

  /**
  //Test case number: 26
  /*Coverage entropy=1.242453324894
  */
  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      FileInputStream fileInputStream0 = fileUtil0.fetchSimilarItems((String) null, (String) null);
      assertNull(fileInputStream0);
  }

  /**
  //Test case number: 27
  /*Coverage entropy=1.0397207708399179
  */
  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      FileInputStream fileInputStream0 = fileUtil0.fetchKeywordSearchFile("1go-L", "641,$7QD@n\"~)#C3Tf", "1go-L", "1go-L");
      assertNull(fileInputStream0);
  }

  /**
  //Test case number: 28
  /*Coverage entropy=1.0397207708399179
  */
  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      FileInputStream fileInputStream0 = fileUtil0.fetchKeywordSearchFile((String) null, (String) null, (String) null, (String) null);
      assertNull(fileInputStream0);
  }

  /**
  //Test case number: 29
  /*Coverage entropy=1.0397207708399179
  */
  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      FileInputStream fileInputStream0 = fileUtil0.fetchKeywordSearchFile("net.kencochrane.a4j.util.L1adProperties", "new", "", "");
      assertNull(fileInputStream0);
  }

  /**
  //Test case number: 30
  /*Coverage entropy=1.0397207708399179
  */
  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      FileInputStream fileInputStream0 = fileUtil0.fetchGenericSearchFile("s_", "s_", "", "", "s_", "");
      assertNull(fileInputStream0);
  }

  /**
  //Test case number: 31
  /*Coverage entropy=1.0397207708399179
  */
  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      FileInputStream fileInputStream0 = fileUtil0.fetchGenericSearchFile((String) null, (String) null, (String) null, (String) null, (String) null, (String) null);
      assertNull(fileInputStream0);
  }

  /**
  //Test case number: 32
  /*Coverage entropy=1.0397207708399179
  */
  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      FileInputStream fileInputStream0 = fileUtil0.fetchGenericSearchFile("", "", "2", "", "", "");
      assertNull(fileInputStream0);
  }

  /**
  //Test case number: 33
  /*Coverage entropy=1.0397207708399179
  */
  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      FileInputStream fileInputStream0 = fileUtil0.fetchBlendedSearchFile("", "");
      assertNull(fileInputStream0);
  }

  /**
  //Test case number: 34
  /*Coverage entropy=1.0397207708399179
  */
  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      FileInputStream fileInputStream0 = fileUtil0.fetchBlendedSearchFile((String) null, (String) null);
      assertNull(fileInputStream0);
  }

  /**
  //Test case number: 35
  /*Coverage entropy=1.0397207708399179
  */
  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      FileInputStream fileInputStream0 = fileUtil0.fetchBlendedSearchFile("5fs\u0000`]o", "5fs\u0000`]o");
      assertNull(fileInputStream0);
  }

  /**
  //Test case number: 36
  /*Coverage entropy=1.2424533248940002
  */
  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      FileInputStream fileInputStream0 = fileUtil0.fetchBNFile("", "", "");
      assertNull(fileInputStream0);
  }

  /**
  //Test case number: 37
  /*Coverage entropy=1.2424533248940002
  */
  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      FileInputStream fileInputStream0 = fileUtil0.fetchBNFile((String) null, (String) null, (String) null);
      assertNull(fileInputStream0);
  }

  /**
  //Test case number: 38
  /*Coverage entropy=1.2424533248940002
  */
  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      FileInputStream fileInputStream0 = fileUtil0.fetchBNFile("", "kFJA=m>bne?=", "kFJA=m>bne?=");
      assertNull(fileInputStream0);
  }

  /**
  //Test case number: 39
  /*Coverage entropy=1.242453324894
  */
  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      FileInputStream fileInputStream0 = fileUtil0.fetchAccessories("*j3Ej%n7R", (ArrayList) null);
      assertNull(fileInputStream0);
  }

  /**
  //Test case number: 40
  /*Coverage entropy=1.242453324894
  */
  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      ArrayList<Object> arrayList0 = new ArrayList<Object>();
      arrayList0.add((Object) "");
      FileInputStream fileInputStream0 = fileUtil0.fetchAccessories("ShoppingCart=modify&f=xml&dev-t=", arrayList0);
      assertNull(fileInputStream0);
  }

  /**
  //Test case number: 41
  /*Coverage entropy=1.242453324894
  */
  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      ArrayList<Integer> arrayList0 = new ArrayList<Integer>();
      FileInputStream fileInputStream0 = fileUtil0.fetchAccessories((String) null, arrayList0);
      assertNull(fileInputStream0);
  }

  /**
  //Test case number: 42
  /*Coverage entropy=1.242453324894
  */
  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      ArrayList<Integer> arrayList0 = new ArrayList<Integer>();
      FileInputStream fileInputStream0 = fileUtil0.fetchAccessories("", arrayList0);
      assertNull(fileInputStream0);
  }

  /**
  //Test case number: 43
  /*Coverage entropy=1.242453324894
  */
  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      FileInputStream fileInputStream0 = fileUtil0.fetchASINFile((String) null, (String) null, (String) null, (String) null);
      assertNull(fileInputStream0);
  }

  /**
  //Test case number: 44
  /*Coverage entropy=1.242453324894
  */
  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      FileInputStream fileInputStream0 = fileUtil0.fetchASINFile("+", "+", "+", "+");
      assertNull(fileInputStream0);
  }

  /**
  //Test case number: 45
  /*Coverage entropy=1.242453324894
  */
  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      FileInputStream fileInputStream0 = fileUtil0.fetchASINFile("3rd_", "", "3rd_", "3rd_");
      assertNull(fileInputStream0);
  }

  /**
  //Test case number: 46
  /*Coverage entropy=0.6365141682948128
  */
  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      File file0 = fileUtil0.downloadThirdPartySearchFile("uy@I]4ry:`mo", "uy@I]4ry:`mo", "uy@I]4ry:`mo", "uy@I]4ry:`mo");
      assertNull(file0);
  }

  /**
  //Test case number: 47
  /*Coverage entropy=0.6365141682948128
  */
  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      File file0 = fileUtil0.downloadThirdPartySearchFile((String) null, (String) null, "", (String) null);
      assertNull(file0);
  }

  /**
  //Test case number: 48
  /*Coverage entropy=0.6365141682948128
  */
  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      File file0 = fileUtil0.downloadThirdPartySearchFile("http://xml.amazon.net/onca/xml3", (String) null, (String) null, (String) null);
      assertNull(file0);
  }

  /**
  //Test case number: 49
  /*Coverage entropy=0.6365141682948128
  */
  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      File file0 = fileUtil0.downloadThirdPartySearchFile("", "", "", "");
      assertNull(file0);
  }

  /**
  //Test case number: 50
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      boolean boolean0 = fileUtil0.downloadSimilaritesFile((String) null, (String) null, (String) null);
      assertFalse(boolean0);
  }

  /**
  //Test case number: 51
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      boolean boolean0 = fileUtil0.downloadSimilaritesFile("8}{2tqW%T|YlY(jRQS", "8}{2tqW%T|YlY(jRQS", "");
      assertFalse(boolean0);
  }

  /**
  //Test case number: 52
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      boolean boolean0 = fileUtil0.downloadSimilaritesFile("", "", "cacheLife");
      assertFalse(boolean0);
  }

  /**
  //Test case number: 53
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      boolean boolean0 = fileUtil0.downloadOneASINFile("http://xml.amazon.net/onca/xml3", "http://xml.amazon.net/onca/xml3", "http://xml.amazon.net/onca/xml3", "http://xml.amazon.net/onca/xml3", "http://xml.amazon.net/onca/xml3");
      assertFalse(boolean0);
  }

  /**
  //Test case number: 54
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      boolean boolean0 = fileUtil0.downloadOneASINFile((String) null, (String) null, (String) null, (String) null, (String) null);
      assertFalse(boolean0);
  }

  /**
  //Test case number: 55
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      boolean boolean0 = fileUtil0.downloadOneASINFile("http://xml.amazon.net/onca/xml3", "http://xml.amazon.net/onca/xml3", "", "http://xml.amazon.net/onca/xml3", "");
      assertFalse(boolean0);
  }

  /**
  //Test case number: 56
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test56()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      boolean boolean0 = fileUtil0.downloadOneASINFile("", "", "", "", "");
      assertFalse(boolean0);
  }

  /**
  //Test case number: 57
  /*Coverage entropy=0.6365141682948128
  */
  @Test(timeout = 4000)
  public void test57()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      File file0 = fileUtil0.downloadKeywordSearchFile((String) null, (String) null, (String) null, (String) null);
      assertNull(file0);
  }

  /**
  //Test case number: 58
  /*Coverage entropy=0.6365141682948128
  */
  @Test(timeout = 4000)
  public void test58()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      File file0 = fileUtil0.downloadKeywordSearchFile((String) null, "_^8TdA:x;>8Rm@7", "_^8TdA:x;>8Rm@7", "_^8TdA:x;>8Rm@7");
      assertNull(file0);
  }

  /**
  //Test case number: 59
  /*Coverage entropy=0.6365141682948128
  */
  @Test(timeout = 4000)
  public void test59()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      File file0 = fileUtil0.downloadKeywordSearchFile("ShoppingCart=modify&f=xml&dev-t=", "ShoppingCart=modify&f=xml&dev-t=", "ShoppingCart=modify&f=xml&dev-t=", "");
      assertNull(file0);
  }

  /**
  //Test case number: 60
  /*Coverage entropy=0.6365141682948128
  */
  @Test(timeout = 4000)
  public void test60()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      File file0 = fileUtil0.downloadKeywordSearchFile("", "", "", "");
      assertNull(file0);
  }

  /**
  //Test case number: 61
  /*Coverage entropy=0.6365141682948128
  */
  @Test(timeout = 4000)
  public void test61()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      File file0 = fileUtil0.downloadGenericSearchFile("", "", "", "", "", "");
      assertNull(file0);
  }

  /**
  //Test case number: 62
  /*Coverage entropy=0.6365141682948128
  */
  @Test(timeout = 4000)
  public void test62()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      File file0 = fileUtil0.downloadGenericSearchFile((String) null, "k_", (String) null, "1Q", "1Q", (String) null);
      assertNull(file0);
  }

  /**
  //Test case number: 63
  /*Coverage entropy=0.6365141682948128
  */
  @Test(timeout = 4000)
  public void test63()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      File file0 = fileUtil0.downloadGenericSearchFile("641,$7QD@n\"~)#C3Tf", (String) null, "1go-L", "641,$7QD@n\"~)#C3Tf", (String) null, "1go-L");
      assertNull(file0);
  }

  /**
  //Test case number: 64
  /*Coverage entropy=0.6365141682948128
  */
  @Test(timeout = 4000)
  public void test64()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      File file0 = fileUtil0.downloadGenericSearchFile("", "", "", (String) null, (String) null, "R#7i.jHYm@ZVH");
      assertNull(file0);
  }

  /**
  //Test case number: 65
  /*Coverage entropy=0.6365141682948128
  */
  @Test(timeout = 4000)
  public void test65()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      File file0 = fileUtil0.downloadCart((String) null);
      assertNull(file0);
  }

  /**
  //Test case number: 66
  /*Coverage entropy=0.6365141682948128
  */
  @Test(timeout = 4000)
  public void test66()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      File file0 = fileUtil0.downloadCart("uy@I]4ry:`mo");
      assertNull(file0);
  }

  /**
  //Test case number: 67
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test67()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      boolean boolean0 = fileUtil0.downloadBrowseNodeFile("", "", "", "");
      assertFalse(boolean0);
  }

  /**
  //Test case number: 68
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test68()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      boolean boolean0 = fileUtil0.downloadBrowseNodeFile((String) null, "\"D(2+.", "\"D(2+.", "h");
      assertFalse(boolean0);
  }

  /**
  //Test case number: 69
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test69()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      boolean boolean0 = fileUtil0.downloadBrowseNodeFile("%I&=9l~ g", (String) null, (String) null, (String) null);
      assertFalse(boolean0);
  }

  /**
  //Test case number: 70
  /*Coverage entropy=0.6365141682948128
  */
  @Test(timeout = 4000)
  public void test70()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      File file0 = fileUtil0.downloadBlendedSearchFile((String) null, (String) null);
      assertNull(file0);
  }

  /**
  //Test case number: 71
  /*Coverage entropy=0.6365141682948128
  */
  @Test(timeout = 4000)
  public void test71()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      File file0 = fileUtil0.downloadBlendedSearchFile("kFJA=m>bne?=", "EPxCuN+WTt},7X M");
      assertNull(file0);
  }

  /**
  //Test case number: 72
  /*Coverage entropy=0.6365141682948128
  */
  @Test(timeout = 4000)
  public void test72()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      File file0 = fileUtil0.downloadBlendedSearchFile("", "");
      assertNull(file0);
  }

  /**
  //Test case number: 73
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test73()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      ArrayList<Object> arrayList0 = new ArrayList<Object>();
      arrayList0.add((Object) "a_");
      boolean boolean0 = fileUtil0.downloadAccessoriesFile("a_", arrayList0, "a_");
      assertFalse(boolean0);
  }

  /**
  //Test case number: 74
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test74()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      ArrayList<String> arrayList0 = new ArrayList<String>();
      boolean boolean0 = fileUtil0.downloadAccessoriesFile((String) null, arrayList0, (String) null);
      assertFalse(boolean0);
  }

  /**
  //Test case number: 75
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test75()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      boolean boolean0 = fileUtil0.downloadAccessoriesFile("", (ArrayList) null, "");
      assertFalse(boolean0);
  }

  /**
  //Test case number: 76
  /*Coverage entropy=0.6365141682948128
  */
  @Test(timeout = 4000)
  public void test76()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      fileUtil0.deleteFile("qhJ;3DNO5`S5xd");
  }

  /**
  //Test case number: 77
  /*Coverage entropy=0.6365141682948128
  */
  @Test(timeout = 4000)
  public void test77()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      fileUtil0.deleteFile("");
  }

  /**
  //Test case number: 78
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test78()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      // Undeclared exception!
      try { 
        fileUtil0.renameFile("", (String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.io.File", e);
      }
  }

  /**
  //Test case number: 79
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test79()  throws Throwable  {
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
  //Test case number: 80
  /*Coverage entropy=0.6365141682948128
  */
  @Test(timeout = 4000)
  public void test80()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      File file0 = fileUtil0.downloadCart("");
      assertNull(file0);
  }

  /**
  //Test case number: 81
  /*Coverage entropy=1.6417347121875212
  */
  @Test(timeout = 4000)
  public void test81()  throws Throwable  {
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("/S_.XML");
      byte[] byteArray0 = new byte[0];
      FileSystemHandling.appendDataToFile(evoSuiteFile0, byteArray0);
      FileUtil fileUtil0 = new FileUtil();
      FileInputStream fileInputStream0 = fileUtil0.fetchSimilarItems("", (String) null);
      assertEquals(0, fileInputStream0.available());
  }

  /**
  //Test case number: 82
  /*Coverage entropy=1.242453324894
  */
  @Test(timeout = 4000)
  public void test82()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      FileInputStream fileInputStream0 = fileUtil0.fetchSimilarItems("5fs\u0000`]o", "5fs\u0000`]o");
      assertNull(fileInputStream0);
  }

  /**
  //Test case number: 83
  /*Coverage entropy=1.0114042647073516
  */
  @Test(timeout = 4000)
  public void test83()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      EvoSuiteURL evoSuiteURL0 = new EvoSuiteURL("http://xml.amazon.net/onca/xml3?t=popcornmonste2-20&dev-t=DSB0XDDW1GQ3S&SimilaritySearch=%I&=9l~ g&type=lite&offerpage=%I&=9l~ g&offer=all&f=xml");
      NetworkHandling.createRemoteTextFile(evoSuiteURL0, "7S@ To3MP {Y/ I+");
      File file0 = fileUtil0.getSimilarItems("%I&=9l~ g", "%I&=9l~ g");
      assertNull(file0);
  }

  /**
  //Test case number: 84
  /*Coverage entropy=1.4708084763221112
  */
  @Test(timeout = 4000)
  public void test84()  throws Throwable  {
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("/S_.XML");
      byte[] byteArray0 = new byte[0];
      FileSystemHandling.appendDataToFile(evoSuiteFile0, byteArray0);
      FileUtil fileUtil0 = new FileUtil();
      File file0 = fileUtil0.getSimilarItems("", "");
      assertNotNull(file0);
      assertTrue(file0.isFile());
      assertTrue(file0.canExecute());
  }

  /**
  //Test case number: 85
  /*Coverage entropy=1.4708084763221112
  */
  @Test(timeout = 4000)
  public void test85()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("/A_NULL.XML");
      FileSystemHandling.createFolder(evoSuiteFile0);
      ArrayList<Object> arrayList0 = new ArrayList<Object>();
      File file0 = fileUtil0.getAccessories((String) null, arrayList0);
      assertNotNull(file0);
      assertEquals("/A_NULL.XML", file0.toString());
      assertFalse(file0.isFile());
  }

  /**
  //Test case number: 86
  /*Coverage entropy=0.9502705392332347
  */
  @Test(timeout = 4000)
  public void test86()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      EvoSuiteURL evoSuiteURL0 = new EvoSuiteURL("http://xml.amazon.net/onca/xml3?t=popcornmonste2-20&dev-t=DSB0XDDW1GQ3S&SellerSearch=&type=&page=&offerstatus=&f=xml");
      NetworkHandling.createRemoteTextFile(evoSuiteURL0, "i>~6");
      FileInputStream fileInputStream0 = fileUtil0.fetchThirdPartySearchFile("", "", "", "");
      assertNull(fileInputStream0);
  }

  /**
  //Test case number: 87
  /*Coverage entropy=0.9502705392332347
  */
  @Test(timeout = 4000)
  public void test87()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      EvoSuiteURL evoSuiteURL0 = new EvoSuiteURL("http://xml.amazon.net/onca/xml3?t=popcornmonste2-20&dev-t=DSB0XDDW1GQ3S&type==type%3D&mode=&Hmac=&type=type=&page=&Hmac=&offer=type=&f=xml");
      NetworkHandling.createRemoteTextFile(evoSuiteURL0, "hZ72de#(\"59Yd$\"i)zS");
      FileInputStream fileInputStream0 = fileUtil0.fetchGenericSearchFile("type=", "type=", "&Hmac=", "type=", "&Hmac=", "type=");
      assertNull(fileInputStream0);
  }

  /**
  //Test case number: 88
  /*Coverage entropy=0.9502705392332347
  */
  @Test(timeout = 4000)
  public void test88()  throws Throwable  {
      EvoSuiteURL evoSuiteURL0 = new EvoSuiteURL("http://xml.amazon.net/onca/xml3?t=popcornmonste2-20&dev-t=DSB0XDDW1GQ3S&KeywordSearch=&mode=&type=&page=&f=xml");
      NetworkHandling.createRemoteTextFile(evoSuiteURL0, "eECMNq]2");
      FileUtil fileUtil0 = new FileUtil();
      FileInputStream fileInputStream0 = fileUtil0.fetchKeywordSearchFile("", "", "", "");
      assertNull(fileInputStream0);
  }

  /**
  //Test case number: 89
  /*Coverage entropy=1.0397207708399179
  */
  @Test(timeout = 4000)
  public void test89()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      FileInputStream fileInputStream0 = fileUtil0.fetchBlendedSearchFile("", "U}/aMG7p%CD");
      assertNull(fileInputStream0);
  }

  /**
  //Test case number: 90
  /*Coverage entropy=1.6417347121875212
  */
  @Test(timeout = 4000)
  public void test90()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("/UY@I]4RY:`MO_Y8U.0G_Y8U.0G.XML");
      FileSystemHandling.appendLineToFile(evoSuiteFile0, "uy@I]4ry:`mo");
      FileInputStream fileInputStream0 = fileUtil0.fetchBNFile("uy@I]4ry:`mo", "Y8U.0g", "Y8U.0g");
      assertEquals(13, fileInputStream0.available());
  }

  /**
  //Test case number: 91
  /*Coverage entropy=0.9502705392332347
  */
  @Test(timeout = 4000)
  public void test91()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      File file0 = fileUtil0.getBrowseNodeFile("kFJA=m>bne?=", "kFJA=m>bne?=", "kFJA=m>bne?=");
      assertNull(file0);
  }

  /**
  //Test case number: 92
  /*Coverage entropy=1.277034259466139
  */
  @Test(timeout = 4000)
  public void test92()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      EvoSuiteURL evoSuiteURL0 = new EvoSuiteURL("http://xml.amazon.net/onca/xml3?t=popcornmonste2-20&dev-t=DSB0XDDW1GQ3S&BrowseNodeSearch=Y8U.0g&mode=Y8U.0g&type=lite&page=Y8U.0g&offer=new&f=xml");
      NetworkHandling.createRemoteTextFile(evoSuiteURL0, "uy@]?I4ry:`mzo");
      FileInputStream fileInputStream0 = fileUtil0.fetchBNFile("Y8U.0g", "Y8U.0g", "Y8U.0g");
      assertNull(fileInputStream0);
  }

  /**
  //Test case number: 93
  /*Coverage entropy=0.6365141682948128
  */
  @Test(timeout = 4000)
  public void test93()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      fileUtil0.renameFile("ZQO52mVeNBzkq?WC!", "ZQO52mVeNBzkq?WC!");
  }

  /**
  //Test case number: 94
  /*Coverage entropy=0.6365141682948128
  */
  @Test(timeout = 4000)
  public void test94()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      fileUtil0.renameFile("", "");
  }

  /**
  //Test case number: 95
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test95()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      boolean boolean0 = fileUtil0.isAgeGood((File) null);
      assertFalse(boolean0);
  }

  /**
  //Test case number: 96
  /*Coverage entropy=1.6762349391347309
  */
  @Test(timeout = 4000)
  public void test96()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      EvoSuiteURL evoSuiteURL0 = new EvoSuiteURL("http://xml.amazon.net/onca/xml3?t=popcornmonste2-20&dev-t=DSB0XDDW1GQ3S&AsinSearch=&type=&offerpage=&offer=&f=xml");
      NetworkHandling.createRemoteTextFile(evoSuiteURL0, "net.kencochrane.a4j.util.L1adProperties");
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("/___.XML");
      FileSystemHandling.appendStringToFile(evoSuiteFile0, "");
      FileInputStream fileInputStream0 = fileUtil0.fetchASINFile("", "", "", "");
      assertNotNull(fileInputStream0);
      assertEquals(0, fileInputStream0.available());
  }
}
