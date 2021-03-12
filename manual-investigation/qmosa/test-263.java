  public void test031()  throws Throwable  {
      HomeEnvironment homeEnvironment0 = new HomeEnvironment();
      assertEquals(25, homeEnvironment0.getVideoFrameRate());
      
      homeEnvironment0.setVideoFrameRate(0);
      homeEnvironment0.clone();
      assertEquals(0, homeEnvironment0.getVideoFrameRate());
  }
