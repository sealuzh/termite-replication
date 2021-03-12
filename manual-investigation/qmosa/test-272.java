  public void test13()  throws Throwable  {
      UsernamePasswordToken usernamePasswordToken0 = new UsernamePasswordToken("", "");
      char[] charArray0 = usernamePasswordToken0.getPassword();
      usernamePasswordToken0.setPassword(charArray0);
      assertFalse(usernamePasswordToken0.isRememberMe());
  }
