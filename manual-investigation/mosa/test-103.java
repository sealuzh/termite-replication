  public void test25()  throws Throwable  {
      UsernamePasswordToken usernamePasswordToken0 = new UsernamePasswordToken("jp)", "jp)", false, (InetAddress) null);
      assertFalse(usernamePasswordToken0.isRememberMe());
  }
