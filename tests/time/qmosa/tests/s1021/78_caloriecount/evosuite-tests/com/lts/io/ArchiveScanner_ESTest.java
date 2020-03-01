/*
 * This file was automatically generated by EvoSuite
 * Wed Dec 04 05:55:24 GMT 2019
 */

package com.lts.io;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.lts.io.ArchiveScanner;
import com.lts.io.DirectoryScanner;
import com.lts.io.ImprovedFile;
import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.InputStream;
import java.io.PipedInputStream;
import java.io.SequenceInputStream;
import java.util.Enumeration;
import java.util.Vector;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.System;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
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
      MockFile mockFile0 = new MockFile("Create.jar", "t[pe|#@PHx1-`0t[pe|#@PHx1-`.jar");
      MockFile mockFile1 = new MockFile("Error encounterd while trying to save data.  Quit anyways?", "Error encounterd while trying to save data.  Quit anyways?");
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("Create.jar/t[pe|#@PHx1-`0t[pe|#@PHx1-`.jar");
      FileSystemHandling.appendLineToFile(evoSuiteFile0, "t[pe|#@PHx1-`0t[pe|#@PHx1-`.jar");
      ImprovedFile improvedFile0 = new ImprovedFile(mockFile0);
      EvoSuiteFile evoSuiteFile1 = new EvoSuiteFile("Create.jar/t[pe|#@PHx1-`0t[pe|#@PHx1-`.jar");
      FileSystemHandling.appendLineToFile(evoSuiteFile1, (String) null);
      ArchiveScanner archiveScanner0 = new ArchiveScanner(improvedFile0);
      String[] stringArray0 = new String[4];
      stringArray0[0] = "Error encounterd while trying to save data.  Quit anyways?";
      stringArray0[1] = "Error encounterd while trying to save data.  Quit anyways?";
      stringArray0[2] = "Error encounterd while trying to save data.  Quit anyways?";
      stringArray0[3] = "t[pe|#@PHx1-`0t[pe|#@PHx1-`.jar";
      mockFile0.toURL();
      archiveScanner0.setIncludes(stringArray0);
      archiveScanner0.excludes = stringArray0;
      archiveScanner0.setIncludes(stringArray0);
      mockFile0.getAbsoluteFile();
      MockFile mockFile2 = new MockFile("!");
      mockFile2.getCanonicalPath();
      FileSystemHandling.appendStringToFile(evoSuiteFile1, "Create.jar");
      FileSystemHandling.createFolder(evoSuiteFile1);
      mockFile1.setWritable(false, false);
      mockFile1.mkdir();
      mockFile0.getCanonicalPath();
      // Undeclared exception!
      try { 
        archiveScanner0.processFile("Error encounterd while trying to save data.  Quit anyways?");
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
  /*Coverage entropy=0.9623351446188083
  */
  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("Create.jar/m.)>3ol'CDr0l7/E(V(j.:&6J2h!qXnc!06/CF..Suc&JD+`D{(R^");
      FileSystemHandling.createFolder((EvoSuiteFile) null);
      MockFile mockFile0 = new MockFile(".ReQson: ", ".ReQson: ");
      MockFile mockFile1 = new MockFile("z;Jx}", ".ReQson: ");
      FileSystemHandling.createFolder((EvoSuiteFile) null);
      ImprovedFile improvedFile0 = new ImprovedFile(mockFile0);
      FileSystemHandling.appendDataToFile(evoSuiteFile0, (byte[]) null);
      ArchiveScanner archiveScanner0 = new ArchiveScanner(improvedFile0);
      improvedFile0.toPath();
      FileSystemHandling.createFolder(evoSuiteFile0);
      Vector<Integer> vector0 = new Vector<Integer>();
      String[] stringArray0 = new String[4];
      stringArray0[0] = "z;Jx}";
      stringArray0[1] = ".war";
      String[] stringArray1 = new String[5];
      stringArray1[0] = "yLZ|./d";
      stringArray1[1] = ".war";
      stringArray1[2] = "z;Jx}";
      stringArray1[3] = ".war";
      stringArray1[4] = ".war";
      archiveScanner0.excludes = stringArray1;
      stringArray0[2] = ".war";
      stringArray0[3] = ".ReQson: ";
      archiveScanner0.setIncludes(stringArray0);
      mockFile1.getAbsoluteFile();
      MockFile mockFile2 = new MockFile("z;Jx}");
      mockFile2.getCanonicalPath();
      FileSystemHandling.appendStringToFile(evoSuiteFile0, (String) null);
      FileSystemHandling.createFolder((EvoSuiteFile) null);
      mockFile0.setWritable(true, false);
      mockFile1.mkdir();
      mockFile1.getCanonicalPath();
      // Undeclared exception!
      try { 
        archiveScanner0.processFile(".ReQson: ");
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
  /*Coverage entropy=0.9623351446188083
  */
  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      MockFile mockFile0 = new MockFile("Create.jar", "t[pe|#@PHx1-`0t[pe|#@PHx1-`.jar");
      MockFile mockFile1 = new MockFile("Error encounterd while trying to save data.  Quit anyways?", "Error encounterd while trying to save data.  Quit anyways?");
      ImprovedFile improvedFile0 = new ImprovedFile(mockFile0);
      ArchiveScanner archiveScanner0 = new ArchiveScanner(improvedFile0);
      String[] stringArray0 = new String[4];
      stringArray0[0] = "Error encounterd while trying to save data.  Quit anyways?";
      Vector<String> vector0 = new Vector<String>();
      archiveScanner0.filesNotIncluded = vector0;
      stringArray0[1] = "Error encounterd while trying to save data.  Quit anyways?";
      stringArray0[2] = "Error encounterd while trying to save data.  Quit anyways?";
      stringArray0[3] = "t[pe|#@PHx1-`0t[pe|#@PHx1-`.jar";
      mockFile0.toURL();
      archiveScanner0.setIncludes(stringArray0);
      archiveScanner0.excludes = stringArray0;
      MockFile mockFile2 = new MockFile("Error encounterd while trying to save data.  Quit anyways?", ".JAR");
      MockFile mockFile3 = new MockFile("Error encounterd while trying to save data.  Quit anyways?");
      // Undeclared exception!
      try { 
        archiveScanner0.processArchive(mockFile1, "Error encounterd while trying to save data.  Quit anyways?");
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
  /*Coverage entropy=0.9623351446188083
  */
  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      MockFile mockFile0 = new MockFile("ErroC encountered while tringYto ave data.  Quit anyways?", "t[pe|#@PHx1-`0t[pe|#@PHx1-`.jar");
      MockFile mockFile1 = new MockFile("ErroC encountered while tringYto ave data.  Quit anyways?", "ErroC encountered while tringYto ave data.  Quit anyways?");
      mockFile0.toPath();
      mockFile0.setLastModified(1L);
      ImprovedFile improvedFile0 = new ImprovedFile(mockFile0);
      ArchiveScanner archiveScanner0 = new ArchiveScanner(improvedFile0);
      String[] stringArray0 = new String[4];
      stringArray0[0] = "ErroC encountered while tringYto ave data.  Quit anyways?";
      stringArray0[1] = "ErroC encountered while tringYto ave data.  Quit anyways?";
      stringArray0[2] = "ErroC encountered while tringYto ave data.  Quit anyways?";
      stringArray0[3] = "t[pe|#@PHx1-`0t[pe|#@PHx1-`.jar";
      mockFile0.toPath();
      mockFile0.toURL();
      mockFile0.delete();
      archiveScanner0.setIncludes(stringArray0);
      archiveScanner0.excludes = stringArray0;
      MockFile mockFile2 = new MockFile("ErroC encountered while tringYto ave data.  Quit anyways?", ".JAR");
      MockFile mockFile3 = new MockFile("ErroC encountered while tringYto ave data.  Quit anyways?");
      // Undeclared exception!
      try { 
        archiveScanner0.processDirectory(mockFile0, "ErroC encountered while tringYto ave data.  Quit anyways?", false);
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
  /*Coverage entropy=1.0365141682948127
  */
  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("Create.jar/m.)>3ol'CDr0l7/E(V(j.:&6J2h!qXnc!06/CF..Suc&JD+`D{(R^");
      FileSystemHandling.createFolder(evoSuiteFile0);
      MockFile mockFile0 = new MockFile("Create.jar", "m.)>3ol'CDr0l7");
      MockFile mockFile1 = new MockFile("m.)>3ol'CDr0l7", "m.)>3ol'CDr0l7");
      ImprovedFile improvedFile0 = new ImprovedFile(mockFile0);
      ArchiveScanner archiveScanner0 = new ArchiveScanner(improvedFile0);
      improvedFile0.toPath();
      EvoSuiteFile evoSuiteFile1 = new EvoSuiteFile("Create.jar/m.)>3ol'CDr0l7/E(V(j.:&6J2h!qXnc!06/CF..Suc&JD+`D{(R^");
      FileSystemHandling.createFolder(evoSuiteFile1);
      String[] stringArray0 = new String[1];
      Vector<Integer> vector0 = new Vector<Integer>();
      archiveScanner0.filesIncluded = vector0;
      stringArray0[0] = "Create.jar";
      archiveScanner0.setIncludes(stringArray0);
      MockFile mockFile2 = new MockFile((String) null, ".JAR");
      MockFile mockFile3 = new MockFile("m.)>3ol'CDr0l7");
      mockFile3.getCanonicalPath();
      FileSystemHandling.createFolder((EvoSuiteFile) null);
      mockFile2.mkdir();
      mockFile3.getCanonicalPath();
      // Undeclared exception!
      try { 
        archiveScanner0.processFile("/home/ubuntu/termite/projects/78_caloriecount/m.)>3ol'CDr0l7");
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
  /*Coverage entropy=1.533344419789668
  */
  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("Create.jar/m.)>3ol'CDr0l7/E(V(j.:&6J2h!qXnc!06/CF..Suc&JD+`D{(R^");
      FileSystemHandling.createFolder(evoSuiteFile0);
      MockFile mockFile0 = new MockFile("Create.jar", "m.)>3ol'CDr0l7");
      ImprovedFile improvedFile0 = new ImprovedFile(mockFile0);
      ArchiveScanner archiveScanner0 = new ArchiveScanner(improvedFile0);
      improvedFile0.toPath();
      EvoSuiteFile evoSuiteFile1 = new EvoSuiteFile("Create.jar/m.)>3ol'CDr0l7/E(V(j.:&6J2h!qXnc!06/CF..Suc&JD+`D{(R^");
      FileSystemHandling.createFolder(evoSuiteFile1);
      Vector<Integer> vector0 = new Vector<Integer>();
      archiveScanner0.filesIncluded = vector0;
      ImprovedFile.createTempImprovedFile("MjcD", ".JAR", improvedFile0);
      String[] stringArray0 = new String[0];
      archiveScanner0.setIncludes(stringArray0);
      improvedFile0.mkdir();
      // Undeclared exception!
      try { 
        archiveScanner0.scandir(improvedFile0, "281320., suffix .jar", false);
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
  /*Coverage entropy=0.9623351446188083
  */
  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("/home/ubuntu/termite/projects/78_caloriecount");
      FileSystemHandling.appendLineToFile(evoSuiteFile0, (String) null);
      ImprovedFile improvedFile0 = new ImprovedFile("CF..Suc&JD+`D{(R^.jar", "CF..Suc&JD+`D{(R^.jar");
      File file0 = ImprovedFile.createTempFileName(" fI?wn2*2", "", improvedFile0);
      ArchiveScanner archiveScanner0 = new ArchiveScanner(improvedFile0);
      improvedFile0.basicMakeDirectories(file0);
      FileSystemHandling.createFolder(evoSuiteFile0);
      ImprovedFile improvedFile1 = new ImprovedFile("x1-`", ".jar");
      archiveScanner0.isArchive(improvedFile0);
      improvedFile0.createTempDir();
      long long0 = (-1161L);
      System.setCurrentTimeMillis(long0);
  }

  /**
  //Test case number: 7
  /*Coverage entropy=1.710027779724208
  */
  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      String string0 = "v4<8BM;";
      ImprovedFile improvedFile0 = new ImprovedFile("IO error scanning directory ", "v4<8BM;");
      ArchiveScanner archiveScanner0 = new ArchiveScanner(improvedFile0);
      archiveScanner0.toFileType(improvedFile0);
      boolean boolean0 = false;
      ArchiveScanner archiveScanner1 = new ArchiveScanner(improvedFile0);
      // Undeclared exception!
      try { 
        archiveScanner1.processDirectory(improvedFile0, string0, boolean0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.lts.io.DirectoryScanner", e);
      }
  }

  /**
  //Test case number: 8
  /*Coverage entropy=1.9210203354075464
  */
  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      ArchiveScanner archiveScanner0 = new ArchiveScanner((ImprovedFile) null);
      MockFile mockFile0 = new MockFile("akQaTnep=\"230.tmp.jar", ", is not one of the child nodes of ");
      MockFile mockFile1 = new MockFile(", is not one of the child nodes of ", ", is not one of the child nodes of ");
      ImprovedFile improvedFile0 = new ImprovedFile(mockFile1);
      ArchiveScanner archiveScanner1 = new ArchiveScanner((ImprovedFile) null);
      improvedFile0.mkdir();
      mockFile1.getAbsolutePath();
      ImprovedFile.createTempImprovedFile(", is not one of the child nodes of ", ", is not one of the child nodes of ", mockFile1);
      archiveScanner1.setIncludes(archiveScanner0.DEFAULT_ARCHIVE_EXTENSIONS);
      boolean boolean0 = mockFile1.mkdir();
      String string0 = "3#1QU E-A{";
      // Undeclared exception!
      try { 
        archiveScanner1.scandir(improvedFile0, string0, boolean0);
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
  /*Coverage entropy=1.0365141682948127
  */
  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      System.setCurrentTimeMillis(1251L);
      Vector<Object> vector0 = new Vector<Object>();
      ImprovedFile improvedFile0 = new ImprovedFile("=6FQdCRGD\"%dY");
      ArchiveScanner archiveScanner0 = new ArchiveScanner(improvedFile0);
      boolean boolean0 = archiveScanner0.haveSlowResults;
      Object object0 = new Object();
      Vector<Object> vector1 = new Vector<Object>();
      Vector<Object> vector2 = new Vector<Object>();
      vector2.add((Object) "=6FQdCRGD\"%dY");
      Object object1 = new Object();
      vector2.add((Object) null);
      Object object2 = new Object();
      PipedInputStream pipedInputStream0 = new PipedInputStream(1);
      BufferedInputStream bufferedInputStream0 = new BufferedInputStream(pipedInputStream0, 2);
      vector2.add((Object) bufferedInputStream0);
      String[] stringArray0 = new String[8];
      stringArray0[0] = "W>]#";
      stringArray0[1] = "W>]#";
      stringArray0[2] = "W>]#";
      stringArray0[3] = "";
      stringArray0[4] = "=6FQdCRGD\"%dY";
      stringArray0[5] = "=6FQdCRGD\"%dY";
      stringArray0[6] = ".WAR";
      stringArray0[7] = "=6FQdCRGD\"%dY";
      archiveScanner0.setIncludes(stringArray0);
      MockFile mockFile0 = new MockFile("h/T]8,Nd7m!t1fn", "W>]#");
      // Undeclared exception!
      try { 
        archiveScanner0.processDirectory(improvedFile0, "n=;R<E0OtnhNYg", false);
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
  /*Coverage entropy=1.0365141682948127
  */
  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      MockFile mockFile0 = new MockFile("Create.jar", "m.)>3ol'CDr0l7");
      MockFile mockFile1 = new MockFile("Error encountered while trying to save data.  Quit anyways?", "Error encountered while trying to save data.  Quit anyways?");
      ImprovedFile improvedFile0 = new ImprovedFile(mockFile0);
      mockFile0.setExecutable(false, false);
      ArchiveScanner archiveScanner0 = new ArchiveScanner(improvedFile0);
      String[] stringArray0 = new String[4];
      stringArray0[0] = "Error encountered while trying to save data.  Quit anyways?";
      stringArray0[1] = "Create.jar";
      stringArray0[2] = "Error encountered while trying to save data.  Quit anyways?";
      stringArray0[3] = "m.)>3ol'CDr0l7";
      archiveScanner0.setIncludes(stringArray0);
      MockFile mockFile2 = new MockFile("Error encountered while trying to save data.  Quit anyways?", ".JAR");
      MockFile mockFile3 = new MockFile("m.)>3ol'CDr0l7");
      mockFile2.mkdir();
      mockFile1.getAbsolutePath();
      mockFile0.mkdir();
      MockFile mockFile4 = new MockFile("mAr|9=r U!`H_PL");
      // Undeclared exception!
      try { 
        archiveScanner0.processArchive(mockFile2, "+|tQ9,Z=<Jy :Lrmn+");
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
  /*Coverage entropy=1.533344419789668
  */
  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      ImprovedFile improvedFile0 = new ImprovedFile("{(R^");
      ArchiveScanner archiveScanner0 = new ArchiveScanner(improvedFile0);
      Vector<Object> vector0 = new Vector<Object>();
      Vector<Object> vector1 = new Vector<Object>();
      vector1.add((Object) "!");
      boolean boolean0 = archiveScanner0.haveSlowResults;
      Object object0 = new Object();
      Vector<Object> vector2 = new Vector<Object>();
      Object object1 = new Object();
      vector2.add(object1);
      vector2.add(object1);
      Object object2 = new Object();
      String[] stringArray0 = new String[2];
      stringArray0[0] = "{(R^";
      stringArray0[1] = "4<S3]jko9i(|";
      archiveScanner0.setIncludes(stringArray0);
      ImprovedFile improvedFile1 = ImprovedFile.createTempDirectory(".war", "z;Jx}", (File) improvedFile0);
      improvedFile1.mkdir();
      // Undeclared exception!
      try { 
        archiveScanner0.scandir(improvedFile0, "z=suP[r]0dirflLy.jar", true);
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
  /*Coverage entropy=1.892246898188396
  */
  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      MockFile mockFile0 = new MockFile("Create.jar", "m.)>3ol'CDr0l7");
      MockFile mockFile1 = new MockFile("Error encountered while trying to save data.  Quit anyways?", "Error encountered while trying to save data.  Quit anyways?");
      ImprovedFile improvedFile0 = new ImprovedFile(mockFile0);
      ArchiveScanner archiveScanner0 = new ArchiveScanner(improvedFile0);
      String[] stringArray0 = new String[0];
      mockFile0.mkdir();
      mockFile0.getAbsolutePath();
      ImprovedFile.createTempImprovedFile("t[pe|#@qPHx1-`", "t[pe|#@qPHx1-`", improvedFile0);
      archiveScanner0.setIncludes(stringArray0);
      improvedFile0.mkdir();
      // Undeclared exception!
      try { 
        archiveScanner0.scandir(mockFile0, "Error encountered while trying to save data.  Quit anyways?", false);
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
  /*Coverage entropy=1.0365141682948127
  */
  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("/home/ubuntu/termite/projects/78_caloriecount");
      FileSystemHandling.appendLineToFile(evoSuiteFile0, (String) null);
      FileSystemHandling.setPermissions(evoSuiteFile0, false, false, false);
      ImprovedFile improvedFile0 = new ImprovedFile((String) null, "");
      EvoSuiteFile evoSuiteFile1 = new EvoSuiteFile("/home/ubuntu/termite/projects/78_caloriecount");
      byte[] byteArray0 = new byte[5];
      byteArray0[0] = (byte) (-121);
      byteArray0[1] = (byte) (-79);
      byteArray0[2] = (byte) (-64);
      byteArray0[3] = (byte) (-79);
      byteArray0[4] = (byte)100;
      FileSystemHandling.appendDataToFile(evoSuiteFile1, byteArray0);
      FileSystemHandling.shouldThrowIOException((EvoSuiteFile) null);
      FileSystemHandling fileSystemHandling0 = new FileSystemHandling();
      FileSystemHandling.setPermissions(evoSuiteFile0, false, false, true);
      ArchiveScanner archiveScanner0 = new ArchiveScanner(improvedFile0);
      improvedFile0.setExecutable(true, false);
      FileSystemHandling.appendStringToFile((EvoSuiteFile) null, ".JAR");
      FileSystemHandling.appendStringToFile((EvoSuiteFile) null, (String) null);
      FileSystemHandling.appendStringToFile(evoSuiteFile1, "bUi Z@kN");
      archiveScanner0.scandir(improvedFile0, ")X@\"H2f!O", false);
      System.setCurrentTimeMillis(0L);
      System.setCurrentTimeMillis(0L);
      System.setCurrentTimeMillis(0L);
      System.setCurrentTimeMillis(0L);
  }

  /**
  //Test case number: 14
  /*Coverage entropy=1.0931471805599453
  */
  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      System.setCurrentTimeMillis(1251L);
      Vector<Object> vector0 = new Vector<Object>();
      ImprovedFile improvedFile0 = new ImprovedFile("=6FQdCRGD\"%dY");
      ArchiveScanner archiveScanner0 = new ArchiveScanner(improvedFile0);
      boolean boolean0 = archiveScanner0.haveSlowResults;
      Object object0 = new Object();
      Vector<Object> vector1 = new Vector<Object>();
      Vector<Object> vector2 = new Vector<Object>();
      vector2.add((Object) "=6FQdCRGD\"%dY");
      Object object1 = new Object();
      vector2.add((Object) null);
      Object object2 = new Object();
      PipedInputStream pipedInputStream0 = new PipedInputStream(1);
      BufferedInputStream bufferedInputStream0 = new BufferedInputStream(pipedInputStream0, 2);
      vector2.add((Object) bufferedInputStream0);
      String[] stringArray0 = new String[8];
      stringArray0[0] = "W>]#";
      stringArray0[1] = "W>]#";
      stringArray0[2] = "W>]#";
      stringArray0[3] = "";
      stringArray0[4] = "=6FQdCRGD\"%dY";
      stringArray0[5] = "=6FQdCRGD\"%dY";
      stringArray0[6] = ".WAR";
      stringArray0[7] = "=6FQdCRGD\"%dY";
      archiveScanner0.setIncludes(stringArray0);
      MockFile mockFile0 = new MockFile("h/T]8,Nd7m!t1fn", "W>]#");
      improvedFile0.getAbsolutePath();
      improvedFile0.mkdir();
      try { 
        archiveScanner0.scandir(improvedFile0, "=6FQdCRGD\"%dY", true);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // IO error scanning directory /home/ubuntu/termite/projects/78_caloriecount/=6FQdCRGD\"%dY
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
      MockFile mockFile0 = new MockFile(", ", ", ");
      ImprovedFile improvedFile0 = new ImprovedFile(mockFile0);
      MockFile mockFile1 = new MockFile("!$KV$qQ{X[#D[AR]@", ".WAR");
      ImprovedFile improvedFile1 = new ImprovedFile("Error encountered while trying to save data.  Quit anyways?", "Error encountered while trying to save data.  Quit anyways?");
      ArchiveScanner archiveScanner0 = new ArchiveScanner(improvedFile0);
      archiveScanner0.setIncludes((String[]) null);
      MockFile mockFile2 = new MockFile(", ", ".WAR");
      MockFile mockFile3 = new MockFile("=9E3Pz\"");
      mockFile3.mkdir();
      mockFile2.getCanonicalPath();
      System.setCurrentTimeMillis(1);
      archiveScanner0.isArchive(mockFile2);
      long long0 = 0L;
      System.setCurrentTimeMillis(long0);
  }

  /**
  //Test case number: 16
  /*Coverage entropy=1.0931471805599453
  */
  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      ImprovedFile improvedFile0 = new ImprovedFile("281320., suffix .jar", "M:o0o58'}?9");
      ImprovedFile improvedFile1 = new ImprovedFile(improvedFile0, "!.jar");
      ImprovedFile improvedFile2 = improvedFile1.createTempDir();
      ArchiveScanner archiveScanner0 = new ArchiveScanner(improvedFile2);
      int int0 = archiveScanner0.toFileType(improvedFile0);
      assertEquals(1, int0);
  }

  /**
  //Test case number: 17
  /*Coverage entropy=0.9623351446188083
  */
  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      ImprovedFile improvedFile0 = new ImprovedFile("[T7B");
      ImprovedFile improvedFile1 = improvedFile0.createTempDir();
      ArchiveScanner archiveScanner0 = new ArchiveScanner(improvedFile1);
      boolean boolean0 = archiveScanner0.isArchive(improvedFile0);
      assertFalse(boolean0);
  }

  /**
  //Test case number: 18
  /*Coverage entropy=1.4471627089619605
  */
  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("Create.jar/m.)>3ol'CDr0l7/E(V(j.:&6J2h!qXnc!06/CF..Suc&JD+`D{(R^");
      FileSystemHandling.createFolder(evoSuiteFile0);
      FileSystemHandling.setPermissions((EvoSuiteFile) null, false, false, true);
      ImprovedFile improvedFile0 = new ImprovedFile("m.)>3ol'CDr0l7", "Create.jar");
      FileSystemHandling.shouldThrowIOException((EvoSuiteFile) null);
      FileSystemHandling.setPermissions(evoSuiteFile0, true, true, true);
      ArchiveScanner archiveScanner0 = new ArchiveScanner(improvedFile0);
      DirectoryScanner.matchPath("v4<8B`M;.jar", "rJ%y?ZH6mKGy=W8wLXP");
      FileSystemHandling.appendStringToFile((EvoSuiteFile) null, (String) null);
      FileSystemHandling.appendStringToFile((EvoSuiteFile) null, "m.)>3ol'CDr0l7");
      ImprovedFile.createTempDirectory("Create.jar", "9]", (File) improvedFile0);
      // Undeclared exception!
      try { 
        archiveScanner0.scandir(improvedFile0, "2CY<H,XphLL9}=6zA", false);
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
  /*Coverage entropy=1.4399756932787802
  */
  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      ImprovedFile improvedFile0 = new ImprovedFile("IO error scanning directory ", "v4<8BM;");
      ArchiveScanner archiveScanner0 = new ArchiveScanner(improvedFile0);
      Object object0 = new Object();
      Object object1 = new Object();
      Vector<Object> vector0 = new Vector<Object>();
      Object object2 = new Object();
      vector0.add(object2);
      byte[] byteArray0 = new byte[5];
      byteArray0[0] = (byte)42;
      byteArray0[1] = (byte)42;
      byteArray0[2] = (byte)5;
      byteArray0[3] = (byte)42;
      byteArray0[4] = (byte)5;
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      Object object3 = new Object();
      vector0.add(object3);
      ImprovedFile improvedFile1 = new ImprovedFile("G$pu");
      int int0 = archiveScanner0.toFileType(improvedFile1);
      assertEquals(0, int0);
  }

  /**
  //Test case number: 20
  /*Coverage entropy=1.4399756932787802
  */
  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      MockFile mockFile0 = new MockFile("m.)>3ol'CDr0l7", "Error encountered while trying to save data.  Quit anyways?");
      ImprovedFile improvedFile0 = new ImprovedFile("m.)>3ol'CDr0l7", "m.)>3ol'CDr0l7");
      String string0 = ", ";
      ArchiveScanner archiveScanner0 = new ArchiveScanner(improvedFile0);
      archiveScanner0.setBasedir((File) improvedFile0);
      String[] stringArray0 = new String[1];
      stringArray0[0] = "Error encountered while trying to save data.  Quit anyways?";
      archiveScanner0.toFileType(improvedFile0);
      MockFile mockFile1 = new MockFile(string0, string0);
      mockFile1.getAbsoluteFile();
      mockFile1.mkdir();
      long long0 = (-1L);
      System.setCurrentTimeMillis(long0);
      System.setCurrentTimeMillis(long0);
  }

  /**
  //Test case number: 21
  /*Coverage entropy=1.0931471805599453
  */
  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      System.setCurrentTimeMillis(1251L);
      ImprovedFile improvedFile0 = new ImprovedFile("gu5jlF^]>JnVO!Iw0, .jar0Errr trying to read zipfile, 281320.swing.defaultlaf.jar.jar.jar", "gu5jlF^]>JnVO!Iw0, .jar0Errr trying to read zipfile, 281320.swing.defaultlaf.jar.jar.jar");
      ArchiveScanner archiveScanner0 = new ArchiveScanner(improvedFile0);
      Vector<Object> vector0 = new Vector<Object>();
      Enumeration<InputStream> enumeration0 = (Enumeration<InputStream>) mock(Enumeration.class, new ViolatedAssumptionAnswer());
      doReturn(false).when(enumeration0).hasMoreElements();
      vector0.clear();
      SequenceInputStream sequenceInputStream0 = new SequenceInputStream(enumeration0);
      vector0.add((Object) sequenceInputStream0);
      Object object0 = new Object();
      vector0.add((Object) sequenceInputStream0);
      Object object1 = new Object();
      vector0.add((Object) null);
      Object object2 = new Object();
      Object object3 = new Object();
      Object object4 = new Object();
      Vector<Object> vector1 = new Vector<Object>();
      vector1.add(object0);
      try { 
        archiveScanner0.scanArchive(improvedFile0, "7wU2;Rq=kU9R,_lOtfw");
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Error trying to list archive, /home/ubuntu/termite/projects/78_caloriecount/gu5jlF^]>JnVO!Iw0, .jar0Errr trying to read zipfile, 281320.swing.defaultlaf.jar.jar.jar/gu5jlF^]>JnVO!Iw0, .jar0Errr trying to read zipfile, 281320.swing.defaultlaf.jar.jar.jar
         //
         verifyException("com.lts.io.archive.AbstractNestedArchive", e);
      }
  }

  /**
  //Test case number: 22
  /*Coverage entropy=1.0931471805599453
  */
  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      ArchiveScanner archiveScanner0 = new ArchiveScanner((ImprovedFile) null);
      Vector<Object> vector0 = new Vector<Object>();
      Vector<Object> vector1 = new Vector<Object>();
      Vector<Object> vector2 = new Vector<Object>();
      boolean boolean0 = archiveScanner0.haveSlowResults;
      Object object0 = new Object();
      Vector<Object> vector3 = new Vector<Object>();
      Vector<Object> vector4 = new Vector<Object>();
      vector2.add((Object) ".WAR");
      Object object1 = new Object();
      vector2.add((Object) null);
      Object object2 = new Object();
      vector2.add(object1);
      Object object3 = new Object();
      Object object4 = new Object();
      Object object5 = new Object();
      Vector<Object> vector5 = new Vector<Object>();
      Object object6 = new Object();
      vector3.add(object6);
      // Undeclared exception!
      try { 
        archiveScanner0.scanArchive((File) null, "EY]V6]O8]r858.");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.lts.io.archive.AbstractNestedArchive", e);
      }
  }

  /**
  //Test case number: 23
  /*Coverage entropy=0.9623351446188083
  */
  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      System.setCurrentTimeMillis(1251L);
      ImprovedFile improvedFile0 = new ImprovedFile("gu5jlF^]>JnoVO!Iw0, .jar0Error trying to read zipfile, 281320.swing.defaultlaf.jar.jar.jar", "gu5jlF^]>JnoVO!Iw0, .jar0Error trying to read zipfile, 281320.swing.defaultlaf.jar.jar.jar");
      ArchiveScanner archiveScanner0 = new ArchiveScanner(improvedFile0);
      archiveScanner0.isArchive(improvedFile0);
      System.setCurrentTimeMillis(archiveScanner0.FILE);
      System.setCurrentTimeMillis(archiveScanner0.ARCHIVE);
      long long0 = (-1317L);
      System.setCurrentTimeMillis(long0);
      long long1 = 0L;
      System.setCurrentTimeMillis(long1);
      long long2 = (-3079L);
      System.setCurrentTimeMillis(long2);
      assertFalse(long2 == long1);
  }
}
