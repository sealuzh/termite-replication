  public void test36()  throws Throwable  {
      Player player0 = new Player(0, "0.0.0.0", "0.0.0.0", 4919, 0);
      assertEquals(0L, player0.getTimeOfDeath());
      
      player0.setDead(1L);
      assertEquals(1L, player0.getTimeOfDeath());
  }
