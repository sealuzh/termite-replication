  public void test25()  throws Throwable  {
      char[] charArray0 = new char[1];
      UsernamePasswordToken usernamePasswordToken0 = new UsernamePasswordToken("", charArray0, false, (InetAddress) null);
      boolean boolean0 = usernamePasswordToken0.isRememberMe();
      assertFalse(boolean0);
  }
