  public void test02()  throws Throwable  {
      TheClient theClient0 = new TheClient();
      theClient0.setMaxConnectionMsg("org.quickserver.net.server.TheClient");
      theClient0.getMaxConnectionMsg();
      assertTrue(theClient0.getCommunicationLogging());
      assertFalse(theClient0.getTrusted());
  }
