/*
 * This file was automatically generated by EvoSuite
 * Thu Dec 05 18:58:05 GMT 2019
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
  /*Coverage entropy=2.4273916305367944
  */
  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      MockFile mockFile0 = new MockFile("");
      MockFile.createTempFile(".\"%I~g0WNN+", "Q?mBWL", (File) mockFile0);
      FileIterator.FileIteratorBuilder fileIterator_FileIteratorBuilder0 = FileIterator.createNonRecursiveFileIteratorBuilder(mockFile0);
      FileIterator fileIterator0 = fileIterator_FileIteratorBuilder0.build();
      assertFalse(fileIterator0.hasNext());
  }

  /**
  //Test case number: 1
  /*Coverage entropy=3.268523681589375
  */
  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      FileSystemHandling fileSystemHandling0 = new FileSystemHandling();
      MockFile mockFile0 = new MockFile("Z", "Z");
      File file0 = MockFile.createTempFile("Y/B", "Z", (File) mockFile0);
      file0.delete();
      FileIterator.FileIteratorBuilder fileIterator_FileIteratorBuilder0 = FileIterator.createBreadthFirstFileIteratorBuilder(mockFile0);
      FileIterator fileIterator0 = fileIterator_FileIteratorBuilder0.build();
      fileIterator0.setUpInitialState(file0);
      fileIterator0.iterator();
      FileIterator.FileIteratorBuilder fileIterator_FileIteratorBuilder1 = FileIterator.createDepthFirstFileIteratorBuilder(file0);
      assertFalse(fileIterator_FileIteratorBuilder1.equals((Object)fileIterator_FileIteratorBuilder0));
  }

  /**
  //Test case number: 2
  /*Coverage entropy=2.8908530192772437
  */
  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      MockFile mockFile0 = new MockFile("");
      FileIterator.FileIteratorBuilder fileIterator_FileIteratorBuilder0 = FileIterator.createDepthFirstFileIteratorBuilder(mockFile0);
      MockFile mockFile1 = new MockFile("/bE");
      FileIterator fileIterator0 = fileIterator_FileIteratorBuilder0.build();
      fileIterator0.updateFileIterator(mockFile1);
      fileIterator_FileIteratorBuilder0.includeHiddenFiles(false);
      FileIterator fileIterator1 = fileIterator_FileIteratorBuilder0.build();
      boolean boolean0 = fileIterator1.hasNext();
      assertFalse(boolean0);
  }

  /**
  //Test case number: 3
  /*Coverage entropy=2.430758633903798
  */
  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      MockFile mockFile0 = new MockFile("org.jcvn.jillion.core.util.F_leIterator$NonRecursiveFileIteratorBuilder");
      File file0 = MockFile.createTempFile("org.jcvn.jillion.core.util.F_leIterator$NonRecursiveFileIteratorBuilder", "org.jcvn.jillion.core.util.F_leIterator$NonRecursiveFileIteratorBuilder", (File) mockFile0);
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("org.jcvn.jillion.core.util.F_leIterator$NonRecursiveFileIteratorBuilder");
      FileSystemHandling.shouldThrowIOException(evoSuiteFile0);
      byte[] byteArray0 = new byte[4];
      byteArray0[1] = (byte) (-17);
      FileIterator.FileIteratorBuilder fileIterator_FileIteratorBuilder0 = FileIterator.createNonRecursiveFileIteratorBuilder(mockFile0);
      FileIterator fileIterator0 = fileIterator_FileIteratorBuilder0.build();
      fileIterator0.updateFileIterator(file0);
      File file1 = fileIterator0.getNextFile();
      assertNull(file1);
  }

  /**
  //Test case number: 4
  /*Coverage entropy=2.977443963220837
  */
  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("/tmp/foo.bar/l[E`Iq0))i0");
      FileSystemHandling.appendStringToFile(evoSuiteFile0, "l[E`Iq0))i");
      URI uRI0 = MockURI.aFileURI;
      MockFile mockFile0 = new MockFile(uRI0);
      MockFile.createTempFile("l[E`Iq0))i", "", (File) mockFile0);
      FileIterator.FileIteratorBuilder fileIterator_FileIteratorBuilder0 = FileIterator.createNonRecursiveFileIteratorBuilder(mockFile0);
      FileIterator fileIterator0 = fileIterator_FileIteratorBuilder0.build();
      fileIterator0.getNextFile();
      File file0 = MockFile.createTempFile("FJVV u", "");
      FileIterator.createBreadthFirstFileIteratorBuilder(file0);
      Iterator<File> iterator0 = fileIterator0.iterator();
      assertNotNull(iterator0);
  }

  /**
  //Test case number: 5
  /*Coverage entropy=2.7853437136837007
  */
  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      MockFile mockFile0 = new MockFile("<~R", "<~R");
      MockFile.createTempFile("<~R", "<~R", (File) mockFile0);
      FileIterator.FileIteratorBuilder fileIterator_FileIteratorBuilder0 = FileIterator.createNonRecursiveFileIteratorBuilder(mockFile0);
      fileIterator_FileIteratorBuilder0.includeDirectories(true);
      fileIterator_FileIteratorBuilder0.includeHiddenFiles(true);
      FileIterator fileIterator0 = fileIterator_FileIteratorBuilder0.build();
      assertTrue(fileIterator0.hasNext());
  }

  /**
  //Test case number: 6
  /*Coverage entropy=3.0593313799334476
  */
  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      MockFile mockFile0 = new MockFile("", "");
      FileIterator.FileIteratorBuilder fileIterator_FileIteratorBuilder0 = FileIterator.createDepthFirstFileIteratorBuilder(mockFile0);
      FileIterator.FileIteratorBuilder fileIterator_FileIteratorBuilder1 = fileIterator_FileIteratorBuilder0.includeDirectories(true);
      fileIterator_FileIteratorBuilder0.build();
      FileIterator fileIterator0 = fileIterator_FileIteratorBuilder1.build();
      File file0 = fileIterator0.getNextFile();
      assertNotNull(file0);
      assertTrue(fileIterator0.hasNext());
  }

  /**
  //Test case number: 7
  /*Coverage entropy=2.8910459577298777
  */
  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("/tmp/foo.bar/l[E`Iq0))i0");
      FileSystemHandling.appendLineToFile(evoSuiteFile0, "l[`Iq0))i");
      URI uRI0 = MockURI.aFileURI;
      MockFile mockFile0 = new MockFile(uRI0);
      MockFile.createTempFile("l[`Iq0))i", "l[`Iq0))i", (File) mockFile0);
      FileIterator.FileIteratorBuilder fileIterator_FileIteratorBuilder0 = FileIterator.createNonRecursiveFileIteratorBuilder(mockFile0);
      FileIterator fileIterator0 = fileIterator_FileIteratorBuilder0.build();
      fileIterator0.getNextFile();
      MockFile.createTempFile("FJVV u", "");
      fileIterator_FileIteratorBuilder0.includeHiddenFiles(true);
      fileIterator0.iterator();
      fileIterator0.next();
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
  /*Coverage entropy=2.683711063822706
  */
  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      MockFile mockFile0 = new MockFile("", "");
      MockFile mockFile1 = new MockFile("", "");
      FileIterator.FileIteratorBuilder fileIterator_FileIteratorBuilder0 = FileIterator.createNonRecursiveFileIteratorBuilder(mockFile1);
      FileIterator.FileIteratorBuilder fileIterator_FileIteratorBuilder1 = fileIterator_FileIteratorBuilder0.includeDirectories(true);
      FileIterator fileIterator0 = fileIterator_FileIteratorBuilder1.build();
      File file0 = fileIterator0.next();
      assertFalse(file0.isHidden());
  }

  /**
  //Test case number: 9
  /*Coverage entropy=3.0637838562960367
  */
  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      MockFile mockFile0 = new MockFile("", "");
      FileIterator.FileIteratorBuilder fileIterator_FileIteratorBuilder0 = FileIterator.createDepthFirstFileIteratorBuilder(mockFile0);
      FileIterator.createDepthFirstFileIteratorBuilder(mockFile0);
      FileFilter[] fileFilterArray0 = new FileFilter[6];
      LinkedList<FileFilter> linkedList0 = new LinkedList<FileFilter>();
      MultipleFileFilter multipleFileFilter0 = new MultipleFileFilter(linkedList0);
      fileFilterArray0[0] = (FileFilter) multipleFileFilter0;
      MultipleFileFilter multipleFileFilter1 = new MultipleFileFilter(linkedList0);
      fileFilterArray0[1] = (FileFilter) multipleFileFilter1;
      MultipleFileFilter multipleFileFilter2 = new MultipleFileFilter(linkedList0);
      MultipleFileFilter multipleFileFilter3 = new MultipleFileFilter(linkedList0);
      fileFilterArray0[3] = (FileFilter) multipleFileFilter3;
      MultipleFileFilter multipleFileFilter4 = new MultipleFileFilter(linkedList0);
      fileFilterArray0[4] = (FileFilter) multipleFileFilter4;
      LinkedList<FileFilter> linkedList1 = new LinkedList<FileFilter>();
      MultipleFileFilter multipleFileFilter5 = new MultipleFileFilter(linkedList1);
      fileFilterArray0[5] = (FileFilter) multipleFileFilter5;
      MultipleFileFilter multipleFileFilter6 = new MultipleFileFilter(fileFilterArray0);
      FileIterator fileIterator0 = fileIterator_FileIteratorBuilder0.build();
      FileIterator fileIterator1 = fileIterator_FileIteratorBuilder0.build();
      fileIterator1.setUpInitialState(mockFile0);
      fileIterator0.getNextFile();
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
  //Test case number: 10
  /*Coverage entropy=2.4323966355417994
  */
  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      MockFile mockFile0 = new MockFile("<~R", "<~R");
      MockFile.createTempFile("<~R", "<~R", (File) mockFile0);
      FileIterator.FileIteratorBuilder fileIterator_FileIteratorBuilder0 = FileIterator.createNonRecursiveFileIteratorBuilder(mockFile0);
      FileIterator fileIterator0 = fileIterator_FileIteratorBuilder0.build();
      Consumer<Object> consumer0 = (Consumer<Object>) mock(Consumer.class, new ViolatedAssumptionAnswer());
      fileIterator0.forEachRemaining(consumer0);
      assertFalse(fileIterator0.hasNext());
  }

  /**
  //Test case number: 11
  /*Coverage entropy=2.4361062274866856
  */
  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      MockFile mockFile0 = new MockFile("A");
      MockFile.createTempFile("S5CnUH8XTc", "S5CnUH8XTc", (File) mockFile0);
      FileIterator.FileIteratorBuilder fileIterator_FileIteratorBuilder0 = FileIterator.createNonRecursiveFileIteratorBuilder(mockFile0);
      FileIterator fileIterator0 = fileIterator_FileIteratorBuilder0.build();
      fileIterator0.hasNext();
      FileIterator fileIterator1 = fileIterator_FileIteratorBuilder0.build();
      File file0 = fileIterator1.getNextFile();
      assertNull(file0);
  }

  /**
  //Test case number: 12
  /*Coverage entropy=2.430758633903798
  */
  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      MockFile mockFile0 = new MockFile("fi'eFilter can not be null");
      MockFile.createTempFile("fi'eFilter can not be null", "fi'eFilter can not be null", (File) mockFile0);
      FileIterator.FileIteratorBuilder fileIterator_FileIteratorBuilder0 = FileIterator.createNonRecursiveFileIteratorBuilder(mockFile0);
      FileIterator fileIterator0 = fileIterator_FileIteratorBuilder0.build();
      File file0 = fileIterator0.next();
      assertTrue(file0.canWrite());
  }

  /**
  //Test case number: 13
  /*Coverage entropy=2.4273916305367944
  */
  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      MockFile mockFile0 = new MockFile("");
      FileIterator.FileIteratorBuilder fileIterator_FileIteratorBuilder0 = FileIterator.createNonRecursiveFileIteratorBuilder(mockFile0);
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
  //Test case number: 14
  /*Coverage entropy=2.9769701418514933
  */
  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      MockFile mockFile0 = new MockFile("");
      FileIterator.FileIteratorBuilder fileIterator_FileIteratorBuilder0 = FileIterator.createBreadthFirstFileIteratorBuilder(mockFile0);
      FileIterator fileIterator0 = fileIterator_FileIteratorBuilder0.build();
      Iterator<File> iterator0 = fileIterator0.iterator();
      assertNotNull(iterator0);
  }

  /**
  //Test case number: 15
  /*Coverage entropy=2.425910149055313
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
  /*Coverage entropy=2.97547268752385
  */
  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      MockFile mockFile0 = new MockFile("q=");
      File file0 = MockFile.createTempFile("Y/W", "q=", (File) mockFile0);
      file0.delete();
      FileIterator.FileIteratorBuilder fileIterator_FileIteratorBuilder0 = FileIterator.createDepthFirstFileIteratorBuilder(mockFile0);
      FileIterator fileIterator0 = fileIterator_FileIteratorBuilder0.build();
      assertFalse(fileIterator0.hasNext());
  }

  /**
  //Test case number: 17
  /*Coverage entropy=2.885074759977858
  */
  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      MockFile mockFile0 = new MockFile("org.jcvi.jillioncore.util.FIFOQueue");
      MockFile.createTempFile("org.jcvi.jillioncore.util.FIFOQueue", "org.jcvi.jillioncore.util.FIFOQueue", (File) mockFile0);
      FileIterator.FileIteratorBuilder fileIterator_FileIteratorBuilder0 = FileIterator.createBreadthFirstFileIteratorBuilder(mockFile0);
      FileIterator fileIterator0 = fileIterator_FileIteratorBuilder0.build();
      assertTrue(fileIterator0.hasNext());
  }

  /**
  //Test case number: 18
  /*Coverage entropy=2.4297811167972485
  */
  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      MockFile mockFile0 = new MockFile("");
      FileIterator.FileIteratorBuilder fileIterator_FileIteratorBuilder0 = FileIterator.createNonRecursiveFileIteratorBuilder(mockFile0);
      FileIterator fileIterator0 = fileIterator_FileIteratorBuilder0.build();
      fileIterator0.updateFileIterator(mockFile0);
      fileIterator0.getNextFile();
      File file0 = fileIterator0.getNextFile();
      assertNull(file0);
  }

  /**
  //Test case number: 19
  /*Coverage entropy=2.4286687697449683
  */
  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      MockFile mockFile0 = new MockFile("");
      FileIterator.FileIteratorBuilder fileIterator_FileIteratorBuilder0 = FileIterator.createNonRecursiveFileIteratorBuilder(mockFile0);
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
  //Test case number: 20
  /*Coverage entropy=2.425910149055313
  */
  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      MockFile mockFile0 = new MockFile("jHN", "jHN");
      MockFile.createTempFile("Y/W", "jHN", (File) mockFile0);
      FileIterator.FileIteratorBuilder fileIterator_FileIteratorBuilder0 = FileIterator.createNonRecursiveFileIteratorBuilder(mockFile0);
      FileIterator fileIterator0 = fileIterator_FileIteratorBuilder0.build();
      assertFalse(fileIterator0.hasNext());
  }

  /**
  //Test case number: 21
  /*Coverage entropy=2.4337150271040935
  */
  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      MockFile mockFile0 = new MockFile("");
      FileIterator.FileIteratorBuilder fileIterator_FileIteratorBuilder0 = FileIterator.createNonRecursiveFileIteratorBuilder(mockFile0);
      FileIterator fileIterator0 = fileIterator_FileIteratorBuilder0.build();
      fileIterator0.setUpInitialState(mockFile0);
      FileSystemHandling fileSystemHandling0 = new FileSystemHandling();
      fileIterator0.updateFileIterator(mockFile0);
      FileIterator.FileIteratorBuilder fileIterator_FileIteratorBuilder1 = FileIterator.createNonRecursiveFileIteratorBuilder(mockFile0);
      assertNotSame(fileIterator_FileIteratorBuilder1, fileIterator_FileIteratorBuilder0);
  }

  /**
  //Test case number: 22
  /*Coverage entropy=2.2623477045221723
  */
  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      MockFile mockFile0 = new MockFile("org.jcvi.jillion.core.util.FIFOQueue", "i|Zl2");
      FileIterator.FileIteratorBuilder fileIterator_FileIteratorBuilder0 = FileIterator.createDepthFirstFileIteratorBuilder(mockFile0);
      fileIterator_FileIteratorBuilder0.includeHiddenFiles(true);
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
  //Test case number: 23
  /*Coverage entropy=2.684404064515707
  */
  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      MockFile mockFile0 = new MockFile("");
      FileIterator.FileIteratorBuilder fileIterator_FileIteratorBuilder0 = FileIterator.createNonRecursiveFileIteratorBuilder(mockFile0);
      FileIterator fileIterator0 = fileIterator_FileIteratorBuilder0.build();
      Iterator<File> iterator0 = fileIterator0.iterator();
      assertNotNull(iterator0);
  }

  /**
  //Test case number: 24
  /*Coverage entropy=2.9769701418514933
  */
  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      MockFile mockFile0 = new MockFile("");
      FileIterator.FileIteratorBuilder fileIterator_FileIteratorBuilder0 = FileIterator.createDepthFirstFileIteratorBuilder(mockFile0);
      FileIterator fileIterator0 = fileIterator_FileIteratorBuilder0.build();
      Iterator<File> iterator0 = fileIterator0.iterator();
      assertNotNull(iterator0);
  }

  /**
  //Test case number: 25
  /*Coverage entropy=2.0761045791007673
  */
  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      MockFile mockFile0 = new MockFile("T[h`nK8pBlI;Gmo");
      FileIterator.FileIteratorBuilder fileIterator_FileIteratorBuilder0 = FileIterator.createNonRecursiveFileIteratorBuilder(mockFile0);
      LinkedList<FileFilter> linkedList0 = new LinkedList<FileFilter>();
      MultipleFileFilter multipleFileFilter0 = new MultipleFileFilter(linkedList0);
      fileIterator_FileIteratorBuilder0.fileFilter(multipleFileFilter0);
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
  //Test case number: 26
  /*Coverage entropy=2.0761045791007673
  */
  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      MockFile mockFile0 = new MockFile("org.jcvi.jillion.core.util.MultipleFileFilter");
      FileIterator.FileIteratorBuilder fileIterator_FileIteratorBuilder0 = FileIterator.createNonRecursiveFileIteratorBuilder(mockFile0);
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
  //Test case number: 27
  /*Coverage entropy=2.5594415416798357
  */
  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
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
  //Test case number: 28
  /*Coverage entropy=2.0761045791007673
  */
  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
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
  //Test case number: 29
  /*Coverage entropy=1.830738805564335
  */
  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      MockFile mockFile0 = new MockFile("");
      FileIterator.FileIteratorBuilder fileIterator_FileIteratorBuilder0 = FileIterator.createDepthFirstFileIteratorBuilder(mockFile0);
      LinkedList<FileFilter> linkedList0 = new LinkedList<FileFilter>();
      MultipleFileFilter multipleFileFilter0 = new MultipleFileFilter(linkedList0);
      FileIterator.FileIteratorBuilder fileIterator_FileIteratorBuilder1 = fileIterator_FileIteratorBuilder0.fileFilter(multipleFileFilter0);
      assertSame(fileIterator_FileIteratorBuilder0, fileIterator_FileIteratorBuilder1);
  }

  /**
  //Test case number: 30
  /*Coverage entropy=1.830738805564335
  */
  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      FileIterator.FileIteratorBuilder fileIterator_FileIteratorBuilder0 = FileIterator.createBreadthFirstFileIteratorBuilder((File) null);
      FileIterator.FileIteratorBuilder fileIterator_FileIteratorBuilder1 = fileIterator_FileIteratorBuilder0.includeHiddenFiles(false);
      assertSame(fileIterator_FileIteratorBuilder1, fileIterator_FileIteratorBuilder0);
  }

  /**
  //Test case number: 31
  /*Coverage entropy=1.847832822658352
  */
  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
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
  //Test case number: 32
  /*Coverage entropy=1.847832822658352
  */
  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      MockFile mockFile0 = new MockFile("org.jcvi.jillion.core.util.FileIterator$BreadthFirstFileIteratorBuilder");
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
  //Test case number: 33
  /*Coverage entropy=1.847832822658352
  */
  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
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
  //Test case number: 34
  /*Coverage entropy=1.847832822658352
  */
  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
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
  //Test case number: 35
  /*Coverage entropy=1.8529610277865571
  */
  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      String string0 = "org.jcvi.jillion.core.util.FileIterator$NonDirectoryFileFilter";
      String string1 = "";
      MockFile mockFile0 = new MockFile("org.jcvi.jillion.core.util.FileIterator$NonDirectoryFileFilter", "");
      FileIterator.FileIteratorBuilder fileIterator_FileIteratorBuilder0 = FileIterator.createDepthFirstFileIteratorBuilder(mockFile0);
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
