  public void test46()  throws Throwable  {
      Player player0 = new Player(2, "<'LhvM:", (String) null, 2);
      boolean boolean0 = player0.isDead();
      assertFalse(boolean0);
      assertEquals(0L, player0.getTimeOfDeath());
      assertEquals(10.0F, player0.getX(), 0.01F);
      assertTrue(player0.isConnected());
      assertEquals(0.0F, player0.getY(), 0.01F);
      assertEquals(1, player0.getStrength());
      assertEquals(2, player0.getPictureId());
  }
