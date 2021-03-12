  public void test60()  throws Throwable  {
      AdvancedSettings advancedSettings0 = new AdvancedSettings();
      advancedSettings0.setClientSocketSendBufferSize((-3588));
      advancedSettings0.toXML("");
      assertEquals((-3588), advancedSettings0.getClientSocketSendBufferSize());
  }
