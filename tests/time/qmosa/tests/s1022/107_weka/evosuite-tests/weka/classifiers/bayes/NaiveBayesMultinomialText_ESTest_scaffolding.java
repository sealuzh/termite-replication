/**
 * Scaffolding file used to store all the setups needed to run 
 * tests automatically generated by EvoSuite
 * Mon Nov 30 08:29:07 GMT 2020
 */

package weka.classifiers.bayes;

import org.evosuite.runtime.annotation.EvoSuiteClassExclude;
import org.junit.BeforeClass;
import org.junit.Before;
import org.junit.After;
import org.junit.AfterClass;
import org.evosuite.runtime.sandbox.Sandbox;
import org.evosuite.runtime.sandbox.Sandbox.SandboxMode;

@EvoSuiteClassExclude
public class NaiveBayesMultinomialText_ESTest_scaffolding {

  @org.junit.Rule 
  public org.evosuite.runtime.vnet.NonFunctionalRequirementRule nfr = new org.evosuite.runtime.vnet.NonFunctionalRequirementRule();

  private static final java.util.Properties defaultProperties = (java.util.Properties) java.lang.System.getProperties().clone(); 

  private org.evosuite.runtime.thread.ThreadStopper threadStopper =  new org.evosuite.runtime.thread.ThreadStopper (org.evosuite.runtime.thread.KillSwitchHandler.getInstance(), 3000);


  @BeforeClass 
  public static void initEvoSuiteFramework() { 
    org.evosuite.runtime.RuntimeSettings.className = "weka.classifiers.bayes.NaiveBayesMultinomialText"; 
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
    java.lang.System.setProperty("user.dir", "/home/ubuntu/termite/projects/107_weka"); 
    java.lang.System.setProperty("user.home", "/home/ubuntu"); 
    java.lang.System.setProperty("user.language", "en"); 
    java.lang.System.setProperty("user.name", "ubuntu"); 
    java.lang.System.setProperty("user.timezone", "Etc/UTC"); 
  }

  private static void initializeClasses() {
    org.evosuite.runtime.classhandling.ClassStateSupport.initializeClasses(NaiveBayesMultinomialText_ESTest_scaffolding.class.getClassLoader() ,
      "weka.core.Environment",
      "org.pentaho.packageManagement.VersionPackageConstraint$VersionComparison",
      "weka.filters.unsupervised.attribute.NominalToBinary",
      "weka.classifiers.functions.MultilayerPerceptron$ControlPanel",
      "weka.core.matrix.CholeskyDecomposition",
      "org.pentaho.packageManagement.PackageConstraint",
      "weka.core.neighboursearch.balltrees.BottomUpConstructor$TempNode",
      "weka.attributeSelection.ReliefFAttributeEval",
      "weka.core.xml.XMLBasicSerialization",
      "weka.filters.UnsupervisedFilter",
      "weka.core.neighboursearch.BallTree",
      "weka.core.neighboursearch.CoverTree$DistanceNode",
      "weka.classifiers.evaluation.output.prediction.AbstractOutput",
      "weka.core.DenseInstance",
      "weka.classifiers.trees.J48",
      "weka.classifiers.functions.SimpleLinearRegression",
      "weka.classifiers.rules.DecisionTable$DummySubsetEvaluator",
      "org.pentaho.packageManagement.DefaultPackageManager",
      "weka.core.Optimization$DynamicIntArray",
      "org.bounce.net.DefaultAuthenticator",
      "weka.classifiers.trees.j48.BinC45Split",
      "weka.filters.SimpleStreamFilter",
      "weka.core.neighboursearch.CoverTree$MyHeap",
      "weka.estimators.IncrementalEstimator",
      "weka.core.neighboursearch.KDTree",
      "weka.core.stemmers.NullStemmer",
      "weka.classifiers.functions.SGDText",
      "weka.core.CustomDisplayStringProvider",
      "weka.core.NormalizableDistance",
      "weka.classifiers.functions.SMOreg",
      "weka.classifiers.trees.j48.InfoGainSplitCrit",
      "weka.core.TechnicalInformation$Type",
      "weka.core.Copyable",
      "weka.core.BinarySparseInstance",
      "weka.classifiers.bayes.NaiveBayesMultinomialText$Count",
      "weka.filters.supervised.attribute.NominalToBinary",
      "weka.classifiers.RandomizableMultipleClassifiersCombiner",
      "weka.core.SerializedObject",
      "weka.clusterers.UpdateableClusterer",
      "weka.core.AdditionalMeasureProducer",
      "weka.core.neighboursearch.balltrees.BallNode",
      "weka.classifiers.RandomizableIteratedSingleClassifierEnhancer",
      "weka.attributeSelection.GreedyStepwise",
      "weka.core.Optimization",
      "weka.classifiers.lazy.kstar.KStarConstants",
      "weka.classifiers.meta.FilteredClassifier",
      "weka.classifiers.functions.supportVector.RegOptimizer",
      "weka.classifiers.misc.InputMappedClassifier",
      "weka.classifiers.functions.neural.NeuralConnection",
      "weka.core.Version",
      "weka.attributeSelection.AttributeSelection",
      "weka.classifiers.bayes.net.estimate.SimpleEstimator",
      "org.pentaho.packageManagement.VersionPackageConstraint$VersionComparison$1",
      "org.pentaho.packageManagement.VersionPackageConstraint$VersionComparison$2",
      "org.pentaho.packageManagement.VersionPackageConstraint$VersionComparison$3",
      "weka.classifiers.trees.j48.EntropyBasedSplitCrit",
      "weka.core.neighboursearch.CoverTree",
      "weka.classifiers.AbstractClassifier",
      "weka.core.FindWithCapabilities",
      "weka.filters.unsupervised.attribute.Center",
      "weka.attributeSelection.GainRatioAttributeEval",
      "weka.core.WekaException",
      "weka.classifiers.functions.neural.NeuralNode",
      "weka.core.ClassDiscovery",
      "org.pentaho.packageManagement.VersionPackageConstraint$VersionComparison$4",
      "weka.classifiers.trees.RandomForest",
      "org.pentaho.packageManagement.VersionPackageConstraint$VersionComparison$5",
      "weka.filters.StreamableFilter",
      "weka.core.neighboursearch.NearestNeighbourSearch$MyHeapElement",
      "weka.core.Attribute$1",
      "weka.core.PartitionGenerator",
      "weka.core.neighboursearch.NearestNeighbourSearch$NeighborList",
      "weka.classifiers.functions.MultilayerPerceptron$NeuralEnd",
      "weka.core.SparseInstance",
      "weka.estimators.PoissonEstimator",
      "weka.classifiers.trees.j48.ClassifierSplitModel",
      "weka.attributeSelection.AttributeTransformer",
      "weka.core.tokenizers.WordTokenizer",
      "weka.classifiers.trees.j48.ClassifierTree",
      "weka.classifiers.misc.SerializedClassifier",
      "weka.classifiers.functions.MultilayerPerceptron",
      "weka.filters.unsupervised.attribute.ReplaceMissingValues",
      "weka.attributeSelection.PrincipalComponents",
      "weka.classifiers.trees.j48.C45Split",
      "weka.core.neighboursearch.CoverTree$MyHeapElement",
      "weka.core.stemmers.SnowballStemmer",
      "weka.core.neighboursearch.kdtrees.KDTreeNode",
      "weka.classifiers.functions.VotedPerceptron",
      "weka.classifiers.trees.j48.PruneableClassifierTree",
      "weka.classifiers.Evaluation",
      "weka.classifiers.functions.supportVector.Kernel",
      "weka.classifiers.functions.neural.LinearUnit",
      "weka.classifiers.bayes.net.search.SearchAlgorithm",
      "weka.core.neighboursearch.LinearNNSearch",
      "weka.core.neighboursearch.PerformanceStats",
      "weka.estimators.KernelEstimator",
      "weka.core.neighboursearch.balltrees.BottomUpConstructor",
      "weka.core.Stopwords",
      "weka.core.tokenizers.AlphabeticTokenizer",
      "weka.core.neighboursearch.balltrees.PointsClosestToFurthestChildren",
      "weka.core.matrix.EigenvalueDecomposition",
      "weka.core.UnassignedDatasetException",
      "weka.core.tokenizers.NGramTokenizer",
      "weka.core.neighboursearch.balltrees.BallTreeConstructor",
      "weka.classifiers.RandomizableClassifier",
      "weka.attributeSelection.RankedOutputSearch",
      "weka.core.RevisionUtils",
      "weka.classifiers.meta.RandomCommittee",
      "weka.classifiers.functions.supportVector.RegSMO",
      "weka.core.converters.Loader",
      "weka.core.ProtectedProperties",
      "weka.estimators.Estimator",
      "weka.classifiers.meta.Vote",
      "weka.core.StringLocator",
      "weka.core.AttributeStats",
      "weka.filters.MultiFilter",
      "weka.classifiers.trees.DecisionStump",
      "weka.classifiers.bayes.net.search.local.LocalScoreSearchAlgorithm",
      "weka.core.neighboursearch.covertrees.Stack",
      "weka.filters.unsupervised.attribute.Remove",
      "weka.core.Randomizable",
      "weka.classifiers.trees.j48.NoSplit",
      "weka.core.EuclideanDistance",
      "weka.core.Instances",
      "weka.classifiers.bayes.NaiveBayesMultinomial",
      "weka.classifiers.bayes.net.BIFReader",
      "org.pentaho.packageManagement.VersionRangePackageConstraint",
      "weka.classifiers.bayes.net.ParentSet",
      "weka.attributeSelection.Ranker",
      "weka.core.UnsupportedAttributeTypeException",
      "weka.core.TechnicalInformation",
      "weka.classifiers.functions.Logistic$OptEngCG",
      "weka.core.RevisionHandler",
      "weka.core.converters.ConverterUtils$DataSource",
      "weka.classifiers.xml.XMLClassifier",
      "weka.filters.Filter",
      "weka.filters.supervised.attribute.Discretize",
      "weka.core.TestInstances",
      "weka.core.DistanceFunction",
      "weka.attributeSelection.AttributeEvaluator",
      "org.pentaho.packageManagement.Package",
      "weka.classifiers.trees.m5.M5Base",
      "weka.attributeSelection.SubsetEvaluator",
      "weka.classifiers.CostMatrix",
      "weka.core.neighboursearch.NearestNeighbourSearch$NeighborNode",
      "weka.classifiers.bayes.net.search.local.K2",
      "weka.core.logging.Logger$Level",
      "weka.classifiers.functions.supportVector.NormalizedPolyKernel",
      "weka.core.neighboursearch.kdtrees.KDTreeNodeSplitter",
      "weka.attributeSelection.CfsSubsetEval",
      "weka.core.RevisionUtils$Type",
      "weka.core.ConjugateGradientOptimization",
      "weka.classifiers.functions.LinearRegression",
      "weka.core.stemmers.Stemmer",
      "weka.classifiers.functions.supportVector.PrecomputedKernelMatrixKernel",
      "weka.classifiers.RandomizableSingleClassifierEnhancer",
      "weka.classifiers.meta.LogitBoost",
      "weka.classifiers.bayes.NaiveBayes",
      "weka.filters.SimpleFilter",
      "weka.estimators.EstimatorUtils",
      "org.pentaho.packageManagement.VersionPackageConstraint",
      "weka.estimators.Estimator$Builder",
      "weka.core.EnvironmentHandler",
      "weka.classifiers.trees.j48.C45ModelSelection",
      "weka.classifiers.functions.Logistic",
      "weka.classifiers.trees.m5.RuleNode",
      "weka.core.RelationalLocator",
      "weka.core.Utils",
      "weka.classifiers.trees.m5.PreConstructedLinearModel",
      "weka.core.tokenizers.Tokenizer",
      "weka.core.NoSupportForMissingValuesException",
      "weka.classifiers.UpdateableClassifier",
      "weka.classifiers.bayes.NaiveBayesMultinomialText",
      "weka.core.MultiInstanceCapabilitiesHandler",
      "weka.core.Capabilities",
      "weka.core.neighboursearch.balltrees.TopDownConstructor",
      "weka.core.AttributeLocator",
      "weka.classifiers.functions.supportVector.CachedKernel",
      "weka.core.Summarizable",
      "weka.attributeSelection.BestFirst",
      "weka.classifiers.trees.j48.ModelSelection",
      "org.pentaho.packageManagement.PackageManager$1",
      "weka.core.Drawable",
      "weka.core.matrix.Matrix",
      "weka.classifiers.ConditionalDensityEstimator",
      "weka.core.SingleIndex",
      "weka.core.CapabilitiesHandler",
      "weka.core.neighboursearch.NearestNeighbourSearch$MyHeap",
      "weka.attributeSelection.ASEvaluation",
      "weka.classifiers.functions.supportVector.StringKernel",
      "weka.core.AbstractInstance",
      "weka.core.SelectedTag",
      "org.pentaho.packageManagement.DefaultPackage",
      "weka.estimators.DiscreteEstimator",
      "weka.core.neighboursearch.balltrees.BallSplitter",
      "weka.core.matrix.LUDecomposition",
      "weka.classifiers.bayes.BayesNet",
      "weka.classifiers.trees.j48.C45PruneableClassifierTree",
      "weka.classifiers.ParallelIteratedSingleClassifierEnhancer",
      "weka.filters.AllFilter",
      "weka.filters.unsupervised.attribute.RemoveUseless",
      "weka.core.matrix.SingularValueDecomposition",
      "weka.core.Tag",
      "weka.classifiers.IteratedSingleClassifierEnhancer",
      "weka.classifiers.trees.j48.BinC45ModelSelection",
      "weka.core.OptionHandler",
      "weka.classifiers.trees.j48.Distribution",
      "weka.core.neighboursearch.kdtrees.SlidingMidPointOfWidestSide",
      "weka.filters.supervised.attribute.AttributeSelection",
      "weka.core.Range",
      "weka.classifiers.bayes.net.VaryNode",
      "weka.classifiers.Classifier",
      "weka.attributeSelection.InfoGainAttributeEval",
      "weka.attributeSelection.OneRAttributeEval",
      "weka.core.Capabilities$Capability",
      "org.pentaho.packageManagement.PackageManager",
      "weka.core.WekaEnumeration",
      "weka.classifiers.trees.M5P",
      "weka.core.matrix.QRDecomposition",
      "weka.core.stemmers.LovinsStemmer",
      "weka.core.WekaPackageManager",
      "weka.attributeSelection.ASSearch",
      "weka.filters.SupervisedFilter",
      "weka.core.TechnicalInformationHandler",
      "weka.classifiers.functions.SimpleLogistic",
      "weka.classifiers.lazy.LWL",
      "weka.attributeSelection.StartSetHandler",
      "weka.core.tokenizers.CharacterDelimitedTokenizer",
      "weka.core.Option",
      "weka.classifiers.meta.CostSensitiveClassifier",
      "weka.filters.unsupervised.attribute.PotentialClassIgnorer",
      "weka.estimators.NormalEstimator",
      "weka.classifiers.functions.neural.NeuralMethod",
      "weka.filters.unsupervised.attribute.NumericToBinary",
      "weka.filters.Sourcable",
      "weka.core.Attribute",
      "weka.classifiers.functions.MultilayerPerceptron$NodePanel",
      "weka.classifiers.rules.DecisionTable",
      "weka.core.matrix.LinearRegression",
      "weka.core.FastVector",
      "weka.core.xml.XMLDocument",
      "weka.classifiers.MultipleClassifiersCombiner",
      "weka.classifiers.bayes.net.estimate.BayesNetEstimator",
      "weka.classifiers.functions.supportVector.RegSMOImproved",
      "weka.classifiers.functions.neural.SigmoidUnit",
      "weka.classifiers.trees.RandomTree",
      "weka.classifiers.SingleClassifierEnhancer",
      "weka.core.Instance",
      "weka.classifiers.functions.supportVector.PolyKernel",
      "weka.classifiers.lazy.KStar",
      "weka.classifiers.IntervalEstimator",
      "weka.classifiers.bayes.net.ADNode",
      "weka.core.Matchable",
      "weka.core.WeightedInstancesHandler",
      "weka.core.neighboursearch.NearestNeighbourSearch",
      "weka.classifiers.functions.GaussianProcesses",
      "weka.classifiers.trees.j48.SplitCriterion",
      "weka.core.TechnicalInformation$Field",
      "weka.filters.unsupervised.attribute.Discretize",
      "weka.classifiers.functions.MultilayerPerceptron$ControlPanel$2",
      "weka.classifiers.functions.MultilayerPerceptron$ControlPanel$1",
      "weka.classifiers.meta.AttributeSelectedClassifier",
      "weka.core.neighboursearch.CoverTree$CoverTreeNode",
      "weka.classifiers.trees.j48.GainRatioSplitCrit",
      "weka.filters.unsupervised.attribute.Normalize",
      "weka.core.UnassignedClassException",
      "weka.classifiers.trees.m5.SplitEvaluate",
      "weka.classifiers.rules.ZeroR",
      "weka.attributeSelection.UnsupervisedAttributeEvaluator",
      "weka.filters.unsupervised.attribute.Standardize",
      "weka.core.stemmers.IteratedLovinsStemmer",
      "weka.classifiers.Sourcable",
      "weka.classifiers.functions.Logistic$OptEng",
      "weka.classifiers.evaluation.output.prediction.PlainText",
      "weka.core.xml.XMLSerialization",
      "weka.core.neighboursearch.TreePerformanceStats",
      "weka.filters.unsupervised.attribute.MakeIndicator",
      "weka.classifiers.meta.ClassificationViaRegression",
      "weka.classifiers.lazy.IBk",
      "weka.classifiers.RandomizableParallelIteratedSingleClassifierEnhancer"
    );
  } 

  private static void resetClasses() {
    org.evosuite.runtime.classhandling.ClassResetter.getInstance().setClassLoader(NaiveBayesMultinomialText_ESTest_scaffolding.class.getClassLoader()); 

    org.evosuite.runtime.classhandling.ClassStateSupport.resetClasses(
      "weka.classifiers.AbstractClassifier",
      "weka.classifiers.bayes.NaiveBayesMultinomialText",
      "weka.classifiers.bayes.NaiveBayesMultinomialText$Count",
      "weka.core.Capabilities$Capability",
      "weka.core.tokenizers.Tokenizer",
      "weka.core.tokenizers.CharacterDelimitedTokenizer",
      "weka.core.tokenizers.WordTokenizer",
      "weka.core.stemmers.NullStemmer",
      "weka.core.Utils",
      "weka.core.AbstractInstance",
      "weka.core.SparseInstance",
      "weka.classifiers.bayes.NaiveBayes",
      "weka.classifiers.Evaluation",
      "weka.core.Option",
      "weka.core.Capabilities",
      "org.pentaho.packageManagement.PackageManager",
      "org.pentaho.packageManagement.DefaultPackageManager",
      "weka.core.Version",
      "weka.core.Environment",
      "weka.core.WekaPackageManager",
      "weka.core.BinarySparseInstance",
      "weka.core.UnassignedDatasetException",
      "weka.core.stemmers.SnowballStemmer",
      "weka.core.Tag",
      "weka.classifiers.lazy.IBk",
      "weka.core.neighboursearch.NearestNeighbourSearch",
      "weka.core.neighboursearch.LinearNNSearch",
      "weka.core.NormalizableDistance",
      "weka.core.EuclideanDistance",
      "weka.core.Range",
      "weka.core.neighboursearch.CoverTree",
      "weka.core.Instances",
      "weka.core.neighboursearch.NearestNeighbourSearch$MyHeap",
      "weka.core.neighboursearch.NearestNeighbourSearch$MyHeapElement",
      "weka.attributeSelection.ASEvaluation",
      "weka.attributeSelection.UnsupervisedAttributeEvaluator",
      "weka.attributeSelection.PrincipalComponents",
      "weka.core.TestInstances",
      "weka.core.Attribute",
      "weka.core.ProtectedProperties",
      "weka.core.DenseInstance",
      "weka.core.tokenizers.NGramTokenizer",
      "weka.classifiers.bayes.BayesNet",
      "weka.classifiers.bayes.net.search.SearchAlgorithm",
      "weka.classifiers.bayes.net.search.local.LocalScoreSearchAlgorithm",
      "weka.classifiers.bayes.net.search.local.K2",
      "weka.classifiers.bayes.net.estimate.BayesNetEstimator",
      "weka.classifiers.bayes.net.estimate.SimpleEstimator",
      "weka.classifiers.functions.SimpleLogistic",
      "weka.core.RevisionUtils",
      "weka.core.TechnicalInformation",
      "weka.core.TechnicalInformation$Type",
      "weka.core.TechnicalInformation$Field",
      "weka.core.tokenizers.AlphabeticTokenizer",
      "weka.core.SerializedObject",
      "weka.classifiers.RandomizableClassifier",
      "weka.classifiers.functions.SGDText",
      "weka.core.neighboursearch.BallTree",
      "weka.core.neighboursearch.balltrees.BallTreeConstructor",
      "weka.core.neighboursearch.balltrees.TopDownConstructor",
      "weka.core.neighboursearch.balltrees.BallSplitter",
      "weka.core.neighboursearch.balltrees.PointsClosestToFurthestChildren",
      "weka.core.stemmers.LovinsStemmer",
      "weka.core.stemmers.IteratedLovinsStemmer",
      "weka.classifiers.SingleClassifierEnhancer",
      "weka.classifiers.misc.InputMappedClassifier",
      "weka.classifiers.rules.ZeroR",
      "weka.filters.Filter",
      "weka.filters.supervised.attribute.Discretize",
      "weka.core.Stopwords",
      "weka.filters.unsupervised.attribute.PotentialClassIgnorer",
      "weka.filters.unsupervised.attribute.ReplaceMissingValues",
      "weka.core.neighboursearch.balltrees.BallNode",
      "weka.core.neighboursearch.KDTree",
      "weka.core.neighboursearch.kdtrees.KDTreeNodeSplitter",
      "weka.core.neighboursearch.kdtrees.SlidingMidPointOfWidestSide",
      "weka.classifiers.functions.VotedPerceptron",
      "weka.classifiers.bayes.net.BIFReader",
      "weka.classifiers.functions.supportVector.Kernel",
      "weka.classifiers.functions.supportVector.CachedKernel",
      "weka.classifiers.functions.supportVector.PolyKernel",
      "weka.classifiers.functions.supportVector.NormalizedPolyKernel",
      "weka.classifiers.RandomizableSingleClassifierEnhancer",
      "weka.classifiers.meta.CostSensitiveClassifier",
      "weka.classifiers.CostMatrix",
      "weka.classifiers.bayes.NaiveBayesMultinomial",
      "weka.attributeSelection.GainRatioAttributeEval",
      "weka.classifiers.meta.FilteredClassifier",
      "weka.filters.supervised.attribute.AttributeSelection",
      "weka.attributeSelection.AttributeSelection",
      "weka.attributeSelection.CfsSubsetEval",
      "weka.attributeSelection.ASSearch",
      "weka.attributeSelection.GreedyStepwise",
      "weka.attributeSelection.BestFirst",
      "weka.classifiers.trees.J48",
      "weka.classifiers.IteratedSingleClassifierEnhancer",
      "weka.classifiers.ParallelIteratedSingleClassifierEnhancer",
      "weka.classifiers.RandomizableParallelIteratedSingleClassifierEnhancer",
      "weka.classifiers.meta.RandomCommittee",
      "weka.classifiers.trees.RandomTree",
      "weka.core.FindWithCapabilities",
      "weka.core.SingleIndex",
      "weka.estimators.Estimator",
      "weka.estimators.NormalEstimator",
      "weka.attributeSelection.InfoGainAttributeEval",
      "weka.core.WekaEnumeration",
      "weka.core.Attribute$1",
      "weka.core.WekaException",
      "weka.core.UnsupportedAttributeTypeException",
      "weka.classifiers.functions.GaussianProcesses",
      "weka.classifiers.functions.SMOreg",
      "weka.classifiers.functions.supportVector.RegOptimizer",
      "weka.classifiers.functions.supportVector.RegSMO",
      "weka.classifiers.functions.supportVector.RegSMOImproved",
      "weka.core.neighboursearch.kdtrees.KDTreeNode",
      "weka.estimators.KernelEstimator",
      "weka.estimators.PoissonEstimator",
      "weka.classifiers.trees.RandomForest",
      "weka.classifiers.functions.MultilayerPerceptron",
      "weka.core.FastVector",
      "weka.filters.unsupervised.attribute.NominalToBinary",
      "weka.classifiers.functions.neural.SigmoidUnit",
      "weka.classifiers.functions.neural.LinearUnit",
      "weka.filters.SimpleFilter",
      "weka.filters.SimpleStreamFilter",
      "weka.filters.MultiFilter",
      "weka.filters.AllFilter",
      "weka.core.SelectedTag",
      "weka.classifiers.functions.Logistic",
      "weka.classifiers.lazy.KStar",
      "weka.classifiers.functions.supportVector.StringKernel",
      "weka.classifiers.RandomizableIteratedSingleClassifierEnhancer",
      "weka.classifiers.meta.LogitBoost",
      "weka.classifiers.trees.DecisionStump",
      "weka.classifiers.misc.SerializedClassifier",
      "weka.attributeSelection.ReliefFAttributeEval",
      "weka.estimators.DiscreteEstimator",
      "weka.classifiers.MultipleClassifiersCombiner",
      "weka.classifiers.RandomizableMultipleClassifiersCombiner",
      "weka.classifiers.meta.Vote",
      "weka.core.neighboursearch.balltrees.BottomUpConstructor",
      "weka.core.UnassignedClassException",
      "weka.classifiers.functions.SimpleLinearRegression",
      "weka.estimators.EstimatorUtils",
      "weka.classifiers.meta.AttributeSelectedClassifier",
      "weka.classifiers.functions.supportVector.PrecomputedKernelMatrixKernel",
      "weka.classifiers.lazy.LWL",
      "weka.classifiers.meta.ClassificationViaRegression",
      "weka.classifiers.trees.m5.M5Base",
      "weka.classifiers.trees.M5P",
      "weka.classifiers.functions.LinearRegression",
      "weka.attributeSelection.OneRAttributeEval",
      "weka.classifiers.rules.DecisionTable",
      "weka.core.ClassDiscovery"
    );
  }
}
