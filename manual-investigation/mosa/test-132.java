  public void test034()  throws Throwable  {
      CatalogTexture catalogTexture0 = new CatalogTexture("work", (Content) null, (-2144997786), (-2144997786), false);
      HomeTexture homeTexture0 = new HomeTexture(catalogTexture0);
      HomeEnvironment homeEnvironment0 = new HomeEnvironment((-2144997786), homeTexture0, (-2144997786), (-2144997786), 578.53F);
      HomeTexture homeTexture1 = homeEnvironment0.getGroundTexture();
      assertEquals(300, homeEnvironment0.getPhotoHeight());
      assertEquals((-2144997786), homeEnvironment0.getGroundColor());
      assertEquals((-2144997786), homeEnvironment0.getSkyColor());
      assertNotNull(homeTexture1);
      assertEquals(13684944, homeEnvironment0.getCeillingLightColor());
      assertEquals((-2144997786), homeEnvironment0.getLightColor());
      assertEquals(400, homeEnvironment0.getPhotoWidth());
      assertTrue(homeEnvironment0.isObserverCameraElevationAdjusted());
      assertEquals(578.53F, homeEnvironment0.getWallsAlpha(), 0.01F);
      assertEquals(320, homeEnvironment0.getVideoWidth());
      assertEquals(25, homeEnvironment0.getVideoFrameRate());
  }
