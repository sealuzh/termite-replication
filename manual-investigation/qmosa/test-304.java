  public void test16()  throws Throwable  {
      UsernamePasswordToken usernamePasswordToken0 = new UsernamePasswordToken("", "");
      usernamePasswordToken0.clear();
      usernamePasswordToken0.clear();
      assertFalse(usernamePasswordToken0.isRememberMe());
  }
