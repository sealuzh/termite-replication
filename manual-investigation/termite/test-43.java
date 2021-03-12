  public void test53()  throws Throwable  {
      Player player0 = new Player((-672));
      float float0 = player0.getZ();
      assertFalse(player0.isDead());
      assertEquals(0L, player0.getTimeOfDeath());
      assertEquals(10.0F, player0.getX(), 0.01F);
      assertEquals("Player-672", player0.toString());
      assertEquals(0.0F, player0.getY(), 0.01F);
      assertTrue(player0.isConnected());
      assertEquals(0.0F, float0, 0.01F);
      assertEquals(0, player0.getPictureId());
      assertEquals(1, player0.getStrength());
      assertEquals("0.0.0.0", player0.getIP());
  }
