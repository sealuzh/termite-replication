  public void test06()  throws Throwable  {
      Services.SIMPLE_Result services_SIMPLE_Result0 = Services.testSMTP("", 0);
      assertFalse(services_SIMPLE_Result0.works);
      assertEquals(0L, services_SIMPLE_Result0.time);
  }
