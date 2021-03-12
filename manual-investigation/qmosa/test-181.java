  public void test02()  throws Throwable  {
      AdvancedSettings advancedSettings0 = new AdvancedSettings();
      String string0 = advancedSettings0.getQSObjectPoolMaker();
      assertEquals((-1), advancedSettings0.getSocketLinger());
      assertEquals(0, advancedSettings0.getPerformancePreferencesLatency());
      assertEquals(65536, advancedSettings0.getByteBufferSize());
      assertEquals(0, advancedSettings0.getBacklog());
      assertEquals(0, advancedSettings0.getPerformancePreferencesBandwidth());
      assertNotNull(string0);
      assertEquals(0, advancedSettings0.getPerformancePreferencesConnectionTime());
      assertEquals(10, advancedSettings0.getMaxThreadsForNioWrite());
      assertFalse(advancedSettings0.getClientSocketTcpNoDelay());
      assertTrue(advancedSettings0.getUseDirectByteBuffer());
      assertEquals("org.quickserver.util.pool.MakeQSObjectPool", string0);
      assertEquals("org.quickserver.net.server.impl.OptimisticClientIdentifier", advancedSettings0.getClientIdentifier());
      assertEquals("ISO-8859-1", advancedSettings0.getCharset());
  }
