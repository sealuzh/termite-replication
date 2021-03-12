  public void test103()  throws Throwable  {
      TemporaryURLContent temporaryURLContent0 = new TemporaryURLContent((URL) null);
      CatalogTexture catalogTexture0 = new CatalogTexture("H9:(HB#xh|h}", "`24q5aEv%3u$R}<sj", temporaryURLContent0, 320.0F, (-133), "`i#czY9;d<C");
      HomeTexture homeTexture0 = new HomeTexture(catalogTexture0);
      HomeEnvironment homeEnvironment0 = new HomeEnvironment((-133), homeTexture0, (-1239), homeTexture0, 998, 160.403F);
      homeEnvironment0.getDrawingMode();
      assertEquals((-133), homeEnvironment0.getGroundColor());
      assertEquals(13684944, homeEnvironment0.getCeillingLightColor());
      assertEquals(998, homeEnvironment0.getLightColor());
      assertTrue(homeEnvironment0.isObserverCameraElevationAdjusted());
      assertEquals(25, homeEnvironment0.getVideoFrameRate());
      assertEquals(240, homeEnvironment0.getVideoHeight());
      assertEquals(300, homeEnvironment0.getPhotoHeight());
      assertEquals((-1239), homeEnvironment0.getSkyColor());
      assertEquals(160.403F, homeEnvironment0.getWallsAlpha(), 0.01F);
      assertEquals(400, homeEnvironment0.getPhotoWidth());
  }
