/*
 * This file was automatically generated by EvoSuite
 * Sat Nov 28 22:16:13 GMT 2020
 */

package com.lts.io;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.lts.io.ArchiveScanner;
import com.lts.io.ImprovedFile;
import java.io.File;
import java.io.SequenceInputStream;
import java.util.Vector;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.io.MockFile;
import org.evosuite.runtime.testdata.EvoSuiteFile;
import org.evosuite.runtime.testdata.FileSystemHandling;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class ArchiveScanner_ESTest extends ArchiveScanner_ESTest_scaffolding {

  /**
  //Test case number: 0
  /*Coverage entropy=0.6365141682948128
  */
  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      ImprovedFile improvedFile0 = new ImprovedFile("Error trying to open file, ");
      ArchiveScanner archiveScanner0 = new ArchiveScanner(improvedFile0);
      archiveScanner0.includes = archiveScanner0.DEFAULT_ARCHIVE_EXTENSIONS;
      Vector<String> vector0 = new Vector<String>();
      archiveScanner0.dirsNotIncluded = vector0;
      // Undeclared exception!
      try { 
        archiveScanner0.processArchive(improvedFile0, "Error trying to open file, ");
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
  /*Coverage entropy=0.6365141682948128
  */
  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      ImprovedFile improvedFile0 = new ImprovedFile("Error trying to open file, ");
      ArchiveScanner archiveScanner0 = new ArchiveScanner(improvedFile0);
      archiveScanner0.includes = archiveScanner0.DEFAULT_ARCHIVE_EXTENSIONS;
      Vector<Integer> vector0 = new Vector<Integer>();
      archiveScanner0.dirsIncluded = vector0;
      // Undeclared exception!
      try { 
        archiveScanner0.processArchive(improvedFile0, "Error trying to open file, ");
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
  /*Coverage entropy=0.6365141682948128
  */
  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      ImprovedFile improvedFile0 = new ImprovedFile("Error trying to open file, ");
      ArchiveScanner archiveScanner0 = new ArchiveScanner(improvedFile0);
      archiveScanner0.includes = archiveScanner0.DEFAULT_ARCHIVE_EXTENSIONS;
      Vector<Object> vector0 = new Vector<Object>(2, 1);
      archiveScanner0.filesIncluded = vector0;
      // Undeclared exception!
      try { 
        archiveScanner0.processArchive(improvedFile0, "Error trying to open file, ");
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
      ImprovedFile improvedFile0 = new ImprovedFile("Error trying to open file, ");
      ArchiveScanner archiveScanner0 = new ArchiveScanner(improvedFile0);
      archiveScanner0.includes = archiveScanner0.DEFAULT_ARCHIVE_EXTENSIONS;
      Vector<Object> vector0 = new Vector<Object>();
      archiveScanner0.dirsExcluded = vector0;
      // Undeclared exception!
      try { 
        archiveScanner0.processArchive(improvedFile0, "Error trying to open file, ");
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
      ImprovedFile improvedFile0 = new ImprovedFile("Error trying to open file, ");
      ArchiveScanner archiveScanner0 = new ArchiveScanner(improvedFile0);
      Vector<Integer> vector0 = new Vector<Integer>();
      archiveScanner0.filesExcluded = vector0;
      archiveScanner0.includes = archiveScanner0.DEFAULT_ARCHIVE_EXTENSIONS;
      // Undeclared exception!
      try { 
        archiveScanner0.processArchive(improvedFile0, "Error trying to open file, ");
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
      ImprovedFile improvedFile0 = new ImprovedFile("(");
      ArchiveScanner archiveScanner0 = new ArchiveScanner(improvedFile0);
      String[] stringArray0 = new String[17];
      stringArray0[0] = "(";
      archiveScanner0.addDefaultExcludes();
      Vector<Object> vector0 = new Vector<Object>();
      archiveScanner0.filesIncluded = vector0;
      archiveScanner0.includes = stringArray0;
      archiveScanner0.processFile("(");
      assertEquals(2, ArchiveScanner.ARCHIVE);
  }

  /**
  //Test case number: 6
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      ImprovedFile improvedFile0 = new ImprovedFile("Error trying to open file, ");
      ArchiveScanner archiveScanner0 = new ArchiveScanner(improvedFile0);
      Vector<Integer> vector0 = new Vector<Integer>();
      archiveScanner0.filesNotIncluded = vector0;
      archiveScanner0.includes = archiveScanner0.DEFAULT_ARCHIVE_EXTENSIONS;
      archiveScanner0.processFile("Error trying to open file, ");
      assertEquals(0, ArchiveScanner.FILE);
  }

  /**
  //Test case number: 7
  /*Coverage entropy=0.8675632284814612
  */
  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      ImprovedFile improvedFile0 = new ImprovedFile("Error trying to open file, ", "Error trying to open file, ");
      ArchiveScanner archiveScanner0 = new ArchiveScanner(improvedFile0);
      archiveScanner0.includes = archiveScanner0.DEFAULT_ARCHIVE_EXTENSIONS;
      Vector<SequenceInputStream> vector0 = new Vector<SequenceInputStream>();
      archiveScanner0.dirsNotIncluded = vector0;
      archiveScanner0.haveSlowResults = true;
      try { 
        archiveScanner0.processDirectory(improvedFile0, "Error trying to open file, ", false);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // IO error scanning directory /home/ubuntu/termite/projects/78_caloriecount/Error trying to open file, /Error trying to open file, 
         //
         verifyException("com.lts.io.ArchiveScanner", e);
      }
  }

  /**
  //Test case number: 8
  /*Coverage entropy=1.0114042647073518
  */
  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      ImprovedFile improvedFile0 = new ImprovedFile("(");
      ImprovedFile improvedFile1 = improvedFile0.createTempDir();
      ArchiveScanner archiveScanner0 = new ArchiveScanner(improvedFile1);
      String[] stringArray0 = new String[17];
      stringArray0[0] = "(";
      improvedFile1.deleteDirectory(true);
      archiveScanner0.excludes = stringArray0;
      archiveScanner0.setBasedir((File) improvedFile0);
      archiveScanner0.scan();
      archiveScanner0.processDirectory(improvedFile1, "(", true);
      assertFalse(improvedFile1.isHidden());
  }

  /**
  //Test case number: 9
  /*Coverage entropy=0.5623351446188083
  */
  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      ImprovedFile improvedFile0 = new ImprovedFile("5.jar", "5.jar");
      ArchiveScanner archiveScanner0 = new ArchiveScanner(improvedFile0);
      boolean boolean0 = archiveScanner0.isArchive(improvedFile0);
      assertTrue(boolean0);
  }

  /**
  //Test case number: 10
  /*Coverage entropy=0.6365141682948128
  */
  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      ImprovedFile improvedFile0 = new ImprovedFile("(");
      ArchiveScanner archiveScanner0 = new ArchiveScanner(improvedFile0);
      String[] stringArray0 = new String[17];
      stringArray0[0] = "(";
      Vector<Integer> vector0 = new Vector<Integer>();
      archiveScanner0.filesExcluded = vector0;
      archiveScanner0.includes = stringArray0;
      archiveScanner0.excludes = stringArray0;
      archiveScanner0.processFile("(");
      assertEquals(0, ArchiveScanner.FILE);
  }

  /**
  //Test case number: 11
  /*Coverage entropy=0.5623351446188083
  */
  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      ImprovedFile improvedFile0 = new ImprovedFile("H6U=nC]Au&");
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
      ImprovedFile improvedFile0 = new ImprovedFile("");
      ArchiveScanner archiveScanner0 = new ArchiveScanner(improvedFile0);
      archiveScanner0.scandir(improvedFile0, (String) null, true);
      assertFalse(improvedFile0.isFile());
  }

  /**
  //Test case number: 13
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      ArchiveScanner archiveScanner0 = new ArchiveScanner((ImprovedFile) null);
      // Undeclared exception!
      try { 
        archiveScanner0.scandir((File) null, ";.V46:'GY1u2m]*f", false);
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
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
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
  //Test case number: 15
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      ArchiveScanner archiveScanner0 = new ArchiveScanner((ImprovedFile) null);
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
  //Test case number: 16
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      ImprovedFile improvedFile0 = new ImprovedFile("");
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
  //Test case number: 17
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      ArchiveScanner archiveScanner0 = new ArchiveScanner((ImprovedFile) null);
      // Undeclared exception!
      try { 
        archiveScanner0.processDirectory((File) null, (String) null, true);
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
  //Test case number: 19
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      ArchiveScanner archiveScanner0 = new ArchiveScanner((ImprovedFile) null);
      // Undeclared exception!
      try { 
        archiveScanner0.processArchive((File) null, (String) null);
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
  /*Coverage entropy=0.5623351446188083
  */
  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      ImprovedFile improvedFile0 = new ImprovedFile("J", "J");
      ArchiveScanner archiveScanner0 = new ArchiveScanner(improvedFile0);
      boolean boolean0 = archiveScanner0.isArchive(improvedFile0);
      assertFalse(boolean0);
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
  //Test case number: 22
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      ImprovedFile improvedFile0 = new ImprovedFile("");
      improvedFile0.deleteAll();
      ArchiveScanner archiveScanner0 = new ArchiveScanner(improvedFile0);
      try { 
        archiveScanner0.scandir(improvedFile0, "GpGo1)=t7)a5*'zI}+", true);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // IO error scanning directory /home/ubuntu/termite/projects/78_caloriecount
         //
         verifyException("com.lts.io.ArchiveScanner", e);
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
  //Test case number: 24
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      ArchiveScanner archiveScanner0 = new ArchiveScanner((ImprovedFile) null);
      // Undeclared exception!
      try { 
        archiveScanner0.scanArchive((File) null, "|F6RAOqZb");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.lts.io.archive.AbstractNestedArchive", e);
      }
  }

  /**
  //Test case number: 25
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
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
  //Test case number: 26
  /*Coverage entropy=1.3778195080390327
  */
  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      ImprovedFile improvedFile0 = new ImprovedFile("");
      ImprovedFile improvedFile1 = improvedFile0.createTempDir();
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("tempdir0");
      FileSystemHandling.createFolder(evoSuiteFile0);
      ArchiveScanner archiveScanner0 = new ArchiveScanner(improvedFile1);
      improvedFile1.deleteDirectory(false);
      // Undeclared exception!
      try { 
        archiveScanner0.scandir(improvedFile0, "", false);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.lts.io.DirectoryScanner", e);
      }
  }

  /**
  //Test case number: 27
  /*Coverage entropy=1.400326576231188
  */
  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      ImprovedFile improvedFile0 = new ImprovedFile("");
      ArchiveScanner archiveScanner0 = new ArchiveScanner(improvedFile0);
      MockFile.createTempFile("GuM59hnV4`L.jar", "g(-f:+!xy4c", (File) improvedFile0);
      // Undeclared exception!
      try { 
        archiveScanner0.scandir(improvedFile0, "!", false);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.lts.io.DirectoryScanner", e);
      }
  }

  /**
  //Test case number: 28
  /*Coverage entropy=1.3378606778364337
  */
  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      ImprovedFile improvedFile0 = new ImprovedFile("Error trying to open file, ");
      ImprovedFile improvedFile1 = improvedFile0.createTempDir("Error trying to open file, ", "Error trying to open file, ");
      ArchiveScanner archiveScanner0 = new ArchiveScanner(improvedFile1);
      archiveScanner0.excludes = archiveScanner0.DEFAULT_ARCHIVE_EXTENSIONS;
      archiveScanner0.setBasedir((File) improvedFile0);
      archiveScanner0.scan();
      archiveScanner0.processArchive(improvedFile1, ".JAR");
      assertNotSame(improvedFile0, improvedFile1);
  }

  /**
  //Test case number: 29
  /*Coverage entropy=0.5004024235381879
  */
  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      ImprovedFile improvedFile0 = new ImprovedFile("Error trying to open file, ");
      ArchiveScanner archiveScanner0 = new ArchiveScanner(improvedFile0);
      archiveScanner0.includes = archiveScanner0.DEFAULT_ARCHIVE_EXTENSIONS;
      Vector<SequenceInputStream> vector0 = new Vector<SequenceInputStream>();
      archiveScanner0.dirsNotIncluded = vector0;
      archiveScanner0.processDirectory(improvedFile0, "Error trying to open file, ", true);
      assertEquals(0, ArchiveScanner.FILE);
  }

  /**
  //Test case number: 30
  /*Coverage entropy=0.7963116401738131
  */
  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      ImprovedFile improvedFile0 = new ImprovedFile("(");
      ArchiveScanner archiveScanner0 = new ArchiveScanner(improvedFile0);
      String[] stringArray0 = new String[17];
      stringArray0[0] = "(";
      archiveScanner0.addDefaultExcludes();
      Vector<String> vector0 = new Vector<String>();
      archiveScanner0.dirsIncluded = vector0;
      archiveScanner0.includes = stringArray0;
      try { 
        archiveScanner0.processDirectory(improvedFile0, "(", false);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // IO error scanning directory /home/ubuntu/termite/projects/78_caloriecount/(
         //
         verifyException("com.lts.io.ArchiveScanner", e);
      }
  }

  /**
  //Test case number: 31
  /*Coverage entropy=1.0114042647073516
  */
  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      ImprovedFile improvedFile0 = new ImprovedFile("");
      ImprovedFile improvedFile1 = improvedFile0.createTempDir();
      ArchiveScanner archiveScanner0 = new ArchiveScanner(improvedFile1);
      improvedFile1.deleteDirectory(false);
      int int0 = archiveScanner0.toFileType(improvedFile1);
      //  // Unstable assertion: assertEquals(2, int0);
  }

  /**
  //Test case number: 32
  /*Coverage entropy=1.5118965585343875
  */
  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      ImprovedFile improvedFile0 = new ImprovedFile("Error trying to open file, ");
      ImprovedFile improvedFile1 = improvedFile0.createTempDir("Error trying to open file, ", "Error trying to open file, ");
      ArchiveScanner archiveScanner0 = new ArchiveScanner(improvedFile1);
      archiveScanner0.setBasedir((File) improvedFile0);
      archiveScanner0.scan();
      try { 
        archiveScanner0.processArchive(improvedFile1, ".JAR");
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Error trying to list archive, /home/ubuntu/termite/projects/78_caloriecount/Error trying to open file, /Error trying to open file, 0Error trying to open file, 
         //
         verifyException("com.lts.io.archive.AbstractNestedArchive", e);
      }
  }

  /**
  //Test case number: 33
  /*Coverage entropy=1.0042424730540764
  */
  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      ImprovedFile improvedFile0 = new ImprovedFile("");
      ArchiveScanner archiveScanner0 = new ArchiveScanner(improvedFile0);
      improvedFile0.deleteDirectory(false);
      int int0 = archiveScanner0.toFileType(improvedFile0);
      assertEquals(0, int0);
  }

  /**
  //Test case number: 34
  /*Coverage entropy=0.8675632284814612
  */
  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      ImprovedFile improvedFile0 = new ImprovedFile("Error trying to open file, ");
      ArchiveScanner archiveScanner0 = new ArchiveScanner(improvedFile0);
      archiveScanner0.includes = archiveScanner0.DEFAULT_ARCHIVE_EXTENSIONS;
      Vector<SequenceInputStream> vector0 = new Vector<SequenceInputStream>();
      archiveScanner0.dirsNotIncluded = vector0;
      try { 
        archiveScanner0.processDirectory(improvedFile0, "", true);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // IO error scanning directory /home/ubuntu/termite/projects/78_caloriecount/Error trying to open file, 
         //
         verifyException("com.lts.io.ArchiveScanner", e);
      }
  }
}
