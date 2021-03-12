/*
 * This file was automatically generated by EvoSuite
 * Mon Nov 30 09:22:14 GMT 2020
 */

package Newzgrabber;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import Newzgrabber.Base64Decoder;
import Newzgrabber.BufferedCustomInputStream;
import Newzgrabber.Newzgrabber;
import java.io.PrintStream;
import javax.swing.DebugGraphics;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
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
  /*Coverage entropy=0.2868359830561607
  */
  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      MockFileOutputStream mockFileOutputStream0 = new MockFileOutputStream("7kBjC3^W YO>;VL", true);
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("7kBjC3^W YO>;VL");
      FileSystemHandling.appendLineToFile(evoSuiteFile0, "7kBjC3^W YO>;VL");
      MockFileInputStream mockFileInputStream0 = new MockFileInputStream("7kBjC3^W YO>;VL");
      BufferedCustomInputStream bufferedCustomInputStream0 = new BufferedCustomInputStream(mockFileInputStream0, false);
      Base64Decoder base64Decoder0 = new Base64Decoder(bufferedCustomInputStream0, mockFileOutputStream0);
      base64Decoder0.setLineCount((-3375L));
      base64Decoder0.decodeStream();
      //  // Unstable assertion: assertEquals((-9985), mockFileInputStream0.available());
      //  // Unstable assertion: assertEquals((-3374L), base64Decoder0.getLineCount());
  }

  /**
  //Test case number: 1
  /*Coverage entropy=0.2868359830561607
  */
  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      MockFileOutputStream mockFileOutputStream0 = new MockFileOutputStream("7kBjC3^W YO>;VL", true);
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("7kBjC3^W YO>;VL");
      FileSystemHandling.appendLineToFile(evoSuiteFile0, "7kBjC3^W YO>;VL");
      MockFileInputStream mockFileInputStream0 = new MockFileInputStream("7kBjC3^W YO>;VL");
      BufferedCustomInputStream bufferedCustomInputStream0 = new BufferedCustomInputStream(mockFileInputStream0, false);
      Base64Decoder base64Decoder0 = new Base64Decoder(bufferedCustomInputStream0, mockFileOutputStream0);
      base64Decoder0.ProgressSet = true;
      base64Decoder0.decodeStream();
      assertEquals(1L, base64Decoder0.getLineCount());
  }

  /**
  //Test case number: 2
  /*Coverage entropy=0.30463609734923813
  */
  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      MockFileOutputStream mockFileOutputStream0 = new MockFileOutputStream("7kBjC3^W YO>;VL", false);
      MockPrintStream mockPrintStream0 = new MockPrintStream(mockFileOutputStream0, true);
      mockPrintStream0.println(',');
      MockFileInputStream mockFileInputStream0 = new MockFileInputStream("7kBjC3^W YO>;VL");
      BufferedCustomInputStream bufferedCustomInputStream0 = new BufferedCustomInputStream(mockFileInputStream0, false);
      Base64Decoder base64Decoder0 = new Base64Decoder(bufferedCustomInputStream0, mockFileOutputStream0);
      base64Decoder0.setBegin(true);
      base64Decoder0.decodeStream();
      //  // Unstable assertion: assertEquals((-9999), mockFileInputStream0.available());
      //  // Unstable assertion: assertEquals(1L, base64Decoder0.getLineCount());
  }

  /**
  //Test case number: 3
  /*Coverage entropy=0.6365141682948128
  */
  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
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
  //Test case number: 4
  /*Coverage entropy=0.12974069471942834
  */
  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      MockFileOutputStream mockFileOutputStream0 = new MockFileOutputStream("7kBjC3^W YO>;VL", true);
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("7kBjC3^W YO>;VL");
      FileSystemHandling.appendLineToFile(evoSuiteFile0, "7kBjC3^W YO>;VL");
      MockPrintStream mockPrintStream0 = new MockPrintStream(mockFileOutputStream0, true);
      mockPrintStream0.println('R');
      mockPrintStream0.println((float) 'R');
      byte[] byteArray0 = new byte[7];
      byteArray0[0] = (byte) (-126);
      mockFileOutputStream0.write(byteArray0);
      MockFileInputStream mockFileInputStream0 = new MockFileInputStream("7kBjC3^W YO>;VL");
      BufferedCustomInputStream bufferedCustomInputStream0 = new BufferedCustomInputStream(mockFileInputStream0, 3064, false);
      Base64Decoder base64Decoder0 = new Base64Decoder(bufferedCustomInputStream0, mockFileOutputStream0);
      base64Decoder0.decodeStream();
      assertEquals(3L, base64Decoder0.getLineCount());
  }

  /**
  //Test case number: 5
  /*Coverage entropy=0.12693054534140227
  */
  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      MockFileOutputStream mockFileOutputStream0 = new MockFileOutputStream("7kBjC3^W YO>;VL", true);
      MockPrintStream mockPrintStream0 = new MockPrintStream(mockFileOutputStream0, true);
      mockPrintStream0.print(true);
      mockPrintStream0.println((float) 'R');
      MockFileInputStream mockFileInputStream0 = new MockFileInputStream("7kBjC3^W YO>;VL");
      BufferedCustomInputStream bufferedCustomInputStream0 = new BufferedCustomInputStream(mockFileInputStream0, false);
      Base64Decoder base64Decoder0 = new Base64Decoder(bufferedCustomInputStream0, mockFileOutputStream0);
      base64Decoder0.decodeStream();
      //  // Unstable assertion: assertEquals((-9990), mockFileInputStream0.available());
      //  // Unstable assertion: assertEquals(1L, base64Decoder0.getLineCount());
  }

  /**
  //Test case number: 6
  /*Coverage entropy=0.3250829733914482
  */
  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      MockFileOutputStream mockFileOutputStream0 = new MockFileOutputStream("7kBjC3^W YO>;VL", false);
      MockPrintStream mockPrintStream0 = new MockPrintStream(mockFileOutputStream0, true);
      mockPrintStream0.println(',');
      MockFileInputStream mockFileInputStream0 = new MockFileInputStream("7kBjC3^W YO>;VL");
      BufferedCustomInputStream bufferedCustomInputStream0 = new BufferedCustomInputStream(mockFileInputStream0, false);
      Base64Decoder base64Decoder0 = new Base64Decoder(bufferedCustomInputStream0, mockFileOutputStream0);
      bufferedCustomInputStream0.read();
      base64Decoder0.decodeStream();
      assertEquals(1L, base64Decoder0.getLineCount());
  }

  /**
  //Test case number: 7
  /*Coverage entropy=0.3250829733914482
  */
  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      MockFileOutputStream mockFileOutputStream0 = new MockFileOutputStream("7kBjC3^W YO>;VL", false);
      MockPrintStream mockPrintStream0 = new MockPrintStream(mockFileOutputStream0, true);
      mockPrintStream0.println('\"');
      MockFileInputStream mockFileInputStream0 = new MockFileInputStream("7kBjC3^W YO>;VL");
      BufferedCustomInputStream bufferedCustomInputStream0 = new BufferedCustomInputStream(mockFileInputStream0, false);
      Newzgrabber.IsBatch = true;
      Base64Decoder base64Decoder0 = new Base64Decoder(bufferedCustomInputStream0, mockFileOutputStream0);
      base64Decoder0.decodeStream();
      //  // Unstable assertion: assertEquals((-9999), mockFileInputStream0.available());
  }

  /**
  //Test case number: 8
  /*Coverage entropy=0.30463609734923813
  */
  @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      MockFileOutputStream mockFileOutputStream0 = new MockFileOutputStream("7kBjC3^W YO>;VL", true);
      MockPrintStream mockPrintStream0 = new MockPrintStream(mockFileOutputStream0, true);
      mockPrintStream0.println('[');
      MockFileInputStream mockFileInputStream0 = new MockFileInputStream("7kBjC3^W YO>;VL");
      BufferedCustomInputStream bufferedCustomInputStream0 = new BufferedCustomInputStream(mockFileInputStream0, true);
      Base64Decoder base64Decoder0 = new Base64Decoder(bufferedCustomInputStream0, mockFileOutputStream0);
      Newzgrabber.verbose = true;
      base64Decoder0.decodeStream();
      assertEquals(1L, base64Decoder0.getLineCount());
  }
}
