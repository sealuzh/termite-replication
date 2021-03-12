  public void test21()  throws Throwable  {
      Player player0 = new Player((-874), "", (-874));
      player0.getName();
      assertEquals("0.0.0.0", player0.getIP());
      assertTrue(player0.isConnected());
      assertEquals((-874), player0.getPictureId());
      assertEquals(0.0F, player0.getY(), 0.01F);
      assertEquals(1, player0.getStrength());
      assertEquals(0L, player0.getTimeOfDeath());
      assertFalse(player0.isDead());
      assertEquals(10.0F, player0.getX(), 0.01F);
  }
