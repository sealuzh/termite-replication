/**
 * Scaffolding file used to store all the setups needed to run 
 * tests automatically generated by EvoSuite
 * Mon Nov 30 01:27:59 GMT 2020
 */

package com.browsersoft.openhre.hl7.impl.regular;

import org.evosuite.runtime.annotation.EvoSuiteClassExclude;
import org.junit.BeforeClass;
import org.junit.Before;
import org.junit.After;
import org.junit.AfterClass;
import org.evosuite.runtime.sandbox.Sandbox;
import org.evosuite.runtime.sandbox.Sandbox.SandboxMode;

@EvoSuiteClassExclude
public class ExpressionMatrixImpl_ESTest_scaffolding {

  @org.junit.Rule 
  public org.evosuite.runtime.vnet.NonFunctionalRequirementRule nfr = new org.evosuite.runtime.vnet.NonFunctionalRequirementRule();

  private static final java.util.Properties defaultProperties = (java.util.Properties) java.lang.System.getProperties().clone(); 

  private org.evosuite.runtime.thread.ThreadStopper threadStopper =  new org.evosuite.runtime.thread.ThreadStopper (org.evosuite.runtime.thread.KillSwitchHandler.getInstance(), 3000);


  @BeforeClass 
  public static void initEvoSuiteFramework() { 
    org.evosuite.runtime.RuntimeSettings.className = "com.browsersoft.openhre.hl7.impl.regular.ExpressionMatrixImpl"; 
    org.evosuite.runtime.GuiSupport.initialize(); 
    org.evosuite.runtime.RuntimeSettings.maxNumberOfThreads = 100; 
    org.evosuite.runtime.RuntimeSettings.maxNumberOfIterationsPerLoop = 10000; 
    org.evosuite.runtime.RuntimeSettings.mockSystemIn = true; 
    org.evosuite.runtime.RuntimeSettings.sandboxMode = org.evosuite.runtime.sandbox.Sandbox.SandboxMode.RECOMMENDED; 
    org.evosuite.runtime.sandbox.Sandbox.initializeSecurityManagerForSUT(); 
    org.evosuite.runtime.classhandling.JDKClassResetter.init();
    setSystemProperties();
    initializeClasses();
    org.evosuite.runtime.Runtime.getInstance().resetRuntime(); 
  } 

  @AfterClass 
  public static void clearEvoSuiteFramework(){ 
    Sandbox.resetDefaultSecurityManager(); 
    java.lang.System.setProperties((java.util.Properties) defaultProperties.clone()); 
  } 

  @Before 
  public void initTestCase(){ 
    threadStopper.storeCurrentThreads();
    threadStopper.startRecordingTime();
    org.evosuite.runtime.jvm.ShutdownHookHandler.getInstance().initHandler(); 
    org.evosuite.runtime.sandbox.Sandbox.goingToExecuteSUTCode(); 
    setSystemProperties(); 
    org.evosuite.runtime.GuiSupport.setHeadless(); 
    org.evosuite.runtime.Runtime.getInstance().resetRuntime(); 
    org.evosuite.runtime.agent.InstrumentingAgent.activate(); 
  } 

  @After 
  public void doneWithTestCase(){ 
    threadStopper.killAndJoinClientThreads();
    org.evosuite.runtime.jvm.ShutdownHookHandler.getInstance().safeExecuteAddedHooks(); 
    org.evosuite.runtime.classhandling.JDKClassResetter.reset(); 
    resetClasses(); 
    org.evosuite.runtime.sandbox.Sandbox.doneWithExecutingSUTCode(); 
    org.evosuite.runtime.agent.InstrumentingAgent.deactivate(); 
    org.evosuite.runtime.GuiSupport.restoreHeadlessMode(); 
  } 

  public static void setSystemProperties() {
 
    java.lang.System.setProperties((java.util.Properties) defaultProperties.clone()); 
    java.lang.System.setProperty("file.encoding", "UTF-8"); 
    java.lang.System.setProperty("java.awt.headless", "true"); 
    java.lang.System.setProperty("java.io.tmpdir", "/tmp"); 
    java.lang.System.setProperty("user.dir", "/home/ubuntu/termite/projects/75_openhre"); 
    java.lang.System.setProperty("user.home", "/home/ubuntu"); 
    java.lang.System.setProperty("user.language", "en"); 
    java.lang.System.setProperty("user.name", "ubuntu"); 
    java.lang.System.setProperty("user.timezone", "Etc/UTC"); 
    java.lang.System.setProperty("log4j.configuration", "SUT.log4j.properties"); 
  }

  private static void initializeClasses() {
    org.evosuite.runtime.classhandling.ClassStateSupport.initializeClasses(ExpressionMatrixImpl_ESTest_scaffolding.class.getClassLoader() ,
      "org.apache.axis.deployment.wsdd.WSDDConstants",
      "com.browsersoft.openhre.hl7.impl.parser.HL72XMLImpl",
      "org.apache.axis.message.SOAPEnvelope",
      "org.apache.axis.constants.Style$Type",
      "org.apache.axis.InternalException",
      "com.browsersoft.openhre.hl7.api.config.HL7FieldList",
      "org.apache.axis.description.OperationDesc",
      "org.apache.axis.encoding.Deserializer",
      "com.browsersoft.openhre.hl7.impl.regular.ExpressionElementMapperItemImpl",
      "org.apache.log4j.Level",
      "org.apache.commons.discovery.tools.ClassUtils",
      "com.browsersoft.openhre.hl7.api.regular.ExpressionElementMapperItem",
      "org.apache.axis.encoding.DeserializationContext$NullLexicalHandler",
      "org.apache.axis.message.SOAPFaultBuilder",
      "com.browsersoft.openhre.hl7.api.parse.HL7SAXEventGeneratorHandler",
      "com.browsersoft.openhre.hl7.impl.parser.HL7CheckerImpl",
      "org.apache.axis.utils.cache.JavaClass",
      "org.apache.axis.description.FaultDesc",
      "org.apache.axis.encoding.TypeMappingRegistry",
      "org.apache.log4j.spi.Filter",
      "org.apache.axis.wsdl.symbolTable.BindingEntry",
      "org.apache.axis.wsdl.symbolTable.MessageEntry",
      "com.browsersoft.openhre.hl7.api.parse.HL72XMLHandler",
      "org.apache.axis.encoding.Serializer",
      "com.browsersoft.openhre.hl7.api.config.HL7MessageSegment",
      "org.apache.axis.message.MessageElement",
      "org.apache.axis.message.HeaderBuilder",
      "org.apache.log4j.Layout",
      "org.apache.axis.wsdl.symbolTable.Type",
      "org.apache.commons.discovery.resource.names.DiscoverNamesInAlternateManagedProperties",
      "org.apache.axis.encoding.SerializationContext",
      "org.apache.axis.ConfigurationException",
      "com.browsersoft.openhre.hl7.api.config.HL7DataTypeMap",
      "org.apache.axis.soap.SOAP12Constants",
      "org.apache.commons.discovery.log.SimpleLog",
      "org.apache.axis.utils.ByteArray",
      "com.browsersoft.openhre.hl7.impl.config.HL7MessageImpl",
      "com.browsersoft.openhre.hl7.api.config.HL7TableItemMap",
      "org.apache.log4j.Hierarchy",
      "com.browsersoft.openhre.hl7.api.parse.HL7CheckerHandler",
      "org.apache.commons.discovery.ResourceNameIterator",
      "org.apache.axis.constants.Enum$Type",
      "org.apache.axis.message.NullAttributes",
      "org.apache.commons.discovery.ResourceNameDiscover",
      "org.apache.commons.discovery.tools.ManagedProperties$1",
      "org.apache.axis.wsdl.symbolTable.PortTypeEntry",
      "org.apache.axis.description.ServiceDesc",
      "org.apache.axis.components.encoding.XMLEncoder",
      "org.apache.log4j.spi.DefaultRepositorySelector",
      "org.apache.log4j.spi.OptionHandler",
      "org.apache.axis.utils.cache.ClassCache",
      "com.browsersoft.openhre.hl7.api.regular.MessageTracerHandler",
      "org.apache.axis.message.IDResolver",
      "org.apache.axis.SimpleTargetedChain",
      "org.apache.axis.message.RPCParam",
      "org.apache.axis.constants.Enum",
      "org.apache.commons.discovery.DiscoveryException",
      "com.browsersoft.openhre.hl7.impl.config.HL7MessageGroupItemImpl",
      "org.apache.log4j.helpers.OptionConverter",
      "com.browsersoft.openhre.hl7.impl.parser.HL7SAXEventGeneratorImpl",
      "org.apache.axis.message.SOAPFaultCodeBuilder",
      "org.apache.commons.discovery.ResourceClassIterator",
      "org.apache.log4j.or.ObjectRenderer",
      "com.browsersoft.openhre.hl7.api.regular.ExpressionMatrixBuilder",
      "org.apache.axis.wsdl.fromJava.Types",
      "org.apache.axis.encoding.DeserializerFactory",
      "org.apache.axis.message.RPCElement",
      "org.apache.axis.session.Session",
      "org.apache.axis.constants.Style",
      "org.apache.axis.MessageContext",
      "org.apache.log4j.Category",
      "org.apache.axis.utils.NSStack",
      "com.browsersoft.openhre.hl7.impl.parser.XMLUtils",
      "com.browsersoft.openhre.hl7.impl.config.HL7MessageMapImpl",
      "org.apache.commons.discovery.jdk.JDKHooks",
      "org.apache.axis.wsdl.symbolTable.CollectionTE",
      "com.browsersoft.openhre.hl7.api.regular.ExpressionMatrix",
      "org.apache.log4j.spi.LoggerFactory",
      "org.apache.axis.description.ParameterDesc",
      "org.apache.log4j.spi.Configurator",
      "org.apache.commons.discovery.tools.ManagedProperties",
      "org.apache.axis.wsdl.symbolTable.BaseType",
      "org.apache.commons.discovery.resource.names.ResourceNameDiscoverImpl",
      "com.browsersoft.openhre.hl7.api.config.HL7MessageGroup",
      "org.apache.axis.handlers.BasicHandler",
      "org.apache.log4j.spi.LocationInfo",
      "org.apache.axis.constants.Use$Type",
      "org.apache.axis.message.SAX2EventRecorder$objArrayVector",
      "org.apache.log4j.PropertyWatchdog",
      "com.browsersoft.openhre.hl7.api.config.HL7FieldDependingProcessor",
      "org.apache.axis.message.SOAPBodyElement",
      "org.apache.axis.encoding.SerializerFactory",
      "org.apache.axis.attachments.IncomingAttachmentStreams",
      "org.apache.axis.AxisFault",
      "org.apache.axis.message.InputStreamBody",
      "org.apache.axis.schema.SchemaVersion2001",
      "org.apache.axis.EngineConfiguration",
      "org.apache.axis.message.SOAPHeaderElement",
      "org.apache.axis.wsdl.symbolTable.CollectionElement",
      "org.apache.commons.discovery.jdk.JDK12Hooks",
      "org.apache.axis.schema.SchemaVersion",
      "org.apache.axis.message.SOAPFaultElement",
      "org.apache.axis.wsdl.symbolTable.SymbolTable",
      "org.apache.axis.message.NodeImpl",
      "org.apache.axis.SOAPPart",
      "com.browsersoft.openhre.hl7.api.config.HL7PatternsForCatchValues",
      "org.apache.axis.encoding.Callback",
      "org.apache.axis.handlers.soap.SOAPService",
      "org.apache.axis.wsdl.symbolTable.DefinedType",
      "org.apache.axis.constants.Use",
      "com.browsersoft.openhre.hl7.impl.config.HL7SegmentImpl",
      "org.apache.log4j.spi.AppenderAttachable",
      "org.apache.axis.soap.SOAPConstants",
      "com.browsersoft.openhre.hl7.api.regular.InvalidExpressionException",
      "org.apache.axis.schema.SchemaVersion2000",
      "org.apache.log4j.spi.NullWriter",
      "org.apache.axis.message.SOAPBody",
      "org.apache.log4j.Priority",
      "org.apache.axis.message.BodyBuilder",
      "org.apache.axis.wsdl.symbolTable.SymTabEntry",
      "org.apache.axis.wsdl.symbolTable.TypeEntry",
      "org.apache.log4j.LogManager",
      "com.browsersoft.openhre.hl7.api.parse.HL72XML",
      "org.apache.axis.wsdl.symbolTable.ServiceEntry",
      "com.browsersoft.openhre.hl7.impl.regular.ExpressionImpl",
      "com.browsersoft.openhre.hl7.api.parse.HL7SAXEventGenerator",
      "org.apache.axis.utils.IDKey",
      "com.browsersoft.openhre.hl7.impl.regular.ExpressionMatrixImpl",
      "com.browsersoft.openhre.hl7.impl.parser.HL7ParserImpl",
      "org.apache.log4j.DefaultCategoryFactory",
      "org.apache.axis.wsdl.symbolTable.BaseTypeMapping",
      "org.apache.log4j.or.RendererMap",
      "com.browsersoft.openhre.hl7.api.config.HL7SegmentMap",
      "org.apache.axis.wsdl.symbolTable.UndefinedElement",
      "org.apache.axis.strategies.InvocationStrategy",
      "org.apache.axis.message.SOAPFault",
      "org.apache.axis.components.logger.LogFactory$1",
      "org.apache.log4j.spi.RootCategory",
      "com.browsersoft.openhre.hl7.impl.parser.HL7CheckerStateImpl",
      "org.apache.axis.Handler",
      "com.browsersoft.openhre.hl7.api.regular.ExpressionElementMapper",
      "com.browsersoft.openhre.hl7.api.regular.MessageTracer",
      "org.apache.axis.wsdl.symbolTable.Parameter",
      "org.apache.axis.soap.SOAP11Constants",
      "org.apache.axis.message.SOAPFaultDetailsBuilder",
      "org.apache.axis.SimpleChain",
      "org.apache.log4j.CategoryKey",
      "com.browsersoft.openhre.hl7.api.regular.ExpressionPart",
      "com.browsersoft.openhre.hl7.api.config.HL7Message",
      "com.browsersoft.openhre.hl7.impl.config.HL7SegmentMapImpl",
      "org.apache.axis.encoding.DeserializerImpl",
      "com.browsersoft.openhre.hl7.api.regular.Expression",
      "org.apache.axis.attachments.Attachments",
      "org.apache.axis.message.MimeHeaders",
      "org.apache.axis.message.EnvelopeBuilder",
      "com.browsersoft.openhre.hl7.api.config.HL7TableItem",
      "com.browsersoft.openhre.hl7.api.config.HL7DataType",
      "org.apache.log4j.helpers.Loader",
      "org.apache.log4j.ProvisionNode",
      "org.apache.commons.discovery.tools.DefaultClassHolder",
      "com.browsersoft.openhre.hl7.api.config.HL7DataTypePartList",
      "org.apache.axis.wsdl.symbolTable.CollectionType",
      "org.apache.log4j.helpers.FileWatchdog",
      "org.apache.axis.wsdl.symbolTable.Undefined",
      "com.browsersoft.openhre.hl7.impl.regular.ExpressionPartImpl",
      "com.browsersoft.openhre.hl7.api.config.HL7Segment",
      "org.apache.axis.schema.SchemaVersion1999",
      "com.browsersoft.openhre.hl7.api.config.HL7DataTypePart",
      "org.apache.axis.utils.LockableHashtable",
      "com.browsersoft.openhre.hl7.api.config.HL7MessageMap",
      "org.apache.axis.components.logger.LogFactory",
      "org.apache.axis.strategies.WSDLGenStrategy",
      "org.apache.log4j.spi.ErrorHandler",
      "org.apache.log4j.spi.VectorWriter",
      "com.browsersoft.openhre.hl7.api.parse.HL7ParserHandler",
      "org.apache.commons.discovery.tools.ManagedProperties$Value",
      "org.apache.commons.discovery.tools.SPInterface",
      "org.apache.log4j.spi.RendererSupport",
      "org.apache.axis.encoding.TypeMappingImpl",
      "org.apache.axis.message.Detail",
      "com.browsersoft.openhre.hl7.impl.regular.ExpressionElementMapperImpl",
      "org.apache.commons.discovery.ResourceClass",
      "com.browsersoft.openhre.hl7.api.config.HL7Table",
      "org.apache.axis.wsdl.fromJava.Namespaces",
      "org.apache.commons.discovery.ResourceIterator",
      "org.apache.axis.encoding.Target",
      "com.browsersoft.openhre.hl7.api.parse.ParserException",
      "com.browsersoft.openhre.hl7.impl.config.HL7FieldListImpl",
      "org.apache.axis.HandlerIterationStrategy",
      "org.apache.axis.encoding.TypeMappingDelegate",
      "org.apache.commons.discovery.Resource",
      "org.apache.axis.message.RPCHandler",
      "org.apache.axis.message.Text",
      "org.apache.log4j.Logger",
      "org.apache.axis.wsdl.fromJava.Types$2",
      "com.browsersoft.openhre.hl7.api.config.HL7Field",
      "org.apache.axis.client.AxisClient",
      "com.browsersoft.openhre.hl7.api.config.HL7Configuration",
      "org.apache.axis.wsdl.fromJava.Types$1",
      "org.apache.axis.wsdl.symbolTable.PortEntry",
      "org.apache.axis.Chain",
      "org.apache.log4j.helpers.LogLog",
      "org.apache.axis.wsdl.symbolTable.Element",
      "com.browsersoft.openhre.hl7.impl.regular.MessageTracerImpl",
      "org.apache.axis.wsdl.symbolTable.MimeInfo",
      "com.browsersoft.openhre.hl7.impl.config.HL7MessageSegmentImpl",
      "org.apache.log4j.spi.RepositorySelector",
      "org.apache.axis.message.SOAPHeader",
      "org.apache.axis.TargetedChain",
      "org.apache.axis.message.EnvelopeHandler",
      "com.browsersoft.openhre.hl7.api.parse.HL7Checker",
      "org.apache.axis.AxisEngine",
      "com.browsersoft.openhre.hl7.impl.config.HL7MessageGroupImpl",
      "org.apache.log4j.or.DefaultRenderer",
      "org.apache.commons.discovery.log.DiscoveryLogFactory",
      "org.apache.axis.encoding.DeserializationContext",
      "org.apache.axis.Part",
      "org.apache.axis.message.SOAPFaultReasonBuilder",
      "org.apache.axis.encoding.DeserializationContext$1",
      "com.browsersoft.openhre.hl7.api.config.InvalidConfigDataStructureException",
      "org.apache.axis.AxisProperties",
      "org.apache.axis.message.SAX2EventRecorder",
      "org.apache.log4j.PropertyConfigurator",
      "org.apache.commons.discovery.resource.names.DiscoverMappedNames",
      "org.apache.commons.logging.impl.Log4JLogger",
      "org.apache.axis.Message",
      "com.browsersoft.openhre.hl7.api.parse.HL7Parser",
      "org.apache.log4j.Appender",
      "org.apache.axis.encoding.TypeMapping",
      "org.apache.axis.utils.Mapping",
      "org.apache.axis.attachments.IncomingAttachmentStreams$IncomingAttachmentInputStream",
      "org.apache.log4j.spi.HierarchyEventListener",
      "com.browsersoft.openhre.hl7.api.config.HL7TableMap",
      "org.apache.commons.discovery.jdk.PsuedoSystemClassLoader",
      "org.apache.axis.Constants",
      "org.apache.axis.wsdl.symbolTable.UndefinedType",
      "org.apache.axis.message.SOAPHandler",
      "org.apache.log4j.spi.LoggingEvent",
      "org.apache.axis.wsdl.symbolTable.DefinedElement",
      "org.apache.log4j.spi.ThrowableInformation",
      "org.apache.axis.wsdl.symbolTable.Parameters",
      "com.browsersoft.openhre.hl7.api.config.HL7MessageGroupItem",
      "org.apache.log4j.spi.LoggerRepository",
      "com.browsersoft.openhre.hl7.api.parse.HL7CheckerState"
    );
  } 

  private static void resetClasses() {
    org.evosuite.runtime.classhandling.ClassResetter.getInstance().setClassLoader(ExpressionMatrixImpl_ESTest_scaffolding.class.getClassLoader()); 

    org.evosuite.runtime.classhandling.ClassStateSupport.resetClasses(
      "com.browsersoft.openhre.hl7.impl.regular.ExpressionMatrixImpl",
      "com.browsersoft.openhre.hl7.impl.regular.ExpressionElementMapperImpl",
      "com.browsersoft.openhre.hl7.impl.regular.MessageTracerImpl",
      "com.browsersoft.openhre.hl7.impl.regular.ExpressionElementMapperItemImpl",
      "com.browsersoft.openhre.hl7.impl.regular.ExpressionImpl",
      "com.browsersoft.openhre.hl7.impl.config.HL7MessageImpl",
      "com.browsersoft.openhre.hl7.impl.parser.HL7SAXEventGeneratorImpl",
      "com.browsersoft.openhre.hl7.impl.parser.HL7CheckerImpl",
      "com.browsersoft.openhre.hl7.impl.parser.HL7ParserImpl",
      "com.browsersoft.openhre.hl7.impl.parser.HL7CheckerStateImpl",
      "com.browsersoft.openhre.hl7.impl.parser.HL72XMLImpl",
      "com.browsersoft.openhre.hl7.impl.parser.XMLUtils",
      "com.browsersoft.openhre.hl7.impl.config.HL7SegmentMapImpl",
      "com.browsersoft.openhre.hl7.impl.config.HL7MessageGroupItemImpl",
      "com.browsersoft.openhre.hl7.impl.config.HL7MessageSegmentImpl",
      "com.browsersoft.openhre.hl7.impl.config.HL7MessageGroupImpl",
      "com.browsersoft.openhre.hl7.impl.regular.ExpressionPartImpl",
      "com.browsersoft.openhre.hl7.impl.config.HL7SegmentImpl",
      "com.browsersoft.openhre.hl7.impl.config.HL7FieldListImpl",
      "org.apache.axis.components.logger.LogFactory$1",
      "org.apache.axis.components.logger.LogFactory",
      "org.apache.log4j.Level",
      "org.apache.log4j.Priority",
      "org.apache.commons.logging.impl.Log4JLogger",
      "org.apache.log4j.Category",
      "org.apache.log4j.Logger",
      "org.apache.log4j.Hierarchy",
      "org.apache.log4j.spi.RootCategory",
      "org.apache.log4j.or.DefaultRenderer",
      "org.apache.log4j.or.RendererMap",
      "org.apache.log4j.DefaultCategoryFactory",
      "org.apache.log4j.spi.DefaultRepositorySelector",
      "org.apache.log4j.helpers.OptionConverter",
      "org.apache.log4j.helpers.Loader",
      "org.apache.log4j.helpers.LogLog",
      "org.apache.log4j.PropertyConfigurator",
      "org.apache.log4j.LogManager",
      "org.apache.log4j.CategoryKey",
      "org.apache.log4j.ProvisionNode",
      "org.apache.axis.handlers.BasicHandler",
      "org.apache.axis.AxisEngine",
      "org.apache.axis.AxisProperties",
      "org.apache.commons.discovery.tools.ManagedProperties",
      "org.apache.commons.discovery.jdk.JDK12Hooks",
      "org.apache.commons.discovery.jdk.JDKHooks",
      "org.apache.commons.discovery.tools.ManagedProperties$1",
      "org.apache.axis.MessageContext",
      "org.apache.axis.schema.SchemaVersion1999",
      "org.apache.axis.schema.SchemaVersion2000",
      "org.apache.axis.schema.SchemaVersion2001",
      "org.apache.axis.schema.SchemaVersion",
      "org.apache.axis.message.SOAPHandler",
      "org.apache.axis.encoding.DeserializationContext$NullLexicalHandler",
      "org.apache.axis.encoding.DeserializationContext",
      "org.apache.axis.utils.NSStack",
      "org.apache.axis.message.EnvelopeBuilder",
      "org.apache.axis.soap.SOAP11Constants",
      "org.apache.axis.soap.SOAP12Constants",
      "org.apache.axis.soap.SOAPConstants",
      "org.apache.axis.message.NodeImpl",
      "org.apache.axis.utils.Mapping",
      "org.apache.axis.message.MessageElement",
      "org.apache.axis.message.SOAPEnvelope",
      "org.apache.axis.Constants",
      "org.apache.axis.message.NullAttributes",
      "org.apache.axis.message.SOAPHeader",
      "org.apache.axis.message.SOAPBody",
      "org.apache.axis.message.SAX2EventRecorder",
      "org.apache.axis.message.SAX2EventRecorder$objArrayVector",
      "org.apache.axis.message.EnvelopeHandler",
      "com.browsersoft.openhre.hl7.impl.config.HL7MessageMapImpl"
    );
  }
}
