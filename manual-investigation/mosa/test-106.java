  public void test32()  throws Throwable  {
      Player player0 = new Player(5);
      assertFalse(player0.isDead());
      
      player0.setDead(0L);
      assertTrue(player0.isDead());
  }
