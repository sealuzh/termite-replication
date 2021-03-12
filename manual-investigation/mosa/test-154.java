  public void test27()  throws Throwable  {
      TheClient theClient0 = new TheClient();
      theClient0.setClientObjectHandler((ClientObjectHandler) null);
      assertFalse(theClient0.getTrusted());
      assertTrue(theClient0.getCommunicationLogging());
  }
