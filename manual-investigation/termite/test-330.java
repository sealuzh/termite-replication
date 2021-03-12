  public void test04()  throws Throwable  {
      TheClient theClient0 = new TheClient();
      theClient0.setTrusted(false);
      assertFalse(theClient0.getTrusted());
      assertTrue(theClient0.getCommunicationLogging());
  }
