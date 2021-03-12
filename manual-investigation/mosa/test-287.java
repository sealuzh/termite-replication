  public void test07()  throws Throwable  {
      Player player0 = new Player();
      assertTrue(player0.isConnected());
      
      player0.setConnected(false);
      boolean boolean0 = player0.isConnected();
      assertFalse(boolean0);
  }
