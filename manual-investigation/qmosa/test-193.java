  public void test07()  throws Throwable  {
      Services.SIMPLE_Result services_SIMPLE_Result0 = Services.testSMTP((String) null, (-802));
      assertFalse(services_SIMPLE_Result0.works);
      assertEquals(0L, services_SIMPLE_Result0.time);
  }
