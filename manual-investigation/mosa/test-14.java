  public void test17()  throws Throwable  {
      EvoSuiteURL evoSuiteURL0 = new EvoSuiteURL("http://e':6757");
      NetworkHandling.createRemoteTextFile(evoSuiteURL0, "e'");
      Services.HTTP_Result services_HTTP_Result0 = Services.testHTTP("e'", 6757);
      assertTrue(services_HTTP_Result0.works);
      assertEquals(3, services_HTTP_Result0.page_weight);
  }
