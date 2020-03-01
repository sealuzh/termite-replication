/*
 * This file was automatically generated by EvoSuite
 * Fri Dec 06 08:11:46 GMT 2019
 */

package wheel.util;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.Collection;
import java.util.LinkedList;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.mvel.util.FastList;
import wheel.ErrorPage;
import wheel.components.ElExpression;
import wheel.components.StandaloneComponent;
import wheel.util.DynamicSelectModel;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class DynamicSelectModel_ESTest extends DynamicSelectModel_ESTest_scaffolding {

  /**
  //Test case number: 0
  /*Coverage entropy=2.2654436797543704
  */
  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      DynamicSelectModel dynamicSelectModel0 = new DynamicSelectModel();
      DynamicSelectModel dynamicSelectModel1 = dynamicSelectModel0.value("[]");
      DynamicSelectModel dynamicSelectModel2 = dynamicSelectModel0.empty(dynamicSelectModel1);
      DynamicSelectModel dynamicSelectModel3 = dynamicSelectModel2.collection("[]");
      DynamicSelectModel dynamicSelectModel4 = dynamicSelectModel3.translator("[]");
      FastList fastList0 = (FastList)dynamicSelectModel4.translateValue("org.mvel.util.FastList@0000000027");
      assertTrue(fastList0.isEmpty());
  }

  /**
  //Test case number: 1
  /*Coverage entropy=2.0831221229604164
  */
  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      DynamicSelectModel dynamicSelectModel0 = new DynamicSelectModel();
      DynamicSelectModel dynamicSelectModel1 = dynamicSelectModel0.value("[]");
      DynamicSelectModel dynamicSelectModel2 = dynamicSelectModel0.empty(dynamicSelectModel1);
      dynamicSelectModel2.collection("[]");
      DynamicSelectModel dynamicSelectModel3 = dynamicSelectModel1.value("[]");
      Object object0 = dynamicSelectModel3.translateValue("org.mvel.util.FastList@0000000027");
      assertSame(dynamicSelectModel1, object0);
  }

  /**
  //Test case number: 2
  /*Coverage entropy=2.5633125094217712
  */
  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      DynamicSelectModel dynamicSelectModel0 = new DynamicSelectModel();
      DynamicSelectModel dynamicSelectModel1 = dynamicSelectModel0.collection("[]");
      DynamicSelectModel dynamicSelectModel2 = dynamicSelectModel1.value("[]");
      dynamicSelectModel1.reset();
      Object object0 = new Object();
      dynamicSelectModel2.empty(object0);
      DynamicSelectModel dynamicSelectModel3 = dynamicSelectModel1.collection("[]");
      ErrorPage errorPage0 = new ErrorPage();
      dynamicSelectModel0.setTopLevelComponent(errorPage0);
      DynamicSelectModel dynamicSelectModel4 = dynamicSelectModel3.value("[]");
      dynamicSelectModel4.translateValue("org.mvel.util.FastList@0000000027");
      dynamicSelectModel1.getComponent();
      String string0 = dynamicSelectModel0.getValue(0);
      assertNotNull(string0);
  }

  /**
  //Test case number: 3
  /*Coverage entropy=1.847832822658352
  */
  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      DynamicSelectModel dynamicSelectModel0 = new DynamicSelectModel();
      DynamicSelectModel dynamicSelectModel1 = dynamicSelectModel0.collection("[]");
      dynamicSelectModel0.empty("[]");
      dynamicSelectModel1.empty("[]");
      int int0 = dynamicSelectModel1.getOptionCount();
      assertEquals(1, int0);
  }

  /**
  //Test case number: 4
  /*Coverage entropy=1.5531577432135641
  */
  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      DynamicSelectModel dynamicSelectModel0 = new DynamicSelectModel();
      dynamicSelectModel0.collection("[1]");
      // Undeclared exception!
      try { 
        dynamicSelectModel0.translateValue("[1]");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("wheel.util.DynamicSelectModel", e);
      }
  }

  /**
  //Test case number: 5
  /*Coverage entropy=1.8408398156653452
  */
  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      DynamicSelectModel dynamicSelectModel0 = new DynamicSelectModel();
      String string0 = "[]";
      DynamicSelectModel dynamicSelectModel1 = dynamicSelectModel0.collection("[]");
      DynamicSelectModel dynamicSelectModel2 = dynamicSelectModel1.value("[]");
      // Undeclared exception!
      try { 
        dynamicSelectModel2.getValue(0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 0
         //
         verifyException("wheel.util.DynamicSelectModel", e);
      }
  }

  /**
  //Test case number: 6
  /*Coverage entropy=1.543056733112554
  */
  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      DynamicSelectModel dynamicSelectModel0 = new DynamicSelectModel();
      DynamicSelectModel dynamicSelectModel1 = dynamicSelectModel0.empty("[]");
      dynamicSelectModel1.collection("[]");
      Collection collection0 = dynamicSelectModel0.getObjects();
      assertNotNull(collection0);
  }

  /**
  //Test case number: 7
  /*Coverage entropy=1.543056733112554
  */
  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      DynamicSelectModel dynamicSelectModel0 = new DynamicSelectModel();
      DynamicSelectModel dynamicSelectModel1 = dynamicSelectModel0.collection("[]");
      int int0 = dynamicSelectModel1.getOptionCount();
      assertEquals(0, int0);
  }

  /**
  //Test case number: 8
  /*Coverage entropy=1.8408398156653452
  */
  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      DynamicSelectModel dynamicSelectModel0 = new DynamicSelectModel();
      dynamicSelectModel0.label("[]");
      DynamicSelectModel dynamicSelectModel1 = dynamicSelectModel0.collection("[]");
      // Undeclared exception!
      try { 
        dynamicSelectModel1.getLabel(770);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 770
         //
         verifyException("wheel.util.DynamicSelectModel", e);
      }
  }

  /**
  //Test case number: 9
  /*Coverage entropy=1.1476926351053998
  */
  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      DynamicSelectModel dynamicSelectModel0 = new DynamicSelectModel();
      DynamicSelectModel dynamicSelectModel1 = dynamicSelectModel0.collection("[]");
      dynamicSelectModel1.translateValue((String) null);
      Collection collection0 = dynamicSelectModel0.getObjects();
      assertNotNull(collection0);
  }

  /**
  //Test case number: 10
  /*Coverage entropy=1.1217186091313738
  */
  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      DynamicSelectModel dynamicSelectModel0 = new DynamicSelectModel();
      DynamicSelectModel dynamicSelectModel1 = dynamicSelectModel0.collection("[]");
      Collection collection0 = dynamicSelectModel1.getObjects();
      assertNotNull(collection0);
  }

  /**
  //Test case number: 11
  /*Coverage entropy=1.543056733112554
  */
  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      DynamicSelectModel dynamicSelectModel0 = new DynamicSelectModel();
      String string0 = ":gn\\,THfwt[";
      DynamicSelectModel dynamicSelectModel1 = dynamicSelectModel0.enumeration(":gn,THfwt[");
      // Undeclared exception!
      try { 
        dynamicSelectModel1.getValue(46);
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
      }
  }

  /**
  //Test case number: 12
  /*Coverage entropy=1.5531577432135641
  */
  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      DynamicSelectModel dynamicSelectModel0 = new DynamicSelectModel();
      DynamicSelectModel dynamicSelectModel1 = dynamicSelectModel0.enumeration(";lV~S:4G.Fu;");
      DynamicSelectModel dynamicSelectModel2 = dynamicSelectModel1.enumeration("?d");
      // Undeclared exception!
      try { 
        dynamicSelectModel2.getValue(0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // java.lang.Integer cannot be cast to java.lang.Boolean
         //
         verifyException("org.mvel.MVELInterpretedRuntime", e);
      }
  }

  /**
  //Test case number: 13
  /*Coverage entropy=1.543056733112554
  */
  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      DynamicSelectModel dynamicSelectModel0 = new DynamicSelectModel();
      DynamicSelectModel dynamicSelectModel1 = dynamicSelectModel0.enumeration(":gn,TH>fwt[");
      // Undeclared exception!
      try { 
        dynamicSelectModel1.getOptionCount();
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
      }
  }

  /**
  //Test case number: 14
  /*Coverage entropy=1.543056733112554
  */
  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      DynamicSelectModel dynamicSelectModel0 = new DynamicSelectModel();
      dynamicSelectModel0.enumeration("Pj][`4");
      // Undeclared exception!
      dynamicSelectModel0.getValue((-8));
  }

  /**
  //Test case number: 15
  /*Coverage entropy=1.1375916250043898
  */
  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      DynamicSelectModel dynamicSelectModel0 = new DynamicSelectModel();
      DynamicSelectModel dynamicSelectModel1 = dynamicSelectModel0.enumeration("?IK7)j]vyt6h0.M;>&u");
      // Undeclared exception!
      try { 
        dynamicSelectModel1.translateValue("");
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // java.lang.Integer cannot be cast to java.lang.Boolean
         //
         verifyException("org.mvel.MVELInterpretedRuntime", e);
      }
  }

  /**
  //Test case number: 16
  /*Coverage entropy=1.543056733112554
  */
  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      DynamicSelectModel dynamicSelectModel0 = new DynamicSelectModel();
      String string0 = "?C]";
      DynamicSelectModel dynamicSelectModel1 = dynamicSelectModel0.enumeration("?C]");
      // Undeclared exception!
      try { 
        dynamicSelectModel1.getOptionCount();
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // java.lang.Integer cannot be cast to java.lang.Boolean
         //
         verifyException("org.mvel.MVELInterpretedRuntime", e);
      }
  }

  /**
  //Test case number: 17
  /*Coverage entropy=1.1375916250043898
  */
  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      DynamicSelectModel dynamicSelectModel0 = new DynamicSelectModel();
      dynamicSelectModel0.enumeration("Xe]");
      // Undeclared exception!
      dynamicSelectModel0.translateValue("Xe]");
  }

  /**
  //Test case number: 18
  /*Coverage entropy=1.5531577432135641
  */
  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      DynamicSelectModel dynamicSelectModel0 = new DynamicSelectModel();
      String string0 = "";
      ErrorPage errorPage0 = new ErrorPage();
      dynamicSelectModel0.setTopLevelComponent(errorPage0);
      dynamicSelectModel0.getTopLevelComponent();
      // Undeclared exception!
      try { 
        dynamicSelectModel0.translateValue("");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("wheel.util.DynamicSelectModel", e);
      }
  }

  /**
  //Test case number: 19
  /*Coverage entropy=1.543056733112554
  */
  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      DynamicSelectModel dynamicSelectModel0 = new DynamicSelectModel();
      dynamicSelectModel0.enumeration("()I");
      // Undeclared exception!
      try { 
        dynamicSelectModel0.getLabel(1);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // java.lang.String cannot be cast to java.lang.Integer
         //
         verifyException("org.mvel.ASTNode", e);
      }
  }

  /**
  //Test case number: 20
  /*Coverage entropy=1.543056733112554
  */
  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      DynamicSelectModel dynamicSelectModel0 = new DynamicSelectModel();
      String string0 = ":gn\\,THfwt[";
      dynamicSelectModel0.enumeration(":gn,THfwt[");
      // Undeclared exception!
      try { 
        dynamicSelectModel0.getLabel((-1));
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
      }
  }

  /**
  //Test case number: 21
  /*Coverage entropy=1.543056733112554
  */
  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      DynamicSelectModel dynamicSelectModel0 = new DynamicSelectModel();
      DynamicSelectModel dynamicSelectModel1 = dynamicSelectModel0.enumeration("kvu[<}T=");
      // Undeclared exception!
      dynamicSelectModel1.getLabel((-1));
  }

  /**
  //Test case number: 22
  /*Coverage entropy=1.543056733112554
  */
  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      DynamicSelectModel dynamicSelectModel0 = new DynamicSelectModel();
      String string0 = "k[&\\u";
      DynamicSelectModel dynamicSelectModel1 = dynamicSelectModel0.collection(string0);
      // Undeclared exception!
      dynamicSelectModel1.getOptionCount();
  }

  /**
  //Test case number: 23
  /*Coverage entropy=1.1217186091313738
  */
  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      DynamicSelectModel dynamicSelectModel0 = new DynamicSelectModel();
      DynamicSelectModel dynamicSelectModel1 = dynamicSelectModel0.collection(">_k135]`W2");
      // Undeclared exception!
      try { 
        dynamicSelectModel1.getObjects();
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
      }
  }

  /**
  //Test case number: 24
  /*Coverage entropy=1.1375916250043898
  */
  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      DynamicSelectModel dynamicSelectModel0 = new DynamicSelectModel();
      DynamicSelectModel dynamicSelectModel1 = dynamicSelectModel0.enumeration(":gn,THfwt[");
      // Undeclared exception!
      try { 
        dynamicSelectModel1.translateValue(":gn,THfwt[");
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
      }
  }

  /**
  //Test case number: 25
  /*Coverage entropy=1.543056733112554
  */
  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      DynamicSelectModel dynamicSelectModel0 = new DynamicSelectModel();
      dynamicSelectModel0.enumeration((String) null);
      // Undeclared exception!
      try { 
        dynamicSelectModel0.getLabel((-4005));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.mvel.PropertyAccessor", e);
      }
  }

  /**
  //Test case number: 26
  /*Coverage entropy=1.1375916250043898
  */
  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      DynamicSelectModel dynamicSelectModel0 = new DynamicSelectModel();
      dynamicSelectModel0.collection("`<:POq!]X&`?Pxk*,R");
      // Undeclared exception!
      try { 
        dynamicSelectModel0.translateValue("`<:POq!]X&`?Pxk*,R");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.mvel.MVELInterpretedRuntime", e);
      }
  }

  /**
  //Test case number: 27
  /*Coverage entropy=1.1217186091313738
  */
  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      DynamicSelectModel dynamicSelectModel0 = new DynamicSelectModel();
      DynamicSelectModel dynamicSelectModel1 = dynamicSelectModel0.collection("38");
      // Undeclared exception!
      try { 
        dynamicSelectModel1.getObjects();
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Expression 38 evaluated to an object that is not an instance of Collection or Object[]. Can't build a dynamic ISelectModel
         //
         verifyException("wheel.util.DynamicSelectModel", e);
      }
  }

  /**
  //Test case number: 28
  /*Coverage entropy=1.543056733112554
  */
  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      DynamicSelectModel dynamicSelectModel0 = new DynamicSelectModel();
      DynamicSelectModel dynamicSelectModel1 = dynamicSelectModel0.label("b");
      dynamicSelectModel1.collection("b");
      // Undeclared exception!
      try { 
        dynamicSelectModel1.validate();
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Could not create DynamicSelection model. Value attribute was null or not an el-expression.
         //
         verifyException("wheel.util.DynamicSelectModel", e);
      }
  }

  /**
  //Test case number: 29
  /*Coverage entropy=1.543056733112554
  */
  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      DynamicSelectModel dynamicSelectModel0 = new DynamicSelectModel();
      DynamicSelectModel dynamicSelectModel1 = dynamicSelectModel0.enumeration("/; 7/.?:LB");
      // Undeclared exception!
      try { 
        dynamicSelectModel1.getValue(0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.lang.Integer", e);
      }
  }

  /**
  //Test case number: 30
  /*Coverage entropy=1.543056733112554
  */
  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      DynamicSelectModel dynamicSelectModel0 = new DynamicSelectModel();
      ErrorPage errorPage0 = new ErrorPage();
      dynamicSelectModel0.setComponent(errorPage0);
      dynamicSelectModel0.getComponent();
      // Undeclared exception!
      try { 
        dynamicSelectModel0.validate();
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Could not create DynamicSelection model. Collection attribute was null or not an el-expression.
         //
         verifyException("wheel.util.DynamicSelectModel", e);
      }
  }

  /**
  //Test case number: 31
  /*Coverage entropy=1.1217186091313738
  */
  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      DynamicSelectModel dynamicSelectModel0 = new DynamicSelectModel();
      DynamicSelectModel dynamicSelectModel1 = dynamicSelectModel0.enumeration("");
      dynamicSelectModel0.validate();
      assertSame(dynamicSelectModel0, dynamicSelectModel1);
  }

  /**
  //Test case number: 32
  /*Coverage entropy=1.1217186091313738
  */
  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      DynamicSelectModel dynamicSelectModel0 = new DynamicSelectModel();
      DynamicSelectModel dynamicSelectModel1 = dynamicSelectModel0.collection("*CJ|>$IcxZyH[");
      // Undeclared exception!
      try { 
        dynamicSelectModel1.getObjects();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.mvel.MVELInterpretedRuntime", e);
      }
  }

  /**
  //Test case number: 33
  /*Coverage entropy=1.1217186091313738
  */
  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      DynamicSelectModel dynamicSelectModel0 = new DynamicSelectModel();
      DynamicSelectModel dynamicSelectModel1 = dynamicSelectModel0.collection("Could not create DynamicSelection model. Value attribute was null or not an el-expression.");
      // Undeclared exception!
      try { 
        dynamicSelectModel1.validate();
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Could not create DynamicSelection model. Label attribute was null or not an el-expression.
         //
         verifyException("wheel.util.DynamicSelectModel", e);
      }
  }

  /**
  //Test case number: 34
  /*Coverage entropy=1.543056733112554
  */
  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      DynamicSelectModel dynamicSelectModel0 = new DynamicSelectModel();
      DynamicSelectModel dynamicSelectModel1 = dynamicSelectModel0.collection(".<init>>: : ");
      Collection collection0 = new LinkedList<Integer>();
      // Undeclared exception!
      try { 
        dynamicSelectModel1.getOptionCount();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.mvel.MVELInterpretedRuntime", e);
      }
  }

  /**
  //Test case number: 35
  /*Coverage entropy=1.1217186091313738
  */
  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      DynamicSelectModel dynamicSelectModel0 = new DynamicSelectModel();
      DynamicSelectModel dynamicSelectModel1 = dynamicSelectModel0.collection("UT]?BH0O^7JxMAp.#Y");
      // Undeclared exception!
      dynamicSelectModel1.getObjects();
  }

  /**
  //Test case number: 36
  /*Coverage entropy=1.0931471805599453
  */
  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      DynamicSelectModel dynamicSelectModel0 = new DynamicSelectModel();
      StandaloneComponent standaloneComponent0 = dynamicSelectModel0.getTopLevelComponent();
      assertNull(standaloneComponent0);
  }

  /**
  //Test case number: 37
  /*Coverage entropy=1.543056733112554
  */
  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      DynamicSelectModel dynamicSelectModel0 = new DynamicSelectModel();
      DynamicSelectModel dynamicSelectModel1 = dynamicSelectModel0.collection("33");
      // Undeclared exception!
      try { 
        dynamicSelectModel1.getOptionCount();
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Expression 33 evaluated to an object that is not an instance of Collection or Object[]. Can't build a dynamic ISelectModel
         //
         verifyException("wheel.util.DynamicSelectModel", e);
      }
  }

  /**
  //Test case number: 38
  /*Coverage entropy=1.1217186091313738
  */
  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      DynamicSelectModel dynamicSelectModel0 = new DynamicSelectModel();
      // Undeclared exception!
      try { 
        dynamicSelectModel0.getOptionCount();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("wheel.util.DynamicSelectModel", e);
      }
  }

  /**
  //Test case number: 39
  /*Coverage entropy=1.1375916250043898
  */
  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      DynamicSelectModel dynamicSelectModel0 = new DynamicSelectModel();
      DynamicSelectModel dynamicSelectModel1 = dynamicSelectModel0.collection("Could not create DynamicSelection model. Value attribute was null or not an el-expression.");
      // Undeclared exception!
      try { 
        dynamicSelectModel1.translateValue("Could not create DynamicSelection model. Value attribute was null or not an el-expression.");
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Could not evaluate expression Could not create DynamicSelection model. Value attribute was null or not an el-expression. to create a dynamic ISelectModel.
         //
         verifyException("wheel.components.ElExpression", e);
      }
  }

  /**
  //Test case number: 40
  /*Coverage entropy=1.1217186091313738
  */
  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      DynamicSelectModel dynamicSelectModel0 = new DynamicSelectModel();
      dynamicSelectModel0.collection("()I");
      // Undeclared exception!
      try { 
        dynamicSelectModel0.getObjects();
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // java.lang.String cannot be cast to java.lang.Integer
         //
         verifyException("org.mvel.ASTNode", e);
      }
  }

  /**
  //Test case number: 41
  /*Coverage entropy=1.543056733112554
  */
  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      DynamicSelectModel dynamicSelectModel0 = new DynamicSelectModel();
      dynamicSelectModel0.enumeration("F16%5g0eJmzmO[fZ");
      // Undeclared exception!
      try { 
        dynamicSelectModel0.getValue((-59));
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Could not evaluate expression F16%5g0eJmzmO[fZ.values() to create a dynamic ISelectModel.
         //
         verifyException("wheel.components.ElExpression", e);
      }
  }

  /**
  //Test case number: 42
  /*Coverage entropy=1.0931471805599453
  */
  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      DynamicSelectModel dynamicSelectModel0 = new DynamicSelectModel();
      // Undeclared exception!
      try { 
        dynamicSelectModel0.getValue((-4732));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("wheel.util.DynamicSelectModel", e);
      }
  }

  /**
  //Test case number: 43
  /*Coverage entropy=1.1217186091313738
  */
  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      DynamicSelectModel dynamicSelectModel0 = new DynamicSelectModel();
      DynamicSelectModel dynamicSelectModel1 = dynamicSelectModel0.collection("");
      // Undeclared exception!
      try { 
        dynamicSelectModel1.getObjects();
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Expression  evaluated to null. Can't build a dynamic ISelectModel
         //
         verifyException("wheel.util.DynamicSelectModel", e);
      }
  }

  /**
  //Test case number: 44
  /*Coverage entropy=0.4
  */
  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      DynamicSelectModel dynamicSelectModel0 = new DynamicSelectModel();
      // Undeclared exception!
      try { 
        dynamicSelectModel0.getObjects();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("wheel.util.DynamicSelectModel", e);
      }
  }

  /**
  //Test case number: 45
  /*Coverage entropy=1.543056733112554
  */
  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      DynamicSelectModel dynamicSelectModel0 = new DynamicSelectModel();
      DynamicSelectModel dynamicSelectModel1 = dynamicSelectModel0.enumeration(" to create a value for dynamic ISelectModel. Index was ");
      // Undeclared exception!
      try { 
        dynamicSelectModel1.getLabel(423);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Could not evaluate expression  to create a value for dynamic ISelectModel. Index was .values() to create a dynamic ISelectModel.
         //
         verifyException("wheel.components.ElExpression", e);
      }
  }

  /**
  //Test case number: 46
  /*Coverage entropy=1.0931471805599453
  */
  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      DynamicSelectModel dynamicSelectModel0 = new DynamicSelectModel();
      // Undeclared exception!
      try { 
        dynamicSelectModel0.getLabel(1);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("wheel.util.DynamicSelectModel", e);
      }
  }

  /**
  //Test case number: 47
  /*Coverage entropy=0.4
  */
  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      DynamicSelectModel dynamicSelectModel0 = null;
      try {
        dynamicSelectModel0 = new DynamicSelectModel((ElExpression) null, (ElExpression) null, (ElExpression) null);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Could not create DynamicSelection model. Collection attribute was null or not an el-expression.
         //
         verifyException("wheel.util.DynamicSelectModel", e);
      }
  }
}
