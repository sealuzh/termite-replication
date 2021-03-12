  public void test019()  throws Throwable  {
      HomeEnvironment homeEnvironment0 = new HomeEnvironment();
      assertEquals(300, homeEnvironment0.getPhotoHeight());
      
      homeEnvironment0.setPhotoHeight(0);
      int int0 = homeEnvironment0.getPhotoHeight();
      assertEquals(0, int0);
  }
