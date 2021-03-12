  public void test46()  throws Throwable  {
      TheClient theClient0 = new TheClient();
      theClient0.getAuthenticator();
      assertFalse(theClient0.getTrusted());
      assertTrue(theClient0.getCommunicationLogging());
  }
