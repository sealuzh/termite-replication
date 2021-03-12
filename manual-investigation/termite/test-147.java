  public void test64()  throws Throwable  {
      Player player0 = new Player(3, "Sn#hk9)`ccZJ7b/", 6562);
      int int0 = player0.type();
      assertEquals(1, player0.getStrength());
      assertEquals(0.0F, player0.getY(), 0.01F);
      assertTrue(player0.isConnected());
      assertEquals(0L, player0.getTimeOfDeath());
      assertFalse(player0.isDead());
      assertEquals(10.0F, player0.getX(), 0.01F);
      assertEquals(6562, player0.getPictureId());
      assertEquals("0.0.0.0", player0.getIP());
      assertEquals(5, int0);
  }
