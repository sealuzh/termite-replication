  public void test19()  throws Throwable  {
      InetAddress inetAddress0 = MockInetAddress.getByName("I032i\"LHL");
      UsernamePasswordToken usernamePasswordToken0 = new UsernamePasswordToken("I032i\"LHL", (String) null, inetAddress0);
      assertFalse(usernamePasswordToken0.isRememberMe());
  }
