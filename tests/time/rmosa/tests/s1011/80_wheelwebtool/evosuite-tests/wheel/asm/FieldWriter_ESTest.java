/*
 * This file was automatically generated by EvoSuite
 * Sat Nov 28 22:16:18 GMT 2020
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
  /*Coverage entropy=0.4659992569610426
  */
  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(330);
      classWriter0.index = (-1309);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 0, "_l8EuPhA`|Q]h", "_l8EuPhA`|Q]h", "<c?ZV0", "<c?ZV0");
      ByteVector byteVector0 = new ByteVector();
      fieldWriter0.put(byteVector0);
  }

  /**
  //Test case number: 1
  /*Coverage entropy=0.5859526183035508
  */
  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(4);
      classWriter0.index = (-1449);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, (-1449), "N0f~yK-Kg95dekj", "w!8", "N0f~yK-Kg95dekj", "N0f~yK-Kg95dekj");
      int int0 = fieldWriter0.getSize();
      assertEquals(36, int0);
  }

  /**
  //Test case number: 2
  /*Coverage entropy=0.5623351446188083
  */
  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(1530);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 1, "ntPum~<X", "ntPum~<X", "ntPum~<X", "ntPum~<X");
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
  //Test case number: 3
  /*Coverage entropy=0.5623351446188083
  */
  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(4);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 4, "", "I", "", (Object) null);
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
  /*Coverage entropy=0.8239592165010823
  */
  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(330);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 0, "_l8EuPhA`|Q]h", "_l8EuPhA`|Q]h", "<c?ZV0", "<c?ZV0");
      Attribute attribute0 = new Attribute("PFt][$");
      fieldWriter0.visitAttribute(attribute0);
      fieldWriter0.visitAttribute(attribute0);
      ByteVector byteVector0 = new ByteVector();
      // Undeclared exception!
      fieldWriter0.put(byteVector0);
  }

  /**
  //Test case number: 5
  /*Coverage entropy=0.5623351446188083
  */
  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(3);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, (-1700), "9o2DR;@r<@;CP", "9o2DR;@r<@;CP", (String) null, "");
      ByteVector byteVector0 = new ByteVector();
      ByteVector byteVector1 = byteVector0.putLong(1L);
      byteVector1.length = 108;
      // Undeclared exception!
      try { 
        fieldWriter0.put(byteVector0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
      }
  }

  /**
  //Test case number: 6
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      FieldWriter fieldWriter0 = null;
      try {
        fieldWriter0 = new FieldWriter((ClassWriter) null, 251658240, "CPOM0\"iaF|e9I", "CPOM0\"iaF|e9I", "CPOM0\"iaF|e9I", "CPOM0\"iaF|e9I");
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
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(4);
      FieldWriter fieldWriter0 = null;
      try {
        fieldWriter0 = new FieldWriter(classWriter0, 4, "N0f~yK-Kg95dekj", "N0f~yK-Kg95dekj", "*)#BN", classWriter0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // value wheel.asm.ClassWriter@5
         //
         verifyException("wheel.asm.ClassWriter", e);
      }
  }

  /**
  //Test case number: 8
  /*Coverage entropy=0.6128694524619496
  */
  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(3);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, (-1700), "9o2DR;@r<@;CP", "9o2DR;@r<@;CP", (String) null, "");
      ByteVector byteVector0 = new ByteVector();
      fieldWriter0.visitAnnotation("", false);
      fieldWriter0.put(byteVector0);
  }

  /**
  //Test case number: 9
  /*Coverage entropy=0.6128694524619496
  */
  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(3);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, (-1410), "", "w!8", "", "w!8");
      ByteVector byteVector0 = new ByteVector();
      fieldWriter0.visitAnnotation("StackMapTable", true);
      fieldWriter0.put(byteVector0);
  }

  /**
  //Test case number: 10
  /*Coverage entropy=0.4361623253853443
  */
  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(1530);
      String[] stringArray0 = new String[6];
      stringArray0[0] = "y `P9K%M'S-!bdU";
      stringArray0[1] = "y `P9K%M'S-!bdU";
      stringArray0[2] = "y `P9K%M'S-!bdU";
      stringArray0[3] = "y `P9K%M'S-!bdU";
      stringArray0[4] = "y `P9K%M'S-!bdU";
      stringArray0[5] = "y `P9K%M'S-!bdU";
      classWriter0.visit((-1210), (-2722), "ntPum~<X", "ntPum~<X", "y `P9K%M'S-!bdU", stringArray0);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, (-2722), "y `P9K%M'S-!bdU", "y `P9K%M'S-!bdU", "y `P9K%M'S-!bdU", "y `P9K%M'S-!bdU");
      ByteVector byteVector0 = new ByteVector();
      fieldWriter0.put(byteVector0);
  }

  /**
  //Test case number: 11
  /*Coverage entropy=0.4361623253853443
  */
  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(1019);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 61678, "<init>", "Z0QU-bZ[6~", "RuntimeVisibleAnnotations", (Object) null);
      ByteVector byteVector0 = new ByteVector();
      fieldWriter0.put(byteVector0);
  }

  /**
  //Test case number: 12
  /*Coverage entropy=0.8239592165010823
  */
  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(1530);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 1, "ntPum~<X", "ntPum~<X", "ntPum~<X", "ntPum~<X");
      Attribute attribute0 = new Attribute("Jy'NX\"^.$e-Lrd+");
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
  //Test case number: 13
  /*Coverage entropy=0.8599672810355049
  */
  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(1530);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 1, "ntPum~<X", "ntPum~<X", "ntPum~<X", "ntPum~<X");
      fieldWriter0.visitAnnotation("7)*Rf%Rl)r?c*TX", false);
      int int0 = fieldWriter0.getSize();
      assertEquals(36, int0);
  }

  /**
  //Test case number: 14
  /*Coverage entropy=0.5859526183035508
  */
  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(330);
      classWriter0.version = 330;
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, (-843), "{vxVyB", "", "", "");
      int int0 = fieldWriter0.getSize();
      assertEquals(30, int0);
  }

  /**
  //Test case number: 15
  /*Coverage entropy=0.5859526183035508
  */
  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(3);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, (-1700), "9o2DR;@r<@;CP", "9o2DR;@r<@;CP", (String) null, "");
      int int0 = fieldWriter0.getSize();
      assertEquals(28, int0);
  }

  /**
  //Test case number: 16
  /*Coverage entropy=0.6108643020548935
  */
  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-225));
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 2, "ntPum~<X", "ntPum~<X", "ntPum~<X", (Object) null);
      int int0 = fieldWriter0.getSize();
      assertEquals(16, int0);
  }

  /**
  //Test case number: 17
  /*Coverage entropy=0.8239592165010823
  */
  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(3);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, (-1700), "9o2DR;@r<@;CP", "9o2DR;@r<@;CP", (String) null, "");
      fieldWriter0.visitAnnotation("^x.x+^LAW-", true);
      int int0 = fieldWriter0.getSize();
      assertEquals(40, int0);
  }

  /**
  //Test case number: 18
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(3);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, (-1410), "", "w!8", "", "w!8");
      FieldWriter fieldWriter1 = new FieldWriter(classWriter0, 2, "q*A5W=o", "StackMapTable", "", "q*A5W=o");
      assertFalse(fieldWriter1.equals((Object)fieldWriter0));
  }

  /**
  //Test case number: 19
  /*Coverage entropy=0.5623351446188083
  */
  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(525);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 1480, "eZQmMsLdK3^:[k", "[]", "[]", (Object) null);
      fieldWriter0.visitEnd();
  }

  /**
  //Test case number: 20
  /*Coverage entropy=0.6330395116644678
  */
  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(330);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 0, "_l8EuPhA`|Q]h", "_l8EuPhA`|Q]h", "<c?ZV0", "<c?ZV0");
      Attribute attribute0 = new Attribute("PFt][$");
      fieldWriter0.visitAttribute(attribute0);
      ByteVector byteVector0 = new ByteVector();
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
