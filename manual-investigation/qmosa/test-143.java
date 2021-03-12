  public void test27()  throws Throwable  {
      char[] charArray0 = new char[8];
      UsernamePasswordToken usernamePasswordToken0 = new UsernamePasswordToken("ZmB/;.nu0", charArray0);
      usernamePasswordToken0.getCredentials();
      assertFalse(usernamePasswordToken0.isRememberMe());
  }
