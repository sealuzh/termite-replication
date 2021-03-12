  public void test08()  throws Throwable  {
      Services.SIMPLE_Result services_SIMPLE_Result0 = Services.testSMTP("", 27);
      assertFalse(services_SIMPLE_Result0.works);
      assertEquals(0L, services_SIMPLE_Result0.time);
  }
