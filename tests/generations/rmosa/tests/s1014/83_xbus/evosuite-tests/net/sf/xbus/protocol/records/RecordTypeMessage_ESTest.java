/*
 * This file was automatically generated by EvoSuite
 * Sun Nov 08 22:30:57 GMT 2020
 */

package net.sf.xbus.protocol.records;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import net.sf.xbus.base.bytearraylist.ByteArrayList;
import net.sf.xbus.base.xbussystem.XBUSSystem;
import net.sf.xbus.protocol.records.RecordTypeMessage;
import org.apache.xerces.dom.CoreDocumentImpl;
import org.apache.xerces.dom.DeferredDocumentImpl;
import org.apache.xerces.dom.PSVIDocumentImpl;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class RecordTypeMessage_ESTest extends RecordTypeMessage_ESTest_scaffolding {

  /**
  //Test case number: 0
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      RecordTypeMessage recordTypeMessage0 = new RecordTypeMessage((XBUSSystem) null);
      recordTypeMessage0.synchronizeResponseFields((XBUSSystem) null);
      assertEquals("RecordTypeMessage", recordTypeMessage0.getShortname());
      assertEquals("RC_OK", recordTypeMessage0.getReturncode());
  }

  /**
  //Test case number: 1
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      RecordTypeMessage recordTypeMessage0 = new RecordTypeMessage("5U", (XBUSSystem) null, "DbFT{5$");
      try { 
        recordTypeMessage0.setResponseObject("DbFT{5$", (XBUSSystem) null);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // I_02_003_0 java.lang.String cannot be cast to net.sf.xbus.base.bytearraylist.ByteArrayList
         //
         verifyException("net.sf.xbus.protocol.records.RecordTypeMessage", e);
      }
  }

  /**
  //Test case number: 2
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      RecordTypeMessage recordTypeMessage0 = new RecordTypeMessage((XBUSSystem) null);
      DeferredDocumentImpl deferredDocumentImpl0 = new DeferredDocumentImpl();
      // Undeclared exception!
      try { 
        recordTypeMessage0.setResponseDocument(deferredDocumentImpl0, (XBUSSystem) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.xerces.dom.DeferredDocumentImpl", e);
      }
  }

  /**
  //Test case number: 3
  /*Coverage entropy=1.3321790402101223
  */
  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      RecordTypeMessage recordTypeMessage0 = new RecordTypeMessage((XBUSSystem) null);
      CoreDocumentImpl coreDocumentImpl0 = new CoreDocumentImpl(true);
      recordTypeMessage0.setResponseDocument(coreDocumentImpl0, (XBUSSystem) null);
      recordTypeMessage0.getResponseObject();
      assertEquals("RC_OK", recordTypeMessage0.getReturncode());
      assertEquals("RecordTypeMessage", recordTypeMessage0.getShortname());
  }

  /**
  //Test case number: 4
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      RecordTypeMessage recordTypeMessage0 = new RecordTypeMessage((XBUSSystem) null);
      recordTypeMessage0.getResponseObject();
      assertEquals("RecordTypeMessage", recordTypeMessage0.getShortname());
  }

  /**
  //Test case number: 5
  /*Coverage entropy=1.3296613488547582
  */
  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      byte[] byteArray0 = new byte[8];
      ByteArrayList byteArrayList0 = ByteArrayList.createByteArrayList(byteArray0, 1);
      RecordTypeMessage recordTypeMessage0 = new RecordTypeMessage((XBUSSystem) null);
      // Undeclared exception!
      try { 
        recordTypeMessage0.setResponseObject(byteArrayList0, (XBUSSystem) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("net.sf.xbus.protocol.xml.XMLMessageAbstract", e);
      }
  }

  /**
  //Test case number: 6
  /*Coverage entropy=1.0397207708399179
  */
  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      RecordTypeMessage recordTypeMessage0 = new RecordTypeMessage("5U", (XBUSSystem) null, "DbFT{5$");
      byte[] byteArray0 = new byte[1];
      ByteArrayList byteArrayList0 = ByteArrayList.createByteArrayList(byteArray0, (byte)49);
      recordTypeMessage0.setResponseObject(byteArrayList0, (XBUSSystem) null);
      assertEquals("RecordTypeMessage", recordTypeMessage0.getShortname());
      assertEquals("RC_OK", recordTypeMessage0.getReturncode());
      assertEquals(0, recordTypeMessage0.getErrorcode());
  }

  /**
  //Test case number: 7
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      RecordTypeMessage recordTypeMessage0 = new RecordTypeMessage((XBUSSystem) null);
      recordTypeMessage0.getRequestObject((XBUSSystem) null);
      assertEquals("RecordTypeMessage", recordTypeMessage0.getShortname());
  }

  /**
  //Test case number: 8
  /*Coverage entropy=1.0397207708399179
  */
  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      RecordTypeMessage recordTypeMessage0 = new RecordTypeMessage((XBUSSystem) null);
      ByteArrayList byteArrayList0 = new ByteArrayList();
      recordTypeMessage0.setRequestObject(byteArrayList0, (XBUSSystem) null);
      assertEquals("RecordTypeMessage", recordTypeMessage0.getShortname());
  }

  /**
  //Test case number: 9
  /*Coverage entropy=1.3296613488547582
  */
  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      RecordTypeMessage recordTypeMessage0 = new RecordTypeMessage((XBUSSystem) null);
      ByteArrayList byteArrayList0 = new ByteArrayList();
      byte[] byteArray0 = new byte[3];
      byteArrayList0.add(byteArray0);
      // Undeclared exception!
      try { 
        recordTypeMessage0.setRequestObject(byteArrayList0, (XBUSSystem) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("net.sf.xbus.protocol.xml.XMLMessageAbstract", e);
      }
  }

  /**
  //Test case number: 10
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      RecordTypeMessage recordTypeMessage0 = new RecordTypeMessage((XBUSSystem) null);
      recordTypeMessage0.setRequestObject((Object) null, (XBUSSystem) null);
      assertEquals("RecordTypeMessage", recordTypeMessage0.getShortname());
  }

  /**
  //Test case number: 11
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      RecordTypeMessage recordTypeMessage0 = new RecordTypeMessage((XBUSSystem) null);
      Object object0 = new Object();
      try { 
        recordTypeMessage0.setRequestObject(object0, (XBUSSystem) null);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // I_02_003_0 java.lang.Object cannot be cast to net.sf.xbus.base.bytearraylist.ByteArrayList
         //
         verifyException("net.sf.xbus.protocol.records.RecordTypeMessage", e);
      }
  }

  /**
  //Test case number: 12
  /*Coverage entropy=1.3321790402101223
  */
  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      RecordTypeMessage recordTypeMessage0 = new RecordTypeMessage("", (XBUSSystem) null, (String) null);
      PSVIDocumentImpl pSVIDocumentImpl0 = new PSVIDocumentImpl();
      recordTypeMessage0.setResponseDocument(pSVIDocumentImpl0, (XBUSSystem) null);
      recordTypeMessage0.getResponseText();
      assertEquals("RC_OK", recordTypeMessage0.getReturncode());
      assertEquals("RecordTypeMessage", recordTypeMessage0.getShortname());
  }

  /**
  //Test case number: 13
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      RecordTypeMessage recordTypeMessage0 = new RecordTypeMessage((XBUSSystem) null);
      recordTypeMessage0.getResponseText();
      assertEquals("RecordTypeMessage", recordTypeMessage0.getShortname());
  }

  /**
  //Test case number: 14
  /*Coverage entropy=1.3862943611198906
  */
  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      RecordTypeMessage recordTypeMessage0 = new RecordTypeMessage((XBUSSystem) null);
      recordTypeMessage0.setResponseText((String) null, (XBUSSystem) null);
      assertEquals(0, recordTypeMessage0.getErrorcode());
      assertEquals("RecordTypeMessage", recordTypeMessage0.getShortname());
      assertEquals("RC_OK", recordTypeMessage0.getReturncode());
  }

  /**
  //Test case number: 15
  /*Coverage entropy=1.329661348854758
  */
  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      RecordTypeMessage recordTypeMessage0 = new RecordTypeMessage((XBUSSystem) null);
      // Undeclared exception!
      try { 
        recordTypeMessage0.setResponseText("0", (XBUSSystem) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("net.sf.xbus.protocol.xml.XMLMessageAbstract", e);
      }
  }

  /**
  //Test case number: 16
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      RecordTypeMessage recordTypeMessage0 = new RecordTypeMessage((XBUSSystem) null);
      recordTypeMessage0.getRequestText((XBUSSystem) null);
      assertEquals("RecordTypeMessage", recordTypeMessage0.getShortname());
  }

  /**
  //Test case number: 17
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      RecordTypeMessage recordTypeMessage0 = new RecordTypeMessage("5U", (XBUSSystem) null, "5U");
      recordTypeMessage0.setRequestText((String) null, (XBUSSystem) null);
      assertEquals("RecordTypeMessage", recordTypeMessage0.getShortname());
  }

  /**
  //Test case number: 18
  /*Coverage entropy=1.3296613488547582
  */
  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      RecordTypeMessage recordTypeMessage0 = new RecordTypeMessage((XBUSSystem) null);
      // Undeclared exception!
      try { 
        recordTypeMessage0.setRequestText("", (XBUSSystem) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("net.sf.xbus.protocol.xml.XMLMessageAbstract", e);
      }
  }

  /**
  //Test case number: 19
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      RecordTypeMessage recordTypeMessage0 = new RecordTypeMessage((XBUSSystem) null);
      recordTypeMessage0.getRequestTextAsXML((XBUSSystem) null);
      assertEquals("RecordTypeMessage", recordTypeMessage0.getShortname());
  }

  /**
  //Test case number: 20
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      RecordTypeMessage recordTypeMessage0 = new RecordTypeMessage((String) null, (XBUSSystem) null, (String) null);
      recordTypeMessage0.synchronizeRequestFields((XBUSSystem) null);
      assertEquals("RecordTypeMessage", recordTypeMessage0.getShortname());
  }

  /**
  //Test case number: 21
  /*Coverage entropy=1.3862943611198906
  */
  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      RecordTypeMessage recordTypeMessage0 = new RecordTypeMessage((XBUSSystem) null);
      recordTypeMessage0.setResponseObject((Object) null, (XBUSSystem) null);
      assertEquals("RC_OK", recordTypeMessage0.getReturncode());
      assertEquals(0, recordTypeMessage0.getErrorcode());
      assertEquals("RecordTypeMessage", recordTypeMessage0.getShortname());
  }
}
