  public void test18()  throws Throwable  {
      InetAddress inetAddress0 = MockInetAddress.anyLocalAddress();
      UsernamePasswordToken usernamePasswordToken0 = new UsernamePasswordToken((String) null, (String) null, true, inetAddress0);
      String string0 = usernamePasswordToken0.toString();
      assertEquals("org.jsecurity.authc.UsernamePasswordToken - null, rememberMe=true (/192.168.1.42)", string0);
  }
