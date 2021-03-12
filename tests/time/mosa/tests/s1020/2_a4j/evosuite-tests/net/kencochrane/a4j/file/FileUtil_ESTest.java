/*
 * This file was automatically generated by EvoSuite
 * Sat Nov 28 03:11:03 GMT 2020
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
      FileInputStream fileInputStream0 = fileUtil0.fetchThirdPartySearchFile(")8EE;gNV7M-VnLwm", ")8EE;gNV7M-VnLwm", ")8EE;gNV7M-VnLwm", "ta");
      assertNull(fileInputStream0);
  }

  /**
  //Test case number: 1
  /*Coverage entropy=1.0397207708399179
  */
  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      FileInputStream fileInputStream0 = fileUtil0.fetchThirdPartySearchFile("", "nnmd", "nnmd", "");
      assertNull(fileInputStream0);
  }

  /**
  //Test case number: 2
  /*Coverage entropy=1.242453324894
  */
  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      FileInputStream fileInputStream0 = fileUtil0.fetchASINFile("*", "3rd_", "*", "*");
      assertNull(fileInputStream0);
  }

  /**
  //Test case number: 3
  /*Coverage entropy=0.6365141682948128
  */
  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      fileUtil0.renameFile(";)dl?|dj54R", "-,vkwXY9qc=Ae#_A");
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
      FileUtil fileUtil0 = new FileUtil();
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("/S_.XML");
      FileSystemHandling.createFolder(evoSuiteFile0);
      FileInputStream fileInputStream0 = fileUtil0.fetchSimilarItems("", "]sCv1si/ua27q0==");
      assertNull(fileInputStream0);
  }

  /**
  //Test case number: 6
  /*Coverage entropy=1.4708084763221112
  */
  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("/S_.XML");
      FileSystemHandling.createFolder(evoSuiteFile0);
      FileSystemHandling.setPermissions(evoSuiteFile0, true, false, false);
      File file0 = fileUtil0.getSimilarItems("", "");
      assertNotNull(file0);
      assertFalse(file0.canExecute());
  }

  /**
  //Test case number: 7
  /*Coverage entropy=1.6417347121875212
  */
  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("/S_.XML");
      FileSystemHandling.appendStringToFile(evoSuiteFile0, "");
      FileInputStream fileInputStream0 = fileUtil0.fetchSimilarItems("", "");
      assertEquals(0, fileInputStream0.available());
  }

  /**
  //Test case number: 8
  /*Coverage entropy=1.6417347121875212
  */
  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("/AUKS[$Z;__HK,*1ST#{0HATS[.XML");
      FileSystemHandling.appendStringToFile(evoSuiteFile0, "aUKS[$z;");
      FileInputStream fileInputStream0 = fileUtil0.fetchBNFile("aUKS[$z;", "", "HK,*1sT#{0hatS[");
      assertEquals(8, fileInputStream0.available());
  }

  /**
  //Test case number: 9
  /*Coverage entropy=1.6417347121875212
  */
  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("/THERE IS NO PROPERIES FILE SETTING TO DEFAULT_THERE IS NO PROPERIES FILE SETTING TO DEFAULT_S&KMCX_S&KMCX.XML");
      FileSystemHandling.appendStringToFile(evoSuiteFile0, "There is no Properies File Setting to default");
      FileInputStream fileInputStream0 = fileUtil0.fetchASINFile("There is no Properies File Setting to default", "s&kmcX", "There is no Properies File Setting to default", "s&kmcX");
      assertEquals(45, fileInputStream0.available());
  }

  /**
  //Test case number: 10
  /*Coverage entropy=0.6365141682948128
  */
  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      MockFile mockFile0 = new MockFile("[?", "[?");
      boolean boolean0 = fileUtil0.isAgeGood(mockFile0);
      assertFalse(boolean0);
  }

  /**
  //Test case number: 11
  /*Coverage entropy=0.9502705392332347
  */
  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      File file0 = fileUtil0.getSimilarItems("", "");
      assertNull(file0);
  }

  /**
  //Test case number: 12
  /*Coverage entropy=0.9502705392332347
  */
  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      File file0 = fileUtil0.getSimilarItems((String) null, (String) null);
      assertNull(file0);
  }

  /**
  //Test case number: 13
  /*Coverage entropy=0.9502705392332347
  */
  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      File file0 = fileUtil0.getBrowseNodeFile((String) null, (String) null, (String) null);
      assertNull(file0);
  }

  /**
  //Test case number: 14
  /*Coverage entropy=0.9502705392332347
  */
  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      File file0 = fileUtil0.getBrowseNodeFile("!wHF50Fjz", "!wHF50Fjz", "!wHF50Fjz");
      assertNull(file0);
  }

  /**
  //Test case number: 15
  /*Coverage entropy=0.9502705392332347
  */
  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      File file0 = fileUtil0.getBrowseNodeFile("", "", "");
      assertNull(file0);
  }

  /**
  //Test case number: 16
  /*Coverage entropy=0.9502705392332347
  */
  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      ArrayList<Object> arrayList0 = new ArrayList<Object>();
      arrayList0.add((Object) null);
      File file0 = fileUtil0.getAccessories("}}2", arrayList0);
      assertNull(file0);
  }

  /**
  //Test case number: 17
  /*Coverage entropy=0.9502705392332347
  */
  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      ArrayList<Object> arrayList0 = new ArrayList<Object>();
      File file0 = fileUtil0.getAccessories((String) null, arrayList0);
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
      File file0 = fileUtil0.getASINFile((String) null, (String) null, (String) null, (String) null);
      assertNull(file0);
  }

  /**
  //Test case number: 20
  /*Coverage entropy=0.9502705392332347
  */
  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      File file0 = fileUtil0.getASINFile("!wHF50Fj*8z", "!wHF50Fj*8z", "!wHF50Fj*8z", "!wHF50Fj*8z");
      assertNull(file0);
  }

  /**
  //Test case number: 21
  /*Coverage entropy=0.9502705392332347
  */
  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      File file0 = fileUtil0.getASINFile("", "", "", "");
      assertNull(file0);
  }

  /**
  //Test case number: 22
  /*Coverage entropy=1.0397207708399179
  */
  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      FileInputStream fileInputStream0 = fileUtil0.fetchThirdPartySearchFile("", "", "", "");
      assertNull(fileInputStream0);
  }

  /**
  //Test case number: 23
  /*Coverage entropy=1.0397207708399179
  */
  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      FileInputStream fileInputStream0 = fileUtil0.fetchThirdPartySearchFile((String) null, (String) null, (String) null, (String) null);
      assertNull(fileInputStream0);
  }

  /**
  //Test case number: 24
  /*Coverage entropy=1.0397207708399179
  */
  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      FileInputStream fileInputStream0 = fileUtil0.fetchThirdPartySearchFile("", "", "aSm\"dYC&A|T{&zd B", "");
      assertNull(fileInputStream0);
  }

  /**
  //Test case number: 25
  /*Coverage entropy=1.242453324894
  */
  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      FileInputStream fileInputStream0 = fileUtil0.fetchSimilarItems("", "]sCv1si/ua27q0==");
      assertNull(fileInputStream0);
  }

  /**
  //Test case number: 26
  /*Coverage entropy=1.0397207708399179
  */
  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      FileInputStream fileInputStream0 = fileUtil0.fetchKeywordSearchFile("", "", "", (String) null);
      assertNull(fileInputStream0);
  }

  /**
  //Test case number: 27
  /*Coverage entropy=1.0397207708399179
  */
  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      FileInputStream fileInputStream0 = fileUtil0.fetchKeywordSearchFile("&[2", (String) null, (String) null, "&[2");
      assertNull(fileInputStream0);
  }

  /**
  //Test case number: 28
  /*Coverage entropy=1.0397207708399179
  */
  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      FileInputStream fileInputStream0 = fileUtil0.fetchKeywordSearchFile((String) null, "", "", "");
      assertNull(fileInputStream0);
  }

  /**
  //Test case number: 29
  /*Coverage entropy=1.0397207708399179
  */
  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      FileInputStream fileInputStream0 = fileUtil0.fetchGenericSearchFile("", "", "", "", "", "");
      assertNull(fileInputStream0);
  }

  /**
  //Test case number: 30
  /*Coverage entropy=1.0397207708399179
  */
  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      FileInputStream fileInputStream0 = fileUtil0.fetchGenericSearchFile("3rd_", "*", (String) null, (String) null, (String) null, (String) null);
      assertNull(fileInputStream0);
  }

  /**
  //Test case number: 31
  /*Coverage entropy=1.0397207708399179
  */
  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      FileInputStream fileInputStream0 = fileUtil0.fetchGenericSearchFile("popcornmonste2-20", (String) null, "popcornmonste2-20", "popcornmonste2-20", (String) null, "popcornmonste2-20");
      assertNull(fileInputStream0);
  }

  /**
  //Test case number: 32
  /*Coverage entropy=1.0397207708399179
  */
  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      FileInputStream fileInputStream0 = fileUtil0.fetchGenericSearchFile((String) null, "", "", "", (String) null, (String) null);
      assertNull(fileInputStream0);
  }

  /**
  //Test case number: 33
  /*Coverage entropy=1.0397207708399179
  */
  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      FileInputStream fileInputStream0 = fileUtil0.fetchGenericSearchFile("", "lite", "", "net.kencochrane.a4j.util.a4jUtil", ",", "p]z?]28HN0!");
      assertNull(fileInputStream0);
  }

  /**
  //Test case number: 34
  /*Coverage entropy=1.0397207708399179
  */
  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      FileInputStream fileInputStream0 = fileUtil0.fetchBlendedSearchFile((String) null, "J\"Cx");
      assertNull(fileInputStream0);
  }

  /**
  //Test case number: 35
  /*Coverage entropy=1.0397207708399179
  */
  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      FileInputStream fileInputStream0 = fileUtil0.fetchBlendedSearchFile("'", (String) null);
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
  /*Coverage entropy=1.242453324894
  */
  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      ArrayList<Object> arrayList0 = new ArrayList<Object>();
      arrayList0.add((Object) "Log file isn't there Setting default properties");
      FileInputStream fileInputStream0 = fileUtil0.fetchAccessories("sBvyGDe8N>^Kv>", arrayList0);
      assertNull(fileInputStream0);
  }

  /**
  //Test case number: 39
  /*Coverage entropy=1.242453324894
  */
  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      ArrayList<Object> arrayList0 = new ArrayList<Object>();
      FileInputStream fileInputStream0 = fileUtil0.fetchAccessories((String) null, arrayList0);
      assertNull(fileInputStream0);
  }

  /**
  //Test case number: 40
  /*Coverage entropy=1.242453324894
  */
  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      FileInputStream fileInputStream0 = fileUtil0.fetchASINFile("", "", "", "");
      assertNull(fileInputStream0);
  }

  /**
  //Test case number: 41
  /*Coverage entropy=1.242453324894
  */
  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      FileInputStream fileInputStream0 = fileUtil0.fetchASINFile((String) null, (String) null, (String) null, (String) null);
      assertNull(fileInputStream0);
  }

  /**
  //Test case number: 42
  /*Coverage entropy=0.6365141682948128
  */
  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      File file0 = fileUtil0.downloadThirdPartySearchFile(",", "ShoppingCart=Klearf=xml&dev-t=", "3rd_", (String) null);
      assertNull(file0);
  }

  /**
  //Test case number: 43
  /*Coverage entropy=0.6365141682948128
  */
  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      File file0 = fileUtil0.downloadThirdPartySearchFile("", "zBYYjt8Oe", (String) null, "zBYYjt8Oe");
      assertNull(file0);
  }

  /**
  //Test case number: 44
  /*Coverage entropy=0.6365141682948128
  */
  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      File file0 = fileUtil0.downloadThirdPartySearchFile((String) null, "", "", "");
      assertNull(file0);
  }

  /**
  //Test case number: 45
  /*Coverage entropy=0.6365141682948128
  */
  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      File file0 = fileUtil0.downloadThirdPartySearchFile("", (String) null, "", "");
      assertNull(file0);
  }

  /**
  //Test case number: 46
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      boolean boolean0 = fileUtil0.downloadSimilaritesFile((String) null, (String) null, (String) null);
      assertFalse(boolean0);
  }

  /**
  //Test case number: 47
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      boolean boolean0 = fileUtil0.downloadSimilaritesFile((String) null, "nSXI']{5 ", (String) null);
      assertFalse(boolean0);
  }

  /**
  //Test case number: 48
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      boolean boolean0 = fileUtil0.downloadSimilaritesFile("There is no Properies File Se,ting to+default", "There is no Properies File Se,ting to+default", "There is no Properies File Se,ting to+default");
      assertFalse(boolean0);
  }

  /**
  //Test case number: 49
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      boolean boolean0 = fileUtil0.downloadSimilaritesFile("", "", "");
      assertFalse(boolean0);
  }

  /**
  //Test case number: 50
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      boolean boolean0 = fileUtil0.downloadOneASINFile("g_", (String) null, (String) null, (String) null, (String) null);
      assertFalse(boolean0);
  }

  /**
  //Test case number: 51
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      boolean boolean0 = fileUtil0.downloadOneASINFile((String) null, "There is no Properies File Setting to default", "There is no Properies File Setting to default", "There is no Properies File Setting to default", "There is no Properies File Setting to default");
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
      File file0 = fileUtil0.downloadKeywordSearchFile((String) null, (String) null, "", (String) null);
      assertNull(file0);
  }

  /**
  //Test case number: 54
  /*Coverage entropy=0.6365141682948128
  */
  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      File file0 = fileUtil0.downloadKeywordSearchFile((String) null, "_", (String) null, (String) null);
      assertNull(file0);
  }

  /**
  //Test case number: 55
  /*Coverage entropy=0.6365141682948128
  */
  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      File file0 = fileUtil0.downloadKeywordSearchFile("b:T%wQw=0K4q+", "b:T%wQw=0K4q+", "b:T%wQw=0K4q+", "b:T%wQw=0K4q+");
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
      File file0 = fileUtil0.downloadGenericSearchFile("&,%2", "&,%2", "&,%2", "&,%2", "&,%2", "&,%2");
      assertNull(file0);
  }

  /**
  //Test case number: 58
  /*Coverage entropy=0.6365141682948128
  */
  @Test(timeout = 4000)
  public void test58()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      File file0 = fileUtil0.downloadGenericSearchFile((String) null, (String) null, (String) null, (String) null, (String) null, "");
      assertNull(file0);
  }

  /**
  //Test case number: 59
  /*Coverage entropy=0.6365141682948128
  */
  @Test(timeout = 4000)
  public void test59()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      File file0 = fileUtil0.downloadGenericSearchFile(";n9a", (String) null, ", ", "SimilaritySearch", ";n9a", (String) null);
      assertNull(file0);
  }

  /**
  //Test case number: 60
  /*Coverage entropy=0.6365141682948128
  */
  @Test(timeout = 4000)
  public void test60()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      File file0 = fileUtil0.downloadGenericSearchFile("", "", "", "", "", "");
      assertNull(file0);
  }

  /**
  //Test case number: 61
  /*Coverage entropy=0.6365141682948128
  */
  @Test(timeout = 4000)
  public void test61()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      File file0 = fileUtil0.downloadCart((String) null);
      assertNull(file0);
  }

  /**
  //Test case number: 62
  /*Coverage entropy=0.6365141682948128
  */
  @Test(timeout = 4000)
  public void test62()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      File file0 = fileUtil0.downloadCart("S&n#(`>l*\"'");
      assertNull(file0);
  }

  /**
  //Test case number: 63
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test63()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      boolean boolean0 = fileUtil0.downloadBrowseNodeFile("oqZ", "oqZ", (String) null, (String) null);
      assertFalse(boolean0);
  }

  /**
  //Test case number: 64
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test64()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      boolean boolean0 = fileUtil0.downloadBrowseNodeFile((String) null, "!G9SPqKvDM]_xzwI} 0", "!G9SPqKvDM]_xzwI} 0", "");
      assertFalse(boolean0);
  }

  /**
  //Test case number: 65
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test65()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      boolean boolean0 = fileUtil0.downloadBrowseNodeFile("f!7^ QI(=BHyHjv", (String) null, (String) null, "X0z2);vit,2Y$");
      assertFalse(boolean0);
  }

  /**
  //Test case number: 66
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test66()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      boolean boolean0 = fileUtil0.downloadBrowseNodeFile("", "", "", "");
      assertFalse(boolean0);
  }

  /**
  //Test case number: 67
  /*Coverage entropy=0.6365141682948128
  */
  @Test(timeout = 4000)
  public void test67()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      File file0 = fileUtil0.downloadBlendedSearchFile((String) null, (String) null);
      assertNull(file0);
  }

  /**
  //Test case number: 68
  /*Coverage entropy=0.6365141682948128
  */
  @Test(timeout = 4000)
  public void test68()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      File file0 = fileUtil0.downloadBlendedSearchFile("&Hmac=", "c<");
      assertNull(file0);
  }

  /**
  //Test case number: 69
  /*Coverage entropy=0.6365141682948128
  */
  @Test(timeout = 4000)
  public void test69()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      File file0 = fileUtil0.downloadBlendedSearchFile("", "");
      assertNull(file0);
  }

  /**
  //Test case number: 70
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test70()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      boolean boolean0 = fileUtil0.downloadAccessoriesFile("c_", (ArrayList) null, "");
      assertFalse(boolean0);
  }

  /**
  //Test case number: 71
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test71()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      ArrayList<Object> arrayList0 = new ArrayList<Object>();
      arrayList0.add((Object) fileUtil0);
      boolean boolean0 = fileUtil0.downloadAccessoriesFile("]*u,7r9)Se$D", arrayList0, "]*u,7r9)Se$D");
      assertFalse(boolean0);
  }

  /**
  //Test case number: 72
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test72()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      ArrayList<Object> arrayList0 = new ArrayList<Object>();
      boolean boolean0 = fileUtil0.downloadAccessoriesFile((String) null, arrayList0, (String) null);
      assertFalse(boolean0);
  }

  /**
  //Test case number: 73
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test73()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      ArrayList<Object> arrayList0 = new ArrayList<Object>();
      boolean boolean0 = fileUtil0.downloadAccessoriesFile("", arrayList0, "");
      assertFalse(boolean0);
  }

  /**
  //Test case number: 74
  /*Coverage entropy=0.6365141682948128
  */
  @Test(timeout = 4000)
  public void test74()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      fileUtil0.deleteFile("3rd_");
  }

  /**
  //Test case number: 75
  /*Coverage entropy=0.6365141682948128
  */
  @Test(timeout = 4000)
  public void test75()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      fileUtil0.deleteFile("");
  }

  /**
  //Test case number: 76
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test76()  throws Throwable  {
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
  //Test case number: 77
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test77()  throws Throwable  {
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
  //Test case number: 78
  /*Coverage entropy=0.6365141682948128
  */
  @Test(timeout = 4000)
  public void test78()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      File file0 = fileUtil0.downloadCart("");
      assertNull(file0);
  }

  /**
  //Test case number: 79
  /*Coverage entropy=1.6417347121875212
  */
  @Test(timeout = 4000)
  public void test79()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("/S_NULL.XML");
      FileSystemHandling.appendLineToFile(evoSuiteFile0, "&[2");
      FileInputStream fileInputStream0 = fileUtil0.fetchSimilarItems((String) null, (String) null);
      assertEquals(4, fileInputStream0.available());
  }

  /**
  //Test case number: 80
  /*Coverage entropy=1.242453324894
  */
  @Test(timeout = 4000)
  public void test80()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      FileInputStream fileInputStream0 = fileUtil0.fetchSimilarItems("b.kN", "");
      assertNull(fileInputStream0);
  }

  /**
  //Test case number: 81
  /*Coverage entropy=0.9502705392332347
  */
  @Test(timeout = 4000)
  public void test81()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      File file0 = fileUtil0.getSimilarItems("}}2", "}}2");
      assertNull(file0);
  }

  /**
  //Test case number: 82
  /*Coverage entropy=1.242453324894
  */
  @Test(timeout = 4000)
  public void test82()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      FileInputStream fileInputStream0 = fileUtil0.fetchAccessories("", (ArrayList) null);
      assertNull(fileInputStream0);
  }

  /**
  //Test case number: 83
  /*Coverage entropy=0.9502705392332347
  */
  @Test(timeout = 4000)
  public void test83()  throws Throwable  {
      EvoSuiteURL evoSuiteURL0 = new EvoSuiteURL("http://xml.amazon.net/onca/xml3?t=popcornmonste2-20&dev-t=DSB0XDDW1GQ3S&SellerSearch=&[2&type=&[2&page=&[2&offerstatus=&[2&f=xml");
      NetworkHandling.createRemoteTextFile(evoSuiteURL0, "&[2");
      FileUtil fileUtil0 = new FileUtil();
      FileInputStream fileInputStream0 = fileUtil0.fetchThirdPartySearchFile("&[2", "&[2", "&[2", "&[2");
      assertNull(fileInputStream0);
  }

  /**
  //Test case number: 84
  /*Coverage entropy=0.9502705392332347
  */
  @Test(timeout = 4000)
  public void test84()  throws Throwable  {
      EvoSuiteURL evoSuiteURL0 = new EvoSuiteURL("http://xml.amazon.net/onca/xml3?t=popcornmonste2-20&dev-t=DSB0XDDW1GQ3S&3rd_=3rd_&mode=3rd_&type=3rd_&page=3rd_&offer=3rd_&f=xml");
      NetworkHandling.createRemoteTextFile(evoSuiteURL0, "TD8W");
      FileUtil fileUtil0 = new FileUtil();
      FileInputStream fileInputStream0 = fileUtil0.fetchGenericSearchFile("3rd_", "3rd_", "3rd_", "3rd_", "3rd_", "3rd_");
      assertNull(fileInputStream0);
  }

  /**
  //Test case number: 85
  /*Coverage entropy=0.9502705392332347
  */
  @Test(timeout = 4000)
  public void test85()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      EvoSuiteURL evoSuiteURL0 = new EvoSuiteURL("http://xml.amazon.net/onca/xml3?t=popcornmonste2-20&dev-t=DSB0XDDW1GQ3S&KeywordSearch=b%7CK&mode=b|K&type=YykglJ7Z/h&page=G&f=xml");
      NetworkHandling.createRemoteTextFile(evoSuiteURL0, "G");
      FileInputStream fileInputStream0 = fileUtil0.fetchKeywordSearchFile("b|K", "b|K", "YykglJ7Z/h", "G");
      assertNull(fileInputStream0);
  }

  /**
  //Test case number: 86
  /*Coverage entropy=0.9502705392332347
  */
  @Test(timeout = 4000)
  public void test86()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      EvoSuiteURL evoSuiteURL0 = new EvoSuiteURL("http://xml.amazon.net/onca/xml3?t=popcornmonste2-20&dev-t=DSB0XDDW1GQ3S&BlendedSearch=&type=&f=xml");
      NetworkHandling.createRemoteTextFile(evoSuiteURL0, "HK,*1sT#{0hatS[");
      FileInputStream fileInputStream0 = fileUtil0.fetchBlendedSearchFile("", "");
      assertNull(fileInputStream0);
  }

  /**
  //Test case number: 87
  /*Coverage entropy=1.6417347121875212
  */
  @Test(timeout = 4000)
  public void test87()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("/OFFER=_C__S&KMCX.XML");
      FileSystemHandling.createFolder(evoSuiteFile0);
      FileInputStream fileInputStream0 = fileUtil0.fetchBNFile("offer=", "c_", "s&kmcX");
      assertNull(fileInputStream0);
  }

  /**
  //Test case number: 88
  /*Coverage entropy=1.277034259466139
  */
  @Test(timeout = 4000)
  public void test88()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      EvoSuiteURL evoSuiteURL0 = new EvoSuiteURL("http://xml.amazon.net/onca/xml3?t=popcornmonste2-20&dev-t=DSB0XDDW1GQ3S&BrowseNodeSearch=c_&mode=offer=&type=lite&page=s&kmcX&offer=new&f=xml");
      NetworkHandling.createRemoteTextFile(evoSuiteURL0, "There is no Properies File Setting to default");
      FileInputStream fileInputStream0 = fileUtil0.fetchBNFile("offer=", "c_", "s&kmcX");
      assertNull(fileInputStream0);
  }

  /**
  //Test case number: 89
  /*Coverage entropy=1.6417347121875212
  */
  @Test(timeout = 4000)
  public void test89()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("/_NULL__.XML");
      FileSystemHandling.createFolder(evoSuiteFile0);
      FileInputStream fileInputStream0 = fileUtil0.fetchASINFile("", "", (String) null, "");
      assertNull(fileInputStream0);
  }

  /**
  //Test case number: 90
  /*Coverage entropy=0.6365141682948128
  */
  @Test(timeout = 4000)
  public void test90()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      fileUtil0.renameFile("", "");
  }

  /**
  //Test case number: 91
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test91()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      boolean boolean0 = fileUtil0.isAgeGood((File) null);
      assertFalse(boolean0);
  }

  /**
  //Test case number: 92
  /*Coverage entropy=1.515707952085713
  */
  @Test(timeout = 4000)
  public void test92()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("/S_.XML");
      FileSystemHandling.appendStringToFile(evoSuiteFile0, "Xz?D'Som5+S+dsM)6!<");
      EvoSuiteURL evoSuiteURL0 = new EvoSuiteURL("http://xml.amazon.net/onca/xml3?t=popcornmonste2-20&dev-t=DSB0XDDW1GQ3S&SimilaritySearch=&type=lite&offerpage=null&offer=all&f=xml");
      NetworkHandling.createRemoteTextFile(evoSuiteURL0, "!G9YPqKvDM]_xzwIr t");
      File file0 = fileUtil0.getSimilarItems("", (String) null);
      assertEquals(19L, file0.length());
      assertNotNull(file0);
  }

  /**
  //Test case number: 93
  /*Coverage entropy=1.277034259466139
  */
  @Test(timeout = 4000)
  public void test93()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      EvoSuiteURL evoSuiteURL0 = new EvoSuiteURL("http://xml.amazon.net/onca/xml3?t=popcornmonste2-20&dev-t=DSB0XDDW1GQ3S&AsinSearch=There is no Properies File Setting to default&type=There is no Properies File Setting to default&offerpage=There is no Properies File Setting to default&offer=There is no Properies File Setting to default&f=xml");
      NetworkHandling.createRemoteTextFile(evoSuiteURL0, "There is no Properies File Setting to default");
      FileInputStream fileInputStream0 = fileUtil0.fetchASINFile("There is no Properies File Setting to default", "There is no Properies File Setting to default", "There is no Properies File Setting to default", "There is no Properies File Setting to default");
      assertNull(fileInputStream0);
  }
}
