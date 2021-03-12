  public void test58()  throws Throwable  {
      TheClient theClient0 = new TheClient();
      DefaultClientEventHandler defaultClientEventHandler0 = new DefaultClientEventHandler();
      theClient0.setClientEventHandler(defaultClientEventHandler0);
      theClient0.getClientEventHandler();
      assertTrue(theClient0.getCommunicationLogging());
      assertFalse(theClient0.getTrusted());
  }
