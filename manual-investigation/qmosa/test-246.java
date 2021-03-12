  public void test43()  throws Throwable  {
      AdvancedSettings advancedSettings0 = new AdvancedSettings();
      advancedSettings0.setBacklog(0);
      assertEquals(0, advancedSettings0.getPerformancePreferencesBandwidth());
      assertEquals((-1), advancedSettings0.getSocketLinger());
      assertTrue(advancedSettings0.getUseDirectByteBuffer());
      assertFalse(advancedSettings0.getClientSocketTcpNoDelay());
      assertEquals(0, advancedSettings0.getPerformancePreferencesConnectionTime());
      assertEquals(0, advancedSettings0.getPerformancePreferencesLatency());
      assertEquals(65536, advancedSettings0.getByteBufferSize());
      assertEquals(10, advancedSettings0.getMaxThreadsForNioWrite());
      assertEquals(0, advancedSettings0.getBacklog());
      assertEquals("org.quickserver.net.server.impl.OptimisticClientIdentifier", advancedSettings0.getClientIdentifier());
      assertEquals("ISO-8859-1", advancedSettings0.getCharset());
  }
