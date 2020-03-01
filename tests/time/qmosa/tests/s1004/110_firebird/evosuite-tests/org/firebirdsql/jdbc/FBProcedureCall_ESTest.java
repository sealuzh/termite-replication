/*
 * This file was automatically generated by EvoSuite
 * Tue Dec 03 17:19:46 GMT 2019
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
  /*Coverage entropy=2.3382296016546578
  */
  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      FBProcedureParam fBProcedureParam0 = fBProcedureCall0.addParam(1026, "kPzRC_T*RhgZ");
      fBProcedureParam0.setIndex(0);
      fBProcedureParam0.setIndex((-298));
      fBProcedureCall0.addOutputParam(fBProcedureParam0);
      fBProcedureCall0.addParam(0, "smXo|{F{{a");
      fBProcedureCall0.getSQL(false);
      fBProcedureCall0.registerOutParam((-1), 0);
      fBProcedureCall0.getOutputParam(1733);
      fBProcedureCall0.getOutputParam((-1));
      FBProcedureParam fBProcedureParam1 = new FBProcedureParam();
      fBProcedureParam1.setType((-298));
      FBProcedureCall fBProcedureCall1 = new FBProcedureCall();
      fBProcedureCall1.addOutputParam(fBProcedureParam1);
      String string0 = fBProcedureCall1.getName();
      assertNull(string0);
  }

  /**
  //Test case number: 1
  /*Coverage entropy=2.390897670362034
  */
  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      int int0 = 1732;
      fBProcedureCall0.clone();
      FBProcedureParam fBProcedureParam0 = new FBProcedureParam();
      fBProcedureParam0.setIndex((-1));
      fBProcedureCall0.addInputParam(fBProcedureParam0);
      FBProcedureCall fBProcedureCall1 = (FBProcedureCall)fBProcedureCall0.clone();
      FBProcedureCall fBProcedureCall2 = new FBProcedureCall();
      fBProcedureCall0.addParam(1732, "eL~-Yw8o1).D?@#*z");
      fBProcedureCall1.addParam(1732, "sXo|{F{n{a");
      fBProcedureCall0.getSQL(true);
      try { 
        fBProcedureCall0.registerOutParam(3950, 1732);
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
  /*Coverage entropy=1.527699454962953
  */
  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      FBProcedureParam fBProcedureParam0 = new FBProcedureParam();
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      fBProcedureParam0.setType(1804);
      fBProcedureParam0.setType(1732);
      fBProcedureCall0.addParam(1732, "eL~-Yw8o1).D?@#*z");
      fBProcedureCall0.addOutputParam(fBProcedureParam0);
      // Undeclared exception!
      try { 
        fBProcedureCall0.getSQL(true);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // Array index out of range: 1732
         //
         verifyException("java.util.Vector", e);
      }
  }

  /**
  //Test case number: 3
  /*Coverage entropy=2.011944257021476
  */
  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      FBProcedureParam fBProcedureParam0 = fBProcedureCall0.addParam(1, "");
      fBProcedureCall0.addParam(0, "org.firebirdsql.jdbc.FBSQLException");
      fBProcedureCall0.getInputParam(3);
      fBProcedureCall0.clone();
      fBProcedureParam0.setType((-1));
      FBProcedureCall fBProcedureCall1 = new FBProcedureCall();
      // Undeclared exception!
      try { 
        fBProcedureCall1.addInputParam((FBProcedureParam) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.firebirdsql.jdbc.FBProcedureCall", e);
      }
  }

  /**
  //Test case number: 4
  /*Coverage entropy=2.4171997975280397
  */
  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      FBProcedureParam fBProcedureParam0 = fBProcedureCall0.getOutputParam((-1718));
      fBProcedureParam0.clone();
      fBProcedureCall0.setName("ne");
      fBProcedureCall0.addOutputParam(fBProcedureParam0);
      Object object0 = fBProcedureCall0.clone();
      boolean boolean0 = fBProcedureCall0.equals(object0);
      assertTrue(boolean0);
      
      fBProcedureCall0.getOutputParams();
      fBProcedureCall0.getOutputParam((-1331));
      Object object1 = new Object();
      boolean boolean1 = fBProcedureCall0.equals(object1);
      assertFalse(boolean1 == boolean0);
      
      fBProcedureCall0.getInputParams();
      assertNotSame(fBProcedureCall0, object0);
  }

  /**
  //Test case number: 5
  /*Coverage entropy=2.3889899331036926
  */
  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      FBProcedureParam fBProcedureParam0 = fBProcedureCall0.addParam(1, "].");
      fBProcedureParam0.setIndex((-146010727));
      fBProcedureParam0.setIndex(1);
      fBProcedureCall0.addOutputParam(fBProcedureParam0);
      fBProcedureCall0.registerOutParam(1, 1);
      int int0 = fBProcedureCall0.mapOutParamIndexToPosition(1, true);
      //  // Unstable assertion: assertEquals(1, int0);
      
      FBProcedureParam fBProcedureParam1 = fBProcedureCall0.getInputParam(1);
      //  // Unstable assertion: assertEquals(1, fBProcedureParam1.getPosition());
      
      fBProcedureCall0.registerOutParam(1, 2662);
      FBProcedureParam fBProcedureParam2 = fBProcedureCall0.getOutputParam((-20664796));
      //  // Unstable assertion: assertEquals((-146010727), fBProcedureParam2.getIndex());
      
      FBProcedureParam fBProcedureParam3 = fBProcedureCall0.getOutputParam(1);
      fBProcedureCall0.addOutputParam(fBProcedureParam3);
      //  // Unstable assertion: assertEquals(2662, fBProcedureParam3.getType());
      //  // Unstable assertion: assertEquals(1, fBProcedureParam3.getPosition());
  }

  /**
  //Test case number: 6
  /*Coverage entropy=1.928445566450716
  */
  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      FBProcedureParam fBProcedureParam0 = fBProcedureCall0.addParam(1, "].");
      fBProcedureParam0.setIndex(1);
      fBProcedureCall0.registerOutParam(1, 1);
      FBProcedureParam fBProcedureParam1 = fBProcedureCall0.addParam(2662, "].");
      assertEquals(2662, fBProcedureParam1.getPosition());
  }

  /**
  //Test case number: 7
  /*Coverage entropy=1.8037143984351167
  */
  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      int int0 = 1;
      int int1 = 1;
      FBProcedureParam fBProcedureParam0 = fBProcedureCall0.addParam(1, "].");
      int int2 = 0;
      fBProcedureParam0.setType(1);
      fBProcedureParam0.setIndex(4);
      fBProcedureParam0.setIndex((-146010727));
      fBProcedureParam0.setIndex(0);
      fBProcedureCall0.addOutputParam(fBProcedureParam0);
      fBProcedureCall0.clone();
      try { 
        fBProcedureCall0.mapOutParamIndexToPosition(1, false);
        fail("Expecting exception: FBSQLException");
      
      } catch(FBSQLException e) {
         //
         // Specified parameter does not exist.
         //
         verifyException("org.firebirdsql.jdbc.FBProcedureCall", e);
      }
  }

  /**
  //Test case number: 8
  /*Coverage entropy=2.267033654612569
  */
  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      int int0 = 1;
      String string0 = "].";
      FBProcedureParam fBProcedureParam0 = fBProcedureCall0.addParam(1, "].");
      fBProcedureParam0.clone();
      fBProcedureParam0.setIndex((-146010727));
      fBProcedureParam0.setIndex(0);
      fBProcedureCall0.addOutputParam(fBProcedureParam0);
      fBProcedureCall0.registerOutParam(0, 1);
      fBProcedureParam0.clone();
      fBProcedureCall0.mapOutParamIndexToPosition(0, true);
      fBProcedureCall0.getInputParam(38);
      // Undeclared exception!
      try { 
        fBProcedureCall0.registerOutParam((-146010727), 0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -146010728
         //
         verifyException("java.util.Vector", e);
      }
  }

  /**
  //Test case number: 9
  /*Coverage entropy=2.3494571108598
  */
  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      int int0 = 1;
      int int1 = 1;
      FBProcedureParam fBProcedureParam0 = fBProcedureCall0.addParam(1, "].");
      fBProcedureParam0.setIndex((-146010727));
      fBProcedureParam0.setIndex((-146010727));
      fBProcedureCall0.getOutputParam((-12469270));
      fBProcedureParam0.setIndex(0);
      fBProcedureCall0.addOutputParam(fBProcedureParam0);
      fBProcedureCall0.mapOutParamIndexToPosition((-146010727), true);
      fBProcedureCall0.registerOutParam(0, 1);
      fBProcedureCall0.mapOutParamIndexToPosition(1, true);
      try { 
        fBProcedureCall0.registerOutParam(2, 55);
        fail("Expecting exception: FBSQLException");
      
      } catch(FBSQLException e) {
         //
         // Cannot find parameter with the specified position.
         //
         verifyException("org.firebirdsql.jdbc.FBProcedureCall", e);
      }
  }

  /**
  //Test case number: 10
  /*Coverage entropy=2.0416355832538087
  */
  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      fBProcedureCall0.clone();
      FBProcedureParam fBProcedureParam0 = new FBProcedureParam();
      fBProcedureParam0.setIndex((-1));
      fBProcedureCall0.addInputParam(fBProcedureParam0);
      FBProcedureCall fBProcedureCall1 = (FBProcedureCall)fBProcedureCall0.clone();
      FBProcedureCall fBProcedureCall2 = new FBProcedureCall();
      fBProcedureCall0.addParam(1732, "eL~-Yw8o1).D?@#*z");
      String string0 = "sXo|{F{n{a";
      fBProcedureCall1.addParam(1732, "sXo|{F{n{a");
      fBProcedureCall0.getInputParam((-1));
      // Undeclared exception!
      try { 
        fBProcedureCall1.addParam((-1), "sXo|{F{n{a");
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -1
         //
         verifyException("java.util.Vector", e);
      }
  }

  /**
  //Test case number: 11
  /*Coverage entropy=2.437860872605312
  */
  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      FBProcedureCall fBProcedureCall1 = new FBProcedureCall();
      fBProcedureCall0.equals(fBProcedureCall1);
      int int0 = 304;
      fBProcedureCall1.getOutputParam(304);
      fBProcedureCall1.addParam(304, " not set and ");
      fBProcedureCall0.addParam(304, "aX4fF/&iC&*_#usvfg");
      fBProcedureCall1.getInputParam(304);
      FBProcedureCall fBProcedureCall2 = (FBProcedureCall)fBProcedureCall0.clone();
      FBProcedureCall fBProcedureCall3 = new FBProcedureCall();
      fBProcedureCall0.equals(fBProcedureCall3);
      try { 
        fBProcedureCall2.registerOutParam(3323, 304);
        fail("Expecting exception: FBSQLException");
      
      } catch(FBSQLException e) {
         //
         // Cannot find parameter with the specified position.
         //
         verifyException("org.firebirdsql.jdbc.FBProcedureCall", e);
      }
  }

  /**
  //Test case number: 12
  /*Coverage entropy=2.1328806356652015
  */
  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      fBProcedureCall0.clone();
      fBProcedureCall0.getInputParam(4514);
      fBProcedureCall0.getSQL(false);
      fBProcedureCall0.addParam(4514, "l#");
      fBProcedureCall0.setName("l#");
      fBProcedureCall0.setName("<A[!puck %`]-*T&");
      fBProcedureCall0.getSQL(false);
      fBProcedureCall0.getName();
      // Undeclared exception!
      fBProcedureCall0.getSQL(true);
  }

  /**
  //Test case number: 13
  /*Coverage entropy=2.1854169515756863
  */
  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      FBProcedureParam fBProcedureParam0 = fBProcedureCall0.addParam(1026, "kPzRC_T*RhgZ");
      fBProcedureParam0.setIndex(0);
      fBProcedureParam0.setIndex((-298));
      fBProcedureCall0.addOutputParam(fBProcedureParam0);
      fBProcedureCall0.addOutputParam(fBProcedureParam0);
      fBProcedureCall0.addParam(163, "(#wQwqGC%9-x(");
      fBProcedureCall0.getInputParams();
      fBProcedureCall0.registerOutParam((-298), (-1736));
      assertTrue(FBProcedureCall.OLD_CALLABLE_STATEMENT_COMPATIBILITY);
  }

  /**
  //Test case number: 14
  /*Coverage entropy=2.138526235860879
  */
  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      boolean boolean0 = true;
      fBProcedureCall0.getSQL(true);
      fBProcedureCall0.setName("0vm");
      fBProcedureCall0.getInputParams();
      fBProcedureCall0.hashCode();
      try { 
        fBProcedureCall0.mapOutParamIndexToPosition(2, false);
        fail("Expecting exception: FBSQLException");
      
      } catch(FBSQLException e) {
         //
         // Specified parameter does not exist.
         //
         verifyException("org.firebirdsql.jdbc.FBProcedureCall", e);
      }
  }

  /**
  //Test case number: 15
  /*Coverage entropy=2.3184374825031187
  */
  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      String string0 = "].";
      fBProcedureCall0.addParam(1, "].");
      FBProcedureParam fBProcedureParam0 = fBProcedureCall0.getInputParam(1);
      fBProcedureCall0.addParam(1, "You cannot set value of an non-existing parameter.");
      int int0 = (-3040);
      String string1 = null;
      FBProcedureParam fBProcedureParam1 = new FBProcedureParam((-3040), "h@_");
      fBProcedureCall0.addOutputParam(fBProcedureParam0);
      fBProcedureCall0.getInputParam(1);
      fBProcedureCall0.clone();
      FBProcedureCall fBProcedureCall1 = new FBProcedureCall();
      fBProcedureParam0.clone();
      try { 
        fBProcedureCall0.registerOutParam(544, 1322);
        fail("Expecting exception: FBSQLException");
      
      } catch(FBSQLException e) {
         //
         // Cannot find parameter with the specified position.
         //
         verifyException("org.firebirdsql.jdbc.FBProcedureCall", e);
      }
  }

  /**
  //Test case number: 16
  /*Coverage entropy=1.4682921994113465
  */
  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      String string0 = "eL~-Yw8o1).D?@#*z";
      fBProcedureCall0.clone();
      FBProcedureParam fBProcedureParam0 = new FBProcedureParam();
      int int0 = (-1);
      fBProcedureParam0.setIndex((-1));
      FBProcedureParam fBProcedureParam1 = new FBProcedureParam(616, "eL~-Yw8o1).D?@#*z");
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
  //Test case number: 17
  /*Coverage entropy=0.7796284279369028
  */
  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      FBProcedureCall fBProcedureCall1 = new FBProcedureCall();
      fBProcedureCall0.addParam(1499, "^'ZqV($A");
      fBProcedureCall0.addParam(1499, "762cxJU");
      // Undeclared exception!
      try { 
        fBProcedureCall1.addParam((-785), "\n");
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -785
         //
         verifyException("java.util.Vector", e);
      }
  }

  /**
  //Test case number: 18
  /*Coverage entropy=0.7796284279369028
  */
  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      FBProcedureParam fBProcedureParam0 = fBProcedureCall0.addParam(1, "].");
      fBProcedureParam0.setIndex(4);
      fBProcedureParam0.setIndex((-146010727));
      fBProcedureCall0.addParam(0, "org.firebirdsql.jdbc.FBProcedureCall");
      fBProcedureCall0.addParam(0, "].");
      // Undeclared exception!
      try { 
        fBProcedureCall0.addParam((-1480), "OUT");
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -1480
         //
         verifyException("java.util.Vector", e);
      }
  }

  /**
  //Test case number: 19
  /*Coverage entropy=1.3526824577333225
  */
  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      FBProcedureParam fBProcedureParam0 = new FBProcedureParam();
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      fBProcedureParam0.setType(1804);
      fBProcedureParam0.setType(1732);
      fBProcedureCall0.addParam(1732, "eL~-Yw8o1).D?@#*z");
      String string0 = "h@_=";
      FBProcedureParam fBProcedureParam1 = fBProcedureCall0.addParam(940, "h@_=");
      fBProcedureCall0.clone();
      FBProcedureCall fBProcedureCall1 = new FBProcedureCall();
      try { 
        fBProcedureParam1.setValue(fBProcedureCall1);
        fail("Expecting exception: FBSQLException");
      
      } catch(FBSQLException e) {
         //
         // Cannot set parameter, since it is constant.
         //
         verifyException("org.firebirdsql.jdbc.FBProcedureParam", e);
      }
  }

  /**
  //Test case number: 20
  /*Coverage entropy=1.0931471805599453
  */
  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      // Undeclared exception!
      try { 
        fBProcedureCall0.addParam((-1058), (String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.firebirdsql.jdbc.FBProcedureCall", e);
      }
  }

  /**
  //Test case number: 21
  /*Coverage entropy=1.0931471805599453
  */
  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      boolean boolean0 = fBProcedureCall0.equals(fBProcedureCall0);
      assertTrue(boolean0);
  }

  /**
  //Test case number: 22
  /*Coverage entropy=1.8353563042895051
  */
  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      FBProcedureCall fBProcedureCall1 = new FBProcedureCall();
      fBProcedureCall0.equals(fBProcedureCall1);
      int int0 = (-1404);
      int int1 = 304;
      fBProcedureCall0.getInputParam(304);
      String string0 = "Wf,-Ha";
      // Undeclared exception!
      try { 
        fBProcedureCall0.addParam((-1404), "Wf,-Ha");
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -1404
         //
         verifyException("java.util.Vector", e);
      }
  }

  /**
  //Test case number: 23
  /*Coverage entropy=2.530609500436487
  */
  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      FBProcedureCall fBProcedureCall1 = (FBProcedureCall)fBProcedureCall0.clone();
      FBProcedureCall fBProcedureCall2 = (FBProcedureCall)fBProcedureCall0.clone();
      FBProcedureParam fBProcedureParam0 = fBProcedureCall2.getOutputParam((-146010727));
      fBProcedureParam0.setIndex((-293));
      fBProcedureParam0.setIndex(0);
      fBProcedureParam0.setIndex((-146010727));
      fBProcedureCall2.addOutputParam(fBProcedureParam0);
      fBProcedureCall1.mapOutParamIndexToPosition(0);
      FBProcedureCall fBProcedureCall3 = new FBProcedureCall();
      int int0 = 3381;
      try { 
        fBProcedureCall3.registerOutParam(4, 3381);
        fail("Expecting exception: FBSQLException");
      
      } catch(FBSQLException e) {
         //
         // Cannot find parameter with the specified position.
         //
         verifyException("org.firebirdsql.jdbc.FBProcedureCall", e);
      }
  }

  /**
  //Test case number: 24
  /*Coverage entropy=2.3995127851780413
  */
  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      FBProcedureParam fBProcedureParam0 = fBProcedureCall0.addParam(1, "].");
      fBProcedureParam0.setType(1);
      fBProcedureParam0.clone();
      fBProcedureParam0.setIndex(0);
      fBProcedureCall0.addOutputParam(fBProcedureParam0);
      fBProcedureCall0.registerOutParam(0, 1);
      fBProcedureCall0.getInputParam(1);
      fBProcedureCall0.getInputParams();
      fBProcedureCall0.getOutputParams();
      try { 
        fBProcedureCall0.registerOutParam(1, 2662);
        fail("Expecting exception: FBSQLException");
      
      } catch(FBSQLException e) {
         //
         // Cannot find parameter with the specified position.
         //
         verifyException("org.firebirdsql.jdbc.FBProcedureCall", e);
      }
  }

  /**
  //Test case number: 25
  /*Coverage entropy=1.0931471805599453
  */
  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      List<FBProcedureParam> list0 = fBProcedureCall0.getOutputParams();
      assertTrue(list0.isEmpty());
  }

  /**
  //Test case number: 26
  /*Coverage entropy=1.4701832772209662
  */
  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      fBProcedureCall0.addParam(1604, "^QuF85qBm=NA%GZ1=`f");
      FBProcedureParam fBProcedureParam0 = new FBProcedureParam(615, "uhrXM]aDZG.K");
      fBProcedureCall0.addInputParam(fBProcedureParam0);
      String string0 = fBProcedureCall0.getSQL(true);
      assertEquals("SELECT * FROM null(uhrXM]aDZG.K, ^QuF85qBm=NA%GZ1=`f)", string0);
      
      FBProcedureParam fBProcedureParam1 = fBProcedureCall0.addParam(4, "SELECT * FROM null(uhrXM]aDZG.K, ^QuF85qBm=NA%GZ1=`f)");
      assertEquals(4, fBProcedureParam1.getPosition());
  }

  /**
  //Test case number: 27
  /*Coverage entropy=2.1645220759198467
  */
  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      FBProcedureParam fBProcedureParam0 = fBProcedureCall0.addParam(0, "kPzRC_T*RhgZ");
      fBProcedureParam0.setIndex(0);
      fBProcedureParam0.setIndex((-298));
      fBProcedureCall0.addOutputParam(fBProcedureParam0);
      fBProcedureCall0.registerOutParam((-298), 1603);
      fBProcedureCall0.addParam(1603, "kPzRC_T*RhgZ");
      fBProcedureCall0.getSQL(false);
      FBProcedureCall fBProcedureCall1 = new FBProcedureCall();
      assertTrue(FBProcedureCall.OLD_CALLABLE_STATEMENT_COMPATIBILITY);
  }

  /**
  //Test case number: 28
  /*Coverage entropy=0.9623351446188083
  */
  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      String string0 = fBProcedureCall0.getSQL(false);
      assertEquals("EXECUTE PROCEDURE null", string0);
  }

  /**
  //Test case number: 29
  /*Coverage entropy=2.310925625547759
  */
  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      int int0 = 1;
      FBProcedureParam fBProcedureParam0 = new FBProcedureParam(1, "].");
      int int1 = 21;
      fBProcedureParam0.setIndex((-10));
      fBProcedureParam0.setIndex((-146010727));
      fBProcedureParam0.setIndex(21);
      fBProcedureCall0.addOutputParam(fBProcedureParam0);
      fBProcedureCall0.mapOutParamIndexToPosition((-10));
      try { 
        fBProcedureCall0.registerOutParam(2, 60);
        fail("Expecting exception: FBSQLException");
      
      } catch(FBSQLException e) {
         //
         // Cannot find parameter with the specified position.
         //
         verifyException("org.firebirdsql.jdbc.FBProcedureCall", e);
      }
  }

  /**
  //Test case number: 30
  /*Coverage entropy=1.6152804042395514
  */
  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      FBProcedureCall fBProcedureCall1 = new FBProcedureCall();
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
  //Test case number: 31
  /*Coverage entropy=2.310925625547759
  */
  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      int int0 = 1;
      int int1 = 1;
      FBProcedureParam fBProcedureParam0 = new FBProcedureParam(1, "].");
      int int2 = 0;
      fBProcedureParam0.setIndex(4);
      fBProcedureParam0.setIndex((-146010727));
      fBProcedureParam0.setIndex(0);
      fBProcedureCall0.addOutputParam(fBProcedureParam0);
      fBProcedureCall0.mapOutParamIndexToPosition(4);
      try { 
        fBProcedureCall0.registerOutParam(2, 55);
        fail("Expecting exception: FBSQLException");
      
      } catch(FBSQLException e) {
         //
         // Cannot find parameter with the specified position.
         //
         verifyException("org.firebirdsql.jdbc.FBProcedureCall", e);
      }
  }

  /**
  //Test case number: 32
  /*Coverage entropy=1.128183350293198
  */
  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      FBProcedureParam fBProcedureParam0 = fBProcedureCall0.addParam(615, "uhrXM]aDZG.K");
      fBProcedureCall0.addInputParam(fBProcedureParam0);
      // Undeclared exception!
      try { 
        fBProcedureCall0.addParam((-1884), ".qzvKZ");
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -1884
         //
         verifyException("java.util.Vector", e);
      }
  }

  /**
  //Test case number: 33
  /*Coverage entropy=1.5504384368836852
  */
  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      FBProcedureParam fBProcedureParam0 = fBProcedureCall0.addParam(304, "cyEE4Dv:K@");
      FBProcedureCall fBProcedureCall1 = new FBProcedureCall();
      fBProcedureCall1.addInputParam(fBProcedureParam0);
      FBProcedureCall fBProcedureCall2 = new FBProcedureCall();
      FBProcedureParam fBProcedureParam1 = new FBProcedureParam((-1380), "cyEE4Dv:K@");
      // Undeclared exception!
      try { 
        fBProcedureCall0.addOutputParam(fBProcedureParam1);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -1380
         //
         verifyException("java.util.Vector", e);
      }
  }

  /**
  //Test case number: 34
  /*Coverage entropy=1.0365141682948127
  */
  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      int int0 = 1603;
      FBProcedureParam fBProcedureParam0 = new FBProcedureParam((-779), "Vvac>,8z5|uW.)3Z");
      fBProcedureParam0.setIndex(1603);
      // Undeclared exception!
      try { 
        fBProcedureCall0.addInputParam(fBProcedureParam0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -779
         //
         verifyException("java.util.Vector", e);
      }
  }

  /**
  //Test case number: 35
  /*Coverage entropy=2.2020751869153234
  */
  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      int int0 = 1030;
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      FBProcedureParam fBProcedureParam0 = fBProcedureCall0.addParam(1732, "kPzRC_T*RhgZ");
      fBProcedureParam0.setIndex(585);
      int int1 = (-298);
      fBProcedureParam0.setIndex(1030);
      fBProcedureCall0.addOutputParam(fBProcedureParam0);
      int int2 = (-38859375);
      try { 
        fBProcedureCall0.registerOutParam(585, (-38859375));
        fail("Expecting exception: FBSQLException");
      
      } catch(FBSQLException e) {
         //
         // Cannot find parameter with the specified position.
         //
         verifyException("org.firebirdsql.jdbc.FBProcedureCall", e);
      }
  }

  /**
  //Test case number: 36
  /*Coverage entropy=1.3221086830269158
  */
  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      FBProcedureCall fBProcedureCall1 = new FBProcedureCall();
      // Undeclared exception!
      try { 
        fBProcedureCall0.getInputParam((-109795271));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -109795272
         //
         verifyException("java.util.Vector", e);
      }
  }

  /**
  //Test case number: 37
  /*Coverage entropy=2.185529345760228
  */
  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      FBProcedureParam fBProcedureParam0 = fBProcedureCall0.getOutputParam(63);
      fBProcedureParam0.setIndex(3221);
      fBProcedureCall0.addOutputParam(fBProcedureParam0);
      FBProcedureCall fBProcedureCall1 = (FBProcedureCall)fBProcedureCall0.clone();
      fBProcedureParam0.setType(3028);
      fBProcedureCall1.hashCode();
      FBProcedureParam fBProcedureParam1 = fBProcedureCall1.getOutputParam((-1991));
      try { 
        fBProcedureParam0.setValue(fBProcedureParam1);
        fail("Expecting exception: FBSQLException");
      
      } catch(FBSQLException e) {
         //
         // You cannot set value of an non-existing parameter.
         //
         verifyException("org.firebirdsql.jdbc.FBProcedureCall$NullParam", e);
      }
  }

  /**
  //Test case number: 38
  /*Coverage entropy=2.1174062968619456
  */
  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      FBProcedureParam fBProcedureParam0 = fBProcedureCall0.addParam(1030, "kPzRC_T*RhgZ");
      fBProcedureParam0.setIndex(0);
      fBProcedureParam0.setIndex((-298));
      fBProcedureCall0.addOutputParam(fBProcedureParam0);
      fBProcedureCall0.registerOutParam((-298), 1603);
      fBProcedureCall0.addOutputParam(fBProcedureParam0);
      // Undeclared exception!
      try { 
        fBProcedureCall0.registerOutParam(0, 3);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -1
         //
         verifyException("java.util.Vector", e);
      }
  }
}
