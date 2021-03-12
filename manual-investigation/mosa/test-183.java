  public void test032()  throws Throwable  {
      URL uRL0 = MockURL.getHttpExample();
      URLContent uRLContent0 = new URLContent(uRL0);
      CatalogTexture catalogTexture0 = new CatalogTexture("PHOTO_ASPECT_RATIO", uRLContent0, 0.0F, (-613.0F), false);
      HomeTexture homeTexture0 = new HomeTexture(catalogTexture0);
      HomeEnvironment homeEnvironment0 = new HomeEnvironment(1840700269, homeTexture0, 1840700269, homeTexture0, 1840700269, 1840700269);
      homeEnvironment0.getGroundTexture();
      assertEquals(13684944, homeEnvironment0.getCeillingLightColor());
      assertEquals(1.84070029E9F, homeEnvironment0.getWallsAlpha(), 0.01F);
      assertEquals(300, homeEnvironment0.getPhotoHeight());
      assertEquals(400, homeEnvironment0.getPhotoWidth());
      assertEquals(240, homeEnvironment0.getVideoHeight());
      assertTrue(homeEnvironment0.isObserverCameraElevationAdjusted());
      assertEquals(1840700269, homeEnvironment0.getSkyColor());
      assertEquals(1840700269, homeEnvironment0.getLightColor());
      assertEquals(1840700269, homeEnvironment0.getGroundColor());
      assertEquals(25, homeEnvironment0.getVideoFrameRate());
  }
