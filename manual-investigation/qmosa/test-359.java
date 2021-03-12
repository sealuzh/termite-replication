  public void test059()  throws Throwable  {
      HomeEnvironment homeEnvironment0 = new HomeEnvironment();
      homeEnvironment0.setPhotoQuality(0);
      assertEquals(13684944, homeEnvironment0.getLightColor());
      assertEquals(400, homeEnvironment0.getPhotoWidth());
      assertEquals(13684944, homeEnvironment0.getCeillingLightColor());
      assertEquals(0, homeEnvironment0.getPhotoQuality());
      assertTrue(homeEnvironment0.isObserverCameraElevationAdjusted());
      assertEquals(13427964, homeEnvironment0.getSkyColor());
      assertEquals(25, homeEnvironment0.getVideoFrameRate());
      assertEquals(240, homeEnvironment0.getVideoHeight());
      assertEquals(11053224, homeEnvironment0.getGroundColor());
      assertEquals(0.0F, homeEnvironment0.getWallsAlpha(), 0.01F);
      assertEquals(300, homeEnvironment0.getPhotoHeight());
  }
