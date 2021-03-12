  public void test21()  throws Throwable  {
      UsernamePasswordToken usernamePasswordToken0 = new UsernamePasswordToken("(", "(");
      boolean boolean0 = usernamePasswordToken0.isRememberMe();
      assertFalse(boolean0);
  }
