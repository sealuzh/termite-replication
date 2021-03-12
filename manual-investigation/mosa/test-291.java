  public void test51()  throws Throwable  {
      Player player0 = new Player((-4), "7_B*eaCMmMW", "7_B*eaCMmMW", 5, (-2687));
      int int0 = player0.getStrength();
      assertEquals(0.0F, player0.getY(), 0.01F);
      assertEquals((-2687), int0);
      assertEquals(5, player0.getPictureId());
      assertTrue(player0.isConnected());
      assertEquals(0L, player0.getTimeOfDeath());
      assertEquals(10.0F, player0.getX(), 0.01F);
      assertFalse(player0.isDead());
  }
