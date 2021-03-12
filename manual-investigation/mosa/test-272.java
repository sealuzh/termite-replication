  public void test091()  throws Throwable  {
      HomeEnvironment homeEnvironment0 = new HomeEnvironment();
      homeEnvironment0.setCeillingLightColor(13684944);
      assertEquals(0.0F, homeEnvironment0.getWallsAlpha(), 0.01F);
      assertEquals(400, homeEnvironment0.getPhotoWidth());
      assertTrue(homeEnvironment0.isObserverCameraElevationAdjusted());
      assertEquals(11053224, homeEnvironment0.getGroundColor());
      assertEquals(13684944, homeEnvironment0.getLightColor());
      assertEquals(25, homeEnvironment0.getVideoFrameRate());
      assertEquals(300, homeEnvironment0.getPhotoHeight());
      assertEquals(13427964, homeEnvironment0.getSkyColor());
      assertEquals(240, homeEnvironment0.getVideoHeight());
      assertEquals(13684944, homeEnvironment0.getCeillingLightColor());
  }