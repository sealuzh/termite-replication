  public void test13()  throws Throwable  {
      AdvancedSettings advancedSettings0 = new AdvancedSettings();
      advancedSettings0.setClientSocketSendBufferSize(1);
      int int0 = advancedSettings0.getClientSocketSendBufferSize();
      assertEquals(1, int0);
  }
