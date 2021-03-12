  public void test02()  throws Throwable  {
      EvoSuiteRemoteAddress evoSuiteRemoteAddress0 = new EvoSuiteRemoteAddress("200.42.42.0", 21);
      NetworkHandling.openRemoteTcpServer(evoSuiteRemoteAddress0);
      Services.SIMPLE_Result services_SIMPLE_Result0 = Services.testSMTP("q0p.YpBa.~GJ3cR/hsC{", 21);
      assertFalse(services_SIMPLE_Result0.works);
      assertEquals(0L, services_SIMPLE_Result0.time);
  }
