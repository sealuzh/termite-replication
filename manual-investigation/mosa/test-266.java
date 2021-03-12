  public void test16()  throws Throwable  {
      UsernamePasswordToken usernamePasswordToken0 = new UsernamePasswordToken("J", "J");
      usernamePasswordToken0.setUsername("J");
      assertFalse(usernamePasswordToken0.isRememberMe());
  }
