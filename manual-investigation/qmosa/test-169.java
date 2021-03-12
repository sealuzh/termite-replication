  public void test32()  throws Throwable  {
      Player player0 = new Player((-4676), (String) null, (-4676));
      assertFalse(player0.isDead());
      
      player0.setDead(0L);
      assertTrue(player0.isDead());
  }
