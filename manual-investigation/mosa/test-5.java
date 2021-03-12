  public void test02()  throws Throwable  {
      String[] stringArray0 = new String[1];
      stringArray0[0] = "3( Z{O}0%v.xml";
      // Undeclared exception!
      try { 
        LagoonCLI.main(stringArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
      }
  }
