  public void test50()  throws Throwable  {
      Player player0 = new Player((byte)0, "", "Ao;+Z,\"dJ", 5888, (byte)0);
      int int0 = player0.gangStrength();
      assertTrue(player0.isConnected());
      assertEquals(0, int0);
      assertEquals(0.0F, player0.getY(), 0.01F);
      assertEquals(5888, player0.getPictureId());
      assertEquals(0L, player0.getTimeOfDeath());
      assertFalse(player0.isDead());
      assertEquals(10.0F, player0.getX(), 0.01F);
      assertEquals("", player0.getIP());
  }
