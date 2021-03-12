  public void test47()  throws Throwable  {
      AdvancedSettings advancedSettings0 = new AdvancedSettings();
      advancedSettings0.setBacklog((-5128));
      assertEquals(0, advancedSettings0.getBacklog());
      assertFalse(advancedSettings0.getClientSocketTcpNoDelay());
      assertEquals("org.quickserver.net.server.impl.OptimisticClientIdentifier", advancedSettings0.getClientIdentifier());
      assertEquals(10, advancedSettings0.getMaxThreadsForNioWrite());
      assertEquals(0, advancedSettings0.getPerformancePreferencesBandwidth());
      assertEquals("ISO-8859-1", advancedSettings0.getCharset());
      assertTrue(advancedSettings0.getUseDirectByteBuffer());
      assertEquals(65536, advancedSettings0.getByteBufferSize());
      assertEquals(0, advancedSettings0.getPerformancePreferencesLatency());
      assertEquals((-1), advancedSettings0.getSocketLinger());
      assertEquals(0, advancedSettings0.getPerformancePreferencesConnectionTime());
  }
