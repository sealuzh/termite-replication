  public void test37()  throws Throwable  {
      TheClient theClient0 = new TheClient();
      theClient0.getClientExtendedEventHandler();
      assertTrue(theClient0.getCommunicationLogging());
      assertFalse(theClient0.getTrusted());
  }
