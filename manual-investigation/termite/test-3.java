  public void test38()  throws Throwable  {
      TheClient theClient0 = new TheClient();
      theClient0.setClientWriteHandler((ClientWriteHandler) null);
      assertFalse(theClient0.getTrusted());
      assertTrue(theClient0.getCommunicationLogging());
  }
