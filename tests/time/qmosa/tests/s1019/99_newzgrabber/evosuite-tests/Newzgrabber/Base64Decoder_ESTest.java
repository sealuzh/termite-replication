/*
 * This file was automatically generated by EvoSuite
 * Wed Dec 04 04:03:58 GMT 2019
 */

package Newzgrabber;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import Newzgrabber.Base64Decoder;
import Newzgrabber.BufferedCustomInputStream;
import Newzgrabber.Newzgrabber;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.io.OutputStream;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.io.MockPrintStream;
import org.evosuite.runtime.testdata.EvoSuiteFile;
import org.evosuite.runtime.testdata.FileSystemHandling;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class Base64Decoder_ESTest extends Base64Decoder_ESTest_scaffolding {

  /**
  //Test case number: 0
  /*Coverage entropy=1.0365141682948127
  */
  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      MockPrintStream mockPrintStream0 = new MockPrintStream("!<Z");
      Base64Decoder base64Decoder0 = new Base64Decoder((BufferedCustomInputStream) null, mockPrintStream0);
      base64Decoder0.updateProgress();
      Object object0 = new Object();
      Object object1 = new Object();
      Object object2 = new Object();
      Newzgrabber.verbose = true;
      Object object3 = new Object();
      Object object4 = new Object();
      base64Decoder0.setReader((InputStream) null);
      Object object5 = new Object();
      Object object6 = new Object();
      Object[] objectArray0 = new Object[8];
      objectArray0[0] = object6;
      objectArray0[1] = (Object) "N:AkNFw3&b";
      objectArray0[2] = object6;
      objectArray0[3] = object2;
      objectArray0[4] = object0;
      objectArray0[5] = (Object) base64Decoder0;
      Object[] objectArray1 = new Object[9];
      objectArray1[0] = (Object) null;
      objectArray1[1] = (Object) null;
      Object object7 = new Object();
      objectArray1[2] = object7;
      objectArray1[3] = object0;
      objectArray1[4] = (Object) "!<Z";
      objectArray1[5] = object0;
      objectArray1[6] = object2;
      objectArray1[7] = (Object) "N:AkNFw3&b";
      objectArray1[8] = object3;
      mockPrintStream0.printf("`a 7XEF'CX_", objectArray1);
      base64Decoder0.decodeStream();
      assertFalse(base64Decoder0.ABORT);
  }

  /**
  //Test case number: 1
  /*Coverage entropy=1.0365141682948127
  */
  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      MockPrintStream mockPrintStream0 = new MockPrintStream("!<Z");
      Base64Decoder base64Decoder0 = new Base64Decoder((BufferedCustomInputStream) null, mockPrintStream0);
      base64Decoder0.updateProgress();
      Object object0 = new Object();
      Object object1 = new Object();
      Object object2 = new Object();
      Object object3 = new Object();
      Object object4 = new Object();
      Object object5 = new Object();
      Object object6 = new Object();
      Object[] objectArray0 = new Object[22];
      objectArray0[0] = (Object) "L)";
      objectArray0[1] = object0;
      objectArray0[2] = (Object) base64Decoder0;
      objectArray0[3] = (Object) mockPrintStream0;
      objectArray0[4] = object2;
      objectArray0[5] = object5;
      objectArray0[6] = (Object) "L)";
      objectArray0[7] = object1;
      objectArray0[8] = (Object) "eD,{";
      mockPrintStream0.printf("L)", objectArray0);
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
  //Test case number: 2
  /*Coverage entropy=1.1071024035889305
  */
  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      byte[] byteArray0 = new byte[3];
      byteArray0[0] = (byte)52;
      byteArray0[1] = (byte)0;
      byteArray0[2] = (byte)96;
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0, 1994, (byte)96);
      byteArrayInputStream0.read(byteArray0);
      BufferedCustomInputStream bufferedCustomInputStream0 = new BufferedCustomInputStream(byteArrayInputStream0, false);
      Base64Decoder base64Decoder0 = new Base64Decoder(bufferedCustomInputStream0, (OutputStream) null);
      FileSystemHandling.appendStringToFile((EvoSuiteFile) null, "mX;G$Il)Kb!#*+nS");
      byteArrayInputStream0.markSupported();
      bufferedCustomInputStream0.readLine();
      base64Decoder0.decodeStream();
      base64Decoder0.decodeStream();
      base64Decoder0.decodeStream();
      base64Decoder0.br = bufferedCustomInputStream0;
      byteArrayInputStream0.read(byteArray0);
      base64Decoder0.decodeStream();
      Base64Decoder base64Decoder1 = new Base64Decoder(bufferedCustomInputStream0, (OutputStream) null);
      base64Decoder0.decodeStream();
      base64Decoder0.decodeStream();
      assertFalse(base64Decoder0.equals((Object)base64Decoder1));
  }
}
