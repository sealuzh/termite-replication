  public void test11()  throws Throwable  {
      UsernamePasswordToken usernamePasswordToken0 = new UsernamePasswordToken("(", "(");
      assertFalse(usernamePasswordToken0.isRememberMe());
      
      usernamePasswordToken0.setRememberMe(true);
      assertTrue(usernamePasswordToken0.isRememberMe());
  }
