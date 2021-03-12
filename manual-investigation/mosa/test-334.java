  public void test38()  throws Throwable  {
      TheClient theClient0 = new TheClient();
      theClient0.setAuthenticator((Authenticator) null);
      assertTrue(theClient0.getCommunicationLogging());
      assertFalse(theClient0.getTrusted());
  }
