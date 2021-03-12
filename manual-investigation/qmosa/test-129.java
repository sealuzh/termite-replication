  public void test15()  throws Throwable  {
      EvoSuiteURL evoSuiteURL0 = new EvoSuiteURL("http://:2761");
      NetworkHandling.createRemoteTextFile(evoSuiteURL0, "QHyN;#>w%35");
      Services.HTTP_Result services_HTTP_Result0 = Services.testHTTP("", 2761);
      assertEquals(12, services_HTTP_Result0.page_weight);
      assertTrue(services_HTTP_Result0.works);
  }
