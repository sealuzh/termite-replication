  public void test27()  throws Throwable  {
      TheClient theClient0 = new TheClient();
      theClient0.getTimeoutMsg();
      assertFalse(theClient0.getTrusted());
      assertTrue(theClient0.getCommunicationLogging());
  }
