  public void test010()  throws Throwable  {
      HomeEnvironment homeEnvironment0 = new HomeEnvironment();
      homeEnvironment0.setSubpartSizeUnderLight(13);
      float float0 = homeEnvironment0.getSubpartSizeUnderLight();
      assertEquals(13.0F, float0, 0.01F);
  }
