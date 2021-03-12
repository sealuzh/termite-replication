/*
 * This file was automatically generated by EvoSuite
 * Tue Nov 10 10:52:15 GMT 2020
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
      FileInputStream fileInputStream0 = fileUtil0.fetchGenericSearchFile("cacheDir", "", "vu&nG%q~-#gT[)c", "6_uid)YO:", "vu&nG%q~-#gT[)c", "");
      assertNull(fileInputStream0);
  }

  /**
  //Test case number: 1
  /*Coverage entropy=0.6365141682948128
  */
  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      File file0 = fileUtil0.downloadGenericSearchFile("b_", "#", "", "[Z,", "SellerSearch=", "*O^}`HdIS!#;6FtQ");
      assertNull(file0);
  }

  /**
  //Test case number: 2
  /*Coverage entropy=1.242453324894
  */
  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      File file0 = fileUtil0.getASINFile("vu&nG%q~-#gT[)c", (String) null, "", "6_uid)YO:");
      assertNull(file0);
      
      boolean boolean0 = fileUtil0.isAgeGood(file0);
      assertFalse(boolean0);
  }

  /**
  //Test case number: 3
  /*Coverage entropy=1.6417347121875212
  */
  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("/)___M.XML");
      FileSystemHandling.createFolder(evoSuiteFile0);
      FileInputStream fileInputStream0 = fileUtil0.fetchBNFile(")", "_", "M");
      assertNull(fileInputStream0);
  }

  /**
  //Test case number: 4
  /*Coverage entropy=0.6365141682948128
  */
  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      EvoSuiteURL evoSuiteURL0 = new EvoSuiteURL("http://xml.amazon.net/onca/xml3?t=popcornmonste2-20&dev-t=DSB0XDDW1GQ3S&SellerSearch=#u[R?}x$ z%G&type=&page=dfG{vo+Y&offerstatus=dfG{vo+Y&f=xml");
      NetworkHandling.createRemoteTextFile(evoSuiteURL0, "");
      FileUtil fileUtil0 = new FileUtil();
      File file0 = fileUtil0.downloadThirdPartySearchFile("#u[R?}x$ z%G", "", "dfG{vo+Y", "dfG{vo+Y");
      assertNull(file0);
  }

  /**
  //Test case number: 5
  /*Coverage entropy=1.277034259466139
  */
  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      EvoSuiteURL evoSuiteURL0 = new EvoSuiteURL("http://xml.amazon.net/onca/xml3?t=popcornmonste2-20&dev-t=DSB0XDDW1GQ3S&BrowseNodeSearch=_&mode=)&type=lite&page=M&offer=new&f=xml");
      NetworkHandling.createRemoteTextFile(evoSuiteURL0, "#");
      FileInputStream fileInputStream0 = fileUtil0.fetchBNFile(")", "_", "M");
      assertNull(fileInputStream0);
  }

  /**
  //Test case number: 6
  /*Coverage entropy=1.4708084763221112
  */
  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      ArrayList<Integer> arrayList0 = new ArrayList<Integer>();
      FileUtil fileUtil0 = new FileUtil();
      System.setCurrentTimeMillis((-2796L));
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("/A_3RD_.XML");
      FileSystemHandling.appendLineToFile(evoSuiteFile0, "]ykJ&;!Kv)5K8X:");
      File file0 = fileUtil0.getAccessories("3rd_", arrayList0);
      assertNotNull(file0);
      assertEquals((-2796L), file0.lastModified());
  }

  /**
  //Test case number: 7
  /*Coverage entropy=1.6417347121875212
  */
  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      ArrayList<Integer> arrayList0 = new ArrayList<Integer>();
      FileUtil fileUtil0 = new FileUtil();
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("/A_}G.XML");
      byte[] byteArray0 = new byte[4];
      FileSystemHandling.appendDataToFile(evoSuiteFile0, byteArray0);
      FileInputStream fileInputStream0 = fileUtil0.fetchAccessories("}G", arrayList0);
      assertEquals(4, fileInputStream0.available());
  }

  /**
  //Test case number: 8
  /*Coverage entropy=1.6417347121875212
  */
  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("/VYQKLUNV_NULL__LQIQU7E.XML");
      FileSystemHandling.appendLineToFile(evoSuiteFile0, "VYqkLunV");
      FileInputStream fileInputStream0 = fileUtil0.fetchASINFile("VYqkLunV", "", (String) null, "lqiQu7E");
      assertEquals(9, fileInputStream0.available());
  }

  /**
  //Test case number: 9
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      boolean boolean0 = fileUtil0.downloadOneASINFile((String) null, "", "4", "b}YWr:8Ow", "Iw3Ms");
      assertFalse(boolean0);
  }

  /**
  //Test case number: 10
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      boolean boolean0 = fileUtil0.downloadBrowseNodeFile("a", "a", "hpp*9U/T+<mP|g", "ts_");
      assertFalse(boolean0);
  }

  /**
  //Test case number: 11
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      boolean boolean0 = fileUtil0.downloadAccessoriesFile("", (ArrayList) null, " ");
      assertFalse(boolean0);
  }

  /**
  //Test case number: 12
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      // Undeclared exception!
      try { 
        fileUtil0.renameFile((String) null, " ");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.io.File", e);
      }
  }

  /**
  //Test case number: 13
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
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
  //Test case number: 14
  /*Coverage entropy=0.9502705392332347
  */
  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      File file0 = fileUtil0.getBrowseNodeFile((String) null, "lqiQu7E", (String) null);
      assertNull(file0);
  }

  /**
  //Test case number: 15
  /*Coverage entropy=0.6365141682948128
  */
  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      File file0 = MockFile.createTempFile("There is no Properties File Setting to default", "@`5/_1`IA", (File) null);
      boolean boolean0 = fileUtil0.isAgeGood(file0);
      assertFalse(boolean0);
  }

  /**
  //Test case number: 16
  /*Coverage entropy=0.6365141682948128
  */
  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      fileUtil0.deleteFile("VYqkLunV");
  }

  /**
  //Test case number: 17
  /*Coverage entropy=0.6365141682948128
  */
  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      File file0 = fileUtil0.downloadCart("kN3!H");
      assertNull(file0);
  }

  /**
  //Test case number: 18
  /*Coverage entropy=1.6417347121875212
  */
  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("/S_ASSOCIATEID.XML");
      FileSystemHandling.appendLineToFile(evoSuiteFile0, "NAQoXLH%");
      FileInputStream fileInputStream0 = fileUtil0.fetchSimilarItems("associateID", "xg3^58{Pg,LP*");
      assertEquals(9, fileInputStream0.available());
  }

  /**
  //Test case number: 19
  /*Coverage entropy=1.242453324894
  */
  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      FileInputStream fileInputStream0 = fileUtil0.fetchSimilarItems("associateID", "xg3^58{Pg,LP*");
      assertNull(fileInputStream0);
  }

  /**
  //Test case number: 20
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      boolean boolean0 = fileUtil0.downloadSimilaritesFile("_", "_", "_");
      assertFalse(boolean0);
  }

  /**
  //Test case number: 21
  /*Coverage entropy=1.4708084763221112
  */
  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("/S_O.XML");
      byte[] byteArray0 = new byte[6];
      FileSystemHandling.appendDataToFile(evoSuiteFile0, byteArray0);
      File file0 = fileUtil0.getSimilarItems("o", "o");
      assertEquals(6L, file0.length());
      assertNotNull(file0);
  }

  /**
  //Test case number: 22
  /*Coverage entropy=0.9502705392332347
  */
  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      File file0 = fileUtil0.getSimilarItems("VYqkLunV", "lqiQu7E");
      assertNull(file0);
  }

  /**
  //Test case number: 23
  /*Coverage entropy=1.6417347121875212
  */
  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("/A_).XML");
      FileSystemHandling.createFolder(evoSuiteFile0);
      ArrayList<Object> arrayList0 = new ArrayList<Object>();
      FileInputStream fileInputStream0 = fileUtil0.fetchAccessories(")", arrayList0);
      assertNull(fileInputStream0);
  }

  /**
  //Test case number: 24
  /*Coverage entropy=1.242453324894
  */
  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      ArrayList<Object> arrayList0 = new ArrayList<Object>();
      FileInputStream fileInputStream0 = fileUtil0.fetchAccessories(")", arrayList0);
      assertNull(fileInputStream0);
  }

  /**
  //Test case number: 25
  /*Coverage entropy=1.4708084763221112
  */
  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      ArrayList<Integer> arrayList0 = new ArrayList<Integer>();
      FileUtil fileUtil0 = new FileUtil();
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("/A_3RD_.XML");
      FileSystemHandling.appendLineToFile(evoSuiteFile0, "]ykJ&;!Kv)5K8X:");
      File file0 = fileUtil0.getAccessories("3rd_", arrayList0);
      assertEquals(16L, file0.length());
      assertNotNull(file0);
  }

  /**
  //Test case number: 26
  /*Coverage entropy=0.9502705392332347
  */
  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      ArrayList<Integer> arrayList0 = new ArrayList<Integer>();
      FileUtil fileUtil0 = new FileUtil();
      File file0 = fileUtil0.getAccessories("3rd_", arrayList0);
      assertNull(file0);
  }

  /**
  //Test case number: 27
  /*Coverage entropy=1.0397207708399179
  */
  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      FileInputStream fileInputStream0 = fileUtil0.fetchThirdPartySearchFile("(q>sXCz1EM:P;X2T", "]ykJ&;!Kv)5K8X:", "3rd_", "Iw3Ms");
      assertNull(fileInputStream0);
  }

  /**
  //Test case number: 28
  /*Coverage entropy=1.0397207708399179
  */
  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      FileInputStream fileInputStream0 = fileUtil0.fetchGenericSearchFile("vu&nG%q~-#gT[)c", "", "vu&nG%q~-#gT[)c", "", "", "");
      assertNull(fileInputStream0);
  }

  /**
  //Test case number: 29
  /*Coverage entropy=1.0397207708399179
  */
  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      FileInputStream fileInputStream0 = fileUtil0.fetchKeywordSearchFile("*O^}`HdIS!#;6FtQ", "s_", "", "t_");
      assertNull(fileInputStream0);
  }

  /**
  //Test case number: 30
  /*Coverage entropy=1.0397207708399179
  */
  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      FileInputStream fileInputStream0 = fileUtil0.fetchBlendedSearchFile((String) null, "6_uid)YO:");
      assertNull(fileInputStream0);
  }

  /**
  //Test case number: 31
  /*Coverage entropy=0.6365141682948128
  */
  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      File file0 = fileUtil0.downloadKeywordSearchFile("@`5/_1`IA", "", "", "There is no Properties File Setting to default");
      assertNull(file0);
  }

  /**
  //Test case number: 32
  /*Coverage entropy=0.6365141682948128
  */
  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      File file0 = fileUtil0.downloadBlendedSearchFile(">ATiUp", "@`5/_1`IA");
      assertNull(file0);
  }

  /**
  //Test case number: 33
  /*Coverage entropy=1.6417347121875212
  */
  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("/)___M.XML");
      FileSystemHandling.appendLineToFile(evoSuiteFile0, "s_");
      FileInputStream fileInputStream0 = fileUtil0.fetchBNFile(")", "_", "M");
      assertEquals(3, fileInputStream0.available());
  }

  /**
  //Test case number: 34
  /*Coverage entropy=1.242453324894
  */
  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      FileInputStream fileInputStream0 = fileUtil0.fetchASINFile("_", "mRx{B^|4*?", "mRx{B^|4*?", "s_");
      assertNull(fileInputStream0);
  }

  /**
  //Test case number: 35
  /*Coverage entropy=0.6365141682948128
  */
  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      fileUtil0.renameFile(")\"`mHL|BD-iO", "0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ_-~|+");
  }

  /**
  //Test case number: 36
  /*Coverage entropy=0.6365141682948128
  */
  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      fileUtil0.renameFile("", "6_uid)YO:");
  }

  /**
  //Test case number: 37
  /*Coverage entropy=0.6365141682948128
  */
  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      fileUtil0.deleteFile("");
  }

  /**
  //Test case number: 38
  /*Coverage entropy=1.6417347121875212
  */
  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("/VYQKLUNV_NULL__LQIQU7E.XML");
      byte[] byteArray0 = new byte[0];
      FileSystemHandling.appendDataToFile(evoSuiteFile0, byteArray0);
      FileInputStream fileInputStream0 = fileUtil0.fetchASINFile("VYqkLunV", "", (String) null, "lqiQu7E");
      assertEquals(0, fileInputStream0.available());
  }

  /**
  //Test case number: 39
  /*Coverage entropy=1.0114042647073516
  */
  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      EvoSuiteURL evoSuiteURL0 = new EvoSuiteURL("http://xml.amazon.net/onca/xml3?t=popcornmonste2-20&dev-t=DSB0XDDW1GQ3S&AsinSearch=null&type=null&offerpage=lL p;Zt('!3H&offer=null&f=xml");
      NetworkHandling.createRemoteTextFile(evoSuiteURL0, ")");
      File file0 = fileUtil0.getASINFile((String) null, (String) null, (String) null, "lL p;Zt('!3H");
      assertNull(file0);
  }
}
