  public void test15()  throws Throwable  {
      Player player0 = new Player((-1165), "wCZ&tvYz6eq[N", ")uhM3ntZ_7q{", (-1165), (-1165));
      int int0 = player0.getPictureId();
      assertTrue(player0.isConnected());
      assertEquals(0.0F, player0.getY(), 0.01F);
      assertEquals(0L, player0.getTimeOfDeath());
      assertEquals((-1165), player0.getStrength());
      assertEquals(10.0F, player0.getX(), 0.01F);
      assertFalse(player0.isDead());
      assertEquals((-1165), int0);
      assertEquals("wCZ&tvYz6eq[N", player0.getIP());
  }
