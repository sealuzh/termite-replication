  public void test2()  throws Throwable  {
      MockSocket mockSocket0 = new MockSocket();
      SessionListMsg sessionListMsg0 = new SessionListMsg();
      ClientMsgReceiver clientMsgReceiver0 = new ClientMsgReceiver(mockSocket0, (BomberClient) null);
      // Undeclared exception!
      try { 
        clientMsgReceiver0.processMsg(sessionListMsg0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("messages.global.SessionListMsg", e);
      }
  }
