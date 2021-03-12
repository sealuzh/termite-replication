  public void test17()  throws Throwable  {
      Player player0 = new Player(0);
      String string0 = player0.getName();
      assertTrue(player0.isConnected());
      assertEquals(1, player0.getStrength());
      assertEquals("0.0.0.0", player0.getIP());
      assertEquals(0, player0.getPictureId());
      assertEquals(10.0F, player0.getX(), 0.01F);
      assertEquals(0L, player0.getTimeOfDeath());
      assertFalse(player0.isDead());
      assertEquals(0.0F, player0.getY(), 0.01F);
      assertEquals("Player0", string0);
  }
