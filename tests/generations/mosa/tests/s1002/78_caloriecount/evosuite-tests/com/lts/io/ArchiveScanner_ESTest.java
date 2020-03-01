/*
 * This file was automatically generated by EvoSuite
 * Wed Nov 13 20:58:03 GMT 2019
 */

package com.lts.io;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.lts.io.ArchiveScanner;
import com.lts.io.DirectoryScanner;
import com.lts.io.ImprovedFile;
import java.io.DataInputStream;
import java.io.File;
import java.io.InputStream;
import java.util.LinkedList;
import java.util.Vector;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.System;
import org.evosuite.runtime.mock.java.io.MockFile;
import org.evosuite.runtime.testdata.EvoSuiteFile;
import org.evosuite.runtime.testdata.FileSystemHandling;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class ArchiveScanner_ESTest extends ArchiveScanner_ESTest_scaffolding {

  /**
  //Test case number: 0
  /*Coverage entropy=0.9623351446188083
  */
  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      ImprovedFile improvedFile0 = new ImprovedFile("xCyVo+>%>L", "xCyVo+>%>L");
      ArchiveScanner archiveScanner0 = new ArchiveScanner(improvedFile0);
      String[] stringArray0 = new String[7];
      stringArray0[0] = "xCyVo+>%>L";
      stringArray0[1] = "xCyVo+>%>L";
      stringArray0[2] = "xCyVo+>%>L";
      stringArray0[3] = "xCyVo+>%>L";
      stringArray0[4] = "xCyVo+>%>L";
      stringArray0[5] = "xCyVo+>%>L";
      stringArray0[6] = "xCyVo+>%>L";
      archiveScanner0.setExcludes(stringArray0);
      Vector<DataInputStream> vector0 = new Vector<DataInputStream>();
      archiveScanner0.filesNotIncluded = vector0;
      archiveScanner0.setIncludes(stringArray0);
      archiveScanner0.isExcluded("");
      // Undeclared exception!
      try { 
        archiveScanner0.processDirectory(improvedFile0, "xCyVo+>%>L", false);
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
  /*Coverage entropy=0.42857142857142855
  */
  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      ImprovedFile improvedFile0 = new ImprovedFile("Err", "Err");
      ArchiveScanner archiveScanner0 = new ArchiveScanner(improvedFile0);
      Vector<String> vector0 = new Vector<String>();
      archiveScanner0.dirsNotIncluded = vector0;
      byte[] byteArray0 = new byte[0];
      FileSystemHandling.appendDataToFile((EvoSuiteFile) null, byteArray0);
      String[] stringArray0 = new String[1];
      stringArray0[0] = "Err";
      archiveScanner0.setIncludes(stringArray0);
      FileSystemHandling.shouldAllThrowIOExceptions();
      try { 
        archiveScanner0.processDirectory(improvedFile0, "", true);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // IO error scanning directory /home/ubuntu/termite/projects/78_caloriecount/Err/Err
         //
         verifyException("com.lts.io.ArchiveScanner", e);
      }
  }

  /**
  //Test case number: 2
  /*Coverage entropy=0.9623351446188083
  */
  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      ImprovedFile improvedFile0 = new ImprovedFile("Error", "Error");
      ArchiveScanner archiveScanner0 = new ArchiveScanner(improvedFile0);
      Vector<String> vector0 = new Vector<String>();
      archiveScanner0.dirsNotIncluded = vector0;
      String[] stringArray0 = new String[2];
      stringArray0[0] = "Error";
      stringArray0[1] = "Error";
      archiveScanner0.setExcludes(stringArray0);
      archiveScanner0.setIncludes(stringArray0);
      archiveScanner0.isExcluded("Error");
      // Undeclared exception!
      try { 
        archiveScanner0.processDirectory(improvedFile0, "Error", true);
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
  /*Coverage entropy=0.45454545454545453
  */
  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      ImprovedFile improvedFile0 = new ImprovedFile("H5AGU'P", ".EAR");
      ArchiveScanner archiveScanner0 = new ArchiveScanner(improvedFile0);
      Vector<String> vector0 = new Vector<String>();
      archiveScanner0.dirsNotIncluded = vector0;
      String[] stringArray0 = new String[6];
      improvedFile0.createTempDir();
      stringArray0[0] = "H5AGU'P";
      stringArray0[1] = ".EAR";
      stringArray0[2] = ".ZIP";
      stringArray0[3] = "H5AGU'P";
      stringArray0[4] = ".EAR";
      stringArray0[5] = ".EAR";
      archiveScanner0.setIncludes(stringArray0);
      archiveScanner0.scandir(improvedFile0, ".ZIP", false);
      assertEquals(1392409281320L, improvedFile0.lastModified());
  }

  /**
  //Test case number: 4
  /*Coverage entropy=1.2248830687452417
  */
  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      ImprovedFile improvedFile0 = new ImprovedFile("/{0MUh**3~BF,7CG%/", "[o");
      ArchiveScanner archiveScanner0 = new ArchiveScanner(improvedFile0);
      String[] stringArray0 = new String[8];
      stringArray0[0] = "/{0MUh**3~BF,7CG%/";
      stringArray0[1] = "/{0MUh**3~BF,7CG%/";
      stringArray0[2] = "[o";
      stringArray0[3] = "[o";
      stringArray0[4] = "/{0MUh**3~BF,7CG%/";
      stringArray0[5] = "/{0MUh**3~BF,7CG%/";
      stringArray0[6] = "/{0MUh**3~BF,7CG%/";
      archiveScanner0.haveSlowResults = true;
      stringArray0[7] = "[o";
      archiveScanner0.setIncludes(stringArray0);
      Vector<String> vector0 = new Vector<String>();
      archiveScanner0.dirsIncluded = vector0;
      archiveScanner0.addDefaultExcludes();
      try { 
        archiveScanner0.processDirectory(improvedFile0, "[o", false);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // IO error scanning directory /{0MUh**3~BF,7CG%/[o
         //
         verifyException("com.lts.io.ArchiveScanner", e);
      }
  }

  /**
  //Test case number: 5
  /*Coverage entropy=0.42857142857142855
  */
  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      ImprovedFile improvedFile0 = new ImprovedFile("/{0MUh**3~BF,7CG%/", "[o");
      ArchiveScanner archiveScanner0 = new ArchiveScanner(improvedFile0);
      String[] stringArray0 = new String[8];
      stringArray0[0] = "/{0MUh**3~BF,7CG%/";
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("/{0MUh**3~BF,7CG%/[o");
      FileSystemHandling.createFolder(evoSuiteFile0);
      stringArray0[1] = "[o";
      stringArray0[2] = "[o";
      stringArray0[3] = "[o";
      stringArray0[4] = "/{0MUh**3~BF,7CG%/";
      stringArray0[5] = "/{0MUh**3~BF,7CG%/";
      stringArray0[6] = "/{0MUh**3~BF,7CG%/";
      stringArray0[7] = "[o";
      archiveScanner0.setIncludes(stringArray0);
      Vector<String> vector0 = new Vector<String>();
      archiveScanner0.dirsIncluded = vector0;
      archiveScanner0.addDefaultExcludes();
      archiveScanner0.processDirectory(improvedFile0, "/{0MUh**3~BF,7CG%/", true);
      assertTrue(improvedFile0.canExecute());
  }

  /**
  //Test case number: 6
  /*Coverage entropy=0.42857142857142855
  */
  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      ImprovedFile improvedFile0 = new ImprovedFile(".EAR", ".EAR");
      ArchiveScanner archiveScanner0 = new ArchiveScanner(improvedFile0);
      Vector<String> vector0 = new Vector<String>();
      archiveScanner0.dirsNotIncluded = vector0;
      String[] stringArray0 = new String[1];
      stringArray0[0] = ".EAR";
      archiveScanner0.setIncludes(stringArray0);
      try { 
        archiveScanner0.processDirectory(improvedFile0, "CV&,B /", false);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // IO error scanning directory /home/ubuntu/termite/projects/78_caloriecount/.EAR/.EAR
         //
         verifyException("com.lts.io.ArchiveScanner", e);
      }
  }

  /**
  //Test case number: 7
  /*Coverage entropy=1.0365141682948127
  */
  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      String string0 = "g ./i7x;M ";
      ImprovedFile improvedFile0 = new ImprovedFile("g ./i7x;M ");
      ArchiveScanner archiveScanner0 = new ArchiveScanner(improvedFile0);
      archiveScanner0.setIncludes(archiveScanner0.DEFAULT_ARCHIVE_EXTENSIONS);
      Vector<Object> vector0 = new Vector<Object>();
      archiveScanner0.dirsExcluded = vector0;
      boolean boolean0 = true;
      // Undeclared exception!
      try { 
        archiveScanner0.processDirectory(improvedFile0, string0, boolean0);
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
  /*Coverage entropy=0.9909065731902369
  */
  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      String string0 = ".EAR";
      ImprovedFile improvedFile0 = new ImprovedFile(".EAR", ".EAR");
      ArchiveScanner archiveScanner0 = new ArchiveScanner(improvedFile0);
      archiveScanner0.setExcludes(archiveScanner0.DEFAULT_ARCHIVE_EXTENSIONS);
      Vector<DataInputStream> vector0 = new Vector<DataInputStream>();
      archiveScanner0.dirsIncluded = vector0;
      archiveScanner0.setIncludes(archiveScanner0.DEFAULT_ARCHIVE_EXTENSIONS);
      archiveScanner0.couldHoldIncluded(string0);
      ArchiveScanner archiveScanner1 = new ArchiveScanner(improvedFile0);
      boolean boolean0 = true;
      // Undeclared exception!
      try { 
        archiveScanner0.processDirectory(improvedFile0, string0, boolean0);
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
  /*Coverage entropy=0.9623351446188083
  */
  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      String string0 = ".EAR";
      ImprovedFile improvedFile0 = new ImprovedFile(".EAR", ".EAR");
      ArchiveScanner archiveScanner0 = new ArchiveScanner(improvedFile0);
      archiveScanner0.setExcludes(archiveScanner0.DEFAULT_ARCHIVE_EXTENSIONS);
      Vector<Object> vector0 = new Vector<Object>();
      archiveScanner0.dirsExcluded = vector0;
      archiveScanner0.setIncludes(archiveScanner0.DEFAULT_ARCHIVE_EXTENSIONS);
      archiveScanner0.addDefaultExcludes();
      // Undeclared exception!
      try { 
        archiveScanner0.processFile(string0);
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
  /*Coverage entropy=1.4841652152843623
  */
  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      ImprovedFile improvedFile0 = new ImprovedFile("");
      ArchiveScanner archiveScanner0 = new ArchiveScanner(improvedFile0);
      String[] stringArray0 = new String[1];
      archiveScanner0.includes = stringArray0;
      stringArray0[0] = "";
      archiveScanner0.setExcludes(stringArray0);
      Vector<InputStream> vector0 = new Vector<InputStream>();
      archiveScanner0.filesExcluded = vector0;
      archiveScanner0.setIncludes(stringArray0);
      archiveScanner0.processFile("");
      ArchiveScanner archiveScanner1 = new ArchiveScanner(improvedFile0);
      int int0 = archiveScanner1.toFileType(improvedFile0);
      assertEquals(1, int0);
  }

  /**
  //Test case number: 11
  /*Coverage entropy=0.9623351446188083
  */
  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      String string0 = ".EAR";
      ImprovedFile improvedFile0 = new ImprovedFile(".EAR", ".EAR");
      ArchiveScanner archiveScanner0 = new ArchiveScanner(improvedFile0);
      archiveScanner0.setIncludes(archiveScanner0.DEFAULT_ARCHIVE_EXTENSIONS);
      Vector<InputStream> vector0 = new Vector<InputStream>();
      archiveScanner0.dirsIncluded = vector0;
      archiveScanner0.basedir = (File) improvedFile0;
      archiveScanner0.addDefaultExcludes();
      // Undeclared exception!
      try { 
        archiveScanner0.processFile(string0);
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
  /*Coverage entropy=1.0365141682948127
  */
  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      String string0 = "";
      ImprovedFile improvedFile0 = new ImprovedFile("");
      ArchiveScanner archiveScanner0 = new ArchiveScanner(improvedFile0);
      Vector<DataInputStream> vector0 = new Vector<DataInputStream>();
      archiveScanner0.dirsExcluded = vector0;
      Vector<String> vector1 = new Vector<String>();
      archiveScanner0.filesExcluded = vector1;
      archiveScanner0.setIncludes(archiveScanner0.DEFAULT_ARCHIVE_EXTENSIONS);
      System.setCurrentTimeMillis(archiveScanner0.FILE);
      // Undeclared exception!
      try { 
        archiveScanner0.processArchive(improvedFile0, string0);
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
  /*Coverage entropy=1.1476926351053998
  */
  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      ImprovedFile improvedFile0 = new ImprovedFile(".EAR", ".EAR");
      ImprovedFile.createTempImprovedFile(".EAR", ".EAR", improvedFile0);
      ArchiveScanner archiveScanner0 = new ArchiveScanner(improvedFile0);
      // Undeclared exception!
      try { 
        archiveScanner0.scandir(improvedFile0, ".EAR", true);
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
  /*Coverage entropy=1.4486869174985209
  */
  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      String string0 = ".EAR";
      ImprovedFile improvedFile0 = new ImprovedFile(".EAR", ".EAR");
      ArchiveScanner archiveScanner0 = new ArchiveScanner(improvedFile0);
      archiveScanner0.setExcludes(archiveScanner0.DEFAULT_ARCHIVE_EXTENSIONS);
      archiveScanner0.setIncludes(archiveScanner0.DEFAULT_ARCHIVE_EXTENSIONS);
      boolean boolean0 = archiveScanner0.isIncluded(string0);
      ArchiveScanner archiveScanner1 = new ArchiveScanner(improvedFile0);
      Vector<Integer> vector0 = new Vector<Integer>();
      archiveScanner0.filesExcluded = vector0;
      archiveScanner0.isArchive(improvedFile0);
      // Undeclared exception!
      try { 
        archiveScanner0.processDirectory(improvedFile0, string0, boolean0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.lts.io.ArchiveScanner", e);
      }
  }

  /**
  //Test case number: 15
  /*Coverage entropy=0.9623351446188083
  */
  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      ImprovedFile improvedFile0 = new ImprovedFile("S");
      ArchiveScanner archiveScanner0 = new ArchiveScanner(improvedFile0);
      String[] stringArray0 = new String[2];
      stringArray0[0] = "com.lts.application.errors.properties";
      stringArray0[1] = "S";
      archiveScanner0.setIncludes(stringArray0);
      archiveScanner0.setIncludes(stringArray0);
      Vector<Object> vector0 = new Vector<Object>();
      archiveScanner0.dirsNotIncluded = vector0;
      archiveScanner0.addDefaultExcludes();
      ImprovedFile improvedFile1 = new ImprovedFile("com.lts.application.errors.properties");
      // Undeclared exception!
      try { 
        archiveScanner0.processDirectory(improvedFile0, "S", true);
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
  /*Coverage entropy=0.9623351446188083
  */
  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      String string0 = ".EAR";
      ImprovedFile improvedFile0 = new ImprovedFile(".EAR", ".EAR");
      ArchiveScanner archiveScanner0 = new ArchiveScanner(improvedFile0);
      boolean boolean0 = DirectoryScanner.matchPatternStart(".EAR", ".EAR");
      archiveScanner0.setIncludes(archiveScanner0.DEFAULT_ARCHIVE_EXTENSIONS);
      Vector<String> vector0 = new Vector<String>();
      archiveScanner0.filesIncluded = vector0;
      archiveScanner0.addDefaultExcludes();
      // Undeclared exception!
      try { 
        archiveScanner0.processDirectory(improvedFile0, string0, boolean0);
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
  /*Coverage entropy=1.1476926351053998
  */
  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      ImprovedFile improvedFile0 = new ImprovedFile("xCyVo+>%>L", "xCyVo+>%>L");
      ImprovedFile improvedFile1 = ImprovedFile.createTempImprovedFile("xCyVo+>%>L", "xCyVo+>%>L", improvedFile0);
      ArchiveScanner archiveScanner0 = new ArchiveScanner(improvedFile1);
      // Undeclared exception!
      try { 
        archiveScanner0.scandir(improvedFile0, "xCyVo+>%>L", true);
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
  /*Coverage entropy=0.45454545454545453
  */
  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      ImprovedFile improvedFile0 = new ImprovedFile("");
      ArchiveScanner archiveScanner0 = new ArchiveScanner(improvedFile0);
      archiveScanner0.setIncludes(archiveScanner0.DEFAULT_ARCHIVE_EXTENSIONS);
      Vector<DataInputStream> vector0 = new Vector<DataInputStream>();
      archiveScanner0.filesNotIncluded = vector0;
      long long0 = (-1974L);
      System.setCurrentTimeMillis(long0);
      archiveScanner0.isArchive(improvedFile0);
      int int0 = 1;
      vector0.ensureCapacity(int0);
      String string0 = "goO-";
      ImprovedFile improvedFile1 = new ImprovedFile(string0);
      archiveScanner0.isArchive(improvedFile1);
      archiveScanner0.processFile(string0);
      String string1 = "%qfDUKKX%yGr>}Mk;OI";
      try { 
        archiveScanner0.scanArchive(improvedFile1, string1);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Error trying to list archive, goO-
         //
         verifyException("com.lts.io.archive.AbstractNestedArchive", e);
      }
  }

  /**
  //Test case number: 19
  /*Coverage entropy=1.0365141682948127
  */
  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      ImprovedFile improvedFile0 = new ImprovedFile(".EAR", ".EAR");
      ArchiveScanner archiveScanner0 = new ArchiveScanner(improvedFile0);
      Vector<Object> vector0 = new Vector<Object>();
      archiveScanner0.filesIncluded = vector0;
      String[] stringArray0 = new String[0];
      archiveScanner0.setExcludes(stringArray0);
      archiveScanner0.setIncludes(stringArray0);
      // Undeclared exception!
      try { 
        archiveScanner0.processFile("Cy.6K");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.lts.io.ArchiveScanner", e);
      }
  }

  /**
  //Test case number: 20
  /*Coverage entropy=1.0365141682948127
  */
  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      ImprovedFile improvedFile0 = new ImprovedFile(".EAR", ".EAR");
      ArchiveScanner archiveScanner0 = new ArchiveScanner(improvedFile0);
      String[] stringArray0 = new String[3];
      stringArray0[0] = "createAction";
      stringArray0[1] = "Error trying to create temp file for entry ";
      stringArray0[2] = ".EAR";
      archiveScanner0.setExcludes(stringArray0);
      Vector<String> vector0 = new Vector<String>();
      archiveScanner0.filesExcluded = vector0;
      archiveScanner0.setIncludes(stringArray0);
      // Undeclared exception!
      try { 
        archiveScanner0.processFile("\"[X=Et ");
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
  /*Coverage entropy=1.0365141682948127
  */
  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      String string0 = "";
      ImprovedFile improvedFile0 = new ImprovedFile("");
      ArchiveScanner archiveScanner0 = new ArchiveScanner(improvedFile0);
      archiveScanner0.setIncludes(archiveScanner0.DEFAULT_ARCHIVE_EXTENSIONS);
      LinkedList<Integer> linkedList0 = new LinkedList<Integer>();
      Vector<Object> vector0 = new Vector<Object>(linkedList0);
      archiveScanner0.dirsExcluded = vector0;
      System.setCurrentTimeMillis(archiveScanner0.ARCHIVE);
      // Undeclared exception!
      try { 
        archiveScanner0.processFile(string0);
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
  /*Coverage entropy=1.3842713196839629
  */
  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      ImprovedFile improvedFile0 = new ImprovedFile(".EAR", ".EAR");
      ArchiveScanner archiveScanner0 = new ArchiveScanner(improvedFile0);
      Vector<String> vector0 = new Vector<String>();
      archiveScanner0.dirsNotIncluded = vector0;
      String[] stringArray0 = new String[1];
      stringArray0[0] = ".EAR";
      archiveScanner0.setIncludes(stringArray0);
      archiveScanner0.processDirectory(improvedFile0, "CV&,B /", true);
      // Undeclared exception!
      try { 
        archiveScanner0.processArchive(improvedFile0, "CV&,B /");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.lts.io.ArchiveScanner", e);
      }
  }

  /**
  //Test case number: 23
  /*Coverage entropy=0.4444444444444445
  */
  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      String string0 = ".EAR";
      ImprovedFile improvedFile0 = new ImprovedFile(".EAR", ".EAR");
      ArchiveScanner archiveScanner0 = new ArchiveScanner(improvedFile0);
      archiveScanner0.setIncludes(archiveScanner0.DEFAULT_ARCHIVE_EXTENSIONS);
      archiveScanner0.addDefaultExcludes();
      Vector<String> vector0 = new Vector<String>();
      archiveScanner0.filesIncluded = vector0;
      archiveScanner0.processFile(string0);
      String string1 = "n_Of]t0C)z$&~";
      MockFile mockFile0 = new MockFile(string0, string1);
      int int0 = archiveScanner0.toFileType(mockFile0);
      //  // Unstable assertion: assertEquals(2, int0);
  }

  /**
  //Test case number: 24
  /*Coverage entropy=1.455848709151796
  */
  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      String string0 = ".EAR";
      ImprovedFile improvedFile0 = new ImprovedFile(".EAR", "&d:|/");
      ArchiveScanner archiveScanner0 = new ArchiveScanner(improvedFile0);
      improvedFile0.deleteOnExit();
      archiveScanner0.setExcludes(archiveScanner0.DEFAULT_ARCHIVE_EXTENSIONS);
      archiveScanner0.setIncludes(archiveScanner0.DEFAULT_ARCHIVE_EXTENSIONS);
      ImprovedFile improvedFile1 = improvedFile0.createTempDir();
      Vector<InputStream> vector0 = new Vector<InputStream>();
      archiveScanner0.filesExcluded = vector0;
      archiveScanner0.processArchive(improvedFile1, string0);
      archiveScanner0.toFileType(improvedFile1);
      String string1 = "yS7zvP";
      boolean boolean0 = true;
      // Undeclared exception!
      try { 
        archiveScanner0.processDirectory(improvedFile0, string1, boolean0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.lts.io.ArchiveScanner", e);
      }
  }

  /**
  //Test case number: 25
  /*Coverage entropy=1.4399756932787802
  */
  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      ImprovedFile improvedFile0 = new ImprovedFile("FPrK; Aw.jar");
      ArchiveScanner archiveScanner0 = new ArchiveScanner(improvedFile0);
      int int0 = archiveScanner0.toFileType(improvedFile0);
      assertEquals(2, int0);
  }

  /**
  //Test case number: 26
  /*Coverage entropy=0.4
  */
  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      String string0 = ".EAR";
      ImprovedFile improvedFile0 = new ImprovedFile(".EAR", "&d:|/");
      ArchiveScanner archiveScanner0 = new ArchiveScanner(improvedFile0);
      improvedFile0.deleteOnExit();
      archiveScanner0.setExcludes(archiveScanner0.DEFAULT_ARCHIVE_EXTENSIONS);
      archiveScanner0.setIncludes(archiveScanner0.DEFAULT_ARCHIVE_EXTENSIONS);
      ImprovedFile improvedFile1 = improvedFile0.createTempDir();
      // Undeclared exception!
      try { 
        archiveScanner0.processArchive(improvedFile1, string0);
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
  /*Coverage entropy=1.1217186091313738
  */
  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      FileSystemHandling.appendStringToFile((EvoSuiteFile) null, "Quit Application");
      ImprovedFile improvedFile0 = new ImprovedFile("Could not remove the destination file, ");
      ArchiveScanner archiveScanner0 = new ArchiveScanner(improvedFile0);
      String[] stringArray0 = new String[2];
      String string0 = "com.lts.application.errors.properties";
      stringArray0[0] = "com.lts.application.errors.properties";
      stringArray0[1] = "Could not remove the destination file, ";
      archiveScanner0.setIncludes(stringArray0);
      archiveScanner0.addDefaultExcludes();
      Vector<InputStream> vector0 = new Vector<InputStream>();
      archiveScanner0.filesIncluded = vector0;
      System.setCurrentTimeMillis(2);
      try { 
        archiveScanner0.processArchive(improvedFile0, "Could not remove the destination file, ");
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Error trying to list archive, Could not remove the destination file, 
         //
         verifyException("com.lts.io.archive.AbstractNestedArchive", e);
      }
  }

  /**
  //Test case number: 28
  /*Coverage entropy=1.1217186091313738
  */
  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      String string0 = "";
      ImprovedFile improvedFile0 = new ImprovedFile("");
      ArchiveScanner archiveScanner0 = new ArchiveScanner(improvedFile0);
      Vector<Object> vector0 = new Vector<Object>();
      archiveScanner0.filesNotIncluded = vector0;
      archiveScanner0.setIncludes(archiveScanner0.DEFAULT_ARCHIVE_EXTENSIONS);
      archiveScanner0.setBasedir((File) improvedFile0);
      archiveScanner0.processArchive(improvedFile0, string0);
      try { 
        archiveScanner0.scanArchive(improvedFile0, string0);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Error trying to list archive, 
         //
         verifyException("com.lts.io.archive.AbstractNestedArchive", e);
      }
  }

  /**
  //Test case number: 29
  /*Coverage entropy=1.0365141682948127
  */
  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      String string0 = "";
      ImprovedFile improvedFile0 = new ImprovedFile("");
      ArchiveScanner archiveScanner0 = new ArchiveScanner(improvedFile0);
      Vector<Integer> vector0 = new Vector<Integer>();
      archiveScanner0.dirsIncluded = vector0;
      archiveScanner0.setIncludes(archiveScanner0.DEFAULT_ARCHIVE_EXTENSIONS);
      // Undeclared exception!
      try { 
        archiveScanner0.processArchive(improvedFile0, string0);
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
  /*Coverage entropy=0.4
  */
  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      ImprovedFile improvedFile0 = new ImprovedFile("");
      FileSystemHandling.shouldAllThrowIOExceptions();
      ArchiveScanner archiveScanner0 = new ArchiveScanner(improvedFile0);
      String[] stringArray0 = new String[1];
      stringArray0[0] = "";
      archiveScanner0.addDefaultExcludes();
      archiveScanner0.setIncludes(stringArray0);
      // Undeclared exception!
      try { 
        archiveScanner0.processArchive(improvedFile0, "");
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
  /*Coverage entropy=1.0365141682948127
  */
  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      ImprovedFile improvedFile0 = new ImprovedFile(".EAR", ".EAR");
      ArchiveScanner archiveScanner0 = new ArchiveScanner(improvedFile0);
      Vector<String> vector0 = new Vector<String>();
      archiveScanner0.dirsNotIncluded = vector0;
      String[] stringArray0 = new String[1];
      stringArray0[0] = ".EAR";
      archiveScanner0.setIncludes(stringArray0);
      // Undeclared exception!
      try { 
        archiveScanner0.processFile("i7t;  0%H`j]{[V.jar");
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
  /*Coverage entropy=1.0931471805599453
  */
  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      ArchiveScanner archiveScanner0 = new ArchiveScanner((ImprovedFile) null);
      // Undeclared exception!
      try { 
        archiveScanner0.scanArchive((File) null, ".ER");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.lts.io.archive.AbstractNestedArchive", e);
      }
  }

  /**
  //Test case number: 33
  /*Coverage entropy=0.42857142857142855
  */
  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      ImprovedFile improvedFile0 = new ImprovedFile("3f&1 6\"", "3f&1 6\"");
      ArchiveScanner archiveScanner0 = new ArchiveScanner(improvedFile0);
      int int0 = archiveScanner0.toFileType(improvedFile0);
      assertEquals(0, int0);
  }

  /**
  //Test case number: 34
  /*Coverage entropy=0.4
  */
  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      ImprovedFile improvedFile0 = new ImprovedFile(".EAR");
      ArchiveScanner archiveScanner0 = new ArchiveScanner(improvedFile0);
      try { 
        archiveScanner0.scandir(improvedFile0, ".EAR", false);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // IO error scanning directory /home/ubuntu/termite/projects/78_caloriecount/.EAR
         //
         verifyException("com.lts.io.ArchiveScanner", e);
      }
  }

  /**
  //Test case number: 35
  /*Coverage entropy=0.4444444444444445
  */
  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
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
  //Test case number: 36
  /*Coverage entropy=0.4
  */
  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
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
  //Test case number: 37
  /*Coverage entropy=0.4
  */
  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
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
}
