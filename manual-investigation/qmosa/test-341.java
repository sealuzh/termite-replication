  public void test006()  throws Throwable  {
      CatalogTexture catalogTexture0 = new CatalogTexture("\"zbqP Zk*x/", "\"zbqP Zk*x/", (Content) null, 1.0F, (-75), "\"zbqP Zk*x/", true);
      HomeTexture homeTexture0 = new HomeTexture(catalogTexture0);
      HomeEnvironment homeEnvironment0 = new HomeEnvironment((-75), homeTexture0, (-2627), homeTexture0, (-75), (-75));
      float float0 = homeEnvironment0.getWallsAlpha();
      assertEquals((-75), homeEnvironment0.getLightColor());
      assertTrue(homeEnvironment0.isObserverCameraElevationAdjusted());
      assertEquals((-2627), homeEnvironment0.getSkyColor());
      assertEquals(25, homeEnvironment0.getVideoFrameRate());
      assertEquals(300, homeEnvironment0.getPhotoHeight());
      assertEquals((-75), homeEnvironment0.getGroundColor());
      assertEquals(13684944, homeEnvironment0.getCeillingLightColor());
      assertEquals((-75.0F), float0, 0.01F);
      assertEquals(400, homeEnvironment0.getPhotoWidth());
      assertEquals(240, homeEnvironment0.getVideoHeight());
  }
