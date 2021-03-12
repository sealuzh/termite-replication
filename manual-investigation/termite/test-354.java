  public void test110()  throws Throwable  {
      HomeEnvironment homeEnvironment0 = new HomeEnvironment(25, (HomeTexture) null, 25, (HomeTexture) null, 25, 25);
      homeEnvironment0.getPhotoAspectRatio();
      assertEquals(13684944, homeEnvironment0.getCeillingLightColor());
      assertEquals(25, homeEnvironment0.getSkyColor());
      assertEquals(25.0F, homeEnvironment0.getWallsAlpha(), 0.01F);
      assertEquals(300, homeEnvironment0.getPhotoHeight());
      assertEquals(25, homeEnvironment0.getLightColor());
      assertEquals(400, homeEnvironment0.getPhotoWidth());
      assertEquals(240, homeEnvironment0.getVideoHeight());
      assertTrue(homeEnvironment0.isObserverCameraElevationAdjusted());
      assertEquals(25, homeEnvironment0.getVideoFrameRate());
      assertEquals(25, homeEnvironment0.getGroundColor());
  }
