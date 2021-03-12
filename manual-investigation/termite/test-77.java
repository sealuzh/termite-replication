  public void test06()  throws Throwable  {
      Services.SIMPLE_Result services_SIMPLE_Result0 = Services.testSMTP("IhH2zF", (-1067));
      assertEquals(0L, services_SIMPLE_Result0.time);
      assertFalse(services_SIMPLE_Result0.works);
  }
