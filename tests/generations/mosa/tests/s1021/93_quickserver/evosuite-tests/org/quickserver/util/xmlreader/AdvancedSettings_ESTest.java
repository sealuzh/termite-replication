/*
 * This file was automatically generated by EvoSuite
 * Thu Nov 14 21:37:50 GMT 2019
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
  /*Coverage entropy=2.4990104312963832
  */
  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      AdvancedSettings advancedSettings0 = new AdvancedSettings();
      advancedSettings0.setClientIdentifier("");
      advancedSettings0.getDebugNonBlockingMode();
      advancedSettings0.setPerformancePreferencesBandwidth((-186));
      AdvancedSettings advancedSettings1 = new AdvancedSettings();
      advancedSettings0.getByteBufferSize();
      advancedSettings1.getQSObjectPoolMaker();
      advancedSettings0.getPerformancePreferencesBandwidth();
      // Undeclared exception!
      try { 
        advancedSettings0.setCharset("</max-threads-for-nio-write>\n");
        fail("Expecting exception: IllegalCharsetNameException");
      
      } catch(IllegalCharsetNameException e) {
         //
         // </max-threads-for-nio-write>
         //
         verifyException("java.nio.charset.Charset", e);
      }
  }

  /**
  //Test case number: 1
  /*Coverage entropy=2.070976373972562
  */
  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      AdvancedSettings advancedSettings0 = new AdvancedSettings();
      advancedSettings0.setPerformancePreferencesConnectionTime(2943);
      advancedSettings0.setClientSocketSendBufferSize(2943);
      advancedSettings0.setClientSocketSendBufferSize(65536);
      advancedSettings0.getPerformancePreferencesConnectionTime();
      advancedSettings0.getQSObjectPoolMaker();
      assertEquals(65536, advancedSettings0.getClientSocketSendBufferSize());
  }

  /**
  //Test case number: 2
  /*Coverage entropy=1.5271837172395382
  */
  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      AdvancedSettings advancedSettings0 = new AdvancedSettings();
      advancedSettings0.setBacklog(17);
      int int0 = advancedSettings0.getBacklog();
      assertEquals(17, int0);
  }

  /**
  //Test case number: 3
  /*Coverage entropy=1.5271837172395382
  */
  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      AdvancedSettings advancedSettings0 = new AdvancedSettings();
      advancedSettings0.setClientSocketReceiveBufferSize((-9));
      int int0 = advancedSettings0.getClientSocketReceiveBufferSize();
      assertEquals((-9), int0);
  }

  /**
  //Test case number: 4
  /*Coverage entropy=3.321585437079472
  */
  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      AdvancedSettings advancedSettings0 = new AdvancedSettings();
      advancedSettings0.setClientSocketReceiveBufferSize((-2489));
      advancedSettings0.getCharset();
      advancedSettings0.toXML("ISO-8859-1");
      assertEquals((-2489), advancedSettings0.getClientSocketReceiveBufferSize());
  }

  /**
  //Test case number: 5
  /*Coverage entropy=1.830738805564335
  */
  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      AdvancedSettings advancedSettings0 = new AdvancedSettings();
      advancedSettings0.setByteBufferSize(1);
      advancedSettings0.setSocketLinger(1);
      int int0 = advancedSettings0.getSocketLinger();
      assertEquals(1, advancedSettings0.getByteBufferSize());
      assertEquals(1, int0);
  }

  /**
  //Test case number: 6
  /*Coverage entropy=1.5271837172395382
  */
  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      AdvancedSettings advancedSettings0 = new AdvancedSettings();
      advancedSettings0.setClientSocketReceiveBufferSize(21);
      int int0 = advancedSettings0.getClientSocketReceiveBufferSize();
      assertEquals(21, int0);
  }

  /**
  //Test case number: 7
  /*Coverage entropy=2.063983366979555
  */
  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      AdvancedSettings advancedSettings0 = new AdvancedSettings();
      advancedSettings0.setPerformancePreferencesLatency((-1207));
      advancedSettings0.setPerformancePreferencesBandwidth((-1207));
      advancedSettings0.getClientSocketTrafficClass();
      int int0 = advancedSettings0.getPerformancePreferencesLatency();
      assertEquals((-1207), advancedSettings0.getPerformancePreferencesBandwidth());
      assertEquals((-1207), int0);
  }

  /**
  //Test case number: 8
  /*Coverage entropy=1.0931471805599453
  */
  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      AdvancedSettings advancedSettings0 = new AdvancedSettings();
      advancedSettings0.setClientIdentifier((String) null);
      assertTrue(advancedSettings0.getUseDirectByteBuffer());
      assertEquals((-1), advancedSettings0.getSocketLinger());
      assertEquals(10, advancedSettings0.getMaxThreadsForNioWrite());
      assertFalse(advancedSettings0.getClientSocketTcpNoDelay());
      assertEquals(0, advancedSettings0.getPerformancePreferencesLatency());
      assertEquals("org.quickserver.net.server.impl.OptimisticClientIdentifier", advancedSettings0.getClientIdentifier());
      assertEquals(0, advancedSettings0.getBacklog());
      assertEquals(0, advancedSettings0.getPerformancePreferencesConnectionTime());
      assertEquals("ISO-8859-1", advancedSettings0.getCharset());
      assertEquals(0, advancedSettings0.getPerformancePreferencesBandwidth());
      assertEquals(65536, advancedSettings0.getByteBufferSize());
  }

  /**
  //Test case number: 9
  /*Coverage entropy=2.015255863586861
  */
  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      AdvancedSettings advancedSettings0 = new AdvancedSettings();
      advancedSettings0.setMaxThreadsForNioWrite((-1730));
      advancedSettings0.setCharset("");
      advancedSettings0.getMaxThreadsForNioWrite();
      advancedSettings0.getCharset();
      assertEquals((-1730), advancedSettings0.getMaxThreadsForNioWrite());
  }

  /**
  //Test case number: 10
  /*Coverage entropy=1.5271837172395382
  */
  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      AdvancedSettings advancedSettings0 = new AdvancedSettings();
      advancedSettings0.setDebugNonBlockingMode(true);
      boolean boolean0 = advancedSettings0.getDebugNonBlockingMode();
      assertTrue(boolean0);
  }

  /**
  //Test case number: 11
  /*Coverage entropy=1.1217186091313738
  */
  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      AdvancedSettings advancedSettings0 = new AdvancedSettings();
      String string0 = advancedSettings0.getCharset();
      assertEquals("ISO-8859-1", string0);
      
      advancedSettings0.setCharset("ISO-8859-1");
      assertEquals(0, advancedSettings0.getPerformancePreferencesBandwidth());
      assertEquals((-1), advancedSettings0.getSocketLinger());
      assertTrue(advancedSettings0.getUseDirectByteBuffer());
      assertEquals(0, advancedSettings0.getPerformancePreferencesLatency());
      assertEquals(10, advancedSettings0.getMaxThreadsForNioWrite());
      assertEquals(0, advancedSettings0.getBacklog());
      assertEquals("org.quickserver.net.server.impl.OptimisticClientIdentifier", advancedSettings0.getClientIdentifier());
      assertFalse(advancedSettings0.getClientSocketTcpNoDelay());
      assertEquals(65536, advancedSettings0.getByteBufferSize());
      assertEquals(0, advancedSettings0.getPerformancePreferencesConnectionTime());
  }

  /**
  //Test case number: 12
  /*Coverage entropy=1.830738805564335
  */
  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      AdvancedSettings advancedSettings0 = new AdvancedSettings();
      advancedSettings0.setClientSocketReceiveBufferSize((-29));
      advancedSettings0.setUseDirectByteBuffer(false);
      boolean boolean0 = advancedSettings0.getUseDirectByteBuffer();
      assertEquals((-29), advancedSettings0.getClientSocketReceiveBufferSize());
      assertFalse(boolean0);
  }

  /**
  //Test case number: 13
  /*Coverage entropy=3.3273610261779543
  */
  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      AdvancedSettings advancedSettings0 = new AdvancedSettings();
      assertEquals((-1), advancedSettings0.getSocketLinger());
      
      advancedSettings0.setSocketLinger(0);
      advancedSettings0.getSocketLinger();
      advancedSettings0.toXML("On");
      advancedSettings0.getCharset();
      assertEquals(0, advancedSettings0.getSocketLinger());
  }

  /**
  //Test case number: 14
  /*Coverage entropy=0.4
  */
  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      AdvancedSettings advancedSettings0 = new AdvancedSettings();
      // Undeclared exception!
      try { 
        advancedSettings0.setCharset("b");
        fail("Expecting exception: UnsupportedCharsetException");
      
      } catch(UnsupportedCharsetException e) {
         //
         // b
         //
         verifyException("org.quickserver.util.xmlreader.AdvancedSettings", e);
      }
  }

  /**
  //Test case number: 15
  /*Coverage entropy=1.0931471805599453
  */
  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      AdvancedSettings advancedSettings0 = new AdvancedSettings();
      advancedSettings0.setCharset((String) null);
      assertEquals(65536, advancedSettings0.getByteBufferSize());
      assertEquals("ISO-8859-1", advancedSettings0.getCharset());
      assertEquals(0, advancedSettings0.getPerformancePreferencesBandwidth());
      assertEquals(0, advancedSettings0.getPerformancePreferencesLatency());
      assertEquals(0, advancedSettings0.getBacklog());
      assertEquals("org.quickserver.net.server.impl.OptimisticClientIdentifier", advancedSettings0.getClientIdentifier());
      assertEquals(10, advancedSettings0.getMaxThreadsForNioWrite());
      assertEquals(0, advancedSettings0.getPerformancePreferencesConnectionTime());
      assertFalse(advancedSettings0.getClientSocketTcpNoDelay());
      assertEquals((-1), advancedSettings0.getSocketLinger());
      assertTrue(advancedSettings0.getUseDirectByteBuffer());
  }

  /**
  //Test case number: 16
  /*Coverage entropy=1.5271837172395382
  */
  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      AdvancedSettings advancedSettings0 = new AdvancedSettings();
      advancedSettings0.setClientSocketSendBufferSize(18);
      int int0 = advancedSettings0.getClientSocketSendBufferSize();
      assertEquals(18, int0);
  }

  /**
  //Test case number: 17
  /*Coverage entropy=3.3210182221049966
  */
  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      AdvancedSettings advancedSettings0 = new AdvancedSettings();
      advancedSettings0.setClientSocketSendBufferSize(35);
      advancedSettings0.toXML("</performance-preferences-connection-time>\n");
      assertEquals(35, advancedSettings0.getClientSocketSendBufferSize());
  }

  /**
  //Test case number: 18
  /*Coverage entropy=1.5271837172395382
  */
  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      AdvancedSettings advancedSettings0 = new AdvancedSettings();
      advancedSettings0.setPerformancePreferencesBandwidth(1203);
      int int0 = advancedSettings0.getPerformancePreferencesBandwidth();
      assertEquals(1203, int0);
  }

  /**
  //Test case number: 19
  /*Coverage entropy=1.5271837172395382
  */
  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      AdvancedSettings advancedSettings0 = new AdvancedSettings();
      advancedSettings0.setQSObjectPoolMaker("");
      String string0 = advancedSettings0.getQSObjectPoolMaker();
      assertEquals(65536, advancedSettings0.getByteBufferSize());
      assertEquals(0, advancedSettings0.getBacklog());
      assertEquals("ISO-8859-1", advancedSettings0.getCharset());
      assertEquals(0, advancedSettings0.getPerformancePreferencesBandwidth());
      assertEquals("", string0);
      assertEquals(0, advancedSettings0.getPerformancePreferencesConnectionTime());
      assertFalse(advancedSettings0.getClientSocketTcpNoDelay());
      assertEquals("org.quickserver.net.server.impl.OptimisticClientIdentifier", advancedSettings0.getClientIdentifier());
      assertEquals(10, advancedSettings0.getMaxThreadsForNioWrite());
      assertEquals(0, advancedSettings0.getPerformancePreferencesLatency());
      assertEquals((-1), advancedSettings0.getSocketLinger());
      assertTrue(advancedSettings0.getUseDirectByteBuffer());
  }

  /**
  //Test case number: 20
  /*Coverage entropy=1.5271837172395382
  */
  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      AdvancedSettings advancedSettings0 = new AdvancedSettings();
      advancedSettings0.setClientSocketTrafficClass(" O{t$YV");
      advancedSettings0.getClientSocketTrafficClass();
      assertEquals(0, advancedSettings0.getPerformancePreferencesLatency());
      assertFalse(advancedSettings0.getClientSocketTcpNoDelay());
      assertEquals(10, advancedSettings0.getMaxThreadsForNioWrite());
      assertEquals("ISO-8859-1", advancedSettings0.getCharset());
      assertEquals(0, advancedSettings0.getBacklog());
      assertEquals("org.quickserver.net.server.impl.OptimisticClientIdentifier", advancedSettings0.getClientIdentifier());
      assertEquals(0, advancedSettings0.getPerformancePreferencesBandwidth());
      assertEquals((-1), advancedSettings0.getSocketLinger());
      assertEquals(65536, advancedSettings0.getByteBufferSize());
      assertTrue(advancedSettings0.getUseDirectByteBuffer());
      assertEquals(0, advancedSettings0.getPerformancePreferencesConnectionTime());
  }

  /**
  //Test case number: 21
  /*Coverage entropy=1.0931471805599453
  */
  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      AdvancedSettings advancedSettings0 = new AdvancedSettings();
      advancedSettings0.setByteBufferSize(0);
      assertEquals((-1), advancedSettings0.getSocketLinger());
      assertEquals(0, advancedSettings0.getPerformancePreferencesBandwidth());
      assertEquals(0, advancedSettings0.getPerformancePreferencesConnectionTime());
      assertEquals(0, advancedSettings0.getBacklog());
      assertEquals("org.quickserver.net.server.impl.OptimisticClientIdentifier", advancedSettings0.getClientIdentifier());
      assertTrue(advancedSettings0.getUseDirectByteBuffer());
      assertEquals(10, advancedSettings0.getMaxThreadsForNioWrite());
      assertFalse(advancedSettings0.getClientSocketTcpNoDelay());
      assertEquals(0, advancedSettings0.getPerformancePreferencesLatency());
      assertEquals("ISO-8859-1", advancedSettings0.getCharset());
      assertEquals(65536, advancedSettings0.getByteBufferSize());
  }

  /**
  //Test case number: 22
  /*Coverage entropy=0.4
  */
  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      AdvancedSettings advancedSettings0 = new AdvancedSettings();
      advancedSettings0.setByteBufferSize((-1561));
      assertEquals(10, advancedSettings0.getMaxThreadsForNioWrite());
      assertFalse(advancedSettings0.getClientSocketTcpNoDelay());
      assertEquals(0, advancedSettings0.getPerformancePreferencesConnectionTime());
      assertEquals((-1), advancedSettings0.getSocketLinger());
      assertEquals(0, advancedSettings0.getPerformancePreferencesBandwidth());
      assertEquals(65536, advancedSettings0.getByteBufferSize());
      assertEquals("ISO-8859-1", advancedSettings0.getCharset());
      assertTrue(advancedSettings0.getUseDirectByteBuffer());
      assertEquals(0, advancedSettings0.getPerformancePreferencesLatency());
      assertEquals(0, advancedSettings0.getBacklog());
      assertEquals("org.quickserver.net.server.impl.OptimisticClientIdentifier", advancedSettings0.getClientIdentifier());
  }

  /**
  //Test case number: 23
  /*Coverage entropy=1.830738805564335
  */
  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      AdvancedSettings advancedSettings0 = new AdvancedSettings();
      advancedSettings0.setPerformancePreferencesConnectionTime((-175));
      advancedSettings0.getPerformancePreferencesConnectionTime();
      advancedSettings0.getQSObjectPoolMaker();
      assertEquals((-175), advancedSettings0.getPerformancePreferencesConnectionTime());
  }

  /**
  //Test case number: 24
  /*Coverage entropy=2.063983366979555
  */
  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      AdvancedSettings advancedSettings0 = new AdvancedSettings();
      advancedSettings0.getSocketLinger();
      advancedSettings0.setClientSocketSendBufferSize((-1));
      advancedSettings0.getClientSocketSendBufferSize();
      advancedSettings0.getClientIdentifier();
      assertEquals((-1), advancedSettings0.getClientSocketSendBufferSize());
  }

  /**
  //Test case number: 25
  /*Coverage entropy=1.5271837172395382
  */
  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      AdvancedSettings advancedSettings0 = new AdvancedSettings();
      advancedSettings0.setClientSocketTrafficClass("");
      advancedSettings0.getClientSocketTrafficClass();
      assertEquals((-1), advancedSettings0.getSocketLinger());
      assertEquals(10, advancedSettings0.getMaxThreadsForNioWrite());
      assertEquals("org.quickserver.net.server.impl.OptimisticClientIdentifier", advancedSettings0.getClientIdentifier());
      assertEquals(0, advancedSettings0.getBacklog());
      assertEquals("ISO-8859-1", advancedSettings0.getCharset());
      assertEquals(0, advancedSettings0.getPerformancePreferencesBandwidth());
      assertEquals(0, advancedSettings0.getPerformancePreferencesLatency());
      assertEquals(65536, advancedSettings0.getByteBufferSize());
      assertTrue(advancedSettings0.getUseDirectByteBuffer());
      assertFalse(advancedSettings0.getClientSocketTcpNoDelay());
      assertEquals(0, advancedSettings0.getPerformancePreferencesConnectionTime());
  }

  /**
  //Test case number: 26
  /*Coverage entropy=3.3210182221049966
  */
  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      AdvancedSettings advancedSettings0 = new AdvancedSettings();
      advancedSettings0.setClientSocketTrafficClass("~zg|NYG2['Lf5");
      advancedSettings0.toXML("~zg|NYG2['Lf5");
      assertEquals((-1), advancedSettings0.getSocketLinger());
      assertEquals(0, advancedSettings0.getBacklog());
      assertEquals("ISO-8859-1", advancedSettings0.getCharset());
      assertEquals(65536, advancedSettings0.getByteBufferSize());
      assertEquals(0, advancedSettings0.getPerformancePreferencesBandwidth());
      assertEquals(10, advancedSettings0.getMaxThreadsForNioWrite());
      assertEquals("org.quickserver.net.server.impl.OptimisticClientIdentifier", advancedSettings0.getClientIdentifier());
      assertEquals(0, advancedSettings0.getPerformancePreferencesLatency());
      assertFalse(advancedSettings0.getClientSocketTcpNoDelay());
      assertTrue(advancedSettings0.getUseDirectByteBuffer());
      assertEquals(0, advancedSettings0.getPerformancePreferencesConnectionTime());
      assertEquals(0, advancedSettings0.getClientSocketSendBufferSize());
      assertEquals(0, advancedSettings0.getClientSocketReceiveBufferSize());
  }

  /**
  //Test case number: 27
  /*Coverage entropy=0.4
  */
  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      AdvancedSettings advancedSettings0 = new AdvancedSettings();
      // Undeclared exception!
      try { 
        advancedSettings0.setCharset("n=bh@msnj/P;x#C`n");
        fail("Expecting exception: IllegalCharsetNameException");
      
      } catch(IllegalCharsetNameException e) {
         //
         // n=bh@msnj/P;x#C`n
         //
         verifyException("java.nio.charset.Charset", e);
      }
  }

  /**
  //Test case number: 28
  /*Coverage entropy=2.070976373972562
  */
  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      AdvancedSettings advancedSettings0 = new AdvancedSettings();
      advancedSettings0.setSocketLinger((-3404));
      advancedSettings0.setClientSocketTcpNoDelay(true);
      advancedSettings0.setSocketLinger((-952));
      advancedSettings0.getClientSocketTcpNoDelay();
      int int0 = advancedSettings0.getByteBufferSize();
      assertEquals((-952), advancedSettings0.getSocketLinger());
      assertEquals(65536, int0);
  }

  /**
  //Test case number: 29
  /*Coverage entropy=1.5271837172395382
  */
  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      AdvancedSettings advancedSettings0 = new AdvancedSettings();
      advancedSettings0.setPerformancePreferencesLatency(1718);
      int int0 = advancedSettings0.getPerformancePreferencesLatency();
      assertEquals(1718, int0);
  }

  /**
  //Test case number: 30
  /*Coverage entropy=1.830738805564335
  */
  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      AdvancedSettings advancedSettings0 = new AdvancedSettings();
      assertEquals(10, advancedSettings0.getMaxThreadsForNioWrite());
      
      advancedSettings0.setMaxThreadsForNioWrite(0);
      advancedSettings0.getMaxThreadsForNioWrite();
      String string0 = advancedSettings0.getQSObjectPoolMaker();
      assertEquals("org.quickserver.util.pool.MakeQSObjectPool", string0);
  }

  /**
  //Test case number: 31
  /*Coverage entropy=1.5271837172395382
  */
  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      AdvancedSettings advancedSettings0 = new AdvancedSettings();
      advancedSettings0.setBacklog(0);
      int int0 = advancedSettings0.getMaxThreadsForNioWrite();
      assertEquals((-1), advancedSettings0.getSocketLinger());
      assertEquals(0, advancedSettings0.getPerformancePreferencesConnectionTime());
      assertFalse(advancedSettings0.getClientSocketTcpNoDelay());
      assertEquals(0, advancedSettings0.getPerformancePreferencesBandwidth());
      assertEquals(10, int0);
      assertEquals("ISO-8859-1", advancedSettings0.getCharset());
      assertEquals(65536, advancedSettings0.getByteBufferSize());
      assertEquals(0, advancedSettings0.getPerformancePreferencesLatency());
      assertTrue(advancedSettings0.getUseDirectByteBuffer());
      assertEquals("org.quickserver.net.server.impl.OptimisticClientIdentifier", advancedSettings0.getClientIdentifier());
      assertEquals(0, advancedSettings0.getBacklog());
  }

  /**
  //Test case number: 32
  /*Coverage entropy=1.1217186091313738
  */
  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      AdvancedSettings advancedSettings0 = new AdvancedSettings();
      advancedSettings0.getQSObjectPoolMaker();
      String string0 = advancedSettings0.getQSObjectPoolMaker();
      assertTrue(advancedSettings0.getUseDirectByteBuffer());
      assertEquals("org.quickserver.util.pool.MakeQSObjectPool", string0);
      assertEquals(0, advancedSettings0.getPerformancePreferencesBandwidth());
      assertFalse(advancedSettings0.getClientSocketTcpNoDelay());
      assertEquals(0, advancedSettings0.getPerformancePreferencesConnectionTime());
      assertEquals(0, advancedSettings0.getBacklog());
      assertEquals(0, advancedSettings0.getPerformancePreferencesLatency());
      assertNotNull(string0);
      assertEquals("ISO-8859-1", advancedSettings0.getCharset());
      assertEquals(65536, advancedSettings0.getByteBufferSize());
      assertEquals(10, advancedSettings0.getMaxThreadsForNioWrite());
      assertEquals("org.quickserver.net.server.impl.OptimisticClientIdentifier", advancedSettings0.getClientIdentifier());
      assertEquals((-1), advancedSettings0.getSocketLinger());
  }

  /**
  //Test case number: 33
  /*Coverage entropy=1.0931471805599453
  */
  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      AdvancedSettings advancedSettings0 = new AdvancedSettings();
      int int0 = advancedSettings0.getClientSocketSendBufferSize();
      assertEquals(0, advancedSettings0.getBacklog());
      assertEquals("org.quickserver.net.server.impl.OptimisticClientIdentifier", advancedSettings0.getClientIdentifier());
      assertEquals(10, advancedSettings0.getMaxThreadsForNioWrite());
      assertEquals(0, int0);
      assertFalse(advancedSettings0.getClientSocketTcpNoDelay());
      assertEquals(0, advancedSettings0.getPerformancePreferencesLatency());
      assertEquals(0, advancedSettings0.getPerformancePreferencesConnectionTime());
      assertEquals((-1), advancedSettings0.getSocketLinger());
      assertTrue(advancedSettings0.getUseDirectByteBuffer());
      assertEquals(65536, advancedSettings0.getByteBufferSize());
      assertEquals(0, advancedSettings0.getPerformancePreferencesBandwidth());
      assertEquals("ISO-8859-1", advancedSettings0.getCharset());
  }

  /**
  //Test case number: 34
  /*Coverage entropy=1.0931471805599453
  */
  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      AdvancedSettings advancedSettings0 = new AdvancedSettings();
      int int0 = advancedSettings0.getClientSocketReceiveBufferSize();
      assertEquals(65536, advancedSettings0.getByteBufferSize());
      assertEquals("ISO-8859-1", advancedSettings0.getCharset());
      assertTrue(advancedSettings0.getUseDirectByteBuffer());
      assertEquals(0, advancedSettings0.getPerformancePreferencesLatency());
      assertEquals(0, int0);
      assertEquals(0, advancedSettings0.getPerformancePreferencesBandwidth());
      assertEquals(0, advancedSettings0.getBacklog());
      assertEquals("org.quickserver.net.server.impl.OptimisticClientIdentifier", advancedSettings0.getClientIdentifier());
      assertEquals(10, advancedSettings0.getMaxThreadsForNioWrite());
      assertEquals((-1), advancedSettings0.getSocketLinger());
      assertFalse(advancedSettings0.getClientSocketTcpNoDelay());
      assertEquals(0, advancedSettings0.getPerformancePreferencesConnectionTime());
  }

  /**
  //Test case number: 35
  /*Coverage entropy=1.0931471805599453
  */
  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      AdvancedSettings advancedSettings0 = new AdvancedSettings();
      boolean boolean0 = advancedSettings0.getClientSocketTcpNoDelay();
      assertFalse(boolean0);
      assertEquals(0, advancedSettings0.getPerformancePreferencesConnectionTime());
      assertEquals((-1), advancedSettings0.getSocketLinger());
      assertTrue(advancedSettings0.getUseDirectByteBuffer());
      assertEquals(0, advancedSettings0.getBacklog());
      assertEquals("org.quickserver.net.server.impl.OptimisticClientIdentifier", advancedSettings0.getClientIdentifier());
      assertEquals(0, advancedSettings0.getPerformancePreferencesLatency());
      assertEquals(10, advancedSettings0.getMaxThreadsForNioWrite());
      assertEquals(65536, advancedSettings0.getByteBufferSize());
      assertEquals(0, advancedSettings0.getPerformancePreferencesBandwidth());
      assertEquals("ISO-8859-1", advancedSettings0.getCharset());
  }

  /**
  //Test case number: 36
  /*Coverage entropy=1.0931471805599453
  */
  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      AdvancedSettings advancedSettings0 = new AdvancedSettings();
      int int0 = advancedSettings0.getPerformancePreferencesBandwidth();
      assertEquals("ISO-8859-1", advancedSettings0.getCharset());
      assertEquals(65536, advancedSettings0.getByteBufferSize());
      assertEquals(0, advancedSettings0.getPerformancePreferencesLatency());
      assertTrue(advancedSettings0.getUseDirectByteBuffer());
      assertEquals("org.quickserver.net.server.impl.OptimisticClientIdentifier", advancedSettings0.getClientIdentifier());
      assertEquals(0, advancedSettings0.getBacklog());
      assertEquals(10, advancedSettings0.getMaxThreadsForNioWrite());
      assertEquals(0, int0);
      assertEquals((-1), advancedSettings0.getSocketLinger());
      assertEquals(0, advancedSettings0.getPerformancePreferencesConnectionTime());
      assertFalse(advancedSettings0.getClientSocketTcpNoDelay());
  }

  /**
  //Test case number: 37
  /*Coverage entropy=1.0931471805599453
  */
  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      AdvancedSettings advancedSettings0 = new AdvancedSettings();
      int int0 = advancedSettings0.getPerformancePreferencesLatency();
      assertEquals(65536, advancedSettings0.getByteBufferSize());
      assertEquals(0, int0);
      assertTrue(advancedSettings0.getUseDirectByteBuffer());
      assertEquals(0, advancedSettings0.getPerformancePreferencesConnectionTime());
      assertEquals(10, advancedSettings0.getMaxThreadsForNioWrite());
      assertEquals((-1), advancedSettings0.getSocketLinger());
      assertFalse(advancedSettings0.getClientSocketTcpNoDelay());
      assertEquals(0, advancedSettings0.getPerformancePreferencesBandwidth());
      assertEquals("ISO-8859-1", advancedSettings0.getCharset());
      assertEquals("org.quickserver.net.server.impl.OptimisticClientIdentifier", advancedSettings0.getClientIdentifier());
      assertEquals(0, advancedSettings0.getBacklog());
  }

  /**
  //Test case number: 38
  /*Coverage entropy=1.0931471805599453
  */
  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      AdvancedSettings advancedSettings0 = new AdvancedSettings();
      int int0 = advancedSettings0.getPerformancePreferencesConnectionTime();
      assertEquals(0, advancedSettings0.getPerformancePreferencesLatency());
      assertEquals(0, int0);
      assertEquals("ISO-8859-1", advancedSettings0.getCharset());
      assertEquals(65536, advancedSettings0.getByteBufferSize());
      assertTrue(advancedSettings0.getUseDirectByteBuffer());
      assertEquals((-1), advancedSettings0.getSocketLinger());
      assertEquals(0, advancedSettings0.getPerformancePreferencesBandwidth());
      assertFalse(advancedSettings0.getClientSocketTcpNoDelay());
      assertEquals(10, advancedSettings0.getMaxThreadsForNioWrite());
      assertEquals(0, advancedSettings0.getBacklog());
      assertEquals("org.quickserver.net.server.impl.OptimisticClientIdentifier", advancedSettings0.getClientIdentifier());
  }

  /**
  //Test case number: 39
  /*Coverage entropy=3.2590752087262675
  */
  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      AdvancedSettings advancedSettings0 = new AdvancedSettings();
      String string0 = advancedSettings0.toXML((String) null);
      assertEquals("<advanced-settings>\n\t<charset>ISO-8859-1</charset>\n\t<use-direct-byte-buffer>true</use-direct-byte-buffer>\n\t<byte-buffer-size>65536</byte-buffer-size>\n\t<backlog>0</backlog>\n\t<socket-linger>-1</socket-linger>\n\t<debug-non-blocking-mode>false</debug-non-blocking-mode>\n\t<client-identifier>org.quickserver.net.server.impl.OptimisticClientIdentifier</client-identifier>\n\t<qsobject-pool-maker>org.quickserver.util.pool.MakeQSObjectPool</qsobject-pool-maker>\n\t<max-threads-for-nio-write>10</max-threads-for-nio-write>\n\t<performance-preferences-connection-time>0</performance-preferences-connection-time>\n\t<performance-preferences-latency>0</performance-preferences-latency>\n\t<performance-preferences-bandwidth>0</performance-preferences-bandwidth>\n\t<client-socket-tcp-no-delay>false</client-socket-tcp-no-delay>\n</advanced-settings>\n", string0);
  }

  /**
  //Test case number: 40
  /*Coverage entropy=0.4
  */
  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      AdvancedSettings advancedSettings0 = new AdvancedSettings();
      advancedSettings0.setClientIdentifier("MLJsN>{<tK");
      assertEquals("MLJsN>{<tK", advancedSettings0.getClientIdentifier());
  }

  /**
  //Test case number: 41
  /*Coverage entropy=1.0931471805599453
  */
  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      AdvancedSettings advancedSettings0 = new AdvancedSettings();
      boolean boolean0 = advancedSettings0.getUseDirectByteBuffer();
      assertEquals((-1), advancedSettings0.getSocketLinger());
      assertEquals(0, advancedSettings0.getPerformancePreferencesBandwidth());
      assertEquals(0, advancedSettings0.getPerformancePreferencesConnectionTime());
      assertTrue(boolean0);
      assertEquals(65536, advancedSettings0.getByteBufferSize());
      assertEquals("ISO-8859-1", advancedSettings0.getCharset());
      assertEquals(0, advancedSettings0.getBacklog());
      assertEquals("org.quickserver.net.server.impl.OptimisticClientIdentifier", advancedSettings0.getClientIdentifier());
      assertEquals(10, advancedSettings0.getMaxThreadsForNioWrite());
      assertFalse(advancedSettings0.getClientSocketTcpNoDelay());
      assertEquals(0, advancedSettings0.getPerformancePreferencesLatency());
  }

  /**
  //Test case number: 42
  /*Coverage entropy=1.0931471805599453
  */
  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      AdvancedSettings advancedSettings0 = new AdvancedSettings();
      int int0 = advancedSettings0.getBacklog();
      assertEquals(65536, advancedSettings0.getByteBufferSize());
      assertEquals("ISO-8859-1", advancedSettings0.getCharset());
      assertTrue(advancedSettings0.getUseDirectByteBuffer());
      assertEquals(0, advancedSettings0.getPerformancePreferencesLatency());
      assertEquals(0, int0);
      assertEquals(0, advancedSettings0.getPerformancePreferencesBandwidth());
      assertEquals("org.quickserver.net.server.impl.OptimisticClientIdentifier", advancedSettings0.getClientIdentifier());
      assertEquals(10, advancedSettings0.getMaxThreadsForNioWrite());
      assertEquals((-1), advancedSettings0.getSocketLinger());
      assertFalse(advancedSettings0.getClientSocketTcpNoDelay());
      assertEquals(0, advancedSettings0.getPerformancePreferencesConnectionTime());
  }

  /**
  //Test case number: 43
  /*Coverage entropy=0.4
  */
  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      AdvancedSettings advancedSettings0 = new AdvancedSettings();
      advancedSettings0.setBacklog((-1940));
      assertEquals(0, advancedSettings0.getPerformancePreferencesBandwidth());
      assertEquals((-1), advancedSettings0.getSocketLinger());
      assertEquals(0, advancedSettings0.getPerformancePreferencesConnectionTime());
      assertEquals(65536, advancedSettings0.getByteBufferSize());
      assertEquals(0, advancedSettings0.getPerformancePreferencesLatency());
      assertEquals(0, advancedSettings0.getBacklog());
      assertEquals("ISO-8859-1", advancedSettings0.getCharset());
      assertEquals(10, advancedSettings0.getMaxThreadsForNioWrite());
      assertFalse(advancedSettings0.getClientSocketTcpNoDelay());
      assertTrue(advancedSettings0.getUseDirectByteBuffer());
      assertEquals("org.quickserver.net.server.impl.OptimisticClientIdentifier", advancedSettings0.getClientIdentifier());
  }
}
