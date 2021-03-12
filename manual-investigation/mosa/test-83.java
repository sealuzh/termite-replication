  public void test46()  throws Throwable  {
      Player player0 = new Player();
      boolean boolean0 = player0.isDead();
      assertFalse(boolean0);
      assertTrue(player0.isConnected());
      assertEquals(0L, player0.getTimeOfDeath());
      assertEquals(1, player0.getStrength());
      assertEquals(0.0F, player0.getY(), 0.01F);
      assertEquals(10.0F, player0.getX(), 0.01F);
      assertEquals("Player-1", player0.toString());
      assertEquals(0, player0.getPictureId());
      assertEquals("0.0.0.0", player0.getIP());
  }
