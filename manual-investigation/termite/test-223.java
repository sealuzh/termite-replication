  public void test26()  throws Throwable  {
      TheClient theClient0 = new TheClient();
      theClient0.setClientBinaryHandler((ClientBinaryHandler) null);
      assertTrue(theClient0.getCommunicationLogging());
      assertFalse(theClient0.getTrusted());
  }
