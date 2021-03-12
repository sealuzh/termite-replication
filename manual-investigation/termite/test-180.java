  public void test14()  throws Throwable  {
      Services.HTTP_Result services_HTTP_Result0 = Services.testHTTPS((String) null, 0);
      assertEquals(0, services_HTTP_Result0.code);
      assertFalse(services_HTTP_Result0.works);
      assertEquals(0L, services_HTTP_Result0.time);
      assertEquals(0, services_HTTP_Result0.page_weight);
  }
