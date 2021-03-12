/**
 * Scaffolding file used to store all the setups needed to run 
 * tests automatically generated by EvoSuite
 * Sun Nov 08 16:51:51 GMT 2020
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
    java.lang.System.setProperty("user.dir", "/home/ubuntu/replication/scripts/projects/57_hft-bomberman"); 
    java.lang.System.setProperty("user.home", "/home/ubuntu"); 
    java.lang.System.setProperty("user.language", "en"); 
    java.lang.System.setProperty("user.name", "ubuntu"); 
    java.lang.System.setProperty("user.timezone", "Etc/UTC"); 
    java.lang.System.setProperty("log4j.configuration", "SUT.log4j.properties"); 
  }

  private static void initializeClasses() {
    org.evosuite.runtime.classhandling.ClassStateSupport.initializeClasses(ClientMsgReceiver_ESTest_scaffolding.class.getClassLoader() ,
      "org.hsqldb.lib.FileUtil",
      "client.gui.SplashThread",
      "server.ServerPlayer",
      "common.Actor",
      "messages.session.InitializeRoundMsg",
      "common.ResourceService",
      "client.view.OffGamePainter",
      "org.apache.log4j.DefaultCategoryFactory",
      "client.gui.LoginDialog",
      "org.apache.log4j.or.RendererMap",
      "messages.round.MagicKillMsg",
      "client.gui.ServerSelectionDialog",
      "messages.round.BombExplodedMsg",
      "org.hsqldb.WebServerConnection",
      "messages.round.NewTileMsg",
      "org.hsqldb.rowio.RowOutputBinary",
      "org.hsqldb.Server$ServerThread",
      "org.apache.log4j.Level",
      "messages.round.PowerUpHitMsg",
      "messages.global.InfoRequestMsg",
      "org.hsqldb.lib.Set",
      "messages.global.GlobalServerMsg",
      "org.hsqldb.lib.HsqlByteArrayOutputStream",
      "org.hsqldb.ServerConstants",
      "org.hsqldb.Record",
      "messages.round.RoundStateMsg",
      "org.hsqldb.lib.HsqlList",
      "client.ClientPlayer",
      "db.DBException",
      "messages.round.RoundClientMsg",
      "client.ClientBomb",
      "org.apache.log4j.spi.Filter",
      "client.view.OverlayView",
      "client.gui.HighscoreLobby",
      "common.Map",
      "org.apache.log4j.CategoryKey",
      "client.gui.components.MyPanel",
      "org.hsqldb.persist.HsqlProperties",
      "org.hsqldb.rowio.RowOutputBase",
      "common.PowerUp",
      "messages.global.LoginMsg",
      "org.apache.log4j.Layout",
      "messages.round.RoundScoreMsg",
      "db.DBGameUser",
      "messages.round.BombMoveMsg",
      "messages.session.SessionStateMsg",
      "org.hsqldb.lib.Collection",
      "client.view.ExplosionGfxFactory",
      "client.view.View",
      "messages.global.GlobalClientMsg",
      "messages.session.SessionScoreMsg",
      "org.hsqldb.SessionInterface",
      "client.gui.GlobalLobby",
      "client.ClientGameSession",
      "org.apache.log4j.helpers.Loader",
      "server.ServerGameRound",
      "org.apache.log4j.ProvisionNode",
      "server.ServerGameLoop",
      "org.apache.log4j.Hierarchy",
      "org.hsqldb.lib.StringUtil",
      "common.MapReader",
      "org.apache.log4j.helpers.FileWatchdog",
      "messages.global.GlobalChatMsg",
      "client.view.StatusView",
      "client.gui.CreateGameDialog",
      "client.view.TileView",
      "org.hsqldb.HsqlSocketRequestHandler",
      "org.hsqldb.lib.java.JavaSystem",
      "org.hsqldb.store.BaseHashMap",
      "org.hsqldb.resources.BundleHandler",
      "common.GameSession",
      "org.apache.log4j.spi.DefaultRepositorySelector",
      "org.apache.log4j.spi.OptionHandler",
      "client.network.ClientMsgReceiver",
      "messages.round.ClientQuitRunningSessionMsg",
      "org.apache.log4j.spi.RootLogger",
      "messages.round.PlayerStateMsg",
      "client.gui.Game",
      "org.apache.log4j.spi.ErrorHandler",
      "client.view.BombView",
      "org.apache.log4j.spi.RendererSupport",
      "client.view.PowerUpView",
      "common.Tile",
      "client.view.GameObjectView",
      "messages.round.RoundServerMsg",
      "org.hsqldb.ServerConfiguration",
      "org.apache.log4j.helpers.OptionConverter",
      "client.gui.StartFrame",
      "client.gui.components.MyButton",
      "sound.Sound",
      "messages.global.ScoreMsg",
      "server.network.ServerMsgReceiver",
      "client.view.GameView",
      "sound.SoundPlayer",
      "org.hsqldb.lib.HashMap",
      "org.apache.log4j.or.ObjectRenderer",
      "common.network.MsgReceiver",
      "messages.Message",
      "org.hsqldb.lib.HashSet",
      "common.XmlFunctions",
      "org.hsqldb.rowio.RowInputBinary",
      "messages.session.SessionClientMsg",
      "org.hsqldb.lib.HsqlByteArrayInputStream",
      "org.hsqldb.lib.Iterator",
      "client.network.ForwardingObserver",
      "org.apache.log4j.Logger",
      "server.ServerGameSession",
      "common.GameModel",
      "server.ServerBomb",
      "client.ClientGameRound",
      "messages.global.JoinAckMsg",
      "messages.global.SessionListMsg",
      "messages.round.CountdownMsg",
      "common.Bomb",
      "org.apache.log4j.helpers.LogLog",
      "org.apache.log4j.Category",
      "common.GameLoop",
      "common.Player",
      "messages.global.JoinSessionMsg",
      "org.hsqldb.rowio.RowOutputInterface",
      "messages.global.MapListMsg",
      "org.apache.log4j.spi.RepositorySelector",
      "org.hsqldb.lib.FileAccess",
      "client.gui.ImageCache",
      "org.hsqldb.lib.HsqlArrayList",
      "client.gui.Chat",
      "messages.round.RoundTimeOneSecondLeftMsg",
      "org.apache.log4j.spi.LoggerFactory",
      "client.view.GfxFactory",
      "org.apache.log4j.spi.Configurator",
      "common.network.MsgSender",
      "org.hsqldb.HsqlException",
      "org.hsqldb.rowio.RowInputInterface",
      "common.GameObject",
      "org.apache.log4j.or.DefaultRenderer",
      "messages.round.NewBombMsg",
      "javazoom.jl.decoder.JavaLayerException",
      "messages.session.SessionParticipationMsg",
      "org.apache.log4j.spi.LocationInfo",
      "client.gui.SessionLobby",
      "server.network.ServerMsgSender",
      "org.apache.log4j.PropertyWatchdog",
      "org.hsqldb.lib.BaseList",
      "org.hsqldb.store.HashIndex",
      "org.hsqldb.jdbc.jdbcDataSource",
      "org.hsqldb.Result",
      "org.apache.log4j.PropertyConfigurator",
      "client.gui.GlobalHighscoreLobby",
      "org.hsqldb.Server",
      "server.ServerGameModel",
      "org.apache.log4j.Appender",
      "messages.round.TileHitPlayerMsg",
      "client.controller.LocalControl",
      "server.BomberServer",
      "org.hsqldb.lib.FileAccess$FileSync",
      "server.ExplosionBounds",
      "messages.round.RoundTimeOverMsg",
      "org.hsqldb.rowio.RowInputBase",
      "server.ServerPowerUp",
      "client.view.GameCanvas",
      "client.view.PlayerView",
      "client.BomberClient",
      "org.apache.log4j.spi.HierarchyEventListener",
      "org.hsqldb.lib.ObjectComparator",
      "org.apache.log4j.spi.AppenderAttachable",
      "org.apache.log4j.spi.LoggingEvent",
      "messages.global.SessionDetailsMsg",
      "messages.global.StopServerMsg",
      "org.apache.log4j.spi.ThrowableInformation",
      "messages.session.SessionServerMsg",
      "org.apache.log4j.Priority",
      "messages.session.PlayerLeftMsg",
      "messages.global.GlobalStateMsg",
      "org.hsqldb.Session",
      "server.ClientInfo",
      "org.apache.log4j.spi.LoggerRepository",
      "org.apache.log4j.LogManager",
      "client.ClientGameLoop",
      "org.hsqldb.ServerConnection",
      "messages.session.SessionChatMsg",
      "common.GameRound"
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
      "messages.round.CountdownMsg",
      "messages.global.MapListMsg",
      "messages.round.RoundTimeOneSecondLeftMsg",
      "client.view.GameCanvas",
      "common.GameSession",
      "client.ClientGameSession",
      "messages.global.InfoRequestMsg",
      "messages.global.GlobalChatMsg",
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
      "messages.global.StopServerMsg",
      "messages.round.NewTileMsg",
      "messages.session.PlayerLeftMsg",
      "messages.round.BombExplodedMsg",
      "common.Map",
      "common.MapReader",
      "common.XmlFunctions",
      "messages.round.PowerUpHitMsg",
      "messages.global.ScoreMsg",
      "messages.round.BombMoveMsg",
      "messages.global.JoinAckMsg",
      "messages.global.LoginMsg",
      "messages.global.JoinSessionMsg",
      "messages.round.NewBombMsg",
      "messages.round.PlayerStateMsg",
      "messages.round.RoundTimeOverMsg",
      "messages.session.SessionChatMsg",
      "messages.round.MagicKillMsg",
      "messages.global.SessionDetailsMsg",
      "common.GameRound",
      "client.ClientGameRound",
      "common.GameModel",
      "client.view.GameView",
      "client.view.View",
      "client.view.OverlayView",
      "common.GameLoop",
      "client.ClientGameLoop",
      "client.view.GfxFactory",
      "client.view.ExplosionGfxFactory",
      "client.network.ForwardingObserver",
      "client.view.OffGamePainter",
      "server.ServerGameSession",
      "messages.round.TileHitPlayerMsg",
      "messages.session.SessionScoreMsg",
      "messages.round.ClientQuitRunningSessionMsg",
      "messages.global.GlobalStateMsg",
      "messages.session.SessionStateMsg",
      "messages.round.RoundStateMsg",
      "messages.round.RoundScoreMsg",
      "client.gui.SplashThread",
      "sound.SoundPlayer",
      "sound.Sound",
      "messages.session.SessionParticipationMsg",
      "messages.session.InitializeRoundMsg",
      "messages.global.SessionListMsg",
      "client.gui.components.MyButton",
      "common.ResourceService"
    );
  }
}
