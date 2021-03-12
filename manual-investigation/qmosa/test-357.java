  public void test32()  throws Throwable  {
      AdvancedSettings advancedSettings0 = new AdvancedSettings();
      advancedSettings0.setPerformancePreferencesBandwidth(0);
      assertEquals("org.quickserver.net.server.impl.OptimisticClientIdentifier", advancedSettings0.getClientIdentifier());
      assertFalse(advancedSettings0.getClientSocketTcpNoDelay());
      assertEquals(0, advancedSettings0.getBacklog());
      assertEquals(65536, advancedSettings0.getByteBufferSize());
      assertEquals(0, advancedSettings0.getPerformancePreferencesConnectionTime());
      assertEquals(0, advancedSettings0.getPerformancePreferencesBandwidth());
      assertTrue(advancedSettings0.getUseDirectByteBuffer());
      assertEquals((-1), advancedSettings0.getSocketLinger());
      assertEquals("ISO-8859-1", advancedSettings0.getCharset());
      assertEquals(0, advancedSettings0.getPerformancePreferencesLatency());
      assertEquals(10, advancedSettings0.getMaxThreadsForNioWrite());
  }
