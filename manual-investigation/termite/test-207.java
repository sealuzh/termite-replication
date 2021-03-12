  public void test077()  throws Throwable  {
      HomeEnvironment homeEnvironment0 = new HomeEnvironment();
      assertEquals(300, homeEnvironment0.getPhotoHeight());
      
      homeEnvironment0.setPhotoHeight(0);
      homeEnvironment0.clone();
      assertEquals(0, homeEnvironment0.getPhotoHeight());
  }
