  public void test15()  throws Throwable  {
      Services.HTTP_Result services_HTTP_Result0 = Services.testHTTP("-#'n;~q?ca]>v:jG#^", (-1504));
      assertEquals(0, services_HTTP_Result0.code);
      assertEquals(0, services_HTTP_Result0.page_weight);
      assertFalse(services_HTTP_Result0.works);
      assertEquals(0L, services_HTTP_Result0.time);
  }