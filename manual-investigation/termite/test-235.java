  public void test029()  throws Throwable  {
      CatalogTexture catalogTexture0 = new CatalogTexture(".9*Otp~Nw_st-lI~gkm", (Content) null, (-179), (-179));
      HomeTexture homeTexture0 = new HomeTexture(catalogTexture0);
      HomeEnvironment homeEnvironment0 = new HomeEnvironment((-179), homeTexture0, (-179), homeTexture0, (-179), 4106.0F);
      homeEnvironment0.getGroundTexture();
      assertEquals(400, homeEnvironment0.getPhotoWidth());
      assertEquals((-179), homeEnvironment0.getSkyColor());
      assertEquals(320, homeEnvironment0.getVideoWidth());
      assertEquals(300, homeEnvironment0.getPhotoHeight());
      assertEquals((-179), homeEnvironment0.getLightColor());
      assertEquals(4106.0F, homeEnvironment0.getWallsAlpha(), 0.01F);
      assertEquals(13684944, homeEnvironment0.getCeillingLightColor());
      assertEquals((-179), homeEnvironment0.getGroundColor());
      assertEquals(25, homeEnvironment0.getVideoFrameRate());
      assertTrue(homeEnvironment0.isObserverCameraElevationAdjusted());
  }
