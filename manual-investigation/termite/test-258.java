  public void test19()  throws Throwable  {
      EvoSuiteURL evoSuiteURL0 = new EvoSuiteURL("http://.\nl*@p:0");
      NetworkHandling.createRemoteTextFile(evoSuiteURL0, ".\nl*@p");
      Services.HTTP_Result services_HTTP_Result0 = Services.testHTTP(".\nl*@p", 0);
      assertEquals(7, services_HTTP_Result0.page_weight);
      assertTrue(services_HTTP_Result0.works);
  }
