  public void test30()  throws Throwable  {
      UsernamePasswordToken usernamePasswordToken0 = new UsernamePasswordToken("", "");
      InetAddress inetAddress0 = MockInetAddress.getByName((String) null);
      usernamePasswordToken0.setInetAddress(inetAddress0);
      String string0 = usernamePasswordToken0.toString();
      assertEquals("org.jsecurity.authc.UsernamePasswordToken - , rememberMe=false (/127.0.0.1)", string0);
  }
