/*
 * This file was automatically generated by EvoSuite
 * Fri Nov 15 06:46:02 GMT 2019
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
import java.awt.Point;
import java.awt.event.MouseEvent;
import java.net.Proxy;
import java.net.Socket;
import java.sql.BatchUpdateException;
import java.sql.ClientInfoStatus;
import java.sql.DataTruncation;
import java.sql.SQLClientInfoException;
import java.sql.SQLIntegrityConstraintViolationException;
import java.sql.SQLInvalidAuthorizationSpecException;
import java.sql.SQLSyntaxErrorException;
import java.sql.SQLTimeoutException;
import java.util.ArrayList;
import java.util.HashMap;
import javax.swing.JSlider;
import messages.global.JoinAckMsg;
import messages.global.LoginMsg;
import messages.global.ParticipantInfo;
import messages.round.NewBombMsg;
import messages.session.SessionParticipationMsg;
import org.apache.log4j.LogManager;
import org.apache.log4j.spi.RepositorySelector;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.System;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.evosuite.runtime.mock.java.lang.MockThread;
import org.evosuite.runtime.mock.java.net.MockSocket;
import org.evosuite.runtime.testdata.EvoSuiteFile;
import org.evosuite.runtime.testdata.EvoSuiteLocalAddress;
import org.evosuite.runtime.testdata.EvoSuiteRemoteAddress;
import org.evosuite.runtime.testdata.FileSystemHandling;
import org.evosuite.runtime.testdata.NetworkHandling;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class ClientMsgReceiver_ESTest extends ClientMsgReceiver_ESTest_scaffolding {

  /**
  //Test case number: 0
  /*Coverage entropy=1.1476926351053998
  */
  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Proxy proxy0 = Proxy.NO_PROXY;
      MockSocket mockSocket0 = new MockSocket(proxy0);
      BomberClient bomberClient0 = BomberClient.getInstance();
      ClientMsgReceiver clientMsgReceiver0 = new ClientMsgReceiver(mockSocket0, bomberClient0);
      clientMsgReceiver0.getStackTrace();
      String string0 = "";
      String string1 = "b BgYdi%";
      EvoSuiteLocalAddress evoSuiteLocalAddress0 = null;
      boolean boolean0 = NetworkHandling.sendMessageOnTcp(evoSuiteLocalAddress0, string1);
      ClientMsgReceiver clientMsgReceiver1 = new ClientMsgReceiver(mockSocket0, bomberClient0);
      ClientMsgReceiver clientMsgReceiver2 = new ClientMsgReceiver(mockSocket0, bomberClient0);
      Throwable throwable0 = null;
      BatchUpdateException batchUpdateException0 = new BatchUpdateException(throwable0);
      batchUpdateException0.getStackTrace();
      SQLSyntaxErrorException sQLSyntaxErrorException0 = new SQLSyntaxErrorException(string0, batchUpdateException0);
      SQLIntegrityConstraintViolationException sQLIntegrityConstraintViolationException0 = new SQLIntegrityConstraintViolationException(string0);
      String string2 = "\\xrj@~?v*e";
      SQLSyntaxErrorException sQLSyntaxErrorException1 = new SQLSyntaxErrorException(string2, batchUpdateException0);
      SQLTimeoutException sQLTimeoutException0 = new SQLTimeoutException(sQLIntegrityConstraintViolationException0);
      int int0 = (-160);
      JoinAckMsg joinAckMsg0 = new JoinAckMsg(boolean0, int0);
      ArrayList<ParticipantInfo> arrayList0 = new ArrayList<ParticipantInfo>();
      joinAckMsg0.setParticipants(arrayList0);
      boolean boolean1 = true;
      int int1 = 1;
      String string3 = "";
      SessionParticipationMsg sessionParticipationMsg0 = new SessionParticipationMsg(boolean1, int1, string3);
      clientMsgReceiver1.processMsg(sessionParticipationMsg0);
      // Undeclared exception!
      try { 
        clientMsgReceiver1.processMsg(joinAckMsg0);
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
  /*Coverage entropy=1.0365141682948127
  */
  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Proxy proxy0 = Proxy.NO_PROXY;
      MockSocket mockSocket0 = new MockSocket();
      StackTraceElement[] stackTraceElementArray0 = new StackTraceElement[4];
      ClientMsgReceiver clientMsgReceiver0 = new ClientMsgReceiver(mockSocket0, (BomberClient) null);
      RepositorySelector repositorySelector0 = mock(RepositorySelector.class, new ViolatedAssumptionAnswer());
      RepositorySelector repositorySelector1 = mock(RepositorySelector.class, new ViolatedAssumptionAnswer());
      LogManager.setRepositorySelector(repositorySelector1, proxy0);
      LogManager.setRepositorySelector(repositorySelector0, proxy0);
      StartFrame startFrame0 = StartFrame.startFrame;
      FileSystemHandling.shouldAllThrowIOExceptions();
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
  //Test case number: 2
  /*Coverage entropy=0.0
  */
  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
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
  //Test case number: 3
  /*Coverage entropy=1.0931471805599453
  */
  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      Proxy proxy0 = Proxy.NO_PROXY;
      MockSocket mockSocket0 = new MockSocket(proxy0);
      FileSystemHandling.createFolder((EvoSuiteFile) null);
      byte[] byteArray0 = new byte[0];
      NetworkHandling.sendDataOnTcp((EvoSuiteLocalAddress) null, byteArray0);
      BomberClient.getInstance();
      EvoSuiteLocalAddress evoSuiteLocalAddress0 = null;
      EvoSuiteRemoteAddress evoSuiteRemoteAddress0 = new EvoSuiteRemoteAddress("", 1);
      NetworkHandling.openRemoteTcpServer(evoSuiteRemoteAddress0);
      EvoSuiteLocalAddress evoSuiteLocalAddress1 = null;
      byte[] byteArray1 = new byte[4];
      byte byte0 = (byte)0;
      byteArray1[0] = byte0;
      byte byte1 = (byte)1;
      byteArray1[1] = byte1;
      byte byte2 = (byte) (-80);
      byteArray1[2] = byte2;
      byte byte3 = (byte) (-69);
      byteArray1[3] = byte3;
      boolean boolean0 = NetworkHandling.sendDataOnTcp(evoSuiteLocalAddress1, byteArray1);
      NetworkHandling.sendDataOnTcp(evoSuiteLocalAddress0, byteArray0);
      mockSocket0.setReuseAddress(boolean0);
      String string0 = "";
      SQLInvalidAuthorizationSpecException sQLInvalidAuthorizationSpecException0 = new SQLInvalidAuthorizationSpecException(string0);
      BomberClient bomberClient0 = BomberClient.getInstance();
      ClientMsgReceiver clientMsgReceiver0 = new ClientMsgReceiver(mockSocket0, bomberClient0);
      MockThread.interrupted();
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
  //Test case number: 4
  /*Coverage entropy=1.0365141682948127
  */
  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      Proxy proxy0 = Proxy.NO_PROXY;
      MockSocket mockSocket0 = new MockSocket(proxy0);
      BomberClient bomberClient0 = BomberClient.getInstance();
      String string0 = "";
      int int0 = (-2514);
      LoginMsg loginMsg0 = new LoginMsg(string0, int0);
      boolean boolean0 = true;
      int int1 = 1;
      JoinAckMsg joinAckMsg0 = new JoinAckMsg(boolean0, int1);
      HashMap<String, ClientInfoStatus> hashMap0 = new HashMap<String, ClientInfoStatus>();
      String string1 = "X^2Y]8v/L'(gL?";
      HashMap<String, ClientInfoStatus> hashMap1 = new HashMap<String, ClientInfoStatus>();
      ClientMsgReceiver clientMsgReceiver0 = new ClientMsgReceiver(mockSocket0, bomberClient0);
      clientMsgReceiver0.processMsg(loginMsg0);
      String string2 = "!5!";
      SQLClientInfoException sQLClientInfoException0 = new SQLClientInfoException(string2, string1, hashMap0);
      String string3 = "ATg.uD]42R";
      String string4 = ";@lY!efxTw[9";
      int int2 = (-1);
      SQLIntegrityConstraintViolationException sQLIntegrityConstraintViolationException0 = new SQLIntegrityConstraintViolationException(string4, string3, int2);
      sQLIntegrityConstraintViolationException0.getStackTrace();
      SQLInvalidAuthorizationSpecException sQLInvalidAuthorizationSpecException0 = new SQLInvalidAuthorizationSpecException(string4);
      assertEquals("java.sql.SQLInvalidAuthorizationSpecException: ;@lY!efxTw[9", sQLInvalidAuthorizationSpecException0.toString());
  }

  /**
  //Test case number: 5
  /*Coverage entropy=1.0931471805599453
  */
  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      System.setCurrentTimeMillis((-290L));
      System.setCurrentTimeMillis((-290L));
      System.setCurrentTimeMillis(1L);
      MockSocket mockSocket0 = new MockSocket();
      ClientMsgReceiver clientMsgReceiver0 = new ClientMsgReceiver(mockSocket0, (BomberClient) null);
      JSlider jSlider0 = new JSlider(1);
      MouseEvent mouseEvent0 = new MouseEvent(jSlider0, 1, 1, 1, 1, 1, (-2742), true);
      Point point0 = mouseEvent0.getPoint();
      jSlider0.getPopupLocation(mouseEvent0);
      NewBombMsg newBombMsg0 = new NewBombMsg(point0, 0, 1042, 2499, true);
      // Undeclared exception!
      try { 
        clientMsgReceiver0.processMsg(newBombMsg0);
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
  /*Coverage entropy=1.4682921994113465
  */
  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      Proxy proxy0 = Proxy.NO_PROXY;
      MockSocket mockSocket0 = new MockSocket(proxy0);
      FileSystemHandling.setPermissions((EvoSuiteFile) null, false, false, false);
      SQLInvalidAuthorizationSpecException sQLInvalidAuthorizationSpecException0 = new SQLInvalidAuthorizationSpecException("N'k#Jbd:PH=Ms", "SG2w4w");
      StackTraceElement stackTraceElement0 = new StackTraceElement("SG2w4w", "SG2w4w", "", (-250));
      StackTraceElement stackTraceElement1 = new StackTraceElement("3E{tW=YI*1Xy", "SG2w4w", "", 2694);
      StackTraceElement[] stackTraceElementArray0 = new StackTraceElement[8];
      stackTraceElementArray0[0] = stackTraceElement0;
      stackTraceElementArray0[1] = stackTraceElement1;
      StackTraceElement stackTraceElement2 = new StackTraceElement("", "", "@kjH7RW$`nX", 2694);
      stackTraceElementArray0[2] = stackTraceElement2;
      stackTraceElementArray0[3] = stackTraceElement1;
      stackTraceElementArray0[4] = stackTraceElement0;
      stackTraceElementArray0[5] = stackTraceElement0;
      StackTraceElement stackTraceElement3 = new StackTraceElement("", "oQa$$76PBvd:~7`X", "6M[", 0);
      stackTraceElementArray0[6] = stackTraceElement3;
      StackTraceElement stackTraceElement4 = new StackTraceElement("", "AUTOCOMMIT ", "SG2w4w", 0);
      stackTraceElementArray0[7] = stackTraceElement4;
      sQLInvalidAuthorizationSpecException0.setStackTrace(stackTraceElementArray0);
      StackTraceElement stackTraceElement5 = new StackTraceElement("log4j: ", "Couldn't close input stream", "", 2694);
      FileSystemHandling.appendDataToFile((EvoSuiteFile) null, (byte[]) null);
      StackTraceElement[] stackTraceElementArray1 = new StackTraceElement[3];
      stackTraceElementArray1[0] = stackTraceElement0;
      stackTraceElementArray1[1] = stackTraceElement5;
      stackTraceElementArray1[2] = stackTraceElement1;
      sQLInvalidAuthorizationSpecException0.setStackTrace(stackTraceElementArray1);
      DataTruncation dataTruncation0 = new DataTruncation(700, false, true, 0, 0);
      dataTruncation0.getNextWarning();
      SQLIntegrityConstraintViolationException sQLIntegrityConstraintViolationException0 = new SQLIntegrityConstraintViolationException("", "");
      ClientMsgReceiver clientMsgReceiver0 = new ClientMsgReceiver(mockSocket0, (BomberClient) null);
      // Undeclared exception!
      try { 
        clientMsgReceiver0.handleConnectionLoss(sQLInvalidAuthorizationSpecException0);
        fail("Expecting exception: HeadlessException");
      
      } catch(HeadlessException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.awt.GraphicsEnvironment", e);
      }
  }
}
