/*
 * This file was automatically generated by EvoSuite
 * Tue Nov 10 21:15:58 GMT 2020
 */

package wheel.asm;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.File;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.io.MockFile;
import org.evosuite.runtime.mock.java.io.MockFileInputStream;
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
      ClassWriter classWriter0 = new ClassWriter((-2116));
      classWriter0.index = (-2116);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, (-2116), "SgnMre", "", (String) null, "");
      ByteVector byteVector0 = new ByteVector();
      fieldWriter0.put(byteVector0);
  }

  /**
  //Test case number: 1
  /*Coverage entropy=0.5859526183035508
  */
  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-1172));
      classWriter0.index = (-3145);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, (-1455), "Sgnature", "", (String) null, "");
      int int0 = fieldWriter0.getSize();
      assertEquals(28, int0);
  }

  /**
  //Test case number: 2
  /*Coverage entropy=0.5623351446188083
  */
  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(65528);
      classWriter0.index = 65528;
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, (-8), "Sgnature", "/C>ef^UFMWcuQz", "", "El;=!}OJpL?");
      // Undeclared exception!
      fieldWriter0.visitAnnotation("Signature", false);
  }

  /**
  //Test case number: 3
  /*Coverage entropy=0.5623351446188083
  */
  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(521);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 2, "RuntimeInvisibleAnnotations", "i_", "RuntimeInvisibleAnnotations", "");
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
  //Test case number: 4
  /*Coverage entropy=0.5402041423888608
  */
  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(65528);
      classWriter0.index = 65528;
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, (-8), "Sgnature", "/C>ef^UFMWcuQz", "", "El;=!}OJpL?");
      ByteVector byteVector0 = new ByteVector(2);
      // Undeclared exception!
      fieldWriter0.put(byteVector0);
  }

  /**
  //Test case number: 5
  /*Coverage entropy=0.5623351446188083
  */
  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(65519);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 65519, "Sgnature", "", (String) null, "");
      ByteVector byteVector0 = new ByteVector();
      ByteVector byteVector1 = byteVector0.put11(131072, (-237));
      byteVector1.length = 65519;
      // Undeclared exception!
      try { 
        fieldWriter0.put(byteVector1);
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
  /*Coverage entropy=0.6829081047004717
  */
  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(65522);
      classWriter0.index = 64870;
      String[] stringArray0 = new String[0];
      classWriter0.visit(48, 48, "Sgnaure", "Sgnaure", "Sgnaure", stringArray0);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 65522, "Sgnaure", "RuntimeVisibleAnnotations", (String) null, "RuntimeVisibleAnnotations");
      // Undeclared exception!
      fieldWriter0.getSize();
  }

  /**
  //Test case number: 7
  /*Coverage entropy=0.6615632381579821
  */
  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-1826));
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, (byte)108, "", "Ku", "Ku", (Object) null);
      ByteVector byteVector0 = classWriter0.pool;
      byteVector0.length = (-4340);
      // Undeclared exception!
      try { 
        fieldWriter0.getSize();
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
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
      FieldWriter fieldWriter0 = null;
      try {
        fieldWriter0 = new FieldWriter((ClassWriter) null, (-917), "", "", "<JMe}PAv64", "<JMe}PAv64");
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
      ClassWriter classWriter0 = new ClassWriter((-1180));
      MockFile mockFile0 = new MockFile("Deprecated");
      File file0 = MockFile.createTempFile("Deprecated", "", (File) mockFile0);
      MockFileInputStream mockFileInputStream0 = new MockFileInputStream(file0);
      FieldWriter fieldWriter0 = null;
      try {
        fieldWriter0 = new FieldWriter(classWriter0, 12, "Deprecated", "Deprecated", "Deprecated", mockFileInputStream0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // value org.evosuite.runtime.mock.java.io.MockFileInputStream@4115828a
         //
         verifyException("wheel.asm.ClassWriter", e);
      }
  }

  /**
  //Test case number: 10
  /*Coverage entropy=0.6330395116644678
  */
  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(0);
      ByteVector byteVector0 = new ByteVector(1);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 2, "8Gu=n:?RSHllNn=", "RuntimeVisibleAnnotations", "Zo#", "");
      Attribute attribute0 = new Attribute("uNUkeR8rukZtV");
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
  //Test case number: 11
  /*Coverage entropy=0.4361623253853443
  */
  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(65519);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 65519, "Sgnature", "", (String) null, "");
      ByteVector byteVector0 = new ByteVector();
      classWriter0.version = 6119;
      fieldWriter0.put(byteVector0);
  }

  /**
  //Test case number: 12
  /*Coverage entropy=0.9146224676606434
  */
  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(1);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, (-1081), "W", "", "RuntimeVisibleAnnotations", (Object) null);
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(124, byteArray0.length);
  }

  /**
  //Test case number: 13
  /*Coverage entropy=0.7902679680745903
  */
  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(0);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, (-1455), "8Gu=n:?RSHllNn=", "", "Zo#", "");
      Attribute attribute0 = new Attribute("Deprecated");
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
  //Test case number: 14
  /*Coverage entropy=1.064315403907995
  */
  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(0);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 2, "Aig*)-*^Bg|Y#(", "W", (String) null, (Object) null);
      fieldWriter0.visitAnnotation("W", false);
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(95, byteArray0.length);
  }

  /**
  //Test case number: 15
  /*Coverage entropy=0.5859526183035508
  */
  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(65522);
      classWriter0.version = 1432;
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 65522, "Sgnaure", "RuntimeVisibleAnnotations", "RuntimeVisibleAnnotations", "RuntimeVisibleAnnotations");
      int int0 = fieldWriter0.getSize();
      assertEquals(24, int0);
  }

  /**
  //Test case number: 16
  /*Coverage entropy=1.064315403907995
  */
  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(1);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 2, "Aig*)-*^Bg|Y#(", "W", (String) null, (Object) null);
      fieldWriter0.visitAnnotation("Aig*)-*^Bg|Y#(", true);
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(93, byteArray0.length);
  }

  /**
  //Test case number: 17
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(1);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 2, "Aig*)-*^Bg|Y#(", "W", (String) null, (Object) null);
      FieldWriter fieldWriter1 = new FieldWriter(classWriter0, (-1081), "W", "", "RuntimeVisibleAnnotations", (Object) null);
      assertFalse(fieldWriter1.equals((Object)fieldWriter0));
  }

  /**
  //Test case number: 18
  /*Coverage entropy=0.5623351446188083
  */
  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-1378));
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 342, "<JMe}PAv64", "<JMe}PAv64", "<JMe}PAv64", "<JMe}PAv64");
      fieldWriter0.visitEnd();
  }

  /**
  //Test case number: 19
  /*Coverage entropy=0.5623351446188083
  */
  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-2116));
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 2047, "T:h`0mhMi#", "", "int", "");
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
