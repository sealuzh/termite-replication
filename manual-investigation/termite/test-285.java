  public void test35()  throws Throwable  {
      UsernamePasswordToken usernamePasswordToken0 = new UsernamePasswordToken();
      InetAddress inetAddress0 = MockInetAddress.getLoopbackAddress();
      usernamePasswordToken0.setInetAddress(inetAddress0);
      assertFalse(usernamePasswordToken0.isRememberMe());
  }
