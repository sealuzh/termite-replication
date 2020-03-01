/*
 * This file was automatically generated by EvoSuite
 * Wed Dec 04 01:46:27 GMT 2019
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
  /*Coverage entropy=3.070595974054693
  */
  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      SupportingDocument supportingDocument0 = new SupportingDocument();
      supportingDocument0.setFilePath(".");
      supportingDocument0.setDescription(".");
      SupportingDocument supportingDocument1 = new SupportingDocument();
      supportingDocument1.getDisplayName();
      supportingDocument1.setDescription("-");
      supportingDocument1.setDescription("-");
      supportingDocument0.setDescription(".");
      SupportingDocument supportingDocument2 = new SupportingDocument();
      supportingDocument2.setFileName((String) null);
      supportingDocument1.clone();
      User user0 = new User();
      SupportingDocument.detectFieldChanges(user0, supportingDocument0, supportingDocument0);
      User user1 = new User();
      user1.setCounty("UNABLE_TO_DELETE_AVAILABILITY_STATE");
      SupportingDocument supportingDocument3 = new SupportingDocument();
      supportingDocument3.getDisplayName();
      supportingDocument2.getFileName();
      SupportingDocument supportingDocument4 = new SupportingDocument();
      SupportingDocument supportingDocument5 = new SupportingDocument();
      supportingDocument5.getDisplayName();
      supportingDocument0.clone();
      SupportingDocument supportingDocument6 = new SupportingDocument();
      SupportingDocument supportingDocument7 = new SupportingDocument();
      supportingDocument1.getFilePath();
      SupportingDocument supportingDocument8 = new SupportingDocument();
      // Undeclared exception!
      try { 
        SupportingDocument.validateFields(supportingDocument2);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("macaw.util.ValidationUtility", e);
      }
  }

  /**
  //Test case number: 1
  /*Coverage entropy=2.919131134410343
  */
  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      SupportingDocument supportingDocument0 = new SupportingDocument();
      supportingDocument0.setFilePath(".");
      supportingDocument0.setDescription(".");
      SupportingDocument supportingDocument1 = new SupportingDocument();
      supportingDocument1.getDisplayName();
      supportingDocument0.setDescription("-");
      supportingDocument0.setDescription(".Wt:=yQ6,iF+");
      supportingDocument1.setFileName("QuSJvw");
      supportingDocument1.clone();
      User user0 = new User();
      SupportingDocument.detectFieldChanges(user0, supportingDocument1, supportingDocument0);
      User user1 = new User();
      user0.setCounty((String) null);
      User user2 = new User("-", "SELF_REFERENCING_ALTERNATIVE_VARIABLE");
      SupportingDocument.detectFieldChanges(user2, supportingDocument0, supportingDocument0);
      supportingDocument1.setFilePath((String) null);
      SupportingDocument supportingDocument2 = new SupportingDocument();
      User user3 = new User();
      SupportingDocument supportingDocument3 = new SupportingDocument();
      supportingDocument3.setFilePath(".Wt:=yQ6,iF+");
      User user4 = new User();
      SupportingDocument supportingDocument4 = new SupportingDocument();
      SupportingDocument.detectFieldChanges(user2, supportingDocument0, supportingDocument1);
      User user5 = new User((String) null, ".Wt:=yQ6,iF+");
      supportingDocument1.getFilePath();
      try { 
        SupportingDocument.validateFields(supportingDocument3);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("macaw.businessLayer.SupportingDocument", e);
      }
  }

  /**
  //Test case number: 2
  /*Coverage entropy=3.0682039661751377
  */
  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      SupportingDocument supportingDocument0 = new SupportingDocument();
      supportingDocument0.setFilePath(".");
      supportingDocument0.setDescription("UNABLE_TO_FILTER_ONTOLOGY_TERMS");
      SupportingDocument supportingDocument1 = new SupportingDocument();
      supportingDocument0.getDisplayName();
      supportingDocument0.setDescription("SELF_REFERENCING_ALTERNATIVE_VARIABLE");
      supportingDocument0.setDescription(".Wt:=yQ6,iF+");
      supportingDocument0.setFileName((String) null);
      supportingDocument1.setDocumentCode((String) null);
      supportingDocument1.getDocumentCode();
      supportingDocument0.clone();
      SupportingDocument supportingDocument2 = new SupportingDocument();
      User user0 = new User();
      SupportingDocument.detectFieldChanges(user0, supportingDocument2, supportingDocument2);
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
  //Test case number: 3
  /*Coverage entropy=2.786451934820146
  */
  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      SupportingDocument supportingDocument0 = new SupportingDocument();
      supportingDocument0.clone();
      supportingDocument0.setIdentifier((-1908874351));
      supportingDocument0.setDescription((String) null);
      int int0 = 1;
      supportingDocument0.clone();
      supportingDocument0.getDescription();
      supportingDocument0.setDescription((String) null);
      supportingDocument0.clone();
      supportingDocument0.setDocumentCode("M2");
      supportingDocument0.setFileName("-");
      supportingDocument0.setTitle("");
      SupportingDocument supportingDocument1 = new SupportingDocument();
      try { 
        SupportingDocument.validateFields(supportingDocument1);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("macaw.businessLayer.SupportingDocument", e);
      }
  }

  /**
  //Test case number: 4
  /*Coverage entropy=2.7900645486493145
  */
  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      SupportingDocument supportingDocument0 = new SupportingDocument();
      supportingDocument0.setFilePath("INVALID_RAW_VARIABLE");
      supportingDocument0.setDocumentCode("FK");
      supportingDocument0.setFileName(":W");
      supportingDocument0.setTitle("[");
      SupportingDocument.validateFields(supportingDocument0);
      supportingDocument0.clone();
      SupportingDocument supportingDocument1 = new SupportingDocument();
      supportingDocument0.setFilePath("UNABLE_TO_FILTER_SUPPORTING_DOCUMENTS");
      SupportingDocument supportingDocument2 = new SupportingDocument();
      User user0 = new User();
      SupportingDocument supportingDocument3 = new SupportingDocument();
      supportingDocument2.setFilePath("`");
      User user1 = new User();
      SupportingDocument.detectFieldChanges(user1, supportingDocument1, supportingDocument0);
      SupportingDocument supportingDocument4 = new SupportingDocument();
      supportingDocument3.getFilePath();
      try { 
        SupportingDocument.validateFields(supportingDocument2);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("macaw.businessLayer.SupportingDocument", e);
      }
  }

  /**
  //Test case number: 5
  /*Coverage entropy=2.5254627173634634
  */
  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      SupportingDocument supportingDocument0 = new SupportingDocument();
      supportingDocument0.setFilePath(".");
      SupportingDocument supportingDocument1 = new SupportingDocument();
      String string0 = supportingDocument1.getDisplayName();
      assertEquals("-", string0);
      
      SupportingDocument supportingDocument2 = new SupportingDocument();
      supportingDocument0.setFileName("-");
      SupportingDocument supportingDocument3 = new SupportingDocument();
      User user0 = new User();
      SupportingDocument.detectFieldChanges(user0, supportingDocument1, supportingDocument1);
      User user1 = new User();
      user1.setStatus("-");
      User user2 = new User("B=dAxv*k", (String) null);
      ArrayList<MacawChangeEvent> arrayList0 = SupportingDocument.detectFieldChanges(user0, supportingDocument3, supportingDocument0);
      assertEquals(2, arrayList0.size());
      
      supportingDocument0.setFilePath("-");
      SupportingDocument supportingDocument4 = new SupportingDocument();
      User user3 = new User();
      user3.setCity("uoXKpDXvy,lQ. Fq");
      SupportingDocument supportingDocument5 = new SupportingDocument();
      supportingDocument5.setFilePath("UNABLE_TO_CHECK_VARIABLE_EXISTS");
      User user4 = new User();
      SupportingDocument supportingDocument6 = new SupportingDocument();
      User user5 = new User("EJ9s#p# /y=1I'", "UNABLE_TO_GET_CHANGES_FOR_LIST_CHOICES");
      supportingDocument2.getFilePath();
      Object object0 = new Object();
      supportingDocument4.getFileName();
      assertEquals(0, supportingDocument4.getIdentifier());
      assertFalse(supportingDocument4.isNewRecord());
  }

  /**
  //Test case number: 6
  /*Coverage entropy=2.8539194997658326
  */
  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      SupportingDocument supportingDocument0 = new SupportingDocument();
      supportingDocument0.setFilePath("INVALID_RAW_VARIABLE");
      supportingDocument0.setDocumentCode("INVALID_RAW_VARIABLE");
      supportingDocument0.setFileName(":W");
      supportingDocument0.setTitle("[");
      SupportingDocument.validateFields(supportingDocument0);
      SupportingDocument supportingDocument1 = (SupportingDocument)supportingDocument0.clone();
      SupportingDocument supportingDocument2 = new SupportingDocument();
      supportingDocument1.setFileName(":W");
      User user0 = new User();
      SupportingDocument.detectFieldChanges(user0, supportingDocument1, supportingDocument0);
      User user1 = new User();
      user1.setStatus("uoXKpDXvy,lQ. Fq");
      supportingDocument2.setFilePath("(~>J-7 ");
      User user2 = new User("supportingDocument.documentCode.saveChanges", "INVALID_RAW_VARIABLE");
      SupportingDocument.detectFieldChanges(user1, supportingDocument1, supportingDocument2);
      supportingDocument2.setFilePath(":W");
      SupportingDocument supportingDocument3 = new SupportingDocument();
      User user3 = new User();
      user3.setCity("INVALID_RAW_VARIABLE");
      supportingDocument1.setFilePath("supportingDocument.documentCode.saveChanges");
      User user4 = new User();
      SupportingDocument supportingDocument4 = new SupportingDocument();
      User user5 = new User("ZYD8<AFo", "EJ9s#p# /y=1I'");
      supportingDocument1.getFilePath();
      assertEquals("INVALID_RAW_VARIABLE", supportingDocument0.getFilePath());
      
      supportingDocument3.clone();
      supportingDocument4.getFileName();
      assertFalse(supportingDocument4.isNewRecord());
  }

  /**
  //Test case number: 7
  /*Coverage entropy=3.027643606164363
  */
  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      SupportingDocument supportingDocument0 = new SupportingDocument();
      supportingDocument0.setFilePath(".");
      SupportingDocument supportingDocument1 = new SupportingDocument();
      supportingDocument1.getDisplayName();
      SupportingDocument supportingDocument2 = new SupportingDocument();
      supportingDocument0.setFileName("-");
      supportingDocument2.setDocumentCode("-");
      supportingDocument0.clone();
      SupportingDocument supportingDocument3 = new SupportingDocument();
      User user0 = new User();
      SupportingDocument supportingDocument4 = new SupportingDocument();
      SupportingDocument.detectFieldChanges(user0, supportingDocument4, supportingDocument2);
      try { 
        SupportingDocument.validateFields(supportingDocument4);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("macaw.businessLayer.SupportingDocument", e);
      }
  }

  /**
  //Test case number: 8
  /*Coverage entropy=2.8893560773424762
  */
  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      SupportingDocument supportingDocument0 = new SupportingDocument();
      supportingDocument0.setFilePath("INVALID_RAW_VARIABLE");
      supportingDocument0.setDescription("kk+");
      supportingDocument0.setDescription("1r* Nhq]}SD");
      supportingDocument0.setDescription("kk+");
      supportingDocument0.setFileName("supportingDocument.fileName.saveChanges");
      supportingDocument0.clone();
      SupportingDocument supportingDocument1 = new SupportingDocument();
      User user0 = new User();
      SupportingDocument.detectFieldChanges(user0, supportingDocument1, supportingDocument0);
      User user1 = new User();
      User user2 = new User("o D/O>ANxc9XRa:7", "supportingDocument.fileName.saveChanges");
      SupportingDocument.detectFieldChanges(user2, supportingDocument1, supportingDocument0);
      supportingDocument1.setFilePath("supportingDocument.fileName.saveChanges");
      SupportingDocument supportingDocument2 = new SupportingDocument();
      User user3 = new User();
      SupportingDocument supportingDocument3 = new SupportingDocument();
      supportingDocument3.setFilePath("#DoBk:XQ>bp*#**.");
      User user4 = new User();
      SupportingDocument supportingDocument4 = new SupportingDocument();
      SupportingDocument.detectFieldChanges(user2, supportingDocument2, supportingDocument3);
      User user5 = new User("q?cFu`PA", "supportingDocument.fileName.label");
      supportingDocument0.getFilePath();
      try { 
        SupportingDocument.validateFields(supportingDocument4);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("macaw.businessLayer.SupportingDocument", e);
      }
  }

  /**
  //Test case number: 9
  /*Coverage entropy=3.039934581415844
  */
  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      SupportingDocument supportingDocument0 = new SupportingDocument();
      supportingDocument0.setIdentifier(1277);
      supportingDocument0.setDescription("cyaccr%L");
      supportingDocument0.clone();
      supportingDocument0.setDescription("cyaccr%L");
      supportingDocument0.clone();
      supportingDocument0.setDocumentCode("cyaccr%L");
      supportingDocument0.setFileName("cyaccr%L");
      supportingDocument0.setTitle("cyaccr%L");
      SupportingDocument.validateFields(supportingDocument0);
      SupportingDocument supportingDocument1 = new SupportingDocument();
      supportingDocument0.getIdentifier();
      supportingDocument1.clone();
      SupportingDocument supportingDocument2 = new SupportingDocument();
      supportingDocument1.setIdentifier(0);
      User user0 = new User();
      User user1 = new User("a{H'%7&2?-58heMO?)?", "]6H`,U_pLb");
      ArrayList<MacawChangeEvent> arrayList0 = SupportingDocument.detectFieldChanges(user1, supportingDocument1, supportingDocument0);
      assertEquals("1277", supportingDocument0.getDisplayItemIdentifier());
      assertEquals(4, arrayList0.size());
  }

  /**
  //Test case number: 10
  /*Coverage entropy=3.039934581415844
  */
  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      SupportingDocument supportingDocument0 = new SupportingDocument();
      supportingDocument0.setFilePath("INVALID_RAW_VARIABLE");
      supportingDocument0.setDocumentCode("M");
      supportingDocument0.setFileName("INVALID_RAW_VARIABLE");
      supportingDocument0.setTitle("INVALID_RAW_VARIABLE");
      SupportingDocument.validateFields(supportingDocument0);
      SupportingDocument supportingDocument1 = (SupportingDocument)supportingDocument0.clone();
      supportingDocument1.setTitle("[");
      SupportingDocument.validateFields(supportingDocument0);
      SupportingDocument supportingDocument2 = (SupportingDocument)supportingDocument1.clone();
      SupportingDocument supportingDocument3 = new SupportingDocument();
      supportingDocument3.setFilePath("INVALID_RAW_VARIABLE");
      supportingDocument3.setIdentifier((-2093796554));
      supportingDocument3.setFilePath("C");
      SupportingDocument supportingDocument4 = new SupportingDocument();
      User user0 = new User();
      user0.setLastName("INVALID_RAW_VARIABLE");
      User user1 = new User();
      SupportingDocument supportingDocument5 = new SupportingDocument();
      SupportingDocument.detectFieldChanges(user1, supportingDocument5, supportingDocument1);
      User user2 = new User("%?hVQa#X:xY()Z", "UNABLE_TO_CREATE_RAW_VARIABLE");
      supportingDocument5.getFilePath();
      supportingDocument3.getFileName();
      supportingDocument2.getTitle();
      assertEquals("INVALID_RAW_VARIABLE", supportingDocument0.getTitle());
      assertEquals("0", supportingDocument1.getDisplayItemIdentifier());
  }

  /**
  //Test case number: 11
  /*Coverage entropy=2.9674604629828947
  */
  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      SupportingDocument supportingDocument0 = new SupportingDocument();
      supportingDocument0.setFilePath("INVALID_RAW_VARIABLE");
      supportingDocument0.setDocumentCode("INVALID_RAW_VARIABLE");
      supportingDocument0.setFileName(":W");
      supportingDocument0.setTitle("[");
      SupportingDocument.validateFields(supportingDocument0);
      SupportingDocument supportingDocument1 = (SupportingDocument)supportingDocument0.clone();
      SupportingDocument supportingDocument2 = new SupportingDocument();
      User user0 = new User();
      SupportingDocument.detectFieldChanges(user0, supportingDocument1, supportingDocument0);
      User user1 = new User();
      user1.setStatus("uoXKpDXvy,lQ. Fq");
      User user2 = new User("supportingDocument.documentCode.saveChanges", "INVALID_RAW_VARIABLE");
      User.detectFieldChanges(user0, user2, user1);
      supportingDocument2.setFilePath(":W");
      SupportingDocument supportingDocument3 = new SupportingDocument();
      User user3 = new User();
      user3.setCity("INVALID_RAW_VARIABLE");
      supportingDocument1.setFilePath("supportingDocument.documentCode.saveChanges");
      assertEquals("INVALID_RAW_VARIABLE", supportingDocument0.getFilePath());
      
      User user4 = new User();
      SupportingDocument supportingDocument4 = new SupportingDocument();
      User user5 = new User("op-v5y3", "INVALID_RAW_VARIABLE");
      supportingDocument4.getFilePath();
      supportingDocument4.clone();
      supportingDocument3.getFileName();
      assertFalse(supportingDocument3.isNewRecord());
  }

  /**
  //Test case number: 12
  /*Coverage entropy=2.995188933862035
  */
  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      SupportingDocument supportingDocument0 = new SupportingDocument();
      supportingDocument0.setFilePath("INVALID_RAW_VARIABLE");
      supportingDocument0.setDocumentCode("FK");
      supportingDocument0.setFileName(":W");
      supportingDocument0.setTitle("[");
      SupportingDocument.validateFields(supportingDocument0);
      SupportingDocument supportingDocument1 = (SupportingDocument)supportingDocument0.clone();
      supportingDocument0.setFilePath("UNABLE_TO_FILTER_SUPPORTING_DOCUMENTS");
      User user0 = new User();
      SupportingDocument.detectFieldChanges(user0, supportingDocument1, supportingDocument0);
      User user1 = new User();
      User user2 = new User("supportingDocument.documentCode.saveChanges", "cyaccr%L");
      SupportingDocument.detectFieldChanges(user1, supportingDocument1, supportingDocument0);
      supportingDocument0.setFilePath(":W");
      SupportingDocument supportingDocument2 = new SupportingDocument();
      User user3 = new User();
      user3.setCity("FK");
      SupportingDocument supportingDocument3 = new SupportingDocument();
      supportingDocument1.setFilePath("supportingDocument.documentCode.saveChanges");
      User user4 = new User();
      SupportingDocument supportingDocument4 = new SupportingDocument();
      SupportingDocument.detectFieldChanges(user3, supportingDocument2, supportingDocument4);
      User user5 = new User("%?hVQa#X:xY()Z", "cyaccr%L");
      supportingDocument0.getFilePath();
      SupportingDocument.validateFields(supportingDocument1);
      supportingDocument0.getFileName();
      assertEquals(":W", supportingDocument0.getFilePath());
  }

  /**
  //Test case number: 13
  /*Coverage entropy=2.4324212622426007
  */
  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      User user0 = new User("WCs^hz3LZDj^", "WCs^hz3LZDj^");
      SupportingDocument supportingDocument0 = new SupportingDocument();
      SupportingDocument.detectFieldChanges(user0, supportingDocument0, supportingDocument0);
      supportingDocument0.setFilePath(",]Wyw5PisuBRI80aqM=");
      SupportingDocument supportingDocument1 = new SupportingDocument();
      User user1 = new User();
      SupportingDocument supportingDocument2 = new SupportingDocument();
      supportingDocument1.setFilePath("UNABLE_TO_VALIDATE_USER");
      User user2 = new User();
      User user3 = new User("WCs^hz3LZDj^", "fy|Up7O4s4J8x!");
      supportingDocument2.getFilePath();
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
  /*Coverage entropy=2.7825850929940454
  */
  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      SupportingDocument supportingDocument0 = new SupportingDocument();
      supportingDocument0.getDisplayName();
      supportingDocument0.setIdentifier((-2650));
      supportingDocument0.setFilePath("?!y,20y/h,rNRuX\"j,");
      supportingDocument0.setIsNewRecord(true);
      supportingDocument0.getDescription();
      supportingDocument0.setFileName("-");
      supportingDocument0.setDescription("-");
      supportingDocument0.setIsNewRecord(true);
      supportingDocument0.getIdentifier();
      supportingDocument0.getDisplayName();
      supportingDocument0.getFileName();
      assertEquals("-2650", supportingDocument0.getDisplayItemIdentifier());
  }

  /**
  //Test case number: 15
  /*Coverage entropy=2.4316490614703996
  */
  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      SupportingDocument supportingDocument0 = new SupportingDocument();
      supportingDocument0.setFilePath("t:%vF~N6e[x:9aY&");
      SupportingDocument supportingDocument1 = new SupportingDocument();
      User user0 = new User();
      user0.setLastName("a<A//dBIts");
      User user1 = new User();
      SupportingDocument.detectFieldChanges(user1, supportingDocument1, supportingDocument0);
      supportingDocument1.getFilePath();
      supportingDocument0.getDescription();
      System.setCurrentTimeMillis(0L);
  }

  /**
  //Test case number: 16
  /*Coverage entropy=2.059615150468091
  */
  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      SupportingDocument supportingDocument0 = new SupportingDocument();
      SupportingDocument supportingDocument1 = new SupportingDocument();
      supportingDocument0.setDescription("supportingDocument.title.label");
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
  //Test case number: 17
  /*Coverage entropy=3.265739407171288
  */
  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      SupportingDocument supportingDocument0 = new SupportingDocument();
      supportingDocument0.getDisplayName();
      supportingDocument0.setFileName("WCs^hz3LZDj^");
      supportingDocument0.getDescription();
      supportingDocument0.getTitle();
      supportingDocument0.getDescription();
      supportingDocument0.setFilePath("");
      supportingDocument0.getFileName();
      supportingDocument0.getFilePath();
      supportingDocument0.getFileName();
      supportingDocument0.setDescription("s'aZ*j8/)r,7N}sf");
      supportingDocument0.clone();
      supportingDocument0.isNewRecord();
      supportingDocument0.setDescription("");
      supportingDocument0.setFilePath("Uw]1$j[|oVl3VaP1");
      supportingDocument0.setIsNewRecord(false);
      supportingDocument0.clone();
      supportingDocument0.getFilePath();
      supportingDocument0.getDisplayName();
      supportingDocument0.setIsNewRecord(true);
      supportingDocument0.getIdentifier();
      boolean boolean0 = supportingDocument0.isNewRecord();
      assertTrue(boolean0);
  }

  /**
  //Test case number: 18
  /*Coverage entropy=3.0150203334794483
  */
  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      SupportingDocument supportingDocument0 = new SupportingDocument();
      User user0 = new User("'SrU", "IW1=$sKC2{");
      supportingDocument0.clone();
      user0.setPassword("general.error.blankField");
      user0.setAddressLine2("supportingDocument.description.saveChanges");
      supportingDocument0.clone();
      supportingDocument0.setTitle("IW1=$sKC2{");
      SupportingDocument.detectFieldChanges(user0, supportingDocument0, supportingDocument0);
      supportingDocument0.setFilePath("supportingDocument.description.saveChanges");
      supportingDocument0.clone();
      user0.setEmail("general.error.blankField");
      supportingDocument0.setDocumentCode("");
      supportingDocument0.getIdentifier();
      supportingDocument0.setDescription("'SrU");
      supportingDocument0.getFileName();
      try { 
        User.validateFields(user0);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("macaw.businessLayer.User", e);
      }
  }

  /**
  //Test case number: 19
  /*Coverage entropy=2.4428887847131775
  */
  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      User user0 = new User();
      SupportingDocument supportingDocument0 = new SupportingDocument();
      supportingDocument0.setFilePath("%?hVQa#X:xY()Z");
      User user1 = new User();
      SupportingDocument supportingDocument1 = new SupportingDocument();
      SupportingDocument.detectFieldChanges(user1, supportingDocument0, supportingDocument1);
      User.detectFieldChanges(user0, user0, user1);
      supportingDocument1.getFilePath();
      try { 
        SupportingDocument.validateFields(supportingDocument1);
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
  /*Coverage entropy=2.95849139349546
  */
  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      SupportingDocument supportingDocument0 = new SupportingDocument();
      supportingDocument0.setFilePath("");
      supportingDocument0.clone();
      supportingDocument0.setFilePath("");
      User user0 = new User("", (String) null);
      SupportingDocument supportingDocument1 = new SupportingDocument();
      SupportingDocument.detectFieldChanges(user0, supportingDocument0, supportingDocument0);
      supportingDocument0.setFileName("| Oic5}q{>b_g<f0g");
      supportingDocument0.setIsNewRecord(false);
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
  //Test case number: 21
  /*Coverage entropy=1.5271837172395382
  */
  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      SupportingDocument supportingDocument0 = new SupportingDocument();
      supportingDocument0.setIdentifier((-2040109463));
      supportingDocument0.getDisplayItemIdentifier();
      System.setCurrentTimeMillis((-68L));
  }

  /**
  //Test case number: 22
  /*Coverage entropy=2.05569358184064
  */
  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      SupportingDocument supportingDocument0 = new SupportingDocument();
      supportingDocument0.getDisplayName();
      supportingDocument0.setTitle("!yb!CMwVV|v/B");
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
  //Test case number: 23
  /*Coverage entropy=1.5271837172395382
  */
  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      SupportingDocument supportingDocument0 = new SupportingDocument();
      supportingDocument0.setDocumentCode("WCs^hz3LZDj^");
      supportingDocument0.getDocumentCode();
      assertEquals(0, supportingDocument0.getIdentifier());
      assertFalse(supportingDocument0.isNewRecord());
  }

  /**
  //Test case number: 24
  /*Coverage entropy=2.8890672715137127
  */
  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      SupportingDocument supportingDocument0 = new SupportingDocument();
      supportingDocument0.setDescription("WCs^hz3LZDj^");
      supportingDocument0.setFileName("SELF_REFERENCING_ALTERNATIVE_VARIABLE");
      supportingDocument0.clone();
      User user0 = new User();
      SupportingDocument.detectFieldChanges(user0, supportingDocument0, supportingDocument0);
      User user1 = new User();
      user1.setCounty("SELF_REFERENCING_ALTERNATIVE_VARIABLE");
      User user2 = new User("cyaccr%L", "SELF_REFERENCING_ALTERNATIVE_VARIABLE");
      SupportingDocument.detectFieldChanges(user0, supportingDocument0, supportingDocument0);
      SupportingDocument supportingDocument1 = new SupportingDocument();
      supportingDocument1.setFilePath("cyaccr%L");
      SupportingDocument supportingDocument2 = new SupportingDocument();
      User user3 = new User();
      SupportingDocument supportingDocument3 = new SupportingDocument();
      supportingDocument0.setFilePath(":H abm&Z dQ");
      User user4 = new User();
      User user5 = new User(".", ":H abm&Z dQ");
      supportingDocument2.getFilePath();
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
  /*Coverage entropy=2.4422633938438842
  */
  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      SupportingDocument supportingDocument0 = new SupportingDocument();
      supportingDocument0.setFileName("WCs^hz3LZDj^");
      supportingDocument0.setTitle("-K\"BM|:mHZf,DhsP");
      User user0 = new User("UNABLE_TO_UPDATE_CATEGORY", ";'y|Cc F6EP+H2_");
      supportingDocument0.setFileName("WCs^hz3LZDj^");
      SupportingDocument.detectFieldChanges(user0, supportingDocument0, supportingDocument0);
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
  /*Coverage entropy=0.3333333333333333
  */
  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      User user0 = new User();
      // Undeclared exception!
      try { 
        SupportingDocument.detectFieldChanges(user0, (SupportingDocument) null, (SupportingDocument) null);
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
  /*Coverage entropy=1.0931471805599453
  */
  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      System.setCurrentTimeMillis(714L);
      SupportingDocument supportingDocument0 = new SupportingDocument();
      supportingDocument0.getDocumentCode();
      assertFalse(supportingDocument0.isNewRecord());
      assertEquals("0", supportingDocument0.getDisplayItemIdentifier());
  }
}
