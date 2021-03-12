/*
 * This file was automatically generated by EvoSuite
 * Sat Nov 28 04:55:08 GMT 2020
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
      FileInputStream fileInputStream0 = fileUtil0.fetchGenericSearchFile("d&$qs*_J", "d&$qs*_J", "d&$qs*_J", "q=d?)|hFN\"caXy\"0$", "q=d?)|hFN\"caXy\"0$", "d&$qs*_J");
      assertNull(fileInputStream0);
  }

  /**
  //Test case number: 1
  /*Coverage entropy=1.0397207708399179
  */
  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      FileInputStream fileInputStream0 = fileUtil0.fetchKeywordSearchFile(";S", "_/m_>&0$e", ";S", "_/m_>&0$e");
      assertNull(fileInputStream0);
  }

  /**
  //Test case number: 2
  /*Coverage entropy=1.0397207708399179
  */
  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      FileInputStream fileInputStream0 = fileUtil0.fetchBlendedSearchFile((String) null, "");
      assertNull(fileInputStream0);
  }

  /**
  //Test case number: 3
  /*Coverage entropy=0.6365141682948128
  */
  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      MockFile mockFile0 = new MockFile("", "hV");
      boolean boolean0 = fileUtil0.isAgeGood(mockFile0);
      assertFalse(boolean0);
  }

  /**
  //Test case number: 4
  /*Coverage entropy=0.6365141682948128
  */
  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      fileUtil0.renameFile("/", "/");
  }

  /**
  //Test case number: 5
  /*Coverage entropy=1.6417347121875212
  */
  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("/S_OR{CWNM(TX.XML");
      FileSystemHandling.createFolder(evoSuiteFile0);
      FileUtil fileUtil0 = new FileUtil();
      FileInputStream fileInputStream0 = fileUtil0.fetchSimilarItems("Or{cWNM(TX", "/");
      assertNull(fileInputStream0);
  }

  /**
  //Test case number: 6
  /*Coverage entropy=1.6417347121875212
  */
  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("/SHOPPINGCART=MODIFY&F=XML&DEV-T=_NP6H_NP6H_NP6H.XML");
      FileSystemHandling.createFolder(evoSuiteFile0);
      FileInputStream fileInputStream0 = fileUtil0.fetchASINFile("ShoppingCart=modify&f=xml&dev-t=", "NP6h", "NP6h", "NP6h");
      assertNull(fileInputStream0);
  }

  /**
  //Test case number: 7
  /*Coverage entropy=1.4708084763221112
  */
  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("/S_]E+CQGP1MN:RLU5:Q.XML");
      FileSystemHandling.appendLineToFile(evoSuiteFile0, "Ii4/jt\u0007SHB1nj4R~h?");
      File file0 = fileUtil0.getSimilarItems("]e+cQGp1Mn:RLU5:Q", "]JB>2mNYd1Yt-");
      assertNotNull(file0);
      assertEquals(19L, file0.length());
  }

  /**
  //Test case number: 8
  /*Coverage entropy=1.4708084763221112
  */
  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("/WN'Q@& ,PU4C_U2ZHN_U2ZHN_U2ZHN.XML");
      FileSystemHandling.appendStringToFile(evoSuiteFile0, "wN'Q@& ,Pu4C");
      File file0 = fileUtil0.getASINFile("wN'Q@& ,Pu4C", "u2zHn", "u2zHn", "u2zHn");
      assertEquals(12L, file0.length());
      assertNotNull(file0);
  }

  /**
  //Test case number: 9
  /*Coverage entropy=1.4708084763221112
  */
  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("/WN'Q@& ,PU4C_U2ZHN_U2ZHN_U2ZHN.XML");
      FileUtil fileUtil0 = new FileUtil();
      FileSystemHandling.createFolder(evoSuiteFile0);
      File file0 = fileUtil0.getASINFile("wN'Q@& ,Pu4C", "u2zHn", "u2zHn", "u2zHn");
      assertNotNull(file0);
      assertEquals("/WN'Q@& ,PU4C_U2ZHN_U2ZHN_U2ZHN.XML", file0.toString());
      assertTrue(file0.isDirectory());
  }

  /**
  //Test case number: 10
  /*Coverage entropy=1.6417347121875212
  */
  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("/S_]E+CQGP1MN:RLU5:Q.XML");
      FileSystemHandling.appendStringToFile(evoSuiteFile0, "");
      FileInputStream fileInputStream0 = fileUtil0.fetchSimilarItems("]e+cQGp1Mn:RLU5:Q", "&x1+E22c^yuZEWIH");
      assertEquals(0, fileInputStream0.available());
  }

  /**
  //Test case number: 11
  /*Coverage entropy=1.6417347121875212
  */
  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("/TS__DSB0XDDW1GQ3S_L.XML");
      FileSystemHandling.appendStringToFile(evoSuiteFile0, "ts_");
      FileInputStream fileInputStream0 = fileUtil0.fetchBNFile("ts_", "DSB0XDDW1GQ3S", "l");
      assertEquals(3, fileInputStream0.available());
  }

  /**
  //Test case number: 12
  /*Coverage entropy=0.6365141682948128
  */
  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      fileUtil0.renameFile("", "");
  }

  /**
  //Test case number: 13
  /*Coverage entropy=1.4708084763221112
  */
  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("/S_X.XML");
      FileSystemHandling.createFolder(evoSuiteFile0);
      File file0 = fileUtil0.getSimilarItems("X", "X");
      assertNotNull(file0);
      
      boolean boolean0 = fileUtil0.isAgeGood(file0);
      assertFalse(boolean0);
      assertEquals("/S_X.XML", file0.toString());
      assertTrue(file0.canExecute());
  }

  /**
  //Test case number: 14
  /*Coverage entropy=0.9502705392332347
  */
  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      File file0 = fileUtil0.getSimilarItems((String) null, (String) null);
      assertNull(file0);
  }

  /**
  //Test case number: 15
  /*Coverage entropy=0.9502705392332347
  */
  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      File file0 = fileUtil0.getSimilarItems("", "");
      assertNull(file0);
  }

  /**
  //Test case number: 16
  /*Coverage entropy=0.9502705392332347
  */
  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      File file0 = fileUtil0.getBrowseNodeFile("", "", "");
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
      File file0 = fileUtil0.getAccessories("", (ArrayList) null);
      assertNull(file0);
  }

  /**
  //Test case number: 19
  /*Coverage entropy=0.9502705392332347
  */
  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      ArrayList<String> arrayList0 = new ArrayList<String>();
      arrayList0.add("AsinSearch");
      File file0 = fileUtil0.getAccessories("wUM*", arrayList0);
      assertNull(file0);
  }

  /**
  //Test case number: 20
  /*Coverage entropy=0.9502705392332347
  */
  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      ArrayList<Object> arrayList0 = new ArrayList<Object>();
      File file0 = fileUtil0.getAccessories((String) null, arrayList0);
      assertNull(file0);
  }

  /**
  //Test case number: 21
  /*Coverage entropy=0.9502705392332347
  */
  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      File file0 = fileUtil0.getASINFile((String) null, (String) null, (String) null, (String) null);
      assertNull(file0);
  }

  /**
  //Test case number: 22
  /*Coverage entropy=0.9502705392332347
  */
  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      File file0 = fileUtil0.getASINFile("", "", "", "");
      assertNull(file0);
  }

  /**
  //Test case number: 23
  /*Coverage entropy=1.0397207708399179
  */
  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      FileInputStream fileInputStream0 = fileUtil0.fetchThirdPartySearchFile("", (String) null, "", "");
      assertNull(fileInputStream0);
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
  /*Coverage entropy=1.0397207708399179
  */
  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      FileInputStream fileInputStream0 = fileUtil0.fetchThirdPartySearchFile("", "", "", "3rd_");
      assertNull(fileInputStream0);
  }

  /**
  //Test case number: 26
  /*Coverage entropy=1.242453324894
  */
  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      FileInputStream fileInputStream0 = fileUtil0.fetchSimilarItems("", "");
      assertNull(fileInputStream0);
  }

  /**
  //Test case number: 27
  /*Coverage entropy=1.242453324894
  */
  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      FileInputStream fileInputStream0 = fileUtil0.fetchSimilarItems((String) null, (String) null);
      assertNull(fileInputStream0);
  }

  /**
  //Test case number: 28
  /*Coverage entropy=1.0397207708399179
  */
  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      FileInputStream fileInputStream0 = fileUtil0.fetchKeywordSearchFile("", "", "", "");
      assertNull(fileInputStream0);
  }

  /**
  //Test case number: 29
  /*Coverage entropy=1.0397207708399179
  */
  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      FileInputStream fileInputStream0 = fileUtil0.fetchKeywordSearchFile("l{E)m", "l{E)m", "", "l{E)m");
      assertNull(fileInputStream0);
  }

  /**
  //Test case number: 30
  /*Coverage entropy=1.0397207708399179
  */
  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      FileInputStream fileInputStream0 = fileUtil0.fetchKeywordSearchFile((String) null, (String) null, (String) null, (String) null);
      assertNull(fileInputStream0);
  }

  /**
  //Test case number: 31
  /*Coverage entropy=1.0397207708399179
  */
  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      FileInputStream fileInputStream0 = fileUtil0.fetchKeywordSearchFile("", "", "d&%$_J", "d&%$_J");
      assertNull(fileInputStream0);
  }

  /**
  //Test case number: 32
  /*Coverage entropy=1.0397207708399179
  */
  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      FileInputStream fileInputStream0 = fileUtil0.fetchGenericSearchFile("=", "=", "", "", "", "");
      assertNull(fileInputStream0);
  }

  /**
  //Test case number: 33
  /*Coverage entropy=1.0397207708399179
  */
  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      FileInputStream fileInputStream0 = fileUtil0.fetchGenericSearchFile((String) null, (String) null, (String) null, (String) null, (String) null, "");
      assertNull(fileInputStream0);
  }

  /**
  //Test case number: 34
  /*Coverage entropy=1.0397207708399179
  */
  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      FileInputStream fileInputStream0 = fileUtil0.fetchGenericSearchFile((String) null, "\"E!!OzS59dN$W*", (String) null, (String) null, "\"E!!OzS59dN$W*", (String) null);
      assertNull(fileInputStream0);
  }

  /**
  //Test case number: 35
  /*Coverage entropy=1.0397207708399179
  */
  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      FileInputStream fileInputStream0 = fileUtil0.fetchGenericSearchFile("", "", "", "", (String) null, "");
      assertNull(fileInputStream0);
  }

  /**
  //Test case number: 36
  /*Coverage entropy=1.0397207708399179
  */
  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      FileInputStream fileInputStream0 = fileUtil0.fetchBlendedSearchFile((String) null, (String) null);
      assertNull(fileInputStream0);
  }

  /**
  //Test case number: 37
  /*Coverage entropy=1.0397207708399179
  */
  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      FileInputStream fileInputStream0 = fileUtil0.fetchBlendedSearchFile("", "");
      assertNull(fileInputStream0);
  }

  /**
  //Test case number: 38
  /*Coverage entropy=1.2424533248940002
  */
  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      FileInputStream fileInputStream0 = fileUtil0.fetchBNFile((String) null, (String) null, (String) null);
      assertNull(fileInputStream0);
  }

  /**
  //Test case number: 39
  /*Coverage entropy=1.2424533248940002
  */
  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      FileInputStream fileInputStream0 = fileUtil0.fetchBNFile("", "", "");
      assertNull(fileInputStream0);
  }

  /**
  //Test case number: 40
  /*Coverage entropy=1.242453324894
  */
  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      ArrayList<String> arrayList0 = new ArrayList<String>();
      arrayList0.add((String) null);
      FileInputStream fileInputStream0 = fileUtil0.fetchAccessories((String) null, arrayList0);
      assertNull(fileInputStream0);
  }

  /**
  //Test case number: 41
  /*Coverage entropy=1.242453324894
  */
  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      ArrayList<String> arrayList0 = new ArrayList<String>();
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
      ArrayList<Object> arrayList0 = new ArrayList<Object>();
      FileInputStream fileInputStream0 = fileUtil0.fetchAccessories("ts_", arrayList0);
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
      FileInputStream fileInputStream0 = fileUtil0.fetchASINFile("", "", "", "");
      assertNull(fileInputStream0);
  }

  /**
  //Test case number: 45
  /*Coverage entropy=0.6365141682948128
  */
  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      File file0 = fileUtil0.downloadThirdPartySearchFile((String) null, (String) null, (String) null, (String) null);
      assertNull(file0);
  }

  /**
  //Test case number: 46
  /*Coverage entropy=0.6365141682948128
  */
  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      File file0 = fileUtil0.downloadThirdPartySearchFile("", "", "", "");
      assertNull(file0);
  }

  /**
  //Test case number: 47
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      boolean boolean0 = fileUtil0.downloadSimilaritesFile("\"]<s-5", "\"]<s-5", (String) null);
      assertFalse(boolean0);
  }

  /**
  //Test case number: 48
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      boolean boolean0 = fileUtil0.downloadSimilaritesFile((String) null, (String) null, "");
      assertFalse(boolean0);
  }

  /**
  //Test case number: 49
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      boolean boolean0 = fileUtil0.downloadSimilaritesFile("", "", "Log file isn't there Setting default properties");
      assertFalse(boolean0);
  }

  /**
  //Test case number: 50
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      boolean boolean0 = fileUtil0.downloadOneASINFile((String) null, (String) null, (String) null, (String) null, (String) null);
      assertFalse(boolean0);
  }

  /**
  //Test case number: 51
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      boolean boolean0 = fileUtil0.downloadOneASINFile("=", "=", "=", "=", "=");
      assertFalse(boolean0);
  }

  /**
  //Test case number: 52
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      boolean boolean0 = fileUtil0.downloadOneASINFile("", "", "", "", "");
      assertFalse(boolean0);
  }

  /**
  //Test case number: 53
  /*Coverage entropy=0.6365141682948128
  */
  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      File file0 = fileUtil0.downloadKeywordSearchFile((String) null, (String) null, (String) null, "\"");
      assertNull(file0);
  }

  /**
  //Test case number: 54
  /*Coverage entropy=0.6365141682948128
  */
  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      File file0 = fileUtil0.downloadKeywordSearchFile((String) null, "", "", (String) null);
      assertNull(file0);
  }

  /**
  //Test case number: 55
  /*Coverage entropy=0.6365141682948128
  */
  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      File file0 = fileUtil0.downloadKeywordSearchFile("Ii4/jt\u0007SHB1nj4R~h?", "Ii4/jt\u0007SHB1nj4R~h?", "Ii4/jt\u0007SHB1nj4R~h?", "");
      assertNull(file0);
  }

  /**
  //Test case number: 56
  /*Coverage entropy=0.6365141682948128
  */
  @Test(timeout = 4000)
  public void test56()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      File file0 = fileUtil0.downloadKeywordSearchFile("", "", "", "");
      assertNull(file0);
  }

  /**
  //Test case number: 57
  /*Coverage entropy=0.6365141682948128
  */
  @Test(timeout = 4000)
  public void test57()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      File file0 = fileUtil0.downloadGenericSearchFile("BlendedSearch=", "BlendedSearch=", "BlendedSearch=", "BlendedSearch=", "BlendedSearch=", "BlendedSearch=");
      assertNull(file0);
  }

  /**
  //Test case number: 58
  /*Coverage entropy=0.6365141682948128
  */
  @Test(timeout = 4000)
  public void test58()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      File file0 = fileUtil0.downloadGenericSearchFile("", "", "", "", "", "");
      assertNull(file0);
  }

  /**
  //Test case number: 59
  /*Coverage entropy=0.6365141682948128
  */
  @Test(timeout = 4000)
  public void test59()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      File file0 = fileUtil0.downloadGenericSearchFile((String) null, (String) null, (String) null, (String) null, (String) null, (String) null);
      assertNull(file0);
  }

  /**
  //Test case number: 60
  /*Coverage entropy=0.6365141682948128
  */
  @Test(timeout = 4000)
  public void test60()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      File file0 = fileUtil0.downloadCart((String) null);
      assertNull(file0);
  }

  /**
  //Test case number: 61
  /*Coverage entropy=0.6365141682948128
  */
  @Test(timeout = 4000)
  public void test61()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      File file0 = fileUtil0.downloadCart(":1r{");
      assertNull(file0);
  }

  /**
  //Test case number: 62
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test62()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      boolean boolean0 = fileUtil0.downloadBrowseNodeFile((String) null, (String) null, (String) null, (String) null);
      assertFalse(boolean0);
  }

  /**
  //Test case number: 63
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test63()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      boolean boolean0 = fileUtil0.downloadBrowseNodeFile("a_", "a_", "a_", "a_");
      assertFalse(boolean0);
  }

  /**
  //Test case number: 64
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test64()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      boolean boolean0 = fileUtil0.downloadBrowseNodeFile("", "", "", "");
      assertFalse(boolean0);
  }

  /**
  //Test case number: 65
  /*Coverage entropy=0.6365141682948128
  */
  @Test(timeout = 4000)
  public void test65()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      File file0 = fileUtil0.downloadBlendedSearchFile("", "");
      assertNull(file0);
  }

  /**
  //Test case number: 66
  /*Coverage entropy=0.6365141682948128
  */
  @Test(timeout = 4000)
  public void test66()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      File file0 = fileUtil0.downloadBlendedSearchFile((String) null, (String) null);
      assertNull(file0);
  }

  /**
  //Test case number: 67
  /*Coverage entropy=0.6365141682948128
  */
  @Test(timeout = 4000)
  public void test67()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      File file0 = fileUtil0.downloadBlendedSearchFile("ChF<'", "&x1+E22c^yuZEWIH");
      assertNull(file0);
  }

  /**
  //Test case number: 68
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test68()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      ArrayList<Integer> arrayList0 = new ArrayList<Integer>();
      boolean boolean0 = fileUtil0.downloadAccessoriesFile("yf3", arrayList0, (String) null);
      assertFalse(boolean0);
  }

  /**
  //Test case number: 69
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test69()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      ArrayList<String> arrayList0 = new ArrayList<String>();
      arrayList0.add((String) null);
      boolean boolean0 = fileUtil0.downloadAccessoriesFile("JE<$')wO%N", arrayList0, "JE<$')wO%N");
      assertFalse(boolean0);
  }

  /**
  //Test case number: 70
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test70()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      ArrayList<Object> arrayList0 = new ArrayList<Object>();
      boolean boolean0 = fileUtil0.downloadAccessoriesFile((String) null, arrayList0, " ");
      assertFalse(boolean0);
  }

  /**
  //Test case number: 71
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test71()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      boolean boolean0 = fileUtil0.downloadAccessoriesFile("", (ArrayList) null, "");
      assertFalse(boolean0);
  }

  /**
  //Test case number: 72
  /*Coverage entropy=0.6365141682948128
  */
  @Test(timeout = 4000)
  public void test72()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      fileUtil0.deleteFile("WQ2)P[NXnn5By");
  }

  /**
  //Test case number: 73
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test73()  throws Throwable  {
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
  //Test case number: 74
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test74()  throws Throwable  {
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
  //Test case number: 75
  /*Coverage entropy=0.6365141682948128
  */
  @Test(timeout = 4000)
  public void test75()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      File file0 = fileUtil0.downloadCart("");
      assertNull(file0);
  }

  /**
  //Test case number: 76
  /*Coverage entropy=1.277034259466139
  */
  @Test(timeout = 4000)
  public void test76()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      EvoSuiteURL evoSuiteURL0 = new EvoSuiteURL("http://xml.amazon.net/onca/xml3?t=popcornmonste2-20&dev-t=DSB0XDDW1GQ3S&SimilaritySearch=]e+cQGp1Mn:RLU5:Q&type=lite&offerpage=&x1+E2c^yuZEWIH&offer=all&f=xml");
      NetworkHandling.createRemoteTextFile(evoSuiteURL0, "&x1+E2c^yuZEWIH");
      FileInputStream fileInputStream0 = fileUtil0.fetchSimilarItems("]e+cQGp1Mn:RLU5:Q", "&x1+E2c^yuZEWIH");
      assertNull(fileInputStream0);
  }

  /**
  //Test case number: 77
  /*Coverage entropy=1.242453324894
  */
  @Test(timeout = 4000)
  public void test77()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      FileInputStream fileInputStream0 = fileUtil0.fetchAccessories("", (ArrayList) null);
      assertNull(fileInputStream0);
  }

  /**
  //Test case number: 78
  /*Coverage entropy=1.0397207708399179
  */
  @Test(timeout = 4000)
  public void test78()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      FileInputStream fileInputStream0 = fileUtil0.fetchThirdPartySearchFile("| )VdSqpSetx1", "u2zHn", "u2zHn", "| )VdSqpSetx1");
      assertNull(fileInputStream0);
  }

  /**
  //Test case number: 79
  /*Coverage entropy=0.6365141682948128
  */
  @Test(timeout = 4000)
  public void test79()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      File file0 = fileUtil0.downloadThirdPartySearchFile("net.kencochrane.a4j.file.FileUtil", "net.kencochrane.a4j.file.FileUtil", "| )VdSqpSetx1", "u2zHn");
      assertNull(file0);
  }

  /**
  //Test case number: 80
  /*Coverage entropy=0.5623351446188083
  */
  @Test(timeout = 4000)
  public void test80()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      EvoSuiteURL evoSuiteURL0 = new EvoSuiteURL("http://xml.amazon.net/onca/xml3?t=popcornmonste2-20&dev-t=DSB0XDDW1GQ3S&=NP6h&mode=&type=dTr|`sa_&`!a-<|&page=&offer=&f=xml");
      NetworkHandling.createRemoteTextFile(evoSuiteURL0, "NP6h");
      File file0 = fileUtil0.downloadGenericSearchFile("", "NP6h", "", "dTr|`sa_&`!a-<|", "", "");
      assertNull(file0);
  }

  /**
  //Test case number: 81
  /*Coverage entropy=1.0397207708399179
  */
  @Test(timeout = 4000)
  public void test81()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      FileInputStream fileInputStream0 = fileUtil0.fetchBlendedSearchFile("t&$q$J", "t&$q$J");
      assertNull(fileInputStream0);
  }

  /**
  //Test case number: 82
  /*Coverage entropy=0.5623351446188083
  */
  @Test(timeout = 4000)
  public void test82()  throws Throwable  {
      EvoSuiteURL evoSuiteURL0 = new EvoSuiteURL("http://xml.amazon.net/onca/xml3?t=popcornmonste2-20&dev-t=DSB0XDDW1GQ3S&BlendedSearch=&type=net.kencochrane.a4j.file.FileUtil&f=xml");
      NetworkHandling.createRemoteTextFile(evoSuiteURL0, "Log file isn't there Setting default properties");
      FileUtil fileUtil0 = new FileUtil();
      File file0 = fileUtil0.downloadBlendedSearchFile("", "net.kencochrane.a4j.file.FileUtil");
      assertNull(file0);
  }

  /**
  //Test case number: 83
  /*Coverage entropy=1.6417347121875212
  */
  @Test(timeout = 4000)
  public void test83()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("/TS__DSB0XDDW1GQ3S_L.XML");
      FileSystemHandling.createFolder(evoSuiteFile0);
      FileInputStream fileInputStream0 = fileUtil0.fetchBNFile("ts_", "DSB0XDDW1GQ3S", "l");
      assertNull(fileInputStream0);
  }

  /**
  //Test case number: 84
  /*Coverage entropy=1.4708084763221114
  */
  @Test(timeout = 4000)
  public void test84()  throws Throwable  {
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("/T=__T=.XML");
      FileSystemHandling.createFolder(evoSuiteFile0);
      FileUtil fileUtil0 = new FileUtil();
      File file0 = fileUtil0.getBrowseNodeFile("T=", "", "T=");
      assertNotNull(file0);
      assertEquals("T=__T=.XML", file0.getName());
      assertFalse(file0.isFile());
  }

  /**
  //Test case number: 85
  /*Coverage entropy=0.9502705392332347
  */
  @Test(timeout = 4000)
  public void test85()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      File file0 = fileUtil0.getBrowseNodeFile("net.kencochrane.a4j.file.FileUtil", "| )VdSqpSetx1", "net.kencochrane.a4j.file.FileUtil");
      assertNull(file0);
  }

  /**
  //Test case number: 86
  /*Coverage entropy=1.242453324894
  */
  @Test(timeout = 4000)
  public void test86()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      FileInputStream fileInputStream0 = fileUtil0.fetchASINFile("WQ2)P[NXnn5By", "qYY)}EBSbJ~=k|+", "]e+cQGp1Mn:RLU5:Q", "ChF<'");
      assertNull(fileInputStream0);
  }

  /**
  //Test case number: 87
  /*Coverage entropy=1.6417347121875212
  */
  @Test(timeout = 4000)
  public void test87()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("/WN'Q@& ,PU4C_U2ZHN_U2ZHN_U2ZHN.XML");
      FileSystemHandling.appendLineToFile(evoSuiteFile0, "wN'Q@& ,Pu4C");
      FileInputStream fileInputStream0 = fileUtil0.fetchASINFile("wN'Q@& ,Pu4C", "u2zHn", "u2zHn", "u2zHn");
      assertEquals(13, fileInputStream0.available());
  }

  /**
  //Test case number: 88
  /*Coverage entropy=0.6365141682948128
  */
  @Test(timeout = 4000)
  public void test88()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      fileUtil0.renameFile("", "Or{cWNM(TX");
  }

  /**
  //Test case number: 89
  /*Coverage entropy=0.6365141682948128
  */
  @Test(timeout = 4000)
  public void test89()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      fileUtil0.renameFile("Ii4/jt\u0007SHB1nj4R~h?", "Ii4/jt\u0007SHB1nj4R~h?");
  }

  /**
  //Test case number: 90
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test90()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      boolean boolean0 = fileUtil0.isAgeGood((File) null);
      assertFalse(boolean0);
  }

  /**
  //Test case number: 91
  /*Coverage entropy=0.6365141682948128
  */
  @Test(timeout = 4000)
  public void test91()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      fileUtil0.deleteFile("");
  }

  /**
  //Test case number: 92
  /*Coverage entropy=1.0114042647073516
  */
  @Test(timeout = 4000)
  public void test92()  throws Throwable  {
      EvoSuiteURL evoSuiteURL0 = new EvoSuiteURL("http://xml.amazon.net/onca/xml3?t=popcornmonste2-20&dev-t=DSB0XDDW1GQ3S&AsinSearch=wN'Q@& ,Pu4C&type=u2zHn&offerpage=u2zHn&offer=u2zHn&f=xml");
      NetworkHandling.createRemoteTextFile(evoSuiteURL0, "f10[%c3hk");
      FileUtil fileUtil0 = new FileUtil();
      File file0 = fileUtil0.getASINFile("wN'Q@& ,Pu4C", "u2zHn", "u2zHn", "u2zHn");
      assertNull(file0);
  }

  /**
  //Test case number: 93
  /*Coverage entropy=1.6417347121875212
  */
  @Test(timeout = 4000)
  public void test93()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("/S_]E+CQGP1MN:RLU5:Q.XML");
      FileSystemHandling.appendLineToFile(evoSuiteFile0, "Ii4/jt\u0007SHB1nj4R~h?");
      FileInputStream fileInputStream0 = fileUtil0.fetchSimilarItems("]e+cQGp1Mn:RLU5:Q", "vddCrRomwv5099^-XXv");
      assertEquals(19, fileInputStream0.available());
  }
}
