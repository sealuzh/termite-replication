/*
 * This file was automatically generated by EvoSuite
 * Sat Nov 28 17:27:15 GMT 2020
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
      ClassWriter classWriter0 = new ClassWriter((-4032));
      classWriter0.index = (-29);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, (-29), "", "", "", "");
      ByteVector byteVector0 = classWriter0.pool;
      fieldWriter0.put(byteVector0);
  }

  /**
  //Test case number: 1
  /*Coverage entropy=0.5859526183035508
  */
  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-4032));
      classWriter0.index = (-4032);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, (-29), "", "", "", "");
      int int0 = fieldWriter0.getSize();
      assertEquals(36, int0);
  }

  /**
  //Test case number: 2
  /*Coverage entropy=0.5623351446188083
  */
  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(0);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 1, "", "", "", "");
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
      ClassWriter classWriter0 = new ClassWriter((-33));
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, (-33), "", "", "", "");
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
      ClassWriter classWriter0 = new ClassWriter((-33));
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, (-33), "", "", "", "");
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
  /*Coverage entropy=0.5623351446188083
  */
  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-4032));
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, (-29), "", "", "", "");
      ByteVector byteVector0 = classWriter0.pool;
      byte[] byteArray0 = new byte[3];
      byteVector0.data = byteArray0;
      // Undeclared exception!
      try { 
        fieldWriter0.visitAnnotation("pN_B", true);
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
  /*Coverage entropy=0.7902679680745903
  */
  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-4032));
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, (-29), "", "", "", "");
      ByteVector byteVector0 = classWriter0.pool;
      Attribute attribute0 = new Attribute("");
      fieldWriter0.visitAttribute(attribute0);
      fieldWriter0.visitAttribute(attribute0);
      // Undeclared exception!
      fieldWriter0.put(byteVector0);
  }

  /**
  //Test case number: 7
  /*Coverage entropy=0.5623351446188083
  */
  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-33));
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, (-33), "", "", "", "");
      ByteVector byteVector0 = classWriter0.pool;
      byte[] byteArray0 = new byte[0];
      byteVector0.data = byteArray0;
      // Undeclared exception!
      try { 
        fieldWriter0.put(byteVector0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
      }
  }

  /**
  //Test case number: 8
  /*Coverage entropy=0.6730116670092565
  */
  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-4032));
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, (-29), "", "", "P}Rbl!V-[PEY", "P}Rbl!V-[PEY");
      ByteVector byteVector0 = classWriter0.pool;
      byte[] byteArray0 = new byte[8];
      byteVector0.data = byteArray0;
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
  //Test case number: 9
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      FieldWriter fieldWriter0 = null;
      try {
        fieldWriter0 = new FieldWriter((ClassWriter) null, 12, "", "", "", "");
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
      ClassWriter classWriter0 = new ClassWriter((-4032));
      ByteVector byteVector0 = classWriter0.pool;
      byteVector0.length = (-3143);
      FieldWriter fieldWriter0 = null;
      try {
        fieldWriter0 = new FieldWriter(classWriter0, 247, "wheel.asm.Attribute", "`V?KUc%U<D<E^W", "`V?KUc%U<D<E^W", (Object) null);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  /**
  //Test case number: 11
  /*Coverage entropy=0.5940241655824705
  */
  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-4032));
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, (-29), "", "", "", "");
      ByteVector byteVector0 = classWriter0.pool;
      Attribute attribute0 = new Attribute("");
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
  /*Coverage entropy=0.6128694524619496
  */
  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-4032));
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, (-29), "", "", "", "");
      ByteVector byteVector0 = classWriter0.pool;
      fieldWriter0.visitAnnotation("", false);
      fieldWriter0.put(byteVector0);
  }

  /**
  //Test case number: 13
  /*Coverage entropy=0.6128694524619496
  */
  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-4032));
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, (-29), "", "", "", "");
      ByteVector byteVector0 = classWriter0.pool;
      fieldWriter0.visitAnnotation("", true);
      fieldWriter0.put(byteVector0);
  }

  /**
  //Test case number: 14
  /*Coverage entropy=0.4361623253853443
  */
  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-33));
      classWriter0.version = 50;
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, (-33), "", "", "", "");
      ByteVector byteVector0 = classWriter0.pool;
      fieldWriter0.put(byteVector0);
  }

  /**
  //Test case number: 15
  /*Coverage entropy=0.4659992569610426
  */
  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-4032));
      ByteVector byteVector0 = classWriter0.pool;
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 247, "wheel.asm.Attribute", "`V?KUc%U<D<E^W", "`V?KUc%U<D<E^W", (Object) null);
      fieldWriter0.put(byteVector0);
  }

  /**
  //Test case number: 16
  /*Coverage entropy=0.4361623253853443
  */
  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(0);
      ByteVector byteVector0 = classWriter0.pool;
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, (-272), "wheel.asm.Attribute", "|dGa", (String) null, (Object) null);
      fieldWriter0.put(byteVector0);
  }

  /**
  //Test case number: 17
  /*Coverage entropy=0.8239592165010823
  */
  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-4032));
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, (-29), "tackapTable", "", "", "");
      fieldWriter0.visitAnnotation("P,Ld#\"RrVm6><", false);
      int int0 = fieldWriter0.getSize();
      assertEquals(48, int0);
  }

  /**
  //Test case number: 18
  /*Coverage entropy=0.5859526183035508
  */
  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-4032));
      classWriter0.version = 50;
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, (-29), "", "", "", "");
      int int0 = fieldWriter0.getSize();
      assertEquals(30, int0);
  }

  /**
  //Test case number: 19
  /*Coverage entropy=0.6108643020548935
  */
  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(0);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 0, "", "", (String) null, (Object) null);
      int int0 = fieldWriter0.getSize();
      assertEquals(8, int0);
  }

  /**
  //Test case number: 20
  /*Coverage entropy=0.8239592165010823
  */
  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-4032));
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, (-29), "", "", "", "");
      fieldWriter0.visitAnnotation("", true);
      int int0 = fieldWriter0.getSize();
      assertEquals(48, int0);
  }

  /**
  //Test case number: 21
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(2495);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 0, "p|FyN\u0006w^/ 2vMW'", "p|FyN\u0006w^/ 2vMW'", "lw5:cU|%\"Y%", "lw5:cU|%\"Y%");
      Object object0 = new Object();
      FieldWriter fieldWriter1 = null;
      try {
        fieldWriter1 = new FieldWriter(classWriter0, 3, "p|FyN\u0006w^/ 2vMW'", "s:A?o~,~1Etn.\"#X&L", "RXL?&azpy~hd", object0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // value java.lang.Object@49b1f48d
         //
         verifyException("wheel.asm.ClassWriter", e);
      }
  }

  /**
  //Test case number: 22
  /*Coverage entropy=0.5623351446188083
  */
  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(697);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 718, "W%Zdc,OCb3/t4", "PZdRlct", "W%Zdc,OCb3/t4", "W%Zdc,OCb3/t4");
      fieldWriter0.visitEnd();
  }

  /**
  //Test case number: 23
  /*Coverage entropy=0.7902679680745903
  */
  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-4032));
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, (-29), "", "", "", "");
      Attribute attribute0 = new Attribute("");
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
