/*
 * This file was automatically generated by EvoSuite
 * Mon Nov 30 07:26:12 GMT 2020
 */

package wheel.asm;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.testdata.EvoSuiteFile;
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
      ClassWriter classWriter0 = new ClassWriter(7);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 581, "Lt%", "Lt%", "Lt%", (Object) null);
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
  //Test case number: 1
  /*Coverage entropy=0.5623351446188083
  */
  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(0);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 0, "rsmiuh:A_", "LO", (String) null, "rsmiuh:A_");
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
  //Test case number: 2
  /*Coverage entropy=0.5623351446188083
  */
  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(0);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 1, "f?Y,yQfu-", "m]!vRlJ2Ef,yN+", (String) null, (Object) null);
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
      ClassWriter classWriter0 = new ClassWriter(0);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 0, "[AHC!ued`<7", "[AHC!ued`<7", "[AHC!ued`<7", (Object) null);
      ByteVector byteVector0 = classWriter0.pool;
      ByteVector byteVector1 = byteVector0.putInt(0);
      byte[] byteArray0 = new byte[7];
      byteVector1.data = byteArray0;
      // Undeclared exception!
      try { 
        fieldWriter0.put(byteVector1);
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
      ClassWriter classWriter0 = new ClassWriter((-53));
      Object object0 = new Object();
      FieldWriter fieldWriter0 = null;
      try {
        fieldWriter0 = new FieldWriter(classWriter0, 9, (String) null, "(!UEjCfg{,hM;ol", "(!UEjCfg{,hM;ol", object0);
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
      ClassWriter classWriter0 = new ClassWriter(58);
      FieldWriter fieldWriter0 = null;
      try {
        fieldWriter0 = new FieldWriter(classWriter0, (-2681), "Lt%", "Lt%", "Lt%", classWriter0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // value wheel.asm.ClassWriter@5
         //
         verifyException("wheel.asm.ClassWriter", e);
      }
  }

  /**
  //Test case number: 6
  /*Coverage entropy=0.5940241655824705
  */
  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-22));
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, (-22), "rsmuiuh:A_", "LO", (String) null, "rsmuiuh:A_");
      ByteVector byteVector0 = new ByteVector(2);
      Attribute attribute0 = new Attribute("RuntimeVisibleParameterAnnotations");
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
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 0, "[AHC!ued`<7", "[AHC!ued`<7", "[AHC!ued`<7", (Object) null);
      ByteVector byteVector0 = classWriter0.pool;
      fieldWriter0.visitAnnotation("", false);
      fieldWriter0.put(byteVector0);
  }

  /**
  //Test case number: 8
  /*Coverage entropy=0.8239592165010823
  */
  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(1834);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 1834, "[AHC!ued`<7", "[AHC!ued`<7", "[AHC!ued`<7", (Object) null);
      Attribute attribute0 = new Attribute("[AHC!ued`<7");
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
  //Test case number: 9
  /*Coverage entropy=0.933720058514398
  */
  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-22));
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 2, "rsmiuh:A_", "O", (String) null, "rsmiuh:A_");
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(75, byteArray0.length);
  }

  /**
  //Test case number: 10
  /*Coverage entropy=0.9146224676606434
  */
  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-22));
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, (-22), "rsmiuh:A_", "LO", (String) null, "rsmiuh:A_");
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(113, byteArray0.length);
  }

  /**
  //Test case number: 11
  /*Coverage entropy=0.5859526183035508
  */
  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(0);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, (byte) (-58), "", "oG1L,,<>.", "RuntimeInvisibleAnnotations", (Object) null);
      int int0 = fieldWriter0.getSize();
      assertEquals(28, int0);
  }

  /**
  //Test case number: 12
  /*Coverage entropy=1.0360334832009355
  */
  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-22));
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, (-22), "rsmiuh:A_", "LO", (String) null, "rsmiuh:A_");
      fieldWriter0.visitAnnotation("rsmiuh:A_", true);
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(153, byteArray0.length);
  }

  /**
  //Test case number: 13
  /*Coverage entropy=0.8239592165010823
  */
  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(0);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, (byte) (-58), "", "oG1L,,<>.", "RuntimeInvisibleAnnotations", (Object) null);
      fieldWriter0.visitAnnotation("RuntimeInvisibleAnnotations", false);
      int int0 = fieldWriter0.getSize();
      assertEquals(40, int0);
  }

  /**
  //Test case number: 14
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-22));
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 2, "rsmiuh:A_", "O", (String) null, "rsmiuh:A_");
      FieldWriter fieldWriter1 = new FieldWriter(classWriter0, (-22), "ue~W9M=", "WB#?", "!)l=.4.w&K'R!]Z*h", (Object) null);
      assertFalse(fieldWriter1.equals((Object)fieldWriter0));
  }

  /**
  //Test case number: 15
  /*Coverage entropy=0.5623351446188083
  */
  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(0);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 0, "rsmiuh:A_", "LO", (String) null, "rsmiuh:A_");
      fieldWriter0.visitEnd();
  }
}
