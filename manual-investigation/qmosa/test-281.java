  public void test49()  throws Throwable  {
      TheClient theClient0 = new TheClient();
      theClient0.getSocketChannel();
      assertFalse(theClient0.getTrusted());
      assertTrue(theClient0.getCommunicationLogging());
  }
