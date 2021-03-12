/*
 * This file was automatically generated by EvoSuite
 * Sat Nov 07 18:43:33 GMT 2020
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
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      ForeignKeyConstraint foreignKeyConstraint0 = new ForeignKeyConstraint((Table) null, "KGf)a", 43, 43);
      boolean boolean0 = foreignKeyConstraint0.isNullOnDelete();
      assertFalse(boolean0);
      assertEquals(43, foreignKeyConstraint0.getDeleteRule());
      assertEquals(43, foreignKeyConstraint0.getUpdateRule());
  }

  /**
  //Test case number: 1
  /*Coverage entropy=1.0397207708399179
  */
  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      ForeignKeyConstraint foreignKeyConstraint0 = new ForeignKeyConstraint((Table) null, (String) null, 74, 74);
      boolean boolean0 = foreignKeyConstraint0.isRestrictDelete();
      assertEquals(74, foreignKeyConstraint0.getDeleteRule());
      assertFalse(boolean0);
      assertEquals(74, foreignKeyConstraint0.getUpdateRule());
  }

  /**
  //Test case number: 2
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      ForeignKeyConstraint foreignKeyConstraint0 = new ForeignKeyConstraint((Table) null, "KGf)a", 25, 25);
      boolean boolean0 = foreignKeyConstraint0.isCascadeOnDelete();
      assertEquals(25, foreignKeyConstraint0.getDeleteRule());
      assertFalse(boolean0);
      assertEquals(25, foreignKeyConstraint0.getUpdateRule());
  }

  /**
  //Test case number: 3
  /*Coverage entropy=1.3862943611198906
  */
  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      ForeignKeyConstraint foreignKeyConstraint0 = new ForeignKeyConstraint((Table) null, ".SzQgD#zv*I&$Y'!K", (-3004), (-3004));
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
      foreignKeyConstraint0.addParentColumn(tableColumn0);
      List<TableColumn> list0 = foreignKeyConstraint0.getParentColumns();
      ForeignKeyConstraint.toString(list0);
      assertEquals((-3004), foreignKeyConstraint0.getUpdateRule());
      assertTrue(list0.contains(tableColumn0));
      assertEquals((-3004), foreignKeyConstraint0.getDeleteRule());
  }

  /**
  //Test case number: 4
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      ForeignKeyConstraint foreignKeyConstraint0 = new ForeignKeyConstraint((Table) null, "KGf)a", 0, 2);
      int int0 = foreignKeyConstraint0.getUpdateRule();
      assertEquals(0, int0);
      assertTrue(foreignKeyConstraint0.isNullOnDelete());
  }

  /**
  //Test case number: 5
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      ForeignKeyConstraint foreignKeyConstraint0 = new ForeignKeyConstraint((Table) null, "", (-2464), 114);
      int int0 = foreignKeyConstraint0.getUpdateRule();
      assertEquals(114, foreignKeyConstraint0.getDeleteRule());
      assertEquals((-2464), int0);
  }

  /**
  //Test case number: 6
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      ForeignKeyConstraint foreignKeyConstraint0 = new ForeignKeyConstraint((Table) null, (String) null, 46, 46);
      foreignKeyConstraint0.getName();
      assertEquals(46, foreignKeyConstraint0.getDeleteRule());
      assertEquals(46, foreignKeyConstraint0.getUpdateRule());
  }

  /**
  //Test case number: 7
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      ForeignKeyConstraint foreignKeyConstraint0 = new ForeignKeyConstraint((Table) null, "", 4, 4);
      foreignKeyConstraint0.getName();
      assertEquals(4, foreignKeyConstraint0.getUpdateRule());
      assertEquals(4, foreignKeyConstraint0.getDeleteRule());
  }

  /**
  //Test case number: 8
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      ForeignKeyConstraint foreignKeyConstraint0 = new ForeignKeyConstraint((Table) null, "8`>gGRM`", 0, 298);
      int int0 = foreignKeyConstraint0.getDeleteRule();
      assertEquals(0, foreignKeyConstraint0.getUpdateRule());
      assertEquals(298, int0);
  }

  /**
  //Test case number: 9
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      ForeignKeyConstraint foreignKeyConstraint0 = new ForeignKeyConstraint((Table) null, "LANGUAGE", 2, (-107));
      int int0 = foreignKeyConstraint0.getDeleteRule();
      assertEquals((-107), int0);
      assertEquals(2, foreignKeyConstraint0.getUpdateRule());
  }

  /**
  //Test case number: 10
  /*Coverage entropy=1.0397207708399179
  */
  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      ForeignKeyConstraint foreignKeyConstraint0 = new ForeignKeyConstraint((Table) null, "l", 2, 2);
      ForeignKeyConstraint foreignKeyConstraint1 = new ForeignKeyConstraint((Table) null, "SgcS'", 2, 2);
      int int0 = foreignKeyConstraint0.compareTo(foreignKeyConstraint1);
      assertEquals((-7), int0);
      assertEquals(2, foreignKeyConstraint1.getDeleteRule());
      assertEquals(2, foreignKeyConstraint1.getUpdateRule());
  }

  /**
  //Test case number: 11
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
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
  //Test case number: 12
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      ForeignKeyConstraint foreignKeyConstraint0 = new ForeignKeyConstraint((Table) null, "KGH)a", (-463), (-463));
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
  //Test case number: 13
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      ForeignKeyConstraint foreignKeyConstraint0 = new ForeignKeyConstraint((Table) null, ",5[cJ.\"{+7|%W^>", 1719, 1719);
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
  //Test case number: 14
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      ForeignKeyConstraint foreignKeyConstraint0 = new ForeignKeyConstraint((Table) null, "8`>gGRM`", 0, 0);
      int int0 = foreignKeyConstraint0.getDeleteRule();
      assertEquals(0, int0);
      assertEquals(0, foreignKeyConstraint0.getUpdateRule());
  }

  /**
  //Test case number: 15
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      ForeignKeyConstraint foreignKeyConstraint0 = new ForeignKeyConstraint((Table) null, "", (-2464), 114);
      foreignKeyConstraint0.getChildColumns();
      assertEquals(114, foreignKeyConstraint0.getDeleteRule());
      assertEquals((-2464), foreignKeyConstraint0.getUpdateRule());
  }

  /**
  //Test case number: 16
  /*Coverage entropy=1.3862943611198906
  */
  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
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
        foreignKeyConstraint0 = new ForeignKeyConstraint(tableColumn0, tableColumn0, (-530), (-530));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("net.sourceforge.schemaspy.model.TableColumn", e);
      }
  }

  /**
  //Test case number: 17
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      ForeignKeyConstraint foreignKeyConstraint0 = new ForeignKeyConstraint((Table) null, "oXg2Ji(3]", 22, 22);
      foreignKeyConstraint0.getName();
      assertEquals(22, foreignKeyConstraint0.getDeleteRule());
      assertEquals(22, foreignKeyConstraint0.getUpdateRule());
  }

  /**
  //Test case number: 18
  /*Coverage entropy=1.3862943611198906
  */
  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      ForeignKeyConstraint foreignKeyConstraint0 = new ForeignKeyConstraint((Table) null, ".SzQgD#zv*I&$Y'!K", (-3004), (-3004));
      TableColumnMeta tableColumnMeta0 = mock(TableColumnMeta.class, new ViolatedAssumptionAnswer());
      doReturn("").when(tableColumnMeta0).getComments();
      doReturn("").when(tableColumnMeta0).getDefaultValue();
      doReturn((-3004)).when(tableColumnMeta0).getDigits();
      doReturn("").when(tableColumnMeta0).getId();
      doReturn("").when(tableColumnMeta0).getName();
      doReturn((-3004)).when(tableColumnMeta0).getSize();
      doReturn("^[*yS~wy%MX").when(tableColumnMeta0).getType();
      doReturn(true).when(tableColumnMeta0).isAutoUpdated();
      doReturn(true).when(tableColumnMeta0).isNullable();
      TableColumn tableColumn0 = new TableColumn((Table) null, tableColumnMeta0);
      foreignKeyConstraint0.addParentColumn(tableColumn0);
      List<TableColumn> list0 = foreignKeyConstraint0.getParentColumns();
      ForeignKeyConstraint.toString(list0);
      assertEquals((-3004), foreignKeyConstraint0.getUpdateRule());
      assertEquals((-3004), foreignKeyConstraint0.getDeleteRule());
      assertTrue(list0.contains(tableColumn0));
  }

  /**
  //Test case number: 19
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      LinkedList<TableColumn> linkedList0 = new LinkedList<TableColumn>();
      String string0 = ForeignKeyConstraint.toString((List<TableColumn>) linkedList0);
      assertNotNull(string0);
  }

  /**
  //Test case number: 20
  /*Coverage entropy=1.0397207708399179
  */
  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      ForeignKeyConstraint foreignKeyConstraint0 = new ForeignKeyConstraint((Table) null, "l", 2, 2);
      ForeignKeyConstraint foreignKeyConstraint1 = new ForeignKeyConstraint((Table) null, "", 2, 2);
      int int0 = foreignKeyConstraint0.compareTo(foreignKeyConstraint1);
      assertEquals(1, int0);
      assertEquals(2, foreignKeyConstraint1.getUpdateRule());
      assertTrue(foreignKeyConstraint1.isNullOnDelete());
  }

  /**
  //Test case number: 21
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      ForeignKeyConstraint foreignKeyConstraint0 = new ForeignKeyConstraint((Table) null, "dzM", (-37), (-37));
      int int0 = foreignKeyConstraint0.compareTo(foreignKeyConstraint0);
      assertEquals((-37), foreignKeyConstraint0.getUpdateRule());
      assertEquals(0, int0);
      assertEquals((-37), foreignKeyConstraint0.getDeleteRule());
  }

  /**
  //Test case number: 22
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      ForeignKeyConstraint foreignKeyConstraint0 = new ForeignKeyConstraint((Table) null, "", (-3196), (-3196));
      boolean boolean0 = foreignKeyConstraint0.isReal();
      assertEquals((-3196), foreignKeyConstraint0.getUpdateRule());
      assertEquals((-3196), foreignKeyConstraint0.getDeleteRule());
      assertTrue(boolean0);
  }

  /**
  //Test case number: 23
  /*Coverage entropy=0.7963116401738131
  */
  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      ForeignKeyConstraint foreignKeyConstraint0 = new ForeignKeyConstraint((Table) null, "KGf)a", (-24), (-24));
      foreignKeyConstraint0.getDeleteRuleAlias();
      assertEquals((-24), foreignKeyConstraint0.getDeleteRule());
      assertEquals((-24), foreignKeyConstraint0.getUpdateRule());
  }

  /**
  //Test case number: 24
  /*Coverage entropy=0.7963116401738131
  */
  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      ForeignKeyConstraint foreignKeyConstraint0 = new ForeignKeyConstraint((Table) null, "KGf)a", 0, 2);
      String string0 = foreignKeyConstraint0.getDeleteRuleAlias();
      assertEquals(0, foreignKeyConstraint0.getUpdateRule());
      assertEquals("N", string0);
  }

  /**
  //Test case number: 25
  /*Coverage entropy=0.7963116401738131
  */
  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      ForeignKeyConstraint foreignKeyConstraint0 = new ForeignKeyConstraint((Table) null, "d5Jk8=O(]{?rP6N#", 1, 1);
      String string0 = foreignKeyConstraint0.getDeleteRuleAlias();
      assertEquals(1, foreignKeyConstraint0.getUpdateRule());
      assertEquals("R", string0);
  }

  /**
  //Test case number: 26
  /*Coverage entropy=0.7963116401738131
  */
  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      ForeignKeyConstraint foreignKeyConstraint0 = new ForeignKeyConstraint((Table) null, "JwZfOCs7.yv", 2, 3);
      String string0 = foreignKeyConstraint0.getDeleteRuleAlias();
      assertEquals(2, foreignKeyConstraint0.getUpdateRule());
      assertEquals("R", string0);
  }

  /**
  //Test case number: 27
  /*Coverage entropy=0.7963116401738131
  */
  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      ForeignKeyConstraint foreignKeyConstraint0 = new ForeignKeyConstraint((Table) null, "", 0, 0);
      String string0 = foreignKeyConstraint0.getDeleteRuleAlias();
      assertEquals(0, foreignKeyConstraint0.getUpdateRule());
      assertEquals("C", string0);
  }

  /**
  //Test case number: 28
  /*Coverage entropy=0.796311640173813
  */
  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      ForeignKeyConstraint foreignKeyConstraint0 = new ForeignKeyConstraint((Table) null, "", 3, 3);
      String string0 = foreignKeyConstraint0.getDeleteRuleDescription();
      assertEquals(3, foreignKeyConstraint0.getUpdateRule());
      assertEquals("Restrict delete:\n Parent cannot be deleted if children exist", string0);
  }

  /**
  //Test case number: 29
  /*Coverage entropy=0.796311640173813
  */
  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      ForeignKeyConstraint foreignKeyConstraint0 = new ForeignKeyConstraint((Table) null, "mIcsb", 2, 2);
      String string0 = foreignKeyConstraint0.getDeleteRuleDescription();
      assertEquals("Null on delete:\n Foreign key to parent set to NULL when parent deleted", string0);
      assertEquals(2, foreignKeyConstraint0.getUpdateRule());
  }

  /**
  //Test case number: 30
  /*Coverage entropy=0.796311640173813
  */
  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      ForeignKeyConstraint foreignKeyConstraint0 = new ForeignKeyConstraint((Table) null, "java.util.LinkedList@0000000001", 1, 1);
      String string0 = foreignKeyConstraint0.getDeleteRuleDescription();
      assertEquals("Restrict delete:\n Parent cannot be deleted if children exist", string0);
      assertEquals(1, foreignKeyConstraint0.getUpdateRule());
  }

  /**
  //Test case number: 31
  /*Coverage entropy=0.796311640173813
  */
  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      ForeignKeyConstraint foreignKeyConstraint0 = new ForeignKeyConstraint((Table) null, "", 1077, 1077);
      foreignKeyConstraint0.getDeleteRuleDescription();
      assertEquals(1077, foreignKeyConstraint0.getDeleteRule());
      assertEquals(1077, foreignKeyConstraint0.getUpdateRule());
  }

  /**
  //Test case number: 32
  /*Coverage entropy=0.796311640173813
  */
  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      ForeignKeyConstraint foreignKeyConstraint0 = new ForeignKeyConstraint((Table) null, "LANG.AGE", 0, 0);
      String string0 = foreignKeyConstraint0.getDeleteRuleDescription();
      assertEquals("Cascade on delete:\n Deletion of parent deletes child", string0);
      assertEquals(0, foreignKeyConstraint0.getUpdateRule());
  }

  /**
  //Test case number: 33
  /*Coverage entropy=0.7963116401738131
  */
  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      ForeignKeyConstraint foreignKeyConstraint0 = new ForeignKeyConstraint((Table) null, "", 1719, 1719);
      foreignKeyConstraint0.getDeleteRuleName();
      assertEquals(1719, foreignKeyConstraint0.getDeleteRule());
      assertEquals(1719, foreignKeyConstraint0.getUpdateRule());
  }

  /**
  //Test case number: 34
  /*Coverage entropy=0.7963116401738131
  */
  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      ForeignKeyConstraint foreignKeyConstraint0 = new ForeignKeyConstraint((Table) null, "bt7rk BHgh", 3, 3);
      String string0 = foreignKeyConstraint0.getDeleteRuleName();
      assertEquals(3, foreignKeyConstraint0.getUpdateRule());
      assertEquals("Restrict delete", string0);
  }

  /**
  //Test case number: 35
  /*Coverage entropy=0.7963116401738131
  */
  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      ForeignKeyConstraint foreignKeyConstraint0 = new ForeignKeyConstraint((Table) null, "java.util.LinkedList@0000000001", 1, 1);
      String string0 = foreignKeyConstraint0.getDeleteRuleName();
      assertEquals(1, foreignKeyConstraint0.getUpdateRule());
      assertEquals("Restrict delete", string0);
  }

  /**
  //Test case number: 36
  /*Coverage entropy=0.7963116401738131
  */
  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      ForeignKeyConstraint foreignKeyConstraint0 = new ForeignKeyConstraint((Table) null, "SgcS'", 2, 2);
      String string0 = foreignKeyConstraint0.getDeleteRuleName();
      assertEquals("Null on delete", string0);
      assertEquals(2, foreignKeyConstraint0.getUpdateRule());
  }

  /**
  //Test case number: 37
  /*Coverage entropy=0.7963116401738131
  */
  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      ForeignKeyConstraint foreignKeyConstraint0 = new ForeignKeyConstraint((Table) null, ")yjzz2UTio|rCi=9", 0, 0);
      String string0 = foreignKeyConstraint0.getDeleteRuleName();
      assertEquals(0, foreignKeyConstraint0.getUpdateRule());
      assertEquals("Cascade on delete", string0);
  }

  /**
  //Test case number: 38
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      ForeignKeyConstraint foreignKeyConstraint0 = new ForeignKeyConstraint((Table) null, "java.util.LinkedList@0000000001", 499, 2);
      boolean boolean0 = foreignKeyConstraint0.isNullOnDelete();
      assertTrue(boolean0);
      assertEquals(499, foreignKeyConstraint0.getUpdateRule());
  }

  /**
  //Test case number: 39
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      ForeignKeyConstraint foreignKeyConstraint0 = new ForeignKeyConstraint((Table) null, "KGf)a", (-733), (-733));
      boolean boolean0 = foreignKeyConstraint0.isNullOnDelete();
      assertEquals((-733), foreignKeyConstraint0.getUpdateRule());
      assertFalse(boolean0);
      assertEquals((-733), foreignKeyConstraint0.getDeleteRule());
  }

  /**
  //Test case number: 40
  /*Coverage entropy=1.0397207708399179
  */
  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      ForeignKeyConstraint foreignKeyConstraint0 = new ForeignKeyConstraint((Table) null, (String) null, 2, 2);
      boolean boolean0 = foreignKeyConstraint0.isRestrictDelete();
      assertFalse(boolean0);
      assertEquals("Null on delete", foreignKeyConstraint0.getDeleteRuleName());
      assertEquals(2, foreignKeyConstraint0.getUpdateRule());
  }

  /**
  //Test case number: 41
  /*Coverage entropy=1.0397207708399179
  */
  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      ForeignKeyConstraint foreignKeyConstraint0 = new ForeignKeyConstraint((Table) null, "BocV2k\"86I,b!I|KW", 1, 1);
      boolean boolean0 = foreignKeyConstraint0.isRestrictDelete();
      assertEquals(1, foreignKeyConstraint0.getUpdateRule());
      assertTrue(boolean0);
  }

  /**
  //Test case number: 42
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      ForeignKeyConstraint foreignKeyConstraint0 = new ForeignKeyConstraint((Table) null, (String) null, 0, 0);
      boolean boolean0 = foreignKeyConstraint0.isCascadeOnDelete();
      assertTrue(boolean0);
      assertEquals(0, foreignKeyConstraint0.getUpdateRule());
  }

  /**
  //Test case number: 43
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      ForeignKeyConstraint foreignKeyConstraint0 = new ForeignKeyConstraint((Table) null, "KGH)a", (-36), (-36));
      boolean boolean0 = foreignKeyConstraint0.isCascadeOnDelete();
      assertEquals((-36), foreignKeyConstraint0.getUpdateRule());
      assertEquals((-36), foreignKeyConstraint0.getDeleteRule());
      assertFalse(boolean0);
  }

  /**
  //Test case number: 44
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      ForeignKeyConstraint foreignKeyConstraint0 = new ForeignKeyConstraint((Table) null, "", 1719, 1719);
      foreignKeyConstraint0.addChildColumn((TableColumn) null);
      assertEquals(1719, foreignKeyConstraint0.getDeleteRule());
      assertEquals(1719, foreignKeyConstraint0.getUpdateRule());
  }

  /**
  //Test case number: 45
  /*Coverage entropy=1.6094379124341005
  */
  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
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
  //Test case number: 46
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      ForeignKeyConstraint foreignKeyConstraint0 = new ForeignKeyConstraint((Table) null, "KGf)a", 43, 43);
      int int0 = foreignKeyConstraint0.getUpdateRule();
      assertEquals(43, int0);
      assertEquals(43, foreignKeyConstraint0.getDeleteRule());
  }

  /**
  //Test case number: 47
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      ForeignKeyConstraint foreignKeyConstraint0 = new ForeignKeyConstraint((Table) null, "8`>gGRM`", 0, 0);
      boolean boolean0 = foreignKeyConstraint0.isImplied();
      assertEquals(0, foreignKeyConstraint0.getUpdateRule());
      assertFalse(boolean0);
      assertEquals("C", foreignKeyConstraint0.getDeleteRuleAlias());
  }

  /**
  //Test case number: 48
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      ForeignKeyConstraint foreignKeyConstraint0 = new ForeignKeyConstraint((Table) null, " ", 3, 3);
      boolean boolean0 = foreignKeyConstraint0.isRestrictDelete();
      assertEquals(3, foreignKeyConstraint0.getUpdateRule());
      assertTrue(boolean0);
  }

  /**
  //Test case number: 49
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      ForeignKeyConstraint foreignKeyConstraint0 = new ForeignKeyConstraint((Table) null, "KGH)a", (-463), (-463));
      foreignKeyConstraint0.getChildTable();
      assertEquals((-463), foreignKeyConstraint0.getDeleteRule());
      assertEquals((-463), foreignKeyConstraint0.getUpdateRule());
  }

  /**
  //Test case number: 50
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      ForeignKeyConstraint foreignKeyConstraint0 = new ForeignKeyConstraint((Table) null, "C6", 17, 17);
      foreignKeyConstraint0.getParentTable();
      assertEquals(17, foreignKeyConstraint0.getDeleteRule());
      assertEquals(17, foreignKeyConstraint0.getUpdateRule());
  }

  /**
  //Test case number: 51
  /*Coverage entropy=1.6094379124341005
  */
  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
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
  //Test case number: 52
  /*Coverage entropy=1.3321790402101223
  */
  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      ForeignKeyConstraint foreignKeyConstraint0 = new ForeignKeyConstraint((Table) null, "l", 2, 2);
      ForeignKeyConstraint foreignKeyConstraint1 = new ForeignKeyConstraint((Table) null, "l", 2, 2);
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
}
