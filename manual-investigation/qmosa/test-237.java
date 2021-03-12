  public void test07()  throws Throwable  {
      TheClient theClient0 = new TheClient();
      theClient0.setSocketChannel((SocketChannel) null);
      assertFalse(theClient0.getTrusted());
      assertTrue(theClient0.getCommunicationLogging());
  }
