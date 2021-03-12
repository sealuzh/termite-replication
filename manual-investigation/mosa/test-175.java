  public void test15()  throws Throwable  {
      Services.HTTP_Result services_HTTP_Result0 = Services.testHTTP("", 0);
      assertEquals(0, services_HTTP_Result0.page_weight);
      assertEquals(0, services_HTTP_Result0.code);
      assertFalse(services_HTTP_Result0.works);
      assertEquals(0L, services_HTTP_Result0.time);
  }
