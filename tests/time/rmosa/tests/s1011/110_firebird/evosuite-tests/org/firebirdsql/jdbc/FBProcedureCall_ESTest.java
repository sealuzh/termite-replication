/*
 * This file was automatically generated by EvoSuite
 * Sat Nov 28 22:16:23 GMT 2020
 */

package org.firebirdsql.jdbc;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.List;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.firebirdsql.jdbc.FBProcedureCall;
import org.firebirdsql.jdbc.FBProcedureParam;
import org.firebirdsql.jdbc.FBSQLException;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class FBProcedureCall_ESTest extends FBProcedureCall_ESTest_scaffolding {

  /**
  //Test case number: 0
  /*Coverage entropy=1.5859341131926616
  */
  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      FBProcedureParam fBProcedureParam0 = new FBProcedureParam(439, "org.firebirdsql.jdbc.FBProcedureParam");
      fBProcedureCall0.addParam(0, "dv?");
      fBProcedureCall0.addOutputParam(fBProcedureParam0);
      fBProcedureCall0.registerOutParam((-1), 0);
      assertNull(fBProcedureCall0.getName());
  }

  /**
  //Test case number: 1
  /*Coverage entropy=1.4184836619456564
  */
  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      try { 
        fBProcedureCall0.registerOutParam(429, 1188);
        fail("Expecting exception: FBSQLException");
      
      } catch(FBSQLException e) {
         //
         // Cannot find parameter with the specified position.
         //
         verifyException("org.firebirdsql.jdbc.FBProcedureCall", e);
      }
  }

  /**
  //Test case number: 2
  /*Coverage entropy=1.0832550105185086
  */
  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      FBProcedureParam fBProcedureParam0 = fBProcedureCall0.addParam(7, "dV?:*AR");
      fBProcedureCall0.addOutputParam(fBProcedureParam0);
      try { 
        fBProcedureCall0.mapOutParamIndexToPosition(1376, false);
        fail("Expecting exception: FBSQLException");
      
      } catch(FBSQLException e) {
         //
         // Specified parameter does not exist.
         //
         verifyException("org.firebirdsql.jdbc.FBProcedureCall", e);
      }
  }

  /**
  //Test case number: 3
  /*Coverage entropy=1.235144651532666
  */
  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      FBProcedureParam fBProcedureParam0 = fBProcedureCall0.addParam(1182, " ostand ");
      fBProcedureParam0.setIndex(1182);
      assertEquals(1182, fBProcedureParam0.getPosition());
      
      FBProcedureParam fBProcedureParam1 = fBProcedureCall0.getInputParam(3);
      assertEquals(0, fBProcedureParam1.getPosition());
  }

  /**
  //Test case number: 4
  /*Coverage entropy=0.6365141682948128
  */
  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      int int0 = fBProcedureCall0.mapOutParamIndexToPosition(4323, true);
      assertEquals(4323, int0);
  }

  /**
  //Test case number: 5
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      FBProcedureParam fBProcedureParam0 = new FBProcedureParam();
      fBProcedureCall0.addOutputParam(fBProcedureParam0);
      List<FBProcedureParam> list0 = fBProcedureCall0.getOutputParams();
      assertEquals(1, list0.size());
  }

  /**
  //Test case number: 6
  /*Coverage entropy=1.15374194270109
  */
  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      FBProcedureParam fBProcedureParam0 = new FBProcedureParam(7, "dV?:*AR");
      Object object0 = new Object();
      fBProcedureParam0.setValue(object0);
      fBProcedureParam0.setIndex(7);
      fBProcedureCall0.addOutputParam(fBProcedureParam0);
      FBProcedureParam fBProcedureParam1 = fBProcedureCall0.getOutputParam(7);
      assertEquals(7, fBProcedureParam1.getIndex());
  }

  /**
  //Test case number: 7
  /*Coverage entropy=1.242453324894
  */
  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      FBProcedureParam fBProcedureParam0 = new FBProcedureParam();
      fBProcedureParam0.setType(888);
      fBProcedureParam0.setIndex((-71));
      fBProcedureCall0.addOutputParam(fBProcedureParam0);
      FBProcedureParam fBProcedureParam1 = fBProcedureCall0.getOutputParam((-71));
      assertEquals((-71), fBProcedureParam1.getIndex());
  }

  /**
  //Test case number: 8
  /*Coverage entropy=1.3114313374732374
  */
  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      FBProcedureParam fBProcedureParam0 = fBProcedureCall0.addParam(7, "dV?:*AR");
      fBProcedureCall0.addOutputParam(fBProcedureParam0);
      fBProcedureParam0.setType((-1157));
      fBProcedureParam0.setIndex(7);
      FBProcedureParam fBProcedureParam1 = fBProcedureCall0.getOutputParam(7);
      assertEquals(7, fBProcedureParam1.getPosition());
  }

  /**
  //Test case number: 9
  /*Coverage entropy=1.242453324894
  */
  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      FBProcedureParam fBProcedureParam0 = new FBProcedureParam(0, "07006");
      fBProcedureParam0.setIndex(0);
      fBProcedureCall0.addOutputParam(fBProcedureParam0);
      FBProcedureParam fBProcedureParam1 = fBProcedureCall0.getOutputParam(0);
      assertEquals(0, fBProcedureParam1.getIndex());
  }

  /**
  //Test case number: 10
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      fBProcedureCall0.setName(":zl");
      String string0 = fBProcedureCall0.getName();
      assertEquals(":zl", string0);
  }

  /**
  //Test case number: 11
  /*Coverage entropy=0.8675632284814612
  */
  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      fBProcedureCall0.addParam(63, "dv");
      List<FBProcedureParam> list0 = fBProcedureCall0.getInputParams();
      assertEquals(64, list0.size());
  }

  /**
  //Test case number: 12
  /*Coverage entropy=1.204793309694784
  */
  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      FBProcedureParam fBProcedureParam0 = fBProcedureCall0.addParam(7, "dV?:*AR");
      fBProcedureParam0.setValue(fBProcedureCall0);
      FBProcedureParam fBProcedureParam1 = fBProcedureCall0.getInputParam((-1));
      assertEquals(7, fBProcedureParam1.getPosition());
  }

  /**
  //Test case number: 13
  /*Coverage entropy=1.204793309694784
  */
  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      FBProcedureParam fBProcedureParam0 = fBProcedureCall0.addParam(1182, " ostand ");
      fBProcedureParam0.setType(1182);
      fBProcedureParam0.setIndex(1182);
      FBProcedureParam fBProcedureParam1 = fBProcedureCall0.getInputParam(1182);
      assertEquals(1182, fBProcedureParam1.getPosition());
  }

  /**
  //Test case number: 14
  /*Coverage entropy=1.4805157682514472
  */
  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      FBProcedureParam fBProcedureParam0 = fBProcedureCall0.addParam(1182, " ostand ");
      fBProcedureParam0.setIndex(1182);
      fBProcedureCall0.registerOutParam(1182, (-3699));
      FBProcedureParam fBProcedureParam1 = fBProcedureCall0.getInputParam(1182);
      assertEquals((-3699), fBProcedureParam1.getType());
      assertEquals(1182, fBProcedureParam1.getPosition());
  }

  /**
  //Test case number: 15
  /*Coverage entropy=1.2148896539491203
  */
  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      FBProcedureParam fBProcedureParam0 = new FBProcedureParam();
      fBProcedureParam0.setIndex(1182);
      fBProcedureCall0.addOutputParam(fBProcedureParam0);
      FBProcedureParam fBProcedureParam1 = fBProcedureCall0.getInputParam(1182);
      assertEquals(1182, fBProcedureParam1.getIndex());
  }

  /**
  //Test case number: 16
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      fBProcedureCall0.setName((String) null);
      assertTrue(FBProcedureCall.OLD_CALLABLE_STATEMENT_COMPATIBILITY);
  }

  /**
  //Test case number: 17
  /*Coverage entropy=1.15374194270109
  */
  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      // Undeclared exception!
      try { 
        fBProcedureCall0.registerOutParam(0, 0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -1
         //
         verifyException("java.util.Vector", e);
      }
  }

  /**
  //Test case number: 18
  /*Coverage entropy=0.6365141682948128
  */
  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      int int0 = fBProcedureCall0.mapOutParamIndexToPosition(0, true);
      assertEquals(0, int0);
  }

  /**
  //Test case number: 19
  /*Coverage entropy=1.0397207708399179
  */
  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      int int0 = fBProcedureCall0.mapOutParamIndexToPosition((-123));
      assertEquals((-123), int0);
  }

  /**
  //Test case number: 20
  /*Coverage entropy=0.6365141682948128
  */
  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      boolean boolean0 = fBProcedureCall0.equals((Object) null);
      assertFalse(boolean0);
  }

  /**
  //Test case number: 21
  /*Coverage entropy=1.7262612680766163
  */
  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      FBProcedureParam fBProcedureParam0 = fBProcedureCall0.addParam(4454, " ostand ");
      fBProcedureCall0.addOutputParam(fBProcedureParam0);
      // Undeclared exception!
      fBProcedureCall0.registerOutParam(4454, 4454);
  }

  /**
  //Test case number: 22
  /*Coverage entropy=1.0832550105185086
  */
  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      FBProcedureParam fBProcedureParam0 = new FBProcedureParam();
      fBProcedureCall0.addOutputParam(fBProcedureParam0);
      fBProcedureCall0.addParam(7, "dV?:*AR");
      // Undeclared exception!
      try { 
        fBProcedureCall0.getSQL(true);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // Array index out of range: 7
         //
         verifyException("java.util.Vector", e);
      }
  }

  /**
  //Test case number: 23
  /*Coverage entropy=1.5335908003183834
  */
  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      FBProcedureParam fBProcedureParam0 = fBProcedureCall0.addParam(4454, "07pp5");
      fBProcedureCall0.addOutputParam(fBProcedureParam0);
      fBProcedureCall0.getInputParam(1182);
      // Undeclared exception!
      fBProcedureCall0.getOutputParam(1182);
  }

  /**
  //Test case number: 24
  /*Coverage entropy=1.4490023958526383
  */
  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      fBProcedureCall0.addParam(4454, "07pp5");
      fBProcedureCall0.registerOutParam((-1), 3);
      // Undeclared exception!
      fBProcedureCall0.getInputParam(1182);
  }

  /**
  //Test case number: 25
  /*Coverage entropy=0.8675632284814612
  */
  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      // Undeclared exception!
      try { 
        fBProcedureCall0.getInputParam(0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -1
         //
         verifyException("java.util.Vector", e);
      }
  }

  /**
  //Test case number: 26
  /*Coverage entropy=1.277034259466139
  */
  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      fBProcedureCall0.getInputParam(27707229);
      // Undeclared exception!
      fBProcedureCall0.clone();
  }

  /**
  //Test case number: 27
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      // Undeclared exception!
      try { 
        fBProcedureCall0.addParam(32, (String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.firebirdsql.jdbc.FBProcedureCall", e);
      }
  }

  /**
  //Test case number: 28
  /*Coverage entropy=0.37677016125643675
  */
  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      // Undeclared exception!
      try { 
        fBProcedureCall0.addParam((-1), "EXECUTE PROCEDURE null(dV?:*AR)");
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -1
         //
         verifyException("java.util.Vector", e);
      }
  }

  /**
  //Test case number: 29
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      // Undeclared exception!
      try { 
        fBProcedureCall0.addOutputParam((FBProcedureParam) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.firebirdsql.jdbc.FBProcedureCall", e);
      }
  }

  /**
  //Test case number: 30
  /*Coverage entropy=0.6365141682948128
  */
  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      FBProcedureParam fBProcedureParam0 = new FBProcedureParam((-371), "o|s");
      // Undeclared exception!
      try { 
        fBProcedureCall0.addOutputParam(fBProcedureParam0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -371
         //
         verifyException("java.util.Vector", e);
      }
  }

  /**
  //Test case number: 31
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      // Undeclared exception!
      try { 
        fBProcedureCall0.addInputParam((FBProcedureParam) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.firebirdsql.jdbc.FBProcedureCall", e);
      }
  }

  /**
  //Test case number: 32
  /*Coverage entropy=0.6365141682948128
  */
  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      FBProcedureParam fBProcedureParam0 = new FBProcedureParam((-537), "org.firebirdsql.jdbc.FBSQLException");
      // Undeclared exception!
      try { 
        fBProcedureCall0.addInputParam(fBProcedureParam0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  /**
  //Test case number: 33
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      fBProcedureCall0.setName("0006");
      fBProcedureCall0.hashCode();
  }

  /**
  //Test case number: 34
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      fBProcedureCall0.hashCode();
  }

  /**
  //Test case number: 35
  /*Coverage entropy=1.2130075659799042
  */
  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      FBProcedureCall fBProcedureCall1 = (FBProcedureCall)fBProcedureCall0.clone();
      fBProcedureCall1.setName("");
      boolean boolean0 = fBProcedureCall0.equals(fBProcedureCall1);
      //  // Unstable assertion: assertFalse(boolean0);
      //  // Unstable assertion: assertTrue(fBProcedureCall1.equals((Object)fBProcedureCall0));
  }

  /**
  //Test case number: 36
  /*Coverage entropy=1.277034259466139
  */
  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      fBProcedureCall0.setName(":zl");
      Object object0 = fBProcedureCall0.clone();
      boolean boolean0 = fBProcedureCall0.equals(object0);
      assertTrue(boolean0);
      assertNotSame(object0, fBProcedureCall0);
  }

  /**
  //Test case number: 37
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      boolean boolean0 = fBProcedureCall0.equals(fBProcedureCall0);
      assertTrue(boolean0);
  }

  /**
  //Test case number: 38
  /*Coverage entropy=0.8277381569989198
  */
  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      fBProcedureCall0.addParam(7, "dV?:*AR");
      FBProcedureParam fBProcedureParam0 = fBProcedureCall0.addParam(37, "dV?:*AR");
      assertEquals(37, fBProcedureParam0.getPosition());
      
      String string0 = fBProcedureCall0.getSQL(false);
      assertEquals("EXECUTE PROCEDURE null(dV?:*AR, dV?:*AR)", string0);
  }

  /**
  //Test case number: 39
  /*Coverage entropy=1.053395498360576
  */
  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      FBProcedureParam fBProcedureParam0 = fBProcedureCall0.addParam(706, "dV?:*AR");
      fBProcedureCall0.addParam(7, "dV?:*AR");
      fBProcedureCall0.addOutputParam(fBProcedureParam0);
      try { 
        fBProcedureCall0.getSQL(false);
        fail("Expecting exception: FBSQLException");
      
      } catch(FBSQLException e) {
         //
         // Value of parameter -1 not set and it was not registered as output parameter.
         //
         verifyException("org.firebirdsql.jdbc.FBProcedureCall", e);
      }
  }

  /**
  //Test case number: 40
  /*Coverage entropy=0.9903650414743139
  */
  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      FBProcedureParam fBProcedureParam0 = fBProcedureCall0.addParam(7, "dV?:*AR");
      fBProcedureCall0.addOutputParam(fBProcedureParam0);
      assertEquals(7, fBProcedureParam0.getPosition());
      
      String string0 = fBProcedureCall0.getSQL(false);
      assertEquals("EXECUTE PROCEDURE null(dV?:*AR)", string0);
  }

  /**
  //Test case number: 41
  /*Coverage entropy=0.8647400965276372
  */
  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      FBProcedureParam fBProcedureParam0 = fBProcedureCall0.addParam(7, "!{l{.k&EH0L.@X_");
      assertEquals(7, fBProcedureParam0.getPosition());
      
      String string0 = fBProcedureCall0.getSQL(true);
      assertEquals("SELECT * FROM null(!{l{.k&EH0L.@X_)", string0);
  }

  /**
  //Test case number: 42
  /*Coverage entropy=0.8823109245150755
  */
  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      FBProcedureParam fBProcedureParam0 = fBProcedureCall0.addParam(7, "dV?:*AR");
      fBProcedureParam0.setValue(fBProcedureCall0);
      assertEquals(7, fBProcedureParam0.getPosition());
      
      String string0 = fBProcedureCall0.getSQL(true);
      assertEquals("SELECT * FROM null(dV?:*AR)", string0);
  }

  /**
  //Test case number: 43
  /*Coverage entropy=0.5623351446188083
  */
  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      String string0 = fBProcedureCall0.getSQL(true);
      assertEquals("SELECT * FROM null", string0);
  }

  /**
  //Test case number: 44
  /*Coverage entropy=1.3917397695183338
  */
  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      FBProcedureParam fBProcedureParam0 = new FBProcedureParam(7, "F!h,j&mGR2?/U");
      fBProcedureParam0.setValue(fBProcedureCall0);
      fBProcedureParam0.setIndex(7);
      fBProcedureCall0.addOutputParam(fBProcedureParam0);
      fBProcedureCall0.registerOutParam(7, 7);
      assertTrue(FBProcedureCall.OLD_CALLABLE_STATEMENT_COMPATIBILITY);
  }

  /**
  //Test case number: 45
  /*Coverage entropy=0.37677016125643675
  */
  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      FBProcedureParam fBProcedureParam0 = fBProcedureCall0.addParam(740, " oUtane ");
      assertEquals(740, fBProcedureParam0.getPosition());
      assertEquals("oUtane", fBProcedureParam0.getParamValue());
  }

  /**
  //Test case number: 46
  /*Coverage entropy=0.5004024235381879
  */
  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      FBProcedureParam fBProcedureParam0 = fBProcedureCall0.addParam(1, "");
      assertEquals(1, fBProcedureParam0.getPosition());
  }

  /**
  //Test case number: 47
  /*Coverage entropy=0.8486855577264172
  */
  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      FBProcedureParam fBProcedureParam0 = fBProcedureCall0.addParam(7, "dV?:*AR");
      fBProcedureCall0.addOutputParam(fBProcedureParam0);
      fBProcedureCall0.addOutputParam(fBProcedureParam0);
      assertEquals(7, fBProcedureParam0.getPosition());
  }

  /**
  //Test case number: 48
  /*Coverage entropy=0.5660857389596289
  */
  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      FBProcedureParam fBProcedureParam0 = new FBProcedureParam(7041, "out");
      fBProcedureCall0.addInputParam(fBProcedureParam0);
      fBProcedureCall0.getSQL(true);
      // Undeclared exception!
      fBProcedureCall0.getSQL(false);
  }

  /**
  //Test case number: 49
  /*Coverage entropy=0.7356219397587946
  */
  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      FBProcedureParam fBProcedureParam0 = fBProcedureCall0.addParam(7, "dV?:*AR");
      fBProcedureCall0.addInputParam(fBProcedureParam0);
      assertEquals(7, fBProcedureParam0.getPosition());
  }

  /**
  //Test case number: 50
  /*Coverage entropy=1.0735428464085233
  */
  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      FBProcedureParam fBProcedureParam0 = new FBProcedureParam(7, "dV?:*AR");
      fBProcedureParam0.setIndex(7);
      fBProcedureCall0.addOutputParam(fBProcedureParam0);
      int int0 = fBProcedureCall0.mapOutParamIndexToPosition(7);
      assertEquals(1, int0);
  }

  /**
  //Test case number: 51
  /*Coverage entropy=0.7963116401738131
  */
  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      FBProcedureParam fBProcedureParam0 = new FBProcedureParam();
      fBProcedureCall0.addOutputParam(fBProcedureParam0);
      try { 
        fBProcedureCall0.mapOutParamIndexToPosition((-71), false);
        fail("Expecting exception: FBSQLException");
      
      } catch(FBSQLException e) {
         //
         // Specified parameter does not exist.
         //
         verifyException("org.firebirdsql.jdbc.FBProcedureCall", e);
      }
  }

  /**
  //Test case number: 52
  /*Coverage entropy=1.0832550105185086
  */
  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      FBProcedureParam fBProcedureParam0 = fBProcedureCall0.addParam(7, "dV?:*AR");
      fBProcedureCall0.addOutputParam(fBProcedureParam0);
      assertEquals(7, fBProcedureParam0.getPosition());
      
      int int0 = fBProcedureCall0.mapOutParamIndexToPosition((-1157), true);
      assertEquals((-1157), int0);
  }

  /**
  //Test case number: 53
  /*Coverage entropy=0.7963116401738131
  */
  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      FBProcedureParam fBProcedureParam0 = new FBProcedureParam(2536, "@WlgDrvt>n!");
      fBProcedureCall0.addOutputParam(fBProcedureParam0);
      Object object0 = fBProcedureCall0.clone();
      assertNotSame(object0, fBProcedureCall0);
      assertTrue(object0.equals((Object)fBProcedureCall0));
  }

  /**
  //Test case number: 54
  /*Coverage entropy=0.9184277849930976
  */
  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      FBProcedureParam fBProcedureParam0 = fBProcedureCall0.addParam(7, "dV?:*AR");
      assertEquals(7, fBProcedureParam0.getPosition());
      
      Object object0 = fBProcedureCall0.clone();
      assertNotSame(object0, fBProcedureCall0);
      assertTrue(object0.equals((Object)fBProcedureCall0));
  }

  /**
  //Test case number: 55
  /*Coverage entropy=0.9556998911125343
  */
  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      Object object0 = fBProcedureCall0.clone();
      boolean boolean0 = fBProcedureCall0.equals(object0);
      assertTrue(boolean0);
      assertNotSame(object0, fBProcedureCall0);
  }

  /**
  //Test case number: 56
  /*Coverage entropy=1.2424533248940002
  */
  @Test(timeout = 4000)
  public void test56()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      FBProcedureParam fBProcedureParam0 = fBProcedureCall0.getInputParam(2);
      try { 
        fBProcedureParam0.setValue(fBProcedureParam0);
        fail("Expecting exception: FBSQLException");
      
      } catch(FBSQLException e) {
         //
         // You cannot set value of an non-existing parameter.
         //
         verifyException("org.firebirdsql.jdbc.FBProcedureCall$NullParam", e);
      }
  }

  /**
  //Test case number: 57
  /*Coverage entropy=1.0397207708399179
  */
  @Test(timeout = 4000)
  public void test57()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      int int0 = fBProcedureCall0.mapOutParamIndexToPosition(0);
      assertEquals(0, int0);
  }

  /**
  //Test case number: 58
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test58()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      String string0 = fBProcedureCall0.getName();
      assertNull(string0);
  }

  /**
  //Test case number: 59
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test59()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      List<FBProcedureParam> list0 = fBProcedureCall0.getInputParams();
      assertTrue(list0.isEmpty());
  }

  /**
  //Test case number: 60
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test60()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      fBProcedureCall0.setName("");
      String string0 = fBProcedureCall0.getName();
      assertEquals("", string0);
  }

  /**
  //Test case number: 61
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test61()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      List<FBProcedureParam> list0 = fBProcedureCall0.getOutputParams();
      assertEquals(0, list0.size());
  }
}
