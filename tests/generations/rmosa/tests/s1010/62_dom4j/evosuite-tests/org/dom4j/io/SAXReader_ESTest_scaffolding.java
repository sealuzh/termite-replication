/**
 * Scaffolding file used to store all the setups needed to run 
 * tests automatically generated by EvoSuite
 * Sun Nov 08 16:01:06 GMT 2020
 */

package org.dom4j.io;

import org.evosuite.runtime.annotation.EvoSuiteClassExclude;
import org.junit.BeforeClass;
import org.junit.Before;
import org.junit.After;
import org.junit.AfterClass;
import org.evosuite.runtime.sandbox.Sandbox;
import org.evosuite.runtime.sandbox.Sandbox.SandboxMode;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

@EvoSuiteClassExclude
public class SAXReader_ESTest_scaffolding {

  @org.junit.Rule 
  public org.evosuite.runtime.vnet.NonFunctionalRequirementRule nfr = new org.evosuite.runtime.vnet.NonFunctionalRequirementRule();

  protected static ExecutorService executor; 

  private static final java.util.Properties defaultProperties = (java.util.Properties) java.lang.System.getProperties().clone(); 

  private org.evosuite.runtime.thread.ThreadStopper threadStopper =  new org.evosuite.runtime.thread.ThreadStopper (org.evosuite.runtime.thread.KillSwitchHandler.getInstance(), 3000);


  @BeforeClass 
  public static void initEvoSuiteFramework() { 
    org.evosuite.runtime.RuntimeSettings.className = "org.dom4j.io.SAXReader"; 
    org.evosuite.runtime.GuiSupport.initialize(); 
    org.evosuite.runtime.RuntimeSettings.maxNumberOfThreads = 100; 
    org.evosuite.runtime.RuntimeSettings.maxNumberOfIterationsPerLoop = 10000; 
    org.evosuite.runtime.RuntimeSettings.mockSystemIn = true; 
    org.evosuite.runtime.RuntimeSettings.sandboxMode = org.evosuite.runtime.sandbox.Sandbox.SandboxMode.RECOMMENDED; 
    org.evosuite.runtime.sandbox.Sandbox.initializeSecurityManagerForSUT(); 
    executor = Executors.newCachedThreadPool(); 
    org.evosuite.runtime.classhandling.JDKClassResetter.init();
    setSystemProperties();
    initializeClasses();
    org.evosuite.runtime.Runtime.getInstance().resetRuntime(); 
  } 

  @AfterClass 
  public static void clearEvoSuiteFramework(){ 
    Sandbox.resetDefaultSecurityManager(); 
    executor.shutdownNow(); 
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
    java.lang.System.setProperty("user.dir", "/home/ubuntu/replication/scripts/projects/62_dom4j"); 
    java.lang.System.setProperty("user.home", "/home/ubuntu"); 
    java.lang.System.setProperty("user.language", "en"); 
    java.lang.System.setProperty("user.name", "ubuntu"); 
    java.lang.System.setProperty("user.timezone", "Etc/UTC"); 
  }

  private static void initializeClasses() {
    org.evosuite.runtime.classhandling.ClassStateSupport.initializeClasses(SAXReader_ESTest_scaffolding.class.getClassLoader() ,
      "org.jaxen.pattern.TextNodeTest",
      "org.jaxen.SimpleVariableContext",
      "org.jaxen.expr.iter.IterableAxis",
      "org.jaxen.function.ext.UpperFunction",
      "org.jaxen.expr.DefaultTruthExpr",
      "org.dom4j.datatype.DatatypeAttribute",
      "org.dom4j.io.DispatchHandler",
      "org.dom4j.Entity",
      "org.dom4j.tree.NamespaceStack",
      "org.jaxen.function.NameFunction",
      "org.jaxen.expr.DefaultFunctionCallExpr",
      "org.dom4j.tree.AbstractBranch",
      "org.dom4j.ProcessingInstruction",
      "org.dom4j.io.ElementStack",
      "org.dom4j.tree.FlyweightProcessingInstruction",
      "org.jaxen.Function",
      "org.dom4j.Namespace",
      "org.jaxen.BaseXPath",
      "org.dom4j.tree.DefaultDocumentType",
      "org.dom4j.datatype.DatatypeElement",
      "org.jaxen.expr.PredicateSet",
      "org.jaxen.function.ext.EndsWithFunction",
      "org.dom4j.tree.AbstractText",
      "org.jaxen.saxpath.SAXPathException",
      "org.dom4j.util.DoubleNameMap",
      "org.dom4j.tree.NamespaceCache",
      "org.jaxen.expr.iter.IterableFollowingSiblingAxis",
      "org.jaxen.expr.iter.IterableSelfAxis",
      "org.dom4j.tree.FlyweightComment",
      "org.jaxen.expr.DefaultArithExpr",
      "org.jaxen.XPath",
      "org.jaxen.pattern.NamespaceTest",
      "org.dom4j.tree.ConcurrentReaderHashMap$ValueIterator",
      "org.dom4j.tree.QNameCache",
      "org.jaxen.expr.iter.IterableNamespaceAxis",
      "org.dom4j.dom.DOMProcessingInstruction",
      "org.jaxen.dom4j.DocumentNavigator",
      "org.jaxen.expr.iter.IterablePrecedingSiblingAxis",
      "org.jaxen.expr.LocationPath",
      "org.jaxen.expr.DefaultPlusExpr",
      "org.dom4j.io.PruningElementStack",
      "org.jaxen.Navigator",
      "org.jaxen.ContextSupport",
      "org.jaxen.expr.DefaultNumberExpr",
      "org.jaxen.pattern.LocationPathPattern",
      "org.dom4j.dom.DOMDocumentFactory",
      "org.dom4j.bean.BeanElement",
      "org.dom4j.NodeFilter",
      "org.dom4j.tree.DefaultNamespace",
      "org.jaxen.saxpath.helpers.XPathReaderFactory",
      "org.dom4j.tree.DefaultComment",
      "org.jaxen.function.xslt.DocumentFunction",
      "org.jaxen.expr.Predicate",
      "org.jaxen.expr.DefaultRelationalExpr",
      "org.dom4j.NodeType",
      "org.dom4j.dom.DOMNodeHelper$EmptyNodeList",
      "org.dom4j.tree.AbstractProcessingInstruction",
      "org.jaxen.expr.DefaultAdditiveExpr",
      "org.jaxen.function.ConcatFunction",
      "org.dom4j.io.SAXContentHandler",
      "org.jaxen.function.CountFunction",
      "org.jaxen.expr.PathExpr",
      "org.dom4j.QName",
      "org.jaxen.pattern.PatternParser",
      "org.dom4j.tree.DefaultElement",
      "org.jaxen.expr.iter.IterableDescendantAxis",
      "org.dom4j.Node",
      "org.dom4j.tree.ConcurrentReaderHashMap$HashIterator",
      "org.jaxen.function.LocalNameFunction",
      "org.dom4j.util.SingletonStrategy",
      "org.jaxen.function.BooleanFunction",
      "org.jaxen.function.SubstringBeforeFunction",
      "org.dom4j.tree.DefaultCDATA",
      "org.dom4j.io.SAXReader$SAXEntityResolver",
      "org.dom4j.tree.BackedList",
      "org.dom4j.tree.AbstractAttribute",
      "org.jaxen.SimpleNamespaceContext",
      "org.jaxen.saxpath.helpers.DefaultXPathHandler",
      "org.jaxen.expr.DefaultExpr",
      "org.dom4j.dom.DOMElement",
      "org.jaxen.NamespaceContext",
      "org.jaxen.dom4j.DocumentNavigator$Singleton",
      "org.jaxen.pattern.AnyNodeTest",
      "org.dom4j.tree.AbstractEntity",
      "org.jaxen.expr.Predicated",
      "org.jaxen.saxpath.base.Token",
      "org.jaxen.saxpath.XPathSyntaxException",
      "org.jaxen.function.FalseFunction",
      "org.dom4j.util.IndexedElement",
      "org.dom4j.util.NonLazyElement",
      "org.dom4j.tree.FlyweightEntity",
      "org.jaxen.expr.DefaultRelativeLocationPath",
      "org.jaxen.function.TrueFunction",
      "org.jaxen.pattern.NameTest",
      "org.jaxen.expr.iter.IterableChildAxis",
      "org.jaxen.JaxenHandler",
      "org.dom4j.DefaultDocumentFactory",
      "org.dom4j.io.SAXModifyElementHandler",
      "org.jaxen.VariableContext",
      "org.jaxen.dom4j.Dom4jXPath",
      "org.jaxen.saxpath.SAXPathEventSource",
      "org.dom4j.bean.BeanAttribute",
      "org.dom4j.ElementHandler",
      "org.dom4j.tree.DefaultAttribute",
      "org.jaxen.JaxenRuntimeException",
      "org.jaxen.expr.AdditiveExpr",
      "org.dom4j.rule.Pattern",
      "org.jaxen.function.StartsWithFunction",
      "org.dom4j.ElementPath",
      "org.jaxen.expr.DefaultFilterExpr",
      "org.jaxen.expr.iter.IterableParentAxis",
      "org.dom4j.tree.AbstractComment",
      "org.dom4j.Branch",
      "org.jaxen.expr.NameStep",
      "org.jaxen.expr.DefaultXPathExpr",
      "org.jaxen.Context",
      "org.jaxen.function.LangFunction",
      "org.dom4j.XPath",
      "org.dom4j.xpath.DefaultXPath",
      "org.jaxen.expr.iter.IterableAttributeAxis",
      "org.dom4j.tree.FlyweightCDATA",
      "org.jaxen.expr.DefaultAllNodeStep",
      "org.dom4j.Element",
      "org.jaxen.saxpath.XPathReader",
      "org.jaxen.expr.DefaultBinaryExpr",
      "org.dom4j.tree.LazyList$Entry",
      "org.jaxen.JaxenException",
      "org.jaxen.expr.DefaultNameStep",
      "org.jaxen.SimpleFunctionContext",
      "org.jaxen.XPathFunctionContext",
      "org.jaxen.expr.iter.IterableDescendantOrSelfAxis",
      "org.dom4j.InvalidXPathException",
      "org.jaxen.expr.AllNodeStep",
      "org.dom4j.tree.DefaultText",
      "org.jaxen.expr.Step",
      "org.dom4j.tree.LazyList$Range",
      "org.jaxen.DefaultNavigator",
      "org.jaxen.expr.XPathFactory",
      "org.dom4j.tree.ConcurrentReaderHashMap$KeyIterator",
      "org.jaxen.function.StringFunction",
      "org.jaxen.function.IdFunction",
      "org.jaxen.expr.BinaryExpr",
      "org.dom4j.tree.AbstractCDATA",
      "org.dom4j.bean.BeanMetaData",
      "org.dom4j.tree.AbstractDocument",
      "org.dom4j.Attribute",
      "org.dom4j.Document",
      "org.dom4j.tree.ConcurrentReaderHashMap",
      "org.dom4j.tree.ConcurrentReaderHashMap$Entry",
      "org.jaxen.pattern.NodeTypeTest",
      "org.jaxen.function.NumberFunction",
      "org.dom4j.tree.AbstractDocumentType",
      "org.jaxen.expr.LiteralExpr",
      "org.jaxen.expr.DefaultLocationPath",
      "org.jaxen.function.NotFunction",
      "org.jaxen.expr.DefaultGreaterThanExpr",
      "org.dom4j.io.JAXPHelper",
      "org.dom4j.tree.FlyweightAttribute",
      "org.dom4j.CDATA",
      "org.jaxen.UnresolvableException",
      "org.dom4j.IllegalAddException",
      "org.jaxen.function.SubstringAfterFunction",
      "org.dom4j.tree.FlyweightText",
      "org.dom4j.tree.AbstractNode",
      "org.dom4j.Visitor",
      "org.dom4j.tree.LazyList$LazyListIterator",
      "org.dom4j.tree.ConcurrentReaderHashMap$BarrierLock",
      "org.dom4j.CharacterData",
      "org.dom4j.xpath.XPathPattern",
      "org.jaxen.expr.DefaultXPathFactory",
      "org.jaxen.saxpath.base.XPathReader",
      "org.jaxen.function.NamespaceUriFunction",
      "org.dom4j.tree.LazyList$1",
      "org.jaxen.expr.DefaultPathExpr",
      "org.jaxen.expr.iter.IterableAncestorOrSelfAxis",
      "org.jaxen.function.ext.EvaluateFunction",
      "org.jaxen.expr.FilterExpr",
      "org.jaxen.expr.UnionExpr",
      "org.jaxen.expr.VariableReferenceExpr",
      "org.dom4j.XPathException",
      "org.jaxen.function.LastFunction",
      "org.jaxen.expr.FunctionCallExpr",
      "org.dom4j.tree.ConcurrentReaderHashMap$Values",
      "org.dom4j.io.SAXReader",
      "org.dom4j.io.SAXHelper",
      "org.jaxen.pattern.Pattern",
      "org.jaxen.FunctionCallException",
      "org.dom4j.tree.LazyList",
      "org.jaxen.function.RoundFunction",
      "org.jaxen.function.ext.LowerFunction",
      "org.dom4j.dom.DOMDocumentType",
      "org.dom4j.DocumentType",
      "org.jaxen.saxpath.base.XPathLexer",
      "org.jaxen.UnsupportedAxisException",
      "org.dom4j.io.SAXModifyException",
      "org.jaxen.function.SubstringFunction",
      "org.jaxen.function.ContainsFunction",
      "org.dom4j.tree.DefaultDocument",
      "org.jaxen.expr.XPathExpr",
      "org.jaxen.function.FloorFunction",
      "org.jaxen.pattern.UnionPattern",
      "org.dom4j.tree.ConcurrentReaderHashMap$KeySet",
      "org.jaxen.expr.iter.IterableFollowingAxis",
      "org.jaxen.function.CeilingFunction",
      "org.jaxen.expr.DefaultStep",
      "org.dom4j.util.SimpleSingleton",
      "org.jaxen.expr.Expr",
      "org.dom4j.tree.ConcurrentReaderHashMap$1",
      "org.dom4j.dom.DOMDocument",
      "org.jaxen.NamedAccessNavigator",
      "org.dom4j.io.PruningDispatchHandler",
      "org.jaxen.function.TranslateFunction",
      "org.dom4j.bean.BeanAttributeList",
      "org.dom4j.dom.DOMNamespace",
      "org.jaxen.saxpath.base.Verifier",
      "org.dom4j.tree.AbstractElement",
      "org.jaxen.expr.iter.IterableAncestorAxis",
      "org.dom4j.DocumentFactory",
      "org.dom4j.DocumentException",
      "org.jaxen.saxpath.XPathHandler",
      "org.dom4j.tree.BaseElement",
      "org.dom4j.Comment",
      "org.dom4j.tree.DefaultEntity",
      "org.dom4j.tree.ConcurrentReaderHashMap$EntrySet",
      "org.jaxen.XPathSyntaxException",
      "org.jaxen.function.StringLengthFunction",
      "org.dom4j.dom.DOMNodeHelper",
      "org.jaxen.function.SumFunction",
      "org.dom4j.tree.DefaultProcessingInstruction",
      "org.jaxen.function.NormalizeSpaceFunction",
      "org.dom4j.Text",
      "org.dom4j.util.UserDataAttribute",
      "org.dom4j.tree.AbstractCharacterData",
      "org.jaxen.pattern.NodeTest",
      "org.jaxen.function.PositionFunction",
      "org.jaxen.expr.iter.IterablePrecedingAxis",
      "org.dom4j.bean.BeanDocumentFactory",
      "org.jaxen.expr.DefaultAbsoluteLocationPath",
      "org.jaxen.FunctionContext",
      "org.jaxen.expr.NumberExpr",
      "org.jaxen.QualifiedName",
      "org.jaxen.expr.RelationalExpr",
      "org.jaxen.function.ext.LocaleFunctionSupport"
    );
  } 

  private static void resetClasses() {
    org.evosuite.runtime.classhandling.ClassResetter.getInstance().setClassLoader(SAXReader_ESTest_scaffolding.class.getClassLoader()); 

    org.evosuite.runtime.classhandling.ClassStateSupport.resetClasses(
      "org.dom4j.io.SAXReader",
      "org.dom4j.io.SAXReader$SAXEntityResolver",
      "org.dom4j.DefaultDocumentFactory",
      "org.dom4j.io.SAXHelper",
      "org.dom4j.util.SimpleSingleton",
      "org.dom4j.tree.QNameCache",
      "org.dom4j.DocumentException",
      "org.dom4j.io.JAXPHelper",
      "org.dom4j.io.SAXContentHandler",
      "org.dom4j.tree.NamespaceStack",
      "org.dom4j.io.ElementStack",
      "org.dom4j.tree.AbstractNode",
      "org.dom4j.tree.NamespaceCache",
      "org.dom4j.tree.ConcurrentReaderHashMap",
      "org.dom4j.tree.ConcurrentReaderHashMap$BarrierLock",
      "org.dom4j.tree.ConcurrentReaderHashMap$Entry",
      "org.dom4j.Namespace",
      "org.dom4j.QName",
      "org.dom4j.io.DispatchHandler",
      "org.dom4j.io.PruningDispatchHandler",
      "org.dom4j.io.SAXModifyElementHandler",
      "org.dom4j.tree.AbstractDocumentType",
      "org.dom4j.tree.DefaultDocumentType",
      "org.dom4j.dom.DOMDocumentType",
      "org.dom4j.tree.AbstractBranch",
      "org.dom4j.tree.AbstractDocument",
      "org.dom4j.tree.DefaultDocument",
      "org.dom4j.dom.DOMDocumentFactory",
      "org.dom4j.dom.DOMDocument",
      "org.dom4j.tree.LazyList",
      "org.dom4j.tree.LazyList$Entry",
      "org.dom4j.tree.LazyList$LazyListIterator",
      "org.dom4j.dom.DOMNodeHelper$EmptyNodeList",
      "org.dom4j.dom.DOMNodeHelper",
      "org.dom4j.tree.AbstractElement",
      "org.dom4j.tree.DefaultElement",
      "org.dom4j.datatype.DatatypeElement",
      "org.dom4j.tree.DefaultNamespace",
      "org.dom4j.dom.DOMNamespace",
      "org.dom4j.bean.BeanDocumentFactory",
      "org.dom4j.bean.BeanElement",
      "org.dom4j.tree.AbstractAttribute",
      "org.dom4j.tree.FlyweightAttribute",
      "org.dom4j.tree.DefaultAttribute",
      "org.dom4j.tree.AbstractProcessingInstruction",
      "org.dom4j.tree.FlyweightProcessingInstruction",
      "org.dom4j.tree.DefaultProcessingInstruction",
      "org.dom4j.dom.DOMProcessingInstruction",
      "org.dom4j.bean.BeanMetaData",
      "org.dom4j.util.UserDataAttribute",
      "org.dom4j.bean.BeanAttributeList",
      "org.dom4j.xpath.DefaultXPath",
      "org.jaxen.BaseXPath",
      "org.jaxen.dom4j.Dom4jXPath",
      "org.jaxen.DefaultNavigator",
      "org.jaxen.dom4j.DocumentNavigator",
      "org.jaxen.dom4j.DocumentNavigator$Singleton",
      "org.jaxen.saxpath.helpers.XPathReaderFactory",
      "org.jaxen.saxpath.helpers.DefaultXPathHandler",
      "org.jaxen.saxpath.base.XPathReader",
      "org.jaxen.JaxenHandler",
      "org.jaxen.expr.DefaultXPathFactory",
      "org.jaxen.saxpath.base.XPathLexer",
      "org.jaxen.saxpath.base.Verifier",
      "org.jaxen.saxpath.base.Token",
      "org.jaxen.expr.DefaultExpr",
      "org.jaxen.expr.DefaultLocationPath",
      "org.jaxen.expr.DefaultRelativeLocationPath",
      "org.jaxen.expr.iter.IterableAxis",
      "org.jaxen.expr.iter.IterableChildAxis",
      "org.jaxen.expr.DefaultStep",
      "org.jaxen.expr.DefaultNameStep",
      "org.jaxen.expr.PredicateSet",
      "org.jaxen.expr.DefaultPathExpr",
      "org.jaxen.expr.DefaultXPathExpr",
      "org.dom4j.tree.AbstractCharacterData",
      "org.dom4j.tree.AbstractComment",
      "org.dom4j.tree.FlyweightComment",
      "org.dom4j.tree.DefaultComment",
      "org.jaxen.saxpath.SAXPathException",
      "org.jaxen.saxpath.XPathSyntaxException",
      "org.jaxen.JaxenException",
      "org.jaxen.XPathSyntaxException",
      "org.dom4j.InvalidXPathException",
      "org.dom4j.xpath.XPathPattern",
      "org.jaxen.Context",
      "org.jaxen.ContextSupport",
      "org.jaxen.SimpleNamespaceContext",
      "org.jaxen.SimpleFunctionContext",
      "org.jaxen.function.BooleanFunction",
      "org.jaxen.QualifiedName",
      "org.jaxen.function.CeilingFunction",
      "org.jaxen.function.ConcatFunction",
      "org.jaxen.function.ContainsFunction",
      "org.jaxen.function.CountFunction",
      "org.jaxen.function.FalseFunction",
      "org.jaxen.function.FloorFunction",
      "org.jaxen.function.IdFunction",
      "org.jaxen.function.LangFunction",
      "org.jaxen.function.LastFunction",
      "org.jaxen.function.LocalNameFunction",
      "org.jaxen.function.NameFunction",
      "org.jaxen.function.NamespaceUriFunction",
      "org.jaxen.function.NormalizeSpaceFunction",
      "org.jaxen.function.NotFunction",
      "org.jaxen.function.NumberFunction",
      "org.jaxen.function.PositionFunction",
      "org.jaxen.function.RoundFunction",
      "org.jaxen.function.StartsWithFunction",
      "org.jaxen.function.StringFunction",
      "org.jaxen.function.StringLengthFunction",
      "org.jaxen.function.SubstringAfterFunction",
      "org.jaxen.function.SubstringBeforeFunction",
      "org.jaxen.function.SubstringFunction",
      "org.jaxen.function.SumFunction",
      "org.jaxen.function.TrueFunction",
      "org.jaxen.function.TranslateFunction",
      "org.jaxen.function.xslt.DocumentFunction",
      "org.jaxen.function.ext.EvaluateFunction",
      "org.jaxen.function.ext.LocaleFunctionSupport",
      "org.jaxen.function.ext.LowerFunction",
      "org.jaxen.function.ext.UpperFunction",
      "org.jaxen.function.ext.EndsWithFunction",
      "org.jaxen.XPathFunctionContext",
      "org.jaxen.SimpleVariableContext",
      "org.jaxen.pattern.PatternParser",
      "org.dom4j.tree.AbstractText",
      "org.dom4j.tree.FlyweightText",
      "org.dom4j.tree.DefaultText",
      "org.dom4j.util.IndexedElement",
      "org.dom4j.util.DoubleNameMap",
      "org.dom4j.tree.AbstractCDATA",
      "org.dom4j.tree.FlyweightCDATA",
      "org.dom4j.tree.DefaultCDATA",
      "org.dom4j.tree.AbstractEntity",
      "org.dom4j.tree.FlyweightEntity",
      "org.dom4j.tree.DefaultEntity",
      "org.dom4j.tree.BaseElement",
      "org.dom4j.util.NonLazyElement",
      "org.jaxen.expr.DefaultAbsoluteLocationPath",
      "org.jaxen.expr.iter.IterableDescendantOrSelfAxis",
      "org.jaxen.expr.DefaultAllNodeStep",
      "org.dom4j.io.PruningElementStack",
      "org.dom4j.bean.BeanAttribute",
      "org.dom4j.io.SAXModifyException",
      "org.jaxen.expr.DefaultFunctionCallExpr",
      "org.jaxen.expr.DefaultFilterExpr",
      "org.jaxen.pattern.Pattern",
      "org.jaxen.pattern.UnionPattern",
      "org.dom4j.datatype.DatatypeAttribute",
      "org.dom4j.dom.DOMElement",
      "org.jaxen.expr.DefaultBinaryExpr",
      "org.jaxen.expr.DefaultTruthExpr",
      "org.jaxen.expr.DefaultRelationalExpr",
      "org.jaxen.expr.DefaultGreaterThanExpr",
      "org.jaxen.expr.DefaultNumberExpr",
      "org.jaxen.expr.DefaultArithExpr",
      "org.jaxen.expr.DefaultAdditiveExpr",
      "org.jaxen.expr.DefaultPlusExpr"
    );
  }
}
