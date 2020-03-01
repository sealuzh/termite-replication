/*
 * This file was automatically generated by EvoSuite
 * Sat Nov 16 03:50:10 GMT 2019
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
  /*Coverage entropy=1.0931471805599453
  */
  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      RIFClassLoader rIFClassLoader0 = new RIFClassLoader();
      byte[] byteArray0 = new byte[8];
      rIFClassLoader0.getParent();
      rIFClassLoader0.setClassAssertionStatus("z]U", true);
      rIFClassLoader0.setClassAssertionStatus("z]U", false);
      String string0 = "JC6WUQ's6maX%-Q";
      rIFClassLoader0.setDefaultAssertionStatus(false);
      rIFClassLoader0.setPackageAssertionStatus("JC6WUQ's6maX%-Q", false);
      rIFClassLoader0.setPackageAssertionStatus("N&(.wy1)", false);
      rIFClassLoader0.setPackageAssertionStatus("JC6WUQ's6maX%-Q", true);
      rIFClassLoader0.setClassAssertionStatus(">2[:2Su%HwY?", false);
      rIFClassLoader0.clearAssertionStatus();
      rIFClassLoader0.clearAssertionStatus();
      rIFClassLoader0.setDefaultAssertionStatus(false);
      rIFClassLoader0.getParent();
      rIFClassLoader0.setPackageAssertionStatus("", true);
      rIFClassLoader0.setPackageAssertionStatus("", false);
      rIFClassLoader0.setPackageAssertionStatus((String) null, false);
      rIFClassLoader0.setClassAssertionStatus("JC6WUQ's6maX%-Q", false);
      rIFClassLoader0.setPackageAssertionStatus(">2[:2Su%HwY?", false);
      rIFClassLoader0.getParent();
      // Undeclared exception!
      try { 
        rIFClassLoader0.registerClass("IrG]2z/'?ss29xk,%A", byteArray0);
        fail("Expecting exception: NoClassDefFoundError");
      
      } catch(NoClassDefFoundError e) {
      }
  }

  /**
  //Test case number: 1
  /*Coverage entropy=1.0931471805599453
  */
  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      RIFClassLoader rIFClassLoader0 = new RIFClassLoader();
      byte[] byteArray0 = new byte[8];
      rIFClassLoader0.getParent();
      rIFClassLoader0.setDefaultAssertionStatus(false);
      rIFClassLoader0.setDefaultAssertionStatus(true);
      rIFClassLoader0.setPackageAssertionStatus("", true);
      rIFClassLoader0.setClassAssertionStatus("z]U", true);
      rIFClassLoader0.clearAssertionStatus();
      rIFClassLoader0.setClassAssertionStatus("z]U", false);
      rIFClassLoader0.setDefaultAssertionStatus(false);
      rIFClassLoader0.setPackageAssertionStatus("JC6WUjQ'sP6maX%-Q", false);
      rIFClassLoader0.setPackageAssertionStatus("N&(.wy1)", false);
      rIFClassLoader0.setPackageAssertionStatus("JC6WUjQ'sP6maX%-Q", true);
      rIFClassLoader0.setClassAssertionStatus(">2[:2Su%HwY?", false);
      rIFClassLoader0.clearAssertionStatus();
      rIFClassLoader0.clearAssertionStatus();
      rIFClassLoader0.setDefaultAssertionStatus(true);
      rIFClassLoader0.getParent();
      rIFClassLoader0.setPackageAssertionStatus("", true);
      rIFClassLoader0.setPackageAssertionStatus("", false);
      rIFClassLoader0.setPackageAssertionStatus("", false);
      rIFClassLoader0.setClassAssertionStatus("JC6WUjQ'sP6maX%-Q", false);
      rIFClassLoader0.setPackageAssertionStatus(">2[:2Su%HwY?", false);
      // Undeclared exception!
      try { 
        rIFClassLoader0.registerClass((String) null, byteArray0);
        fail("Expecting exception: ClassFormatError");
      
      } catch(ClassFormatError e) {
      }
  }

  /**
  //Test case number: 2
  /*Coverage entropy=1.0931471805599453
  */
  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      RIFClassLoader rIFClassLoader0 = new RIFClassLoader();
      // Undeclared exception!
      try { 
        rIFClassLoader0.registerClass("g8QJ$j!xvK]mhSS%x", (byte[]) null);
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
  /*Coverage entropy=1.0931471805599453
  */
  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      RIFClassLoader rIFClassLoader0 = new RIFClassLoader();
      Class<?> class0 = rIFClassLoader0.findClass("I$8KU2yX8Wu.W&p");
      assertNull(class0);
  }

  /**
  //Test case number: 4
  /*Coverage entropy=1.0931471805599453
  */
  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      RIFClassLoader rIFClassLoader0 = new RIFClassLoader();
      byte[] byteArray0 = new byte[3];
      rIFClassLoader0.getParent();
      rIFClassLoader0.setClassAssertionStatus("z]U", true);
      rIFClassLoader0.setClassAssertionStatus("z]U", false);
      rIFClassLoader0.setDefaultAssertionStatus(false);
      rIFClassLoader0.setPackageAssertionStatus("JC6WUQ's6maX%-Q", false);
      rIFClassLoader0.setPackageAssertionStatus("JC6WUQ's6maX%-Q", true);
      rIFClassLoader0.setClassAssertionStatus(">2[:2Su%HwY?", false);
      rIFClassLoader0.clearAssertionStatus();
      rIFClassLoader0.setDefaultAssertionStatus(false);
      rIFClassLoader0.getParent();
      rIFClassLoader0.setPackageAssertionStatus("", true);
      rIFClassLoader0.setPackageAssertionStatus("", false);
      rIFClassLoader0.setClassAssertionStatus("JC6WUQ's6maX%-Q", false);
      rIFClassLoader0.setPackageAssertionStatus(">2[:2Su%HwY?", false);
      rIFClassLoader0.getParent();
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
}
