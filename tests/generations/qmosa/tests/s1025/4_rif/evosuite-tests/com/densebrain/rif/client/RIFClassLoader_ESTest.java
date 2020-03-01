/*
 * This file was automatically generated by EvoSuite
 * Tue Nov 19 13:07:47 GMT 2019
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
      rIFClassLoader0.clearAssertionStatus();
      rIFClassLoader0.setDefaultAssertionStatus(true);
      rIFClassLoader0.clearAssertionStatus();
      rIFClassLoader0.clearAssertionStatus();
      rIFClassLoader0.setPackageAssertionStatus("", true);
      rIFClassLoader0.setDefaultAssertionStatus(false);
      rIFClassLoader0.setClassAssertionStatus("$;]p-/^y:B", false);
      rIFClassLoader0.setClassAssertionStatus("$;]p-/^y:B", true);
      rIFClassLoader0.setPackageAssertionStatus("", true);
      rIFClassLoader0.setPackageAssertionStatus((String) null, false);
      rIFClassLoader0.setPackageAssertionStatus("$;]p-/^y:B", true);
      rIFClassLoader0.setPackageAssertionStatus("Y^wd@5k1", true);
      rIFClassLoader0.setClassAssertionStatus("$;]p-/^y:B", true);
      rIFClassLoader0.setClassAssertionStatus("", true);
      rIFClassLoader0.setPackageAssertionStatus((String) null, true);
      rIFClassLoader0.setPackageAssertionStatus("", true);
      // Undeclared exception!
      try { 
        rIFClassLoader0.registerClass("", (byte[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.densebrain.rif.client.RIFClassLoader", e);
      }
  }

  /**
  //Test case number: 1
  /*Coverage entropy=1.1375916250043898
  */
  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      String string0 = "";
      RIFClassLoader rIFClassLoader0 = new RIFClassLoader();
      rIFClassLoader0.findClass("");
      rIFClassLoader0.findClass("");
      String string1 = null;
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
  /*Coverage entropy=1.0931471805599453
  */
  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      RIFClassLoader rIFClassLoader0 = new RIFClassLoader();
      byte[] byteArray0 = new byte[3];
      byteArray0[0] = (byte)1;
      rIFClassLoader0.getParent();
      rIFClassLoader0.setDefaultAssertionStatus(true);
      byteArray0[1] = (byte)1;
      rIFClassLoader0.setClassAssertionStatus("L-k4$Y9begmin@O5k[", false);
      rIFClassLoader0.setClassAssertionStatus("", true);
      rIFClassLoader0.setPackageAssertionStatus("", false);
      rIFClassLoader0.setPackageAssertionStatus("pZ)=^)ep(K{ 9?;j/", false);
      rIFClassLoader0.setClassAssertionStatus("pZ)=^)ep(K{ 9?;j/", true);
      rIFClassLoader0.setPackageAssertionStatus("", false);
      // Undeclared exception!
      try { 
        rIFClassLoader0.registerClass("pZ)=^)ep(K{ 9?;j/", byteArray0);
        fail("Expecting exception: NoClassDefFoundError");
      
      } catch(NoClassDefFoundError e) {
      }
  }

  /**
  //Test case number: 3
  /*Coverage entropy=1.0931471805599453
  */
  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      byte[] byteArray0 = new byte[4];
      byte[] byteArray1 = new byte[5];
      byteArray1[0] = (byte)1;
      byteArray1[1] = (byte)2;
      byteArray1[2] = (byte)2;
      byteArray1[3] = (byte)2;
      byteArray1[4] = (byte)1;
      RIFClassLoader rIFClassLoader0 = new RIFClassLoader();
      // Undeclared exception!
      try { 
        rIFClassLoader0.registerClass("-l eGzRX;CRZC5G", byteArray0);
        fail("Expecting exception: ClassFormatError");
      
      } catch(ClassFormatError e) {
      }
  }
}
