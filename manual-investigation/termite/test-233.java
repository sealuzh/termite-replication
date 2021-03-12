  public void test63()  throws Throwable  {
      Player player0 = new Player(1, "gui.ModuleBrowserDialog$ModuleFilter", "_#_JbY6", 1);
      float float0 = player0.getY();
      assertEquals(1, player0.getPictureId());
      assertEquals(10.0F, player0.getX(), 0.01F);
      assertEquals(0L, player0.getTimeOfDeath());
      assertEquals("gui.ModuleBrowserDialog$ModuleFilter", player0.getIP());
      assertFalse(player0.isDead());
      assertEquals(1, player0.getStrength());
      assertTrue(player0.isConnected());
      assertEquals(0.0F, float0, 0.01F);
  }
