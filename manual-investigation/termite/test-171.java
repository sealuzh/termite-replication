  public void test11()  throws Throwable  {
      AdvancedSettings advancedSettings0 = new AdvancedSettings();
      boolean boolean0 = advancedSettings0.getClientSocketTcpNoDelay();
      assertEquals(65536, advancedSettings0.getByteBufferSize());
      assertEquals("ISO-8859-1", advancedSettings0.getCharset());
      assertEquals(0, advancedSettings0.getPerformancePreferencesBandwidth());
      assertEquals("org.quickserver.net.server.impl.OptimisticClientIdentifier", advancedSettings0.getClientIdentifier());
      assertEquals(0, advancedSettings0.getBacklog());
      assertEquals(10, advancedSettings0.getMaxThreadsForNioWrite());
      assertEquals((-1), advancedSettings0.getSocketLinger());
      assertFalse(boolean0);
      assertEquals(0, advancedSettings0.getPerformancePreferencesLatency());
      assertEquals(0, advancedSettings0.getPerformancePreferencesConnectionTime());
      assertTrue(advancedSettings0.getUseDirectByteBuffer());
  }
