/*
 * This file was automatically generated by EvoSuite
 * Wed Dec 04 16:52:58 GMT 2019
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
import wheel.components.ElExpression;
import wheel.components.StandaloneComponent;
import wheel.components.XmlEntityRef;
import wheel.util.DynamicSelectModel;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class DynamicSelectModel_ESTest extends DynamicSelectModel_ESTest_scaffolding {

  /**
  //Test case number: 0
  /*Coverage entropy=1.5271837172395382
  */
  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      DynamicSelectModel dynamicSelectModel0 = new DynamicSelectModel();
      dynamicSelectModel0.collection("[{~IF~Pxo.hweR]Xw");
      // Undeclared exception!
      try { 
        dynamicSelectModel0.getObjects();
        fail("Expecting exception: NegativeArraySizeException");
      
      } catch(NegativeArraySizeException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.mvel.util.CollectionParser", e);
      }
  }

  /**
  //Test case number: 1
  /*Coverage entropy=2.168599339177026
  */
  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      DynamicSelectModel dynamicSelectModel0 = new DynamicSelectModel();
      DynamicSelectModel dynamicSelectModel1 = dynamicSelectModel0.value("[] fo");
      DynamicSelectModel dynamicSelectModel2 = dynamicSelectModel1.collection("[] fo");
      dynamicSelectModel2.empty(dynamicSelectModel1);
      dynamicSelectModel0.translateValue("[] fo");
      String string0 = dynamicSelectModel2.getValue(0);
      assertNotNull(string0);
  }

  /**
  //Test case number: 2
  /*Coverage entropy=2.784066574475527
  */
  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      DynamicSelectModel dynamicSelectModel0 = new DynamicSelectModel();
      ErrorPage errorPage0 = new ErrorPage();
      errorPage0._setGeneratedId(true);
      dynamicSelectModel0.setTopLevelComponent(errorPage0);
      Object object0 = new Object();
      DynamicSelectModel dynamicSelectModel1 = dynamicSelectModel0.empty(object0);
      StandaloneComponent standaloneComponent0 = dynamicSelectModel0.getTopLevelComponent();
      DynamicSelectModel dynamicSelectModel2 = dynamicSelectModel1.translator(" to create a value for dynamic ISelectModel. Index was ");
      dynamicSelectModel2.empty(standaloneComponent0);
      dynamicSelectModel0.getTopLevelComponent();
      dynamicSelectModel1.getComponent();
      DynamicSelectModel dynamicSelectModel3 = dynamicSelectModel1.value("Y.E3qL>MP");
      dynamicSelectModel3.label("LdCvB\"`sm0%V");
      DynamicSelectModel dynamicSelectModel4 = dynamicSelectModel3.label("8(q`xgX!vj0F");
      // Undeclared exception!
      try { 
        dynamicSelectModel4.getLabel((-2192));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("wheel.util.DynamicSelectModel", e);
      }
  }

  /**
  //Test case number: 3
  /*Coverage entropy=1.5271837172395382
  */
  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      DynamicSelectModel dynamicSelectModel0 = new DynamicSelectModel();
      XmlEntityRef xmlEntityRef0 = new XmlEntityRef("GC^i~");
      dynamicSelectModel0.setComponent(xmlEntityRef0);
      XmlEntityRef xmlEntityRef1 = (XmlEntityRef)dynamicSelectModel0.getComponent();
      assertNull(xmlEntityRef1.defaultTagName());
  }

  /**
  //Test case number: 4
  /*Coverage entropy=2.2732409507095364
  */
  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      DynamicSelectModel dynamicSelectModel0 = new DynamicSelectModel();
      DynamicSelectModel dynamicSelectModel1 = dynamicSelectModel0.value("[] fo ");
      DynamicSelectModel dynamicSelectModel2 = dynamicSelectModel1.collection("[] fo ");
      dynamicSelectModel2.translator("[] fo ");
      dynamicSelectModel2.empty("[] fo ");
      dynamicSelectModel0.translateValue("[] fo ");
      FastList fastList0 = (FastList)dynamicSelectModel2.translateValue("org.mvel.util.FastList@0000000041");
      assertTrue(fastList0.isEmpty());
  }

  /**
  //Test case number: 5
  /*Coverage entropy=2.2732409507095364
  */
  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      DynamicSelectModel dynamicSelectModel0 = new DynamicSelectModel();
      DynamicSelectModel dynamicSelectModel1 = dynamicSelectModel0.value("[] fo ");
      DynamicSelectModel dynamicSelectModel2 = dynamicSelectModel1.collection("[] fo ");
      dynamicSelectModel1.label("[] fo ");
      dynamicSelectModel2.empty("[] fo ");
      dynamicSelectModel0.translateValue("[] fo ");
      Object object0 = dynamicSelectModel1.translateValue("org.mvel.util.FastList@0000000041");
      assertEquals("[] fo ", object0);
  }

  /**
  //Test case number: 6
  /*Coverage entropy=1.5981863871455344
  */
  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      DynamicSelectModel dynamicSelectModel0 = new DynamicSelectModel();
      DynamicSelectModel dynamicSelectModel1 = dynamicSelectModel0.enumeration("[7] fo ");
      int int0 = dynamicSelectModel1.getOptionCount();
      assertEquals(1, int0);
  }

  /**
  //Test case number: 7
  /*Coverage entropy=1.5981863871455344
  */
  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      DynamicSelectModel dynamicSelectModel0 = new DynamicSelectModel();
      DynamicSelectModel dynamicSelectModel1 = dynamicSelectModel0.collection("[] fo ");
      int int0 = dynamicSelectModel1.getOptionCount();
      assertEquals(0, int0);
  }

  /**
  //Test case number: 8
  /*Coverage entropy=2.0761045791007673
  */
  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      DynamicSelectModel dynamicSelectModel0 = new DynamicSelectModel();
      DynamicSelectModel dynamicSelectModel1 = dynamicSelectModel0.enumeration("[] fo ");
      dynamicSelectModel1.collection("[] fo ");
      Object object0 = new Object();
      dynamicSelectModel0.empty(object0);
      dynamicSelectModel0.getObjects();
      String string0 = dynamicSelectModel1.getLabel(0);
      assertNotNull(string0);
  }

  /**
  //Test case number: 9
  /*Coverage entropy=1.830738805564335
  */
  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      DynamicSelectModel dynamicSelectModel0 = new DynamicSelectModel();
      DynamicSelectModel dynamicSelectModel1 = dynamicSelectModel0.collection("*b2R0[");
      // Undeclared exception!
      try { 
        dynamicSelectModel1.getOptionCount();
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
      }
  }

  /**
  //Test case number: 10
  /*Coverage entropy=1.5280883009539779
  */
  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      DynamicSelectModel dynamicSelectModel0 = new DynamicSelectModel();
      DynamicSelectModel dynamicSelectModel1 = dynamicSelectModel0.enumeration("[] fo ");
      dynamicSelectModel1.translateValue("[] fo ");
      Collection collection0 = dynamicSelectModel1.getObjects();
      assertNotNull(collection0);
  }

  /**
  //Test case number: 11
  /*Coverage entropy=1.5531577432135641
  */
  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      DynamicSelectModel dynamicSelectModel0 = new DynamicSelectModel();
      dynamicSelectModel0.collection("[,] fxYo ");
      // Undeclared exception!
      try { 
        dynamicSelectModel0.translateValue("[,] fxYo ");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("wheel.util.DynamicSelectModel", e);
      }
  }

  /**
  //Test case number: 12
  /*Coverage entropy=1.1476926351053998
  */
  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      DynamicSelectModel dynamicSelectModel0 = new DynamicSelectModel();
      DynamicSelectModel dynamicSelectModel1 = dynamicSelectModel0.enumeration("[] fo ");
      dynamicSelectModel0.getObjects();
      Object object0 = dynamicSelectModel1.translateValue("[] fo ");
      assertNull(object0);
  }

  /**
  //Test case number: 13
  /*Coverage entropy=1.543056733112554
  */
  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      DynamicSelectModel dynamicSelectModel0 = new DynamicSelectModel();
      dynamicSelectModel0.enumeration("[] fo ");
      // Undeclared exception!
      try { 
        dynamicSelectModel0.getValue(1024);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 1024
         //
         verifyException("wheel.util.DynamicSelectModel", e);
      }
  }

  /**
  //Test case number: 14
  /*Coverage entropy=1.5981863871455344
  */
  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      DynamicSelectModel dynamicSelectModel0 = new DynamicSelectModel();
      dynamicSelectModel0.enumeration("[] fo ");
      // Undeclared exception!
      try { 
        dynamicSelectModel0.getLabel(182);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 182
         //
         verifyException("wheel.util.DynamicSelectModel", e);
      }
  }

  /**
  //Test case number: 15
  /*Coverage entropy=1.5271837172395382
  */
  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      DynamicSelectModel dynamicSelectModel0 = new DynamicSelectModel();
      ErrorPage errorPage0 = new ErrorPage();
      dynamicSelectModel0.setTopLevelComponent(errorPage0);
      StandaloneComponent standaloneComponent0 = dynamicSelectModel0.getTopLevelComponent();
      assertTrue(standaloneComponent0.isPage());
  }

  /**
  //Test case number: 16
  /*Coverage entropy=1.830738805564335
  */
  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      DynamicSelectModel dynamicSelectModel0 = new DynamicSelectModel();
      DynamicSelectModel dynamicSelectModel1 = dynamicSelectModel0.collection("-~k]a=M:OiCHv[");
      // Undeclared exception!
      try { 
        dynamicSelectModel1.translateValue("-~k]a=M:OiCHv[");
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
      }
  }

  /**
  //Test case number: 17
  /*Coverage entropy=1.830738805564335
  */
  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      DynamicSelectModel dynamicSelectModel0 = new DynamicSelectModel();
      DynamicSelectModel dynamicSelectModel1 = dynamicSelectModel0.enumeration("?2_f");
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
  //Test case number: 18
  /*Coverage entropy=1.830738805564335
  */
  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      DynamicSelectModel dynamicSelectModel0 = new DynamicSelectModel();
      DynamicSelectModel dynamicSelectModel1 = dynamicSelectModel0.enumeration("?2_f");
      // Undeclared exception!
      try { 
        dynamicSelectModel1.translateValue("?2_f");
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // java.lang.Integer cannot be cast to java.lang.Boolean
         //
         verifyException("org.mvel.MVELInterpretedRuntime", e);
      }
  }

  /**
  //Test case number: 19
  /*Coverage entropy=1.5271837172395382
  */
  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      DynamicSelectModel dynamicSelectModel0 = new DynamicSelectModel();
      dynamicSelectModel0.collection("*b2R0[");
      // Undeclared exception!
      try { 
        dynamicSelectModel0.getObjects();
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
      }
  }

  /**
  //Test case number: 20
  /*Coverage entropy=1.830738805564335
  */
  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      DynamicSelectModel dynamicSelectModel0 = new DynamicSelectModel();
      dynamicSelectModel0.enumeration("uYHu]1!Nu");
      // Undeclared exception!
      dynamicSelectModel0.getLabel((-741));
  }

  /**
  //Test case number: 21
  /*Coverage entropy=1.830738805564335
  */
  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
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
  //Test case number: 22
  /*Coverage entropy=1.830738805564335
  */
  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      DynamicSelectModel dynamicSelectModel0 = new DynamicSelectModel();
      DynamicSelectModel dynamicSelectModel1 = dynamicSelectModel0.enumeration("?`N'");
      // Undeclared exception!
      try { 
        dynamicSelectModel1.getLabel((-2108));
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // java.lang.Integer cannot be cast to java.lang.Boolean
         //
         verifyException("org.mvel.MVELInterpretedRuntime", e);
      }
  }

  /**
  //Test case number: 23
  /*Coverage entropy=2.063983366979555
  */
  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      DynamicSelectModel dynamicSelectModel0 = new DynamicSelectModel();
      dynamicSelectModel0.label("uYHu]1!Nu");
      DynamicSelectModel dynamicSelectModel1 = dynamicSelectModel0.enumeration("uYHu]1!Nu");
      // Undeclared exception!
      dynamicSelectModel1.getOptionCount();
  }

  /**
  //Test case number: 24
  /*Coverage entropy=1.5271837172395382
  */
  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      DynamicSelectModel dynamicSelectModel0 = new DynamicSelectModel();
      dynamicSelectModel0.collection("52?F|$,u>W@R+DD;{");
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
  //Test case number: 25
  /*Coverage entropy=1.830738805564335
  */
  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      DynamicSelectModel dynamicSelectModel0 = new DynamicSelectModel();
      dynamicSelectModel0.enumeration("Ij]-F@S?G@y9y");
      // Undeclared exception!
      dynamicSelectModel0.getValue(1385);
  }

  /**
  //Test case number: 26
  /*Coverage entropy=1.5271837172395382
  */
  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      DynamicSelectModel dynamicSelectModel0 = new DynamicSelectModel();
      DynamicSelectModel dynamicSelectModel1 = dynamicSelectModel0.collection("~LHnyi/H0\"vtCpRf");
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
  //Test case number: 27
  /*Coverage entropy=1.830738805564335
  */
  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      DynamicSelectModel dynamicSelectModel0 = new DynamicSelectModel();
      dynamicSelectModel0.enumeration((String) null);
      // Undeclared exception!
      try { 
        dynamicSelectModel0.getLabel(804);
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
  /*Coverage entropy=1.5271837172395382
  */
  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      DynamicSelectModel dynamicSelectModel0 = new DynamicSelectModel();
      dynamicSelectModel0.collection("org.xmlp]ll>v1.XmlPullParser");
      // Undeclared exception!
      dynamicSelectModel0.getObjects();
  }

  /**
  //Test case number: 29
  /*Coverage entropy=1.830738805564335
  */
  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      DynamicSelectModel dynamicSelectModel0 = new DynamicSelectModel();
      DynamicSelectModel dynamicSelectModel1 = dynamicSelectModel0.collection("5Lv[TB<OU");
      // Undeclared exception!
      dynamicSelectModel1.translateValue("5Lv[TB<OU");
  }

  /**
  //Test case number: 30
  /*Coverage entropy=1.830738805564335
  */
  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      DynamicSelectModel dynamicSelectModel0 = new DynamicSelectModel();
      dynamicSelectModel0.enumeration("?I");
      // Undeclared exception!
      try { 
        dynamicSelectModel0.getValue((-1));
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // java.lang.Integer cannot be cast to java.lang.Boolean
         //
         verifyException("org.mvel.MVELInterpretedRuntime", e);
      }
  }

  /**
  //Test case number: 31
  /*Coverage entropy=1.830738805564335
  */
  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      DynamicSelectModel dynamicSelectModel0 = new DynamicSelectModel();
      dynamicSelectModel0.enumeration((String) null);
      // Undeclared exception!
      try { 
        dynamicSelectModel0.getValue((-1951));
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
  /*Coverage entropy=1.543056733112554
  */
  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      DynamicSelectModel dynamicSelectModel0 = new DynamicSelectModel();
      DynamicSelectModel dynamicSelectModel1 = dynamicSelectModel0.collection("org.xmlpull.mxp1.MXParserCachingStrings");
      dynamicSelectModel1.label("org.xmlpull.mxp1.MXParserCachingStrings");
      // Undeclared exception!
      try { 
        dynamicSelectModel0.validate();
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Could not create DynamicSelection model. Value attribute was null or not an el-expression.
         //
         verifyException("wheel.util.DynamicSelectModel", e);
      }
  }

  /**
  //Test case number: 33
  /*Coverage entropy=1.830738805564335
  */
  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      DynamicSelectModel dynamicSelectModel0 = new DynamicSelectModel();
      DynamicSelectModel dynamicSelectModel1 = dynamicSelectModel0.enumeration((String) null);
      // Undeclared exception!
      try { 
        dynamicSelectModel1.translateValue((String) null);
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
  /*Coverage entropy=1.2961346570528898
  */
  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      DynamicSelectModel dynamicSelectModel0 = new DynamicSelectModel();
      DynamicSelectModel dynamicSelectModel1 = dynamicSelectModel0.collection("org.xmlpull.mxp1.MXParserCachingStrings");
      // Undeclared exception!
      try { 
        dynamicSelectModel1.getObjects();
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Expression org.xmlpull.mxp1.MXParserCachingStrings evaluated to an object that is not an instance of Collection or Object[]. Can't build a dynamic ISelectModel
         //
         verifyException("wheel.util.DynamicSelectModel", e);
      }
  }

  /**
  //Test case number: 35
  /*Coverage entropy=1.1217186091313738
  */
  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      DynamicSelectModel dynamicSelectModel0 = new DynamicSelectModel();
      DynamicSelectModel dynamicSelectModel1 = dynamicSelectModel0.collection("'h[fg");
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
  //Test case number: 36
  /*Coverage entropy=1.830738805564335
  */
  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      DynamicSelectModel dynamicSelectModel0 = new DynamicSelectModel();
      dynamicSelectModel0.enumeration("OTuvC/yp*t_y'FpSj");
      // Undeclared exception!
      try { 
        dynamicSelectModel0.getOptionCount();
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Could not evaluate expression OTuvC/yp*t_y'FpSj.values() to create a dynamic ISelectModel.
         //
         verifyException("wheel.components.ElExpression", e);
      }
  }

  /**
  //Test case number: 37
  /*Coverage entropy=1.543056733112554
  */
  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      DynamicSelectModel dynamicSelectModel0 = new DynamicSelectModel();
      DynamicSelectModel dynamicSelectModel1 = dynamicSelectModel0.enumeration("_OnfP!(z>ky_,y");
      // Undeclared exception!
      try { 
        dynamicSelectModel1.getLabel(19);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Could not evaluate expression _OnfP!(z>ky_,y.values() to create a dynamic ISelectModel.
         //
         verifyException("wheel.components.ElExpression", e);
      }
  }

  /**
  //Test case number: 38
  /*Coverage entropy=1.1217186091313738
  */
  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      DynamicSelectModel dynamicSelectModel0 = new DynamicSelectModel();
      DynamicSelectModel dynamicSelectModel1 = dynamicSelectModel0.enumeration("'h[fg");
      dynamicSelectModel1.validate();
      assertSame(dynamicSelectModel1, dynamicSelectModel0);
  }

  /**
  //Test case number: 39
  /*Coverage entropy=1.543056733112554
  */
  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      DynamicSelectModel dynamicSelectModel0 = new DynamicSelectModel();
      DynamicSelectModel dynamicSelectModel1 = dynamicSelectModel0.collection("org.xmlpull.mxp1.MXParserCachingStrings");
      // Undeclared exception!
      try { 
        dynamicSelectModel1.translateValue("org.xmlpull.mxp1.MXParserCachingStrings");
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Expression org.xmlpull.mxp1.MXParserCachingStrings evaluated to an object that is not an instance of Collection or Object[]. Can't build a dynamic ISelectModel
         //
         verifyException("wheel.util.DynamicSelectModel", e);
      }
  }

  /**
  //Test case number: 40
  /*Coverage entropy=1.0931471805599453
  */
  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      DynamicSelectModel dynamicSelectModel0 = new DynamicSelectModel();
      StandaloneComponent standaloneComponent0 = dynamicSelectModel0.getTopLevelComponent();
      assertNull(standaloneComponent0);
  }

  /**
  //Test case number: 41
  /*Coverage entropy=1.543056733112554
  */
  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      DynamicSelectModel dynamicSelectModel0 = new DynamicSelectModel();
      DynamicSelectModel dynamicSelectModel1 = dynamicSelectModel0.enumeration("org.xmlpull.mxp1.MXParserCachingStrings");
      // Undeclared exception!
      try { 
        dynamicSelectModel1.getValue(0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Could not evaluate expression org.xmlpull.mxp1.MXParserCachingStrings.values() to create a dynamic ISelectModel.
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
        dynamicSelectModel0.getValue((-1925));
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
  /*Coverage entropy=1.0931471805599453
  */
  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
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
  //Test case number: 44
  /*Coverage entropy=1.1217186091313738
  */
  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      DynamicSelectModel dynamicSelectModel0 = new DynamicSelectModel();
      dynamicSelectModel0.collection("");
      // Undeclared exception!
      try { 
        dynamicSelectModel0.getObjects();
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Expression  evaluated to null. Can't build a dynamic ISelectModel
         //
         verifyException("wheel.util.DynamicSelectModel", e);
      }
  }

  /**
  //Test case number: 45
  /*Coverage entropy=0.4
  */
  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
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
  //Test case number: 46
  /*Coverage entropy=1.1217186091313738
  */
  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
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
  //Test case number: 47
  /*Coverage entropy=1.0931471805599453
  */
  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      DynamicSelectModel dynamicSelectModel0 = new DynamicSelectModel();
      dynamicSelectModel0.reset();
  }

  /**
  //Test case number: 48
  /*Coverage entropy=0.4
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
}
