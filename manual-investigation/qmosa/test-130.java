  public void test50()  throws Throwable  {
      SocketChannel socketChannel0 = SocketChannel.open();
      TheClient theClient0 = new TheClient();
      theClient0.setSocketChannel(socketChannel0);
      assertFalse(theClient0.getTrusted());
      assertTrue(theClient0.getCommunicationLogging());
  }
