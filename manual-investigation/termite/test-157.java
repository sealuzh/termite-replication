  public void test29()  throws Throwable  {
      TheClient theClient0 = new TheClient();
      theClient0.setClientObjectHandler((ClientObjectHandler) null);
      assertTrue(theClient0.getCommunicationLogging());
      assertFalse(theClient0.getTrusted());
  }
