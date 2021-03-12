  public void test38()  throws Throwable  {
      char[] charArray0 = new char[1];
      InetAddress inetAddress0 = MockInetAddress.anyLocalAddress();
      UsernamePasswordToken usernamePasswordToken0 = new UsernamePasswordToken("\"4CI}THYjZdOcI9R)j", charArray0, inetAddress0);
      assertFalse(usernamePasswordToken0.isRememberMe());
  }
