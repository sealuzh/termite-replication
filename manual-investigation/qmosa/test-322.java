  public void test055()  throws Throwable  {
      HomeEnvironment homeEnvironment0 = new HomeEnvironment();
      AspectRatio aspectRatio0 = AspectRatio.RATIO_2_1;
      homeEnvironment0.setVideoAspectRatio(aspectRatio0);
      assertEquals(AspectRatio.RATIO_2_1, homeEnvironment0.getVideoAspectRatio());
  }
