  public void test14()  throws Throwable  {
      char[] charArray0 = new char[8];
      UsernamePasswordToken usernamePasswordToken0 = new UsernamePasswordToken("", charArray0);
      usernamePasswordToken0.setInetAddress((InetAddress) null);
      assertFalse(usernamePasswordToken0.isRememberMe());
  }
