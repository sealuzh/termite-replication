  public void test102()  throws Throwable  {
      HomeEnvironment homeEnvironment0 = new HomeEnvironment();
      float float0 = homeEnvironment0.getWallsAlpha();
      assertEquals(400, homeEnvironment0.getPhotoWidth());
      assertTrue(homeEnvironment0.isObserverCameraElevationAdjusted());
      assertEquals(25, homeEnvironment0.getVideoFrameRate());
      assertEquals(13684944, homeEnvironment0.getLightColor());
      assertEquals(0.0F, float0, 0.01F);
      assertEquals(11053224, homeEnvironment0.getGroundColor());
      assertEquals(300, homeEnvironment0.getPhotoHeight());
      assertEquals(13684944, homeEnvironment0.getCeillingLightColor());
      assertEquals(240, homeEnvironment0.getVideoHeight());
      assertEquals(13427964, homeEnvironment0.getSkyColor());
  }
