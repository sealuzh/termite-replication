  public void test30()  throws Throwable  {
      TheClient theClient0 = new TheClient();
      theClient0.getServer();
      assertFalse(theClient0.getTrusted());
      assertTrue(theClient0.getCommunicationLogging());
  }
