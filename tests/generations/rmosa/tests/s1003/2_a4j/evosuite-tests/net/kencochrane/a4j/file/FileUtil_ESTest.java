/*
 * This file was automatically generated by EvoSuite
 * Sun Nov 08 05:24:34 GMT 2020
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
      FileInputStream fileInputStream0 = fileUtil0.fetchThirdPartySearchFile("y[WdL!5?S.", "t_", "<(r", "y[WdL!5?S.");
      assertNull(fileInputStream0);
  }

  /**
  //Test case number: 1
  /*Coverage entropy=1.0397207708399179
  */
  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      FileInputStream fileInputStream0 = fileUtil0.fetchGenericSearchFile("-", "]cXYEZ*,b1t[", "]cXYEZ*,b1t[", "", "-", "");
      assertNull(fileInputStream0);
  }

  /**
  //Test case number: 2
  /*Coverage entropy=1.0397207708399179
  */
  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      FileInputStream fileInputStream0 = fileUtil0.fetchGenericSearchFile("", "", "w0\"ZdBUohZG83)8pI", "", "w0\"ZdBUohZG83)8pI", "");
      assertNull(fileInputStream0);
  }

  /**
  //Test case number: 3
  /*Coverage entropy=0.6365141682948128
  */
  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      File file0 = fileUtil0.downloadGenericSearchFile("t=", "t=", "t=", "k_", "", "&Asin.");
      assertNull(file0);
  }

  /**
  //Test case number: 4
  /*Coverage entropy=1.0397207708399179
  */
  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      FileInputStream fileInputStream0 = fileUtil0.fetchKeywordSearchFile("s_", "s_", "", "s_");
      assertNull(fileInputStream0);
  }

  /**
  //Test case number: 5
  /*Coverage entropy=1.0397207708399179
  */
  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      FileInputStream fileInputStream0 = fileUtil0.fetchKeywordSearchFile("", "page=", "", "page=");
      assertNull(fileInputStream0);
  }

  /**
  //Test case number: 6
  /*Coverage entropy=1.2424533248940002
  */
  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      FileInputStream fileInputStream0 = fileUtil0.fetchBNFile((String) null, "ShoppingCart=ad&f=xml&dev-t=", (String) null);
      assertNull(fileInputStream0);
  }

  /**
  //Test case number: 7
  /*Coverage entropy=1.242453324894
  */
  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      FileInputStream fileInputStream0 = fileUtil0.fetchASINFile("?3CcD", "?3CcD", "?)sHgsXFIC6QP.", "?)sHgsXFIC6QP.");
      assertNull(fileInputStream0);
  }

  /**
  //Test case number: 8
  /*Coverage entropy=1.242453324894
  */
  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      FileInputStream fileInputStream0 = fileUtil0.fetchASINFile("", "new", "net.kencochrane.a4j.data.Query", "new");
      assertNull(fileInputStream0);
  }

  /**
  //Test case number: 9
  /*Coverage entropy=0.6365141682948128
  */
  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      fileUtil0.renameFile("_", "a4j-confi.txt");
  }

  /**
  //Test case number: 10
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      boolean boolean0 = fileUtil0.downloadOneASINFile("KIQ_Vr]3", "KIQ_Vr]3", "KIQ_Vr]3", "(c}Y", "(c}Y");
      assertFalse(boolean0);
  }

  /**
  //Test case number: 11
  /*Coverage entropy=1.6417347121875212
  */
  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("/PAGE=_PAGE=_PAGE=.XML");
      FileSystemHandling.createFolder(evoSuiteFile0);
      FileInputStream fileInputStream0 = fileUtil0.fetchBNFile("page=", "page=", "page=");
      assertNull(fileInputStream0);
  }

  /**
  //Test case number: 12
  /*Coverage entropy=1.6417347121875212
  */
  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("/A_KIQ_VR]3.XML");
      FileSystemHandling.createFolder(evoSuiteFile0);
      ArrayList<String> arrayList0 = new ArrayList<String>();
      FileInputStream fileInputStream0 = fileUtil0.fetchAccessories("KIQ_Vr]3", arrayList0);
      assertNull(fileInputStream0);
  }

  /**
  //Test case number: 13
  /*Coverage entropy=1.6417347121875212
  */
  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("Kv)(F;I?3CCD_?3CCD_?3CCD_?3CCD.XML");
      FileSystemHandling.createFolder(evoSuiteFile0);
      FileUtil fileUtil0 = new FileUtil();
      fileUtil0.cacheDir = "Kv)(F;I";
      FileInputStream fileInputStream0 = fileUtil0.fetchASINFile("?3CcD", "?3CcD", "?3CcD", "?3CcD");
      assertNull(fileInputStream0);
  }

  /**
  //Test case number: 14
  /*Coverage entropy=1.4708084763221112
  */
  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("/S_.XML");
      FileSystemHandling.appendStringToFile(evoSuiteFile0, "");
      FileUtil fileUtil0 = new FileUtil();
      File file0 = fileUtil0.getSimilarItems("", "");
      assertNotNull(file0);
      assertEquals("S_.XML", file0.getName());
      assertEquals(1392409281320L, file0.lastModified());
  }

  /**
  //Test case number: 15
  /*Coverage entropy=1.4708084763221114
  */
  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("/NET.KENCOCHRANE.A4J.FILE.FILEUTIL_NET.KENCOCHRANE.A4J.FILE.FILEUTIL_NULL.XML");
      byte[] byteArray0 = new byte[1];
      FileSystemHandling.appendDataToFile(evoSuiteFile0, byteArray0);
      File file0 = fileUtil0.getBrowseNodeFile("net.kencochrane.a4j.file.FileUtil", "net.kencochrane.a4j.file.FileUtil", (String) null);
      assertEquals(1L, file0.length());
      assertNotNull(file0);
  }

  /**
  //Test case number: 16
  /*Coverage entropy=1.4708084763221114
  */
  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("/NET.KENCOCHRANE.A4J.FILE.FILEUTIL_NET.KENCOCHRANE.A4J.FILE.FILEUTIL_NULL.XML");
      FileSystemHandling.createFolder(evoSuiteFile0);
      File file0 = fileUtil0.getBrowseNodeFile("net.kencochrane.a4j.file.FileUtil", "net.kencochrane.a4j.file.FileUtil", (String) null);
      assertTrue(file0.canRead());
      assertNotNull(file0);
      assertEquals("/NET.KENCOCHRANE.A4J.FILE.FILEUTIL_NET.KENCOCHRANE.A4J.FILE.FILEUTIL_NULL.XML", file0.toString());
  }

  /**
  //Test case number: 17
  /*Coverage entropy=1.4708084763221112
  */
  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("/A_KIQ_VR]3.XML");
      FileSystemHandling.appendStringToFile(evoSuiteFile0, "H|3G6QMohJwqf@H?2K*");
      ArrayList<String> arrayList0 = new ArrayList<String>();
      FileSystemHandling.setPermissions(evoSuiteFile0, true, false, true);
      File file0 = fileUtil0.getAccessories("KIQ_Vr]3", arrayList0);
      assertNotNull(file0);
      assertEquals("A_KIQ_VR]3.XML", file0.getName());
  }

  /**
  //Test case number: 18
  /*Coverage entropy=1.4708084763221112
  */
  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("/A_KIQ_VR]3.XML");
      FileSystemHandling.createFolder(evoSuiteFile0);
      ArrayList<String> arrayList0 = new ArrayList<String>();
      FileSystemHandling.setPermissions(evoSuiteFile0, false, true, false);
      File file0 = fileUtil0.getAccessories("KIQ_Vr]3", arrayList0);
      assertNotNull(file0);
      assertTrue(file0.canRead());
      assertFalse(file0.canExecute());
  }

  /**
  //Test case number: 19
  /*Coverage entropy=1.4708084763221112
  */
  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("/NEW_.|S0F4)Q|NGW{AA__.|S0F4)Q|NGW{AA.XML");
      FileSystemHandling.appendLineToFile(evoSuiteFile0, "new");
      File file0 = fileUtil0.getASINFile("new", "", ".|S0f4)Q|nGw{aa", ".|S0f4)Q|nGw{aa");
      assertEquals(4L, file0.length());
      assertNotNull(file0);
  }

  /**
  //Test case number: 20
  /*Coverage entropy=1.6417347121875212
  */
  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("/S_.XML");
      byte[] byteArray0 = new byte[5];
      FileSystemHandling.appendDataToFile(evoSuiteFile0, byteArray0);
      FileUtil fileUtil0 = new FileUtil();
      FileInputStream fileInputStream0 = fileUtil0.fetchSimilarItems("", "");
      assertEquals(5, fileInputStream0.available());
  }

  /**
  //Test case number: 21
  /*Coverage entropy=1.6417347121875212
  */
  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("/PAGE=_PAGE=_PAGE=.XML");
      FileSystemHandling.appendStringToFile(evoSuiteFile0, "");
      FileInputStream fileInputStream0 = fileUtil0.fetchBNFile("page=", "page=", "page=");
      assertEquals(0, fileInputStream0.available());
  }

  /**
  //Test case number: 22
  /*Coverage entropy=1.6417347121875212
  */
  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("/A_KIQ_VR]3.XML");
      ArrayList<String> arrayList0 = new ArrayList<String>();
      FileSystemHandling.appendStringToFile(evoSuiteFile0, "");
      FileInputStream fileInputStream0 = fileUtil0.fetchAccessories("KIQ_Vr]3", arrayList0);
      assertEquals(0, fileInputStream0.available());
  }

  /**
  //Test case number: 23
  /*Coverage entropy=1.6417347121875212
  */
  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("Kv)(F;IKV)(F;I_KV)(F;I_KV)(F;I_KV)(F;I.XML");
      byte[] byteArray0 = new byte[8];
      FileSystemHandling.appendDataToFile(evoSuiteFile0, byteArray0);
      fileUtil0.cacheDir = "Kv)(F;I";
      FileInputStream fileInputStream0 = fileUtil0.fetchASINFile("Kv)(F;I", "Kv)(F;I", "Kv)(F;I", "Kv)(F;I");
      assertEquals(8, fileInputStream0.available());
  }

  /**
  //Test case number: 24
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      boolean boolean0 = fileUtil0.downloadBrowseNodeFile("", "", "", "#%ICLn.$X&_19");
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
  /*Coverage entropy=1.4708084763221112
  */
  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("/NEW_.|S0F4)Q|NGW{AA__.|S0F4)Q|NGW{AA.XML");
      FileSystemHandling.createFolder(evoSuiteFile0);
      File file0 = fileUtil0.getASINFile("new", "", ".|S0f4)Q|nGw{aa", ".|S0f4)Q|nGw{aa");
      assertEquals("/NEW_.|S0F4)Q|NGW{AA__.|S0F4)Q|NGW{AA.XML", file0.toString());
      assertNotNull(file0);
      assertTrue(file0.exists());
  }

  /**
  //Test case number: 28
  /*Coverage entropy=0.9502705392332347
  */
  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      File file0 = fileUtil0.getASINFile("new", "", ".|S0f4)Q|nGw{aa", ".|S0f4)Q|nGw{aa");
      assertNull(file0);
  }

  /**
  //Test case number: 29
  /*Coverage entropy=0.6365141682948128
  */
  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      MockFile mockFile0 = new MockFile("a0<-z}AksBm8wc,-y*K");
      boolean boolean0 = fileUtil0.isAgeGood(mockFile0);
      assertFalse(boolean0);
  }

  /**
  //Test case number: 30
  /*Coverage entropy=0.6365141682948128
  */
  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("8 #+6TY@&SU*N");
      FileSystemHandling.createFolder(evoSuiteFile0);
      FileUtil fileUtil0 = new FileUtil();
      fileUtil0.deleteFile("8 #+6TY@&SU*N");
  }

  /**
  //Test case number: 31
  /*Coverage entropy=0.6365141682948128
  */
  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      fileUtil0.deleteFile("8 #+6TY@&SU*N");
  }

  /**
  //Test case number: 32
  /*Coverage entropy=0.6365141682948128
  */
  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      File file0 = fileUtil0.downloadCart("page=");
      assertNull(file0);
  }

  /**
  //Test case number: 33
  /*Coverage entropy=1.6417347121875212
  */
  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("/S_.XML");
      FileSystemHandling.createFolder(evoSuiteFile0);
      FileUtil fileUtil0 = new FileUtil();
      FileInputStream fileInputStream0 = fileUtil0.fetchSimilarItems("", "");
      assertNull(fileInputStream0);
  }

  /**
  //Test case number: 34
  /*Coverage entropy=1.242453324894
  */
  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      FileInputStream fileInputStream0 = fileUtil0.fetchSimilarItems("/}3%A1zn,$O", "8W*gr=m)C|,");
      assertNull(fileInputStream0);
  }

  /**
  //Test case number: 35
  /*Coverage entropy=0.6365141682948128
  */
  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      EvoSuiteURL evoSuiteURL0 = new EvoSuiteURL("http://xml.amazon.net/onca/xml3?t=popcornmonste2-20&dev-t=DSB0XDDW1GQ3S&SimilaritySearch=.0123456789&type=lite&offerpage=&offer=all&f=xml");
      NetworkHandling.createRemoteTextFile(evoSuiteURL0, "wGk=KGXy0mw17");
      FileUtil fileUtil0 = new FileUtil();
      boolean boolean0 = fileUtil0.downloadSimilaritesFile(".0123456789", "", "new");
      assertFalse(boolean0);
  }

  /**
  //Test case number: 36
  /*Coverage entropy=1.4708084763221112
  */
  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("/S_.XML");
      FileSystemHandling.createFolder(evoSuiteFile0);
      FileUtil fileUtil0 = new FileUtil();
      File file0 = fileUtil0.getSimilarItems("", (String) null);
      assertNotNull(file0);
      assertEquals("S_.XML", file0.getName());
      assertTrue(file0.isDirectory());
  }

  /**
  //Test case number: 37
  /*Coverage entropy=0.9502705392332347
  */
  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      File file0 = fileUtil0.getSimilarItems("", (String) null);
      assertNull(file0);
  }

  /**
  //Test case number: 38
  /*Coverage entropy=1.6417347121875212
  */
  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("/A_KIQ_VR]3.XML");
      FileSystemHandling.appendStringToFile(evoSuiteFile0, "H|3G6QMohJwqf@H?2K*");
      ArrayList<String> arrayList0 = new ArrayList<String>();
      FileInputStream fileInputStream0 = fileUtil0.fetchAccessories("KIQ_Vr]3", arrayList0);
      assertEquals(19, fileInputStream0.available());
  }

  /**
  //Test case number: 39
  /*Coverage entropy=1.242453324894
  */
  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      ArrayList<String> arrayList0 = new ArrayList<String>();
      FileInputStream fileInputStream0 = fileUtil0.fetchAccessories("H|3G6QMohJwqf@H?2K*", arrayList0);
      assertNull(fileInputStream0);
  }

  /**
  //Test case number: 40
  /*Coverage entropy=0.6365141682948128
  */
  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      ArrayList<String> arrayList0 = new ArrayList<String>();
      arrayList0.add("kikWQZ9x4`fbzqn}LOB");
      EvoSuiteURL evoSuiteURL0 = new EvoSuiteURL("http://xml.amazon.net/onca/xml3?t=popcornmonste2-20&dev-t=DSB0XDDW1GQ3S&AsinSearch=kikWQZ9x4`fbzqn}LOB&type=lite&offerpage=1&offer=all&f=xml");
      NetworkHandling.createRemoteTextFile(evoSuiteURL0, "kikWQZ9x4`fbzqn}LOB");
      boolean boolean0 = fileUtil0.downloadAccessoriesFile((String) null, arrayList0, "kikWQZ9x4`fbzqn}LOB");
      assertFalse(boolean0);
  }

  /**
  //Test case number: 41
  /*Coverage entropy=0.9502705392332347
  */
  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      ArrayList<Object> arrayList0 = new ArrayList<Object>();
      File file0 = fileUtil0.getAccessories("", arrayList0);
      assertNull(file0);
  }

  /**
  //Test case number: 42
  /*Coverage entropy=1.0397207708399179
  */
  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      FileInputStream fileInputStream0 = fileUtil0.fetchThirdPartySearchFile((String) null, "AsinSearch", "AsinSearch", "AsinSearch");
      assertNull(fileInputStream0);
  }

  /**
  //Test case number: 43
  /*Coverage entropy=0.5623351446188083
  */
  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      EvoSuiteURL evoSuiteURL0 = new EvoSuiteURL("http://xml.amazon.net/onca/xml3?t=popcornmonste2-20&dev-t=DSB0XDDW1GQ3S&SellerSearch=cacheLife&type=Denl b}tX}R|&cOk*&page=There is no Properties File Setting to default&offerstatus=Denl b}tX}R|&cOk*&f=xml");
      NetworkHandling.createRemoteTextFile(evoSuiteURL0, "Denl b}tX}R|&cOk*");
      File file0 = fileUtil0.downloadThirdPartySearchFile("cacheLife", "Denl b}tX}R|&cOk*", "There is no Properties File Setting to default", "Denl b}tX}R|&cOk*");
      assertNull(file0);
  }

  /**
  //Test case number: 44
  /*Coverage entropy=0.9502705392332347
  */
  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      EvoSuiteURL evoSuiteURL0 = new EvoSuiteURL("http://xml.amazon.net/onca/xml3?t=popcornmonste2-20&dev-t=DSB0XDDW1GQ3S&4{11pDv=4%7B11pDv&mode=4{11pDv&type=4{11pDv&page=4{11pDv&offer=4{11pDv&f=xml");
      NetworkHandling.createRemoteTextFile(evoSuiteURL0, "w0\"ZdBUohZG83)8pI");
      FileUtil fileUtil0 = new FileUtil();
      FileInputStream fileInputStream0 = fileUtil0.fetchGenericSearchFile("4{11pDv", "4{11pDv", "4{11pDv", "4{11pDv", "4{11pDv", "4{11pDv");
      assertNull(fileInputStream0);
  }

  /**
  //Test case number: 45
  /*Coverage entropy=1.0397207708399179
  */
  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      FileInputStream fileInputStream0 = fileUtil0.fetchKeywordSearchFile("", "", "", "%a}3");
      assertNull(fileInputStream0);
  }

  /**
  //Test case number: 46
  /*Coverage entropy=1.0397207708399179
  */
  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      FileInputStream fileInputStream0 = fileUtil0.fetchBlendedSearchFile((String) null, "page=");
      assertNull(fileInputStream0);
  }

  /**
  //Test case number: 47
  /*Coverage entropy=0.6365141682948128
  */
  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      File file0 = fileUtil0.downloadKeywordSearchFile((String) null, (String) null, "@8f^CI<myqow}.@P", "cacheLife");
      assertNull(file0);
  }

  /**
  //Test case number: 48
  /*Coverage entropy=0.6365141682948128
  */
  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      File file0 = fileUtil0.downloadBlendedSearchFile("J3Y95m0WsD4]", "tR$|SvDQO P");
      assertNull(file0);
  }

  /**
  //Test case number: 49
  /*Coverage entropy=1.2424533248940002
  */
  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      FileInputStream fileInputStream0 = fileUtil0.fetchBNFile("paZge=", ",u1+L25vG|O!&", ",u1+L25vG|O!&");
      assertNull(fileInputStream0);
  }

  /**
  //Test case number: 50
  /*Coverage entropy=1.0114042647073518
  */
  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      EvoSuiteURL evoSuiteURL0 = new EvoSuiteURL("http://xml.amazon.net/onca/xml3?t=popcornmonste2-20&dev-t=DSB0XDDW1GQ3S&BrowseNodeSearch=net.kencochrane.a4j.file.FileUtil&mode=net.kencochrane.a4j.file.FileUtil&type=lite&page=null&offer=new&f=xml");
      NetworkHandling.createRemoteTextFile(evoSuiteURL0, "amazonServerURL");
      FileUtil fileUtil0 = new FileUtil();
      File file0 = fileUtil0.getBrowseNodeFile("net.kencochrane.a4j.file.FileUtil", "net.kencochrane.a4j.file.FileUtil", (String) null);
      assertNull(file0);
  }

  /**
  //Test case number: 51
  /*Coverage entropy=0.6365141682948128
  */
  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      fileUtil0.renameFile("/", "/");
  }

  /**
  //Test case number: 52
  /*Coverage entropy=1.6762349391347309
  */
  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      EvoSuiteURL evoSuiteURL0 = new EvoSuiteURL("http://xml.amazon.net/onca/xml3?t=popcornmonste2-20&dev-t=DSB0XDDW1GQ3S&AsinSearch=?3CcD&type=?3CcD&offerpage=?3CcD&offer=?3CcD&f=xml");
      NetworkHandling.createRemoteTextFile(evoSuiteURL0, "t]W>[qUZl");
      FileUtil fileUtil0 = new FileUtil();
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("/?3CCD_?3CCD_?3CCD_?3CCD.XML");
      FileSystemHandling.appendStringToFile(evoSuiteFile0, "");
      FileInputStream fileInputStream0 = fileUtil0.fetchASINFile("?3CcD", "?3CcD", "?3CcD", "?3CcD");
      assertNotNull(fileInputStream0);
      assertEquals(0, fileInputStream0.available());
  }

  /**
  //Test case number: 53
  /*Coverage entropy=1.6417347121875212
  */
  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("/,U1+L25VG|O!&_,U1+L25VG|O!&_,U1+L25VG|O!&.XML");
      FileSystemHandling.appendLineToFile(evoSuiteFile0, "m9'");
      FileUtil fileUtil0 = new FileUtil();
      FileInputStream fileInputStream0 = fileUtil0.fetchBNFile(",u1+L25vG|O!&", ",u1+L25vG|O!&", ",u1+L25vG|O!&");
      assertEquals(4, fileInputStream0.available());
  }

  /**
  //Test case number: 54
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      boolean boolean0 = fileUtil0.isAgeGood((File) null);
      assertFalse(boolean0);
  }
}
