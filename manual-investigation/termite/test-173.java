  public void test43()  throws Throwable  {
      Player player0 = new Player((-1657), (String) null, (-1657));
      // Undeclared exception!
      try { 
        player0.pack();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }
