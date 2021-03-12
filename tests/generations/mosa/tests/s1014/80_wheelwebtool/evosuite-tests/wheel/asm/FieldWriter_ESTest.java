/*
 * This file was automatically generated by EvoSuite
 * Sat Nov 07 04:32:24 GMT 2020
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
      ClassWriter classWriter0 = new ClassWriter((-91));
      String[] stringArray0 = new String[3];
      stringArray0[0] = "";
      stringArray0[1] = "";
      stringArray0[2] = "";
      classWriter0.visit(49, (-91), "", "", "", stringArray0);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, (-91), "", "", "", "");
      ByteVector byteVector0 = new ByteVector();
      fieldWriter0.put(byteVector0);
  }

  /**
  //Test case number: 1
  /*Coverage entropy=0.4659992569610426
  */
  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-43));
      classWriter0.index = (-43);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 1, "bolean", "bolean", "bolean", "bolean");
      ByteVector byteVector0 = classWriter0.pool;
      fieldWriter0.put(byteVector0);
  }

  /**
  //Test case number: 2
  /*Coverage entropy=0.5859526183035508
  */
  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-1852));
      String[] stringArray0 = new String[3];
      stringArray0[0] = "";
      stringArray0[1] = "";
      stringArray0[2] = "";
      classWriter0.visit(49, (-1852), "", "", "", stringArray0);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, (-1852), "", "", "", "");
      int int0 = fieldWriter0.getSize();
      assertEquals(30, int0);
  }

  /**
  //Test case number: 3
  /*Coverage entropy=0.5859526183035508
  */
  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-1852));
      classWriter0.index = (-1852);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, (-1852), "", "", "The array of prefixes must not be null", "The array of prefixes must not be null");
      int int0 = fieldWriter0.getSize();
      assertEquals(36, int0);
  }

  /**
  //Test case number: 4
  /*Coverage entropy=0.5623351446188083
  */
  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-1923));
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 1, "3xL#kIA<", "3xL#kIA<", (String) null, (Object) null);
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
      ClassWriter classWriter0 = new ClassWriter((-1927));
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 1, "bolean", "bolean", "bolean", "bolean");
      ByteVector byteVector0 = classWriter0.pool;
      byteVector0.length = (-1927);
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
      FieldWriter fieldWriter0 = null;
      try {
        fieldWriter0 = new FieldWriter((ClassWriter) null, 8, "LODT", "LODT", "LODT", "LODT");
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
  /*Coverage entropy=0.5004024235381879
  */
  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-1904));
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 1, "", "", "", "");
      FieldWriter fieldWriter1 = null;
      try {
        fieldWriter1 = new FieldWriter(classWriter0, 1, "", "", "", fieldWriter0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // value wheel.asm.FieldWriter@8
         //
         verifyException("wheel.asm.ClassWriter", e);
      }
  }

  /**
  //Test case number: 8
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(1207);
      ByteVector byteVector0 = classWriter0.pool;
      byteVector0.length = 63643;
      Object object0 = new Object();
      FieldWriter fieldWriter0 = null;
      try {
        fieldWriter0 = new FieldWriter(classWriter0, 1, "DpF_7g_IuxsLsS2", "3G|Pn-(4-AZF3w^vdN", "p~NT[Y7g<", object0);
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
      ClassWriter classWriter0 = new ClassWriter((-1919));
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 1, "`(j", "`(j", "<Kmr<Uc", (Object) null);
      fieldWriter0.visitEnd();
  }

  /**
  //Test case number: 10
  /*Coverage entropy=0.6330395116644678
  */
  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-1919));
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 1, "", "", "", "");
      Attribute attribute0 = new Attribute("@OqFG';");
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
  /*Coverage entropy=0.6546695645285008
  */
  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(1088);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 1, "eEoH$%YA~B0kpc", "eEoH$%YA~B0kpc", "eEoH$%YA~B0kpc", "eEoH$%YA~B0kpc");
      fieldWriter0.visitAnnotation("eEoH$%YA~B0kpc", false);
      ByteVector byteVector0 = classWriter0.pool;
      fieldWriter0.put(byteVector0);
  }

  /**
  //Test case number: 12
  /*Coverage entropy=0.6546695645285008
  */
  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(131061);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 1, ")", ")", ")", ")");
      fieldWriter0.visitAnnotation(")", true);
      ByteVector byteVector0 = new ByteVector();
      fieldWriter0.put(byteVector0);
  }

  /**
  //Test case number: 13
  /*Coverage entropy=0.4361623253853443
  */
  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-1852));
      String[] stringArray0 = new String[3];
      stringArray0[0] = "/QU\"";
      stringArray0[1] = "/QU\"";
      stringArray0[2] = "The array of prefixes must not be null";
      classWriter0.visit((-1852), (-1852), "/QU\"", "/QU\"", "The array of prefixes must not be null", stringArray0);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, (-1852), "/QU\"", "/QU\"", "The array of prefixes must not be null", "The array of prefixes must not be null");
      ByteVector byteVector0 = new ByteVector();
      fieldWriter0.put(byteVector0);
  }

  /**
  //Test case number: 14
  /*Coverage entropy=0.4361623253853443
  */
  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-1904));
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, (-1904), "", "", "", "");
      ByteVector byteVector0 = classWriter0.pool;
      fieldWriter0.put(byteVector0);
  }

  /**
  //Test case number: 15
  /*Coverage entropy=0.4659992569610426
  */
  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-1919));
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 1, "", "", (String) null, (Object) null);
      ByteVector byteVector0 = new ByteVector(1);
      fieldWriter0.put(byteVector0);
  }

  /**
  //Test case number: 16
  /*Coverage entropy=0.8239592165010823
  */
  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(131061);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 1, "A6", "A6", "A6", "A6");
      Attribute attribute0 = new Attribute("pq:z#-D(");
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
  //Test case number: 17
  /*Coverage entropy=0.5859526183035508
  */
  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-1876));
      classWriter0.visit((-1876), 1, "", (String) null, "", (String[]) null);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, (-1876), "", "", "", "");
      int int0 = fieldWriter0.getSize();
      assertEquals(30, int0);
  }

  /**
  //Test case number: 18
  /*Coverage entropy=0.6108643020548935
  */
  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-1919));
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 1, "", "", (String) null, (Object) null);
      int int0 = fieldWriter0.getSize();
      assertEquals(8, int0);
  }

  /**
  //Test case number: 19
  /*Coverage entropy=0.8599672810355049
  */
  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(63359);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 1, "*", "*", "*", "*");
      fieldWriter0.visitAnnotation("*", true);
      int int0 = fieldWriter0.getSize();
      assertEquals(36, int0);
  }

  /**
  //Test case number: 20
  /*Coverage entropy=0.8599672810355049
  */
  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(63359);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 1, "zI]!yAc%m@Euc6", "zI]!yAc%m@Euc6", "zI]!yAc%m@Euc6", "zI]!yAc%m@Euc6");
      fieldWriter0.visitAnnotation("zI]!yAc%m@Euc6", false);
      int int0 = fieldWriter0.getSize();
      assertEquals(36, int0);
  }

  /**
  //Test case number: 21
  /*Coverage entropy=0.5623351446188083
  */
  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-1904));
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, (-1904), "", "", "", "");
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
}
