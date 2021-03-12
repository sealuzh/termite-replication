  public void test050()  throws Throwable  {
      HomeEnvironment homeEnvironment0 = new HomeEnvironment();
      homeEnvironment0.setVideoQuality(11053224);
      homeEnvironment0.clone();
      assertEquals(11053224, homeEnvironment0.getVideoQuality());
  }
