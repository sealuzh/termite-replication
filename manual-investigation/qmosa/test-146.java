  public void test04()  throws Throwable  {
      Services.HTTP_Result services_HTTP_Result0 = Services.testHTTPS("\"~#jXrTyXr", (-1440));
      assertFalse(services_HTTP_Result0.works);
      assertEquals(0, services_HTTP_Result0.page_weight);
      assertEquals(0L, services_HTTP_Result0.time);
      assertEquals(0, services_HTTP_Result0.code);
  }
