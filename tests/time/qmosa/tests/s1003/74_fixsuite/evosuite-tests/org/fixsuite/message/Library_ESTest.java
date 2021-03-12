/*
 * This file was automatically generated by EvoSuite
 * Sun Nov 29 17:16:28 GMT 2020
 */

package org.fixsuite.message;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.System;
import org.evosuite.runtime.testdata.EvoSuiteFile;
import org.evosuite.runtime.testdata.FileSystemHandling;
import org.fixsuite.message.Library;
import org.fixsuite.message.info.DictionaryInfo;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class Library_ESTest extends Library_ESTest_scaffolding {

  /**
  //Test case number: 0
  /*Coverage entropy=0.937155853065701
  */
  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Library library0 = new Library();
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("d_`Dpx");
      FileSystemHandling.createFolder(evoSuiteFile0);
      library0.loadFromDirectory("");
      DictionaryInfo dictionaryInfo0 = new DictionaryInfo("");
      assertFalse(dictionaryInfo0.isLoaded());
  }

  /**
  //Test case number: 1
  /*Coverage entropy=0.3250829733914482
  */
  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Library library0 = new Library();
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("gs*PHs,%{.");
      FileSystemHandling.appendStringToFile(evoSuiteFile0, "");
      library0.loadFromDirectory("");
      DictionaryInfo dictionaryInfo0 = new DictionaryInfo("-/.#4#B>;11Mu:!A");
      assertEquals("-/.#4#B>;11Mu:!A", dictionaryInfo0.getVersion());
  }

  /**
  //Test case number: 2
  /*Coverage entropy=1.242453324894
  */
  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      System.setCurrentTimeMillis((-1497L));
      Library library0 = new Library();
      FileSystemHandling.shouldAllThrowIOExceptions();
      library0.getDictionaries();
      library0.loadFromDirectory("$--iZyek%E]'S^dmFH");
      String string0 = "MsgContents.xml";
      library0.getDictionary("MsgContents.xml");
      library0.getDictionaries();
      System.setCurrentTimeMillis((-1497L));
      library0.getDictionaries();
      library0.loadFromDirectory("MsgContents.xml");
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
  //Test case number: 3
  /*Coverage entropy=1.0735428464085233
  */
  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      Library library0 = new Library();
      library0.loadFromDirectory("");
      library0.loadFromDirectory("");
      library0.loadFromDirectory("");
      library0.loadFromDirectory("");
      library0.loadFromDirectory("");
      library0.getDictionaries();
      library0.loadFromDirectory("");
      library0.loadFromDirectory("org.fixsuite.message.info.ComponentInfo");
      library0.loadFromDirectory("9i7");
      library0.getDictionaries();
      library0.loadFromDirectory("Supplied directory is empty.");
      library0.getDictionary("YJ)fhC2~");
      library0.loadFromDirectory("XsT4M:A)6~xh");
      library0.getDictionary("YJ)fhC2~");
      library0.loadFromDirectory("j9V=UKse24W@@Z");
      library0.loadFromDirectory("q8");
      library0.loadFromDirectory("YJ)fhC2~");
      library0.getDictionary(":0N35");
      library0.loadFromDirectory("");
      library0.getDictionary("j9V=UKse24W@@Z");
      library0.getDictionary("YJ)fhC2~");
      library0.getDictionary("r Q9XaGz5mF:#k+vH9");
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
  //Test case number: 4
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      Library library0 = new Library();
      DictionaryInfo dictionaryInfo0 = new DictionaryInfo("");
      System.setCurrentTimeMillis(931L);
      DictionaryInfo dictionaryInfo1 = library0.getDictionary("");
      assertNull(dictionaryInfo1);
  }
}
