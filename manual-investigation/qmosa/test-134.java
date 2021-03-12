  public void test01()  throws Throwable  {
      AdvancedSettings advancedSettings0 = new AdvancedSettings();
      int int0 = advancedSettings0.getSocketLinger();
      assertEquals(0, advancedSettings0.getPerformancePreferencesLatency());
      assertEquals("ISO-8859-1", advancedSettings0.getCharset());
      assertEquals(65536, advancedSettings0.getByteBufferSize());
      assertEquals(10, advancedSettings0.getMaxThreadsForNioWrite());
      assertEquals(0, advancedSettings0.getBacklog());
      assertEquals("org.quickserver.net.server.impl.OptimisticClientIdentifier", advancedSettings0.getClientIdentifier());
      assertEquals(0, advancedSettings0.getPerformancePreferencesBandwidth());
      assertFalse(advancedSettings0.getClientSocketTcpNoDelay());
      assertEquals((-1), int0);
      assertTrue(advancedSettings0.getUseDirectByteBuffer());
      assertEquals(0, advancedSettings0.getPerformancePreferencesConnectionTime());
  }
