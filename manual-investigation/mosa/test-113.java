  public void test075()  throws Throwable  {
      HomeEnvironment homeEnvironment0 = new HomeEnvironment();
      AspectRatio aspectRatio0 = AspectRatio.RATIO_2_1;
      homeEnvironment0.setVideoAspectRatio(aspectRatio0);
      assertEquals(160, homeEnvironment0.getVideoHeight());
  }
