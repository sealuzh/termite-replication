  public void test051()  throws Throwable  {
      HomeEnvironment homeEnvironment0 = new HomeEnvironment();
      HomeEnvironment.Property homeEnvironment_Property0 = HomeEnvironment.Property.PHOTO_HEIGHT;
      homeEnvironment0.addPropertyChangeListener(homeEnvironment_Property0, (PropertyChangeListener) null);
      assertEquals(13684944, homeEnvironment0.getCeillingLightColor());
      assertEquals(300, homeEnvironment0.getPhotoHeight());
      assertEquals(240, homeEnvironment0.getVideoHeight());
      assertEquals(13427964, homeEnvironment0.getSkyColor());
      assertEquals(400, homeEnvironment0.getPhotoWidth());
      assertEquals(0.0F, homeEnvironment0.getWallsAlpha(), 0.01F);
      assertEquals(11053224, homeEnvironment0.getGroundColor());
      assertEquals(13684944, homeEnvironment0.getLightColor());
      assertEquals(25, homeEnvironment0.getVideoFrameRate());
      assertTrue(homeEnvironment0.isObserverCameraElevationAdjusted());
  }
