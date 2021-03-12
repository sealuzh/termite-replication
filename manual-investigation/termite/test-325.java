  public void test059()  throws Throwable  {
      CatalogTexture catalogTexture0 = new CatalogTexture("t/", (Content) null, (-1216), (-1216));
      HomeTexture homeTexture0 = new HomeTexture(catalogTexture0);
      HomeEnvironment homeEnvironment0 = new HomeEnvironment(2642, homeTexture0, (-1216), homeTexture0, 12, (-1216));
      homeEnvironment0.setPhotoAspectRatio((AspectRatio) null);
      assertEquals(400, homeEnvironment0.getPhotoWidth());
      assertEquals((-1216), homeEnvironment0.getSkyColor());
      assertTrue(homeEnvironment0.isObserverCameraElevationAdjusted());
      assertEquals(25, homeEnvironment0.getVideoFrameRate());
      assertEquals(300, homeEnvironment0.getPhotoHeight());
      assertEquals(12, homeEnvironment0.getLightColor());
      assertEquals((-1216.0F), homeEnvironment0.getWallsAlpha(), 0.01F);
      assertEquals(240, homeEnvironment0.getVideoHeight());
      assertEquals(2642, homeEnvironment0.getGroundColor());
      assertEquals(13684944, homeEnvironment0.getCeillingLightColor());
  }
