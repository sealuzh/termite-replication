/*
 * This file was automatically generated by EvoSuite
 * Mon Nov 30 05:12:28 GMT 2020
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
import java.io.ObjectOutputStream;
import java.io.PrintStream;
import javax.swing.DebugGraphics;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.io.MockPrintStream;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class Base64Decoder_ESTest extends Base64Decoder_ESTest_scaffolding {

  /**
  //Test case number: 0
  /*Coverage entropy=0.17884491271684755
  */
  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      byte[] byteArray0 = new byte[8];
      byteArray0[1] = (byte)10;
      byteArray0[6] = (byte)10;
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      BufferedCustomInputStream bufferedCustomInputStream0 = new BufferedCustomInputStream(byteArrayInputStream0);
      PrintStream printStream0 = DebugGraphics.logStream();
      Base64Decoder base64Decoder0 = new Base64Decoder(bufferedCustomInputStream0, printStream0);
      base64Decoder0.setLineCount((-1476L));
      base64Decoder0.decodeStream();
      assertEquals((-1474L), base64Decoder0.getLineCount());
  }

  /**
  //Test case number: 1
  /*Coverage entropy=0.6365141682948128
  */
  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream();
      Base64Decoder base64Decoder0 = new Base64Decoder((BufferedCustomInputStream) null, byteArrayOutputStream0);
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
  /*Coverage entropy=0.15407610367102942
  */
  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      byte[] byteArray0 = new byte[8];
      byteArray0[0] = (byte)61;
      byteArray0[4] = (byte)10;
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      BufferedCustomInputStream bufferedCustomInputStream0 = new BufferedCustomInputStream(byteArrayInputStream0);
      PrintStream printStream0 = DebugGraphics.logStream();
      Base64Decoder base64Decoder0 = new Base64Decoder(bufferedCustomInputStream0, printStream0);
      base64Decoder0.decodeStream();
      assertEquals(1L, base64Decoder0.getLineCount());
  }

  /**
  //Test case number: 3
  /*Coverage entropy=0.13579395875159386
  */
  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      byte[] byteArray0 = new byte[8];
      byteArray0[0] = (byte)81;
      byteArray0[4] = (byte)10;
      byteArray0[1] = (byte)61;
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      PrintStream printStream0 = DebugGraphics.logStream();
      BufferedCustomInputStream bufferedCustomInputStream0 = new BufferedCustomInputStream(byteArrayInputStream0);
      Base64Decoder base64Decoder0 = new Base64Decoder(bufferedCustomInputStream0, printStream0);
      base64Decoder0.decodeStream();
      assertEquals(1L, base64Decoder0.getLineCount());
  }

  /**
  //Test case number: 4
  /*Coverage entropy=0.18490739916777568
  */
  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      byte[] byteArray0 = new byte[8];
      byteArray0[4] = (byte)10;
      byteArray0[2] = (byte)47;
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      PrintStream printStream0 = DebugGraphics.logStream();
      BufferedCustomInputStream bufferedCustomInputStream0 = new BufferedCustomInputStream(byteArrayInputStream0, false);
      Base64Decoder base64Decoder0 = new Base64Decoder(bufferedCustomInputStream0, printStream0);
      base64Decoder0.decodeStream();
      assertEquals(1L, base64Decoder0.getLineCount());
  }

  /**
  //Test case number: 5
  /*Coverage entropy=0.18490739916777568
  */
  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      byte[] byteArray0 = new byte[8];
      byteArray0[1] = (byte)43;
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
  /*Coverage entropy=0.1732052067491771
  */
  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      byte[] byteArray0 = new byte[8];
      byteArray0[5] = (byte)53;
      byteArray0[1] = (byte)10;
      byteArray0[6] = (byte)10;
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      BufferedCustomInputStream bufferedCustomInputStream0 = new BufferedCustomInputStream(byteArrayInputStream0);
      PrintStream printStream0 = DebugGraphics.logStream();
      Base64Decoder base64Decoder0 = new Base64Decoder(bufferedCustomInputStream0, printStream0);
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
      byteArray0[2] = (byte)122;
      byteArray0[8] = (byte)10;
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      BufferedCustomInputStream bufferedCustomInputStream0 = new BufferedCustomInputStream(byteArrayInputStream0);
      PrintStream printStream0 = DebugGraphics.logStream();
      ObjectOutputStream objectOutputStream0 = new ObjectOutputStream(printStream0);
      Base64Decoder base64Decoder0 = new Base64Decoder(bufferedCustomInputStream0, objectOutputStream0);
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
      byteArray0[0] = (byte) (-62);
      byteArray0[8] = (byte)10;
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      BufferedCustomInputStream bufferedCustomInputStream0 = new BufferedCustomInputStream(byteArrayInputStream0);
      PrintStream printStream0 = DebugGraphics.logStream();
      ObjectOutputStream objectOutputStream0 = new ObjectOutputStream(printStream0);
      Base64Decoder base64Decoder0 = new Base64Decoder(bufferedCustomInputStream0, objectOutputStream0);
      base64Decoder0.decodeStream();
      assertEquals(1L, base64Decoder0.getLineCount());
  }

  /**
  //Test case number: 9
  /*Coverage entropy=0.2868359830561607
  */
  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      byte[] byteArray0 = new byte[6];
      byteArray0[5] = (byte)10;
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      BufferedCustomInputStream bufferedCustomInputStream0 = new BufferedCustomInputStream(byteArrayInputStream0);
      PrintStream printStream0 = DebugGraphics.logStream();
      Base64Decoder base64Decoder0 = new Base64Decoder(bufferedCustomInputStream0, printStream0);
      base64Decoder0.decodeStream();
      assertEquals(1L, base64Decoder0.getLineCount());
  }

  /**
  //Test case number: 10
  /*Coverage entropy=0.37677016125643675
  */
  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      byte[] byteArray0 = new byte[9];
      byteArray0[0] = (byte)46;
      byteArray0[1] = (byte)10;
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      BufferedCustomInputStream bufferedCustomInputStream0 = new BufferedCustomInputStream(byteArrayInputStream0);
      PrintStream printStream0 = DebugGraphics.logStream();
      Base64Decoder base64Decoder0 = new Base64Decoder(bufferedCustomInputStream0, printStream0);
      base64Decoder0.decodeStream();
      assertEquals(1L, base64Decoder0.getLineCount());
  }

  /**
  //Test case number: 11
  /*Coverage entropy=0.34883209584303193
  */
  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      byte[] byteArray0 = new byte[7];
      byteArray0[0] = (byte)10;
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      BufferedCustomInputStream bufferedCustomInputStream0 = new BufferedCustomInputStream(byteArrayInputStream0);
      PrintStream printStream0 = DebugGraphics.logStream();
      Base64Decoder base64Decoder0 = new Base64Decoder(bufferedCustomInputStream0, printStream0);
      Newzgrabber.IsBatch = true;
      base64Decoder0.decodeStream();
      assertEquals(0L, base64Decoder0.getLineCount());
  }

  /**
  //Test case number: 12
  /*Coverage entropy=0.5004024235381879
  */
  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      byte[] byteArray0 = new byte[10];
      byteArray0[4] = (byte)10;
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      PrintStream printStream0 = DebugGraphics.logStream();
      MockPrintStream mockPrintStream0 = new MockPrintStream(printStream0);
      BufferedCustomInputStream bufferedCustomInputStream0 = new BufferedCustomInputStream(byteArrayInputStream0, (byte)10, true);
      Base64Decoder base64Decoder0 = new Base64Decoder(bufferedCustomInputStream0, mockPrintStream0);
      base64Decoder0.ABORT = true;
      base64Decoder0.decodeStream();
      assertEquals(0L, base64Decoder0.getLineCount());
  }

  /**
  //Test case number: 13
  /*Coverage entropy=0.3250829733914482
  */
  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      byte[] byteArray0 = new byte[4];
      byteArray0[0] = (byte)10;
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      BufferedCustomInputStream bufferedCustomInputStream0 = new BufferedCustomInputStream(byteArrayInputStream0);
      PrintStream printStream0 = DebugGraphics.logStream();
      MockPrintStream mockPrintStream0 = new MockPrintStream(printStream0);
      Base64Decoder base64Decoder0 = new Base64Decoder(bufferedCustomInputStream0, mockPrintStream0);
      Newzgrabber.verbose = true;
      base64Decoder0.decodeStream();
      assertEquals(1L, base64Decoder0.getLineCount());
  }
}
