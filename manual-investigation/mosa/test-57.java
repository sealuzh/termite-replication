  public void test42()  throws Throwable  {
      Player player0 = new Player();
      // Undeclared exception!
      try { 
        player0.isJoinOK((Player) null, true);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("state.Player", e);
      }
  }
