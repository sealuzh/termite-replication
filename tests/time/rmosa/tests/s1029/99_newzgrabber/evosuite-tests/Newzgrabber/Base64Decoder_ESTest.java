/*
 * This file was automatically generated by EvoSuite
 * Fri Dec 06 14:25:57 GMT 2019
 */

package Newzgrabber;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import Newzgrabber.Base64Decoder;
import Newzgrabber.BufferedCustomInputStream;
import Newzgrabber.Newzgrabber;
import java.io.InputStream;
import java.io.OutputStream;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.testdata.FileSystemHandling;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class Base64Decoder_ESTest extends Base64Decoder_ESTest_scaffolding {

  /**
  //Test case number: 0
  /*Coverage entropy=0.4
  */
  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Base64Decoder base64Decoder0 = new Base64Decoder((BufferedCustomInputStream) null, (OutputStream) null);
      base64Decoder0.setReader((InputStream) null);
      base64Decoder0.decodeStream();
      assertFalse(base64Decoder0.ProgressSet);
  }

  /**
  //Test case number: 1
  /*Coverage entropy=0.4
  */
  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      FileSystemHandling.shouldAllThrowIOExceptions();
      Base64Decoder base64Decoder0 = new Base64Decoder((BufferedCustomInputStream) null, (OutputStream) null);
      Newzgrabber.verbose = true;
      base64Decoder0.ABORT = true;
      base64Decoder0.setReader((InputStream) null);
      base64Decoder0.decodeStream();
      assertEquals(0L, base64Decoder0.getLineCount());
  }

  /**
  //Test case number: 2
  /*Coverage entropy=0.4
  */
  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Base64Decoder base64Decoder0 = new Base64Decoder((BufferedCustomInputStream) null, (OutputStream) null);
      // Undeclared exception!
      try { 
        base64Decoder0.decodeStream();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("Newzgrabber.Base64Decoder", e);
      }
  }
}
