  public void test01()  throws Throwable  {
      TheClient theClient0 = new TheClient();
      Proxy proxy0 = Proxy.NO_PROXY;
      MockSocket mockSocket0 = new MockSocket(proxy0);
      InetAddress inetAddress0 = MockInetAddress.getLocalHost();
      MockInetSocketAddress mockInetSocketAddress0 = new MockInetSocketAddress(inetAddress0, 0);
      mockSocket0.bind(mockInetSocketAddress0);
      theClient0.setSocket(mockSocket0);
      theClient0.getSocket();
      assertFalse(theClient0.getTrusted());
      assertTrue(theClient0.getCommunicationLogging());
  }
