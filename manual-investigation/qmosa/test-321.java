  public void test24()  throws Throwable  {
      Player player0 = new Player((-66), "$?R#A)N", "$?R#A)N", 228, 1);
      player0.setZ(0.0F);
      assertTrue(player0.isConnected());
      assertEquals(0.0F, player0.getY(), 0.01F);
      assertEquals(228, player0.getPictureId());
      assertEquals(10.0F, player0.getX(), 0.01F);
      assertFalse(player0.isDead());
      assertEquals(0.0F, player0.getZ(), 0.01F);
      assertEquals(0L, player0.getTimeOfDeath());
      assertEquals(1, player0.getStrength());
  }
