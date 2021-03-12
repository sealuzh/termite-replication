  public void test12()  throws Throwable  {
      Player player0 = new Player();
      int int0 = player0.getPictureId();
      assertTrue(player0.isConnected());
      assertEquals(1, player0.getStrength());
      assertEquals("0.0.0.0", player0.getIP());
      assertEquals(10.0F, player0.getX(), 0.01F);
      assertEquals(0L, player0.getTimeOfDeath());
      assertEquals("Player-1", player0.getName());
      assertEquals(0.0F, player0.getY(), 0.01F);
      assertEquals(0, int0);
      assertFalse(player0.isDead());
  }
