  public void test04()  throws Throwable  {
      // Undeclared exception!
      try { 
        Optimization.solveTriangle((weka.core.matrix.Matrix) null, (double[]) null, true, (boolean[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("weka.core.Optimization", e);
      }
  }
