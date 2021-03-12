  public void test66()  throws Throwable  {
      Player player0 = new Player();
      float float0 = player0.getMoney();
      assertTrue(player0.isConnected());
      assertEquals(1, player0.getStrength());
      assertEquals("0.0.0.0", player0.getIP());
      assertEquals(10.0F, player0.getX(), 0.01F);
      assertFalse(player0.isDead());
      assertEquals(0.0F, float0, 0.01F);
      assertEquals(0.0F, player0.getY(), 0.01F);
      assertEquals(0L, player0.getTimeOfDeath());
      assertEquals(0, player0.getPictureId());
      assertEquals("Player-1", player0.getName());
  }
