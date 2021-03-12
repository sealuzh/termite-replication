  public void test45()  throws Throwable  {
      Player player0 = new Player();
      assertEquals(0L, player0.getTimeOfDeath());
      
      player0.setDead(1L);
      boolean boolean0 = player0.isDead();
      assertTrue(boolean0);
  }
