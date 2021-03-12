  public void test16()  throws Throwable  {
      AdvancedSettings advancedSettings0 = new AdvancedSettings();
      advancedSettings0.setClientSocketReceiveBufferSize(1098);
      int int0 = advancedSettings0.getClientSocketReceiveBufferSize();
      assertEquals(1098, int0);
  }
