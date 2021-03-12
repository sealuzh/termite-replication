  public void test055()  throws Throwable  {
      HomeEnvironment homeEnvironment0 = new HomeEnvironment();
      assertEquals(400, homeEnvironment0.getPhotoWidth());
      
      homeEnvironment0.setPhotoWidth(0);
      homeEnvironment0.clone();
      assertEquals(0, homeEnvironment0.getPhotoWidth());
  }
