  public void test09()  throws Throwable  {
      UsernamePasswordToken usernamePasswordToken0 = new UsernamePasswordToken("", "");
      usernamePasswordToken0.setUsername((String) null);
      assertFalse(usernamePasswordToken0.isRememberMe());
  }
