  public void test15()  throws Throwable  {
      AdvancedSettings advancedSettings0 = new AdvancedSettings();
      advancedSettings0.setClientSocketSendBufferSize((-3588));
      int int0 = advancedSettings0.getClientSocketSendBufferSize();
      assertEquals((-3588), int0);
  }
