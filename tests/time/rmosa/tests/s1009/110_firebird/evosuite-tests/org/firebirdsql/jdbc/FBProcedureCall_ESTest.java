/*
 * This file was automatically generated by EvoSuite
 * Thu Dec 05 23:44:21 GMT 2019
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
  /*Coverage entropy=0.4615384615384615
  */
  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      FBProcedureParam fBProcedureParam0 = new FBProcedureParam();
      fBProcedureCall0.addInputParam(fBProcedureParam0);
      FBProcedureParam fBProcedureParam1 = new FBProcedureParam(2801, "6$K]y");
      fBProcedureCall0.addOutputParam(fBProcedureParam1);
      fBProcedureCall0.registerOutParam((-1), 1);
      assertNull(fBProcedureCall0.getName());
  }

  /**
  //Test case number: 1
  /*Coverage entropy=1.166831391086261
  */
  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      fBProcedureCall0.getOutputParam(2);
      FBProcedureParam fBProcedureParam0 = new FBProcedureParam(2, "}$w?@}.DW><?5>}?\"S");
      fBProcedureParam0.setValue(fBProcedureCall0);
      fBProcedureParam0.setIndex(2);
      fBProcedureCall0.addParam(2, "}$w?@}.DW><?5>}?\"S");
      fBProcedureCall0.addOutputParam(fBProcedureParam0);
      fBProcedureCall0.hashCode();
      int int0 = fBProcedureCall0.mapOutParamIndexToPosition((-1), true);
      assertEquals((-1), int0);
      
      FBProcedureParam fBProcedureParam1 = fBProcedureCall0.getOutputParam(2);
      assertEquals(0, fBProcedureParam1.getType());
  }

  /**
  //Test case number: 2
  /*Coverage entropy=0.4
  */
  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      FBProcedureParam fBProcedureParam0 = fBProcedureCall0.addParam(481, "in'H1R=");
      assertEquals("in'H1R=", fBProcedureParam0.getParamValue());
  }

  /**
  //Test case number: 3
  /*Coverage entropy=0.4444444444444445
  */
  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      FBProcedureParam fBProcedureParam0 = new FBProcedureParam();
      fBProcedureParam0.setType(10);
      fBProcedureCall0.addInputParam(fBProcedureParam0);
      FBProcedureParam fBProcedureParam1 = fBProcedureCall0.getInputParam((-1));
      assertEquals(10, fBProcedureParam1.getType());
  }

  /**
  //Test case number: 4
  /*Coverage entropy=0.4666666666666667
  */
  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      FBProcedureParam fBProcedureParam0 = fBProcedureCall0.addParam(2202, "bPqisX0<n");
      fBProcedureCall0.addInputParam(fBProcedureParam0);
      fBProcedureCall0.addOutputParam(fBProcedureParam0);
      fBProcedureCall0.clone();
      fBProcedureCall0.addParam(257, "}$w?G@}.DW><?5>}?\"S");
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
  //Test case number: 5
  /*Coverage entropy=0.4615384615384615
  */
  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      FBProcedureParam fBProcedureParam0 = new FBProcedureParam();
      fBProcedureCall0.addInputParam(fBProcedureParam0);
      fBProcedureCall0.addOutputParam(fBProcedureParam0);
      fBProcedureCall0.registerOutParam((-1), (-1));
      assertTrue(FBProcedureCall.OLD_CALLABLE_STATEMENT_COMPATIBILITY);
  }

  /**
  //Test case number: 6
  /*Coverage entropy=2.2826685601371457
  */
  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      fBProcedureCall0.getInputParam(63);
      fBProcedureCall0.setName("");
      fBProcedureCall0.getInputParam(3);
      fBProcedureCall0.clone();
      fBProcedureCall0.clone();
      fBProcedureCall0.clone();
      FBProcedureParam fBProcedureParam0 = fBProcedureCall0.getOutputParam(4);
      FBProcedureParam fBProcedureParam1 = fBProcedureCall0.getOutputParam((-2641));
      fBProcedureCall0.getSQL(true);
      FBProcedureCall fBProcedureCall1 = (FBProcedureCall)fBProcedureCall0.clone();
      fBProcedureParam1.setType(887);
      assertEquals((-1), fBProcedureParam1.getIndex());
      
      fBProcedureParam1.setIndex((-2641));
      fBProcedureCall0.getOutputParams();
      fBProcedureCall0.getInputParams();
      fBProcedureCall0.clone();
      fBProcedureCall1.getName();
      fBProcedureCall0.getSQL(true);
      fBProcedureCall0.addOutputParam(fBProcedureParam1);
      fBProcedureCall0.addOutputParam(fBProcedureParam0);
      fBProcedureCall0.getSQL(true);
      fBProcedureCall0.getName();
      fBProcedureCall1.addOutputParam(fBProcedureParam1);
      assertTrue(fBProcedureCall0.equals((Object)fBProcedureCall1));
  }

  /**
  //Test case number: 7
  /*Coverage entropy=0.4444444444444445
  */
  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      FBProcedureParam fBProcedureParam0 = fBProcedureCall0.addParam(2, "}$w?G@}LDW><?5> }?\"S");
      fBProcedureParam0.setValue(fBProcedureCall0);
      fBProcedureCall0.addOutputParam(fBProcedureParam0);
      String string0 = fBProcedureCall0.getSQL(true);
      assertEquals("SELECT * FROM null(}$w?G@}LDW><?5> }?\"S)", string0);
  }

  /**
  //Test case number: 8
  /*Coverage entropy=1.159813847226612
  */
  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      FBProcedureParam fBProcedureParam0 = new FBProcedureParam();
      fBProcedureParam0.setIndex(1793);
      fBProcedureCall0.addInputParam(fBProcedureParam0);
      fBProcedureCall0.addInputParam(fBProcedureParam0);
      fBProcedureCall0.addOutputParam(fBProcedureParam0);
      Object object0 = fBProcedureCall0.clone();
      FBProcedureParam fBProcedureParam1 = fBProcedureCall0.getOutputParam(1793);
      assertSame(fBProcedureParam1, fBProcedureParam0);
      assertTrue(fBProcedureCall0.equals((Object)object0));
      assertEquals(0, fBProcedureParam1.getType());
      assertNotSame(fBProcedureCall0, object0);
  }

  /**
  //Test case number: 9
  /*Coverage entropy=0.4444444444444445
  */
  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      FBProcedureParam fBProcedureParam0 = new FBProcedureParam(2, "}$w?@}.DW><?5>}?\"S");
      fBProcedureCall0.addParam(2961, "}$w?@}.DW><?5>}?\"S");
      fBProcedureCall0.addOutputParam(fBProcedureParam0);
      // Undeclared exception!
      try { 
        fBProcedureCall0.getSQL(false);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // Array index out of range: 2961
         //
         verifyException("java.util.Vector", e);
      }
  }

  /**
  //Test case number: 10
  /*Coverage entropy=0.4
  */
  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      FBProcedureParam fBProcedureParam0 = new FBProcedureParam();
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
  //Test case number: 11
  /*Coverage entropy=0.4615384615384615
  */
  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      FBProcedureParam fBProcedureParam0 = new FBProcedureParam(2, "}$w?@}.DW><?5>}?\"S");
      fBProcedureParam0.setIndex(2);
      FBProcedureParam fBProcedureParam1 = fBProcedureCall0.addParam(2, "}$w?@}.DW><?5>}?\"S");
      assertEquals(2, fBProcedureParam1.getPosition());
      
      fBProcedureCall0.addOutputParam(fBProcedureParam0);
      String string0 = fBProcedureCall0.getSQL(true);
      assertEquals("SELECT * FROM null(}$w?@}.DW><?5>}?\"S)", string0);
      
      int int0 = fBProcedureCall0.mapOutParamIndexToPosition(2, true);
      assertEquals(1, int0);
      
      int int1 = fBProcedureCall0.mapOutParamIndexToPosition((-1), true);
      assertEquals((-1), int1);
  }

  /**
  //Test case number: 12
  /*Coverage entropy=0.4444444444444445
  */
  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      fBProcedureCall0.addParam(0, "+@G@}F.DK)<?5)");
      FBProcedureParam fBProcedureParam0 = fBProcedureCall0.addParam(362, "+@G@}F.DK)<?5)");
      assertEquals(362, fBProcedureParam0.getPosition());
      
      String string0 = fBProcedureCall0.getSQL(true);
      assertEquals("SELECT * FROM null(+@G@}F.DK)<?5), +@G@}F.DK)<?5))", string0);
  }

  /**
  //Test case number: 13
  /*Coverage entropy=1.159813847226612
  */
  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      FBProcedureParam fBProcedureParam0 = new FBProcedureParam();
      fBProcedureParam0.setType((-1));
      fBProcedureCall0.addInputParam(fBProcedureParam0);
      fBProcedureCall0.registerOutParam((-1), (-1));
      FBProcedureParam fBProcedureParam1 = fBProcedureCall0.getOutputParam((-1));
      assertEquals((-1), fBProcedureParam1.getType());
  }

  /**
  //Test case number: 14
  /*Coverage entropy=1.159813847226612
  */
  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      FBProcedureParam fBProcedureParam0 = new FBProcedureParam();
      fBProcedureCall0.addInputParam(fBProcedureParam0);
      fBProcedureCall0.registerOutParam((-1), 887);
      FBProcedureParam fBProcedureParam1 = fBProcedureCall0.getOutputParam((-1));
      assertEquals(887, fBProcedureParam1.getType());
  }

  /**
  //Test case number: 15
  /*Coverage entropy=1.1476926351053998
  */
  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      FBProcedureParam fBProcedureParam0 = new FBProcedureParam(29, "}$w?@}.DW><?5>}?\"S");
      fBProcedureCall0.addOutputParam(fBProcedureParam0);
      String string0 = fBProcedureCall0.getSQL(false);
      assertEquals("EXECUTE PROCEDURE null", string0);
      
      FBProcedureParam fBProcedureParam1 = fBProcedureCall0.getOutputParam((-1));
      assertEquals(29, fBProcedureParam1.getPosition());
  }

  /**
  //Test case number: 16
  /*Coverage entropy=1.1476926351053998
  */
  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      FBProcedureParam fBProcedureParam0 = new FBProcedureParam();
      fBProcedureCall0.addInputParam(fBProcedureParam0);
      fBProcedureCall0.addOutputParam(fBProcedureParam0);
      FBProcedureParam fBProcedureParam1 = fBProcedureCall0.getOutputParam((-1));
      assertEquals(0, fBProcedureParam1.getType());
  }

  /**
  //Test case number: 17
  /*Coverage entropy=1.166831391086261
  */
  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      FBProcedureParam fBProcedureParam0 = new FBProcedureParam(3542, "xqw[/<!C");
      fBProcedureCall0.addInputParam(fBProcedureParam0);
      fBProcedureCall0.addOutputParam(fBProcedureParam0);
      // Undeclared exception!
      fBProcedureCall0.registerOutParam(3542, (-1338));
  }

  /**
  //Test case number: 18
  /*Coverage entropy=1.1714080501251627
  */
  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      FBProcedureParam fBProcedureParam0 = new FBProcedureParam(4295, "}$w?@}.DW><?5>}?\"S");
      fBProcedureParam0.clone();
      fBProcedureCall0.addInputParam(fBProcedureParam0);
      fBProcedureCall0.registerOutParam((-1), 2);
      fBProcedureCall0.hashCode();
      fBProcedureCall0.clone();
      fBProcedureCall0.getOutputParam(4295);
      // Undeclared exception!
      fBProcedureCall0.getInputParam((-152));
  }

  /**
  //Test case number: 19
  /*Coverage entropy=0.45454545454545453
  */
  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      FBProcedureParam fBProcedureParam0 = new FBProcedureParam(2, "}$w?G@}.DW><?5>}?\"S");
      FBProcedureParam fBProcedureParam1 = fBProcedureCall0.addParam(2, "}$w?G@}.DW><?5>}?\"S");
      fBProcedureCall0.addOutputParam(fBProcedureParam1);
      assertEquals(2, fBProcedureParam1.getPosition());
      
      String string0 = fBProcedureCall0.getSQL(true);
      assertEquals("SELECT * FROM null(}$w?G@}.DW><?5>}?\"S)", string0);
      
      int int0 = fBProcedureCall0.mapOutParamIndexToPosition(2, true);
      assertEquals(2, int0);
  }

  /**
  //Test case number: 20
  /*Coverage entropy=0.4444444444444445
  */
  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      FBProcedureParam fBProcedureParam0 = new FBProcedureParam(2, "}$w?@}.DW><?5>}?\"S");
      fBProcedureCall0.addOutputParam(fBProcedureParam0);
      fBProcedureCall0.getSQL(false);
      try { 
        fBProcedureCall0.mapOutParamIndexToPosition((-164), false);
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
  /*Coverage entropy=0.4
  */
  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
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
  //Test case number: 22
  /*Coverage entropy=0.42857142857142855
  */
  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      FBProcedureParam fBProcedureParam0 = new FBProcedureParam(606, "}+@");
      fBProcedureCall0.addOutputParam(fBProcedureParam0);
      int int0 = fBProcedureCall0.mapOutParamIndexToPosition(976, true);
      assertEquals(976, int0);
  }

  /**
  //Test case number: 23
  /*Coverage entropy=0.4
  */
  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      // Undeclared exception!
      try { 
        fBProcedureCall0.addParam((-146010727), "k;[");
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -146010727
         //
         verifyException("java.util.Vector", e);
      }
  }

  /**
  //Test case number: 24
  /*Coverage entropy=0.4
  */
  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      // Undeclared exception!
      try { 
        fBProcedureCall0.addParam((-1), " not set and ");
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -1
         //
         verifyException("java.util.Vector", e);
      }
  }

  /**
  //Test case number: 25
  /*Coverage entropy=0.4
  */
  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      FBProcedureParam fBProcedureParam0 = new FBProcedureParam((-1), "}$w?@_.DWC<?5>}?\"S");
      fBProcedureParam0.clone();
      // Undeclared exception!
      try { 
        fBProcedureCall0.addInputParam(fBProcedureParam0);
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
  /*Coverage entropy=0.42857142857142855
  */
  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      FBProcedureParam fBProcedureParam0 = new FBProcedureParam(2, "}$w?@}.DW><?5>}?\"S");
      fBProcedureCall0.addOutputParam(fBProcedureParam0);
      Object object0 = fBProcedureCall0.clone();
      assertNotSame(object0, fBProcedureCall0);
      assertTrue(object0.equals((Object)fBProcedureCall0));
  }

  /**
  //Test case number: 27
  /*Coverage entropy=1.1217186091313738
  */
  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      FBProcedureParam fBProcedureParam0 = new FBProcedureParam();
      fBProcedureCall0.addOutputParam(fBProcedureParam0);
      List<FBProcedureParam> list0 = fBProcedureCall0.getOutputParams();
      assertTrue(list0.contains(fBProcedureParam0));
  }

  /**
  //Test case number: 28
  /*Coverage entropy=0.42857142857142855
  */
  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      FBProcedureParam fBProcedureParam0 = fBProcedureCall0.addParam(4, "gqVQ?N-*n4<8");
      assertEquals(4, fBProcedureParam0.getPosition());
      
      Object object0 = fBProcedureCall0.clone();
      assertTrue(object0.equals((Object)fBProcedureCall0));
      assertNotSame(object0, fBProcedureCall0);
  }

  /**
  //Test case number: 29
  /*Coverage entropy=0.4
  */
  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      FBProcedureParam fBProcedureParam0 = fBProcedureCall0.addParam(414, "no");
      assertEquals(414, fBProcedureParam0.getPosition());
  }

  /**
  //Test case number: 30
  /*Coverage entropy=0.4444444444444445
  */
  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      FBProcedureParam fBProcedureParam0 = new FBProcedureParam();
      fBProcedureCall0.addInputParam(fBProcedureParam0);
      FBProcedureCall fBProcedureCall1 = new FBProcedureCall();
      boolean boolean0 = fBProcedureCall1.equals(fBProcedureCall0);
      assertFalse(boolean0);
  }

  /**
  //Test case number: 31
  /*Coverage entropy=1.1714080501251627
  */
  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      FBProcedureCall fBProcedureCall1 = new FBProcedureCall();
      fBProcedureCall1.getSQL(true);
      FBProcedureCall fBProcedureCall2 = new FBProcedureCall();
      FBProcedureCall fBProcedureCall3 = new FBProcedureCall();
      fBProcedureCall2.setName("SELECT * FROM null");
      fBProcedureCall2.clone();
      fBProcedureCall2.equals(fBProcedureCall0);
      int int0 = (-1339);
      // Undeclared exception!
      try { 
        fBProcedureCall1.getInputParam((-1339));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -1340
         //
         verifyException("java.util.Vector", e);
      }
  }

  /**
  //Test case number: 32
  /*Coverage entropy=0.4
  */
  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      int int0 = (-1);
      FBProcedureParam fBProcedureParam0 = new FBProcedureParam((-1), "DTs9& XW|`<q/r\"");
      // Undeclared exception!
      try { 
        fBProcedureCall0.addOutputParam(fBProcedureParam0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -1
         //
         verifyException("java.util.Vector", e);
      }
  }

  /**
  //Test case number: 33
  /*Coverage entropy=0.4
  */
  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      FBProcedureParam fBProcedureParam0 = new FBProcedureParam((-28578680), "hy");
      // Undeclared exception!
      try { 
        fBProcedureCall0.addOutputParam(fBProcedureParam0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -28578680
         //
         verifyException("java.util.Vector", e);
      }
  }

  /**
  //Test case number: 34
  /*Coverage entropy=1.5748027648585858
  */
  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      fBProcedureCall0.setName("Specified parameter does not exist.");
      FBProcedureCall fBProcedureCall1 = new FBProcedureCall();
      fBProcedureCall1.equals(fBProcedureCall0);
      try { 
        fBProcedureCall0.registerOutParam(4963, 4963);
        fail("Expecting exception: FBSQLException");
      
      } catch(FBSQLException e) {
         //
         // Cannot find parameter with the specified position.
         //
         verifyException("org.firebirdsql.jdbc.FBProcedureCall", e);
      }
  }

  /**
  //Test case number: 35
  /*Coverage entropy=0.42857142857142855
  */
  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      FBProcedureCall fBProcedureCall1 = new FBProcedureCall();
      boolean boolean0 = fBProcedureCall1.equals(fBProcedureCall0);
      assertTrue(boolean0);
  }

  /**
  //Test case number: 36
  /*Coverage entropy=1.1217186091313738
  */
  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      FBProcedureParam fBProcedureParam0 = fBProcedureCall0.addParam(2, "08003");
      assertEquals(2, fBProcedureParam0.getPosition());
      
      List<FBProcedureParam> list0 = fBProcedureCall0.getInputParams();
      assertEquals(3, list0.size());
  }

  /**
  //Test case number: 37
  /*Coverage entropy=0.42857142857142855
  */
  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      FBProcedureParam fBProcedureParam0 = new FBProcedureParam();
      fBProcedureCall0.addOutputParam(fBProcedureParam0);
      try { 
        fBProcedureCall0.mapOutParamIndexToPosition(1822, false);
        fail("Expecting exception: FBSQLException");
      
      } catch(FBSQLException e) {
         //
         // Specified parameter does not exist.
         //
         verifyException("org.firebirdsql.jdbc.FBProcedureCall", e);
      }
  }

  /**
  //Test case number: 38
  /*Coverage entropy=1.1476926351053998
  */
  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      FBProcedureParam fBProcedureParam0 = fBProcedureCall0.getInputParam(887);
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
  //Test case number: 39
  /*Coverage entropy=1.5271837172395382
  */
  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      fBProcedureCall0.setName("1");
      String string0 = fBProcedureCall0.getName();
      assertEquals("1", string0);
  }

  /**
  //Test case number: 40
  /*Coverage entropy=1.1217186091313738
  */
  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      int int0 = fBProcedureCall0.mapOutParamIndexToPosition((-146010727));
      assertEquals((-146010727), int0);
  }

  /**
  //Test case number: 41
  /*Coverage entropy=1.0931471805599453
  */
  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      List<FBProcedureParam> list0 = fBProcedureCall0.getInputParams();
      assertEquals(0, list0.size());
  }

  /**
  //Test case number: 42
  /*Coverage entropy=0.45454545454545453
  */
  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      FBProcedureParam fBProcedureParam0 = new FBProcedureParam();
      fBProcedureCall0.addInputParam(fBProcedureParam0);
      // Undeclared exception!
      try { 
        fBProcedureCall0.getInputParam((-1579));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -1580
         //
         verifyException("java.util.Vector", e);
      }
  }

  /**
  //Test case number: 43
  /*Coverage entropy=0.42857142857142855
  */
  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      FBProcedureParam fBProcedureParam0 = fBProcedureCall0.addParam(257, "}$w?G@}.DW><?5>}?\"S");
      assertEquals(257, fBProcedureParam0.getPosition());
      
      String string0 = fBProcedureCall0.getSQL(true);
      assertEquals("SELECT * FROM null(}$w?G@}.DW><?5>}?\"S)", string0);
  }

  /**
  //Test case number: 44
  /*Coverage entropy=0.42857142857142855
  */
  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      FBProcedureParam fBProcedureParam0 = new FBProcedureParam();
      fBProcedureCall0.addInputParam(fBProcedureParam0);
      String string0 = fBProcedureCall0.getSQL(false);
      assertEquals("EXECUTE PROCEDURE null(null)", string0);
  }

  /**
  //Test case number: 45
  /*Coverage entropy=0.4444444444444445
  */
  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
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
  //Test case number: 46
  /*Coverage entropy=0.45454545454545453
  */
  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      // Undeclared exception!
      try { 
        fBProcedureCall0.registerOutParam(0, 371);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -1
         //
         verifyException("java.util.Vector", e);
      }
  }

  /**
  //Test case number: 47
  /*Coverage entropy=0.45454545454545453
  */
  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      FBProcedureParam fBProcedureParam0 = new FBProcedureParam();
      fBProcedureCall0.addInputParam(fBProcedureParam0);
      FBProcedureParam fBProcedureParam1 = fBProcedureCall0.getInputParam(13);
      //  // Unstable assertion: assertEquals(2834, fBProcedureParam1.getType());
  }

  /**
  //Test case number: 48
  /*Coverage entropy=0.4444444444444445
  */
  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      FBProcedureParam fBProcedureParam0 = new FBProcedureParam(2, "}$w?@_.DWC<?5Q}F\"S");
      fBProcedureParam0.setIndex(2);
      fBProcedureCall0.addInputParam(fBProcedureParam0);
      FBProcedureParam fBProcedureParam1 = fBProcedureCall0.getInputParam(2);
      assertEquals(2, fBProcedureParam1.getPosition());
  }

  /**
  //Test case number: 49
  /*Coverage entropy=0.45454545454545453
  */
  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      // Undeclared exception!
      try { 
        fBProcedureCall0.registerOutParam((-175289205), (-175289205));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -175289206
         //
         verifyException("java.util.Vector", e);
      }
  }

  /**
  //Test case number: 50
  /*Coverage entropy=0.4444444444444445
  */
  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      FBProcedureParam fBProcedureParam0 = new FBProcedureParam();
      fBProcedureCall0.addInputParam(fBProcedureParam0);
      FBProcedureParam fBProcedureParam1 = fBProcedureCall0.getInputParam((-1));
      assertFalse(fBProcedureParam1.isValueSet());
  }

  /**
  //Test case number: 51
  /*Coverage entropy=1.1375916250043898
  */
  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      fBProcedureCall0.setName("kr19l`A/)e66");
      fBProcedureCall0.hashCode();
      Object object0 = fBProcedureCall0.clone();
      assertNotSame(object0, fBProcedureCall0);
  }

  /**
  //Test case number: 52
  /*Coverage entropy=0.4
  */
  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      FBProcedureParam fBProcedureParam0 = fBProcedureCall0.addParam(0, "");
      assertEquals(0, fBProcedureParam0.getPosition());
  }

  /**
  //Test case number: 53
  /*Coverage entropy=0.4
  */
  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      // Undeclared exception!
      try { 
        fBProcedureCall0.addParam((-1), (String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.firebirdsql.jdbc.FBProcedureCall", e);
      }
  }

  /**
  //Test case number: 54
  /*Coverage entropy=0.4
  */
  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      // Undeclared exception!
      try { 
        fBProcedureCall0.addParam((-973), "\"r zO\"i}(0k[");
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -973
         //
         verifyException("java.util.Vector", e);
      }
  }

  /**
  //Test case number: 55
  /*Coverage entropy=1.1056985263168437
  */
  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      try { 
        fBProcedureCall0.registerOutParam(734, 2834);
        fail("Expecting exception: FBSQLException");
      
      } catch(FBSQLException e) {
         //
         // Cannot find parameter with the specified position.
         //
         verifyException("org.firebirdsql.jdbc.FBProcedureCall", e);
      }
  }

  /**
  //Test case number: 56
  /*Coverage entropy=0.4
  */
  @Test(timeout = 4000)
  public void test56()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      FBProcedureParam fBProcedureParam0 = new FBProcedureParam((-28813497), "");
      // Undeclared exception!
      try { 
        fBProcedureCall0.addInputParam(fBProcedureParam0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -28813497
         //
         verifyException("java.util.Vector", e);
      }
  }

  /**
  //Test case number: 57
  /*Coverage entropy=1.1375916250043898
  */
  @Test(timeout = 4000)
  public void test57()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      int int0 = fBProcedureCall0.mapOutParamIndexToPosition(0);
      assertEquals(0, int0);
      
      Object object0 = fBProcedureCall0.clone();
      assertNotSame(object0, fBProcedureCall0);
  }

  /**
  //Test case number: 58
  /*Coverage entropy=0.4
  */
  @Test(timeout = 4000)
  public void test58()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      boolean boolean0 = fBProcedureCall0.equals(" not set and ");
      assertFalse(boolean0);
  }

  /**
  //Test case number: 59
  /*Coverage entropy=0.4
  */
  @Test(timeout = 4000)
  public void test59()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      boolean boolean0 = fBProcedureCall0.equals(fBProcedureCall0);
      assertTrue(boolean0);
  }

  /**
  //Test case number: 60
  /*Coverage entropy=0.4
  */
  @Test(timeout = 4000)
  public void test60()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      int int0 = fBProcedureCall0.mapOutParamIndexToPosition(0, true);
      assertEquals(0, int0);
  }

  /**
  //Test case number: 61
  /*Coverage entropy=1.1217186091313738
  */
  @Test(timeout = 4000)
  public void test61()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      int int0 = fBProcedureCall0.mapOutParamIndexToPosition(1);
      assertEquals(1, int0);
  }

  /**
  //Test case number: 62
  /*Coverage entropy=1.0931471805599453
  */
  @Test(timeout = 4000)
  public void test62()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      String string0 = fBProcedureCall0.getName();
      assertNull(string0);
  }
}
