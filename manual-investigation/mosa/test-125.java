  public void test63()  throws Throwable  {
      Player player0 = new Player();
      long long0 = player0.getTimeOfDeath();
      assertEquals("0.0.0.0", player0.getIP());
      assertEquals(0L, long0);
      assertEquals(0, player0.getPictureId());
      assertEquals(1, player0.getStrength());
      assertTrue(player0.isConnected());
      assertEquals("Player-1", player0.toString());
      assertEquals(0.0F, player0.getY(), 0.01F);
      assertEquals(10.0F, player0.getX(), 0.01F);
      assertFalse(player0.isDead());
  }
