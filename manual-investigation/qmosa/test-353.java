  public void test46()  throws Throwable  {
      AdvancedSettings advancedSettings0 = new AdvancedSettings();
      advancedSettings0.setClientIdentifier((String) null);
      assertEquals("org.quickserver.net.server.impl.OptimisticClientIdentifier", advancedSettings0.getClientIdentifier());
      assertEquals("ISO-8859-1", advancedSettings0.getCharset());
      assertEquals(0, advancedSettings0.getBacklog());
      assertEquals(65536, advancedSettings0.getByteBufferSize());
      assertEquals(0, advancedSettings0.getPerformancePreferencesBandwidth());
      assertEquals(0, advancedSettings0.getPerformancePreferencesConnectionTime());
      assertEquals(10, advancedSettings0.getMaxThreadsForNioWrite());
      assertTrue(advancedSettings0.getUseDirectByteBuffer());
      assertEquals((-1), advancedSettings0.getSocketLinger());
      assertFalse(advancedSettings0.getClientSocketTcpNoDelay());
      assertEquals(0, advancedSettings0.getPerformancePreferencesLatency());
  }
