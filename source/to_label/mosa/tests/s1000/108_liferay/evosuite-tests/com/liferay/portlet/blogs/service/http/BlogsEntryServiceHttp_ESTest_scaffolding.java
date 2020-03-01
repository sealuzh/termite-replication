/**
 * Scaffolding file used to store all the setups needed to run 
 * tests automatically generated by EvoSuite
 * Tue Aug 07 14:32:11 GMT 2018
 */

package com.liferay.portlet.blogs.service.http;

import org.evosuite.runtime.annotation.EvoSuiteClassExclude;
import org.junit.BeforeClass;
import org.junit.Before;
import org.junit.After;
import org.junit.AfterClass;
import org.evosuite.runtime.sandbox.Sandbox;
import org.evosuite.runtime.sandbox.Sandbox.SandboxMode;

@EvoSuiteClassExclude
public class BlogsEntryServiceHttp_ESTest_scaffolding {

  @org.junit.Rule 
  public org.evosuite.runtime.vnet.NonFunctionalRequirementRule nfr = new org.evosuite.runtime.vnet.NonFunctionalRequirementRule();

  private static final java.util.Properties defaultProperties = (java.util.Properties) java.lang.System.getProperties().clone(); 

  private org.evosuite.runtime.thread.ThreadStopper threadStopper =  new org.evosuite.runtime.thread.ThreadStopper (org.evosuite.runtime.thread.KillSwitchHandler.getInstance(), 3000);


  @BeforeClass 
  public static void initEvoSuiteFramework() { 
    org.evosuite.runtime.RuntimeSettings.className = "com.liferay.portlet.blogs.service.http.BlogsEntryServiceHttp"; 
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
    java.lang.System.setProperty("user.country", "US"); 
    java.lang.System.setProperty("user.dir", "/home/ubuntu/evosuite_readability_gen/projects/108_liferay"); 
    java.lang.System.setProperty("user.home", "/home/ubuntu"); 
    java.lang.System.setProperty("user.language", "en"); 
    java.lang.System.setProperty("user.name", "ubuntu"); 
    java.lang.System.setProperty("user.timezone", "Etc/UTC"); 
    java.lang.System.setProperty("log4j.configuration", "SUT.log4j.properties"); 
  }

  private static void initializeClasses() {
    org.evosuite.runtime.classhandling.ClassStateSupport.initializeClasses(BlogsEntryServiceHttp_ESTest_scaffolding.class.getClassLoader() ,
      "com.liferay.portal.kernel.log.LogFactoryUtil",
      "com.liferay.portlet.blogs.model.BlogsEntryModel",
      "com.liferay.portal.service.ServiceContext",
      "com.liferay.portal.kernel.exception.NestableException",
      "com.liferay.portal.model.GroupedModel",
      "com.liferay.portal.kernel.util.Mergeable",
      "com.liferay.portal.model.WorkflowedModel",
      "com.liferay.portal.model.ClassedModel",
      "com.liferay.portal.kernel.log.Log",
      "com.liferay.portal.theme.ThemeDisplay",
      "com.liferay.portal.kernel.log.Jdk14LogImpl",
      "com.liferay.portal.kernel.exception.PortalException",
      "com.liferay.portlet.blogs.model.BlogsEntry",
      "com.liferay.portal.kernel.exception.SystemException",
      "com.liferay.portal.kernel.log.LogFactory",
      "com.liferay.portal.kernel.log.Jdk14LogFactoryImpl",
      "com.liferay.portal.model.AuditedModel",
      "com.liferay.portal.security.auth.HttpPrincipal",
      "com.liferay.portal.model.PersistedModel",
      "com.liferay.portal.kernel.log.LogWrapper",
      "com.liferay.portlet.blogs.service.http.BlogsEntryServiceHttp",
      "com.liferay.portal.model.BaseModel"
    );
  } 

  private static void resetClasses() {
    org.evosuite.runtime.classhandling.ClassResetter.getInstance().setClassLoader(BlogsEntryServiceHttp_ESTest_scaffolding.class.getClassLoader()); 

    org.evosuite.runtime.classhandling.ClassStateSupport.resetClasses(
      "com.liferay.portal.kernel.log.Jdk14LogFactoryImpl",
      "com.liferay.portal.kernel.log.LogFactoryUtil",
      "com.liferay.portal.kernel.log.LogWrapper",
      "com.liferay.portal.kernel.log.Jdk14LogImpl",
      "com.liferay.portlet.blogs.service.http.BlogsEntryServiceHttp",
      "com.liferay.portal.kernel.util.PropsUtil",
      "com.liferay.portal.kernel.util.GetterUtil",
      "com.liferay.portal.kernel.security.pacl.permission.PortalRuntimePermission",
      "com.liferay.portal.service.http.TunnelUtil",
      "com.liferay.portal.kernel.jsonwebservice.JSONWebServiceMode",
      "com.liferay.portal.kernel.transaction.Isolation",
      "com.liferay.portal.kernel.transaction.Propagation",
      "org.springframework.transaction.annotation.Isolation",
      "org.springframework.transaction.annotation.Propagation",
      "com.liferay.portal.security.auth.HttpPrincipal",
      "com.liferay.portal.kernel.util.ServerDetector",
      "com.liferay.portal.kernel.util.SystemEnv",
      "com.liferay.portal.kernel.util.PropertiesUtil",
      "com.liferay.portal.kernel.util.SystemProperties",
      "com.liferay.portal.kernel.util.StringUtil",
      "com.liferay.portal.kernel.util.ClassUtil",
      "com.liferay.portal.kernel.util.StringBundler",
      "com.liferay.portal.kernel.servlet.WebDirDetector",
      "com.liferay.portal.configuration.ConfigurationImpl",
      "org.apache.log4j.Level",
      "org.apache.log4j.Priority",
      "org.apache.commons.logging.impl.Log4JLogger",
      "org.apache.log4j.Category",
      "org.apache.log4j.Logger",
      "org.apache.log4j.Hierarchy",
      "org.apache.log4j.spi.RootLogger",
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
      "com.germinus.easyconf.ComponentConfiguration",
      "com.liferay.portal.configuration.easyconf.ClassLoaderComponentConfiguration",
      "com.germinus.easyconf.ConfigurationSerializer",
      "com.thoughtworks.xstream.XStream",
      "com.thoughtworks.xstream.io.AbstractDriver",
      "com.thoughtworks.xstream.io.xml.AbstractXmlDriver",
      "com.thoughtworks.xstream.io.xml.AbstractXppDriver",
      "com.thoughtworks.xstream.io.xml.XppDriver",
      "com.thoughtworks.xstream.io.xml.XmlFriendlyNameCoder$1IntPairList",
      "com.thoughtworks.xstream.io.xml.XmlFriendlyNameCoder$IntPair",
      "com.thoughtworks.xstream.io.xml.XmlFriendlyNameCoder",
      "com.thoughtworks.xstream.core.util.WeakCache",
      "com.thoughtworks.xstream.core.util.ClassLoaderReference",
      "com.thoughtworks.xstream.core.util.CompositeClassLoader",
      "com.thoughtworks.xstream.core.DefaultConverterLookup",
      "com.thoughtworks.xstream.core.util.PrioritizedList",
      "com.thoughtworks.xstream.core.JVM$1",
      "com.thoughtworks.xstream.core.util.PresortedMap",
      "com.thoughtworks.xstream.core.util.PresortedMap$ArraySet",
      "com.thoughtworks.xstream.core.util.PresortedMap$1",
      "com.thoughtworks.xstream.core.util.PresortedSet",
      "com.thoughtworks.xstream.core.JVM",
      "com.thoughtworks.xstream.converters.reflection.PureJavaReflectionProvider",
      "com.thoughtworks.xstream.converters.reflection.Sun14ReflectionProvider",
      "com.thoughtworks.xstream.converters.reflection.FieldDictionary",
      "com.thoughtworks.xstream.converters.reflection.ImmutableFieldKeySorter",
      "com.thoughtworks.xstream.mapper.DefaultMapper",
      "com.thoughtworks.xstream.mapper.MapperWrapper",
      "com.thoughtworks.xstream.mapper.DynamicProxyMapper",
      "com.thoughtworks.xstream.mapper.PackageAliasingMapper$1",
      "com.thoughtworks.xstream.mapper.PackageAliasingMapper",
      "com.thoughtworks.xstream.mapper.ClassAliasingMapper",
      "com.thoughtworks.xstream.mapper.FieldAliasingMapper",
      "com.thoughtworks.xstream.mapper.AbstractAttributeAliasingMapper",
      "com.thoughtworks.xstream.mapper.AttributeAliasingMapper",
      "com.thoughtworks.xstream.mapper.SystemAttributeAliasingMapper",
      "com.thoughtworks.xstream.mapper.ImplicitCollectionMapper",
      "com.thoughtworks.xstream.mapper.OuterClassMapper",
      "com.thoughtworks.xstream.mapper.ArrayMapper",
      "com.thoughtworks.xstream.mapper.DefaultImplementationsMapper",
      "com.thoughtworks.xstream.mapper.AttributeMapper",
      "com.thoughtworks.xstream.core.util.CompositeClassLoader$1",
      "com.thoughtworks.xstream.mapper.EnumMapper",
      "com.thoughtworks.xstream.mapper.LocalConversionMapper",
      "com.thoughtworks.xstream.mapper.ImmutableTypesMapper",
      "com.thoughtworks.xstream.mapper.AnnotationMapper",
      "com.thoughtworks.xstream.mapper.CachingMapper",
      "com.thoughtworks.xstream.converters.reflection.AbstractReflectionConverter",
      "com.thoughtworks.xstream.converters.reflection.ReflectionConverter",
      "com.thoughtworks.xstream.converters.reflection.SerializationMethodInvoker$1",
      "com.thoughtworks.xstream.core.util.FastField",
      "com.thoughtworks.xstream.converters.reflection.SerializationMethodInvoker",
      "com.thoughtworks.xstream.core.util.PrioritizedList$PrioritizedItem",
      "com.thoughtworks.xstream.converters.reflection.SerializableConverter",
      "com.thoughtworks.xstream.converters.reflection.ReflectionProviderWrapper",
      "com.thoughtworks.xstream.converters.reflection.SerializableConverter$UnserializableParentsReflectionProvider",
      "com.thoughtworks.xstream.converters.reflection.ExternalizableConverter",
      "com.thoughtworks.xstream.converters.basic.NullConverter",
      "com.thoughtworks.xstream.converters.basic.AbstractSingleValueConverter",
      "com.thoughtworks.xstream.converters.basic.IntConverter",
      "com.thoughtworks.xstream.converters.SingleValueConverterWrapper",
      "com.thoughtworks.xstream.converters.basic.FloatConverter",
      "com.thoughtworks.xstream.converters.basic.DoubleConverter",
      "com.thoughtworks.xstream.converters.basic.LongConverter",
      "com.thoughtworks.xstream.converters.basic.ShortConverter",
      "com.thoughtworks.xstream.converters.basic.CharConverter",
      "com.thoughtworks.xstream.converters.basic.BooleanConverter",
      "com.thoughtworks.xstream.converters.basic.ByteConverter",
      "com.thoughtworks.xstream.converters.basic.StringConverter",
      "com.thoughtworks.xstream.converters.basic.StringBufferConverter",
      "com.thoughtworks.xstream.converters.basic.DateConverter",
      "com.thoughtworks.xstream.core.util.ThreadSafeSimpleDateFormat",
      "com.thoughtworks.xstream.core.util.Pool",
      "com.thoughtworks.xstream.core.util.ThreadSafeSimpleDateFormat$1",
      "com.thoughtworks.xstream.converters.collections.BitSetConverter",
      "com.thoughtworks.xstream.converters.basic.URIConverter",
      "com.thoughtworks.xstream.converters.basic.URLConverter",
      "com.thoughtworks.xstream.converters.basic.BigIntegerConverter",
      "com.thoughtworks.xstream.converters.basic.BigDecimalConverter",
      "com.thoughtworks.xstream.converters.collections.AbstractCollectionConverter",
      "com.thoughtworks.xstream.converters.collections.ArrayConverter",
      "com.thoughtworks.xstream.converters.collections.CharArrayConverter",
      "com.thoughtworks.xstream.converters.collections.CollectionConverter",
      "com.thoughtworks.xstream.converters.collections.MapConverter",
      "com.thoughtworks.xstream.mapper.Mapper$Null",
      "com.thoughtworks.xstream.converters.collections.TreeMapConverter$NullComparator",
      "com.thoughtworks.xstream.converters.collections.TreeMapConverter",
      "com.thoughtworks.xstream.converters.collections.TreeSetConverter",
      "com.thoughtworks.xstream.converters.collections.TreeSetConverter$1",
      "com.thoughtworks.xstream.converters.collections.SingletonCollectionConverter",
      "com.thoughtworks.xstream.converters.collections.SingletonMapConverter",
      "com.thoughtworks.xstream.core.util.Fields",
      "com.thoughtworks.xstream.converters.collections.PropertiesConverter",
      "com.thoughtworks.xstream.core.util.Base64Encoder",
      "com.thoughtworks.xstream.converters.extended.EncodedByteArrayConverter",
      "com.thoughtworks.xstream.converters.extended.FileConverter",
      "com.thoughtworks.xstream.converters.extended.SqlTimestampConverter",
      "com.thoughtworks.xstream.converters.extended.SqlTimeConverter",
      "com.thoughtworks.xstream.converters.extended.SqlDateConverter",
      "com.thoughtworks.xstream.converters.extended.DynamicProxyConverter$1",
      "com.thoughtworks.xstream.converters.extended.DynamicProxyConverter",
      "com.thoughtworks.xstream.converters.extended.JavaClassConverter",
      "com.thoughtworks.xstream.converters.extended.JavaMethodConverter",
      "com.thoughtworks.xstream.converters.extended.JavaFieldConverter",
      "com.thoughtworks.xstream.converters.extended.FontConverter",
      "com.thoughtworks.xstream.converters.extended.ColorConverter",
      "com.thoughtworks.xstream.converters.reflection.AbstractAttributedCharacterIteratorAttributeConverter",
      "com.thoughtworks.xstream.converters.extended.TextAttributeConverter",
      "com.thoughtworks.xstream.core.util.OrderRetainingMap",
      "com.thoughtworks.xstream.core.util.OrderRetainingMap$ArraySet",
      "com.thoughtworks.xstream.converters.reflection.FieldKey",
      "com.thoughtworks.xstream.converters.extended.LookAndFeelConverter",
      "com.thoughtworks.xstream.converters.extended.LocaleConverter",
      "com.thoughtworks.xstream.converters.extended.GregorianCalendarConverter",
      "com.thoughtworks.xstream.converters.extended.SubjectConverter",
      "com.thoughtworks.xstream.converters.extended.ThrowableConverter",
      "com.thoughtworks.xstream.converters.extended.StackTraceElementFactory",
      "com.thoughtworks.xstream.converters.extended.StackTraceElementConverter",
      "com.thoughtworks.xstream.converters.extended.CurrencyConverter",
      "com.thoughtworks.xstream.converters.extended.RegexPatternConverter",
      "com.thoughtworks.xstream.converters.extended.CharsetConverter",
      "com.thoughtworks.xstream.converters.extended.DurationConverter",
      "com.thoughtworks.xstream.converters.extended.DurationConverter$1",
      "com.thoughtworks.xstream.converters.enums.EnumConverter",
      "com.thoughtworks.xstream.converters.enums.EnumSetConverter",
      "com.thoughtworks.xstream.converters.enums.EnumMapConverter",
      "com.thoughtworks.xstream.converters.basic.StringBuilderConverter",
      "com.thoughtworks.xstream.converters.basic.UUIDConverter",
      "com.thoughtworks.xstream.converters.reflection.SelfStreamingInstanceChecker",
      "com.thoughtworks.xstream.core.AbstractTreeMarshallingStrategy",
      "com.thoughtworks.xstream.core.ReferenceByXPathMarshallingStrategy",
      "com.germinus.easyconf.XstreamSerializer",
      "com.germinus.easyconf.ConfigurationLoader",
      "org.apache.commons.configuration.event.EventSource",
      "org.apache.commons.configuration.AbstractConfiguration",
      "org.apache.commons.configuration.CompositeConfiguration",
      "com.germinus.easyconf.AggregatedProperties",
      "com.liferay.portal.configuration.easyconf.ClassLoaderAggregateProperties",
      "org.apache.commons.logging.impl.NoOpLog",
      "org.apache.commons.configuration.BaseConfiguration",
      "org.apache.commons.collections.map.AbstractHashedMap",
      "org.apache.commons.collections.map.AbstractLinkedMap",
      "org.apache.commons.collections.map.LinkedMap",
      "org.apache.commons.collections.map.AbstractHashedMap$HashEntry",
      "org.apache.commons.collections.map.AbstractLinkedMap$LinkEntry",
      "org.apache.commons.configuration.MapConfiguration",
      "org.apache.commons.configuration.SystemConfiguration",
      "org.apache.commons.configuration.SubsetConfiguration",
      "com.liferay.portal.kernel.util.CentralizedThreadLocal$ThreadLocalMapThreadLocal",
      "com.liferay.portal.kernel.util.CentralizedThreadLocal",
      "com.liferay.portal.kernel.util.InitialThreadLocal",
      "com.liferay.portal.kernel.util.AutoResetThreadLocal",
      "com.liferay.portal.security.lang.PortalSecurityManagerThreadLocal",
      "com.liferay.portal.kernel.util.CentralizedThreadLocal$ThreadLocalMap",
      "com.liferay.portal.kernel.util.CentralizedThreadLocal$Entry",
      "com.germinus.easyconf.DatasourceURL",
      "com.germinus.easyconf.JndiURL",
      "org.apache.commons.configuration.AbstractFileConfiguration",
      "org.apache.commons.configuration.PropertiesConfiguration",
      "org.apache.commons.configuration.reloading.InvariantReloadingStrategy",
      "org.apache.commons.configuration.AbstractConfiguration$2",
      "org.apache.commons.configuration.ConfigurationUtils",
      "org.apache.commons.lang.StringUtils",
      "org.apache.commons.lang.exception.NestableException",
      "org.apache.commons.configuration.ConfigurationException",
      "org.apache.commons.lang.exception.NestableDelegate",
      "org.apache.commons.configuration.PropertiesConfigurationLayout",
      "org.apache.commons.configuration.PropertiesConfiguration$PropertiesReader",
      "org.apache.commons.lang.ArrayUtils",
      "org.apache.commons.lang.StringEscapeUtils",
      "org.apache.commons.lang.text.StrBuilder",
      "org.apache.commons.configuration.PropertyConverter",
      "org.apache.commons.collections.iterators.SingletonIterator",
      "org.apache.commons.configuration.PropertiesConfigurationLayout$PropertyLayoutData",
      "org.apache.commons.collections.iterators.AbstractEmptyIterator",
      "org.apache.commons.collections.iterators.EmptyIterator",
      "org.apache.commons.collections.iterators.EmptyListIterator",
      "org.apache.commons.collections.iterators.EmptyOrderedIterator",
      "org.apache.commons.collections.iterators.EmptyMapIterator",
      "org.apache.commons.collections.iterators.EmptyOrderedMapIterator",
      "org.apache.commons.collections.IteratorUtils",
      "com.liferay.portal.kernel.util.ArrayUtil",
      "com.germinus.easyconf.ComponentProperties",
      "com.liferay.portal.util.PropsUtil",
      "com.liferay.portal.security.pwd.PwdEncryptor",
      "com.liferay.portal.kernel.util.DigesterUtil",
      "com.liferay.portal.kernel.util.MethodKey",
      "com.liferay.portal.kernel.util.MethodHandler",
      "com.liferay.portal.theme.ThemeDisplay",
      "com.liferay.portal.theme.PortletDisplay",
      "com.liferay.portal.model.UserWrapper",
      "com.liferay.portlet.blogs.service.BlogsEntryServiceUtil",
      "com.liferay.portal.kernel.bean.PortalBeanLocatorUtil",
      "com.liferay.portal.kernel.bean.BeanLocatorException",
      "com.liferay.portlet.mobiledevicerules.model.MDRRuleGroupInstanceWrapper",
      "com.liferay.portal.model.WorkflowInstanceLinkWrapper",
      "com.liferay.portal.model.PhoneWrapper",
      "com.liferay.portal.model.PortletItemWrapper",
      "com.liferay.portal.model.AddressWrapper",
      "com.liferay.portal.model.LayoutWrapper",
      "com.liferay.portal.service.ServiceContext",
      "com.liferay.portal.kernel.util.LocaleUtil",
      "com.liferay.portlet.blogs.model.BlogsEntryWrapper",
      "org.tuckey.web.MockServletContext",
      "com.liferay.portal.model.WebsiteWrapper",
      "com.liferay.portal.model.EmailAddressWrapper",
      "com.liferay.portal.model.WorkflowDefinitionLinkWrapper",
      "com.liferay.portal.model.ContactWrapper",
      "com.liferay.portal.model.RepositoryWrapper",
      "com.liferay.portal.model.LayoutRevisionWrapper",
      "com.liferay.portal.model.PortletPreferencesIds",
      "com.liferay.portal.kernel.util.Validator",
      "com.liferay.portal.model.LayoutSetWrapper",
      "com.liferay.portal.model.CompanyWrapper",
      "com.liferay.portal.model.LayoutSetBranchWrapper",
      "org.dom4j.bean.BeanAttributeList",
      "com.liferay.portal.plugin.PluginPackageImpl",
      "com.liferay.portal.plugin.ModuleId",
      "com.liferay.portal.model.SubscriptionWrapper",
      "org.jfree.data.xy.OHLCDataItem",
      "org.jfree.data.xy.XYDataItem",
      "org.jfree.data.general.AbstractDataset",
      "org.jfree.data.general.AbstractSeriesDataset",
      "org.jfree.data.xy.AbstractXYDataset",
      "org.jfree.data.statistics.DefaultBoxAndWhiskerXYDataset",
      "org.jfree.data.general.DatasetGroup",
      "org.jfree.date.SerialDate",
      "org.jfree.date.SpreadsheetDate",
      "com.liferay.portal.model.AccountWrapper",
      "org.testng.internal.Configuration",
      "org.testng.collections.Maps",
      "org.testng.log4testng.Logger",
      "org.testng.internal.AnnotationTypeEnum",
      "org.testng.xml.XmlSuite",
      "org.testng.internal.version.VersionInfo",
      "org.testng.collections.Lists",
      "org.testng.SuiteRunner",
      "org.testng.TestListenerAdapter",
      "org.testng.SuiteRunState",
      "org.testng.internal.Attributes",
      "org.testng.SuiteRunner$DefaultTestRunnerFactory",
      "org.testng.junit.JUnitUtils$JUnitTestClass",
      "org.testng.junit.JUnitUtils$JUnitTestMethod",
      "org.testng.TestNGException",
      "org.apache.axis.components.logger.LogFactory$1",
      "org.apache.axis.components.logger.LogFactory",
      "org.apache.axis.attachments.AttachmentPart",
      "org.apache.axis.utils.SessionUtils",
      "com.liferay.portlet.PortletResponseImpl",
      "com.liferay.portlet.StateAwareResponseImpl",
      "com.liferay.portlet.ActionResponseImpl",
      "org.testng.internal.annotations.JDK15AnnotationFinder",
      "org.testng.internal.annotations.DefaultAnnotationTransformer",
      "org.testng.internal.annotations.JDK15TagFactory$1",
      "org.testng.internal.annotations.JDK15TagFactory$2",
      "org.testng.internal.annotations.JDK15TagFactory",
      "org.testng.SuiteRunner$ProxyTestRunnerFactory",
      "org.testng.internal.NoOpTestClass",
      "org.testng.junit.JUnitUtils",
      "org.dom4j.DocumentFactory",
      "org.dom4j.tree.QNameCache",
      "org.dom4j.bean.BeanDocumentFactory",
      "org.dom4j.bean.BeanMetaData",
      "org.dom4j.util.SimpleSingleton",
      "org.dom4j.QName",
      "org.dom4j.tree.AbstractNode",
      "org.dom4j.tree.NamespaceCache",
      "org.dom4j.tree.ConcurrentReaderHashMap",
      "org.dom4j.tree.ConcurrentReaderHashMap$BarrierLock",
      "org.dom4j.tree.ConcurrentReaderHashMap$Entry",
      "org.dom4j.Namespace",
      "org.dom4j.tree.AbstractBranch",
      "org.dom4j.tree.AbstractElement",
      "org.dom4j.tree.DefaultElement",
      "org.dom4j.bean.BeanElement",
      "org.testng.TestRunner",
      "org.testng.TestRunner$ConfigurationListener",
      "org.testng.internal.TestNGProperty",
      "org.testng.internal.Constants",
      "org.testng.internal.XmlMethodSelector",
      "org.testng.internal.ResultMap",
      "org.testng.internal.RunInfo",
      "org.jfree.data.xy.DefaultOHLCDataset",
      "com.liferay.portal.kernel.language.LanguageUtil",
      "com.liferay.portal.model.TeamWrapper",
      "org.apache.xmlbeans.XmlCalendar",
      "com.liferay.portlet.PortletURLImpl",
      "com.liferay.portlet.PortletURLImplWrapper",
      "com.liferay.portal.struts.StrutsActionPortletURL",
      "com.liferay.portal.util.PortalUtil",
      "com.liferay.portal.kernel.util.DateUtil",
      "org.apache.axis.message.NodeImpl",
      "org.apache.axis.utils.Mapping",
      "org.apache.axis.message.MessageElement",
      "org.apache.axis.message.RPCParam",
      "org.testng.internal.BaseTestMethod$1",
      "org.testng.internal.BaseTestMethod",
      "org.testng.internal.ConfigurationMethod",
      "org.testng.internal.ConstructorOrMethod",
      "org.testng.internal.thread.ThreadUtil",
      "org.testng.internal.thread.AtomicIntegerAdapter",
      "org.testng.internal.annotations.AnnotationHelper",
      "org.testng.internal.annotations.JDK15AnnotationFinder$Pair",
      "org.testng.xml.XmlTest",
      "org.testng.TestNG",
      "org.testng.InstanceOrderingMethodInterceptor",
      "org.testng.internal.Invoker",
      "org.testng.internal.Utils$1",
      "org.testng.internal.Utils",
      "org.testng.internal.MethodSelectorDescriptor",
      "org.testng.internal.ClassInfoMap",
      "org.testng.internal.BaseClassFinder",
      "org.testng.internal.TestNGClassFinder",
      "org.testng.internal.ObjectFactoryImpl",
      "org.testng.internal.TestNGMethodFinder",
      "org.testng.internal.MethodGroupsHelper",
      "org.testng.internal.MethodHelper",
      "org.testng.internal.Graph",
      "org.testng.ClassMethodMap",
      "org.testng.internal.ConfigurationGroupMethods",
      "com.liferay.portal.kernel.util.HtmlUtil",
      "org.jfree.data.xy.XYDatasetTableModel",
      "org.testng.internal.ClonedMethod",
      "com.liferay.portlet.blogs.service.BlogsEntryServiceWrapper",
      "com.liferay.portal.model.PasswordPolicyWrapper",
      "org.jruby.util.CompoundJarURLStreamHandler",
      "org.jruby.util.CompoundJarURLStreamHandler$CompoundJarURLConnection",
      "org.jruby.util.URLUtil",
      "org.jfree.data.time.RegularTimePeriod",
      "org.jfree.data.time.Month",
      "org.jfree.data.time.Year",
      "org.jfree.data.time.TimePeriodFormatException",
      "org.jfree.data.time.Second",
      "org.jfree.data.time.Day",
      "org.jfree.data.time.Minute",
      "com.liferay.portlet.MimeResponseImpl",
      "com.liferay.portlet.ResourceResponseImpl",
      "com.liferay.portal.security.permission.BasePermissionChecker",
      "com.liferay.portal.security.permission.SimplePermissionChecker",
      "com.liferay.portal.util.PropsValues",
      "com.liferay.portal.kernel.staging.StagingUtil",
      "org.apache.xmlbeans.GDate",
      "org.jfree.data.time.Quarter",
      "com.liferay.portal.kernel.plugin.RemotePluginPackageRepository",
      "org.jfree.data.xy.DefaultHighLowDataset",
      "org.testng.internal.TestNGMethod$1",
      "org.testng.internal.TestNGMethod",
      "com.liferay.portlet.RenderResponseImpl",
      "com.gargoylesoftware.htmlunit.html.DomNode",
      "com.gargoylesoftware.htmlunit.html.DomNamespaceNode",
      "com.gargoylesoftware.htmlunit.html.DomElement",
      "com.gargoylesoftware.htmlunit.html.HtmlElement",
      "com.gargoylesoftware.htmlunit.html.HtmlApplet",
      "com.gargoylesoftware.htmlunit.html.applets.AppletStubImpl",
      "com.gargoylesoftware.htmlunit.html.applets.AppletContextImpl",
      "org.jfree.data.time.Millisecond",
      "org.jfree.data.time.Hour",
      "org.jfree.data.statistics.SimpleHistogramBin",
      "org.jfree.data.time.FixedMillisecond",
      "com.liferay.portlet.EventResponseImpl",
      "org.dom4j.tree.DefaultNamespace",
      "org.dom4j.dom.DOMNamespace",
      "org.jfree.data.time.Week",
      "org.jfree.data.general.Series",
      "org.jfree.data.xy.XYSeries",
      "org.testng.internal.annotations.BaseAnnotation",
      "org.testng.internal.annotations.TestOrConfiguration",
      "org.testng.internal.annotations.TestAnnotation",
      "org.jfree.data.time.TimeSeries",
      "org.jfree.data.time.TimeSeriesDataItem",
      "org.jfree.data.general.SeriesChangeEvent",
      "org.apache.xmlbeans.GDateBuilder",
      "com.liferay.portal.kernel.util.UnicodeProperties",
      "org.jfree.data.ComparableObjectSeries",
      "org.jfree.data.xy.YIntervalSeries",
      "org.dom4j.tree.AbstractAttribute",
      "org.dom4j.bean.BeanAttribute",
      "org.jfree.data.time.SimpleTimePeriod",
      "com.liferay.portal.kernel.exception.NestableException",
      "com.liferay.portal.kernel.exception.SystemException"
    );
  }
}
