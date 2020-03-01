/**
 * Scaffolding file used to store all the setups needed to run 
 * tests automatically generated by EvoSuite
 * Tue Aug 07 13:57:43 GMT 2018
 */

package weka.attributeSelection;

import org.evosuite.runtime.annotation.EvoSuiteClassExclude;
import org.junit.BeforeClass;
import org.junit.Before;
import org.junit.After;
import org.junit.AfterClass;
import org.evosuite.runtime.sandbox.Sandbox;
import org.evosuite.runtime.sandbox.Sandbox.SandboxMode;

@EvoSuiteClassExclude
public class BestFirst_ESTest_scaffolding {

  @org.junit.Rule 
  public org.evosuite.runtime.vnet.NonFunctionalRequirementRule nfr = new org.evosuite.runtime.vnet.NonFunctionalRequirementRule();

  private static final java.util.Properties defaultProperties = (java.util.Properties) java.lang.System.getProperties().clone(); 

  private org.evosuite.runtime.thread.ThreadStopper threadStopper =  new org.evosuite.runtime.thread.ThreadStopper (org.evosuite.runtime.thread.KillSwitchHandler.getInstance(), 3000);


  @BeforeClass 
  public static void initEvoSuiteFramework() { 
    org.evosuite.runtime.RuntimeSettings.className = "weka.attributeSelection.BestFirst"; 
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
    java.lang.System.setProperty("user.dir", "/home/ubuntu/evosuite_readability_gen/projects/107_weka"); 
    java.lang.System.setProperty("user.home", "/home/ubuntu"); 
    java.lang.System.setProperty("user.language", "en"); 
    java.lang.System.setProperty("user.name", "ubuntu"); 
    java.lang.System.setProperty("user.timezone", "Etc/UTC"); 
  }

  private static void initializeClasses() {
    org.evosuite.runtime.classhandling.ClassStateSupport.initializeClasses(BestFirst_ESTest_scaffolding.class.getClassLoader() ,
      "weka.filters.unsupervised.attribute.NominalToBinary",
      "weka.classifiers.trees.j48.BinC45ModelSelection",
      "weka.classifiers.AbstractClassifier",
      "weka.attributeSelection.AttributeEvaluator",
      "weka.core.OptionHandler",
      "weka.attributeSelection.SubsetEvaluator",
      "weka.filters.StreamableFilter",
      "weka.core.Range",
      "weka.filters.UnsupervisedFilter",
      "weka.core.PartitionGenerator",
      "weka.classifiers.Classifier",
      "weka.attributeSelection.OneRAttributeEval",
      "weka.attributeSelection.CfsSubsetEval",
      "weka.classifiers.trees.J48",
      "weka.classifiers.trees.j48.ClassifierTree",
      "weka.filters.unsupervised.attribute.ReplaceMissingValues",
      "weka.classifiers.trees.j48.PruneableClassifierTree",
      "weka.attributeSelection.ASSearch",
      "weka.classifiers.functions.supportVector.Kernel",
      "weka.filters.SupervisedFilter",
      "weka.core.TechnicalInformationHandler",
      "weka.attributeSelection.StartSetHandler",
      "weka.core.Option",
      "weka.filters.unsupervised.attribute.PotentialClassIgnorer",
      "weka.classifiers.trees.j48.C45ModelSelection",
      "weka.attributeSelection.BestFirst$LinkedList2",
      "weka.filters.Sourcable",
      "weka.core.Utils",
      "weka.core.CustomDisplayStringProvider",
      "weka.core.Attribute",
      "weka.classifiers.functions.SMOreg",
      "weka.core.FastVector",
      "weka.core.Copyable",
      "weka.core.Capabilities",
      "weka.classifiers.functions.supportVector.RegSMOImproved",
      "weka.classifiers.functions.supportVector.CachedKernel",
      "weka.attributeSelection.BestFirst",
      "weka.core.Summarizable",
      "weka.classifiers.trees.j48.ModelSelection",
      "weka.classifiers.SingleClassifierEnhancer",
      "weka.core.RevisionUtils",
      "weka.core.AdditionalMeasureProducer",
      "weka.core.Instance",
      "weka.classifiers.functions.supportVector.RegSMO",
      "weka.classifiers.functions.supportVector.PolyKernel",
      "weka.core.ProtectedProperties",
      "weka.core.Drawable",
      "weka.core.Matchable",
      "weka.core.AttributeStats",
      "weka.core.WeightedInstancesHandler",
      "weka.attributeSelection.BestFirst$Link2",
      "weka.core.CapabilitiesHandler",
      "weka.filters.unsupervised.attribute.Remove",
      "weka.attributeSelection.ASEvaluation",
      "weka.classifiers.meta.AttributeSelectedClassifier",
      "weka.core.Instances",
      "weka.core.SelectedTag",
      "weka.classifiers.functions.supportVector.RegOptimizer",
      "weka.filters.unsupervised.attribute.Normalize",
      "weka.classifiers.trees.j48.C45PruneableClassifierTree",
      "weka.core.UnassignedClassException",
      "weka.classifiers.rules.ZeroR",
      "weka.filters.unsupervised.attribute.Standardize",
      "weka.attributeSelection.UnsupervisedSubsetEvaluator",
      "weka.core.TechnicalInformation",
      "weka.classifiers.Sourcable",
      "weka.core.RevisionHandler",
      "weka.filters.Filter",
      "weka.filters.supervised.attribute.Discretize",
      "weka.core.Tag"
    );
  } 

  private static void resetClasses() {
    org.evosuite.runtime.classhandling.ClassResetter.getInstance().setClassLoader(BestFirst_ESTest_scaffolding.class.getClassLoader()); 

    org.evosuite.runtime.classhandling.ClassStateSupport.resetClasses(
      "weka.attributeSelection.ASSearch",
      "weka.core.Tag",
      "weka.attributeSelection.BestFirst",
      "weka.core.FastVector",
      "weka.attributeSelection.BestFirst$LinkedList2",
      "weka.attributeSelection.BestFirst$Link2",
      "weka.core.Range",
      "weka.core.RevisionUtils",
      "weka.core.Option",
      "weka.attributeSelection.GreedyStepwise",
      "weka.attributeSelection.ASEvaluation",
      "weka.core.SelectedTag",
      "weka.attributeSelection.GainRatioAttributeEval",
      "weka.classifiers.CostMatrix",
      "weka.core.Instances",
      "weka.attributeSelection.UnsupervisedAttributeEvaluator",
      "weka.attributeSelection.PrincipalComponents",
      "weka.filters.Filter",
      "weka.filters.AllFilter",
      "weka.core.Capabilities",
      "weka.core.Utils",
      "org.pentaho.packageManagement.PackageManager",
      "org.pentaho.packageManagement.DefaultPackageManager",
      "weka.core.Version",
      "weka.core.Environment",
      "weka.core.WekaPackageManager",
      "weka.core.Capabilities$Capability",
      "weka.attributeSelection.CfsSubsetEval",
      "weka.core.converters.ArffLoader$ArffReader",
      "weka.classifiers.AbstractClassifier",
      "weka.classifiers.RandomizableClassifier",
      "weka.classifiers.functions.SGDText",
      "weka.core.tokenizers.Tokenizer",
      "weka.core.tokenizers.CharacterDelimitedTokenizer",
      "weka.core.tokenizers.WordTokenizer",
      "weka.core.stemmers.NullStemmer",
      "weka.classifiers.lazy.IBk",
      "weka.core.neighboursearch.NearestNeighbourSearch",
      "weka.core.neighboursearch.LinearNNSearch",
      "weka.core.NormalizableDistance",
      "weka.core.EuclideanDistance",
      "weka.classifiers.MultipleClassifiersCombiner",
      "weka.classifiers.RandomizableMultipleClassifiersCombiner",
      "weka.classifiers.meta.Vote",
      "weka.classifiers.rules.ZeroR",
      "weka.attributeSelection.WrapperSubsetEval",
      "weka.classifiers.functions.supportVector.Kernel",
      "weka.classifiers.functions.supportVector.StringKernel",
      "weka.core.Attribute",
      "weka.core.ProtectedProperties",
      "weka.attributeSelection.OneRAttributeEval",
      "weka.classifiers.bayes.BayesNet",
      "weka.classifiers.bayes.net.search.SearchAlgorithm",
      "weka.classifiers.bayes.net.search.local.LocalScoreSearchAlgorithm",
      "weka.classifiers.bayes.net.search.local.K2",
      "weka.classifiers.bayes.net.estimate.BayesNetEstimator",
      "weka.classifiers.bayes.net.estimate.SimpleEstimator",
      "weka.classifiers.Evaluation",
      "weka.attributeSelection.ReliefFAttributeEval",
      "weka.classifiers.functions.GaussianProcesses",
      "weka.classifiers.functions.supportVector.CachedKernel",
      "weka.classifiers.functions.supportVector.PolyKernel",
      "weka.attributeSelection.InfoGainAttributeEval",
      "weka.core.AbstractInstance",
      "weka.core.SparseInstance",
      "weka.attributeSelection.AttributeSelection",
      "weka.core.BinarySparseInstance",
      "weka.core.neighboursearch.CoverTree",
      "weka.core.DenseInstance",
      "weka.attributeSelection.CorrelationAttributeEval",
      "weka.core.SerializedObject",
      "weka.core.UnassignedDatasetException",
      "weka.attributeSelection.SymmetricalUncertAttributeEval",
      "weka.classifiers.SingleClassifierEnhancer",
      "weka.classifiers.misc.InputMappedClassifier",
      "weka.classifiers.meta.AttributeSelectedClassifier",
      "weka.classifiers.trees.J48",
      "weka.classifiers.RandomizableSingleClassifierEnhancer",
      "weka.classifiers.meta.CostSensitiveClassifier",
      "weka.core.WekaEnumeration",
      "weka.filters.unsupervised.attribute.Remove",
      "weka.classifiers.rules.DecisionTable",
      "weka.core.tokenizers.NGramTokenizer",
      "weka.classifiers.functions.SMOreg",
      "weka.classifiers.functions.supportVector.RegOptimizer",
      "weka.classifiers.functions.supportVector.RegSMO",
      "weka.classifiers.functions.supportVector.RegSMOImproved",
      "weka.classifiers.meta.FilteredClassifier",
      "weka.filters.supervised.attribute.AttributeSelection",
      "weka.filters.supervised.attribute.Discretize",
      "weka.core.neighboursearch.balltrees.BallNode",
      "weka.core.neighboursearch.PerformanceStats",
      "weka.core.neighboursearch.NearestNeighbourSearch$MyHeap",
      "weka.core.neighboursearch.NearestNeighbourSearch$MyHeapElement",
      "weka.core.neighboursearch.BallTree",
      "weka.core.neighboursearch.balltrees.BallTreeConstructor",
      "weka.core.neighboursearch.balltrees.TopDownConstructor",
      "weka.core.neighboursearch.balltrees.BallSplitter",
      "weka.core.neighboursearch.balltrees.PointsClosestToFurthestChildren",
      "weka.classifiers.functions.LinearRegression",
      "weka.filters.SimpleFilter",
      "weka.filters.SimpleStreamFilter",
      "weka.filters.MultiFilter",
      "weka.core.Attribute$1",
      "weka.classifiers.meta.RegressionByDiscretization",
      "weka.filters.unsupervised.attribute.PotentialClassIgnorer",
      "weka.filters.unsupervised.attribute.Discretize",
      "weka.classifiers.functions.SMO",
      "weka.core.TechnicalInformation",
      "weka.core.TechnicalInformation$Type",
      "weka.core.TechnicalInformation$Field",
      "weka.core.AttributeStats",
      "weka.core.neighboursearch.KDTree",
      "weka.core.neighboursearch.kdtrees.KDTreeNodeSplitter",
      "weka.core.neighboursearch.kdtrees.SlidingMidPointOfWidestSide",
      "weka.core.UnassignedClassException",
      "weka.classifiers.lazy.KStar",
      "weka.classifiers.bayes.net.BIFReader",
      "weka.core.neighboursearch.balltrees.BottomUpConstructor",
      "weka.classifiers.IteratedSingleClassifierEnhancer",
      "weka.classifiers.ParallelIteratedSingleClassifierEnhancer",
      "weka.classifiers.RandomizableParallelIteratedSingleClassifierEnhancer",
      "weka.classifiers.meta.RandomSubSpace",
      "weka.classifiers.trees.REPTree",
      "weka.experiment.Stats",
      "weka.core.WekaException",
      "weka.classifiers.meta.MultiClassClassifier",
      "weka.classifiers.meta.MultiClassClassifierUpdateable",
      "weka.classifiers.functions.Logistic",
      "weka.attributeSelection.Ranker",
      "weka.core.tokenizers.AlphabeticTokenizer",
      "weka.classifiers.functions.SGD",
      "weka.classifiers.bayes.NaiveBayesMultinomialText$Count",
      "weka.classifiers.functions.neural.NeuralConnection",
      "weka.classifiers.functions.MultilayerPerceptron$NeuralEnd",
      "weka.core.SerializationHelper",
      "weka.classifiers.trees.RandomForest"
    );
  }
}
