  public void test07()  throws Throwable  {
      InetAddress inetAddress0 = MockInetAddress.getLoopbackAddress();
      UsernamePasswordToken usernamePasswordToken0 = new UsernamePasswordToken("", (char[]) null, false, inetAddress0);
      usernamePasswordToken0.getInetAddress();
      assertFalse(usernamePasswordToken0.isRememberMe());
  }
