  public void test52()  throws Throwable  {
      TheClient theClient0 = new TheClient();
      QuickServer quickServer0 = new QuickServer("");
      theClient0.setServer(quickServer0);
      theClient0.getServer();
      assertFalse(theClient0.getTrusted());
      assertTrue(theClient0.getCommunicationLogging());
  }
