/*
 * This file was automatically generated by EvoSuite
 * Thu Dec 05 04:14:08 GMT 2019
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
  /*Coverage entropy=1.5271837172395382
  */
  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      SupportingDocument supportingDocument0 = new SupportingDocument();
      supportingDocument0.setFileName((String) null);
      supportingDocument0.getFileName();
      assertFalse(supportingDocument0.isNewRecord());
      assertEquals("0", supportingDocument0.getDisplayItemIdentifier());
  }

  /**
  //Test case number: 1
  /*Coverage entropy=1.830738805564335
  */
  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      SupportingDocument supportingDocument0 = new SupportingDocument();
      supportingDocument0.setDocumentCode((String) null);
      supportingDocument0.getDocumentCode();
      String string0 = supportingDocument0.getDisplayName();
      assertEquals("-null", string0);
      assertFalse(supportingDocument0.isNewRecord());
      assertEquals("0", supportingDocument0.getDisplayItemIdentifier());
  }

  /**
  //Test case number: 2
  /*Coverage entropy=2.790389971042826
  */
  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      System.setCurrentTimeMillis((-3748L));
      SupportingDocument supportingDocument0 = new SupportingDocument();
      supportingDocument0.setFilePath((String) null);
      supportingDocument0.getFilePath();
      supportingDocument0.setFileName("E`dv");
      supportingDocument0.getFileName();
      supportingDocument0.getDisplayName();
      User user0 = new User("E`dv", "TLw.c/AMo>U l6");
      supportingDocument0.setFilePath("UNABLE_TO_CHECK_VALUE_LABEL_DUPLICATES");
      supportingDocument0.setDocumentCode("supportingDocument.description.saveChanges");
      user0.setCounty("-");
      user0.setAffiliation((String) null);
      supportingDocument0.getDisplayItemIdentifier();
      supportingDocument0.getFileName();
      supportingDocument0.getDescription();
      supportingDocument0.getDocumentCode();
      supportingDocument0.getDocumentCode();
      System.setCurrentTimeMillis((-3748L));
      supportingDocument0.getDocumentCode();
      String string0 = supportingDocument0.getDisplayName();
      assertEquals("-supportingDocument.description.saveChanges", string0);
      
      supportingDocument0.getFileName();
      supportingDocument0.getDocumentCode();
      supportingDocument0.getDisplayItemIdentifier();
      supportingDocument0.getFileName();
      String string1 = supportingDocument0.getDisplayItemIdentifier();
      assertFalse(supportingDocument0.isNewRecord());
      assertEquals("0", string1);
  }

  /**
  //Test case number: 3
  /*Coverage entropy=1.5271837172395382
  */
  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      SupportingDocument supportingDocument0 = new SupportingDocument();
      supportingDocument0.setTitle((String) null);
      User user0 = new User();
      supportingDocument0.getTitle();
      assertFalse(supportingDocument0.isNewRecord());
      assertEquals(0, supportingDocument0.getIdentifier());
  }

  /**
  //Test case number: 4
  /*Coverage entropy=2.5633125094217712
  */
  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      SupportingDocument supportingDocument0 = new SupportingDocument();
      supportingDocument0.setFileName("x\"U{Fn5' /-C4(9yLc");
      User user0 = new User();
      SupportingDocument supportingDocument1 = new SupportingDocument();
      ArrayList<MacawChangeEvent> arrayList0 = SupportingDocument.detectFieldChanges(user0, supportingDocument0, supportingDocument1);
      assertEquals(1, arrayList0.size());
      assertFalse(supportingDocument1.isNewRecord());
      assertEquals(0, supportingDocument1.getIdentifier());
  }

  /**
  //Test case number: 5
  /*Coverage entropy=1.847832822658352
  */
  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      SupportingDocument supportingDocument0 = new SupportingDocument();
      SupportingDocument supportingDocument1 = new SupportingDocument();
      SupportingDocument supportingDocument2 = new SupportingDocument();
      supportingDocument2.setIdentifier((-1184));
      supportingDocument2.getDisplayItemIdentifier();
      int int0 = supportingDocument2.getIdentifier();
      assertEquals((-1184), int0);
  }

  /**
  //Test case number: 6
  /*Coverage entropy=2.4298057434980493
  */
  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      SupportingDocument supportingDocument0 = new SupportingDocument();
      SupportingDocument supportingDocument1 = new SupportingDocument();
      supportingDocument0.setDocumentCode("-");
      User user0 = new User("-", "-");
      ArrayList<MacawChangeEvent> arrayList0 = SupportingDocument.detectFieldChanges(user0, supportingDocument0, supportingDocument1);
      assertEquals(0, supportingDocument1.getIdentifier());
      assertFalse(supportingDocument1.isNewRecord());
      assertEquals(1, arrayList0.size());
  }

  /**
  //Test case number: 7
  /*Coverage entropy=2.5491065600229934
  */
  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      SupportingDocument supportingDocument0 = new SupportingDocument();
      SupportingDocument supportingDocument1 = new SupportingDocument();
      String string0 = supportingDocument1.getDisplayItemIdentifier();
      assertEquals("0", string0);
      
      supportingDocument1.setDocumentCode("0");
      User user0 = new User();
      ArrayList<MacawChangeEvent> arrayList0 = SupportingDocument.detectFieldChanges(user0, supportingDocument1, supportingDocument0);
      assertEquals(1, arrayList0.size());
      assertEquals(0, supportingDocument1.getIdentifier());
      assertFalse(supportingDocument1.isNewRecord());
  }

  /**
  //Test case number: 8
  /*Coverage entropy=2.4298057434980493
  */
  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      SupportingDocument supportingDocument0 = new SupportingDocument();
      SupportingDocument supportingDocument1 = new SupportingDocument();
      supportingDocument0.setTitle("-");
      User user0 = new User();
      ArrayList<MacawChangeEvent> arrayList0 = SupportingDocument.detectFieldChanges(user0, supportingDocument0, supportingDocument1);
      assertFalse(supportingDocument1.isNewRecord());
      assertEquals(1, arrayList0.size());
      assertEquals(0, supportingDocument1.getIdentifier());
  }

  /**
  //Test case number: 9
  /*Coverage entropy=2.4164983843494308
  */
  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      SupportingDocument supportingDocument0 = new SupportingDocument();
      supportingDocument0.setTitle("epYw?0GotTNS<<SA-L<");
      supportingDocument0.setFileName("epYw?0GotTNS<<SA-L<");
      supportingDocument0.setDocumentCode("epYw?0GotTNS<<SA-L<");
      SupportingDocument.validateFields(supportingDocument0);
      assertEquals("0", supportingDocument0.getDisplayItemIdentifier());
      assertFalse(supportingDocument0.isNewRecord());
      assertEquals(0, supportingDocument0.getIdentifier());
  }

  /**
  //Test case number: 10
  /*Coverage entropy=2.6829388630505053
  */
  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      SupportingDocument supportingDocument0 = new SupportingDocument();
      supportingDocument0.setDescription("eIap9A");
      User user0 = new User();
      SupportingDocument supportingDocument1 = new SupportingDocument();
      supportingDocument1.setFilePath("eIap9A");
      ArrayList<MacawChangeEvent> arrayList0 = SupportingDocument.detectFieldChanges(user0, supportingDocument0, supportingDocument1);
      assertEquals(0, supportingDocument1.getIdentifier());
      assertEquals(2, arrayList0.size());
      assertFalse(supportingDocument1.isNewRecord());
  }

  /**
  //Test case number: 11
  /*Coverage entropy=2.557702411245053
  */
  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      SupportingDocument supportingDocument0 = new SupportingDocument();
      supportingDocument0.setDescription("UNABLE_TO_GET_CATEGORY");
      supportingDocument0.setIsNewRecord(true);
      supportingDocument0.getDescription();
      supportingDocument0.isNewRecord();
      supportingDocument0.getDescription();
      supportingDocument0.getDescription();
      supportingDocument0.setDescription("5IX4|");
      supportingDocument0.setIdentifier(2801);
      supportingDocument0.setDocumentCode("f!On[!r-_");
      int int0 = supportingDocument0.getIdentifier();
      assertEquals("2801", supportingDocument0.getDisplayItemIdentifier());
      assertEquals(2801, int0);
  }

  /**
  //Test case number: 12
  /*Coverage entropy=2.5633125094217712
  */
  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      SupportingDocument supportingDocument0 = new SupportingDocument();
      SupportingDocument supportingDocument1 = new SupportingDocument();
      supportingDocument0.setTitle("-");
      User user0 = new User();
      ArrayList<MacawChangeEvent> arrayList0 = SupportingDocument.detectFieldChanges(user0, supportingDocument1, supportingDocument0);
      assertEquals(1, arrayList0.size());
      assertEquals(0, supportingDocument1.getIdentifier());
      assertFalse(supportingDocument1.isNewRecord());
  }

  /**
  //Test case number: 13
  /*Coverage entropy=0.3333333333333333
  */
  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      // Undeclared exception!
      try { 
        SupportingDocument.validateFields((SupportingDocument) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("macaw.businessLayer.SupportingDocument", e);
      }
  }

  /**
  //Test case number: 14
  /*Coverage entropy=2.05569358184064
  */
  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      SupportingDocument supportingDocument0 = new SupportingDocument();
      supportingDocument0.setDescription("hTESY+dl0YgK Be");
      supportingDocument0.getDescription();
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
  //Test case number: 15
  /*Coverage entropy=2.789071579480532
  */
  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      SupportingDocument supportingDocument0 = new SupportingDocument();
      supportingDocument0.setDescription((String) null);
      supportingDocument0.setDocumentCode("UNABLE_TO_CLOSE_CONNECTION");
      supportingDocument0.setFilePath("UNABLE_TO_CLOSE_CONNECTION");
      supportingDocument0.setIdentifier(0);
      supportingDocument0.setTitle("LV");
      supportingDocument0.setDocumentCode("");
      supportingDocument0.getTitle();
      SupportingDocument supportingDocument1 = (SupportingDocument)supportingDocument0.clone();
      assertEquals("0", supportingDocument1.getDisplayItemIdentifier());
      assertEquals("LV", supportingDocument1.getTitle());
      assertEquals("UNABLE_TO_CLOSE_CONNECTION", supportingDocument1.getFilePath());
      
      supportingDocument0.getDescription();
      supportingDocument0.setIdentifier(0);
      assertNotSame(supportingDocument0, supportingDocument1);
      assertFalse(supportingDocument0.isNewRecord());
      assertEquals(0, supportingDocument0.getIdentifier());
  }

  /**
  //Test case number: 16
  /*Coverage entropy=2.5633125094217712
  */
  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      SupportingDocument supportingDocument0 = new SupportingDocument();
      SupportingDocument supportingDocument1 = new SupportingDocument();
      supportingDocument0.setDocumentCode("?");
      User user0 = new User();
      ArrayList<MacawChangeEvent> arrayList0 = SupportingDocument.detectFieldChanges(user0, supportingDocument1, supportingDocument0);
      assertEquals(1, arrayList0.size());
      assertEquals(0, supportingDocument1.getIdentifier());
      assertFalse(supportingDocument1.isNewRecord());
  }

  /**
  //Test case number: 17
  /*Coverage entropy=2.5633125094217712
  */
  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      SupportingDocument supportingDocument0 = new SupportingDocument();
      SupportingDocument supportingDocument1 = new SupportingDocument();
      supportingDocument1.setDescription("-");
      User user0 = new User();
      ArrayList<MacawChangeEvent> arrayList0 = SupportingDocument.detectFieldChanges(user0, supportingDocument0, supportingDocument1);
      assertEquals(1, arrayList0.size());
      assertEquals(0, supportingDocument1.getIdentifier());
      assertFalse(supportingDocument1.isNewRecord());
  }

  /**
  //Test case number: 18
  /*Coverage entropy=2.675485446901437
  */
  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      SupportingDocument supportingDocument0 = new SupportingDocument();
      supportingDocument0.setIdentifier(2855);
      supportingDocument0.getIdentifier();
      supportingDocument0.clone();
      assertEquals("2855", supportingDocument0.getDisplayItemIdentifier());
  }

  /**
  //Test case number: 19
  /*Coverage entropy=2.253297930766516
  */
  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      SupportingDocument supportingDocument0 = new SupportingDocument();
      supportingDocument0.setTitle("{]y3.9~o)#- clM?");
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
  //Test case number: 20
  /*Coverage entropy=2.1478140668098065
  */
  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      SupportingDocument supportingDocument0 = new SupportingDocument();
      User user0 = new User();
      SupportingDocument supportingDocument1 = new SupportingDocument();
      ArrayList<MacawChangeEvent> arrayList0 = SupportingDocument.detectFieldChanges(user0, supportingDocument0, supportingDocument1);
      assertEquals("0", supportingDocument1.getDisplayItemIdentifier());
      assertFalse(supportingDocument1.isNewRecord());
      assertTrue(arrayList0.isEmpty());
  }

  /**
  //Test case number: 21
  /*Coverage entropy=2.2957890010886066
  */
  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      SupportingDocument supportingDocument0 = new SupportingDocument();
      supportingDocument0.setDescription("=09Xrbk}O$u%-{Wi");
      User user0 = new User();
      ArrayList<MacawChangeEvent> arrayList0 = SupportingDocument.detectFieldChanges(user0, supportingDocument0, supportingDocument0);
      assertTrue(arrayList0.isEmpty());
      assertFalse(supportingDocument0.isNewRecord());
      assertEquals("0", supportingDocument0.getDisplayItemIdentifier());
  }

  /**
  //Test case number: 22
  /*Coverage entropy=2.428693396445769
  */
  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      SupportingDocument supportingDocument0 = new SupportingDocument();
      User user0 = new User();
      String string0 = supportingDocument0.getDisplayName();
      assertEquals("-", string0);
      
      supportingDocument0.setTitle("-");
      ArrayList<MacawChangeEvent> arrayList0 = SupportingDocument.detectFieldChanges(user0, supportingDocument0, supportingDocument0);
      assertEquals(0, supportingDocument0.getIdentifier());
      assertEquals(0, arrayList0.size());
      assertFalse(supportingDocument0.isNewRecord());
  }

  /**
  //Test case number: 23
  /*Coverage entropy=1.830738805564335
  */
  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      SupportingDocument supportingDocument0 = new SupportingDocument();
      String string0 = supportingDocument0.getDisplayName();
      assertEquals("-", string0);
      
      supportingDocument0.setTitle("-");
      supportingDocument0.getTitle();
      assertFalse(supportingDocument0.isNewRecord());
      assertEquals("0", supportingDocument0.getDisplayItemIdentifier());
  }

  /**
  //Test case number: 24
  /*Coverage entropy=1.0931471805599453
  */
  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      SupportingDocument supportingDocument0 = new SupportingDocument();
      int int0 = supportingDocument0.getIdentifier();
      assertFalse(supportingDocument0.isNewRecord());
      assertEquals(0, int0);
  }

  /**
  //Test case number: 25
  /*Coverage entropy=2.7808459625592628
  */
  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      SupportingDocument supportingDocument0 = new SupportingDocument();
      SupportingDocument supportingDocument1 = (SupportingDocument)supportingDocument0.clone();
      assertEquals("0", supportingDocument1.getDisplayItemIdentifier());
      
      boolean boolean0 = supportingDocument0.isNewRecord();
      assertFalse(boolean0);
      
      supportingDocument0.getDocumentCode();
      assertNotSame(supportingDocument0, supportingDocument1);
  }

  /**
  //Test case number: 26
  /*Coverage entropy=1.0931471805599453
  */
  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      SupportingDocument supportingDocument0 = new SupportingDocument();
      // Undeclared exception!
      try { 
        SupportingDocument.detectFieldChanges((User) null, supportingDocument0, supportingDocument0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("macaw.businessLayer.SupportingDocument", e);
      }
  }

  /**
  //Test case number: 27
  /*Coverage entropy=1.5271837172395382
  */
  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      SupportingDocument supportingDocument0 = new SupportingDocument();
      supportingDocument0.setFilePath("EdJ{qP.)>5~5b");
      supportingDocument0.getFilePath();
      assertFalse(supportingDocument0.isNewRecord());
      assertEquals("0", supportingDocument0.getDisplayItemIdentifier());
  }

  /**
  //Test case number: 28
  /*Coverage entropy=2.1290003949677563
  */
  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      SupportingDocument supportingDocument0 = new SupportingDocument();
      supportingDocument0.setFileName("D");
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
  //Test case number: 29
  /*Coverage entropy=2.209406559005219
  */
  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      SupportingDocument supportingDocument0 = new SupportingDocument();
      supportingDocument0.setDocumentCode("Xq");
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
  //Test case number: 30
  /*Coverage entropy=2.146332585328325
  */
  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      SupportingDocument supportingDocument0 = new SupportingDocument();
      User user0 = new User("-", "-");
      ArrayList<MacawChangeEvent> arrayList0 = SupportingDocument.detectFieldChanges(user0, supportingDocument0, supportingDocument0);
      assertFalse(supportingDocument0.isNewRecord());
      assertEquals("0", supportingDocument0.getDisplayItemIdentifier());
      assertEquals(0, arrayList0.size());
  }

  /**
  //Test case number: 31
  /*Coverage entropy=1.0931471805599453
  */
  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      SupportingDocument supportingDocument0 = new SupportingDocument();
      supportingDocument0.getFilePath();
      assertFalse(supportingDocument0.isNewRecord());
      assertEquals("0", supportingDocument0.getDisplayItemIdentifier());
  }

  /**
  //Test case number: 32
  /*Coverage entropy=1.0931471805599453
  */
  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      SupportingDocument supportingDocument0 = new SupportingDocument();
      supportingDocument0.getFileName();
      assertEquals(0, supportingDocument0.getIdentifier());
      assertFalse(supportingDocument0.isNewRecord());
  }

  /**
  //Test case number: 33
  /*Coverage entropy=1.0931471805599453
  */
  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      SupportingDocument supportingDocument0 = new SupportingDocument();
      supportingDocument0.getTitle();
      assertFalse(supportingDocument0.isNewRecord());
      assertEquals("0", supportingDocument0.getDisplayItemIdentifier());
  }
}
