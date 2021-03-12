  public void test12()  throws Throwable  {
      Services.HTTP_Result services_HTTP_Result0 = Services.testHTTPS((String) null, 0);
      assertFalse(services_HTTP_Result0.works);
      assertEquals(0, services_HTTP_Result0.code);
      assertEquals(0L, services_HTTP_Result0.time);
      assertEquals(0, services_HTTP_Result0.page_weight);
  }
