  public void test10()  throws Throwable  {
      String[] stringArray0 = new String[2];
      stringArray0[1] = "6";
      // Undeclared exception!
      try { 
        LagoonCLI.main(stringArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }