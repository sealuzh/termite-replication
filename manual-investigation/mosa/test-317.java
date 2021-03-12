  public void test14()  throws Throwable  {
      AdvancedSettings advancedSettings0 = new AdvancedSettings();
      advancedSettings0.setClientSocketReceiveBufferSize(1);
      int int0 = advancedSettings0.getClientSocketReceiveBufferSize();
      assertEquals(1, int0);
  }
