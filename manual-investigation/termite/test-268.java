  public void test36()  throws Throwable  {
      TheClient theClient0 = new TheClient();
      theClient0.getMaxConnectionMsg();
      assertFalse(theClient0.getTrusted());
      assertTrue(theClient0.getCommunicationLogging());
  }
