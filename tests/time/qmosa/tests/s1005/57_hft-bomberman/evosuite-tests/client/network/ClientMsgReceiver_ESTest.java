/*
 * This file was automatically generated by EvoSuite
 * Tue Dec 03 18:10:00 GMT 2019
 */

package client.network;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import client.BomberClient;
import client.network.ClientMsgReceiver;
import java.awt.HeadlessException;
import java.net.Proxy;
import java.net.Socket;
import java.sql.BatchUpdateException;
import java.sql.ClientInfoStatus;
import java.sql.SQLClientInfoException;
import java.sql.SQLDataException;
import java.sql.SQLIntegrityConstraintViolationException;
import java.sql.SQLInvalidAuthorizationSpecException;
import java.sql.SQLNonTransientConnectionException;
import java.sql.SQLNonTransientException;
import java.sql.SQLSyntaxErrorException;
import java.util.HashMap;
import java.util.Hashtable;
import messages.Message;
import messages.global.GlobalStateMsg;
import messages.round.RoundTimeOverMsg;
import messages.session.PlayerLeftMsg;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.System;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.evosuite.runtime.mock.java.lang.MockException;
import org.evosuite.runtime.mock.java.lang.MockThread;
import org.evosuite.runtime.mock.java.net.MockInetSocketAddress;
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
      MockSocket mockSocket0 = new MockSocket();
      EvoSuiteRemoteAddress evoSuiteRemoteAddress0 = new EvoSuiteRemoteAddress("", 1);
      NetworkHandling.openRemoteTcpServer(evoSuiteRemoteAddress0);
      Proxy proxy0 = Proxy.NO_PROXY;
      MockInetSocketAddress mockInetSocketAddress0 = new MockInetSocketAddress("r", 0);
      ThreadGroup threadGroup0 = mock(ThreadGroup.class, new ViolatedAssumptionAnswer());
      MockThread mockThread0 = new MockThread("");
      MockThread mockThread1 = new MockThread(threadGroup0, mockThread0, " is online", 0);
      ThreadGroup threadGroup1 = mock(ThreadGroup.class, new ViolatedAssumptionAnswer());
      MockThread mockThread2 = new MockThread(threadGroup1, "T`>SpMZ0{4M");
      Thread[] threadArray0 = new Thread[1];
      threadArray0[0] = (Thread) mockThread2;
      MockThread.enumerate(threadArray0);
      ClientMsgReceiver clientMsgReceiver0 = new ClientMsgReceiver(mockSocket0, (BomberClient) null);
      PlayerLeftMsg playerLeftMsg0 = new PlayerLeftMsg();
      // Undeclared exception!
      try { 
        clientMsgReceiver0.processMsg(playerLeftMsg0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("client.network.ClientMsgReceiver", e);
      }
  }

  /**
  //Test case number: 1
  /*Coverage entropy=1.0931471805599453
  */
  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      MockSocket mockSocket0 = new MockSocket();
      EvoSuiteRemoteAddress evoSuiteRemoteAddress0 = new EvoSuiteRemoteAddress("", 1);
      NetworkHandling.openRemoteTcpServer(evoSuiteRemoteAddress0);
      Proxy proxy0 = Proxy.NO_PROXY;
      String string0 = "r";
      MockInetSocketAddress mockInetSocketAddress0 = new MockInetSocketAddress("r", 0);
      Proxy.Type proxy_Type0 = Proxy.Type.SOCKS;
      Proxy proxy1 = new Proxy(proxy_Type0, mockInetSocketAddress0);
      Proxy proxy2 = Proxy.NO_PROXY;
      MockSocket mockSocket1 = new MockSocket(proxy1);
      BomberClient bomberClient0 = BomberClient.getInstance();
      ClientMsgReceiver clientMsgReceiver0 = new ClientMsgReceiver(mockSocket0, bomberClient0);
      Throwable throwable0 = null;
      String string1 = "#P";
      int int0 = 727;
      SQLNonTransientException sQLNonTransientException0 = new SQLNonTransientException(string0, string1, int0, throwable0);
      BatchUpdateException batchUpdateException0 = new BatchUpdateException(sQLNonTransientException0);
      MockException mockException0 = new MockException(batchUpdateException0);
      int int1 = (-165);
      GlobalStateMsg globalStateMsg0 = new GlobalStateMsg(int1);
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
  //Test case number: 2
  /*Coverage entropy=1.0650855968662414
  */
  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      MockSocket mockSocket0 = new MockSocket();
      Proxy proxy0 = Proxy.NO_PROXY;
      System.setCurrentTimeMillis(10L);
      long long0 = 1L;
      System.setCurrentTimeMillis(1L);
      RoundTimeOverMsg roundTimeOverMsg0 = new RoundTimeOverMsg();
      System.setCurrentTimeMillis(8L);
      ThreadGroup threadGroup0 = mock(ThreadGroup.class, new ViolatedAssumptionAnswer());
      MockThread mockThread0 = new MockThread(threadGroup0, "server.no_system_exit");
      Thread[] threadArray0 = new Thread[3];
      threadArray0[0] = (Thread) mockThread0;
      threadArray0[1] = (Thread) mockThread0;
      threadArray0[2] = (Thread) mockThread0;
      MockThread.enumerate(threadArray0);
      Message message0 = null;
      BomberClient bomberClient0 = BomberClient.getInstance();
      ClientMsgReceiver clientMsgReceiver0 = new ClientMsgReceiver(mockSocket0, bomberClient0);
      clientMsgReceiver0.processMsg(message0);
      System.setCurrentTimeMillis(long0);
      clientMsgReceiver0.processMsg(message0);
      assertFalse(clientMsgReceiver0.isInterrupted());
  }

  /**
  //Test case number: 3
  /*Coverage entropy=1.4682921994113465
  */
  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      MockSocket mockSocket0 = new MockSocket();
      EvoSuiteRemoteAddress evoSuiteRemoteAddress0 = new EvoSuiteRemoteAddress("", 1);
      NetworkHandling.openRemoteTcpServer(evoSuiteRemoteAddress0);
      Proxy proxy0 = Proxy.NO_PROXY;
      int int0 = 0;
      MockInetSocketAddress mockInetSocketAddress0 = new MockInetSocketAddress("r", 0);
      Proxy.Type proxy_Type0 = Proxy.Type.SOCKS;
      Proxy proxy1 = new Proxy(proxy_Type0, mockInetSocketAddress0);
      Proxy proxy2 = Proxy.NO_PROXY;
      Proxy proxy3 = Proxy.NO_PROXY;
      MockSocket mockSocket1 = new MockSocket(proxy3);
      BomberClient bomberClient0 = BomberClient.getInstance();
      ClientMsgReceiver clientMsgReceiver0 = new ClientMsgReceiver(mockSocket1, bomberClient0);
      Throwable throwable0 = null;
      String string0 = "#P";
      SQLNonTransientException sQLNonTransientException0 = new SQLNonTransientException(string0, string0, int0, throwable0);
      BatchUpdateException batchUpdateException0 = new BatchUpdateException(throwable0);
      MockException mockException0 = new MockException(throwable0);
      // Undeclared exception!
      try { 
        clientMsgReceiver0.handleConnectionLoss(mockException0);
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
  /*Coverage entropy=0.0
  */
  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      System.setCurrentTimeMillis(12L);
      SQLNonTransientConnectionException sQLNonTransientConnectionException0 = new SQLNonTransientConnectionException((String) null);
      int int0 = 1;
      SQLIntegrityConstraintViolationException sQLIntegrityConstraintViolationException0 = new SQLIntegrityConstraintViolationException("Rn", "handleConnection() exited", 1, sQLNonTransientConnectionException0);
      sQLIntegrityConstraintViolationException0.fillInStackTrace();
      FileSystemHandling.shouldAllThrowIOExceptions();
      sQLNonTransientConnectionException0.initCause(sQLIntegrityConstraintViolationException0);
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
  //Test case number: 5
  /*Coverage entropy=1.0931471805599453
  */
  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      FileSystemHandling.createFolder((EvoSuiteFile) null);
      FileSystemHandling.appendLineToFile((EvoSuiteFile) null, "");
      SQLInvalidAuthorizationSpecException sQLInvalidAuthorizationSpecException0 = new SQLInvalidAuthorizationSpecException("", "/!|Xr%1]u;TAgr~Wq");
      SQLDataException sQLDataException0 = new SQLDataException(sQLInvalidAuthorizationSpecException0);
      FileSystemHandling.appendStringToFile((EvoSuiteFile) null, "/!|Xr%1]u;TAgr~Wq");
      SQLSyntaxErrorException sQLSyntaxErrorException0 = new SQLSyntaxErrorException("wa", "", 740, sQLDataException0);
      SQLIntegrityConstraintViolationException sQLIntegrityConstraintViolationException0 = new SQLIntegrityConstraintViolationException("rx^FkX2^J]twDcx<K]", "Couldn't close input stream", 1, sQLInvalidAuthorizationSpecException0);
      SQLIntegrityConstraintViolationException sQLIntegrityConstraintViolationException1 = new SQLIntegrityConstraintViolationException("", ").Dd,fH9Kv;`");
      sQLIntegrityConstraintViolationException1.fillInStackTrace();
      SQLNonTransientConnectionException sQLNonTransientConnectionException0 = new SQLNonTransientConnectionException();
      sQLNonTransientConnectionException0.initCause(sQLIntegrityConstraintViolationException1);
      MockSocket mockSocket0 = new MockSocket();
      ClientMsgReceiver clientMsgReceiver0 = new ClientMsgReceiver(mockSocket0, (BomberClient) null);
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

  /**
  //Test case number: 6
  /*Coverage entropy=1.0365141682948127
  */
  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      MockSocket mockSocket0 = new MockSocket();
      Proxy proxy0 = Proxy.NO_PROXY;
      Hashtable<String, ClientInfoStatus> hashtable0 = new Hashtable<String, ClientInfoStatus>();
      SQLInvalidAuthorizationSpecException sQLInvalidAuthorizationSpecException0 = new SQLInvalidAuthorizationSpecException("rx^FkX2^J]twDcx<K]", "q_St>o");
      SQLDataException sQLDataException0 = new SQLDataException(sQLInvalidAuthorizationSpecException0);
      SQLSyntaxErrorException sQLSyntaxErrorException0 = new SQLSyntaxErrorException("", ").Dd,fH9Kv;`", 740, sQLDataException0);
      SQLClientInfoException sQLClientInfoException0 = new SQLClientInfoException("=EN0j$Xdf]RpZ.krr", "", hashtable0, sQLSyntaxErrorException0);
      sQLClientInfoException0.getFailedProperties();
      SQLClientInfoException sQLClientInfoException1 = new SQLClientInfoException("Smp", "=EN0j$Xdf]RpZ.krr", (-1251), hashtable0);
      sQLClientInfoException1.getFailedProperties();
      HashMap<String, ClientInfoStatus> hashMap0 = new HashMap<String, ClientInfoStatus>();
      SQLIntegrityConstraintViolationException sQLIntegrityConstraintViolationException0 = new SQLIntegrityConstraintViolationException("-@aA", ").Dd,fH9Kv;`", sQLClientInfoException0);
      SQLClientInfoException sQLClientInfoException2 = new SQLClientInfoException(hashMap0, sQLIntegrityConstraintViolationException0);
      BomberClient bomberClient0 = BomberClient.getInstance();
      ClientMsgReceiver clientMsgReceiver0 = new ClientMsgReceiver(mockSocket0, bomberClient0);
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
}
