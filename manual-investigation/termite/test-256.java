  public void test01()  throws Throwable  {
      Services.SIMPLE_Result services_SIMPLE_Result0 = new Services.SIMPLE_Result();
      services_SIMPLE_Result0.reset();
      assertEquals(0L, services_SIMPLE_Result0.time);
      assertFalse(services_SIMPLE_Result0.works);
  }
