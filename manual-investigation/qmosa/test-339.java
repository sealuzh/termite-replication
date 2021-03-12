  public void test01()  throws Throwable  {
      UsernamePasswordToken usernamePasswordToken0 = new UsernamePasswordToken("vuz;msUD5FY2D\"", "C;~hyh:?~+", false);
      usernamePasswordToken0.getUsername();
      assertFalse(usernamePasswordToken0.isRememberMe());
  }
