  public void test02()  throws Throwable  {
      InetAddress inetAddress0 = MockInetAddress.getByName("0");
      UsernamePasswordToken usernamePasswordToken0 = new UsernamePasswordToken("}(itK}.R!?]Ux%", "}(itK}.R!?]Ux%", false, inetAddress0);
      usernamePasswordToken0.getUsername();
      assertFalse(usernamePasswordToken0.isRememberMe());
  }
