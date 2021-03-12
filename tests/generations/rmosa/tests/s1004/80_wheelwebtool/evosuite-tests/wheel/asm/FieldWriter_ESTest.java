/*
 * This file was automatically generated by EvoSuite
 * Sun Nov 08 07:25:00 GMT 2020
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
  /*Coverage entropy=0.4361623253853443
  */
  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-1287));
      classWriter0.visit((-1287), (-2352), "\" :TopsZR", "\" :TopsZR", "\" :TopsZR", (String[]) null);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 4129, "", "", "", "");
      ByteVector byteVector0 = new ByteVector(2);
      fieldWriter0.put(byteVector0);
  }

  /**
  //Test case number: 1
  /*Coverage entropy=0.4361623253853443
  */
  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-1287));
      classWriter0.index = (-655);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, (-1287), "", "", "", "");
      ByteVector byteVector0 = new ByteVector();
      fieldWriter0.put(byteVector0);
  }

  /**
  //Test case number: 2
  /*Coverage entropy=0.5859526183035508
  */
  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-1287));
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, (-1287), "", "", "", "");
      String[] stringArray0 = new String[7];
      stringArray0[0] = "";
      stringArray0[1] = "A}z";
      stringArray0[2] = "";
      stringArray0[3] = "";
      stringArray0[4] = "";
      stringArray0[5] = "";
      stringArray0[6] = "";
      classWriter0.visit(49, (-3092), "", "A}z", "uxBf ", stringArray0);
      int int0 = fieldWriter0.getSize();
      assertEquals(30, int0);
  }

  /**
  //Test case number: 3
  /*Coverage entropy=0.5859526183035508
  */
  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-1287));
      classWriter0.index = (-655);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, (-1287), "", "", "", "");
      int int0 = fieldWriter0.getSize();
      assertEquals(36, int0);
  }

  /**
  //Test case number: 4
  /*Coverage entropy=0.5623351446188083
  */
  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-1287));
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 1, "\" :TopsZR", "\" :TopsZR", "\" :TopsZR", (Object) null);
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
      ClassWriter classWriter0 = new ClassWriter((-1287));
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 1, "\" :TopsZR", "\" :TopsZR", "\" :TopsZR", (Object) null);
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
  //Test case number: 6
  /*Coverage entropy=0.5623351446188083
  */
  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-1287));
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 1, "\" :TopsZR", "\" :TopsZR", "\" :TopsZR", (Object) null);
      ByteVector byteVector0 = new ByteVector();
      byte[] byteArray0 = new byte[0];
      byteVector0.data = byteArray0;
      byteVector0.length = 1;
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
  //Test case number: 7
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(64249);
      FieldWriter fieldWriter0 = null;
      try {
        fieldWriter0 = new FieldWriter(classWriter0, 2, "?TS.sbx", "?TS.sbx", "?TS.sbx", classWriter0);
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
  /*Coverage entropy=0.6330395116644678
  */
  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-1287));
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 1, "\" :TopsZR", "\" :TopsZR", "\" :TopsZR", (Object) null);
      ByteVector byteVector0 = new ByteVector();
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
  //Test case number: 9
  /*Coverage entropy=0.6546695645285008
  */
  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-1287));
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 1, "\" :TopsZR", "\" :TopsZR", "\" :TopsZR", (Object) null);
      ByteVector byteVector0 = new ByteVector();
      fieldWriter0.visitAnnotation("\" :TopsZR", false);
      fieldWriter0.put(byteVector0);
  }

  /**
  //Test case number: 10
  /*Coverage entropy=0.4361623253853443
  */
  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-1287));
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, (-1287), "", "", "", "");
      ByteVector byteVector0 = new ByteVector();
      String[] stringArray0 = new String[7];
      stringArray0[0] = "";
      stringArray0[1] = "A}z";
      stringArray0[2] = "";
      stringArray0[3] = "";
      stringArray0[4] = "";
      stringArray0[5] = "";
      stringArray0[6] = "";
      classWriter0.visit(49, (-3092), "", "A}z", "uxBf ", stringArray0);
      fieldWriter0.put(byteVector0);
  }

  /**
  //Test case number: 11
  /*Coverage entropy=0.8239592165010823
  */
  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-1287));
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, (-1287), "", "", "", "");
      fieldWriter0.visitAnnotation("", false);
      int int0 = fieldWriter0.getSize();
      assertEquals(48, int0);
  }

  /**
  //Test case number: 12
  /*Coverage entropy=0.8599672810355049
  */
  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-1287));
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 1, "\" :TopsZR", "\" :TopsZR", "\" :TopsZR", (Object) null);
      fieldWriter0.visitAnnotation("jtqZSNW; iC(*", true);
      int int0 = fieldWriter0.getSize();
      assertEquals(28, int0);
  }

  /**
  //Test case number: 13
  /*Coverage entropy=0.6108643020548935
  */
  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-1287));
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 1229, "", "Synthetic", (String) null, (Object) null);
      int int0 = fieldWriter0.getSize();
      assertEquals(8, int0);
  }

  /**
  //Test case number: 14
  /*Coverage entropy=0.5859526183035508
  */
  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-1287));
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, (-1998), "", "", "0", (Object) null);
      classWriter0.visit((-1998), 1269, "^", "", "", (String[]) null);
      int int0 = fieldWriter0.getSize();
      assertEquals(22, int0);
  }

  /**
  //Test case number: 15
  /*Coverage entropy=0.6546695645285008
  */
  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-1287));
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 1, "\" :TopsZR", "\" :TopsZR", "\" :TopsZR", (Object) null);
      fieldWriter0.visitAnnotation("\" :TopsZR", true);
      ByteVector byteVector0 = new ByteVector();
      fieldWriter0.put(byteVector0);
  }

  /**
  //Test case number: 16
  /*Coverage entropy=0.4659992569610426
  */
  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(826);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 167, "", "", (String) null, "");
      ByteVector byteVector0 = new ByteVector();
      fieldWriter0.put(byteVector0);
  }

  /**
  //Test case number: 17
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-1287));
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 1, "\" :TopsZR", "\" :TopsZR", "\" :TopsZR", (Object) null);
      FieldWriter fieldWriter1 = null;
      try {
        fieldWriter1 = new FieldWriter(classWriter0, (-666), (String) null, "\" :TopsZR", (String) null, classWriter0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  /**
  //Test case number: 18
  /*Coverage entropy=0.5623351446188083
  */
  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(182);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, (-1287), "\" :TopsZR", "\" :TopsZR", "\" :TopsZR", "\" :TopsZR");
      fieldWriter0.visitEnd();
  }

  /**
  //Test case number: 19
  /*Coverage entropy=0.8239592165010823
  */
  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-1287));
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 1, "\" :TopsZR", "\" :TopsZR", "\" :TopsZR", (Object) null);
      Attribute attribute0 = new Attribute("\" :TopsZR");
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
