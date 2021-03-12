  public void test00()  throws Throwable  {
      UsernamePasswordToken usernamePasswordToken0 = new UsernamePasswordToken(" (", " (", true);
      boolean boolean0 = usernamePasswordToken0.isRememberMe();
      assertTrue(boolean0);
  }
