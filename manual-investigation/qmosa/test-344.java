  public void test034()  throws Throwable  {
      HomeEnvironment homeEnvironment0 = new HomeEnvironment();
      homeEnvironment0.setPhotoQuality(4149);
      homeEnvironment0.clone();
      assertEquals(4149, homeEnvironment0.getPhotoQuality());
  }
