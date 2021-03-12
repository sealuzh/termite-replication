  public void test02()  throws Throwable  {
      Player player0 = new Player();
      Player player1 = new Player();
      player0.setJoinOK(player1, false);
      boolean boolean0 = player0.isJoinOK(player1, false);
      assertEquals(0, player1.getPictureId());
      assertEquals(0L, player1.getTimeOfDeath());
      assertFalse(player1.isDead());
      assertEquals(1, player1.getStrength());
      assertEquals(0.0F, player1.getY(), 0.01F);
      assertEquals(10.0F, player1.getX(), 0.01F);
      assertTrue(player1.isConnected());
      assertTrue(boolean0);
      assertEquals("Player-1", player1.toString());
      assertEquals("0.0.0.0", player1.getIP());
  }
