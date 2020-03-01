/*
 * This file was automatically generated by EvoSuite
 * Tue Dec 03 20:05:34 GMT 2019
 */

package net.kencochrane.a4j.file;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.File;
import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.Comparator;
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
  /*Coverage entropy=2.7717125398560998
  */
  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("/KP|$&O^QXK>_KP|$&O^QXK>_NULL.XML");
      byte[] byteArray0 = new byte[9];
      byteArray0[1] = (byte)49;
      byteArray0[2] = (byte) (-65);
      byteArray0[3] = (byte)58;
      byteArray0[4] = (byte) (-1);
      byteArray0[5] = (byte) (-124);
      byteArray0[6] = (byte) (-51);
      fileUtil0.getSimilarItems("*>&kwC;Qp$<c", "`\"k5\"sn");
      byteArray0[7] = (byte)67;
      byteArray0[8] = (byte)20;
      fileUtil0.downloadKeywordSearchFile("kp|$&O^qxk>", "I", "r?<Ur2S=0B<Cba~\"y", "KAH-Css0f%9FQ)");
      FileSystemHandling.createFolder(evoSuiteFile0);
      byte[] byteArray1 = new byte[1];
      byteArray1[0] = (byte)1;
      FileSystemHandling.appendDataToFile(evoSuiteFile0, byteArray1);
      fileUtil0.getBrowseNodeFile("kp|$&O^qxk>", "kp|$&O^qxk>", (String) null);
      fileUtil0.fetchBlendedSearchFile("", (String) null);
      File file0 = fileUtil0.downloadGenericSearchFile("pF0<", "Tu", "pF0<", "pF0<", "k", "B+c(F41qBytIHf1Rc6");
      assertNull(file0);
  }

  /**
  //Test case number: 1
  /*Coverage entropy=2.883806816913132
  */
  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      fileUtil0.deleteFile("");
      ArrayList<Object> arrayList0 = new ArrayList<Object>();
      Object object0 = new Object();
      arrayList0.add(object0);
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("/A_.XML");
      byte[] byteArray0 = new byte[2];
      byteArray0[0] = (byte)68;
      byteArray0[1] = (byte)46;
      FileSystemHandling.appendDataToFile(evoSuiteFile0, byteArray0);
      arrayList0.sort(comparator0);
      EvoSuiteFile evoSuiteFile1 = new EvoSuiteFile("/_]P_L-__CACHEDIR.XML");
      FileSystemHandling.createFolder(evoSuiteFile1);
      Integer integer0 = new Integer(962);
      arrayList0.add((Object) integer0);
      fileUtil0.getAccessories("", arrayList0);
      fileUtil0.fetchBlendedSearchFile("", "");
      fileUtil0.getSimilarItems("", "");
      fileUtil0.getASINFile("", "{", "1", (String) null);
      fileUtil0.getAccessories("|N}Uk&", arrayList0);
      fileUtil0.fetchASINFile("", "", "]p_L-", "cacheDir");
      fileUtil0.downloadThirdPartySearchFile("lg_h'wl*I", "", "", (String) null);
      FileInputStream fileInputStream0 = fileUtil0.fetchAccessories("", arrayList0);
      assertEquals(2, fileInputStream0.available());
  }

  /**
  //Test case number: 2
  /*Coverage entropy=2.8467103628435937
  */
  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("/KP|$&O^QXK>_KP|$&O^QXK>_NULL.XML");
      byte[] byteArray0 = new byte[9];
      byteArray0[0] = (byte)19;
      byteArray0[1] = (byte)49;
      byteArray0[2] = (byte) (-65);
      byteArray0[3] = (byte)58;
      byteArray0[4] = (byte) (-1);
      byteArray0[5] = (byte) (-124);
      byteArray0[6] = (byte) (-51);
      fileUtil0.getSimilarItems("*>&kwC;Qp$<c", "y`r#k5\"sn");
      byteArray0[7] = (byte)67;
      byteArray0[8] = (byte)20;
      FileSystemHandling.appendDataToFile(evoSuiteFile0, byteArray0);
      byte[] byteArray1 = new byte[1];
      byteArray1[0] = (byte)1;
      fileUtil0.getBrowseNodeFile("kp|$&O^qxk>", "kp|$&O^qxk>", (String) null);
      fileUtil0.fetchBlendedSearchFile("", (String) null);
      fileUtil0.downloadGenericSearchFile("pF0<", "Tu", "pF0<", "pF0<", "k", "B+c(F41qBytIHf1Rc6");
      File file0 = fileUtil0.getASINFile("*>&kwC;Qp$<c", "k", "k", "");
      assertNull(file0);
  }

  /**
  //Test case number: 3
  /*Coverage entropy=2.8613608338485346
  */
  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      fileUtil0.deleteFile("");
      ArrayList<Object> arrayList0 = new ArrayList<Object>();
      Object object0 = new Object();
      arrayList0.add(object0);
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      arrayList0.sort(comparator0);
      Integer integer0 = new Integer(962);
      arrayList0.add((Object) integer0);
      EvoSuiteURL evoSuiteURL0 = new EvoSuiteURL("http://xml.amazon.net/onca/xml3?t=popcornmonste2-20&dev-t=DSB0XDDW1GQ3S&AsinSearch=&type={&offerpage=null&offer=1&f=xml");
      NetworkHandling.createRemoteTextFile(evoSuiteURL0, "");
      fileUtil0.getAccessories("", arrayList0);
      fileUtil0.fetchBlendedSearchFile("", "");
      fileUtil0.getSimilarItems("", "");
      fileUtil0.getASINFile("", "{", "1", (String) null);
      fileUtil0.getAccessories("|N}Uk&", arrayList0);
      fileUtil0.fetchASINFile("", "", "]p_L-", "cacheDir");
      fileUtil0.downloadThirdPartySearchFile("lg_h'wl*I", "", "", (String) null);
      File file0 = fileUtil0.downloadThirdPartySearchFile("]p_L-", "all", "v+6C", "v\">m");
      assertNull(file0);
  }

  /**
  //Test case number: 4
  /*Coverage entropy=2.7918614056000144
  */
  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      fileUtil0.deleteFile("");
      ArrayList<Object> arrayList0 = new ArrayList<Object>();
      Object object0 = new Object();
      arrayList0.add(object0);
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("/A_.XML");
      byte[] byteArray0 = new byte[2];
      byteArray0[0] = (byte)68;
      byteArray0[1] = (byte) (-29);
      FileSystemHandling.appendDataToFile(evoSuiteFile0, byteArray0);
      arrayList0.sort(comparator0);
      EvoSuiteFile evoSuiteFile1 = new EvoSuiteFile("/_]P_L-__CACHEDIR.XML");
      FileSystemHandling.createFolder(evoSuiteFile1);
      Integer integer0 = new Integer((-494));
      arrayList0.add((Object) integer0);
      fileUtil0.getAccessories("", arrayList0);
      fileUtil0.fetchBlendedSearchFile("", "");
      fileUtil0.getSimilarItems("", "");
      fileUtil0.getASINFile("", "]p_L-", "1", (String) null);
      fileUtil0.getAccessories("|N}Uk&", arrayList0);
      fileUtil0.fetchASINFile("", "", "]p_L-", "cacheDir");
      fileUtil0.fetchAccessories((String) null, arrayList0);
      System.setCurrentTimeMillis((-1411L));
  }

  /**
  //Test case number: 5
  /*Coverage entropy=1.4841652152843623
  */
  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      FileUtil fileUtil1 = new FileUtil();
      FileInputStream fileInputStream0 = fileUtil1.fetchKeywordSearchFile("86-ibZ='D%q&,%O6KH", "t_", "t_", "ShoppingCart=modify&f=xml&dev-t=");
      assertNull(fileInputStream0);
  }

  /**
  //Test case number: 6
  /*Coverage entropy=2.2653188729187956
  */
  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      byte[] byteArray0 = new byte[9];
      byteArray0[0] = (byte)19;
      ArrayList<Object> arrayList0 = new ArrayList<Object>();
      Object object0 = new Object();
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      arrayList0.sort(comparator0);
      fileUtil0.fetchBNFile("kp|$&O^qxk>", "", "_-)*7?)v");
      fileUtil0.fetchAccessories("lmwrT);V", arrayList0);
      System.setCurrentTimeMillis(1216L);
      Random.setNextRandom(2);
  }

  /**
  //Test case number: 7
  /*Coverage entropy=2.611642799829762
  */
  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      MockFile mockFile0 = new MockFile("lg<", "lg<");
      mockFile0.setWritable(true, true);
      mockFile0.delete();
      fileUtil0.isAgeGood(mockFile0);
      fileUtil0.downloadThirdPartySearchFile("nes", "cacheLife", "uaszFoRsox", "uaszFoRsox");
      ArrayList<Object> arrayList0 = new ArrayList<Object>();
      fileUtil0.getAccessories("t_", arrayList0);
      fileUtil0.downloadGenericSearchFile("new", "k_", "cacheDir", "", "", "lg<");
      fileUtil0.downloadSimilaritesFile("lg<", "new", "cacheLife");
      fileUtil0.downloadThirdPartySearchFile("", "", " fX~_,!b$/~2X", "vV< og2(");
      fileUtil0.downloadBlendedSearchFile(" fX~_,!b$/~2X", "");
      Random.setNextRandom(665);
      fileUtil0.downloadKeywordSearchFile("", "SellerSearch=", "", "");
      File file0 = fileUtil0.downloadBlendedSearchFile("G", "");
      assertNull(file0);
  }

  /**
  //Test case number: 8
  /*Coverage entropy=2.783918207863857
  */
  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      ArrayList<Object> arrayList0 = new ArrayList<Object>();
      Integer[] integerArray0 = new Integer[6];
      int int0 = (-1);
      Integer integer0 = new Integer((-1));
      integerArray0[0] = integer0;
      Integer integer1 = new Integer(int0);
      integerArray0[1] = integer1;
      Integer integer2 = new Integer(int0);
      integerArray0[2] = integer2;
      Integer integer3 = new Integer(int0);
      integerArray0[3] = integer3;
      Integer integer4 = new Integer(int0);
      integerArray0[4] = integer4;
      Integer integer5 = new Integer(int0);
      integerArray0[5] = integer5;
      arrayList0.toArray(integerArray0);
      fileUtil0.downloadAccessoriesFile(":", arrayList0, ":");
      fileUtil0.cacheDir = "jo+";
      fileUtil0.fetchSimilarItems("associateID", ")TwcCYG");
      fileUtil0.downloadKeywordSearchFile("/U\"8", "5> .1Nnu", "y2%? ", "mb)DwwY?f|6As05iL2+");
      fileUtil0.downloadBlendedSearchFile("mb)DwwY?f|6As05iL2+", (String) null);
      fileUtil0.downloadThirdPartySearchFile("x,_COM(", ")TwcCYG", "", "/U\"8");
      fileUtil0.getBrowseNodeFile("YC.1Ls:#e($=xb", "ShoppingCart=remove&f=xml&dev-t=", "");
      fileUtil0.deleteFile("pm.]Y");
  }

  /**
  //Test case number: 9
  /*Coverage entropy=1.0931471805599453
  */
  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
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
  //Test case number: 10
  /*Coverage entropy=1.9193618394362675
  */
  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      fileUtil0.getSimilarItems("kp|$&O^qxk>", ">>");
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("/");
      byte[] byteArray0 = new byte[1];
      byteArray0[0] = (byte)1;
      FileSystemHandling.createFolder(evoSuiteFile0);
      File file0 = fileUtil0.getBrowseNodeFile("kp|$&O^qxk>", "kp|$&O^qxk>", (String) null);
      assertNull(file0);
  }

  /**
  //Test case number: 11
  /*Coverage entropy=2.0262478229265435
  */
  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      byte[] byteArray0 = new byte[9];
      byteArray0[0] = (byte)19;
      byteArray0[1] = (byte)49;
      byteArray0[2] = (byte) (-65);
      byteArray0[3] = (byte)58;
      byteArray0[4] = (byte) (-1);
      byteArray0[5] = (byte) (-124);
      byteArray0[6] = (byte) (-51);
      FileUtil fileUtil1 = new FileUtil();
      fileUtil1.downloadGenericSearchFile("", "g*tek7t.GcMsfuN\".k", "qE:P4hKg{d", "g*tek7t.GcMsfuN\".k", "ta_", "onpA@0]L('o<c");
      FileUtil fileUtil2 = new FileUtil();
      fileUtil2.downloadSimilaritesFile("new", "", "-uXNbYtqOQl_");
      fileUtil1.downloadThirdPartySearchFile("", ",j~SYTi", (String) null, "");
      File file0 = fileUtil2.downloadBlendedSearchFile("AsinSearch", "g*tek7t.GcMsfuN\".k");
      assertNull(file0);
  }

  /**
  //Test case number: 12
  /*Coverage entropy=2.4274499803344325
  */
  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      fileUtil0.deleteFile("");
      ArrayList<Object> arrayList0 = new ArrayList<Object>();
      Object object0 = new Object();
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      arrayList0.sort(comparator0);
      fileUtil0.fetchBNFile("lmwrT);V", "lmwrT);V", "");
      fileUtil0.fetchAccessories("L", arrayList0);
      System.setCurrentTimeMillis(0L);
      Random.setNextRandom((-1001));
      File file0 = fileUtil0.getAccessories("}/28c+eA`rS+Swy*@8~", arrayList0);
      assertNull(file0);
  }

  /**
  //Test case number: 13
  /*Coverage entropy=1.4682921994113465
  */
  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      Object object0 = new Object();
      ArrayList<Object> arrayList0 = new ArrayList<Object>();
      Integer integer0 = new Integer(0);
      ArrayList<Object> arrayList1 = new ArrayList<Object>();
      Integer integer1 = new Integer((-1));
      arrayList1.add((Object) integer0);
      Object object1 = new Object();
      Object object2 = new Object();
      arrayList1.add((Object) "kp|$&O^qxk>");
      Object object3 = new Object();
      arrayList0.add((Object) null);
      fileUtil0.fetchGenericSearchFile("", "cacheLife", "G#", "all", "G#", "AnTn}m]'");
      ArrayList<String> arrayList2 = new ArrayList<String>();
      Random.setNextRandom((-2145316660));
  }

  /**
  //Test case number: 14
  /*Coverage entropy=1.4682921994113465
  */
  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      FileInputStream fileInputStream0 = fileUtil0.fetchKeywordSearchFile("k_", "PR]ZIh", "O !", "k_");
      assertNull(fileInputStream0);
  }

  /**
  //Test case number: 15
  /*Coverage entropy=1.7842068034002128
  */
  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      String string0 = "d{0#Y4%ee!;Yw.9xr>V";
      fileUtil0.renameFile("", "d{0#Y4%ee!;Yw.9xr>V");
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("/home/ubuntu/termite/projects/2_a4j");
      FileSystemHandling.appendStringToFile(evoSuiteFile0, "");
      fileUtil0.downloadBrowseNodeFile("", "d{0#Y4%ee!;Yw.9xr>V", "d{0#Y4%ee!;Yw.9xr>V", "");
      String string1 = "'HhfAc\\Fk9,$-jk-Y";
      String string2 = "_m76";
      String string3 = "FQKKgc<irS^!|aiNk S";
      fileUtil0.downloadKeywordSearchFile("'HhfAcFk9,$-jk-Y", "", "_m76", "FQKKgc<irS^!|aiNk S");
      String string4 = "";
      // Undeclared exception!
      try { 
        fileUtil0.renameFile("d{0#Y4%ee!;Yw.9xr>V", (String) null);
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
  /*Coverage entropy=1.0365141682948127
  */
  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      ArrayList<Object> arrayList0 = new ArrayList<Object>();
      FileUtil fileUtil0 = new FileUtil();
      fileUtil0.renameFile("~eDO$", "=L@Nby{Di&?l|EZ}*");
  }

  /**
  //Test case number: 17
  /*Coverage entropy=2.6893297407098276
  */
  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      ArrayList<Object> arrayList0 = new ArrayList<Object>();
      Integer[] integerArray0 = new Integer[6];
      int int0 = (-1);
      Integer integer0 = new Integer((-1));
      integerArray0[0] = integer0;
      Integer integer1 = new Integer(int0);
      integerArray0[1] = integer1;
      Integer integer2 = new Integer(int0);
      integerArray0[2] = integer2;
      Integer integer3 = new Integer(int0);
      integerArray0[3] = integer3;
      Integer integer4 = new Integer(int0);
      integerArray0[4] = integer4;
      Integer integer5 = new Integer(int0);
      integerArray0[5] = integer5;
      arrayList0.toArray(integerArray0);
      arrayList0.add((Object) ":");
      fileUtil0.downloadAccessoriesFile(":", arrayList0, ":");
      fileUtil0.downloadBlendedSearchFile("associateID", (String) null);
      fileUtil0.cacheDir = "jo+";
      fileUtil0.fetchSimilarItems("associateID", ")TwcCYG");
      fileUtil0.downloadKeywordSearchFile("/U\"8", "5> .1Nnu", "y2%? ", "mb)DwwY?f|6As05iL2+");
      fileUtil0.downloadBlendedSearchFile("mb)DwwY?f|6As05iL2+", (String) null);
      System.setCurrentTimeMillis(int0);
      fileUtil0.isAgeGood((File) null);
      FileInputStream fileInputStream0 = fileUtil0.fetchThirdPartySearchFile("eaLIXLXmZt^Ggn>d", ")TwcCYG", "mb)DwwY?f|6As05iL2+", "jo+");
      assertNull(fileInputStream0);
  }

  /**
  //Test case number: 18
  /*Coverage entropy=2.466266517864739
  */
  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      ArrayList<Object> arrayList0 = new ArrayList<Object>();
      fileUtil0.fetchAccessories("", arrayList0);
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("/A_.XML");
      FileSystemHandling.createFolder(evoSuiteFile0);
      fileUtil0.fetchBNFile("", "", (String) null);
      fileUtil0.fetchAccessories("", arrayList0);
      System.setCurrentTimeMillis((-69L));
  }

  /**
  //Test case number: 19
  /*Coverage entropy=2.214734015212756
  */
  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      fileUtil0.downloadBrowseNodeFile("", "net.kencochrane.a4j.util.LoadProperties", "wC6e75!ZsC", "B}");
      fileUtil0.downloadKeywordSearchFile("dev-t=", "cacheLife", "=L@Nby{Di&?l|EZ}*", "Ai");
      fileUtil0.downloadCart("new");
      fileUtil0.downloadBlendedSearchFile("wC6e75!ZsC", (String) null);
      fileUtil0.downloadThirdPartySearchFile((String) null, "", "%o^dU4+VzDwrl0i[]", "_*':a& >sFb\"AA7?I8#");
      fileUtil0.downloadThirdPartySearchFile("net.kencochrane.a4j.util.LoadProperties", "a_", "FQKwgc<irS^!|aiNk S", "=L@Nby{Di&?l|EZ}*");
      System.setCurrentTimeMillis(0L);
  }

  /**
  //Test case number: 20
  /*Coverage entropy=1.4942662253853725
  */
  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      MockFile mockFile0 = new MockFile("l<", "l<");
      mockFile0.setWritable(true, true);
      mockFile0.delete();
      fileUtil0.fetchThirdPartySearchFile("E%k)`?L k", "l<", "g_", "gBTJCSM#8:SeAj ");
      FileInputStream fileInputStream0 = fileUtil0.fetchThirdPartySearchFile("X~8Q?cMV@", "gBTJCSM#8:SeAj ", "@>2U]", "gBTJCSM#8:SeAj ");
      assertNull(fileInputStream0);
  }

  /**
  //Test case number: 21
  /*Coverage entropy=1.6969987794394545
  */
  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      FileUtil fileUtil1 = new FileUtil();
      FileInputStream fileInputStream0 = fileUtil0.fetchASINFile("", "nJW$Qm", "PR]ZIh", "4Qb'\"0MR>SNQ?c.2{");
      assertNull(fileInputStream0);
  }

  /**
  //Test case number: 22
  /*Coverage entropy=1.0931471805599453
  */
  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      boolean boolean0 = fileUtil0.downloadOneASINFile("cacheDir", "cacheDir", "PcruTEwlBu", "cacheDir", "cacheDir");
      assertFalse(boolean0);
  }

  /**
  //Test case number: 23
  /*Coverage entropy=1.4682921994113465
  */
  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      FileUtil fileUtil0 = new FileUtil();
      ArrayList<Object> arrayList0 = new ArrayList<Object>();
      Object object0 = new Object();
      arrayList0.add(object0);
      Object object1 = new Object();
      arrayList0.add(object1);
      arrayList0.add((Object) ":");
      FileInputStream fileInputStream0 = fileUtil0.fetchGenericSearchFile("ShoppingCart=modify&f=xml&dev-t=", "", "s2Ehi`CejT 2", (String) null, "", "ShoppingCart=modify&f=xml&dev-t=");
      assertNull(fileInputStream0);
  }
}
