  public void test23()  throws Throwable  {
      UsernamePasswordToken usernamePasswordToken0 = new UsernamePasswordToken("", "");
      usernamePasswordToken0.getPassword();
      assertFalse(usernamePasswordToken0.isRememberMe());
  }
