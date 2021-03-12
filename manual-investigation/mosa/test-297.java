  public void test21()  throws Throwable  {
      InetAddress inetAddress0 = MockInetAddress.getLocalHost();
      UsernamePasswordToken usernamePasswordToken0 = new UsernamePasswordToken(" LE>6ynYbJ)g>,Aki", " LE>6ynYbJ)g>,Aki", inetAddress0);
      String string0 = usernamePasswordToken0.toString();
      assertEquals("org.jsecurity.authc.UsernamePasswordToken -  LE>6ynYbJ)g>,Aki, rememberMe=false (/192.168.1.42)", string0);
  }
