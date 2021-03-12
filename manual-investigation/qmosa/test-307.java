  public void test000()  throws Throwable  {
      HomeEnvironment homeEnvironment0 = new HomeEnvironment();
      homeEnvironment0.setPhotoHeight(0);
      assertEquals(0, homeEnvironment0.getPhotoHeight());
      
      homeEnvironment0.setPhotoHeight(300);
      assertEquals(11053224, homeEnvironment0.getGroundColor());
  }
