  public void test64()  throws Throwable  {
      Player player0 = new Player();
      assertEquals(0.0F, player0.getY(), 0.01F);
      
      player0.setY((-1.0F));
      float float0 = player0.getY();
      assertEquals((-1.0F), float0, 0.01F);
  }
