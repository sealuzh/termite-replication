/*
 * This file was automatically generated by EvoSuite
 * Mon Nov 18 10:54:58 GMT 2019
 */

package client.network;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import client.BomberClient;
import client.gui.StartFrame;
import client.network.ClientMsgReceiver;
import java.awt.HeadlessException;
import java.net.Proxy;
import java.net.Socket;
import java.sql.DataTruncation;
import java.sql.SQLException;
import java.sql.SQLFeatureNotSupportedException;
import java.sql.SQLIntegrityConstraintViolationException;
import java.sql.SQLInvalidAuthorizationSpecException;
import java.sql.SQLNonTransientConnectionException;
import java.sql.SQLNonTransientException;
import java.sql.SQLSyntaxErrorException;
import java.sql.SQLTransactionRollbackException;
import java.sql.SQLTransientConnectionException;
import java.util.Vector;
import messages.Message;
import messages.global.GlobalChatMsg;
import messages.global.GlobalStateMsg;
import messages.round.BombExplodedMsg;
import org.apache.log4j.helpers.Loader;
import org.apache.log4j.helpers.LogLog;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.System;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.evosuite.runtime.mock.java.lang.MockThread;
import org.evosuite.runtime.mock.java.net.MockInetAddress;
import org.evosuite.runtime.mock.java.net.MockSocket;
import org.evosuite.runtime.testdata.EvoSuiteFile;
import org.evosuite.runtime.testdata.EvoSuiteRemoteAddress;
import org.evosuite.runtime.testdata.FileSystemHandling;
import org.evosuite.runtime.testdata.NetworkHandling;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class ClientMsgReceiver_ESTest extends ClientMsgReceiver_ESTest_scaffolding {

  /**
  //Test case number: 0
  /*Coverage entropy=1.0931471805599453
  */
  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Proxy proxy0 = Proxy.NO_PROXY;
      MockSocket mockSocket0 = new MockSocket(proxy0);
      FileSystemHandling.shouldThrowIOException((EvoSuiteFile) null);
      LogLog.setQuietMode(true);
      ClientMsgReceiver clientMsgReceiver0 = new ClientMsgReceiver(mockSocket0, (BomberClient) null);
      Vector<Integer> vector0 = new Vector<Integer>();
      Vector<Integer> vector1 = new Vector<Integer>();
      String string0 = " scored one ";
      GlobalChatMsg globalChatMsg0 = new GlobalChatMsg(" scored one ");
      GlobalStateMsg globalStateMsg0 = new GlobalStateMsg((-2035));
      // Undeclared exception!
      try { 
        clientMsgReceiver0.processMsg(globalStateMsg0);
        fail("Expecting exception: HeadlessException");
      
      } catch(HeadlessException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.awt.GraphicsEnvironment", e);
      }
  }

  /**
  //Test case number: 1
  /*Coverage entropy=1.0931471805599453
  */
  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Proxy proxy0 = Proxy.NO_PROXY;
      MockSocket mockSocket0 = new MockSocket(proxy0);
      FileSystemHandling.shouldThrowIOException((EvoSuiteFile) null);
      LogLog.setQuietMode(true);
      String string0 = "messages.round.PlayerStateMsg";
      ClientMsgReceiver clientMsgReceiver0 = new ClientMsgReceiver(mockSocket0, (BomberClient) null);
      int int0 = (-2035);
      Vector<Integer> vector0 = new Vector<Integer>();
      BombExplodedMsg bombExplodedMsg0 = new BombExplodedMsg((-2035), vector0, vector0, vector0, true);
      GlobalChatMsg globalChatMsg0 = new GlobalChatMsg("yy847G2r{RB");
      // Undeclared exception!
      try { 
        clientMsgReceiver0.processMsg(globalChatMsg0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("messages.global.GlobalChatMsg", e);
      }
  }

  /**
  //Test case number: 2
  /*Coverage entropy=1.0931471805599453
  */
  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Proxy proxy0 = Proxy.NO_PROXY;
      MockSocket mockSocket0 = new MockSocket(proxy0);
      LogLog.setQuietMode(true);
      SQLSyntaxErrorException sQLSyntaxErrorException0 = new SQLSyntaxErrorException("Lost connection to server!", "Lost connection to server!");
      SQLNonTransientException sQLNonTransientException0 = new SQLNonTransientException("Lost connection to server!", "Preferred configurator class: ", 1784);
      SQLNonTransientException sQLNonTransientException1 = (SQLNonTransientException)sQLNonTransientException0.initCause(sQLSyntaxErrorException0);
      sQLNonTransientException0.setNextException(sQLNonTransientException1);
      SQLIntegrityConstraintViolationException sQLIntegrityConstraintViolationException0 = new SQLIntegrityConstraintViolationException("Lost connection to server!", "Lost connection to server!", 1784);
      SQLIntegrityConstraintViolationException sQLIntegrityConstraintViolationException1 = new SQLIntegrityConstraintViolationException((String) null, "Lost connection to server!", sQLNonTransientException0);
      sQLIntegrityConstraintViolationException0.fillInStackTrace();
      sQLIntegrityConstraintViolationException0.spliterator();
      SQLSyntaxErrorException sQLSyntaxErrorException1 = new SQLSyntaxErrorException();
      sQLSyntaxErrorException1.spliterator();
      SQLTransactionRollbackException sQLTransactionRollbackException0 = new SQLTransactionRollbackException("Preferred configurator class: ", "", 1);
      SQLNonTransientConnectionException sQLNonTransientConnectionException0 = new SQLNonTransientConnectionException(sQLIntegrityConstraintViolationException0);
      SQLInvalidAuthorizationSpecException sQLInvalidAuthorizationSpecException0 = new SQLInvalidAuthorizationSpecException();
      sQLSyntaxErrorException0.initCause(sQLNonTransientConnectionException0);
      System.setCurrentTimeMillis(1L);
      ClientMsgReceiver clientMsgReceiver0 = new ClientMsgReceiver(mockSocket0, (BomberClient) null);
      // Undeclared exception!
      try { 
        clientMsgReceiver0.processMsg((Message) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("client.network.ClientMsgReceiver", e);
      }
  }

  /**
  //Test case number: 3
  /*Coverage entropy=1.4682921994113465
  */
  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      MockThread.reset();
      MockInetAddress.anyLocalAddress();
      ThreadGroup threadGroup0 = mock(ThreadGroup.class, new ViolatedAssumptionAnswer());
      MockThread mockThread0 = new MockThread(threadGroup0, "");
      MockThread mockThread1 = new MockThread(mockThread0);
      FileSystemHandling.shouldAllThrowIOExceptions();
      Thread[] threadArray0 = new Thread[9];
      ThreadGroup threadGroup1 = mock(ThreadGroup.class, new ViolatedAssumptionAnswer());
      MockThread mockThread2 = new MockThread(threadGroup1, mockThread1, "");
      threadArray0[0] = (Thread) mockThread2;
      threadArray0[1] = (Thread) mockThread1;
      threadArray0[2] = (Thread) mockThread1;
      threadArray0[3] = (Thread) mockThread0;
      threadArray0[4] = (Thread) mockThread1;
      MockThread mockThread3 = new MockThread(threadArray0[2]);
      threadArray0[5] = (Thread) mockThread3;
      threadArray0[6] = (Thread) mockThread1;
      threadArray0[7] = (Thread) mockThread1;
      Thread[] threadArray1 = new Thread[9];
      threadArray1[0] = (Thread) mockThread2;
      mockThread1.getStackTrace();
      threadArray1[1] = (Thread) mockThread1;
      threadArray1[2] = (Thread) mockThread3;
      threadArray1[3] = (Thread) mockThread3;
      threadArray1[4] = (Thread) mockThread2;
      threadArray1[5] = (Thread) mockThread0;
      threadArray1[6] = (Thread) mockThread3;
      threadArray1[7] = (Thread) mockThread0;
      threadArray1[8] = (Thread) mockThread1;
      MockThread.enumerate(threadArray1);
      MockSocket mockSocket0 = new MockSocket();
      MockSocket mockSocket1 = new MockSocket();
      mockSocket1.getKeepAlive();
      ClientMsgReceiver clientMsgReceiver0 = new ClientMsgReceiver(mockSocket0, (BomberClient) null);
      SQLInvalidAuthorizationSpecException sQLInvalidAuthorizationSpecException0 = new SQLInvalidAuthorizationSpecException();
      sQLInvalidAuthorizationSpecException0.getLocalizedMessage();
      SQLTransactionRollbackException sQLTransactionRollbackException0 = new SQLTransactionRollbackException(sQLInvalidAuthorizationSpecException0);
      // Undeclared exception!
      try { 
        clientMsgReceiver0.handleConnectionLoss(sQLTransactionRollbackException0);
        fail("Expecting exception: HeadlessException");
      
      } catch(HeadlessException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.awt.GraphicsEnvironment", e);
      }
  }

  /**
  //Test case number: 4
  /*Coverage entropy=1.4682921994113465
  */
  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      Proxy proxy0 = Proxy.NO_PROXY;
      MockSocket mockSocket0 = new MockSocket();
      SQLSyntaxErrorException sQLSyntaxErrorException0 = new SQLSyntaxErrorException("Lost connection to server!", "Lost connection to server!");
      SQLInvalidAuthorizationSpecException sQLInvalidAuthorizationSpecException0 = new SQLInvalidAuthorizationSpecException("Lost connection to server!", "Lost connection to server!");
      sQLInvalidAuthorizationSpecException0.printStackTrace();
      SQLInvalidAuthorizationSpecException sQLInvalidAuthorizationSpecException1 = new SQLInvalidAuthorizationSpecException("Lost connection to server!");
      sQLInvalidAuthorizationSpecException1.spliterator();
      sQLInvalidAuthorizationSpecException1.getSuppressed();
      SQLIntegrityConstraintViolationException sQLIntegrityConstraintViolationException0 = new SQLIntegrityConstraintViolationException("Unknown message type: ", "Unknown message type: ", 289);
      sQLSyntaxErrorException0.setNextException(sQLIntegrityConstraintViolationException0);
      SQLException sQLException0 = new SQLException(sQLInvalidAuthorizationSpecException0);
      SQLIntegrityConstraintViolationException sQLIntegrityConstraintViolationException1 = new SQLIntegrityConstraintViolationException((String) null, "j", sQLException0);
      SQLIntegrityConstraintViolationException sQLIntegrityConstraintViolationException2 = new SQLIntegrityConstraintViolationException("", "Unknown message type: ");
      sQLIntegrityConstraintViolationException0.addSuppressed(sQLInvalidAuthorizationSpecException0);
      sQLIntegrityConstraintViolationException2.spliterator();
      SQLSyntaxErrorException sQLSyntaxErrorException1 = new SQLSyntaxErrorException("j");
      SQLIntegrityConstraintViolationException sQLIntegrityConstraintViolationException3 = new SQLIntegrityConstraintViolationException(sQLIntegrityConstraintViolationException2);
      sQLIntegrityConstraintViolationException3.getLocalizedMessage();
      SQLInvalidAuthorizationSpecException sQLInvalidAuthorizationSpecException2 = new SQLInvalidAuthorizationSpecException((String) null);
      SQLInvalidAuthorizationSpecException sQLInvalidAuthorizationSpecException3 = new SQLInvalidAuthorizationSpecException("Lost connection to server!");
      StartFrame startFrame0 = StartFrame.startFrame;
      StartFrame startFrame1 = StartFrame.startFrame;
      ClientMsgReceiver clientMsgReceiver0 = new ClientMsgReceiver(mockSocket0, (BomberClient) null);
      SQLTransientConnectionException sQLTransientConnectionException0 = new SQLTransientConnectionException();
      // Undeclared exception!
      try { 
        clientMsgReceiver0.handleConnectionLoss(sQLTransientConnectionException0);
        fail("Expecting exception: HeadlessException");
      
      } catch(HeadlessException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.awt.GraphicsEnvironment", e);
      }
  }

  /**
  //Test case number: 5
  /*Coverage entropy=1.0365141682948127
  */
  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      Proxy proxy0 = Proxy.NO_PROXY;
      MockSocket mockSocket0 = new MockSocket();
      MockThread.reset();
      LogLog.setQuietMode(true);
      EvoSuiteRemoteAddress evoSuiteRemoteAddress0 = new EvoSuiteRemoteAddress("Using cli/default properties only", 94);
      NetworkHandling.openRemoteTcpServer(evoSuiteRemoteAddress0);
      SQLSyntaxErrorException sQLSyntaxErrorException0 = new SQLSyntaxErrorException("Tp+^TkP25$K*{1{/", "Tp+^TkP25$K*{1{/");
      ThreadGroup threadGroup0 = mock(ThreadGroup.class, new ViolatedAssumptionAnswer());
      MockThread mockThread0 = new MockThread(threadGroup0, "Tp+^TkP25$K*{1{/");
      MockThread mockThread1 = new MockThread((ThreadGroup) null, mockThread0);
      Thread[] threadArray0 = new Thread[9];
      threadArray0[0] = (Thread) mockThread0;
      threadArray0[1] = (Thread) mockThread1;
      threadArray0[2] = (Thread) mockThread0;
      threadArray0[3] = (Thread) mockThread1;
      MockThread mockThread2 = new MockThread((ThreadGroup) null, threadArray0[2], "Tp+^TkP25$K*{1{/", 0);
      threadArray0[4] = (Thread) mockThread2;
      threadArray0[6] = (Thread) mockThread0;
      threadArray0[7] = (Thread) mockThread1;
      threadArray0[8] = (Thread) mockThread0;
      int int0 = MockThread.NORM_PRIORITY;
      ClientMsgReceiver clientMsgReceiver0 = new ClientMsgReceiver(mockSocket0, (BomberClient) null);
      // Undeclared exception!
      try { 
        clientMsgReceiver0.displayErrorMessage();
        fail("Expecting exception: HeadlessException");
      
      } catch(HeadlessException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.awt.GraphicsEnvironment", e);
      }
  }

  /**
  //Test case number: 6
  /*Coverage entropy=1.4682921994113465
  */
  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      Proxy proxy0 = Proxy.NO_PROXY;
      MockSocket mockSocket0 = new MockSocket(proxy0);
      SQLSyntaxErrorException sQLSyntaxErrorException0 = new SQLSyntaxErrorException("Lost connection to server!");
      SQLIntegrityConstraintViolationException sQLIntegrityConstraintViolationException0 = new SQLIntegrityConstraintViolationException("Preferred configurator class: ", "Lost connection to server!");
      sQLSyntaxErrorException0.spliterator();
      FileSystemHandling.shouldThrowIOException((EvoSuiteFile) null);
      SQLIntegrityConstraintViolationException sQLIntegrityConstraintViolationException1 = new SQLIntegrityConstraintViolationException("Lost connection to server!", "Lost connection to server!", 1784);
      sQLIntegrityConstraintViolationException1.addSuppressed(sQLIntegrityConstraintViolationException0);
      SQLIntegrityConstraintViolationException sQLIntegrityConstraintViolationException2 = new SQLIntegrityConstraintViolationException((String) null, "Lost connection to server!", sQLIntegrityConstraintViolationException0);
      SQLIntegrityConstraintViolationException sQLIntegrityConstraintViolationException3 = new SQLIntegrityConstraintViolationException("Preferred configurator class: ", (String) null);
      sQLIntegrityConstraintViolationException1.spliterator();
      SQLIntegrityConstraintViolationException sQLIntegrityConstraintViolationException4 = new SQLIntegrityConstraintViolationException("Lost connection to server!", (String) null, 200);
      sQLIntegrityConstraintViolationException3.spliterator();
      SQLSyntaxErrorException sQLSyntaxErrorException1 = new SQLSyntaxErrorException();
      sQLSyntaxErrorException0.spliterator();
      SQLTransactionRollbackException sQLTransactionRollbackException0 = new SQLTransactionRollbackException((String) null, "Lost connection to server!", 456);
      SQLIntegrityConstraintViolationException sQLIntegrityConstraintViolationException5 = new SQLIntegrityConstraintViolationException("Lost connection to server!", "\" was loaded by ", 200);
      SQLNonTransientConnectionException sQLNonTransientConnectionException0 = new SQLNonTransientConnectionException(sQLIntegrityConstraintViolationException4);
      System.setCurrentTimeMillis(1L);
      SQLFeatureNotSupportedException sQLFeatureNotSupportedException0 = new SQLFeatureNotSupportedException("Lost connection to server!", (String) null, 1, sQLIntegrityConstraintViolationException4);
      ClientMsgReceiver clientMsgReceiver0 = new ClientMsgReceiver(mockSocket0, (BomberClient) null);
      MockThread.reset();
      // Undeclared exception!
      try { 
        clientMsgReceiver0.handleConnectionLoss(sQLSyntaxErrorException0);
        fail("Expecting exception: HeadlessException");
      
      } catch(HeadlessException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.awt.GraphicsEnvironment", e);
      }
  }

  /**
  //Test case number: 7
  /*Coverage entropy=0.0
  */
  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      FileSystemHandling fileSystemHandling0 = new FileSystemHandling();
      byte[] byteArray0 = new byte[3];
      byteArray0[1] = (byte)1;
      FileSystemHandling.appendDataToFile((EvoSuiteFile) null, byteArray0);
      byteArray0[2] = (byte)0;
      FileSystemHandling.appendDataToFile((EvoSuiteFile) null, byteArray0);
      FileSystemHandling fileSystemHandling1 = new FileSystemHandling();
      ClientMsgReceiver clientMsgReceiver0 = null;
      try {
        clientMsgReceiver0 = new ClientMsgReceiver((Socket) null, (BomberClient) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("common.network.MsgReceiver", e);
      }
  }

  /**
  //Test case number: 8
  /*Coverage entropy=1.0931471805599453
  */
  @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      MockSocket mockSocket0 = new MockSocket();
      mockSocket0.setTcpNoDelay(false);
      DataTruncation dataTruncation0 = new DataTruncation(487, true, false, 487, 487);
      dataTruncation0.printStackTrace();
      StackTraceElement[] stackTraceElementArray0 = new StackTraceElement[3];
      StackTraceElement stackTraceElement0 = new StackTraceElement("", "", "client.network.ClientMsgReceiver", (-1));
      stackTraceElementArray0[0] = stackTraceElement0;
      StackTraceElement stackTraceElement1 = new StackTraceElement("", "", (String) null, 487);
      stackTraceElementArray0[1] = stackTraceElement1;
      StackTraceElement stackTraceElement2 = new StackTraceElement("_#m[?Med@^C4{IiMB|", "McXV,4^:>\"~ih}bX", (String) null, 487);
      stackTraceElementArray0[2] = stackTraceElement2;
      dataTruncation0.setStackTrace(stackTraceElementArray0);
      dataTruncation0.fillInStackTrace();
      dataTruncation0.getNextWarning();
      ClientMsgReceiver clientMsgReceiver0 = new ClientMsgReceiver(mockSocket0, (BomberClient) null);
      Loader.getResource("client.network.ClientMsgReceiver");
      // Undeclared exception!
      try { 
        clientMsgReceiver0.closeConnection();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("client.network.ClientMsgReceiver", e);
      }
  }
}
