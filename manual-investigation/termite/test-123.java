  public void test14()  throws Throwable  {
      AdvancedSettings advancedSettings0 = new AdvancedSettings();
      advancedSettings0.setClientSocketSendBufferSize((-2472));
      int int0 = advancedSettings0.getClientSocketSendBufferSize();
      assertEquals((-2472), int0);
  }
