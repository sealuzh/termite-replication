/*
 * This file was automatically generated by EvoSuite
 * Sun Nov 29 13:21:48 GMT 2020
 */

package wheel.asm;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.testdata.EvoSuiteFile;
import org.junit.runner.RunWith;
import wheel.asm.AnnotationVisitor;
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
      ClassWriter classWriter0 = new ClassWriter(49);
      String[] stringArray0 = new String[3];
      stringArray0[0] = "wheel.asm.ByteVector";
      stringArray0[1] = "RuntimeInvisibleAnnotations";
      stringArray0[2] = "e-p]zgKH_fOPmz+";
      classWriter0.visit((-439), 49, "Insensitive", "e-p]zgKH_fOPmz+", "wheel.asm.ByteVector", stringArray0);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 65535, "wheel.asm.FieldWriter", "org.apache.commons.io.IOCase", "e-p]zgKH_fOPmz+", "e-p]zgKH_fOPmz+");
      ByteVector byteVector0 = new ByteVector(49);
      fieldWriter0.put(byteVector0);
  }

  /**
  //Test case number: 1
  /*Coverage entropy=0.4659992569610426
  */
  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(512);
      classWriter0.index = (-1921);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 1241, "Ee$5**rK,(hCc-", "Ee$5**rK,(hCc-", "S6", "S6");
      ByteVector byteVector0 = new ByteVector();
      fieldWriter0.put(byteVector0);
  }

  /**
  //Test case number: 2
  /*Coverage entropy=0.5859526183035508
  */
  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-841));
      classWriter0.visit(4377, (-343), "RuntimeVisibleAnnotations", "hmj@jJ$Ki", "RuntimeVisibleAnnotations", (String[]) null);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, (-343), "e;2EqA+z9X/Pz~j", "The prefix must not be null", "e;2EqA+z9X/Pz~j", (Object) null);
      int int0 = fieldWriter0.getSize();
      assertEquals(22, int0);
  }

  /**
  //Test case number: 3
  /*Coverage entropy=0.6108643020548935
  */
  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(512);
      classWriter0.index = (-1921);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 1241, "Ee$5**rK,(hCc-", "Ee$5**rK,(hCc-", "S6", "S6");
      int int0 = fieldWriter0.getSize();
      assertEquals(24, int0);
  }

  /**
  //Test case number: 4
  /*Coverage entropy=0.5623351446188083
  */
  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(0);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 0, "HV41emGM#", "", "HV41emGM#", "HV41emGM#");
      AnnotationVisitor annotationVisitor0 = fieldWriter0.visitAnnotation("", false);
      assertNotNull(annotationVisitor0);
  }

  /**
  //Test case number: 5
  /*Coverage entropy=0.5623351446188083
  */
  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(2);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 1, "RuntimeVisibleAnnotations", "RuntimeVisibleAnnotations", "RuntimeVisibleAnnotations", "RuntimeVisibleAnnotations");
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
  //Test case number: 6
  /*Coverage entropy=0.5623351446188083
  */
  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-829));
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, (-343), "e;2EqA+z9X/Pz~j", "e;2EqA+z9X/Pz~j", (String) null, (Object) null);
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
  //Test case number: 7
  /*Coverage entropy=0.5623351446188083
  */
  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-26));
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 1, "RuntimeVisibleAnnotations", "RuntimeVisibleAnnotations", "RuntimeVisibleAnnotations", "RuntimeVisibleAnnotations");
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
  //Test case number: 8
  /*Coverage entropy=0.5623351446188083
  */
  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-841));
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 1, "e;2EqA+z9X/Pz~j", "The prefix must not be null", (String) null, (Object) null);
      ByteVector byteVector0 = classWriter0.pool;
      byteVector0.length = 1411;
      // Undeclared exception!
      try { 
        fieldWriter0.visitAnnotation("2pVc xTSXAj 9D", true);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
      }
  }

  /**
  //Test case number: 9
  /*Coverage entropy=0.5623351446188083
  */
  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(49);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, (-439), "wheel.asm.FieldWriter", "RuntimeInvisibleAnnotations", "RuntimeInvisibleAnnotations", "wheel.asm.FieldWriter");
      ByteVector byteVector0 = new ByteVector(8);
      ByteVector byteVector1 = byteVector0.putInt(1);
      byteVector1.length = 2151;
      // Undeclared exception!
      try { 
        fieldWriter0.put(byteVector1);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
      }
  }

  /**
  //Test case number: 10
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      FieldWriter fieldWriter0 = null;
      try {
        fieldWriter0 = new FieldWriter((ClassWriter) null, 627, (String) null, (String) null, (String) null, (Object) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("wheel.asm.FieldWriter", e);
      }
  }

  /**
  //Test case number: 11
  /*Coverage entropy=0.6546695645285008
  */
  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-841));
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 1, "e;2EqA+z9X/Pz~j", "The prefix must not be null", (String) null, (Object) null);
      ByteVector byteVector0 = new ByteVector(8);
      fieldWriter0.visitAnnotation("e;2EqA+z9X/Pz~j", false);
      fieldWriter0.put(byteVector0);
  }

  /**
  //Test case number: 12
  /*Coverage entropy=0.4361623253853443
  */
  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(49);
      String[] stringArray0 = new String[4];
      stringArray0[0] = "";
      stringArray0[1] = "Deprecated";
      stringArray0[2] = "";
      stringArray0[3] = "";
      classWriter0.visit(49, 15, "KRO6(Deu1", "CZ; ", "Deprecated", stringArray0);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, (-2751), "", "", "", "");
      ByteVector byteVector0 = new ByteVector(65527);
      fieldWriter0.put(byteVector0);
  }

  /**
  //Test case number: 13
  /*Coverage entropy=0.4361623253853443
  */
  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(49);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, (-2751), "", "", "", "");
      ByteVector byteVector0 = new ByteVector(65527);
      fieldWriter0.put(byteVector0);
  }

  /**
  //Test case number: 14
  /*Coverage entropy=0.7902679680745903
  */
  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-841));
      Attribute attribute0 = new Attribute("hmj@jJ$Ki");
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, (-841), "e;2EqA+z9X/Pz~j", "The prefix must not be null", "e;2EqA+z9X/Pz~j", (Object) null);
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
  //Test case number: 15
  /*Coverage entropy=0.5859526183035508
  */
  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(49);
      String[] stringArray0 = new String[4];
      stringArray0[0] = "";
      stringArray0[1] = "Deprecated";
      stringArray0[2] = "";
      stringArray0[3] = "";
      classWriter0.visit(49, 15, "KRO6(Deu1", "CZ; ", "Deprecated", stringArray0);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, (-2751), "", "", "", "");
      int int0 = fieldWriter0.getSize();
      assertEquals(30, int0);
  }

  /**
  //Test case number: 16
  /*Coverage entropy=0.6108643020548935
  */
  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-841));
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 1, "e;2EqA+z9X/Pz~j", "The prefix must not be null", (String) null, (Object) null);
      int int0 = fieldWriter0.getSize();
      assertEquals(8, int0);
  }

  /**
  //Test case number: 17
  /*Coverage entropy=0.5623351446188083
  */
  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-841));
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 1, "e;2EqA+z9X/Pz~j", "The prefix must not be null", (String) null, (Object) null);
      AnnotationVisitor annotationVisitor0 = fieldWriter0.visitAnnotation("2pVc xTSXAj 9D", true);
      assertNotNull(annotationVisitor0);
  }

  /**
  //Test case number: 18
  /*Coverage entropy=0.8599672810355049
  */
  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-841));
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 1, "e;2EqA+z9X/Pz~j", "The prefix must not be null", (String) null, (Object) null);
      fieldWriter0.visitAnnotation("e;2EqA+z9X/Pz~j", false);
      int int0 = fieldWriter0.getSize();
      assertEquals(20, int0);
  }

  /**
  //Test case number: 19
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Attribute attribute0 = new Attribute("RuntimeVisibleAnnotations");
      ClassWriter classWriter0 = new ClassWriter(2);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 1, "RuntimeVisibleAnnotations", "RuntimeVisibleAnnotations", "RuntimeVisibleAnnotations", "RuntimeVisibleAnnotations");
      FieldWriter fieldWriter1 = null;
      try {
        fieldWriter1 = new FieldWriter(classWriter0, 292552704, "RuntimeVisibleAnnotations", "RuntimeVisibleAnnotations", "RuntimeVisibleAnnotations", attribute0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // value wheel.asm.Attribute@1
         //
         verifyException("wheel.asm.ClassWriter", e);
      }
  }

  /**
  //Test case number: 20
  /*Coverage entropy=0.5623351446188083
  */
  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(0);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 0, "HV41emGM#", "", "HV41emGM#", "HV41emGM#");
      fieldWriter0.visitEnd();
  }

  /**
  //Test case number: 21
  /*Coverage entropy=0.5940241655824705
  */
  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(49);
      Attribute attribute0 = new Attribute("wheel.asm.FieldWriter");
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, (-439), "=n*GR[r{W@[gv", "", "", (Object) null);
      fieldWriter0.visitAttribute(attribute0);
      ByteVector byteVector0 = new ByteVector(8);
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
