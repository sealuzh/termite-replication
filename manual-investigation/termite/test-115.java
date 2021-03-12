  public void test26()  throws Throwable  {
      char[] charArray0 = new char[2];
      UsernamePasswordToken usernamePasswordToken0 = new UsernamePasswordToken("", charArray0, false);
      assertFalse(usernamePasswordToken0.isRememberMe());
  }
