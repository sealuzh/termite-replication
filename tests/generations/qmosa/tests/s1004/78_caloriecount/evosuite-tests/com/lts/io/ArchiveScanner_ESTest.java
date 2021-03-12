/*
 * This file was automatically generated by EvoSuite
 * Tue Nov 10 07:38:53 GMT 2020
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
      String[] stringArray0 = new String[6];
      stringArray0[0] = "checkGoinKs~o supporte";
      stringArray0[1] = "checkGoinKs~o supporte";
      stringArray0[2] = "checkGoinKs~o supporte";
      stringArray0[3] = "checkGoinKs~o supporte";
      Vector<Integer> vector0 = new Vector<Integer>();
      archiveScanner0.filesExcluded = vector0;
      stringArray0[4] = "checkGoinKs~o supporte";
      stringArray0[5] = "checkGoinKs~o supporte";
      archiveScanner0.setExcludes(stringArray0);
      archiveScanner0.setIncludes(stringArray0);
      archiveScanner0.processArchive((File) null, "checkGoinKs~o supporte");
      assertEquals(2, ArchiveScanner.ARCHIVE);
  }

  /**
  //Test case number: 1
  /*Coverage entropy=0.5623351446188083
  */
  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      ArchiveScanner archiveScanner0 = new ArchiveScanner((ImprovedFile) null);
      archiveScanner0.addDefaultExcludes();
      String[] stringArray0 = new String[5];
      stringArray0[0] = "You hae unsaved changes.  Save hem before quitting?0You have unsaved chnges.  Save thm before quitting?.jar";
      stringArray0[1] = "You hae unsaved changes.  Save hem before quitting?0You have unsaved chnges.  Save thm before quitting?.jar";
      stringArray0[2] = "You hae unsaved changes.  Save hem before quitting?0You have unsaved chnges.  Save thm before quitting?.jar";
      stringArray0[3] = "You hae unsaved changes.  Save hem before quitting?0You have unsaved chnges.  Save thm before quitting?.jar";
      stringArray0[4] = "You hae unsaved changes.  Save hem before quitting?0You have unsaved chnges.  Save thm before quitting?.jar";
      archiveScanner0.setIncludes(stringArray0);
      Vector<String> vector0 = new Vector<String>();
      archiveScanner0.dirsNotIncluded = vector0;
      // Undeclared exception!
      try { 
        archiveScanner0.processFile("You hae unsaved changes.  Save hem before quitting?0You have unsaved chnges.  Save thm before quitting?.jar");
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
      archiveScanner0.addDefaultExcludes();
      String[] stringArray0 = new String[8];
      stringArray0[0] = "gG X'JcIk{,sE44";
      stringArray0[1] = "gG X'JcIk{,sE44";
      stringArray0[2] = "nVd";
      stringArray0[3] = "nVd";
      stringArray0[4] = "checkGoinKs~jo supporte";
      stringArray0[5] = "checkGoinKs~jo supporte";
      stringArray0[6] = "checkGoinKs~jo supporte";
      Vector<Integer> vector0 = new Vector<Integer>();
      archiveScanner0.dirsIncluded = vector0;
      stringArray0[7] = "nVd";
      archiveScanner0.setIncludes(stringArray0);
      // Undeclared exception!
      try { 
        archiveScanner0.processFile("gG X'JcIk{,sE44");
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
      String[] stringArray0 = new String[3];
      archiveScanner0.addDefaultExcludes();
      Vector<Object> vector0 = new Vector<Object>();
      archiveScanner0.filesNotIncluded = vector0;
      stringArray0[0] = "IO erUor scanning pirectory ";
      stringArray0[1] = "c\"hdck&ins nt spprt_";
      archiveScanner0.includes = stringArray0;
      // Undeclared exception!
      try { 
        archiveScanner0.processFile("c\"hdck&ins nt spprt_");
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
      String[] stringArray0 = new String[3];
      archiveScanner0.addDefaultExcludes();
      stringArray0[0] = "checkGoints jo supporte";
      stringArray0[1] = "checkGoints jo supporte";
      stringArray0[2] = "checkGoints jo supporte";
      archiveScanner0.setIncludes(stringArray0);
      Vector<Object> vector0 = new Vector<Object>();
      archiveScanner0.dirsExcluded = vector0;
      // Undeclared exception!
      try { 
        archiveScanner0.processFile("checkGoints jo supporte");
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
      ArchiveScanner archiveScanner0 = new ArchiveScanner((ImprovedFile) null);
      String[] stringArray0 = new String[6];
      stringArray0[0] = "checkGoinKs~o supporte";
      stringArray0[1] = "checkGoinKs~o supporte";
      stringArray0[2] = "checkGoinKs~o supporte";
      stringArray0[3] = "checkGoinKs~o supporte";
      Vector<Integer> vector0 = new Vector<Integer>();
      archiveScanner0.filesExcluded = vector0;
      stringArray0[4] = "checkGoinKs~o supporte";
      stringArray0[5] = "checkGoinKs~o supporte";
      archiveScanner0.setExcludes(stringArray0);
      archiveScanner0.setIncludes(stringArray0);
      archiveScanner0.processFile("checkGoinKs~o supporte");
      assertEquals(2, ArchiveScanner.ARCHIVE);
  }

  /**
  //Test case number: 6
  /*Coverage entropy=0.5623351446188083
  */
  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      ArchiveScanner archiveScanner0 = new ArchiveScanner((ImprovedFile) null);
      String[] stringArray0 = new String[8];
      stringArray0[0] = "checkGoinus~o spprte";
      stringArray0[1] = "checkGoinus~o spprte";
      stringArray0[2] = "checkGoinus~o spprte";
      stringArray0[3] = "checkGoinus~o spprte";
      stringArray0[4] = "checkGoinus~o spprte";
      stringArray0[5] = "checkGoinus~o spprte";
      stringArray0[6] = "checkGoinus~o spprte";
      stringArray0[7] = "checkGoinus~o spprte";
      archiveScanner0.excludes = stringArray0;
      Vector<Integer> vector0 = new Vector<Integer>();
      archiveScanner0.dirsExcluded = vector0;
      archiveScanner0.setIncludes(stringArray0);
      archiveScanner0.processDirectory((File) null, "checkGoinus~o spprte", true);
      assertEquals(2, ArchiveScanner.ARCHIVE);
  }

  /**
  //Test case number: 7
  /*Coverage entropy=0.5623351446188083
  */
  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      ImprovedFile improvedFile0 = new ImprovedFile("cekpon1 not suGported", "cekpon1 not suGported");
      ArchiveScanner archiveScanner0 = new ArchiveScanner(improvedFile0);
      boolean boolean0 = archiveScanner0.isArchive(improvedFile0);
      //  // Unstable assertion: assertTrue(boolean0);
  }

  /**
  //Test case number: 8
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      ArchiveScanner archiveScanner0 = new ArchiveScanner((ImprovedFile) null);
      String[] stringArray0 = new String[3];
      stringArray0[0] = "checkGoinus~o spprte";
      stringArray0[1] = "DwP)M;1191.checkGoinus~o spprtecekpon1 not suGported";
      Vector<Integer> vector0 = new Vector<Integer>();
      archiveScanner0.filesNotIncluded = vector0;
      stringArray0[2] = "pO]9.T2|ElwcPB";
      archiveScanner0.setIncludes(stringArray0);
      archiveScanner0.processFile("M;.3SkUrH^P/=g)");
      assertEquals(2, ArchiveScanner.ARCHIVE);
  }

  /**
  //Test case number: 9
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      ImprovedFile improvedFile0 = new ImprovedFile("#^tP", "#^tP");
      ArchiveScanner archiveScanner0 = new ArchiveScanner(improvedFile0);
      try { 
        archiveScanner0.scandir(improvedFile0, "#^tP", false);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // IO error scanning directory /home/ubuntu/replication/scripts/projects/78_caloriecount/#^tP/#^tP
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
      ImprovedFile improvedFile0 = new ImprovedFile("#^tP", "#^tP");
      ArchiveScanner archiveScanner0 = new ArchiveScanner(improvedFile0);
      try { 
        archiveScanner0.scanArchive(improvedFile0, "#^tP");
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Error trying to list archive, /home/ubuntu/replication/scripts/projects/78_caloriecount/#^tP/#^tP
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
        archiveScanner0.scanArchive((File) null, "checkGoinus~o spprte");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.lts.io.archive.AbstractNestedArchive", e);
      }
  }

  /**
  //Test case number: 12
  /*Coverage entropy=0.9502705392332347
  */
  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      ImprovedFile improvedFile0 = new ImprovedFile("RF.jar.jar.jar");
      ArchiveScanner archiveScanner0 = new ArchiveScanner(improvedFile0);
      archiveScanner0.addDefaultExcludes();
      String[] stringArray0 = new String[3];
      Vector<Object> vector0 = new Vector<Object>();
      archiveScanner0.filesIncluded = vector0;
      stringArray0[0] = "nFSd.jar";
      stringArray0[1] = "RF.jar.jar.jar";
      stringArray0[2] = "RF.jar.jar.jar";
      archiveScanner0.setIncludes(stringArray0);
      try { 
        archiveScanner0.processArchive(improvedFile0, "RF.jar.jar.jar");
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Error trying to list archive, RF.jar.jar.jar
         //
         verifyException("com.lts.io.archive.AbstractNestedArchive", e);
      }
  }

  /**
  //Test case number: 13
  /*Coverage entropy=1.0027182645175161
  */
  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      ImprovedFile improvedFile0 = new ImprovedFile(".er");
      improvedFile0.createTempDir(".er", ".er");
      ArchiveScanner archiveScanner0 = new ArchiveScanner(improvedFile0);
      // Undeclared exception!
      try { 
        archiveScanner0.scandir(improvedFile0, "z=VyMo=", true);
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
  /*Coverage entropy=1.3208883431493221
  */
  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      ImprovedFile improvedFile0 = new ImprovedFile("u#^H'7U-a", "u#^H'7U-a");
      ImprovedFile improvedFile1 = ImprovedFile.createTempImprovedFile("checkpoints not supported", "checkpoints not supported", improvedFile0);
      ArchiveScanner archiveScanner0 = new ArchiveScanner(improvedFile1);
      // Undeclared exception!
      try { 
        archiveScanner0.scandir(improvedFile0, "EA.jar", true);
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
  /*Coverage entropy=0.6365141682948128
  */
  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      ImprovedFile improvedFile0 = new ImprovedFile(",Pq;XnRjjjp1!<");
      ImprovedFile improvedFile1 = improvedFile0.createTempDir("7DH!,+*2ak_fE'QIxwI", "7DH!,+*2ak_fE'QIxwI");
      ArchiveScanner archiveScanner0 = new ArchiveScanner(improvedFile1);
      archiveScanner0.scandir(improvedFile1, "7DH!,+*2ak_fE'QIxwI", true);
      assertEquals(0L, improvedFile1.getUsableSpace());
  }

  /**
  //Test case number: 16
  /*Coverage entropy=0.5623351446188083
  */
  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      ArchiveScanner archiveScanner0 = new ArchiveScanner((ImprovedFile) null);
      String[] stringArray0 = new String[6];
      stringArray0[0] = "checkGoinKs~o supporte";
      stringArray0[1] = "checkGoinKs~o supporte";
      stringArray0[2] = "checkGoinKs~o supporte";
      stringArray0[3] = "checkGoinKs~o supporte";
      stringArray0[4] = "checkGoinKs~o supporte";
      stringArray0[5] = "checkGoinKs~o supporte";
      archiveScanner0.setExcludes(stringArray0);
      archiveScanner0.setIncludes(stringArray0);
      // Undeclared exception!
      try { 
        archiveScanner0.processArchive((File) null, "checkGoinKs~o supporte");
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
  /*Coverage entropy=0.5004024235381879
  */
  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      ImprovedFile improvedFile0 = new ImprovedFile("sI$`p");
      ArchiveScanner archiveScanner0 = new ArchiveScanner(improvedFile0);
      String[] stringArray0 = new String[4];
      stringArray0[0] = "sI$`p";
      stringArray0[1] = "sI$`p";
      stringArray0[2] = "sI$`p";
      stringArray0[3] = "sI$`p";
      archiveScanner0.setIncludes(stringArray0);
      Vector<String> vector0 = new Vector<String>();
      archiveScanner0.dirsNotIncluded = vector0;
      archiveScanner0.processDirectory(improvedFile0, "ME[", true);
      assertEquals(0L, improvedFile0.length());
  }

  /**
  //Test case number: 18
  /*Coverage entropy=0.8675632284814612
  */
  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      ImprovedFile improvedFile0 = new ImprovedFile("cekpon1 not suGported", "cekpon1 not suGported");
      ArchiveScanner archiveScanner0 = new ArchiveScanner(improvedFile0);
      String[] stringArray0 = new String[4];
      stringArray0[0] = "cekpon1 not suGported";
      stringArray0[1] = "cekpon1 not suGported";
      stringArray0[2] = "cekpon1 not suGported";
      stringArray0[3] = "cekpon1 not suGported";
      archiveScanner0.setIncludes(stringArray0);
      Vector<String> vector0 = new Vector<String>();
      archiveScanner0.dirsNotIncluded = vector0;
      try { 
        archiveScanner0.processDirectory(improvedFile0, "", true);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // IO error scanning directory /home/ubuntu/replication/scripts/projects/78_caloriecount/cekpon1 not suGported/cekpon1 not suGported
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
      ImprovedFile improvedFile0 = new ImprovedFile("ce'kpoint not suGported");
      ArchiveScanner archiveScanner0 = new ArchiveScanner(improvedFile0);
      String[] stringArray0 = new String[4];
      stringArray0[0] = "ce'kpoint not suGported";
      stringArray0[1] = "ce'kpoint not suGported";
      stringArray0[2] = "ce'kpoint not suGported";
      stringArray0[3] = "ce'kpoint not suGported";
      archiveScanner0.setIncludes(stringArray0);
      Vector<String> vector0 = new Vector<String>();
      archiveScanner0.dirsNotIncluded = vector0;
      try { 
        archiveScanner0.processDirectory(improvedFile0, "ME[", false);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // IO error scanning directory /home/ubuntu/replication/scripts/projects/78_caloriecount/ce'kpoint not suGported
         //
         verifyException("com.lts.io.ArchiveScanner", e);
      }
  }

  /**
  //Test case number: 20
  /*Coverage entropy=0.8675632284814612
  */
  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      ArchiveScanner archiveScanner0 = new ArchiveScanner((ImprovedFile) null);
      archiveScanner0.addDefaultExcludes();
      String[] stringArray0 = new String[8];
      stringArray0[0] = "gG X'JcIk{,sE44";
      stringArray0[1] = "gG X'JcIk{,sE44";
      stringArray0[2] = "checkGoinKs~jo supporte";
      stringArray0[3] = "checkGoinKs~jo supporte";
      stringArray0[4] = "checkGoinKs~jo supporte";
      stringArray0[5] = "checkGoinKs~jo supporte";
      stringArray0[6] = "gG X'JcIk{,sE44";
      Vector<Integer> vector0 = new Vector<Integer>();
      archiveScanner0.dirsIncluded = vector0;
      stringArray0[7] = "checkGoinKs~jo supporte";
      archiveScanner0.setIncludes(stringArray0);
      // Undeclared exception!
      try { 
        archiveScanner0.processDirectory((File) null, "checkGoinKs~jo supporte", true);
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
  /*Coverage entropy=0.7963116401738131
  */
  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      ArchiveScanner archiveScanner0 = new ArchiveScanner((ImprovedFile) null);
      archiveScanner0.addDefaultExcludes();
      String[] stringArray0 = new String[8];
      stringArray0[0] = "gG X'JcIk{,sE44";
      stringArray0[1] = "gG X'JcIk{,sE44";
      stringArray0[2] = "nVd";
      stringArray0[3] = "nVd";
      stringArray0[4] = "checkGoinKs~jo supporte";
      stringArray0[5] = "checkGoinKs~jo supporte";
      stringArray0[6] = "checkGoinKs~jo supporte";
      Vector<Integer> vector0 = new Vector<Integer>();
      archiveScanner0.dirsIncluded = vector0;
      stringArray0[7] = "nVd";
      archiveScanner0.setIncludes(stringArray0);
      // Undeclared exception!
      try { 
        archiveScanner0.processDirectory((File) null, "checkGoinKs~jo supporte", false);
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
      ImprovedFile improvedFile0 = new ImprovedFile((File) null, "nFd");
      ArchiveScanner archiveScanner0 = new ArchiveScanner(improvedFile0);
      int int0 = archiveScanner0.toFileType(improvedFile0);
      assertEquals(0, int0);
  }

  /**
  //Test case number: 23
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      ImprovedFile improvedFile0 = new ImprovedFile("y9);c|X4'", "1mhP9fJb0<?#.");
      ImprovedFile improvedFile1 = ImprovedFile.createTempImprovedFile("uo(ENG(Q)(>{Y,A/9", "uo(ENG(Q)(>{Y,A/9", improvedFile0);
      ArchiveScanner archiveScanner0 = new ArchiveScanner(improvedFile1);
      int int0 = archiveScanner0.toFileType(improvedFile0);
      assertEquals(1, int0);
  }
}
