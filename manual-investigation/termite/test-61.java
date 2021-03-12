  public void test053()  throws Throwable  {
      HomeEnvironment homeEnvironment0 = new HomeEnvironment(45, (HomeTexture) null, 45, (HomeTexture) null, 45, 45);
      homeEnvironment0.setSkyColor(0);
      assertEquals(0, homeEnvironment0.getSkyColor());
  }
