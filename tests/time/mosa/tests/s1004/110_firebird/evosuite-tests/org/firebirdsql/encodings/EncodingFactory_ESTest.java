/*
 * This file was automatically generated by EvoSuite
 * Wed Dec 04 18:11:24 GMT 2019
 */

package org.firebirdsql.encodings;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.firebirdsql.encodings.Encoding;
import org.firebirdsql.encodings.EncodingFactory;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class EncodingFactory_ESTest extends EncodingFactory_ESTest_scaffolding {

  /**
  //Test case number: 0
  /*Coverage entropy=0.4615384615384615
  */
  @Test(timeout = 4000)
  public void test000()  throws Throwable  {
      Encoding encoding0 = EncodingFactory.createEncoding("-");
      EncodingFactory.getJavaEncoding("-");
      EncodingFactory.getJavaEncodingForAlias("-");
      char[] charArray0 = new char[3];
      charArray0[0] = '\\';
      charArray0[1] = '`';
      charArray0[2] = '4';
      Encoding encoding1 = EncodingFactory.getEncoding("utf8", charArray0);
      assertFalse(encoding1.equals((Object)encoding0));
  }

  /**
  //Test case number: 1
  /*Coverage entropy=0.3333333333333333
  */
  @Test(timeout = 4000)
  public void test001()  throws Throwable  {
      // Undeclared exception!
      try { 
        EncodingFactory.getEncoding("Cp1256", (char[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  /**
  //Test case number: 2
  /*Coverage entropy=0.3333333333333333
  */
  @Test(timeout = 4000)
  public void test002()  throws Throwable  {
      Encoding encoding0 = EncodingFactory.createEncoding("ISO8859_8");
      assertNotNull(encoding0);
  }

  /**
  //Test case number: 3
  /*Coverage entropy=0.3333333333333333
  */
  @Test(timeout = 4000)
  public void test003()  throws Throwable  {
      Encoding encoding0 = EncodingFactory.createEncoding("Cp1256");
      assertNotNull(encoding0);
  }

  /**
  //Test case number: 4
  /*Coverage entropy=0.4
  */
  @Test(timeout = 4000)
  public void test004()  throws Throwable  {
      EncodingFactory encodingFactory0 = new EncodingFactory();
      Encoding encoding0 = EncodingFactory.getEncoding("Cp1256", encodingFactory0.DEFAULT_MAPPING);
      assertNotNull(encoding0);
  }

  /**
  //Test case number: 5
  /*Coverage entropy=0.3333333333333333
  */
  @Test(timeout = 4000)
  public void test005()  throws Throwable  {
      Encoding encoding0 = EncodingFactory.getEncoding("NONE", (char[]) null);
      assertNotNull(encoding0);
  }

  /**
  //Test case number: 6
  /*Coverage entropy=0.3333333333333333
  */
  @Test(timeout = 4000)
  public void test006()  throws Throwable  {
      Encoding encoding0 = EncodingFactory.createEncoding("Cp1250");
      assertNotNull(encoding0);
  }

  /**
  //Test case number: 7
  /*Coverage entropy=0.3333333333333333
  */
  @Test(timeout = 4000)
  public void test007()  throws Throwable  {
      Encoding encoding0 = EncodingFactory.createEncoding("ISO8859_7");
      assertNotNull(encoding0);
  }

  /**
  //Test case number: 8
  /*Coverage entropy=0.3333333333333333
  */
  @Test(timeout = 4000)
  public void test008()  throws Throwable  {
      Encoding encoding0 = EncodingFactory.createEncoding("ISO8859_3");
      assertNotNull(encoding0);
  }

  /**
  //Test case number: 9
  /*Coverage entropy=0.3333333333333333
  */
  @Test(timeout = 4000)
  public void test009()  throws Throwable  {
      // Undeclared exception!
      try { 
        EncodingFactory.getEncoding("Cp775", (char[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  /**
  //Test case number: 10
  /*Coverage entropy=0.3333333333333333
  */
  @Test(timeout = 4000)
  public void test010()  throws Throwable  {
      // Undeclared exception!
      try { 
        EncodingFactory.getEncoding("Cp1250", (char[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  /**
  //Test case number: 11
  /*Coverage entropy=0.3333333333333333
  */
  @Test(timeout = 4000)
  public void test011()  throws Throwable  {
      // Undeclared exception!
      try { 
        EncodingFactory.getEncoding("ISO8859_8", (char[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  /**
  //Test case number: 12
  /*Coverage entropy=0.4
  */
  @Test(timeout = 4000)
  public void test012()  throws Throwable  {
      Encoding encoding0 = EncodingFactory.getEncoding("ISO8859_8");
      assertNotNull(encoding0);
  }

  /**
  //Test case number: 13
  /*Coverage entropy=0.4
  */
  @Test(timeout = 4000)
  public void test013()  throws Throwable  {
      Encoding encoding0 = EncodingFactory.getEncoding("Cp1256");
      assertNotNull(encoding0);
  }

  /**
  //Test case number: 14
  /*Coverage entropy=0.3333333333333333
  */
  @Test(timeout = 4000)
  public void test014()  throws Throwable  {
      Encoding encoding0 = EncodingFactory.createEncoding("Cp857");
      assertNotNull(encoding0);
  }

  /**
  //Test case number: 15
  /*Coverage entropy=0.4736842105263158
  */
  @Test(timeout = 4000)
  public void test015()  throws Throwable  {
      EncodingFactory.getJavaEncodingForAlias("ISO8859_13");
      EncodingFactory.createEncoding("Cp775");
      EncodingFactory.createEncoding("Cp861");
      char[] charArray0 = new char[8];
      charArray0[4] = 'm';
      EncodingFactory.getEncoding("yUqr", charArray0);
      EncodingFactory.getEncoding("utf8");
      String string0 = EncodingFactory.getIscEncoding("N>o");
      assertNull(string0);
  }

  /**
  //Test case number: 16
  /*Coverage entropy=0.3333333333333333
  */
  @Test(timeout = 4000)
  public void test016()  throws Throwable  {
      // Undeclared exception!
      try { 
        EncodingFactory.getEncoding("Cp865", (char[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  /**
  //Test case number: 17
  /*Coverage entropy=0.3333333333333333
  */
  @Test(timeout = 4000)
  public void test017()  throws Throwable  {
      // Undeclared exception!
      try { 
        EncodingFactory.getEncoding("Cp1254", (char[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  /**
  //Test case number: 18
  /*Coverage entropy=0.3333333333333333
  */
  @Test(timeout = 4000)
  public void test018()  throws Throwable  {
      Encoding encoding0 = EncodingFactory.createEncoding("Cp1254");
      assertNotNull(encoding0);
  }

  /**
  //Test case number: 19
  /*Coverage entropy=0.3333333333333333
  */
  @Test(timeout = 4000)
  public void test019()  throws Throwable  {
      Encoding encoding0 = EncodingFactory.createEncoding("Cp860");
      assertNotNull(encoding0);
  }

  /**
  //Test case number: 20
  /*Coverage entropy=0.3333333333333333
  */
  @Test(timeout = 4000)
  public void test020()  throws Throwable  {
      // Undeclared exception!
      try { 
        EncodingFactory.getEncoding("ISO8859_4", (char[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  /**
  //Test case number: 21
  /*Coverage entropy=0.3333333333333333
  */
  @Test(timeout = 4000)
  public void test021()  throws Throwable  {
      char[] charArray0 = new char[0];
      // Undeclared exception!
      try { 
        EncodingFactory.getEncoding("Cp863", charArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  /**
  //Test case number: 22
  /*Coverage entropy=0.3333333333333333
  */
  @Test(timeout = 4000)
  public void test022()  throws Throwable  {
      Encoding encoding0 = EncodingFactory.createEncoding("ISO8859_4");
      assertNotNull(encoding0);
  }

  /**
  //Test case number: 23
  /*Coverage entropy=0.3333333333333333
  */
  @Test(timeout = 4000)
  public void test023()  throws Throwable  {
      // Undeclared exception!
      try { 
        EncodingFactory.getEncoding("Cp1252", (char[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  /**
  //Test case number: 24
  /*Coverage entropy=0.3333333333333333
  */
  @Test(timeout = 4000)
  public void test024()  throws Throwable  {
      Encoding encoding0 = EncodingFactory.createEncoding("Cp1255");
      assertNotNull(encoding0);
  }

  /**
  //Test case number: 25
  /*Coverage entropy=0.3333333333333333
  */
  @Test(timeout = 4000)
  public void test025()  throws Throwable  {
      char[] charArray0 = new char[0];
      // Undeclared exception!
      try { 
        EncodingFactory.getEncoding("ISO8859_2", charArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  /**
  //Test case number: 26
  /*Coverage entropy=0.4
  */
  @Test(timeout = 4000)
  public void test026()  throws Throwable  {
      Encoding encoding0 = EncodingFactory.getEncoding("Cp1255");
      assertNotNull(encoding0);
  }

  /**
  //Test case number: 27
  /*Coverage entropy=0.4
  */
  @Test(timeout = 4000)
  public void test027()  throws Throwable  {
      Encoding encoding0 = EncodingFactory.getEncoding("Cp860");
      assertNotNull(encoding0);
  }

  /**
  //Test case number: 28
  /*Coverage entropy=0.3333333333333333
  */
  @Test(timeout = 4000)
  public void test028()  throws Throwable  {
      // Undeclared exception!
      try { 
        EncodingFactory.getEncoding("Cp737", (char[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  /**
  //Test case number: 29
  /*Coverage entropy=0.3333333333333333
  */
  @Test(timeout = 4000)
  public void test029()  throws Throwable  {
      // Undeclared exception!
      try { 
        EncodingFactory.getEncoding("ISO8859_3", (char[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  /**
  //Test case number: 30
  /*Coverage entropy=0.3333333333333333
  */
  @Test(timeout = 4000)
  public void test030()  throws Throwable  {
      // Undeclared exception!
      try { 
        EncodingFactory.getEncoding("Cp1255", (char[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  /**
  //Test case number: 31
  /*Coverage entropy=0.3333333333333333
  */
  @Test(timeout = 4000)
  public void test031()  throws Throwable  {
      Encoding encoding0 = EncodingFactory.createEncoding("Cp437");
      assertNotNull(encoding0);
  }

  /**
  //Test case number: 32
  /*Coverage entropy=0.4
  */
  @Test(timeout = 4000)
  public void test032()  throws Throwable  {
      Encoding encoding0 = EncodingFactory.getEncoding("ISO8859_7");
      assertNotNull(encoding0);
  }

  /**
  //Test case number: 33
  /*Coverage entropy=0.3333333333333333
  */
  @Test(timeout = 4000)
  public void test033()  throws Throwable  {
      Encoding encoding0 = EncodingFactory.createEncoding("ISO8859_9");
      assertNotNull(encoding0);
  }

  /**
  //Test case number: 34
  /*Coverage entropy=0.3333333333333333
  */
  @Test(timeout = 4000)
  public void test034()  throws Throwable  {
      Encoding encoding0 = EncodingFactory.createEncoding("Cp862");
      assertNotNull(encoding0);
  }

  /**
  //Test case number: 35
  /*Coverage entropy=0.3333333333333333
  */
  @Test(timeout = 4000)
  public void test035()  throws Throwable  {
      Encoding encoding0 = EncodingFactory.createEncoding("ISO8859_13");
      assertNotNull(encoding0);
  }

  /**
  //Test case number: 36
  /*Coverage entropy=0.3333333333333333
  */
  @Test(timeout = 4000)
  public void test036()  throws Throwable  {
      Encoding encoding0 = EncodingFactory.createEncoding("Cp865");
      assertNotNull(encoding0);
  }

  /**
  //Test case number: 37
  /*Coverage entropy=0.3333333333333333
  */
  @Test(timeout = 4000)
  public void test037()  throws Throwable  {
      // Undeclared exception!
      try { 
        EncodingFactory.getEncoding("Cp866", (char[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  /**
  //Test case number: 38
  /*Coverage entropy=0.3333333333333333
  */
  @Test(timeout = 4000)
  public void test038()  throws Throwable  {
      Encoding encoding0 = EncodingFactory.createEncoding("Cp1252");
      assertNotNull(encoding0);
  }

  /**
  //Test case number: 39
  /*Coverage entropy=0.4
  */
  @Test(timeout = 4000)
  public void test039()  throws Throwable  {
      Encoding encoding0 = EncodingFactory.getEncoding("Cp1252");
      assertNotNull(encoding0);
  }

  /**
  //Test case number: 40
  /*Coverage entropy=0.3333333333333333
  */
  @Test(timeout = 4000)
  public void test040()  throws Throwable  {
      Encoding encoding0 = EncodingFactory.createEncoding("Cp869");
      assertNotNull(encoding0);
  }

  /**
  //Test case number: 41
  /*Coverage entropy=0.3333333333333333
  */
  @Test(timeout = 4000)
  public void test041()  throws Throwable  {
      // Undeclared exception!
      try { 
        EncodingFactory.getEncoding("Cp850", (char[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  /**
  //Test case number: 42
  /*Coverage entropy=0.3333333333333333
  */
  @Test(timeout = 4000)
  public void test042()  throws Throwable  {
      Encoding encoding0 = EncodingFactory.createEncoding("Cp864");
      assertNotNull(encoding0);
  }

  /**
  //Test case number: 43
  /*Coverage entropy=0.3333333333333333
  */
  @Test(timeout = 4000)
  public void test043()  throws Throwable  {
      // Undeclared exception!
      try { 
        EncodingFactory.getEncoding("Cp1253", (char[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  /**
  //Test case number: 44
  /*Coverage entropy=0.3333333333333333
  */
  @Test(timeout = 4000)
  public void test044()  throws Throwable  {
      Encoding encoding0 = EncodingFactory.createEncoding("ISO8859_1");
      assertNotNull(encoding0);
  }

  /**
  //Test case number: 45
  /*Coverage entropy=0.4
  */
  @Test(timeout = 4000)
  public void test045()  throws Throwable  {
      Encoding encoding0 = EncodingFactory.getEncoding("ISO8859_1");
      assertNotNull(encoding0);
  }

  /**
  //Test case number: 46
  /*Coverage entropy=0.3333333333333333
  */
  @Test(timeout = 4000)
  public void test046()  throws Throwable  {
      Encoding encoding0 = EncodingFactory.createEncoding("Cp737");
      assertNotNull(encoding0);
  }

  /**
  //Test case number: 47
  /*Coverage entropy=0.3333333333333333
  */
  @Test(timeout = 4000)
  public void test047()  throws Throwable  {
      Encoding encoding0 = EncodingFactory.createEncoding("Cp863");
      assertNotNull(encoding0);
  }

  /**
  //Test case number: 48
  /*Coverage entropy=0.3333333333333333
  */
  @Test(timeout = 4000)
  public void test048()  throws Throwable  {
      // Undeclared exception!
      try { 
        EncodingFactory.getEncoding("ISO8859_6", (char[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  /**
  //Test case number: 49
  /*Coverage entropy=0.3333333333333333
  */
  @Test(timeout = 4000)
  public void test049()  throws Throwable  {
      Encoding encoding0 = EncodingFactory.createEncoding("Cp850");
      assertNotNull(encoding0);
  }

  /**
  //Test case number: 50
  /*Coverage entropy=0.3333333333333333
  */
  @Test(timeout = 4000)
  public void test050()  throws Throwable  {
      // Undeclared exception!
      try { 
        EncodingFactory.getEncoding("Cp1251", (char[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  /**
  //Test case number: 51
  /*Coverage entropy=0.3333333333333333
  */
  @Test(timeout = 4000)
  public void test051()  throws Throwable  {
      Encoding encoding0 = EncodingFactory.createEncoding("Cp866");
      assertNotNull(encoding0);
  }

  /**
  //Test case number: 52
  /*Coverage entropy=0.3333333333333333
  */
  @Test(timeout = 4000)
  public void test052()  throws Throwable  {
      Encoding encoding0 = EncodingFactory.createEncoding("Cp1257");
      assertNotNull(encoding0);
  }

  /**
  //Test case number: 53
  /*Coverage entropy=0.3333333333333333
  */
  @Test(timeout = 4000)
  public void test053()  throws Throwable  {
      // Undeclared exception!
      try { 
        EncodingFactory.getEncoding("ISO8859_7", (char[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  /**
  //Test case number: 54
  /*Coverage entropy=0.3333333333333333
  */
  @Test(timeout = 4000)
  public void test054()  throws Throwable  {
      Encoding encoding0 = EncodingFactory.createEncoding("NONE");
      assertNotNull(encoding0);
  }

  /**
  //Test case number: 55
  /*Coverage entropy=0.3333333333333333
  */
  @Test(timeout = 4000)
  public void test055()  throws Throwable  {
      char[] charArray0 = new char[1];
      // Undeclared exception!
      try { 
        EncodingFactory.getEncoding("Cp869", charArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  /**
  //Test case number: 56
  /*Coverage entropy=0.3333333333333333
  */
  @Test(timeout = 4000)
  public void test056()  throws Throwable  {
      char[] charArray0 = new char[0];
      // Undeclared exception!
      try { 
        EncodingFactory.getEncoding("Cp852", charArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  /**
  //Test case number: 57
  /*Coverage entropy=0.3333333333333333
  */
  @Test(timeout = 4000)
  public void test057()  throws Throwable  {
      Encoding encoding0 = EncodingFactory.createEncoding("Cp852");
      assertNotNull(encoding0);
  }

  /**
  //Test case number: 58
  /*Coverage entropy=0.4
  */
  @Test(timeout = 4000)
  public void test058()  throws Throwable  {
      Encoding encoding0 = EncodingFactory.getEncoding("Cp850");
      assertNotNull(encoding0);
  }

  /**
  //Test case number: 59
  /*Coverage entropy=0.3333333333333333
  */
  @Test(timeout = 4000)
  public void test059()  throws Throwable  {
      // Undeclared exception!
      try { 
        EncodingFactory.getEncoding("ISO8859_5", (char[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  /**
  //Test case number: 60
  /*Coverage entropy=0.3333333333333333
  */
  @Test(timeout = 4000)
  public void test060()  throws Throwable  {
      // Undeclared exception!
      try { 
        EncodingFactory.getEncoding("Cp862", (char[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  /**
  //Test case number: 61
  /*Coverage entropy=0.3333333333333333
  */
  @Test(timeout = 4000)
  public void test061()  throws Throwable  {
      // Undeclared exception!
      try { 
        EncodingFactory.getEncoding("ISO8859_9", (char[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  /**
  //Test case number: 62
  /*Coverage entropy=0.3333333333333333
  */
  @Test(timeout = 4000)
  public void test062()  throws Throwable  {
      Encoding encoding0 = EncodingFactory.createEncoding("ISO8859_2");
      assertNotNull(encoding0);
  }

  /**
  //Test case number: 63
  /*Coverage entropy=0.3333333333333333
  */
  @Test(timeout = 4000)
  public void test063()  throws Throwable  {
      // Undeclared exception!
      try { 
        EncodingFactory.getEncoding("ISO8859_13", (char[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  /**
  //Test case number: 64
  /*Coverage entropy=0.3333333333333333
  */
  @Test(timeout = 4000)
  public void test064()  throws Throwable  {
      Encoding encoding0 = EncodingFactory.createEncoding("ISO8859_6");
      assertNotNull(encoding0);
  }

  /**
  //Test case number: 65
  /*Coverage entropy=0.3333333333333333
  */
  @Test(timeout = 4000)
  public void test065()  throws Throwable  {
      // Undeclared exception!
      try { 
        EncodingFactory.getEncoding("Cp864", (char[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  /**
  //Test case number: 66
  /*Coverage entropy=0.3333333333333333
  */
  @Test(timeout = 4000)
  public void test066()  throws Throwable  {
      char[] charArray0 = new char[8];
      // Undeclared exception!
      try { 
        EncodingFactory.getEncoding("Cp1257", charArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  /**
  //Test case number: 67
  /*Coverage entropy=0.4
  */
  @Test(timeout = 4000)
  public void test067()  throws Throwable  {
      Encoding encoding0 = EncodingFactory.getEncoding("Cp869");
      assertNotNull(encoding0);
  }

  /**
  //Test case number: 68
  /*Coverage entropy=0.3333333333333333
  */
  @Test(timeout = 4000)
  public void test068()  throws Throwable  {
      Encoding encoding0 = EncodingFactory.createEncoding("Cp1253");
      assertNotNull(encoding0);
  }

  /**
  //Test case number: 69
  /*Coverage entropy=0.4
  */
  @Test(timeout = 4000)
  public void test069()  throws Throwable  {
      Encoding encoding0 = EncodingFactory.getEncoding("ISO8859_3");
      assertNotNull(encoding0);
  }

  /**
  //Test case number: 70
  /*Coverage entropy=0.42857142857142855
  */
  @Test(timeout = 4000)
  public void test070()  throws Throwable  {
      int int0 = EncodingFactory.getIscEncodingSize("ISO8859_9");
      assertEquals(1, int0);
  }

  /**
  //Test case number: 71
  /*Coverage entropy=0.3333333333333333
  */
  @Test(timeout = 4000)
  public void test071()  throws Throwable  {
      Encoding encoding0 = EncodingFactory.createEncoding("ISO8859_5");
      assertNotNull(encoding0);
  }

  /**
  //Test case number: 72
  /*Coverage entropy=0.3333333333333333
  */
  @Test(timeout = 4000)
  public void test072()  throws Throwable  {
      // Undeclared exception!
      try { 
        EncodingFactory.getEncoding("ISO8859_1", (char[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  /**
  //Test case number: 73
  /*Coverage entropy=0.3333333333333333
  */
  @Test(timeout = 4000)
  public void test073()  throws Throwable  {
      Encoding encoding0 = EncodingFactory.createEncoding("Cp858");
      assertNotNull(encoding0);
  }

  /**
  //Test case number: 74
  /*Coverage entropy=0.3333333333333333
  */
  @Test(timeout = 4000)
  public void test074()  throws Throwable  {
      char[] charArray0 = new char[0];
      // Undeclared exception!
      try { 
        EncodingFactory.getEncoding("Cp861", charArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  /**
  //Test case number: 75
  /*Coverage entropy=0.3333333333333333
  */
  @Test(timeout = 4000)
  public void test075()  throws Throwable  {
      // Undeclared exception!
      try { 
        EncodingFactory.getEncoding("Cp860", (char[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  /**
  //Test case number: 76
  /*Coverage entropy=0.3333333333333333
  */
  @Test(timeout = 4000)
  public void test076()  throws Throwable  {
      // Undeclared exception!
      try { 
        EncodingFactory.getEncoding("Cp857", (char[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  /**
  //Test case number: 77
  /*Coverage entropy=0.3333333333333333
  */
  @Test(timeout = 4000)
  public void test077()  throws Throwable  {
      char[] charArray0 = new char[1];
      Encoding encoding0 = EncodingFactory.getEncoding((String) null, charArray0);
      assertNotNull(encoding0);
  }

  /**
  //Test case number: 78
  /*Coverage entropy=0.3333333333333333
  */
  @Test(timeout = 4000)
  public void test078()  throws Throwable  {
      char[] charArray0 = new char[0];
      // Undeclared exception!
      try { 
        EncodingFactory.getEncoding("Cp858", charArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  /**
  //Test case number: 79
  /*Coverage entropy=1.3987573491597598
  */
  @Test(timeout = 4000)
  public void test079()  throws Throwable  {
      EncodingFactory.getIscEncoding("e0di");
      Encoding encoding0 = EncodingFactory.getEncoding("e0di", (String) null);
      assertNotNull(encoding0);
  }

  /**
  //Test case number: 80
  /*Coverage entropy=0.3333333333333333
  */
  @Test(timeout = 4000)
  public void test080()  throws Throwable  {
      char[] charArray0 = new char[1];
      // Undeclared exception!
      try { 
        EncodingFactory.getEncoding("Cp437", charArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  /**
  //Test case number: 81
  /*Coverage entropy=0.42857142857142855
  */
  @Test(timeout = 4000)
  public void test081()  throws Throwable  {
      Encoding encoding0 = EncodingFactory.getEncoding((String) null, (String) null);
      assertNotNull(encoding0);
  }

  /**
  //Test case number: 82
  /*Coverage entropy=0.3333333333333333
  */
  @Test(timeout = 4000)
  public void test082()  throws Throwable  {
      Encoding encoding0 = EncodingFactory.createEncoding("Cp1251");
      assertNotNull(encoding0);
  }

  /**
  //Test case number: 83
  /*Coverage entropy=1.4993646124305886
  */
  @Test(timeout = 4000)
  public void test083()  throws Throwable  {
      EncodingFactory.getIscEncodingSize("Cp62Dn56");
      int int0 = EncodingFactory.getIscEncodingSize("Cp62Dn56");
      assertEquals(1, int0);
  }

  /**
  //Test case number: 84
  /*Coverage entropy=0.3333333333333333
  */
  @Test(timeout = 4000)
  public void test084()  throws Throwable  {
      // Undeclared exception!
      try { 
        EncodingFactory.createEncoding((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
      }
  }

  /**
  //Test case number: 85
  /*Coverage entropy=0.3333333333333333
  */
  @Test(timeout = 4000)
  public void test085()  throws Throwable  {
      int int0 = EncodingFactory.getCharacterSetSize(63);
      assertEquals(1, int0);
  }

  /**
  //Test case number: 86
  /*Coverage entropy=1.6898854982062188
  */
  @Test(timeout = 4000)
  public void test086()  throws Throwable  {
      String string0 = EncodingFactory.getJavaEncoding("UNICODE_FSS");
      assertNotNull(string0);
      assertEquals("UTF-8", string0);
      
      String string1 = EncodingFactory.getIscEncoding("UTF-8");
      assertEquals("UTF8", string1);
      assertNotNull(string1);
  }

  /**
  //Test case number: 87
  /*Coverage entropy=0.4444444444444445
  */
  @Test(timeout = 4000)
  public void test087()  throws Throwable  {
      String string0 = EncodingFactory.getJavaEncoding("WIN1255");
      assertEquals("Cp1255", string0);
      assertNotNull(string0);
      
      String string1 = EncodingFactory.getJavaEncodingForAlias("Cp1255");
      assertNotNull(string1);
      assertEquals("Cp1255", string1);
  }

  /**
  //Test case number: 88
  /*Coverage entropy=0.3333333333333333
  */
  @Test(timeout = 4000)
  public void test088()  throws Throwable  {
      String string0 = EncodingFactory.getJavaEncodingForAlias((String) null);
      assertNull(string0);
  }

  /**
  //Test case number: 89
  /*Coverage entropy=0.3333333333333333
  */
  @Test(timeout = 4000)
  public void test089()  throws Throwable  {
      int int0 = EncodingFactory.getIscEncodingSize((String) null);
      assertEquals(1, int0);
  }

  /**
  //Test case number: 90
  /*Coverage entropy=0.3333333333333333
  */
  @Test(timeout = 4000)
  public void test090()  throws Throwable  {
      String string0 = EncodingFactory.getIscEncoding((String) null);
      assertNull(string0);
  }

  /**
  //Test case number: 91
  /*Coverage entropy=0.4
  */
  @Test(timeout = 4000)
  public void test091()  throws Throwable  {
      Encoding encoding0 = EncodingFactory.getEncoding((String) null);
      assertNotNull(encoding0);
  }

  /**
  //Test case number: 92
  /*Coverage entropy=0.3333333333333333
  */
  @Test(timeout = 4000)
  public void test092()  throws Throwable  {
      String string0 = EncodingFactory.getJavaEncoding((String) null);
      assertNull(string0);
  }

  /**
  //Test case number: 93
  /*Coverage entropy=0.5242508373896309
  */
  @Test(timeout = 4000)
  public void test093()  throws Throwable  {
      EncodingFactory encodingFactory0 = new EncodingFactory();
      Encoding encoding0 = EncodingFactory.getEncoding("isc_encoding_size.properties", encodingFactory0.DEFAULT_MAPPING);
      assertNotNull(encoding0);
  }

  /**
  //Test case number: 94
  /*Coverage entropy=0.4
  */
  @Test(timeout = 4000)
  public void test094()  throws Throwable  {
      EncodingFactory encodingFactory0 = new EncodingFactory();
      Encoding encoding0 = EncodingFactory.getEncoding("isc_encodings.properties", encodingFactory0.DEFAULT_MAPPING);
      assertNotNull(encoding0);
  }

  /**
  //Test case number: 95
  /*Coverage entropy=0.4
  */
  @Test(timeout = 4000)
  public void test095()  throws Throwable  {
      // Undeclared exception!
      EncodingFactory.getEncoding("B#IEnC9m", "");
  }

  /**
  //Test case number: 96
  /*Coverage entropy=0.3333333333333333
  */
  @Test(timeout = 4000)
  public void test096()  throws Throwable  {
      int int0 = EncodingFactory.getCharacterSetSize((-2015787570));
      assertEquals(1, int0);
  }

  /**
  //Test case number: 97
  /*Coverage entropy=1.3519797385494536
  */
  @Test(timeout = 4000)
  public void test097()  throws Throwable  {
      String string0 = EncodingFactory.getIscEncoding("Cp860");
      assertNotNull(string0);
      assertEquals("DOS860", string0);
      
      String string1 = EncodingFactory.getJavaEncoding("DOS860");
      assertEquals("Cp860", string1);
      assertNotNull(string1);
  }

  /**
  //Test case number: 98
  /*Coverage entropy=0.42857142857142855
  */
  @Test(timeout = 4000)
  public void test098()  throws Throwable  {
      String string0 = EncodingFactory.getJavaEncodingForAlias("Cp254");
      assertNull(string0);
  }

  /**
  //Test case number: 99
  /*Coverage entropy=0.3333333333333333
  */
  @Test(timeout = 4000)
  public void test099()  throws Throwable  {
      // Undeclared exception!
      EncodingFactory.getTranslator("ISO8859_9");
  }

  /**
  //Test case number: 100
  /*Coverage entropy=0.3333333333333333
  */
  @Test(timeout = 4000)
  public void test100()  throws Throwable  {
      int int0 = EncodingFactory.getCharacterSetSize(3180);
      assertEquals(1, int0);
  }
}
