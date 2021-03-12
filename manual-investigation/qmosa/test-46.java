  public void test42()  throws Throwable  {
      AdvancedSettings advancedSettings0 = new AdvancedSettings();
      advancedSettings0.setByteBufferSize((-1415));
      assertEquals(10, advancedSettings0.getMaxThreadsForNioWrite());
      assertFalse(advancedSettings0.getClientSocketTcpNoDelay());
      assertEquals((-1), advancedSettings0.getSocketLinger());
      assertEquals(0, advancedSettings0.getPerformancePreferencesConnectionTime());
      assertTrue(advancedSettings0.getUseDirectByteBuffer());
      assertEquals(65536, advancedSettings0.getByteBufferSize());
      assertEquals(0, advancedSettings0.getPerformancePreferencesLatency());
      assertEquals(0, advancedSettings0.getPerformancePreferencesBandwidth());
      assertEquals("org.quickserver.net.server.impl.OptimisticClientIdentifier", advancedSettings0.getClientIdentifier());
      assertEquals(0, advancedSettings0.getBacklog());
      assertEquals("ISO-8859-1", advancedSettings0.getCharset());
  }
