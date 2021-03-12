  public void test07()  throws Throwable  {
      byte[] byteArray0 = new byte[4];
      InetAddress inetAddress0 = MockInetAddress.getByAddress("", byteArray0);
      UsernamePasswordToken usernamePasswordToken0 = new UsernamePasswordToken("", "org.jsecurity.authc.UsernamePasswordToken - null, rememberMe=false", inetAddress0);
      usernamePasswordToken0.getInetAddress();
      assertFalse(usernamePasswordToken0.isRememberMe());
  }
