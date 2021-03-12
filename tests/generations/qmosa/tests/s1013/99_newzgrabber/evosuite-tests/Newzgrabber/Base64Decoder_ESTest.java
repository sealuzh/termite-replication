/*
 * This file was automatically generated by EvoSuite
 * Wed Nov 11 01:25:22 GMT 2020
 */

package Newzgrabber;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import Newzgrabber.Base64Decoder;
import Newzgrabber.BufferedCustomInputStream;
import Newzgrabber.Newzgrabber;
import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.OutputStream;
import java.io.PrintStream;
import javax.swing.DebugGraphics;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class Base64Decoder_ESTest extends Base64Decoder_ESTest_scaffolding {

  /**
  //Test case number: 0
  /*Coverage entropy=0.30463609734923813
  */
  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      byte[] byteArray0 = new byte[13];
      byteArray0[1] = (byte)10;
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      BufferedCustomInputStream bufferedCustomInputStream0 = new BufferedCustomInputStream(byteArrayInputStream0, (byte)22, true);
      Base64Decoder base64Decoder0 = new Base64Decoder(bufferedCustomInputStream0, (OutputStream) null);
      base64Decoder0.setBegin(true);
      base64Decoder0.decodeStream();
      assertEquals(1L, base64Decoder0.getLineCount());
  }

  /**
  //Test case number: 1
  /*Coverage entropy=0.6365141682948128
  */
  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
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

  /**
  //Test case number: 2
  /*Coverage entropy=0.18490739916777568
  */
  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      byte[] byteArray0 = new byte[7];
      byteArray0[4] = (byte)10;
      byteArray0[1] = (byte)47;
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      BufferedCustomInputStream bufferedCustomInputStream0 = new BufferedCustomInputStream(byteArrayInputStream0, 3202, true);
      Base64Decoder base64Decoder0 = new Base64Decoder(bufferedCustomInputStream0, (OutputStream) null);
      base64Decoder0.decodeStream();
      assertEquals(1L, base64Decoder0.getLineCount());
  }

  /**
  //Test case number: 3
  /*Coverage entropy=0.15407610367102942
  */
  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      byte[] byteArray0 = new byte[9];
      byteArray0[0] = (byte)48;
      byteArray0[4] = (byte)10;
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      BufferedInputStream bufferedInputStream0 = new BufferedInputStream(byteArrayInputStream0, (byte)48);
      BufferedCustomInputStream bufferedCustomInputStream0 = new BufferedCustomInputStream(bufferedInputStream0, 858, false);
      Base64Decoder base64Decoder0 = new Base64Decoder(bufferedCustomInputStream0, (OutputStream) null);
      base64Decoder0.decodeStream();
      assertEquals(1L, base64Decoder0.getLineCount());
  }

  /**
  //Test case number: 4
  /*Coverage entropy=0.15841057013179086
  */
  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      byte[] byteArray0 = new byte[7];
      byteArray0[3] = (byte) (-105);
      byteArray0[4] = (byte)10;
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      BufferedCustomInputStream bufferedCustomInputStream0 = new BufferedCustomInputStream(byteArrayInputStream0, (byte)70, false);
      Base64Decoder base64Decoder0 = new Base64Decoder(bufferedCustomInputStream0, (OutputStream) null);
      base64Decoder0.decodeStream();
      assertEquals(1L, base64Decoder0.getLineCount());
  }

  /**
  //Test case number: 5
  /*Coverage entropy=0.15407610367102942
  */
  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      byte[] byteArray0 = new byte[7];
      byteArray0[0] = (byte)70;
      byteArray0[4] = (byte)10;
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      BufferedCustomInputStream bufferedCustomInputStream0 = new BufferedCustomInputStream(byteArrayInputStream0, (byte)70, false);
      Base64Decoder base64Decoder0 = new Base64Decoder(bufferedCustomInputStream0, (OutputStream) null);
      base64Decoder0.decodeStream();
      assertEquals(1L, base64Decoder0.getLineCount());
  }

  /**
  //Test case number: 6
  /*Coverage entropy=0.2711893730418441
  */
  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      byte[] byteArray0 = new byte[7];
      byteArray0[3] = (byte)10;
      byteArray0[4] = (byte)10;
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      BufferedCustomInputStream bufferedCustomInputStream0 = new BufferedCustomInputStream(byteArrayInputStream0, 3202, true);
      Base64Decoder base64Decoder0 = new Base64Decoder(bufferedCustomInputStream0, (OutputStream) null);
      base64Decoder0.decodeStream();
      assertEquals(2L, base64Decoder0.getLineCount());
  }

  /**
  //Test case number: 7
  /*Coverage entropy=0.37677016125643675
  */
  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      byte[] byteArray0 = new byte[7];
      byteArray0[0] = (byte)46;
      byteArray0[1] = (byte)10;
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      BufferedCustomInputStream bufferedCustomInputStream0 = new BufferedCustomInputStream(byteArrayInputStream0, (byte)46, false);
      Base64Decoder base64Decoder0 = new Base64Decoder(bufferedCustomInputStream0, (OutputStream) null);
      base64Decoder0.decodeStream();
      assertEquals(1L, base64Decoder0.getLineCount());
  }

  /**
  //Test case number: 8
  /*Coverage entropy=0.30463609734923813
  */
  @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      byte[] byteArray0 = new byte[7];
      byteArray0[1] = (byte)10;
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      BufferedCustomInputStream bufferedCustomInputStream0 = new BufferedCustomInputStream(byteArrayInputStream0, 3202, true);
      Base64Decoder base64Decoder0 = new Base64Decoder(bufferedCustomInputStream0, (OutputStream) null);
      Newzgrabber.verbose = true;
      base64Decoder0.decodeStream();
      assertEquals(1L, base64Decoder0.getLineCount());
  }
}
