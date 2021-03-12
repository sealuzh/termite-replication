  public void test012()  throws Throwable  {
      CatalogTexture catalogTexture0 = new CatalogTexture("e", (Content) null, 2279.4521F, 2279.4521F);
      HomeTexture homeTexture0 = new HomeTexture(catalogTexture0);
      HomeEnvironment homeEnvironment0 = new HomeEnvironment(4, homeTexture0, (-11), homeTexture0, (-1238), 1.3333334F);
      assertEquals(240, homeEnvironment0.getVideoHeight());
      
      homeEnvironment0.setVideoWidth(0);
      int int0 = homeEnvironment0.getVideoHeight();
      assertEquals(0, int0);
  }
