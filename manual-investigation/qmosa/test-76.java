  public void test22()  throws Throwable  {
      char[] charArray0 = new char[9];
      UsernamePasswordToken usernamePasswordToken0 = new UsernamePasswordToken("N{zl#0R.v:X", charArray0, true);
      usernamePasswordToken0.getPassword();
      assertTrue(usernamePasswordToken0.isRememberMe());
  }
