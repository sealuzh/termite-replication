/*
 * This file was automatically generated by EvoSuite
 * Wed Dec 04 06:59:11 GMT 2019
 */

package org.quickserver.net.server;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.IOException;
import java.net.SocketAddress;
import java.net.UnknownHostException;
import java.nio.ByteBuffer;
import java.nio.channels.SocketChannel;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.net.MockInetAddress;
import org.evosuite.runtime.mock.java.net.MockSocket;
import org.evosuite.runtime.testdata.EvoSuiteFile;
import org.evosuite.runtime.testdata.EvoSuiteLocalAddress;
import org.evosuite.runtime.testdata.EvoSuiteRemoteAddress;
import org.evosuite.runtime.testdata.FileSystemHandling;
import org.evosuite.runtime.testdata.NetworkHandling;
import org.junit.runner.RunWith;
import org.quickserver.net.qsadmin.CommandHandler;
import org.quickserver.net.qsadmin.Data;
import org.quickserver.net.server.Authenticator;
import org.quickserver.net.server.ClientAuthenticationHandler;
import org.quickserver.net.server.ClientBinaryHandler;
import org.quickserver.net.server.ClientCommandHandler;
import org.quickserver.net.server.ClientData;
import org.quickserver.net.server.ClientEvent;
import org.quickserver.net.server.ClientExtendedEventHandler;
import org.quickserver.net.server.ClientObjectHandler;
import org.quickserver.net.server.ClientWriteHandler;
import org.quickserver.net.server.QuickServer;
import org.quickserver.net.server.TheClient;
import org.quickserver.net.server.impl.BlockingClientHandler;
import org.quickserver.net.server.impl.DefaultClientEventHandler;
import org.quickserver.net.server.impl.NonBlockingClientHandler;
import org.quickserver.util.xmlreader.QuickServerConfig;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class TheClient_ESTest extends TheClient_ESTest_scaffolding {

  /**
  //Test case number: 0
  /*Coverage entropy=3.196939089991099
  */
  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      TheClient theClient0 = new TheClient();
      theClient0.setMaxAuthTryMsg("");
      QuickServer quickServer0 = new QuickServer("", 1);
      quickServer0.setClientAuthenticationHandler("r9<K#pHvol");
      theClient0.setMaxAuthTry(2360);
      QuickServerConfig quickServerConfig0 = new QuickServerConfig();
      org.quickserver.net.qsadmin.Authenticator authenticator0 = new org.quickserver.net.qsadmin.Authenticator();
      quickServerConfig0.setClientAuthenticationHandler((ClientAuthenticationHandler) authenticator0);
      quickServer0.initServer(quickServerConfig0);
      quickServer0.setStoreObjects((Object[]) null);
      quickServer0.setClientExtendedEventHandler("r9<K#pHvol");
      NetworkHandling.sendMessageOnTcp((EvoSuiteLocalAddress) null, "");
      theClient0.setServer(quickServer0);
      theClient0.getClientExtendedEventHandler();
      EvoSuiteRemoteAddress evoSuiteRemoteAddress0 = new EvoSuiteRemoteAddress("org.quickserver.net.server.TheClient", 125);
      theClient0.getClientExtendedEventHandler();
      theClient0.setClientExtendedEventHandler((ClientExtendedEventHandler) null);
      NetworkHandling.openRemoteTcpServer(evoSuiteRemoteAddress0);
      theClient0.setMaxConnectionMsg("w1714%4X");
      theClient0.getServer();
      theClient0.getAuthenticator();
      theClient0.getClientExtendedEventHandler();
      theClient0.getClientBinaryHandler();
      theClient0.toString();
      theClient0.getClientExtendedEventHandler();
      theClient0.getClientWriteHandler();
      theClient0.getAuthenticator();
      theClient0.getClientWriteHandler();
      theClient0.getSocket();
      theClient0.getSocketChannel();
      theClient0.getClientObjectHandler();
      theClient0.getClientExtendedEventHandler();
      theClient0.getClientWriteHandler();
      assertEquals(2360, theClient0.getMaxAuthTry());
  }

  /**
  //Test case number: 1
  /*Coverage entropy=1.830738805564335
  */
  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      TheClient theClient0 = new TheClient();
      QuickServer quickServer0 = new QuickServer();
      theClient0.setServer(quickServer0);
      theClient0.getMaxConnectionMsg();
      theClient0.getServer();
      assertTrue(theClient0.getCommunicationLogging());
      assertFalse(theClient0.getTrusted());
  }

  /**
  //Test case number: 2
  /*Coverage entropy=2.9676652704776565
  */
  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      TheClient theClient0 = new TheClient();
      Data data0 = new Data();
      byte[] byteArray0 = new byte[9];
      byteArray0[0] = (byte)25;
      byteArray0[2] = (byte) (-45);
      byteArray0[3] = (byte)124;
      byteArray0[4] = (byte)0;
      data0.setUsername("3t1MvbC^~Uz{,");
      byteArray0[5] = (byte)98;
      byteArray0[6] = (byte)87;
      byteArray0[7] = (byte)13;
      byteArray0[0] = (byte) (-37);
      data0.setPassword(byteArray0);
      theClient0.getTimeoutMsg();
      theClient0.getClientEventHandler();
      theClient0.setTrusted(false);
      theClient0.setClientEvent((ClientEvent) null);
      theClient0.getClientAuthenticationHandler();
      theClient0.getClientExtendedEventHandler();
      theClient0.setClientExtendedEventHandler((ClientExtendedEventHandler) null);
      theClient0.getSocketChannel();
      String string0 = theClient0.toString();
      assertEquals("{TheClient no socket, Event: null}", string0);
      
      theClient0.getClientEvent();
      theClient0.getClientEvent();
      theClient0.getClientObjectHandler();
      theClient0.getSocketChannel();
      assertTrue(theClient0.getCommunicationLogging());
      assertFalse(theClient0.getTrusted());
  }

  /**
  //Test case number: 3
  /*Coverage entropy=3.4342348975337873
  */
  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      TheClient theClient0 = new TheClient();
      theClient0.setMaxAuthTryMsg("");
      theClient0.getClientObjectHandler();
      theClient0.getClientObjectHandler();
      theClient0.getServer();
      theClient0.getClientExtendedEventHandler();
      theClient0.setClientExtendedEventHandler((ClientExtendedEventHandler) null);
      theClient0.getClientData();
      theClient0.getMaxAuthTryMsg();
      TheClient theClient1 = new TheClient();
      theClient1.setClientExtendedEventHandler((ClientExtendedEventHandler) null);
      theClient0.setTimeout(0);
      theClient0.setClientData((ClientData) null);
      theClient0.getTimeoutMsg();
      theClient1.getAuthenticator();
      theClient0.setAuthenticator((Authenticator) null);
      theClient1.setClientObjectHandler((ClientObjectHandler) null);
      theClient1.getTimeout();
      theClient0.setTimeoutMsg("");
      boolean boolean0 = theClient0.getTrusted();
      assertFalse(boolean0);
      
      theClient1.getTimeout();
      theClient1.getAuthenticator();
      theClient0.getClientEventHandler();
      assertEquals(0, theClient0.getTimeout());
      
      theClient1.getSocket();
      assertTrue(theClient1.getCommunicationLogging());
  }

  /**
  //Test case number: 4
  /*Coverage entropy=3.125543816101745
  */
  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      TheClient theClient0 = new TheClient();
      org.quickserver.net.qsadmin.Authenticator authenticator0 = new org.quickserver.net.qsadmin.Authenticator();
      theClient0.getClientWriteHandler();
      theClient0.setClientWriteHandler((ClientWriteHandler) null);
      theClient0.setClientAuthenticationHandler(authenticator0);
      theClient0.setTimeout((-992));
      theClient0.getTimeoutMsg();
      theClient0.getAuthenticator();
      theClient0.setAuthenticator((Authenticator) null);
      theClient0.getClientObjectHandler();
      theClient0.setClientObjectHandler((ClientObjectHandler) null);
      theClient0.getTimeout();
      TheClient theClient1 = new TheClient();
      theClient1.setTimeoutMsg((String) null);
      theClient0.getTimeout();
      assertEquals((-992), theClient0.getTimeout());
      
      theClient1.getAuthenticator();
      TheClient theClient2 = new TheClient();
      theClient2.getClientEventHandler();
      theClient2.getSocket();
      assertTrue(theClient2.getCommunicationLogging());
  }

  /**
  //Test case number: 5
  /*Coverage entropy=3.1239058144637433
  */
  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      TheClient theClient0 = new TheClient();
      org.quickserver.net.qsadmin.Authenticator authenticator0 = new org.quickserver.net.qsadmin.Authenticator();
      theClient0.getClientWriteHandler();
      theClient0.setClientWriteHandler((ClientWriteHandler) null);
      theClient0.setClientAuthenticationHandler(authenticator0);
      theClient0.setClientCommandHandler((ClientCommandHandler) null);
      Data data0 = new Data();
      theClient0.setClientData(data0);
      theClient0.getClientAuthenticationHandler();
      theClient0.getClientBinaryHandler();
      theClient0.setClientBinaryHandler((ClientBinaryHandler) null);
      boolean boolean0 = theClient0.getTrusted();
      assertFalse(boolean0);
      
      theClient0.getClientObjectHandler();
      theClient0.setClientObjectHandler((ClientObjectHandler) null);
      theClient0.getClientExtendedEventHandler();
      theClient0.getClientAuthenticationHandler();
      TheClient theClient1 = new TheClient();
      theClient1.setClientEvent((ClientEvent) null);
      assertTrue(theClient1.getCommunicationLogging());
  }

  /**
  //Test case number: 6
  /*Coverage entropy=2.41257681572198
  */
  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      TheClient theClient0 = new TheClient();
      theClient0.setTimeoutMsg("X'Aa%zL86|");
      BlockingClientHandler blockingClientHandler0 = new BlockingClientHandler();
      blockingClientHandler0.getClientData();
      theClient0.setClientData((ClientData) null);
      theClient0.setMaxConnectionMsg("X'Aa%zL86|");
      theClient0.setCommunicationLogging(true);
      theClient0.getTimeoutMsg();
      theClient0.getClientExtendedEventHandler();
      int int0 = 4266;
      NonBlockingClientHandler nonBlockingClientHandler0 = new NonBlockingClientHandler(4266);
      nonBlockingClientHandler0.getSocketChannel();
      ByteBuffer[] byteBufferArray0 = new ByteBuffer[6];
      ByteBuffer byteBuffer0 = ByteBuffer.allocate(4266);
      byteBufferArray0[0] = byteBuffer0;
      byte[] byteArray0 = new byte[3];
      byteArray0[0] = (byte)0;
      byte byte0 = (byte) (-54);
      byteArray0[1] = (byte) (-54);
      byteArray0[2] = (byte) (-71);
      // Undeclared exception!
      try { 
        ByteBuffer.wrap(byteArray0, 0, (-339));
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.nio.ByteBuffer", e);
      }
  }

  /**
  //Test case number: 7
  /*Coverage entropy=3.487795765617483
  */
  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      TheClient theClient0 = new TheClient();
      theClient0.getClientExtendedEventHandler();
      theClient0.setClientData((ClientData) null);
      theClient0.setClientExtendedEventHandler((ClientExtendedEventHandler) null);
      theClient0.getSocket();
      theClient0.getClientExtendedEventHandler();
      theClient0.getClientExtendedEventHandler();
      theClient0.getSocket();
      theClient0.getAuthenticator();
      theClient0.setAuthenticator((Authenticator) null);
      DefaultClientEventHandler defaultClientEventHandler0 = new DefaultClientEventHandler();
      theClient0.setClientEventHandler(defaultClientEventHandler0);
      theClient0.getSocketChannel();
      theClient0.getClientObjectHandler();
      theClient0.setClientObjectHandler((ClientObjectHandler) null);
      theClient0.getTrusted();
      org.quickserver.net.qsadmin.Authenticator authenticator0 = new org.quickserver.net.qsadmin.Authenticator();
      theClient0.setClientAuthenticationHandler(authenticator0);
      theClient0.getClientAuthenticationHandler();
      theClient0.getClientEventHandler();
      theClient0.setCommunicationLogging(false);
      theClient0.getClientBinaryHandler();
      TheClient theClient1 = new TheClient();
      theClient1.getSocketChannel();
      TheClient theClient2 = new TheClient();
      theClient2.getClientBinaryHandler();
      theClient2.getServer();
      theClient0.getCommunicationLogging();
      theClient2.setCommunicationLogging(false);
      theClient1.setTrusted(false);
      theClient2.getServer();
      theClient0.getClientExtendedEventHandler();
      assertFalse(theClient0.getCommunicationLogging());
      
      theClient1.setClientExtendedEventHandler((ClientExtendedEventHandler) null);
      assertTrue(theClient1.getCommunicationLogging());
  }

  /**
  //Test case number: 8
  /*Coverage entropy=2.8778952727983707
  */
  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      TheClient theClient0 = new TheClient();
      Data data0 = new Data();
      data0.setPassword((byte[]) null);
      data0.setLastAsked("HNID,~PT@LW`s");
      CommandHandler commandHandler0 = new CommandHandler();
      theClient0.setClientCommandHandler(commandHandler0);
      theClient0.setClientData(data0);
      theClient0.setClientCommandHandler(commandHandler0);
      int int0 = theClient0.getMaxAuthTry();
      assertEquals(0, int0);
      
      theClient0.getClientCommandHandler();
      theClient0.getClientBinaryHandler();
      theClient0.getSocketChannel();
      theClient0.getClientWriteHandler();
      theClient0.setClientWriteHandler((ClientWriteHandler) null);
      theClient0.setTrusted(false);
      theClient0.getClientObjectHandler();
      assertFalse(theClient0.getTrusted());
      assertTrue(theClient0.getCommunicationLogging());
  }

  /**
  //Test case number: 9
  /*Coverage entropy=2.673415053526696
  */
  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      TheClient theClient0 = new TheClient();
      theClient0.setMaxAuthTry((-1));
      theClient0.setTimeout((-2));
      theClient0.setTimeoutMsg("");
      theClient0.setTrusted(true);
      CommandHandler commandHandler0 = new CommandHandler();
      theClient0.setMaxAuthTry((-2));
      theClient0.setMaxConnectionMsg("org.quickserver.net.server.QuickServer");
      theClient0.getTimeoutMsg();
      theClient0.toString();
      boolean boolean0 = theClient0.getTrusted();
      assertEquals((-2), theClient0.getMaxAuthTry());
      assertTrue(boolean0);
  }

  /**
  //Test case number: 10
  /*Coverage entropy=2.5500297769739535
  */
  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      TheClient theClient0 = new TheClient();
      Data data0 = new Data();
      data0.setLastAsked("HNID,~PT@LW`s");
      theClient0.setClientData(data0);
      byte[] byteArray0 = new byte[8];
      byteArray0[0] = (byte)35;
      byteArray0[1] = (byte)106;
      theClient0.getClientObjectHandler();
      theClient0.setClientObjectHandler((ClientObjectHandler) null);
      theClient0.getClientData();
      theClient0.getClientWriteHandler();
      theClient0.setClientWriteHandler((ClientWriteHandler) null);
      theClient0.getClientCommandHandler();
      assertTrue(theClient0.getCommunicationLogging());
      assertFalse(theClient0.getTrusted());
  }

  /**
  //Test case number: 11
  /*Coverage entropy=3.19741190322987
  */
  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      TheClient theClient0 = new TheClient();
      org.quickserver.net.qsadmin.Authenticator authenticator0 = new org.quickserver.net.qsadmin.Authenticator();
      theClient0.getClientWriteHandler();
      theClient0.setMaxConnectionMsg("D-m$*IRMU:IK/Gn");
      theClient0.getMaxConnectionMsg();
      theClient0.getClientAuthenticationHandler();
      theClient0.getClientBinaryHandler();
      theClient0.setClientBinaryHandler((ClientBinaryHandler) null);
      org.quickserver.net.qsadmin.Authenticator authenticator1 = new org.quickserver.net.qsadmin.Authenticator();
      theClient0.setClientAuthenticationHandler(authenticator1);
      TheClient theClient1 = new TheClient();
      theClient1.getClientAuthenticationHandler();
      theClient1.toString();
      theClient1.getServer();
      theClient0.getClientCommandHandler();
      theClient1.setClientCommandHandler((ClientCommandHandler) null);
      theClient1.getClientObjectHandler();
      theClient1.getClientObjectHandler();
      theClient0.setClientObjectHandler((ClientObjectHandler) null);
      theClient0.getTrusted();
      theClient0.getServer();
      theClient1.getClientAuthenticationHandler();
      theClient0.setClientObjectHandler((ClientObjectHandler) null);
      theClient1.getServer();
      theClient1.getClientBinaryHandler();
      MockSocket mockSocket0 = null;
      try {
        mockSocket0 = new MockSocket("{TheClient no socket, Event: (ClientEvent-Run Blocking)}", (-1313), false);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // port out of range:-1313
         //
         verifyException("java.net.InetSocketAddress", e);
      }
  }

  /**
  //Test case number: 12
  /*Coverage entropy=2.41257681572198
  */
  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      byte[] byteArray0 = new byte[9];
      byteArray0[0] = (byte) (-52);
      byteArray0[1] = (byte) (-89);
      byteArray0[2] = (byte) (-107);
      byteArray0[3] = (byte) (-128);
      TheClient theClient0 = new TheClient();
      QuickServer quickServer0 = new QuickServer("StackTrace: ", 4020);
      theClient0.setServer(quickServer0);
      theClient0.setMaxAuthTry((-3953));
      theClient0.getTimeout();
      theClient0.getMaxAuthTry();
      theClient0.getClientExtendedEventHandler();
      theClient0.setMaxAuthTryMsg("Sending [{0}] : {1}; RAW: {2}{3}");
      SocketChannel.open();
      MockSocket mockSocket0 = null;
      try {
        mockSocket0 = new MockSocket("D'jB: L&ZW[qX)Bo)M", 0, true);
        fail("Expecting exception: IOException");
      
      } catch(Throwable e) {
         //
         // Remote address/port is not opened: org.evosuite.runtime.vnet.EndPointInfo@53f56d94
         //
         verifyException("org.evosuite.runtime.vnet.VirtualNetwork", e);
      }
  }

  /**
  //Test case number: 13
  /*Coverage entropy=1.5271837172395382
  */
  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      TheClient theClient0 = new TheClient();
      MockSocket mockSocket0 = new MockSocket();
      theClient0.setSocket(mockSocket0);
      theClient0.toString();
      byte byte0 = (byte)0;
      byte[] byteArray0 = new byte[20];
      byteArray0[0] = (byte) (-33);
      byteArray0[1] = (byte)70;
      byteArray0[2] = (byte) (-33);
      byteArray0[3] = (byte)64;
      byteArray0[4] = (byte) (-33);
      byteArray0[5] = (byte)0;
      byteArray0[6] = (byte)64;
      byteArray0[7] = (byte)64;
      mockSocket0.getInetAddress();
      try { 
        MockInetAddress.getByAddress("", byteArray0);
        fail("Expecting exception: UnknownHostException");
      
      } catch(UnknownHostException e) {
         //
         // Not IPv4: [-33, 70, -33, 64, -33, 0, 64, 64, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]
         //
         verifyException("org.evosuite.runtime.mock.java.net.MockInetAddress", e);
      }
  }

  /**
  //Test case number: 14
  /*Coverage entropy=2.881766240540306
  */
  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      TheClient theClient0 = new TheClient();
      MockSocket mockSocket0 = new MockSocket();
      mockSocket0.getReuseAddress();
      SocketChannel socketChannel0 = SocketChannel.open();
      theClient0.setSocketChannel(socketChannel0);
      theClient0.setSocket(mockSocket0);
      theClient0.setTimeout(101);
      theClient0.getSocketChannel();
      theClient0.getClientCommandHandler();
      theClient0.setClientCommandHandler((ClientCommandHandler) null);
      theClient0.getSocket();
      TheClient theClient1 = new TheClient();
      theClient1.getClientBinaryHandler();
      theClient1.toString();
      theClient0.getSocket();
      assertEquals(101, theClient0.getTimeout());
      
      theClient1.getSocketChannel();
      theClient1.getClientExtendedEventHandler();
      theClient1.getClientBinaryHandler();
      assertFalse(theClient1.getTrusted());
  }

  /**
  //Test case number: 15
  /*Coverage entropy=1.0931471805599453
  */
  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      byte[] byteArray0 = new byte[9];
      byteArray0[0] = (byte) (-52);
      byteArray0[1] = (byte) (-89);
      byteArray0[2] = (byte) (-107);
      byteArray0[3] = (byte) (-128);
      byteArray0[4] = (byte)0;
      byteArray0[5] = (byte)0;
      byteArray0[6] = (byte)0;
      byteArray0[7] = (byte)2;
      byteArray0[8] = (byte) (-3);
      FileSystemHandling.appendDataToFile((EvoSuiteFile) null, byteArray0);
      TheClient theClient0 = new TheClient();
      boolean boolean0 = theClient0.getCommunicationLogging();
      assertFalse(theClient0.getTrusted());
      assertTrue(boolean0);
  }

  /**
  //Test case number: 16
  /*Coverage entropy=3.1288532479826054
  */
  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      TheClient theClient0 = new TheClient();
      theClient0.setMaxConnectionMsg("");
      theClient0.getMaxConnectionMsg();
      theClient0.getClientAuthenticationHandler();
      theClient0.getClientBinaryHandler();
      theClient0.setClientBinaryHandler((ClientBinaryHandler) null);
      TheClient theClient1 = new TheClient();
      theClient1.getClientAuthenticationHandler();
      theClient0.setClientAuthenticationHandler((ClientAuthenticationHandler) null);
      theClient0.getClientAuthenticationHandler();
      theClient1.getMaxAuthTryMsg();
      theClient0.getServer();
      theClient0.getClientCommandHandler();
      theClient1.setClientCommandHandler((ClientCommandHandler) null);
      theClient0.setClientAuthenticationHandler((ClientAuthenticationHandler) null);
      theClient1.getClientObjectHandler();
      theClient0.getClientObjectHandler();
      theClient1.setClientObjectHandler((ClientObjectHandler) null);
      theClient1.getTrusted();
      theClient0.getServer();
      theClient0.getClientAuthenticationHandler();
      theClient1.setClientObjectHandler((ClientObjectHandler) null);
      theClient0.getServer();
      theClient1.getClientBinaryHandler();
      MockSocket mockSocket0 = null;
      try {
        mockSocket0 = new MockSocket("IOError ", 1234, false);
        fail("Expecting exception: IOException");
      
      } catch(Throwable e) {
         //
         // Remote address/port is not opened: org.evosuite.runtime.vnet.EndPointInfo@53f60302
         //
         verifyException("org.evosuite.runtime.vnet.VirtualNetwork", e);
      }
  }

  /**
  //Test case number: 17
  /*Coverage entropy=3.048820325203473
  */
  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      TheClient theClient0 = new TheClient();
      MockSocket mockSocket0 = new MockSocket();
      theClient0.getClientExtendedEventHandler();
      theClient0.setClientExtendedEventHandler((ClientExtendedEventHandler) null);
      SocketChannel.open();
      CommandHandler commandHandler0 = new CommandHandler();
      theClient0.setClientEventHandler(commandHandler0);
      theClient0.getClientEventHandler();
      theClient0.getAuthenticator();
      theClient0.setAuthenticator((Authenticator) null);
      theClient0.getClientAuthenticationHandler();
      theClient0.getClientData();
      theClient0.getClientBinaryHandler();
      theClient0.getClientBinaryHandler();
      theClient0.setClientBinaryHandler((ClientBinaryHandler) null);
      ClientEvent clientEvent0 = theClient0.getClientEvent();
      TheClient theClient1 = new TheClient();
      theClient1.setClientEvent(clientEvent0);
      assertFalse(theClient0.getTrusted());
      assertTrue(theClient0.getCommunicationLogging());
      assertFalse(theClient1.getTrusted());
  }

  /**
  //Test case number: 18
  /*Coverage entropy=3.323009262423563
  */
  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      TheClient theClient0 = new TheClient();
      theClient0.getClientAuthenticationHandler();
      theClient0.getAuthenticator();
      theClient0.setMaxAuthTryMsg("69+1Arq;");
      theClient0.getClientObjectHandler();
      theClient0.getClientObjectHandler();
      theClient0.getServer();
      theClient0.getClientExtendedEventHandler();
      theClient0.setClientExtendedEventHandler((ClientExtendedEventHandler) null);
      theClient0.getClientData();
      theClient0.getMaxAuthTryMsg();
      theClient0.setClientExtendedEventHandler((ClientExtendedEventHandler) null);
      theClient0.setTimeout(0);
      theClient0.setClientData((ClientData) null);
      theClient0.getClientAuthenticationHandler();
      TheClient theClient1 = new TheClient();
      theClient1.getClientBinaryHandler();
      theClient1.setClientBinaryHandler((ClientBinaryHandler) null);
      boolean boolean0 = theClient1.getTrusted();
      assertFalse(boolean0);
      
      theClient0.getClientObjectHandler();
      theClient1.setClientObjectHandler((ClientObjectHandler) null);
      theClient0.getClientExtendedEventHandler();
      theClient0.getClientAuthenticationHandler();
      ClientEvent clientEvent0 = ClientEvent.MAX_CON;
      theClient0.setClientEvent(clientEvent0);
      assertEquals(0, theClient0.getTimeout());
      assertTrue(theClient0.getCommunicationLogging());
  }

  /**
  //Test case number: 19
  /*Coverage entropy=2.6709087878625355
  */
  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      TheClient theClient0 = new TheClient();
      theClient0.setTimeout((-2));
      theClient0.setTimeoutMsg("");
      theClient0.setTrusted(true);
      CommandHandler commandHandler0 = new CommandHandler();
      theClient0.setMaxAuthTry((-2));
      theClient0.setClientCommandHandler(commandHandler0);
      theClient0.setMaxConnectionMsg("org.quickserver.net.server.QuickServer");
      theClient0.getTimeoutMsg();
      theClient0.getMaxAuthTryMsg();
      QuickServer quickServer0 = null;
      try {
        quickServer0 = new QuickServer("org.quickserver.net.server.QuickServer", (-2));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Port number can not be less than 0!
         //
         verifyException("org.quickserver.net.server.QuickServer", e);
      }
  }

  /**
  //Test case number: 20
  /*Coverage entropy=2.5500297769739535
  */
  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      TheClient theClient0 = new TheClient();
      theClient0.getClientBinaryHandler();
      theClient0.setClientBinaryHandler((ClientBinaryHandler) null);
      FileSystemHandling.shouldAllThrowIOExceptions();
      theClient0.getClientObjectHandler();
      theClient0.setTimeout(1309);
      theClient0.setClientObjectHandler((ClientObjectHandler) null);
      theClient0.getTimeout();
      theClient0.setTimeoutMsg("");
      assertEquals(1309, theClient0.getTimeout());
  }

  /**
  //Test case number: 21
  /*Coverage entropy=2.4164983843494308
  */
  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      TheClient theClient0 = new TheClient();
      MockSocket mockSocket0 = new MockSocket();
      theClient0.getClientExtendedEventHandler();
      theClient0.setClientExtendedEventHandler((ClientExtendedEventHandler) null);
      SocketAddress socketAddress0 = null;
      SocketChannel socketChannel0 = SocketChannel.open();
      theClient0.setSocketChannel(socketChannel0);
      theClient0.setMaxAuthTry(1);
      int int0 = new Integer(1);
      theClient0.getMaxAuthTry();
      theClient0.getClientExtendedEventHandler();
      theClient0.setMaxAuthTryMsg((String) null);
      MockSocket mockSocket1 = null;
      try {
        mockSocket1 = new MockSocket("gB*'", (-3369), true);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // port out of range:-3369
         //
         verifyException("java.net.InetSocketAddress", e);
      }
  }
}
