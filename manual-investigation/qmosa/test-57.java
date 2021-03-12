  public void test18()  throws Throwable  {
      Player player0 = new Player((-4676), (String) null, (String) null, (-4676), (-4676));
      player0.getIP();
      assertEquals((-4676), player0.getPictureId());
      assertEquals((-4676), player0.getStrength());
      assertTrue(player0.isConnected());
      assertEquals(10.0F, player0.getX(), 0.01F);
      assertEquals(0L, player0.getTimeOfDeath());
      assertEquals(0.0F, player0.getY(), 0.01F);
      assertFalse(player0.isDead());
  }
