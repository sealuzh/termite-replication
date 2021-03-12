  public void test19()  throws Throwable  {
      Player player0 = new Player((-27413), "", "NLki(#a*5ou0P++YT", (-1023), (byte)2);
      String string0 = player0.getIP();
      assertEquals(0L, player0.getTimeOfDeath());
      assertEquals((-1023), player0.getPictureId());
      assertEquals(2, player0.getStrength());
      assertEquals("", string0);
      assertTrue(player0.isConnected());
      assertEquals(0.0F, player0.getY(), 0.01F);
      assertEquals(10.0F, player0.getX(), 0.01F);
      assertFalse(player0.isDead());
  }
