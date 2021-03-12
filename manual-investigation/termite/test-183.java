  public void test09()  throws Throwable  {
      Services.SIMPLE_Result services_SIMPLE_Result0 = Services.testPOP3("Ih~2zF", 0);
      assertEquals(0L, services_SIMPLE_Result0.time);
      assertFalse(services_SIMPLE_Result0.works);
  }
