/*
 * This file was automatically generated by EvoSuite
 * Tue Nov 10 11:05:34 GMT 2020
 */

package com.densebrain.rif.client;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.densebrain.rif.client.RIFClassLoader;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class RIFClassLoader_ESTest extends RIFClassLoader_ESTest_scaffolding {

  /**
  //Test case number: 0
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      RIFClassLoader rIFClassLoader0 = new RIFClassLoader();
      byte[] byteArray0 = new byte[3];
      // Undeclared exception!
      try { 
        rIFClassLoader0.registerClass("t9C-/'.BMcB;0?)&", byteArray0);
        fail("Expecting exception: NoClassDefFoundError");
      
      } catch(NoClassDefFoundError e) {
      }
  }

  /**
  //Test case number: 1
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      RIFClassLoader rIFClassLoader0 = new RIFClassLoader();
      // Undeclared exception!
      try { 
        rIFClassLoader0.findClass((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  /**
  //Test case number: 2
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      RIFClassLoader rIFClassLoader0 = new RIFClassLoader();
      // Undeclared exception!
      try { 
        rIFClassLoader0.registerClass("com.densebrain.rif.client.RIFClassLoader", (byte[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.densebrain.rif.client.RIFClassLoader", e);
      }
  }

  /**
  //Test case number: 3
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      RIFClassLoader rIFClassLoader0 = new RIFClassLoader();
      Class<?> class0 = rIFClassLoader0.findClass("q?&cqrRd");
      assertNull(class0);
  }
}
