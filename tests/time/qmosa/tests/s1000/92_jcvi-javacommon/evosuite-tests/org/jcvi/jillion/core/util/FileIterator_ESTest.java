/*
 * This file was automatically generated by EvoSuite
 * Tue Dec 03 14:08:03 GMT 2019
 */

package org.jcvi.jillion.core.util;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.File;
import java.io.FileFilter;
import java.net.URI;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.NoSuchElementException;
import java.util.function.Consumer;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
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
  /*Coverage entropy=3.3908903439523392
  */
  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      MockFile mockFile0 = new MockFile("");
      FileIterator.FileIteratorBuilder fileIterator_FileIteratorBuilder0 = FileIterator.createDepthFirstFileIteratorBuilder(mockFile0);
      fileIterator_FileIteratorBuilder0.fileFilter((FileFilter) null);
      FileIterator fileIterator0 = fileIterator_FileIteratorBuilder0.build();
      fileIterator0.getNextFile();
      fileIterator0.setUpInitialState(mockFile0);
      FileIterator.createNonRecursiveFileIteratorBuilder((File) null);
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
  //Test case number: 1
  /*Coverage entropy=3.614539429229295
  */
  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      MockFile mockFile0 = new MockFile("", "");
      mockFile0.toPath();
      FileIterator.FileIteratorBuilder fileIterator_FileIteratorBuilder0 = FileIterator.createBreadthFirstFileIteratorBuilder(mockFile0);
      FileIterator fileIterator0 = fileIterator_FileIteratorBuilder0.build();
      boolean boolean0 = false;
      fileIterator_FileIteratorBuilder0.includeHiddenFiles(false);
      mockFile0.toURI();
      FileIterator.FileIteratorBuilder fileIterator_FileIteratorBuilder1 = FileIterator.createNonRecursiveFileIteratorBuilder(mockFile0);
      FileIterator.FileIteratorBuilder fileIterator_FileIteratorBuilder2 = fileIterator_FileIteratorBuilder0.includeDirectories(true);
      FileIterator fileIterator1 = fileIterator_FileIteratorBuilder2.build();
      LinkedList<FileFilter> linkedList0 = new LinkedList<FileFilter>();
      MultipleFileFilter multipleFileFilter0 = new MultipleFileFilter(linkedList0);
      fileIterator_FileIteratorBuilder1.fileFilter(multipleFileFilter0);
      fileIterator0.getNextFile();
      // Undeclared exception!
      try { 
        fileIterator1.setUpInitialState((File) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  /**
  //Test case number: 2
  /*Coverage entropy=3.767056803395581
  */
  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      MockFile mockFile0 = new MockFile("", "");
      mockFile0.toPath();
      FileIterator.FileIteratorBuilder fileIterator_FileIteratorBuilder0 = FileIterator.createBreadthFirstFileIteratorBuilder(mockFile0);
      fileIterator_FileIteratorBuilder0.build();
      mockFile0.toURI();
      FileIterator.createNonRecursiveFileIteratorBuilder(mockFile0);
      FileIterator.FileIteratorBuilder fileIterator_FileIteratorBuilder1 = fileIterator_FileIteratorBuilder0.includeDirectories(true);
      FileIterator fileIterator0 = fileIterator_FileIteratorBuilder1.build();
      mockFile0.setWritable(true, true);
      Consumer<Object> consumer0 = (Consumer<Object>) mock(Consumer.class, new ViolatedAssumptionAnswer());
      fileIterator0.forEach(consumer0);
      fileIterator_FileIteratorBuilder1.build();
      FileIterator.createDepthFirstFileIteratorBuilder(mockFile0);
      File file0 = fileIterator0.getNextFile();
      assertEquals(0L, file0.getUsableSpace());
  }

  /**
  //Test case number: 3
  /*Coverage entropy=3.763399681679524
  */
  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      MockFile mockFile0 = new MockFile("", "");
      mockFile0.toPath();
      FileIterator.FileIteratorBuilder fileIterator_FileIteratorBuilder0 = FileIterator.createBreadthFirstFileIteratorBuilder(mockFile0);
      fileIterator_FileIteratorBuilder0.build();
      fileIterator_FileIteratorBuilder0.includeHiddenFiles(false);
      mockFile0.toURI();
      FileIterator.createNonRecursiveFileIteratorBuilder(mockFile0);
      FileIterator.FileIteratorBuilder fileIterator_FileIteratorBuilder1 = fileIterator_FileIteratorBuilder0.includeDirectories(true);
      FileIterator fileIterator0 = fileIterator_FileIteratorBuilder1.build();
      FileIterator.createBreadthFirstFileIteratorBuilder(mockFile0);
      FileIterator.createDepthFirstFileIteratorBuilder(mockFile0);
      fileIterator0.iterator();
      boolean boolean0 = fileIterator0.hasNext();
      assertTrue(boolean0);
  }

  /**
  //Test case number: 4
  /*Coverage entropy=3.691874667067132
  */
  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      MockFile mockFile0 = new MockFile("", "");
      mockFile0.toPath();
      FileIterator.FileIteratorBuilder fileIterator_FileIteratorBuilder0 = FileIterator.createBreadthFirstFileIteratorBuilder(mockFile0);
      fileIterator_FileIteratorBuilder0.build();
      fileIterator_FileIteratorBuilder0.includeDirectories(true);
      FileIterator.FileIteratorBuilder fileIterator_FileIteratorBuilder1 = fileIterator_FileIteratorBuilder0.includeDirectories(true);
      fileIterator_FileIteratorBuilder0.build();
      mockFile0.setWritable(false, false);
      fileIterator_FileIteratorBuilder1.build();
      FileIterator.createBreadthFirstFileIteratorBuilder(mockFile0);
      fileIterator_FileIteratorBuilder0.includeDirectories(true);
      FileIterator.FileIteratorBuilder fileIterator_FileIteratorBuilder2 = FileIterator.createNonRecursiveFileIteratorBuilder(mockFile0);
      FileIterator fileIterator0 = fileIterator_FileIteratorBuilder2.build();
      fileIterator0.iterator();
      FileIterator.FileIteratorBuilder fileIterator_FileIteratorBuilder3 = FileIterator.createBreadthFirstFileIteratorBuilder(mockFile0);
      assertNotSame(fileIterator_FileIteratorBuilder3, fileIterator_FileIteratorBuilder1);
  }

  /**
  //Test case number: 5
  /*Coverage entropy=3.6149305966685175
  */
  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      MockFile mockFile0 = new MockFile("", "");
      mockFile0.toPath();
      FileIterator.FileIteratorBuilder fileIterator_FileIteratorBuilder0 = FileIterator.createBreadthFirstFileIteratorBuilder(mockFile0);
      FileIterator fileIterator0 = fileIterator_FileIteratorBuilder0.build();
      FileIterator.createNonRecursiveFileIteratorBuilder(mockFile0);
      FileIterator.FileIteratorBuilder fileIterator_FileIteratorBuilder1 = fileIterator_FileIteratorBuilder0.includeDirectories(true);
      fileIterator_FileIteratorBuilder1.build();
      FileIterator.createBreadthFirstFileIteratorBuilder(mockFile0);
      fileIterator_FileIteratorBuilder1.build();
      FileIterator.createDepthFirstFileIteratorBuilder(mockFile0);
      File file0 = fileIterator0.getNextFile();
      assertNull(file0);
      assertFalse(fileIterator0.hasNext());
  }

  /**
  //Test case number: 6
  /*Coverage entropy=3.5965443250185394
  */
  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      MockFile mockFile0 = new MockFile("", "");
      mockFile0.toPath();
      FileIterator.FileIteratorBuilder fileIterator_FileIteratorBuilder0 = FileIterator.createBreadthFirstFileIteratorBuilder(mockFile0);
      FileIterator fileIterator0 = fileIterator_FileIteratorBuilder0.build();
      boolean boolean0 = true;
      FileIterator.FileIteratorBuilder fileIterator_FileIteratorBuilder1 = fileIterator_FileIteratorBuilder0.includeHiddenFiles(true);
      mockFile0.toURI();
      fileIterator_FileIteratorBuilder0.includeDirectories(false);
      MockFile mockFile1 = new MockFile("", "");
      File file0 = MockFile.createTempFile("org.jcvi.jillion.core.util.FileIterator$BreadthFirstFileIteratorBuilder", "");
      fileIterator0.setUpInitialState(file0);
      fileIterator_FileIteratorBuilder1.includeDirectories(false);
      FileIterator.FileIteratorBuilder fileIterator_FileIteratorBuilder2 = FileIterator.createDepthFirstFileIteratorBuilder(file0);
      // Undeclared exception!
      try { 
        fileIterator_FileIteratorBuilder2.build();
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // rootDir must be a directory
         //
         verifyException("org.jcvi.jillion.core.util.FileIterator", e);
      }
  }

  /**
  //Test case number: 7
  /*Coverage entropy=3.767647197344638
  */
  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      MockFile mockFile0 = new MockFile("", "");
      FileIterator.FileIteratorBuilder fileIterator_FileIteratorBuilder0 = FileIterator.createDepthFirstFileIteratorBuilder(mockFile0);
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("/home/ubuntu/termite");
      FileSystemHandling.createFolder(evoSuiteFile0);
      fileIterator_FileIteratorBuilder0.build();
      Consumer<Object> consumer0 = (Consumer<Object>) mock(Consumer.class, new ViolatedAssumptionAnswer());
      FileIterator.FileIteratorBuilder fileIterator_FileIteratorBuilder1 = FileIterator.createBreadthFirstFileIteratorBuilder(mockFile0);
      FileIterator fileIterator0 = fileIterator_FileIteratorBuilder1.build();
      fileIterator0.spliterator();
      EvoSuiteFile evoSuiteFile1 = new EvoSuiteFile("/home");
      fileIterator_FileIteratorBuilder0.includeHiddenFiles(false);
      FileSystemHandling.shouldThrowIOException(evoSuiteFile1);
      fileIterator_FileIteratorBuilder0.includeDirectories(false);
      fileIterator_FileIteratorBuilder0.build();
      FileIterator.FileIteratorBuilder fileIterator_FileIteratorBuilder2 = fileIterator_FileIteratorBuilder0.includeDirectories(false);
      FileIterator.FileIteratorBuilder fileIterator_FileIteratorBuilder3 = fileIterator_FileIteratorBuilder2.includeDirectories(true);
      assertSame(fileIterator_FileIteratorBuilder2, fileIterator_FileIteratorBuilder3);
  }

  /**
  //Test case number: 8
  /*Coverage entropy=3.5323017892526303
  */
  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      MockFile mockFile0 = new MockFile("", "");
      FileIterator.FileIteratorBuilder fileIterator_FileIteratorBuilder0 = FileIterator.createDepthFirstFileIteratorBuilder(mockFile0);
      FileIterator fileIterator0 = fileIterator_FileIteratorBuilder0.build();
      fileIterator0.updateFileIterator(mockFile0);
      Consumer<Object> consumer0 = (Consumer<Object>) mock(Consumer.class, new ViolatedAssumptionAnswer());
      FileIterator.createBreadthFirstFileIteratorBuilder(mockFile0);
      FileIterator.FileIteratorBuilder fileIterator_FileIteratorBuilder1 = fileIterator_FileIteratorBuilder0.includeDirectories(true);
      fileIterator_FileIteratorBuilder1.build();
      fileIterator_FileIteratorBuilder1.includeDirectories(true);
      FileIterator.FileIteratorBuilder fileIterator_FileIteratorBuilder2 = fileIterator_FileIteratorBuilder1.includeDirectories(false);
      assertSame(fileIterator_FileIteratorBuilder1, fileIterator_FileIteratorBuilder2);
  }

  /**
  //Test case number: 9
  /*Coverage entropy=3.8308790197001956
  */
  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      MockFile mockFile0 = new MockFile("", "");
      mockFile0.toPath();
      FileIterator.FileIteratorBuilder fileIterator_FileIteratorBuilder0 = FileIterator.createBreadthFirstFileIteratorBuilder(mockFile0);
      fileIterator_FileIteratorBuilder0.build();
      FileIterator.FileIteratorBuilder fileIterator_FileIteratorBuilder1 = fileIterator_FileIteratorBuilder0.includeHiddenFiles(false);
      mockFile0.toURI();
      mockFile0.mkdirs();
      FileIterator.FileIteratorBuilder fileIterator_FileIteratorBuilder2 = FileIterator.createNonRecursiveFileIteratorBuilder(mockFile0);
      fileIterator_FileIteratorBuilder2.includeDirectories(false);
      FileIterator.FileIteratorBuilder fileIterator_FileIteratorBuilder3 = FileIterator.createDepthFirstFileIteratorBuilder(mockFile0);
      FileIterator.FileIteratorBuilder fileIterator_FileIteratorBuilder4 = fileIterator_FileIteratorBuilder3.includeDirectories(true);
      FileIterator fileIterator0 = fileIterator_FileIteratorBuilder4.build();
      fileIterator_FileIteratorBuilder1.includeHiddenFiles(true);
      fileIterator_FileIteratorBuilder0.includeDirectories(true);
      Iterator<File> iterator0 = fileIterator0.iterator();
      assertNotNull(iterator0);
  }

  /**
  //Test case number: 10
  /*Coverage entropy=3.431017352342551
  */
  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("/home/ubuntu/termite/projects/92_jcvi-javacommon");
      FileSystemHandling.shouldThrowIOException(evoSuiteFile0);
      MockFile mockFile0 = new MockFile("", "");
      mockFile0.toPath();
      FileIterator.FileIteratorBuilder fileIterator_FileIteratorBuilder0 = FileIterator.createBreadthFirstFileIteratorBuilder(mockFile0);
      fileIterator_FileIteratorBuilder0.build();
      FileIterator.FileIteratorBuilder fileIterator_FileIteratorBuilder1 = fileIterator_FileIteratorBuilder0.includeHiddenFiles(true);
      mockFile0.toURI();
      FileIterator.FileIteratorBuilder fileIterator_FileIteratorBuilder2 = fileIterator_FileIteratorBuilder1.includeHiddenFiles(true);
      fileIterator_FileIteratorBuilder2.build();
      FileIterator.FileIteratorBuilder fileIterator_FileIteratorBuilder3 = FileIterator.createBreadthFirstFileIteratorBuilder(mockFile0);
      FileIterator.FileIteratorBuilder fileIterator_FileIteratorBuilder4 = fileIterator_FileIteratorBuilder1.includeDirectories(false);
      assertNotSame(fileIterator_FileIteratorBuilder4, fileIterator_FileIteratorBuilder3);
  }

  /**
  //Test case number: 11
  /*Coverage entropy=3.68947412640187
  */
  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      MockFile mockFile0 = new MockFile("", "");
      FileIterator.FileIteratorBuilder fileIterator_FileIteratorBuilder0 = FileIterator.createDepthFirstFileIteratorBuilder(mockFile0);
      Consumer<Object> consumer0 = (Consumer<Object>) mock(Consumer.class, new ViolatedAssumptionAnswer());
      FileIterator.FileIteratorBuilder fileIterator_FileIteratorBuilder1 = FileIterator.createBreadthFirstFileIteratorBuilder(mockFile0);
      FileIterator.FileIteratorBuilder fileIterator_FileIteratorBuilder2 = fileIterator_FileIteratorBuilder0.includeDirectories(true);
      FileIterator fileIterator0 = fileIterator_FileIteratorBuilder2.build();
      mockFile0.toURL();
      fileIterator0.next();
      mockFile0.toURL();
      FileIterator.FileIteratorBuilder fileIterator_FileIteratorBuilder3 = fileIterator_FileIteratorBuilder0.includeHiddenFiles(true);
      fileIterator_FileIteratorBuilder3.build();
      FileIterator fileIterator1 = fileIterator_FileIteratorBuilder3.build();
      fileIterator1.next();
      FileIterator.FileIteratorBuilder fileIterator_FileIteratorBuilder4 = FileIterator.createNonRecursiveFileIteratorBuilder(mockFile0);
      assertFalse(fileIterator_FileIteratorBuilder4.equals((Object)fileIterator_FileIteratorBuilder1));
  }

  /**
  //Test case number: 12
  /*Coverage entropy=3.5707514504894493
  */
  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      MockFile mockFile0 = new MockFile("", "");
      mockFile0.toPath();
      FileIterator.FileIteratorBuilder fileIterator_FileIteratorBuilder0 = FileIterator.createBreadthFirstFileIteratorBuilder(mockFile0);
      FileIterator fileIterator0 = fileIterator_FileIteratorBuilder0.build();
      FileIterator.FileIteratorBuilder fileIterator_FileIteratorBuilder1 = fileIterator_FileIteratorBuilder0.includeHiddenFiles(false);
      mockFile0.toURI();
      FileIterator.FileIteratorBuilder fileIterator_FileIteratorBuilder2 = fileIterator_FileIteratorBuilder0.includeDirectories(true);
      MockFile mockFile1 = new MockFile("", "");
      fileIterator0.setUpInitialState(mockFile1);
      fileIterator_FileIteratorBuilder1.includeDirectories(true);
      FileIterator.FileIteratorBuilder fileIterator_FileIteratorBuilder3 = fileIterator_FileIteratorBuilder2.includeDirectories(false);
      fileIterator_FileIteratorBuilder3.includeDirectories(false);
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
  //Test case number: 13
  /*Coverage entropy=3.8009310507433143
  */
  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      MockFile mockFile0 = new MockFile("", "");
      mockFile0.toPath();
      FileIterator.FileIteratorBuilder fileIterator_FileIteratorBuilder0 = FileIterator.createBreadthFirstFileIteratorBuilder(mockFile0);
      fileIterator_FileIteratorBuilder0.build();
      FileIterator.FileIteratorBuilder fileIterator_FileIteratorBuilder1 = fileIterator_FileIteratorBuilder0.includeHiddenFiles(false);
      mockFile0.toURI();
      FileIterator.FileIteratorBuilder fileIterator_FileIteratorBuilder2 = FileIterator.createNonRecursiveFileIteratorBuilder(mockFile0);
      FileIterator.FileIteratorBuilder fileIterator_FileIteratorBuilder3 = fileIterator_FileIteratorBuilder0.includeDirectories(true);
      FileIterator fileIterator0 = fileIterator_FileIteratorBuilder3.build();
      mockFile0.setWritable(true, true);
      Consumer<Object> consumer0 = (Consumer<Object>) mock(Consumer.class, new ViolatedAssumptionAnswer());
      fileIterator0.forEach(consumer0);
      assertTrue(fileIterator0.hasNext());
      
      fileIterator_FileIteratorBuilder1.includeDirectories(true);
      FileIterator fileIterator1 = fileIterator_FileIteratorBuilder2.build();
      assertFalse(fileIterator1.hasNext());
  }

  /**
  //Test case number: 14
  /*Coverage entropy=3.7663319394832375
  */
  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      MockFile mockFile0 = new MockFile("", "");
      FileIterator.FileIteratorBuilder fileIterator_FileIteratorBuilder0 = FileIterator.createDepthFirstFileIteratorBuilder(mockFile0);
      FileIterator fileIterator0 = fileIterator_FileIteratorBuilder0.build();
      FileIterator.createBreadthFirstFileIteratorBuilder(mockFile0);
      FileIterator.FileIteratorBuilder fileIterator_FileIteratorBuilder1 = FileIterator.createNonRecursiveFileIteratorBuilder(mockFile0);
      fileIterator_FileIteratorBuilder1.build();
      FileIterator.createBreadthFirstFileIteratorBuilder(mockFile0);
      fileIterator0.iterator();
      boolean boolean0 = fileIterator0.hasNext();
      assertFalse(boolean0);
      
      fileIterator0.getNextFile();
      assertFalse(fileIterator0.hasNext());
  }

  /**
  //Test case number: 15
  /*Coverage entropy=3.5339491827546676
  */
  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      MockFile mockFile0 = new MockFile("", "");
      FileIterator.FileIteratorBuilder fileIterator_FileIteratorBuilder0 = FileIterator.createDepthFirstFileIteratorBuilder(mockFile0);
      FileIterator fileIterator0 = fileIterator_FileIteratorBuilder0.build();
      fileIterator0.updateFileIterator(mockFile0);
      Consumer<Object> consumer0 = (Consumer<Object>) mock(Consumer.class, new ViolatedAssumptionAnswer());
      FileIterator.createBreadthFirstFileIteratorBuilder(mockFile0);
      FileIterator.FileIteratorBuilder fileIterator_FileIteratorBuilder1 = fileIterator_FileIteratorBuilder0.includeDirectories(true);
      FileIterator fileIterator1 = fileIterator_FileIteratorBuilder1.build();
      assertTrue(fileIterator1.hasNext());
      
      FileIterator.FileIteratorBuilder fileIterator_FileIteratorBuilder2 = fileIterator_FileIteratorBuilder1.includeDirectories(false);
      fileIterator_FileIteratorBuilder0.build();
      FileIterator.FileIteratorBuilder fileIterator_FileIteratorBuilder3 = FileIterator.createBreadthFirstFileIteratorBuilder(mockFile0);
      fileIterator_FileIteratorBuilder3.includeDirectories(true);
      fileIterator_FileIteratorBuilder2.build();
      fileIterator0.setUpInitialState(mockFile0);
      assertFalse(fileIterator0.hasNext());
  }

  /**
  //Test case number: 16
  /*Coverage entropy=3.6911900286418002
  */
  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      MockFile mockFile0 = new MockFile("", "");
      FileIterator.FileIteratorBuilder fileIterator_FileIteratorBuilder0 = FileIterator.createDepthFirstFileIteratorBuilder(mockFile0);
      FileIterator fileIterator0 = fileIterator_FileIteratorBuilder0.build();
      Consumer<Object> consumer0 = (Consumer<Object>) mock(Consumer.class, new ViolatedAssumptionAnswer());
      FileIterator.createBreadthFirstFileIteratorBuilder(mockFile0);
      boolean boolean0 = true;
      FileIterator.FileIteratorBuilder fileIterator_FileIteratorBuilder1 = fileIterator_FileIteratorBuilder0.includeDirectories(true);
      FileIterator fileIterator1 = fileIterator_FileIteratorBuilder1.build();
      mockFile0.toURL();
      fileIterator1.next();
      FileIterator.FileIteratorBuilder fileIterator_FileIteratorBuilder2 = fileIterator_FileIteratorBuilder0.includeDirectories(true);
      LinkedList<FileFilter> linkedList0 = new LinkedList<FileFilter>();
      MultipleFileFilter multipleFileFilter0 = new MultipleFileFilter(linkedList0);
      fileIterator_FileIteratorBuilder2.fileFilter(multipleFileFilter0);
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
  //Test case number: 17
  /*Coverage entropy=3.432757197408911
  */
  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      MockFile mockFile0 = new MockFile("", "");
      FileIterator.FileIteratorBuilder fileIterator_FileIteratorBuilder0 = FileIterator.createDepthFirstFileIteratorBuilder(mockFile0);
      FileIterator fileIterator0 = fileIterator_FileIteratorBuilder0.build();
      Consumer<Object> consumer0 = (Consumer<Object>) mock(Consumer.class, new ViolatedAssumptionAnswer());
      fileIterator0.forEachRemaining(consumer0);
      Consumer<Object> consumer1 = (Consumer<Object>) mock(Consumer.class, new ViolatedAssumptionAnswer());
      LinkedList<FileFilter> linkedList0 = new LinkedList<FileFilter>();
      MultipleFileFilter multipleFileFilter0 = new MultipleFileFilter(linkedList0);
      MultipleFileFilter multipleFileFilter1 = new MultipleFileFilter(linkedList0);
      LinkedList<FileFilter> linkedList1 = new LinkedList<FileFilter>();
      MultipleFileFilter multipleFileFilter2 = new MultipleFileFilter(linkedList0);
      MultipleFileFilter multipleFileFilter3 = new MultipleFileFilter(linkedList0);
      LinkedList<FileFilter> linkedList2 = new LinkedList<FileFilter>();
      FileSystemHandling.shouldAllThrowIOExceptions();
      MultipleFileFilter multipleFileFilter4 = new MultipleFileFilter(linkedList2);
      MultipleFileFilter multipleFileFilter5 = new MultipleFileFilter(linkedList2);
      MultipleFileFilter multipleFileFilter6 = new MultipleFileFilter(linkedList1);
      linkedList0.removeAll(linkedList2);
      FileFilter[] fileFilterArray0 = new FileFilter[8];
      fileFilterArray0[0] = (FileFilter) multipleFileFilter3;
      fileFilterArray0[4] = (FileFilter) multipleFileFilter2;
      fileFilterArray0[2] = (FileFilter) multipleFileFilter1;
      fileFilterArray0[3] = (FileFilter) multipleFileFilter1;
      fileFilterArray0[4] = (FileFilter) multipleFileFilter4;
      fileFilterArray0[5] = (FileFilter) multipleFileFilter1;
      fileFilterArray0[6] = (FileFilter) multipleFileFilter3;
      MultipleFileFilter multipleFileFilter7 = new MultipleFileFilter(fileFilterArray0);
      fileFilterArray0[7] = (FileFilter) multipleFileFilter7;
      MultipleFileFilter multipleFileFilter8 = new MultipleFileFilter(fileFilterArray0);
      MultipleFileFilter multipleFileFilter9 = new MultipleFileFilter(fileFilterArray0);
      LinkedList<FileFilter> linkedList3 = new LinkedList<FileFilter>();
      MultipleFileFilter multipleFileFilter10 = new MultipleFileFilter(linkedList1);
      MultipleFileFilter multipleFileFilter11 = new MultipleFileFilter(fileFilterArray0);
      LinkedList<FileFilter> linkedList4 = new LinkedList<FileFilter>();
      MultipleFileFilter multipleFileFilter12 = new MultipleFileFilter(linkedList0);
      assertFalse(multipleFileFilter12.equals((Object)multipleFileFilter5));
  }

  /**
  //Test case number: 18
  /*Coverage entropy=3.6546116051529154
  */
  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      MockFile mockFile0 = new MockFile("", "");
      FileIterator.FileIteratorBuilder fileIterator_FileIteratorBuilder0 = FileIterator.createDepthFirstFileIteratorBuilder(mockFile0);
      fileIterator_FileIteratorBuilder0.build();
      Consumer<Object> consumer0 = (Consumer<Object>) mock(Consumer.class, new ViolatedAssumptionAnswer());
      FileIterator.createBreadthFirstFileIteratorBuilder(mockFile0);
      FileIterator.FileIteratorBuilder fileIterator_FileIteratorBuilder1 = fileIterator_FileIteratorBuilder0.includeDirectories(true);
      FileIterator fileIterator0 = fileIterator_FileIteratorBuilder1.build();
      fileIterator0.spliterator();
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("/home");
      FileIterator.FileIteratorBuilder fileIterator_FileIteratorBuilder2 = fileIterator_FileIteratorBuilder0.includeHiddenFiles(false);
      FileSystemHandling.shouldThrowIOException(evoSuiteFile0);
      fileIterator_FileIteratorBuilder1.includeDirectories(false);
      fileIterator_FileIteratorBuilder0.build();
      fileIterator_FileIteratorBuilder2.includeHiddenFiles(true);
      FileIterator.FileIteratorBuilder fileIterator_FileIteratorBuilder3 = fileIterator_FileIteratorBuilder2.includeHiddenFiles(false);
      FileIterator.FileIteratorBuilder fileIterator_FileIteratorBuilder4 = fileIterator_FileIteratorBuilder3.includeDirectories(true);
      assertSame(fileIterator_FileIteratorBuilder3, fileIterator_FileIteratorBuilder4);
  }

  /**
  //Test case number: 19
  /*Coverage entropy=3.0823572675934168
  */
  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      MockFile mockFile0 = new MockFile("", "");
      FileIterator.FileIteratorBuilder fileIterator_FileIteratorBuilder0 = FileIterator.createNonRecursiveFileIteratorBuilder(mockFile0);
      FileIterator.FileIteratorBuilder fileIterator_FileIteratorBuilder1 = fileIterator_FileIteratorBuilder0.includeDirectories(true);
      FileIterator.FileIteratorBuilder fileIterator_FileIteratorBuilder2 = fileIterator_FileIteratorBuilder1.includeHiddenFiles(true);
      fileIterator_FileIteratorBuilder2.build();
      LinkedList<FileFilter> linkedList0 = new LinkedList<FileFilter>();
      MultipleFileFilter multipleFileFilter0 = new MultipleFileFilter(linkedList0);
      MultipleFileFilter multipleFileFilter1 = new MultipleFileFilter(linkedList0);
      MultipleFileFilter multipleFileFilter2 = new MultipleFileFilter(linkedList0);
      LinkedList<FileFilter> linkedList1 = new LinkedList<FileFilter>();
      MultipleFileFilter multipleFileFilter3 = new MultipleFileFilter(linkedList1);
      LinkedList<FileFilter> linkedList2 = new LinkedList<FileFilter>();
      linkedList2.add((FileFilter) multipleFileFilter0);
      LinkedList<FileFilter> linkedList3 = new LinkedList<FileFilter>();
      MultipleFileFilter multipleFileFilter4 = new MultipleFileFilter(linkedList3);
      MultipleFileFilter multipleFileFilter5 = new MultipleFileFilter(linkedList1);
      MultipleFileFilter multipleFileFilter6 = new MultipleFileFilter(linkedList0);
      linkedList3.removeAll(linkedList1);
      FileFilter[] fileFilterArray0 = new FileFilter[5];
      fileFilterArray0[0] = (FileFilter) multipleFileFilter0;
      MultipleFileFilter multipleFileFilter7 = new MultipleFileFilter(fileFilterArray0);
      fileFilterArray0[1] = (FileFilter) multipleFileFilter7;
      fileFilterArray0[2] = (FileFilter) multipleFileFilter2;
      fileFilterArray0[3] = (FileFilter) multipleFileFilter6;
      fileFilterArray0[4] = (FileFilter) multipleFileFilter6;
      MultipleFileFilter multipleFileFilter8 = new MultipleFileFilter(fileFilterArray0);
      MultipleFileFilter multipleFileFilter9 = new MultipleFileFilter(fileFilterArray0);
      MultipleFileFilter multipleFileFilter10 = new MultipleFileFilter(linkedList2);
      MultipleFileFilter multipleFileFilter11 = new MultipleFileFilter(fileFilterArray0);
      MultipleFileFilter multipleFileFilter12 = new MultipleFileFilter(linkedList3);
      assertFalse(multipleFileFilter12.equals((Object)multipleFileFilter3));
  }

  /**
  //Test case number: 20
  /*Coverage entropy=3.393966795916768
  */
  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      MockFile mockFile0 = new MockFile("", "");
      URI uRI0 = MockURI.aFileURI;
      URI uRI1 = MockURI.normalize(uRI0);
      MockURI.relativize(uRI0, uRI1);
      MockFile mockFile1 = new MockFile("org.jcvi.jillion.core.util.LIFOQueue", "org.jcvi.jillion.core.util.LIFOQueue");
      FileIterator.FileIteratorBuilder fileIterator_FileIteratorBuilder0 = FileIterator.createBreadthFirstFileIteratorBuilder(mockFile0);
      fileIterator_FileIteratorBuilder0.includeDirectories(true);
      fileIterator_FileIteratorBuilder0.build();
      FileIterator.FileIteratorBuilder fileIterator_FileIteratorBuilder1 = FileIterator.createBreadthFirstFileIteratorBuilder(mockFile1);
      assertNotSame(fileIterator_FileIteratorBuilder1, fileIterator_FileIteratorBuilder0);
  }

  /**
  //Test case number: 21
  /*Coverage entropy=2.3010386369482903
  */
  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      MockFile mockFile0 = new MockFile("", "fp/u0bb_l=gT");
      URI uRI0 = MockURI.aFileURI;
      URI uRI1 = MockURI.normalize(uRI0);
      MockURI.relativize(uRI0, uRI1);
      MockFile mockFile1 = new MockFile("org.jcvi.jillion.core.util.LIFOQueue", "org.jcvi.jillion.core.util.LIFOQueue");
      FileIterator.FileIteratorBuilder fileIterator_FileIteratorBuilder0 = FileIterator.createBreadthFirstFileIteratorBuilder(mockFile0);
      fileIterator_FileIteratorBuilder0.includeDirectories(true);
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
  //Test case number: 22
  /*Coverage entropy=2.1290003949677563
  */
  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Consumer<Object> consumer0 = (Consumer<Object>) mock(Consumer.class, new ViolatedAssumptionAnswer());
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
  //Test case number: 23
  /*Coverage entropy=2.5782737395252497
  */
  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      File file0 = null;
      FileIterator.FileIteratorBuilder fileIterator_FileIteratorBuilder0 = FileIterator.createBreadthFirstFileIteratorBuilder((File) null);
      FileFilter[] fileFilterArray0 = new FileFilter[4];
      LinkedList<FileFilter> linkedList0 = new LinkedList<FileFilter>();
      fileIterator_FileIteratorBuilder0.includeDirectories(true);
      MultipleFileFilter multipleFileFilter0 = new MultipleFileFilter(linkedList0);
      fileFilterArray0[0] = (FileFilter) multipleFileFilter0;
      MultipleFileFilter multipleFileFilter1 = new MultipleFileFilter(linkedList0);
      fileFilterArray0[1] = (FileFilter) multipleFileFilter1;
      LinkedList<FileFilter> linkedList1 = new LinkedList<FileFilter>();
      multipleFileFilter0.accept((File) null);
      MultipleFileFilter multipleFileFilter2 = new MultipleFileFilter(linkedList1);
      fileFilterArray0[2] = (FileFilter) multipleFileFilter2;
      MultipleFileFilter multipleFileFilter3 = new MultipleFileFilter(linkedList0);
      fileFilterArray0[3] = (FileFilter) multipleFileFilter3;
      MultipleFileFilter multipleFileFilter4 = new MultipleFileFilter(fileFilterArray0);
      FileIterator.FileIteratorBuilder fileIterator_FileIteratorBuilder1 = fileIterator_FileIteratorBuilder0.fileFilter(multipleFileFilter4);
      fileIterator_FileIteratorBuilder1.fileFilter(fileFilterArray0[1]);
      multipleFileFilter4.accept((File) null);
      FileIterator.FileIteratorBuilder fileIterator_FileIteratorBuilder2 = fileIterator_FileIteratorBuilder1.includeHiddenFiles(false);
      fileIterator_FileIteratorBuilder2.includeHiddenFiles(false);
      multipleFileFilter4.accept((File) null);
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
  //Test case number: 24
  /*Coverage entropy=3.432757197408911
  */
  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      MockFile mockFile0 = new MockFile("", "");
      mockFile0.toPath();
      FileIterator.FileIteratorBuilder fileIterator_FileIteratorBuilder0 = FileIterator.createBreadthFirstFileIteratorBuilder(mockFile0);
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
      FileIterator fileIterator0 = fileIterator_FileIteratorBuilder0.build();
      assertFalse(fileIterator0.hasNext());
  }
}
