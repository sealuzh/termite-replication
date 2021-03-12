  public void test15()  throws Throwable  {
      Optimization optimization0 = mock(Optimization.class, CALLS_REAL_METHODS);
      Optimization.DynamicIntArray optimization_DynamicIntArray0 = optimization0.new DynamicIntArray(2800);
      // Undeclared exception!
      try { 
        optimization_DynamicIntArray0.elementAt(2800);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 2800
         //
         verifyException("weka.core.Optimization$DynamicIntArray", e);
      }
  }
