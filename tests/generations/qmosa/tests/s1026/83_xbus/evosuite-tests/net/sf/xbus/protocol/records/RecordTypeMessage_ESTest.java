/*
 * This file was automatically generated by EvoSuite
 * Tue Nov 19 16:18:59 GMT 2019
 */

package net.sf.xbus.protocol.records;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.InputStream;
import java.time.Instant;
import java.time.temporal.TemporalField;
import java.time.temporal.TemporalUnit;
import java.util.Hashtable;
import java.util.Locale;
import net.sf.xbus.base.bytearraylist.ByteArrayList;
import net.sf.xbus.base.xbussystem.XBUSSystem;
import net.sf.xbus.protocol.records.RecordTypeMessage;
import org.apache.axis.message.Detail;
import org.apache.html.dom.HTMLDocumentImpl;
import org.apache.xerces.dom.DeferredDocumentImpl;
import org.apache.xerces.dom.DocumentImpl;
import org.apache.xerces.impl.xs.SchemaGrammar;
import org.apache.xerces.impl.xs.XSAttributeDecl;
import org.apache.xerces.impl.xs.XSAttributeGroupDecl;
import org.apache.xerces.impl.xs.XSElementDecl;
import org.apache.xerces.impl.xs.XSGroupDecl;
import org.apache.xerces.impl.xs.XSNotationDecl;
import org.apache.xerces.parsers.DTDConfiguration;
import org.apache.xerces.parsers.IntegratedParserConfiguration;
import org.apache.xerces.util.SymbolTable;
import org.apache.xerces.xni.grammars.Grammar;
import org.apache.xerces.xni.grammars.XSGrammar;
import org.apache.xerces.xni.parser.XMLInputSource;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.System;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.evosuite.runtime.mock.java.time.MockInstant;
import org.evosuite.runtime.testdata.EvoSuiteFile;
import org.evosuite.runtime.testdata.FileSystemHandling;
import org.junit.runner.RunWith;
import org.w3c.dom.UserDataHandler;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class RecordTypeMessage_ESTest extends RecordTypeMessage_ESTest_scaffolding {

  /**
  //Test case number: 0
  /*Coverage entropy=1.0931471805599453
  */
  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
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
  //Test case number: 1
  /*Coverage entropy=1.7741057932992026
  */
  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      FileSystemHandling.shouldThrowIOException((EvoSuiteFile) null);
      XBUSSystem xBUSSystem0 = null;
      RecordTypeMessage recordTypeMessage0 = new RecordTypeMessage((XBUSSystem) null);
      byte[] byteArray0 = new byte[6];
      FileSystemHandling.appendLineToFile((EvoSuiteFile) null, "org.apache.commons.io.filefilter.TrueFileFilter");
      FileSystemHandling.shouldThrowIOException((EvoSuiteFile) null);
      FileSystemHandling.appendLineToFile((EvoSuiteFile) null, "org.apache.commons.io.filefilter.TrueFileFilter");
      FileSystemHandling.appendStringToFile((EvoSuiteFile) null, "org.apache.commons.io.filefilter.TrueFileFilter");
      FileSystemHandling.shouldThrowIOException((EvoSuiteFile) null);
      FileSystemHandling.appendLineToFile((EvoSuiteFile) null, "org.apache.commons.io.filefilter.TrueFileFilter");
      FileSystemHandling.appendLineToFile((EvoSuiteFile) null, "yYIGS}TN{T");
      byteArray0[2] = (byte)28;
      byteArray0[5] = (byte)28;
      FileSystemHandling.createFolder((EvoSuiteFile) null);
      ByteArrayList byteArrayList0 = new ByteArrayList();
      FileSystemHandling.appendLineToFile((EvoSuiteFile) null, "org.apache.commons.io.filefilter.TrueFileFilter");
      byteArrayList0.toByteArray();
      byteArrayList0.add(byteArray0);
      byteArrayList0.toString();
      FileSystemHandling.appendStringToFile((EvoSuiteFile) null, "org.apache.commons.io.filefilter.TrueFileFilter");
      byte[] byteArray1 = new byte[7];
      byteArray1[0] = (byte)28;
      byteArrayList0.toByteArray();
      byteArray0[2] = (byte) (-2);
      byteArray1[1] = (byte)28;
      byteArray1[5] = (byte)28;
      FileSystemHandling.appendDataToFile((EvoSuiteFile) null, byteArray1);
      byteArrayList0.toByteArray();
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
  //Test case number: 2
  /*Coverage entropy=1.0931471805599453
  */
  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      RecordTypeMessage recordTypeMessage0 = new RecordTypeMessage((XBUSSystem) null);
      XSNotationDecl xSNotationDecl0 = new XSNotationDecl();
      xSNotationDecl0.getName();
      XSGroupDecl xSGroupDecl0 = new XSGroupDecl();
      xSGroupDecl0.fTargetNamespace = "";
      xSGroupDecl0.getName();
      xSGroupDecl0.fTargetNamespace = xSGroupDecl0.fTargetNamespace;
      XSAttributeGroupDecl xSAttributeGroupDecl0 = new XSAttributeGroupDecl();
      ByteArrayList byteArrayList0 = new ByteArrayList();
      xSGroupDecl0.fAnnotations = null;
      XSElementDecl xSElementDecl0 = new XSElementDecl();
      xSElementDecl0.getNamespace();
      Boolean boolean0 = new Boolean((String) null);
      xSAttributeGroupDecl0.getAttributeUses();
      XSElementDecl xSElementDecl1 = new XSElementDecl();
      xSElementDecl0.fSubGroup = xSElementDecl1;
      xSElementDecl0.fSubGroup.fFinal = (short) (byte)88;
      xSAttributeGroupDecl0.removeProhibitedAttrs();
      xSElementDecl0.fSubGroup.fFinal = (short) (byte)88;
      Boolean.valueOf((String) null);
      xSAttributeGroupDecl0.getNamespaceItem();
      xSAttributeGroupDecl0.removeProhibitedAttrs();
      XSAttributeGroupDecl xSAttributeGroupDecl1 = new XSAttributeGroupDecl();
      xSAttributeGroupDecl1.fAnnotations = null;
      xSAttributeGroupDecl1.fAttributeWC = null;
      xSAttributeGroupDecl0.getAttributeWildcard();
      xSAttributeGroupDecl1.getAttributeUse((String) null, (String) null);
      xSAttributeGroupDecl1.fAttributeWC = null;
      xSAttributeGroupDecl1.getAttributeUse((String) null, (String) null);
      xSAttributeGroupDecl0.fAnnotations = null;
      xSAttributeGroupDecl0.getAttributeUses();
      xSAttributeGroupDecl0.getNamespaceItem();
      xSAttributeGroupDecl1.getNamespace();
      xSGroupDecl0.fTargetNamespace = null;
      xSElementDecl0.fSubGroup.getItemValueTypes();
      Boolean boolean1 = new Boolean((String) null);
      try { 
        recordTypeMessage0.setRequestObject(xSAttributeGroupDecl0, (XBUSSystem) null);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // I_02_003_0 org.apache.xerces.impl.xs.XSAttributeGroupDecl cannot be cast to net.sf.xbus.base.bytearraylist.ByteArrayList
         //
         verifyException("net.sf.xbus.protocol.records.RecordTypeMessage", e);
      }
  }

  /**
  //Test case number: 3
  /*Coverage entropy=1.847832822658352
  */
  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      XBUSSystem xBUSSystem0 = null;
      RecordTypeMessage recordTypeMessage0 = new RecordTypeMessage((XBUSSystem) null);
      recordTypeMessage0.getRequestText((XBUSSystem) null);
      recordTypeMessage0.synchronizeRequestFields((XBUSSystem) null);
      FileSystemHandling.shouldAllThrowIOExceptions();
      recordTypeMessage0.synchronizeRequestFields((XBUSSystem) null);
      recordTypeMessage0.setRequestText((String) null, (XBUSSystem) null);
      String string0 = "9\"HhI])";
      Hashtable<Integer, Object> hashtable0 = new Hashtable<Integer, Object>();
      Integer integer0 = new Integer(874);
      Instant instant0 = MockInstant.ofEpochMilli(874);
      hashtable0.put(integer0, instant0);
      // Undeclared exception!
      try { 
        hashtable0.put((Integer) null, (Object) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.Hashtable", e);
      }
  }

  /**
  //Test case number: 4
  /*Coverage entropy=1.4682921994113465
  */
  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      FileSystemHandling.appendStringToFile((EvoSuiteFile) null, ">Ks}[6Y#1gp,0HVI");
      RecordTypeMessage recordTypeMessage0 = new RecordTypeMessage((XBUSSystem) null);
      byte[] byteArray0 = new byte[7];
      FileSystemHandling.appendLineToFile((EvoSuiteFile) null, "rg.apaPe.commonshi,.filefilter.rueFileFi1ter");
      FileSystemHandling.appendLineToFile((EvoSuiteFile) null, ">Ks}[6Y#1gp,0HVI");
      FileSystemHandling.appendLineToFile((EvoSuiteFile) null, ">Ks}[6Y#1gp,0HVI");
      FileSystemHandling.appendLineToFile((EvoSuiteFile) null, "rg.apaPe.commonshi,.filefilter.rueFileFi1ter");
      FileSystemHandling.appendStringToFile((EvoSuiteFile) null, "rg.apaPe.commonshi,.filefilter.rueFileFi1ter");
      FileSystemHandling.appendLineToFile((EvoSuiteFile) null, "rg.apaPe.commonshi,.filefilter.rueFileFi1ter");
      FileSystemHandling.appendLineToFile((EvoSuiteFile) null, "+p*IP");
      byteArray0[5] = (byte)0;
      FileSystemHandling.appendStringToFile((EvoSuiteFile) null, (String) null);
      FileSystemHandling.appendLineToFile((EvoSuiteFile) null, (String) null);
      FileSystemHandling.appendLineToFile((EvoSuiteFile) null, (String) null);
      FileSystemHandling.appendStringToFile((EvoSuiteFile) null, "'hZ`;Ew@ukJ&=LK");
      FileSystemHandling.appendLineToFile((EvoSuiteFile) null, "+p*IP");
      ByteArrayList byteArrayList0 = new ByteArrayList();
      byteArrayList0.addAll((ByteArrayList) null);
      FileSystemHandling.appendLineToFile((EvoSuiteFile) null, "rg.apaPe.commonshi,.filefilter.rueFileFi1ter");
      byteArrayList0.toByteArray();
      byteArrayList0.toString();
      FileSystemHandling.appendStringToFile((EvoSuiteFile) null, "rg.apaPe.commons~i,.filefilter.rueFileFi1ter");
      byte[] byteArray1 = new byte[3];
      FileSystemHandling.appendDataToFile((EvoSuiteFile) null, byteArray1);
      recordTypeMessage0.setRequestObject(byteArrayList0, (XBUSSystem) null);
      assertEquals("RecordTypeMessage", recordTypeMessage0.getShortname());
  }

  /**
  //Test case number: 5
  /*Coverage entropy=1.830738805564335
  */
  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      RecordTypeMessage recordTypeMessage0 = new RecordTypeMessage((XBUSSystem) null);
      recordTypeMessage0.setResponseText((String) null, (XBUSSystem) null);
      FileSystemHandling.shouldAllThrowIOExceptions();
      SymbolTable symbolTable0 = new SymbolTable();
      int int0 = 693;
      String string0 = "qGAZjJ5,cc,2-<v";
      Grammar[] grammarArray0 = new Grammar[5];
      SchemaGrammar.BuiltinSchemaGrammar schemaGrammar_BuiltinSchemaGrammar0 = new SchemaGrammar.BuiltinSchemaGrammar(693);
      grammarArray0[0] = (Grammar) schemaGrammar_BuiltinSchemaGrammar0;
      SchemaGrammar.BuiltinSchemaGrammar schemaGrammar_BuiltinSchemaGrammar1 = SchemaGrammar.SG_SchemaNS;
      grammarArray0[1] = (Grammar) schemaGrammar_BuiltinSchemaGrammar1;
      String string1 = "Content-Transfer-Encoding";
      // Undeclared exception!
      try { 
        schemaGrammar_BuiltinSchemaGrammar0.getGlobalNotationDecl("Content-Transfer-Encoding");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  /**
  //Test case number: 6
  /*Coverage entropy=1.0931471805599453
  */
  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      RecordTypeMessage recordTypeMessage0 = new RecordTypeMessage((XBUSSystem) null);
      recordTypeMessage0.getRequestObject((XBUSSystem) null);
      DTDConfiguration dTDConfiguration0 = new DTDConfiguration();
      XMLInputSource xMLInputSource0 = new XMLInputSource("", "CN", "-[0h3+4-c`Nt", (InputStream) null, "-[0h3+4-c`Nt");
      dTDConfiguration0.setInputSource(xMLInputSource0);
      IntegratedParserConfiguration integratedParserConfiguration0 = new IntegratedParserConfiguration();
      Locale locale0 = dTDConfiguration0.getLocale();
      assertEquals("en", locale0.getLanguage());
  }

  /**
  //Test case number: 7
  /*Coverage entropy=1.7741057932992024
  */
  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      RecordTypeMessage recordTypeMessage0 = new RecordTypeMessage((XBUSSystem) null);
      // Undeclared exception!
      try { 
        recordTypeMessage0.setResponseText("org.apache.commons.httpclient.DefaultHttpMethodRetryHandler", (XBUSSystem) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("net.sf.xbus.protocol.xml.XMLMessageAbstract", e);
      }
  }

  /**
  //Test case number: 8
  /*Coverage entropy=1.7741057932992024
  */
  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      RecordTypeMessage recordTypeMessage0 = new RecordTypeMessage((XBUSSystem) null);
      // Undeclared exception!
      try { 
        recordTypeMessage0.setResponseText("Query string contains nvalid charactr: ", (XBUSSystem) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("net.sf.xbus.protocol.xml.XMLMessageAbstract", e);
      }
  }

  /**
  //Test case number: 9
  /*Coverage entropy=1.0931471805599453
  */
  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      RecordTypeMessage recordTypeMessage0 = new RecordTypeMessage((XBUSSystem) null);
      recordTypeMessage0.synchronizeResponseFields((XBUSSystem) null);
      byte[] byteArray0 = new byte[7];
      byteArray0[0] = (byte)6;
      byteArray0[1] = (byte)10;
      byteArray0[2] = (byte)6;
      char char0 = '_';
      SymbolTable symbolTable0 = new SymbolTable();
      SymbolTable symbolTable1 = new SymbolTable(0, (byte)6);
      SymbolTable symbolTable2 = null;
      try {
        symbolTable2 = new SymbolTable((-3496), (-1711.4977F));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal Capacity: -3496
         //
         verifyException("org.apache.xerces.util.SymbolTable", e);
      }
  }

  /**
  //Test case number: 10
  /*Coverage entropy=1.7741057932992024
  */
  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      RecordTypeMessage recordTypeMessage0 = new RecordTypeMessage((XBUSSystem) null);
      XSAttributeDecl xSAttributeDecl0 = new XSAttributeDecl();
      xSAttributeDecl0.reset();
      XSNotationDecl xSNotationDecl0 = new XSNotationDecl();
      xSAttributeDecl0.getAnnotation();
      xSNotationDecl0.getName();
      XSGroupDecl xSGroupDecl0 = new XSGroupDecl();
      xSGroupDecl0.getName();
      xSGroupDecl0.fTargetNamespace = xSGroupDecl0.fTargetNamespace;
      XSAttributeGroupDecl xSAttributeGroupDecl0 = new XSAttributeGroupDecl();
      ByteArrayList byteArrayList0 = new ByteArrayList();
      xSGroupDecl0.fAnnotations = null;
      XSElementDecl xSElementDecl0 = new XSElementDecl();
      xSElementDecl0.getNamespace();
      Boolean boolean0 = new Boolean((String) null);
      xSElementDecl0.getAnnotations();
      XSElementDecl xSElementDecl1 = new XSElementDecl();
      xSElementDecl0.fSubGroup = xSElementDecl1;
      byte[] byteArray0 = new byte[5];
      xSElementDecl1.fBlock = (short) (byte)88;
      xSElementDecl0.fScope = (short) (byte) (-25);
      byteArrayList0.add(byteArray0);
      Boolean.valueOf((String) null);
      xSAttributeGroupDecl0.getNamespaceItem();
      xSAttributeGroupDecl0.removeProhibitedAttrs();
      XSAttributeGroupDecl xSAttributeGroupDecl1 = new XSAttributeGroupDecl();
      xSAttributeGroupDecl1.fAnnotations = null;
      xSAttributeGroupDecl1.fAttributeWC = null;
      xSAttributeGroupDecl0.getAttributeWildcard();
      xSAttributeGroupDecl1.fAttributeWC = null;
      xSGroupDecl0.fAnnotations = null;
      xSAttributeGroupDecl0.getAttributeUses();
      xSAttributeGroupDecl0.getNamespaceItem();
      xSAttributeGroupDecl1.getNamespace();
      xSGroupDecl0.fTargetNamespace = null;
      xSAttributeDecl0.getItemValueTypes();
      Boolean.valueOf((String) null);
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
  //Test case number: 11
  /*Coverage entropy=1.0931471805599453
  */
  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      FileSystemHandling.shouldAllThrowIOExceptions();
      DocumentImpl documentImpl0 = new DocumentImpl();
      documentImpl0.setAsync(false);
      documentImpl0.getXmlEncoding();
      HTMLDocumentImpl hTMLDocumentImpl0 = new HTMLDocumentImpl();
      hTMLDocumentImpl0.getIdentifiers();
      hTMLDocumentImpl0.getOwnerDocument();
      Integer integer0 = new Integer(0);
      ByteArrayList byteArrayList0 = new ByteArrayList();
      Object object0 = new Object();
      Object object1 = new Object();
      ByteArrayList byteArrayList1 = new ByteArrayList();
      Object object2 = new Object();
      ByteArrayList byteArrayList2 = new ByteArrayList();
      RecordTypeMessage recordTypeMessage0 = new RecordTypeMessage("SBQLIAO", (XBUSSystem) null, "");
      recordTypeMessage0.getRequestTextAsXML((XBUSSystem) null);
      assertEquals("RecordTypeMessage", recordTypeMessage0.getShortname());
  }

  /**
  //Test case number: 12
  /*Coverage entropy=1.4841652152843623
  */
  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      RecordTypeMessage recordTypeMessage0 = new RecordTypeMessage((XBUSSystem) null);
      XSNotationDecl xSNotationDecl0 = new XSNotationDecl();
      xSNotationDecl0.getName();
      XSGroupDecl xSGroupDecl0 = new XSGroupDecl();
      xSGroupDecl0.fTargetNamespace = null;
      xSGroupDecl0.getName();
      xSGroupDecl0.fTargetNamespace = xSGroupDecl0.fTargetNamespace;
      XSAttributeGroupDecl xSAttributeGroupDecl0 = new XSAttributeGroupDecl();
      ByteArrayList byteArrayList0 = new ByteArrayList();
      xSGroupDecl0.fAnnotations = null;
      XSElementDecl xSElementDecl0 = new XSElementDecl();
      xSElementDecl0.getNamespace();
      Boolean boolean0 = new Boolean((String) null);
      xSAttributeGroupDecl0.getAttributeUses();
      XSElementDecl xSElementDecl1 = new XSElementDecl();
      xSElementDecl0.fSubGroup = xSElementDecl1;
      xSElementDecl0.fSubGroup.fFinal = (short) (byte)88;
      xSAttributeGroupDecl0.removeProhibitedAttrs();
      xSElementDecl0.fSubGroup.fFinal = (short) (byte)88;
      Boolean.valueOf((String) null);
      xSAttributeGroupDecl0.getNamespaceItem();
      xSAttributeGroupDecl0.removeProhibitedAttrs();
      XSAttributeGroupDecl xSAttributeGroupDecl1 = new XSAttributeGroupDecl();
      xSAttributeGroupDecl1.fAnnotations = null;
      xSAttributeGroupDecl1.fAttributeWC = null;
      xSAttributeGroupDecl0.getAttributeWildcard();
      xSAttributeGroupDecl1.getAttributeUse((String) null, (String) null);
      xSAttributeGroupDecl1.fAttributeWC = null;
      xSAttributeGroupDecl1.getAttributeUse((String) null, (String) null);
      xSAttributeGroupDecl0.fAnnotations = null;
      xSAttributeGroupDecl0.getAttributeUses();
      xSAttributeGroupDecl0.getNamespaceItem();
      xSAttributeGroupDecl1.getNamespace();
      xSGroupDecl0.fTargetNamespace = null;
      xSElementDecl0.fSubGroup.getItemValueTypes();
      Boolean boolean1 = new Boolean((String) null);
      recordTypeMessage0.setResponseObject(byteArrayList0, (XBUSSystem) null);
      try { 
        recordTypeMessage0.setResponseObject(xSElementDecl1, (XBUSSystem) null);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // I_02_003_0 org.apache.xerces.impl.xs.XSElementDecl cannot be cast to net.sf.xbus.base.bytearraylist.ByteArrayList
         //
         verifyException("net.sf.xbus.protocol.records.RecordTypeMessage", e);
      }
  }

  /**
  //Test case number: 13
  /*Coverage entropy=1.0931471805599453
  */
  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Instant instant0 = MockInstant.now();
      TemporalUnit temporalUnit0 = mock(TemporalUnit.class, new ViolatedAssumptionAnswer());
      TemporalUnit temporalUnit1 = mock(TemporalUnit.class, new ViolatedAssumptionAnswer());
      Boolean.valueOf("RC_OK");
      RecordTypeMessage recordTypeMessage0 = new RecordTypeMessage("RC_OK", (XBUSSystem) null, "RC_OK");
      try { 
        recordTypeMessage0.setResponseObject(instant0, (XBUSSystem) null);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // I_02_003_0 java.time.Instant cannot be cast to net.sf.xbus.base.bytearraylist.ByteArrayList
         //
         verifyException("net.sf.xbus.protocol.records.RecordTypeMessage", e);
      }
  }

  /**
  //Test case number: 14
  /*Coverage entropy=1.5271837172395382
  */
  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      XBUSSystem xBUSSystem0 = null;
      RecordTypeMessage recordTypeMessage0 = new RecordTypeMessage((XBUSSystem) null);
      System.setCurrentTimeMillis(1169L);
      recordTypeMessage0.setRequestObject((Object) null, (XBUSSystem) null);
      long long0 = 0L;
      // Undeclared exception!
      try { 
        MockInstant.with((Instant) null, (TemporalField) null, 0L);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.evosuite.runtime.mock.java.time.MockInstant", e);
      }
  }

  /**
  //Test case number: 15
  /*Coverage entropy=1.4682921994113465
  */
  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      FileSystemHandling.appendStringToFile((EvoSuiteFile) null, ">Ks}[6Y#1gp,0HVI");
      RecordTypeMessage recordTypeMessage0 = new RecordTypeMessage((XBUSSystem) null);
      byte[] byteArray0 = new byte[7];
      FileSystemHandling.appendLineToFile((EvoSuiteFile) null, "rg.apaPe.commonshi,.filefilter.rueFileFi1ter");
      FileSystemHandling.appendLineToFile((EvoSuiteFile) null, ">Ks}[6Y#1gp,0HVI");
      FileSystemHandling.appendLineToFile((EvoSuiteFile) null, ">Ks}[6Y#1gp,0HVI");
      FileSystemHandling.appendLineToFile((EvoSuiteFile) null, "rg.apaPe.commonshi,.filefilter.rueFileFi1ter");
      FileSystemHandling.appendStringToFile((EvoSuiteFile) null, "rg.apaPe.commonshi,.filefilter.rueFileFi1ter");
      FileSystemHandling.appendLineToFile((EvoSuiteFile) null, "rg.apaPe.commonshi,.filefilter.rueFileFi1ter");
      FileSystemHandling.appendLineToFile((EvoSuiteFile) null, "+p*IP");
      byteArray0[5] = (byte)0;
      FileSystemHandling.appendLineToFile((EvoSuiteFile) null, ">Ks}[6Y#1gp,0HVI");
      FileSystemHandling.appendLineToFile((EvoSuiteFile) null, (String) null);
      FileSystemHandling.appendLineToFile((EvoSuiteFile) null, (String) null);
      FileSystemHandling.appendStringToFile((EvoSuiteFile) null, "'hZ`;Ew@ukJ&=LK");
      boolean boolean0 = new Boolean(">Ks}[6Y#1gp,0HVI");
      ByteArrayList byteArrayList0 = new ByteArrayList();
      byteArrayList0.addAll((ByteArrayList) null);
      FileSystemHandling.appendLineToFile((EvoSuiteFile) null, "rg.apaPe.commonshi,.filefilter.rueFileFi1ter");
      byteArrayList0.toByteArray();
      byteArrayList0.toString();
      FileSystemHandling.appendStringToFile((EvoSuiteFile) null, "rg.apaPe.commons~i,.filefilter.rueFileFi1ter");
      byte[] byteArray1 = new byte[3];
      FileSystemHandling.appendDataToFile((EvoSuiteFile) null, byteArray1);
      recordTypeMessage0.setRequestObject(byteArrayList0, (XBUSSystem) null);
      assertEquals("RecordTypeMessage", recordTypeMessage0.getShortname());
  }

  /**
  //Test case number: 16
  /*Coverage entropy=1.7741057932992026
  */
  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      EvoSuiteFile evoSuiteFile0 = null;
      String string0 = ">Ks}[6Y#1gp,0HVI";
      FileSystemHandling.appendStringToFile((EvoSuiteFile) null, ">Ks}[6Y#1gp,0HVI");
      RecordTypeMessage recordTypeMessage0 = new RecordTypeMessage((XBUSSystem) null);
      // Undeclared exception!
      try { 
        recordTypeMessage0.setRequestText(">Ks}[6Y#1gp,0HVI", (XBUSSystem) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("net.sf.xbus.protocol.xml.XMLMessageAbstract", e);
      }
  }

  /**
  //Test case number: 17
  /*Coverage entropy=2.004371500423656
  */
  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      RecordTypeMessage recordTypeMessage0 = new RecordTypeMessage((XBUSSystem) null);
      DocumentImpl documentImpl0 = new DocumentImpl(true);
      recordTypeMessage0.setResponseDocument(documentImpl0, (XBUSSystem) null);
      recordTypeMessage0.getResponseText();
      recordTypeMessage0.getResponseObject();
      Grammar[] grammarArray0 = new Grammar[5];
      SchemaGrammar.BuiltinSchemaGrammar schemaGrammar_BuiltinSchemaGrammar0 = new SchemaGrammar.BuiltinSchemaGrammar(693);
      grammarArray0[0] = (Grammar) schemaGrammar_BuiltinSchemaGrammar0;
      SchemaGrammar.BuiltinSchemaGrammar schemaGrammar_BuiltinSchemaGrammar1 = new SchemaGrammar.BuiltinSchemaGrammar(1859);
      grammarArray0[1] = (Grammar) schemaGrammar_BuiltinSchemaGrammar1;
      SchemaGrammar.BuiltinSchemaGrammar schemaGrammar_BuiltinSchemaGrammar2 = SchemaGrammar.SG_XSI;
      schemaGrammar_BuiltinSchemaGrammar2.getGrammarDescription();
      SchemaGrammar.BuiltinSchemaGrammar schemaGrammar_BuiltinSchemaGrammar3 = SchemaGrammar.SG_SchemaNS;
      schemaGrammar_BuiltinSchemaGrammar3.getGlobalNotationDecl("qGAZjJ5,cc,2-<v");
      // Undeclared exception!
      try { 
        schemaGrammar_BuiltinSchemaGrammar2.getGlobalNotationDecl((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  /**
  //Test case number: 18
  /*Coverage entropy=2.004371500423656
  */
  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      RecordTypeMessage recordTypeMessage0 = new RecordTypeMessage((XBUSSystem) null);
      DocumentImpl documentImpl0 = new DocumentImpl(true);
      recordTypeMessage0.setResponseDocument(documentImpl0, (XBUSSystem) null);
      recordTypeMessage0.getResponseText();
      recordTypeMessage0.getResponseObject();
      Grammar[] grammarArray0 = new Grammar[5];
      SchemaGrammar.BuiltinSchemaGrammar schemaGrammar_BuiltinSchemaGrammar0 = new SchemaGrammar.BuiltinSchemaGrammar(693);
      grammarArray0[0] = (Grammar) schemaGrammar_BuiltinSchemaGrammar0;
      SchemaGrammar.BuiltinSchemaGrammar schemaGrammar_BuiltinSchemaGrammar1 = new SchemaGrammar.BuiltinSchemaGrammar(1859);
      grammarArray0[1] = (Grammar) schemaGrammar_BuiltinSchemaGrammar1;
      SchemaGrammar.BuiltinSchemaGrammar schemaGrammar_BuiltinSchemaGrammar2 = SchemaGrammar.SG_XSI;
      XSGrammar[] xSGrammarArray0 = new XSGrammar[7];
      xSGrammarArray0[0] = (XSGrammar) schemaGrammar_BuiltinSchemaGrammar1;
      xSGrammarArray0[1] = (XSGrammar) schemaGrammar_BuiltinSchemaGrammar1;
      xSGrammarArray0[2] = (XSGrammar) schemaGrammar_BuiltinSchemaGrammar1;
      xSGrammarArray0[3] = (XSGrammar) schemaGrammar_BuiltinSchemaGrammar1;
      xSGrammarArray0[4] = (XSGrammar) schemaGrammar_BuiltinSchemaGrammar1;
      xSGrammarArray0[5] = (XSGrammar) schemaGrammar_BuiltinSchemaGrammar1;
      xSGrammarArray0[6] = (XSGrammar) schemaGrammar_BuiltinSchemaGrammar0;
      // Undeclared exception!
      try { 
        schemaGrammar_BuiltinSchemaGrammar2.toXSModel(xSGrammarArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.xerces.impl.xs.SchemaGrammar", e);
      }
  }

  /**
  //Test case number: 19
  /*Coverage entropy=1.830738805564335
  */
  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      RecordTypeMessage recordTypeMessage0 = new RecordTypeMessage((XBUSSystem) null);
      recordTypeMessage0.setResponseObject((Object) null, (XBUSSystem) null);
      int int0 = (-34);
      SymbolTable symbolTable0 = null;
      try {
        symbolTable0 = new SymbolTable((-34));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal Capacity: -34
         //
         verifyException("org.apache.xerces.util.SymbolTable", e);
      }
  }

  /**
  //Test case number: 20
  /*Coverage entropy=1.0931471805599453
  */
  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      RecordTypeMessage recordTypeMessage0 = new RecordTypeMessage((XBUSSystem) null);
      recordTypeMessage0.getResponseText();
      Grammar[] grammarArray0 = new Grammar[5];
      SchemaGrammar.BuiltinSchemaGrammar schemaGrammar_BuiltinSchemaGrammar0 = new SchemaGrammar.BuiltinSchemaGrammar(693);
      grammarArray0[0] = (Grammar) schemaGrammar_BuiltinSchemaGrammar0;
      SchemaGrammar.BuiltinSchemaGrammar schemaGrammar_BuiltinSchemaGrammar1 = new SchemaGrammar.BuiltinSchemaGrammar(1859);
      grammarArray0[1] = (Grammar) schemaGrammar_BuiltinSchemaGrammar1;
      SchemaGrammar.BuiltinSchemaGrammar schemaGrammar_BuiltinSchemaGrammar2 = SchemaGrammar.SG_XSI;
      schemaGrammar_BuiltinSchemaGrammar2.getGrammarDescription();
      SchemaGrammar.BuiltinSchemaGrammar schemaGrammar_BuiltinSchemaGrammar3 = SchemaGrammar.SG_SchemaNS;
      schemaGrammar_BuiltinSchemaGrammar3.getGlobalNotationDecl("$[BGQHlyD11U3kUS{");
      schemaGrammar_BuiltinSchemaGrammar0.addGlobalNotationDecl((XSNotationDecl) null);
      // Undeclared exception!
      try { 
        schemaGrammar_BuiltinSchemaGrammar2.getGlobalNotationDecl((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  /**
  //Test case number: 21
  /*Coverage entropy=1.0931471805599453
  */
  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      DocumentImpl documentImpl0 = new DocumentImpl(false);
      Detail detail0 = new Detail();
      detail0.getOwnerDocument();
      documentImpl0.createDocumentType("48!s0 $&=W*nJ", "Host must be set to create a host URL", "Host must be set to create a host URL");
      documentImpl0.getElementsByTagNameNS("48!s0 $&=W*nJ", "Host must be set to create a host URL");
      UserDataHandler userDataHandler0 = mock(UserDataHandler.class, new ViolatedAssumptionAnswer());
      HTMLDocumentImpl hTMLDocumentImpl0 = new HTMLDocumentImpl();
      byte[] byteArray0 = new byte[1];
      byteArray0[0] = (byte) (-65);
      RecordTypeMessage recordTypeMessage0 = new RecordTypeMessage("48!s0 $&=W*nJ", (XBUSSystem) null, "Host must be set to create a host URL");
      recordTypeMessage0.getResponseObject();
      assertEquals("RecordTypeMessage", recordTypeMessage0.getShortname());
  }
}
