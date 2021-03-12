  public void test26()  throws Throwable  {
      Player player0 = new Player(554, "H/|Me", "H/|Me", 554);
      assertEquals(10.0F, player0.getX(), 0.01F);
      
      player0.setX(0.0F);
      assertEquals(0L, player0.getTimeOfDeath());
  }
