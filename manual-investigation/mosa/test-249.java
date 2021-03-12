  public void test19()  throws Throwable  {
      Player player0 = new Player((-470), "", "", (-470), (-470));
      int int0 = player0.gangStrength();
      assertEquals(0.0F, player0.getY(), 0.01F);
      assertTrue(player0.isConnected());
      assertEquals((-470), player0.getPictureId());
      assertEquals((-470), int0);
      assertEquals(10.0F, player0.getX(), 0.01F);
      assertEquals(0L, player0.getTimeOfDeath());
      assertFalse(player0.isDead());
  }
