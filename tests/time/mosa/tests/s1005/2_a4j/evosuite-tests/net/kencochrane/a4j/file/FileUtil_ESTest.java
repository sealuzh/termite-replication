/*
 * This file was automatically generated by EvoSuite
 * Fri Nov 27 14:09:39 GMT 2020
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
      FileInputStream fileInputStream0 = fileUtil0.fetchThirdPartySearchFile((String) null, (String) null, (String) null, "");
      assertNull(fileInputStream0);
  }

  /**
  //Test case number: 1
  /*Coverage entropy=1.0397207708399179
  */
  @Test(timeout = 4000)
  public void test001()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      FileInputStream fileInputStream0 = fileUtil0.fetchThirdPartySearchFile((String) null, "all", (String) null, (String) null);
      assertNull(fileInputStream0);
  }

  /**
  //Test case number: 2
  /*Coverage entropy=1.0397207708399179
  */
  @Test(timeout = 4000)
  public void test002()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      FileInputStream fileInputStream0 = fileUtil0.fetchGenericSearchFile("", "HP%2/ajY}7Ok", "HP%2/ajY}7Ok", "HP%2/ajY}7Ok", "HP%2/ajY}7Ok", "HP%2/ajY}7Ok");
      assertNull(fileInputStream0);
  }

  /**
  //Test case number: 3
  /*Coverage entropy=1.0397207708399179
  */
  @Test(timeout = 4000)
  public void test003()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      FileInputStream fileInputStream0 = fileUtil0.fetchBlendedSearchFile("popcornmonste2-20", (String) null);
      assertNull(fileInputStream0);
  }

  /**
  //Test case number: 4
  /*Coverage entropy=0.6365141682948128
  */
  @Test(timeout = 4000)
  public void test004()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      fileUtil0.renameFile("%", "w;K3=E");
  }

  /**
  //Test case number: 5
  /*Coverage entropy=1.6417347121875212
  */
  @Test(timeout = 4000)
  public void test005()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("/A_.XML");
      FileSystemHandling.createFolder(evoSuiteFile0);
      ArrayList<Object> arrayList0 = new ArrayList<Object>();
      FileInputStream fileInputStream0 = fileUtil0.fetchAccessories("", arrayList0);
      assertNull(fileInputStream0);
  }

  /**
  //Test case number: 6
  /*Coverage entropy=1.6417347121875212
  */
  @Test(timeout = 4000)
  public void test006()  throws Throwable  {
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("/NULL_NULL_NULL_NULL.XML");
      FileUtil fileUtil0 = new FileUtil();
      FileSystemHandling.createFolder(evoSuiteFile0);
      FileInputStream fileInputStream0 = fileUtil0.fetchASINFile((String) null, (String) null, (String) null, (String) null);
      assertNull(fileInputStream0);
  }

  /**
  //Test case number: 7
  /*Coverage entropy=1.4708084763221112
  */
  @Test(timeout = 4000)
  public void test007()  throws Throwable  {
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("/S_NULL.XML");
      FileSystemHandling.appendLineToFile(evoSuiteFile0, "TC Lf^z?*#FH5mFIZ>D");
      FileUtil fileUtil0 = new FileUtil();
      File file0 = fileUtil0.getSimilarItems((String) null, "");
      assertNotNull(file0);
      assertEquals(20L, file0.length());
  }

  /**
  //Test case number: 8
  /*Coverage entropy=1.4708084763221114
  */
  @Test(timeout = 4000)
  public void test008()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("/A_A_A.XML");
      FileSystemHandling.createFolder(evoSuiteFile0);
      File file0 = fileUtil0.getBrowseNodeFile("a", "a", "a");
      assertEquals("/A_A_A.XML", file0.toString());
      assertNotNull(file0);
      assertTrue(file0.canWrite());
  }

  /**
  //Test case number: 9
  /*Coverage entropy=1.4708084763221112
  */
  @Test(timeout = 4000)
  public void test009()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("/A_.XML");
      FileSystemHandling.appendLineToFile(evoSuiteFile0, "L2F}@k~x2`T");
      ArrayList<Object> arrayList0 = new ArrayList<Object>();
      File file0 = fileUtil0.getAccessories("", arrayList0);
      assertEquals(12L, file0.length());
      assertNotNull(file0);
  }

  /**
  //Test case number: 10
  /*Coverage entropy=1.4708084763221112
  */
  @Test(timeout = 4000)
  public void test010()  throws Throwable  {
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("/NULL_NULL_NULL_NULL.XML");
      FileUtil fileUtil0 = new FileUtil();
      FileSystemHandling.createFolder(evoSuiteFile0);
      File file0 = fileUtil0.getASINFile((String) null, (String) null, (String) null, (String) null);
      assertNotNull(file0);
      assertEquals("NULL_NULL_NULL_NULL.XML", file0.getName());
      assertTrue(file0.exists());
  }

  /**
  //Test case number: 11
  /*Coverage entropy=1.6417347121875212
  */
  @Test(timeout = 4000)
  public void test011()  throws Throwable  {
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("/S_NULL.XML");
      FileUtil fileUtil0 = new FileUtil();
      FileSystemHandling.appendLineToFile(evoSuiteFile0, "TC Lf^z?*#F35mFIZ>D");
      FileInputStream fileInputStream0 = fileUtil0.fetchSimilarItems((String) null, "TC Lf^z?*#F35mFIZ>D");
      assertEquals(20, fileInputStream0.available());
  }

  /**
  //Test case number: 12
  /*Coverage entropy=1.6417347121875212
  */
  @Test(timeout = 4000)
  public void test012()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("/A_A_A.XML");
      FileSystemHandling.appendStringToFile(evoSuiteFile0, "");
      FileInputStream fileInputStream0 = fileUtil0.fetchBNFile("a", "a", "a");
      assertEquals(0, fileInputStream0.available());
  }

  /**
  //Test case number: 13
  /*Coverage entropy=1.6417347121875212
  */
  @Test(timeout = 4000)
  public void test013()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("/A_A_A.XML");
      FileSystemHandling.appendStringToFile(evoSuiteFile0, "i");
      FileInputStream fileInputStream0 = fileUtil0.fetchBNFile("a", "a", "a");
      assertEquals(1, fileInputStream0.available());
  }

  /**
  //Test case number: 14
  /*Coverage entropy=1.6417347121875212
  */
  @Test(timeout = 4000)
  public void test014()  throws Throwable  {
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("/NULL_NULL_NULL_NULL.XML");
      FileUtil fileUtil0 = new FileUtil();
      FileSystemHandling.appendLineToFile(evoSuiteFile0, "");
      FileInputStream fileInputStream0 = fileUtil0.fetchASINFile((String) null, (String) null, (String) null, (String) null);
      assertEquals(1, fileInputStream0.available());
  }

  /**
  //Test case number: 15
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test015()  throws Throwable  {
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
  //Test case number: 16
  /*Coverage entropy=0.6365141682948128
  */
  @Test(timeout = 4000)
  public void test016()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      fileUtil0.renameFile("", "");
  }

  /**
  //Test case number: 17
  /*Coverage entropy=0.6365141682948128
  */
  @Test(timeout = 4000)
  public void test017()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      MockFile mockFile0 = new MockFile("zl");
      boolean boolean0 = fileUtil0.isAgeGood(mockFile0);
      assertFalse(boolean0);
  }

  /**
  //Test case number: 18
  /*Coverage entropy=0.9502705392332347
  */
  @Test(timeout = 4000)
  public void test018()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      File file0 = fileUtil0.getSimilarItems((String) null, "");
      assertNull(file0);
  }

  /**
  //Test case number: 19
  /*Coverage entropy=0.9502705392332347
  */
  @Test(timeout = 4000)
  public void test019()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      File file0 = fileUtil0.getSimilarItems("u>b'Qr}8nC", "u>b'Qr}8nC");
      assertNull(file0);
  }

  /**
  //Test case number: 20
  /*Coverage entropy=0.9502705392332347
  */
  @Test(timeout = 4000)
  public void test020()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      File file0 = fileUtil0.getSimilarItems("", (String) null);
      assertNull(file0);
  }

  /**
  //Test case number: 21
  /*Coverage entropy=0.9502705392332347
  */
  @Test(timeout = 4000)
  public void test021()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      File file0 = fileUtil0.getBrowseNodeFile((String) null, (String) null, (String) null);
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
      File file0 = fileUtil0.getAccessories("associateID", (ArrayList) null);
      assertNull(file0);
  }

  /**
  //Test case number: 24
  /*Coverage entropy=0.9502705392332347
  */
  @Test(timeout = 4000)
  public void test024()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      ArrayList<Object> arrayList0 = new ArrayList<Object>();
      arrayList0.add((Object) "LZa]:N{9%H?tuz");
      File file0 = fileUtil0.getAccessories("L2F}@k~x2`T", arrayList0);
      assertNull(file0);
  }

  /**
  //Test case number: 25
  /*Coverage entropy=0.9502705392332347
  */
  @Test(timeout = 4000)
  public void test025()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      ArrayList<Object> arrayList0 = new ArrayList<Object>();
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
      File file0 = fileUtil0.getASINFile((String) null, (String) null, (String) null, (String) null);
      assertNull(file0);
  }

  /**
  //Test case number: 27
  /*Coverage entropy=0.9502705392332347
  */
  @Test(timeout = 4000)
  public void test027()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      File file0 = fileUtil0.getASINFile("", "", "", "Ju@-~L2R@");
      assertNull(file0);
  }

  /**
  //Test case number: 28
  /*Coverage entropy=1.0397207708399179
  */
  @Test(timeout = 4000)
  public void test028()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      FileInputStream fileInputStream0 = fileUtil0.fetchThirdPartySearchFile("T6 Lf^z?*#FH5mFIZ>D", "T6 Lf^z?*#FH5mFIZ>D", "T6 Lf^z?*#FH5mFIZ>D", "T6 Lf^z?*#FH5mFIZ>D");
      assertNull(fileInputStream0);
  }

  /**
  //Test case number: 29
  /*Coverage entropy=1.0397207708399179
  */
  @Test(timeout = 4000)
  public void test029()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      FileInputStream fileInputStream0 = fileUtil0.fetchThirdPartySearchFile("all", "all", (String) null, (String) null);
      assertNull(fileInputStream0);
  }

  /**
  //Test case number: 30
  /*Coverage entropy=1.0397207708399179
  */
  @Test(timeout = 4000)
  public void test030()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      FileInputStream fileInputStream0 = fileUtil0.fetchThirdPartySearchFile("", "", "", "");
      assertNull(fileInputStream0);
  }

  /**
  //Test case number: 31
  /*Coverage entropy=1.242453324894
  */
  @Test(timeout = 4000)
  public void test031()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      FileInputStream fileInputStream0 = fileUtil0.fetchSimilarItems("m#", (String) null);
      assertNull(fileInputStream0);
  }

  /**
  //Test case number: 32
  /*Coverage entropy=1.0397207708399179
  */
  @Test(timeout = 4000)
  public void test032()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      FileInputStream fileInputStream0 = fileUtil0.fetchKeywordSearchFile("=0bIay8wHE+D|hk(lN_", "=0bIay8wHE+D|hk(lN_", "=0bIay8wHE+D|hk(lN_", ">");
      assertNull(fileInputStream0);
  }

  /**
  //Test case number: 33
  /*Coverage entropy=1.0397207708399179
  */
  @Test(timeout = 4000)
  public void test033()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      FileInputStream fileInputStream0 = fileUtil0.fetchKeywordSearchFile((String) null, "]I7P3}[WfY", "]I7P3}[WfY", (String) null);
      assertNull(fileInputStream0);
  }

  /**
  //Test case number: 34
  /*Coverage entropy=1.0397207708399179
  */
  @Test(timeout = 4000)
  public void test034()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      FileInputStream fileInputStream0 = fileUtil0.fetchKeywordSearchFile(">", "", ">", "");
      assertNull(fileInputStream0);
  }

  /**
  //Test case number: 35
  /*Coverage entropy=1.0397207708399179
  */
  @Test(timeout = 4000)
  public void test035()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      FileInputStream fileInputStream0 = fileUtil0.fetchKeywordSearchFile("", "", "", "");
      assertNull(fileInputStream0);
  }

  /**
  //Test case number: 36
  /*Coverage entropy=1.0397207708399179
  */
  @Test(timeout = 4000)
  public void test036()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      FileInputStream fileInputStream0 = fileUtil0.fetchGenericSearchFile("s_", (String) null, "s_", "s_", (String) null, (String) null);
      assertNull(fileInputStream0);
  }

  /**
  //Test case number: 37
  /*Coverage entropy=1.0397207708399179
  */
  @Test(timeout = 4000)
  public void test037()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      FileInputStream fileInputStream0 = fileUtil0.fetchGenericSearchFile("", "", "", (String) null, (String) null, "");
      assertNull(fileInputStream0);
  }

  /**
  //Test case number: 38
  /*Coverage entropy=1.0397207708399179
  */
  @Test(timeout = 4000)
  public void test038()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      FileInputStream fileInputStream0 = fileUtil0.fetchGenericSearchFile((String) null, (String) null, (String) null, "", (String) null, "");
      assertNull(fileInputStream0);
  }

  /**
  //Test case number: 39
  /*Coverage entropy=1.0397207708399179
  */
  @Test(timeout = 4000)
  public void test039()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      FileInputStream fileInputStream0 = fileUtil0.fetchBlendedSearchFile((String) null, (String) null);
      assertNull(fileInputStream0);
  }

  /**
  //Test case number: 40
  /*Coverage entropy=1.0397207708399179
  */
  @Test(timeout = 4000)
  public void test040()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      FileInputStream fileInputStream0 = fileUtil0.fetchBlendedSearchFile("", "");
      assertNull(fileInputStream0);
  }

  /**
  //Test case number: 41
  /*Coverage entropy=1.2424533248940002
  */
  @Test(timeout = 4000)
  public void test041()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      FileInputStream fileInputStream0 = fileUtil0.fetchBNFile("", (String) null, (String) null);
      assertNull(fileInputStream0);
  }

  /**
  //Test case number: 42
  /*Coverage entropy=1.2424533248940002
  */
  @Test(timeout = 4000)
  public void test042()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      FileInputStream fileInputStream0 = fileUtil0.fetchBNFile("", "", "");
      assertNull(fileInputStream0);
  }

  /**
  //Test case number: 43
  /*Coverage entropy=1.2424533248940002
  */
  @Test(timeout = 4000)
  public void test043()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      FileInputStream fileInputStream0 = fileUtil0.fetchBNFile((String) null, (String) null, "");
      assertNull(fileInputStream0);
  }

  /**
  //Test case number: 44
  /*Coverage entropy=1.4750763110546947
  */
  @Test(timeout = 4000)
  public void test044()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      ArrayList<Object> arrayList0 = new ArrayList<Object>();
      arrayList0.add((Object) fileUtil0);
      FileInputStream fileInputStream0 = fileUtil0.fetchAccessories("", arrayList0);
      assertNull(fileInputStream0);
  }

  /**
  //Test case number: 45
  /*Coverage entropy=1.242453324894
  */
  @Test(timeout = 4000)
  public void test045()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      ArrayList<Object> arrayList0 = new ArrayList<Object>();
      FileInputStream fileInputStream0 = fileUtil0.fetchAccessories((String) null, arrayList0);
      assertNull(fileInputStream0);
  }

  /**
  //Test case number: 46
  /*Coverage entropy=1.242453324894
  */
  @Test(timeout = 4000)
  public void test046()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      FileInputStream fileInputStream0 = fileUtil0.fetchAccessories("@^zY]N<}", (ArrayList) null);
      assertNull(fileInputStream0);
  }

  /**
  //Test case number: 47
  /*Coverage entropy=1.242453324894
  */
  @Test(timeout = 4000)
  public void test047()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      FileInputStream fileInputStream0 = fileUtil0.fetchASINFile("all", "all", "'%1dNs'ki}&FPPe^", "'%1dNs'ki}&FPPe^");
      assertNull(fileInputStream0);
  }

  /**
  //Test case number: 48
  /*Coverage entropy=1.242453324894
  */
  @Test(timeout = 4000)
  public void test048()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      FileInputStream fileInputStream0 = fileUtil0.fetchASINFile((String) null, "ZDzy&E9FAy<O?qC+q4e", (String) null, ", ");
      assertNull(fileInputStream0);
  }

  /**
  //Test case number: 49
  /*Coverage entropy=1.242453324894
  */
  @Test(timeout = 4000)
  public void test049()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      FileInputStream fileInputStream0 = fileUtil0.fetchASINFile("", "", "", "");
      assertNull(fileInputStream0);
  }

  /**
  //Test case number: 50
  /*Coverage entropy=0.6365141682948128
  */
  @Test(timeout = 4000)
  public void test050()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      File file0 = fileUtil0.downloadThirdPartySearchFile("cacheDir", "cacheDir", "cacheDir", (String) null);
      assertNull(file0);
  }

  /**
  //Test case number: 51
  /*Coverage entropy=0.6365141682948128
  */
  @Test(timeout = 4000)
  public void test051()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      File file0 = fileUtil0.downloadThirdPartySearchFile((String) null, (String) null, (String) null, "");
      assertNull(file0);
  }

  /**
  //Test case number: 52
  /*Coverage entropy=0.6365141682948128
  */
  @Test(timeout = 4000)
  public void test052()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      File file0 = fileUtil0.downloadThirdPartySearchFile("", "|^z&De5ix[", "", "|^z&De5ix[");
      assertNull(file0);
  }

  /**
  //Test case number: 53
  /*Coverage entropy=0.6365141682948128
  */
  @Test(timeout = 4000)
  public void test053()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      File file0 = fileUtil0.downloadThirdPartySearchFile("", "", "EME", "86400000");
      assertNull(file0);
  }

  /**
  //Test case number: 54
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test054()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      boolean boolean0 = fileUtil0.downloadSimilaritesFile((String) null, (String) null, (String) null);
      assertFalse(boolean0);
  }

  /**
  //Test case number: 55
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test055()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      boolean boolean0 = fileUtil0.downloadSimilaritesFile((String) null, (String) null, " wB>P$8lZ+7");
      assertFalse(boolean0);
  }

  /**
  //Test case number: 56
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test056()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      boolean boolean0 = fileUtil0.downloadSimilaritesFile((String) null, "", "h&_u");
      assertFalse(boolean0);
  }

  /**
  //Test case number: 57
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test057()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      boolean boolean0 = fileUtil0.downloadSimilaritesFile("2,", "2,", "2,");
      assertFalse(boolean0);
  }

  /**
  //Test case number: 58
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test058()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      boolean boolean0 = fileUtil0.downloadSimilaritesFile("", "", "");
      assertFalse(boolean0);
  }

  /**
  //Test case number: 59
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test059()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      boolean boolean0 = fileUtil0.downloadOneASINFile((String) null, (String) null, (String) null, (String) null, (String) null);
      assertFalse(boolean0);
  }

  /**
  //Test case number: 60
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test060()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      boolean boolean0 = fileUtil0.downloadOneASINFile((String) null, (String) null, "cacheLife", (String) null, "cacheLife");
      assertFalse(boolean0);
  }

  /**
  //Test case number: 61
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test061()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      boolean boolean0 = fileUtil0.downloadOneASINFile("s_", "s_", "s_", "s_", "s_");
      assertFalse(boolean0);
  }

  /**
  //Test case number: 62
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test062()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      boolean boolean0 = fileUtil0.downloadOneASINFile("", "", "", "", "");
      assertFalse(boolean0);
  }

  /**
  //Test case number: 63
  /*Coverage entropy=0.6365141682948128
  */
  @Test(timeout = 4000)
  public void test063()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      File file0 = fileUtil0.downloadKeywordSearchFile((String) null, (String) null, (String) null, (String) null);
      assertNull(file0);
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
      File file0 = fileUtil0.downloadGenericSearchFile("9", "9", "_{2)`7u", "9", "9", "_{2)`7u");
      assertNull(file0);
  }

  /**
  //Test case number: 66
  /*Coverage entropy=0.6365141682948128
  */
  @Test(timeout = 4000)
  public void test066()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      File file0 = fileUtil0.downloadGenericSearchFile((String) null, (String) null, (String) null, (String) null, (String) null, "");
      assertNull(file0);
  }

  /**
  //Test case number: 67
  /*Coverage entropy=0.6365141682948128
  */
  @Test(timeout = 4000)
  public void test067()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      File file0 = fileUtil0.downloadGenericSearchFile("k`u2", "k`u2", "k`u2", "3u~xi|?ZSOg}g!", "k`u2", (String) null);
      assertNull(file0);
  }

  /**
  //Test case number: 68
  /*Coverage entropy=0.6365141682948128
  */
  @Test(timeout = 4000)
  public void test068()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      File file0 = fileUtil0.downloadGenericSearchFile("", "", "", "", "", "");
      assertNull(file0);
  }

  /**
  //Test case number: 69
  /*Coverage entropy=0.6365141682948128
  */
  @Test(timeout = 4000)
  public void test069()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      File file0 = fileUtil0.downloadCart((String) null);
      assertNull(file0);
  }

  /**
  //Test case number: 70
  /*Coverage entropy=0.6365141682948128
  */
  @Test(timeout = 4000)
  public void test070()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      File file0 = fileUtil0.downloadCart("a");
      assertNull(file0);
  }

  /**
  //Test case number: 71
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test071()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      boolean boolean0 = fileUtil0.downloadBrowseNodeFile((String) null, (String) null, (String) null, (String) null);
      assertFalse(boolean0);
  }

  /**
  //Test case number: 72
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test072()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      boolean boolean0 = fileUtil0.downloadBrowseNodeFile((String) null, "", "", "");
      assertFalse(boolean0);
  }

  /**
  //Test case number: 73
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test073()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      boolean boolean0 = fileUtil0.downloadBrowseNodeFile("LZa]:N{9%H?tuz", "LZa]:N{9%H?tuz", "LZa]:N{9%H?tuz", "LZa]:N{9%H?tuz");
      assertFalse(boolean0);
  }

  /**
  //Test case number: 74
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test074()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      boolean boolean0 = fileUtil0.downloadBrowseNodeFile("", "", (String) null, (String) null);
      assertFalse(boolean0);
  }

  /**
  //Test case number: 75
  /*Coverage entropy=0.6365141682948128
  */
  @Test(timeout = 4000)
  public void test075()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      File file0 = fileUtil0.downloadBlendedSearchFile((String) null, (String) null);
      assertNull(file0);
  }

  /**
  //Test case number: 76
  /*Coverage entropy=0.6365141682948128
  */
  @Test(timeout = 4000)
  public void test076()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      File file0 = fileUtil0.downloadBlendedSearchFile("T6 Lf^z?*#FH5mFIZ>D", "T6 Lf^z?*#FH5mFIZ>D");
      assertNull(file0);
  }

  /**
  //Test case number: 77
  /*Coverage entropy=0.6365141682948128
  */
  @Test(timeout = 4000)
  public void test077()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      File file0 = fileUtil0.downloadBlendedSearchFile("", "");
      assertNull(file0);
  }

  /**
  //Test case number: 78
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test078()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      ArrayList<Object> arrayList0 = new ArrayList<Object>();
      boolean boolean0 = fileUtil0.downloadAccessoriesFile("", arrayList0, "");
      assertFalse(boolean0);
  }

  /**
  //Test case number: 79
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test079()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      boolean boolean0 = fileUtil0.downloadAccessoriesFile("\"G.CsPBn=B pri~3", (ArrayList) null, "wkvLVch");
      assertFalse(boolean0);
  }

  /**
  //Test case number: 80
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test080()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      ArrayList<Integer> arrayList0 = new ArrayList<Integer>();
      Integer integer0 = new Integer((-2145307878));
      arrayList0.add(integer0);
      boolean boolean0 = fileUtil0.downloadAccessoriesFile("KeywordSearch=", arrayList0, "amazonServerURL");
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
      boolean boolean0 = fileUtil0.downloadAccessoriesFile((String) null, arrayList0, (String) null);
      assertFalse(boolean0);
  }

  /**
  //Test case number: 82
  /*Coverage entropy=0.6365141682948128
  */
  @Test(timeout = 4000)
  public void test082()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      fileUtil0.deleteFile("T6 Lf^z?*#FH5mFIZ>D");
  }

  /**
  //Test case number: 83
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test083()  throws Throwable  {
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
  //Test case number: 84
  /*Coverage entropy=0.6365141682948128
  */
  @Test(timeout = 4000)
  public void test084()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      File file0 = fileUtil0.downloadCart("");
      assertNull(file0);
  }

  /**
  //Test case number: 85
  /*Coverage entropy=1.277034259466139
  */
  @Test(timeout = 4000)
  public void test085()  throws Throwable  {
      EvoSuiteURL evoSuiteURL0 = new EvoSuiteURL("http://xml.amazon.net/onca/xml3?t=popcornmonste2-20&dev-t=DSB0XDDW1GQ3S&SimilaritySearch=&type=lite&offerpage=&offer=all&f=xml");
      NetworkHandling.createRemoteTextFile(evoSuiteURL0, "^P}=2MQ4/.%9C");
      FileUtil fileUtil0 = new FileUtil();
      FileInputStream fileInputStream0 = fileUtil0.fetchSimilarItems("", "");
      assertNull(fileInputStream0);
  }

  /**
  //Test case number: 86
  /*Coverage entropy=1.6417347121875212
  */
  @Test(timeout = 4000)
  public void test086()  throws Throwable  {
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("/S_NULL.XML");
      FileSystemHandling.createFolder(evoSuiteFile0);
      FileUtil fileUtil0 = new FileUtil();
      FileInputStream fileInputStream0 = fileUtil0.fetchSimilarItems((String) null, "TC Lf^z?*#FH5mFIZ>D");
      assertNull(fileInputStream0);
  }

  /**
  //Test case number: 87
  /*Coverage entropy=1.6417347121875212
  */
  @Test(timeout = 4000)
  public void test087()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("/A_.XML");
      FileSystemHandling.appendLineToFile(evoSuiteFile0, "L2F}@k~x2`T");
      ArrayList<Object> arrayList0 = new ArrayList<Object>();
      FileInputStream fileInputStream0 = fileUtil0.fetchAccessories("", arrayList0);
      assertEquals(12, fileInputStream0.available());
  }

  /**
  //Test case number: 88
  /*Coverage entropy=0.5623351446188083
  */
  @Test(timeout = 4000)
  public void test088()  throws Throwable  {
      EvoSuiteURL evoSuiteURL0 = new EvoSuiteURL("http://xml.amazon.net/onca/xml3?t=popcornmonste2-20&dev-t=DSB0XDDW1GQ3S&SellerSearch=T6Lf^z#FH5mFIZ>D&type=T6Lf^z#FH5mFIZ>D&page=T6Lf^z#FH5mFIZ>D&offerstatus=T6Lf^z#FH5mFIZ>D&f=xml");
      NetworkHandling.createRemoteTextFile(evoSuiteURL0, "}!h,;E[0");
      FileUtil fileUtil0 = new FileUtil();
      File file0 = fileUtil0.downloadThirdPartySearchFile("T6Lf^z#FH5mFIZ>D", "T6Lf^z#FH5mFIZ>D", "T6Lf^z#FH5mFIZ>D", "T6Lf^z#FH5mFIZ>D");
      assertNull(file0);
  }

  /**
  //Test case number: 89
  /*Coverage entropy=0.9502705392332347
  */
  @Test(timeout = 4000)
  public void test089()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      EvoSuiteURL evoSuiteURL0 = new EvoSuiteURL("http://xml.amazon.net/onca/xml3?t=popcornmonste2-20&dev-t=DSB0XDDW1GQ3S&=&mode=&type=&page=&offer=&f=xml");
      NetworkHandling.createRemoteTextFile(evoSuiteURL0, "h!lun#");
      FileInputStream fileInputStream0 = fileUtil0.fetchGenericSearchFile("", "", "", "", "", "");
      assertNull(fileInputStream0);
  }

  /**
  //Test case number: 90
  /*Coverage entropy=1.0397207708399179
  */
  @Test(timeout = 4000)
  public void test090()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      FileInputStream fileInputStream0 = fileUtil0.fetchKeywordSearchFile((String) null, (String) null, (String) null, "");
      assertNull(fileInputStream0);
  }

  /**
  //Test case number: 91
  /*Coverage entropy=0.6365141682948128
  */
  @Test(timeout = 4000)
  public void test091()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      File file0 = fileUtil0.downloadKeywordSearchFile("TC Lf^z?*#FH5mFIZ>D", "TC Lf^z?*#FH5mFIZ>D", "TC Lf^z?*#FH5mFIZ>D", "TC Lf^z?*#FH5mFIZ>D");
      assertNull(file0);
  }

  /**
  //Test case number: 92
  /*Coverage entropy=0.9502705392332347
  */
  @Test(timeout = 4000)
  public void test092()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      EvoSuiteURL evoSuiteURL0 = new EvoSuiteURL("http://xml.amazon.net/onca/xml3?t=popcornmonste2-20&dev-t=DSB0XDDW1GQ3S&BlendedSearch=N&type=N&f=xml");
      NetworkHandling.createRemoteTextFile(evoSuiteURL0, "b_");
      FileInputStream fileInputStream0 = fileUtil0.fetchBlendedSearchFile("N", "N");
      assertNull(fileInputStream0);
  }

  /**
  //Test case number: 93
  /*Coverage entropy=1.6417347121875212
  */
  @Test(timeout = 4000)
  public void test093()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("/A_A_A.XML");
      FileSystemHandling.createFolder(evoSuiteFile0);
      FileInputStream fileInputStream0 = fileUtil0.fetchBNFile("a", "a", "a");
      assertNull(fileInputStream0);
  }

  /**
  //Test case number: 94
  /*Coverage entropy=1.4708084763221114
  */
  @Test(timeout = 4000)
  public void test094()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("/A_A_I/.XML");
      FileSystemHandling.appendStringToFile(evoSuiteFile0, "i/");
      File file0 = fileUtil0.getBrowseNodeFile("a", "a", "i/");
      assertNotNull(file0);
      assertEquals(2L, file0.length());
  }

  /**
  //Test case number: 95
  /*Coverage entropy=1.277034259466139
  */
  @Test(timeout = 4000)
  public void test095()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      EvoSuiteURL evoSuiteURL0 = new EvoSuiteURL("http://xml.amazon.net/onca/xml3?t=popcornmonste2-20&dev-t=DSB0XDDW1GQ3S&BrowseNodeSearch=a&mode=a&type=lite&page=a&offer=new&f=xml");
      NetworkHandling.createRemoteTextFile(evoSuiteURL0, "a");
      FileInputStream fileInputStream0 = fileUtil0.fetchBNFile("a", "a", "a");
      assertNull(fileInputStream0);
  }

  /**
  //Test case number: 96
  /*Coverage entropy=1.6417347121875212
  */
  @Test(timeout = 4000)
  public void test096()  throws Throwable  {
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("/NULL_NULL_NULL_NULL.XML");
      FileSystemHandling.appendStringToFile(evoSuiteFile0, "");
      FileUtil fileUtil0 = new FileUtil();
      FileInputStream fileInputStream0 = fileUtil0.fetchASINFile((String) null, (String) null, (String) null, (String) null);
      assertEquals(0, fileInputStream0.available());
  }

  /**
  //Test case number: 97
  /*Coverage entropy=0.6365141682948128
  */
  @Test(timeout = 4000)
  public void test097()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      fileUtil0.renameFile("/", "/");
  }

  /**
  //Test case number: 98
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test098()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      boolean boolean0 = fileUtil0.isAgeGood((File) null);
      assertFalse(boolean0);
  }

  /**
  //Test case number: 99
  /*Coverage entropy=0.6365141682948128
  */
  @Test(timeout = 4000)
  public void test099()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      fileUtil0.deleteFile("");
  }

  /**
  //Test case number: 100
  /*Coverage entropy=1.4708084763221112
  */
  @Test(timeout = 4000)
  public void test100()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("/&$7ONK9OO5{_AMAZONSERVERURL_&$7ONK9OO5{_.XML");
      FileSystemHandling.appendStringToFile(evoSuiteFile0, "");
      File file0 = fileUtil0.getASINFile("&$7ONK9OO5{", "&$7ONK9OO5{", "amazonServerURL", "");
      assertNotNull(file0);
      assertTrue(file0.isFile());
      assertTrue(file0.canWrite());
  }

  /**
  //Test case number: 101
  /*Coverage entropy=1.277034259466139
  */
  @Test(timeout = 4000)
  public void test101()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      EvoSuiteURL evoSuiteURL0 = new EvoSuiteURL("http://xml.amazon.net/onca/xml3?t=popcornmonste2-20&dev-t=DSB0XDDW1GQ3S&AsinSearch=null&type=null&offerpage=null&offer=null&f=xml");
      NetworkHandling.createRemoteTextFile(evoSuiteURL0, "ZDzy&9FAy<O?qC+q4e");
      FileInputStream fileInputStream0 = fileUtil0.fetchASINFile((String) null, (String) null, (String) null, (String) null);
      assertNull(fileInputStream0);
  }
}
