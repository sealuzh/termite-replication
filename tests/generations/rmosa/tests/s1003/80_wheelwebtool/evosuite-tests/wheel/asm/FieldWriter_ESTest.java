/*
 * This file was automatically generated by EvoSuite
 * Sun Nov 08 06:03:38 GMT 2020
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
import wheel.asm.ClassReader;
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
      ClassWriter classWriter0 = new ClassWriter(1713);
      String[] stringArray0 = new String[3];
      stringArray0[0] = "Deprecated";
      stringArray0[1] = "Deprecated";
      stringArray0[2] = "#+Wk`S()-YheK;";
      classWriter0.visit(1713, 8, "", "RuntimeVisibleAnnotations", "", stringArray0);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, (-1504), "RuntimeVisibleAnnotations", "Deprecated", (String) null, (Object) null);
      ByteVector byteVector0 = new ByteVector();
      fieldWriter0.put(byteVector0);
  }

  /**
  //Test case number: 1
  /*Coverage entropy=0.5859526183035508
  */
  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(1713);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, (-484), "RuntimeVisibleAnnotations", "RuntimeVisibleAnnotations", "RuntimeVisibleAnnotations", "RuntimeVisibleAnnotations");
      String[] stringArray0 = new String[0];
      classWriter0.visit(49, (-484), ".</4.>s3p4; Zcj", "", "Insensitive", stringArray0);
      int int0 = fieldWriter0.getSize();
      assertEquals(30, int0);
  }

  /**
  //Test case number: 2
  /*Coverage entropy=0.5623351446188083
  */
  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(1713);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, (-1487), "RuntimeVisibleAnnotations", "", (String) null, (Object) null);
      // Undeclared exception!
      try { 
        fieldWriter0.visitAnnotation((String) null, false);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  /**
  //Test case number: 3
  /*Coverage entropy=0.5623351446188083
  */
  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(1816);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 1, "RuntimeVisibleAnnotations", "", "", "");
      ByteVector byteVector0 = new ByteVector();
      byteVector0.length = 1816;
      // Undeclared exception!
      try { 
        fieldWriter0.put(byteVector0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
      }
  }

  /**
  //Test case number: 4
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(1713);
      FieldWriter fieldWriter0 = null;
      try {
        fieldWriter0 = new FieldWriter(classWriter0, 1713, (String) null, "WL\"Tz,", "WL\"Tz,", "Deprecated");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  /**
  //Test case number: 5
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(1816);
      Object object0 = new Object();
      FieldWriter fieldWriter0 = null;
      try {
        fieldWriter0 = new FieldWriter(classWriter0, 1816, "RuntimeVisibleAnnotations", "", "D`rL8T^[`)UGV", object0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // value java.lang.Object@6c18990
         //
         verifyException("wheel.asm.ClassWriter", e);
      }
  }

  /**
  //Test case number: 6
  /*Coverage entropy=0.6330395116644678
  */
  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(1816);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 2, "RuntimeVisibleAnnotatio`s", "RuntimeVisibleAnnotatio`s", (String) null, "RuntimeVisibleAnnotatio`s");
      Attribute attribute0 = new Attribute("RuntimeVisibleAnnotatio`s");
      fieldWriter0.visitAttribute(attribute0);
      ByteVector byteVector0 = new ByteVector(4096);
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
  //Test case number: 7
  /*Coverage entropy=0.6128694524619496
  */
  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(1713);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, (-1487), "RuntimeVisibleAnnotations", "", (String) null, (Object) null);
      ByteVector byteVector0 = new ByteVector();
      fieldWriter0.next = fieldWriter0;
      fieldWriter0.next.visitAnnotation("EFFFFFFFFGGFFFGGFFFEEFGFGFEEEEEEEEEEEEEEEEEEEEDEDEDDDDDCDCDEEEEEEEEEEEEEEEEEEEEBABABBBBDCFFFGGGEDCDCDCDCDCDCDCDCDCDCEEEEDDDDDDDCDCDCEFEFDDEEFFDEDEEEBDDBBDDDDDDCCCCCCCCEFEDDDCDCDEEEEEEEEEEFEEEEEEDDEEDDEE", false);
      fieldWriter0.put(byteVector0);
  }

  /**
  //Test case number: 8
  /*Coverage entropy=0.6128694524619496
  */
  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(1713);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, (-1504), "RuntimeVisibleAnnotations", "Deprecated", (String) null, (Object) null);
      fieldWriter0.visitAnnotation("WS~XRM`h}2+.lQyUw", true);
      ByteVector byteVector0 = new ByteVector();
      fieldWriter0.put(byteVector0);
  }

  /**
  //Test case number: 9
  /*Coverage entropy=0.4361623253853443
  */
  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(1713);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, (-484), "RuntimeVisibleAnnotations", "RuntimeVisibleAnnotations", "RuntimeVisibleAnnotations", "RuntimeVisibleAnnotations");
      String[] stringArray0 = new String[0];
      classWriter0.visit(49, (-484), ".</4.>s3p4; Zcj", "", "Insensitive", stringArray0);
      ByteVector byteVector0 = new ByteVector(2398);
      fieldWriter0.put(byteVector0);
  }

  /**
  //Test case number: 10
  /*Coverage entropy=0.8239592165010823
  */
  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(49);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 49, "cGmK6wd", "\u0002`D4vXW6i`A", "0]G6qUh(k", "The FilenameFilter must not be null");
      Attribute attribute0 = new Attribute("The FilenameFilter must not be null");
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
  //Test case number: 11
  /*Coverage entropy=0.5859526183035508
  */
  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(1713);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, (-1487), "RuntimeVisibleAnnotations", "", (String) null, (Object) null);
      int int0 = fieldWriter0.getSize();
      assertEquals(20, int0);
  }

  /**
  //Test case number: 12
  /*Coverage entropy=0.5859526183035508
  */
  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(1713);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, (-484), "RuntimeVisibleAnnotations", "RuntimeVisibleAnnotations", "RuntimeVisibleAnnotations", "RuntimeVisibleAnnotations");
      String[] stringArray0 = new String[0];
      classWriter0.visit((-484), (-484), ".</4.>s3p4; Zcj", "", "Insensitive", stringArray0);
      int int0 = fieldWriter0.getSize();
      assertEquals(30, int0);
  }

  /**
  //Test case number: 13
  /*Coverage entropy=0.8239592165010823
  */
  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(1713);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, (-484), "RuntimeVisibleAnnotations", "RuntimeVisibleAnnotations", "RuntimeVisibleAnnotations", "RuntimeVisibleAnnotations");
      fieldWriter0.visitAnnotation("RuntimeVisibleAnnotations", true);
      int int0 = fieldWriter0.getSize();
      assertEquals(48, int0);
  }

  /**
  //Test case number: 14
  /*Coverage entropy=0.8599672810355049
  */
  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(218);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 1, "wheel.asm.FieldWriter", "wheel.asm.FieldWriter", "Signature", (Object) null);
      fieldWriter0.visitAnnotation("Signature", false);
      int int0 = fieldWriter0.getSize();
      assertEquals(28, int0);
  }

  /**
  //Test case number: 15
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(1816);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 1, "RuntimeVisibleAnnotations", "", "", "");
      FieldWriter fieldWriter1 = new FieldWriter(classWriter0, 131072, "</O`,t[>=5Ds\"I3<", "</O`,t[>=5Ds\"I3<", "The wildcard array must not be null", "The wildcard array must not be null");
      assertFalse(fieldWriter1.equals((Object)fieldWriter0));
  }

  /**
  //Test case number: 16
  /*Coverage entropy=0.5623351446188083
  */
  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      ClassReader classReader0 = new ClassReader("wheel.asm.Frame");
      ClassWriter classWriter0 = new ClassWriter(classReader0, 8);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 0, "RuntimeInvisibleAnnotations", "RuntimeInvisibleAnnotations", "RuntimeInvisibleAnnotations", "[.R4H]rR");
      fieldWriter0.visitEnd();
  }

  /**
  //Test case number: 17
  /*Coverage entropy=0.5623351446188083
  */
  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(1713);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, (-484), "RuntimeVisibleAnnotations", "RuntimeVisibleAnnotations", "RuntimeVisibleAnnotations", "RuntimeVisibleAnnotations");
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
