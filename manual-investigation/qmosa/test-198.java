  public void test088()  throws Throwable  {
      HomeEnvironment homeEnvironment0 = new HomeEnvironment();
      int int0 = homeEnvironment0.getVideoQuality();
      assertEquals(13684944, homeEnvironment0.getLightColor());
      assertEquals(0, int0);
      assertTrue(homeEnvironment0.isObserverCameraElevationAdjusted());
      assertEquals(240, homeEnvironment0.getVideoHeight());
      assertEquals(25, homeEnvironment0.getVideoFrameRate());
      assertEquals(13427964, homeEnvironment0.getSkyColor());
      assertEquals(300, homeEnvironment0.getPhotoHeight());
      assertEquals(11053224, homeEnvironment0.getGroundColor());
      assertEquals(0.0F, homeEnvironment0.getWallsAlpha(), 0.01F);
      assertEquals(13684944, homeEnvironment0.getCeillingLightColor());
      assertEquals(400, homeEnvironment0.getPhotoWidth());
  }
