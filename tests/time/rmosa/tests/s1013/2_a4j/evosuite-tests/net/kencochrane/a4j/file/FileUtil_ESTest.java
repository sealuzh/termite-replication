/*
 * This file was automatically generated by EvoSuite
 * Sat Nov 28 23:54:38 GMT 2020
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
  public void test000()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      FileInputStream fileInputStream0 = fileUtil0.fetchThirdPartySearchFile("FgO", "", "FgO", "FgO");
      assertNull(fileInputStream0);
  }

  /**
  //Test case number: 1
  /*Coverage entropy=1.0397207708399179
  */
  @Test(timeout = 4000)
  public void test001()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      FileInputStream fileInputStream0 = fileUtil0.fetchThirdPartySearchFile("qk4[G'{#$G2h;5ytt]", "qk4[G'{#$G2h;5ytt]", "Xsi1I6aQ.+$0&tl", "=");
      assertNull(fileInputStream0);
  }

  /**
  //Test case number: 2
  /*Coverage entropy=1.0397207708399179
  */
  @Test(timeout = 4000)
  public void test002()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      FileInputStream fileInputStream0 = fileUtil0.fetchGenericSearchFile("ts_", "ts_", "ts_", "ts_", "f<yjsr6u@h", "f<yjsr6u@h");
      assertNull(fileInputStream0);
  }

  /**
  //Test case number: 3
  /*Coverage entropy=1.0397207708399179
  */
  @Test(timeout = 4000)
  public void test003()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      FileInputStream fileInputStream0 = fileUtil0.fetchGenericSearchFile("}", (String) null, "}", "}", (String) null, (String) null);
      assertNull(fileInputStream0);
  }

  /**
  //Test case number: 4
  /*Coverage entropy=0.6365141682948128
  */
  @Test(timeout = 4000)
  public void test004()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      MockFile mockFile0 = new MockFile("${8r+");
      boolean boolean0 = fileUtil0.isAgeGood(mockFile0);
      assertFalse(boolean0);
  }

  /**
  //Test case number: 5
  /*Coverage entropy=1.6417347121875212
  */
  @Test(timeout = 4000)
  public void test005()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("/A_EKA4CUI6Q6T.XML");
      FileSystemHandling.createFolder(evoSuiteFile0);
      FileInputStream fileInputStream0 = fileUtil0.fetchAccessories("Eka4CUI6Q6t", (ArrayList) null);
      assertNull(fileInputStream0);
  }

  /**
  //Test case number: 6
  /*Coverage entropy=1.6417347121875212
  */
  @Test(timeout = 4000)
  public void test006()  throws Throwable  {
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("/___.XML");
      FileSystemHandling.createFolder(evoSuiteFile0);
      FileUtil fileUtil0 = new FileUtil();
      FileInputStream fileInputStream0 = fileUtil0.fetchASINFile("", "", "", "");
      assertNull(fileInputStream0);
  }

  /**
  //Test case number: 7
  /*Coverage entropy=1.4708084763221112
  */
  @Test(timeout = 4000)
  public void test007()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      fileUtil0.cacheDir = "YUm#<ii~Qkb";
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("YUm#<ii~QkbS_.XML");
      FileSystemHandling.createFolder(evoSuiteFile0);
      File file0 = fileUtil0.getSimilarItems("", "");
      assertNotNull(file0);
      assertTrue(file0.isDirectory());
  }

  /**
  //Test case number: 8
  /*Coverage entropy=1.4708084763221112
  */
  @Test(timeout = 4000)
  public void test008()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("/A_,.XML");
      FileSystemHandling.appendStringToFile(evoSuiteFile0, ",");
      ArrayList<Integer> arrayList0 = new ArrayList<Integer>();
      File file0 = fileUtil0.getAccessories(",", arrayList0);
      assertEquals(1L, file0.length());
      assertNotNull(file0);
  }

  /**
  //Test case number: 9
  /*Coverage entropy=1.4708084763221112
  */
  @Test(timeout = 4000)
  public void test009()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("/A_,.XML");
      FileSystemHandling.createFolder(evoSuiteFile0);
      ArrayList<Integer> arrayList0 = new ArrayList<Integer>();
      File file0 = fileUtil0.getAccessories(",", arrayList0);
      assertNotNull(file0);
      assertEquals("/A_,.XML", file0.toString());
      assertFalse(file0.isFile());
  }

  /**
  //Test case number: 10
  /*Coverage entropy=1.4708084763221112
  */
  @Test(timeout = 4000)
  public void test010()  throws Throwable  {
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("/___.XML");
      FileSystemHandling.createFolder(evoSuiteFile0);
      FileUtil fileUtil0 = new FileUtil();
      File file0 = fileUtil0.getASINFile("", "", "", "");
      assertNotNull(file0);
      assertEquals("/___.XML", file0.toString());
      assertTrue(file0.canRead());
  }

  /**
  //Test case number: 11
  /*Coverage entropy=1.4708084763221112
  */
  @Test(timeout = 4000)
  public void test011()  throws Throwable  {
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("/___.XML");
      FileSystemHandling.appendLineToFile(evoSuiteFile0, "1!MN\"*s?gvN4&");
      FileUtil fileUtil0 = new FileUtil();
      File file0 = fileUtil0.getASINFile("", "", "", "");
      assertNotNull(file0);
      assertEquals(14L, file0.length());
  }

  /**
  //Test case number: 12
  /*Coverage entropy=1.6417347121875212
  */
  @Test(timeout = 4000)
  public void test012()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("/S_.XML");
      byte[] byteArray0 = new byte[4];
      FileSystemHandling.appendDataToFile(evoSuiteFile0, byteArray0);
      FileInputStream fileInputStream0 = fileUtil0.fetchSimilarItems("", "bGgfn?3E'sOHj Re");
      assertEquals(4, fileInputStream0.available());
  }

  /**
  //Test case number: 13
  /*Coverage entropy=1.6417347121875212
  */
  @Test(timeout = 4000)
  public void test013()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("/A_EKA4CUI6Q6T.XML");
      byte[] byteArray0 = new byte[9];
      FileSystemHandling.appendDataToFile(evoSuiteFile0, byteArray0);
      FileInputStream fileInputStream0 = fileUtil0.fetchAccessories("Eka4CUI6Q6t", (ArrayList) null);
      assertEquals(9, fileInputStream0.available());
  }

  /**
  //Test case number: 14
  /*Coverage entropy=1.6417347121875212
  */
  @Test(timeout = 4000)
  public void test014()  throws Throwable  {
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("/___.XML");
      FileSystemHandling.appendStringToFile(evoSuiteFile0, "ShoppingCart=clear&f=xml&dev-t=");
      FileUtil fileUtil0 = new FileUtil();
      FileInputStream fileInputStream0 = fileUtil0.fetchASINFile("", "", "", "");
      assertEquals(31, fileInputStream0.available());
  }

  /**
  //Test case number: 15
  /*Coverage entropy=0.6365141682948128
  */
  @Test(timeout = 4000)
  public void test015()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      fileUtil0.renameFile("/", "/");
  }

  /**
  //Test case number: 16
  /*Coverage entropy=1.4708084763221112
  */
  @Test(timeout = 4000)
  public void test016()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("/S_.XML");
      byte[] byteArray0 = new byte[4];
      FileSystemHandling.appendDataToFile(evoSuiteFile0, byteArray0);
      File file0 = fileUtil0.getSimilarItems("", "");
      assertNotNull(file0);
      
      boolean boolean0 = fileUtil0.isAgeGood(file0);
      assertEquals(4L, file0.length());
      assertFalse(boolean0);
  }

  /**
  //Test case number: 17
  /*Coverage entropy=0.9502705392332347
  */
  @Test(timeout = 4000)
  public void test017()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      File file0 = fileUtil0.getSimilarItems((String) null, (String) null);
      assertNull(file0);
  }

  /**
  //Test case number: 18
  /*Coverage entropy=0.9502705392332347
  */
  @Test(timeout = 4000)
  public void test018()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      File file0 = fileUtil0.getSimilarItems("#AqzOUZgL&5*&3z|;", "#AqzOUZgL&5*&3z|;");
      assertNull(file0);
  }

  /**
  //Test case number: 19
  /*Coverage entropy=0.9502705392332347
  */
  @Test(timeout = 4000)
  public void test019()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      File file0 = fileUtil0.getBrowseNodeFile("yl`", "yl`", "yl`");
      assertNull(file0);
  }

  /**
  //Test case number: 20
  /*Coverage entropy=0.9502705392332347
  */
  @Test(timeout = 4000)
  public void test020()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      File file0 = fileUtil0.getBrowseNodeFile((String) null, (String) null, (String) null);
      assertNull(file0);
  }

  /**
  //Test case number: 21
  /*Coverage entropy=0.9502705392332347
  */
  @Test(timeout = 4000)
  public void test021()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      File file0 = fileUtil0.getBrowseNodeFile((String) null, "(uQ!NB9KPR4F[?\"};", (String) null);
      assertNull(file0);
  }

  /**
  //Test case number: 22
  /*Coverage entropy=0.9502705392332347
  */
  @Test(timeout = 4000)
  public void test022()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      File file0 = fileUtil0.getBrowseNodeFile("", "", "");
      assertNull(file0);
  }

  /**
  //Test case number: 23
  /*Coverage entropy=0.9502705392332347
  */
  @Test(timeout = 4000)
  public void test023()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      File file0 = fileUtil0.getAccessories("12`GV", (ArrayList) null);
      assertNull(file0);
  }

  /**
  //Test case number: 24
  /*Coverage entropy=0.9502705392332347
  */
  @Test(timeout = 4000)
  public void test024()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      ArrayList<Integer> arrayList0 = new ArrayList<Integer>();
      Integer integer0 = new Integer(1508);
      arrayList0.add(integer0);
      File file0 = fileUtil0.getAccessories(",", arrayList0);
      assertNull(file0);
  }

  /**
  //Test case number: 25
  /*Coverage entropy=0.9502705392332347
  */
  @Test(timeout = 4000)
  public void test025()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      ArrayList<String> arrayList0 = new ArrayList<String>();
      File file0 = fileUtil0.getAccessories((String) null, arrayList0);
      assertNull(file0);
  }

  /**
  //Test case number: 26
  /*Coverage entropy=0.9502705392332347
  */
  @Test(timeout = 4000)
  public void test026()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      ArrayList<Integer> arrayList0 = new ArrayList<Integer>();
      File file0 = fileUtil0.getAccessories("", arrayList0);
      assertNull(file0);
  }

  /**
  //Test case number: 27
  /*Coverage entropy=0.9502705392332347
  */
  @Test(timeout = 4000)
  public void test027()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      File file0 = fileUtil0.getASINFile("net.kencochrane.a4j.file.FileUtil", "net.kencochrane.a4j.file.FileUtil", "net.kencochrane.a4j.file.FileUtil", (String) null);
      assertNull(file0);
  }

  /**
  //Test case number: 28
  /*Coverage entropy=0.9502705392332347
  */
  @Test(timeout = 4000)
  public void test028()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      File file0 = fileUtil0.getASINFile((String) null, (String) null, (String) null, "");
      assertNull(file0);
  }

  /**
  //Test case number: 29
  /*Coverage entropy=0.9502705392332347
  */
  @Test(timeout = 4000)
  public void test029()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      File file0 = fileUtil0.getASINFile("dg0o7", "dg0o7", "dg0o7", "dg0o7");
      assertNull(file0);
  }

  /**
  //Test case number: 30
  /*Coverage entropy=1.0397207708399179
  */
  @Test(timeout = 4000)
  public void test030()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      FileInputStream fileInputStream0 = fileUtil0.fetchThirdPartySearchFile((String) null, (String) null, (String) null, (String) null);
      assertNull(fileInputStream0);
  }

  /**
  //Test case number: 31
  /*Coverage entropy=1.0397207708399179
  */
  @Test(timeout = 4000)
  public void test031()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      FileInputStream fileInputStream0 = fileUtil0.fetchThirdPartySearchFile("", "", "", "");
      assertNull(fileInputStream0);
  }

  /**
  //Test case number: 32
  /*Coverage entropy=1.242453324894
  */
  @Test(timeout = 4000)
  public void test032()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      FileInputStream fileInputStream0 = fileUtil0.fetchSimilarItems((String) null, (String) null);
      assertNull(fileInputStream0);
  }

  /**
  //Test case number: 33
  /*Coverage entropy=1.0397207708399179
  */
  @Test(timeout = 4000)
  public void test033()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      FileInputStream fileInputStream0 = fileUtil0.fetchKeywordSearchFile("", "", (String) null, (String) null);
      assertNull(fileInputStream0);
  }

  /**
  //Test case number: 34
  /*Coverage entropy=1.0397207708399179
  */
  @Test(timeout = 4000)
  public void test034()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      FileInputStream fileInputStream0 = fileUtil0.fetchKeywordSearchFile("", "", "=F_Qq~:G,xX8", "a_");
      assertNull(fileInputStream0);
  }

  /**
  //Test case number: 35
  /*Coverage entropy=1.0397207708399179
  */
  @Test(timeout = 4000)
  public void test035()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      FileInputStream fileInputStream0 = fileUtil0.fetchKeywordSearchFile("", "Y_YV", "", "w#}j'|,adJE>S");
      assertNull(fileInputStream0);
  }

  /**
  //Test case number: 36
  /*Coverage entropy=1.0397207708399179
  */
  @Test(timeout = 4000)
  public void test036()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      FileInputStream fileInputStream0 = fileUtil0.fetchKeywordSearchFile((String) null, (String) null, (String) null, "3rd_");
      assertNull(fileInputStream0);
  }

  /**
  //Test case number: 37
  /*Coverage entropy=1.0397207708399179
  */
  @Test(timeout = 4000)
  public void test037()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      FileInputStream fileInputStream0 = fileUtil0.fetchKeywordSearchFile("<i_zQ7GX/87^", "", "", "1");
      assertNull(fileInputStream0);
  }

  /**
  //Test case number: 38
  /*Coverage entropy=1.0397207708399179
  */
  @Test(timeout = 4000)
  public void test038()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      FileInputStream fileInputStream0 = fileUtil0.fetchGenericSearchFile("}", "}", "}", (String) null, (String) null, "}");
      assertNull(fileInputStream0);
  }

  /**
  //Test case number: 39
  /*Coverage entropy=1.0397207708399179
  */
  @Test(timeout = 4000)
  public void test039()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      FileInputStream fileInputStream0 = fileUtil0.fetchGenericSearchFile("", "", "", "", "", "");
      assertNull(fileInputStream0);
  }

  /**
  //Test case number: 40
  /*Coverage entropy=1.0397207708399179
  */
  @Test(timeout = 4000)
  public void test040()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      FileInputStream fileInputStream0 = fileUtil0.fetchGenericSearchFile((String) null, (String) null, (String) null, "TX4fxNTVN6qdQ6", "y3#YJE}", (String) null);
      assertNull(fileInputStream0);
  }

  /**
  //Test case number: 41
  /*Coverage entropy=1.0397207708399179
  */
  @Test(timeout = 4000)
  public void test041()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      FileInputStream fileInputStream0 = fileUtil0.fetchGenericSearchFile("", "F~./N", "F~./N", "", "", "F~./N");
      assertNull(fileInputStream0);
  }

  /**
  //Test case number: 42
  /*Coverage entropy=1.0397207708399179
  */
  @Test(timeout = 4000)
  public void test042()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      FileInputStream fileInputStream0 = fileUtil0.fetchBlendedSearchFile("", "");
      assertNull(fileInputStream0);
  }

  /**
  //Test case number: 43
  /*Coverage entropy=1.0397207708399179
  */
  @Test(timeout = 4000)
  public void test043()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      FileInputStream fileInputStream0 = fileUtil0.fetchBlendedSearchFile((String) null, (String) null);
      assertNull(fileInputStream0);
  }

  /**
  //Test case number: 44
  /*Coverage entropy=1.0397207708399179
  */
  @Test(timeout = 4000)
  public void test044()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      FileInputStream fileInputStream0 = fileUtil0.fetchBlendedSearchFile(".xml", ".xml");
      assertNull(fileInputStream0);
  }

  /**
  //Test case number: 45
  /*Coverage entropy=1.2424533248940002
  */
  @Test(timeout = 4000)
  public void test045()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      FileInputStream fileInputStream0 = fileUtil0.fetchBNFile("", (String) null, "<");
      assertNull(fileInputStream0);
  }

  /**
  //Test case number: 46
  /*Coverage entropy=1.2424533248940002
  */
  @Test(timeout = 4000)
  public void test046()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      FileInputStream fileInputStream0 = fileUtil0.fetchBNFile((String) null, "", (String) null);
      assertNull(fileInputStream0);
  }

  /**
  //Test case number: 47
  /*Coverage entropy=1.2424533248940002
  */
  @Test(timeout = 4000)
  public void test047()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      FileInputStream fileInputStream0 = fileUtil0.fetchBNFile("", "l~:aqp_Q;", "");
      assertNull(fileInputStream0);
  }

  /**
  //Test case number: 48
  /*Coverage entropy=1.242453324894
  */
  @Test(timeout = 4000)
  public void test048()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      ArrayList<String> arrayList0 = new ArrayList<String>();
      arrayList0.add("");
      FileInputStream fileInputStream0 = fileUtil0.fetchAccessories("l", arrayList0);
      assertNull(fileInputStream0);
  }

  /**
  //Test case number: 49
  /*Coverage entropy=1.242453324894
  */
  @Test(timeout = 4000)
  public void test049()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      ArrayList<Object> arrayList0 = new ArrayList<Object>();
      FileInputStream fileInputStream0 = fileUtil0.fetchAccessories((String) null, arrayList0);
      assertNull(fileInputStream0);
  }

  /**
  //Test case number: 50
  /*Coverage entropy=1.242453324894
  */
  @Test(timeout = 4000)
  public void test050()  throws Throwable  {
      ArrayList<Object> arrayList0 = new ArrayList<Object>();
      FileUtil fileUtil0 = new FileUtil();
      FileInputStream fileInputStream0 = fileUtil0.fetchAccessories("", arrayList0);
      assertNull(fileInputStream0);
  }

  /**
  //Test case number: 51
  /*Coverage entropy=1.242453324894
  */
  @Test(timeout = 4000)
  public void test051()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      FileInputStream fileInputStream0 = fileUtil0.fetchASINFile("l", "FWBgP\"aI_Q", "FWBgP\"aI_Q", "l");
      assertNull(fileInputStream0);
  }

  /**
  //Test case number: 52
  /*Coverage entropy=1.242453324894
  */
  @Test(timeout = 4000)
  public void test052()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      FileInputStream fileInputStream0 = fileUtil0.fetchASINFile((String) null, (String) null, (String) null, (String) null);
      assertNull(fileInputStream0);
  }

  /**
  //Test case number: 53
  /*Coverage entropy=0.6365141682948128
  */
  @Test(timeout = 4000)
  public void test053()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      File file0 = fileUtil0.downloadThirdPartySearchFile("", "", "", "");
      assertNull(file0);
  }

  /**
  //Test case number: 54
  /*Coverage entropy=0.6365141682948128
  */
  @Test(timeout = 4000)
  public void test054()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      File file0 = fileUtil0.downloadThirdPartySearchFile("lU", "lU", "lU", "lU");
      assertNull(file0);
  }

  /**
  //Test case number: 55
  /*Coverage entropy=0.6365141682948128
  */
  @Test(timeout = 4000)
  public void test055()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      File file0 = fileUtil0.downloadThirdPartySearchFile((String) null, (String) null, (String) null, (String) null);
      assertNull(file0);
  }

  /**
  //Test case number: 56
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test056()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      boolean boolean0 = fileUtil0.downloadSimilaritesFile((String) null, (String) null, (String) null);
      assertFalse(boolean0);
  }

  /**
  //Test case number: 57
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test057()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      boolean boolean0 = fileUtil0.downloadSimilaritesFile((String) null, "AsinSearch", "");
      assertFalse(boolean0);
  }

  /**
  //Test case number: 58
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test058()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      boolean boolean0 = fileUtil0.downloadSimilaritesFile("3uY^\"(ST??{Gv[", "", "G2G(&XR\" 3");
      assertFalse(boolean0);
  }

  /**
  //Test case number: 59
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test059()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      boolean boolean0 = fileUtil0.downloadOneASINFile("all", "all", (String) null, "all", (String) null);
      assertFalse(boolean0);
  }

  /**
  //Test case number: 60
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test060()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      boolean boolean0 = fileUtil0.downloadOneASINFile("y3#YJE}", "", "y3#YJE}", "y3#YJE}", "");
      assertFalse(boolean0);
  }

  /**
  //Test case number: 61
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test061()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      boolean boolean0 = fileUtil0.downloadOneASINFile((String) null, (String) null, "amazonServerURL", (String) null, (String) null);
      assertFalse(boolean0);
  }

  /**
  //Test case number: 62
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test062()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      boolean boolean0 = fileUtil0.downloadOneASINFile("-YB6e*S'u^bsu?J<`?", "-YB6e*S'u^bsu?J<`?", "SimilaritySearch", "SimilaritySearch", "-YB6e*S'u^bsu?J<`?");
      assertFalse(boolean0);
  }

  /**
  //Test case number: 63
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test063()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      boolean boolean0 = fileUtil0.downloadOneASINFile("", "ShoppingCart=remove&f=xml&dev-t=", "", "", "");
      assertFalse(boolean0);
  }

  /**
  //Test case number: 64
  /*Coverage entropy=0.6365141682948128
  */
  @Test(timeout = 4000)
  public void test064()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      File file0 = fileUtil0.downloadKeywordSearchFile("", "", "", "");
      assertNull(file0);
  }

  /**
  //Test case number: 65
  /*Coverage entropy=0.6365141682948128
  */
  @Test(timeout = 4000)
  public void test065()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      File file0 = fileUtil0.downloadKeywordSearchFile((String) null, (String) null, (String) null, "4^S0.]abMkP1J");
      assertNull(file0);
  }

  /**
  //Test case number: 66
  /*Coverage entropy=0.6365141682948128
  */
  @Test(timeout = 4000)
  public void test066()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      File file0 = fileUtil0.downloadKeywordSearchFile((String) null, "4^S0.]abMkP1J", (String) null, (String) null);
      assertNull(file0);
  }

  /**
  //Test case number: 67
  /*Coverage entropy=0.6365141682948128
  */
  @Test(timeout = 4000)
  public void test067()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      File file0 = fileUtil0.downloadKeywordSearchFile("4^S0.]abMkP1J", "4^S0.]abMkP1J", "4^S0.]abMkP1J", "4^S0.]abMkP1J");
      assertNull(file0);
  }

  /**
  //Test case number: 68
  /*Coverage entropy=0.6365141682948128
  */
  @Test(timeout = 4000)
  public void test068()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      File file0 = fileUtil0.downloadGenericSearchFile("", "", "kDVk2WcS", "", "kDVk2WcS", "");
      assertNull(file0);
  }

  /**
  //Test case number: 69
  /*Coverage entropy=0.6365141682948128
  */
  @Test(timeout = 4000)
  public void test069()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      File file0 = fileUtil0.downloadGenericSearchFile("_ro\".", "", "", "_ro\".", "", "_ro\".");
      assertNull(file0);
  }

  /**
  //Test case number: 70
  /*Coverage entropy=0.6365141682948128
  */
  @Test(timeout = 4000)
  public void test070()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      File file0 = fileUtil0.downloadGenericSearchFile((String) null, (String) null, (String) null, (String) null, (String) null, (String) null);
      assertNull(file0);
  }

  /**
  //Test case number: 71
  /*Coverage entropy=0.6365141682948128
  */
  @Test(timeout = 4000)
  public void test071()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      File file0 = fileUtil0.downloadGenericSearchFile("", "  m~1f?8/3MM=$T%:@", "  m~1f?8/3MM=$T%:@", "", "Ct7eza%", "MNnL?6FV^3r}d");
      assertNull(file0);
  }

  /**
  //Test case number: 72
  /*Coverage entropy=0.6365141682948128
  */
  @Test(timeout = 4000)
  public void test072()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      File file0 = fileUtil0.downloadCart((String) null);
      assertNull(file0);
  }

  /**
  //Test case number: 73
  /*Coverage entropy=0.6365141682948128
  */
  @Test(timeout = 4000)
  public void test073()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      File file0 = fileUtil0.downloadCart("");
      assertNull(file0);
  }

  /**
  //Test case number: 74
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test074()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      boolean boolean0 = fileUtil0.downloadBrowseNodeFile("FgO", "", "FgO", "");
      assertFalse(boolean0);
  }

  /**
  //Test case number: 75
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test075()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      boolean boolean0 = fileUtil0.downloadBrowseNodeFile((String) null, (String) null, (String) null, (String) null);
      assertFalse(boolean0);
  }

  /**
  //Test case number: 76
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test076()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      boolean boolean0 = fileUtil0.downloadBrowseNodeFile(".xml", ".xml", "", ".xml");
      assertFalse(boolean0);
  }

  /**
  //Test case number: 77
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test077()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      boolean boolean0 = fileUtil0.downloadBrowseNodeFile("", "Ukv[", "", "Ukv[");
      assertFalse(boolean0);
  }

  /**
  //Test case number: 78
  /*Coverage entropy=0.6365141682948128
  */
  @Test(timeout = 4000)
  public void test078()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      File file0 = fileUtil0.downloadBlendedSearchFile(".xml", (String) null);
      assertNull(file0);
  }

  /**
  //Test case number: 79
  /*Coverage entropy=0.6365141682948128
  */
  @Test(timeout = 4000)
  public void test079()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      File file0 = fileUtil0.downloadBlendedSearchFile((String) null, "AsinSearch");
      assertNull(file0);
  }

  /**
  //Test case number: 80
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test080()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      ArrayList<String> arrayList0 = new ArrayList<String>();
      boolean boolean0 = fileUtil0.downloadAccessoriesFile("", arrayList0, "");
      assertFalse(boolean0);
  }

  /**
  //Test case number: 81
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test081()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      ArrayList<Integer> arrayList0 = new ArrayList<Integer>();
      Integer integer0 = new Integer((-2145018108));
      arrayList0.add(integer0);
      boolean boolean0 = fileUtil0.downloadAccessoriesFile("AFN$vl}G", arrayList0, "AFN$vl}G");
      assertFalse(boolean0);
  }

  /**
  //Test case number: 82
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test082()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      ArrayList<Object> arrayList0 = new ArrayList<Object>();
      boolean boolean0 = fileUtil0.downloadAccessoriesFile((String) null, arrayList0, (String) null);
      assertFalse(boolean0);
  }

  /**
  //Test case number: 83
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test083()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      boolean boolean0 = fileUtil0.downloadAccessoriesFile("", (ArrayList) null, "=");
      assertFalse(boolean0);
  }

  /**
  //Test case number: 84
  /*Coverage entropy=0.6365141682948128
  */
  @Test(timeout = 4000)
  public void test084()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      fileUtil0.deleteFile("Si?jlaritySearch");
  }

  /**
  //Test case number: 85
  /*Coverage entropy=0.6365141682948128
  */
  @Test(timeout = 4000)
  public void test085()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      fileUtil0.deleteFile("");
  }

  /**
  //Test case number: 86
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test086()  throws Throwable  {
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
  //Test case number: 87
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test087()  throws Throwable  {
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
  //Test case number: 88
  /*Coverage entropy=0.6365141682948128
  */
  @Test(timeout = 4000)
  public void test088()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      File file0 = fileUtil0.downloadCart("5ePp6(?B0T|zrd");
      assertNull(file0);
  }

  /**
  //Test case number: 89
  /*Coverage entropy=0.6365141682948128
  */
  @Test(timeout = 4000)
  public void test089()  throws Throwable  {
      EvoSuiteURL evoSuiteURL0 = new EvoSuiteURL("http://xml.amazon.net/onca/xml3?t=popcornmonste2-20&dev-t=DSB0XDDW1GQ3S&SimilaritySearch=&type=lite&offerpage=&offer=all&f=xml");
      NetworkHandling.createRemoteTextFile(evoSuiteURL0, "#AqzOUZgL&5*\u0003|;");
      FileUtil fileUtil0 = new FileUtil();
      boolean boolean0 = fileUtil0.downloadSimilaritesFile("", "", "k_");
      assertFalse(boolean0);
  }

  /**
  //Test case number: 90
  /*Coverage entropy=1.6417347121875212
  */
  @Test(timeout = 4000)
  public void test090()  throws Throwable  {
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("/S_SHOPPINGCART=CLEAR&F=XML&DEV-T=.XML");
      FileSystemHandling.createFolder(evoSuiteFile0);
      FileUtil fileUtil0 = new FileUtil();
      FileInputStream fileInputStream0 = fileUtil0.fetchSimilarItems("ShoppingCart=clear&f=xml&dev-t=", "");
      assertNull(fileInputStream0);
  }

  /**
  //Test case number: 91
  /*Coverage entropy=1.6417347121875212
  */
  @Test(timeout = 4000)
  public void test091()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("/A_EKA4CUI6Q6T.XML");
      FileSystemHandling.appendStringToFile(evoSuiteFile0, "");
      FileInputStream fileInputStream0 = fileUtil0.fetchAccessories("Eka4CUI6Q6t", (ArrayList) null);
      assertEquals(0, fileInputStream0.available());
  }

  /**
  //Test case number: 92
  /*Coverage entropy=0.9502705392332347
  */
  @Test(timeout = 4000)
  public void test092()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      EvoSuiteURL evoSuiteURL0 = new EvoSuiteURL("http://xml.amazon.net/onca/xml3?t=popcornmonste2-20&dev-t=DSB0XDDW1GQ3S&SellerSearch=  m~1f?8/3MM=$T%:@&type=  m~1f?8/3MM=$T%:@&page=  m~1f?8/3MM=$T%:@&offerstatus=  m~1f?8/3MM=$T%:@&f=xml");
      NetworkHandling.createRemoteTextFile(evoSuiteURL0, "Xsi1I6aQ.+$0&tl");
      FileInputStream fileInputStream0 = fileUtil0.fetchThirdPartySearchFile("  m~1f?8/3MM=$T%:@", "  m~1f?8/3MM=$T%:@", "  m~1f?8/3MM=$T%:@", "  m~1f?8/3MM=$T%:@");
      assertNull(fileInputStream0);
  }

  /**
  //Test case number: 93
  /*Coverage entropy=0.9502705392332347
  */
  @Test(timeout = 4000)
  public void test093()  throws Throwable  {
      EvoSuiteURL evoSuiteURL0 = new EvoSuiteURL("http://xml.amazon.net/onca/xml3?t=popcornmonste2-20&dev-t=DSB0XDDW1GQ3S&}=%7D&mode=}&type=}&page=}&offer=}&f=xml");
      NetworkHandling.createRemoteTextFile(evoSuiteURL0, "k9MH`^1H4HO|`@`5S");
      FileUtil fileUtil0 = new FileUtil();
      FileInputStream fileInputStream0 = fileUtil0.fetchGenericSearchFile("}", "}", "}", "}", "}", "}");
      assertNull(fileInputStream0);
  }

  /**
  //Test case number: 94
  /*Coverage entropy=1.0397207708399179
  */
  @Test(timeout = 4000)
  public void test094()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      FileInputStream fileInputStream0 = fileUtil0.fetchBlendedSearchFile("", "ts_");
      assertNull(fileInputStream0);
  }

  /**
  //Test case number: 95
  /*Coverage entropy=0.9502705392332347
  */
  @Test(timeout = 4000)
  public void test095()  throws Throwable  {
      EvoSuiteURL evoSuiteURL0 = new EvoSuiteURL("http://xml.amazon.net/onca/xml3?t=popcornmonste2-20&dev-t=DSB0XDDW1GQ3S&KeywordSearch=&mode=&type=&page=&f=xml");
      NetworkHandling.createRemoteTextFile(evoSuiteURL0, "JAvZN8-/qC#]}dh{1");
      FileUtil fileUtil0 = new FileUtil();
      FileInputStream fileInputStream0 = fileUtil0.fetchKeywordSearchFile("", "", "", "");
      assertNull(fileInputStream0);
  }

  /**
  //Test case number: 96
  /*Coverage entropy=0.5623351446188083
  */
  @Test(timeout = 4000)
  public void test096()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      EvoSuiteURL evoSuiteURL0 = new EvoSuiteURL("http://xml.amazon.net/onca/xml3?t=popcornmonste2-20&dev-t=DSB0XDDW1GQ3S&BlendedSearch=&type=&f=xml");
      NetworkHandling.createRemoteTextFile(evoSuiteURL0, "*!i2I'?{{[}+wxJ^Ti");
      File file0 = fileUtil0.downloadBlendedSearchFile("", "");
      assertNull(file0);
  }

  /**
  //Test case number: 97
  /*Coverage entropy=1.6417347121875212
  */
  @Test(timeout = 4000)
  public void test097()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("/.XML_.XML_.XML.XML");
      FileSystemHandling.createFolder(evoSuiteFile0);
      FileInputStream fileInputStream0 = fileUtil0.fetchBNFile(".xml", ".xml", ".xml");
      assertNull(fileInputStream0);
  }

  /**
  //Test case number: 98
  /*Coverage entropy=0.6365141682948128
  */
  @Test(timeout = 4000)
  public void test098()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      fileUtil0.renameFile("1", "");
  }

  /**
  //Test case number: 99
  /*Coverage entropy=0.6365141682948128
  */
  @Test(timeout = 4000)
  public void test099()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      fileUtil0.renameFile("", "");
  }

  /**
  //Test case number: 100
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test100()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      boolean boolean0 = fileUtil0.isAgeGood((File) null);
      assertFalse(boolean0);
  }

  /**
  //Test case number: 101
  /*Coverage entropy=1.6417347121875212
  */
  @Test(timeout = 4000)
  public void test101()  throws Throwable  {
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("/SHOPPINGCART=CLEAR&F=XML&DEV-T=__5%NFQ_.XML");
      FileSystemHandling.appendStringToFile(evoSuiteFile0, "");
      FileUtil fileUtil0 = new FileUtil();
      FileInputStream fileInputStream0 = fileUtil0.fetchASINFile("ShoppingCart=clear&f=xml&dev-t=", "5%nFQ", "", "");
      assertEquals(0, fileInputStream0.available());
  }

  /**
  //Test case number: 102
  /*Coverage entropy=1.277034259466139
  */
  @Test(timeout = 4000)
  public void test102()  throws Throwable  {
      EvoSuiteURL evoSuiteURL0 = new EvoSuiteURL("http://xml.amazon.net/onca/xml3?t=popcornmonste2-20&dev-t=DSB0XDDW1GQ3S&AsinSearch=&type=&offerpage=&offer=&f=xml");
      NetworkHandling.createRemoteTextFile(evoSuiteURL0, "&ItemF");
      FileUtil fileUtil0 = new FileUtil();
      FileInputStream fileInputStream0 = fileUtil0.fetchASINFile("", "", "", "");
      assertNull(fileInputStream0);
  }

  /**
  //Test case number: 103
  /*Coverage entropy=1.515707952085713
  */
  @Test(timeout = 4000)
  public void test103()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      EvoSuiteURL evoSuiteURL0 = new EvoSuiteURL("http://xml.amazon.net/onca/xml3?t=popcornmonste2-20&dev-t=DSB0XDDW1GQ3S&BrowseNodeSearch=b_&mode=  m~1f?8/3MM=$T%:@&type=lite&page=null&offer=new&f=xml");
      NetworkHandling.createRemoteTextFile(evoSuiteURL0, "  m~1f?8/3MM=$T%:@");
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("/M~1F?8/3MM=$T%:@_B__NULL.XML");
      FileSystemHandling.appendStringToFile(evoSuiteFile0, "G4GB#,\u0005IoXS=%euju");
      File file0 = fileUtil0.getBrowseNodeFile("  m~1f?8/3MM=$T%:@", "b_", (String) null);
      assertNotNull(file0);
      assertEquals(17L, file0.length());
  }
}
