  public void test67()  throws Throwable  {
      Player player0 = new Player(0, "", (-109));
      int int0 = player0.getPictureId();
      assertEquals((-109), int0);
      assertEquals("0.0.0.0", player0.getIP());
      assertEquals(10.0F, player0.getX(), 0.01F);
      assertEquals(0L, player0.getTimeOfDeath());
      assertTrue(player0.isConnected());
      assertFalse(player0.isDead());
      assertEquals(1, player0.getStrength());
      assertEquals(0.0F, player0.getY(), 0.01F);
  }
