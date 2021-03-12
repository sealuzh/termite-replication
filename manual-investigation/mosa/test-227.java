  public void test04()  throws Throwable  {
      Player player0 = new Player();
      PipedInputStream pipedInputStream0 = new PipedInputStream((short)4919);
      DataInputStream dataInputStream0 = new DataInputStream(pipedInputStream0);
      boolean boolean0 = player0.unpack(dataInputStream0);
      assertEquals(0.0F, player0.getY(), 0.01F);
      assertEquals(10.0F, player0.getX(), 0.01F);
      assertFalse(player0.isDead());
      assertFalse(boolean0);
      assertEquals(1, player0.getStrength());
      assertEquals(0L, player0.getTimeOfDeath());
      assertTrue(player0.isConnected());
      assertEquals("0.0.0.0", player0.getIP());
      assertEquals(0, player0.getPictureId());
      assertEquals("Player-1", player0.toString());
  }
