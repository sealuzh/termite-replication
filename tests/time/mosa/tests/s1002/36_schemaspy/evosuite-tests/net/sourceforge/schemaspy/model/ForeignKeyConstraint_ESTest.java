/*
 * This file was automatically generated by EvoSuite
 * Fri Nov 27 11:25:12 GMT 2020
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
      ForeignKeyConstraint foreignKeyConstraint0 = new ForeignKeyConstraint((Table) null, "@MEIATE", 46, 46);
      boolean boolean0 = foreignKeyConstraint0.isNullOnDelete();
      assertEquals(46, foreignKeyConstraint0.getUpdateRule());
      assertEquals(46, foreignKeyConstraint0.getDeleteRule());
      assertFalse(boolean0);
  }

  /**
  //Test case number: 1
  /*Coverage entropy=1.0397207708399179
  */
  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      ForeignKeyConstraint foreignKeyConstraint0 = new ForeignKeyConstraint((Table) null, "MEIATE", 709, 709);
      boolean boolean0 = foreignKeyConstraint0.isRestrictDelete();
      assertFalse(boolean0);
      assertEquals(709, foreignKeyConstraint0.getDeleteRule());
      assertEquals(709, foreignKeyConstraint0.getUpdateRule());
  }

  /**
  //Test case number: 2
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      ForeignKeyConstraint foreignKeyConstraint0 = new ForeignKeyConstraint((Table) null, "rIka^Z^VOE", 1, 1);
      boolean boolean0 = foreignKeyConstraint0.isCascadeOnDelete();
      assertFalse(boolean0);
      assertEquals(1, foreignKeyConstraint0.getUpdateRule());
      assertEquals("Restrict delete", foreignKeyConstraint0.getDeleteRuleName());
  }

  /**
  //Test case number: 3
  /*Coverage entropy=1.3862943611198906
  */
  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      ForeignKeyConstraint foreignKeyConstraint0 = new ForeignKeyConstraint((Table) null, "NP3", 500, 500);
      List<TableColumn> list0 = foreignKeyConstraint0.getChildColumns();
      TableColumnMeta tableColumnMeta0 = mock(TableColumnMeta.class, new ViolatedAssumptionAnswer());
      doReturn("").when(tableColumnMeta0).getComments();
      doReturn("NP3").when(tableColumnMeta0).getDefaultValue();
      doReturn(500).when(tableColumnMeta0).getDigits();
      doReturn("").when(tableColumnMeta0).getId();
      doReturn("").when(tableColumnMeta0).getName();
      doReturn(500).when(tableColumnMeta0).getSize();
      doReturn("").when(tableColumnMeta0).getType();
      doReturn(false).when(tableColumnMeta0).isAutoUpdated();
      doReturn(false).when(tableColumnMeta0).isNullable();
      TableColumn tableColumn0 = new TableColumn((Table) null, tableColumnMeta0);
      foreignKeyConstraint0.addChildColumn(tableColumn0);
      ForeignKeyConstraint.toString(list0);
      assertEquals(1, list0.size());
      assertEquals(500, foreignKeyConstraint0.getDeleteRule());
  }

  /**
  //Test case number: 4
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      ForeignKeyConstraint foreignKeyConstraint0 = new ForeignKeyConstraint((Table) null, "AS", 0, 0);
      int int0 = foreignKeyConstraint0.getUpdateRule();
      assertEquals("Cascade on delete", foreignKeyConstraint0.getDeleteRuleName());
      assertEquals(0, int0);
  }

  /**
  //Test case number: 5
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      ForeignKeyConstraint foreignKeyConstraint0 = new ForeignKeyConstraint((Table) null, "AS", 993, 993);
      int int0 = foreignKeyConstraint0.getUpdateRule();
      assertEquals(993, foreignKeyConstraint0.getDeleteRule());
      assertEquals(993, int0);
  }

  /**
  //Test case number: 6
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      ForeignKeyConstraint foreignKeyConstraint0 = new ForeignKeyConstraint((Table) null, (String) null, 334, 334);
      foreignKeyConstraint0.getName();
      assertEquals(334, foreignKeyConstraint0.getDeleteRule());
      assertEquals(334, foreignKeyConstraint0.getUpdateRule());
  }

  /**
  //Test case number: 7
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      ForeignKeyConstraint foreignKeyConstraint0 = new ForeignKeyConstraint((Table) null, "6>v]kmcB@wL%j}<l", 72, 72);
      foreignKeyConstraint0.getName();
      assertEquals(72, foreignKeyConstraint0.getUpdateRule());
      assertEquals(72, foreignKeyConstraint0.getDeleteRule());
  }

  /**
  //Test case number: 8
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      ForeignKeyConstraint foreignKeyConstraint0 = new ForeignKeyConstraint((Table) null, "", 72, 72);
      foreignKeyConstraint0.getName();
      assertEquals(72, foreignKeyConstraint0.getDeleteRule());
      assertEquals(72, foreignKeyConstraint0.getUpdateRule());
  }

  /**
  //Test case number: 9
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      ForeignKeyConstraint foreignKeyConstraint0 = new ForeignKeyConstraint((Table) null, "Null on delete", 0, 0);
      int int0 = foreignKeyConstraint0.getDeleteRule();
      assertEquals(0, foreignKeyConstraint0.getUpdateRule());
      assertEquals(0, int0);
  }

  /**
  //Test case number: 10
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      ForeignKeyConstraint foreignKeyConstraint0 = new ForeignKeyConstraint((Table) null, "xg3uc\u0004;G", 2, 2);
      int int0 = foreignKeyConstraint0.getDeleteRule();
      assertEquals(2, foreignKeyConstraint0.getUpdateRule());
      assertEquals(2, int0);
  }

  /**
  //Test case number: 11
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      ForeignKeyConstraint foreignKeyConstraint0 = new ForeignKeyConstraint((Table) null, "GomwWDhkoP\"OqD", (-649), (-649));
      int int0 = foreignKeyConstraint0.getDeleteRule();
      assertEquals((-649), foreignKeyConstraint0.getUpdateRule());
      assertEquals((-649), int0);
  }

  /**
  //Test case number: 12
  /*Coverage entropy=1.0397207708399179
  */
  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      ForeignKeyConstraint foreignKeyConstraint0 = new ForeignKeyConstraint((Table) null, "gHJY.#Pw\"6{#(", (-1066), (-1066));
      ForeignKeyConstraint foreignKeyConstraint1 = new ForeignKeyConstraint((Table) null, "", (-1066), (-1066));
      int int0 = foreignKeyConstraint1.compareTo(foreignKeyConstraint0);
      assertEquals((-1066), foreignKeyConstraint1.getDeleteRule());
      assertEquals((-13), int0);
      assertEquals((-1066), foreignKeyConstraint1.getUpdateRule());
  }

  /**
  //Test case number: 13
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      // Undeclared exception!
      try { 
        ForeignKeyConstraint.toString((List<TableColumn>) null);
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
      ForeignKeyConstraint foreignKeyConstraint0 = new ForeignKeyConstraint((Table) null, "rIka^Z^VOE", 1, 1);
      foreignKeyConstraint0.addParentColumn((TableColumn) null);
      assertEquals(1, foreignKeyConstraint0.getUpdateRule());
      assertEquals("Restrict delete", foreignKeyConstraint0.getDeleteRuleName());
  }

  /**
  //Test case number: 15
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      ForeignKeyConstraint foreignKeyConstraint0 = new ForeignKeyConstraint((Table) null, "NP3", 500, 500);
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
  //Test case number: 16
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      ForeignKeyConstraint foreignKeyConstraint0 = new ForeignKeyConstraint((Table) null, (String) null, (-232), (-232));
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
  //Test case number: 17
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      ForeignKeyConstraint foreignKeyConstraint0 = null;
      try {
        foreignKeyConstraint0 = new ForeignKeyConstraint((TableColumn) null, (TableColumn) null, 157, 157);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("net.sourceforge.schemaspy.model.ForeignKeyConstraint", e);
      }
  }

  /**
  //Test case number: 18
  /*Coverage entropy=1.3862943611198906
  */
  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      ForeignKeyConstraint foreignKeyConstraint0 = new ForeignKeyConstraint((Table) null, "Ia^Z^O", 34, 34);
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
      foreignKeyConstraint0.addChildColumn(tableColumn0);
      List<TableColumn> list0 = foreignKeyConstraint0.getChildColumns();
      ForeignKeyConstraint.toString(list0);
      assertEquals(34, foreignKeyConstraint0.getDeleteRule());
      assertTrue(list0.contains(tableColumn0));
      assertEquals(34, foreignKeyConstraint0.getUpdateRule());
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
      ForeignKeyConstraint foreignKeyConstraint0 = new ForeignKeyConstraint((Table) null, "g)gvuc4;G", (-838), (-838));
      ForeignKeyConstraint foreignKeyConstraint1 = new ForeignKeyConstraint((Table) null, "L5P:7B5vULo4o!W_;", (-838), (-838));
      int int0 = foreignKeyConstraint1.compareTo(foreignKeyConstraint0);
      assertEquals((-838), foreignKeyConstraint1.getDeleteRule());
      assertEquals(5, int0);
      assertEquals((-838), foreignKeyConstraint1.getUpdateRule());
  }

  /**
  //Test case number: 21
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      ForeignKeyConstraint foreignKeyConstraint0 = new ForeignKeyConstraint((Table) null, "Ia^Z^O", 34, 34);
      int int0 = foreignKeyConstraint0.compareTo(foreignKeyConstraint0);
      assertEquals(34, foreignKeyConstraint0.getDeleteRule());
      assertEquals(0, int0);
      assertEquals(34, foreignKeyConstraint0.getUpdateRule());
  }

  /**
  //Test case number: 22
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      ForeignKeyConstraint foreignKeyConstraint0 = new ForeignKeyConstraint((Table) null, "AS", 0, 0);
      boolean boolean0 = foreignKeyConstraint0.isReal();
      assertTrue(boolean0);
      assertEquals("C", foreignKeyConstraint0.getDeleteRuleAlias());
      assertEquals(0, foreignKeyConstraint0.getUpdateRule());
  }

  /**
  //Test case number: 23
  /*Coverage entropy=0.7963116401738131
  */
  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      ForeignKeyConstraint foreignKeyConstraint0 = new ForeignKeyConstraint((Table) null, "Cascade on delete:\n Deletion of parent deletes child", 925, 925);
      foreignKeyConstraint0.getDeleteRuleAlias();
      assertEquals(925, foreignKeyConstraint0.getUpdateRule());
      assertEquals(925, foreignKeyConstraint0.getDeleteRule());
  }

  /**
  //Test case number: 24
  /*Coverage entropy=0.7963116401738131
  */
  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      ForeignKeyConstraint foreignKeyConstraint0 = new ForeignKeyConstraint((Table) null, "rIka^Z^VOE", 3, 3);
      String string0 = foreignKeyConstraint0.getDeleteRuleAlias();
      assertEquals("R", string0);
      assertEquals(3, foreignKeyConstraint0.getUpdateRule());
  }

  /**
  //Test case number: 25
  /*Coverage entropy=0.7963116401738131
  */
  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      ForeignKeyConstraint foreignKeyConstraint0 = new ForeignKeyConstraint((Table) null, ";+talY", 2, 2);
      String string0 = foreignKeyConstraint0.getDeleteRuleAlias();
      assertEquals("N", string0);
      assertEquals(2, foreignKeyConstraint0.getUpdateRule());
  }

  /**
  //Test case number: 26
  /*Coverage entropy=0.7963116401738131
  */
  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      ForeignKeyConstraint foreignKeyConstraint0 = new ForeignKeyConstraint((Table) null, "rIka^Z^VOE", 1, 1);
      String string0 = foreignKeyConstraint0.getDeleteRuleAlias();
      assertEquals("R", string0);
      assertEquals(1, foreignKeyConstraint0.getUpdateRule());
  }

  /**
  //Test case number: 27
  /*Coverage entropy=0.796311640173813
  */
  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      ForeignKeyConstraint foreignKeyConstraint0 = new ForeignKeyConstraint((Table) null, (String) null, 334, 334);
      foreignKeyConstraint0.getDeleteRuleDescription();
      assertEquals(334, foreignKeyConstraint0.getDeleteRule());
      assertEquals(334, foreignKeyConstraint0.getUpdateRule());
  }

  /**
  //Test case number: 28
  /*Coverage entropy=0.796311640173813
  */
  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      ForeignKeyConstraint foreignKeyConstraint0 = new ForeignKeyConstraint((Table) null, "k#$I=", 2, 2);
      String string0 = foreignKeyConstraint0.getDeleteRuleDescription();
      assertEquals("Null on delete:\n Foreign key to parent set to NULL when parent deleted", string0);
      assertEquals(2, foreignKeyConstraint0.getUpdateRule());
  }

  /**
  //Test case number: 29
  /*Coverage entropy=0.796311640173813
  */
  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      ForeignKeyConstraint foreignKeyConstraint0 = new ForeignKeyConstraint((Table) null, "mZRGA", 1, 1);
      String string0 = foreignKeyConstraint0.getDeleteRuleDescription();
      assertEquals("Restrict delete:\n Parent cannot be deleted if children exist", string0);
      assertEquals(1, foreignKeyConstraint0.getUpdateRule());
  }

  /**
  //Test case number: 30
  /*Coverage entropy=0.796311640173813
  */
  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      ForeignKeyConstraint foreignKeyConstraint0 = new ForeignKeyConstraint((Table) null, "", 3, 3);
      String string0 = foreignKeyConstraint0.getDeleteRuleDescription();
      assertEquals("Restrict delete:\n Parent cannot be deleted if children exist", string0);
      assertEquals(3, foreignKeyConstraint0.getUpdateRule());
  }

  /**
  //Test case number: 31
  /*Coverage entropy=0.796311640173813
  */
  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      ForeignKeyConstraint foreignKeyConstraint0 = new ForeignKeyConstraint((Table) null, "z", 0, 0);
      String string0 = foreignKeyConstraint0.getDeleteRuleDescription();
      assertEquals(0, foreignKeyConstraint0.getUpdateRule());
      assertEquals("Cascade on delete:\n Deletion of parent deletes child", string0);
  }

  /**
  //Test case number: 32
  /*Coverage entropy=0.7963116401738131
  */
  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      ForeignKeyConstraint foreignKeyConstraint0 = new ForeignKeyConstraint((Table) null, "T4+|", (-1), (-1));
      foreignKeyConstraint0.getDeleteRuleName();
      assertEquals((-1), foreignKeyConstraint0.getUpdateRule());
      assertEquals((-1), foreignKeyConstraint0.getDeleteRule());
  }

  /**
  //Test case number: 33
  /*Coverage entropy=0.7963116401738131
  */
  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      ForeignKeyConstraint foreignKeyConstraint0 = new ForeignKeyConstraint((Table) null, "", 2, 2);
      String string0 = foreignKeyConstraint0.getDeleteRuleName();
      assertEquals(2, foreignKeyConstraint0.getUpdateRule());
      assertEquals("Null on delete", string0);
  }

  /**
  //Test case number: 34
  /*Coverage entropy=0.7963116401738131
  */
  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      ForeignKeyConstraint foreignKeyConstraint0 = new ForeignKeyConstraint((Table) null, "", 1, 1);
      String string0 = foreignKeyConstraint0.getDeleteRuleName();
      assertEquals("Restrict delete", string0);
      assertEquals(1, foreignKeyConstraint0.getUpdateRule());
  }

  /**
  //Test case number: 35
  /*Coverage entropy=0.7963116401738131
  */
  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      ForeignKeyConstraint foreignKeyConstraint0 = new ForeignKeyConstraint((Table) null, "", 3, 3);
      String string0 = foreignKeyConstraint0.getDeleteRuleName();
      assertEquals("Restrict delete", string0);
      assertEquals(3, foreignKeyConstraint0.getUpdateRule());
  }

  /**
  //Test case number: 36
  /*Coverage entropy=0.7963116401738131
  */
  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      ForeignKeyConstraint foreignKeyConstraint0 = new ForeignKeyConstraint((Table) null, "Null on delete", 0, 0);
      String string0 = foreignKeyConstraint0.getDeleteRuleName();
      assertEquals("Cascade on delete", string0);
      assertEquals(0, foreignKeyConstraint0.getUpdateRule());
  }

  /**
  //Test case number: 37
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      ForeignKeyConstraint foreignKeyConstraint0 = new ForeignKeyConstraint((Table) null, "E}`c)A~XkMu CQ]'", 2, 2);
      boolean boolean0 = foreignKeyConstraint0.isNullOnDelete();
      assertTrue(boolean0);
      assertEquals(2, foreignKeyConstraint0.getUpdateRule());
  }

  /**
  //Test case number: 38
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      ForeignKeyConstraint foreignKeyConstraint0 = new ForeignKeyConstraint((Table) null, "rIka^Z^VOE", 1, 1);
      boolean boolean0 = foreignKeyConstraint0.isNullOnDelete();
      assertFalse(boolean0);
      assertEquals(1, foreignKeyConstraint0.getUpdateRule());
      assertTrue(foreignKeyConstraint0.isRestrictDelete());
  }

  /**
  //Test case number: 39
  /*Coverage entropy=1.0397207708399179
  */
  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      ForeignKeyConstraint foreignKeyConstraint0 = new ForeignKeyConstraint((Table) null, "T4+|", 1, 1);
      boolean boolean0 = foreignKeyConstraint0.isRestrictDelete();
      assertTrue(boolean0);
      assertEquals(1, foreignKeyConstraint0.getUpdateRule());
  }

  /**
  //Test case number: 40
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      ForeignKeyConstraint foreignKeyConstraint0 = new ForeignKeyConstraint((Table) null, "@DU;B;.PNO_[", 3, 3);
      boolean boolean0 = foreignKeyConstraint0.isRestrictDelete();
      assertEquals(3, foreignKeyConstraint0.getUpdateRule());
      assertTrue(boolean0);
  }

  /**
  //Test case number: 41
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      ForeignKeyConstraint foreignKeyConstraint0 = new ForeignKeyConstraint((Table) null, (String) null, 0, 0);
      boolean boolean0 = foreignKeyConstraint0.isCascadeOnDelete();
      assertEquals(0, foreignKeyConstraint0.getUpdateRule());
      assertTrue(boolean0);
  }

  /**
  //Test case number: 42
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      ForeignKeyConstraint foreignKeyConstraint0 = new ForeignKeyConstraint((Table) null, "Z|1Nm-Da5}-+l6.I7|J", (-21), (-21));
      boolean boolean0 = foreignKeyConstraint0.isCascadeOnDelete();
      assertFalse(boolean0);
      assertEquals((-21), foreignKeyConstraint0.getDeleteRule());
      assertEquals((-21), foreignKeyConstraint0.getUpdateRule());
  }

  /**
  //Test case number: 43
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      ForeignKeyConstraint foreignKeyConstraint0 = new ForeignKeyConstraint((Table) null, "mZRGA", 1, 1);
      foreignKeyConstraint0.addChildColumn((TableColumn) null);
      assertEquals(1, foreignKeyConstraint0.getUpdateRule());
      assertTrue(foreignKeyConstraint0.isRestrictDelete());
  }

  /**
  //Test case number: 44
  /*Coverage entropy=1.6094379124341005
  */
  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
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
  //Test case number: 45
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      ForeignKeyConstraint foreignKeyConstraint0 = new ForeignKeyConstraint((Table) null, "Z|1Nm-Da5}-+l6.I7|J", (-21), (-21));
      int int0 = foreignKeyConstraint0.getUpdateRule();
      assertEquals((-21), int0);
      assertEquals((-21), foreignKeyConstraint0.getDeleteRule());
  }

  /**
  //Test case number: 46
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      ForeignKeyConstraint foreignKeyConstraint0 = new ForeignKeyConstraint((Table) null, "rIka^Z^VOE", 1, 1);
      boolean boolean0 = foreignKeyConstraint0.isImplied();
      assertFalse(boolean0);
      assertEquals("Restrict delete:\n Parent cannot be deleted if children exist", foreignKeyConstraint0.getDeleteRuleDescription());
      assertEquals(1, foreignKeyConstraint0.getUpdateRule());
  }

  /**
  //Test case number: 47
  /*Coverage entropy=0.7963116401738131
  */
  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      ForeignKeyConstraint foreignKeyConstraint0 = new ForeignKeyConstraint((Table) null, (String) null, 0, 0);
      String string0 = foreignKeyConstraint0.getDeleteRuleAlias();
      assertEquals(0, foreignKeyConstraint0.getUpdateRule());
      assertEquals("C", string0);
  }

  /**
  //Test case number: 48
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      ForeignKeyConstraint foreignKeyConstraint0 = new ForeignKeyConstraint((Table) null, "", (-5), (-5));
      foreignKeyConstraint0.getChildTable();
      assertEquals((-5), foreignKeyConstraint0.getDeleteRule());
      assertEquals((-5), foreignKeyConstraint0.getUpdateRule());
  }

  /**
  //Test case number: 49
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      ForeignKeyConstraint foreignKeyConstraint0 = new ForeignKeyConstraint((Table) null, "", 1, 1);
      foreignKeyConstraint0.getParentColumns();
      assertEquals("Restrict delete:\n Parent cannot be deleted if children exist", foreignKeyConstraint0.getDeleteRuleDescription());
      assertEquals(1, foreignKeyConstraint0.getUpdateRule());
  }

  /**
  //Test case number: 50
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      ForeignKeyConstraint foreignKeyConstraint0 = new ForeignKeyConstraint((Table) null, "g)gvuc4;G", 2, 2);
      foreignKeyConstraint0.getParentTable();
      assertEquals(2, foreignKeyConstraint0.getUpdateRule());
      assertEquals("Null on delete:\n Foreign key to parent set to NULL when parent deleted", foreignKeyConstraint0.getDeleteRuleDescription());
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
  //Test case number: 52
  /*Coverage entropy=1.3321790402101223
  */
  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      ForeignKeyConstraint foreignKeyConstraint0 = new ForeignKeyConstraint((Table) null, "g)gvuc4;G", (-875), (-875));
      ForeignKeyConstraint foreignKeyConstraint1 = new ForeignKeyConstraint((Table) null, "g)gvuc4;G", (-875), (-875));
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
