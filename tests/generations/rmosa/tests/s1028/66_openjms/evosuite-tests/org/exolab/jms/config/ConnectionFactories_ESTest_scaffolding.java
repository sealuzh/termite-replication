/**
 * Scaffolding file used to store all the setups needed to run 
 * tests automatically generated by EvoSuite
 * Mon Nov 09 20:20:47 GMT 2020
 */

package org.exolab.jms.config;

import org.evosuite.runtime.annotation.EvoSuiteClassExclude;
import org.junit.BeforeClass;
import org.junit.Before;
import org.junit.After;
import org.junit.AfterClass;
import org.evosuite.runtime.sandbox.Sandbox;
import org.evosuite.runtime.sandbox.Sandbox.SandboxMode;

@EvoSuiteClassExclude
public class ConnectionFactories_ESTest_scaffolding {

  @org.junit.Rule 
  public org.evosuite.runtime.vnet.NonFunctionalRequirementRule nfr = new org.evosuite.runtime.vnet.NonFunctionalRequirementRule();

  private static final java.util.Properties defaultProperties = (java.util.Properties) java.lang.System.getProperties().clone(); 

  private org.evosuite.runtime.thread.ThreadStopper threadStopper =  new org.evosuite.runtime.thread.ThreadStopper (org.evosuite.runtime.thread.KillSwitchHandler.getInstance(), 3000);


  @BeforeClass 
  public static void initEvoSuiteFramework() { 
    org.evosuite.runtime.RuntimeSettings.className = "org.exolab.jms.config.ConnectionFactories"; 
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
    java.lang.System.setProperty("user.dir", "/home/ubuntu/replication/scripts/projects/66_openjms"); 
    java.lang.System.setProperty("user.home", "/home/ubuntu"); 
    java.lang.System.setProperty("user.language", "en"); 
    java.lang.System.setProperty("user.name", "ubuntu"); 
    java.lang.System.setProperty("user.timezone", "Etc/UTC"); 
  }

  private static void initializeClasses() {
    org.evosuite.runtime.classhandling.ClassStateSupport.initializeClasses(ConnectionFactories_ESTest_scaffolding.class.getClassLoader() ,
      "org.exolab.castor.mapping.AccessMode",
      "org.exolab.castor.mapping.xml.Include",
      "org.exolab.jms.config.XATopicConnectionFactory",
      "org.exolab.castor.util.Configuration$ConfigValues",
      "org.exolab.jms.config.XAConnectionFactoryDescriptor",
      "org.exolab.jms.config.ConnectionFactories",
      "org.exolab.castor.util.Stack$StackIterator",
      "org.exolab.castor.xml.UnmarshalHandler$IDResolverImpl",
      "org.exolab.castor.mapping.TypeConvertor",
      "org.exolab.castor.xml.TypeValidator",
      "org.apache.xml.serialize.BaseMarkupSerializer",
      "org.exolab.castor.mapping.xml.types.BindXmlNodeType",
      "org.exolab.castor.xml.FileLocation",
      "org.exolab.castor.xml.ValidationContext",
      "org.exolab.castor.mapping.ExtendedFieldHandler",
      "org.exolab.castor.mapping.FieldHandler",
      "org.exolab.castor.mapping.AbstractFieldHandler",
      "org.apache.xml.serialize.Printer",
      "org.exolab.castor.xml.XMLMappingLoader",
      "org.exolab.castor.xml.MarshalListener",
      "org.exolab.castor.mapping.MappingResolver",
      "org.exolab.castor.xml.Location",
      "org.exolab.castor.util.DefaultObjectFactory",
      "org.exolab.castor.xml.util.DefaultNaming",
      "org.exolab.castor.xml.MarshalFramework",
      "org.exolab.castor.xml.FieldValidator",
      "org.exolab.jms.config.XAConnectionFactory",
      "org.exolab.castor.mapping.loader.TypeInfo",
      "org.exolab.castor.xml.CastorException",
      "org.exolab.castor.util.Stack$1",
      "org.exolab.castor.xml.UnmarshalListener",
      "org.exolab.castor.mapping.xml.types.BindXmlAutoNamingType",
      "org.apache.xml.serialize.Serializer",
      "org.exolab.jms.config.ConnectionFactoriesDescriptor",
      "org.exolab.castor.mapping.xml.CacheTypeMapping",
      "org.exolab.castor.mapping.Mapping$EngineMapping",
      "org.exolab.castor.mapping.MappingException",
      "org.exolab.castor.mapping.xml.KeyGeneratorDef",
      "org.exolab.castor.mapping.xml.Ldap",
      "org.exolab.castor.xml.Namespaces$Namespace",
      "org.exolab.castor.mapping.ClassDescriptor",
      "org.exolab.castor.util.List",
      "org.exolab.castor.mapping.loader.CollectionHandlers",
      "org.exolab.castor.xml.util.XMLFieldDescriptorImpl",
      "org.exolab.jms.config.ConnectionFactoryTypeDescriptor$1",
      "org.exolab.castor.xml.ClassValidator",
      "org.exolab.castor.mapping.loader.J1CollectionHandlers$ArrayEnumerator",
      "org.exolab.castor.util.Configuration",
      "org.exolab.jms.config.QueueConnectionFactory",
      "org.exolab.castor.xml.XMLClassDescriptor",
      "org.exolab.castor.mapping.xml.MapTo",
      "org.exolab.castor.mapping.xml.types.AccessType",
      "org.exolab.castor.mapping.loader.CollectionHandlers$EmptyEnumerator",
      "org.exolab.castor.xml.util.XMLClassDescriptorImpl",
      "org.exolab.castor.xml.Namespaces$NamespaceEnumerator",
      "org.exolab.castor.mapping.loader.FieldHandlerImpl",
      "org.exolab.castor.xml.Marshaller",
      "org.exolab.castor.xml.XMLNaming",
      "org.exolab.castor.util.Stack$StackItem",
      "org.exolab.castor.mapping.loader.MappingLoader",
      "org.exolab.castor.xml.util.XMLClassDescriptorAdapter",
      "org.exolab.castor.xml.NodeType",
      "org.exolab.castor.mapping.loader.J1CollectionHandlers",
      "org.apache.xml.serialize.DOMSerializer",
      "org.exolab.castor.mapping.ValidityException",
      "org.exolab.castor.xml.MarshalFramework$InheritanceMatch",
      "org.exolab.castor.mapping.MappingRuntimeException",
      "org.exolab.castor.xml.UnmarshalHandler$ArrayHandler",
      "org.exolab.castor.xml.UnmarshalHandler$ReferenceInfo",
      "org.exolab.castor.xml.util.AttributeSetImpl",
      "org.exolab.jms.config.QueueConnectionFactoryDescriptor",
      "org.exolab.castor.mapping.loader.CollectionHandlers$Info",
      "org.exolab.castor.mapping.loader.ClassDescriptorImpl",
      "org.exolab.castor.mapping.loader.J1CollectionHandlers$4",
      "org.exolab.jms.config.XATopicConnectionFactoryDescriptor",
      "org.exolab.jms.config.TopicConnectionFactoryDescriptor",
      "org.exolab.castor.xml.XMLMappingLoader$ContainerElementFieldDescriptor",
      "org.exolab.castor.mapping.xml.Container",
      "org.exolab.castor.xml.Validator",
      "org.exolab.castor.mapping.FieldDescriptor",
      "org.exolab.castor.xml.validators.PatternValidator",
      "org.exolab.castor.util.LocalConfiguration",
      "org.exolab.castor.xml.descriptors.StringClassDescriptor",
      "org.exolab.castor.mapping.xml.types.TypeType",
      "org.exolab.castor.mapping.xml.Param",
      "org.exolab.castor.xml.ClassDescriptorEnumeration",
      "org.exolab.castor.xml.XMLFieldDescriptor",
      "org.exolab.jms.config.XAQueueConnectionFactoryDescriptor",
      "org.exolab.castor.xml.UnmarshalHandler$Arguments",
      "org.exolab.castor.mapping.loader.J2CollectionHandlers$3",
      "org.exolab.castor.mapping.Mapping",
      "org.exolab.castor.xml.Introspector",
      "org.exolab.castor.util.ObjectFactory",
      "org.exolab.castor.mapping.loader.J2CollectionHandlers$4",
      "org.exolab.castor.mapping.loader.J2CollectionHandlers$1",
      "org.exolab.castor.mapping.loader.J2CollectionHandlers$2",
      "org.exolab.castor.xml.EventProducer",
      "org.exolab.castor.mapping.xml.types.CollectionType",
      "org.exolab.jms.config.ConnectionFactoriesDescriptor$2",
      "org.exolab.castor.mapping.xml.ClassMapping",
      "org.exolab.jms.config.ConnectionFactoriesDescriptor$3",
      "org.exolab.jms.config.ConnectionFactoriesDescriptor$4",
      "org.exolab.jms.config.ConnectionFactoriesDescriptor$5",
      "org.exolab.castor.mapping.xml.types.DirtyType",
      "org.exolab.jms.config.ConnectionFactoriesDescriptor$1",
      "org.exolab.castor.types.AnyNode",
      "org.exolab.jms.config.ConnectionFactoriesDescriptor$6",
      "org.exolab.castor.xml.IDResolver",
      "org.exolab.castor.mapping.loader.J1CollectionHandlers$1",
      "org.exolab.castor.mapping.loader.J1CollectionHandlers$3",
      "org.exolab.castor.xml.ClassDescriptorResolver",
      "org.exolab.castor.mapping.loader.J1CollectionHandlers$2",
      "org.exolab.castor.util.MimeBase64Encoder",
      "org.exolab.castor.mapping.loader.MappingLoader$TypeInfoReference",
      "org.exolab.castor.xml.UnmarshalHandler",
      "org.apache.xml.serialize.Encodings",
      "org.exolab.castor.xml.Namespaces",
      "org.exolab.castor.util.Stack",
      "org.exolab.castor.mapping.CollectionHandler",
      "org.apache.xml.serialize.IndentPrinter",
      "org.exolab.castor.xml.XMLFieldHandler",
      "org.exolab.castor.xml.XPathLocation",
      "org.exolab.castor.types.OperationNotSupportedException",
      "org.apache.xml.serialize.ElementState",
      "org.apache.xml.serialize.EncodingInfo",
      "org.exolab.castor.mapping.xml.BindXml",
      "org.exolab.castor.xml.validators.StringValidator",
      "org.exolab.castor.xml.ValidationException",
      "org.exolab.castor.xml.XMLException",
      "org.exolab.castor.xml.MarshalException",
      "org.exolab.castor.mapping.xml.MappingRoot",
      "org.exolab.jms.config.ConnectionFactory",
      "org.exolab.castor.mapping.xml.Sql",
      "org.exolab.jms.config.TopicConnectionFactory",
      "org.exolab.castor.util.IteratorEnumeration",
      "org.exolab.castor.xml.util.AttributeSetImpl$Attribute",
      "org.exolab.castor.mapping.loader.FieldHandlerFriend",
      "org.exolab.castor.xml.IntrospectedXMLClassDescriptor",
      "org.apache.xml.serialize.OutputFormat",
      "org.exolab.castor.util.NestedIOException",
      "org.exolab.jms.config.ConnectionFactoryTypeDescriptor",
      "org.exolab.castor.xml.Unmarshaller",
      "org.exolab.castor.xml.MarshalFramework$InternalXMLClassDescriptor",
      "org.exolab.jms.config.XAQueueConnectionFactory",
      "org.exolab.castor.mapping.xml.FieldMapping",
      "org.exolab.castor.xml.AttributeSet",
      "org.apache.xml.serialize.XMLSerializer",
      "org.exolab.castor.util.Iterator",
      "org.exolab.jms.config.ConnectionFactoryDescriptor",
      "org.exolab.castor.mapping.loader.J2CollectionHandlers",
      "org.exolab.castor.util.RegExpEvaluator",
      "org.exolab.castor.xml.util.ClassDescriptorResolverImpl",
      "org.exolab.jms.config.ConnectionFactoryType",
      "org.exolab.castor.xml.util.XMLFieldDescriptors"
    );
  } 

  private static void resetClasses() {
    org.evosuite.runtime.classhandling.ClassResetter.getInstance().setClassLoader(ConnectionFactories_ESTest_scaffolding.class.getClassLoader()); 

    org.evosuite.runtime.classhandling.ClassStateSupport.resetClasses(
      "org.exolab.jms.config.ConnectionFactories",
      "org.exolab.castor.xml.MarshalFramework",
      "org.exolab.castor.xml.descriptors.StringClassDescriptor",
      "org.exolab.castor.xml.Marshaller",
      "org.exolab.jms.config.ConnectionFactoryType",
      "org.exolab.jms.config.QueueConnectionFactory",
      "org.exolab.castor.xml.Unmarshaller",
      "org.exolab.castor.util.Configuration$ConfigValues",
      "org.exolab.castor.util.Configuration",
      "org.exolab.castor.util.LocalConfiguration",
      "org.exolab.castor.xml.util.ClassDescriptorResolverImpl",
      "org.exolab.castor.xml.Introspector",
      "org.exolab.castor.xml.XMLNaming",
      "org.exolab.castor.xml.util.DefaultNaming",
      "org.exolab.castor.xml.NodeType",
      "org.exolab.castor.xml.UnmarshalHandler",
      "org.exolab.castor.util.DefaultObjectFactory",
      "org.exolab.castor.xml.UnmarshalHandler$IDResolverImpl",
      "org.exolab.castor.xml.Namespaces",
      "org.exolab.castor.xml.CastorException",
      "org.exolab.castor.xml.XMLException",
      "org.exolab.castor.xml.MarshalException",
      "org.exolab.castor.xml.FileLocation",
      "org.exolab.jms.config.ConnectionFactory",
      "org.exolab.castor.util.NestedIOException",
      "org.exolab.jms.config.XATopicConnectionFactory",
      "org.exolab.jms.config.TopicConnectionFactory",
      "org.exolab.castor.xml.Validator",
      "org.exolab.castor.xml.ValidationContext",
      "org.exolab.castor.xml.util.XMLClassDescriptorImpl",
      "org.exolab.jms.config.ConnectionFactoriesDescriptor",
      "org.exolab.castor.xml.util.XMLFieldDescriptors",
      "org.exolab.castor.xml.util.XMLFieldDescriptorImpl",
      "org.exolab.castor.types.AnyNode",
      "org.exolab.castor.xml.XMLFieldHandler",
      "org.exolab.jms.config.ConnectionFactoriesDescriptor$1",
      "org.exolab.castor.xml.FieldValidator",
      "org.exolab.jms.config.ConnectionFactoriesDescriptor$2",
      "org.exolab.jms.config.ConnectionFactoriesDescriptor$3",
      "org.exolab.jms.config.ConnectionFactoriesDescriptor$4",
      "org.exolab.jms.config.ConnectionFactoriesDescriptor$5",
      "org.exolab.jms.config.ConnectionFactoriesDescriptor$6",
      "org.exolab.castor.util.IteratorEnumeration",
      "org.exolab.jms.config.ConnectionFactoryTypeDescriptor",
      "org.exolab.jms.config.XATopicConnectionFactoryDescriptor",
      "org.exolab.jms.config.ConnectionFactoryTypeDescriptor$1",
      "org.exolab.castor.xml.validators.PatternValidator",
      "org.exolab.castor.xml.validators.StringValidator",
      "org.exolab.castor.xml.ValidationException",
      "org.exolab.castor.xml.XPathLocation",
      "org.exolab.jms.config.XAConnectionFactory",
      "org.exolab.jms.config.XAQueueConnectionFactory",
      "org.exolab.jms.config.XAQueueConnectionFactoryDescriptor",
      "org.exolab.castor.util.List",
      "org.exolab.castor.util.Stack",
      "org.exolab.castor.xml.util.AttributeSetImpl",
      "org.apache.xml.serialize.BaseMarkupSerializer",
      "org.apache.xml.serialize.XMLSerializer",
      "org.apache.xml.serialize.OutputFormat",
      "org.apache.xml.serialize.ElementState",
      "org.apache.xml.serialize.Encodings",
      "org.apache.xml.serialize.EncodingInfo",
      "org.apache.xml.serialize.Printer",
      "org.exolab.jms.config.QueueConnectionFactoryDescriptor",
      "org.exolab.jms.config.XAConnectionFactoryDescriptor",
      "org.exolab.castor.util.Stack$StackItem",
      "org.exolab.castor.xml.MarshalFramework$InternalXMLClassDescriptor",
      "org.exolab.castor.xml.Namespaces$Namespace",
      "org.exolab.castor.mapping.loader.CollectionHandlers",
      "org.exolab.castor.mapping.loader.CollectionHandlers$Info",
      "org.exolab.castor.mapping.loader.J1CollectionHandlers$1",
      "org.exolab.castor.mapping.loader.J1CollectionHandlers$2",
      "org.exolab.castor.mapping.loader.J1CollectionHandlers$3",
      "org.exolab.castor.mapping.loader.J1CollectionHandlers$4",
      "org.exolab.castor.mapping.loader.J1CollectionHandlers",
      "org.exolab.castor.mapping.loader.J2CollectionHandlers$1",
      "org.exolab.castor.mapping.loader.J2CollectionHandlers$2",
      "org.exolab.castor.mapping.loader.J2CollectionHandlers$3",
      "org.exolab.castor.mapping.loader.J2CollectionHandlers$4",
      "org.exolab.castor.mapping.loader.J2CollectionHandlers",
      "org.exolab.castor.mapping.loader.J1CollectionHandlers$ArrayEnumerator",
      "org.exolab.jms.config.ConnectionFactoryDescriptor",
      "org.exolab.jms.config.TopicConnectionFactoryDescriptor"
    );
  }
}
