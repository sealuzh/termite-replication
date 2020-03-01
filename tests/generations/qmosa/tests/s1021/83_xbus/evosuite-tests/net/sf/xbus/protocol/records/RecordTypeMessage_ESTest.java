/*
 * This file was automatically generated by EvoSuite
 * Tue Nov 19 01:37:39 GMT 2019
 */

package net.sf.xbus.protocol.records;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.ibm.wsdl.BindingImpl;
import com.ibm.wsdl.BindingOperationImpl;
import java.io.DataInputStream;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.PipedInputStream;
import java.io.SequenceInputStream;
import java.net.URL;
import java.nio.CharBuffer;
import java.time.Instant;
import java.time.OffsetDateTime;
import java.time.ZoneOffset;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Hashtable;
import javax.activation.DataHandler;
import javax.activation.URLDataSource;
import javax.wsdl.BindingOutput;
import javax.wsdl.Operation;
import javax.xml.namespace.QName;
import javax.xml.soap.MimeHeaders;
import javax.xml.stream.util.EventReaderDelegate;
import net.sf.xbus.base.bytearraylist.ByteArrayList;
import net.sf.xbus.base.xbussystem.XBUSSystem;
import net.sf.xbus.protocol.records.RecordTypeMessage;
import org.apache.axis.AxisEngine;
import org.apache.axis.Message;
import org.apache.axis.MessageContext;
import org.apache.axis.SOAPPart;
import org.apache.axis.configuration.NullProvider;
import org.apache.axis.constants.Style;
import org.apache.axis.constants.Use;
import org.apache.axis.deployment.wsdd.WSDDConstants;
import org.apache.axis.deployment.wsdd.WSDDResponseFlow;
import org.apache.axis.deployment.wsdd.WSDDService;
import org.apache.axis.description.JavaServiceDesc;
import org.apache.axis.description.OperationDesc;
import org.apache.axis.message.SOAPEnvelope;
import org.apache.axis.schema.SchemaVersion2001;
import org.apache.axis.soap.SOAP12Constants;
import org.apache.axis.wsdl.symbolTable.BindingEntry;
import org.apache.commons.httpclient.ConnectMethod;
import org.apache.commons.httpclient.HostConfiguration;
import org.apache.commons.httpclient.NameValuePair;
import org.apache.html.dom.HTMLDocumentImpl;
import org.apache.wml.dom.WMLDocumentImpl;
import org.apache.wml.dom.WMLEmElementImpl;
import org.apache.xerces.dom.DeferredDocumentImpl;
import org.apache.xerces.dom.DocumentImpl;
import org.apache.xerces.dom.DocumentTypeImpl;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.System;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.evosuite.runtime.mock.java.net.MockURL;
import org.evosuite.runtime.mock.java.time.MockInstant;
import org.evosuite.runtime.testdata.EvoSuiteFile;
import org.evosuite.runtime.testdata.FileSystemHandling;
import org.junit.runner.RunWith;
import org.w3c.dom.Element;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class RecordTypeMessage_ESTest extends RecordTypeMessage_ESTest_scaffolding {

  /**
  //Test case number: 0
  /*Coverage entropy=1.8408398156653452
  */
  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      XBUSSystem xBUSSystem0 = null;
      RecordTypeMessage recordTypeMessage0 = new RecordTypeMessage((XBUSSystem) null);
      recordTypeMessage0.getResponseObject();
      MessageContext.getCurrentContext();
      recordTypeMessage0.getResponseObject();
      SOAPEnvelope sOAPEnvelope0 = new SOAPEnvelope();
      recordTypeMessage0.getResponseText();
      MimeHeaders mimeHeaders0 = new MimeHeaders();
      String[] stringArray0 = new String[1];
      stringArray0[0] = "isMsg";
      String[] stringArray1 = new String[7];
      stringArray1[0] = "transport.url";
      stringArray1[1] = "acceptMissingParams";
      stringArray1[2] = "securityProvider";
      stringArray1[3] = null;
      stringArray1[4] = "acceptMissingParams";
      stringArray1[5] = null;
      stringArray1[6] = null;
      mimeHeaders0.getNonMatchingHeaders(stringArray1);
      mimeHeaders0.getNonMatchingHeaders(stringArray0);
      Message message0 = new Message((Object) null, false, mimeHeaders0);
      DeferredDocumentImpl deferredDocumentImpl0 = new DeferredDocumentImpl(false);
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
  //Test case number: 1
  /*Coverage entropy=1.7741057932992024
  */
  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      RecordTypeMessage recordTypeMessage0 = new RecordTypeMessage((XBUSSystem) null);
      ByteArrayList byteArrayList0 = new ByteArrayList();
      byte[] byteArray0 = new byte[8];
      byteArray0[0] = (byte) (-22);
      byte byte0 = (byte)68;
      byteArray0[1] = (byte)68;
      byteArray0[2] = (byte) (-9);
      byteArray0[3] = (byte) (-49);
      byteArray0[5] = (byte)26;
      byteArray0[6] = (byte)8;
      byteArray0[7] = (byte) (-70);
      byteArrayList0.add(byteArray0);
      byteArrayList0.toByteArray();
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
  //Test case number: 2
  /*Coverage entropy=2.004371500423656
  */
  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      JavaServiceDesc javaServiceDesc0 = new JavaServiceDesc();
      javaServiceDesc0.getOperations();
      JavaServiceDesc javaServiceDesc1 = new JavaServiceDesc();
      Integer integer0 = new Integer(30);
      Message message0 = new Message(integer0);
      Style style0 = javaServiceDesc1.getStyle();
      Style.getStyle("rpc");
      Style.getStyle("  ", style0);
      Style style1 = Style.getStyle("rpc");
      Style.getStyle(0);
      javaServiceDesc0.setStyle(style0);
      Style style2 = Style.getStyle("wrapped");
      Style style3 = Style.getStyle("wrapped");
      javaServiceDesc0.setStyle(style3);
      Style style4 = Style.DEFAULT;
      Style.getStyle(0);
      Style.getStyle("wrapped", style2);
      SOAPPart sOAPPart0 = new SOAPPart(message0, javaServiceDesc0, false);
      Style.getStyle("wrapped", style2);
      Style.getStyle("response");
      Style.getStyle("wrapped");
      Style.getStyle(0);
      Style.getStyle(0);
      javaServiceDesc0.getOperationByName("message");
      Style.getStyle("wrapped");
      Style.getStyle("wrapped", style1);
      Style style5 = Style.DEFAULT;
      Style.getStyle("rpc");
      RecordTypeMessage recordTypeMessage0 = new RecordTypeMessage("rpc", (XBUSSystem) null, "rpc");
      recordTypeMessage0.setResponseDocument(sOAPPart0, (XBUSSystem) null);
      recordTypeMessage0.getResponseObject();
      recordTypeMessage0.getResponseText();
      EventReaderDelegate eventReaderDelegate0 = new EventReaderDelegate();
  }

  /**
  //Test case number: 3
  /*Coverage entropy=1.4682921994113465
  */
  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      byte[] byteArray0 = new byte[3];
      byteArray0[1] = (byte) (-106);
      FileSystemHandling.appendLineToFile((EvoSuiteFile) null, "ols");
      FileSystemHandling.appendStringToFile((EvoSuiteFile) null, "ols");
      FileSystemHandling.shouldThrowIOException((EvoSuiteFile) null);
      FileSystemHandling.appendLineToFile((EvoSuiteFile) null, "ols");
      FileSystemHandling.appendLineToFile((EvoSuiteFile) null, "ols");
      FileSystemHandling.appendLineToFile((EvoSuiteFile) null, "<]`{\u0006wo");
      FileSystemHandling.appendStringToFile((EvoSuiteFile) null, "ols");
      FileSystemHandling.appendStringToFile((EvoSuiteFile) null, "ols");
      FileSystemHandling.appendStringToFile((EvoSuiteFile) null, "6&P2^^!Db!mY8:Zt]qX");
      FileSystemHandling.appendStringToFile((EvoSuiteFile) null, "<]`{\u0006wo");
      FileSystemHandling.appendLineToFile((EvoSuiteFile) null, "qyb6");
      FileSystemHandling.appendLineToFile((EvoSuiteFile) null, "ols");
      FileSystemHandling.appendStringToFile((EvoSuiteFile) null, "6&P2^^!Db!mY8:Zt]qX");
      FileSystemHandling.appendLineToFile((EvoSuiteFile) null, "qyb6");
      FileSystemHandling.shouldThrowIOException((EvoSuiteFile) null);
      FileSystemHandling.appendStringToFile((EvoSuiteFile) null, "qyb6");
      ByteArrayList byteArrayList0 = new ByteArrayList();
      byteArrayList0.toByteArray();
      byteArrayList0.toByteArray();
      RecordTypeMessage recordTypeMessage0 = new RecordTypeMessage((XBUSSystem) null);
      FileSystemHandling.appendStringToFile((EvoSuiteFile) null, "6&P2^^!Db!mY8:Zt]qX");
      ByteArrayList byteArrayList1 = new ByteArrayList();
      recordTypeMessage0.setRequestObject(byteArrayList0, (XBUSSystem) null);
      assertEquals("RecordTypeMessage", recordTypeMessage0.getShortname());
  }

  /**
  //Test case number: 4
  /*Coverage entropy=1.7741057932992026
  */
  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      byte[] byteArray0 = new byte[3];
      byteArray0[1] = (byte) (-106);
      FileSystemHandling.appendLineToFile((EvoSuiteFile) null, "ols");
      FileSystemHandling.appendStringToFile((EvoSuiteFile) null, "ols");
      FileSystemHandling.appendLineToFile((EvoSuiteFile) null, "ols");
      FileSystemHandling.appendLineToFile((EvoSuiteFile) null, "ols");
      FileSystemHandling.appendLineToFile((EvoSuiteFile) null, "ols");
      FileSystemHandling.appendLineToFile((EvoSuiteFile) null, "<]`{\u0006wo");
      FileSystemHandling.appendStringToFile((EvoSuiteFile) null, "ols");
      FileSystemHandling.appendStringToFile((EvoSuiteFile) null, "ols");
      FileSystemHandling.appendStringToFile((EvoSuiteFile) null, "6&P2^^!Db!mY8:Zt]qX");
      FileSystemHandling.appendStringToFile((EvoSuiteFile) null, "<]`{\u0006wo");
      FileSystemHandling.appendLineToFile((EvoSuiteFile) null, "qybt");
      FileSystemHandling.appendLineToFile((EvoSuiteFile) null, "ols");
      FileSystemHandling.appendStringToFile((EvoSuiteFile) null, "6&P2^^!Db!mY8:Zt]qX");
      FileSystemHandling.appendLineToFile((EvoSuiteFile) null, "qybt");
      FileSystemHandling.appendLineToFile((EvoSuiteFile) null, "<]`{\u0006wo");
      FileSystemHandling.appendStringToFile((EvoSuiteFile) null, "qybt");
      ByteArrayList byteArrayList0 = new ByteArrayList();
      byteArrayList0.toByteArray();
      byteArrayList0.add(byteArray0);
      byteArrayList0.toByteArray();
      RecordTypeMessage recordTypeMessage0 = new RecordTypeMessage((XBUSSystem) null);
      FileSystemHandling.appendStringToFile((EvoSuiteFile) null, "6&P2^^!Db!mY8:Zt]qX");
      ByteArrayList byteArrayList1 = new ByteArrayList();
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
  //Test case number: 5
  /*Coverage entropy=1.0931471805599453
  */
  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      XBUSSystem xBUSSystem0 = null;
      RecordTypeMessage recordTypeMessage0 = new RecordTypeMessage((XBUSSystem) null);
      ByteArrayList byteArrayList0 = new ByteArrayList();
      byte[] byteArray0 = new byte[8];
      byteArray0[0] = (byte) (-22);
      byteArray0[1] = (byte)68;
      byteArray0[2] = (byte) (-9);
      byteArray0[3] = (byte) (-49);
      byteArray0[4] = (byte)91;
      byteArrayList0.toByteArray();
      byteArray0[5] = (byte)26;
      byteArray0[6] = (byte)8;
      byteArray0[7] = (byte) (-70);
      byteArrayList0.add(byteArray0);
      byteArrayList0.toByteArray();
      Instant instant0 = MockInstant.ofEpochMilli(0L);
      ZoneOffset zoneOffset0 = ZoneOffset.ofTotalSeconds((-3746));
      OffsetDateTime offsetDateTime0 = MockInstant.atOffset(instant0, zoneOffset0);
      try { 
        recordTypeMessage0.setResponseObject(offsetDateTime0, (XBUSSystem) null);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // I_02_003_0 java.time.OffsetDateTime cannot be cast to net.sf.xbus.base.bytearraylist.ByteArrayList
         //
         verifyException("net.sf.xbus.protocol.records.RecordTypeMessage", e);
      }
  }

  /**
  //Test case number: 6
  /*Coverage entropy=1.1217186091313738
  */
  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      RecordTypeMessage recordTypeMessage0 = new RecordTypeMessage((XBUSSystem) null);
      RecordTypeMessage recordTypeMessage1 = new RecordTypeMessage((XBUSSystem) null);
      Integer integer0 = new Integer(1409);
      Integer integer1 = new Integer(1409);
      BindingImpl bindingImpl0 = new BindingImpl();
      Style style0 = Style.RPC;
      HashMap<Object, Object> hashMap0 = new HashMap<Object, Object>();
      BindingImpl bindingImpl1 = new BindingImpl();
      bindingImpl1.toString();
      Style.getStyle(",|dR&i)}R1p.5zg~");
      bindingImpl1.getBindingOperation("message", "wrapped", "message");
      Hashtable<Object, Integer> hashtable0 = new Hashtable<Object, Integer>();
      BindingEntry bindingEntry0 = new BindingEntry(bindingImpl1, 1409, style0, true, hashMap0, hashtable0, hashtable0);
      BindingOperationImpl bindingOperationImpl0 = new BindingOperationImpl();
      bindingOperationImpl0.getOperation();
      bindingEntry0.getOutputBodyType((Operation) null);
      BindingOperationImpl bindingOperationImpl1 = new BindingOperationImpl();
      Integer integer2 = new Integer(1);
      bindingOperationImpl1.getOperation();
      WSDDService wSDDService0 = new WSDDService();
      HTMLDocumentImpl hTMLDocumentImpl0 = new HTMLDocumentImpl();
      try { 
        recordTypeMessage0.setRequestObject(style0, (XBUSSystem) null);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // I_02_003_0 org.apache.axis.constants.Style cannot be cast to net.sf.xbus.base.bytearraylist.ByteArrayList
         //
         verifyException("net.sf.xbus.protocol.records.RecordTypeMessage", e);
      }
  }

  /**
  //Test case number: 7
  /*Coverage entropy=1.4682921994113465
  */
  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      byte[] byteArray0 = new byte[5];
      byteArray0[0] = (byte)19;
      byteArray0[1] = (byte)91;
      byteArray0[2] = (byte) (-37);
      byteArray0[4] = (byte)87;
      byteArray0[4] = (byte)24;
      FileSystemHandling.appendDataToFile((EvoSuiteFile) null, byteArray0);
      FileSystemHandling.appendLineToFile((EvoSuiteFile) null, "ol");
      FileSystemHandling.appendLineToFile((EvoSuiteFile) null, "ol");
      FileSystemHandling.appendLineToFile((EvoSuiteFile) null, "ol");
      FileSystemHandling.appendLineToFile((EvoSuiteFile) null, "ol");
      FileSystemHandling.appendLineToFile((EvoSuiteFile) null, "ol");
      FileSystemHandling.appendStringToFile((EvoSuiteFile) null, "ol");
      FileSystemHandling.appendStringToFile((EvoSuiteFile) null, "ol");
      FileSystemHandling.appendLineToFile((EvoSuiteFile) null, "<]`{6wo");
      FileSystemHandling.appendLineToFile((EvoSuiteFile) null, "ol");
      FileSystemHandling.appendLineToFile((EvoSuiteFile) null, "qybt");
      FileSystemHandling.appendLineToFile((EvoSuiteFile) null, "qybt");
      FileSystemHandling.appendLineToFile((EvoSuiteFile) null, "ol");
      FileSystemHandling.appendLineToFile((EvoSuiteFile) null, "qybt");
      FileSystemHandling.appendLineToFile((EvoSuiteFile) null, "qybt");
      FileSystemHandling.appendLineToFile((EvoSuiteFile) null, "<]`{6wo");
      FileSystemHandling.appendStringToFile((EvoSuiteFile) null, "qybt");
      ByteArrayList byteArrayList0 = new ByteArrayList();
      byteArrayList0.toByteArray();
      byteArrayList0.toByteArray();
      RecordTypeMessage recordTypeMessage0 = new RecordTypeMessage((XBUSSystem) null);
      FileSystemHandling.appendStringToFile((EvoSuiteFile) null, "6&P2^^!Db!mY8:Zt]qX");
      recordTypeMessage0.setRequestObject(byteArrayList0, (XBUSSystem) null);
      assertEquals("RecordTypeMessage", recordTypeMessage0.getShortname());
  }

  /**
  //Test case number: 8
  /*Coverage entropy=1.830738805564335
  */
  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      JavaServiceDesc javaServiceDesc0 = new JavaServiceDesc();
      JavaServiceDesc javaServiceDesc1 = new JavaServiceDesc();
      JavaServiceDesc javaServiceDesc2 = new JavaServiceDesc();
      JavaServiceDesc javaServiceDesc3 = new JavaServiceDesc();
      JavaServiceDesc javaServiceDesc4 = new JavaServiceDesc();
      JavaServiceDesc javaServiceDesc5 = new JavaServiceDesc();
      JavaServiceDesc javaServiceDesc6 = new JavaServiceDesc();
      JavaServiceDesc javaServiceDesc7 = new JavaServiceDesc();
      JavaServiceDesc javaServiceDesc8 = new JavaServiceDesc();
      JavaServiceDesc javaServiceDesc9 = new JavaServiceDesc();
      JavaServiceDesc javaServiceDesc10 = new JavaServiceDesc();
      JavaServiceDesc javaServiceDesc11 = new JavaServiceDesc();
      JavaServiceDesc javaServiceDesc12 = new JavaServiceDesc();
      JavaServiceDesc javaServiceDesc13 = new JavaServiceDesc();
      JavaServiceDesc javaServiceDesc14 = new JavaServiceDesc();
      JavaServiceDesc javaServiceDesc15 = new JavaServiceDesc();
      javaServiceDesc2.getOperations();
      QName qName0 = SchemaVersion2001.QNAME_NIL;
      javaServiceDesc13.getOperationsByQName(qName0);
      JavaServiceDesc javaServiceDesc16 = new JavaServiceDesc();
      JavaServiceDesc javaServiceDesc17 = new JavaServiceDesc();
      javaServiceDesc11.getOperations();
      JavaServiceDesc javaServiceDesc18 = new JavaServiceDesc();
      javaServiceDesc15.getStyle();
      JavaServiceDesc javaServiceDesc19 = new JavaServiceDesc();
      JavaServiceDesc javaServiceDesc20 = new JavaServiceDesc();
      JavaServiceDesc javaServiceDesc21 = new JavaServiceDesc();
      javaServiceDesc15.getStyle();
      QName qName1 = WSDDConstants.QNAME_JAXRPC_ROLE;
      javaServiceDesc8.getStyle();
      javaServiceDesc18.loadServiceDescByIntrospection();
      ByteArrayList byteArrayList0 = new ByteArrayList();
      JavaServiceDesc javaServiceDesc22 = new JavaServiceDesc();
      RecordTypeMessage recordTypeMessage0 = new RecordTypeMessage((XBUSSystem) null);
      Boolean boolean0 = Boolean.FALSE;
      recordTypeMessage0.setResponseText((String) null, (XBUSSystem) null);
      assertEquals("RC_OK", recordTypeMessage0.getReturncode());
      assertEquals(0, recordTypeMessage0.getErrorcode());
      assertEquals("RecordTypeMessage", recordTypeMessage0.getShortname());
  }

  /**
  //Test case number: 9
  /*Coverage entropy=1.0931471805599453
  */
  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      MessageContext.getCurrentContext();
      BindingOperationImpl bindingOperationImpl0 = new BindingOperationImpl();
      bindingOperationImpl0.getBindingOutput();
      bindingOperationImpl0.setBindingOutput((BindingOutput) null);
      HashMap<Integer, Integer> hashMap0 = new HashMap<Integer, Integer>();
      bindingOperationImpl0.getOperation();
      BindingImpl bindingImpl0 = new BindingImpl();
      BindingEntry bindingEntry0 = new BindingEntry(bindingImpl0);
      WSDDService wSDDService0 = new WSDDService();
      ByteArrayList byteArrayList0 = new ByteArrayList();
      QName qName0 = WSDDConstants.QNAME_JAXRPC_HANDLERINFO;
      wSDDService0.setQName(qName0);
      ByteArrayList byteArrayList1 = new ByteArrayList();
      RecordTypeMessage recordTypeMessage0 = new RecordTypeMessage((XBUSSystem) null);
      recordTypeMessage0.getRequestTextAsXML((XBUSSystem) null);
      assertEquals("RecordTypeMessage", recordTypeMessage0.getShortname());
  }

  /**
  //Test case number: 10
  /*Coverage entropy=1.0931471805599453
  */
  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      PipedInputStream pipedInputStream0 = new PipedInputStream();
      ByteArrayList byteArrayList0 = new ByteArrayList();
      RecordTypeMessage recordTypeMessage0 = new RecordTypeMessage((XBUSSystem) null);
      recordTypeMessage0.getRequestObject((XBUSSystem) null);
      SequenceInputStream sequenceInputStream0 = new SequenceInputStream(pipedInputStream0, pipedInputStream0);
      ConnectMethod connectMethod0 = new ConnectMethod();
      connectMethod0.getRequestHeader(":Oeh=Bpai");
      NameValuePair[] nameValuePairArray0 = new NameValuePair[9];
      nameValuePairArray0[8] = (NameValuePair) null;
      ConnectMethod connectMethod1 = new ConnectMethod(connectMethod0);
      pipedInputStream0.close();
      PipedInputStream pipedInputStream1 = new PipedInputStream();
      byte byte0 = (byte) (-44);
      try { 
        pipedInputStream1.reset();
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // mark/reset not supported
         //
         verifyException("java.io.InputStream", e);
      }
  }

  /**
  //Test case number: 11
  /*Coverage entropy=1.830738805564335
  */
  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      JavaServiceDesc javaServiceDesc0 = new JavaServiceDesc();
      JavaServiceDesc javaServiceDesc1 = new JavaServiceDesc();
      JavaServiceDesc javaServiceDesc2 = new JavaServiceDesc();
      JavaServiceDesc javaServiceDesc3 = new JavaServiceDesc();
      JavaServiceDesc javaServiceDesc4 = new JavaServiceDesc();
      JavaServiceDesc javaServiceDesc5 = new JavaServiceDesc();
      JavaServiceDesc javaServiceDesc6 = new JavaServiceDesc();
      JavaServiceDesc javaServiceDesc7 = new JavaServiceDesc();
      JavaServiceDesc javaServiceDesc8 = new JavaServiceDesc();
      JavaServiceDesc javaServiceDesc9 = new JavaServiceDesc();
      JavaServiceDesc javaServiceDesc10 = new JavaServiceDesc();
      JavaServiceDesc javaServiceDesc11 = new JavaServiceDesc();
      JavaServiceDesc javaServiceDesc12 = new JavaServiceDesc();
      JavaServiceDesc javaServiceDesc13 = new JavaServiceDesc();
      JavaServiceDesc javaServiceDesc14 = new JavaServiceDesc();
      javaServiceDesc14.getStyle();
      JavaServiceDesc javaServiceDesc15 = new JavaServiceDesc();
      JavaServiceDesc javaServiceDesc16 = new JavaServiceDesc();
      JavaServiceDesc javaServiceDesc17 = new JavaServiceDesc();
      javaServiceDesc7.getStyle();
      Style.getDefault();
      javaServiceDesc9.loadServiceDescByIntrospection();
      ByteArrayList byteArrayList0 = new ByteArrayList();
      javaServiceDesc17.getTypeMapping();
      RecordTypeMessage recordTypeMessage0 = new RecordTypeMessage("vX", (XBUSSystem) null, "rpc");
      Boolean boolean0 = new Boolean("vX");
      recordTypeMessage0.setResponseText((String) null, (XBUSSystem) null);
      assertEquals(0, recordTypeMessage0.getErrorcode());
      assertEquals("RecordTypeMessage", recordTypeMessage0.getShortname());
      assertEquals("RC_OK", recordTypeMessage0.getReturncode());
  }

  /**
  //Test case number: 12
  /*Coverage entropy=1.0931471805599453
  */
  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      JavaServiceDesc javaServiceDesc0 = new JavaServiceDesc();
      JavaServiceDesc javaServiceDesc1 = new JavaServiceDesc();
      JavaServiceDesc javaServiceDesc2 = new JavaServiceDesc();
      JavaServiceDesc javaServiceDesc3 = new JavaServiceDesc();
      JavaServiceDesc javaServiceDesc4 = new JavaServiceDesc();
      JavaServiceDesc javaServiceDesc5 = new JavaServiceDesc();
      JavaServiceDesc javaServiceDesc6 = new JavaServiceDesc();
      JavaServiceDesc javaServiceDesc7 = new JavaServiceDesc();
      JavaServiceDesc javaServiceDesc8 = new JavaServiceDesc();
      JavaServiceDesc javaServiceDesc9 = new JavaServiceDesc();
      JavaServiceDesc javaServiceDesc10 = new JavaServiceDesc();
      JavaServiceDesc javaServiceDesc11 = new JavaServiceDesc();
      JavaServiceDesc javaServiceDesc12 = new JavaServiceDesc();
      javaServiceDesc10.getOperationsByName("Hs/b|MB}Ooxsn");
      JavaServiceDesc javaServiceDesc13 = new JavaServiceDesc();
      javaServiceDesc13.setProperty("Client.error", javaServiceDesc1);
      OperationDesc operationDesc0 = new OperationDesc();
      ArrayList arrayList0 = new ArrayList<String>();
      JavaServiceDesc javaServiceDesc14 = new JavaServiceDesc();
      javaServiceDesc14.getOperationByName("Client.error");
      javaServiceDesc10.getStyle();
      JavaServiceDesc javaServiceDesc15 = new JavaServiceDesc();
      JavaServiceDesc javaServiceDesc16 = new JavaServiceDesc();
      Use.getDefault();
      Use.getUse("0");
      JavaServiceDesc javaServiceDesc17 = new JavaServiceDesc();
      javaServiceDesc14.getStyle();
      ByteArrayList byteArrayList0 = new ByteArrayList();
      RecordTypeMessage recordTypeMessage0 = new RecordTypeMessage((XBUSSystem) null);
      recordTypeMessage0.synchronizeResponseFields((XBUSSystem) null);
      byteArrayList0.toString();
      byte[] byteArray0 = new byte[2];
      byteArray0[0] = (byte)37;
      byteArray0[1] = (byte)93;
  }

  /**
  //Test case number: 13
  /*Coverage entropy=1.0931471805599453
  */
  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      RecordTypeMessage recordTypeMessage0 = new RecordTypeMessage((XBUSSystem) null);
      recordTypeMessage0.synchronizeRequestFields((XBUSSystem) null);
      JavaServiceDesc javaServiceDesc0 = new JavaServiceDesc();
      ArrayList arrayList0 = new ArrayList<FilterInputStream>();
      JavaServiceDesc javaServiceDesc1 = new JavaServiceDesc();
      javaServiceDesc1.getOperationsByName("");
      JavaServiceDesc javaServiceDesc2 = new JavaServiceDesc();
      javaServiceDesc0.getStyle();
      HashMap<Integer, Integer> hashMap0 = new HashMap<Integer, Integer>();
      int int0 = 0;
      Integer integer0 = new Integer(0);
      NullProvider nullProvider0 = new NullProvider();
      nullProvider0.getService((QName) null);
      WSDDService wSDDService0 = new WSDDService();
      DocumentImpl documentImpl0 = new DocumentImpl();
      DocumentTypeImpl documentTypeImpl0 = new DocumentTypeImpl(documentImpl0, "chain", "soapAction", "");
      WMLDocumentImpl wMLDocumentImpl0 = new WMLDocumentImpl(documentTypeImpl0);
      WMLEmElementImpl wMLEmElementImpl0 = new WMLEmElementImpl(wMLDocumentImpl0, "http://xml.apache.org/axis/wsdd/providers/bsf");
      wMLEmElementImpl0.getAttributeNS("", "deserializer");
      WSDDResponseFlow wSDDResponseFlow0 = null;
      try {
        wSDDResponseFlow0 = new WSDDResponseFlow((Element) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.axis.deployment.wsdd.WSDDElement", e);
      }
  }

  /**
  //Test case number: 14
  /*Coverage entropy=1.7741057932992024
  */
  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Object object0 = new Object();
      JavaServiceDesc javaServiceDesc0 = new JavaServiceDesc();
      JavaServiceDesc javaServiceDesc1 = new JavaServiceDesc();
      JavaServiceDesc javaServiceDesc2 = new JavaServiceDesc();
      JavaServiceDesc javaServiceDesc3 = new JavaServiceDesc();
      JavaServiceDesc javaServiceDesc4 = new JavaServiceDesc();
      JavaServiceDesc javaServiceDesc5 = new JavaServiceDesc();
      JavaServiceDesc javaServiceDesc6 = new JavaServiceDesc();
      JavaServiceDesc javaServiceDesc7 = new JavaServiceDesc();
      JavaServiceDesc javaServiceDesc8 = new JavaServiceDesc();
      JavaServiceDesc javaServiceDesc9 = new JavaServiceDesc();
      JavaServiceDesc javaServiceDesc10 = new JavaServiceDesc();
      JavaServiceDesc javaServiceDesc11 = new JavaServiceDesc();
      JavaServiceDesc javaServiceDesc12 = new JavaServiceDesc();
      JavaServiceDesc javaServiceDesc13 = new JavaServiceDesc();
      JavaServiceDesc javaServiceDesc14 = new JavaServiceDesc();
      javaServiceDesc14.getOperations();
      JavaServiceDesc javaServiceDesc15 = new JavaServiceDesc();
      javaServiceDesc11.getStyle();
      JavaServiceDesc javaServiceDesc16 = new JavaServiceDesc();
      JavaServiceDesc javaServiceDesc17 = new JavaServiceDesc();
      JavaServiceDesc javaServiceDesc18 = new JavaServiceDesc();
      javaServiceDesc15.getStyle();
      Style.getStyle("rpc");
      javaServiceDesc15.loadServiceDescByIntrospection();
      ByteArrayList byteArrayList0 = new ByteArrayList();
      RecordTypeMessage recordTypeMessage0 = new RecordTypeMessage("", (XBUSSystem) null, "rpc");
      byte[] byteArray0 = new byte[2];
      byteArray0[0] = (byte)37;
      Boolean boolean0 = new Boolean("wrapped");
      // Undeclared exception!
      try { 
        recordTypeMessage0.setResponseText("", (XBUSSystem) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("net.sf.xbus.protocol.xml.XMLMessageAbstract", e);
      }
  }

  /**
  //Test case number: 15
  /*Coverage entropy=1.5271837172395382
  */
  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      RecordTypeMessage recordTypeMessage0 = new RecordTypeMessage((XBUSSystem) null);
      Object object0 = new Object();
      Message message0 = new Message(object0, false);
      AxisEngine.getCurrentMessageContext();
      SOAPPart sOAPPart0 = new SOAPPart(message0, object0, false);
      message0.saveChanges();
      sOAPPart0.getSOAPDocument();
      recordTypeMessage0.setResponseDocument(sOAPPart0, (XBUSSystem) null);
      SOAP12Constants sOAP12Constants0 = new SOAP12Constants();
      assertEquals("itemType", sOAP12Constants0.getAttrItemType());
  }

  /**
  //Test case number: 16
  /*Coverage entropy=1.830738805564335
  */
  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      RecordTypeMessage recordTypeMessage0 = new RecordTypeMessage((XBUSSystem) null);
      ByteArrayList byteArrayList0 = new ByteArrayList();
      byteArrayList0.toByteArray();
      recordTypeMessage0.setResponseObject((Object) null, (XBUSSystem) null);
      URL uRL0 = MockURL.getHttpExample();
      URLDataSource uRLDataSource0 = new URLDataSource(uRL0);
      URL uRL1 = uRLDataSource0.getURL();
      DataHandler dataHandler0 = new DataHandler(uRL1);
      char[] charArray0 = new char[8];
      // Undeclared exception!
      try { 
        CharBuffer.wrap(charArray0, 62, (-2311));
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.nio.CharBuffer", e);
      }
  }

  /**
  //Test case number: 17
  /*Coverage entropy=1.4682921994113465
  */
  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      XBUSSystem xBUSSystem0 = null;
      RecordTypeMessage recordTypeMessage0 = new RecordTypeMessage((XBUSSystem) null);
      ByteArrayList byteArrayList0 = new ByteArrayList();
      byteArrayList0.toByteArray();
      recordTypeMessage0.setResponseObject(byteArrayList0, (XBUSSystem) null);
      URL uRL0 = MockURL.getHttpExample();
      URLDataSource uRLDataSource0 = new URLDataSource(uRL0);
      URL uRL1 = uRLDataSource0.getURL();
      DataHandler dataHandler0 = new DataHandler(uRL1);
      char[] charArray0 = new char[2];
      int int0 = (-2311);
      int int1 = 62;
      // Undeclared exception!
      try { 
        CharBuffer.wrap(charArray0, 62, (-2311));
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.nio.CharBuffer", e);
      }
  }

  /**
  //Test case number: 18
  /*Coverage entropy=1.5271837172395382
  */
  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Object object0 = new Object();
      Message message0 = new Message(object0, false);
      MessageContext.getCurrentContext();
      message0.saveChanges();
      message0.saveChanges();
      message0.saveChanges();
      byte[] byteArray0 = new byte[2];
      byteArray0[0] = (byte) (-43);
      HostConfiguration hostConfiguration0 = mock(HostConfiguration.class, new ViolatedAssumptionAnswer());
      ConnectMethod connectMethod0 = new ConnectMethod(hostConfiguration0);
      NameValuePair[] nameValuePairArray0 = new NameValuePair[5];
      connectMethod0.getRequestHeader("securityProvider");
      nameValuePairArray0[0] = (NameValuePair) null;
      connectMethod0.getRequestHeader("axis.transport.version");
      nameValuePairArray0[1] = (NameValuePair) null;
      connectMethod0.getResponseHeader("attachments.directory");
      RecordTypeMessage recordTypeMessage0 = new RecordTypeMessage((XBUSSystem) null);
      recordTypeMessage0.setRequestObject((Object) null, (XBUSSystem) null);
      System.setCurrentTimeMillis(511L);
      nameValuePairArray0[2] = (NameValuePair) null;
      ConnectMethod connectMethod1 = new ConnectMethod();
      connectMethod1.getRequestHeader("axis.wsdlgen.serv.loc.url");
      nameValuePairArray0[3] = (NameValuePair) null;
      connectMethod1.getRequestHeader("attachments.directory");
      nameValuePairArray0[4] = (NameValuePair) null;
      // Undeclared exception!
      try { 
        connectMethod0.setQueryString(nameValuePairArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.httpclient.util.EncodingUtil", e);
      }
  }

  /**
  //Test case number: 19
  /*Coverage entropy=1.0931471805599453
  */
  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      RecordTypeMessage recordTypeMessage0 = new RecordTypeMessage((XBUSSystem) null);
      recordTypeMessage0.getRequestText((XBUSSystem) null);
      PipedInputStream pipedInputStream0 = new PipedInputStream();
      SequenceInputStream sequenceInputStream0 = new SequenceInputStream(pipedInputStream0, pipedInputStream0);
      DataInputStream dataInputStream0 = new DataInputStream(pipedInputStream0);
      SequenceInputStream sequenceInputStream1 = new SequenceInputStream(pipedInputStream0, sequenceInputStream0);
      PipedInputStream pipedInputStream1 = new PipedInputStream();
      byte[] byteArray0 = new byte[7];
      byte byte0 = (byte)66;
      try { 
        pipedInputStream1.skip(2089L);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Pipe not connected
         //
         verifyException("java.io.PipedInputStream", e);
      }
  }

  /**
  //Test case number: 20
  /*Coverage entropy=1.830738805564335
  */
  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      byte[] byteArray0 = new byte[2];
      byteArray0[1] = (byte) (-106);
      FileSystemHandling.appendLineToFile((EvoSuiteFile) null, "ols");
      FileSystemHandling.appendStringToFile((EvoSuiteFile) null, "ols");
      FileSystemHandling.appendLineToFile((EvoSuiteFile) null, "ols");
      FileSystemHandling.appendLineToFile((EvoSuiteFile) null, "ols");
      FileSystemHandling.appendLineToFile((EvoSuiteFile) null, "ols");
      FileSystemHandling.appendLineToFile((EvoSuiteFile) null, "<]`{\u0006wo");
      FileSystemHandling.appendStringToFile((EvoSuiteFile) null, "ols");
      FileSystemHandling.appendStringToFile((EvoSuiteFile) null, "ols");
      FileSystemHandling.appendStringToFile((EvoSuiteFile) null, "6&P2^^!Db!mY8:Zt]qX");
      FileSystemHandling.appendStringToFile((EvoSuiteFile) null, "<]`{\u0006wo");
      FileSystemHandling.appendLineToFile((EvoSuiteFile) null, "qybt");
      FileSystemHandling.appendLineToFile((EvoSuiteFile) null, "ols");
      FileSystemHandling.appendStringToFile((EvoSuiteFile) null, "6&P2^^!Db!mY8:Zt]qX");
      FileSystemHandling.shouldThrowIOException((EvoSuiteFile) null);
      FileSystemHandling.appendLineToFile((EvoSuiteFile) null, "<]`{\u0006wo");
      FileSystemHandling.appendStringToFile((EvoSuiteFile) null, "qybt");
      ByteArrayList byteArrayList0 = new ByteArrayList();
      byteArrayList0.toByteArray();
      byteArrayList0.add(byteArray0);
      byteArrayList0.toByteArray();
      RecordTypeMessage recordTypeMessage0 = new RecordTypeMessage((XBUSSystem) null);
      RecordTypeMessage recordTypeMessage1 = new RecordTypeMessage("ols", (XBUSSystem) null, "ols");
      recordTypeMessage1.setRequestText((String) null, (XBUSSystem) null);
      System.setCurrentTimeMillis((byte) (-106));
  }

  /**
  //Test case number: 21
  /*Coverage entropy=1.7741057932992026
  */
  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      JavaServiceDesc javaServiceDesc0 = new JavaServiceDesc();
      Integer integer0 = new Integer(30);
      Message message0 = new Message(integer0);
      Style style0 = Style.RPC;
      Style style1 = Style.WRAPPED;
      Style.getStyle("  ", style0);
      Style.getStyle("rpc");
      Style style2 = Style.getStyle("wrapped");
      Style.getStyle("wrapped");
      Style style3 = Style.MESSAGE;
      Style style4 = Style.RPC;
      Style.getStyle("rpc");
      Style.getStyle("");
      Style.getStyle("rpc", style3);
      Style.getStyle("message", style2);
      Style style5 = Style.getStyle("rpc");
      Style.getDefault();
      Style.getStyle("rpc");
      Style.getStyle("wrapped");
      Style.getStyle("");
      Style.getDefault();
      RecordTypeMessage recordTypeMessage0 = new RecordTypeMessage("rpc", (XBUSSystem) null, "rCJ5");
      Style.getStyle("");
      Style.getStyle("wrapped");
      Style style6 = Style.MESSAGE;
      Style.getStyle("rpc");
      Style.getStyle("message");
      Style style7 = Style.DEFAULT;
      Style.getStyle("message", style5);
      Style.getStyle("document");
      Boolean boolean0 = Boolean.TRUE;
      // Undeclared exception!
      try { 
        recordTypeMessage0.setRequestText("wrapped", (XBUSSystem) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("net.sf.xbus.protocol.xml.XMLMessageAbstract", e);
      }
  }
}
