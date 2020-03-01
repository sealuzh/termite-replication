/*
 * This file was automatically generated by EvoSuite
 * Thu Dec 05 11:11:23 GMT 2019
 */

package wheel.asm;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
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
  /*Coverage entropy=1.343193896232072
  */
  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-1630));
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, (-1630), "", "", "", "");
      classWriter0.newClass("");
      classWriter0.version = 49;
      ByteVector byteVector0 = new ByteVector();
      fieldWriter0.put(byteVector0);
      int int0 = fieldWriter0.getSize();
      assertEquals(30, int0);
  }

  /**
  //Test case number: 1
  /*Coverage entropy=1.0832409930999294
  */
  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      int int0 = (-2);
      ClassWriter classWriter0 = new ClassWriter((-2));
      String string0 = "org.apache.commons.io.filefilter.DelegateFileFilter";
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 2, "org.apache.commons.io.filefilter.DelegateFileFilter", "YoKOwQ8t8e$O\"6T", "org.apache.commons.io.filefilter.DelegateFileFilter", "org.apache.commons.io.filefilter.DelegateFileFilter");
      ByteVector byteVector0 = classWriter0.pool;
      fieldWriter0.put(byteVector0);
      String string1 = "";
      boolean boolean0 = true;
      byteVector0.length = (-14);
      // Undeclared exception!
      try { 
        fieldWriter0.visitAnnotation("A#O", true);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -14
         //
         verifyException("wheel.asm.ByteVector", e);
      }
  }

  /**
  //Test case number: 2
  /*Coverage entropy=0.9623351446188083
  */
  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-14));
      classWriter0.index = 16777215;
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, (-14), "(>", "(>", "(>", "(>");
      // Undeclared exception!
      fieldWriter0.getSize();
  }

  /**
  //Test case number: 3
  /*Coverage entropy=1.2684036609455267
  */
  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(0);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 0, "]lBLM?\"8r>C{bDec#", "]lBLM?\"8r>C{bDec#", (String) null, "]lBLM?\"8r>C{bDec#");
      Attribute attribute0 = new Attribute((String) null);
      fieldWriter0.visitAttribute(attribute0);
      fieldWriter0.visitAttribute(attribute0);
      ByteVector byteVector0 = classWriter0.pool;
      // Undeclared exception!
      fieldWriter0.put(byteVector0);
  }

  /**
  //Test case number: 4
  /*Coverage entropy=0.8659992569610426
  */
  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-13));
      classWriter0.index = (-13);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 1, "org.apache.commons.io.filefiltSr.DelegateFileFilter", "org.apache.commons.io.filefiltSr.DelegateFileFilter", "org.apache.commons.io.filefiltSr.DelegateFileFilter", "org.apache.commons.io.filefiltSr.DelegateFileFilter");
      ByteVector byteVector0 = new ByteVector();
      fieldWriter0.put(byteVector0);
  }

  /**
  //Test case number: 5
  /*Coverage entropy=1.0931471805599453
  */
  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-1630));
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, (-1630), "Syntheic", "Syntheic", "Syntheic", "Syntheic");
      classWriter0.version = (-1630);
      ByteVector byteVector0 = classWriter0.pool;
      fieldWriter0.put(byteVector0);
  }

  /**
  //Test case number: 6
  /*Coverage entropy=0.958277627629083
  */
  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-2));
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 2, "org.apache.commons.io.filefilter.DelegateFileFilter", "YoKOwQ8t8e$O\"6T", "org.apache.commons.io.filefilter.DelegateFileFilter", "org.apache.commons.io.filefilter.DelegateFileFilter");
      ByteVector byteVector0 = classWriter0.pool;
      fieldWriter0.put(byteVector0);
      byte[] byteArray0 = new byte[1];
      byteArray0[0] = (byte)4;
      byteVector0.data = byteArray0;
      FieldWriter fieldWriter1 = null;
      try {
        fieldWriter1 = new FieldWriter(classWriter0, (-2), "org.apache.commons.io.filefilter.DelegateFileFilter", "org.apache.commons.io.filefilter.DelegateFileFilter", "", (Object) null);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
      }
  }

  /**
  //Test case number: 7
  /*Coverage entropy=1.0931471805599453
  */
  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-6));
      classWriter0.version = (-6);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, (-6), "", "", "", "");
      int int0 = fieldWriter0.getSize();
      assertEquals(30, int0);
  }

  /**
  //Test case number: 8
  /*Coverage entropy=0.8505612088663046
  */
  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-13));
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 1, "org.apache.commons.io.filefiltSr.DelegateFileFilter", "org.apache.commons.io.filefiltSr.DelegateFileFilter", "org.apache.commons.io.filefiltSr.DelegateFileFilter", "org.apache.commons.io.filefiltSr.DelegateFileFilter");
      ByteVector byteVector0 = new ByteVector();
      byteVector0.length = 65535;
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
  //Test case number: 9
  /*Coverage entropy=0.9859526183035509
  */
  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-23));
      classWriter0.index = (-23);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, (-23), "ConstantValue", "ConstantValue", "ConstantValue", "ConstantValue");
      int int0 = fieldWriter0.getSize();
      assertEquals(36, int0);
  }

  /**
  //Test case number: 10
  /*Coverage entropy=0.9623351446188083
  */
  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(0);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 0, "org.apache.commons.io.filefiltSr.DelegateFileFilter", "org.apache.commons.io.filefiltSr.DelegateFileFilter", "org.apache.commons.io.filefiltSr.DelegateFileFilter", "org.apache.commons.io.filefiltSr.DelegateFileFilter");
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
  //Test case number: 11
  /*Coverage entropy=0.42857142857142855
  */
  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-14));
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, (-14), "org.apache.commons.io.filefilteu.DelegateFileFilter", "org.apache.commons.io.filefilteu.DelegateFileFilter", "org.apache.commons.io.filefilteu.DelegateFileFilter", "org.apache.commons.io.filefilteu.DelegateFileFilter");
      fieldWriter0.visitAnnotation("org.apache.commons.io.filefilteu.DelegateFileFilter", true);
      int int0 = fieldWriter0.getSize();
      assertEquals(48, int0);
  }

  /**
  //Test case number: 12
  /*Coverage entropy=1.0832409930999294
  */
  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-34));
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 1, "j~rH&n", "j~rH&n", "j~rH&n", "j~rH&n");
      Attribute attribute0 = new Attribute("j~rH&n");
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
  //Test case number: 13
  /*Coverage entropy=1.0829081047004716
  */
  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(14);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 14, "wheel.asm.FieldWriter", "wheel.asm.FieldWriter", (String) null, "wheel.asm.FieldWriter");
      ByteVector byteVector0 = new ByteVector(2);
      fieldWriter0.put(byteVector0);
  }

  /**
  //Test case number: 14
  /*Coverage entropy=0.42857142857142855
  */
  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-14));
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, (-14), "org.apache.commons.io.filefjlteu.DelegateFileFilter", "org.apache.commons.io.filefjlteu.DelegateFileFilter", "org.apache.commons.io.filefjlteu.DelegateFileFilter", "org.apache.commons.io.filefjlteu.DelegateFileFilter");
      fieldWriter0.visitAnnotation("org.apache.commons.io.filefjlteu.DelegateFileFilter", true);
      ByteVector byteVector0 = new ByteVector();
      fieldWriter0.put(byteVector0);
  }

  /**
  //Test case number: 15
  /*Coverage entropy=0.9623351446188083
  */
  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(2);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 2, "double", "double", (String) null, (Object) null);
      ByteVector byteVector0 = new ByteVector();
      fieldWriter0.put(byteVector0);
  }

  /**
  //Test case number: 16
  /*Coverage entropy=0.42857142857142855
  */
  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(14);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 14, "wheel.asm.FieldWriter", "wheel.asm.FieldWriter", "wheel.asm.FieldWriter", "wheel.asm.FieldWriter");
      FieldWriter fieldWriter1 = new FieldWriter(classWriter0, 2, "wheel.asm.FieldWriter", "wheel.asm.FieldWriter", "wheel.asm.FieldWriter", "wheel.asm.FieldWriter");
      int int0 = fieldWriter0.getSize();
      assertEquals(24, int0);
  }

  /**
  //Test case number: 17
  /*Coverage entropy=0.42857142857142855
  */
  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(12);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 12, "org.apache.commons.io.filefiltSr.DelegateFileFilter", "org.apache.commons.io.filefiltSr.DelegateFileFilter", "org.apache.commons.io.filefiltSr.DelegateFileFilter", "org.apache.commons.io.filefiltSr.DelegateFileFilter");
      fieldWriter0.getSize();
      AnnotationVisitor annotationVisitor0 = fieldWriter0.visitAnnotation("org.apache.commons.io.filefiltSr.DelegateFileFilter", true);
      assertNotNull(annotationVisitor0);
  }

  /**
  //Test case number: 18
  /*Coverage entropy=0.9623351446188083
  */
  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(2);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 2, "double", "double", (String) null, (Object) null);
      int int0 = fieldWriter0.getSize();
      assertEquals(8, int0);
  }

  /**
  //Test case number: 19
  /*Coverage entropy=0.42857142857142855
  */
  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-14));
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, (-14), "org.apache.commons.io.filefjlteu.DelegateFileFilter", "org.apache.commons.io.filefjlteu.DelegateFileFilter", "org.apache.commons.io.filefjlteu.DelegateFileFilter", "org.apache.commons.io.filefjlteu.DelegateFileFilter");
      fieldWriter0.visitAnnotation("org.apache.commons.io.filefjlteu.DelegateFileFilter", false);
      ByteVector byteVector0 = new ByteVector();
      fieldWriter0.put(byteVector0);
  }

  /**
  //Test case number: 20
  /*Coverage entropy=0.4
  */
  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-14));
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, (-14), "org.apache.commons.io.filefilteu.DelegateFileFilter", "org.apache.commons.io.filefilteu.DelegateFileFilter", "org.apache.commons.io.filefilteu.DelegateFileFilter", "org.apache.commons.io.filefilteu.DelegateFileFilter");
      ByteVector byteVector0 = new ByteVector();
      fieldWriter0.put(byteVector0);
  }

  /**
  //Test case number: 21
  /*Coverage entropy=0.42857142857142855
  */
  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-23));
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, (-23), "ConstantValue", "ConstantValue", "ConstantValue", "ConstantValue");
      fieldWriter0.visitAnnotation("ConstantValue", false);
      int int0 = fieldWriter0.getSize();
      assertEquals(48, int0);
  }

  /**
  //Test case number: 22
  /*Coverage entropy=0.4
  */
  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-40));
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, (-40), "org.apache.commons.io.filefilteu.DelegateFileFilter", "org.apache.commons.io.filefilteu.DelegateFileFilter", "org.apache.commons.io.filefilteu.DelegateFileFilter", "org.apache.commons.io.filefilteu.DelegateFileFilter");
      int int0 = fieldWriter0.getSize();
      assertEquals(36, int0);
  }

  /**
  //Test case number: 23
  /*Coverage entropy=0.3333333333333333
  */
  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-1070));
      FieldWriter fieldWriter0 = null;
      try {
        fieldWriter0 = new FieldWriter(classWriter0, (-1070), "eXm$@O\"X[", "eXm$@O\"X[", "eXm$@O\"X[", classWriter0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // value wheel.asm.ClassWriter@5
         //
         verifyException("wheel.asm.ClassWriter", e);
      }
  }

  /**
  //Test case number: 24
  /*Coverage entropy=0.4
  */
  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(11);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 1, "org.apache.commons.io.filefiltSr.DelegateFileFilter", "org.apache.commons.io.filefiltSr.DelegateFileFilter", "org.apache.commons.io.filefiltSr.DelegateFileFilter", "org.apache.commons.io.filefiltSr.DelegateFileFilter");
      ByteVector byteVector0 = classWriter0.pool;
      fieldWriter0.put(byteVector0);
  }

  /**
  //Test case number: 25
  /*Coverage entropy=0.42857142857142855
  */
  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(3);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 3, "org.apache.commons.io.filefilteu.DelegateFileFilter", "org.apache.commons.io.filefilteu.DelegateFileFilter", "org.apache.commons.io.filefilteu.DelegateFileFilter", "org.apache.commons.io.filefilteu.DelegateFileFilter");
      Attribute attribute0 = new Attribute("org.apache.commons.io.filefilteu.DelegateFileFilter");
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
  //Test case number: 26
  /*Coverage entropy=1.259967281035505
  */
  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(3);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 3, "org.apache.commons.io.filefilteu.DelegateFileFilter", "org.apache.commons.io.filefilteu.DelegateFileFilter", "org.apache.commons.io.filefilteu.DelegateFileFilter", "org.apache.commons.io.filefilteu.DelegateFileFilter");
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
  //Test case number: 27
  /*Coverage entropy=0.4
  */
  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(0);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 1, "org.apach.commons.io.filefilter.DelegaeFileilter", "YoKOwQ8t8e$O\"6T", "org.apach.commons.io.filefilter.DelegaeFileilter", "org.apach.commons.io.filefilter.DelegaeFileilter");
      ByteVector byteVector0 = classWriter0.pool;
      byteVector0.putInt(2);
      FieldWriter fieldWriter1 = fieldWriter0.next;
      fieldWriter0.visitEnd();
  }

  /**
  //Test case number: 28
  /*Coverage entropy=0.3333333333333333
  */
  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      FieldWriter fieldWriter0 = null;
      try {
        fieldWriter0 = new FieldWriter((ClassWriter) null, 9, ":w4>zXo]|-u5~_K0~", ":w4>zXo]|-u5~_K0~", ":w4>zXo]|-u5~_K0~", ":w4>zXo]|-u5~_K0~");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("wheel.asm.FieldWriter", e);
      }
  }
}
