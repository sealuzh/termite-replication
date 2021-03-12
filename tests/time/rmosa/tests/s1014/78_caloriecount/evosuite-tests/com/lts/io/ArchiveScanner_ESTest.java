/*
 * This file was automatically generated by EvoSuite
 * Sun Nov 29 00:54:00 GMT 2020
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
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      ArchiveScanner archiveScanner0 = new ArchiveScanner((ImprovedFile) null);
      Vector<Object> vector0 = new Vector<Object>();
      archiveScanner0.filesNotIncluded = vector0;
      archiveScanner0.setIncludes(archiveScanner0.DEFAULT_ARCHIVE_EXTENSIONS);
      archiveScanner0.processFile("a");
      assertEquals(1, ArchiveScanner.DIRECTORY);
  }

  /**
  //Test case number: 1
  /*Coverage entropy=0.9002560512685369
  */
  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      ArchiveScanner archiveScanner0 = new ArchiveScanner((ImprovedFile) null);
      ImprovedFile improvedFile0 = new ImprovedFile("0E6l");
      improvedFile0.mkdirs();
      archiveScanner0.haveSlowResults = true;
      archiveScanner0.setBasedir((File) improvedFile0);
      archiveScanner0.scan();
      // Undeclared exception!
      try { 
        archiveScanner0.processDirectory((File) null, ".WAR", false);
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
  /*Coverage entropy=1.053395498360576
  */
  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      ImprovedFile improvedFile0 = new ImprovedFile(".WAR");
      improvedFile0.createTempDir("You have unsaved changes.  Save them now?", "");
      ArchiveScanner archiveScanner0 = new ArchiveScanner(improvedFile0);
      archiveScanner0.setBasedir((File) improvedFile0);
      archiveScanner0.scan();
      archiveScanner0.setIncludes(archiveScanner0.DEFAULT_ARCHIVE_EXTENSIONS);
      archiveScanner0.setBasedir("");
      archiveScanner0.processDirectory(improvedFile0, "", true);
      assertEquals(0L, improvedFile0.getUsableSpace());
  }

  /**
  //Test case number: 3
  /*Coverage entropy=0.5623351446188083
  */
  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      ImprovedFile improvedFile0 = new ImprovedFile("&.ear.jar");
      ArchiveScanner archiveScanner0 = new ArchiveScanner(improvedFile0);
      boolean boolean0 = archiveScanner0.isArchive(improvedFile0);
      assertTrue(boolean0);
  }

  /**
  //Test case number: 4
  /*Coverage entropy=1.331664310293015
  */
  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      MockFile mockFile0 = new MockFile(">8U.]jGKIMaZ;H", ">8U.]jGKIMaZ;H");
      ImprovedFile improvedFile0 = ImprovedFile.createTempImprovedFile(">8U.]jGKIMaZ;H", ">8U.]jGKIMaZ;H", mockFile0);
      ArchiveScanner archiveScanner0 = new ArchiveScanner(improvedFile0);
      archiveScanner0.setIncludes(archiveScanner0.DEFAULT_ARCHIVE_EXTENSIONS);
      archiveScanner0.setBasedir((File) mockFile0);
      archiveScanner0.scan();
      assertEquals(0, ArchiveScanner.FILE);
  }

  /**
  //Test case number: 5
  /*Coverage entropy=1.0042424730540764
  */
  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      MockFile mockFile0 = new MockFile(">8U.]jGKIMaZ;H", "^Lxn");
      File file0 = ImprovedFile.buildName("RROR.jar.jar1.tmp.jar", (-1L), "%q|xlAOX@ 0&i:)", mockFile0);
      ImprovedFile improvedFile0 = ImprovedFile.createTempImprovedFile(">8U.]jGKIMaZ;H", "%q|xlAOX@ 0&i:)", mockFile0);
      ArchiveScanner archiveScanner0 = new ArchiveScanner(improvedFile0);
      int int0 = archiveScanner0.toFileType(file0);
      assertEquals(0, int0);
  }

  /**
  //Test case number: 6
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      MockFile mockFile0 = new MockFile(">8U.]jGKIMaZ;H", "^Lxn");
      ImprovedFile improvedFile0 = ImprovedFile.createTempImprovedFile(">8U.]jGKIMaZ;H", "%q|xlAOX@ 0&i:)", mockFile0);
      ArchiveScanner archiveScanner0 = new ArchiveScanner(improvedFile0);
      int int0 = archiveScanner0.toFileType(mockFile0);
      assertEquals(1, int0);
  }

  /**
  //Test case number: 7
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      ArchiveScanner archiveScanner0 = new ArchiveScanner((ImprovedFile) null);
      // Undeclared exception!
      try { 
        archiveScanner0.scandir((File) null, "", true);
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
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      ArchiveScanner archiveScanner0 = new ArchiveScanner((ImprovedFile) null);
      // Undeclared exception!
      try { 
        archiveScanner0.scandir((File) null, (String) null, true);
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
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
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
  //Test case number: 10
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      ArchiveScanner archiveScanner0 = new ArchiveScanner((ImprovedFile) null);
      // Undeclared exception!
      try { 
        archiveScanner0.scanArchive((File) null, "");
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
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
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
  //Test case number: 12
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
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
  //Test case number: 13
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      ArchiveScanner archiveScanner0 = new ArchiveScanner((ImprovedFile) null);
      // Undeclared exception!
      try { 
        archiveScanner0.processDirectory((File) null, (String) null, false);
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
  //Test case number: 15
  /*Coverage entropy=0.5623351446188083
  */
  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      ImprovedFile improvedFile0 = new ImprovedFile(".ear", ".ear");
      ArchiveScanner archiveScanner0 = new ArchiveScanner(improvedFile0);
      boolean boolean0 = archiveScanner0.isArchive(improvedFile0);
      //  // Unstable assertion: assertFalse(boolean0);
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
  /*Coverage entropy=1.0027182645175161
  */
  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      ImprovedFile improvedFile0 = new ImprovedFile(".WAR");
      ImprovedFile improvedFile1 = improvedFile0.createTempDir("You have unsaved changes.  Save them now?", "");
      ArchiveScanner archiveScanner0 = new ArchiveScanner(improvedFile1);
      // Undeclared exception!
      try { 
        archiveScanner0.scandir(improvedFile0, "You have unsaved changes.  Save them now?", true);
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
      ImprovedFile improvedFile0 = new ImprovedFile("$^Lxn");
      ArchiveScanner archiveScanner0 = new ArchiveScanner(improvedFile0);
      try { 
        archiveScanner0.scanArchive(improvedFile0, "$^Lxn");
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Error trying to list archive, $^Lxn
         //
         verifyException("com.lts.io.archive.AbstractNestedArchive", e);
      }
  }

  /**
  //Test case number: 19
  /*Coverage entropy=1.053395498360576
  */
  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      ImprovedFile improvedFile0 = new ImprovedFile(".war");
      improvedFile0.createTempDir(".war0You have unsaved changes.  Save them now?.jar", ".war0You have unsaved changes.  Save them now?.jar");
      File file0 = MockFile.createTempFile("_ou have unsaved changes.  Save them now?", "on&]Cc=Q1");
      ArchiveScanner archiveScanner0 = new ArchiveScanner(improvedFile0);
      archiveScanner0.setBasedir((File) improvedFile0);
      archiveScanner0.scan();
      try { 
        archiveScanner0.processDirectory(file0, "/swing.properties", false);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // IO error scanning directory /tmp/_ou have unsaved changes.  Save them now?1on&]Cc=Q1
         //
         verifyException("com.lts.io.ArchiveScanner", e);
      }
  }

  /**
  //Test case number: 20
  /*Coverage entropy=1.277034259466139
  */
  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      ImprovedFile improvedFile0 = new ImprovedFile("You haeunsaved changes.  Save them now?", "You haeunsaved changes.  Save them now?");
      ImprovedFile improvedFile1 = improvedFile0.createTempDir(".zip", ".zip");
      ArchiveScanner archiveScanner0 = new ArchiveScanner(improvedFile1);
      archiveScanner0.setBasedir((File) improvedFile1);
      archiveScanner0.scan();
      try { 
        archiveScanner0.processArchive(improvedFile0, ".EAR");
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Error trying to list archive, /home/ubuntu/termite/projects/78_caloriecount/You haeunsaved changes.  Save them now?/You haeunsaved changes.  Save them now?
         //
         verifyException("com.lts.io.archive.AbstractNestedArchive", e);
      }
  }

  /**
  //Test case number: 21
  /*Coverage entropy=1.277034259466139
  */
  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      ImprovedFile improvedFile0 = new ImprovedFile(".WAR");
      ImprovedFile improvedFile1 = improvedFile0.createTempDir("You have unsaved changes.  Save them now?", "");
      ArchiveScanner archiveScanner0 = new ArchiveScanner((ImprovedFile) null);
      archiveScanner0.setBasedir((File) improvedFile1);
      archiveScanner0.scan();
      // Undeclared exception!
      try { 
        archiveScanner0.processArchive((File) null, "com.lts.application.fatal.createTempArea");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.lts.io.archive.AbstractNestedArchive", e);
      }
  }

  /**
  //Test case number: 22
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      ImprovedFile improvedFile0 = new ImprovedFile(".ear", ".ear");
      ArchiveScanner archiveScanner0 = new ArchiveScanner(improvedFile0);
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
  //Test case number: 23
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      MockFile mockFile0 = new MockFile(">8U.]jGKIMaZ;H", "^Lxn");
      File file0 = ImprovedFile.buildName("%q|xlAOX@ 0&i:)", (-1L), "%q|xlAOX@ 0&i:)", mockFile0);
      ImprovedFile improvedFile0 = ImprovedFile.createTempImprovedFile(">8U.]jGKIMaZ;H", "%q|xlAOX@ 0&i:)", mockFile0);
      ArchiveScanner archiveScanner0 = new ArchiveScanner(improvedFile0);
      try { 
        archiveScanner0.scandir(file0, ",#j_F`e:3*RI=n%c", false);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // IO error scanning directory /home/ubuntu/termite/projects/78_caloriecount/>8U.]jGKIMaZ;H/^Lxn/%q|xlAOX@ 0&i:)-1.%q|xlAOX@ 0&i:)
         //
         verifyException("com.lts.io.ArchiveScanner", e);
      }
  }

  /**
  //Test case number: 24
  /*Coverage entropy=1.0549201679861442
  */
  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      ImprovedFile improvedFile0 = new ImprovedFile("x0] 1.jar");
      ImprovedFile improvedFile1 = improvedFile0.createTempDir(".war0You have unsaved changes.  Save them now?.jar", "/swing.properties");
      ArchiveScanner archiveScanner0 = new ArchiveScanner(improvedFile1);
      String[] stringArray0 = new String[6];
      stringArray0[0] = ".war0You have unsaved changes.  Save them now?.jar";
      stringArray0[1] = "/swing.properties";
      stringArray0[2] = "_ou have unsaved changes.  Save them now?";
      stringArray0[3] = "_ou have unsaved changes.  Save them now?";
      stringArray0[4] = ".war0You have unsaved changes.  Save them now?.jar";
      stringArray0[5] = "Error initializing tree.jar";
      archiveScanner0.setExcludes(stringArray0);
      archiveScanner0.setBasedir((File) improvedFile1);
      archiveScanner0.scan();
      archiveScanner0.processArchive(improvedFile1, "_ou have unsaved changes.  Save them now?");
      assertTrue(improvedFile1.exists());
  }

  /**
  //Test case number: 25
  /*Coverage entropy=0.6365141682948128
  */
  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      ImprovedFile improvedFile0 = new ImprovedFile(".WAR");
      ArchiveScanner archiveScanner0 = new ArchiveScanner(improvedFile0);
      archiveScanner0.setIncludes(archiveScanner0.DEFAULT_ARCHIVE_EXTENSIONS);
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
  //Test case number: 26
  /*Coverage entropy=1.0549201679861442
  */
  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      ImprovedFile improvedFile0 = new ImprovedFile("x0] 1.jar");
      ImprovedFile improvedFile1 = improvedFile0.createTempDir(".war0You have unsaved changes.  Save them now?.jar", "_ou have unsaved changes.  Save them now?");
      ArchiveScanner archiveScanner0 = new ArchiveScanner(improvedFile0);
      String[] stringArray0 = new String[6];
      stringArray0[0] = ".war0You have unsaved changes.  Save them now?.jar";
      stringArray0[1] = "/swing.properties";
      stringArray0[2] = "_ou have unsaved changes.  Save them now?";
      stringArray0[3] = "_ou have unsaved changes.  Save them now?";
      stringArray0[4] = ".war0You have unsaved changes.  Save them now?.jar";
      stringArray0[5] = "Error initializing tree.jar";
      archiveScanner0.setExcludes(stringArray0);
      archiveScanner0.setBasedir((File) improvedFile1);
      archiveScanner0.scan();
      archiveScanner0.processFile("_ou have unsaved changes.  Save them now?");
      assertEquals(1, ArchiveScanner.DIRECTORY);
  }

  /**
  //Test case number: 27
  /*Coverage entropy=1.069917341816382
  */
  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      ImprovedFile improvedFile0 = new ImprovedFile("B&wC\"lk/x");
      improvedFile0.createTempDir("You have unsaved changes.  Save them now?", "B&wC\"lk/x");
      ArchiveScanner archiveScanner0 = new ArchiveScanner(improvedFile0);
      archiveScanner0.setBasedir((File) improvedFile0);
      archiveScanner0.scan();
      archiveScanner0.setIncludes(archiveScanner0.DEFAULT_ARCHIVE_EXTENSIONS);
      archiveScanner0.scandir(improvedFile0, "x", false);
      assertTrue(improvedFile0.canExecute());
  }

  /**
  //Test case number: 28
  /*Coverage entropy=1.0114042647073518
  */
  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      ImprovedFile improvedFile0 = new ImprovedFile("&.ear.jar.jar");
      ImprovedFile improvedFile1 = improvedFile0.createTempDir("TNm!", "_ou have unsaved changes.  Save them now?");
      ArchiveScanner archiveScanner0 = new ArchiveScanner(improvedFile0);
      String[] stringArray0 = new String[6];
      stringArray0[0] = ".war0You have unsaved changes.  Save them now?.jar";
      stringArray0[1] = "TNm!";
      stringArray0[2] = "_ou have unsaved changes.  Save them now?";
      stringArray0[3] = "&.ear.jar.jar";
      stringArray0[4] = ".war0You have unsaved changes.  Save them now?.jar";
      stringArray0[5] = "Error initializing tree.jar";
      archiveScanner0.setExcludes(stringArray0);
      archiveScanner0.setBasedir((File) improvedFile1);
      archiveScanner0.scan();
      archiveScanner0.processDirectory(improvedFile1, ".war0You have unsaved changes.  Save them now?.jar", false);
      assertEquals(0L, improvedFile1.getUsableSpace());
  }

  /**
  //Test case number: 29
  /*Coverage entropy=1.4226300262075473
  */
  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      MockFile mockFile0 = new MockFile(">8U.]jGKIMaZ;H", "^Lxn");
      ImprovedFile improvedFile0 = ImprovedFile.createTempImprovedFile(">8U.]jGKIMaZ;H", "%q|xlAOX@ 0&i:)", mockFile0);
      ArchiveScanner archiveScanner0 = new ArchiveScanner(improvedFile0);
      archiveScanner0.setBasedir((File) mockFile0);
      archiveScanner0.scan();
      assertEquals(0, ArchiveScanner.FILE);
  }
}
