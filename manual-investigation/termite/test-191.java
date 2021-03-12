  public void test08()  throws Throwable  {
      byte[] byteArray0 = new byte[4];
      byteArray0[0] = (byte) (-20);
      InetAddress inetAddress0 = MockInetAddress.getByAddress("", byteArray0);
      UsernamePasswordToken usernamePasswordToken0 = new UsernamePasswordToken("", "", true, inetAddress0);
      usernamePasswordToken0.getInetAddress();
      assertTrue(usernamePasswordToken0.isRememberMe());
  }
