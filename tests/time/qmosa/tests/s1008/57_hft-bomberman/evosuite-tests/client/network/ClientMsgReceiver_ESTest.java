/*
 * This file was automatically generated by EvoSuite
 * Tue Dec 03 20:08:56 GMT 2019
 */

package client.network;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import client.BomberClient;
import client.network.ClientMsgReceiver;
import java.awt.HeadlessException;
import java.net.Proxy;
import java.net.Socket;
import java.sql.SQLIntegrityConstraintViolationException;
import java.sql.SQLInvalidAuthorizationSpecException;
import java.sql.SQLTransientConnectionException;
import java.util.ArrayList;
import messages.Message;
import messages.global.InfoRequestMsg;
import messages.global.ScoreMsg;
import messages.round.NewBombMsg;
import messages.session.SessionParticipationMsg;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.System;
import org.evosuite.runtime.mock.java.net.MockInetSocketAddress;
import org.evosuite.runtime.mock.java.net.MockSocket;
import org.evosuite.runtime.testdata.EvoSuiteFile;
import org.evosuite.runtime.testdata.EvoSuiteLocalAddress;
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
      FileSystemHandling.appendLineToFile((EvoSuiteFile) null, (String) null);
      System.setCurrentTimeMillis((-1178));
      System.setCurrentTimeMillis((-1178));
      MockSocket mockSocket0 = new MockSocket();
      ClientMsgReceiver clientMsgReceiver0 = new ClientMsgReceiver(mockSocket0, (BomberClient) null);
      FileSystemHandling.shouldThrowIOException((EvoSuiteFile) null);
      InfoRequestMsg infoRequestMsg0 = new InfoRequestMsg(51);
      // Undeclared exception!
      try { 
        clientMsgReceiver0.processMsg(infoRequestMsg0);
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
  /*Coverage entropy=1.1217186091313738
  */
  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      MockSocket mockSocket0 = new MockSocket();
      BomberClient bomberClient0 = BomberClient.getInstance();
      ClientMsgReceiver clientMsgReceiver0 = new ClientMsgReceiver(mockSocket0, bomberClient0);
      BomberClient bomberClient1 = BomberClient.getInstance();
      ClientMsgReceiver clientMsgReceiver1 = new ClientMsgReceiver(mockSocket0, bomberClient1);
      ArrayList<NewBombMsg> arrayList0 = null;
      ScoreMsg scoreMsg0 = new ScoreMsg(arrayList0);
      // Undeclared exception!
      try { 
        clientMsgReceiver0.processMsg(scoreMsg0);
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
  /*Coverage entropy=1.4682921994113465
  */
  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      MockSocket mockSocket0 = new MockSocket();
      BomberClient bomberClient0 = BomberClient.getInstance();
      ClientMsgReceiver clientMsgReceiver0 = new ClientMsgReceiver(mockSocket0, bomberClient0);
      ClassLoader classLoader0 = clientMsgReceiver0.getContextClassLoader();
      clientMsgReceiver0.setContextClassLoader(classLoader0);
      boolean boolean0 = true;
      int int0 = (-597);
      String string0 = "";
      SessionParticipationMsg sessionParticipationMsg0 = new SessionParticipationMsg(boolean0, int0, string0);
      clientMsgReceiver0.processMsg(sessionParticipationMsg0);
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
  //Test case number: 3
  /*Coverage entropy=1.4682921994113465
  */
  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      EvoSuiteFile evoSuiteFile0 = null;
      FileSystemHandling.appendLineToFile((EvoSuiteFile) null, "] cannot be instantiated due to access restrictions");
      Proxy.Type proxy_Type0 = Proxy.Type.SOCKS;
      MockInetSocketAddress mockInetSocketAddress0 = new MockInetSocketAddress(1);
      Proxy proxy0 = new Proxy(proxy_Type0, mockInetSocketAddress0);
      MockSocket mockSocket0 = new MockSocket(proxy0);
      ClientMsgReceiver clientMsgReceiver0 = new ClientMsgReceiver(mockSocket0, (BomberClient) null);
      SQLIntegrityConstraintViolationException sQLIntegrityConstraintViolationException0 = new SQLIntegrityConstraintViolationException("6^ZV;YJ!}E");
      // Undeclared exception!
      try { 
        clientMsgReceiver0.handleConnectionLoss(sQLIntegrityConstraintViolationException0);
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
  /*Coverage entropy=1.0931471805599453
  */
  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      EvoSuiteLocalAddress evoSuiteLocalAddress0 = new EvoSuiteLocalAddress("192.168.1.42", 40000);
      byte[] byteArray0 = new byte[9];
      byteArray0[0] = (byte)41;
      byteArray0[1] = (byte)0;
      byteArray0[2] = (byte)17;
      byteArray0[3] = (byte)9;
      byteArray0[4] = (byte)98;
      byteArray0[5] = (byte)0;
      byteArray0[6] = (byte)0;
      byteArray0[7] = (byte)70;
      byteArray0[8] = (byte)15;
      NetworkHandling.sendDataOnTcp(evoSuiteLocalAddress0, byteArray0);
      MockSocket mockSocket0 = new MockSocket();
      BomberClient bomberClient0 = BomberClient.getInstance();
      ClientMsgReceiver clientMsgReceiver0 = new ClientMsgReceiver(mockSocket0, bomberClient0);
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
  //Test case number: 5
  /*Coverage entropy=1.0365141682948127
  */
  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      MockSocket mockSocket0 = new MockSocket();
      BomberClient bomberClient0 = BomberClient.getInstance();
      ClientMsgReceiver clientMsgReceiver0 = new ClientMsgReceiver(mockSocket0, bomberClient0);
      Message message0 = null;
      clientMsgReceiver0.processMsg(message0);
      String string0 = "1jR~,|kV$[{E\"6)-";
      String string1 = "Couldn't close input stream";
      String string2 = "p|$&O^qxk>6bU>LBb}D";
      SQLTransientConnectionException sQLTransientConnectionException0 = new SQLTransientConnectionException(string2);
      SQLInvalidAuthorizationSpecException sQLInvalidAuthorizationSpecException0 = new SQLInvalidAuthorizationSpecException(string1, sQLTransientConnectionException0);
      String string3 = "";
      int int0 = 1;
      StackTraceElement stackTraceElement0 = new StackTraceElement(string3, string2, string2, int0);
      StackTraceElement[] stackTraceElementArray0 = new StackTraceElement[5];
      stackTraceElementArray0[0] = stackTraceElement0;
      stackTraceElementArray0[1] = stackTraceElement0;
      stackTraceElementArray0[2] = stackTraceElement0;
      String string4 = "#}Jsv pS1_+cmvU";
      int int1 = (-1);
      StackTraceElement stackTraceElement1 = new StackTraceElement(string4, string0, string2, int1);
      stackTraceElementArray0[3] = stackTraceElement1;
      stackTraceElementArray0[4] = stackTraceElement0;
      sQLTransientConnectionException0.setStackTrace(stackTraceElementArray0);
      assertNull(sQLTransientConnectionException0.getSQLState());
  }

  /**
  //Test case number: 6
  /*Coverage entropy=0.0
  */
  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      System.setCurrentTimeMillis(372L);
      BomberClient bomberClient0 = BomberClient.getInstance();
      Socket socket0 = bomberClient0.server;
      ClientMsgReceiver clientMsgReceiver0 = null;
      try {
        clientMsgReceiver0 = new ClientMsgReceiver(socket0, bomberClient0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("common.network.MsgReceiver", e);
      }
  }
}
