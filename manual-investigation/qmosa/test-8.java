  public void test56()  throws Throwable  {
      Player player0 = new Player(0, "", "", (-3916), 5);
      player0.getName();
      assertEquals(0.0F, player0.getY(), 0.01F);
      assertFalse(player0.isDead());
      assertEquals(10.0F, player0.getX(), 0.01F);
      assertEquals(0L, player0.getTimeOfDeath());
      assertEquals(5, player0.getStrength());
      assertTrue(player0.isConnected());
      assertEquals((-3916), player0.getPictureId());
  }
