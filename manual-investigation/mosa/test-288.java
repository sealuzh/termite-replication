  public void test063()  throws Throwable  {
      HomeEnvironment homeEnvironment0 = new HomeEnvironment();
      assertEquals(13684944, homeEnvironment0.getCeillingLightColor());
      
      homeEnvironment0.setCeillingLightColor(0);
      homeEnvironment0.clone();
      assertEquals(0, homeEnvironment0.getCeillingLightColor());
  }
