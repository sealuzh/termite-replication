  public void test17()  throws Throwable  {
      InetAddress inetAddress0 = MockInetAddress.getByName("I032i\"LHL");
      UsernamePasswordToken usernamePasswordToken0 = new UsernamePasswordToken("RF", "F.8$?", false, inetAddress0);
      assertFalse(usernamePasswordToken0.isRememberMe());
  }
