  public void test095()  throws Throwable  {
      CatalogTexture catalogTexture0 = new CatalogTexture("e/", (Content) null, 22, 22);
      HomeTexture homeTexture0 = new HomeTexture(catalogTexture0);
      HomeEnvironment homeEnvironment0 = new HomeEnvironment(22, homeTexture0, 22, homeTexture0, 22, 683.6262F);
      HomeTexture homeTexture1 = new HomeTexture(homeTexture0);
      // Undeclared exception!
      try { 
        homeEnvironment0.setGroundTexture(homeTexture1);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.eteks.sweethome3d.model.HomeTexture", e);
      }
  }
