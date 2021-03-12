/*
 * This file was automatically generated by EvoSuite
 * Mon Nov 09 02:17:07 GMT 2020
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
  /*Coverage entropy=0.5623351446188083
  */
  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(1469);
      String[] stringArray0 = new String[9];
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 1, "yx<", "h:}7SB@;", stringArray0[5], "h:}7SB@;");
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
  //Test case number: 1
  /*Coverage entropy=0.5623351446188083
  */
  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(0);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 2, "gB|&SsyVhBE\"", "gB|&SsyVhBE\"", "gB|&SsyVhBE\"", (Object) null);
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
  //Test case number: 2
  /*Coverage entropy=0.5623351446188083
  */
  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(1469);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, (-2597), "", "Sensitive", "Sensitive", "Sensitive");
      ByteVector byteVector0 = new ByteVector();
      byteVector0.putByteArray((byte[]) null, (-1398), (-1398));
      // Undeclared exception!
      try { 
        fieldWriter0.put(byteVector0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -1398
         //
         verifyException("wheel.asm.ByteVector", e);
      }
  }

  /**
  //Test case number: 3
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      FieldWriter fieldWriter0 = null;
      try {
        fieldWriter0 = new FieldWriter((ClassWriter) null, 0, "", "", "", (Object) null);
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
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(0);
      FieldWriter fieldWriter0 = null;
      try {
        fieldWriter0 = new FieldWriter(classWriter0, 0, "gB|&SsyVhBE\"", "gB|&SsyVhBE\"", "gB|&SsyVhBE\"", classWriter0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // value wheel.asm.ClassWriter@5
         //
         verifyException("wheel.asm.ClassWriter", e);
      }
  }

  /**
  //Test case number: 5
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(1469);
      classWriter0.newMethodItem("Sensitive", "Sensitive", "", true);
      ByteVector byteVector0 = classWriter0.pool;
      byte[] byteArray0 = new byte[1];
      byteVector0.data = byteArray0;
      FieldWriter fieldWriter0 = null;
      try {
        fieldWriter0 = new FieldWriter(classWriter0, 1, "^o9il37%px *B&T^", "T}kg_o7&T3dO{kfJ_", "Sensitive", (Object) null);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
      }
  }

  /**
  //Test case number: 6
  /*Coverage entropy=0.6330395116644678
  */
  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(0);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 2, "gB|&SsyVhBE\"", "gB|&SsyVhBE\"", "gB|&SsyVhBE\"", (Object) null);
      ByteVector byteVector0 = new ByteVector();
      Attribute attribute0 = new Attribute((String) null);
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
  //Test case number: 7
  /*Coverage entropy=0.6546695645285008
  */
  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(0);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 2, "gB|&SsyVhBE\"", "gB|&SsyVhBE\"", "gB|&SsyVhBE\"", (Object) null);
      ByteVector byteVector0 = new ByteVector();
      fieldWriter0.visitAnnotation("gB|&SsyVhBE\"", false);
      fieldWriter0.put(byteVector0);
  }

  /**
  //Test case number: 8
  /*Coverage entropy=0.6546695645285008
  */
  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(0);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 2, "gB|&SsyVhBE\"", "gB|&SsyVhBE\"", "gB|&SsyVhBE\"", (Object) null);
      ByteVector byteVector0 = new ByteVector();
      fieldWriter0.visitAnnotation("gB|&SsyVhBE\"", true);
      fieldWriter0.put(byteVector0);
  }

  /**
  //Test case number: 9
  /*Coverage entropy=0.4659992569610426
  */
  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(1469);
      String[] stringArray0 = new String[9];
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 1, "yx<", "h:}7SB@;", stringArray0[5], "h:}7SB@;");
      ByteVector byteVector0 = new ByteVector();
      fieldWriter0.put(byteVector0);
  }

  /**
  //Test case number: 10
  /*Coverage entropy=0.4361623253853443
  */
  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(1469);
      String[] stringArray0 = new String[8];
      stringArray0[0] = "Sensitive";
      stringArray0[1] = "Sensitive";
      stringArray0[2] = "Sensitive";
      stringArray0[3] = "Sensitive";
      stringArray0[4] = "Sensitive";
      stringArray0[5] = "Sensitive";
      stringArray0[6] = "Sensitive";
      stringArray0[7] = "Sensitive";
      classWriter0.visit(51, (-2217), "Sensitive", "Sensitive", "Sensitive", stringArray0);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, (-2597), "", "Sensitive", "Sensitive", "Sensitive");
      ByteVector byteVector0 = new ByteVector();
      fieldWriter0.put(byteVector0);
  }

  /**
  //Test case number: 11
  /*Coverage entropy=0.4361623253853443
  */
  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(1469);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, (-1280), "Sensitive", "Sensitive", "Sensitive", "Sensitive");
      ByteVector byteVector0 = new ByteVector();
      fieldWriter0.put(byteVector0);
  }

  /**
  //Test case number: 12
  /*Coverage entropy=0.8239592165010823
  */
  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(1469);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, (-2597), "", "Sensitive", "Sensitive", "Sensitive");
      fieldWriter0.visitAnnotation("Sensitive", false);
      int int0 = fieldWriter0.getSize();
      assertEquals(48, int0);
  }

  /**
  //Test case number: 13
  /*Coverage entropy=0.8239592165010823
  */
  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(1469);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, (-2597), "", "Sensitive", "Sensitive", "Sensitive");
      fieldWriter0.visitAnnotation("Sensitive", true);
      int int0 = fieldWriter0.getSize();
      assertEquals(48, int0);
  }

  /**
  //Test case number: 14
  /*Coverage entropy=0.5859526183035508
  */
  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(1469);
      classWriter0.visit(1618, 15, "PhH:JKX", "The array of prefixes must not be null", "%(?[<G>I|Y$cIS1~a*", (String[]) null);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, (-2217), "Sensitive", "\"Sc&a'6n`s |I[Yz", (String) null, (Object) null);
      int int0 = fieldWriter0.getSize();
      assertEquals(14, int0);
  }

  /**
  //Test case number: 15
  /*Coverage entropy=0.6108643020548935
  */
  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(1469);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 1, "~Yw", "~Yw", "ETyN8)", (Object) null);
      int int0 = fieldWriter0.getSize();
      assertEquals(16, int0);
  }

  /**
  //Test case number: 16
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-725));
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 4096, "Sensitive", "Sensitive", "Sensitive", "Sensitive");
      FieldWriter fieldWriter1 = new FieldWriter(classWriter0, (-1785), "", "", "Exceptions", "");
      assertFalse(fieldWriter1.equals((Object)fieldWriter0));
  }

  /**
  //Test case number: 17
  /*Coverage entropy=0.5623351446188083
  */
  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(285212674);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 0, "gB|&SsyVhBE\"", "gB|&SsyVhBE\"", "gB|&SsyVhBE\"", "gB|&SsyVhBE\"");
      fieldWriter0.visitEnd();
  }

  /**
  //Test case number: 18
  /*Coverage entropy=0.7902679680745903
  */
  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(1469);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, (-2217), "Sensitive", "\"Sc&a'6n`s |I[Yz", (String) null, (Object) null);
      Attribute attribute0 = new Attribute("\"Sc&a'6n`s |I[Yz");
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
}
