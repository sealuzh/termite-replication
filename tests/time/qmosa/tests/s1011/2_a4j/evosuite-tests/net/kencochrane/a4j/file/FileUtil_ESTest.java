/*
 * This file was automatically generated by EvoSuite
 * Sun Nov 29 23:15:05 GMT 2020
 */

package net.kencochrane.a4j.file;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.File;
import java.io.FileInputStream;
import java.net.URI;
import java.util.ArrayList;
import net.kencochrane.a4j.file.FileUtil;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.io.MockFile;
import org.evosuite.runtime.mock.java.net.MockURI;
import org.evosuite.runtime.testdata.EvoSuiteFile;
import org.evosuite.runtime.testdata.FileSystemHandling;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class FileUtil_ESTest extends FileUtil_ESTest_scaffolding {

  /**
  //Test case number: 0
  /*Coverage entropy=1.6417347121875212
  */
  @Test(timeout = 4000)
  public void test000()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("__NULL.XML");
      fileUtil0.cacheDir = "";
      FileSystemHandling.appendStringToFile(evoSuiteFile0, "Xz_:+Iy&KZ <");
      FileInputStream fileInputStream0 = fileUtil0.fetchBNFile("", "", (String) null);
      assertEquals(12, fileInputStream0.available());
  }

  /**
  //Test case number: 1
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test001()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      // Undeclared exception!
      try { 
        fileUtil0.renameFile((String) null, "#H9}t3Lg.(tvS2B$Njd");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.io.File", e);
      }
  }

  /**
  //Test case number: 2
  /*Coverage entropy=0.6365141682948128
  */
  @Test(timeout = 4000)
  public void test002()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      URI uRI0 = MockURI.aFileURI;
      MockFile mockFile0 = new MockFile(uRI0);
      boolean boolean0 = fileUtil0.isAgeGood(mockFile0);
      assertFalse(boolean0);
  }

  /**
  //Test case number: 3
  /*Coverage entropy=0.9502705392332347
  */
  @Test(timeout = 4000)
  public void test003()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      File file0 = fileUtil0.getSimilarItems((String) null, (String) null);
      assertNull(file0);
  }

  /**
  //Test case number: 4
  /*Coverage entropy=0.9502705392332347
  */
  @Test(timeout = 4000)
  public void test004()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      File file0 = fileUtil0.getSimilarItems("W-YHjWa_Ws0l8", "");
      assertNull(file0);
  }

  /**
  //Test case number: 5
  /*Coverage entropy=0.9502705392332347
  */
  @Test(timeout = 4000)
  public void test005()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      File file0 = fileUtil0.getSimilarItems((String) null, "dE?UAH?5=A\"3,");
      assertNull(file0);
  }

  /**
  //Test case number: 6
  /*Coverage entropy=0.9502705392332347
  */
  @Test(timeout = 4000)
  public void test006()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      File file0 = fileUtil0.getSimilarItems("", ".xml");
      assertNull(file0);
  }

  /**
  //Test case number: 7
  /*Coverage entropy=0.9502705392332347
  */
  @Test(timeout = 4000)
  public void test007()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      File file0 = fileUtil0.getBrowseNodeFile("4'p%<|>%", (String) null, (String) null);
      assertNull(file0);
  }

  /**
  //Test case number: 8
  /*Coverage entropy=0.9502705392332347
  */
  @Test(timeout = 4000)
  public void test008()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      File file0 = fileUtil0.getBrowseNodeFile("", (String) null, "");
      assertNull(file0);
  }

  /**
  //Test case number: 9
  /*Coverage entropy=0.9502705392332347
  */
  @Test(timeout = 4000)
  public void test009()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      File file0 = fileUtil0.getBrowseNodeFile((String) null, "net.kencochrane.a4j.util.LoadProperties", "ta_");
      assertNull(file0);
  }

  /**
  //Test case number: 10
  /*Coverage entropy=0.9502705392332347
  */
  @Test(timeout = 4000)
  public void test010()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      File file0 = fileUtil0.getBrowseNodeFile("EUE Ly$+v!Z|#YjRv?", "", "EUE Ly$+v!Z|#YjRv?");
      assertNull(file0);
  }

  /**
  //Test case number: 11
  /*Coverage entropy=0.9502705392332347
  */
  @Test(timeout = 4000)
  public void test011()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      ArrayList<Integer> arrayList0 = new ArrayList<Integer>();
      Integer integer0 = new Integer((-66));
      arrayList0.add(integer0);
      File file0 = fileUtil0.getAccessories("BrowseNodeSearch=", arrayList0);
      assertNull(file0);
  }

  /**
  //Test case number: 12
  /*Coverage entropy=0.9502705392332347
  */
  @Test(timeout = 4000)
  public void test012()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      ArrayList<String> arrayList0 = new ArrayList<String>();
      File file0 = fileUtil0.getAccessories((String) null, arrayList0);
      assertNull(file0);
  }

  /**
  //Test case number: 13
  /*Coverage entropy=0.9502705392332347
  */
  @Test(timeout = 4000)
  public void test013()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      File file0 = fileUtil0.getAccessories("x&Pu8:;!a\"F2M~VLh$w", (ArrayList) null);
      assertNull(file0);
  }

  /**
  //Test case number: 14
  /*Coverage entropy=0.9502705392332347
  */
  @Test(timeout = 4000)
  public void test014()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      File file0 = fileUtil0.getAccessories("", (ArrayList) null);
      assertNull(file0);
  }

  /**
  //Test case number: 15
  /*Coverage entropy=0.9502705392332347
  */
  @Test(timeout = 4000)
  public void test015()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      File file0 = fileUtil0.getASINFile(")b_Z\"rv&/%*", (String) null, "6b~m*T)PbUk", "");
      assertNull(file0);
  }

  /**
  //Test case number: 16
  /*Coverage entropy=0.9502705392332347
  */
  @Test(timeout = 4000)
  public void test016()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      File file0 = fileUtil0.getASINFile((String) null, "PI3GC", (String) null, (String) null);
      assertNull(file0);
  }

  /**
  //Test case number: 17
  /*Coverage entropy=0.9502705392332347
  */
  @Test(timeout = 4000)
  public void test017()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      File file0 = fileUtil0.getASINFile("", "", "", "8e5{@&~BX1T)IDp*o");
      assertNull(file0);
  }

  /**
  //Test case number: 18
  /*Coverage entropy=1.0397207708399179
  */
  @Test(timeout = 4000)
  public void test018()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      FileInputStream fileInputStream0 = fileUtil0.fetchThirdPartySearchFile("i} F >j'-8oIH", "9W8<Xc>Aq", (String) null, (String) null);
      assertNull(fileInputStream0);
  }

  /**
  //Test case number: 19
  /*Coverage entropy=1.0397207708399179
  */
  @Test(timeout = 4000)
  public void test019()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      FileInputStream fileInputStream0 = fileUtil0.fetchThirdPartySearchFile("Vh[5DSuf:OE", "Vh[5DSuf:OE", (String) null, "4M<Z@k0jH}k)@:c#I9");
      assertNull(fileInputStream0);
  }

  /**
  //Test case number: 20
  /*Coverage entropy=1.0397207708399179
  */
  @Test(timeout = 4000)
  public void test020()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      FileInputStream fileInputStream0 = fileUtil0.fetchThirdPartySearchFile("MkeD{RDqdolb[2Q|S", (String) null, "There is no Properties File Setting to default", "s_");
      assertNull(fileInputStream0);
  }

  /**
  //Test case number: 21
  /*Coverage entropy=1.0397207708399179
  */
  @Test(timeout = 4000)
  public void test021()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      FileInputStream fileInputStream0 = fileUtil0.fetchThirdPartySearchFile((String) null, "s_", "popcornmonste2-20", "'CWhVaDX");
      assertNull(fileInputStream0);
  }

  /**
  //Test case number: 22
  /*Coverage entropy=1.0397207708399179
  */
  @Test(timeout = 4000)
  public void test022()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      FileInputStream fileInputStream0 = fileUtil0.fetchThirdPartySearchFile("a4j-config.txt", "", "", "cacheLife");
      assertNull(fileInputStream0);
  }

  /**
  //Test case number: 23
  /*Coverage entropy=1.242453324894
  */
  @Test(timeout = 4000)
  public void test023()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      FileInputStream fileInputStream0 = fileUtil0.fetchSimilarItems((String) null, "hh*uMK=7");
      assertNull(fileInputStream0);
  }

  /**
  //Test case number: 24
  /*Coverage entropy=1.242453324894
  */
  @Test(timeout = 4000)
  public void test024()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      FileInputStream fileInputStream0 = fileUtil0.fetchSimilarItems("", "");
      assertNull(fileInputStream0);
  }

  /**
  //Test case number: 25
  /*Coverage entropy=1.0397207708399179
  */
  @Test(timeout = 4000)
  public void test025()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      FileInputStream fileInputStream0 = fileUtil0.fetchKeywordSearchFile("qw*", "", "x", (String) null);
      assertNull(fileInputStream0);
  }

  /**
  //Test case number: 26
  /*Coverage entropy=1.0397207708399179
  */
  @Test(timeout = 4000)
  public void test026()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      FileInputStream fileInputStream0 = fileUtil0.fetchKeywordSearchFile("Vh[eDS5f:OE", "9W8<2ZXc>Aq", (String) null, "Vh[eDS5f:OE");
      assertNull(fileInputStream0);
  }

  /**
  //Test case number: 27
  /*Coverage entropy=1.0397207708399179
  */
  @Test(timeout = 4000)
  public void test027()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      FileInputStream fileInputStream0 = fileUtil0.fetchKeywordSearchFile((String) null, (String) null, "d-)44h9)SR~>?7", "k<]U8='aS4K|<N");
      assertNull(fileInputStream0);
  }

  /**
  //Test case number: 28
  /*Coverage entropy=1.0397207708399179
  */
  @Test(timeout = 4000)
  public void test028()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      FileInputStream fileInputStream0 = fileUtil0.fetchKeywordSearchFile((String) null, "Vh[5DSuf:OE", "", "");
      assertNull(fileInputStream0);
  }

  /**
  //Test case number: 29
  /*Coverage entropy=1.0397207708399179
  */
  @Test(timeout = 4000)
  public void test029()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      FileInputStream fileInputStream0 = fileUtil0.fetchKeywordSearchFile("", "", "cacheLife", "all");
      assertNull(fileInputStream0);
  }

  /**
  //Test case number: 30
  /*Coverage entropy=1.0397207708399179
  */
  @Test(timeout = 4000)
  public void test030()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      FileInputStream fileInputStream0 = fileUtil0.fetchGenericSearchFile(")yhrVGXJVaEM'P6w", "c.5", "", "c.5", "", (String) null);
      assertNull(fileInputStream0);
  }

  /**
  //Test case number: 31
  /*Coverage entropy=1.0397207708399179
  */
  @Test(timeout = 4000)
  public void test031()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      FileInputStream fileInputStream0 = fileUtil0.fetchGenericSearchFile("9W8<Xc>Aq", "XL|e`", "XL|e`", "XL|e`", (String) null, "}D3l\tZMTT6");
      assertNull(fileInputStream0);
  }

  /**
  //Test case number: 32
  /*Coverage entropy=1.0397207708399179
  */
  @Test(timeout = 4000)
  public void test032()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      FileInputStream fileInputStream0 = fileUtil0.fetchGenericSearchFile("S3wUmC#l.QT(6w:o", "", "http://xml.amazon.net/onca/xml3", (String) null, "eD6 +", "");
      assertNull(fileInputStream0);
  }

  /**
  //Test case number: 33
  /*Coverage entropy=1.0397207708399179
  */
  @Test(timeout = 4000)
  public void test033()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      FileInputStream fileInputStream0 = fileUtil0.fetchGenericSearchFile("amazonServerURL", "", "K3r`Tv(k0b9", "", "", "VwcI");
      assertNull(fileInputStream0);
  }

  /**
  //Test case number: 34
  /*Coverage entropy=1.0397207708399179
  */
  @Test(timeout = 4000)
  public void test034()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      FileInputStream fileInputStream0 = fileUtil0.fetchGenericSearchFile((String) null, (String) null, (String) null, "#H9}t3Lg.(tvS2B$Njd", "w'aDTi~4i0\u0005u", "g_");
      assertNull(fileInputStream0);
  }

  /**
  //Test case number: 35
  /*Coverage entropy=1.0397207708399179
  */
  @Test(timeout = 4000)
  public void test035()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      FileInputStream fileInputStream0 = fileUtil0.fetchBlendedSearchFile((String) null, (String) null);
      assertNull(fileInputStream0);
  }

  /**
  //Test case number: 36
  /*Coverage entropy=1.0397207708399179
  */
  @Test(timeout = 4000)
  public void test036()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      FileInputStream fileInputStream0 = fileUtil0.fetchBlendedSearchFile("u_=t}d7.NZR0Su2s/", "g:?trL'XF;RcquI=<`");
      assertNull(fileInputStream0);
  }

  /**
  //Test case number: 37
  /*Coverage entropy=1.0397207708399179
  */
  @Test(timeout = 4000)
  public void test037()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      FileInputStream fileInputStream0 = fileUtil0.fetchBlendedSearchFile("", "");
      assertNull(fileInputStream0);
  }

  /**
  //Test case number: 38
  /*Coverage entropy=1.2424533248940002
  */
  @Test(timeout = 4000)
  public void test038()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      FileInputStream fileInputStream0 = fileUtil0.fetchBNFile("&t=", (String) null, "");
      assertNull(fileInputStream0);
  }

  /**
  //Test case number: 39
  /*Coverage entropy=1.2424533248940002
  */
  @Test(timeout = 4000)
  public void test039()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      FileInputStream fileInputStream0 = fileUtil0.fetchBNFile("all", (String) null, "all");
      assertNull(fileInputStream0);
  }

  /**
  //Test case number: 40
  /*Coverage entropy=1.2424533248940002
  */
  @Test(timeout = 4000)
  public void test040()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      FileInputStream fileInputStream0 = fileUtil0.fetchBNFile((String) null, "", (String) null);
      assertNull(fileInputStream0);
  }

  /**
  //Test case number: 41
  /*Coverage entropy=1.2424533248940002
  */
  @Test(timeout = 4000)
  public void test041()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      FileInputStream fileInputStream0 = fileUtil0.fetchBNFile("popcornmonste2-20", ")x-JqaJt", "1");
      assertNull(fileInputStream0);
  }

  /**
  //Test case number: 42
  /*Coverage entropy=1.242453324894
  */
  @Test(timeout = 4000)
  public void test042()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      FileInputStream fileInputStream0 = fileUtil0.fetchAccessories("net.kencochrane.a4j.file.FileUtil", (ArrayList) null);
      assertNull(fileInputStream0);
  }

  /**
  //Test case number: 43
  /*Coverage entropy=1.242453324894
  */
  @Test(timeout = 4000)
  public void test043()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      ArrayList<Integer> arrayList0 = new ArrayList<Integer>();
      Integer integer0 = new Integer((-66));
      arrayList0.add(integer0);
      FileInputStream fileInputStream0 = fileUtil0.fetchAccessories(".xml", arrayList0);
      assertNull(fileInputStream0);
  }

  /**
  //Test case number: 44
  /*Coverage entropy=1.242453324894
  */
  @Test(timeout = 4000)
  public void test044()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      ArrayList<Object> arrayList0 = new ArrayList<Object>(4);
      FileInputStream fileInputStream0 = fileUtil0.fetchAccessories((String) null, arrayList0);
      assertNull(fileInputStream0);
  }

  /**
  //Test case number: 45
  /*Coverage entropy=1.242453324894
  */
  @Test(timeout = 4000)
  public void test045()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      FileInputStream fileInputStream0 = fileUtil0.fetchASINFile("IWrRmEeY`", "", "", (String) null);
      assertNull(fileInputStream0);
  }

  /**
  //Test case number: 46
  /*Coverage entropy=1.242453324894
  */
  @Test(timeout = 4000)
  public void test046()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      FileInputStream fileInputStream0 = fileUtil0.fetchASINFile("", "SimilaritySearch", (String) null, "");
      assertNull(fileInputStream0);
  }

  /**
  //Test case number: 47
  /*Coverage entropy=1.242453324894
  */
  @Test(timeout = 4000)
  public void test047()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      FileInputStream fileInputStream0 = fileUtil0.fetchASINFile((String) null, (String) null, "", "_=2");
      assertNull(fileInputStream0);
  }

  /**
  //Test case number: 48
  /*Coverage entropy=0.6365141682948128
  */
  @Test(timeout = 4000)
  public void test048()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      File file0 = fileUtil0.downloadThirdPartySearchFile("]o0vqW", "j.O7v%B:sYu7(p$:", "mAv'*3+UA9", "");
      assertNull(file0);
  }

  /**
  //Test case number: 49
  /*Coverage entropy=0.6365141682948128
  */
  @Test(timeout = 4000)
  public void test049()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      File file0 = fileUtil0.downloadThirdPartySearchFile("?6p^!*_u<", (String) null, "fn9LpfEy}[+Uu_k{", "=cf@DtZG&W=wQ)H");
      assertNull(file0);
  }

  /**
  //Test case number: 50
  /*Coverage entropy=0.6365141682948128
  */
  @Test(timeout = 4000)
  public void test050()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      File file0 = fileUtil0.downloadThirdPartySearchFile("t_", "", "", "-v80o_C24#0~PZEbMR");
      assertNull(file0);
  }

  /**
  //Test case number: 51
  /*Coverage entropy=0.6365141682948128
  */
  @Test(timeout = 4000)
  public void test051()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      File file0 = fileUtil0.downloadThirdPartySearchFile((String) null, "bw~v=S2*6@_<(ej@?A_", (String) null, (String) null);
      assertNull(file0);
  }

  /**
  //Test case number: 52
  /*Coverage entropy=0.6365141682948128
  */
  @Test(timeout = 4000)
  public void test052()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      File file0 = fileUtil0.downloadThirdPartySearchFile("", "*5<~C'byx(.KE/-'l0", "", "UWC");
      assertNull(file0);
  }

  /**
  //Test case number: 53
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test053()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      boolean boolean0 = fileUtil0.downloadSimilaritesFile("#H9}t3Lg.(tvS2B$Njd", (String) null, (String) null);
      assertFalse(boolean0);
  }

  /**
  //Test case number: 54
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test054()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      boolean boolean0 = fileUtil0.downloadSimilaritesFile("ts_", "", "");
      assertFalse(boolean0);
  }

  /**
  //Test case number: 55
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test055()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      boolean boolean0 = fileUtil0.downloadSimilaritesFile((String) null, "Ezwv$*r\"", "net.kencochrane.a4j.file.FileUtil");
      assertFalse(boolean0);
  }

  /**
  //Test case number: 56
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test056()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      boolean boolean0 = fileUtil0.downloadSimilaritesFile("", "Qz>aVYIhg{e", "");
      assertFalse(boolean0);
  }

  /**
  //Test case number: 57
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test057()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      boolean boolean0 = fileUtil0.downloadOneASINFile("", "@?6+0J(,U*6sTyC#4(", "rUz;cy|d", "", (String) null);
      assertFalse(boolean0);
  }

  /**
  //Test case number: 58
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test058()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      boolean boolean0 = fileUtil0.downloadOneASINFile("5W0hj", "5W0hj", "", "", "5W0hj");
      assertFalse(boolean0);
  }

  /**
  //Test case number: 59
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test059()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      boolean boolean0 = fileUtil0.downloadOneASINFile("W-YHjWa_Ws0l8", "W-YHjWa_Ws0l8", "", (String) null, "W-YHjWa_Ws0l8");
      assertFalse(boolean0);
  }

  /**
  //Test case number: 60
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test060()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      boolean boolean0 = fileUtil0.downloadOneASINFile((String) null, "", (String) null, (String) null, "");
      assertFalse(boolean0);
  }

  /**
  //Test case number: 61
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test061()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      boolean boolean0 = fileUtil0.downloadOneASINFile("j.O7v%B:sYu7(p$:", "net.kencochrane.a4j.util.LoadProperties", fileUtil0.cacheDir, "new", "net.kencochrane.a4j.util.LoadProperties");
      assertFalse(boolean0);
  }

  /**
  //Test case number: 62
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test062()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      boolean boolean0 = fileUtil0.downloadOneASINFile("", (String) null, "=B7oAb9mgU", "=B7oAb9mgU", "PMs?(ep_3Qs7RG .");
      assertFalse(boolean0);
  }

  /**
  //Test case number: 63
  /*Coverage entropy=0.6365141682948128
  */
  @Test(timeout = 4000)
  public void test063()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      File file0 = fileUtil0.downloadKeywordSearchFile("SimilaritySearch", "l3_", "", "");
      assertNull(file0);
  }

  /**
  //Test case number: 64
  /*Coverage entropy=0.6365141682948128
  */
  @Test(timeout = 4000)
  public void test064()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      File file0 = fileUtil0.downloadKeywordSearchFile("IXXCJnV;", "", (String) null, (String) null);
      assertNull(file0);
  }

  /**
  //Test case number: 65
  /*Coverage entropy=0.6365141682948128
  */
  @Test(timeout = 4000)
  public void test065()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      File file0 = fileUtil0.downloadKeywordSearchFile("-h}hul", (String) null, "-h}hul", (String) null);
      assertNull(file0);
  }

  /**
  //Test case number: 66
  /*Coverage entropy=0.6365141682948128
  */
  @Test(timeout = 4000)
  public void test066()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      File file0 = fileUtil0.downloadKeywordSearchFile("6y6]", "", "Log file isn't there Setting default properties", "&l!o");
      assertNull(file0);
  }

  /**
  //Test case number: 67
  /*Coverage entropy=0.6365141682948128
  */
  @Test(timeout = 4000)
  public void test067()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      File file0 = fileUtil0.downloadKeywordSearchFile((String) null, "wD1", "", "wD1");
      assertNull(file0);
  }

  /**
  //Test case number: 68
  /*Coverage entropy=0.6365141682948128
  */
  @Test(timeout = 4000)
  public void test068()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      File file0 = fileUtil0.downloadKeywordSearchFile("", "%9;:_uJSR@;3", "", "wD1");
      assertNull(file0);
  }

  /**
  //Test case number: 69
  /*Coverage entropy=0.6365141682948128
  */
  @Test(timeout = 4000)
  public void test069()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      File file0 = fileUtil0.downloadGenericSearchFile("(ONtpd4R X>,yPC)", "(ONtpd4R X>,yPC)", "(ONtpd4R X>,yPC)", "?6p^!*_u<", (String) null, "popcornmonste2-20");
      assertNull(file0);
  }

  /**
  //Test case number: 70
  /*Coverage entropy=0.6365141682948128
  */
  @Test(timeout = 4000)
  public void test070()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      File file0 = fileUtil0.downloadGenericSearchFile("PI3GC", "UeBt20?6", (String) null, (String) null, "AsinSearch", "PI3GC");
      assertNull(file0);
  }

  /**
  //Test case number: 71
  /*Coverage entropy=0.6365141682948128
  */
  @Test(timeout = 4000)
  public void test071()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      File file0 = fileUtil0.downloadGenericSearchFile("f)5Y4<hHox}Djdk", "{+[f8", "", (String) null, "qB ;J#`Q`Y", "");
      assertNull(file0);
  }

  /**
  //Test case number: 72
  /*Coverage entropy=0.6365141682948128
  */
  @Test(timeout = 4000)
  public void test072()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      File file0 = fileUtil0.downloadGenericSearchFile((String) null, "", "javTL", "", "", "3G5*LksnHq/#[HTqNcL");
      assertNull(file0);
  }

  /**
  //Test case number: 73
  /*Coverage entropy=0.6365141682948128
  */
  @Test(timeout = 4000)
  public void test073()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      File file0 = fileUtil0.downloadGenericSearchFile("", (String) null, "amazonServerURL", "J$_6~f", "SimilaritySearch", (String) null);
      assertNull(file0);
  }

  /**
  //Test case number: 74
  /*Coverage entropy=0.6365141682948128
  */
  @Test(timeout = 4000)
  public void test074()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      File file0 = fileUtil0.downloadCart((String) null);
      assertNull(file0);
  }

  /**
  //Test case number: 75
  /*Coverage entropy=0.6365141682948128
  */
  @Test(timeout = 4000)
  public void test075()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      File file0 = fileUtil0.downloadCart("w4wNb");
      assertNull(file0);
  }

  /**
  //Test case number: 76
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test076()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      boolean boolean0 = fileUtil0.downloadBrowseNodeFile("net.kencochrane.a4j.util.LoadProperties", "", "net.kencochrane.a4j.util.LoadProperties", "");
      assertFalse(boolean0);
  }

  /**
  //Test case number: 77
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test077()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      boolean boolean0 = fileUtil0.downloadBrowseNodeFile("", "j_3y6zd\"~/?`HFDL", (String) null, "j_3y6zd\"~/?`HFDL");
      assertFalse(boolean0);
  }

  /**
  //Test case number: 78
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test078()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      boolean boolean0 = fileUtil0.downloadBrowseNodeFile("SimilaritySearch", (String) null, "<nqR+oHa[{xa-~)qzmg", "|-B@?=");
      assertFalse(boolean0);
  }

  /**
  //Test case number: 79
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test079()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      boolean boolean0 = fileUtil0.downloadBrowseNodeFile((String) null, "l3_", "SimilaritySearch", (String) null);
      assertFalse(boolean0);
  }

  /**
  //Test case number: 80
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test080()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      boolean boolean0 = fileUtil0.downloadBrowseNodeFile("", "", "", "new");
      assertFalse(boolean0);
  }

  /**
  //Test case number: 81
  /*Coverage entropy=0.6365141682948128
  */
  @Test(timeout = 4000)
  public void test081()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      File file0 = fileUtil0.downloadBlendedSearchFile("\"sW7_===vJs,b\")GO5", "");
      assertNull(file0);
  }

  /**
  //Test case number: 82
  /*Coverage entropy=0.6365141682948128
  */
  @Test(timeout = 4000)
  public void test082()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      File file0 = fileUtil0.downloadBlendedSearchFile((String) null, (String) null);
      assertNull(file0);
  }

  /**
  //Test case number: 83
  /*Coverage entropy=0.6365141682948128
  */
  @Test(timeout = 4000)
  public void test083()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      File file0 = fileUtil0.downloadBlendedSearchFile("ZKdf'3*A/7^;UqT~", "UeBt20?6");
      assertNull(file0);
  }

  /**
  //Test case number: 84
  /*Coverage entropy=0.6365141682948128
  */
  @Test(timeout = 4000)
  public void test084()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      File file0 = fileUtil0.downloadBlendedSearchFile("", "k^CUu!.x@y");
      assertNull(file0);
  }

  /**
  //Test case number: 85
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test085()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      ArrayList<String> arrayList0 = new ArrayList<String>();
      boolean boolean0 = fileUtil0.downloadAccessoriesFile("`g2pB,", arrayList0, (String) null);
      assertFalse(boolean0);
  }

  /**
  //Test case number: 86
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test086()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      boolean boolean0 = fileUtil0.downloadAccessoriesFile("(kcXmn&'DR6", (ArrayList) null, "");
      assertFalse(boolean0);
  }

  /**
  //Test case number: 87
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test087()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      ArrayList<Integer> arrayList0 = new ArrayList<Integer>();
      Integer integer0 = new Integer((-374));
      arrayList0.add(integer0);
      boolean boolean0 = fileUtil0.downloadAccessoriesFile("", arrayList0, "GqcnPedz%Cu9pP|5T_g");
      assertFalse(boolean0);
  }

  /**
  //Test case number: 88
  /*Coverage entropy=0.6365141682948128
  */
  @Test(timeout = 4000)
  public void test088()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      fileUtil0.deleteFile("[c{/hzV4");
  }

  /**
  //Test case number: 89
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test089()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      // Undeclared exception!
      try { 
        fileUtil0.renameFile("", (String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.io.File", e);
      }
  }

  /**
  //Test case number: 90
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test090()  throws Throwable  {
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
  //Test case number: 91
  /*Coverage entropy=0.6365141682948128
  */
  @Test(timeout = 4000)
  public void test091()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      File file0 = fileUtil0.downloadCart("");
      assertNull(file0);
  }

  /**
  //Test case number: 92
  /*Coverage entropy=1.242453324894
  */
  @Test(timeout = 4000)
  public void test092()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      FileInputStream fileInputStream0 = fileUtil0.fetchSimilarItems("Qz>aVYIhg{e", (String) null);
      assertNull(fileInputStream0);
  }

  /**
  //Test case number: 93
  /*Coverage entropy=1.242453324894
  */
  @Test(timeout = 4000)
  public void test093()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      ArrayList<String> arrayList0 = new ArrayList<String>();
      FileInputStream fileInputStream0 = fileUtil0.fetchAccessories("", arrayList0);
      assertNull(fileInputStream0);
  }

  /**
  //Test case number: 94
  /*Coverage entropy=1.0397207708399179
  */
  @Test(timeout = 4000)
  public void test094()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      FileInputStream fileInputStream0 = fileUtil0.fetchThirdPartySearchFile("", "Xz_:+Iy&KZ <", "*Hsz:^", "");
      assertNull(fileInputStream0);
  }

  /**
  //Test case number: 95
  /*Coverage entropy=1.0397207708399179
  */
  @Test(timeout = 4000)
  public void test095()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      FileInputStream fileInputStream0 = fileUtil0.fetchGenericSearchFile("", "", "", "Qz>aVYIhg{e", "", "cacheLife");
      assertNull(fileInputStream0);
  }

  /**
  //Test case number: 96
  /*Coverage entropy=1.242453324894
  */
  @Test(timeout = 4000)
  public void test096()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      FileInputStream fileInputStream0 = fileUtil0.fetchASINFile("-v80o_C24#0~PZEbMR", "-v80o_C24#0~PZEbMR", "-v80o_C24#0~PZEbMR", "-v80o_C24#0~PZEbMR");
      assertNull(fileInputStream0);
  }

  /**
  //Test case number: 97
  /*Coverage entropy=0.6365141682948128
  */
  @Test(timeout = 4000)
  public void test097()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      fileUtil0.renameFile("", "");
  }

  /**
  //Test case number: 98
  /*Coverage entropy=0.6365141682948128
  */
  @Test(timeout = 4000)
  public void test098()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      fileUtil0.renameFile("x&Pu8:;!a\"F2M~VLh$w", "jAOnVbx7'yV$bSjcR\"");
  }

  /**
  //Test case number: 99
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test099()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      boolean boolean0 = fileUtil0.isAgeGood((File) null);
      assertFalse(boolean0);
  }

  /**
  //Test case number: 100
  /*Coverage entropy=0.6365141682948128
  */
  @Test(timeout = 4000)
  public void test100()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      fileUtil0.deleteFile("");
  }

  /**
  //Test case number: 101
  /*Coverage entropy=1.6417347121875212
  */
  @Test(timeout = 4000)
  public void test101()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("__NULL.XML");
      FileSystemHandling.appendStringToFile(evoSuiteFile0, "");
      fileUtil0.cacheDir = "";
      FileInputStream fileInputStream0 = fileUtil0.fetchBNFile("", "", (String) null);
      assertEquals(0, fileInputStream0.available());
  }
}
