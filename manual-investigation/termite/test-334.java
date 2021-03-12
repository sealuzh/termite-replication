  public void test33()  throws Throwable  {
      TheClient theClient0 = new TheClient();
      theClient0.setMaxConnectionMsg((String) null);
      assertFalse(theClient0.getTrusted());
      assertTrue(theClient0.getCommunicationLogging());
  }
