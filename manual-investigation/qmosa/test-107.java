  public void test13()  throws Throwable  {
      Services.HTTP_Result services_HTTP_Result0 = Services.testHTTP("220", (-1343));
      services_HTTP_Result0.reset();
      assertEquals(0, services_HTTP_Result0.page_weight);
      assertEquals(0, services_HTTP_Result0.code);
      assertEquals(0L, services_HTTP_Result0.time);
      assertFalse(services_HTTP_Result0.works);
  }
