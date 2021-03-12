  public void test40()  throws Throwable  {
      TheClient theClient0 = new TheClient();
      theClient0.getClientData();
      assertFalse(theClient0.getTrusted());
      assertTrue(theClient0.getCommunicationLogging());
  }
