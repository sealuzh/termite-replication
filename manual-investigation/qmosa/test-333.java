  public void test42()  throws Throwable  {
      Player player0 = new Player((-1019), "*:", 1240);
      Party party0 = new Party((-27413));
      player0.head = party0;
      // Undeclared exception!
      try { 
        player0.gangStrength();
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // state.Party cannot be cast to state.Player
         //
         verifyException("state.Player", e);
      }
  }
