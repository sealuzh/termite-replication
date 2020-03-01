/*
 * This file was automatically generated by EvoSuite
 * Sat Nov 16 04:12:32 GMT 2019
 */

package net.sf.xbus.protocol.records;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.PipedInputStream;
import java.io.UnsupportedEncodingException;
import java.time.Instant;
import java.util.Hashtable;
import javax.xml.stream.util.EventReaderDelegate;
import net.sf.xbus.base.bytearraylist.ByteArrayList;
import net.sf.xbus.base.xbussystem.XBUSSystem;
import net.sf.xbus.protocol.records.RecordTypeMessage;
import org.apache.axis.MessageContext;
import org.apache.axis.client.AxisClient;
import org.apache.axis.configuration.BasicClientConfig;
import org.apache.axis.configuration.SimpleProvider;
import org.apache.axis.deployment.wsdd.WSDDDeployment;
import org.apache.axis.deployment.wsdd.WSDDService;
import org.apache.axis.server.AxisServer;
import org.apache.html.dom.HTMLDocumentImpl;
import org.apache.wml.dom.WMLDocumentImpl;
import org.apache.wml.dom.WMLImgElementImpl;
import org.apache.xerces.dom.CoreDocumentImpl;
import org.apache.xerces.dom.DeferredDocumentImpl;
import org.apache.xerces.dom.DocumentImpl;
import org.apache.xerces.dom.DocumentTypeImpl;
import org.apache.xerces.impl.dtd.XMLDTDDescription;
import org.apache.xerces.impl.xs.SchemaGrammar;
import org.apache.xerces.parsers.CachingParserPool;
import org.apache.xerces.parsers.DOMParser;
import org.apache.xerces.parsers.IntegratedParserConfiguration;
import org.apache.xerces.parsers.SoftReferenceSymbolTableConfiguration;
import org.apache.xerces.parsers.XIncludeAwareParserConfiguration;
import org.apache.xerces.parsers.XML11NonValidatingConfiguration;
import org.apache.xerces.parsers.XMLGrammarCachingConfiguration;
import org.apache.xerces.util.DOMEntityResolverWrapper;
import org.apache.xerces.util.SymbolTable;
import org.apache.xerces.xni.grammars.Grammar;
import org.apache.xerces.xni.grammars.XMLGrammarDescription;
import org.apache.xerces.xni.grammars.XMLGrammarPool;
import org.apache.xerces.xni.parser.XMLComponentManager;
import org.apache.xerces.xni.parser.XMLInputSource;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.io.MockPrintWriter;
import org.evosuite.runtime.mock.java.time.MockInstant;
import org.evosuite.runtime.mock.java.util.MockDate;
import org.evosuite.runtime.testdata.EvoSuiteFile;
import org.evosuite.runtime.testdata.EvoSuiteURL;
import org.evosuite.runtime.testdata.FileSystemHandling;
import org.evosuite.runtime.testdata.NetworkHandling;
import org.junit.runner.RunWith;
import org.w3c.dom.Element;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class RecordTypeMessage_ESTest extends RecordTypeMessage_ESTest_scaffolding {

  /**
  //Test case number: 0
  /*Coverage entropy=1.0931471805599453
  */
  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      XBUSSystem xBUSSystem0 = null;
      RecordTypeMessage recordTypeMessage0 = new RecordTypeMessage((XBUSSystem) null);
      DeferredDocumentImpl deferredDocumentImpl0 = new DeferredDocumentImpl(false);
      DocumentTypeImpl documentTypeImpl0 = new DocumentTypeImpl(deferredDocumentImpl0, "");
      WMLDocumentImpl wMLDocumentImpl0 = new WMLDocumentImpl(documentTypeImpl0);
      wMLDocumentImpl0.getDocumentElement();
      deferredDocumentImpl0.putIdentifier("", (Element) null);
      deferredDocumentImpl0.print();
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
      RecordTypeMessage recordTypeMessage0 = new RecordTypeMessage((String) null, (XBUSSystem) null, (String) null);
      ByteArrayList byteArrayList0 = new ByteArrayList();
      byte[] byteArray0 = new byte[1];
      byteArrayList0.iterator();
      byteArrayList0.iterator();
      byteArrayList0.toByteArray();
      byteArrayList0.add(byteArray0);
      byteArrayList0.add(byteArray0);
      EventReaderDelegate eventReaderDelegate0 = new EventReaderDelegate();
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
  /*Coverage entropy=2.004371500423656
  */
  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      RecordTypeMessage recordTypeMessage0 = new RecordTypeMessage((XBUSSystem) null);
      HTMLDocumentImpl hTMLDocumentImpl0 = new HTMLDocumentImpl();
      recordTypeMessage0.setResponseDocument(hTMLDocumentImpl0, (XBUSSystem) null);
      SymbolTable symbolTable0 = new SymbolTable();
      CachingParserPool.ShadowedGrammarPool cachingParserPool_ShadowedGrammarPool0 = new CachingParserPool.ShadowedGrammarPool((XMLGrammarPool) null);
      CachingParserPool.SynchronizedGrammarPool cachingParserPool_SynchronizedGrammarPool0 = new CachingParserPool.SynchronizedGrammarPool(cachingParserPool_ShadowedGrammarPool0);
      CachingParserPool.ShadowedGrammarPool cachingParserPool_ShadowedGrammarPool1 = new CachingParserPool.ShadowedGrammarPool(cachingParserPool_ShadowedGrammarPool0);
      SymbolTable symbolTable1 = new SymbolTable();
      SymbolTable symbolTable2 = new SymbolTable();
      SoftReferenceSymbolTableConfiguration softReferenceSymbolTableConfiguration0 = new SoftReferenceSymbolTableConfiguration(symbolTable2, (XMLGrammarPool) null);
      symbolTable1.hash("C&qu*2Q?5UC");
      CachingParserPool.SynchronizedGrammarPool cachingParserPool_SynchronizedGrammarPool1 = new CachingParserPool.SynchronizedGrammarPool((XMLGrammarPool) null);
      cachingParserPool_ShadowedGrammarPool0.lockPool();
      XIncludeAwareParserConfiguration xIncludeAwareParserConfiguration0 = new XIncludeAwareParserConfiguration((SymbolTable) null, cachingParserPool_SynchronizedGrammarPool1, softReferenceSymbolTableConfiguration0);
      XIncludeAwareParserConfiguration xIncludeAwareParserConfiguration1 = new XIncludeAwareParserConfiguration((SymbolTable) null, cachingParserPool_SynchronizedGrammarPool0);
      SymbolTable symbolTable3 = new SymbolTable(55);
      DOMParser dOMParser0 = new DOMParser(symbolTable3, cachingParserPool_ShadowedGrammarPool1);
      recordTypeMessage0.getResponseObject();
      XML11NonValidatingConfiguration xML11NonValidatingConfiguration0 = new XML11NonValidatingConfiguration(symbolTable1, cachingParserPool_SynchronizedGrammarPool1, softReferenceSymbolTableConfiguration0);
      IntegratedParserConfiguration integratedParserConfiguration0 = new IntegratedParserConfiguration((SymbolTable) null, (XMLGrammarPool) null);
      CachingParserPool.ShadowedGrammarPool cachingParserPool_ShadowedGrammarPool2 = new CachingParserPool.ShadowedGrammarPool(cachingParserPool_SynchronizedGrammarPool1);
      SymbolTable symbolTable4 = new SymbolTable();
      CachingParserPool.ShadowedGrammarPool cachingParserPool_ShadowedGrammarPool3 = new CachingParserPool.ShadowedGrammarPool(cachingParserPool_ShadowedGrammarPool2);
      SymbolTable symbolTable5 = new SymbolTable(55);
      XMLGrammarCachingConfiguration xMLGrammarCachingConfiguration0 = new XMLGrammarCachingConfiguration(symbolTable5, cachingParserPool_SynchronizedGrammarPool0, xIncludeAwareParserConfiguration0);
      SymbolTable symbolTable6 = new SymbolTable();
      symbolTable4.addSymbol("C&qu*2Q?5UC");
      xMLGrammarCachingConfiguration0.cleanup();
      CachingParserPool.SynchronizedGrammarPool cachingParserPool_SynchronizedGrammarPool2 = new CachingParserPool.SynchronizedGrammarPool(cachingParserPool_ShadowedGrammarPool1);
      XMLGrammarCachingConfiguration xMLGrammarCachingConfiguration1 = new XMLGrammarCachingConfiguration((SymbolTable) null, cachingParserPool_ShadowedGrammarPool1);
      XMLGrammarCachingConfiguration xMLGrammarCachingConfiguration2 = new XMLGrammarCachingConfiguration(symbolTable4, cachingParserPool_ShadowedGrammarPool2, xMLGrammarCachingConfiguration0);
      ByteArrayList byteArrayList0 = new ByteArrayList();
      recordTypeMessage0.getResponseText();
      assertEquals("RecordTypeMessage", recordTypeMessage0.getShortname());
      assertEquals("RC_OK", recordTypeMessage0.getReturncode());
  }

  /**
  //Test case number: 3
  /*Coverage entropy=1.0931471805599453
  */
  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      RecordTypeMessage recordTypeMessage0 = new RecordTypeMessage((String) null, (XBUSSystem) null, (String) null);
      recordTypeMessage0.getRequestObject((XBUSSystem) null);
      int int0 = 928;
      Hashtable<Integer, Integer> hashtable0 = null;
      try {
        hashtable0 = new Hashtable<Integer, Integer>(20, (-1.0F));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal Load: -1.0
         //
         verifyException("java.util.Hashtable", e);
      }
  }

  /**
  //Test case number: 4
  /*Coverage entropy=1.0931471805599453
  */
  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      RecordTypeMessage recordTypeMessage0 = new RecordTypeMessage((XBUSSystem) null);
      HTMLDocumentImpl hTMLDocumentImpl0 = new HTMLDocumentImpl();
      SymbolTable symbolTable0 = new SymbolTable(55);
      CachingParserPool.ShadowedGrammarPool cachingParserPool_ShadowedGrammarPool0 = new CachingParserPool.ShadowedGrammarPool((XMLGrammarPool) null);
      CachingParserPool.SynchronizedGrammarPool cachingParserPool_SynchronizedGrammarPool0 = new CachingParserPool.SynchronizedGrammarPool(cachingParserPool_ShadowedGrammarPool0);
      CachingParserPool.ShadowedGrammarPool cachingParserPool_ShadowedGrammarPool1 = new CachingParserPool.ShadowedGrammarPool(cachingParserPool_ShadowedGrammarPool0);
      SymbolTable symbolTable1 = new SymbolTable();
      SymbolTable symbolTable2 = new SymbolTable(55);
      SoftReferenceSymbolTableConfiguration softReferenceSymbolTableConfiguration0 = new SoftReferenceSymbolTableConfiguration(symbolTable0);
      symbolTable1.hash(";B|)gpd:Hfm|W6u~V");
      CachingParserPool.SynchronizedGrammarPool cachingParserPool_SynchronizedGrammarPool1 = new CachingParserPool.SynchronizedGrammarPool((XMLGrammarPool) null);
      cachingParserPool_ShadowedGrammarPool0.lockPool();
      XMLGrammarCachingConfiguration xMLGrammarCachingConfiguration0 = new XMLGrammarCachingConfiguration(symbolTable0, cachingParserPool_ShadowedGrammarPool0);
      XIncludeAwareParserConfiguration xIncludeAwareParserConfiguration0 = new XIncludeAwareParserConfiguration((SymbolTable) null, cachingParserPool_SynchronizedGrammarPool0);
      SymbolTable symbolTable3 = new SymbolTable(55);
      DOMParser dOMParser0 = new DOMParser(symbolTable3, cachingParserPool_ShadowedGrammarPool1);
      Object object0 = new Object();
      XML11NonValidatingConfiguration xML11NonValidatingConfiguration0 = new XML11NonValidatingConfiguration(symbolTable2, cachingParserPool_SynchronizedGrammarPool1, (XMLComponentManager) null);
      IntegratedParserConfiguration integratedParserConfiguration0 = new IntegratedParserConfiguration((SymbolTable) null, (XMLGrammarPool) null);
      CachingParserPool.ShadowedGrammarPool cachingParserPool_ShadowedGrammarPool2 = new CachingParserPool.ShadowedGrammarPool(cachingParserPool_SynchronizedGrammarPool1);
      SymbolTable symbolTable4 = new SymbolTable();
      CachingParserPool.ShadowedGrammarPool cachingParserPool_ShadowedGrammarPool3 = new CachingParserPool.ShadowedGrammarPool((XMLGrammarPool) null);
      SymbolTable symbolTable5 = new SymbolTable();
      XMLGrammarCachingConfiguration xMLGrammarCachingConfiguration1 = new XMLGrammarCachingConfiguration(symbolTable5, cachingParserPool_SynchronizedGrammarPool0, xMLGrammarCachingConfiguration0);
      SymbolTable symbolTable6 = new SymbolTable();
      symbolTable4.addSymbol(";B|)gpd:Hfm|W6u~V");
      xMLGrammarCachingConfiguration1.cleanup();
      CachingParserPool.SynchronizedGrammarPool cachingParserPool_SynchronizedGrammarPool2 = new CachingParserPool.SynchronizedGrammarPool((XMLGrammarPool) null);
      XMLGrammarCachingConfiguration xMLGrammarCachingConfiguration2 = new XMLGrammarCachingConfiguration((SymbolTable) null, cachingParserPool_ShadowedGrammarPool1);
      XMLGrammarCachingConfiguration xMLGrammarCachingConfiguration3 = new XMLGrammarCachingConfiguration(symbolTable4, cachingParserPool_ShadowedGrammarPool2, xMLGrammarCachingConfiguration1);
      ByteArrayList byteArrayList0 = new ByteArrayList();
      recordTypeMessage0.getResponseText();
      assertEquals("RecordTypeMessage", recordTypeMessage0.getShortname());
  }

  /**
  //Test case number: 5
  /*Coverage entropy=1.1375916250043898
  */
  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Integer integer0 = new Integer(928);
      Hashtable<Integer, Integer> hashtable0 = new Hashtable<Integer, Integer>();
      Integer integer1 = new Integer(928);
      RecordTypeMessage recordTypeMessage0 = new RecordTypeMessage((XBUSSystem) null);
      recordTypeMessage0.setReturncode(":jE}oR9w)jLH7 }");
      RecordTypeMessage recordTypeMessage1 = new RecordTypeMessage((XBUSSystem) null);
      recordTypeMessage1.setErrorcode(20);
      DocumentImpl documentImpl0 = new DocumentImpl();
      recordTypeMessage1.setErrortext("JwE)");
      recordTypeMessage1.synchronizeRequestFields((XBUSSystem) null);
      recordTypeMessage0.synchronizeRequestFields((XBUSSystem) null);
      assertEquals("RecordTypeMessage", recordTypeMessage0.getShortname());
  }

  /**
  //Test case number: 6
  /*Coverage entropy=1.830738805564335
  */
  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      RecordTypeMessage recordTypeMessage0 = new RecordTypeMessage((XBUSSystem) null);
      WSDDService wSDDService0 = new WSDDService();
      DocumentTypeImpl documentTypeImpl0 = new DocumentTypeImpl((CoreDocumentImpl) null, "java", (String) null, "serializer");
      WMLDocumentImpl wMLDocumentImpl0 = new WMLDocumentImpl(documentTypeImpl0);
      recordTypeMessage0.setResponseObject((Object) null, (XBUSSystem) null);
      WMLImgElementImpl wMLImgElementImpl0 = new WMLImgElementImpl(wMLDocumentImpl0, "responseFlow");
      WSDDDeployment wSDDDeployment0 = new WSDDDeployment();
      // Undeclared exception!
      try { 
        wSDDService0.deployToRegistry(wSDDDeployment0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.axis.deployment.wsdd.WSDDService", e);
      }
  }

  /**
  //Test case number: 7
  /*Coverage entropy=1.0931471805599453
  */
  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      NetworkHandling.createRemoteTextFile((EvoSuiteURL) null, (String) null);
      FileSystemHandling.appendLineToFile((EvoSuiteFile) null, "org.apaqhe.axis.mesXa3e.SOAPBody");
      FileSystemHandling.createFolder((EvoSuiteFile) null);
      RecordTypeMessage recordTypeMessage0 = new RecordTypeMessage("org.apaqhe.axis.mesXa3e.SOAPBody", (XBUSSystem) null, "org.apaqhe.axis.mesXa3e.SOAPBody");
      recordTypeMessage0.synchronizeResponseFields((XBUSSystem) null);
      byte[] byteArray0 = new byte[0];
      FileSystemHandling.appendDataToFile((EvoSuiteFile) null, byteArray0);
      FileSystemHandling.appendLineToFile((EvoSuiteFile) null, "org.apaqhe.axis.mesXa3e.SOAPBody");
      FileSystemHandling.appendStringToFile((EvoSuiteFile) null, "org.apaqhe.axis.mesXa3e.SOAPBody");
      FileSystemHandling.appendStringToFile((EvoSuiteFile) null, (String) null);
      FileSystemHandling.appendLineToFile((EvoSuiteFile) null, "org.apaqhe.axis.mesXa3e.SOAPBody");
      FileSystemHandling.appendLineToFile((EvoSuiteFile) null, "");
      FileSystemHandling.appendLineToFile((EvoSuiteFile) null, "org.apaqhe.axis.mesXa3e.SOAPBody");
      FileSystemHandling.appendStringToFile((EvoSuiteFile) null, "org.apaqhe.axis.mesXa3e.SOAPBody");
      FileSystemHandling.shouldAllThrowIOExceptions();
      FileSystemHandling.appendLineToFile((EvoSuiteFile) null, "qRp}Y/8X)!pq2j5");
      FileSystemHandling.shouldThrowIOException((EvoSuiteFile) null);
      FileSystemHandling.appendStringToFile((EvoSuiteFile) null, "org.apaqhe.axis.mesXa3e.SOAPBody");
      NetworkHandling.createRemoteTextFile((EvoSuiteURL) null, "02");
      NetworkHandling.createRemoteTextFile((EvoSuiteURL) null, "");
      EventReaderDelegate eventReaderDelegate0 = new EventReaderDelegate();
  }

  /**
  //Test case number: 8
  /*Coverage entropy=1.0931471805599453
  */
  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      NetworkHandling.createRemoteTextFile((EvoSuiteURL) null, (String) null);
      FileSystemHandling.appendLineToFile((EvoSuiteFile) null, "org.apaqhe.axis.mesXa3e.SOAPBody");
      FileSystemHandling.createFolder((EvoSuiteFile) null);
      RecordTypeMessage recordTypeMessage0 = new RecordTypeMessage("org.apaqhe.axis.mesXa3e.SOAPBody", (XBUSSystem) null, "org.apaqhe.axis.mesXa3e.SOAPBody");
      recordTypeMessage0.synchronizeResponseFields((XBUSSystem) null);
      byte[] byteArray0 = new byte[0];
      FileSystemHandling.appendDataToFile((EvoSuiteFile) null, byteArray0);
      FileSystemHandling.appendLineToFile((EvoSuiteFile) null, "org.apaqhe.axis.mesXa3e.SOAPBody");
      FileSystemHandling.appendStringToFile((EvoSuiteFile) null, "org.apaqhe.axis.mesXa3e.SOAPBody");
      FileSystemHandling.appendStringToFile((EvoSuiteFile) null, (String) null);
      FileSystemHandling.appendLineToFile((EvoSuiteFile) null, "org.apaqhe.axis.mesXa3e.SOAPBody");
      FileSystemHandling.appendLineToFile((EvoSuiteFile) null, "");
      FileSystemHandling.appendLineToFile((EvoSuiteFile) null, "org.apaqhe.axis.mesXa3e.SOAPBody");
      boolean boolean0 = new Boolean(false);
      FileSystemHandling.shouldAllThrowIOExceptions();
      FileSystemHandling.appendLineToFile((EvoSuiteFile) null, "qRp}Y/8X)!pq2j5");
      FileSystemHandling.shouldThrowIOException((EvoSuiteFile) null);
      FileSystemHandling.appendStringToFile((EvoSuiteFile) null, "org.apaqhe.axis.mesXa3e.SOAPBody");
      NetworkHandling.createRemoteTextFile((EvoSuiteURL) null, "02");
      NetworkHandling.createRemoteTextFile((EvoSuiteURL) null, "");
      EventReaderDelegate eventReaderDelegate0 = new EventReaderDelegate();
  }

  /**
  //Test case number: 9
  /*Coverage entropy=1.0931471805599453
  */
  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      RecordTypeMessage recordTypeMessage0 = new RecordTypeMessage((XBUSSystem) null);
      recordTypeMessage0.getRequestText((XBUSSystem) null);
      SimpleProvider simpleProvider0 = new SimpleProvider();
      AxisServer axisServer0 = new AxisServer(simpleProvider0);
      MessageContext messageContext0 = new MessageContext(axisServer0);
      simpleProvider0.removeRole("adminPassword");
      axisServer0.removeActorURI("axis.byteBuffer.residentMaxSize");
      MockPrintWriter mockPrintWriter0 = null;
      try {
        mockPrintWriter0 = new MockPrintWriter("ws-i.bp10Compliance", "axis.byteBuffer.workBufferSize");
        fail("Expecting exception: UnsupportedEncodingException");
      
      } catch(Throwable e) {
         //
         // axis.byteBuffer.workBufferSize
         //
         verifyException("org.evosuite.runtime.mock.java.io.MockPrintWriter", e);
      }
  }

  /**
  //Test case number: 10
  /*Coverage entropy=1.0931471805599453
  */
  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      RecordTypeMessage recordTypeMessage0 = new RecordTypeMessage((XBUSSystem) null);
      SymbolTable symbolTable0 = new SymbolTable(55);
      CachingParserPool.ShadowedGrammarPool cachingParserPool_ShadowedGrammarPool0 = new CachingParserPool.ShadowedGrammarPool((XMLGrammarPool) null);
      CachingParserPool.SynchronizedGrammarPool cachingParserPool_SynchronizedGrammarPool0 = new CachingParserPool.SynchronizedGrammarPool(cachingParserPool_ShadowedGrammarPool0);
      CachingParserPool.ShadowedGrammarPool cachingParserPool_ShadowedGrammarPool1 = new CachingParserPool.ShadowedGrammarPool(cachingParserPool_ShadowedGrammarPool0);
      SymbolTable symbolTable1 = new SymbolTable(55);
      SoftReferenceSymbolTableConfiguration softReferenceSymbolTableConfiguration0 = new SoftReferenceSymbolTableConfiguration(symbolTable0);
      symbolTable0.hash(".&qu*2j?BUC");
      CachingParserPool.SynchronizedGrammarPool cachingParserPool_SynchronizedGrammarPool1 = new CachingParserPool.SynchronizedGrammarPool((XMLGrammarPool) null);
      cachingParserPool_ShadowedGrammarPool0.lockPool();
      XMLGrammarCachingConfiguration xMLGrammarCachingConfiguration0 = new XMLGrammarCachingConfiguration(symbolTable0, cachingParserPool_ShadowedGrammarPool0);
      XIncludeAwareParserConfiguration xIncludeAwareParserConfiguration0 = new XIncludeAwareParserConfiguration((SymbolTable) null, cachingParserPool_SynchronizedGrammarPool0);
      SymbolTable symbolTable2 = new SymbolTable(55);
      DOMParser dOMParser0 = new DOMParser(symbolTable2, cachingParserPool_ShadowedGrammarPool1);
      recordTypeMessage0.getResponseObject();
      Grammar[] grammarArray0 = new Grammar[7];
      SchemaGrammar.Schema4Annotations schemaGrammar_Schema4Annotations0 = SchemaGrammar.SG_Schema4Annotations;
      grammarArray0[0] = (Grammar) schemaGrammar_Schema4Annotations0;
      XMLGrammarDescription xMLGrammarDescription0 = schemaGrammar_Schema4Annotations0.getGrammarDescription();
      cachingParserPool_ShadowedGrammarPool0.removeGrammar(xMLGrammarDescription0);
      grammarArray0[1] = null;
      SchemaGrammar.BuiltinSchemaGrammar schemaGrammar_BuiltinSchemaGrammar0 = SchemaGrammar.SG_XSI;
      grammarArray0[2] = (Grammar) schemaGrammar_BuiltinSchemaGrammar0;
      DOMEntityResolverWrapper dOMEntityResolverWrapper0 = new DOMEntityResolverWrapper();
      dOMEntityResolverWrapper0.resolveEntity(xMLGrammarDescription0);
      XMLDTDDescription xMLDTDDescription0 = null;
      try {
        xMLDTDDescription0 = new XMLDTDDescription((XMLInputSource) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.xerces.impl.dtd.XMLDTDDescription", e);
      }
  }

  /**
  //Test case number: 11
  /*Coverage entropy=1.0931471805599453
  */
  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      RecordTypeMessage recordTypeMessage0 = new RecordTypeMessage((XBUSSystem) null);
      PipedInputStream pipedInputStream0 = new PipedInputStream();
      DataInputStream dataInputStream0 = new DataInputStream(pipedInputStream0);
      BufferedInputStream bufferedInputStream0 = new BufferedInputStream(dataInputStream0, 8);
      try { 
        recordTypeMessage0.setResponseObject(bufferedInputStream0, (XBUSSystem) null);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // I_02_003_0 java.io.BufferedInputStream cannot be cast to net.sf.xbus.base.bytearraylist.ByteArrayList
         //
         verifyException("net.sf.xbus.protocol.records.RecordTypeMessage", e);
      }
  }

  /**
  //Test case number: 12
  /*Coverage entropy=1.5271837172395382
  */
  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      RecordTypeMessage recordTypeMessage0 = new RecordTypeMessage((String) null, (XBUSSystem) null, (String) null);
      MockDate mockDate0 = new MockDate((-914), 0, 0);
      recordTypeMessage0.setResponseTimestamp(mockDate0);
      recordTypeMessage0.setRequestText((String) null, (XBUSSystem) null);
      ByteArrayList byteArrayList0 = new ByteArrayList();
      NetworkHandling.createRemoteTextFile((EvoSuiteURL) null, (String) null);
      byte[] byteArray0 = new byte[1];
      byteArrayList0.iterator();
      byteArrayList0.iterator();
      ByteArrayList byteArrayList1 = ByteArrayList.createByteArrayList(byteArray0, 34);
      byteArrayList0.addAll(byteArrayList1);
      byteArrayList0.toByteArray();
      byteArrayList0.add(byteArray0);
      byteArrayList0.add(byteArray0);
      EventReaderDelegate eventReaderDelegate0 = new EventReaderDelegate();
  }

  /**
  //Test case number: 13
  /*Coverage entropy=1.7741057932992026
  */
  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      RecordTypeMessage recordTypeMessage0 = new RecordTypeMessage((XBUSSystem) null);
      // Undeclared exception!
      try { 
        recordTypeMessage0.setRequestText("g[<K9}*>Gj1:.Y", (XBUSSystem) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("net.sf.xbus.protocol.xml.XMLMessageAbstract", e);
      }
  }

  /**
  //Test case number: 14
  /*Coverage entropy=1.0931471805599453
  */
  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      FileSystemHandling.shouldAllThrowIOExceptions();
      FileSystemHandling fileSystemHandling0 = new FileSystemHandling();
      byte[] byteArray0 = new byte[4];
      byteArray0[0] = (byte)108;
      byteArray0[1] = (byte) (-1);
      int int0 = 933;
      FileSystemHandling fileSystemHandling1 = new FileSystemHandling();
      RecordTypeMessage recordTypeMessage0 = new RecordTypeMessage((XBUSSystem) null);
      recordTypeMessage0.getRequestTextAsXML((XBUSSystem) null);
      Hashtable<Integer, Integer> hashtable0 = null;
      try {
        hashtable0 = new Hashtable<Integer, Integer>(124, (-1235.5449F));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal Load: -1235.5449
         //
         verifyException("java.util.Hashtable", e);
      }
  }

  /**
  //Test case number: 15
  /*Coverage entropy=1.4682921994113465
  */
  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      byte[] byteArray0 = new byte[9];
      byteArray0[4] = (byte)0;
      byteArray0[5] = (byte) (-28);
      byteArray0[6] = (byte)11;
      byteArray0[7] = (byte)24;
      byteArray0[8] = (byte) (-116);
      FileSystemHandling.appendDataToFile((EvoSuiteFile) null, byteArray0);
      NetworkHandling.createRemoteTextFile((EvoSuiteURL) null, (String) null);
      boolean boolean0 = new Boolean((String) null);
      FileSystemHandling.appendLineToFile((EvoSuiteFile) null, (String) null);
      RecordTypeMessage recordTypeMessage0 = new RecordTypeMessage((XBUSSystem) null);
      byte[] byteArray1 = new byte[0];
      FileSystemHandling.appendDataToFile((EvoSuiteFile) null, byteArray1);
      FileSystemHandling.appendLineToFile((EvoSuiteFile) null, (String) null);
      FileSystemHandling.appendStringToFile((EvoSuiteFile) null, (String) null);
      FileSystemHandling.appendLineToFile((EvoSuiteFile) null, (String) null);
      FileSystemHandling.appendLineToFile((EvoSuiteFile) null, (String) null);
      FileSystemHandling.appendLineToFile((EvoSuiteFile) null, (String) null);
      FileSystemHandling.appendStringToFile((EvoSuiteFile) null, (String) null);
      FileSystemHandling.shouldAllThrowIOExceptions();
      ByteArrayList byteArrayList0 = new ByteArrayList();
      FileSystemHandling.appendLineToFile((EvoSuiteFile) null, "qp}Y`8)!pq2jx");
      FileSystemHandling.appendStringToFile((EvoSuiteFile) null, (String) null);
      byteArrayList0.toString();
      FileSystemHandling.appendStringToFile((EvoSuiteFile) null, (String) null);
      byteArrayList0.toString();
      byteArrayList0.addAll(byteArrayList0);
      FileSystemHandling.appendLineToFile((EvoSuiteFile) null, (String) null);
      byteArrayList0.toString();
      NetworkHandling.createRemoteTextFile((EvoSuiteURL) null, (String) null);
      byteArrayList0.toByteArray();
      FileSystemHandling.appendLineToFile((EvoSuiteFile) null, "");
      recordTypeMessage0.setResponseObject(byteArrayList0, (XBUSSystem) null);
      assertEquals(0, recordTypeMessage0.getErrorcode());
      assertEquals("RecordTypeMessage", recordTypeMessage0.getShortname());
      assertEquals("RC_OK", recordTypeMessage0.getReturncode());
  }

  /**
  //Test case number: 16
  /*Coverage entropy=1.4682921994113465
  */
  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      FileSystemHandling.appendLineToFile((EvoSuiteFile) null, "org.apaqhe.axis.messa3e.SOAPBody");
      FileSystemHandling.setPermissions((EvoSuiteFile) null, false, false, false);
      RecordTypeMessage recordTypeMessage0 = new RecordTypeMessage("mmcq<:-c]'9kq9mq", (XBUSSystem) null, "mmcq<:-c]'9kq9mq");
      FileSystemHandling.appendLineToFile((EvoSuiteFile) null, "mmcq<:-c]'9kq9mq");
      FileSystemHandling.appendStringToFile((EvoSuiteFile) null, (String) null);
      FileSystemHandling.appendLineToFile((EvoSuiteFile) null, "mmcq<:-c]'9kq9mq");
      FileSystemHandling.appendLineToFile((EvoSuiteFile) null, "");
      FileSystemHandling.appendLineToFile((EvoSuiteFile) null, "mmcq<:-c]'9kq9mq");
      FileSystemHandling.appendLineToFile((EvoSuiteFile) null, (String) null);
      ByteArrayList byteArrayList0 = new ByteArrayList();
      FileSystemHandling.appendLineToFile((EvoSuiteFile) null, "ROJK");
      FileSystemHandling.appendStringToFile((EvoSuiteFile) null, "mmcq<:-c]'9kq9mq");
      byteArrayList0.toString();
      byteArrayList0.addAll(byteArrayList0);
      byteArrayList0.toString();
      NetworkHandling.createRemoteTextFile((EvoSuiteURL) null, "");
      FileSystemHandling.appendStringToFile((EvoSuiteFile) null, "");
      byteArrayList0.toByteArray();
      recordTypeMessage0.setResponseObject(byteArrayList0, (XBUSSystem) null);
      assertEquals(0, recordTypeMessage0.getErrorcode());
      assertEquals("RecordTypeMessage", recordTypeMessage0.getShortname());
      assertEquals("RC_OK", recordTypeMessage0.getReturncode());
  }

  /**
  //Test case number: 17
  /*Coverage entropy=1.4841652152843623
  */
  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      RecordTypeMessage recordTypeMessage0 = new RecordTypeMessage((XBUSSystem) null);
      Instant instant0 = MockInstant.now();
      recordTypeMessage0.setRequestObject((Object) null, (XBUSSystem) null);
      Instant instant1 = MockInstant.minusSeconds(instant0, 1L);
      try { 
        recordTypeMessage0.setRequestObject(instant1, (XBUSSystem) null);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // I_02_003_0 java.time.Instant cannot be cast to net.sf.xbus.base.bytearraylist.ByteArrayList
         //
         verifyException("net.sf.xbus.protocol.records.RecordTypeMessage", e);
      }
  }

  /**
  //Test case number: 18
  /*Coverage entropy=1.4682921994113465
  */
  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      RecordTypeMessage recordTypeMessage0 = new RecordTypeMessage((String) null, (XBUSSystem) null, (String) null);
      ByteArrayList byteArrayList0 = new ByteArrayList();
      byte[] byteArray0 = new byte[0];
      byteArrayList0.iterator();
      byteArrayList0.iterator();
      byteArrayList0.toByteArray();
      byteArrayList0.add(byteArray0);
      byteArrayList0.add(byteArray0);
      byteArrayList0.iterator();
      recordTypeMessage0.setRequestObject(byteArrayList0, (XBUSSystem) null);
      BasicClientConfig basicClientConfig0 = new BasicClientConfig();
      basicClientConfig0.getGlobalOptions();
      basicClientConfig0.addRole("");
      BasicClientConfig basicClientConfig1 = new BasicClientConfig();
      BasicClientConfig basicClientConfig2 = new BasicClientConfig();
      basicClientConfig2.removeRole("");
      BasicClientConfig basicClientConfig3 = new BasicClientConfig();
      BasicClientConfig basicClientConfig4 = new BasicClientConfig();
      AxisClient axisClient0 = null;
      try {
        axisClient0 = new AxisClient();
        fail("Expecting exception: LinkageError");
      
      } catch(LinkageError e) {
         //
         // loader constraint violation: when resolving method \"org.apache.commons.discovery.resource.classes.DiscoverClasses.findResourceClasses(Lorg/apache/commons/discovery/ResourceNameIterator;)Lorg/apache/commons/discovery/ResourceClassIterator;\" the class loader (instance of org/evosuite/instrumentation/InstrumentingClassLoader) of the current class, org/apache/axis/AxisProperties, and the class loader (instance of sun/misc/Launcher$AppClassLoader) for the method's defining class, org/apache/commons/discovery/resource/classes/ResourceClassDiscoverImpl, have different Class objects for the type org/apache/commons/discovery/ResourceNameIterator used in the signature
         //
         verifyException("org.apache.axis.AxisProperties", e);
      }
  }

  /**
  //Test case number: 19
  /*Coverage entropy=1.7741057932992024
  */
  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      RecordTypeMessage recordTypeMessage0 = new RecordTypeMessage("3c/", (XBUSSystem) null, "");
      recordTypeMessage0.setErrortext("org.apache.html.dom.HTMLImaQeElementImpl");
      // Undeclared exception!
      try { 
        recordTypeMessage0.setResponseText("org.apache.html.dom.HTMLImaQeElementImpl", (XBUSSystem) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("net.sf.xbus.protocol.xml.XMLMessageAbstract", e);
      }
  }

  /**
  //Test case number: 20
  /*Coverage entropy=1.7741057932992026
  */
  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      FileSystemHandling.shouldAllThrowIOExceptions();
      RecordTypeMessage recordTypeMessage0 = new RecordTypeMessage("", (XBUSSystem) null, "");
      byte[] byteArray0 = new byte[6];
      byteArray0[0] = (byte)7;
      byteArray0[1] = (byte)4;
      byteArray0[2] = (byte)44;
      byteArray0[3] = (byte)4;
      byteArray0[4] = (byte)4;
      byteArray0[5] = (byte)30;
      ByteArrayList byteArrayList0 = new ByteArrayList();
      EventReaderDelegate eventReaderDelegate0 = new EventReaderDelegate();
      ByteArrayList byteArrayList1 = new ByteArrayList();
      byteArrayList1.toString();
      byteArrayList0.addAll(byteArrayList0);
      EventReaderDelegate eventReaderDelegate1 = new EventReaderDelegate();
      ByteArrayList byteArrayList2 = new ByteArrayList();
      byteArrayList2.toByteArray();
      byteArrayList2.add(byteArray0);
      EventReaderDelegate eventReaderDelegate2 = new EventReaderDelegate();
      byteArrayList2.add(byteArray0);
      byteArrayList1.toByteArray();
      ByteArrayList byteArrayList3 = ByteArrayList.createByteArrayList(byteArray0, (byte)4);
      EventReaderDelegate eventReaderDelegate3 = new EventReaderDelegate();
      // Undeclared exception!
      try { 
        recordTypeMessage0.setResponseObject(byteArrayList3, (XBUSSystem) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("net.sf.xbus.protocol.xml.XMLMessageAbstract", e);
      }
  }
}
