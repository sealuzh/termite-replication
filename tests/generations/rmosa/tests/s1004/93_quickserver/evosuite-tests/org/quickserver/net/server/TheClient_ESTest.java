/*
 * This file was automatically generated by EvoSuite
 * Mon Dec 02 03:07:05 GMT 2019
 */

package org.quickserver.net.server;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.IOException;
import java.net.InetAddress;
import java.net.Proxy;
import java.net.Socket;
import java.net.UnknownHostException;
import java.nio.channels.SocketChannel;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.System;
import org.evosuite.runtime.mock.java.net.MockInetAddress;
import org.evosuite.runtime.mock.java.net.MockSocket;
import org.evosuite.runtime.testdata.EvoSuiteFile;
import org.evosuite.runtime.testdata.EvoSuiteLocalAddress;
import org.evosuite.runtime.testdata.FileSystemHandling;
import org.evosuite.runtime.testdata.NetworkHandling;
import org.junit.runner.RunWith;
import org.quickserver.net.qsadmin.CommandHandler;
import org.quickserver.net.qsadmin.Data;
import org.quickserver.net.qsadmin.QSAdminServer;
import org.quickserver.net.server.Authenticator;
import org.quickserver.net.server.ClientBinaryHandler;
import org.quickserver.net.server.ClientCommandHandler;
import org.quickserver.net.server.ClientEvent;
import org.quickserver.net.server.ClientExtendedEventHandler;
import org.quickserver.net.server.ClientHandler;
import org.quickserver.net.server.ClientObjectHandler;
import org.quickserver.net.server.ClientWriteHandler;
import org.quickserver.net.server.QuickServer;
import org.quickserver.net.server.TheClient;
import org.quickserver.net.server.impl.BlockingClientHandler;
import org.quickserver.net.server.impl.DefaultClientEventHandler;
import org.quickserver.net.server.impl.NonBlockingClientHandler;
import org.quickserver.util.xmlreader.BasicServerConfig;
import org.quickserver.util.xmlreader.QuickServerConfig;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class TheClient_ESTest extends TheClient_ESTest_scaffolding {

  /**
  //Test case number: 0
  /*Coverage entropy=2.2584261358947213
  */
  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      NetworkHandling.sendDataOnTcp((EvoSuiteLocalAddress) null, (byte[]) null);
      TheClient theClient0 = new TheClient();
      QuickServer quickServer0 = new QuickServer();
      quickServer0.makeServerSocket();
      quickServer0.setServiceState(704);
      theClient0.setServer(quickServer0);
      theClient0.setTimeoutMsg("");
      theClient0.getClientWriteHandler();
      byte[] byteArray0 = new byte[8];
      Data data0 = new Data();
      theClient0.setClientData(data0);
      byteArray0[0] = (byte)0;
      byteArray0[1] = (byte)108;
      byteArray0[2] = (byte)106;
      byteArray0[3] = (byte)106;
      byteArray0[4] = (byte)32;
      byteArray0[5] = (byte)0;
      byteArray0[6] = (byte)106;
      NetworkHandling.sendDataOnTcp((EvoSuiteLocalAddress) null, byteArray0);
      theClient0.getServer();
      System.setCurrentTimeMillis(3377L);
      String string0 = theClient0.toString();
      assertEquals("{TheClient no socket, Event: (ClientEvent-Run Blocking)}", string0);
      assertTrue(theClient0.getCommunicationLogging());
      assertFalse(theClient0.getTrusted());
  }

  /**
  //Test case number: 1
  /*Coverage entropy=3.6692819005233845
  */
  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      TheClient theClient0 = new TheClient();
      ClientEvent clientEvent0 = ClientEvent.LOST_CON;
      FileSystemHandling.createFolder((EvoSuiteFile) null);
      theClient0.setClientEvent(clientEvent0);
      theClient0.setTimeoutMsg("Written ");
      QuickServer quickServer0 = new QuickServer("B");
      BasicServerConfig basicServerConfig0 = new BasicServerConfig();
      quickServer0.setBasicConfig(basicServerConfig0);
      QuickServer quickServer1 = new QuickServer();
      QSAdminServer qSAdminServer0 = quickServer1.getQSAdminServer();
      qSAdminServer0.setShellEnable(false);
      quickServer0.setQSAdminServer(qSAdminServer0);
      quickServer0.run();
      theClient0.setServer(quickServer0);
      theClient0.getClientObjectHandler();
      theClient0.getClientWriteHandler();
      byte[] byteArray0 = new byte[7];
      byteArray0[0] = (byte)0;
      byteArray0[1] = (byte)0;
      byteArray0[3] = (byte)0;
      byteArray0[4] = (byte) (-74);
      byteArray0[5] = (byte)0;
      byteArray0[6] = (byte) (-83);
      NetworkHandling.sendDataOnTcp((EvoSuiteLocalAddress) null, byteArray0);
      theClient0.getClientBinaryHandler();
      theClient0.getClientExtendedEventHandler();
      theClient0.getAuthenticator();
      theClient0.getClientBinaryHandler();
      theClient0.getServer();
      theClient0.getSocketChannel();
      assertFalse(theClient0.getTrusted());
      assertTrue(theClient0.getCommunicationLogging());
  }

  /**
  //Test case number: 2
  /*Coverage entropy=2.0761045791007673
  */
  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      NetworkHandling.sendDataOnTcp((EvoSuiteLocalAddress) null, (byte[]) null);
      TheClient theClient0 = new TheClient();
      QuickServer quickServer0 = new QuickServer();
      quickServer0.setServiceState(704);
      theClient0.setServer(quickServer0);
      theClient0.setTimeoutMsg((String) null);
      theClient0.setTimeoutMsg("");
      theClient0.getClientWriteHandler();
      byte[] byteArray0 = new byte[8];
      byteArray0[0] = (byte)0;
      byteArray0[1] = (byte)100;
      byteArray0[2] = (byte)106;
      byteArray0[3] = (byte)34;
      byteArray0[4] = (byte)32;
      byteArray0[5] = (byte)0;
      byteArray0[6] = (byte)106;
      NetworkHandling.sendDataOnTcp((EvoSuiteLocalAddress) null, byteArray0);
      theClient0.getServer();
      System.setCurrentTimeMillis(3377L);
      String string0 = theClient0.toString();
      assertFalse(theClient0.getTrusted());
      assertTrue(theClient0.getCommunicationLogging());
      assertEquals("{TheClient no socket, Event: (ClientEvent-Run Blocking)}", string0);
  }

  /**
  //Test case number: 3
  /*Coverage entropy=2.555632017870312
  */
  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      NetworkHandling.sendDataOnTcp((EvoSuiteLocalAddress) null, (byte[]) null);
      TheClient theClient0 = new TheClient();
      QuickServer quickServer0 = new QuickServer();
      QuickServerConfig quickServerConfig0 = new QuickServerConfig();
      quickServer0.initServer(quickServerConfig0);
      quickServer0.makeServerSocket();
      theClient0.setServer(quickServer0);
      theClient0.setTimeoutMsg((String) null);
      theClient0.setTimeoutMsg("");
      theClient0.getClientWriteHandler();
      byte[] byteArray0 = new byte[8];
      Data data0 = new Data();
      theClient0.setClientData(data0);
      byteArray0[0] = (byte)0;
      byteArray0[1] = (byte)0;
      byteArray0[2] = (byte)106;
      byteArray0[3] = (byte)34;
      byteArray0[4] = (byte)32;
      byteArray0[5] = (byte)0;
      byteArray0[6] = (byte)106;
      NetworkHandling.sendDataOnTcp((EvoSuiteLocalAddress) null, byteArray0);
      theClient0.getServer();
      System.setCurrentTimeMillis(3377L);
      String string0 = theClient0.toString();
      assertEquals("{TheClient no socket, Event: (ClientEvent-Run Blocking)}", string0);
      
      theClient0.getClientObjectHandler();
      theClient0.getClientExtendedEventHandler();
      assertTrue(theClient0.getCommunicationLogging());
      assertFalse(theClient0.getTrusted());
  }

  /**
  //Test case number: 4
  /*Coverage entropy=1.5271837172395382
  */
  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      TheClient theClient0 = new TheClient();
      MockSocket mockSocket0 = new MockSocket();
      theClient0.setSocket(mockSocket0);
      theClient0.getSocket();
      assertTrue(theClient0.getCommunicationLogging());
      assertFalse(theClient0.getTrusted());
  }

  /**
  //Test case number: 5
  /*Coverage entropy=1.5271837172395382
  */
  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      TheClient theClient0 = new TheClient();
      theClient0.setMaxAuthTry((-1469));
      int int0 = theClient0.getMaxAuthTry();
      assertEquals((-1469), int0);
  }

  /**
  //Test case number: 6
  /*Coverage entropy=1.830738805564335
  */
  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      TheClient theClient0 = new TheClient();
      theClient0.setMaxConnectionMsg("");
      FileSystemHandling.shouldAllThrowIOExceptions();
      theClient0.getMaxConnectionMsg();
      theClient0.getClientWriteHandler();
      assertTrue(theClient0.getCommunicationLogging());
      assertFalse(theClient0.getTrusted());
  }

  /**
  //Test case number: 7
  /*Coverage entropy=2.063983366979555
  */
  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      TheClient theClient0 = new TheClient();
      theClient0.setTimeout(125);
      theClient0.getTimeout();
      theClient0.getClientBinaryHandler();
      theClient0.getClientObjectHandler();
      assertEquals(125, theClient0.getTimeout());
  }

  /**
  //Test case number: 8
  /*Coverage entropy=2.063983366979555
  */
  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      byte[] byteArray0 = new byte[24];
      byteArray0[0] = (byte) (-34);
      byteArray0[1] = (byte) (-34);
      FileSystemHandling.appendDataToFile((EvoSuiteFile) null, byteArray0);
      byteArray0[22] = (byte)0;
      TheClient theClient0 = new TheClient();
      DefaultClientEventHandler defaultClientEventHandler0 = new DefaultClientEventHandler();
      theClient0.setClientEventHandler(defaultClientEventHandler0);
      BlockingClientHandler blockingClientHandler0 = new BlockingClientHandler();
      theClient0.getMaxAuthTryMsg();
      theClient0.getClientEventHandler();
      theClient0.getClientExtendedEventHandler();
      System.setCurrentTimeMillis(5568);
  }

  /**
  //Test case number: 9
  /*Coverage entropy=1.5271837172395382
  */
  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      TheClient theClient0 = new TheClient();
      theClient0.setTimeoutMsg("");
      theClient0.getTimeoutMsg();
      DefaultClientEventHandler defaultClientEventHandler0 = new DefaultClientEventHandler();
      // Undeclared exception!
      try { 
        defaultClientEventHandler0.lostConnection((ClientHandler) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.quickserver.net.server.impl.DefaultClientEventHandler", e);
      }
  }

  /**
  //Test case number: 10
  /*Coverage entropy=1.5271837172395382
  */
  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      TheClient theClient0 = new TheClient();
      theClient0.setMaxAuthTry(256);
      int int0 = theClient0.getMaxAuthTry();
      assertEquals(256, int0);
  }

  /**
  //Test case number: 11
  /*Coverage entropy=1.1217186091313738
  */
  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      TheClient theClient0 = new TheClient();
      Proxy proxy0 = Proxy.NO_PROXY;
      MockSocket mockSocket0 = new MockSocket(proxy0);
      theClient0.setSocket(mockSocket0);
      String string0 = theClient0.toString();
      assertEquals("{TheClient Socket[unconnected], Event: (ClientEvent-Run Blocking)}", string0);
      assertFalse(theClient0.getTrusted());
      assertTrue(theClient0.getCommunicationLogging());
  }

  /**
  //Test case number: 12
  /*Coverage entropy=1.5271837172395382
  */
  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      TheClient theClient0 = new TheClient();
      QuickServer quickServer0 = new QuickServer("");
      theClient0.setServer(quickServer0);
      theClient0.getServer();
      assertFalse(theClient0.getTrusted());
      assertTrue(theClient0.getCommunicationLogging());
  }

  /**
  //Test case number: 13
  /*Coverage entropy=1.5271837172395382
  */
  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      TheClient theClient0 = new TheClient();
      theClient0.setMaxConnectionMsg("'NB");
      theClient0.getMaxConnectionMsg();
      assertFalse(theClient0.getTrusted());
      assertTrue(theClient0.getCommunicationLogging());
  }

  /**
  //Test case number: 14
  /*Coverage entropy=1.5271837172395382
  */
  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      TheClient theClient0 = new TheClient();
      theClient0.setMaxAuthTryMsg("\u0007&}^");
      theClient0.getMaxAuthTryMsg();
      assertTrue(theClient0.getCommunicationLogging());
      assertFalse(theClient0.getTrusted());
  }

  /**
  //Test case number: 15
  /*Coverage entropy=2.253297930766516
  */
  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      TheClient theClient0 = new TheClient();
      CommandHandler commandHandler0 = new CommandHandler();
      theClient0.setClientEventHandler(commandHandler0);
      theClient0.setMaxAuthTryMsg("|0V{~n'8m_bz3pk");
      theClient0.setTimeout((-2834));
      theClient0.getTimeout();
      int int0 = theClient0.getMaxAuthTry();
      assertEquals((-2834), theClient0.getTimeout());
      assertEquals(0, int0);
  }

  /**
  //Test case number: 16
  /*Coverage entropy=1.560150750206571
  */
  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      CommandHandler commandHandler0 = new CommandHandler();
      TheClient theClient0 = new TheClient();
      TheClient theClient1 = new TheClient();
      theClient0.setCommunicationLogging(false);
      theClient0.toString();
      theClient1.toString();
      assertTrue(theClient1.getCommunicationLogging());
      
      boolean boolean0 = theClient0.getCommunicationLogging();
      assertFalse(boolean0);
  }

  /**
  //Test case number: 17
  /*Coverage entropy=1.830738805564335
  */
  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      TheClient theClient0 = new TheClient();
      theClient0.setMaxAuthTryMsg("");
      boolean boolean0 = theClient0.getCommunicationLogging();
      assertTrue(boolean0);
      
      theClient0.getMaxAuthTryMsg();
      assertFalse(theClient0.getTrusted());
  }

  /**
  //Test case number: 18
  /*Coverage entropy=1.5271837172395382
  */
  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      TheClient theClient0 = new TheClient();
      theClient0.setTrusted(true);
      theClient0.getTrusted();
      int int0 = 120;
      MockSocket mockSocket0 = null;
      try {
        mockSocket0 = new MockSocket("", 120, true);
        fail("Expecting exception: IOException");
      
      } catch(Throwable e) {
         //
         // Remote address/port is not opened: org.evosuite.runtime.vnet.EndPointInfo@373a837a
         //
         verifyException("org.evosuite.runtime.vnet.VirtualNetwork", e);
      }
  }

  /**
  //Test case number: 19
  /*Coverage entropy=1.5271837172395382
  */
  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      TheClient theClient0 = new TheClient();
      CommandHandler commandHandler0 = new CommandHandler();
      theClient0.setClientCommandHandler(commandHandler0);
      theClient0.getClientCommandHandler();
      QuickServer quickServer0 = new QuickServer("6/p6O>wDgH2j");
      // Undeclared exception!
      try { 
        quickServer0.findClientByKey("6/p6O>wDgH2j");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.quickserver.net.server.QuickServer", e);
      }
  }

  /**
  //Test case number: 20
  /*Coverage entropy=1.0931471805599453
  */
  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      TheClient theClient0 = new TheClient();
      theClient0.getServer();
      assertTrue(theClient0.getCommunicationLogging());
      assertFalse(theClient0.getTrusted());
  }

  /**
  //Test case number: 21
  /*Coverage entropy=1.830738805564335
  */
  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      TheClient theClient0 = new TheClient();
      org.quickserver.net.qsadmin.Authenticator authenticator0 = new org.quickserver.net.qsadmin.Authenticator();
      theClient0.setClientAuthenticationHandler(authenticator0);
      theClient0.getClientAuthenticationHandler();
      theClient0.getClientWriteHandler();
      DefaultClientEventHandler defaultClientEventHandler0 = new DefaultClientEventHandler();
      // Undeclared exception!
      try { 
        defaultClientEventHandler0.lostConnection((ClientHandler) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.quickserver.net.server.impl.DefaultClientEventHandler", e);
      }
  }

  /**
  //Test case number: 22
  /*Coverage entropy=1.5271837172395382
  */
  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      ClientEvent clientEvent0 = ClientEvent.LOST_CON;
      TheClient theClient0 = new TheClient();
      theClient0.setTimeoutMsg("storePassword");
      theClient0.getTimeoutMsg();
      DefaultClientEventHandler defaultClientEventHandler0 = new DefaultClientEventHandler();
      // Undeclared exception!
      try { 
        defaultClientEventHandler0.lostConnection((ClientHandler) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.quickserver.net.server.impl.DefaultClientEventHandler", e);
      }
  }

  /**
  //Test case number: 23
  /*Coverage entropy=1.0931471805599453
  */
  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      TheClient theClient0 = new TheClient();
      theClient0.getMaxConnectionMsg();
      assertFalse(theClient0.getTrusted());
      assertTrue(theClient0.getCommunicationLogging());
  }

  /**
  //Test case number: 24
  /*Coverage entropy=2.879376754279852
  */
  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      TheClient theClient0 = new TheClient();
      theClient0.getClientAuthenticationHandler();
      theClient0.setTimeoutMsg("");
      theClient0.getSocket();
      theClient0.getAuthenticator();
      int int0 = theClient0.getTimeout();
      theClient0.getClientCommandHandler();
      theClient0.setClientCommandHandler((ClientCommandHandler) null);
      theClient0.setClientEvent((ClientEvent) null);
      theClient0.getClientEvent();
      theClient0.getMaxAuthTry();
      int int1 = theClient0.getMaxAuthTry();
      assertTrue(int1 == int0);
      
      theClient0.getSocket();
      assertFalse(theClient0.getTrusted());
      assertTrue(theClient0.getCommunicationLogging());
  }

  /**
  //Test case number: 25
  /*Coverage entropy=1.0931471805599453
  */
  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      TheClient theClient0 = new TheClient();
      theClient0.getClientEvent();
      assertTrue(theClient0.getCommunicationLogging());
      assertFalse(theClient0.getTrusted());
  }

  /**
  //Test case number: 26
  /*Coverage entropy=1.0931471805599453
  */
  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      TheClient theClient0 = new TheClient();
      theClient0.getClientEventHandler();
      assertTrue(theClient0.getCommunicationLogging());
      assertFalse(theClient0.getTrusted());
  }

  /**
  //Test case number: 27
  /*Coverage entropy=2.070976373972562
  */
  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      TheClient theClient0 = new TheClient();
      theClient0.setSocket((Socket) null);
      Data data0 = new Data();
      theClient0.setClientData(data0);
      Data data1 = (Data)theClient0.getClientData();
      data1.setUsername("{a}!8xdwvjqH@/V");
      data1.setUsername("{a}!8xdwvjqH@/V");
      theClient0.getClientBinaryHandler();
      theClient0.getClientBinaryHandler();
      assertFalse(theClient0.getTrusted());
      assertTrue(theClient0.getCommunicationLogging());
  }

  /**
  //Test case number: 28
  /*Coverage entropy=1.0931471805599453
  */
  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      TheClient theClient0 = new TheClient();
      DefaultClientEventHandler defaultClientEventHandler0 = new DefaultClientEventHandler();
      theClient0.setClientBinaryHandler((ClientBinaryHandler) null);
      BlockingClientHandler blockingClientHandler0 = new BlockingClientHandler(5604);
      // Undeclared exception!
      try { 
        blockingClientHandler0.makeSecure();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.quickserver.net.server.impl.BasicClientHandler", e);
      }
  }

  /**
  //Test case number: 29
  /*Coverage entropy=1.0931471805599453
  */
  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      TheClient theClient0 = new TheClient();
      theClient0.getTimeoutMsg();
      assertFalse(theClient0.getTrusted());
      assertTrue(theClient0.getCommunicationLogging());
  }

  /**
  //Test case number: 30
  /*Coverage entropy=1.0931471805599453
  */
  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      TheClient theClient0 = new TheClient();
      theClient0.getClientData();
      DefaultClientEventHandler defaultClientEventHandler0 = new DefaultClientEventHandler();
  }

  /**
  //Test case number: 31
  /*Coverage entropy=1.0931471805599453
  */
  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      TheClient theClient0 = new TheClient();
      NonBlockingClientHandler nonBlockingClientHandler0 = new NonBlockingClientHandler();
      theClient0.setClientWriteHandler((ClientWriteHandler) null);
      InetAddress inetAddress0 = MockInetAddress.anyLocalAddress();
      MockSocket mockSocket0 = null;
      try {
        mockSocket0 = new MockSocket("", (-75), inetAddress0, 5604);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // port out of range:-75
         //
         verifyException("java.net.InetSocketAddress", e);
      }
  }

  /**
  //Test case number: 32
  /*Coverage entropy=1.0931471805599453
  */
  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      TheClient theClient0 = new TheClient();
      boolean boolean0 = theClient0.getTrusted();
      assertTrue(theClient0.getCommunicationLogging());
      assertFalse(boolean0);
  }

  /**
  //Test case number: 33
  /*Coverage entropy=1.0931471805599453
  */
  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      TheClient theClient0 = new TheClient();
      SocketChannel socketChannel0 = SocketChannel.open();
      theClient0.setSocketChannel(socketChannel0);
      assertTrue(theClient0.getCommunicationLogging());
      assertFalse(theClient0.getTrusted());
  }

  /**
  //Test case number: 34
  /*Coverage entropy=1.0931471805599453
  */
  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      byte[] byteArray0 = new byte[2];
      byte byte0 = (byte)0;
      byteArray0[0] = (byte)0;
      byte byte1 = (byte)0;
      NetworkHandling.sendDataOnTcp((EvoSuiteLocalAddress) null, byteArray0);
      byteArray0[1] = (byte)0;
      NetworkHandling.sendDataOnTcp((EvoSuiteLocalAddress) null, byteArray0);
      TheClient theClient0 = new TheClient();
      theClient0.setClientObjectHandler((ClientObjectHandler) null);
      try { 
        MockInetAddress.getByAddress(byteArray0);
        fail("Expecting exception: UnknownHostException");
      
      } catch(UnknownHostException e) {
         //
         // Not IPv4: [0, 0]
         //
         verifyException("org.evosuite.runtime.mock.java.net.MockInetAddress", e);
      }
  }

  /**
  //Test case number: 35
  /*Coverage entropy=1.0931471805599453
  */
  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      TheClient theClient0 = new TheClient();
      theClient0.setAuthenticator((Authenticator) null);
      assertFalse(theClient0.getTrusted());
      assertTrue(theClient0.getCommunicationLogging());
  }

  /**
  //Test case number: 36
  /*Coverage entropy=1.0931471805599453
  */
  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      TheClient theClient0 = new TheClient();
      theClient0.setClientExtendedEventHandler((ClientExtendedEventHandler) null);
      assertFalse(theClient0.getTrusted());
      assertTrue(theClient0.getCommunicationLogging());
  }
}
