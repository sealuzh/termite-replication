  public void test11()  throws Throwable  {
      Services.SIMPLE_Result services_SIMPLE_Result0 = Services.testPOP3("", 1413);
      assertEquals(0L, services_SIMPLE_Result0.time);
      assertFalse(services_SIMPLE_Result0.works);
  }
