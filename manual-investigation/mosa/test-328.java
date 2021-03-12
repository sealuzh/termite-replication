  public void test117()  throws Throwable  {
      HomeEnvironment homeEnvironment0 = new HomeEnvironment();
      int int0 = homeEnvironment0.getGroundColor();
      assertEquals(400, homeEnvironment0.getPhotoWidth());
      assertEquals(0.0F, homeEnvironment0.getWallsAlpha(), 0.01F);
      assertTrue(homeEnvironment0.isObserverCameraElevationAdjusted());
      assertEquals(13684944, homeEnvironment0.getCeillingLightColor());
      assertEquals(300, homeEnvironment0.getPhotoHeight());
      assertEquals(13427964, homeEnvironment0.getSkyColor());
      assertEquals(240, homeEnvironment0.getVideoHeight());
      assertEquals(11053224, int0);
      assertEquals(25, homeEnvironment0.getVideoFrameRate());
      assertEquals(13684944, homeEnvironment0.getLightColor());
  }
