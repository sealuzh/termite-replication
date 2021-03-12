  public void test011()  throws Throwable  {
      CatalogTexture catalogTexture0 = new CatalogTexture("^%UVG{AsvEnj,-!", "^%UVG{AsvEnj,-!", (Content) null, 1.0F, (-75), "^%UVG{AsvEnj,-!", true);
      HomeTexture homeTexture0 = new HomeTexture(catalogTexture0);
      HomeEnvironment homeEnvironment0 = new HomeEnvironment((-75), homeTexture0, (-2627), homeTexture0, (-75), (-75));
      float float0 = homeEnvironment0.getWallsAlpha();
      assertEquals(25, homeEnvironment0.getVideoFrameRate());
      assertEquals((-75.0F), float0, 0.01F);
      assertTrue(homeEnvironment0.isObserverCameraElevationAdjusted());
      assertEquals((-75), homeEnvironment0.getLightColor());
      assertEquals(400, homeEnvironment0.getPhotoWidth());
      assertEquals(300, homeEnvironment0.getPhotoHeight());
      assertEquals(320, homeEnvironment0.getVideoWidth());
      assertEquals(13684944, homeEnvironment0.getCeillingLightColor());
      assertEquals((-2627), homeEnvironment0.getSkyColor());
      assertEquals((-75), homeEnvironment0.getGroundColor());
  }
