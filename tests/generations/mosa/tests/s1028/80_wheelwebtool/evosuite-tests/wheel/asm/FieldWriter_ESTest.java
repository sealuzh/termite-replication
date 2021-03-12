/*
 * This file was automatically generated by EvoSuite
 * Sat Nov 07 21:41:07 GMT 2020
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
      ClassWriter classWriter0 = new ClassWriter(8);
      String[] stringArray0 = new String[2];
      stringArray0[0] = "w";
      stringArray0[1] = "w";
      classWriter0.visit(49, 49, "", "", "w", stringArray0);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, (-3098), "", "w", "org.apache.commons.io.filefilter.DelegateFileFilter", "");
      ByteVector byteVector0 = new ByteVector();
      fieldWriter0.put(byteVector0);
  }

  /**
  //Test case number: 1
  /*Coverage entropy=0.4361623253853443
  */
  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-2));
      classWriter0.index = (-2);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, (-2), ":>$px~@m", ":>$px~@m", ":>$px~@m", ":>$px~@m");
      ByteVector byteVector0 = new ByteVector();
      fieldWriter0.put(byteVector0);
  }

  /**
  //Test case number: 2
  /*Coverage entropy=0.5859526183035508
  */
  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(0);
      classWriter0.version = (-1455);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, (-1455), "9t@~N", "YoKOwQ8t8e$O\"6T", "9t@~N", "9t@~N");
      int int0 = fieldWriter0.getSize();
      assertEquals(30, int0);
  }

  /**
  //Test case number: 3
  /*Coverage entropy=0.5859526183035508
  */
  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(0);
      classWriter0.index = (-1455);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, (-1455), "9t@~N", "YoKOwQ8t8'$O\"6T", "9t@~N", "9t@~N");
      int int0 = fieldWriter0.getSize();
      assertEquals(36, int0);
  }

  /**
  //Test case number: 4
  /*Coverage entropy=0.5623351446188083
  */
  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-2));
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, (-2), ":>$px~@m", ":>$px~@m", ":>$px~@m", ":>$px~@m");
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
      ClassWriter classWriter0 = new ClassWriter(8);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 1, "", "", "", "");
      Attribute attribute0 = new Attribute("");
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
      ClassWriter classWriter0 = new ClassWriter((-2));
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, (-2), ":>$px~@m", ":>$px~@m", ":>$px~@m", ":>$px~@m");
      ByteVector byteVector0 = new ByteVector();
      byteVector0.length = 225;
      // Undeclared exception!
      try { 
        fieldWriter0.put(byteVector0);
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
      ClassWriter classWriter0 = new ClassWriter(39);
      FieldWriter fieldWriter0 = null;
      try {
        fieldWriter0 = new FieldWriter(classWriter0, 39, (String) null, (String) null, (String) null, (Object) null);
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
      ClassWriter classWriter0 = new ClassWriter((-1171));
      FieldWriter fieldWriter0 = null;
      try {
        fieldWriter0 = new FieldWriter(classWriter0, (-1171), "U\"BG4tRfb.wv2i", "U\"BG4tRfb.wv2i", "U\"BG4tRfb.wv2i", classWriter0);
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
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(65538);
      ByteVector byteVector0 = classWriter0.pool;
      byteVector0.length = 65538;
      FieldWriter fieldWriter0 = null;
      try {
        fieldWriter0 = new FieldWriter(classWriter0, 2, "NL", "NL", "NL", "NL");
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
      }
  }

  /**
  //Test case number: 10
  /*Coverage entropy=0.6330395116644678
  */
  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(8);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 1, "", "", "", "");
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

  /**
  //Test case number: 11
  /*Coverage entropy=0.6128694524619496
  */
  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-2));
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, (-2), ":>$px~@m", ":>$px~@m", ":>$px~@m", ":>$px~@m");
      fieldWriter0.visitAnnotation(":>$px~@m", false);
      ByteVector byteVector0 = new ByteVector();
      fieldWriter0.put(byteVector0);
  }

  /**
  //Test case number: 12
  /*Coverage entropy=0.6128694524619496
  */
  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-2));
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, (-2), ":>$px~@m", ":>$px~@m", ":>$px~@m", ":>$px~@m");
      ByteVector byteVector0 = classWriter0.pool;
      fieldWriter0.visitAnnotation(":>$px~@m", true);
      fieldWriter0.put(byteVector0);
  }

  /**
  //Test case number: 13
  /*Coverage entropy=0.4659992569610426
  */
  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(0);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 2, "org.apache.commoXs.io.fi[efilter.DelegateFileFilter", "org.apache.commoXs.io.fi[efilter.DelegateFileFilter", (String) null, "org.apache.commoXs.io.fi[efilter.DelegateFileFilter");
      ByteVector byteVector0 = classWriter0.pool;
      fieldWriter0.put(byteVector0);
  }

  /**
  //Test case number: 14
  /*Coverage entropy=0.4361623253853443
  */
  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(0);
      classWriter0.version = (-1455);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, (-1455), "9t@~N", "YoKOwQ8t8e$O\"6T", "9t@~N", "9t@~N");
      ByteVector byteVector0 = classWriter0.pool;
      fieldWriter0.put(byteVector0);
  }

  /**
  //Test case number: 15
  /*Coverage entropy=0.7902679680745903
  */
  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-2));
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, (-2), ":>$px~@m", ":>$px~@m", ":>$px~@m", ":>$px~@m");
      Attribute attribute0 = new Attribute(":>$px~@m");
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
      ClassWriter classWriter0 = new ClassWriter((-14));
      FieldWriter fieldWriter0 = (FieldWriter)classWriter0.visitField((-14), "A0Ts*L- 8awfn49", "HtLC-%.", "", "HtLC-%.");
      String[] stringArray0 = new String[1];
      stringArray0[0] = "";
      classWriter0.visit(49, 49, "", "Signature", "A!eOH=~", stringArray0);
      int int0 = fieldWriter0.getSize();
      assertEquals(30, int0);
  }

  /**
  //Test case number: 17
  /*Coverage entropy=0.8599672810355049
  */
  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(2);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 1, ":>$px~@m", ":>$px~@m", ":>$px~@m", ":>$px~@m");
      fieldWriter0.visitAnnotation(":>$px~@m", true);
      int int0 = fieldWriter0.getSize();
      assertEquals(36, int0);
  }

  /**
  //Test case number: 18
  /*Coverage entropy=0.8599672810355049
  */
  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-10));
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 2, "", "", "", "");
      fieldWriter0.visitAnnotation("", false);
      int int0 = fieldWriter0.getSize();
      assertEquals(36, int0);
  }

  /**
  //Test case number: 19
  /*Coverage entropy=0.6108643020548935
  */
  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(0);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 1, "org.apache.commoXs.io.filefilter.DelegateFileFilter", "org.apache.commoXs.io.filefilter.DelegateFileFilter", "org.apache.commoXs.io.filefilter.DelegateFileFilter", (Object) null);
      int int0 = fieldWriter0.getSize();
      assertEquals(16, int0);
  }

  /**
  //Test case number: 20
  /*Coverage entropy=0.6108643020548935
  */
  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-1));
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 2, "org.apache.commoXs.io.fi[efilter.DelegateFileFilter", "org.apache.commoXs.io.fi[efilter.DelegateFileFilter", (String) null, "org.apache.commoXs.io.fi[efilter.DelegateFileFilter");
      int int0 = fieldWriter0.getSize();
      assertEquals(16, int0);
  }

  /**
  //Test case number: 21
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-10));
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 2, "", "", "", "");
      FieldWriter fieldWriter1 = new FieldWriter(classWriter0, (-10), "", "", "", "");
      assertFalse(fieldWriter1.equals((Object)fieldWriter0));
  }

  /**
  //Test case number: 22
  /*Coverage entropy=0.5623351446188083
  */
  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(0);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 1, "", "", "", "");
      fieldWriter0.visitEnd();
  }

  /**
  //Test case number: 23
  /*Coverage entropy=0.5623351446188083
  */
  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(0);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 1, "", "", "", "");
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
