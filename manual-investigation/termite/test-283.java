  public void test10()  throws Throwable  {
      AdvancedSettings advancedSettings0 = new AdvancedSettings();
      advancedSettings0.setClientSocketTrafficClass("=iJ=1=OYbk&");
      advancedSettings0.getClientSocketTrafficClass();
      assertEquals(0, advancedSettings0.getPerformancePreferencesConnectionTime());
      assertEquals(10, advancedSettings0.getMaxThreadsForNioWrite());
      assertEquals((-1), advancedSettings0.getSocketLinger());
      assertEquals(0, advancedSettings0.getPerformancePreferencesBandwidth());
      assertFalse(advancedSettings0.getClientSocketTcpNoDelay());
      assertEquals(65536, advancedSettings0.getByteBufferSize());
      assertEquals("ISO-8859-1", advancedSettings0.getCharset());
      assertTrue(advancedSettings0.getUseDirectByteBuffer());
      assertEquals(0, advancedSettings0.getPerformancePreferencesLatency());
      assertEquals("org.quickserver.net.server.impl.OptimisticClientIdentifier", advancedSettings0.getClientIdentifier());
      assertEquals(0, advancedSettings0.getBacklog());
  }
