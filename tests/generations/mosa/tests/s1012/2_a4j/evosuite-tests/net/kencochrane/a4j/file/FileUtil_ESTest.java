/*
 * This file was automatically generated by EvoSuite
 * Sat Nov 07 01:58:10 GMT 2020
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
      FileInputStream fileInputStream0 = fileUtil0.fetchThirdPartySearchFile("t=", "4.dUB%H5b,`'8LL~>>", "t=", "t=");
      assertNull(fileInputStream0);
  }

  /**
  //Test case number: 1
  /*Coverage entropy=1.0397207708399179
  */
  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      FileInputStream fileInputStream0 = fileUtil0.fetchThirdPartySearchFile("/Li$", "/Li$", "/Li$", "&h'pH__a");
      assertNull(fileInputStream0);
  }

  /**
  //Test case number: 2
  /*Coverage entropy=1.0397207708399179
  */
  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      FileInputStream fileInputStream0 = fileUtil0.fetchGenericSearchFile("cacheDir", "cacheDir", "page=", (String) null, (String) null, "page=");
      assertNull(fileInputStream0);
  }

  /**
  //Test case number: 3
  /*Coverage entropy=1.0397207708399179
  */
  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      FileInputStream fileInputStream0 = fileUtil0.fetchGenericSearchFile("AsinSearch", "/", "/", "AsinSearch", "AsinSearch", "AsinSearch");
      assertNull(fileInputStream0);
  }

  /**
  //Test case number: 4
  /*Coverage entropy=1.0397207708399179
  */
  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      FileInputStream fileInputStream0 = fileUtil0.fetchKeywordSearchFile("offer=", (String) null, (String) null, (String) null);
      assertNull(fileInputStream0);
  }

  /**
  //Test case number: 5
  /*Coverage entropy=1.0397207708399179
  */
  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      FileInputStream fileInputStream0 = fileUtil0.fetchKeywordSearchFile("UpFk8", "UpFk8", "UpFk8", "|n'f");
      assertNull(fileInputStream0);
  }

  /**
  //Test case number: 6
  /*Coverage entropy=1.242453324894
  */
  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      FileInputStream fileInputStream0 = fileUtil0.fetchASINFile("k_", "u(ba", "k_", "u(ba");
      assertNull(fileInputStream0);
  }

  /**
  //Test case number: 7
  /*Coverage entropy=1.242453324894
  */
  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      FileInputStream fileInputStream0 = fileUtil0.fetchASINFile("Z,gTt2_SJqxZ5", "cacheDir", "cacheDir", "Z,gTt2_SJqxZ5");
      assertNull(fileInputStream0);
  }

  /**
  //Test case number: 8
  /*Coverage entropy=1.6417347121875212
  */
  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("/__.XML");
      FileSystemHandling.createFolder(evoSuiteFile0);
      FileInputStream fileInputStream0 = fileUtil0.fetchBNFile("", "", "");
      assertNull(fileInputStream0);
  }

  /**
  //Test case number: 9
  /*Coverage entropy=1.6417347121875212
  */
  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("/CACHEDIR_CACHEDIR_CACHEDIR_CACHEDIR.XML");
      FileSystemHandling.createFolder(evoSuiteFile0);
      FileInputStream fileInputStream0 = fileUtil0.fetchASINFile("cacheDir", "cacheDir", "cacheDir", "cacheDir");
      assertNull(fileInputStream0);
  }

  /**
  //Test case number: 10
  /*Coverage entropy=1.4708084763221112
  */
  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("/S_.XML");
      FileSystemHandling.appendLineToFile(evoSuiteFile0, "2tt4CJy5");
      File file0 = fileUtil0.getSimilarItems("", "");
      assertEquals(9L, file0.length());
      assertNotNull(file0);
  }

  /**
  //Test case number: 11
  /*Coverage entropy=1.4708084763221114
  */
  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("/>;EEN;LZ_>;EEN;LZ_>;EEN;LZ.XML");
      FileSystemHandling.createFolder(evoSuiteFile0);
      File file0 = fileUtil0.getBrowseNodeFile(">;EEN;lZ", ">;EEN;lZ", ">;EEN;lZ");
      assertFalse(file0.isFile());
      assertEquals("/>;EEN;LZ_>;EEN;LZ_>;EEN;LZ.XML", file0.toString());
      assertNotNull(file0);
  }

  /**
  //Test case number: 12
  /*Coverage entropy=1.4708084763221112
  */
  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("/A_.XML");
      FileSystemHandling.appendStringToFile(evoSuiteFile0, "_");
      FileUtil fileUtil0 = new FileUtil();
      File file0 = fileUtil0.getAccessories("", (ArrayList) null);
      assertNotNull(file0);
      assertEquals(1L, file0.length());
  }

  /**
  //Test case number: 13
  /*Coverage entropy=1.4708084763221112
  */
  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("/A_.XML");
      FileSystemHandling.createFolder(evoSuiteFile0);
      FileUtil fileUtil0 = new FileUtil();
      FileSystemHandling.setPermissions(evoSuiteFile0, false, false, false);
      File file0 = fileUtil0.getAccessories("", (ArrayList) null);
      assertNotNull(file0);
      assertFalse(file0.canWrite());
  }

  /**
  //Test case number: 14
  /*Coverage entropy=1.4708084763221112
  */
  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("/___.XML");
      FileSystemHandling.createFolder(evoSuiteFile0);
      FileUtil fileUtil0 = new FileUtil();
      FileSystemHandling.setPermissions(evoSuiteFile0, false, false, true);
      File file0 = fileUtil0.getASINFile("", "", "", "");
      assertEquals("___.XML", file0.getName());
      assertNotNull(file0);
  }

  /**
  //Test case number: 15
  /*Coverage entropy=1.4708084763221112
  */
  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("/___.XML");
      FileSystemHandling.appendLineToFile(evoSuiteFile0, "qb=P_>S:");
      FileSystemHandling.setPermissions(evoSuiteFile0, true, true, false);
      File file0 = fileUtil0.getASINFile("", "", "", "");
      assertEquals(9L, file0.length());
      assertNotNull(file0);
  }

  /**
  //Test case number: 16
  /*Coverage entropy=1.6417347121875212
  */
  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("/S_5Z[%B.XML");
      FileSystemHandling.appendStringToFile(evoSuiteFile0, "^Sx[0R");
      FileInputStream fileInputStream0 = fileUtil0.fetchSimilarItems("5Z[%b", ", ");
      assertEquals(6, fileInputStream0.available());
  }

  /**
  //Test case number: 17
  /*Coverage entropy=1.6417347121875212
  */
  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("/__T=.XML");
      FileSystemHandling.appendStringToFile(evoSuiteFile0, "offerstatus=");
      FileInputStream fileInputStream0 = fileUtil0.fetchBNFile("", "", "t=");
      assertEquals(12, fileInputStream0.available());
  }

  /**
  //Test case number: 18
  /*Coverage entropy=1.6417347121875212
  */
  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("/A_.XML");
      byte[] byteArray0 = new byte[0];
      FileSystemHandling.appendDataToFile(evoSuiteFile0, byteArray0);
      FileUtil fileUtil0 = new FileUtil();
      ArrayList<Integer> arrayList0 = new ArrayList<Integer>();
      FileInputStream fileInputStream0 = fileUtil0.fetchAccessories("", arrayList0);
      assertEquals(0, fileInputStream0.available());
  }

  /**
  //Test case number: 19
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      boolean boolean0 = fileUtil0.downloadBrowseNodeFile("", ";N=Wv=|S{$$'Q'7~1", "", "");
      assertFalse(boolean0);
  }

  /**
  //Test case number: 20
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      ArrayList<Integer> arrayList0 = new ArrayList<Integer>();
      boolean boolean0 = fileUtil0.downloadAccessoriesFile("`#i-K", arrayList0, "t_");
      assertFalse(boolean0);
  }

  /**
  //Test case number: 21
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
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
  //Test case number: 22
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
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
  //Test case number: 23
  /*Coverage entropy=0.6365141682948128
  */
  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      EvoSuiteURL evoSuiteURL0 = new EvoSuiteURL("http://xml.amazon.net/onca/xml3?t=popcornmonste2-20&dev-t=DSB0XDDW1GQ3S&SimilaritySearch=&type=lite&offerpage=CVYnL5F&offer=all&f=xml");
      NetworkHandling.createRemoteTextFile(evoSuiteURL0, "X!'-Krx}hE");
      boolean boolean0 = fileUtil0.downloadSimilaritesFile("", "CVYnL5F", "CVYnL5F");
      assertFalse(boolean0);
  }

  /**
  //Test case number: 24
  /*Coverage entropy=1.4708084763221112
  */
  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("/S_A_.XML");
      FileSystemHandling.createFolder(evoSuiteFile0);
      FileUtil fileUtil0 = new FileUtil();
      File file0 = fileUtil0.getSimilarItems("a_", "a_");
      assertNotNull(file0);
      assertTrue(file0.canExecute());
      assertEquals("/S_A_.XML", file0.toString());
  }

  /**
  //Test case number: 25
  /*Coverage entropy=0.9502705392332347
  */
  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      File file0 = fileUtil0.getSimilarItems("a_", "a_");
      assertNull(file0);
  }

  /**
  //Test case number: 26
  /*Coverage entropy=0.6365141682948128
  */
  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      EvoSuiteURL evoSuiteURL0 = new EvoSuiteURL("http://xml.amazon.net/onca/xml3?t=popcornmonste2-20&dev-t=DSB0XDDW1GQ3S&AsinSearch=5+DC5k%ydv }/0x8&&type=&offerpage=~jM$n&offer=&f=xml");
      NetworkHandling.createRemoteTextFile(evoSuiteURL0, "5+DC5k%ydv }/0x8&");
      boolean boolean0 = fileUtil0.downloadOneASINFile("5+DC5k%ydv }/0x8&", "", "", "~jM$n", "5+DC5k%ydv }/0x8&");
      assertFalse(boolean0);
  }

  /**
  //Test case number: 27
  /*Coverage entropy=0.6365141682948128
  */
  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      File file0 = fileUtil0.downloadCart("");
      assertNull(file0);
  }

  /**
  //Test case number: 28
  /*Coverage entropy=1.277034259466139
  */
  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      EvoSuiteURL evoSuiteURL0 = new EvoSuiteURL("http://xml.amazon.net/onca/xml3?t=popcornmonste2-20&dev-t=DSB0XDDW1GQ3S&SimilaritySearch=5+DC5k%ydv }/0x8&&type=lite&offerpage=&offer=all&f=xml");
      NetworkHandling.createRemoteTextFile(evoSuiteURL0, "5+DC5k%ydv }/0x8&");
      FileInputStream fileInputStream0 = fileUtil0.fetchSimilarItems("5+DC5k%ydv }/0x8&", "");
      assertNull(fileInputStream0);
  }

  /**
  //Test case number: 29
  /*Coverage entropy=1.6417347121875212
  */
  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("/S_5+DC5K%YDV }/0X8&.XML");
      FileSystemHandling.createFolder(evoSuiteFile0);
      FileInputStream fileInputStream0 = fileUtil0.fetchSimilarItems("5+DC5k%ydv }/0x8&", ".u=\":lLQHCmh");
      assertNull(fileInputStream0);
  }

  /**
  //Test case number: 30
  /*Coverage entropy=1.6417347121875212
  */
  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("/A_.XML");
      FileSystemHandling.createFolder(evoSuiteFile0);
      FileUtil fileUtil0 = new FileUtil();
      FileInputStream fileInputStream0 = fileUtil0.fetchAccessories("", (ArrayList) null);
      assertNull(fileInputStream0);
  }

  /**
  //Test case number: 31
  /*Coverage entropy=1.242453324894
  */
  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      ArrayList<Object> arrayList0 = new ArrayList<Object>();
      FileInputStream fileInputStream0 = fileUtil0.fetchAccessories(", ", arrayList0);
      assertNull(fileInputStream0);
  }

  /**
  //Test case number: 32
  /*Coverage entropy=0.9502705392332347
  */
  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      File file0 = fileUtil0.getAccessories("", (ArrayList) null);
      assertNull(file0);
  }

  /**
  //Test case number: 33
  /*Coverage entropy=1.0397207708399179
  */
  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      FileInputStream fileInputStream0 = fileUtil0.fetchThirdPartySearchFile("'", "5{w5ck:uC9}pXeI4y;", "5{w5ck:uC9}pXeI4y;", "5{w5ck:uC9}pXeI4y;");
      assertNull(fileInputStream0);
  }

  /**
  //Test case number: 34
  /*Coverage entropy=0.6365141682948128
  */
  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      File file0 = fileUtil0.downloadThirdPartySearchFile("V3<broPvFNrf+-", "qb=P_>S:", "V3<broPvFNrf+-", "qb=P_>S:");
      assertNull(file0);
  }

  /**
  //Test case number: 35
  /*Coverage entropy=1.0397207708399179
  */
  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      FileInputStream fileInputStream0 = fileUtil0.fetchGenericSearchFile("", "", "?4y'vW'i:_u`%p[(", "?4y'vW'i:_u`%p[(", "", "?4y'vW'i:_u`%p[(");
      assertNull(fileInputStream0);
  }

  /**
  //Test case number: 36
  /*Coverage entropy=0.5623351446188083
  */
  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      EvoSuiteURL evoSuiteURL0 = new EvoSuiteURL("http://xml.amazon.net/onca/xml3?t=popcornmonste2-20&dev-t=DSB0XDDW1GQ3S&null=&mode=Y6Q]n1^Jsm<1sMGR^&type=5+DC5k%ydv }/0x8&&page=Y6Q]n1^Jsm<1sMGR^&offer=~jM$n&f=xml");
      NetworkHandling.createRemoteTextFile(evoSuiteURL0, "5+DC5k%ydv }/0x8&");
      File file0 = fileUtil0.downloadGenericSearchFile((String) null, "", "Y6Q]n1^Jsm<1sMGR^", "5+DC5k%ydv }/0x8&", "Y6Q]n1^Jsm<1sMGR^", "~jM$n");
      assertNull(file0);
  }

  /**
  //Test case number: 37
  /*Coverage entropy=1.0397207708399179
  */
  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      FileInputStream fileInputStream0 = fileUtil0.fetchKeywordSearchFile("UTF-8", (String) null, "UTF-8", "UTF-8");
      assertNull(fileInputStream0);
  }

  /**
  //Test case number: 38
  /*Coverage entropy=1.0397207708399179
  */
  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      FileInputStream fileInputStream0 = fileUtil0.fetchBlendedSearchFile("", "&Item.");
      assertNull(fileInputStream0);
  }

  /**
  //Test case number: 39
  /*Coverage entropy=0.5623351446188083
  */
  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      EvoSuiteURL evoSuiteURL0 = new EvoSuiteURL("http://xml.amazon.net/onca/xml3?t=popcornmonste2-20&dev-t=DSB0XDDW1GQ3S&KeywordSearch=&mode=&type=&page=&f=xml");
      NetworkHandling.createRemoteTextFile(evoSuiteURL0, "SellerSearch=");
      File file0 = fileUtil0.downloadKeywordSearchFile("", "", "", "");
      assertNull(file0);
  }

  /**
  //Test case number: 40
  /*Coverage entropy=0.5623351446188083
  */
  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      EvoSuiteURL evoSuiteURL0 = new EvoSuiteURL("http://xml.amazon.net/onca/xml3?t=popcornmonste2-20&dev-t=DSB0XDDW1GQ3S&BlendedSearch=de-t&type=de-t&f=xml");
      NetworkHandling.createRemoteTextFile(evoSuiteURL0, "de-t");
      File file0 = fileUtil0.downloadBlendedSearchFile("de-t", "de-t");
      assertNull(file0);
  }

  /**
  //Test case number: 41
  /*Coverage entropy=1.6417347121875212
  */
  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("/__.XML");
      FileSystemHandling.appendStringToFile(evoSuiteFile0, "");
      FileInputStream fileInputStream0 = fileUtil0.fetchBNFile("", "", "");
      assertEquals(0, fileInputStream0.available());
  }

  /**
  //Test case number: 42
  /*Coverage entropy=1.2424533248940002
  */
  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      FileInputStream fileInputStream0 = fileUtil0.fetchBNFile("", "UTF-8", "UTF-8");
      assertNull(fileInputStream0);
  }

  /**
  //Test case number: 43
  /*Coverage entropy=1.4708084763221114
  */
  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("/>;EEN;LZ_>;EEN;LZ_>;EEN;LZ.XML");
      FileSystemHandling.appendStringToFile(evoSuiteFile0, "86400000");
      File file0 = fileUtil0.getBrowseNodeFile(">;EEN;lZ", ">;EEN;lZ", ">;EEN;lZ");
      assertNotNull(file0);
      assertEquals(8L, file0.length());
  }

  /**
  //Test case number: 44
  /*Coverage entropy=1.0114042647073518
  */
  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      EvoSuiteURL evoSuiteURL0 = new EvoSuiteURL("http://xml.amazon.net/onca/xml3?t=popcornmonste2-20&dev-t=DSB0XDDW1GQ3S&BrowseNodeSearch=, &mode=^Sx[0R&type=lite&page=^Sx[0R&offer=new&f=xml");
      NetworkHandling.createRemoteTextFile(evoSuiteURL0, "{ipmm3ZRM_O%WD5UEX");
      File file0 = fileUtil0.getBrowseNodeFile("^Sx[0R", ", ", "^Sx[0R");
      assertNull(file0);
  }

  /**
  //Test case number: 45
  /*Coverage entropy=1.6417347121875212
  */
  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("/CACHEDIR_CACHEDIR_CACHEDIR_CACHEDIR.XML");
      FileSystemHandling.appendLineToFile(evoSuiteFile0, "cacheDir");
      FileInputStream fileInputStream0 = fileUtil0.fetchASINFile("cacheDir", "cacheDir", "cacheDir", "cacheDir");
      assertEquals(9, fileInputStream0.available());
  }

  /**
  //Test case number: 46
  /*Coverage entropy=0.6365141682948128
  */
  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      fileUtil0.renameFile("/", "/");
  }

  /**
  //Test case number: 47
  /*Coverage entropy=0.6365141682948128
  */
  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      fileUtil0.renameFile("t=", "! (oVC#M$6d:ZP");
  }

  /**
  //Test case number: 48
  /*Coverage entropy=0.6365141682948128
  */
  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      MockFile mockFile0 = new MockFile(", ");
      boolean boolean0 = fileUtil0.isAgeGood(mockFile0);
      assertFalse(boolean0);
  }

  /**
  //Test case number: 49
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      boolean boolean0 = fileUtil0.isAgeGood((File) null);
      assertFalse(boolean0);
  }

  /**
  //Test case number: 50
  /*Coverage entropy=0.6365141682948128
  */
  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      fileUtil0.deleteFile("");
  }

  /**
  //Test case number: 51
  /*Coverage entropy=0.6365141682948128
  */
  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      fileUtil0.deleteFile("net.kencochrane.a4j.file.FileUtil");
  }

  /**
  //Test case number: 52
  /*Coverage entropy=1.0114042647073516
  */
  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      EvoSuiteURL evoSuiteURL0 = new EvoSuiteURL("http://xml.amazon.net/onca/xml3?t=popcornmonste2-20&dev-t=DSB0XDDW1GQ3S&AsinSearch=&type=&offerpage=&offer=&f=xml");
      NetworkHandling.createRemoteTextFile(evoSuiteURL0, "5+DC5k%ydv }/0x8&");
      File file0 = fileUtil0.getASINFile("", "", "", "");
      assertNull(file0);
  }
}
