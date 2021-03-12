/*
 * This file was automatically generated by EvoSuite
 * Sat Nov 28 06:11:23 GMT 2020
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
  /*Coverage entropy=0.5859526183035508
  */
  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(1988);
      classWriter0.index = (-1810);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 131066, "]", "]", "]", "]");
      int int0 = fieldWriter0.getSize();
      assertEquals(30, int0);
  }

  /**
  //Test case number: 1
  /*Coverage entropy=0.5623351446188083
  */
  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(1988);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 1988, "L", "L", "L", "L");
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
  //Test case number: 2
  /*Coverage entropy=0.5623351446188083
  */
  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(4096);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 4096, "%tU", "%tU", "%tU", "%tU");
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
  //Test case number: 3
  /*Coverage entropy=0.5623351446188083
  */
  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-4967));
      FieldVisitor fieldVisitor0 = classWriter0.visitField(2, "R", "R", (String) null, "R");
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
  //Test case number: 4
  /*Coverage entropy=0.5623351446188083
  */
  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(2005);
      FieldVisitor fieldVisitor0 = classWriter0.visitField(2, "RuntsmeInvisibleAnnotatgons", "RuntsmeInvisibleAnnotatgons", "RuntsmeInvisibleAnnotatgons", "RuntsmeInvisibleAnnotatgons");
      ByteVector byteVector0 = classWriter0.pool;
      byte[] byteArray0 = new byte[0];
      byteVector0.data = byteArray0;
      // Undeclared exception!
      try { 
        fieldVisitor0.visitAnnotation(".1V*&cr?k", true);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
      }
  }

  /**
  //Test case number: 5
  /*Coverage entropy=0.5623351446188083
  */
  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(2924);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 2924, "72q/<&vyM/Gk", "72q/<&vyM/Gk", "72q/<&vyM/Gk", (Object) null);
      ByteVector byteVector0 = new ByteVector(2);
      byteVector0.length = 2924;
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
  //Test case number: 6
  /*Coverage entropy=0.6730116670092565
  */
  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(2962);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, (-6), "|72q2<&vyM/Gk", "|72q2<&vyM/Gk", "|72q2<&vyM/Gk", "|72q2<&vyM/Gk");
      ByteVector byteVector0 = classWriter0.pool;
      byteVector0.length = 1835;
      // Undeclared exception!
      try { 
        fieldWriter0.getSize();
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
      }
  }

  /**
  //Test case number: 7
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(1988);
      classWriter0.index = 1048575;
      classWriter0.visitInnerClass("n5.NK]Fz_-0li{", "Xc,Xi", "c8CG;f(&+Jp&uVxk", 131072);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 131070, "]", "]", "]", "]");
  }

  /**
  //Test case number: 8
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(2);
      FieldWriter fieldWriter0 = null;
      try {
        fieldWriter0 = new FieldWriter(classWriter0, 2, "q", (String) null, "StackMap", classWriter0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  /**
  //Test case number: 9
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(1556);
      FieldWriter fieldWriter0 = null;
      try {
        fieldWriter0 = new FieldWriter(classWriter0, 2, "!Wk\":Mn", "!Wk\":Mn", "!Wk\":Mn", classWriter0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // value wheel.asm.ClassWriter@5
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
      ClassWriter classWriter0 = new ClassWriter((-735));
      ByteVector byteVector0 = classWriter0.pool;
      byteVector0.length = 855;
      FieldWriter fieldWriter0 = null;
      try {
        fieldWriter0 = new FieldWriter(classWriter0, 2473, "8:<eYyr\"5", "8:<eYyr\"5", "8:<eYyr\"5", "8:<eYyr\"5");
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
      }
  }

  /**
  //Test case number: 11
  /*Coverage entropy=0.4659992569610426
  */
  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(131072);
      FieldWriter fieldWriter0 = (FieldWriter)classWriter0.visitField(2, "", "", (String) null, "");
      ByteVector byteVector0 = classWriter0.pool;
      fieldWriter0.put(byteVector0);
  }

  /**
  //Test case number: 12
  /*Coverage entropy=0.4361623253853443
  */
  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(1988);
      classWriter0.version = 1988;
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 268435455, "JSR/RET are not supported with computeFrames option", "JSR/RET are not supported with computeFrames option", "JSR/RET are not supported with computeFrames option", "JSR/RET are not supported with computeFrames option");
      ByteVector byteVector0 = classWriter0.pool;
      fieldWriter0.put(byteVector0);
  }

  /**
  //Test case number: 13
  /*Coverage entropy=0.4361623253853443
  */
  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-2571));
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, (-2571), "", "", "", "");
      ByteVector byteVector0 = new ByteVector();
      fieldWriter0.put(byteVector0);
  }

  /**
  //Test case number: 14
  /*Coverage entropy=0.4659992569610426
  */
  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(2962);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 2962, "72q/<&vyM/Gk", "72q/<&vyM/Gk", "72q/<&vyM/Gk", (Object) null);
      ByteVector byteVector0 = new ByteVector(1);
      fieldWriter0.put(byteVector0);
  }

  /**
  //Test case number: 15
  /*Coverage entropy=0.7902679680745903
  */
  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(4096);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 4096, "v~t_e", "v~t_e", "v~t_e", "v~t_e");
      Attribute attribute0 = new Attribute("v~t_e");
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
  /*Coverage entropy=0.8599672810355049
  */
  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-4967));
      FieldWriter fieldWriter0 = (FieldWriter)classWriter0.visitField(2, "", "", "", "");
      fieldWriter0.visitAnnotation("", false);
      int int0 = fieldWriter0.getSize();
      assertEquals(36, int0);
  }

  /**
  //Test case number: 17
  /*Coverage entropy=0.8599672810355049
  */
  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(1988);
      FieldWriter fieldWriter0 = (FieldWriter)classWriter0.visitField(2, "", "", "", "");
      fieldWriter0.visitAnnotation("", true);
      int int0 = fieldWriter0.getSize();
      assertEquals(36, int0);
  }

  /**
  //Test case number: 18
  /*Coverage entropy=0.6108643020548935
  */
  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-4967));
      FieldWriter fieldWriter0 = (FieldWriter)classWriter0.visitField(2, "", "", (String) null, "");
      int int0 = fieldWriter0.getSize();
      assertEquals(16, int0);
  }

  /**
  //Test case number: 19
  /*Coverage entropy=0.5859526183035508
  */
  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(1988);
      classWriter0.version = 131059;
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 131059, "", "", "", "");
      int int0 = fieldWriter0.getSize();
      assertEquals(24, int0);
  }

  /**
  //Test case number: 20
  /*Coverage entropy=0.5859526183035508
  */
  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-2571));
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, (-2571), "{", "{", "{", "{");
      int int0 = fieldWriter0.getSize();
      assertEquals(36, int0);
  }

  /**
  //Test case number: 21
  /*Coverage entropy=0.6546695645285008
  */
  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(2005);
      FieldWriter fieldWriter0 = (FieldWriter)classWriter0.visitField(2, "RuntimeInvisibleAnnotations", "RuntimeInvisibleAnnotations", "RuntimeInvisibleAnnotations", "RuntimeInvisibleAnnotations");
      fieldWriter0.visitAnnotation("RuntimeInvisibleAnnotations", true);
      ByteVector byteVector0 = new ByteVector(2);
      fieldWriter0.put(byteVector0);
  }

  /**
  //Test case number: 22
  /*Coverage entropy=0.6546695645285008
  */
  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(1977);
      FieldWriter fieldWriter0 = (FieldWriter)classWriter0.visitField(2, "AS ", "AS ", "AS ", "AS ");
      fieldWriter0.visitAnnotation("AS ", false);
      ByteVector byteVector0 = classWriter0.pool;
      fieldWriter0.put(byteVector0);
  }

  /**
  //Test case number: 23
  /*Coverage entropy=0.6108643020548935
  */
  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(2962);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 2962, "72q/<&vyM/Gk", "72q/<&vyM/Gk", "72q/<&vyM/Gk", (Object) null);
      int int0 = fieldWriter0.getSize();
      assertEquals(16, int0);
  }

  /**
  //Test case number: 24
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(1988);
      FieldVisitor fieldVisitor0 = classWriter0.visitField(2, "Jk7s?{n+6uj", "Jk7s?{n+6uj", "Jk7s?{n+6uj", "Jk7s?{n+6uj");
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 2, "Jk7s?{n+6uj", "Jk7s?{n+6uj", "Jk7s?{n+6uj", "Jk7s?{n+6uj");
      assertFalse(fieldWriter0.equals((Object)fieldVisitor0));
  }

  /**
  //Test case number: 25
  /*Coverage entropy=0.5623351446188083
  */
  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(2);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 2, "EB}.", "q", "EB}.", "q");
      fieldWriter0.visitEnd();
  }

  /**
  //Test case number: 26
  /*Coverage entropy=0.6330395116644678
  */
  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(131072);
      FieldWriter fieldWriter0 = (FieldWriter)classWriter0.visitField(2, "", "", (String) null, "");
      Attribute attribute0 = new Attribute("");
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
}
