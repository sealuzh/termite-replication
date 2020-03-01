/*
 * This file was automatically generated by EvoSuite
 * Thu Dec 05 08:29:06 GMT 2019
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
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class ForeignKeyConstraint_ESTest extends ForeignKeyConstraint_ESTest_scaffolding {

  /**
  //Test case number: 0
  /*Coverage entropy=1.5271837172395382
  */
  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      ForeignKeyConstraint foreignKeyConstraint0 = new ForeignKeyConstraint((Table) null, (String) null, 56, 56);
      foreignKeyConstraint0.isReal();
      LinkedList<TableColumn> linkedList0 = new LinkedList<TableColumn>();
      TableColumnMeta tableColumnMeta0 = mock(TableColumnMeta.class, new ViolatedAssumptionAnswer());
      doReturn("SQLERROR").when(tableColumnMeta0).getComments();
      doReturn("").when(tableColumnMeta0).getDefaultValue();
      doReturn(56).when(tableColumnMeta0).getDigits();
      doReturn("").when(tableColumnMeta0).getId();
      doReturn("").when(tableColumnMeta0).getName();
      doReturn(138).when(tableColumnMeta0).getSize();
      doReturn("SQLERROR").when(tableColumnMeta0).getType();
      doReturn(true).when(tableColumnMeta0).isAutoUpdated();
      doReturn(true).when(tableColumnMeta0).isNullable();
      TableColumn tableColumn0 = new TableColumn((Table) null, tableColumnMeta0);
      linkedList0.add(tableColumn0);
      String string0 = ForeignKeyConstraint.toString((List<TableColumn>) linkedList0);
      assertEquals("", string0);
  }

  /**
  //Test case number: 1
  /*Coverage entropy=1.5271837172395382
  */
  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      ForeignKeyConstraint foreignKeyConstraint0 = new ForeignKeyConstraint((Table) null, (String) null, 56, 56);
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
      linkedList0.add(tableColumn0);
      String string0 = ForeignKeyConstraint.toString((List<TableColumn>) linkedList0);
      assertNull(string0);
  }

  /**
  //Test case number: 2
  /*Coverage entropy=1.2961346570528898
  */
  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      ForeignKeyConstraint foreignKeyConstraint0 = new ForeignKeyConstraint((Table) null, "sc?wN&LoK8akJ=iSk", 2, 3);
      String string0 = foreignKeyConstraint0.getDeleteRuleName();
      assertEquals("Restrict delete", string0);
      assertEquals(2, foreignKeyConstraint0.getUpdateRule());
  }

  /**
  //Test case number: 3
  /*Coverage entropy=1.830738805564335
  */
  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      ForeignKeyConstraint foreignKeyConstraint0 = new ForeignKeyConstraint((Table) null, "", 0, 0);
      boolean boolean0 = foreignKeyConstraint0.isReal();
      assertTrue(boolean0);
      
      int int0 = foreignKeyConstraint0.getUpdateRule();
      assertEquals(0, int0);
      
      foreignKeyConstraint0.getChildColumns();
      assertEquals(0, foreignKeyConstraint0.getDeleteRule());
  }

  /**
  //Test case number: 4
  /*Coverage entropy=1.2407560846182575
  */
  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      ForeignKeyConstraint foreignKeyConstraint0 = new ForeignKeyConstraint((Table) null, (String) null, 0, 0);
      String string0 = foreignKeyConstraint0.getDeleteRuleName();
      assertEquals("Cascade on delete", string0);
      
      int int0 = foreignKeyConstraint0.getDeleteRule();
      assertEquals(0, foreignKeyConstraint0.getUpdateRule());
      assertEquals(0, int0);
  }

  /**
  //Test case number: 5
  /*Coverage entropy=0.45454545454545453
  */
  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      ForeignKeyConstraint foreignKeyConstraint0 = new ForeignKeyConstraint((Table) null, "Oq", 0, 0);
      String string0 = foreignKeyConstraint0.getDeleteRuleName();
      assertEquals("Cascade on delete", string0);
      
      String string1 = foreignKeyConstraint0.getDeleteRuleAlias();
      assertEquals("C", string1);
      assertEquals(0, foreignKeyConstraint0.getUpdateRule());
  }

  /**
  //Test case number: 6
  /*Coverage entropy=1.5981863871455344
  */
  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      ForeignKeyConstraint foreignKeyConstraint0 = new ForeignKeyConstraint((Table) null, "iu%&", 3, 3);
      boolean boolean0 = foreignKeyConstraint0.isReal();
      assertTrue(boolean0);
      
      String string0 = foreignKeyConstraint0.getDeleteRuleAlias();
      assertEquals(3, foreignKeyConstraint0.getUpdateRule());
      assertEquals("R", string0);
  }

  /**
  //Test case number: 7
  /*Coverage entropy=0.3333333333333333
  */
  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
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
  //Test case number: 8
  /*Coverage entropy=1.2961346570528898
  */
  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      ForeignKeyConstraint foreignKeyConstraint0 = new ForeignKeyConstraint((Table) null, "", 3, 3);
      String string0 = foreignKeyConstraint0.getDeleteRuleDescription();
      assertEquals(3, foreignKeyConstraint0.getUpdateRule());
      assertEquals("Restrict delete:\n Parent cannot be deleted if children exist", string0);
  }

  /**
  //Test case number: 9
  /*Coverage entropy=0.4
  */
  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      ForeignKeyConstraint foreignKeyConstraint0 = new ForeignKeyConstraint((Table) null, "", 35, 35);
      foreignKeyConstraint0.getChildTable();
      assertEquals(35, foreignKeyConstraint0.getDeleteRule());
      assertEquals(35, foreignKeyConstraint0.getUpdateRule());
  }

  /**
  //Test case number: 10
  /*Coverage entropy=0.42857142857142855
  */
  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      ForeignKeyConstraint foreignKeyConstraint0 = new ForeignKeyConstraint((Table) null, "C0", 2, 2);
      String string0 = foreignKeyConstraint0.getDeleteRuleAlias();
      assertEquals(2, foreignKeyConstraint0.getUpdateRule());
      assertEquals("N", string0);
  }

  /**
  //Test case number: 11
  /*Coverage entropy=1.830738805564335
  */
  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      ForeignKeyConstraint foreignKeyConstraint0 = new ForeignKeyConstraint((Table) null, "C0", 2, 2);
      boolean boolean0 = foreignKeyConstraint0.isImplied();
      boolean boolean1 = foreignKeyConstraint0.isNullOnDelete();
      assertFalse(boolean1 == boolean0);
      assertEquals(2, foreignKeyConstraint0.getUpdateRule());
      assertTrue(boolean1);
  }

  /**
  //Test case number: 12
  /*Coverage entropy=0.42857142857142855
  */
  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      ForeignKeyConstraint foreignKeyConstraint0 = new ForeignKeyConstraint((Table) null, "C0", 2, 2);
      String string0 = foreignKeyConstraint0.getDeleteRuleDescription();
      assertEquals(2, foreignKeyConstraint0.getUpdateRule());
      assertEquals("Null on delete:\n Foreign key to parent set to NULL when parent deleted", string0);
  }

  /**
  //Test case number: 13
  /*Coverage entropy=2.0800261477282183
  */
  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      ForeignKeyConstraint foreignKeyConstraint0 = new ForeignKeyConstraint((Table) null, (String) null, 0, 0);
      foreignKeyConstraint0.isNullOnDelete();
      boolean boolean0 = foreignKeyConstraint0.isCascadeOnDelete();
      boolean boolean1 = foreignKeyConstraint0.isNullOnDelete();
      assertFalse(boolean1 == boolean0);
      
      foreignKeyConstraint0.getName();
      assertEquals(0, foreignKeyConstraint0.getUpdateRule());
  }

  /**
  //Test case number: 14
  /*Coverage entropy=1.5179872908529677
  */
  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      ForeignKeyConstraint foreignKeyConstraint0 = new ForeignKeyConstraint((Table) null, "", 1, 1);
      String string0 = foreignKeyConstraint0.getDeleteRuleAlias();
      assertEquals("R", string0);
      
      int int0 = foreignKeyConstraint0.getUpdateRule();
      assertEquals(1, int0);
  }

  /**
  //Test case number: 15
  /*Coverage entropy=0.42857142857142855
  */
  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      ForeignKeyConstraint foreignKeyConstraint0 = new ForeignKeyConstraint((Table) null, "", 1, 1);
      String string0 = foreignKeyConstraint0.getDeleteRuleDescription();
      assertEquals("Restrict delete:\n Parent cannot be deleted if children exist", string0);
      assertEquals(1, foreignKeyConstraint0.getUpdateRule());
  }

  /**
  //Test case number: 16
  /*Coverage entropy=0.47619047619047616
  */
  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      ForeignKeyConstraint foreignKeyConstraint0 = new ForeignKeyConstraint((Table) null, (String) null, 0, 0);
      boolean boolean0 = foreignKeyConstraint0.isRestrictDelete();
      boolean boolean1 = foreignKeyConstraint0.isCascadeOnDelete();
      assertTrue(boolean1);
      
      boolean boolean2 = foreignKeyConstraint0.isNullOnDelete();
      assertTrue(boolean2 == boolean0);
      
      String string0 = foreignKeyConstraint0.getDeleteRuleDescription();
      assertEquals("Cascade on delete:\n Deletion of parent deletes child", string0);
      assertEquals(0, foreignKeyConstraint0.getUpdateRule());
  }

  /**
  //Test case number: 17
  /*Coverage entropy=0.42857142857142855
  */
  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      ForeignKeyConstraint foreignKeyConstraint0 = new ForeignKeyConstraint((Table) null, "CURRENT_TIME", (-10), (-10));
      foreignKeyConstraint0.getDeleteRuleDescription();
      assertEquals((-10), foreignKeyConstraint0.getUpdateRule());
      assertEquals((-10), foreignKeyConstraint0.getDeleteRule());
  }

  /**
  //Test case number: 18
  /*Coverage entropy=0.42857142857142855
  */
  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      ForeignKeyConstraint foreignKeyConstraint0 = new ForeignKeyConstraint((Table) null, "Oq", 2, 2);
      String string0 = foreignKeyConstraint0.getDeleteRuleName();
      assertEquals(2, foreignKeyConstraint0.getUpdateRule());
      assertEquals("Null on delete", string0);
  }

  /**
  //Test case number: 19
  /*Coverage entropy=1.4942662253853725
  */
  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      ForeignKeyConstraint foreignKeyConstraint0 = new ForeignKeyConstraint((Table) null, "Restrict delete:\n Parent cannot be deleted if children exist", 66, 66);
      boolean boolean0 = foreignKeyConstraint0.isRestrictDelete();
      assertFalse(boolean0);
      
      int int0 = foreignKeyConstraint0.getDeleteRule();
      assertEquals(66, foreignKeyConstraint0.getUpdateRule());
      assertEquals(66, int0);
  }

  /**
  //Test case number: 20
  /*Coverage entropy=1.1217186091313738
  */
  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      ForeignKeyConstraint foreignKeyConstraint0 = new ForeignKeyConstraint((Table) null, "({mlgj`O):g!P", (-911), (-911));
      ForeignKeyConstraint foreignKeyConstraint1 = new ForeignKeyConstraint((Table) null, "({mlgj`O):g!P", (-911), (-911));
      int int0 = foreignKeyConstraint0.getDeleteRule();
      assertEquals((-911), int0);
      assertEquals((-911), foreignKeyConstraint0.getUpdateRule());
  }

  /**
  //Test case number: 21
  /*Coverage entropy=0.42857142857142855
  */
  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      ForeignKeyConstraint foreignKeyConstraint0 = new ForeignKeyConstraint((Table) null, (String) null, 1577, 1577);
      boolean boolean0 = foreignKeyConstraint0.isNullOnDelete();
      assertEquals(1577, foreignKeyConstraint0.getDeleteRule());
      assertEquals(1577, foreignKeyConstraint0.getUpdateRule());
      assertFalse(boolean0);
  }

  /**
  //Test case number: 22
  /*Coverage entropy=0.0
  */
  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      ForeignKeyConstraint foreignKeyConstraint0 = null;
      try {
        foreignKeyConstraint0 = new ForeignKeyConstraint((TableColumn) null, (TableColumn) null, (-546), (-546));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("net.sourceforge.schemaspy.model.ForeignKeyConstraint", e);
      }
  }

  /**
  //Test case number: 23
  /*Coverage entropy=1.5271837172395382
  */
  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      ForeignKeyConstraint foreignKeyConstraint0 = new ForeignKeyConstraint((Table) null, "RD1~*NZzjJAI^n", 4723, 4723);
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
  //Test case number: 24
  /*Coverage entropy=1.5531577432135641
  */
  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      ForeignKeyConstraint foreignKeyConstraint0 = new ForeignKeyConstraint((Table) null, "", 2, 3);
      boolean boolean0 = foreignKeyConstraint0.isRestrictDelete();
      boolean boolean1 = foreignKeyConstraint0.isCascadeOnDelete();
      assertFalse(boolean1 == boolean0);
      assertEquals(2, foreignKeyConstraint0.getUpdateRule());
      assertFalse(boolean1);
  }

  /**
  //Test case number: 25
  /*Coverage entropy=1.5271837172395382
  */
  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      ForeignKeyConstraint foreignKeyConstraint0 = new ForeignKeyConstraint((Table) null, "]c", (-3), (-3));
      boolean boolean0 = foreignKeyConstraint0.isCascadeOnDelete();
      assertEquals((-3), foreignKeyConstraint0.getUpdateRule());
      assertFalse(boolean0);
      assertEquals((-3), foreignKeyConstraint0.getDeleteRule());
  }

  /**
  //Test case number: 26
  /*Coverage entropy=0.42857142857142855
  */
  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      ForeignKeyConstraint foreignKeyConstraint0 = new ForeignKeyConstraint((Table) null, "C0", 2, 2);
      boolean boolean0 = foreignKeyConstraint0.isCascadeOnDelete();
      assertEquals(2, foreignKeyConstraint0.getUpdateRule());
      assertFalse(boolean0);
      assertEquals("N", foreignKeyConstraint0.getDeleteRuleAlias());
  }

  /**
  //Test case number: 27
  /*Coverage entropy=2.053882356878545
  */
  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
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
  //Test case number: 28
  /*Coverage entropy=0.42857142857142855
  */
  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      ForeignKeyConstraint foreignKeyConstraint0 = new ForeignKeyConstraint((Table) null, "C0", 1, 1);
      String string0 = foreignKeyConstraint0.getDeleteRuleName();
      assertEquals(1, foreignKeyConstraint0.getUpdateRule());
      assertEquals("Restrict delete", string0);
  }

  /**
  //Test case number: 29
  /*Coverage entropy=0.4
  */
  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      ForeignKeyConstraint foreignKeyConstraint0 = new ForeignKeyConstraint((Table) null, "Qv-^<dxz|R(N76", (-902), (-902));
      int int0 = foreignKeyConstraint0.getUpdateRule();
      assertEquals((-902), foreignKeyConstraint0.getDeleteRule());
      assertEquals((-902), int0);
  }

  /**
  //Test case number: 30
  /*Coverage entropy=0.3333333333333333
  */
  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      LinkedList<TableColumn> linkedList0 = new LinkedList<TableColumn>();
      String string0 = ForeignKeyConstraint.toString((List<TableColumn>) linkedList0);
      assertNotNull(string0);
  }

  /**
  //Test case number: 31
  /*Coverage entropy=1.543056733112554
  */
  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      ForeignKeyConstraint foreignKeyConstraint0 = new ForeignKeyConstraint((Table) null, "", 1529, 1529);
      foreignKeyConstraint0.getName();
      foreignKeyConstraint0.getDeleteRuleAlias();
      assertEquals(1529, foreignKeyConstraint0.getDeleteRule());
      assertEquals(1529, foreignKeyConstraint0.getUpdateRule());
  }

  /**
  //Test case number: 32
  /*Coverage entropy=1.4942662253853725
  */
  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      ForeignKeyConstraint foreignKeyConstraint0 = new ForeignKeyConstraint((Table) null, "Q4^dz|R(7", (-857), (-857));
      ForeignKeyConstraint foreignKeyConstraint1 = new ForeignKeyConstraint((Table) null, "wFuZaC~z(SMW", (-857), (-857));
      int int0 = foreignKeyConstraint0.compareTo(foreignKeyConstraint1);
      assertEquals((-857), foreignKeyConstraint1.getDeleteRule());
      assertEquals((-857), foreignKeyConstraint1.getUpdateRule());
      assertEquals((-6), int0);
  }

  /**
  //Test case number: 33
  /*Coverage entropy=0.45454545454545453
  */
  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      ForeignKeyConstraint foreignKeyConstraint0 = new ForeignKeyConstraint((Table) null, "Qv-^<dxz|R(N76", (-902), (-902));
      ForeignKeyConstraint foreignKeyConstraint1 = new ForeignKeyConstraint((Table) null, "fgzw8Ks!\":O$j", (-902), (-902));
      int int0 = foreignKeyConstraint0.compareTo(foreignKeyConstraint1);
      assertEquals(11, int0);
      assertEquals((-902), foreignKeyConstraint1.getDeleteRule());
      assertEquals((-902), foreignKeyConstraint1.getUpdateRule());
  }

  /**
  //Test case number: 34
  /*Coverage entropy=1.1546856420984069
  */
  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      ForeignKeyConstraint foreignKeyConstraint0 = new ForeignKeyConstraint((Table) null, "Q4^dz|R(7", (-857), (-857));
      ForeignKeyConstraint foreignKeyConstraint1 = new ForeignKeyConstraint((Table) null, "Q4^dz|R(7", (-857), (-857));
      // Undeclared exception!
      try { 
        foreignKeyConstraint1.compareTo(foreignKeyConstraint0);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 0, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  /**
  //Test case number: 35
  /*Coverage entropy=0.4
  */
  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      ForeignKeyConstraint foreignKeyConstraint0 = new ForeignKeyConstraint((Table) null, "c,n?)A8(<19!DfLAo", (-876), (-876));
      int int0 = foreignKeyConstraint0.compareTo(foreignKeyConstraint0);
      assertEquals(0, int0);
      assertEquals((-876), foreignKeyConstraint0.getUpdateRule());
      assertEquals((-876), foreignKeyConstraint0.getDeleteRule());
  }

  /**
  //Test case number: 36
  /*Coverage entropy=0.4
  */
  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      ForeignKeyConstraint foreignKeyConstraint0 = new ForeignKeyConstraint((Table) null, "e#J_(2sA${C!MS3hL", 1529, 1529);
      foreignKeyConstraint0.getName();
      assertEquals(1529, foreignKeyConstraint0.getDeleteRule());
      assertEquals(1529, foreignKeyConstraint0.getUpdateRule());
  }

  /**
  //Test case number: 37
  /*Coverage entropy=0.42857142857142855
  */
  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      ForeignKeyConstraint foreignKeyConstraint0 = new ForeignKeyConstraint((Table) null, "Qv-^<dxz|R(N76", 1529, 1529);
      foreignKeyConstraint0.getDeleteRuleName();
      assertEquals(1529, foreignKeyConstraint0.getUpdateRule());
      assertEquals(1529, foreignKeyConstraint0.getDeleteRule());
  }

  /**
  //Test case number: 38
  /*Coverage entropy=1.0931471805599453
  */
  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      ForeignKeyConstraint foreignKeyConstraint0 = new ForeignKeyConstraint((Table) null, (String) null, 3281, 3281);
      foreignKeyConstraint0.addParentColumn((TableColumn) null);
      assertEquals(3281, foreignKeyConstraint0.getDeleteRule());
      assertEquals(3281, foreignKeyConstraint0.getUpdateRule());
  }

  /**
  //Test case number: 39
  /*Coverage entropy=1.0931471805599453
  */
  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      ForeignKeyConstraint foreignKeyConstraint0 = new ForeignKeyConstraint((Table) null, "Qv-^<dxz|R(N76", 1529, 1529);
      foreignKeyConstraint0.addChildColumn((TableColumn) null);
      assertEquals(1529, foreignKeyConstraint0.getUpdateRule());
      assertEquals(1529, foreignKeyConstraint0.getDeleteRule());
  }

  /**
  //Test case number: 40
  /*Coverage entropy=0.4444444444444445
  */
  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
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
  //Test case number: 41
  /*Coverage entropy=1.4841652152843623
  */
  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      ForeignKeyConstraint foreignKeyConstraint0 = new ForeignKeyConstraint((Table) null, "R![", 1, 1);
      boolean boolean0 = foreignKeyConstraint0.isRestrictDelete();
      assertTrue(boolean0);
      assertEquals(1, foreignKeyConstraint0.getUpdateRule());
  }

  /**
  //Test case number: 42
  /*Coverage entropy=0.42857142857142855
  */
  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      ForeignKeyConstraint foreignKeyConstraint0 = new ForeignKeyConstraint((Table) null, "", (-228), (-228));
      foreignKeyConstraint0.getDeleteRuleAlias();
      assertEquals((-228), foreignKeyConstraint0.getUpdateRule());
      assertEquals((-228), foreignKeyConstraint0.getDeleteRule());
  }

  /**
  //Test case number: 43
  /*Coverage entropy=0.4
  */
  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      ForeignKeyConstraint foreignKeyConstraint0 = new ForeignKeyConstraint((Table) null, "Qv-^<dxz|R(N76", 1, 1);
      foreignKeyConstraint0.getParentTable();
      assertEquals(1, foreignKeyConstraint0.getUpdateRule());
      assertEquals("Restrict delete", foreignKeyConstraint0.getDeleteRuleName());
  }

  /**
  //Test case number: 44
  /*Coverage entropy=0.4
  */
  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      ForeignKeyConstraint foreignKeyConstraint0 = new ForeignKeyConstraint((Table) null, "W-", 184, 184);
      foreignKeyConstraint0.getParentColumns();
      assertEquals(184, foreignKeyConstraint0.getDeleteRule());
      assertEquals(184, foreignKeyConstraint0.getUpdateRule());
  }

  /**
  //Test case number: 45
  /*Coverage entropy=0.4
  */
  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      ForeignKeyConstraint foreignKeyConstraint0 = new ForeignKeyConstraint((Table) null, "Qv-^<dxz|R(N76", 1529, 1529);
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
}
