  public void test28()  throws Throwable  {
      Player player0 = new Player(14907, "", 1335);
      player0.setZ(0.0F);
      assertEquals(1335, player0.getPictureId());
      assertFalse(player0.isDead());
      assertEquals(10.0F, player0.getX(), 0.01F);
      assertEquals(0L, player0.getTimeOfDeath());
      assertEquals(0.0F, player0.getZ(), 0.01F);
      assertEquals("0.0.0.0", player0.getIP());
      assertTrue(player0.isConnected());
      assertEquals(0.0F, player0.getY(), 0.01F);
      assertEquals(1, player0.getStrength());
  }
