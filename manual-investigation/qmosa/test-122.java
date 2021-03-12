  public void test098()  throws Throwable  {
      HomeEnvironment homeEnvironment0 = new HomeEnvironment();
      int int0 = homeEnvironment0.getGroundColor();
      assertEquals(13684944, homeEnvironment0.getLightColor());
      assertEquals(13684944, homeEnvironment0.getCeillingLightColor());
      assertEquals(11053224, int0);
      assertEquals(13427964, homeEnvironment0.getSkyColor());
      assertEquals(300, homeEnvironment0.getPhotoHeight());
      assertEquals(400, homeEnvironment0.getPhotoWidth());
      assertEquals(320, homeEnvironment0.getVideoWidth());
      assertEquals(0.0F, homeEnvironment0.getWallsAlpha(), 0.01F);
      assertTrue(homeEnvironment0.isObserverCameraElevationAdjusted());
      assertEquals(25, homeEnvironment0.getVideoFrameRate());
  }
