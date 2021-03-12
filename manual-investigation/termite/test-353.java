  public void test122()  throws Throwable  {
      HomeEnvironment homeEnvironment0 = new HomeEnvironment(13, (HomeTexture) null, 3327, (HomeTexture) null, 6, 3327);
      homeEnvironment0.getDrawingMode();
      assertEquals(13, homeEnvironment0.getGroundColor());
      assertEquals(13684944, homeEnvironment0.getCeillingLightColor());
      assertEquals(300, homeEnvironment0.getPhotoHeight());
      assertEquals(320, homeEnvironment0.getVideoWidth());
      assertTrue(homeEnvironment0.isObserverCameraElevationAdjusted());
      assertEquals(400, homeEnvironment0.getPhotoWidth());
      assertEquals(3327.0F, homeEnvironment0.getWallsAlpha(), 0.01F);
      assertEquals(6, homeEnvironment0.getLightColor());
      assertEquals(3327, homeEnvironment0.getSkyColor());
      assertEquals(25, homeEnvironment0.getVideoFrameRate());
  }
