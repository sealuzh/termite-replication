  public void test31()  throws Throwable  {
      UsernamePasswordToken usernamePasswordToken0 = new UsernamePasswordToken("", "");
      usernamePasswordToken0.setRememberMe(false);
      assertFalse(usernamePasswordToken0.isRememberMe());
  }
