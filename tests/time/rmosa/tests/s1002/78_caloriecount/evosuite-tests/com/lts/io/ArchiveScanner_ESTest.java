/*
 * This file was automatically generated by EvoSuite
 * Sat Nov 28 13:58:19 GMT 2020
 */

package com.lts.io;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.lts.io.ArchiveScanner;
import com.lts.io.ImprovedFile;
import java.io.DataInputStream;
import java.io.File;
import java.io.InputStream;
import java.util.Vector;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class ArchiveScanner_ESTest extends ArchiveScanner_ESTest_scaffolding {

  /**
  //Test case number: 0
  /*Coverage entropy=1.0027182645175161
  */
  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      ImprovedFile improvedFile0 = new ImprovedFile("71>xdUa2c8");
      ArchiveScanner archiveScanner0 = new ArchiveScanner(improvedFile0);
      improvedFile0.createTempDir();
      // Undeclared exception!
      try { 
        archiveScanner0.scandir(improvedFile0, "", true);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  /**
  //Test case number: 1
  /*Coverage entropy=0.6365141682948128
  */
  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      ImprovedFile improvedFile0 = new ImprovedFile("!");
      ArchiveScanner archiveScanner0 = new ArchiveScanner(improvedFile0);
      String[] stringArray0 = new String[8];
      stringArray0[0] = "!";
      stringArray0[1] = "!";
      stringArray0[2] = "!";
      stringArray0[3] = "!";
      stringArray0[4] = "!";
      stringArray0[5] = "!";
      stringArray0[6] = "!";
      Vector<InputStream> vector0 = new Vector<InputStream>();
      archiveScanner0.filesExcluded = vector0;
      stringArray0[7] = "!";
      archiveScanner0.setExcludes(stringArray0);
      archiveScanner0.setIncludes(stringArray0);
      archiveScanner0.processArchive(improvedFile0, "!");
      assertFalse(improvedFile0.canWrite());
  }

  /**
  //Test case number: 2
  /*Coverage entropy=0.6365141682948128
  */
  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      ImprovedFile improvedFile0 = new ImprovedFile("71>xdUa2c8");
      ArchiveScanner archiveScanner0 = new ArchiveScanner(improvedFile0);
      String[] stringArray0 = new String[2];
      stringArray0[0] = ":uNp$%kQDY9";
      Vector<DataInputStream> vector0 = new Vector<DataInputStream>();
      archiveScanner0.filesExcluded = vector0;
      stringArray0[1] = "Error trying to create output file, ";
      archiveScanner0.setExcludes(stringArray0);
      archiveScanner0.setIncludes(stringArray0);
      archiveScanner0.processFile(":uNp$%kQDY9");
      assertEquals(0, ArchiveScanner.FILE);
  }

  /**
  //Test case number: 3
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      ImprovedFile improvedFile0 = new ImprovedFile(":uNp$%kQDY9");
      ArchiveScanner archiveScanner0 = new ArchiveScanner(improvedFile0);
      String[] stringArray0 = new String[2];
      stringArray0[0] = ":uNp$%kQDY9";
      stringArray0[1] = "Error trying to create output file, ";
      Vector<Object> vector0 = new Vector<Object>();
      archiveScanner0.filesNotIncluded = vector0;
      archiveScanner0.setIncludes(stringArray0);
      archiveScanner0.processFile("71>xdUa2c8");
      assertEquals(0, ArchiveScanner.FILE);
  }

  /**
  //Test case number: 4
  /*Coverage entropy=0.5623351446188083
  */
  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      ImprovedFile improvedFile0 = new ImprovedFile("!");
      ArchiveScanner archiveScanner0 = new ArchiveScanner(improvedFile0);
      Vector<Integer> vector0 = new Vector<Integer>();
      archiveScanner0.dirsNotIncluded = vector0;
      String[] stringArray0 = new String[4];
      stringArray0[0] = "Error trying to create output file, ";
      stringArray0[1] = "!";
      stringArray0[2] = "Error trying to create output file, ";
      stringArray0[3] = "Error trying to create output file, ";
      archiveScanner0.setExcludes(stringArray0);
      archiveScanner0.setIncludes(stringArray0);
      // Undeclared exception!
      try { 
        archiveScanner0.processDirectory(improvedFile0, "Error trying to create output file, ", true);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  /**
  //Test case number: 5
  /*Coverage entropy=0.5623351446188083
  */
  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      ImprovedFile improvedFile0 = new ImprovedFile("71>xdUa2c8");
      ArchiveScanner archiveScanner0 = new ArchiveScanner(improvedFile0);
      String[] stringArray0 = new String[2];
      stringArray0[0] = ":uNp$%kQDY9";
      Vector<String> vector0 = new Vector<String>();
      archiveScanner0.dirsIncluded = vector0;
      stringArray0[1] = "Error trying to create output file, ";
      archiveScanner0.setExcludes(stringArray0);
      archiveScanner0.setIncludes(stringArray0);
      // Undeclared exception!
      try { 
        archiveScanner0.processDirectory(improvedFile0, ":uNp$%kQDY9", false);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  /**
  //Test case number: 6
  /*Coverage entropy=0.5623351446188083
  */
  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      ImprovedFile improvedFile0 = new ImprovedFile("71>xdUa2c8");
      ArchiveScanner archiveScanner0 = new ArchiveScanner(improvedFile0);
      String[] stringArray0 = new String[1];
      stringArray0[0] = "pf";
      archiveScanner0.setExcludes(stringArray0);
      Vector<Object> vector0 = new Vector<Object>();
      archiveScanner0.filesIncluded = vector0;
      archiveScanner0.setIncludes(stringArray0);
      // Undeclared exception!
      try { 
        archiveScanner0.processDirectory(improvedFile0, "pf", true);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  /**
  //Test case number: 7
  /*Coverage entropy=0.5623351446188083
  */
  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      ImprovedFile improvedFile0 = new ImprovedFile("71>xdUa2c8");
      ArchiveScanner archiveScanner0 = new ArchiveScanner(improvedFile0);
      String[] stringArray0 = new String[2];
      stringArray0[0] = "71>xdUa2c8";
      stringArray0[1] = "Error trying to create output file, ";
      Vector<Object> vector0 = new Vector<Object>();
      archiveScanner0.filesNotIncluded = vector0;
      archiveScanner0.setExcludes(stringArray0);
      archiveScanner0.setIncludes(stringArray0);
      // Undeclared exception!
      try { 
        archiveScanner0.processDirectory(improvedFile0, "71>xdUa2c8", false);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  /**
  //Test case number: 8
  /*Coverage entropy=0.5623351446188083
  */
  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      ImprovedFile improvedFile0 = new ImprovedFile("71>xdUa2c8");
      ArchiveScanner archiveScanner0 = new ArchiveScanner(improvedFile0);
      String[] stringArray0 = new String[2];
      stringArray0[0] = ":uNp$%kQDY9";
      Vector<DataInputStream> vector0 = new Vector<DataInputStream>();
      archiveScanner0.filesExcluded = vector0;
      stringArray0[1] = "Error trying to create output file, ";
      archiveScanner0.setExcludes(stringArray0);
      archiveScanner0.setIncludes(stringArray0);
      // Undeclared exception!
      try { 
        archiveScanner0.processDirectory(improvedFile0, ":uNp$%kQDY9", true);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  /**
  //Test case number: 9
  /*Coverage entropy=0.5623351446188083
  */
  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      ImprovedFile improvedFile0 = new ImprovedFile("vG0fE[9s<.jar", "vG0fE[9s<.jar");
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
      ImprovedFile improvedFile0 = new ImprovedFile("!");
      ArchiveScanner archiveScanner0 = new ArchiveScanner(improvedFile0);
      archiveScanner0.addDefaultExcludes();
      Vector<Object> vector0 = new Vector<Object>();
      archiveScanner0.filesIncluded = vector0;
      String[] stringArray0 = new String[2];
      stringArray0[0] = "/home/ubuntu/termite/projects/78_caloriecount/!";
      stringArray0[1] = "r?{EDwnfirN'_Dp";
      archiveScanner0.setIncludes(stringArray0);
      archiveScanner0.processFile("/home/ubuntu/termite/projects/78_caloriecount/!");
      assertEquals(2, ArchiveScanner.ARCHIVE);
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
        archiveScanner0.toFileType((File) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  /**
  //Test case number: 12
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      ImprovedFile improvedFile0 = new ImprovedFile("o{&.", "o{&.");
      ArchiveScanner archiveScanner0 = new ArchiveScanner(improvedFile0);
      try { 
        archiveScanner0.scandir(improvedFile0, (String) null, false);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // IO error scanning directory /home/ubuntu/termite/projects/78_caloriecount/o{&./o{&.
         //
         verifyException("com.lts.io.ArchiveScanner", e);
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
        archiveScanner0.scandir((File) null, "dBY1", true);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
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
  //Test case number: 16
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
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
        archiveScanner0.processFile("");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
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
        archiveScanner0.processDirectory((File) null, (String) null, false);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
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
      }
  }

  /**
  //Test case number: 20
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      ImprovedFile improvedFile0 = new ImprovedFile("!");
      ArchiveScanner archiveScanner0 = new ArchiveScanner(improvedFile0);
      // Undeclared exception!
      try { 
        archiveScanner0.processArchive(improvedFile0, "");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
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
  //Test case number: 22
  /*Coverage entropy=1.0114042647073516
  */
  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      ImprovedFile improvedFile0 = new ImprovedFile("!");
      ArchiveScanner archiveScanner0 = new ArchiveScanner(improvedFile0);
      int int0 = archiveScanner0.toFileType(improvedFile0);
      assertEquals(0, int0);
  }

  /**
  //Test case number: 23
  /*Coverage entropy=1.0751393240053733
  */
  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      ImprovedFile improvedFile0 = new ImprovedFile("!");
      ArchiveScanner archiveScanner0 = new ArchiveScanner(improvedFile0);
      Vector<Integer> vector0 = new Vector<Integer>();
      archiveScanner0.dirsNotIncluded = vector0;
      String[] stringArray0 = new String[0];
      archiveScanner0.setIncludes(stringArray0);
      ImprovedFile.createTempDirectory("/home/ubuntu/termite/projects/78_caloriecount/!", "/home/ubuntu/termite/projects/78_caloriecount/!", (File) improvedFile0);
      // Undeclared exception!
      archiveScanner0.scandir(improvedFile0, "!", false);
  }

  /**
  //Test case number: 24
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      ImprovedFile improvedFile0 = new ImprovedFile("!");
      ArchiveScanner archiveScanner0 = new ArchiveScanner(improvedFile0);
      try { 
        archiveScanner0.scanArchive(improvedFile0, ", temp location: ");
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Error trying to list archive, !
         //
         verifyException("com.lts.io.archive.AbstractNestedArchive", e);
      }
  }

  /**
  //Test case number: 25
  /*Coverage entropy=0.8675632284814612
  */
  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      ImprovedFile improvedFile0 = new ImprovedFile("!");
      ArchiveScanner archiveScanner0 = new ArchiveScanner(improvedFile0);
      String[] stringArray0 = new String[3];
      stringArray0[0] = "!";
      stringArray0[1] = "!";
      stringArray0[2] = "o'`!f #";
      archiveScanner0.setExcludes(stringArray0);
      Vector<DataInputStream> vector0 = new Vector<DataInputStream>();
      archiveScanner0.dirsIncluded = vector0;
      String[] stringArray1 = new String[1];
      stringArray1[0] = "K8G>e}";
      archiveScanner0.setIncludes(stringArray1);
      try { 
        archiveScanner0.processDirectory(improvedFile0, "K8G>e}", true);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // IO error scanning directory /home/ubuntu/termite/projects/78_caloriecount/!
         //
         verifyException("com.lts.io.ArchiveScanner", e);
      }
  }

  /**
  //Test case number: 26
  /*Coverage entropy=0.7963116401738131
  */
  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      ImprovedFile improvedFile0 = new ImprovedFile("!");
      ArchiveScanner archiveScanner0 = new ArchiveScanner(improvedFile0);
      String[] stringArray0 = new String[3];
      stringArray0[0] = "!";
      stringArray0[1] = "!";
      stringArray0[2] = "o'`!f #";
      archiveScanner0.setExcludes(stringArray0);
      Vector<DataInputStream> vector0 = new Vector<DataInputStream>();
      archiveScanner0.dirsIncluded = vector0;
      String[] stringArray1 = new String[1];
      stringArray1[0] = "K8G>eb";
      archiveScanner0.setIncludes(stringArray1);
      try { 
        archiveScanner0.processDirectory(improvedFile0, "K8G>eb", false);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // IO error scanning directory /home/ubuntu/termite/projects/78_caloriecount/!
         //
         verifyException("com.lts.io.ArchiveScanner", e);
      }
  }
}
