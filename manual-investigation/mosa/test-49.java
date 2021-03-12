  public void test07()  throws Throwable  {
      AdvancedSettings advancedSettings0 = new AdvancedSettings();
      advancedSettings0.getDebugNonBlockingMode();
      assertEquals(0, advancedSettings0.getPerformancePreferencesBandwidth());
      assertEquals(0, advancedSettings0.getPerformancePreferencesConnectionTime());
      assertEquals(65536, advancedSettings0.getByteBufferSize());
      assertEquals("ISO-8859-1", advancedSettings0.getCharset());
      assertEquals(0, advancedSettings0.getPerformancePreferencesLatency());
      assertEquals(0, advancedSettings0.getBacklog());
      assertEquals("org.quickserver.net.server.impl.OptimisticClientIdentifier", advancedSettings0.getClientIdentifier());
      assertEquals(10, advancedSettings0.getMaxThreadsForNioWrite());
      assertTrue(advancedSettings0.getUseDirectByteBuffer());
      assertFalse(advancedSettings0.getClientSocketTcpNoDelay());
      assertEquals((-1), advancedSettings0.getSocketLinger());
  }
