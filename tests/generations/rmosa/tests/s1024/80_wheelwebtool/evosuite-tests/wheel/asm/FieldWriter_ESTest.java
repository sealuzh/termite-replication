/*
 * This file was automatically generated by EvoSuite
 * Mon Nov 09 14:27:45 GMT 2020
 */

package wheel.asm;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.SequenceInputStream;
import java.util.Enumeration;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
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
  /*Coverage entropy=0.4361623253853443
  */
  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(964);
      classWriter0.index = (-15);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, (-15), "O8", "O8", "O8", "O8");
      ByteVector byteVector0 = classWriter0.pool;
      fieldWriter0.put(byteVector0);
  }

  /**
  //Test case number: 1
  /*Coverage entropy=0.6108643020548935
  */
  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(441);
      classWriter0.index = (-2784);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 441, "N}o.<G8IO,,S#lU9s2Q", "N}o.<G8IO,,S#lU9s2Q", "N}o.<G8IO,,S#lU9s2Q", "N}o.<G8IO,,S#lU9s2Q");
      int int0 = fieldWriter0.getSize();
      assertEquals(24, int0);
  }

  /**
  //Test case number: 2
  /*Coverage entropy=0.5623351446188083
  */
  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(953);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 0, "O8", "", "O8", "O8");
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
      ClassWriter classWriter0 = new ClassWriter(953);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 0, "O8", "", "O8", "O8");
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
  /*Coverage entropy=0.5623351446188083
  */
  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(958);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, (byte) (-82), "The array of suffixes must not be null", "O8", "wheel.asm.MethodWriter", (Object) null);
      ByteVector byteVector0 = classWriter0.pool;
      byteVector0.putByteArray((byte[]) null, 50, (-3862));
      // Undeclared exception!
      try { 
        fieldWriter0.visitAnnotation("D&G}fBu", true);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  /**
  //Test case number: 5
  /*Coverage entropy=0.4659992569610426
  */
  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(953);
      classWriter0.index = 63485;
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 63485, "O8", "", "O8", "O8");
      ByteVector byteVector0 = classWriter0.pool;
      // Undeclared exception!
      fieldWriter0.put(byteVector0);
  }

  /**
  //Test case number: 6
  /*Coverage entropy=0.5623351446188083
  */
  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(953);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 0, "O8", "", "O8", "O8");
      ByteVector byteVector0 = classWriter0.pool;
      byteVector0.length = (-208);
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
  /*Coverage entropy=0.6829081047004717
  */
  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(958);
      ByteVector byteVector0 = classWriter0.pool;
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, (byte) (-82), "The ar`ay of suffixe must ot be nul", "K#fT}Gl(X;x", "wheel.asm.MethodWriter", (Object) null);
      byte[] byteArray0 = new byte[7];
      byteVector0.data = byteArray0;
      // Undeclared exception!
      try { 
        fieldWriter0.getSize();
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
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
        fieldWriter0 = new FieldWriter((ClassWriter) null, 5, "iv*+-<h^XbD", "iv*+-<h^XbD", "iv*+-<h^XbD", (Object) null);
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
      ClassWriter classWriter0 = new ClassWriter(958);
      ByteVector byteVector0 = classWriter0.pool;
      ByteVector byteVector1 = byteVector0.putInt((-2051));
      byteVector1.length = (-2829);
      Enumeration<SequenceInputStream> enumeration0 = (Enumeration<SequenceInputStream>) mock(Enumeration.class, new ViolatedAssumptionAnswer());
      doReturn(false).when(enumeration0).hasMoreElements();
      SequenceInputStream sequenceInputStream0 = new SequenceInputStream(enumeration0);
      FieldWriter fieldWriter0 = null;
      try {
        fieldWriter0 = new FieldWriter(classWriter0, 3417, "(T/Iz$yg_T", "f|/9j0T4-", (String) null, sequenceInputStream0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  /**
  //Test case number: 10
  /*Coverage entropy=0.6330395116644678
  */
  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(953);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 0, "O8", "", "O8", "O8");
      Attribute attribute0 = new Attribute("O8");
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
  //Test case number: 11
  /*Coverage entropy=0.6128694524619496
  */
  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(958);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, (byte) (-82), "The array of suffixes must not be null", "O8", "wheel.asm.MethodWriter", (Object) null);
      fieldWriter0.visitAnnotation("O8", false);
      ByteVector byteVector0 = classWriter0.pool;
      fieldWriter0.put(byteVector0);
  }

  /**
  //Test case number: 12
  /*Coverage entropy=0.4659992569610426
  */
  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(953);
      classWriter0.index = 0;
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 0, "O8", "", "O8", "O8");
      ByteVector byteVector0 = classWriter0.pool;
      fieldWriter0.put(byteVector0);
  }

  /**
  //Test case number: 13
  /*Coverage entropy=0.4361623253853443
  */
  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(958);
      String[] stringArray0 = new String[1];
      stringArray0[0] = "O8";
      classWriter0.visit(50, 50, "K#fa'T}Gl(X;x", "O8", "O8", stringArray0);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, (byte) (-82), "The array of suffixes must not be null", "O8", "wheel.asm.MethodWriter", (Object) null);
      ByteVector byteVector0 = classWriter0.pool;
      fieldWriter0.put(byteVector0);
  }

  /**
  //Test case number: 14
  /*Coverage entropy=0.8239592165010823
  */
  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(953);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, (-224), "org.apache.commons.io.filefilter.FileFileFilter", "", (String) null, (Object) null);
      fieldWriter0.visitAnnotation("O1| a&YbDD", false);
      int int0 = fieldWriter0.getSize();
      assertEquals(32, int0);
  }

  /**
  //Test case number: 15
  /*Coverage entropy=0.8599672810355049
  */
  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(953);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 0, "O8", "", "O8", "O8");
      fieldWriter0.visitAnnotation("x!|VK3#k&ddT", true);
      int int0 = fieldWriter0.getSize();
      assertEquals(36, int0);
  }

  /**
  //Test case number: 16
  /*Coverage entropy=0.5859526183035508
  */
  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(958);
      String[] stringArray0 = new String[1];
      stringArray0[0] = "O8";
      classWriter0.visit(50, 50, "K#fa'T}Gl(X;x", "O8", "O8", stringArray0);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, (byte) (-82), "The array of suffixes must not be null", "O8", "wheel.asm.MethodWriter", (Object) null);
      int int0 = fieldWriter0.getSize();
      assertEquals(22, int0);
  }

  /**
  //Test case number: 17
  /*Coverage entropy=0.6128694524619496
  */
  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(953);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 63485, "O8", "", "O8", "O8");
      fieldWriter0.visitAnnotation("x!|VK3#k&ddT", true);
      ByteVector byteVector0 = classWriter0.pool;
      fieldWriter0.put(byteVector0);
  }

  /**
  //Test case number: 18
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(1);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 2949, "8K?-", ":VGFU)%jS`|@:~mW<", ":VGFU)%jS`|@:~mW<", ":VGFU)%jS`|@:~mW<");
      Enumeration<SequenceInputStream> enumeration0 = (Enumeration<SequenceInputStream>) mock(Enumeration.class, new ViolatedAssumptionAnswer());
      doReturn(false).when(enumeration0).hasMoreElements();
      SequenceInputStream sequenceInputStream0 = new SequenceInputStream(enumeration0);
      FieldWriter fieldWriter1 = null;
      try {
        fieldWriter1 = new FieldWriter(classWriter0, 341, "A7P+:Q/'V,Wg4", "A7P+:Q/'V,Wg4", "<init>", sequenceInputStream0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // value java.io.SequenceInputStream@7dbd3e20
         //
         verifyException("wheel.asm.ClassWriter", e);
      }
  }

  /**
  //Test case number: 19
  /*Coverage entropy=0.5623351446188083
  */
  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(5679);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 642, "of)xo*", "g)_Yx/_KT", "X", "g)_Yx/_KT");
      fieldWriter0.visitEnd();
  }

  /**
  //Test case number: 20
  /*Coverage entropy=0.8239592165010823
  */
  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(441);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 441, "N}o.<G8IO,,S#lU9s2Q", "N}o.<G8IO,,S#lU9s2Q", "N}o.<G8IO,,S#lU9s2Q", "N}o.<G8IO,,S#lU9s2Q");
      Attribute attribute0 = new Attribute("N}o.<G8IO,,S#lU9s2Q");
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
