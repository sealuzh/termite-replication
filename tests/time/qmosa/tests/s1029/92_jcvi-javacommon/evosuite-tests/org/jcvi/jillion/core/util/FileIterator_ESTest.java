/*
 * This file was automatically generated by EvoSuite
 * Wed Dec 04 11:30:58 GMT 2019
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
import org.evosuite.runtime.testdata.EvoSuiteFile;
import org.evosuite.runtime.testdata.FileSystemHandling;
import org.jcvi.jillion.core.util.FileIterator;
import org.jcvi.jillion.core.util.MultipleFileFilter;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class FileIterator_ESTest extends FileIterator_ESTest_scaffolding {

  /**
  //Test case number: 0
  /*Coverage entropy=3.8156281044451537
  */
  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      MockFile mockFile0 = new MockFile("", "");
      FileIterator.FileIteratorBuilder fileIterator_FileIteratorBuilder0 = FileIterator.createDepthFirstFileIteratorBuilder(mockFile0);
      mockFile0.getCanonicalPath();
      fileIterator_FileIteratorBuilder0.includeDirectories(true);
      FileIterator.FileIteratorBuilder fileIterator_FileIteratorBuilder1 = fileIterator_FileIteratorBuilder0.includeDirectories(true);
      FileIterator.FileIteratorBuilder fileIterator_FileIteratorBuilder2 = fileIterator_FileIteratorBuilder0.includeHiddenFiles(true);
      FileIterator fileIterator0 = fileIterator_FileIteratorBuilder2.build();
      File file0 = fileIterator0.getNextFile();
      FileIterator.createNonRecursiveFileIteratorBuilder(mockFile0);
      fileIterator0.updateFileIterator(file0);
      fileIterator_FileIteratorBuilder2.includeHiddenFiles(true);
      FileIterator fileIterator1 = fileIterator_FileIteratorBuilder1.build();
      FileIterator fileIterator2 = fileIterator_FileIteratorBuilder0.build();
      fileIterator2.updateFileIterator(mockFile0);
      File file1 = MockFile.createTempFile("org.jcvi.jillion.core.util.iter.IteratorUtil$EmptyIterator", "vc)V4lST");
      fileIterator1.setUpInitialState(file1);
      fileIterator0.next();
      LinkedList<FileFilter> linkedList0 = new LinkedList<FileFilter>();
      fileIterator1.iterator();
      LinkedList<FileFilter> linkedList1 = new LinkedList<FileFilter>();
      MultipleFileFilter multipleFileFilter0 = new MultipleFileFilter(linkedList1);
      fileIterator_FileIteratorBuilder2.build();
      FileIterator.FileIteratorBuilder fileIterator_FileIteratorBuilder3 = FileIterator.createNonRecursiveFileIteratorBuilder(mockFile0);
      fileIterator_FileIteratorBuilder3.build();
      // Undeclared exception!
      try { 
        fileIterator2.remove();
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // can not remove
         //
         verifyException("org.jcvi.jillion.core.util.FileIterator", e);
      }
  }

  /**
  //Test case number: 1
  /*Coverage entropy=3.0858808757681877
  */
  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      MockFile mockFile0 = new MockFile("");
      FileIterator.FileIteratorBuilder fileIterator_FileIteratorBuilder0 = FileIterator.createNonRecursiveFileIteratorBuilder(mockFile0);
      FileIterator.FileIteratorBuilder fileIterator_FileIteratorBuilder1 = fileIterator_FileIteratorBuilder0.includeHiddenFiles(true);
      FileIterator.FileIteratorBuilder fileIterator_FileIteratorBuilder2 = fileIterator_FileIteratorBuilder1.includeDirectories(false);
      FileIterator fileIterator0 = fileIterator_FileIteratorBuilder2.build();
      Iterator<File> iterator0 = fileIterator0.iterator();
      assertNotNull(iterator0);
  }

  /**
  //Test case number: 2
  /*Coverage entropy=3.7539245379811566
  */
  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      MockFile mockFile0 = new MockFile("", "");
      FileIterator.FileIteratorBuilder fileIterator_FileIteratorBuilder0 = FileIterator.createDepthFirstFileIteratorBuilder(mockFile0);
      FileIterator.FileIteratorBuilder fileIterator_FileIteratorBuilder1 = fileIterator_FileIteratorBuilder0.includeDirectories(true);
      FileIterator fileIterator0 = fileIterator_FileIteratorBuilder0.build();
      fileIterator0.iterator();
      FileIterator.FileIteratorBuilder fileIterator_FileIteratorBuilder2 = fileIterator_FileIteratorBuilder0.includeDirectories(true);
      fileIterator_FileIteratorBuilder0.includeHiddenFiles(true);
      FileIterator fileIterator1 = fileIterator_FileIteratorBuilder0.build();
      fileIterator1.getNextFile();
      Consumer<File> consumer0 = (Consumer<File>) mock(Consumer.class, new ViolatedAssumptionAnswer());
      FileIterator fileIterator2 = fileIterator_FileIteratorBuilder1.build();
      fileIterator2.forEach(consumer0);
      FileIterator.createNonRecursiveFileIteratorBuilder(mockFile0);
      MockFile mockFile1 = new MockFile("F)");
      fileIterator0.updateFileIterator(mockFile1);
      fileIterator_FileIteratorBuilder0.includeHiddenFiles(true);
      FileIterator fileIterator3 = fileIterator_FileIteratorBuilder2.build();
      fileIterator2.updateFileIterator(mockFile0);
      fileIterator2.setUpInitialState(mockFile1);
      fileIterator3.next();
      LinkedList<FileFilter> linkedList0 = new LinkedList<FileFilter>();
      fileIterator_FileIteratorBuilder2.build();
      fileIterator_FileIteratorBuilder1.build();
      // Undeclared exception!
      try { 
        fileIterator1.remove();
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // can not remove
         //
         verifyException("org.jcvi.jillion.core.util.FileIterator", e);
      }
  }

  /**
  //Test case number: 3
  /*Coverage entropy=3.5679563920319937
  */
  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      String string0 = "";
      MockFile mockFile0 = new MockFile("", "");
      mockFile0.setReadOnly();
      FileIterator.FileIteratorBuilder fileIterator_FileIteratorBuilder0 = FileIterator.createBreadthFirstFileIteratorBuilder(mockFile0);
      fileIterator_FileIteratorBuilder0.includeHiddenFiles(false);
      String string1 = "%?D&sXG";
      File file0 = MockFile.createTempFile("%?D&sXG", "", (File) mockFile0);
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
  //Test case number: 4
  /*Coverage entropy=3.7534402827234463
  */
  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      MockFile mockFile0 = new MockFile("3lUD..`'WlUk>ZB(iW", "3lUD..`'WlUk>ZB(iW");
      MockFile mockFile1 = new MockFile(mockFile0, "");
      FileIterator.FileIteratorBuilder fileIterator_FileIteratorBuilder0 = FileIterator.createBreadthFirstFileIteratorBuilder(mockFile1);
      File file0 = MockFile.createTempFile("3lUD..`'WlUk>ZB(iW", "V62{]`m5^_TB", (File) mockFile0);
      FileIterator.FileIteratorBuilder fileIterator_FileIteratorBuilder1 = fileIterator_FileIteratorBuilder0.includeDirectories(true);
      FileIterator fileIterator0 = fileIterator_FileIteratorBuilder1.build();
      fileIterator0.iterator();
      FileIterator.FileIteratorBuilder fileIterator_FileIteratorBuilder2 = fileIterator_FileIteratorBuilder1.includeDirectories(false);
      fileIterator_FileIteratorBuilder2.includeHiddenFiles(true);
      FileIterator fileIterator1 = fileIterator_FileIteratorBuilder0.build();
      fileIterator0.getNextFile();
      Consumer<File> consumer0 = (Consumer<File>) mock(Consumer.class, new ViolatedAssumptionAnswer());
      fileIterator0.forEach(consumer0);
      FileIterator.createNonRecursiveFileIteratorBuilder(file0);
      MockFile mockFile2 = new MockFile("V62{]`m5^_TB");
      fileIterator1.updateFileIterator(mockFile0);
      FileIterator.createDepthFirstFileIteratorBuilder(mockFile1);
      FileIterator fileIterator2 = fileIterator_FileIteratorBuilder0.build();
      FileIterator fileIterator3 = fileIterator_FileIteratorBuilder1.build();
      Consumer<File> consumer1 = (Consumer<File>) mock(Consumer.class, new ViolatedAssumptionAnswer());
      fileIterator0.forEach(consumer1);
      fileIterator2.getNextFile();
      fileIterator3.next();
      fileIterator2.updateFileIterator(mockFile0);
      // Undeclared exception!
      try { 
        fileIterator2.setUpInitialState((File) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jcvi.jillion.core.util.FileIterator$RecursiveFileIterator", e);
      }
  }

  /**
  //Test case number: 5
  /*Coverage entropy=3.7105859377372097
  */
  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      MockFile mockFile0 = new MockFile("", "");
      FileIterator.FileIteratorBuilder fileIterator_FileIteratorBuilder0 = FileIterator.createDepthFirstFileIteratorBuilder(mockFile0);
      mockFile0.getCanonicalPath();
      fileIterator_FileIteratorBuilder0.includeDirectories(true);
      FileIterator fileIterator0 = fileIterator_FileIteratorBuilder0.build();
      fileIterator0.iterator();
      fileIterator_FileIteratorBuilder0.includeDirectories(true);
      fileIterator_FileIteratorBuilder0.includeHiddenFiles(true);
      FileIterator fileIterator1 = fileIterator_FileIteratorBuilder0.build();
      File file0 = fileIterator1.getNextFile();
      Consumer<Object> consumer0 = (Consumer<Object>) mock(Consumer.class, new ViolatedAssumptionAnswer());
      fileIterator1.forEach(consumer0);
      FileIterator.createNonRecursiveFileIteratorBuilder(mockFile0);
      fileIterator1.updateFileIterator(mockFile0);
      assertTrue(fileIterator1.hasNext());
      
      FileIterator.createDepthFirstFileIteratorBuilder(mockFile0);
      FileIterator fileIterator2 = fileIterator_FileIteratorBuilder0.build();
      fileIterator0.updateFileIterator(mockFile0);
      fileIterator1.setUpInitialState(file0);
      fileIterator2.next();
      fileIterator1.getNextFile();
      MockFile mockFile1 = new MockFile("");
      Consumer<Object> consumer1 = (Consumer<Object>) mock(Consumer.class, new ViolatedAssumptionAnswer());
      fileIterator2.forEach(consumer1);
      fileIterator0.iterator();
      assertTrue(fileIterator0.hasNext());
  }

  /**
  //Test case number: 6
  /*Coverage entropy=3.6368080500283226
  */
  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      MockFile mockFile0 = new MockFile("", "");
      FileIterator.FileIteratorBuilder fileIterator_FileIteratorBuilder0 = FileIterator.createDepthFirstFileIteratorBuilder(mockFile0);
      mockFile0.getCanonicalPath();
      fileIterator_FileIteratorBuilder0.includeDirectories(true);
      FileIterator fileIterator0 = fileIterator_FileIteratorBuilder0.build();
      fileIterator0.iterator();
      fileIterator_FileIteratorBuilder0.includeDirectories(true);
      fileIterator_FileIteratorBuilder0.includeHiddenFiles(true);
      FileIterator fileIterator1 = fileIterator_FileIteratorBuilder0.build();
      File file0 = fileIterator1.getNextFile();
      Consumer<Object> consumer0 = (Consumer<Object>) mock(Consumer.class, new ViolatedAssumptionAnswer());
      fileIterator1.forEach(consumer0);
      fileIterator1.updateFileIterator(mockFile0);
      assertTrue(fileIterator1.hasNext());
      
      FileIterator.createDepthFirstFileIteratorBuilder(mockFile0);
      FileIterator fileIterator2 = fileIterator_FileIteratorBuilder0.build();
      fileIterator0.updateFileIterator(mockFile0);
      fileIterator1.setUpInitialState(file0);
      Consumer<File> consumer1 = (Consumer<File>) mock(Consumer.class, new ViolatedAssumptionAnswer());
      fileIterator2.forEach(consumer1);
      fileIterator1.iterator();
      assertFalse(fileIterator1.hasNext());
      
      fileIterator0.iterator();
      boolean boolean0 = fileIterator2.hasNext();
      assertTrue(boolean0);
  }

  /**
  //Test case number: 7
  /*Coverage entropy=3.5666519431762023
  */
  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      MockFile mockFile0 = new MockFile("");
      FileIterator.FileIteratorBuilder fileIterator_FileIteratorBuilder0 = FileIterator.createDepthFirstFileIteratorBuilder(mockFile0);
      mockFile0.getCanonicalPath();
      FileIterator fileIterator0 = fileIterator_FileIteratorBuilder0.build();
      fileIterator0.iterator();
      FileIterator.createDepthFirstFileIteratorBuilder(mockFile0);
      FileIterator.FileIteratorBuilder fileIterator_FileIteratorBuilder1 = fileIterator_FileIteratorBuilder0.includeHiddenFiles(true);
      FileIterator fileIterator1 = fileIterator_FileIteratorBuilder0.build();
      fileIterator1.getNextFile();
      Consumer<File> consumer0 = (Consumer<File>) mock(Consumer.class, new ViolatedAssumptionAnswer());
      fileIterator1.iterator();
      fileIterator1.forEach(consumer0);
      FileIterator.createNonRecursiveFileIteratorBuilder(mockFile0);
      fileIterator1.updateFileIterator(mockFile0);
      fileIterator_FileIteratorBuilder1.includeDirectories(false);
      fileIterator1.iterator();
      fileIterator1.hasNext();
      fileIterator0.iterator();
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
  //Test case number: 8
  /*Coverage entropy=3.6945686326063223
  */
  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      MockFile mockFile0 = new MockFile("", "");
      FileIterator.FileIteratorBuilder fileIterator_FileIteratorBuilder0 = FileIterator.createDepthFirstFileIteratorBuilder(mockFile0);
      mockFile0.getCanonicalPath();
      mockFile0.getCanonicalPath();
      FileIterator.FileIteratorBuilder fileIterator_FileIteratorBuilder1 = fileIterator_FileIteratorBuilder0.includeDirectories(true);
      FileIterator fileIterator0 = fileIterator_FileIteratorBuilder1.build();
      fileIterator0.iterator();
      FileIterator.FileIteratorBuilder fileIterator_FileIteratorBuilder2 = fileIterator_FileIteratorBuilder1.includeDirectories(true);
      fileIterator_FileIteratorBuilder2.includeHiddenFiles(true);
      FileIterator fileIterator1 = fileIterator_FileIteratorBuilder0.build();
      File file0 = fileIterator0.getNextFile();
      Consumer<File> consumer0 = (Consumer<File>) mock(Consumer.class, new ViolatedAssumptionAnswer());
      fileIterator0.getNextFile();
      fileIterator1.forEach(consumer0);
      MockFile mockFile1 = new MockFile("/");
      FileIterator.createNonRecursiveFileIteratorBuilder(mockFile1);
      FileIterator.FileIteratorBuilder fileIterator_FileIteratorBuilder3 = fileIterator_FileIteratorBuilder1.includeDirectories(false);
      FileIterator fileIterator2 = fileIterator_FileIteratorBuilder3.build();
      fileIterator2.updateFileIterator(mockFile0);
      fileIterator_FileIteratorBuilder0.includeDirectories(false);
      FileIterator.FileIteratorBuilder fileIterator_FileIteratorBuilder4 = FileIterator.createDepthFirstFileIteratorBuilder(file0);
      FileIterator fileIterator3 = fileIterator_FileIteratorBuilder3.build();
      fileIterator3.updateFileIterator(mockFile0);
      fileIterator0.setUpInitialState(mockFile0);
      fileIterator_FileIteratorBuilder4.build();
      MockFile mockFile2 = new MockFile("vVJS)+3&}2wpbFF[|");
      MockFile.createTempFile("K=_M:jaq%j#oZkzjeh{", (String) null, (File) mockFile1);
      MockFile mockFile3 = null;
      try {
        mockFile3 = new MockFile((URI) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.io.File", e);
      }
  }

  /**
  //Test case number: 9
  /*Coverage entropy=3.5692732217552914
  */
  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      MockFile mockFile0 = new MockFile("", "");
      mockFile0.setReadOnly();
      FileIterator.FileIteratorBuilder fileIterator_FileIteratorBuilder0 = FileIterator.createBreadthFirstFileIteratorBuilder(mockFile0);
      FileIterator.createDepthFirstFileIteratorBuilder(mockFile0);
      FileIterator fileIterator0 = fileIterator_FileIteratorBuilder0.build();
      Consumer<Object> consumer0 = (Consumer<Object>) mock(Consumer.class, new ViolatedAssumptionAnswer());
      fileIterator0.forEachRemaining(consumer0);
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
  //Test case number: 10
  /*Coverage entropy=3.634620391693256
  */
  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      MockFile mockFile0 = new MockFile("", "");
      mockFile0.setReadOnly();
      MockFile mockFile1 = new MockFile("$ocS\"t5PH");
      mockFile1.renameTo(mockFile0);
      FileSystemHandling.setPermissions((EvoSuiteFile) null, true, false, false);
      FileIterator.FileIteratorBuilder fileIterator_FileIteratorBuilder0 = FileIterator.createBreadthFirstFileIteratorBuilder(mockFile0);
      LinkedList<FileFilter> linkedList0 = new LinkedList<FileFilter>();
      MultipleFileFilter multipleFileFilter0 = new MultipleFileFilter(linkedList0);
      FileIterator.FileIteratorBuilder fileIterator_FileIteratorBuilder1 = fileIterator_FileIteratorBuilder0.fileFilter(multipleFileFilter0);
      fileIterator_FileIteratorBuilder1.includeDirectories(true);
      FileIterator fileIterator0 = fileIterator_FileIteratorBuilder1.build();
      fileIterator0.iterator();
      FileIterator.FileIteratorBuilder fileIterator_FileIteratorBuilder2 = FileIterator.createNonRecursiveFileIteratorBuilder(mockFile1);
      assertFalse(fileIterator_FileIteratorBuilder2.equals((Object)fileIterator_FileIteratorBuilder0));
  }

  /**
  //Test case number: 11
  /*Coverage entropy=3.999291886608688
  */
  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      MockFile mockFile0 = new MockFile("", "");
      FileIterator.FileIteratorBuilder fileIterator_FileIteratorBuilder0 = FileIterator.createDepthFirstFileIteratorBuilder(mockFile0);
      mockFile0.getCanonicalPath();
      fileIterator_FileIteratorBuilder0.includeDirectories(true);
      FileIterator fileIterator0 = fileIterator_FileIteratorBuilder0.build();
      fileIterator0.iterator();
      fileIterator_FileIteratorBuilder0.includeDirectories(true);
      FileIterator.FileIteratorBuilder fileIterator_FileIteratorBuilder1 = fileIterator_FileIteratorBuilder0.includeHiddenFiles(true);
      FileIterator fileIterator1 = fileIterator_FileIteratorBuilder0.build();
      File file0 = fileIterator1.getNextFile();
      Consumer<File> consumer0 = (Consumer<File>) mock(Consumer.class, new ViolatedAssumptionAnswer());
      FileIterator fileIterator2 = fileIterator_FileIteratorBuilder0.build();
      fileIterator2.forEach(consumer0);
      FileIterator.FileIteratorBuilder fileIterator_FileIteratorBuilder2 = FileIterator.createNonRecursiveFileIteratorBuilder(mockFile0);
      File file1 = fileIterator0.next();
      fileIterator2.updateFileIterator(file1);
      fileIterator_FileIteratorBuilder0.includeHiddenFiles(true);
      FileIterator.FileIteratorBuilder fileIterator_FileIteratorBuilder3 = FileIterator.createBreadthFirstFileIteratorBuilder(mockFile0);
      FileIterator fileIterator3 = fileIterator_FileIteratorBuilder3.build();
      fileIterator3.iterator();
      fileIterator0.updateFileIterator(file0);
      fileIterator2.setUpInitialState(file0);
      fileIterator1.next();
      LinkedList<FileFilter> linkedList0 = new LinkedList<FileFilter>();
      fileIterator2.iterator();
      MultipleFileFilter multipleFileFilter0 = new MultipleFileFilter(linkedList0);
      fileIterator_FileIteratorBuilder1.build();
      FileIterator fileIterator4 = fileIterator_FileIteratorBuilder2.build();
      // Undeclared exception!
      try { 
        fileIterator4.remove();
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // can not remove
         //
         verifyException("org.jcvi.jillion.core.util.FileIterator", e);
      }
  }

  /**
  //Test case number: 12
  /*Coverage entropy=3.545207295362354
  */
  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("3l\\UD..`'WlUk>ZB(iW/3l\\UD..`'WlUk>ZB(iW/3l\\UD..`'WlUk>ZB(iW0V62{]`m5^_TB");
      FileSystemHandling.setPermissions(evoSuiteFile0, true, true, true);
      MockFile mockFile0 = new MockFile("3lUD..`'WlUk>ZB(iW", "3lUD..`'WlUk>ZB(iW");
      MockFile mockFile1 = new MockFile(mockFile0, "");
      FileIterator.FileIteratorBuilder fileIterator_FileIteratorBuilder0 = FileIterator.createBreadthFirstFileIteratorBuilder(mockFile1);
      MockFile.createTempFile("3lUD..`'WlUk>ZB(iW", "V62{]`m5^_TB", (File) mockFile0);
      mockFile0.toURI();
      FileIterator fileIterator0 = fileIterator_FileIteratorBuilder0.build();
      fileIterator0.iterator();
      FileIterator.FileIteratorBuilder fileIterator_FileIteratorBuilder1 = FileIterator.createDepthFirstFileIteratorBuilder(mockFile1);
      assertFalse(fileIterator_FileIteratorBuilder1.equals((Object)fileIterator_FileIteratorBuilder0));
  }

  /**
  //Test case number: 13
  /*Coverage entropy=3.336079193021304
  */
  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      MockFile mockFile0 = new MockFile("3lUD..`'WlUk>ZB(iW", "3lUD..`'WlUk>ZB(iW");
      MockFile mockFile1 = new MockFile(mockFile0, "");
      FileIterator.FileIteratorBuilder fileIterator_FileIteratorBuilder0 = FileIterator.createBreadthFirstFileIteratorBuilder(mockFile1);
      fileIterator_FileIteratorBuilder0.includeHiddenFiles(true);
      MockFile.createTempFile("3lUD..`'WlUk>ZB(iW", "V62{]`m5^_TB", (File) mockFile0);
      fileIterator_FileIteratorBuilder0.build();
      FileFilter[] fileFilterArray0 = new FileFilter[4];
      MultipleFileFilter multipleFileFilter0 = new MultipleFileFilter(fileFilterArray0);
      fileFilterArray0[0] = (FileFilter) multipleFileFilter0;
      MultipleFileFilter multipleFileFilter1 = new MultipleFileFilter(fileFilterArray0);
      fileFilterArray0[1] = (FileFilter) multipleFileFilter1;
      FileFilter[] fileFilterArray1 = null;
      FileFilter[] fileFilterArray2 = null;
      MultipleFileFilter multipleFileFilter2 = null;
      try {
        multipleFileFilter2 = new MultipleFileFilter((FileFilter[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.Objects", e);
      }
  }

  /**
  //Test case number: 14
  /*Coverage entropy=2.1290003949677563
  */
  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
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
  //Test case number: 15
  /*Coverage entropy=3.507433243367654
  */
  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      MockFile mockFile0 = new MockFile("");
      FileIterator.FileIteratorBuilder fileIterator_FileIteratorBuilder0 = FileIterator.createDepthFirstFileIteratorBuilder(mockFile0);
      mockFile0.getCanonicalPath();
      boolean boolean0 = true;
      fileIterator_FileIteratorBuilder0.includeDirectories(true);
      FileIterator fileIterator0 = fileIterator_FileIteratorBuilder0.build();
      fileIterator0.iterator();
      FileIterator.createDepthFirstFileIteratorBuilder(mockFile0);
      fileIterator_FileIteratorBuilder0.includeHiddenFiles(true);
      FileIterator fileIterator1 = fileIterator_FileIteratorBuilder0.build();
      fileIterator1.getNextFile();
      Consumer<File> consumer0 = (Consumer<File>) mock(Consumer.class, new ViolatedAssumptionAnswer());
      fileIterator1.forEach(consumer0);
      FileIterator.FileIteratorBuilder fileIterator_FileIteratorBuilder1 = FileIterator.createNonRecursiveFileIteratorBuilder((File) null);
      fileIterator1.updateFileIterator(mockFile0);
      FileIterator.createDepthFirstFileIteratorBuilder((File) null);
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
  //Test case number: 16
  /*Coverage entropy=3.6755532362200234
  */
  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      MockFile mockFile0 = new MockFile("", "");
      FileIterator.FileIteratorBuilder fileIterator_FileIteratorBuilder0 = FileIterator.createDepthFirstFileIteratorBuilder(mockFile0);
      mockFile0.getCanonicalPath();
      FileIterator.FileIteratorBuilder fileIterator_FileIteratorBuilder1 = fileIterator_FileIteratorBuilder0.includeDirectories(true);
      FileIterator.FileIteratorBuilder fileIterator_FileIteratorBuilder2 = fileIterator_FileIteratorBuilder1.includeDirectories(true);
      fileIterator_FileIteratorBuilder2.includeHiddenFiles(true);
      FileIterator fileIterator0 = fileIterator_FileIteratorBuilder0.build();
      Consumer<File> consumer0 = (Consumer<File>) mock(Consumer.class, new ViolatedAssumptionAnswer());
      fileIterator0.forEach(consumer0);
      FileFilter[] fileFilterArray0 = new FileFilter[1];
      LinkedList<FileFilter> linkedList0 = new LinkedList<FileFilter>();
      MultipleFileFilter multipleFileFilter0 = new MultipleFileFilter(linkedList0);
      fileFilterArray0[0] = (FileFilter) multipleFileFilter0;
      MultipleFileFilter multipleFileFilter1 = new MultipleFileFilter(fileFilterArray0);
      MultipleFileFilter multipleFileFilter2 = new MultipleFileFilter(linkedList0);
      MultipleFileFilter multipleFileFilter3 = new MultipleFileFilter(linkedList0);
      MultipleFileFilter multipleFileFilter4 = new MultipleFileFilter(linkedList0);
      LinkedList<FileFilter> linkedList1 = new LinkedList<FileFilter>();
      MultipleFileFilter multipleFileFilter5 = new MultipleFileFilter(linkedList1);
      MultipleFileFilter multipleFileFilter6 = new MultipleFileFilter(fileFilterArray0);
      MultipleFileFilter multipleFileFilter7 = new MultipleFileFilter(fileFilterArray0);
      MultipleFileFilter multipleFileFilter8 = new MultipleFileFilter(fileFilterArray0);
      FileIterator.FileIteratorBuilder fileIterator_FileIteratorBuilder3 = fileIterator_FileIteratorBuilder0.fileFilter(multipleFileFilter1);
      assertSame(fileIterator_FileIteratorBuilder0, fileIterator_FileIteratorBuilder3);
  }

  /**
  //Test case number: 17
  /*Coverage entropy=3.985823540920141
  */
  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      MockFile mockFile0 = new MockFile("", "");
      FileIterator.FileIteratorBuilder fileIterator_FileIteratorBuilder0 = FileIterator.createDepthFirstFileIteratorBuilder(mockFile0);
      mockFile0.getCanonicalPath();
      mockFile0.getCanonicalPath();
      FileIterator.FileIteratorBuilder fileIterator_FileIteratorBuilder1 = FileIterator.createBreadthFirstFileIteratorBuilder(mockFile0);
      fileIterator_FileIteratorBuilder1.includeDirectories(true);
      FileIterator fileIterator0 = fileIterator_FileIteratorBuilder0.build();
      fileIterator0.iterator();
      FileIterator.FileIteratorBuilder fileIterator_FileIteratorBuilder2 = fileIterator_FileIteratorBuilder1.includeDirectories(true);
      FileIterator.FileIteratorBuilder fileIterator_FileIteratorBuilder3 = FileIterator.createNonRecursiveFileIteratorBuilder(mockFile0);
      fileIterator_FileIteratorBuilder3.includeHiddenFiles(true);
      FileIterator fileIterator1 = fileIterator_FileIteratorBuilder2.build();
      fileIterator0.getNextFile();
      Consumer<File> consumer0 = (Consumer<File>) mock(Consumer.class, new ViolatedAssumptionAnswer());
      fileIterator1.forEach(consumer0);
      FileIterator.FileIteratorBuilder fileIterator_FileIteratorBuilder4 = FileIterator.createNonRecursiveFileIteratorBuilder(mockFile0);
      fileIterator1.updateFileIterator(mockFile0);
      fileIterator_FileIteratorBuilder0.includeDirectories(true);
      FileIterator.createDepthFirstFileIteratorBuilder((File) null);
      FileIterator fileIterator2 = fileIterator_FileIteratorBuilder4.build();
      fileIterator2.updateFileIterator(mockFile0);
      // Undeclared exception!
      try { 
        fileIterator1.setUpInitialState((File) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jcvi.jillion.core.util.FileIterator$RecursiveFileIterator", e);
      }
  }

  /**
  //Test case number: 18
  /*Coverage entropy=3.7306167664984455
  */
  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      MockFile mockFile0 = new MockFile("", "");
      MockFile mockFile1 = new MockFile(mockFile0, "");
      FileIterator.FileIteratorBuilder fileIterator_FileIteratorBuilder0 = FileIterator.createDepthFirstFileIteratorBuilder(mockFile1);
      mockFile0.getCanonicalPath();
      fileIterator_FileIteratorBuilder0.includeDirectories(true);
      FileIterator.FileIteratorBuilder fileIterator_FileIteratorBuilder1 = FileIterator.createBreadthFirstFileIteratorBuilder(mockFile1);
      FileIterator fileIterator0 = fileIterator_FileIteratorBuilder1.build();
      fileIterator0.iterator();
      FileIterator.FileIteratorBuilder fileIterator_FileIteratorBuilder2 = fileIterator_FileIteratorBuilder0.includeDirectories(true);
      fileIterator_FileIteratorBuilder2.includeDirectories(true);
      fileIterator_FileIteratorBuilder2.includeDirectories(true);
      FileIterator fileIterator1 = fileIterator_FileIteratorBuilder1.build();
      fileIterator1.getNextFile();
      Consumer<Object> consumer0 = (Consumer<Object>) mock(Consumer.class, new ViolatedAssumptionAnswer());
      fileIterator0.forEach(consumer0);
      FileIterator.createNonRecursiveFileIteratorBuilder(mockFile0);
      // Undeclared exception!
      try { 
        fileIterator1.updateFileIterator((File) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  /**
  //Test case number: 19
  /*Coverage entropy=2.1290003949677563
  */
  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      File file0 = null;
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
  //Test case number: 20
  /*Coverage entropy=2.3010386369482903
  */
  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      MockFile mockFile0 = new MockFile("Y9ASd{", "Y9ASd{");
      FileIterator.FileIteratorBuilder fileIterator_FileIteratorBuilder0 = FileIterator.createDepthFirstFileIteratorBuilder(mockFile0);
      mockFile0.getCanonicalPath();
      mockFile0.getCanonicalPath();
      FileIterator.FileIteratorBuilder fileIterator_FileIteratorBuilder1 = fileIterator_FileIteratorBuilder0.includeDirectories(true);
      // Undeclared exception!
      try { 
        fileIterator_FileIteratorBuilder1.build();
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // rootDir must be a directory
         //
         verifyException("org.jcvi.jillion.core.util.FileIterator", e);
      }
  }
}
