/*
 * This file was automatically generated by EvoSuite
 * Thu Nov 14 14:53:22 GMT 2019
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
  /*Coverage entropy=2.315980063031728
  */
  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      FBProcedureParam fBProcedureParam0 = new FBProcedureParam();
      String string0 = "gJAcn^2g";
      fBProcedureCall0.getOutputParam(284);
      fBProcedureCall0.setName("gJAcn^2g");
      fBProcedureParam0.setIndex(41);
      fBProcedureParam0.setType((-106));
      fBProcedureCall0.addOutputParam(fBProcedureParam0);
      FBProcedureParam fBProcedureParam1 = fBProcedureCall0.getInputParam(41);
      fBProcedureParam0.setType((-106));
      fBProcedureCall0.mapOutParamIndexToPosition((-106));
      try { 
        fBProcedureParam1.setValue(fBProcedureCall0);
        fail("Expecting exception: FBSQLException");
      
      } catch(FBSQLException e) {
         //
         // Cannot set parameter, since it is constant.
         //
         verifyException("org.firebirdsql.jdbc.FBProcedureParam", e);
      }
  }

  /**
  //Test case number: 1
  /*Coverage entropy=2.2087423922541984
  */
  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      fBProcedureCall0.getOutputParam(4626);
      fBProcedureCall0.getInputParams();
      FBProcedureParam fBProcedureParam0 = fBProcedureCall0.addParam(4626, ">9t");
      fBProcedureCall0.getInputParam(3591);
      fBProcedureCall0.getSQL(false);
      int int0 = 890;
      fBProcedureParam0.clone();
      fBProcedureCall0.getInputParam(890);
      fBProcedureParam0.setType(3376);
      // Undeclared exception!
      fBProcedureCall0.registerOutParam(890, (-4553));
  }

  /**
  //Test case number: 2
  /*Coverage entropy=1.7813532733269368
  */
  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      FBProcedureParam fBProcedureParam0 = fBProcedureCall0.addParam(829, "}dahA?*");
      fBProcedureParam0.setValue("}dahA?*");
      fBProcedureParam0.setIndex(829);
      fBProcedureCall0.getOutputParam(829);
      fBProcedureCall0.addOutputParam(fBProcedureParam0);
      fBProcedureCall0.getInputParam(829);
      fBProcedureCall0.registerOutParam(829, 829);
      List<FBProcedureParam> list0 = fBProcedureCall0.getOutputParams();
      assertEquals(830, list0.size());
  }

  /**
  //Test case number: 3
  /*Coverage entropy=0.9004024235381879
  */
  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      FBProcedureParam fBProcedureParam0 = fBProcedureCall0.addParam(166, "intbJurAtbN.P");
      assertEquals("intbJurAtbN.P", fBProcedureParam0.getParamValue());
      assertEquals(166, fBProcedureParam0.getPosition());
  }

  /**
  //Test case number: 4
  /*Coverage entropy=2.004179035612501
  */
  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      String string0 = fBProcedureCall0.getSQL(true);
      assertEquals("SELECT * FROM null", string0);
      
      FBProcedureParam fBProcedureParam0 = fBProcedureCall0.addParam(829, "}dahA?*");
      fBProcedureParam0.setIndex(829);
      fBProcedureParam0.setValue("}dahA?*");
      fBProcedureCall0.getOutputParam(829);
      fBProcedureCall0.addOutputParam(fBProcedureParam0);
      FBProcedureParam fBProcedureParam1 = fBProcedureCall0.getOutputParam(829);
      assertEquals(829, fBProcedureParam1.getPosition());
  }

  /**
  //Test case number: 5
  /*Coverage entropy=1.3009112841717418
  */
  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      FBProcedureParam fBProcedureParam0 = fBProcedureCall0.addParam(69, "dh?*");
      fBProcedureCall0.addOutputParam(fBProcedureParam0);
      fBProcedureCall0.addParam(48, "dh?*");
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
  //Test case number: 6
  /*Coverage entropy=2.040769668403852
  */
  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      fBProcedureCall0.addParam(31, "io1(s");
      fBProcedureCall0.registerOutParam((-1), 31);
      FBProcedureParam fBProcedureParam0 = fBProcedureCall0.getOutputParam((-1));
      assertEquals(31, fBProcedureParam0.getType());
      assertEquals(31, fBProcedureParam0.getPosition());
  }

  /**
  //Test case number: 7
  /*Coverage entropy=1.5653948371180277
  */
  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      fBProcedureCall0.hashCode();
      fBProcedureCall0.addParam(27707229, " not set and ");
      // Undeclared exception!
      fBProcedureCall0.getSQL(true);
  }

  /**
  //Test case number: 8
  /*Coverage entropy=1.7490906203903507
  */
  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      int int0 = (-520);
      fBProcedureCall0.hashCode();
      fBProcedureCall0.addParam(27707229, " not set and ");
      // Undeclared exception!
      fBProcedureCall0.getInputParam((-520));
  }

  /**
  //Test case number: 9
  /*Coverage entropy=1.533344419789668
  */
  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      fBProcedureCall0.hashCode();
      fBProcedureCall0.addParam(27707229, " not set and ");
      // Undeclared exception!
      fBProcedureCall0.clone();
  }

  /**
  //Test case number: 10
  /*Coverage entropy=1.6274261532274057
  */
  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      FBProcedureCall fBProcedureCall1 = new FBProcedureCall();
      fBProcedureCall1.setName("PDNHVmK@,vj#3b.1d|");
      fBProcedureCall0.getInputParam(1372);
      fBProcedureCall0.equals(fBProcedureCall1);
      assertFalse(fBProcedureCall0.equals((Object)fBProcedureCall1));
      
      fBProcedureCall1.getOutputParam(0);
      assertFalse(fBProcedureCall1.equals((Object)fBProcedureCall0));
  }

  /**
  //Test case number: 11
  /*Coverage entropy=2.3165312718320688
  */
  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      fBProcedureCall0.addParam(0, "in");
      fBProcedureCall0.getName();
      fBProcedureCall0.getOutputParams();
      fBProcedureCall0.getName();
      fBProcedureCall0.registerOutParam((-1), 0);
      FBProcedureParam fBProcedureParam0 = fBProcedureCall0.getOutputParam((-1));
      assertEquals(0, fBProcedureParam0.getType());
      assertEquals(0, fBProcedureParam0.getPosition());
  }

  /**
  //Test case number: 12
  /*Coverage entropy=0.4444444444444445
  */
  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      FBProcedureParam fBProcedureParam0 = fBProcedureCall0.addParam(837, "}dahA?*");
      fBProcedureParam0.setIndex(837);
      fBProcedureParam0.clone();
      fBProcedureCall0.addOutputParam(fBProcedureParam0);
      assertEquals(837, fBProcedureParam0.getPosition());
      
      int int0 = fBProcedureCall0.mapOutParamIndexToPosition(837, true);
      assertEquals(1, int0);
  }

  /**
  //Test case number: 13
  /*Coverage entropy=1.9864148961440993
  */
  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      FBProcedureParam fBProcedureParam0 = fBProcedureCall0.addParam(803, "}dahA?*");
      fBProcedureCall0.addOutputParam(fBProcedureParam0);
      int int0 = fBProcedureCall0.mapOutParamIndexToPosition((-268));
      assertEquals((-268), int0);
      
      String string0 = fBProcedureCall0.getSQL(true);
      assertEquals("SELECT * FROM null(}dahA?*)", string0);
      
      List<FBProcedureParam> list0 = fBProcedureCall0.getInputParams();
      assertEquals(804, list0.size());
  }

  /**
  //Test case number: 14
  /*Coverage entropy=1.8170007687300846
  */
  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      FBProcedureParam fBProcedureParam0 = fBProcedureCall0.getInputParam(36);
      fBProcedureCall0.addOutputParam(fBProcedureParam0);
      fBProcedureCall0.addParam(36, "}dah?*");
      // Undeclared exception!
      try { 
        fBProcedureCall0.getSQL(true);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // Array index out of range: 36
         //
         verifyException("java.util.Vector", e);
      }
  }

  /**
  //Test case number: 15
  /*Coverage entropy=2.0518080626449926
  */
  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      FBProcedureParam fBProcedureParam0 = new FBProcedureParam(40, "ios");
      fBProcedureCall0.addOutputParam(fBProcedureParam0);
      fBProcedureCall0.addParam(31, "ios");
      fBProcedureCall0.registerOutParam((-1), 31);
      assertNull(fBProcedureCall0.getName());
  }

  /**
  //Test case number: 16
  /*Coverage entropy=1.6868977693384444
  */
  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      fBProcedureCall0.setName("");
      fBProcedureCall0.getName();
      String string0 = fBProcedureCall0.getSQL(false);
      assertEquals("EXECUTE PROCEDURE ", string0);
  }

  /**
  //Test case number: 17
  /*Coverage entropy=1.7630278264577233
  */
  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      FBProcedureParam fBProcedureParam0 = fBProcedureCall0.addParam(829, "}dahA?*");
      fBProcedureParam0.setIndex(829);
      fBProcedureCall0.getOutputParam(829);
      fBProcedureCall0.addOutputParam(fBProcedureParam0);
      FBProcedureParam fBProcedureParam1 = fBProcedureCall0.getOutputParam(829);
      assertEquals(829, fBProcedureParam1.getPosition());
  }

  /**
  //Test case number: 18
  /*Coverage entropy=2.040769668403852
  */
  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      fBProcedureCall0.addParam(18, "Nxr(k+}|J+RQP}H!16>");
      fBProcedureCall0.registerOutParam((-1), (-1));
      FBProcedureParam fBProcedureParam0 = fBProcedureCall0.getOutputParam((-1));
      assertEquals(18, fBProcedureParam0.getPosition());
      assertEquals((-1), fBProcedureParam0.getType());
  }

  /**
  //Test case number: 19
  /*Coverage entropy=1.3291016900199226
  */
  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      FBProcedureParam fBProcedureParam0 = fBProcedureCall0.addParam(16, "j&a");
      fBProcedureCall0.addOutputParam(fBProcedureParam0);
      fBProcedureCall0.registerOutParam((-1), (-1));
      assertNull(fBProcedureCall0.getName());
  }

  /**
  //Test case number: 20
  /*Coverage entropy=1.5271837172395382
  */
  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      fBProcedureCall0.setName("}dah?*");
      String string0 = fBProcedureCall0.getName();
      assertEquals("}dah?*", string0);
  }

  /**
  //Test case number: 21
  /*Coverage entropy=1.394714983677679
  */
  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      fBProcedureCall0.setName(" ");
      FBProcedureCall fBProcedureCall1 = new FBProcedureCall();
      fBProcedureCall0.equals(fBProcedureCall1);
      Object object0 = new Object();
  }

  /**
  //Test case number: 22
  /*Coverage entropy=1.0365141682948127
  */
  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      FBProcedureParam fBProcedureParam0 = new FBProcedureParam((-12481345), "Exception. ");
      // Undeclared exception!
      try { 
        fBProcedureCall0.addInputParam(fBProcedureParam0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -12481345
         //
         verifyException("java.util.Vector", e);
      }
  }

  /**
  //Test case number: 23
  /*Coverage entropy=1.1476926351053998
  */
  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      fBProcedureCall0.addParam(829, "}dahA?*");
      fBProcedureCall0.registerOutParam((-1), 829);
      assertTrue(FBProcedureCall.OLD_CALLABLE_STATEMENT_COMPATIBILITY);
  }

  /**
  //Test case number: 24
  /*Coverage entropy=1.3267767682755784
  */
  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      FBProcedureParam fBProcedureParam0 = fBProcedureCall0.addParam(5, "}dahA?*");
      assertEquals(5, fBProcedureParam0.getPosition());
      
      String string0 = fBProcedureCall0.getSQL(true);
      assertEquals("SELECT * FROM null(}dahA?*)", string0);
  }

  /**
  //Test case number: 25
  /*Coverage entropy=1.3120076729259056
  */
  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      FBProcedureCall fBProcedureCall1 = new FBProcedureCall();
      assertTrue(fBProcedureCall1.equals((Object)fBProcedureCall0));
      
      FBProcedureParam fBProcedureParam0 = new FBProcedureParam();
      fBProcedureCall1.addOutputParam(fBProcedureParam0);
      boolean boolean0 = fBProcedureCall1.equals(fBProcedureCall0);
      assertFalse(boolean0);
  }

  /**
  //Test case number: 26
  /*Coverage entropy=1.676428115487582
  */
  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      FBProcedureCall fBProcedureCall1 = new FBProcedureCall();
      assertTrue(fBProcedureCall1.equals((Object)fBProcedureCall0));
      
      fBProcedureCall0.getInputParam(1372);
      boolean boolean0 = fBProcedureCall0.equals(fBProcedureCall1);
      assertFalse(fBProcedureCall1.equals((Object)fBProcedureCall0));
      assertFalse(boolean0);
  }

  /**
  //Test case number: 27
  /*Coverage entropy=1.8121040004412543
  */
  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      FBProcedureParam fBProcedureParam0 = fBProcedureCall0.addParam(803, "}dahA?*");
      fBProcedureParam0.setValue("}dahA?*");
      fBProcedureCall0.addOutputParam(fBProcedureParam0);
      assertEquals(803, fBProcedureParam0.getPosition());
      
      Object object0 = fBProcedureCall0.clone();
      String string0 = fBProcedureCall0.getSQL(true);
      assertTrue(fBProcedureCall0.equals((Object)object0));
      assertEquals("SELECT * FROM null(}dahA?*)", string0);
  }

  /**
  //Test case number: 28
  /*Coverage entropy=0.4615384615384615
  */
  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      FBProcedureParam fBProcedureParam0 = fBProcedureCall0.getInputParam(560);
      fBProcedureCall0.addInputParam(fBProcedureParam0);
      String string0 = fBProcedureCall0.getSQL(true);
      assertEquals("SELECT * FROM null(null, null)", string0);
  }

  /**
  //Test case number: 29
  /*Coverage entropy=1.6969987794394545
  */
  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      fBProcedureCall0.getInputParam(1);
      List<FBProcedureParam> list0 = fBProcedureCall0.getInputParams();
      assertEquals(1, list0.size());
  }

  /**
  //Test case number: 30
  /*Coverage entropy=1.9619250462843434
  */
  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      FBProcedureParam fBProcedureParam0 = fBProcedureCall0.addParam(829, "}dahA?*");
      fBProcedureParam0.setIndex(829);
      fBProcedureParam0.setType(829);
      fBProcedureCall0.getOutputParam(829);
      fBProcedureCall0.addOutputParam(fBProcedureParam0);
      fBProcedureCall0.addParam(829, "}dahA?*");
      FBProcedureParam fBProcedureParam1 = fBProcedureCall0.getInputParam(829);
      assertEquals(829, fBProcedureParam1.getPosition());
      assertEquals(829, fBProcedureParam1.getIndex());
  }

  /**
  //Test case number: 31
  /*Coverage entropy=1.0365141682948127
  */
  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      FBProcedureParam fBProcedureParam0 = new FBProcedureParam((-60173534), "}d");
      // Undeclared exception!
      try { 
        fBProcedureCall0.addOutputParam(fBProcedureParam0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -60173534
         //
         verifyException("java.util.Vector", e);
      }
  }

  /**
  //Test case number: 32
  /*Coverage entropy=1.4118090007716961
  */
  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      FBProcedureParam fBProcedureParam0 = fBProcedureCall0.getInputParam(1);
      fBProcedureCall0.addOutputParam(fBProcedureParam0);
      fBProcedureCall0.addOutputParam(fBProcedureParam0);
      assertEquals((-1), fBProcedureParam0.getIndex());
  }

  /**
  //Test case number: 33
  /*Coverage entropy=1.0650855968662414
  */
  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      Object object0 = fBProcedureCall0.clone();
      boolean boolean0 = fBProcedureCall0.equals(object0);
      assertTrue(boolean0);
      assertNotSame(object0, fBProcedureCall0);
  }

  /**
  //Test case number: 34
  /*Coverage entropy=2.063983366979555
  */
  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      FBProcedureParam fBProcedureParam0 = fBProcedureCall0.getOutputParam((-686));
      fBProcedureCall0.addOutputParam(fBProcedureParam0);
      List<FBProcedureParam> list0 = fBProcedureCall0.getOutputParams();
      assertFalse(list0.isEmpty());
  }

  /**
  //Test case number: 35
  /*Coverage entropy=1.6492377541392287
  */
  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      fBProcedureCall0.addParam(18, "Nxr(X+|J+RQPlH!16>");
      FBProcedureParam fBProcedureParam0 = fBProcedureCall0.getInputParam((-1));
      assertEquals(18, fBProcedureParam0.getPosition());
  }

  /**
  //Test case number: 36
  /*Coverage entropy=1.9777528427402777
  */
  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      FBProcedureParam fBProcedureParam0 = fBProcedureCall0.addParam(829, "}dahA?*");
      fBProcedureParam0.setIndex(829);
      fBProcedureCall0.getOutputParam(829);
      fBProcedureCall0.addOutputParam(fBProcedureParam0);
      FBProcedureParam fBProcedureParam1 = fBProcedureCall0.getInputParam(829);
      assertEquals(829, fBProcedureParam1.getPosition());
  }

  /**
  //Test case number: 37
  /*Coverage entropy=1.885150328612323
  */
  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      FBProcedureParam fBProcedureParam0 = new FBProcedureParam();
      fBProcedureParam0.setIndex(829);
      fBProcedureParam0.setIndex(829);
      fBProcedureCall0.getOutputParam(829);
      fBProcedureCall0.addOutputParam(fBProcedureParam0);
      FBProcedureParam fBProcedureParam1 = fBProcedureCall0.getInputParam(829);
      assertEquals(829, fBProcedureParam1.getIndex());
  }

  /**
  //Test case number: 38
  /*Coverage entropy=1.6492377541392287
  */
  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      fBProcedureCall0.addParam(5, "}dah?*");
      FBProcedureParam fBProcedureParam0 = fBProcedureCall0.getInputParam((-1));
      assertEquals(5, fBProcedureParam0.getPosition());
  }

  /**
  //Test case number: 39
  /*Coverage entropy=1.4001443355569787
  */
  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      FBProcedureParam fBProcedureParam0 = new FBProcedureParam();
      fBProcedureCall0.addInputParam(fBProcedureParam0);
      fBProcedureCall0.addInputParam(fBProcedureParam0);
      Object object0 = fBProcedureCall0.clone();
      assertTrue(object0.equals((Object)fBProcedureCall0));
      assertNotSame(object0, fBProcedureCall0);
  }

  /**
  //Test case number: 40
  /*Coverage entropy=1.560150750206571
  */
  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      FBProcedureParam fBProcedureParam0 = fBProcedureCall0.addParam(153, "ejUr`9akh!q6Q(");
      fBProcedureCall0.addOutputParam(fBProcedureParam0);
      fBProcedureCall0.setName("ejUr`9akh!q6Q(");
      fBProcedureCall0.hashCode();
      // Undeclared exception!
      try { 
        fBProcedureCall0.addParam((-1920641285), " not set and ");
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -1920641285
         //
         verifyException("java.util.Vector", e);
      }
  }

  /**
  //Test case number: 41
  /*Coverage entropy=1.9084043805507114
  */
  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      fBProcedureCall0.getInputParam(626);
      try { 
        fBProcedureCall0.registerOutParam(626, 626);
        fail("Expecting exception: FBSQLException");
      
      } catch(FBSQLException e) {
         //
         // Cannot find parameter with the specified position.
         //
         verifyException("org.firebirdsql.jdbc.FBProcedureCall", e);
      }
  }

  /**
  //Test case number: 42
  /*Coverage entropy=0.810116318288409
  */
  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      // Undeclared exception!
      try { 
        fBProcedureCall0.addParam((-1), "i(3");
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
  /*Coverage entropy=0.9004024235381879
  */
  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      FBProcedureParam fBProcedureParam0 = fBProcedureCall0.addParam(1695, "en");
      assertEquals(1695, fBProcedureParam0.getPosition());
  }

  /**
  //Test case number: 44
  /*Coverage entropy=0.810116318288409
  */
  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      FBProcedureParam fBProcedureParam0 = fBProcedureCall0.addParam(0, "HY002");
      assertEquals(0, fBProcedureParam0.getPosition());
  }

  /**
  //Test case number: 45
  /*Coverage entropy=1.1476926351053998
  */
  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      FBProcedureParam fBProcedureParam0 = new FBProcedureParam();
      fBProcedureCall0.addOutputParam(fBProcedureParam0);
      // Undeclared exception!
      try { 
        fBProcedureCall0.getInputParam((-1));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -2
         //
         verifyException("java.util.Vector", e);
      }
  }

  /**
  //Test case number: 46
  /*Coverage entropy=1.1546856420984069
  */
  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      FBProcedureParam fBProcedureParam0 = new FBProcedureParam();
      fBProcedureCall0.addOutputParam(fBProcedureParam0);
      fBProcedureCall0.mapOutParamIndexToPosition((-32688997), true);
      // Undeclared exception!
      try { 
        fBProcedureCall0.getInputParam((-2488));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -2489
         //
         verifyException("java.util.Vector", e);
      }
  }

  /**
  //Test case number: 47
  /*Coverage entropy=1.3914337620844703
  */
  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      fBProcedureCall0.getInputParam(2);
      Object object0 = fBProcedureCall0.clone();
      assertNotSame(object0, fBProcedureCall0);
      assertTrue(object0.equals((Object)fBProcedureCall0));
  }

  /**
  //Test case number: 48
  /*Coverage entropy=0.4444444444444445
  */
  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      FBProcedureParam fBProcedureParam0 = fBProcedureCall0.addParam(837, "}dahA?*");
      fBProcedureParam0.clone();
      fBProcedureCall0.addOutputParam(fBProcedureParam0);
      assertEquals(837, fBProcedureParam0.getPosition());
      
      int int0 = fBProcedureCall0.mapOutParamIndexToPosition(837, true);
      assertEquals(837, int0);
  }

  /**
  //Test case number: 49
  /*Coverage entropy=0.42857142857142855
  */
  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      FBProcedureParam fBProcedureParam0 = new FBProcedureParam();
      fBProcedureCall0.addOutputParam(fBProcedureParam0);
      Object object0 = fBProcedureCall0.clone();
      assertNotSame(object0, fBProcedureCall0);
      assertTrue(object0.equals((Object)fBProcedureCall0));
  }

  /**
  //Test case number: 50
  /*Coverage entropy=0.45454545454545453
  */
  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      fBProcedureCall0.getInputParam(1);
      Object object0 = fBProcedureCall0.clone();
      assertTrue(object0.equals((Object)fBProcedureCall0));
      assertNotSame(object0, fBProcedureCall0);
  }

  /**
  //Test case number: 51
  /*Coverage entropy=0.4
  */
  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
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
  //Test case number: 52
  /*Coverage entropy=1.885150328612323
  */
  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      try { 
        fBProcedureCall0.registerOutParam(1384, 836);
        fail("Expecting exception: FBSQLException");
      
      } catch(FBSQLException e) {
         //
         // Cannot find parameter with the specified position.
         //
         verifyException("org.firebirdsql.jdbc.FBProcedureCall", e);
      }
  }

  /**
  //Test case number: 53
  /*Coverage entropy=1.6082873972465446
  */
  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      // Undeclared exception!
      try { 
        fBProcedureCall0.registerOutParam((-519), (-1));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -520
         //
         verifyException("java.util.Vector", e);
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
  //Test case number: 55
  /*Coverage entropy=0.4666666666666667
  */
  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      fBProcedureCall0.getInputParam(829);
      FBProcedureParam fBProcedureParam0 = fBProcedureCall0.getInputParam(829);
      assertEquals(0, fBProcedureParam0.getType());
  }

  /**
  //Test case number: 56
  /*Coverage entropy=1.4834915965575728
  */
  @Test(timeout = 4000)
  public void test56()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      Object object0 = fBProcedureCall0.clone();
      int int0 = fBProcedureCall0.mapOutParamIndexToPosition(605, true);
      assertEquals(605, int0);
      assertNotSame(fBProcedureCall0, object0);
  }

  /**
  //Test case number: 57
  /*Coverage entropy=1.4456843511585487
  */
  @Test(timeout = 4000)
  public void test57()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      fBProcedureCall0.getInputParam(803);
      String string0 = fBProcedureCall0.getSQL(false);
      assertEquals("EXECUTE PROCEDURE null(null)", string0);
  }

  /**
  //Test case number: 58
  /*Coverage entropy=0.45454545454545453
  */
  @Test(timeout = 4000)
  public void test58()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      fBProcedureCall0.getInputParam(803);
      String string0 = fBProcedureCall0.getSQL(true);
      assertEquals("SELECT * FROM null(null)", string0);
  }

  /**
  //Test case number: 59
  /*Coverage entropy=1.7741057932992024
  */
  @Test(timeout = 4000)
  public void test59()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      int int0 = fBProcedureCall0.mapOutParamIndexToPosition(0);
      assertEquals(0, int0);
      
      Object object0 = fBProcedureCall0.clone();
      assertNotSame(object0, fBProcedureCall0);
  }

  /**
  //Test case number: 60
  /*Coverage entropy=1.4682921994113465
  */
  @Test(timeout = 4000)
  public void test60()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      int int0 = fBProcedureCall0.mapOutParamIndexToPosition(1);
      assertEquals(1, int0);
  }

  /**
  //Test case number: 61
  /*Coverage entropy=1.1476926351053998
  */
  @Test(timeout = 4000)
  public void test61()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      int int0 = 2478;
      FBProcedureParam fBProcedureParam0 = fBProcedureCall0.getInputParam(2478);
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
  //Test case number: 62
  /*Coverage entropy=0.4
  */
  @Test(timeout = 4000)
  public void test62()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      try { 
        fBProcedureCall0.mapOutParamIndexToPosition(41, false);
        fail("Expecting exception: FBSQLException");
      
      } catch(FBSQLException e) {
         //
         // Specified parameter does not exist.
         //
         verifyException("org.firebirdsql.jdbc.FBProcedureCall", e);
      }
  }

  /**
  //Test case number: 63
  /*Coverage entropy=1.1217186091313738
  */
  @Test(timeout = 4000)
  public void test63()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      fBProcedureCall0.getName();
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
  //Test case number: 64
  /*Coverage entropy=0.4
  */
  @Test(timeout = 4000)
  public void test64()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      FBProcedureParam fBProcedureParam0 = fBProcedureCall0.addParam(2030, "");
      assertEquals(2030, fBProcedureParam0.getPosition());
  }

  /**
  //Test case number: 65
  /*Coverage entropy=1.6082873972465446
  */
  @Test(timeout = 4000)
  public void test65()  throws Throwable  {
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
  //Test case number: 66
  /*Coverage entropy=1.6082873972465446
  */
  @Test(timeout = 4000)
  public void test66()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      // Undeclared exception!
      try { 
        fBProcedureCall0.registerOutParam((-1), (-1));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -2
         //
         verifyException("java.util.Vector", e);
      }
  }

  /**
  //Test case number: 67
  /*Coverage entropy=1.4834915965575728
  */
  @Test(timeout = 4000)
  public void test67()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      int int0 = fBProcedureCall0.mapOutParamIndexToPosition(0, true);
      assertEquals(0, int0);
      
      Object object0 = fBProcedureCall0.clone();
      assertNotSame(object0, fBProcedureCall0);
  }

  /**
  //Test case number: 68
  /*Coverage entropy=0.4
  */
  @Test(timeout = 4000)
  public void test68()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      Object object0 = new Object();
      boolean boolean0 = fBProcedureCall0.equals(object0);
      assertFalse(boolean0);
  }

  /**
  //Test case number: 69
  /*Coverage entropy=0.4
  */
  @Test(timeout = 4000)
  public void test69()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      boolean boolean0 = fBProcedureCall0.equals(fBProcedureCall0);
      assertTrue(boolean0);
  }
}
