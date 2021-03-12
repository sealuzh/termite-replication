  public void test020()  throws Throwable  {
      URL uRL0 = MockURL.getFileExample();
      TemporaryURLContent temporaryURLContent0 = new TemporaryURLContent(uRL0);
      CatalogTexture catalogTexture0 = new CatalogTexture("ho8IcI/i5n", temporaryURLContent0, (-591.0F), (-591.0F));
      HomeTexture homeTexture0 = new HomeTexture(catalogTexture0);
      HomeEnvironment homeEnvironment0 = new HomeEnvironment(13, homeTexture0, 13, homeTexture0, 13, (-591.0F));
      homeEnvironment0.getSkyTexture();
      assertEquals(400, homeEnvironment0.getPhotoWidth());
      assertEquals((-591.0F), homeEnvironment0.getWallsAlpha(), 0.01F);
      assertEquals(13, homeEnvironment0.getGroundColor());
      assertEquals(320, homeEnvironment0.getVideoWidth());
      assertEquals(300, homeEnvironment0.getPhotoHeight());
      assertEquals(13, homeEnvironment0.getLightColor());
      assertEquals(25, homeEnvironment0.getVideoFrameRate());
      assertEquals(13684944, homeEnvironment0.getCeillingLightColor());
      assertEquals(13, homeEnvironment0.getSkyColor());
      assertTrue(homeEnvironment0.isObserverCameraElevationAdjusted());
  }
