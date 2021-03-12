  public void test080()  throws Throwable  {
      HomeEnvironment homeEnvironment0 = new HomeEnvironment(72, (HomeTexture) null, 72, (HomeTexture) null, 72, 72);
      homeEnvironment0.setAllLevelsVisible(true);
      assertTrue(homeEnvironment0.isAllLevelsVisible());
      
      homeEnvironment0.setAllLevelsVisible(false);
      assertEquals(13684944, homeEnvironment0.getCeillingLightColor());
  }
