/*
 * This file was automatically generated by EvoSuite
 * Thu Dec 05 17:29:51 GMT 2019
 */

package org.quickserver.util.xmlreader;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.nio.charset.IllegalCharsetNameException;
import java.nio.charset.UnsupportedCharsetException;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.quickserver.util.xmlreader.AdvancedSettings;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class AdvancedSettings_ESTest extends AdvancedSettings_ESTest_scaffolding {

  /**
  //Test case number: 0
  /*Coverage entropy=3.6305437208796447
  */
  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      AdvancedSettings advancedSettings0 = new AdvancedSettings();
      advancedSettings0.setClientIdentifier("");
      advancedSettings0.setMaxThreadsForNioWrite(0);
      advancedSettings0.setUseDirectByteBuffer(false);
      advancedSettings0.setPerformancePreferencesBandwidth(0);
      advancedSettings0.setClientSocketReceiveBufferSize(1);
      advancedSettings0.setSocketLinger(1);
      advancedSettings0.setDebugNonBlockingMode(false);
      advancedSettings0.setQSObjectPoolMaker("</performance-preferences-latency>\n");
      advancedSettings0.getClientIdentifier();
      advancedSettings0.setSocketLinger(0);
      advancedSettings0.setSocketLinger((-486));
      advancedSettings0.getClientSocketReceiveBufferSize();
      advancedSettings0.toXML("</performance-preferences-latency>\n");
      advancedSettings0.toXML("=BpVRp4hb^u");
      int int0 = advancedSettings0.getMaxThreadsForNioWrite();
      assertEquals((-486), advancedSettings0.getSocketLinger());
      assertEquals(0, int0);
  }

  /**
  //Test case number: 1
  /*Coverage entropy=2.425910149055313
  */
  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      AdvancedSettings advancedSettings0 = new AdvancedSettings();
      assertFalse(advancedSettings0.getClientSocketTcpNoDelay());
      
      advancedSettings0.setClientSocketTcpNoDelay(true);
      advancedSettings0.setCharset("");
      advancedSettings0.getDebugNonBlockingMode();
      advancedSettings0.getBacklog();
      advancedSettings0.getBacklog();
      advancedSettings0.getQSObjectPoolMaker();
      advancedSettings0.getClientSocketTcpNoDelay();
      advancedSettings0.getClientSocketSendBufferSize();
      advancedSettings0.getClientIdentifier();
      advancedSettings0.setCharset("");
      advancedSettings0.getClientIdentifier();
      assertTrue(advancedSettings0.getClientSocketTcpNoDelay());
  }

  /**
  //Test case number: 2
  /*Coverage entropy=2.2623477045221723
  */
  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      AdvancedSettings advancedSettings0 = new AdvancedSettings();
      advancedSettings0.setMaxThreadsForNioWrite(752);
      AdvancedSettings advancedSettings1 = new AdvancedSettings();
      advancedSettings1.setPerformancePreferencesBandwidth(2386);
      advancedSettings1.setPerformancePreferencesConnectionTime(29);
      advancedSettings0.getQSObjectPoolMaker();
      advancedSettings1.getUseDirectByteBuffer();
      int int0 = advancedSettings1.getPerformancePreferencesBandwidth();
      assertEquals(29, advancedSettings1.getPerformancePreferencesConnectionTime());
      assertEquals(2386, int0);
  }

  /**
  //Test case number: 3
  /*Coverage entropy=2.6855966703594754
  */
  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      AdvancedSettings advancedSettings0 = new AdvancedSettings();
      advancedSettings0.setSocketLinger((-2635));
      AdvancedSettings advancedSettings1 = new AdvancedSettings();
      advancedSettings1.getQSObjectPoolMaker();
      advancedSettings1.setPerformancePreferencesLatency((-2635));
      advancedSettings1.getQSObjectPoolMaker();
      advancedSettings1.setBacklog((-2635));
      advancedSettings1.setQSObjectPoolMaker("");
      advancedSettings0.setCharset("");
      advancedSettings0.setSocketLinger(0);
      advancedSettings1.setByteBufferSize((-2635));
      advancedSettings1.setClientSocketSendBufferSize(77);
      advancedSettings1.setSocketLinger((-1762));
      advancedSettings1.getPerformancePreferencesLatency();
      advancedSettings1.setSocketLinger(65536);
      advancedSettings1.getQSObjectPoolMaker();
      advancedSettings0.setBacklog(15);
      advancedSettings0.getClientSocketTcpNoDelay();
      advancedSettings0.setClientSocketTrafficClass("9Ssf");
      advancedSettings1.getClientIdentifier();
      advancedSettings0.setBacklog((-1762));
      assertEquals(0, advancedSettings0.getSocketLinger());
  }

  /**
  //Test case number: 4
  /*Coverage entropy=0.4
  */
  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      AdvancedSettings advancedSettings0 = new AdvancedSettings();
      advancedSettings0.setCharset((String) null);
      assertEquals(10, advancedSettings0.getMaxThreadsForNioWrite());
      assertFalse(advancedSettings0.getClientSocketTcpNoDelay());
      assertEquals(0, advancedSettings0.getPerformancePreferencesConnectionTime());
      assertEquals((-1), advancedSettings0.getSocketLinger());
      assertEquals(0, advancedSettings0.getPerformancePreferencesBandwidth());
      assertEquals(0, advancedSettings0.getPerformancePreferencesLatency());
      assertEquals(0, advancedSettings0.getBacklog());
      assertEquals("org.quickserver.net.server.impl.OptimisticClientIdentifier", advancedSettings0.getClientIdentifier());
      assertEquals(65536, advancedSettings0.getByteBufferSize());
      assertEquals("ISO-8859-1", advancedSettings0.getCharset());
      assertTrue(advancedSettings0.getUseDirectByteBuffer());
  }

  /**
  //Test case number: 5
  /*Coverage entropy=2.2654436797543704
  */
  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      AdvancedSettings advancedSettings0 = new AdvancedSettings();
      advancedSettings0.setMaxThreadsForNioWrite((-2462));
      advancedSettings0.setClientSocketReceiveBufferSize((-2462));
      advancedSettings0.setByteBufferSize((-2462));
      advancedSettings0.setDebugNonBlockingMode(true);
      advancedSettings0.setPerformancePreferencesLatency((-2462));
      advancedSettings0.setCharset("");
      advancedSettings0.getDebugNonBlockingMode();
      advancedSettings0.setClientIdentifier("KSsW`PI(H;ZKBB");
      assertEquals((-2462), advancedSettings0.getMaxThreadsForNioWrite());
  }

  /**
  //Test case number: 6
  /*Coverage entropy=2.557702411245053
  */
  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      AdvancedSettings advancedSettings0 = new AdvancedSettings();
      advancedSettings0.setClientSocketTrafficClass("}R[RXApK^2+ft9I^");
      advancedSettings0.setPerformancePreferencesBandwidth(4408);
      advancedSettings0.setPerformancePreferencesBandwidth(4408);
      advancedSettings0.getQSObjectPoolMaker();
      advancedSettings0.setUseDirectByteBuffer(false);
      advancedSettings0.setUseDirectByteBuffer(true);
      advancedSettings0.setDebugNonBlockingMode(false);
      advancedSettings0.setSocketLinger(0);
      advancedSettings0.getUseDirectByteBuffer();
      advancedSettings0.getClientSocketTrafficClass();
      assertEquals(4408, advancedSettings0.getPerformancePreferencesBandwidth());
  }

  /**
  //Test case number: 7
  /*Coverage entropy=1.847832822658352
  */
  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      AdvancedSettings advancedSettings0 = new AdvancedSettings();
      advancedSettings0.setMaxThreadsForNioWrite((-2858));
      advancedSettings0.setCharset("");
      advancedSettings0.getBacklog();
      advancedSettings0.getMaxThreadsForNioWrite();
      advancedSettings0.setClientIdentifier("");
      assertEquals((-2858), advancedSettings0.getMaxThreadsForNioWrite());
  }

  /**
  //Test case number: 8
  /*Coverage entropy=3.2590752087262675
  */
  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      AdvancedSettings advancedSettings0 = new AdvancedSettings();
      String string0 = advancedSettings0.toXML((String) null);
      assertEquals("<advanced-settings>\n\t<charset>ISO-8859-1</charset>\n\t<use-direct-byte-buffer>true</use-direct-byte-buffer>\n\t<byte-buffer-size>65536</byte-buffer-size>\n\t<backlog>0</backlog>\n\t<socket-linger>-1</socket-linger>\n\t<debug-non-blocking-mode>false</debug-non-blocking-mode>\n\t<client-identifier>org.quickserver.net.server.impl.OptimisticClientIdentifier</client-identifier>\n\t<qsobject-pool-maker>org.quickserver.util.pool.MakeQSObjectPool</qsobject-pool-maker>\n\t<max-threads-for-nio-write>10</max-threads-for-nio-write>\n\t<performance-preferences-connection-time>0</performance-preferences-connection-time>\n\t<performance-preferences-latency>0</performance-preferences-latency>\n\t<performance-preferences-bandwidth>0</performance-preferences-bandwidth>\n\t<client-socket-tcp-no-delay>false</client-socket-tcp-no-delay>\n</advanced-settings>\n", string0);
  }

  /**
  //Test case number: 9
  /*Coverage entropy=2.788299378708331
  */
  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      AdvancedSettings advancedSettings0 = new AdvancedSettings();
      advancedSettings0.getClientSocketTcpNoDelay();
      advancedSettings0.setDebugNonBlockingMode(false);
      advancedSettings0.setSocketLinger((-474));
      advancedSettings0.setClientSocketReceiveBufferSize((-474));
      advancedSettings0.setClientSocketSendBufferSize((-474));
      advancedSettings0.getQSObjectPoolMaker();
      advancedSettings0.setPerformancePreferencesLatency((-474));
      advancedSettings0.setPerformancePreferencesLatency(2728);
      advancedSettings0.setPerformancePreferencesLatency(2728);
      advancedSettings0.setSocketLinger(1);
      advancedSettings0.getPerformancePreferencesLatency();
      advancedSettings0.setClientIdentifier("org.quickserver.util.pool.MakeQSObjectPool");
      advancedSettings0.setClientIdentifier("b(4gQ");
      advancedSettings0.getBacklog();
      advancedSettings0.getSocketLinger();
      advancedSettings0.setClientIdentifier("p,>L@w/m");
      assertEquals(2728, advancedSettings0.getPerformancePreferencesLatency());
  }

  /**
  //Test case number: 10
  /*Coverage entropy=2.5594415416798357
  */
  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      AdvancedSettings advancedSettings0 = new AdvancedSettings();
      AdvancedSettings advancedSettings1 = new AdvancedSettings();
      advancedSettings1.setPerformancePreferencesBandwidth((-115));
      advancedSettings0.setSocketLinger((-1));
      advancedSettings1.setClientSocketReceiveBufferSize((-2462));
      advancedSettings0.getBacklog();
      advancedSettings1.getQSObjectPoolMaker();
      advancedSettings1.getClientSocketReceiveBufferSize();
      advancedSettings1.setPerformancePreferencesConnectionTime(802);
      advancedSettings1.setClientIdentifier("");
      assertEquals(802, advancedSettings1.getPerformancePreferencesConnectionTime());
      
      AdvancedSettings advancedSettings2 = new AdvancedSettings();
      advancedSettings2.setDebugNonBlockingMode(false);
      assertFalse(advancedSettings2.getDebugNonBlockingMode());
  }

  /**
  //Test case number: 11
  /*Coverage entropy=2.784066574475527
  */
  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      AdvancedSettings advancedSettings0 = new AdvancedSettings();
      advancedSettings0.setClientSocketTrafficClass("");
      advancedSettings0.setQSObjectPoolMaker("");
      advancedSettings0.setClientSocketReceiveBufferSize(226);
      advancedSettings0.setCharset("");
      advancedSettings0.getDebugNonBlockingMode();
      advancedSettings0.getClientIdentifier();
      advancedSettings0.getClientSocketReceiveBufferSize();
      AdvancedSettings advancedSettings1 = new AdvancedSettings();
      advancedSettings0.setClientIdentifier("p'`vJY");
      advancedSettings0.setDebugNonBlockingMode(true);
      advancedSettings0.getCharset();
      assertEquals("p'`vJY", advancedSettings0.getClientIdentifier());
      
      int int0 = advancedSettings1.getByteBufferSize();
      assertEquals(65536, int0);
  }

  /**
  //Test case number: 12
  /*Coverage entropy=2.4221006252457893
  */
  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      AdvancedSettings advancedSettings0 = new AdvancedSettings();
      advancedSettings0.setUseDirectByteBuffer(false);
      advancedSettings0.setCharset("");
      advancedSettings0.setBacklog(201);
      advancedSettings0.setMaxThreadsForNioWrite((-2615));
      advancedSettings0.setPerformancePreferencesBandwidth(1);
      advancedSettings0.setClientSocketSendBufferSize((-2615));
      advancedSettings0.setPerformancePreferencesConnectionTime((-2615));
      advancedSettings0.getQSObjectPoolMaker();
      int int0 = advancedSettings0.getClientSocketSendBufferSize();
      assertEquals((-2615), advancedSettings0.getPerformancePreferencesConnectionTime());
      assertEquals((-2615), int0);
  }

  /**
  //Test case number: 13
  /*Coverage entropy=3.196939089991099
  */
  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      AdvancedSettings advancedSettings0 = new AdvancedSettings();
      advancedSettings0.setQSObjectPoolMaker("#");
      advancedSettings0.setClientSocketReceiveBufferSize((-2901));
      advancedSettings0.setClientSocketTrafficClass("");
      advancedSettings0.setPerformancePreferencesLatency(65536);
      advancedSettings0.setPerformancePreferencesBandwidth((-2901));
      advancedSettings0.setSocketLinger((-1));
      advancedSettings0.setClientSocketReceiveBufferSize((-2901));
      advancedSettings0.getPerformancePreferencesBandwidth();
      advancedSettings0.setClientIdentifier("");
      advancedSettings0.setBacklog(0);
      advancedSettings0.getCharset();
      advancedSettings0.setUseDirectByteBuffer(true);
      advancedSettings0.setCharset("");
      advancedSettings0.setMaxThreadsForNioWrite((-1));
      advancedSettings0.setPerformancePreferencesBandwidth(1);
      advancedSettings0.setPerformancePreferencesConnectionTime(0);
      advancedSettings0.getQSObjectPoolMaker();
      advancedSettings0.getUseDirectByteBuffer();
      advancedSettings0.getClientSocketSendBufferSize();
      advancedSettings0.getClientIdentifier();
      advancedSettings0.setClientIdentifier("");
      assertEquals(65536, advancedSettings0.getPerformancePreferencesLatency());
  }

  /**
  //Test case number: 14
  /*Coverage entropy=2.881766240540306
  */
  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      AdvancedSettings advancedSettings0 = new AdvancedSettings();
      advancedSettings0.setMaxThreadsForNioWrite((-2892));
      advancedSettings0.setCharset("");
      advancedSettings0.setClientSocketSendBufferSize(15);
      advancedSettings0.getDebugNonBlockingMode();
      advancedSettings0.getBacklog();
      advancedSettings0.setDebugNonBlockingMode(false);
      advancedSettings0.setPerformancePreferencesConnectionTime((-2892));
      advancedSettings0.getQSObjectPoolMaker();
      advancedSettings0.getUseDirectByteBuffer();
      advancedSettings0.getClientSocketSendBufferSize();
      advancedSettings0.getClientIdentifier();
      advancedSettings0.getClientSocketTcpNoDelay();
      advancedSettings0.setClientSocketSendBufferSize((-880));
      advancedSettings0.setCharset("");
      assertEquals((-2892), advancedSettings0.getPerformancePreferencesConnectionTime());
  }

  /**
  //Test case number: 15
  /*Coverage entropy=0.4
  */
  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      AdvancedSettings advancedSettings0 = new AdvancedSettings();
      advancedSettings0.setClientIdentifier((String) null);
      assertTrue(advancedSettings0.getUseDirectByteBuffer());
      assertEquals(65536, advancedSettings0.getByteBufferSize());
      assertEquals(0, advancedSettings0.getPerformancePreferencesLatency());
      assertEquals("ISO-8859-1", advancedSettings0.getCharset());
      assertEquals(0, advancedSettings0.getPerformancePreferencesBandwidth());
      assertEquals(0, advancedSettings0.getBacklog());
      assertEquals("org.quickserver.net.server.impl.OptimisticClientIdentifier", advancedSettings0.getClientIdentifier());
      assertEquals(10, advancedSettings0.getMaxThreadsForNioWrite());
      assertFalse(advancedSettings0.getClientSocketTcpNoDelay());
      assertEquals((-1), advancedSettings0.getSocketLinger());
      assertEquals(0, advancedSettings0.getPerformancePreferencesConnectionTime());
  }

  /**
  //Test case number: 16
  /*Coverage entropy=2.6772245773362195
  */
  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      AdvancedSettings advancedSettings0 = new AdvancedSettings();
      advancedSettings0.setPerformancePreferencesConnectionTime(1);
      advancedSettings0.setClientSocketTrafficClass("");
      advancedSettings0.setQSObjectPoolMaker("% a46|ZSe");
      advancedSettings0.setUseDirectByteBuffer(true);
      advancedSettings0.setPerformancePreferencesBandwidth(4111);
      advancedSettings0.setClientSocketSendBufferSize(1);
      AdvancedSettings advancedSettings1 = new AdvancedSettings();
      advancedSettings1.setPerformancePreferencesConnectionTime(4111);
      advancedSettings0.getClientSocketTrafficClass();
      advancedSettings1.setDebugNonBlockingMode(true);
      // Undeclared exception!
      try { 
        advancedSettings0.setCharset("\t<use-direct-byte-buffer>");
        fail("Expecting exception: IllegalCharsetNameException");
      
      } catch(IllegalCharsetNameException e) {
         //
         // \t<use-direct-byte-buffer>
         //
         verifyException("java.nio.charset.Charset", e);
      }
  }

  /**
  //Test case number: 17
  /*Coverage entropy=2.9687776175299367
  */
  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      AdvancedSettings advancedSettings0 = new AdvancedSettings();
      advancedSettings0.setUseDirectByteBuffer(false);
      advancedSettings0.setQSObjectPoolMaker("*Yqpf]?A6]");
      advancedSettings0.setClientSocketTcpNoDelay(false);
      advancedSettings0.setPerformancePreferencesConnectionTime((-980));
      advancedSettings0.setUseDirectByteBuffer(false);
      advancedSettings0.setPerformancePreferencesLatency((-980));
      advancedSettings0.setSocketLinger(0);
      advancedSettings0.setPerformancePreferencesLatency(0);
      advancedSettings0.getUseDirectByteBuffer();
      advancedSettings0.setSocketLinger(0);
      advancedSettings0.setClientSocketSendBufferSize(0);
      advancedSettings0.getSocketLinger();
      advancedSettings0.getPerformancePreferencesConnectionTime();
      int int0 = advancedSettings0.getClientSocketSendBufferSize();
      assertEquals((-980), advancedSettings0.getPerformancePreferencesConnectionTime());
      assertEquals(0, int0);
  }

  /**
  //Test case number: 18
  /*Coverage entropy=1.1217186091313738
  */
  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      AdvancedSettings advancedSettings0 = new AdvancedSettings();
      int int0 = advancedSettings0.getClientSocketReceiveBufferSize();
      assertEquals(0, int0);
      
      advancedSettings0.setClientIdentifier("");
      assertEquals(0, advancedSettings0.getBacklog());
      assertEquals(0, advancedSettings0.getPerformancePreferencesLatency());
      assertEquals("ISO-8859-1", advancedSettings0.getCharset());
      assertFalse(advancedSettings0.getClientSocketTcpNoDelay());
      assertEquals("org.quickserver.net.server.impl.OptimisticClientIdentifier", advancedSettings0.getClientIdentifier());
      assertEquals(10, advancedSettings0.getMaxThreadsForNioWrite());
      assertEquals((-1), advancedSettings0.getSocketLinger());
      assertEquals(0, advancedSettings0.getPerformancePreferencesBandwidth());
      assertTrue(advancedSettings0.getUseDirectByteBuffer());
      assertEquals(65536, advancedSettings0.getByteBufferSize());
      assertEquals(0, advancedSettings0.getPerformancePreferencesConnectionTime());
  }

  /**
  //Test case number: 19
  /*Coverage entropy=1.0931471805599453
  */
  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      AdvancedSettings advancedSettings0 = new AdvancedSettings();
      advancedSettings0.getClientSocketTrafficClass();
      assertEquals(0, advancedSettings0.getPerformancePreferencesBandwidth());
      assertEquals((-1), advancedSettings0.getSocketLinger());
      assertEquals(10, advancedSettings0.getMaxThreadsForNioWrite());
      assertEquals(0, advancedSettings0.getBacklog());
      assertEquals("org.quickserver.net.server.impl.OptimisticClientIdentifier", advancedSettings0.getClientIdentifier());
      assertEquals("ISO-8859-1", advancedSettings0.getCharset());
      assertEquals(0, advancedSettings0.getPerformancePreferencesLatency());
      assertEquals(65536, advancedSettings0.getByteBufferSize());
      assertTrue(advancedSettings0.getUseDirectByteBuffer());
      assertFalse(advancedSettings0.getClientSocketTcpNoDelay());
      assertEquals(0, advancedSettings0.getPerformancePreferencesConnectionTime());
  }

  /**
  //Test case number: 20
  /*Coverage entropy=3.3210182221049966
  */
  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      AdvancedSettings advancedSettings0 = new AdvancedSettings();
      advancedSettings0.setClientSocketSendBufferSize(1);
      advancedSettings0.toXML("");
      assertEquals(1, advancedSettings0.getClientSocketSendBufferSize());
  }

  /**
  //Test case number: 21
  /*Coverage entropy=3.3210182221049966
  */
  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      AdvancedSettings advancedSettings0 = new AdvancedSettings();
      advancedSettings0.setClientSocketReceiveBufferSize((-2620));
      advancedSettings0.toXML("");
      assertEquals((-2620), advancedSettings0.getClientSocketReceiveBufferSize());
  }

  /**
  //Test case number: 22
  /*Coverage entropy=3.3210182221049966
  */
  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      AdvancedSettings advancedSettings0 = new AdvancedSettings();
      advancedSettings0.setClientSocketTrafficClass("_+f>^~?p!zs^9Urqu");
      advancedSettings0.toXML("UL_E6.t'B^O'LY-K}~");
      assertEquals((-1), advancedSettings0.getSocketLinger());
      assertEquals(0, advancedSettings0.getClientSocketReceiveBufferSize());
      assertEquals("ISO-8859-1", advancedSettings0.getCharset());
      assertEquals("org.quickserver.net.server.impl.OptimisticClientIdentifier", advancedSettings0.getClientIdentifier());
      assertEquals(10, advancedSettings0.getMaxThreadsForNioWrite());
      assertEquals(0, advancedSettings0.getPerformancePreferencesConnectionTime());
      assertEquals(0, advancedSettings0.getPerformancePreferencesBandwidth());
      assertFalse(advancedSettings0.getClientSocketTcpNoDelay());
      assertEquals(0, advancedSettings0.getClientSocketSendBufferSize());
      assertEquals(65536, advancedSettings0.getByteBufferSize());
      assertEquals(0, advancedSettings0.getPerformancePreferencesLatency());
      assertTrue(advancedSettings0.getUseDirectByteBuffer());
      assertEquals(0, advancedSettings0.getBacklog());
  }

  /**
  //Test case number: 23
  /*Coverage entropy=3.2590752087262675
  */
  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      AdvancedSettings advancedSettings0 = new AdvancedSettings();
      String string0 = advancedSettings0.toXML("s");
      assertEquals("s<advanced-settings>\ns\t<charset>ISO-8859-1</charset>\ns\t<use-direct-byte-buffer>true</use-direct-byte-buffer>\ns\t<byte-buffer-size>65536</byte-buffer-size>\ns\t<backlog>0</backlog>\ns\t<socket-linger>-1</socket-linger>\ns\t<debug-non-blocking-mode>false</debug-non-blocking-mode>\ns\t<client-identifier>org.quickserver.net.server.impl.OptimisticClientIdentifier</client-identifier>\ns\t<qsobject-pool-maker>org.quickserver.util.pool.MakeQSObjectPool</qsobject-pool-maker>\ns\t<max-threads-for-nio-write>10</max-threads-for-nio-write>\ns\t<performance-preferences-connection-time>0</performance-preferences-connection-time>\ns\t<performance-preferences-latency>0</performance-preferences-latency>\ns\t<performance-preferences-bandwidth>0</performance-preferences-bandwidth>\ns\t<client-socket-tcp-no-delay>false</client-socket-tcp-no-delay>\ns</advanced-settings>\n", string0);
  }

  /**
  //Test case number: 24
  /*Coverage entropy=1.1217186091313738
  */
  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      AdvancedSettings advancedSettings0 = new AdvancedSettings();
      advancedSettings0.setCharset("");
      int int0 = advancedSettings0.getSocketLinger();
      assertTrue(advancedSettings0.getUseDirectByteBuffer());
      assertEquals(65536, advancedSettings0.getByteBufferSize());
      assertEquals(0, advancedSettings0.getPerformancePreferencesBandwidth());
      assertEquals(0, advancedSettings0.getPerformancePreferencesLatency());
      assertEquals("ISO-8859-1", advancedSettings0.getCharset());
      assertEquals(0, advancedSettings0.getBacklog());
      assertEquals("org.quickserver.net.server.impl.OptimisticClientIdentifier", advancedSettings0.getClientIdentifier());
      assertEquals(10, advancedSettings0.getMaxThreadsForNioWrite());
      assertFalse(advancedSettings0.getClientSocketTcpNoDelay());
      assertEquals((-1), int0);
      assertEquals(0, advancedSettings0.getPerformancePreferencesConnectionTime());
  }

  /**
  //Test case number: 25
  /*Coverage entropy=1.0931471805599453
  */
  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      AdvancedSettings advancedSettings0 = new AdvancedSettings();
      int int0 = advancedSettings0.getPerformancePreferencesBandwidth();
      assertEquals(0, advancedSettings0.getPerformancePreferencesLatency());
      assertEquals(65536, advancedSettings0.getByteBufferSize());
      assertEquals(0, advancedSettings0.getBacklog());
      assertEquals("org.quickserver.net.server.impl.OptimisticClientIdentifier", advancedSettings0.getClientIdentifier());
      assertEquals("ISO-8859-1", advancedSettings0.getCharset());
      assertEquals((-1), advancedSettings0.getSocketLinger());
      assertEquals(0, int0);
      assertEquals(10, advancedSettings0.getMaxThreadsForNioWrite());
      assertTrue(advancedSettings0.getUseDirectByteBuffer());
      assertFalse(advancedSettings0.getClientSocketTcpNoDelay());
      assertEquals(0, advancedSettings0.getPerformancePreferencesConnectionTime());
  }

  /**
  //Test case number: 26
  /*Coverage entropy=1.8408398156653452
  */
  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      AdvancedSettings advancedSettings0 = new AdvancedSettings();
      advancedSettings0.setPerformancePreferencesConnectionTime(65536);
      advancedSettings0.getClientSocketTcpNoDelay();
      advancedSettings0.getPerformancePreferencesConnectionTime();
      boolean boolean0 = advancedSettings0.getClientSocketTcpNoDelay();
      assertEquals(65536, advancedSettings0.getPerformancePreferencesConnectionTime());
      assertFalse(boolean0);
  }

  /**
  //Test case number: 27
  /*Coverage entropy=1.5271837172395382
  */
  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      AdvancedSettings advancedSettings0 = new AdvancedSettings();
      int int0 = advancedSettings0.getMaxThreadsForNioWrite();
      assertEquals(10, int0);
      
      int int1 = advancedSettings0.getPerformancePreferencesConnectionTime();
      assertEquals("org.quickserver.net.server.impl.OptimisticClientIdentifier", advancedSettings0.getClientIdentifier());
      assertEquals(0, advancedSettings0.getBacklog());
      assertEquals(0, advancedSettings0.getPerformancePreferencesLatency());
      assertEquals(65536, advancedSettings0.getByteBufferSize());
      assertEquals(0, advancedSettings0.getPerformancePreferencesBandwidth());
      assertEquals("ISO-8859-1", advancedSettings0.getCharset());
      assertFalse(advancedSettings0.getClientSocketTcpNoDelay());
      assertEquals((-1), advancedSettings0.getSocketLinger());
      assertTrue(advancedSettings0.getUseDirectByteBuffer());
      assertEquals(0, int1);
  }

  /**
  //Test case number: 28
  /*Coverage entropy=0.42857142857142855
  */
  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      AdvancedSettings advancedSettings0 = new AdvancedSettings();
      advancedSettings0.setByteBufferSize(65536);
      String string0 = advancedSettings0.getQSObjectPoolMaker();
      assertEquals(0, advancedSettings0.getPerformancePreferencesBandwidth());
      assertEquals("org.quickserver.util.pool.MakeQSObjectPool", string0);
      assertEquals(0, advancedSettings0.getPerformancePreferencesConnectionTime());
      assertTrue(advancedSettings0.getUseDirectByteBuffer());
      assertNotNull(string0);
      assertEquals(10, advancedSettings0.getMaxThreadsForNioWrite());
      assertFalse(advancedSettings0.getClientSocketTcpNoDelay());
      assertEquals(0, advancedSettings0.getPerformancePreferencesLatency());
      assertEquals(0, advancedSettings0.getBacklog());
      assertEquals(65536, advancedSettings0.getByteBufferSize());
      assertEquals((-1), advancedSettings0.getSocketLinger());
      assertEquals("ISO-8859-1", advancedSettings0.getCharset());
      assertEquals("org.quickserver.net.server.impl.OptimisticClientIdentifier", advancedSettings0.getClientIdentifier());
  }

  /**
  //Test case number: 29
  /*Coverage entropy=1.1217186091313738
  */
  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      AdvancedSettings advancedSettings0 = new AdvancedSettings();
      advancedSettings0.setBacklog(522);
      int int0 = advancedSettings0.getBacklog();
      assertEquals(522, int0);
  }

  /**
  //Test case number: 30
  /*Coverage entropy=2.4241710186205303
  */
  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      AdvancedSettings advancedSettings0 = new AdvancedSettings();
      advancedSettings0.setUseDirectByteBuffer(false);
      advancedSettings0.setCharset("");
      advancedSettings0.setMaxThreadsForNioWrite((-1994));
      advancedSettings0.setPerformancePreferencesBandwidth(0);
      advancedSettings0.setPerformancePreferencesConnectionTime((-4373));
      AdvancedSettings advancedSettings1 = new AdvancedSettings();
      advancedSettings0.getQSObjectPoolMaker();
      advancedSettings0.getUseDirectByteBuffer();
      assertEquals((-1994), advancedSettings0.getMaxThreadsForNioWrite());
      
      AdvancedSettings advancedSettings2 = new AdvancedSettings();
      int int0 = advancedSettings1.getClientSocketSendBufferSize();
      assertEquals(0, int0);
  }

  /**
  //Test case number: 31
  /*Coverage entropy=0.42857142857142855
  */
  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      AdvancedSettings advancedSettings0 = new AdvancedSettings();
      advancedSettings0.setByteBufferSize(0);
      String string0 = advancedSettings0.getQSObjectPoolMaker();
      assertEquals("org.quickserver.util.pool.MakeQSObjectPool", string0);
      assertEquals(0, advancedSettings0.getPerformancePreferencesBandwidth());
      assertTrue(advancedSettings0.getUseDirectByteBuffer());
      assertNotNull(string0);
      assertEquals(10, advancedSettings0.getMaxThreadsForNioWrite());
      assertEquals(0, advancedSettings0.getPerformancePreferencesLatency());
      assertFalse(advancedSettings0.getClientSocketTcpNoDelay());
      assertEquals(0, advancedSettings0.getBacklog());
      assertEquals(65536, advancedSettings0.getByteBufferSize());
      assertEquals((-1), advancedSettings0.getSocketLinger());
      assertEquals("org.quickserver.net.server.impl.OptimisticClientIdentifier", advancedSettings0.getClientIdentifier());
      assertEquals("ISO-8859-1", advancedSettings0.getCharset());
      assertEquals(0, advancedSettings0.getPerformancePreferencesConnectionTime());
  }

  /**
  //Test case number: 32
  /*Coverage entropy=0.4
  */
  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      AdvancedSettings advancedSettings0 = new AdvancedSettings();
      // Undeclared exception!
      try { 
        advancedSettings0.setCharset("a");
        fail("Expecting exception: UnsupportedCharsetException");
      
      } catch(UnsupportedCharsetException e) {
         //
         // a
         //
         verifyException("org.quickserver.util.xmlreader.AdvancedSettings", e);
      }
  }

  /**
  //Test case number: 33
  /*Coverage entropy=0.4
  */
  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      AdvancedSettings advancedSettings0 = new AdvancedSettings();
      advancedSettings0.setBacklog((-1));
      assertEquals(10, advancedSettings0.getMaxThreadsForNioWrite());
      assertFalse(advancedSettings0.getClientSocketTcpNoDelay());
      assertEquals(0, advancedSettings0.getBacklog());
      assertEquals(0, advancedSettings0.getPerformancePreferencesConnectionTime());
      assertEquals("org.quickserver.net.server.impl.OptimisticClientIdentifier", advancedSettings0.getClientIdentifier());
      assertEquals(0, advancedSettings0.getPerformancePreferencesBandwidth());
      assertEquals("ISO-8859-1", advancedSettings0.getCharset());
      assertTrue(advancedSettings0.getUseDirectByteBuffer());
      assertEquals(65536, advancedSettings0.getByteBufferSize());
      assertEquals(0, advancedSettings0.getPerformancePreferencesLatency());
      assertEquals((-1), advancedSettings0.getSocketLinger());
  }

  /**
  //Test case number: 34
  /*Coverage entropy=1.1476926351053998
  */
  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      AdvancedSettings advancedSettings0 = new AdvancedSettings();
      advancedSettings0.getClientSocketSendBufferSize();
      advancedSettings0.setClientIdentifier("");
      advancedSettings0.setClientIdentifier("P1^!dBQLF&DxTRb*");
      advancedSettings0.getQSObjectPoolMaker();
      assertEquals("P1^!dBQLF&DxTRb*", advancedSettings0.getClientIdentifier());
  }

  /**
  //Test case number: 35
  /*Coverage entropy=1.0931471805599453
  */
  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      AdvancedSettings advancedSettings0 = new AdvancedSettings();
      int int0 = advancedSettings0.getPerformancePreferencesLatency();
      assertFalse(advancedSettings0.getClientSocketTcpNoDelay());
      assertEquals(0, advancedSettings0.getPerformancePreferencesConnectionTime());
      assertEquals(10, advancedSettings0.getMaxThreadsForNioWrite());
      assertEquals((-1), advancedSettings0.getSocketLinger());
      assertTrue(advancedSettings0.getUseDirectByteBuffer());
      assertEquals(0, int0);
      assertEquals(65536, advancedSettings0.getByteBufferSize());
      assertEquals(0, advancedSettings0.getBacklog());
      assertEquals("org.quickserver.net.server.impl.OptimisticClientIdentifier", advancedSettings0.getClientIdentifier());
      assertEquals(0, advancedSettings0.getPerformancePreferencesBandwidth());
      assertEquals("ISO-8859-1", advancedSettings0.getCharset());
  }

  /**
  //Test case number: 36
  /*Coverage entropy=0.4
  */
  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      AdvancedSettings advancedSettings0 = new AdvancedSettings();
      advancedSettings0.setByteBufferSize((-1413));
      assertEquals(65536, advancedSettings0.getByteBufferSize());
      assertEquals("ISO-8859-1", advancedSettings0.getCharset());
      assertTrue(advancedSettings0.getUseDirectByteBuffer());
      assertEquals(10, advancedSettings0.getMaxThreadsForNioWrite());
      assertFalse(advancedSettings0.getClientSocketTcpNoDelay());
      assertEquals(0, advancedSettings0.getPerformancePreferencesConnectionTime());
      assertEquals((-1), advancedSettings0.getSocketLinger());
      assertEquals(0, advancedSettings0.getPerformancePreferencesBandwidth());
      assertEquals(0, advancedSettings0.getPerformancePreferencesLatency());
      assertEquals(0, advancedSettings0.getBacklog());
      assertEquals("org.quickserver.net.server.impl.OptimisticClientIdentifier", advancedSettings0.getClientIdentifier());
  }

  /**
  //Test case number: 37
  /*Coverage entropy=1.1217186091313738
  */
  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      AdvancedSettings advancedSettings0 = new AdvancedSettings();
      String string0 = advancedSettings0.getCharset();
      assertEquals("ISO-8859-1", string0);
      
      advancedSettings0.setCharset("ISO-8859-1");
      assertTrue(advancedSettings0.getUseDirectByteBuffer());
      assertEquals(0, advancedSettings0.getPerformancePreferencesBandwidth());
      assertEquals((-1), advancedSettings0.getSocketLinger());
      assertFalse(advancedSettings0.getClientSocketTcpNoDelay());
      assertEquals(10, advancedSettings0.getMaxThreadsForNioWrite());
      assertEquals(0, advancedSettings0.getPerformancePreferencesLatency());
      assertEquals(0, advancedSettings0.getBacklog());
      assertEquals("org.quickserver.net.server.impl.OptimisticClientIdentifier", advancedSettings0.getClientIdentifier());
      assertEquals(65536, advancedSettings0.getByteBufferSize());
      assertEquals(0, advancedSettings0.getPerformancePreferencesConnectionTime());
  }

  /**
  //Test case number: 38
  /*Coverage entropy=0.4
  */
  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      AdvancedSettings advancedSettings0 = new AdvancedSettings();
      // Undeclared exception!
      try { 
        advancedSettings0.setCharset(")H@<FgZ*");
        fail("Expecting exception: IllegalCharsetNameException");
      
      } catch(IllegalCharsetNameException e) {
         //
         // )H@<FgZ*
         //
         verifyException("java.nio.charset.Charset", e);
      }
  }
}
