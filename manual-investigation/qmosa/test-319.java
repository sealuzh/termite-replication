  public void test04()  throws Throwable  {
      char[] charArray0 = new char[9];
      UsernamePasswordToken usernamePasswordToken0 = new UsernamePasswordToken("N{zl#0R.v:X", charArray0, true);
      assertTrue(usernamePasswordToken0.isRememberMe());
      
      usernamePasswordToken0.clear();
      usernamePasswordToken0.getPassword();
      assertFalse(usernamePasswordToken0.isRememberMe());
  }
