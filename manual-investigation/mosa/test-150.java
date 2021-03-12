  public void test04()  throws Throwable  {
      boolean[] booleanArray0 = new boolean[1];
      // Undeclared exception!
      try { 
        Optimization.solveTriangle((weka.core.matrix.Matrix) null, (double[]) null, false, booleanArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("weka.core.Optimization", e);
      }
  }
