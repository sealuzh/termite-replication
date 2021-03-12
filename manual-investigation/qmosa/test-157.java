  public void test14()  throws Throwable  {
      Optimization optimization0 = mock(Optimization.class, CALLS_REAL_METHODS);
      Optimization.DynamicIntArray optimization_DynamicIntArray0 = optimization0.new DynamicIntArray(87);
      // Undeclared exception!
      try { 
        optimization_DynamicIntArray0.elementAt((-1841));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -1841
         //
         verifyException("weka.core.Optimization$DynamicIntArray", e);
      }
  }
