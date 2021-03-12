  public void test06()  throws Throwable  {
      InetAddress inetAddress0 = MockInetAddress.getLoopbackAddress();
      UsernamePasswordToken usernamePasswordToken0 = new UsernamePasswordToken("", (String) null, true, inetAddress0);
      usernamePasswordToken0.getInetAddress();
      assertTrue(usernamePasswordToken0.isRememberMe());
  }
