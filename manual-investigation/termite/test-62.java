  public void test40()  throws Throwable  {
      TheClient theClient0 = new TheClient();
      theClient0.getClientAuthenticationHandler();
      assertFalse(theClient0.getTrusted());
      assertTrue(theClient0.getCommunicationLogging());
  }
