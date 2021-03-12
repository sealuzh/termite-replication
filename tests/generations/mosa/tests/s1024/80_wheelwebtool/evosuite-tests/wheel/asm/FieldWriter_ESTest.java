/*
 * This file was automatically generated by EvoSuite
 * Sat Nov 07 17:50:32 GMT 2020
 */

package wheel.asm;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import wheel.asm.Attribute;
import wheel.asm.ByteVector;
import wheel.asm.ClassWriter;
import wheel.asm.FieldWriter;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class FieldWriter_ESTest extends FieldWriter_ESTest_scaffolding {

  /**
  //Test case number: 0
  /*Coverage entropy=0.4361623253853443
  */
  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-47));
      String[] stringArray0 = new String[4];
      stringArray0[0] = "RuntimeVisibleAnnottixns";
      stringArray0[1] = "RuntimeVisibleAnnottixns";
      stringArray0[2] = "The filters must not be null";
      stringArray0[3] = "RuntimeVisibleAnnottixns";
      classWriter0.visit(49, (-47), "RuntimeVisibleAnnottixns", "RuntimeVisibleAnnottixns", "RuntimeVisibleAnnottixns", stringArray0);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, (-3156), "The filters must not be null", "RuntimeVisibleAnnottixns", "RuntimeVisibleAnnottixns", "RuntimeVisibleAnnottixns");
      ByteVector byteVector0 = new ByteVector();
      fieldWriter0.put(byteVector0);
  }

  /**
  //Test case number: 1
  /*Coverage entropy=0.4659992569610426
  */
  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(4096);
      classWriter0.index = (-2190);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 1, "bD0", "", (String) null, "");
      ByteVector byteVector0 = new ByteVector();
      fieldWriter0.put(byteVector0);
  }

  /**
  //Test case number: 2
  /*Coverage entropy=0.5859526183035508
  */
  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-47));
      String[] stringArray0 = new String[4];
      stringArray0[0] = "RuntimeVisibleAnnottixns";
      stringArray0[1] = "RuntimeVisibleAnnottixns";
      stringArray0[2] = "The filters must not be null";
      stringArray0[3] = "RuntimeVisibleAnnottixns";
      classWriter0.visit(49, (-47), "RuntimeVisibleAnnottixns", "RuntimeVisibleAnnottixns", "RuntimeVisibleAnnottixns", stringArray0);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, (-3156), "The filters must not be null", "RuntimeVisibleAnnottixns", "RuntimeVisibleAnnottixns", "RuntimeVisibleAnnottixns");
      int int0 = fieldWriter0.getSize();
      assertEquals(30, int0);
  }

  /**
  //Test case number: 3
  /*Coverage entropy=0.6108643020548935
  */
  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-47));
      classWriter0.index = (-47);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 51, "RuntimeVisibleAnnottixns", "", "org.apache.commons.io.filefilter.PrefixFileFilter", "~'kGbt{\"MQamq'UU");
      int int0 = fieldWriter0.getSize();
      assertEquals(24, int0);
  }

  /**
  //Test case number: 4
  /*Coverage entropy=0.5623351446188083
  */
  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(4121);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 2, "q", "q", (String) null, (Object) null);
      // Undeclared exception!
      try { 
        fieldWriter0.visitAnnotation((String) null, true);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  /**
  //Test case number: 5
  /*Coverage entropy=0.7902679680745903
  */
  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(4096);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, (-177), "bD0", "bD0", "bD0", "@;{|Rrqx]8E+,I");
      Attribute attribute0 = new Attribute("Ll_");
      fieldWriter0.visitAttribute(attribute0);
      ByteVector byteVector0 = classWriter0.pool;
      fieldWriter0.visitAttribute(attribute0);
      // Undeclared exception!
      fieldWriter0.put(byteVector0);
  }

  /**
  //Test case number: 6
  /*Coverage entropy=0.5623351446188083
  */
  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(200);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 2, "qOCB_];{;4E&1u", "qOCB_];{;4E&1u", "qOCB_];{;4E&1u", "qOCB_];{;4E&1u");
      ByteVector byteVector0 = new ByteVector();
      byteVector0.length = 200;
      // Undeclared exception!
      try { 
        fieldWriter0.put(byteVector0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("wheel.asm.ByteVector", e);
      }
  }

  /**
  //Test case number: 7
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(64529);
      FieldWriter fieldWriter0 = null;
      try {
        fieldWriter0 = new FieldWriter(classWriter0, 64529, (String) null, (String) null, (String) null, (Object) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  /**
  //Test case number: 8
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(4096);
      FieldWriter fieldWriter0 = null;
      try {
        fieldWriter0 = new FieldWriter(classWriter0, 4096, "", "", "", classWriter0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // value wheel.asm.ClassWriter@5
         //
         verifyException("wheel.asm.ClassWriter", e);
      }
  }

  /**
  //Test case number: 9
  /*Coverage entropy=0.6330395116644678
  */
  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(74);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 1, "43aP{=DQ9.upv[", "43aP{=DQ9.upv[", "43aP{=DQ9.upv[", "43aP{=DQ9.upv[");
      Attribute attribute0 = new Attribute("43aP{=DQ9.upv[");
      fieldWriter0.visitAttribute(attribute0);
      ByteVector byteVector0 = classWriter0.pool;
      // Undeclared exception!
      try { 
        fieldWriter0.put(byteVector0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("wheel.asm.Attribute", e);
      }
  }

  /**
  //Test case number: 10
  /*Coverage entropy=0.6546695645285008
  */
  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(178);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 2, "q&[H", "q&[H", "q&[H", "q&[H");
      fieldWriter0.visitAnnotation("q&[H", false);
      ByteVector byteVector0 = classWriter0.pool;
      fieldWriter0.put(byteVector0);
  }

  /**
  //Test case number: 11
  /*Coverage entropy=0.6546695645285008
  */
  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(182);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 2, "q&[]", "q&[]", "q&[]", "q&[]");
      fieldWriter0.visitAnnotation("q&[]", true);
      ByteVector byteVector0 = new ByteVector();
      fieldWriter0.put(byteVector0);
  }

  /**
  //Test case number: 12
  /*Coverage entropy=0.4361623253853443
  */
  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(0);
      classWriter0.version = (-1587);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, (-1587), ".q@~UA][D%", ".q@~UA][D%", ".q@~UA][D%", ".q@~UA][D%");
      ByteVector byteVector0 = new ByteVector();
      fieldWriter0.put(byteVector0);
  }

  /**
  //Test case number: 13
  /*Coverage entropy=0.4361623253853443
  */
  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(0);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, (-1587), ".q@~UA][D%", ".q@~UA][D%", ".q@~UA][D%", ".q@~UA][D%");
      ByteVector byteVector0 = new ByteVector();
      fieldWriter0.put(byteVector0);
  }

  /**
  //Test case number: 14
  /*Coverage entropy=0.4659992569610426
  */
  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(182);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 2, "q&[]", "q&[]", (String) null, (Object) null);
      ByteVector byteVector0 = classWriter0.pool;
      fieldWriter0.put(byteVector0);
  }

  /**
  //Test case number: 15
  /*Coverage entropy=0.8239592165010823
  */
  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(874);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 2, "The array of sffixes uEt not be null", "The array of sffixes uEt not be null", "The array of sffixes uEt not be null", "The array of sffixes uEt not be null");
      Attribute attribute0 = new Attribute("The array of sffixes uEt not be null");
      fieldWriter0.visitAttribute(attribute0);
      // Undeclared exception!
      try { 
        fieldWriter0.getSize();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("wheel.asm.Attribute", e);
      }
  }

  /**
  //Test case number: 16
  /*Coverage entropy=0.5859526183035508
  */
  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-29));
      String[] stringArray0 = new String[1];
      stringArray0[0] = "RuntimV#s=beeAnnottins";
      classWriter0.visit((-29), (-29), "RuntimV#s=beeAnnottins", "RuntimV#s=beeAnnottins", "RuntimV#s=beeAnnottins", stringArray0);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, (-29), "RuntimV#s=beeAnnottins", "RuntimV#s=beeAnnottins", "RuntimV#s=beeAnnottins", "RuntimV#s=beeAnnottins");
      int int0 = fieldWriter0.getSize();
      assertEquals(30, int0);
  }

  /**
  //Test case number: 17
  /*Coverage entropy=0.5859526183035508
  */
  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-29));
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, (-29), "RuntimV#s=beeAnnottins", "RuntimV#s=beeAnnottins", "RuntimV#s=beeAnnottins", "RuntimV#s=beeAnnottins");
      int int0 = fieldWriter0.getSize();
      assertEquals(36, int0);
  }

  /**
  //Test case number: 18
  /*Coverage entropy=0.8599672810355049
  */
  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(188);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 2, "q&[]", "q&[]", "q&[]", "q&[]");
      fieldWriter0.visitAnnotation("q&[]", true);
      int int0 = fieldWriter0.getSize();
      assertEquals(36, int0);
  }

  /**
  //Test case number: 19
  /*Coverage entropy=0.8599672810355049
  */
  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(4094);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 2, "qOoB_;{;CE&u", "qOoB_;{;CE&u", "qOoB_;{;CE&u", "qOoB_;{;CE&u");
      fieldWriter0.visitAnnotation("qOoB_;{;CE&u", false);
      int int0 = fieldWriter0.getSize();
      assertEquals(36, int0);
  }

  /**
  //Test case number: 20
  /*Coverage entropy=0.6108643020548935
  */
  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(4121);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 2, "[]", "[]", (String) null, (Object) null);
      int int0 = fieldWriter0.getSize();
      assertEquals(8, int0);
  }

  /**
  //Test case number: 21
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(23);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 2, "TDNRHynd7z82}`Kd)<", "TDNRHynd7z82}`Kd)<", "TDNRHynd7z82}`Kd)<", "bD0");
      FieldWriter fieldWriter1 = new FieldWriter(classWriter0, 1, "bD0", "bD0", "TDNRHynd7z82}`Kd)<", "TDNRHynd7z82}`Kd)<");
      assertFalse(fieldWriter1.equals((Object)fieldWriter0));
  }

  /**
  //Test case number: 22
  /*Coverage entropy=0.5623351446188083
  */
  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(5679);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 642, "of)xo*", "of)xo*", "X", "of)xo*");
      fieldWriter0.visitEnd();
  }

  /**
  //Test case number: 23
  /*Coverage entropy=0.5623351446188083
  */
  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(4081);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 4081, "bD0", "bD0", "bD0", "bD0");
      // Undeclared exception!
      try { 
        fieldWriter0.visitAttribute((Attribute) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("wheel.asm.FieldWriter", e);
      }
  }
}
