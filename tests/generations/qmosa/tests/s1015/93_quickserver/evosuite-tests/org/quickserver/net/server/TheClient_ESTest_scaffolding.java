/**
 * Scaffolding file used to store all the setups needed to run 
 * tests automatically generated by EvoSuite
 * Wed Nov 11 06:45:55 GMT 2020
 */

package org.quickserver.net.server;

import org.evosuite.runtime.annotation.EvoSuiteClassExclude;
import org.junit.BeforeClass;
import org.junit.Before;
import org.junit.After;
import org.junit.AfterClass;
import org.evosuite.runtime.sandbox.Sandbox;
import org.evosuite.runtime.sandbox.Sandbox.SandboxMode;

@EvoSuiteClassExclude
public class TheClient_ESTest_scaffolding {

  @org.junit.Rule 
  public org.evosuite.runtime.vnet.NonFunctionalRequirementRule nfr = new org.evosuite.runtime.vnet.NonFunctionalRequirementRule();

  private static final java.util.Properties defaultProperties = (java.util.Properties) java.lang.System.getProperties().clone(); 

  private org.evosuite.runtime.thread.ThreadStopper threadStopper =  new org.evosuite.runtime.thread.ThreadStopper (org.evosuite.runtime.thread.KillSwitchHandler.getInstance(), 3000);


  @BeforeClass 
  public static void initEvoSuiteFramework() { 
    org.evosuite.runtime.RuntimeSettings.className = "org.quickserver.net.server.TheClient"; 
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
    java.lang.System.setProperty("user.dir", "/home/ubuntu/replication/scripts/projects/93_quickserver"); 
    java.lang.System.setProperty("user.home", "/home/ubuntu"); 
    java.lang.System.setProperty("user.language", "en"); 
    java.lang.System.setProperty("user.name", "ubuntu"); 
    java.lang.System.setProperty("user.timezone", "Etc/UTC"); 
  }

  private static void initializeClasses() {
    org.evosuite.runtime.classhandling.ClassStateSupport.initializeClasses(TheClient_ESTest_scaffolding.class.getClassLoader() ,
      "org.quickserver.net.server.AuthStatus",
      "org.quickserver.util.pool.MakeQSObjectPool",
      "org.quickserver.net.server.QuickServer",
      "org.quickserver.util.xmlreader.ClientHandlerObjectPoolConfig",
      "org.quickserver.util.MyString",
      "org.quickserver.net.server.ClientExtendedEventHandler",
      "org.apache.commons.digester3.StackAction",
      "org.quickserver.util.pool.thread.ThreadObjectFactory",
      "org.quickserver.net.server.DataMode",
      "org.quickserver.net.qsadmin.CommandHandler",
      "org.quickserver.util.pool.QSObjectPoolMaker",
      "org.quickserver.net.ConnectionLostException",
      "org.quickserver.net.server.ClientEvent",
      "org.quickserver.util.xmlreader.ClientDataObjectPoolConfig",
      "org.apache.commons.digester3.ObjectParamRule",
      "org.quickserver.net.server.impl.DefaultClientEventHandler",
      "org.quickserver.util.io.ByteBufferOutputStream",
      "org.quickserver.net.server.ClientIdentifiable",
      "org.apache.commons.digester3.CallParamRule",
      "org.quickserver.util.logging.MiniFormatter",
      "org.quickserver.net.server.ClientWriteHandler",
      "org.quickserver.util.xmlreader.ThreadObjectPoolConfig",
      "org.quickserver.util.pool.thread.ClientPool",
      "org.quickserver.util.xmlreader.ObjectPoolConfig",
      "org.quickserver.util.xmlreader.PoolConfig",
      "org.apache.commons.pool.BasePoolableObjectFactory",
      "org.quickserver.util.xmlreader.ServerMode",
      "org.quickserver.net.server.GhostSocketReaper",
      "org.quickserver.util.xmlreader.AccessConstraintConfig",
      "org.apache.commons.digester3.SetNextRule",
      "org.quickserver.net.Service",
      "org.quickserver.net.server.impl.BasicPoolManager",
      "org.quickserver.net.server.impl.BlockingClientHandler",
      "org.quickserver.net.server.TheClient",
      "org.quickserver.util.xmlreader.AdvancedSettings",
      "org.quickserver.net.AppException",
      "org.quickserver.net.server.DataType",
      "org.apache.commons.pool.PoolableObjectFactory",
      "org.apache.commons.digester3.SetNestedPropertiesRule",
      "org.apache.commons.pool.ObjectPool",
      "org.apache.commons.digester3.Digester",
      "org.quickserver.util.Assertion",
      "org.apache.commons.digester3.AbstractMethodRule",
      "org.quickserver.util.xmlreader.Secure",
      "org.apache.commons.digester3.ObjectCreateRule",
      "org.apache.commons.digester3.AbstractRulesImpl",
      "org.quickserver.util.xmlreader.DatabaseConnectionConfig",
      "org.quickserver.net.server.ClientAuthenticationHandler",
      "org.quickserver.net.server.ClientEventHandler",
      "org.quickserver.net.qsadmin.Authenticator",
      "org.quickserver.util.xmlreader.BasicServerConfig",
      "org.quickserver.net.server.impl.OptimisticClientIdentifier",
      "org.quickserver.net.server.ClientObjectHandler",
      "org.apache.commons.digester3.CallMethodRule",
      "org.quickserver.util.logging.MicroFormatter",
      "org.apache.commons.digester3.BeanPropertySetterRule",
      "org.quickserver.util.xmlreader.ByteBufferObjectPoolConfig",
      "org.apache.commons.digester3.ObjectCreationFactory",
      "org.quickserver.net.server.ClientHandler",
      "org.quickserver.util.pool.QSObjectPool",
      "org.quickserver.net.qsadmin.QSAdminServer",
      "org.apache.commons.digester3.Rules",
      "org.apache.commons.beanutils.DynaProperty",
      "org.apache.commons.digester3.Rule",
      "org.apache.commons.digester3.SetPropertiesRule",
      "org.quickserver.net.qsadmin.Data",
      "org.quickserver.util.xmlreader.ServerHooks",
      "org.quickserver.util.xmlreader.TrustStoreInfo",
      "org.quickserver.util.xmlreader.Property",
      "org.apache.commons.logging.impl.Jdk14Logger",
      "org.quickserver.net.server.ClientData",
      "org.apache.commons.digester3.RulesBase",
      "org.quickserver.sql.DBPoolUtil",
      "org.quickserver.net.server.ClientCommandHandler",
      "org.quickserver.net.server.ClientIdentifier",
      "org.quickserver.net.server.impl.BasicClientHandler$InstanceId",
      "org.apache.commons.digester3.FactoryCreateRule",
      "org.quickserver.util.xmlreader.KeyStoreInfo",
      "org.quickserver.net.server.impl.BasicClientIdentifier",
      "org.quickserver.util.io.ByteBufferInputStream",
      "org.apache.commons.digester3.SetTopRule",
      "org.apache.commons.digester3.SetPropertyRule",
      "org.quickserver.util.xmlreader.DefaultDataMode",
      "org.quickserver.net.server.PoolManager",
      "org.quickserver.net.server.impl.BasicClientHandler",
      "org.quickserver.util.xmlreader.QSAdminServerConfig",
      "org.quickserver.net.server.ClientBinaryHandler",
      "org.quickserver.net.ServerHook",
      "org.quickserver.net.server.impl.NonBlockingClientHandler",
      "org.apache.commons.digester3.Substitutor",
      "org.quickserver.util.xmlreader.QuickServerConfig",
      "org.apache.commons.digester3.PathCallParamRule",
      "org.quickserver.util.xmlreader.IpFilterConfig",
      "org.apache.commons.digester3.SetRootRule",
      "org.quickserver.util.xmlreader.InitServerHooks",
      "org.quickserver.util.xmlreader.DBObjectPoolConfig",
      "org.apache.commons.digester3.RuleSet",
      "org.quickserver.util.xmlreader.SecureStore",
      "org.quickserver.util.xmlreader.ApplicationConfiguration",
      "org.quickserver.util.xmlreader.DatabaseConnectionSet",
      "org.quickserver.util.xmlreader.ConfigReader",
      "org.quickserver.net.server.QuickAuthenticationHandler",
      "org.quickserver.net.server.Authenticator"
    );
  } 

  private static void resetClasses() {
    org.evosuite.runtime.classhandling.ClassResetter.getInstance().setClassLoader(TheClient_ESTest_scaffolding.class.getClassLoader()); 

    org.evosuite.runtime.classhandling.ClassStateSupport.resetClasses(
      "org.quickserver.net.server.TheClient",
      "org.quickserver.net.server.ClientEvent",
      "org.quickserver.net.server.impl.DefaultClientEventHandler",
      "org.quickserver.net.server.QuickServer",
      "org.quickserver.net.server.impl.BasicClientHandler",
      "org.quickserver.net.server.impl.BlockingClientHandler",
      "org.quickserver.net.server.impl.BasicClientHandler$InstanceId",
      "org.quickserver.net.server.QuickAuthenticationHandler",
      "org.quickserver.net.qsadmin.Authenticator",
      "org.quickserver.net.qsadmin.Data",
      "org.quickserver.util.xmlreader.BasicServerConfig",
      "org.quickserver.util.xmlreader.QuickServerConfig",
      "org.quickserver.util.xmlreader.PoolConfig",
      "org.quickserver.util.xmlreader.ObjectPoolConfig",
      "org.quickserver.util.xmlreader.Secure",
      "org.quickserver.util.xmlreader.SecureStore",
      "org.quickserver.util.xmlreader.ServerMode",
      "org.quickserver.util.xmlreader.AdvancedSettings",
      "org.quickserver.util.xmlreader.DefaultDataMode",
      "org.quickserver.net.server.DataMode",
      "org.quickserver.util.xmlreader.ConfigReader",
      "org.quickserver.net.AppException",
      "org.quickserver.net.qsadmin.QSAdminServer",
      "org.quickserver.net.server.impl.BasicClientIdentifier",
      "org.quickserver.net.server.impl.OptimisticClientIdentifier",
      "org.quickserver.net.server.impl.BasicPoolManager",
      "org.quickserver.util.pool.MakeQSObjectPool",
      "org.quickserver.util.xmlreader.ServerHooks",
      "org.quickserver.net.server.GhostSocketReaper",
      "org.quickserver.net.qsadmin.CommandHandler",
      "org.quickserver.util.Assertion",
      "org.quickserver.net.server.impl.NonBlockingClientHandler",
      "org.apache.commons.digester3.Digester",
      "org.apache.commons.logging.impl.Jdk14Logger",
      "org.apache.commons.digester3.Rule",
      "org.apache.commons.digester3.ObjectCreateRule",
      "org.apache.commons.digester3.AbstractRulesImpl",
      "org.apache.commons.digester3.RulesBase",
      "org.apache.commons.digester3.BeanPropertySetterRule",
      "org.apache.commons.digester3.AbstractMethodRule",
      "org.apache.commons.digester3.SetNextRule",
      "org.apache.commons.digester3.CallMethodRule",
      "org.quickserver.util.xmlreader.QSAdminServerConfig",
      "org.quickserver.net.server.DataType",
      "org.quickserver.util.MyString",
      "org.quickserver.util.xmlreader.DBObjectPoolConfig",
      "org.quickserver.util.xmlreader.ThreadObjectPoolConfig",
      "org.apache.commons.pool.BasePoolableObjectFactory",
      "org.quickserver.util.pool.thread.ThreadObjectFactory",
      "org.quickserver.util.io.ByteBufferOutputStream",
      "org.quickserver.util.io.ByteBufferInputStream",
      "org.quickserver.util.xmlreader.AccessConstraintConfig",
      "org.quickserver.util.logging.MicroFormatter",
      "org.quickserver.util.logging.MiniFormatter"
    );
  }
}
