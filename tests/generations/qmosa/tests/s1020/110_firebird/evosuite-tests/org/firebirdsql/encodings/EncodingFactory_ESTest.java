/*
 * This file was automatically generated by EvoSuite
 * Wed Nov 11 16:55:21 GMT 2020
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
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      // Undeclared exception!
      try { 
        EncodingFactory.getEncoding("Cp1255", (char[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.firebirdsql.encodings.Encoding_OneByte", e);
      }
  }

  /**
  //Test case number: 1
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      // Undeclared exception!
      try { 
        EncodingFactory.createEncoding((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
      }
  }

  /**
  //Test case number: 2
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      // Undeclared exception!
      EncodingFactory.getTranslator("VT8PE2`e@^]zhi62#");
  }

  /**
  //Test case number: 3
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Encoding encoding0 = EncodingFactory.createEncoding("ISO8859_13");
      assertNotNull(encoding0);
  }

  /**
  //Test case number: 4
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Encoding encoding0 = EncodingFactory.createEncoding("Cp860");
      assertNotNull(encoding0);
  }

  /**
  //Test case number: 5
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Encoding encoding0 = EncodingFactory.createEncoding("Cp852");
      assertNotNull(encoding0);
  }

  /**
  //Test case number: 6
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Encoding encoding0 = EncodingFactory.createEncoding("Cp437");
      assertNotNull(encoding0);
  }

  /**
  //Test case number: 7
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Encoding encoding0 = EncodingFactory.createEncoding("Cp1254");
      assertNotNull(encoding0);
  }

  /**
  //Test case number: 8
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      String string0 = EncodingFactory.getJavaEncodingForAlias((String) null);
      assertNull(string0);
  }

  /**
  //Test case number: 9
  /*Coverage entropy=0.9908353864438493
  */
  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      EncodingFactory.getJavaEncodingForAlias("Cp852");
      String string0 = EncodingFactory.getJavaEncodingForAlias("Te$x.fgYW&:4t@DO");
      assertNull(string0);
  }

  /**
  //Test case number: 10
  /*Coverage entropy=1.2454410537617744
  */
  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      String string0 = EncodingFactory.getIscEncoding("B_VmW+Tj5S3c|XE");
      assertNull(string0);
      
      String string1 = EncodingFactory.getJavaEncoding("KSC_5601");
      assertEquals("MS949", string1);
      assertNotNull(string1);
  }

  /**
  //Test case number: 11
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      String string0 = EncodingFactory.getJavaEncoding((String) null);
      assertNull(string0);
  }

  /**
  //Test case number: 12
  /*Coverage entropy=1.0821955300387673
  */
  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      int int0 = EncodingFactory.getIscEncodingSize("ISO8859_3");
      assertEquals(1, int0);
  }

  /**
  //Test case number: 13
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      int int0 = EncodingFactory.getIscEncodingSize((String) null);
      assertEquals(1, int0);
  }

  /**
  //Test case number: 14
  /*Coverage entropy=1.0608569471580214
  */
  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      EncodingFactory.getIscEncodingSize("isc_encodings.properties");
      int int0 = EncodingFactory.getIscEncodingSize("Cp1257");
      assertEquals(1, int0);
  }

  /**
  //Test case number: 15
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      String string0 = EncodingFactory.getIscEncoding((String) null);
      assertNull(string0);
  }

  /**
  //Test case number: 16
  /*Coverage entropy=0.9596147939120492
  */
  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      String string0 = EncodingFactory.getIscEncoding("ISO8859_3");
      assertNotNull(string0);
      
      String string1 = EncodingFactory.getIscEncoding("Cp737");
      assertNotNull(string1);
      assertEquals("DOS737", string1);
  }

  /**
  //Test case number: 17
  /*Coverage entropy=0.24775082745153582
  */
  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Encoding encoding0 = EncodingFactory.getEncoding("6ROB]aM5PG}mK9:)&U]", (String) null);
      assertNotNull(encoding0);
  }

  /**
  //Test case number: 18
  /*Coverage entropy=0.6365141682948128
  */
  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      // Undeclared exception!
      EncodingFactory.getEncoding((String) null, "Cp1251");
  }

  /**
  //Test case number: 19
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      char[] charArray0 = new char[6];
      // Undeclared exception!
      try { 
        EncodingFactory.getEncoding("ISO8859_13", charArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 6
         //
         verifyException("org.firebirdsql.encodings.Encoding_OneByte", e);
      }
  }

  /**
  //Test case number: 20
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      char[] charArray0 = new char[1];
      // Undeclared exception!
      try { 
        EncodingFactory.getEncoding("ISO8859_9", charArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 1
         //
         verifyException("org.firebirdsql.encodings.Encoding_OneByte", e);
      }
  }

  /**
  //Test case number: 21
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      char[] charArray0 = new char[6];
      // Undeclared exception!
      try { 
        EncodingFactory.getEncoding("ISO8859_8", charArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 6
         //
         verifyException("org.firebirdsql.encodings.Encoding_OneByte", e);
      }
  }

  /**
  //Test case number: 22
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      char[] charArray0 = new char[16];
      // Undeclared exception!
      try { 
        EncodingFactory.getEncoding("ISO8859_7", charArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 16
         //
         verifyException("org.firebirdsql.encodings.Encoding_OneByte", e);
      }
  }

  /**
  //Test case number: 23
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      char[] charArray0 = new char[2];
      // Undeclared exception!
      try { 
        EncodingFactory.getEncoding("ISO8859_6", charArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 2
         //
         verifyException("org.firebirdsql.encodings.Encoding_OneByte", e);
      }
  }

  /**
  //Test case number: 24
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      char[] charArray0 = new char[3];
      // Undeclared exception!
      try { 
        EncodingFactory.getEncoding("ISO8859_5", charArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 3
         //
         verifyException("org.firebirdsql.encodings.Encoding_OneByte", e);
      }
  }

  /**
  //Test case number: 25
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      // Undeclared exception!
      try { 
        EncodingFactory.getEncoding("ISO8859_4", (char[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.firebirdsql.encodings.Encoding_OneByte", e);
      }
  }

  /**
  //Test case number: 26
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      char[] charArray0 = new char[8];
      // Undeclared exception!
      try { 
        EncodingFactory.getEncoding("ISO8859_3", charArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 8
         //
         verifyException("org.firebirdsql.encodings.Encoding_OneByte", e);
      }
  }

  /**
  //Test case number: 27
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      char[] charArray0 = new char[22];
      // Undeclared exception!
      try { 
        EncodingFactory.getEncoding("ISO8859_2", charArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 22
         //
         verifyException("org.firebirdsql.encodings.Encoding_OneByte", e);
      }
  }

  /**
  //Test case number: 28
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      char[] charArray0 = new char[6];
      // Undeclared exception!
      try { 
        EncodingFactory.getEncoding("ISO8859_1", charArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 6
         //
         verifyException("org.firebirdsql.encodings.Encoding_OneByte", e);
      }
  }

  /**
  //Test case number: 29
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      char[] charArray0 = new char[14];
      // Undeclared exception!
      try { 
        EncodingFactory.getEncoding("Cp869", charArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 14
         //
         verifyException("org.firebirdsql.encodings.Encoding_OneByte", e);
      }
  }

  /**
  //Test case number: 30
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      char[] charArray0 = new char[0];
      // Undeclared exception!
      try { 
        EncodingFactory.getEncoding("Cp866", charArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 0
         //
         verifyException("org.firebirdsql.encodings.Encoding_OneByte", e);
      }
  }

  /**
  //Test case number: 31
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      char[] charArray0 = new char[8];
      // Undeclared exception!
      try { 
        EncodingFactory.getEncoding("Cp865", charArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 8
         //
         verifyException("org.firebirdsql.encodings.Encoding_OneByte", e);
      }
  }

  /**
  //Test case number: 32
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      // Undeclared exception!
      try { 
        EncodingFactory.getEncoding("Cp864", (char[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.firebirdsql.encodings.Encoding_OneByte", e);
      }
  }

  /**
  //Test case number: 33
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      char[] charArray0 = new char[3];
      // Undeclared exception!
      try { 
        EncodingFactory.getEncoding("Cp863", charArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 3
         //
         verifyException("org.firebirdsql.encodings.Encoding_OneByte", e);
      }
  }

  /**
  //Test case number: 34
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      // Undeclared exception!
      try { 
        EncodingFactory.getEncoding("Cp862", (char[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.firebirdsql.encodings.Encoding_OneByte", e);
      }
  }

  /**
  //Test case number: 35
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      // Undeclared exception!
      try { 
        EncodingFactory.getEncoding("Cp861", (char[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.firebirdsql.encodings.Encoding_OneByte", e);
      }
  }

  /**
  //Test case number: 36
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      char[] charArray0 = new char[2];
      // Undeclared exception!
      try { 
        EncodingFactory.getEncoding("Cp860", charArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 2
         //
         verifyException("org.firebirdsql.encodings.Encoding_OneByte", e);
      }
  }

  /**
  //Test case number: 37
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      char[] charArray0 = new char[7];
      // Undeclared exception!
      try { 
        EncodingFactory.getEncoding("Cp858", charArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 7
         //
         verifyException("org.firebirdsql.encodings.Encoding_OneByte", e);
      }
  }

  /**
  //Test case number: 38
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      char[] charArray0 = new char[5];
      // Undeclared exception!
      try { 
        EncodingFactory.getEncoding("Cp857", charArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 5
         //
         verifyException("org.firebirdsql.encodings.Encoding_OneByte", e);
      }
  }

  /**
  //Test case number: 39
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      char[] charArray0 = new char[2];
      // Undeclared exception!
      try { 
        EncodingFactory.getEncoding("Cp852", charArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 2
         //
         verifyException("org.firebirdsql.encodings.Encoding_OneByte", e);
      }
  }

  /**
  //Test case number: 40
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      char[] charArray0 = new char[3];
      // Undeclared exception!
      try { 
        EncodingFactory.getEncoding("Cp850", charArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 3
         //
         verifyException("org.firebirdsql.encodings.Encoding_OneByte", e);
      }
  }

  /**
  //Test case number: 41
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      char[] charArray0 = new char[9];
      // Undeclared exception!
      try { 
        EncodingFactory.getEncoding("Cp775", charArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 9
         //
         verifyException("org.firebirdsql.encodings.Encoding_OneByte", e);
      }
  }

  /**
  //Test case number: 42
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      char[] charArray0 = new char[6];
      // Undeclared exception!
      try { 
        EncodingFactory.getEncoding("Cp737", charArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 6
         //
         verifyException("org.firebirdsql.encodings.Encoding_OneByte", e);
      }
  }

  /**
  //Test case number: 43
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      char[] charArray0 = new char[5];
      // Undeclared exception!
      try { 
        EncodingFactory.getEncoding("Cp437", charArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 5
         //
         verifyException("org.firebirdsql.encodings.Encoding_OneByte", e);
      }
  }

  /**
  //Test case number: 44
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      char[] charArray0 = new char[5];
      // Undeclared exception!
      try { 
        EncodingFactory.getEncoding("Cp1257", charArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 5
         //
         verifyException("org.firebirdsql.encodings.Encoding_OneByte", e);
      }
  }

  /**
  //Test case number: 45
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      // Undeclared exception!
      try { 
        EncodingFactory.getEncoding("Cp1256", (char[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.firebirdsql.encodings.Encoding_OneByte", e);
      }
  }

  /**
  //Test case number: 46
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      char[] charArray0 = new char[3];
      // Undeclared exception!
      try { 
        EncodingFactory.getEncoding("Cp1254", charArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 3
         //
         verifyException("org.firebirdsql.encodings.Encoding_OneByte", e);
      }
  }

  /**
  //Test case number: 47
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      char[] charArray0 = new char[8];
      // Undeclared exception!
      try { 
        EncodingFactory.getEncoding("Cp1253", charArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 8
         //
         verifyException("org.firebirdsql.encodings.Encoding_OneByte", e);
      }
  }

  /**
  //Test case number: 48
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      char[] charArray0 = new char[2];
      // Undeclared exception!
      try { 
        EncodingFactory.getEncoding("Cp1252", charArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 2
         //
         verifyException("org.firebirdsql.encodings.Encoding_OneByte", e);
      }
  }

  /**
  //Test case number: 49
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      // Undeclared exception!
      try { 
        EncodingFactory.getEncoding("Cp1251", (char[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.firebirdsql.encodings.Encoding_OneByte", e);
      }
  }

  /**
  //Test case number: 50
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      char[] charArray0 = new char[8];
      // Undeclared exception!
      try { 
        EncodingFactory.getEncoding("Cp1250", charArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 8
         //
         verifyException("org.firebirdsql.encodings.Encoding_OneByte", e);
      }
  }

  /**
  //Test case number: 51
  /*Coverage entropy=0.8022388430968207
  */
  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      EncodingFactory.getJavaEncoding("Cp1252");
      char[] charArray0 = new char[7];
      Encoding encoding0 = EncodingFactory.getEncoding("utf8", charArray0);
      assertNotNull(encoding0);
  }

  /**
  //Test case number: 52
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      char[] charArray0 = new char[3];
      Encoding encoding0 = EncodingFactory.getEncoding("NONE", charArray0);
      assertNotNull(encoding0);
  }

  /**
  //Test case number: 53
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      Encoding encoding0 = EncodingFactory.getEncoding((String) null, (char[]) null);
      assertNotNull(encoding0);
  }

  /**
  //Test case number: 54
  /*Coverage entropy=0.12693054534140227
  */
  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      Encoding encoding0 = EncodingFactory.getEncoding((String) null);
      assertNotNull(encoding0);
  }

  /**
  //Test case number: 55
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      int int0 = EncodingFactory.getCharacterSetSize(47);
      assertEquals(1, int0);
  }

  /**
  //Test case number: 56
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test56()  throws Throwable  {
      int int0 = EncodingFactory.getCharacterSetSize((-1453699554));
      assertEquals(1, int0);
  }

  /**
  //Test case number: 57
  /*Coverage entropy=0.12693054534140227
  */
  @Test(timeout = 4000)
  public void test57()  throws Throwable  {
      Encoding encoding0 = EncodingFactory.getEncoding("ISO8859_13");
      assertNotNull(encoding0);
  }

  /**
  //Test case number: 58
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test58()  throws Throwable  {
      Encoding encoding0 = EncodingFactory.createEncoding("ISO8859_9");
      assertNotNull(encoding0);
  }

  /**
  //Test case number: 59
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test59()  throws Throwable  {
      Encoding encoding0 = EncodingFactory.createEncoding("ISO8859_8");
      assertNotNull(encoding0);
  }

  /**
  //Test case number: 60
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test60()  throws Throwable  {
      Encoding encoding0 = EncodingFactory.createEncoding("ISO8859_7");
      assertNotNull(encoding0);
  }

  /**
  //Test case number: 61
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test61()  throws Throwable  {
      Encoding encoding0 = EncodingFactory.createEncoding("ISO8859_6");
      assertNotNull(encoding0);
  }

  /**
  //Test case number: 62
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test62()  throws Throwable  {
      Encoding encoding0 = EncodingFactory.createEncoding("ISO8859_5");
      assertNotNull(encoding0);
  }

  /**
  //Test case number: 63
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test63()  throws Throwable  {
      Encoding encoding0 = EncodingFactory.createEncoding("ISO8859_4");
      assertNotNull(encoding0);
  }

  /**
  //Test case number: 64
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test64()  throws Throwable  {
      Encoding encoding0 = EncodingFactory.createEncoding("ISO8859_3");
      assertNotNull(encoding0);
  }

  /**
  //Test case number: 65
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test65()  throws Throwable  {
      Encoding encoding0 = EncodingFactory.createEncoding("ISO8859_2");
      assertNotNull(encoding0);
  }

  /**
  //Test case number: 66
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test66()  throws Throwable  {
      Encoding encoding0 = EncodingFactory.createEncoding("ISO8859_1");
      assertNotNull(encoding0);
  }

  /**
  //Test case number: 67
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test67()  throws Throwable  {
      Encoding encoding0 = EncodingFactory.createEncoding("Cp869");
      assertNotNull(encoding0);
  }

  /**
  //Test case number: 68
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test68()  throws Throwable  {
      Encoding encoding0 = EncodingFactory.createEncoding("Cp866");
      assertNotNull(encoding0);
  }

  /**
  //Test case number: 69
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test69()  throws Throwable  {
      Encoding encoding0 = EncodingFactory.createEncoding("Cp865");
      assertNotNull(encoding0);
  }

  /**
  //Test case number: 70
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test70()  throws Throwable  {
      Encoding encoding0 = EncodingFactory.createEncoding("Cp864");
      assertNotNull(encoding0);
  }

  /**
  //Test case number: 71
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test71()  throws Throwable  {
      Encoding encoding0 = EncodingFactory.createEncoding("Cp863");
      assertNotNull(encoding0);
  }

  /**
  //Test case number: 72
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test72()  throws Throwable  {
      Encoding encoding0 = EncodingFactory.createEncoding("Cp862");
      assertNotNull(encoding0);
  }

  /**
  //Test case number: 73
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test73()  throws Throwable  {
      Encoding encoding0 = EncodingFactory.createEncoding("Cp861");
      assertNotNull(encoding0);
  }

  /**
  //Test case number: 74
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test74()  throws Throwable  {
      Encoding encoding0 = EncodingFactory.createEncoding("Cp858");
      assertNotNull(encoding0);
  }

  /**
  //Test case number: 75
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test75()  throws Throwable  {
      Encoding encoding0 = EncodingFactory.createEncoding("Cp857");
      assertNotNull(encoding0);
  }

  /**
  //Test case number: 76
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test76()  throws Throwable  {
      Encoding encoding0 = EncodingFactory.createEncoding("Cp850");
      assertNotNull(encoding0);
  }

  /**
  //Test case number: 77
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test77()  throws Throwable  {
      Encoding encoding0 = EncodingFactory.createEncoding("Cp775");
      assertNotNull(encoding0);
  }

  /**
  //Test case number: 78
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test78()  throws Throwable  {
      Encoding encoding0 = EncodingFactory.createEncoding("Cp737");
      assertNotNull(encoding0);
  }

  /**
  //Test case number: 79
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test79()  throws Throwable  {
      Encoding encoding0 = EncodingFactory.createEncoding("Cp1257");
      assertNotNull(encoding0);
  }

  /**
  //Test case number: 80
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test80()  throws Throwable  {
      Encoding encoding0 = EncodingFactory.createEncoding("Cp1255");
      assertNotNull(encoding0);
  }

  /**
  //Test case number: 81
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test81()  throws Throwable  {
      Encoding encoding0 = EncodingFactory.createEncoding("Cp1253");
      assertNotNull(encoding0);
  }

  /**
  //Test case number: 82
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test82()  throws Throwable  {
      Encoding encoding0 = EncodingFactory.createEncoding("Cp1252");
      assertNotNull(encoding0);
  }

  /**
  //Test case number: 83
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test83()  throws Throwable  {
      Encoding encoding0 = EncodingFactory.createEncoding("Cp1251");
      assertNotNull(encoding0);
  }

  /**
  //Test case number: 84
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test84()  throws Throwable  {
      Encoding encoding0 = EncodingFactory.createEncoding("Cp1250");
      assertNotNull(encoding0);
  }

  /**
  //Test case number: 85
  /*Coverage entropy=0.8505754900513051
  */
  @Test(timeout = 4000)
  public void test85()  throws Throwable  {
      EncodingFactory.getJavaEncoding("UTF8");
      Encoding encoding0 = EncodingFactory.createEncoding("utf8");
      assertNotNull(encoding0);
  }

  /**
  //Test case number: 86
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test86()  throws Throwable  {
      Encoding encoding0 = EncodingFactory.createEncoding("NONE");
      assertNotNull(encoding0);
  }

  /**
  //Test case number: 87
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test87()  throws Throwable  {
      Encoding encoding0 = EncodingFactory.createEncoding("Cp1256");
      assertNotNull(encoding0);
  }

  /**
  //Test case number: 88
  /*Coverage entropy=0.3250829733914482
  */
  @Test(timeout = 4000)
  public void test88()  throws Throwable  {
      EncodingFactory encodingFactory0 = new EncodingFactory();
      Encoding encoding0 = EncodingFactory.getEncoding("Cp1255", encodingFactory0.DEFAULT_MAPPING);
      assertNotNull(encoding0);
  }
}
