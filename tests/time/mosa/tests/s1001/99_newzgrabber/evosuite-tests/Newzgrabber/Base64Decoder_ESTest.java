/*
 * This file was automatically generated by EvoSuite
 * Wed Dec 04 16:04:31 GMT 2019
 */

package Newzgrabber;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import Newzgrabber.Base64Decoder;
import Newzgrabber.BufferedCustomInputStream;
import Newzgrabber.Newzgrabber;
import java.io.ByteArrayInputStream;
import java.io.OutputStream;
import java.io.PipedOutputStream;
import java.io.PrintStream;
import javax.swing.DebugGraphics;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.System;
import org.evosuite.runtime.testdata.EvoSuiteFile;
import org.evosuite.runtime.testdata.FileSystemHandling;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class Base64Decoder_ESTest extends Base64Decoder_ESTest_scaffolding {

  /**
  //Test case number: 0
  /*Coverage entropy=0.4
  */
  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      byte[] byteArray0 = new byte[9];
      byteArray0[0] = (byte)46;
      byteArray0[2] = (byte) (-17);
      byteArray0[3] = (byte)47;
      byteArray0[4] = (byte)10;
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      BufferedCustomInputStream bufferedCustomInputStream0 = new BufferedCustomInputStream(byteArrayInputStream0);
      PrintStream printStream0 = DebugGraphics.logStream();
      Base64Decoder base64Decoder0 = new Base64Decoder(bufferedCustomInputStream0, printStream0);
      base64Decoder0.decodeStream();
      assertEquals(1L, base64Decoder0.getLineCount());
  }

  /**
  //Test case number: 1
  /*Coverage entropy=0.4
  */
  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      FileSystemHandling.shouldThrowIOException((EvoSuiteFile) null);
      FileSystemHandling.setPermissions((EvoSuiteFile) null, false, false, false);
      FileSystemHandling.setPermissions((EvoSuiteFile) null, false, true, false);
      byte[] byteArray0 = new byte[9];
      byteArray0[0] = (byte)10;
      byteArray0[1] = (byte)1;
      byteArray0[2] = (byte)10;
      byteArray0[3] = (byte)43;
      byteArray0[4] = (byte)48;
      byteArray0[5] = (byte)48;
      byteArray0[6] = (byte)82;
      byteArray0[7] = (byte)10;
      byteArray0[8] = (byte)1;
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      BufferedCustomInputStream bufferedCustomInputStream0 = new BufferedCustomInputStream(byteArrayInputStream0, (byte)43, true);
      PrintStream printStream0 = DebugGraphics.logStream();
      Base64Decoder base64Decoder0 = new Base64Decoder(bufferedCustomInputStream0, printStream0);
      base64Decoder0.decodeStream();
      assertEquals(3L, base64Decoder0.getLineCount());
  }

  /**
  //Test case number: 2
  /*Coverage entropy=0.6573186405438316
  */
  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      byte[] byteArray0 = new byte[15];
      byteArray0[1] = (byte)10;
      byteArray0[4] = (byte)10;
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      BufferedCustomInputStream bufferedCustomInputStream0 = new BufferedCustomInputStream(byteArrayInputStream0, (byte)10, true);
      Base64Decoder base64Decoder0 = new Base64Decoder(bufferedCustomInputStream0, (OutputStream) null);
      Newzgrabber.IsBatch = true;
      base64Decoder0.decodeStream();
      assertEquals(0, byteArrayInputStream0.available());
  }

  /**
  //Test case number: 3
  /*Coverage entropy=0.7046360973492382
  */
  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      FileSystemHandling.shouldThrowIOException((EvoSuiteFile) null);
      FileSystemHandling.setPermissions((EvoSuiteFile) null, false, false, false);
      byte[] byteArray0 = new byte[4];
      byteArray0[0] = (byte)43;
      byteArray0[1] = (byte)10;
      byteArray0[2] = (byte)48;
      byteArray0[3] = (byte)84;
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      BufferedCustomInputStream bufferedCustomInputStream0 = new BufferedCustomInputStream(byteArrayInputStream0);
      PrintStream printStream0 = DebugGraphics.logStream();
      Base64Decoder base64Decoder0 = new Base64Decoder(bufferedCustomInputStream0, printStream0);
      base64Decoder0.ProgressSet = true;
      base64Decoder0.decodeStream();
      System.setCurrentTimeMillis((byte)10);
  }

  /**
  //Test case number: 4
  /*Coverage entropy=0.4
  */
  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      byte[] byteArray0 = new byte[9];
      byteArray0[1] = (byte)0;
      byteArray0[2] = (byte)10;
      byteArray0[3] = (byte)57;
      byteArray0[4] = (byte)48;
      byteArray0[6] = (byte)82;
      byteArray0[7] = (byte)10;
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      PrintStream printStream0 = DebugGraphics.logStream();
      BufferedCustomInputStream bufferedCustomInputStream0 = new BufferedCustomInputStream(byteArrayInputStream0, (byte)48);
      Base64Decoder base64Decoder0 = new Base64Decoder(bufferedCustomInputStream0, printStream0);
      base64Decoder0.decodeStream();
      assertEquals(2L, base64Decoder0.getLineCount());
  }

  /**
  //Test case number: 5
  /*Coverage entropy=0.4
  */
  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      byte[] byteArray0 = new byte[8];
      byteArray0[0] = (byte)118;
      byteArray0[1] = (byte)118;
      byteArray0[4] = (byte)10;
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      BufferedCustomInputStream bufferedCustomInputStream0 = new BufferedCustomInputStream(byteArrayInputStream0);
      PrintStream printStream0 = DebugGraphics.logStream();
      Base64Decoder base64Decoder0 = new Base64Decoder(bufferedCustomInputStream0, printStream0);
      base64Decoder0.decodeStream();
      assertEquals(1L, base64Decoder0.getLineCount());
  }

  /**
  //Test case number: 6
  /*Coverage entropy=0.582647532242458
  */
  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      byte[] byteArray0 = new byte[6];
      FileSystemHandling.createFolder((EvoSuiteFile) null);
      byteArray0[0] = (byte)16;
      byteArray0[2] = (byte)118;
      byteArray0[3] = (byte) (-77);
      byteArray0[4] = (byte) (-31);
      byteArray0[5] = (byte)10;
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      byteArrayInputStream0.skip(1L);
      BufferedCustomInputStream bufferedCustomInputStream0 = new BufferedCustomInputStream(byteArrayInputStream0);
      bufferedCustomInputStream0.mark(3);
      PipedOutputStream pipedOutputStream0 = new PipedOutputStream();
      Base64Decoder base64Decoder0 = new Base64Decoder(bufferedCustomInputStream0, pipedOutputStream0);
      base64Decoder0.setLineCount((byte) (-31));
      base64Decoder0.decodeStream();
      base64Decoder0.decodeStream();
      assertEquals((-30L), base64Decoder0.getLineCount());
  }

  /**
  //Test case number: 7
  /*Coverage entropy=0.4
  */
  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      byte[] byteArray0 = new byte[6];
      byteArray0[1] = (byte)46;
      byteArray0[4] = (byte)10;
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      BufferedCustomInputStream bufferedCustomInputStream0 = new BufferedCustomInputStream(byteArrayInputStream0, (byte)46, true);
      Base64Decoder base64Decoder0 = new Base64Decoder(bufferedCustomInputStream0, (OutputStream) null);
      Newzgrabber.verbose = true;
      base64Decoder0.decodeStream();
      assertEquals(1L, base64Decoder0.getLineCount());
  }

  /**
  //Test case number: 8
  /*Coverage entropy=0.4
  */
  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      byte[] byteArray0 = new byte[8];
      byteArray0[1] = (byte)118;
      byteArray0[2] = (byte) (-122);
      byteArray0[4] = (byte)10;
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      BufferedCustomInputStream bufferedCustomInputStream0 = new BufferedCustomInputStream(byteArrayInputStream0);
      PrintStream printStream0 = DebugGraphics.logStream();
      Base64Decoder base64Decoder0 = new Base64Decoder(bufferedCustomInputStream0, printStream0);
      base64Decoder0.decodeStream();
      assertEquals(1L, base64Decoder0.getLineCount());
  }

  /**
  //Test case number: 9
  /*Coverage entropy=0.7488320958430319
  */
  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      byte[] byteArray0 = new byte[4];
      byteArray0[0] = (byte)10;
      byteArray0[1] = (byte)10;
      byteArray0[2] = (byte)46;
      byteArray0[3] = (byte)10;
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      BufferedCustomInputStream bufferedCustomInputStream0 = new BufferedCustomInputStream(byteArrayInputStream0);
      PrintStream printStream0 = DebugGraphics.logStream();
      Base64Decoder base64Decoder0 = new Base64Decoder(bufferedCustomInputStream0, printStream0);
      base64Decoder0.decodeStream();
      assertEquals(3L, base64Decoder0.getLineCount());
  }

  /**
  //Test case number: 10
  /*Coverage entropy=0.6711893730418441
  */
  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      byte[] byteArray0 = new byte[5];
      byteArray0[1] = (byte)10;
      byteArray0[4] = (byte)10;
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      BufferedCustomInputStream bufferedCustomInputStream0 = new BufferedCustomInputStream(byteArrayInputStream0, (byte)10, false);
      Base64Decoder base64Decoder0 = new Base64Decoder(bufferedCustomInputStream0, (OutputStream) null);
      byteArrayInputStream0.reset();
      base64Decoder0.setBegin(true);
      base64Decoder0.decodeStream();
      assertEquals(2L, base64Decoder0.getLineCount());
  }

  /**
  //Test case number: 11
  /*Coverage entropy=0.4
  */
  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      PrintStream printStream0 = DebugGraphics.logStream();
      Base64Decoder base64Decoder0 = new Base64Decoder((BufferedCustomInputStream) null, printStream0);
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
