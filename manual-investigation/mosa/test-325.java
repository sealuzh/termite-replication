  public void test118()  throws Throwable  {
      HomeEnvironment homeEnvironment0 = new HomeEnvironment();
      homeEnvironment0.getSkyTexture();
      assertEquals(13684944, homeEnvironment0.getLightColor());
      assertEquals(400, homeEnvironment0.getPhotoWidth());
      assertEquals(0.0F, homeEnvironment0.getWallsAlpha(), 0.01F);
      assertEquals(300, homeEnvironment0.getPhotoHeight());
      assertEquals(11053224, homeEnvironment0.getGroundColor());
      assertEquals(25, homeEnvironment0.getVideoFrameRate());
      assertEquals(240, homeEnvironment0.getVideoHeight());
      assertEquals(13427964, homeEnvironment0.getSkyColor());
      assertTrue(homeEnvironment0.isObserverCameraElevationAdjusted());
      assertEquals(13684944, homeEnvironment0.getCeillingLightColor());
  }
