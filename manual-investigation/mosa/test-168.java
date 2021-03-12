  public void test039()  throws Throwable  {
      HomeEnvironment homeEnvironment0 = new HomeEnvironment();
      homeEnvironment0.setAllLevelsVisible(true);
      homeEnvironment0.clone();
      assertTrue(homeEnvironment0.isAllLevelsVisible());
  }
