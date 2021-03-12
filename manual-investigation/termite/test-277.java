  public void test06()  throws Throwable  {
      Player player0 = new Player((-4676), (String) null, (-4676));
      player0.toString();
      assertFalse(player0.isDead());
      assertEquals(1, player0.getStrength());
      assertEquals(0.0F, player0.getY(), 0.01F);
      assertEquals(10.0F, player0.getX(), 0.01F);
      assertEquals(0L, player0.getTimeOfDeath());
      assertEquals((-4676), player0.getPictureId());
      assertTrue(player0.isConnected());
      assertEquals("0.0.0.0", player0.getIP());
  }
