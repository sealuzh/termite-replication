  public void test10()  throws Throwable  {
      Player player0 = new Player(1511, "", "", 1511);
      assertEquals(10.0F, player0.getX(), 0.01F);
      
      player0.setX((-1.0F));
      float float0 = player0.getX();
      assertEquals((-1.0F), float0, 0.01F);
  }
