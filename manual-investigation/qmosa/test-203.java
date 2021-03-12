  public void test42()  throws Throwable  {
      TheClient theClient0 = new TheClient();
      theClient0.getClientEvent();
      assertFalse(theClient0.getTrusted());
      assertTrue(theClient0.getCommunicationLogging());
  }
