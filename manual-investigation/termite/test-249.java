  public void test31()  throws Throwable  {
      Player player0 = new Player(0, "0.0.0.0", "0.0.0.0", 4919, 0);
      player0.setMoney(0);
      assertEquals(4919, player0.getPictureId());
      assertFalse(player0.isDead());
      assertEquals(0.0F, player0.getMoney(), 0.01F);
      assertEquals(10.0F, player0.getX(), 0.01F);
      assertTrue(player0.isConnected());
      assertEquals(0L, player0.getTimeOfDeath());
      assertEquals(0.0F, player0.getY(), 0.01F);
      assertEquals(0, player0.getStrength());
  }
