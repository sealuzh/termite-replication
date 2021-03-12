  public void test15()  throws Throwable  {
      Player player0 = new Player(10, "", "", 1);
      player0.getName();
      assertEquals(1, player0.getStrength());
      assertEquals(1, player0.getPictureId());
      assertEquals(10.0F, player0.getX(), 0.01F);
      assertEquals(0.0F, player0.getY(), 0.01F);
      assertEquals(0L, player0.getTimeOfDeath());
      assertFalse(player0.isDead());
      assertTrue(player0.isConnected());
  }
