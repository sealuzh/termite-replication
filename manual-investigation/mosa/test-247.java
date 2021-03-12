  public void test060()  throws Throwable  {
      HomeEnvironment homeEnvironment0 = new HomeEnvironment();
      homeEnvironment0.setLightColor(0);
      homeEnvironment0.clone();
      assertEquals(0, homeEnvironment0.getLightColor());
  }
