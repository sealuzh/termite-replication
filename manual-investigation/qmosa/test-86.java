  public void test001()  throws Throwable  {
      HomeEnvironment homeEnvironment0 = new HomeEnvironment();
      homeEnvironment0.setPhotoWidth(0);
      homeEnvironment0.setPhotoWidth(3);
      assertEquals(3, homeEnvironment0.getPhotoWidth());
  }
