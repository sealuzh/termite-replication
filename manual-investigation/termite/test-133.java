  public void test01()  throws Throwable  {
      Optimization optimization0 = mock(Optimization.class, CALLS_REAL_METHODS);
      Optimization.DynamicIntArray optimization_DynamicIntArray0 = optimization0.new DynamicIntArray(0);
      optimization_DynamicIntArray0.addElement(29);
      optimization_DynamicIntArray0.addElement((-2525));
      optimization_DynamicIntArray0.addElement(29);
      assertEquals(3, optimization_DynamicIntArray0.size());
  }
