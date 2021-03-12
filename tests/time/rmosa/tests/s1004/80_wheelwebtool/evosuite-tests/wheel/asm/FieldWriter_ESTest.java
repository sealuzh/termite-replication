/*
 * This file was automatically generated by EvoSuite
 * Sat Nov 28 15:58:59 GMT 2020
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
  /*Coverage entropy=0.4361623253853443
  */
  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-2907));
      classWriter0.index = (-2907);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, (-3387), "", "", "", "");
      ByteVector byteVector0 = new ByteVector();
      fieldWriter0.put(byteVector0);
  }

  /**
  //Test case number: 1
  /*Coverage entropy=0.5623351446188083
  */
  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-1257));
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 1, "&3BY? S=", "&[.ImRUtrw.ULNceP", (String) null, "");
      AnnotationVisitor annotationVisitor0 = fieldWriter0.visitAnnotation("", true);
      assertNotNull(annotationVisitor0);
  }

  /**
  //Test case number: 2
  /*Coverage entropy=0.5623351446188083
  */
  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-1257));
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 2, "U?>/", "RuntimeInvisibleAnnotations", (String) null, (Object) null);
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
  //Test case number: 3
  /*Coverage entropy=0.5623351446188083
  */
  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-2907));
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, (-2907), ",hblw}3(plp&,M", "", "", "");
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
  //Test case number: 4
  /*Coverage entropy=0.5623351446188083
  */
  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-1257));
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 2, "U?>/", "RuntimeInvisibleAnnotations", (String) null, (Object) null);
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
  //Test case number: 5
  /*Coverage entropy=0.5623351446188083
  */
  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-1257));
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 4096, "&3B.? S=", "&[.ImRUtrw.ULNceP", (String) null, "k");
      ByteVector byteVector0 = classWriter0.pool;
      byte[] byteArray0 = new byte[4];
      byteVector0.data = byteArray0;
      // Undeclared exception!
      try { 
        fieldWriter0.visitAnnotation("TYnYdqeYRQ", false);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
      }
  }

  /**
  //Test case number: 6
  /*Coverage entropy=0.5623351446188083
  */
  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-1257));
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 2, "U?>/", "RuntimeInvisibleAnnotations", (String) null, (Object) null);
      ByteVector byteVector0 = classWriter0.pool;
      byteVector0.length = (-3668);
      // Undeclared exception!
      try { 
        fieldWriter0.put(byteVector0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  /**
  //Test case number: 7
  /*Coverage entropy=0.6730116670092565
  */
  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(33554432);
      classWriter0.index = 33554432;
      classWriter0.visitOuterClass("yc^dm^xD=lWK|]0", "yc^dm^xD=lWK|]0", "");
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 33554432, "", "", "yc^dm^xD=lWK|]0", "yc^dm^xD=lWK|]0");
      // Undeclared exception!
      fieldWriter0.getSize();
  }

  /**
  //Test case number: 8
  /*Coverage entropy=0.6730116670092565
  */
  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-1257));
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 1, "&3BY? S=", "&[.ImRUtrw.ULNceP", (String) null, "");
      ByteVector byteVector0 = classWriter0.pool;
      byteVector0.length = (-1549);
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
  //Test case number: 9
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      FieldWriter fieldWriter0 = null;
      try {
        fieldWriter0 = new FieldWriter((ClassWriter) null, (-1), "LL?TSNy", "LL?TSNy", "LL?TSNy", (Object) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("wheel.asm.FieldWriter", e);
      }
  }

  /**
  //Test case number: 10
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(70);
      FieldWriter fieldWriter0 = null;
      try {
        fieldWriter0 = new FieldWriter(classWriter0, 1, "hDMl&4&MJ4qJIC`", "hDMl&4&MJ4qJIC`", "hDMl&4&MJ4qJIC`", classWriter0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // value wheel.asm.ClassWriter@5
         //
         verifyException("wheel.asm.ClassWriter", e);
      }
  }

  /**
  //Test case number: 11
  /*Coverage entropy=0.6128694524619496
  */
  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-1257));
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 4096, "&3BY? S=", "&[.ImRUtrw.ULNceP", (String) null, "k");
      ByteVector byteVector0 = classWriter0.pool;
      fieldWriter0.visitAnnotation("TYnYdqeYRQ", false);
      fieldWriter0.put(byteVector0);
  }

  /**
  //Test case number: 12
  /*Coverage entropy=0.6128694524619496
  */
  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-1257));
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 4096, "&3BY? S=", "&[.ImRUtrw.ULNceP", (String) null, "k");
      fieldWriter0.visitAnnotation("Signature", true);
      ByteVector byteVector0 = classWriter0.pool;
      fieldWriter0.put(byteVector0);
  }

  /**
  //Test case number: 13
  /*Coverage entropy=0.4361623253853443
  */
  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-3953));
      classWriter0.version = (-3953);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, (-3387), "", "", "", "");
      ByteVector byteVector0 = classWriter0.pool;
      fieldWriter0.put(byteVector0);
  }

  /**
  //Test case number: 14
  /*Coverage entropy=0.4659992569610426
  */
  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-1257));
      ByteVector byteVector0 = new ByteVector();
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 1, "Signature", "", "&[.ImRUtrw.ULNceP", (Object) null);
      fieldWriter0.put(byteVector0);
  }

  /**
  //Test case number: 15
  /*Coverage entropy=0.7902679680745903
  */
  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-2907));
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, (-3387), ",hblw}3(plp&,M", "", "", "");
      Attribute attribute0 = new Attribute("R6,f");
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
      ClassWriter classWriter0 = new ClassWriter((-2907));
      classWriter0.version = (-2907);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, (-3387), ",hblw}3(plp&,M", "", "", "");
      int int0 = fieldWriter0.getSize();
      assertEquals(30, int0);
  }

  /**
  //Test case number: 17
  /*Coverage entropy=0.5859526183035508
  */
  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-1257));
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 4096, "&3BY? S=", "&[.ImRUtrw.ULNceP", (String) null, "k");
      int int0 = fieldWriter0.getSize();
      assertEquals(22, int0);
  }

  /**
  //Test case number: 18
  /*Coverage entropy=0.6108643020548935
  */
  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-1257));
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 2, "U?>/", "", (String) null, (Object) null);
      int int0 = fieldWriter0.getSize();
      assertEquals(8, int0);
  }

  /**
  //Test case number: 19
  /*Coverage entropy=0.8239592165010823
  */
  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-1257));
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 4096, "&3BY? S=", "&[.ImRUtrw.ULNceP", (String) null, "k");
      fieldWriter0.visitAnnotation("Signature", true);
      int int0 = fieldWriter0.getSize();
      assertEquals(34, int0);
  }

  /**
  //Test case number: 20
  /*Coverage entropy=0.8239592165010823
  */
  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-1257));
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 4096, "&3BY? S=", "&[.ImRUtrw.ULNceP", (String) null, "k");
      fieldWriter0.visitAnnotation("TYnYdqeYRQ", false);
      int int0 = fieldWriter0.getSize();
      assertEquals(34, int0);
  }

  /**
  //Test case number: 21
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-1257));
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 1, "&3BY? S=", "&[.ImRUtrw.ULNceP", (String) null, "");
      FieldWriter fieldWriter1 = new FieldWriter(classWriter0, 1, "Signature", "", "&[.ImRUtrw.ULNceP", (Object) null);
      assertFalse(fieldWriter1.equals((Object)fieldWriter0));
  }

  /**
  //Test case number: 22
  /*Coverage entropy=0.5623351446188083
  */
  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(0);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 1, "2G]C#HK!(~S&p7", "", "SourceFile", "2G]C#HK!(~S&p7");
      fieldWriter0.visitEnd();
  }

  /**
  //Test case number: 23
  /*Coverage entropy=0.5940241655824705
  */
  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-1257));
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 4096, "&3BY? S=", "&[.ImRUtrw.ULNceP", (String) null, "k");
      Attribute attribute0 = new Attribute("&3BY? S=");
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
