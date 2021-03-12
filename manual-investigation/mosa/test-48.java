  public void test03()  throws Throwable  {
      EvoSuiteRemoteAddress evoSuiteRemoteAddress0 = new EvoSuiteRemoteAddress("200.42.42.0", 2540);
      NetworkHandling.openRemoteTcpServer(evoSuiteRemoteAddress0);
      Services.SIMPLE_Result services_SIMPLE_Result0 = Services.testPOP3("X<", 2540);
      assertFalse(services_SIMPLE_Result0.works);
      assertEquals(0L, services_SIMPLE_Result0.time);
  }
