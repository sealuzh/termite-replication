  public void test13()  throws Throwable  {
      Player player0 = new Player((-4676), (String) null, (-4676));
      int int0 = player0.getPictureId();
      assertEquals(0L, player0.getTimeOfDeath());
      assertEquals(10.0F, player0.getX(), 0.01F);
      assertFalse(player0.isDead());
      assertEquals("0.0.0.0", player0.getIP());
      assertTrue(player0.isConnected());
      assertEquals((-4676), int0);
      assertEquals(0.0F, player0.getY(), 0.01F);
      assertEquals(1, player0.getStrength());
  }
