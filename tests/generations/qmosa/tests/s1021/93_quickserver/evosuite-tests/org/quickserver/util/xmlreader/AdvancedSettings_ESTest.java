/*
 * This file was automatically generated by EvoSuite
 * Tue Nov 19 02:46:12 GMT 2019
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
  /*Coverage entropy=2.022248870579868
  */
  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      AdvancedSettings advancedSettings0 = new AdvancedSettings();
      advancedSettings0.setPerformancePreferencesBandwidth((-4046));
      advancedSettings0.getClientIdentifier();
      advancedSettings0.setClientIdentifier("");
      advancedSettings0.getPerformancePreferencesBandwidth();
      advancedSettings0.getClientIdentifier();
      assertEquals((-4046), advancedSettings0.getPerformancePreferencesBandwidth());
  }

  /**
  //Test case number: 1
  /*Coverage entropy=3.438808048849822
  */
  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      AdvancedSettings advancedSettings0 = new AdvancedSettings();
      advancedSettings0.setPerformancePreferencesConnectionTime((-1951));
      advancedSettings0.setPerformancePreferencesLatency(10);
      advancedSettings0.setPerformancePreferencesConnectionTime(10);
      advancedSettings0.setPerformancePreferencesBandwidth((-1267));
      advancedSettings0.getByteBufferSize();
      advancedSettings0.setPerformancePreferencesLatency(10);
      advancedSettings0.setPerformancePreferencesLatency((-739));
      advancedSettings0.setPerformancePreferencesBandwidth((-1100));
      advancedSettings0.getMaxThreadsForNioWrite();
      advancedSettings0.getPerformancePreferencesConnectionTime();
      advancedSettings0.toXML("IfIQ92)m9{ 'TFG");
      advancedSettings0.getCharset();
      int int0 = advancedSettings0.getBacklog();
      assertEquals((-739), advancedSettings0.getPerformancePreferencesLatency());
      assertEquals(0, int0);
  }

  /**
  //Test case number: 2
  /*Coverage entropy=3.027215791000468
  */
  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      AdvancedSettings advancedSettings0 = new AdvancedSettings();
      advancedSettings0.setSocketLinger((-1));
      advancedSettings0.getClientSocketReceiveBufferSize();
      advancedSettings0.setClientSocketReceiveBufferSize(0);
      advancedSettings0.setPerformancePreferencesLatency((-1));
      advancedSettings0.getSocketLinger();
      advancedSettings0.setClientSocketTrafficClass("=k$$@Y_gNG=$a>NoF");
      advancedSettings0.setQSObjectPoolMaker("=k$$@Y_gNG=$a>NoF");
      advancedSettings0.setClientSocketTrafficClass("");
      advancedSettings0.getClientSocketReceiveBufferSize();
      advancedSettings0.setClientSocketReceiveBufferSize((-1));
      advancedSettings0.getPerformancePreferencesLatency();
      advancedSettings0.getClientSocketSendBufferSize();
      advancedSettings0.getPerformancePreferencesLatency();
      advancedSettings0.setClientSocketTcpNoDelay(false);
      advancedSettings0.setClientSocketReceiveBufferSize(28);
      advancedSettings0.setSocketLinger((-1644));
      advancedSettings0.getClientIdentifier();
      advancedSettings0.setClientIdentifier("=k$$@Y_gNG=$a>NoF");
      assertEquals("=k$$@Y_gNG=$a>NoF", advancedSettings0.getClientIdentifier());
  }

  /**
  //Test case number: 3
  /*Coverage entropy=2.5825339255764295
  */
  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      AdvancedSettings advancedSettings0 = new AdvancedSettings();
      advancedSettings0.setClientSocketTrafficClass("fGck\"gd-y(1:dKAj");
      advancedSettings0.setCharset("");
      advancedSettings0.setClientSocketSendBufferSize(0);
      advancedSettings0.getClientSocketTrafficClass();
      advancedSettings0.setClientSocketReceiveBufferSize(0);
      advancedSettings0.setClientIdentifier("");
      advancedSettings0.setClientSocketReceiveBufferSize(391);
      advancedSettings0.getClientIdentifier();
      advancedSettings0.setClientIdentifier("fGck\"gd-y(1:dKAj");
      advancedSettings0.getClientSocketReceiveBufferSize();
      advancedSettings0.setClientSocketTrafficClass((String) null);
      advancedSettings0.getClientIdentifier();
      advancedSettings0.getClientSocketTrafficClass();
      AdvancedSettings advancedSettings1 = new AdvancedSettings();
      AdvancedSettings advancedSettings2 = new AdvancedSettings();
      advancedSettings2.setClientIdentifier("");
      advancedSettings0.setClientSocketReceiveBufferSize(391);
      advancedSettings1.getClientIdentifier();
      advancedSettings2.setClientIdentifier("T/|'+sXz");
      assertEquals("T/|'+sXz", advancedSettings2.getClientIdentifier());
  }

  /**
  //Test case number: 4
  /*Coverage entropy=1.830738805564335
  */
  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      AdvancedSettings advancedSettings0 = new AdvancedSettings();
      advancedSettings0.setMaxThreadsForNioWrite(336);
      advancedSettings0.setSocketLinger(336);
      int int0 = advancedSettings0.getSocketLinger();
      assertEquals(336, advancedSettings0.getMaxThreadsForNioWrite());
      assertEquals(336, int0);
  }

  /**
  //Test case number: 5
  /*Coverage entropy=1.0067795890632527
  */
  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      AdvancedSettings advancedSettings0 = new AdvancedSettings();
      advancedSettings0.setClientIdentifier((String) null);
      advancedSettings0.setClientIdentifier("No!g%ii$w7kz AkQJ$/");
      advancedSettings0.setClientIdentifier("f%tNjX'");
      assertEquals("f%tNjX'", advancedSettings0.getClientIdentifier());
  }

  /**
  //Test case number: 6
  /*Coverage entropy=3.537357795897412
  */
  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      AdvancedSettings advancedSettings0 = new AdvancedSettings();
      advancedSettings0.setMaxThreadsForNioWrite((-4037));
      advancedSettings0.setPerformancePreferencesConnectionTime((-1951));
      advancedSettings0.setPerformancePreferencesLatency(10);
      advancedSettings0.setPerformancePreferencesConnectionTime(10);
      advancedSettings0.setPerformancePreferencesBandwidth((-1267));
      advancedSettings0.getByteBufferSize();
      advancedSettings0.setPerformancePreferencesLatency(10);
      advancedSettings0.setPerformancePreferencesLatency((-739));
      advancedSettings0.setPerformancePreferencesBandwidth((-1100));
      advancedSettings0.getMaxThreadsForNioWrite();
      advancedSettings0.setBacklog((-962));
      advancedSettings0.getClientSocketReceiveBufferSize();
      advancedSettings0.setPerformancePreferencesConnectionTime((-739));
      advancedSettings0.toXML("IfIQ92)m9{ 'TFG");
      advancedSettings0.getCharset();
      int int0 = advancedSettings0.getBacklog();
      assertEquals((-739), advancedSettings0.getPerformancePreferencesConnectionTime());
      assertEquals(0, int0);
  }

  /**
  //Test case number: 7
  /*Coverage entropy=2.754627133386218
  */
  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      AdvancedSettings advancedSettings0 = new AdvancedSettings();
      advancedSettings0.setClientSocketReceiveBufferSize((-38));
      advancedSettings0.setClientSocketTrafficClass("fGck\"gd-y(1:dKAj");
      advancedSettings0.setClientIdentifier("");
      advancedSettings0.getClientIdentifier();
      advancedSettings0.setDebugNonBlockingMode(false);
      advancedSettings0.getClientSocketSendBufferSize();
      advancedSettings0.setUseDirectByteBuffer(false);
      advancedSettings0.setClientSocketTrafficClass("fGck\"gd-y(1:dKAj");
      advancedSettings0.getClientSocketReceiveBufferSize();
      advancedSettings0.setClientSocketTrafficClass("");
      advancedSettings0.setQSObjectPoolMaker("");
      advancedSettings0.setClientIdentifier("");
      advancedSettings0.setClientSocketReceiveBufferSize((-38));
      assertEquals((-38), advancedSettings0.getClientSocketReceiveBufferSize());
  }

  /**
  //Test case number: 8
  /*Coverage entropy=2.027377075708073
  */
  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      AdvancedSettings advancedSettings0 = new AdvancedSettings();
      advancedSettings0.setClientIdentifier("F#D:ZZMrdX/3");
      advancedSettings0.setBacklog(3254);
      advancedSettings0.getClientIdentifier();
      advancedSettings0.getClientIdentifier();
      advancedSettings0.setClientIdentifier("~}UKPM(TxHa@`tg0P>");
      int int0 = advancedSettings0.getBacklog();
      assertEquals(3254, int0);
  }

  /**
  //Test case number: 9
  /*Coverage entropy=3.58054243294188
  */
  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      AdvancedSettings advancedSettings0 = new AdvancedSettings();
      advancedSettings0.setDebugNonBlockingMode(true);
      advancedSettings0.getQSObjectPoolMaker();
      advancedSettings0.setCharset("");
      advancedSettings0.setClientSocketTcpNoDelay(false);
      advancedSettings0.setClientSocketTrafficClass("");
      advancedSettings0.setQSObjectPoolMaker("");
      advancedSettings0.setClientIdentifier("");
      advancedSettings0.setClientIdentifier("kCj5,DB([");
      advancedSettings0.setClientSocketSendBufferSize(782);
      advancedSettings0.getQSObjectPoolMaker();
      advancedSettings0.getClientSocketTcpNoDelay();
      advancedSettings0.setDebugNonBlockingMode(true);
      advancedSettings0.setQSObjectPoolMaker("");
      advancedSettings0.toXML("");
      advancedSettings0.setQSObjectPoolMaker("");
      advancedSettings0.setClientSocketTrafficClass("\t<byte-buffer-size>");
      advancedSettings0.getClientSocketReceiveBufferSize();
      advancedSettings0.getDebugNonBlockingMode();
      advancedSettings0.setClientSocketTcpNoDelay(false);
      advancedSettings0.setClientSocketTrafficClass("");
      // Undeclared exception!
      try { 
        advancedSettings0.setCharset("<advanced-settings>\n\t<charset>ISO-8859-1</charset>\n\t<use-direct-byte-buffer>true</use-direct-byte-buffer>\n\t<byte-buffer-size>65536</byte-buffer-size>\n\t<backlog>0</backlog>\n\t<socket-linger>-1</socket-linger>\n\t<debug-non-blocking-mode>true</debug-non-blocking-mode>\n\t<client-identifier>kCj5,DB([</client-identifier>\n\t<qsobject-pool-maker></qsobject-pool-maker>\n\t<max-threads-for-nio-write>10</max-threads-for-nio-write>\n\t<performance-preferences-connection-time>0</performance-preferences-connection-time>\n\t<performance-preferences-latency>0</performance-preferences-latency>\n\t<performance-preferences-bandwidth>0</performance-preferences-bandwidth>\n\t<client-socket-tcp-no-delay>false</client-socket-tcp-no-delay>\n\t<client-socket-traffic-class></client-socket-traffic-class>\n\t<client-socket-send-buffer-size>782</client-socket-send-buffer-size>\n</advanced-settings>\n");
        fail("Expecting exception: IllegalCharsetNameException");
      
      } catch(IllegalCharsetNameException e) {
         //
         // <advanced-settings>
         // \t<charset>ISO-8859-1</charset>
         // \t<use-direct-byte-buffer>true</use-direct-byte-buffer>
         // \t<byte-buffer-size>65536</byte-buffer-size>
         // \t<backlog>0</backlog>
         // \t<socket-linger>-1</socket-linger>
         // \t<debug-non-blocking-mode>true</debug-non-blocking-mode>
         // \t<client-identifier>kCj5,DB([</client-identifier>
         // \t<qsobject-pool-maker></qsobject-pool-maker>
         // \t<max-threads-for-nio-write>10</max-threads-for-nio-write>
         // \t<performance-preferences-connection-time>0</performance-preferences-connection-time>
         // \t<performance-preferences-latency>0</performance-preferences-latency>
         // \t<performance-preferences-bandwidth>0</performance-preferences-bandwidth>
         // \t<client-socket-tcp-no-delay>false</client-socket-tcp-no-delay>
         // \t<client-socket-traffic-class></client-socket-traffic-class>
         // \t<client-socket-send-buffer-size>782</client-socket-send-buffer-size>
         // </advanced-settings>
         //
         verifyException("java.nio.charset.Charset", e);
      }
  }

  /**
  //Test case number: 10
  /*Coverage entropy=0.9448468679826323
  */
  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      AdvancedSettings advancedSettings0 = new AdvancedSettings();
      assertEquals("ISO-8859-1", advancedSettings0.getCharset());
      
      advancedSettings0.setCharset("ISO-8859-1");
      advancedSettings0.setCharset("");
      advancedSettings0.setCharset("ISO-8859-1");
      assertEquals((-1), advancedSettings0.getSocketLinger());
      assertEquals(0, advancedSettings0.getPerformancePreferencesBandwidth());
      assertEquals(0, advancedSettings0.getPerformancePreferencesConnectionTime());
      assertEquals("org.quickserver.net.server.impl.OptimisticClientIdentifier", advancedSettings0.getClientIdentifier());
      assertEquals(0, advancedSettings0.getBacklog());
      assertTrue(advancedSettings0.getUseDirectByteBuffer());
      assertEquals(10, advancedSettings0.getMaxThreadsForNioWrite());
      assertFalse(advancedSettings0.getClientSocketTcpNoDelay());
      assertEquals(0, advancedSettings0.getPerformancePreferencesLatency());
      assertEquals(65536, advancedSettings0.getByteBufferSize());
  }

  /**
  //Test case number: 11
  /*Coverage entropy=0.9623351446188083
  */
  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      String string0 = "0";
      AdvancedSettings advancedSettings0 = new AdvancedSettings();
      // Undeclared exception!
      try { 
        advancedSettings0.setCharset("0");
        fail("Expecting exception: UnsupportedCharsetException");
      
      } catch(UnsupportedCharsetException e) {
         //
         // 0
         //
         verifyException("org.quickserver.util.xmlreader.AdvancedSettings", e);
      }
  }

  /**
  //Test case number: 12
  /*Coverage entropy=0.9448468679826323
  */
  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      AdvancedSettings advancedSettings0 = new AdvancedSettings();
      advancedSettings0.setCharset("");
      advancedSettings0.setCharset((String) null);
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
  //Test case number: 13
  /*Coverage entropy=2.579577532376134
  */
  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      AdvancedSettings advancedSettings0 = new AdvancedSettings();
      advancedSettings0.setClientSocketTrafficClass("fGck\"gd-y(1:dKAj");
      advancedSettings0.setCharset("");
      advancedSettings0.getClientSocketTrafficClass();
      advancedSettings0.setClientIdentifier("");
      advancedSettings0.getClientIdentifier();
      advancedSettings0.setClientIdentifier("fGck\"gd-y(1:dKAj");
      advancedSettings0.setClientSocketSendBufferSize(607);
      advancedSettings0.setClientIdentifier("f%tNjX'");
      advancedSettings0.setClientIdentifier("org.quickserver.net.server.impl.OptimisticClientIdentifier");
      advancedSettings0.getClientIdentifier();
      advancedSettings0.getClientSocketSendBufferSize();
      advancedSettings0.getByteBufferSize();
      advancedSettings0.setClientIdentifier("");
      advancedSettings0.setClientIdentifier("RI|Ks<b^L@AR;zRG^gT");
      advancedSettings0.getClientIdentifier();
      assertEquals("RI|Ks<b^L@AR;zRG^gT", advancedSettings0.getClientIdentifier());
  }

  /**
  //Test case number: 14
  /*Coverage entropy=3.2205808362415755
  */
  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      AdvancedSettings advancedSettings0 = new AdvancedSettings();
      advancedSettings0.toXML((String) null);
      String string0 = advancedSettings0.toXML((String) null);
      assertEquals("<advanced-settings>\n\t<charset>ISO-8859-1</charset>\n\t<use-direct-byte-buffer>true</use-direct-byte-buffer>\n\t<byte-buffer-size>65536</byte-buffer-size>\n\t<backlog>0</backlog>\n\t<socket-linger>-1</socket-linger>\n\t<debug-non-blocking-mode>false</debug-non-blocking-mode>\n\t<client-identifier>org.quickserver.net.server.impl.OptimisticClientIdentifier</client-identifier>\n\t<qsobject-pool-maker>org.quickserver.util.pool.MakeQSObjectPool</qsobject-pool-maker>\n\t<max-threads-for-nio-write>10</max-threads-for-nio-write>\n\t<performance-preferences-connection-time>0</performance-preferences-connection-time>\n\t<performance-preferences-latency>0</performance-preferences-latency>\n\t<performance-preferences-bandwidth>0</performance-preferences-bandwidth>\n\t<client-socket-tcp-no-delay>false</client-socket-tcp-no-delay>\n</advanced-settings>\n", string0);
      
      advancedSettings0.toXML("</performance-preferences-bandwidth>\n");
      assertEquals(0, advancedSettings0.getPerformancePreferencesBandwidth());
  }

  /**
  //Test case number: 15
  /*Coverage entropy=3.3832184087290926
  */
  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      AdvancedSettings advancedSettings0 = new AdvancedSettings();
      advancedSettings0.setClientSocketSendBufferSize(1);
      advancedSettings0.setClientSocketReceiveBufferSize(1);
      advancedSettings0.toXML("Wzc+~{~w}SDH!)9\"/L");
      advancedSettings0.toXML("");
      assertEquals(1, advancedSettings0.getClientSocketReceiveBufferSize());
  }

  /**
  //Test case number: 16
  /*Coverage entropy=3.0293980059486403
  */
  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      AdvancedSettings advancedSettings0 = new AdvancedSettings();
      advancedSettings0.setClientSocketSendBufferSize(18);
      advancedSettings0.setPerformancePreferencesBandwidth((-2102));
      advancedSettings0.setBacklog((-2102));
      advancedSettings0.setClientIdentifier("k:");
      advancedSettings0.setUseDirectByteBuffer(false);
      advancedSettings0.setClientIdentifier("`I&sj");
      advancedSettings0.setPerformancePreferencesBandwidth((-2102));
      advancedSettings0.setByteBufferSize((-2102));
      advancedSettings0.setClientSocketReceiveBufferSize(16);
      advancedSettings0.setByteBufferSize((-2102));
      advancedSettings0.getClientIdentifier();
      advancedSettings0.setClientSocketReceiveBufferSize((-2102));
      advancedSettings0.setUseDirectByteBuffer(false);
      advancedSettings0.setClientSocketReceiveBufferSize(23);
      advancedSettings0.getDebugNonBlockingMode();
      advancedSettings0.getUseDirectByteBuffer();
      advancedSettings0.setClientIdentifier("`I&sj");
      advancedSettings0.setUseDirectByteBuffer(true);
      advancedSettings0.setDebugNonBlockingMode(true);
      advancedSettings0.setUseDirectByteBuffer(false);
      advancedSettings0.getByteBufferSize();
      int int0 = advancedSettings0.getByteBufferSize();
      assertEquals("`I&sj", advancedSettings0.getClientIdentifier());
      assertEquals(65536, int0);
  }

  /**
  //Test case number: 17
  /*Coverage entropy=2.209406559005219
  */
  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      AdvancedSettings advancedSettings0 = new AdvancedSettings();
      advancedSettings0.setClientSocketTrafficClass("Ts`U#r");
      advancedSettings0.setClientIdentifier("=A1[@YWVoIO{X6<S");
      advancedSettings0.getUseDirectByteBuffer();
      advancedSettings0.getByteBufferSize();
      advancedSettings0.getClientSocketTrafficClass();
      assertEquals("=A1[@YWVoIO{X6<S", advancedSettings0.getClientIdentifier());
  }

  /**
  //Test case number: 18
  /*Coverage entropy=1.0931471805599453
  */
  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      AdvancedSettings advancedSettings0 = new AdvancedSettings();
      int int0 = advancedSettings0.getPerformancePreferencesBandwidth();
      assertEquals(0, advancedSettings0.getPerformancePreferencesConnectionTime());
      assertEquals((-1), advancedSettings0.getSocketLinger());
      assertFalse(advancedSettings0.getClientSocketTcpNoDelay());
      assertEquals(0, advancedSettings0.getBacklog());
      assertEquals("org.quickserver.net.server.impl.OptimisticClientIdentifier", advancedSettings0.getClientIdentifier());
      assertEquals(0, advancedSettings0.getPerformancePreferencesLatency());
      assertEquals(10, advancedSettings0.getMaxThreadsForNioWrite());
      assertEquals(0, int0);
      assertEquals(65536, advancedSettings0.getByteBufferSize());
      assertTrue(advancedSettings0.getUseDirectByteBuffer());
      assertEquals("ISO-8859-1", advancedSettings0.getCharset());
  }

  /**
  //Test case number: 19
  /*Coverage entropy=3.757392115863953
  */
  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      AdvancedSettings advancedSettings0 = new AdvancedSettings();
      advancedSettings0.setMaxThreadsForNioWrite(7);
      advancedSettings0.setMaxThreadsForNioWrite(2359);
      advancedSettings0.setClientSocketSendBufferSize((-1));
      advancedSettings0.setByteBufferSize((-1));
      advancedSettings0.setSocketLinger(2359);
      advancedSettings0.setClientSocketTcpNoDelay(false);
      advancedSettings0.setSocketLinger(3359);
      advancedSettings0.setByteBufferSize((-1));
      advancedSettings0.setMaxThreadsForNioWrite((-1));
      advancedSettings0.setClientIdentifier("");
      advancedSettings0.getClientSocketTrafficClass();
      advancedSettings0.setDebugNonBlockingMode(true);
      advancedSettings0.getClientSocketSendBufferSize();
      advancedSettings0.toXML("yGWqcbw_`");
      advancedSettings0.getClientSocketReceiveBufferSize();
      advancedSettings0.setUseDirectByteBuffer(true);
      advancedSettings0.setByteBufferSize(2208);
      advancedSettings0.setClientSocketTrafficClass("T2|'+sXz");
      advancedSettings0.setClientSocketTrafficClass("");
      advancedSettings0.setQSObjectPoolMaker("");
      advancedSettings0.getClientSocketTrafficClass();
      advancedSettings0.getClientSocketTrafficClass();
      advancedSettings0.setClientIdentifier("\t<client-socket-traffic-class>");
      advancedSettings0.setClientSocketReceiveBufferSize(1);
      advancedSettings0.getClientIdentifier();
      assertTrue(advancedSettings0.getDebugNonBlockingMode());
  }

  /**
  //Test case number: 20
  /*Coverage entropy=2.8823946057804153
  */
  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      AdvancedSettings advancedSettings0 = new AdvancedSettings();
      advancedSettings0.getQSObjectPoolMaker();
      advancedSettings0.setCharset("");
      advancedSettings0.setClientSocketTcpNoDelay(false);
      advancedSettings0.setClientSocketTrafficClass("");
      advancedSettings0.setQSObjectPoolMaker("");
      advancedSettings0.setClientIdentifier("org.quickserver.util.pool.MakeQSObjectPool");
      advancedSettings0.setClientIdentifier("kCj5,DB([");
      advancedSettings0.setClientSocketSendBufferSize(782);
      advancedSettings0.getClientSocketTrafficClass();
      advancedSettings0.getClientSocketTcpNoDelay();
      advancedSettings0.setQSObjectPoolMaker("");
      advancedSettings0.setClientSocketTrafficClass("");
      advancedSettings0.setClientSocketTrafficClass("");
      advancedSettings0.getClientSocketTrafficClass();
      advancedSettings0.setClientIdentifier("");
      advancedSettings0.setClientSocketReceiveBufferSize(1);
      advancedSettings0.getClientIdentifier();
      assertEquals(1, advancedSettings0.getClientSocketReceiveBufferSize());
  }

  /**
  //Test case number: 21
  /*Coverage entropy=3.4611455147303687
  */
  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      AdvancedSettings advancedSettings0 = new AdvancedSettings();
      advancedSettings0.setClientSocketTrafficClass("fGck\"gd-y(1:dKAj");
      advancedSettings0.setClientSocketTrafficClass("");
      advancedSettings0.setClientIdentifier("");
      advancedSettings0.setClientSocketReceiveBufferSize(391);
      advancedSettings0.toXML("");
      advancedSettings0.setClientIdentifier("<advanced-settings>\n\t<charset>ISO-8859-1</charset>\n\t<use-direct-byte-buffer>true</use-direct-byte-buffer>\n\t<byte-buffer-size>65536</byte-buffer-size>\n\t<backlog>0</backlog>\n\t<socket-linger>-1</socket-linger>\n\t<debug-non-blocking-mode>false</debug-non-blocking-mode>\n\t<client-identifier>org.quickserver.net.server.impl.OptimisticClientIdentifier</client-identifier>\n\t<qsobject-pool-maker>org.quickserver.util.pool.MakeQSObjectPool</qsobject-pool-maker>\n\t<max-threads-for-nio-write>10</max-threads-for-nio-write>\n\t<performance-preferences-connection-time>0</performance-preferences-connection-time>\n\t<performance-preferences-latency>0</performance-preferences-latency>\n\t<performance-preferences-bandwidth>0</performance-preferences-bandwidth>\n\t<client-socket-tcp-no-delay>false</client-socket-tcp-no-delay>\n\t<client-socket-traffic-class></client-socket-traffic-class>\n\t<client-socket-receive-buffer-size>391</client-socket-receive-buffer-size>\n</advanced-settings>\n");
      AdvancedSettings advancedSettings1 = new AdvancedSettings();
      advancedSettings1.setClientSocketSendBufferSize(607);
      advancedSettings0.setClientIdentifier("w");
      advancedSettings0.setClientSocketReceiveBufferSize(630);
      advancedSettings1.getClientIdentifier();
      advancedSettings0.setClientIdentifier("");
      advancedSettings0.setClientIdentifier("");
      advancedSettings0.getClientIdentifier();
      advancedSettings0.getClientIdentifier();
      assertEquals("w", advancedSettings0.getClientIdentifier());
  }

  /**
  //Test case number: 22
  /*Coverage entropy=1.0931471805599453
  */
  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      AdvancedSettings advancedSettings0 = new AdvancedSettings();
      int int0 = advancedSettings0.getPerformancePreferencesLatency();
      assertEquals("ISO-8859-1", advancedSettings0.getCharset());
      assertEquals(10, advancedSettings0.getMaxThreadsForNioWrite());
      assertEquals(0, int0);
      assertFalse(advancedSettings0.getClientSocketTcpNoDelay());
      assertEquals(0, advancedSettings0.getBacklog());
      assertEquals("org.quickserver.net.server.impl.OptimisticClientIdentifier", advancedSettings0.getClientIdentifier());
      assertEquals(0, advancedSettings0.getPerformancePreferencesBandwidth());
      assertEquals((-1), advancedSettings0.getSocketLinger());
      assertTrue(advancedSettings0.getUseDirectByteBuffer());
      assertEquals(65536, advancedSettings0.getByteBufferSize());
      assertEquals(0, advancedSettings0.getPerformancePreferencesConnectionTime());
  }

  /**
  //Test case number: 23
  /*Coverage entropy=3.699781613704204
  */
  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      AdvancedSettings advancedSettings0 = new AdvancedSettings();
      advancedSettings0.setByteBufferSize(1251);
      advancedSettings0.toXML(":Qj^eGtna:_");
      advancedSettings0.setClientSocketTrafficClass(":Qj^eGtna:_<advanced-settings>\n:Qj^eGtna:_\t<charset>ISO-8859-1</charset>\n:Qj^eGtna:_\t<use-direct-byte-buffer>true</use-direct-byte-buffer>\n:Qj^eGtna:_\t<byte-buffer-size>1251</byte-buffer-size>\n:Qj^eGtna:_\t<backlog>0</backlog>\n:Qj^eGtna:_\t<socket-linger>-1</socket-linger>\n:Qj^eGtna:_\t<debug-non-blocking-mode>false</debug-non-blocking-mode>\n:Qj^eGtna:_\t<client-identifier>org.quickserver.net.server.impl.OptimisticClientIdentifier</client-identifier>\n:Qj^eGtna:_\t<qsobject-pool-maker>org.quickserver.util.pool.MakeQSObjectPool</qsobject-pool-maker>\n:Qj^eGtna:_\t<max-threads-for-nio-write>10</max-threads-for-nio-write>\n:Qj^eGtna:_\t<performance-preferences-connection-time>0</performance-preferences-connection-time>\n:Qj^eGtna:_\t<performance-preferences-latency>0</performance-preferences-latency>\n:Qj^eGtna:_\t<performance-preferences-bandwidth>0</performance-preferences-bandwidth>\n:Qj^eGtna:_\t<client-socket-tcp-no-delay>false</client-socket-tcp-no-delay>\n:Qj^eGtna:_</advanced-settings>\n");
      advancedSettings0.setClientSocketTcpNoDelay(false);
      advancedSettings0.setClientSocketSendBufferSize(1251);
      advancedSettings0.getClientSocketReceiveBufferSize();
      advancedSettings0.getClientSocketTcpNoDelay();
      advancedSettings0.setPerformancePreferencesBandwidth(0);
      advancedSettings0.setPerformancePreferencesBandwidth((-1347));
      advancedSettings0.setPerformancePreferencesBandwidth(0);
      advancedSettings0.getMaxThreadsForNioWrite();
      advancedSettings0.setClientSocketReceiveBufferSize(0);
      advancedSettings0.setClientSocketTrafficClass("");
      advancedSettings0.getClientIdentifier();
      advancedSettings0.setUseDirectByteBuffer(false);
      advancedSettings0.setByteBufferSize(428);
      advancedSettings0.getClientSocketSendBufferSize();
      advancedSettings0.setClientSocketTcpNoDelay(false);
      advancedSettings0.getCharset();
      advancedSettings0.setByteBufferSize(0);
      advancedSettings0.getClientSocketTcpNoDelay();
      advancedSettings0.setSocketLinger(0);
      advancedSettings0.getSocketLinger();
      advancedSettings0.setClientIdentifier(":Qj^eGtna:_<advanced-settings>\n:Qj^eGtna:_\t<charset>ISO-8859-1</charset>\n:Qj^eGtna:_\t<use-direct-byte-buffer>true</use-direct-byte-buffer>\n:Qj^eGtna:_\t<byte-buffer-size>1251</byte-buffer-size>\n:Qj^eGtna:_\t<backlog>0</backlog>\n:Qj^eGtna:_\t<socket-linger>-1</socket-linger>\n:Qj^eGtna:_\t<debug-non-blocking-mode>false</debug-non-blocking-mode>\n:Qj^eGtna:_\t<client-identifier>org.quickserver.net.server.impl.OptimisticClientIdentifier</client-identifier>\n:Qj^eGtna:_\t<qsobject-pool-maker>org.quickserver.util.pool.MakeQSObjectPool</qsobject-pool-maker>\n:Qj^eGtna:_\t<max-threads-for-nio-write>10</max-threads-for-nio-write>\n:Qj^eGtna:_\t<performance-preferences-connection-time>0</performance-preferences-connection-time>\n:Qj^eGtna:_\t<performance-preferences-latency>0</performance-preferences-latency>\n:Qj^eGtna:_\t<performance-preferences-bandwidth>0</performance-preferences-bandwidth>\n:Qj^eGtna:_\t<client-socket-tcp-no-delay>false</client-socket-tcp-no-delay>\n:Qj^eGtna:_</advanced-settings>\n");
      assertEquals(0, advancedSettings0.getPerformancePreferencesBandwidth());
  }

  /**
  //Test case number: 24
  /*Coverage entropy=3.6214302457593783
  */
  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      AdvancedSettings advancedSettings0 = new AdvancedSettings();
      advancedSettings0.setSocketLinger(91);
      advancedSettings0.getClientSocketReceiveBufferSize();
      advancedSettings0.setPerformancePreferencesBandwidth(91);
      advancedSettings0.setClientSocketReceiveBufferSize(2818);
      advancedSettings0.setPerformancePreferencesConnectionTime(1);
      advancedSettings0.setPerformancePreferencesLatency(91);
      advancedSettings0.setPerformancePreferencesConnectionTime(91);
      advancedSettings0.getSocketLinger();
      advancedSettings0.setPerformancePreferencesBandwidth(793);
      advancedSettings0.setClientSocketTrafficClass("0");
      advancedSettings0.setClientSocketTrafficClass("t~qGjE!t^f\"F<?D(8u\"");
      advancedSettings0.getClientSocketReceiveBufferSize();
      advancedSettings0.setSocketLinger(2818);
      advancedSettings0.setCharset("");
      advancedSettings0.getPerformancePreferencesLatency();
      advancedSettings0.setPerformancePreferencesConnectionTime(2818);
      advancedSettings0.toXML("\t<client-socket-send-buffer-size>");
      assertEquals(91, advancedSettings0.getPerformancePreferencesLatency());
  }

  /**
  //Test case number: 25
  /*Coverage entropy=1.0931471805599453
  */
  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      AdvancedSettings advancedSettings0 = new AdvancedSettings();
      int int0 = advancedSettings0.getPerformancePreferencesConnectionTime();
      assertEquals("org.quickserver.net.server.impl.OptimisticClientIdentifier", advancedSettings0.getClientIdentifier());
      assertEquals(0, advancedSettings0.getBacklog());
      assertEquals(0, advancedSettings0.getPerformancePreferencesLatency());
      assertEquals(10, advancedSettings0.getMaxThreadsForNioWrite());
      assertEquals(65536, advancedSettings0.getByteBufferSize());
      assertEquals(0, int0);
      assertEquals(0, advancedSettings0.getPerformancePreferencesBandwidth());
      assertEquals("ISO-8859-1", advancedSettings0.getCharset());
      assertFalse(advancedSettings0.getClientSocketTcpNoDelay());
      assertEquals((-1), advancedSettings0.getSocketLinger());
      assertTrue(advancedSettings0.getUseDirectByteBuffer());
  }

  /**
  //Test case number: 26
  /*Coverage entropy=3.6644011950387245
  */
  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      AdvancedSettings advancedSettings0 = new AdvancedSettings();
      advancedSettings0.setPerformancePreferencesConnectionTime(1251);
      advancedSettings0.setByteBufferSize((-1));
      advancedSettings0.setPerformancePreferencesConnectionTime(1251);
      advancedSettings0.setClientSocketSendBufferSize((-1611));
      advancedSettings0.setPerformancePreferencesBandwidth(1251);
      advancedSettings0.getClientIdentifier();
      advancedSettings0.setPerformancePreferencesConnectionTime((-1611));
      advancedSettings0.setClientSocketTcpNoDelay(true);
      advancedSettings0.setClientSocketTcpNoDelay(false);
      advancedSettings0.getBacklog();
      advancedSettings0.setSocketLinger(65536);
      advancedSettings0.getClientSocketReceiveBufferSize();
      advancedSettings0.getClientIdentifier();
      advancedSettings0.setClientIdentifier("o9[t=");
      advancedSettings0.getBacklog();
      advancedSettings0.setClientSocketSendBufferSize(65536);
      advancedSettings0.setMaxThreadsForNioWrite(0);
      advancedSettings0.getClientSocketReceiveBufferSize();
      advancedSettings0.getPerformancePreferencesBandwidth();
      advancedSettings0.getMaxThreadsForNioWrite();
      advancedSettings0.getBacklog();
      advancedSettings0.getMaxThreadsForNioWrite();
      advancedSettings0.getClientIdentifier();
      advancedSettings0.setClientIdentifier("o9[t=");
      advancedSettings0.toXML("");
      assertEquals("o9[t=", advancedSettings0.getClientIdentifier());
  }

  /**
  //Test case number: 27
  /*Coverage entropy=2.5137801058392384
  */
  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      AdvancedSettings advancedSettings0 = new AdvancedSettings();
      advancedSettings0.setClientSocketSendBufferSize(10);
      advancedSettings0.setClientSocketTrafficClass("m-as[^'C/@Q6p;q");
      advancedSettings0.setClientSocketTcpNoDelay(true);
      advancedSettings0.setClientIdentifier("m-as[^'C/@Q6p;q");
      advancedSettings0.getClientSocketTcpNoDelay();
      advancedSettings0.getByteBufferSize();
      advancedSettings0.getClientSocketTrafficClass();
      assertEquals("m-as[^'C/@Q6p;q", advancedSettings0.getClientIdentifier());
  }

  /**
  //Test case number: 28
  /*Coverage entropy=2.5812155340141354
  */
  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      AdvancedSettings advancedSettings0 = new AdvancedSettings();
      advancedSettings0.setClientSocketTrafficClass("fGck\"gd-y(1:dKAj");
      advancedSettings0.setCharset("");
      advancedSettings0.getClientSocketTrafficClass();
      advancedSettings0.setClientSocketTrafficClass("Ch.8");
      advancedSettings0.setClientIdentifier("");
      advancedSettings0.setClientSocketReceiveBufferSize(391);
      advancedSettings0.getClientIdentifier();
      advancedSettings0.setBacklog(0);
      advancedSettings0.setClientIdentifier("fGck\"gd-y(1:dKAj");
      advancedSettings0.setClientSocketSendBufferSize(607);
      advancedSettings0.setClientIdentifier("f%tNjX'");
      advancedSettings0.setClientSocketReceiveBufferSize(1);
      advancedSettings0.getClientIdentifier();
      advancedSettings0.setClientIdentifier("|zU5O|w g");
      advancedSettings0.setClientIdentifier("lR}.`p%vOl\"Se~KN1x");
      advancedSettings0.getClientIdentifier();
      advancedSettings0.getClientIdentifier();
      assertEquals("lR}.`p%vOl\"Se~KN1x", advancedSettings0.getClientIdentifier());
  }

  /**
  //Test case number: 29
  /*Coverage entropy=1.0931471805599453
  */
  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      AdvancedSettings advancedSettings0 = new AdvancedSettings();
      advancedSettings0.setBacklog(153);
      assertEquals(153, advancedSettings0.getBacklog());
  }

  /**
  //Test case number: 30
  /*Coverage entropy=1.0931471805599453
  */
  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      AdvancedSettings advancedSettings0 = new AdvancedSettings();
      advancedSettings0.setBacklog((-1));
      assertEquals(10, advancedSettings0.getMaxThreadsForNioWrite());
      assertFalse(advancedSettings0.getClientSocketTcpNoDelay());
      assertEquals(0, advancedSettings0.getPerformancePreferencesConnectionTime());
      assertEquals(0, advancedSettings0.getBacklog());
      assertEquals("org.quickserver.net.server.impl.OptimisticClientIdentifier", advancedSettings0.getClientIdentifier());
      assertEquals("ISO-8859-1", advancedSettings0.getCharset());
      assertEquals(0, advancedSettings0.getPerformancePreferencesBandwidth());
      assertEquals(65536, advancedSettings0.getByteBufferSize());
      assertEquals(0, advancedSettings0.getPerformancePreferencesLatency());
      assertEquals((-1), advancedSettings0.getSocketLinger());
      assertTrue(advancedSettings0.getUseDirectByteBuffer());
  }

  /**
  //Test case number: 31
  /*Coverage entropy=1.5271837172395382
  */
  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      AdvancedSettings advancedSettings0 = new AdvancedSettings();
      advancedSettings0.setPerformancePreferencesConnectionTime((-164));
      int int0 = advancedSettings0.getPerformancePreferencesConnectionTime();
      assertEquals((-164), int0);
  }
}
