/*
 * This file was automatically generated by EvoSuite
 * Wed Dec 04 05:15:29 GMT 2019
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
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class Library_ESTest extends Library_ESTest_scaffolding {

  /**
  //Test case number: 0
  /*Coverage entropy=1.6320028122663075
  */
  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Library library0 = new Library();
      library0.getDictionaries();
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("/home/ubuntu/termite/projects/74_fixsuite");
      byte[] byteArray0 = new byte[0];
      FileSystemHandling.appendDataToFile(evoSuiteFile0, byteArray0);
      library0.loadFromDirectory("");
      library0.getDictionaries();
      library0.getDictionaries();
      library0.getDictionaries();
      library0.getDictionaries();
      library0.getDictionaries();
      library0.getDictionaries();
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
  //Test case number: 1
  /*Coverage entropy=1.6894490248955247
  */
  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Library library0 = new Library();
      library0.getDictionaries();
      library0.loadFromDirectory("");
      library0.loadFromDirectory("");
      library0.getDictionaries();
      library0.loadFromDirectory("");
      library0.loadFromDirectory("");
      library0.loadFromDirectory("");
      library0.getDictionary("#>]%GGI[e?u^P'u");
      library0.loadFromDirectory("");
      library0.getDictionary("MsgContents.xml");
      library0.getDictionaries();
      library0.getDictionary(".");
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("Psm,$t");
      FileSystemHandling.createFolder(evoSuiteFile0);
      library0.getDictionary(".");
      String string0 = "org.fixsuite.message.info.GroupInfo";
      library0.loadFromDirectory("org.fixsuite.message.info.GroupInfo");
      library0.getDictionary("org.fixsuite.message.info.GroupInfo");
      library0.getDictionaries();
      library0.loadFromDirectory("MsgContents.xml");
      library0.loadFromDirectory("Psm,$t");
      library0.loadFromDirectory("");
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
}
