  public void test047()  throws Throwable  {
      CatalogTexture catalogTexture0 = new CatalogTexture("e/", "e/", (Content) null, 0, 2264.2908F, "VIDEO_FRAME_RATE");
      HomeTexture homeTexture0 = new HomeTexture(catalogTexture0);
      HomeEnvironment homeEnvironment0 = new HomeEnvironment(0, homeTexture0, 0, 0, 0);
      assertEquals(240, homeEnvironment0.getVideoHeight());
      
      homeEnvironment0.setVideoWidth(0);
      int int0 = homeEnvironment0.getVideoWidth();
      assertEquals(0, homeEnvironment0.getVideoHeight());
      assertEquals(0, int0);
  }
