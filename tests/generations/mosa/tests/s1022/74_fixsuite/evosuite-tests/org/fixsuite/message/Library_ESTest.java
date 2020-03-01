/*
 * This file was automatically generated by EvoSuite
 * Thu Nov 14 22:22:00 GMT 2019
 */

package org.fixsuite.message;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.testdata.EvoSuiteFile;
import org.evosuite.runtime.testdata.FileSystemHandling;
import org.fixsuite.message.Library;
import org.fixsuite.message.info.DictionaryInfo;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class Library_ESTest extends Library_ESTest_scaffolding {

  /**
  //Test case number: 0
  /*Coverage entropy=0.4444444444444445
  */
  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("2G.ruH39<D");
      FileSystemHandling.createFolder(evoSuiteFile0);
      Library library0 = new Library();
      boolean boolean0 = library0.loadFromDirectory("");
      assertTrue(boolean0);
  }

  /**
  //Test case number: 1
  /*Coverage entropy=1.5271837172395382
  */
  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Library library0 = new Library();
      library0.getDictionaries();
      // Undeclared exception!
      try { 
        library0.getDictionary((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.TreeMap", e);
      }
  }

  /**
  //Test case number: 2
  /*Coverage entropy=0.4
  */
  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Library library0 = new Library();
      boolean boolean0 = library0.loadFromDirectory("");
      assertFalse(boolean0);
  }

  /**
  //Test case number: 3
  /*Coverage entropy=0.9623351446188083
  */
  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      Library library0 = new Library();
      // Undeclared exception!
      try { 
        library0.loadFromDirectory((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.io.File", e);
      }
  }

  /**
  //Test case number: 4
  /*Coverage entropy=1.0931471805599453
  */
  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      Library library0 = new Library();
      DictionaryInfo dictionaryInfo0 = library0.getDictionary("Path name does not point to a file.");
      assertNull(dictionaryInfo0);
  }

  /**
  //Test case number: 5
  /*Coverage entropy=0.4
  */
  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      Library library0 = new Library();
      boolean boolean0 = library0.loadFromDirectory("2G.ruH39<D");
      assertFalse(boolean0);
  }
}
