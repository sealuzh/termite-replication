/*
 * This file was automatically generated by EvoSuite
 * Thu Dec 05 00:31:52 GMT 2019
 */

package net.sourceforge.schemaspy.model;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.LinkedList;
import java.util.List;
import net.sourceforge.schemaspy.model.ForeignKeyConstraint;
import net.sourceforge.schemaspy.model.Table;
import net.sourceforge.schemaspy.model.TableColumn;
import net.sourceforge.schemaspy.model.xml.TableColumnMeta;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.System;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class ForeignKeyConstraint_ESTest extends ForeignKeyConstraint_ESTest_scaffolding {

  /**
  //Test case number: 0
  /*Coverage entropy=1.830738805564335
  */
  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      ForeignKeyConstraint foreignKeyConstraint0 = new ForeignKeyConstraint((Table) null, "]dG", (-14), (-14));
      foreignKeyConstraint0.isReal();
      LinkedList<TableColumn> linkedList0 = new LinkedList<TableColumn>();
      TableColumnMeta tableColumnMeta0 = mock(TableColumnMeta.class, new ViolatedAssumptionAnswer());
      doReturn("]dG").when(tableColumnMeta0).getComments();
      doReturn("]dG").when(tableColumnMeta0).getDefaultValue();
      doReturn((-14)).when(tableColumnMeta0).getDigits();
      doReturn("]dG").when(tableColumnMeta0).getId();
      doReturn("").when(tableColumnMeta0).getName();
      doReturn((-3)).when(tableColumnMeta0).getSize();
      doReturn("]dG").when(tableColumnMeta0).getType();
      doReturn(true).when(tableColumnMeta0).isAutoUpdated();
      doReturn(true).when(tableColumnMeta0).isNullable();
      TableColumn tableColumn0 = new TableColumn((Table) null, tableColumnMeta0);
      linkedList0.offerLast(tableColumn0);
      ForeignKeyConstraint.toString((List<TableColumn>) linkedList0);
      System.setCurrentTimeMillis((-3));
      // Undeclared exception!
      try { 
        foreignKeyConstraint0.toString();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("net.sourceforge.schemaspy.model.ForeignKeyConstraint", e);
      }
  }

  /**
  //Test case number: 1
  /*Coverage entropy=1.5271837172395382
  */
  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      ForeignKeyConstraint foreignKeyConstraint0 = new ForeignKeyConstraint((Table) null, "]G", (-14), (-14));
      foreignKeyConstraint0.isReal();
      LinkedList<TableColumn> linkedList0 = new LinkedList<TableColumn>();
      TableColumnMeta tableColumnMeta0 = mock(TableColumnMeta.class, new ViolatedAssumptionAnswer());
      doReturn((String) null).when(tableColumnMeta0).getComments();
      doReturn((String) null).when(tableColumnMeta0).getDefaultValue();
      doReturn(0).when(tableColumnMeta0).getDigits();
      doReturn((String) null).when(tableColumnMeta0).getId();
      doReturn((String) null).when(tableColumnMeta0).getName();
      doReturn(0).when(tableColumnMeta0).getSize();
      doReturn((String) null).when(tableColumnMeta0).getType();
      doReturn(false).when(tableColumnMeta0).isAutoUpdated();
      doReturn(false).when(tableColumnMeta0).isNullable();
      TableColumn tableColumn0 = new TableColumn((Table) null, tableColumnMeta0);
      linkedList0.offerLast(tableColumn0);
      String string0 = ForeignKeyConstraint.toString((List<TableColumn>) linkedList0);
      assertNull(string0);
  }

  /**
  //Test case number: 2
  /*Coverage entropy=1.0931471805599453
  */
  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      ForeignKeyConstraint foreignKeyConstraint0 = new ForeignKeyConstraint((Table) null, ":5JmphrF8s", 0, 0);
      int int0 = foreignKeyConstraint0.getDeleteRule();
      assertEquals(0, foreignKeyConstraint0.getUpdateRule());
      assertEquals(0, int0);
  }

  /**
  //Test case number: 3
  /*Coverage entropy=1.4682921994113465
  */
  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      ForeignKeyConstraint foreignKeyConstraint0 = new ForeignKeyConstraint((Table) null, "O", 2, 1);
      String string0 = foreignKeyConstraint0.getDeleteRuleDescription();
      assertEquals("Restrict delete:\n Parent cannot be deleted if children exist", string0);
      assertEquals(2, foreignKeyConstraint0.getUpdateRule());
  }

  /**
  //Test case number: 4
  /*Coverage entropy=1.7766234846545668
  */
  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      ForeignKeyConstraint foreignKeyConstraint0 = new ForeignKeyConstraint((Table) null, (String) null, 1, 1);
      foreignKeyConstraint0.getChildColumns();
      String string0 = foreignKeyConstraint0.getDeleteRuleAlias();
      assertEquals(1, foreignKeyConstraint0.getUpdateRule());
      assertEquals("R", string0);
  }

  /**
  //Test case number: 5
  /*Coverage entropy=0.42857142857142855
  */
  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      ForeignKeyConstraint foreignKeyConstraint0 = new ForeignKeyConstraint((Table) null, (String) null, 3, 3);
      String string0 = foreignKeyConstraint0.getDeleteRuleAlias();
      assertEquals(3, foreignKeyConstraint0.getUpdateRule());
      assertEquals("R", string0);
  }

  /**
  //Test case number: 6
  /*Coverage entropy=1.0931471805599453
  */
  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      ForeignKeyConstraint foreignKeyConstraint0 = new ForeignKeyConstraint((Table) null, "", 2, 2);
      foreignKeyConstraint0.getName();
      assertEquals(2, foreignKeyConstraint0.getUpdateRule());
      assertEquals("N", foreignKeyConstraint0.getDeleteRuleAlias());
  }

  /**
  //Test case number: 7
  /*Coverage entropy=1.0931471805599453
  */
  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      ForeignKeyConstraint foreignKeyConstraint0 = new ForeignKeyConstraint((Table) null, (String) null, 2, 2);
      foreignKeyConstraint0.getName();
      assertEquals(2, foreignKeyConstraint0.getUpdateRule());
      assertTrue(foreignKeyConstraint0.isNullOnDelete());
  }

  /**
  //Test case number: 8
  /*Coverage entropy=0.42857142857142855
  */
  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      ForeignKeyConstraint foreignKeyConstraint0 = new ForeignKeyConstraint((Table) null, "net.sourceforge.schemaspy.model.LogicalRemoteTable", 0, 0);
      String string0 = foreignKeyConstraint0.getDeleteRuleName();
      assertEquals("Cascade on delete", string0);
      assertEquals(0, foreignKeyConstraint0.getUpdateRule());
  }

  /**
  //Test case number: 9
  /*Coverage entropy=1.0931471805599453
  */
  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      ForeignKeyConstraint foreignKeyConstraint0 = new ForeignKeyConstraint((Table) null, "G$+DU}", (-693), (-693));
      int int0 = foreignKeyConstraint0.getDeleteRule();
      assertEquals((-693), foreignKeyConstraint0.getUpdateRule());
      assertEquals((-693), int0);
  }

  /**
  //Test case number: 10
  /*Coverage entropy=1.5271837172395382
  */
  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      ForeignKeyConstraint foreignKeyConstraint0 = new ForeignKeyConstraint((Table) null, ":5JmphrF8s", 0, 0);
      boolean boolean0 = foreignKeyConstraint0.isCascadeOnDelete();
      assertTrue(boolean0);
      assertEquals(0, foreignKeyConstraint0.getUpdateRule());
  }

  /**
  //Test case number: 11
  /*Coverage entropy=1.0931471805599453
  */
  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      ForeignKeyConstraint foreignKeyConstraint0 = new ForeignKeyConstraint((Table) null, "#1Gzq;S", 2, 2);
      foreignKeyConstraint0.getChildTable();
      assertEquals(2, foreignKeyConstraint0.getUpdateRule());
      assertTrue(foreignKeyConstraint0.isNullOnDelete());
  }

  /**
  //Test case number: 12
  /*Coverage entropy=2.053882356878545
  */
  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      TableColumnMeta tableColumnMeta0 = mock(TableColumnMeta.class, new ViolatedAssumptionAnswer());
      doReturn((String) null).when(tableColumnMeta0).getComments();
      doReturn((String) null).when(tableColumnMeta0).getDefaultValue();
      doReturn(0).when(tableColumnMeta0).getDigits();
      doReturn((String) null).when(tableColumnMeta0).getId();
      doReturn((String) null).when(tableColumnMeta0).getName();
      doReturn(0).when(tableColumnMeta0).getSize();
      doReturn((String) null).when(tableColumnMeta0).getType();
      doReturn(false).when(tableColumnMeta0).isAutoUpdated();
      doReturn(false).when(tableColumnMeta0).isNullable();
      TableColumn tableColumn0 = new TableColumn((Table) null, tableColumnMeta0);
      ForeignKeyConstraint foreignKeyConstraint0 = null;
      try {
        foreignKeyConstraint0 = new ForeignKeyConstraint((TableColumn) null, tableColumn0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("net.sourceforge.schemaspy.model.TableColumn", e);
      }
  }

  /**
  //Test case number: 13
  /*Coverage entropy=1.4841652152843623
  */
  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      ForeignKeyConstraint foreignKeyConstraint0 = new ForeignKeyConstraint((Table) null, "#1GzqS", 1, 1);
      boolean boolean0 = foreignKeyConstraint0.isRestrictDelete();
      assertEquals(1, foreignKeyConstraint0.getUpdateRule());
      assertTrue(boolean0);
  }

  /**
  //Test case number: 14
  /*Coverage entropy=1.5981863871455344
  */
  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      ForeignKeyConstraint foreignKeyConstraint0 = new ForeignKeyConstraint((Table) null, "N", 3, 3);
      boolean boolean0 = foreignKeyConstraint0.isReal();
      assertTrue(boolean0);
      
      String string0 = foreignKeyConstraint0.getDeleteRuleName();
      assertEquals("Restrict delete", string0);
      assertEquals(3, foreignKeyConstraint0.getUpdateRule());
  }

  /**
  //Test case number: 15
  /*Coverage entropy=1.5271837172395382
  */
  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      ForeignKeyConstraint foreignKeyConstraint0 = new ForeignKeyConstraint((Table) null, "?", 3, 3);
      boolean boolean0 = foreignKeyConstraint0.isRestrictDelete();
      assertTrue(boolean0);
      assertEquals(3, foreignKeyConstraint0.getUpdateRule());
  }

  /**
  //Test case number: 16
  /*Coverage entropy=0.42857142857142855
  */
  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      ForeignKeyConstraint foreignKeyConstraint0 = new ForeignKeyConstraint((Table) null, "|;5)SbT&IY.6jKX", 849, 3);
      String string0 = foreignKeyConstraint0.getDeleteRuleDescription();
      assertEquals("Restrict delete:\n Parent cannot be deleted if children exist", string0);
      assertEquals(849, foreignKeyConstraint0.getUpdateRule());
  }

  /**
  //Test case number: 17
  /*Coverage entropy=0.42857142857142855
  */
  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      ForeignKeyConstraint foreignKeyConstraint0 = new ForeignKeyConstraint((Table) null, "]Kd)1,9_<(", 1, 1);
      String string0 = foreignKeyConstraint0.getDeleteRuleName();
      assertEquals(1, foreignKeyConstraint0.getUpdateRule());
      assertEquals("Restrict delete", string0);
  }

  /**
  //Test case number: 18
  /*Coverage entropy=1.0931471805599453
  */
  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      ForeignKeyConstraint foreignKeyConstraint0 = new ForeignKeyConstraint((Table) null, "", 2, 2);
      int int0 = foreignKeyConstraint0.getDeleteRule();
      assertEquals(2, foreignKeyConstraint0.getUpdateRule());
      assertEquals(2, int0);
  }

  /**
  //Test case number: 19
  /*Coverage entropy=1.0931471805599453
  */
  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      ForeignKeyConstraint foreignKeyConstraint0 = new ForeignKeyConstraint((Table) null, "iXP Pi", 0, 0);
      int int0 = foreignKeyConstraint0.getUpdateRule();
      assertEquals(0, int0);
      assertEquals(0, foreignKeyConstraint0.getDeleteRule());
  }

  /**
  //Test case number: 20
  /*Coverage entropy=0.42857142857142855
  */
  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      ForeignKeyConstraint foreignKeyConstraint0 = new ForeignKeyConstraint((Table) null, "", 0, 0);
      String string0 = foreignKeyConstraint0.getDeleteRuleAlias();
      assertEquals("C", string0);
      assertEquals(0, foreignKeyConstraint0.getUpdateRule());
  }

  /**
  //Test case number: 21
  /*Coverage entropy=0.42857142857142855
  */
  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      ForeignKeyConstraint foreignKeyConstraint0 = new ForeignKeyConstraint((Table) null, "-o", 2, 2);
      String string0 = foreignKeyConstraint0.getDeleteRuleName();
      assertEquals("Null on delete", string0);
      assertEquals(2, foreignKeyConstraint0.getUpdateRule());
  }

  /**
  //Test case number: 22
  /*Coverage entropy=1.5271837172395382
  */
  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      ForeignKeyConstraint foreignKeyConstraint0 = new ForeignKeyConstraint((Table) null, "", (-3341), (-3341));
      boolean boolean0 = foreignKeyConstraint0.isCascadeOnDelete();
      assertFalse(boolean0);
      assertEquals((-3341), foreignKeyConstraint0.getDeleteRule());
      assertEquals((-3341), foreignKeyConstraint0.getUpdateRule());
  }

  /**
  //Test case number: 23
  /*Coverage entropy=1.4942662253853725
  */
  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      ForeignKeyConstraint foreignKeyConstraint0 = new ForeignKeyConstraint((Table) null, "G$+DU}", (-1069), (-1069));
      ForeignKeyConstraint foreignKeyConstraint1 = new ForeignKeyConstraint((Table) null, "", (-1069), (-1069));
      int int0 = foreignKeyConstraint0.compareTo(foreignKeyConstraint1);
      assertEquals((-1069), foreignKeyConstraint1.getDeleteRule());
      assertEquals((-1069), foreignKeyConstraint1.getUpdateRule());
      assertEquals(6, int0);
  }

  /**
  //Test case number: 24
  /*Coverage entropy=1.5271837172395382
  */
  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      ForeignKeyConstraint foreignKeyConstraint0 = new ForeignKeyConstraint((Table) null, "net.sourceforge.schemaspy.model.LogicalRemoteTable", 2, 2);
      // Undeclared exception!
      try { 
        foreignKeyConstraint0.compareTo((ForeignKeyConstraint) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("net.sourceforge.schemaspy.model.ForeignKeyConstraint", e);
      }
  }

  /**
  //Test case number: 25
  /*Coverage entropy=0.42857142857142855
  */
  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      ForeignKeyConstraint foreignKeyConstraint0 = new ForeignKeyConstraint((Table) null, (String) null, 191, 191);
      foreignKeyConstraint0.getDeleteRuleName();
      assertEquals(191, foreignKeyConstraint0.getUpdateRule());
      assertEquals(191, foreignKeyConstraint0.getDeleteRule());
  }

  /**
  //Test case number: 26
  /*Coverage entropy=0.42857142857142855
  */
  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      ForeignKeyConstraint foreignKeyConstraint0 = new ForeignKeyConstraint((Table) null, "_mr{3OMz6AqM2YD", 0, 0);
      String string0 = foreignKeyConstraint0.getDeleteRuleDescription();
      assertEquals(0, foreignKeyConstraint0.getUpdateRule());
      assertEquals("Cascade on delete:\n Deletion of parent deletes child", string0);
  }

  /**
  //Test case number: 27
  /*Coverage entropy=1.0931471805599453
  */
  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      ForeignKeyConstraint foreignKeyConstraint0 = new ForeignKeyConstraint((Table) null, "iXP Pi", (-13), (-13));
      int int0 = foreignKeyConstraint0.getUpdateRule();
      assertEquals((-13), foreignKeyConstraint0.getDeleteRule());
      assertEquals((-13), int0);
  }

  /**
  //Test case number: 28
  /*Coverage entropy=0.4
  */
  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      ForeignKeyConstraint foreignKeyConstraint0 = new ForeignKeyConstraint((Table) null, "(", 2, 2);
      boolean boolean0 = foreignKeyConstraint0.isImplied();
      assertEquals(2, foreignKeyConstraint0.getUpdateRule());
      assertFalse(boolean0);
      assertEquals("Null on delete:\n Foreign key to parent set to NULL when parent deleted", foreignKeyConstraint0.getDeleteRuleDescription());
  }

  /**
  //Test case number: 29
  /*Coverage entropy=0.42857142857142855
  */
  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      ForeignKeyConstraint foreignKeyConstraint0 = new ForeignKeyConstraint((Table) null, "-o", 2, 2);
      String string0 = foreignKeyConstraint0.getDeleteRuleAlias();
      assertEquals("N", string0);
      assertEquals(2, foreignKeyConstraint0.getUpdateRule());
  }

  /**
  //Test case number: 30
  /*Coverage entropy=0.42857142857142855
  */
  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      ForeignKeyConstraint foreignKeyConstraint0 = new ForeignKeyConstraint((Table) null, (String) null, 191, 191);
      foreignKeyConstraint0.getDeleteRuleAlias();
      assertEquals(191, foreignKeyConstraint0.getUpdateRule());
      assertEquals(191, foreignKeyConstraint0.getDeleteRule());
  }

  /**
  //Test case number: 31
  /*Coverage entropy=1.5271837172395382
  */
  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      ForeignKeyConstraint foreignKeyConstraint0 = new ForeignKeyConstraint((Table) null, "Q-", 2, 2);
      boolean boolean0 = foreignKeyConstraint0.isNullOnDelete();
      assertEquals(2, foreignKeyConstraint0.getUpdateRule());
      assertTrue(boolean0);
  }

  /**
  //Test case number: 32
  /*Coverage entropy=0.45454545454545453
  */
  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      ForeignKeyConstraint foreignKeyConstraint0 = new ForeignKeyConstraint((Table) null, "Null on delete:\n Foreign key to parent set to NULL when parent deleted", 2717, 2717);
      ForeignKeyConstraint foreignKeyConstraint1 = new ForeignKeyConstraint((Table) null, "", 2717, 2717);
      int int0 = foreignKeyConstraint1.compareTo(foreignKeyConstraint0);
      assertEquals(2717, foreignKeyConstraint1.getUpdateRule());
      assertEquals(2717, foreignKeyConstraint1.getDeleteRule());
      assertEquals((-70), int0);
  }

  /**
  //Test case number: 33
  /*Coverage entropy=1.1546856420984069
  */
  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      ForeignKeyConstraint foreignKeyConstraint0 = new ForeignKeyConstraint((Table) null, "-o", 2, 2);
      ForeignKeyConstraint foreignKeyConstraint1 = new ForeignKeyConstraint((Table) null, "-o", 2, 2);
      // Undeclared exception!
      try { 
        foreignKeyConstraint0.compareTo(foreignKeyConstraint1);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 0, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  /**
  //Test case number: 34
  /*Coverage entropy=0.4
  */
  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      ForeignKeyConstraint foreignKeyConstraint0 = new ForeignKeyConstraint((Table) null, "-o", 2, 2);
      int int0 = foreignKeyConstraint0.compareTo(foreignKeyConstraint0);
      assertEquals(2, foreignKeyConstraint0.getUpdateRule());
      assertEquals(0, int0);
      assertEquals("Null on delete:\n Foreign key to parent set to NULL when parent deleted", foreignKeyConstraint0.getDeleteRuleDescription());
  }

  /**
  //Test case number: 35
  /*Coverage entropy=0.4
  */
  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      ForeignKeyConstraint foreignKeyConstraint0 = new ForeignKeyConstraint((Table) null, "IacQ\"cE@A6Ea@i|,x8", 2, 2);
      int int0 = foreignKeyConstraint0.getUpdateRule();
      assertEquals(2, int0);
      assertTrue(foreignKeyConstraint0.isNullOnDelete());
  }

  /**
  //Test case number: 36
  /*Coverage entropy=1.4841652152843623
  */
  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      ForeignKeyConstraint foreignKeyConstraint0 = new ForeignKeyConstraint((Table) null, "&", 9, 9);
      boolean boolean0 = foreignKeyConstraint0.isRestrictDelete();
      assertEquals(9, foreignKeyConstraint0.getUpdateRule());
      assertEquals(9, foreignKeyConstraint0.getDeleteRule());
      assertFalse(boolean0);
  }

  /**
  //Test case number: 37
  /*Coverage entropy=0.4
  */
  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      ForeignKeyConstraint foreignKeyConstraint0 = new ForeignKeyConstraint((Table) null, "#1GzqS", 2, 2);
      foreignKeyConstraint0.getName();
      assertEquals("N", foreignKeyConstraint0.getDeleteRuleAlias());
      assertEquals(2, foreignKeyConstraint0.getUpdateRule());
  }

  /**
  //Test case number: 38
  /*Coverage entropy=1.5271837172395382
  */
  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      ForeignKeyConstraint foreignKeyConstraint0 = new ForeignKeyConstraint((Table) null, "8]9", (-12), (-12));
      boolean boolean0 = foreignKeyConstraint0.isNullOnDelete();
      assertEquals((-12), foreignKeyConstraint0.getDeleteRule());
      assertFalse(boolean0);
      assertEquals((-12), foreignKeyConstraint0.getUpdateRule());
  }

  /**
  //Test case number: 39
  /*Coverage entropy=0.42857142857142855
  */
  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      ForeignKeyConstraint foreignKeyConstraint0 = new ForeignKeyConstraint((Table) null, (String) null, 191, 191);
      boolean boolean0 = foreignKeyConstraint0.isNullOnDelete();
      assertFalse(boolean0);
      assertEquals(191, foreignKeyConstraint0.getUpdateRule());
      assertEquals(191, foreignKeyConstraint0.getDeleteRule());
  }

  /**
  //Test case number: 40
  /*Coverage entropy=0.4444444444444445
  */
  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      ForeignKeyConstraint foreignKeyConstraint0 = new ForeignKeyConstraint((Table) null, ")", 2, 2);
      boolean boolean0 = foreignKeyConstraint0.isRestrictDelete();
      assertEquals(2, foreignKeyConstraint0.getUpdateRule());
      assertFalse(boolean0);
      assertEquals("Null on delete:\n Foreign key to parent set to NULL when parent deleted", foreignKeyConstraint0.getDeleteRuleDescription());
  }

  /**
  //Test case number: 41
  /*Coverage entropy=0.42857142857142855
  */
  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      ForeignKeyConstraint foreignKeyConstraint0 = new ForeignKeyConstraint((Table) null, "#1GzqS", 33, 33);
      foreignKeyConstraint0.getDeleteRuleDescription();
      assertEquals(33, foreignKeyConstraint0.getDeleteRule());
      assertEquals(33, foreignKeyConstraint0.getUpdateRule());
  }

  /**
  //Test case number: 42
  /*Coverage entropy=0.42857142857142855
  */
  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      ForeignKeyConstraint foreignKeyConstraint0 = new ForeignKeyConstraint((Table) null, "#1GzqS", 2, 2);
      String string0 = foreignKeyConstraint0.getDeleteRuleDescription();
      assertEquals("Null on delete:\n Foreign key to parent set to NULL when parent deleted", string0);
      assertEquals(2, foreignKeyConstraint0.getUpdateRule());
  }

  /**
  //Test case number: 43
  /*Coverage entropy=0.42857142857142855
  */
  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      ForeignKeyConstraint foreignKeyConstraint0 = new ForeignKeyConstraint((Table) null, ")", 2, 2);
      boolean boolean0 = foreignKeyConstraint0.isCascadeOnDelete();
      assertEquals(2, foreignKeyConstraint0.getUpdateRule());
      assertEquals("Null on delete", foreignKeyConstraint0.getDeleteRuleName());
      assertFalse(boolean0);
  }

  /**
  //Test case number: 44
  /*Coverage entropy=0.3333333333333333
  */
  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      LinkedList<TableColumn> linkedList0 = new LinkedList<TableColumn>();
      linkedList0.add((TableColumn) null);
      // Undeclared exception!
      try { 
        ForeignKeyConstraint.toString((List<TableColumn>) linkedList0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("net.sourceforge.schemaspy.model.ForeignKeyConstraint", e);
      }
  }

  /**
  //Test case number: 45
  /*Coverage entropy=1.5271837172395382
  */
  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      ForeignKeyConstraint foreignKeyConstraint0 = new ForeignKeyConstraint((Table) null, "h=DsHM+l[!7o'y|", (-34), (-34));
      foreignKeyConstraint0.addChildColumn((TableColumn) null);
      boolean boolean0 = foreignKeyConstraint0.isReal();
      assertTrue(boolean0);
      assertEquals((-34), foreignKeyConstraint0.getDeleteRule());
      assertEquals((-34), foreignKeyConstraint0.getUpdateRule());
  }

  /**
  //Test case number: 46
  /*Coverage entropy=1.543056733112554
  */
  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      ForeignKeyConstraint foreignKeyConstraint0 = new ForeignKeyConstraint((Table) null, ",j", 2059, 2059);
      foreignKeyConstraint0.addParentColumn((TableColumn) null);
      foreignKeyConstraint0.getDeleteRuleAlias();
      assertEquals(2059, foreignKeyConstraint0.getUpdateRule());
      assertEquals(2059, foreignKeyConstraint0.getDeleteRule());
  }

  /**
  //Test case number: 47
  /*Coverage entropy=0.4
  */
  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      ForeignKeyConstraint foreignKeyConstraint0 = new ForeignKeyConstraint((Table) null, "k#1zqS", 2, 2);
      foreignKeyConstraint0.getParentColumns();
      assertEquals(2, foreignKeyConstraint0.getUpdateRule());
      assertTrue(foreignKeyConstraint0.isNullOnDelete());
  }

  /**
  //Test case number: 48
  /*Coverage entropy=0.4444444444444445
  */
  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      TableColumnMeta tableColumnMeta0 = mock(TableColumnMeta.class, new ViolatedAssumptionAnswer());
      doReturn((String) null).when(tableColumnMeta0).getComments();
      doReturn((String) null).when(tableColumnMeta0).getDefaultValue();
      doReturn(0).when(tableColumnMeta0).getDigits();
      doReturn((String) null).when(tableColumnMeta0).getId();
      doReturn((String) null).when(tableColumnMeta0).getName();
      doReturn(0).when(tableColumnMeta0).getSize();
      doReturn((String) null).when(tableColumnMeta0).getType();
      doReturn(false).when(tableColumnMeta0).isAutoUpdated();
      doReturn(false).when(tableColumnMeta0).isNullable();
      TableColumn tableColumn0 = new TableColumn((Table) null, tableColumnMeta0);
      ForeignKeyConstraint foreignKeyConstraint0 = null;
      try {
        foreignKeyConstraint0 = new ForeignKeyConstraint(tableColumn0, tableColumn0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("net.sourceforge.schemaspy.model.TableColumn", e);
      }
  }

  /**
  //Test case number: 49
  /*Coverage entropy=0.4
  */
  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      ForeignKeyConstraint foreignKeyConstraint0 = new ForeignKeyConstraint((Table) null, ")", 2, 2);
      foreignKeyConstraint0.getParentTable();
      assertEquals(2, foreignKeyConstraint0.getUpdateRule());
      assertTrue(foreignKeyConstraint0.isNullOnDelete());
  }

  /**
  //Test case number: 50
  /*Coverage entropy=0.0
  */
  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      ForeignKeyConstraint foreignKeyConstraint0 = null;
      try {
        foreignKeyConstraint0 = new ForeignKeyConstraint((TableColumn) null, (TableColumn) null, 2717, 2717);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("net.sourceforge.schemaspy.model.ForeignKeyConstraint", e);
      }
  }

  /**
  //Test case number: 51
  /*Coverage entropy=0.3333333333333333
  */
  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      LinkedList<TableColumn> linkedList0 = new LinkedList<TableColumn>();
      String string0 = ForeignKeyConstraint.toString((List<TableColumn>) linkedList0);
      assertNotNull(string0);
  }
}
