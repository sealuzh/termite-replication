/*
 * This file was automatically generated by EvoSuite
 * Mon Nov 30 04:27:21 GMT 2020
 */

package com.soops.CEN4010.JMCA.JParser;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.soops.CEN4010.JMCA.JParser.JavaCharStream;
import com.soops.CEN4010.JMCA.JParser.JavaParserTokenManager;
import com.soops.CEN4010.JMCA.JParser.Token;
import java.io.PrintStream;
import java.io.Reader;
import java.io.StringReader;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
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
      StringReader stringReader0 = new StringReader("+-\"~P<");
      JavaCharStream javaCharStream0 = new JavaCharStream(stringReader0, 75, (-1718), 91);
      JavaParserTokenManager javaParserTokenManager0 = new JavaParserTokenManager(javaCharStream0);
      javaParserTokenManager0.MoreLexicalActions();
  }

  /**
  //Test case number: 1
  /*Coverage entropy=1.479244764012638
  */
  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      StringReader stringReader0 = new StringReader("n {Q");
      JavaCharStream javaCharStream0 = new JavaCharStream(stringReader0);
      JavaParserTokenManager javaParserTokenManager0 = new JavaParserTokenManager(javaCharStream0);
      javaParserTokenManager0.getNextToken();
      assertEquals(1, javaCharStream0.getBeginColumn());
      
      JavaCharStream javaCharStream1 = new JavaCharStream(stringReader0, 0, 0);
      JavaParserTokenManager javaParserTokenManager1 = new JavaParserTokenManager(javaCharStream1);
      Token token0 = javaParserTokenManager1.getNextToken();
      assertEquals(0, token0.kind);
  }

  /**
  //Test case number: 2
  /*Coverage entropy=1.4656336366545697
  */
  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      StringReader stringReader0 = new StringReader("n {Q");
      JavaCharStream javaCharStream0 = new JavaCharStream(stringReader0);
      JavaParserTokenManager javaParserTokenManager0 = new JavaParserTokenManager(javaCharStream0);
      javaParserTokenManager0.getNextToken();
      Token token0 = javaParserTokenManager0.jjFillToken();
      assertEquals(0, javaCharStream0.bufpos);
      assertEquals("n", token0.toString());
  }

  /**
  //Test case number: 3
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      StringReader stringReader0 = new StringReader("bup+DLyn8TzW?VCMGP");
      JavaCharStream javaCharStream0 = new JavaCharStream(stringReader0, 3, 41);
      JavaParserTokenManager javaParserTokenManager0 = new JavaParserTokenManager(javaCharStream0);
      javaParserTokenManager0.setDebugStream((PrintStream) null);
  }

  /**
  //Test case number: 4
  /*Coverage entropy=0.5623351446188083
  */
  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      StringReader stringReader0 = new StringReader("n {Q");
      JavaCharStream javaCharStream0 = new JavaCharStream(stringReader0);
      JavaParserTokenManager javaParserTokenManager0 = new JavaParserTokenManager(javaCharStream0);
      javaParserTokenManager0.TokenLexicalActions((Token) null);
  }

  /**
  //Test case number: 5
  /*Coverage entropy=0.5623351446188083
  */
  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      StringReader stringReader0 = new StringReader("+-\"~P<");
      JavaCharStream javaCharStream0 = new JavaCharStream(stringReader0, 75, (-1718), 91);
      JavaParserTokenManager javaParserTokenManager0 = new JavaParserTokenManager(javaCharStream0);
      Token token0 = new Token();
      javaParserTokenManager0.TokenLexicalActions(token0);
      assertEquals(0, token0.endLine);
  }

  /**
  //Test case number: 6
  /*Coverage entropy=0.6365141682948128
  */
  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      StringReader stringReader0 = new StringReader("");
      JavaCharStream javaCharStream0 = new JavaCharStream(stringReader0);
      JavaParserTokenManager javaParserTokenManager0 = new JavaParserTokenManager(javaCharStream0);
      // Undeclared exception!
      try { 
        javaParserTokenManager0.SwitchTo((-1));
        fail("Expecting exception: Error");
      
      } catch(Error e) {
         //
         // Error: Ignoring invalid lexical state : -1. State unchanged.
         //
         verifyException("com.soops.CEN4010.JMCA.JParser.JavaParserTokenManager", e);
      }
  }

  /**
  //Test case number: 7
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      StringReader stringReader0 = new StringReader("final");
      JavaCharStream javaCharStream0 = new JavaCharStream(stringReader0);
      JavaParserTokenManager javaParserTokenManager0 = new JavaParserTokenManager(javaCharStream0);
      javaParserTokenManager0.SkipLexicalActions((Token) null);
  }

  /**
  //Test case number: 8
  /*Coverage entropy=1.5498260458782016
  */
  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      StringReader stringReader0 = new StringReader("n {Q");
      JavaCharStream javaCharStream0 = new JavaCharStream(stringReader0);
      JavaParserTokenManager javaParserTokenManager0 = new JavaParserTokenManager(javaCharStream0);
      javaParserTokenManager0.ReInit((JavaCharStream) null, 0);
  }

  /**
  //Test case number: 9
  /*Coverage entropy=1.3296613488547582
  */
  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      StringReader stringReader0 = new StringReader("Ous");
      JavaCharStream javaCharStream0 = new JavaCharStream(stringReader0);
      JavaParserTokenManager javaParserTokenManager0 = new JavaParserTokenManager(javaCharStream0);
      javaParserTokenManager0.ReInit((JavaCharStream) null);
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
  //Test case number: 10
  /*Coverage entropy=0.6365141682948128
  */
  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      StringReader stringReader0 = new StringReader("qtBw2+(U&");
      JavaCharStream javaCharStream0 = new JavaCharStream(stringReader0);
      JavaParserTokenManager javaParserTokenManager0 = new JavaParserTokenManager(javaCharStream0);
      // Undeclared exception!
      try { 
        javaParserTokenManager0.jjFillToken();
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -1
         //
         verifyException("com.soops.CEN4010.JMCA.JParser.JavaCharStream", e);
      }
  }

  /**
  //Test case number: 11
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      JavaCharStream javaCharStream0 = new JavaCharStream((Reader) null, (byte)0, 99, 63);
      JavaParserTokenManager javaParserTokenManager0 = new JavaParserTokenManager(javaCharStream0);
      // Undeclared exception!
      try { 
        javaParserTokenManager0.getNextToken();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  /**
  //Test case number: 12
  /*Coverage entropy=0.8816849802035469
  */
  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      StringReader stringReader0 = new StringReader("IN_SINGLE_LINE_COMMENT");
      JavaCharStream javaCharStream0 = new JavaCharStream(stringReader0);
      int[] intArray0 = new int[2];
      javaCharStream0.bufline = intArray0;
      JavaParserTokenManager javaParserTokenManager0 = new JavaParserTokenManager(javaCharStream0);
      // Undeclared exception!
      try { 
        javaParserTokenManager0.getNextToken();
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
      StringReader stringReader0 = new StringReader("final");
      JavaCharStream javaCharStream0 = new JavaCharStream(stringReader0);
      JavaParserTokenManager javaParserTokenManager0 = new JavaParserTokenManager(javaCharStream0);
      // Undeclared exception!
      try { 
        javaParserTokenManager0.SwitchTo(21);
        fail("Expecting exception: Error");
      
      } catch(Error e) {
         //
         // Error: Ignoring invalid lexical state : 21. State unchanged.
         //
         verifyException("com.soops.CEN4010.JMCA.JParser.JavaParserTokenManager", e);
      }
  }

  /**
  //Test case number: 14
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      JavaParserTokenManager javaParserTokenManager0 = null;
      try {
        javaParserTokenManager0 = new JavaParserTokenManager((JavaCharStream) null, 4);
        fail("Expecting exception: Error");
      
      } catch(Error e) {
         //
         // Error: Ignoring invalid lexical state : 4. State unchanged.
         //
         verifyException("com.soops.CEN4010.JMCA.JParser.JavaParserTokenManager", e);
      }
  }

  /**
  //Test case number: 15
  /*Coverage entropy=1.4842494367964643
  */
  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      StringReader stringReader0 = new StringReader("n {Q");
      JavaCharStream javaCharStream0 = new JavaCharStream(stringReader0);
      JavaParserTokenManager javaParserTokenManager0 = new JavaParserTokenManager(javaCharStream0);
      Token token0 = javaParserTokenManager0.getNextToken();
      javaParserTokenManager0.SkipLexicalActions(token0);
      assertEquals(0, javaCharStream0.bufpos);
      assertEquals(74, token0.kind);
  }

  /**
  //Test case number: 16
  /*Coverage entropy=1.351039415837016
  */
  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      StringReader stringReader0 = new StringReader("n {Q");
      JavaCharStream javaCharStream0 = new JavaCharStream(stringReader0);
      JavaParserTokenManager javaParserTokenManager0 = new JavaParserTokenManager(javaCharStream0);
      javaParserTokenManager0.defaultLexState = 1755;
      javaParserTokenManager0.ReInit(javaCharStream0);
      Token token0 = javaParserTokenManager0.getNextToken();
      assertEquals(0, token0.kind);
      assertEquals("", token0.toString());
  }

  /**
  //Test case number: 17
  /*Coverage entropy=1.5498260458782016
  */
  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      StringReader stringReader0 = new StringReader(">7dR=H#HN");
      JavaCharStream javaCharStream0 = new JavaCharStream(stringReader0, 75, (-1718), 91);
      JavaParserTokenManager javaParserTokenManager0 = new JavaParserTokenManager(javaCharStream0);
      // Undeclared exception!
      try { 
        javaParserTokenManager0.ReInit(javaCharStream0, (-2516));
        fail("Expecting exception: Error");
      
      } catch(Error e) {
         //
         // Error: Ignoring invalid lexical state : -2516. State unchanged.
         //
         verifyException("com.soops.CEN4010.JMCA.JParser.JavaParserTokenManager", e);
      }
  }

  /**
  //Test case number: 18
  /*Coverage entropy=1.5607104090414063
  */
  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      StringReader stringReader0 = new StringReader("+-\"~P<");
      JavaCharStream javaCharStream0 = new JavaCharStream(stringReader0);
      JavaParserTokenManager javaParserTokenManager0 = new JavaParserTokenManager(javaCharStream0);
      // Undeclared exception!
      try { 
        javaParserTokenManager0.ReInit(javaCharStream0, (int) (byte)4);
        fail("Expecting exception: Error");
      
      } catch(Error e) {
         //
         // Error: Ignoring invalid lexical state : 4. State unchanged.
         //
         verifyException("com.soops.CEN4010.JMCA.JParser.JavaParserTokenManager", e);
      }
  }

  /**
  //Test case number: 19
  /*Coverage entropy=1.4474443845111415
  */
  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      StringReader stringReader0 = new StringReader("+-\"~P<");
      JavaCharStream javaCharStream0 = new JavaCharStream(stringReader0, 75, (-1718), 91);
      JavaParserTokenManager javaParserTokenManager0 = new JavaParserTokenManager(javaCharStream0);
      javaParserTokenManager0.ReInit(javaCharStream0, 2);
      // Undeclared exception!
      try { 
        javaParserTokenManager0.getNextToken();
        fail("Expecting exception: Error");
      
      } catch(Error e) {
         //
         // Lexical error at line 75, column -1712.  Encountered: <EOF> after : \"\"
         //
         verifyException("com.soops.CEN4010.JMCA.JParser.JavaParserTokenManager", e);
      }
  }

  /**
  //Test case number: 20
  /*Coverage entropy=1.1563745537147718
  */
  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      StringReader stringReader0 = new StringReader("n {Q");
      JavaCharStream javaCharStream0 = new JavaCharStream(stringReader0);
      JavaParserTokenManager javaParserTokenManager0 = new JavaParserTokenManager(javaCharStream0, 3);
      // Undeclared exception!
      try { 
        javaParserTokenManager0.getNextToken();
        fail("Expecting exception: Error");
      
      } catch(Error e) {
         //
         // Lexical error at line 1, column 5.  Encountered: <EOF> after : \"\"
         //
         verifyException("com.soops.CEN4010.JMCA.JParser.JavaParserTokenManager", e);
      }
  }

  /**
  //Test case number: 21
  /*Coverage entropy=1.484765581100645
  */
  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      StringReader stringReader0 = new StringReader("n6-Q");
      JavaCharStream javaCharStream0 = new JavaCharStream(stringReader0);
      JavaParserTokenManager javaParserTokenManager0 = new JavaParserTokenManager(javaCharStream0);
      javaParserTokenManager0.getNextToken();
      assertEquals(1, javaCharStream0.bufpos);
      assertEquals(2, javaCharStream0.getColumn());
  }

  /**
  //Test case number: 22
  /*Coverage entropy=0.9027921220531956
  */
  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      StringReader stringReader0 = new StringReader("|");
      JavaCharStream javaCharStream0 = new JavaCharStream(stringReader0, 104, 627);
      JavaParserTokenManager javaParserTokenManager0 = new JavaParserTokenManager(javaCharStream0);
      Token token0 = javaParserTokenManager0.getNextToken();
      assertEquals(106, token0.kind);
      assertEquals("|", token0.toString());
  }

  /**
  //Test case number: 23
  /*Coverage entropy=0.9764391162865441
  */
  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      StringReader stringReader0 = new StringReader("qtBw2+(U&");
      JavaCharStream javaCharStream0 = new JavaCharStream(stringReader0);
      JavaParserTokenManager javaParserTokenManager0 = new JavaParserTokenManager(javaCharStream0);
      javaParserTokenManager0.getNextToken();
      assertEquals(4, javaCharStream0.bufpos);
      assertEquals(5, javaCharStream0.getColumn());
  }

  /**
  //Test case number: 24
  /*Coverage entropy=1.0315904656919421
  */
  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      StringReader stringReader0 = new StringReader("Ous");
      JavaCharStream javaCharStream0 = new JavaCharStream(stringReader0);
      JavaParserTokenManager javaParserTokenManager0 = new JavaParserTokenManager(javaCharStream0);
      javaParserTokenManager0.getNextToken();
      assertEquals(2, javaCharStream0.bufpos);
      assertEquals(3, javaCharStream0.getColumn());
  }

  /**
  //Test case number: 25
  /*Coverage entropy=1.0219097488356494
  */
  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      StringReader stringReader0 = new StringReader("KR\"3R@P\u0006S-");
      JavaCharStream javaCharStream0 = new JavaCharStream(stringReader0);
      JavaParserTokenManager javaParserTokenManager0 = new JavaParserTokenManager(javaCharStream0);
      javaParserTokenManager0.getNextToken();
      // Undeclared exception!
      try { 
        javaParserTokenManager0.getNextToken();
        fail("Expecting exception: Error");
      
      } catch(Error e) {
         //
         // Lexical error at line 1, column 11.  Encountered: <EOF> after : \"\\\"3R@P\\u0006S-\"
         //
         verifyException("com.soops.CEN4010.JMCA.JParser.JavaParserTokenManager", e);
      }
  }

  /**
  //Test case number: 26
  /*Coverage entropy=1.4636410738505634
  */
  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      StringReader stringReader0 = new StringReader("+-\"~P<");
      JavaCharStream javaCharStream0 = new JavaCharStream(stringReader0, 75, (-1718), 91);
      JavaParserTokenManager javaParserTokenManager0 = new JavaParserTokenManager(javaCharStream0);
      javaParserTokenManager0.getNextToken();
      Token token0 = javaParserTokenManager0.getNextToken();
      assertEquals(1, javaCharStream0.bufpos);
      assertEquals(102, token0.kind);
  }

  /**
  //Test case number: 27
  /*Coverage entropy=0.9958088040183395
  */
  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      StringReader stringReader0 = new StringReader("\"^=\"");
      JavaCharStream javaCharStream0 = new JavaCharStream(stringReader0);
      JavaParserTokenManager javaParserTokenManager0 = new JavaParserTokenManager(javaCharStream0);
      Token token0 = javaParserTokenManager0.getNextToken();
      assertEquals(3, javaCharStream0.bufpos);
      assertEquals(73, token0.kind);
  }

  /**
  //Test case number: 28
  /*Coverage entropy=1.8017637482593678
  */
  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      StringReader stringReader0 = new StringReader("final");
      JavaCharStream javaCharStream0 = new JavaCharStream(stringReader0);
      JavaParserTokenManager javaParserTokenManager0 = new JavaParserTokenManager(javaCharStream0);
      Token token0 = javaParserTokenManager0.getNextToken();
      assertEquals(4, javaCharStream0.bufpos);
      assertEquals(31, token0.kind);
  }

  /**
  //Test case number: 29
  /*Coverage entropy=1.5566318787646847
  */
  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      StringReader stringReader0 = new StringReader("void");
      JavaCharStream javaCharStream0 = new JavaCharStream(stringReader0);
      JavaParserTokenManager javaParserTokenManager0 = new JavaParserTokenManager(javaCharStream0);
      Token token0 = javaParserTokenManager0.getNextToken();
      assertEquals(1, javaCharStream0.getBeginColumn());
      assertEquals(63, token0.kind);
  }

  /**
  //Test case number: 30
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      StringReader stringReader0 = new StringReader("+-\"~P<");
      JavaCharStream javaCharStream0 = new JavaCharStream(stringReader0, 75, (-1718), 91);
      JavaParserTokenManager javaParserTokenManager0 = new JavaParserTokenManager(javaCharStream0);
      MockPrintStream mockPrintStream0 = new MockPrintStream(javaParserTokenManager0.debugStream, true);
      javaParserTokenManager0.setDebugStream(mockPrintStream0);
  }

  /**
  //Test case number: 31
  /*Coverage entropy=1.539399977540178
  */
  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      StringReader stringReader0 = new StringReader("n {Q");
      JavaCharStream javaCharStream0 = new JavaCharStream(stringReader0);
      JavaParserTokenManager javaParserTokenManager0 = new JavaParserTokenManager(javaCharStream0);
      javaParserTokenManager0.ReInit(javaCharStream0, 1);
      // Undeclared exception!
      try { 
        javaParserTokenManager0.getNextToken();
        fail("Expecting exception: Error");
      
      } catch(Error e) {
         //
         // Lexical error at line 1, column 5.  Encountered: <EOF> after : \"\"
         //
         verifyException("com.soops.CEN4010.JMCA.JParser.JavaParserTokenManager", e);
      }
  }

  /**
  //Test case number: 32
  /*Coverage entropy=1.4872205113138597
  */
  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      StringReader stringReader0 = new StringReader(">7dR=H#HN");
      JavaCharStream javaCharStream0 = new JavaCharStream(stringReader0, 75, (-1718), 91);
      JavaParserTokenManager javaParserTokenManager0 = new JavaParserTokenManager(javaCharStream0);
      javaParserTokenManager0.getNextToken();
      // Undeclared exception!
      try { 
        javaParserTokenManager0.getNextToken();
       //  fail("Expecting exception: ArrayIndexOutOfBoundsException");
       // Unstable assertion
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -1
         //
         verifyException("com.soops.CEN4010.JMCA.JParser.JavaParserTokenManager", e);
      }
  }

  /**
  //Test case number: 33
  /*Coverage entropy=1.4879340810295307
  */
  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      StringReader stringReader0 = new StringReader("n {Q");
      JavaCharStream javaCharStream0 = new JavaCharStream(stringReader0);
      JavaParserTokenManager javaParserTokenManager0 = new JavaParserTokenManager(javaCharStream0);
      javaParserTokenManager0.getNextToken();
      javaParserTokenManager0.getNextToken();
      assertEquals(0, javaCharStream0.bufpos);
      
      Token token0 = javaParserTokenManager0.getNextToken();
      assertEquals("Q", token0.toString());
  }
}
