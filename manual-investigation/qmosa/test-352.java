  public void test20()  throws Throwable  {
      Player player0 = new Player((byte)0, "", "", (-1), (byte)0);
      int int0 = player0.gangStrength();
      assertEquals(0.0F, player0.getY(), 0.01F);
      assertEquals(0L, player0.getTimeOfDeath());
      assertFalse(player0.isDead());
      assertEquals(10.0F, player0.getX(), 0.01F);
      assertTrue(player0.isConnected());
      assertEquals(0, int0);
      assertEquals((-1), player0.getPictureId());
  }
