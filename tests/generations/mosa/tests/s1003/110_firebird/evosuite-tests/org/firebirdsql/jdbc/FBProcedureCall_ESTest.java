/*
 * This file was automatically generated by EvoSuite
 * Wed Nov 13 21:28:28 GMT 2019
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
  /*Coverage entropy=1.6988966477959342
  */
  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      fBProcedureCall0.getInputParam(3637);
      fBProcedureCall0.getSQL(true);
      fBProcedureCall0.addParam(2150, "':&104Q?a_T^o/K");
      fBProcedureCall0.getSQL(true);
      // Undeclared exception!
      fBProcedureCall0.getSQL(true);
  }

  /**
  //Test case number: 1
  /*Coverage entropy=0.9004024235381879
  */
  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      FBProcedureParam fBProcedureParam0 = fBProcedureCall0.addParam(547, "IN&vNd`&aX'*7");
      assertEquals(547, fBProcedureParam0.getPosition());
      assertEquals("IN&vNd`&aX'*7", fBProcedureParam0.getParamValue());
  }

  /**
  //Test case number: 2
  /*Coverage entropy=1.6384160211115684
  */
  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      FBProcedureParam fBProcedureParam0 = fBProcedureCall0.getInputParam(5078);
      fBProcedureCall0.addOutputParam(fBProcedureParam0);
      int int0 = 133;
      fBProcedureCall0.getInputParam(133);
      // Undeclared exception!
      fBProcedureCall0.getInputParam(133);
  }

  /**
  //Test case number: 3
  /*Coverage entropy=1.7214787039105834
  */
  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      FBProcedureParam fBProcedureParam0 = new FBProcedureParam();
      fBProcedureParam0.setType((-135));
      fBProcedureParam0.setIndex(19);
      fBProcedureCall0.addInputParam(fBProcedureParam0);
      FBProcedureParam fBProcedureParam1 = fBProcedureCall0.getInputParam(19);
      assertSame(fBProcedureParam1, fBProcedureParam0);
  }

  /**
  //Test case number: 4
  /*Coverage entropy=2.1221383700941407
  */
  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      FBProcedureParam fBProcedureParam0 = fBProcedureCall0.addParam(666, "HwxQ?]");
      fBProcedureCall0.addOutputParam(fBProcedureParam0);
      FBProcedureParam fBProcedureParam1 = new FBProcedureParam();
      fBProcedureParam1.setIndex(38);
      fBProcedureCall0.addOutputParam(fBProcedureParam1);
      fBProcedureCall0.registerOutParam(38, 38);
      assertNull(fBProcedureCall0.getName());
  }

  /**
  //Test case number: 5
  /*Coverage entropy=0.4444444444444445
  */
  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      FBProcedureParam fBProcedureParam0 = new FBProcedureParam(3146, "<I^Xh7[K<O;c(m{5?");
      fBProcedureCall0.addOutputParam(fBProcedureParam0);
      fBProcedureCall0.addParam(1900, "<I^Xh7[K<O;c(m{5?");
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
  /*Coverage entropy=2.068211289315701
  */
  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      fBProcedureCall0.addParam(2811, " +EZVuC*k2/sTx");
      fBProcedureCall0.registerOutParam((-1), 2811);
      // Undeclared exception!
      fBProcedureCall0.registerOutParam(694, (-1));
  }

  /**
  //Test case number: 7
  /*Coverage entropy=1.6492377541392287
  */
  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      fBProcedureCall0.addParam(2260, "?&Yn#ygqB");
      FBProcedureParam fBProcedureParam0 = fBProcedureCall0.getInputParam((-1));
      assertEquals(2260, fBProcedureParam0.getPosition());
  }

  /**
  //Test case number: 8
  /*Coverage entropy=1.9366147725931564
  */
  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      FBProcedureParam fBProcedureParam0 = fBProcedureCall0.addParam(12, "Xj~\"i?SCprYWd{SL',");
      fBProcedureCall0.addOutputParam(fBProcedureParam0);
      fBProcedureCall0.addInputParam(fBProcedureParam0);
      FBProcedureParam fBProcedureParam1 = fBProcedureCall0.getOutputParam((-1));
      assertEquals(12, fBProcedureParam1.getPosition());
  }

  /**
  //Test case number: 9
  /*Coverage entropy=2.0666380875935344
  */
  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      fBProcedureCall0.addParam(31, "o8");
      fBProcedureCall0.registerOutParam((-1), (-1));
      FBProcedureParam fBProcedureParam0 = fBProcedureCall0.getOutputParam((-1));
      assertEquals(31, fBProcedureParam0.getPosition());
      assertEquals((-1), fBProcedureParam0.getType());
  }

  /**
  //Test case number: 10
  /*Coverage entropy=2.2962712619630388
  */
  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      FBProcedureParam fBProcedureParam0 = fBProcedureCall0.addParam(12, "Xj~\"i?SCprYWd{SL',");
      fBProcedureCall0.addOutputParam(fBProcedureParam0);
      fBProcedureParam0.setValue(fBProcedureCall0);
      fBProcedureCall0.addInputParam(fBProcedureParam0);
      fBProcedureCall0.getOutputParam((-1));
      try { 
        fBProcedureCall0.registerOutParam(6, 12);
        fail("Expecting exception: FBSQLException");
      
      } catch(FBSQLException e) {
         //
         // Cannot find parameter with the specified position.
         //
         verifyException("org.firebirdsql.jdbc.FBProcedureCall", e);
      }
  }

  /**
  //Test case number: 11
  /*Coverage entropy=1.563413311326071
  */
  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      FBProcedureParam fBProcedureParam0 = fBProcedureCall0.addParam(0, "Xj~\"i?SCprYWd{SL',");
      fBProcedureParam0.setValue("og");
      fBProcedureCall0.addOutputParam(fBProcedureParam0);
      assertEquals(0, fBProcedureParam0.getPosition());
      
      String string0 = fBProcedureCall0.getSQL(false);
      assertEquals("EXECUTE PROCEDURE null(Xj~\"i?SCprYWd{SL',)", string0);
  }

  /**
  //Test case number: 12
  /*Coverage entropy=0.8716547798268706
  */
  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      FBProcedureParam fBProcedureParam0 = fBProcedureCall0.addParam(0, "Xj~\"i?SCprYWd{SL',");
      fBProcedureCall0.addOutputParam(fBProcedureParam0);
      fBProcedureParam0.setType((-1));
      fBProcedureCall0.addInputParam(fBProcedureParam0);
      assertEquals(0, fBProcedureParam0.getPosition());
      
      int int0 = fBProcedureCall0.mapOutParamIndexToPosition((-1), false);
      assertEquals(1, int0);
      
      Object object0 = fBProcedureCall0.clone();
      assertNotSame(object0, fBProcedureCall0);
      assertTrue(object0.equals((Object)fBProcedureCall0));
  }

  /**
  //Test case number: 13
  /*Coverage entropy=1.527699454962953
  */
  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      FBProcedureParam fBProcedureParam0 = new FBProcedureParam();
      fBProcedureCall0.addOutputParam(fBProcedureParam0);
      fBProcedureCall0.addParam(1349, "'o104Q?CT^QoB/9");
      // Undeclared exception!
      try { 
        fBProcedureCall0.getSQL(true);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // Array index out of range: 1349
         //
         verifyException("java.util.Vector", e);
      }
  }

  /**
  //Test case number: 14
  /*Coverage entropy=0.8716547798268706
  */
  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      FBProcedureParam fBProcedureParam0 = fBProcedureCall0.addParam(0, "Xj~\"i?SCprYWd{SL',");
      fBProcedureCall0.addOutputParam(fBProcedureParam0);
      fBProcedureParam0.setType((-1527));
      fBProcedureCall0.addInputParam(fBProcedureParam0);
      assertEquals(0, fBProcedureParam0.getPosition());
      
      int int0 = fBProcedureCall0.mapOutParamIndexToPosition(0, true);
      assertEquals(0, int0);
      
      Object object0 = fBProcedureCall0.clone();
      assertNotSame(object0, fBProcedureCall0);
      assertTrue(object0.equals((Object)fBProcedureCall0));
  }

  /**
  //Test case number: 15
  /*Coverage entropy=1.1546856420984069
  */
  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      FBProcedureParam fBProcedureParam0 = fBProcedureCall0.addParam(2260, "?&Yn#ygqB");
      assertEquals(2260, fBProcedureParam0.getPosition());
      
      fBProcedureCall0.registerOutParam((-1), 2260);
      int int0 = fBProcedureCall0.mapOutParamIndexToPosition((-2467), true);
      assertEquals((-2467), int0);
  }

  /**
  //Test case number: 16
  /*Coverage entropy=1.527699454962953
  */
  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      FBProcedureParam fBProcedureParam0 = fBProcedureCall0.addParam(0, "Xj~\"i?SCprYWd{SL',");
      fBProcedureCall0.addOutputParam(fBProcedureParam0);
      assertEquals(0, fBProcedureParam0.getPosition());
      
      String string0 = fBProcedureCall0.getSQL(false);
      assertEquals("EXECUTE PROCEDURE null(Xj~\"i?SCprYWd{SL',)", string0);
  }

  /**
  //Test case number: 17
  /*Coverage entropy=1.8623280048124515
  */
  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      FBProcedureParam fBProcedureParam0 = new FBProcedureParam();
      fBProcedureParam0.setIndex(24);
      fBProcedureCall0.addOutputParam(fBProcedureParam0);
      fBProcedureCall0.registerOutParam(24, 24);
      FBProcedureParam fBProcedureParam1 = fBProcedureCall0.getInputParam(24);
      assertEquals(24, fBProcedureParam1.getType());
  }

  /**
  //Test case number: 18
  /*Coverage entropy=1.6868977693384444
  */
  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      FBProcedureParam fBProcedureParam0 = new FBProcedureParam();
      fBProcedureParam0.setIndex(39);
      fBProcedureCall0.addOutputParam(fBProcedureParam0);
      FBProcedureParam fBProcedureParam1 = fBProcedureCall0.getOutputParam(39);
      assertEquals(0, fBProcedureParam1.getType());
  }

  /**
  //Test case number: 19
  /*Coverage entropy=2.4321743227748382
  */
  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      FBProcedureParam fBProcedureParam0 = new FBProcedureParam(0, "K[m!@");
      FBProcedureParam fBProcedureParam1 = new FBProcedureParam();
      fBProcedureParam0.setIndex(0);
      fBProcedureCall0.addInputParam(fBProcedureParam0);
      fBProcedureCall0.addOutputParam(fBProcedureParam0);
      fBProcedureCall0.registerOutParam(0, 0);
      fBProcedureCall0.hashCode();
      FBProcedureParam fBProcedureParam2 = fBProcedureCall0.getOutputParam(0);
      assertEquals(0, fBProcedureParam2.getType());
      
      boolean boolean0 = fBProcedureCall0.equals(fBProcedureParam1);
      assertFalse(boolean0);
  }

  /**
  //Test case number: 20
  /*Coverage entropy=2.018703762168135
  */
  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      FBProcedureParam fBProcedureParam0 = new FBProcedureParam();
      fBProcedureParam0.setIndex(1);
      fBProcedureCall0.addOutputParam(fBProcedureParam0);
      fBProcedureCall0.registerOutParam(1, 1);
      FBProcedureParam fBProcedureParam1 = fBProcedureCall0.getOutputParam(1);
      assertEquals(1, fBProcedureParam1.getType());
  }

  /**
  //Test case number: 21
  /*Coverage entropy=2.4018629335345727
  */
  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      String string0 = "NR6*Z";
      fBProcedureCall0.setName("NR6*Z");
      fBProcedureCall0.addParam(3250, "NR6*Z");
      Object object0 = new Object();
      fBProcedureCall0.equals(object0);
      fBProcedureCall0.clone();
      fBProcedureCall0.clone();
      fBProcedureCall0.getOutputParams();
      fBProcedureCall0.getInputParam(4804);
      fBProcedureCall0.getSQL(true);
      // Undeclared exception!
      fBProcedureCall0.clone();
  }

  /**
  //Test case number: 22
  /*Coverage entropy=1.3267767682755784
  */
  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      FBProcedureParam fBProcedureParam0 = fBProcedureCall0.addParam(1900, "<I^Xh7[K<O;c(m{5?");
      assertEquals(1900, fBProcedureParam0.getPosition());
      
      String string0 = fBProcedureCall0.getSQL(true);
      assertEquals("SELECT * FROM null(<I^Xh7[K<O;c(m{5?)", string0);
  }

  /**
  //Test case number: 23
  /*Coverage entropy=1.0365141682948127
  */
  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      int int0 = (-16);
      FBProcedureParam fBProcedureParam0 = new FBProcedureParam((-16), "pxtNGqZYex$PPp%S");
      // Undeclared exception!
      try { 
        fBProcedureCall0.addOutputParam(fBProcedureParam0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -16
         //
         verifyException("java.util.Vector", e);
      }
  }

  /**
  //Test case number: 24
  /*Coverage entropy=2.203195655962931
  */
  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      FBProcedureParam fBProcedureParam0 = fBProcedureCall0.addParam(0, "K[m!@");
      fBProcedureParam0.setIndex(0);
      fBProcedureCall0.addInputParam(fBProcedureParam0);
      fBProcedureCall0.clone();
      FBProcedureCall fBProcedureCall1 = new FBProcedureCall();
      fBProcedureCall1.clone();
      fBProcedureCall0.getOutputParams();
      fBProcedureCall0.addInputParam(fBProcedureParam0);
      Object object0 = fBProcedureCall0.clone();
      FBProcedureParam fBProcedureParam1 = fBProcedureCall0.getInputParam(0);
      assertSame(fBProcedureParam1, fBProcedureParam0);
      assertNotSame(fBProcedureCall0, object0);
      assertEquals(0, fBProcedureParam1.getPosition());
      assertTrue(fBProcedureCall0.equals((Object)object0));
  }

  /**
  //Test case number: 25
  /*Coverage entropy=1.0365141682948127
  */
  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      FBProcedureParam fBProcedureParam0 = new FBProcedureParam((-2206), "not");
      // Undeclared exception!
      try { 
        fBProcedureCall0.addInputParam(fBProcedureParam0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -2206
         //
         verifyException("java.util.Vector", e);
      }
  }

  /**
  //Test case number: 26
  /*Coverage entropy=1.5434454298906781
  */
  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      fBProcedureCall0.setName("]ws)2FUtb[(");
      FBProcedureCall fBProcedureCall1 = new FBProcedureCall();
      int int0 = fBProcedureCall1.mapOutParamIndexToPosition(14, true);
      //  // Unstable assertion: assertEquals(14, int0);
      
      boolean boolean0 = fBProcedureCall0.equals(fBProcedureCall1);
      //  // Unstable assertion: assertFalse(fBProcedureCall1.equals((Object)fBProcedureCall0));
      //  // Unstable assertion: assertTrue(boolean0);
  }

  /**
  //Test case number: 27
  /*Coverage entropy=1.6745460275183657
  */
  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      fBProcedureCall0.clone();
      FBProcedureCall fBProcedureCall1 = new FBProcedureCall();
      fBProcedureCall1.setName("[*1}F]peSY\"ew");
      boolean boolean0 = fBProcedureCall0.equals(fBProcedureCall1);
      assertFalse(boolean0);
      
      Object object0 = fBProcedureCall1.clone();
      assertTrue(object0.equals((Object)fBProcedureCall1));
      assertNotSame(object0, fBProcedureCall1);
  }

  /**
  //Test case number: 28
  /*Coverage entropy=1.1375916250043898
  */
  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      FBProcedureParam fBProcedureParam0 = new FBProcedureParam();
      fBProcedureParam0.setIndex(19);
      fBProcedureCall0.addInputParam(fBProcedureParam0);
      FBProcedureParam fBProcedureParam1 = fBProcedureCall0.getInputParam(19);
      assertEquals(0, fBProcedureParam1.getType());
  }

  /**
  //Test case number: 29
  /*Coverage entropy=1.6811293135849483
  */
  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      fBProcedureCall0.addParam(1, "+9z");
      FBProcedureParam fBProcedureParam0 = fBProcedureCall0.getInputParam((-1));
      assertEquals(1, fBProcedureParam0.getPosition());
  }

  /**
  //Test case number: 30
  /*Coverage entropy=1.7214787039105834
  */
  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      FBProcedureParam fBProcedureParam0 = new FBProcedureParam();
      fBProcedureCall0.addInputParam(fBProcedureParam0);
      FBProcedureParam fBProcedureParam1 = fBProcedureCall0.getInputParam((-1));
      assertFalse(fBProcedureParam1.isValueSet());
  }

  /**
  //Test case number: 31
  /*Coverage entropy=1.3120076729259056
  */
  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      FBProcedureCall fBProcedureCall1 = new FBProcedureCall();
      assertTrue(fBProcedureCall1.equals((Object)fBProcedureCall0));
      
      FBProcedureParam fBProcedureParam0 = new FBProcedureParam();
      fBProcedureCall1.addInputParam(fBProcedureParam0);
      boolean boolean0 = fBProcedureCall0.equals(fBProcedureCall1);
      assertFalse(fBProcedureCall1.equals((Object)fBProcedureCall0));
      assertFalse(boolean0);
  }

  /**
  //Test case number: 32
  /*Coverage entropy=1.0931471805599453
  */
  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
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
  //Test case number: 33
  /*Coverage entropy=1.5531577432135641
  */
  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      fBProcedureCall0.addParam(2, "7?&YnX#ygqiB");
      fBProcedureCall0.registerOutParam((-1), 2);
      assertTrue(FBProcedureCall.OLD_CALLABLE_STATEMENT_COMPATIBILITY);
  }

  /**
  //Test case number: 34
  /*Coverage entropy=1.0931471805599453
  */
  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      // Undeclared exception!
      try { 
        fBProcedureCall0.addParam(63, (String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.firebirdsql.jdbc.FBProcedureCall", e);
      }
  }

  /**
  //Test case number: 35
  /*Coverage entropy=0.8791326374377332
  */
  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      FBProcedureParam fBProcedureParam0 = new FBProcedureParam(2, "080");
      fBProcedureCall0.addOutputParam(fBProcedureParam0);
      Object object0 = fBProcedureCall0.clone();
      assertTrue(object0.equals((Object)fBProcedureCall0));
      assertNotSame(object0, fBProcedureCall0);
  }

  /**
  //Test case number: 36
  /*Coverage entropy=2.172467200040117
  */
  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      FBProcedureParam fBProcedureParam0 = fBProcedureCall0.getOutputParam(0);
      fBProcedureParam0.setIndex(0);
      fBProcedureParam0.setIndex(0);
      fBProcedureCall0.addOutputParam(fBProcedureParam0);
      fBProcedureParam0.clone();
      fBProcedureCall0.addOutputParam(fBProcedureParam0);
      fBProcedureCall0.setName("");
      fBProcedureCall0.getName();
      fBProcedureCall0.setName((String) null);
      // Undeclared exception!
      try { 
        fBProcedureCall0.addParam((-1187), "ex");
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -1187
         //
         verifyException("java.util.Vector", e);
      }
  }

  /**
  //Test case number: 37
  /*Coverage entropy=1.1476926351053998
  */
  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
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
  //Test case number: 38
  /*Coverage entropy=1.4471627089619605
  */
  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      fBProcedureCall0.setName("':&104Q?a_T^o/K");
      fBProcedureCall0.addParam(988, "':&104Q?a_T^o/K");
      String string0 = fBProcedureCall0.getName();
      assertEquals("':&104Q?a_T^o/K", string0);
  }

  /**
  //Test case number: 39
  /*Coverage entropy=0.9172278755329712
  */
  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      FBProcedureParam fBProcedureParam0 = fBProcedureCall0.getInputParam(3233);
      fBProcedureCall0.addInputParam(fBProcedureParam0);
      Object object0 = fBProcedureCall0.clone();
      String string0 = fBProcedureCall0.getSQL(true);
      assertTrue(fBProcedureCall0.equals((Object)object0));
      assertEquals("SELECT * FROM null(null, null)", string0);
      assertNotSame(fBProcedureCall0, object0);
  }

  /**
  //Test case number: 40
  /*Coverage entropy=1.0931471805599453
  */
  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
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
  //Test case number: 41
  /*Coverage entropy=1.7766234846545668
  */
  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      Object object0 = fBProcedureCall0.clone();
      FBProcedureParam fBProcedureParam0 = new FBProcedureParam();
      fBProcedureCall0.addOutputParam(fBProcedureParam0);
      fBProcedureCall0.getOutputParams();
      assertNotSame(fBProcedureCall0, object0);
  }

  /**
  //Test case number: 42
  /*Coverage entropy=1.4456843511585487
  */
  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      fBProcedureCall0.getInputParam(3497);
      String string0 = fBProcedureCall0.getSQL(false);
      assertEquals("EXECUTE PROCEDURE null(null)", string0);
  }

  /**
  //Test case number: 43
  /*Coverage entropy=1.7766234846545668
  */
  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      fBProcedureCall0.setName("?:u$vYC{Cs");
      Object object0 = fBProcedureCall0.clone();
      fBProcedureCall0.hashCode();
      assertNotSame(fBProcedureCall0, object0);
  }

  /**
  //Test case number: 44
  /*Coverage entropy=1.0067795890632527
  */
  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      FBProcedureParam fBProcedureParam0 = fBProcedureCall0.addParam(1, "lv");
      fBProcedureCall0.addOutputParam(fBProcedureParam0);
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
  //Test case number: 45
  /*Coverage entropy=0.45454545454545453
  */
  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      fBProcedureCall0.getInputParam(2204);
      String string0 = fBProcedureCall0.getSQL(true);
      assertEquals("SELECT * FROM null(null)", string0);
  }

  /**
  //Test case number: 46
  /*Coverage entropy=1.1476926351053998
  */
  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      FBProcedureParam fBProcedureParam0 = fBProcedureCall0.getOutputParam(3802);
      fBProcedureCall0.addOutputParam(fBProcedureParam0);
      int int0 = fBProcedureCall0.mapOutParamIndexToPosition(3802, true);
      assertEquals(3802, int0);
  }

  /**
  //Test case number: 47
  /*Coverage entropy=1.7741057932992024
  */
  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      int int0 = fBProcedureCall0.mapOutParamIndexToPosition(0);
      assertEquals(0, int0);
      
      Object object0 = fBProcedureCall0.clone();
      assertNotSame(object0, fBProcedureCall0);
  }

  /**
  //Test case number: 48
  /*Coverage entropy=0.9004024235381879
  */
  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      FBProcedureParam fBProcedureParam0 = fBProcedureCall0.addParam(37, ", ");
      assertEquals(37, fBProcedureParam0.getPosition());
  }

  /**
  //Test case number: 49
  /*Coverage entropy=1.0365141682948127
  */
  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      // Undeclared exception!
      try { 
        fBProcedureCall0.addParam((-1272), "qn|");
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -1272
         //
         verifyException("java.util.Vector", e);
      }
  }

  /**
  //Test case number: 50
  /*Coverage entropy=1.4834915965575728
  */
  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      Object object0 = fBProcedureCall0.clone();
      int int0 = fBProcedureCall0.mapOutParamIndexToPosition(0, true);
      assertEquals(0, int0);
      assertNotSame(fBProcedureCall0, object0);
  }

  /**
  //Test case number: 51
  /*Coverage entropy=1.6969987794394545
  */
  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      fBProcedureCall0.getInputParam(482);
      List<FBProcedureParam> list0 = fBProcedureCall0.getInputParams();
      assertEquals(482, list0.size());
  }

  /**
  //Test case number: 52
  /*Coverage entropy=0.4
  */
  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      String string0 = fBProcedureCall0.getSQL(false);
      assertEquals("EXECUTE PROCEDURE null", string0);
  }

  /**
  //Test case number: 53
  /*Coverage entropy=0.4
  */
  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      String string0 = fBProcedureCall0.getSQL(true);
      assertEquals("SELECT * FROM null", string0);
  }

  /**
  //Test case number: 54
  /*Coverage entropy=1.0931471805599453
  */
  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      List<FBProcedureParam> list0 = fBProcedureCall0.getInputParams();
      assertEquals(0, list0.size());
  }

  /**
  //Test case number: 55
  /*Coverage entropy=1.0931471805599453
  */
  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      String string0 = fBProcedureCall0.getName();
      assertNull(string0);
  }

  /**
  //Test case number: 56
  /*Coverage entropy=1.410015058995706
  */
  @Test(timeout = 4000)
  public void test56()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      fBProcedureCall0.getInputParam(31);
      FBProcedureParam fBProcedureParam0 = fBProcedureCall0.getInputParam(31);
      assertEquals(0, fBProcedureParam0.getPosition());
  }

  /**
  //Test case number: 57
  /*Coverage entropy=1.1693376567504215
  */
  @Test(timeout = 4000)
  public void test57()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      fBProcedureCall0.getInputParam(1182);
      try { 
        fBProcedureCall0.registerOutParam(1182, 1182);
        fail("Expecting exception: FBSQLException");
      
      } catch(FBSQLException e) {
         //
         // Cannot find parameter with the specified position.
         //
         verifyException("org.firebirdsql.jdbc.FBProcedureCall", e);
      }
  }

  /**
  //Test case number: 58
  /*Coverage entropy=1.4682921994113465
  */
  @Test(timeout = 4000)
  public void test58()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      int int0 = fBProcedureCall0.mapOutParamIndexToPosition((-2845));
      assertEquals((-2845), int0);
  }

  /**
  //Test case number: 59
  /*Coverage entropy=0.810116318288409
  */
  @Test(timeout = 4000)
  public void test59()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      FBProcedureParam fBProcedureParam0 = fBProcedureCall0.addParam(547, "Q4:qgSalp+?_)");
      assertEquals(547, fBProcedureParam0.getPosition());
  }

  /**
  //Test case number: 60
  /*Coverage entropy=0.810116318288409
  */
  @Test(timeout = 4000)
  public void test60()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      FBProcedureParam fBProcedureParam0 = fBProcedureCall0.addParam(0, "JNk;o984@p}yih`Q");
      assertEquals(0, fBProcedureParam0.getPosition());
  }

  /**
  //Test case number: 61
  /*Coverage entropy=0.7767701612564368
  */
  @Test(timeout = 4000)
  public void test61()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      // Undeclared exception!
      try { 
        fBProcedureCall0.addParam((-1), "07005");
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -1
         //
         verifyException("java.util.Vector", e);
      }
  }

  /**
  //Test case number: 62
  /*Coverage entropy=1.6066699893655365
  */
  @Test(timeout = 4000)
  public void test62()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      FBProcedureParam fBProcedureParam0 = fBProcedureCall0.addParam(325, "%>");
      fBProcedureCall0.addInputParam(fBProcedureParam0);
      assertEquals(325, fBProcedureParam0.getPosition());
      
      Object object0 = fBProcedureCall0.clone();
      assertTrue(object0.equals((Object)fBProcedureCall0));
      assertNotSame(object0, fBProcedureCall0);
  }

  /**
  //Test case number: 63
  /*Coverage entropy=1.1476926351053998
  */
  @Test(timeout = 4000)
  public void test63()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      FBProcedureParam fBProcedureParam0 = fBProcedureCall0.getInputParam(31);
      fBProcedureCall0.addInputParam(fBProcedureParam0);
      Object object0 = new Object();
  }

  /**
  //Test case number: 64
  /*Coverage entropy=0.4
  */
  @Test(timeout = 4000)
  public void test64()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      FBProcedureParam fBProcedureParam0 = fBProcedureCall0.addParam(37, "gMsgQjK{");
      assertEquals(37, fBProcedureParam0.getPosition());
  }

  /**
  //Test case number: 65
  /*Coverage entropy=0.4
  */
  @Test(timeout = 4000)
  public void test65()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      // Undeclared exception!
      try { 
        fBProcedureCall0.addParam((-904), "Ohk=L");
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -904
         //
         verifyException("java.util.Vector", e);
      }
  }

  /**
  //Test case number: 66
  /*Coverage entropy=1.543056733112554
  */
  @Test(timeout = 4000)
  public void test66()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      FBProcedureParam fBProcedureParam0 = fBProcedureCall0.getOutputParam(18);
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
  //Test case number: 67
  /*Coverage entropy=1.1217186091313738
  */
  @Test(timeout = 4000)
  public void test67()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      int int0 = fBProcedureCall0.mapOutParamIndexToPosition(41);
      assertEquals(41, int0);
  }

  /**
  //Test case number: 68
  /*Coverage entropy=0.42857142857142855
  */
  @Test(timeout = 4000)
  public void test68()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      FBProcedureCall fBProcedureCall1 = new FBProcedureCall();
      boolean boolean0 = fBProcedureCall0.equals(fBProcedureCall1);
      assertTrue(boolean0);
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

  /**
  //Test case number: 70
  /*Coverage entropy=1.6082873972465446
  */
  @Test(timeout = 4000)
  public void test70()  throws Throwable  {
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
  //Test case number: 71
  /*Coverage entropy=1.885150328612323
  */
  @Test(timeout = 4000)
  public void test71()  throws Throwable  {
      FBProcedureCall fBProcedureCall0 = new FBProcedureCall();
      try { 
        fBProcedureCall0.registerOutParam(553, 1665);
        fail("Expecting exception: FBSQLException");
      
      } catch(FBSQLException e) {
         //
         // Cannot find parameter with the specified position.
         //
         verifyException("org.firebirdsql.jdbc.FBProcedureCall", e);
      }
  }

  /**
  //Test case number: 72
  /*Coverage entropy=0.4444444444444445
  */
  @Test(timeout = 4000)
  public void test72()  throws Throwable  {
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
}
