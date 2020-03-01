/*
 * This file was automatically generated by EvoSuite
 * Thu Nov 14 00:00:51 GMT 2019
 */

package org.jcvi.jillion.core.util;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.File;
import java.io.FileFilter;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.NoSuchElementException;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.io.MockFile;
import org.evosuite.runtime.testdata.EvoSuiteFile;
import org.evosuite.runtime.testdata.FileSystemHandling;
import org.jcvi.jillion.core.util.FileIterator;
import org.jcvi.jillion.core.util.MultipleFileFilter;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class FileIterator_ESTest extends FileIterator_ESTest_scaffolding {

  /**
  //Test case number: 0
  /*Coverage entropy=3.303009804668727
  */
  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      MockFile mockFile0 = new MockFile("", "");
      FileSystemHandling.appendStringToFile((EvoSuiteFile) null, "");
      MockFile mockFile1 = new MockFile("", "?");
      MockFile.createTempFile("._a*7[VkTq", "", (File) mockFile1);
      FileIterator.FileIteratorBuilder fileIterator_FileIteratorBuilder0 = FileIterator.createBreadthFirstFileIteratorBuilder(mockFile1);
      FileIterator fileIterator0 = fileIterator_FileIteratorBuilder0.build();
      assertFalse(fileIterator0.hasNext());
  }

  /**
  //Test case number: 1
  /*Coverage entropy=3.6491681588038696
  */
  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      MockFile mockFile0 = new MockFile("", "");
      MockFile.createTempFile("'$ig8>b", "");
      FileIterator.FileIteratorBuilder fileIterator_FileIteratorBuilder0 = FileIterator.createDepthFirstFileIteratorBuilder(mockFile0);
      FileIterator fileIterator0 = fileIterator_FileIteratorBuilder0.build();
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("/tmp/'$\\ig8>b0");
      FileSystemHandling.appendLineToFile(evoSuiteFile0, "'$ig8>b");
      fileIterator0.next();
      FileIterator.FileIteratorBuilder fileIterator_FileIteratorBuilder1 = FileIterator.createNonRecursiveFileIteratorBuilder(mockFile0);
      assertFalse(fileIterator_FileIteratorBuilder1.equals((Object)fileIterator_FileIteratorBuilder0));
  }

  /**
  //Test case number: 2
  /*Coverage entropy=2.8896985514868954
  */
  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      MockFile mockFile0 = new MockFile("org.jcvjill|fcoe.utl.FIFOQueue", "org.jcvjill|fcoe.utl.FIFOQueue");
      File file0 = MockFile.createTempFile("org.jcvjill|fcoe.utl.FIFOQueue", "org.jcvjill|fcoe.utl.FIFOQueue", (File) mockFile0);
      FileIterator.FileIteratorBuilder fileIterator_FileIteratorBuilder0 = FileIterator.createBreadthFirstFileIteratorBuilder(mockFile0);
      FileIterator fileIterator0 = fileIterator_FileIteratorBuilder0.build();
      fileIterator0.setUpInitialState(file0);
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
  /*Coverage entropy=2.8862673658216265
  */
  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      MockFile mockFile0 = new MockFile("org.jcv.jill|nfcoe.utl.FIFOQueue", "org.jcv.jill|nfcoe.utl.FIFOQueue");
      File file0 = MockFile.createTempFile("org.jcv.jill|nfcoe.utl.FIFOQueue", "org.jcv.jill|nfcoe.utl.FIFOQueue", (File) mockFile0);
      FileIterator.FileIteratorBuilder fileIterator_FileIteratorBuilder0 = FileIterator.createBreadthFirstFileIteratorBuilder(mockFile0);
      FileIterator fileIterator0 = fileIterator_FileIteratorBuilder0.build();
      fileIterator0.updateFileIterator(file0);
      assertTrue(file0.exists());
  }

  /**
  //Test case number: 4
  /*Coverage entropy=3.5741319592085916
  */
  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      MockFile mockFile0 = new MockFile("", "");
      mockFile0.mkdirs();
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("/tmp");
      FileSystemHandling.setPermissions(evoSuiteFile0, false, false, false);
      FileIterator.FileIteratorBuilder fileIterator_FileIteratorBuilder0 = FileIterator.createDepthFirstFileIteratorBuilder(mockFile0);
      FileIterator.FileIteratorBuilder fileIterator_FileIteratorBuilder1 = fileIterator_FileIteratorBuilder0.includeHiddenFiles(false);
      mockFile0.setLastModified(0L);
      FileIterator.FileIteratorBuilder fileIterator_FileIteratorBuilder2 = fileIterator_FileIteratorBuilder1.includeDirectories(true);
      FileIterator.FileIteratorBuilder fileIterator_FileIteratorBuilder3 = fileIterator_FileIteratorBuilder2.includeHiddenFiles(false);
      fileIterator_FileIteratorBuilder3.includeHiddenFiles(false);
      FileIterator fileIterator0 = fileIterator_FileIteratorBuilder0.build();
      fileIterator_FileIteratorBuilder0.includeDirectories(false);
      LinkedList<FileFilter> linkedList0 = new LinkedList<FileFilter>();
      FileIterator.createNonRecursiveFileIteratorBuilder(mockFile0);
      fileIterator_FileIteratorBuilder0.build();
      File file0 = fileIterator0.getNextFile();
      assertTrue(file0.exists());
  }

  /**
  //Test case number: 5
  /*Coverage entropy=3.420249627664376
  */
  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      MockFile mockFile0 = new MockFile("", "");
      File file0 = MockFile.createTempFile("1L3g3*", "");
      mockFile0.renameTo(file0);
      FileIterator.FileIteratorBuilder fileIterator_FileIteratorBuilder0 = FileIterator.createBreadthFirstFileIteratorBuilder(mockFile0);
      FileIterator fileIterator0 = fileIterator_FileIteratorBuilder0.build();
      File file1 = fileIterator0.getNextFile();
      assertNotNull(file1);
      assertTrue(file1.isFile());
  }

  /**
  //Test case number: 6
  /*Coverage entropy=3.3835897335366067
  */
  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      MockFile mockFile0 = new MockFile("", "");
      FileIterator.FileIteratorBuilder fileIterator_FileIteratorBuilder0 = FileIterator.createBreadthFirstFileIteratorBuilder(mockFile0);
      FileIterator fileIterator0 = fileIterator_FileIteratorBuilder0.build();
      fileIterator0.getNextFile();
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
  //Test case number: 7
  /*Coverage entropy=3.3943098490900097
  */
  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      MockFile mockFile0 = new MockFile("", "");
      FileIterator.FileIteratorBuilder fileIterator_FileIteratorBuilder0 = FileIterator.createBreadthFirstFileIteratorBuilder(mockFile0);
      FileIterator.FileIteratorBuilder fileIterator_FileIteratorBuilder1 = fileIterator_FileIteratorBuilder0.includeDirectories(true);
      FileIterator fileIterator0 = fileIterator_FileIteratorBuilder1.build();
      File file0 = fileIterator0.next();
      assertNotSame(mockFile0, file0);
  }

  /**
  //Test case number: 8
  /*Coverage entropy=3.3912056362296994
  */
  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      MockFile mockFile0 = new MockFile(",5&", ",5&");
      MockFile.createTempFile(",5&", ",5&", (File) mockFile0);
      FileIterator.FileIteratorBuilder fileIterator_FileIteratorBuilder0 = FileIterator.createBreadthFirstFileIteratorBuilder(mockFile0);
      FileIterator fileIterator0 = fileIterator_FileIteratorBuilder0.build();
      boolean boolean0 = fileIterator0.hasNext();
      assertTrue(boolean0);
  }

  /**
  //Test case number: 9
  /*Coverage entropy=2.8876911911657177
  */
  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      MockFile mockFile0 = new MockFile(",5&", ",5&");
      MockFile.createTempFile(",5&", ",5&", (File) mockFile0);
      FileIterator.FileIteratorBuilder fileIterator_FileIteratorBuilder0 = FileIterator.createBreadthFirstFileIteratorBuilder(mockFile0);
      FileIterator fileIterator0 = fileIterator_FileIteratorBuilder0.build();
      File file0 = fileIterator0.next();
      assertEquals(",5&0,5&", file0.getName());
  }

  /**
  //Test case number: 10
  /*Coverage entropy=3.3935968366122915
  */
  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      MockFile mockFile0 = new MockFile("", "");
      FileIterator.FileIteratorBuilder fileIterator_FileIteratorBuilder0 = FileIterator.createBreadthFirstFileIteratorBuilder(mockFile0);
      fileIterator_FileIteratorBuilder0.includeDirectories(true);
      FileIterator fileIterator0 = fileIterator_FileIteratorBuilder0.build();
      File file0 = fileIterator0.getNextFile();
      assertNotNull(file0);
      assertTrue(fileIterator0.hasNext());
  }

  /**
  //Test case number: 11
  /*Coverage entropy=3.197846119469557
  */
  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      MockFile mockFile0 = new MockFile("", "");
      FileIterator.FileIteratorBuilder fileIterator_FileIteratorBuilder0 = FileIterator.createBreadthFirstFileIteratorBuilder(mockFile0);
      FileIterator.FileIteratorBuilder fileIterator_FileIteratorBuilder1 = fileIterator_FileIteratorBuilder0.includeDirectories(true);
      FileIterator.FileIteratorBuilder fileIterator_FileIteratorBuilder2 = fileIterator_FileIteratorBuilder1.includeHiddenFiles(true);
      FileIterator fileIterator0 = fileIterator_FileIteratorBuilder2.build();
      assertTrue(fileIterator0.hasNext());
  }

  /**
  //Test case number: 12
  /*Coverage entropy=2.2623477045221723
  */
  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      FileIterator.FileIteratorBuilder fileIterator_FileIteratorBuilder0 = FileIterator.createBreadthFirstFileIteratorBuilder((File) null);
      fileIterator_FileIteratorBuilder0.includeHiddenFiles(true);
      fileIterator_FileIteratorBuilder0.includeDirectories(true);
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
  //Test case number: 13
  /*Coverage entropy=2.9769701418514933
  */
  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      MockFile mockFile0 = new MockFile("");
      FileIterator.FileIteratorBuilder fileIterator_FileIteratorBuilder0 = FileIterator.createDepthFirstFileIteratorBuilder(mockFile0);
      FileIterator fileIterator0 = fileIterator_FileIteratorBuilder0.build();
      Iterator<File> iterator0 = fileIterator0.iterator();
      assertNotNull(iterator0);
  }

  /**
  //Test case number: 14
  /*Coverage entropy=2.0761045791007673
  */
  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      FileIterator.FileIteratorBuilder fileIterator_FileIteratorBuilder0 = FileIterator.createNonRecursiveFileIteratorBuilder((File) null);
      FileIterator.FileIteratorBuilder fileIterator_FileIteratorBuilder1 = fileIterator_FileIteratorBuilder0.includeHiddenFiles(true);
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
  //Test case number: 15
  /*Coverage entropy=2.84060911398924
  */
  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      MockFile mockFile0 = new MockFile("");
      FileIterator.FileIteratorBuilder fileIterator_FileIteratorBuilder0 = FileIterator.createNonRecursiveFileIteratorBuilder(mockFile0);
      FileIterator fileIterator0 = fileIterator_FileIteratorBuilder0.build();
      boolean boolean0 = fileIterator0.hasNext();
      assertFalse(boolean0);
  }

  /**
  //Test case number: 16
  /*Coverage entropy=3.061593652763551
  */
  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
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
  //Test case number: 17
  /*Coverage entropy=3.38354864046079
  */
  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      MockFile mockFile0 = new MockFile("", "");
      mockFile0.getAbsoluteFile();
      FileIterator.FileIteratorBuilder fileIterator_FileIteratorBuilder0 = FileIterator.createBreadthFirstFileIteratorBuilder(mockFile0);
      FileIterator fileIterator0 = fileIterator_FileIteratorBuilder0.build();
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
  //Test case number: 18
  /*Coverage entropy=3.383506473056194
  */
  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      MockFile mockFile0 = new MockFile("", "");
      FileIterator.FileIteratorBuilder fileIterator_FileIteratorBuilder0 = FileIterator.createBreadthFirstFileIteratorBuilder(mockFile0);
      FileIterator fileIterator0 = fileIterator_FileIteratorBuilder0.build();
      fileIterator0.updateFileIterator(mockFile0);
      assertFalse(fileIterator0.hasNext());
  }

  /**
  //Test case number: 19
  /*Coverage entropy=3.216157248141041
  */
  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      MockFile mockFile0 = new MockFile("");
      FileIterator.FileIteratorBuilder fileIterator_FileIteratorBuilder0 = FileIterator.createBreadthFirstFileIteratorBuilder(mockFile0);
      FileIterator fileIterator0 = fileIterator_FileIteratorBuilder0.build();
      File file0 = fileIterator0.getNextFile();
      assertNull(file0);
  }

  /**
  //Test case number: 20
  /*Coverage entropy=3.481697617019537
  */
  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      MockFile mockFile0 = new MockFile("", "");
      FileIterator.FileIteratorBuilder fileIterator_FileIteratorBuilder0 = FileIterator.createBreadthFirstFileIteratorBuilder(mockFile0);
      FileIterator fileIterator0 = fileIterator_FileIteratorBuilder0.build();
      fileIterator0.iterator();
      assertFalse(fileIterator0.hasNext());
  }

  /**
  //Test case number: 21
  /*Coverage entropy=2.684404064515707
  */
  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      MockFile mockFile0 = new MockFile("");
      FileIterator.FileIteratorBuilder fileIterator_FileIteratorBuilder0 = FileIterator.createNonRecursiveFileIteratorBuilder(mockFile0);
      FileIterator fileIterator0 = fileIterator_FileIteratorBuilder0.build();
      Iterator<File> iterator0 = fileIterator0.iterator();
      assertNotNull(iterator0);
  }

  /**
  //Test case number: 22
  /*Coverage entropy=2.0761045791007673
  */
  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      FileIterator.FileIteratorBuilder fileIterator_FileIteratorBuilder0 = FileIterator.createBreadthFirstFileIteratorBuilder((File) null);
      fileIterator_FileIteratorBuilder0.includeDirectories(true);
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
  //Test case number: 24
  /*Coverage entropy=3.1356559690710406
  */
  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
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
  //Test case number: 25
  /*Coverage entropy=2.4273916305367944
  */
  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      MockFile mockFile0 = new MockFile("", "");
      FileIterator.FileIteratorBuilder fileIterator_FileIteratorBuilder0 = FileIterator.createNonRecursiveFileIteratorBuilder(mockFile0);
      FileIterator fileIterator0 = fileIterator_FileIteratorBuilder0.build();
      assertFalse(fileIterator0.hasNext());
  }

  /**
  //Test case number: 26
  /*Coverage entropy=2.0761045791007673
  */
  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      FileIterator.FileIteratorBuilder fileIterator_FileIteratorBuilder0 = FileIterator.createNonRecursiveFileIteratorBuilder((File) null);
      FileFilter[] fileFilterArray0 = new FileFilter[0];
      MultipleFileFilter multipleFileFilter0 = new MultipleFileFilter(fileFilterArray0);
      fileIterator_FileIteratorBuilder0.fileFilter(multipleFileFilter0);
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
  //Test case number: 27
  /*Coverage entropy=1.830738805564335
  */
  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      FileIterator.FileIteratorBuilder fileIterator_FileIteratorBuilder0 = FileIterator.createBreadthFirstFileIteratorBuilder((File) null);
      LinkedList<FileFilter> linkedList0 = new LinkedList<FileFilter>();
      MultipleFileFilter multipleFileFilter0 = new MultipleFileFilter(linkedList0);
      FileIterator.FileIteratorBuilder fileIterator_FileIteratorBuilder1 = fileIterator_FileIteratorBuilder0.fileFilter(multipleFileFilter0);
      assertSame(fileIterator_FileIteratorBuilder0, fileIterator_FileIteratorBuilder1);
  }

  /**
  //Test case number: 28
  /*Coverage entropy=1.847832822658352
  */
  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      MockFile mockFile0 = new MockFile("wEmY`(Rs{O^G", "wEmY`(Rs{O^G");
      FileIterator.FileIteratorBuilder fileIterator_FileIteratorBuilder0 = FileIterator.createBreadthFirstFileIteratorBuilder(mockFile0);
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
  //Test case number: 29
  /*Coverage entropy=1.847832822658352
  */
  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
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
  //Test case number: 30
  /*Coverage entropy=1.847832822658352
  */
  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
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
  //Test case number: 31
  /*Coverage entropy=2.0800261477282183
  */
  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      MockFile mockFile0 = new MockFile("Oq|e1P", "Oq|e1P");
      FileIterator.FileIteratorBuilder fileIterator_FileIteratorBuilder0 = FileIterator.createDepthFirstFileIteratorBuilder(mockFile0);
      FileFilter[] fileFilterArray0 = new FileFilter[4];
      LinkedList<FileFilter> linkedList0 = new LinkedList<FileFilter>();
      MultipleFileFilter multipleFileFilter0 = new MultipleFileFilter(linkedList0);
      fileFilterArray0[0] = (FileFilter) multipleFileFilter0;
      MultipleFileFilter multipleFileFilter1 = new MultipleFileFilter(linkedList0);
      fileFilterArray0[1] = (FileFilter) multipleFileFilter1;
      MultipleFileFilter multipleFileFilter2 = new MultipleFileFilter(linkedList0);
      fileFilterArray0[2] = (FileFilter) multipleFileFilter2;
      MultipleFileFilter multipleFileFilter3 = new MultipleFileFilter(linkedList0);
      fileFilterArray0[3] = (FileFilter) multipleFileFilter3;
      MultipleFileFilter multipleFileFilter4 = new MultipleFileFilter(fileFilterArray0);
      fileIterator_FileIteratorBuilder0.fileFilter(multipleFileFilter4);
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
}
