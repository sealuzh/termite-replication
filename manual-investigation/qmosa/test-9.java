  public void test23()  throws Throwable  {
      TheClient theClient0 = new TheClient();
      theClient0.getClientObjectHandler();
      assertFalse(theClient0.getTrusted());
      assertTrue(theClient0.getCommunicationLogging());
  }
