  public void test12()  throws Throwable  {
      Player player0 = new Player(0, "0.0.0.0", "0.0.0.0", 4919, 0);
      int int0 = player0.getStrength();
      assertEquals(4919, player0.getPictureId());
      assertEquals(0L, player0.getTimeOfDeath());
      assertFalse(player0.isDead());
      assertEquals(10.0F, player0.getX(), 0.01F);
      assertEquals(0.0F, player0.getY(), 0.01F);
      assertEquals(0, int0);
      assertTrue(player0.isConnected());
  }
