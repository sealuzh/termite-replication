  public void test59()  throws Throwable  {
      AdvancedSettings advancedSettings0 = new AdvancedSettings();
      advancedSettings0.setDebugNonBlockingMode(false);
      assertEquals(0, advancedSettings0.getPerformancePreferencesConnectionTime());
      assertEquals((-1), advancedSettings0.getSocketLinger());
      assertEquals(0, advancedSettings0.getPerformancePreferencesBandwidth());
      assertFalse(advancedSettings0.getDebugNonBlockingMode());
      assertEquals(65536, advancedSettings0.getByteBufferSize());
      assertEquals("ISO-8859-1", advancedSettings0.getCharset());
      assertTrue(advancedSettings0.getUseDirectByteBuffer());
      assertEquals("org.quickserver.net.server.impl.OptimisticClientIdentifier", advancedSettings0.getClientIdentifier());
      assertEquals(0, advancedSettings0.getBacklog());
      assertEquals(10, advancedSettings0.getMaxThreadsForNioWrite());
      assertEquals(0, advancedSettings0.getPerformancePreferencesLatency());
      assertFalse(advancedSettings0.getClientSocketTcpNoDelay());
  }
