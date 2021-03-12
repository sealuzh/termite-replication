  public void test57()  throws Throwable  {
      Player player0 = new Player((-96), "state.Player$JoinInfo", "state.Player$JoinInfo", (-96), (-96));
      int int0 = player0.getStrength();
      assertEquals((-96), int0);
      assertTrue(player0.isConnected());
      assertEquals((-96), player0.getPictureId());
      assertEquals(10.0F, player0.getX(), 0.01F);
      assertFalse(player0.isDead());
      assertEquals(0L, player0.getTimeOfDeath());
      assertEquals(0.0F, player0.getY(), 0.01F);
  }
