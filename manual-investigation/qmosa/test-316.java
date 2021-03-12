  public void test03()  throws Throwable  {
      Player player0 = new Player(4266, "", "", 4266, 1195);
      PipedInputStream pipedInputStream0 = new PipedInputStream();
      PushbackInputStream pushbackInputStream0 = new PushbackInputStream(pipedInputStream0);
      DataInputStream dataInputStream0 = new DataInputStream(pushbackInputStream0);
      boolean boolean0 = player0.unpack(dataInputStream0);
      assertEquals(0L, player0.getTimeOfDeath());
      assertFalse(player0.isDead());
      assertEquals(10.0F, player0.getX(), 0.01F);
      assertFalse(boolean0);
      assertEquals(0.0F, player0.getY(), 0.01F);
      assertEquals(1195, player0.getStrength());
      assertEquals(4266, player0.getPictureId());
      assertTrue(player0.isConnected());
  }
