  public void test34()  throws Throwable  {
      char[] charArray0 = new char[6];
      InetAddress inetAddress0 = MockInetAddress.anyLocalAddress();
      UsernamePasswordToken usernamePasswordToken0 = new UsernamePasswordToken("", charArray0, inetAddress0);
      assertFalse(usernamePasswordToken0.isRememberMe());
  }
