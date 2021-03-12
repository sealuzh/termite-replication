  public void test0()  throws Throwable  {
      MockSocket mockSocket0 = new MockSocket();
      ClientMsgReceiver clientMsgReceiver0 = new ClientMsgReceiver(mockSocket0, (BomberClient) null);
      NewBombMsg newBombMsg0 = new NewBombMsg((Point) null, 35, (-664), 0, true);
      // Undeclared exception!
      try { 
        clientMsgReceiver0.processMsg(newBombMsg0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("client.network.ClientMsgReceiver", e);
      }
  }
