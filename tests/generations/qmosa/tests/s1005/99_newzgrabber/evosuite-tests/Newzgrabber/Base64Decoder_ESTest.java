/*
 * This file was automatically generated by EvoSuite
 * Tue Nov 10 09:34:26 GMT 2020
 */

package Newzgrabber;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import Newzgrabber.Base64Decoder;
import Newzgrabber.BufferedCustomInputStream;
import java.io.FileDescriptor;
import java.io.OutputStream;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Locale;
import java.util.PriorityQueue;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.io.MockFile;
import org.evosuite.runtime.mock.java.io.MockFileInputStream;
import org.evosuite.runtime.mock.java.io.MockFileOutputStream;
import org.evosuite.runtime.mock.java.io.MockPrintStream;
import org.evosuite.runtime.testdata.EvoSuiteFile;
import org.evosuite.runtime.testdata.FileSystemHandling;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class Base64Decoder_ESTest extends Base64Decoder_ESTest_scaffolding {

  /**
  //Test case number: 0
  /*Coverage entropy=0.14999492361041503
  */
  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      PipedInputStream pipedInputStream0 = new PipedInputStream(355);
      BufferedCustomInputStream bufferedCustomInputStream0 = new BufferedCustomInputStream(pipedInputStream0);
      PipedOutputStream pipedOutputStream0 = new PipedOutputStream(pipedInputStream0);
      MockPrintStream mockPrintStream0 = new MockPrintStream(pipedOutputStream0);
      Locale locale0 = Locale.TRADITIONAL_CHINESE;
      mockPrintStream0.println('3');
      mockPrintStream0.println((float) 355);
      String string0 = "There was a parse error!\n";
      Object[] objectArray0 = new Object[0];
      mockPrintStream0.printf(locale0, "There was a parse error!\n", objectArray0);
      Base64Decoder base64Decoder0 = new Base64Decoder(bufferedCustomInputStream0, (OutputStream) null);
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
  /*Coverage entropy=0.15407610367102942
  */
  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      PipedInputStream pipedInputStream0 = new PipedInputStream(355);
      BufferedCustomInputStream bufferedCustomInputStream0 = new BufferedCustomInputStream(pipedInputStream0);
      PipedOutputStream pipedOutputStream0 = new PipedOutputStream(pipedInputStream0);
      MockPrintStream mockPrintStream0 = new MockPrintStream(pipedOutputStream0);
      Locale locale0 = Locale.TRADITIONAL_CHINESE;
      mockPrintStream0.println('%');
      ArrayList<Locale.LanguageRange> arrayList0 = new ArrayList<Locale.LanguageRange>();
      PriorityQueue<String> priorityQueue0 = new PriorityQueue<String>();
      Locale.filterTags((List<Locale.LanguageRange>) arrayList0, (Collection<String>) priorityQueue0);
      pipedInputStream0.read();
      String string0 = "There was a parse error!\n";
      Object[] objectArray0 = new Object[0];
      mockPrintStream0.printf(locale0, "There was a parse error!\n", objectArray0);
      Base64Decoder base64Decoder0 = new Base64Decoder(bufferedCustomInputStream0, (OutputStream) null);
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
  /*Coverage entropy=0.6365141682948128
  */
  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      FileDescriptor fileDescriptor0 = new FileDescriptor();
      MockFileInputStream mockFileInputStream0 = new MockFileInputStream(fileDescriptor0);
      BufferedCustomInputStream bufferedCustomInputStream0 = new BufferedCustomInputStream(mockFileInputStream0, 122, true);
      MockFile mockFile0 = new MockFile("\u001E", "\u001E");
      MockFileOutputStream mockFileOutputStream0 = new MockFileOutputStream(mockFile0);
      byte[] byteArray0 = new byte[6];
      byteArray0[0] = (byte) (-119);
      byteArray0[1] = (byte)65;
      byteArray0[2] = (byte)30;
      byteArray0[3] = (byte)77;
      byteArray0[4] = (byte)20;
      byteArray0[5] = (byte)24;
      FileSystemHandling.appendDataToFile((EvoSuiteFile) null, byteArray0);
      Base64Decoder base64Decoder0 = new Base64Decoder(bufferedCustomInputStream0, mockFileOutputStream0);
      base64Decoder0.decodeStream();
      assertEquals(0L, base64Decoder0.getLineCount());
  }
}
