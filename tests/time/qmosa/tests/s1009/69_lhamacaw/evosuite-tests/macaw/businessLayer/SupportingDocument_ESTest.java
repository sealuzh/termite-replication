/*
 * This file was automatically generated by EvoSuite
 * Tue Dec 03 21:02:20 GMT 2019
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
  /*Coverage entropy=2.884381759284857
  */
  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      SupportingDocument supportingDocument0 = new SupportingDocument();
      String string0 = null;
      supportingDocument0.setFilePath((String) null);
      supportingDocument0.setTitle((String) null);
      String string1 = "+ZK";
      supportingDocument0.setFilePath("+ZK");
      supportingDocument0.setDescription("p~$0Nq\"oip)c");
      supportingDocument0.clone();
      supportingDocument0.getDisplayName();
      supportingDocument0.getTitle();
      supportingDocument0.isNewRecord();
      supportingDocument0.setDocumentCode("2t");
      User user0 = new User("7qDgh]w_aL7f0W", "Z.)r6Ox:BJWP<`");
      SupportingDocument supportingDocument1 = new SupportingDocument();
      User user1 = new User();
      User.detectFieldChanges(user1, user1, user1);
      user1.setAddressLine2("supportingDocument.title.label");
      // Undeclared exception!
      try { 
        User.checkValidEmail((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  /**
  //Test case number: 1
  /*Coverage entropy=2.537746198967082
  */
  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      SupportingDocument supportingDocument0 = new SupportingDocument();
      supportingDocument0.getDisplayName();
      supportingDocument0.setDocumentCode("-");
      supportingDocument0.getDisplayName();
      supportingDocument0.getDisplayName();
      supportingDocument0.setFileName("--");
      supportingDocument0.setDocumentCode("supportingDocument.filePath.saveChanges");
      supportingDocument0.setFileName("UNABLE_TO_GET_CONNECTION");
      supportingDocument0.setTitle("supportingDocument.filePath.saveChanges");
      supportingDocument0.setFileName("supportingDocument.filePath.saveChanges");
      supportingDocument0.setDocumentCode("-");
      SupportingDocument.validateFields(supportingDocument0);
      supportingDocument0.getDisplayName();
      supportingDocument0.getFileName();
      supportingDocument0.getDisplayName();
      supportingDocument0.setTitle((String) null);
      supportingDocument0.setTitle("UNABLE_TO_GET_CONNECTION");
      SupportingDocument supportingDocument1 = new SupportingDocument();
      SupportingDocument supportingDocument2 = new SupportingDocument();
      supportingDocument2.getDisplayName();
      supportingDocument2.clone();
      supportingDocument2.getFileName();
      SupportingDocument supportingDocument3 = new SupportingDocument();
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
  //Test case number: 2
  /*Coverage entropy=0.3333333333333333
  */
  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      User user0 = new User("1+j14Enh26-QbI@F^P", "1+j14Enh26-QbI@F^P");
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
  //Test case number: 3
  /*Coverage entropy=3.0934511977004218
  */
  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      SupportingDocument supportingDocument0 = new SupportingDocument();
      supportingDocument0.clone();
      supportingDocument0.clone();
      supportingDocument0.setIdentifier((-3978));
      supportingDocument0.getDisplayItemIdentifier();
      supportingDocument0.getDisplayName();
      System.setCurrentTimeMillis(2026L);
      User user0 = new User("-", "-");
      user0.setPhone("SUPPORTING_DOCUMENT");
      User.detectFieldChanges(user0, user0, user0);
      supportingDocument0.setDocumentCode("-");
      SupportingDocument.detectFieldChanges(user0, supportingDocument0, supportingDocument0);
      supportingDocument0.getIdentifier();
      System.setCurrentTimeMillis(1L);
      supportingDocument0.getIdentifier();
      supportingDocument0.getDisplayItemIdentifier();
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
  /*Coverage entropy=2.471346413410988
  */
  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      SupportingDocument supportingDocument0 = new SupportingDocument();
      supportingDocument0.setFileName("QV45]rWcKWxWr$6-YH");
      supportingDocument0.getIdentifier();
      supportingDocument0.getFilePath();
      supportingDocument0.setFilePath("QV45]rWcKWxWr$6-YH");
      supportingDocument0.setDocumentCode("3-");
      supportingDocument0.getFilePath();
      supportingDocument0.getFileName();
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
  //Test case number: 5
  /*Coverage entropy=3.107118049107557
  */
  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      SupportingDocument supportingDocument0 = new SupportingDocument();
      supportingDocument0.getDisplayName();
      supportingDocument0.setDocumentCode("-");
      supportingDocument0.getDisplayName();
      supportingDocument0.getDisplayName();
      supportingDocument0.setFileName("--");
      supportingDocument0.setDocumentCode("supportingDocument.filePath.saveChanges");
      supportingDocument0.setFileName("UNABLE_TO_GET_CONNECTION");
      supportingDocument0.setTitle("supportingDocument.filePath.saveChanges");
      supportingDocument0.setFileName("supportingDocument.filePath.saveChanges");
      supportingDocument0.setDocumentCode("-");
      SupportingDocument.validateFields(supportingDocument0);
      supportingDocument0.getDisplayName();
      supportingDocument0.getDisplayName();
      supportingDocument0.getDocumentCode();
      supportingDocument0.setTitle((String) null);
      supportingDocument0.setTitle("UNABLE_TO_GET_CONNECTION");
      SupportingDocument supportingDocument1 = new SupportingDocument();
      User user0 = new User("supportingDocument.description.saveChanges", (String) null);
      SupportingDocument supportingDocument2 = new SupportingDocument();
      SupportingDocument supportingDocument3 = new SupportingDocument();
      supportingDocument3.setFileName("^[w-+&*]+(?:.[w-_+&*]+)*@(?:[w-]+.)+[a-zA-Z]{2,7}$");
      supportingDocument3.getDisplayName();
      user0.setFirstName("--");
      ArrayList<MacawChangeEvent> arrayList0 = SupportingDocument.detectFieldChanges(user0, supportingDocument0, supportingDocument2);
      assertEquals(3, arrayList0.size());
      
      SupportingDocument supportingDocument4 = (SupportingDocument)supportingDocument3.clone();
      assertEquals(0, supportingDocument4.getIdentifier());
      assertEquals("^[w-+&*]+(?:.[w-_+&*]+)*@(?:[w-]+.)+[a-zA-Z]{2,7}$", supportingDocument4.getFileName());
      
      supportingDocument3.getFileName();
      SupportingDocument supportingDocument5 = new SupportingDocument();
      supportingDocument5.setFileName("-");
      supportingDocument3.getDisplayName();
      assertNotSame(supportingDocument3, supportingDocument4);
      
      String string0 = supportingDocument1.getDisplayName();
      assertEquals("-", string0);
      
      supportingDocument1.getFileName();
      SupportingDocument supportingDocument6 = new SupportingDocument();
      assertFalse(supportingDocument6.isNewRecord());
  }

  /**
  //Test case number: 6
  /*Coverage entropy=2.663634389021002
  */
  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      User user0 = new User();
      User user1 = (User)user0.clone();
      SupportingDocument supportingDocument0 = new SupportingDocument();
      SupportingDocument supportingDocument1 = new SupportingDocument();
      supportingDocument0.setDescription("R");
      User.detectFieldChanges(user0, user0, user0);
      supportingDocument1.setTitle("R");
      SupportingDocument.detectFieldChanges(user1, supportingDocument1, supportingDocument0);
      supportingDocument0.setIdentifier(1);
      User.detectFieldChanges(user0, user0, user1);
      User user2 = new User();
      SupportingDocument.detectFieldChanges(user2, supportingDocument0, supportingDocument1);
      user2.setFirstName("user.status.saveChanges");
      User user3 = new User("R", "R");
      user2.setUserID(" A}4XDVYfP&");
      User user4 = new User("R", "e-MhP3Z+'V5bdpt,/");
      User.detectFieldChanges(user4, user2, user2);
      User user5 = new User("macaw.system.MacawChangeEvent", "supportingDocument.fileName.label");
      User user6 = new User();
      User user7 = new User((String) null, "5");
      User.detectFieldChanges(user2, user4, user5);
      User.detectFieldChanges(user0, user0, user4);
      User user8 = new User("wP=AO@", "wP=AO@");
      user8.setAddressLine2("j");
      try { 
        User.checkValidEmail("M&\"R");
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // The email value \"M&\"R\" is not valid.
         //
         verifyException("macaw.businessLayer.User", e);
      }
  }

  /**
  //Test case number: 7
  /*Coverage entropy=1.5271837172395382
  */
  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      SupportingDocument supportingDocument0 = new SupportingDocument();
      supportingDocument0.setDescription("d]Q\u0004*");
      supportingDocument0.getDescription();
      assertFalse(supportingDocument0.isNewRecord());
      assertEquals(0, supportingDocument0.getIdentifier());
  }

  /**
  //Test case number: 8
  /*Coverage entropy=2.973278742811257
  */
  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      SupportingDocument supportingDocument0 = new SupportingDocument();
      supportingDocument0.setFilePath("f34%4\"");
      supportingDocument0.getFileName();
      supportingDocument0.setIsNewRecord(false);
      supportingDocument0.setFilePath("#D3/Ny");
      supportingDocument0.setIsNewRecord(true);
      supportingDocument0.clone();
      supportingDocument0.setIsNewRecord(true);
      supportingDocument0.getTitle();
      supportingDocument0.setFilePath("f34%4\"");
      supportingDocument0.setFilePath("\r<5]-|lK");
      supportingDocument0.setDocumentCode("kL`'YJ/^852Gnd#4");
      supportingDocument0.isNewRecord();
      supportingDocument0.setFilePath("");
      assertTrue(supportingDocument0.isNewRecord());
  }

  /**
  //Test case number: 9
  /*Coverage entropy=2.550744561660995
  */
  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      SupportingDocument supportingDocument0 = new SupportingDocument();
      supportingDocument0.getDisplayName();
      SupportingDocument supportingDocument1 = new SupportingDocument();
      SupportingDocument supportingDocument2 = new SupportingDocument();
      SupportingDocument supportingDocument3 = new SupportingDocument();
      supportingDocument1.setDocumentCode("-");
      User user0 = new User("supportingDocument.documentCode.saveChanges", "supportingDocument.documentCode.saveChanges");
      SupportingDocument.detectFieldChanges(user0, supportingDocument0, supportingDocument1);
      User user1 = new User();
      User user2 = new User("UNABLE_TO_GET_CONNECTION", "-");
      User user3 = new User(" A}4XDVYfP&", "supportingDocument.fileName.saveChanges");
      User user4 = new User(" \"", " A}4XDVYfP&");
      User.detectFieldChanges(user4, user1, user4);
      User user5 = new User("supportingDocument.fileName.label", "B}A&R;-zWZo");
      User.detectFieldChanges(user4, user1, user1);
      user4.setAddressLine2("supportingDocument.fileName.label");
      try { 
        User.checkValidEmail("%r;0g`R3O[2Z`yc}");
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // The email value \"%r;0g`R3O[2Z`yc}\" is not valid.
         //
         verifyException("macaw.businessLayer.User", e);
      }
  }

  /**
  //Test case number: 10
  /*Coverage entropy=2.861612571365326
  */
  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      SupportingDocument supportingDocument0 = new SupportingDocument();
      supportingDocument0.getDisplayName();
      supportingDocument0.setDocumentCode("-");
      supportingDocument0.getDisplayName();
      supportingDocument0.getDisplayName();
      supportingDocument0.setFileName("--");
      supportingDocument0.setDocumentCode("supportingDocument.filePath.saveChanges");
      supportingDocument0.setFileName("UNABLE_TO_GET_CONNECTION");
      supportingDocument0.setTitle("supportingDocument.filePath.saveChanges");
      supportingDocument0.setFileName("supportingDocument.filePath.saveChanges");
      supportingDocument0.setDocumentCode("-");
      SupportingDocument.validateFields(supportingDocument0);
      supportingDocument0.getDisplayName();
      supportingDocument0.getDisplayName();
      supportingDocument0.getDisplayName();
      supportingDocument0.setTitle((String) null);
      supportingDocument0.setTitle("UNABLE_TO_GET_CONNECTION");
      SupportingDocument supportingDocument1 = new SupportingDocument();
      User user0 = new User("supportingDocument.description.saveChanges", (String) null);
      SupportingDocument supportingDocument2 = new SupportingDocument();
      SupportingDocument supportingDocument3 = new SupportingDocument();
      supportingDocument3.setFileName("^[w-+&*]+(?:.[w-_+&*]+)*@(?:[w-]+.)+[a-zA-Z]{2,7}$");
      supportingDocument3.getDisplayName();
      user0.setFirstName("--");
      SupportingDocument.detectFieldChanges(user0, supportingDocument0, supportingDocument2);
      supportingDocument3.clone();
      supportingDocument3.getFileName();
      SupportingDocument supportingDocument4 = new SupportingDocument();
      supportingDocument4.setFileName("supportingDocument.filePath.saveChanges--");
      supportingDocument3.getDisplayName();
      supportingDocument1.getDisplayName();
      supportingDocument2.getDisplayName();
      supportingDocument0.clone();
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
  //Test case number: 11
  /*Coverage entropy=2.41248110220352
  */
  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      User user0 = new User();
      User user1 = (User)user0.clone();
      SupportingDocument supportingDocument0 = new SupportingDocument();
      SupportingDocument supportingDocument1 = new SupportingDocument();
      supportingDocument0.setDescription("R");
      User.detectFieldChanges(user0, user0, user0);
      supportingDocument1.setTitle("R");
      SupportingDocument.detectFieldChanges(user1, supportingDocument1, supportingDocument0);
      User.detectFieldChanges(user0, user0, user1);
      User user2 = new User();
      User.detectFieldChanges(user1, user0, user0);
      user2.setFirstName("user.status.saveChanges");
      User user3 = new User("R", "R");
      user2.setUserID(" A}4XDVYfP&");
      User user4 = new User("R", "user.status.saveChanges");
      User.detectFieldChanges(user4, user2, user2);
      User user5 = new User("macaw.system.MacawChangeEvent", "supportingDocument.fileName.label");
      user4.setAffiliation("macaw.system.MacawChangeEvent");
      User user6 = new User("wP=AO@", "wP=AO@");
      User user7 = new User((String) null, "5");
      User.detectFieldChanges(user2, user4, user5);
      User.detectFieldChanges(user0, user0, user4);
      User user8 = new User("wP=AO@", "wP=AO@");
      user8.setCity("Wo!h{E");
      user8.setAddressLine2("j");
      SupportingDocument.detectFieldChanges(user4, supportingDocument1, supportingDocument1);
      try { 
        User.checkValidEmail("M&\"R");
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // The email value \"M&\"R\" is not valid.
         //
         verifyException("macaw.businessLayer.User", e);
      }
  }

  /**
  //Test case number: 12
  /*Coverage entropy=2.271759469228055
  */
  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      SupportingDocument supportingDocument0 = new SupportingDocument();
      supportingDocument0.getDisplayName();
      supportingDocument0.setDocumentCode("-");
      supportingDocument0.getDisplayName();
      supportingDocument0.getDisplayName();
      supportingDocument0.setFileName("--");
      supportingDocument0.setDocumentCode("supportingDocument.filePath.saveChanges");
      String string0 = "UNABLE_TO_GET_CONNECTION";
      supportingDocument0.setFileName("UNABLE_TO_GET_CONNECTION");
      supportingDocument0.setTitle("supportingDocument.filePath.saveChanges");
      supportingDocument0.setFileName("supportingDocument.filePath.saveChanges");
      supportingDocument0.setDocumentCode("-");
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
  //Test case number: 13
  /*Coverage entropy=2.146332585328325
  */
  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      User user0 = new User("Q`3bX%6E", "Q`3bX%6E");
      SupportingDocument supportingDocument0 = new SupportingDocument();
      ArrayList<MacawChangeEvent> arrayList0 = SupportingDocument.detectFieldChanges(user0, supportingDocument0, supportingDocument0);
      assertEquals(0, supportingDocument0.getIdentifier());
      assertFalse(supportingDocument0.isNewRecord());
      assertEquals(0, arrayList0.size());
  }

  /**
  //Test case number: 14
  /*Coverage entropy=2.2141739247775263
  */
  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      SupportingDocument supportingDocument0 = new SupportingDocument();
      supportingDocument0.getIdentifier();
      supportingDocument0.getFilePath();
      supportingDocument0.setFilePath("QV45]rWcKWxWr$6-YH");
      supportingDocument0.getFilePath();
      supportingDocument0.getFileName();
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
  /*Coverage entropy=2.9487704705214233
  */
  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      SupportingDocument supportingDocument0 = new SupportingDocument();
      String string0 = null;
      supportingDocument0.setDescription((String) null);
      supportingDocument0.setTitle("");
      supportingDocument0.setIdentifier(144);
      supportingDocument0.isNewRecord();
      supportingDocument0.isNewRecord();
      supportingDocument0.getFileName();
      supportingDocument0.isNewRecord();
      supportingDocument0.clone();
      supportingDocument0.getDescription();
      supportingDocument0.setIdentifier(144);
      supportingDocument0.setIdentifier((-2421));
      SupportingDocument supportingDocument1 = new SupportingDocument();
      supportingDocument1.getDisplayName();
      supportingDocument1.setFileName("+=i)RA4R$~S&IWn.");
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
  //Test case number: 16
  /*Coverage entropy=1.8911601612408222
  */
  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      SupportingDocument supportingDocument0 = new SupportingDocument();
      supportingDocument0.setTitle("x-B'5v=4:K],74");
      supportingDocument0.setTitle("t0zm'uMs46)(ku");
      supportingDocument0.getTitle();
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
  /*Coverage entropy=2.7574442526529053
  */
  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      User user0 = new User();
      User user1 = (User)user0.clone();
      SupportingDocument supportingDocument0 = new SupportingDocument();
      SupportingDocument supportingDocument1 = new SupportingDocument();
      supportingDocument0.setDescription("R");
      supportingDocument1.setFilePath("R");
      User.detectFieldChanges(user0, user0, user0);
      supportingDocument1.setTitle("R");
      SupportingDocument.detectFieldChanges(user1, supportingDocument1, supportingDocument0);
      supportingDocument0.setIdentifier(1);
      User.detectFieldChanges(user0, user0, user1);
      User user2 = new User();
      User.detectFieldChanges(user1, user0, user0);
      user2.setFirstName("user.status.saveChanges");
      User user3 = new User("R", "R");
      user2.setUserID(" A}4XDVYfP&");
      User user4 = new User("R", "e-MhP3Z+'V5bdpt,/");
      User.detectFieldChanges(user4, user2, user2);
      User user5 = new User("macaw.system.MacawChangeEvent", "supportingDocument.fileName.label");
      User user6 = new User("wP=AO@", "wP=AO@");
      User user7 = new User((String) null, "5");
      User.detectFieldChanges(user2, user4, user5);
      User.detectFieldChanges(user0, user0, user4);
      User user8 = new User("wP=AO@", "wP=AO@");
      user8.setCity("Wo!h{E");
      user8.setAddressLine2("j");
      try { 
        User.checkValidEmail("M&\"R");
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // The email value \"M&\"R\" is not valid.
         //
         verifyException("macaw.businessLayer.User", e);
      }
  }

  /**
  //Test case number: 18
  /*Coverage entropy=3.265546468718654
  */
  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      SupportingDocument supportingDocument0 = new SupportingDocument();
      supportingDocument0.setDocumentCode("Jpw7Dq=");
      supportingDocument0.setFileName((String) null);
      supportingDocument0.getFileName();
      supportingDocument0.clone();
      supportingDocument0.setDocumentCode((String) null);
      supportingDocument0.getDisplayItemIdentifier();
      supportingDocument0.getDocumentCode();
      supportingDocument0.setIdentifier(3130);
      supportingDocument0.getDisplayName();
      supportingDocument0.setFilePath((String) null);
      supportingDocument0.clone();
      supportingDocument0.isNewRecord();
      supportingDocument0.getDescription();
      supportingDocument0.setIsNewRecord(false);
      supportingDocument0.getDescription();
      supportingDocument0.setDocumentCode(">nx$/=2");
      supportingDocument0.setFileName((String) null);
      supportingDocument0.getFilePath();
      supportingDocument0.setDocumentCode("supportingDocument.fileName.label");
      supportingDocument0.getFilePath();
      System.setCurrentTimeMillis(1363L);
  }

  /**
  //Test case number: 19
  /*Coverage entropy=2.6254322008409563
  */
  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      User user0 = new User();
      User user1 = (User)user0.clone();
      SupportingDocument supportingDocument0 = new SupportingDocument();
      SupportingDocument supportingDocument1 = new SupportingDocument();
      supportingDocument0.setDescription("R");
      supportingDocument0.setIsNewRecord(false);
      SupportingDocument.detectFieldChanges(user1, supportingDocument0, supportingDocument0);
      supportingDocument1.setTitle("R");
      SupportingDocument.detectFieldChanges(user1, supportingDocument1, supportingDocument0);
      supportingDocument0.setIdentifier(1);
      User.detectFieldChanges(user0, user0, user1);
      User user2 = new User();
      User.detectFieldChanges(user1, user0, user0);
      user2.setFirstName("user.status.saveChanges");
      User user3 = new User("R", "R");
      user2.setUserID(" A}4XDVYfP&");
      User user4 = new User("R", "e-MhP3Z+'V5bdpt,/");
      User.detectFieldChanges(user4, user2, user2);
      User user5 = new User("macaw.system.MacawChangeEvent", "supportingDocument.fileName.label");
      User user6 = new User("wP=AO@", "wP=AO@");
      User user7 = new User((String) null, "5");
      User.detectFieldChanges(user2, user4, user5);
      User.detectFieldChanges(user0, user0, user4);
      user6.setAddressLine2("UNABLE_TO_CLEAR_TABLE");
      try { 
        User.checkValidEmail("R");
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // The email value \"R\" is not valid.
         //
         verifyException("macaw.businessLayer.User", e);
      }
  }

  /**
  //Test case number: 20
  /*Coverage entropy=2.973278742811257
  */
  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      SupportingDocument supportingDocument0 = new SupportingDocument();
      supportingDocument0.setFilePath("f34%4\"");
      supportingDocument0.getFileName();
      supportingDocument0.setIsNewRecord(false);
      supportingDocument0.setFilePath("#D3/Ny");
      supportingDocument0.setIsNewRecord(false);
      SupportingDocument supportingDocument1 = (SupportingDocument)supportingDocument0.clone();
      assertEquals("#D3/Ny", supportingDocument1.getFilePath());
      assertEquals("0", supportingDocument1.getDisplayItemIdentifier());
      
      supportingDocument0.setIsNewRecord(false);
      supportingDocument0.getTitle();
      supportingDocument0.setFilePath("f34%4\"");
      supportingDocument0.setFilePath("\r<5]-|lK");
      supportingDocument0.setDocumentCode("kL`'YJ/^852Gnd#4");
      supportingDocument0.isNewRecord();
      supportingDocument0.setFilePath("");
      assertNotSame(supportingDocument0, supportingDocument1);
      assertFalse(supportingDocument0.isNewRecord());
  }

  /**
  //Test case number: 21
  /*Coverage entropy=2.6587503841369973
  */
  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      User user0 = new User();
      User user1 = (User)user0.clone();
      SupportingDocument supportingDocument0 = new SupportingDocument();
      SupportingDocument supportingDocument1 = new SupportingDocument();
      supportingDocument1.setFileName("R");
      supportingDocument0.setDescription("R");
      User.detectFieldChanges(user0, user0, user0);
      supportingDocument1.setTitle("R");
      SupportingDocument.detectFieldChanges(user1, supportingDocument1, supportingDocument0);
      User.detectFieldChanges(user0, user0, user1);
      User user2 = new User();
      User.detectFieldChanges(user1, user0, user0);
      user2.setFirstName("user.status.saveChanges");
      User user3 = new User("R", "R");
      user2.setUserID(" A}4XDVYfP&");
      User user4 = new User("R", "user.status.saveChanges");
      User.detectFieldChanges(user4, user2, user2);
      User user5 = new User("macaw.system.MacawChangeEvent", "supportingDocument.fileName.label");
      user4.setFirstName("_7,]MlO");
      User user6 = new User("wP=AO@", "wP=AO@");
      User user7 = new User((String) null, "5");
      User.detectFieldChanges(user2, user4, user5);
      User.detectFieldChanges(user0, user0, user4);
      User user8 = new User("wP=AO@", "wP=AO@");
      user8.setCity("Wo!h{E");
      user8.setAddressLine2("j");
      try { 
        User.checkValidEmail("M&\"R");
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // The email value \"M&\"R\" is not valid.
         //
         verifyException("macaw.businessLayer.User", e);
      }
  }

  /**
  //Test case number: 22
  /*Coverage entropy=2.349421283797024
  */
  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      SupportingDocument supportingDocument0 = new SupportingDocument();
      supportingDocument0.setFileName("QV45]rWcKWxWr$6-YH");
      supportingDocument0.getIdentifier();
      supportingDocument0.getFilePath();
      supportingDocument0.setFilePath("QV45]rWcKWxWr$6-YH");
      supportingDocument0.getFilePath();
      supportingDocument0.getFileName();
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
  /*Coverage entropy=2.7259611383251188
  */
  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      User user0 = new User();
      User user1 = (User)user0.clone();
      SupportingDocument supportingDocument0 = new SupportingDocument();
      SupportingDocument supportingDocument1 = new SupportingDocument();
      supportingDocument0.setDescription("R");
      User.detectFieldChanges(user0, user0, user0);
      supportingDocument1.setTitle("R");
      SupportingDocument.detectFieldChanges(user1, supportingDocument1, supportingDocument0);
      supportingDocument0.setIdentifier(1);
      User.detectFieldChanges(user0, user0, user1);
      User user2 = new User();
      User.detectFieldChanges(user1, user0, user0);
      user2.setFirstName("user.status.saveChanges");
      User user3 = new User("R", "R");
      user2.setUserID(" A}4XDVYfP&");
      User user4 = new User("R", "e-MhP3Z+'V5bdpt,/");
      User.detectFieldChanges(user4, user2, user2);
      User user5 = new User("macaw.system.MacawChangeEvent", "supportingDocument.fileName.label");
      User user6 = new User("wP=AO@", "wP=AO@");
      User user7 = new User((String) null, "5");
      User.detectFieldChanges(user2, user4, user5);
      User.detectFieldChanges(user0, user0, user4);
      User user8 = new User("wP=AO@", "wP=AO@");
      user8.setAddressLine2("j");
      supportingDocument0.getDisplayName();
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
  //Test case number: 24
  /*Coverage entropy=1.1217186091313738
  */
  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      SupportingDocument supportingDocument0 = new SupportingDocument();
      supportingDocument0.getDocumentCode();
      supportingDocument0.getDocumentCode();
      assertFalse(supportingDocument0.isNewRecord());
      assertEquals("0", supportingDocument0.getDisplayItemIdentifier());
  }
}
