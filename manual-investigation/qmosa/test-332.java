  public void test38()  throws Throwable  {
      Player player0 = new Player(11, "state.Player$JoinInfo", "state.Player$JoinInfo", 514, 0);
      // Undeclared exception!
      try { 
        player0.pack((DataOutputStream) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("state.Player", e);
      }
  }
