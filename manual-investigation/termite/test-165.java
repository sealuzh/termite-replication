  public void test17()  throws Throwable  {
      Player player0 = new Player(2434, "module.ModuleBrowserDialog$ModuleFilter", "module.ModuleBrowserDialog$ModuleFilter", 2434);
      int int0 = player0.getStrength();
      assertFalse(player0.isDead());
      assertEquals(0.0F, player0.getY(), 0.01F);
      assertEquals(10.0F, player0.getX(), 0.01F);
      assertTrue(player0.isConnected());
      assertEquals(0L, player0.getTimeOfDeath());
      assertEquals(1, int0);
      assertEquals(2434, player0.getPictureId());
  }
