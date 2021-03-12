/*
 * This file was automatically generated by EvoSuite
 * Sun Nov 08 08:26:37 GMT 2020
 */

package com.lts.io;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.lts.io.ArchiveScanner;
import com.lts.io.ImprovedFile;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.InputStream;
import java.util.Vector;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.io.MockFile;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class ArchiveScanner_ESTest extends ArchiveScanner_ESTest_scaffolding {

  /**
  //Test case number: 0
  /*Coverage entropy=1.0905994737794786
  */
  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      MockFile mockFile0 = new MockFile("java.io.tmpdir");
      ImprovedFile improvedFile0 = new ImprovedFile(mockFile0);
      ArchiveScanner archiveScanner0 = new ArchiveScanner(improvedFile0);
      String[] stringArray0 = new String[4];
      stringArray0[0] = "FL_X";
      stringArray0[1] = "/home/ubuntu/replication/scripts/projects/78_caloriecount/java.io.tmpdir";
      MockFile.createTempFile("FL_X", "/home/ubuntu/replication/scripts/projects/78_caloriecount/java.io.tmpdir", (File) mockFile0);
      Vector<Integer> vector0 = new Vector<Integer>(1, (-1432));
      archiveScanner0.dirsNotIncluded = vector0;
      improvedFile0.createTempDir();
      stringArray0[2] = "java.io.tmpdir";
      stringArray0[3] = "FL_X";
      archiveScanner0.setIncludes(stringArray0);
      archiveScanner0.scandir(improvedFile0, ";F4M", true);
      assertEquals(2, ArchiveScanner.ARCHIVE);
  }

  /**
  //Test case number: 1
  /*Coverage entropy=0.6365141682948128
  */
  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      ImprovedFile improvedFile0 = new ImprovedFile("**/.cvsignore");
      ArchiveScanner archiveScanner0 = new ArchiveScanner(improvedFile0);
      archiveScanner0.addDefaultExcludes();
      String[] stringArray0 = new String[5];
      stringArray0[0] = "hd";
      stringArray0[1] = "**/.cvsignore";
      stringArray0[2] = "**/.cvsignore";
      Vector<String> vector0 = new Vector<String>();
      archiveScanner0.filesExcluded = vector0;
      stringArray0[3] = "**/.cvsignore";
      stringArray0[4] = "**/.cvsignore";
      archiveScanner0.setIncludes(stringArray0);
      archiveScanner0.processArchive(improvedFile0, "**/.cvsignore");
      assertEquals(0L, improvedFile0.getFreeSpace());
  }

  /**
  //Test case number: 2
  /*Coverage entropy=0.6365141682948128
  */
  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      MockFile mockFile0 = new MockFile("java.io.tmpdir");
      ImprovedFile improvedFile0 = new ImprovedFile(mockFile0);
      ArchiveScanner archiveScanner0 = new ArchiveScanner(improvedFile0);
      String[] stringArray0 = new String[4];
      stringArray0[0] = "E\"L_X";
      stringArray0[1] = "java.io.tmpdir";
      Vector<BufferedInputStream> vector0 = new Vector<BufferedInputStream>();
      archiveScanner0.filesExcluded = vector0;
      stringArray0[2] = "java.io.tmpdir";
      stringArray0[3] = "E\"L_X";
      archiveScanner0.setIncludes(stringArray0);
      archiveScanner0.setExcludes(stringArray0);
      archiveScanner0.processFile("E\"L_X");
      assertEquals(0, ArchiveScanner.FILE);
  }

  /**
  //Test case number: 3
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      ImprovedFile improvedFile0 = new ImprovedFile("{3ij4", "{3ij4");
      ArchiveScanner archiveScanner0 = new ArchiveScanner(improvedFile0);
      Vector<Object> vector0 = new Vector<Object>();
      archiveScanner0.filesNotIncluded = vector0;
      String[] stringArray0 = new String[0];
      archiveScanner0.setIncludes(stringArray0);
      archiveScanner0.processFile("{3ij4");
      assertEquals(2, ArchiveScanner.ARCHIVE);
  }

  /**
  //Test case number: 4
  /*Coverage entropy=0.8675632284814612
  */
  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      MockFile mockFile0 = new MockFile("java.io.tmpdir");
      ImprovedFile improvedFile0 = new ImprovedFile(mockFile0);
      ArchiveScanner archiveScanner0 = new ArchiveScanner(improvedFile0);
      archiveScanner0.haveSlowResults = true;
      String[] stringArray0 = new String[4];
      stringArray0[0] = "E\"L_X";
      stringArray0[1] = "java.io.tmpdir";
      Vector<Integer> vector0 = new Vector<Integer>(1, (-1432));
      archiveScanner0.dirsNotIncluded = vector0;
      stringArray0[2] = "java.io.tmpdir";
      stringArray0[3] = "E\"L_X";
      archiveScanner0.setIncludes(stringArray0);
      try { 
        archiveScanner0.processDirectory(improvedFile0, "#]7", false);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // IO error scanning directory /home/ubuntu/replication/scripts/projects/78_caloriecount/java.io.tmpdir
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
      ImprovedFile improvedFile0 = new ImprovedFile("");
      ArchiveScanner archiveScanner0 = new ArchiveScanner(improvedFile0);
      archiveScanner0.addDefaultExcludes();
      String[] stringArray0 = new String[6];
      Vector<Integer> vector0 = new Vector<Integer>();
      archiveScanner0.dirsExcluded = vector0;
      stringArray0[0] = "**/.cvsignore";
      stringArray0[1] = "**/.cvsignore";
      stringArray0[2] = "**/.cvsignore";
      stringArray0[3] = "";
      stringArray0[4] = "";
      stringArray0[5] = "";
      archiveScanner0.setIncludes(stringArray0);
      archiveScanner0.processDirectory(improvedFile0, "**/.cvsignore", true);
      assertTrue(improvedFile0.canRead());
  }

  /**
  //Test case number: 6
  /*Coverage entropy=0.6365141682948128
  */
  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      MockFile mockFile0 = new MockFile("java.io.tmpdir");
      ImprovedFile improvedFile0 = new ImprovedFile(mockFile0);
      ArchiveScanner archiveScanner0 = new ArchiveScanner(improvedFile0);
      String[] stringArray0 = new String[4];
      stringArray0[0] = "E\"L_X";
      stringArray0[1] = "java.io.tmpdir";
      archiveScanner0.addDefaultExcludes();
      stringArray0[2] = "java.io.tmpdir";
      stringArray0[3] = "E\"L_X";
      archiveScanner0.setIncludes(stringArray0);
      Vector<String> vector0 = new Vector<String>();
      archiveScanner0.filesIncluded = vector0;
      archiveScanner0.processFile("E\"L_X");
      assertEquals(2, ArchiveScanner.ARCHIVE);
  }

  /**
  //Test case number: 7
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      ImprovedFile improvedFile0 = new ImprovedFile("{3ij4", "{3ij4");
      ArchiveScanner archiveScanner0 = new ArchiveScanner(improvedFile0);
      Vector<Object> vector0 = new Vector<Object>();
      archiveScanner0.filesNotIncluded = vector0;
      String[] stringArray0 = new String[2];
      stringArray0[0] = "{3ij4";
      stringArray0[1] = "{3ij4";
      archiveScanner0.setIncludes(stringArray0);
      archiveScanner0.processArchive(improvedFile0, "yc*F");
      assertEquals(2, ArchiveScanner.ARCHIVE);
  }

  /**
  //Test case number: 8
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      ImprovedFile improvedFile0 = new ImprovedFile("");
      ArchiveScanner archiveScanner0 = new ArchiveScanner(improvedFile0);
      improvedFile0.deleteAll();
      try { 
        archiveScanner0.scandir(improvedFile0, "o_F1SrY", true);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // IO error scanning directory /home/ubuntu/replication/scripts/projects/78_caloriecount
         //
         verifyException("com.lts.io.ArchiveScanner", e);
      }
  }

  /**
  //Test case number: 9
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      MockFile mockFile0 = new MockFile("java.io.tmpdir");
      ImprovedFile improvedFile0 = new ImprovedFile(mockFile0);
      ArchiveScanner archiveScanner0 = new ArchiveScanner(improvedFile0);
      try { 
        archiveScanner0.scanArchive(mockFile0, ".war");
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Error trying to list archive, java.io.tmpdir
         //
         verifyException("com.lts.io.archive.AbstractNestedArchive", e);
      }
  }

  /**
  //Test case number: 10
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      ArchiveScanner archiveScanner0 = new ArchiveScanner((ImprovedFile) null);
      // Undeclared exception!
      try { 
        archiveScanner0.scanArchive((File) null, "IlDN9H\u0007i^C=~>\"");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.lts.io.archive.AbstractNestedArchive", e);
      }
  }

  /**
  //Test case number: 11
  /*Coverage entropy=0.9502705392332347
  */
  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      MockFile mockFile0 = new MockFile("w6AD`L[6)c;D&Nrd");
      ImprovedFile improvedFile0 = new ImprovedFile(mockFile0);
      ArchiveScanner archiveScanner0 = new ArchiveScanner(improvedFile0);
      Vector<InputStream> vector0 = new Vector<InputStream>();
      archiveScanner0.filesIncluded = vector0;
      archiveScanner0.addDefaultExcludes();
      String[] stringArray0 = new String[1];
      stringArray0[0] = "w6AD`L[6)c;D&Nrd";
      archiveScanner0.setIncludes(stringArray0);
      try { 
        archiveScanner0.processArchive(improvedFile0, "w6AD`L[6)c;D&Nrd");
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Error trying to list archive, w6AD`L[6)c;D&Nrd
         //
         verifyException("com.lts.io.archive.AbstractNestedArchive", e);
      }
  }

  /**
  //Test case number: 12
  /*Coverage entropy=0.5004024235381879
  */
  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      MockFile mockFile0 = new MockFile("java.io.tmpdir");
      ImprovedFile improvedFile0 = new ImprovedFile(mockFile0);
      ArchiveScanner archiveScanner0 = new ArchiveScanner(improvedFile0);
      String[] stringArray0 = new String[4];
      stringArray0[0] = "E\"L_X";
      stringArray0[1] = "java.io.tmpdir";
      Vector<Integer> vector0 = new Vector<Integer>(1, (-1432));
      archiveScanner0.dirsNotIncluded = vector0;
      stringArray0[2] = "java.io.tmpdir";
      stringArray0[3] = "E\"L_X";
      archiveScanner0.setIncludes(stringArray0);
      archiveScanner0.processDirectory(improvedFile0, ".jar", true);
      assertEquals(0L, improvedFile0.getUsableSpace());
  }

  /**
  //Test case number: 13
  /*Coverage entropy=0.5623351446188083
  */
  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      ImprovedFile improvedFile0 = new ImprovedFile("");
      ArchiveScanner archiveScanner0 = new ArchiveScanner(improvedFile0);
      boolean boolean0 = archiveScanner0.isArchive(improvedFile0);
      assertFalse(boolean0);
  }

  /**
  //Test case number: 14
  /*Coverage entropy=1.3208883431493221
  */
  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      ImprovedFile improvedFile0 = new ImprovedFile("");
      ArchiveScanner archiveScanner0 = new ArchiveScanner(improvedFile0);
      ImprovedFile.createTempImprovedFile("qJUwM%%JN", "", improvedFile0);
      // Undeclared exception!
      try { 
        archiveScanner0.scandir(improvedFile0, "yY4jpoQj}*{C0!", false);
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
  /*Coverage entropy=0.5623351446188083
  */
  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      ImprovedFile improvedFile0 = new ImprovedFile("**/.cvsignore");
      ArchiveScanner archiveScanner0 = new ArchiveScanner(improvedFile0);
      archiveScanner0.addDefaultExcludes();
      String[] stringArray0 = new String[5];
      stringArray0[0] = "hd";
      stringArray0[1] = "**/.cvsignore";
      stringArray0[2] = "**/.cvsignore";
      stringArray0[3] = "**/.cvsignore";
      stringArray0[4] = "**/.cvsignore";
      archiveScanner0.setIncludes(stringArray0);
      // Undeclared exception!
      try { 
        archiveScanner0.processArchive(improvedFile0, "**/.cvsignore");
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
  /*Coverage entropy=0.5623351446188083
  */
  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      MockFile mockFile0 = new MockFile("java.io.tmpdir");
      ImprovedFile improvedFile0 = new ImprovedFile(mockFile0);
      ArchiveScanner archiveScanner0 = new ArchiveScanner(improvedFile0);
      String[] stringArray0 = new String[4];
      stringArray0[0] = "E\"L_X";
      stringArray0[1] = "java.io.tmpdir";
      stringArray0[2] = "java.io.tmpdir";
      stringArray0[3] = "E\"L_X";
      archiveScanner0.setIncludes(stringArray0);
      archiveScanner0.setExcludes(stringArray0);
      // Undeclared exception!
      try { 
        archiveScanner0.processFile("E\"L_X");
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
  /*Coverage entropy=0.8675632284814612
  */
  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      MockFile mockFile0 = new MockFile("java.io.tmpdir");
      ImprovedFile improvedFile0 = new ImprovedFile(mockFile0);
      ArchiveScanner archiveScanner0 = new ArchiveScanner(improvedFile0);
      String[] stringArray0 = new String[4];
      stringArray0[0] = "E\"L_X";
      stringArray0[1] = "java.io.tmpdir";
      Vector<Integer> vector0 = new Vector<Integer>();
      archiveScanner0.dirsNotIncluded = vector0;
      stringArray0[2] = "java.io.tmpdir";
      stringArray0[3] = "E\"L_X";
      archiveScanner0.setIncludes(stringArray0);
      try { 
        archiveScanner0.processDirectory(improvedFile0, "", true);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // IO error scanning directory /home/ubuntu/replication/scripts/projects/78_caloriecount/java.io.tmpdir
         //
         verifyException("com.lts.io.ArchiveScanner", e);
      }
  }

  /**
  //Test case number: 18
  /*Coverage entropy=0.8675632284814612
  */
  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      MockFile mockFile0 = new MockFile("java.io.tmpdir");
      ImprovedFile improvedFile0 = new ImprovedFile(mockFile0);
      ArchiveScanner archiveScanner0 = new ArchiveScanner(improvedFile0);
      Vector<BufferedInputStream> vector0 = new Vector<BufferedInputStream>();
      archiveScanner0.dirsIncluded = vector0;
      String[] stringArray0 = new String[4];
      stringArray0[0] = "E\"L_X";
      stringArray0[1] = "java.io.tmpdir";
      archiveScanner0.addDefaultExcludes();
      stringArray0[2] = "java.io.tmpdir";
      stringArray0[3] = "E\"L_X";
      archiveScanner0.setIncludes(stringArray0);
      try { 
        archiveScanner0.processDirectory(improvedFile0, "java.io.tmpdir", true);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // IO error scanning directory /home/ubuntu/replication/scripts/projects/78_caloriecount/java.io.tmpdir
         //
         verifyException("com.lts.io.ArchiveScanner", e);
      }
  }

  /**
  //Test case number: 19
  /*Coverage entropy=0.7963116401738131
  */
  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      MockFile mockFile0 = new MockFile("java.io.tmpdir");
      ImprovedFile improvedFile0 = new ImprovedFile(mockFile0);
      ArchiveScanner archiveScanner0 = new ArchiveScanner(improvedFile0);
      Vector<BufferedInputStream> vector0 = new Vector<BufferedInputStream>();
      archiveScanner0.dirsIncluded = vector0;
      String[] stringArray0 = new String[4];
      stringArray0[0] = "E\"L_X";
      stringArray0[1] = "java.io.tmpdir";
      archiveScanner0.addDefaultExcludes();
      stringArray0[2] = "java.io.tmpdir";
      stringArray0[3] = "E\"L_X";
      archiveScanner0.setIncludes(stringArray0);
      try { 
        archiveScanner0.processDirectory(improvedFile0, "java.io.tmpdir", false);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // IO error scanning directory /home/ubuntu/replication/scripts/projects/78_caloriecount/java.io.tmpdir
         //
         verifyException("com.lts.io.ArchiveScanner", e);
      }
  }

  /**
  //Test case number: 20
  /*Coverage entropy=0.5623351446188083
  */
  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      ImprovedFile improvedFile0 = new ImprovedFile("");
      ArchiveScanner archiveScanner0 = new ArchiveScanner(improvedFile0);
      archiveScanner0.addDefaultExcludes();
      String[] stringArray0 = new String[6];
      stringArray0[0] = "**/.cvsignore";
      stringArray0[1] = "**/.cvsignore";
      stringArray0[2] = "**/.cvsignore";
      stringArray0[3] = "";
      stringArray0[4] = "";
      stringArray0[5] = "";
      archiveScanner0.setIncludes(stringArray0);
      // Undeclared exception!
      try { 
        archiveScanner0.processDirectory(improvedFile0, "", true);
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
      MockFile mockFile0 = new MockFile("java.io.tmpdir");
      ImprovedFile improvedFile0 = new ImprovedFile(mockFile0);
      ArchiveScanner archiveScanner0 = new ArchiveScanner(improvedFile0);
      int int0 = archiveScanner0.toFileType(improvedFile0);
      //  // Unstable assertion: assertEquals(2, int0);
  }

  /**
  //Test case number: 22
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      ImprovedFile improvedFile0 = new ImprovedFile("D+r-");
      ImprovedFile improvedFile1 = ImprovedFile.createTempImprovedFile("D+r-", "D+r-", improvedFile0);
      ArchiveScanner archiveScanner0 = new ArchiveScanner(improvedFile1);
      int int0 = archiveScanner0.toFileType(improvedFile0);
      assertEquals(1, int0);
  }
}
