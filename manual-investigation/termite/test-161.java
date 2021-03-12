  public void test098()  throws Throwable  {
      HomeEnvironment homeEnvironment0 = new HomeEnvironment();
      homeEnvironment0.setObserverCameraElevationAdjusted(false);
      assertFalse(homeEnvironment0.isObserverCameraElevationAdjusted());
      
      homeEnvironment0.setObserverCameraElevationAdjusted(true);
      assertEquals(13427964, homeEnvironment0.getSkyColor());
  }
