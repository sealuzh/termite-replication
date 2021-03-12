/*
 * This file was automatically generated by EvoSuite
 * Sun Nov 29 13:34:29 GMT 2020
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
import org.evosuite.runtime.System;
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
      FileInputStream fileInputStream0 = fileUtil0.fetchGenericSearchFile("+DPfg(t", "", "+DPfg(t", "_", "+DPfg(t", ",VFO~EKh,spF5PqT{Z ");
      assertNull(fileInputStream0);
  }

  /**
  //Test case number: 1
  /*Coverage entropy=1.0397207708399179
  */
  @Test(timeout = 4000)
  public void test001()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      FileInputStream fileInputStream0 = fileUtil0.fetchGenericSearchFile("F5AQ32D9!n*", "", "", "", "F5AQ32D9!n*", "F5AQ32D9!n*");
      assertNull(fileInputStream0);
  }

  /**
  //Test case number: 2
  /*Coverage entropy=1.0397207708399179
  */
  @Test(timeout = 4000)
  public void test002()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      FileInputStream fileInputStream0 = fileUtil0.fetchBlendedSearchFile("dev-t=", (String) null);
      assertNull(fileInputStream0);
  }

  /**
  //Test case number: 3
  /*Coverage entropy=1.242453324894
  */
  @Test(timeout = 4000)
  public void test003()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      FileInputStream fileInputStream0 = fileUtil0.fetchASINFile(".xml", "RF=Ei-LDb[H8:C7UyA", ".xml", ".xml");
      assertNull(fileInputStream0);
  }

  /**
  //Test case number: 4
  /*Coverage entropy=1.4708084763221114
  */
  @Test(timeout = 4000)
  public void test004()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("/1_NULL_^|.XML");
      FileSystemHandling.appendLineToFile(evoSuiteFile0, "ShoppingCart=add&f=xml&dev-t=");
      File file0 = fileUtil0.getBrowseNodeFile("1", (String) null, "^|");
      assertNotNull(file0);
      
      System.setCurrentTimeMillis(27L);
      boolean boolean0 = fileUtil0.isAgeGood(file0);
      assertEquals(30L, file0.length());
      assertFalse(boolean0);
  }

  /**
  //Test case number: 5
  /*Coverage entropy=1.4708084763221112
  */
  @Test(timeout = 4000)
  public void test005()  throws Throwable  {
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("/S_NULL.XML");
      FileSystemHandling.createFolder(evoSuiteFile0);
      FileUtil fileUtil0 = new FileUtil();
      File file0 = fileUtil0.getSimilarItems((String) null, "");
      assertNotNull(file0);
      assertEquals("S_NULL.XML", file0.getName());
      assertTrue(file0.isDirectory());
  }

  /**
  //Test case number: 6
  /*Coverage entropy=1.4708084763221112
  */
  @Test(timeout = 4000)
  public void test006()  throws Throwable  {
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("/S_NULL.XML");
      FileSystemHandling.appendLineToFile(evoSuiteFile0, "#9BO,:9j+");
      FileUtil fileUtil0 = new FileUtil();
      File file0 = fileUtil0.getSimilarItems((String) null, "5u4CO>:");
      assertEquals(10L, file0.length());
      assertNotNull(file0);
  }

  /**
  //Test case number: 7
  /*Coverage entropy=1.4708084763221112
  */
  @Test(timeout = 4000)
  public void test007()  throws Throwable  {
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("/S_NULL.XML");
      FileSystemHandling.appendLineToFile(evoSuiteFile0, "#9BO,:9j+");
      FileUtil fileUtil0 = new FileUtil();
      FileSystemHandling.setPermissions(evoSuiteFile0, true, true, false);
      File file0 = fileUtil0.getSimilarItems((String) null, "S");
      assertEquals(10L, file0.length());
      assertNotNull(file0);
  }

  /**
  //Test case number: 8
  /*Coverage entropy=1.4708084763221114
  */
  @Test(timeout = 4000)
  public void test008()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("/1_NULL_^|.XML");
      FileSystemHandling.createFolder(evoSuiteFile0);
      File file0 = fileUtil0.getBrowseNodeFile("1", (String) null, "^|");
      assertNotNull(file0);
      assertTrue(file0.canExecute());
      assertEquals("/1_NULL_^|.XML", file0.toString());
  }

  /**
  //Test case number: 9
  /*Coverage entropy=1.4708084763221114
  */
  @Test(timeout = 4000)
  public void test009()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("/1_NULL_^|.XML");
      FileSystemHandling.appendLineToFile(evoSuiteFile0, "ShoppingCaot=add&9=xml&dev-t=");
      FileSystemHandling.setPermissions(evoSuiteFile0, true, false, true);
      File file0 = fileUtil0.getBrowseNodeFile("1", (String) null, "^|");
      assertNotNull(file0);
      assertTrue(file0.isFile());
  }

  /**
  //Test case number: 10
  /*Coverage entropy=1.4708084763221112
  */
  @Test(timeout = 4000)
  public void test010()  throws Throwable  {
      ArrayList<Integer> arrayList0 = new ArrayList<Integer>();
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("/A_.XML");
      FileSystemHandling.appendStringToFile(evoSuiteFile0, "=kcs $C4PtOL:F");
      FileUtil fileUtil0 = new FileUtil();
      File file0 = fileUtil0.getAccessories("", arrayList0);
      assertNotNull(file0);
      assertEquals(14L, file0.length());
  }

  /**
  //Test case number: 11
  /*Coverage entropy=1.4708084763221112
  */
  @Test(timeout = 4000)
  public void test011()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      ArrayList<Integer> arrayList0 = new ArrayList<Integer>();
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("/A_.XML");
      FileSystemHandling.createFolder(evoSuiteFile0);
      File file0 = fileUtil0.getAccessories("", arrayList0);
      assertNotNull(file0);
      assertFalse(file0.isFile());
      assertEquals("/A_.XML", file0.toString());
  }

  /**
  //Test case number: 12
  /*Coverage entropy=1.6417347121875212
  */
  @Test(timeout = 4000)
  public void test012()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("/S_SHOPPINGCART=REMOVE&F=XML&DEV-T=.XML");
      FileSystemHandling.appendStringToFile(evoSuiteFile0, "");
      FileInputStream fileInputStream0 = fileUtil0.fetchSimilarItems("ShoppingCart=remove&f=xml&dev-t=", (String) null);
      assertEquals(0, fileInputStream0.available());
  }

  /**
  //Test case number: 13
  /*Coverage entropy=1.6417347121875212
  */
  @Test(timeout = 4000)
  public void test013()  throws Throwable  {
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("/S_NULL.XML");
      FileSystemHandling.appendLineToFile(evoSuiteFile0, "#9BO,:9j+");
      FileUtil fileUtil0 = new FileUtil();
      FileInputStream fileInputStream0 = fileUtil0.fetchSimilarItems((String) null, (String) null);
      assertEquals(10, fileInputStream0.available());
  }

  /**
  //Test case number: 14
  /*Coverage entropy=1.6417347121875212
  */
  @Test(timeout = 4000)
  public void test014()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      ArrayList<Integer> arrayList0 = new ArrayList<Integer>();
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("/A_.XML");
      FileSystemHandling.appendStringToFile(evoSuiteFile0, "lite");
      FileInputStream fileInputStream0 = fileUtil0.fetchAccessories("", arrayList0);
      assertEquals(4, fileInputStream0.available());
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
        fileUtil0.renameFile((String) null, "HT\"W{$QcyJ");
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
  /*Coverage entropy=0.9502705392332347
  */
  @Test(timeout = 4000)
  public void test017()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      File file0 = fileUtil0.getSimilarItems("P", (String) null);
      assertNull(file0);
  }

  /**
  //Test case number: 18
  /*Coverage entropy=0.9502705392332347
  */
  @Test(timeout = 4000)
  public void test018()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      File file0 = fileUtil0.getSimilarItems("", "");
      assertNull(file0);
  }

  /**
  //Test case number: 19
  /*Coverage entropy=0.9502705392332347
  */
  @Test(timeout = 4000)
  public void test019()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      File file0 = fileUtil0.getBrowseNodeFile("=QC.HPf I2wQ,\"u^`Jw", "=QC.HPf I2wQ,\"u^`Jw", "1");
      assertNull(file0);
  }

  /**
  //Test case number: 20
  /*Coverage entropy=0.9502705392332347
  */
  @Test(timeout = 4000)
  public void test020()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      File file0 = fileUtil0.getBrowseNodeFile("", "", "");
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
      File file0 = fileUtil0.getAccessories("", (ArrayList) null);
      assertNull(file0);
  }

  /**
  //Test case number: 23
  /*Coverage entropy=0.9502705392332347
  */
  @Test(timeout = 4000)
  public void test023()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      ArrayList<Object> arrayList0 = new ArrayList<Object>();
      arrayList0.add((Object) "Mb72l");
      File file0 = fileUtil0.getAccessories("Mb72l", arrayList0);
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
      File file0 = fileUtil0.getAccessories((String) null, arrayList0);
      assertNull(file0);
  }

  /**
  //Test case number: 25
  /*Coverage entropy=0.9502705392332347
  */
  @Test(timeout = 4000)
  public void test025()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      File file0 = fileUtil0.getASINFile(".", "|,]thEnz", (String) null, (String) null);
      assertNull(file0);
  }

  /**
  //Test case number: 26
  /*Coverage entropy=0.9502705392332347
  */
  @Test(timeout = 4000)
  public void test026()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      File file0 = fileUtil0.getASINFile("", "", "", "");
      assertNull(file0);
  }

  /**
  //Test case number: 27
  /*Coverage entropy=0.9502705392332347
  */
  @Test(timeout = 4000)
  public void test027()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      File file0 = fileUtil0.getASINFile("Mb72l", (String) null, "|hEnz", (String) null);
      assertNull(file0);
  }

  /**
  //Test case number: 28
  /*Coverage entropy=0.9502705392332347
  */
  @Test(timeout = 4000)
  public void test028()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      File file0 = fileUtil0.getASINFile((String) null, "t_", "t_", (String) null);
      assertNull(file0);
  }

  /**
  //Test case number: 29
  /*Coverage entropy=1.0397207708399179
  */
  @Test(timeout = 4000)
  public void test029()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      FileInputStream fileInputStream0 = fileUtil0.fetchThirdPartySearchFile("Mb72l", "Mb72l", (String) null, "Mb72l");
      assertNull(fileInputStream0);
  }

  /**
  //Test case number: 30
  /*Coverage entropy=1.0397207708399179
  */
  @Test(timeout = 4000)
  public void test030()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      FileInputStream fileInputStream0 = fileUtil0.fetchThirdPartySearchFile(".xml", ".xml", "", "");
      assertNull(fileInputStream0);
  }

  /**
  //Test case number: 31
  /*Coverage entropy=1.0397207708399179
  */
  @Test(timeout = 4000)
  public void test031()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      FileInputStream fileInputStream0 = fileUtil0.fetchThirdPartySearchFile((String) null, (String) null, "net.kencochrane.a4j.data.Query", "net.kencochrane.a4j.data.Query");
      assertNull(fileInputStream0);
  }

  /**
  //Test case number: 32
  /*Coverage entropy=1.0397207708399179
  */
  @Test(timeout = 4000)
  public void test032()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      FileInputStream fileInputStream0 = fileUtil0.fetchThirdPartySearchFile("", (String) null, "", (String) null);
      assertNull(fileInputStream0);
  }

  /**
  //Test case number: 33
  /*Coverage entropy=1.242453324894
  */
  @Test(timeout = 4000)
  public void test033()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      FileInputStream fileInputStream0 = fileUtil0.fetchSimilarItems("", "");
      assertNull(fileInputStream0);
  }

  /**
  //Test case number: 34
  /*Coverage entropy=1.0397207708399179
  */
  @Test(timeout = 4000)
  public void test034()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      FileInputStream fileInputStream0 = fileUtil0.fetchKeywordSearchFile("Z3:XYYu<al0$!(", "q", "jO,1'mx-9dD0`qjJEL", "ShoppingCart=remove&f=xml&dev-t=");
      assertNull(fileInputStream0);
  }

  /**
  //Test case number: 35
  /*Coverage entropy=1.0397207708399179
  */
  @Test(timeout = 4000)
  public void test035()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      FileInputStream fileInputStream0 = fileUtil0.fetchKeywordSearchFile((String) null, (String) null, (String) null, (String) null);
      assertNull(fileInputStream0);
  }

  /**
  //Test case number: 36
  /*Coverage entropy=1.0397207708399179
  */
  @Test(timeout = 4000)
  public void test036()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      FileInputStream fileInputStream0 = fileUtil0.fetchKeywordSearchFile("", "", "", "");
      assertNull(fileInputStream0);
  }

  /**
  //Test case number: 37
  /*Coverage entropy=1.0397207708399179
  */
  @Test(timeout = 4000)
  public void test037()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      FileInputStream fileInputStream0 = fileUtil0.fetchGenericSearchFile("g_", "a_", "g_", "g_", "g_", (String) null);
      assertNull(fileInputStream0);
  }

  /**
  //Test case number: 38
  /*Coverage entropy=1.0397207708399179
  */
  @Test(timeout = 4000)
  public void test038()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      FileInputStream fileInputStream0 = fileUtil0.fetchGenericSearchFile((String) null, (String) null, (String) null, (String) null, (String) null, "9*(");
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
      FileInputStream fileInputStream0 = fileUtil0.fetchBlendedSearchFile((String) null, (String) null);
      assertNull(fileInputStream0);
  }

  /**
  //Test case number: 41
  /*Coverage entropy=1.0397207708399179
  */
  @Test(timeout = 4000)
  public void test041()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      FileInputStream fileInputStream0 = fileUtil0.fetchBlendedSearchFile("", "");
      assertNull(fileInputStream0);
  }

  /**
  //Test case number: 42
  /*Coverage entropy=1.2424533248940002
  */
  @Test(timeout = 4000)
  public void test042()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      FileInputStream fileInputStream0 = fileUtil0.fetchBNFile("a", "vwZ!R<ko2^", (String) null);
      assertNull(fileInputStream0);
  }

  /**
  //Test case number: 43
  /*Coverage entropy=1.2424533248940002
  */
  @Test(timeout = 4000)
  public void test043()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      FileInputStream fileInputStream0 = fileUtil0.fetchBNFile((String) null, (String) null, "UTF-8");
      assertNull(fileInputStream0);
  }

  /**
  //Test case number: 44
  /*Coverage entropy=1.2424533248940002
  */
  @Test(timeout = 4000)
  public void test044()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      FileInputStream fileInputStream0 = fileUtil0.fetchBNFile("", "", "");
      assertNull(fileInputStream0);
  }

  /**
  //Test case number: 45
  /*Coverage entropy=1.242453324894
  */
  @Test(timeout = 4000)
  public void test045()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      ArrayList<String> arrayList0 = new ArrayList<String>(0);
      arrayList0.add("");
      FileInputStream fileInputStream0 = fileUtil0.fetchAccessories("", arrayList0);
      assertNull(fileInputStream0);
  }

  /**
  //Test case number: 46
  /*Coverage entropy=1.242453324894
  */
  @Test(timeout = 4000)
  public void test046()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      ArrayList<Object> arrayList0 = new ArrayList<Object>();
      FileInputStream fileInputStream0 = fileUtil0.fetchAccessories((String) null, arrayList0);
      assertNull(fileInputStream0);
  }

  /**
  //Test case number: 47
  /*Coverage entropy=1.242453324894
  */
  @Test(timeout = 4000)
  public void test047()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      FileInputStream fileInputStream0 = fileUtil0.fetchAccessories("lite", (ArrayList) null);
      assertNull(fileInputStream0);
  }

  /**
  //Test case number: 48
  /*Coverage entropy=1.242453324894
  */
  @Test(timeout = 4000)
  public void test048()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      FileInputStream fileInputStream0 = fileUtil0.fetchASINFile("", "", "", "");
      assertNull(fileInputStream0);
  }

  /**
  //Test case number: 49
  /*Coverage entropy=1.242453324894
  */
  @Test(timeout = 4000)
  public void test049()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      FileInputStream fileInputStream0 = fileUtil0.fetchASINFile((String) null, (String) null, (String) null, (String) null);
      assertNull(fileInputStream0);
  }

  /**
  //Test case number: 50
  /*Coverage entropy=1.242453324894
  */
  @Test(timeout = 4000)
  public void test050()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      FileInputStream fileInputStream0 = fileUtil0.fetchASINFile("jO,1'mx-9dD0`qjJEL", "jO,1'mx-9dD0`qjJEL", "ShoppingCart=add&f=xml&dev-t=", "ShoppingCart=add&f=xml&dev-t=");
      assertNull(fileInputStream0);
  }

  /**
  //Test case number: 51
  /*Coverage entropy=0.6365141682948128
  */
  @Test(timeout = 4000)
  public void test051()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      File file0 = fileUtil0.downloadThirdPartySearchFile((String) null, (String) null, (String) null, (String) null);
      assertNull(file0);
  }

  /**
  //Test case number: 52
  /*Coverage entropy=0.6365141682948128
  */
  @Test(timeout = 4000)
  public void test052()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      File file0 = fileUtil0.downloadThirdPartySearchFile("a6[^zWq^", "a6[^zWq^", "", "a6[^zWq^");
      assertNull(file0);
  }

  /**
  //Test case number: 53
  /*Coverage entropy=0.6365141682948128
  */
  @Test(timeout = 4000)
  public void test053()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      File file0 = fileUtil0.downloadThirdPartySearchFile("a6[^zWq^", (String) null, "a6[^zWq^", "a6[^zWq^");
      assertNull(file0);
  }

  /**
  //Test case number: 54
  /*Coverage entropy=0.6365141682948128
  */
  @Test(timeout = 4000)
  public void test054()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      File file0 = fileUtil0.downloadThirdPartySearchFile("", "", "tbq:Bs", "");
      assertNull(file0);
  }

  /**
  //Test case number: 55
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test055()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      boolean boolean0 = fileUtil0.downloadSimilaritesFile((String) null, "S", (String) null);
      assertFalse(boolean0);
  }

  /**
  //Test case number: 56
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test056()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      boolean boolean0 = fileUtil0.downloadSimilaritesFile("1/YL6{vvP!W)&l2D", (String) null, "");
      assertFalse(boolean0);
  }

  /**
  //Test case number: 57
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test057()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      boolean boolean0 = fileUtil0.downloadSimilaritesFile((String) null, "r)e k=f;[FDa9F0", "S");
      assertFalse(boolean0);
  }

  /**
  //Test case number: 58
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test058()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      boolean boolean0 = fileUtil0.downloadSimilaritesFile("Z3:XYYu<al0$!(", "", "ShoppingCart=clear&f=xml&dev-t=");
      assertFalse(boolean0);
  }

  /**
  //Test case number: 59
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test059()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      boolean boolean0 = fileUtil0.downloadSimilaritesFile("", (String) null, "ShoppingCaot=add&9=xml&dev-t=");
      assertFalse(boolean0);
  }

  /**
  //Test case number: 60
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test060()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      boolean boolean0 = fileUtil0.downloadOneASINFile("0L}M&@*P'#9*]2b", "new", "0L}M&@*P'#9*]2b", "new", "0L}M&@*P'#9*]2b");
      assertFalse(boolean0);
  }

  /**
  //Test case number: 61
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test061()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      boolean boolean0 = fileUtil0.downloadOneASINFile("", "", "", "", "");
      assertFalse(boolean0);
  }

  /**
  //Test case number: 62
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test062()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      boolean boolean0 = fileUtil0.downloadOneASINFile((String) null, (String) null, (String) null, (String) null, (String) null);
      assertFalse(boolean0);
  }

  /**
  //Test case number: 63
  /*Coverage entropy=0.6365141682948128
  */
  @Test(timeout = 4000)
  public void test063()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      File file0 = fileUtil0.downloadKeywordSearchFile("", "", "&", "");
      assertNull(file0);
  }

  /**
  //Test case number: 64
  /*Coverage entropy=0.6365141682948128
  */
  @Test(timeout = 4000)
  public void test064()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      File file0 = fileUtil0.downloadKeywordSearchFile("B8H-Duee1EPk7/h", "v_^iq)*oe#", "B8H-Duee1EPk7/h", "v_^iq)*oe#");
      assertNull(file0);
  }

  /**
  //Test case number: 65
  /*Coverage entropy=0.6365141682948128
  */
  @Test(timeout = 4000)
  public void test065()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      File file0 = fileUtil0.downloadKeywordSearchFile((String) null, (String) null, (String) null, (String) null);
      assertNull(file0);
  }

  /**
  //Test case number: 66
  /*Coverage entropy=0.6365141682948128
  */
  @Test(timeout = 4000)
  public void test066()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      File file0 = fileUtil0.downloadKeywordSearchFile("", "", "", ")+!/ t}QQJF&\"s");
      assertNull(file0);
  }

  /**
  //Test case number: 67
  /*Coverage entropy=0.6365141682948128
  */
  @Test(timeout = 4000)
  public void test067()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      File file0 = fileUtil0.downloadGenericSearchFile((String) null, (String) null, (String) null, (String) null, (String) null, (String) null);
      assertNull(file0);
  }

  /**
  //Test case number: 68
  /*Coverage entropy=0.6365141682948128
  */
  @Test(timeout = 4000)
  public void test068()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      File file0 = fileUtil0.downloadGenericSearchFile((String) null, (String) null, (String) null, "t=", "z] g%I&lW\"feS S", "t=");
      assertNull(file0);
  }

  /**
  //Test case number: 69
  /*Coverage entropy=0.6365141682948128
  */
  @Test(timeout = 4000)
  public void test069()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      File file0 = fileUtil0.downloadGenericSearchFile("Q!U", "Q!U", "ShoppingCart=remove&f=xml&dev-t=", (String) null, (String) null, "ShoppingCart=remove&f=xml&dev-t=");
      assertNull(file0);
  }

  /**
  //Test case number: 70
  /*Coverage entropy=0.6365141682948128
  */
  @Test(timeout = 4000)
  public void test070()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      File file0 = fileUtil0.downloadGenericSearchFile("", "", "", "", "", "");
      assertNull(file0);
  }

  /**
  //Test case number: 71
  /*Coverage entropy=0.6365141682948128
  */
  @Test(timeout = 4000)
  public void test071()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      File file0 = fileUtil0.downloadCart((String) null);
      assertNull(file0);
  }

  /**
  //Test case number: 72
  /*Coverage entropy=0.6365141682948128
  */
  @Test(timeout = 4000)
  public void test072()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      File file0 = fileUtil0.downloadCart("{!VxQ`z(");
      assertNull(file0);
  }

  /**
  //Test case number: 73
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test073()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      boolean boolean0 = fileUtil0.downloadBrowseNodeFile("&Hmac=", (String) null, (String) null, (String) null);
      assertFalse(boolean0);
  }

  /**
  //Test case number: 74
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test074()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      boolean boolean0 = fileUtil0.downloadBrowseNodeFile((String) null, (String) null, "", "1");
      assertFalse(boolean0);
  }

  /**
  //Test case number: 75
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test075()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      boolean boolean0 = fileUtil0.downloadBrowseNodeFile("9FZ;w]ihSC!.", "g_", "a6[^zWq^", "/");
      assertFalse(boolean0);
  }

  /**
  //Test case number: 76
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test076()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      boolean boolean0 = fileUtil0.downloadBrowseNodeFile("", "", "", "");
      assertFalse(boolean0);
  }

  /**
  //Test case number: 77
  /*Coverage entropy=0.6365141682948128
  */
  @Test(timeout = 4000)
  public void test077()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      File file0 = fileUtil0.downloadBlendedSearchFile("c_", (String) null);
      assertNull(file0);
  }

  /**
  //Test case number: 78
  /*Coverage entropy=0.6365141682948128
  */
  @Test(timeout = 4000)
  public void test078()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      File file0 = fileUtil0.downloadBlendedSearchFile((String) null, ".xml");
      assertNull(file0);
  }

  /**
  //Test case number: 79
  /*Coverage entropy=0.6365141682948128
  */
  @Test(timeout = 4000)
  public void test079()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      File file0 = fileUtil0.downloadBlendedSearchFile("ShoppingCart=add&f=xml&dev-t=", "");
      assertNull(file0);
  }

  /**
  //Test case number: 80
  /*Coverage entropy=0.6365141682948128
  */
  @Test(timeout = 4000)
  public void test080()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      File file0 = fileUtil0.downloadBlendedSearchFile("", "");
      assertNull(file0);
  }

  /**
  //Test case number: 81
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test081()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      ArrayList<String> arrayList0 = new ArrayList<String>();
      arrayList0.add("Mg`");
      boolean boolean0 = fileUtil0.downloadAccessoriesFile("", arrayList0, "fC|y4yErcG{w)");
      assertFalse(boolean0);
  }

  /**
  //Test case number: 82
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test082()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      ArrayList<Integer> arrayList0 = new ArrayList<Integer>();
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
      boolean boolean0 = fileUtil0.downloadAccessoriesFile("|E6(.eQGj}", (ArrayList) null, "X]q2{K-Cptu2_");
      assertFalse(boolean0);
  }

  /**
  //Test case number: 84
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test084()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      ArrayList<Integer> arrayList0 = new ArrayList<Integer>();
      boolean boolean0 = fileUtil0.downloadAccessoriesFile("", arrayList0, "");
      assertFalse(boolean0);
  }

  /**
  //Test case number: 85
  /*Coverage entropy=0.6365141682948128
  */
  @Test(timeout = 4000)
  public void test085()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      fileUtil0.deleteFile("'3?qN2A[vB534 `");
  }

  /**
  //Test case number: 86
  /*Coverage entropy=0.6365141682948128
  */
  @Test(timeout = 4000)
  public void test086()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      fileUtil0.deleteFile("");
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
        fileUtil0.renameFile("!rqBP\"'[|L6;b", (String) null);
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
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test088()  throws Throwable  {
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
  //Test case number: 89
  /*Coverage entropy=0.6365141682948128
  */
  @Test(timeout = 4000)
  public void test089()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      File file0 = fileUtil0.downloadCart("");
      assertNull(file0);
  }

  /**
  //Test case number: 90
  /*Coverage entropy=1.277034259466139
  */
  @Test(timeout = 4000)
  public void test090()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      EvoSuiteURL evoSuiteURL0 = new EvoSuiteURL("http://xml.amazon.net/onca/xml3?t=popcornmonste2-20&dev-t=DSB0XDDW1GQ3S&SimilaritySearch=9*(&type=lite&offerpage=9*(&offer=all&f=xml");
      NetworkHandling.createRemoteTextFile(evoSuiteURL0, "A.iKnqSea]rch");
      FileInputStream fileInputStream0 = fileUtil0.fetchSimilarItems("9*(", "9*(");
      assertNull(fileInputStream0);
  }

  /**
  //Test case number: 91
  /*Coverage entropy=1.6417347121875212
  */
  @Test(timeout = 4000)
  public void test091()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      ArrayList<Integer> arrayList0 = new ArrayList<Integer>();
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("/A_.XML");
      FileSystemHandling.createFolder(evoSuiteFile0);
      FileInputStream fileInputStream0 = fileUtil0.fetchAccessories("", arrayList0);
      assertNull(fileInputStream0);
  }

  /**
  //Test case number: 92
  /*Coverage entropy=0.9502705392332347
  */
  @Test(timeout = 4000)
  public void test092()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      EvoSuiteURL evoSuiteURL0 = new EvoSuiteURL("http://xml.amazon.net/onca/xml3?t=popcornmonste2-20&dev-t=DSB0XDDW1GQ3S&SellerSearch=.xml&type=&page=&offerstatus=.xml&f=xml");
      NetworkHandling.createRemoteTextFile(evoSuiteURL0, "SimilaritySearch");
      FileInputStream fileInputStream0 = fileUtil0.fetchThirdPartySearchFile(".xml", "", "", ".xml");
      assertNull(fileInputStream0);
  }

  /**
  //Test case number: 93
  /*Coverage entropy=0.9502705392332347
  */
  @Test(timeout = 4000)
  public void test093()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      EvoSuiteURL evoSuiteURL0 = new EvoSuiteURL("http://xml.amazon.net/onca/xml3?t=popcornmonste2-20&dev-t=DSB0XDDW1GQ3S&9{L_]pj}t4=9%7BL_%5Dpj%7Dt4&mode=9{L_]pj}t4&type=9{L_]pj}t4&page=9{L_]pj}t4&offer=9{L_]pj}t4&f=xml");
      NetworkHandling.createRemoteTextFile(evoSuiteURL0, "ShoppingCart=remove&f=xml&dev-t=");
      FileInputStream fileInputStream0 = fileUtil0.fetchGenericSearchFile("9{L_]pj}t4", "9{L_]pj}t4", "9{L_]pj}t4", "9{L_]pj}t4", "9{L_]pj}t4", "9{L_]pj}t4");
      assertNull(fileInputStream0);
  }

  /**
  //Test case number: 94
  /*Coverage entropy=0.9502705392332347
  */
  @Test(timeout = 4000)
  public void test094()  throws Throwable  {
      EvoSuiteURL evoSuiteURL0 = new EvoSuiteURL("http://xml.amazon.net/onca/xml3?t=popcornmonste2-20&dev-t=DSB0XDDW1GQ3S&BlendedSearch=p%7CF0ER&type=p|F0ER&f=xml");
      NetworkHandling.createRemoteTextFile(evoSuiteURL0, "There is no Prop>rtiej>File Setting to defau t");
      FileUtil fileUtil0 = new FileUtil();
      FileInputStream fileInputStream0 = fileUtil0.fetchBlendedSearchFile("p|F0ER", "p|F0ER");
      assertNull(fileInputStream0);
  }

  /**
  //Test case number: 95
  /*Coverage entropy=1.4708084763221112
  */
  @Test(timeout = 4000)
  public void test095()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("/Y90P,|F?|~F87|&<_C__C__Y90P,|F?|~F87|&<.XML");
      FileSystemHandling.appendLineToFile(evoSuiteFile0, "y90P,|f?|~F87|&<");
      File file0 = fileUtil0.getASINFile("y90P,|f?|~F87|&<", "c_", "c_", "y90P,|f?|~F87|&<");
      assertNotNull(file0);
      assertEquals(18L, file0.length());
  }

  /**
  //Test case number: 96
  /*Coverage entropy=0.6365141682948128
  */
  @Test(timeout = 4000)
  public void test096()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      fileUtil0.renameFile("/", "/");
  }

  /**
  //Test case number: 97
  /*Coverage entropy=0.6365141682948128
  */
  @Test(timeout = 4000)
  public void test097()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      fileUtil0.renameFile("86400000", "+");
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
  /*Coverage entropy=1.6762349391347309
  */
  @Test(timeout = 4000)
  public void test099()  throws Throwable  {
      EvoSuiteURL evoSuiteURL0 = new EvoSuiteURL("http://xml.amazon.net/onca/xml3?t=popcornmonste2-20&dev-t=DSB0XDDW1GQ3S&BrowseNodeSearch=y;GgnKQl_ &mode=a6[^zWq^&type=lite&page=y;GgnKQl_ &offer=new&f=xml");
      NetworkHandling.createRemoteTextFile(evoSuiteURL0, "cacheZDir");
      FileUtil fileUtil0 = new FileUtil();
      fileUtil0.cacheDir = "cacheZDir";
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("cacheZDirA6[^ZWQ^_Y;GGNKQL_ _Y;GGNKQL_ .XML");
      FileSystemHandling.appendLineToFile(evoSuiteFile0, "");
      FileInputStream fileInputStream0 = fileUtil0.fetchBNFile("a6[^zWq^", "y;GgnKQl_ ", "y;GgnKQl_ ");
      assertNotNull(fileInputStream0);
      assertEquals(1, fileInputStream0.available());
  }

  /**
  //Test case number: 100
  /*Coverage entropy=1.6417347121875212
  */
  @Test(timeout = 4000)
  public void test100()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("/S_SHOPPINGCART=REMOVE&F=XML&DEV-T=.XML");
      FileSystemHandling.createFolder(evoSuiteFile0);
      FileInputStream fileInputStream0 = fileUtil0.fetchSimilarItems("ShoppingCart=remove&f=xml&dev-t=", (String) null);
      assertNull(fileInputStream0);
  }

  /**
  //Test case number: 101
  /*Coverage entropy=1.242453324894
  */
  @Test(timeout = 4000)
  public void test101()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      FileInputStream fileInputStream0 = fileUtil0.fetchASINFile("", "", "", "+ @?'&.;*hox^AHD");
      assertNull(fileInputStream0);
  }
}
