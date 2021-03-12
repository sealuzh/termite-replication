  public void test19()  throws Throwable  {
      TheClient theClient0 = new TheClient();
      theClient0.setClientAuthenticationHandler((ClientAuthenticationHandler) null);
      assertFalse(theClient0.getTrusted());
      assertTrue(theClient0.getCommunicationLogging());
  }
