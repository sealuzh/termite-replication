/*
 * This file was automatically generated by EvoSuite
 * Mon Nov 09 16:44:06 GMT 2020
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
      FileInputStream fileInputStream0 = fileUtil0.fetchGenericSearchFile(".xml", ".xml", "O4kTv", ".xml", "", ".xml");
      assertNull(fileInputStream0);
  }

  /**
  //Test case number: 1
  /*Coverage entropy=1.0397207708399179
  */
  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      FileInputStream fileInputStream0 = fileUtil0.fetchGenericSearchFile("~F", "new", "~F", "", "~F", "~F");
      assertNull(fileInputStream0);
  }

  /**
  //Test case number: 2
  /*Coverage entropy=1.0397207708399179
  */
  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      FileInputStream fileInputStream0 = fileUtil0.fetchGenericSearchFile("", "", "", "", "", "UTF-8");
      assertNull(fileInputStream0);
  }

  /**
  //Test case number: 3
  /*Coverage entropy=0.6365141682948128
  */
  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      File file0 = fileUtil0.downloadGenericSearchFile("z:`Q>:KHyV", "z:`Q>:KHyV", "z:`Q>:KHyV", "_#z(&v_*0q)FE2.',", "z:`Q>:KHyV", "_#z(&v_*0q)FE2.',");
      assertNull(file0);
  }

  /**
  //Test case number: 4
  /*Coverage entropy=1.0397207708399179
  */
  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      FileInputStream fileInputStream0 = fileUtil0.fetchKeywordSearchFile("c_", "1", "c_", "3{1|RqIFqZqtSia\"y");
      assertNull(fileInputStream0);
  }

  /**
  //Test case number: 5
  /*Coverage entropy=1.0397207708399179
  */
  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      FileInputStream fileInputStream0 = fileUtil0.fetchBlendedSearchFile("nJ-/zncA'tlubQ27", "");
      assertNull(fileInputStream0);
  }

  /**
  //Test case number: 6
  /*Coverage entropy=0.6365141682948128
  */
  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      File file0 = fileUtil0.downloadKeywordSearchFile("new", "new", "URLSep(rator", "URLSep(rator");
      assertNull(file0);
  }

  /**
  //Test case number: 7
  /*Coverage entropy=1.242453324894
  */
  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      FileInputStream fileInputStream0 = fileUtil0.fetchASINFile("SimilaritySearch", "mu^B#n)kuv+P/C", "SimilaritySearch", "mu^B#n)kuv+P/C");
      assertNull(fileInputStream0);
  }

  /**
  //Test case number: 8
  /*Coverage entropy=1.242453324894
  */
  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      FileInputStream fileInputStream0 = fileUtil0.fetchASINFile(" 2B<]@W&]PR` 6+lYu", " 2B<]@W&]PR` 6+lYu", " 2B<]@W&]PR` 6+lYu", "\"sSJ'/`wxrd:");
      assertNull(fileInputStream0);
  }

  /**
  //Test case number: 9
  /*Coverage entropy=1.242453324894
  */
  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      FileInputStream fileInputStream0 = fileUtil0.fetchASINFile((String) null, "X", "X", (String) null);
      assertNull(fileInputStream0);
  }

  /**
  //Test case number: 10
  /*Coverage entropy=0.6365141682948128
  */
  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      fileUtil0.renameFile("net.kencochrane.a4j.data.Query", "oGwS0F?Pp");
  }

  /**
  //Test case number: 11
  /*Coverage entropy=0.6365141682948128
  */
  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      MockFile mockFile0 = new MockFile("}@X*xn2Ut6(h`3HrKqH");
      boolean boolean0 = fileUtil0.isAgeGood(mockFile0);
      assertFalse(boolean0);
  }

  /**
  //Test case number: 12
  /*Coverage entropy=0.6365141682948128
  */
  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      fileUtil0.renameFile("/", "/");
  }

  /**
  //Test case number: 13
  /*Coverage entropy=1.6417347121875212
  */
  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("/A_.XML");
      FileSystemHandling.createFolder(evoSuiteFile0);
      ArrayList<Object> arrayList0 = new ArrayList<Object>();
      FileUtil fileUtil0 = new FileUtil();
      FileInputStream fileInputStream0 = fileUtil0.fetchAccessories("", arrayList0);
      assertNull(fileInputStream0);
  }

  /**
  //Test case number: 14
  /*Coverage entropy=0.6365141682948128
  */
  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      File file0 = fileUtil0.downloadBlendedSearchFile("&Hmac=", "z:`Q>:KHyV");
      assertNull(file0);
  }

  /**
  //Test case number: 15
  /*Coverage entropy=0.9502705392332347
  */
  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      ArrayList<Object> arrayList0 = new ArrayList<Object>();
      EvoSuiteURL evoSuiteURL0 = new EvoSuiteURL("http://xml.amazon.net/onca/xml3?t=popcornmonste2-20&dev-t=DSB0XDDW1GQ3S&AsinSearch=null&type=lite&offerpage=1&offer=all&f=xml");
      NetworkHandling.createRemoteTextFile(evoSuiteURL0, "");
      arrayList0.add((Object) null);
      File file0 = fileUtil0.getAccessories("Wv", arrayList0);
      assertNull(file0);
  }

  /**
  //Test case number: 16
  /*Coverage entropy=1.4708084763221112
  */
  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("/S_.XML");
      FileSystemHandling.appendStringToFile(evoSuiteFile0, ".xml");
      File file0 = fileUtil0.getSimilarItems("", "O4kTv");
      assertNotNull(file0);
      assertEquals(4L, file0.length());
  }

  /**
  //Test case number: 17
  /*Coverage entropy=1.4708084763221112
  */
  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("/S_.XML");
      FileSystemHandling.createFolder(evoSuiteFile0);
      FileUtil fileUtil0 = new FileUtil();
      FileSystemHandling.setPermissions(evoSuiteFile0, false, true, false);
      File file0 = fileUtil0.getSimilarItems("", "");
      assertEquals("S_.XML", file0.getName());
      assertTrue(file0.canWrite());
      assertNotNull(file0);
  }

  /**
  //Test case number: 18
  /*Coverage entropy=1.4708084763221112
  */
  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("/A_WV.XML");
      FileSystemHandling.appendLineToFile(evoSuiteFile0, "");
      ArrayList<Object> arrayList0 = new ArrayList<Object>();
      File file0 = fileUtil0.getAccessories("Wv", arrayList0);
      assertEquals(1L, file0.length());
      assertNotNull(file0);
  }

  /**
  //Test case number: 19
  /*Coverage entropy=1.4708084763221112
  */
  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("/UTF-8_UTF-8_UTF-8_UTF-8.XML");
      byte[] byteArray0 = new byte[5];
      FileSystemHandling.appendDataToFile(evoSuiteFile0, byteArray0);
      FileUtil fileUtil0 = new FileUtil();
      File file0 = fileUtil0.getASINFile("UTF-8", "UTF-8", "UTF-8", "UTF-8");
      assertNotNull(file0);
      assertEquals(5L, file0.length());
  }

  /**
  //Test case number: 20
  /*Coverage entropy=1.6417347121875212
  */
  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("/S_.XML");
      FileSystemHandling.appendLineToFile(evoSuiteFile0, "BlendedSearch=");
      FileUtil fileUtil0 = new FileUtil();
      FileInputStream fileInputStream0 = fileUtil0.fetchSimilarItems("", "*B");
      assertEquals(15, fileInputStream0.available());
  }

  /**
  //Test case number: 21
  /*Coverage entropy=1.6417347121875212
  */
  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("/SK__.XML");
      byte[] byteArray0 = new byte[5];
      FileSystemHandling.appendDataToFile(evoSuiteFile0, byteArray0);
      FileInputStream fileInputStream0 = fileUtil0.fetchBNFile("Sk", "", "");
      assertEquals(5, fileInputStream0.available());
  }

  /**
  //Test case number: 22
  /*Coverage entropy=1.6417347121875212
  */
  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("/A_.XML");
      FileSystemHandling.appendStringToFile(evoSuiteFile0, "");
      ArrayList<Object> arrayList0 = new ArrayList<Object>();
      FileInputStream fileInputStream0 = fileUtil0.fetchAccessories("", arrayList0);
      assertEquals(0, fileInputStream0.available());
  }

  /**
  //Test case number: 23
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      boolean boolean0 = fileUtil0.downloadOneASINFile(" 2B<]@W&]PR` 6+lYu", "w\">@l4m62bhjF", "URLSep(rator", "w\">@l4m62bhjF", "URLSep(rator");
      assertFalse(boolean0);
  }

  /**
  //Test case number: 24
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      ArrayList<String> arrayList0 = new ArrayList<String>();
      boolean boolean0 = fileUtil0.downloadAccessoriesFile("ShoppingCart=clear&f=xml&dev-t=", arrayList0, "ShoppingCart=clear&f=xml&dev-t=");
      assertFalse(boolean0);
  }

  /**
  //Test case number: 25
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
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
  //Test case number: 26
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
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
  //Test case number: 27
  /*Coverage entropy=0.6365141682948128
  */
  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      EvoSuiteURL evoSuiteURL0 = new EvoSuiteURL("http://xml.amazon.net/onca/xml3?t=popcornmonste2-20&dev-t=DSB0XDDW1GQ3S&SimilaritySearch=&type=lite&offerpage={*B&offer=all&f=xml");
      NetworkHandling.createRemoteTextFile(evoSuiteURL0, "db9WKe`1P0n2-Xg2");
      FileUtil fileUtil0 = new FileUtil();
      boolean boolean0 = fileUtil0.downloadSimilaritesFile("", "{*B", "db9WKe`1P0n2-Xg2");
      assertFalse(boolean0);
  }

  /**
  //Test case number: 28
  /*Coverage entropy=1.4708084763221112
  */
  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("/A_WV.XML");
      ArrayList<Object> arrayList0 = new ArrayList<Object>();
      FileSystemHandling.createFolder(evoSuiteFile0);
      File file0 = fileUtil0.getAccessories("Wv", arrayList0);
      assertEquals("A_WV.XML", file0.getName());
      assertNotNull(file0);
      assertTrue(file0.canExecute());
  }

  /**
  //Test case number: 29
  /*Coverage entropy=0.5623351446188083
  */
  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      EvoSuiteURL evoSuiteURL0 = new EvoSuiteURL("http://xml.amazon.net/onca/xml3?t=popcornmonste2-20&dev-t=DSB0XDDW1GQ3S&BlendedSearch=1&type=1&f=xml");
      NetworkHandling.createRemoteTextFile(evoSuiteURL0, "R\"IJf!I`DF*:y/sQn^c");
      FileUtil fileUtil0 = new FileUtil();
      File file0 = fileUtil0.downloadBlendedSearchFile("1", "1");
      assertNull(file0);
  }

  /**
  //Test case number: 30
  /*Coverage entropy=0.9502705392332347
  */
  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      File file0 = fileUtil0.getBrowseNodeFile("P;X6qYG>)%$/:", "P;X6qYG>)%$/:", "P;X6qYG>)%$/:");
      assertNull(file0);
  }

  /**
  //Test case number: 31
  /*Coverage entropy=0.9502705392332347
  */
  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      File file0 = fileUtil0.getASINFile("%Mk(y!", "", "%Mk(y!", "%Mk(y!");
      assertNull(file0);
  }

  /**
  //Test case number: 32
  /*Coverage entropy=0.6365141682948128
  */
  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("s_");
      byte[] byteArray0 = new byte[6];
      FileSystemHandling.appendDataToFile(evoSuiteFile0, byteArray0);
      FileUtil fileUtil0 = new FileUtil();
      fileUtil0.deleteFile("s_");
  }

  /**
  //Test case number: 33
  /*Coverage entropy=0.6365141682948128
  */
  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      fileUtil0.deleteFile("O4kTv");
  }

  /**
  //Test case number: 34
  /*Coverage entropy=0.6365141682948128
  */
  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      File file0 = fileUtil0.downloadCart("z:`Q>J>.KHy*");
      assertNull(file0);
  }

  /**
  //Test case number: 35
  /*Coverage entropy=1.277034259466139
  */
  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      EvoSuiteURL evoSuiteURL0 = new EvoSuiteURL("http://xml.amazon.net/onca/xml3?t=popcornmonste2-20&dev-t=DSB0XDDW1GQ3S&SimilaritySearch=&type=lite&offerpage={*B&offer=all&f=xml");
      NetworkHandling.createRemoteTextFile(evoSuiteURL0, "db9WKe`1P0n2-Xg2");
      FileUtil fileUtil0 = new FileUtil();
      FileInputStream fileInputStream0 = fileUtil0.fetchSimilarItems("", "{*B");
      assertNull(fileInputStream0);
  }

  /**
  //Test case number: 36
  /*Coverage entropy=1.6417347121875212
  */
  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("/S_.XML");
      FileSystemHandling.createFolder(evoSuiteFile0);
      FileUtil fileUtil0 = new FileUtil();
      FileInputStream fileInputStream0 = fileUtil0.fetchSimilarItems("", "{*B");
      assertNull(fileInputStream0);
  }

  /**
  //Test case number: 37
  /*Coverage entropy=0.9502705392332347
  */
  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      File file0 = fileUtil0.getSimilarItems("uY71djivUM4`Z)s", "t_");
      assertNull(file0);
  }

  /**
  //Test case number: 38
  /*Coverage entropy=1.242453324894
  */
  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      ArrayList<Object> arrayList0 = new ArrayList<Object>();
      FileInputStream fileInputStream0 = fileUtil0.fetchAccessories("nJ-/zncA'tlubQ27", arrayList0);
      assertNull(fileInputStream0);
  }

  /**
  //Test case number: 39
  /*Coverage entropy=1.6417347121875212
  */
  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("/A_.XML");
      FileSystemHandling.appendLineToFile(evoSuiteFile0, "ts_");
      ArrayList<Object> arrayList0 = new ArrayList<Object>();
      FileInputStream fileInputStream0 = fileUtil0.fetchAccessories("", arrayList0);
      assertEquals(4, fileInputStream0.available());
  }

  /**
  //Test case number: 40
  /*Coverage entropy=1.0397207708399179
  */
  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      FileInputStream fileInputStream0 = fileUtil0.fetchThirdPartySearchFile((String) null, "", "2!xPU+", "cacheLife");
      assertNull(fileInputStream0);
  }

  /**
  //Test case number: 41
  /*Coverage entropy=0.5623351446188083
  */
  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      EvoSuiteURL evoSuiteURL0 = new EvoSuiteURL("http://xml.amazon.net/onca/xml3?t=popcornmonste2-20&dev-t=DSB0XDDW1GQ3S&SellerSearch=&type=&page=K-@/&PM0HHnJl>G&offerstatus=&f=xml");
      NetworkHandling.createRemoteTextFile(evoSuiteURL0, "K-@/&PM0HHnJl>G");
      FileUtil fileUtil0 = new FileUtil();
      File file0 = fileUtil0.downloadThirdPartySearchFile("", "", "K-@/&PM0HHnJl>G", "");
      assertNull(file0);
  }

  /**
  //Test case number: 42
  /*Coverage entropy=0.9502705392332347
  */
  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      EvoSuiteURL evoSuiteURL0 = new EvoSuiteURL("http://xml.amazon.net/onca/xml3?t=popcornmonste2-20&dev-t=DSB0XDDW1GQ3S&\"sSJ'/`wxrd:=%22sSJ%27%2F%60wxrd%3A&mode=\"sSJ'/`wxrd:&type= 2B<]@W&]PR` 6+lYu&page=\"sSJ'/`wxrd:&offer=\"sSJ'/`wxrd:&f=xml");
      NetworkHandling.createRemoteTextFile(evoSuiteURL0, " 2B<]@W&]PR` 6+lYu");
      FileInputStream fileInputStream0 = fileUtil0.fetchGenericSearchFile("\"sSJ'/`wxrd:", "\"sSJ'/`wxrd:", "\"sSJ'/`wxrd:", " 2B<]@W&]PR` 6+lYu", "\"sSJ'/`wxrd:", "\"sSJ'/`wxrd:");
      assertNull(fileInputStream0);
  }

  /**
  //Test case number: 43
  /*Coverage entropy=1.0397207708399179
  */
  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      FileInputStream fileInputStream0 = fileUtil0.fetchKeywordSearchFile("H8dnN+[!z%@VZwd-Hb", "~h[}u]B3]>FE55", "~h[}u]B3]>FE55", "H8dnN+[!z%@VZwd-Hb");
      assertNull(fileInputStream0);
  }

  /**
  //Test case number: 44
  /*Coverage entropy=0.5623351446188083
  */
  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      EvoSuiteURL evoSuiteURL0 = new EvoSuiteURL("http://xml.amazon.net/onca/xml3?t=popcornmonste2-20&dev-t=DSB0XDDW1GQ3S&KeywordSearch=&mode=#5wF%$R C8Ac{IuZ&type=&page=&f=xml");
      NetworkHandling.createRemoteTextFile(evoSuiteURL0, "3{1|RqIFqZqtSia\"y");
      FileUtil fileUtil0 = new FileUtil();
      File file0 = fileUtil0.downloadKeywordSearchFile("", "#5wF%$R C8Ac{IuZ", "", "");
      assertNull(file0);
  }

  /**
  //Test case number: 45
  /*Coverage entropy=1.6417347121875212
  */
  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("/SK__.XML");
      FileSystemHandling.createFolder(evoSuiteFile0);
      FileInputStream fileInputStream0 = fileUtil0.fetchBNFile("Sk", "", "");
      assertNull(fileInputStream0);
  }

  /**
  //Test case number: 46
  /*Coverage entropy=1.2424533248940002
  */
  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      FileInputStream fileInputStream0 = fileUtil0.fetchBNFile("\"sSJ'/`wxrd:", " 2B<]@W&]PR` 6+lYu", "\"sSJ'/`wxrd:");
      assertNull(fileInputStream0);
  }

  /**
  //Test case number: 47
  /*Coverage entropy=0.6365141682948128
  */
  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      EvoSuiteURL evoSuiteURL0 = new EvoSuiteURL("http://xml.amazon.net/onca/xml3?t=popcornmonste2-20&dev-t=DSB0XDDW1GQ3S&BrowseNodeSearch=null&mode=z:`Q>:KHyV&type=lite&page=z:`Q>:KHyV&offer=new&f=xml");
      NetworkHandling.createRemoteTextFile(evoSuiteURL0, "z:`Q>:KHyV");
      boolean boolean0 = fileUtil0.downloadBrowseNodeFile("z:`Q>:KHyV", (String) null, "z:`Q>:KHyV", "Uire");
      assertFalse(boolean0);
  }

  /**
  //Test case number: 48
  /*Coverage entropy=1.6762349391347309
  */
  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      EvoSuiteURL evoSuiteURL0 = new EvoSuiteURL("http://xml.amazon.net/onca/xml3?t=popcornmonste2-20&dev-t=DSB0XDDW1GQ3S&AsinSearch=SimilaritySearch&type=SimilaritySearch&offerpage=SimilaritySearch&offer=SimilaritySearch&f=xml");
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("/SIMILARITYSEARCH_SIMILARITYSEARCH_SIMILARITYSEARCH_SIMILARITYSEARCH.XML");
      FileSystemHandling.appendLineToFile(evoSuiteFile0, "ShoppingCart=modify&f=xml&dev-t=");
      NetworkHandling.createRemoteTextFile(evoSuiteURL0, "<G6DX|(^N1{hg%j~$G?^");
      FileUtil fileUtil0 = new FileUtil();
      FileInputStream fileInputStream0 = fileUtil0.fetchASINFile("SimilaritySearch", "SimilaritySearch", "SimilaritySearch", "SimilaritySearch");
      assertNotNull(fileInputStream0);
      assertEquals(33, fileInputStream0.available());
  }

  /**
  //Test case number: 49
  /*Coverage entropy=1.4708084763221112
  */
  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("/UTF-8_UTF-8_UTF-8_UTF-8.XML");
      FileSystemHandling.createFolder(evoSuiteFile0);
      FileUtil fileUtil0 = new FileUtil();
      File file0 = fileUtil0.getASINFile("UTF-8", "UTF-8", "UTF-8", "UTF-8");
      assertNotNull(file0);
      assertEquals(1392409281320L, file0.lastModified());
      assertEquals("/UTF-8_UTF-8_UTF-8_UTF-8.XML", file0.toString());
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
}
