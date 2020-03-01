/**
 * Scaffolding file used to store all the setups needed to run 
 * tests automatically generated by EvoSuite
 * Mon Dec 02 23:55:01 GMT 2019
 */

package client.network;

import org.evosuite.runtime.annotation.EvoSuiteClassExclude;
import org.junit.BeforeClass;
import org.junit.Before;
import org.junit.After;
import org.junit.AfterClass;
import org.evosuite.runtime.sandbox.Sandbox;
import org.evosuite.runtime.sandbox.Sandbox.SandboxMode;

@EvoSuiteClassExclude
public class ClientMsgReceiver_ESTest_scaffolding {

  @org.junit.Rule 
  public org.evosuite.runtime.vnet.NonFunctionalRequirementRule nfr = new org.evosuite.runtime.vnet.NonFunctionalRequirementRule();

  private static final java.util.Properties defaultProperties = (java.util.Properties) java.lang.System.getProperties().clone(); 

  private org.evosuite.runtime.thread.ThreadStopper threadStopper =  new org.evosuite.runtime.thread.ThreadStopper (org.evosuite.runtime.thread.KillSwitchHandler.getInstance(), 3000);


  @BeforeClass 
  public static void initEvoSuiteFramework() { 
    org.evosuite.runtime.RuntimeSettings.className = "client.network.ClientMsgReceiver"; 
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
    java.lang.System.setProperty("user.dir", "/home/ubuntu/termite/projects/57_hft-bomberman"); 
    java.lang.System.setProperty("user.home", "/home/ubuntu"); 
    java.lang.System.setProperty("user.language", "en"); 
    java.lang.System.setProperty("user.name", "ubuntu"); 
    java.lang.System.setProperty("user.timezone", "Etc/UTC"); 
    java.lang.System.setProperty("log4j.configuration", "SUT.log4j.properties"); 
  }

  private static void initializeClasses() {
    org.evosuite.runtime.classhandling.ClassStateSupport.initializeClasses(ClientMsgReceiver_ESTest_scaffolding.class.getClassLoader() ,
      "messages.round.BombExplodedMsg",
      "org.hsqldb.SessionManager",
      "org.hsqldb.rowio.RowOutputBinary",
      "org.hsqldb.Server$ServerThread",
      "org.apache.log4j.Level",
      "messages.global.InfoRequestMsg",
      "org.hsqldb.Node",
      "org.hsqldb.lib.HsqlByteArrayOutputStream",
      "org.hsqldb.lib.HsqlList",
      "org.hsqldb.GrantConstants",
      "client.ClientPlayer",
      "db.DBException",
      "messages.round.RoundClientMsg",
      "org.hsqldb.SchemaManager$Schema",
      "client.ClientBomb",
      "org.apache.log4j.spi.Filter",
      "client.gui.HighscoreLobby",
      "common.Map",
      "org.hsqldb.Row",
      "org.hsqldb.lib.IntKeyHashMap",
      "client.gui.components.MyPanel",
      "org.hsqldb.Select",
      "common.PowerUp",
      "messages.global.LoginMsg",
      "org.apache.log4j.Layout",
      "org.hsqldb.Table",
      "org.hsqldb.lib.Collection",
      "client.view.View",
      "client.ClientGameSession",
      "client.gui.GlobalLobby",
      "org.apache.log4j.Hierarchy",
      "client.view.StatusView",
      "org.hsqldb.User",
      "client.gui.CreateGameDialog",
      "org.hsqldb.HsqlSocketRequestHandler",
      "org.hsqldb.resources.BundleHandler",
      "common.GameSession",
      "org.apache.log4j.spi.DefaultRepositorySelector",
      "org.apache.log4j.spi.OptionHandler",
      "client.network.ClientMsgReceiver",
      "org.hsqldb.persist.CachedObject",
      "messages.round.PlayerStateMsg",
      "client.view.BombView",
      "client.view.PowerUpView",
      "org.hsqldb.HsqlNameManager$HsqlName",
      "common.Tile",
      "messages.round.RoundServerMsg",
      "org.hsqldb.Grantee",
      "org.hsqldb.ServerConfiguration",
      "org.apache.log4j.helpers.OptionConverter",
      "client.gui.StartFrame",
      "client.gui.components.MyButton",
      "sound.Sound",
      "sound.SoundPlayer",
      "org.apache.log4j.or.ObjectRenderer",
      "org.hsqldb.lib.HashSet",
      "org.hsqldb.rowio.RowInputBinary",
      "messages.session.SessionClientMsg",
      "org.hsqldb.lib.HsqlByteArrayInputStream",
      "org.hsqldb.lib.Iterator",
      "org.hsqldb.TriggerDef$TriggerData",
      "server.ServerBomb",
      "client.ClientGameRound",
      "messages.global.SessionListMsg",
      "common.Bomb",
      "org.hsqldb.CompiledStatement",
      "org.apache.log4j.Category",
      "common.GameLoop",
      "org.hsqldb.CachedDataRow",
      "org.hsqldb.rowio.RowOutputInterface",
      "org.hsqldb.DiskNode",
      "org.hsqldb.lib.FileAccess",
      "client.gui.ImageCache",
      "org.hsqldb.HsqlInternalException",
      "org.hsqldb.persist.PersistentStore",
      "org.hsqldb.NumberSequence",
      "org.apache.log4j.spi.LoggerFactory",
      "org.apache.log4j.spi.Configurator",
      "common.network.MsgSender",
      "org.hsqldb.rowio.RowInputInterface",
      "javazoom.jl.decoder.JavaLayerException",
      "messages.round.NewBombMsg",
      "messages.session.SessionParticipationMsg",
      "org.apache.log4j.spi.LocationInfo",
      "org.apache.log4j.PropertyWatchdog",
      "org.hsqldb.store.HashIndex",
      "org.hsqldb.jdbc.jdbcDataSource",
      "org.hsqldb.Server",
      "org.hsqldb.index.RowIterator",
      "org.hsqldb.Index",
      "messages.round.TileHitPlayerMsg",
      "org.hsqldb.GranteeManager",
      "org.hsqldb.lib.FileAccess$FileSync",
      "server.ExplosionBounds",
      "messages.round.RoundTimeOverMsg",
      "org.hsqldb.rowio.RowInputBase",
      "client.view.PlayerView",
      "client.BomberClient",
      "org.hsqldb.Constraint",
      "org.hsqldb.lib.ObjectComparator",
      "org.apache.log4j.spi.AppenderAttachable",
      "messages.global.SessionDetailsMsg",
      "org.apache.log4j.spi.NullWriter",
      "org.hsqldb.BaseTable",
      "org.hsqldb.Result$ResultMetaData",
      "org.hsqldb.Database",
      "org.apache.log4j.Priority",
      "org.hsqldb.TriggerDef",
      "org.apache.log4j.LogManager",
      "org.hsqldb.ServerConnection",
      "messages.session.SessionChatMsg",
      "common.GameRound",
      "client.gui.SplashThread",
      "org.hsqldb.lib.FileUtil",
      "server.ServerPlayer",
      "common.Actor",
      "client.view.OffGamePainter",
      "org.apache.log4j.DefaultCategoryFactory",
      "client.gui.LoginDialog",
      "org.apache.log4j.or.RendererMap",
      "messages.round.MagicKillMsg",
      "client.gui.ServerSelectionDialog",
      "org.hsqldb.WebServerConnection",
      "org.hsqldb.store.ValuePool",
      "messages.round.NewTileMsg",
      "org.hsqldb.Column",
      "messages.round.PowerUpHitMsg",
      "org.hsqldb.CachedRow",
      "org.hsqldb.lib.Set",
      "messages.global.GlobalServerMsg",
      "org.hsqldb.SubQuery",
      "org.hsqldb.ServerConstants",
      "org.hsqldb.Record",
      "messages.round.RoundStateMsg",
      "org.hsqldb.PointerNode",
      "org.apache.log4j.CategoryKey",
      "org.hsqldb.persist.HsqlProperties",
      "org.hsqldb.rowio.RowOutputBase",
      "messages.round.RoundScoreMsg",
      "db.DBGameUser",
      "messages.session.SessionStateMsg",
      "messages.round.BombMoveMsg",
      "messages.global.GlobalClientMsg",
      "messages.session.SessionScoreMsg",
      "org.hsqldb.jdbc.jdbcConnection",
      "org.hsqldb.UserManager",
      "org.hsqldb.SessionInterface",
      "org.apache.log4j.helpers.Loader",
      "server.ServerGameRound",
      "org.apache.log4j.ProvisionNode",
      "server.ServerGameLoop",
      "org.hsqldb.lib.StringUtil",
      "common.MapReader",
      "org.apache.log4j.helpers.FileWatchdog",
      "messages.global.GlobalChatMsg",
      "client.view.TileView",
      "org.hsqldb.lib.java.JavaSystem",
      "org.hsqldb.store.BaseHashMap",
      "org.hsqldb.types.JavaObject",
      "messages.round.ClientQuitRunningSessionMsg",
      "org.apache.log4j.spi.RootLogger",
      "org.hsqldb.BaseMemoryNode",
      "client.gui.Game",
      "org.apache.log4j.spi.ErrorHandler",
      "org.apache.log4j.spi.VectorWriter",
      "org.apache.log4j.spi.RendererSupport",
      "org.hsqldb.lib.IntLookup",
      "messages.global.MapInfo",
      "client.view.GameObjectView",
      "org.hsqldb.View",
      "org.hsqldb.Index$IndexRowIterator",
      "messages.global.ScoreMsg",
      "server.network.ServerMsgReceiver",
      "org.hsqldb.types.Binary",
      "org.hsqldb.lib.IntValueHashMap",
      "org.hsqldb.lib.HashMap",
      "org.hsqldb.MemoryNode",
      "common.network.MsgReceiver",
      "messages.Message",
      "common.XmlFunctions",
      "org.hsqldb.store.ValuePoolHashMap",
      "org.apache.log4j.Logger",
      "server.ServerGameSession",
      "common.GameModel",
      "messages.global.JoinAckMsg",
      "messages.round.CountdownMsg",
      "org.apache.log4j.helpers.LogLog",
      "common.Player",
      "messages.global.JoinSessionMsg",
      "messages.global.MapListMsg",
      "org.apache.log4j.spi.RepositorySelector",
      "org.hsqldb.persist.DataFileCache",
      "org.hsqldb.lib.HsqlArrayList",
      "client.gui.Chat",
      "messages.round.RoundTimeOneSecondLeftMsg",
      "org.hsqldb.HsqlException",
      "common.GameObject",
      "org.apache.log4j.or.DefaultRenderer",
      "org.hsqldb.persist.HsqlDatabaseProperties",
      "client.gui.SessionLobby",
      "org.hsqldb.Collation",
      "server.network.ServerMsgSender",
      "org.hsqldb.lib.BaseList",
      "org.hsqldb.Result",
      "org.hsqldb.Expression",
      "org.apache.log4j.PropertyConfigurator",
      "client.gui.GlobalHighscoreLobby",
      "server.ServerGameModel",
      "org.apache.log4j.Appender",
      "client.controller.LocalControl",
      "server.BomberServer",
      "org.hsqldb.lib.HashMappedList",
      "server.ServerPowerUp",
      "client.view.GameCanvas",
      "org.apache.log4j.spi.HierarchyEventListener",
      "org.hsqldb.TableFilter",
      "org.apache.log4j.spi.LoggingEvent",
      "messages.global.StopServerMsg",
      "org.apache.log4j.spi.ThrowableInformation",
      "messages.session.SessionServerMsg",
      "messages.session.PlayerLeftMsg",
      "messages.global.GlobalStateMsg",
      "org.hsqldb.Session",
      "server.ClientInfo",
      "org.apache.log4j.spi.LoggerRepository"
    );
  } 

  private static void resetClasses() {
    org.evosuite.runtime.classhandling.ClassResetter.getInstance().setClassLoader(ClientMsgReceiver_ESTest_scaffolding.class.getClassLoader()); 

    org.evosuite.runtime.classhandling.ClassStateSupport.resetClasses(
      "org.apache.log4j.Category",
      "org.apache.log4j.Priority",
      "org.apache.log4j.Level",
      "org.apache.log4j.Logger",
      "org.apache.log4j.Hierarchy",
      "org.apache.log4j.spi.RootLogger",
      "org.apache.log4j.or.DefaultRenderer",
      "org.apache.log4j.or.RendererMap",
      "org.apache.log4j.DefaultCategoryFactory",
      "org.apache.log4j.spi.DefaultRepositorySelector",
      "org.apache.log4j.helpers.OptionConverter",
      "org.apache.log4j.helpers.Loader",
      "org.apache.log4j.helpers.LogLog",
      "org.apache.log4j.PropertyConfigurator",
      "org.apache.log4j.LogManager",
      "org.apache.log4j.CategoryKey",
      "org.apache.log4j.ProvisionNode",
      "common.network.MsgReceiver",
      "client.network.ClientMsgReceiver",
      "client.gui.StartFrame",
      "client.BomberClient",
      "messages.round.RoundTimeOneSecondLeftMsg",
      "messages.session.SessionChatMsg",
      "common.Map",
      "common.MapReader",
      "common.XmlFunctions",
      "messages.global.GlobalStateMsg",
      "messages.round.MagicKillMsg",
      "messages.session.SessionStateMsg",
      "common.GameObject",
      "common.Actor",
      "common.Player",
      "client.ClientPlayer",
      "client.view.GameCanvas",
      "messages.global.MapListMsg",
      "messages.global.JoinSessionMsg",
      "messages.global.SessionDetailsMsg",
      "common.GameSession",
      "client.ClientGameSession",
      "messages.global.InfoRequestMsg",
      "messages.global.GlobalChatMsg",
      "messages.round.PowerUpHitMsg",
      "messages.global.JoinAckMsg",
      "messages.round.RoundStateMsg",
      "messages.round.RoundTimeOverMsg",
      "messages.round.ClientQuitRunningSessionMsg",
      "messages.round.NewTileMsg",
      "server.ServerGameSession",
      "messages.global.MapInfo",
      "messages.session.PlayerLeftMsg",
      "messages.session.SessionParticipationMsg",
      "messages.global.StopServerMsg",
      "client.gui.SplashThread",
      "sound.SoundPlayer",
      "sound.Sound",
      "messages.round.CountdownMsg",
      "messages.round.TileHitPlayerMsg",
      "messages.round.PlayerStateMsg",
      "messages.global.SessionListMsg",
      "messages.round.BombMoveMsg",
      "messages.global.ScoreMsg",
      "server.BomberServer",
      "org.hsqldb.store.BaseHashMap",
      "org.hsqldb.lib.HashMap",
      "org.hsqldb.store.HashIndex",
      "org.hsqldb.lib.BaseList",
      "org.hsqldb.lib.HsqlArrayList",
      "org.hsqldb.resources.BundleHandler",
      "org.hsqldb.Server",
      "org.hsqldb.lib.FileUtil",
      "org.hsqldb.ServerConfiguration",
      "org.hsqldb.lib.StringUtil",
      "org.hsqldb.persist.HsqlProperties",
      "org.hsqldb.lib.HashSet",
      "org.hsqldb.lib.java.JavaSystem",
      "org.hsqldb.Server$ServerThread",
      "messages.global.LoginMsg",
      "server.ClientInfo",
      "server.network.ServerMsgReceiver",
      "messages.round.RoundScoreMsg",
      "messages.round.NewBombMsg",
      "messages.session.SessionScoreMsg",
      "messages.round.BombExplodedMsg"
    );
  }
}
