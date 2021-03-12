  public void test16()  throws Throwable  {
      Player player0 = new Player((-1128), (String) null, (String) null, (-1128), (-1128));
      player0.getIP();
      assertEquals((-1128), player0.getPictureId());
      assertFalse(player0.isDead());
      assertEquals(0.0F, player0.getY(), 0.01F);
      assertEquals(10.0F, player0.getX(), 0.01F);
      assertEquals(0L, player0.getTimeOfDeath());
      assertTrue(player0.isConnected());
      assertEquals((-1128), player0.getStrength());
  }
