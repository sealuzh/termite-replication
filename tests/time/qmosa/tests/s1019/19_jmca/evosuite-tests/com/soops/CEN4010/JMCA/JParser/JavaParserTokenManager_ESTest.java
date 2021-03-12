/*
 * This file was automatically generated by EvoSuite
 * Mon Nov 30 06:08:29 GMT 2020
 */

package com.soops.CEN4010.JMCA.JParser;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.soops.CEN4010.JMCA.JParser.JavaCharStream;
import com.soops.CEN4010.JMCA.JParser.JavaParserTokenManager;
import com.soops.CEN4010.JMCA.JParser.Token;
import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.io.PipedInputStream;
import java.io.PrintStream;
import java.io.Reader;
import java.io.SequenceInputStream;
import java.io.StringReader;
import java.util.Enumeration;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.evosuite.runtime.mock.java.io.MockFileOutputStream;
import org.evosuite.runtime.mock.java.io.MockPrintStream;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class JavaParserTokenManager_ESTest extends JavaParserTokenManager_ESTest_scaffolding {

  /**
  //Test case number: 0
  /*Coverage entropy=0.6365141682948128
  */
  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      StringReader stringReader0 = new StringReader("bzWX)P<PPu6^-2ftzq");
      JavaCharStream javaCharStream0 = new JavaCharStream(stringReader0);
      JavaParserTokenManager javaParserTokenManager0 = new JavaParserTokenManager(javaCharStream0);
      javaParserTokenManager0.MoreLexicalActions();
  }

  /**
  //Test case number: 1
  /*Coverage entropy=0.8938083176330992
  */
  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      byte[] byteArray0 = new byte[1];
      byteArray0[0] = (byte)100;
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      BufferedInputStream bufferedInputStream0 = new BufferedInputStream(byteArrayInputStream0, 25);
      JavaCharStream javaCharStream0 = new JavaCharStream(bufferedInputStream0, 41, 118);
      JavaParserTokenManager javaParserTokenManager0 = new JavaParserTokenManager(javaCharStream0);
      Token token0 = javaParserTokenManager0.getNextToken();
      assertEquals("d", token0.toString());
      assertEquals(74, token0.kind);
  }

  /**
  //Test case number: 2
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      StringReader stringReader0 = new StringReader("bzWX)P<PPu6^-2ftzq");
      JavaCharStream javaCharStream0 = new JavaCharStream(stringReader0);
      JavaParserTokenManager javaParserTokenManager0 = new JavaParserTokenManager(javaCharStream0);
      byte[] byteArray0 = new byte[1];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      byteArrayInputStream0.skip(1L);
      javaCharStream0.ReInit((InputStream) byteArrayInputStream0);
      Token token0 = javaParserTokenManager0.getNextToken();
      assertEquals("", token0.toString());
      assertEquals(0, token0.kind);
  }

  /**
  //Test case number: 3
  /*Coverage entropy=1.4656336366545697
  */
  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      byte[] byteArray0 = new byte[7];
      byteArray0[0] = (byte)118;
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      BufferedInputStream bufferedInputStream0 = new BufferedInputStream(byteArrayInputStream0, 25);
      JavaCharStream javaCharStream0 = new JavaCharStream(bufferedInputStream0, 41, 25);
      JavaParserTokenManager javaParserTokenManager0 = new JavaParserTokenManager(javaCharStream0);
      javaParserTokenManager0.getNextToken();
      Token token0 = javaParserTokenManager0.jjFillToken();
      assertEquals(0, javaCharStream0.bufpos);
      assertEquals(74, token0.kind);
  }

  /**
  //Test case number: 4
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      JavaCharStream javaCharStream0 = new JavaCharStream((Reader) null, (-2550), (-2550), 1400);
      JavaParserTokenManager javaParserTokenManager0 = new JavaParserTokenManager(javaCharStream0);
      MockFileOutputStream mockFileOutputStream0 = new MockFileOutputStream(",8rKY/>8w2'Fow3,Fk");
      MockPrintStream mockPrintStream0 = new MockPrintStream(mockFileOutputStream0);
      javaParserTokenManager0.setDebugStream(mockPrintStream0);
  }

  /**
  //Test case number: 5
  /*Coverage entropy=0.5623351446188083
  */
  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      byte[] byteArray0 = new byte[6];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      JavaCharStream javaCharStream0 = new JavaCharStream(byteArrayInputStream0, (byte)48, (byte)48);
      JavaParserTokenManager javaParserTokenManager0 = new JavaParserTokenManager(javaCharStream0);
      javaParserTokenManager0.TokenLexicalActions((Token) null);
  }

  /**
  //Test case number: 6
  /*Coverage entropy=1.4656336366545697
  */
  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      byte[] byteArray0 = new byte[7];
      byteArray0[0] = (byte)118;
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      BufferedInputStream bufferedInputStream0 = new BufferedInputStream(byteArrayInputStream0, 25);
      JavaCharStream javaCharStream0 = new JavaCharStream(bufferedInputStream0, 41, 25);
      JavaParserTokenManager javaParserTokenManager0 = new JavaParserTokenManager(javaCharStream0);
      Token token0 = javaParserTokenManager0.getNextToken();
      javaParserTokenManager0.TokenLexicalActions(token0);
      assertEquals(0, javaCharStream0.bufpos);
      assertEquals("v", token0.toString());
  }

  /**
  //Test case number: 7
  /*Coverage entropy=0.6365141682948128
  */
  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      StringReader stringReader0 = new StringReader("bzWX)P<PPu6^-2ftzq");
      JavaCharStream javaCharStream0 = new JavaCharStream(stringReader0);
      JavaParserTokenManager javaParserTokenManager0 = new JavaParserTokenManager(javaCharStream0);
      javaParserTokenManager0.SwitchTo(0);
  }

  /**
  //Test case number: 8
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      byte[] byteArray0 = new byte[6];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      JavaCharStream javaCharStream0 = new JavaCharStream(byteArrayInputStream0, (byte)48, (byte)48);
      JavaParserTokenManager javaParserTokenManager0 = new JavaParserTokenManager(javaCharStream0);
      javaParserTokenManager0.SkipLexicalActions((Token) null);
  }

  /**
  //Test case number: 9
  /*Coverage entropy=1.5607104090414063
  */
  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      JavaParserTokenManager javaParserTokenManager0 = new JavaParserTokenManager((JavaCharStream) null);
      // Undeclared exception!
      try { 
        javaParserTokenManager0.ReInit((JavaCharStream) null, (int) (byte)118);
        fail("Expecting exception: Error");
      
      } catch(Error e) {
         //
         // Error: Ignoring invalid lexical state : 118. State unchanged.
         //
         verifyException("com.soops.CEN4010.JMCA.JParser.JavaParserTokenManager", e);
      }
  }

  /**
  //Test case number: 10
  /*Coverage entropy=1.0397207708399179
  */
  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      StringReader stringReader0 = new StringReader("seR");
      JavaCharStream javaCharStream0 = new JavaCharStream(stringReader0, 955, (byte)0);
      JavaParserTokenManager javaParserTokenManager0 = new JavaParserTokenManager(javaCharStream0);
      javaParserTokenManager0.ReInit((JavaCharStream) null);
  }

  /**
  //Test case number: 11
  /*Coverage entropy=0.6365141682948128
  */
  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      JavaParserTokenManager javaParserTokenManager0 = new JavaParserTokenManager((JavaCharStream) null);
      // Undeclared exception!
      try { 
        javaParserTokenManager0.jjFillToken();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.soops.CEN4010.JMCA.JParser.JavaParserTokenManager", e);
      }
  }

  /**
  //Test case number: 12
  /*Coverage entropy=0.6365141682948128
  */
  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Enumeration<InputStream> enumeration0 = (Enumeration<InputStream>) mock(Enumeration.class, new ViolatedAssumptionAnswer());
      doReturn(false).when(enumeration0).hasMoreElements();
      SequenceInputStream sequenceInputStream0 = new SequenceInputStream(enumeration0);
      JavaCharStream javaCharStream0 = new JavaCharStream(sequenceInputStream0, 537, (-560));
      JavaParserTokenManager javaParserTokenManager0 = new JavaParserTokenManager(javaCharStream0);
      // Undeclared exception!
      try { 
        javaParserTokenManager0.jjFillToken();
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  /**
  //Test case number: 13
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      JavaParserTokenManager javaParserTokenManager0 = new JavaParserTokenManager((JavaCharStream) null);
      // Undeclared exception!
      try { 
        javaParserTokenManager0.getNextToken();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.soops.CEN4010.JMCA.JParser.JavaParserTokenManager", e);
      }
  }

  /**
  //Test case number: 14
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      StringReader stringReader0 = new StringReader("bzWX)P<PPu6^-2ftzq");
      JavaCharStream javaCharStream0 = new JavaCharStream(stringReader0);
      JavaParserTokenManager javaParserTokenManager0 = new JavaParserTokenManager(javaCharStream0);
      byte[] byteArray0 = new byte[5];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0, (-1747), (byte)48);
      javaCharStream0.ReInit((InputStream) byteArrayInputStream0);
      // Undeclared exception!
      try { 
        javaParserTokenManager0.getNextToken();
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.io.ByteArrayInputStream", e);
      }
  }

  /**
  //Test case number: 15
  /*Coverage entropy=1.5498260458782016
  */
  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      StringReader stringReader0 = new StringReader("seR");
      JavaCharStream javaCharStream0 = new JavaCharStream(stringReader0, 0, 36, 0);
      JavaParserTokenManager javaParserTokenManager0 = new JavaParserTokenManager(javaCharStream0);
      // Undeclared exception!
      try { 
        javaParserTokenManager0.ReInit(javaCharStream0, (-1056));
        fail("Expecting exception: Error");
      
      } catch(Error e) {
         //
         // Error: Ignoring invalid lexical state : -1056. State unchanged.
         //
         verifyException("com.soops.CEN4010.JMCA.JParser.JavaParserTokenManager", e);
      }
  }

  /**
  //Test case number: 16
  /*Coverage entropy=1.0397207708399179
  */
  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      StringReader stringReader0 = new StringReader("");
      JavaCharStream javaCharStream0 = new JavaCharStream(stringReader0);
      JavaParserTokenManager javaParserTokenManager0 = null;
      try {
        javaParserTokenManager0 = new JavaParserTokenManager(javaCharStream0, (-3650));
        fail("Expecting exception: Error");
      
      } catch(Error e) {
         //
         // Error: Ignoring invalid lexical state : -3650. State unchanged.
         //
         verifyException("com.soops.CEN4010.JMCA.JParser.JavaParserTokenManager", e);
      }
  }

  /**
  //Test case number: 17
  /*Coverage entropy=0.9220439206503973
  */
  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      PipedInputStream pipedInputStream0 = new PipedInputStream(42);
      JavaCharStream javaCharStream0 = new JavaCharStream(pipedInputStream0);
      JavaParserTokenManager javaParserTokenManager0 = new JavaParserTokenManager(javaCharStream0);
      byte[] byteArray0 = new byte[2];
      byteArray0[0] = (byte)13;
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      javaCharStream0.ReInit((InputStream) byteArrayInputStream0, (-1), 1618);
      // Undeclared exception!
      try { 
        javaParserTokenManager0.getNextToken();
        fail("Expecting exception: Error");
      
      } catch(Error e) {
         //
         // Lexical error at line 0, column 2.  Encountered: <EOF> after : \"\"
         //
         verifyException("com.soops.CEN4010.JMCA.JParser.JavaParserTokenManager", e);
      }
  }

  /**
  //Test case number: 18
  /*Coverage entropy=0.9532710147058912
  */
  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      byte[] byteArray0 = new byte[7];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      BufferedInputStream bufferedInputStream0 = new BufferedInputStream(byteArrayInputStream0, 25);
      JavaCharStream javaCharStream0 = new JavaCharStream(bufferedInputStream0, (byte)0, (byte)0, (-413));
      JavaParserTokenManager javaParserTokenManager0 = new JavaParserTokenManager(javaCharStream0);
      javaParserTokenManager0.curLexState = 479;
      Token token0 = javaParserTokenManager0.getNextToken();
      assertEquals("", token0.toString());
      assertEquals(0, token0.kind);
  }

  /**
  //Test case number: 19
  /*Coverage entropy=0.6365141682948128
  */
  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      byte[] byteArray0 = new byte[6];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      JavaCharStream javaCharStream0 = new JavaCharStream(byteArrayInputStream0, (byte)48, (byte)48);
      JavaParserTokenManager javaParserTokenManager0 = new JavaParserTokenManager(javaCharStream0);
      // Undeclared exception!
      try { 
        javaParserTokenManager0.SwitchTo((-1174));
        fail("Expecting exception: Error");
      
      } catch(Error e) {
         //
         // Error: Ignoring invalid lexical state : -1174. State unchanged.
         //
         verifyException("com.soops.CEN4010.JMCA.JParser.JavaParserTokenManager", e);
      }
  }

  /**
  //Test case number: 20
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      StringReader stringReader0 = new StringReader("bzWX)P<PPu6^-2ftzq");
      JavaCharStream javaCharStream0 = new JavaCharStream(stringReader0);
      JavaParserTokenManager javaParserTokenManager0 = new JavaParserTokenManager(javaCharStream0);
      // Undeclared exception!
      try { 
        javaParserTokenManager0.SwitchTo(17);
        fail("Expecting exception: Error");
      
      } catch(Error e) {
         //
         // Error: Ignoring invalid lexical state : 17. State unchanged.
         //
         verifyException("com.soops.CEN4010.JMCA.JParser.JavaParserTokenManager", e);
      }
  }

  /**
  //Test case number: 21
  /*Coverage entropy=1.1563745537147718
  */
  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      StringReader stringReader0 = new StringReader("bzWX)P<PPu6^-2ftzq");
      JavaCharStream javaCharStream0 = new JavaCharStream(stringReader0);
      JavaParserTokenManager javaParserTokenManager0 = new JavaParserTokenManager(javaCharStream0, 3);
      // Undeclared exception!
      try { 
        javaParserTokenManager0.getNextToken();
        fail("Expecting exception: Error");
      
      } catch(Error e) {
         //
         // Lexical error at line 1, column 19.  Encountered: <EOF> after : \"\"
         //
         verifyException("com.soops.CEN4010.JMCA.JParser.JavaParserTokenManager", e);
      }
  }

  /**
  //Test case number: 22
  /*Coverage entropy=1.1501754406909646
  */
  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      StringReader stringReader0 = new StringReader("vqYNy<(hm+Xy&Y5a");
      JavaCharStream javaCharStream0 = new JavaCharStream(stringReader0);
      byte[] byteArray0 = new byte[2];
      byteArray0[0] = (byte)86;
      byteArray0[1] = (byte) (-107);
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      javaCharStream0.ReInit((InputStream) byteArrayInputStream0);
      JavaParserTokenManager javaParserTokenManager0 = new JavaParserTokenManager(javaCharStream0);
      Token token0 = javaParserTokenManager0.getNextToken();
      assertEquals(0, javaCharStream0.bufpos);
      assertEquals("V", token0.toString());
  }

  /**
  //Test case number: 23
  /*Coverage entropy=0.8473146980437081
  */
  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      byte[] byteArray0 = new byte[4];
      byteArray0[0] = (byte) (-39);
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      JavaCharStream javaCharStream0 = new JavaCharStream(byteArrayInputStream0, 19, 107);
      JavaParserTokenManager javaParserTokenManager0 = new JavaParserTokenManager(javaCharStream0);
      // Undeclared exception!
      try { 
        javaParserTokenManager0.getNextToken();
        fail("Expecting exception: Error");
      
      } catch(Error e) {
         //
         // Lexical error at line 19, column 107.  Encountered: \"\\ufffd\" (65533), after : \"\"
         //
         verifyException("com.soops.CEN4010.JMCA.JParser.JavaParserTokenManager", e);
      }
  }

  /**
  //Test case number: 24
  /*Coverage entropy=1.0751391185242933
  */
  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      StringReader stringReader0 = new StringReader("\"(\"");
      JavaCharStream javaCharStream0 = new JavaCharStream(stringReader0);
      JavaParserTokenManager javaParserTokenManager0 = new JavaParserTokenManager(javaCharStream0);
      Token token0 = javaParserTokenManager0.getNextToken();
      assertEquals(2, javaCharStream0.bufpos);
      assertEquals("\"(\"", token0.toString());
  }

  /**
  //Test case number: 25
  /*Coverage entropy=1.0941618460945948
  */
  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      PipedInputStream pipedInputStream0 = new PipedInputStream(42);
      JavaCharStream javaCharStream0 = new JavaCharStream(pipedInputStream0);
      JavaParserTokenManager javaParserTokenManager0 = new JavaParserTokenManager(javaCharStream0);
      byte[] byteArray0 = new byte[2];
      byteArray0[0] = (byte)34;
      byteArray0[1] = (byte) (-38);
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      javaCharStream0.ReInit((InputStream) byteArrayInputStream0, (-1), 1618);
      // Undeclared exception!
      try { 
        javaParserTokenManager0.getNextToken();
        fail("Expecting exception: Error");
      
      } catch(Error e) {
         //
         // Lexical error at line -1, column 1620.  Encountered: <EOF> after : \"\\\"\\ufffd\"
         //
         verifyException("com.soops.CEN4010.JMCA.JParser.JavaParserTokenManager", e);
      }
  }

  /**
  //Test case number: 26
  /*Coverage entropy=1.0138010299685305
  */
  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      StringReader stringReader0 = new StringReader("<=");
      JavaCharStream javaCharStream0 = new JavaCharStream(stringReader0);
      JavaParserTokenManager javaParserTokenManager0 = new JavaParserTokenManager(javaCharStream0);
      Token token0 = javaParserTokenManager0.getNextToken();
      assertEquals(1, javaCharStream0.getBeginColumn());
      assertEquals("<=", token0.toString());
  }

  /**
  //Test case number: 27
  /*Coverage entropy=1.446952832074304
  */
  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      byte[] byteArray0 = new byte[6];
      byteArray0[0] = (byte)48;
      byteArray0[1] = (byte)100;
      byteArray0[2] = (byte)118;
      byteArray0[3] = (byte)118;
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      JavaCharStream javaCharStream0 = new JavaCharStream(byteArrayInputStream0, (byte)48, (byte)48);
      JavaParserTokenManager javaParserTokenManager0 = new JavaParserTokenManager(javaCharStream0);
      javaParserTokenManager0.getNextToken();
      // Undeclared exception!
      try { 
        javaParserTokenManager0.getNextToken();
       //  fail("Expecting exception: Error");
       // Unstable assertion
      } catch(Error e) {
         //
         // Lexical error at line 48, column 52.  Encountered: \"\" (0), after : \"\"
         //
         verifyException("com.soops.CEN4010.JMCA.JParser.JavaParserTokenManager", e);
      }
  }

  /**
  //Test case number: 28
  /*Coverage entropy=1.484706110656284
  */
  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      StringReader stringReader0 = new StringReader("vqYNy<(hm+Xy&Y5a");
      JavaCharStream javaCharStream0 = new JavaCharStream(stringReader0);
      JavaParserTokenManager javaParserTokenManager0 = new JavaParserTokenManager(javaCharStream0);
      Token token0 = javaParserTokenManager0.getNextToken();
      assertEquals(1, javaCharStream0.bufpos);
      assertEquals("vq", token0.toString());
  }

  /**
  //Test case number: 29
  /*Coverage entropy=1.44602487092306
  */
  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      byte[] byteArray0 = new byte[6];
      byteArray0[0] = (byte)100;
      byteArray0[1] = (byte)100;
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      JavaCharStream javaCharStream0 = new JavaCharStream(byteArrayInputStream0, (-1681), (byte)100, (byte)48);
      JavaParserTokenManager javaParserTokenManager0 = new JavaParserTokenManager(javaCharStream0);
      javaParserTokenManager0.getNextToken();
      assertEquals(1, javaCharStream0.bufpos);
      assertEquals(101, javaCharStream0.getEndColumn());
  }

  /**
  //Test case number: 30
  /*Coverage entropy=1.484765581100645
  */
  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      byte[] byteArray0 = new byte[7];
      byteArray0[0] = (byte)118;
      byteArray0[1] = (byte)48;
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      BufferedInputStream bufferedInputStream0 = new BufferedInputStream(byteArrayInputStream0, 25);
      JavaCharStream javaCharStream0 = new JavaCharStream(bufferedInputStream0, 41, 25);
      JavaParserTokenManager javaParserTokenManager0 = new JavaParserTokenManager(javaCharStream0);
      Token token0 = javaParserTokenManager0.getNextToken();
      assertEquals(1, javaCharStream0.bufpos);
      assertEquals("v0", token0.toString());
  }

  /**
  //Test case number: 31
  /*Coverage entropy=1.4842494367964643
  */
  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      byte[] byteArray0 = new byte[7];
      byteArray0[0] = (byte)118;
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      BufferedInputStream bufferedInputStream0 = new BufferedInputStream(byteArrayInputStream0, 25);
      JavaCharStream javaCharStream0 = new JavaCharStream(bufferedInputStream0, 41, 25);
      JavaParserTokenManager javaParserTokenManager0 = new JavaParserTokenManager(javaCharStream0);
      Token token0 = javaParserTokenManager0.getNextToken();
      javaParserTokenManager0.SkipLexicalActions(token0);
      assertEquals(0, javaCharStream0.bufpos);
      assertEquals(25, javaCharStream0.getEndColumn());
  }

  /**
  //Test case number: 32
  /*Coverage entropy=0.9819082920250901
  */
  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      StringReader stringReader0 = new StringReader("q(F");
      JavaCharStream javaCharStream0 = new JavaCharStream(stringReader0);
      JavaParserTokenManager javaParserTokenManager0 = new JavaParserTokenManager(javaCharStream0);
      javaParserTokenManager0.getNextToken();
      assertEquals(0, javaCharStream0.bufpos);
      assertEquals(1, javaCharStream0.getEndColumn());
  }

  /**
  //Test case number: 33
  /*Coverage entropy=1.484706110656284
  */
  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      StringReader stringReader0 = new StringReader("fE^)j");
      JavaCharStream javaCharStream0 = new JavaCharStream(stringReader0, (byte) (-54), 4);
      JavaParserTokenManager javaParserTokenManager0 = new JavaParserTokenManager(javaCharStream0);
      javaParserTokenManager0.getNextToken();
      assertEquals(1, javaCharStream0.bufpos);
      assertEquals(5, javaCharStream0.getColumn());
  }

  /**
  //Test case number: 34
  /*Coverage entropy=1.0193490318034903
  */
  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      StringReader stringReader0 = new StringReader("7ZS4q");
      JavaCharStream javaCharStream0 = new JavaCharStream(stringReader0, 32, 3);
      JavaParserTokenManager javaParserTokenManager0 = new JavaParserTokenManager(javaCharStream0);
      javaParserTokenManager0.getNextToken();
      Token token0 = javaParserTokenManager0.getNextToken();
      //  // Unstable assertion: assertEquals(0, javaCharStream0.bufpos);
      //  // Unstable assertion: assertEquals("", token0.toString());
  }

  /**
  //Test case number: 35
  /*Coverage entropy=1.4392086918474156
  */
  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      StringReader stringReader0 = new StringReader("V/kNeq9l");
      JavaCharStream javaCharStream0 = new JavaCharStream(stringReader0);
      JavaParserTokenManager javaParserTokenManager0 = new JavaParserTokenManager(javaCharStream0);
      javaParserTokenManager0.getNextToken();
      Token token0 = javaParserTokenManager0.getNextToken();
      assertEquals(2, javaCharStream0.getBeginColumn());
      assertEquals("/", token0.toString());
  }

  /**
  //Test case number: 36
  /*Coverage entropy=0.9764391162865441
  */
  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      StringReader stringReader0 = new StringReader("QqU6FG=S]yIy0");
      JavaCharStream javaCharStream0 = new JavaCharStream(stringReader0);
      JavaParserTokenManager javaParserTokenManager0 = new JavaParserTokenManager(javaCharStream0);
      javaParserTokenManager0.getNextToken();
      assertEquals(5, javaCharStream0.bufpos);
      assertEquals(6, javaCharStream0.getColumn());
  }

  /**
  //Test case number: 37
  /*Coverage entropy=1.0269482440272482
  */
  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      StringReader stringReader0 = new StringReader("zWX)P<PZPu6-2ftzq");
      JavaCharStream javaCharStream0 = new JavaCharStream(stringReader0);
      JavaParserTokenManager javaParserTokenManager0 = new JavaParserTokenManager(javaCharStream0);
      javaParserTokenManager0.getNextToken();
      javaParserTokenManager0.getNextToken();
      javaParserTokenManager0.getNextToken();
      assertEquals(0, javaCharStream0.bufpos);
      assertEquals(5, javaCharStream0.getBeginColumn());
  }

  /**
  //Test case number: 38
  /*Coverage entropy=0.9819082920250901
  */
  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      StringReader stringReader0 = new StringReader("vqYNy<(hm+Xy&Y5a");
      JavaCharStream javaCharStream0 = new JavaCharStream(stringReader0);
      byte[] byteArray0 = new byte[7];
      byteArray0[0] = (byte)76;
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      javaCharStream0.ReInit((InputStream) byteArrayInputStream0, 955, 0);
      JavaParserTokenManager javaParserTokenManager0 = new JavaParserTokenManager(javaCharStream0);
      Token token0 = javaParserTokenManager0.getNextToken();
      assertEquals("L", token0.toString());
      assertEquals(74, token0.kind);
  }

  /**
  //Test case number: 39
  /*Coverage entropy=1.0127497063081896
  */
  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      StringReader stringReader0 = new StringReader(">=");
      JavaCharStream javaCharStream0 = new JavaCharStream(stringReader0, 2394, 2394);
      JavaParserTokenManager javaParserTokenManager0 = new JavaParserTokenManager(javaCharStream0);
      Token token0 = javaParserTokenManager0.getNextToken();
      assertEquals(1, javaCharStream0.bufpos);
      assertEquals(">=", token0.toString());
  }

  /**
  //Test case number: 40
  /*Coverage entropy=1.0697807613410533
  */
  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      byte[] byteArray0 = new byte[6];
      byteArray0[0] = (byte)48;
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      JavaCharStream javaCharStream0 = new JavaCharStream(byteArrayInputStream0, (byte)48, (byte)48);
      JavaParserTokenManager javaParserTokenManager0 = new JavaParserTokenManager(javaCharStream0);
      Token token0 = javaParserTokenManager0.getNextToken();
      assertEquals(48, javaCharStream0.getBeginColumn());
      assertEquals("0", token0.toString());
  }

  /**
  //Test case number: 41
  /*Coverage entropy=1.0306373313301378
  */
  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      byte[] byteArray0 = new byte[4];
      byteArray0[0] = (byte)36;
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      JavaCharStream javaCharStream0 = new JavaCharStream(byteArrayInputStream0, 32, 986, (byte)48);
      JavaParserTokenManager javaParserTokenManager0 = new JavaParserTokenManager(javaCharStream0);
      Token token0 = javaParserTokenManager0.getNextToken();
      assertEquals("$", token0.toString());
      assertEquals(74, token0.kind);
  }

  /**
  //Test case number: 42
  /*Coverage entropy=1.0116795282501614
  */
  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      StringReader stringReader0 = new StringReader("!=");
      JavaCharStream javaCharStream0 = new JavaCharStream(stringReader0);
      JavaParserTokenManager javaParserTokenManager0 = new JavaParserTokenManager(javaCharStream0);
      Token token0 = javaParserTokenManager0.getNextToken();
      assertEquals(1, javaCharStream0.getBeginColumn());
      assertEquals(96, token0.kind);
  }

  /**
  //Test case number: 43
  /*Coverage entropy=1.4602783505053993
  */
  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      StringReader stringReader0 = new StringReader("bzWX$P<PPu6^-2tzq");
      JavaCharStream javaCharStream0 = new JavaCharStream(stringReader0);
      JavaParserTokenManager javaParserTokenManager0 = new JavaParserTokenManager(javaCharStream0);
      javaParserTokenManager0.getNextToken();
      javaParserTokenManager0.getNextToken();
      assertEquals(6, javaCharStream0.bufpos);
      assertEquals(7, javaCharStream0.getEndColumn());
  }

  /**
  //Test case number: 44
  /*Coverage entropy=1.4486587653829366
  */
  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      StringReader stringReader0 = new StringReader("e/TN q9l");
      JavaCharStream javaCharStream0 = new JavaCharStream(stringReader0);
      JavaParserTokenManager javaParserTokenManager0 = new JavaParserTokenManager(javaCharStream0);
      javaParserTokenManager0.getNextToken();
      Token token0 = javaParserTokenManager0.getNextToken();
      assertEquals(1, javaCharStream0.bufpos);
      assertEquals(104, token0.kind);
  }

  /**
  //Test case number: 45
  /*Coverage entropy=1.5498260458782016
  */
  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      StringReader stringReader0 = new StringReader("seR");
      JavaCharStream javaCharStream0 = new JavaCharStream(stringReader0, (byte)76, 79, (byte)100);
      JavaParserTokenManager javaParserTokenManager0 = new JavaParserTokenManager(javaCharStream0);
      javaParserTokenManager0.ReInit(javaCharStream0, (int) (byte)0);
      assertEquals((-1), javaCharStream0.bufpos);
  }

  /**
  //Test case number: 46
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      StringReader stringReader0 = new StringReader("vqYNy<(hm+Xy&Y5a");
      JavaCharStream javaCharStream0 = new JavaCharStream(stringReader0);
      JavaParserTokenManager javaParserTokenManager0 = new JavaParserTokenManager(javaCharStream0);
      javaParserTokenManager0.setDebugStream((PrintStream) null);
  }

  /**
  //Test case number: 47
  /*Coverage entropy=1.3282503361840323
  */
  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      StringReader stringReader0 = new StringReader("bzWX)P<PPu6^-2ftzq");
      JavaCharStream javaCharStream0 = new JavaCharStream(stringReader0);
      JavaParserTokenManager javaParserTokenManager0 = new JavaParserTokenManager(javaCharStream0, 1);
      // Undeclared exception!
      try { 
        javaParserTokenManager0.getNextToken();
        fail("Expecting exception: Error");
      
      } catch(Error e) {
         //
         // Lexical error at line 1, column 19.  Encountered: <EOF> after : \"\"
         //
         verifyException("com.soops.CEN4010.JMCA.JParser.JavaParserTokenManager", e);
      }
  }

  /**
  //Test case number: 48
  /*Coverage entropy=1.0098626702750524
  */
  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      StringReader stringReader0 = new StringReader("7.S4q");
      JavaCharStream javaCharStream0 = new JavaCharStream(stringReader0, 32, 3);
      JavaParserTokenManager javaParserTokenManager0 = new JavaParserTokenManager(javaCharStream0);
      javaParserTokenManager0.getNextToken();
      assertEquals(1, javaCharStream0.bufpos);
      assertEquals(4, javaCharStream0.getEndColumn());
  }

  /**
  //Test case number: 49
  /*Coverage entropy=1.0397207708399179
  */
  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      PipedInputStream pipedInputStream0 = new PipedInputStream(42);
      JavaCharStream javaCharStream0 = new JavaCharStream(pipedInputStream0);
      JavaParserTokenManager javaParserTokenManager0 = new JavaParserTokenManager(javaCharStream0);
      javaParserTokenManager0.ReInit(javaCharStream0);
      assertEquals((-1), javaCharStream0.bufpos);
  }

  /**
  //Test case number: 50
  /*Coverage entropy=1.5027442963479314
  */
  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      StringReader stringReader0 = new StringReader("seR");
      JavaCharStream javaCharStream0 = new JavaCharStream(stringReader0, (-229), 2394);
      JavaParserTokenManager javaParserTokenManager0 = new JavaParserTokenManager(javaCharStream0);
      javaParserTokenManager0.getNextToken();
      assertEquals(2, javaCharStream0.bufpos);
      assertEquals(2396, javaCharStream0.getColumn());
  }
}
