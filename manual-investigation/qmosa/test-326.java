  public void test02()  throws Throwable  {
      InetAddress inetAddress0 = MockInetAddress.getByName("I032i\"LHL");
      UsernamePasswordToken usernamePasswordToken0 = new UsernamePasswordToken("", "RF", inetAddress0);
      usernamePasswordToken0.getUsername();
      assertFalse(usernamePasswordToken0.isRememberMe());
  }
