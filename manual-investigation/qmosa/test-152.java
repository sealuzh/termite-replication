  public void test23()  throws Throwable  {
      AdvancedSettings advancedSettings0 = new AdvancedSettings();
      advancedSettings0.toXML("<advanced-settings>\n\t<charset>ISO-8859-1</charset>\n\t<use-direct-byte-buffer>false</use-direct-byte-buffer>\n\t<byte-buffer-size>65536</byte-buffer-size>\n\t<backlog>0</backlog>\n\t<socket-linger>-1</socket-linger>\n\t<debug-non-blocking-mode>false</debug-non-blocking-mode>\n\t<client-identifier>org.quickserver.net.server.impl.OptimisticClientIdentifier</client-identifier>\n\t<qsobject-pool-maker>org.quickserver.util.pool.MakeQSObjectPool</qsobject-pool-maker>\n\t<max-threads-for-nio-write>2258</max-threads-for-nio-write>\n\t<performance-preferences-connection-time>0</performance-preferences-connection-time>\n\t<performance-preferences-latency>0</performance-preferences-latency>\n\t<performance-preferences-bandwidth>0</performance-preferences-bandwidth>\n\t<client-socket-tcp-no-delay>false</client-socket-tcp-no-delay>\n\t<client-socket-traffic-class>_)Mt%hO26 (3VHvXU?</client-socket-traffic-class>\n</advanced-settings>\n");
      assertTrue(advancedSettings0.getUseDirectByteBuffer());
      assertEquals(0, advancedSettings0.getPerformancePreferencesBandwidth());
      assertEquals(0, advancedSettings0.getBacklog());
      assertEquals("org.quickserver.net.server.impl.OptimisticClientIdentifier", advancedSettings0.getClientIdentifier());
      assertEquals(10, advancedSettings0.getMaxThreadsForNioWrite());
      assertEquals((-1), advancedSettings0.getSocketLinger());
      assertEquals(65536, advancedSettings0.getByteBufferSize());
      assertEquals("ISO-8859-1", advancedSettings0.getCharset());
      assertEquals(0, advancedSettings0.getClientSocketReceiveBufferSize());
      assertEquals(0, advancedSettings0.getPerformancePreferencesLatency());
      assertFalse(advancedSettings0.getClientSocketTcpNoDelay());
      assertEquals(0, advancedSettings0.getPerformancePreferencesConnectionTime());
      assertEquals(0, advancedSettings0.getClientSocketSendBufferSize());
  }
