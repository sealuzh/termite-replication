  public void test084()  throws Throwable  {
      HomeEnvironment homeEnvironment0 = new HomeEnvironment();
      PropertyChangeListener propertyChangeListener0 = mock(PropertyChangeListener.class, new ViolatedAssumptionAnswer());
      PropertyChangeListenerProxy propertyChangeListenerProxy0 = new PropertyChangeListenerProxy("10.4", propertyChangeListener0);
      HomeEnvironment.Property homeEnvironment_Property0 = HomeEnvironment.Property.CEILING_LIGHT_COLOR;
      homeEnvironment0.removePropertyChangeListener(homeEnvironment_Property0, propertyChangeListenerProxy0);
      assertEquals(400, homeEnvironment0.getPhotoWidth());
      assertEquals(0.0F, homeEnvironment0.getWallsAlpha(), 0.01F);
      assertTrue(homeEnvironment0.isObserverCameraElevationAdjusted());
      assertEquals(11053224, homeEnvironment0.getGroundColor());
      assertEquals(25, homeEnvironment0.getVideoFrameRate());
      assertEquals(13684944, homeEnvironment0.getLightColor());
      assertEquals(13427964, homeEnvironment0.getSkyColor());
      assertEquals(300, homeEnvironment0.getPhotoHeight());
      assertEquals(240, homeEnvironment0.getVideoHeight());
      assertEquals(13684944, homeEnvironment0.getCeillingLightColor());
  }
