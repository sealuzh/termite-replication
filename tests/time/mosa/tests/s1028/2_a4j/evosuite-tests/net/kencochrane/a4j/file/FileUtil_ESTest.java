/*
 * This file was automatically generated by EvoSuite
 * Thu Dec 05 11:31:15 GMT 2019
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
  /*Coverage entropy=1.856882596414008
  */
  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("/S_E[8O]#J_.XML");
      FileSystemHandling.appendLineToFile(evoSuiteFile0, "");
      fileUtil0.fetchGenericSearchFile("", "", "", "t_", "SL y@0", "t_");
      fileUtil0.downloadOneASINFile("", "SL y@0", "", "t_", "t_");
      File file0 = fileUtil0.getSimilarItems("E[8o]#J_", "THXIm&lOnOm");
      assertEquals(1L, file0.length());
      assertNotNull(file0);
  }

  /**
  //Test case number: 1
  /*Coverage entropy=1.166831391086261
  */
  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("/LTFH8_LTFH8_LTFH8_LTFH8.XML");
      FileSystemHandling.appendStringToFile(evoSuiteFile0, "AsinSearch");
      fileUtil0.downloadOneASINFile("", "", "", "B;KU", "ts_");
      fileUtil0.fetchASINFile("lTFH8", "lTFH8", "lTFH8", "lTFH8");
      FileInputStream fileInputStream0 = fileUtil0.fetchThirdPartySearchFile("lTFH8", "B;KU", "", "MCR'^+O.4[kY!aCF!L");
      assertNull(fileInputStream0);
  }

  /**
  //Test case number: 2
  /*Coverage entropy=2.1032731737259827
  */
  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("/NEW_CHEIWW*L_CHEIWW*L_NEW.XML");
      FileSystemHandling.createFolder(evoSuiteFile0);
      FileInputStream fileInputStream0 = fileUtil0.fetchASINFile("new", "CHeIWw*L", "CHeIWw*L", "new");
      assertNull(fileInputStream0);
  }

  /**
  //Test case number: 3
  /*Coverage entropy=1.925353930867566
  */
  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("/_ALL_ALL_ALL.XML");
      FileSystemHandling.appendLineToFile(evoSuiteFile0, "T?\"FPV8tLbX");
      File file0 = fileUtil0.getASINFile("", "all", "all", "all");
      assertEquals(13L, file0.length());
      assertNotNull(file0);
  }

  /**
  //Test case number: 4
  /*Coverage entropy=0.9623351446188083
  */
  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      EvoSuiteURL evoSuiteURL0 = new EvoSuiteURL("http://xml.amazon.net/onca/xml3?t=popcornmonste2-20&dev-t=DSB0XDDW1GQ3S&BlendedSearch=&type=&f=xml");
      NetworkHandling.createRemoteTextFile(evoSuiteURL0, "type=");
      File file0 = fileUtil0.downloadBlendedSearchFile("", "");
      assertNull(file0);
  }

  /**
  //Test case number: 5
  /*Coverage entropy=2.5447039735500123
  */
  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("/XZ)CG@L(:BOI _XZ)CG@L(:BOI _XZ)CG@L(:BOI _XZ)CG@L(:BOI .XML");
      FileSystemHandling.appendStringToFile(evoSuiteFile0, "r`+JfVV9`}");
      fileUtil0.fetchGenericSearchFile("r`+JfVV9`}", "c}V',n.Ox", "c}V',n.Ox", "c}V',n.Ox", "c}V',n.Ox", "c}V',n.Ox");
      FileSystemHandling.setPermissions(evoSuiteFile0, false, false, false);
      File file0 = fileUtil0.getASINFile("Xz)CG@l(:Boi ", "Xz)CG@l(:Boi ", "Xz)CG@l(:Boi ", "Xz)CG@l(:Boi ");
      file0.getAbsoluteFile();
      fileUtil0.isAgeGood(file0);
      File file1 = fileUtil0.getBrowseNodeFile("r`+JfVV9`}", "Xz)CG@l(:Boi ", "*x");
      assertNull(file1);
  }

  /**
  //Test case number: 6
  /*Coverage entropy=0.42857142857142855
  */
  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      EvoSuiteURL evoSuiteURL0 = new EvoSuiteURL("http://xml.amazon.net/onca/xml3?t=popcornmonste2-20&dev-t=DSB0XDDW1GQ3S&BrowseNodeSearch=ShoppingCart=modify&f=xml&dev-t=&mode=c}V',n.Ox&type=lite&page=e}-z+7Fb&tIzq4C~M}&offer=new&f=xml");
      NetworkHandling.createRemoteTextFile(evoSuiteURL0, "ShoppingCart=modify&f=xml&dev-t=");
      File file0 = fileUtil0.getBrowseNodeFile("c}V',n.Ox", "ShoppingCart=modify&f=xml&dev-t=", "e}-z+7Fb&tIzq4C~M}");
      assertNull(file0);
  }

  /**
  //Test case number: 7
  /*Coverage entropy=2.40439823421475
  */
  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      EvoSuiteURL evoSuiteURL0 = new EvoSuiteURL("http://xml.amazon.net/onca/xml3?t=popcornmonste2-20&dev-t=DSB0XDDW1GQ3S&KeywordSearch=c%7DV%27%2Cn.Ox%7F&mode=c}V',n.Ox&type=&page=c}V',n.Ox&f=xml");
      boolean boolean0 = NetworkHandling.createRemoteTextFile(evoSuiteURL0, "ShoppingCart=modify&f=xml&dev-t=");
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("/C}V',N.OX_SHOPPINGCART=MODIFY&F=XML&DEV-T=_E}-Z+7FB&TIZQ4C~M}.XML");
      FileSystemHandling.createFolder(evoSuiteFile0);
      fileUtil0.fetchKeywordSearchFile("c}V',n.Ox", "c}V',n.Ox", "", "c}V',n.Ox");
      fileUtil0.getBrowseNodeFile("c}V',n.Ox", "ShoppingCart=modify&f=xml&dev-t=", "e}-z+7Fb&tIzq4C~M}");
      boolean boolean1 = fileUtil0.downloadSimilaritesFile("e}-z+7Fb&tIzq4C~M}", "e}-z+7Fb&tIzq4C~M}", "c}V',n.Ox");
      assertFalse(boolean1 == boolean0);
  }

  /**
  //Test case number: 8
  /*Coverage entropy=2.285149829679032
  */
  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("/JCX3NXU:2V:(QM__.XML");
      FileSystemHandling.appendStringToFile(evoSuiteFile0, "");
      FileUtil fileUtil0 = new FileUtil();
      fileUtil0.fetchBNFile("jCX3NXU:2v:(qm", "", "");
      File file0 = fileUtil0.downloadBlendedSearchFile("kTa?9", "By@\"h |5]&P@pzIH[");
      assertNull(file0);
  }

  /**
  //Test case number: 9
  /*Coverage entropy=1.7130415601881177
  */
  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("/O>/KJ!\\&@@R!1[%G_O>/KJ!\\&@@R!1[%G_O>/KJ!\\&@@R!1[%G.XML");
      FileSystemHandling.appendStringToFile(evoSuiteFile0, "q{ xD5N`<_`C");
      FileUtil fileUtil0 = new FileUtil();
      fileUtil0.fetchBNFile("O>/KJ!&@@R!1[%g", "O>/KJ!&@@R!1[%g", "O>/KJ!&@@R!1[%g");
      File file0 = fileUtil0.getAccessories(".xml", (ArrayList) null);
      assertNull(file0);
  }

  /**
  //Test case number: 10
  /*Coverage entropy=1.1476926351053998
  */
  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("/JCX3NXU:2V:(QM_JCX3NXU:2V:(QM_JCX3NXU:2V:(QM.XML");
      FileSystemHandling.appendStringToFile(evoSuiteFile0, "type=");
      File file0 = fileUtil0.getBrowseNodeFile("jCX3NXU:2v:(qm", "jCX3NXU:2v:(qm", "jCX3NXU:2v:(qm");
      assertNotNull(file0);
      assertEquals(5L, file0.length());
  }

  /**
  //Test case number: 11
  /*Coverage entropy=1.1546856420984069
  */
  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("/NULL__NULL_NULL.XML");
      FileSystemHandling.createFolder(evoSuiteFile0);
      FileInputStream fileInputStream0 = fileUtil0.fetchASINFile((String) null, (String) null, "", (String) null);
      assertNull(fileInputStream0);
  }

  /**
  //Test case number: 12
  /*Coverage entropy=1.1476926351053998
  */
  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("/4TA7B_4TA7B_4TA7B_4TA7B.XML");
      FileSystemHandling.createFolder(evoSuiteFile0);
      File file0 = fileUtil0.getASINFile("4TA7b", "4TA7b", "4TA7b", "4TA7b");
      assertNotNull(file0);
      assertEquals("4TA7B_4TA7B_4TA7B_4TA7B.XML", file0.getName());
      assertFalse(file0.isFile());
  }

  /**
  //Test case number: 13
  /*Coverage entropy=0.42857142857142855
  */
  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      EvoSuiteURL evoSuiteURL0 = new EvoSuiteURL("http://xml.amazon.net/onca/xml3?t=popcornmonste2-20&dev-t=DSB0XDDW1GQ3S&BlendedSearch=&type=&f=xml");
      NetworkHandling.createRemoteTextFile(evoSuiteURL0, "&DsI. :6WY#%d");
      FileInputStream fileInputStream0 = fileUtil0.fetchBlendedSearchFile("", "");
      assertNull(fileInputStream0);
  }

  /**
  //Test case number: 14
  /*Coverage entropy=0.4
  */
  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      EvoSuiteURL evoSuiteURL0 = new EvoSuiteURL("http://xml.amazon.net/onca/xml3?t=popcornmonste2-20&dev-t=DSB0XDDW1GQ3S&BlendedSearch=&type=&f=xml");
      NetworkHandling.createRemoteTextFile(evoSuiteURL0, "");
      File file0 = fileUtil0.downloadBlendedSearchFile("", "");
      assertNull(file0);
  }

  /**
  //Test case number: 15
  /*Coverage entropy=1.1375916250043898
  */
  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      fileUtil0.renameFile("/", "/");
      File file0 = fileUtil0.getBrowseNodeFile("/", "/", "");
      assertNull(file0);
  }

  /**
  //Test case number: 16
  /*Coverage entropy=0.4444444444444445
  */
  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      EvoSuiteURL evoSuiteURL0 = new EvoSuiteURL("http://xml.amazon.net/onca/xml3?t=popcornmonste2-20&dev-t=DSB0XDDW1GQ3S&AsinSearch=Xz)CG@l(:Boi &type=Xz)CG@l(:Boi &offerpage=Xz)CG@l(:Boi &offer=Xz)CG@l(:Boi &f=xml");
      NetworkHandling.createRemoteTextFile(evoSuiteURL0, "ShoppingCart=modify&f=xml&dev-t=");
      fileUtil0.getASINFile("Xz)CG@l(:Boi ", "Xz)CG@l(:Boi ", "Xz)CG@l(:Boi ", "Xz)CG@l(:Boi ");
      fileUtil0.deleteFile("ShoppingCart=modify&f=xml&dev-t=");
  }

  /**
  //Test case number: 17
  /*Coverage entropy=0.4
  */
  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      EvoSuiteURL evoSuiteURL0 = new EvoSuiteURL("http://xml.amazon.net/onca/xml3?t=popcornmonste2-20&dev-t=DSB0XDDW1GQ3S&AsinSearch=ShoppingCart=modify&f=xml&dev-t=&type=ShoppingCart=modify&f=xml&dev-t=&offerpage=ShoppingCart=modify&f=xml&dev-t=&offer=ShoppingCart=modify&f=xml&dev-t=&f=xml");
      NetworkHandling.createRemoteTextFile(evoSuiteURL0, "ShoppingCart=modify&f=xml&dev-t=");
      boolean boolean0 = fileUtil0.downloadOneASINFile("ShoppingCart=modify&f=xml&dev-t=", "ShoppingCart=modify&f=xml&dev-t=", "ShoppingCart=modify&f=xml&dev-t=", "ShoppingCart=modify&f=xml&dev-t=", "ShoppingCart=modify&f=xml&dev-t=");
      assertFalse(boolean0);
  }

  /**
  //Test case number: 18
  /*Coverage entropy=1.0365141682948127
  */
  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      EvoSuiteURL evoSuiteURL0 = new EvoSuiteURL("http://xml.amazon.net/onca/xml3?t=popcornmonste2-20&dev-t=DSB0XDDW1GQ3S&jCX3NXU:2v:(qm=jCX3NXU%3A2v%3A%28qm&mode=jCX3NXU:2v:(qm&type=jCX3NXU:2v:(qm&page=jCX3NXU:2v:(qm&offer=jCX3NXU:2v:(qm&f=xml");
      NetworkHandling.createRemoteTextFile(evoSuiteURL0, "/");
      File file0 = fileUtil0.downloadGenericSearchFile("jCX3NXU:2v:(qm", "jCX3NXU:2v:(qm", "jCX3NXU:2v:(qm", "jCX3NXU:2v:(qm", "jCX3NXU:2v:(qm", "jCX3NXU:2v:(qm");
      assertNull(file0);
  }

  /**
  //Test case number: 19
  /*Coverage entropy=0.4
  */
  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      EvoSuiteURL evoSuiteURL0 = new EvoSuiteURL("http://xml.amazon.net/onca/xml3?t=popcornmonste2-20&dev-t=DSB0XDDW1GQ3S&SellerSearch=`mPY{#~%/yL0VLAW`z&type=`mPY{#~%/yL0VLAW`z&page=`mPY{#~%/yL0VLAW`z&offerstatus=`mPY{#~%/yL0VLAW`z&f=xml");
      NetworkHandling.createRemoteTextFile(evoSuiteURL0, "k?QlUpV0dQ-fpf;\"m");
      File file0 = fileUtil0.downloadThirdPartySearchFile("`mPY{#~%/yL0VLAW`z", "`mPY{#~%/yL0VLAW`z", "`mPY{#~%/yL0VLAW`z", "`mPY{#~%/yL0VLAW`z");
      assertNull(file0);
  }

  /**
  //Test case number: 20
  /*Coverage entropy=1.0931471805599453
  */
  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
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
  //Test case number: 21
  /*Coverage entropy=1.6868977693384444
  */
  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      FileInputStream fileInputStream0 = fileUtil0.fetchASINFile("", "", "", "I,O-Vf{-Wd~,Ib");
      assertNull(fileInputStream0);
  }

  /**
  //Test case number: 22
  /*Coverage entropy=0.4
  */
  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      fileUtil0.renameFile("", "");
  }

  /**
  //Test case number: 23
  /*Coverage entropy=1.6868977693384444
  */
  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      FileInputStream fileInputStream0 = fileUtil0.fetchASINFile("new", "CHeIWw*L", "CHeIWw*L", "new");
      assertNull(fileInputStream0);
  }

  /**
  //Test case number: 24
  /*Coverage entropy=1.1375916250043898
  */
  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      FileInputStream fileInputStream0 = fileUtil0.fetchASINFile((String) null, (String) null, "", (String) null);
      assertNull(fileInputStream0);
  }

  /**
  //Test case number: 25
  /*Coverage entropy=0.4
  */
  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      fileUtil0.renameFile("C`", "c_");
  }

  /**
  //Test case number: 26
  /*Coverage entropy=1.6868977693384444
  */
  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      FileInputStream fileInputStream0 = fileUtil0.fetchSimilarItems((String) null, "5D~(a#>OU<,w!P3x");
      assertNull(fileInputStream0);
  }

  /**
  //Test case number: 27
  /*Coverage entropy=1.3788419678046633
  */
  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      File file0 = fileUtil0.getSimilarItems("", "lite");
      assertNull(file0);
  }

  /**
  //Test case number: 28
  /*Coverage entropy=0.4
  */
  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      fileUtil0.deleteFile("");
  }

  /**
  //Test case number: 29
  /*Coverage entropy=1.0365141682948127
  */
  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      File file0 = fileUtil0.downloadGenericSearchFile("M-7@Ld", "M-7@Ld", "M-7@Ld", "M-7@Ld", "$$ag^BK~3", "M-7@Ld");
      assertNull(file0);
  }

  /**
  //Test case number: 30
  /*Coverage entropy=0.4
  */
  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      MockFile mockFile0 = new MockFile("cFM4Us0]zvEn{M");
      boolean boolean0 = fileUtil0.isAgeGood(mockFile0);
      assertFalse(boolean0);
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
  //Test case number: 32
  /*Coverage entropy=1.4682921994113465
  */
  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      FileInputStream fileInputStream0 = fileUtil0.fetchKeywordSearchFile("5D~(a#>OU<,w!P3x", (String) null, (String) null, "5D~(a#>OU<,w!P3x");
      assertNull(fileInputStream0);
  }

  /**
  //Test case number: 33
  /*Coverage entropy=1.3788419678046633
  */
  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      File file0 = fileUtil0.getASINFile("Xz)CG@l(:Boi ", "Xz)CG@l(:Boi ", "", "Xz)CG@l(:Boi ");
      assertNull(file0);
  }

  /**
  //Test case number: 34
  /*Coverage entropy=1.3788419678046633
  */
  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      File file0 = fileUtil0.getASINFile("fH|;q", "fH|;q", "fH|;q", "http://xml.amazon.net/onca/xml3");
      assertNull(file0);
  }

  /**
  //Test case number: 35
  /*Coverage entropy=1.3788419678046633
  */
  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      File file0 = fileUtil0.getASINFile("5ZiJ.bX5b)!6Q>4c", "fH|;q", "fH|;q", "fH|;q");
      assertNull(file0);
  }

  /**
  //Test case number: 36
  /*Coverage entropy=1.0365141682948127
  */
  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      File file0 = fileUtil0.downloadKeywordSearchFile("jCX3NXU:2v:(qm", "jCX3NXU:2v:(qm", "", "");
      assertNull(file0);
  }

  /**
  //Test case number: 37
  /*Coverage entropy=1.1217186091313738
  */
  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      FileInputStream fileInputStream0 = fileUtil0.fetchKeywordSearchFile("MMOi8dstpW~", "MMOi8dstpW~", "MMOi8dstpW~", "all");
      assertNull(fileInputStream0);
  }

  /**
  //Test case number: 38
  /*Coverage entropy=1.4682921994113465
  */
  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      FileInputStream fileInputStream0 = fileUtil0.fetchKeywordSearchFile("M-7@Ld", "jCX3NXU:2v:(qm", "M-7@Ld", "M-7@Ld");
      assertNull(fileInputStream0);
  }

  /**
  //Test case number: 39
  /*Coverage entropy=1.0931471805599453
  */
  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      ArrayList<String> arrayList0 = new ArrayList<String>();
      boolean boolean0 = fileUtil0.downloadAccessoriesFile("7", arrayList0, "7");
      assertFalse(boolean0);
  }

  /**
  //Test case number: 40
  /*Coverage entropy=1.0931471805599453
  */
  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      boolean boolean0 = fileUtil0.downloadBrowseNodeFile("4TAb", "4TAb", "4TAb", "4TAb");
      assertFalse(boolean0);
  }

  /**
  //Test case number: 41
  /*Coverage entropy=1.0365141682948127
  */
  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      File file0 = fileUtil0.downloadThirdPartySearchFile("4TA7b", "4TA7b", "a_", "4TA7b");
      assertNull(file0);
  }

  /**
  //Test case number: 42
  /*Coverage entropy=1.4682921994113465
  */
  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      FileInputStream fileInputStream0 = fileUtil0.fetchGenericSearchFile("4TA7b", "4TA7b", "4TA7b", "hIB}NC:J Yu+>", "4TA7b", "4TA7b");
      assertNull(fileInputStream0);
  }

  /**
  //Test case number: 43
  /*Coverage entropy=1.4682921994113465
  */
  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      FileInputStream fileInputStream0 = fileUtil0.fetchGenericSearchFile("jCX38NXU:2v:(qm", "}v6jlb[zznJ1:65:s", "jCX38NXU:2v:(qm", "jCX38NXU:2v:(qm", "}v6jlb[zznJ1:65:s", "}v6jlb[zznJ1:65:s");
      assertNull(fileInputStream0);
  }

  /**
  //Test case number: 44
  /*Coverage entropy=1.4682921994113465
  */
  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      FileInputStream fileInputStream0 = fileUtil0.fetchGenericSearchFile("?/KzASBGi", "?/KzASBGi", "?/KzASBGi", "?/KzASBGi", "?/KzASBGi", "");
      assertNull(fileInputStream0);
  }

  /**
  //Test case number: 45
  /*Coverage entropy=1.0365141682948127
  */
  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      File file0 = fileUtil0.downloadGenericSearchFile("all", "all", "all", "", "all", "all");
      assertNull(file0);
  }

  /**
  //Test case number: 46
  /*Coverage entropy=1.0365141682948127
  */
  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      File file0 = fileUtil0.downloadGenericSearchFile("jCX3NXU:2v:(qm", "M-7@Ld", "jCX3NXU:2v:(qm", "jCX3NXU:2v:(qm", "jCX3NXU:2v:(qm", "jCX3NXU:2v:(qm");
      assertNull(file0);
  }

  /**
  //Test case number: 47
  /*Coverage entropy=1.0365141682948127
  */
  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      File file0 = fileUtil0.downloadGenericSearchFile("jCX3NXU:2v:(qm", "jCX3NXU:2v:(qm", "jCX3NXU:2v:(qm", "jCX3NXU:2v:(qm", "M-7@Ld", "M-7@Ld");
      assertNull(file0);
  }

  /**
  //Test case number: 48
  /*Coverage entropy=1.4682921994113465
  */
  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      FileInputStream fileInputStream0 = fileUtil0.fetchBlendedSearchFile("N<bc)RJIRLbXIFCx", "");
      assertNull(fileInputStream0);
  }

  /**
  //Test case number: 49
  /*Coverage entropy=1.6868977693384446
  */
  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      FileInputStream fileInputStream0 = fileUtil0.fetchBNFile("&Item.", "6t^H", "&Item.");
      assertNull(fileInputStream0);
  }

  /**
  //Test case number: 50
  /*Coverage entropy=1.6868977693384446
  */
  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      FileInputStream fileInputStream0 = fileUtil0.fetchBNFile("jCX3NXU:2v:(qm", "", "");
      assertNull(fileInputStream0);
  }

  /**
  //Test case number: 51
  /*Coverage entropy=0.4
  */
  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      File file0 = fileUtil0.downloadCart((String) null);
      assertNull(file0);
  }

  /**
  //Test case number: 52
  /*Coverage entropy=1.1375916250043898
  */
  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      ArrayList<String> arrayList0 = new ArrayList<String>();
      FileInputStream fileInputStream0 = fileUtil0.fetchAccessories((String) null, arrayList0);
      assertNull(fileInputStream0);
  }

  /**
  //Test case number: 53
  /*Coverage entropy=0.4
  */
  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      boolean boolean0 = fileUtil0.isAgeGood((File) null);
      assertFalse(boolean0);
  }
}
