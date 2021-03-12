  public void test07()  throws Throwable  {
      double[] doubleArray0 = new double[2];
      boolean[] booleanArray0 = new boolean[2];
      booleanArray0[1] = true;
      // Undeclared exception!
      try { 
        Optimization.solveTriangle((weka.core.matrix.Matrix) null, doubleArray0, false, booleanArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("weka.core.Optimization", e);
      }
  }
