  public void test24()  throws Throwable  {
      Player player0 = new Player(4, "", "<I|5rjP`wWft", (-1), (-1));
      String string0 = player0.getIP();
      assertEquals((-1), player0.getStrength());
      assertEquals(0.0F, player0.getY(), 0.01F);
      assertTrue(player0.isConnected());
      assertFalse(player0.isDead());
      assertEquals(10.0F, player0.getX(), 0.01F);
      assertEquals(0L, player0.getTimeOfDeath());
      assertEquals((-1), player0.getPictureId());
      assertEquals("", string0);
  }
