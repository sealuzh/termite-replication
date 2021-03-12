/*
 * This file was automatically generated by EvoSuite
 * Sun Nov 08 04:47:22 GMT 2020
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
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class SupportingDocument_ESTest extends SupportingDocument_ESTest_scaffolding {

  /**
  //Test case number: 0
  /*Coverage entropy=1.9459347757561138
  */
  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      SupportingDocument supportingDocument0 = new SupportingDocument();
      SupportingDocument supportingDocument1 = new SupportingDocument();
      supportingDocument0.setDocumentCode("zsGWk18?");
      User user0 = new User((String) null, "/");
      ArrayList<MacawChangeEvent> arrayList0 = SupportingDocument.detectFieldChanges(user0, supportingDocument0, supportingDocument1);
      assertFalse(supportingDocument1.isNewRecord());
      assertEquals(1, arrayList0.size());
      assertEquals(0, supportingDocument1.getIdentifier());
  }

  /**
  //Test case number: 1
  /*Coverage entropy=1.5607104090414063
  */
  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      User user0 = new User();
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
  //Test case number: 2
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      SupportingDocument supportingDocument0 = new SupportingDocument();
      supportingDocument0.setTitle((String) null);
      supportingDocument0.getTitle();
      assertFalse(supportingDocument0.isNewRecord());
      assertEquals(0, supportingDocument0.getIdentifier());
  }

  /**
  //Test case number: 3
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      SupportingDocument supportingDocument0 = new SupportingDocument();
      supportingDocument0.setTitle("0");
      supportingDocument0.getTitle();
      assertFalse(supportingDocument0.isNewRecord());
      assertEquals(0, supportingDocument0.getIdentifier());
  }

  /**
  //Test case number: 4
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      SupportingDocument supportingDocument0 = new SupportingDocument();
      supportingDocument0.setIdentifier(7);
      int int0 = supportingDocument0.getIdentifier();
      assertEquals(7, int0);
  }

  /**
  //Test case number: 5
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      SupportingDocument supportingDocument0 = new SupportingDocument();
      supportingDocument0.setFilePath((String) null);
      supportingDocument0.getFilePath();
      assertFalse(supportingDocument0.isNewRecord());
      assertEquals(0, supportingDocument0.getIdentifier());
  }

  /**
  //Test case number: 6
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      SupportingDocument supportingDocument0 = new SupportingDocument();
      supportingDocument0.setFilePath("}9)idTGx");
      supportingDocument0.getFilePath();
      assertFalse(supportingDocument0.isNewRecord());
      assertEquals("0", supportingDocument0.getDisplayItemIdentifier());
  }

  /**
  //Test case number: 7
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      SupportingDocument supportingDocument0 = new SupportingDocument();
      supportingDocument0.setFileName((String) null);
      supportingDocument0.getFileName();
      assertEquals("0", supportingDocument0.getDisplayItemIdentifier());
      assertFalse(supportingDocument0.isNewRecord());
  }

  /**
  //Test case number: 8
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      SupportingDocument supportingDocument0 = new SupportingDocument();
      supportingDocument0.setFileName("_9O3*zNJL7coxC.4");
      supportingDocument0.getFileName();
      assertFalse(supportingDocument0.isNewRecord());
      assertEquals("0", supportingDocument0.getDisplayItemIdentifier());
  }

  /**
  //Test case number: 9
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      SupportingDocument supportingDocument0 = new SupportingDocument();
      supportingDocument0.setDocumentCode((String) null);
      supportingDocument0.getDocumentCode();
      assertFalse(supportingDocument0.isNewRecord());
      assertEquals(0, supportingDocument0.getIdentifier());
  }

  /**
  //Test case number: 10
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      SupportingDocument supportingDocument0 = new SupportingDocument();
      supportingDocument0.setDocumentCode("ceep8lcf-K{-?");
      supportingDocument0.getDocumentCode();
      assertFalse(supportingDocument0.isNewRecord());
      assertEquals(0, supportingDocument0.getIdentifier());
  }

  /**
  //Test case number: 11
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      SupportingDocument supportingDocument0 = new SupportingDocument();
      supportingDocument0.setDescription((String) null);
      supportingDocument0.getDescription();
      assertEquals("0", supportingDocument0.getDisplayItemIdentifier());
      assertFalse(supportingDocument0.isNewRecord());
  }

  /**
  //Test case number: 12
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      SupportingDocument supportingDocument0 = new SupportingDocument();
      supportingDocument0.setDescription("iyJT>vnZSCKOZ8,7A-");
      supportingDocument0.getDescription();
      assertFalse(supportingDocument0.isNewRecord());
      assertEquals("0", supportingDocument0.getDisplayItemIdentifier());
  }

  /**
  //Test case number: 13
  /*Coverage entropy=1.5607104090414063
  */
  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
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
  //Test case number: 14
  /*Coverage entropy=1.6674619334292948
  */
  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      User user0 = new User();
      SupportingDocument supportingDocument0 = new SupportingDocument();
      supportingDocument0.setDescription((String) null);
      // Undeclared exception!
      try { 
        SupportingDocument.detectFieldChanges(user0, supportingDocument0, supportingDocument0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
      }
  }

  /**
  //Test case number: 15
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      SupportingDocument supportingDocument0 = new SupportingDocument();
      supportingDocument0.getTitle();
      assertEquals("0", supportingDocument0.getDisplayItemIdentifier());
      assertFalse(supportingDocument0.isNewRecord());
  }

  /**
  //Test case number: 16
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      SupportingDocument supportingDocument0 = new SupportingDocument();
      supportingDocument0.getDocumentCode();
      assertFalse(supportingDocument0.isNewRecord());
      assertEquals(0, supportingDocument0.getIdentifier());
  }

  /**
  //Test case number: 17
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      SupportingDocument supportingDocument0 = new SupportingDocument();
      supportingDocument0.setIdentifier((-1120));
      int int0 = supportingDocument0.getIdentifier();
      assertEquals((-1120), int0);
  }

  /**
  //Test case number: 18
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      SupportingDocument supportingDocument0 = new SupportingDocument();
      supportingDocument0.getFileName();
      assertFalse(supportingDocument0.isNewRecord());
      assertEquals(0, supportingDocument0.getIdentifier());
  }

  /**
  //Test case number: 19
  /*Coverage entropy=1.9459347757561138
  */
  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      SupportingDocument supportingDocument0 = new SupportingDocument();
      SupportingDocument supportingDocument1 = new SupportingDocument();
      supportingDocument1.setFilePath("0");
      User user0 = new User();
      ArrayList<MacawChangeEvent> arrayList0 = SupportingDocument.detectFieldChanges(user0, supportingDocument0, supportingDocument1);
      assertEquals(0, supportingDocument1.getIdentifier());
      assertFalse(supportingDocument1.isNewRecord());
      assertEquals(1, arrayList0.size());
  }

  /**
  //Test case number: 20
  /*Coverage entropy=1.9459347757561138
  */
  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      SupportingDocument supportingDocument0 = new SupportingDocument();
      SupportingDocument supportingDocument1 = new SupportingDocument();
      supportingDocument1.setFileName((String) null);
      User user0 = new User((String) null, (String) null);
      ArrayList<MacawChangeEvent> arrayList0 = SupportingDocument.detectFieldChanges(user0, supportingDocument0, supportingDocument1);
      assertFalse(supportingDocument1.isNewRecord());
      assertEquals(1, arrayList0.size());
      assertEquals(0, supportingDocument1.getIdentifier());
  }

  /**
  //Test case number: 21
  /*Coverage entropy=1.9459347757561138
  */
  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      SupportingDocument supportingDocument0 = new SupportingDocument();
      supportingDocument0.setDescription("0");
      SupportingDocument supportingDocument1 = new SupportingDocument();
      User user0 = new User();
      ArrayList<MacawChangeEvent> arrayList0 = SupportingDocument.detectFieldChanges(user0, supportingDocument0, supportingDocument1);
      assertEquals(1, arrayList0.size());
      assertEquals(0, supportingDocument1.getIdentifier());
      assertFalse(supportingDocument1.isNewRecord());
  }

  /**
  //Test case number: 22
  /*Coverage entropy=1.9459347757561138
  */
  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      SupportingDocument supportingDocument0 = new SupportingDocument();
      SupportingDocument supportingDocument1 = new SupportingDocument();
      User user0 = new User((String) null, "/");
      supportingDocument1.setDocumentCode("/");
      ArrayList<MacawChangeEvent> arrayList0 = SupportingDocument.detectFieldChanges(user0, supportingDocument0, supportingDocument1);
      assertEquals(0, supportingDocument1.getIdentifier());
      assertFalse(supportingDocument1.isNewRecord());
      assertEquals(1, arrayList0.size());
  }

  /**
  //Test case number: 23
  /*Coverage entropy=1.9459347757561138
  */
  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      SupportingDocument supportingDocument0 = new SupportingDocument();
      SupportingDocument supportingDocument1 = new SupportingDocument();
      supportingDocument0.setTitle("/");
      User user0 = new User((String) null, (String) null);
      ArrayList<MacawChangeEvent> arrayList0 = SupportingDocument.detectFieldChanges(user0, supportingDocument0, supportingDocument1);
      assertFalse(supportingDocument1.isNewRecord());
      assertEquals(1, arrayList0.size());
      assertEquals(0, supportingDocument1.getIdentifier());
  }

  /**
  //Test case number: 24
  /*Coverage entropy=1.666332585328325
  */
  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      User user0 = new User();
      SupportingDocument supportingDocument0 = new SupportingDocument();
      ArrayList<MacawChangeEvent> arrayList0 = SupportingDocument.detectFieldChanges(user0, supportingDocument0, supportingDocument0);
      assertEquals(0, supportingDocument0.getIdentifier());
      assertEquals(0, arrayList0.size());
      assertFalse(supportingDocument0.isNewRecord());
  }

  /**
  //Test case number: 25
  /*Coverage entropy=1.8937882323911377
  */
  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      SupportingDocument supportingDocument0 = new SupportingDocument();
      supportingDocument0.setTitle("~WxK$>^w15u`Eb Dl");
      supportingDocument0.setFileName("_9O3*zNJL7coxC.4");
      supportingDocument0.setDocumentCode("suportingDocumet.title.label");
      SupportingDocument.validateFields(supportingDocument0);
      assertFalse(supportingDocument0.isNewRecord());
      assertEquals("0", supportingDocument0.getDisplayItemIdentifier());
      assertEquals(0, supportingDocument0.getIdentifier());
  }

  /**
  //Test case number: 26
  /*Coverage entropy=1.4205719259467045
  */
  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      SupportingDocument supportingDocument0 = new SupportingDocument();
      supportingDocument0.setFileName("/hSb{{'D~sdrPJQ");
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
  //Test case number: 27
  /*Coverage entropy=1.4205719259467042
  */
  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      SupportingDocument supportingDocument0 = new SupportingDocument();
      supportingDocument0.setDocumentCode("user.addressLine1.saveChanges");
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
  //Test case number: 28
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      SupportingDocument supportingDocument0 = new SupportingDocument();
      String string0 = supportingDocument0.getDisplayItemIdentifier();
      assertFalse(supportingDocument0.isNewRecord());
      assertEquals("0", string0);
  }

  /**
  //Test case number: 29
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      SupportingDocument supportingDocument0 = new SupportingDocument();
      assertFalse(supportingDocument0.isNewRecord());
      
      supportingDocument0.setIsNewRecord(true);
      boolean boolean0 = supportingDocument0.isNewRecord();
      assertTrue(boolean0);
  }

  /**
  //Test case number: 30
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      SupportingDocument supportingDocument0 = new SupportingDocument();
      boolean boolean0 = supportingDocument0.isNewRecord();
      assertEquals(0, supportingDocument0.getIdentifier());
      assertFalse(boolean0);
  }

  /**
  //Test case number: 31
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      SupportingDocument supportingDocument0 = new SupportingDocument();
      String string0 = supportingDocument0.getDisplayName();
      assertEquals("0", supportingDocument0.getDisplayItemIdentifier());
      assertEquals("-", string0);
      assertFalse(supportingDocument0.isNewRecord());
  }

  /**
  //Test case number: 32
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      SupportingDocument supportingDocument0 = new SupportingDocument();
      int int0 = supportingDocument0.getIdentifier();
      assertEquals(0, int0);
      assertFalse(supportingDocument0.isNewRecord());
  }

  /**
  //Test case number: 33
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      SupportingDocument supportingDocument0 = new SupportingDocument();
      supportingDocument0.getFilePath();
      assertFalse(supportingDocument0.isNewRecord());
      assertEquals("0", supportingDocument0.getDisplayItemIdentifier());
  }

  /**
  //Test case number: 34
  /*Coverage entropy=2.0794415416798357
  */
  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      SupportingDocument supportingDocument0 = new SupportingDocument();
      SupportingDocument supportingDocument1 = (SupportingDocument)supportingDocument0.clone();
      assertFalse(supportingDocument1.isNewRecord());
      assertNotSame(supportingDocument1, supportingDocument0);
      assertEquals("0", supportingDocument1.getDisplayItemIdentifier());
  }

  /**
  //Test case number: 35
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      SupportingDocument supportingDocument0 = new SupportingDocument();
      supportingDocument0.getDescription();
      assertFalse(supportingDocument0.isNewRecord());
      assertEquals("0", supportingDocument0.getDisplayItemIdentifier());
  }
}
