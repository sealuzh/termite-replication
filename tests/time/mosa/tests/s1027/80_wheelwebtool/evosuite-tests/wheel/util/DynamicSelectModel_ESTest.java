/*
 * This file was automatically generated by EvoSuite
 * Sat Nov 28 09:29:40 GMT 2020
 */

package wheel.util;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.Collection;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.mvel.util.FastList;
import wheel.ErrorPage;
import wheel.components.Component;
import wheel.components.ElExpression;
import wheel.components.StandaloneComponent;
import wheel.util.DynamicSelectModel;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class DynamicSelectModel_ESTest extends DynamicSelectModel_ESTest_scaffolding {

  /**
  //Test case number: 0
  /*Coverage entropy=1.5810937501718236
  */
  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      DynamicSelectModel dynamicSelectModel0 = new DynamicSelectModel();
      dynamicSelectModel0.collection("[]RH from ");
      DynamicSelectModel dynamicSelectModel1 = dynamicSelectModel0.empty("[]RH from ");
      dynamicSelectModel1.value("[]RH from ");
      String string0 = dynamicSelectModel1.getValue(0);
      assertNotNull(string0);
  }

  /**
  //Test case number: 1
  /*Coverage entropy=1.15374194270109
  */
  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      DynamicSelectModel dynamicSelectModel0 = new DynamicSelectModel();
      DynamicSelectModel dynamicSelectModel1 = dynamicSelectModel0.collection("[]RHfro ");
      int int0 = dynamicSelectModel1.getOptionCount();
      assertEquals(0, int0);
  }

  /**
  //Test case number: 2
  /*Coverage entropy=1.3862943611198906
  */
  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      DynamicSelectModel dynamicSelectModel0 = new DynamicSelectModel();
      DynamicSelectModel dynamicSelectModel1 = dynamicSelectModel0.enumeration("[]RHfro ");
      DynamicSelectModel dynamicSelectModel2 = dynamicSelectModel1.empty("[]RHfro ");
      int int0 = dynamicSelectModel2.getOptionCount();
      assertEquals(1, int0);
  }

  /**
  //Test case number: 3
  /*Coverage entropy=0.8675632284814612
  */
  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      DynamicSelectModel dynamicSelectModel0 = new DynamicSelectModel();
      DynamicSelectModel dynamicSelectModel1 = dynamicSelectModel0.collection("[]RH from ");
      Collection collection0 = dynamicSelectModel1.getObjects();
      assertNotNull(collection0);
  }

  /**
  //Test case number: 4
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      DynamicSelectModel dynamicSelectModel0 = new DynamicSelectModel();
      DynamicSelectModel dynamicSelectModel1 = dynamicSelectModel0.value((String) null);
      assertSame(dynamicSelectModel1, dynamicSelectModel0);
  }

  /**
  //Test case number: 5
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      DynamicSelectModel dynamicSelectModel0 = new DynamicSelectModel();
      DynamicSelectModel dynamicSelectModel1 = dynamicSelectModel0.value("");
      assertSame(dynamicSelectModel1, dynamicSelectModel0);
  }

  /**
  //Test case number: 6
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      DynamicSelectModel dynamicSelectModel0 = new DynamicSelectModel();
      DynamicSelectModel dynamicSelectModel1 = dynamicSelectModel0.translator((String) null);
      assertSame(dynamicSelectModel1, dynamicSelectModel0);
  }

  /**
  //Test case number: 7
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      DynamicSelectModel dynamicSelectModel0 = new DynamicSelectModel();
      DynamicSelectModel dynamicSelectModel1 = dynamicSelectModel0.translator("");
      assertSame(dynamicSelectModel1, dynamicSelectModel0);
  }

  /**
  //Test case number: 8
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      DynamicSelectModel dynamicSelectModel0 = new DynamicSelectModel();
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
  //Test case number: 9
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      DynamicSelectModel dynamicSelectModel0 = new DynamicSelectModel();
      ErrorPage errorPage0 = new ErrorPage();
      dynamicSelectModel0.setTopLevelComponent(errorPage0);
      StandaloneComponent standaloneComponent0 = dynamicSelectModel0.getTopLevelComponent();
      assertFalse(standaloneComponent0._isBuilt());
  }

  /**
  //Test case number: 10
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      DynamicSelectModel dynamicSelectModel0 = new DynamicSelectModel();
      ErrorPage errorPage0 = new ErrorPage();
      dynamicSelectModel0.setComponent(errorPage0);
      Component component0 = dynamicSelectModel0.getComponent();
      assertFalse(component0._isGeneratedId());
  }

  /**
  //Test case number: 11
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      DynamicSelectModel dynamicSelectModel0 = new DynamicSelectModel();
      DynamicSelectModel dynamicSelectModel1 = dynamicSelectModel0.label("2");
      assertSame(dynamicSelectModel1, dynamicSelectModel0);
  }

  /**
  //Test case number: 12
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      DynamicSelectModel dynamicSelectModel0 = new DynamicSelectModel();
      DynamicSelectModel dynamicSelectModel1 = dynamicSelectModel0.label("");
      assertSame(dynamicSelectModel0, dynamicSelectModel1);
  }

  /**
  //Test case number: 13
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      DynamicSelectModel dynamicSelectModel0 = new DynamicSelectModel();
      DynamicSelectModel dynamicSelectModel1 = dynamicSelectModel0.enumeration("");
      assertSame(dynamicSelectModel0, dynamicSelectModel1);
  }

  /**
  //Test case number: 14
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      DynamicSelectModel dynamicSelectModel0 = new DynamicSelectModel();
      DynamicSelectModel dynamicSelectModel1 = dynamicSelectModel0.empty((Object) null);
      assertSame(dynamicSelectModel0, dynamicSelectModel1);
  }

  /**
  //Test case number: 15
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      DynamicSelectModel dynamicSelectModel0 = new DynamicSelectModel();
      DynamicSelectModel dynamicSelectModel1 = dynamicSelectModel0.collection("");
      assertSame(dynamicSelectModel0, dynamicSelectModel1);
  }

  /**
  //Test case number: 16
  /*Coverage entropy=1.3862943611198906
  */
  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      DynamicSelectModel dynamicSelectModel0 = new DynamicSelectModel();
      DynamicSelectModel dynamicSelectModel1 = dynamicSelectModel0.collection("lq[aJr");
      // Undeclared exception!
      dynamicSelectModel1.translateValue("lq[aJr");
  }

  /**
  //Test case number: 17
  /*Coverage entropy=1.3862943611198906
  */
  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      DynamicSelectModel dynamicSelectModel0 = new DynamicSelectModel();
      dynamicSelectModel0.collection("^`_[{!~p&!Z2ja?MSg");
      // Undeclared exception!
      try { 
        dynamicSelectModel0.translateValue("^`_[{!~p&!Z2ja?MSg");
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
      }
  }

  /**
  //Test case number: 18
  /*Coverage entropy=1.3862943611198906
  */
  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      DynamicSelectModel dynamicSelectModel0 = new DynamicSelectModel();
      dynamicSelectModel0.collection("|[q%2Y(6,!]Ru+}y");
      // Undeclared exception!
      try { 
        dynamicSelectModel0.translateValue("|[q%2Y(6,!]Ru+}y");
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // unbalanced braces inside inline collection
         //
         verifyException("org.mvel.util.CollectionParser", e);
      }
  }

  /**
  //Test case number: 19
  /*Coverage entropy=1.3862943611198906
  */
  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      DynamicSelectModel dynamicSelectModel0 = new DynamicSelectModel();
      dynamicSelectModel0.collection("=>eAc(su");
      // Undeclared exception!
      try { 
        dynamicSelectModel0.translateValue("=>eAc(su");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.mvel.MVELInterpretedRuntime", e);
      }
  }

  /**
  //Test case number: 20
  /*Coverage entropy=1.3862943611198906
  */
  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      DynamicSelectModel dynamicSelectModel0 = new DynamicSelectModel();
      dynamicSelectModel0.collection("{[}");
      // Undeclared exception!
      try { 
        dynamicSelectModel0.translateValue("[Ljava.lang.Object;@0000000029");
        fail("Expecting exception: NegativeArraySizeException");
      
      } catch(NegativeArraySizeException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.mvel.util.CollectionParser", e);
      }
  }

  /**
  //Test case number: 21
  /*Coverage entropy=1.3862943611198906
  */
  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      DynamicSelectModel dynamicSelectModel0 = new DynamicSelectModel();
      dynamicSelectModel0.collection("?");
      // Undeclared exception!
      try { 
        dynamicSelectModel0.translateValue("?");
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // java.lang.Integer cannot be cast to java.lang.Boolean
         //
         verifyException("org.mvel.MVELInterpretedRuntime", e);
      }
  }

  /**
  //Test case number: 22
  /*Coverage entropy=1.3862943611198906
  */
  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      DynamicSelectModel dynamicSelectModel0 = new DynamicSelectModel();
      DynamicSelectModel dynamicSelectModel1 = dynamicSelectModel0.collection("%0%  0mWM#v{_Pt_$");
      // Undeclared exception!
      try { 
        dynamicSelectModel1.translateValue("%0%  0mWM#v{_Pt_$");
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // / by zero
         //
         verifyException("org.mvel.math.IEEEFloatingPointMath", e);
      }
  }

  /**
  //Test case number: 23
  /*Coverage entropy=1.3862943611198906
  */
  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      DynamicSelectModel dynamicSelectModel0 = new DynamicSelectModel();
      DynamicSelectModel dynamicSelectModel1 = dynamicSelectModel0.enumeration("class=\"");
      // Undeclared exception!
      try { 
        dynamicSelectModel1.getValue((-671));
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Could not evaluate expression class=\".values() to create a dynamic ISelectModel.
         //
         verifyException("wheel.components.ElExpression", e);
      }
  }

  /**
  //Test case number: 24
  /*Coverage entropy=1.3862943611198906
  */
  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      DynamicSelectModel dynamicSelectModel0 = new DynamicSelectModel();
      DynamicSelectModel dynamicSelectModel1 = dynamicSelectModel0.enumeration("N]D0!!Oj/5Pu");
      // Undeclared exception!
      dynamicSelectModel1.getValue(0);
  }

  /**
  //Test case number: 25
  /*Coverage entropy=1.3862943611198906
  */
  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      DynamicSelectModel dynamicSelectModel0 = new DynamicSelectModel();
      DynamicSelectModel dynamicSelectModel1 = dynamicSelectModel0.enumeration("&6]}Sd7R2G5");
      // Undeclared exception!
      try { 
        dynamicSelectModel1.getValue(2440);
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
      }
  }

  /**
  //Test case number: 26
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      DynamicSelectModel dynamicSelectModel0 = new DynamicSelectModel();
      // Undeclared exception!
      try { 
        dynamicSelectModel0.getValue(0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("wheel.util.DynamicSelectModel", e);
      }
  }

  /**
  //Test case number: 27
  /*Coverage entropy=1.3862943611198906
  */
  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      DynamicSelectModel dynamicSelectModel0 = new DynamicSelectModel();
      dynamicSelectModel0.enumeration((String) null);
      // Undeclared exception!
      try { 
        dynamicSelectModel0.getValue(127);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.mvel.PropertyAccessor", e);
      }
  }

  /**
  //Test case number: 28
  /*Coverage entropy=1.3862943611198906
  */
  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      DynamicSelectModel dynamicSelectModel0 = new DynamicSelectModel();
      DynamicSelectModel dynamicSelectModel1 = dynamicSelectModel0.enumeration("[]RH? from ");
      // Undeclared exception!
      try { 
        dynamicSelectModel1.getValue((-2111215688));
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // org.mvel.util.FastList cannot be cast to java.lang.Boolean
         //
         verifyException("org.mvel.MVELInterpretedRuntime", e);
      }
  }

  /**
  //Test case number: 29
  /*Coverage entropy=1.15374194270109
  */
  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      DynamicSelectModel dynamicSelectModel0 = new DynamicSelectModel();
      dynamicSelectModel0.enumeration("[] from ");
      // Undeclared exception!
      try { 
        dynamicSelectModel0.getValue(214);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 214
         //
         verifyException("wheel.util.DynamicSelectModel", e);
      }
  }

  /**
  //Test case number: 30
  /*Coverage entropy=1.3862943611198906
  */
  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      DynamicSelectModel dynamicSelectModel0 = new DynamicSelectModel();
      dynamicSelectModel0.enumeration("L");
      // Undeclared exception!
      try { 
        dynamicSelectModel0.getOptionCount();
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Could not evaluate expression L.values() to create a dynamic ISelectModel.
         //
         verifyException("wheel.components.ElExpression", e);
      }
  }

  /**
  //Test case number: 31
  /*Coverage entropy=1.3862943611198906
  */
  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      DynamicSelectModel dynamicSelectModel0 = new DynamicSelectModel();
      DynamicSelectModel dynamicSelectModel1 = dynamicSelectModel0.enumeration("2]RHfro ");
      // Undeclared exception!
      dynamicSelectModel1.getOptionCount();
  }

  /**
  //Test case number: 32
  /*Coverage entropy=1.3862943611198906
  */
  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      DynamicSelectModel dynamicSelectModel0 = new DynamicSelectModel();
      dynamicSelectModel0.collection("&6]}Sd7R2G5");
      // Undeclared exception!
      try { 
        dynamicSelectModel0.getOptionCount();
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
      }
  }

  /**
  //Test case number: 33
  /*Coverage entropy=1.3862943611198906
  */
  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      DynamicSelectModel dynamicSelectModel0 = new DynamicSelectModel();
      DynamicSelectModel dynamicSelectModel1 = dynamicSelectModel0.enumeration((String) null);
      // Undeclared exception!
      try { 
        dynamicSelectModel1.getOptionCount();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.mvel.PropertyAccessor", e);
      }
  }

  /**
  //Test case number: 34
  /*Coverage entropy=1.3862943611198906
  */
  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      DynamicSelectModel dynamicSelectModel0 = new DynamicSelectModel();
      DynamicSelectModel dynamicSelectModel1 = dynamicSelectModel0.collection("?;TCy");
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
  //Test case number: 35
  /*Coverage entropy=1.0397207708399179
  */
  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      DynamicSelectModel dynamicSelectModel0 = new DynamicSelectModel();
      DynamicSelectModel dynamicSelectModel1 = dynamicSelectModel0.collection((String) null);
      // Undeclared exception!
      try { 
        dynamicSelectModel1.getObjects();
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Expression null evaluated to null. Can't build a dynamic ISelectModel
         //
         verifyException("wheel.util.DynamicSelectModel", e);
      }
  }

  /**
  //Test case number: 36
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      DynamicSelectModel dynamicSelectModel0 = new DynamicSelectModel();
      DynamicSelectModel dynamicSelectModel1 = dynamicSelectModel0.enumeration("CHECKCAST [D");
      // Undeclared exception!
      dynamicSelectModel1.getObjects();
  }

  /**
  //Test case number: 37
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      DynamicSelectModel dynamicSelectModel0 = new DynamicSelectModel();
      DynamicSelectModel dynamicSelectModel1 = dynamicSelectModel0.collection("&6]}Sd7R2G5");
      // Undeclared exception!
      try { 
        dynamicSelectModel1.getObjects();
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
      }
  }

  /**
  //Test case number: 38
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
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
  //Test case number: 39
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      DynamicSelectModel dynamicSelectModel0 = new DynamicSelectModel();
      DynamicSelectModel dynamicSelectModel1 = dynamicSelectModel0.enumeration((String) null);
      // Undeclared exception!
      try { 
        dynamicSelectModel1.getObjects();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.mvel.PropertyAccessor", e);
      }
  }

  /**
  //Test case number: 40
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      DynamicSelectModel dynamicSelectModel0 = new DynamicSelectModel();
      dynamicSelectModel0.collection("?");
      // Undeclared exception!
      try { 
        dynamicSelectModel0.getObjects();
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // java.lang.Integer cannot be cast to java.lang.Boolean
         //
         verifyException("org.mvel.MVELInterpretedRuntime", e);
      }
  }

  /**
  //Test case number: 41
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      DynamicSelectModel dynamicSelectModel0 = new DynamicSelectModel();
      DynamicSelectModel dynamicSelectModel1 = dynamicSelectModel0.collection("%0%  0mWM#v{_Pt_$");
      // Undeclared exception!
      try { 
        dynamicSelectModel1.getObjects();
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // / by zero
         //
         verifyException("org.mvel.math.IEEEFloatingPointMath", e);
      }
  }

  /**
  //Test case number: 42
  /*Coverage entropy=1.3862943611198906
  */
  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      DynamicSelectModel dynamicSelectModel0 = new DynamicSelectModel();
      dynamicSelectModel0.enumeration(" to create a label for dynamic ISelectModel. Index was ");
      // Undeclared exception!
      try { 
        dynamicSelectModel0.getLabel(0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Could not evaluate expression  to create a label for dynamic ISelectModel. Index was .values() to create a dynamic ISelectModel.
         //
         verifyException("wheel.components.ElExpression", e);
      }
  }

  /**
  //Test case number: 43
  /*Coverage entropy=1.3862943611198906
  */
  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      DynamicSelectModel dynamicSelectModel0 = new DynamicSelectModel();
      DynamicSelectModel dynamicSelectModel1 = dynamicSelectModel0.enumeration("Jcn[13*8.oNMs#?SU");
      // Undeclared exception!
      dynamicSelectModel1.getLabel(0);
  }

  /**
  //Test case number: 44
  /*Coverage entropy=1.3862943611198906
  */
  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      DynamicSelectModel dynamicSelectModel0 = new DynamicSelectModel();
      dynamicSelectModel0.enumeration("&6]}Sd7R2G5");
      // Undeclared exception!
      try { 
        dynamicSelectModel0.getLabel(2440);
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
      }
  }

  /**
  //Test case number: 45
  /*Coverage entropy=1.3862943611198906
  */
  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      DynamicSelectModel dynamicSelectModel0 = new DynamicSelectModel();
      DynamicSelectModel dynamicSelectModel1 = dynamicSelectModel0.enumeration((String) null);
      // Undeclared exception!
      try { 
        dynamicSelectModel1.getLabel(651);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.mvel.PropertyAccessor", e);
      }
  }

  /**
  //Test case number: 46
  /*Coverage entropy=1.3862943611198906
  */
  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      DynamicSelectModel dynamicSelectModel0 = new DynamicSelectModel();
      dynamicSelectModel0.enumeration("?DH1=uk(yrFO");
      // Undeclared exception!
      try { 
        dynamicSelectModel0.getLabel(0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // java.lang.Integer cannot be cast to java.lang.Boolean
         //
         verifyException("org.mvel.MVELInterpretedRuntime", e);
      }
  }

  /**
  //Test case number: 47
  /*Coverage entropy=1.15374194270109
  */
  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      DynamicSelectModel dynamicSelectModel0 = new DynamicSelectModel();
      dynamicSelectModel0.enumeration("[] from ");
      // Undeclared exception!
      try { 
        dynamicSelectModel0.getLabel((-2381));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -2381
         //
         verifyException("wheel.util.DynamicSelectModel", e);
      }
  }

  /**
  //Test case number: 48
  /*Coverage entropy=1.242453324894
  */
  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      DynamicSelectModel dynamicSelectModel0 = new DynamicSelectModel();
      DynamicSelectModel dynamicSelectModel1 = dynamicSelectModel0.collection((String) null);
      dynamicSelectModel1.label((String) null);
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
  //Test case number: 49
  /*Coverage entropy=1.0397207708399179
  */
  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      DynamicSelectModel dynamicSelectModel0 = new DynamicSelectModel();
      DynamicSelectModel dynamicSelectModel1 = dynamicSelectModel0.collection((String) null);
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
  //Test case number: 50
  /*Coverage entropy=0.9502705392332347
  */
  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      DynamicSelectModel dynamicSelectModel0 = new DynamicSelectModel();
      DynamicSelectModel dynamicSelectModel1 = dynamicSelectModel0.enumeration("rc`U u^;WK}!XY{BN");
      dynamicSelectModel0.validate();
      assertSame(dynamicSelectModel0, dynamicSelectModel1);
  }

  /**
  //Test case number: 51
  /*Coverage entropy=1.15374194270109
  */
  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      DynamicSelectModel dynamicSelectModel0 = new DynamicSelectModel();
      DynamicSelectModel dynamicSelectModel1 = dynamicSelectModel0.collection("wheel.components.Component");
      // Undeclared exception!
      try { 
        dynamicSelectModel1.translateValue("wheel.components.Component");
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Expression wheel.components.Component evaluated to an object that is not an instance of Collection or Object[]. Can't build a dynamic ISelectModel
         //
         verifyException("wheel.util.DynamicSelectModel", e);
      }
  }

  /**
  //Test case number: 52
  /*Coverage entropy=1.3321790402101223
  */
  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      DynamicSelectModel dynamicSelectModel0 = new DynamicSelectModel();
      dynamicSelectModel0.collection((String) null);
      // Undeclared exception!
      try { 
        dynamicSelectModel0.translateValue((String) null);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Expression null evaluated to null. Can't build a dynamic ISelectModel
         //
         verifyException("wheel.util.DynamicSelectModel", e);
      }
  }

  /**
  //Test case number: 53
  /*Coverage entropy=1.69240886298655
  */
  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      DynamicSelectModel dynamicSelectModel0 = new DynamicSelectModel();
      dynamicSelectModel0.collection("[]RH from ");
      DynamicSelectModel dynamicSelectModel1 = dynamicSelectModel0.empty("[]RH from ");
      dynamicSelectModel1.value("[]RH from ");
      Object object0 = dynamicSelectModel0.translateValue("org.mvel.util.FastList@0000000028");
      assertEquals("[]RH from ", object0);
  }

  /**
  //Test case number: 54
  /*Coverage entropy=1.8288411561741993
  */
  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      DynamicSelectModel dynamicSelectModel0 = new DynamicSelectModel();
      dynamicSelectModel0.collection("[]RH from ");
      DynamicSelectModel dynamicSelectModel1 = dynamicSelectModel0.empty("[]RH from ");
      DynamicSelectModel dynamicSelectModel2 = dynamicSelectModel1.value("[]RH from ");
      dynamicSelectModel2.translator("[]RH from ");
      FastList fastList0 = (FastList)dynamicSelectModel2.translateValue("org.mvel.util.FastList@0000000029");
      assertTrue(fastList0.isEmpty());
  }

  /**
  //Test case number: 55
  /*Coverage entropy=1.69240886298655
  */
  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      DynamicSelectModel dynamicSelectModel0 = new DynamicSelectModel();
      dynamicSelectModel0.collection("[]RH from ");
      DynamicSelectModel dynamicSelectModel1 = dynamicSelectModel0.empty("[]RH from ");
      DynamicSelectModel dynamicSelectModel2 = dynamicSelectModel1.value("[]RH from ");
      Object object0 = dynamicSelectModel2.translateValue("[]RH from ");
      assertNull(object0);
  }

  /**
  //Test case number: 56
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test56()  throws Throwable  {
      DynamicSelectModel dynamicSelectModel0 = new DynamicSelectModel();
      dynamicSelectModel0.setTopLevelComponent((StandaloneComponent) null);
  }

  /**
  //Test case number: 57
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test57()  throws Throwable  {
      DynamicSelectModel dynamicSelectModel0 = new DynamicSelectModel();
      // Undeclared exception!
      try { 
        dynamicSelectModel0.getLabel(0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("wheel.util.DynamicSelectModel", e);
      }
  }

  /**
  //Test case number: 58
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test58()  throws Throwable  {
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
  //Test case number: 59
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test59()  throws Throwable  {
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

  /**
  //Test case number: 60
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test60()  throws Throwable  {
      DynamicSelectModel dynamicSelectModel0 = new DynamicSelectModel();
      StandaloneComponent standaloneComponent0 = dynamicSelectModel0.getTopLevelComponent();
      assertNull(standaloneComponent0);
  }

  /**
  //Test case number: 61
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test61()  throws Throwable  {
      DynamicSelectModel dynamicSelectModel0 = new DynamicSelectModel();
      dynamicSelectModel0.setComponent((Component) null);
  }

  /**
  //Test case number: 62
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test62()  throws Throwable  {
      DynamicSelectModel dynamicSelectModel0 = new DynamicSelectModel();
      dynamicSelectModel0.reset();
  }

  /**
  //Test case number: 63
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test63()  throws Throwable  {
      DynamicSelectModel dynamicSelectModel0 = new DynamicSelectModel();
      Component component0 = dynamicSelectModel0.getComponent();
      assertNull(component0);
  }

  /**
  //Test case number: 64
  /*Coverage entropy=1.3862943611198906
  */
  @Test(timeout = 4000)
  public void test64()  throws Throwable  {
      DynamicSelectModel dynamicSelectModel0 = new DynamicSelectModel();
      dynamicSelectModel0.enumeration("[]RH from ");
      DynamicSelectModel dynamicSelectModel1 = dynamicSelectModel0.empty("[]RH from ");
      String string0 = dynamicSelectModel1.getLabel(0);
      assertNotNull(string0);
  }

  /**
  //Test case number: 65
  /*Coverage entropy=1.1595888143086257
  */
  @Test(timeout = 4000)
  public void test65()  throws Throwable  {
      DynamicSelectModel dynamicSelectModel0 = new DynamicSelectModel();
      dynamicSelectModel0.collection("{&&}");
      // Undeclared exception!
      try { 
        dynamicSelectModel0.translateValue("{&&}");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("wheel.util.DynamicSelectModel", e);
      }
  }
}
