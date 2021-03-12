  public void test077()  throws Throwable  {
      CatalogTexture catalogTexture0 = new CatalogTexture("\"zbqP Zk*x/", "\"zbqP Zk*x/", (Content) null, 1.0F, (-75), "\"zbqP Zk*x/", true);
      HomeTexture homeTexture0 = new HomeTexture(catalogTexture0);
      HomeEnvironment homeEnvironment0 = new HomeEnvironment();
      homeEnvironment0.setGroundTexture(homeTexture0);
      assertEquals(300, homeEnvironment0.getPhotoHeight());
      assertEquals(13427964, homeEnvironment0.getSkyColor());
      assertEquals(13684944, homeEnvironment0.getCeillingLightColor());
      assertEquals(25, homeEnvironment0.getVideoFrameRate());
      assertTrue(homeEnvironment0.isObserverCameraElevationAdjusted());
      assertEquals(400, homeEnvironment0.getPhotoWidth());
      assertEquals(13684944, homeEnvironment0.getLightColor());
      assertEquals(11053224, homeEnvironment0.getGroundColor());
      assertEquals(320, homeEnvironment0.getVideoWidth());
      assertEquals(0.0F, homeEnvironment0.getWallsAlpha(), 0.01F);
  }
