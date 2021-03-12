/**
 * Scaffolding file used to store all the setups needed to run 
 * tests automatically generated by EvoSuite
 * Sat Nov 07 10:55:18 GMT 2020
 */

package weka.classifiers;

import org.evosuite.runtime.annotation.EvoSuiteClassExclude;
import org.junit.BeforeClass;
import org.junit.Before;
import org.junit.After;
import org.junit.AfterClass;
import org.evosuite.runtime.sandbox.Sandbox;
import org.evosuite.runtime.sandbox.Sandbox.SandboxMode;

@EvoSuiteClassExclude
public class Evaluation_ESTest_scaffolding {

  @org.junit.Rule 
  public org.evosuite.runtime.vnet.NonFunctionalRequirementRule nfr = new org.evosuite.runtime.vnet.NonFunctionalRequirementRule();

  private static final java.util.Properties defaultProperties = (java.util.Properties) java.lang.System.getProperties().clone(); 

  private org.evosuite.runtime.thread.ThreadStopper threadStopper =  new org.evosuite.runtime.thread.ThreadStopper (org.evosuite.runtime.thread.KillSwitchHandler.getInstance(), 3000);


  @BeforeClass 
  public static void initEvoSuiteFramework() { 
    org.evosuite.runtime.RuntimeSettings.className = "weka.classifiers.Evaluation"; 
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
    java.lang.System.setProperty("user.dir", "/home/ubuntu/replication/scripts/projects/107_weka"); 
    java.lang.System.setProperty("user.home", "/home/ubuntu"); 
    java.lang.System.setProperty("user.language", "en"); 
    java.lang.System.setProperty("user.name", "ubuntu"); 
    java.lang.System.setProperty("user.timezone", "Etc/UTC"); 
  }

  private static void initializeClasses() {
    org.evosuite.runtime.classhandling.ClassStateSupport.initializeClasses(Evaluation_ESTest_scaffolding.class.getClassLoader() ,
      "weka.core.Environment",
      "weka.clusterers.AbstractClusterer",
      "weka.core.matrix.CholeskyDecomposition",
      "weka.core.converters.TextDirectoryLoader",
      "weka.core.neighboursearch.balltrees.BottomUpConstructor$TempNode",
      "weka.core.converters.Saver",
      "weka.core.xml.XMLBasicSerialization",
      "weka.core.neighboursearch.BallTree",
      "weka.core.neighboursearch.CoverTree$DistanceNode",
      "weka.core.ClassCache",
      "weka.classifiers.evaluation.output.prediction.AbstractOutput",
      "weka.core.DenseInstance",
      "weka.core.converters.DatabaseConverter",
      "weka.classifiers.rules.DecisionTable$DummySubsetEvaluator",
      "weka.classifiers.evaluation.output.prediction.CSV",
      "weka.core.Optimization$DynamicIntArray",
      "weka.estimators.UnivariateIntervalEstimator",
      "weka.gui.GenericPropertiesCreator",
      "weka.filters.SimpleStreamFilter",
      "weka.gui.PropertyText",
      "weka.core.stemmers.NullStemmer",
      "weka.core.CustomDisplayStringProvider",
      "weka.classifiers.meta.AdaBoostM1",
      "weka.core.NormalizableDistance",
      "weka.classifiers.rules.Rule",
      "weka.classifiers.functions.SMOreg",
      "weka.clusterers.SimpleKMeans",
      "weka.core.TechnicalInformation$Type",
      "weka.core.Copyable",
      "weka.gui.PropertyValueSelector",
      "weka.core.BinarySparseInstance",
      "weka.classifiers.RandomizableMultipleClassifiersCombiner",
      "weka.core.SerializedObject",
      "weka.clusterers.UpdateableClusterer",
      "weka.core.Optimization",
      "weka.experiment.InstanceQuery",
      "weka.classifiers.pmml.consumer.PMMLClassifier",
      "weka.classifiers.lazy.kstar.KStarConstants",
      "weka.classifiers.meta.FilteredClassifier",
      "weka.classifiers.misc.InputMappedClassifier",
      "weka.experiment.ResultProducer",
      "weka.classifiers.functions.neural.NeuralConnection",
      "weka.classifiers.meta.MultiClassClassifier$Code",
      "weka.classifiers.bayes.net.estimate.SimpleEstimator",
      "weka.classifiers.pmml.consumer.Regression",
      "weka.experiment.InstanceQueryAdapter",
      "weka.classifiers.trees.j48.EntropyBasedSplitCrit",
      "weka.classifiers.evaluation.NominalPrediction",
      "weka.core.neighboursearch.CoverTree",
      "weka.classifiers.AbstractClassifier",
      "weka.filters.unsupervised.attribute.Center",
      "weka.core.FindWithCapabilities",
      "weka.core.WekaException",
      "weka.classifiers.functions.neural.NeuralNode",
      "weka.gui.GenericObjectEditor$1",
      "weka.core.Attribute$1",
      "weka.core.neighboursearch.NearestNeighbourSearch$MyHeapElement",
      "weka.core.PartitionGenerator",
      "weka.classifiers.trees.j48.ClassifierSplitModel",
      "weka.classifiers.trees.j48.ClassifierTree",
      "weka.core.tokenizers.WordTokenizer",
      "weka.core.pmml.PMMLModel",
      "weka.classifiers.misc.SerializedClassifier",
      "weka.core.neighboursearch.CoverTree$MyHeapElement",
      "weka.classifiers.pmml.consumer.GeneralRegression",
      "weka.classifiers.trees.j48.PruneableClassifierTree",
      "weka.classifiers.Evaluation",
      "weka.classifiers.functions.supportVector.Kernel",
      "weka.gui.CustomPanelSupplier",
      "weka.classifiers.functions.neural.LinearUnit",
      "weka.classifiers.evaluation.TwoClassStats",
      "weka.classifiers.evaluation.ThresholdCurve",
      "weka.classifiers.bayes.net.search.SearchAlgorithm",
      "weka.core.converters.FileSourcedConverter",
      "weka.core.converters.URLSourcedLoader",
      "weka.core.neighboursearch.CoverTree$d_node",
      "weka.core.neighboursearch.LinearNNSearch",
      "weka.core.converters.CSVSaver",
      "weka.core.neighboursearch.balltrees.BottomUpConstructor",
      "weka.core.converters.ArffSaver",
      "weka.core.tokenizers.AlphabeticTokenizer",
      "weka.classifiers.bayes.NaiveBayesMultinomialUpdateable",
      "weka.core.UnassignedDatasetException",
      "weka.core.tokenizers.NGramTokenizer",
      "weka.classifiers.meta.CVParameterSelection",
      "weka.attributeSelection.RankedOutputSearch",
      "weka.core.converters.Loader",
      "weka.classifiers.functions.supportVector.RegSMO",
      "weka.clusterers.RandomizableDensityBasedClusterer",
      "weka.core.StringLocator",
      "weka.filters.MultiFilter",
      "weka.classifiers.trees.DecisionStump",
      "weka.estimators.UnivariateQuantileEstimator",
      "weka.classifiers.bayes.net.search.local.LocalScoreSearchAlgorithm",
      "weka.classifiers.rules.JRip$NumericAntd",
      "weka.filters.unsupervised.attribute.Remove",
      "weka.core.Randomizable",
      "weka.classifiers.trees.LMT",
      "weka.core.Instances",
      "weka.classifiers.bayes.NaiveBayesMultinomial",
      "weka.core.converters.ConverterUtils$DataSink",
      "weka.classifiers.bayes.net.BIFReader",
      "weka.classifiers.bayes.net.ParentSet",
      "weka.core.xml.XMLInstances",
      "weka.core.converters.DatabaseConnection",
      "weka.core.TechnicalInformation",
      "weka.core.RevisionHandler",
      "weka.core.converters.ConverterUtils$DataSource",
      "weka.classifiers.rules.OneR$OneRRule",
      "weka.core.converters.ConverterUtils",
      "weka.core.DistanceFunction",
      "weka.core.converters.AbstractFileSaver",
      "weka.classifiers.trees.m5.M5Base",
      "weka.classifiers.rules.RuleStats",
      "weka.classifiers.CostMatrix",
      "weka.core.logging.Logger$Level",
      "weka.classifiers.pmml.consumer.TreeModel$SplitCharacteristic",
      "weka.classifiers.functions.supportVector.NormalizedPolyKernel",
      "weka.core.neighboursearch.kdtrees.KDTreeNodeSplitter",
      "weka.attributeSelection.CfsSubsetEval",
      "weka.core.ConjugateGradientOptimization",
      "weka.classifiers.functions.LinearRegression",
      "weka.core.stemmers.Stemmer",
      "weka.gui.PropertyPanel",
      "weka.classifiers.evaluation.output.prediction.Null",
      "weka.core.converters.IncrementalConverter",
      "weka.classifiers.RandomizableSingleClassifierEnhancer",
      "weka.classifiers.meta.LogitBoost",
      "weka.clusterers.FarthestFirst",
      "weka.classifiers.bayes.NaiveBayes",
      "weka.filters.SimpleFilter",
      "weka.clusterers.HierarchicalClusterer",
      "weka.estimators.Estimator$Builder",
      "weka.experiment.ResultListener",
      "weka.core.EnvironmentHandler",
      "weka.classifiers.trees.m5.RuleNode",
      "weka.classifiers.functions.Logistic",
      "weka.core.RelationalLocator",
      "weka.core.Utils",
      "weka.classifiers.trees.m5.PreConstructedLinearModel",
      "weka.core.converters.XRFFLoader",
      "weka.core.tokenizers.Tokenizer",
      "weka.classifiers.pmml.consumer.TreeModel$MissingValueStrategy",
      "weka.filters.unsupervised.instance.RemoveWithValues",
      "weka.core.pmml.FieldMetaInfo",
      "weka.gui.GenericObjectEditor$JTreePopupMenu",
      "weka.clusterers.AbstractDensityBasedClusterer",
      "weka.core.NoSupportForMissingValuesException",
      "weka.classifiers.bayes.NaiveBayesMultinomialText",
      "weka.classifiers.meta.MultiClassClassifier$ExhaustiveCode",
      "weka.classifiers.meta.RegressionByDiscretization",
      "weka.classifiers.trees.j48.ModelSelection",
      "org.pentaho.packageManagement.PackageManager$1",
      "weka.core.pmml.MiningSchema",
      "weka.classifiers.rules.part.ClassifierDecList",
      "weka.core.neighboursearch.NearestNeighbourSearch$MyHeap",
      "weka.attributeSelection.ASEvaluation",
      "weka.core.AbstractInstance",
      "weka.core.converters.LibSVMLoader",
      "org.pentaho.packageManagement.DefaultPackage",
      "weka.estimators.DiscreteEstimator",
      "weka.classifiers.bayes.NaiveBayesUpdateable",
      "weka.core.neighboursearch.balltrees.BallSplitter",
      "weka.classifiers.ParallelIteratedSingleClassifierEnhancer",
      "weka.classifiers.meta.AdditiveRegression",
      "weka.core.converters.AbstractLoader",
      "weka.classifiers.trees.lmt.ResidualModelSelection",
      "weka.core.Tag",
      "weka.estimators.UnivariateDensityEstimator",
      "weka.classifiers.trees.j48.Distribution",
      "weka.classifiers.trees.j48.EntropySplitCrit",
      "weka.core.Range",
      "weka.attributeSelection.WrapperSubsetEval",
      "weka.classifiers.evaluation.ConfusionMatrix",
      "weka.core.pmml.DefineFunction",
      "weka.core.Capabilities$Capability",
      "org.pentaho.packageManagement.PackageManager",
      "weka.gui.GenericObjectEditor",
      "weka.core.matrix.QRDecomposition",
      "weka.attributeSelection.ASSearch",
      "weka.classifiers.lazy.LWL",
      "weka.attributeSelection.StartSetHandler",
      "weka.classifiers.meta.CostSensitiveClassifier",
      "weka.core.tokenizers.CharacterDelimitedTokenizer",
      "weka.filters.unsupervised.attribute.PotentialClassIgnorer",
      "weka.core.AllJavadoc",
      "weka.classifiers.functions.neural.NeuralMethod",
      "weka.classifiers.pmml.consumer.TreeModel$1",
      "weka.core.neighboursearch.CoverTree$1",
      "weka.core.Attribute",
      "weka.core.pmml.BuiltInMath",
      "weka.core.BatchPredictor",
      "weka.classifiers.functions.supportVector.RegSMOImproved",
      "weka.classifiers.SingleClassifierEnhancer",
      "weka.core.Instance",
      "weka.core.converters.SerializedInstancesLoader",
      "weka.classifiers.functions.supportVector.PolyKernel",
      "weka.classifiers.IntervalEstimator",
      "weka.core.WeightedInstancesHandler",
      "weka.core.TechnicalInformation$Field",
      "weka.core.converters.DatabaseLoader",
      "weka.classifiers.functions.MultilayerPerceptron$ControlPanel$2",
      "weka.classifiers.functions.MultilayerPerceptron$ControlPanel$1",
      "weka.classifiers.meta.AttributeSelectedClassifier",
      "weka.gui.GenericObjectEditorHistory$HistorySelectionEvent",
      "weka.core.neighboursearch.CoverTree$CoverTreeNode",
      "weka.classifiers.trees.j48.GainRatioSplitCrit",
      "weka.filters.unsupervised.attribute.Normalize",
      "weka.classifiers.rules.OneR",
      "weka.classifiers.misc.InputMappedClassifierBeanInfo",
      "weka.classifiers.rules.JRip$Antd",
      "weka.core.pmml.PMMLFactory",
      "weka.filters.unsupervised.attribute.Standardize",
      "weka.attributeSelection.UnsupervisedAttributeEvaluator",
      "weka.classifiers.Sourcable",
      "weka.classifiers.functions.Logistic$OptEng",
      "weka.classifiers.evaluation.output.prediction.PlainText",
      "weka.gui.GenericObjectEditor$GOEPanel",
      "weka.classifiers.meta.ClassificationViaRegression",
      "weka.clusterers.MakeDensityBasedClusterer",
      "org.pentaho.packageManagement.VersionPackageConstraint$VersionComparison",
      "weka.filters.unsupervised.attribute.NominalToBinary",
      "weka.core.neighboursearch.balltrees.MiddleOutConstructor$TempNode",
      "weka.classifiers.functions.MultilayerPerceptron$ControlPanel",
      "weka.classifiers.functions.supportVector.RBFKernel",
      "org.pentaho.packageManagement.PackageConstraint",
      "weka.attributeSelection.ReliefFAttributeEval",
      "weka.classifiers.evaluation.output.prediction.XML",
      "weka.filters.UnsupervisedFilter",
      "weka.core.converters.XRFFSaver",
      "weka.classifiers.trees.J48",
      "weka.classifiers.rules.JRip$NominalAntd",
      "weka.classifiers.functions.SimpleLinearRegression",
      "weka.classifiers.pmml.consumer.TreeModel$MiningFunction",
      "org.pentaho.packageManagement.DefaultPackageManager",
      "org.bounce.net.DefaultAuthenticator",
      "weka.classifiers.trees.j48.BinC45Split",
      "weka.core.pmml.PMMLFactory$1",
      "weka.core.neighboursearch.CoverTree$MyHeap",
      "weka.core.converters.JSONLoader",
      "weka.filters.unsupervised.attribute.Add",
      "weka.estimators.IncrementalEstimator",
      "weka.clusterers.NumberOfClustersRequestable",
      "weka.core.neighboursearch.KDTree",
      "weka.core.ContingencyTables",
      "weka.classifiers.functions.SGDText",
      "weka.core.xml.KOML",
      "weka.classifiers.trees.j48.InfoGainSplitCrit",
      "weka.classifiers.trees.lmt.ResidualSplit",
      "weka.filters.supervised.attribute.NominalToBinary",
      "weka.gui.PropertySheetPanel$CapabilitiesHelpDialog",
      "weka.core.Matrix",
      "weka.core.pmml.BuiltInArithmetic",
      "weka.core.AdditionalMeasureProducer",
      "weka.core.neighboursearch.balltrees.BallNode",
      "weka.classifiers.RandomizableIteratedSingleClassifierEnhancer",
      "weka.core.converters.AbstractSaver",
      "weka.attributeSelection.GreedyStepwise",
      "weka.classifiers.meta.MultiClassClassifier",
      "weka.classifiers.pmml.consumer.Regression$Normalization",
      "weka.classifiers.functions.supportVector.RegOptimizer",
      "weka.core.Version",
      "weka.attributeSelection.AttributeSelection",
      "weka.gui.Logger",
      "weka.core.pmml.BuiltInString",
      "org.pentaho.packageManagement.VersionPackageConstraint$VersionComparison$1",
      "org.pentaho.packageManagement.VersionPackageConstraint$VersionComparison$2",
      "org.pentaho.packageManagement.VersionPackageConstraint$VersionComparison$3",
      "weka.core.converters.ArffLoader",
      "weka.classifiers.meta.Stacking",
      "weka.gui.GenericObjectEditor$GOETreeNode",
      "weka.core.ClassDiscovery",
      "org.pentaho.packageManagement.VersionPackageConstraint$VersionComparison$4",
      "weka.classifiers.trees.RandomForest",
      "org.pentaho.packageManagement.VersionPackageConstraint$VersionComparison$5",
      "weka.filters.StreamableFilter",
      "weka.core.neighboursearch.NearestNeighbourSearch$NeighborList",
      "weka.attributeSelection.SymmetricalUncertAttributeEval",
      "weka.core.converters.SerializedInstancesSaver",
      "weka.classifiers.functions.MultilayerPerceptron$NeuralEnd",
      "weka.core.SparseInstance",
      "weka.attributeSelection.AttributeTransformer",
      "weka.classifiers.functions.MultilayerPerceptron",
      "weka.filters.unsupervised.attribute.ReplaceMissingValues",
      "weka.classifiers.trees.j48.C45Split",
      "weka.attributeSelection.PrincipalComponents",
      "weka.gui.GenericObjectEditorHistory$HistorySelectionListener",
      "weka.classifiers.functions.VotedPerceptron",
      "weka.core.neighboursearch.kdtrees.KDTreeNode",
      "weka.core.converters.CSVLoader",
      "weka.classifiers.functions.SMO",
      "weka.classifiers.pmml.consumer.TreeModel",
      "weka.clusterers.Clusterer",
      "weka.core.neighboursearch.PerformanceStats",
      "weka.core.pmml.TransformationDictionary",
      "weka.core.neighboursearch.balltrees.PointsClosestToFurthestChildren",
      "weka.estimators.UnivariateKernelEstimator",
      "weka.core.pmml.PMMLFactory$PMMLClassifierRunner",
      "weka.core.matrix.EigenvalueDecomposition",
      "weka.core.neighboursearch.balltrees.BallTreeConstructor",
      "weka.classifiers.RandomizableClassifier",
      "weka.core.RevisionUtils",
      "weka.classifiers.meta.RandomCommittee",
      "weka.estimators.Estimator",
      "weka.core.ProtectedProperties",
      "weka.core.converters.C45Loader",
      "weka.classifiers.meta.Vote",
      "weka.core.AttributeStats",
      "weka.clusterers.DensityBasedClusterer",
      "weka.core.neighboursearch.covertrees.Stack",
      "weka.classifiers.rules.M5Rules",
      "weka.classifiers.trees.j48.NoSplit",
      "weka.core.EuclideanDistance",
      "weka.core.converters.AbstractFileLoader",
      "org.pentaho.packageManagement.VersionRangePackageConstraint",
      "weka.classifiers.pmml.consumer.GeneralRegression$Predictor",
      "weka.attributeSelection.Ranker",
      "weka.core.UnsupportedAttributeTypeException",
      "weka.classifiers.functions.Logistic$OptEngCG",
      "weka.experiment.Stats",
      "weka.classifiers.xml.XMLClassifier",
      "weka.filters.Filter",
      "weka.filters.supervised.attribute.Discretize",
      "weka.classifiers.rules.JRip$RipperRule",
      "weka.clusterers.EM",
      "weka.gui.HierarchyPropertyParser",
      "weka.core.TestInstances",
      "weka.classifiers.meta.MultiClassClassifierUpdateable",
      "weka.attributeSelection.AttributeEvaluator",
      "org.pentaho.packageManagement.Package",
      "weka.clusterers.FilteredClusterer",
      "weka.classifiers.rules.part.C45PruneableDecList",
      "weka.attributeSelection.SubsetEvaluator",
      "weka.classifiers.pmml.consumer.Regression$1",
      "weka.core.neighboursearch.NearestNeighbourSearch$NeighborNode",
      "weka.classifiers.bayes.net.search.local.K2",
      "weka.classifiers.rules.PART",
      "weka.core.RevisionUtils$Type",
      "weka.classifiers.evaluation.output.prediction.HTML",
      "weka.core.MinkowskiDistance",
      "weka.classifiers.functions.supportVector.PrecomputedKernelMatrixKernel",
      "weka.filters.supervised.attribute.ClassOrder",
      "weka.clusterers.SingleClustererEnhancer",
      "weka.classifiers.meta.MultiClassClassifier$RandomCode",
      "weka.core.pmml.Function",
      "org.pentaho.packageManagement.VersionPackageConstraint",
      "weka.classifiers.trees.j48.C45ModelSelection",
      "weka.classifiers.pmml.consumer.SupportVectorMachineModel",
      "weka.core.neighboursearch.balltrees.MiddleOutConstructor",
      "weka.core.pmml.TargetMetaInfo",
      "weka.classifiers.ParallelMultipleClassifiersCombiner",
      "weka.classifiers.UpdateableClassifier",
      "weka.core.neighboursearch.balltrees.MiddleOutConstructor$ListNode",
      "weka.core.MultiInstanceCapabilitiesHandler",
      "weka.core.Capabilities",
      "weka.core.neighboursearch.balltrees.TopDownConstructor",
      "weka.core.AttributeLocator",
      "weka.core.pmml.PMMLFactory$ModelType",
      "weka.core.converters.SVMLightLoader",
      "weka.classifiers.functions.supportVector.CachedKernel",
      "weka.core.neighboursearch.balltrees.MiddleOutConstructor$MyIdxList",
      "weka.core.Summarizable",
      "weka.attributeSelection.BestFirst",
      "weka.core.Drawable",
      "weka.gui.HierarchyPropertyParser$TreeNode",
      "weka.core.matrix.Matrix",
      "weka.classifiers.ConditionalDensityEstimator",
      "weka.core.SingleIndex",
      "weka.clusterers.Cobweb$CNode",
      "weka.gui.PropertySheetPanel",
      "weka.core.CapabilitiesHandler",
      "weka.classifiers.trees.REPTree",
      "weka.classifiers.pmml.consumer.NeuralNetwork",
      "weka.gui.GenericObjectEditorHistory",
      "weka.core.SelectedTag",
      "weka.core.matrix.LUDecomposition",
      "weka.classifiers.trees.j48.C45PruneableClassifierTree",
      "weka.classifiers.bayes.BayesNet",
      "weka.attributeSelection.CorrelationAttributeEval",
      "weka.clusterers.RandomizableClusterer",
      "weka.classifiers.evaluation.Prediction",
      "weka.filters.AllFilter",
      "weka.filters.unsupervised.attribute.RemoveUseless",
      "weka.core.converters.BatchConverter",
      "weka.core.matrix.SingularValueDecomposition",
      "weka.core.converters.ArffLoader$ArffReader",
      "weka.classifiers.IteratedSingleClassifierEnhancer",
      "weka.clusterers.Cobweb",
      "weka.classifiers.trees.j48.BinC45ModelSelection",
      "weka.core.OptionHandler",
      "weka.core.converters.MatlabLoader",
      "weka.classifiers.rules.JRip",
      "weka.core.neighboursearch.kdtrees.SlidingMidPointOfWidestSide",
      "weka.filters.supervised.attribute.AttributeSelection",
      "weka.classifiers.bayes.net.VaryNode",
      "weka.classifiers.Classifier",
      "weka.attributeSelection.OneRAttributeEval",
      "weka.attributeSelection.InfoGainAttributeEval",
      "weka.core.pmml.FieldMetaInfo$Optype",
      "weka.classifiers.pmml.consumer.RuleSetModel",
      "weka.core.WekaEnumeration",
      "weka.clusterers.HierarchicalClusterer$Node",
      "weka.classifiers.trees.M5P",
      "weka.classifiers.meta.Bagging",
      "weka.core.WekaPackageManager",
      "weka.estimators.UnivariateEqualFrequencyHistogramEstimator",
      "weka.filters.SupervisedFilter",
      "weka.core.TechnicalInformationHandler",
      "weka.experiment.DatabaseUtils",
      "weka.classifiers.functions.SimpleLogistic",
      "weka.core.Option",
      "weka.estimators.NormalEstimator",
      "weka.filters.unsupervised.attribute.NumericToBinary",
      "weka.filters.Sourcable",
      "weka.classifiers.meta.MultiClassClassifier$StandardCode",
      "weka.classifiers.functions.MultilayerPerceptron$NodePanel",
      "weka.classifiers.rules.DecisionTable",
      "weka.classifiers.meta.MultiScheme",
      "weka.core.matrix.LinearRegression",
      "weka.core.FastVector",
      "weka.classifiers.MultipleClassifiersCombiner",
      "weka.core.xml.XMLDocument",
      "weka.classifiers.bayes.net.estimate.BayesNetEstimator",
      "weka.classifiers.functions.neural.SigmoidUnit",
      "weka.classifiers.trees.RandomTree",
      "weka.classifiers.pmml.consumer.TreeModel$NoTrueChildStrategy",
      "weka.classifiers.rules.part.MakeDecList",
      "weka.classifiers.lazy.KStar",
      "weka.core.Matchable",
      "weka.classifiers.bayes.net.ADNode",
      "weka.core.neighboursearch.NearestNeighbourSearch",
      "weka.classifiers.functions.GaussianProcesses",
      "weka.classifiers.trees.j48.SplitCriterion",
      "weka.filters.unsupervised.attribute.Discretize",
      "weka.classifiers.functions.SGD",
      "weka.core.Javadoc",
      "weka.classifiers.RandomizableParallelMultipleClassifiersCombiner",
      "weka.classifiers.rules.part.PruneableDecList",
      "weka.core.UnassignedClassException",
      "weka.classifiers.trees.m5.SplitEvaluate",
      "weka.classifiers.rules.ZeroR",
      "weka.estimators.MahalanobisEstimator",
      "weka.core.xml.XMLSerialization",
      "weka.core.neighboursearch.TreePerformanceStats",
      "weka.filters.unsupervised.attribute.MakeIndicator",
      "weka.classifiers.RandomizableParallelIteratedSingleClassifierEnhancer",
      "weka.classifiers.lazy.IBk"
    );
  } 

  private static void resetClasses() {
    org.evosuite.runtime.classhandling.ClassResetter.getInstance().setClassLoader(Evaluation_ESTest_scaffolding.class.getClassLoader()); 

    org.evosuite.runtime.classhandling.ClassStateSupport.resetClasses(
      "weka.classifiers.Evaluation",
      "weka.core.pmml.PMMLFactory$ModelType",
      "weka.core.pmml.PMMLFactory$1",
      "weka.core.xml.KOML",
      "weka.core.Version",
      "weka.core.Utils",
      "weka.core.Instances",
      "weka.core.TestInstances",
      "weka.core.Attribute",
      "weka.core.ProtectedProperties",
      "weka.core.AbstractInstance",
      "weka.core.DenseInstance",
      "weka.classifiers.AbstractClassifier",
      "weka.classifiers.SingleClassifierEnhancer",
      "weka.classifiers.misc.InputMappedClassifier",
      "weka.classifiers.rules.ZeroR",
      "weka.core.neighboursearch.NearestNeighbourSearch",
      "weka.core.neighboursearch.CoverTree",
      "weka.core.NormalizableDistance",
      "weka.core.EuclideanDistance",
      "weka.core.Range",
      "weka.core.neighboursearch.balltrees.BallNode",
      "weka.core.converters.AbstractLoader",
      "weka.core.converters.AbstractFileLoader",
      "weka.core.converters.MatlabLoader",
      "weka.core.converters.SVMLightLoader",
      "weka.core.converters.ConverterUtils$DataSource",
      "weka.core.converters.ArffLoader",
      "weka.core.converters.ArffLoader$ArffReader",
      "weka.clusterers.AbstractClusterer",
      "weka.clusterers.RandomizableClusterer",
      "weka.clusterers.SimpleKMeans",
      "weka.core.Capabilities",
      "org.pentaho.packageManagement.PackageManager",
      "org.pentaho.packageManagement.DefaultPackageManager",
      "weka.core.Environment",
      "weka.core.WekaPackageManager",
      "weka.core.converters.TextDirectoryLoader",
      "weka.core.WekaEnumeration",
      "weka.core.Attribute$1",
      "weka.core.converters.LibSVMLoader",
      "weka.core.converters.JSONLoader",
      "weka.attributeSelection.ASEvaluation",
      "weka.attributeSelection.UnsupervisedAttributeEvaluator",
      "weka.attributeSelection.PrincipalComponents",
      "weka.core.converters.C45Loader",
      "weka.filters.Filter",
      "weka.filters.AllFilter",
      "weka.core.SerializedObject",
      "weka.classifiers.CostMatrix",
      "weka.classifiers.RandomizableClassifier",
      "weka.core.Tag",
      "weka.classifiers.functions.SGD",
      "weka.core.converters.DatabaseLoader",
      "weka.experiment.DatabaseUtils",
      "weka.core.converters.DatabaseConnection",
      "weka.core.neighboursearch.BallTree",
      "weka.core.neighboursearch.balltrees.BallTreeConstructor",
      "weka.core.neighboursearch.balltrees.TopDownConstructor",
      "weka.core.neighboursearch.balltrees.BallSplitter",
      "weka.core.neighboursearch.balltrees.PointsClosestToFurthestChildren",
      "weka.core.RevisionUtils",
      "weka.core.SparseInstance",
      "weka.core.neighboursearch.NearestNeighbourSearch$MyHeap",
      "weka.core.neighboursearch.NearestNeighbourSearch$MyHeapElement",
      "weka.core.converters.CSVLoader",
      "weka.core.Capabilities$Capability",
      "weka.core.tokenizers.Tokenizer",
      "weka.core.tokenizers.AlphabeticTokenizer",
      "weka.classifiers.bayes.BayesNet",
      "weka.classifiers.bayes.net.search.SearchAlgorithm",
      "weka.classifiers.bayes.net.search.local.LocalScoreSearchAlgorithm",
      "weka.classifiers.bayes.net.search.local.K2",
      "weka.classifiers.bayes.net.estimate.BayesNetEstimator",
      "weka.classifiers.bayes.net.estimate.SimpleEstimator",
      "weka.core.AttributeStats",
      "weka.core.UnassignedDatasetException",
      "weka.classifiers.lazy.IBk",
      "weka.core.neighboursearch.LinearNNSearch",
      "weka.classifiers.functions.SGDText",
      "weka.core.tokenizers.CharacterDelimitedTokenizer",
      "weka.core.tokenizers.WordTokenizer",
      "weka.core.stemmers.NullStemmer",
      "weka.core.SelectedTag",
      "weka.classifiers.meta.RegressionByDiscretization",
      "weka.filters.unsupervised.attribute.PotentialClassIgnorer",
      "weka.filters.unsupervised.attribute.Discretize",
      "weka.classifiers.trees.J48",
      "weka.estimators.UnivariateEqualFrequencyHistogramEstimator",
      "weka.classifiers.RandomizableSingleClassifierEnhancer",
      "weka.classifiers.meta.CostSensitiveClassifier",
      "weka.core.xml.XMLDocument",
      "weka.core.xml.XMLInstances",
      "weka.core.converters.XRFFLoader",
      "weka.core.MinkowskiDistance",
      "weka.classifiers.rules.JRip",
      "weka.core.Option",
      "weka.core.BinarySparseInstance",
      "weka.core.neighboursearch.covertrees.Stack",
      "weka.core.neighboursearch.CoverTree$DistanceNode",
      "weka.core.neighboursearch.CoverTree$CoverTreeNode",
      "weka.classifiers.IteratedSingleClassifierEnhancer",
      "weka.classifiers.ParallelIteratedSingleClassifierEnhancer",
      "weka.classifiers.RandomizableParallelIteratedSingleClassifierEnhancer",
      "weka.classifiers.meta.RandomCommittee",
      "weka.classifiers.trees.RandomTree",
      "weka.gui.GenericPropertiesCreator",
      "weka.gui.GenericObjectEditor",
      "weka.core.converters.ConverterUtils",
      "weka.classifiers.bayes.NaiveBayes",
      "weka.classifiers.bayes.NaiveBayesUpdateable",
      "weka.classifiers.lazy.LWL",
      "weka.classifiers.trees.DecisionStump",
      "weka.classifiers.functions.SMO",
      "weka.classifiers.functions.supportVector.Kernel",
      "weka.classifiers.functions.supportVector.CachedKernel",
      "weka.classifiers.functions.supportVector.PolyKernel",
      "weka.core.matrix.Matrix",
      "weka.estimators.UnivariateKernelEstimator",
      "weka.core.converters.SerializedInstancesLoader",
      "weka.classifiers.trees.RandomForest",
      "weka.classifiers.functions.GaussianProcesses",
      "weka.experiment.InstanceQuery",
      "weka.core.UnassignedClassException",
      "weka.classifiers.functions.VotedPerceptron",
      "weka.core.FindWithCapabilities",
      "weka.core.SingleIndex",
      "weka.classifiers.rules.DecisionTable",
      "weka.attributeSelection.ASSearch",
      "weka.attributeSelection.BestFirst",
      "weka.classifiers.evaluation.output.prediction.AbstractOutput",
      "weka.classifiers.evaluation.output.prediction.HTML",
      "weka.classifiers.RandomizableIteratedSingleClassifierEnhancer",
      "weka.classifiers.meta.LogitBoost",
      "weka.estimators.Estimator",
      "weka.estimators.NormalEstimator",
      "weka.core.TechnicalInformation",
      "weka.core.TechnicalInformation$Type",
      "weka.core.TechnicalInformation$Field",
      "weka.core.neighboursearch.balltrees.BottomUpConstructor",
      "weka.classifiers.meta.ClassificationViaRegression",
      "weka.classifiers.trees.m5.M5Base",
      "weka.classifiers.trees.M5P",
      "weka.classifiers.evaluation.output.prediction.Null",
      "weka.classifiers.rules.PART",
      "weka.classifiers.rules.part.MakeDecList",
      "weka.classifiers.meta.AdditiveRegression",
      "weka.classifiers.MultipleClassifiersCombiner",
      "weka.classifiers.ParallelMultipleClassifiersCombiner",
      "weka.classifiers.RandomizableParallelMultipleClassifiersCombiner",
      "weka.classifiers.meta.Stacking",
      "weka.attributeSelection.OneRAttributeEval",
      "weka.attributeSelection.InfoGainAttributeEval",
      "weka.classifiers.evaluation.output.prediction.PlainText",
      "weka.attributeSelection.WrapperSubsetEval",
      "weka.classifiers.functions.supportVector.RBFKernel",
      "weka.classifiers.meta.CVParameterSelection",
      "weka.core.FastVector",
      "weka.classifiers.functions.SimpleLinearRegression",
      "weka.classifiers.functions.LinearRegression",
      "weka.classifiers.evaluation.output.prediction.CSV",
      "weka.clusterers.SingleClustererEnhancer",
      "weka.clusterers.FilteredClusterer",
      "weka.classifiers.meta.MultiClassClassifier",
      "weka.classifiers.meta.MultiClassClassifierUpdateable",
      "weka.classifiers.functions.Logistic",
      "weka.classifiers.pmml.consumer.PMMLClassifier",
      "weka.classifiers.pmml.consumer.Regression",
      "weka.classifiers.pmml.consumer.Regression$Normalization",
      "weka.classifiers.rules.OneR",
      "weka.classifiers.rules.OneR$OneRRule",
      "weka.classifiers.functions.SimpleLogistic",
      "weka.classifiers.trees.LMT",
      "weka.classifiers.rules.M5Rules",
      "weka.classifiers.meta.FilteredClassifier",
      "weka.filters.supervised.attribute.AttributeSelection",
      "weka.attributeSelection.AttributeSelection",
      "weka.attributeSelection.CfsSubsetEval",
      "weka.attributeSelection.GreedyStepwise",
      "weka.filters.supervised.attribute.Discretize",
      "weka.classifiers.bayes.NaiveBayesMultinomial",
      "weka.core.neighboursearch.balltrees.MiddleOutConstructor",
      "weka.clusterers.Cobweb",
      "weka.clusterers.FarthestFirst",
      "weka.classifiers.RandomizableMultipleClassifiersCombiner",
      "weka.classifiers.meta.Vote",
      "weka.core.tokenizers.NGramTokenizer",
      "weka.classifiers.lazy.KStar",
      "weka.core.WekaException",
      "weka.core.UnsupportedAttributeTypeException",
      "weka.classifiers.bayes.NaiveBayesMultinomialText",
      "weka.classifiers.meta.AdaBoostM1",
      "weka.classifiers.misc.SerializedClassifier",
      "weka.experiment.Stats",
      "weka.classifiers.functions.MultilayerPerceptron",
      "weka.filters.unsupervised.attribute.NominalToBinary",
      "weka.classifiers.functions.neural.SigmoidUnit",
      "weka.classifiers.functions.neural.LinearUnit",
      "weka.classifiers.evaluation.output.prediction.XML",
      "weka.clusterers.AbstractDensityBasedClusterer",
      "weka.clusterers.MakeDensityBasedClusterer",
      "weka.filters.SimpleFilter",
      "weka.filters.SimpleStreamFilter",
      "weka.filters.MultiFilter",
      "weka.classifiers.bayes.NaiveBayesMultinomialUpdateable",
      "weka.clusterers.RandomizableDensityBasedClusterer",
      "weka.clusterers.EM",
      "weka.core.ClassDiscovery",
      "weka.core.neighboursearch.KDTree",
      "weka.core.neighboursearch.kdtrees.KDTreeNodeSplitter",
      "weka.core.neighboursearch.kdtrees.SlidingMidPointOfWidestSide",
      "weka.classifiers.meta.MultiScheme",
      "weka.classifiers.trees.j48.ClassifierTree",
      "weka.classifiers.trees.j48.PruneableClassifierTree",
      "weka.classifiers.misc.InputMappedClassifierBeanInfo",
      "weka.classifiers.meta.AttributeSelectedClassifier",
      "weka.classifiers.trees.REPTree",
      "weka.classifiers.functions.SMOreg",
      "weka.classifiers.functions.supportVector.RegOptimizer",
      "weka.classifiers.functions.supportVector.RegSMO",
      "weka.classifiers.functions.supportVector.RegSMOImproved",
      "weka.core.Javadoc",
      "weka.core.ClassCache",
      "weka.core.AllJavadoc",
      "weka.classifiers.pmml.consumer.TreeModel",
      "weka.classifiers.pmml.consumer.TreeModel$MiningFunction",
      "weka.classifiers.pmml.consumer.TreeModel$MissingValueStrategy",
      "weka.classifiers.pmml.consumer.TreeModel$NoTrueChildStrategy",
      "weka.classifiers.pmml.consumer.TreeModel$SplitCharacteristic",
      "weka.classifiers.meta.Bagging",
      "weka.attributeSelection.SymmetricalUncertAttributeEval",
      "weka.clusterers.HierarchicalClusterer",
      "weka.classifiers.functions.supportVector.PrecomputedKernelMatrixKernel",
      "weka.core.ContingencyTables",
      "weka.attributeSelection.CorrelationAttributeEval",
      "weka.estimators.MahalanobisEstimator",
      "weka.classifiers.functions.supportVector.NormalizedPolyKernel",
      "weka.attributeSelection.ReliefFAttributeEval",
      "weka.classifiers.bayes.net.BIFReader",
      "weka.classifiers.evaluation.ThresholdCurve"
    );
  }
}
