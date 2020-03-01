/*
 * This file was automatically generated by EvoSuite
 * Thu Dec 05 16:34:42 GMT 2019
 */

package wheel.asm;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.testdata.EvoSuiteFile;
import org.evosuite.runtime.testdata.FileSystemHandling;
import org.junit.runner.RunWith;
import wheel.asm.AnnotationVisitor;
import wheel.asm.Attribute;
import wheel.asm.ByteVector;
import wheel.asm.ClassReader;
import wheel.asm.ClassWriter;
import wheel.asm.FieldWriter;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class FieldWriter_ESTest extends FieldWriter_ESTest_scaffolding {

  /**
  //Test case number: 0
  /*Coverage entropy=0.4
  */
  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(4492);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 4492, "", "", (String) null, (Object) null);
      ByteVector byteVector0 = classWriter0.pool;
      ByteVector byteVector1 = byteVector0.put11(4492, 386);
      FileSystemHandling.shouldThrowIOException((EvoSuiteFile) null);
      byteVector1.length = (-730);
      byteVector1.putByteArray((byte[]) null, 0, 386);
      FieldWriter fieldWriter1 = null;
      try {
        fieldWriter1 = new FieldWriter(classWriter0, 1, "", "", "N |xUGdrtSa", "");
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  /**
  //Test case number: 1
  /*Coverage entropy=0.4
  */
  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(4492);
      String[] stringArray0 = new String[1];
      stringArray0[0] = "\"iG9jH(<9t";
      classWriter0.visit(4492, 63, "", "", "\"iG9jH(<9t", stringArray0);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 4492, "", "", (String) null, (Object) null);
      ByteVector byteVector0 = new ByteVector();
      fieldWriter0.put(byteVector0);
  }

  /**
  //Test case number: 2
  /*Coverage entropy=0.4
  */
  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(4477);
      String[] stringArray0 = new String[3];
      stringArray0[0] = "";
      stringArray0[1] = "";
      stringArray0[2] = "";
      classWriter0.visit(306, 7, "", "Signature", "", stringArray0);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 4477, "CMLAd?pMF}", "CMLAd?pMF}", (String) null, (Object) null);
      int int0 = fieldWriter0.getSize();
      assertEquals(8, int0);
  }

  /**
  //Test case number: 3
  /*Coverage entropy=0.42857142857142855
  */
  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(4477);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 4477, "RuntimeVisibleAnnotations", "RuntimeVisibleAnnotations", (String) null, (Object) null);
      Attribute attribute0 = new Attribute("ady*htTr5w%P9");
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
  //Test case number: 4
  /*Coverage entropy=0.4
  */
  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(645);
      String string0 = "r;)m0v%w dhPp}W";
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 645, "r;)m0v%w dhPp}W", "r;)m0v%w dhPp}W", (String) null, "r;)m0v%w dhPp}W");
      ByteVector byteVector0 = new ByteVector();
      byteVector0.length = 127;
      // Undeclared exception!
      try { 
        fieldWriter0.put(byteVector0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
      }
  }

  /**
  //Test case number: 5
  /*Coverage entropy=0.42857142857142855
  */
  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(0);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 645, "", "", "", (Object) null);
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
  //Test case number: 6
  /*Coverage entropy=0.42857142857142855
  */
  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(4096);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, (-738), "", "RuntimeVisibleAnnotations", "RuntimeVisibleAnnotations", (Object) null);
      fieldWriter0.visitAnnotation("", true);
      ByteVector byteVector0 = new ByteVector();
      ByteVector byteVector1 = byteVector0.putByte((-1));
      fieldWriter0.put(byteVector0);
      assertSame(byteVector0, byteVector1);
  }

  /**
  //Test case number: 7
  /*Coverage entropy=0.42857142857142855
  */
  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(1);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 1, "w", "w", "w", "w");
      fieldWriter0.visitAnnotation("w", false);
      ByteVector byteVector0 = new ByteVector();
      fieldWriter0.put(byteVector0);
  }

  /**
  //Test case number: 8
  /*Coverage entropy=0.42857142857142855
  */
  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(4497);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 4497, "k", "k", (String) null, (Object) null);
      fieldWriter0.visitAnnotation("", true);
      int int0 = fieldWriter0.getSize();
      assertEquals(26, int0);
  }

  /**
  //Test case number: 9
  /*Coverage entropy=0.42857142857142855
  */
  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(1);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 1, "w", "w", "w", "w");
      fieldWriter0.visitAnnotation("w", false);
      int int0 = fieldWriter0.getSize();
      assertEquals(36, int0);
  }

  /**
  //Test case number: 10
  /*Coverage entropy=0.4
  */
  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-7));
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, (-7), "w", "w", "w", "w");
      ByteVector byteVector0 = classWriter0.pool;
      fieldWriter0.put(byteVector0);
  }

  /**
  //Test case number: 11
  /*Coverage entropy=0.4
  */
  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-7));
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, (-7), "w", "w", "w", "w");
      int int0 = fieldWriter0.getSize();
      assertEquals(36, int0);
  }

  /**
  //Test case number: 12
  /*Coverage entropy=0.4
  */
  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(4528);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 4528, "", "", "", "");
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
  //Test case number: 13
  /*Coverage entropy=0.4
  */
  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(4477);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 4477, "CMLAd?pMF}", "CMLAd?pMF}", (String) null, (Object) null);
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
  //Test case number: 14
  /*Coverage entropy=0.4
  */
  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(4492);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 4492, "", "", (String) null, (Object) null);
      int int0 = fieldWriter0.getSize();
      assertEquals(14, int0);
  }

  /**
  //Test case number: 15
  /*Coverage entropy=0.4
  */
  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(4096);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 2, "91Ct3*", "Deprecated", "", "");
      AnnotationVisitor annotationVisitor0 = fieldWriter0.visitAnnotation("", true);
      assertNotNull(annotationVisitor0);
  }

  /**
  //Test case number: 16
  /*Coverage entropy=0.4
  */
  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(65);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 65, "O[0YIo'", "O[0YIo'", "O[0YIo'", "O[0YIo'");
      int int0 = fieldWriter0.getSize();
      assertEquals(24, int0);
  }

  /**
  //Test case number: 17
  /*Coverage entropy=0.4
  */
  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(4492);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 4492, "", "", "", "");
      int int0 = fieldWriter0.getSize();
      assertEquals(30, int0);
  }

  /**
  //Test case number: 18
  /*Coverage entropy=0.4
  */
  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(4492);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 4492, "java/lang/Object", "java/lang/Object", "java/lang/Object", "java/lang/Object");
      Object object0 = new Object();
      FieldWriter fieldWriter1 = null;
      try {
        fieldWriter1 = new FieldWriter(classWriter0, 2, "java/lang/Object", "java/lang/Object", "java/lang/Object", object0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // value java.lang.Object@19c4d0b0
         //
         verifyException("wheel.asm.ClassWriter", e);
      }
  }

  /**
  //Test case number: 19
  /*Coverage entropy=0.4
  */
  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(2254);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 2254, "", "", "", "");
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
  //Test case number: 20
  /*Coverage entropy=0.42857142857142855
  */
  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(0);
      FileSystemHandling.setPermissions((EvoSuiteFile) null, false, false, false);
      classWriter0.threshold = 724;
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 724, "", "RfFSpqVY`>", "wheel.asm.ClassReader", (Object) null);
      ByteVector byteVector0 = classWriter0.pool;
      fieldWriter0.visitEnd();
      fieldWriter0.visitAnnotation("wheel.asm.ClassReader", true);
      Attribute attribute0 = new Attribute("7,cRCFQt)u");
      byte[] byteArray0 = new byte[2];
      byteArray0[0] = (byte)2;
      byteArray0[1] = (byte)2;
      ClassReader classReader0 = null;
      try {
        classReader0 = new ClassReader(byteArray0, (byte)0, (byte)2);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 8
         //
         verifyException("wheel.asm.ClassReader", e);
      }
  }

  /**
  //Test case number: 21
  /*Coverage entropy=0.4
  */
  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(65);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 65, "C>`Ad?pV>MF}", "C>`Ad?pV>MF}", "C>`Ad?pV>MF}", "C>`Ad?pV>MF}");
      ByteVector byteVector0 = new ByteVector();
      fieldWriter0.put(byteVector0);
  }

  /**
  //Test case number: 22
  /*Coverage entropy=0.4
  */
  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(4492);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 4492, "", "", (String) null, (Object) null);
      ByteVector byteVector0 = new ByteVector();
      fieldWriter0.put(byteVector0);
  }

  /**
  //Test case number: 23
  /*Coverage entropy=0.4
  */
  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(4492);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 4492, "", "", "", "");
      ByteVector byteVector0 = new ByteVector();
      fieldWriter0.put(byteVector0);
  }

  /**
  //Test case number: 24
  /*Coverage entropy=0.3333333333333333
  */
  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(4492);
      FieldWriter fieldWriter0 = null;
      try {
        fieldWriter0 = new FieldWriter(classWriter0, 4492, "t", (String) null, "t", "t");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }
}
