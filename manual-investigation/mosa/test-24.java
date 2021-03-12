  public void test103()  throws Throwable  {
      HomeEnvironment homeEnvironment0 = new HomeEnvironment();
      HomeEnvironment.Property homeEnvironment_Property0 = HomeEnvironment.Property.GROUND_COLOR;
      PropertyChangeListener propertyChangeListener0 = mock(PropertyChangeListener.class, new ViolatedAssumptionAnswer());
      PropertyChangeListenerProxy propertyChangeListenerProxy0 = new PropertyChangeListenerProxy("/", propertyChangeListener0);
      homeEnvironment0.removePropertyChangeListener(homeEnvironment_Property0, propertyChangeListenerProxy0);
      assertEquals(13684944, homeEnvironment0.getLightColor());
      assertEquals(400, homeEnvironment0.getPhotoWidth());
      assertEquals(11053224, homeEnvironment0.getGroundColor());
      assertEquals(0.0F, homeEnvironment0.getWallsAlpha(), 0.01F);
      assertEquals(300, homeEnvironment0.getPhotoHeight());
      assertEquals(13427964, homeEnvironment0.getSkyColor());
      assertEquals(25, homeEnvironment0.getVideoFrameRate());
      assertEquals(240, homeEnvironment0.getVideoHeight());
      assertTrue(homeEnvironment0.isObserverCameraElevationAdjusted());
      assertEquals(13684944, homeEnvironment0.getCeillingLightColor());
  }
