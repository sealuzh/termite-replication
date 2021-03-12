  public void test09()  throws Throwable  {
      Services.SIMPLE_Result services_SIMPLE_Result0 = Services.testPOP3("", 0);
      services_SIMPLE_Result0.reset();
      assertEquals(0L, services_SIMPLE_Result0.time);
      assertFalse(services_SIMPLE_Result0.works);
  }
