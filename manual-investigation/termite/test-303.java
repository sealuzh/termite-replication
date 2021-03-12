  public void test41()  throws Throwable  {
      TheClient theClient0 = new TheClient();
      theClient0.getClientBinaryHandler();
      assertTrue(theClient0.getCommunicationLogging());
      assertFalse(theClient0.getTrusted());
  }
