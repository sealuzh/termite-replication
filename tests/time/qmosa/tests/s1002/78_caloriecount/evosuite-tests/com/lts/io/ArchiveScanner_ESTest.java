/*
 * This file was automatically generated by EvoSuite
 * Sun Nov 29 16:14:05 GMT 2020
 */

package com.lts.io;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.lts.io.ArchiveScanner;
import com.lts.io.ImprovedFile;
import java.io.File;
import java.io.InputStream;
import java.util.Locale;
import java.util.Set;
import java.util.Vector;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.io.MockFile;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class ArchiveScanner_ESTest extends ArchiveScanner_ESTest_scaffolding {

  /**
  //Test case number: 0
  /*Coverage entropy=1.6179507056527689
  */
  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      ImprovedFile improvedFile0 = new ImprovedFile("m*D$C}q-6e'U2B7O00^f=.jar", "m*D$C}q-6e'U2B7O00^f=.jar");
      ArchiveScanner archiveScanner0 = new ArchiveScanner(improvedFile0);
      Vector<Integer> vector0 = new Vector<Integer>();
      archiveScanner0.dirsNotIncluded = vector0;
      archiveScanner0.setIncludes(archiveScanner0.DEFAULT_ARCHIVE_EXTENSIONS);
      MockFile.createTempFile("/home/ubuntu/termite/projects/78_caloriecount/m*D$C}q-6e'U2B7O00^f=.jar/m*D$C}q-6e'U2B7O00^f=.jar", "m*D$l}q-De'U2B7O00^f=.jar0R3\"0r?{EDwnir'_Dp.jar.jar", (File) improvedFile0);
      ImprovedFile.createTempImprovedFile("q&FSuTS #Y0app.proerties.jar02e@e,4;|\".jar", "{,-2y<`LnLt", improvedFile0);
      // Undeclared exception!
      try { 
        archiveScanner0.scandir(improvedFile0, "4:Ck$ijE#?)I8ZT^", true);
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
      ImprovedFile improvedFile0 = new ImprovedFile("!");
      ArchiveScanner archiveScanner0 = new ArchiveScanner(improvedFile0);
      String[] stringArray0 = new String[1];
      stringArray0[0] = "!";
      archiveScanner0.excludes = stringArray0;
      Vector<InputStream> vector0 = new Vector<InputStream>();
      archiveScanner0.dirsNotIncluded = vector0;
      archiveScanner0.setIncludes(stringArray0);
      // Undeclared exception!
      try { 
        archiveScanner0.processArchive(improvedFile0, "!");
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
      ImprovedFile improvedFile0 = new ImprovedFile("!");
      ArchiveScanner archiveScanner0 = new ArchiveScanner(improvedFile0);
      String[] stringArray0 = new String[1];
      stringArray0[0] = "!";
      archiveScanner0.excludes = stringArray0;
      Vector<Object> vector0 = new Vector<Object>();
      archiveScanner0.filesNotIncluded = vector0;
      archiveScanner0.setIncludes(stringArray0);
      // Undeclared exception!
      try { 
        archiveScanner0.processArchive(improvedFile0, "!");
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
  /*Coverage entropy=0.5623351446188083
  */
  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      ImprovedFile improvedFile0 = new ImprovedFile("!");
      ArchiveScanner archiveScanner0 = new ArchiveScanner(improvedFile0);
      String[] stringArray0 = new String[1];
      stringArray0[0] = "!";
      archiveScanner0.excludes = stringArray0;
      Vector<Integer> vector0 = new Vector<Integer>();
      archiveScanner0.dirsExcluded = vector0;
      archiveScanner0.setIncludes(stringArray0);
      // Undeclared exception!
      try { 
        archiveScanner0.processArchive(improvedFile0, "!");
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
  /*Coverage entropy=0.5623351446188083
  */
  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      ImprovedFile improvedFile0 = new ImprovedFile("!");
      ArchiveScanner archiveScanner0 = new ArchiveScanner(improvedFile0);
      archiveScanner0.excludes = archiveScanner0.DEFAULT_ARCHIVE_EXTENSIONS;
      Vector<Object> vector0 = new Vector<Object>();
      archiveScanner0.dirsNotIncluded = vector0;
      String[] stringArray0 = new String[3];
      stringArray0[0] = "r?{EDwnfirN'_Dp";
      stringArray0[1] = "!";
      stringArray0[2] = "r?{EDwnfirN'_Dp";
      archiveScanner0.setIncludes(stringArray0);
      // Undeclared exception!
      try { 
        archiveScanner0.processFile("!");
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
  /*Coverage entropy=0.5623351446188083
  */
  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      ImprovedFile improvedFile0 = new ImprovedFile("!");
      ArchiveScanner archiveScanner0 = new ArchiveScanner(improvedFile0);
      archiveScanner0.excludes = archiveScanner0.DEFAULT_ARCHIVE_EXTENSIONS;
      String[] stringArray0 = new String[3];
      stringArray0[0] = "!";
      stringArray0[1] = "!";
      stringArray0[2] = "r?{EDwnfirN'_Dp";
      archiveScanner0.setIncludes(stringArray0);
      Vector<String> vector0 = new Vector<String>();
      archiveScanner0.dirsExcluded = vector0;
      // Undeclared exception!
      try { 
        archiveScanner0.processFile("!");
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
      ImprovedFile improvedFile0 = new ImprovedFile("!");
      ArchiveScanner archiveScanner0 = new ArchiveScanner(improvedFile0);
      archiveScanner0.excludes = archiveScanner0.DEFAULT_ARCHIVE_EXTENSIONS;
      String[] stringArray0 = new String[3];
      stringArray0[0] = "r?{EDwnfirN'_Dp";
      stringArray0[1] = "!";
      stringArray0[2] = "r?{EDwnfirN'_Dp";
      Vector<Integer> vector0 = new Vector<Integer>();
      archiveScanner0.filesExcluded = vector0;
      archiveScanner0.setIncludes(stringArray0);
      // Undeclared exception!
      try { 
        archiveScanner0.processFile("!");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.lts.io.ArchiveScanner", e);
      }
  }

  /**
  //Test case number: 7
  /*Coverage entropy=0.5623351446188083
  */
  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      ImprovedFile improvedFile0 = new ImprovedFile("!");
      ArchiveScanner archiveScanner0 = new ArchiveScanner(improvedFile0);
      String[] stringArray0 = new String[1];
      stringArray0[0] = "!";
      archiveScanner0.excludes = stringArray0;
      Vector<Integer> vector0 = new Vector<Integer>();
      archiveScanner0.dirsNotIncluded = vector0;
      archiveScanner0.setIncludes(stringArray0);
      // Undeclared exception!
      try { 
        archiveScanner0.processFile("!");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.lts.io.ArchiveScanner", e);
      }
  }

  /**
  //Test case number: 8
  /*Coverage entropy=0.5623351446188083
  */
  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      ImprovedFile improvedFile0 = new ImprovedFile("!");
      ArchiveScanner archiveScanner0 = new ArchiveScanner(improvedFile0);
      String[] stringArray0 = new String[1];
      stringArray0[0] = "!";
      archiveScanner0.excludes = stringArray0;
      archiveScanner0.setIncludes(archiveScanner0.excludes);
      Vector<String> vector0 = new Vector<String>();
      archiveScanner0.dirsExcluded = vector0;
      // Undeclared exception!
      try { 
        archiveScanner0.processFile("!");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.lts.io.ArchiveScanner", e);
      }
  }

  /**
  //Test case number: 9
  /*Coverage entropy=0.5623351446188083
  */
  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      ImprovedFile improvedFile0 = new ImprovedFile("!");
      ArchiveScanner archiveScanner0 = new ArchiveScanner(improvedFile0);
      String[] stringArray0 = new String[1];
      stringArray0[0] = "!";
      archiveScanner0.excludes = stringArray0;
      archiveScanner0.setIncludes(archiveScanner0.excludes);
      Locale locale0 = Locale.JAPAN;
      Set<String> set0 = locale0.getUnicodeLocaleAttributes();
      Vector<String> vector0 = new Vector<String>(set0);
      archiveScanner0.dirsExcluded = vector0;
      archiveScanner0.processDirectory(improvedFile0, "!", true);
      assertEquals(0L, improvedFile0.lastModified());
  }

  /**
  //Test case number: 10
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      ImprovedFile improvedFile0 = new ImprovedFile("!", "!");
      ArchiveScanner archiveScanner0 = new ArchiveScanner(improvedFile0);
      archiveScanner0.setIncludes(archiveScanner0.DEFAULT_ARCHIVE_EXTENSIONS);
      Vector<Integer> vector0 = new Vector<Integer>();
      archiveScanner0.filesNotIncluded = vector0;
      archiveScanner0.processFile(".u[aXy6KB");
      assertEquals(1, ArchiveScanner.DIRECTORY);
  }

  /**
  //Test case number: 11
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      ImprovedFile improvedFile0 = new ImprovedFile("!");
      ArchiveScanner archiveScanner0 = new ArchiveScanner(improvedFile0);
      archiveScanner0.setIncludes(archiveScanner0.DEFAULT_ARCHIVE_EXTENSIONS);
      Vector<String> vector0 = new Vector<String>();
      archiveScanner0.filesNotIncluded = vector0;
      archiveScanner0.processArchive(improvedFile0, "!");
      assertFalse(improvedFile0.exists());
  }

  /**
  //Test case number: 12
  /*Coverage entropy=1.0042424730540764
  */
  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      ImprovedFile improvedFile0 = new ImprovedFile("!");
      ArchiveScanner archiveScanner0 = new ArchiveScanner(improvedFile0);
      int int0 = archiveScanner0.toFileType(improvedFile0);
      assertEquals(0, int0);
  }

  /**
  //Test case number: 13
  /*Coverage entropy=0.5623351446188083
  */
  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      ImprovedFile improvedFile0 = new ImprovedFile("!");
      ArchiveScanner archiveScanner0 = new ArchiveScanner(improvedFile0);
      boolean boolean0 = archiveScanner0.isArchive(improvedFile0);
      assertFalse(boolean0);
  }

  /**
  //Test case number: 14
  /*Coverage entropy=1.0114042647073516
  */
  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      ImprovedFile improvedFile0 = new ImprovedFile("\"Y3O");
      ArchiveScanner archiveScanner0 = new ArchiveScanner(improvedFile0);
      int int0 = archiveScanner0.toFileType(improvedFile0);
      //  // Unstable assertion: assertEquals(2, int0);
  }

  /**
  //Test case number: 15
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      ImprovedFile improvedFile0 = new ImprovedFile(",!");
      ArchiveScanner archiveScanner0 = new ArchiveScanner(improvedFile0);
      try { 
        archiveScanner0.scandir(improvedFile0, (String) null, false);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // IO error scanning directory /home/ubuntu/termite/projects/78_caloriecount/,!
         //
         verifyException("com.lts.io.ArchiveScanner", e);
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
        archiveScanner0.scandir((File) null, "n%@e&pYY/8", false);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.lts.io.ArchiveScanner", e);
      }
  }

  /**
  //Test case number: 17
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      ImprovedFile improvedFile0 = new ImprovedFile("!");
      ArchiveScanner archiveScanner0 = new ArchiveScanner(improvedFile0);
      try { 
        archiveScanner0.scanArchive(improvedFile0, "");
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Error trying to list archive, !
         //
         verifyException("com.lts.io.archive.AbstractNestedArchive", e);
      }
  }

  /**
  //Test case number: 18
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      ImprovedFile improvedFile0 = new ImprovedFile("!");
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
  //Test case number: 19
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      ImprovedFile improvedFile0 = new ImprovedFile("`h");
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
  //Test case number: 20
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      ImprovedFile improvedFile0 = new ImprovedFile("!", "!");
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
  //Test case number: 21
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      ArchiveScanner archiveScanner0 = new ArchiveScanner((ImprovedFile) null);
      // Undeclared exception!
      try { 
        archiveScanner0.processDirectory((File) null, "Error trying to create temp directory, 08mGql]`_$gN1+B.jar", false);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.lts.io.DirectoryScanner", e);
      }
  }

  /**
  //Test case number: 22
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      ImprovedFile improvedFile0 = new ImprovedFile("!", "!");
      ArchiveScanner archiveScanner0 = new ArchiveScanner(improvedFile0);
      // Undeclared exception!
      try { 
        archiveScanner0.processArchive(improvedFile0, (String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.lts.io.DirectoryScanner", e);
      }
  }

  /**
  //Test case number: 23
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      ImprovedFile improvedFile0 = new ImprovedFile("");
      ArchiveScanner archiveScanner0 = new ArchiveScanner(improvedFile0);
      // Undeclared exception!
      try { 
        archiveScanner0.processArchive(improvedFile0, "");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.lts.io.DirectoryScanner", e);
      }
  }

  /**
  //Test case number: 24
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      ImprovedFile improvedFile0 = new ImprovedFile("!");
      ArchiveScanner archiveScanner0 = new ArchiveScanner(improvedFile0);
      // Undeclared exception!
      try { 
        archiveScanner0.processArchive((File) null, "n}h_}- <;4dK&oW;D0n}h_}- <;4dK&oW;D.jar");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.lts.io.DirectoryScanner", e);
      }
  }

  /**
  //Test case number: 25
  /*Coverage entropy=0.5623351446188083
  */
  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      ImprovedFile improvedFile0 = new ImprovedFile("repos");
      ArchiveScanner archiveScanner0 = new ArchiveScanner(improvedFile0);
      boolean boolean0 = archiveScanner0.isArchive(improvedFile0);
      //  // Unstable assertion: assertTrue(boolean0);
  }

  /**
  //Test case number: 26
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      ImprovedFile improvedFile0 = ImprovedFile.createTempImprovedFile("!.jar", "!.jar", (File) null);
      ArchiveScanner archiveScanner0 = new ArchiveScanner(improvedFile0);
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
  //Test case number: 27
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      ImprovedFile improvedFile0 = new ImprovedFile("m*D$l}q-6e'U2B7O00^f=.jar0*2Y.jar");
      ArchiveScanner archiveScanner0 = new ArchiveScanner(improvedFile0);
      try { 
        archiveScanner0.scandir(improvedFile0, "", false);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // IO error scanning directory /home/ubuntu/termite/projects/78_caloriecount/m*D$l}q-6e'U2B7O00^f=.jar0*2Y.jar
         //
         verifyException("com.lts.io.ArchiveScanner", e);
      }
  }

  /**
  //Test case number: 28
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      MockFile mockFile0 = new MockFile(".jar", ".jar");
      ImprovedFile improvedFile0 = new ImprovedFile(".jar", ".jar");
      ArchiveScanner archiveScanner0 = new ArchiveScanner(improvedFile0);
      try { 
        archiveScanner0.scanArchive(mockFile0, (String) null);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Error trying to list archive, /home/ubuntu/termite/projects/78_caloriecount/.jar/.jar
         //
         verifyException("com.lts.io.archive.AbstractNestedArchive", e);
      }
  }

  /**
  //Test case number: 29
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      ArchiveScanner archiveScanner0 = new ArchiveScanner((ImprovedFile) null);
      // Undeclared exception!
      try { 
        archiveScanner0.scanArchive((File) null, ".ear");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.lts.io.archive.AbstractNestedArchive", e);
      }
  }

  /**
  //Test case number: 30
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
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
  //Test case number: 31
  /*Coverage entropy=0.5623351446188083
  */
  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      ImprovedFile improvedFile0 = new ImprovedFile("!", "!");
      ArchiveScanner archiveScanner0 = new ArchiveScanner(improvedFile0);
      String[] stringArray0 = new String[1];
      stringArray0[0] = "!";
      archiveScanner0.excludes = archiveScanner0.DEFAULT_ARCHIVE_EXTENSIONS;
      archiveScanner0.setIncludes(stringArray0);
      // Undeclared exception!
      try { 
        archiveScanner0.processArchive(improvedFile0, "!");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.lts.io.ArchiveScanner", e);
      }
  }

  /**
  //Test case number: 32
  /*Coverage entropy=0.8675632284814612
  */
  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      ImprovedFile improvedFile0 = new ImprovedFile("m*D$C}q-6e'U2B7O00^f=.jar", "m*D$C}q-6e'U2B7O00^f=.jar");
      ArchiveScanner archiveScanner0 = new ArchiveScanner(improvedFile0);
      Vector<Integer> vector0 = new Vector<Integer>();
      archiveScanner0.dirsNotIncluded = vector0;
      archiveScanner0.setIncludes(archiveScanner0.DEFAULT_ARCHIVE_EXTENSIONS);
      try { 
        archiveScanner0.processDirectory(improvedFile0, "", true);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // IO error scanning directory /home/ubuntu/termite/projects/78_caloriecount/m*D$C}q-6e'U2B7O00^f=.jar/m*D$C}q-6e'U2B7O00^f=.jar
         //
         verifyException("com.lts.io.ArchiveScanner", e);
      }
  }

  /**
  //Test case number: 33
  /*Coverage entropy=1.0905994737794786
  */
  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      ImprovedFile improvedFile0 = new ImprovedFile("m*D$C}q-6e'U2B7O00^f=.jar", "m*D$C}q-6e'U2B7O00^f=.jar");
      ArchiveScanner archiveScanner0 = new ArchiveScanner(improvedFile0);
      Vector<Integer> vector0 = new Vector<Integer>();
      archiveScanner0.dirsNotIncluded = vector0;
      archiveScanner0.setIncludes(archiveScanner0.DEFAULT_ARCHIVE_EXTENSIONS);
      MockFile.createTempFile("/home/ubuntu/termite/projects/78_caloriecount/m*D$C}q-6e'U2B7O00^f=.jar/m*D$C}q-6e'U2B7O00^f=.jar", "m*D$l}q-De'U2B7O00^f=.jar0R3\"0r?{EDwnir'_Dp.jar.jar", (File) improvedFile0);
      archiveScanner0.scandir(improvedFile0, "4:Ck$ijE#?)I8ZT^", true);
      assertEquals(2, ArchiveScanner.ARCHIVE);
  }

  /**
  //Test case number: 34
  /*Coverage entropy=0.8675632284814612
  */
  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      ImprovedFile improvedFile0 = new ImprovedFile("!");
      ArchiveScanner archiveScanner0 = new ArchiveScanner(improvedFile0);
      archiveScanner0.excludes = archiveScanner0.DEFAULT_ARCHIVE_EXTENSIONS;
      String[] stringArray0 = new String[3];
      stringArray0[0] = "r?{EDwn&irN'_Dp";
      stringArray0[1] = "!";
      stringArray0[2] = "r?{EDwn&irN'_Dp";
      Vector<String> vector0 = new Vector<String>();
      archiveScanner0.dirsIncluded = vector0;
      archiveScanner0.setIncludes(stringArray0);
      try { 
        archiveScanner0.processDirectory(improvedFile0, "r?{EDwn&irN'_Dp", true);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // IO error scanning directory /home/ubuntu/termite/projects/78_caloriecount/!
         //
         verifyException("com.lts.io.ArchiveScanner", e);
      }
  }

  /**
  //Test case number: 35
  /*Coverage entropy=1.6083949200545278
  */
  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      ImprovedFile improvedFile0 = new ImprovedFile("m*D$C}q-6e'U2B7O00^f=.jar", "m*D$C}q-6e'U2B7O00^f=.jar");
      ArchiveScanner archiveScanner0 = new ArchiveScanner(improvedFile0);
      Vector<Integer> vector0 = new Vector<Integer>();
      archiveScanner0.dirsNotIncluded = vector0;
      archiveScanner0.setIncludes(archiveScanner0.DEFAULT_ARCHIVE_EXTENSIONS);
      MockFile.createTempFile("/home/ubuntu/termite/projects/78_caloriecount/m*D$C}q-6e'U2B7O00^f=.jar/m*D$C}q-6e'U2B7O00^f=.jar", "m*D$l}q-De'U2B7O00^f=.jar0R3\"0r?{EDwnir'_Dp.jar.jar", (File) improvedFile0);
      // Undeclared exception!
      try { 
        archiveScanner0.scandir(improvedFile0, "/home/ubuntu/termite/projects/78_caloriecount/m*D$C}q-6e'U2B7O00^f=.jar/m*D$C}q-6e'U2B7O00^f=.jar", false);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.lts.io.ArchiveScanner", e);
      }
  }
}
