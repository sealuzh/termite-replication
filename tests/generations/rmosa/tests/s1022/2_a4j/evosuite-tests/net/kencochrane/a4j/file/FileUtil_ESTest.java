/*
 * This file was automatically generated by EvoSuite
 * Mon Nov 09 10:02:20 GMT 2020
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
  /*Coverage entropy=1.6417347121875212
  */
  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("/S_ASINSEARCH.XML");
      FileSystemHandling.appendLineToFile(evoSuiteFile0, "0%5R[q,*Wx-5/>");
      FileInputStream fileInputStream0 = fileUtil0.fetchSimilarItems("AsinSearch", "0%5R[q,*Wx-5/>");
      assertEquals(15, fileInputStream0.available());
  }

  /**
  //Test case number: 1
  /*Coverage entropy=0.9502705392332347
  */
  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      File file0 = fileUtil0.getSimilarItems("G&e&ygI<k.Q.7Oq!cv8", "");
      assertNull(file0);
  }

  /**
  //Test case number: 2
  /*Coverage entropy=1.0397207708399179
  */
  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      FileInputStream fileInputStream0 = fileUtil0.fetchGenericSearchFile("?BQ^VetAv", "M,pE=62tacuf_F0", "?BQ^VetAv", "", "M,pE=62tacuf_F0", "?BQ^VetAv");
      assertNull(fileInputStream0);
  }

  /**
  //Test case number: 3
  /*Coverage entropy=0.6365141682948128
  */
  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      String string0 = "x)3&3#q&]T0f\\u";
      File file0 = fileUtil0.downloadGenericSearchFile(string0, "", string0, "", "", string0);
      assertNull(file0);
  }

  /**
  //Test case number: 4
  /*Coverage entropy=1.0397207708399179
  */
  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      FileInputStream fileInputStream0 = fileUtil0.fetchGenericSearchFile("B^;tw'y0jjO", "B^;tw'y0jjO", "4d~w.OqGQ)\"] ", ".C", "4d~w.OqGQ)\"] ", "4d~w.OqGQ)\"] ");
      assertNull(fileInputStream0);
  }

  /**
  //Test case number: 5
  /*Coverage entropy=1.0397207708399179
  */
  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      FileInputStream fileInputStream0 = fileUtil0.fetchKeywordSearchFile("f=xml", "f=xml", "f=xml", (String) null);
      assertNull(fileInputStream0);
  }

  /**
  //Test case number: 6
  /*Coverage entropy=1.0397207708399179
  */
  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      FileInputStream fileInputStream0 = fileUtil0.fetchKeywordSearchFile("?BQ^VtAv", "?BQ^VtAv", "-", "-");
      assertNull(fileInputStream0);
  }

  /**
  //Test case number: 7
  /*Coverage entropy=0.6365141682948128
  */
  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      File file0 = fileUtil0.downloadKeywordSearchFile("otX'.e", "otX'.e", "otX'.e", "4d+w.OqGQ)\"]A");
      assertNull(file0);
  }

  /**
  //Test case number: 8
  /*Coverage entropy=0.6365141682948128
  */
  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      File file0 = fileUtil0.downloadKeywordSearchFile("", "8*gd5_%z{qfT<z:", "", "");
      assertNull(file0);
  }

  /**
  //Test case number: 9
  /*Coverage entropy=1.242453324894
  */
  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      FileInputStream fileInputStream0 = fileUtil0.fetchASINFile("q>kK4$s(", "q>kK4$s(", "q>kK4$s(", "k_");
      assertNull(fileInputStream0);
  }

  /**
  //Test case number: 10
  /*Coverage entropy=1.242453324894
  */
  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      FileInputStream fileInputStream0 = fileUtil0.fetchASINFile((String) null, (String) null, "{BIQ403=~rl", "{BIQ403=~rl");
      assertNull(fileInputStream0);
  }

  /**
  //Test case number: 11
  /*Coverage entropy=1.242453324894
  */
  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      FileInputStream fileInputStream0 = fileUtil0.fetchASINFile("ca#Tu2;zO=5}\"", ">'EaGQs<;Dh", "ca#Tu2;zO=5}\"", "ca#Tu2;zO=5}\"");
      assertNull(fileInputStream0);
  }

  /**
  //Test case number: 12
  /*Coverage entropy=1.6417347121875212
  */
  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("/G__G__G_.XML");
      FileSystemHandling.createFolder(evoSuiteFile0);
      FileInputStream fileInputStream0 = fileUtil0.fetchBNFile("g_", "g_", "g_");
      assertNull(fileInputStream0);
  }

  /**
  //Test case number: 13
  /*Coverage entropy=1.4708084763221112
  */
  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("/S_9.XML");
      byte[] byteArray0 = new byte[6];
      FileSystemHandling.appendDataToFile(evoSuiteFile0, byteArray0);
      FileUtil fileUtil0 = new FileUtil();
      File file0 = fileUtil0.getSimilarItems("9", "9");
      assertEquals(6L, file0.length());
      assertNotNull(file0);
  }

  /**
  //Test case number: 14
  /*Coverage entropy=1.4708084763221112
  */
  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("/A_POPCORNMONSTE2-20.XML");
      FileSystemHandling.appendStringToFile(evoSuiteFile0, "SimilaritySearch");
      FileSystemHandling.setPermissions(evoSuiteFile0, false, false, false);
      ArrayList<String> arrayList0 = new ArrayList<String>();
      File file0 = fileUtil0.getAccessories("popcornmonste2-20", arrayList0);
      assertNotNull(file0);
      assertEquals(16L, file0.length());
  }

  /**
  //Test case number: 15
  /*Coverage entropy=1.4708084763221112
  */
  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("/WN'Q@& ,PU4C_U2ZHN_U2ZHN_U2ZHN.XML");
      byte[] byteArray0 = new byte[9];
      FileSystemHandling.appendDataToFile(evoSuiteFile0, byteArray0);
      File file0 = fileUtil0.getASINFile("wN'Q@& ,Pu4C", "u2zHn", "u2zHn", "u2zHn");
      assertEquals(9L, file0.length());
      assertNotNull(file0);
  }

  /**
  //Test case number: 16
  /*Coverage entropy=1.6417347121875212
  */
  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("/A_NULL.XML");
      FileSystemHandling.appendStringToFile(evoSuiteFile0, "");
      FileUtil fileUtil0 = new FileUtil();
      ArrayList<String> arrayList0 = new ArrayList<String>();
      FileInputStream fileInputStream0 = fileUtil0.fetchAccessories((String) null, arrayList0);
      assertEquals(0, fileInputStream0.available());
  }

  /**
  //Test case number: 17
  /*Coverage entropy=1.6417347121875212
  */
  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("/A_(9*-U}R'&!RW(O.XML");
      byte[] byteArray0 = new byte[4];
      FileSystemHandling.appendDataToFile(evoSuiteFile0, byteArray0);
      ArrayList<String> arrayList0 = new ArrayList<String>();
      FileInputStream fileInputStream0 = fileUtil0.fetchAccessories("(9*-u}r'&!RW(O", arrayList0);
      assertEquals(4, fileInputStream0.available());
  }

  /**
  //Test case number: 18
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      boolean boolean0 = fileUtil0.downloadOneASINFile("", "", "", "Rc9|T^Yj7-cP@2F", "Rc9|T^Yj7-cP@2F");
      assertFalse(boolean0);
  }

  /**
  //Test case number: 19
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      ArrayList<String> arrayList0 = new ArrayList<String>();
      boolean boolean0 = fileUtil0.downloadAccessoriesFile("", arrayList0, "SimilaritySearch");
      assertFalse(boolean0);
  }

  /**
  //Test case number: 20
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      // Undeclared exception!
      try { 
        fileUtil0.renameFile("net.kencochrane.a4j.util.a4jUtil", (String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.io.File", e);
      }
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
  //Test case number: 22
  /*Coverage entropy=1.4708084763221112
  */
  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("/A_POPCORNMONSTE2-20.XML");
      FileSystemHandling.createFolder(evoSuiteFile0);
      ArrayList<String> arrayList0 = new ArrayList<String>();
      File file0 = fileUtil0.getAccessories("popcornmonste2-20", arrayList0);
      assertNotNull(file0);
      assertEquals("/A_POPCORNMONSTE2-20.XML", file0.toString());
      assertTrue(file0.canExecute());
  }

  /**
  //Test case number: 23
  /*Coverage entropy=0.5623351446188083
  */
  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      EvoSuiteURL evoSuiteURL0 = new EvoSuiteURL("http://xml.amazon.net/onca/xml3?t=popcornmonste2-20&dev-t=DSB0XDDW1GQ3S&SellerSearch=null&type=%SP1Cra@&ju&page=%SP1Cra@&ju&offerstatus=null&f=xml");
      NetworkHandling.createRemoteTextFile(evoSuiteURL0, "%SP1Cra@&ju");
      File file0 = fileUtil0.downloadThirdPartySearchFile((String) null, "%SP1Cra@&ju", "%SP1Cra@&ju", (String) null);
      assertNull(file0);
  }

  /**
  //Test case number: 24
  /*Coverage entropy=0.6365141682948128
  */
  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      File file0 = fileUtil0.downloadBlendedSearchFile(".xml", ".xml");
      assertNull(file0);
  }

  /**
  //Test case number: 25
  /*Coverage entropy=1.4708084763221114
  */
  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("/__.XML");
      FileSystemHandling.appendLineToFile(evoSuiteFile0, "*Z&r!:D/8v=w=E9");
      File file0 = fileUtil0.getBrowseNodeFile("", "", "");
      assertEquals(16L, file0.length());
      assertNotNull(file0);
  }

  /**
  //Test case number: 26
  /*Coverage entropy=0.9502705392332347
  */
  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      File file0 = fileUtil0.getBrowseNodeFile("$+w7YsD!", "$+w7YsD!", ".yg=O3?U_{xv4HV1]");
      assertNull(file0);
  }

  /**
  //Test case number: 27
  /*Coverage entropy=0.9502705392332347
  */
  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      File file0 = fileUtil0.getASINFile("&Hmac=", "&Hmac=", "o7pr?xa|k]f;v@5", "&Hmac=");
      assertNull(file0);
  }

  /**
  //Test case number: 28
  /*Coverage entropy=0.6365141682948128
  */
  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      MockFile mockFile0 = new MockFile(".tAkjJ8F^", "$!29v=K@&[Df&");
      boolean boolean0 = fileUtil0.isAgeGood(mockFile0);
      assertFalse(boolean0);
  }

  /**
  //Test case number: 29
  /*Coverage entropy=0.6365141682948128
  */
  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      fileUtil0.deleteFile("all");
  }

  /**
  //Test case number: 30
  /*Coverage entropy=0.6365141682948128
  */
  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      File file0 = fileUtil0.downloadCart("a_");
      assertNull(file0);
  }

  /**
  //Test case number: 31
  /*Coverage entropy=1.6417347121875212
  */
  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("/S_9.XML");
      FileSystemHandling.createFolder(evoSuiteFile0);
      FileUtil fileUtil0 = new FileUtil();
      FileInputStream fileInputStream0 = fileUtil0.fetchSimilarItems("9", "9");
      assertNull(fileInputStream0);
  }

  /**
  //Test case number: 32
  /*Coverage entropy=1.242453324894
  */
  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      FileInputStream fileInputStream0 = fileUtil0.fetchSimilarItems("9", "9");
      assertNull(fileInputStream0);
  }

  /**
  //Test case number: 33
  /*Coverage entropy=0.6365141682948128
  */
  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      EvoSuiteURL evoSuiteURL0 = new EvoSuiteURL("http://xml.amazon.net/onca/xml3?t=popcornmonste2-20&dev-t=DSB0XDDW1GQ3S&SimilaritySearch=There is no Properties File Setting to default&type=lite&offerpage=k_&offer=all&f=xml");
      NetworkHandling.createRemoteTextFile(evoSuiteURL0, "Rc9|T^Yj7-cP@2F");
      boolean boolean0 = fileUtil0.downloadSimilaritesFile("There is no Properties File Setting to default", "k_", "Rc9|T^Yj7-cP@2F");
      assertFalse(boolean0);
  }

  /**
  //Test case number: 34
  /*Coverage entropy=1.4708084763221112
  */
  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("/S_1.XML");
      FileSystemHandling.createFolder(evoSuiteFile0);
      File file0 = fileUtil0.getSimilarItems("1", "1");
      assertEquals("S_1.XML", file0.getName());
      assertNotNull(file0);
      assertTrue(file0.canWrite());
  }

  /**
  //Test case number: 35
  /*Coverage entropy=1.242453324894
  */
  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      ArrayList<String> arrayList0 = new ArrayList<String>();
      FileInputStream fileInputStream0 = fileUtil0.fetchAccessories((String) null, arrayList0);
      assertNull(fileInputStream0);
  }

  /**
  //Test case number: 36
  /*Coverage entropy=0.9502705392332347
  */
  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      ArrayList<String> arrayList0 = new ArrayList<String>();
      File file0 = fileUtil0.getAccessories("", arrayList0);
      assertNull(file0);
  }

  /**
  //Test case number: 37
  /*Coverage entropy=1.0397207708399179
  */
  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      FileInputStream fileInputStream0 = fileUtil0.fetchThirdPartySearchFile("", "a[$_v]5#I;F'&HTw", "t#3r}", "Rp C8^1Q1i&{?mZ{Mq");
      assertNull(fileInputStream0);
  }

  /**
  //Test case number: 38
  /*Coverage entropy=1.0397207708399179
  */
  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      FileInputStream fileInputStream0 = fileUtil0.fetchGenericSearchFile("?BQ^VtAv", "?BQ^VtAv", "?BQ^VtAv", "?BQ^VtAv", "?BQ^VtAv", ".0123456789");
      assertNull(fileInputStream0);
  }

  /**
  //Test case number: 39
  /*Coverage entropy=0.5623351446188083
  */
  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      EvoSuiteURL evoSuiteURL0 = new EvoSuiteURL("http://xml.amazon.net/onca/xml3?t=popcornmonste2-20&dev-t=DSB0XDDW1GQ3S&4d~w.OqGQ)\"] =4d%7Ew.OqGQ%29%22%5D+&mode=4d~w.OqGQ)\"] &type=4d~w.OqGQ)\"] &page=4d~w.OqGQ)\"] &offer=4d~w.OqGQ)\"] &f=xml");
      NetworkHandling.createRemoteTextFile(evoSuiteURL0, "B^;tw'y0jjO");
      FileUtil fileUtil0 = new FileUtil();
      File file0 = fileUtil0.downloadGenericSearchFile("4d~w.OqGQ)\"] ", "4d~w.OqGQ)\"] ", "4d~w.OqGQ)\"] ", "4d~w.OqGQ)\"] ", "4d~w.OqGQ)\"] ", "4d~w.OqGQ)\"] ");
      assertNull(file0);
  }

  /**
  //Test case number: 40
  /*Coverage entropy=1.0397207708399179
  */
  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      FileInputStream fileInputStream0 = fileUtil0.fetchKeywordSearchFile("$+w7YsD!", "net.kencochrane.a4j.file.FileUtil", "net.kencochrane.a4j.file.FileUtil", "net.kencochrane.a4j.file.FileUtil");
      assertNull(fileInputStream0);
  }

  /**
  //Test case number: 41
  /*Coverage entropy=0.5623351446188083
  */
  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      EvoSuiteURL evoSuiteURL0 = new EvoSuiteURL("http://xml.amazon.net/onca/xml3?t=popcornmonste2-20&dev-t=DSB0XDDW1GQ3S&KeywordSearch=.xml&mode=.xml&type=.xml&page=.xml&f=xml");
      NetworkHandling.createRemoteTextFile(evoSuiteURL0, "(hh^L@T(2^,c%Z");
      FileUtil fileUtil0 = new FileUtil();
      File file0 = fileUtil0.downloadKeywordSearchFile(".xml", ".xml", ".xml", ".xml");
      assertNull(file0);
  }

  /**
  //Test case number: 42
  /*Coverage entropy=1.0397207708399179
  */
  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      FileInputStream fileInputStream0 = fileUtil0.fetchBlendedSearchFile((String) null, "]'QN+oF`UjBhA2");
      assertNull(fileInputStream0);
  }

  /**
  //Test case number: 43
  /*Coverage entropy=1.6417347121875212
  */
  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("/G__G__.XML");
      FileSystemHandling.appendStringToFile(evoSuiteFile0, "all");
      FileInputStream fileInputStream0 = fileUtil0.fetchBNFile("g_", "g_", "");
      assertEquals(3, fileInputStream0.available());
  }

  /**
  //Test case number: 44
  /*Coverage entropy=1.2424533248940002
  */
  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      FileInputStream fileInputStream0 = fileUtil0.fetchBNFile("KqWW~jf]ku7:].>Px", "\"pRW9xG[~<7*F3^/in", "KqWW~jf]ku7:].>Px");
      assertNull(fileInputStream0);
  }

  /**
  //Test case number: 45
  /*Coverage entropy=1.6417347121875212
  */
  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("/*Q>AKKM&A_*Q>AKKM&A_*Q>AKKM&A_*Q>AKKM&A.XML");
      FileSystemHandling.appendLineToFile(evoSuiteFile0, "8*gd5_%z{qfT<z:");
      FileInputStream fileInputStream0 = fileUtil0.fetchASINFile("*q>AkKM&A", "*q>AkKM&A", "*q>AkKM&A", "*q>AkKM&A");
      assertEquals(16, fileInputStream0.available());
  }

  /**
  //Test case number: 46
  /*Coverage entropy=1.4708084763221112
  */
  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("/N'Q@& ,PU4C_N'Q@& ,PU4C_N'Q@& ,PU4C_N'Q@& ,PU4C.XML");
      FileSystemHandling.createFolder(evoSuiteFile0);
      FileUtil fileUtil0 = new FileUtil();
      File file0 = fileUtil0.getASINFile("N'Q@& ,Pu4C", "N'Q@& ,Pu4C", "N'Q@& ,Pu4C", "N'Q@& ,Pu4C");
      assertNotNull(file0);
      assertEquals("/N'Q@& ,PU4C_N'Q@& ,PU4C_N'Q@& ,PU4C_N'Q@& ,PU4C.XML", file0.toString());
      assertEquals(1392409281320L, file0.lastModified());
  }

  /**
  //Test case number: 47
  /*Coverage entropy=0.6365141682948128
  */
  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      fileUtil0.renameFile("/", "/");
  }

  /**
  //Test case number: 48
  /*Coverage entropy=0.6365141682948128
  */
  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      fileUtil0.renameFile("q>k4$s?", "");
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
  /*Coverage entropy=1.0549201679861442
  */
  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      fileUtil0.deleteFile("");
      EvoSuiteURL evoSuiteURL0 = new EvoSuiteURL("http://xml.amazon.net/onca/xml3?t=popcornmonste2-20&dev-t=DSB0XDDW1GQ3S&BrowseNodeSearch=null&mode=&type=lite&page=&offer=new&f=xml");
      NetworkHandling.createRemoteTextFile(evoSuiteURL0, "popcornmonOte2-20");
      boolean boolean0 = fileUtil0.downloadBrowseNodeFile("", (String) null, "", "");
      assertFalse(boolean0);
  }

  /**
  //Test case number: 51
  /*Coverage entropy=1.277034259466139
  */
  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      EvoSuiteURL evoSuiteURL0 = new EvoSuiteURL("http://xml.amazon.net/onca/xml3?t=popcornmonste2-20&dev-t=DSB0XDDW1GQ3S&AsinSearch=*q>AkKM&A&type=*q>AkKM&A&offerpage=*q>AkKM&A&offer=*q>AkKM&A&f=xml");
      NetworkHandling.createRemoteTextFile(evoSuiteURL0, "8*gd5_%z{qfT<z:");
      FileUtil fileUtil0 = new FileUtil();
      FileInputStream fileInputStream0 = fileUtil0.fetchASINFile("*q>AkKM&A", "*q>AkKM&A", "*q>AkKM&A", "*q>AkKM&A");
      assertNull(fileInputStream0);
  }

  /**
  //Test case number: 52
  /*Coverage entropy=1.6417347121875212
  */
  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("/A_POPCORNMONSTE2-20.XML");
      FileSystemHandling.createFolder(evoSuiteFile0);
      ArrayList<Object> arrayList0 = new ArrayList<Object>();
      FileInputStream fileInputStream0 = fileUtil0.fetchAccessories("popcornmonste2-20", arrayList0);
      assertNull(fileInputStream0);
  }
}
