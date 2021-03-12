  public void test16()  throws Throwable  {
      TheClient theClient0 = new TheClient();
      theClient0.setCommunicationLogging(true);
      assertTrue(theClient0.getCommunicationLogging());
      assertFalse(theClient0.getTrusted());
  }
