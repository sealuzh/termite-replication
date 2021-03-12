  public void test114()  throws Throwable  {
      HomeEnvironment homeEnvironment0 = new HomeEnvironment();
      int int0 = homeEnvironment0.getPhotoQuality();
      assertEquals(13427964, homeEnvironment0.getSkyColor());
      assertEquals(25, homeEnvironment0.getVideoFrameRate());
      assertTrue(homeEnvironment0.isObserverCameraElevationAdjusted());
      assertEquals(13684944, homeEnvironment0.getCeillingLightColor());
      assertEquals(320, homeEnvironment0.getVideoWidth());
      assertEquals(13684944, homeEnvironment0.getLightColor());
      assertEquals(400, homeEnvironment0.getPhotoWidth());
      assertEquals(0.0F, homeEnvironment0.getWallsAlpha(), 0.01F);
      assertEquals(11053224, homeEnvironment0.getGroundColor());
      assertEquals(300, homeEnvironment0.getPhotoHeight());
      assertEquals(0, int0);
  }
