  public void test45()  throws Throwable  {
      TheClient theClient0 = new TheClient();
      theClient0.getServer();
      assertTrue(theClient0.getCommunicationLogging());
      assertFalse(theClient0.getTrusted());
  }
