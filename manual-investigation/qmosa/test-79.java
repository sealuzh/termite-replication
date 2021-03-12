  public void test00()  throws Throwable  {
      Optimization optimization0 = mock(Optimization.class, CALLS_REAL_METHODS);
      Optimization.DynamicIntArray optimization_DynamicIntArray0 = optimization0.new DynamicIntArray(2521);
      optimization_DynamicIntArray0.addElement(2521);
      optimization_DynamicIntArray0.addElement(2521);
      optimization_DynamicIntArray0.removeElementAt(0);
      assertEquals(1, optimization_DynamicIntArray0.size());
  }
