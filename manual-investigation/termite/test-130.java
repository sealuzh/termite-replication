  public void test0()  throws Throwable  {
      MockSocket mockSocket0 = new MockSocket();
      ClientMsgReceiver clientMsgReceiver0 = new ClientMsgReceiver(mockSocket0, (BomberClient) null);
      // Undeclared exception!
      try { 
        clientMsgReceiver0.handleConnectionLoss((Exception) null);
        fail("Expecting exception: HeadlessException");
      
      } catch(HeadlessException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.awt.GraphicsEnvironment", e);
      }
  }
