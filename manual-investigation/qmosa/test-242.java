  public void test18()  throws Throwable  {
      UsernamePasswordToken usernamePasswordToken0 = new UsernamePasswordToken((String) null, (String) null, true);
      usernamePasswordToken0.getUsername();
      assertTrue(usernamePasswordToken0.isRememberMe());
  }
