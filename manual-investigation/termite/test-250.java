  public void test41()  throws Throwable  {
      Player player0 = new Player(1275, "Player", 1275);
      DataOutputStream dataOutputStream0 = new DataOutputStream((OutputStream) null);
      // Undeclared exception!
      try { 
        player0.pack(dataOutputStream0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.io.DataOutputStream", e);
      }
  }
