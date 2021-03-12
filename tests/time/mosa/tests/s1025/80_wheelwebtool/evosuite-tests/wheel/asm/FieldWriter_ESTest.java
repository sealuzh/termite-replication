/*
 * This file was automatically generated by EvoSuite
 * Sat Nov 28 07:50:28 GMT 2020
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
      ClassWriter classWriter0 = new ClassWriter((-1045));
      classWriter0.index = (-1045);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 2, "Cp8;MJ'*}a^t&`K!x&", "+js~F@Kl", "W}V!,Xvx[M%,-w", "+js~F@Kl");
      ByteVector byteVector0 = classWriter0.pool;
      fieldWriter0.put(byteVector0);
  }

  /**
  //Test case number: 1
  /*Coverage entropy=0.5859526183035508
  */
  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(1189);
      classWriter0.visit((-1799), (-1799), "ConstantValue", "", "f\"`If02rO?,", (String[]) null);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, (-1799), "f\"`If02rO?,", "f\"`If02rO?,", "f\"`If02rO?,", "f\"`If02rO?,");
      int int0 = fieldWriter0.getSize();
      assertEquals(30, int0);
  }

  /**
  //Test case number: 2
  /*Coverage entropy=0.6108643020548935
  */
  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-990));
      classWriter0.index = (-990);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 2, "x", "x", "x", "x");
      int int0 = fieldWriter0.getSize();
      assertEquals(24, int0);
  }

  /**
  //Test case number: 3
  /*Coverage entropy=0.5623351446188083
  */
  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(1143);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 1, "Deprecated", "Deprecated", "Deprecated", "Deprecated");
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
  //Test case number: 4
  /*Coverage entropy=0.5623351446188083
  */
  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-1011));
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 2, "v[8C", "v[8C", "v[8C", "v[8C");
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
      ClassWriter classWriter0 = new ClassWriter(1178);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 1, "/.]<>df8Pi+R!", "/.]<>df8Pi+R!", (String) null, (Object) null);
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
      ClassWriter classWriter0 = new ClassWriter(3470);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 3470, "cf\"`If02rO?,", "cf\"`If02rO?,", "cf\"`If02rO?,", "cf\"`If02rO?,");
      ByteVector byteVector0 = new ByteVector();
      byteVector0.length = 3470;
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
      ClassWriter classWriter0 = new ClassWriter(1216);
      FieldWriter fieldWriter0 = null;
      try {
        fieldWriter0 = new FieldWriter(classWriter0, 1, (String) null, (String) null, (String) null, (Object) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  /**
  //Test case number: 8
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(2248);
      FieldWriter fieldWriter0 = null;
      try {
        fieldWriter0 = new FieldWriter(classWriter0, 2, "Deprecated", "Deprecated", "Deprecated", classWriter0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // value wheel.asm.ClassWriter@5
         //
         verifyException("wheel.asm.ClassWriter", e);
      }
  }

  /**
  //Test case number: 9
  /*Coverage entropy=0.4361623253853443
  */
  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(1216);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, (-502), "A #QY/?;42", "A #QY/?;42", "A #QY/?;42", "A #QY/?;42");
      classWriter0.version = 1216;
      ByteVector byteVector0 = new ByteVector();
      fieldWriter0.put(byteVector0);
  }

  /**
  //Test case number: 10
  /*Coverage entropy=0.4361623253853443
  */
  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(1210);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, (-502), "A #QY/?;42", "A #QY/?;42", "A #QY/?;42", "A #QY/?;42");
      ByteVector byteVector0 = new ByteVector();
      fieldWriter0.put(byteVector0);
  }

  /**
  //Test case number: 11
  /*Coverage entropy=0.4361623253853443
  */
  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-787));
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, (-787), "lXCq,B_ix+PVBB$tn14", "lXCq,B_ix+PVBB$tn14", "lXCq,B_ix+PVBB$tn14", (Object) null);
      ByteVector byteVector0 = new ByteVector();
      fieldWriter0.put(byteVector0);
  }

  /**
  //Test case number: 12
  /*Coverage entropy=0.8239592165010823
  */
  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(1189);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 1189, "cf\"`f02rO?,", "cf\"`f02rO?,", "cf\"`f02rO?,", "cf\"`f02rO?,");
      Attribute attribute0 = new Attribute("cf\"`f02rO?,");
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
      ClassWriter classWriter0 = new ClassWriter(1189);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 1189, "cf\"`If02rO?,", "cf\"`If02rO?,", "cf\"`If02rO?,", "cf\"`If02rO?,");
      fieldWriter0.visitAnnotation("cf\"`If02rO?,", false);
      int int0 = fieldWriter0.getSize();
      assertEquals(36, int0);
  }

  /**
  //Test case number: 14
  /*Coverage entropy=0.8599672810355049
  */
  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(1161);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 1161, "lrCq,_x31VBBV14", "lrCq,_x31VBBV14", "lrCq,_x31VBBV14", "lrCq,_x31VBBV14");
      fieldWriter0.visitAnnotation("lrCq,_x31VBBV14", true);
      int int0 = fieldWriter0.getSize();
      assertEquals(36, int0);
  }

  /**
  //Test case number: 15
  /*Coverage entropy=0.5859526183035508
  */
  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(1210);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, (-502), "A #QY/?;42", "A #QY/?;42", "A #QY/?;42", "A #QY/?;42");
      classWriter0.version = 49;
      int int0 = fieldWriter0.getSize();
      assertEquals(30, int0);
  }

  /**
  //Test case number: 16
  /*Coverage entropy=0.5859526183035508
  */
  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(1210);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, (-502), "A #QY/?;42", "A #QY/?;42", "A #QY/?;42", "A #QY/?;42");
      int int0 = fieldWriter0.getSize();
      assertEquals(36, int0);
  }

  /**
  //Test case number: 17
  /*Coverage entropy=0.6108643020548935
  */
  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(1178);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 1, "/.]<>df8Pi+R!", "/.]<>df8Pi+R!", (String) null, (Object) null);
      int int0 = fieldWriter0.getSize();
      assertEquals(8, int0);
  }

  /**
  //Test case number: 18
  /*Coverage entropy=0.6128694524619496
  */
  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-787));
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, (-787), "A #QY/?;42", "A #QY/?;42", "A #QY/?;42", "A #QY/?;42");
      fieldWriter0.visitAnnotation("A #QY/?;42", true);
      ByteVector byteVector0 = new ByteVector();
      fieldWriter0.put(byteVector0);
  }

  /**
  //Test case number: 19
  /*Coverage entropy=0.6546695645285008
  */
  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(1175);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 1, "lXCq,_ix+PVBB$14", "lXCq,_ix+PVBB$14", "lXCq,_ix+PVBB$14", "lXCq,_ix+PVBB$14");
      fieldWriter0.visitAnnotation("lXCq,_ix+PVBB$14", false);
      ByteVector byteVector0 = new ByteVector();
      fieldWriter0.put(byteVector0);
  }

  /**
  //Test case number: 20
  /*Coverage entropy=0.4659992569610426
  */
  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(1193);
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 1, "/.]<>df8Pi+R!", "/.]<>df8Pi+R!", (String) null, (Object) null);
      ByteVector byteVector0 = new ByteVector();
      fieldWriter0.put(byteVector0);
  }

  /**
  //Test case number: 21
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-806));
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, (-806), "A #QY/?;42", "A #QY/?;42", "A #QY/?;42", "A #QY/?;42");
      FieldWriter fieldWriter1 = new FieldWriter(classWriter0, 1, "kUi|*b", "A #QY/?;42", "kUi|*b", "kUi|*b");
      assertFalse(fieldWriter1.equals((Object)fieldWriter0));
  }

  /**
  //Test case number: 22
  /*Coverage entropy=0.5623351446188083
  */
  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-2));
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 2, "RuntimeInvisibleAnno)atio.s", "RuntimeInvisibleAnno)atio.s", "RuntimeInvisibleAnno)atio.s", "RuntimeInvisibleAnno)atio.s");
      fieldWriter0.visitEnd();
  }

  /**
  //Test case number: 23
  /*Coverage entropy=0.6330395116644678
  */
  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-1013));
      FieldWriter fieldWriter0 = new FieldWriter(classWriter0, 2, "9fU!", "9fU!", "9fU!", "9fU!");
      Attribute attribute0 = new Attribute("9fU!");
      fieldWriter0.visitAttribute(attribute0);
      ByteVector byteVector0 = new ByteVector(2);
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
