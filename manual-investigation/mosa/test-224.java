  public void test078()  throws Throwable  {
      HomeEnvironment homeEnvironment0 = new HomeEnvironment();
      homeEnvironment0.setVideoWidth(320);
      assertEquals(25, homeEnvironment0.getVideoFrameRate());
      assertEquals(13427964, homeEnvironment0.getSkyColor());
      assertEquals(11053224, homeEnvironment0.getGroundColor());
      assertEquals(320, homeEnvironment0.getVideoWidth());
      assertEquals(0.0F, homeEnvironment0.getWallsAlpha(), 0.01F);
      assertEquals(300, homeEnvironment0.getPhotoHeight());
      assertEquals(400, homeEnvironment0.getPhotoWidth());
      assertEquals(13684944, homeEnvironment0.getLightColor());
      assertEquals(13684944, homeEnvironment0.getCeillingLightColor());
      assertTrue(homeEnvironment0.isObserverCameraElevationAdjusted());
  }
