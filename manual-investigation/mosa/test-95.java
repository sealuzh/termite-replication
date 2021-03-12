  public void test37()  throws Throwable  {
      UsernamePasswordToken usernamePasswordToken0 = new UsernamePasswordToken("", "");
      usernamePasswordToken0.getCredentials();
      assertFalse(usernamePasswordToken0.isRememberMe());
  }
