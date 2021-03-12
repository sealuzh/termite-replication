  public void test103()  throws Throwable  {
      CatalogTexture catalogTexture0 = new CatalogTexture("e/", "e/", (Content) null, 0, 2264.2908F, "VIDEO_FRAME_RATE");
      HomeTexture homeTexture0 = new HomeTexture(catalogTexture0);
      HomeEnvironment homeEnvironment0 = new HomeEnvironment(1400, homeTexture0, (-2478), homeTexture0, 1400, 1400);
      int int0 = homeEnvironment0.getLightColor();
      assertEquals(1400, homeEnvironment0.getGroundColor());
      assertEquals(400, homeEnvironment0.getPhotoWidth());
      assertEquals(1400.0F, homeEnvironment0.getWallsAlpha(), 0.01F);
      assertTrue(homeEnvironment0.isObserverCameraElevationAdjusted());
      assertEquals(25, homeEnvironment0.getVideoFrameRate());
      assertEquals((-2478), homeEnvironment0.getSkyColor());
      assertEquals(1400, int0);
      assertEquals(300, homeEnvironment0.getPhotoHeight());
      assertEquals(240, homeEnvironment0.getVideoHeight());
      assertEquals(13684944, homeEnvironment0.getCeillingLightColor());
  }
