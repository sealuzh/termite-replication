/*
 * This file was automatically generated by EvoSuite
 * Wed Nov 11 13:54:47 GMT 2020
 */

package com.lts.io;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.lts.io.ArchiveScanner;
import com.lts.io.ImprovedFile;
import java.io.File;
import java.io.FilterInputStream;
import java.io.InputStream;
import java.util.Locale;
import java.util.Vector;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.io.MockFile;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class ArchiveScanner_ESTest extends ArchiveScanner_ESTest_scaffolding {

  /**
  //Test case number: 0
  /*Coverage entropy=0.5623351446188083
  */
  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      ImprovedFile improvedFile0 = new ImprovedFile("FvUFXjz{2hf+'\"9");
      ArchiveScanner archiveScanner0 = new ArchiveScanner(improvedFile0);
      String[] stringArray0 = new String[1];
      stringArray0[0] = "FvUFXjz{2hf+'\"9";
      archiveScanner0.setExcludes(stringArray0);
      ArchiveScanner archiveScanner1 = new ArchiveScanner(improvedFile0);
      Vector<String> vector0 = new Vector<String>();
      archiveScanner0.dirsIncluded = vector0;
      archiveScanner0.includes = archiveScanner1.DEFAULT_ARCHIVE_EXTENSIONS;
      // Undeclared exception!
      try { 
        archiveScanner0.processArchive(improvedFile0, "=%r%j7>kBRNI");
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
      ImprovedFile improvedFile0 = new ImprovedFile("FvUFXjz{2hf+'\"9", "=%r%j7>kBRNI");
      ArchiveScanner archiveScanner0 = new ArchiveScanner(improvedFile0);
      String[] stringArray0 = new String[1];
      stringArray0[0] = "FvUFXjz{2hf+'\"9";
      archiveScanner0.setExcludes(stringArray0);
      ArchiveScanner archiveScanner1 = new ArchiveScanner(improvedFile0);
      Vector<Integer> vector0 = new Vector<Integer>();
      archiveScanner0.filesNotIncluded = vector0;
      archiveScanner0.includes = archiveScanner1.DEFAULT_ARCHIVE_EXTENSIONS;
      archiveScanner0.processArchive(improvedFile0, "=%r%j7>kBRNI");
      assertTrue(improvedFile0.isFile());
  }

  /**
  //Test case number: 2
  /*Coverage entropy=0.5623351446188083
  */
  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      ImprovedFile improvedFile0 = new ImprovedFile("FvUFXjz{2hf+'\"9");
      ArchiveScanner archiveScanner0 = new ArchiveScanner(improvedFile0);
      String[] stringArray0 = new String[1];
      Vector<InputStream> vector0 = new Vector<InputStream>();
      archiveScanner0.dirsExcluded = vector0;
      stringArray0[0] = "FvUFXjz{2hf+'\"9";
      archiveScanner0.setExcludes(stringArray0);
      ArchiveScanner archiveScanner1 = new ArchiveScanner(improvedFile0);
      archiveScanner0.includes = archiveScanner1.DEFAULT_ARCHIVE_EXTENSIONS;
      // Undeclared exception!
      try { 
        archiveScanner0.processArchive(improvedFile0, "=%r%j7>kBRNI");
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
      ImprovedFile improvedFile0 = new ImprovedFile("FvUFXjz{2hf+'\"9");
      ArchiveScanner archiveScanner0 = new ArchiveScanner(improvedFile0);
      String[] stringArray0 = new String[1];
      stringArray0[0] = "FvUFXjz{2hf+'\"9";
      archiveScanner0.setExcludes(stringArray0);
      ArchiveScanner archiveScanner1 = new ArchiveScanner(improvedFile0);
      Vector<Object> vector0 = new Vector<Object>();
      archiveScanner0.filesExcluded = vector0;
      archiveScanner0.includes = archiveScanner1.DEFAULT_ARCHIVE_EXTENSIONS;
      // Undeclared exception!
      try { 
        archiveScanner0.processArchive(improvedFile0, "=%r%j7>kBRNI");
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
      String[] stringArray0 = new String[1];
      archiveScanner0.excludes = archiveScanner0.DEFAULT_ARCHIVE_EXTENSIONS;
      archiveScanner0.excludes = stringArray0;
      Vector<Locale.LanguageRange> vector0 = new Vector<Locale.LanguageRange>();
      archiveScanner0.filesExcluded = vector0;
      stringArray0[0] = "2cP]*pn!w<[uF4:bQ02cP]*pn!vw<[uy4:Q.jar";
      archiveScanner0.includes = stringArray0;
      archiveScanner0.processArchive((File) null, "2cP]*pn!w<[uF4:bQ02cP]*pn!vw<[uy4:Q.jar");
      assertEquals(1, ArchiveScanner.DIRECTORY);
  }

  /**
  //Test case number: 5
  /*Coverage entropy=0.5623351446188083
  */
  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      ImprovedFile improvedFile0 = new ImprovedFile("=%r%j7>kBRNI");
      ArchiveScanner archiveScanner0 = new ArchiveScanner(improvedFile0);
      String[] stringArray0 = new String[1];
      stringArray0[0] = "=%r%j7>kBRNI";
      Vector<Object> vector0 = new Vector<Object>();
      archiveScanner0.dirsNotIncluded = vector0;
      archiveScanner0.setExcludes(stringArray0);
      ArchiveScanner archiveScanner1 = new ArchiveScanner(improvedFile0);
      archiveScanner0.includes = archiveScanner1.DEFAULT_ARCHIVE_EXTENSIONS;
      // Undeclared exception!
      try { 
        archiveScanner0.processFile("=%r%j7>kBRNI");
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
      ImprovedFile improvedFile0 = new ImprovedFile(".jar");
      ArchiveScanner archiveScanner0 = new ArchiveScanner(improvedFile0);
      Vector<Object> vector0 = new Vector<Object>();
      archiveScanner0.dirsIncluded = vector0;
      String[] stringArray0 = new String[1];
      stringArray0[0] = ".jar";
      archiveScanner0.setExcludes(stringArray0);
      archiveScanner0.includes = stringArray0;
      // Undeclared exception!
      try { 
        archiveScanner0.processFile(".jar");
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
      ImprovedFile improvedFile0 = new ImprovedFile("IO error scanning directory ");
      ArchiveScanner archiveScanner0 = new ArchiveScanner(improvedFile0);
      String[] stringArray0 = new String[1];
      stringArray0[0] = "IO error scanning directory ";
      archiveScanner0.setExcludes(stringArray0);
      Vector<InputStream> vector0 = new Vector<InputStream>();
      archiveScanner0.filesIncluded = vector0;
      archiveScanner0.includes = stringArray0;
      // Undeclared exception!
      try { 
        archiveScanner0.processFile("IO error scanning directory ");
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
      ImprovedFile improvedFile0 = new ImprovedFile(".jar");
      ArchiveScanner archiveScanner0 = new ArchiveScanner(improvedFile0);
      String[] stringArray0 = new String[1];
      stringArray0[0] = ".jar";
      Vector<Object> vector0 = new Vector<Object>();
      archiveScanner0.dirsExcluded = vector0;
      archiveScanner0.setExcludes(stringArray0);
      archiveScanner0.includes = stringArray0;
      // Undeclared exception!
      try { 
        archiveScanner0.processFile(".jar");
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
  /*Coverage entropy=0.8675632284814612
  */
  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      ImprovedFile improvedFile0 = new ImprovedFile("$3jqw`d 76", "{TZ5");
      ArchiveScanner archiveScanner0 = new ArchiveScanner(improvedFile0);
      String[] stringArray0 = new String[0];
      Vector<Object> vector0 = new Vector<Object>();
      archiveScanner0.dirsNotIncluded = vector0;
      archiveScanner0.setIncludes(stringArray0);
      archiveScanner0.haveSlowResults = true;
      try { 
        archiveScanner0.processDirectory(improvedFile0, "{TZ5", false);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // IO error scanning directory /home/ubuntu/replication/scripts/projects/78_caloriecount/$3jqw`d 76/{TZ5
         //
         verifyException("com.lts.io.ArchiveScanner", e);
      }
  }

  /**
  //Test case number: 10
  /*Coverage entropy=0.5623351446188083
  */
  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      ArchiveScanner archiveScanner0 = new ArchiveScanner((ImprovedFile) null);
      String[] stringArray0 = new String[12];
      archiveScanner0.excludes = stringArray0;
      stringArray0[0] = "oAlF-oqA;h";
      Vector<Integer> vector0 = new Vector<Integer>();
      archiveScanner0.dirsExcluded = vector0;
      archiveScanner0.includes = stringArray0;
      archiveScanner0.processDirectory((File) null, "oAlF-oqA;h", true);
      assertEquals(2, ArchiveScanner.ARCHIVE);
  }

  /**
  //Test case number: 11
  /*Coverage entropy=0.5623351446188083
  */
  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      ImprovedFile improvedFile0 = new ImprovedFile("crea{eAode1junk=%r%j7>kBRNI", "crea{eAode1junk=%r%j7>kBRNI");
      ArchiveScanner archiveScanner0 = new ArchiveScanner(improvedFile0);
      boolean boolean0 = archiveScanner0.isArchive(improvedFile0);
      //  // Unstable assertion: assertTrue(boolean0);
  }

  /**
  //Test case number: 12
  /*Coverage entropy=0.6365141682948128
  */
  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      ImprovedFile improvedFile0 = new ImprovedFile("=%r%j7>kBRNI");
      ArchiveScanner archiveScanner0 = new ArchiveScanner(improvedFile0);
      String[] stringArray0 = new String[1];
      stringArray0[0] = "FvUFXz{2hf+'\"9";
      archiveScanner0.setExcludes(stringArray0);
      Vector<InputStream> vector0 = new Vector<InputStream>();
      archiveScanner0.filesIncluded = vector0;
      ArchiveScanner archiveScanner1 = new ArchiveScanner(improvedFile0);
      archiveScanner0.includes = archiveScanner1.DEFAULT_ARCHIVE_EXTENSIONS;
      // Undeclared exception!
      try { 
        archiveScanner0.processFile("=%r%j7>kBRNI");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.lts.io.ArchiveScanner", e);
      }
  }

  /**
  //Test case number: 13
  /*Coverage entropy=1.522955067531318
  */
  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      MockFile mockFile0 = new MockFile("=y'z&r-oB(c");
      MockFile.createTempFile("crea{eAode", "Ad(8]0Ad(8].jar", (File) mockFile0);
      ImprovedFile improvedFile0 = ImprovedFile.createTempDirectory("}oYEo-w70Oa!", "junk", (File) mockFile0);
      ArchiveScanner archiveScanner0 = new ArchiveScanner(improvedFile0);
      Vector<FilterInputStream> vector0 = new Vector<FilterInputStream>();
      archiveScanner0.filesNotIncluded = vector0;
      String[] stringArray0 = new String[0];
      archiveScanner0.includes = stringArray0;
      // Undeclared exception!
      try { 
        archiveScanner0.scandir(mockFile0, "ZZZ[RhHTv", true);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.lts.io.ArchiveScanner", e);
      }
  }

  /**
  //Test case number: 14
  /*Coverage entropy=1.0751393240053733
  */
  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      ImprovedFile improvedFile0 = new ImprovedFile(";$3j_Kw` 76", "com.lts.pest.swing.PestTree");
      ArchiveScanner archiveScanner0 = new ArchiveScanner(improvedFile0);
      String[] stringArray0 = new String[0];
      Vector<Object> vector0 = new Vector<Object>();
      archiveScanner0.dirsNotIncluded = vector0;
      archiveScanner0.setIncludes(stringArray0);
      improvedFile0.createTempDir();
      archiveScanner0.processDirectory(improvedFile0, " to aof4le, ", false);
      assertEquals("/home/ubuntu/replication/scripts/projects/78_caloriecount/;$3j_Kw` 76/com.lts.pest.swing.PestTree", improvedFile0.toString());
  }

  /**
  //Test case number: 15
  /*Coverage entropy=1.5306052420589422
  */
  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      MockFile mockFile0 = new MockFile("=y'z&r-oB(c");
      MockFile.createTempFile("crea{eAode", "Ad(8]0Q8]jar", (File) mockFile0);
      ImprovedFile improvedFile0 = ImprovedFile.createTempDirectory("}oYEo-w70Oa!", "junk", (File) mockFile0);
      ArchiveScanner archiveScanner0 = new ArchiveScanner(improvedFile0);
      Vector<FilterInputStream> vector0 = new Vector<FilterInputStream>();
      archiveScanner0.filesNotIncluded = vector0;
      String[] stringArray0 = new String[0];
      archiveScanner0.includes = stringArray0;
      // Undeclared exception!
      try { 
        archiveScanner0.scandir(mockFile0, "ZZZ[RhHTv", true);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
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
  //Test case number: 17
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      ImprovedFile improvedFile0 = new ImprovedFile(".er");
      ArchiveScanner archiveScanner0 = new ArchiveScanner(improvedFile0);
      try { 
        archiveScanner0.scandir(improvedFile0, "", true);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // IO error scanning directory /home/ubuntu/replication/scripts/projects/78_caloriecount/.er
         //
         verifyException("com.lts.io.ArchiveScanner", e);
      }
  }

  /**
  //Test case number: 18
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      ImprovedFile improvedFile0 = new ImprovedFile(";$3j_Kw` 76", "com.lts.pest.swing.PestTree");
      ArchiveScanner archiveScanner0 = new ArchiveScanner(improvedFile0);
      try { 
        archiveScanner0.scanArchive(improvedFile0, "");
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Error trying to list archive, /home/ubuntu/replication/scripts/projects/78_caloriecount/;$3j_Kw` 76/com.lts.pest.swing.PestTree
         //
         verifyException("com.lts.io.archive.AbstractNestedArchive", e);
      }
  }

  /**
  //Test case number: 19
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      ArchiveScanner archiveScanner0 = new ArchiveScanner((ImprovedFile) null);
      // Undeclared exception!
      try { 
        archiveScanner0.scanArchive((File) null, "=9&KI=(&pi7r_)");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.lts.io.archive.AbstractNestedArchive", e);
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
      ImprovedFile improvedFile0 = new ImprovedFile("`?ub9H9", "`?ub9H9");
      ArchiveScanner archiveScanner0 = new ArchiveScanner(improvedFile0);
      int int0 = archiveScanner0.toFileType(improvedFile0);
      assertEquals(0, int0);
  }

  /**
  //Test case number: 22
  /*Coverage entropy=1.0042424730540764
  */
  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      ImprovedFile improvedFile0 = new ImprovedFile("`?ub9H9", "ZF+");
      ArchiveScanner archiveScanner0 = new ArchiveScanner(improvedFile0);
      int int0 = archiveScanner0.toFileType(improvedFile0);
      //  // Unstable assertion: assertEquals(2, int0);
  }

  /**
  //Test case number: 23
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      ImprovedFile improvedFile0 = new ImprovedFile("`?ub9H9", "ZF+");
      improvedFile0.createTempDir("`?ub9H9", "4z:MVI");
      ArchiveScanner archiveScanner0 = new ArchiveScanner(improvedFile0);
      int int0 = archiveScanner0.toFileType(improvedFile0);
      assertEquals(1, int0);
  }

  /**
  //Test case number: 24
  /*Coverage entropy=0.5623351446188083
  */
  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      ImprovedFile improvedFile0 = new ImprovedFile("`?ub9H9", "Zl");
      ArchiveScanner archiveScanner0 = new ArchiveScanner(improvedFile0);
      boolean boolean0 = archiveScanner0.isArchive(improvedFile0);
      assertFalse(boolean0);
  }

  /**
  //Test case number: 25
  /*Coverage entropy=0.6365141682948128
  */
  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      MockFile mockFile0 = new MockFile("=y'z&r-oB(c");
      ImprovedFile improvedFile0 = ImprovedFile.createTempDirectory("}oYEo-w70Oa!", "junk", (File) mockFile0);
      ArchiveScanner archiveScanner0 = new ArchiveScanner(improvedFile0);
      archiveScanner0.scandir(improvedFile0, "crea{eAode", false);
      assertTrue(improvedFile0.canRead());
  }

  /**
  //Test case number: 26
  /*Coverage entropy=0.6365141682948128
  */
  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      ImprovedFile improvedFile0 = new ImprovedFile("F~c!2)*H");
      ArchiveScanner archiveScanner0 = new ArchiveScanner(improvedFile0);
      String[] stringArray0 = new String[3];
      stringArray0[0] = "F~c!2)*H";
      stringArray0[1] = "F~c!2)*H";
      stringArray0[2] = "tempdir0=%r%j7>kBRNI";
      archiveScanner0.setIncludes(stringArray0);
      // Undeclared exception!
      try { 
        archiveScanner0.processFile("crea{eAode");
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
  /*Coverage entropy=0.5004024235381879
  */
  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      ImprovedFile improvedFile0 = new ImprovedFile("$3jqw`d 76", "-lha=zhz]o$_");
      ArchiveScanner archiveScanner0 = new ArchiveScanner(improvedFile0);
      String[] stringArray0 = new String[0];
      Vector<Object> vector0 = new Vector<Object>();
      archiveScanner0.dirsNotIncluded = vector0;
      archiveScanner0.setIncludes(stringArray0);
      archiveScanner0.processDirectory(improvedFile0, "$3jqw`d 76", true);
      assertEquals("/home/ubuntu/replication/scripts/projects/78_caloriecount/$3jqw`d 76", improvedFile0.getParent());
  }

  /**
  //Test case number: 28
  /*Coverage entropy=0.8675632284814612
  */
  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      ImprovedFile improvedFile0 = new ImprovedFile("FvUFXjz{2hf+'\"9", "=%r%j7>kBRNI");
      ArchiveScanner archiveScanner0 = new ArchiveScanner(improvedFile0);
      String[] stringArray0 = new String[1];
      stringArray0[0] = "FvUFXjz{2hf+'\"9";
      archiveScanner0.setExcludes(stringArray0);
      ArchiveScanner archiveScanner1 = new ArchiveScanner(improvedFile0);
      Vector<String> vector0 = new Vector<String>();
      archiveScanner0.dirsIncluded = vector0;
      archiveScanner0.includes = archiveScanner1.DEFAULT_ARCHIVE_EXTENSIONS;
      // Undeclared exception!
      try { 
        archiveScanner0.processDirectory(improvedFile0, "=%r%j7>kBRNI", true);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.lts.io.ArchiveScanner", e);
      }
  }

  /**
  //Test case number: 29
  /*Coverage entropy=0.7963116401738131
  */
  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      ImprovedFile improvedFile0 = new ImprovedFile("FvUFXjz{2hf+'\"9", "=%r%j7>kBRNI");
      ArchiveScanner archiveScanner0 = new ArchiveScanner(improvedFile0);
      String[] stringArray0 = new String[1];
      stringArray0[0] = "FvUFXjz{2hf+'\"9";
      archiveScanner0.setExcludes(stringArray0);
      ArchiveScanner archiveScanner1 = new ArchiveScanner(improvedFile0);
      Vector<String> vector0 = new Vector<String>();
      archiveScanner0.dirsIncluded = vector0;
      archiveScanner0.includes = archiveScanner1.DEFAULT_ARCHIVE_EXTENSIONS;
      // Undeclared exception!
      try { 
        archiveScanner0.processDirectory(improvedFile0, "=%r%j7>kBRNI", false);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.lts.io.ArchiveScanner", e);
      }
  }

  /**
  //Test case number: 30
  /*Coverage entropy=0.5623351446188083
  */
  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      ImprovedFile improvedFile0 = new ImprovedFile("FvUFXjz{2hf+'\"9", "=%r%j7>kBRNI");
      ArchiveScanner archiveScanner0 = new ArchiveScanner(improvedFile0);
      String[] stringArray0 = new String[1];
      stringArray0[0] = "FvUFXjz{2hf+'\"9";
      archiveScanner0.setExcludes(stringArray0);
      ArchiveScanner archiveScanner1 = new ArchiveScanner(improvedFile0);
      archiveScanner0.includes = archiveScanner1.DEFAULT_ARCHIVE_EXTENSIONS;
      // Undeclared exception!
      try { 
        archiveScanner0.processDirectory(improvedFile0, "=%r%j7>kBRNI", false);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.lts.io.ArchiveScanner", e);
      }
  }
}
