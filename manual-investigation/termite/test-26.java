  public void test18()  throws Throwable  {
      EvoSuiteURL evoSuiteURL0 = new EvoSuiteURL("https://?`Q+THE:0");
      NetworkHandling.createRemoteTextFile(evoSuiteURL0, "K2={");
      Services.HTTP_Result services_HTTP_Result0 = Services.testHTTPS("?`Q+THE", 0);
      assertTrue(services_HTTP_Result0.works);
      assertEquals(5, services_HTTP_Result0.page_weight);
  }
