/*
 * This file was automatically generated by EvoSuite
 * Mon Nov 30 04:45:11 GMT 2020
 */

package org.jcvi.jillion.core.util;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.File;
import java.io.FileFilter;
import java.util.LinkedList;
import java.util.NoSuchElementException;
import java.util.function.Consumer;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.evosuite.runtime.mock.java.io.MockFile;
import org.jcvi.jillion.core.util.FileIterator;
import org.jcvi.jillion.core.util.MultipleFileFilter;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class FileIterator_ESTest extends FileIterator_ESTest_scaffolding {

  /**
  //Test case number: 0
  /*Coverage entropy=3.0153351233670116
  */
  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      MockFile mockFile0 = new MockFile("", "");
      FileIterator.FileIteratorBuilder fileIterator_FileIteratorBuilder0 = FileIterator.createDepthFirstFileIteratorBuilder(mockFile0);
      File file0 = MockFile.createTempFile("rootDir must be a directory", "", (File) mockFile0);
      FileIterator fileIterator0 = fileIterator_FileIteratorBuilder0.build();
      assertTrue(fileIterator0.hasNext());
      
      file0.setLastModified(0L);
      fileIterator0.next();
      assertFalse(fileIterator0.hasNext());
  }

  /**
  //Test case number: 1
  /*Coverage entropy=3.0045706252519193
  */
  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      MockFile mockFile0 = new MockFile("", "");
      FileIterator.FileIteratorBuilder fileIterator_FileIteratorBuilder0 = FileIterator.createDepthFirstFileIteratorBuilder(mockFile0);
      fileIterator_FileIteratorBuilder0.includeDirectories(true);
      FileIterator fileIterator0 = fileIterator_FileIteratorBuilder0.build();
      File file0 = fileIterator0.next();
      assertTrue(file0.canRead());
  }

  /**
  //Test case number: 2
  /*Coverage entropy=2.9512516113626925
  */
  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      MockFile mockFile0 = new MockFile("", "");
      FileIterator.FileIteratorBuilder fileIterator_FileIteratorBuilder0 = FileIterator.createDepthFirstFileIteratorBuilder(mockFile0);
      MockFile.createTempFile("rootDir must be a directory", "", (File) mockFile0);
      FileIterator fileIterator0 = fileIterator_FileIteratorBuilder0.build();
      boolean boolean0 = fileIterator0.hasNext();
      assertTrue(boolean0);
  }

  /**
  //Test case number: 3
  /*Coverage entropy=2.936158557953129
  */
  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      MockFile mockFile0 = new MockFile("", "");
      FileIterator.FileIteratorBuilder fileIterator_FileIteratorBuilder0 = FileIterator.createDepthFirstFileIteratorBuilder(mockFile0);
      FileIterator fileIterator0 = fileIterator_FileIteratorBuilder0.build();
      boolean boolean0 = fileIterator0.hasNext();
      assertFalse(boolean0);
  }

  /**
  //Test case number: 4
  /*Coverage entropy=2.886774446912403
  */
  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      MockFile mockFile0 = new MockFile("", "");
      FileIterator.FileIteratorBuilder fileIterator_FileIteratorBuilder0 = FileIterator.createDepthFirstFileIteratorBuilder(mockFile0);
      FileIterator fileIterator0 = fileIterator_FileIteratorBuilder0.build();
      File file0 = fileIterator0.getNextFile();
      assertNull(file0);
      assertFalse(fileIterator0.hasNext());
  }

  /**
  //Test case number: 5
  /*Coverage entropy=2.8997571011430576
  */
  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      MockFile mockFile0 = new MockFile("", "");
      FileIterator.FileIteratorBuilder fileIterator_FileIteratorBuilder0 = FileIterator.createDepthFirstFileIteratorBuilder(mockFile0);
      File file0 = MockFile.createTempFile("rootDir must be a directory", "", (File) mockFile0);
      FileIterator fileIterator0 = fileIterator_FileIteratorBuilder0.build();
      file0.setReadable(false);
      fileIterator0.updateFileIterator(mockFile0);
      File file1 = fileIterator0.getNextFile();
      assertNotNull(file1);
      assertTrue(file1.isFile());
  }

  /**
  //Test case number: 6
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      FileIterator.FileIteratorBuilder fileIterator_FileIteratorBuilder0 = FileIterator.createDepthFirstFileIteratorBuilder((File) null);
      assertNotNull(fileIterator_FileIteratorBuilder0);
  }

  /**
  //Test case number: 7
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      FileIterator.FileIteratorBuilder fileIterator_FileIteratorBuilder0 = FileIterator.createBreadthFirstFileIteratorBuilder((File) null);
      assertNotNull(fileIterator_FileIteratorBuilder0);
  }

  /**
  //Test case number: 8
  /*Coverage entropy=2.8488997058418164
  */
  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      MockFile mockFile0 = new MockFile("", "m7 sAH!Ity sRc-");
      FileIterator.FileIteratorBuilder fileIterator_FileIteratorBuilder0 = FileIterator.createDepthFirstFileIteratorBuilder(mockFile0);
      MockFile.createTempFile("[[au4Kf#;t;9$3p", "x\"N])4%4C_V*}WOUV", (File) mockFile0);
      FileIterator fileIterator0 = fileIterator_FileIteratorBuilder0.build();
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
  //Test case number: 9
  /*Coverage entropy=2.886774446912403
  */
  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      MockFile mockFile0 = new MockFile("", "");
      FileIterator.FileIteratorBuilder fileIterator_FileIteratorBuilder0 = FileIterator.createDepthFirstFileIteratorBuilder(mockFile0);
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
  //Test case number: 10
  /*Coverage entropy=2.9034007581809185
  */
  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      MockFile mockFile0 = new MockFile("", "");
      FileIterator.FileIteratorBuilder fileIterator_FileIteratorBuilder0 = FileIterator.createDepthFirstFileIteratorBuilder(mockFile0);
      FileIterator.FileIteratorBuilder fileIterator_FileIteratorBuilder1 = fileIterator_FileIteratorBuilder0.includeDirectories(true);
      FileIterator fileIterator0 = fileIterator_FileIteratorBuilder1.build();
      File file0 = fileIterator0.getNextFile();
      assertNotNull(file0);
      assertTrue(fileIterator0.hasNext());
  }

  /**
  //Test case number: 11
  /*Coverage entropy=2.936158557953129
  */
  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      MockFile mockFile0 = new MockFile("", "");
      FileIterator.FileIteratorBuilder fileIterator_FileIteratorBuilder0 = FileIterator.createDepthFirstFileIteratorBuilder(mockFile0);
      FileIterator.FileIteratorBuilder fileIterator_FileIteratorBuilder1 = fileIterator_FileIteratorBuilder0.includeHiddenFiles(true);
      FileIterator fileIterator0 = fileIterator_FileIteratorBuilder1.build();
      assertFalse(fileIterator0.hasNext());
  }

  /**
  //Test case number: 12
  /*Coverage entropy=2.8443053266982616
  */
  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      MockFile mockFile0 = new MockFile("");
      FileIterator.FileIteratorBuilder fileIterator_FileIteratorBuilder0 = FileIterator.createDepthFirstFileIteratorBuilder(mockFile0);
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
  //Test case number: 13
  /*Coverage entropy=2.9401427026868374
  */
  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      MockFile mockFile0 = new MockFile("", "");
      FileIterator.FileIteratorBuilder fileIterator_FileIteratorBuilder0 = FileIterator.createDepthFirstFileIteratorBuilder(mockFile0);
      File file0 = MockFile.createTempFile("rootDir must be a directory", "[[au4Kf#;t;9$3p", (File) mockFile0);
      FileIterator fileIterator0 = fileIterator_FileIteratorBuilder0.build();
      fileIterator0.setUpInitialState(file0);
      assertFalse(fileIterator0.hasNext());
  }

  /**
  //Test case number: 14
  /*Coverage entropy=1.6769877743224173
  */
  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      MockFile mockFile0 = new MockFile("y-H%Rt", "y-H%Rt");
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

  /**
  //Test case number: 15
  /*Coverage entropy=1.6674619334292948
  */
  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
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
  //Test case number: 16
  /*Coverage entropy=2.936158557953129
  */
  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      MockFile mockFile0 = new MockFile("", "");
      FileIterator.FileIteratorBuilder fileIterator_FileIteratorBuilder0 = FileIterator.createDepthFirstFileIteratorBuilder(mockFile0);
      LinkedList<FileFilter> linkedList0 = new LinkedList<FileFilter>();
      MultipleFileFilter multipleFileFilter0 = new MultipleFileFilter(linkedList0);
      fileIterator_FileIteratorBuilder0.fileFilter(multipleFileFilter0);
      FileIterator fileIterator0 = fileIterator_FileIteratorBuilder0.build();
      assertFalse(fileIterator0.hasNext());
  }

  /**
  //Test case number: 17
  /*Coverage entropy=3.0288503480576145
  */
  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      MockFile mockFile0 = new MockFile("", "");
      FileIterator.FileIteratorBuilder fileIterator_FileIteratorBuilder0 = FileIterator.createBreadthFirstFileIteratorBuilder(mockFile0);
      FileIterator fileIterator0 = fileIterator_FileIteratorBuilder0.build();
      Consumer<Object> consumer0 = (Consumer<Object>) mock(Consumer.class, new ViolatedAssumptionAnswer());
      fileIterator0.forEach(consumer0);
      assertFalse(fileIterator0.hasNext());
  }

  /**
  //Test case number: 18
  /*Coverage entropy=2.936158557953129
  */
  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      MockFile mockFile0 = new MockFile("", "");
      FileIterator.FileIteratorBuilder fileIterator_FileIteratorBuilder0 = FileIterator.createDepthFirstFileIteratorBuilder(mockFile0);
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
  //Test case number: 19
  /*Coverage entropy=2.9552088755878527
  */
  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      MockFile mockFile0 = new MockFile("", "");
      FileIterator.FileIteratorBuilder fileIterator_FileIteratorBuilder0 = FileIterator.createDepthFirstFileIteratorBuilder(mockFile0);
      FileIterator.FileIteratorBuilder fileIterator_FileIteratorBuilder1 = fileIterator_FileIteratorBuilder0.includeHiddenFiles(true);
      FileIterator.FileIteratorBuilder fileIterator_FileIteratorBuilder2 = fileIterator_FileIteratorBuilder1.includeDirectories(true);
      FileIterator fileIterator0 = fileIterator_FileIteratorBuilder2.build();
      assertTrue(fileIterator0.hasNext());
  }

  /**
  //Test case number: 20
  /*Coverage entropy=2.9834644014718337
  */
  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      MockFile mockFile0 = new MockFile("", "");
      FileIterator.FileIteratorBuilder fileIterator_FileIteratorBuilder0 = FileIterator.createDepthFirstFileIteratorBuilder(mockFile0);
      FileIterator fileIterator0 = fileIterator_FileIteratorBuilder0.build();
      fileIterator0.iterator();
      assertFalse(fileIterator0.hasNext());
  }

  /**
  //Test case number: 21
  /*Coverage entropy=2.597508782744932
  */
  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      MockFile mockFile0 = new MockFile("", "");
      Consumer<File> consumer0 = (Consumer<File>) mock(Consumer.class, new ViolatedAssumptionAnswer());
      FileIterator.FileIteratorBuilder fileIterator_FileIteratorBuilder0 = FileIterator.createNonRecursiveFileIteratorBuilder(mockFile0);
      FileIterator fileIterator0 = fileIterator_FileIteratorBuilder0.build();
      fileIterator0.forEach(consumer0);
      assertFalse(fileIterator0.hasNext());
  }
}
