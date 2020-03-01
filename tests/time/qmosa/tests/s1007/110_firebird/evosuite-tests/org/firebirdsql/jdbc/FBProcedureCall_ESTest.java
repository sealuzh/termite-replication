/*
 * This file was automatically generated by EvoSuite
 * Tue Dec 03 19:06:07 GMT 2019
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
  /*Coverage entropy=1.725192893420558
  */
  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      FBProcedureCall fBProcedureCall1 = new FBProcedureCall();
      fBProcedureCall1.addParam(42, "");
      fBProcedureCall0.equals(fBProcedureCall1);
      fBProcedureCall0.clone();
      int int0 = 547;
      // Undeclared exception!
      try { 
        fBProcedureCall0.addParam(547, (String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.firebirdsql.jdbc.FBProcedureCall", e);
      }
  }

  /**
  //Test case number: 1
  /*Coverage entropy=2.4798980042352006
  */
  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      fBProcedureCall0.addParam(887, "iJVcDr\"gDvqAri1&l");
      fBProcedureCall0.registerOutParam((-1), (-48756830));
      FBProcedureParam fBProcedureParam0 = new FBProcedureParam();
      fBProcedureParam0.setType((-48756830));
      fBProcedureCall0.addOutputParam(fBProcedureParam0);
      fBProcedureCall0.addOutputParam(fBProcedureParam0);
      FBProcedureCall fBProcedureCall1 = (FBProcedureCall)fBProcedureCall0.clone();
      fBProcedureCall1.getOutputParam((-1));
      fBProcedureCall1.getSQL(true);
      try { 
        fBProcedureCall0.registerOutParam(24, 42);
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
  /*Coverage entropy=2.554493987041491
  */
  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      fBProcedureCall0.clone();
      FBProcedureParam fBProcedureParam0 = new FBProcedureParam();
      fBProcedureParam0.setType(63);
      fBProcedureParam0.setIndex(1105);
      fBProcedureCall0.addInputParam(fBProcedureParam0);
      fBProcedureCall0.getSQL(true);
      fBProcedureParam0.setType(1105);
      fBProcedureCall0.addParam(0, "SELECT * FROM null(null)");
      fBProcedureCall0.addOutputParam(fBProcedureParam0);
      FBProcedureParam fBProcedureParam1 = fBProcedureCall0.getInputParam(1105);
      fBProcedureCall0.addOutputParam(fBProcedureParam1);
      try { 
        fBProcedureCall0.registerOutParam(63, 40);
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
  /*Coverage entropy=1.1217186091313738
  */
  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      fBProcedureCall0.equals(fBProcedureCall0);
      FBProcedureCall fBProcedureCall1 = new FBProcedureCall();
      assertTrue(fBProcedureCall1.equals((Object)fBProcedureCall0));
  }

  /**
  //Test case number: 4
  /*Coverage entropy=2.3560991099725004
  */
  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      FBProcedureParam fBProcedureParam0 = fBProcedureCall0.addParam(18, "rssbe/");
      fBProcedureCall0.addParam(63, "rssbe/");
      FBProcedureCall fBProcedureCall1 = new FBProcedureCall();
      fBProcedureCall0.addOutputParam(fBProcedureParam0);
      fBProcedureParam0.setIndex(11);
      FBProcedureCall fBProcedureCall2 = (FBProcedureCall)fBProcedureCall1.clone();
      fBProcedureCall2.addInputParam(fBProcedureParam0);
      fBProcedureCall0.addOutputParam(fBProcedureParam0);
      fBProcedureCall0.registerOutParam(11, 3);
      assertFalse(fBProcedureCall0.equals((Object)fBProcedureCall1));
  }

  /**
  //Test case number: 5
  /*Coverage entropy=1.0365141682948127
  */
  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      FBProcedureParam fBProcedureParam0 = new FBProcedureParam((-1019), "Resource Exception. ");
      // Undeclared exception!
      try { 
        fBProcedureCall0.addOutputParam(fBProcedureParam0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -1019
         //
         verifyException("java.util.Vector", e);
      }
  }

  /**
  //Test case number: 6
  /*Coverage entropy=1.2931300021708616
  */
  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      FBProcedureCall fBProcedureCall1 = new FBProcedureCall();
      int int0 = (-1);
      FBProcedureParam fBProcedureParam0 = new FBProcedureParam((-1), " not set and ");
      fBProcedureParam0.setIndex(1105);
      fBProcedureCall1.addParam(1105, "it was not registered as output parameter.");
      // Undeclared exception!
      try { 
        fBProcedureCall1.addInputParam(fBProcedureParam0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -1
         //
         verifyException("java.util.Vector", e);
      }
  }

  /**
  //Test case number: 7
  /*Coverage entropy=0.8386877468598375
  */
  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      FBProcedureCall fBProcedureCall1 = new FBProcedureCall();
      FBProcedureParam fBProcedureParam0 = fBProcedureCall0.addParam(17, "F`9LS)~}(0U?u_b(}QL");
      assertEquals(17, fBProcedureParam0.getPosition());
  }

  /**
  //Test case number: 8
  /*Coverage entropy=1.1217186091313738
  */
  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
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
  //Test case number: 9
  /*Coverage entropy=2.6387966507577865
  */
  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      FBProcedureParam fBProcedureParam0 = new FBProcedureParam();
      fBProcedureParam0.setType(1105);
      fBProcedureCall0.addInputParam(fBProcedureParam0);
      fBProcedureCall0.mapOutParamIndexToPosition(63);
      fBProcedureCall0.getSQL(true);
      FBProcedureParam fBProcedureParam1 = fBProcedureCall0.addParam(63, "01S00");
      fBProcedureParam0.setIndex(516);
      fBProcedureParam0.setIndex((-235027386));
      fBProcedureCall0.addOutputParam(fBProcedureParam1);
      fBProcedureCall0.mapOutParamIndexToPosition(1105, true);
      fBProcedureCall0.addOutputParam(fBProcedureParam0);
      fBProcedureCall0.addOutputParam(fBProcedureParam1);
      fBProcedureCall0.addOutputParam(fBProcedureParam0);
      try { 
        fBProcedureCall0.registerOutParam(1105, 516);
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
  /*Coverage entropy=1.5748027648585858
  */
  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      FBProcedureParam fBProcedureParam0 = new FBProcedureParam();
      fBProcedureParam0.setType(1105);
      fBProcedureParam0.setIndex((-1));
      fBProcedureCall0.addInputParam(fBProcedureParam0);
      FBProcedureCall fBProcedureCall1 = new FBProcedureCall();
      FBProcedureCall fBProcedureCall2 = new FBProcedureCall();
      FBProcedureCall fBProcedureCall3 = new FBProcedureCall();
      FBProcedureCall fBProcedureCall4 = new FBProcedureCall();
      FBProcedureCall fBProcedureCall5 = new FBProcedureCall();
      FBProcedureCall fBProcedureCall6 = new FBProcedureCall();
      FBProcedureCall fBProcedureCall7 = new FBProcedureCall();
      List<FBProcedureParam> list0 = fBProcedureCall4.getInputParams();
      assertEquals(0, list0.size());
  }

  /**
  //Test case number: 11
  /*Coverage entropy=1.885150328612323
  */
  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      try { 
        fBProcedureCall0.registerOutParam(37, 63);
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
  /*Coverage entropy=0.8386877468598375
  */
  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      fBProcedureCall0.addParam(887, "iJVcDr\"gDvqAri1&l");
      // Undeclared exception!
      try { 
        fBProcedureCall0.addParam(1484, (String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.firebirdsql.jdbc.FBProcedureCall", e);
      }
  }

  /**
  //Test case number: 13
  /*Coverage entropy=2.163938158910871
  */
  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      fBProcedureCall0.addParam(887, "iJVcDr\"gDvqAri1&l");
      fBProcedureCall0.addParam(840, "rs");
      fBProcedureCall0.getSQL(true);
      try { 
        fBProcedureCall0.registerOutParam(887, (-1));
        fail("Expecting exception: FBSQLException");
      
      } catch(FBSQLException e) {
         //
         // Cannot find parameter with the specified position.
         //
         verifyException("org.firebirdsql.jdbc.FBProcedureCall", e);
      }
  }

  /**
  //Test case number: 14
  /*Coverage entropy=1.0365141682948127
  */
  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      int int0 = fBProcedureCall0.mapOutParamIndexToPosition((-496), true);
      assertEquals((-496), int0);
  }

  /**
  //Test case number: 15
  /*Coverage entropy=1.7759123045454068
  */
  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      FBProcedureParam fBProcedureParam0 = fBProcedureCall0.getInputParam(2);
      FBProcedureParam fBProcedureParam1 = fBProcedureCall0.addParam(2343, " c5J>33[^Yj");
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
  //Test case number: 16
  /*Coverage entropy=1.145277367387215
  */
  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      FBProcedureCall fBProcedureCall1 = new FBProcedureCall();
      FBProcedureParam fBProcedureParam0 = fBProcedureCall1.addParam(31, "You cannot set value of an non-existing parameter.");
      fBProcedureCall0.addOutputParam(fBProcedureParam0);
      fBProcedureCall0.addParam(887, "hy1");
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
  /*Coverage entropy=2.3560991099725004
  */
  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      FBProcedureParam fBProcedureParam0 = fBProcedureCall0.addParam(18, "rssbe/");
      fBProcedureCall0.addParam(63, "rssbe/");
      FBProcedureCall fBProcedureCall1 = new FBProcedureCall();
      fBProcedureCall0.addOutputParam(fBProcedureParam0);
      fBProcedureParam0.setIndex(11);
      fBProcedureCall1.clone();
      fBProcedureCall0.addOutputParam(fBProcedureParam0);
      fBProcedureCall0.registerOutParam(11, 3);
      List<FBProcedureParam> list0 = fBProcedureCall0.getOutputParams();
      assertFalse(list0.isEmpty());
  }

  /**
  //Test case number: 18
  /*Coverage entropy=2.009653988412479
  */
  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      fBProcedureCall0.getSQL(false);
      FBProcedureParam fBProcedureParam0 = new FBProcedureParam(0, "@u'/KGb*;`WV]^|Ow3");
      fBProcedureParam0.setType(0);
      FBProcedureParam fBProcedureParam1 = (FBProcedureParam)fBProcedureParam0.clone();
      fBProcedureCall0.addOutputParam(fBProcedureParam0);
      FBProcedureCall fBProcedureCall1 = (FBProcedureCall)fBProcedureCall0.clone();
      assertTrue(fBProcedureCall1.equals((Object)fBProcedureCall0));
      
      FBProcedureParam fBProcedureParam2 = fBProcedureCall0.addParam(11, "G6/V]q0_~d,!D");
      assertEquals(11, fBProcedureParam2.getPosition());
      
      fBProcedureCall0.addInputParam(fBProcedureParam1);
      assertNotSame(fBProcedureCall0, fBProcedureCall1);
  }

  /**
  //Test case number: 19
  /*Coverage entropy=1.6022586579519182
  */
  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      FBProcedureParam fBProcedureParam0 = fBProcedureCall0.addParam(4, "rssbe/");
      fBProcedureCall0.addOutputParam(fBProcedureParam0);
      FBProcedureParam fBProcedureParam1 = new FBProcedureParam();
      fBProcedureParam0.setType(10);
      fBProcedureCall0.addOutputParam(fBProcedureParam0);
      assertEquals(4, fBProcedureParam0.getPosition());
      
      fBProcedureCall0.addOutputParam(fBProcedureParam1);
      Object object0 = fBProcedureCall0.clone();
      assertTrue(object0.equals((Object)fBProcedureCall0));
      assertNotSame(object0, fBProcedureCall0);
  }

  /**
  //Test case number: 20
  /*Coverage entropy=2.7346264372652334
  */
  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      fBProcedureCall0.mapOutParamIndexToPosition(664);
      fBProcedureCall0.addParam(0, "");
      fBProcedureCall0.getSQL(true);
      FBProcedureParam fBProcedureParam0 = fBProcedureCall0.getOutputParam(0);
      fBProcedureParam0.setType(0);
      fBProcedureParam0.setIndex(0);
      fBProcedureParam0.setIndex(664);
      fBProcedureCall0.mapOutParamIndexToPosition(0, true);
      fBProcedureCall0.equals(fBProcedureParam0);
      fBProcedureCall0.clone();
      fBProcedureCall0.addInputParam(fBProcedureParam0);
      fBProcedureCall0.setName("RXx)#?");
      fBProcedureCall0.setName("SELECT * FROM null");
      fBProcedureCall0.getOutputParams();
      fBProcedureCall0.hashCode();
      int int0 = 0;
      try { 
        fBProcedureCall0.mapOutParamIndexToPosition(0, false);
        fail("Expecting exception: FBSQLException");
      
      } catch(FBSQLException e) {
         //
         // Specified parameter does not exist.
         //
         verifyException("org.firebirdsql.jdbc.FBProcedureCall", e);
      }
  }

  /**
  //Test case number: 21
  /*Coverage entropy=2.7125148852719785
  */
  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      FBProcedureParam fBProcedureParam0 = new FBProcedureParam(2, "it ws not registered as output parameter.");
      fBProcedureCall0.addOutputParam(fBProcedureParam0);
      FBProcedureCall fBProcedureCall1 = (FBProcedureCall)fBProcedureCall0.clone();
      fBProcedureCall0.addParam(2, "it ws not registered as output parameter.");
      fBProcedureCall0.mapOutParamIndexToPosition(2);
      fBProcedureCall0.addInputParam(fBProcedureParam0);
      fBProcedureCall1.addInputParam(fBProcedureParam0);
      fBProcedureCall1.mapOutParamIndexToPosition(2);
      fBProcedureCall0.getSQL(false);
      FBProcedureParam fBProcedureParam1 = fBProcedureCall0.addParam(0, "EXECUTE PROCEDURE null(it ws not registered as output parameter.)");
      fBProcedureCall1.addOutputParam(fBProcedureParam1);
      fBProcedureCall0.hashCode();
      // Undeclared exception!
      try { 
        fBProcedureCall1.registerOutParam((-376), 305497698);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -377
         //
         verifyException("java.util.Vector", e);
      }
  }

  /**
  //Test case number: 22
  /*Coverage entropy=2.675356967780145
  */
  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      FBProcedureParam fBProcedureParam0 = fBProcedureCall0.addParam(2, "it ws not registered as output parameter.");
      fBProcedureCall0.addOutputParam(fBProcedureParam0);
      Object object0 = fBProcedureCall0.clone();
      FBProcedureParam fBProcedureParam1 = fBProcedureCall0.addParam(2, "it ws not registered as output parameter.");
      fBProcedureCall0.mapOutParamIndexToPosition(2);
      fBProcedureCall0.addInputParam(fBProcedureParam0);
      fBProcedureCall0.setName("Cannot set parameter, since it is constant.");
      fBProcedureCall0.addOutputParam(fBProcedureParam1);
      fBProcedureCall0.addOutputParam(fBProcedureParam1);
      FBProcedureParam fBProcedureParam2 = fBProcedureCall0.addParam(2, "Cannot set parameter, since it is constant.");
      fBProcedureCall0.setName("}l1Y03PKTMauai:.N");
      fBProcedureCall0.registerOutParam((-1), 63);
      fBProcedureParam2.setType(2);
      assertFalse(fBProcedureCall0.equals((Object)object0));
      
      FBProcedureParam fBProcedureParam3 = new FBProcedureParam();
      fBProcedureParam3.setType(4);
      fBProcedureCall0.addOutputParam(fBProcedureParam3);
      fBProcedureCall0.addOutputParam(fBProcedureParam1);
      fBProcedureParam2.setIndex(37);
      Object object1 = fBProcedureCall0.clone();
      fBProcedureCall0.addOutputParam(fBProcedureParam2);
      fBProcedureCall0.getName();
      assertTrue(fBProcedureCall0.equals((Object)object1));
  }

  /**
  //Test case number: 23
  /*Coverage entropy=2.1254548118601266
  */
  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      fBProcedureCall0.addParam(887, "iJVcDr\"gDvqAri1&l");
      fBProcedureCall0.registerOutParam((-1), 37);
      fBProcedureCall0.addParam(37, "QkWp<$+kZj$Y[)!yA^");
      boolean boolean0 = false;
      fBProcedureCall0.getSQL(false);
      // Undeclared exception!
      try { 
        fBProcedureCall0.registerOutParam((-1982), 887);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -1983
         //
         verifyException("java.util.Vector", e);
      }
  }

  /**
  //Test case number: 24
  /*Coverage entropy=1.717020786717215
  */
  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      int int0 = 2343;
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      fBProcedureCall0.mapOutParamIndexToPosition(2343, true);
      fBProcedureCall0.getInputParam(2343);
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
  //Test case number: 25
  /*Coverage entropy=1.0931471805599453
  */
  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      String string0 = fBProcedureCall0.getName();
      assertNull(string0);
  }

  /**
  //Test case number: 26
  /*Coverage entropy=1.372973239538552
  */
  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      fBProcedureCall0.addParam(2, "it was not registered as output parameter.");
      FBProcedureParam fBProcedureParam0 = new FBProcedureParam();
      FBProcedureParam fBProcedureParam1 = fBProcedureCall0.addParam(5, "*(4N");
      fBProcedureCall0.clone();
      FBProcedureCall fBProcedureCall1 = new FBProcedureCall();
      Object object0 = new Object();
      try { 
        fBProcedureParam1.setValue(object0);
        fail("Expecting exception: FBSQLException");
      
      } catch(FBSQLException e) {
         //
         // Cannot set parameter, since it is constant.
         //
         verifyException("org.firebirdsql.jdbc.FBProcedureParam", e);
      }
  }

  /**
  //Test case number: 27
  /*Coverage entropy=2.064754934412134
  */
  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      FBProcedureParam fBProcedureParam0 = new FBProcedureParam();
      fBProcedureParam0.setIndex(0);
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      fBProcedureCall0.addInputParam(fBProcedureParam0);
      int int0 = (-3814);
      fBProcedureCall0.mapOutParamIndexToPosition((-3814));
      fBProcedureCall0.getSQL(true);
      FBProcedureParam fBProcedureParam1 = fBProcedureCall0.addParam(0, "'");
      fBProcedureCall0.addOutputParam(fBProcedureParam1);
      try { 
        fBProcedureCall0.mapOutParamIndexToPosition(37, false);
        fail("Expecting exception: FBSQLException");
      
      } catch(FBSQLException e) {
         //
         // Specified parameter does not exist.
         //
         verifyException("org.firebirdsql.jdbc.FBProcedureCall", e);
      }
  }

  /**
  //Test case number: 28
  /*Coverage entropy=2.064754934412134
  */
  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      FBProcedureParam fBProcedureParam0 = new FBProcedureParam();
      int int0 = 0;
      fBProcedureParam0.setIndex(0);
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      fBProcedureCall0.addInputParam(fBProcedureParam0);
      fBProcedureCall0.mapOutParamIndexToPosition(0);
      fBProcedureCall0.getSQL(true);
      FBProcedureParam fBProcedureParam1 = fBProcedureCall0.addParam(0, "'");
      fBProcedureParam1.setIndex(0);
      fBProcedureCall0.addOutputParam(fBProcedureParam1);
      try { 
        fBProcedureCall0.mapOutParamIndexToPosition(37, false);
        fail("Expecting exception: FBSQLException");
      
      } catch(FBSQLException e) {
         //
         // Specified parameter does not exist.
         //
         verifyException("org.firebirdsql.jdbc.FBProcedureCall", e);
      }
  }

  /**
  //Test case number: 29
  /*Coverage entropy=0.8053415898278653
  */
  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      fBProcedureCall0.addParam(1484, "Specified parameter does not exist.");
      FBProcedureParam fBProcedureParam0 = fBProcedureCall0.addParam(1484, "h6Ifh");
      assertEquals(1484, fBProcedureParam0.getPosition());
  }

  /**
  //Test case number: 30
  /*Coverage entropy=0.7536544019628768
  */
  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      fBProcedureCall0.addParam(723, "'");
      String string0 = "OM.z25?/[Tf*o:vs";
      // Undeclared exception!
      try { 
        fBProcedureCall0.addParam((-246), "OM.z25?/[Tf*o:vs");
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -246
         //
         verifyException("java.util.Vector", e);
      }
  }

  /**
  //Test case number: 31
  /*Coverage entropy=2.1769076923433905
  */
  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      FBProcedureParam fBProcedureParam0 = fBProcedureCall0.addParam(868, "iJVcDr\"gDvqAri1&l");
      fBProcedureCall0.registerOutParam((-1), (-48756830));
      FBProcedureCall fBProcedureCall1 = new FBProcedureCall();
      fBProcedureCall1.addInputParam(fBProcedureParam0);
      fBProcedureCall1.addOutputParam(fBProcedureParam0);
      // Undeclared exception!
      try { 
        fBProcedureCall0.registerOutParam((-48756830), 1908);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -48756831
         //
         verifyException("java.util.Vector", e);
      }
  }

  /**
  //Test case number: 32
  /*Coverage entropy=1.7009345327457432
  */
  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      FBProcedureParam fBProcedureParam0 = fBProcedureCall0.addParam(2, "it was not registered as output parameter.");
      FBProcedureParam fBProcedureParam1 = fBProcedureCall0.addParam(2, "GDS Exception. ");
      fBProcedureCall0.addOutputParam(fBProcedureParam1);
      fBProcedureCall0.addInputParam(fBProcedureParam0);
      assertEquals("it was not registered as output parameter.", fBProcedureParam0.getParamValue());
      
      fBProcedureCall0.addOutputParam(fBProcedureParam1);
      assertEquals(2, fBProcedureParam1.getPosition());
      assertEquals("GDS Exception.", fBProcedureParam1.getParamValue());
      
      List<FBProcedureParam> list0 = fBProcedureCall0.getInputParams();
      assertEquals(3, list0.size());
  }

  /**
  //Test case number: 33
  /*Coverage entropy=2.569365071104486
  */
  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      FBProcedureParam fBProcedureParam0 = new FBProcedureParam();
      fBProcedureParam0.setType(1105);
      fBProcedureCall0.addInputParam(fBProcedureParam0);
      fBProcedureCall0.mapOutParamIndexToPosition(63);
      fBProcedureCall0.getSQL(true);
      fBProcedureCall0.addParam(63, "01S00");
      FBProcedureParam fBProcedureParam1 = fBProcedureCall0.getInputParam(37);
      fBProcedureParam0.setIndex(516);
      fBProcedureParam1.setIndex((-235027386));
      fBProcedureCall0.addOutputParam(fBProcedureParam1);
      fBProcedureCall0.mapOutParamIndexToPosition(1105, true);
      fBProcedureCall0.addOutputParam(fBProcedureParam1);
      fBProcedureCall0.addOutputParam(fBProcedureParam1);
      fBProcedureParam0.setIndex(1105);
      fBProcedureCall0.addOutputParam(fBProcedureParam1);
      fBProcedureCall0.registerOutParam(1105, (-3648));
      assertNull(fBProcedureCall0.getName());
  }

  /**
  //Test case number: 34
  /*Coverage entropy=0.810116318288409
  */
  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      FBProcedureParam fBProcedureParam0 = fBProcedureCall0.addParam(0, "iJVcDr\"gDvqAri1&l");
      assertEquals(0, fBProcedureParam0.getPosition());
  }

  /**
  //Test case number: 35
  /*Coverage entropy=1.4139366276231569
  */
  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      FBProcedureCall fBProcedureCall1 = new FBProcedureCall();
      fBProcedureCall1.getInputParam(15);
      fBProcedureCall1.getInputParam(15);
      assertFalse(fBProcedureCall1.equals((Object)fBProcedureCall0));
  }

  /**
  //Test case number: 36
  /*Coverage entropy=0.976592899728664
  */
  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      FBProcedureCall fBProcedureCall1 = new FBProcedureCall();
      boolean boolean0 = fBProcedureCall0.equals(fBProcedureCall1);
      assertTrue(boolean0);
      
      FBProcedureCall fBProcedureCall2 = new FBProcedureCall();
      FBProcedureCall fBProcedureCall3 = new FBProcedureCall();
      FBProcedureCall fBProcedureCall4 = new FBProcedureCall();
      FBProcedureCall fBProcedureCall5 = new FBProcedureCall();
      FBProcedureCall fBProcedureCall6 = new FBProcedureCall();
      FBProcedureCall fBProcedureCall7 = new FBProcedureCall();
      FBProcedureCall fBProcedureCall8 = new FBProcedureCall();
      assertTrue(fBProcedureCall8.equals((Object)fBProcedureCall1));
  }

  /**
  //Test case number: 37
  /*Coverage entropy=1.410015058995706
  */
  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      fBProcedureCall0.getInputParam(2343);
      // Undeclared exception!
      try { 
        fBProcedureCall0.getInputParam((-3110));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -3111
         //
         verifyException("java.util.Vector", e);
      }
  }

  /**
  //Test case number: 38
  /*Coverage entropy=1.3120076729259056
  */
  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
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
  //Test case number: 39
  /*Coverage entropy=0.9289738521096165
  */
  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      fBProcedureCall0.getSQL(true);
      fBProcedureCall0.getSQL(false);
      Object object0 = new Object();
  }
}
