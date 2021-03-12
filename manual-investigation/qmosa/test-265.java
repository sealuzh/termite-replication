  public void test10()  throws Throwable  {
      TheClient theClient0 = new TheClient();
      theClient0.setMaxConnectionMsg("N");
      theClient0.getMaxConnectionMsg();
      assertFalse(theClient0.getTrusted());
      assertTrue(theClient0.getCommunicationLogging());
  }
