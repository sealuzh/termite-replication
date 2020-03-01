/*
 * This file was automatically generated by EvoSuite
 * Wed Dec 04 10:11:37 GMT 2019
 */

package Newzgrabber;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import Newzgrabber.Base64Decoder;
import Newzgrabber.BufferedCustomInputStream;
import Newzgrabber.Newzgrabber;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.SequenceInputStream;
import java.util.Enumeration;
import java.util.Hashtable;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.System;
import org.evosuite.runtime.mock.java.io.MockFile;
import org.evosuite.runtime.mock.java.io.MockPrintStream;
import org.evosuite.runtime.testdata.EvoSuiteFile;
import org.evosuite.runtime.testdata.FileSystemHandling;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class Base64Decoder_ESTest extends Base64Decoder_ESTest_scaffolding {

  /**
  //Test case number: 0
  /*Coverage entropy=1.0650855968662414
  */
  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      byte[] byteArray0 = new byte[8];
      byteArray0[0] = (byte) (-51);
      byteArray0[1] = (byte)5;
      byteArray0[2] = (byte)0;
      byteArray0[3] = (byte) (-112);
      byteArray0[4] = (byte)0;
      byteArray0[5] = (byte)0;
      byteArray0[6] = (byte)16;
      byteArray0[7] = (byte)19;
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      BufferedCustomInputStream bufferedCustomInputStream0 = new BufferedCustomInputStream(byteArrayInputStream0, false);
      Base64Decoder base64Decoder0 = new Base64Decoder(bufferedCustomInputStream0, (OutputStream) null);
      Newzgrabber.verbose = true;
      base64Decoder0.decodeStream();
      base64Decoder0.decodeStream();
      assertFalse(base64Decoder0.ABORT);
  }

  /**
  //Test case number: 1
  /*Coverage entropy=1.0365141682948127
  */
  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Hashtable<InputStream, String> hashtable0 = new Hashtable<InputStream, String>();
      Enumeration<InputStream> enumeration0 = hashtable0.keys();
      SequenceInputStream sequenceInputStream0 = new SequenceInputStream(enumeration0);
      BufferedCustomInputStream bufferedCustomInputStream0 = new BufferedCustomInputStream(sequenceInputStream0);
      ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream(2154);
      Base64Decoder base64Decoder0 = new Base64Decoder(bufferedCustomInputStream0, byteArrayOutputStream0);
      String[] stringArray0 = new String[5];
      stringArray0[0] = "c [,%|?/!IU5EO`rKZ";
      byte[] byteArray0 = new byte[6];
      byteArray0[0] = (byte)0;
      byteArray0[1] = (byte) (-92);
      byteArray0[2] = (byte) (-1);
      byteArray0[3] = (byte) (-1);
      byteArray0[4] = (byte) (-92);
      byteArray0[5] = (byte) (-92);
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0, 138, 435);
      DataInputStream dataInputStream0 = new DataInputStream(sequenceInputStream0);
      Newzgrabber.main(stringArray0);
      base64Decoder0.decodeStream();
      System.setCurrentTimeMillis(2179L);
  }

  /**
  //Test case number: 2
  /*Coverage entropy=1.0365141682948127
  */
  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      FileSystemHandling fileSystemHandling0 = new FileSystemHandling();
      MockFile mockFile0 = new MockFile("0:y5qN");
      mockFile0.setReadable(false, false);
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("0Py5qN");
      FileSystemHandling.appendStringToFile(evoSuiteFile0, "H7yPOR=-d%V6");
      FileSystemHandling fileSystemHandling1 = new FileSystemHandling();
      MockFile mockFile1 = new MockFile(mockFile0, "Done getting line data");
      mockFile1.deleteOnExit();
      MockFile mockFile2 = new MockFile(mockFile1, "0:y5qN");
      MockPrintStream mockPrintStream0 = new MockPrintStream(mockFile0);
      MockPrintStream mockPrintStream1 = new MockPrintStream(mockPrintStream0);
      mockPrintStream1.append('R');
      EvoSuiteFile evoSuiteFile1 = new EvoSuiteFile("/home/ubuntu/termite/projects/99_newzgrabber");
      FileSystemHandling.shouldThrowIOException(evoSuiteFile1);
      Base64Decoder base64Decoder0 = new Base64Decoder((BufferedCustomInputStream) null, mockPrintStream0);
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
  //Test case number: 3
  /*Coverage entropy=1.0365141682948127
  */
  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      MockFile mockFile0 = new MockFile("The following are the lines from the base64 decode", "+n{+wF");
      mockFile0.setReadable(true, false);
      MockPrintStream mockPrintStream0 = new MockPrintStream(mockFile0);
      Object object0 = new Object();
      Object[] objectArray0 = new Object[9];
      objectArray0[0] = (Object) mockFile0;
      objectArray0[1] = (Object) "+n{+wF";
      objectArray0[2] = (Object) mockFile0;
      objectArray0[3] = (Object) "";
      objectArray0[4] = (Object) mockPrintStream0;
      objectArray0[5] = (Object) mockPrintStream0;
      objectArray0[6] = (Object) "";
      objectArray0[7] = (Object) "+n{+wF";
      Object object1 = new Object();
      objectArray0[8] = object1;
      mockPrintStream0.format("", objectArray0);
      BufferedCustomInputStream bufferedCustomInputStream0 = new BufferedCustomInputStream((InputStream) null, false);
      Base64Decoder base64Decoder0 = new Base64Decoder(bufferedCustomInputStream0, mockPrintStream0);
      base64Decoder0.decodeStream();
      assertFalse(base64Decoder0.ABORT);
  }
}
