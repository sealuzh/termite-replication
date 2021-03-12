  public void test049()  throws Throwable  {
      CatalogTexture catalogTexture0 = new CatalogTexture("x", (Content) null, 0, 0);
      HomeTexture homeTexture0 = new HomeTexture(catalogTexture0);
      HomeEnvironment homeEnvironment0 = new HomeEnvironment(0, homeTexture0, 0, homeTexture0, 0, 0);
      homeEnvironment0.setVideoQuality(0);
      assertEquals(400, homeEnvironment0.getPhotoWidth());
      assertEquals(0.0F, homeEnvironment0.getWallsAlpha(), 0.01F);
      assertTrue(homeEnvironment0.isObserverCameraElevationAdjusted());
      assertEquals(13684944, homeEnvironment0.getCeillingLightColor());
      assertEquals(0, homeEnvironment0.getSkyColor());
      assertEquals(0, homeEnvironment0.getVideoQuality());
      assertEquals(300, homeEnvironment0.getPhotoHeight());
      assertEquals(0, homeEnvironment0.getLightColor());
      assertEquals(240, homeEnvironment0.getVideoHeight());
      assertEquals(0, homeEnvironment0.getGroundColor());
      assertEquals(25, homeEnvironment0.getVideoFrameRate());
  }
