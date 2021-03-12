/*
 * This file was automatically generated by EvoSuite
 * Sun Nov 29 16:49:48 GMT 2020
 */

package Newzgrabber;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import Newzgrabber.Base64Decoder;
import Newzgrabber.BufferedCustomInputStream;
import Newzgrabber.Newzgrabber;
import java.io.ByteArrayOutputStream;
import java.io.FilterOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class Base64Decoder_ESTest extends Base64Decoder_ESTest_scaffolding {

  /**
  //Test case number: 0
  /*Coverage entropy=0.6365141682948128
  */
  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
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

  /**
  //Test case number: 1
  /*Coverage entropy=0.6365141682948128
  */
  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      BufferedCustomInputStream bufferedCustomInputStream0 = new BufferedCustomInputStream((InputStream) null, 100, true);
      ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream();
      FilterOutputStream filterOutputStream0 = new FilterOutputStream(byteArrayOutputStream0);
      Base64Decoder base64Decoder0 = new Base64Decoder(bufferedCustomInputStream0, filterOutputStream0);
      Newzgrabber.verbose = true;
      base64Decoder0.decodeStream();
      assertFalse(base64Decoder0.ProgressSet);
  }
}
