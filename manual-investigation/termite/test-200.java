  public void test19()  throws Throwable  {
      Player player0 = new Player(0, "0@Qh", 29952);
      int int0 = player0.getPictureId();
      assertTrue(player0.isConnected());
      assertEquals("0.0.0.0", player0.getIP());
      assertEquals(1, player0.getStrength());
      assertEquals(10.0F, player0.getX(), 0.01F);
      assertEquals(0.0F, player0.getY(), 0.01F);
      assertEquals(0L, player0.getTimeOfDeath());
      assertFalse(player0.isDead());
      assertEquals(29952, int0);
  }
