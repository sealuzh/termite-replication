  public void test57()  throws Throwable  {
      AdvancedSettings advancedSettings0 = new AdvancedSettings();
      advancedSettings0.setClientSocketTrafficClass("org.quickserver.util.xmlreader.AdvancedSettings");
      advancedSettings0.toXML("org.quickserver.util.xmlreader.AdvancedSettings");
      assertTrue(advancedSettings0.getUseDirectByteBuffer());
      assertEquals(0, advancedSettings0.getPerformancePreferencesLatency());
      assertEquals(0, advancedSettings0.getPerformancePreferencesBandwidth());
      assertEquals(0, advancedSettings0.getBacklog());
      assertFalse(advancedSettings0.getClientSocketTcpNoDelay());
      assertEquals(0, advancedSettings0.getClientSocketSendBufferSize());
      assertEquals(0, advancedSettings0.getClientSocketReceiveBufferSize());
      assertEquals(0, advancedSettings0.getPerformancePreferencesConnectionTime());
      assertEquals(65536, advancedSettings0.getByteBufferSize());
      assertEquals("org.quickserver.net.server.impl.OptimisticClientIdentifier", advancedSettings0.getClientIdentifier());
      assertEquals("ISO-8859-1", advancedSettings0.getCharset());
      assertEquals(10, advancedSettings0.getMaxThreadsForNioWrite());
      assertEquals((-1), advancedSettings0.getSocketLinger());
  }
