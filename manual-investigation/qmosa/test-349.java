  public void test08()  throws Throwable  {
      char[] charArray0 = new char[8];
      UsernamePasswordToken usernamePasswordToken0 = new UsernamePasswordToken("ZmB/;.nu0", charArray0);
      usernamePasswordToken0.clear();
      Object object0 = usernamePasswordToken0.getCredentials();
      assertFalse(usernamePasswordToken0.isRememberMe());
      assertArrayEquals(new char[] {'\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000'}, charArray0);
      assertNull(object0);
  }
