/*
 * This file was automatically generated by EvoSuite
 * Fri Nov 15 08:06:04 GMT 2019
 */

package com.lts.io;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.lts.io.ArchiveScanner;
import com.lts.io.ImprovedFile;
import java.io.File;
import java.io.InputStream;
import java.io.SequenceInputStream;
import java.util.LinkedList;
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
  /*Coverage entropy=1.2961346570528898
  */
  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      ArchiveScanner archiveScanner0 = new ArchiveScanner((ImprovedFile) null);
      String[] stringArray0 = new String[1];
      stringArray0[0] = "__ic]?_-,Y";
      archiveScanner0.setIncludes(stringArray0);
      Vector<Object> vector0 = new Vector<Object>();
      archiveScanner0.dirsIncluded = vector0;
      archiveScanner0.setBasedir("__ic]?_-,Y");
      archiveScanner0.addDefaultExcludes();
      // Undeclared exception!
      try { 
        archiveScanner0.processDirectory((File) null, "__ic]?_-,Y", true);
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
  /*Coverage entropy=1.2961346570528898
  */
  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      String string0 = "Asked to copy non-eitent file, ";
      FileSystemHandling.shouldThrowIOException((EvoSuiteFile) null);
      ImprovedFile improvedFile0 = null;
      ArchiveScanner archiveScanner0 = new ArchiveScanner((ImprovedFile) null);
      String[] stringArray0 = new String[1];
      archiveScanner0.excludes = stringArray0;
      stringArray0[0] = "Asked to copy non-eitent file, ";
      Vector<Integer> vector0 = new Vector<Integer>();
      archiveScanner0.dirsExcluded = vector0;
      archiveScanner0.setIncludes(stringArray0);
      archiveScanner0.haveSlowResults = true;
      // Undeclared exception!
      try { 
        archiveScanner0.processDirectory((File) null, "Asked to copy non-eitent file, ", false);
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
  /*Coverage entropy=1.2961346570528898
  */
  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      ArchiveScanner archiveScanner0 = new ArchiveScanner((ImprovedFile) null);
      String[] stringArray0 = new String[8];
      stringArray0[0] = "Asked to copy non-eitent file, ";
      stringArray0[1] = "$ZsE*!_FF,";
      stringArray0[2] = "Asked to copy non-eitent file, ";
      stringArray0[3] = "_%lic]?_-,9";
      stringArray0[4] = "_%lic]?_-,9";
      stringArray0[5] = "_%lic]?_-,9";
      stringArray0[6] = "Asked to copy non-eitent file, ";
      stringArray0[7] = "_%lic]?_-,9";
      archiveScanner0.setIncludes(stringArray0);
      Vector<String> vector0 = new Vector<String>();
      archiveScanner0.setBasedir("IO error scanning directory ");
      archiveScanner0.dirsNotIncluded = vector0;
      archiveScanner0.addDefaultExcludes();
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
  //Test case number: 3
  /*Coverage entropy=1.2961346570528898
  */
  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      FileSystemHandling.shouldThrowIOException((EvoSuiteFile) null);
      ArchiveScanner archiveScanner0 = new ArchiveScanner((ImprovedFile) null);
      String[] stringArray0 = new String[1];
      archiveScanner0.excludes = stringArray0;
      stringArray0[0] = "Asked to copy non-eitent file, ";
      Vector<Integer> vector0 = new Vector<Integer>();
      archiveScanner0.dirsExcluded = vector0;
      archiveScanner0.setIncludes(stringArray0);
      ImprovedFile improvedFile0 = ImprovedFile.createTempImprovedFile(".jar", ".jar", (File) null);
      try { 
        archiveScanner0.processDirectory(improvedFile0, "Asked to copy non-eitent file, ", false);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // IO error scanning directory /tmp/.jar0.jar
         //
         verifyException("com.lts.io.ArchiveScanner", e);
      }
  }

  /**
  //Test case number: 4
  /*Coverage entropy=1.3788419678046633
  */
  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      ImprovedFile improvedFile0 = null;
      ArchiveScanner archiveScanner0 = new ArchiveScanner((ImprovedFile) null);
      String[] stringArray0 = new String[8];
      stringArray0[0] = "Asked to copy non-eitent file, ";
      stringArray0[1] = "$ZsE*!_FF,";
      stringArray0[2] = "Asked to copy non-eitent file, ";
      stringArray0[3] = "_%lic]?_-,9";
      stringArray0[4] = "_%lic]?_-,9";
      stringArray0[5] = "_%lic]?_-,9";
      stringArray0[6] = "Asked to copy non-eitent file, ";
      stringArray0[7] = "_%lic]?_-,9";
      archiveScanner0.setIncludes(stringArray0);
      Vector<String> vector0 = new Vector<String>();
      archiveScanner0.dirsNotIncluded = vector0;
      archiveScanner0.addDefaultExcludes();
      String string0 = "8~Jo9l@O|";
      // Undeclared exception!
      try { 
        archiveScanner0.processDirectory((File) null, "8~Jo9l@O|", false);
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
  /*Coverage entropy=0.4
  */
  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      ArchiveScanner archiveScanner0 = new ArchiveScanner((ImprovedFile) null);
      String[] stringArray0 = new String[8];
      stringArray0[0] = "Asked to copy non-eitent file, ";
      stringArray0[1] = "$ZsE*!_FF,";
      stringArray0[2] = "Asked to copy non-eitent file, ";
      stringArray0[3] = "Asked to copy non-eitent file, ";
      stringArray0[4] = "Asked to copy non-eitent file, ";
      stringArray0[5] = "Asked to copy non-eitent file, ";
      stringArray0[6] = "Asked to copy non-eitent file, ";
      stringArray0[7] = "Asked to copy non-eitent file, ";
      archiveScanner0.setIncludes(stringArray0);
      Vector<String> vector0 = new Vector<String>();
      archiveScanner0.dirsNotIncluded = vector0;
      archiveScanner0.addDefaultExcludes();
      archiveScanner0.processDirectory((File) null, "P*V{^%j<r", true);
      assertEquals(1, ArchiveScanner.DIRECTORY);
  }

  /**
  //Test case number: 6
  /*Coverage entropy=1.2248830687452417
  */
  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      ArchiveScanner archiveScanner0 = new ArchiveScanner((ImprovedFile) null);
      String[] stringArray0 = new String[1];
      stringArray0[0] = "__ic]?_-,Y";
      archiveScanner0.setIncludes(stringArray0);
      Vector<Object> vector0 = new Vector<Object>();
      archiveScanner0.dirsIncluded = vector0;
      archiveScanner0.setBasedir("__ic]?_-,Y");
      archiveScanner0.addDefaultExcludes();
      // Undeclared exception!
      try { 
        archiveScanner0.processDirectory((File) null, "__ic]?_-,Y", false);
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
  /*Coverage entropy=0.9623351446188083
  */
  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      ArchiveScanner archiveScanner0 = new ArchiveScanner((ImprovedFile) null);
      String[] stringArray0 = new String[1];
      archiveScanner0.excludes = stringArray0;
      stringArray0[0] = "Asked to copy non-eitent file, ";
      Vector<Integer> vector0 = new Vector<Integer>();
      archiveScanner0.dirsExcluded = vector0;
      archiveScanner0.setIncludes(stringArray0);
      // Undeclared exception!
      try { 
        archiveScanner0.processArchive((File) null, "Asked to copy non-eitent file, ");
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
  /*Coverage entropy=1.1217186091313738
  */
  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      ArchiveScanner archiveScanner0 = new ArchiveScanner((ImprovedFile) null);
      String[] stringArray0 = new String[1];
      Vector<Integer> vector0 = new Vector<Integer>();
      archiveScanner0.dirsExcluded = vector0;
      stringArray0[0] = "_lic]?_-,9";
      archiveScanner0.setIncludes(stringArray0);
      archiveScanner0.setExcludes(stringArray0);
      archiveScanner0.processDirectory((File) null, "_lic]?_-,9", true);
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
  //Test case number: 9
  /*Coverage entropy=1.3788419678046633
  */
  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      ArchiveScanner archiveScanner0 = new ArchiveScanner((ImprovedFile) null);
      archiveScanner0.setBasedir("com.lts.io.ArchiveScanner");
      String[] stringArray0 = new String[1];
      stringArray0[0] = "eRJ9<F'PdKTOFA";
      Vector<Object> vector0 = new Vector<Object>();
      archiveScanner0.filesIncluded = vector0;
      archiveScanner0.setIncludes(stringArray0);
      archiveScanner0.addDefaultExcludes();
      // Undeclared exception!
      try { 
        archiveScanner0.processArchive((File) null, "eRJ9<F'PdKTOFA");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.lts.io.archive.AbstractNestedArchive", e);
      }
  }

  /**
  //Test case number: 10
  /*Coverage entropy=0.9623351446188083
  */
  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      ImprovedFile improvedFile0 = null;
      FileSystemHandling.appendDataToFile((EvoSuiteFile) null, (byte[]) null);
      ArchiveScanner archiveScanner0 = new ArchiveScanner((ImprovedFile) null);
      Vector<SequenceInputStream> vector0 = new Vector<SequenceInputStream>();
      archiveScanner0.dirsIncluded = vector0;
      archiveScanner0.excludes = archiveScanner0.DEFAULT_ARCHIVE_EXTENSIONS;
      archiveScanner0.setIncludes(archiveScanner0.DEFAULT_ARCHIVE_EXTENSIONS);
      String string0 = ".zip";
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
  //Test case number: 11
  /*Coverage entropy=1.6148896539491204
  */
  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      ImprovedFile improvedFile0 = null;
      ArchiveScanner archiveScanner0 = new ArchiveScanner((ImprovedFile) null);
      String[] stringArray0 = new String[1];
      Vector<InputStream> vector0 = new Vector<InputStream>();
      archiveScanner0.dirsExcluded = vector0;
      stringArray0[0] = "__ic]?_-,Y";
      archiveScanner0.setIncludes(stringArray0);
      Vector<Object> vector1 = new Vector<Object>();
      archiveScanner0.dirsIncluded = vector1;
      vector1.add((Object) archiveScanner0.dirsIncluded);
      archiveScanner0.addDefaultExcludes();
      // Undeclared exception!
      try { 
        archiveScanner0.processFile("__ic]?_-,Y");
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
      ArchiveScanner archiveScanner0 = new ArchiveScanner((ImprovedFile) null);
      archiveScanner0.excludes = archiveScanner0.DEFAULT_ARCHIVE_EXTENSIONS;
      archiveScanner0.setIncludes(archiveScanner0.DEFAULT_ARCHIVE_EXTENSIONS);
      Vector<Object> vector0 = new Vector<Object>();
      archiveScanner0.filesExcluded = vector0;
      String string0 = ".zip";
      archiveScanner0.processFile(string0);
      assertEquals(0, ArchiveScanner.FILE);
  }

  /**
  //Test case number: 13
  /*Coverage entropy=1.4682921994113465
  */
  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      ImprovedFile improvedFile0 = null;
      ArchiveScanner archiveScanner0 = new ArchiveScanner((ImprovedFile) null);
      String[] stringArray0 = new String[5];
      stringArray0[0] = "(-'uX>f";
      stringArray0[1] = "(-'uX>f";
      stringArray0[2] = "%:{ud*Nzb>";
      Vector<String> vector0 = new Vector<String>();
      archiveScanner0.filesIncluded = vector0;
      stringArray0[3] = "Error trying to load entry ";
      stringArray0[4] = "m@R,{!X<)!D30n..jar";
      archiveScanner0.setExcludes(stringArray0);
      archiveScanner0.setIncludes(archiveScanner0.DEFAULT_ARCHIVE_EXTENSIONS);
      String string0 = ".zip";
      archiveScanner0.processFile(string0);
      // Undeclared exception!
      try { 
        archiveScanner0.toFileType(improvedFile0);
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
  /*Coverage entropy=0.9623351446188083
  */
  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      ImprovedFile improvedFile0 = null;
      ArchiveScanner archiveScanner0 = new ArchiveScanner((ImprovedFile) null);
      archiveScanner0.excludes = archiveScanner0.DEFAULT_ARCHIVE_EXTENSIONS;
      archiveScanner0.setIncludes(archiveScanner0.DEFAULT_ARCHIVE_EXTENSIONS);
      LinkedList<InputStream> linkedList0 = new LinkedList<InputStream>();
      Vector<InputStream> vector0 = new Vector<InputStream>(linkedList0);
      archiveScanner0.filesIncluded = vector0;
      String string0 = ".zip";
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
  //Test case number: 15
  /*Coverage entropy=0.4
  */
  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      ArchiveScanner archiveScanner0 = new ArchiveScanner((ImprovedFile) null);
      archiveScanner0.excludes = archiveScanner0.DEFAULT_ARCHIVE_EXTENSIONS;
      archiveScanner0.setIncludes(archiveScanner0.DEFAULT_ARCHIVE_EXTENSIONS);
      String string0 = ".zip";
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
  //Test case number: 16
  /*Coverage entropy=1.0365141682948127
  */
  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      ImprovedFile improvedFile0 = null;
      ArchiveScanner archiveScanner0 = new ArchiveScanner((ImprovedFile) null);
      archiveScanner0.setIncludes(archiveScanner0.DEFAULT_ARCHIVE_EXTENSIONS);
      Vector<Integer> vector0 = new Vector<Integer>();
      archiveScanner0.dirsIncluded = vector0;
      String string0 = "RS >*MP&`!_pU4_GGH#tjar";
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
  //Test case number: 17
  /*Coverage entropy=0.4
  */
  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      ArchiveScanner archiveScanner0 = new ArchiveScanner((ImprovedFile) null);
      String[] stringArray0 = new String[1];
      stringArray0[0] = "eRJ9<F'PdK'TOFA";
      archiveScanner0.setIncludes(stringArray0);
      archiveScanner0.addDefaultExcludes();
      // Undeclared exception!
      try { 
        archiveScanner0.processArchive((File) null, "eRJ9<F'PdK'TOFA");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.lts.io.ArchiveScanner", e);
      }
  }

  /**
  //Test case number: 18
  /*Coverage entropy=0.4
  */
  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      ImprovedFile improvedFile0 = null;
      ArchiveScanner archiveScanner0 = new ArchiveScanner((ImprovedFile) null);
      archiveScanner0.excludes = archiveScanner0.DEFAULT_ARCHIVE_EXTENSIONS;
      Vector<Object> vector0 = new Vector<Object>();
      archiveScanner0.filesNotIncluded = vector0;
      archiveScanner0.setIncludes(archiveScanner0.DEFAULT_ARCHIVE_EXTENSIONS);
      String string0 = "zi";
      archiveScanner0.processArchive(improvedFile0, string0);
      assertEquals(2, ArchiveScanner.ARCHIVE);
  }

  /**
  //Test case number: 19
  /*Coverage entropy=1.159813847226612
  */
  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      String string0 = ")\"]-";
      ImprovedFile improvedFile0 = new ImprovedFile(")\"]-");
      ImprovedFile improvedFile1 = ImprovedFile.createTempImprovedFile("tempdir0.jar", ")\"]-", improvedFile0);
      String string1 = "2jMl$!v<KtJ%F\"N";
      MockFile.createTempFile("#B C-<d%.(HLE||", "lv)nFuW", (File) improvedFile0);
      MockFile.createTempFile("criticlal.com.lts.application.errors.properties.saving", "2jMl$!v<KtJ%F\"N", (File) improvedFile0);
      ArchiveScanner archiveScanner0 = new ArchiveScanner(improvedFile1);
      archiveScanner0.toFileType(improvedFile1);
      boolean boolean0 = false;
      // Undeclared exception!
      try { 
        archiveScanner0.scandir(improvedFile0, string1, boolean0);
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
  /*Coverage entropy=1.0365141682948127
  */
  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      ImprovedFile improvedFile0 = null;
      ArchiveScanner archiveScanner0 = new ArchiveScanner((ImprovedFile) null);
      Vector<InputStream> vector0 = new Vector<InputStream>();
      archiveScanner0.dirsExcluded = vector0;
      archiveScanner0.setIncludes(archiveScanner0.DEFAULT_ARCHIVE_EXTENSIONS);
      String string0 = "";
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
  //Test case number: 21
  /*Coverage entropy=1.0365141682948127
  */
  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      ImprovedFile improvedFile0 = null;
      ArchiveScanner archiveScanner0 = new ArchiveScanner((ImprovedFile) null);
      Vector<Integer> vector0 = new Vector<Integer>();
      archiveScanner0.filesExcluded = vector0;
      archiveScanner0.setIncludes(archiveScanner0.DEFAULT_ARCHIVE_EXTENSIONS);
      String string0 = "RS >*MP&`!_pU4_GGH#tjar";
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
  //Test case number: 22
  /*Coverage entropy=0.4
  */
  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      ArchiveScanner archiveScanner0 = new ArchiveScanner((ImprovedFile) null);
      Vector<Object> vector0 = new Vector<Object>();
      archiveScanner0.filesNotIncluded = vector0;
      archiveScanner0.setIncludes(archiveScanner0.DEFAULT_ARCHIVE_EXTENSIONS);
      vector0.add((Object) archiveScanner0);
      String string0 = "RS >*MP&`!_pU4_GGH#.jar";
      archiveScanner0.processFile(string0);
      assertEquals(2, ArchiveScanner.ARCHIVE);
  }

  /**
  //Test case number: 23
  /*Coverage entropy=0.4
  */
  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      ArchiveScanner archiveScanner0 = new ArchiveScanner((ImprovedFile) null);
      archiveScanner0.setIncludes(archiveScanner0.DEFAULT_ARCHIVE_EXTENSIONS);
      String string0 = "v;E)E2";
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
  //Test case number: 24
  /*Coverage entropy=1.0931471805599453
  */
  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      ArchiveScanner archiveScanner0 = new ArchiveScanner((ImprovedFile) null);
      // Undeclared exception!
      try { 
        archiveScanner0.scanArchive((File) null, "#Cp3Ilh0Dz-DG");
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
  /*Coverage entropy=1.4471627089619605
  */
  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
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
  //Test case number: 26
  /*Coverage entropy=0.9623351446188083
  */
  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      ImprovedFile improvedFile0 = new ImprovedFile(".EAR");
      ArchiveScanner archiveScanner0 = new ArchiveScanner(improvedFile0);
      boolean boolean0 = archiveScanner0.isArchive(improvedFile0);
      //  // Unstable assertion: assertFalse(boolean0);
  }

  /**
  //Test case number: 27
  /*Coverage entropy=0.9623351446188083
  */
  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      ImprovedFile improvedFile0 = new ImprovedFile("ive .jar");
      ArchiveScanner archiveScanner0 = new ArchiveScanner(improvedFile0);
      boolean boolean0 = archiveScanner0.isArchive(improvedFile0);
      assertTrue(boolean0);
  }

  /**
  //Test case number: 28
  /*Coverage entropy=0.4
  */
  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      ImprovedFile improvedFile0 = new ImprovedFile("");
      ArchiveScanner archiveScanner0 = new ArchiveScanner(improvedFile0);
      archiveScanner0.scandir(improvedFile0, "", false);
      assertFalse(improvedFile0.isAbsolute());
  }

  /**
  //Test case number: 29
  /*Coverage entropy=0.42857142857142855
  */
  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      String string0 = "RS >*MP&V!_pU4_GGH#";
      ImprovedFile improvedFile0 = new ImprovedFile("RS >*MP&V!_pU4_GGH#");
      ArchiveScanner archiveScanner0 = new ArchiveScanner(improvedFile0);
      boolean boolean0 = archiveScanner0.isArchive(improvedFile0);
      try { 
        archiveScanner0.scandir(improvedFile0, string0, boolean0);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // IO error scanning directory /home/ubuntu/termite/projects/78_caloriecount/RS >*MP&V!_pU4_GGH#
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
  /*Coverage entropy=0.42857142857142855
  */
  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      ImprovedFile improvedFile0 = new ImprovedFile("RS >*MP&`!_pU4_GGH#");
      ArchiveScanner archiveScanner0 = new ArchiveScanner(improvedFile0);
      int int0 = archiveScanner0.toFileType(improvedFile0);
      //  // Unstable assertion: assertEquals(2, int0);
  }

  /**
  //Test case number: 32
  /*Coverage entropy=0.4
  */
  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      ImprovedFile improvedFile0 = new ImprovedFile("RS >*MP&V!_pU4_GGH#", "RS >*MP&V!_pU4_GGH#");
      ArchiveScanner archiveScanner0 = new ArchiveScanner(improvedFile0);
      try { 
        archiveScanner0.scanArchive(improvedFile0, "RS >*MP&V!_pU4_GGH#");
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Error trying to list archive, /home/ubuntu/termite/projects/78_caloriecount/RS >*MP&V!_pU4_GGH#/RS >*MP&V!_pU4_GGH#
         //
         verifyException("com.lts.io.archive.AbstractNestedArchive", e);
      }
  }

  /**
  //Test case number: 33
  /*Coverage entropy=0.4
  */
  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      ImprovedFile improvedFile0 = new ImprovedFile("", "");
      ArchiveScanner archiveScanner0 = new ArchiveScanner(improvedFile0);
      int int0 = archiveScanner0.toFileType(improvedFile0);
      assertEquals(1, int0);
  }
}
