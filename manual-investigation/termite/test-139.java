  public void test00()  throws Throwable  {
      char[] charArray0 = new char[1];
      UsernamePasswordToken usernamePasswordToken0 = new UsernamePasswordToken("", charArray0, true, (InetAddress) null);
      boolean boolean0 = usernamePasswordToken0.isRememberMe();
      assertTrue(boolean0);
  }
