/*
 * This file was automatically generated by EvoSuite
 * Sun Nov 08 13:27:52 GMT 2020
 */

package wheel.util;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.nio.CharBuffer;
import java.util.Collection;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import wheel.ErrorPage;
import wheel.components.Any;
import wheel.components.Component;
import wheel.components.ElExpression;
import wheel.components.StandaloneComponent;
import wheel.util.DynamicSelectModel;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class DynamicSelectModel_ESTest extends DynamicSelectModel_ESTest_scaffolding {

  /**
  //Test case number: 0
  /*Coverage entropy=0.9404479886553263
  */
  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      DynamicSelectModel dynamicSelectModel0 = new DynamicSelectModel();
      DynamicSelectModel dynamicSelectModel1 = dynamicSelectModel0.enumeration("wheel.Asset$AssetType");
      String string0 = dynamicSelectModel1.getValue(2);
      assertNotNull(string0);
  }

  /**
  //Test case number: 1
  /*Coverage entropy=1.15374194270109
  */
  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      DynamicSelectModel dynamicSelectModel0 = new DynamicSelectModel();
      dynamicSelectModel0.collection("[] from ");
      int int0 = dynamicSelectModel0.getOptionCount();
      assertEquals(0, int0);
  }

  /**
  //Test case number: 2
  /*Coverage entropy=0.9404479886553263
  */
  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      DynamicSelectModel dynamicSelectModel0 = new DynamicSelectModel();
      dynamicSelectModel0.enumeration("wheel.Asset$AssetType");
      String string0 = dynamicSelectModel0.getLabel(2);
      assertNotNull(string0);
  }

  /**
  //Test case number: 3
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      ErrorPage errorPage0 = new ErrorPage();
      char[] charArray0 = new char[3];
      CharBuffer charBuffer0 = CharBuffer.wrap(charArray0);
      Any any0 = new Any(errorPage0, charBuffer0);
      DynamicSelectModel dynamicSelectModel0 = any0.selectModel();
      dynamicSelectModel0.setComponent(any0);
      Any any1 = (Any)dynamicSelectModel0.getComponent();
      assertNull(any1.defaultTagName());
  }

  /**
  //Test case number: 4
  /*Coverage entropy=1.3862943611198906
  */
  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      DynamicSelectModel dynamicSelectModel0 = new DynamicSelectModel();
      dynamicSelectModel0.collection("uDk[Iv:");
      // Undeclared exception!
      dynamicSelectModel0.translateValue("uDk[Iv:");
  }

  /**
  //Test case number: 5
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      DynamicSelectModel dynamicSelectModel0 = new DynamicSelectModel();
      // Undeclared exception!
      try { 
        dynamicSelectModel0.translateValue(" to create a value for dynamic ISelectModel. Index was ");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("wheel.util.DynamicSelectModel", e);
      }
  }

  /**
  //Test case number: 6
  /*Coverage entropy=1.3862943611198906
  */
  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      DynamicSelectModel dynamicSelectModel0 = new DynamicSelectModel();
      dynamicSelectModel0.enumeration((String) null);
      // Undeclared exception!
      try { 
        dynamicSelectModel0.translateValue((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.mvel.PropertyAccessor", e);
      }
  }

  /**
  //Test case number: 7
  /*Coverage entropy=1.3862943611198906
  */
  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      DynamicSelectModel dynamicSelectModel0 = new DynamicSelectModel();
      dynamicSelectModel0.collection("?rFid");
      // Undeclared exception!
      try { 
        dynamicSelectModel0.translateValue("?rFid");
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // java.lang.Integer cannot be cast to java.lang.Boolean
         //
         verifyException("org.mvel.MVELInterpretedRuntime", e);
      }
  }

  /**
  //Test case number: 8
  /*Coverage entropy=1.3862943611198906
  */
  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      DynamicSelectModel dynamicSelectModel0 = new DynamicSelectModel();
      DynamicSelectModel dynamicSelectModel1 = dynamicSelectModel0.collection("/+Vm)j=qzlx`");
      // Undeclared exception!
      try { 
        dynamicSelectModel1.translateValue("/+Vm)j=qzlx`");
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // Division by zero
         //
         verifyException("java.math.BigDecimal", e);
      }
  }

  /**
  //Test case number: 9
  /*Coverage entropy=1.3862943611198906
  */
  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      DynamicSelectModel dynamicSelectModel0 = new DynamicSelectModel();
      dynamicSelectModel0.enumeration(" to create a label for dynamic ISelectModel. Index was ");
      // Undeclared exception!
      try { 
        dynamicSelectModel0.getValue((-11));
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Could not evaluate expression  to create a label for dynamic ISelectModel. Index was .values() to create a dynamic ISelectModel.
         //
         verifyException("wheel.components.ElExpression", e);
      }
  }

  /**
  //Test case number: 10
  /*Coverage entropy=1.3862943611198906
  */
  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      DynamicSelectModel dynamicSelectModel0 = new DynamicSelectModel();
      dynamicSelectModel0.enumeration("xG4eaOYL]td4E");
      // Undeclared exception!
      dynamicSelectModel0.getValue(26);
  }

  /**
  //Test case number: 11
  /*Coverage entropy=1.6094379124341005
  */
  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      DynamicSelectModel dynamicSelectModel0 = new DynamicSelectModel();
      DynamicSelectModel dynamicSelectModel1 = dynamicSelectModel0.collection(":$|1U]O=mrb");
      DynamicSelectModel dynamicSelectModel2 = dynamicSelectModel1.value("org.mvel.util.FastList@0000000031");
      // Undeclared exception!
      try { 
        dynamicSelectModel2.getValue(55);
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
      }
  }

  /**
  //Test case number: 12
  /*Coverage entropy=1.3862943611198906
  */
  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      DynamicSelectModel dynamicSelectModel0 = new DynamicSelectModel();
      dynamicSelectModel0.enumeration("~7@;A4#URF/-TqB8-m");
      // Undeclared exception!
      try { 
        dynamicSelectModel0.getValue(0);
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // For input string: \"~7\"
         //
         verifyException("java.lang.NumberFormatException", e);
      }
  }

  /**
  //Test case number: 13
  /*Coverage entropy=1.3862943611198906
  */
  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      DynamicSelectModel dynamicSelectModel0 = new DynamicSelectModel();
      dynamicSelectModel0.enumeration((String) null);
      // Undeclared exception!
      try { 
        dynamicSelectModel0.getValue(1);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.mvel.PropertyAccessor", e);
      }
  }

  /**
  //Test case number: 14
  /*Coverage entropy=1.3862943611198906
  */
  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      DynamicSelectModel dynamicSelectModel0 = new DynamicSelectModel();
      dynamicSelectModel0.enumeration(":rqM?*>fh^=J");
      // Undeclared exception!
      try { 
        dynamicSelectModel0.getValue((-21));
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // java.lang.Integer cannot be cast to java.lang.Boolean
         //
         verifyException("org.mvel.MVELInterpretedRuntime", e);
      }
  }

  /**
  //Test case number: 15
  /*Coverage entropy=0.9404479886553263
  */
  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      DynamicSelectModel dynamicSelectModel0 = new DynamicSelectModel();
      DynamicSelectModel dynamicSelectModel1 = dynamicSelectModel0.enumeration("wheel.Asset$AssetType");
      // Undeclared exception!
      try { 
        dynamicSelectModel1.getValue((-2005));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -2005
         //
         verifyException("wheel.util.DynamicSelectModel", e);
      }
  }

  /**
  //Test case number: 16
  /*Coverage entropy=1.15374194270109
  */
  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      DynamicSelectModel dynamicSelectModel0 = new DynamicSelectModel();
      DynamicSelectModel dynamicSelectModel1 = dynamicSelectModel0.collection("wheel.util.DynamicSelectModel");
      // Undeclared exception!
      try { 
        dynamicSelectModel1.getOptionCount();
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Expression wheel.util.DynamicSelectModel evaluated to an object that is not an instance of Collection or Object[]. Can't build a dynamic ISelectModel
         //
         verifyException("wheel.util.DynamicSelectModel", e);
      }
  }

  /**
  //Test case number: 17
  /*Coverage entropy=1.3862943611198906
  */
  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      DynamicSelectModel dynamicSelectModel0 = new DynamicSelectModel();
      DynamicSelectModel dynamicSelectModel1 = dynamicSelectModel0.collection("9]nc[Xs6 =S6.BU");
      // Undeclared exception!
      dynamicSelectModel1.getOptionCount();
  }

  /**
  //Test case number: 18
  /*Coverage entropy=1.3862943611198906
  */
  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      DynamicSelectModel dynamicSelectModel0 = new DynamicSelectModel();
      dynamicSelectModel0.enumeration("/I];Jly[^b/>q9");
      // Undeclared exception!
      try { 
        dynamicSelectModel0.getOptionCount();
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
      }
  }

  /**
  //Test case number: 19
  /*Coverage entropy=1.3862943611198906
  */
  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      DynamicSelectModel dynamicSelectModel0 = new DynamicSelectModel();
      DynamicSelectModel dynamicSelectModel1 = dynamicSelectModel0.enumeration("~7@;A4#URF/-TqB8-m");
      // Undeclared exception!
      try { 
        dynamicSelectModel1.getOptionCount();
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // For input string: \"~7\"
         //
         verifyException("java.lang.NumberFormatException", e);
      }
  }

  /**
  //Test case number: 20
  /*Coverage entropy=1.3862943611198906
  */
  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
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
  //Test case number: 21
  /*Coverage entropy=1.3862943611198906
  */
  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      DynamicSelectModel dynamicSelectModel0 = new DynamicSelectModel();
      DynamicSelectModel dynamicSelectModel1 = dynamicSelectModel0.enumeration(":rqM?*>fh^=J");
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
  //Test case number: 22
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      DynamicSelectModel dynamicSelectModel0 = new DynamicSelectModel();
      dynamicSelectModel0.enumeration("xG4eaOYL]td4E");
      // Undeclared exception!
      dynamicSelectModel0.getObjects();
  }

  /**
  //Test case number: 23
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      DynamicSelectModel dynamicSelectModel0 = new DynamicSelectModel();
      dynamicSelectModel0.collection("-h.z]p");
      // Undeclared exception!
      try { 
        dynamicSelectModel0.getObjects();
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
      }
  }

  /**
  //Test case number: 24
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      DynamicSelectModel dynamicSelectModel0 = new DynamicSelectModel();
      dynamicSelectModel0.enumeration("~7@;A4#URF/-TqB8-m");
      // Undeclared exception!
      try { 
        dynamicSelectModel0.getObjects();
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // For input string: \"~7\"
         //
         verifyException("java.lang.NumberFormatException", e);
      }
  }

  /**
  //Test case number: 25
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
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
  //Test case number: 26
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
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
  //Test case number: 27
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      DynamicSelectModel dynamicSelectModel0 = new DynamicSelectModel();
      DynamicSelectModel dynamicSelectModel1 = dynamicSelectModel0.collection("?");
      // Undeclared exception!
      try { 
        dynamicSelectModel1.getObjects();
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // java.lang.Integer cannot be cast to java.lang.Boolean
         //
         verifyException("org.mvel.MVELInterpretedRuntime", e);
      }
  }

  /**
  //Test case number: 28
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      DynamicSelectModel dynamicSelectModel0 = new DynamicSelectModel();
      dynamicSelectModel0.collection("/+Vm)j=qzlx`");
      // Undeclared exception!
      try { 
        dynamicSelectModel0.getObjects();
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // Division by zero
         //
         verifyException("java.math.BigDecimal", e);
      }
  }

  /**
  //Test case number: 29
  /*Coverage entropy=1.3862943611198906
  */
  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      DynamicSelectModel dynamicSelectModel0 = new DynamicSelectModel();
      dynamicSelectModel0.enumeration("9Vq@@0i<@s&K$28G");
      // Undeclared exception!
      try { 
        dynamicSelectModel0.getLabel(167);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Could not evaluate expression 9Vq@@0i<@s&K$28G.values() to create a dynamic ISelectModel.
         //
         verifyException("wheel.components.ElExpression", e);
      }
  }

  /**
  //Test case number: 30
  /*Coverage entropy=1.3862943611198906
  */
  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      DynamicSelectModel dynamicSelectModel0 = new DynamicSelectModel();
      DynamicSelectModel dynamicSelectModel1 = dynamicSelectModel0.enumeration("/I];Jl[^b/>q9");
      // Undeclared exception!
      try { 
        dynamicSelectModel1.getLabel((-1));
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
      }
  }

  /**
  //Test case number: 31
  /*Coverage entropy=1.3862943611198906
  */
  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      DynamicSelectModel dynamicSelectModel0 = new DynamicSelectModel();
      DynamicSelectModel dynamicSelectModel1 = dynamicSelectModel0.enumeration((String) null);
      // Undeclared exception!
      try { 
        dynamicSelectModel1.getLabel((-2590));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.mvel.PropertyAccessor", e);
      }
  }

  /**
  //Test case number: 32
  /*Coverage entropy=1.3862943611198906
  */
  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      DynamicSelectModel dynamicSelectModel0 = new DynamicSelectModel();
      DynamicSelectModel dynamicSelectModel1 = dynamicSelectModel0.enumeration("?n7ds_afP");
      // Undeclared exception!
      try { 
        dynamicSelectModel1.getLabel(1451);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // java.lang.Integer cannot be cast to java.lang.Boolean
         //
         verifyException("org.mvel.MVELInterpretedRuntime", e);
      }
  }

  /**
  //Test case number: 33
  /*Coverage entropy=0.9404479886553263
  */
  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      DynamicSelectModel dynamicSelectModel0 = new DynamicSelectModel();
      dynamicSelectModel0.enumeration("wheel.Asset$AssetType");
      // Undeclared exception!
      try { 
        dynamicSelectModel0.getLabel((-1));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -1
         //
         verifyException("wheel.util.DynamicSelectModel", e);
      }
  }

  /**
  //Test case number: 34
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      DynamicSelectModel dynamicSelectModel0 = new DynamicSelectModel();
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
  //Test case number: 35
  /*Coverage entropy=0.8675632284814612
  */
  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      DynamicSelectModel dynamicSelectModel0 = new DynamicSelectModel();
      dynamicSelectModel0.collection("[] from ");
      Collection collection0 = dynamicSelectModel0.getObjects();
      assertNotNull(collection0);
  }

  /**
  //Test case number: 36
  /*Coverage entropy=0.8855741515766717
  */
  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      DynamicSelectModel dynamicSelectModel0 = new DynamicSelectModel();
      dynamicSelectModel0.enumeration("wheel.Asset$AssetType");
      dynamicSelectModel0.getOptionCount();
      Collection collection0 = dynamicSelectModel0.getObjects();
      assertNotNull(collection0);
  }

  /**
  //Test case number: 37
  /*Coverage entropy=1.242453324894
  */
  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      DynamicSelectModel dynamicSelectModel0 = new DynamicSelectModel();
      DynamicSelectModel dynamicSelectModel1 = dynamicSelectModel0.collection("42G\"");
      DynamicSelectModel dynamicSelectModel2 = dynamicSelectModel1.label("42G\"");
      // Undeclared exception!
      try { 
        dynamicSelectModel2.validate();
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Could not create DynamicSelection model. Value attribute was null or not an el-expression.
         //
         verifyException("wheel.util.DynamicSelectModel", e);
      }
  }

  /**
  //Test case number: 38
  /*Coverage entropy=0.9502705392332347
  */
  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      DynamicSelectModel dynamicSelectModel0 = new DynamicSelectModel();
      DynamicSelectModel dynamicSelectModel1 = dynamicSelectModel0.enumeration("*CN`8x,IjM-");
      dynamicSelectModel0.validate();
      assertSame(dynamicSelectModel0, dynamicSelectModel1);
  }

  /**
  //Test case number: 39
  /*Coverage entropy=1.0397207708399179
  */
  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      DynamicSelectModel dynamicSelectModel0 = new DynamicSelectModel();
      dynamicSelectModel0.collection("wheel.util.DynamicSelectModel");
      // Undeclared exception!
      try { 
        dynamicSelectModel0.validate();
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Could not create DynamicSelection model. Label attribute was null or not an el-expression.
         //
         verifyException("wheel.util.DynamicSelectModel", e);
      }
  }

  /**
  //Test case number: 40
  /*Coverage entropy=0.9404479886553263
  */
  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      DynamicSelectModel dynamicSelectModel0 = new DynamicSelectModel();
      DynamicSelectModel dynamicSelectModel1 = dynamicSelectModel0.enumeration("wheel.Asset$AssetType");
      dynamicSelectModel1.empty("wheel.Asset$AssetType");
      Collection collection0 = dynamicSelectModel0.getObjects();
      assertNotNull(collection0);
  }

  /**
  //Test case number: 41
  /*Coverage entropy=0.8675632284814612
  */
  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      DynamicSelectModel dynamicSelectModel0 = new DynamicSelectModel();
      DynamicSelectModel dynamicSelectModel1 = dynamicSelectModel0.collection("wheel.util.DynamicSelectModel");
      // Undeclared exception!
      try { 
        dynamicSelectModel1.getObjects();
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Expression wheel.util.DynamicSelectModel evaluated to an object that is not an instance of Collection or Object[]. Can't build a dynamic ISelectModel
         //
         verifyException("wheel.util.DynamicSelectModel", e);
      }
  }

  /**
  //Test case number: 42
  /*Coverage entropy=1.0397207708399179
  */
  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      DynamicSelectModel dynamicSelectModel0 = new DynamicSelectModel();
      dynamicSelectModel0.collection((String) null);
      // Undeclared exception!
      try { 
        dynamicSelectModel0.getObjects();
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Expression null evaluated to null. Can't build a dynamic ISelectModel
         //
         verifyException("wheel.util.DynamicSelectModel", e);
      }
  }

  /**
  //Test case number: 43
  /*Coverage entropy=1.5191094303623207
  */
  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      DynamicSelectModel dynamicSelectModel0 = new DynamicSelectModel();
      DynamicSelectModel dynamicSelectModel1 = dynamicSelectModel0.enumeration("wheel.Asset$AssetType");
      DynamicSelectModel dynamicSelectModel2 = dynamicSelectModel1.enumeration("wheel.Asset$AssetType");
      dynamicSelectModel0.enumeration("wheel.Asset$AssetType");
      DynamicSelectModel dynamicSelectModel3 = dynamicSelectModel2.label("wheel.Asset$AssetType");
      dynamicSelectModel3.translator("java.lang.Integer@0000000059");
      dynamicSelectModel0.translateValue("mvel.disable.jit");
      // Undeclared exception!
      try { 
        dynamicSelectModel1.translateValue("java.lang.Integer@0000000059");
       //  fail("Expecting exception: RuntimeException");
       // Unstable assertion
      } catch(RuntimeException e) {
         //
         // Could not evaluate expression java.lang.Integer@0000000059 to translate value ' java.lang.Integer@0000000059'
         //
         verifyException("wheel.components.ElExpression", e);
      }
  }

  /**
  //Test case number: 44
  /*Coverage entropy=1.2153881010836147
  */
  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      DynamicSelectModel dynamicSelectModel0 = new DynamicSelectModel();
      DynamicSelectModel dynamicSelectModel1 = dynamicSelectModel0.enumeration("wheel.Asset$AssetType");
      dynamicSelectModel1.translateValue("java.lang.Integer@0000000019");
  }

  /**
  //Test case number: 45
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      DynamicSelectModel dynamicSelectModel0 = new DynamicSelectModel();
      ErrorPage errorPage0 = new ErrorPage();
      dynamicSelectModel0.setTopLevelComponent(errorPage0);
      StandaloneComponent standaloneComponent0 = dynamicSelectModel0.getTopLevelComponent();
      assertFalse(standaloneComponent0._isBuilt());
  }

  /**
  //Test case number: 46
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      DynamicSelectModel dynamicSelectModel0 = new DynamicSelectModel();
      // Undeclared exception!
      try { 
        dynamicSelectModel0.getLabel(64);
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
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
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
  //Test case number: 48
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
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
  //Test case number: 49
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      DynamicSelectModel dynamicSelectModel0 = new DynamicSelectModel();
      StandaloneComponent standaloneComponent0 = dynamicSelectModel0.getTopLevelComponent();
      assertNull(standaloneComponent0);
  }

  /**
  //Test case number: 50
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      DynamicSelectModel dynamicSelectModel0 = new DynamicSelectModel();
      // Undeclared exception!
      try { 
        dynamicSelectModel0.getValue(5337);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("wheel.util.DynamicSelectModel", e);
      }
  }

  /**
  //Test case number: 51
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      DynamicSelectModel dynamicSelectModel0 = new DynamicSelectModel();
      dynamicSelectModel0.reset();
  }

  /**
  //Test case number: 52
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      DynamicSelectModel dynamicSelectModel0 = new DynamicSelectModel();
      Component component0 = dynamicSelectModel0.getComponent();
      assertNull(component0);
  }

  /**
  //Test case number: 53
  /*Coverage entropy=1.3862943611198906
  */
  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      DynamicSelectModel dynamicSelectModel0 = new DynamicSelectModel();
      DynamicSelectModel dynamicSelectModel1 = dynamicSelectModel0.enumeration("xG4eaOYL]td4E");
      // Undeclared exception!
      dynamicSelectModel1.getLabel(52);
  }

  /**
  //Test case number: 54
  /*Coverage entropy=1.3862943611198906
  */
  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      DynamicSelectModel dynamicSelectModel0 = new DynamicSelectModel();
      DynamicSelectModel dynamicSelectModel1 = dynamicSelectModel0.collection("<rHV_[)|dQ");
      // Undeclared exception!
      try { 
        dynamicSelectModel1.translateValue((String) null);
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
      }
  }
}
