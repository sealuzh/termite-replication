  public void test00()  throws Throwable  {
      char[] charArray0 = new char[0];
      InetAddress inetAddress0 = MockInetAddress.anyLocalAddress();
      UsernamePasswordToken usernamePasswordToken0 = new UsernamePasswordToken("", charArray0, true, inetAddress0);
      assertTrue(usernamePasswordToken0.isRememberMe());
  }
