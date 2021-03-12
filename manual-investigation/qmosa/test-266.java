  public void test11()  throws Throwable  {
      Services.HTTP_Result services_HTTP_Result0 = Services.testHTTPS((String) null, 9);
      assertFalse(services_HTTP_Result0.works);
      assertEquals(0, services_HTTP_Result0.code);
      assertEquals(0, services_HTTP_Result0.page_weight);
      assertEquals(0L, services_HTTP_Result0.time);
  }
