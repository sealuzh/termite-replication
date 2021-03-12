  public void test41()  throws Throwable  {
      TheClient theClient0 = new TheClient();
      theClient0.getMaxAuthTryMsg();
      assertFalse(theClient0.getTrusted());
      assertTrue(theClient0.getCommunicationLogging());
  }
