/*
 * This file was automatically generated by EvoSuite
 * Thu Nov 14 11:25:09 GMT 2019
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
  /*Coverage entropy=1.163735415854063
  */
  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      ArrayList<Object> arrayList0 = new ArrayList<Object>();
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("/A_V0{D>TWB:N=M;.XML");
      FileSystemHandling.appendLineToFile(evoSuiteFile0, "V0{d>tWb:n=M;");
      fileUtil0.getAccessories("", arrayList0);
      FileInputStream fileInputStream0 = fileUtil0.fetchAccessories("V0{d>tWb:n=M;", arrayList0);
      assertEquals(14, fileInputStream0.available());
  }

  /**
  //Test case number: 1
  /*Coverage entropy=2.4164983843494308
  */
  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("/DEV-T=_DEV-T=__DEV-T=.XML");
      FileSystemHandling.appendStringToFile(evoSuiteFile0, "");
      EvoSuiteFile evoSuiteFile1 = new EvoSuiteFile("/");
      FileSystemHandling.createFolder(evoSuiteFile1);
      FileUtil fileUtil0 = new FileUtil();
      fileUtil0.fetchBlendedSearchFile("jT vv]>b=`vi;k&.&", "ur0N[C(N&o?");
      FileInputStream fileInputStream0 = fileUtil0.fetchASINFile("dev-t=", "", "dev-t=", "dev-t=");
      assertEquals(0, fileInputStream0.available());
  }

  /**
  //Test case number: 2
  /*Coverage entropy=1.163735415854063
  */
  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      ArrayList<Object> arrayList0 = new ArrayList<Object>();
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("/A_V0{D>TWB:N=M;.XML");
      FileSystemHandling.createFolder(evoSuiteFile0);
      fileUtil0.getAccessories("", arrayList0);
      FileInputStream fileInputStream0 = fileUtil0.fetchAccessories("V0{d>tWb:n=M;", arrayList0);
      assertNull(fileInputStream0);
  }

  /**
  //Test case number: 3
  /*Coverage entropy=2.1179251883779973
  */
  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("/S_C_.XML");
      FileUtil fileUtil0 = new FileUtil();
      ArrayList<String> arrayList0 = new ArrayList<String>();
      FileSystemHandling.appendStringToFile(evoSuiteFile0, "c_");
      FileInputStream fileInputStream0 = fileUtil0.fetchSimilarItems("c_", "c_");
      assertNotNull(fileInputStream0);
      
      File file0 = fileUtil0.getSimilarItems("c_", "http://xml.amazon.net/onca/xml3");
      assertNotNull(file0);
      assertEquals("S_C_.XML", file0.getName());
  }

  /**
  //Test case number: 4
  /*Coverage entropy=1.5722964991944255
  */
  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("/;T6_V5IQPC!`SG ELTN_8HERE IS NO PROPERTIES FILE SETTING TO DEFAULT_8HERE IS NO PROPERTIES FILE SETTING TO DEFAULT_;T6_V5IQPC!`SG ELTN.XML");
      FileSystemHandling.createFolder(evoSuiteFile0);
      FileUtil fileUtil0 = new FileUtil();
      fileUtil0.downloadThirdPartySearchFile("8here is no Properties File Setting to default", "8here is no Properties File Setting to default", "8here is no Properties File Setting to default", ",");
      fileUtil0.fetchBlendedSearchFile(";t6_v5iqPC!`sG Eltn", ";t6_v5iqPC!`sG Eltn");
      FileInputStream fileInputStream0 = fileUtil0.fetchASINFile(";t6_v5iqPC!`sG Eltn", "8here is no Properties File Setting to default", "8here is no Properties File Setting to default", ";t6_v5iqPC!`sG Eltn");
      assertNull(fileInputStream0);
  }

  /**
  //Test case number: 5
  /*Coverage entropy=0.42857142857142855
  */
  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      EvoSuiteURL evoSuiteURL0 = new EvoSuiteURL("http://xml.amazon.net/onca/xml3?t=popcornmonste2-20&dev-t=DSB0XDDW1GQ3S&SimilaritySearch=offerpage=&type=lite&offerpage=offerpage=&offer=all&f=xml");
      NetworkHandling.createRemoteTextFile(evoSuiteURL0, "zD=(-d=,pB8");
      fileUtil0.cacheDir = "";
      File file0 = fileUtil0.getSimilarItems("offerpage=", "offerpage=");
      assertNull(file0);
  }

  /**
  //Test case number: 6
  /*Coverage entropy=2.429871678186767
  */
  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("/~THRHG\\C!]GYT_F=XML_F=XML.XML");
      FileSystemHandling.createFolder(evoSuiteFile0);
      fileUtil0.getSimilarItems("~ThRhGc!]GYT", "Sw(]#LV");
      fileUtil0.isAgeGood((File) null);
      fileUtil0.getBrowseNodeFile("~ThRhGc!]GYT", "f=xml", "f=xml");
      File file0 = fileUtil0.downloadCart((String) null);
      assertNull(file0);
  }

  /**
  //Test case number: 7
  /*Coverage entropy=1.9253539308675658
  */
  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      ArrayList<Object> arrayList0 = new ArrayList<Object>();
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("/A_V0{D>TWB:N=M;.XML");
      FileSystemHandling.appendLineToFile(evoSuiteFile0, "V0{d>tWb:n=M;");
      File file0 = fileUtil0.getAccessories("V0{d>tWb:n=M;", arrayList0);
      assertEquals(14L, file0.length());
      assertNotNull(file0);
  }

  /**
  //Test case number: 8
  /*Coverage entropy=2.2629988161750485
  */
  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("/V8'@_V8'@_V8'@_.XML");
      FileSystemHandling.appendStringToFile(evoSuiteFile0, "c`ISc v(?amF+Y9");
      EvoSuiteFile evoSuiteFile1 = new EvoSuiteFile("/V8'@_V8'@_V8'@.XML");
      EvoSuiteURL evoSuiteURL0 = new EvoSuiteURL("http://xml.amazon.net/onca/xml3?t=popcornmonste2-20&dev-t=DSB0XDDW1GQ3S&AsinSearch=V8'@&type=V8'@&offerpage=&offer=V8'@&f=xml");
      NetworkHandling.createRemoteTextFile(evoSuiteURL0, "");
      FileSystemHandling.appendLineToFile(evoSuiteFile1, "/_D6NGM:Rc:coogvDb");
      FileSystemHandling.appendLineToFile(evoSuiteFile1, "/_D6NGM:Rc:coogvDb");
      FileSystemHandling.appendLineToFile(evoSuiteFile1, "/_D6NGM:Rc:coogvDb");
      FileUtil fileUtil0 = new FileUtil();
      byte[] byteArray0 = new byte[8];
      byteArray0[1] = (byte) (-80);
      byteArray0[5] = (byte) (-66);
      byteArray0[6] = (byte)2;
      File file0 = fileUtil0.getASINFile("V8'@", "V8'@", "V8'@", "");
      assertNotNull(file0);
      assertEquals(15L, file0.length());
      
      byteArray0[7] = (byte)121;
      File file1 = fileUtil0.getBrowseNodeFile("V8'@", "V8'@", "V8'@");
      assertNotNull(file1);
      
      boolean boolean0 = fileUtil0.isAgeGood(file1);
      assertEquals(57L, file1.length());
      assertFalse(boolean0);
  }

  /**
  //Test case number: 9
  /*Coverage entropy=0.9623351446188083
  */
  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      EvoSuiteURL evoSuiteURL0 = new EvoSuiteURL("http://xml.amazon.net/onca/xml3?t=popcornmonste2-20&dev-t=DSB0XDDW1GQ3S&SellerSearch=&type=&page=&offerstatus=&f=xml");
      NetworkHandling.createRemoteTextFile(evoSuiteURL0, "i|^^LB&j]C)d,IV43^]");
      File file0 = fileUtil0.downloadThirdPartySearchFile("", "", "", "");
      assertNull(file0);
  }

  /**
  //Test case number: 10
  /*Coverage entropy=2.4448836846954114
  */
  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("/V8'@_V8'@_V8'@.XML");
      FileSystemHandling.appendLineToFile(evoSuiteFile0, "E_I/v4;@dmQ/-%?/");
      FileSystemHandling.appendLineToFile(evoSuiteFile0, "E_I/v4;@dmQ/-%?/");
      byte[] byteArray0 = new byte[2];
      FileSystemHandling.setPermissions(evoSuiteFile0, false, true, false);
      byteArray0[1] = (byte)4;
      FileUtil fileUtil0 = new FileUtil();
      FileSystemHandling.appendStringToFile(evoSuiteFile0, "E_I/v4;@dmQ/-%?/");
      File file0 = MockFile.createTempFile("V8'@", "");
      fileUtil0.downloadKeywordSearchFile("W&wa#'</LL", "V8'@", "0b_3", "W&wa#'</LL");
      FileSystemHandling.createFolder(evoSuiteFile0);
      File file1 = fileUtil0.getBrowseNodeFile("V8'@", "V8'@", "V8'@");
      assertNotNull(file1);
      
      fileUtil0.fetchBlendedSearchFile("", "V8'@");
      boolean boolean0 = fileUtil0.isAgeGood(file1);
      assertEquals(50L, file1.length());
      assertFalse(boolean0);
      
      boolean boolean1 = fileUtil0.isAgeGood(file0);
      assertFalse(boolean1);
  }

  /**
  //Test case number: 11
  /*Coverage entropy=2.4306833704186763
  */
  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("/V8'@_V8'@_V8'@.XML");
      boolean boolean0 = FileSystemHandling.appendLineToFile(evoSuiteFile0, "E_I/v4;@dmQ/-%?/");
      FileSystemHandling.appendLineToFile(evoSuiteFile0, "E_I/v4;@dmQ/-%?/");
      FileSystemHandling.appendLineToFile(evoSuiteFile0, "E_I/v4;@dmQ/-%?/");
      FileUtil fileUtil0 = new FileUtil();
      byte[] byteArray0 = new byte[8];
      byteArray0[1] = (byte) (-80);
      byteArray0[3] = (byte) (-80);
      byteArray0[5] = (byte) (-72);
      byteArray0[6] = (byte)2;
      fileUtil0.getASINFile("V8'@", "V8'@", "V8'@", "");
      FileSystemHandling.setPermissions(evoSuiteFile0, true, false, false);
      fileUtil0.downloadKeywordSearchFile("V8'@", "", "oPBkBOA5a2W<o9m", "");
      byteArray0[7] = (byte)2;
      FileSystemHandling.appendDataToFile(evoSuiteFile0, byteArray0);
      fileUtil0.getBrowseNodeFile("V8'@", "V8'@", "V8'@");
      boolean boolean1 = FileSystemHandling.shouldAllThrowIOExceptions();
      assertTrue(boolean1 == boolean0);
  }

  /**
  //Test case number: 12
  /*Coverage entropy=0.42857142857142855
  */
  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      EvoSuiteURL evoSuiteURL0 = new EvoSuiteURL("http://xml.amazon.net/onca/xml3?t=popcornmonste2-20&dev-t=DSB0XDDW1GQ3S&SellerSearch=B=I5Wx(u&type=PT?F{4&@>KYd0R&page=PT?F{4&@>KYd0R&offerstatus=B=I5Wx(u&f=xml");
      NetworkHandling.createRemoteTextFile(evoSuiteURL0, "B=I5Wx(u");
      FileUtil fileUtil0 = new FileUtil();
      FileInputStream fileInputStream0 = fileUtil0.fetchThirdPartySearchFile("B=I5Wx(u", "PT?F{4&@>KYd0R", "PT?F{4&@>KYd0R", "B=I5Wx(u");
      assertNull(fileInputStream0);
  }

  /**
  //Test case number: 13
  /*Coverage entropy=0.4
  */
  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      EvoSuiteURL evoSuiteURL0 = new EvoSuiteURL("http://xml.amazon.net/onca/xml3?t=popcornmonste2-20&dev-t=DSB0XDDW1GQ3S&BlendedSearch=mB%5BAH%2C54%24%5EwXGyN&type=mB[AH,54$^wXGyN&f=xml");
      NetworkHandling.createRemoteTextFile(evoSuiteURL0, "mB[AH,54$^wXGyN");
      File file0 = fileUtil0.downloadBlendedSearchFile("mB[AH,54$^wXGyN", "mB[AH,54$^wXGyN");
      assertNull(file0);
  }

  /**
  //Test case number: 14
  /*Coverage entropy=0.45454545454545453
  */
  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      ArrayList<Object> arrayList0 = new ArrayList<Object>();
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("/A_V0{D>TWB:N=M;.XML");
      FileSystemHandling.createFolder(evoSuiteFile0);
      File file0 = fileUtil0.getAccessories("V0{d>tWb:n=M;", arrayList0);
      assertNotNull(file0);
      assertEquals("/A_V0{D>TWB:N=M;.XML", file0.toString());
      assertTrue(file0.canWrite());
  }

  /**
  //Test case number: 15
  /*Coverage entropy=1.9253539308675658
  */
  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("/S_C_.XML");
      FileUtil fileUtil0 = new FileUtil();
      ArrayList<String> arrayList0 = new ArrayList<String>();
      FileSystemHandling.createFolder(evoSuiteFile0);
      File file0 = fileUtil0.getSimilarItems("c_", ",");
      assertNotNull(file0);
      assertEquals("/S_C_.XML", file0.toString());
      assertTrue(file0.canRead());
  }

  /**
  //Test case number: 16
  /*Coverage entropy=0.4615384615384615
  */
  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("/S_C_.XML");
      FileUtil fileUtil0 = new FileUtil();
      FileSystemHandling.createFolder(evoSuiteFile0);
      FileInputStream fileInputStream0 = fileUtil0.fetchSimilarItems("c_", "c_");
      assertNull(fileInputStream0);
  }

  /**
  //Test case number: 17
  /*Coverage entropy=0.4
  */
  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      EvoSuiteURL evoSuiteURL0 = new EvoSuiteURL("http://xml.amazon.net/onca/xml3?t=popcornmonste2-20&dev-t=DSB0XDDW1GQ3S&KeywordSearch=&mode=&type=&page=&f=xml");
      NetworkHandling.createRemoteTextFile(evoSuiteURL0, "k_");
      File file0 = fileUtil0.downloadKeywordSearchFile("", "", "", "");
      assertNull(file0);
  }

  /**
  //Test case number: 18
  /*Coverage entropy=1.925353930867566
  */
  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("/V8'@_V8'@_V8'@_V8'@.XML");
      byte[] byteArray0 = new byte[7];
      FileSystemHandling.createFolder(evoSuiteFile0);
      FileUtil fileUtil0 = new FileUtil();
      File file0 = fileUtil0.getASINFile("V8'@", "V8'@", "V8'@", "V8'@");
      assertNotNull(file0);
      assertEquals("V8'@_V8'@_V8'@_V8'@.XML", file0.getName());
      assertTrue(file0.canExecute());
  }

  /**
  //Test case number: 19
  /*Coverage entropy=0.4
  */
  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      EvoSuiteURL evoSuiteURL0 = new EvoSuiteURL("http://xml.amazon.net/onca/xml3?t=popcornmonste2-20&dev-t=DSB0XDDW1GQ3S&=&mode=&type=&page=&offer=&f=xml");
      NetworkHandling.createRemoteTextFile(evoSuiteURL0, "I&2y`3f%()");
      File file0 = fileUtil0.downloadGenericSearchFile("", "", "", "", "", "");
      assertNull(file0);
  }

  /**
  //Test case number: 20
  /*Coverage entropy=1.455848709151796
  */
  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      EvoSuiteURL evoSuiteURL0 = new EvoSuiteURL("http://xml.amazon.net/onca/xml3?t=popcornmonste2-20&dev-t=DSB0XDDW1GQ3S&AsinSearch=V8'@&type=V8'@&offerpage=V8'@&offer=V8'@&f=xml");
      NetworkHandling.createRemoteTextFile(evoSuiteURL0, "V8'@");
      FileUtil fileUtil0 = new FileUtil();
      FileUtil fileUtil1 = new FileUtil();
      File file0 = fileUtil1.getASINFile("V8'@", "V8'@", "V8'@", "V8'@");
      assertNull(file0);
  }

  /**
  //Test case number: 21
  /*Coverage entropy=0.4444444444444445
  */
  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      EvoSuiteURL evoSuiteURL0 = new EvoSuiteURL("http://xml.amazon.net/onca/xml3?t=popcornmonste2-20&dev-t=DSB0XDDW1GQ3S&AsinSearch=V8'@&type=V8'@&offerpage=V8'@&offer=V8'@&f=xml");
      NetworkHandling.createRemoteTextFile(evoSuiteURL0, "V8'@");
      FileUtil fileUtil0 = new FileUtil();
      fileUtil0.downloadOneASINFile("V8'@", "V8'@", "V8'@", "V8'@", "V8'@");
      FileInputStream fileInputStream0 = fileUtil0.fetchKeywordSearchFile("V8'@", "V8'@", "V8'@", "V8'@");
      assertNull(fileInputStream0);
  }

  /**
  //Test case number: 22
  /*Coverage entropy=1.0365141682948127
  */
  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      EvoSuiteURL evoSuiteURL0 = new EvoSuiteURL("http://xml.amazon.net/onca/xml3?t=popcornmonste2-20&dev-t=DSB0XDDW1GQ3S&BrowseNodeSearch=V8'@&mode=V8'@&type=lite&page=V8'@&offer=new&f=xml");
      NetworkHandling.createRemoteTextFile(evoSuiteURL0, "V8'@");
      FileUtil fileUtil0 = new FileUtil();
      boolean boolean0 = fileUtil0.downloadBrowseNodeFile("V8'@", "V8'@", "V8'@", "V8'@");
      assertFalse(boolean0);
  }

  /**
  //Test case number: 23
  /*Coverage entropy=1.166831391086261
  */
  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("/^FX07176FAQTQ<K_^FX07176FAQTQ<K_^FX07176FAQTQ<K_^FX07176FAQTQ<K.XML");
      FileSystemHandling.appendLineToFile(evoSuiteFile0, "c_");
      fileUtil0.fetchSimilarItems("c_", "c_");
      FileInputStream fileInputStream0 = fileUtil0.fetchASINFile("^Fx07176faqTQ<K", "^Fx07176faqTQ<K", "^Fx07176faqTQ<K", "^Fx07176faqTQ<K");
      assertEquals(3, fileInputStream0.available());
  }

  /**
  //Test case number: 24
  /*Coverage entropy=0.42857142857142855
  */
  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      EvoSuiteURL evoSuiteURL0 = new EvoSuiteURL("http://xml.amazon.net/onca/xml3?t=popcornmonste2-20&dev-t=DSB0XDDW1GQ3S&BrowseNodeSearch=V8'@&mode=V8'@&type=lite&page=V8'@&offer=new&f=xml");
      NetworkHandling.createRemoteTextFile(evoSuiteURL0, "V8'@");
      FileUtil fileUtil0 = new FileUtil();
      File file0 = fileUtil0.getBrowseNodeFile("V8'@", "V8'@", "V8'@");
      assertNull(file0);
  }

  /**
  //Test case number: 25
  /*Coverage entropy=1.5652789553347763
  */
  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("/A@AZONSERVSRURL_A@AZONSERVSRURL_A@AZONSERVSRURL.XML");
      FileSystemHandling.createFolder(evoSuiteFile0);
      fileUtil0.fetchBNFile("a@azonServSrURL", "a@azonServSrURL", "a@azonServSrURL");
      File file0 = fileUtil0.downloadBlendedSearchFile("a@azonServSrURL", "a@azonServSrURL");
      assertNull(file0);
  }

  /**
  //Test case number: 26
  /*Coverage entropy=0.47058823529411764
  */
  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("/AMAZONSERVERURL_AMAZONSERVERURL_7`HR]D^6AT4X7:8.XML");
      FileSystemHandling.appendStringToFile(evoSuiteFile0, "V8'@");
      FileUtil fileUtil0 = new FileUtil();
      fileUtil0.fetchBNFile("amazonServerURL", "amazonServerURL", "7`HR]D^6AT4x7:8");
      FileInputStream fileInputStream0 = fileUtil0.fetchKeywordSearchFile("V8'@", "7`HR]D^6AT4x7:8", "V8'@", "V8'@");
      assertNull(fileInputStream0);
  }

  /**
  //Test case number: 27
  /*Coverage entropy=1.0931471805599453
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
      MockFile mockFile0 = new MockFile("yCDaDzn9'':}", "yCDaDzn9'':}");
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
      fileUtil0.deleteFile("");
  }

  /**
  //Test case number: 30
  /*Coverage entropy=1.6868977693384444
  */
  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      FileInputStream fileInputStream0 = fileUtil0.fetchASINFile("<|,e_:[bE^D[>", "<|,e_:[bE^D[>", "T", "<|,e_:[bE^D[>");
      assertNull(fileInputStream0);
  }

  /**
  //Test case number: 31
  /*Coverage entropy=1.0931471805599453
  */
  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
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
  //Test case number: 32
  /*Coverage entropy=1.4682921994113465
  */
  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      FileInputStream fileInputStream0 = fileUtil0.fetchKeywordSearchFile("_al=2s6^tP46#C?F@", "_al=2s6^tP46#C?F@", "", "_al=2s6^tP46#C?F@");
      assertNull(fileInputStream0);
  }

  /**
  //Test case number: 33
  /*Coverage entropy=1.0365141682948127
  */
  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      fileUtil0.renameFile("EPoEh", "");
  }

  /**
  //Test case number: 34
  /*Coverage entropy=0.4
  */
  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      fileUtil0.renameFile("", "");
  }

  /**
  //Test case number: 35
  /*Coverage entropy=1.0931471805599453
  */
  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      ArrayList<Object> arrayList0 = new ArrayList<Object>();
      boolean boolean0 = fileUtil0.downloadAccessoriesFile("", arrayList0, "");
      assertFalse(boolean0);
  }

  /**
  //Test case number: 36
  /*Coverage entropy=1.4682921994113465
  */
  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      FileInputStream fileInputStream0 = fileUtil0.fetchKeywordSearchFile(".xml", ".xml", ".xml", "_");
      assertNull(fileInputStream0);
  }

  /**
  //Test case number: 37
  /*Coverage entropy=0.42857142857142855
  */
  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      FileInputStream fileInputStream0 = fileUtil0.fetchKeywordSearchFile("6=@GN(", "", "", "6=@GN(");
      assertNull(fileInputStream0);
  }

  /**
  //Test case number: 38
  /*Coverage entropy=1.0931471805599453
  */
  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      boolean boolean0 = fileUtil0.downloadBrowseNodeFile("^Fx07176faqTQ<K", "^Fx07176faqTQ<K", "^Fx07176faqTQ<K", "^Fx07176faqTQ<K");
      assertFalse(boolean0);
  }

  /**
  //Test case number: 39
  /*Coverage entropy=1.4682921994113465
  */
  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      FileInputStream fileInputStream0 = fileUtil0.fetchGenericSearchFile("UdWJ/cEyELr[BJ3zy", "UdWJ/cEyELr[BJ3zy", "`_4@.)Sugz2n=~", "`_4@.)Sugz2n=~", "UdWJ/cEyELr[BJ3zy", "`_4@.)Sugz2n=~");
      assertNull(fileInputStream0);
  }

  /**
  //Test case number: 40
  /*Coverage entropy=1.6868977693384446
  */
  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      FileInputStream fileInputStream0 = fileUtil0.fetchBNFile("V8'@", "V8'@", "_jNM&kZ#veU");
      assertNull(fileInputStream0);
  }

  /**
  //Test case number: 41
  /*Coverage entropy=1.6868977693384446
  */
  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      FileInputStream fileInputStream0 = fileUtil0.fetchBNFile("", "H", "H");
      assertNull(fileInputStream0);
  }

  /**
  //Test case number: 42
  /*Coverage entropy=1.3788419678046633
  */
  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      File file0 = fileUtil0.getBrowseNodeFile("TBk])w]!", "TBk])w]!", "V8'@");
      assertNull(file0);
  }

  /**
  //Test case number: 43
  /*Coverage entropy=1.3788419678046633
  */
  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      File file0 = fileUtil0.getBrowseNodeFile("~ThRhGc!]GYT", "f=xml", "f=xml");
      assertNull(file0);
  }

  /**
  //Test case number: 44
  /*Coverage entropy=1.1375916250043898
  */
  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      FileInputStream fileInputStream0 = fileUtil0.fetchSimilarItems(">3micXg0:U0<e!", ")-2y%\"Cg?_$Y'F");
      assertNull(fileInputStream0);
  }

  /**
  //Test case number: 45
  /*Coverage entropy=1.4682921994113465
  */
  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      FileInputStream fileInputStream0 = fileUtil0.fetchThirdPartySearchFile("7`HD^6AT4x7:8", "6m.afonServerRL", "7`HD^6AT4x7:8", "7`HD^6AT4x7:8");
      assertNull(fileInputStream0);
  }

  /**
  //Test case number: 46
  /*Coverage entropy=1.4682921994113465
  */
  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      FileInputStream fileInputStream0 = fileUtil0.fetchThirdPartySearchFile("", "", "1", "1");
      assertNull(fileInputStream0);
  }

  /**
  //Test case number: 47
  /*Coverage entropy=1.4682921994113465
  */
  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      FileInputStream fileInputStream0 = fileUtil0.fetchThirdPartySearchFile("V8'@", "V8'@", "V8'@", (String) null);
      assertNull(fileInputStream0);
  }

  /**
  //Test case number: 48
  /*Coverage entropy=0.4
  */
  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      File file0 = fileUtil0.downloadThirdPartySearchFile("", " qqAp]GFDg>R>(Ie.", "", "");
      assertNull(file0);
  }

  /**
  //Test case number: 49
  /*Coverage entropy=1.0365141682948127
  */
  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      File file0 = fileUtil0.downloadThirdPartySearchFile(" qqAp]GFDg>R>(=Ie.", "V8'@", "V8'@", "V8'@");
      assertNull(file0);
  }

  /**
  //Test case number: 50
  /*Coverage entropy=0.4
  */
  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      boolean boolean0 = fileUtil0.downloadSimilaritesFile("}}Jp\"Vmo2.D.b@@", "}}Jp\"Vmo2.D.b@@", "}}Jp\"Vmo2.D.b@@");
      assertFalse(boolean0);
  }

  /**
  //Test case number: 51
  /*Coverage entropy=0.4444444444444445
  */
  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      ArrayList<Object> arrayList0 = new ArrayList<Object>();
      FileInputStream fileInputStream0 = fileUtil0.fetchAccessories(",", arrayList0);
      assertNull(fileInputStream0);
  }

  /**
  //Test case number: 52
  /*Coverage entropy=0.4
  */
  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      fileUtil0.deleteFile("|T{yJ7|#9=");
  }

  /**
  //Test case number: 53
  /*Coverage entropy=1.0365141682948127
  */
  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      File file0 = fileUtil0.downloadGenericSearchFile("0ma@O&Q_b", "0ma@O&Q_b", "6yB<kB,UjWAdT", "0ma@O&Q_b", "0ma@O&Q_b", "0ma@O&Q_b");
      assertNull(file0);
  }

  /**
  //Test case number: 54
  /*Coverage entropy=1.4682921994113465
  */
  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      FileInputStream fileInputStream0 = fileUtil0.fetchGenericSearchFile("J=QO})$Tkq$3:K", "DViqS~jB{?r848DOav", "DViqS~jB{?r848DOav", "J=QO})$Tkq$3:K", "J=QO})$Tkq$3:K", "DViqS~jB{?r848DOav");
      assertNull(fileInputStream0);
  }

  /**
  //Test case number: 55
  /*Coverage entropy=1.4682921994113465
  */
  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      FileInputStream fileInputStream0 = fileUtil0.fetchGenericSearchFile("V8'@", "V8'@", "V8'@", "V8'@", ">[[%Am8", ">[[%Am8");
      assertNull(fileInputStream0);
  }

  /**
  //Test case number: 56
  /*Coverage entropy=0.42857142857142855
  */
  @Test(timeout = 4000)
  public void test56()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      FileInputStream fileInputStream0 = fileUtil0.fetchGenericSearchFile(">3micXg0:U0<e!", "", "", "", "", "");
      assertNull(fileInputStream0);
  }

  /**
  //Test case number: 57
  /*Coverage entropy=1.3788419678046633
  */
  @Test(timeout = 4000)
  public void test57()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      File file0 = fileUtil0.getASINFile((String) null, (String) null, "k_", "k_");
      assertNull(file0);
  }

  /**
  //Test case number: 58
  /*Coverage entropy=1.6868977693384444
  */
  @Test(timeout = 4000)
  public void test58()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      FileInputStream fileInputStream0 = fileUtil0.fetchASINFile("dev-t=", "", "dev-t=", "dev-t=");
      assertNull(fileInputStream0);
  }

  /**
  //Test case number: 59
  /*Coverage entropy=0.4444444444444445
  */
  @Test(timeout = 4000)
  public void test59()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      FileInputStream fileInputStream0 = fileUtil0.fetchASINFile("V8'@", "V8'@", "V8'@", "");
      assertNull(fileInputStream0);
  }

  /**
  //Test case number: 60
  /*Coverage entropy=1.0931471805599453
  */
  @Test(timeout = 4000)
  public void test60()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      boolean boolean0 = fileUtil0.downloadOneASINFile("V8'@", "", "", "V8'@", "");
      assertFalse(boolean0);
  }
}
