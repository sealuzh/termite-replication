/*
 * This file was automatically generated by EvoSuite
 * Fri Nov 15 13:57:01 GMT 2019
 */

package Newzgrabber;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import Newzgrabber.Base64Decoder;
import Newzgrabber.BufferedCustomInputStream;
import Newzgrabber.Newzgrabber;
import java.io.BufferedOutputStream;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;
import java.io.PrintStream;
import java.io.UnsupportedEncodingException;
import javax.swing.JLayeredPane;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.System;
import org.evosuite.runtime.mock.java.io.MockPrintStream;
import org.evosuite.runtime.testdata.EvoSuiteFile;
import org.evosuite.runtime.testdata.EvoSuiteURL;
import org.evosuite.runtime.testdata.FileSystemHandling;
import org.evosuite.runtime.testdata.NetworkHandling;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class Base64Decoder_ESTest extends Base64Decoder_ESTest_scaffolding {

  /**
  //Test case number: 0
  /*Coverage entropy=0.5785663521818436
  */
  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      byte[] byteArray0 = new byte[8];
      byteArray0[1] = (byte)63;
      byteArray0[2] = (byte)87;
      byteArray0[2] = (byte)61;
      byteArray0[6] = (byte)10;
      byteArray0[1] = (byte)10;
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0, (byte)0, (byte)63);
      BufferedCustomInputStream bufferedCustomInputStream0 = new BufferedCustomInputStream(byteArrayInputStream0, 1121);
      FileSystemHandling.shouldAllThrowIOExceptions();
      Integer integer0 = JLayeredPane.PALETTE_LAYER;
      Object object0 = new Object();
      MockPrintStream mockPrintStream0 = new MockPrintStream("^N!T-:=v4");
      Base64Decoder base64Decoder0 = new Base64Decoder(bufferedCustomInputStream0, mockPrintStream0);
      char[] charArray0 = new char[7];
      charArray0[0] = '2';
      charArray0[1] = '@';
      charArray0[2] = 'J';
      charArray0[3] = 'J';
      charArray0[4] = 'J';
      charArray0[5] = 'J';
      Object[] objectArray0 = new Object[7];
      objectArray0[0] = (Object) base64Decoder0;
      objectArray0[1] = (Object) bufferedCustomInputStream0;
      objectArray0[2] = (Object) '2';
      objectArray0[4] = (Object) 'J';
      objectArray0[5] = (Object) "W\u0000";
      objectArray0[6] = (Object) "W\u0000";
      mockPrintStream0.printf("W\u0000", objectArray0);
      objectArray0[1] = (Object) '3';
      mockPrintStream0.print(charArray0);
      base64Decoder0.decodeStream();
      base64Decoder0.decodeStream();
      MockPrintStream mockPrintStream1 = null;
      try {
        mockPrintStream1 = new MockPrintStream("^N!T-:=v4", "^N!T-:=v4");
        fail("Expecting exception: UnsupportedEncodingException");
      
      } catch(Throwable e) {
         //
         // ^N!T-:=v4
         //
         verifyException("java.io.PrintStream", e);
      }
  }

  /**
  //Test case number: 1
  /*Coverage entropy=0.5915950580657945
  */
  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      byte[] byteArray0 = new byte[7];
      byteArray0[4] = (byte)0;
      byteArray0[3] = (byte)46;
      byteArray0[2] = (byte)61;
      FileSystemHandling.shouldAllThrowIOExceptions();
      byteArray0[3] = (byte)46;
      byteArray0[4] = (byte)61;
      byteArray0[5] = (byte)46;
      byteArray0[6] = (byte)46;
      byteArray0[5] = (byte)10;
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0, (byte)0, (byte)46);
      BufferedCustomInputStream bufferedCustomInputStream0 = new BufferedCustomInputStream(byteArrayInputStream0);
      Base64Decoder base64Decoder0 = new Base64Decoder(bufferedCustomInputStream0, (OutputStream) null);
      bufferedCustomInputStream0.read();
      BufferedOutputStream bufferedOutputStream0 = new BufferedOutputStream((OutputStream) null, (byte)98);
      Base64Decoder base64Decoder1 = new Base64Decoder(bufferedCustomInputStream0, (OutputStream) null);
      base64Decoder1.decodeStream();
      PipedInputStream pipedInputStream0 = new PipedInputStream();
      PipedOutputStream pipedOutputStream0 = new PipedOutputStream(pipedInputStream0);
      try { 
        pipedOutputStream0.connect(pipedInputStream0);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Already connected
         //
         verifyException("java.io.PipedOutputStream", e);
      }
  }

  /**
  //Test case number: 2
  /*Coverage entropy=0.5747161745799924
  */
  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      byte[] byteArray0 = new byte[7];
      FileSystemHandling.appendStringToFile((EvoSuiteFile) null, "I");
      byteArray0[0] = (byte)0;
      byteArray0[3] = (byte)47;
      byteArray0[2] = (byte)61;
      FileSystemHandling.shouldAllThrowIOExceptions();
      byteArray0[3] = (byte)47;
      byteArray0[4] = (byte)98;
      byteArray0[5] = (byte)47;
      byteArray0[6] = (byte)47;
      byteArray0[5] = (byte)10;
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0, (byte)0, (byte)47);
      BufferedCustomInputStream bufferedCustomInputStream0 = new BufferedCustomInputStream(byteArrayInputStream0, 1121);
      Base64Decoder base64Decoder0 = new Base64Decoder(bufferedCustomInputStream0, (OutputStream) null);
      bufferedCustomInputStream0.read();
      BufferedOutputStream bufferedOutputStream0 = new BufferedOutputStream((OutputStream) null);
      base64Decoder0.LineCount = (-1105L);
      Base64Decoder base64Decoder1 = new Base64Decoder(bufferedCustomInputStream0, (OutputStream) null);
      base64Decoder0.decodeStream();
      PipedInputStream pipedInputStream0 = new PipedInputStream();
      PipedOutputStream pipedOutputStream0 = new PipedOutputStream(pipedInputStream0);
      bufferedCustomInputStream0.read(byteArray0);
      try { 
        pipedInputStream0.connect(pipedOutputStream0);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Already connected
         //
         verifyException("java.io.PipedOutputStream", e);
      }
  }

  /**
  //Test case number: 3
  /*Coverage entropy=0.7154074116275893
  */
  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      byte[] byteArray0 = new byte[8];
      byteArray0[1] = (byte)63;
      byteArray0[2] = (byte)87;
      byteArray0[3] = (byte)10;
      byteArray0[2] = (byte)48;
      byteArray0[6] = (byte)10;
      byteArray0[1] = (byte)10;
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0, (byte)0, (byte)63);
      BufferedCustomInputStream bufferedCustomInputStream0 = new BufferedCustomInputStream(byteArrayInputStream0, 1121);
      bufferedCustomInputStream0.INCR = (int) (byte)0;
      FileSystemHandling.shouldAllThrowIOExceptions();
      Integer integer0 = JLayeredPane.PALETTE_LAYER;
      Object object0 = new Object();
      MockPrintStream mockPrintStream0 = new MockPrintStream("^N!T-:=v4");
      Base64Decoder base64Decoder0 = new Base64Decoder(bufferedCustomInputStream0, mockPrintStream0);
      Newzgrabber.IsBatch = true;
      char[] charArray0 = new char[7];
      charArray0[0] = '2';
      charArray0[1] = 'P';
      charArray0[2] = 'V';
      charArray0[3] = 'T';
      charArray0[4] = 'Z';
      charArray0[6] = '3';
      mockPrintStream0.print(charArray0);
      base64Decoder0.decodeStream();
      base64Decoder0.decodeStream();
      System.setCurrentTimeMillis(3230L);
      MockPrintStream mockPrintStream1 = null;
      try {
        mockPrintStream1 = new MockPrintStream("^N!T-:=v4", "^N!T-:=v4");
        fail("Expecting exception: UnsupportedEncodingException");
      
      } catch(Throwable e) {
         //
         // ^N!T-:=v4
         //
         verifyException("java.io.PrintStream", e);
      }
  }

  /**
  //Test case number: 4
  /*Coverage entropy=0.6858900691152602
  */
  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      byte[] byteArray0 = new byte[8];
      byteArray0[1] = (byte)63;
      byteArray0[2] = (byte)63;
      byteArray0[3] = (byte)10;
      byteArray0[4] = (byte)63;
      byteArray0[2] = (byte)46;
      byteArray0[6] = (byte)10;
      byteArray0[1] = (byte)10;
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0, (byte)0, (byte)63);
      BufferedCustomInputStream bufferedCustomInputStream0 = new BufferedCustomInputStream(byteArrayInputStream0, 1121);
      NetworkHandling.createRemoteTextFile((EvoSuiteURL) null, (String) null);
      bufferedCustomInputStream0.INCR = (int) (byte)63;
      FileSystemHandling.shouldAllThrowIOExceptions();
      Integer integer0 = JLayeredPane.PALETTE_LAYER;
      Object object0 = new Object();
      MockPrintStream mockPrintStream0 = new MockPrintStream("^N!T-:=v4");
      Base64Decoder base64Decoder0 = new Base64Decoder(bufferedCustomInputStream0, mockPrintStream0);
      Newzgrabber.IsBatch = false;
      base64Decoder0.decodeStream();
      base64Decoder0.decodeStream();
      System.setCurrentTimeMillis(3230L);
      System.setCurrentTimeMillis((byte)87);
      MockPrintStream mockPrintStream1 = null;
      try {
        mockPrintStream1 = new MockPrintStream("^N!T-:=v4", "^N!T-:=v4");
        fail("Expecting exception: UnsupportedEncodingException");
      
      } catch(Throwable e) {
         //
         // ^N!T-:=v4
         //
         verifyException("java.io.PrintStream", e);
      }
  }

  /**
  //Test case number: 5
  /*Coverage entropy=0.5747161745799924
  */
  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      byte[] byteArray0 = new byte[7];
      byte byte0 = (byte)0;
      String string0 = "I";
      FileSystemHandling.appendStringToFile((EvoSuiteFile) null, "I");
      byteArray0[0] = (byte)0;
      byteArray0[3] = (byte)47;
      byteArray0[2] = (byte)61;
      FileSystemHandling.shouldAllThrowIOExceptions();
      byteArray0[3] = (byte)47;
      byteArray0[4] = (byte)98;
      byteArray0[5] = (byte)47;
      byteArray0[6] = (byte)47;
      byteArray0[5] = (byte)10;
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0, (byte)0, (byte)47);
      BufferedCustomInputStream bufferedCustomInputStream0 = new BufferedCustomInputStream(byteArrayInputStream0);
      Base64Decoder base64Decoder0 = new Base64Decoder(bufferedCustomInputStream0, (OutputStream) null);
      bufferedCustomInputStream0.read();
      BufferedOutputStream bufferedOutputStream0 = new BufferedOutputStream((OutputStream) null);
      Base64Decoder base64Decoder1 = new Base64Decoder(bufferedCustomInputStream0, (OutputStream) null);
      base64Decoder1.decodeStream();
      PipedInputStream pipedInputStream0 = new PipedInputStream();
      PipedOutputStream pipedOutputStream0 = new PipedOutputStream(pipedInputStream0);
      try { 
        pipedOutputStream0.connect(pipedInputStream0);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Already connected
         //
         verifyException("java.io.PipedOutputStream", e);
      }
  }

  /**
  //Test case number: 6
  /*Coverage entropy=0.5747161745799924
  */
  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      byte[] byteArray0 = new byte[7];
      byteArray0[0] = (byte)0;
      byteArray0[3] = (byte)47;
      byteArray0[2] = (byte)61;
      FileSystemHandling.shouldAllThrowIOExceptions();
      byteArray0[3] = (byte)47;
      byteArray0[4] = (byte)98;
      byteArray0[5] = (byte)47;
      byteArray0[6] = (byte)47;
      byteArray0[5] = (byte)10;
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0, (byte)0, (byte)47);
      BufferedCustomInputStream bufferedCustomInputStream0 = new BufferedCustomInputStream(byteArrayInputStream0);
      Base64Decoder base64Decoder0 = new Base64Decoder(bufferedCustomInputStream0, (OutputStream) null);
      bufferedCustomInputStream0.read();
      BufferedOutputStream bufferedOutputStream0 = new BufferedOutputStream((OutputStream) null);
      Base64Decoder base64Decoder1 = new Base64Decoder(bufferedCustomInputStream0, (OutputStream) null);
      base64Decoder1.decodeStream();
      PipedInputStream pipedInputStream0 = new PipedInputStream();
      PipedOutputStream pipedOutputStream0 = new PipedOutputStream(pipedInputStream0);
      try { 
        pipedOutputStream0.connect(pipedInputStream0);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Already connected
         //
         verifyException("java.io.PipedOutputStream", e);
      }
  }

  /**
  //Test case number: 7
  /*Coverage entropy=0.582647532242458
  */
  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      byte[] byteArray0 = new byte[8];
      byteArray0[1] = (byte)63;
      byteArray0[2] = (byte)87;
      byteArray0[2] = (byte) (-120);
      byteArray0[6] = (byte)10;
      byteArray0[1] = (byte)10;
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0, (byte)0, (byte)63);
      BufferedCustomInputStream bufferedCustomInputStream0 = new BufferedCustomInputStream(byteArrayInputStream0, 1121);
      FileSystemHandling.shouldAllThrowIOExceptions();
      Integer integer0 = new Integer((byte)10);
      Object object0 = new Object();
      MockPrintStream mockPrintStream0 = new MockPrintStream("Index");
      Base64Decoder base64Decoder0 = new Base64Decoder(bufferedCustomInputStream0, mockPrintStream0);
      char[] charArray0 = new char[7];
      charArray0[0] = '<';
      charArray0[1] = '@';
      charArray0[2] = 'J';
      charArray0[3] = 'J';
      charArray0[4] = 'J';
      charArray0[5] = 'J';
      Object[] objectArray0 = new Object[7];
      objectArray0[0] = (Object) base64Decoder0;
      objectArray0[1] = (Object) bufferedCustomInputStream0;
      objectArray0[2] = (Object) '<';
      objectArray0[4] = (Object) 'J';
      objectArray0[5] = (Object) "W\u0000";
      objectArray0[6] = (Object) "W\u0000";
      PrintStream printStream0 = mockPrintStream0.printf("W\u0000", objectArray0);
      objectArray0[1] = (Object) '3';
      mockPrintStream0.print(charArray0);
      base64Decoder0.decodeStream();
      base64Decoder0.decodeStream();
      MockPrintStream mockPrintStream1 = new MockPrintStream("W\u0000");
      assertFalse(mockPrintStream1.equals((Object)printStream0));
  }

  /**
  //Test case number: 8
  /*Coverage entropy=0.5869819987032194
  */
  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      byte[] byteArray0 = new byte[7];
      FileSystemHandling.appendStringToFile((EvoSuiteFile) null, "I");
      byteArray0[0] = (byte)0;
      byteArray0[3] = (byte)47;
      byteArray0[2] = (byte)73;
      FileSystemHandling.shouldAllThrowIOExceptions();
      byteArray0[3] = (byte)47;
      byteArray0[4] = (byte)98;
      byteArray0[5] = (byte)47;
      byteArray0[6] = (byte)47;
      byteArray0[5] = (byte)10;
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0, (byte)0, (byte)47);
      BufferedCustomInputStream bufferedCustomInputStream0 = new BufferedCustomInputStream(byteArrayInputStream0);
      Base64Decoder base64Decoder0 = new Base64Decoder(bufferedCustomInputStream0, (OutputStream) null);
      bufferedCustomInputStream0.read();
      BufferedOutputStream bufferedOutputStream0 = new BufferedOutputStream((OutputStream) null);
      Base64Decoder base64Decoder1 = new Base64Decoder(bufferedCustomInputStream0, (OutputStream) null);
      base64Decoder1.decodeStream();
      PipedInputStream pipedInputStream0 = new PipedInputStream();
      PipedOutputStream pipedOutputStream0 = new PipedOutputStream(pipedInputStream0);
      try { 
        pipedOutputStream0.connect(pipedInputStream0);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Already connected
         //
         verifyException("java.io.PipedOutputStream", e);
      }
  }

  /**
  //Test case number: 9
  /*Coverage entropy=0.7312804275006052
  */
  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      byte[] byteArray0 = new byte[8];
      FileSystemHandling.appendLineToFile((EvoSuiteFile) null, "I");
      FileSystemHandling.appendStringToFile((EvoSuiteFile) null, " and ");
      byteArray0[6] = (byte)57;
      byteArray0[1] = (byte)67;
      FileSystemHandling.appendLineToFile((EvoSuiteFile) null, " and ");
      FileSystemHandling.appendStringToFile((EvoSuiteFile) null, "h/");
      FileSystemHandling.appendLineToFile((EvoSuiteFile) null, " and ");
      byteArray0[1] = (byte)107;
      byteArray0[5] = (byte)0;
      byteArray0[5] = (byte)10;
      FileSystemHandling.createFolder((EvoSuiteFile) null);
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0, (byte)0, (byte)57);
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("JyuVh%/uGM;7D+9>2");
      FileSystemHandling.shouldThrowIOException(evoSuiteFile0);
      BufferedCustomInputStream bufferedCustomInputStream0 = new BufferedCustomInputStream(byteArrayInputStream0, (byte)67);
      Base64Decoder base64Decoder0 = new Base64Decoder(bufferedCustomInputStream0, (OutputStream) null);
      base64Decoder0.ProgressSet = true;
      Newzgrabber.verbose = false;
      Byte byte0 = new Byte((byte)57);
      base64Decoder0.decodeStream();
      bufferedCustomInputStream0.mark((byte)107);
      Base64Decoder base64Decoder1 = new Base64Decoder(bufferedCustomInputStream0, (OutputStream) null);
      base64Decoder1.decodeStream();
      System.setCurrentTimeMillis((byte)10);
  }

  /**
  //Test case number: 10
  /*Coverage entropy=0.5710772959641663
  */
  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      byte[] byteArray0 = new byte[7];
      FileSystemHandling.appendStringToFile((EvoSuiteFile) null, "I");
      byteArray0[0] = (byte)0;
      byteArray0[3] = (byte)47;
      byteArray0[2] = (byte)61;
      FileSystemHandling.shouldAllThrowIOExceptions();
      byteArray0[3] = (byte)47;
      byteArray0[4] = (byte)98;
      byteArray0[5] = (byte)47;
      byteArray0[5] = (byte)10;
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0, (byte)0, (byte)47);
      BufferedCustomInputStream bufferedCustomInputStream0 = new BufferedCustomInputStream(byteArrayInputStream0);
      Base64Decoder base64Decoder0 = new Base64Decoder(bufferedCustomInputStream0, (OutputStream) null);
      bufferedCustomInputStream0.read();
      BufferedOutputStream bufferedOutputStream0 = new BufferedOutputStream((OutputStream) null);
      Base64Decoder base64Decoder1 = new Base64Decoder(bufferedCustomInputStream0, (OutputStream) null);
      base64Decoder1.ABORT = true;
      base64Decoder1.ProgressSet = true;
      base64Decoder1.decodeStream();
      PipedInputStream pipedInputStream0 = new PipedInputStream();
      PipedOutputStream pipedOutputStream0 = new PipedOutputStream(pipedInputStream0);
      try { 
        pipedOutputStream0.connect(pipedInputStream0);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Already connected
         //
         verifyException("java.io.PipedOutputStream", e);
      }
  }

  /**
  //Test case number: 11
  /*Coverage entropy=0.5747161745799924
  */
  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      byte[] byteArray0 = new byte[8];
      byteArray0[1] = (byte)63;
      byteArray0[2] = (byte)87;
      byteArray0[7] = (byte)10;
      byteArray0[2] = (byte)48;
      byteArray0[6] = (byte)10;
      byteArray0[1] = (byte)10;
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0, (byte)0, (byte)63);
      System.setCurrentTimeMillis((byte)48);
      System.setCurrentTimeMillis((byte)48);
      System.setCurrentTimeMillis((byte)10);
      System.setCurrentTimeMillis((-1649L));
      System.setCurrentTimeMillis(8L);
      byteArrayInputStream0.mark(6);
      BufferedCustomInputStream bufferedCustomInputStream0 = new BufferedCustomInputStream(byteArrayInputStream0, true);
      Base64Decoder base64Decoder0 = new Base64Decoder(bufferedCustomInputStream0, (OutputStream) null);
      base64Decoder0.decodeStream();
      System.setCurrentTimeMillis((-3980L));
      base64Decoder0.setBegin(false);
      System.setCurrentTimeMillis((byte)0);
      System.setCurrentTimeMillis((-1649L));
      System.setCurrentTimeMillis((-1341L));
      System.setCurrentTimeMillis((-874L));
      base64Decoder0.decodeStream();
      System.setCurrentTimeMillis((-3534L));
      System.setCurrentTimeMillis((byte)10);
  }

  /**
  //Test case number: 12
  /*Coverage entropy=0.6868359830561608
  */
  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      byte[] byteArray0 = new byte[7];
      FileSystemHandling.appendLineToFile((EvoSuiteFile) null, "I");
      FileSystemHandling.appendStringToFile((EvoSuiteFile) null, " and ");
      byteArray0[5] = (byte)57;
      byteArray0[1] = (byte)67;
      FileSystemHandling.appendLineToFile((EvoSuiteFile) null, " and ");
      FileSystemHandling.appendStringToFile((EvoSuiteFile) null, "h/");
      FileSystemHandling.appendLineToFile((EvoSuiteFile) null, " and ");
      byteArray0[1] = (byte)107;
      byteArray0[5] = (byte)0;
      byteArray0[5] = (byte)10;
      FileSystemHandling.createFolder((EvoSuiteFile) null);
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0, (byte)0, (byte)57);
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("JyuVh%/uGM;7D+9>2");
      FileSystemHandling.shouldThrowIOException(evoSuiteFile0);
      BufferedCustomInputStream bufferedCustomInputStream0 = new BufferedCustomInputStream(byteArrayInputStream0, (byte)67);
      Base64Decoder base64Decoder0 = new Base64Decoder(bufferedCustomInputStream0, (OutputStream) null);
      Newzgrabber.verbose = true;
      Byte byte0 = new Byte((byte)0);
      base64Decoder0.decodeStream();
      bufferedCustomInputStream0.setTempfile("JyuVh%/uGM;7D+9>2");
      FileSystemHandling.appendStringToFile((EvoSuiteFile) null, "JyuVh%/uGM;7D+9>2");
      System.setCurrentTimeMillis(1037L);
      System.setCurrentTimeMillis((-3980L));
      System.setCurrentTimeMillis((byte)57);
  }

  /**
  //Test case number: 13
  /*Coverage entropy=1.0365141682948127
  */
  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Base64Decoder base64Decoder0 = new Base64Decoder((BufferedCustomInputStream) null, (OutputStream) null);
      base64Decoder0.br = null;
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
  //Test case number: 14
  /*Coverage entropy=0.5785663521818436
  */
  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      byte[] byteArray0 = new byte[8];
      byteArray0[1] = (byte)63;
      byteArray0[2] = (byte)87;
      byteArray0[2] = (byte)61;
      byteArray0[6] = (byte)10;
      byteArray0[1] = (byte)10;
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0, (byte)0, (byte)63);
      BufferedCustomInputStream bufferedCustomInputStream0 = new BufferedCustomInputStream(byteArrayInputStream0, 15);
      FileSystemHandling.shouldAllThrowIOExceptions();
      Integer integer0 = new Integer((byte)10);
      Object object0 = new Object();
      MockPrintStream mockPrintStream0 = new MockPrintStream("Index");
      Base64Decoder base64Decoder0 = new Base64Decoder(bufferedCustomInputStream0, mockPrintStream0);
      char[] charArray0 = new char[7];
      charArray0[0] = '<';
      charArray0[1] = '@';
      charArray0[2] = 'J';
      charArray0[3] = 'J';
      charArray0[4] = 'J';
      charArray0[5] = 'J';
      Object[] objectArray0 = new Object[7];
      objectArray0[0] = (Object) base64Decoder0;
      objectArray0[1] = (Object) bufferedCustomInputStream0;
      objectArray0[2] = (Object) '<';
      objectArray0[4] = (Object) 'J';
      objectArray0[5] = (Object) "W\u0000";
      objectArray0[6] = (Object) "W\u0000";
      mockPrintStream0.printf("W\u0000", objectArray0);
      objectArray0[1] = (Object) '3';
      mockPrintStream0.print(charArray0);
      base64Decoder0.decodeStream();
      base64Decoder0.decodeStream();
      MockPrintStream mockPrintStream1 = new MockPrintStream("W\u0000");
      assertFalse(mockPrintStream1.equals((Object)mockPrintStream0));
  }
}
