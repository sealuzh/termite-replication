  public void test12()  throws Throwable  {
      AdvancedSettings advancedSettings0 = new AdvancedSettings();
      advancedSettings0.setClientSocketSendBufferSize(1879);
      int int0 = advancedSettings0.getClientSocketSendBufferSize();
      assertEquals(1879, int0);
  }
