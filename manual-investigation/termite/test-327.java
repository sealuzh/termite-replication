  public void test093()  throws Throwable  {
      HomeEnvironment homeEnvironment0 = new HomeEnvironment(78, (HomeTexture) null, 78, (HomeTexture) null, 78, 78);
      homeEnvironment0.setSkyTexture((HomeTexture) null);
      assertEquals(400, homeEnvironment0.getPhotoWidth());
      assertEquals(13684944, homeEnvironment0.getCeillingLightColor());
      assertEquals(78, homeEnvironment0.getSkyColor());
      assertEquals(240, homeEnvironment0.getVideoHeight());
      assertEquals(78, homeEnvironment0.getLightColor());
      assertEquals(300, homeEnvironment0.getPhotoHeight());
      assertEquals(78, homeEnvironment0.getGroundColor());
      assertTrue(homeEnvironment0.isObserverCameraElevationAdjusted());
      assertEquals(25, homeEnvironment0.getVideoFrameRate());
      assertEquals(78.0F, homeEnvironment0.getWallsAlpha(), 0.01F);
  }
