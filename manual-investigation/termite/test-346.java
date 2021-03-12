  public void test13()  throws Throwable  {
      TheClient theClient0 = new TheClient();
      theClient0.setMaxAuthTryMsg("");
      theClient0.getMaxAuthTryMsg();
      assertTrue(theClient0.getCommunicationLogging());
      assertFalse(theClient0.getTrusted());
  }
