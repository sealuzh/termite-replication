  public void test31()  throws Throwable  {
      char[] charArray0 = new char[1];
      UsernamePasswordToken usernamePasswordToken0 = new UsernamePasswordToken("", charArray0, false, (InetAddress) null);
      usernamePasswordToken0.getCredentials();
      assertFalse(usernamePasswordToken0.isRememberMe());
  }
