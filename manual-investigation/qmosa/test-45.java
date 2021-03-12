  public void test21()  throws Throwable  {
      Player player0 = new Player((-3683), "state.Party", "state.Party", 1, (-27735));
      int int0 = player0.gangStrength();
      assertEquals(0.0F, player0.getY(), 0.01F);
      assertEquals(10.0F, player0.getX(), 0.01F);
      assertEquals(0L, player0.getTimeOfDeath());
      assertEquals((-27735), int0);
      assertEquals(1, player0.getPictureId());
      assertTrue(player0.isConnected());
  }
