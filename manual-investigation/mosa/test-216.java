  public void test16()  throws Throwable  {
      EvoSuiteURL evoSuiteURL0 = new EvoSuiteURL("https://g:0");
      NetworkHandling.createRemoteTextFile(evoSuiteURL0, "(");
      Services.HTTP_Result services_HTTP_Result0 = Services.testHTTPS("g", 0);
      assertTrue(services_HTTP_Result0.works);
      assertEquals(2, services_HTTP_Result0.page_weight);
  }
