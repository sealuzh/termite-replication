  public void test58()  throws Throwable  {
      TheClient theClient0 = new TheClient();
      theClient0.getClientCommandHandler();
      assertFalse(theClient0.getTrusted());
      assertTrue(theClient0.getCommunicationLogging());
  }
