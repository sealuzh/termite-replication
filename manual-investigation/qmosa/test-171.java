  public void test51()  throws Throwable  {
      Player player0 = new Player((-66), "$?R#A)N", "$?R#A)N", 228, 1);
      float float0 = player0.getX();
      assertEquals(10.0F, float0, 0.01F);
      assertEquals(0.0F, player0.getY(), 0.01F);
      assertEquals(0L, player0.getTimeOfDeath());
      assertEquals(228, player0.getPictureId());
      assertFalse(player0.isDead());
      assertEquals(1, player0.getStrength());
      assertTrue(player0.isConnected());
  }
