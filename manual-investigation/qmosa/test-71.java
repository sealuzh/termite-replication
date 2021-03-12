  public void test21()  throws Throwable  {
      TheClient theClient0 = new TheClient();
      org.quickserver.net.qsadmin.Authenticator authenticator0 = new org.quickserver.net.qsadmin.Authenticator();
      theClient0.setClientAuthenticationHandler(authenticator0);
      theClient0.getClientAuthenticationHandler();
      assertTrue(theClient0.getCommunicationLogging());
      assertFalse(theClient0.getTrusted());
  }
