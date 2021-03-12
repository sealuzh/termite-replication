  public void test16()  throws Throwable  {
      TheClient theClient0 = new TheClient();
      theClient0.setCommunicationLogging(true);
      assertFalse(theClient0.getTrusted());
      assertTrue(theClient0.getCommunicationLogging());
  }
