  public void test10()  throws Throwable  {
      Services.HTTP_Result services_HTTP_Result0 = Services.testHTTPS("", 48);
      assertEquals(0, services_HTTP_Result0.code);
      assertEquals(0, services_HTTP_Result0.page_weight);
      assertFalse(services_HTTP_Result0.works);
      assertEquals(0L, services_HTTP_Result0.time);
  }
