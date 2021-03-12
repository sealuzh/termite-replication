  public void test60()  throws Throwable  {
      AdvancedSettings advancedSettings0 = new AdvancedSettings();
      advancedSettings0.setClientSocketSendBufferSize(1879);
      advancedSettings0.toXML("org.quickserver.util.pool.MakeQSObjectPool");
      assertEquals(1879, advancedSettings0.getClientSocketSendBufferSize());
  }
