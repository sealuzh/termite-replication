  public void test44()  throws Throwable  {
      AdvancedSettings advancedSettings0 = new AdvancedSettings();
      advancedSettings0.setQSObjectPoolMaker("");
      String string0 = advancedSettings0.getQSObjectPoolMaker();
      assertEquals(65536, advancedSettings0.getByteBufferSize());
      assertEquals("ISO-8859-1", advancedSettings0.getCharset());
      assertEquals(0, advancedSettings0.getPerformancePreferencesBandwidth());
      assertEquals(10, advancedSettings0.getMaxThreadsForNioWrite());
      assertEquals("", string0);
      assertEquals(0, advancedSettings0.getBacklog());
      assertEquals("org.quickserver.net.server.impl.OptimisticClientIdentifier", advancedSettings0.getClientIdentifier());
      assertEquals(0, advancedSettings0.getPerformancePreferencesConnectionTime());
      assertEquals(0, advancedSettings0.getPerformancePreferencesLatency());
      assertTrue(advancedSettings0.getUseDirectByteBuffer());
      assertEquals((-1), advancedSettings0.getSocketLinger());
      assertFalse(advancedSettings0.getClientSocketTcpNoDelay());
  }
