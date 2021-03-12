  public void test36()  throws Throwable  {
      AdvancedSettings advancedSettings0 = new AdvancedSettings();
      advancedSettings0.setClientSocketSendBufferSize(0);
      assertEquals(0, advancedSettings0.getPerformancePreferencesBandwidth());
      assertEquals((-1), advancedSettings0.getSocketLinger());
      assertEquals(65536, advancedSettings0.getByteBufferSize());
      assertTrue(advancedSettings0.getUseDirectByteBuffer());
      assertEquals(0, advancedSettings0.getClientSocketSendBufferSize());
      assertEquals(0, advancedSettings0.getPerformancePreferencesConnectionTime());
      assertFalse(advancedSettings0.getClientSocketTcpNoDelay());
      assertEquals(0, advancedSettings0.getPerformancePreferencesLatency());
      assertEquals(10, advancedSettings0.getMaxThreadsForNioWrite());
      assertEquals("ISO-8859-1", advancedSettings0.getCharset());
      assertEquals("org.quickserver.net.server.impl.OptimisticClientIdentifier", advancedSettings0.getClientIdentifier());
      assertEquals(0, advancedSettings0.getBacklog());
  }
