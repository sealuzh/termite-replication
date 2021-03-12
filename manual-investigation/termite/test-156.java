  public void test33()  throws Throwable  {
      InetAddress inetAddress0 = MockInetAddress.getByName("0");
      UsernamePasswordToken usernamePasswordToken0 = new UsernamePasswordToken("}(itK}.R!?]Ux%", "}(itK}.R!?]Ux%", false, inetAddress0);
      usernamePasswordToken0.getPassword();
      assertFalse(usernamePasswordToken0.isRememberMe());
  }
