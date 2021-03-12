  public void test024()  throws Throwable  {
      HomeEnvironment homeEnvironment0 = new HomeEnvironment(13427964, (HomeTexture) null, (-1216), (HomeTexture) null, 13427964, 13427964);
      int int0 = homeEnvironment0.getSkyColor();
      assertEquals(300, homeEnvironment0.getPhotoHeight());
      assertEquals(25, homeEnvironment0.getVideoFrameRate());
      assertEquals(1.3427964E7F, homeEnvironment0.getWallsAlpha(), 0.01F);
      assertTrue(homeEnvironment0.isObserverCameraElevationAdjusted());
      assertEquals((-1216), int0);
      assertEquals(13427964, homeEnvironment0.getGroundColor());
      assertEquals(13684944, homeEnvironment0.getCeillingLightColor());
      assertEquals(13427964, homeEnvironment0.getLightColor());
      assertEquals(400, homeEnvironment0.getPhotoWidth());
      assertEquals(320, homeEnvironment0.getVideoWidth());
  }
