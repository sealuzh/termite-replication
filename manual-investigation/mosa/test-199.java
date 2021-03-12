  public void test23()  throws Throwable  {
      Player player0 = new Player();
      player0.setY(0.0F);
      assertTrue(player0.isConnected());
      assertEquals(0L, player0.getTimeOfDeath());
      assertFalse(player0.isDead());
      assertEquals(1, player0.getStrength());
      assertEquals(0.0F, player0.getY(), 0.01F);
      assertEquals(10.0F, player0.getX(), 0.01F);
      assertEquals(0, player0.getPictureId());
      assertEquals("Player-1", player0.toString());
      assertEquals("0.0.0.0", player0.getIP());
  }
