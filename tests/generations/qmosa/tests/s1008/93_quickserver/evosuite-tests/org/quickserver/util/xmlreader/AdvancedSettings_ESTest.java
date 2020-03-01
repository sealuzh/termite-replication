/*
 * This file was automatically generated by EvoSuite
 * Sat Nov 16 04:13:49 GMT 2019
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
  /*Coverage entropy=1.4942662253853725
  */
  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      AdvancedSettings advancedSettings0 = new AdvancedSettings();
      String string0 = advancedSettings0.getQSObjectPoolMaker();
      assertEquals("org.quickserver.util.pool.MakeQSObjectPool", string0);
      
      advancedSettings0.setQSObjectPoolMaker("");
      advancedSettings0.getQSObjectPoolMaker();
      String string1 = advancedSettings0.getQSObjectPoolMaker();
      assertEquals((-1), advancedSettings0.getSocketLinger());
      assertEquals("ISO-8859-1", advancedSettings0.getCharset());
      assertEquals("", string1);
      assertEquals("org.quickserver.net.server.impl.OptimisticClientIdentifier", advancedSettings0.getClientIdentifier());
      assertEquals(0, advancedSettings0.getPerformancePreferencesConnectionTime());
      assertEquals(10, advancedSettings0.getMaxThreadsForNioWrite());
      assertFalse(advancedSettings0.getClientSocketTcpNoDelay());
      assertTrue(advancedSettings0.getUseDirectByteBuffer());
      assertEquals(65536, advancedSettings0.getByteBufferSize());
      assertEquals(0, advancedSettings0.getPerformancePreferencesLatency());
      assertEquals(0, advancedSettings0.getBacklog());
      assertEquals(0, advancedSettings0.getPerformancePreferencesBandwidth());
  }

  /**
  //Test case number: 1
  /*Coverage entropy=3.582997237049033
  */
  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      AdvancedSettings advancedSettings0 = new AdvancedSettings();
      advancedSettings0.setDebugNonBlockingMode(true);
      advancedSettings0.getClientSocketSendBufferSize();
      advancedSettings0.setClientSocketReceiveBufferSize(382);
      advancedSettings0.setClientSocketTcpNoDelay(true);
      advancedSettings0.setClientSocketSendBufferSize(382);
      AdvancedSettings advancedSettings1 = new AdvancedSettings();
      advancedSettings1.setClientSocketTrafficClass("");
      advancedSettings1.setSocketLinger(1);
      advancedSettings1.getSocketLinger();
      advancedSettings0.getUseDirectByteBuffer();
      AdvancedSettings advancedSettings2 = new AdvancedSettings();
      advancedSettings2.setClientSocketReceiveBufferSize((-47));
      advancedSettings0.getByteBufferSize();
      advancedSettings0.toXML("");
      assertTrue(advancedSettings0.getDebugNonBlockingMode());
  }

  /**
  //Test case number: 2
  /*Coverage entropy=3.4318130310755945
  */
  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      AdvancedSettings advancedSettings0 = new AdvancedSettings();
      advancedSettings0.setClientIdentifier("");
      advancedSettings0.setClientSocketReceiveBufferSize((-434));
      advancedSettings0.setClientSocketReceiveBufferSize(402);
      advancedSettings0.setClientSocketSendBufferSize(1);
      advancedSettings0.getClientSocketSendBufferSize();
      advancedSettings0.toXML("");
      assertEquals(402, advancedSettings0.getClientSocketReceiveBufferSize());
  }

  /**
  //Test case number: 3
  /*Coverage entropy=3.670588309165086
  */
  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      AdvancedSettings advancedSettings0 = new AdvancedSettings();
      advancedSettings0.setClientSocketReceiveBufferSize(1);
      advancedSettings0.setPerformancePreferencesConnectionTime(1);
      advancedSettings0.getByteBufferSize();
      advancedSettings0.setClientSocketReceiveBufferSize(1);
      advancedSettings0.setClientSocketTcpNoDelay(true);
      advancedSettings0.setClientSocketReceiveBufferSize(1);
      advancedSettings0.toXML("");
      advancedSettings0.setSocketLinger(1);
      advancedSettings0.setClientSocketSendBufferSize(1);
      advancedSettings0.setPerformancePreferencesBandwidth(65536);
      advancedSettings0.setClientSocketTrafficClass("</charset>\n");
      advancedSettings0.getPerformancePreferencesBandwidth();
      advancedSettings0.getClientSocketTrafficClass();
      advancedSettings0.setPerformancePreferencesLatency(1172);
      advancedSettings0.setSocketLinger(1015);
      advancedSettings0.setPerformancePreferencesLatency((-528));
      advancedSettings0.getClientSocketTrafficClass();
      advancedSettings0.getPerformancePreferencesLatency();
      advancedSettings0.getClientSocketReceiveBufferSize();
      advancedSettings0.getClientSocketSendBufferSize();
      advancedSettings0.setClientSocketTrafficClass("\t<client-identifier>");
      advancedSettings0.getByteBufferSize();
      advancedSettings0.setClientSocketReceiveBufferSize(65536);
      advancedSettings0.getClientSocketTrafficClass();
      advancedSettings0.getClientSocketTrafficClass();
      advancedSettings0.getByteBufferSize();
      int int0 = advancedSettings0.getBacklog();
      assertEquals(1, advancedSettings0.getClientSocketSendBufferSize());
      assertEquals(0, int0);
  }

  /**
  //Test case number: 4
  /*Coverage entropy=3.658629913327912
  */
  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      AdvancedSettings advancedSettings0 = new AdvancedSettings();
      advancedSettings0.setDebugNonBlockingMode(false);
      advancedSettings0.setClientSocketReceiveBufferSize((-434));
      advancedSettings0.setClientSocketReceiveBufferSize((-434));
      advancedSettings0.setClientSocketSendBufferSize((-47));
      advancedSettings0.setDebugNonBlockingMode(false);
      advancedSettings0.toXML((String) null);
      advancedSettings0.setDebugNonBlockingMode(false);
      advancedSettings0.setClientSocketTcpNoDelay(true);
      advancedSettings0.setClientSocketSendBufferSize(0);
      advancedSettings0.setClientSocketTrafficClass("");
      advancedSettings0.setCharset("");
      advancedSettings0.setPerformancePreferencesConnectionTime(13);
      advancedSettings0.getPerformancePreferencesConnectionTime();
      advancedSettings0.getClientIdentifier();
      advancedSettings0.setClientIdentifier("");
      int int0 = advancedSettings0.getByteBufferSize();
      assertEquals(13, advancedSettings0.getPerformancePreferencesConnectionTime());
      assertEquals(65536, int0);
  }

  /**
  //Test case number: 5
  /*Coverage entropy=0.9909065731902369
  */
  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      AdvancedSettings advancedSettings0 = new AdvancedSettings();
      assertEquals("ISO-8859-1", advancedSettings0.getCharset());
      
      advancedSettings0.setCharset("ISO-8859-1");
      advancedSettings0.setCharset("ISO-8859-1");
      assertTrue(advancedSettings0.getUseDirectByteBuffer());
      assertEquals(65536, advancedSettings0.getByteBufferSize());
      assertEquals(0, advancedSettings0.getPerformancePreferencesConnectionTime());
      assertEquals(10, advancedSettings0.getMaxThreadsForNioWrite());
      assertEquals((-1), advancedSettings0.getSocketLinger());
      assertFalse(advancedSettings0.getClientSocketTcpNoDelay());
      assertEquals(0, advancedSettings0.getPerformancePreferencesLatency());
      assertEquals(0, advancedSettings0.getPerformancePreferencesBandwidth());
      assertEquals("org.quickserver.net.server.impl.OptimisticClientIdentifier", advancedSettings0.getClientIdentifier());
      assertEquals(0, advancedSettings0.getBacklog());
  }

  /**
  //Test case number: 6
  /*Coverage entropy=3.6284153321498667
  */
  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      AdvancedSettings advancedSettings0 = new AdvancedSettings();
      advancedSettings0.setPerformancePreferencesConnectionTime(1);
      advancedSettings0.setClientSocketReceiveBufferSize(1);
      advancedSettings0.getByteBufferSize();
      advancedSettings0.setClientSocketReceiveBufferSize(1);
      advancedSettings0.setClientSocketTcpNoDelay(true);
      advancedSettings0.setClientSocketReceiveBufferSize(1);
      advancedSettings0.setClientSocketSendBufferSize(1);
      advancedSettings0.setPerformancePreferencesBandwidth(65536);
      advancedSettings0.setClientSocketTrafficClass("</charset>\n");
      advancedSettings0.getPerformancePreferencesBandwidth();
      advancedSettings0.getClientSocketTrafficClass();
      advancedSettings0.setPerformancePreferencesLatency(1172);
      advancedSettings0.setPerformancePreferencesLatency((-528));
      advancedSettings0.getClientSocketTrafficClass();
      advancedSettings0.getPerformancePreferencesBandwidth();
      advancedSettings0.getClientSocketReceiveBufferSize();
      advancedSettings0.getClientSocketSendBufferSize();
      advancedSettings0.getByteBufferSize();
      advancedSettings0.setClientSocketReceiveBufferSize(65536);
      advancedSettings0.getClientSocketTrafficClass();
      advancedSettings0.getClientSocketTrafficClass();
      advancedSettings0.getByteBufferSize();
      advancedSettings0.toXML("");
      assertEquals((-528), advancedSettings0.getPerformancePreferencesLatency());
  }

  /**
  //Test case number: 7
  /*Coverage entropy=2.885074759977858
  */
  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      AdvancedSettings advancedSettings0 = new AdvancedSettings();
      advancedSettings0.setClientSocketTcpNoDelay(true);
      advancedSettings0.setPerformancePreferencesBandwidth((-528));
      AdvancedSettings advancedSettings1 = new AdvancedSettings();
      advancedSettings1.setClientSocketTrafficClass("");
      advancedSettings0.getPerformancePreferencesBandwidth();
      advancedSettings0.getClientSocketTrafficClass();
      advancedSettings1.setPerformancePreferencesLatency((-528));
      advancedSettings1.setSocketLinger((-1627));
      advancedSettings0.setPerformancePreferencesLatency((-528));
      advancedSettings0.setClientSocketTcpNoDelay(true);
      advancedSettings1.getClientSocketTrafficClass();
      advancedSettings0.getClientSocketReceiveBufferSize();
      advancedSettings0.getClientSocketReceiveBufferSize();
      advancedSettings1.getClientSocketSendBufferSize();
      advancedSettings1.setClientSocketTrafficClass("");
      advancedSettings1.getByteBufferSize();
      advancedSettings1.getClientSocketTrafficClass();
      advancedSettings1.getClientSocketTrafficClass();
      assertEquals((-1627), advancedSettings1.getSocketLinger());
  }

  /**
  //Test case number: 8
  /*Coverage entropy=2.304960205575741
  */
  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      AdvancedSettings advancedSettings0 = new AdvancedSettings();
      advancedSettings0.setClientIdentifier("Rl3<z(W\u0000t");
      advancedSettings0.setClientSocketTrafficClass("\t<client-socket-tcp-no-delay>");
      String string0 = null;
      advancedSettings0.setClientSocketReceiveBufferSize(402);
      advancedSettings0.setClientSocketSendBufferSize((-34));
      advancedSettings0.setClientIdentifier((String) null);
      advancedSettings0.getClientSocketReceiveBufferSize();
      // Undeclared exception!
      try { 
        advancedSettings0.setCharset("Rl3<z(W\u0000t");
        fail("Expecting exception: IllegalCharsetNameException");
      
      } catch(IllegalCharsetNameException e) {
         //
         // Rl3<z(W\u0000t
         //
         verifyException("java.nio.charset.Charset", e);
      }
  }

  /**
  //Test case number: 9
  /*Coverage entropy=3.6253209809462144
  */
  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      AdvancedSettings advancedSettings0 = new AdvancedSettings();
      advancedSettings0.toXML("VI/i");
      advancedSettings0.setByteBufferSize(1639);
      advancedSettings0.setPerformancePreferencesLatency(0);
      advancedSettings0.setMaxThreadsForNioWrite((-443));
      advancedSettings0.setPerformancePreferencesBandwidth(1639);
      advancedSettings0.getMaxThreadsForNioWrite();
      advancedSettings0.setUseDirectByteBuffer(false);
      advancedSettings0.getUseDirectByteBuffer();
      advancedSettings0.toXML("VI/i<advanced-settings>\nVI/i\t<charset>ISO-8859-1</charset>\nVI/i\t<use-direct-byte-buffer>true</use-direct-byte-buffer>\nVI/i\t<byte-buffer-size>65536</byte-buffer-size>\nVI/i\t<backlog>0</backlog>\nVI/i\t<socket-linger>-1</socket-linger>\nVI/i\t<debug-non-blocking-mode>false</debug-non-blocking-mode>\nVI/i\t<client-identifier>org.quickserver.net.server.impl.OptimisticClientIdentifier</client-identifier>\nVI/i\t<qsobject-pool-maker>org.quickserver.util.pool.MakeQSObjectPool</qsobject-pool-maker>\nVI/i\t<max-threads-for-nio-write>10</max-threads-for-nio-write>\nVI/i\t<performance-preferences-connection-time>0</performance-preferences-connection-time>\nVI/i\t<performance-preferences-latency>0</performance-preferences-latency>\nVI/i\t<performance-preferences-bandwidth>0</performance-preferences-bandwidth>\nVI/i\t<client-socket-tcp-no-delay>false</client-socket-tcp-no-delay>\nVI/i</advanced-settings>\n");
      advancedSettings0.setPerformancePreferencesConnectionTime(397);
      advancedSettings0.getMaxThreadsForNioWrite();
      advancedSettings0.toXML("");
      advancedSettings0.getPerformancePreferencesConnectionTime();
      advancedSettings0.setPerformancePreferencesBandwidth((-443));
      advancedSettings0.getPerformancePreferencesLatency();
      advancedSettings0.setSocketLinger(0);
      advancedSettings0.setPerformancePreferencesLatency((-283));
      advancedSettings0.toXML("B");
      int int0 = advancedSettings0.getByteBufferSize();
      assertEquals((-443), advancedSettings0.getMaxThreadsForNioWrite());
      assertEquals(1639, int0);
  }

  /**
  //Test case number: 10
  /*Coverage entropy=1.8529610277865571
  */
  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      AdvancedSettings advancedSettings0 = new AdvancedSettings();
      advancedSettings0.setClientIdentifier((String) null);
      AdvancedSettings advancedSettings1 = new AdvancedSettings();
      advancedSettings1.setClientSocketReceiveBufferSize(2080);
      advancedSettings1.setClientSocketReceiveBufferSize((-308));
      advancedSettings1.setClientIdentifier((String) null);
      int int0 = advancedSettings1.getClientSocketReceiveBufferSize();
      assertEquals((-308), int0);
  }

  /**
  //Test case number: 11
  /*Coverage entropy=1.0931471805599453
  */
  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      AdvancedSettings advancedSettings0 = new AdvancedSettings();
      int int0 = advancedSettings0.getPerformancePreferencesBandwidth();
      assertEquals("org.quickserver.net.server.impl.OptimisticClientIdentifier", advancedSettings0.getClientIdentifier());
      assertEquals("ISO-8859-1", advancedSettings0.getCharset());
      assertEquals(0, advancedSettings0.getBacklog());
      assertEquals(0, int0);
      assertFalse(advancedSettings0.getClientSocketTcpNoDelay());
      assertEquals(10, advancedSettings0.getMaxThreadsForNioWrite());
      assertTrue(advancedSettings0.getUseDirectByteBuffer());
      assertEquals((-1), advancedSettings0.getSocketLinger());
      assertEquals(0, advancedSettings0.getPerformancePreferencesLatency());
      assertEquals(0, advancedSettings0.getPerformancePreferencesConnectionTime());
      assertEquals(65536, advancedSettings0.getByteBufferSize());
  }

  /**
  //Test case number: 12
  /*Coverage entropy=2.0761045791007673
  */
  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      AdvancedSettings advancedSettings0 = new AdvancedSettings();
      assertFalse(advancedSettings0.getClientSocketTcpNoDelay());
      
      advancedSettings0.setClientSocketTcpNoDelay(true);
      advancedSettings0.getClientSocketTcpNoDelay();
      advancedSettings0.getBacklog();
      advancedSettings0.setClientSocketTcpNoDelay(true);
      advancedSettings0.getClientSocketSendBufferSize();
      int int0 = advancedSettings0.getClientSocketSendBufferSize();
      assertTrue(advancedSettings0.getClientSocketTcpNoDelay());
      assertEquals(0, int0);
  }

  /**
  //Test case number: 13
  /*Coverage entropy=2.881766240540306
  */
  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      AdvancedSettings advancedSettings0 = new AdvancedSettings();
      advancedSettings0.setDebugNonBlockingMode(true);
      advancedSettings0.getClientSocketSendBufferSize();
      advancedSettings0.setClientSocketReceiveBufferSize(382);
      advancedSettings0.setClientSocketTcpNoDelay(true);
      advancedSettings0.setClientSocketSendBufferSize(382);
      AdvancedSettings advancedSettings1 = new AdvancedSettings();
      advancedSettings1.setClientSocketTrafficClass("");
      AdvancedSettings advancedSettings2 = new AdvancedSettings();
      advancedSettings0.setClientSocketSendBufferSize((-2769));
      advancedSettings1.getClientSocketTcpNoDelay();
      advancedSettings2.getClientSocketTcpNoDelay();
      advancedSettings2.getPerformancePreferencesLatency();
      advancedSettings0.getDebugNonBlockingMode();
      advancedSettings0.getClientSocketTrafficClass();
      assertEquals((-2769), advancedSettings0.getClientSocketSendBufferSize());
  }

  /**
  //Test case number: 14
  /*Coverage entropy=3.266952855425168
  */
  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      AdvancedSettings advancedSettings0 = new AdvancedSettings();
      String string0 = advancedSettings0.toXML((String) null);
      assertEquals("<advanced-settings>\n\t<charset>ISO-8859-1</charset>\n\t<use-direct-byte-buffer>true</use-direct-byte-buffer>\n\t<byte-buffer-size>65536</byte-buffer-size>\n\t<backlog>0</backlog>\n\t<socket-linger>-1</socket-linger>\n\t<debug-non-blocking-mode>false</debug-non-blocking-mode>\n\t<client-identifier>org.quickserver.net.server.impl.OptimisticClientIdentifier</client-identifier>\n\t<qsobject-pool-maker>org.quickserver.util.pool.MakeQSObjectPool</qsobject-pool-maker>\n\t<max-threads-for-nio-write>10</max-threads-for-nio-write>\n\t<performance-preferences-connection-time>0</performance-preferences-connection-time>\n\t<performance-preferences-latency>0</performance-preferences-latency>\n\t<performance-preferences-bandwidth>0</performance-preferences-bandwidth>\n\t<client-socket-tcp-no-delay>false</client-socket-tcp-no-delay>\n</advanced-settings>\n", string0);
  }

  /**
  //Test case number: 15
  /*Coverage entropy=2.8331547833861124
  */
  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      AdvancedSettings advancedSettings0 = new AdvancedSettings();
      advancedSettings0.setClientIdentifier("");
      advancedSettings0.setClientSocketReceiveBufferSize((-434));
      advancedSettings0.setPerformancePreferencesConnectionTime((-434));
      advancedSettings0.setDebugNonBlockingMode(false);
      advancedSettings0.getClientIdentifier();
      advancedSettings0.setByteBufferSize((-1070));
      advancedSettings0.setDebugNonBlockingMode(true);
      advancedSettings0.setClientSocketSendBufferSize(0);
      advancedSettings0.setClientSocketSendBufferSize((-1070));
      advancedSettings0.setClientSocketTrafficClass("");
      String string0 = "</byte-buffer-size>\n";
      advancedSettings0.getPerformancePreferencesConnectionTime();
      // Undeclared exception!
      try { 
        advancedSettings0.setCharset("</charset>\n");
        fail("Expecting exception: IllegalCharsetNameException");
      
      } catch(IllegalCharsetNameException e) {
         //
         // </charset>
         //
         verifyException("java.nio.charset.Charset", e);
      }
  }

  /**
  //Test case number: 16
  /*Coverage entropy=1.830738805564335
  */
  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      AdvancedSettings advancedSettings0 = new AdvancedSettings();
      advancedSettings0.setMaxThreadsForNioWrite((-4433));
      advancedSettings0.getMaxThreadsForNioWrite();
      int int0 = advancedSettings0.getBacklog();
      assertEquals((-4433), advancedSettings0.getMaxThreadsForNioWrite());
      assertEquals(0, int0);
  }

  /**
  //Test case number: 17
  /*Coverage entropy=1.830738805564335
  */
  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      AdvancedSettings advancedSettings0 = new AdvancedSettings();
      assertEquals(10, advancedSettings0.getMaxThreadsForNioWrite());
      
      advancedSettings0.setMaxThreadsForNioWrite(0);
      advancedSettings0.getMaxThreadsForNioWrite();
      int int0 = advancedSettings0.getBacklog();
      assertEquals(0, int0);
  }

  /**
  //Test case number: 18
  /*Coverage entropy=3.4372008485926697
  */
  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      AdvancedSettings advancedSettings0 = new AdvancedSettings();
      advancedSettings0.setClientSocketTrafficClass("hhn3a!X_#@\"ZlW]<");
      advancedSettings0.setClientSocketReceiveBufferSize((-434));
      advancedSettings0.setClientSocketReceiveBufferSize(403);
      advancedSettings0.toXML((String) null);
      advancedSettings0.setClientSocketSendBufferSize(1);
      int int0 = advancedSettings0.getClientSocketSendBufferSize();
      assertEquals(403, advancedSettings0.getClientSocketReceiveBufferSize());
      assertEquals(1, int0);
  }

  /**
  //Test case number: 19
  /*Coverage entropy=1.543056733112554
  */
  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      AdvancedSettings advancedSettings0 = new AdvancedSettings();
      advancedSettings0.setByteBufferSize(0);
      advancedSettings0.getByteBufferSize();
      int int0 = advancedSettings0.getByteBufferSize();
      assertEquals(65536, int0);
      assertEquals(0, advancedSettings0.getPerformancePreferencesBandwidth());
      assertEquals(0, advancedSettings0.getPerformancePreferencesConnectionTime());
      assertFalse(advancedSettings0.getClientSocketTcpNoDelay());
      assertEquals(10, advancedSettings0.getMaxThreadsForNioWrite());
      assertTrue(advancedSettings0.getUseDirectByteBuffer());
      assertEquals((-1), advancedSettings0.getSocketLinger());
      assertEquals(0, advancedSettings0.getPerformancePreferencesLatency());
      assertEquals("ISO-8859-1", advancedSettings0.getCharset());
      assertEquals("org.quickserver.net.server.impl.OptimisticClientIdentifier", advancedSettings0.getClientIdentifier());
      assertEquals(0, advancedSettings0.getBacklog());
  }

  /**
  //Test case number: 20
  /*Coverage entropy=1.0650855968662414
  */
  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      AdvancedSettings advancedSettings0 = new AdvancedSettings();
      advancedSettings0.setByteBufferSize((-798));
      advancedSettings0.setByteBufferSize(1691);
      assertEquals(1691, advancedSettings0.getByteBufferSize());
  }

  /**
  //Test case number: 21
  /*Coverage entropy=2.372821413206516
  */
  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      AdvancedSettings advancedSettings0 = new AdvancedSettings();
      advancedSettings0.setClientSocketTrafficClass("hhn3a!X_#@\"ZlW]<");
      advancedSettings0.setClientSocketReceiveBufferSize((-418));
      advancedSettings0.getClientSocketTrafficClass();
      advancedSettings0.setClientSocketSendBufferSize(1);
      advancedSettings0.getClientSocketSendBufferSize();
      // Undeclared exception!
      try { 
        advancedSettings0.setCharset("");
        fail("Expecting exception: IllegalCharsetNameException");
      
      } catch(IllegalCharsetNameException e) {
         //
         // 
         //
         verifyException("java.nio.charset.Charset", e);
      }
  }

  /**
  //Test case number: 22
  /*Coverage entropy=1.5271837172395382
  */
  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      AdvancedSettings advancedSettings0 = new AdvancedSettings();
      advancedSettings0.setBacklog(4);
      int int0 = advancedSettings0.getBacklog();
      assertEquals(4, int0);
  }

  /**
  //Test case number: 23
  /*Coverage entropy=1.0931471805599453
  */
  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      AdvancedSettings advancedSettings0 = new AdvancedSettings();
      advancedSettings0.setBacklog(0);
      assertEquals((-1), advancedSettings0.getSocketLinger());
      assertEquals(0, advancedSettings0.getPerformancePreferencesConnectionTime());
      assertEquals(10, advancedSettings0.getMaxThreadsForNioWrite());
      assertFalse(advancedSettings0.getClientSocketTcpNoDelay());
      assertTrue(advancedSettings0.getUseDirectByteBuffer());
      assertEquals(0, advancedSettings0.getPerformancePreferencesLatency());
      assertEquals(65536, advancedSettings0.getByteBufferSize());
      assertEquals(0, advancedSettings0.getBacklog());
      assertEquals("org.quickserver.net.server.impl.OptimisticClientIdentifier", advancedSettings0.getClientIdentifier());
      assertEquals(0, advancedSettings0.getPerformancePreferencesBandwidth());
      assertEquals("ISO-8859-1", advancedSettings0.getCharset());
  }

  /**
  //Test case number: 24
  /*Coverage entropy=1.0650855968662414
  */
  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      AdvancedSettings advancedSettings0 = new AdvancedSettings();
      advancedSettings0.setBacklog((-411));
      advancedSettings0.setBacklog(10);
      assertEquals(10, advancedSettings0.getBacklog());
  }

  /**
  //Test case number: 25
  /*Coverage entropy=1.0931471805599453
  */
  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      AdvancedSettings advancedSettings0 = new AdvancedSettings();
      int int0 = advancedSettings0.getSocketLinger();
      assertEquals(0, advancedSettings0.getPerformancePreferencesLatency());
      assertEquals(65536, advancedSettings0.getByteBufferSize());
      assertEquals("org.quickserver.net.server.impl.OptimisticClientIdentifier", advancedSettings0.getClientIdentifier());
      assertEquals(0, advancedSettings0.getBacklog());
      assertEquals(0, advancedSettings0.getPerformancePreferencesBandwidth());
      assertEquals("ISO-8859-1", advancedSettings0.getCharset());
      assertEquals(0, advancedSettings0.getPerformancePreferencesConnectionTime());
      assertEquals(10, advancedSettings0.getMaxThreadsForNioWrite());
      assertEquals((-1), int0);
      assertFalse(advancedSettings0.getClientSocketTcpNoDelay());
      assertTrue(advancedSettings0.getUseDirectByteBuffer());
  }

  /**
  //Test case number: 26
  /*Coverage entropy=2.6454371383635378
  */
  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      AdvancedSettings advancedSettings0 = new AdvancedSettings();
      advancedSettings0.getClientSocketSendBufferSize();
      advancedSettings0.setClientSocketTcpNoDelay(true);
      advancedSettings0.setClientSocketSendBufferSize((-1));
      AdvancedSettings advancedSettings1 = new AdvancedSettings();
      advancedSettings1.setSocketLinger(0);
      advancedSettings1.setClientSocketTrafficClass("");
      AdvancedSettings advancedSettings2 = new AdvancedSettings();
      advancedSettings0.setClientSocketSendBufferSize(0);
      advancedSettings1.getSocketLinger();
      advancedSettings2.setClientSocketSendBufferSize(382);
      advancedSettings0.setClientSocketReceiveBufferSize(382);
      assertEquals(382, advancedSettings0.getClientSocketReceiveBufferSize());
      
      advancedSettings1.setCharset("");
      assertEquals(65536, advancedSettings1.getByteBufferSize());
  }

  /**
  //Test case number: 27
  /*Coverage entropy=0.9289738521096165
  */
  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      AdvancedSettings advancedSettings0 = new AdvancedSettings();
      advancedSettings0.setCharset((String) null);
      // Undeclared exception!
      try { 
        advancedSettings0.setCharset("org.quickserver.util.pool.MaeQSObjectPool");
        fail("Expecting exception: UnsupportedCharsetException");
      
      } catch(UnsupportedCharsetException e) {
         //
         // org.quickserver.util.pool.MaeQSObjectPool
         //
         verifyException("org.quickserver.util.xmlreader.AdvancedSettings", e);
      }
  }

  /**
  //Test case number: 28
  /*Coverage entropy=1.543056733112554
  */
  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      AdvancedSettings advancedSettings0 = new AdvancedSettings();
      advancedSettings0.setClientSocketSendBufferSize((-4));
      advancedSettings0.setClientSocketSendBufferSize((-4));
      int int0 = advancedSettings0.getClientSocketSendBufferSize();
      assertEquals((-4), int0);
  }

  /**
  //Test case number: 29
  /*Coverage entropy=1.786724494755577
  */
  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      AdvancedSettings advancedSettings0 = new AdvancedSettings();
      advancedSettings0.setPerformancePreferencesLatency(1197);
      advancedSettings0.setPerformancePreferencesLatency(1901);
      advancedSettings0.getPerformancePreferencesLatency();
      // Undeclared exception!
      try { 
        advancedSettings0.setCharset(".`raFE0[,=");
        fail("Expecting exception: IllegalCharsetNameException");
      
      } catch(IllegalCharsetNameException e) {
         //
         // .`raFE0[,=
         //
         verifyException("java.nio.charset.Charset", e);
      }
  }

  /**
  //Test case number: 30
  /*Coverage entropy=1.0931471805599453
  */
  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      AdvancedSettings advancedSettings0 = new AdvancedSettings();
      int int0 = advancedSettings0.getMaxThreadsForNioWrite();
      assertEquals("ISO-8859-1", advancedSettings0.getCharset());
      assertEquals(65536, advancedSettings0.getByteBufferSize());
      assertEquals(0, advancedSettings0.getPerformancePreferencesLatency());
      assertEquals(10, int0);
      assertFalse(advancedSettings0.getClientSocketTcpNoDelay());
      assertEquals((-1), advancedSettings0.getSocketLinger());
      assertTrue(advancedSettings0.getUseDirectByteBuffer());
      assertEquals(0, advancedSettings0.getPerformancePreferencesConnectionTime());
      assertEquals(0, advancedSettings0.getBacklog());
      assertEquals("org.quickserver.net.server.impl.OptimisticClientIdentifier", advancedSettings0.getClientIdentifier());
      assertEquals(0, advancedSettings0.getPerformancePreferencesBandwidth());
  }

  /**
  //Test case number: 31
  /*Coverage entropy=1.0931471805599453
  */
  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      AdvancedSettings advancedSettings0 = new AdvancedSettings();
      advancedSettings0.getDebugNonBlockingMode();
      assertEquals("org.quickserver.net.server.impl.OptimisticClientIdentifier", advancedSettings0.getClientIdentifier());
      assertEquals(0, advancedSettings0.getBacklog());
      assertFalse(advancedSettings0.getClientSocketTcpNoDelay());
      assertEquals(0, advancedSettings0.getPerformancePreferencesConnectionTime());
      assertEquals(65536, advancedSettings0.getByteBufferSize());
      assertEquals(0, advancedSettings0.getPerformancePreferencesBandwidth());
      assertTrue(advancedSettings0.getUseDirectByteBuffer());
      assertEquals((-1), advancedSettings0.getSocketLinger());
      assertEquals("ISO-8859-1", advancedSettings0.getCharset());
      assertEquals(0, advancedSettings0.getPerformancePreferencesLatency());
      assertEquals(10, advancedSettings0.getMaxThreadsForNioWrite());
  }

  /**
  //Test case number: 32
  /*Coverage entropy=1.5271837172395382
  */
  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      AdvancedSettings advancedSettings0 = new AdvancedSettings();
      advancedSettings0.setPerformancePreferencesConnectionTime(0);
      int int0 = advancedSettings0.getPerformancePreferencesConnectionTime();
      assertEquals(0, advancedSettings0.getBacklog());
      assertFalse(advancedSettings0.getClientSocketTcpNoDelay());
      assertEquals(0, advancedSettings0.getPerformancePreferencesLatency());
      assertEquals(65536, advancedSettings0.getByteBufferSize());
      assertTrue(advancedSettings0.getUseDirectByteBuffer());
      assertEquals(0, advancedSettings0.getPerformancePreferencesBandwidth());
      assertEquals((-1), advancedSettings0.getSocketLinger());
      assertEquals("ISO-8859-1", advancedSettings0.getCharset());
      assertEquals(10, advancedSettings0.getMaxThreadsForNioWrite());
      assertEquals("org.quickserver.net.server.impl.OptimisticClientIdentifier", advancedSettings0.getClientIdentifier());
      assertEquals(0, int0);
  }

  /**
  //Test case number: 33
  /*Coverage entropy=2.754627133386218
  */
  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      AdvancedSettings advancedSettings0 = new AdvancedSettings();
      advancedSettings0.getClientSocketSendBufferSize();
      advancedSettings0.setClientSocketReceiveBufferSize(382);
      advancedSettings0.setClientSocketTcpNoDelay(true);
      advancedSettings0.setClientSocketSendBufferSize(0);
      advancedSettings0.setClientSocketTrafficClass("");
      advancedSettings0.setClientSocketSendBufferSize(0);
      advancedSettings0.getByteBufferSize();
      advancedSettings0.getUseDirectByteBuffer();
      AdvancedSettings advancedSettings1 = new AdvancedSettings();
      advancedSettings1.setClientSocketTcpNoDelay(true);
      advancedSettings0.setClientSocketReceiveBufferSize(382);
      advancedSettings0.setCharset("");
      advancedSettings0.getClientIdentifier();
      assertEquals(382, advancedSettings0.getClientSocketReceiveBufferSize());
  }

  /**
  //Test case number: 34
  /*Coverage entropy=1.0931471805599453
  */
  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      AdvancedSettings advancedSettings0 = new AdvancedSettings();
      String string0 = advancedSettings0.getCharset();
      assertTrue(advancedSettings0.getUseDirectByteBuffer());
      assertEquals(0, advancedSettings0.getPerformancePreferencesBandwidth());
      assertEquals(0, advancedSettings0.getPerformancePreferencesConnectionTime());
      assertEquals(65536, advancedSettings0.getByteBufferSize());
      assertEquals("ISO-8859-1", string0);
      assertEquals(0, advancedSettings0.getBacklog());
      assertEquals("org.quickserver.net.server.impl.OptimisticClientIdentifier", advancedSettings0.getClientIdentifier());
      assertEquals((-1), advancedSettings0.getSocketLinger());
      assertEquals(10, advancedSettings0.getMaxThreadsForNioWrite());
      assertFalse(advancedSettings0.getClientSocketTcpNoDelay());
      assertEquals(0, advancedSettings0.getPerformancePreferencesLatency());
  }
}
