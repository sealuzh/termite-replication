  public void test00()  throws Throwable  {
      AdvancedSettings advancedSettings0 = new AdvancedSettings();
      boolean boolean0 = advancedSettings0.getUseDirectByteBuffer();
      assertEquals(65536, advancedSettings0.getByteBufferSize());
      assertTrue(boolean0);
      assertEquals(0, advancedSettings0.getPerformancePreferencesLatency());
      assertEquals((-1), advancedSettings0.getSocketLinger());
      assertEquals(0, advancedSettings0.getPerformancePreferencesConnectionTime());
      assertEquals("org.quickserver.net.server.impl.OptimisticClientIdentifier", advancedSettings0.getClientIdentifier());
      assertFalse(advancedSettings0.getClientSocketTcpNoDelay());
      assertEquals(0, advancedSettings0.getBacklog());
      assertEquals(10, advancedSettings0.getMaxThreadsForNioWrite());
      assertEquals(0, advancedSettings0.getPerformancePreferencesBandwidth());
      assertEquals("ISO-8859-1", advancedSettings0.getCharset());
  }
