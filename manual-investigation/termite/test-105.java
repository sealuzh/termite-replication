  public void test22()  throws Throwable  {
      TheClient theClient0 = new TheClient();
      theClient0.getMaxAuthTryMsg();
      assertTrue(theClient0.getCommunicationLogging());
      assertFalse(theClient0.getTrusted());
  }
