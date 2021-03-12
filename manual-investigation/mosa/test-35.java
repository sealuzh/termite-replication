  public void test18()  throws Throwable  {
      TheClient theClient0 = new TheClient();
      theClient0.setMaxAuthTryMsg((String) null);
      assertFalse(theClient0.getTrusted());
      assertTrue(theClient0.getCommunicationLogging());
  }
