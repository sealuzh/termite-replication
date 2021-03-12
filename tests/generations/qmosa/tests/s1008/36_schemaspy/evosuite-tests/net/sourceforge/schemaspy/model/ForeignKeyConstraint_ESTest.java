/*
 * This file was automatically generated by EvoSuite
 * Tue Nov 10 17:01:16 GMT 2020
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
      ForeignKeyConstraint foreignKeyConstraint0 = new ForeignKeyConstraint((Table) null, "", 1, 1);
      boolean boolean0 = foreignKeyConstraint0.isNullOnDelete();
      assertFalse(boolean0);
      assertEquals(1, foreignKeyConstraint0.getUpdateRule());
      assertTrue(foreignKeyConstraint0.isRestrictDelete());
  }

  /**
  //Test case number: 1
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      ForeignKeyConstraint foreignKeyConstraint0 = new ForeignKeyConstraint((Table) null, "Restrict deZslete", 2, 2);
      boolean boolean0 = foreignKeyConstraint0.isCascadeOnDelete();
      assertEquals(2, foreignKeyConstraint0.getUpdateRule());
      assertFalse(boolean0);
      assertEquals(2, foreignKeyConstraint0.getDeleteRule());
  }

  /**
  //Test case number: 2
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      ForeignKeyConstraint foreignKeyConstraint0 = new ForeignKeyConstraint((Table) null, "", 3, 38);
      foreignKeyConstraint0.addParentColumn((TableColumn) null);
      assertEquals(3, foreignKeyConstraint0.getUpdateRule());
      assertEquals(38, foreignKeyConstraint0.getDeleteRule());
  }

  /**
  //Test case number: 3
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
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
  //Test case number: 4
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      ForeignKeyConstraint foreignKeyConstraint0 = new ForeignKeyConstraint((Table) null, "s:IF]2Y=AoR?cW,aBv!", 0, 0);
      int int0 = foreignKeyConstraint0.getUpdateRule();
      assertEquals(0, int0);
      assertEquals(0, foreignKeyConstraint0.getDeleteRule());
  }

  /**
  //Test case number: 5
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      ForeignKeyConstraint foreignKeyConstraint0 = new ForeignKeyConstraint((Table) null, "", 1, 672);
      int int0 = foreignKeyConstraint0.getUpdateRule();
      assertEquals(672, foreignKeyConstraint0.getDeleteRule());
      assertEquals(1, int0);
  }

  /**
  //Test case number: 6
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      ForeignKeyConstraint foreignKeyConstraint0 = new ForeignKeyConstraint((Table) null, "2.12", 0, 97);
      foreignKeyConstraint0.getName();
      assertEquals(0, foreignKeyConstraint0.getUpdateRule());
      assertEquals(97, foreignKeyConstraint0.getDeleteRule());
  }

  /**
  //Test case number: 7
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      ForeignKeyConstraint foreignKeyConstraint0 = new ForeignKeyConstraint((Table) null, "", (-729), 672);
      foreignKeyConstraint0.getName();
      assertEquals((-729), foreignKeyConstraint0.getUpdateRule());
      assertEquals(672, foreignKeyConstraint0.getDeleteRule());
  }

  /**
  //Test case number: 8
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      ForeignKeyConstraint foreignKeyConstraint0 = new ForeignKeyConstraint((Table) null, "s", 10, 0);
      int int0 = foreignKeyConstraint0.getDeleteRule();
      assertEquals(0, int0);
      assertEquals(10, foreignKeyConstraint0.getUpdateRule());
  }

  /**
  //Test case number: 9
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      ForeignKeyConstraint foreignKeyConstraint0 = new ForeignKeyConstraint((Table) null, "s", 10, (-18));
      int int0 = foreignKeyConstraint0.getDeleteRule();
      assertEquals(10, foreignKeyConstraint0.getUpdateRule());
      assertEquals((-18), int0);
  }

  /**
  //Test case number: 10
  /*Coverage entropy=1.0397207708399179
  */
  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      ForeignKeyConstraint foreignKeyConstraint0 = new ForeignKeyConstraint((Table) null, "xDv76$4#MjU", (-2), (-1979));
      ForeignKeyConstraint foreignKeyConstraint1 = new ForeignKeyConstraint((Table) null, "vv.wqiQM", (-1979), (-3500));
      int int0 = foreignKeyConstraint1.compareTo(foreignKeyConstraint0);
      assertEquals((-1979), foreignKeyConstraint1.getUpdateRule());
      assertEquals((-2), int0);
      assertEquals((-3500), foreignKeyConstraint1.getDeleteRule());
  }

  /**
  //Test case number: 11
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      ForeignKeyConstraint foreignKeyConstraint0 = new ForeignKeyConstraint((Table) null, "s:IF]2Y=AoR?cW,aBv!", 0, 0);
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
  //Test case number: 12
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      ForeignKeyConstraint foreignKeyConstraint0 = new ForeignKeyConstraint((Table) null, "s", 10, 406);
      int int0 = foreignKeyConstraint0.getDeleteRule();
      assertEquals(406, int0);
      assertEquals(10, foreignKeyConstraint0.getUpdateRule());
  }

  /**
  //Test case number: 13
  /*Coverage entropy=1.3862943611198906
  */
  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
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
        foreignKeyConstraint0 = new ForeignKeyConstraint(tableColumn0, tableColumn0, 16, 91);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("net.sourceforge.schemaspy.model.TableColumn", e);
      }
  }

  /**
  //Test case number: 14
  /*Coverage entropy=-0.0
  */
  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
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
  //Test case number: 15
  /*Coverage entropy=1.3321790402101223
  */
  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      ForeignKeyConstraint foreignKeyConstraint0 = new ForeignKeyConstraint((Table) null, "", (-729), 672);
      ForeignKeyConstraint foreignKeyConstraint1 = new ForeignKeyConstraint((Table) null, "", (-729), 672);
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
  //Test case number: 16
  /*Coverage entropy=1.0397207708399179
  */
  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      ForeignKeyConstraint foreignKeyConstraint0 = new ForeignKeyConstraint((Table) null, "xDv76$4#MjU", (-2), (-1979));
      ForeignKeyConstraint foreignKeyConstraint1 = new ForeignKeyConstraint((Table) null, "vv.wqiQM", (-1979), (-3500));
      int int0 = foreignKeyConstraint0.compareTo(foreignKeyConstraint1);
      assertEquals((-1979), foreignKeyConstraint1.getUpdateRule());
      assertEquals((-3500), foreignKeyConstraint1.getDeleteRule());
      assertEquals(2, int0);
  }

  /**
  //Test case number: 17
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      ForeignKeyConstraint foreignKeyConstraint0 = new ForeignKeyConstraint((Table) null, "xDvh6$4#MjU", 0, (-1979));
      int int0 = foreignKeyConstraint0.compareTo(foreignKeyConstraint0);
      assertEquals((-1979), foreignKeyConstraint0.getDeleteRule());
      assertEquals(0, int0);
      assertEquals(0, foreignKeyConstraint0.getUpdateRule());
  }

  /**
  //Test case number: 18
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      ForeignKeyConstraint foreignKeyConstraint0 = new ForeignKeyConstraint((Table) null, (String) null, (-729), (-3499));
      ForeignKeyConstraint foreignKeyConstraint1 = new ForeignKeyConstraint((Table) null, "fine", 3, 3);
      // Undeclared exception!
      try { 
        foreignKeyConstraint0.compareTo(foreignKeyConstraint1);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("net.sourceforge.schemaspy.model.ForeignKeyConstraint", e);
      }
  }

  /**
  //Test case number: 19
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      ForeignKeyConstraint foreignKeyConstraint0 = new ForeignKeyConstraint((Table) null, "Restrict deZslete", 3, 3);
      boolean boolean0 = foreignKeyConstraint0.isReal();
      assertTrue(boolean0);
      assertEquals(3, foreignKeyConstraint0.getUpdateRule());
      assertEquals("R", foreignKeyConstraint0.getDeleteRuleAlias());
  }

  /**
  //Test case number: 20
  /*Coverage entropy=0.7963116401738131
  */
  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      ForeignKeyConstraint foreignKeyConstraint0 = new ForeignKeyConstraint((Table) null, "xDv76$4#MjU", 0, (-1979));
      foreignKeyConstraint0.getDeleteRuleAlias();
      assertEquals(0, foreignKeyConstraint0.getUpdateRule());
      assertEquals((-1979), foreignKeyConstraint0.getDeleteRule());
  }

  /**
  //Test case number: 21
  /*Coverage entropy=0.7963116401738131
  */
  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      ForeignKeyConstraint foreignKeyConstraint0 = new ForeignKeyConstraint((Table) null, "fine", 3, 3);
      String string0 = foreignKeyConstraint0.getDeleteRuleAlias();
      assertEquals("R", string0);
      assertEquals(3, foreignKeyConstraint0.getUpdateRule());
  }

  /**
  //Test case number: 22
  /*Coverage entropy=0.7963116401738131
  */
  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      ForeignKeyConstraint foreignKeyConstraint0 = new ForeignKeyConstraint((Table) null, "", 1, 1);
      String string0 = foreignKeyConstraint0.getDeleteRuleAlias();
      assertEquals(1, foreignKeyConstraint0.getUpdateRule());
      assertEquals("R", string0);
  }

  /**
  //Test case number: 23
  /*Coverage entropy=0.7963116401738131
  */
  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      ForeignKeyConstraint foreignKeyConstraint0 = new ForeignKeyConstraint((Table) null, (String) null, 2, 2);
      String string0 = foreignKeyConstraint0.getDeleteRuleAlias();
      assertEquals("N", string0);
      assertEquals(2, foreignKeyConstraint0.getUpdateRule());
  }

  /**
  //Test case number: 24
  /*Coverage entropy=0.7963116401738131
  */
  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      ForeignKeyConstraint foreignKeyConstraint0 = new ForeignKeyConstraint((Table) null, "s", 24, 0);
      String string0 = foreignKeyConstraint0.getDeleteRuleAlias();
      assertEquals(24, foreignKeyConstraint0.getUpdateRule());
      assertEquals("C", string0);
  }

  /**
  //Test case number: 25
  /*Coverage entropy=0.796311640173813
  */
  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      ForeignKeyConstraint foreignKeyConstraint0 = new ForeignKeyConstraint((Table) null, "fine", 3, 3);
      String string0 = foreignKeyConstraint0.getDeleteRuleDescription();
      assertEquals("Restrict delete:\n Parent cannot be deleted if children exist", string0);
      assertEquals(3, foreignKeyConstraint0.getUpdateRule());
  }

  /**
  //Test case number: 26
  /*Coverage entropy=0.796311640173813
  */
  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      ForeignKeyConstraint foreignKeyConstraint0 = new ForeignKeyConstraint((Table) null, (String) null, 2, 2);
      String string0 = foreignKeyConstraint0.getDeleteRuleDescription();
      assertEquals(2, foreignKeyConstraint0.getUpdateRule());
      assertEquals("Null on delete:\n Foreign key to parent set to NULL when parent deleted", string0);
  }

  /**
  //Test case number: 27
  /*Coverage entropy=0.796311640173813
  */
  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      ForeignKeyConstraint foreignKeyConstraint0 = new ForeignKeyConstraint((Table) null, "", 1, 1);
      String string0 = foreignKeyConstraint0.getDeleteRuleDescription();
      assertEquals(1, foreignKeyConstraint0.getUpdateRule());
      assertEquals("Restrict delete:\n Parent cannot be deleted if children exist", string0);
  }

  /**
  //Test case number: 28
  /*Coverage entropy=0.796311640173813
  */
  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      ForeignKeyConstraint foreignKeyConstraint0 = new ForeignKeyConstraint((Table) null, "s", 24, 0);
      String string0 = foreignKeyConstraint0.getDeleteRuleDescription();
      assertEquals(24, foreignKeyConstraint0.getUpdateRule());
      assertEquals("Cascade on delete:\n Deletion of parent deletes child", string0);
  }

  /**
  //Test case number: 29
  /*Coverage entropy=0.7963116401738131
  */
  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      ForeignKeyConstraint foreignKeyConstraint0 = new ForeignKeyConstraint((Table) null, "", (-14), (-14));
      foreignKeyConstraint0.getDeleteRuleName();
      assertEquals((-14), foreignKeyConstraint0.getDeleteRule());
      assertEquals((-14), foreignKeyConstraint0.getUpdateRule());
  }

  /**
  //Test case number: 30
  /*Coverage entropy=0.7963116401738131
  */
  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      ForeignKeyConstraint foreignKeyConstraint0 = new ForeignKeyConstraint((Table) null, "", 3, 3);
      String string0 = foreignKeyConstraint0.getDeleteRuleName();
      assertEquals(3, foreignKeyConstraint0.getUpdateRule());
      assertEquals("Restrict delete", string0);
  }

  /**
  //Test case number: 31
  /*Coverage entropy=0.7963116401738131
  */
  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      ForeignKeyConstraint foreignKeyConstraint0 = new ForeignKeyConstraint((Table) null, "Restrict deZslete", 2, 2);
      String string0 = foreignKeyConstraint0.getDeleteRuleName();
      assertEquals("Null on delete", string0);
      assertEquals(2, foreignKeyConstraint0.getUpdateRule());
  }

  /**
  //Test case number: 32
  /*Coverage entropy=0.7963116401738131
  */
  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      ForeignKeyConstraint foreignKeyConstraint0 = new ForeignKeyConstraint((Table) null, "", 1, 1);
      String string0 = foreignKeyConstraint0.getDeleteRuleName();
      assertEquals("Restrict delete", string0);
      assertEquals(1, foreignKeyConstraint0.getUpdateRule());
  }

  /**
  //Test case number: 33
  /*Coverage entropy=0.7963116401738131
  */
  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      ForeignKeyConstraint foreignKeyConstraint0 = new ForeignKeyConstraint((Table) null, "s", 10, 0);
      String string0 = foreignKeyConstraint0.getDeleteRuleName();
      assertEquals("Cascade on delete", string0);
      assertEquals(10, foreignKeyConstraint0.getUpdateRule());
  }

  /**
  //Test case number: 34
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      ForeignKeyConstraint foreignKeyConstraint0 = new ForeignKeyConstraint((Table) null, "Resrict deZslet", 2, 2);
      boolean boolean0 = foreignKeyConstraint0.isNullOnDelete();
      assertEquals(2, foreignKeyConstraint0.getUpdateRule());
      assertTrue(boolean0);
  }

  /**
  //Test case number: 35
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      ForeignKeyConstraint foreignKeyConstraint0 = new ForeignKeyConstraint((Table) null, "Restrict deZslete", 6, 6);
      boolean boolean0 = foreignKeyConstraint0.isNullOnDelete();
      assertFalse(boolean0);
      assertEquals(6, foreignKeyConstraint0.getUpdateRule());
      assertEquals(6, foreignKeyConstraint0.getDeleteRule());
  }

  /**
  //Test case number: 36
  /*Coverage entropy=1.0397207708399179
  */
  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      ForeignKeyConstraint foreignKeyConstraint0 = new ForeignKeyConstraint((Table) null, "", 1, 1);
      boolean boolean0 = foreignKeyConstraint0.isRestrictDelete();
      assertEquals(1, foreignKeyConstraint0.getUpdateRule());
      assertTrue(boolean0);
  }

  /**
  //Test case number: 37
  /*Coverage entropy=1.0397207708399179
  */
  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      ForeignKeyConstraint foreignKeyConstraint0 = new ForeignKeyConstraint((Table) null, "", (-729), 672);
      boolean boolean0 = foreignKeyConstraint0.isRestrictDelete();
      assertEquals(672, foreignKeyConstraint0.getDeleteRule());
      assertEquals((-729), foreignKeyConstraint0.getUpdateRule());
      assertFalse(boolean0);
  }

  /**
  //Test case number: 38
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      ForeignKeyConstraint foreignKeyConstraint0 = new ForeignKeyConstraint((Table) null, "Restrict deZslete", 3, 3);
      boolean boolean0 = foreignKeyConstraint0.isRestrictDelete();
      assertEquals(3, foreignKeyConstraint0.getUpdateRule());
      assertTrue(boolean0);
  }

  /**
  //Test case number: 39
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      ForeignKeyConstraint foreignKeyConstraint0 = new ForeignKeyConstraint((Table) null, "s", 10, 0);
      boolean boolean0 = foreignKeyConstraint0.isCascadeOnDelete();
      assertEquals(10, foreignKeyConstraint0.getUpdateRule());
      assertTrue(boolean0);
  }

  /**
  //Test case number: 40
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      ForeignKeyConstraint foreignKeyConstraint0 = new ForeignKeyConstraint((Table) null, "xDv76$4#MjU", (-1974), (-1974));
      boolean boolean0 = foreignKeyConstraint0.isCascadeOnDelete();
      assertEquals((-1974), foreignKeyConstraint0.getDeleteRule());
      assertFalse(boolean0);
      assertEquals((-1974), foreignKeyConstraint0.getUpdateRule());
  }

  /**
  //Test case number: 41
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      ForeignKeyConstraint foreignKeyConstraint0 = new ForeignKeyConstraint((Table) null, "", 3, 38);
      foreignKeyConstraint0.addChildColumn((TableColumn) null);
      assertEquals(3, foreignKeyConstraint0.getUpdateRule());
      assertEquals(38, foreignKeyConstraint0.getDeleteRule());
  }

  /**
  //Test case number: 42
  /*Coverage entropy=1.6094379124341005
  */
  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
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
  //Test case number: 43
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      ForeignKeyConstraint foreignKeyConstraint0 = new ForeignKeyConstraint((Table) null, "", (-729), 672);
      int int0 = foreignKeyConstraint0.getUpdateRule();
      assertEquals(672, foreignKeyConstraint0.getDeleteRule());
      assertEquals((-729), int0);
  }

  /**
  //Test case number: 44
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      ForeignKeyConstraint foreignKeyConstraint0 = new ForeignKeyConstraint((Table) null, "xDv76$4#MjU", 9, (-1974));
      boolean boolean0 = foreignKeyConstraint0.isImplied();
      assertFalse(boolean0);
      assertEquals(9, foreignKeyConstraint0.getUpdateRule());
      assertEquals((-1974), foreignKeyConstraint0.getDeleteRule());
  }

  /**
  //Test case number: 45
  /*Coverage entropy=0.796311640173813
  */
  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      ForeignKeyConstraint foreignKeyConstraint0 = new ForeignKeyConstraint((Table) null, "Adding foreign key constraint '", 67, 67);
      foreignKeyConstraint0.getDeleteRuleDescription();
      assertEquals(67, foreignKeyConstraint0.getUpdateRule());
      assertEquals(67, foreignKeyConstraint0.getDeleteRule());
  }

  /**
  //Test case number: 46
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      ForeignKeyConstraint foreignKeyConstraint0 = new ForeignKeyConstraint((Table) null, (String) null, 2, 2);
      foreignKeyConstraint0.getName();
      assertEquals("N", foreignKeyConstraint0.getDeleteRuleAlias());
      assertEquals(2, foreignKeyConstraint0.getUpdateRule());
  }

  /**
  //Test case number: 47
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      ForeignKeyConstraint foreignKeyConstraint0 = new ForeignKeyConstraint((Table) null, "xDv6$#MjU", (-2), (-1979));
      foreignKeyConstraint0.getChildTable();
      assertEquals((-2), foreignKeyConstraint0.getUpdateRule());
      assertEquals((-1979), foreignKeyConstraint0.getDeleteRule());
  }

  /**
  //Test case number: 48
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      ForeignKeyConstraint foreignKeyConstraint0 = new ForeignKeyConstraint((Table) null, "s:IF]2Y=AoR?cW,aBv!", 0, 0);
      foreignKeyConstraint0.getParentColumns();
      assertEquals(0, foreignKeyConstraint0.getUpdateRule());
      assertEquals(0, foreignKeyConstraint0.getDeleteRule());
  }

  /**
  //Test case number: 49
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      ForeignKeyConstraint foreignKeyConstraint0 = new ForeignKeyConstraint((Table) null, "", (-14), (-14));
      foreignKeyConstraint0.getParentTable();
      assertEquals((-14), foreignKeyConstraint0.getUpdateRule());
      assertEquals((-14), foreignKeyConstraint0.getDeleteRule());
  }

  /**
  //Test case number: 50
  /*Coverage entropy=1.6094379124341005
  */
  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
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
  //Test case number: 51
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      ForeignKeyConstraint foreignKeyConstraint0 = new ForeignKeyConstraint((Table) null, "s:IF]2Y=AoR?cW,aBv!", 0, 0);
      List<TableColumn> list0 = foreignKeyConstraint0.getChildColumns();
      ForeignKeyConstraint.toString(list0);
      assertEquals("C", foreignKeyConstraint0.getDeleteRuleAlias());
      assertEquals(0, foreignKeyConstraint0.getUpdateRule());
      assertEquals(0, foreignKeyConstraint0.getDeleteRule());
  }
}
