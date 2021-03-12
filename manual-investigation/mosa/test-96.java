  public void test07()  throws Throwable  {
      Services.SIMPLE_Result services_SIMPLE_Result0 = Services.testPOP3(".\n****", (-2289));
      assertEquals(0L, services_SIMPLE_Result0.time);
      assertFalse(services_SIMPLE_Result0.works);
  }
