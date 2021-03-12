/*
 * This file was automatically generated by EvoSuite
 * Tue Nov 10 16:20:54 GMT 2020
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
      ByteVector byteVector0 = new ByteVector();
      ClassWriter classWriter0 = new ClassWriter(4721);
      String[] stringArray0 = new String[0];
      classWriter0.visit((byte) (-67), (-3776), "o.f*$~y", "o.f*$~y", "o.f*$~y", stringArray0);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, (-3776), "o.f*$~y", "0NDBl~1?c7MnUo", "o.f*$~y", "o.f*$~y");
      fieldWriter0.put(byteVector0);
  }

  /**
  //Test case number: 1
  /*Coverage entropy=0.4361623253853443
  */
  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      ByteVector byteVector0 = new ByteVector();
      ClassWriter classWriter0 = new ClassWriter(4721);
      classWriter0.index = (int) (byte) (-67);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, (-3776), "o.f*$~y", "0NDBl~1?c7MnUo", "o.f*$~y", "o.f*$~y");
      fieldWriter0.put(byteVector0);
  }

  /**
  //Test case number: 2
  /*Coverage entropy=0.5859526183035508
  */
  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(4721);
      String[] stringArray0 = new String[1];
      stringArray0[0] = "D(Z+";
      classWriter0.visit(49, 4721, "c+cp%Uh4aR#Mr.[-", "", "c+cp%Uh4aR#Mr.[-", stringArray0);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, (-993), "0NDBl~1?c7MnUo", "D(Z+", "D(Z+", "0NDBl~1?c7MnUo");
      int int0 = fieldWriter0.getSize();
      assertEquals(30, int0);
  }

  /**
  //Test case number: 3
  /*Coverage entropy=0.5859526183035508
  */
  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-1870));
      classWriter0.index = (-1870);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, (-4062), "", "", "", "");
      int int0 = fieldWriter0.getSize();
      assertEquals(36, int0);
  }

  /**
  //Test case number: 4
  /*Coverage entropy=0.5623351446188083
  */
  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(49);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 192, "", "Label offset position has not been resolved yet", "-N{f'/(", "-N{f'/(");
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
  //Test case number: 5
  /*Coverage entropy=0.5623351446188083
  */
  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-1870));
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, (-1870), ">Q.|'S8", "wheel.asm.ClassReader", "", (Object) null);
      ByteVector byteVector0 = new ByteVector(290);
      byteVector0.length = (-268435456);
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
  //Test case number: 6
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(999);
      FieldWriter fieldWriter0 = null;
      try {
        fieldWriter0 = new FieldWriter(classWriter0, 9, (String) null, (String) null, "", "A55!;rz");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  /**
  //Test case number: 7
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(1124);
      Object object0 = new Object();
      FieldWriter fieldWriter0 = null;
      try {
        fieldWriter0 = new FieldWriter(classWriter0, 128, "00.yTLLQ2v", "NSM>FX:xF`!64", "00.yTLLQ2v", object0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // value java.lang.Object@780e0846
         //
         verifyException("wheel.asm.ClassWriter", e);
      }
  }

  /**
  //Test case number: 8
  /*Coverage entropy=0.5940241655824705
  */
  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-1));
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, (-1870), "Deprecated", "", "", (Object) null);
      ByteVector byteVector0 = new ByteVector();
      Attribute attribute0 = new Attribute("E");
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
  //Test case number: 9
  /*Coverage entropy=0.6546695645285008
  */
  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-784));
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 251658240, "", "ib89onpA@0]L('o<c;C", "wheel.asm.ByteVector", "");
      fieldWriter0.visitAnnotation("hFYo>RY@\"d8c", false);
      ByteVector byteVector0 = classWriter0.pool;
      fieldWriter0.put(byteVector0);
  }

  /**
  //Test case number: 10
  /*Coverage entropy=0.6546695645285008
  */
  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-784));
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 251658240, "", "ib89onpA@0]L('o<c;C", "wheel.asm.ByteVector", "");
      fieldWriter0.visitAnnotation("hFYo>RY@\"d8c", true);
      ByteVector byteVector0 = classWriter0.pool;
      fieldWriter0.put(byteVector0);
  }

  /**
  //Test case number: 11
  /*Coverage entropy=0.4659992569610426
  */
  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      ByteVector byteVector0 = new ByteVector(224);
      ClassWriter classWriter0 = new ClassWriter((-1));
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 1101, "f", "o|/$~|", (String) null, "o|/$~|");
      fieldWriter0.put(byteVector0);
  }

  /**
  //Test case number: 12
  /*Coverage entropy=0.4361623253853443
  */
  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      ByteVector byteVector0 = new ByteVector();
      ClassWriter classWriter0 = new ClassWriter(11);
      String[] stringArray0 = new String[0];
      classWriter0.visit((byte)49, (-3776), "o.f*$~y", "o.f*$~y", "o.f*$~y", stringArray0);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, (-3776), "o.f*$~y", "0NDBl~1?c7MnUo", "o.f*$~y", "o.f*$~y");
      fieldWriter0.put(byteVector0);
  }

  /**
  //Test case number: 13
  /*Coverage entropy=0.7902679680745903
  */
  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Attribute attribute0 = new Attribute("c+cp%Uh4aR#Mr.[-");
      ClassWriter classWriter0 = new ClassWriter(4721);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, (-3776), "D(Z+", "0NDBl~1?c7MnUo", "o.f*$~y", "D(Z+");
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
  /*Coverage entropy=0.6108643020548935
  */
  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-1870));
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 2, "", "", (String) null, (Object) null);
      int int0 = fieldWriter0.getSize();
      assertEquals(8, int0);
  }

  /**
  //Test case number: 15
  /*Coverage entropy=0.5859526183035508
  */
  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(131072);
      classWriter0.visit(65469, (byte)95, "o|/$~|", "h1!O{JjPdqj\"1'Qe9", "The wldcard lst must not be null", (String[]) null);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, (-3646), "The wldcard lst must not be null", "h1!O{JjPdqj\"1'Qe9", "FSwKn7;hO0O", "h1!O{JjPdqj\"1'Qe9");
      int int0 = fieldWriter0.getSize();
      assertEquals(30, int0);
  }

  /**
  //Test case number: 16
  /*Coverage entropy=0.8599672810355049
  */
  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-784));
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 251658240, "", "ib89onpA@0]L('o<c;C", "wheel.asm.ByteVector", "");
      fieldWriter0.visitAnnotation("hFYo>RY@\"d8c", true);
      int int0 = fieldWriter0.getSize();
      assertEquals(36, int0);
  }

  /**
  //Test case number: 17
  /*Coverage entropy=0.8599672810355049
  */
  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-784));
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 251658240, "", "ib89onpA@0]L('o<c;C", "wheel.asm.ByteVector", "");
      fieldWriter0.visitAnnotation("hFYo>RY@\"d8c", false);
      int int0 = fieldWriter0.getSize();
      assertEquals(36, int0);
  }

  /**
  //Test case number: 18
  /*Coverage entropy=0.5623351446188083
  */
  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-501));
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 2, "The FileFilter must not be null", "hFYo>RY@\"d8c", (String) null, (Object) null);
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
  //Test case number: 19
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-1870));
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, (-1870), ">Q.|H'S8", "wheel.asm.ClassReader", "Synthetic", (Object) null);
      FieldWriter fieldWriter1 = new FieldWriter(classWriter0, (-4062), "", "", "", "");
      assertFalse(fieldWriter1.equals((Object)fieldWriter0));
  }

  /**
  //Test case number: 20
  /*Coverage entropy=0.5623351446188083
  */
  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(0);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 2, "", "", "", (Object) null);
      fieldWriter0.visitEnd();
  }
}
