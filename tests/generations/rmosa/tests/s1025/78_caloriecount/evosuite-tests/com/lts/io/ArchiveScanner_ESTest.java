/*
 * This file was automatically generated by EvoSuite
 * Mon Nov 09 15:03:44 GMT 2020
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
import org.evosuite.runtime.mock.java.io.MockFile;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class ArchiveScanner_ESTest extends ArchiveScanner_ESTest_scaffolding {

  /**
  //Test case number: 0
  /*Coverage entropy=1.0027182645175161
  */
  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      ImprovedFile improvedFile0 = new ImprovedFile("", "");
      ArchiveScanner archiveScanner0 = new ArchiveScanner(improvedFile0);
      // Undeclared exception!
      try { 
        archiveScanner0.scandir(improvedFile0, ">UMr", true);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.lts.io.DirectoryScanner", e);
      }
  }

  /**
  //Test case number: 1
  /*Coverage entropy=0.9502705392332347
  */
  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      ArchiveScanner archiveScanner0 = new ArchiveScanner((ImprovedFile) null);
      archiveScanner0.setBasedir(".JAR");
      Vector<String> vector0 = new Vector<String>();
      archiveScanner0.filesIncluded = vector0;
      String[] stringArray0 = new String[3];
      stringArray0[0] = ".JAR";
      archiveScanner0.includes = stringArray0;
      String[] stringArray1 = new String[0];
      archiveScanner0.setExcludes(stringArray1);
      // Undeclared exception!
      try { 
        archiveScanner0.processArchive((File) null, ".JAR");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.lts.io.archive.AbstractNestedArchive", e);
      }
  }

  /**
  //Test case number: 2
  /*Coverage entropy=0.6365141682948128
  */
  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      MockFile mockFile0 = new MockFile("M|");
      ImprovedFile improvedFile0 = new ImprovedFile(mockFile0);
      ArchiveScanner archiveScanner0 = new ArchiveScanner(improvedFile0);
      String[] stringArray0 = new String[5];
      stringArray0[0] = "M|";
      stringArray0[1] = "M|";
      stringArray0[2] = "M|";
      stringArray0[3] = "M|";
      stringArray0[4] = "Ii{$";
      archiveScanner0.includes = stringArray0;
      Vector<Object> vector0 = new Vector<Object>();
      archiveScanner0.dirsNotIncluded = vector0;
      // Undeclared exception!
      try { 
        archiveScanner0.processArchive(improvedFile0, "B6K,m4?{`-.jar");
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
      String[] stringArray0 = new String[3];
      stringArray0[0] = "";
      stringArray0[1] = "";
      archiveScanner0.includes = stringArray0;
      stringArray0[2] = "";
      Vector<Object> vector0 = new Vector<Object>();
      archiveScanner0.dirsExcluded = vector0;
      ImprovedFile improvedFile0 = new ImprovedFile((File) null, "");
      // Undeclared exception!
      try { 
        archiveScanner0.processArchive(improvedFile0, "*IhcQw4| ");
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
      archiveScanner0.filesExcluded = vector0;
      String[] stringArray0 = new String[3];
      stringArray0[0] = "";
      stringArray0[1] = "";
      archiveScanner0.includes = stringArray0;
      stringArray0[2] = "";
      archiveScanner0.setExcludes(stringArray0);
      archiveScanner0.processFile("");
      assertEquals(2, ArchiveScanner.ARCHIVE);
  }

  /**
  //Test case number: 5
  /*Coverage entropy=0.5623351446188083
  */
  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      ArchiveScanner archiveScanner0 = new ArchiveScanner((ImprovedFile) null);
      String[] stringArray0 = new String[3];
      stringArray0[0] = "";
      stringArray0[1] = "";
      archiveScanner0.includes = stringArray0;
      stringArray0[2] = "";
      archiveScanner0.setExcludes(stringArray0);
      Vector<Object> vector0 = new Vector<Object>();
      archiveScanner0.dirsExcluded = vector0;
      // Undeclared exception!
      try { 
        archiveScanner0.processFile("");
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
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      MockFile mockFile0 = new MockFile("M|");
      ImprovedFile improvedFile0 = new ImprovedFile(mockFile0);
      ArchiveScanner archiveScanner0 = new ArchiveScanner(improvedFile0);
      String[] stringArray0 = new String[5];
      stringArray0[0] = "M|";
      stringArray0[1] = "M|";
      stringArray0[2] = "M|";
      stringArray0[3] = "M|";
      stringArray0[4] = "Ii{$";
      archiveScanner0.includes = stringArray0;
      Vector<String> vector0 = new Vector<String>(0);
      archiveScanner0.filesNotIncluded = vector0;
      archiveScanner0.processFile("RQ,g;1$gjKWU");
      assertEquals(2, ArchiveScanner.ARCHIVE);
  }

  /**
  //Test case number: 7
  /*Coverage entropy=0.8675632284814612
  */
  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      MockFile mockFile0 = new MockFile("M|");
      ImprovedFile improvedFile0 = new ImprovedFile(mockFile0);
      ArchiveScanner archiveScanner0 = new ArchiveScanner(improvedFile0);
      String[] stringArray0 = new String[5];
      stringArray0[0] = "M|";
      stringArray0[1] = "M|";
      stringArray0[2] = "M|";
      stringArray0[3] = "M|";
      stringArray0[4] = "Ii{$";
      archiveScanner0.includes = stringArray0;
      archiveScanner0.haveSlowResults = true;
      Vector<Object> vector0 = new Vector<Object>();
      archiveScanner0.dirsNotIncluded = vector0;
      try { 
        archiveScanner0.processDirectory(improvedFile0, "g.P~%$quEXOy)$-Cm>", false);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // IO error scanning directory /home/ubuntu/replication/scripts/projects/78_caloriecount/M|
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
      ArchiveScanner archiveScanner0 = new ArchiveScanner((ImprovedFile) null);
      String[] stringArray0 = new String[3];
      stringArray0[0] = "";
      stringArray0[1] = "";
      archiveScanner0.includes = stringArray0;
      stringArray0[2] = "";
      Vector<Object> vector0 = new Vector<Object>();
      archiveScanner0.dirsNotIncluded = vector0;
      archiveScanner0.setExcludes(stringArray0);
      // Undeclared exception!
      try { 
        archiveScanner0.processDirectory((File) null, "", true);
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
      ArchiveScanner archiveScanner0 = new ArchiveScanner((ImprovedFile) null);
      String[] stringArray0 = new String[3];
      Vector<String> vector0 = new Vector<String>();
      archiveScanner0.filesIncluded = vector0;
      stringArray0[0] = "";
      stringArray0[1] = "";
      archiveScanner0.includes = stringArray0;
      stringArray0[2] = "";
      archiveScanner0.setExcludes(stringArray0);
      // Undeclared exception!
      try { 
        archiveScanner0.processDirectory((File) null, "", true);
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
  /*Coverage entropy=0.5623351446188083
  */
  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      ArchiveScanner archiveScanner0 = new ArchiveScanner((ImprovedFile) null);
      String[] stringArray0 = new String[3];
      stringArray0[0] = "";
      stringArray0[1] = "";
      archiveScanner0.includes = stringArray0;
      stringArray0[2] = "";
      Vector<Object> vector0 = new Vector<Object>();
      archiveScanner0.filesNotIncluded = vector0;
      archiveScanner0.setExcludes(stringArray0);
      // Undeclared exception!
      try { 
        archiveScanner0.processDirectory((File) null, "", false);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.lts.io.ArchiveScanner", e);
      }
  }

  /**
  //Test case number: 11
  /*Coverage entropy=0.5623351446188083
  */
  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      ArchiveScanner archiveScanner0 = new ArchiveScanner((ImprovedFile) null);
      Vector<Object> vector0 = new Vector<Object>();
      archiveScanner0.filesExcluded = vector0;
      String[] stringArray0 = new String[3];
      stringArray0[0] = "";
      stringArray0[1] = "";
      archiveScanner0.includes = stringArray0;
      stringArray0[2] = "";
      archiveScanner0.setExcludes(stringArray0);
      // Undeclared exception!
      try { 
        archiveScanner0.processDirectory((File) null, "", false);
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
  /*Coverage entropy=0.6365141682948128
  */
  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      ImprovedFile improvedFile0 = new ImprovedFile("", "");
      ImprovedFile improvedFile1 = improvedFile0.createTempDir(">UMr", ">UMr");
      ArchiveScanner archiveScanner0 = new ArchiveScanner(improvedFile1);
      archiveScanner0.scandir(improvedFile1, "", true);
      assertTrue(improvedFile1.isAbsolute());
  }

  /**
  //Test case number: 13
  /*Coverage entropy=0.6365141682948128
  */
  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      ArchiveScanner archiveScanner0 = new ArchiveScanner((ImprovedFile) null);
      String[] stringArray0 = new String[3];
      Vector<String> vector0 = new Vector<String>();
      archiveScanner0.filesIncluded = vector0;
      stringArray0[0] = "";
      archiveScanner0.includes = stringArray0;
      String[] stringArray1 = new String[0];
      archiveScanner0.setExcludes(stringArray1);
      archiveScanner0.processFile("");
      assertEquals(2, ArchiveScanner.ARCHIVE);
  }

  /**
  //Test case number: 14
  /*Coverage entropy=0.6365141682948128
  */
  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      ArchiveScanner archiveScanner0 = new ArchiveScanner((ImprovedFile) null);
      String[] stringArray0 = new String[3];
      stringArray0[0] = "";
      Vector<String> vector0 = new Vector<String>();
      archiveScanner0.filesExcluded = vector0;
      stringArray0[1] = "";
      archiveScanner0.includes = stringArray0;
      stringArray0[2] = "";
      archiveScanner0.setExcludes(stringArray0);
      archiveScanner0.processArchive((File) null, "");
      assertEquals(2, ArchiveScanner.ARCHIVE);
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
  //Test case number: 16
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      ImprovedFile improvedFile0 = new ImprovedFile("", "");
      ImprovedFile improvedFile1 = improvedFile0.createTempDir(">UMr", ">UMr");
      ArchiveScanner archiveScanner0 = new ArchiveScanner(improvedFile1);
      improvedFile1.deleteAll();
      try { 
        archiveScanner0.scandir(improvedFile1, "", true);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // IO error scanning directory />UMr0>UMr
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
      MockFile mockFile0 = new MockFile("M|");
      ImprovedFile improvedFile0 = new ImprovedFile(mockFile0);
      ArchiveScanner archiveScanner0 = new ArchiveScanner(improvedFile0);
      try { 
        archiveScanner0.scanArchive(mockFile0, "M|");
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Error trying to list archive, M|
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
  //Test case number: 19
  /*Coverage entropy=0.5623351446188083
  */
  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      ImprovedFile improvedFile0 = new ImprovedFile("\"Y*VC");
      ArchiveScanner archiveScanner0 = new ArchiveScanner(improvedFile0);
      boolean boolean0 = archiveScanner0.isArchive(improvedFile0);
      //  // Unstable assertion: assertTrue(boolean0);
  }

  /**
  //Test case number: 20
  /*Coverage entropy=1.3208883431493221
  */
  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      ImprovedFile improvedFile0 = new ImprovedFile("XIST");
      ArchiveScanner archiveScanner0 = new ArchiveScanner(improvedFile0);
      ImprovedFile.createTempImprovedFile("#[i #4b.jar.jar", "XIST", improvedFile0);
      // Undeclared exception!
      try { 
        archiveScanner0.scandir(improvedFile0, "XIST", false);
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
  /*Coverage entropy=0.8675632284814612
  */
  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      MockFile mockFile0 = new MockFile("M|");
      ImprovedFile improvedFile0 = new ImprovedFile(mockFile0);
      ArchiveScanner archiveScanner0 = new ArchiveScanner(improvedFile0);
      String[] stringArray0 = new String[5];
      stringArray0[0] = "M|";
      stringArray0[1] = "M|";
      stringArray0[2] = "M|";
      stringArray0[3] = "M|";
      stringArray0[4] = "M|";
      archiveScanner0.includes = stringArray0;
      Vector<Object> vector0 = new Vector<Object>();
      archiveScanner0.dirsNotIncluded = vector0;
      try { 
        archiveScanner0.processDirectory(improvedFile0, "", true);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // IO error scanning directory /home/ubuntu/replication/scripts/projects/78_caloriecount/M|
         //
         verifyException("com.lts.io.ArchiveScanner", e);
      }
  }

  /**
  //Test case number: 22
  /*Coverage entropy=0.5004024235381879
  */
  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      MockFile mockFile0 = new MockFile("M|");
      ImprovedFile improvedFile0 = new ImprovedFile(mockFile0);
      ArchiveScanner archiveScanner0 = new ArchiveScanner(improvedFile0);
      String[] stringArray0 = new String[5];
      stringArray0[0] = "M|";
      stringArray0[1] = "M|";
      stringArray0[2] = "M|";
      stringArray0[3] = "M|";
      stringArray0[4] = "Ii{$";
      archiveScanner0.includes = stringArray0;
      Vector<Object> vector0 = new Vector<Object>();
      archiveScanner0.dirsNotIncluded = vector0;
      archiveScanner0.processDirectory(improvedFile0, "Node", true);
      assertEquals(0L, improvedFile0.getFreeSpace());
  }

  /**
  //Test case number: 23
  /*Coverage entropy=1.0751393240053733
  */
  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      ImprovedFile improvedFile0 = new ImprovedFile("", "");
      ArchiveScanner archiveScanner0 = new ArchiveScanner(improvedFile0);
      String[] stringArray0 = new String[5];
      stringArray0[0] = "";
      stringArray0[1] = "";
      stringArray0[2] = "";
      stringArray0[3] = "";
      stringArray0[4] = "Ii{$";
      archiveScanner0.includes = stringArray0;
      Vector<Object> vector0 = new Vector<Object>();
      archiveScanner0.dirsNotIncluded = vector0;
      archiveScanner0.processDirectory(improvedFile0, "g.P~%$quEXOy)$-Cm>", false);
      assertEquals(0L, improvedFile0.getFreeSpace());
  }

  /**
  //Test case number: 24
  /*Coverage entropy=0.8675632284814612
  */
  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      ArchiveScanner archiveScanner0 = new ArchiveScanner((ImprovedFile) null);
      Vector<Integer> vector0 = new Vector<Integer>();
      archiveScanner0.dirsIncluded = vector0;
      String[] stringArray0 = new String[3];
      stringArray0[0] = "";
      archiveScanner0.includes = stringArray0;
      String[] stringArray1 = new String[0];
      archiveScanner0.setExcludes(stringArray1);
      ImprovedFile improvedFile0 = new ImprovedFile((File) null, ".ear");
      try { 
        archiveScanner0.processDirectory(improvedFile0, "", true);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // IO error scanning directory /home/ubuntu/replication/scripts/projects/78_caloriecount/.ear
         //
         verifyException("com.lts.io.ArchiveScanner", e);
      }
  }

  /**
  //Test case number: 25
  /*Coverage entropy=0.7963116401738131
  */
  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      ArchiveScanner archiveScanner0 = new ArchiveScanner((ImprovedFile) null);
      Vector<Integer> vector0 = new Vector<Integer>();
      archiveScanner0.dirsIncluded = vector0;
      String[] stringArray0 = new String[3];
      stringArray0[0] = "";
      archiveScanner0.includes = stringArray0;
      String[] stringArray1 = new String[0];
      archiveScanner0.setExcludes(stringArray1);
      // Undeclared exception!
      try { 
        archiveScanner0.processDirectory((File) null, "", false);
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
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      ImprovedFile improvedFile0 = new ImprovedFile("", "");
      ArchiveScanner archiveScanner0 = new ArchiveScanner(improvedFile0);
      int int0 = archiveScanner0.toFileType(improvedFile0);
      assertEquals(1, int0);
  }
}
