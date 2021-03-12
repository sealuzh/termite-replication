  public void test66()  throws Throwable  {
      AdvancedSettings advancedSettings0 = new AdvancedSettings();
      advancedSettings0.setClientSocketReceiveBufferSize((-3021));
      advancedSettings0.toXML("");
      assertEquals((-3021), advancedSettings0.getClientSocketReceiveBufferSize());
  }
