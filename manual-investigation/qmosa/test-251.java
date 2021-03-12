  public void test50()  throws Throwable  {
      Player player0 = new Player(0);
      float float0 = player0.getZ();
      assertEquals(0.0F, float0, 0.01F);
      assertEquals(0L, player0.getTimeOfDeath());
      assertEquals(10.0F, player0.getX(), 0.01F);
      assertFalse(player0.isDead());
      assertTrue(player0.isConnected());
      assertEquals(0.0F, player0.getY(), 0.01F);
      assertEquals(1, player0.getStrength());
      assertEquals("Player0", player0.getName());
      assertEquals(0, player0.getPictureId());
      assertEquals("0.0.0.0", player0.getIP());
  }
