/**
 * Scaffolding file used to store all the setups needed to run 
 * tests automatically generated by EvoSuite
 * Fri Nov 06 23:26:42 GMT 2020
 */

package org.firebirdsql.jdbc;

import org.evosuite.runtime.annotation.EvoSuiteClassExclude;
import org.junit.BeforeClass;
import org.junit.Before;
import org.junit.After;
import org.junit.AfterClass;
import org.evosuite.runtime.sandbox.Sandbox;
import org.evosuite.runtime.sandbox.Sandbox.SandboxMode;

@EvoSuiteClassExclude
public class FBCachedFetcher_ESTest_scaffolding {

  @org.junit.Rule 
  public org.evosuite.runtime.vnet.NonFunctionalRequirementRule nfr = new org.evosuite.runtime.vnet.NonFunctionalRequirementRule();

  private static final java.util.Properties defaultProperties = (java.util.Properties) java.lang.System.getProperties().clone(); 

  private org.evosuite.runtime.thread.ThreadStopper threadStopper =  new org.evosuite.runtime.thread.ThreadStopper (org.evosuite.runtime.thread.KillSwitchHandler.getInstance(), 3000);


  @BeforeClass 
  public static void initEvoSuiteFramework() { 
    org.evosuite.runtime.RuntimeSettings.className = "org.firebirdsql.jdbc.FBCachedFetcher"; 
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
    java.lang.System.setProperty("user.dir", "/home/ubuntu/replication/scripts/projects/110_firebird"); 
    java.lang.System.setProperty("user.home", "/home/ubuntu"); 
    java.lang.System.setProperty("user.language", "en"); 
    java.lang.System.setProperty("user.name", "ubuntu"); 
    java.lang.System.setProperty("user.timezone", "Etc/UTC"); 
  }

  private static void initializeClasses() {
    org.evosuite.runtime.classhandling.ClassStateSupport.initializeClasses(FBCachedFetcher_ESTest_scaffolding.class.getClassLoader() ,
      "org.firebirdsql.gds.impl.AbstractIscDbHandle",
      "org.firebirdsql.jdbc.parser.JaybirdStatementModel",
      "org.firebirdsql.jdbc.parser.StatementParser$ParseException",
      "org.firebirdsql.jdbc.FBCachedFetcher$1",
      "org.firebirdsql.gds.impl.jni.EventHandleImp",
      "org.firebirdsql.jdbc.InternalTransactionCoordinator$MetaDataTransactionCoordinator",
      "org.firebirdsql.logging.LoggerFactory$1",
      "org.firebirdsql.jdbc.FBObjectListener$BlobListener",
      "org.firebirdsql.jdbc.field.FBFloatField",
      "org.firebirdsql.jdbc.field.FBCachedLongVarCharField",
      "org.firebirdsql.jdbc.FBBlob",
      "org.firebirdsql.jdbc.FBSQLWarning",
      "org.firebirdsql.jdbc.FBCachedBlob",
      "org.firebirdsql.jdbc.field.FBShortField",
      "org.firebirdsql.gds.impl.jni.isc_stmt_handle_impl",
      "org.firebirdsql.gds.impl.wire.XdrOutputStream",
      "org.firebirdsql.jdbc.FBCallableStatement",
      "org.firebirdsql.jdbc.FBEscapedCallParser",
      "org.firebirdsql.gds.impl.jni.DatabaseParameterBufferImp",
      "org.firebirdsql.gds.impl.wire.isc_svc_handle_impl",
      "org.firebirdsql.jdbc.field.FBFlushableField$CachedObject",
      "org.firebirdsql.jdbc.DummyCallableStatementMetaData",
      "org.firebirdsql.gds.impl.wire.EventHandleImp",
      "org.firebirdsql.jdbc.FBResultSetNotUpdatableException",
      "org.firebirdsql.gds.impl.wire.Xdrable",
      "org.firebirdsql.gds.IscBlobHandle",
      "org.firebirdsql.gds.EventHandler",
      "org.firebirdsql.gds.impl.wire.isc_stmt_handle_impl",
      "org.firebirdsql.jca.FBConnectionRequestInfo",
      "org.firebirdsql.jdbc.FirebirdSavepoint",
      "org.firebirdsql.jdbc.FBDriverNotCapableException",
      "org.firebirdsql.gds.impl.GDSType",
      "org.firebirdsql.jdbc.parser.StatementParser",
      "org.firebirdsql.jdbc.AbstractGeneratedKeysQuery",
      "org.firebirdsql.jdbc.field.FBFlushableField",
      "org.antlr.runtime.CharStream",
      "org.firebirdsql.jdbc.FBPreparedStatement",
      "org.firebirdsql.jdbc.field.FBTimeField",
      "org.firebirdsql.jdbc.FirebirdBlob",
      "org.firebirdsql.jdbc.field.FBLongField",
      "org.firebirdsql.jdbc.FirebirdStatement",
      "org.firebirdsql.gds.impl.jni.EmbeddedGDSFactoryPlugin",
      "org.firebirdsql.jdbc.field.FBTimestampField",
      "org.firebirdsql.jdbc.FBMissingParameterException",
      "org.firebirdsql.gds.BlobParameterBuffer",
      "org.firebirdsql.gds.impl.AbstractIscTrHandle",
      "org.firebirdsql.jdbc.field.FBBigDecimalField",
      "org.firebirdsql.jdbc.FBResultSet",
      "org.firebirdsql.gds.impl.wire.ParameterBufferBase",
      "org.firebirdsql.gds.impl.jni.isc_blob_handle_impl",
      "org.firebirdsql.jdbc.AbstractConnection",
      "org.firebirdsql.gds.impl.AbstractGDS",
      "org.firebirdsql.gds.impl.wire.AbstractJavaGDSImpl",
      "org.firebirdsql.jca.FBManagedConnection$1",
      "org.firebirdsql.jdbc.FirebirdParameterMetaData",
      "org.firebirdsql.jca.FBManagedConnection$4",
      "org.firebirdsql.jdbc.FBSQLException",
      "org.firebirdsql.jca.FBManagedConnection$5",
      "org.antlr.runtime.Token",
      "org.firebirdsql.jca.FBManagedConnection$2",
      "org.firebirdsql.jdbc.InternalTransactionCoordinator$LocalTransactionCoordinator",
      "org.firebirdsql.jca.FBManagedConnection$3",
      "org.firebirdsql.gds.impl.GDSHelper",
      "org.firebirdsql.gds.impl.wire.XdrInputStream",
      "org.firebirdsql.jdbc.FirebirdResultSet",
      "org.firebirdsql.gds.IscSvcHandle",
      "org.firebirdsql.jdbc.InternalTransactionCoordinator$AutoCommitCoordinator",
      "org.firebirdsql.jdbc.AbstractStatement$RSListener",
      "org.firebirdsql.gds.EventHandle",
      "org.firebirdsql.gds.IscTrHandle",
      "org.firebirdsql.gds.impl.DatabaseParameterBufferExtension",
      "org.firebirdsql.jdbc.InternalTransactionCoordinator",
      "org.firebirdsql.gds.impl.wire.WireGDSFactoryPlugin$GDSHolder",
      "org.firebirdsql.jdbc.field.FBField",
      "org.firebirdsql.jdbc.FBStatement",
      "org.firebirdsql.gds.impl.wire.ParameterBufferBase$NumericArgument",
      "org.firebirdsql.gds.ServiceParameterBuffer",
      "org.firebirdsql.gds.impl.jni.JniGDSImpl$1",
      "org.firebirdsql.gds.impl.GDSFactoryPlugin",
      "org.firebirdsql.gds.impl.jni.isc_db_handle_impl",
      "org.firebirdsql.gds.GDSException",
      "org.firebirdsql.gds.impl.jni.NativeGDSFactoryPlugin",
      "org.firebirdsql.jdbc.InternalTransactionCoordinator$AbstractTransactionCoordinator",
      "org.firebirdsql.jdbc.FBObjectListener$StatementListener",
      "org.firebirdsql.gds.XSQLDA",
      "org.firebirdsql.gds.impl.jni.isc_tr_handle_impl",
      "org.firebirdsql.jdbc.FirebirdResultSetMetaData",
      "org.firebirdsql.jdbc.field.FBStringField",
      "org.firebirdsql.jca.FBManagedConnection$CELNotifier",
      "org.firebirdsql.gds.ISCConstants",
      "org.firebirdsql.gds.impl.wire.ParameterBufferBase$StringArgument",
      "org.firebirdsql.jdbc.FBObjectListener",
      "org.firebirdsql.jdbc.FirebirdPreparedStatement",
      "org.firebirdsql.jdbc.FBCachedFetcher",
      "org.firebirdsql.jdbc.field.FBBlobField",
      "org.firebirdsql.gds.impl.oo.OOGDSFactoryPlugin",
      "org.firebirdsql.jdbc.FBObjectListener$FetcherListener",
      "org.firebirdsql.jdbc.FBResultSetMetaData$ExtendedFieldInfo",
      "org.firebirdsql.jdbc.field.TranslatingReader",
      "org.firebirdsql.jdbc.FBConnectionProperties",
      "org.firebirdsql.jdbc.field.FBDoubleField",
      "org.firebirdsql.gds.impl.wire.isc_db_handle_impl",
      "org.firebirdsql.gds.impl.wire.EventCoordinator",
      "org.firebirdsql.gds.impl.GDSFactory",
      "org.firebirdsql.gds.impl.wire.ParameterBufferBase$SingleItem",
      "org.firebirdsql.jdbc.field.FieldDataProvider",
      "org.firebirdsql.jdbc.FBResultSetMetaData$1",
      "org.firebirdsql.gds.impl.jni.ParameterBufferBase",
      "org.firebirdsql.jca.FBTpb",
      "org.firebirdsql.jdbc.FBResultSetMetaData$ColumnStrategy$2",
      "org.firebirdsql.jca.FBIncorrectXidException",
      "org.firebirdsql.jdbc.FBResultSetMetaData$ColumnStrategy$1",
      "org.firebirdsql.gds.ServiceRequestBuffer",
      "org.firebirdsql.jdbc.FirebirdCallableStatement",
      "org.firebirdsql.gds.impl.wire.WireGDSFactoryPlugin",
      "org.firebirdsql.jdbc.FBConnection",
      "org.firebirdsql.gds.GDSWarning",
      "org.firebirdsql.gds.impl.wire.isc_tr_handle_impl",
      "org.firebirdsql.jdbc.FBSQLParseException",
      "org.firebirdsql.jdbc.field.FBDateField",
      "org.firebirdsql.jdbc.FBEscapedParser",
      "org.firebirdsql.jdbc.FBBlobOutputStream",
      "org.firebirdsql.jdbc.AbstractPreparedStatement",
      "org.firebirdsql.gds.impl.GDSHelper$GDSHelperErrorListener",
      "org.firebirdsql.jdbc.FBObjectListener$ResultSetListener",
      "org.firebirdsql.jca.FBStandAloneConnectionManager",
      "org.firebirdsql.jdbc.AbstractResultSet$1",
      "org.firebirdsql.gds.IscDbHandle",
      "org.firebirdsql.jdbc.FBDriverPropertyManager",
      "org.firebirdsql.jdbc.field.FBWorkaroundStringField",
      "org.firebirdsql.jca.FBManagedConnectionFactory",
      "org.firebirdsql.jdbc.FBProcedureParam",
      "org.firebirdsql.jca.FirebirdLocalTransaction",
      "org.firebirdsql.jdbc.AbstractResultSet",
      "org.firebirdsql.jdbc.Synchronizable",
      "org.firebirdsql.jdbc.FBResultSetMetaData",
      "org.firebirdsql.jdbc.parser.StatementParserImpl",
      "org.firebirdsql.jdbc.FBProcedureCall$NullParam",
      "org.firebirdsql.gds.impl.wire.WireXdrInputStream",
      "org.firebirdsql.jdbc.FirebirdBlob$BlobOutputStream",
      "org.firebirdsql.logging.LoggerFactory",
      "org.firebirdsql.gds.impl.GDSFactory$ReversedStringComparator",
      "org.antlr.runtime.CommonToken",
      "org.firebirdsql.gds.impl.AbstractIscStmtHandle",
      "org.firebirdsql.jca.FBResourceException",
      "org.firebirdsql.gds.impl.wire.ParameterBufferBase$Argument",
      "org.firebirdsql.jdbc.field.TypeConversionException",
      "org.firebirdsql.gds.impl.jni.BaseGDSImpl",
      "org.firebirdsql.jdbc.FirebirdConnectionProperties",
      "org.firebirdsql.jdbc.FBConnectionHelper",
      "org.firebirdsql.logging.Logger",
      "org.antlr.runtime.RecognitionException",
      "org.firebirdsql.gds.impl.wire.DatabaseParameterBufferImp",
      "org.firebirdsql.gds.XSQLVAR",
      "org.firebirdsql.gds.impl.wire.ParameterBufferBase$ByteArrayArgument",
      "org.firebirdsql.jdbc.AbstractStatement$1",
      "org.firebirdsql.gds.GDS",
      "org.antlr.runtime.TokenSource",
      "org.firebirdsql.jdbc.field.FBIntegerField",
      "org.firebirdsql.jdbc.FirebirdBlob$BlobInputStream",
      "org.firebirdsql.jdbc.FBDriverPropertyManager$PropertyInfo",
      "org.firebirdsql.jdbc.FirebirdConnection",
      "org.firebirdsql.gds.impl.GDSFactory$1",
      "org.firebirdsql.gds.impl.DbAttachInfo",
      "org.firebirdsql.jdbc.AbstractCallableStatement",
      "org.firebirdsql.gds.impl.BaseGDSFactoryPlugin",
      "org.firebirdsql.gds.XSQLVAR$datetime",
      "org.firebirdsql.jdbc.field.FBLongVarCharField",
      "org.firebirdsql.jdbc.FBResultSetMetaData$ColumnStrategy",
      "org.firebirdsql.gds.DatabaseParameterBuffer",
      "org.antlr.runtime.TokenStream",
      "org.firebirdsql.gds.impl.jni.JniGDSImpl",
      "org.firebirdsql.gds.impl.jni.LocalGDSFactoryPlugin",
      "org.firebirdsql.jca.FBManagedConnection",
      "org.firebirdsql.jdbc.FirebirdRowUpdater",
      "org.antlr.runtime.IntStream",
      "org.firebirdsql.jdbc.FBTpbMapper",
      "org.firebirdsql.gds.IscStmtHandle",
      "org.firebirdsql.jdbc.AbstractCallableStatement$WrapperWithInt",
      "org.firebirdsql.jdbc.DefaultCallableStatementMetaData",
      "org.firebirdsql.jdbc.FBSavepoint",
      "org.firebirdsql.jdbc.FBDriverConsistencyCheckException",
      "org.firebirdsql.jdbc.FBProcedureCall",
      "org.firebirdsql.logging.Log4jLogger",
      "org.firebirdsql.jdbc.StoredProcedureMetaData",
      "org.firebirdsql.jdbc.field.FBNullField",
      "org.firebirdsql.jdbc.AbstractConnection$GeneratedKeysQuery",
      "org.firebirdsql.gds.TransactionParameterBuffer",
      "org.firebirdsql.jdbc.FBFetcher",
      "org.firebirdsql.jdbc.field.FBCachedBlobField",
      "org.firebirdsql.jdbc.FBBlobInputStream",
      "org.firebirdsql.jdbc.InternalTransactionCoordinator$ManagedTransactionCoordinator",
      "org.firebirdsql.gds.impl.wire.JavaGDSImpl",
      "org.firebirdsql.jdbc.AbstractStatement",
      "org.firebirdsql.jca.FBXAException",
      "org.firebirdsql.jdbc.AbstractCallableStatement$WrapperWithCalendar",
      "org.firebirdsql.jdbc.FBClob",
      "org.firebirdsql.gds.impl.wire.isc_blob_handle_impl"
    );
  } 

  private static void resetClasses() {
    org.evosuite.runtime.classhandling.ClassResetter.getInstance().setClassLoader(FBCachedFetcher_ESTest_scaffolding.class.getClassLoader()); 

    org.evosuite.runtime.classhandling.ClassStateSupport.resetClasses(
      "org.firebirdsql.jdbc.FBCachedFetcher",
      "org.firebirdsql.jdbc.FBCachedFetcher$1",
      "org.firebirdsql.logging.LoggerFactory",
      "org.firebirdsql.logging.LoggerFactory$1",
      "org.firebirdsql.gds.impl.GDSFactory$ReversedStringComparator",
      "org.firebirdsql.gds.impl.BaseGDSFactoryPlugin",
      "org.firebirdsql.gds.impl.wire.WireGDSFactoryPlugin",
      "org.firebirdsql.gds.impl.jni.NativeGDSFactoryPlugin",
      "org.firebirdsql.gds.impl.jni.LocalGDSFactoryPlugin",
      "org.firebirdsql.gds.impl.jni.EmbeddedGDSFactoryPlugin",
      "org.firebirdsql.gds.impl.oo.OOGDSFactoryPlugin",
      "org.firebirdsql.gds.impl.GDSFactory",
      "org.firebirdsql.gds.impl.GDSType",
      "org.firebirdsql.gds.impl.AbstractGDS",
      "org.firebirdsql.gds.impl.jni.BaseGDSImpl",
      "org.firebirdsql.gds.impl.jni.JniGDSImpl$1",
      "org.firebirdsql.gds.impl.jni.JniGDSImpl",
      "org.firebirdsql.jca.FBManagedConnection$1",
      "org.firebirdsql.jca.FBManagedConnection$2",
      "org.firebirdsql.jca.FBManagedConnection$3",
      "org.firebirdsql.jca.FBManagedConnection$4",
      "org.firebirdsql.jca.FBManagedConnection$5",
      "org.firebirdsql.jca.FBManagedConnection",
      "org.firebirdsql.jdbc.AbstractConnection",
      "org.firebirdsql.jdbc.FBConnection",
      "org.firebirdsql.jdbc.InternalTransactionCoordinator",
      "org.firebirdsql.jdbc.AbstractResultSet",
      "org.firebirdsql.jdbc.FBResultSet",
      "org.firebirdsql.jca.FBManagedConnectionFactory",
      "org.firebirdsql.jdbc.FBConnectionProperties",
      "org.firebirdsql.jca.FBStandAloneConnectionManager",
      "org.firebirdsql.gds.XSQLVAR",
      "org.firebirdsql.gds.impl.wire.AbstractJavaGDSImpl",
      "org.firebirdsql.gds.impl.wire.JavaGDSImpl",
      "org.firebirdsql.gds.impl.wire.ParameterBufferBase",
      "org.firebirdsql.gds.impl.wire.DatabaseParameterBufferImp",
      "org.firebirdsql.gds.impl.AbstractIscDbHandle",
      "org.firebirdsql.gds.impl.wire.isc_db_handle_impl",
      "org.firebirdsql.gds.impl.GDSHelper",
      "org.firebirdsql.jdbc.DummyCallableStatementMetaData",
      "org.firebirdsql.jdbc.AbstractStatement",
      "org.firebirdsql.jdbc.AbstractPreparedStatement",
      "org.firebirdsql.jdbc.FBPreparedStatement",
      "org.firebirdsql.jdbc.AbstractCallableStatement",
      "org.firebirdsql.jdbc.FBCallableStatement",
      "org.firebirdsql.jdbc.AbstractStatement$RSListener",
      "org.firebirdsql.gds.impl.AbstractIscStmtHandle",
      "org.firebirdsql.gds.impl.jni.isc_stmt_handle_impl",
      "org.firebirdsql.gds.XSQLDA",
      "org.firebirdsql.gds.GDSException",
      "org.firebirdsql.jca.FBConnectionRequestInfo",
      "org.firebirdsql.jdbc.FBSQLException",
      "org.firebirdsql.gds.impl.jni.isc_db_handle_impl",
      "org.firebirdsql.jdbc.AbstractResultSet$1",
      "org.firebirdsql.jdbc.field.FBField",
      "org.firebirdsql.jdbc.field.TypeConversionException",
      "org.firebirdsql.jdbc.FBResultSetMetaData",
      "org.firebirdsql.jdbc.FBResultSetMetaData$ColumnStrategy",
      "org.firebirdsql.gds.impl.jni.ParameterBufferBase",
      "org.firebirdsql.gds.impl.jni.DatabaseParameterBufferImp",
      "org.firebirdsql.gds.impl.DatabaseParameterBufferExtension",
      "org.firebirdsql.gds.impl.wire.isc_stmt_handle_impl",
      "org.firebirdsql.jdbc.InternalTransactionCoordinator$AbstractTransactionCoordinator",
      "org.firebirdsql.jdbc.InternalTransactionCoordinator$MetaDataTransactionCoordinator",
      "org.firebirdsql.jdbc.field.FBStringField",
      "org.firebirdsql.jdbc.field.FBLongVarCharField",
      "org.firebirdsql.gds.impl.AbstractIscTrHandle",
      "org.firebirdsql.gds.impl.wire.isc_tr_handle_impl",
      "org.firebirdsql.jdbc.FBDriverNotCapableException",
      "org.firebirdsql.gds.impl.jni.isc_blob_handle_impl",
      "org.firebirdsql.jdbc.FBConnectionHelper",
      "org.firebirdsql.jdbc.FBDriverPropertyManager$PropertyInfo",
      "org.firebirdsql.jdbc.FBDriverPropertyManager",
      "org.firebirdsql.jdbc.FBStatement",
      "org.firebirdsql.jdbc.FBResultSetNotUpdatableException",
      "org.firebirdsql.jdbc.InternalTransactionCoordinator$LocalTransactionCoordinator",
      "org.firebirdsql.jdbc.InternalTransactionCoordinator$ManagedTransactionCoordinator",
      "org.firebirdsql.jdbc.FBCachedBlob",
      "org.firebirdsql.gds.impl.wire.WireGDSFactoryPlugin$GDSHolder",
      "org.firebirdsql.jdbc.field.FBBlobField",
      "org.firebirdsql.jdbc.field.FBCachedBlobField",
      "org.firebirdsql.gds.impl.jni.isc_tr_handle_impl",
      "org.firebirdsql.jdbc.FBEscapedCallParser",
      "org.firebirdsql.jdbc.FBEscapedParser",
      "org.firebirdsql.jdbc.FBProcedureCall",
      "org.firebirdsql.gds.XSQLVAR$datetime",
      "org.firebirdsql.gds.impl.wire.ParameterBufferBase$Argument",
      "org.firebirdsql.gds.impl.wire.ParameterBufferBase$ByteArrayArgument",
      "org.firebirdsql.jdbc.FBBlob",
      "org.firebirdsql.jdbc.DefaultCallableStatementMetaData"
    );
  }
}
