  public void test21()  throws Throwable  {
      InetAddress inetAddress0 = MockInetAddress.anyLocalAddress();
      UsernamePasswordToken usernamePasswordToken0 = new UsernamePasswordToken("", "", inetAddress0);
      assertFalse(usernamePasswordToken0.isRememberMe());
  }
