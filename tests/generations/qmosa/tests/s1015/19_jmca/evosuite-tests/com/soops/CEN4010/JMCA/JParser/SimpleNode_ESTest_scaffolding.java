/**
 * Scaffolding file used to store all the setups needed to run 
 * tests automatically generated by EvoSuite
 * Mon Nov 18 07:27:30 GMT 2019
 */

package com.soops.CEN4010.JMCA.JParser;

import org.evosuite.runtime.annotation.EvoSuiteClassExclude;
import org.junit.BeforeClass;
import org.junit.Before;
import org.junit.After;
import org.junit.AfterClass;
import org.evosuite.runtime.sandbox.Sandbox;
import org.evosuite.runtime.sandbox.Sandbox.SandboxMode;

import static org.evosuite.shaded.org.mockito.Mockito.*;
@EvoSuiteClassExclude
public class SimpleNode_ESTest_scaffolding {

  @org.junit.Rule 
  public org.evosuite.runtime.vnet.NonFunctionalRequirementRule nfr = new org.evosuite.runtime.vnet.NonFunctionalRequirementRule();

  private static final java.util.Properties defaultProperties = (java.util.Properties) java.lang.System.getProperties().clone(); 

  private org.evosuite.runtime.thread.ThreadStopper threadStopper =  new org.evosuite.runtime.thread.ThreadStopper (org.evosuite.runtime.thread.KillSwitchHandler.getInstance(), 3000);


  @BeforeClass 
  public static void initEvoSuiteFramework() { 
    org.evosuite.runtime.RuntimeSettings.className = "com.soops.CEN4010.JMCA.JParser.SimpleNode"; 
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
    org.evosuite.runtime.util.SystemInUtil.getInstance().initForTestCase(); 
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
    java.lang.System.setProperty("user.dir", "/home/ubuntu/termite/projects/19_jmca"); 
    java.lang.System.setProperty("user.home", "/home/ubuntu"); 
    java.lang.System.setProperty("user.language", "en"); 
    java.lang.System.setProperty("user.name", "ubuntu"); 
    java.lang.System.setProperty("user.timezone", "Etc/UTC"); 
  }

  private static void initializeClasses() {
    org.evosuite.runtime.classhandling.ClassStateSupport.initializeClasses(SimpleNode_ESTest_scaffolding.class.getClassLoader() ,
      "com.soops.CEN4010.JMCA.JParser.ParseException",
      "com.soops.CEN4010.JMCA.JParser.JavaCharStream",
      "com.soops.CEN4010.JMCA.JParser.JavaParser",
      "com.soops.CEN4010.JMCA.JParser.JavaParser$1",
      "com.soops.CEN4010.JMCA.JParser.JavaParser$LookaheadSuccess",
      "com.soops.CEN4010.JMCA.JParser.Node",
      "com.soops.CEN4010.JMCA.JParser.JavaParserTreeConstants",
      "com.soops.CEN4010.JMCA.JParser.JJTJavaParserState",
      "com.soops.CEN4010.JMCA.JParser.Token$GTToken",
      "com.soops.CEN4010.JMCA.JParser.JavaParserTokenManager",
      "com.soops.CEN4010.JMCA.JParser.SimpleNode",
      "com.soops.CEN4010.JMCA.JParser.TokenMgrError",
      "com.soops.CEN4010.JMCA.JParser.JavaParserConstants",
      "com.soops.CEN4010.JMCA.JParser.Token"
    );
  } 
  private static void initMocksToAvoidTimeoutsInTheTests() throws ClassNotFoundException { 
    mock(Class.forName("java.util.Enumeration", false, SimpleNode_ESTest_scaffolding.class.getClassLoader()));
  }

  private static void resetClasses() {
    org.evosuite.runtime.classhandling.ClassResetter.getInstance().setClassLoader(SimpleNode_ESTest_scaffolding.class.getClassLoader()); 

    org.evosuite.runtime.classhandling.ClassStateSupport.resetClasses(
      "com.soops.CEN4010.JMCA.JParser.SimpleNode",
      "com.soops.CEN4010.JMCA.JParser.JavaParserTreeConstants",
      "com.soops.CEN4010.JMCA.JParser.JavaCharStream",
      "com.soops.CEN4010.JMCA.JParser.JavaParserTokenManager",
      "com.soops.CEN4010.JMCA.JParser.TokenMgrError",
      "com.soops.CEN4010.JMCA.JParser.JavaParser",
      "com.soops.CEN4010.JMCA.JParser.JJTJavaParserState",
      "com.soops.CEN4010.JMCA.JParser.JavaParser$LookaheadSuccess",
      "com.soops.CEN4010.JMCA.JParser.Token",
      "com.soops.CEN4010.JMCA.JParser.JavaParserConstants",
      "com.soops.CEN4010.JMCA.JParser.ParseException",
      "com.soops.CEN4010.JMCA.JParser.Token$GTToken"
    );
  }
}
