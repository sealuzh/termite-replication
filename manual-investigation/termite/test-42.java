  public void test68()  throws Throwable  {
      Player player0 = new Player((-96), "state.Player$JoinInfo", "state.Player$JoinInfo", (-96), (-96));
      float float0 = player0.getMoney();
      assertFalse(player0.isDead());
      assertEquals((-96), player0.getPictureId());
      assertEquals(10.0F, player0.getX(), 0.01F);
      assertEquals(0L, player0.getTimeOfDeath());
      assertTrue(player0.isConnected());
      assertEquals(0.0F, float0, 0.01F);
      assertEquals(0.0F, player0.getY(), 0.01F);
      assertEquals((-96), player0.getStrength());
  }
