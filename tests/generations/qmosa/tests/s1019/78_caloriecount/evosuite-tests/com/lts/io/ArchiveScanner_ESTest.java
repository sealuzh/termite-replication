/*
 * This file was automatically generated by EvoSuite
 * Wed Nov 11 14:34:02 GMT 2020
 */

package com.lts.io;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.lts.io.ArchiveScanner;
import com.lts.io.ImprovedFile;
import java.io.File;
import java.io.InputStream;
import java.util.Vector;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
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
      ArchiveScanner archiveScanner0 = new ArchiveScanner((ImprovedFile) null);
      String[] stringArray0 = new String[9];
      stringArray0[0] = "^O\u0006@ob}:";
      stringArray0[1] = "12-.jar";
      archiveScanner0.excludes = stringArray0;
      Vector<Object> vector0 = new Vector<Object>();
      archiveScanner0.filesExcluded = vector0;
      archiveScanner0.includes = stringArray0;
      archiveScanner0.processArchive((File) null, "12-.jar");
      assertEquals(1, ArchiveScanner.DIRECTORY);
  }

  /**
  //Test case number: 1
  /*Coverage entropy=0.5623351446188083
  */
  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      ArchiveScanner archiveScanner0 = new ArchiveScanner((ImprovedFile) null);
      String[] stringArray0 = new String[9];
      stringArray0[0] = "^O\u0006@ob}:";
      stringArray0[1] = "12-.jar";
      Vector<Object> vector0 = new Vector<Object>();
      archiveScanner0.dirsExcluded = vector0;
      archiveScanner0.excludes = stringArray0;
      archiveScanner0.includes = stringArray0;
      // Undeclared exception!
      try { 
        archiveScanner0.processArchive((File) null, "12-.jar");
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
      String[] stringArray0 = new String[9];
      stringArray0[0] = "ThHe e:ent type od, ";
      Vector<InputStream> vector0 = new Vector<InputStream>();
      archiveScanner0.dirsNotIncluded = vector0;
      archiveScanner0.addDefaultExcludes();
      archiveScanner0.includes = stringArray0;
      // Undeclared exception!
      try { 
        archiveScanner0.processFile("ThHe e:ent type od, ");
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
      ArchiveScanner archiveScanner0 = new ArchiveScanner((ImprovedFile) null);
      String[] stringArray0 = new String[8];
      stringArray0[0] = "3";
      Vector<String> vector0 = new Vector<String>();
      archiveScanner0.dirsIncluded = vector0;
      archiveScanner0.addDefaultExcludes();
      archiveScanner0.includes = stringArray0;
      // Undeclared exception!
      try { 
        archiveScanner0.processFile("3");
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
      ArchiveScanner archiveScanner0 = new ArchiveScanner((ImprovedFile) null);
      String[] stringArray0 = new String[9];
      stringArray0[0] = "ThHe e:ent tUpe od, ";
      Vector<String> vector0 = new Vector<String>();
      archiveScanner0.filesNotIncluded = vector0;
      archiveScanner0.addDefaultExcludes();
      archiveScanner0.includes = stringArray0;
      // Undeclared exception!
      try { 
        archiveScanner0.processFile("ThHe e:ent tUpe od, ");
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
      ArchiveScanner archiveScanner0 = new ArchiveScanner((ImprovedFile) null);
      String[] stringArray0 = new String[8];
      stringArray0[0] = "ThHe e:enOUpe od, ";
      Vector<Object> vector0 = new Vector<Object>();
      archiveScanner0.filesExcluded = vector0;
      archiveScanner0.addDefaultExcludes();
      archiveScanner0.includes = stringArray0;
      // Undeclared exception!
      try { 
        archiveScanner0.processFile("ThHe e:enOUpe od, ");
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
  /*Coverage entropy=0.6365141682948128
  */
  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      ArchiveScanner archiveScanner0 = new ArchiveScanner((ImprovedFile) null);
      String[] stringArray0 = new String[9];
      stringArray0[0] = "^O\u0006@ob}:";
      archiveScanner0.excludes = stringArray0;
      Vector<Object> vector0 = new Vector<Object>();
      archiveScanner0.filesExcluded = vector0;
      archiveScanner0.includes = stringArray0;
      archiveScanner0.processFile("^O\u0006@ob}:");
      assertEquals(2, ArchiveScanner.ARCHIVE);
  }

  /**
  //Test case number: 7
  /*Coverage entropy=0.5623351446188083
  */
  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      ArchiveScanner archiveScanner0 = new ArchiveScanner((ImprovedFile) null);
      String[] stringArray0 = new String[21];
      stringArray0[0] = ".ZIiP";
      archiveScanner0.includes = stringArray0;
      archiveScanner0.excludes = stringArray0;
      Vector<Object> vector0 = new Vector<Object>();
      archiveScanner0.dirsExcluded = vector0;
      archiveScanner0.processDirectory((File) null, ".ZIiP", true);
      assertEquals(2, ArchiveScanner.ARCHIVE);
  }

  /**
  //Test case number: 8
  /*Coverage entropy=0.5623351446188083
  */
  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      ArchiveScanner archiveScanner0 = new ArchiveScanner((ImprovedFile) null);
      String[] stringArray0 = new String[4];
      stringArray0[0] = ".jar18V-Z.jar2.jar1K&xifJP0wHUX!@.jr";
      archiveScanner0.includes = stringArray0;
      Vector<Object> vector0 = new Vector<Object>();
      archiveScanner0.dirsNotIncluded = vector0;
      archiveScanner0.addDefaultExcludes();
      // Undeclared exception!
      try { 
        archiveScanner0.processDirectory((File) null, ".jar18V-Z.jar2.jar1K&xifJP0wHUX!@.jr", true);
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
      String[] stringArray0 = new String[8];
      stringArray0[0] = "ThHe e:enOUpe od, ";
      Vector<Object> vector0 = new Vector<Object>();
      archiveScanner0.filesExcluded = vector0;
      archiveScanner0.addDefaultExcludes();
      archiveScanner0.includes = stringArray0;
      // Undeclared exception!
      try { 
        archiveScanner0.processDirectory((File) null, "ThHe e:enOUpe od, ", true);
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
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      ArchiveScanner archiveScanner0 = new ArchiveScanner((ImprovedFile) null);
      Vector<Integer> vector0 = new Vector<Integer>();
      archiveScanner0.filesNotIncluded = vector0;
      String[] stringArray0 = new String[1];
      stringArray0[0] = "JApm~9vU~*7Wl*Pn";
      archiveScanner0.setIncludes(stringArray0);
      archiveScanner0.processFile("l*Pn");
      assertEquals(1, ArchiveScanner.DIRECTORY);
  }

  /**
  //Test case number: 11
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      ImprovedFile improvedFile0 = new ImprovedFile("V!k H(Dg*Hyle`rP");
      ArchiveScanner archiveScanner0 = new ArchiveScanner(improvedFile0);
      try { 
        archiveScanner0.scanArchive(improvedFile0, "V!k H(Dg*Hyle`rP");
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Error trying to list archive, V!k H(Dg*Hyle`rP
         //
         verifyException("com.lts.io.archive.AbstractNestedArchive", e);
      }
  }

  /**
  //Test case number: 12
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      ArchiveScanner archiveScanner0 = new ArchiveScanner((ImprovedFile) null);
      // Undeclared exception!
      try { 
        archiveScanner0.scanArchive((File) null, "dLp H(D>*Hye`xP0^ja.jar");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.lts.io.archive.AbstractNestedArchive", e);
      }
  }

  /**
  //Test case number: 13
  /*Coverage entropy=0.9502705392332347
  */
  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      ArchiveScanner archiveScanner0 = new ArchiveScanner((ImprovedFile) null);
      String[] stringArray0 = new String[9];
      stringArray0[0] = "The e:ent type Wod, ";
      stringArray0[1] = "5Tr414p.{aqq9|(mxQ";
      Vector<InputStream> vector0 = new Vector<InputStream>();
      archiveScanner0.filesIncluded = vector0;
      archiveScanner0.addDefaultExcludes();
      archiveScanner0.includes = stringArray0;
      // Undeclared exception!
      try { 
        archiveScanner0.processArchive((File) null, "5Tr414p.{aqq9|(mxQ");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.lts.io.archive.AbstractNestedArchive", e);
      }
  }

  /**
  //Test case number: 14
  /*Coverage entropy=0.8675632284814612
  */
  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      ArchiveScanner archiveScanner0 = new ArchiveScanner((ImprovedFile) null);
      String[] stringArray0 = new String[4];
      stringArray0[0] = ".jar18V-Z.jar2.jar1K&xifJP0wHUX!@.jr";
      stringArray0[1] = ".jar18V-Z.jar2.jar1K&xifJP0wHUX!@.jr";
      stringArray0[2] = ".jar18V-Z.jar2.jar1K&xifJP0wHUX!@.jr";
      stringArray0[3] = "O";
      archiveScanner0.includes = stringArray0;
      Vector<Object> vector0 = new Vector<Object>();
      archiveScanner0.dirsNotIncluded = vector0;
      // Undeclared exception!
      try { 
        archiveScanner0.processDirectory((File) null, ".JAR.jar", false);
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
  /*Coverage entropy=1.0114042647073516
  */
  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      ImprovedFile improvedFile0 = new ImprovedFile("V!k H(Dg*Hye`rP");
      ArchiveScanner archiveScanner0 = new ArchiveScanner(improvedFile0);
      int int0 = archiveScanner0.toFileType(improvedFile0);
      assertEquals(0, int0);
  }

  /**
  //Test case number: 16
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile(".ZIP.jar");
      FileSystemHandling.createFolder(evoSuiteFile0);
      ImprovedFile improvedFile0 = new ImprovedFile(".ZIP.jar");
      ArchiveScanner archiveScanner0 = new ArchiveScanner(improvedFile0);
      int int0 = archiveScanner0.toFileType(improvedFile0);
      assertEquals(1, int0);
  }

  /**
  //Test case number: 17
  /*Coverage entropy=0.5623351446188083
  */
  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      ImprovedFile improvedFile0 = new ImprovedFile(".IRGjar", ".IRGjar");
      ArchiveScanner archiveScanner0 = new ArchiveScanner(improvedFile0);
      boolean boolean0 = archiveScanner0.isArchive(improvedFile0);
      //  // Unstable assertion: assertTrue(boolean0);
  }

  /**
  //Test case number: 18
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      ImprovedFile improvedFile0 = new ImprovedFile(".ZIP.jar");
      ArchiveScanner archiveScanner0 = new ArchiveScanner(improvedFile0);
      try { 
        archiveScanner0.scandir(improvedFile0, ".ZIP.jar", true);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // IO error scanning directory /home/ubuntu/replication/scripts/projects/78_caloriecount/.ZIP.jar
         //
         verifyException("com.lts.io.ArchiveScanner", e);
      }
  }

  /**
  //Test case number: 19
  /*Coverage entropy=0.5004024235381879
  */
  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      ArchiveScanner archiveScanner0 = new ArchiveScanner((ImprovedFile) null);
      String[] stringArray0 = new String[4];
      stringArray0[0] = "Pb?Ow5!+Vz.qGL";
      stringArray0[1] = "Pb?Ow5!+Vz.qGL";
      stringArray0[2] = "Pb?Ow5!+Vz.qGL";
      stringArray0[3] = "dBA<yj";
      archiveScanner0.includes = stringArray0;
      Vector<Object> vector0 = new Vector<Object>();
      archiveScanner0.dirsNotIncluded = vector0;
      archiveScanner0.processDirectory((File) null, "**/CVS/**", true);
      assertEquals(2, ArchiveScanner.ARCHIVE);
  }

  /**
  //Test case number: 20
  /*Coverage entropy=0.8675632284814612
  */
  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      ArchiveScanner archiveScanner0 = new ArchiveScanner((ImprovedFile) null);
      String[] stringArray0 = new String[4];
      stringArray0[0] = "Pb?Ow5!+V.qGL";
      stringArray0[1] = "Pb?Ow5!+V.qGL";
      stringArray0[2] = "Pb?Ow5!+V.qGL";
      stringArray0[3] = "dBgj";
      archiveScanner0.includes = stringArray0;
      Vector<Object> vector0 = new Vector<Object>();
      archiveScanner0.dirsNotIncluded = vector0;
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
  //Test case number: 21
  /*Coverage entropy=1.0751393240053733
  */
  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      ArchiveScanner archiveScanner0 = new ArchiveScanner((ImprovedFile) null);
      String[] stringArray0 = new String[4];
      stringArray0[0] = ", before creating temp directory with prefix ";
      stringArray0[1] = ", before creating temp directory with prefix ";
      stringArray0[2] = ", before creating temp directory with prefix ";
      stringArray0[3] = "ps.";
      archiveScanner0.includes = stringArray0;
      Vector<Object> vector0 = new Vector<Object>();
      archiveScanner0.dirsNotIncluded = vector0;
      ImprovedFile improvedFile0 = new ImprovedFile(", before creating temp directory with prefix ");
      improvedFile0.createTempDir();
      archiveScanner0.scandir(improvedFile0, "ps.", false);
      assertTrue(improvedFile0.exists());
  }

  /**
  //Test case number: 22
  /*Coverage entropy=1.0888999753452235
  */
  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      ArchiveScanner archiveScanner0 = new ArchiveScanner((ImprovedFile) null);
      String[] stringArray0 = new String[4];
      stringArray0[0] = ", before creating temp directory with prefix ";
      stringArray0[1] = ", before creating temp directory with prefix ";
      stringArray0[2] = ", before creating temp directory with prefix ";
      stringArray0[3] = "ps.";
      archiveScanner0.includes = stringArray0;
      ImprovedFile improvedFile0 = new ImprovedFile(", before creating temp directory with prefix ");
      improvedFile0.createTempDir();
      // Undeclared exception!
      try { 
        archiveScanner0.scandir(improvedFile0, "ps.", false);
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
  /*Coverage entropy=1.0027182645175161
  */
  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("K&xifJP0wHUX!@/.jar18V-Z.jar2.jar/K&xifJP0wHUX!@0..jar18V-Z.jar2.jar");
      FileSystemHandling.createFolder(evoSuiteFile0);
      ImprovedFile improvedFile0 = new ImprovedFile("K&xifJP0wHUX!@", ".jar18V-Z.jar2.jar");
      ArchiveScanner archiveScanner0 = new ArchiveScanner(improvedFile0);
      // Undeclared exception!
      try { 
        archiveScanner0.scandir(improvedFile0, "12-.jar", true);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.lts.io.DirectoryScanner", e);
      }
  }
}
