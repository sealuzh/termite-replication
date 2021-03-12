  public void test00()  throws Throwable  {
      Player player0 = new Player((-1361), "^", "^", (-1361));
      byte[] byteArray0 = new byte[2];
      byteArray0[0] = (byte)24;
      player0.unpack(byteArray0);
      assertFalse(player0.isDead());
      assertEquals(10.0F, player0.getX(), 0.01F);
      assertEquals(0L, player0.getTimeOfDeath());
      assertEquals(0.0F, player0.getY(), 0.01F);
      assertEquals((-1361), player0.getPictureId());
      assertTrue(player0.isConnected());
      assertEquals(1, player0.getStrength());
  }
