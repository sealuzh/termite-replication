/**
 * Scaffolding file used to store all the setups needed to run 
 * tests automatically generated by EvoSuite
 * Sat Nov 28 06:11:24 GMT 2020
 */

package net.sourceforge.schemaspy.model;

import org.evosuite.runtime.annotation.EvoSuiteClassExclude;
import org.junit.BeforeClass;
import org.junit.Before;
import org.junit.After;
import org.junit.AfterClass;
import org.evosuite.runtime.sandbox.Sandbox;
import org.evosuite.runtime.sandbox.Sandbox.SandboxMode;

import static org.evosuite.shaded.org.mockito.Mockito.*;
@EvoSuiteClassExclude
public class ForeignKeyConstraint_ESTest_scaffolding {

  @org.junit.Rule 
  public org.evosuite.runtime.vnet.NonFunctionalRequirementRule nfr = new org.evosuite.runtime.vnet.NonFunctionalRequirementRule();

  private static final java.util.Properties defaultProperties = (java.util.Properties) java.lang.System.getProperties().clone(); 

  private org.evosuite.runtime.thread.ThreadStopper threadStopper =  new org.evosuite.runtime.thread.ThreadStopper (org.evosuite.runtime.thread.KillSwitchHandler.getInstance(), 3000);


  @BeforeClass 
  public static void initEvoSuiteFramework() { 
    org.evosuite.runtime.RuntimeSettings.className = "net.sourceforge.schemaspy.model.ForeignKeyConstraint"; 
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
    try { initMocksToAvoidTimeoutsInTheTests(); } catch(ClassNotFoundException e) {} 
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
    java.lang.System.setProperty("user.dir", "/home/ubuntu/termite/projects/36_schemaspy"); 
    java.lang.System.setProperty("user.home", "/home/ubuntu"); 
    java.lang.System.setProperty("user.language", "en"); 
    java.lang.System.setProperty("user.name", "ubuntu"); 
    java.lang.System.setProperty("user.timezone", "Etc/UTC"); 
  }

  private static void initializeClasses() {
    org.evosuite.runtime.classhandling.ClassStateSupport.initializeClasses(ForeignKeyConstraint_ESTest_scaffolding.class.getClassLoader() ,
      "net.sourceforge.schemaspy.model.Database",
      "net.sourceforge.schemaspy.util.Dot",
      "net.sourceforge.schemaspy.model.TableColumn",
      "net.sourceforge.schemaspy.view.SqlFormatter",
      "net.sourceforge.schemaspy.model.TableColumn$ColumnComparator",
      "net.sourceforge.schemaspy.Config$MissingRequiredParameterException",
      "net.sourceforge.schemaspy.model.ForeignKeyConstraint",
      "net.sourceforge.schemaspy.model.TableIndex",
      "net.sourceforge.schemaspy.model.LogicalRemoteTable",
      "net.sourceforge.schemaspy.model.Database$BasicTableMeta",
      "net.sourceforge.schemaspy.view.DefaultSqlFormatter",
      "net.sourceforge.schemaspy.model.xml.TableMeta",
      "net.sourceforge.schemaspy.util.CaseInsensitiveMap",
      "net.sourceforge.schemaspy.model.Table$1ColumnInitializationFailure",
      "net.sourceforge.schemaspy.model.Database$TableCreator",
      "net.sourceforge.schemaspy.util.Version",
      "net.sourceforge.schemaspy.model.Database$NameValidator",
      "net.sourceforge.schemaspy.model.Database$ThreadedTableCreator$1",
      "net.sourceforge.schemaspy.model.LogicalTable",
      "net.sourceforge.schemaspy.model.Database$ThreadedTableCreator",
      "net.sourceforge.schemaspy.model.TableColumn$1",
      "net.sourceforge.schemaspy.model.xml.TableColumnMeta",
      "net.sourceforge.schemaspy.model.xml.ForeignKeyMeta",
      "net.sourceforge.schemaspy.model.InvalidConfigurationException",
      "net.sourceforge.schemaspy.util.Dot$DotFailure",
      "net.sourceforge.schemaspy.model.Table",
      "net.sourceforge.schemaspy.Config",
      "net.sourceforge.schemaspy.model.xml.SchemaMeta",
      "net.sourceforge.schemaspy.model.View",
      "net.sourceforge.schemaspy.model.Database$CombinedMap",
      "net.sourceforge.schemaspy.model.RemoteTable"
    );
  } 
  private static void initMocksToAvoidTimeoutsInTheTests() throws ClassNotFoundException { 
    mock(Class.forName("net.sourceforge.schemaspy.model.xml.TableColumnMeta", false, ForeignKeyConstraint_ESTest_scaffolding.class.getClassLoader()));
  }

  private static void resetClasses() {
    org.evosuite.runtime.classhandling.ClassResetter.getInstance().setClassLoader(ForeignKeyConstraint_ESTest_scaffolding.class.getClassLoader()); 

    org.evosuite.runtime.classhandling.ClassStateSupport.resetClasses(
      "net.sourceforge.schemaspy.model.ForeignKeyConstraint",
      "net.sourceforge.schemaspy.Config",
      "net.sourceforge.schemaspy.model.xml.SchemaMeta",
      "net.sourceforge.schemaspy.model.InvalidConfigurationException",
      "net.sourceforge.schemaspy.model.TableColumn",
      "net.sourceforge.schemaspy.model.TableColumn$ColumnComparator",
      "net.sourceforge.schemaspy.model.xml.TableColumnMeta",
      "net.sourceforge.schemaspy.model.Database",
      "net.sourceforge.schemaspy.util.CaseInsensitiveMap",
      "net.sourceforge.schemaspy.model.Database$CombinedMap",
      "net.sourceforge.schemaspy.model.Database$NameValidator",
      "net.sourceforge.schemaspy.Config$MissingRequiredParameterException",
      "net.sourceforge.schemaspy.model.Table",
      "net.sourceforge.schemaspy.util.Version",
      "net.sourceforge.schemaspy.util.Dot",
      "net.sourceforge.schemaspy.view.DefaultSqlFormatter"
    );
  }
}
