/*
 * This file was automatically generated by EvoSuite
 * Fri Nov 06 17:27:31 GMT 2020
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
      ClassWriter classWriter0 = new ClassWriter((-1620));
      classWriter0.index = (-1620);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, (-1620), "G<?9GBZe2/B", "G<?9GBZe2/B", "G<?9GBZe2/B", "G<?9GBZe2/B");
      ByteVector byteVector0 = new ByteVector(2);
      fieldWriter0.put(byteVector0);
  }

  /**
  //Test case number: 1
  /*Coverage entropy=0.5859526183035508
  */
  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-1620));
      classWriter0.index = (-1581);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, (-1620), "G<?9G6BZeB]", "G<?9G6BZeB]", "G<?9G6BZeB]", "G<?9G6BZeB]");
      int int0 = fieldWriter0.getSize();
      assertEquals(36, int0);
  }

  /**
  //Test case number: 2
  /*Coverage entropy=0.5623351446188083
  */
  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-1647));
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 2, "Synthetic", "Synthetic", "Synthetic", "Synthetic");
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
  //Test case number: 3
  /*Coverage entropy=0.5623351446188083
  */
  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(0);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, (-1103), "The list of suffixes must not be null", "7\"", "The list of suffixes must not be null", "7\"");
      ByteVector byteVector0 = classWriter0.pool;
      byteVector0.length = 65535;
      // Undeclared exception!
      try { 
        fieldWriter0.visitAnnotation("fmfS", true);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
      }
  }

  /**
  //Test case number: 4
  /*Coverage entropy=0.5623351446188083
  */
  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-1252));
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 1, "%", "%", "%", "%");
      ByteVector byteVector0 = classWriter0.pool;
      byteVector0.length = (-1252);
      // Undeclared exception!
      try { 
        fieldWriter0.put(byteVector0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
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
      FieldWriter fieldWriter0 = null;
      try {
        fieldWriter0 = new FieldWriter((ClassWriter) null, 8, "P", "P", "P", "P");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("wheel.asm.FieldWriter", e);
      }
  }

  /**
  //Test case number: 6
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(3212);
      FieldWriter fieldWriter0 = null;
      try {
        fieldWriter0 = new FieldWriter(classWriter0, 3212, "/igneq@tur2", "/igneq@tur2", "/igneq@tur2", classWriter0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // value wheel.asm.ClassWriter@5
         //
         verifyException("wheel.asm.ClassWriter", e);
      }
  }

  /**
  //Test case number: 7
  /*Coverage entropy=0.5940241655824705
  */
  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-1));
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, (-1), "Signature", "Signature", "Signature", "Signature");
      Attribute attribute0 = new Attribute("The array of names must not be null");
      fieldWriter0.visitAttribute(attribute0);
      ByteVector byteVector0 = new ByteVector();
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
  //Test case number: 8
  /*Coverage entropy=0.6128694524619496
  */
  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-7));
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, (-7), "", "", "", "");
      fieldWriter0.visitAnnotation("", false);
      ByteVector byteVector0 = new ByteVector();
      fieldWriter0.put(byteVector0);
  }

  /**
  //Test case number: 9
  /*Coverage entropy=0.6128694524619496
  */
  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(0);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, (-1103), "The list of suffixes must not be null", "7\"", "The list of suffixes must not be null", "7\"");
      ByteVector byteVector0 = classWriter0.pool;
      fieldWriter0.visitAnnotation("7\"", true);
      fieldWriter0.put(byteVector0);
  }

  /**
  //Test case number: 10
  /*Coverage entropy=0.4361623253853443
  */
  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-1224));
      classWriter0.version = (-1224);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, (-1224), "/igneq@tur2", "/igneq@tur2", "/igneq@tur2", "/igneq@tur2");
      ByteVector byteVector0 = classWriter0.pool;
      fieldWriter0.put(byteVector0);
  }

  /**
  //Test case number: 11
  /*Coverage entropy=0.4659992569610426
  */
  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(0);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 2, "7\"", "7\"", (String) null, (Object) null);
      ByteVector byteVector0 = classWriter0.pool;
      fieldWriter0.put(byteVector0);
  }

  /**
  //Test case number: 12
  /*Coverage entropy=0.7902679680745903
  */
  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-1620));
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, (-1620), ")0", ")0", ")0", ")0");
      Attribute attribute0 = new Attribute(")0");
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
  //Test case number: 13
  /*Coverage entropy=0.5859526183035508
  */
  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-1224));
      classWriter0.version = (-1224);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, (-1224), "/igneq@tur2", "/igneq@tur2", "/igneq@tur2", "/igneq@tur2");
      int int0 = fieldWriter0.getSize();
      assertEquals(30, int0);
  }

  /**
  //Test case number: 14
  /*Coverage entropy=0.6108643020548935
  */
  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(0);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 2, "7\"", "7\"", (String) null, (Object) null);
      int int0 = fieldWriter0.getSize();
      assertEquals(8, int0);
  }

  /**
  //Test case number: 15
  /*Coverage entropy=0.8239592165010823
  */
  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(0);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, (-1103), "The list of suffixes must not be null", "7\"", "The list of suffixes must not be null", "7\"");
      fieldWriter0.visitAnnotation("7\"", true);
      int int0 = fieldWriter0.getSize();
      assertEquals(48, int0);
  }

  /**
  //Test case number: 16
  /*Coverage entropy=0.8239592165010823
  */
  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-1));
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, (-1), "Signature", "Signature", "Signature", "Signature");
      fieldWriter0.visitAnnotation("Signature", false);
      int int0 = fieldWriter0.getSize();
      assertEquals(48, int0);
  }

  /**
  //Test case number: 17
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(0);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, (-1103), "The list of suffixes must not be null", "7\"", "The list of suffixes must not be null", "7\"");
      FieldWriter fieldWriter1 = new FieldWriter(classWriter0, 2, "7\"", "7\"", (String) null, (Object) null);
      assertFalse(fieldWriter1.equals((Object)fieldWriter0));
  }

  /**
  //Test case number: 18
  /*Coverage entropy=0.5623351446188083
  */
  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(899);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 1, "", "", "", (Object) null);
      fieldWriter0.visitEnd();
  }

  /**
  //Test case number: 19
  /*Coverage entropy=0.5623351446188083
  */
  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(22);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 22, "Signature", "Signature", "Signature", "Signature");
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
