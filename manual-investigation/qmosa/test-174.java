  public void test24()  throws Throwable  {
      UsernamePasswordToken usernamePasswordToken0 = new UsernamePasswordToken("", "");
      usernamePasswordToken0.setUsername("EU{ AF1");
      assertFalse(usernamePasswordToken0.isRememberMe());
  }
