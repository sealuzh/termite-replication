/*
 * This file was automatically generated by EvoSuite
 * Tue Dec 03 06:51:22 GMT 2019
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
import wheel.asm.FieldVisitor;
import wheel.asm.FieldWriter;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class FieldWriter_ESTest extends FieldWriter_ESTest_scaffolding {

  /**
  //Test case number: 0
  /*Coverage entropy=0.42857142857142855
  */
  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(1189);
      classWriter0.index = (-2363);
      FieldWriter fieldWriter0 = (FieldWriter)classWriter0.visitField(1189, "^iCOgpO", "Ow!E85/%~?BFMp[6J", "^iCOgpO", "^iCOgpO");
      FieldWriter fieldWriter1 = classWriter0.lastField;
      fieldWriter1.getSize();
      ByteVector byteVector0 = new ByteVector(256);
      ByteVector byteVector1 = byteVector0.putInt(2276);
      fieldWriter0.put(byteVector1);
      assertSame(byteVector0, byteVector1);
  }

  /**
  //Test case number: 1
  /*Coverage entropy=0.42857142857142855
  */
  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(131121);
      classWriter0.version = 131121;
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, (-1841), ":wB?#h!Q:~", ":wB?#h!Q:~", ":wB?#h!Q:~", ":wB?#h!Q:~");
      ByteVector byteVector0 = new ByteVector();
      fieldWriter0.getSize();
      fieldWriter0.put(byteVector0);
  }

  /**
  //Test case number: 2
  /*Coverage entropy=0.4
  */
  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(131120);
      classWriter0.version = 131120;
      classWriter0.index = 131120;
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, (-1841), "&:w B?#hQ:~", "&:w B?#hQ:~", "&:w B?#hQ:~", "&:w B?#hQ:~");
      // Undeclared exception!
      fieldWriter0.getSize();
  }

  /**
  //Test case number: 3
  /*Coverage entropy=0.3333333333333333
  */
  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(131100);
      ByteVector byteVector0 = classWriter0.pool;
      ByteVector byteVector1 = byteVector0.put11(3, 2);
      ByteVector byteVector2 = byteVector1.putInt(2);
      byteVector0.putByte(3);
      byteVector2.length = 131100;
      Object object0 = new Object();
      FieldWriter fieldWriter0 = null;
      try {
        fieldWriter0 = new FieldWriter(classWriter0, 1, "Class not found", " *TAVdr@", " *TAVdr@", object0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
      }
  }

  /**
  //Test case number: 4
  /*Coverage entropy=0.4
  */
  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(4096);
      FieldWriter fieldWriter0 = (FieldWriter)classWriter0.visitField(4096, "Ai5", "Ai5", "Ai5", "Ai5");
      ByteVector byteVector0 = new ByteVector();
      byteVector0.length = 4096;
      // Undeclared exception!
      try { 
        fieldWriter0.put(byteVector0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
      }
  }

  /**
  //Test case number: 5
  /*Coverage entropy=0.4
  */
  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-502));
      classWriter0.version = (-502);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, (-1841), "&:w B?#hQ:~", "&:w B?#hQ:~", "&:w B?#hQ:~", "&:w B?#hQ:~");
      ByteVector byteVector0 = new ByteVector();
      int int0 = fieldWriter0.getSize();
      assertEquals(30, int0);
  }

  /**
  //Test case number: 6
  /*Coverage entropy=0.4
  */
  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(131123);
      classWriter0.version = 131123;
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, (-1841), "&:w B?#hQ:~", "&:w B?#hQ:~", "&:w B?#hQ:~", "&:w B?#hQ:~");
      ByteVector byteVector0 = classWriter0.pool;
      fieldWriter0.put(byteVector0);
  }

  /**
  //Test case number: 7
  /*Coverage entropy=0.42857142857142855
  */
  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(4103);
      FieldWriter fieldWriter0 = (FieldWriter)classWriter0.visitField(4103, "Pi|5", "Pi|5", "Pi|5", "Pi|5");
      Attribute attribute0 = new Attribute("Pi|5");
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
  //Test case number: 8
  /*Coverage entropy=0.4
  */
  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(131108);
      FieldWriter fieldWriter0 = (FieldWriter)classWriter0.visitField(131108, "d*e", "d*e", "d*e", "d*e");
      int int0 = fieldWriter0.getSize();
      assertEquals(30, int0);
  }

  /**
  //Test case number: 9
  /*Coverage entropy=0.42857142857142855
  */
  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(4096);
      FieldWriter fieldWriter0 = (FieldWriter)classWriter0.visitField(4096, "Ai|5", "Ai|5", "Ai|5", "Ai|5");
      fieldWriter0.visitAnnotation("Ai|5", false);
      ByteVector byteVector0 = new ByteVector();
      fieldWriter0.put(byteVector0);
  }

  /**
  //Test case number: 10
  /*Coverage entropy=0.4
  */
  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(27);
      FieldVisitor fieldVisitor0 = classWriter0.visitField(27, "Ow!E85/%~?BFMp[6J", "Ow!E85/%~?BFMp[6J", (String) null, (Object) null);
      // Undeclared exception!
      try { 
        fieldVisitor0.visitAnnotation((String) null, true);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  /**
  //Test case number: 11
  /*Coverage entropy=0.4
  */
  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(131100);
      FieldWriter fieldWriter0 = (FieldWriter)classWriter0.visitField(131100, "d*e", "d*e", "d*e", "d*e");
      ByteVector byteVector0 = classWriter0.pool;
      fieldWriter0.put(byteVector0);
  }

  /**
  //Test case number: 12
  /*Coverage entropy=0.4
  */
  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(4096);
      FieldWriter fieldWriter0 = (FieldWriter)classWriter0.visitField(4096, "Ai5", "Ai5", "Ai5", "Ai5");
      ByteVector byteVector0 = classWriter0.pool;
      fieldWriter0.put(byteVector0);
  }

  /**
  //Test case number: 13
  /*Coverage entropy=0.42857142857142855
  */
  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(1151);
      FieldWriter fieldWriter0 = (FieldWriter)classWriter0.visitField(1151, "org.apahe.cSmmons.io.filefilter.AbstactFilFilter", "org.apahe.cSmmons.io.filefilter.AbstactFilFilter", "org.apahe.cSmmons.io.filefilter.AbstactFilFilter", "org.apahe.cSmmons.io.filefilter.AbstactFilFilter");
      fieldWriter0.visitAnnotation("org.apahe.cSmmons.io.filefilter.AbstactFilFilter", true);
      ByteVector byteVector0 = new ByteVector();
      fieldWriter0.put(byteVector0);
  }

  /**
  //Test case number: 14
  /*Coverage entropy=0.42857142857142855
  */
  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(1164);
      FieldWriter fieldWriter0 = (FieldWriter)classWriter0.visitField(1164, "RuntimeInvisbleAnnotations", "RuntimeInvisbleAnnotations", "RuntimeInvisbleAnnotations", "RuntimeInvisbleAnnotations");
      fieldWriter0.visitAnnotation("RuntimeInvisbleAnnotations", false);
      int int0 = fieldWriter0.getSize();
      assertEquals(36, int0);
  }

  /**
  //Test case number: 15
  /*Coverage entropy=0.4
  */
  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(1175);
      classWriter0.visitField(1175, "RuntimeInvvibleAnn8tations", "RuntimeInvvibleAnn8tations", "RuntimeInvvibleAnn8tations", "RuntimeInvvibleAnn8tations");
      Object object0 = new Object();
      // Undeclared exception!
      try { 
        classWriter0.visitField(1175, "RuntimeInvvibleAnn8tations", "RuntimeInvvibleAnn8tations", "RuntimeInvvibleAnn8tations", object0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // value java.lang.Object@3e7ef49f
         //
         verifyException("wheel.asm.ClassWriter", e);
      }
  }

  /**
  //Test case number: 16
  /*Coverage entropy=0.4
  */
  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(1189);
      FieldWriter fieldWriter0 = (FieldWriter)classWriter0.visitField(1189, "RuntimeInvisibleAnnotations", "RuntimeInvisibleAnnotations", (String) null, (Object) null);
      ByteVector byteVector0 = new ByteVector(1189);
      fieldWriter0.put(byteVector0);
  }

  /**
  //Test case number: 17
  /*Coverage entropy=0.3333333333333333
  */
  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-1101));
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, (-1101), "8{+Fu", "8{+Fu", (String) null, (Object) null);
  }

  /**
  //Test case number: 18
  /*Coverage entropy=0.4
  */
  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(1164);
      FieldWriter fieldWriter0 = (FieldWriter)classWriter0.visitField(1164, "RuntimeInvisibleAnnotations", "RuntimeInvisibleAnnotations", "RuntimeInvisibleAnnotations", "RuntimeInvisibleAnnotations");
      ByteVector byteVector0 = new ByteVector(1164);
      fieldWriter0.put(byteVector0);
  }

  /**
  //Test case number: 19
  /*Coverage entropy=0.3333333333333333
  */
  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(2248);
      FieldWriter fieldWriter0 = null;
      try {
        fieldWriter0 = new FieldWriter(classWriter0, 2, "Deprecated", "Deprecated", "Deprecated", classWriter0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // value wheel.asm.ClassWriter@5
         //
         verifyException("wheel.asm.ClassWriter", e);
      }
  }

  /**
  //Test case number: 20
  /*Coverage entropy=0.4
  */
  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(131098);
      FieldWriter fieldWriter0 = (FieldWriter)classWriter0.visitField(131098, "RuntimeInvisibleAnnotations", "RuntimeInvisibleAnnotations", (String) null, (Object) null);
      int int0 = fieldWriter0.getSize();
      assertEquals(14, int0);
  }

  /**
  //Test case number: 21
  /*Coverage entropy=0.4
  */
  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(4090);
      FieldWriter fieldWriter0 = (FieldWriter)classWriter0.visitField(4090, "Ai5", "Ai5", "Ai5", "Ai5");
      int int0 = fieldWriter0.getSize();
      assertEquals(24, int0);
  }

  /**
  //Test case number: 22
  /*Coverage entropy=0.3333333333333333
  */
  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(131100);
      FieldVisitor fieldVisitor0 = classWriter0.visitField(131100, "d*e", "d*e", (String) null, "d*e");
      assertNotNull(fieldVisitor0);
  }

  /**
  //Test case number: 23
  /*Coverage entropy=0.42857142857142855
  */
  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(1164);
      classWriter0.newInteger(1164);
      FieldWriter fieldWriter0 = (FieldWriter)classWriter0.visitField(1164, "RuntimeInvisibleAnnotations", "RuntimeInvisibleAnnotations", "RuntimeInvisibleAnnotations", "RuntimeInvisibleAnnotations");
      Attribute attribute0 = new Attribute("RuntimeInvisibleAnnotations");
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
  //Test case number: 24
  /*Coverage entropy=0.42857142857142855
  */
  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(1164);
      FieldWriter fieldWriter0 = (FieldWriter)classWriter0.visitField(1164, "RuntimeInvisbleAnnotations", "RuntimeInvisbleAnnotations", "RuntimeInvisbleAnnotations", "RuntimeInvisbleAnnotations");
      fieldWriter0.visitAnnotation("RuntimeInvisbleAnnotations", true);
      int int0 = fieldWriter0.getSize();
      assertEquals(36, int0);
  }

  /**
  //Test case number: 25
  /*Coverage entropy=0.4
  */
  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(4096);
      FieldWriter fieldWriter0 = (FieldWriter)classWriter0.visitField(4096, "Ai5", "Ai5", "Ai5", "Ai5");
      int int0 = fieldWriter0.getSize();
      assertEquals(30, int0);
  }

  /**
  //Test case number: 26
  /*Coverage entropy=0.4
  */
  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(131108);
      FieldVisitor fieldVisitor0 = classWriter0.visitField(131108, "d*e", "d*e", "d*e", "d*e");
      // Undeclared exception!
      try { 
        fieldVisitor0.visitAttribute((Attribute) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("wheel.asm.FieldWriter", e);
      }
  }

  /**
  //Test case number: 27
  /*Coverage entropy=0.3333333333333333
  */
  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      FieldWriter fieldWriter0 = null;
      try {
        fieldWriter0 = new FieldWriter((ClassWriter) null, 1350, "", "", "", (Object) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("wheel.asm.FieldWriter", e);
      }
  }

  /**
  //Test case number: 28
  /*Coverage entropy=0.4
  */
  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(468);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 26, "", "", "%kROg+", "%kROg+");
      fieldWriter0.visitEnd();
      FieldWriter fieldWriter1 = classWriter0.lastField;
      assertSame(fieldWriter1, fieldWriter0);
  }
}
