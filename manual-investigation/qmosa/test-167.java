  public void test53()  throws Throwable  {
      Player player0 = new Player(0);
      int int0 = player0.getStrength();
      assertEquals(10.0F, player0.getX(), 0.01F);
      assertEquals(0L, player0.getTimeOfDeath());
      assertEquals(0.0F, player0.getY(), 0.01F);
      assertEquals(1, int0);
      assertFalse(player0.isDead());
      assertEquals("Player0", player0.getName());
      assertEquals(0, player0.getPictureId());
      assertTrue(player0.isConnected());
      assertEquals("0.0.0.0", player0.getIP());
  }
