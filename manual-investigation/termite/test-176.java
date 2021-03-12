  public void test22()  throws Throwable  {
      InetAddress inetAddress0 = MockInetAddress.getLoopbackAddress();
      UsernamePasswordToken usernamePasswordToken0 = new UsernamePasswordToken((String) null, (String) null, inetAddress0);
      assertFalse(usernamePasswordToken0.isRememberMe());
  }
