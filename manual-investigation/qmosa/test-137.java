  public void test023()  throws Throwable  {
      URL uRL0 = MockURL.getHttpExample();
      TemporaryURLContent temporaryURLContent0 = new TemporaryURLContent(uRL0);
      CatalogTexture catalogTexture0 = new CatalogTexture("<AP9IdQvK_1E", temporaryURLContent0, 1.7777778F, (byte)43, true);
      HomeTexture homeTexture0 = new HomeTexture(catalogTexture0);
      HomeEnvironment homeEnvironment0 = new HomeEnvironment(590, homeTexture0, (byte)43, homeTexture0, (-690), (-690));
      homeEnvironment0.getGroundTexture();
      assertEquals(400, homeEnvironment0.getPhotoWidth());
      assertTrue(homeEnvironment0.isObserverCameraElevationAdjusted());
      assertEquals(590, homeEnvironment0.getGroundColor());
      assertEquals((-690), homeEnvironment0.getLightColor());
      assertEquals(13684944, homeEnvironment0.getCeillingLightColor());
      assertEquals(43, homeEnvironment0.getSkyColor());
      assertEquals(320, homeEnvironment0.getVideoWidth());
      assertEquals((-690.0F), homeEnvironment0.getWallsAlpha(), 0.01F);
      assertEquals(25, homeEnvironment0.getVideoFrameRate());
      assertEquals(300, homeEnvironment0.getPhotoHeight());
  }
