/**
 * Scaffolding file used to store all the setups needed to run 
 * tests automatically generated by EvoSuite
 * Sun Nov 08 22:47:01 GMT 2020
 */

package net.sourceforge.squirrel_sql.client.session;

import org.evosuite.runtime.annotation.EvoSuiteClassExclude;
import org.junit.BeforeClass;
import org.junit.Before;
import org.junit.After;
import org.junit.AfterClass;
import org.evosuite.runtime.sandbox.Sandbox;
import org.evosuite.runtime.sandbox.Sandbox.SandboxMode;

@EvoSuiteClassExclude
public class Session_ESTest_scaffolding {

  @org.junit.Rule 
  public org.evosuite.runtime.vnet.NonFunctionalRequirementRule nfr = new org.evosuite.runtime.vnet.NonFunctionalRequirementRule();

  private static final java.util.Properties defaultProperties = (java.util.Properties) java.lang.System.getProperties().clone(); 

  private org.evosuite.runtime.thread.ThreadStopper threadStopper =  new org.evosuite.runtime.thread.ThreadStopper (org.evosuite.runtime.thread.KillSwitchHandler.getInstance(), 3000);


  @BeforeClass 
  public static void initEvoSuiteFramework() { 
    org.evosuite.runtime.RuntimeSettings.className = "net.sourceforge.squirrel_sql.client.session.Session"; 
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
    java.lang.System.setProperty("user.dir", "/home/ubuntu/replication/scripts/projects/102_squirrel-sql"); 
    java.lang.System.setProperty("user.home", "/home/ubuntu"); 
    java.lang.System.setProperty("user.language", "en"); 
    java.lang.System.setProperty("user.name", "ubuntu"); 
    java.lang.System.setProperty("user.timezone", "Etc/UTC"); 
    java.lang.System.setProperty("log4j.configuration", "SUT.log4j.properties"); 
  }

  private static void initializeClasses() {
    org.evosuite.runtime.classhandling.ClassStateSupport.initializeClasses(Session_ESTest_scaffolding.class.getClassLoader() ,
      "org.apache.log4j.helpers.PatternConverter",
      "net.sourceforge.squirrel_sql.client.gui.db.IBaseList",
      "net.sourceforge.squirrel_sql.fw.util.FileExtensionFilter",
      "net.sourceforge.squirrel_sql.client.gui.session.ObjectTreeInternalFrame",
      "org.apache.log4j.AppenderSkeleton",
      "net.sourceforge.squirrel_sql.client.session.mainpanel.ISQLExecutionHandlerListener",
      "org.apache.commons.httpclient.Header",
      "net.sourceforge.squirrel_sql.client.gui.db.DataCache",
      "net.sourceforge.squirrel_sql.client.session.event.ISQLResultExecuterTabListener",
      "net.sourceforge.squirrel_sql.client.gui.db.SQLAliasConnectionProperties",
      "net.sourceforge.squirrel_sql.client.session.mainpanel.objecttree.tabs.IObjectTab",
      "net.sourceforge.squirrel_sql.client.session.mainpanel.objecttree.FindInObjectTreeController",
      "net.sourceforge.squirrel_sql.client.session.event.SimpleSessionListener",
      "org.apache.commons.cli.UnrecognizedOptionException",
      "net.sourceforge.squirrel_sql.fw.sql.SQLDatabaseMetaData",
      "org.apache.log4j.spi.Filter",
      "net.sourceforge.squirrel_sql.fw.sql.IUDTInfo",
      "net.sourceforge.squirrel_sql.client.action.ActionKeys",
      "net.sourceforge.squirrel_sql.client.session.ISQLEntryPanelFactory",
      "net.sourceforge.squirrel_sql.client.gui.db.SQLAlias$IStrings",
      "net.sourceforge.squirrel_sql.client.session.mainpanel.ObjectTreeTab",
      "net.sourceforge.squirrel_sql.client.gui.db.SchemaLoadInfo",
      "net.sourceforge.squirrel_sql.fw.gui.BasePopupMenu",
      "net.sourceforge.squirrel_sql.client.gui.db.DriversListInternalFrame",
      "net.sourceforge.squirrel_sql.client.preferences.IGlobalPreferencesPanel",
      "net.sourceforge.squirrel_sql.client.gui.mainframe.MainFrameWindowState",
      "org.apache.log4j.Hierarchy",
      "net.sourceforge.squirrel_sql.client.FontInfoStore",
      "net.sourceforge.squirrel_sql.fw.util.IObjectCacheChangeListener",
      "net.sourceforge.squirrel_sql.fw.util.log.ILogger",
      "org.apache.commons.httpclient.HostConfiguration",
      "net.sourceforge.squirrel_sql.fw.gui.MemoryComboBox",
      "net.sourceforge.squirrel_sql.client.plugin.IPlugin",
      "net.sourceforge.squirrel_sql.fw.util.log.LoggerController",
      "net.sourceforge.squirrel_sql.client.session.mainpanel.objecttree.INodeExpander",
      "org.apache.log4j.spi.OptionHandler",
      "net.sourceforge.squirrel_sql.client.session.mainpanel.ResultTabFactory",
      "net.sourceforge.squirrel_sql.client.session.mainpanel.SQLHistoryComboBox",
      "net.sourceforge.squirrel_sql.fw.util.Utilities$1",
      "net.sourceforge.squirrel_sql.fw.id.IHasIdentifier",
      "org.apache.log4j.helpers.OptionConverter",
      "org.apache.log4j.helpers.FormattingInfo",
      "net.sourceforge.squirrel_sql.fw.util.ITaskThreadPoolCallback",
      "org.apache.commons.httpclient.auth.AuthState",
      "net.sourceforge.squirrel_sql.fw.sql.TokenizerSessPropsInteractions",
      "net.sourceforge.squirrel_sql.client.gui.session.RowColumnLabel",
      "net.sourceforge.squirrel_sql.fw.sql.DatabaseObjectInfo",
      "net.sourceforge.squirrel_sql.fw.util.log.ILoggerFactory",
      "net.sourceforge.squirrel_sql.fw.datasetviewer.DataSetUpdateableTableModelListener",
      "net.sourceforge.squirrel_sql.client.session.schemainfo.SchemaInfoUpdateListener",
      "net.sourceforge.squirrel_sql.fw.id.IntegerIdentifierFactory",
      "net.sourceforge.squirrel_sql.client.gui.desktopcontainer.ITabDelegate",
      "net.sourceforge.squirrel_sql.fw.datasetviewer.IDataSetUpdateableTableModel",
      "net.sourceforge.squirrel_sql.fw.util.NullMessageHandler",
      "net.sourceforge.squirrel_sql.client.session.mainpanel.IMainPanelTab",
      "net.sourceforge.squirrel_sql.fw.datasetviewer.IDataSet",
      "net.sourceforge.squirrel_sql.client.gui.db.IDriversList",
      "org.apache.log4j.helpers.PatternParser",
      "net.sourceforge.squirrel_sql.fw.sql.SQLDriverClassLoader",
      "net.sourceforge.squirrel_sql.client.gui.session.SessionPanel$MyToolBar",
      "org.apache.log4j.Category",
      "net.sourceforge.squirrel_sql.fw.datasetviewer.ResultSetDataSet",
      "net.sourceforge.squirrel_sql.fw.gui.TextPopupMenu",
      "org.springframework.scheduling.concurrent.CustomizableThreadFactory",
      "net.sourceforge.squirrel_sql.fw.sql.PrimaryKeyInfo",
      "net.sourceforge.squirrel_sql.client.gui.desktopcontainer.WidgetEvent",
      "net.sourceforge.squirrel_sql.fw.util.TaskThreadPool",
      "net.sourceforge.squirrel_sql.client.plugin.PluginException",
      "net.sourceforge.squirrel_sql.client.session.mainpanel.objecttree.ObjectTreePanel$LeftPanel",
      "org.apache.commons.httpclient.params.HttpClientParams",
      "net.sourceforge.squirrel_sql.fw.sql.TableColumnInfo",
      "org.apache.log4j.ConsoleAppender",
      "net.sourceforge.squirrel_sql.fw.gui.ToolBar",
      "net.sourceforge.squirrel_sql.client.gui.session.SessionPanel",
      "net.sourceforge.squirrel_sql.client.session.MessagePanel",
      "net.sourceforge.squirrel_sql.client.DummyAppPlugin",
      "net.sourceforge.squirrel_sql.client.session.event.SQLPanelEvent",
      "org.apache.log4j.helpers.PatternParser$NamedPatternConverter",
      "net.sourceforge.squirrel_sql.client.gui.desktopcontainer.SessionDialogWidget",
      "net.sourceforge.squirrel_sql.fw.sql.SQLDriverProperty",
      "org.apache.commons.cli.CommandLine",
      "net.sourceforge.squirrel_sql.client.session.ExtendedColumnInfo",
      "net.sourceforge.squirrel_sql.client.session.Session$SQLConnectionListener",
      "net.sourceforge.squirrel_sql.client.session.parser.kernel.TableAliasInfo",
      "net.sourceforge.squirrel_sql.fw.util.Utilities",
      "org.apache.log4j.spi.AppenderAttachable",
      "net.sourceforge.squirrel_sql.client.IApplication",
      "org.apache.log4j.helpers.PatternParser$DatePatternConverter",
      "net.sourceforge.squirrel_sql.client.session.DefaultSQLEntryPanel$MyTextArea",
      "org.springframework.util.Assert",
      "net.sourceforge.squirrel_sql.fw.xml.XMLException",
      "net.sourceforge.squirrel_sql.client.session.SessionManager",
      "net.sourceforge.squirrel_sql.client.session.mainpanel.SQLPanel",
      "net.sourceforge.squirrel_sql.fw.sql.DatabaseObjectType",
      "org.apache.commons.httpclient.params.HttpMethodParams",
      "net.sourceforge.squirrel_sql.client.util.ApplicationFileWrappersImpl",
      "net.sourceforge.squirrel_sql.fw.util.FileWrapperImpl",
      "net.sourceforge.squirrel_sql.client.gui.db.AliasesListInternalFrame",
      "net.sourceforge.squirrel_sql.client.gui.db.ISQLAliasExt",
      "net.sourceforge.squirrel_sql.client.gui.desktopcontainer.WidgetListener",
      "net.sourceforge.squirrel_sql.client.session.mainpanel.SQLHistoryItem",
      "org.springframework.util.CustomizableThreadCreator",
      "net.sourceforge.squirrel_sql.client.gui.desktopcontainer.docktabdesktop.DockTabDesktopPane",
      "net.sourceforge.squirrel_sql.client.session.ISQLEntryPanel",
      "net.sourceforge.squirrel_sql.client.session.mainpanel.SQLHistory",
      "org.apache.commons.httpclient.HttpState",
      "net.sourceforge.squirrel_sql.client.gui.desktopcontainer.TabWidget",
      "net.sourceforge.squirrel_sql.client.gui.desktopcontainer.DockWidget",
      "net.sourceforge.squirrel_sql.client.gui.desktopcontainer.IDialogDelegate",
      "com.gargoylesoftware.base.resource.jdbc.DatabaseMetaDataWrapper",
      "net.sourceforge.squirrel_sql.client.session.properties.EditWhereColsSheet",
      "net.sourceforge.squirrel_sql.client.session.mainpanel.SQLPanel$CopyLastButton",
      "net.sourceforge.squirrel_sql.client.plugin.DefaultPlugin",
      "net.sourceforge.squirrel_sql.fw.gui.TimePanel",
      "org.apache.log4j.WriterAppender",
      "org.apache.commons.cli.Util",
      "net.sourceforge.squirrel_sql.fw.sql.ITokenizerFactory",
      "org.apache.commons.httpclient.params.HttpParams",
      "net.sourceforge.squirrel_sql.client.session.IObjectTreeAPI",
      "net.sourceforge.squirrel_sql.client.gui.db.aliasproperties.IAliasPropertiesPanelController",
      "net.sourceforge.squirrel_sql.client.gui.mainframe.SquirrelDesktopManager",
      "net.sourceforge.squirrel_sql.client.session.sqlfilter.SQLFilterSheet",
      "net.sourceforge.squirrel_sql.fw.util.BaseException",
      "org.apache.log4j.helpers.Loader",
      "org.apache.log4j.helpers.FileWatchdog",
      "net.sourceforge.squirrel_sql.client.gui.desktopcontainer.IWidget",
      "net.sourceforge.squirrel_sql.client.session.schemainfo.CaseInsensitiveString",
      "net.sourceforge.squirrel_sql.client.session.mainpanel.objecttree.ObjectTree",
      "net.sourceforge.squirrel_sql.fw.sql.ISQLDriver",
      "net.sourceforge.squirrel_sql.client.session.FileManager",
      "net.sourceforge.squirrel_sql.fw.datasetviewer.ResultSetMetaDataDataSet",
      "net.sourceforge.squirrel_sql.client.session.mainpanel.objecttree.ObjectTreeTabbedPane",
      "net.sourceforge.squirrel_sql.fw.sql.SQLDriver$IStrings",
      "net.sourceforge.squirrel_sql.fw.util.DefaultExceptionFormatter",
      "org.apache.commons.cli.MissingOptionException",
      "org.apache.commons.httpclient.HttpMethod",
      "net.sourceforge.squirrel_sql.client.gui.desktopcontainer.docktabdesktop.DockTabDesktopPaneHolder",
      "org.apache.commons.cli.AlreadySelectedException",
      "net.sourceforge.squirrel_sql.client.action.ActionCollection",
      "net.sourceforge.squirrel_sql.client.session.SQLExecutionInfo",
      "net.sourceforge.squirrel_sql.fw.sql.IQueryTokenizer",
      "net.sourceforge.squirrel_sql.fw.sql.SQLDriverManager",
      "net.sourceforge.squirrel_sql.client.plugin.PluginStatus",
      "net.sourceforge.squirrel_sql.fw.sql.ISQLConnection",
      "net.sourceforge.squirrel_sql.fw.datasetviewer.IDataSetUpdateableModel",
      "net.sourceforge.squirrel_sql.fw.gui.action.wikiTable.IWikiTableConfigurationFactory",
      "net.sourceforge.squirrel_sql.fw.gui.IToggleAction",
      "net.sourceforge.squirrel_sql.client.session.mainpanel.objecttree.ObjectTreePanel",
      "net.sourceforge.squirrel_sql.fw.sql.ISQLDatabaseMetaData",
      "net.sourceforge.squirrel_sql.client.gui.mainframe.MainFrame$3",
      "net.sourceforge.squirrel_sql.fw.util.DuplicateObjectException",
      "com.gargoylesoftware.base.resource.jdbc.ConnectionWrapper",
      "net.sourceforge.squirrel_sql.fw.gui.FontInfo",
      "net.sourceforge.squirrel_sql.fw.sql.ISQLAlias",
      "net.sourceforge.squirrel_sql.fw.dialects.DialectType",
      "org.apache.commons.cli.ParseException",
      "net.sourceforge.squirrel_sql.client.session.parser.IParserEventsProcessor",
      "org.apache.commons.httpclient.URI",
      "net.sourceforge.squirrel_sql.client.gui.mainframe.MainFrameStatusBar",
      "net.sourceforge.squirrel_sql.fw.util.IOUtilities",
      "net.sourceforge.squirrel_sql.client.preferences.IUpdateSettings",
      "net.sourceforge.squirrel_sql.fw.util.IMessageHandler",
      "org.apache.log4j.PropertyConfigurator",
      "net.sourceforge.squirrel_sql.client.session.event.SessionAdapter",
      "net.sourceforge.squirrel_sql.client.gui.desktopcontainer.IDelegateBase",
      "net.sourceforge.squirrel_sql.fw.util.IOUtilitiesImpl",
      "net.sourceforge.squirrel_sql.fw.util.MyURLClassLoader",
      "org.apache.commons.cli.GnuParser",
      "net.sourceforge.squirrel_sql.client.plugin.SessionPluginInfo",
      "com.gargoylesoftware.base.resource.jdbc.PreparedStatementWrapper",
      "net.sourceforge.squirrel_sql.fw.util.Resources",
      "org.apache.commons.cli.OptionValidator",
      "net.sourceforge.squirrel_sql.client.ApplicationArguments",
      "net.sourceforge.squirrel_sql.client.gui.db.IAliasesList",
      "net.sourceforge.squirrel_sql.fw.sql.SQLConnection",
      "net.sourceforge.squirrel_sql.fw.util.IProxySettings",
      "net.sourceforge.squirrel_sql.fw.sql.QueryTokenizer",
      "net.sourceforge.squirrel_sql.fw.sql.SQLConnectionState",
      "net.sourceforge.squirrel_sql.client.session.ISQLInternalFrame",
      "net.sourceforge.squirrel_sql.fw.util.log.Log4jLoggerFactory",
      "net.sourceforge.squirrel_sql.fw.util.IResources",
      "net.sourceforge.squirrel_sql.fw.sql.ITableInfo",
      "net.sourceforge.squirrel_sql.fw.gui.IntegerField$IntegerDocument",
      "net.sourceforge.squirrel_sql.client.session.mainpanel.SqlPanelListener",
      "org.apache.log4j.PatternLayout",
      "org.apache.log4j.spi.LoggerRepository",
      "net.sourceforge.squirrel_sql.client.session.mainpanel.SQLResultExecuterPanelFacade",
      "net.sourceforge.squirrel_sql.client.gui.desktopcontainer.DesktopStyle",
      "net.sourceforge.squirrel_sql.client.gui.desktopcontainer.WidgetAdapter",
      "net.sourceforge.squirrel_sql.client.gui.desktopcontainer.TitleFilePathHandlerListener",
      "org.apache.log4j.Level",
      "org.apache.log4j.helpers.DateTimeDateFormat",
      "org.apache.log4j.helpers.QuietWriter",
      "net.sourceforge.squirrel_sql.client.gui.session.IMainPanelFactory",
      "org.apache.log4j.ConsoleAppender$SystemOutStream",
      "net.sourceforge.squirrel_sql.client.session.mainpanel.SQLPanel$LimitRowsCheckBoxListener",
      "org.springframework.util.ClassUtils",
      "net.sourceforge.squirrel_sql.client.MultipleWindowsHandler",
      "net.sourceforge.squirrel_sql.client.gui.db.SQLAliasSchemaDetailProperties",
      "org.apache.log4j.helpers.ISO8601DateFormat",
      "net.sourceforge.squirrel_sql.client.session.DefaultSQLEntryPanel",
      "net.sourceforge.squirrel_sql.client.gui.session.MainPanel",
      "net.sourceforge.squirrel_sql.client.plugin.IPluginManager",
      "org.apache.log4j.helpers.PatternParser$BasicPatternConverter",
      "net.sourceforge.squirrel_sql.client.util.ApplicationFiles$1OldFileNameFilter",
      "net.sourceforge.squirrel_sql.client.session.properties.SessionPropertiesSheet",
      "net.sourceforge.squirrel_sql.client.session.schemainfo.SchemaInfo$1",
      "org.apache.log4j.Layout",
      "net.sourceforge.squirrel_sql.client.session.mainpanel.SQLPanel$MyPropertiesListener",
      "net.sourceforge.squirrel_sql.client.session.JdbcConnectionData",
      "net.sourceforge.squirrel_sql.client.gui.db.BaseListInternalFrame",
      "com.gargoylesoftware.base.resource.ManagedResource",
      "net.sourceforge.squirrel_sql.fw.sql.SQLDriverPropertyCollection",
      "net.sourceforge.squirrel_sql.client.session.mainpanel.IUndoHandler",
      "net.sourceforge.squirrel_sql.client.session.parser.kernel.ErrorInfo",
      "net.sourceforge.squirrel_sql.fw.util.FileWrapperFactoryImpl",
      "com.gargoylesoftware.base.resource.jdbc.CallableStatementWrapper",
      "net.sourceforge.squirrel_sql.client.gui.mainframe.MainFrameMenuBar",
      "net.sourceforge.squirrel_sql.fw.id.UidIdentifier",
      "org.apache.commons.httpclient.HttpConnectionManager",
      "org.apache.log4j.helpers.PatternParser$CategoryPatternConverter",
      "net.sourceforge.squirrel_sql.client.session.mainpanel.ResultFrame",
      "org.apache.commons.cli.Option",
      "net.sourceforge.squirrel_sql.client.gui.desktopcontainer.DialogWidget",
      "net.sourceforge.squirrel_sql.fw.gui.IntegerField",
      "org.apache.log4j.spi.DefaultRepositorySelector",
      "net.sourceforge.squirrel_sql.fw.util.FileWrapperFactory",
      "net.sourceforge.squirrel_sql.fw.datasetviewer.DataSetDefinition",
      "net.sourceforge.squirrel_sql.client.session.schemainfo.SchemaInfoCache",
      "net.sourceforge.squirrel_sql.fw.util.log.Log4jLoggerFactory$1",
      "net.sourceforge.squirrel_sql.fw.sql.IDatabaseObjectInfo",
      "net.sourceforge.squirrel_sql.fw.util.PropertyChangeReporter",
      "com.gargoylesoftware.base.resource.jdbc.AlreadyClosedException",
      "net.sourceforge.squirrel_sql.client.session.parser.ParserEventsListener",
      "net.sourceforge.squirrel_sql.client.gui.db.SQLAliasSchemaProperties",
      "org.apache.commons.cli.MissingArgumentException",
      "net.sourceforge.squirrel_sql.client.gui.desktopcontainer.SessionTabWidget",
      "net.sourceforge.squirrel_sql.fw.util.ExceptionFormatter",
      "net.sourceforge.squirrel_sql.client.session.schemainfo.FilterMatcher",
      "net.sourceforge.squirrel_sql.fw.id.IntegerIdentifier",
      "org.apache.log4j.or.ObjectRenderer",
      "net.sourceforge.squirrel_sql.client.preferences.SquirrelPreferences",
      "net.sourceforge.squirrel_sql.fw.util.beanwrapper.StringWrapper",
      "net.sourceforge.squirrel_sql.client.resources.SquirrelResources",
      "net.sourceforge.squirrel_sql.client.session.IObjectTreeInternalFrame",
      "org.apache.log4j.helpers.PatternParser$ClassNamePatternConverter",
      "net.sourceforge.squirrel_sql.client.gui.desktopcontainer.ISessionWidget",
      "net.sourceforge.squirrel_sql.fw.gui.StatusBar",
      "net.sourceforge.squirrel_sql.client.gui.mainframe.SplitPnResizeHandler",
      "net.sourceforge.squirrel_sql.fw.datasetviewer.ColumnDisplayDefinition",
      "net.sourceforge.squirrel_sql.client.Version",
      "net.sourceforge.squirrel_sql.client.session.event.ISessionListener",
      "net.sourceforge.squirrel_sql.client.session.mainpanel.ISQLResultExecuter",
      "net.sourceforge.squirrel_sql.client.gui.desktopcontainer.IDesktopContainer",
      "net.sourceforge.squirrel_sql.client.session.properties.SessionProperties",
      "org.apache.commons.httpclient.params.DefaultHttpParams",
      "net.sourceforge.squirrel_sql.client.session.mainpanel.SQLResultExecuterPanel",
      "org.apache.commons.httpclient.HttpClient",
      "org.apache.log4j.spi.LoggerFactory",
      "org.apache.log4j.spi.Configurator",
      "net.sourceforge.squirrel_sql.fw.util.ListMessageHandler",
      "net.sourceforge.squirrel_sql.client.session.mainpanel.CancelPanelCtrl",
      "net.sourceforge.squirrel_sql.client.IApplicationArguments",
      "net.sourceforge.squirrel_sql.fw.sql.IProcedureInfo",
      "net.sourceforge.squirrel_sql.client.session.schemainfo.SchemaInfo",
      "org.apache.log4j.spi.LocationInfo",
      "net.sourceforge.squirrel_sql.fw.util.FileWrapper",
      "net.sourceforge.squirrel_sql.client.gui.desktopcontainer.docktabdesktop.SmallTabButton",
      "org.apache.log4j.PropertyWatchdog",
      "net.sourceforge.squirrel_sql.client.session.IAllowedSchemaChecker",
      "org.apache.commons.cli.Options",
      "net.sourceforge.squirrel_sql.client.preferences.PreferenceType",
      "net.sourceforge.squirrel_sql.client.gui.session.SQLInternalFrame",
      "net.sourceforge.squirrel_sql.client.mainframe.action.OpenConnectionCommandListener",
      "org.apache.commons.cli.OptionBuilder",
      "net.sourceforge.squirrel_sql.client.session.SQLTokenListener",
      "org.apache.commons.httpclient.HttpException",
      "net.sourceforge.squirrel_sql.client.gui.WindowManager",
      "net.sourceforge.squirrel_sql.fw.datasetviewer.IMainFrame",
      "net.sourceforge.squirrel_sql.client.gui.db.SQLAlias",
      "org.apache.commons.cli.CommandLineParser",
      "net.sourceforge.squirrel_sql.client.session.event.SQLResultExecuterTabEvent",
      "org.apache.log4j.helpers.PatternParser$MDCPatternConverter",
      "net.sourceforge.squirrel_sql.fw.gui.ChooserPreviewer",
      "net.sourceforge.squirrel_sql.client.session.mainpanel.SQLPanel$SqlComboListener",
      "org.apache.log4j.Priority",
      "net.sourceforge.squirrel_sql.client.gui.desktopcontainer.IDockDelegate",
      "org.apache.log4j.LogManager",
      "net.sourceforge.squirrel_sql.client.session.Session",
      "net.sourceforge.squirrel_sql.client.plugin.PluginInfo",
      "net.sourceforge.squirrel_sql.client.session.mainpanel.ErrorPanel",
      "net.sourceforge.squirrel_sql.client.gui.db.SchemaNameLoadInfo",
      "net.sourceforge.squirrel_sql.client.session.mainpanel.SQLPanel$SQLExecutorHistoryListener",
      "net.sourceforge.squirrel_sql.fw.sql.ForeignKeyInfo",
      "org.apache.log4j.DefaultCategoryFactory",
      "org.apache.commons.httpclient.URIException",
      "org.apache.log4j.or.RendererMap",
      "net.sourceforge.squirrel_sql.fw.persist.IValidatable",
      "net.sourceforge.squirrel_sql.client.session.MessagePanel$MessagePanelPopupMenu",
      "net.sourceforge.squirrel_sql.client.session.mainpanel.SQLHistoryComboBoxModel",
      "org.apache.log4j.ConsoleAppender$SystemErrStream",
      "net.sourceforge.squirrel_sql.client.util.IOptionPanel",
      "net.sourceforge.squirrel_sql.fw.id.IIdentifier",
      "net.sourceforge.squirrel_sql.client.session.event.ISQLExecutionListener",
      "net.sourceforge.squirrel_sql.client.gui.LogPanel",
      "net.sourceforge.squirrel_sql.client.session.SQLPanelAPI",
      "org.apache.commons.cli.Parser",
      "net.sourceforge.squirrel_sql.fw.sql.QueryTokenizer$1",
      "org.apache.log4j.helpers.PatternParser$LocationPatternConverter",
      "org.apache.log4j.CategoryKey",
      "net.sourceforge.squirrel_sql.client.gui.MemoryPanel",
      "net.sourceforge.squirrel_sql.fw.gui.action.wikiTable.IWikiTableConfiguration",
      "net.sourceforge.squirrel_sql.client.session.event.ISQLPanelListener",
      "org.apache.log4j.helpers.OnlyOnceErrorHandler",
      "net.sourceforge.squirrel_sql.fw.sql.DataTypeInfo",
      "net.sourceforge.squirrel_sql.client.session.schemainfo.ObjFilterMatcher",
      "org.apache.log4j.ProvisionNode",
      "net.sourceforge.squirrel_sql.fw.util.StringManager",
      "com.gargoylesoftware.base.resource.jdbc.StatementWrapper",
      "net.sourceforge.squirrel_sql.client.session.mainpanel.IResultTab",
      "net.sourceforge.squirrel_sql.client.session.mainpanel.ResultTab",
      "net.sourceforge.squirrel_sql.fw.util.ProxySettings",
      "org.apache.commons.httpclient.NameValuePair",
      "net.sourceforge.squirrel_sql.client.session.Session$1",
      "net.sourceforge.squirrel_sql.fw.gui.WindowState",
      "net.sourceforge.squirrel_sql.fw.util.log.ILoggerListener",
      "net.sourceforge.squirrel_sql.client.gui.session.SessionInternalFrame",
      "net.sourceforge.squirrel_sql.client.session.Session$2",
      "net.sourceforge.squirrel_sql.client.session.Session$3",
      "org.apache.log4j.helpers.PatternParser$LiteralPatternConverter",
      "org.apache.log4j.spi.RootLogger",
      "net.sourceforge.squirrel_sql.client.gui.db.SchemaTableTypeCombination",
      "net.sourceforge.squirrel_sql.fw.preferences.BaseQueryTokenizerPreferenceBean",
      "org.apache.log4j.spi.ErrorHandler",
      "net.sourceforge.squirrel_sql.fw.id.IIdentifierFactory",
      "net.sourceforge.squirrel_sql.fw.preferences.IQueryTokenizerPreferenceBean",
      "net.sourceforge.squirrel_sql.client.session.mainpanel.SQLPanel$LimitRowsTextBoxListener",
      "org.apache.log4j.spi.RendererSupport",
      "org.apache.commons.httpclient.Credentials",
      "net.sourceforge.squirrel_sql.client.session.mainpanel.ResultFrameListener",
      "net.sourceforge.squirrel_sql.client.session.event.SQLExecutionAdapter",
      "org.apache.commons.cli.OptionGroup",
      "org.apache.log4j.helpers.AppenderAttachableImpl",
      "net.sourceforge.squirrel_sql.client.gui.db.SQLAliasColorProperties",
      "net.sourceforge.squirrel_sql.client.preferences.INewSessionPropertiesPanel",
      "net.sourceforge.squirrel_sql.client.gui.mainframe.MainFrameToolBar$AliasesDropDown",
      "net.sourceforge.squirrel_sql.client.ApplicationArguments$IOptions",
      "org.apache.log4j.BasicConfigurator",
      "org.apache.log4j.helpers.AbsoluteTimeDateFormat",
      "net.sourceforge.squirrel_sql.client.session.mainpanel.objecttree.ObjectTreeNode",
      "net.sourceforge.squirrel_sql.client.session.mainpanel.BaseMainPanelTab",
      "net.sourceforge.squirrel_sql.fw.sql.ForeignKeyColumnInfo",
      "org.apache.log4j.Logger",
      "net.sourceforge.squirrel_sql.client.gui.SessionWindowsHolder",
      "net.sourceforge.squirrel_sql.fw.sql.ProgressCallBack",
      "net.sourceforge.squirrel_sql.client.mainframe.action.OpenConnectionCommand",
      "net.sourceforge.squirrel_sql.client.util.ApplicationFileWrappers",
      "net.sourceforge.squirrel_sql.client.session.ISQLPanelAPI",
      "org.apache.log4j.helpers.LogLog",
      "net.sourceforge.squirrel_sql.fw.util.StringManagerFactory",
      "net.sourceforge.squirrel_sql.client.session.mainpanel.objecttree.IObjectTreeListener",
      "org.apache.log4j.spi.RepositorySelector",
      "net.sourceforge.squirrel_sql.client.gui.mainframe.MainFrame",
      "net.sourceforge.squirrel_sql.client.gui.mainframe.MainFrameToolBar$SessionDropDown",
      "net.sourceforge.squirrel_sql.fw.util.ISessionProperties",
      "org.apache.log4j.or.DefaultRenderer",
      "net.sourceforge.squirrel_sql.fw.util.log.Log4jLogger",
      "org.apache.commons.httpclient.HttpConnection",
      "net.sourceforge.squirrel_sql.fw.sql.SQLDriver",
      "net.sourceforge.squirrel_sql.client.gui.util.ThreadCheckingRepaintManager",
      "net.sourceforge.squirrel_sql.client.session.ISession",
      "org.apache.commons.logging.impl.Log4JLogger",
      "net.sourceforge.squirrel_sql.client.ApplicationListener",
      "net.sourceforge.squirrel_sql.client.session.BaseSQLEntryPanel",
      "org.apache.log4j.Appender",
      "net.sourceforge.squirrel_sql.fw.datasetviewer.DataSetException",
      "net.sourceforge.squirrel_sql.fw.sql.dbobj.BestRowIdentifier",
      "net.sourceforge.squirrel_sql.client.util.ApplicationFiles",
      "net.sourceforge.squirrel_sql.client.plugin.IPluginDatabaseObjectType",
      "org.apache.log4j.spi.HierarchyEventListener",
      "net.sourceforge.squirrel_sql.client.gui.db.IToogleableAliasesList",
      "net.sourceforge.squirrel_sql.fw.util.ClassLoaderListener",
      "net.sourceforge.squirrel_sql.client.session.mainpanel.SQLPanel$ShowHistoryButton",
      "org.apache.log4j.spi.LoggingEvent",
      "net.sourceforge.squirrel_sql.fw.persist.ValidationException",
      "org.apache.log4j.spi.ThrowableInformation",
      "net.sourceforge.squirrel_sql.client.session.mainpanel.objecttree.ObjectTreePanel$1",
      "net.sourceforge.squirrel_sql.fw.xml.IXMLAboutToBeWritten",
      "org.apache.commons.httpclient.StatusLine",
      "net.sourceforge.squirrel_sql.client.gui.mainframe.MainFrameToolBar",
      "org.springframework.util.StringUtils"
    );
  } 

  private static void resetClasses() {
    org.evosuite.runtime.classhandling.ClassResetter.getInstance().setClassLoader(Session_ESTest_scaffolding.class.getClassLoader()); 

    org.evosuite.runtime.classhandling.ClassStateSupport.resetClasses(
      "net.sourceforge.squirrel_sql.fw.util.log.Log4jLoggerFactory",
      "net.sourceforge.squirrel_sql.fw.util.log.Log4jLoggerFactory$1",
      "org.apache.log4j.BasicConfigurator",
      "org.apache.log4j.Category",
      "org.apache.log4j.Logger",
      "org.apache.log4j.Hierarchy",
      "org.apache.log4j.spi.RootLogger",
      "org.apache.log4j.Priority",
      "org.apache.log4j.Level",
      "org.apache.log4j.or.DefaultRenderer",
      "org.apache.log4j.or.RendererMap",
      "org.apache.log4j.DefaultCategoryFactory",
      "org.apache.log4j.spi.DefaultRepositorySelector",
      "org.apache.log4j.helpers.OptionConverter",
      "org.apache.log4j.helpers.Loader",
      "org.apache.log4j.helpers.LogLog",
      "org.apache.log4j.PropertyConfigurator",
      "org.apache.log4j.LogManager",
      "org.apache.log4j.AppenderSkeleton",
      "org.apache.log4j.WriterAppender",
      "org.apache.log4j.ConsoleAppender",
      "org.apache.log4j.Layout",
      "org.apache.log4j.PatternLayout",
      "org.apache.log4j.helpers.PatternParser",
      "org.apache.log4j.helpers.FormattingInfo",
      "org.apache.log4j.helpers.PatternConverter",
      "org.apache.log4j.helpers.PatternParser$BasicPatternConverter",
      "org.apache.log4j.helpers.PatternParser$LiteralPatternConverter",
      "org.apache.log4j.helpers.PatternParser$NamedPatternConverter",
      "org.apache.log4j.helpers.PatternParser$CategoryPatternConverter",
      "org.apache.log4j.helpers.OnlyOnceErrorHandler",
      "org.apache.log4j.helpers.QuietWriter",
      "org.apache.log4j.helpers.AppenderAttachableImpl",
      "net.sourceforge.squirrel_sql.fw.util.log.LoggerController",
      "net.sourceforge.squirrel_sql.fw.util.log.Log4jLogger",
      "org.apache.log4j.CategoryKey",
      "org.apache.log4j.ProvisionNode",
      "net.sourceforge.squirrel_sql.fw.util.Utilities",
      "net.sourceforge.squirrel_sql.fw.util.StringManagerFactory",
      "net.sourceforge.squirrel_sql.fw.util.StringManager",
      "net.sourceforge.squirrel_sql.client.session.Session",
      "net.sourceforge.squirrel_sql.client.session.Session$SQLConnectionListener",
      "net.sourceforge.squirrel_sql.client.session.Session$3",
      "net.sourceforge.squirrel_sql.client.session.Session$1",
      "net.sourceforge.squirrel_sql.client.session.Session$2",
      "net.sourceforge.squirrel_sql.fw.util.NullMessageHandler",
      "net.sourceforge.squirrel_sql.client.plugin.DefaultPlugin",
      "net.sourceforge.squirrel_sql.client.DummyAppPlugin",
      "net.sourceforge.squirrel_sql.client.util.ApplicationFileWrappersImpl",
      "net.sourceforge.squirrel_sql.fw.util.FileWrapperFactoryImpl",
      "net.sourceforge.squirrel_sql.client.util.ApplicationFiles",
      "net.sourceforge.squirrel_sql.client.ApplicationArguments",
      "org.apache.commons.cli.Options",
      "net.sourceforge.squirrel_sql.client.ApplicationArguments$IOptions",
      "org.apache.commons.cli.Option",
      "org.apache.commons.cli.OptionValidator",
      "org.apache.commons.cli.OptionBuilder",
      "org.apache.commons.cli.Parser",
      "org.apache.commons.cli.GnuParser",
      "org.apache.commons.cli.CommandLine",
      "org.apache.commons.cli.Util",
      "net.sourceforge.squirrel_sql.client.util.ApplicationFiles$1OldFileNameFilter",
      "net.sourceforge.squirrel_sql.fw.sql.SQLDriver",
      "net.sourceforge.squirrel_sql.fw.id.UidIdentifier",
      "net.sourceforge.squirrel_sql.client.gui.db.SQLAlias",
      "net.sourceforge.squirrel_sql.fw.sql.SQLDriverPropertyCollection",
      "net.sourceforge.squirrel_sql.client.gui.db.SQLAliasSchemaProperties",
      "net.sourceforge.squirrel_sql.client.gui.db.SQLAliasColorProperties",
      "net.sourceforge.squirrel_sql.client.gui.db.SQLAliasConnectionProperties",
      "com.gargoylesoftware.base.resource.jdbc.ConnectionWrapper",
      "net.sourceforge.squirrel_sql.fw.sql.SQLConnection",
      "net.sourceforge.squirrel_sql.fw.sql.SQLDatabaseMetaData",
      "net.sourceforge.squirrel_sql.fw.util.DefaultExceptionFormatter",
      "net.sourceforge.squirrel_sql.client.session.mainpanel.BaseMainPanelTab",
      "net.sourceforge.squirrel_sql.client.session.mainpanel.ObjectTreeTab",
      "net.sourceforge.squirrel_sql.fw.id.IntegerIdentifierFactory",
      "net.sourceforge.squirrel_sql.client.session.BaseSQLEntryPanel",
      "net.sourceforge.squirrel_sql.client.session.DefaultSQLEntryPanel",
      "net.sourceforge.squirrel_sql.fw.id.IntegerIdentifier",
      "net.sourceforge.squirrel_sql.fw.util.PropertyChangeReporter",
      "net.sourceforge.squirrel_sql.fw.util.BaseException",
      "net.sourceforge.squirrel_sql.fw.persist.ValidationException",
      "net.sourceforge.squirrel_sql.fw.sql.SQLDriver$IStrings",
      "com.gargoylesoftware.base.resource.jdbc.DatabaseMetaDataWrapper",
      "net.sourceforge.squirrel_sql.client.session.SQLPanelAPI",
      "net.sourceforge.squirrel_sql.client.session.FileManager",
      "net.sourceforge.squirrel_sql.fw.util.IOUtilitiesImpl",
      "com.gargoylesoftware.base.resource.jdbc.StatementWrapper",
      "com.gargoylesoftware.base.resource.jdbc.PreparedStatementWrapper",
      "net.sourceforge.squirrel_sql.client.Version",
      "net.sourceforge.squirrel_sql.fw.sql.SQLDriverProperty",
      "net.sourceforge.squirrel_sql.fw.preferences.BaseQueryTokenizerPreferenceBean",
      "net.sourceforge.squirrel_sql.fw.sql.QueryTokenizer",
      "net.sourceforge.squirrel_sql.fw.sql.QueryTokenizer$1",
      "net.sourceforge.squirrel_sql.fw.util.FileWrapperImpl",
      "net.sourceforge.squirrel_sql.client.gui.db.SQLAlias$IStrings",
      "net.sourceforge.squirrel_sql.fw.util.beanwrapper.StringWrapper",
      "net.sourceforge.squirrel_sql.client.session.mainpanel.SQLPanel",
      "net.sourceforge.squirrel_sql.fw.gui.IntegerField",
      "net.sourceforge.squirrel_sql.fw.gui.IntegerField$IntegerDocument",
      "net.sourceforge.squirrel_sql.client.session.mainpanel.SQLPanel$SqlComboListener",
      "net.sourceforge.squirrel_sql.client.session.event.SQLExecutionAdapter",
      "net.sourceforge.squirrel_sql.client.session.mainpanel.SQLPanel$SQLExecutorHistoryListener",
      "org.springframework.util.CustomizableThreadCreator",
      "org.springframework.scheduling.concurrent.CustomizableThreadFactory",
      "org.apache.commons.logging.impl.Log4JLogger",
      "org.springframework.util.ClassUtils",
      "org.springframework.util.Assert",
      "org.springframework.util.StringUtils",
      "net.sourceforge.squirrel_sql.fw.util.ListMessageHandler",
      "net.sourceforge.squirrel_sql.client.gui.db.SQLAliasSchemaDetailProperties",
      "com.gargoylesoftware.base.resource.jdbc.CallableStatementWrapper"
    );
  }
}
