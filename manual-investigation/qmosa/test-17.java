  public void test37()  throws Throwable  {
      AdvancedSettings advancedSettings0 = new AdvancedSettings();
      advancedSettings0.setClientSocketTrafficClass("");
      advancedSettings0.getClientSocketTrafficClass();
      assertEquals(65536, advancedSettings0.getByteBufferSize());
      assertEquals(0, advancedSettings0.getPerformancePreferencesLatency());
      assertFalse(advancedSettings0.getClientSocketTcpNoDelay());
      assertTrue(advancedSettings0.getUseDirectByteBuffer());
      assertEquals(0, advancedSettings0.getPerformancePreferencesConnectionTime());
      assertEquals(0, advancedSettings0.getPerformancePreferencesBandwidth());
      assertEquals((-1), advancedSettings0.getSocketLinger());
      assertEquals(10, advancedSettings0.getMaxThreadsForNioWrite());
      assertEquals("org.quickserver.net.server.impl.OptimisticClientIdentifier", advancedSettings0.getClientIdentifier());
      assertEquals(0, advancedSettings0.getBacklog());
      assertEquals("ISO-8859-1", advancedSettings0.getCharset());
  }
