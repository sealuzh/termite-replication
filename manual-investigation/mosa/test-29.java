  public void test1()  throws Throwable  {
      MockSocket mockSocket0 = new MockSocket();
      ClientMsgReceiver clientMsgReceiver0 = new ClientMsgReceiver(mockSocket0, (BomberClient) null);
      SQLTransientConnectionException sQLTransientConnectionException0 = new SQLTransientConnectionException();
      // Undeclared exception!
      try { 
        clientMsgReceiver0.handleConnectionLoss(sQLTransientConnectionException0);
        fail("Expecting exception: HeadlessException");
      
      } catch(HeadlessException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.awt.GraphicsEnvironment", e);
      }
  }
