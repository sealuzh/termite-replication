  public void test25()  throws Throwable  {
      UsernamePasswordToken usernamePasswordToken0 = new UsernamePasswordToken("", "");
      usernamePasswordToken0.setPassword((char[]) null);
      assertFalse(usernamePasswordToken0.isRememberMe());
  }
