  public void test60()  throws Throwable  {
      AdvancedSettings advancedSettings0 = new AdvancedSettings();
      advancedSettings0.setClientSocketSendBufferSize(65536);
      advancedSettings0.toXML("ISO-8859-1");
      assertEquals(65536, advancedSettings0.getClientSocketSendBufferSize());
  }
