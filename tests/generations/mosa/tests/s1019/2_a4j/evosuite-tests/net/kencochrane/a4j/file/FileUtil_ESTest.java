/*
 * This file was automatically generated by EvoSuite
 * Thu Nov 14 18:56:03 GMT 2019
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
  /*Coverage entropy=2.4259101490553134
  */
  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("/S_NULL.XML");
      byte[] byteArray0 = new byte[0];
      FileSystemHandling.appendDataToFile(evoSuiteFile0, byteArray0);
      FileUtil fileUtil0 = new FileUtil();
      fileUtil0.fetchThirdPartySearchFile((String) null, "]f7$f4caqe:", (String) null, "]f7$f4caqe:");
      FileInputStream fileInputStream0 = fileUtil0.fetchSimilarItems((String) null, (String) null);
      assertNotNull(fileInputStream0);
      
      FileSystemHandling.shouldThrowIOException(evoSuiteFile0);
      File file0 = fileUtil0.getSimilarItems((String) null, "");
      assertFalse(file0.isDirectory());
  }

  /**
  //Test case number: 1
  /*Coverage entropy=0.4444444444444445
  */
  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      EvoSuiteURL evoSuiteURL0 = new EvoSuiteURL("http://xml.amazon.net/onca/xml3?t=popcornmonste2-20&dev-t=DSB0XDDW1GQ3S&AsinSearch=Ae?aWK+}R'_<_,N&type=3rd_&offerpage=3rd_&offer=Ae?aWK+}R'_<_,N&f=xml");
      NetworkHandling.createRemoteTextFile(evoSuiteURL0, ",1,*33lebfssj,C%,.");
      FileInputStream fileInputStream0 = fileUtil0.fetchASINFile("Ae?aWK+}R'_<_,N", "3rd_", "Ae?aWK+}R'_<_,N", "3rd_");
      assertNull(fileInputStream0);
  }

  /**
  //Test case number: 2
  /*Coverage entropy=1.8662943611198906
  */
  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("/S_NULL.XML");
      byte[] byteArray0 = new byte[6];
      byteArray0[3] = (byte) (-115);
      byteArray0[2] = (byte)92;
      byteArray0[4] = (byte) (-93);
      byteArray0[5] = (byte)92;
      FileSystemHandling.createFolder(evoSuiteFile0);
      fileUtil0.fetchSimilarItems((String) null, (String) null);
      fileUtil0.fetchSimilarItems((String) null, "67&Jqq\"\"0|y");
      File file0 = fileUtil0.downloadKeywordSearchFile((String) null, "", "67&Jqq\"\"0|y", "a_");
      assertNull(file0);
  }

  /**
  //Test case number: 3
  /*Coverage entropy=0.4
  */
  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      EvoSuiteURL evoSuiteURL0 = new EvoSuiteURL("http://xml.amazon.net/onca/xml3?t=popcornmonste2-20&dev-t=DSB0XDDW1GQ3S&KeywordSearch=&mode=&type=&page=&f=xml");
      NetworkHandling.createRemoteTextFile(evoSuiteURL0, "=hZ[1KN-,oUe%?p9#");
      FileUtil fileUtil0 = new FileUtil();
      File file0 = fileUtil0.downloadKeywordSearchFile("", "", "", "");
      assertNull(file0);
  }

  /**
  //Test case number: 4
  /*Coverage entropy=2.4164983843494308
  */
  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("/NULL__NULL_.XML");
      FileSystemHandling.appendLineToFile(evoSuiteFile0, "Ox[sD");
      FileUtil fileUtil0 = new FileUtil();
      fileUtil0.fetchASINFile((String) null, (String) null, "", "");
      FileInputStream fileInputStream0 = fileUtil0.fetchKeywordSearchFile("", "lite", "", "");
      assertNull(fileInputStream0);
  }

  /**
  //Test case number: 5
  /*Coverage entropy=1.0365141682948127
  */
  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      EvoSuiteURL evoSuiteURL0 = new EvoSuiteURL("http://xml.amazon.net/onca/xml3?t=popcornmonste2-20&dev-t=DSB0XDDW1GQ3S&BrowseNodeSearch=JDyys|xzX`7ubXS&mode=&type=lite&page=c_&offer=new&f=xml");
      NetworkHandling.createRemoteTextFile(evoSuiteURL0, "new");
      boolean boolean0 = fileUtil0.downloadBrowseNodeFile("", "JDyys|xzX`7ubXS", "c_", "JDyys|xzX`7ubXS");
      assertFalse(boolean0);
  }

  /**
  //Test case number: 6
  /*Coverage entropy=2.40439823421475
  */
  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("/S_NULL.XML");
      byte[] byteArray0 = new byte[0];
      FileSystemHandling.appendDataToFile(evoSuiteFile0, byteArray0);
      FileUtil fileUtil0 = new FileUtil();
      fileUtil0.getBrowseNodeFile(".xml", "/", "_");
      EvoSuiteFile evoSuiteFile1 = new EvoSuiteFile("/S_.XML");
      FileSystemHandling.appendStringToFile(evoSuiteFile1, "/");
      FileInputStream fileInputStream0 = fileUtil0.fetchSimilarItems("", "67&Jqq\"\"0|y");
      assertEquals(1, fileInputStream0.available());
  }

  /**
  //Test case number: 7
  /*Coverage entropy=2.1217347121875214
  */
  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("/S_NULL.XML");
      byte[] byteArray0 = new byte[0];
      FileSystemHandling.appendDataToFile(evoSuiteFile0, byteArray0);
      FileUtil fileUtil0 = new FileUtil();
      FileUtil fileUtil1 = new FileUtil();
      FileInputStream fileInputStream0 = fileUtil1.fetchSimilarItems((String) null, "");
      FileInputStream fileInputStream1 = fileUtil0.fetchSimilarItems((String) null, (String) null);
      assertFalse(fileInputStream1.equals((Object)fileInputStream0));
  }

  /**
  //Test case number: 8
  /*Coverage entropy=1.159813847226612
  */
  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("/S_NULL.XML");
      byte[] byteArray0 = new byte[0];
      FileSystemHandling.appendDataToFile(evoSuiteFile0, byteArray0);
      FileUtil fileUtil0 = new FileUtil();
      fileUtil0.fetchSimilarItems((String) null, (String) null);
      File file0 = fileUtil0.downloadBlendedSearchFile((String) null, "");
      assertNull(file0);
  }

  /**
  //Test case number: 9
  /*Coverage entropy=2.4164983843494308
  */
  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("/A_JDYYS|XZX`7UBXS.XML");
      byte[] byteArray0 = new byte[57];
      byteArray0[3] = (byte)0;
      FileSystemHandling.createFolder(evoSuiteFile0);
      FileSystemHandling.appendLineToFile(evoSuiteFile0, "'Fj]'yRQuMK|\"Qy_n#");
      fileUtil0.downloadOneASINFile("o7fWh{G,", "n;me$", "&t=", " DN_-;2`", "ts_");
      FileSystemHandling.appendStringToFile(evoSuiteFile0, "8WyP?D\"");
      FileSystemHandling.appendLineToFile(evoSuiteFile0, "%IEhI#qhOqX'H*");
      FileSystemHandling.appendDataToFile(evoSuiteFile0, byteArray0);
      ArrayList<Integer> arrayList0 = new ArrayList<Integer>();
      fileUtil0.getAccessories("JDyys|xzX`7ubXS", arrayList0);
      FileInputStream fileInputStream0 = fileUtil0.fetchGenericSearchFile("8WyP?D\"", "%IEhI#qhOqX'H*", "8WyP?D\"", "4VdnY^zUqLv&|3gW1", "5+lTDN]s7^N", "lite");
      assertNull(fileInputStream0);
  }

  /**
  //Test case number: 10
  /*Coverage entropy=1.159813847226612
  */
  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("/AE?AWK+}R'_<_,N_AE?AWK+}R'_<_,N_3RD__3RD_.XML");
      FileSystemHandling.appendStringToFile(evoSuiteFile0, "");
      FileSystemHandling.createFolder(evoSuiteFile0);
      FileUtil fileUtil0 = new FileUtil();
      fileUtil0.fetchASINFile("Ae?aWK+}R'_<_,N", "3rd_", "Ae?aWK+}R'_<_,N", "3rd_");
      fileUtil0.deleteFile("");
  }

  /**
  //Test case number: 11
  /*Coverage entropy=1.1546856420984069
  */
  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("/AE?AWK+}R'_<_,N_AE?AWK+}R'_<_,N_3RD__3RD_.XML");
      FileSystemHandling.appendLineToFile(evoSuiteFile0, "3rd_");
      FileUtil fileUtil0 = new FileUtil();
      FileInputStream fileInputStream0 = fileUtil0.fetchASINFile("Ae?aWK+}R'_<_,N", "3rd_", "Ae?aWK+}R'_<_,N", "3rd_");
      assertEquals(5, fileInputStream0.available());
  }

  /**
  //Test case number: 12
  /*Coverage entropy=0.42857142857142855
  */
  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      EvoSuiteURL evoSuiteURL0 = new EvoSuiteURL("http://xml.amazon.net/onca/xml3?t=popcornmonste2-20&dev-t=DSB0XDDW1GQ3S&AsinSearch=&type=&offerpage=&offer=&f=xml");
      NetworkHandling.createRemoteTextFile(evoSuiteURL0, "");
      FileUtil fileUtil0 = new FileUtil();
      File file0 = fileUtil0.getASINFile("", "", "", "");
      assertNull(file0);
  }

  /**
  //Test case number: 13
  /*Coverage entropy=1.1546856420984069
  */
  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("/AE?AWK+}R'_<_,N_AE?AWK+}R'_<_,N_3RD__3RD_.XML");
      FileSystemHandling.createFolder(evoSuiteFile0);
      FileUtil fileUtil0 = new FileUtil();
      FileInputStream fileInputStream0 = fileUtil0.fetchASINFile("Ae?aWK+}R'_<_,N", "3rd_", "Ae?aWK+}R'_<_,N", "3rd_");
      assertNull(fileInputStream0);
  }

  /**
  //Test case number: 14
  /*Coverage entropy=1.543056733112554
  */
  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      fileUtil0.getASINFile("", "", "", "");
      fileUtil0.renameFile("/", "/");
  }

  /**
  //Test case number: 15
  /*Coverage entropy=2.40439823421475
  */
  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("/A_NULL.XML");
      FileSystemHandling.appendStringToFile(evoSuiteFile0, "#,4>W9xDF)j!G~x%r{3");
      FileSystemHandling.setPermissions(evoSuiteFile0, false, false, false);
      ArrayList<Integer> arrayList0 = new ArrayList<Integer>();
      Object[] objectArray0 = new Object[5];
      objectArray0[0] = (Object) evoSuiteFile0;
      objectArray0[1] = (Object) arrayList0;
      objectArray0[2] = (Object) "#,4>W9xDF)j!G~x%r{3";
      objectArray0[3] = (Object) evoSuiteFile0;
      objectArray0[4] = (Object) fileUtil0;
      arrayList0.toArray(objectArray0);
      fileUtil0.getAccessories((String) null, arrayList0);
      FileInputStream fileInputStream0 = fileUtil0.fetchASINFile("cacheLife", (String) null, "", "");
      assertNull(fileInputStream0);
  }

  /**
  //Test case number: 16
  /*Coverage entropy=1.4048159937786893
  */
  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("/A_NULL.XML");
      FileSystemHandling.appendStringToFile(evoSuiteFile0, "#,4>W9xDF)j!G~x%r{3");
      FileSystemHandling.setPermissions(evoSuiteFile0, false, true, false);
      ArrayList<Integer> arrayList0 = new ArrayList<Integer>();
      File file0 = fileUtil0.getAccessories((String) null, arrayList0);
      assertEquals(19L, file0.length());
      assertNotNull(file0);
  }

  /**
  //Test case number: 17
  /*Coverage entropy=2.1377734006731925
  */
  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("/__.XML");
      byte[] byteArray0 = new byte[2];
      byteArray0[1] = (byte) (-1);
      FileSystemHandling.appendDataToFile(evoSuiteFile0, byteArray0);
      fileUtil0.downloadKeywordSearchFile("o$d", "o$d", "o$d", "o$d");
      File file0 = fileUtil0.getBrowseNodeFile(" ", "", "");
      assertNotNull(file0);
      assertEquals(2L, file0.length());
  }

  /**
  //Test case number: 18
  /*Coverage entropy=0.4
  */
  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      EvoSuiteURL evoSuiteURL0 = new EvoSuiteURL("http://xml.amazon.net/onca/xml3?t=popcornmonste2-20&dev-t=DSB0XDDW1GQ3S&SellerSearch=:Xqa&type=&page=&offerstatus=&f=xml");
      NetworkHandling.createRemoteTextFile(evoSuiteURL0, "%IEh[I#qhOqX'HM");
      File file0 = fileUtil0.downloadThirdPartySearchFile(":Xqa", "", "", "");
      assertNull(file0);
  }

  /**
  //Test case number: 19
  /*Coverage entropy=1.166831391086261
  */
  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("/1_]FC<}_1.XML");
      FileSystemHandling.appendStringToFile(evoSuiteFile0, "K");
      fileUtil0.fetchSimilarItems("1", "K");
      FileInputStream fileInputStream0 = fileUtil0.fetchBNFile("1", "]Fc<}", "1");
      assertEquals(1, fileInputStream0.available());
  }

  /**
  //Test case number: 20
  /*Coverage entropy=1.1546856420984069
  */
  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("/__.XML");
      FileSystemHandling.createFolder(evoSuiteFile0);
      FileInputStream fileInputStream0 = fileUtil0.fetchBNFile("", "", "");
      assertNull(fileInputStream0);
  }

  /**
  //Test case number: 21
  /*Coverage entropy=1.1476926351053998
  */
  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("/__.XML");
      FileSystemHandling.createFolder(evoSuiteFile0);
      File file0 = fileUtil0.getBrowseNodeFile("", "", "");
      assertTrue(file0.canExecute());
      assertNotNull(file0);
      assertEquals("__.XML", file0.getName());
  }

  /**
  //Test case number: 22
  /*Coverage entropy=2.085628388624577
  */
  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("/A_JDYYS|XZX`7UBXS.XML");
      byte[] byteArray0 = new byte[4];
      byteArray0[0] = (byte)60;
      byteArray0[2] = (byte)0;
      byteArray0[3] = (byte)0;
      FileSystemHandling.createFolder(evoSuiteFile0);
      FileSystemHandling.appendDataToFile(evoSuiteFile0, byteArray0);
      fileUtil0.getSimilarItems((String) null, (String) null);
      ArrayList<Integer> arrayList0 = new ArrayList<Integer>();
      fileUtil0.fetchAccessories("JDyys|xzX`7ubXS", arrayList0);
      Integer integer0 = new Integer((byte)0);
      FileInputStream fileInputStream0 = fileUtil0.fetchThirdPartySearchFile((String) null, "b_", "JDyys|xzX`7ubXS", (String) null);
      assertNull(fileInputStream0);
  }

  /**
  //Test case number: 23
  /*Coverage entropy=0.42857142857142855
  */
  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      EvoSuiteURL evoSuiteURL0 = new EvoSuiteURL("http://xml.amazon.net/onca/xml3?t=popcornmonste2-20&dev-t=DSB0XDDW1GQ3S&BrowseNodeSearch=null&mode=null&type=lite&page=null&offer=new&f=xml");
      NetworkHandling.createRemoteTextFile(evoSuiteURL0, "'^w~x4M2Ba:7)E\"]'Z_)");
      FileUtil fileUtil0 = new FileUtil();
      File file0 = fileUtil0.getBrowseNodeFile((String) null, (String) null, (String) null);
      assertNull(file0);
  }

  /**
  //Test case number: 24
  /*Coverage entropy=0.4
  */
  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      EvoSuiteURL evoSuiteURL0 = new EvoSuiteURL("http://xml.amazon.net/onca/xml3?t=popcornmonste2-20&dev-t=DSB0XDDW1GQ3S&SimilaritySearch=null&type=lite&offerpage=null&offer=all&f=xml");
      NetworkHandling.createRemoteTextFile(evoSuiteURL0, "ShoppingCart=remove&f=xml&dev-t=");
      FileUtil fileUtil0 = new FileUtil();
      boolean boolean0 = fileUtil0.downloadSimilaritesFile((String) null, (String) null, "ShoppingCart=remove&f=xml&dev-t=");
      assertFalse(boolean0);
  }

  /**
  //Test case number: 25
  /*Coverage entropy=0.4
  */
  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      EvoSuiteURL evoSuiteURL0 = new EvoSuiteURL("http://xml.amazon.net/onca/xml3?t=popcornmonste2-20&dev-t=DSB0XDDW1GQ3S&SimilaritySearch=null&type=lite&offerpage=null&offer=all&f=xml");
      NetworkHandling.createRemoteTextFile(evoSuiteURL0, "%IEhI#qhOqX'H*");
      boolean boolean0 = fileUtil0.downloadSimilaritesFile((String) null, (String) null, (String) null);
      assertFalse(boolean0);
  }

  /**
  //Test case number: 26
  /*Coverage entropy=0.4
  */
  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      EvoSuiteURL evoSuiteURL0 = new EvoSuiteURL("http://xml.amazon.net/onca/xml3?t=popcornmonste2-20&dev-t=DSB0XDDW1GQ3S& J=+J&mode=&type=&page= J&offer= J&f=xml");
      NetworkHandling.createRemoteTextFile(evoSuiteURL0, ")r0b'*qTSo3v)Fv(r7");
      File file0 = fileUtil0.downloadGenericSearchFile(" J", " J", "", "", " J", " J");
      assertNull(file0);
  }

  /**
  //Test case number: 27
  /*Coverage entropy=0.4
  */
  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      EvoSuiteURL evoSuiteURL0 = new EvoSuiteURL("http://xml.amazon.net/onca/xml3?t=popcornmonste2-20&dev-t=DSB0XDDW1GQ3S& J=+J&mode=&type=&page= J&offer= J&f=xml");
      NetworkHandling.createRemoteTextFile(evoSuiteURL0, "");
      File file0 = fileUtil0.downloadGenericSearchFile(" J", " J", "", "", " J", " J");
      assertNull(file0);
  }

  /**
  //Test case number: 28
  /*Coverage entropy=1.1546856420984069
  */
  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("/A_JDYYS|XZX`7UBXS.XML");
      byte[] byteArray0 = new byte[23];
      byteArray0[2] = (byte)0;
      byteArray0[3] = (byte)0;
      FileSystemHandling.appendDataToFile(evoSuiteFile0, byteArray0);
      ArrayList<Integer> arrayList0 = new ArrayList<Integer>();
      Integer integer0 = new Integer((byte)0);
      arrayList0.add(integer0);
      FileInputStream fileInputStream0 = fileUtil0.fetchAccessories("JDyys|xzX`7ubXS", arrayList0);
      assertEquals(23, fileInputStream0.available());
  }

  /**
  //Test case number: 29
  /*Coverage entropy=1.1546856420984069
  */
  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("/A_JDYYS|XZX`7UBXS.XML");
      FileSystemHandling.appendStringToFile(evoSuiteFile0, "|y_?_F");
      FileSystemHandling.appendLineToFile(evoSuiteFile0, "|y_?_F");
      ArrayList<Integer> arrayList0 = new ArrayList<Integer>();
      fileUtil0.getAccessories("JDyys|xzX`7ubXS", arrayList0);
      File file0 = fileUtil0.downloadGenericSearchFile("JDyys|xzX`7ubXS", "JDyys|xzX`7ubXS", "|y_?_F", "|y_?_F", "JDyys|xzX`7ubXS", "|y_?_F");
      assertNull(file0);
  }

  /**
  //Test case number: 30
  /*Coverage entropy=1.0931471805599453
  */
  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
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
  //Test case number: 31
  /*Coverage entropy=1.0365141682948127
  */
  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      File file0 = MockFile.createTempFile("}h/?B", "}h/?B");
      boolean boolean0 = fileUtil0.isAgeGood(file0);
      assertFalse(boolean0);
  }

  /**
  //Test case number: 32
  /*Coverage entropy=0.4
  */
  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      MockFile mockFile0 = new MockFile(")(3t");
      boolean boolean0 = fileUtil0.isAgeGood(mockFile0);
      assertFalse(boolean0);
  }

  /**
  //Test case number: 33
  /*Coverage entropy=0.4
  */
  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      File file0 = fileUtil0.downloadCart(") ;V8(3t");
      assertNull(file0);
  }

  /**
  //Test case number: 34
  /*Coverage entropy=1.0931471805599453
  */
  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
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
  //Test case number: 35
  /*Coverage entropy=0.4
  */
  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      fileUtil0.renameFile("", "");
  }

  /**
  //Test case number: 36
  /*Coverage entropy=1.4682921994113465
  */
  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      FileInputStream fileInputStream0 = fileUtil0.fetchBlendedSearchFile("", "B[JS6@)3tz~cp&");
      assertNull(fileInputStream0);
  }

  /**
  //Test case number: 37
  /*Coverage entropy=0.4
  */
  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      fileUtil0.renameFile("G1YiNh", "");
  }

  /**
  //Test case number: 38
  /*Coverage entropy=1.4682921994113465
  */
  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      FileInputStream fileInputStream0 = fileUtil0.fetchThirdPartySearchFile("", "", "", "zII$>w");
      assertNull(fileInputStream0);
  }

  /**
  //Test case number: 39
  /*Coverage entropy=1.0365141682948127
  */
  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      File file0 = fileUtil0.downloadThirdPartySearchFile((String) null, (String) null, ">j&rt!4rh", ">j&rt!4rh");
      assertNull(file0);
  }

  /**
  //Test case number: 40
  /*Coverage entropy=1.6868977693384446
  */
  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      FileInputStream fileInputStream0 = fileUtil0.fetchBNFile("F}1", "F}1", "tO\"q{");
      assertNull(fileInputStream0);
  }

  /**
  //Test case number: 41
  /*Coverage entropy=1.6868977693384446
  */
  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      FileInputStream fileInputStream0 = fileUtil0.fetchBNFile("OA?6Upi|COx;gZ", "&", "OA?6Upi|COx;gZ");
      assertNull(fileInputStream0);
  }

  /**
  //Test case number: 42
  /*Coverage entropy=1.0365141682948127
  */
  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      fileUtil0.deleteFile("&Asin.");
  }

  /**
  //Test case number: 43
  /*Coverage entropy=1.1217186091313738
  */
  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      FileInputStream fileInputStream0 = fileUtil0.fetchKeywordSearchFile(") ;V8(3t", ") ;V8(3t", "h%Mom{f\"Ly_9", ") ;V8(3t");
      assertNull(fileInputStream0);
  }

  /**
  //Test case number: 44
  /*Coverage entropy=1.0931471805599453
  */
  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      ArrayList<Object> arrayList0 = new ArrayList<Object>();
      boolean boolean0 = fileUtil0.downloadAccessoriesFile((String) null, arrayList0, (String) null);
      assertFalse(boolean0);
  }

  /**
  //Test case number: 45
  /*Coverage entropy=1.4682921994113465
  */
  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      FileInputStream fileInputStream0 = fileUtil0.fetchGenericSearchFile("HL", "HL", "W7(JDffdOY*F=f", "W7(JDffdOY*F=f", "W7(JDffdOY*F=f", "HL");
      assertNull(fileInputStream0);
  }

  /**
  //Test case number: 46
  /*Coverage entropy=1.4682921994113465
  */
  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      FileInputStream fileInputStream0 = fileUtil0.fetchGenericSearchFile((String) null, "", "", (String) null, (String) null, (String) null);
      assertNull(fileInputStream0);
  }

  /**
  //Test case number: 47
  /*Coverage entropy=1.0931471805599453
  */
  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      boolean boolean0 = fileUtil0.downloadBrowseNodeFile("all", "", "all", "");
      assertFalse(boolean0);
  }

  /**
  //Test case number: 48
  /*Coverage entropy=1.3788419678046633
  */
  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      File file0 = fileUtil0.getBrowseNodeFile("8TgYAZ", "8TgYAZ", (String) null);
      assertNull(file0);
  }

  /**
  //Test case number: 49
  /*Coverage entropy=1.6868977693384444
  */
  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      FileInputStream fileInputStream0 = fileUtil0.fetchASINFile("Ae?aWK+}R'_<_,N", "3rd_", "Ae?aWK+}R'_<_,N", "3rd_");
      assertNull(fileInputStream0);
  }

  /**
  //Test case number: 50
  /*Coverage entropy=0.4444444444444445
  */
  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      FileInputStream fileInputStream0 = fileUtil0.fetchASINFile("6VH6", "6VH6", "6VH6", "");
      assertNull(fileInputStream0);
  }

  /**
  //Test case number: 51
  /*Coverage entropy=1.3788419678046633
  */
  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      File file0 = fileUtil0.getASINFile("}T=H]j#MOr*-", "}T=H]j#MOr*-", "", "");
      assertNull(file0);
  }

  /**
  //Test case number: 52
  /*Coverage entropy=0.4
  */
  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      boolean boolean0 = fileUtil0.isAgeGood((File) null);
      assertFalse(boolean0);
  }

  /**
  //Test case number: 53
  /*Coverage entropy=1.3788419678046633
  */
  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      File file0 = fileUtil0.getAccessories(") ;V8(3t", (ArrayList) null);
      assertNull(file0);
  }

  /**
  //Test case number: 54
  /*Coverage entropy=1.4682921994113465
  */
  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      FileInputStream fileInputStream0 = fileUtil0.fetchKeywordSearchFile("F", ") ;V8(3t", ") ;V8(3t", "F");
      assertNull(fileInputStream0);
  }

  /**
  //Test case number: 55
  /*Coverage entropy=1.4682921994113465
  */
  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      FileInputStream fileInputStream0 = fileUtil0.fetchKeywordSearchFile(") ;V8(3t", "cXOfH@6mjVU", ") ;V8(3t", "cXOfH@6mjVU");
      assertNull(fileInputStream0);
  }

  /**
  //Test case number: 56
  /*Coverage entropy=0.4444444444444445
  */
  @Test(timeout = 4000)
  public void test56()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      ArrayList<String> arrayList0 = new ArrayList<String>();
      FileInputStream fileInputStream0 = fileUtil0.fetchAccessories((String) null, arrayList0);
      assertNull(fileInputStream0);
  }
}
