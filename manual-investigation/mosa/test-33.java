  public void test077()  throws Throwable  {
      HomeEnvironment homeEnvironment0 = new HomeEnvironment();
      assertEquals(240, homeEnvironment0.getVideoHeight());
      
      homeEnvironment0.setVideoWidth(0);
      homeEnvironment0.clone();
      assertEquals(0, homeEnvironment0.getVideoHeight());
  }
