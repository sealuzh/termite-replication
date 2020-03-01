/*
 * This file was automatically generated by EvoSuite
 * Tue Dec 03 20:45:56 GMT 2019
 */

package net.kencochrane.a4j.file;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.File;
import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.function.Function;
import java.util.function.UnaryOperator;
import net.kencochrane.a4j.file.FileUtil;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.Random;
import org.evosuite.runtime.System;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
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
  /*Coverage entropy=2.285149829679032
  */
  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      ArrayList<String> arrayList0 = new ArrayList<String>();
      arrayList0.add("7M");
      UnaryOperator<String> unaryOperator0 = UnaryOperator.identity();
      unaryOperator0.apply("lAv");
      UnaryOperator<String> unaryOperator1 = UnaryOperator.identity();
      arrayList0.add("lAv");
      arrayList0.replaceAll(unaryOperator1);
      arrayList0.add("(VIxV&v/wR=");
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("/K03CWETQ=*0SL%F_(VIXV&V/WR=_NULL_JOGO C.XML");
      FileSystemHandling.createFolder(evoSuiteFile0);
      fileUtil0.fetchGenericSearchFile("[`2", "", "(VIxV&v/wR=", "lAv", "DSB0XDDW1GQ3S", "DSB0XDDW1GQ3S");
      File file0 = fileUtil0.getASINFile("K03CWeTq=*0sL%F", (String) null, "(VIxV&v/wR=", "JOgO C");
      assertNotNull(file0);
      assertTrue(file0.isDirectory());
  }

  /**
  //Test case number: 1
  /*Coverage entropy=2.762374376159249
  */
  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      EvoSuiteURL evoSuiteURL0 = new EvoSuiteURL("http://xml.amazon.net/onca/xml3?t=popcornmonste2-20&dev-t=DSB0XDDW1GQ3S&SellerSearch=&type=&page=&offerstatus=D.Ja8c{zSYBiJ3'uh1&f=xml");
      NetworkHandling.createRemoteTextFile(evoSuiteURL0, "");
      fileUtil0.downloadBlendedSearchFile("", "2HSc[jC2wK");
      fileUtil0.fetchThirdPartySearchFile("", "", "", "D.Ja8c{zSYBiJ3'uh1");
      fileUtil0.fetchBlendedSearchFile("D.Ja8c{zSYBiJ3'uh1", "");
      fileUtil0.fetchSimilarItems("cacheDir", "cacheDir");
      ArrayList<String> arrayList0 = new ArrayList<String>();
      FileInputStream fileInputStream0 = fileUtil0.fetchAccessories("V2KaOl&", arrayList0);
      assertNull(fileInputStream0);
  }

  /**
  //Test case number: 2
  /*Coverage entropy=1.4682921994113465
  */
  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      String string0 = null;
      fileUtil0.downloadBlendedSearchFile((String) null, (String) null);
      String string1 = "i2kMd";
      String string2 = "_";
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
  //Test case number: 3
  /*Coverage entropy=2.7330765550663454
  */
  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      UnaryOperator<String> unaryOperator0 = UnaryOperator.identity();
      unaryOperator0.apply("");
      UnaryOperator<String> unaryOperator1 = UnaryOperator.identity();
      ArrayList<String> arrayList0 = new ArrayList<String>();
      arrayList0.add("");
      arrayList0.replaceAll(unaryOperator1);
      arrayList0.add("=");
      fileUtil0.fetchSimilarItems("", "ei6n%~u*[@W}A)");
      fileUtil0.fetchASINFile("(VIxV&v/wR=", "new", "", (String) null);
      FileUtil fileUtil1 = new FileUtil();
      fileUtil1.fetchAccessories("cacheDir", arrayList0);
      FileUtil fileUtil2 = new FileUtil();
      // Undeclared exception!
      try { 
        fileUtil1.deleteFile((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.io.File", e);
      }
  }

  /**
  //Test case number: 4
  /*Coverage entropy=2.201793123629589
  */
  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      fileUtil0.oldestAge = 1L;
      fileUtil0.oldestAge = 1L;
      MockFile mockFile0 = new MockFile("UDd9T/{qs!N8");
      FileUtil fileUtil1 = new FileUtil();
      fileUtil1.fetchBlendedSearchFile((String) null, (String) null);
      fileUtil1.renameFile("", "");
      FileInputStream fileInputStream0 = fileUtil1.fetchThirdPartySearchFile("", (String) null, "", "");
      assertNull(fileInputStream0);
  }

  /**
  //Test case number: 5
  /*Coverage entropy=2.138526235860879
  */
  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      FileSystemHandling.appendStringToFile((EvoSuiteFile) null, (String) null);
      FileSystemHandling.shouldThrowIOException((EvoSuiteFile) null);
      System.setCurrentTimeMillis(173L);
      FileUtil fileUtil0 = new FileUtil();
      NetworkHandling.createRemoteTextFile((EvoSuiteURL) null, (String) null);
      fileUtil0.downloadOneASINFile("", "@U.S|xVm", "", "", (String) null);
      fileUtil0.oldestAge = 1267L;
      fileUtil0.getBrowseNodeFile("@U.S|xVm", "%:su?#f<1Z", "(>X>n0p?Ps[");
      ArrayList<Object> arrayList0 = new ArrayList<Object>();
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      arrayList0.sort(comparator0);
      fileUtil0.downloadAccessoriesFile(" i8 5^qNO$tBl$@F62", arrayList0, "P0zBx y$LP=");
      File file0 = fileUtil0.downloadGenericSearchFile(", ", "", "/", "P0zBx y$LP=", "9RFFA/|dt~h0", "uR<>uaJmrY^}5y^?");
      assertNull(file0);
  }

  /**
  //Test case number: 6
  /*Coverage entropy=2.0141266108053313
  */
  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      ArrayList<String> arrayList0 = new ArrayList<String>();
      UnaryOperator<String> unaryOperator0 = UnaryOperator.identity();
      unaryOperator0.apply("4M7qmP\"q5{C");
      UnaryOperator<String> unaryOperator1 = UnaryOperator.identity();
      arrayList0.replaceAll(unaryOperator1);
      fileUtil0.fetchBlendedSearchFile("Hyda^wH)jL!77Sb", "3rd_");
      UnaryOperator<Object> unaryOperator2 = UnaryOperator.identity();
      Function<Object, String> function0 = (Function<Object, String>) mock(Function.class, new ViolatedAssumptionAnswer());
      Function<Object, String> function1 = unaryOperator2.andThen((Function<? super Object, ? extends String>) function0);
      unaryOperator0.compose((Function<? super Object, ? extends String>) function1);
      fileUtil0.renameFile("4M7qmP\"q5{C", "");
      File file0 = fileUtil0.downloadGenericSearchFile("#5dR", "O?~pTVlyt", "w.x$M@", "cacheLife", "4M7qmP\"q5{C", "");
      assertNull(file0);
  }

  /**
  //Test case number: 7
  /*Coverage entropy=1.7962284387340903
  */
  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      fileUtil0.downloadCart((String) null);
      fileUtil0.downloadBlendedSearchFile("", "");
      File file0 = fileUtil0.downloadThirdPartySearchFile((String) null, "1N.XgO-$No8n,fx", (String) null, "g_");
      assertNull(file0);
  }

  /**
  //Test case number: 8
  /*Coverage entropy=1.95571359982777
  */
  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      FileSystemHandling.appendStringToFile((EvoSuiteFile) null, (String) null);
      FileSystemHandling.shouldThrowIOException((EvoSuiteFile) null);
      System.setCurrentTimeMillis(173L);
      FileUtil fileUtil0 = new FileUtil();
      fileUtil0.downloadOneASINFile("", "@U.S|xVm", "", "", (String) null);
      fileUtil0.oldestAge = 1267L;
      fileUtil0.getASINFile("@U.S|xVm", "(>X>n0p?Ps[", (String) null, "(>X>n0p?Ps[");
      ArrayList<Object> arrayList0 = new ArrayList<Object>();
      fileUtil0.downloadAccessoriesFile("offerpage=", arrayList0, " i8 5^qNO$tBl$@F62");
      File file0 = fileUtil0.downloadGenericSearchFile("", "%:su?#f<1Z", "", "&z:VwTt3qc%", "OU5goIKCc[+D%", "");
      assertNull(file0);
  }

  /**
  //Test case number: 9
  /*Coverage entropy=2.330346654007667
  */
  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      fileUtil0.downloadCart("dq_KnO>m~VP5Cy");
      fileUtil0.downloadBlendedSearchFile("dq_KnO>m~VP5Cy", (String) null);
      fileUtil0.downloadGenericSearchFile("wze2).cc`&ST<daF6", (String) null, "+", "dq_KnO>m~VP5Cy", "wze2).cc`&ST<daF6", "dq_KnO>m~VP5Cy");
      Random.setNextRandom((-2706));
      FileInputStream fileInputStream0 = fileUtil0.fetchASINFile((String) null, "B/5Z!Vgd;m{", "+", "wze2).cc`&ST<daF6");
      assertNull(fileInputStream0);
  }

  /**
  //Test case number: 10
  /*Coverage entropy=1.95571359982777
  */
  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      ArrayList<String> arrayList0 = new ArrayList<String>();
      arrayList0.add("7M");
      UnaryOperator<String> unaryOperator0 = UnaryOperator.identity();
      unaryOperator0.apply("lAv");
      UnaryOperator.identity();
      UnaryOperator.identity();
      UnaryOperator<String> unaryOperator1 = UnaryOperator.identity();
      arrayList0.replaceAll(unaryOperator1);
      arrayList0.add("n`YO~4OWKfN]ss");
      fileUtil0.downloadGenericSearchFile("lAv", "", "7M", "", "m:T>snfV0?'0r\"I\"", "hBV,Y");
      fileUtil0.fetchGenericSearchFile("all", "m:T>snfV0?'0r\"I\"", "lAv", "a_", "(VIxV&v/wR=", "");
      File file0 = fileUtil0.getASINFile("a_", "h2Dns/WQb!q", "", (String) null);
      assertNull(file0);
  }

  /**
  //Test case number: 11
  /*Coverage entropy=1.7962284387340903
  */
  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      fileUtil0.downloadKeywordSearchFile((String) null, "@yFNPOHW~", "net.kencochrane.a4j.file.FileUtil", "net.kencochrane.a4j.data.Query");
      fileUtil0.downloadBlendedSearchFile((String) null, "C-pq3JG,#u?Br|XCps");
      File file0 = fileUtil0.downloadThirdPartySearchFile("offer=", "vf`D]S^Y(zPl 8ZQ", "", "ge_");
      assertNull(file0);
  }

  /**
  //Test case number: 12
  /*Coverage entropy=2.6222130702090864
  */
  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      ArrayList<String> arrayList0 = new ArrayList<String>();
      UnaryOperator<String> unaryOperator0 = UnaryOperator.identity();
      unaryOperator0.apply("4M7qmP\"q5{C");
      UnaryOperator.identity();
      MockFile mockFile0 = new MockFile("w`_UWa?E^vwjBno.C");
      fileUtil0.isAgeGood(mockFile0);
      fileUtil0.fetchBlendedSearchFile("Hyda^wH)jL!77Sb", "3rd_");
      UnaryOperator<Object> unaryOperator1 = UnaryOperator.identity();
      Function<Object, String> function0 = (Function<Object, String>) mock(Function.class, new ViolatedAssumptionAnswer());
      Function<Object, String> function1 = unaryOperator1.andThen((Function<? super Object, ? extends String>) function0);
      unaryOperator1.compose((Function<? super String, ?>) function1);
      Function<Object, String> function2 = (Function<Object, String>) mock(Function.class, new ViolatedAssumptionAnswer());
      Function<Object, String> function3 = unaryOperator1.andThen((Function<? super Object, ? extends String>) function2);
      unaryOperator0.compose((Function<? super Object, ? extends String>) function3);
      fileUtil0.renameFile("A<R*XF9Lh{d&/pm!", "");
      fileUtil0.fetchThirdPartySearchFile("3rd_", "4M7qmP\"q5{C", "", ")>^~d>");
      fileUtil0.fetchBlendedSearchFile("", "");
      FileInputStream fileInputStream0 = fileUtil0.fetchKeywordSearchFile("R|8IBgSwj{&x}", "Fq5_vk:4~aagMgUEMs5", ")>^~d>", "4M7qmP\"q5{C");
      assertNull(fileInputStream0);
  }

  /**
  //Test case number: 13
  /*Coverage entropy=1.6868977693384446
  */
  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      FileInputStream fileInputStream0 = fileUtil0.fetchBNFile(".xml", "s_", "");
      assertNull(fileInputStream0);
  }

  /**
  //Test case number: 14
  /*Coverage entropy=2.063983366979555
  */
  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      ArrayList<Integer> arrayList0 = new ArrayList<Integer>();
      LinkedList<Integer> linkedList0 = new LinkedList<Integer>();
      Integer integer0 = new Integer(676);
      linkedList0.add(integer0);
      boolean boolean0 = fileUtil0.downloadBrowseNodeFile(">Q:<bj", "[\"_&*7d(0LIIT", "@}.DW><?5>}", ">Q:<bj");
      arrayList0.addAll((Collection<? extends Integer>) linkedList0);
      fileUtil0.downloadOneASINFile("@}.DW><?5>}", "@}.DW><?5>}", "[\"_&*7d(0LIIT", "7vTY`>~A", "XoV");
      boolean boolean1 = fileUtil0.downloadAccessoriesFile("7vTY`>~A", arrayList0, "-");
      assertFalse(boolean1);
      
      boolean boolean2 = fileUtil0.isAgeGood((File) null);
      assertTrue(boolean2 == boolean0);
      assertFalse(boolean2);
  }

  /**
  //Test case number: 15
  /*Coverage entropy=1.0365141682948127
  */
  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      ArrayList<String> arrayList0 = new ArrayList<String>();
      FileUtil fileUtil0 = new FileUtil();
      fileUtil0.deleteFile("woIpWRUx9K`Q!E>+");
  }

  /**
  //Test case number: 16
  /*Coverage entropy=2.20571469225704
  */
  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      fileUtil0.downloadSimilaritesFile("2<dK>VXzk2%=vc|t", "K8", "Log file isn't there Setting default properties");
      fileUtil0.downloadOneASINFile("{-#'C<:fR2Xu", "", "fc1nD}&'xFBh2]", "a", (String) null);
      fileUtil0.downloadOneASINFile("G<\"&U$B#%qDg", "", "Log file isn't there Setting default properties", (String) null, "");
      fileUtil0.deleteFile("");
      fileUtil0.downloadGenericSearchFile("", "", "", "", "fc1nD}&'xFBh2]", "2|*!Xh}n*S");
      fileUtil0.downloadSimilaritesFile("", "a", "a_");
      fileUtil0.downloadThirdPartySearchFile("", "R", ">n3tMful#2x*", "");
      System.setCurrentTimeMillis((-1345L));
  }

  /**
  //Test case number: 17
  /*Coverage entropy=1.977500522076773
  */
  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      fileUtil0.getSimilarItems("r]If=xGO-yv.a)Senx)", "D\")-*[T!kWFNRt2");
      fileUtil0.downloadBlendedSearchFile("", "");
      File file0 = fileUtil0.downloadThirdPartySearchFile("|I", "DSB0XDDW1GQ3S", "D\")-*[T!kWFNRt2", "g_");
      assertNull(file0);
  }

  /**
  //Test case number: 18
  /*Coverage entropy=2.5204227432208675
  */
  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("/.XML_S__.XML");
      byte[] byteArray0 = new byte[0];
      FileSystemHandling.appendDataToFile(evoSuiteFile0, byteArray0);
      fileUtil0.fetchBNFile(".xml", "s_", "");
      ArrayList<String> arrayList0 = new ArrayList<String>();
      FileInputStream fileInputStream0 = fileUtil0.fetchAccessories("s_", arrayList0);
      assertNull(fileInputStream0);
  }

  /**
  //Test case number: 19
  /*Coverage entropy=1.7766234846545668
  */
  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      NetworkHandling.createRemoteTextFile((EvoSuiteURL) null, "Log file isn't there Setting default properties");
      FileSystemHandling.shouldAllThrowIOExceptions();
      fileUtil0.downloadSimilaritesFile("}We3:]K&`DHwHk7>", ">2", "Log file isn't there Setting default properties");
      ArrayList<Object> arrayList0 = new ArrayList<Object>();
      fileUtil0.downloadAccessoriesFile(">2", arrayList0, "LR~LJ\"]e#");
      File file0 = fileUtil0.downloadGenericSearchFile("BlendedSearch=", ", ", "jY}mEC_^@x9!p]\">89<", "B@Or", "offerpage=", "offerpage=");
      assertNull(file0);
  }

  /**
  //Test case number: 20
  /*Coverage entropy=1.3788419678046633
  */
  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      UnaryOperator<String> unaryOperator0 = UnaryOperator.identity();
      unaryOperator0.apply("");
      UnaryOperator.identity();
      ArrayList<String> arrayList0 = new ArrayList<String>();
      arrayList0.replaceAll(unaryOperator0);
      String string0 = "(VIxV&v/wR=";
      arrayList0.add("");
      fileUtil0.getAccessories("", arrayList0);
      Object object0 = new Object();
      ArrayList<Object> arrayList1 = new ArrayList<Object>();
      Object object1 = new Object();
      arrayList1.add(object1);
      ArrayList<Object> arrayList2 = new ArrayList<Object>();
      // Undeclared exception!
      try { 
        arrayList2.addAll((-2145338308), (Collection<?>) arrayList0);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: -2145338308, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }
}
