/*
 * This file was automatically generated by EvoSuite
 * Mon Nov 30 03:03:39 GMT 2020
 */

package Newzgrabber;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import Newzgrabber.Base64Decoder;
import Newzgrabber.BufferedCustomInputStream;
import Newzgrabber.Newzgrabber;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.InputStream;
import java.io.OutputStream;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.io.MockFile;
import org.evosuite.runtime.mock.java.io.MockFileInputStream;
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
      BufferedCustomInputStream bufferedCustomInputStream0 = new BufferedCustomInputStream((InputStream) null, 1432, true);
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("mK[v9/mK[v90.tmp");
      FileSystemHandling.appendStringToFile(evoSuiteFile0, "R'Jy8/fC");
      FileSystemHandling.appendLineToFile(evoSuiteFile0, ".");
      MockFile mockFile0 = new MockFile((String) null, "mK[v9");
      File file0 = MockFile.createTempFile("mK[v9", (String) null, (File) mockFile0);
      MockFileInputStream mockFileInputStream0 = new MockFileInputStream(file0);
      mockFileInputStream0.read();
      Base64Decoder base64Decoder0 = new Base64Decoder(bufferedCustomInputStream0, (OutputStream) null);
      base64Decoder0.setReader(mockFileInputStream0);
      base64Decoder0.decodeStream();
      assertEquals(1L, base64Decoder0.getLineCount());
  }

  /**
  //Test case number: 1
  /*Coverage entropy=0.12169240267806193
  */
  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("mK[v9/mK[v90.tmp");
      MockFile mockFile0 = new MockFile((String) null, "mK[v9");
      File file0 = MockFile.createTempFile("mK[v9", (String) null, (File) mockFile0);
      MockFileInputStream mockFileInputStream0 = new MockFileInputStream(file0);
      FileSystemHandling.appendLineToFile(evoSuiteFile0, "vU+W13 ljn-5");
      BufferedCustomInputStream bufferedCustomInputStream0 = new BufferedCustomInputStream(mockFileInputStream0);
      ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream(2665);
      Base64Decoder base64Decoder0 = new Base64Decoder(bufferedCustomInputStream0, byteArrayOutputStream0);
      base64Decoder0.decodeStream();
      //  // Unstable assertion: assertEquals((-9988), mockFileInputStream0.available());
      //  // Unstable assertion: assertEquals(1L, base64Decoder0.getLineCount());
  }

  /**
  //Test case number: 2
  /*Coverage entropy=0.1425058673927378
  */
  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("mK[v9/mK[v90.tmp");
      MockFile mockFile0 = new MockFile((String) null, "mK[v9");
      File file0 = MockFile.createTempFile("mK[v9", (String) null, (File) mockFile0);
      MockFileInputStream mockFileInputStream0 = new MockFileInputStream(file0);
      FileSystemHandling.appendLineToFile(evoSuiteFile0, "vU+W13 ljn-5");
      BufferedCustomInputStream bufferedCustomInputStream0 = new BufferedCustomInputStream(mockFileInputStream0);
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
  //Test case number: 3
  /*Coverage entropy=0.37677016125643675
  */
  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      BufferedCustomInputStream bufferedCustomInputStream0 = new BufferedCustomInputStream((InputStream) null, 1432, true);
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("mK[v9/mK[v90.tmp");
      FileSystemHandling.appendStringToFile(evoSuiteFile0, ".");
      FileSystemHandling.appendLineToFile(evoSuiteFile0, ".");
      MockFile mockFile0 = new MockFile((String) null, "mK[v9");
      File file0 = MockFile.createTempFile("mK[v9", (String) null, (File) mockFile0);
      MockFileInputStream mockFileInputStream0 = new MockFileInputStream(file0);
      mockFileInputStream0.read();
      Base64Decoder base64Decoder0 = new Base64Decoder(bufferedCustomInputStream0, (OutputStream) null);
      base64Decoder0.setReader(mockFileInputStream0);
      base64Decoder0.decodeStream();
      assertEquals(1L, base64Decoder0.getLineCount());
  }

  /**
  //Test case number: 4
  /*Coverage entropy=0.25731864054383163
  */
  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("mK[v9/mK[v90.tmp");
      FileSystemHandling.appendLineToFile(evoSuiteFile0, "");
      FileSystemHandling.appendLineToFile(evoSuiteFile0, "Mfo`)\">%%");
      FileSystemHandling.appendLineToFile(evoSuiteFile0, "");
      MockFile mockFile0 = new MockFile((String) null, "mK[v9");
      File file0 = MockFile.createTempFile("mK[v9", (String) null, (File) mockFile0);
      MockFileInputStream mockFileInputStream0 = new MockFileInputStream(file0);
      BufferedCustomInputStream bufferedCustomInputStream0 = new BufferedCustomInputStream(mockFileInputStream0, 92, true);
      Base64Decoder base64Decoder0 = new Base64Decoder(bufferedCustomInputStream0, (OutputStream) null);
      base64Decoder0.setLineCount((-1078L));
      base64Decoder0.decodeStream();
      assertEquals((-1075L), base64Decoder0.getLineCount());
  }

  /**
  //Test case number: 5
  /*Coverage entropy=0.3250829733914482
  */
  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      BufferedCustomInputStream bufferedCustomInputStream0 = new BufferedCustomInputStream((InputStream) null, 1432, true);
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("mK[v9/mK[v90.tmp");
      FileSystemHandling.appendLineToFile(evoSuiteFile0, "$");
      MockFile mockFile0 = new MockFile((String) null, "mK[v9");
      File file0 = MockFile.createTempFile("mK[v9", (String) null, (File) mockFile0);
      MockFileInputStream mockFileInputStream0 = new MockFileInputStream(file0);
      Base64Decoder base64Decoder0 = new Base64Decoder(bufferedCustomInputStream0, (OutputStream) null);
      base64Decoder0.setReader(mockFileInputStream0);
      Newzgrabber.IsBatch = true;
      base64Decoder0.decodeStream();
      assertEquals(0L, base64Decoder0.getLineCount());
  }

  /**
  //Test case number: 6
  /*Coverage entropy=0.5004024235381879
  */
  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      BufferedCustomInputStream bufferedCustomInputStream0 = new BufferedCustomInputStream((InputStream) null, 1432, true);
      Base64Decoder base64Decoder0 = new Base64Decoder(bufferedCustomInputStream0, (OutputStream) null);
      base64Decoder0.ABORT = true;
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("mK[v9/mK[v90.tmp");
      FileSystemHandling.appendLineToFile(evoSuiteFile0, "");
      MockFile mockFile0 = new MockFile((String) null, "mK[v9");
      File file0 = MockFile.createTempFile("mK[v9", (String) null, (File) mockFile0);
      MockFileInputStream mockFileInputStream0 = new MockFileInputStream(file0);
      base64Decoder0.setReader(mockFileInputStream0);
      base64Decoder0.decodeStream();
      assertEquals(0L, base64Decoder0.getLineCount());
  }

  /**
  //Test case number: 7
  /*Coverage entropy=0.3250829733914482
  */
  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      BufferedCustomInputStream bufferedCustomInputStream0 = new BufferedCustomInputStream((InputStream) null, 1432, true);
      Base64Decoder base64Decoder0 = new Base64Decoder(bufferedCustomInputStream0, (OutputStream) null);
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("mK[v9/mK[v90.tmp");
      FileSystemHandling.appendLineToFile(evoSuiteFile0, "");
      MockFile mockFile0 = new MockFile((String) null, "mK[v9");
      File file0 = MockFile.createTempFile("mK[v9", (String) null, (File) mockFile0);
      MockFileInputStream mockFileInputStream0 = new MockFileInputStream(file0);
      Newzgrabber.verbose = true;
      base64Decoder0.setReader(mockFileInputStream0);
      base64Decoder0.decodeStream();
      assertEquals(1L, base64Decoder0.getLineCount());
  }
}
