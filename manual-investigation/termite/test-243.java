  public void test05()  throws Throwable  {
      InetAddress inetAddress0 = MockInetAddress.getByName("0");
      UsernamePasswordToken usernamePasswordToken0 = new UsernamePasswordToken("}(itK}.R!?]Ux%", "}(itK}.R!?]Ux%", false, inetAddress0);
      usernamePasswordToken0.clear();
      usernamePasswordToken0.getInetAddress();
      assertFalse(usernamePasswordToken0.isRememberMe());
  }
