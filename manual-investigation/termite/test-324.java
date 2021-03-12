  public void test03()  throws Throwable  {
      UsernamePasswordToken usernamePasswordToken0 = new UsernamePasswordToken("", "");
      usernamePasswordToken0.getUsername();
      assertFalse(usernamePasswordToken0.isRememberMe());
  }
