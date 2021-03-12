  public void test47()  throws Throwable  {
      TheClient theClient0 = new TheClient();
      theClient0.getClientEventHandler();
      assertFalse(theClient0.getTrusted());
      assertTrue(theClient0.getCommunicationLogging());
  }
