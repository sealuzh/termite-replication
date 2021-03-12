  public void test47()  throws Throwable  {
      Player player0 = new Player();
      player0.reset(true);
      assertFalse(player0.isDead());
      assertEquals(0.0F, player0.getMoney(), 0.01F);
      assertEquals("0.0.0.0", player0.getIP());
      assertEquals(0, player0.getPictureId());
      assertEquals("Player-1", player0.toString());
      assertEquals(10.0F, player0.getX(), 0.01F);
      assertEquals(0L, player0.getTimeOfDeath());
      assertTrue(player0.isConnected());
      assertEquals(0.0F, player0.getY(), 0.01F);
      assertEquals(1, player0.getStrength());
  }
