  public void test017()  throws Throwable  {
      HomeEnvironment homeEnvironment0 = new HomeEnvironment();
      assertEquals(25, homeEnvironment0.getVideoFrameRate());
      
      homeEnvironment0.setVideoFrameRate(0);
      int int0 = homeEnvironment0.getVideoFrameRate();
      assertEquals(0, int0);
  }
