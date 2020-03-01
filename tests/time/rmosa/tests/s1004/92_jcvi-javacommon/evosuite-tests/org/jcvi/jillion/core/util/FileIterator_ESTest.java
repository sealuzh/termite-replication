/*
 * This file was automatically generated by EvoSuite
 * Thu Dec 05 19:13:21 GMT 2019
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
  /*Coverage entropy=3.4255215723825687
  */
  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      MockFile mockFile0 = new MockFile("v@ Y-+>", "v@ Y-+>");
      MockFile.createTempFile("v@ Y-+>", "v@ Y-+>", (File) mockFile0);
      MockFile mockFile1 = new MockFile("v@ Y-+>");
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("v@ Y-+>/v@ Y-+>/v@ Y-+>0v@ Y-+>");
      FileSystemHandling.appendLineToFile(evoSuiteFile0, "kR0crdJ*");
      FileIterator.FileIteratorBuilder fileIterator_FileIteratorBuilder0 = FileIterator.createBreadthFirstFileIteratorBuilder(mockFile1);
      FileIterator fileIterator0 = fileIterator_FileIteratorBuilder0.build();
      assertTrue(fileIterator0.hasNext());
      
      fileIterator0.next();
      assertFalse(fileIterator0.hasNext());
  }

  /**
  //Test case number: 1
  /*Coverage entropy=3.5900715795719065
  */
  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      MockFile mockFile0 = new MockFile("", "");
      FileIterator.FileIteratorBuilder fileIterator_FileIteratorBuilder0 = FileIterator.createNonRecursiveFileIteratorBuilder(mockFile0);
      FileIterator fileIterator0 = fileIterator_FileIteratorBuilder0.build();
      MockFile mockFile1 = new MockFile("", "j~P5FY1");
      MockFile mockFile2 = new MockFile("", "");
      mockFile2.setExecutable(false);
      FileIterator.FileIteratorBuilder fileIterator_FileIteratorBuilder1 = FileIterator.createDepthFirstFileIteratorBuilder(mockFile2);
      FileIterator fileIterator1 = fileIterator_FileIteratorBuilder0.build();
      fileIterator_FileIteratorBuilder0.includeDirectories(false);
      fileIterator0.updateFileIterator(mockFile1);
      FileIterator.FileIteratorBuilder fileIterator_FileIteratorBuilder2 = FileIterator.createBreadthFirstFileIteratorBuilder(mockFile0);
      fileIterator_FileIteratorBuilder0.includeDirectories(true);
      FileIterator.FileIteratorBuilder fileIterator_FileIteratorBuilder3 = fileIterator_FileIteratorBuilder0.includeDirectories(true);
      LinkedList<FileFilter> linkedList0 = new LinkedList<FileFilter>();
      MultipleFileFilter multipleFileFilter0 = new MultipleFileFilter(linkedList0);
      fileIterator_FileIteratorBuilder1.includeDirectories(true);
      fileIterator_FileIteratorBuilder3.build();
      FileIterator.FileIteratorBuilder fileIterator_FileIteratorBuilder4 = FileIterator.createNonRecursiveFileIteratorBuilder(mockFile2);
      FileIterator fileIterator2 = fileIterator_FileIteratorBuilder2.build();
      fileIterator2.setUpInitialState(mockFile1);
      fileIterator_FileIteratorBuilder4.build();
      fileIterator1.iterator();
      FileIterator fileIterator3 = fileIterator_FileIteratorBuilder0.build();
      fileIterator3.setUpInitialState(mockFile0);
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("/home");
      FileSystemHandling.setPermissions(evoSuiteFile0, true, true, false);
      FileIterator fileIterator4 = fileIterator_FileIteratorBuilder0.build();
      File file0 = fileIterator4.next();
      FileIterator.FileIteratorBuilder fileIterator_FileIteratorBuilder5 = FileIterator.createNonRecursiveFileIteratorBuilder(file0);
      fileIterator_FileIteratorBuilder2.build();
      FileIterator.createBreadthFirstFileIteratorBuilder(mockFile2);
      FileIterator.FileIteratorBuilder fileIterator_FileIteratorBuilder6 = FileIterator.createNonRecursiveFileIteratorBuilder(mockFile1);
      assertFalse(fileIterator_FileIteratorBuilder6.equals((Object)fileIterator_FileIteratorBuilder5));
  }

  /**
  //Test case number: 2
  /*Coverage entropy=3.1352405357221285
  */
  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      MockFile mockFile0 = new MockFile("'v@GY-+k", "'v@GY-+k");
      MockFile.createTempFile("'v@GY-+k", "'v@GY-+k", (File) mockFile0);
      FileIterator.FileIteratorBuilder fileIterator_FileIteratorBuilder0 = FileIterator.createDepthFirstFileIteratorBuilder(mockFile0);
      FileIterator.FileIteratorBuilder fileIterator_FileIteratorBuilder1 = fileIterator_FileIteratorBuilder0.includeDirectories(false);
      fileIterator_FileIteratorBuilder1.includeHiddenFiles(false);
      fileIterator_FileIteratorBuilder0.build();
      File file0 = MockFile.createTempFile("VC5_2o$%kU7TdLU1", "VC5_2o$%kU7TdLU1");
      FileIterator fileIterator0 = fileIterator_FileIteratorBuilder1.build();
      fileIterator0.setUpInitialState(file0);
      fileIterator_FileIteratorBuilder1.includeDirectories(false);
      LinkedList<FileFilter> linkedList0 = new LinkedList<FileFilter>();
      MultipleFileFilter multipleFileFilter0 = new MultipleFileFilter(linkedList0);
      fileIterator_FileIteratorBuilder0.fileFilter(multipleFileFilter0);
      FileIterator.FileIteratorBuilder fileIterator_FileIteratorBuilder2 = fileIterator_FileIteratorBuilder0.includeDirectories(false);
      FileIterator fileIterator1 = fileIterator_FileIteratorBuilder2.build();
      assertFalse(fileIterator1.equals((Object)fileIterator0));
  }

  /**
  //Test case number: 3
  /*Coverage entropy=3.2672123781537596
  */
  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      MockFile mockFile0 = new MockFile("'v@ Y-+k", "'v@ Y-+k");
      MockFile.createTempFile("'v@ Y-+k", "'v@ Y-+k", (File) mockFile0);
      MockFile mockFile1 = new MockFile("'v@ Y-+k");
      FileIterator.FileIteratorBuilder fileIterator_FileIteratorBuilder0 = FileIterator.createBreadthFirstFileIteratorBuilder(mockFile1);
      FileIterator fileIterator0 = fileIterator_FileIteratorBuilder0.build();
      fileIterator0.updateFileIterator(mockFile0);
      FileIterator.FileIteratorBuilder fileIterator_FileIteratorBuilder1 = FileIterator.createNonRecursiveFileIteratorBuilder(mockFile0);
      MockFile mockFile2 = new MockFile(":Lg~}.K&i6]uS");
      FileIterator.createBreadthFirstFileIteratorBuilder(mockFile2);
      FileIterator.createDepthFirstFileIteratorBuilder(mockFile2);
      fileIterator0.getNextFile();
      FileIterator.FileIteratorBuilder fileIterator_FileIteratorBuilder2 = FileIterator.createBreadthFirstFileIteratorBuilder(mockFile1);
      assertFalse(fileIterator_FileIteratorBuilder2.equals((Object)fileIterator_FileIteratorBuilder1));
  }

  /**
  //Test case number: 4
  /*Coverage entropy=2.8876911911657177
  */
  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      MockFile mockFile0 = new MockFile("", "");
      MockFile mockFile1 = new MockFile("j!z", "j!z");
      FileIterator.FileIteratorBuilder fileIterator_FileIteratorBuilder0 = FileIterator.createNonRecursiveFileIteratorBuilder(mockFile0);
      FileIterator.createNonRecursiveFileIteratorBuilder(mockFile0);
      FileIterator fileIterator0 = fileIterator_FileIteratorBuilder0.build();
      MockFile mockFile2 = new MockFile("j!z");
      MockFile mockFile3 = new MockFile("", "j!z");
      mockFile1.setExecutable(false);
      FileIterator.createDepthFirstFileIteratorBuilder(mockFile2);
      FileIterator.createBreadthFirstFileIteratorBuilder(mockFile2);
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
  //Test case number: 5
  /*Coverage entropy=2.683711063822706
  */
  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      MockFile mockFile0 = new MockFile("", "");
      FileIterator.FileIteratorBuilder fileIterator_FileIteratorBuilder0 = FileIterator.createNonRecursiveFileIteratorBuilder(mockFile0);
      LinkedList<FileFilter> linkedList0 = new LinkedList<FileFilter>();
      MultipleFileFilter multipleFileFilter0 = new MultipleFileFilter(linkedList0);
      FileIterator.FileIteratorBuilder fileIterator_FileIteratorBuilder1 = fileIterator_FileIteratorBuilder0.includeDirectories(true);
      FileIterator fileIterator0 = fileIterator_FileIteratorBuilder1.build();
      fileIterator0.getNextFile();
      fileIterator_FileIteratorBuilder1.includeDirectories(true);
      File file0 = fileIterator0.getNextFile();
      assertNull(file0);
  }

  /**
  //Test case number: 6
  /*Coverage entropy=3.1327282156912077
  */
  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      MockFile mockFile0 = new MockFile("'v@ Y-+k", "'v@ Y-+k");
      File file0 = MockFile.createTempFile("'v@ Y-+k", "'v@ Y-+k", (File) mockFile0);
      MockFile mockFile1 = new MockFile("'v@ Y-+k");
      FileIterator.FileIteratorBuilder fileIterator_FileIteratorBuilder0 = FileIterator.createBreadthFirstFileIteratorBuilder(mockFile1);
      FileIterator fileIterator0 = fileIterator_FileIteratorBuilder0.build();
      fileIterator0.setUpInitialState(file0);
      fileIterator_FileIteratorBuilder0.includeDirectories(true);
      FileFilter[] fileFilterArray0 = new FileFilter[7];
      LinkedList<FileFilter> linkedList0 = new LinkedList<FileFilter>();
      MultipleFileFilter multipleFileFilter0 = new MultipleFileFilter(linkedList0);
      fileFilterArray0[0] = (FileFilter) multipleFileFilter0;
      MultipleFileFilter multipleFileFilter1 = new MultipleFileFilter(linkedList0);
      fileFilterArray0[1] = (FileFilter) multipleFileFilter1;
      LinkedList<FileFilter> linkedList1 = new LinkedList<FileFilter>();
      MultipleFileFilter multipleFileFilter2 = new MultipleFileFilter(linkedList1);
      fileFilterArray0[2] = (FileFilter) multipleFileFilter2;
      MultipleFileFilter multipleFileFilter3 = new MultipleFileFilter(linkedList0);
      fileFilterArray0[3] = (FileFilter) multipleFileFilter3;
      MultipleFileFilter multipleFileFilter4 = new MultipleFileFilter(linkedList0);
      fileFilterArray0[4] = (FileFilter) multipleFileFilter4;
      LinkedList<FileFilter> linkedList2 = new LinkedList<FileFilter>();
      MultipleFileFilter multipleFileFilter5 = new MultipleFileFilter(linkedList2);
      fileFilterArray0[5] = (FileFilter) multipleFileFilter5;
      MultipleFileFilter multipleFileFilter6 = new MultipleFileFilter(linkedList2);
      fileFilterArray0[6] = (FileFilter) multipleFileFilter6;
      MultipleFileFilter multipleFileFilter7 = new MultipleFileFilter(fileFilterArray0);
      FileIterator.FileIteratorBuilder fileIterator_FileIteratorBuilder1 = fileIterator_FileIteratorBuilder0.fileFilter(multipleFileFilter7);
      assertSame(fileIterator_FileIteratorBuilder0, fileIterator_FileIteratorBuilder1);
  }

  /**
  //Test case number: 7
  /*Coverage entropy=2.885700150847151
  */
  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      MockFile mockFile0 = new MockFile("", "");
      FileIterator.FileIteratorBuilder fileIterator_FileIteratorBuilder0 = FileIterator.createNonRecursiveFileIteratorBuilder(mockFile0);
      fileIterator_FileIteratorBuilder0.includeDirectories(false);
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("/");
      mockFile0.getCanonicalFile();
      fileIterator_FileIteratorBuilder0.includeDirectories(true);
      FileSystemHandling.appendLineToFile(evoSuiteFile0, "");
      fileIterator_FileIteratorBuilder0.includeHiddenFiles(true);
      FileSystemHandling.appendStringToFile(evoSuiteFile0, "qf>Eiu d(~+D:74?7#");
      FileIterator fileIterator0 = fileIterator_FileIteratorBuilder0.build();
      File file0 = fileIterator0.next();
      assertFalse(file0.isFile());
  }

  /**
  //Test case number: 8
  /*Coverage entropy=2.6855966703594754
  */
  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      MockFile mockFile0 = new MockFile("NAu*Tvi|F[opxV:H");
      MockFile.createTempFile("NAu*Tvi|F[opxV:H", "NAu*Tvi|F[opxV:H", (File) mockFile0);
      FileIterator.FileIteratorBuilder fileIterator_FileIteratorBuilder0 = FileIterator.createNonRecursiveFileIteratorBuilder(mockFile0);
      FileIterator fileIterator0 = fileIterator_FileIteratorBuilder0.build();
      Consumer<Object> consumer0 = (Consumer<Object>) mock(Consumer.class, new ViolatedAssumptionAnswer());
      fileIterator0.forEachRemaining(consumer0);
      FileIterator.FileIteratorBuilder fileIterator_FileIteratorBuilder1 = FileIterator.createBreadthFirstFileIteratorBuilder(mockFile0);
      assertFalse(fileIterator_FileIteratorBuilder1.equals((Object)fileIterator_FileIteratorBuilder0));
  }

  /**
  //Test case number: 9
  /*Coverage entropy=3.0547452758288847
  */
  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      MockFile mockFile0 = new MockFile("", "");
      FileIterator.FileIteratorBuilder fileIterator_FileIteratorBuilder0 = FileIterator.createBreadthFirstFileIteratorBuilder(mockFile0);
      FileIterator.FileIteratorBuilder fileIterator_FileIteratorBuilder1 = fileIterator_FileIteratorBuilder0.includeDirectories(true);
      FileIterator fileIterator0 = fileIterator_FileIteratorBuilder1.build();
      boolean boolean0 = fileIterator0.hasNext();
      assertTrue(boolean0);
  }

  /**
  //Test case number: 10
  /*Coverage entropy=2.684404064515707
  */
  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      MockFile mockFile0 = new MockFile("", "");
      FileIterator.FileIteratorBuilder fileIterator_FileIteratorBuilder0 = FileIterator.createNonRecursiveFileIteratorBuilder(mockFile0);
      fileIterator_FileIteratorBuilder0.includeDirectories(false);
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("/");
      mockFile0.getCanonicalFile();
      FileSystemHandling.appendLineToFile(evoSuiteFile0, "");
      fileIterator_FileIteratorBuilder0.includeDirectories(true);
      FileSystemHandling.appendStringToFile(evoSuiteFile0, "qf>Eiu d(~+D:74?7#");
      FileIterator fileIterator0 = fileIterator_FileIteratorBuilder0.build();
      File file0 = fileIterator0.next();
      assertTrue(file0.canExecute());
  }

  /**
  //Test case number: 11
  /*Coverage entropy=2.430758633903798
  */
  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      MockFile mockFile0 = new MockFile("orgjcvi.jillion.core.util.iter.IteratorUtil");
      MockFile.createTempFile("orgjcvi.jillion.core.util.iter.IteratorUtil", "orgjcvi.jillion.core.util.iter.IteratorUtil", (File) mockFile0);
      FileIterator.FileIteratorBuilder fileIterator_FileIteratorBuilder0 = FileIterator.createNonRecursiveFileIteratorBuilder(mockFile0);
      FileIterator fileIterator0 = fileIterator_FileIteratorBuilder0.build();
      File file0 = fileIterator0.next();
      assertFalse(file0.equals((Object)mockFile0));
  }

  /**
  //Test case number: 12
  /*Coverage entropy=2.885074759977858
  */
  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      MockFile mockFile0 = new MockFile("orgjcvi.jillion.core.til.iter.IteratrUtil", "orgjcvi.jillion.core.til.iter.IteratrUtil");
      MockFile.createTempFile("orgjcvi.jillion.core.til.iter.IteratrUtil", "orgjcvi.jillion.core.til.iter.IteratrUtil", (File) mockFile0);
      FileIterator.FileIteratorBuilder fileIterator_FileIteratorBuilder0 = FileIterator.createBreadthFirstFileIteratorBuilder(mockFile0);
      FileIterator fileIterator0 = fileIterator_FileIteratorBuilder0.build();
      assertTrue(fileIterator0.hasNext());
  }

  /**
  //Test case number: 13
  /*Coverage entropy=2.977660272976407
  */
  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      MockFile mockFile0 = new MockFile("");
      FileIterator.FileIteratorBuilder fileIterator_FileIteratorBuilder0 = FileIterator.createDepthFirstFileIteratorBuilder(mockFile0);
      FileIterator fileIterator0 = fileIterator_FileIteratorBuilder0.build();
      fileIterator0.getNextFile();
      Iterator<File> iterator0 = fileIterator0.iterator();
      assertNotNull(iterator0);
  }

  /**
  //Test case number: 14
  /*Coverage entropy=2.4316244347695988
  */
  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      MockFile mockFile0 = new MockFile("");
      FileIterator.FileIteratorBuilder fileIterator_FileIteratorBuilder0 = FileIterator.createNonRecursiveFileIteratorBuilder(mockFile0);
      File file0 = null;
      FileIterator.createNonRecursiveFileIteratorBuilder((File) null);
      FileIterator fileIterator0 = fileIterator_FileIteratorBuilder0.build();
      // Undeclared exception!
      try { 
        fileIterator0.setUpInitialState((File) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jcvi.jillion.core.util.FileIterator", e);
      }
  }

  /**
  //Test case number: 15
  /*Coverage entropy=2.4323966355417994
  */
  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      MockFile mockFile0 = new MockFile("'v@ Y-+k", "'v@ Y-+k");
      File file0 = MockFile.createTempFile("'v@ Y-+k", "'v@ Y-+k", (File) mockFile0);
      FileIterator.FileIteratorBuilder fileIterator_FileIteratorBuilder0 = FileIterator.createNonRecursiveFileIteratorBuilder(mockFile0);
      FileIterator fileIterator0 = fileIterator_FileIteratorBuilder0.build();
      fileIterator0.updateFileIterator(file0);
      FileIterator.createNonRecursiveFileIteratorBuilder(file0);
      // Undeclared exception!
      try { 
        MockFile.createTempFile((String) null, "org.jcvi.jillion.core.util.LIFOQueue");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  /**
  //Test case number: 16
  /*Coverage entropy=2.425910149055313
  */
  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      MockFile mockFile0 = new MockFile("");
      FileIterator.FileIteratorBuilder fileIterator_FileIteratorBuilder0 = FileIterator.createNonRecursiveFileIteratorBuilder(mockFile0);
      FileIterator fileIterator0 = fileIterator_FileIteratorBuilder0.build();
      File file0 = fileIterator0.getNextFile();
      assertNull(file0);
  }

  /**
  //Test case number: 17
  /*Coverage entropy=2.7946485850575375
  */
  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      MockFile mockFile0 = new MockFile("", "");
      FileIterator.FileIteratorBuilder fileIterator_FileIteratorBuilder0 = FileIterator.createNonRecursiveFileIteratorBuilder(mockFile0);
      fileIterator_FileIteratorBuilder0.build();
      MockFile mockFile1 = new MockFile("", "");
      MockFile mockFile2 = new MockFile("", "");
      FileIterator.createBreadthFirstFileIteratorBuilder(mockFile1);
      FileIterator.createBreadthFirstFileIteratorBuilder(mockFile2);
      FileIterator.FileIteratorBuilder fileIterator_FileIteratorBuilder1 = fileIterator_FileIteratorBuilder0.includeHiddenFiles(false);
      FileIterator fileIterator0 = fileIterator_FileIteratorBuilder1.build();
      boolean boolean0 = fileIterator0.hasNext();
      assertFalse(boolean0);
  }

  /**
  //Test case number: 18
  /*Coverage entropy=2.0761045791007673
  */
  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      FileIterator.FileIteratorBuilder fileIterator_FileIteratorBuilder0 = FileIterator.createNonRecursiveFileIteratorBuilder((File) null);
      LinkedList<FileFilter> linkedList0 = new LinkedList<FileFilter>();
      MultipleFileFilter multipleFileFilter0 = new MultipleFileFilter(linkedList0);
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
  //Test case number: 19
  /*Coverage entropy=2.4297811167972485
  */
  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      MockFile mockFile0 = new MockFile("");
      FileIterator.FileIteratorBuilder fileIterator_FileIteratorBuilder0 = FileIterator.createNonRecursiveFileIteratorBuilder(mockFile0);
      FileIterator fileIterator0 = fileIterator_FileIteratorBuilder0.build();
      fileIterator0.updateFileIterator(mockFile0);
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
  //Test case number: 20
  /*Coverage entropy=2.0761045791007673
  */
  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      FileIterator.FileIteratorBuilder fileIterator_FileIteratorBuilder0 = FileIterator.createNonRecursiveFileIteratorBuilder((File) null);
      FileIterator.FileIteratorBuilder fileIterator_FileIteratorBuilder1 = fileIterator_FileIteratorBuilder0.includeDirectories(true);
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
  //Test case number: 21
  /*Coverage entropy=2.5594415416798357
  */
  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      MockFile mockFile0 = new MockFile("");
      FileIterator.FileIteratorBuilder fileIterator_FileIteratorBuilder0 = FileIterator.createNonRecursiveFileIteratorBuilder(mockFile0);
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
  //Test case number: 22
  /*Coverage entropy=1.847832822658352
  */
  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
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
  //Test case number: 23
  /*Coverage entropy=2.2623477045221723
  */
  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      URI uRI0 = MockURI.aFileURI;
      MockFile mockFile0 = new MockFile(uRI0);
      FileIterator.FileIteratorBuilder fileIterator_FileIteratorBuilder0 = FileIterator.createNonRecursiveFileIteratorBuilder(mockFile0);
      FileIterator.FileIteratorBuilder fileIterator_FileIteratorBuilder1 = fileIterator_FileIteratorBuilder0.includeHiddenFiles(true);
      FileIterator.FileIteratorBuilder fileIterator_FileIteratorBuilder2 = fileIterator_FileIteratorBuilder1.includeDirectories(true);
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
  //Test case number: 24
  /*Coverage entropy=2.0761045791007673
  */
  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      FileIterator.FileIteratorBuilder fileIterator_FileIteratorBuilder0 = FileIterator.createBreadthFirstFileIteratorBuilder((File) null);
      fileIterator_FileIteratorBuilder0.includeHiddenFiles(true);
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
  /*Coverage entropy=2.5642900265283206
  */
  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      MockFile mockFile0 = new MockFile("zhNmej]x<G", "zhNmej]x<G");
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("zhNmej]x<G/zhNmej]x<G/zhNmej]x<G0zhNmej]x<G");
      byte[] byteArray0 = new byte[3];
      mockFile0.deleteOnExit();
      byteArray0[0] = (byte) (-54);
      byteArray0[1] = (byte) (-24);
      byteArray0[2] = (byte)21;
      FileSystemHandling.appendDataToFile(evoSuiteFile0, byteArray0);
      MockFile.createTempFile("zhNmej]x<G", "zhNmej]x<G", (File) mockFile0);
      FileIterator.FileIteratorBuilder fileIterator_FileIteratorBuilder0 = FileIterator.createNonRecursiveFileIteratorBuilder(mockFile0);
      FileIterator fileIterator0 = fileIterator_FileIteratorBuilder0.build();
      assertTrue(fileIterator0.hasNext());
  }

  /**
  //Test case number: 26
  /*Coverage entropy=2.9769701418514933
  */
  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      MockFile mockFile0 = new MockFile("");
      FileIterator.FileIteratorBuilder fileIterator_FileIteratorBuilder0 = FileIterator.createBreadthFirstFileIteratorBuilder(mockFile0);
      FileIterator fileIterator0 = fileIterator_FileIteratorBuilder0.build();
      Iterator<File> iterator0 = fileIterator0.iterator();
      assertNotNull(iterator0);
  }

  /**
  //Test case number: 27
  /*Coverage entropy=1.847832822658352
  */
  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      MockFile mockFile0 = new MockFile("org.jcvi.jillion.core.util.FileIterator$1", "org.jcvi.jillion.core.util.FileIterator$1");
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
  //Test case number: 28
  /*Coverage entropy=1.847832822658352
  */
  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
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
  //Test case number: 29
  /*Coverage entropy=2.7874335778425303
  */
  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      MockFile mockFile0 = new MockFile("'v@ Y-+k", "'v@ Y-+k");
      MockFile.createTempFile("'v@ Y-+k", "'v@ Y-+k", (File) mockFile0);
      FileIterator.FileIteratorBuilder fileIterator_FileIteratorBuilder0 = FileIterator.createBreadthFirstFileIteratorBuilder(mockFile0);
      FileFilter[] fileFilterArray0 = new FileFilter[1];
      MultipleFileFilter multipleFileFilter0 = new MultipleFileFilter(fileFilterArray0);
      FileIterator.FileIteratorBuilder fileIterator_FileIteratorBuilder1 = fileIterator_FileIteratorBuilder0.fileFilter(multipleFileFilter0);
      boolean boolean0 = false;
      // Undeclared exception!
      try { 
        fileIterator_FileIteratorBuilder1.build();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jcvi.jillion.core.util.MultipleFileFilter", e);
      }
  }

  /**
  //Test case number: 30
  /*Coverage entropy=3.443294814406715
  */
  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      MockFile mockFile0 = new MockFile("", "");
      FileIterator.FileIteratorBuilder fileIterator_FileIteratorBuilder0 = FileIterator.createBreadthFirstFileIteratorBuilder(mockFile0);
      FileIterator.FileIteratorBuilder fileIterator_FileIteratorBuilder1 = fileIterator_FileIteratorBuilder0.includeHiddenFiles(false);
      fileIterator_FileIteratorBuilder1.includeHiddenFiles(false);
      FileIterator.FileIteratorBuilder fileIterator_FileIteratorBuilder2 = fileIterator_FileIteratorBuilder1.includeDirectories(false);
      fileIterator_FileIteratorBuilder2.build();
      FileIterator fileIterator0 = fileIterator_FileIteratorBuilder2.build();
      FileIterator.FileIteratorBuilder fileIterator_FileIteratorBuilder3 = FileIterator.createNonRecursiveFileIteratorBuilder(mockFile0);
      fileIterator0.iterator();
      FileIterator.FileIteratorBuilder fileIterator_FileIteratorBuilder4 = fileIterator_FileIteratorBuilder3.includeDirectories(false);
      assertFalse(fileIterator_FileIteratorBuilder4.equals((Object)fileIterator_FileIteratorBuilder0));
  }
}
