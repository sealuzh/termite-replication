  public void test080()  throws Throwable  {
      HomeEnvironment homeEnvironment0 = new HomeEnvironment();
      homeEnvironment0.setObserverCameraElevationAdjusted(false);
      assertFalse(homeEnvironment0.isObserverCameraElevationAdjusted());
      
      homeEnvironment0.setObserverCameraElevationAdjusted(true);
      assertEquals(11053224, homeEnvironment0.getGroundColor());
  }
