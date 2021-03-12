  public void test065()  throws Throwable  {
      HomeEnvironment homeEnvironment0 = new HomeEnvironment(8192, (HomeTexture) null, 8192, (HomeTexture) null, 1, 1);
      HomeEnvironment.Property homeEnvironment_Property0 = HomeEnvironment.Property.PHOTO_ASPECT_RATIO;
      homeEnvironment0.addPropertyChangeListener(homeEnvironment_Property0, (PropertyChangeListener) null);
      assertEquals(13684944, homeEnvironment0.getCeillingLightColor());
      assertEquals(8192, homeEnvironment0.getSkyColor());
      assertEquals(1, homeEnvironment0.getLightColor());
      assertEquals(8192, homeEnvironment0.getGroundColor());
      assertEquals(25, homeEnvironment0.getVideoFrameRate());
      assertTrue(homeEnvironment0.isObserverCameraElevationAdjusted());
      assertEquals(240, homeEnvironment0.getVideoHeight());
      assertEquals(400, homeEnvironment0.getPhotoWidth());
      assertEquals(1.0F, homeEnvironment0.getWallsAlpha(), 0.01F);
      assertEquals(300, homeEnvironment0.getPhotoHeight());
  }
