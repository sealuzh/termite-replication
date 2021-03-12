  public void test11()  throws Throwable  {
      TheClient theClient0 = new TheClient();
      theClient0.setMaxConnectionMsg("");
      theClient0.getMaxConnectionMsg();
      assertTrue(theClient0.getCommunicationLogging());
      assertFalse(theClient0.getTrusted());
  }
