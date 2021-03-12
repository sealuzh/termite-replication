/*
 * This file was automatically generated by EvoSuite
 * Fri Nov 27 23:39:34 GMT 2020
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
  /*Coverage entropy=1.4479871140961187
  */
  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      fBProcedureCall0.addParam(772, "iP$;l1ktUxu29Z+f|1a");
      fBProcedureCall0.registerOutParam((-1), 772);
      assertNull(fBProcedureCall0.getName());
  }

  /**
  //Test case number: 1
  /*Coverage entropy=1.5741030017371853
  */
  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      FBProcedureParam fBProcedureParam0 = fBProcedureCall0.addParam(37, "iP$;l1ktUxu29Z+f|1a");
      fBProcedureParam0.setIndex(56);
      FBProcedureParam fBProcedureParam1 = fBProcedureCall0.addParam(56, "iP$;l1ktUxu29Z+f|1a");
      fBProcedureCall0.addOutputParam(fBProcedureParam1);
      fBProcedureCall0.registerOutParam(56, 56);
      assertTrue(FBProcedureCall.OLD_CALLABLE_STATEMENT_COMPATIBILITY);
  }

  /**
  //Test case number: 2
  /*Coverage entropy=1.4184836619456564
  */
  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      try { 
        fBProcedureCall0.registerOutParam(1, 9);
        fail("Expecting exception: FBSQLException");
      
      } catch(FBSQLException e) {
         //
         // Cannot find parameter with the specified position.
         //
         verifyException("org.firebirdsql.jdbc.FBProcedureCall", e);
      }
  }

  /**
  //Test case number: 3
  /*Coverage entropy=0.5004024235381879
  */
  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      FBProcedureParam fBProcedureParam0 = fBProcedureCall0.addParam(201, "yh");
      assertEquals(201, fBProcedureParam0.getPosition());
  }

  /**
  //Test case number: 4
  /*Coverage entropy=0.7356219397587946
  */
  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      FBProcedureParam fBProcedureParam0 = fBProcedureCall0.addParam(18, "ptR(|k");
      fBProcedureCall0.addInputParam(fBProcedureParam0);
      assertEquals(18, fBProcedureParam0.getPosition());
  }

  /**
  //Test case number: 5
  /*Coverage entropy=1.0832550105185086
  */
  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      FBProcedureParam fBProcedureParam0 = fBProcedureCall0.addParam(2623, "-GNsrL!B@3A:?Oa?,");
      fBProcedureCall0.addOutputParam(fBProcedureParam0);
      try { 
        fBProcedureCall0.mapOutParamIndexToPosition((-2644), false);
        fail("Expecting exception: FBSQLException");
      
      } catch(FBSQLException e) {
         //
         // Specified parameter does not exist.
         //
         verifyException("org.firebirdsql.jdbc.FBProcedureCall", e);
      }
  }

  /**
  //Test case number: 6
  /*Coverage entropy=0.9433483923290392
  */
  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      fBProcedureCall0.getInputParam(5);
      FBProcedureParam fBProcedureParam0 = fBProcedureCall0.getInputParam(5);
      assertEquals((-1), fBProcedureParam0.getIndex());
  }

  /**
  //Test case number: 7
  /*Coverage entropy=0.6365141682948128
  */
  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      int int0 = fBProcedureCall0.mapOutParamIndexToPosition((-139942997), true);
      assertEquals((-139942997), int0);
  }

  /**
  //Test case number: 8
  /*Coverage entropy=1.5992212565872683
  */
  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      FBProcedureParam fBProcedureParam0 = fBProcedureCall0.addParam(0, "");
      fBProcedureParam0.setIndex(0);
      fBProcedureCall0.registerOutParam(0, 0);
      List<FBProcedureParam> list0 = fBProcedureCall0.getOutputParams();
      assertEquals(1, list0.size());
  }

  /**
  //Test case number: 9
  /*Coverage entropy=1.4906920334256557
  */
  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      FBProcedureParam fBProcedureParam0 = fBProcedureCall0.addParam(0, "");
      FBProcedureParam fBProcedureParam1 = fBProcedureCall0.addParam(0, "A1h|SHC'#W^~%d?=bF^");
      fBProcedureParam1.setValue(fBProcedureParam0);
      fBProcedureParam1.setIndex(0);
      fBProcedureCall0.registerOutParam(0, 0);
      FBProcedureParam fBProcedureParam2 = fBProcedureCall0.getOutputParam(0);
      assertEquals(0, fBProcedureParam2.getType());
      assertTrue(fBProcedureParam2.isValueSet());
      assertEquals(0, fBProcedureParam2.getPosition());
  }

  /**
  //Test case number: 10
  /*Coverage entropy=1.5663734603316575
  */
  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      FBProcedureParam fBProcedureParam0 = fBProcedureCall0.addParam(0, "A1h|SHC'#W^~%d?=bF^");
      fBProcedureParam0.setIndex(0);
      fBProcedureCall0.registerOutParam(0, 0);
      FBProcedureParam fBProcedureParam1 = fBProcedureCall0.getOutputParam(0);
      assertEquals(0, fBProcedureParam1.getIndex());
      assertEquals(0, fBProcedureParam1.getPosition());
      assertEquals(0, fBProcedureParam1.getType());
  }

  /**
  //Test case number: 11
  /*Coverage entropy=1.5741030017371853
  */
  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      FBProcedureParam fBProcedureParam0 = fBProcedureCall0.addParam(55, "You cannot set value of an nn-existing prameter.");
      fBProcedureParam0.setIndex(55);
      fBProcedureCall0.registerOutParam(55, 55);
      FBProcedureParam fBProcedureParam1 = fBProcedureCall0.getOutputParam(55);
      assertEquals(55, fBProcedureParam1.getType());
      assertEquals(55, fBProcedureParam1.getPosition());
  }

  /**
  //Test case number: 12
  /*Coverage entropy=1.15374194270109
  */
  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      FBProcedureParam fBProcedureParam0 = new FBProcedureParam(803, "out");
      fBProcedureCall0.addOutputParam(fBProcedureParam0);
      FBProcedureParam fBProcedureParam1 = fBProcedureCall0.getOutputParam((-1));
      assertEquals(803, fBProcedureParam1.getPosition());
  }

  /**
  //Test case number: 13
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      fBProcedureCall0.setName("A1h|SHVW]'%d?=b(^");
      String string0 = fBProcedureCall0.getName();
      assertEquals("A1h|SHVW]'%d?=b(^", string0);
  }

  /**
  //Test case number: 14
  /*Coverage entropy=1.242453324894
  */
  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      fBProcedureCall0.getInputParam(23);
      List<FBProcedureParam> list0 = fBProcedureCall0.getInputParams();
      assertEquals(23, list0.size());
  }

  /**
  //Test case number: 15
  /*Coverage entropy=1.0775733728921972
  */
  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      FBProcedureParam fBProcedureParam0 = fBProcedureCall0.addParam(0, "");
      FBProcedureParam fBProcedureParam1 = fBProcedureCall0.addParam(0, "A1h|SHC'#W^~%d?=bF^");
      fBProcedureParam1.setValue(fBProcedureParam0);
      FBProcedureParam fBProcedureParam2 = fBProcedureCall0.getInputParam((-1));
      assertEquals(0, fBProcedureParam2.getPosition());
  }

  /**
  //Test case number: 16
  /*Coverage entropy=1.4805157682514472
  */
  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      FBProcedureParam fBProcedureParam0 = fBProcedureCall0.addParam(18, "You cannot set value of an non-existing parameter.");
      fBProcedureParam0.setIndex(18);
      fBProcedureCall0.registerOutParam(18, 18);
      FBProcedureParam fBProcedureParam1 = fBProcedureCall0.getInputParam(18);
      assertEquals(18, fBProcedureParam1.getPosition());
      assertEquals(18, fBProcedureParam1.getType());
  }

  /**
  //Test case number: 17
  /*Coverage entropy=1.204793309694784
  */
  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      FBProcedureParam fBProcedureParam0 = fBProcedureCall0.addParam(39, "iP$;l1ktUxu29Z+f|1a");
      fBProcedureParam0.setIndex((-75911319));
      fBProcedureParam0.setType((-75911319));
      FBProcedureParam fBProcedureParam1 = fBProcedureCall0.getInputParam((-75911319));
      assertEquals(39, fBProcedureParam1.getPosition());
  }

  /**
  //Test case number: 18
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      fBProcedureCall0.setName((String) null);
      assertTrue(FBProcedureCall.OLD_CALLABLE_STATEMENT_COMPATIBILITY);
  }

  /**
  //Test case number: 19
  /*Coverage entropy=1.15374194270109
  */
  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      // Undeclared exception!
      try { 
        fBProcedureCall0.registerOutParam((-3048), (-3048));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -3049
         //
         verifyException("java.util.Vector", e);
      }
  }

  /**
  //Test case number: 20
  /*Coverage entropy=1.0397207708399179
  */
  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      int int0 = fBProcedureCall0.mapOutParamIndexToPosition(0);
      assertEquals(0, int0);
  }

  /**
  //Test case number: 21
  /*Coverage entropy=1.0397207708399179
  */
  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      int int0 = fBProcedureCall0.mapOutParamIndexToPosition((-2));
      assertEquals((-2), int0);
  }

  /**
  //Test case number: 22
  /*Coverage entropy=0.8675632284814612
  */
  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
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
  //Test case number: 23
  /*Coverage entropy=0.6365141682948128
  */
  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      boolean boolean0 = fBProcedureCall0.equals((Object) null);
      assertFalse(boolean0);
  }

  /**
  //Test case number: 24
  /*Coverage entropy=1.162225544921092
  */
  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      fBProcedureCall0.getInputParam(5121);
      fBProcedureCall0.getInputParam(40);
      // Undeclared exception!
      fBProcedureCall0.registerOutParam(40, 40);
  }

  /**
  //Test case number: 25
  /*Coverage entropy=0.8463658296262874
  */
  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      fBProcedureCall0.addParam(5320, ">if?]Wttr");
      fBProcedureCall0.getSQL(true);
      // Undeclared exception!
      fBProcedureCall0.getSQL(true);
  }

  /**
  //Test case number: 26
  /*Coverage entropy=1.0832550105185086
  */
  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      FBProcedureParam fBProcedureParam0 = new FBProcedureParam();
      fBProcedureCall0.addOutputParam(fBProcedureParam0);
      fBProcedureCall0.addParam(81, "m@f?]Wtt=r");
      // Undeclared exception!
      try { 
        fBProcedureCall0.getSQL(true);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // Array index out of range: 81
         //
         verifyException("java.util.Vector", e);
      }
  }

  /**
  //Test case number: 27
  /*Coverage entropy=1.1490596969706204
  */
  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      fBProcedureCall0.addParam(27707229, "ip;");
      // Undeclared exception!
      fBProcedureCall0.getInputParam(3025);
  }

  /**
  //Test case number: 28
  /*Coverage entropy=0.9184277849930976
  */
  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      fBProcedureCall0.addParam(6062, "Muv}Q$Aq[");
      fBProcedureCall0.clone();
      // Undeclared exception!
      fBProcedureCall0.clone();
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
        fBProcedureCall0.addParam(0, (String) null);
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
  /*Coverage entropy=0.37677016125643675
  */
  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      // Undeclared exception!
      try { 
        fBProcedureCall0.addParam((-561), "You cannot set value of an non-existing parameter.");
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -561
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
  //Test case number: 32
  /*Coverage entropy=0.6365141682948128
  */
  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      FBProcedureParam fBProcedureParam0 = new FBProcedureParam((-138121261), "mo");
      // Undeclared exception!
      try { 
        fBProcedureCall0.addOutputParam(fBProcedureParam0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -138121261
         //
         verifyException("java.util.Vector", e);
      }
  }

  /**
  //Test case number: 33
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
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
  //Test case number: 34
  /*Coverage entropy=0.6365141682948128
  */
  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      FBProcedureParam fBProcedureParam0 = new FBProcedureParam((-2291), "m@|");
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
  //Test case number: 35
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      fBProcedureCall0.setName("EXECUTE PROCEDURE null");
      fBProcedureCall0.hashCode();
  }

  /**
  //Test case number: 36
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      fBProcedureCall0.hashCode();
  }

  /**
  //Test case number: 37
  /*Coverage entropy=0.8675632284814612
  */
  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      FBProcedureCall fBProcedureCall1 = new FBProcedureCall();
      fBProcedureCall1.setName("{C* ;w(w~??]6g^3");
      boolean boolean0 = fBProcedureCall0.equals(fBProcedureCall1);
      //  // Unstable assertion: assertTrue(fBProcedureCall1.equals((Object)fBProcedureCall0));
      //  // Unstable assertion: assertFalse(boolean0);
  }

  /**
  //Test case number: 38
  /*Coverage entropy=0.9502705392332347
  */
  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      fBProcedureCall0.setName("-7;7IB%");
      FBProcedureCall fBProcedureCall1 = new FBProcedureCall();
      boolean boolean0 = fBProcedureCall0.equals(fBProcedureCall1);
      //  // Unstable assertion: assertTrue(boolean0);
      //  // Unstable assertion: assertFalse(fBProcedureCall1.equals((Object)fBProcedureCall0));
  }

  /**
  //Test case number: 39
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      boolean boolean0 = fBProcedureCall0.equals(fBProcedureCall0);
      assertTrue(boolean0);
  }

  /**
  //Test case number: 40
  /*Coverage entropy=1.3904950585899565
  */
  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      FBProcedureParam fBProcedureParam0 = fBProcedureCall0.addParam(0, "");
      assertEquals(0, fBProcedureParam0.getPosition());
      
      fBProcedureCall0.getInputParam(40);
      String string0 = fBProcedureCall0.getSQL(false);
      assertEquals("EXECUTE PROCEDURE null(, null)", string0);
  }

  /**
  //Test case number: 41
  /*Coverage entropy=1.053395498360576
  */
  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      FBProcedureParam fBProcedureParam0 = fBProcedureCall0.addParam(45, "m@f?]Wtt=r");
      fBProcedureCall0.addOutputParam(fBProcedureParam0);
      fBProcedureCall0.addParam(2, "m@f?]Wtt=r");
      try { 
        fBProcedureCall0.getSQL(true);
        fail("Expecting exception: FBSQLException");
      
      } catch(FBSQLException e) {
         //
         // Value of parameter -1 not set and it was not registered as output parameter.
         //
         verifyException("org.firebirdsql.jdbc.FBProcedureCall", e);
      }
  }

  /**
  //Test case number: 42
  /*Coverage entropy=0.9903650414743139
  */
  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      FBProcedureParam fBProcedureParam0 = fBProcedureCall0.addParam(66, "m@f?]Wtt=r");
      fBProcedureCall0.addOutputParam(fBProcedureParam0);
      String string0 = fBProcedureCall0.getSQL(true);
      assertNotNull(string0);
  }

  /**
  //Test case number: 43
  /*Coverage entropy=0.8587409130062867
  */
  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      FBProcedureParam fBProcedureParam0 = fBProcedureCall0.addParam(0, "");
      assertEquals(0, fBProcedureParam0.getPosition());
      
      String string0 = fBProcedureCall0.getSQL(false);
      assertEquals("EXECUTE PROCEDURE null", string0);
  }

  /**
  //Test case number: 44
  /*Coverage entropy=1.5741030017371853
  */
  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      FBProcedureParam fBProcedureParam0 = fBProcedureCall0.addParam(18, "You cannot set value of an non-existing parameter.");
      fBProcedureParam0.setIndex(18);
      fBProcedureCall0.addOutputParam(fBProcedureParam0);
      fBProcedureCall0.registerOutParam(18, 18);
      assertNull(fBProcedureCall0.getName());
  }

  /**
  //Test case number: 45
  /*Coverage entropy=0.868719682914265
  */
  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      FBProcedureParam fBProcedureParam0 = fBProcedureCall0.addParam(0, "");
      FBProcedureParam fBProcedureParam1 = fBProcedureCall0.addParam(0, "A1h|SHC'#W^~%d?=bF^");
      fBProcedureParam1.setValue(fBProcedureParam0);
      assertEquals(0, fBProcedureParam1.getPosition());
      
      String string0 = fBProcedureCall0.getSQL(false);
      assertEquals("EXECUTE PROCEDURE null(A1h|SHC'#W^~%d?=bF^)", string0);
  }

  /**
  //Test case number: 46
  /*Coverage entropy=0.6365141682948128
  */
  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      FBProcedureParam fBProcedureParam0 = new FBProcedureParam(803, "out");
      fBProcedureCall0.addOutputParam(fBProcedureParam0);
      fBProcedureCall0.addOutputParam(fBProcedureParam0);
      assertEquals((-1), fBProcedureParam0.getIndex());
  }

  /**
  //Test case number: 47
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      FBProcedureParam fBProcedureParam0 = new FBProcedureParam();
      fBProcedureCall0.addInputParam(fBProcedureParam0);
      assertNull(fBProcedureCall0.getName());
  }

  /**
  //Test case number: 48
  /*Coverage entropy=1.1269287948006759
  */
  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      FBProcedureParam fBProcedureParam0 = fBProcedureCall0.addParam(0, "A1h|SHC'#W^)~%d?=bFx");
      fBProcedureParam0.setIndex((-4));
      fBProcedureCall0.addOutputParam(fBProcedureParam0);
      assertEquals(0, fBProcedureParam0.getPosition());
      
      int int0 = fBProcedureCall0.mapOutParamIndexToPosition((-4), true);
      assertEquals(1, int0);
  }

  /**
  //Test case number: 49
  /*Coverage entropy=1.0832550105185086
  */
  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      FBProcedureParam fBProcedureParam0 = fBProcedureCall0.addParam(66, ">if?]Wttr");
      fBProcedureCall0.addOutputParam(fBProcedureParam0);
      try { 
        fBProcedureCall0.mapOutParamIndexToPosition(66, false);
        fail("Expecting exception: FBSQLException");
      
      } catch(FBSQLException e) {
         //
         // Specified parameter does not exist.
         //
         verifyException("org.firebirdsql.jdbc.FBProcedureCall", e);
      }
  }

  /**
  //Test case number: 50
  /*Coverage entropy=1.0609581504393426
  */
  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      FBProcedureParam fBProcedureParam0 = fBProcedureCall0.addParam(66, ">if?]Wttr");
      fBProcedureCall0.addOutputParam(fBProcedureParam0);
      assertEquals(66, fBProcedureParam0.getPosition());
      
      Object object0 = fBProcedureCall0.clone();
      assertTrue(object0.equals((Object)fBProcedureCall0));
      assertNotSame(object0, fBProcedureCall0);
  }

  /**
  //Test case number: 51
  /*Coverage entropy=0.9556998911125343
  */
  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      Object object0 = fBProcedureCall0.clone();
      boolean boolean0 = fBProcedureCall0.equals(object0);
      assertNotSame(object0, fBProcedureCall0);
      assertTrue(boolean0);
  }

  /**
  //Test case number: 52
  /*Coverage entropy=1.3862943611198906
  */
  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      FBProcedureParam fBProcedureParam0 = fBProcedureCall0.getOutputParam((-1));
      try { 
        fBProcedureParam0.setValue(fBProcedureCall0);
        fail("Expecting exception: FBSQLException");
      
      } catch(FBSQLException e) {
         //
         // You cannot set value of an non-existing parameter.
         //
         verifyException("org.firebirdsql.jdbc.FBProcedureCall$NullParam", e);
      }
  }

  /**
  //Test case number: 53
  /*Coverage entropy=1.0397207708399179
  */
  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      int int0 = fBProcedureCall0.mapOutParamIndexToPosition(250);
      assertEquals(250, int0);
  }

  /**
  //Test case number: 54
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      String string0 = fBProcedureCall0.getName();
      assertNull(string0);
  }

  /**
  //Test case number: 55
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      List<FBProcedureParam> list0 = fBProcedureCall0.getInputParams();
      assertEquals(0, list0.size());
  }

  /**
  //Test case number: 56
  /*Coverage entropy=1.3030924037617193
  */
  @Test(timeout = 4000)
  public void test56()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      FBProcedureParam fBProcedureParam0 = fBProcedureCall0.getOutputParam(0);
      fBProcedureCall0.addOutputParam(fBProcedureParam0);
      int int0 = fBProcedureCall0.mapOutParamIndexToPosition(0, true);
      assertEquals(0, int0);
  }

  /**
  //Test case number: 57
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test57()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      fBProcedureCall0.setName("");
      String string0 = fBProcedureCall0.getName();
      assertEquals("", string0);
  }

  /**
  //Test case number: 58
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test58()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      List<FBProcedureParam> list0 = fBProcedureCall0.getOutputParams();
      assertTrue(list0.isEmpty());
  }
}
