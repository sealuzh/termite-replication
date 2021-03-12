/*
 * This file was automatically generated by EvoSuite
 * Mon Nov 09 15:03:25 GMT 2020
 */

package org.quickserver.net.server;

import org.junit.Test;
import static org.junit.Assert.*;
import java.nio.channels.SocketChannel;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.net.MockInetSocketAddress;
import org.evosuite.runtime.mock.java.net.MockSocket;
import org.junit.runner.RunWith;
import org.quickserver.net.qsadmin.CommandHandler;
import org.quickserver.net.qsadmin.Data;
import org.quickserver.net.server.Authenticator;
import org.quickserver.net.server.ClientBinaryHandler;
import org.quickserver.net.server.ClientEvent;
import org.quickserver.net.server.ClientExtendedEventHandler;
import org.quickserver.net.server.ClientObjectHandler;
import org.quickserver.net.server.ClientWriteHandler;
import org.quickserver.net.server.QuickServer;
import org.quickserver.net.server.TheClient;
import org.quickserver.util.xmlreader.QuickServerConfig;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class TheClient_ESTest extends TheClient_ESTest_scaffolding {

  /**
  //Test case number: 0
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      TheClient theClient0 = new TheClient();
      theClient0.setTimeoutMsg("ZQ");
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
      theClient0.setTimeout((-1057));
      int int0 = theClient0.getTimeout();
      assertEquals((-1057), int0);
  }

  /**
  //Test case number: 2
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      TheClient theClient0 = new TheClient();
      MockSocket mockSocket0 = new MockSocket();
      MockInetSocketAddress mockInetSocketAddress0 = new MockInetSocketAddress(0);
      mockSocket0.bind(mockInetSocketAddress0);
      theClient0.setSocket(mockSocket0);
      theClient0.getSocket();
      assertFalse(theClient0.getTrusted());
      assertTrue(theClient0.getCommunicationLogging());
  }

  /**
  //Test case number: 3
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      TheClient theClient0 = new TheClient();
      MockSocket mockSocket0 = new MockSocket();
      theClient0.setSocket(mockSocket0);
      theClient0.getSocket();
      assertFalse(theClient0.getTrusted());
      assertTrue(theClient0.getCommunicationLogging());
  }

  /**
  //Test case number: 4
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      TheClient theClient0 = new TheClient();
      QuickServer quickServer0 = new QuickServer("");
      quickServer0.setRawCommunicationLogging(true);
      theClient0.setServer(quickServer0);
      theClient0.getServer();
      assertTrue(theClient0.getCommunicationLogging());
      assertFalse(theClient0.getTrusted());
  }

  /**
  //Test case number: 5
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      TheClient theClient0 = new TheClient();
      QuickServer quickServer0 = new QuickServer("8#I#++?|ST4QqOH-{*", 1712);
      quickServer0.makeServerSocket();
      theClient0.setServer(quickServer0);
      theClient0.getServer();
      assertTrue(theClient0.getCommunicationLogging());
      assertFalse(theClient0.getTrusted());
  }

  /**
  //Test case number: 6
  /*Coverage entropy=2.833213344056216
  */
  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      TheClient theClient0 = new TheClient();
      QuickServer quickServer0 = new QuickServer("");
      quickServer0.run();
      theClient0.setServer(quickServer0);
      theClient0.getServer();
      assertTrue(theClient0.getCommunicationLogging());
      assertFalse(theClient0.getTrusted());
  }

  /**
  //Test case number: 7
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      TheClient theClient0 = new TheClient();
      QuickServer quickServer0 = new QuickServer("Ep~0x:[,{");
      QuickServerConfig quickServerConfig0 = quickServer0.getConfig();
      quickServer0.initServer(quickServerConfig0);
      theClient0.setServer(quickServer0);
      theClient0.getServer();
      assertTrue(theClient0.getCommunicationLogging());
      assertFalse(theClient0.getTrusted());
  }

  /**
  //Test case number: 8
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      TheClient theClient0 = new TheClient();
      theClient0.setMaxConnectionMsg("x] [zpBMD?6H2H,QK");
      theClient0.getMaxConnectionMsg();
      assertTrue(theClient0.getCommunicationLogging());
      assertFalse(theClient0.getTrusted());
  }

  /**
  //Test case number: 9
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      TheClient theClient0 = new TheClient();
      theClient0.setMaxAuthTryMsg("hc;/8U$\"FgD");
      theClient0.getMaxAuthTryMsg();
      assertFalse(theClient0.getTrusted());
      assertTrue(theClient0.getCommunicationLogging());
  }

  /**
  //Test case number: 10
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      TheClient theClient0 = new TheClient();
      theClient0.setMaxAuthTry(101);
      int int0 = theClient0.getMaxAuthTry();
      assertEquals(101, int0);
  }

  /**
  //Test case number: 11
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      TheClient theClient0 = new TheClient();
      theClient0.setTimeout(920);
      int int0 = theClient0.getTimeout();
      assertEquals(920, int0);
  }

  /**
  //Test case number: 12
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      TheClient theClient0 = new TheClient();
      theClient0.setTimeoutMsg("");
      theClient0.getTimeoutMsg();
      assertFalse(theClient0.getTrusted());
      assertTrue(theClient0.getCommunicationLogging());
  }

  /**
  //Test case number: 13
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      TheClient theClient0 = new TheClient();
      theClient0.setClientWriteHandler((ClientWriteHandler) null);
      assertTrue(theClient0.getCommunicationLogging());
      assertFalse(theClient0.getTrusted());
  }

  /**
  //Test case number: 14
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      TheClient theClient0 = new TheClient();
      theClient0.setMaxConnectionMsg("");
      theClient0.getMaxConnectionMsg();
      assertFalse(theClient0.getTrusted());
      assertTrue(theClient0.getCommunicationLogging());
  }

  /**
  //Test case number: 15
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      TheClient theClient0 = new TheClient();
      org.quickserver.net.qsadmin.Authenticator authenticator0 = new org.quickserver.net.qsadmin.Authenticator();
      theClient0.setClientAuthenticationHandler(authenticator0);
      theClient0.getClientAuthenticationHandler();
      assertFalse(theClient0.getTrusted());
      assertTrue(theClient0.getCommunicationLogging());
  }

  /**
  //Test case number: 16
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      TheClient theClient0 = new TheClient();
      theClient0.setClientExtendedEventHandler((ClientExtendedEventHandler) null);
      assertTrue(theClient0.getCommunicationLogging());
      assertFalse(theClient0.getTrusted());
  }

  /**
  //Test case number: 17
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      TheClient theClient0 = new TheClient();
      theClient0.setClientBinaryHandler((ClientBinaryHandler) null);
      assertFalse(theClient0.getTrusted());
      assertTrue(theClient0.getCommunicationLogging());
  }

  /**
  //Test case number: 18
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      TheClient theClient0 = new TheClient();
      CommandHandler commandHandler0 = new CommandHandler();
      theClient0.setClientCommandHandler(commandHandler0);
      theClient0.getClientCommandHandler();
      assertFalse(theClient0.getTrusted());
      assertTrue(theClient0.getCommunicationLogging());
  }

  /**
  //Test case number: 19
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      TheClient theClient0 = new TheClient();
      theClient0.setAuthenticator((Authenticator) null);
      assertFalse(theClient0.getTrusted());
      assertTrue(theClient0.getCommunicationLogging());
  }

  /**
  //Test case number: 20
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      TheClient theClient0 = new TheClient();
      assertTrue(theClient0.getCommunicationLogging());
      
      theClient0.setCommunicationLogging(false);
      boolean boolean0 = theClient0.getCommunicationLogging();
      assertFalse(boolean0);
  }

  /**
  //Test case number: 21
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      TheClient theClient0 = new TheClient();
      theClient0.setMaxAuthTry((-1551));
      int int0 = theClient0.getMaxAuthTry();
      assertEquals((-1551), int0);
  }

  /**
  //Test case number: 22
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      TheClient theClient0 = new TheClient();
      theClient0.setClientObjectHandler((ClientObjectHandler) null);
      assertTrue(theClient0.getCommunicationLogging());
      assertFalse(theClient0.getTrusted());
  }

  /**
  //Test case number: 23
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      TheClient theClient0 = new TheClient();
      theClient0.setMaxAuthTryMsg("");
      theClient0.getMaxAuthTryMsg();
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
      String string0 = theClient0.toString();
      assertTrue(theClient0.getCommunicationLogging());
      assertEquals("{TheClient no socket, Event: (ClientEvent-Run Blocking)}", string0);
      assertFalse(theClient0.getTrusted());
  }

  /**
  //Test case number: 25
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      TheClient theClient0 = new TheClient();
      theClient0.getClientObjectHandler();
      assertTrue(theClient0.getCommunicationLogging());
      assertFalse(theClient0.getTrusted());
  }

  /**
  //Test case number: 26
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      TheClient theClient0 = new TheClient();
      theClient0.getMaxAuthTryMsg();
      assertTrue(theClient0.getCommunicationLogging());
      assertFalse(theClient0.getTrusted());
  }

  /**
  //Test case number: 27
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      TheClient theClient0 = new TheClient();
      theClient0.getTimeoutMsg();
      assertTrue(theClient0.getCommunicationLogging());
      assertFalse(theClient0.getTrusted());
  }

  /**
  //Test case number: 28
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      TheClient theClient0 = new TheClient();
      theClient0.getSocket();
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
      int int0 = theClient0.getMaxAuthTry();
      assertTrue(theClient0.getCommunicationLogging());
      assertEquals(0, int0);
      assertFalse(theClient0.getTrusted());
  }

  /**
  //Test case number: 30
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      TheClient theClient0 = new TheClient();
      theClient0.getServer();
      assertFalse(theClient0.getTrusted());
      assertTrue(theClient0.getCommunicationLogging());
  }

  /**
  //Test case number: 31
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      TheClient theClient0 = new TheClient();
      theClient0.getAuthenticator();
      assertTrue(theClient0.getCommunicationLogging());
      assertFalse(theClient0.getTrusted());
  }

  /**
  //Test case number: 32
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      TheClient theClient0 = new TheClient();
      int int0 = theClient0.getTimeout();
      assertTrue(theClient0.getCommunicationLogging());
      assertFalse(theClient0.getTrusted());
      assertEquals(0, int0);
  }

  /**
  //Test case number: 33
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      TheClient theClient0 = new TheClient();
      theClient0.getClientExtendedEventHandler();
      assertFalse(theClient0.getTrusted());
      assertTrue(theClient0.getCommunicationLogging());
  }

  /**
  //Test case number: 34
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      TheClient theClient0 = new TheClient();
      theClient0.getClientWriteHandler();
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
      theClient0.getMaxConnectionMsg();
      assertTrue(theClient0.getCommunicationLogging());
      assertFalse(theClient0.getTrusted());
  }

  /**
  //Test case number: 36
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      TheClient theClient0 = new TheClient();
      theClient0.getClientData();
      assertFalse(theClient0.getTrusted());
      assertTrue(theClient0.getCommunicationLogging());
  }

  /**
  //Test case number: 37
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      TheClient theClient0 = new TheClient();
      theClient0.getClientEvent();
      assertTrue(theClient0.getCommunicationLogging());
      assertFalse(theClient0.getTrusted());
  }

  /**
  //Test case number: 38
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      TheClient theClient0 = new TheClient();
      theClient0.getClientAuthenticationHandler();
      assertFalse(theClient0.getTrusted());
      assertTrue(theClient0.getCommunicationLogging());
  }

  /**
  //Test case number: 39
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      TheClient theClient0 = new TheClient();
      theClient0.getClientBinaryHandler();
      assertTrue(theClient0.getCommunicationLogging());
      assertFalse(theClient0.getTrusted());
  }

  /**
  //Test case number: 40
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      TheClient theClient0 = new TheClient();
      Data data0 = new Data();
      theClient0.setClientData(data0);
      theClient0.getClientData();
      assertTrue(theClient0.getCommunicationLogging());
      assertFalse(theClient0.getTrusted());
  }

  /**
  //Test case number: 41
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      TheClient theClient0 = new TheClient();
      MockSocket mockSocket0 = new MockSocket();
      theClient0.setSocket(mockSocket0);
      String string0 = theClient0.toString();
      assertFalse(theClient0.getTrusted());
      assertTrue(theClient0.getCommunicationLogging());
      assertEquals("{TheClient Socket[unconnected], Event: (ClientEvent-Run Blocking)}", string0);
  }

  /**
  //Test case number: 42
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      TheClient theClient0 = new TheClient();
      theClient0.getClientEventHandler();
      assertFalse(theClient0.getTrusted());
      assertTrue(theClient0.getCommunicationLogging());
  }

  /**
  //Test case number: 43
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      TheClient theClient0 = new TheClient();
      theClient0.getSocketChannel();
      assertTrue(theClient0.getCommunicationLogging());
      assertFalse(theClient0.getTrusted());
  }

  /**
  //Test case number: 44
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      TheClient theClient0 = new TheClient();
      theClient0.setSocketChannel((SocketChannel) null);
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
      boolean boolean0 = theClient0.getCommunicationLogging();
      assertTrue(boolean0);
      assertFalse(theClient0.getTrusted());
  }

  /**
  //Test case number: 46
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      TheClient theClient0 = new TheClient();
      boolean boolean0 = theClient0.getTrusted();
      assertFalse(boolean0);
      assertTrue(theClient0.getCommunicationLogging());
  }

  /**
  //Test case number: 47
  /*Coverage entropy=0.6931471805599453
  */
  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      TheClient theClient0 = new TheClient();
      theClient0.getClientCommandHandler();
      assertTrue(theClient0.getCommunicationLogging());
      assertFalse(theClient0.getTrusted());
  }

  /**
  //Test case number: 48
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      TheClient theClient0 = new TheClient();
      assertFalse(theClient0.getTrusted());
      
      theClient0.setTrusted(true);
      boolean boolean0 = theClient0.getTrusted();
      assertTrue(boolean0);
  }

  /**
  //Test case number: 49
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      TheClient theClient0 = new TheClient();
      theClient0.setClientEvent((ClientEvent) null);
      theClient0.getClientEvent();
      assertTrue(theClient0.getCommunicationLogging());
      assertFalse(theClient0.getTrusted());
  }

  /**
  //Test case number: 50
  /*Coverage entropy=1.0986122886681096
  */
  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      TheClient theClient0 = new TheClient();
      CommandHandler commandHandler0 = new CommandHandler();
      theClient0.setClientEventHandler(commandHandler0);
      theClient0.getClientEventHandler();
      assertFalse(theClient0.getTrusted());
      assertTrue(theClient0.getCommunicationLogging());
  }
}
