/*
 * This file was automatically generated by EvoSuite
 * Sun Nov 29 09:00:13 GMT 2020
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
      ClassWriter classWriter0 = new ClassWriter(2940);
      classWriter0.index = (-2667);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, (-112), "|72q2<&vyM/Gk", "l4x8[4QmjbDKxD:in>", "l4x8[4QmjbDKxD:in>", "l4x8[4QmjbDKxD:in>");
      ByteVector byteVector0 = new ByteVector(4986);
      fieldWriter0.put(byteVector0);
  }

  /**
  //Test case number: 1
  /*Coverage entropy=0.5859526183035508
  */
  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(2962);
      classWriter0.index = (-2892);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, (-2667), "|72q2<&vyM/Gk", "|72q2<&vyM/Gk", "wheel.asm.FieldWriter", (Object) null);
      int int0 = fieldWriter0.getSize();
      assertEquals(28, int0);
  }

  /**
  //Test case number: 2
  /*Coverage entropy=0.5623351446188083
  */
  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(2962);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 2, "", "", (String) null, (Object) null);
      // Undeclared exception!
      try { 
        fieldWriter0.put((ByteVector) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("wheel.asm.FieldWriter", e);
      }
  }

  /**
  //Test case number: 3
  /*Coverage entropy=0.5623351446188083
  */
  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(2962);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 2, "", "", (String) null, (Object) null);
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

  /**
  //Test case number: 4
  /*Coverage entropy=0.5623351446188083
  */
  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(49);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, (-2282), "", "", "~T\"V?&N? 0k-[J<", "~T\"V?&N? 0k-[J<");
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
  //Test case number: 5
  /*Coverage entropy=0.8239592165010823
  */
  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(65522);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 2, "y`lRv]o/5.{8", "y`lRv]o/5.{8", "y`lRv]o/5.{8", "y`lRv]o/5.{8");
      Attribute attribute0 = new Attribute("");
      fieldWriter0.visitAttribute(attribute0);
      fieldWriter0.visitAttribute(attribute0);
      ByteVector byteVector0 = classWriter0.pool;
      // Undeclared exception!
      fieldWriter0.put(byteVector0);
  }

  /**
  //Test case number: 6
  /*Coverage entropy=0.5623351446188083
  */
  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(2962);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 2, "", "", (String) null, (Object) null);
      ByteVector byteVector0 = new ByteVector(2);
      ByteVector byteVector1 = byteVector0.put11(1, (-754));
      byteVector1.length = (-754);
      // Undeclared exception!
      try { 
        fieldWriter0.put(byteVector1);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -754
         //
         verifyException("wheel.asm.ByteVector", e);
      }
  }

  /**
  //Test case number: 7
  /*Coverage entropy=0.6730116670092565
  */
  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(2962);
      ByteVector byteVector0 = classWriter0.pool;
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 1, "", "|E72q2<&vyM/k", (String) null, "|E72q2<&vyM/k");
      byteVector0.length = 1608;
      // Undeclared exception!
      try { 
        fieldWriter0.getSize();
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
      }
  }

  /**
  //Test case number: 8
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      FieldWriter fieldWriter0 = null;
      try {
        fieldWriter0 = new FieldWriter((ClassWriter) null, 49, "", "", "", (Object) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("wheel.asm.FieldWriter", e);
      }
  }

  /**
  //Test case number: 9
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(2962);
      Object object0 = new Object();
      FieldWriter fieldWriter0 = null;
      try {
        fieldWriter0 = new FieldWriter(classWriter0, 795, "wheel.asm.FieldWriter", "", "|E72q2<&vyM/k", object0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // value java.lang.Object@622448b1
         //
         verifyException("wheel.asm.ClassWriter", e);
      }
  }

  /**
  //Test case number: 10
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(1500);
      ByteVector byteVector0 = classWriter0.pool;
      byteVector0.putInt(1500);
      byte[] byteArray0 = new byte[3];
      byteVector0.data = byteArray0;
      FieldWriter fieldWriter0 = null;
      try {
        fieldWriter0 = new FieldWriter(classWriter0, 0, "RuntimeInvisibleAnnotations", "org.apache.commons.io.filefilter.SuffixFileFilter", "org.apache.commons.io.filefilter.SuffixFileFilter", byteVector0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
      }
  }

  /**
  //Test case number: 11
  /*Coverage entropy=0.6330395116644678
  */
  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-995));
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 49, "", "", "~T\"V?&N? 0k-[J<", "~T\"V?&N? 0k-[J<");
      ByteVector byteVector0 = new ByteVector();
      Attribute attribute0 = new Attribute("");
      fieldWriter0.visitAttribute(attribute0);
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
  //Test case number: 12
  /*Coverage entropy=0.6128694524619496
  */
  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(49);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, (-2282), "", "", "~T\"V?&N? 0k-[J<", "~T\"V?&N? 0k-[J<");
      ByteVector byteVector0 = new ByteVector();
      fieldWriter0.visitAnnotation("~T\"V?&N? 0k-[J<", false);
      fieldWriter0.put(byteVector0);
  }

  /**
  //Test case number: 13
  /*Coverage entropy=0.6546695645285008
  */
  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(2962);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 2, "", "", (String) null, (Object) null);
      ByteVector byteVector0 = new ByteVector(2);
      fieldWriter0.visitAnnotation("", true);
      fieldWriter0.put(byteVector0);
  }

  /**
  //Test case number: 14
  /*Coverage entropy=0.4361623253853443
  */
  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(2940);
      classWriter0.version = 52;
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, (-2667), "|72q2<&vyM/Gk", "|72q2<&vyM/Gk", "l4x8[4QmjbDKxD:in>", (Object) null);
      ByteVector byteVector0 = new ByteVector(4986);
      fieldWriter0.put(byteVector0);
  }

  /**
  //Test case number: 15
  /*Coverage entropy=0.7902679680745903
  */
  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(2962);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, (-2667), "|72q2<&vyM/Gk", "|72q2<&vyM/Gk", "wheel.asm.FieldWriter", (Object) null);
      Attribute attribute0 = new Attribute("wheel.asm.FieldWriter");
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
  /*Coverage entropy=0.8239592165010823
  */
  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(2962);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, (-2667), "|72q2<&vyM/Gk", "|72q2<&vyM/Gk", "wheel.asm.FieldWriter", (Object) null);
      fieldWriter0.visitAnnotation("2&l8_Y'<0U", true);
      int int0 = fieldWriter0.getSize();
      assertEquals(40, int0);
  }

  /**
  //Test case number: 17
  /*Coverage entropy=0.6108643020548935
  */
  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(2962);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 2, "|E72q2<&vyM/k", "", (String) null, (Object) null);
      int int0 = fieldWriter0.getSize();
      assertEquals(8, int0);
  }

  /**
  //Test case number: 18
  /*Coverage entropy=0.5859526183035508
  */
  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(2962);
      classWriter0.version = 2962;
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, (-2667), "|72q2<&vyM/Gk", "|72q2<&vyM/Gk", "wheel.asm.FieldWriter", (Object) null);
      int int0 = fieldWriter0.getSize();
      assertEquals(22, int0);
  }

  /**
  //Test case number: 19
  /*Coverage entropy=0.6108643020548935
  */
  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(2962);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 0, "|72q2<&vyM/Gk", "|72q2<&vyM/Gk", "|72q2<&vyM/Gk", "|72q2<&vyM/Gk");
      int int0 = fieldWriter0.getSize();
      assertEquals(24, int0);
  }

  /**
  //Test case number: 20
  /*Coverage entropy=0.8239592165010823
  */
  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(49);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, (-2282), "", "", "~T\"V?&N? 0k-[J<", "~T\"V?&N? 0k-[J<");
      fieldWriter0.visitAnnotation("~T\"V?&N? 0k-[J<", false);
      int int0 = fieldWriter0.getSize();
      assertEquals(48, int0);
  }

  /**
  //Test case number: 21
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(2962);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, (-2667), "|72q2<&vyM/Gk", "|72q2<&vyM/Gk", "}4x8[4QmjbDKxD:inl", "}4x8[4QmjbDKxD:inl");
      FieldWriter fieldWriter1 = new FieldWriter(classWriter0, 2533, "}4x8[4QmjbDKxD:inl", "|72q2<&vyM/Gk", "ga!", "}4x8[4QmjbDKxD:inl");
      assertFalse(fieldWriter1.equals((Object)fieldWriter0));
  }

  /**
  //Test case number: 22
  /*Coverage entropy=0.5623351446188083
  */
  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(2);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 66, "q", "q", "RuntimeVisibleAnnotations", (Object) null);
      fieldWriter0.visitEnd();
  }
}
