  public void test17()  throws Throwable  {
      AdvancedSettings advancedSettings0 = new AdvancedSettings();
      int int0 = advancedSettings0.getByteBufferSize();
      assertEquals(10, advancedSettings0.getMaxThreadsForNioWrite());
      assertFalse(advancedSettings0.getClientSocketTcpNoDelay());
      assertEquals(0, advancedSettings0.getBacklog());
      assertEquals("org.quickserver.net.server.impl.OptimisticClientIdentifier", advancedSettings0.getClientIdentifier());
      assertEquals(0, advancedSettings0.getPerformancePreferencesConnectionTime());
      assertEquals(0, advancedSettings0.getPerformancePreferencesBandwidth());
      assertEquals(65536, int0);
      assertTrue(advancedSettings0.getUseDirectByteBuffer());
      assertEquals("ISO-8859-1", advancedSettings0.getCharset());
      assertEquals((-1), advancedSettings0.getSocketLinger());
      assertEquals(0, advancedSettings0.getPerformancePreferencesLatency());
  }
