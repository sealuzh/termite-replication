/*
 * This file was automatically generated by EvoSuite
 * Tue Dec 03 03:13:25 GMT 2019
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
  /*Coverage entropy=1.9335737715789212
  */
  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      FBProcedureParam fBProcedureParam0 = fBProcedureCall0.addParam(1165, "`+");
      fBProcedureCall0.addOutputParam(fBProcedureParam0);
      fBProcedureCall0.addParam(501, "`+");
      fBProcedureCall0.registerOutParam((-1), (-1));
      assertNull(fBProcedureCall0.getName());
  }

  /**
  //Test case number: 1
  /*Coverage entropy=1.5768731582333269
  */
  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      FBProcedureParam fBProcedureParam0 = new FBProcedureParam(716, "oAQR)`~:6?)*vW5L");
      fBProcedureParam0.setIndex(716);
      fBProcedureParam0.setValue(fBProcedureCall0);
      int int0 = fBProcedureCall0.mapOutParamIndexToPosition(716);
      assertEquals(716, int0);
      
      fBProcedureCall0.mapOutParamIndexToPosition(1468, true);
      fBProcedureCall0.addOutputParam(fBProcedureParam0);
      FBProcedureParam fBProcedureParam1 = fBProcedureCall0.getInputParam(716);
      assertTrue(fBProcedureParam1.isValueSet());
      
      FBProcedureCall fBProcedureCall1 = (FBProcedureCall)fBProcedureCall0.clone();
      FBProcedureParam fBProcedureParam2 = fBProcedureCall1.getOutputParam(716);
      assertNotSame(fBProcedureParam2, fBProcedureParam1);
      assertTrue(fBProcedureCall1.equals((Object)fBProcedureCall0));
      assertTrue(fBProcedureParam2.isValueSet());
  }

  /**
  //Test case number: 2
  /*Coverage entropy=0.47058823529411764
  */
  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      fBProcedureCall0.addParam(4668, "{ou");
      fBProcedureCall0.registerOutParam((-1), (-1));
      // Undeclared exception!
      fBProcedureCall0.getInputParam(835);
  }

  /**
  //Test case number: 3
  /*Coverage entropy=1.163735415854063
  */
  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      FBProcedureParam fBProcedureParam0 = fBProcedureCall0.addParam(4, "HTm6H&u*N6CKaN?dR");
      Object object0 = fBProcedureCall0.clone();
      assertTrue(object0.equals((Object)fBProcedureCall0));
      
      fBProcedureCall0.registerOutParam((-1), (-1));
      FBProcedureParam fBProcedureParam1 = fBProcedureCall0.getOutputParam((-1));
      assertEquals((-1), fBProcedureParam1.getType());
      assertEquals(4, fBProcedureParam1.getPosition());
      assertSame(fBProcedureParam1, fBProcedureParam0);
  }

  /**
  //Test case number: 4
  /*Coverage entropy=1.8734738482993778
  */
  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      fBProcedureCall0.getInputParam(887);
      FBProcedureParam fBProcedureParam0 = fBProcedureCall0.addParam(2585, "GDS Exception. ");
      fBProcedureCall0.addOutputParam(fBProcedureParam0);
      fBProcedureCall0.getInputParam(38);
      fBProcedureCall0.clone();
      fBProcedureCall0.setName("hy0");
      fBProcedureCall0.mapOutParamIndexToPosition(2585);
      fBProcedureCall0.getSQL(false);
      fBProcedureCall0.getOutputParam((-1230));
      fBProcedureCall0.getSQL(true);
      // Undeclared exception!
      fBProcedureCall0.getOutputParam((-1230));
  }

  /**
  //Test case number: 5
  /*Coverage entropy=1.5271837172395382
  */
  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      fBProcedureCall0.setName("");
      String string0 = fBProcedureCall0.getName();
      assertEquals("", string0);
  }

  /**
  //Test case number: 6
  /*Coverage entropy=1.163735415854063
  */
  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      FBProcedureCall fBProcedureCall1 = new FBProcedureCall();
      String string0 = "sK0Ha3V";
      FBProcedureParam fBProcedureParam0 = fBProcedureCall1.addParam(3593, "sK0Ha3V");
      fBProcedureCall0.addInputParam(fBProcedureParam0);
      fBProcedureCall0.getOutputParams();
      fBProcedureCall0.clone();
      FBProcedureParam fBProcedureParam1 = new FBProcedureParam();
      fBProcedureCall1.clone();
      // Undeclared exception!
      fBProcedureCall0.clone();
  }

  /**
  //Test case number: 7
  /*Coverage entropy=1.159813847226612
  */
  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      FBProcedureParam fBProcedureParam0 = new FBProcedureParam();
      fBProcedureParam0.setIndex(863);
      fBProcedureParam0.clone();
      fBProcedureParam0.setType((-1457));
      fBProcedureParam0.setIndex(863);
      fBProcedureCall0.addOutputParam(fBProcedureParam0);
      FBProcedureParam fBProcedureParam1 = fBProcedureCall0.getInputParam(863);
      assertEquals(863, fBProcedureParam1.getIndex());
      
      FBProcedureParam fBProcedureParam2 = fBProcedureCall0.getOutputParam(863);
      assertEquals(863, fBProcedureParam2.getIndex());
  }

  /**
  //Test case number: 8
  /*Coverage entropy=0.4782608695652174
  */
  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      FBProcedureParam fBProcedureParam0 = fBProcedureCall0.addParam(3568, "HY105");
      FBProcedureParam fBProcedureParam1 = fBProcedureCall0.addParam(3568, ">my");
      fBProcedureParam1.setIndex(1844);
      fBProcedureCall0.registerOutParam(1844, 1844);
      fBProcedureCall0.addInputParam(fBProcedureParam0);
      // Undeclared exception!
      fBProcedureCall0.registerOutParam((-2326), 37);
  }

  /**
  //Test case number: 9
  /*Coverage entropy=0.47058823529411764
  */
  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      FBProcedureParam fBProcedureParam0 = new FBProcedureParam(1298, "H&m6H&u*NuvKa)N?dR");
      Object object0 = fBProcedureCall0.clone();
      fBProcedureParam0.setValue(object0);
      fBProcedureParam0.setIndex(1298);
      fBProcedureCall0.addOutputParam(fBProcedureParam0);
      fBProcedureCall0.registerOutParam(1298, (-2322));
      String string0 = fBProcedureCall0.getSQL(true);
      assertNotSame(fBProcedureCall0, object0);
      assertEquals("SELECT * FROM null(H&m6H&u*NuvKa)N?dR)", string0);
  }

  /**
  //Test case number: 10
  /*Coverage entropy=0.4444444444444445
  */
  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      FBProcedureParam fBProcedureParam0 = fBProcedureCall0.addParam(136, "00Cm6H&u9*N6CKaN?dR");
      fBProcedureParam0.setValue(fBProcedureCall0);
      String string0 = fBProcedureCall0.getSQL(true);
      assertEquals("SELECT * FROM null(00Cm6H&u9*N6CKaN?dR)", string0);
      
      fBProcedureCall0.addOutputParam(fBProcedureParam0);
      assertEquals(136, fBProcedureParam0.getPosition());
  }

  /**
  //Test case number: 11
  /*Coverage entropy=0.4444444444444445
  */
  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      FBProcedureParam fBProcedureParam0 = new FBProcedureParam(1649, "m8v");
      fBProcedureCall0.addOutputParam(fBProcedureParam0);
      fBProcedureCall0.addParam(1, "(&FmHu.NZvv`a)N?[xdR");
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
  //Test case number: 12
  /*Coverage entropy=1.1375916250043898
  */
  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      FBProcedureParam fBProcedureParam0 = new FBProcedureParam();
      fBProcedureParam0.setType(2143);
      fBProcedureParam0.setIndex(2143);
      fBProcedureCall0.addOutputParam(fBProcedureParam0);
      FBProcedureParam fBProcedureParam1 = fBProcedureCall0.getOutputParam(2143);
      assertEquals(2143, fBProcedureParam1.getType());
  }

  /**
  //Test case number: 13
  /*Coverage entropy=1.1375916250043898
  */
  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      FBProcedureParam fBProcedureParam0 = new FBProcedureParam();
      fBProcedureParam0.setIndex(37);
      fBProcedureCall0.addOutputParam(fBProcedureParam0);
      FBProcedureParam fBProcedureParam1 = fBProcedureCall0.getOutputParam(37);
      assertEquals(37, fBProcedureParam1.getIndex());
  }

  /**
  //Test case number: 14
  /*Coverage entropy=1.1476926351053998
  */
  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      FBProcedureParam fBProcedureParam0 = new FBProcedureParam(2399, "(3(");
      fBProcedureParam0.setIndex(2503);
      fBProcedureCall0.addOutputParam(fBProcedureParam0);
      FBProcedureParam fBProcedureParam1 = fBProcedureCall0.getOutputParam(2503);
      assertEquals(2399, fBProcedureParam1.getPosition());
      
      int int0 = fBProcedureCall0.mapOutParamIndexToPosition(2399, true);
      assertEquals(2399, int0);
  }

  /**
  //Test case number: 15
  /*Coverage entropy=1.1375916250043898
  */
  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      FBProcedureParam fBProcedureParam0 = new FBProcedureParam();
      fBProcedureCall0.addOutputParam(fBProcedureParam0);
      FBProcedureParam fBProcedureParam1 = fBProcedureCall0.getOutputParam((-1));
      assertEquals(0, fBProcedureParam1.getType());
  }

  /**
  //Test case number: 16
  /*Coverage entropy=0.45454545454545453
  */
  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      fBProcedureCall0.addParam(12, "HTm6H&u*N6CKaN?dR");
      fBProcedureCall0.registerOutParam((-1), 12);
      assertNull(fBProcedureCall0.getName());
  }

  /**
  //Test case number: 17
  /*Coverage entropy=0.4615384615384615
  */
  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      FBProcedureParam fBProcedureParam0 = new FBProcedureParam();
      fBProcedureParam0.setIndex(3656);
      fBProcedureCall0.addOutputParam(fBProcedureParam0);
      fBProcedureCall0.registerOutParam(3656, 3656);
      assertTrue(FBProcedureCall.OLD_CALLABLE_STATEMENT_COMPATIBILITY);
  }

  /**
  //Test case number: 18
  /*Coverage entropy=0.45454545454545453
  */
  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      FBProcedureParam fBProcedureParam0 = new FBProcedureParam(716, "oAQR)`~:6?)*vW5L");
      fBProcedureParam0.setIndex(716);
      fBProcedureCall0.addOutputParam(fBProcedureParam0);
      fBProcedureCall0.mapOutParamIndexToPosition(716, true);
      fBProcedureCall0.mapOutParamIndexToPosition(1468, true);
      fBProcedureCall0.addOutputParam(fBProcedureParam0);
      assertFalse(fBProcedureParam0.isValueSet());
  }

  /**
  //Test case number: 19
  /*Coverage entropy=0.42857142857142855
  */
  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      String string0 = "oAQR)`~:6?)*vW5L";
      FBProcedureParam fBProcedureParam0 = new FBProcedureParam(1, "oAQR)`~:6?)*vW5L");
      fBProcedureCall0.addOutputParam(fBProcedureParam0);
      boolean boolean0 = false;
      try { 
        fBProcedureCall0.mapOutParamIndexToPosition((-1139), false);
        fail("Expecting exception: FBSQLException");
      
      } catch(FBSQLException e) {
         //
         // Specified parameter does not exist.
         //
         verifyException("org.firebirdsql.jdbc.FBProcedureCall", e);
      }
  }

  /**
  //Test case number: 20
  /*Coverage entropy=0.45454545454545453
  */
  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      FBProcedureParam fBProcedureParam0 = new FBProcedureParam();
      fBProcedureParam0.setIndex(863);
      fBProcedureParam0.setType(863);
      fBProcedureParam0.setIndex(863);
      fBProcedureCall0.addOutputParam(fBProcedureParam0);
      FBProcedureParam fBProcedureParam1 = fBProcedureCall0.getInputParam(863);
      assertEquals(863, fBProcedureParam1.getType());
  }

  /**
  //Test case number: 21
  /*Coverage entropy=0.4444444444444445
  */
  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      FBProcedureParam fBProcedureParam0 = new FBProcedureParam();
      fBProcedureCall0.addInputParam(fBProcedureParam0);
      fBProcedureParam0.setIndex(2);
      FBProcedureParam fBProcedureParam1 = fBProcedureCall0.getInputParam(2);
      assertEquals(2, fBProcedureParam1.getIndex());
  }

  /**
  //Test case number: 22
  /*Coverage entropy=0.4444444444444445
  */
  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      FBProcedureParam fBProcedureParam0 = new FBProcedureParam();
      fBProcedureCall0.addOutputParam(fBProcedureParam0);
      fBProcedureCall0.addParam(12, "HTm6H&u*N6CKaN?dR");
      // Undeclared exception!
      try { 
        fBProcedureCall0.getSQL(true);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // Array index out of range: 12
         //
         verifyException("java.util.Vector", e);
      }
  }

  /**
  //Test case number: 23
  /*Coverage entropy=0.4444444444444445
  */
  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      FBProcedureParam fBProcedureParam0 = fBProcedureCall0.addParam(1405, "(&FmHu.NZvv`Ka)N?dR");
      fBProcedureCall0.addOutputParam(fBProcedureParam0);
      assertEquals(1405, fBProcedureParam0.getPosition());
      
      String string0 = fBProcedureCall0.getSQL(false);
      assertEquals("EXECUTE PROCEDURE null((&FmHu.NZvv`Ka)N?dR)", string0);
  }

  /**
  //Test case number: 24
  /*Coverage entropy=1.1217186091313738
  */
  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      FBProcedureParam fBProcedureParam0 = new FBProcedureParam();
      fBProcedureCall0.addOutputParam(fBProcedureParam0);
      List<FBProcedureParam> list0 = fBProcedureCall0.getOutputParams();
      assertTrue(list0.contains(fBProcedureParam0));
  }

  /**
  //Test case number: 25
  /*Coverage entropy=1.1375916250043898
  */
  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      FBProcedureCall fBProcedureCall1 = new FBProcedureCall();
      fBProcedureCall1.setName("ht");
      fBProcedureCall1.hashCode();
  }

  /**
  //Test case number: 26
  /*Coverage entropy=0.4444444444444445
  */
  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      FBProcedureParam fBProcedureParam0 = new FBProcedureParam();
      fBProcedureCall0.addInputParam(fBProcedureParam0);
      FBProcedureParam fBProcedureParam1 = fBProcedureCall0.addParam(35, "HTm6H&u*N6CKaN?dR");
      assertEquals(35, fBProcedureParam1.getPosition());
      
      String string0 = fBProcedureCall0.getSQL(true);
      assertEquals("SELECT * FROM null(null, HTm6H&u*N6CKaN?dR)", string0);
  }

  /**
  //Test case number: 27
  /*Coverage entropy=0.42857142857142855
  */
  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      FBProcedureParam fBProcedureParam0 = fBProcedureCall0.addParam(0, "HTm6H&u*N6CKaN?dR");
      assertEquals(0, fBProcedureParam0.getPosition());
      
      String string0 = fBProcedureCall0.getSQL(true);
      assertEquals("SELECT * FROM null(HTm6H&u*N6CKaN?dR)", string0);
  }

  /**
  //Test case number: 28
  /*Coverage entropy=0.42857142857142855
  */
  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      FBProcedureParam fBProcedureParam0 = new FBProcedureParam();
      fBProcedureCall0.addOutputParam(fBProcedureParam0);
      Object object0 = fBProcedureCall0.clone();
      assertNotSame(object0, fBProcedureCall0);
      assertTrue(object0.equals((Object)fBProcedureCall0));
  }

  /**
  //Test case number: 29
  /*Coverage entropy=0.4444444444444445
  */
  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      fBProcedureCall0.addParam(1386, "(&FmHu.NZvvKa)N?dR");
      FBProcedureParam fBProcedureParam0 = fBProcedureCall0.getInputParam((-1));
      assertEquals(1386, fBProcedureParam0.getPosition());
  }

  /**
  //Test case number: 30
  /*Coverage entropy=0.42857142857142855
  */
  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      FBProcedureParam fBProcedureParam0 = new FBProcedureParam();
      fBProcedureCall0.addOutputParam(fBProcedureParam0);
      int int0 = fBProcedureCall0.mapOutParamIndexToPosition((-1131), true);
      assertEquals((-1131), int0);
  }

  /**
  //Test case number: 31
  /*Coverage entropy=0.4444444444444445
  */
  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      FBProcedureCall fBProcedureCall1 = new FBProcedureCall();
      assertTrue(fBProcedureCall1.equals((Object)fBProcedureCall0));
      
      FBProcedureParam fBProcedureParam0 = new FBProcedureParam();
      fBProcedureCall1.addInputParam(fBProcedureParam0);
      FBProcedureParam fBProcedureParam1 = new FBProcedureParam();
      boolean boolean0 = fBProcedureCall1.equals(fBProcedureCall0);
      assertFalse(fBProcedureCall1.equals((Object)fBProcedureCall0));
      assertFalse(boolean0);
  }

  /**
  //Test case number: 32
  /*Coverage entropy=1.1375916250043898
  */
  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      fBProcedureCall0.setName("it was not registered as output parameter.");
      FBProcedureCall fBProcedureCall1 = new FBProcedureCall();
      boolean boolean0 = fBProcedureCall1.equals(fBProcedureCall0);
      assertFalse(boolean0);
  }

  /**
  //Test case number: 33
  /*Coverage entropy=1.1476926351053998
  */
  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      FBProcedureCall fBProcedureCall1 = new FBProcedureCall();
      FBProcedureParam fBProcedureParam0 = new FBProcedureParam();
      fBProcedureCall1.setName("$Y*Xjw TwiDO]<");
      fBProcedureCall1.addInputParam(fBProcedureParam0);
      boolean boolean0 = fBProcedureCall1.equals(fBProcedureCall0);
      assertFalse(fBProcedureCall1.equals((Object)fBProcedureCall0));
      assertFalse(fBProcedureCall0.equals((Object)fBProcedureCall1));
      assertFalse(boolean0);
  }

  /**
  //Test case number: 34
  /*Coverage entropy=0.42857142857142855
  */
  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      FBProcedureCall fBProcedureCall1 = new FBProcedureCall();
      boolean boolean0 = fBProcedureCall0.equals(fBProcedureCall1);
      assertTrue(boolean0);
  }

  /**
  //Test case number: 35
  /*Coverage entropy=1.1476926351053998
  */
  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      FBProcedureParam fBProcedureParam0 = fBProcedureCall0.getInputParam(547);
      Object object0 = new Object();
      try { 
        fBProcedureParam0.setValue(object0);
        fail("Expecting exception: FBSQLException");
      
      } catch(FBSQLException e) {
         //
         // You cannot set value of an non-existing parameter.
         //
         verifyException("org.firebirdsql.jdbc.FBProcedureCall$NullParam", e);
      }
  }

  /**
  //Test case number: 36
  /*Coverage entropy=0.4
  */
  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      FBProcedureParam fBProcedureParam0 = new FBProcedureParam((-1), "=wC(DXj=s6XJe'n?");
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
  //Test case number: 37
  /*Coverage entropy=0.4
  */
  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      // Undeclared exception!
      try { 
        fBProcedureCall0.addParam((-1), "iQsA#ruk:@");
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -1
         //
         verifyException("java.util.Vector", e);
      }
  }

  /**
  //Test case number: 38
  /*Coverage entropy=0.45454545454545453
  */
  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      FBProcedureParam fBProcedureParam0 = new FBProcedureParam();
      fBProcedureCall0.addOutputParam(fBProcedureParam0);
      // Undeclared exception!
      try { 
        fBProcedureCall0.getInputParam((-44693113));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -44693114
         //
         verifyException("java.util.Vector", e);
      }
  }

  /**
  //Test case number: 39
  /*Coverage entropy=0.42857142857142855
  */
  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      FBProcedureParam fBProcedureParam0 = fBProcedureCall0.addParam(1, "Y5K\"*DHzcuQQV4o+/<;");
      assertEquals(1, fBProcedureParam0.getPosition());
      
      String string0 = fBProcedureCall0.getSQL(true);
      assertEquals("SELECT * FROM null(Y5K\"*DHzcuQQV4o+/<;)", string0);
  }

  /**
  //Test case number: 40
  /*Coverage entropy=0.42857142857142855
  */
  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      FBProcedureParam fBProcedureParam0 = new FBProcedureParam();
      fBProcedureCall0.addInputParam(fBProcedureParam0);
      String string0 = fBProcedureCall0.getSQL(false);
      assertEquals("EXECUTE PROCEDURE null(null)", string0);
  }

  /**
  //Test case number: 41
  /*Coverage entropy=0.4
  */
  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      fBProcedureCall0.hashCode();
  }

  /**
  //Test case number: 42
  /*Coverage entropy=0.4
  */
  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      int int0 = (-1);
      FBProcedureParam fBProcedureParam0 = new FBProcedureParam((-1), "0h");
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
  //Test case number: 43
  /*Coverage entropy=0.4
  */
  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      FBProcedureParam fBProcedureParam0 = new FBProcedureParam((-44559981), "1*n)");
      // Undeclared exception!
      try { 
        fBProcedureCall0.addOutputParam(fBProcedureParam0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -44559981
         //
         verifyException("java.util.Vector", e);
      }
  }

  /**
  //Test case number: 44
  /*Coverage entropy=0.4
  */
  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
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
  //Test case number: 45
  /*Coverage entropy=1.4572637190629707
  */
  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      fBProcedureCall0.getSQL(false);
      fBProcedureCall0.setName("purCOG#mq7B\"MD%");
      fBProcedureCall0.addParam(63, "purCOG#mq7B\"MD%");
      String string0 = fBProcedureCall0.getName();
      assertEquals("purCOG#mq7B\"MD%", string0);
  }

  /**
  //Test case number: 46
  /*Coverage entropy=1.1217186091313738
  */
  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      int int0 = fBProcedureCall0.mapOutParamIndexToPosition(0);
      assertEquals(0, int0);
  }

  /**
  //Test case number: 47
  /*Coverage entropy=1.15040557251542
  */
  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      try { 
        fBProcedureCall0.registerOutParam(1, 2);
        fail("Expecting exception: FBSQLException");
      
      } catch(FBSQLException e) {
         //
         // Cannot find parameter with the specified position.
         //
         verifyException("org.firebirdsql.jdbc.FBProcedureCall", e);
      }
  }

  /**
  //Test case number: 48
  /*Coverage entropy=0.4
  */
  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      FBProcedureParam fBProcedureParam0 = fBProcedureCall0.addParam(1, "HTm6H&u*N6CKaN?dR");
      assertEquals(1, fBProcedureParam0.getPosition());
  }

  /**
  //Test case number: 49
  /*Coverage entropy=0.4
  */
  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      FBProcedureParam fBProcedureParam0 = new FBProcedureParam((-2625), "?v");
      // Undeclared exception!
      try { 
        fBProcedureCall0.addInputParam(fBProcedureParam0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -2625
         //
         verifyException("java.util.Vector", e);
      }
  }

  /**
  //Test case number: 50
  /*Coverage entropy=1.0935773141956315
  */
  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      fBProcedureCall0.mapOutParamIndexToPosition((-2881));
      fBProcedureCall0.getSQL(false);
      String string0 = "in\\`";
      // Undeclared exception!
      try { 
        fBProcedureCall0.addParam((-3548), "in`");
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -3548
         //
         verifyException("java.util.Vector", e);
      }
  }

  /**
  //Test case number: 51
  /*Coverage entropy=0.45454545454545453
  */
  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      // Undeclared exception!
      try { 
        fBProcedureCall0.registerOutParam(0, 790);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -1
         //
         verifyException("java.util.Vector", e);
      }
  }

  /**
  //Test case number: 52
  /*Coverage entropy=0.4444444444444445
  */
  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
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
  //Test case number: 53
  /*Coverage entropy=1.1217186091313738
  */
  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      FBProcedureParam fBProcedureParam0 = new FBProcedureParam();
      fBProcedureCall0.addInputParam(fBProcedureParam0);
      List<FBProcedureParam> list0 = fBProcedureCall0.getInputParams();
      assertTrue(list0.contains(fBProcedureParam0));
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
        fBProcedureCall0.addParam((-71), "?v&OXG@oj_:m46j");
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -71
         //
         verifyException("java.util.Vector", e);
      }
  }

  /**
  //Test case number: 55
  /*Coverage entropy=1.0931471805599453
  */
  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      List<FBProcedureParam> list0 = fBProcedureCall0.getInputParams();
      assertEquals(0, list0.size());
  }

  /**
  //Test case number: 56
  /*Coverage entropy=1.0931471805599453
  */
  @Test(timeout = 4000)
  public void test56()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      String string0 = fBProcedureCall0.getName();
      assertNull(string0);
  }

  /**
  //Test case number: 57
  /*Coverage entropy=0.4
  */
  @Test(timeout = 4000)
  public void test57()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      Object object0 = new Object();
      boolean boolean0 = fBProcedureCall0.equals(object0);
      assertFalse(boolean0);
  }

  /**
  //Test case number: 58
  /*Coverage entropy=0.4
  */
  @Test(timeout = 4000)
  public void test58()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      boolean boolean0 = fBProcedureCall0.equals(fBProcedureCall0);
      assertTrue(boolean0);
  }

  /**
  //Test case number: 59
  /*Coverage entropy=1.1056985263168437
  */
  @Test(timeout = 4000)
  public void test59()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      String string0 = "in\\`";
      int int0 = 31;
      try { 
        fBProcedureCall0.registerOutParam(31, 31);
        fail("Expecting exception: FBSQLException");
      
      } catch(FBSQLException e) {
         //
         // Cannot find parameter with the specified position.
         //
         verifyException("org.firebirdsql.jdbc.FBProcedureCall", e);
      }
  }

  /**
  //Test case number: 60
  /*Coverage entropy=0.45454545454545453
  */
  @Test(timeout = 4000)
  public void test60()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      FBProcedureParam fBProcedureParam0 = fBProcedureCall0.addParam(5, "dj{");
      fBProcedureParam0.setIndex(5);
      fBProcedureCall0.registerOutParam(5, 5);
      assertNull(fBProcedureCall0.getName());
  }

  /**
  //Test case number: 61
  /*Coverage entropy=0.4
  */
  @Test(timeout = 4000)
  public void test61()  throws Throwable  {
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
  //Test case number: 62
  /*Coverage entropy=0.4
  */
  @Test(timeout = 4000)
  public void test62()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      int int0 = fBProcedureCall0.mapOutParamIndexToPosition(0, true);
      assertEquals(0, int0);
  }

  /**
  //Test case number: 63
  /*Coverage entropy=0.42857142857142855
  */
  @Test(timeout = 4000)
  public void test63()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      FBProcedureParam fBProcedureParam0 = fBProcedureCall0.addParam(1, ">d,mV7s$;w+");
      assertEquals(1, fBProcedureParam0.getPosition());
      
      Object object0 = fBProcedureCall0.clone();
      assertNotSame(object0, fBProcedureCall0);
      assertTrue(object0.equals((Object)fBProcedureCall0));
  }

  /**
  //Test case number: 64
  /*Coverage entropy=0.45454545454545453
  */
  @Test(timeout = 4000)
  public void test64()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      // Undeclared exception!
      try { 
        fBProcedureCall0.registerOutParam((-925), (-925));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -926
         //
         verifyException("java.util.Vector", e);
      }
  }

  /**
  //Test case number: 65
  /*Coverage entropy=1.0834763040946214
  */
  @Test(timeout = 4000)
  public void test65()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      fBProcedureCall0.mapOutParamIndexToPosition(37);
      // Undeclared exception!
      try { 
        fBProcedureCall0.addParam((-1215), "in`");
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -1215
         //
         verifyException("java.util.Vector", e);
      }
  }

  /**
  //Test case number: 66
  /*Coverage entropy=0.45454545454545453
  */
  @Test(timeout = 4000)
  public void test66()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      FBProcedureParam fBProcedureParam0 = fBProcedureCall0.addParam(1, "uddp3j9q0HnAvW?Vw");
      assertEquals(1, fBProcedureParam0.getPosition());
      
      FBProcedureParam fBProcedureParam1 = fBProcedureCall0.getInputParam(1);
      assertFalse(fBProcedureParam1.isParam());
  }

  /**
  //Test case number: 67
  /*Coverage entropy=0.4444444444444445
  */
  @Test(timeout = 4000)
  public void test67()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      FBProcedureParam fBProcedureParam0 = fBProcedureCall0.addParam(3, "01S00");
      fBProcedureParam0.setIndex(3);
      FBProcedureParam fBProcedureParam1 = fBProcedureCall0.getInputParam(3);
      assertEquals(3, fBProcedureParam1.getPosition());
  }

  /**
  //Test case number: 68
  /*Coverage entropy=0.42857142857142855
  */
  @Test(timeout = 4000)
  public void test68()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      FBProcedureParam fBProcedureParam0 = new FBProcedureParam();
      fBProcedureCall0.addInputParam(fBProcedureParam0);
      Object object0 = fBProcedureCall0.clone();
      assertNotSame(object0, fBProcedureCall0);
      assertTrue(object0.equals((Object)fBProcedureCall0));
  }

  /**
  //Test case number: 69
  /*Coverage entropy=0.4
  */
  @Test(timeout = 4000)
  public void test69()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      String string0 = fBProcedureCall0.getSQL(true);
      assertEquals("SELECT * FROM null", string0);
  }

  /**
  //Test case number: 70
  /*Coverage entropy=0.4444444444444445
  */
  @Test(timeout = 4000)
  public void test70()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      FBProcedureParam fBProcedureParam0 = fBProcedureCall0.getInputParam(5);
      assertEquals(0, fBProcedureParam0.getPosition());
  }

  /**
  //Test case number: 71
  /*Coverage entropy=1.0834763040946214
  */
  @Test(timeout = 4000)
  public void test71()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      fBProcedureCall0.getOutputParam((-1009));
      // Undeclared exception!
      try { 
        fBProcedureCall0.addParam((-3548), "in`");
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -3548
         //
         verifyException("java.util.Vector", e);
      }
  }

  /**
  //Test case number: 72
  /*Coverage entropy=0.4
  */
  @Test(timeout = 4000)
  public void test72()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      FBProcedureParam fBProcedureParam0 = fBProcedureCall0.addParam(0, "");
      assertEquals(0, fBProcedureParam0.getPosition());
  }

  /**
  //Test case number: 73
  /*Coverage entropy=0.4
  */
  @Test(timeout = 4000)
  public void test73()  throws Throwable  {
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
}
