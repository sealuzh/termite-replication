  public void test01()  throws Throwable  {
      Optimization optimization0 = mock(Optimization.class, CALLS_REAL_METHODS);
      Optimization.DynamicIntArray optimization_DynamicIntArray0 = optimization0.new DynamicIntArray(2);
      // Undeclared exception!
      try { 
        optimization_DynamicIntArray0.removeElementAt(2);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
      }
  }
