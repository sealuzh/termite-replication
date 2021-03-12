  public void test20()  throws Throwable  {
      AdvancedSettings advancedSettings0 = new AdvancedSettings();
      int int0 = advancedSettings0.getByteBufferSize();
      assertEquals(0, advancedSettings0.getPerformancePreferencesLatency());
      assertEquals("ISO-8859-1", advancedSettings0.getCharset());
      assertEquals("org.quickserver.net.server.impl.OptimisticClientIdentifier", advancedSettings0.getClientIdentifier());
      assertEquals(0, advancedSettings0.getBacklog());
      assertEquals(10, advancedSettings0.getMaxThreadsForNioWrite());
      assertTrue(advancedSettings0.getUseDirectByteBuffer());
      assertFalse(advancedSettings0.getClientSocketTcpNoDelay());
      assertEquals(65536, int0);
      assertEquals(0, advancedSettings0.getPerformancePreferencesBandwidth());
      assertEquals((-1), advancedSettings0.getSocketLinger());
      assertEquals(0, advancedSettings0.getPerformancePreferencesConnectionTime());
  }
