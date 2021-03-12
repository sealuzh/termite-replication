  public void test02()  throws Throwable  {
      Player player0 = new Player(135);
      Player player1 = new Player(135);
      player0.setJoinOK(player1, false);
      boolean boolean0 = player0.isJoinOK(player1, false);
      assertEquals("0.0.0.0", player1.getIP());
      assertTrue(player1.isConnected());
      assertEquals(0.0F, player1.getY(), 0.01F);
      assertEquals(1, player1.getStrength());
      assertTrue(boolean0);
      assertEquals(10.0F, player1.getX(), 0.01F);
      assertEquals(0L, player1.getTimeOfDeath());
      assertEquals("Player135", player1.toString());
      assertEquals(0, player1.getPictureId());
      assertFalse(player1.isDead());
  }
