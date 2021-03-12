  public void test03()  throws Throwable  {
      EvoSuiteRemoteAddress evoSuiteRemoteAddress0 = new EvoSuiteRemoteAddress("200.42.42.0", 3000);
      NetworkHandling.openRemoteTcpServer(evoSuiteRemoteAddress0);
      Services.SIMPLE_Result services_SIMPLE_Result0 = Services.testPOP3("=JU<g", 3000);
      assertFalse(services_SIMPLE_Result0.works);
      assertEquals(0L, services_SIMPLE_Result0.time);
  }
