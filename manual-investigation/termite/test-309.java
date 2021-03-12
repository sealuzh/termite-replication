  public void test49()  throws Throwable  {
      TheClient theClient0 = new TheClient();
      boolean boolean0 = theClient0.getCommunicationLogging();
      assertFalse(theClient0.getTrusted());
      assertTrue(boolean0);
  }
