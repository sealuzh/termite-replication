  public void test07()  throws Throwable  {
      UsernamePasswordToken usernamePasswordToken0 = new UsernamePasswordToken("rTz&.v62``(c$*", "rTz&.v62``(c$*");
      usernamePasswordToken0.getPassword();
      assertFalse(usernamePasswordToken0.isRememberMe());
  }
