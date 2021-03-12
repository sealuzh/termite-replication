  public void test57()  throws Throwable  {
      TheClient theClient0 = new TheClient();
      theClient0.setClientExtendedEventHandler((ClientExtendedEventHandler) null);
      assertTrue(theClient0.getCommunicationLogging());
      assertFalse(theClient0.getTrusted());
  }
