  public void test05()  throws Throwable  {
      Services.SIMPLE_Result services_SIMPLE_Result0 = Services.testSMTP((String) null, 20);
      assertFalse(services_SIMPLE_Result0.works);
      assertEquals(0L, services_SIMPLE_Result0.time);
  }
