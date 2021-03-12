  public void test16()  throws Throwable  {
      TheClient theClient0 = new TheClient();
      theClient0.setMaxConnectionMsg(":");
      theClient0.getMaxConnectionMsg();
      assertFalse(theClient0.getTrusted());
      assertTrue(theClient0.getCommunicationLogging());
  }
