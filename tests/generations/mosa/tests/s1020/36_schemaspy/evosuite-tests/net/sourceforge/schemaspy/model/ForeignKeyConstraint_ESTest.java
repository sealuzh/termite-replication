/*
 * This file was automatically generated by EvoSuite
 * Thu Nov 14 20:29:46 GMT 2019
 */

package net.sourceforge.schemaspy.model;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.sql.Connection;
import java.sql.DatabaseMetaData;
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
  /*Coverage entropy=1.5179872908529677
  */
  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      ForeignKeyConstraint foreignKeyConstraint0 = new ForeignKeyConstraint((Table) null, "UFA oQ@#@wh%q,dbeI0", 2, 825);
      LinkedList<TableColumn> linkedList0 = new LinkedList<TableColumn>();
      TableColumnMeta tableColumnMeta0 = mock(TableColumnMeta.class, new ViolatedAssumptionAnswer());
      doReturn("UFA oQ@#@wh%q,dbeI0").when(tableColumnMeta0).getComments();
      doReturn("UFA oQ@#@wh%q,dbeI0").when(tableColumnMeta0).getDefaultValue();
      doReturn(4471).when(tableColumnMeta0).getDigits();
      doReturn("~_qh=bLL& !H`").when(tableColumnMeta0).getId();
      doReturn("").when(tableColumnMeta0).getName();
      doReturn(2).when(tableColumnMeta0).getSize();
      doReturn("~_qh=bLL& !H`").when(tableColumnMeta0).getType();
      doReturn(false).when(tableColumnMeta0).isAutoUpdated();
      doReturn(false).when(tableColumnMeta0).isNullable();
      TableColumn tableColumn0 = new TableColumn((Table) null, tableColumnMeta0);
      linkedList0.addLast(tableColumn0);
      ForeignKeyConstraint.toString((List<TableColumn>) linkedList0);
      foreignKeyConstraint0.getDeleteRuleAlias();
      assertEquals(825, foreignKeyConstraint0.getDeleteRule());
      assertEquals(2, foreignKeyConstraint0.getUpdateRule());
  }

  /**
  //Test case number: 1
  /*Coverage entropy=1.2961346570528898
  */
  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      ForeignKeyConstraint foreignKeyConstraint0 = new ForeignKeyConstraint((Table) null, "", 3, 3);
      String string0 = foreignKeyConstraint0.getDeleteRuleAlias();
      assertEquals("R", string0);
      assertEquals(3, foreignKeyConstraint0.getUpdateRule());
  }

  /**
  //Test case number: 2
  /*Coverage entropy=1.5271837172395382
  */
  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      ForeignKeyConstraint foreignKeyConstraint0 = new ForeignKeyConstraint((Table) null, "w <clCY*Wa';c]", 0, 0);
      boolean boolean0 = foreignKeyConstraint0.isImplied();
      assertFalse(boolean0);
      
      int int0 = foreignKeyConstraint0.getUpdateRule();
      assertEquals(0, int0);
      assertEquals("C", foreignKeyConstraint0.getDeleteRuleAlias());
  }

  /**
  //Test case number: 3
  /*Coverage entropy=1.2961346570528898
  */
  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      ForeignKeyConstraint foreignKeyConstraint0 = new ForeignKeyConstraint((Table) null, "", 1368, 3);
      String string0 = foreignKeyConstraint0.getDeleteRuleName();
      assertEquals(1368, foreignKeyConstraint0.getUpdateRule());
      assertEquals("Restrict delete", string0);
  }

  /**
  //Test case number: 4
  /*Coverage entropy=0.42857142857142855
  */
  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      ForeignKeyConstraint foreignKeyConstraint0 = new ForeignKeyConstraint((Table) null, "rC'peI[X{&!", 2, 2);
      String string0 = foreignKeyConstraint0.getDeleteRuleAlias();
      assertEquals(2, foreignKeyConstraint0.getUpdateRule());
      assertEquals("N", string0);
  }

  /**
  //Test case number: 5
  /*Coverage entropy=0.42857142857142855
  */
  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      ForeignKeyConstraint foreignKeyConstraint0 = new ForeignKeyConstraint((Table) null, "dD9nn73]WJ]GWJf.", 2, 0);
      String string0 = foreignKeyConstraint0.getDeleteRuleAlias();
      assertEquals(2, foreignKeyConstraint0.getUpdateRule());
      assertEquals("C", string0);
  }

  /**
  //Test case number: 6
  /*Coverage entropy=0.42857142857142855
  */
  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      ForeignKeyConstraint foreignKeyConstraint0 = new ForeignKeyConstraint((Table) null, "rC'/eI[X`&!", 2, 2);
      String string0 = foreignKeyConstraint0.getDeleteRuleName();
      assertEquals(2, foreignKeyConstraint0.getUpdateRule());
      assertEquals("Null on delete", string0);
  }

  /**
  //Test case number: 7
  /*Coverage entropy=0.3333333333333333
  */
  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
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
  //Test case number: 8
  /*Coverage entropy=1.5271837172395382
  */
  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      ForeignKeyConstraint foreignKeyConstraint0 = new ForeignKeyConstraint((Table) null, "Z_", 2, 2);
      boolean boolean0 = foreignKeyConstraint0.isNullOnDelete();
      assertEquals(2, foreignKeyConstraint0.getUpdateRule());
      assertTrue(boolean0);
  }

  /**
  //Test case number: 9
  /*Coverage entropy=1.0931471805599453
  */
  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      ForeignKeyConstraint foreignKeyConstraint0 = new ForeignKeyConstraint((Table) null, "", (-1534), (-1534));
      int int0 = foreignKeyConstraint0.getUpdateRule();
      assertEquals((-1534), int0);
      assertEquals((-1534), foreignKeyConstraint0.getDeleteRule());
  }

  /**
  //Test case number: 10
  /*Coverage entropy=2.053882356878545
  */
  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
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
  //Test case number: 11
  /*Coverage entropy=1.5271837172395382
  */
  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      ForeignKeyConstraint foreignKeyConstraint0 = new ForeignKeyConstraint((Table) null, "", 3, 3);
      boolean boolean0 = foreignKeyConstraint0.isRestrictDelete();
      assertTrue(boolean0);
      assertEquals(3, foreignKeyConstraint0.getUpdateRule());
  }

  /**
  //Test case number: 12
  /*Coverage entropy=0.3333333333333333
  */
  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
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
  //Test case number: 13
  /*Coverage entropy=1.2961346570528898
  */
  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      ForeignKeyConstraint foreignKeyConstraint0 = new ForeignKeyConstraint((Table) null, "", 2, 3);
      String string0 = foreignKeyConstraint0.getDeleteRuleDescription();
      assertEquals(2, foreignKeyConstraint0.getUpdateRule());
      assertEquals("Restrict delete:\n Parent cannot be deleted if children exist", string0);
  }

  /**
  //Test case number: 14
  /*Coverage entropy=0.42857142857142855
  */
  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      ForeignKeyConstraint foreignKeyConstraint0 = new ForeignKeyConstraint((Table) null, "rC'/eI[X`&!", 801, 801);
      foreignKeyConstraint0.getDeleteRuleAlias();
      assertEquals(801, foreignKeyConstraint0.getDeleteRule());
      assertEquals(801, foreignKeyConstraint0.getUpdateRule());
  }

  /**
  //Test case number: 15
  /*Coverage entropy=0.42857142857142855
  */
  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      ForeignKeyConstraint foreignKeyConstraint0 = new ForeignKeyConstraint((Table) null, (String) null, 1, 1);
      String string0 = foreignKeyConstraint0.getDeleteRuleAlias();
      assertEquals(1, foreignKeyConstraint0.getUpdateRule());
      assertEquals("R", string0);
  }

  /**
  //Test case number: 16
  /*Coverage entropy=2.253297930766516
  */
  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Connection connection0 = mock(Connection.class, new ViolatedAssumptionAnswer());
      ForeignKeyConstraint foreignKeyConstraint0 = new ForeignKeyConstraint((Table) null, "c", 25, 25);
      boolean boolean0 = foreignKeyConstraint0.isCascadeOnDelete();
      foreignKeyConstraint0.getParentColumns();
      foreignKeyConstraint0.getName();
      boolean boolean1 = foreignKeyConstraint0.isReal();
      assertEquals(25, foreignKeyConstraint0.getUpdateRule());
      assertFalse(boolean1 == boolean0);
      assertEquals(25, foreignKeyConstraint0.getDeleteRule());
      assertTrue(boolean1);
  }

  /**
  //Test case number: 17
  /*Coverage entropy=1.0931471805599453
  */
  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      ForeignKeyConstraint foreignKeyConstraint0 = new ForeignKeyConstraint((Table) null, "rC'peI[X{&!", 2, 2);
      int int0 = foreignKeyConstraint0.getUpdateRule();
      assertTrue(foreignKeyConstraint0.isNullOnDelete());
      assertEquals(2, int0);
  }

  /**
  //Test case number: 18
  /*Coverage entropy=1.543056733112554
  */
  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      ForeignKeyConstraint foreignKeyConstraint0 = new ForeignKeyConstraint((Table) null, "lc", 0, 0);
      ForeignKeyConstraint foreignKeyConstraint1 = new ForeignKeyConstraint((Table) null, "^TERzCT", 1182, 645);
      assertFalse(foreignKeyConstraint1.isCascadeOnDelete());
      assertEquals(645, foreignKeyConstraint1.getDeleteRule());
      assertEquals(1182, foreignKeyConstraint1.getUpdateRule());
      
      boolean boolean0 = foreignKeyConstraint0.isCascadeOnDelete();
      assertTrue(boolean0);
  }

  /**
  //Test case number: 19
  /*Coverage entropy=1.5271837172395382
  */
  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      ForeignKeyConstraint foreignKeyConstraint0 = new ForeignKeyConstraint((Table) null, "B&T_LENG]TH", (-2474), (-2474));
      boolean boolean0 = foreignKeyConstraint0.isCascadeOnDelete();
      assertEquals((-2474), foreignKeyConstraint0.getUpdateRule());
      assertFalse(boolean0);
      assertEquals((-2474), foreignKeyConstraint0.getDeleteRule());
  }

  /**
  //Test case number: 20
  /*Coverage entropy=1.4942662253853725
  */
  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      ForeignKeyConstraint foreignKeyConstraint0 = new ForeignKeyConstraint((Table) null, "w <elCY*Wa'h;cV", 1390, 1390);
      ForeignKeyConstraint foreignKeyConstraint1 = new ForeignKeyConstraint((Table) null, "", 1390, 1390);
      int int0 = foreignKeyConstraint1.compareTo(foreignKeyConstraint0);
      assertEquals((-15), int0);
      assertEquals(1390, foreignKeyConstraint1.getDeleteRule());
      assertEquals(1390, foreignKeyConstraint1.getUpdateRule());
  }

  /**
  //Test case number: 21
  /*Coverage entropy=0.45454545454545453
  */
  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      ForeignKeyConstraint foreignKeyConstraint0 = new ForeignKeyConstraint((Table) null, ";", 2421, 2421);
      ForeignKeyConstraint foreignKeyConstraint1 = new ForeignKeyConstraint((Table) null, "", 2421, 2421);
      int int0 = foreignKeyConstraint0.compareTo(foreignKeyConstraint1);
      assertEquals(2421, foreignKeyConstraint1.getUpdateRule());
      assertEquals(2421, foreignKeyConstraint1.getDeleteRule());
      assertEquals(1, int0);
  }

  /**
  //Test case number: 22
  /*Coverage entropy=2.253297930766516
  */
  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      ForeignKeyConstraint foreignKeyConstraint0 = new ForeignKeyConstraint((Table) null, "", 57, 57);
      boolean boolean0 = foreignKeyConstraint0.isCascadeOnDelete();
      foreignKeyConstraint0.getParentColumns();
      foreignKeyConstraint0.getName();
      boolean boolean1 = foreignKeyConstraint0.isReal();
      assertEquals(57, foreignKeyConstraint0.getUpdateRule());
      assertFalse(boolean1 == boolean0);
      assertEquals(57, foreignKeyConstraint0.getDeleteRule());
      assertTrue(boolean1);
  }

  /**
  //Test case number: 23
  /*Coverage entropy=1.5271837172395382
  */
  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      ForeignKeyConstraint foreignKeyConstraint0 = new ForeignKeyConstraint((Table) null, "dD9nn73]WJ]GWJf.", 2, 2);
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
  /*Coverage entropy=0.4
  */
  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      ForeignKeyConstraint foreignKeyConstraint0 = new ForeignKeyConstraint((Table) null, "w <elCY*Wa';cV", 11, 11);
      int int0 = foreignKeyConstraint0.compareTo(foreignKeyConstraint0);
      assertEquals(11, foreignKeyConstraint0.getUpdateRule());
      assertEquals(0, int0);
      assertEquals(11, foreignKeyConstraint0.getDeleteRule());
  }

  /**
  //Test case number: 25
  /*Coverage entropy=2.027377075708073
  */
  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      ForeignKeyConstraint foreignKeyConstraint0 = new ForeignKeyConstraint((Table) null, (String) null, 1, 1);
      LinkedList<TableColumn> linkedList0 = new LinkedList<TableColumn>();
      boolean boolean0 = foreignKeyConstraint0.isCascadeOnDelete();
      assertFalse(boolean0);
      
      foreignKeyConstraint0.getName();
      boolean boolean1 = foreignKeyConstraint0.isRestrictDelete();
      assertEquals(1, foreignKeyConstraint0.getUpdateRule());
      assertTrue(boolean1);
  }

  /**
  //Test case number: 26
  /*Coverage entropy=1.1546856420984069
  */
  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      ForeignKeyConstraint foreignKeyConstraint0 = new ForeignKeyConstraint((Table) null, "w <elCY*Wa';cV", 1, 1);
      ForeignKeyConstraint foreignKeyConstraint1 = new ForeignKeyConstraint((Table) null, "w <elCY*Wa';cV", 1, 1);
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
  //Test case number: 27
  /*Coverage entropy=0.4444444444444445
  */
  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      ForeignKeyConstraint foreignKeyConstraint0 = new ForeignKeyConstraint((Table) null, "KLmjk3zDljT:#R:%Yhi", 0, 0);
      boolean boolean0 = foreignKeyConstraint0.isReal();
      assertTrue(boolean0);
      
      String string0 = foreignKeyConstraint0.getDeleteRuleDescription();
      assertEquals("Cascade on delete:\n Deletion of parent deletes child", string0);
      assertEquals(0, foreignKeyConstraint0.getUpdateRule());
  }

  /**
  //Test case number: 28
  /*Coverage entropy=1.0931471805599453
  */
  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      ForeignKeyConstraint foreignKeyConstraint0 = new ForeignKeyConstraint((Table) null, (String) null, (-22), (-22));
      Integer integer0 = new Integer((-22));
      int int0 = foreignKeyConstraint0.getDeleteRule();
      assertEquals((-22), int0);
      assertEquals((-22), foreignKeyConstraint0.getUpdateRule());
  }

  /**
  //Test case number: 29
  /*Coverage entropy=1.0931471805599453
  */
  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      Connection connection0 = mock(Connection.class, new ViolatedAssumptionAnswer());
      DatabaseMetaData databaseMetaData0 = mock(DatabaseMetaData.class, new ViolatedAssumptionAnswer());
      ForeignKeyConstraint foreignKeyConstraint0 = new ForeignKeyConstraint((Table) null, "G Wg", 94, 0);
      Integer integer0 = new Integer(94);
      int int0 = foreignKeyConstraint0.getDeleteRule();
      assertEquals(0, int0);
      assertEquals(94, foreignKeyConstraint0.getUpdateRule());
  }

  /**
  //Test case number: 30
  /*Coverage entropy=1.1375916250043898
  */
  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      ForeignKeyConstraint foreignKeyConstraint0 = new ForeignKeyConstraint((Table) null, "w <elCY*Wa';cV", 0, 0);
      String string0 = foreignKeyConstraint0.getDeleteRuleName();
      assertEquals("Cascade on delete", string0);
      
      boolean boolean0 = foreignKeyConstraint0.isImplied();
      assertFalse(boolean0);
      assertEquals(0, foreignKeyConstraint0.getUpdateRule());
  }

  /**
  //Test case number: 31
  /*Coverage entropy=1.0931471805599453
  */
  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      ForeignKeyConstraint foreignKeyConstraint0 = new ForeignKeyConstraint((Table) null, (String) null, (-2365), (-2365));
      foreignKeyConstraint0.addChildColumn((TableColumn) null);
      assertEquals((-2365), foreignKeyConstraint0.getUpdateRule());
      assertEquals((-2365), foreignKeyConstraint0.getDeleteRule());
  }

  /**
  //Test case number: 32
  /*Coverage entropy=1.5271837172395382
  */
  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      ForeignKeyConstraint foreignKeyConstraint0 = new ForeignKeyConstraint((Table) null, "w <elCY*Wa';cV", 1, 1);
      foreignKeyConstraint0.addParentColumn((TableColumn) null);
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
  //Test case number: 33
  /*Coverage entropy=0.4
  */
  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      ForeignKeyConstraint foreignKeyConstraint0 = new ForeignKeyConstraint((Table) null, "Cascade on delete", 146, 146);
      foreignKeyConstraint0.getParentTable();
      assertEquals(146, foreignKeyConstraint0.getDeleteRule());
      assertEquals(146, foreignKeyConstraint0.getUpdateRule());
  }

  /**
  //Test case number: 34
  /*Coverage entropy=0.3333333333333333
  */
  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      LinkedList<TableColumn> linkedList0 = new LinkedList<TableColumn>();
      String string0 = ForeignKeyConstraint.toString((List<TableColumn>) linkedList0);
      assertNotNull(string0);
  }

  /**
  //Test case number: 35
  /*Coverage entropy=0.4444444444444445
  */
  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
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
  //Test case number: 36
  /*Coverage entropy=1.0931471805599453
  */
  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      ForeignKeyConstraint foreignKeyConstraint0 = new ForeignKeyConstraint((Table) null, (String) null, 1, 1);
      int int0 = foreignKeyConstraint0.getDeleteRule();
      assertEquals(1, foreignKeyConstraint0.getUpdateRule());
      assertEquals(1, int0);
  }

  /**
  //Test case number: 37
  /*Coverage entropy=1.5271837172395382
  */
  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      ForeignKeyConstraint foreignKeyConstraint0 = new ForeignKeyConstraint((Table) null, (String) null, 1178, 1178);
      boolean boolean0 = foreignKeyConstraint0.isNullOnDelete();
      assertEquals(1178, foreignKeyConstraint0.getDeleteRule());
      assertFalse(boolean0);
      assertEquals(1178, foreignKeyConstraint0.getUpdateRule());
  }

  /**
  //Test case number: 38
  /*Coverage entropy=1.4841652152843623
  */
  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      ForeignKeyConstraint foreignKeyConstraint0 = new ForeignKeyConstraint((Table) null, "E*", 2938, 2938);
      boolean boolean0 = foreignKeyConstraint0.isRestrictDelete();
      assertEquals(2938, foreignKeyConstraint0.getDeleteRule());
      assertFalse(boolean0);
      assertEquals(2938, foreignKeyConstraint0.getUpdateRule());
  }

  /**
  //Test case number: 39
  /*Coverage entropy=0.42857142857142855
  */
  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      ForeignKeyConstraint foreignKeyConstraint0 = new ForeignKeyConstraint((Table) null, "rC'/eI[X`&!", 2, 2);
      String string0 = foreignKeyConstraint0.getDeleteRuleDescription();
      assertEquals("Null on delete:\n Foreign key to parent set to NULL when parent deleted", string0);
      assertEquals(2, foreignKeyConstraint0.getUpdateRule());
  }

  /**
  //Test case number: 40
  /*Coverage entropy=0.42857142857142855
  */
  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      ForeignKeyConstraint foreignKeyConstraint0 = new ForeignKeyConstraint((Table) null, ";", 2455, 2455);
      foreignKeyConstraint0.getDeleteRuleDescription();
      assertEquals(2455, foreignKeyConstraint0.getDeleteRule());
      assertEquals(2455, foreignKeyConstraint0.getUpdateRule());
  }

  /**
  //Test case number: 41
  /*Coverage entropy=0.42857142857142855
  */
  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      ForeignKeyConstraint foreignKeyConstraint0 = new ForeignKeyConstraint((Table) null, (String) null, 1, 1);
      String string0 = foreignKeyConstraint0.getDeleteRuleDescription();
      assertEquals("Restrict delete:\n Parent cannot be deleted if children exist", string0);
      assertEquals(1, foreignKeyConstraint0.getUpdateRule());
  }

  /**
  //Test case number: 42
  /*Coverage entropy=0.42857142857142855
  */
  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      ForeignKeyConstraint foreignKeyConstraint0 = new ForeignKeyConstraint((Table) null, (String) null, 21, 21);
      foreignKeyConstraint0.getDeleteRuleName();
      assertEquals(21, foreignKeyConstraint0.getDeleteRule());
      assertEquals(21, foreignKeyConstraint0.getUpdateRule());
  }

  /**
  //Test case number: 43
  /*Coverage entropy=0.42857142857142855
  */
  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      ForeignKeyConstraint foreignKeyConstraint0 = new ForeignKeyConstraint((Table) null, (String) null, 1, 1);
      boolean boolean0 = foreignKeyConstraint0.isNullOnDelete();
      assertEquals(1, foreignKeyConstraint0.getUpdateRule());
      assertFalse(boolean0);
      assertTrue(foreignKeyConstraint0.isRestrictDelete());
  }

  /**
  //Test case number: 44
  /*Coverage entropy=0.4444444444444445
  */
  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      ForeignKeyConstraint foreignKeyConstraint0 = new ForeignKeyConstraint((Table) null, "", (-1534), (-1534));
      boolean boolean0 = foreignKeyConstraint0.isRestrictDelete();
      assertEquals((-1534), foreignKeyConstraint0.getUpdateRule());
      assertFalse(boolean0);
      assertEquals((-1534), foreignKeyConstraint0.getDeleteRule());
  }

  /**
  //Test case number: 45
  /*Coverage entropy=0.42857142857142855
  */
  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      ForeignKeyConstraint foreignKeyConstraint0 = new ForeignKeyConstraint((Table) null, (String) null, 1, 1);
      String string0 = foreignKeyConstraint0.getDeleteRuleName();
      assertEquals("Restrict delete", string0);
      assertEquals(1, foreignKeyConstraint0.getUpdateRule());
  }

  /**
  //Test case number: 46
  /*Coverage entropy=0.4
  */
  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      ForeignKeyConstraint foreignKeyConstraint0 = new ForeignKeyConstraint((Table) null, "", 2, 2);
      foreignKeyConstraint0.getChildColumns();
      assertTrue(foreignKeyConstraint0.isNullOnDelete());
      assertEquals(2, foreignKeyConstraint0.getUpdateRule());
  }

  /**
  //Test case number: 47
  /*Coverage entropy=0.4
  */
  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      ForeignKeyConstraint foreignKeyConstraint0 = new ForeignKeyConstraint((Table) null, "", 1, 1);
      foreignKeyConstraint0.getChildTable();
      assertEquals(1, foreignKeyConstraint0.getUpdateRule());
      assertEquals("Restrict delete:\n Parent cannot be deleted if children exist", foreignKeyConstraint0.getDeleteRuleDescription());
  }

  /**
  //Test case number: 48
  /*Coverage entropy=0.0
  */
  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      ForeignKeyConstraint foreignKeyConstraint0 = null;
      try {
        foreignKeyConstraint0 = new ForeignKeyConstraint((TableColumn) null, (TableColumn) null, (-10), (-10));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("net.sourceforge.schemaspy.model.ForeignKeyConstraint", e);
      }
  }
}
