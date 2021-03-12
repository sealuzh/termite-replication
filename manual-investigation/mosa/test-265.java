  public void test03()  throws Throwable  {
      Player player0 = new Player();
      Player player1 = new Player();
      player0.add(player1);
      int int0 = player0.gangStrength();
      assertEquals("0.0.0.0", player0.getIP());
      assertTrue(player0.isConnected());
      assertEquals(2, int0);
      assertEquals(0.0F, player0.getY(), 0.01F);
      assertFalse(player0.isDead());
      assertEquals(0, player0.getPictureId());
      assertEquals("Player-1", player0.getName());
      assertEquals(10.0F, player0.getX(), 0.01F);
      assertEquals(0L, player0.getTimeOfDeath());
  }
