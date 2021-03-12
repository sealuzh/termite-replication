  public void test29()  throws Throwable  {
      InetAddress inetAddress0 = MockInetAddress.getByName("I032i\"LHL");
      char[] charArray0 = new char[1];
      UsernamePasswordToken usernamePasswordToken0 = new UsernamePasswordToken("I032i\"LHL", charArray0, inetAddress0);
      assertFalse(usernamePasswordToken0.isRememberMe());
  }
