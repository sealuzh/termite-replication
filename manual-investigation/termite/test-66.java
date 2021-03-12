  public void test03()  throws Throwable  {
      EvoSuiteRemoteAddress evoSuiteRemoteAddress0 = new EvoSuiteRemoteAddress("200.42.42.0", 11);
      NetworkHandling.openRemoteTcpServer(evoSuiteRemoteAddress0);
      Services.SIMPLE_Result services_SIMPLE_Result0 = Services.testSMTP(".\n****", 11);
      assertEquals(0L, services_SIMPLE_Result0.time);
      assertFalse(services_SIMPLE_Result0.works);
  }
