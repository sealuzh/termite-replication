/*
 * This file was automatically generated by EvoSuite
 * Thu Dec 05 18:32:18 GMT 2019
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
  /*Coverage entropy=0.45454545454545453
  */
  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("/S_.XML");
      FileSystemHandling.createFolder(evoSuiteFile0);
      File file0 = fileUtil0.getSimilarItems("", "");
      assertEquals("/S_.XML", file0.toString());
      assertNotNull(file0);
      assertTrue(file0.canRead());
  }

  /**
  //Test case number: 1
  /*Coverage entropy=0.4827586206896552
  */
  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("/A_)CFHTOIW#2Y.XML");
      FileSystemHandling.createFolder(evoSuiteFile0);
      ArrayList<Integer> arrayList0 = new ArrayList<Integer>();
      FileUtil fileUtil0 = new FileUtil();
      fileUtil0.fetchAccessories(")cfHtoIW#2Y", arrayList0);
      fileUtil0.getBrowseNodeFile(")cfHtoIW#2Y", ")cfHtoIW#2Y", "~?fr?Ni3=aQWEt;Ifk");
      fileUtil0.downloadGenericSearchFile(")cfHtoIW#2Y", "~?fr?Ni3=aQWEt;Ifk", "&hi[NP57", "~?fr?Ni3=aQWEt;Ifk", "&hi[NP57", " ");
      fileUtil0.fetchBlendedSearchFile(" ", "x/*I_&N");
      FileInputStream fileInputStream0 = fileUtil0.fetchAccessories("ceySI\u0004", arrayList0);
      assertNull(fileInputStream0);
  }

  /**
  //Test case number: 2
  /*Coverage entropy=0.47058823529411764
  */
  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("/)}}TFX4[NZ1U-\\_)}}TFX4[NZ1U-\\_)}}TFX4[NZ1U-\\.XML");
      FileSystemHandling.createFolder(evoSuiteFile0);
      FileUtil fileUtil1 = new FileUtil();
      fileUtil1.fetchBNFile(")}}tfx4[NZ1u-", ")}}tfx4[NZ1u-", ")}}tfx4[NZ1u-");
      File file0 = fileUtil1.downloadGenericSearchFile(")}}tfx4[NZ1u-", (String) null, "z$f(RI WR/.!=W", "z$f(RI WR/.!=W", (String) null, "x_&aEoR)hUR)");
      assertNull(file0);
  }

  /**
  //Test case number: 3
  /*Coverage entropy=0.4615384615384615
  */
  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("/A_NULL.XML");
      byte[] byteArray0 = new byte[4];
      byteArray0[1] = (byte)4;
      FileSystemHandling.appendDataToFile(evoSuiteFile0, byteArray0);
      FileUtil fileUtil0 = new FileUtil();
      ArrayList<Object> arrayList0 = new ArrayList<Object>();
      Integer integer0 = new Integer((byte)0);
      FileSystemHandling.shouldThrowIOException(evoSuiteFile0);
      FileUtil fileUtil1 = new FileUtil();
      File file0 = fileUtil1.getAccessories((String) null, arrayList0);
      assertNotNull(file0);
      assertEquals(4L, file0.length());
  }

  /**
  //Test case number: 4
  /*Coverage entropy=0.4736842105263158
  */
  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("/___.XML");
      FileSystemHandling.appendLineToFile(evoSuiteFile0, "&sJkDYPd0vR3kSW77");
      byte[] byteArray0 = new byte[6];
      FileSystemHandling.appendStringToFile(evoSuiteFile0, "&sJkDYPd0vR3kSW77");
      FileSystemHandling.appendDataToFile(evoSuiteFile0, byteArray0);
      FileUtil fileUtil0 = new FileUtil();
      File file0 = fileUtil0.getASINFile("", "", "", "");
      assertNotNull(file0);
      
      File file1 = fileUtil0.getBrowseNodeFile("", "_", "");
      assertTrue(file1.equals((Object)file0));
      assertNotNull(file1);
      assertTrue(file1.canExecute());
  }

  /**
  //Test case number: 5
  /*Coverage entropy=0.42857142857142855
  */
  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      EvoSuiteURL evoSuiteURL0 = new EvoSuiteURL("http://xml.amazon.net/onca/xml3?t=popcornmonste2-20&dev-t=DSB0XDDW1GQ3S&KeywordSearch=%23&mode=#&type=#&page=#&f=xml");
      NetworkHandling.createRemoteTextFile(evoSuiteURL0, "");
      FileUtil fileUtil0 = new FileUtil();
      FileInputStream fileInputStream0 = fileUtil0.fetchKeywordSearchFile("#", "#", "#", "#");
      assertNull(fileInputStream0);
  }

  /**
  //Test case number: 6
  /*Coverage entropy=0.4615384615384615
  */
  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("/S_.XML");
      FileSystemHandling.appendStringToFile(evoSuiteFile0, "ta_");
      FileInputStream fileInputStream0 = fileUtil0.fetchSimilarItems("", "]Z:L!J");
      assertEquals(3, fileInputStream0.available());
  }

  /**
  //Test case number: 7
  /*Coverage entropy=0.4444444444444445
  */
  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      EvoSuiteURL evoSuiteURL0 = new EvoSuiteURL("http://xml.amazon.net/onca/xml3?t=popcornmonste2-20&dev-t=DSB0XDDW1GQ3S&SimilaritySearch=&type=lite&offerpage=null&offer=all&f=xml");
      NetworkHandling.createRemoteTextFile(evoSuiteURL0, "<O+@N]V7z4q");
      fileUtil0.downloadBlendedSearchFile("", "");
      File file0 = fileUtil0.getSimilarItems("", (String) null);
      assertNull(file0);
  }

  /**
  //Test case number: 8
  /*Coverage entropy=0.45454545454545453
  */
  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("/S_.XML");
      FileSystemHandling.appendStringToFile(evoSuiteFile0, "1");
      FileUtil fileUtil0 = new FileUtil();
      File file0 = fileUtil0.getSimilarItems("", (String) null);
      assertNotNull(file0);
      assertEquals(1L, file0.length());
  }

  /**
  //Test case number: 9
  /*Coverage entropy=0.45454545454545453
  */
  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("/S_.XML");
      FileSystemHandling.appendStringToFile(evoSuiteFile0, "");
      File file0 = fileUtil0.getSimilarItems("", (String) null);
      assertNotNull(file0);
      assertTrue(file0.canRead());
      assertFalse(file0.isDirectory());
  }

  /**
  //Test case number: 10
  /*Coverage entropy=0.4615384615384615
  */
  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      EvoSuiteURL evoSuiteURL0 = new EvoSuiteURL("http://xml.amazon.net/onca/xml3?t=popcornmonste2-20&dev-t=DSB0XDDW1GQ3S&AsinSearch=);?tf4NqQu-\\&type=);?tf4NqQu-\\&offerpage=);?tf4NqQu-\\&offer=);?tf4NqQu-\\&f=xml");
      NetworkHandling.createRemoteTextFile(evoSuiteURL0, "Z");
      FileUtil fileUtil0 = new FileUtil();
      fileUtil0.getSimilarItems("Z", "iBS\"eHcdAI)>,+H");
      FileInputStream fileInputStream0 = fileUtil0.fetchASINFile(");?tf4NqQu-", ");?tf4NqQu-", ");?tf4NqQu-", ");?tf4NqQu-");
      assertNull(fileInputStream0);
  }

  /**
  //Test case number: 11
  /*Coverage entropy=0.4615384615384615
  */
  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("/S_.XML");
      FileSystemHandling.appendStringToFile(evoSuiteFile0, "");
      FileInputStream fileInputStream0 = fileUtil0.fetchSimilarItems("", "{^mU3`Im4U");
      assertEquals(0, fileInputStream0.available());
  }

  /**
  //Test case number: 12
  /*Coverage entropy=0.4615384615384615
  */
  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("/S_#.XML");
      FileSystemHandling.createFolder(evoSuiteFile0);
      FileUtil fileUtil0 = new FileUtil();
      FileInputStream fileInputStream0 = fileUtil0.fetchSimilarItems("#", "#");
      assertNull(fileInputStream0);
  }

  /**
  //Test case number: 13
  /*Coverage entropy=0.4615384615384615
  */
  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("/__.XML");
      FileSystemHandling.appendLineToFile(evoSuiteFile0, "");
      FileUtil fileUtil0 = new FileUtil();
      EvoSuiteURL evoSuiteURL0 = new EvoSuiteURL("http://xml.amazon.net/onca/xml3?t=popcornmonste2-20&dev-t=DSB0XDDW1GQ3S&BrowseNodeSearch=&mode=&type=lite&page=&offer=new&f=xml");
      NetworkHandling.createRemoteTextFile(evoSuiteURL0, "X*KEAI0=dpwN4o;");
      FileInputStream fileInputStream0 = fileUtil0.fetchBNFile("", "", "");
      assertNotNull(fileInputStream0);
      assertEquals(1, fileInputStream0.available());
  }

  /**
  //Test case number: 14
  /*Coverage entropy=0.4
  */
  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      EvoSuiteURL evoSuiteURL0 = new EvoSuiteURL("http://xml.amazon.net/onca/xml3?t=popcornmonste2-20&dev-t=DSB0XDDW1GQ3S&BlendedSearch=&type=&f=xml");
      NetworkHandling.createRemoteTextFile(evoSuiteURL0, ")cfHtoIW#2Y");
      FileUtil fileUtil0 = new FileUtil();
      File file0 = fileUtil0.downloadBlendedSearchFile("", "");
      assertNull(file0);
  }

  /**
  //Test case number: 15
  /*Coverage entropy=0.4444444444444445
  */
  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      EvoSuiteURL evoSuiteURL0 = new EvoSuiteURL("http://xml.amazon.net/onca/xml3?t=popcornmonste2-20&dev-t=DSB0XDDW1GQ3S&BrowseNodeSearch=&mode=&type=lite&page=&offer=new&f=xml");
      NetworkHandling.createRemoteTextFile(evoSuiteURL0, "X*KEAI0=pwN4o;");
      FileInputStream fileInputStream0 = fileUtil0.fetchBNFile("", "", "");
      assertNull(fileInputStream0);
  }

  /**
  //Test case number: 16
  /*Coverage entropy=0.47619047619047616
  */
  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("/___.XML");
      FileSystemHandling.appendStringToFile(evoSuiteFile0, "");
      FileSystemHandling.setPermissions(evoSuiteFile0, true, false, false);
      FileUtil fileUtil0 = new FileUtil();
      fileUtil0.getASINFile("", "", "", "");
      ArrayList<Object> arrayList0 = new ArrayList<Object>();
      fileUtil0.getAccessories("", arrayList0);
      FileInputStream fileInputStream0 = fileUtil0.fetchSimilarItems("AsinSearch", "AsinSearch");
      assertNull(fileInputStream0);
  }

  /**
  //Test case number: 17
  /*Coverage entropy=0.47619047619047616
  */
  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("/___.XML");
      FileSystemHandling.appendLineToFile(evoSuiteFile0, "");
      FileUtil fileUtil0 = new FileUtil();
      fileUtil0.fetchGenericSearchFile("(>4gNR}n'P+n/c&", "'(RN{PpI=", "cacheLife", "There is no Properties File Setting to default", "", "'(RN{PpI=");
      fileUtil0.getBrowseNodeFile("", "'(RN{PpI=", "cacheLife");
      FileInputStream fileInputStream0 = fileUtil0.fetchASINFile("", "", "", "");
      assertEquals(1, fileInputStream0.available());
  }

  /**
  //Test case number: 18
  /*Coverage entropy=0.47058823529411764
  */
  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("/___.XML");
      FileSystemHandling.appendStringToFile(evoSuiteFile0, "");
      fileUtil0.fetchASINFile("", "", "", "");
      File file0 = fileUtil0.getASINFile("", "", "C)t@&Bd(y'\"n~:\"|2A_", "");
      assertNull(file0);
  }

  /**
  //Test case number: 19
  /*Coverage entropy=0.4615384615384615
  */
  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("/OFFERSTATUS=_OFFERSTATUS=_OFFERSTATUS=_OFFERSTATUS=.XML");
      FileSystemHandling.createFolder(evoSuiteFile0);
      FileInputStream fileInputStream0 = fileUtil0.fetchASINFile("offerstatus=", "offerstatus=", "offerstatus=", "offerstatus=");
      assertNull(fileInputStream0);
  }

  /**
  //Test case number: 20
  /*Coverage entropy=0.4615384615384615
  */
  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("/A_NULL.XML");
      byte[] byteArray0 = new byte[4];
      byteArray0[0] = (byte) (-28);
      byteArray0[1] = (byte)4;
      byteArray0[2] = (byte) (-1);
      FileSystemHandling.appendDataToFile(evoSuiteFile0, byteArray0);
      ArrayList<String> arrayList0 = new ArrayList<String>();
      FileUtil fileUtil0 = new FileUtil();
      FileInputStream fileInputStream0 = fileUtil0.fetchAccessories((String) null, arrayList0);
      assertEquals(4, fileInputStream0.available());
  }

  /**
  //Test case number: 21
  /*Coverage entropy=0.45454545454545453
  */
  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("/A_NULL.XML");
      FileSystemHandling.createFolder(evoSuiteFile0);
      byte[] byteArray0 = new byte[3];
      byteArray0[1] = (byte)4;
      FileSystemHandling.appendDataToFile(evoSuiteFile0, byteArray0);
      ArrayList<Object> arrayList0 = new ArrayList<Object>();
      Integer integer0 = new Integer((byte)0);
      FileUtil fileUtil0 = new FileUtil();
      File file0 = fileUtil0.getAccessories((String) null, arrayList0);
      assertNotNull(file0);
      assertEquals(1392409281320L, file0.lastModified());
      assertEquals("A_NULL.XML", file0.getName());
  }

  /**
  //Test case number: 22
  /*Coverage entropy=0.45454545454545453
  */
  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("/___.XML");
      FileSystemHandling.appendStringToFile(evoSuiteFile0, "");
      FileUtil fileUtil0 = new FileUtil();
      File file0 = fileUtil0.getASINFile("", "", "", "");
      assertNotNull(file0);
      assertTrue(file0.isFile());
      assertTrue(file0.canWrite());
  }

  /**
  //Test case number: 23
  /*Coverage entropy=0.45454545454545453
  */
  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("/___.XML");
      FileSystemHandling.createFolder(evoSuiteFile0);
      FileUtil fileUtil0 = new FileUtil();
      File file0 = fileUtil0.getASINFile("", "", "", "");
      assertNotNull(file0);
      assertEquals("/___.XML", file0.toString());
      assertEquals(1392409281320L, file0.lastModified());
  }

  /**
  //Test case number: 24
  /*Coverage entropy=0.4
  */
  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      EvoSuiteURL evoSuiteURL0 = new EvoSuiteURL("http://xml.amazon.net/onca/xml3?t=popcornmonste2-20&dev-t=DSB0XDDW1GQ3S&=&mode=&type=&page=&offer=&f=xml");
      NetworkHandling.createRemoteTextFile(evoSuiteURL0, "i cMs");
      File file0 = fileUtil0.downloadGenericSearchFile("", "", "", "", "", "");
      assertNull(file0);
  }

  /**
  //Test case number: 25
  /*Coverage entropy=0.4
  */
  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      EvoSuiteURL evoSuiteURL0 = new EvoSuiteURL("http://xml.amazon.net/onca/xml3?t=popcornmonste2-20&dev-t=DSB0XDDW1GQ3S&=&mode=&type=&page=&offer=&f=xml");
      NetworkHandling.createRemoteTextFile(evoSuiteURL0, "");
      File file0 = fileUtil0.downloadGenericSearchFile("", "", "", "", "", "");
      assertNull(file0);
  }

  /**
  //Test case number: 26
  /*Coverage entropy=0.45454545454545453
  */
  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("/)}}TFX4[NZ1U-\\_)}}TFX4[NZ1U-\\_)}}TFX4[NZ1U-\\.XML");
      FileSystemHandling.createFolder(evoSuiteFile0);
      File file0 = fileUtil0.getBrowseNodeFile(")}}tfx4[NZ1u-", ")}}tfx4[NZ1u-", ")}}tfx4[NZ1u-");
      assertNull(file0);
  }

  /**
  //Test case number: 27
  /*Coverage entropy=0.4
  */
  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
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
  //Test case number: 28
  /*Coverage entropy=0.4
  */
  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      MockFile mockFile0 = new MockFile("", "");
      boolean boolean0 = fileUtil0.isAgeGood(mockFile0);
      assertFalse(boolean0);
  }

  /**
  //Test case number: 29
  /*Coverage entropy=0.4
  */
  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      // Undeclared exception!
      try { 
        fileUtil0.renameFile((String) null, "");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.io.File", e);
      }
  }

  /**
  //Test case number: 30
  /*Coverage entropy=0.4
  */
  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      MockFile mockFile0 = new MockFile((String) null, "a~S`I\"7?l");
      boolean boolean0 = fileUtil0.isAgeGood((File) null);
      assertFalse(boolean0);
  }

  /**
  //Test case number: 31
  /*Coverage entropy=0.4
  */
  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      MockFile mockFile0 = new MockFile(")}}tfx4[NZ1u-");
      boolean boolean0 = fileUtil0.isAgeGood(mockFile0);
      assertFalse(boolean0);
  }

  /**
  //Test case number: 32
  /*Coverage entropy=0.4444444444444445
  */
  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      FileInputStream fileInputStream0 = fileUtil0.fetchSimilarItems((String) null, "Jd");
      assertNull(fileInputStream0);
  }

  /**
  //Test case number: 33
  /*Coverage entropy=0.42857142857142855
  */
  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      FileInputStream fileInputStream0 = fileUtil0.fetchKeywordSearchFile("b[qZ(52u8&", "b[qZ(52u8&", "offerstatus=", "b[qZ(52u8&");
      assertNull(fileInputStream0);
  }

  /**
  //Test case number: 34
  /*Coverage entropy=0.42857142857142855
  */
  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      FileInputStream fileInputStream0 = fileUtil0.fetchKeywordSearchFile("net.kencochrane.a4j.fle.FieUtil", "net.kencochrane.a4j.fle.FieUtil", "net.kencochrane.a4j.fle.FieUtil", "m=}<sKwhYF&Nm");
      assertNull(fileInputStream0);
  }

  /**
  //Test case number: 35
  /*Coverage entropy=0.42857142857142855
  */
  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      FileInputStream fileInputStream0 = fileUtil0.fetchKeywordSearchFile("t_", ":D/?[7aLy", "t_", "t_");
      assertNull(fileInputStream0);
  }

  /**
  //Test case number: 36
  /*Coverage entropy=0.4
  */
  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      File file0 = fileUtil0.downloadKeywordSearchFile("}H6'/KEhX2b45", "}H6'/KEhX2b45", "net.kencochrane.a4j.file.FileUtil", "}H6'/KEhX2b45");
      assertNull(file0);
  }

  /**
  //Test case number: 37
  /*Coverage entropy=0.4
  */
  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      File file0 = fileUtil0.downloadCart("O{(K$?Pz>}2oM-z");
      assertNull(file0);
  }

  /**
  //Test case number: 38
  /*Coverage entropy=0.4444444444444445
  */
  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      FileInputStream fileInputStream0 = fileUtil0.fetchASINFile("SimilaritySearch", "", "", "SimilaritySearch");
      assertNull(fileInputStream0);
  }

  /**
  //Test case number: 39
  /*Coverage entropy=0.4444444444444445
  */
  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      FileInputStream fileInputStream0 = fileUtil0.fetchASINFile("new", "new", "new", "offerstatus=");
      assertNull(fileInputStream0);
  }

  /**
  //Test case number: 40
  /*Coverage entropy=0.4444444444444445
  */
  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      FileInputStream fileInputStream0 = fileUtil0.fetchASINFile("offerstatus=", "offerstatus=", "cLq/P):_i$I/", "cLq/P):_i$I/");
      assertNull(fileInputStream0);
  }

  /**
  //Test case number: 41
  /*Coverage entropy=0.4
  */
  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      fileUtil0.deleteFile("t_");
  }

  /**
  //Test case number: 42
  /*Coverage entropy=0.4
  */
  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      fileUtil0.deleteFile("");
  }

  /**
  //Test case number: 43
  /*Coverage entropy=0.4
  */
  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      boolean boolean0 = fileUtil0.downloadSimilaritesFile("", "", (String) null);
      assertFalse(boolean0);
  }

  /**
  //Test case number: 44
  /*Coverage entropy=0.42857142857142855
  */
  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      FileInputStream fileInputStream0 = fileUtil0.fetchThirdPartySearchFile(")}}tfx4[NZ1u-", ")}}tfx4[NZ1u-", ")}}tfx4[NZ1u-", "ts_");
      assertNull(fileInputStream0);
  }

  /**
  //Test case number: 45
  /*Coverage entropy=0.42857142857142855
  */
  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      FileInputStream fileInputStream0 = fileUtil0.fetchThirdPartySearchFile(".2``4Z@8S0L", ")}}tfx4[NZ1u-", ".2``4Z@8S0L", ")}}tfx4[NZ1u-");
      assertNull(fileInputStream0);
  }

  /**
  //Test case number: 46
  /*Coverage entropy=0.42857142857142855
  */
  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      FileInputStream fileInputStream0 = fileUtil0.fetchThirdPartySearchFile("", "", "l/c", "");
      assertNull(fileInputStream0);
  }

  /**
  //Test case number: 47
  /*Coverage entropy=0.4
  */
  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      File file0 = fileUtil0.downloadThirdPartySearchFile("eA'2C6,", "eA'2C6,", "eA'2C6,", "");
      assertNull(file0);
  }

  /**
  //Test case number: 48
  /*Coverage entropy=0.4
  */
  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      File file0 = fileUtil0.downloadThirdPartySearchFile("", "64(`8.th`,m>W@`y-", "", "");
      assertNull(file0);
  }

  /**
  //Test case number: 49
  /*Coverage entropy=0.4
  */
  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      File file0 = fileUtil0.downloadThirdPartySearchFile("pxk1 MM5~h8Ohf", "pxk1 MM5~h8Ohf", (String) null, (String) null);
      assertNull(file0);
  }

  /**
  //Test case number: 50
  /*Coverage entropy=0.42857142857142855
  */
  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      FileInputStream fileInputStream0 = fileUtil0.fetchGenericSearchFile(");?tf4NqQu-", ");?tf4NqQu-", ");?tf4NqQu-", ");?tf4NqQu-", ");?tf4NqQu-", "N39");
      assertNull(fileInputStream0);
  }

  /**
  //Test case number: 51
  /*Coverage entropy=0.4
  */
  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      File file0 = fileUtil0.downloadGenericSearchFile("", "", "", "", "cacheLife", "cacheLife");
      assertNull(file0);
  }

  /**
  //Test case number: 52
  /*Coverage entropy=0.4
  */
  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      File file0 = fileUtil0.downloadGenericSearchFile("_", "a_", "_", "_", "_", "a_");
      assertNull(file0);
  }

  /**
  //Test case number: 53
  /*Coverage entropy=0.4
  */
  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      File file0 = fileUtil0.downloadGenericSearchFile("", "", "", "@6kr<G/u+e>", "@6kr<G/u+e>", "@6kr<G/u+e>");
      assertNull(file0);
  }

  /**
  //Test case number: 54
  /*Coverage entropy=0.4
  */
  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      File file0 = fileUtil0.downloadKeywordSearchFile("", "", "", "ShoppingCart=add&f=xml&dev-t=");
      assertNull(file0);
  }

  /**
  //Test case number: 55
  /*Coverage entropy=0.4
  */
  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      File file0 = fileUtil0.downloadKeywordSearchFile("@'8YS.rCvTe_,v\"wjR", "", "@'8YS.rCvTe_,v\"wjR", "");
      assertNull(file0);
  }

  /**
  //Test case number: 56
  /*Coverage entropy=0.4
  */
  @Test(timeout = 4000)
  public void test56()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      File file0 = fileUtil0.downloadBlendedSearchFile("J3Y95m0WsD4]", "tR$|SvDQO P");
      assertNull(file0);
  }

  /**
  //Test case number: 57
  /*Coverage entropy=0.42857142857142855
  */
  @Test(timeout = 4000)
  public void test57()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      File file0 = fileUtil0.getASINFile("gFsXYv8iIK3S%)a", "", "", "gFsXYv8iIK3S%)a");
      assertNull(file0);
  }

  /**
  //Test case number: 58
  /*Coverage entropy=0.42857142857142855
  */
  @Test(timeout = 4000)
  public void test58()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      File file0 = fileUtil0.getASINFile("", "", "", "~");
      assertNull(file0);
  }

  /**
  //Test case number: 59
  /*Coverage entropy=0.4
  */
  @Test(timeout = 4000)
  public void test59()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      boolean boolean0 = fileUtil0.downloadOneASINFile("S\"``\"qZ>^}dQ", "S\"``\"qZ>^}dQ", "S\"``\"qZ>^}dQ", "%cVKO$/t$", "%cVKO$/t$");
      assertFalse(boolean0);
  }

  /**
  //Test case number: 60
  /*Coverage entropy=0.4
  */
  @Test(timeout = 4000)
  public void test60()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      boolean boolean0 = fileUtil0.downloadOneASINFile("n)", "n)", "%Fm^\"}", "%Fm^\"}", "n)");
      assertFalse(boolean0);
  }

  /**
  //Test case number: 61
  /*Coverage entropy=0.4
  */
  @Test(timeout = 4000)
  public void test61()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      boolean boolean0 = fileUtil0.downloadSimilaritesFile("4.lY]Y4{A9.dh@T'N>n", "", "4.lY]Y4{A9.dh@T'N>n");
      assertFalse(boolean0);
  }

  /**
  //Test case number: 62
  /*Coverage entropy=0.4
  */
  @Test(timeout = 4000)
  public void test62()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      boolean boolean0 = fileUtil0.downloadOneASINFile("", "5/&", "", "", "");
      assertFalse(boolean0);
  }

  /**
  //Test case number: 63
  /*Coverage entropy=0.4444444444444445
  */
  @Test(timeout = 4000)
  public void test63()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      FileInputStream fileInputStream0 = fileUtil0.fetchBNFile("@'8YS.rCvTe_,v\"wjR", "@'8YS.rCvTe_,v\"wjR", "}=(n/_^_I>WEuZdG]@");
      assertNull(fileInputStream0);
  }

  /**
  //Test case number: 64
  /*Coverage entropy=0.4444444444444445
  */
  @Test(timeout = 4000)
  public void test64()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      FileInputStream fileInputStream0 = fileUtil0.fetchBNFile("a~S`I\"7?l", (String) null, (String) null);
      assertNull(fileInputStream0);
  }

  /**
  //Test case number: 65
  /*Coverage entropy=0.4
  */
  @Test(timeout = 4000)
  public void test65()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      boolean boolean0 = fileUtil0.downloadBrowseNodeFile("", "@'8YS.rCvTe_,v\"wjR", "/i2<UIaNWp3X.8z*", "/i2<UIaNWp3X.8z*");
      assertFalse(boolean0);
  }

  /**
  //Test case number: 66
  /*Coverage entropy=0.4
  */
  @Test(timeout = 4000)
  public void test66()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      fileUtil0.renameFile("net.kencochrane.a4j.file.FileUtil", "@WiQiJtL$lrz2+p");
  }

  /**
  //Test case number: 67
  /*Coverage entropy=0.4
  */
  @Test(timeout = 4000)
  public void test67()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      ArrayList<Object> arrayList0 = new ArrayList<Object>();
      boolean boolean0 = fileUtil0.downloadAccessoriesFile("", arrayList0, "");
      assertFalse(boolean0);
  }

  /**
  //Test case number: 68
  /*Coverage entropy=0.4
  */
  @Test(timeout = 4000)
  public void test68()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      boolean boolean0 = fileUtil0.downloadBrowseNodeFile("eMQ{z f]u)o]", "PM?", "eMQ{z f]u)o]", "PM?");
      assertFalse(boolean0);
  }

  /**
  //Test case number: 69
  /*Coverage entropy=0.4
  */
  @Test(timeout = 4000)
  public void test69()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      fileUtil0.renameFile("", "");
  }
}
