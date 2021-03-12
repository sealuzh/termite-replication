  public void test17()  throws Throwable  {
      char[] charArray0 = new char[1];
      UsernamePasswordToken usernamePasswordToken0 = new UsernamePasswordToken("", charArray0, false, (InetAddress) null);
      usernamePasswordToken0.clear();
      usernamePasswordToken0.clear();
      assertFalse(usernamePasswordToken0.isRememberMe());
      assertArrayEquals(new char[] {'\u0000'}, charArray0);
  }
