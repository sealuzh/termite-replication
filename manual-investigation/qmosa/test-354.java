  public void test01()  throws Throwable  {
      Player player0 = new Player((byte)59, "", "", (-1), (byte)59);
      player0.pack();
      assertEquals((-1), player0.getPictureId());
      assertTrue(player0.isConnected());
      assertEquals(59, player0.getStrength());
      assertFalse(player0.isDead());
      assertEquals(10.0F, player0.getX(), 0.01F);
      assertEquals(0L, player0.getTimeOfDeath());
      assertEquals(0.0F, player0.getY(), 0.01F);
  }
