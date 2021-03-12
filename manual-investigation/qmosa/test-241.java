  public void test01()  throws Throwable  {
      Services.SIMPLE_Result services_SIMPLE_Result0 = new Services.SIMPLE_Result();
      services_SIMPLE_Result0.reset();
      assertFalse(services_SIMPLE_Result0.works);
      assertEquals(0L, services_SIMPLE_Result0.time);
  }
