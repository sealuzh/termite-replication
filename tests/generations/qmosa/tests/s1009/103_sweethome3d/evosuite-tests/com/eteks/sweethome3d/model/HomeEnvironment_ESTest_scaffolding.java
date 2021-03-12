/**
 * Scaffolding file used to store all the setups needed to run 
 * tests automatically generated by EvoSuite
 * Tue Nov 10 17:34:51 GMT 2020
 */

package com.eteks.sweethome3d.model;

import org.evosuite.runtime.annotation.EvoSuiteClassExclude;
import org.junit.BeforeClass;
import org.junit.Before;
import org.junit.After;
import org.junit.AfterClass;
import org.evosuite.runtime.sandbox.Sandbox;
import org.evosuite.runtime.sandbox.Sandbox.SandboxMode;

import static org.evosuite.shaded.org.mockito.Mockito.*;
@EvoSuiteClassExclude
public class HomeEnvironment_ESTest_scaffolding {

  @org.junit.Rule 
  public org.evosuite.runtime.vnet.NonFunctionalRequirementRule nfr = new org.evosuite.runtime.vnet.NonFunctionalRequirementRule();

  private static final java.util.Properties defaultProperties = (java.util.Properties) java.lang.System.getProperties().clone(); 

  private org.evosuite.runtime.thread.ThreadStopper threadStopper =  new org.evosuite.runtime.thread.ThreadStopper (org.evosuite.runtime.thread.KillSwitchHandler.getInstance(), 3000);


  @BeforeClass 
  public static void initEvoSuiteFramework() { 
    org.evosuite.runtime.RuntimeSettings.className = "com.eteks.sweethome3d.model.HomeEnvironment"; 
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
    java.lang.System.setProperty("user.dir", "/home/ubuntu/replication/scripts/projects/103_sweethome3d"); 
    java.lang.System.setProperty("user.home", "/home/ubuntu"); 
    java.lang.System.setProperty("user.language", "en"); 
    java.lang.System.setProperty("user.name", "ubuntu"); 
    java.lang.System.setProperty("user.timezone", "Etc/UTC"); 
  }

  private static void initializeClasses() {
    org.evosuite.runtime.classhandling.ClassStateSupport.initializeClasses(HomeEnvironment_ESTest_scaffolding.class.getClassLoader() ,
      "com.eteks.sweethome3d.model.AspectRatio",
      "com.eteks.sweethome3d.model.Camera",
      "com.eteks.sweethome3d.model.HomeEnvironment$DrawingMode",
      "com.eteks.sweethome3d.tools.ResourceURLContent",
      "com.eteks.sweethome3d.tools.URLContent",
      "com.eteks.sweethome3d.model.TexturesCategory",
      "com.eteks.sweethome3d.model.CatalogTexture",
      "com.eteks.sweethome3d.tools.OperatingSystem$2",
      "com.eteks.sweethome3d.model.HomeEnvironment$Property",
      "com.eteks.sweethome3d.model.Content",
      "com.eteks.sweethome3d.tools.OperatingSystem$3",
      "com.eteks.sweethome3d.tools.OperatingSystem",
      "com.eteks.sweethome3d.tools.OperatingSystem$1",
      "com.eteks.sweethome3d.model.HomeTexture",
      "com.eteks.sweethome3d.model.Camera$Lens",
      "com.eteks.sweethome3d.model.Camera$Property",
      "com.eteks.sweethome3d.model.HomeEnvironment",
      "com.eteks.sweethome3d.tools.TemporaryURLContent",
      "com.eteks.sweethome3d.model.TextureImage"
    );
  } 
  private static void initMocksToAvoidTimeoutsInTheTests() throws ClassNotFoundException { 
    mock(Class.forName("java.beans.PropertyChangeListener", false, HomeEnvironment_ESTest_scaffolding.class.getClassLoader()));
  }

  private static void resetClasses() {
    org.evosuite.runtime.classhandling.ClassResetter.getInstance().setClassLoader(HomeEnvironment_ESTest_scaffolding.class.getClassLoader()); 

    org.evosuite.runtime.classhandling.ClassStateSupport.resetClasses(
      "com.eteks.sweethome3d.model.HomeEnvironment",
      "com.eteks.sweethome3d.model.HomeEnvironment$Property",
      "com.eteks.sweethome3d.model.HomeEnvironment$DrawingMode",
      "com.eteks.sweethome3d.model.AspectRatio",
      "com.eteks.sweethome3d.tools.URLContent",
      "com.eteks.sweethome3d.tools.ResourceURLContent",
      "com.eteks.sweethome3d.model.Camera",
      "com.eteks.sweethome3d.model.CatalogTexture",
      "com.eteks.sweethome3d.model.HomeTexture",
      "com.eteks.sweethome3d.tools.TemporaryURLContent",
      "com.eteks.sweethome3d.tools.OperatingSystem",
      "com.eteks.sweethome3d.tools.OperatingSystem$1",
      "com.eteks.sweethome3d.tools.OperatingSystem$2",
      "com.eteks.sweethome3d.model.TexturesCategory",
      "com.eteks.sweethome3d.model.Camera$Property"
    );
  }
}
