  public void test05()  throws Throwable  {
      InetAddress inetAddress0 = MockInetAddress.anyLocalAddress();
      char[] charArray0 = new char[2];
      UsernamePasswordToken usernamePasswordToken0 = new UsernamePasswordToken("", charArray0, true, inetAddress0);
      usernamePasswordToken0.getInetAddress();
      assertTrue(usernamePasswordToken0.isRememberMe());
  }
