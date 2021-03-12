/*
 * This file was automatically generated by EvoSuite
 * Mon Nov 30 02:17:27 GMT 2020
 */

package org.quickserver.net.server;

import org.junit.Test;
import static org.junit.Assert.*;
import java.net.Socket;
import java.net.SocketAddress;
import java.nio.channels.SocketChannel;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.net.MockSocket;
import org.junit.runner.RunWith;
import org.quickserver.net.qsadmin.CommandHandler;
import org.quickserver.net.qsadmin.Data;
import org.quickserver.net.server.Authenticator;
import org.quickserver.net.server.ClientAuthenticationHandler;
import org.quickserver.net.server.ClientBinaryHandler;
import org.quickserver.net.server.ClientCommandHandler;
import org.quickserver.net.server.ClientData;
import org.quickserver.net.server.ClientEvent;
import org.quickserver.net.server.ClientEventHandler;
import org.quickserver.net.server.ClientExtendedEventHandler;
import org.quickserver.net.server.ClientObjectHandler;
import org.quickserver.net.server.ClientWriteHandler;
import org.quickserver.net.server.QuickServer;
import org.quickserver.net.server.TheClient;
import org.quickserver.net.server.impl.DefaultClientEventHandler;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class TheClient_ESTest extends TheClient_ESTest_scaffolding {

  /**
  //Test case number: 0
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      TheClient theClient0 = new TheClient();
      theClient0.setTimeoutMsg("r;m,'$#NHE");
      theClient0.getTimeoutMsg();
      assertTrue(theClient0.getCommunicationLogging());
      assertFalse(theClient0.getTrusted());
  }

  /**
  //Test case number: 1
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      TheClient theClient0 = new TheClient();
      MockSocket mockSocket0 = new MockSocket();
      mockSocket0.close();
      theClient0.setSocket(mockSocket0);
      theClient0.getSocket();
      assertFalse(theClient0.getTrusted());
      assertTrue(theClient0.getCommunicationLogging());
  }

  /**
  //Test case number: 2
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      TheClient theClient0 = new TheClient();
      MockSocket mockSocket0 = new MockSocket();
      mockSocket0.bind((SocketAddress) null);
      theClient0.setSocket(mockSocket0);
      theClient0.getSocket();
      assertTrue(theClient0.getCommunicationLogging());
      assertFalse(theClient0.getTrusted());
  }

  /**
  //Test case number: 3
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      TheClient theClient0 = new TheClient();
      theClient0.setMaxAuthTry(3624);
      int int0 = theClient0.getMaxAuthTry();
      assertEquals(3624, int0);
  }

  /**
  //Test case number: 4
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      TheClient theClient0 = new TheClient();
      theClient0.setTrusted(false);
      assertTrue(theClient0.getCommunicationLogging());
      assertFalse(theClient0.getTrusted());
  }

  /**
  //Test case number: 5
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      TheClient theClient0 = new TheClient();
      theClient0.setTimeoutMsg((String) null);
      assertTrue(theClient0.getCommunicationLogging());
      assertFalse(theClient0.getTrusted());
  }

  /**
  //Test case number: 6
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      TheClient theClient0 = new TheClient();
      theClient0.setTimeout(4227);
      int int0 = theClient0.getTimeout();
      assertEquals(4227, int0);
  }

  /**
  //Test case number: 7
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      TheClient theClient0 = new TheClient();
      theClient0.setTimeout((-2407));
      int int0 = theClient0.getTimeout();
      assertEquals((-2407), int0);
  }

  /**
  //Test case number: 8
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      TheClient theClient0 = new TheClient();
      SocketChannel socketChannel0 = SocketChannel.open();
      theClient0.setSocketChannel(socketChannel0);
      assertTrue(theClient0.getCommunicationLogging());
      assertFalse(theClient0.getTrusted());
  }

  /**
  //Test case number: 9
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      TheClient theClient0 = new TheClient();
      theClient0.setSocket((Socket) null);
      assertTrue(theClient0.getCommunicationLogging());
      assertFalse(theClient0.getTrusted());
  }

  /**
  //Test case number: 10
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      TheClient theClient0 = new TheClient();
      theClient0.setServer((QuickServer) null);
      assertTrue(theClient0.getCommunicationLogging());
      assertFalse(theClient0.getTrusted());
  }

  /**
  //Test case number: 11
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      TheClient theClient0 = new TheClient();
      theClient0.setMaxConnectionMsg((String) null);
      assertTrue(theClient0.getCommunicationLogging());
      assertFalse(theClient0.getTrusted());
  }

  /**
  //Test case number: 12
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      TheClient theClient0 = new TheClient();
      theClient0.setMaxConnectionMsg("no socket");
      theClient0.getMaxConnectionMsg();
      assertTrue(theClient0.getCommunicationLogging());
      assertFalse(theClient0.getTrusted());
  }

  /**
  //Test case number: 13
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      TheClient theClient0 = new TheClient();
      theClient0.setMaxAuthTryMsg((String) null);
      assertFalse(theClient0.getTrusted());
      assertTrue(theClient0.getCommunicationLogging());
  }

  /**
  //Test case number: 14
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      TheClient theClient0 = new TheClient();
      theClient0.setMaxAuthTryMsg("");
      theClient0.getMaxAuthTryMsg();
      assertFalse(theClient0.getTrusted());
      assertTrue(theClient0.getCommunicationLogging());
  }

  /**
  //Test case number: 15
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      TheClient theClient0 = new TheClient();
      theClient0.setMaxAuthTry(0);
      assertFalse(theClient0.getTrusted());
      assertEquals(0, theClient0.getMaxAuthTry());
      assertTrue(theClient0.getCommunicationLogging());
  }

  /**
  //Test case number: 16
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      TheClient theClient0 = new TheClient();
      assertTrue(theClient0.getCommunicationLogging());
      
      theClient0.setCommunicationLogging(false);
      boolean boolean0 = theClient0.getCommunicationLogging();
      assertFalse(boolean0);
  }

  /**
  //Test case number: 17
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      TheClient theClient0 = new TheClient();
      theClient0.setClientEventHandler((ClientEventHandler) null);
      assertTrue(theClient0.getCommunicationLogging());
      assertFalse(theClient0.getTrusted());
  }

  /**
  //Test case number: 18
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      TheClient theClient0 = new TheClient();
      ClientEvent clientEvent0 = ClientEvent.CLOSE_CON;
      theClient0.setClientEvent(clientEvent0);
      assertTrue(theClient0.getCommunicationLogging());
      assertFalse(theClient0.getTrusted());
  }

  /**
  //Test case number: 19
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      TheClient theClient0 = new TheClient();
      Data data0 = new Data();
      theClient0.setClientData(data0);
      theClient0.getClientData();
      assertTrue(theClient0.getCommunicationLogging());
      assertFalse(theClient0.getTrusted());
  }

  /**
  //Test case number: 20
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      TheClient theClient0 = new TheClient();
      CommandHandler commandHandler0 = new CommandHandler();
      theClient0.setClientCommandHandler(commandHandler0);
      theClient0.getClientCommandHandler();
      assertTrue(theClient0.getCommunicationLogging());
      assertFalse(theClient0.getTrusted());
  }

  /**
  //Test case number: 21
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      TheClient theClient0 = new TheClient();
      theClient0.setClientAuthenticationHandler((ClientAuthenticationHandler) null);
      assertTrue(theClient0.getCommunicationLogging());
      assertFalse(theClient0.getTrusted());
  }

  /**
  //Test case number: 22
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      TheClient theClient0 = new TheClient();
      MockSocket mockSocket0 = new MockSocket();
      theClient0.setSocket(mockSocket0);
      String string0 = theClient0.toString();
      assertFalse(theClient0.getTrusted());
      assertEquals("{TheClient Socket[unconnected], Event: (ClientEvent-Run Blocking)}", string0);
      assertTrue(theClient0.getCommunicationLogging());
  }

  /**
  //Test case number: 23
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      TheClient theClient0 = new TheClient();
      String string0 = theClient0.toString();
      assertEquals("{TheClient no socket, Event: (ClientEvent-Run Blocking)}", string0);
      assertFalse(theClient0.getTrusted());
      assertTrue(theClient0.getCommunicationLogging());
  }

  /**
  //Test case number: 24
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      TheClient theClient0 = new TheClient();
      theClient0.getClientObjectHandler();
      assertFalse(theClient0.getTrusted());
      assertTrue(theClient0.getCommunicationLogging());
  }

  /**
  //Test case number: 25
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      TheClient theClient0 = new TheClient();
      theClient0.getMaxAuthTryMsg();
      assertTrue(theClient0.getCommunicationLogging());
      assertFalse(theClient0.getTrusted());
  }

  /**
  //Test case number: 26
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      TheClient theClient0 = new TheClient();
      theClient0.setMaxAuthTry((-3844));
      int int0 = theClient0.getMaxAuthTry();
      assertEquals((-3844), int0);
  }

  /**
  //Test case number: 27
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      TheClient theClient0 = new TheClient();
      theClient0.setClientCommandHandler((ClientCommandHandler) null);
      assertFalse(theClient0.getTrusted());
      assertTrue(theClient0.getCommunicationLogging());
  }

  /**
  //Test case number: 28
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      TheClient theClient0 = new TheClient();
      theClient0.getTimeoutMsg();
      assertFalse(theClient0.getTrusted());
      assertTrue(theClient0.getCommunicationLogging());
  }

  /**
  //Test case number: 29
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      TheClient theClient0 = new TheClient();
      theClient0.setClientBinaryHandler((ClientBinaryHandler) null);
      assertTrue(theClient0.getCommunicationLogging());
      assertFalse(theClient0.getTrusted());
  }

  /**
  //Test case number: 30
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      TheClient theClient0 = new TheClient();
      theClient0.getSocket();
      assertTrue(theClient0.getCommunicationLogging());
      assertFalse(theClient0.getTrusted());
  }

  /**
  //Test case number: 31
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      TheClient theClient0 = new TheClient();
      int int0 = theClient0.getMaxAuthTry();
      assertFalse(theClient0.getTrusted());
      assertEquals(0, int0);
      assertTrue(theClient0.getCommunicationLogging());
  }

  /**
  //Test case number: 32
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      TheClient theClient0 = new TheClient();
      theClient0.setTimeout(0);
      assertFalse(theClient0.getTrusted());
      assertEquals(0, theClient0.getTimeout());
      assertTrue(theClient0.getCommunicationLogging());
  }

  /**
  //Test case number: 33
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      TheClient theClient0 = new TheClient();
      theClient0.setClientObjectHandler((ClientObjectHandler) null);
      assertTrue(theClient0.getCommunicationLogging());
      assertFalse(theClient0.getTrusted());
  }

  /**
  //Test case number: 34
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      TheClient theClient0 = new TheClient();
      theClient0.getServer();
      assertTrue(theClient0.getCommunicationLogging());
      assertFalse(theClient0.getTrusted());
  }

  /**
  //Test case number: 35
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      TheClient theClient0 = new TheClient();
      theClient0.getAuthenticator();
      assertFalse(theClient0.getTrusted());
      assertTrue(theClient0.getCommunicationLogging());
  }

  /**
  //Test case number: 36
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      TheClient theClient0 = new TheClient();
      int int0 = theClient0.getTimeout();
      assertFalse(theClient0.getTrusted());
      assertTrue(theClient0.getCommunicationLogging());
      assertEquals(0, int0);
  }

  /**
  //Test case number: 37
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      TheClient theClient0 = new TheClient();
      theClient0.setMaxAuthTryMsg(";4j'B47OzSn");
      theClient0.getMaxAuthTryMsg();
      assertTrue(theClient0.getCommunicationLogging());
      assertFalse(theClient0.getTrusted());
  }

  /**
  //Test case number: 38
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      TheClient theClient0 = new TheClient();
      theClient0.setMaxConnectionMsg("");
      theClient0.getMaxConnectionMsg();
      assertTrue(theClient0.getCommunicationLogging());
      assertFalse(theClient0.getTrusted());
  }

  /**
  //Test case number: 39
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      TheClient theClient0 = new TheClient();
      theClient0.getClientExtendedEventHandler();
      assertFalse(theClient0.getTrusted());
      assertTrue(theClient0.getCommunicationLogging());
  }

  /**
  //Test case number: 40
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      TheClient theClient0 = new TheClient();
      theClient0.getClientWriteHandler();
      assertTrue(theClient0.getCommunicationLogging());
      assertFalse(theClient0.getTrusted());
  }

  /**
  //Test case number: 41
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      TheClient theClient0 = new TheClient();
      theClient0.getMaxConnectionMsg();
      assertTrue(theClient0.getCommunicationLogging());
      assertFalse(theClient0.getTrusted());
  }

  /**
  //Test case number: 42
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      TheClient theClient0 = new TheClient();
      theClient0.getClientData();
      assertTrue(theClient0.getCommunicationLogging());
      assertFalse(theClient0.getTrusted());
  }

  /**
  //Test case number: 43
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      TheClient theClient0 = new TheClient();
      theClient0.setClientWriteHandler((ClientWriteHandler) null);
      assertFalse(theClient0.getTrusted());
      assertTrue(theClient0.getCommunicationLogging());
  }

  /**
  //Test case number: 44
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      TheClient theClient0 = new TheClient();
      theClient0.getClientEvent();
      assertTrue(theClient0.getCommunicationLogging());
      assertFalse(theClient0.getTrusted());
  }

  /**
  //Test case number: 45
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      TheClient theClient0 = new TheClient();
      theClient0.getClientAuthenticationHandler();
      assertFalse(theClient0.getTrusted());
      assertTrue(theClient0.getCommunicationLogging());
  }

  /**
  //Test case number: 46
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      TheClient theClient0 = new TheClient();
      theClient0.getClientBinaryHandler();
      assertFalse(theClient0.getTrusted());
      assertTrue(theClient0.getCommunicationLogging());
  }

  /**
  //Test case number: 47
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      TheClient theClient0 = new TheClient();
      theClient0.setClientData((ClientData) null);
      assertTrue(theClient0.getCommunicationLogging());
      assertFalse(theClient0.getTrusted());
  }

  /**
  //Test case number: 48
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      TheClient theClient0 = new TheClient();
      theClient0.getClientEventHandler();
      assertTrue(theClient0.getCommunicationLogging());
      assertFalse(theClient0.getTrusted());
  }

  /**
  //Test case number: 49
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      TheClient theClient0 = new TheClient();
      theClient0.setAuthenticator((Authenticator) null);
      assertFalse(theClient0.getTrusted());
      assertTrue(theClient0.getCommunicationLogging());
  }

  /**
  //Test case number: 50
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      TheClient theClient0 = new TheClient();
      theClient0.getSocketChannel();
      assertFalse(theClient0.getTrusted());
      assertTrue(theClient0.getCommunicationLogging());
  }

  /**
  //Test case number: 51
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      TheClient theClient0 = new TheClient();
      theClient0.setSocketChannel((SocketChannel) null);
      assertTrue(theClient0.getCommunicationLogging());
      assertFalse(theClient0.getTrusted());
  }

  /**
  //Test case number: 52
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      TheClient theClient0 = new TheClient();
      theClient0.setCommunicationLogging(true);
      assertFalse(theClient0.getTrusted());
      assertTrue(theClient0.getCommunicationLogging());
  }

  /**
  //Test case number: 53
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      TheClient theClient0 = new TheClient();
      boolean boolean0 = theClient0.getCommunicationLogging();
      assertFalse(theClient0.getTrusted());
      assertTrue(boolean0);
  }

  /**
  //Test case number: 54
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      TheClient theClient0 = new TheClient();
      org.quickserver.net.qsadmin.Authenticator authenticator0 = new org.quickserver.net.qsadmin.Authenticator();
      theClient0.setClientAuthenticationHandler(authenticator0);
      theClient0.getClientAuthenticationHandler();
      assertTrue(theClient0.getCommunicationLogging());
      assertFalse(theClient0.getTrusted());
  }

  /**
  //Test case number: 55
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      TheClient theClient0 = new TheClient();
      theClient0.setTimeoutMsg("");
      theClient0.getTimeoutMsg();
      assertTrue(theClient0.getCommunicationLogging());
      assertFalse(theClient0.getTrusted());
  }

  /**
  //Test case number: 56
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test56()  throws Throwable  {
      TheClient theClient0 = new TheClient();
      QuickServer quickServer0 = new QuickServer();
      theClient0.setServer(quickServer0);
      theClient0.getServer();
      assertFalse(theClient0.getTrusted());
      assertTrue(theClient0.getCommunicationLogging());
  }

  /**
  //Test case number: 57
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test57()  throws Throwable  {
      TheClient theClient0 = new TheClient();
      boolean boolean0 = theClient0.getTrusted();
      assertFalse(boolean0);
      assertTrue(theClient0.getCommunicationLogging());
  }

  /**
  //Test case number: 58
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test58()  throws Throwable  {
      TheClient theClient0 = new TheClient();
      theClient0.setClientExtendedEventHandler((ClientExtendedEventHandler) null);
      assertTrue(theClient0.getCommunicationLogging());
      assertFalse(theClient0.getTrusted());
  }

  /**
  //Test case number: 59
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test59()  throws Throwable  {
      TheClient theClient0 = new TheClient();
      theClient0.getClientCommandHandler();
      assertFalse(theClient0.getTrusted());
      assertTrue(theClient0.getCommunicationLogging());
  }

  /**
  //Test case number: 60
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test60()  throws Throwable  {
      TheClient theClient0 = new TheClient();
      assertFalse(theClient0.getTrusted());
      
      theClient0.setTrusted(true);
      boolean boolean0 = theClient0.getTrusted();
      assertTrue(boolean0);
  }

  /**
  //Test case number: 61
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test61()  throws Throwable  {
      TheClient theClient0 = new TheClient();
      theClient0.setClientEvent((ClientEvent) null);
      theClient0.getClientEvent();
      assertTrue(theClient0.getCommunicationLogging());
      assertFalse(theClient0.getTrusted());
  }

  /**
  //Test case number: 62
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test62()  throws Throwable  {
      TheClient theClient0 = new TheClient();
      DefaultClientEventHandler defaultClientEventHandler0 = new DefaultClientEventHandler();
      theClient0.setClientEventHandler(defaultClientEventHandler0);
      theClient0.getClientEventHandler();
      assertTrue(theClient0.getCommunicationLogging());
      assertFalse(theClient0.getTrusted());
  }
}
