  public void test03()  throws Throwable  {
      UsernamePasswordToken usernamePasswordToken0 = new UsernamePasswordToken("TYG>TY9.g1O6XV;q", "Ah:g}w\"YAxh^<I\"%", false);
      usernamePasswordToken0.clear();
      usernamePasswordToken0.getPrincipal();
      assertFalse(usernamePasswordToken0.isRememberMe());
  }