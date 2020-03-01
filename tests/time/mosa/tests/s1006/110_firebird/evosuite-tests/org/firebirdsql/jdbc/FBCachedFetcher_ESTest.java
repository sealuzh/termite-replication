/*
 * This file was automatically generated by EvoSuite
 * Wed Dec 04 19:05:37 GMT 2019
 */

package org.firebirdsql.jdbc;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.LinkedList;
import java.util.List;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.System;
import org.firebirdsql.gds.XSQLVAR;
import org.firebirdsql.gds.impl.GDSHelper;
import org.firebirdsql.gds.impl.wire.isc_stmt_handle_impl;
import org.firebirdsql.jdbc.FBCachedFetcher;
import org.firebirdsql.jdbc.FBObjectListener;
import org.firebirdsql.jdbc.FBResultSet;
import org.firebirdsql.jdbc.FBSQLException;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class FBCachedFetcher_ESTest extends FBCachedFetcher_ESTest_scaffolding {

  /**
  //Test case number: 0
  /*Coverage entropy=1.6868977693384444
  */
  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      LinkedList<byte[][]> linkedList0 = new LinkedList<byte[][]>();
      FBCachedFetcher fBCachedFetcher0 = new FBCachedFetcher(linkedList0, (FBObjectListener.FetcherListener) null);
      fBCachedFetcher0.relative(560);
      fBCachedFetcher0.relative((-2));
      fBCachedFetcher0.isEmpty();
      System.setCurrentTimeMillis((-2));
  }

  /**
  //Test case number: 1
  /*Coverage entropy=2.0139900357528324
  */
  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      LinkedList<byte[][]> linkedList0 = new LinkedList<byte[][]>();
      FBCachedFetcher fBCachedFetcher0 = new FBCachedFetcher(linkedList0, (FBObjectListener.FetcherListener) null);
      fBCachedFetcher0.setFetchSize((-1569));
      fBCachedFetcher0.relative(336068813);
      fBCachedFetcher0.getFetchSize();
      System.setCurrentTimeMillis((-1569));
      byte[][] byteArray0 = new byte[8][2];
      byte[] byteArray1 = new byte[5];
      byteArray1[0] = (byte) (-81);
      byteArray1[1] = (byte)42;
      byteArray1[2] = (byte) (-49);
      byteArray1[3] = (byte)17;
      byteArray1[4] = (byte) (-105);
      byteArray0[0] = byteArray1;
      byte[] byteArray2 = new byte[1];
      byteArray2[0] = (byte)82;
      byteArray0[1] = byteArray2;
      byte[] byteArray3 = new byte[9];
      byteArray3[0] = (byte)42;
      byteArray3[1] = (byte)40;
      byteArray3[2] = (byte) (-81);
      byteArray3[3] = (byte)17;
      byteArray3[4] = (byte) (-105);
      byteArray3[5] = (byte)82;
      byteArray3[6] = (byte) (-81);
      byteArray3[7] = (byte) (-49);
      byteArray3[8] = (byte)42;
      byteArray0[2] = byteArray3;
      byte[] byteArray4 = new byte[9];
      byteArray4[0] = (byte) (-105);
      byteArray4[1] = (byte)40;
      byteArray4[2] = (byte)42;
      byteArray4[3] = (byte) (-81);
      byteArray4[4] = (byte) (-105);
      byteArray4[5] = (byte) (-81);
      byteArray4[6] = (byte)82;
      byteArray4[7] = (byte)40;
      byteArray4[8] = (byte) (-49);
      byteArray0[3] = byteArray4;
      byte[] byteArray5 = new byte[6];
      byteArray5[0] = (byte) (-105);
      byteArray5[1] = (byte) (-105);
      byteArray5[2] = (byte)17;
      byteArray5[3] = (byte)17;
      byteArray5[4] = (byte)82;
      byteArray5[5] = (byte)17;
      byteArray0[4] = byteArray5;
      byte[] byteArray6 = new byte[2];
      byteArray6[0] = (byte)82;
      byteArray6[1] = (byte) (-105);
      byteArray0[5] = byteArray6;
      byte[] byteArray7 = new byte[6];
      byteArray7[0] = (byte) (-105);
      byteArray7[1] = (byte) (-49);
      byteArray7[2] = (byte)82;
      byteArray7[3] = (byte) (-81);
      byteArray7[4] = (byte) (-49);
      byteArray7[5] = (byte) (-105);
      byteArray0[6] = byteArray7;
      byte[] byteArray8 = new byte[3];
      byteArray8[0] = (byte) (-105);
      byteArray8[1] = (byte) (-97);
      byteArray8[2] = (byte)82;
      byteArray0[7] = byteArray8;
      linkedList0.add(byteArray0);
      System.setCurrentTimeMillis(0L);
      boolean boolean0 = fBCachedFetcher0.relative((-2175));
      assertEquals((-1569), fBCachedFetcher0.getFetchSize());
      assertFalse(boolean0);
  }

  /**
  //Test case number: 2
  /*Coverage entropy=2.004371500423656
  */
  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      LinkedList<byte[][]> linkedList0 = new LinkedList<byte[][]>();
      FBCachedFetcher fBCachedFetcher0 = new FBCachedFetcher(linkedList0, (FBObjectListener.FetcherListener) null);
      fBCachedFetcher0.setFetchSize(4610);
      fBCachedFetcher0.previous();
      int int0 = fBCachedFetcher0.getFetchSize();
      assertEquals(4610, int0);
  }

  /**
  //Test case number: 3
  /*Coverage entropy=2.4033443461282986
  */
  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      XSQLVAR[] xSQLVARArray0 = new XSQLVAR[0];
      LinkedList<byte[][]> linkedList0 = new LinkedList<byte[][]>();
      FBResultSet fBResultSet0 = new FBResultSet(xSQLVARArray0, linkedList0);
      FBCachedFetcher fBCachedFetcher0 = new FBCachedFetcher(linkedList0, fBResultSet0);
      fBCachedFetcher0.insertRow((byte[][]) null);
      fBCachedFetcher0.insertRow((byte[][]) null);
      fBCachedFetcher0.insertRow((byte[][]) null);
      fBCachedFetcher0.absolute(3223);
      boolean boolean0 = fBCachedFetcher0.previous();
      assertFalse(fBCachedFetcher0.isFirst());
      assertTrue(boolean0);
  }

  /**
  //Test case number: 4
  /*Coverage entropy=2.365329159198171
  */
  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      XSQLVAR[] xSQLVARArray0 = new XSQLVAR[0];
      LinkedList<byte[][]> linkedList0 = new LinkedList<byte[][]>();
      FBResultSet fBResultSet0 = new FBResultSet(xSQLVARArray0, linkedList0);
      linkedList0.add((byte[][]) null);
      FBCachedFetcher fBCachedFetcher0 = new FBCachedFetcher(linkedList0, fBResultSet0);
      fBCachedFetcher0.insertRow((byte[][]) null);
      fBCachedFetcher0.last();
      fBCachedFetcher0.insertRow((byte[][]) null);
      fBCachedFetcher0.deleteRow();
      assertFalse(fBCachedFetcher0.isFirst());
  }

  /**
  //Test case number: 5
  /*Coverage entropy=1.5935041414150646
  */
  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      LinkedList<byte[][]> linkedList0 = new LinkedList<byte[][]>();
      FBCachedFetcher fBCachedFetcher0 = new FBCachedFetcher(linkedList0, (FBObjectListener.FetcherListener) null);
      boolean boolean0 = fBCachedFetcher0.relative(0);
      assertFalse(boolean0);
      assertTrue(fBCachedFetcher0.isLast());
  }

  /**
  //Test case number: 6
  /*Coverage entropy=0.48000000000000004
  */
  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      LinkedList<byte[][]> linkedList0 = new LinkedList<byte[][]>();
      linkedList0.add((byte[][]) null);
      XSQLVAR[] xSQLVARArray0 = new XSQLVAR[0];
      FBResultSet fBResultSet0 = new FBResultSet(xSQLVARArray0, linkedList0);
      FBCachedFetcher fBCachedFetcher0 = new FBCachedFetcher(linkedList0, fBResultSet0);
      fBCachedFetcher0.relative(7);
      boolean boolean0 = fBCachedFetcher0.previous();
      assertTrue(fBCachedFetcher0.isFirst());
      assertTrue(boolean0);
  }

  /**
  //Test case number: 7
  /*Coverage entropy=2.3822194921698756
  */
  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      XSQLVAR[] xSQLVARArray0 = new XSQLVAR[0];
      LinkedList<byte[][]> linkedList0 = new LinkedList<byte[][]>();
      FBResultSet fBResultSet0 = new FBResultSet(xSQLVARArray0, linkedList0);
      FBCachedFetcher fBCachedFetcher0 = new FBCachedFetcher(linkedList0, fBResultSet0);
      fBCachedFetcher0.insertRow((byte[][]) null);
      fBCachedFetcher0.deleteRow();
      boolean boolean0 = fBCachedFetcher0.isLast();
      assertTrue(fBCachedFetcher0.isEmpty());
      assertFalse(boolean0);
  }

  /**
  //Test case number: 8
  /*Coverage entropy=1.8809457317913751
  */
  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      LinkedList<byte[][]> linkedList0 = new LinkedList<byte[][]>();
      linkedList0.offerFirst((byte[][]) null);
      FBCachedFetcher fBCachedFetcher0 = new FBCachedFetcher(linkedList0, (FBObjectListener.FetcherListener) null);
      fBCachedFetcher0.isEmpty();
      // Undeclared exception!
      try { 
        fBCachedFetcher0.absolute((-2039));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.firebirdsql.jdbc.FBCachedFetcher", e);
      }
  }

  /**
  //Test case number: 9
  /*Coverage entropy=0.42857142857142855
  */
  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      LinkedList<byte[][]> linkedList0 = new LinkedList<byte[][]>();
      FBCachedFetcher fBCachedFetcher0 = new FBCachedFetcher(linkedList0, (FBObjectListener.FetcherListener) null);
      try { 
        fBCachedFetcher0.absolute((-1));
        fail("Expecting exception: FBSQLException");
      
      } catch(FBSQLException e) {
         //
         // You cannot position to the row 0 with absolute() method.
         //
         verifyException("org.firebirdsql.jdbc.FBCachedFetcher", e);
      }
  }

  /**
  //Test case number: 10
  /*Coverage entropy=2.623989599527888
  */
  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      XSQLVAR[] xSQLVARArray0 = new XSQLVAR[0];
      LinkedList<byte[][]> linkedList0 = new LinkedList<byte[][]>();
      FBResultSet fBResultSet0 = new FBResultSet(xSQLVARArray0, linkedList0);
      linkedList0.add((byte[][]) null);
      FBCachedFetcher fBCachedFetcher0 = new FBCachedFetcher(linkedList0, fBResultSet0);
      fBCachedFetcher0.afterLast();
      fBCachedFetcher0.insertRow((byte[][]) null);
      fBCachedFetcher0.deleteRow();
      assertFalse(fBCachedFetcher0.isLast());
  }

  /**
  //Test case number: 11
  /*Coverage entropy=2.1628215245816933
  */
  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      XSQLVAR[] xSQLVARArray0 = new XSQLVAR[0];
      LinkedList<byte[][]> linkedList0 = new LinkedList<byte[][]>();
      FBResultSet fBResultSet0 = new FBResultSet(xSQLVARArray0, linkedList0);
      FBCachedFetcher fBCachedFetcher0 = new FBCachedFetcher(linkedList0, fBResultSet0);
      fBCachedFetcher0.insertRow((byte[][]) null);
      fBCachedFetcher0.previous();
      fBCachedFetcher0.afterLast();
      fBCachedFetcher0.next();
      fBCachedFetcher0.updateRow((byte[][]) null);
      assertEquals(2, fBCachedFetcher0.getRowNum());
  }

  /**
  //Test case number: 12
  /*Coverage entropy=1.166831391086261
  */
  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      LinkedList<byte[][]> linkedList0 = new LinkedList<byte[][]>();
      linkedList0.add((byte[][]) null);
      FBCachedFetcher fBCachedFetcher0 = new FBCachedFetcher(linkedList0, (FBObjectListener.FetcherListener) null);
      fBCachedFetcher0.updateRow((byte[][]) null);
      // Undeclared exception!
      try { 
        fBCachedFetcher0.previous();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.firebirdsql.jdbc.FBCachedFetcher", e);
      }
  }

  /**
  //Test case number: 13
  /*Coverage entropy=0.4857142857142857
  */
  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      XSQLVAR[] xSQLVARArray0 = new XSQLVAR[0];
      LinkedList<byte[][]> linkedList0 = new LinkedList<byte[][]>();
      FBResultSet fBResultSet0 = new FBResultSet(xSQLVARArray0, linkedList0);
      FBCachedFetcher fBCachedFetcher0 = new FBCachedFetcher(linkedList0, fBResultSet0);
      fBCachedFetcher0.insertRow((byte[][]) null);
      fBCachedFetcher0.previous();
      fBCachedFetcher0.next();
      fBCachedFetcher0.updateRow((byte[][]) null);
      assertTrue(fBCachedFetcher0.isFirst());
  }

  /**
  //Test case number: 14
  /*Coverage entropy=0.3333333333333333
  */
  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      FBCachedFetcher fBCachedFetcher0 = null;
      try {
        fBCachedFetcher0 = new FBCachedFetcher((List<byte[][]>) null, (FBObjectListener.FetcherListener) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.firebirdsql.jdbc.FBCachedFetcher", e);
      }
  }

  /**
  //Test case number: 15
  /*Coverage entropy=2.2041609427036586
  */
  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      LinkedList<byte[][]> linkedList0 = new LinkedList<byte[][]>();
      byte[][] byteArray0 = new byte[4][7];
      byte[] byteArray1 = new byte[2];
      byteArray1[0] = (byte) (-76);
      byteArray1[1] = (byte) (-76);
      byteArray0[0] = byteArray1;
      byte[] byteArray2 = new byte[2];
      byteArray2[0] = (byte) (-76);
      byteArray2[1] = (byte) (-76);
      byteArray0[1] = byteArray2;
      byte[] byteArray3 = new byte[6];
      byteArray3[0] = (byte) (-76);
      byteArray3[1] = (byte) (-76);
      byteArray3[2] = (byte) (-76);
      byteArray3[3] = (byte) (-76);
      byteArray3[4] = (byte) (-76);
      byteArray3[5] = (byte) (-76);
      byteArray0[2] = byteArray3;
      byte[] byteArray4 = new byte[3];
      byteArray4[0] = (byte) (-2);
      byteArray4[1] = (byte) (-76);
      byteArray4[2] = (byte) (-76);
      linkedList0.add(byteArray0);
      linkedList0.add((byte[][]) null);
      XSQLVAR[] xSQLVARArray0 = new XSQLVAR[0];
      FBResultSet fBResultSet0 = new FBResultSet(xSQLVARArray0, linkedList0);
      FBCachedFetcher fBCachedFetcher0 = new FBCachedFetcher(linkedList0, fBResultSet0);
      fBCachedFetcher0.relative(1);
      fBCachedFetcher0.deleteRow();
      fBCachedFetcher0.isBeforeFirst();
      assertTrue(fBCachedFetcher0.isFirst());
  }

  /**
  //Test case number: 16
  /*Coverage entropy=1.0365141682948127
  */
  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      LinkedList<byte[][]> linkedList0 = new LinkedList<byte[][]>();
      linkedList0.add((byte[][]) null);
      FBCachedFetcher fBCachedFetcher0 = new FBCachedFetcher(linkedList0, (FBObjectListener.FetcherListener) null);
      boolean boolean0 = fBCachedFetcher0.isLast();
      assertFalse(boolean0);
  }

  /**
  //Test case number: 17
  /*Coverage entropy=2.0809214009948747
  */
  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      LinkedList<byte[][]> linkedList0 = new LinkedList<byte[][]>();
      byte[][] byteArray0 = new byte[0][9];
      linkedList0.offerFirst(byteArray0);
      FBCachedFetcher fBCachedFetcher0 = new FBCachedFetcher(linkedList0, (FBObjectListener.FetcherListener) null);
      // Undeclared exception!
      try { 
        fBCachedFetcher0.beforeFirst();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.firebirdsql.jdbc.FBCachedFetcher", e);
      }
  }

  /**
  //Test case number: 18
  /*Coverage entropy=2.3601445521722115
  */
  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      XSQLVAR[] xSQLVARArray0 = new XSQLVAR[0];
      LinkedList<byte[][]> linkedList0 = new LinkedList<byte[][]>();
      FBResultSet fBResultSet0 = new FBResultSet(xSQLVARArray0, linkedList0);
      linkedList0.add((byte[][]) null);
      FBCachedFetcher fBCachedFetcher0 = new FBCachedFetcher(linkedList0, fBResultSet0);
      fBCachedFetcher0.insertRow((byte[][]) null);
      fBCachedFetcher0.next();
      fBCachedFetcher0.deleteRow();
      fBCachedFetcher0.insertRow((byte[][]) null);
      assertFalse(fBCachedFetcher0.isFirst());
  }

  /**
  //Test case number: 19
  /*Coverage entropy=1.87581752666317
  */
  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      LinkedList<byte[][]> linkedList0 = new LinkedList<byte[][]>();
      byte[][] byteArray0 = new byte[0][3];
      linkedList0.offerFirst(byteArray0);
      FBCachedFetcher fBCachedFetcher0 = new FBCachedFetcher(linkedList0, (FBObjectListener.FetcherListener) null);
      // Undeclared exception!
      try { 
        fBCachedFetcher0.relative((-32));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.firebirdsql.jdbc.FBCachedFetcher", e);
      }
  }

  /**
  //Test case number: 20
  /*Coverage entropy=2.361820227715239
  */
  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      LinkedList<byte[][]> linkedList0 = new LinkedList<byte[][]>();
      linkedList0.add((byte[][]) null);
      XSQLVAR[] xSQLVARArray0 = new XSQLVAR[0];
      FBResultSet fBResultSet0 = new FBResultSet(xSQLVARArray0, linkedList0);
      FBCachedFetcher fBCachedFetcher0 = new FBCachedFetcher(linkedList0, fBResultSet0);
      fBCachedFetcher0.last();
      fBCachedFetcher0.afterLast();
      boolean boolean0 = fBCachedFetcher0.isAfterLast();
      assertEquals(2, fBCachedFetcher0.getRowNum());
      assertTrue(boolean0);
  }

  /**
  //Test case number: 21
  /*Coverage entropy=1.9913740596968101
  */
  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      LinkedList<byte[][]> linkedList0 = new LinkedList<byte[][]>();
      linkedList0.add((byte[][]) null);
      FBCachedFetcher fBCachedFetcher0 = new FBCachedFetcher(linkedList0, (FBObjectListener.FetcherListener) null);
      // Undeclared exception!
      try { 
        fBCachedFetcher0.first();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.firebirdsql.jdbc.FBCachedFetcher", e);
      }
  }

  /**
  //Test case number: 22
  /*Coverage entropy=0.4782608695652174
  */
  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      XSQLVAR[] xSQLVARArray0 = new XSQLVAR[0];
      LinkedList<byte[][]> linkedList0 = new LinkedList<byte[][]>();
      FBResultSet fBResultSet0 = new FBResultSet(xSQLVARArray0, linkedList0);
      FBCachedFetcher fBCachedFetcher0 = new FBCachedFetcher(linkedList0, fBResultSet0);
      fBCachedFetcher0.insertRow((byte[][]) null);
      boolean boolean0 = fBCachedFetcher0.relative((-75));
      assertFalse(fBCachedFetcher0.isEmpty());
      assertFalse(boolean0);
  }

  /**
  //Test case number: 23
  /*Coverage entropy=0.4666666666666667
  */
  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      XSQLVAR[] xSQLVARArray0 = new XSQLVAR[0];
      LinkedList<byte[][]> linkedList0 = new LinkedList<byte[][]>();
      FBResultSet fBResultSet0 = new FBResultSet(xSQLVARArray0, linkedList0);
      FBCachedFetcher fBCachedFetcher0 = new FBCachedFetcher(linkedList0, fBResultSet0);
      fBCachedFetcher0.insertRow((byte[][]) null);
      boolean boolean0 = fBCachedFetcher0.isEmpty();
      assertFalse(boolean0);
  }

  /**
  //Test case number: 24
  /*Coverage entropy=1.0931471805599453
  */
  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      LinkedList<byte[][]> linkedList0 = new LinkedList<byte[][]>();
      FBCachedFetcher fBCachedFetcher0 = new FBCachedFetcher(linkedList0, (FBObjectListener.FetcherListener) null);
      int int0 = fBCachedFetcher0.getFetchSize();
      assertEquals(0, int0);
      assertEquals(0, fBCachedFetcher0.getRowNum());
  }

  /**
  //Test case number: 25
  /*Coverage entropy=0.4615384615384615
  */
  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      LinkedList<byte[][]> linkedList0 = new LinkedList<byte[][]>();
      XSQLVAR[] xSQLVARArray0 = new XSQLVAR[0];
      LinkedList<byte[][]> linkedList1 = new LinkedList<byte[][]>();
      FBResultSet fBResultSet0 = new FBResultSet(xSQLVARArray0, linkedList1);
      FBCachedFetcher fBCachedFetcher0 = new FBCachedFetcher(linkedList0, fBResultSet0);
      // Undeclared exception!
      try { 
        fBCachedFetcher0.updateRow((byte[][]) null);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -1
         //
         verifyException("org.firebirdsql.jdbc.FBCachedFetcher", e);
      }
  }

  /**
  //Test case number: 26
  /*Coverage entropy=0.4782608695652174
  */
  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      XSQLVAR[] xSQLVARArray0 = new XSQLVAR[0];
      LinkedList<byte[][]> linkedList0 = new LinkedList<byte[][]>();
      FBResultSet fBResultSet0 = new FBResultSet(xSQLVARArray0, linkedList0);
      FBCachedFetcher fBCachedFetcher0 = new FBCachedFetcher(linkedList0, fBResultSet0);
      fBCachedFetcher0.insertRow((byte[][]) null);
      fBCachedFetcher0.insertRow((byte[][]) null);
      linkedList0.add((byte[][]) null);
      boolean boolean0 = fBCachedFetcher0.isFirst();
      assertFalse(fBCachedFetcher0.isLast());
      assertTrue(boolean0);
  }

  /**
  //Test case number: 27
  /*Coverage entropy=2.325342919442848
  */
  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      XSQLVAR[] xSQLVARArray0 = new XSQLVAR[0];
      LinkedList<byte[][]> linkedList0 = new LinkedList<byte[][]>();
      FBResultSet fBResultSet0 = new FBResultSet(xSQLVARArray0, linkedList0);
      FBCachedFetcher fBCachedFetcher0 = new FBCachedFetcher(linkedList0, fBResultSet0);
      fBCachedFetcher0.insertRow((byte[][]) null);
      fBCachedFetcher0.getRowNum();
      boolean boolean0 = fBCachedFetcher0.absolute(1);
      assertFalse(fBCachedFetcher0.isEmpty());
      assertTrue(boolean0);
  }

  /**
  //Test case number: 28
  /*Coverage entropy=1.0931471805599453
  */
  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      LinkedList<byte[][]> linkedList0 = new LinkedList<byte[][]>();
      FBCachedFetcher fBCachedFetcher0 = new FBCachedFetcher(linkedList0, (FBObjectListener.FetcherListener) null);
      int int0 = fBCachedFetcher0.getRowNum();
      assertEquals(0, int0);
  }

  /**
  //Test case number: 29
  /*Coverage entropy=1.1217186091313738
  */
  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      LinkedList<byte[][]> linkedList0 = new LinkedList<byte[][]>();
      FBCachedFetcher fBCachedFetcher0 = new FBCachedFetcher(linkedList0, (FBObjectListener.FetcherListener) null);
      fBCachedFetcher0.close();
      boolean boolean0 = fBCachedFetcher0.isEmpty();
      assertTrue(fBCachedFetcher0.isLast());
      assertTrue(boolean0);
  }

  /**
  //Test case number: 30
  /*Coverage entropy=1.1217186091313738
  */
  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      LinkedList<byte[][]> linkedList0 = new LinkedList<byte[][]>();
      linkedList0.add((byte[][]) null);
      FBCachedFetcher fBCachedFetcher0 = new FBCachedFetcher(linkedList0, (FBObjectListener.FetcherListener) null);
      boolean boolean0 = fBCachedFetcher0.isBeforeFirst();
      assertTrue(boolean0);
  }

  /**
  //Test case number: 31
  /*Coverage entropy=1.163735415854063
  */
  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      XSQLVAR[] xSQLVARArray0 = new XSQLVAR[0];
      LinkedList<byte[][]> linkedList0 = new LinkedList<byte[][]>();
      FBResultSet fBResultSet0 = new FBResultSet(xSQLVARArray0, linkedList0);
      FBCachedFetcher fBCachedFetcher0 = new FBCachedFetcher(linkedList0, fBResultSet0);
      fBCachedFetcher0.beforeFirst();
      assertTrue(fBCachedFetcher0.isLast());
  }

  /**
  //Test case number: 32
  /*Coverage entropy=0.4
  */
  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      LinkedList<byte[][]> linkedList0 = new LinkedList<byte[][]>();
      linkedList0.add((byte[][]) null);
      FBCachedFetcher fBCachedFetcher0 = new FBCachedFetcher(linkedList0, (FBObjectListener.FetcherListener) null);
      boolean boolean0 = fBCachedFetcher0.isAfterLast();
      assertFalse(boolean0);
      assertEquals(0, fBCachedFetcher0.getRowNum());
  }

  /**
  //Test case number: 33
  /*Coverage entropy=2.224345933438152
  */
  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      XSQLVAR[] xSQLVARArray0 = new XSQLVAR[0];
      LinkedList<byte[][]> linkedList0 = new LinkedList<byte[][]>();
      FBResultSet fBResultSet0 = new FBResultSet(xSQLVARArray0, linkedList0);
      linkedList0.add((byte[][]) null);
      FBCachedFetcher fBCachedFetcher0 = new FBCachedFetcher(linkedList0, fBResultSet0);
      fBCachedFetcher0.insertRow((byte[][]) null);
      fBCachedFetcher0.deleteRow();
      assertTrue(fBCachedFetcher0.isLast());
  }

  /**
  //Test case number: 34
  /*Coverage entropy=2.384725757834036
  */
  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      XSQLVAR[] xSQLVARArray0 = new XSQLVAR[0];
      LinkedList<byte[][]> linkedList0 = new LinkedList<byte[][]>();
      FBResultSet fBResultSet0 = new FBResultSet(xSQLVARArray0, linkedList0);
      FBCachedFetcher fBCachedFetcher0 = new FBCachedFetcher(linkedList0, fBResultSet0);
      fBCachedFetcher0.insertRow((byte[][]) null);
      fBCachedFetcher0.isLast();
      boolean boolean0 = fBCachedFetcher0.next();
      assertFalse(fBCachedFetcher0.isEmpty());
      assertFalse(boolean0);
  }

  /**
  //Test case number: 35
  /*Coverage entropy=1.1217186091313738
  */
  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      XSQLVAR[] xSQLVARArray0 = new XSQLVAR[0];
      LinkedList<byte[][]> linkedList0 = new LinkedList<byte[][]>();
      FBResultSet fBResultSet0 = new FBResultSet(xSQLVARArray0, linkedList0);
      linkedList0.add((byte[][]) null);
      FBCachedFetcher fBCachedFetcher0 = new FBCachedFetcher(linkedList0, fBResultSet0);
      // Undeclared exception!
      try { 
        fBCachedFetcher0.deleteRow();
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
      }
  }

  /**
  //Test case number: 36
  /*Coverage entropy=1.182036069448834
  */
  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      XSQLVAR[] xSQLVARArray0 = new XSQLVAR[0];
      LinkedList<byte[][]> linkedList0 = new LinkedList<byte[][]>();
      FBResultSet fBResultSet0 = new FBResultSet(xSQLVARArray0, linkedList0);
      FBCachedFetcher fBCachedFetcher0 = new FBCachedFetcher(linkedList0, fBResultSet0);
      fBCachedFetcher0.insertRow((byte[][]) null);
      fBCachedFetcher0.last();
      fBCachedFetcher0.afterLast();
      assertFalse(fBCachedFetcher0.isEmpty());
  }

  /**
  //Test case number: 37
  /*Coverage entropy=1.4682921994113465
  */
  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      LinkedList<byte[][]> linkedList0 = new LinkedList<byte[][]>();
      FBCachedFetcher fBCachedFetcher0 = new FBCachedFetcher(linkedList0, (FBObjectListener.FetcherListener) null);
      boolean boolean0 = fBCachedFetcher0.next();
      assertFalse(boolean0);
      assertTrue(fBCachedFetcher0.isLast());
  }

  /**
  //Test case number: 38
  /*Coverage entropy=0.4444444444444445
  */
  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      LinkedList<byte[][]> linkedList0 = new LinkedList<byte[][]>();
      byte[][] byteArray0 = new byte[0][2];
      linkedList0.addLast(byteArray0);
      FBCachedFetcher fBCachedFetcher0 = new FBCachedFetcher(linkedList0, (FBObjectListener.FetcherListener) null);
      // Undeclared exception!
      try { 
        fBCachedFetcher0.next();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.firebirdsql.jdbc.FBCachedFetcher", e);
      }
  }

  /**
  //Test case number: 39
  /*Coverage entropy=2.0029550675313184
  */
  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      XSQLVAR[] xSQLVARArray0 = new XSQLVAR[0];
      LinkedList<byte[][]> linkedList0 = new LinkedList<byte[][]>();
      FBResultSet fBResultSet0 = new FBResultSet(xSQLVARArray0, linkedList0);
      FBCachedFetcher fBCachedFetcher0 = new FBCachedFetcher(linkedList0, fBResultSet0);
      fBCachedFetcher0.insertRow((byte[][]) null);
      boolean boolean0 = fBCachedFetcher0.absolute(19);
      assertFalse(fBCachedFetcher0.isEmpty());
      assertFalse(boolean0);
  }

  /**
  //Test case number: 40
  /*Coverage entropy=0.4
  */
  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      LinkedList<byte[][]> linkedList0 = new LinkedList<byte[][]>();
      FBCachedFetcher fBCachedFetcher0 = new FBCachedFetcher(linkedList0, (FBObjectListener.FetcherListener) null);
      boolean boolean0 = fBCachedFetcher0.isFirst();
      assertFalse(boolean0);
  }

  /**
  //Test case number: 41
  /*Coverage entropy=0.47058823529411764
  */
  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      LinkedList<byte[][]> linkedList0 = new LinkedList<byte[][]>();
      linkedList0.add((byte[][]) null);
      XSQLVAR[] xSQLVARArray0 = new XSQLVAR[0];
      FBResultSet fBResultSet0 = new FBResultSet(xSQLVARArray0, linkedList0);
      FBCachedFetcher fBCachedFetcher0 = new FBCachedFetcher(linkedList0, fBResultSet0);
      boolean boolean0 = fBCachedFetcher0.relative((-1));
      assertTrue(fBCachedFetcher0.isLast());
      assertTrue(boolean0);
  }

  /**
  //Test case number: 42
  /*Coverage entropy=0.4444444444444445
  */
  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      LinkedList<byte[][]> linkedList0 = new LinkedList<byte[][]>();
      FBCachedFetcher fBCachedFetcher0 = new FBCachedFetcher(linkedList0, (FBObjectListener.FetcherListener) null);
      boolean boolean0 = fBCachedFetcher0.relative(64);
      assertFalse(boolean0);
      assertFalse(fBCachedFetcher0.isAfterLast());
  }

  /**
  //Test case number: 43
  /*Coverage entropy=2.0029550675313184
  */
  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      XSQLVAR[] xSQLVARArray0 = new XSQLVAR[0];
      LinkedList<byte[][]> linkedList0 = new LinkedList<byte[][]>();
      FBResultSet fBResultSet0 = new FBResultSet(xSQLVARArray0, linkedList0);
      FBCachedFetcher fBCachedFetcher0 = new FBCachedFetcher(linkedList0, fBResultSet0);
      fBCachedFetcher0.insertRow((byte[][]) null);
      boolean boolean0 = fBCachedFetcher0.first();
      assertFalse(fBCachedFetcher0.isEmpty());
      assertTrue(boolean0);
  }

  /**
  //Test case number: 44
  /*Coverage entropy=1.9253539308675658
  */
  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      LinkedList<byte[][]> linkedList0 = new LinkedList<byte[][]>();
      FBCachedFetcher fBCachedFetcher0 = new FBCachedFetcher(linkedList0, (FBObjectListener.FetcherListener) null);
      byte[][] byteArray0 = new byte[0][4];
      // Undeclared exception!
      try { 
        fBCachedFetcher0.insertRow(byteArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.firebirdsql.jdbc.FBCachedFetcher", e);
      }
  }

  /**
  //Test case number: 45
  /*Coverage entropy=2.1437065979373684
  */
  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      LinkedList<byte[][]> linkedList0 = new LinkedList<byte[][]>();
      linkedList0.add((byte[][]) null);
      FBCachedFetcher fBCachedFetcher0 = new FBCachedFetcher(linkedList0, (FBObjectListener.FetcherListener) null);
      // Undeclared exception!
      try { 
        fBCachedFetcher0.afterLast();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.firebirdsql.jdbc.FBCachedFetcher", e);
      }
  }

  /**
  //Test case number: 46
  /*Coverage entropy=0.4444444444444445
  */
  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      LinkedList<byte[][]> linkedList0 = new LinkedList<byte[][]>();
      FBCachedFetcher fBCachedFetcher0 = new FBCachedFetcher(linkedList0, (FBObjectListener.FetcherListener) null);
      boolean boolean0 = fBCachedFetcher0.absolute((-38));
      assertFalse(boolean0);
      assertTrue(fBCachedFetcher0.isLast());
  }

  /**
  //Test case number: 47
  /*Coverage entropy=0.4
  */
  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      LinkedList<byte[][]> linkedList0 = new LinkedList<byte[][]>();
      FBCachedFetcher fBCachedFetcher0 = new FBCachedFetcher(linkedList0, (FBObjectListener.FetcherListener) null);
      boolean boolean0 = fBCachedFetcher0.isAfterLast();
      assertFalse(boolean0);
  }

  /**
  //Test case number: 48
  /*Coverage entropy=0.4666666666666667
  */
  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      LinkedList<byte[][]> linkedList0 = new LinkedList<byte[][]>();
      byte[][] byteArray0 = new byte[0][5];
      linkedList0.add(byteArray0);
      FBCachedFetcher fBCachedFetcher0 = new FBCachedFetcher(linkedList0, (FBObjectListener.FetcherListener) null);
      // Undeclared exception!
      try { 
        fBCachedFetcher0.last();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.firebirdsql.jdbc.FBCachedFetcher", e);
      }
  }

  /**
  //Test case number: 49
  /*Coverage entropy=0.3333333333333333
  */
  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      isc_stmt_handle_impl isc_stmt_handle_impl0 = new isc_stmt_handle_impl();
      FBCachedFetcher fBCachedFetcher0 = null;
      try {
        fBCachedFetcher0 = new FBCachedFetcher((GDSHelper) null, 73, 73, isc_stmt_handle_impl0, (FBObjectListener.FetcherListener) null, false);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.firebirdsql.jdbc.FBCachedFetcher", e);
      }
  }

  /**
  //Test case number: 50
  /*Coverage entropy=1.5935041414150646
  */
  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      LinkedList<byte[][]> linkedList0 = new LinkedList<byte[][]>();
      FBCachedFetcher fBCachedFetcher0 = new FBCachedFetcher(linkedList0, (FBObjectListener.FetcherListener) null);
      boolean boolean0 = fBCachedFetcher0.last();
      assertFalse(boolean0);
      assertEquals(0, fBCachedFetcher0.getRowNum());
  }

  /**
  //Test case number: 51
  /*Coverage entropy=0.42857142857142855
  */
  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      LinkedList<byte[][]> linkedList0 = new LinkedList<byte[][]>();
      FBCachedFetcher fBCachedFetcher0 = new FBCachedFetcher(linkedList0, (FBObjectListener.FetcherListener) null);
      boolean boolean0 = fBCachedFetcher0.isBeforeFirst();
      assertFalse(boolean0);
      assertEquals(0, fBCachedFetcher0.getRowNum());
  }

  /**
  //Test case number: 52
  /*Coverage entropy=0.4444444444444445
  */
  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      LinkedList<byte[][]> linkedList0 = new LinkedList<byte[][]>();
      FBCachedFetcher fBCachedFetcher0 = new FBCachedFetcher(linkedList0, (FBObjectListener.FetcherListener) null);
      boolean boolean0 = fBCachedFetcher0.first();
      assertFalse(boolean0);
      assertFalse(fBCachedFetcher0.isFirst());
  }

  /**
  //Test case number: 53
  /*Coverage entropy=1.159813847226612
  */
  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      LinkedList<byte[][]> linkedList0 = new LinkedList<byte[][]>();
      FBCachedFetcher fBCachedFetcher0 = new FBCachedFetcher(linkedList0, (FBObjectListener.FetcherListener) null);
      assertTrue(fBCachedFetcher0.isEmpty());
      
      fBCachedFetcher0.afterLast();
      assertTrue(fBCachedFetcher0.isLast());
  }

  /**
  //Test case number: 54
  /*Coverage entropy=0.4
  */
  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      LinkedList<byte[][]> linkedList0 = new LinkedList<byte[][]>();
      FBCachedFetcher fBCachedFetcher0 = new FBCachedFetcher(linkedList0, (FBObjectListener.FetcherListener) null);
      // Undeclared exception!
      try { 
        fBCachedFetcher0.deleteRow();
        fail("Expecting exception: NegativeArraySizeException");
      
      } catch(NegativeArraySizeException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.firebirdsql.jdbc.FBCachedFetcher", e);
      }
  }
}
