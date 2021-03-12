  public void test39()  throws Throwable  {
      AdvancedSettings advancedSettings0 = new AdvancedSettings();
      advancedSettings0.setClientSocketSendBufferSize(0);
      assertTrue(advancedSettings0.getUseDirectByteBuffer());
      assertEquals(0, advancedSettings0.getPerformancePreferencesBandwidth());
      assertEquals((-1), advancedSettings0.getSocketLinger());
      assertEquals(65536, advancedSettings0.getByteBufferSize());
      assertEquals(0, advancedSettings0.getPerformancePreferencesConnectionTime());
      assertEquals(0, advancedSettings0.getClientSocketSendBufferSize());
      assertEquals(0, advancedSettings0.getPerformancePreferencesLatency());
      assertFalse(advancedSettings0.getClientSocketTcpNoDelay());
      assertEquals(10, advancedSettings0.getMaxThreadsForNioWrite());
      assertEquals("ISO-8859-1", advancedSettings0.getCharset());
      assertEquals("org.quickserver.net.server.impl.OptimisticClientIdentifier", advancedSettings0.getClientIdentifier());
      assertEquals(0, advancedSettings0.getBacklog());
  }
