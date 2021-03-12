/*
 * This file was automatically generated by EvoSuite
 * Wed Nov 11 20:00:02 GMT 2020
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
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class ArchiveScanner_ESTest extends ArchiveScanner_ESTest_scaffolding {

  /**
  //Test case number: 0
  /*Coverage entropy=0.5623351446188083
  */
  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      ImprovedFile improvedFile0 = new ImprovedFile("Faile tocrate dirctoly, ");
      ArchiveScanner archiveScanner0 = new ArchiveScanner(improvedFile0);
      String[] stringArray0 = new String[2];
      stringArray0[0] = "^.waLr";
      stringArray0[1] = "^.waLr";
      archiveScanner0.setIncludes(stringArray0);
      Vector<Integer> vector0 = new Vector<Integer>();
      archiveScanner0.dirsIncluded = vector0;
      archiveScanner0.addDefaultExcludes();
      // Undeclared exception!
      try { 
        archiveScanner0.processArchive(improvedFile0, "^.waLr");
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
      ImprovedFile improvedFile0 = new ImprovedFile("V1sb", "qd@?V+b");
      ArchiveScanner archiveScanner0 = new ArchiveScanner(improvedFile0);
      String[] stringArray0 = new String[4];
      stringArray0[0] = "V1sb";
      stringArray0[1] = "qd@?V+b";
      Vector<String> vector0 = new Vector<String>();
      archiveScanner0.filesExcluded = vector0;
      stringArray0[2] = "V1sb";
      stringArray0[3] = "gd4e";
      archiveScanner0.setIncludes(stringArray0);
      archiveScanner0.addDefaultExcludes();
      // Undeclared exception!
      try { 
        archiveScanner0.processArchive(improvedFile0, "V1sb");
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
      ImprovedFile improvedFile0 = new ImprovedFile("Erro trying to reate temp directoy in ", "*V-M}-.RtRf9");
      ArchiveScanner archiveScanner0 = new ArchiveScanner(improvedFile0);
      String[] stringArray0 = new String[4];
      stringArray0[0] = "*V-M}-.RtRf9";
      stringArray0[1] = "*V-M}-.RtRf9";
      stringArray0[2] = "Erro trying to reate temp directoy in ";
      stringArray0[3] = "gd4e";
      archiveScanner0.setIncludes(stringArray0);
      Vector<InputStream> vector0 = new Vector<InputStream>(3309);
      archiveScanner0.filesExcluded = vector0;
      archiveScanner0.setExcludes(stringArray0);
      archiveScanner0.processArchive(improvedFile0, "Erro trying to reate temp directoy in ");
      assertFalse(improvedFile0.isHidden());
  }

  /**
  //Test case number: 3
  /*Coverage entropy=0.6365141682948128
  */
  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      ImprovedFile improvedFile0 = new ImprovedFile("Error while trying to remove temp directory, ");
      ArchiveScanner archiveScanner0 = new ArchiveScanner(improvedFile0);
      String[] stringArray0 = new String[4];
      stringArray0[0] = "";
      stringArray0[1] = "gd4e";
      stringArray0[2] = "o_mZ1Fafl";
      Vector<Integer> vector0 = new Vector<Integer>();
      archiveScanner0.dirsExcluded = vector0;
      stringArray0[3] = "";
      archiveScanner0.setIncludes(stringArray0);
      // Undeclared exception!
      try { 
        archiveScanner0.processArchive((File) null, "Error while trying to remove temp directory, ");
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
      ImprovedFile improvedFile0 = new ImprovedFile("Error trying to create,temp directory in ", "Error trying to create,temp directory in ");
      ArchiveScanner archiveScanner0 = new ArchiveScanner(improvedFile0);
      String[] stringArray0 = new String[4];
      stringArray0[0] = "4UWd";
      stringArray0[1] = "gd4e";
      stringArray0[2] = "Error trying to create,temp directory in ";
      Vector<String> vector0 = new Vector<String>();
      archiveScanner0.dirsNotIncluded = vector0;
      stringArray0[3] = "gd4e";
      archiveScanner0.setIncludes(stringArray0);
      archiveScanner0.addDefaultExcludes();
      // Undeclared exception!
      try { 
        archiveScanner0.processFile("gd4e");
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
      ImprovedFile improvedFile0 = new ImprovedFile("Error trying to create,temp directory in ", "Error trying to create,temp directory in ");
      ArchiveScanner archiveScanner0 = new ArchiveScanner(improvedFile0);
      String[] stringArray0 = new String[4];
      stringArray0[0] = "4UWd";
      stringArray0[1] = "gd4e";
      stringArray0[2] = "Error trying to create,temp directory in ";
      stringArray0[3] = "gd4e";
      archiveScanner0.setIncludes(stringArray0);
      Vector<String> vector0 = new Vector<String>();
      archiveScanner0.dirsIncluded = vector0;
      archiveScanner0.addDefaultExcludes();
      // Undeclared exception!
      try { 
        archiveScanner0.processFile("gd4e");
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
      ImprovedFile improvedFile0 = new ImprovedFile("Error trying to create,temp directory in ", "Error trying to create,temp directory in ");
      ArchiveScanner archiveScanner0 = new ArchiveScanner(improvedFile0);
      Vector<InputStream> vector0 = new Vector<InputStream>();
      archiveScanner0.filesNotIncluded = vector0;
      String[] stringArray0 = new String[4];
      stringArray0[0] = "4UWd";
      stringArray0[1] = "gd4e";
      stringArray0[2] = "Error trying to create,temp directory in ";
      stringArray0[3] = "gd4e";
      archiveScanner0.setIncludes(stringArray0);
      archiveScanner0.addDefaultExcludes();
      // Undeclared exception!
      try { 
        archiveScanner0.processFile("gd4e");
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
  /*Coverage entropy=0.6365141682948128
  */
  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      ImprovedFile improvedFile0 = new ImprovedFile("Erro trying to reate temp directoy in ", "*V-M}-.RtRf9");
      ArchiveScanner archiveScanner0 = new ArchiveScanner(improvedFile0);
      String[] stringArray0 = new String[4];
      stringArray0[0] = "*jh=zi]v!@{<r}Rf(^";
      stringArray0[1] = "*V-M}-.RtRf9";
      stringArray0[2] = "Erro trying to reate temp directoy in ";
      stringArray0[3] = "gd4e";
      archiveScanner0.setIncludes(stringArray0);
      Vector<InputStream> vector0 = new Vector<InputStream>(3309);
      archiveScanner0.filesExcluded = vector0;
      archiveScanner0.setExcludes(stringArray0);
      archiveScanner0.processFile("Erro trying to reate temp directoy in ");
      assertEquals(2, ArchiveScanner.ARCHIVE);
  }

  /**
  //Test case number: 8
  /*Coverage entropy=1.0751393240053733
  */
  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      ImprovedFile improvedFile0 = new ImprovedFile("Error trying to create temp directory in ", "*V-M}-.RtRf9");
      ArchiveScanner archiveScanner0 = new ArchiveScanner(improvedFile0);
      String[] stringArray0 = new String[4];
      stringArray0[0] = "Error trying to create temp directory in ";
      stringArray0[1] = "gd4e";
      stringArray0[2] = "Error trying to create temp directory in ";
      Vector<String> vector0 = new Vector<String>();
      archiveScanner0.dirsNotIncluded = vector0;
      archiveScanner0.haveSlowResults = true;
      stringArray0[3] = "gd4e";
      archiveScanner0.setIncludes(stringArray0);
      improvedFile0.createTempDir();
      archiveScanner0.scandir(improvedFile0, "gd4e", false);
      assertTrue(improvedFile0.canWrite());
  }

  /**
  //Test case number: 9
  /*Coverage entropy=0.5623351446188083
  */
  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      ImprovedFile improvedFile0 = new ImprovedFile("V1s2b", ".zip");
      ArchiveScanner archiveScanner0 = new ArchiveScanner(improvedFile0);
      String[] stringArray0 = new String[4];
      stringArray0[0] = "V1s2b";
      stringArray0[1] = ".zip";
      stringArray0[2] = "V1s2b";
      stringArray0[3] = "V1s2b";
      archiveScanner0.setIncludes(stringArray0);
      archiveScanner0.setExcludes(stringArray0);
      Vector<Object> vector0 = new Vector<Object>();
      archiveScanner0.dirsExcluded = vector0;
      archiveScanner0.processDirectory(improvedFile0, ".zip", true);
      assertEquals(0L, improvedFile0.getTotalSpace());
  }

  /**
  //Test case number: 10
  /*Coverage entropy=1.0114042647073516
  */
  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      ImprovedFile improvedFile0 = new ImprovedFile("Faile tocrate dircto>y, .jar.jar");
      ArchiveScanner archiveScanner0 = new ArchiveScanner(improvedFile0);
      int int0 = archiveScanner0.toFileType(improvedFile0);
      assertEquals(2, int0);
  }

  /**
  //Test case number: 11
  /*Coverage entropy=1.3208883431493221
  */
  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      ImprovedFile improvedFile0 = new ImprovedFile("Error trying to create temp directory in ", "*V-M}-.RtRf9");
      ImprovedFile.createTempImprovedFile("Error trying to create temp directory in ", "*V-M}-.RtRf9", improvedFile0);
      ArchiveScanner archiveScanner0 = new ArchiveScanner(improvedFile0);
      // Undeclared exception!
      try { 
        archiveScanner0.scandir(improvedFile0, "gd4e", false);
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
      ImprovedFile improvedFile0 = new ImprovedFile("kv$Bf", "kv$Bf");
      ArchiveScanner archiveScanner0 = new ArchiveScanner(improvedFile0);
      String[] stringArray0 = new String[4];
      stringArray0[0] = "kv$Bf";
      stringArray0[1] = "gd4e";
      stringArray0[2] = "kv$Bf";
      stringArray0[3] = "gd4e";
      archiveScanner0.setIncludes(stringArray0);
      Vector<String> vector0 = new Vector<String>();
      archiveScanner0.filesNotIncluded = vector0;
      archiveScanner0.processFile(".ZIP");
      assertEquals(2, ArchiveScanner.ARCHIVE);
  }

  /**
  //Test case number: 13
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      ImprovedFile improvedFile0 = new ImprovedFile("spR?*`h7HP%*jT", "spR?*`h7HP%*jT");
      ArchiveScanner archiveScanner0 = new ArchiveScanner(improvedFile0);
      try { 
        archiveScanner0.scanArchive(improvedFile0, "spR?*`h7HP%*jT");
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Error trying to list archive, /home/ubuntu/replication/scripts/projects/78_caloriecount/spR?*`h7HP%*jT/spR?*`h7HP%*jT
         //
         verifyException("com.lts.io.archive.AbstractNestedArchive", e);
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
        archiveScanner0.scanArchive((File) null, "s#pRgt2L&7H %*ja");
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
  /*Coverage entropy=0.5004024235381879
  */
  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      ImprovedFile improvedFile0 = new ImprovedFile("Ld0e");
      ArchiveScanner archiveScanner0 = new ArchiveScanner(improvedFile0);
      String[] stringArray0 = new String[4];
      stringArray0[0] = "Ld0e";
      stringArray0[1] = "Ld0e";
      stringArray0[2] = "akLdJX";
      Vector<String> vector0 = new Vector<String>();
      archiveScanner0.dirsNotIncluded = vector0;
      stringArray0[3] = "Ld0e";
      archiveScanner0.setIncludes(stringArray0);
      archiveScanner0.processDirectory(improvedFile0, "r#EYgv+]C", true);
      assertEquals(0L, improvedFile0.lastModified());
  }

  /**
  //Test case number: 16
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      ImprovedFile improvedFile0 = new ImprovedFile("Error trying to create temp directory in ", "*V-M}-.RtRf9");
      ArchiveScanner archiveScanner0 = new ArchiveScanner(improvedFile0);
      ImprovedFile improvedFile1 = improvedFile0.createTempDir();
      int int0 = archiveScanner0.toFileType(improvedFile1);
      assertEquals(1, int0);
  }

  /**
  //Test case number: 17
  /*Coverage entropy=0.5623351446188083
  */
  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      ImprovedFile improvedFile0 = new ImprovedFile("V1s2b", ".zip");
      ArchiveScanner archiveScanner0 = new ArchiveScanner(improvedFile0);
      boolean boolean0 = archiveScanner0.isArchive(improvedFile0);
      //  // Unstable assertion: assertFalse(boolean0);
  }

  /**
  //Test case number: 18
  /*Coverage entropy=0.8675632284814612
  */
  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      ImprovedFile improvedFile0 = new ImprovedFile("Error trying to create,temp directory in ", "Error trying to create,temp directory in ");
      ArchiveScanner archiveScanner0 = new ArchiveScanner(improvedFile0);
      String[] stringArray0 = new String[4];
      stringArray0[0] = "4UWd";
      stringArray0[1] = "gd4e";
      stringArray0[2] = "Error trying to create,temp directory in ";
      Vector<String> vector0 = new Vector<String>();
      archiveScanner0.dirsNotIncluded = vector0;
      stringArray0[3] = "gd4e";
      archiveScanner0.setIncludes(stringArray0);
      try { 
        archiveScanner0.processDirectory(improvedFile0, "", true);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // IO error scanning directory /home/ubuntu/replication/scripts/projects/78_caloriecount/Error trying to create,temp directory in /Error trying to create,temp directory in 
         //
         verifyException("com.lts.io.ArchiveScanner", e);
      }
  }

  /**
  //Test case number: 19
  /*Coverage entropy=0.8675632284814612
  */
  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      ImprovedFile improvedFile0 = new ImprovedFile((String) null, "edl'Q|g,}NUU");
      String[] stringArray0 = new String[1];
      stringArray0[0] = "/Delete";
      ArchiveScanner archiveScanner0 = new ArchiveScanner(improvedFile0);
      Vector<InputStream> vector0 = new Vector<InputStream>();
      archiveScanner0.dirsIncluded = vector0;
      archiveScanner0.setIncludes(stringArray0);
      archiveScanner0.addDefaultExcludes();
      try { 
        archiveScanner0.processDirectory(improvedFile0, "/Delete", true);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // IO error scanning directory /home/ubuntu/replication/scripts/projects/78_caloriecount/edl'Q|g,}NUU
         //
         verifyException("com.lts.io.ArchiveScanner", e);
      }
  }

  /**
  //Test case number: 20
  /*Coverage entropy=0.7963116401738131
  */
  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      ImprovedFile improvedFile0 = new ImprovedFile((String) null, "edl'Q|g,}NUU");
      String[] stringArray0 = new String[1];
      stringArray0[0] = "/Delete";
      ArchiveScanner archiveScanner0 = new ArchiveScanner(improvedFile0);
      Vector<InputStream> vector0 = new Vector<InputStream>();
      archiveScanner0.dirsIncluded = vector0;
      archiveScanner0.setIncludes(stringArray0);
      archiveScanner0.addDefaultExcludes();
      try { 
        archiveScanner0.processDirectory(improvedFile0, "/Delete", false);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // IO error scanning directory /home/ubuntu/replication/scripts/projects/78_caloriecount/edl'Q|g,}NUU
         //
         verifyException("com.lts.io.ArchiveScanner", e);
      }
  }

  /**
  //Test case number: 21
  /*Coverage entropy=0.5623351446188083
  */
  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      ImprovedFile improvedFile0 = new ImprovedFile("V1sb", "qd@?V+b");
      ArchiveScanner archiveScanner0 = new ArchiveScanner(improvedFile0);
      String[] stringArray0 = new String[4];
      stringArray0[0] = "V1sb";
      stringArray0[1] = "qd@?V+b";
      stringArray0[2] = "V1sb";
      stringArray0[3] = "gd4e";
      archiveScanner0.setIncludes(stringArray0);
      archiveScanner0.addDefaultExcludes();
      // Undeclared exception!
      try { 
        archiveScanner0.processDirectory(improvedFile0, "qd@?V+b", false);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.lts.io.ArchiveScanner", e);
      }
  }
}
