/*
 * This file was automatically generated by EvoSuite
 * Tue Nov 19 20:06:32 GMT 2019
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
      rIFClassLoader0.setClassAssertionStatus((String) null, false);
      rIFClassLoader0.setClassAssertionStatus("?UX1bwdmE!P]x;Xnx,", true);
      rIFClassLoader0.setDefaultAssertionStatus(true);
      rIFClassLoader0.setPackageAssertionStatus("6*8", true);
      rIFClassLoader0.setDefaultAssertionStatus(true);
      rIFClassLoader0.setDefaultAssertionStatus(true);
      rIFClassLoader0.setClassAssertionStatus("6>joNQ}=Yh$QIKH", false);
      rIFClassLoader0.setPackageAssertionStatus("6>joNQ}=Yh$QIKH", true);
      rIFClassLoader0.clearAssertionStatus();
      rIFClassLoader0.setPackageAssertionStatus((String) null, true);
      rIFClassLoader0.setPackageAssertionStatus("6>joNQ}=Yh$QIKH", true);
      rIFClassLoader0.setClassAssertionStatus("6>joNQ}=Yh$QIKH", true);
      rIFClassLoader0.setPackageAssertionStatus("", false);
      rIFClassLoader0.setClassAssertionStatus("?UX1bwdmE!P]x;Xnx,", true);
      byte[] byteArray0 = new byte[3];
      byteArray0[0] = (byte)35;
      byteArray0[1] = (byte)35;
      byteArray0[2] = (byte) (-114);
      // Undeclared exception!
      try { 
        rIFClassLoader0.registerClass("/A[-o~:,(<Y6VZF[", byteArray0);
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
      rIFClassLoader0.clearAssertionStatus();
      rIFClassLoader0.setClassAssertionStatus((String) null, false);
      rIFClassLoader0.setClassAssertionStatus("rTgkE5e}Cn!d+%WbsE", false);
      rIFClassLoader0.setClassAssertionStatus("?UX1bwdmE!P]x;Xnx,", false);
      rIFClassLoader0.setDefaultAssertionStatus(true);
      rIFClassLoader0.setPackageAssertionStatus("6*8", false);
      rIFClassLoader0.setDefaultAssertionStatus(true);
      rIFClassLoader0.setDefaultAssertionStatus(true);
      rIFClassLoader0.setClassAssertionStatus("6>joNQ}=Yh$QIKH", false);
      rIFClassLoader0.setPackageAssertionStatus("6*8", true);
      rIFClassLoader0.setPackageAssertionStatus("6>joNQ}=Yh$QIKH", true);
      rIFClassLoader0.clearAssertionStatus();
      rIFClassLoader0.setPackageAssertionStatus((String) null, true);
      rIFClassLoader0.setPackageAssertionStatus("6>joNQ}=Yh$QIKH", true);
      rIFClassLoader0.setClassAssertionStatus("6>joNQ}=Yh$QIKH", true);
      rIFClassLoader0.setPackageAssertionStatus("", false);
      rIFClassLoader0.setClassAssertionStatus("?UX1bwdmE!P]x;Xnx,", true);
      // Undeclared exception!
      try { 
        rIFClassLoader0.registerClass("?UX1bwdmE!P]x;Xnx,", (byte[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.densebrain.rif.client.RIFClassLoader", e);
      }
  }

  /**
  //Test case number: 2
  /*Coverage entropy=1.0931471805599453
  */
  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      RIFClassLoader rIFClassLoader0 = new RIFClassLoader();
      rIFClassLoader0.clearAssertionStatus();
      rIFClassLoader0.setClassAssertionStatus((String) null, false);
      rIFClassLoader0.setClassAssertionStatus("?UX1bwdmE!P]x;Xnx,", true);
      rIFClassLoader0.setDefaultAssertionStatus(true);
      rIFClassLoader0.setPackageAssertionStatus("6*8", true);
      rIFClassLoader0.setDefaultAssertionStatus(true);
      rIFClassLoader0.setDefaultAssertionStatus(true);
      rIFClassLoader0.setClassAssertionStatus("6>joNQ}=YhVQIKH", false);
      rIFClassLoader0.setPackageAssertionStatus("6>joNQ}=YhVQIKH", true);
      rIFClassLoader0.clearAssertionStatus();
      rIFClassLoader0.setPackageAssertionStatus((String) null, true);
      rIFClassLoader0.setPackageAssertionStatus("6>joNQ}=YhVQIKH", true);
      rIFClassLoader0.setClassAssertionStatus("6>joNQ}=YhVQIKH", true);
      rIFClassLoader0.setPackageAssertionStatus("", false);
      rIFClassLoader0.setClassAssertionStatus("?UX1bwdmE!P]x;Xnx,", true);
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
  //Test case number: 3
  /*Coverage entropy=1.0931471805599453
  */
  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      byte[] byteArray0 = new byte[16];
      byteArray0[1] = (byte)14;
      byteArray0[2] = (byte)33;
      RIFClassLoader rIFClassLoader0 = new RIFClassLoader();
      Class<?> class0 = rIFClassLoader0.findClass("G!UxKr|=o,&gp`k");
      assertNull(class0);
  }

  /**
  //Test case number: 4
  /*Coverage entropy=1.0931471805599453
  */
  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      byte[] byteArray0 = new byte[16];
      byteArray0[0] = (byte)116;
      byteArray0[1] = (byte)14;
      byteArray0[2] = (byte)33;
      byteArray0[3] = (byte) (-121);
      byteArray0[4] = (byte)33;
      byteArray0[5] = (byte) (-119);
      RIFClassLoader rIFClassLoader0 = new RIFClassLoader();
      // Undeclared exception!
      try { 
        rIFClassLoader0.registerClass((String) null, byteArray0);
        fail("Expecting exception: ClassFormatError");
      
      } catch(ClassFormatError e) {
      }
  }
}
