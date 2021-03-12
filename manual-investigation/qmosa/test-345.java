  public void test30()  throws Throwable  {
      Player player0 = new Player(0, "0.0.0.0", "0.0.0.0", 4919, 0);
      assertFalse(player0.isDead());
      
      player0.setDead(0L, false);
      assertTrue(player0.isDead());
  }
