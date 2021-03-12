  public void test32()  throws Throwable  {
      char[] charArray0 = new char[0];
      UsernamePasswordToken usernamePasswordToken0 = new UsernamePasswordToken("rK=\".1 #=58", charArray0);
      assertFalse(usernamePasswordToken0.isRememberMe());
  }
