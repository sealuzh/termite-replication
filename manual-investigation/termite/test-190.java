  public void test32()  throws Throwable  {
      char[] charArray0 = new char[1];
      UsernamePasswordToken usernamePasswordToken0 = new UsernamePasswordToken("", charArray0, false, (InetAddress) null);
      usernamePasswordToken0.getPrincipal();
      assertFalse(usernamePasswordToken0.isRememberMe());
  }
