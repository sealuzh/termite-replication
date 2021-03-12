  public void test53()  throws Throwable  {
      Player player0 = new Player();
      int int0 = player0.getStrength();
      assertEquals(0.0F, player0.getY(), 0.01F);
      assertEquals(10.0F, player0.getX(), 0.01F);
      assertEquals(0L, player0.getTimeOfDeath());
      assertEquals("Player-1", player0.toString());
      assertFalse(player0.isDead());
      assertEquals(0, player0.getPictureId());
      assertEquals(1, int0);
      assertEquals("0.0.0.0", player0.getIP());
      assertTrue(player0.isConnected());
  }
