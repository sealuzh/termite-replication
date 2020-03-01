/*
 * This file was automatically generated by EvoSuite
 * Wed Dec 04 18:44:48 GMT 2019
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
import wheel.asm.ClassWriter;
import wheel.asm.FieldWriter;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class FieldWriter_ESTest extends FieldWriter_ESTest_scaffolding {

  /**
  //Test case number: 0
  /*Coverage entropy=1.5757361336243871
  */
  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      FileSystemHandling fileSystemHandling0 = new FileSystemHandling();
      ClassWriter classWriter0 = new ClassWriter((-569));
      classWriter0.version = 40;
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 1, "char", "Exceptions", "Exceptions", "Exceptions");
      FieldWriter fieldWriter1 = new FieldWriter(classWriter0, (-127), "char", "unZcI>fd", "char", (Object) null);
      fieldWriter1.getSize();
      ByteVector byteVector0 = classWriter0.pool;
      fieldWriter0.getSize();
      fieldWriter1.put(byteVector0);
      ByteVector byteVector1 = byteVector0.put12((-60), (-569));
      ByteVector byteVector2 = byteVector1.putByte(10);
      fieldWriter0.getSize();
      byteVector2.length = 63373;
      // Undeclared exception!
      try { 
        fieldWriter0.visitAnnotation("", false);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("wheel.asm.ByteVector", e);
      }
  }

  /**
  //Test case number: 1
  /*Coverage entropy=1.5745716349456806
  */
  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-569));
      classWriter0.version = 40;
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 1, "char", "", "", "Exceptions");
      FieldWriter fieldWriter1 = new FieldWriter(classWriter0, (-127), "", "Exceptions", "char", (Object) null);
      fieldWriter1.getSize();
      ByteVector byteVector0 = classWriter0.pool;
      fieldWriter0.getSize();
      fieldWriter0.visitAnnotation("", false);
      fieldWriter1.put(byteVector0);
      byteVector0.put12((-60), (-569));
      ByteVector byteVector1 = byteVector0.putUTF8("");
      ByteVector byteVector2 = byteVector1.put12((-127), 0);
      byte[] byteArray0 = new byte[0];
      byteVector2.data = byteArray0;
      // Undeclared exception!
      try { 
        fieldWriter0.getSize();
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("wheel.asm.ByteVector", e);
      }
  }

  /**
  //Test case number: 2
  /*Coverage entropy=1.2698084195386437
  */
  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-569));
      byte[] byteArray0 = new byte[7];
      classWriter0.index = (int) (byte) (-60);
      byteArray0[0] = (byte) (-60);
      classWriter0.addType("Exceptions");
      byteArray0[1] = (byte) (-119);
      byteArray0[2] = (byte)119;
      byteArray0[5] = (byte)119;
      byteArray0[4] = (byte)73;
      byteArray0[5] = (byte) (-1);
      byteArray0[6] = (byte) (-121);
      FileSystemHandling.appendDataToFile((EvoSuiteFile) null, byteArray0);
      classWriter0.version = 34;
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 1, "char", "", "", "Exceptions");
      FieldWriter fieldWriter1 = new FieldWriter(classWriter0, (-127), "", "<8>hDn`6/G", "char", (Object) null);
      fieldWriter1.getSize();
      fieldWriter1.getSize();
      fieldWriter0.getSize();
      AnnotationVisitor annotationVisitor0 = fieldWriter0.visitAnnotation("char", false);
      assertNotNull(annotationVisitor0);
  }

  /**
  //Test case number: 3
  /*Coverage entropy=0.9859526183035509
  */
  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-569));
      classWriter0.version = 49;
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, (-3), "RuntimeVisibleAnnotations", "char", "char", "char");
      int int0 = fieldWriter0.getSize();
      assertEquals(30, int0);
  }

  /**
  //Test case number: 4
  /*Coverage entropy=1.0145240468749794
  */
  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-569));
      byte[] byteArray0 = new byte[7];
      FileSystemHandling.createFolder((EvoSuiteFile) null);
      classWriter0.index = (int) (byte) (-60);
      byteArray0[0] = (byte) (-60);
      classWriter0.addType("Exceptions");
      byteArray0[1] = (byte) (-119);
      byteArray0[2] = (byte)119;
      byteArray0[5] = (byte)119;
      byteArray0[4] = (byte)73;
      byteArray0[5] = (byte) (-1);
      byteArray0[6] = (byte) (-121);
      classWriter0.version = 34;
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, (-127), "", "<8>hDn`6/G", "char", (Object) null);
      fieldWriter0.getSize();
      int int0 = fieldWriter0.getSize();
      assertEquals(28, int0);
  }

  /**
  //Test case number: 5
  /*Coverage entropy=1.0931471805599453
  */
  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-569));
      classWriter0.version = (-569);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, (-569), "", "P2&=", "char", "P2&=");
      ByteVector byteVector0 = new ByteVector(2);
      fieldWriter0.put(byteVector0);
  }

  /**
  //Test case number: 6
  /*Coverage entropy=1.2885387096069334
  */
  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(1627);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 1627, "K*%v0hqe{tC@!", "K*%v0hqe{tC@!", "K*%v0hqe{tC@!", "K*%v0hqe{tC@!");
      fieldWriter0.getSize();
      ByteVector byteVector0 = classWriter0.pool;
      byteVector0.length = 3264;
      // Undeclared exception!
      try { 
        fieldWriter0.put(byteVector0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
      }
  }

  /**
  //Test case number: 7
  /*Coverage entropy=1.1217186091313738
  */
  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-541));
      classWriter0.version = (-881);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, (-541), "ConstantVadIlue", "ConstantVadIlue", "ConstantVadIlue", "ConstantVadIlue");
      fieldWriter0.getSize();
      int int0 = fieldWriter0.getSize();
      assertEquals(30, int0);
  }

  /**
  //Test case number: 8
  /*Coverage entropy=1.2684036609455267
  */
  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(0);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 1, "Signature", "~W", "~W", (Object) null);
      FieldWriter fieldWriter1 = classWriter0.firstField;
      Attribute attribute0 = new Attribute((String) null);
      fieldWriter1.visitAttribute(attribute0);
      ByteVector byteVector0 = classWriter0.pool;
      fieldWriter0.visitAttribute(attribute0);
      // Undeclared exception!
      fieldWriter0.put(byteVector0);
  }

  /**
  //Test case number: 9
  /*Coverage entropy=1.0829081047004716
  */
  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(10);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 10, "", "", (String) null, "");
      ByteVector byteVector0 = new ByteVector();
      fieldWriter0.put(byteVector0);
  }

  /**
  //Test case number: 10
  /*Coverage entropy=0.8361623253853443
  */
  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-529));
      classWriter0.index = (-529);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, (-529), "ConstantVjadIlue", "ConstantVjadIlue", "ConstantVjadIlue", "ConstantVjadIlue");
      ByteVector byteVector0 = new ByteVector();
      fieldWriter0.put(byteVector0);
  }

  /**
  //Test case number: 11
  /*Coverage entropy=0.42857142857142855
  */
  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(11);
      ByteVector byteVector0 = classWriter0.pool;
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 4096, "<re io|\"KJuZ&sW", "<re io|\"KJuZ&sW", "<re io|\"KJuZ&sW", "<re io|\"KJuZ&sW");
      Attribute attribute0 = new Attribute("<re io|\"KJuZ&sW");
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
  /*Coverage entropy=0.42857142857142855
  */
  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(11);
      ByteVector byteVector0 = new ByteVector(11);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 2, "<re io|\"KJuZ&sW", "<re io|\"KJuZ&sW", "<re io|\"KJuZ&sW", "<re io|\"KJuZ&sW");
      fieldWriter0.visitAnnotation("<re io|\"KJuZ&sW", true);
      fieldWriter0.put(byteVector0);
  }

  /**
  //Test case number: 13
  /*Coverage entropy=0.4
  */
  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(0);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 2, "Sy*%ntheti@!c", "Sy*%ntheti@!c", (String) null, "Sy*%ntheti@!c");
      int int0 = fieldWriter0.getSize();
      assertEquals(16, int0);
  }

  /**
  //Test case number: 14
  /*Coverage entropy=0.9623351446188083
  */
  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(0);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 2, "", "", (String) null, (Object) null);
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
  //Test case number: 15
  /*Coverage entropy=0.9623351446188083
  */
  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(0);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 1, "ConstantValue", "ConstantValue", "ConstantValue", (Object) null);
      ByteVector byteVector0 = classWriter0.pool;
      fieldWriter0.put(byteVector0);
  }

  /**
  //Test case number: 16
  /*Coverage entropy=0.4
  */
  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(0);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 2, "o*%nthqeti@!", "o*%nthqeti@!", "o*%nthqeti@!", "o*%nthqeti@!");
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
  //Test case number: 17
  /*Coverage entropy=0.42857142857142855
  */
  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(10);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 2, "S*nFheti!c", "S*nFheti!c", "S*nFheti!c", "S*nFheti!c");
      fieldWriter0.visitAnnotation("S*nFheti!c", false);
      ByteVector byteVector0 = new ByteVector();
      fieldWriter0.put(byteVector0);
  }

  /**
  //Test case number: 18
  /*Coverage entropy=0.4
  */
  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-538));
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, (-538), "", "", "", "");
      ByteVector byteVector0 = new ByteVector();
      fieldWriter0.put(byteVector0);
  }

  /**
  //Test case number: 19
  /*Coverage entropy=1.2885387096069334
  */
  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(16777215);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 2, "Sy*%nthei@!c", "Sy*%nthei@!c", "Sy*%nthei@!c", "Sy*%nthei@!c");
      Attribute attribute0 = new Attribute("Sy*%nthei@!c");
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
  //Test case number: 20
  /*Coverage entropy=0.42857142857142855
  */
  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(0);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 2, "", "", "", "");
      fieldWriter0.visitAnnotation("", true);
      int int0 = fieldWriter0.getSize();
      assertEquals(36, int0);
  }

  /**
  //Test case number: 21
  /*Coverage entropy=0.42857142857142855
  */
  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-569));
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 2, "Deprecated", "y]/F'kuxQK", "y]/F'kuxQK", "Deprecated");
      fieldWriter0.visitAnnotation("y]/F'kuxQK", false);
      fieldWriter0.visitEnd();
  }

  /**
  //Test case number: 22
  /*Coverage entropy=0.4
  */
  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(0);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 2, "Sy*%ntheti@!c", "Sy*%ntheti@!c", "Sy*%ntheti@!c", "Sy*%ntheti@!c");
      ByteVector byteVector0 = new ByteVector();
      fieldWriter0.put(byteVector0);
  }

  /**
  //Test case number: 23
  /*Coverage entropy=0.42857142857142855
  */
  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-529));
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, (-529), "ConstantVjadIlue", "ConstantVjadIlue", "ConstantVjadIlue", "ConstantVjadIlue");
      fieldWriter0.visitAnnotation("ConstantVjadIlue", false);
      int int0 = fieldWriter0.getSize();
      assertEquals(48, int0);
  }

  /**
  //Test case number: 24
  /*Coverage entropy=0.3333333333333333
  */
  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      FieldWriter fieldWriter0 = null;
      try {
        fieldWriter0 = new FieldWriter((ClassWriter) null, 3, "6Ys{B$Z\"G+1", "6Ys{B$Z\"G+1", "6Ys{B$Z\"G+1", (Object) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("wheel.asm.FieldWriter", e);
      }
  }

  /**
  //Test case number: 25
  /*Coverage entropy=0.3333333333333333
  */
  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(0);
      FieldWriter fieldWriter0 = null;
      try {
        fieldWriter0 = new FieldWriter(classWriter0, 1, "*%nthi@!c", "*%nthi@!c", "*%nthi@!c", classWriter0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // value wheel.asm.ClassWriter@5
         //
         verifyException("wheel.asm.ClassWriter", e);
      }
  }
}
