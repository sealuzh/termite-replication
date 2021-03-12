  public void test20()  throws Throwable  {
      Player player0 = new Player();
      byte[] byteArray0 = new byte[0];
      player0.unpack(byteArray0);
      assertTrue(player0.isConnected());
      assertFalse(player0.isDead());
      assertEquals(1, player0.getStrength());
      assertEquals(0.0F, player0.getY(), 0.01F);
      assertEquals(10.0F, player0.getX(), 0.01F);
      assertEquals(0L, player0.getTimeOfDeath());
      assertEquals(0, player0.getPictureId());
      assertEquals("Player-1", player0.toString());
      assertEquals("0.0.0.0", player0.getIP());
  }
