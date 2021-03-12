  public void test10()  throws Throwable  {
      Services.HTTP_Result services_HTTP_Result0 = Services.testHTTPS("g4_lp\"Fk'M'wi+dO0", (-1));
      assertEquals(0L, services_HTTP_Result0.time);
      assertEquals(0, services_HTTP_Result0.page_weight);
      assertEquals(0, services_HTTP_Result0.code);
      assertFalse(services_HTTP_Result0.works);
  }
