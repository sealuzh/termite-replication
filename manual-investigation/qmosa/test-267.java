  public void test61()  throws Throwable  {
      AdvancedSettings advancedSettings0 = new AdvancedSettings();
      advancedSettings0.setClientSocketTcpNoDelay(false);
      assertEquals(0, advancedSettings0.getPerformancePreferencesBandwidth());
      assertEquals((-1), advancedSettings0.getSocketLinger());
      assertEquals(10, advancedSettings0.getMaxThreadsForNioWrite());
      assertEquals(0, advancedSettings0.getBacklog());
      assertEquals("org.quickserver.net.server.impl.OptimisticClientIdentifier", advancedSettings0.getClientIdentifier());
      assertEquals("ISO-8859-1", advancedSettings0.getCharset());
      assertEquals(0, advancedSettings0.getPerformancePreferencesLatency());
      assertEquals(65536, advancedSettings0.getByteBufferSize());
      assertFalse(advancedSettings0.getClientSocketTcpNoDelay());
      assertTrue(advancedSettings0.getUseDirectByteBuffer());
      assertEquals(0, advancedSettings0.getPerformancePreferencesConnectionTime());
  }
