/*
 * This file was automatically generated by EvoSuite
 * Tue Dec 03 01:19:58 GMT 2019
 */

package net.sourceforge.schemaspy.model;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.ResultSet;
import java.util.LinkedList;
import java.util.List;
import net.sourceforge.schemaspy.Config;
import net.sourceforge.schemaspy.model.ForeignKeyConstraint;
import net.sourceforge.schemaspy.model.Table;
import net.sourceforge.schemaspy.model.TableColumn;
import net.sourceforge.schemaspy.model.xml.SchemaMeta;
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
  /*Coverage entropy=1.5271837172395382
  */
  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      ForeignKeyConstraint foreignKeyConstraint0 = new ForeignKeyConstraint((Table) null, "d^+;0sgm", 0, 0);
      boolean boolean0 = foreignKeyConstraint0.isReal();
      assertTrue(boolean0);
      
      int int0 = foreignKeyConstraint0.getUpdateRule();
      assertEquals(0, int0);
      assertEquals("C", foreignKeyConstraint0.getDeleteRuleAlias());
  }

  /**
  //Test case number: 1
  /*Coverage entropy=0.3333333333333333
  */
  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      LinkedList<TableColumn> linkedList0 = new LinkedList<TableColumn>();
      TableColumnMeta tableColumnMeta0 = mock(TableColumnMeta.class, new ViolatedAssumptionAnswer());
      doReturn((String) null).when(tableColumnMeta0).getComments();
      doReturn((String) null).when(tableColumnMeta0).getDefaultValue();
      doReturn(1401).when(tableColumnMeta0).getDigits();
      doReturn("").when(tableColumnMeta0).getId();
      doReturn("").when(tableColumnMeta0).getName();
      doReturn(1401).when(tableColumnMeta0).getSize();
      doReturn((String) null).when(tableColumnMeta0).getType();
      doReturn(false).when(tableColumnMeta0).isAutoUpdated();
      doReturn(false).when(tableColumnMeta0).isNullable();
      TableColumn tableColumn0 = new TableColumn((Table) null, tableColumnMeta0);
      linkedList0.add(tableColumn0);
      String string0 = ForeignKeyConstraint.toString((List<TableColumn>) linkedList0);
      assertEquals("", string0);
  }

  /**
  //Test case number: 2
  /*Coverage entropy=0.42857142857142855
  */
  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      ForeignKeyConstraint foreignKeyConstraint0 = new ForeignKeyConstraint((Table) null, "d^+;0sgm", 0, 0);
      foreignKeyConstraint0.isReal();
      foreignKeyConstraint0.getDeleteRule();
      System.setCurrentTimeMillis((-1978L));
  }

  /**
  //Test case number: 3
  /*Coverage entropy=0.3333333333333333
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
  /*Coverage entropy=0.42857142857142855
  */
  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      ForeignKeyConstraint foreignKeyConstraint0 = new ForeignKeyConstraint((Table) null, "me2", 2, 2);
      String string0 = foreignKeyConstraint0.getDeleteRuleAlias();
      assertEquals("N", string0);
      assertEquals(2, foreignKeyConstraint0.getUpdateRule());
  }

  /**
  //Test case number: 5
  /*Coverage entropy=0.42857142857142855
  */
  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      ForeignKeyConstraint foreignKeyConstraint0 = new ForeignKeyConstraint((Table) null, "G([j", 1, 0);
      String string0 = foreignKeyConstraint0.getDeleteRuleName();
      assertEquals("Cascade on delete", string0);
      assertEquals(1, foreignKeyConstraint0.getUpdateRule());
  }

  /**
  //Test case number: 6
  /*Coverage entropy=0.42857142857142855
  */
  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      ForeignKeyConstraint foreignKeyConstraint0 = new ForeignKeyConstraint((Table) null, (String) null, 2, 2);
      foreignKeyConstraint0.getDeleteRuleDescription();
      String[] stringArray0 = new String[1];
      Config config0 = null;
      try {
        config0 = new Config(stringArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("net.sourceforge.schemaspy.Config", e);
      }
  }

  /**
  //Test case number: 7
  /*Coverage entropy=0.42857142857142855
  */
  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      ForeignKeyConstraint foreignKeyConstraint0 = new ForeignKeyConstraint((Table) null, "", 1, 2);
      String string0 = foreignKeyConstraint0.getDeleteRuleName();
      assertEquals("Null on delete", string0);
      assertEquals(1, foreignKeyConstraint0.getUpdateRule());
  }

  /**
  //Test case number: 8
  /*Coverage entropy=0.3333333333333333
  */
  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
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
  //Test case number: 9
  /*Coverage entropy=0.42857142857142855
  */
  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      String string0 = "GVHKb:hMX/[~gtQ";
      Config config0 = null;
      Connection connection0 = mock(Connection.class, new ViolatedAssumptionAnswer());
      DatabaseMetaData databaseMetaData0 = mock(DatabaseMetaData.class, new ViolatedAssumptionAnswer());
      ForeignKeyConstraint foreignKeyConstraint0 = new ForeignKeyConstraint((Table) null, "GVHKb:hMX/[~gtQ", 3, 3);
      foreignKeyConstraint0.getDeleteRuleName();
      String string1 = ";*<z`v:l9";
      String string2 = "Null on delete";
      SchemaMeta schemaMeta0 = null;
      try {
        schemaMeta0 = new SchemaMeta("", ";*<z`v:l9", "N5Lx-yxa");
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Meta directory \"\" must contain a file named \"N5Lx-yxa.meta.xml\"
         //
         verifyException("net.sourceforge.schemaspy.model.xml.SchemaMeta", e);
      }
  }

  /**
  //Test case number: 10
  /*Coverage entropy=0.42857142857142855
  */
  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      ForeignKeyConstraint foreignKeyConstraint0 = new ForeignKeyConstraint((Table) null, "", 3, 3);
      String string0 = foreignKeyConstraint0.getDeleteRuleAlias();
      assertEquals(3, foreignKeyConstraint0.getUpdateRule());
      assertEquals("R", string0);
  }

  /**
  //Test case number: 11
  /*Coverage entropy=0.42857142857142855
  */
  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      ForeignKeyConstraint foreignKeyConstraint0 = new ForeignKeyConstraint((Table) null, "", 3, 3);
      String string0 = foreignKeyConstraint0.getDeleteRuleDescription();
      assertEquals(3, foreignKeyConstraint0.getUpdateRule());
      assertEquals("Restrict delete:\n Parent cannot be deleted if children exist", string0);
  }

  /**
  //Test case number: 12
  /*Coverage entropy=0.4
  */
  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      ForeignKeyConstraint foreignKeyConstraint0 = new ForeignKeyConstraint((Table) null, "a$ jm!Zd(-K)", (-3554), (-3554));
      int int0 = foreignKeyConstraint0.getUpdateRule();
      assertEquals((-3554), foreignKeyConstraint0.getDeleteRule());
      assertEquals((-3554), int0);
  }

  /**
  //Test case number: 13
  /*Coverage entropy=0.4
  */
  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      ForeignKeyConstraint foreignKeyConstraint0 = new ForeignKeyConstraint((Table) null, "G([j", 1, 1);
      foreignKeyConstraint0.getChildTable();
      assertEquals(1, foreignKeyConstraint0.getUpdateRule());
      assertEquals("R", foreignKeyConstraint0.getDeleteRuleAlias());
  }

  /**
  //Test case number: 14
  /*Coverage entropy=0.45454545454545453
  */
  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      ForeignKeyConstraint foreignKeyConstraint0 = new ForeignKeyConstraint((Table) null, "3$aHG}", 1324, 1324);
      ForeignKeyConstraint foreignKeyConstraint1 = new ForeignKeyConstraint((Table) null, "IFXliFZ|tV9FYE$)(", 1324, 1324);
      int int0 = foreignKeyConstraint0.compareTo(foreignKeyConstraint1);
      assertEquals(1324, foreignKeyConstraint1.getDeleteRule());
      assertEquals((-54), int0);
      assertEquals(1324, foreignKeyConstraint1.getUpdateRule());
  }

  /**
  //Test case number: 15
  /*Coverage entropy=0.42857142857142855
  */
  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      ForeignKeyConstraint foreignKeyConstraint0 = new ForeignKeyConstraint((Table) null, "-scheBaHa", 1, 1);
      String string0 = foreignKeyConstraint0.getDeleteRuleName();
      assertEquals("Restrict delete", string0);
      assertEquals(1, foreignKeyConstraint0.getUpdateRule());
  }

  /**
  //Test case number: 16
  /*Coverage entropy=0.42857142857142855
  */
  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      ForeignKeyConstraint foreignKeyConstraint0 = new ForeignKeyConstraint((Table) null, "EwE'w|j_xWBFO+\"", (-916), (-916));
      foreignKeyConstraint0.getDeleteRuleDescription();
      assertEquals((-916), foreignKeyConstraint0.getUpdateRule());
      assertEquals((-916), foreignKeyConstraint0.getDeleteRule());
  }

  /**
  //Test case number: 17
  /*Coverage entropy=0.45454545454545453
  */
  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      ForeignKeyConstraint foreignKeyConstraint0 = new ForeignKeyConstraint((Table) null, "Sample usage using the default database type (implied -t ora):", 1324, 0);
      foreignKeyConstraint0.isReal();
      String string0 = foreignKeyConstraint0.getDeleteRuleDescription();
      assertEquals("Cascade on delete:\n Deletion of parent deletes child", string0);
      
      boolean boolean0 = foreignKeyConstraint0.isReal();
      assertEquals(1324, foreignKeyConstraint0.getUpdateRule());
      assertTrue(boolean0);
  }

  /**
  //Test case number: 18
  /*Coverage entropy=0.42857142857142855
  */
  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      ForeignKeyConstraint foreignKeyConstraint0 = new ForeignKeyConstraint((Table) null, "/KYaZB9Fw", 78, 0);
      String string0 = foreignKeyConstraint0.getDeleteRuleAlias();
      assertEquals(78, foreignKeyConstraint0.getUpdateRule());
      assertEquals("C", string0);
  }

  /**
  //Test case number: 19
  /*Coverage entropy=0.42857142857142855
  */
  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      ForeignKeyConstraint foreignKeyConstraint0 = new ForeignKeyConstraint((Table) null, "-scheBaHa", 1, 1);
      String string0 = foreignKeyConstraint0.getDeleteRuleAlias();
      assertEquals(1, foreignKeyConstraint0.getUpdateRule());
      assertEquals("R", string0);
  }

  /**
  //Test case number: 20
  /*Coverage entropy=0.42857142857142855
  */
  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      ForeignKeyConstraint foreignKeyConstraint0 = new ForeignKeyConstraint((Table) null, "-schemaHa", 1, 1);
      String string0 = foreignKeyConstraint0.getDeleteRuleDescription();
      assertEquals("Restrict delete:\n Parent cannot be deleted if children exist", string0);
      assertEquals(1, foreignKeyConstraint0.getUpdateRule());
  }

  /**
  //Test case number: 21
  /*Coverage entropy=0.42857142857142855
  */
  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      String string0 = "";
      int int0 = (-3554);
      ForeignKeyConstraint foreignKeyConstraint0 = new ForeignKeyConstraint((Table) null, "", (-3554), (-3554));
      foreignKeyConstraint0.getName();
      int int1 = new Integer((-3554));
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
  //Test case number: 22
  /*Coverage entropy=0.42857142857142855
  */
  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      ForeignKeyConstraint foreignKeyConstraint0 = new ForeignKeyConstraint((Table) null, "xFxiKC:3'`t", 2261, 2261);
      foreignKeyConstraint0.getDeleteRuleAlias();
      assertEquals(2261, foreignKeyConstraint0.getUpdateRule());
      assertEquals(2261, foreignKeyConstraint0.getDeleteRule());
  }

  /**
  //Test case number: 23
  /*Coverage entropy=0.4444444444444445
  */
  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
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
  //Test case number: 24
  /*Coverage entropy=1.1546856420984069
  */
  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      ForeignKeyConstraint foreignKeyConstraint0 = new ForeignKeyConstraint((Table) null, "3$aHG}", 1324, 1324);
      ForeignKeyConstraint foreignKeyConstraint1 = new ForeignKeyConstraint((Table) null, "3$aHG}", 1324, 1324);
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
  //Test case number: 25
  /*Coverage entropy=0.45454545454545453
  */
  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      ForeignKeyConstraint foreignKeyConstraint0 = new ForeignKeyConstraint((Table) null, "3$aHG}", 5758, 5758);
      ForeignKeyConstraint foreignKeyConstraint1 = new ForeignKeyConstraint((Table) null, "6S(gno3!", 5758, 5758);
      int int0 = foreignKeyConstraint1.compareTo(foreignKeyConstraint0);
      assertEquals(3, int0);
      assertEquals(5758, foreignKeyConstraint1.getDeleteRule());
      assertEquals(5758, foreignKeyConstraint1.getUpdateRule());
  }

  /**
  //Test case number: 26
  /*Coverage entropy=0.4444444444444445
  */
  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      ForeignKeyConstraint foreignKeyConstraint0 = new ForeignKeyConstraint((Table) null, "t{S@_7", (-3355), 1);
      boolean boolean0 = foreignKeyConstraint0.isRestrictDelete();
      assertEquals((-3355), foreignKeyConstraint0.getUpdateRule());
      assertTrue(boolean0);
  }

  /**
  //Test case number: 27
  /*Coverage entropy=0.42857142857142855
  */
  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      ForeignKeyConstraint foreignKeyConstraint0 = new ForeignKeyConstraint((Table) null, "3$aHG}", 185, 2);
      boolean boolean0 = foreignKeyConstraint0.isNullOnDelete();
      assertTrue(boolean0);
      assertEquals(185, foreignKeyConstraint0.getUpdateRule());
  }

  /**
  //Test case number: 28
  /*Coverage entropy=0.4
  */
  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      ForeignKeyConstraint foreignKeyConstraint0 = new ForeignKeyConstraint((Table) null, "xFxiKC:3'D~", 2261, 2261);
      int int0 = foreignKeyConstraint0.getUpdateRule();
      assertEquals(2261, int0);
      assertEquals(2261, foreignKeyConstraint0.getDeleteRule());
  }

  /**
  //Test case number: 29
  /*Coverage entropy=0.45454545454545453
  */
  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      ForeignKeyConstraint foreignKeyConstraint0 = new ForeignKeyConstraint((Table) null, "[~D0@?'8L w,i@d{(", 354, 0);
      boolean boolean0 = foreignKeyConstraint0.isCascadeOnDelete();
      assertTrue(boolean0);
      
      String string0 = foreignKeyConstraint0.getDeleteRuleDescription();
      assertEquals("Cascade on delete:\n Deletion of parent deletes child", string0);
      assertEquals(354, foreignKeyConstraint0.getUpdateRule());
  }

  /**
  //Test case number: 30
  /*Coverage entropy=0.4444444444444445
  */
  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      ForeignKeyConstraint foreignKeyConstraint0 = new ForeignKeyConstraint((Table) null, "d^+;0sgm", (-13), (-13));
      boolean boolean0 = foreignKeyConstraint0.isRestrictDelete();
      assertEquals((-13), foreignKeyConstraint0.getUpdateRule());
      assertEquals((-13), foreignKeyConstraint0.getDeleteRule());
      assertFalse(boolean0);
  }

  /**
  //Test case number: 31
  /*Coverage entropy=0.4444444444444445
  */
  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      ForeignKeyConstraint foreignKeyConstraint0 = new ForeignKeyConstraint((Table) null, "f", 2238, 2238);
      boolean boolean0 = foreignKeyConstraint0.isRestrictDelete();
      assertEquals(2238, foreignKeyConstraint0.getDeleteRule());
      assertFalse(boolean0);
      assertEquals(2238, foreignKeyConstraint0.getUpdateRule());
  }

  /**
  //Test case number: 32
  /*Coverage entropy=0.42857142857142855
  */
  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      ForeignKeyConstraint foreignKeyConstraint0 = new ForeignKeyConstraint((Table) null, "1>HBu9y", 3, 3);
      boolean boolean0 = foreignKeyConstraint0.isRestrictDelete();
      assertTrue(boolean0);
      assertEquals(3, foreignKeyConstraint0.getUpdateRule());
  }

  /**
  //Test case number: 33
  /*Coverage entropy=0.42857142857142855
  */
  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      ForeignKeyConstraint foreignKeyConstraint0 = new ForeignKeyConstraint((Table) null, "xFxiKC:3'`t", (-4885), (-4885));
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
  //Test case number: 34
  /*Coverage entropy=0.4
  */
  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      ForeignKeyConstraint foreignKeyConstraint0 = new ForeignKeyConstraint((Table) null, "3$aHG}", 1277, 1277);
      int int0 = foreignKeyConstraint0.compareTo(foreignKeyConstraint0);
      assertEquals(1277, foreignKeyConstraint0.getDeleteRule());
      assertEquals(1277, foreignKeyConstraint0.getUpdateRule());
      assertEquals(0, int0);
  }

  /**
  //Test case number: 35
  /*Coverage entropy=0.42857142857142855
  */
  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      ForeignKeyConstraint foreignKeyConstraint0 = new ForeignKeyConstraint((Table) null, "xFxiKC:3'`t", 2238, 2238);
      foreignKeyConstraint0.getDeleteRuleName();
      assertEquals(2238, foreignKeyConstraint0.getUpdateRule());
      assertEquals(2238, foreignKeyConstraint0.getDeleteRule());
  }

  /**
  //Test case number: 36
  /*Coverage entropy=0.4
  */
  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      ForeignKeyConstraint foreignKeyConstraint0 = new ForeignKeyConstraint((Table) null, (String) null, 2, (-584));
      int int0 = foreignKeyConstraint0.getDeleteRule();
      assertEquals((-584), int0);
      assertEquals(2, foreignKeyConstraint0.getUpdateRule());
  }

  /**
  //Test case number: 37
  /*Coverage entropy=0.4
  */
  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      ForeignKeyConstraint foreignKeyConstraint0 = new ForeignKeyConstraint((Table) null, "3$aHG}", 1, 1);
      boolean boolean0 = foreignKeyConstraint0.isImplied();
      assertEquals("Restrict delete:\n Parent cannot be deleted if children exist", foreignKeyConstraint0.getDeleteRuleDescription());
      assertEquals(1, foreignKeyConstraint0.getUpdateRule());
      assertFalse(boolean0);
  }

  /**
  //Test case number: 38
  /*Coverage entropy=0.42857142857142855
  */
  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      ForeignKeyConstraint foreignKeyConstraint0 = new ForeignKeyConstraint((Table) null, "Performance", (-3107), (-3107));
      boolean boolean0 = foreignKeyConstraint0.isCascadeOnDelete();
      assertEquals((-3107), foreignKeyConstraint0.getDeleteRule());
      assertFalse(boolean0);
      assertEquals((-3107), foreignKeyConstraint0.getUpdateRule());
  }

  /**
  //Test case number: 39
  /*Coverage entropy=0.42857142857142855
  */
  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      ForeignKeyConstraint foreignKeyConstraint0 = new ForeignKeyConstraint((Table) null, "xFxiKC:3'`t", 2236, 2236);
      boolean boolean0 = foreignKeyConstraint0.isCascadeOnDelete();
      assertEquals(2236, foreignKeyConstraint0.getUpdateRule());
      assertEquals(2236, foreignKeyConstraint0.getDeleteRule());
      assertFalse(boolean0);
  }

  /**
  //Test case number: 40
  /*Coverage entropy=0.4
  */
  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      ForeignKeyConstraint foreignKeyConstraint0 = new ForeignKeyConstraint((Table) null, (String) null, (-3441), (-3441));
      foreignKeyConstraint0.getParentTable();
      assertEquals((-3441), foreignKeyConstraint0.getUpdateRule());
      assertEquals((-3441), foreignKeyConstraint0.getDeleteRule());
  }

  /**
  //Test case number: 41
  /*Coverage entropy=0.3333333333333333
  */
  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      LinkedList<TableColumn> linkedList0 = new LinkedList<TableColumn>();
      String string0 = ForeignKeyConstraint.toString((List<TableColumn>) linkedList0);
      assertNotNull(string0);
  }

  /**
  //Test case number: 42
  /*Coverage entropy=0.42857142857142855
  */
  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      ForeignKeyConstraint foreignKeyConstraint0 = new ForeignKeyConstraint((Table) null, "f", 2238, 2238);
      boolean boolean0 = foreignKeyConstraint0.isNullOnDelete();
      assertFalse(boolean0);
      assertEquals(2238, foreignKeyConstraint0.getUpdateRule());
      assertEquals(2238, foreignKeyConstraint0.getDeleteRule());
  }

  /**
  //Test case number: 43
  /*Coverage entropy=0.42857142857142855
  */
  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      ForeignKeyConstraint foreignKeyConstraint0 = new ForeignKeyConstraint((Table) null, "3$aHG}", 1, 1);
      boolean boolean0 = foreignKeyConstraint0.isNullOnDelete();
      assertEquals(1, foreignKeyConstraint0.getUpdateRule());
      assertTrue(foreignKeyConstraint0.isRestrictDelete());
      assertFalse(boolean0);
  }

  /**
  //Test case number: 44
  /*Coverage entropy=0.4
  */
  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      ForeignKeyConstraint foreignKeyConstraint0 = new ForeignKeyConstraint((Table) null, (String) null, 2, 2);
      int int0 = foreignKeyConstraint0.getDeleteRule();
      assertEquals(2, int0);
      assertEquals(2, foreignKeyConstraint0.getUpdateRule());
  }

  /**
  //Test case number: 45
  /*Coverage entropy=0.0
  */
  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      ForeignKeyConstraint foreignKeyConstraint0 = null;
      try {
        foreignKeyConstraint0 = new ForeignKeyConstraint((TableColumn) null, (TableColumn) null, (-2117), (-2117));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("net.sourceforge.schemaspy.model.ForeignKeyConstraint", e);
      }
  }

  /**
  //Test case number: 46
  /*Coverage entropy=0.4
  */
  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      ForeignKeyConstraint foreignKeyConstraint0 = new ForeignKeyConstraint((Table) null, "HN7", 1324, 1324);
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
      ResultSet resultSet0 = mock(ResultSet.class, new ViolatedAssumptionAnswer());
      doReturn(0, 0, 0, 0).when(resultSet0).getInt(anyString());
      doReturn((Object) null).when(resultSet0).getObject(anyString());
      doReturn((String) null, (String) null, (String) null, (String) null).when(resultSet0).getString(anyString());
      TableColumn tableColumn1 = null;
      try {
        tableColumn1 = new TableColumn((Table) null, resultSet0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("net.sourceforge.schemaspy.model.TableColumn", e);
      }
  }

  /**
  //Test case number: 47
  /*Coverage entropy=0.4
  */
  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      ForeignKeyConstraint foreignKeyConstraint0 = new ForeignKeyConstraint((Table) null, "", 425, 425);
      foreignKeyConstraint0.addParentColumn((TableColumn) null);
      ForeignKeyConstraint foreignKeyConstraint1 = null;
      try {
        foreignKeyConstraint1 = new ForeignKeyConstraint((TableColumn) null, (TableColumn) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("net.sourceforge.schemaspy.model.ForeignKeyConstraint", e);
      }
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
      Table table0 = null;
      int int0 = 156;
      ForeignKeyConstraint foreignKeyConstraint0 = new ForeignKeyConstraint((Table) null, (String) null, (-3355), 156);
      TableColumnMeta tableColumnMeta0 = mock(TableColumnMeta.class, new ViolatedAssumptionAnswer());
      foreignKeyConstraint0.getName();
      ResultSet resultSet0 = mock(ResultSet.class, new ViolatedAssumptionAnswer());
      doReturn((-3355)).when(resultSet0).getInt(anyString());
      doReturn("").when(resultSet0).getObject(anyString());
      doReturn("/$\t;ssh6 5,", "").when(resultSet0).getString(anyString());
      TableColumn tableColumn0 = null;
      try {
        tableColumn0 = new TableColumn((Table) null, resultSet0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // java.lang.String cannot be cast to java.lang.Number
         //
         verifyException("net.sourceforge.schemaspy.model.TableColumn", e);
      }
  }

  /**
  //Test case number: 50
  /*Coverage entropy=0.4
  */
  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      ForeignKeyConstraint foreignKeyConstraint0 = new ForeignKeyConstraint((Table) null, "3$aHG}", (-13), 1492);
      Config config0 = new Config();
      DatabaseMetaData databaseMetaData0 = mock(DatabaseMetaData.class, new ViolatedAssumptionAnswer());
      foreignKeyConstraint0.getName();
      SchemaMeta schemaMeta0 = null;
      try {
        schemaMeta0 = new SchemaMeta("3$aHG}", "3$aHG}", "-?");
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Specified meta file \"3$aHG}\" does not exist
         //
         verifyException("net.sourceforge.schemaspy.model.xml.SchemaMeta", e);
      }
  }

  /**
  //Test case number: 51
  /*Coverage entropy=0.4
  */
  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      ForeignKeyConstraint foreignKeyConstraint0 = new ForeignKeyConstraint((Table) null, "-scheBaHa", 1, 1);
      foreignKeyConstraint0.getChildColumns();
      assertEquals(1, foreignKeyConstraint0.getUpdateRule());
      assertEquals(1, foreignKeyConstraint0.getDeleteRule());
  }

  /**
  //Test case number: 52
  /*Coverage entropy=0.4
  */
  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      ForeignKeyConstraint foreignKeyConstraint0 = new ForeignKeyConstraint((Table) null, "3$aHG}", 1292, 1292);
      foreignKeyConstraint0.getParentColumns();
      assertEquals(1292, foreignKeyConstraint0.getDeleteRule());
      assertEquals(1292, foreignKeyConstraint0.getUpdateRule());
  }

  /**
  //Test case number: 53
  /*Coverage entropy=0.4
  */
  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      ForeignKeyConstraint foreignKeyConstraint0 = new ForeignKeyConstraint((Table) null, (String) null, (-2986), 1047);
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
      assertEquals((-2986), foreignKeyConstraint0.getUpdateRule());
      assertEquals(1047, foreignKeyConstraint0.getDeleteRule());
  }

  /**
  //Test case number: 54
  /*Coverage entropy=0.4
  */
  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      ForeignKeyConstraint foreignKeyConstraint0 = new ForeignKeyConstraint((Table) null, "3$aHG}", 1, 1);
      foreignKeyConstraint0.addChildColumn((TableColumn) null);
      assertEquals(1, foreignKeyConstraint0.getUpdateRule());
      assertTrue(foreignKeyConstraint0.isRestrictDelete());
  }
}
