  public void test55()  throws Throwable  {
      TheClient theClient0 = new TheClient();
      theClient0.setServer((QuickServer) null);
      assertTrue(theClient0.getCommunicationLogging());
      assertFalse(theClient0.getTrusted());
  }
