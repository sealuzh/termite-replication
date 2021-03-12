  public void test60()  throws Throwable  {
      TheClient theClient0 = new TheClient();
      boolean boolean0 = theClient0.getCommunicationLogging();
      assertTrue(boolean0);
      assertFalse(theClient0.getTrusted());
  }
