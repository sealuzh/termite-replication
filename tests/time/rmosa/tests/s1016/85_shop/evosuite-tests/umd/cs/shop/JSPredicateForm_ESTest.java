/*
 * This file was automatically generated by EvoSuite
 * Sun Nov 29 02:36:29 GMT 2020
 */

package umd.cs.shop;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.StreamTokenizer;
import java.io.StringReader;
import java.util.Collection;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.System;
import org.junit.runner.RunWith;
import umd.cs.shop.JSPredicateForm;
import umd.cs.shop.JSSubstitution;
import umd.cs.shop.JSTerm;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class JSPredicateForm_ESTest extends JSPredicateForm_ESTest_scaffolding {

  /**
  //Test case number: 0
  /*Coverage entropy=0.37677016125643675
  */
  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      StringReader stringReader0 = new StringReader("(FOS obf.4)^eo");
      StringReader stringReader1 = new StringReader("(FOS obf.4)^eo");
      StreamTokenizer streamTokenizer0 = new StreamTokenizer(stringReader0);
      JSTerm jSTerm0 = new JSTerm(streamTokenizer0);
      StreamTokenizer streamTokenizer1 = new StreamTokenizer(stringReader1);
      JSTerm jSTerm1 = new JSTerm(streamTokenizer1);
      boolean boolean0 = jSTerm1.equals((JSPredicateForm) jSTerm0);
      assertTrue(boolean0);
  }

  /**
  //Test case number: 1
  /*Coverage entropy=0.6365141682948128
  */
  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      StringReader stringReader0 = new StringReader("(LOS oZf.4)^eo");
      StreamTokenizer streamTokenizer0 = new StreamTokenizer(stringReader0);
      JSTerm jSTerm0 = new JSTerm(streamTokenizer0);
      JSTerm jSTerm1 = jSTerm0.standardizerTerm();
      jSTerm1.add((Object) jSTerm0);
      boolean boolean0 = jSTerm0.equals((JSPredicateForm) jSTerm1);
      assertFalse(boolean0);
  }

  /**
  //Test case number: 2
  /*Coverage entropy=0.410116318288409
  */
  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      StringReader stringReader0 = new StringReader("(FOS obf.4)^eo");
      StreamTokenizer streamTokenizer0 = new StreamTokenizer(stringReader0);
      JSTerm jSTerm0 = new JSTerm(streamTokenizer0);
      JSSubstitution jSSubstitution0 = new JSSubstitution();
      JSTerm jSTerm1 = jSTerm0.standardizerTerm();
      JSSubstitution jSSubstitution1 = jSTerm0.matches((JSPredicateForm) jSTerm1, jSSubstitution0);
      assertFalse(jSSubstitution1.fail());
  }

  /**
  //Test case number: 3
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      StringReader stringReader0 = new StringReader("(FOS obf.4)^eo");
      StreamTokenizer streamTokenizer0 = new StreamTokenizer(stringReader0);
      JSTerm jSTerm0 = new JSTerm(streamTokenizer0);
      JSSubstitution jSSubstitution0 = new JSSubstitution();
      JSTerm jSTerm1 = jSTerm0.standardizerTerm();
      jSTerm1.add((Object) jSTerm0);
      JSSubstitution jSSubstitution1 = jSTerm0.matches((JSPredicateForm) jSTerm1, jSSubstitution0);
      assertTrue(jSSubstitution1.fail());
  }

  /**
  //Test case number: 4
  /*Coverage entropy=0.34883209584303193
  */
  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      StringReader stringReader0 = new StringReader("(DOlp +bf.4)^}eo");
      JSTerm jSTerm0 = new JSTerm();
      StreamTokenizer streamTokenizer0 = new StreamTokenizer(stringReader0);
      streamTokenizer0.resetSyntax();
      // Undeclared exception!
      try { 
        jSTerm0.JSPredicateFormInit(streamTokenizer0);
        fail("Expecting exception: Error");
      
      } catch(Error e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("umd.cs.shop.JSPredicateForm", e);
      }
  }

  /**
  //Test case number: 5
  /*Coverage entropy=0.5623351446188083
  */
  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      StringReader stringReader0 = new StringReader("(FOS obf.4)^eo");
      StreamTokenizer streamTokenizer0 = new StreamTokenizer(stringReader0);
      JSTerm jSTerm0 = new JSTerm(streamTokenizer0);
      JSSubstitution jSSubstitution0 = new JSSubstitution();
      jSSubstitution0.add((Object) "(FOS obf.4)^eo");
      JSPredicateForm jSPredicateForm0 = jSTerm0.applySubstitutionPF(jSSubstitution0);
      assertEquals("[FOS, [obf.4]]", jSPredicateForm0.toString());
  }

  /**
  //Test case number: 6
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      JSTerm jSTerm0 = new JSTerm();
      jSTerm0.add((Object) null);
      jSTerm0.addElement(jSTerm0);
      // Undeclared exception!
      try { 
        jSTerm0.toStr();
        fail("Expecting exception: StackOverflowError");
      
      } catch(StackOverflowError e) {
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
      StringReader stringReader0 = new StringReader("(FOS obf.4)^eo");
      StreamTokenizer streamTokenizer0 = new StreamTokenizer(stringReader0);
      JSTerm jSTerm0 = new JSTerm(streamTokenizer0);
      jSTerm0.addElement((Object) null);
      // Undeclared exception!
      try { 
        jSTerm0.toStr();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  /**
  //Test case number: 8
  /*Coverage entropy=0.677908725644198
  */
  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      JSPredicateForm jSPredicateForm0 = new JSPredicateForm("(FUobV.4)^eo");
      jSPredicateForm0.addElement("FUobV.4");
      // Undeclared exception!
      try { 
        jSPredicateForm0.toStr();
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // java.lang.String cannot be cast to umd.cs.shop.JSTerm
         //
         verifyException("umd.cs.shop.JSPredicateForm", e);
      }
  }

  /**
  //Test case number: 9
  /*Coverage entropy=0.6365141682948128
  */
  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      StringReader stringReader0 = new StringReader("(FdS obV.4)^eo");
      StreamTokenizer streamTokenizer0 = new StreamTokenizer(stringReader0);
      JSTerm jSTerm0 = new JSTerm(streamTokenizer0);
      jSTerm0.add((Object) null);
      // Undeclared exception!
      try { 
        jSTerm0.standarizerPredicateForm();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("umd.cs.shop.JSPredicateForm", e);
      }
  }

  /**
  //Test case number: 10
  /*Coverage entropy=0.6365141682948128
  */
  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      StringReader stringReader0 = new StringReader("(oOS oZf.4)^eo");
      StreamTokenizer streamTokenizer0 = new StreamTokenizer(stringReader0);
      JSTerm jSTerm0 = new JSTerm(streamTokenizer0);
      jSTerm0.add((Object) streamTokenizer0);
      // Undeclared exception!
      try { 
        jSTerm0.standarizerPredicateForm();
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // java.io.StreamTokenizer cannot be cast to umd.cs.shop.JSTerm
         //
         verifyException("umd.cs.shop.JSPredicateForm", e);
      }
  }

  /**
  //Test case number: 11
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      JSTerm jSTerm0 = new JSTerm();
      // Undeclared exception!
      try { 
        jSTerm0.standarizerPredicateForm();
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 0 >= 0
         //
         verifyException("java.util.Vector", e);
      }
  }

  /**
  //Test case number: 12
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      JSTerm jSTerm0 = new JSTerm();
      jSTerm0.setSize(550);
      // Undeclared exception!
      try { 
        jSTerm0.print();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  /**
  //Test case number: 13
  /*Coverage entropy=0.677908725644198
  */
  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      JSPredicateForm jSPredicateForm0 = new JSPredicateForm("(FUobV.4)^eo");
      JSSubstitution jSSubstitution0 = new JSSubstitution();
      jSSubstitution0.addElement("(FUobV.4)^eo");
      jSPredicateForm0.addAll((Collection) jSSubstitution0);
      // Undeclared exception!
      try { 
        jSPredicateForm0.print();
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // java.lang.String cannot be cast to umd.cs.shop.JSTerm
         //
         verifyException("umd.cs.shop.JSPredicateForm", e);
      }
  }

  /**
  //Test case number: 14
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      JSTerm jSTerm0 = new JSTerm();
      // Undeclared exception!
      try { 
        jSTerm0.print();
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 0 >= 0
         //
         verifyException("java.util.Vector", e);
      }
  }

  /**
  //Test case number: 15
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      JSPredicateForm jSPredicateForm0 = new JSPredicateForm();
      JSSubstitution jSSubstitution0 = new JSSubstitution();
      // Undeclared exception!
      try { 
        jSPredicateForm0.matches((JSPredicateForm) null, jSSubstitution0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("umd.cs.shop.JSPredicateForm", e);
      }
  }

  /**
  //Test case number: 16
  /*Coverage entropy=0.5623351446188083
  */
  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      StringReader stringReader0 = new StringReader("(FOS obf.4)^eo");
      StreamTokenizer streamTokenizer0 = new StreamTokenizer(stringReader0);
      JSTerm jSTerm0 = new JSTerm(streamTokenizer0);
      JSSubstitution jSSubstitution0 = new JSSubstitution();
      jSSubstitution0.add((Object) jSSubstitution0);
      // Undeclared exception!
      try { 
        jSTerm0.matches((JSPredicateForm) jSTerm0, jSSubstitution0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // umd.cs.shop.JSSubstitution cannot be cast to umd.cs.shop.JSPairVarTerm
         //
         verifyException("umd.cs.shop.JSSubstitution", e);
      }
  }

  /**
  //Test case number: 17
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      JSPredicateForm jSPredicateForm0 = new JSPredicateForm();
      JSTerm jSTerm0 = new JSTerm();
      // Undeclared exception!
      try { 
        jSPredicateForm0.matches((JSPredicateForm) jSTerm0, (JSSubstitution) null);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 0 >= 0
         //
         verifyException("java.util.Vector", e);
      }
  }

  /**
  //Test case number: 18
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      StringReader stringReader0 = new StringReader("(ROp obf.4)^}eo");
      StreamTokenizer streamTokenizer0 = new StreamTokenizer(stringReader0);
      JSTerm jSTerm0 = new JSTerm(streamTokenizer0);
      // Undeclared exception!
      try { 
        jSTerm0.matches((JSPredicateForm) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("umd.cs.shop.JSPredicateForm", e);
      }
  }

  /**
  //Test case number: 19
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      JSTerm jSTerm0 = new JSTerm();
      StringReader stringReader0 = new StringReader("JSPredicateForm");
      jSTerm0.add((Object) stringReader0);
      // Undeclared exception!
      try { 
        jSTerm0.matches((JSPredicateForm) jSTerm0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // java.io.StringReader cannot be cast to java.lang.String
         //
         verifyException("umd.cs.shop.JSPredicateForm", e);
      }
  }

  /**
  //Test case number: 20
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      JSTerm jSTerm0 = new JSTerm();
      // Undeclared exception!
      try { 
        jSTerm0.matches((JSPredicateForm) jSTerm0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 0 >= 0
         //
         verifyException("java.util.Vector", e);
      }
  }

  /**
  //Test case number: 21
  /*Coverage entropy=0.410116318288409
  */
  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      StringReader stringReader0 = new StringReader("(ROp obf.4)^}eo");
      StreamTokenizer streamTokenizer0 = new StreamTokenizer(stringReader0);
      JSTerm jSTerm0 = new JSTerm(streamTokenizer0);
      jSTerm0.add((Object) null);
      // Undeclared exception!
      try { 
        jSTerm0.equals((JSPredicateForm) jSTerm0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("umd.cs.shop.JSPredicateForm", e);
      }
  }

  /**
  //Test case number: 22
  /*Coverage entropy=0.410116318288409
  */
  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      StringReader stringReader0 = new StringReader("(FOS obf.4)^eo");
      StreamTokenizer streamTokenizer0 = new StreamTokenizer(stringReader0);
      JSTerm jSTerm0 = new JSTerm(streamTokenizer0);
      jSTerm0.add((Object) "(FOS obf.4)^eo");
      // Undeclared exception!
      try { 
        jSTerm0.equals((JSPredicateForm) jSTerm0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // java.lang.String cannot be cast to umd.cs.shop.JSTerm
         //
         verifyException("umd.cs.shop.JSPredicateForm", e);
      }
  }

  /**
  //Test case number: 23
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      StringReader stringReader0 = new StringReader("5Dj@");
      StreamTokenizer streamTokenizer0 = new StreamTokenizer(stringReader0);
      JSTerm jSTerm0 = new JSTerm(streamTokenizer0);
      JSTerm jSTerm1 = new JSTerm();
      // Undeclared exception!
      try { 
        jSTerm1.equals((JSPredicateForm) jSTerm0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 0 >= 0
         //
         verifyException("java.util.Vector", e);
      }
  }

  /**
  //Test case number: 24
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      JSTerm jSTerm0 = new JSTerm();
      jSTerm0.add((Object) null);
      // Undeclared exception!
      try { 
        jSTerm0.clonePF();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
      }
  }

  /**
  //Test case number: 25
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      JSPredicateForm jSPredicateForm0 = new JSPredicateForm();
      JSTerm jSTerm0 = new JSTerm();
      jSTerm0.add((Object) jSPredicateForm0);
      // Undeclared exception!
      try { 
        jSTerm0.clonePF();
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // umd.cs.shop.JSPredicateForm cannot be cast to java.lang.String
         //
         verifyException("umd.cs.shop.JSPredicateForm", e);
      }
  }

  /**
  //Test case number: 26
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      JSTerm jSTerm0 = new JSTerm();
      // Undeclared exception!
      try { 
        jSTerm0.clonePF();
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 0 >= 0
         //
         verifyException("java.util.Vector", e);
      }
  }

  /**
  //Test case number: 27
  /*Coverage entropy=0.5623351446188083
  */
  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      StringReader stringReader0 = new StringReader("(FOS obf.4)^eo");
      StreamTokenizer streamTokenizer0 = new StreamTokenizer(stringReader0);
      JSTerm jSTerm0 = new JSTerm(streamTokenizer0);
      JSSubstitution jSSubstitution0 = new JSSubstitution();
      jSTerm0.addElement((Object) null);
      // Undeclared exception!
      try { 
        jSTerm0.applySubstitutionPF(jSSubstitution0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  /**
  //Test case number: 28
  /*Coverage entropy=0.5623351446188083
  */
  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      StringReader stringReader0 = new StringReader("(ROp obf.4)^}8eo");
      StreamTokenizer streamTokenizer0 = new StreamTokenizer(stringReader0);
      JSTerm jSTerm0 = new JSTerm(streamTokenizer0);
      jSTerm0.add((Object) stringReader0);
      JSSubstitution jSSubstitution0 = new JSSubstitution();
      // Undeclared exception!
      try { 
        jSTerm0.applySubstitutionPF(jSSubstitution0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  /**
  //Test case number: 29
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      JSPredicateForm jSPredicateForm0 = new JSPredicateForm();
      // Undeclared exception!
      try { 
        jSPredicateForm0.applySubstitutionPF((JSSubstitution) null);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 0 >= 0
         //
         verifyException("java.util.Vector", e);
      }
  }

  /**
  //Test case number: 30
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      StringReader stringReader0 = new StringReader("(FOS obf.4)^eo");
      JSTerm jSTerm0 = new JSTerm();
      stringReader0.close();
      StreamTokenizer streamTokenizer0 = new StreamTokenizer(stringReader0);
      // Undeclared exception!
      try { 
        jSTerm0.JSPredicateFormInit(streamTokenizer0);
        fail("Expecting exception: System.SystemExitException");
      
      } catch(System.SystemExitException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.evosuite.runtime.System", e);
      }
  }

  /**
  //Test case number: 31
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      JSPredicateForm jSPredicateForm0 = null;
      try {
        jSPredicateForm0 = new JSPredicateForm((StreamTokenizer) null);
        fail("Expecting exception: Error");
      
      } catch(Error e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("umd.cs.shop.JSPredicateForm", e);
      }
  }

  /**
  //Test case number: 32
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      StringReader stringReader0 = new StringReader("call ");
      stringReader0.close();
      StreamTokenizer streamTokenizer0 = new StreamTokenizer(stringReader0);
      JSPredicateForm jSPredicateForm0 = null;
      try {
        jSPredicateForm0 = new JSPredicateForm(streamTokenizer0);
        fail("Expecting exception: System.SystemExitException");
      
      } catch(System.SystemExitException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.evosuite.runtime.System", e);
      }
  }

  /**
  //Test case number: 33
  /*Coverage entropy=0.5623351446188083
  */
  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      StringReader stringReader0 = new StringReader("5Dj@");
      StreamTokenizer streamTokenizer0 = new StreamTokenizer(stringReader0);
      JSTerm jSTerm0 = new JSTerm(streamTokenizer0);
      JSTerm jSTerm1 = new JSTerm(streamTokenizer0);
      boolean boolean0 = jSTerm1.equals((JSPredicateForm) jSTerm0);
      assertFalse(boolean0);
  }

  /**
  //Test case number: 34
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      JSPredicateForm jSPredicateForm0 = new JSPredicateForm();
      boolean boolean0 = jSPredicateForm0.equals((JSPredicateForm) null);
      assertFalse(boolean0);
  }

  /**
  //Test case number: 35
  /*Coverage entropy=0.6365141682948128
  */
  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      StringReader stringReader0 = new StringReader("5Dj@");
      StreamTokenizer streamTokenizer0 = new StreamTokenizer(stringReader0);
      JSTerm jSTerm0 = new JSTerm(streamTokenizer0);
      JSTerm jSTerm1 = new JSTerm(streamTokenizer0);
      JSSubstitution jSSubstitution0 = new JSSubstitution();
      JSSubstitution jSSubstitution1 = jSTerm0.matches((JSPredicateForm) jSTerm1, jSSubstitution0);
      assertTrue(jSSubstitution1.fail());
  }

  /**
  //Test case number: 36
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      StringReader stringReader0 = new StringReader("(FOS obf.4)^eo");
      StreamTokenizer streamTokenizer0 = new StreamTokenizer(stringReader0);
      JSTerm jSTerm0 = new JSTerm(streamTokenizer0);
      JSTerm jSTerm1 = jSTerm0.standardizerTerm();
      jSTerm1.removeAllElements();
      JSSubstitution jSSubstitution0 = jSTerm0.matches((JSPredicateForm) jSTerm1);
      assertTrue(jSSubstitution0.fail());
  }

  /**
  //Test case number: 37
  /*Coverage entropy=0.5623351446188083
  */
  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      StringReader stringReader0 = new StringReader("(FdS obV.4)^eo");
      StreamTokenizer streamTokenizer0 = new StreamTokenizer(stringReader0);
      JSTerm jSTerm0 = new JSTerm(streamTokenizer0);
      JSPredicateForm jSPredicateForm0 = jSTerm0.clonePF();
      assertEquals("[FdS, [obV.4]]", jSPredicateForm0.toString());
  }

  /**
  //Test case number: 38
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      JSPredicateForm jSPredicateForm0 = new JSPredicateForm();
      StringBuffer stringBuffer0 = jSPredicateForm0.toStr();
      assertEquals("", stringBuffer0.toString());
  }

  /**
  //Test case number: 39
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      JSPredicateForm jSPredicateForm0 = new JSPredicateForm();
      jSPredicateForm0.print();
      assertEquals(10, jSPredicateForm0.capacity());
  }

  /**
  //Test case number: 40
  /*Coverage entropy=0.9849825930153653
  */
  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      StringReader stringReader0 = new StringReader("(ROp obf.4)^}eo");
      JSTerm jSTerm0 = new JSTerm();
      StreamTokenizer streamTokenizer0 = new StreamTokenizer(stringReader0);
      jSTerm0.JSPredicateFormInit(streamTokenizer0);
      JSPredicateForm jSPredicateForm0 = jSTerm0.standarizerPredicateForm();
      jSPredicateForm0.print();
      assertEquals("[ROp, [obf.4]]", jSPredicateForm0.toString());
  }

  /**
  //Test case number: 41
  /*Coverage entropy=0.24493002679463532
  */
  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      StringReader stringReader0 = new StringReader("(FdS obV.4Sl^eo");
      JSTerm jSTerm0 = new JSTerm();
      StreamTokenizer streamTokenizer0 = new StreamTokenizer(stringReader0);
      // Undeclared exception!
      try { 
        jSTerm0.JSPredicateFormInit(streamTokenizer0);
        fail("Expecting exception: Error");
      
      } catch(Error e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("umd.cs.shop.JSPredicateForm", e);
      }
  }

  /**
  //Test case number: 42
  /*Coverage entropy=0.2711893730418441
  */
  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      StringReader stringReader0 = new StringReader("(DOlp +bf.4)^}eo");
      JSTerm jSTerm0 = new JSTerm();
      StreamTokenizer streamTokenizer0 = new StreamTokenizer(stringReader0);
      streamTokenizer0.commentChar(43);
      // Undeclared exception!
      try { 
        jSTerm0.JSPredicateFormInit(streamTokenizer0);
        fail("Expecting exception: Error");
      
      } catch(Error e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("umd.cs.shop.JSPredicateForm", e);
      }
  }

  /**
  //Test case number: 43
  /*Coverage entropy=0.4293230219306162
  */
  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      JSPredicateForm jSPredicateForm0 = null;
      try {
        jSPredicateForm0 = new JSPredicateForm("(x");
        fail("Expecting exception: Error");
      
      } catch(Error e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("umd.cs.shop.JSPredicateForm", e);
      }
  }

  /**
  //Test case number: 44
  /*Coverage entropy=0.5623351446188083
  */
  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      JSPredicateForm jSPredicateForm0 = null;
      try {
        jSPredicateForm0 = new JSPredicateForm("(!1uJYCRf.9f0$]@cx");
        fail("Expecting exception: Error");
      
      } catch(Error e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("umd.cs.shop.JSPredicateForm", e);
      }
  }

  /**
  //Test case number: 45
  /*Coverage entropy=0.5297061990576545
  */
  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      JSPredicateForm jSPredicateForm0 = null;
      try {
        jSPredicateForm0 = new JSPredicateForm("(!rYRf.90$]@cx");
        fail("Expecting exception: Error");
      
      } catch(Error e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("umd.cs.shop.JSPredicateForm", e);
      }
  }

  /**
  //Test case number: 46
  /*Coverage entropy=0.6730116670092565
  */
  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      JSPredicateForm jSPredicateForm0 = null;
      try {
        jSPredicateForm0 = new JSPredicateForm("(");
        fail("Expecting exception: Error");
      
      } catch(Error e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("umd.cs.shop.JSPredicateForm", e);
      }
  }

  /**
  //Test case number: 47
  /*Coverage entropy=0.22371807606583377
  */
  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      StringReader stringReader0 = new StringReader("(FdS obV.4)^eo");
      JSTerm jSTerm0 = new JSTerm();
      StreamTokenizer streamTokenizer0 = new StreamTokenizer(stringReader0);
      jSTerm0.JSPredicateFormInit(streamTokenizer0);
      // Undeclared exception!
      try { 
        jSTerm0.JSPredicateFormInit(streamTokenizer0);
        fail("Expecting exception: Error");
      
      } catch(Error e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("umd.cs.shop.JSPredicateForm", e);
      }
  }

  /**
  //Test case number: 48
  /*Coverage entropy=0.24493002679463532
  */
  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      JSPredicateForm jSPredicateForm0 = new JSPredicateForm("(FUobV.4)^eo");
      // Undeclared exception!
      try { 
        jSPredicateForm0.JSPredicateFormInit((StreamTokenizer) null);
        fail("Expecting exception: Error");
      
      } catch(Error e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("umd.cs.shop.JSPredicateForm", e);
      }
  }

  /**
  //Test case number: 49
  /*Coverage entropy=0.8461447967228176
  */
  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      JSPredicateForm jSPredicateForm0 = new JSPredicateForm("(FdS obV.4)^eo");
      StringBuffer stringBuffer0 = jSPredicateForm0.toStr();
      assertEquals(11, stringBuffer0.length());
  }

  /**
  //Test case number: 50
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      JSPredicateForm jSPredicateForm0 = new JSPredicateForm((String) null);
      assertEquals(10, jSPredicateForm0.capacity());
  }

  /**
  //Test case number: 51
  /*Coverage entropy=0.25731864054383163
  */
  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      StringReader stringReader0 = new StringReader("(FUobV.4)^eo");
      StreamTokenizer streamTokenizer0 = new StreamTokenizer(stringReader0);
      JSPredicateForm jSPredicateForm0 = new JSPredicateForm(streamTokenizer0);
      assertEquals(1, jSPredicateForm0.size());
  }

  /**
  //Test case number: 52
  /*Coverage entropy=0.7356219397587946
  */
  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      StringReader stringReader0 = new StringReader("(FOS obf.4)^eo");
      StreamTokenizer streamTokenizer0 = new StreamTokenizer(stringReader0);
      JSTerm jSTerm0 = new JSTerm(streamTokenizer0);
      JSSubstitution jSSubstitution0 = jSTerm0.matches((JSPredicateForm) jSTerm0);
      assertFalse(jSSubstitution0.fail());
  }
}
