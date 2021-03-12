  public void test57()  throws Throwable  {
      TheClient theClient0 = new TheClient();
      theClient0.setClientEvent((ClientEvent) null);
      theClient0.getClientEvent();
      assertTrue(theClient0.getCommunicationLogging());
      assertFalse(theClient0.getTrusted());
  }
