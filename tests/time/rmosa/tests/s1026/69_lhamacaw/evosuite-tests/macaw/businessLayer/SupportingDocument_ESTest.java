/*
 * This file was automatically generated by EvoSuite
 * Fri Dec 06 12:18:16 GMT 2019
 */

package macaw.businessLayer;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.ArrayList;
import macaw.businessLayer.SupportingDocument;
import macaw.businessLayer.User;
import macaw.system.MacawChangeEvent;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.System;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class SupportingDocument_ESTest extends SupportingDocument_ESTest_scaffolding {

  /**
  //Test case number: 0
  /*Coverage entropy=2.2654436797543704
  */
  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      SupportingDocument supportingDocument0 = new SupportingDocument();
      supportingDocument0.getDisplayItemIdentifier();
      SupportingDocument supportingDocument1 = new SupportingDocument();
      supportingDocument1.setDocumentCode((String) null);
      supportingDocument1.getDocumentCode();
      try { 
        SupportingDocument.validateFields(supportingDocument0);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("macaw.businessLayer.SupportingDocument", e);
      }
  }

  /**
  //Test case number: 1
  /*Coverage entropy=2.4297811167972485
  */
  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      SupportingDocument supportingDocument0 = new SupportingDocument();
      String string0 = null;
      supportingDocument0.setFilePath((String) null);
      supportingDocument0.getFilePath();
      supportingDocument0.getDocumentCode();
      User user0 = new User();
      user0.setCity((String) null);
      // Undeclared exception!
      try { 
        SupportingDocument.detectFieldChanges(user0, supportingDocument0, supportingDocument0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
      }
  }

  /**
  //Test case number: 2
  /*Coverage entropy=1.5271837172395382
  */
  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      SupportingDocument supportingDocument0 = new SupportingDocument();
      supportingDocument0.setTitle((String) null);
      supportingDocument0.getTitle();
      assertFalse(supportingDocument0.isNewRecord());
      assertEquals("0", supportingDocument0.getDisplayItemIdentifier());
  }

  /**
  //Test case number: 3
  /*Coverage entropy=2.4241710186205303
  */
  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      SupportingDocument supportingDocument0 = new SupportingDocument();
      supportingDocument0.getDisplayItemIdentifier();
      SupportingDocument supportingDocument1 = new SupportingDocument();
      supportingDocument1.setDocumentCode((String) null);
      supportingDocument0.setTitle("0");
      User user0 = new User();
      // Undeclared exception!
      try { 
        SupportingDocument.detectFieldChanges(user0, supportingDocument1, supportingDocument0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
      }
  }

  /**
  //Test case number: 4
  /*Coverage entropy=2.5633125094217712
  */
  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      SupportingDocument supportingDocument0 = new SupportingDocument();
      SupportingDocument supportingDocument1 = new SupportingDocument();
      supportingDocument1.setFilePath("=message==");
      User user0 = new User();
      User user1 = new User("=message==", "s");
      user0.setUserID("s");
      ArrayList<MacawChangeEvent> arrayList0 = SupportingDocument.detectFieldChanges(user0, supportingDocument1, supportingDocument0);
      assertEquals(1, arrayList0.size());
      assertFalse(supportingDocument1.isNewRecord());
      assertEquals(0, supportingDocument1.getIdentifier());
  }

  /**
  //Test case number: 5
  /*Coverage entropy=1.5652789553347763
  */
  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      SupportingDocument supportingDocument0 = new SupportingDocument();
      supportingDocument0.setTitle("7yT0]%f-~W");
      SupportingDocument supportingDocument1 = new SupportingDocument();
      supportingDocument1.setTitle((String) null);
      User user0 = new User("MacawProperties", "7yT0]%f-~W");
      // Undeclared exception!
      try { 
        SupportingDocument.detectFieldChanges(user0, supportingDocument1, supportingDocument0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
      }
  }

  /**
  //Test case number: 6
  /*Coverage entropy=2.2700203387932723
  */
  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      SupportingDocument supportingDocument0 = new SupportingDocument();
      supportingDocument0.setTitle("mM");
      SupportingDocument supportingDocument1 = new SupportingDocument();
      supportingDocument0.setTitle("!`U");
      User user0 = new User();
      supportingDocument0.setDocumentCode((String) null);
      // Undeclared exception!
      try { 
        SupportingDocument.detectFieldChanges(user0, supportingDocument0, supportingDocument1);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
      }
  }

  /**
  //Test case number: 7
  /*Coverage entropy=2.5642900265283206
  */
  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      User user0 = new User("-", "-");
      SupportingDocument supportingDocument0 = new SupportingDocument();
      supportingDocument0.setFileName("y8DE:iWI>?[");
      SupportingDocument supportingDocument1 = new SupportingDocument();
      SupportingDocument supportingDocument2 = new SupportingDocument();
      SupportingDocument.detectFieldChanges(user0, supportingDocument0, supportingDocument2);
      System.setCurrentTimeMillis((-2884L));
  }

  /**
  //Test case number: 8
  /*Coverage entropy=2.063983366979555
  */
  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      SupportingDocument supportingDocument0 = new SupportingDocument();
      supportingDocument0.setFilePath("sxGe7oZEJd7)N\"t");
      supportingDocument0.setDescription((String) null);
      supportingDocument0.setIdentifier((-1370));
      supportingDocument0.getDescription();
      assertEquals("-1370", supportingDocument0.getDisplayItemIdentifier());
  }

  /**
  //Test case number: 9
  /*Coverage entropy=1.8408398156653452
  */
  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      SupportingDocument supportingDocument0 = new SupportingDocument();
      supportingDocument0.setFileName("C `[Yb#fsO5Wo#_)v");
      supportingDocument0.setFileName("C `[Yb#fsO5Wo#_)v");
      supportingDocument0.setTitle("C `[Yb#fsO5Wo#_)v");
      supportingDocument0.getFileName();
      assertEquals(0, supportingDocument0.getIdentifier());
      assertFalse(supportingDocument0.isNewRecord());
  }

  /**
  //Test case number: 10
  /*Coverage entropy=2.565928028166322
  */
  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      SupportingDocument supportingDocument0 = new SupportingDocument();
      supportingDocument0.setIdentifier(0);
      supportingDocument0.getDescription();
      User user0 = new User("5", "5");
      supportingDocument0.setIdentifier(824);
      user0.setAffiliation("NON_EXISTENT_VARIABLE");
      SupportingDocument supportingDocument1 = new SupportingDocument();
      SupportingDocument.detectFieldChanges(user0, supportingDocument1, supportingDocument1);
      supportingDocument0.getIdentifier();
      supportingDocument0.setIdentifier(0);
      assertEquals("0", supportingDocument0.getDisplayItemIdentifier());
  }

  /**
  //Test case number: 11
  /*Coverage entropy=2.3795025181054235
  */
  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      SupportingDocument supportingDocument0 = new SupportingDocument();
      supportingDocument0.setFileName("mM");
      supportingDocument0.setTitle("mM");
      supportingDocument0.setDocumentCode("mM");
      SupportingDocument.validateFields(supportingDocument0);
      supportingDocument0.getDocumentCode();
      SupportingDocument.validateFields(supportingDocument0);
      SupportingDocument.validateFields(supportingDocument0);
      assertFalse(supportingDocument0.isNewRecord());
      assertEquals("0", supportingDocument0.getDisplayItemIdentifier());
      assertEquals(0, supportingDocument0.getIdentifier());
  }

  /**
  //Test case number: 12
  /*Coverage entropy=2.5633125094217712
  */
  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      SupportingDocument supportingDocument0 = new SupportingDocument();
      supportingDocument0.setDocumentCode("UNABLE_TO_CLOSE_CONNECTION");
      SupportingDocument supportingDocument1 = new SupportingDocument();
      User user0 = new User("UNABLE_TO_UPDATE_VALUE_LABELS", "UNABLE_TO_UPDATE_VALUE_LABELS");
      ArrayList<MacawChangeEvent> arrayList0 = SupportingDocument.detectFieldChanges(user0, supportingDocument0, supportingDocument1);
      assertEquals(1, arrayList0.size());
      assertEquals(0, supportingDocument1.getIdentifier());
      assertFalse(supportingDocument1.isNewRecord());
  }

  /**
  //Test case number: 13
  /*Coverage entropy=2.4298057434980493
  */
  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      SupportingDocument supportingDocument0 = new SupportingDocument();
      supportingDocument0.setDocumentCode("x");
      User user0 = new User();
      user0.setStatus("FYpdg}PADZy.g3p6t");
      SupportingDocument supportingDocument1 = new SupportingDocument();
      ArrayList<MacawChangeEvent> arrayList0 = SupportingDocument.detectFieldChanges(user0, supportingDocument0, supportingDocument1);
      assertEquals(0, supportingDocument1.getIdentifier());
      assertFalse(supportingDocument1.isNewRecord());
      assertEquals(1, arrayList0.size());
  }

  /**
  //Test case number: 14
  /*Coverage entropy=2.5633125094217712
  */
  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      SupportingDocument supportingDocument0 = new SupportingDocument();
      SupportingDocument supportingDocument1 = new SupportingDocument();
      supportingDocument0.setDescription("z");
      User user0 = new User();
      ArrayList<MacawChangeEvent> arrayList0 = SupportingDocument.detectFieldChanges(user0, supportingDocument1, supportingDocument0);
      assertFalse(supportingDocument1.isNewRecord());
      assertEquals(1, arrayList0.size());
      assertEquals(0, supportingDocument1.getIdentifier());
  }

  /**
  //Test case number: 15
  /*Coverage entropy=2.4286687697449683
  */
  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      SupportingDocument supportingDocument0 = new SupportingDocument();
      SupportingDocument supportingDocument1 = new SupportingDocument();
      supportingDocument1.setDescription("3>6@I4LdCL,V8tg..");
      supportingDocument1.setDocumentCode("3>6@I4LdCL,V8tg..");
      supportingDocument0.setDescription((String) null);
      supportingDocument1.setDescription("+q[)N={-_h:");
      User user0 = new User();
      User user1 = new User();
      user0.setAffiliation("dwv!9Br6l'-I%h]hi");
      user0.clone();
      // Undeclared exception!
      try { 
        SupportingDocument.detectFieldChanges(user1, supportingDocument0, supportingDocument1);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
      }
  }

  /**
  //Test case number: 16
  /*Coverage entropy=2.087698781999318
  */
  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      SupportingDocument supportingDocument0 = new SupportingDocument();
      SupportingDocument supportingDocument1 = new SupportingDocument();
      String string0 = "~";
      String string1 = "z";
      supportingDocument0.setDescription("~");
      supportingDocument1.setDescription((String) null);
      User user0 = new User();
      // Undeclared exception!
      try { 
        SupportingDocument.detectFieldChanges(user0, supportingDocument1, supportingDocument0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
      }
  }

  /**
  //Test case number: 17
  /*Coverage entropy=1.856882596414008
  */
  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      SupportingDocument supportingDocument0 = new SupportingDocument();
      SupportingDocument supportingDocument1 = new SupportingDocument();
      supportingDocument1.setDocumentCode((String) null);
      User user0 = new User();
      // Undeclared exception!
      try { 
        SupportingDocument.detectFieldChanges(user0, supportingDocument1, supportingDocument0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
      }
  }

  /**
  //Test case number: 18
  /*Coverage entropy=2.070976373972562
  */
  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      SupportingDocument supportingDocument0 = new SupportingDocument();
      supportingDocument0.setTitle("V");
      try { 
        SupportingDocument.validateFields(supportingDocument0);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("macaw.businessLayer.SupportingDocument", e);
      }
  }

  /**
  //Test case number: 19
  /*Coverage entropy=2.4241710186205303
  */
  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      SupportingDocument supportingDocument0 = new SupportingDocument();
      supportingDocument0.setIdentifier(572);
      supportingDocument0.setFileName("?dO<ZV._~UJJ]l2hU<");
      supportingDocument0.setFileName("c+yU;#hh~N&~xRPD");
      supportingDocument0.setIdentifier(19);
      supportingDocument0.setFileName("supportingDocument.fileName.saveChanges");
      supportingDocument0.setTitle("c+yU;#hh~N&~xRPD");
      supportingDocument0.getTitle();
      supportingDocument0.setDocumentCode("[y+");
      supportingDocument0.setIdentifier((-4181));
      int int0 = supportingDocument0.getIdentifier();
      assertEquals((-4181), int0);
  }

  /**
  //Test case number: 20
  /*Coverage entropy=2.253297930766516
  */
  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      SupportingDocument supportingDocument0 = new SupportingDocument();
      supportingDocument0.setFileName((String) null);
      supportingDocument0.getTitle();
      supportingDocument0.getDescription();
      supportingDocument0.setDocumentCode((String) null);
      supportingDocument0.getFileName();
      assertEquals(0, supportingDocument0.getIdentifier());
      assertFalse(supportingDocument0.isNewRecord());
  }

  /**
  //Test case number: 21
  /*Coverage entropy=1.5271837172395382
  */
  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      SupportingDocument supportingDocument0 = new SupportingDocument();
      supportingDocument0.setDescription("`#1aay");
      supportingDocument0.getDescription();
      assertFalse(supportingDocument0.isNewRecord());
      assertEquals("0", supportingDocument0.getDisplayItemIdentifier());
  }

  /**
  //Test case number: 22
  /*Coverage entropy=2.063983366979555
  */
  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      SupportingDocument supportingDocument0 = new SupportingDocument();
      supportingDocument0.setFilePath("-");
      supportingDocument0.setIdentifier(2153);
      supportingDocument0.getFilePath();
      supportingDocument0.getDocumentCode();
      assertEquals(2153, supportingDocument0.getIdentifier());
  }

  /**
  //Test case number: 23
  /*Coverage entropy=1.8408398156653452
  */
  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      SupportingDocument supportingDocument0 = new SupportingDocument();
      supportingDocument0.setDocumentCode((String) null);
      // Undeclared exception!
      try { 
        SupportingDocument.validateFields(supportingDocument0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("macaw.util.ValidationUtility", e);
      }
  }

  /**
  //Test case number: 24
  /*Coverage entropy=2.070976373972562
  */
  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      SupportingDocument supportingDocument0 = new SupportingDocument();
      supportingDocument0.setDocumentCode("i!yfp?");
      try { 
        SupportingDocument.validateFields(supportingDocument0);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("macaw.businessLayer.SupportingDocument", e);
      }
  }

  /**
  //Test case number: 25
  /*Coverage entropy=2.070976373972562
  */
  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      SupportingDocument supportingDocument0 = new SupportingDocument();
      supportingDocument0.setFileName("C `[Yb#fsO5Wo#_)");
      try { 
        SupportingDocument.validateFields(supportingDocument0);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("macaw.businessLayer.SupportingDocument", e);
      }
  }

  /**
  //Test case number: 26
  /*Coverage entropy=2.5531257522061517
  */
  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      SupportingDocument supportingDocument0 = new SupportingDocument();
      SupportingDocument supportingDocument1 = (SupportingDocument)supportingDocument0.clone();
      assertNotSame(supportingDocument1, supportingDocument0);
      assertFalse(supportingDocument1.isNewRecord());
      assertEquals("0", supportingDocument1.getDisplayItemIdentifier());
  }

  /**
  //Test case number: 27
  /*Coverage entropy=1.543056733112554
  */
  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      SupportingDocument supportingDocument0 = new SupportingDocument();
      supportingDocument0.setTitle((String) null);
      // Undeclared exception!
      try { 
        SupportingDocument.validateFields(supportingDocument0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("macaw.util.ValidationUtility", e);
      }
  }

  /**
  //Test case number: 28
  /*Coverage entropy=2.8862673658216265
  */
  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      SupportingDocument supportingDocument0 = new SupportingDocument();
      supportingDocument0.setIdentifier((-1908874331));
      supportingDocument0.getDescription();
      User user0 = new User("", "");
      supportingDocument0.setIdentifier(17);
      user0.setAffiliation("M6E<w");
      SupportingDocument.detectFieldChanges(user0, supportingDocument0, supportingDocument0);
      supportingDocument0.getIdentifier();
      supportingDocument0.setIdentifier((-1073741822));
      supportingDocument0.setIdentifier(17);
      supportingDocument0.setTitle("");
      supportingDocument0.setIsNewRecord(true);
      boolean boolean0 = supportingDocument0.isNewRecord();
      assertEquals("17", supportingDocument0.getDisplayItemIdentifier());
      assertTrue(boolean0);
  }

  /**
  //Test case number: 29
  /*Coverage entropy=2.1478140668098065
  */
  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      User user0 = new User();
      SupportingDocument supportingDocument0 = new SupportingDocument();
      ArrayList<MacawChangeEvent> arrayList0 = SupportingDocument.detectFieldChanges(user0, supportingDocument0, supportingDocument0);
      assertEquals(0, arrayList0.size());
      
      supportingDocument0.getFilePath();
      assertFalse(supportingDocument0.isNewRecord());
      assertEquals("0", supportingDocument0.getDisplayItemIdentifier());
  }

  /**
  //Test case number: 30
  /*Coverage entropy=2.085628388624577
  */
  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      SupportingDocument supportingDocument0 = new SupportingDocument();
      supportingDocument0.setDescription("z");
      supportingDocument0.setDescription((String) null);
      User user0 = new User("z;y9f^SA", "^~nJ.=4*'R?< Ze*/bb");
      // Undeclared exception!
      try { 
        SupportingDocument.detectFieldChanges(user0, supportingDocument0, supportingDocument0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
      }
  }

  /**
  //Test case number: 31
  /*Coverage entropy=1.8529610277865571
  */
  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      User user0 = new User("UNABLE_TO_CHECK_DOCUMENT_EXISTS", (String) null);
      SupportingDocument supportingDocument0 = new SupportingDocument();
      supportingDocument0.setDocumentCode((String) null);
      // Undeclared exception!
      try { 
        SupportingDocument.detectFieldChanges(user0, supportingDocument0, supportingDocument0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
      }
  }

  /**
  //Test case number: 32
  /*Coverage entropy=1.0931471805599453
  */
  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      SupportingDocument supportingDocument0 = new SupportingDocument();
      String string0 = supportingDocument0.getDisplayName();
      assertEquals(0, supportingDocument0.getIdentifier());
      assertEquals("-", string0);
      assertFalse(supportingDocument0.isNewRecord());
  }

  /**
  //Test case number: 33
  /*Coverage entropy=1.1217186091313738
  */
  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      SupportingDocument supportingDocument0 = new SupportingDocument();
      SupportingDocument supportingDocument1 = new SupportingDocument();
      boolean boolean0 = supportingDocument1.isNewRecord();
      assertFalse(boolean0);
      assertEquals(0, supportingDocument1.getIdentifier());
  }

  /**
  //Test case number: 34
  /*Coverage entropy=1.0931471805599453
  */
  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      SupportingDocument supportingDocument0 = new SupportingDocument();
      supportingDocument0.getFileName();
      assertEquals(0, supportingDocument0.getIdentifier());
      assertFalse(supportingDocument0.isNewRecord());
  }

  /**
  //Test case number: 35
  /*Coverage entropy=1.0931471805599453
  */
  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      User user0 = new User();
      SupportingDocument supportingDocument0 = new SupportingDocument();
      int int0 = supportingDocument0.getIdentifier();
      assertEquals(0, int0);
      assertFalse(supportingDocument0.isNewRecord());
  }
}
