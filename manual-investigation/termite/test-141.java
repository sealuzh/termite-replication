  public void test015()  throws Throwable  {
      CatalogTexture catalogTexture0 = new CatalogTexture("e/", "e/", (Content) null, 0, 2264.2908F, "VIDEO_FRAME_RATE");
      HomeTexture homeTexture0 = new HomeTexture(catalogTexture0);
      HomeEnvironment homeEnvironment0 = new HomeEnvironment(8, homeTexture0, 0, homeTexture0, (-2698), (-1768));
      homeEnvironment0.setVideoFrameRate((-2008));
      int int0 = homeEnvironment0.getVideoFrameRate();
      assertEquals((-2008), int0);
  }
