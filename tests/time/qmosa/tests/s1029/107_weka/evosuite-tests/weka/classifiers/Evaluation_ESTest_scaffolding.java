/**
 * Scaffolding file used to store all the setups needed to run 
 * tests automatically generated by EvoSuite
 * Mon Nov 30 13:43:01 GMT 2020
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
    java.lang.System.setProperty("user.dir", "/home/ubuntu/termite/projects/107_weka"); 
    java.lang.System.setProperty("user.home", "/home/ubuntu"); 
    java.lang.System.setProperty("user.language", "en"); 
    java.lang.System.setProperty("user.name", "ubuntu"); 
    java.lang.System.setProperty("user.timezone", "Etc/UTC"); 
  }

  private static void initializeClasses() {
    org.evosuite.runtime.classhandling.ClassStateSupport.initializeClasses(Evaluation_ESTest_scaffolding.class.getClassLoader() ,
      "weka.core.Environment",
      "org.pentaho.packageManagement.VersionPackageConstraint$VersionComparison",
      "weka.clusterers.AbstractClusterer",
      "weka.filters.unsupervised.attribute.NominalToBinary",
      "weka.classifiers.functions.MultilayerPerceptron$ControlPanel",
      "weka.core.matrix.CholeskyDecomposition",
      "weka.core.converters.TextDirectoryLoader",
      "org.pentaho.packageManagement.PackageConstraint",
      "weka.core.converters.Saver",
      "weka.core.xml.XMLBasicSerialization",
      "weka.classifiers.evaluation.output.prediction.XML",
      "weka.filters.UnsupervisedFilter",
      "weka.core.neighboursearch.BallTree",
      "weka.core.converters.XRFFSaver",
      "weka.core.neighboursearch.CoverTree$DistanceNode",
      "weka.classifiers.evaluation.output.prediction.AbstractOutput",
      "weka.core.DenseInstance",
      "weka.classifiers.trees.J48",
      "weka.core.converters.DatabaseConverter",
      "weka.classifiers.rules.JRip$NominalAntd",
      "weka.classifiers.evaluation.output.prediction.CSV",
      "org.pentaho.packageManagement.DefaultPackageManager",
      "weka.core.Optimization$DynamicIntArray",
      "weka.estimators.UnivariateIntervalEstimator",
      "weka.gui.GenericPropertiesCreator",
      "org.bounce.net.DefaultAuthenticator",
      "weka.classifiers.trees.j48.BinC45Split",
      "weka.filters.SimpleStreamFilter",
      "weka.core.pmml.PMMLFactory$1",
      "weka.core.neighboursearch.CoverTree$MyHeap",
      "weka.core.converters.JSONLoader",
      "weka.filters.unsupervised.attribute.Add",
      "weka.gui.PropertyText",
      "weka.estimators.IncrementalEstimator",
      "weka.clusterers.NumberOfClustersRequestable",
      "weka.core.neighboursearch.KDTree",
      "weka.core.stemmers.NullStemmer",
      "weka.classifiers.functions.SGDText",
      "weka.core.CustomDisplayStringProvider",
      "weka.classifiers.meta.AdaBoostM1",
      "weka.core.NormalizableDistance",
      "weka.core.xml.KOML",
      "weka.classifiers.functions.SMOreg",
      "weka.classifiers.rules.Rule",
      "weka.clusterers.SimpleKMeans",
      "weka.classifiers.trees.j48.InfoGainSplitCrit",
      "weka.core.TechnicalInformation$Type",
      "weka.classifiers.trees.lmt.ResidualSplit",
      "weka.core.Copyable",
      "weka.gui.PropertyValueSelector",
      "weka.filters.supervised.attribute.NominalToBinary",
      "weka.core.BinarySparseInstance",
      "weka.classifiers.RandomizableMultipleClassifiersCombiner",
      "weka.gui.PropertySheetPanel$CapabilitiesHelpDialog",
      "weka.core.SerializedObject",
      "weka.core.pmml.BuiltInArithmetic",
      "weka.clusterers.UpdateableClusterer",
      "weka.core.AdditionalMeasureProducer",
      "weka.core.neighboursearch.balltrees.BallNode",
      "weka.classifiers.RandomizableIteratedSingleClassifierEnhancer",
      "weka.core.converters.AbstractSaver",
      "weka.attributeSelection.GreedyStepwise",
      "weka.classifiers.meta.MultiClassClassifier",
      "weka.core.Optimization",
      "weka.experiment.InstanceQuery",
      "weka.classifiers.pmml.consumer.Regression$Normalization",
      "weka.classifiers.pmml.consumer.PMMLClassifier",
      "weka.classifiers.functions.supportVector.RegOptimizer",
      "weka.classifiers.meta.FilteredClassifier",
      "weka.classifiers.misc.InputMappedClassifier",
      "weka.experiment.ResultProducer",
      "weka.classifiers.functions.neural.NeuralConnection",
      "weka.core.Version",
      "weka.attributeSelection.AttributeSelection",
      "weka.classifiers.meta.MultiClassClassifier$Code",
      "weka.classifiers.bayes.net.estimate.SimpleEstimator",
      "weka.classifiers.pmml.consumer.Regression",
      "weka.gui.Logger",
      "weka.core.pmml.BuiltInString",
      "weka.experiment.InstanceQueryAdapter",
      "org.pentaho.packageManagement.VersionPackageConstraint$VersionComparison$1",
      "org.pentaho.packageManagement.VersionPackageConstraint$VersionComparison$2",
      "org.pentaho.packageManagement.VersionPackageConstraint$VersionComparison$3",
      "weka.classifiers.trees.j48.EntropyBasedSplitCrit",
      "weka.core.neighboursearch.CoverTree",
      "weka.classifiers.AbstractClassifier",
      "weka.core.converters.ArffLoader",
      "weka.filters.unsupervised.attribute.Center",
      "weka.classifiers.meta.Stacking",
      "weka.gui.GenericObjectEditor$GOETreeNode",
      "weka.core.WekaException",
      "weka.classifiers.functions.neural.NeuralNode",
      "org.pentaho.packageManagement.VersionPackageConstraint$VersionComparison$4",
      "weka.classifiers.trees.RandomForest",
      "org.pentaho.packageManagement.VersionPackageConstraint$VersionComparison$5",
      "weka.filters.StreamableFilter",
      "weka.gui.GenericObjectEditor$1",
      "weka.core.Attribute$1",
      "weka.core.neighboursearch.NearestNeighbourSearch$MyHeapElement",
      "weka.core.PartitionGenerator",
      "weka.core.neighboursearch.NearestNeighbourSearch$NeighborList",
      "weka.core.converters.SerializedInstancesSaver",
      "weka.classifiers.functions.MultilayerPerceptron$NeuralEnd",
      "weka.core.SparseInstance",
      "weka.estimators.PoissonEstimator",
      "weka.classifiers.trees.j48.ClassifierSplitModel",
      "weka.attributeSelection.AttributeTransformer",
      "weka.classifiers.trees.j48.ClassifierTree",
      "weka.classifiers.misc.SerializedClassifier",
      "weka.core.tokenizers.WordTokenizer",
      "weka.core.pmml.PMMLModel",
      "weka.classifiers.functions.MultilayerPerceptron",
      "weka.filters.unsupervised.attribute.ReplaceMissingValues",
      "weka.classifiers.trees.j48.C45Split",
      "weka.attributeSelection.PrincipalComponents",
      "weka.classifiers.pmml.consumer.GeneralRegression",
      "weka.core.neighboursearch.CoverTree$MyHeapElement",
      "weka.gui.GenericObjectEditorHistory$HistorySelectionListener",
      "weka.core.neighboursearch.kdtrees.KDTreeNode",
      "weka.classifiers.functions.VotedPerceptron",
      "weka.classifiers.trees.j48.PruneableClassifierTree",
      "weka.classifiers.Evaluation",
      "weka.core.converters.CSVLoader",
      "weka.gui.CustomPanelSupplier",
      "weka.classifiers.functions.supportVector.Kernel",
      "weka.classifiers.functions.neural.LinearUnit",
      "weka.classifiers.pmml.consumer.TreeModel",
      "weka.classifiers.bayes.net.search.SearchAlgorithm",
      "weka.core.converters.FileSourcedConverter",
      "weka.core.converters.URLSourcedLoader",
      "weka.core.neighboursearch.LinearNNSearch",
      "weka.clusterers.Clusterer",
      "weka.core.neighboursearch.PerformanceStats",
      "weka.core.converters.CSVSaver",
      "weka.core.converters.ArffSaver",
      "weka.core.pmml.TransformationDictionary",
      "weka.classifiers.bayes.NaiveBayesMultinomialUpdateable",
      "weka.core.neighboursearch.balltrees.PointsClosestToFurthestChildren",
      "weka.estimators.UnivariateKernelEstimator",
      "weka.core.pmml.PMMLFactory$PMMLClassifierRunner",
      "weka.core.matrix.EigenvalueDecomposition",
      "weka.core.UnassignedDatasetException",
      "weka.core.neighboursearch.balltrees.BallTreeConstructor",
      "weka.classifiers.RandomizableClassifier",
      "weka.classifiers.meta.CVParameterSelection",
      "weka.attributeSelection.RankedOutputSearch",
      "weka.core.RevisionUtils",
      "weka.core.converters.Loader",
      "weka.classifiers.functions.supportVector.RegSMO",
      "weka.core.ProtectedProperties",
      "weka.estimators.Estimator",
      "weka.core.converters.C45Loader",
      "weka.core.StringLocator",
      "weka.core.AttributeStats",
      "weka.filters.MultiFilter",
      "weka.classifiers.trees.DecisionStump",
      "weka.estimators.UnivariateQuantileEstimator",
      "weka.classifiers.bayes.net.search.local.LocalScoreSearchAlgorithm",
      "weka.core.neighboursearch.covertrees.Stack",
      "weka.classifiers.rules.JRip$NumericAntd",
      "weka.filters.unsupervised.attribute.Remove",
      "weka.core.Randomizable",
      "weka.classifiers.rules.M5Rules",
      "weka.classifiers.trees.j48.NoSplit",
      "weka.classifiers.trees.LMT",
      "weka.core.EuclideanDistance",
      "weka.core.Instances",
      "weka.core.converters.AbstractFileLoader",
      "weka.classifiers.bayes.NaiveBayesMultinomial",
      "weka.core.converters.ConverterUtils$DataSink",
      "org.pentaho.packageManagement.VersionRangePackageConstraint",
      "weka.classifiers.bayes.net.ParentSet",
      "weka.core.xml.XMLInstances",
      "weka.classifiers.pmml.consumer.GeneralRegression$Predictor",
      "weka.core.converters.DatabaseConnection",
      "weka.attributeSelection.Ranker",
      "weka.core.UnsupportedAttributeTypeException",
      "weka.core.TechnicalInformation",
      "weka.classifiers.functions.Logistic$OptEngCG",
      "weka.core.RevisionHandler",
      "weka.experiment.Stats",
      "weka.classifiers.rules.OneR$OneRRule",
      "weka.core.converters.ConverterUtils$DataSource",
      "weka.classifiers.xml.XMLClassifier",
      "weka.filters.Filter",
      "weka.filters.supervised.attribute.Discretize",
      "weka.classifiers.rules.JRip$RipperRule",
      "weka.gui.HierarchyPropertyParser",
      "weka.core.TestInstances",
      "weka.core.converters.ConverterUtils",
      "weka.core.DistanceFunction",
      "weka.classifiers.meta.MultiClassClassifierUpdateable",
      "weka.attributeSelection.AttributeEvaluator",
      "org.pentaho.packageManagement.Package",
      "weka.clusterers.FilteredClusterer",
      "weka.core.converters.AbstractFileSaver",
      "weka.classifiers.trees.m5.M5Base",
      "weka.attributeSelection.SubsetEvaluator",
      "weka.classifiers.rules.RuleStats",
      "weka.classifiers.CostMatrix",
      "weka.classifiers.bayes.net.search.local.K2",
      "weka.core.neighboursearch.NearestNeighbourSearch$NeighborNode",
      "weka.core.logging.Logger$Level",
      "weka.classifiers.rules.PART",
      "weka.core.neighboursearch.kdtrees.KDTreeNodeSplitter",
      "weka.attributeSelection.CfsSubsetEval",
      "weka.core.RevisionUtils$Type",
      "weka.core.ConjugateGradientOptimization",
      "weka.classifiers.functions.LinearRegression",
      "weka.gui.PropertyPanel",
      "weka.core.stemmers.Stemmer",
      "weka.classifiers.evaluation.output.prediction.Null",
      "weka.core.converters.IncrementalConverter",
      "weka.filters.supervised.attribute.ClassOrder",
      "weka.clusterers.SingleClustererEnhancer",
      "weka.classifiers.RandomizableSingleClassifierEnhancer",
      "weka.classifiers.meta.LogitBoost",
      "weka.clusterers.FarthestFirst",
      "weka.core.ChebyshevDistance",
      "weka.filters.SimpleFilter",
      "weka.classifiers.bayes.NaiveBayes",
      "weka.classifiers.meta.MultiClassClassifier$RandomCode",
      "weka.core.pmml.Function",
      "org.pentaho.packageManagement.VersionPackageConstraint",
      "weka.estimators.Estimator$Builder",
      "weka.experiment.ResultListener",
      "weka.classifiers.trees.j48.C45ModelSelection",
      "weka.core.EnvironmentHandler",
      "weka.classifiers.pmml.consumer.SupportVectorMachineModel",
      "weka.classifiers.trees.m5.RuleNode",
      "weka.classifiers.functions.Logistic",
      "weka.core.RelationalLocator",
      "weka.core.Utils",
      "weka.classifiers.trees.m5.PreConstructedLinearModel",
      "weka.core.converters.XRFFLoader",
      "weka.core.tokenizers.Tokenizer",
      "weka.filters.unsupervised.instance.RemoveWithValues",
      "weka.core.pmml.FieldMetaInfo",
      "weka.gui.GenericObjectEditor$JTreePopupMenu",
      "weka.core.NoSupportForMissingValuesException",
      "weka.core.pmml.TargetMetaInfo",
      "weka.classifiers.UpdateableClassifier",
      "weka.classifiers.ParallelMultipleClassifiersCombiner",
      "weka.classifiers.meta.MultiClassClassifier$ExhaustiveCode",
      "weka.core.Capabilities",
      "weka.core.neighboursearch.balltrees.TopDownConstructor",
      "weka.core.AttributeLocator",
      "weka.core.pmml.PMMLFactory$ModelType",
      "weka.core.converters.SVMLightLoader",
      "weka.classifiers.functions.supportVector.CachedKernel",
      "weka.classifiers.meta.RegressionByDiscretization",
      "weka.core.Summarizable",
      "weka.attributeSelection.BestFirst",
      "weka.classifiers.trees.j48.ModelSelection",
      "org.pentaho.packageManagement.PackageManager$1",
      "weka.core.Drawable",
      "weka.gui.HierarchyPropertyParser$TreeNode",
      "weka.core.matrix.Matrix",
      "weka.classifiers.ConditionalDensityEstimator",
      "weka.clusterers.Cobweb$CNode",
      "weka.gui.PropertySheetPanel",
      "weka.core.CapabilitiesHandler",
      "weka.core.pmml.MiningSchema",
      "weka.classifiers.pmml.consumer.NeuralNetwork",
      "weka.core.neighboursearch.NearestNeighbourSearch$MyHeap",
      "weka.attributeSelection.ASEvaluation",
      "weka.classifiers.functions.supportVector.StringKernel",
      "weka.core.AbstractInstance",
      "weka.core.converters.LibSVMLoader",
      "weka.gui.GenericObjectEditorHistory",
      "weka.core.SelectedTag",
      "org.pentaho.packageManagement.DefaultPackage",
      "weka.estimators.DiscreteEstimator",
      "weka.core.neighboursearch.balltrees.BallSplitter",
      "weka.classifiers.bayes.NaiveBayesUpdateable",
      "weka.core.matrix.LUDecomposition",
      "weka.classifiers.trees.j48.C45PruneableClassifierTree",
      "weka.classifiers.bayes.BayesNet",
      "weka.classifiers.meta.AdditiveRegression",
      "weka.clusterers.RandomizableClusterer",
      "weka.core.converters.AbstractLoader",
      "weka.classifiers.trees.lmt.ResidualModelSelection",
      "weka.filters.AllFilter",
      "weka.filters.unsupervised.attribute.RemoveUseless",
      "weka.core.converters.BatchConverter",
      "weka.core.matrix.SingularValueDecomposition",
      "weka.core.converters.ArffLoader$ArffReader",
      "weka.core.Tag",
      "weka.classifiers.IteratedSingleClassifierEnhancer",
      "weka.clusterers.Cobweb",
      "weka.classifiers.trees.j48.BinC45ModelSelection",
      "weka.estimators.UnivariateDensityEstimator",
      "weka.core.OptionHandler",
      "weka.classifiers.trees.j48.Distribution",
      "weka.core.converters.MatlabLoader",
      "weka.classifiers.rules.JRip",
      "weka.core.neighboursearch.kdtrees.SlidingMidPointOfWidestSide",
      "weka.filters.supervised.attribute.AttributeSelection",
      "weka.core.Range",
      "weka.classifiers.bayes.net.VaryNode",
      "weka.classifiers.Classifier",
      "weka.core.pmml.DefineFunction",
      "weka.core.Capabilities$Capability",
      "weka.core.pmml.FieldMetaInfo$Optype",
      "org.pentaho.packageManagement.PackageManager",
      "weka.classifiers.pmml.consumer.RuleSetModel",
      "weka.core.WekaEnumeration",
      "weka.gui.GenericObjectEditor",
      "weka.core.matrix.QRDecomposition",
      "weka.attributeSelection.ASSearch",
      "weka.core.WekaPackageManager",
      "weka.estimators.UnivariateEqualFrequencyHistogramEstimator",
      "weka.filters.SupervisedFilter",
      "weka.core.TechnicalInformationHandler",
      "weka.experiment.DatabaseUtils",
      "weka.classifiers.functions.SimpleLogistic",
      "weka.classifiers.lazy.LWL",
      "weka.attributeSelection.StartSetHandler",
      "weka.classifiers.meta.CostSensitiveClassifier",
      "weka.core.Option",
      "weka.core.tokenizers.CharacterDelimitedTokenizer",
      "weka.filters.unsupervised.attribute.PotentialClassIgnorer",
      "weka.classifiers.functions.neural.NeuralMethod",
      "weka.filters.Sourcable",
      "weka.classifiers.meta.MultiClassClassifier$StandardCode",
      "weka.core.Attribute",
      "weka.classifiers.functions.MultilayerPerceptron$NodePanel",
      "weka.core.pmml.BuiltInMath",
      "weka.classifiers.meta.MultiScheme",
      "weka.core.matrix.LinearRegression",
      "weka.core.FastVector",
      "weka.core.xml.XMLDocument",
      "weka.classifiers.MultipleClassifiersCombiner",
      "weka.classifiers.bayes.net.estimate.BayesNetEstimator",
      "weka.core.BatchPredictor",
      "weka.classifiers.functions.supportVector.RegSMOImproved",
      "weka.classifiers.functions.neural.SigmoidUnit",
      "weka.classifiers.trees.RandomTree",
      "weka.classifiers.SingleClassifierEnhancer",
      "weka.core.Instance",
      "weka.core.converters.SerializedInstancesLoader",
      "weka.classifiers.functions.supportVector.PolyKernel",
      "weka.classifiers.IntervalEstimator",
      "weka.core.Matchable",
      "weka.classifiers.bayes.net.ADNode",
      "weka.core.WeightedInstancesHandler",
      "weka.core.neighboursearch.NearestNeighbourSearch",
      "weka.classifiers.functions.GaussianProcesses",
      "weka.classifiers.trees.j48.SplitCriterion",
      "weka.core.TechnicalInformation$Field",
      "weka.filters.unsupervised.attribute.Discretize",
      "weka.core.converters.DatabaseLoader",
      "weka.classifiers.functions.MultilayerPerceptron$ControlPanel$2",
      "weka.classifiers.functions.SGD",
      "weka.classifiers.functions.MultilayerPerceptron$ControlPanel$1",
      "weka.classifiers.meta.AttributeSelectedClassifier",
      "weka.classifiers.RandomizableParallelMultipleClassifiersCombiner",
      "weka.gui.GenericObjectEditorHistory$HistorySelectionEvent",
      "weka.core.neighboursearch.CoverTree$CoverTreeNode",
      "weka.classifiers.trees.j48.GainRatioSplitCrit",
      "weka.classifiers.rules.OneR",
      "weka.filters.unsupervised.attribute.Normalize",
      "weka.core.UnassignedClassException",
      "weka.classifiers.trees.m5.SplitEvaluate",
      "weka.classifiers.misc.InputMappedClassifierBeanInfo",
      "weka.classifiers.rules.ZeroR",
      "weka.classifiers.rules.JRip$Antd",
      "weka.core.pmml.PMMLFactory",
      "weka.attributeSelection.UnsupervisedAttributeEvaluator",
      "weka.filters.unsupervised.attribute.Standardize",
      "weka.classifiers.Sourcable",
      "weka.classifiers.functions.Logistic$OptEng",
      "weka.classifiers.evaluation.output.prediction.PlainText",
      "weka.core.xml.XMLSerialization",
      "weka.core.neighboursearch.TreePerformanceStats",
      "weka.filters.unsupervised.attribute.MakeIndicator",
      "weka.gui.GenericObjectEditor$GOEPanel",
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
      "weka.core.converters.AbstractLoader",
      "weka.core.converters.AbstractFileLoader",
      "weka.core.converters.SerializedInstancesLoader",
      "weka.core.converters.SVMLightLoader",
      "weka.classifiers.AbstractClassifier",
      "weka.classifiers.bayes.BayesNet",
      "weka.classifiers.bayes.net.search.SearchAlgorithm",
      "weka.core.Tag",
      "weka.classifiers.bayes.net.search.local.LocalScoreSearchAlgorithm",
      "weka.classifiers.bayes.net.search.local.K2",
      "weka.classifiers.bayes.net.estimate.BayesNetEstimator",
      "weka.classifiers.bayes.net.estimate.SimpleEstimator",
      "weka.classifiers.SingleClassifierEnhancer",
      "weka.classifiers.RandomizableSingleClassifierEnhancer",
      "weka.classifiers.meta.CostSensitiveClassifier",
      "weka.classifiers.rules.ZeroR",
      "weka.classifiers.CostMatrix",
      "weka.core.xml.XMLDocument",
      "weka.core.xml.XMLInstances",
      "weka.core.converters.XRFFLoader",
      "weka.core.converters.DatabaseLoader",
      "weka.core.Environment",
      "weka.experiment.DatabaseUtils",
      "weka.core.converters.DatabaseConnection",
      "org.pentaho.packageManagement.PackageManager",
      "org.pentaho.packageManagement.DefaultPackageManager",
      "weka.core.WekaPackageManager",
      "weka.core.converters.CSVLoader",
      "weka.core.Range",
      "weka.core.converters.C45Loader",
      "weka.core.converters.ConverterUtils$DataSource",
      "weka.core.converters.ArffLoader",
      "weka.core.converters.ArffLoader$ArffReader",
      "weka.core.converters.TextDirectoryLoader",
      "weka.core.Attribute",
      "weka.core.ProtectedProperties",
      "weka.classifiers.lazy.LWL",
      "weka.core.neighboursearch.NearestNeighbourSearch",
      "weka.core.neighboursearch.LinearNNSearch",
      "weka.core.NormalizableDistance",
      "weka.core.EuclideanDistance",
      "weka.classifiers.trees.DecisionStump",
      "weka.core.converters.MatlabLoader",
      "weka.core.converters.LibSVMLoader",
      "weka.core.AbstractInstance",
      "weka.core.DenseInstance",
      "weka.core.SparseInstance",
      "weka.core.BinarySparseInstance",
      "weka.core.UnassignedDatasetException",
      "weka.core.neighboursearch.CoverTree",
      "weka.gui.GenericPropertiesCreator",
      "weka.gui.GenericObjectEditor",
      "weka.core.converters.ConverterUtils",
      "weka.classifiers.lazy.IBk",
      "weka.classifiers.misc.InputMappedClassifier",
      "weka.classifiers.evaluation.output.prediction.AbstractOutput",
      "weka.classifiers.evaluation.output.prediction.PlainText",
      "weka.core.WekaEnumeration",
      "weka.core.Attribute$1",
      "weka.core.converters.JSONLoader",
      "weka.filters.Filter",
      "weka.filters.AllFilter",
      "weka.core.TestInstances",
      "weka.clusterers.AbstractClusterer",
      "weka.clusterers.RandomizableClusterer",
      "weka.clusterers.FarthestFirst",
      "weka.core.Capabilities",
      "weka.core.Capabilities$Capability",
      "weka.attributeSelection.ASEvaluation",
      "weka.attributeSelection.UnsupervisedAttributeEvaluator",
      "weka.attributeSelection.PrincipalComponents",
      "weka.core.neighboursearch.balltrees.BallNode",
      "weka.experiment.InstanceQuery",
      "weka.core.Option",
      "weka.classifiers.evaluation.output.prediction.CSV",
      "weka.classifiers.rules.OneR",
      "weka.classifiers.rules.OneR$OneRRule",
      "weka.classifiers.MultipleClassifiersCombiner",
      "weka.classifiers.RandomizableMultipleClassifiersCombiner",
      "weka.classifiers.meta.MultiScheme",
      "weka.core.ChebyshevDistance",
      "weka.core.neighboursearch.KDTree",
      "weka.core.neighboursearch.kdtrees.KDTreeNodeSplitter",
      "weka.core.neighboursearch.kdtrees.SlidingMidPointOfWidestSide",
      "weka.core.WekaException",
      "weka.core.UnsupportedAttributeTypeException",
      "weka.classifiers.IteratedSingleClassifierEnhancer",
      "weka.classifiers.meta.AdditiveRegression",
      "weka.classifiers.meta.RegressionByDiscretization",
      "weka.filters.unsupervised.attribute.PotentialClassIgnorer",
      "weka.filters.unsupervised.attribute.Discretize",
      "weka.classifiers.trees.J48",
      "weka.core.TechnicalInformation",
      "weka.core.TechnicalInformation$Type",
      "weka.core.TechnicalInformation$Field",
      "weka.core.SelectedTag",
      "weka.core.SerializedObject",
      "weka.estimators.Estimator",
      "weka.estimators.PoissonEstimator",
      "weka.classifiers.functions.SMOreg",
      "weka.classifiers.functions.supportVector.RegOptimizer",
      "weka.classifiers.functions.supportVector.RegSMO",
      "weka.classifiers.functions.supportVector.RegSMOImproved",
      "weka.classifiers.functions.supportVector.Kernel",
      "weka.classifiers.functions.supportVector.CachedKernel",
      "weka.classifiers.functions.supportVector.PolyKernel",
      "weka.core.UnassignedClassException",
      "weka.estimators.DiscreteEstimator",
      "weka.clusterers.SimpleKMeans",
      "weka.classifiers.bayes.NaiveBayesMultinomial",
      "weka.classifiers.bayes.NaiveBayesMultinomialUpdateable",
      "weka.classifiers.RandomizableIteratedSingleClassifierEnhancer",
      "weka.classifiers.meta.LogitBoost",
      "weka.classifiers.meta.FilteredClassifier",
      "weka.filters.supervised.attribute.AttributeSelection",
      "weka.attributeSelection.AttributeSelection",
      "weka.attributeSelection.CfsSubsetEval",
      "weka.attributeSelection.ASSearch",
      "weka.attributeSelection.GreedyStepwise",
      "weka.attributeSelection.BestFirst",
      "weka.filters.supervised.attribute.Discretize",
      "weka.core.RevisionUtils",
      "weka.experiment.Stats",
      "weka.classifiers.rules.PART",
      "weka.classifiers.evaluation.output.prediction.Null",
      "weka.classifiers.misc.SerializedClassifier",
      "weka.classifiers.trees.m5.M5Base",
      "weka.classifiers.rules.M5Rules",
      "weka.classifiers.RandomizableClassifier",
      "weka.classifiers.functions.SGDText",
      "weka.core.tokenizers.Tokenizer",
      "weka.core.tokenizers.CharacterDelimitedTokenizer",
      "weka.core.tokenizers.WordTokenizer",
      "weka.core.stemmers.NullStemmer",
      "weka.classifiers.meta.AttributeSelectedClassifier",
      "weka.classifiers.evaluation.output.prediction.XML",
      "weka.core.AttributeStats",
      "weka.classifiers.trees.RandomForest",
      "weka.estimators.UnivariateKernelEstimator",
      "weka.classifiers.trees.RandomTree",
      "weka.classifiers.functions.LinearRegression",
      "weka.filters.SimpleFilter",
      "weka.filters.SimpleStreamFilter",
      "weka.filters.MultiFilter",
      "weka.core.neighboursearch.BallTree",
      "weka.core.neighboursearch.balltrees.BallTreeConstructor",
      "weka.core.neighboursearch.balltrees.TopDownConstructor",
      "weka.core.neighboursearch.balltrees.BallSplitter",
      "weka.core.neighboursearch.balltrees.PointsClosestToFurthestChildren",
      "weka.classifiers.meta.MultiClassClassifier",
      "weka.classifiers.functions.Logistic",
      "weka.classifiers.meta.AdaBoostM1",
      "weka.core.neighboursearch.NearestNeighbourSearch$MyHeap",
      "weka.core.neighboursearch.NearestNeighbourSearch$MyHeapElement",
      "weka.classifiers.functions.SimpleLogistic",
      "weka.classifiers.rules.JRip",
      "weka.classifiers.meta.MultiClassClassifierUpdateable",
      "weka.classifiers.functions.SGD",
      "weka.clusterers.SingleClustererEnhancer",
      "weka.clusterers.FilteredClusterer",
      "weka.classifiers.functions.GaussianProcesses",
      "weka.classifiers.misc.InputMappedClassifierBeanInfo",
      "weka.classifiers.bayes.NaiveBayes",
      "weka.classifiers.bayes.NaiveBayesUpdateable",
      "weka.estimators.UnivariateEqualFrequencyHistogramEstimator",
      "weka.classifiers.meta.CVParameterSelection",
      "weka.core.FastVector",
      "weka.classifiers.functions.MultilayerPerceptron",
      "weka.filters.unsupervised.attribute.NominalToBinary",
      "weka.classifiers.functions.neural.SigmoidUnit",
      "weka.classifiers.functions.neural.LinearUnit",
      "weka.clusterers.Cobweb",
      "weka.classifiers.functions.VotedPerceptron",
      "weka.attributeSelection.Ranker",
      "weka.classifiers.ParallelMultipleClassifiersCombiner",
      "weka.classifiers.RandomizableParallelMultipleClassifiersCombiner",
      "weka.classifiers.meta.Stacking",
      "weka.classifiers.functions.supportVector.StringKernel",
      "weka.classifiers.trees.LMT"
    );
  }
}
