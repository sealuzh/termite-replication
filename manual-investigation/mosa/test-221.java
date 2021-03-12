  public void test34()  throws Throwable  {
      UsernamePasswordToken usernamePasswordToken0 = new UsernamePasswordToken("", "");
      usernamePasswordToken0.setUsername("");
      assertFalse(usernamePasswordToken0.isRememberMe());
  }
