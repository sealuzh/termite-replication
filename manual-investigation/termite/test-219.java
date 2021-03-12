  public void test09()  throws Throwable  {
      TheClient theClient0 = new TheClient();
      SocketChannel socketChannel0 = SocketChannel.open();
      theClient0.setSocketChannel(socketChannel0);
      assertTrue(theClient0.getCommunicationLogging());
      assertFalse(theClient0.getTrusted());
  }
