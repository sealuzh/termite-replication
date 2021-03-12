  public void test13()  throws Throwable  {
      byte[] byteArray0 = new byte[4];
      byteArray0[0] = (byte) (-32);
      InetAddress inetAddress0 = MockInetAddress.getByAddress(byteArray0);
      UsernamePasswordToken usernamePasswordToken0 = new UsernamePasswordToken("", "", inetAddress0);
      usernamePasswordToken0.getInetAddress();
      assertFalse(usernamePasswordToken0.isRememberMe());
  }
