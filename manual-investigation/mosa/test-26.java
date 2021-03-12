  public void test62()  throws Throwable  {
      Player player0 = new Player();
      int int0 = player0.type();
      assertEquals("0.0.0.0", player0.getIP());
      assertEquals(5, int0);
      assertFalse(player0.isDead());
      assertEquals(10.0F, player0.getX(), 0.01F);
      assertEquals(0L, player0.getTimeOfDeath());
      assertTrue(player0.isConnected());
      assertEquals(0.0F, player0.getY(), 0.01F);
      assertEquals(1, player0.getStrength());
      assertEquals("Player-1", player0.toString());
      assertEquals(0, player0.getPictureId());
  }
