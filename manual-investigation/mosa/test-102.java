  public void test31()  throws Throwable  {
      TheClient theClient0 = new TheClient();
      ClientEvent clientEvent0 = ClientEvent.ACCEPT;
      theClient0.setClientEvent(clientEvent0);
      assertFalse(theClient0.getTrusted());
      assertTrue(theClient0.getCommunicationLogging());
  }
