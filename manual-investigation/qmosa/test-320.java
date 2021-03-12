  public void test067()  throws Throwable  {
      HomeEnvironment homeEnvironment0 = new HomeEnvironment(2473, (HomeTexture) null, 2473, (-690), 1266.09F);
      homeEnvironment0.setAllLevelsVisible(false);
      assertEquals(400, homeEnvironment0.getPhotoWidth());
      assertTrue(homeEnvironment0.isObserverCameraElevationAdjusted());
      assertEquals(300, homeEnvironment0.getPhotoHeight());
      assertEquals(2473, homeEnvironment0.getSkyColor());
      assertEquals(25, homeEnvironment0.getVideoFrameRate());
      assertEquals(13684944, homeEnvironment0.getCeillingLightColor());
      assertEquals(320, homeEnvironment0.getVideoWidth());
      assertEquals(2473, homeEnvironment0.getGroundColor());
      assertEquals((-690), homeEnvironment0.getLightColor());
      assertEquals(1266.09F, homeEnvironment0.getWallsAlpha(), 0.01F);
  }
