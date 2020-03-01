/*
 * This file was automatically generated by EvoSuite
 * Fri Dec 06 06:15:55 GMT 2019
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
  /*Coverage entropy=3.490577634378733
  */
  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      AdvancedSettings advancedSettings0 = new AdvancedSettings();
      advancedSettings0.getQSObjectPoolMaker();
      advancedSettings0.getQSObjectPoolMaker();
      advancedSettings0.setDebugNonBlockingMode(true);
      advancedSettings0.toXML(".");
      advancedSettings0.setSocketLinger(2711);
      advancedSettings0.setBacklog((-684));
      advancedSettings0.setPerformancePreferencesConnectionTime((-684));
      advancedSettings0.setClientSocketSendBufferSize((-684));
      advancedSettings0.getByteBufferSize();
      advancedSettings0.getByteBufferSize();
      advancedSettings0.getPerformancePreferencesConnectionTime();
      advancedSettings0.setBacklog((-684));
      advancedSettings0.toXML("");
      // Undeclared exception!
      try { 
        advancedSettings0.setCharset("5g'rwk_Bm!`iWqtm");
        fail("Expecting exception: IllegalCharsetNameException");
      
      } catch(IllegalCharsetNameException e) {
         //
         // 5g'rwk_Bm!`iWqtm
         //
         verifyException("java.nio.charset.Charset", e);
      }
  }

  /**
  //Test case number: 1
  /*Coverage entropy=1.1217186091313738
  */
  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      AdvancedSettings advancedSettings0 = new AdvancedSettings();
      advancedSettings0.setQSObjectPoolMaker("");
      String string0 = advancedSettings0.getQSObjectPoolMaker();
      assertEquals(0, advancedSettings0.getPerformancePreferencesBandwidth());
      assertEquals((-1), advancedSettings0.getSocketLinger());
      assertFalse(advancedSettings0.getClientSocketTcpNoDelay());
      assertTrue(advancedSettings0.getUseDirectByteBuffer());
      assertEquals(0, advancedSettings0.getPerformancePreferencesConnectionTime());
      assertEquals("", string0);
      assertEquals(0, advancedSettings0.getPerformancePreferencesLatency());
      assertEquals(65536, advancedSettings0.getByteBufferSize());
      assertEquals(10, advancedSettings0.getMaxThreadsForNioWrite());
      assertEquals("org.quickserver.net.server.impl.OptimisticClientIdentifier", advancedSettings0.getClientIdentifier());
      assertEquals(0, advancedSettings0.getBacklog());
      assertEquals("ISO-8859-1", advancedSettings0.getCharset());
  }

  /**
  //Test case number: 2
  /*Coverage entropy=2.679983198025875
  */
  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      AdvancedSettings advancedSettings0 = new AdvancedSettings();
      advancedSettings0.setSocketLinger(1588);
      advancedSettings0.setDebugNonBlockingMode(true);
      advancedSettings0.setClientSocketSendBufferSize(0);
      advancedSettings0.setDebugNonBlockingMode(true);
      advancedSettings0.setClientIdentifier("S;|bE");
      advancedSettings0.setClientSocketTcpNoDelay(false);
      advancedSettings0.getQSObjectPoolMaker();
      advancedSettings0.setPerformancePreferencesBandwidth(65536);
      advancedSettings0.getByteBufferSize();
      advancedSettings0.getPerformancePreferencesBandwidth();
      advancedSettings0.getCharset();
      advancedSettings0.setClientIdentifier("");
      // Undeclared exception!
      try { 
        advancedSettings0.setCharset("org.quickserver.util.pool.MakeQSObjectPool");
        fail("Expecting exception: UnsupportedCharsetException");
      
      } catch(UnsupportedCharsetException e) {
         //
         // org.quickserver.util.pool.MakeQSObjectPool
         //
         verifyException("org.quickserver.util.xmlreader.AdvancedSettings", e);
      }
  }

  /**
  //Test case number: 3
  /*Coverage entropy=2.0894379124341005
  */
  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      AdvancedSettings advancedSettings0 = new AdvancedSettings();
      advancedSettings0.setCharset("");
      advancedSettings0.getQSObjectPoolMaker();
      AdvancedSettings advancedSettings1 = new AdvancedSettings();
      advancedSettings1.getQSObjectPoolMaker();
      advancedSettings1.setClientSocketTrafficClass("</charset>\n");
      advancedSettings1.setClientSocketTrafficClass("");
      advancedSettings1.setClientIdentifier("");
      advancedSettings0.setSocketLinger((-1821));
      advancedSettings1.setByteBufferSize((-309));
      advancedSettings0.setPerformancePreferencesBandwidth((-1));
      int int0 = advancedSettings0.getPerformancePreferencesBandwidth();
      assertEquals((-1821), advancedSettings0.getSocketLinger());
      assertEquals((-1), int0);
  }

  /**
  //Test case number: 4
  /*Coverage entropy=2.4273916305367944
  */
  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      AdvancedSettings advancedSettings0 = new AdvancedSettings();
      advancedSettings0.setCharset("");
      advancedSettings0.getQSObjectPoolMaker();
      advancedSettings0.setMaxThreadsForNioWrite((-771));
      advancedSettings0.setSocketLinger(1983);
      advancedSettings0.getQSObjectPoolMaker();
      advancedSettings0.setClientSocketTrafficClass("</charset>\n");
      advancedSettings0.setClientIdentifier("");
      advancedSettings0.setClientSocketSendBufferSize(1983);
      advancedSettings0.setSocketLinger((-684));
      advancedSettings0.getCharset();
      advancedSettings0.getClientSocketTrafficClass();
      advancedSettings0.setClientIdentifier("");
      assertEquals((-771), advancedSettings0.getMaxThreadsForNioWrite());
  }

  /**
  //Test case number: 5
  /*Coverage entropy=2.784066574475527
  */
  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      AdvancedSettings advancedSettings0 = new AdvancedSettings();
      advancedSettings0.setClientSocketTrafficClass("--cA*+68piU?");
      advancedSettings0.setSocketLinger(0);
      advancedSettings0.setByteBufferSize(1426);
      advancedSettings0.setClientSocketTcpNoDelay(false);
      advancedSettings0.setPerformancePreferencesConnectionTime((-1120));
      advancedSettings0.getSocketLinger();
      advancedSettings0.setClientSocketReceiveBufferSize(0);
      advancedSettings0.setPerformancePreferencesLatency(10);
      advancedSettings0.getBacklog();
      advancedSettings0.setBacklog(427);
      advancedSettings0.setMaxThreadsForNioWrite((-620));
      // Undeclared exception!
      try { 
        advancedSettings0.setCharset("<advanced-settings>\n");
        fail("Expecting exception: IllegalCharsetNameException");
      
      } catch(IllegalCharsetNameException e) {
         //
         // <advanced-settings>
         //
         verifyException("java.nio.charset.Charset", e);
      }
  }

  /**
  //Test case number: 6
  /*Coverage entropy=2.6829388630505053
  */
  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      AdvancedSettings advancedSettings0 = new AdvancedSettings();
      advancedSettings0.setClientSocketSendBufferSize(531);
      advancedSettings0.setUseDirectByteBuffer(true);
      advancedSettings0.setClientSocketTcpNoDelay(true);
      advancedSettings0.setMaxThreadsForNioWrite(0);
      advancedSettings0.setClientIdentifier("");
      advancedSettings0.getCharset();
      advancedSettings0.setClientSocketTcpNoDelay(true);
      advancedSettings0.setCharset((String) null);
      advancedSettings0.setCharset((String) null);
      advancedSettings0.getByteBufferSize();
      advancedSettings0.getQSObjectPoolMaker();
      advancedSettings0.getMaxThreadsForNioWrite();
      advancedSettings0.setClientIdentifier("");
      advancedSettings0.getMaxThreadsForNioWrite();
      advancedSettings0.getSocketLinger();
      // Undeclared exception!
      try { 
        advancedSettings0.setCharset("*t]:|c2L");
        fail("Expecting exception: IllegalCharsetNameException");
      
      } catch(IllegalCharsetNameException e) {
         //
         // *t]:|c2L
         //
         verifyException("java.nio.charset.Charset", e);
      }
  }

  /**
  //Test case number: 7
  /*Coverage entropy=2.253297930766516
  */
  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      AdvancedSettings advancedSettings0 = new AdvancedSettings();
      advancedSettings0.setClientSocketReceiveBufferSize(752);
      advancedSettings0.getClientSocketTcpNoDelay();
      advancedSettings0.setClientSocketTcpNoDelay(false);
      advancedSettings0.setDebugNonBlockingMode(true);
      boolean boolean0 = advancedSettings0.getDebugNonBlockingMode();
      assertTrue(boolean0);
  }

  /**
  //Test case number: 8
  /*Coverage entropy=2.560923023161317
  */
  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      AdvancedSettings advancedSettings0 = new AdvancedSettings();
      advancedSettings0.setClientSocketTcpNoDelay(true);
      advancedSettings0.getSocketLinger();
      AdvancedSettings advancedSettings1 = new AdvancedSettings();
      advancedSettings1.setClientIdentifier("");
      advancedSettings1.setCharset((String) null);
      advancedSettings1.getUseDirectByteBuffer();
      advancedSettings0.setPerformancePreferencesBandwidth(1063);
      advancedSettings0.getQSObjectPoolMaker();
      advancedSettings0.setQSObjectPoolMaker("");
      advancedSettings1.setSocketLinger((-1));
      advancedSettings0.getClientSocketTcpNoDelay();
      boolean boolean0 = advancedSettings0.getUseDirectByteBuffer();
      assertEquals(1063, advancedSettings0.getPerformancePreferencesBandwidth());
      assertTrue(boolean0);
  }

  /**
  //Test case number: 9
  /*Coverage entropy=2.419594359581629
  */
  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      AdvancedSettings advancedSettings0 = new AdvancedSettings();
      advancedSettings0.setSocketLinger((-1));
      advancedSettings0.setClientSocketSendBufferSize((-3042));
      advancedSettings0.getClientIdentifier();
      AdvancedSettings advancedSettings1 = new AdvancedSettings();
      advancedSettings1.setBacklog((-1));
      advancedSettings0.getClientSocketSendBufferSize();
      advancedSettings1.setClientSocketTcpNoDelay(false);
      advancedSettings0.getCharset();
      assertEquals((-3042), advancedSettings0.getClientSocketSendBufferSize());
  }

  /**
  //Test case number: 10
  /*Coverage entropy=3.3210182221049966
  */
  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      AdvancedSettings advancedSettings0 = new AdvancedSettings();
      advancedSettings0.setClientSocketReceiveBufferSize((-1740));
      advancedSettings0.toXML("pc,tHS{Ytsh");
      assertEquals((-1740), advancedSettings0.getClientSocketReceiveBufferSize());
  }

  /**
  //Test case number: 11
  /*Coverage entropy=3.2590752087262675
  */
  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      AdvancedSettings advancedSettings0 = new AdvancedSettings();
      String string0 = advancedSettings0.toXML((String) null);
      assertEquals("<advanced-settings>\n\t<charset>ISO-8859-1</charset>\n\t<use-direct-byte-buffer>true</use-direct-byte-buffer>\n\t<byte-buffer-size>65536</byte-buffer-size>\n\t<backlog>0</backlog>\n\t<socket-linger>-1</socket-linger>\n\t<debug-non-blocking-mode>false</debug-non-blocking-mode>\n\t<client-identifier>org.quickserver.net.server.impl.OptimisticClientIdentifier</client-identifier>\n\t<qsobject-pool-maker>org.quickserver.util.pool.MakeQSObjectPool</qsobject-pool-maker>\n\t<max-threads-for-nio-write>10</max-threads-for-nio-write>\n\t<performance-preferences-connection-time>0</performance-preferences-connection-time>\n\t<performance-preferences-latency>0</performance-preferences-latency>\n\t<performance-preferences-bandwidth>0</performance-preferences-bandwidth>\n\t<client-socket-tcp-no-delay>false</client-socket-tcp-no-delay>\n</advanced-settings>\n", string0);
  }

  /**
  //Test case number: 12
  /*Coverage entropy=2.4164983843494308
  */
  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      AdvancedSettings advancedSettings0 = new AdvancedSettings();
      advancedSettings0.setDebugNonBlockingMode(false);
      advancedSettings0.setUseDirectByteBuffer(false);
      advancedSettings0.getClientIdentifier();
      advancedSettings0.setSocketLinger((-2115));
      advancedSettings0.setClientSocketSendBufferSize((-2115));
      advancedSettings0.getUseDirectByteBuffer();
      advancedSettings0.setSocketLinger(831);
      assertEquals((-2115), advancedSettings0.getClientSocketSendBufferSize());
  }

  /**
  //Test case number: 13
  /*Coverage entropy=1.830738805564335
  */
  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      AdvancedSettings advancedSettings0 = new AdvancedSettings();
      advancedSettings0.setClientSocketTcpNoDelay(false);
      advancedSettings0.setClientSocketTrafficClass("");
      advancedSettings0.getClientSocketTrafficClass();
      assertEquals(0, advancedSettings0.getBacklog());
      assertEquals("org.quickserver.net.server.impl.OptimisticClientIdentifier", advancedSettings0.getClientIdentifier());
      assertEquals(0, advancedSettings0.getPerformancePreferencesConnectionTime());
      assertEquals(10, advancedSettings0.getMaxThreadsForNioWrite());
      assertEquals((-1), advancedSettings0.getSocketLinger());
      assertEquals(0, advancedSettings0.getPerformancePreferencesLatency());
      assertTrue(advancedSettings0.getUseDirectByteBuffer());
      assertFalse(advancedSettings0.getClientSocketTcpNoDelay());
      assertEquals(0, advancedSettings0.getPerformancePreferencesBandwidth());
      assertEquals(65536, advancedSettings0.getByteBufferSize());
      assertEquals("ISO-8859-1", advancedSettings0.getCharset());
  }

  /**
  //Test case number: 14
  /*Coverage entropy=3.5872830548620738
  */
  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      AdvancedSettings advancedSettings0 = new AdvancedSettings();
      advancedSettings0.setMaxThreadsForNioWrite(0);
      advancedSettings0.getQSObjectPoolMaker();
      advancedSettings0.setSocketLinger((-2241));
      advancedSettings0.setMaxThreadsForNioWrite((-2241));
      advancedSettings0.toXML("vOaNS{Vl~/G!^");
      advancedSettings0.setPerformancePreferencesConnectionTime(0);
      advancedSettings0.setBacklog((-2241));
      advancedSettings0.setClientSocketTcpNoDelay(true);
      advancedSettings0.toXML("vOaNS{Vl~/G!^");
      advancedSettings0.getSocketLinger();
      advancedSettings0.getDebugNonBlockingMode();
      advancedSettings0.getUseDirectByteBuffer();
      advancedSettings0.getMaxThreadsForNioWrite();
      advancedSettings0.toXML(",78!^75PhW~xZrXj");
      advancedSettings0.setPerformancePreferencesBandwidth(0);
      advancedSettings0.setQSObjectPoolMaker("vOaNS{Vl~/G!^");
      advancedSettings0.getCharset();
      assertEquals((-2241), advancedSettings0.getMaxThreadsForNioWrite());
  }

  /**
  //Test case number: 15
  /*Coverage entropy=3.3210182221049966
  */
  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      AdvancedSettings advancedSettings0 = new AdvancedSettings();
      advancedSettings0.setClientSocketTrafficClass("");
      advancedSettings0.toXML("\t<client-socket-send-buffer-size>");
      assertEquals(65536, advancedSettings0.getByteBufferSize());
      assertEquals("org.quickserver.net.server.impl.OptimisticClientIdentifier", advancedSettings0.getClientIdentifier());
      assertEquals("ISO-8859-1", advancedSettings0.getCharset());
      assertEquals(0, advancedSettings0.getPerformancePreferencesConnectionTime());
      assertFalse(advancedSettings0.getClientSocketTcpNoDelay());
      assertEquals(0, advancedSettings0.getPerformancePreferencesLatency());
      assertEquals(0, advancedSettings0.getClientSocketReceiveBufferSize());
      assertTrue(advancedSettings0.getUseDirectByteBuffer());
      assertEquals(0, advancedSettings0.getClientSocketSendBufferSize());
      assertEquals(0, advancedSettings0.getBacklog());
      assertEquals(0, advancedSettings0.getPerformancePreferencesBandwidth());
      assertEquals(10, advancedSettings0.getMaxThreadsForNioWrite());
      assertEquals((-1), advancedSettings0.getSocketLinger());
  }

  /**
  //Test case number: 16
  /*Coverage entropy=1.1375916250043898
  */
  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      AdvancedSettings advancedSettings0 = new AdvancedSettings();
      advancedSettings0.getCharset();
      advancedSettings0.setCharset("ISO-8859-1");
      // Undeclared exception!
      try { 
        advancedSettings0.setCharset("</debug-non-blocking-mode>\n");
        fail("Expecting exception: IllegalCharsetNameException");
      
      } catch(IllegalCharsetNameException e) {
         //
         // </debug-non-blocking-mode>
         //
         verifyException("java.nio.charset.Charset", e);
      }
  }

  /**
  //Test case number: 17
  /*Coverage entropy=2.063983366979555
  */
  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      AdvancedSettings advancedSettings0 = new AdvancedSettings();
      advancedSettings0.setClientSocketSendBufferSize(4643);
      advancedSettings0.setClientSocketTcpNoDelay(true);
      advancedSettings0.setUseDirectByteBuffer(true);
      int int0 = advancedSettings0.getClientSocketSendBufferSize();
      assertEquals(4643, int0);
  }

  /**
  //Test case number: 18
  /*Coverage entropy=2.425910149055313
  */
  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      AdvancedSettings advancedSettings0 = new AdvancedSettings();
      advancedSettings0.setPerformancePreferencesLatency((-2232));
      advancedSettings0.getQSObjectPoolMaker();
      advancedSettings0.setPerformancePreferencesBandwidth((-2232));
      advancedSettings0.setByteBufferSize(1);
      advancedSettings0.setQSObjectPoolMaker("5f$$7U<01");
      advancedSettings0.setPerformancePreferencesConnectionTime(1);
      advancedSettings0.setClientIdentifier("5f$$7U<01");
      advancedSettings0.getPerformancePreferencesConnectionTime();
      advancedSettings0.getClientIdentifier();
      advancedSettings0.getPerformancePreferencesConnectionTime();
      advancedSettings0.getClientIdentifier();
      assertEquals("5f$$7U<01", advancedSettings0.getClientIdentifier());
  }

  /**
  //Test case number: 19
  /*Coverage entropy=1.8408398156653452
  */
  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      AdvancedSettings advancedSettings0 = new AdvancedSettings();
      advancedSettings0.setSocketLinger(120);
      advancedSettings0.setClientSocketTrafficClass("");
      advancedSettings0.getSocketLinger();
      advancedSettings0.getQSObjectPoolMaker();
      assertEquals(120, advancedSettings0.getSocketLinger());
  }

  /**
  //Test case number: 20
  /*Coverage entropy=3.3210182221049966
  */
  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      AdvancedSettings advancedSettings0 = new AdvancedSettings();
      advancedSettings0.setClientSocketSendBufferSize((-201));
      advancedSettings0.toXML((String) null);
      assertEquals((-201), advancedSettings0.getClientSocketSendBufferSize());
  }

  /**
  //Test case number: 21
  /*Coverage entropy=2.5594415416798357
  */
  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      AdvancedSettings advancedSettings0 = new AdvancedSettings();
      advancedSettings0.getQSObjectPoolMaker();
      advancedSettings0.setClientSocketReceiveBufferSize((-2394));
      advancedSettings0.setClientSocketTcpNoDelay(true);
      advancedSettings0.setClientSocketSendBufferSize((-3106));
      advancedSettings0.getCharset();
      advancedSettings0.setClientSocketTcpNoDelay(false);
      advancedSettings0.getClientSocketReceiveBufferSize();
      advancedSettings0.setClientIdentifier("(S9B+RgJT-9.@.`X");
      advancedSettings0.setPerformancePreferencesLatency((-3106));
      advancedSettings0.setSocketLinger((-1));
      // Undeclared exception!
      try { 
        advancedSettings0.setCharset("vwI ");
        fail("Expecting exception: IllegalCharsetNameException");
      
      } catch(IllegalCharsetNameException e) {
         //
         // vwI 
         //
         verifyException("java.nio.charset.Charset", e);
      }
  }

  /**
  //Test case number: 22
  /*Coverage entropy=2.0831221229604164
  */
  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      AdvancedSettings advancedSettings0 = new AdvancedSettings();
      advancedSettings0.getQSObjectPoolMaker();
      advancedSettings0.setClientSocketReceiveBufferSize(65508);
      advancedSettings0.setPerformancePreferencesLatency(2919);
      advancedSettings0.setClientSocketSendBufferSize(2919);
      advancedSettings0.setByteBufferSize(2432);
      advancedSettings0.getClientSocketReceiveBufferSize();
      advancedSettings0.getQSObjectPoolMaker();
      advancedSettings0.getQSObjectPoolMaker();
      assertEquals(2919, advancedSettings0.getPerformancePreferencesLatency());
  }

  /**
  //Test case number: 23
  /*Coverage entropy=2.2623477045221723
  */
  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      AdvancedSettings advancedSettings0 = new AdvancedSettings();
      advancedSettings0.getQSObjectPoolMaker();
      advancedSettings0.setClientSocketReceiveBufferSize(65508);
      advancedSettings0.setPerformancePreferencesLatency(2919);
      advancedSettings0.setClientSocketSendBufferSize(2919);
      advancedSettings0.setByteBufferSize(2433);
      advancedSettings0.getPerformancePreferencesLatency();
      int int0 = advancedSettings0.getClientSocketReceiveBufferSize();
      assertEquals(2919, advancedSettings0.getClientSocketSendBufferSize());
      assertEquals(65508, int0);
  }

  /**
  //Test case number: 24
  /*Coverage entropy=1.1217186091313738
  */
  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      AdvancedSettings advancedSettings0 = new AdvancedSettings();
      advancedSettings0.setBacklog(7);
      int int0 = advancedSettings0.getBacklog();
      assertEquals(7, int0);
  }

  /**
  //Test case number: 25
  /*Coverage entropy=1.1217186091313738
  */
  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      AdvancedSettings advancedSettings0 = new AdvancedSettings();
      assertFalse(advancedSettings0.getClientSocketTcpNoDelay());
      
      advancedSettings0.setClientSocketTcpNoDelay(true);
      advancedSettings0.setClientIdentifier((String) null);
      assertTrue(advancedSettings0.getClientSocketTcpNoDelay());
  }

  /**
  //Test case number: 26
  /*Coverage entropy=1.830738805564335
  */
  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      AdvancedSettings advancedSettings0 = new AdvancedSettings();
      advancedSettings0.setPerformancePreferencesBandwidth((-53));
      advancedSettings0.setPerformancePreferencesLatency((-53));
      int int0 = advancedSettings0.getPerformancePreferencesLatency();
      assertEquals((-53), int0);
  }

  /**
  //Test case number: 27
  /*Coverage entropy=1.1375916250043898
  */
  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      AdvancedSettings advancedSettings0 = new AdvancedSettings();
      advancedSettings0.setCharset("");
      int int0 = advancedSettings0.getMaxThreadsForNioWrite();
      assertEquals(10, int0);
      
      advancedSettings0.setClientIdentifier("");
      assertFalse(advancedSettings0.getClientSocketTcpNoDelay());
      assertEquals(0, advancedSettings0.getPerformancePreferencesConnectionTime());
      assertEquals((-1), advancedSettings0.getSocketLinger());
      assertTrue(advancedSettings0.getUseDirectByteBuffer());
      assertEquals(0, advancedSettings0.getPerformancePreferencesLatency());
      assertEquals("org.quickserver.net.server.impl.OptimisticClientIdentifier", advancedSettings0.getClientIdentifier());
      assertEquals(0, advancedSettings0.getBacklog());
      assertEquals(65536, advancedSettings0.getByteBufferSize());
      assertEquals("ISO-8859-1", advancedSettings0.getCharset());
      assertEquals(0, advancedSettings0.getPerformancePreferencesBandwidth());
  }

  /**
  //Test case number: 28
  /*Coverage entropy=1.5271837172395382
  */
  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      AdvancedSettings advancedSettings0 = new AdvancedSettings();
      advancedSettings0.getDebugNonBlockingMode();
      int int0 = advancedSettings0.getBacklog();
      assertEquals("org.quickserver.net.server.impl.OptimisticClientIdentifier", advancedSettings0.getClientIdentifier());
      assertEquals(10, advancedSettings0.getMaxThreadsForNioWrite());
      assertEquals("ISO-8859-1", advancedSettings0.getCharset());
      assertEquals(65536, advancedSettings0.getByteBufferSize());
      assertEquals(0, advancedSettings0.getPerformancePreferencesBandwidth());
      assertEquals((-1), advancedSettings0.getSocketLinger());
      assertEquals(0, advancedSettings0.getPerformancePreferencesLatency());
      assertEquals(0, advancedSettings0.getPerformancePreferencesConnectionTime());
      assertEquals(0, int0);
      assertFalse(advancedSettings0.getClientSocketTcpNoDelay());
      assertTrue(advancedSettings0.getUseDirectByteBuffer());
  }

  /**
  //Test case number: 29
  /*Coverage entropy=0.4
  */
  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      AdvancedSettings advancedSettings0 = new AdvancedSettings();
      advancedSettings0.setBacklog(0);
      assertEquals(0, advancedSettings0.getPerformancePreferencesConnectionTime());
      assertFalse(advancedSettings0.getClientSocketTcpNoDelay());
      assertEquals((-1), advancedSettings0.getSocketLinger());
      assertEquals(0, advancedSettings0.getPerformancePreferencesBandwidth());
      assertEquals(65536, advancedSettings0.getByteBufferSize());
      assertEquals("ISO-8859-1", advancedSettings0.getCharset());
      assertTrue(advancedSettings0.getUseDirectByteBuffer());
      assertEquals(0, advancedSettings0.getBacklog());
      assertEquals(0, advancedSettings0.getPerformancePreferencesLatency());
      assertEquals("org.quickserver.net.server.impl.OptimisticClientIdentifier", advancedSettings0.getClientIdentifier());
      assertEquals(10, advancedSettings0.getMaxThreadsForNioWrite());
  }

  /**
  //Test case number: 30
  /*Coverage entropy=1.0931471805599453
  */
  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      AdvancedSettings advancedSettings0 = new AdvancedSettings();
      int int0 = advancedSettings0.getPerformancePreferencesLatency();
      assertTrue(advancedSettings0.getUseDirectByteBuffer());
      assertEquals(65536, advancedSettings0.getByteBufferSize());
      assertEquals(0, int0);
      assertEquals((-1), advancedSettings0.getSocketLinger());
      assertEquals(0, advancedSettings0.getPerformancePreferencesConnectionTime());
      assertFalse(advancedSettings0.getClientSocketTcpNoDelay());
      assertEquals("org.quickserver.net.server.impl.OptimisticClientIdentifier", advancedSettings0.getClientIdentifier());
      assertEquals(0, advancedSettings0.getBacklog());
      assertEquals(10, advancedSettings0.getMaxThreadsForNioWrite());
      assertEquals("ISO-8859-1", advancedSettings0.getCharset());
      assertEquals(0, advancedSettings0.getPerformancePreferencesBandwidth());
  }

  /**
  //Test case number: 31
  /*Coverage entropy=1.0931471805599453
  */
  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      AdvancedSettings advancedSettings0 = new AdvancedSettings();
      int int0 = advancedSettings0.getPerformancePreferencesBandwidth();
      assertTrue(advancedSettings0.getUseDirectByteBuffer());
      assertEquals(65536, advancedSettings0.getByteBufferSize());
      assertEquals((-1), advancedSettings0.getSocketLinger());
      assertEquals(0, advancedSettings0.getPerformancePreferencesConnectionTime());
      assertEquals("org.quickserver.net.server.impl.OptimisticClientIdentifier", advancedSettings0.getClientIdentifier());
      assertEquals(10, advancedSettings0.getMaxThreadsForNioWrite());
      assertEquals(0, int0);
      assertFalse(advancedSettings0.getClientSocketTcpNoDelay());
      assertEquals(0, advancedSettings0.getPerformancePreferencesLatency());
      assertEquals("ISO-8859-1", advancedSettings0.getCharset());
      assertEquals(0, advancedSettings0.getBacklog());
  }

  /**
  //Test case number: 32
  /*Coverage entropy=1.1375916250043898
  */
  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      AdvancedSettings advancedSettings0 = new AdvancedSettings();
      advancedSettings0.setCharset("");
      advancedSettings0.getClientSocketReceiveBufferSize();
      // Undeclared exception!
      try { 
        advancedSettings0.setCharset("gPg");
        fail("Expecting exception: IllegalCharsetNameException");
      
      } catch(IllegalCharsetNameException e) {
         //
         // gPg
         //
         verifyException("java.nio.charset.Charset", e);
      }
  }

  /**
  //Test case number: 33
  /*Coverage entropy=0.42857142857142855
  */
  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      AdvancedSettings advancedSettings0 = new AdvancedSettings();
      advancedSettings0.setByteBufferSize(0);
      advancedSettings0.setCharset("");
      assertTrue(advancedSettings0.getUseDirectByteBuffer());
      assertEquals(65536, advancedSettings0.getByteBufferSize());
      assertEquals("ISO-8859-1", advancedSettings0.getCharset());
      assertEquals(0, advancedSettings0.getPerformancePreferencesBandwidth());
      assertEquals(0, advancedSettings0.getBacklog());
      assertEquals("org.quickserver.net.server.impl.OptimisticClientIdentifier", advancedSettings0.getClientIdentifier());
      assertEquals(10, advancedSettings0.getMaxThreadsForNioWrite());
      assertFalse(advancedSettings0.getClientSocketTcpNoDelay());
      assertEquals(0, advancedSettings0.getPerformancePreferencesLatency());
      assertEquals((-1), advancedSettings0.getSocketLinger());
      assertEquals(0, advancedSettings0.getPerformancePreferencesConnectionTime());
  }

  /**
  //Test case number: 34
  /*Coverage entropy=1.5271837172395382
  */
  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      AdvancedSettings advancedSettings0 = new AdvancedSettings();
      int int0 = advancedSettings0.getPerformancePreferencesConnectionTime();
      int int1 = advancedSettings0.getClientSocketSendBufferSize();
      assertEquals(65536, advancedSettings0.getByteBufferSize());
      assertEquals(0, advancedSettings0.getPerformancePreferencesLatency());
      assertTrue(int1 == int0);
      assertTrue(advancedSettings0.getUseDirectByteBuffer());
      assertEquals((-1), advancedSettings0.getSocketLinger());
      assertFalse(advancedSettings0.getClientSocketTcpNoDelay());
      assertEquals(10, advancedSettings0.getMaxThreadsForNioWrite());
      assertEquals(0, advancedSettings0.getBacklog());
      assertEquals("org.quickserver.net.server.impl.OptimisticClientIdentifier", advancedSettings0.getClientIdentifier());
      assertEquals(0, advancedSettings0.getPerformancePreferencesBandwidth());
      assertEquals("ISO-8859-1", advancedSettings0.getCharset());
      assertEquals(0, int1);
  }

  /**
  //Test case number: 35
  /*Coverage entropy=1.0931471805599453
  */
  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      AdvancedSettings advancedSettings0 = new AdvancedSettings();
      advancedSettings0.getClientSocketTrafficClass();
      assertFalse(advancedSettings0.getClientSocketTcpNoDelay());
      assertEquals(0, advancedSettings0.getPerformancePreferencesConnectionTime());
      assertEquals((-1), advancedSettings0.getSocketLinger());
      assertTrue(advancedSettings0.getUseDirectByteBuffer());
      assertEquals(0, advancedSettings0.getPerformancePreferencesLatency());
      assertEquals(0, advancedSettings0.getBacklog());
      assertEquals("org.quickserver.net.server.impl.OptimisticClientIdentifier", advancedSettings0.getClientIdentifier());
      assertEquals(10, advancedSettings0.getMaxThreadsForNioWrite());
      assertEquals(65536, advancedSettings0.getByteBufferSize());
      assertEquals("ISO-8859-1", advancedSettings0.getCharset());
      assertEquals(0, advancedSettings0.getPerformancePreferencesBandwidth());
  }

  /**
  //Test case number: 36
  /*Coverage entropy=0.4
  */
  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      AdvancedSettings advancedSettings0 = new AdvancedSettings();
      assertEquals(0, advancedSettings0.getBacklog());
      
      advancedSettings0.setBacklog(1);
      assertEquals(1, advancedSettings0.getBacklog());
  }

  /**
  //Test case number: 37
  /*Coverage entropy=0.4
  */
  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      AdvancedSettings advancedSettings0 = new AdvancedSettings();
      // Undeclared exception!
      try { 
        advancedSettings0.setCharset("wTu47D");
        fail("Expecting exception: UnsupportedCharsetException");
      
      } catch(UnsupportedCharsetException e) {
         //
         // wTu47D
         //
         verifyException("org.quickserver.util.xmlreader.AdvancedSettings", e);
      }
  }
}
