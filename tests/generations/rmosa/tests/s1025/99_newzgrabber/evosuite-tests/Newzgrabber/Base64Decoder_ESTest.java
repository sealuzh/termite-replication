/*
 * This file was automatically generated by EvoSuite
 * Mon Nov 09 15:20:19 GMT 2020
 */

package Newzgrabber;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import Newzgrabber.Base64Decoder;
import Newzgrabber.BufferedCustomInputStream;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.PrintStream;
import javax.swing.DebugGraphics;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.io.MockFileOutputStream;
import org.evosuite.runtime.mock.java.io.MockPrintStream;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class Base64Decoder_ESTest extends Base64Decoder_ESTest_scaffolding {

  /**
  //Test case number: 0
  /*Coverage entropy=0.30463609734923813
  */
  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      byte[] byteArray0 = new byte[9];
      byteArray0[1] = (byte)10;
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      BufferedCustomInputStream bufferedCustomInputStream0 = new BufferedCustomInputStream(byteArrayInputStream0, false);
      MockFileOutputStream mockFileOutputStream0 = new MockFileOutputStream("sq7~Z2IX%d22f H");
      Base64Decoder base64Decoder0 = new Base64Decoder(bufferedCustomInputStream0, mockFileOutputStream0);
      base64Decoder0.LineCount = (-2771L);
      base64Decoder0.decodeStream();
      assertEquals((-2770L), base64Decoder0.getLineCount());
  }

  /**
  //Test case number: 1
  /*Coverage entropy=0.15407610367102942
  */
  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      byte[] byteArray0 = new byte[6];
      byteArray0[0] = (byte)61;
      byteArray0[4] = (byte)10;
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      ByteArrayInputStream byteArrayInputStream1 = new ByteArrayInputStream(byteArray0);
      BufferedCustomInputStream bufferedCustomInputStream0 = new BufferedCustomInputStream(byteArrayInputStream0, false);
      MockFileOutputStream mockFileOutputStream0 = new MockFileOutputStream("sq7~Z2IX%d22f H");
      Base64Decoder base64Decoder0 = new Base64Decoder(bufferedCustomInputStream0, mockFileOutputStream0);
      base64Decoder0.setReader(byteArrayInputStream1);
      Base64Decoder base64Decoder1 = new Base64Decoder(bufferedCustomInputStream0, mockFileOutputStream0);
      base64Decoder1.decodeStream();
      try { 
        base64Decoder0.decodeStream();
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.evosuite.runtime.mock.java.io.MockFileOutputStream", e);
      }
  }

  /**
  //Test case number: 2
  /*Coverage entropy=0.13579395875159386
  */
  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      byte[] byteArray0 = new byte[7];
      byteArray0[0] = (byte)10;
      byteArray0[1] = (byte)54;
      byteArray0[2] = (byte)54;
      byteArray0[3] = (byte)54;
      byteArray0[4] = (byte)61;
      byteArray0[5] = (byte)10;
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      BufferedCustomInputStream bufferedCustomInputStream0 = new BufferedCustomInputStream(byteArrayInputStream0, false);
      MockFileOutputStream mockFileOutputStream0 = new MockFileOutputStream("sq7~Z2IX%d22f H", false);
      Base64Decoder base64Decoder0 = new Base64Decoder(bufferedCustomInputStream0, mockFileOutputStream0);
      base64Decoder0.decodeStream();
      assertEquals(2L, base64Decoder0.getLineCount());
  }

  /**
  //Test case number: 3
  /*Coverage entropy=0.13906079845474112
  */
  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      byte[] byteArray0 = new byte[9];
      byteArray0[0] = (byte)54;
      byteArray0[1] = (byte)61;
      byteArray0[4] = (byte)10;
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      BufferedCustomInputStream bufferedCustomInputStream0 = new BufferedCustomInputStream(byteArrayInputStream0, false);
      MockFileOutputStream mockFileOutputStream0 = new MockFileOutputStream("sq7~Z2IX%d22f H");
      Base64Decoder base64Decoder0 = new Base64Decoder(bufferedCustomInputStream0, mockFileOutputStream0);
      base64Decoder0.decodeStream();
      assertEquals(1L, base64Decoder0.getLineCount());
  }

  /**
  //Test case number: 4
  /*Coverage entropy=0.13579395875159386
  */
  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      byte[] byteArray0 = new byte[9];
      byteArray0[3] = (byte)10;
      byteArray0[4] = (byte)54;
      byteArray0[5] = (byte)54;
      byteArray0[6] = (byte)61;
      byteArray0[8] = (byte)10;
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      BufferedCustomInputStream bufferedCustomInputStream0 = new BufferedCustomInputStream(byteArrayInputStream0, true);
      MockFileOutputStream mockFileOutputStream0 = new MockFileOutputStream("6O");
      Base64Decoder base64Decoder0 = new Base64Decoder(bufferedCustomInputStream0, mockFileOutputStream0);
      base64Decoder0.decodeStream();
      assertEquals(2L, base64Decoder0.getLineCount());
  }

  /**
  //Test case number: 5
  /*Coverage entropy=0.15841057013179086
  */
  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      byte[] byteArray0 = new byte[7];
      byteArray0[0] = (byte)47;
      byteArray0[4] = (byte)10;
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      BufferedCustomInputStream bufferedCustomInputStream0 = new BufferedCustomInputStream(byteArrayInputStream0, false);
      MockFileOutputStream mockFileOutputStream0 = new MockFileOutputStream("Newzgrabber.MimeDecoder");
      Base64Decoder base64Decoder0 = new Base64Decoder(bufferedCustomInputStream0, mockFileOutputStream0);
      base64Decoder0.decodeStream();
      assertEquals(1L, base64Decoder0.getLineCount());
  }

  /**
  //Test case number: 6
  /*Coverage entropy=0.17884491271684755
  */
  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      byte[] byteArray0 = new byte[9];
      byteArray0[1] = (byte)10;
      byteArray0[5] = (byte)43;
      byteArray0[6] = (byte)10;
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      BufferedCustomInputStream bufferedCustomInputStream0 = new BufferedCustomInputStream(byteArrayInputStream0, false);
      MockFileOutputStream mockFileOutputStream0 = new MockFileOutputStream("sq7~Z2IX%d22f H");
      Base64Decoder base64Decoder0 = new Base64Decoder(bufferedCustomInputStream0, mockFileOutputStream0);
      base64Decoder0.decodeStream();
      assertEquals(2L, base64Decoder0.getLineCount());
  }

  /**
  //Test case number: 7
  /*Coverage entropy=0.167944147734173
  */
  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      byte[] byteArray0 = new byte[9];
      byteArray0[2] = (byte)101;
      byteArray0[4] = (byte)10;
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      BufferedCustomInputStream bufferedCustomInputStream0 = new BufferedCustomInputStream(byteArrayInputStream0, true);
      MockFileOutputStream mockFileOutputStream0 = new MockFileOutputStream("\u00B3");
      MockPrintStream mockPrintStream0 = new MockPrintStream(mockFileOutputStream0);
      Base64Decoder base64Decoder0 = new Base64Decoder(bufferedCustomInputStream0, mockPrintStream0);
      base64Decoder0.decodeStream();
      assertEquals(1L, base64Decoder0.getLineCount());
  }

  /**
  //Test case number: 8
  /*Coverage entropy=0.15841057013179086
  */
  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      byte[] byteArray0 = new byte[9];
      byteArray0[0] = (byte) (-94);
      byteArray0[4] = (byte)10;
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      BufferedCustomInputStream bufferedCustomInputStream0 = new BufferedCustomInputStream(byteArrayInputStream0, true);
      MockFileOutputStream mockFileOutputStream0 = new MockFileOutputStream("\u00B3");
      MockPrintStream mockPrintStream0 = new MockPrintStream(mockFileOutputStream0);
      Base64Decoder base64Decoder0 = new Base64Decoder(bufferedCustomInputStream0, mockPrintStream0);
      base64Decoder0.decodeStream();
      assertEquals(1L, base64Decoder0.getLineCount());
  }

  /**
  //Test case number: 9
  /*Coverage entropy=0.17884491271684755
  */
  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      byte[] byteArray0 = new byte[9];
      byteArray0[1] = (byte)77;
      byteArray0[4] = (byte)10;
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      BufferedCustomInputStream bufferedCustomInputStream0 = new BufferedCustomInputStream(byteArrayInputStream0, true);
      MockFileOutputStream mockFileOutputStream0 = new MockFileOutputStream("\u00B3");
      MockPrintStream mockPrintStream0 = new MockPrintStream(mockFileOutputStream0);
      Base64Decoder base64Decoder0 = new Base64Decoder(bufferedCustomInputStream0, mockPrintStream0);
      base64Decoder0.decodeStream();
      assertEquals(1L, base64Decoder0.getLineCount());
  }

  /**
  //Test case number: 10
  /*Coverage entropy=0.1732052067491771
  */
  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      byte[] byteArray0 = new byte[9];
      byteArray0[1] = (byte)10;
      byteArray0[6] = (byte)10;
      byteArray0[7] = (byte)10;
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      BufferedCustomInputStream bufferedCustomInputStream0 = new BufferedCustomInputStream(byteArrayInputStream0, true);
      MockFileOutputStream mockFileOutputStream0 = new MockFileOutputStream("sq7~Z2IX%d22f H");
      Base64Decoder base64Decoder0 = new Base64Decoder(bufferedCustomInputStream0, mockFileOutputStream0);
      base64Decoder0.setLineCount((byte)47);
      base64Decoder0.decodeStream();
      assertEquals(50L, base64Decoder0.getLineCount());
  }

  /**
  //Test case number: 11
  /*Coverage entropy=0.5004024235381879
  */
  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      byte[] byteArray0 = new byte[9];
      byteArray0[1] = (byte)10;
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      BufferedCustomInputStream bufferedCustomInputStream0 = new BufferedCustomInputStream(byteArrayInputStream0, true);
      MockFileOutputStream mockFileOutputStream0 = new MockFileOutputStream(".");
      Base64Decoder base64Decoder0 = new Base64Decoder(bufferedCustomInputStream0, mockFileOutputStream0);
      base64Decoder0.ABORT = true;
      base64Decoder0.decodeStream();
      assertEquals(0L, base64Decoder0.getLineCount());
  }

  /**
  //Test case number: 12
  /*Coverage entropy=0.6365141682948128
  */
  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
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
