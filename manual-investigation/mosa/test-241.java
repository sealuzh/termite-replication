  public void test096()  throws Throwable  {
      HomeEnvironment homeEnvironment0 = new HomeEnvironment();
      homeEnvironment0.setSkyColor(13427964);
      assertEquals(0.0F, homeEnvironment0.getWallsAlpha(), 0.01F);
      assertEquals(400, homeEnvironment0.getPhotoWidth());
      assertTrue(homeEnvironment0.isObserverCameraElevationAdjusted());
      assertEquals(13427964, homeEnvironment0.getSkyColor());
      assertEquals(13684944, homeEnvironment0.getCeillingLightColor());
      assertEquals(320, homeEnvironment0.getVideoWidth());
      assertEquals(25, homeEnvironment0.getVideoFrameRate());
      assertEquals(13684944, homeEnvironment0.getLightColor());
      assertEquals(300, homeEnvironment0.getPhotoHeight());
      assertEquals(11053224, homeEnvironment0.getGroundColor());
  }
