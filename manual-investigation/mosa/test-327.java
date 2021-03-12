  public void test29()  throws Throwable  {
      TheClient theClient0 = new TheClient();
      theClient0.setClientEventHandler((ClientEventHandler) null);
      assertFalse(theClient0.getTrusted());
      assertTrue(theClient0.getCommunicationLogging());
  }
