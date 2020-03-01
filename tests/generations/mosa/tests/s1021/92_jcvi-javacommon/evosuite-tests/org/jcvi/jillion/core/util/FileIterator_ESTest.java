/*
 * This file was automatically generated by EvoSuite
 * Thu Nov 14 21:51:24 GMT 2019
 */

package org.jcvi.jillion.core.util;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.File;
import java.io.FileFilter;
import java.net.URI;
import java.util.Iterator;
import java.util.NoSuchElementException;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.io.MockFile;
import org.evosuite.runtime.mock.java.net.MockURI;
import org.evosuite.runtime.testdata.EvoSuiteFile;
import org.evosuite.runtime.testdata.FileSystemHandling;
import org.jcvi.jillion.core.util.FileIterator;
import org.jcvi.jillion.core.util.MultipleFileFilter;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class FileIterator_ESTest extends FileIterator_ESTest_scaffolding {

  /**
  //Test case number: 0
  /*Coverage entropy=3.215587027213777
  */
  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      MockFile mockFile0 = new MockFile("&Svxt:S2'^", "&Svxt:S2'^");
      FileIterator.FileIteratorBuilder fileIterator_FileIteratorBuilder0 = FileIterator.createNonRecursiveFileIteratorBuilder(mockFile0);
      File file0 = MockFile.createTempFile("&Svxt:S2'^", "&Svxt:S2'^", (File) mockFile0);
      file0.setWritable(false, false);
      FileIterator fileIterator0 = fileIterator_FileIteratorBuilder0.build();
      FileIterator.createBreadthFirstFileIteratorBuilder(file0);
      File file1 = fileIterator0.next();
      assertNotSame(mockFile0, file1);
  }

  /**
  //Test case number: 1
  /*Coverage entropy=3.3915603798315823
  */
  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      MockFile mockFile0 = new MockFile("&Svxt:S2'^", "&Svxt:S2'^");
      FileIterator.FileIteratorBuilder fileIterator_FileIteratorBuilder0 = FileIterator.createNonRecursiveFileIteratorBuilder(mockFile0);
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("&Svxt:S2'^/&Svxt:S2'^/&Svxt:S2'^0&Svxt:S2'^");
      FileSystemHandling.appendStringToFile(evoSuiteFile0, "org.jci.jillion.cor.util.FIFOQueue");
      FileIterator fileIterator0 = fileIterator_FileIteratorBuilder0.build();
      fileIterator0.spliterator();
      mockFile0.setWritable(true);
      FileSystemHandling.setPermissions(evoSuiteFile0, true, true, false);
      fileIterator0.next();
      FileIterator.createDepthFirstFileIteratorBuilder(mockFile0);
      // Undeclared exception!
      try { 
        fileIterator0.remove();
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // can not remove
         //
         verifyException("org.jcvi.jillion.core.util.FileIterator", e);
      }
  }

  /**
  //Test case number: 2
  /*Coverage entropy=3.6493386540034782
  */
  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      FileSystemHandling.setPermissions((EvoSuiteFile) null, true, true, true);
      MockFile mockFile0 = new MockFile("");
      File file0 = MockFile.createTempFile(",s*qBxL:KR>!T4V_1:%", "", (File) mockFile0);
      FileIterator.createBreadthFirstFileIteratorBuilder(file0);
      FileIterator.FileIteratorBuilder fileIterator_FileIteratorBuilder0 = FileIterator.createDepthFirstFileIteratorBuilder(mockFile0);
      FileIterator fileIterator0 = fileIterator_FileIteratorBuilder0.build();
      fileIterator0.setUpInitialState(file0);
      fileIterator0.getNextFile();
      FileIterator.createNonRecursiveFileIteratorBuilder(file0);
      FileFilter[] fileFilterArray0 = new FileFilter[0];
      FileIterator.createDepthFirstFileIteratorBuilder(file0);
      fileIterator0.getNextFile();
      // Undeclared exception!
      try { 
        fileIterator0.next();
        fail("Expecting exception: NoSuchElementException");
      
      } catch(NoSuchElementException e) {
         //
         // no more files
         //
         verifyException("org.jcvi.jillion.core.util.FileIterator", e);
      }
  }

  /**
  //Test case number: 3
  /*Coverage entropy=3.219002851929821
  */
  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      MockFile mockFile0 = new MockFile("");
      FileIterator.FileIteratorBuilder fileIterator_FileIteratorBuilder0 = FileIterator.createDepthFirstFileIteratorBuilder(mockFile0);
      FileIterator fileIterator0 = fileIterator_FileIteratorBuilder0.build();
      fileIterator0.getNextFile();
      File file0 = MockFile.createTempFile("#Y:&M?F(_Tb(p<\"", "", (File) null);
      fileIterator0.updateFileIterator(file0);
      // Undeclared exception!
      try { 
        MockFile.createTempFile("", "#Y:&M?F(_Tb(p<\"", file0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Prefix string too short
         //
         verifyException("org.evosuite.runtime.vfs.VirtualFileSystem", e);
      }
  }

  /**
  //Test case number: 4
  /*Coverage entropy=3.3371639168630702
  */
  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      MockFile mockFile0 = new MockFile("&Svxt:S2'^", "&Svxt:S2'^");
      FileIterator.FileIteratorBuilder fileIterator_FileIteratorBuilder0 = FileIterator.createNonRecursiveFileIteratorBuilder(mockFile0);
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("&Svxt:S2'^/&Svxt:S2'^/&Svxt:S2'^0&Svxt:S2'^");
      FileSystemHandling.appendStringToFile(evoSuiteFile0, "org.jcvi.jillion.core.util.FIFOQueue");
      MockFile mockFile1 = new MockFile("&Svxt:S2'^", "&Svxt:S2'^");
      FileIterator fileIterator0 = fileIterator_FileIteratorBuilder0.build();
      fileIterator0.spliterator();
      fileIterator0.next();
      FileIterator.FileIteratorBuilder fileIterator_FileIteratorBuilder1 = FileIterator.createDepthFirstFileIteratorBuilder(mockFile1);
      assertFalse(fileIterator_FileIteratorBuilder1.equals((Object)fileIterator_FileIteratorBuilder0));
  }

  /**
  //Test case number: 5
  /*Coverage entropy=3.205193058245067
  */
  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      MockFile mockFile0 = new MockFile("", "");
      FileIterator.FileIteratorBuilder fileIterator_FileIteratorBuilder0 = FileIterator.createBreadthFirstFileIteratorBuilder(mockFile0);
      FileIterator fileIterator0 = fileIterator_FileIteratorBuilder0.build();
      MockFile mockFile1 = new MockFile("", " PK9SxNs4/l,[?YKp%");
      fileIterator0.setUpInitialState(mockFile1);
      FileIterator.createBreadthFirstFileIteratorBuilder(mockFile0);
      FileIterator.FileIteratorBuilder fileIterator_FileIteratorBuilder1 = FileIterator.createNonRecursiveFileIteratorBuilder(mockFile0);
      assertFalse(fileIterator_FileIteratorBuilder1.equals((Object)fileIterator_FileIteratorBuilder0));
  }

  /**
  //Test case number: 6
  /*Coverage entropy=3.5181460056734886
  */
  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      MockFile mockFile0 = new MockFile("", "");
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("/tmp");
      FileSystemHandling.setPermissions(evoSuiteFile0, false, false, false);
      mockFile0.setExecutable(true, true);
      FileIterator.FileIteratorBuilder fileIterator_FileIteratorBuilder0 = FileIterator.createDepthFirstFileIteratorBuilder(mockFile0);
      FileIterator.FileIteratorBuilder fileIterator_FileIteratorBuilder1 = fileIterator_FileIteratorBuilder0.includeHiddenFiles(false);
      FileIterator.FileIteratorBuilder fileIterator_FileIteratorBuilder2 = fileIterator_FileIteratorBuilder1.includeDirectories(true);
      FileIterator fileIterator0 = fileIterator_FileIteratorBuilder2.build();
      fileIterator_FileIteratorBuilder0.includeHiddenFiles(true);
      EvoSuiteFile evoSuiteFile1 = new EvoSuiteFile("/tmp");
      FileSystemHandling.appendStringToFile(evoSuiteFile1, "");
      FileIterator fileIterator1 = fileIterator_FileIteratorBuilder0.build();
      File file0 = fileIterator1.getNextFile();
      file0.setExecutable(false);
      File file1 = fileIterator0.next();
      assertNotSame(mockFile0, file1);
  }

  /**
  //Test case number: 7
  /*Coverage entropy=3.197846119469557
  */
  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      MockFile mockFile0 = new MockFile("", "");
      FileIterator.FileIteratorBuilder fileIterator_FileIteratorBuilder0 = FileIterator.createBreadthFirstFileIteratorBuilder(mockFile0);
      fileIterator_FileIteratorBuilder0.includeHiddenFiles(true);
      fileIterator_FileIteratorBuilder0.includeDirectories(true);
      FileIterator fileIterator0 = fileIterator_FileIteratorBuilder0.build();
      assertTrue(fileIterator0.hasNext());
  }

  /**
  //Test case number: 8
  /*Coverage entropy=2.792904926173455
  */
  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      MockFile mockFile0 = new MockFile("org.jcvi.jillion.core.util.FIFOQueue");
      FileIterator.FileIteratorBuilder fileIterator_FileIteratorBuilder0 = FileIterator.createNonRecursiveFileIteratorBuilder(mockFile0);
      MockFile.createTempFile(".25x{purtW3pp1e-", "", (File) mockFile0);
      FileIterator fileIterator0 = fileIterator_FileIteratorBuilder0.build();
      assertFalse(fileIterator0.hasNext());
  }

  /**
  //Test case number: 9
  /*Coverage entropy=3.525673934348913
  */
  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      MockFile mockFile0 = new MockFile("", "");
      FileIterator.FileIteratorBuilder fileIterator_FileIteratorBuilder0 = FileIterator.createBreadthFirstFileIteratorBuilder(mockFile0);
      fileIterator_FileIteratorBuilder0.includeDirectories(true);
      FileIterator fileIterator0 = fileIterator_FileIteratorBuilder0.build();
      File file0 = fileIterator0.next();
      assertEquals("/home", file0.toString());
  }

  /**
  //Test case number: 10
  /*Coverage entropy=3.476373226387975
  */
  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      MockFile mockFile0 = new MockFile("", "");
      MockFile.createTempFile("hQVfYCU5eFunCh", "hQVfYCU5eFunCh");
      FileIterator.FileIteratorBuilder fileIterator_FileIteratorBuilder0 = FileIterator.createBreadthFirstFileIteratorBuilder(mockFile0);
      FileIterator fileIterator0 = fileIterator_FileIteratorBuilder0.build();
      File file0 = fileIterator0.getNextFile();
      assertNotNull(file0);
      assertEquals("hQVfYCU5eFunCh0hQVfYCU5eFunCh", file0.getName());
  }

  /**
  //Test case number: 11
  /*Coverage entropy=3.3935968366122915
  */
  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      MockFile mockFile0 = new MockFile("", "");
      FileIterator.FileIteratorBuilder fileIterator_FileIteratorBuilder0 = FileIterator.createBreadthFirstFileIteratorBuilder(mockFile0);
      fileIterator_FileIteratorBuilder0.includeDirectories(true);
      FileIterator fileIterator0 = fileIterator_FileIteratorBuilder0.build();
      File file0 = fileIterator0.getNextFile();
      assertNotNull(file0);
      assertTrue(fileIterator0.hasNext());
  }

  /**
  //Test case number: 12
  /*Coverage entropy=2.684404064515707
  */
  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      MockFile mockFile0 = new MockFile("&Svxt:S2'^", "&Svxt:S2'^");
      FileIterator.FileIteratorBuilder fileIterator_FileIteratorBuilder0 = FileIterator.createNonRecursiveFileIteratorBuilder(mockFile0);
      File file0 = MockFile.createTempFile("&Svxt:S2'^", "&Svxt:S2'^", (File) mockFile0);
      FileIterator fileIterator0 = fileIterator_FileIteratorBuilder0.build();
      fileIterator0.next();
      FileIterator.FileIteratorBuilder fileIterator_FileIteratorBuilder1 = FileIterator.createDepthFirstFileIteratorBuilder(file0);
      assertFalse(fileIterator_FileIteratorBuilder1.equals((Object)fileIterator_FileIteratorBuilder0));
  }

  /**
  //Test case number: 13
  /*Coverage entropy=3.0873999066334123
  */
  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      MockFile mockFile0 = new MockFile("&Svxt:S2'^", "&Svxt:S2'^");
      FileIterator.FileIteratorBuilder fileIterator_FileIteratorBuilder0 = FileIterator.createNonRecursiveFileIteratorBuilder(mockFile0);
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("&Svxt:S2'^/&Svxt:S2'^/&Svxt:S2'^0&Svxt:S2'^");
      FileSystemHandling.appendStringToFile(evoSuiteFile0, "&Svxt:S2'^");
      MockFile mockFile1 = new MockFile("&Svxt:S2'^", "&Svxt:S2'^");
      FileIterator fileIterator0 = fileIterator_FileIteratorBuilder0.build();
      fileIterator0.spliterator();
      mockFile1.setWritable(true);
      FileSystemHandling.setPermissions(evoSuiteFile0, true, true, true);
      fileIterator0.getNextFile();
      // Undeclared exception!
      try { 
        fileIterator0.updateFileIterator((File) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jcvi.jillion.core.util.FileIterator", e);
      }
  }

  /**
  //Test case number: 14
  /*Coverage entropy=2.2623477045221723
  */
  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      FileIterator.FileIteratorBuilder fileIterator_FileIteratorBuilder0 = FileIterator.createNonRecursiveFileIteratorBuilder((File) null);
      FileIterator.FileIteratorBuilder fileIterator_FileIteratorBuilder1 = fileIterator_FileIteratorBuilder0.includeDirectories(true);
      FileIterator.FileIteratorBuilder fileIterator_FileIteratorBuilder2 = fileIterator_FileIteratorBuilder1.includeHiddenFiles(true);
      // Undeclared exception!
      try { 
        fileIterator_FileIteratorBuilder2.build();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // rootDir can not be null
         //
         verifyException("org.jcvi.jillion.core.util.FileIterator", e);
      }
  }

  /**
  //Test case number: 15
  /*Coverage entropy=3.1356559690710406
  */
  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      MockFile mockFile0 = new MockFile("", "");
      FileIterator.FileIteratorBuilder fileIterator_FileIteratorBuilder0 = FileIterator.createBreadthFirstFileIteratorBuilder(mockFile0);
      FileIterator fileIterator0 = fileIterator_FileIteratorBuilder0.build();
      // Undeclared exception!
      try { 
        fileIterator0.remove();
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // can not remove
         //
         verifyException("org.jcvi.jillion.core.util.FileIterator", e);
      }
  }

  /**
  //Test case number: 16
  /*Coverage entropy=2.684404064515707
  */
  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      MockFile mockFile0 = new MockFile("");
      FileIterator.FileIteratorBuilder fileIterator_FileIteratorBuilder0 = FileIterator.createNonRecursiveFileIteratorBuilder(mockFile0);
      FileIterator fileIterator0 = fileIterator_FileIteratorBuilder0.build();
      Iterator<File> iterator0 = fileIterator0.iterator();
      assertNotNull(iterator0);
  }

  /**
  //Test case number: 17
  /*Coverage entropy=2.4368192399644037
  */
  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      MockFile mockFile0 = new MockFile("&Svxt:S2'^", "&Svxt:S2'^");
      FileIterator.FileIteratorBuilder fileIterator_FileIteratorBuilder0 = FileIterator.createNonRecursiveFileIteratorBuilder(mockFile0);
      File file0 = MockFile.createTempFile("&Svxt:S2'^", "&Svxt:S2'^", (File) mockFile0);
      fileIterator_FileIteratorBuilder0.build();
      FileIterator fileIterator0 = fileIterator_FileIteratorBuilder0.build();
      fileIterator0.setUpInitialState(file0);
      assertEquals("&Svxt:S2'^0&Svxt:S2'^", file0.getName());
  }

  /**
  //Test case number: 18
  /*Coverage entropy=3.2062834166499132
  */
  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      MockFile mockFile0 = new MockFile("", "");
      FileIterator.FileIteratorBuilder fileIterator_FileIteratorBuilder0 = FileIterator.createDepthFirstFileIteratorBuilder(mockFile0);
      FileIterator fileIterator0 = fileIterator_FileIteratorBuilder0.build();
      assertFalse(fileIterator0.hasNext());
      
      fileIterator0.iterator();
      assertFalse(fileIterator0.hasNext());
  }

  /**
  //Test case number: 19
  /*Coverage entropy=2.0761045791007673
  */
  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      FileIterator.FileIteratorBuilder fileIterator_FileIteratorBuilder0 = FileIterator.createDepthFirstFileIteratorBuilder((File) null);
      FileFilter[] fileFilterArray0 = new FileFilter[0];
      MultipleFileFilter multipleFileFilter0 = new MultipleFileFilter(fileFilterArray0);
      FileIterator.FileIteratorBuilder fileIterator_FileIteratorBuilder1 = fileIterator_FileIteratorBuilder0.fileFilter(multipleFileFilter0);
      // Undeclared exception!
      try { 
        fileIterator_FileIteratorBuilder1.build();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // rootDir can not be null
         //
         verifyException("org.jcvi.jillion.core.util.FileIterator", e);
      }
  }

  /**
  //Test case number: 20
  /*Coverage entropy=3.216157248141041
  */
  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      MockFile mockFile0 = new MockFile((File) null, "");
      FileIterator.FileIteratorBuilder fileIterator_FileIteratorBuilder0 = FileIterator.createBreadthFirstFileIteratorBuilder(mockFile0);
      FileIterator fileIterator0 = fileIterator_FileIteratorBuilder0.build();
      // Undeclared exception!
      try { 
        fileIterator0.setUpInitialState((File) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jcvi.jillion.core.util.FileIterator$RecursiveFileIterator", e);
      }
  }

  /**
  //Test case number: 21
  /*Coverage entropy=2.973176228217073
  */
  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      MockFile mockFile0 = new MockFile("", "");
      FileIterator.FileIteratorBuilder fileIterator_FileIteratorBuilder0 = FileIterator.createNonRecursiveFileIteratorBuilder(mockFile0);
      FileIterator.FileIteratorBuilder fileIterator_FileIteratorBuilder1 = fileIterator_FileIteratorBuilder0.includeDirectories(true);
      FileIterator fileIterator0 = fileIterator_FileIteratorBuilder1.build();
      boolean boolean0 = fileIterator0.hasNext();
      assertTrue(boolean0);
  }

  /**
  //Test case number: 22
  /*Coverage entropy=1.847832822658352
  */
  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      FileIterator.FileIteratorBuilder fileIterator_FileIteratorBuilder0 = FileIterator.createNonRecursiveFileIteratorBuilder((File) null);
      // Undeclared exception!
      try { 
        fileIterator_FileIteratorBuilder0.build();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // rootDir can not be null
         //
         verifyException("org.jcvi.jillion.core.util.FileIterator", e);
      }
  }

  /**
  //Test case number: 23
  /*Coverage entropy=1.847832822658352
  */
  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      MockFile mockFile0 = new MockFile("&Svxty:2'^", "&Svxty:2'^");
      FileIterator.FileIteratorBuilder fileIterator_FileIteratorBuilder0 = FileIterator.createNonRecursiveFileIteratorBuilder(mockFile0);
      // Undeclared exception!
      try { 
        fileIterator_FileIteratorBuilder0.build();
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // rootDir must be a directory
         //
         verifyException("org.jcvi.jillion.core.util.FileIterator", e);
      }
  }

  /**
  //Test case number: 24
  /*Coverage entropy=1.847832822658352
  */
  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      FileIterator.FileIteratorBuilder fileIterator_FileIteratorBuilder0 = FileIterator.createDepthFirstFileIteratorBuilder((File) null);
      // Undeclared exception!
      try { 
        fileIterator_FileIteratorBuilder0.build();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // rootDir can not be null
         //
         verifyException("org.jcvi.jillion.core.util.FileIterator", e);
      }
  }

  /**
  //Test case number: 25
  /*Coverage entropy=3.432757197408911
  */
  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      MockFile mockFile0 = new MockFile("", "");
      FileIterator.FileIteratorBuilder fileIterator_FileIteratorBuilder0 = FileIterator.createBreadthFirstFileIteratorBuilder(mockFile0);
      FileIterator fileIterator0 = fileIterator_FileIteratorBuilder0.build();
      boolean boolean0 = fileIterator0.hasNext();
      assertFalse(boolean0);
  }

  /**
  //Test case number: 26
  /*Coverage entropy=3.3834631886342574
  */
  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      MockFile mockFile0 = new MockFile("", "");
      FileIterator.FileIteratorBuilder fileIterator_FileIteratorBuilder0 = FileIterator.createBreadthFirstFileIteratorBuilder(mockFile0);
      FileIterator fileIterator0 = fileIterator_FileIteratorBuilder0.build();
      File file0 = fileIterator0.getNextFile();
      assertNull(file0);
      assertFalse(fileIterator0.hasNext());
  }

  /**
  //Test case number: 27
  /*Coverage entropy=3.1356559690710406
  */
  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      MockFile mockFile0 = new MockFile("", "");
      FileIterator.FileIteratorBuilder fileIterator_FileIteratorBuilder0 = FileIterator.createBreadthFirstFileIteratorBuilder(mockFile0);
      fileIterator_FileIteratorBuilder0.includeHiddenFiles(true);
      FileIterator fileIterator0 = fileIterator_FileIteratorBuilder0.build();
      assertFalse(fileIterator0.hasNext());
  }

  /**
  //Test case number: 28
  /*Coverage entropy=3.061593652763551
  */
  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      MockFile mockFile0 = new MockFile("", "");
      FileIterator.FileIteratorBuilder fileIterator_FileIteratorBuilder0 = FileIterator.createBreadthFirstFileIteratorBuilder(mockFile0);
      FileIterator fileIterator0 = fileIterator_FileIteratorBuilder0.build();
      // Undeclared exception!
      try { 
        fileIterator0.next();
        fail("Expecting exception: NoSuchElementException");
      
      } catch(NoSuchElementException e) {
         //
         // no more files
         //
         verifyException("org.jcvi.jillion.core.util.FileIterator", e);
      }
  }

  /**
  //Test case number: 29
  /*Coverage entropy=3.2062834166499132
  */
  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      MockFile mockFile0 = new MockFile("", "");
      FileIterator.FileIteratorBuilder fileIterator_FileIteratorBuilder0 = FileIterator.createBreadthFirstFileIteratorBuilder(mockFile0);
      FileIterator fileIterator0 = fileIterator_FileIteratorBuilder0.build();
      fileIterator0.iterator();
      assertFalse(fileIterator0.hasNext());
  }

  /**
  //Test case number: 30
  /*Coverage entropy=1.847832822658352
  */
  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      FileIterator.FileIteratorBuilder fileIterator_FileIteratorBuilder0 = FileIterator.createBreadthFirstFileIteratorBuilder((File) null);
      // Undeclared exception!
      try { 
        fileIterator_FileIteratorBuilder0.build();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // rootDir can not be null
         //
         verifyException("org.jcvi.jillion.core.util.FileIterator", e);
      }
  }

  /**
  //Test case number: 31
  /*Coverage entropy=3.4420466346688325
  */
  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      MockFile mockFile0 = new MockFile("");
      FileIterator.FileIteratorBuilder fileIterator_FileIteratorBuilder0 = FileIterator.createBreadthFirstFileIteratorBuilder(mockFile0);
      mockFile0.setExecutable(true);
      FileIterator.FileIteratorBuilder fileIterator_FileIteratorBuilder1 = fileIterator_FileIteratorBuilder0.includeHiddenFiles(false);
      File file0 = MockFile.createTempFile("m1y&!8S/k?@b&5.", "m1y&!8S/k?@b&5.");
      FileIterator fileIterator0 = fileIterator_FileIteratorBuilder1.build();
      FileIterator.FileIteratorBuilder fileIterator_FileIteratorBuilder2 = fileIterator_FileIteratorBuilder0.fileFilter((FileFilter) null);
      mockFile0.mkdir();
      fileIterator0.iterator();
      File file1 = mockFile0.getAbsoluteFile();
      FileIterator.createDepthFirstFileIteratorBuilder(mockFile0);
      FileIterator.FileIteratorBuilder fileIterator_FileIteratorBuilder3 = fileIterator_FileIteratorBuilder0.includeHiddenFiles(false);
      fileIterator0.updateFileIterator(mockFile0);
      fileIterator_FileIteratorBuilder3.includeHiddenFiles(false);
      FileIterator.FileIteratorBuilder fileIterator_FileIteratorBuilder4 = fileIterator_FileIteratorBuilder3.includeHiddenFiles(true);
      fileIterator_FileIteratorBuilder1.includeDirectories(false);
      fileIterator_FileIteratorBuilder2.build();
      fileIterator_FileIteratorBuilder2.includeDirectories(false);
      FileIterator fileIterator1 = fileIterator_FileIteratorBuilder4.build();
      fileIterator1.getNextFile();
      FileIterator.FileIteratorBuilder fileIterator_FileIteratorBuilder5 = fileIterator_FileIteratorBuilder2.includeHiddenFiles(true);
      FileIterator.createNonRecursiveFileIteratorBuilder(mockFile0);
      fileIterator_FileIteratorBuilder5.build();
      FileIterator.createNonRecursiveFileIteratorBuilder(file0);
      fileIterator_FileIteratorBuilder5.includeHiddenFiles(false);
      FileIterator.createNonRecursiveFileIteratorBuilder(file1);
      FileIterator.createNonRecursiveFileIteratorBuilder(file0);
      fileIterator0.hasNext();
      URI uRI0 = MockURI.create("m1y&!8S/k?@b&5.");
      MockFile mockFile1 = null;
      try {
        mockFile1 = new MockFile(uRI0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // URI is not absolute
         //
         verifyException("java.io.File", e);
      }
  }
}
