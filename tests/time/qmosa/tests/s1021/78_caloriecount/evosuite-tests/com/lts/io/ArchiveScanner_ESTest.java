/*
 * This file was automatically generated by EvoSuite
 * Mon Nov 30 07:43:32 GMT 2020
 */

package com.lts.io;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.lts.io.ArchiveScanner;
import com.lts.io.ImprovedFile;
import java.io.File;
import java.util.Vector;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class ArchiveScanner_ESTest extends ArchiveScanner_ESTest_scaffolding {

  /**
  //Test case number: 0
  /*Coverage entropy=0.5623351446188083
  */
  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      ArchiveScanner archiveScanner0 = new ArchiveScanner((ImprovedFile) null);
      String[] stringArray0 = new String[5];
      stringArray0[0] = "&wCe";
      stringArray0[1] = ",x^Cn2JE4Y7(UX";
      stringArray0[2] = "&wCe";
      stringArray0[3] = "";
      stringArray0[4] = ",x^Cn2JE4Y7(UX";
      archiveScanner0.setIncludes(stringArray0);
      Vector<String> vector0 = new Vector<String>();
      archiveScanner0.dirsIncluded = vector0;
      archiveScanner0.addDefaultExcludes();
      // Undeclared exception!
      try { 
        archiveScanner0.processArchive((File) null, ",x^Cn2JE4Y7(UX");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.lts.io.ArchiveScanner", e);
      }
  }

  /**
  //Test case number: 1
  /*Coverage entropy=0.5623351446188083
  */
  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      ArchiveScanner archiveScanner0 = new ArchiveScanner((ImprovedFile) null);
      String[] stringArray0 = new String[5];
      stringArray0[0] = "&wCe";
      stringArray0[1] = ",x^Cn2JE4Y7(UX";
      stringArray0[2] = "&wCe";
      stringArray0[3] = "";
      stringArray0[4] = ",x^Cn2JE4Y7(UX";
      archiveScanner0.setIncludes(stringArray0);
      Vector<Object> vector0 = new Vector<Object>();
      archiveScanner0.filesNotIncluded = vector0;
      archiveScanner0.addDefaultExcludes();
      // Undeclared exception!
      try { 
        archiveScanner0.processArchive((File) null, ",x^Cn2JE4Y7(UX");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.lts.io.ArchiveScanner", e);
      }
  }

  /**
  //Test case number: 2
  /*Coverage entropy=0.5623351446188083
  */
  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      ArchiveScanner archiveScanner0 = new ArchiveScanner((ImprovedFile) null);
      String[] stringArray0 = new String[5];
      Vector<String> vector0 = new Vector<String>();
      archiveScanner0.dirsExcluded = vector0;
      stringArray0[0] = "!z@*yP7^ij*yTN;";
      stringArray0[1] = "y-}#\"tB]";
      stringArray0[2] = "";
      stringArray0[3] = "em+aF";
      stringArray0[4] = "y-}#\"tB]";
      archiveScanner0.setIncludes(stringArray0);
      archiveScanner0.addDefaultExcludes();
      // Undeclared exception!
      try { 
        archiveScanner0.processFile("y-}#\"tB]");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.lts.io.ArchiveScanner", e);
      }
  }

  /**
  //Test case number: 3
  /*Coverage entropy=0.6365141682948128
  */
  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      ArchiveScanner archiveScanner0 = new ArchiveScanner((ImprovedFile) null);
      String[] stringArray0 = new String[5];
      stringArray0[0] = "&wCe";
      stringArray0[1] = "y-}#\"tB]";
      stringArray0[2] = "&wCe";
      stringArray0[3] = "";
      stringArray0[4] = "y-}#\"tB]";
      archiveScanner0.setIncludes(stringArray0);
      Vector<String> vector0 = new Vector<String>();
      archiveScanner0.dirsIncluded = vector0;
      // Undeclared exception!
      try { 
        archiveScanner0.processFile("m");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.lts.io.ArchiveScanner", e);
      }
  }

  /**
  //Test case number: 4
  /*Coverage entropy=0.6365141682948128
  */
  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      ArchiveScanner archiveScanner0 = new ArchiveScanner((ImprovedFile) null);
      Vector<Object> vector0 = new Vector<Object>();
      archiveScanner0.dirsExcluded = vector0;
      String[] stringArray0 = new String[7];
      stringArray0[0] = "";
      stringArray0[1] = "";
      stringArray0[2] = "";
      stringArray0[3] = "";
      stringArray0[4] = "";
      stringArray0[5] = "";
      stringArray0[6] = "";
      archiveScanner0.setIncludes(stringArray0);
      // Undeclared exception!
      try { 
        archiveScanner0.processFile(".ZIP");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.lts.io.ArchiveScanner", e);
      }
  }

  /**
  //Test case number: 5
  /*Coverage entropy=0.6365141682948128
  */
  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      ArchiveScanner archiveScanner0 = new ArchiveScanner((ImprovedFile) null);
      String[] stringArray0 = new String[5];
      stringArray0[0] = "&wln";
      stringArray0[1] = "y-}#\"tB]";
      stringArray0[2] = "&wln";
      stringArray0[3] = "&wln";
      stringArray0[4] = "y-}#\"tB]";
      archiveScanner0.setIncludes(stringArray0);
      Vector<String> vector0 = new Vector<String>();
      archiveScanner0.dirsIncluded = vector0;
      // Undeclared exception!
      try { 
        archiveScanner0.processDirectory((File) null, "yf>KN<]f_IPBXUR~Rt", true);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.lts.io.ArchiveScanner", e);
      }
  }

  /**
  //Test case number: 6
  /*Coverage entropy=0.5623351446188083
  */
  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      ImprovedFile improvedFile0 = new ImprovedFile("{", "SYYJG+-wM{O0(#{~>RuIi\"PAUGN.jar");
      ArchiveScanner archiveScanner0 = new ArchiveScanner(improvedFile0);
      boolean boolean0 = archiveScanner0.isArchive(improvedFile0);
      assertTrue(boolean0);
  }

  /**
  //Test case number: 7
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      ArchiveScanner archiveScanner0 = new ArchiveScanner((ImprovedFile) null);
      String[] stringArray0 = new String[0];
      archiveScanner0.setIncludes(stringArray0);
      Vector<String> vector0 = new Vector<String>(0, (-1454376107));
      archiveScanner0.filesNotIncluded = vector0;
      archiveScanner0.processArchive((File) null, ">NJ:0/=");
      assertEquals(2, ArchiveScanner.ARCHIVE);
  }

  /**
  //Test case number: 8
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      ImprovedFile improvedFile0 = new ImprovedFile((String) null, "w7o&|rN");
      ImprovedFile improvedFile1 = improvedFile0.createTempDir("m0y(k58:", "O");
      ArchiveScanner archiveScanner0 = new ArchiveScanner(improvedFile0);
      int int0 = archiveScanner0.toFileType(improvedFile1);
      assertEquals(1, int0);
  }

  /**
  //Test case number: 9
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      ArchiveScanner archiveScanner0 = new ArchiveScanner((ImprovedFile) null);
      // Undeclared exception!
      try { 
        archiveScanner0.toFileType((File) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.lts.io.ArchiveScanner", e);
      }
  }

  /**
  //Test case number: 10
  /*Coverage entropy=1.0027182645175161
  */
  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      ImprovedFile improvedFile0 = new ImprovedFile("", "");
      ArchiveScanner archiveScanner0 = new ArchiveScanner(improvedFile0);
      // Undeclared exception!
      try { 
        archiveScanner0.scandir(improvedFile0, "", true);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.lts.io.DirectoryScanner", e);
      }
  }

  /**
  //Test case number: 11
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      ArchiveScanner archiveScanner0 = new ArchiveScanner((ImprovedFile) null);
      // Undeclared exception!
      try { 
        archiveScanner0.scandir((File) null, ";QMB<ij}SF>%", true);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.lts.io.ArchiveScanner", e);
      }
  }

  /**
  //Test case number: 12
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      ImprovedFile improvedFile0 = new ImprovedFile((String) null, "");
      ArchiveScanner archiveScanner0 = new ArchiveScanner(improvedFile0);
      try { 
        archiveScanner0.scanArchive(improvedFile0, "");
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Error trying to list archive, 
         //
         verifyException("com.lts.io.archive.AbstractNestedArchive", e);
      }
  }

  /**
  //Test case number: 13
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      ImprovedFile improvedFile0 = new ImprovedFile("yxJc", "yxJc");
      ArchiveScanner archiveScanner0 = new ArchiveScanner(improvedFile0);
      // Undeclared exception!
      try { 
        archiveScanner0.processFile((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.lts.io.DirectoryScanner", e);
      }
  }

  /**
  //Test case number: 14
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      ImprovedFile improvedFile0 = new ImprovedFile((String) null, "");
      ArchiveScanner archiveScanner0 = new ArchiveScanner(improvedFile0);
      // Undeclared exception!
      try { 
        archiveScanner0.processFile("");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.lts.io.DirectoryScanner", e);
      }
  }

  /**
  //Test case number: 15
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      ImprovedFile improvedFile0 = new ImprovedFile("yxJc", "yxJc");
      ArchiveScanner archiveScanner0 = new ArchiveScanner(improvedFile0);
      // Undeclared exception!
      try { 
        archiveScanner0.processDirectory(improvedFile0, (String) null, true);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.lts.io.DirectoryScanner", e);
      }
  }

  /**
  //Test case number: 16
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      ArchiveScanner archiveScanner0 = new ArchiveScanner((ImprovedFile) null);
      // Undeclared exception!
      try { 
        archiveScanner0.processDirectory((File) null, "", true);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.lts.io.DirectoryScanner", e);
      }
  }

  /**
  //Test case number: 17
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      ArchiveScanner archiveScanner0 = new ArchiveScanner((ImprovedFile) null);
      String[] stringArray0 = new String[3];
      // Undeclared exception!
      try { 
        archiveScanner0.processArchive((File) null, stringArray0[0]);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.lts.io.DirectoryScanner", e);
      }
  }

  /**
  //Test case number: 18
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      ArchiveScanner archiveScanner0 = new ArchiveScanner((ImprovedFile) null);
      // Undeclared exception!
      try { 
        archiveScanner0.processArchive((File) null, "");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.lts.io.DirectoryScanner", e);
      }
  }

  /**
  //Test case number: 19
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      ImprovedFile improvedFile0 = new ImprovedFile("yxJc", "yxJc");
      ArchiveScanner archiveScanner0 = new ArchiveScanner(improvedFile0);
      // Undeclared exception!
      try { 
        archiveScanner0.processArchive(improvedFile0, "tx_c");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.lts.io.DirectoryScanner", e);
      }
  }

  /**
  //Test case number: 20
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      ArchiveScanner archiveScanner0 = new ArchiveScanner((ImprovedFile) null);
      // Undeclared exception!
      try { 
        archiveScanner0.isArchive((File) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.lts.io.ArchiveScanner", e);
      }
  }

  /**
  //Test case number: 21
  /*Coverage entropy=1.0114042647073516
  */
  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      ImprovedFile improvedFile0 = new ImprovedFile(".jar", "``yJwc|K");
      ArchiveScanner archiveScanner0 = new ArchiveScanner(improvedFile0);
      int int0 = archiveScanner0.toFileType(improvedFile0);
      assertEquals(0, int0);
  }

  /**
  //Test case number: 22
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      ImprovedFile improvedFile0 = new ImprovedFile("|d],>@K");
      ArchiveScanner archiveScanner0 = new ArchiveScanner(improvedFile0);
      try { 
        archiveScanner0.scanArchive(improvedFile0, "ld, ");
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Error trying to list archive, |d],>@K
         //
         verifyException("com.lts.io.archive.AbstractNestedArchive", e);
      }
  }

  /**
  //Test case number: 23
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      ArchiveScanner archiveScanner0 = new ArchiveScanner((ImprovedFile) null);
      // Undeclared exception!
      try { 
        archiveScanner0.scanArchive((File) null, (String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.lts.io.archive.AbstractNestedArchive", e);
      }
  }

  /**
  //Test case number: 24
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      ImprovedFile improvedFile0 = new ImprovedFile("yxJc", "yxJc");
      ArchiveScanner archiveScanner0 = new ArchiveScanner(improvedFile0);
      try { 
        archiveScanner0.scandir(improvedFile0, "yxJc", false);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // IO error scanning directory /home/ubuntu/termite/projects/78_caloriecount/yxJc/yxJc
         //
         verifyException("com.lts.io.ArchiveScanner", e);
      }
  }

  /**
  //Test case number: 25
  /*Coverage entropy=0.5623351446188083
  */
  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      ArchiveScanner archiveScanner0 = new ArchiveScanner((ImprovedFile) null);
      String[] stringArray0 = new String[5];
      stringArray0[0] = "*pv *t`a.hJnaG";
      stringArray0[1] = "*pv *t`a.hJnaG";
      stringArray0[2] = "DwCJ";
      stringArray0[3] = "?LM q?c";
      archiveScanner0.excludes = stringArray0;
      stringArray0[4] = "*pv *t`a.hJnaG";
      archiveScanner0.setIncludes(stringArray0);
      // Undeclared exception!
      try { 
        archiveScanner0.processArchive((File) null, "*pv *t`a.hJnaG");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.lts.io.ArchiveScanner", e);
      }
  }

  /**
  //Test case number: 26
  /*Coverage entropy=0.8675632284814612
  */
  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      ArchiveScanner archiveScanner0 = new ArchiveScanner((ImprovedFile) null);
      String[] stringArray0 = new String[5];
      stringArray0[0] = "wjke";
      stringArray0[1] = "y-}#\"tB]";
      stringArray0[2] = "wjke";
      stringArray0[3] = "ga._";
      stringArray0[4] = "y-}#\"tB]";
      archiveScanner0.setIncludes(stringArray0);
      Vector<String> vector0 = new Vector<String>();
      archiveScanner0.dirsIncluded = vector0;
      archiveScanner0.addDefaultExcludes();
      // Undeclared exception!
      try { 
        archiveScanner0.processDirectory((File) null, "ga._", true);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.lts.io.ArchiveScanner", e);
      }
  }

  /**
  //Test case number: 27
  /*Coverage entropy=0.7963116401738131
  */
  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      ArchiveScanner archiveScanner0 = new ArchiveScanner((ImprovedFile) null);
      String[] stringArray0 = new String[5];
      stringArray0[0] = "&wln";
      stringArray0[1] = "y-}#\"tB]";
      stringArray0[2] = "&wln";
      stringArray0[3] = "&wln";
      stringArray0[4] = "y-}#\"tB]";
      archiveScanner0.setIncludes(stringArray0);
      Vector<String> vector0 = new Vector<String>();
      archiveScanner0.dirsIncluded = vector0;
      archiveScanner0.addDefaultExcludes();
      // Undeclared exception!
      try { 
        archiveScanner0.processDirectory((File) null, "y-}#\"tB]", false);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.lts.io.ArchiveScanner", e);
      }
  }

  /**
  //Test case number: 28
  /*Coverage entropy=0.6365141682948128
  */
  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      ImprovedFile improvedFile0 = new ImprovedFile((String) null, "");
      ArchiveScanner archiveScanner0 = new ArchiveScanner(improvedFile0);
      archiveScanner0.scandir(improvedFile0, (String) null, true);
      assertEquals(2, ArchiveScanner.ARCHIVE);
  }
}
